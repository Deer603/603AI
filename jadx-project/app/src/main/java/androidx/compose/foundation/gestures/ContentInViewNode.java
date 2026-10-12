package androidx.compose.foundation.gestures;

import androidx.compose.foundation.MutatePriority;
import androidx.compose.foundation.internal.InlineClassHelperKt;
import androidx.compose.foundation.relocation.BringIntoViewResponder;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.node.CompositionLocalConsumerModifierNode;
import androidx.compose.ui.node.CompositionLocalConsumerModifierNodeKt;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.node.LayoutAwareModifierNode;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.IntSizeKt;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.CharsKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.CoroutineName;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobKt;

/* JADX INFO: compiled from: ContentInViewNode.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0001EB'\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\u0002\u0010\rJ\u001e\u0010\u001e\u001a\u00020\u001f2\u000e\u0010 \u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\"0!H\u0096@¢\u0006\u0002\u0010#J\u0010\u0010$\u001a\u00020\"2\u0006\u0010 \u001a\u00020\"H\u0016J\u0010\u0010%\u001a\u00020&2\u0006\u0010\u000b\u001a\u00020\fH\u0002J\"\u0010'\u001a\u00020\"2\u0006\u0010(\u001a\u00020\"2\u0006\u0010)\u001a\u00020\u0019H\u0002ø\u0001\u0000¢\u0006\u0004\b*\u0010+J\n\u0010,\u001a\u0004\u0018\u00010\"H\u0002J\n\u0010-\u001a\u0004\u0018\u00010\"H\u0002J\b\u0010.\u001a\u00020\u001fH\u0002J\u0010\u0010/\u001a\u00020\u001f2\b\u00100\u001a\u0004\u0018\u00010\u0012J\u001a\u00101\u001a\u00020\u001f2\u0006\u00102\u001a\u00020\u0019H\u0016ø\u0001\u0000¢\u0006\u0004\b3\u00104J\"\u00105\u001a\u0002062\u0006\u0010(\u001a\u00020\"2\u0006\u0010)\u001a\u00020\u0019H\u0002ø\u0001\u0000¢\u0006\u0004\b7\u00108J\b\u00109\u001a\u00020\fH\u0002J \u0010:\u001a\u00020\u001f2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fJ\u001f\u0010;\u001a\u00020<*\u00020=2\u0006\u0010>\u001a\u00020=H\u0082\u0002ø\u0001\u0000¢\u0006\u0004\b?\u0010@J\u001f\u0010;\u001a\u00020<*\u00020\u00192\u0006\u0010>\u001a\u00020\u0019H\u0082\u0002ø\u0001\u0000¢\u0006\u0004\bA\u0010@J \u0010B\u001a\u00020\n*\u00020\"2\b\b\u0002\u00102\u001a\u00020\u0019H\u0002ø\u0001\u0000¢\u0006\u0004\bC\u0010DR\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0014\u001a\u00020\nX\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u000e\u0010\u0017\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R&\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0018\u001a\u00020\u0019@BX\u0080\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u001d\u001a\u0004\b\u001b\u0010\u001c\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006F"}, d2 = {"Landroidx/compose/foundation/gestures/ContentInViewNode;", "Landroidx/compose/ui/Modifier$Node;", "Landroidx/compose/foundation/relocation/BringIntoViewResponder;", "Landroidx/compose/ui/node/LayoutAwareModifierNode;", "Landroidx/compose/ui/node/CompositionLocalConsumerModifierNode;", "orientation", "Landroidx/compose/foundation/gestures/Orientation;", "scrollingLogic", "Landroidx/compose/foundation/gestures/ScrollingLogic;", "reverseDirection", "", "bringIntoViewSpec", "Landroidx/compose/foundation/gestures/BringIntoViewSpec;", "(Landroidx/compose/foundation/gestures/Orientation;Landroidx/compose/foundation/gestures/ScrollingLogic;ZLandroidx/compose/foundation/gestures/BringIntoViewSpec;)V", "bringIntoViewRequests", "Landroidx/compose/foundation/gestures/BringIntoViewRequestPriorityQueue;", "childWasMaxVisibleBeforeViewportShrunk", "focusedChild", "Landroidx/compose/ui/layout/LayoutCoordinates;", "isAnimationRunning", "shouldAutoInvalidate", "getShouldAutoInvalidate", "()Z", "trackingFocusedChild", "<set-?>", "Landroidx/compose/ui/unit/IntSize;", "viewportSize", "getViewportSize-YbymL2g$foundation_release", "()J", "J", "bringChildIntoView", "", "localRect", "Lkotlin/Function0;", "Landroidx/compose/ui/geometry/Rect;", "(Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "calculateRectForParent", "calculateScrollDelta", "", "computeDestination", "childBounds", "containerSize", "computeDestination-O0kMr_c", "(Landroidx/compose/ui/geometry/Rect;J)Landroidx/compose/ui/geometry/Rect;", "findBringIntoViewRequest", "getFocusedChildBounds", "launchAnimation", "onFocusBoundsChanged", "newBounds", "onRemeasured", "size", "onRemeasured-ozmzZPI", "(J)V", "relocationOffset", "Landroidx/compose/ui/geometry/Offset;", "relocationOffset-BMxPBkI", "(Landroidx/compose/ui/geometry/Rect;J)J", "requireBringIntoViewSpec", "update", "compareTo", "", "Landroidx/compose/ui/geometry/Size;", "other", "compareTo-iLBOSCw", "(JJ)I", "compareTo-TemP2vQ", "isMaxVisible", "isMaxVisible-O0kMr_c", "(Landroidx/compose/ui/geometry/Rect;J)Z", "Request", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class ContentInViewNode extends Modifier.Node implements BringIntoViewResponder, LayoutAwareModifierNode, CompositionLocalConsumerModifierNode {
    public static final int $stable = 0;
    private final BringIntoViewRequestPriorityQueue bringIntoViewRequests;
    private BringIntoViewSpec bringIntoViewSpec;
    private boolean childWasMaxVisibleBeforeViewportShrunk;
    private LayoutCoordinates focusedChild;
    private boolean isAnimationRunning;
    private Orientation orientation;
    private boolean reverseDirection;
    private final ScrollingLogic scrollingLogic;
    private final boolean shouldAutoInvalidate;
    private boolean trackingFocusedChild;
    private long viewportSize;

    /* JADX INFO: compiled from: ContentInViewNode.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0000\b\u0000\u0018\u00002\u00020\u0001B#\u0012\u000e\u0010\u0002\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0002\u0010\bJ\b\u0010\r\u001a\u00020\u000eH\u0016R\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0019\u0010\u0002\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u000f"}, d2 = {"Landroidx/compose/foundation/gestures/ContentInViewNode$Request;", "", "currentBounds", "Lkotlin/Function0;", "Landroidx/compose/ui/geometry/Rect;", "continuation", "Lkotlinx/coroutines/CancellableContinuation;", "", "(Lkotlin/jvm/functions/Function0;Lkotlinx/coroutines/CancellableContinuation;)V", "getContinuation", "()Lkotlinx/coroutines/CancellableContinuation;", "getCurrentBounds", "()Lkotlin/jvm/functions/Function0;", "toString", "", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Request {
        public static final int $stable = 0;
        private final CancellableContinuation<Unit> continuation;
        private final Function0<Rect> currentBounds;

        static {
            $stable = 8;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Request(Function0<Rect> r1, CancellableContinuation<? super Unit> r2) {
            this.currentBounds = r1;
            this.continuation = r2;
        }

        public final Function0<Rect> getCurrentBounds() {
            return this.currentBounds;
        }

        public final CancellableContinuation<Unit> getContinuation() {
            return this.continuation;
        }

        public String toString() {
            CoroutineName r0 = (CoroutineName) this.continuation.getContext().get(CoroutineName.Key);
            if (r0 == null) goto L5;
            String name = r0.getName();
        L6:
            StringBuilder r1 = new StringBuilder().append("Request@");
            String r2 = Integer.toString(hashCode(), CharsKt.checkRadix(16));
            Intrinsics.checkNotNullExpressionValue(r2, "toString(...)");
            StringBuilder r3 = r1.append(r2);
            if (name == null) goto L10;
            String it = name;
            String it2 = '[' + it + "](";
            if (it2 == null) goto L10;
        L12:
            return r3.append(it2).append("currentBounds()=").append(this.currentBounds.invoke()).append(", continuation=").append(this.continuation).append(')').toString();
        L10:
            it2 = "(";
            goto L12
        L5:
            name = null;
            goto L6
        }
    }

    /* JADX INFO: compiled from: ContentInViewNode.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0 = null;

        static {
            int[] r0 = new int[Orientation.values().length];
            r0[Orientation.Vertical.ordinal()] = 1;     // Catch: NoSuchFieldError -> L5
        L11:
            r0[Orientation.Horizontal.ordinal()] = 2;     // Catch: NoSuchFieldError -> L8
        L9:
            $EnumSwitchMapping$0 = r0;
        }
    }

    /* JADX INFO: renamed from: androidx.compose.foundation.gestures.ContentInViewNode$launchAnimation$2, reason: invalid class name */
    /* JADX INFO: compiled from: ContentInViewNode.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "androidx.compose.foundation.gestures.ContentInViewNode$launchAnimation$2", f = "ContentInViewNode.kt", i = {}, l = {215}, m = "invokeSuspend", n = {}, s = {})
    static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ UpdatableAnimationState $animationState;
        final /* synthetic */ BringIntoViewSpec $bringIntoViewSpec;
        private /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ ContentInViewNode this$0;

        /* JADX INFO: renamed from: androidx.compose.foundation.gestures.ContentInViewNode$launchAnimation$2$1, reason: invalid class name */
        /* JADX INFO: compiled from: ContentInViewNode.kt */
        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Landroidx/compose/foundation/gestures/NestedScrollScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
        @DebugMetadata(c = "androidx.compose.foundation.gestures.ContentInViewNode$launchAnimation$2$1", f = "ContentInViewNode.kt", i = {}, l = {221}, m = "invokeSuspend", n = {}, s = {})
        static final class AnonymousClass1 extends SuspendLambda implements Function2<NestedScrollScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ Job $animationJob;
            final /* synthetic */ UpdatableAnimationState $animationState;
            final /* synthetic */ BringIntoViewSpec $bringIntoViewSpec;
            private /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ ContentInViewNode this$0;

            AnonymousClass1(UpdatableAnimationState r2, ContentInViewNode r3, BringIntoViewSpec r4, Job r5, Continuation<? super AnonymousClass1> r6) {
                this.$animationState = r2;
                this.this$0 = r3;
                this.$bringIntoViewSpec = r4;
                this.$animationJob = r5;
                super(2, r6);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object r7, Continuation<?> r8) {
                AnonymousClass1 r0 = new AnonymousClass1(this.$animationState, this.this$0, this.$bringIntoViewSpec, this.$animationJob, r8);
                r0.L$0 = r7;
                return r0;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final Object invoke2(NestedScrollScope r3, Continuation<? super Unit> r4) {
                return ((AnonymousClass1) create(r3, r4)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(NestedScrollScope r2, Continuation<? super Unit> r3) {
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
            L11:
                return Unit.INSTANCE;
            L7:
                ResultKt.throwOnFailure($result);
                final NestedScrollScope $this$scroll = (NestedScrollScope) this.L$0;
                this.$animationState.setValue(ContentInViewNode.access$calculateScrollDelta(this.this$0, this.$bringIntoViewSpec));
                UpdatableAnimationState r2 = this.$animationState;
                final ContentInViewNode r4 = this.this$0;
                final UpdatableAnimationState r5 = this.$animationState;
                final Job r6 = this.$animationJob;
                Function1<Float, Unit> r3 = new C00181(r4, r5, r6, $this$scroll);
                final ContentInViewNode r7 = this.this$0;
                final UpdatableAnimationState r8 = this.$animationState;
                final BringIntoViewSpec r9 = this.$bringIntoViewSpec;
                this.label = 1;
                if (r2.animateToZero(r3, new C00192(r7, r8, r9), this) != r0) goto L11;
                return r0;
            L5:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        AnonymousClass2(ContentInViewNode r2, UpdatableAnimationState r3, BringIntoViewSpec r4, Continuation<? super AnonymousClass2> r5) {
            this.this$0 = r2;
            this.$animationState = r3;
            this.$bringIntoViewSpec = r4;
            super(2, r5);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object r5, Continuation<?> r6) {
            AnonymousClass2 r0 = new AnonymousClass2(this.this$0, this.$animationState, this.$bringIntoViewSpec, r6);
            r0.L$0 = r5;
            return r0;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(CoroutineScope r2, Continuation<? super Unit> r3) {
            return invoke2(r2, r3);
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(CoroutineScope r3, Continuation<? super Unit> r4) {
            return ((AnonymousClass2) create(r3, r4)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v0, types: [int] */
        /* JADX WARN: Type inference failed for: r1v1 */
        /* JADX WARN: Type inference failed for: r1v4 */
        /* JADX WARN: Type inference failed for: r4v0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object $result) {
            Object r0 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            ?? r1 = this.label;
            switch(r1) {
                case 0: goto L13;
                case 1: goto L6;
                default: goto L5;
            };
        L6:
            CancellationException cancellationException = null;
            ResultKt.throwOnFailure($result);     // Catch: Throwable -> L9 CancellationException -> L11
        L19:
            ContentInViewNode.access$getBringIntoViewRequests$p(this.this$0).resumeAndRemoveAll();     // Catch: Throwable -> L9 CancellationException -> L11
            ContentInViewNode.access$setAnimationRunning$p(this.this$0, false);
            ContentInViewNode.access$getBringIntoViewRequests$p(this.this$0).cancelAndRemoveAll(cancellationException);
            ContentInViewNode.access$setTrackingFocusedChild$p(this.this$0, false);
            return Unit.INSTANCE;
        L11:
            e = e;
        L27:
            throw e;     // Catch: Throwable -> L9
        L13:
            ResultKt.throwOnFailure($result);
            CoroutineScope $this$launch = (CoroutineScope) this.L$0;
            Job animationJob = JobKt.getJob($this$launch.getCoroutineContext());
            ContentInViewNode.access$setAnimationRunning$p(this.this$0, true);     // Catch: Throwable -> L22 CancellationException -> L24
            this.label = 1;     // Catch: Throwable -> L22 CancellationException -> L24
            if (ContentInViewNode.access$getScrollingLogic$p(this.this$0).scroll(MutatePriority.Default, new AnonymousClass1(this.$animationState, this.this$0, this.$bringIntoViewSpec, animationJob, null), this) != r0) goto L17;
            return r0;
        L17:
            cancellationException = null;
            goto L19
        L24:
            e = e;
        L22:
            e = th;
            r1 = 0;
        L28:
            ContentInViewNode.access$setAnimationRunning$p(this.this$0, false);
            ContentInViewNode.access$getBringIntoViewRequests$p(this.this$0).cancelAndRemoveAll((Throwable) r1);
            ContentInViewNode.access$setTrackingFocusedChild$p(this.this$0, false);
            throw e;
        L5:
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        L9:
            e = th;
            goto L28
        }
    }

    static {
        $stable = 8;
    }

    public static final /* synthetic */ float access$calculateScrollDelta(ContentInViewNode $this, BringIntoViewSpec bringIntoViewSpec) {
        return $this.calculateScrollDelta(bringIntoViewSpec);
    }

    public static final /* synthetic */ BringIntoViewRequestPriorityQueue access$getBringIntoViewRequests$p(ContentInViewNode $this) {
        return $this.bringIntoViewRequests;
    }

    public static final /* synthetic */ Rect access$getFocusedChildBounds(ContentInViewNode $this) {
        return $this.getFocusedChildBounds();
    }

    public static final /* synthetic */ boolean access$getReverseDirection$p(ContentInViewNode $this) {
        return $this.reverseDirection;
    }

    public static final /* synthetic */ ScrollingLogic access$getScrollingLogic$p(ContentInViewNode $this) {
        return $this.scrollingLogic;
    }

    public static final /* synthetic */ boolean access$getTrackingFocusedChild$p(ContentInViewNode $this) {
        return $this.trackingFocusedChild;
    }

    public static final /* synthetic */ boolean access$isAnimationRunning$p(ContentInViewNode $this) {
        return $this.isAnimationRunning;
    }

    public static final /* synthetic */ void access$launchAnimation(ContentInViewNode $this) {
        $this.launchAnimation();
    }

    public static final /* synthetic */ void access$setAnimationRunning$p(ContentInViewNode $this, boolean r1) {
        $this.isAnimationRunning = r1;
    }

    public static final /* synthetic */ void access$setTrackingFocusedChild$p(ContentInViewNode $this, boolean r1) {
        $this.trackingFocusedChild = r1;
    }

    public ContentInViewNode(Orientation orientation, ScrollingLogic scrollingLogic, boolean reverseDirection, BringIntoViewSpec bringIntoViewSpec) {
        this.orientation = orientation;
        this.scrollingLogic = scrollingLogic;
        this.reverseDirection = reverseDirection;
        this.bringIntoViewSpec = bringIntoViewSpec;
        this.bringIntoViewRequests = new BringIntoViewRequestPriorityQueue();
        this.viewportSize = IntSize.Companion.m7149getZeroYbymL2g();
    }

    @Override // androidx.compose.ui.Modifier.Node
    public boolean getShouldAutoInvalidate() {
        return this.shouldAutoInvalidate;
    }

    /* JADX INFO: renamed from: getViewportSize-YbymL2g$foundation_release, reason: not valid java name */
    public final long m409getViewportSizeYbymL2g$foundation_release() {
        return this.viewportSize;
    }

    @Override // androidx.compose.foundation.relocation.BringIntoViewResponder
    public Rect calculateRectForParent(Rect localRect) {
        boolean value$iv = !IntSize.m7142equalsimpl0(this.viewportSize, IntSize.Companion.m7149getZeroYbymL2g());
        if (value$iv == true) goto L6;
        InlineClassHelperKt.throwIllegalStateException("Expected BringIntoViewRequester to not be used before parents are placed.");
    L6:
        return m405computeDestinationO0kMr_c(localRect, this.viewportSize);
    }

    private final BringIntoViewSpec requireBringIntoViewSpec() {
        BringIntoViewSpec r0 = this.bringIntoViewSpec;
        if (r0 == null) goto L5;
        return r0;
    L5:
        return (BringIntoViewSpec) CompositionLocalConsumerModifierNodeKt.currentValueOf(this, BringIntoViewSpec_androidKt.getLocalBringIntoViewSpec());
    }

    @Override // androidx.compose.foundation.relocation.BringIntoViewResponder
    public Object bringChildIntoView(Function0<Rect> r9, Continuation<? super Unit> r10) {
        Rect r2 = r9.invoke();
        boolean r7 = false;
        if (r2 != null) goto L5;
    L7:
        if (r7 == false) goto L9;
        CancellableContinuationImpl cancellable$iv = new CancellableContinuationImpl(IntrinsicsKt.intercepted(r10), 1);
        cancellable$iv.initCancellability();
        CancellableContinuationImpl continuation = cancellable$iv;
        Request request = new Request(r9, continuation);
        if (access$getBringIntoViewRequests$p(this).enqueue(request) == true) goto L13;
    L15:
        Object r0 = cancellable$iv.getResult();
        if (r0 != IntrinsicsKt.getCOROUTINE_SUSPENDED()) goto L19;
        DebugProbesKt.probeCoroutineSuspended(r10);
    L19:
        if (r0 != IntrinsicsKt.getCOROUTINE_SUSPENDED()) goto L22;
        return r0;
    L22:
        return Unit.INSTANCE;
    L13:
        if (access$isAnimationRunning$p(this) == true) goto L15;
        access$launchAnimation(this);
        goto L15
    L9:
        return Unit.INSTANCE;
    L5:
        if (m407isMaxVisibleO0kMr_c$default(this, r2, 0, 1, null) == true) goto L7;
        r7 = true;
        goto L7
    }

    public final void onFocusBoundsChanged(LayoutCoordinates newBounds) {
        this.focusedChild = newBounds;
        if (this.childWasMaxVisibleBeforeViewportShrunk == false) goto L10;
        Rect focusedChild = getFocusedChildBounds();
        if (focusedChild == null) goto L10;
        if (m406isMaxVisibleO0kMr_c(focusedChild, this.viewportSize) == true) goto L10;
        this.trackingFocusedChild = true;
        launchAnimation();
    L10:
        this.childWasMaxVisibleBeforeViewportShrunk = false;
    }

    @Override // androidx.compose.ui.node.LayoutAwareModifierNode
    /* JADX INFO: renamed from: onRemeasured-ozmzZPI */
    public void mo364onRemeasuredozmzZPI(long size) {
        long previousViewportSize = this.viewportSize;
        this.viewportSize = size;
        if (m403compareToTemP2vQ(size, previousViewportSize) < 0) goto L6;
        return;
    L6:
        if (this.isAnimationRunning == false) goto L8;
        return;
    L8:
        if (this.trackingFocusedChild == true) goto L20;
        Rect boundsBeforeRemeasurement = getFocusedChildBounds();
        if (boundsBeforeRemeasurement != null) goto L14;
        return;
    L14:
        if (m406isMaxVisibleO0kMr_c(boundsBeforeRemeasurement, previousViewportSize) == false) goto L19;
        this.childWasMaxVisibleBeforeViewportShrunk = true;
        return;
    L19:
        return;
    }

    private final Rect getFocusedChildBounds() {
        if (isAttached() == true) goto L5;
        return null;
    L5:
        LayoutCoordinates coordinates = DelegatableNodeKt.requireLayoutCoordinates(this);
        LayoutCoordinates focusedChild = this.focusedChild;
        if (focusedChild != null) goto L8;
    L15:
        return null;
    L8:
        if (focusedChild.isAttached() == true) goto L11;
        focusedChild = null;
    L11:
        if (focusedChild == null) goto L15;
        return coordinates.localBoundingBoxOf(focusedChild, false);
    }

    private final void launchAnimation() {
        BringIntoViewSpec bringIntoViewSpec = requireBringIntoViewSpec();
        boolean value$iv = !this.isAnimationRunning;
        if (value$iv == true) goto L5;
        InlineClassHelperKt.throwIllegalStateException("launchAnimation called when previous animation was running");
    L5:
        UpdatableAnimationState animationState = new UpdatableAnimationState(BringIntoViewSpec.Companion.getDefaultScrollAnimationSpec$foundation_release());
        BuildersKt.launch$default(getCoroutineScope(), null, CoroutineStart.UNDISPATCHED, new AnonymousClass2(this, animationState, bringIntoViewSpec, null), 1, null);
    }

    private final float calculateScrollDelta(BringIntoViewSpec bringIntoViewSpec) {
        if (IntSize.m7142equalsimpl0(this.viewportSize, IntSize.Companion.m7149getZeroYbymL2g()) == false) goto L5;
        return 0.0f;
    L5:
        Rect rectangleToMakeVisible = findBringIntoViewRequest();
        if (rectangleToMakeVisible == null) goto L8;
    L13:
        long size = IntSizeKt.m7156toSizeozmzZPI(this.viewportSize);
        Orientation r3 = this.orientation;
        switch(WhenMappings.$EnumSwitchMapping$0[r3.ordinal()]) {
            case 1: goto L18;
            case 2: goto L17;
            default: goto L16;
        };
    L17:
        int bits$iv$iv$iv = (int) (size >> 32);
        return bringIntoViewSpec.calculateScrollDistance(rectangleToMakeVisible.getLeft(), rectangleToMakeVisible.getRight() - rectangleToMakeVisible.getLeft(), Float.intBitsToFloat(bits$iv$iv$iv));
    L18:
        int bits$iv$iv$iv2 = (int) (4294967295L & size);
        return bringIntoViewSpec.calculateScrollDistance(rectangleToMakeVisible.getTop(), rectangleToMakeVisible.getBottom() - rectangleToMakeVisible.getTop(), Float.intBitsToFloat(bits$iv$iv$iv2));
    L16:
        throw new NoWhenBranchMatchedException();
    L8:
        if (this.trackingFocusedChild == false) goto L10;
        rectangleToMakeVisible = getFocusedChildBounds();
    L11:
        if (rectangleToMakeVisible != null) goto L13;
        return 0.0f;
    L10:
        rectangleToMakeVisible = null;
        goto L11
    }

    private final Rect findBringIntoViewRequest() {
        Rect r0 = null;
        BringIntoViewRequestPriorityQueue this_$iv = this.bringIntoViewRequests;
        MutableVector this_$iv$iv = BringIntoViewRequestPriorityQueue.access$getRequests$p(this_$iv);
        int i$iv$iv = this_$iv$iv.getSize() - 1;
        Object[] content$iv$iv = this_$iv$iv.content;
        if (i$iv$iv >= content$iv$iv.length) goto L17;
    L4:
        if (i$iv$iv < 0) goto L17;
        Request it$iv = (Request) content$iv$iv[i$iv$iv];
        Rect bounds = it$iv.getCurrentBounds().invoke();
        if (bounds == null) goto L14;
        if (m404compareToiLBOSCw(bounds.m4158getSizeNHjbRc(), IntSizeKt.m7156toSizeozmzZPI(this.viewportSize)) > 0) goto L10;
        r0 = bounds;
        goto L14
    L10:
        if (r0 != null) goto L13;
        return bounds;
    L13:
        return r0;
    L14:
        i$iv$iv = i$iv$iv - 1;
    L17:
        return r0;
    }

    /* JADX INFO: renamed from: computeDestination-O0kMr_c, reason: not valid java name */
    private final Rect m405computeDestinationO0kMr_c(Rect childBounds, long containerSize) {
        long arg0$iv = m408relocationOffsetBMxPBkI(childBounds, containerSize);
        long arg0$iv2 = Offset.m4117constructorimpl((-9223372034707292160L) ^ arg0$iv);
        return childBounds.m4162translatek4lQ0M(arg0$iv2);
    }

    /* JADX INFO: renamed from: isMaxVisible-O0kMr_c$default, reason: not valid java name */
    static /* synthetic */ boolean m407isMaxVisibleO0kMr_c$default(ContentInViewNode r0, Rect r1, long r2, int r4, Object r5) {
        if ((r4 & 1) == 0) goto L6;
        r2 = r0.viewportSize;
    L6:
        return r0.m406isMaxVisibleO0kMr_c(r1, r2);
    }

    /* JADX INFO: renamed from: isMaxVisible-O0kMr_c, reason: not valid java name */
    private final boolean m406isMaxVisibleO0kMr_c(Rect $this$isMaxVisible_u2dO0kMr_c, long size) {
        long relocationOffset = m408relocationOffsetBMxPBkI($this$isMaxVisible_u2dO0kMr_c, size);
        int bits$iv$iv$iv = (int) (relocationOffset >> 32);
        if (Math.abs(Float.intBitsToFloat(bits$iv$iv$iv)) > 0.5f) goto L7;
        int bits$iv$iv$iv2 = (int) (4294967295L & relocationOffset);
        if (Math.abs(Float.intBitsToFloat(bits$iv$iv$iv2)) > 0.5f) goto L7;
        return true;
    L7:
        return false;
    }

    /* JADX INFO: renamed from: relocationOffset-BMxPBkI, reason: not valid java name */
    private final long m408relocationOffsetBMxPBkI(Rect childBounds, long containerSize) {
        long size = IntSizeKt.m7156toSizeozmzZPI(containerSize);
        switch(WhenMappings.$EnumSwitchMapping$0[this.orientation.ordinal()]) {
            case 1: goto L7;
            case 2: goto L6;
            default: goto L5;
        };
    L6:
        int bits$iv$iv$iv = (int) (size >> 32);
        float x$iv = requireBringIntoViewSpec().calculateScrollDistance(childBounds.getLeft(), childBounds.getRight() - childBounds.getLeft(), Float.intBitsToFloat(bits$iv$iv$iv));
        long v1$iv$iv = Float.floatToRawIntBits(x$iv);
        long v2$iv$iv = Float.floatToRawIntBits(0.0f);
        return Offset.m4117constructorimpl((v2$iv$iv & 4294967295L) | (v1$iv$iv << 32));
    L7:
        int bits$iv$iv$iv2 = (int) (size & 4294967295L);
        float y$iv = requireBringIntoViewSpec().calculateScrollDistance(childBounds.getTop(), childBounds.getBottom() - childBounds.getTop(), Float.intBitsToFloat(bits$iv$iv$iv2));
        long v1$iv$iv2 = Float.floatToRawIntBits(0.0f);
        long v2$iv$iv2 = Float.floatToRawIntBits(y$iv);
        return Offset.m4117constructorimpl((v2$iv$iv2 & 4294967295L) | (v1$iv$iv2 << 32));
    L5:
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: renamed from: compareTo-TemP2vQ, reason: not valid java name */
    private final int m403compareToTemP2vQ(long $this$compareTo_u2dTemP2vQ, long other) {
        Orientation r0 = this.orientation;
        switch(WhenMappings.$EnumSwitchMapping$0[r0.ordinal()]) {
            case 1: goto L8;
            case 2: goto L9;
            default: goto L5;
        };
    L5:
        throw new NoWhenBranchMatchedException();
    L9:
        return Intrinsics.compare((int) ($this$compareTo_u2dTemP2vQ >> 32), (int) (other >> 32));
    L8:
        return Intrinsics.compare((int) ($this$compareTo_u2dTemP2vQ & 4294967295L), (int) (4294967295L & other));
    }

    /* JADX INFO: renamed from: compareTo-iLBOSCw, reason: not valid java name */
    private final int m404compareToiLBOSCw(long $this$compareTo_u2diLBOSCw, long other) {
        Orientation r0 = this.orientation;
        switch(WhenMappings.$EnumSwitchMapping$0[r0.ordinal()]) {
            case 1: goto L7;
            case 2: goto L6;
            default: goto L5;
        };
    L6:
        int bits$iv$iv$iv = (int) ($this$compareTo_u2diLBOSCw >> 32);
        int bits$iv$iv$iv2 = (int) (other >> 32);
        return Float.compare(Float.intBitsToFloat(bits$iv$iv$iv), Float.intBitsToFloat(bits$iv$iv$iv2));
    L7:
        int bits$iv$iv$iv3 = (int) ($this$compareTo_u2diLBOSCw & 4294967295L);
        int bits$iv$iv$iv4 = (int) (4294967295L & other);
        return Float.compare(Float.intBitsToFloat(bits$iv$iv$iv3), Float.intBitsToFloat(bits$iv$iv$iv4));
    L5:
        throw new NoWhenBranchMatchedException();
    }

    public final void update(Orientation orientation, boolean reverseDirection, BringIntoViewSpec bringIntoViewSpec) {
        this.orientation = orientation;
        this.reverseDirection = reverseDirection;
        this.bringIntoViewSpec = bringIntoViewSpec;
    }
}
