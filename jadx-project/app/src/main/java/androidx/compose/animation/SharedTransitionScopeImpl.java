package androidx.compose.animation;

import androidx.collection.MutableScatterMap;
import androidx.collection.ScatterMap;
import androidx.compose.animation.core.Transition;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import androidx.compose.runtime.snapshots.SnapshotStateObserver;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.graphics.AndroidPath_androidKt;
import androidx.compose.ui.graphics.OutlineKt;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.LookaheadScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: SharedTransitionScope.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000è\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\b\u0001\u0018\u0000 \u0083\u00012\u00020\u00012\u00020\u0002:\u0004\u0083\u0001\u0084\u0001B\u0017\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0010\u00102\u001a\u0002032\u0006\u00104\u001a\u000205H\u0016J\u0015\u00106\u001a\u00020\u001d2\u0006\u00107\u001a\u00020*H\u0000¢\u0006\u0002\b8J\u0015\u00109\u001a\u00020\u001d2\u0006\u00107\u001a\u00020:H\u0000¢\u0006\u0002\b;J\b\u0010<\u001a\u00020\u001dH\u0002J7\u0010=\u001a\u00020\u001d2\u0006\u00107\u001a\u00020+2\u0012\u0010>\u001a\u000e\u0012\u0004\u0012\u00020+\u0012\u0004\u0012\u00020\u001d0-2\f\u0010?\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001cH\u0000¢\u0006\u0002\b@J\r\u0010A\u001a\u00020\u001dH\u0000¢\u0006\u0002\bBJ\u0015\u0010C\u001a\u00020\u001d2\u0006\u0010D\u001a\u00020$H\u0000¢\u0006\u0002\bEJ\u0015\u0010F\u001a\u00020\u001d2\u0006\u0010D\u001a\u00020$H\u0000¢\u0006\u0002\bGJ\u0015\u0010H\u001a\u00020\u001d2\u0006\u0010I\u001a\u00020JH\u0000¢\u0006\u0002\bKJ\u0015\u0010L\u001a\u00020\u001d2\u0006\u0010I\u001a\u00020JH\u0000¢\u0006\u0002\bMJ\u0015\u0010N\u001a\u00020O2\u0006\u0010P\u001a\u00020*H\u0017¢\u0006\u0002\u0010QJM\u0010R\u001a\u00020J2\u0006\u0010S\u001a\u00020+2\u0006\u0010T\u001a\u00020U2\u0006\u0010V\u001a\u00020W2\u0006\u0010X\u001a\u00020\n2\u0006\u0010Y\u001a\u00020O2\u0006\u0010Z\u001a\u0002032\u0006\u0010[\u001a\u00020\\2\u0006\u0010]\u001a\u00020\nH\u0003¢\u0006\u0002\u0010^J\u0010\u0010_\u001a\u00020+2\u0006\u0010P\u001a\u00020*H\u0002J\b\u0010,\u001a\u00020\u001dH\u0002J3\u0010`\u001a\u00020a*\u00020\u00142\u0006\u0010b\u001a\u00020\u00142\b\b\u0002\u0010c\u001a\u00020a2\b\b\u0002\u0010d\u001a\u00020\nH\u0096\u0001ø\u0001\u0000¢\u0006\u0004\be\u0010fJ>\u0010g\u001a\u00020h*\u00020h2\f\u0010i\u001a\b\u0012\u0004\u0012\u00020\n0\u001c2\u0006\u0010[\u001a\u00020\\2\u001a\u0010Z\u001a\u0016\u0012\u0004\u0012\u00020k\u0012\u0004\u0012\u00020l\u0012\u0006\u0012\u0004\u0018\u00010m0jH\u0016J\\\u0010n\u001a\u00020h*\u00020h2\u0006\u0010Y\u001a\u00020O2\u0006\u0010o\u001a\u00020p2\u0006\u0010q\u001a\u00020r2\u0006\u0010s\u001a\u00020t2\u0006\u0010u\u001a\u00020v2\u0006\u0010w\u001a\u00020x2\u0006\u0010V\u001a\u00020W2\u0006\u0010]\u001a\u00020\n2\u0006\u0010[\u001a\u00020\\2\u0006\u0010Z\u001a\u000203H\u0016Jp\u0010y\u001a\u00020h\"\u0004\b\u0000\u0010z*\u00020h2\u0006\u0010Y\u001a\u00020O2\u000e\u0010{\u001a\n\u0012\u0004\u0012\u0002Hz\u0018\u00010|2\u0012\u0010}\u001a\u000e\u0012\u0004\u0012\u0002Hz\u0012\u0004\u0012\u00020\n0-2\u0006\u0010u\u001a\u00020v2\b\b\u0002\u0010V\u001a\u00020W2\u0006\u0010X\u001a\u00020\n2\u0006\u0010]\u001a\u00020\n2\u0006\u0010[\u001a\u00020\\2\u0006\u0010Z\u001a\u000203H\u0002JS\u0010~\u001a\u00020h*\u00020h2\u0006\u0010Y\u001a\u00020O2\u0006\u0010}\u001a\u00020\n2\b\b\u0002\u0010u\u001a\u00020v2\b\b\u0002\u0010V\u001a\u00020W2\b\b\u0002\u0010]\u001a\u00020\n2\b\b\u0002\u0010[\u001a\u00020\\2\b\b\u0002\u0010Z\u001a\u000203H\u0000¢\u0006\u0002\b\u007fJD\u0010S\u001a\u00020h*\u00020h2\u0006\u0010Y\u001a\u00020O2\u0006\u0010o\u001a\u00020p2\u0006\u0010u\u001a\u00020v2\u0006\u0010V\u001a\u00020W2\u0006\u0010]\u001a\u00020\n2\u0006\u0010[\u001a\u00020\\2\u0006\u0010Z\u001a\u000203H\u0016JE\u0010\u0080\u0001\u001a\u00020h*\u00020h2\u0006\u0010Y\u001a\u00020O2\u0006\u0010}\u001a\u00020\n2\u0006\u0010u\u001a\u00020v2\u0006\u0010V\u001a\u00020W2\u0006\u0010]\u001a\u00020\n2\u0006\u0010[\u001a\u00020\\2\u0006\u0010Z\u001a\u000203H\u0016J\r\u0010\u0081\u0001\u001a\u00020h*\u00020hH\u0016J\u000e\u0010\u0082\u0001\u001a\u00020\u0014*\u00020\u0014H\u0096\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u001e\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\n@BX\u0080\u000e¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR+\u0010\u000e\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\n8V@RX\u0096\u008e\u0002¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u000e\u0010\r\"\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0013\u001a\u00020\u00148@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u0014X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0016\"\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001cX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u001e\u001a\u00020\u001f8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b \u0010!R\u0014\u0010\"\u001a\b\u0012\u0004\u0012\u00020$0#X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010%\u001a\u00020\u0014X\u0080.¢\u0006\u000e\n\u0000\u001a\u0004\b&\u0010\u0016\"\u0004\b'\u0010\u001aR\u001a\u0010(\u001a\u000e\u0012\u0004\u0012\u00020*\u0012\u0004\u0012\u00020+0)X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010,\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u001d0-X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010.\u001a\u00020\u0014*\u00020/X\u0096\u0005¢\u0006\u0006\u001a\u0004\b0\u00101\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0085\u0001"}, d2 = {"Landroidx/compose/animation/SharedTransitionScopeImpl;", "Landroidx/compose/animation/SharedTransitionScope;", "Landroidx/compose/ui/layout/LookaheadScope;", "lookaheadScope", "coroutineScope", "Lkotlinx/coroutines/CoroutineScope;", "(Landroidx/compose/ui/layout/LookaheadScope;Lkotlinx/coroutines/CoroutineScope;)V", "getCoroutineScope", "()Lkotlinx/coroutines/CoroutineScope;", "<set-?>", "", "disposed", "getDisposed$animation_release", "()Z", "isTransitionActive", "setTransitionActive", "(Z)V", "isTransitionActive$delegate", "Landroidx/compose/runtime/MutableState;", "lookaheadRoot", "Landroidx/compose/ui/layout/LayoutCoordinates;", "getLookaheadRoot$animation_release", "()Landroidx/compose/ui/layout/LayoutCoordinates;", "nullableLookaheadRoot", "getNullableLookaheadRoot$animation_release", "setNullableLookaheadRoot$animation_release", "(Landroidx/compose/ui/layout/LayoutCoordinates;)V", "observeAnimatingBlock", "Lkotlin/Function0;", "", "observerForTest", "Landroidx/compose/runtime/snapshots/SnapshotStateObserver;", "getObserverForTest$animation_release", "()Landroidx/compose/runtime/snapshots/SnapshotStateObserver;", "renderers", "Landroidx/compose/runtime/snapshots/SnapshotStateList;", "Landroidx/compose/animation/LayerRenderer;", "root", "getRoot$animation_release", "setRoot$animation_release", "sharedElements", "Landroidx/collection/MutableScatterMap;", "", "Landroidx/compose/animation/SharedElement;", "updateTransitionActiveness", "Lkotlin/Function1;", "lookaheadScopeCoordinates", "Landroidx/compose/ui/layout/Placeable$PlacementScope;", "getLookaheadScopeCoordinates", "(Landroidx/compose/ui/layout/Placeable$PlacementScope;)Landroidx/compose/ui/layout/LayoutCoordinates;", "OverlayClip", "Landroidx/compose/animation/SharedTransitionScope$OverlayClip;", "clipShape", "Landroidx/compose/ui/graphics/Shape;", "clearObservation", "scope", "clearObservation$animation_release", "drawInOverlay", "Landroidx/compose/ui/graphics/drawscope/ContentDrawScope;", "drawInOverlay$animation_release", "observeIsAnimating", "observeReads", "onValueChangedForScope", "block", "observeReads$animation_release", "onDispose", "onDispose$animation_release", "onLayerRendererCreated", "renderer", "onLayerRendererCreated$animation_release", "onLayerRendererRemoved", "onLayerRendererRemoved$animation_release", "onStateAdded", "sharedElementState", "Landroidx/compose/animation/SharedElementInternalState;", "onStateAdded$animation_release", "onStateRemoved", "onStateRemoved$animation_release", "rememberSharedContentState", "Landroidx/compose/animation/SharedTransitionScope$SharedContentState;", "key", "(Ljava/lang/Object;Landroidx/compose/runtime/Composer;I)Landroidx/compose/animation/SharedTransitionScope$SharedContentState;", "rememberSharedElementState", "sharedElement", "boundsAnimation", "Landroidx/compose/animation/BoundsAnimation;", "placeHolderSize", "Landroidx/compose/animation/SharedTransitionScope$PlaceHolderSize;", "renderOnlyWhenVisible", "sharedContentState", "clipInOverlayDuringTransition", "zIndexInOverlay", "", "renderInOverlayDuringTransition", "(Landroidx/compose/animation/SharedElement;Landroidx/compose/animation/BoundsAnimation;Landroidx/compose/animation/SharedTransitionScope$PlaceHolderSize;ZLandroidx/compose/animation/SharedTransitionScope$SharedContentState;Landroidx/compose/animation/SharedTransitionScope$OverlayClip;FZLandroidx/compose/runtime/Composer;I)Landroidx/compose/animation/SharedElementInternalState;", "sharedElementsFor", "localLookaheadPositionOf", "Landroidx/compose/ui/geometry/Offset;", "sourceCoordinates", "relativeToSource", "includeMotionFrameOfReference", "localLookaheadPositionOf-au-aQtc", "(Landroidx/compose/ui/layout/LayoutCoordinates;Landroidx/compose/ui/layout/LayoutCoordinates;JZ)J", "renderInSharedTransitionScopeOverlay", "Landroidx/compose/ui/Modifier;", "renderInOverlay", "Lkotlin/Function2;", "Landroidx/compose/ui/unit/LayoutDirection;", "Landroidx/compose/ui/unit/Density;", "Landroidx/compose/ui/graphics/Path;", "sharedBounds", "animatedVisibilityScope", "Landroidx/compose/animation/AnimatedVisibilityScope;", "enter", "Landroidx/compose/animation/EnterTransition;", "exit", "Landroidx/compose/animation/ExitTransition;", "boundsTransform", "Landroidx/compose/animation/BoundsTransform;", "resizeMode", "Landroidx/compose/animation/SharedTransitionScope$ResizeMode;", "sharedBoundsImpl", "T", "parentTransition", "Landroidx/compose/animation/core/Transition;", "visible", "sharedBoundsWithCallerManagedVisibility", "sharedBoundsWithCallerManagedVisibility$animation_release", "sharedElementWithCallerManagedVisibility", "skipToLookaheadSize", "toLookaheadCoordinates", "Companion", "ShapeBasedClip", "animation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class SharedTransitionScopeImpl implements SharedTransitionScope, LookaheadScope {
    public static final int $stable = 0;
    public static final Companion Companion = null;
    private static final Lazy<SnapshotStateObserver> SharedTransitionObserver$delegate = null;
    private final /* synthetic */ LookaheadScope $$delegate_0;
    private final CoroutineScope coroutineScope;
    private boolean disposed;
    private final MutableState isTransitionActive$delegate;
    private LayoutCoordinates nullableLookaheadRoot;
    private final Function0<Unit> observeAnimatingBlock;
    private final SnapshotStateList<LayerRenderer> renderers;
    public LayoutCoordinates root;
    private final MutableScatterMap<Object, SharedElement> sharedElements;
    private final Function1<SharedTransitionScope, Unit> updateTransitionActiveness;

    /* JADX INFO: compiled from: SharedTransitionScope.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001b\u0010\u0003\u001a\u00020\u00048BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"Landroidx/compose/animation/SharedTransitionScopeImpl$Companion;", "", "()V", "SharedTransitionObserver", "Landroidx/compose/runtime/snapshots/SnapshotStateObserver;", "getSharedTransitionObserver", "()Landroidx/compose/runtime/snapshots/SnapshotStateObserver;", "SharedTransitionObserver$delegate", "Lkotlin/Lazy;", "animation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker r1) {
            this();
        }

        private Companion() {
        }

        public static final /* synthetic */ SnapshotStateObserver access$getSharedTransitionObserver(Companion $this) {
            return $this.getSharedTransitionObserver();
        }

        private final SnapshotStateObserver getSharedTransitionObserver() {
            return (SnapshotStateObserver) SharedTransitionScopeImpl.access$getSharedTransitionObserver$delegate$cp().getValue();
        }
    }

    /* JADX INFO: compiled from: SharedTransitionScope.kt */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J(\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Landroidx/compose/animation/SharedTransitionScopeImpl$ShapeBasedClip;", "Landroidx/compose/animation/SharedTransitionScope$OverlayClip;", "clipShape", "Landroidx/compose/ui/graphics/Shape;", "(Landroidx/compose/ui/graphics/Shape;)V", "getClipShape", "()Landroidx/compose/ui/graphics/Shape;", "path", "Landroidx/compose/ui/graphics/Path;", "getClipPath", "sharedContentState", "Landroidx/compose/animation/SharedTransitionScope$SharedContentState;", "bounds", "Landroidx/compose/ui/geometry/Rect;", "layoutDirection", "Landroidx/compose/ui/unit/LayoutDirection;", "density", "Landroidx/compose/ui/unit/Density;", "animation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    private static final class ShapeBasedClip implements SharedTransitionScope.OverlayClip {
        private final Shape clipShape;
        private final Path path;

        public ShapeBasedClip(Shape clipShape) {
            this.clipShape = clipShape;
            this.path = AndroidPath_androidKt.Path();
        }

        public final Shape getClipShape() {
            return this.clipShape;
        }

        @Override // androidx.compose.animation.SharedTransitionScope.OverlayClip
        public Path getClipPath(SharedTransitionScope.SharedContentState sharedContentState, Rect bounds, LayoutDirection layoutDirection, Density density) {
            this.path.reset();
            OutlineKt.addOutline(this.path, this.clipShape.mo290createOutlinePq9zytI(bounds.m4158getSizeNHjbRc(), layoutDirection, density));
            this.path.mo4261translatek4lQ0M(bounds.m4160getTopLeftF1C5BW0());
            return this.path;
        }
    }

    @Override // androidx.compose.ui.layout.LookaheadScope
    public LayoutCoordinates getLookaheadScopeCoordinates(Placeable.PlacementScope r2) {
        return this.$$delegate_0.getLookaheadScopeCoordinates(r2);
    }

    @Override // androidx.compose.ui.layout.LookaheadScope
    /* JADX INFO: renamed from: localLookaheadPositionOf-au-aQtc, reason: not valid java name */
    public long mo108localLookaheadPositionOfauaQtc(LayoutCoordinates r7, LayoutCoordinates r8, long r9, boolean r11) {
        return this.$$delegate_0.mo108localLookaheadPositionOfauaQtc(r7, r8, r9, r11);
    }

    @Override // androidx.compose.ui.layout.LookaheadScope
    public LayoutCoordinates toLookaheadCoordinates(LayoutCoordinates r2) {
        return this.$$delegate_0.toLookaheadCoordinates(r2);
    }

    public SharedTransitionScopeImpl(LookaheadScope lookaheadScope, CoroutineScope coroutineScope) {
        this.coroutineScope = coroutineScope;
        this.$$delegate_0 = lookaheadScope;
        this.isTransitionActive$delegate = SnapshotStateKt.mutableStateOf$default(false, null, 2, null);
        this.observeAnimatingBlock = new SharedTransitionScopeImpl$observeAnimatingBlock$1(this);
        this.updateTransitionActiveness = new C01871(this);
        this.renderers = SnapshotStateKt.mutableStateListOf();
        this.sharedElements = new MutableScatterMap(0, 1, null);
    }

    public static final /* synthetic */ MutableScatterMap access$getSharedElements$p(SharedTransitionScopeImpl $this) {
        return $this.sharedElements;
    }

    public static final /* synthetic */ Lazy access$getSharedTransitionObserver$delegate$cp() {
        return SharedTransitionObserver$delegate;
    }

    public static final /* synthetic */ SharedElementInternalState access$rememberSharedElementState(SharedTransitionScopeImpl $this, SharedElement sharedElement, BoundsAnimation boundsAnimation, SharedTransitionScope.PlaceHolderSize placeHolderSize, boolean renderOnlyWhenVisible, SharedTransitionScope.SharedContentState sharedContentState, SharedTransitionScope.OverlayClip clipInOverlayDuringTransition, float zIndexInOverlay, boolean renderInOverlayDuringTransition, Composer $composer, int $changed) {
        return $this.rememberSharedElementState(sharedElement, boundsAnimation, placeHolderSize, renderOnlyWhenVisible, sharedContentState, clipInOverlayDuringTransition, zIndexInOverlay, renderInOverlayDuringTransition, $composer, $changed);
    }

    public static final /* synthetic */ SharedElement access$sharedElementsFor(SharedTransitionScopeImpl $this, Object key) {
        return $this.sharedElementsFor(key);
    }

    public static final /* synthetic */ void access$updateTransitionActiveness(SharedTransitionScopeImpl $this) {
        $this.updateTransitionActiveness();
    }

    public final CoroutineScope getCoroutineScope() {
        return this.coroutineScope;
    }

    static {
        Companion = new Companion(null);
        SharedTransitionObserver$delegate = LazyKt.lazy(LazyThreadSafetyMode.NONE, SharedTransitionScopeImpl$Companion$SharedTransitionObserver$2.INSTANCE);
    }

    public final boolean getDisposed$animation_release() {
        return this.disposed;
    }

    private void setTransitionActive(boolean r5) {
        MutableState $this$setValue$iv = this.isTransitionActive$delegate;
        $this$setValue$iv.setValue(Boolean.valueOf(r5));
    }

    @Override // androidx.compose.animation.SharedTransitionScope
    public boolean isTransitionActive() {
        State $this$getValue$iv = this.isTransitionActive$delegate;
        return ((Boolean) $this$getValue$iv.getValue()).booleanValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.compose.animation.SharedTransitionScope
    public Modifier skipToLookaheadSize(Modifier r4) {
        Object[] r1 = 0 == true ? 1 : 0;
        return r4.then(new SkipToLookaheadElement(null, r1, 3, 0 == true ? 1 : 0));
    }

    @Override // androidx.compose.animation.SharedTransitionScope
    public Modifier renderInSharedTransitionScopeOverlay(Modifier $this$renderInSharedTransitionScopeOverlay, Function0<Boolean> r3, float zIndexInOverlay, Function2<? super LayoutDirection, ? super Density, ? extends Path> r5) {
        return $this$renderInSharedTransitionScopeOverlay.then(new RenderInTransitionOverlayNodeElement(this, r3, zIndexInOverlay, r5));
    }

    @Override // androidx.compose.animation.SharedTransitionScope
    public Modifier sharedElement(Modifier $this$sharedElement, SharedTransitionScope.SharedContentState sharedContentState, AnimatedVisibilityScope animatedVisibilityScope, BoundsTransform boundsTransform, SharedTransitionScope.PlaceHolderSize placeHolderSize, boolean renderInOverlayDuringTransition, float zIndexInOverlay, SharedTransitionScope.OverlayClip clipInOverlayDuringTransition) {
        return sharedBoundsImpl($this$sharedElement, sharedContentState, animatedVisibilityScope.getTransition(), C01851.INSTANCE, boundsTransform, placeHolderSize, true, renderInOverlayDuringTransition, zIndexInOverlay, clipInOverlayDuringTransition);
    }

    @Override // androidx.compose.animation.SharedTransitionScope
    public Modifier sharedBounds(Modifier $this$sharedBounds, final SharedTransitionScope.SharedContentState sharedContentState, final AnimatedVisibilityScope animatedVisibilityScope, final EnterTransition enter, final ExitTransition exit, BoundsTransform boundsTransform, final SharedTransitionScope.ResizeMode resizeMode, SharedTransitionScope.PlaceHolderSize placeHolderSize, boolean renderInOverlayDuringTransition, float zIndexInOverlay, SharedTransitionScope.OverlayClip clipInOverlayDuringTransition) {
        return ComposedModifierKt.composed$default(sharedBoundsImpl($this$sharedBounds, sharedContentState, animatedVisibilityScope.getTransition(), AnonymousClass1.INSTANCE, boundsTransform, placeHolderSize, false, renderInOverlayDuringTransition, zIndexInOverlay, clipInOverlayDuringTransition), null, new AnonymousClass2(animatedVisibilityScope, enter, exit, sharedContentState, resizeMode), 1, null);
    }

    @Override // androidx.compose.animation.SharedTransitionScope
    public Modifier sharedElementWithCallerManagedVisibility(Modifier $this$sharedElementWithCallerManagedVisibility, SharedTransitionScope.SharedContentState sharedContentState, final boolean visible, BoundsTransform boundsTransform, SharedTransitionScope.PlaceHolderSize placeHolderSize, boolean renderInOverlayDuringTransition, float zIndexInOverlay, SharedTransitionScope.OverlayClip clipInOverlayDuringTransition) {
        return sharedBoundsImpl($this$sharedElementWithCallerManagedVisibility, sharedContentState, null, new C01861(visible), boundsTransform, placeHolderSize, true, renderInOverlayDuringTransition, zIndexInOverlay, clipInOverlayDuringTransition);
    }

    public static /* synthetic */ Modifier sharedBoundsWithCallerManagedVisibility$animation_release$default(SharedTransitionScopeImpl r9, Modifier r10, SharedTransitionScope.SharedContentState r11, boolean r12, BoundsTransform r13, SharedTransitionScope.PlaceHolderSize r14, boolean r15, float r16, SharedTransitionScope.OverlayClip r17, int r18, Object r19) {
        if ((r18 & 4) == 0) goto L5;
        BoundsTransform r4 = SharedTransitionScopeKt.access$getDefaultBoundsTransform$p();
    L7:
        if ((r18 & 8) == 0) goto L9;
        SharedTransitionScope.PlaceHolderSize r5 = SharedTransitionScope.PlaceHolderSize.Companion.getContentSize();
    L11:
        if ((r18 & 16) == 0) goto L13;
        boolean r6 = true;
    L15:
        if ((r18 & 32) == 0) goto L17;
        float r7 = 0.0f;
    L19:
        if ((r18 & 64) == 0) goto L21;
        SharedTransitionScope.OverlayClip r8 = SharedTransitionScopeKt.access$getParentClip$p();
    L23:
        return r9.sharedBoundsWithCallerManagedVisibility$animation_release(r10, r11, r12, r4, r5, r6, r7, r8);
    L21:
        r8 = r17;
        goto L23
    L17:
        r7 = r16;
        goto L19
    L13:
        r6 = r15;
        goto L15
    L9:
        r5 = r14;
        goto L11
    L5:
        r4 = r13;
        goto L7
    }

    public final Modifier sharedBoundsWithCallerManagedVisibility$animation_release(Modifier $this$sharedBoundsWithCallerManagedVisibility, SharedTransitionScope.SharedContentState sharedContentState, final boolean visible, BoundsTransform boundsTransform, SharedTransitionScope.PlaceHolderSize placeHolderSize, boolean renderInOverlayDuringTransition, float zIndexInOverlay, SharedTransitionScope.OverlayClip clipInOverlayDuringTransition) {
        return sharedBoundsImpl($this$sharedBoundsWithCallerManagedVisibility, sharedContentState, null, new SharedTransitionScopeImpl$sharedBoundsWithCallerManagedVisibility$1(visible), boundsTransform, placeHolderSize, false, renderInOverlayDuringTransition, zIndexInOverlay, clipInOverlayDuringTransition);
    }

    @Override // androidx.compose.animation.SharedTransitionScope
    public SharedTransitionScope.OverlayClip OverlayClip(Shape clipShape) {
        return new ShapeBasedClip(clipShape);
    }

    @Override // androidx.compose.animation.SharedTransitionScope
    public SharedTransitionScope.SharedContentState rememberSharedContentState(Object key, Composer $composer, int $changed) {
        $composer.startReplaceGroup(799702514);
        ComposerKt.sourceInformation($composer, "C(rememberSharedContentState)874@49196L41:SharedTransitionScope.kt#xbi5r1");
        if (ComposerKt.isTraceInProgress() == false) goto L5;
        ComposerKt.traceEventStart(799702514, $changed, -1, "androidx.compose.animation.SharedTransitionScopeImpl.rememberSharedContentState (SharedTransitionScope.kt:874)");
    L5:
        ComposerKt.sourceInformationMarkerStart($composer, 935461266, "CC(remember):SharedTransitionScope.kt#9igjgp");
        boolean invalid$iv = $composer.changed(key);
        Object it$iv = $composer.rememberedValue();
        if (invalid$iv == false) goto L8;
    L11:
        Object value$iv = new SharedTransitionScope.SharedContentState(key);
        $composer.updateRememberedValue(value$iv);
        it$iv = value$iv;
    L12:
        SharedTransitionScope.SharedContentState r3 = (SharedTransitionScope.SharedContentState) it$iv;
        ComposerKt.sourceInformationMarkerEnd($composer);
        if (ComposerKt.isTraceInProgress() == false) goto L15;
        ComposerKt.traceEventEnd();
    L15:
        $composer.endReplaceGroup();
        return r3;
    L8:
        if (it$iv != Composer.Companion.getEmpty()) goto L12;
        goto L11
    }

    private final void updateTransitionActiveness() {
        ScatterMap this_$iv = this.sharedElements;
        int $i$f$any = 0;
        Object[] k$iv$iv = this_$iv.keys;
        Object[] v$iv$iv = this_$iv.values;
        long[] m$iv$iv$iv = this_$iv.metadata;
        int lastIndex$iv$iv$iv = m$iv$iv$iv.length - 2;
        int i$iv$iv$iv = 0;
        int r12 = 8;
        if (0 > lastIndex$iv$iv$iv) goto L21;
    L4:
        long slot$iv$iv$iv = m$iv$iv$iv[i$iv$iv$iv];
        long r26 = 255;
        ScatterMap this_$iv2 = this_$iv;
        int $i$f$any2 = $i$f$any;
        if (((((~slot$iv$iv$iv) << 7) & slot$iv$iv$iv) & (-9187201950435737472L)) == (-9187201950435737472L)) goto L19;
        int bitCount$iv$iv$iv = 8 - ((~(i$iv$iv$iv - lastIndex$iv$iv$iv)) >>> 31);
        int j$iv$iv$iv = 0;
    L7:
        if (j$iv$iv$iv >= bitCount$iv$iv$iv) goto L18;
        long value$iv$iv$iv$iv = slot$iv$iv$iv & 255;
        if (value$iv$iv$iv$iv >= 128) goto L11;
        boolean r13 = true;
    L12:
        if (r13 == false) goto L17;
        int index$iv$iv$iv = (i$iv$iv$iv << 3) + j$iv$iv$iv;
        Object r28 = k$iv$iv[index$iv$iv$iv];
        Object value$iv = v$iv$iv[index$iv$iv$iv];
        SharedElement element = (SharedElement) value$iv;
        if (element.isAnimating() == false) goto L17;
        boolean isActive = true;
    L25:
        if (isActive == isTransitionActive()) goto L50;
        setTransitionActive(isActive);
        if (isActive == true) goto L50;
        ScatterMap this_$iv3 = this.sharedElements;
        Object[] k$iv = this_$iv3.keys;
        Object[] v$iv = this_$iv3.values;
        long[] m$iv$iv = this_$iv3.metadata;
        int lastIndex$iv$iv = m$iv$iv.length - 2;
        int i$iv$iv = 0;
        if (0 > lastIndex$iv$iv) goto L50;
    L30:
        long slot$iv$iv = m$iv$iv[i$iv$iv];
        int r23 = r12;
        long slot$iv$iv2 = slot$iv$iv;
        boolean isActive2 = isActive;
        ScatterMap this_$iv4 = this_$iv3;
        if (((((~slot$iv$iv) << 7) & slot$iv$iv) & (-9187201950435737472L)) == (-9187201950435737472L)) goto L43;
        int bitCount$iv$iv = 8 - ((~(i$iv$iv - lastIndex$iv$iv)) >>> 31);
        int j$iv$iv = 0;
    L33:
        if (j$iv$iv >= bitCount$iv$iv) goto L42;
        long value$iv$iv$iv = slot$iv$iv2 & r26;
        if (value$iv$iv$iv >= 128) goto L37;
        int $i$f$isFull = 1;
    L38:
        if ($i$f$isFull == 0) goto L40;
        int index$iv$iv = (i$iv$iv << 3) + j$iv$iv;
        Object r22 = k$iv[index$iv$iv];
        SharedElement element2 = (SharedElement) v$iv[index$iv$iv];
        element2.onSharedTransitionFinished();
    L40:
        slot$iv$iv2 = slot$iv$iv2 >> r23;
        j$iv$iv = j$iv$iv + 1;
        goto L33
    L37:
        $i$f$isFull = 0;
        goto L38
    L42:
        if (bitCount$iv$iv != r23) goto L50;
    L43:
        if (i$iv$iv == lastIndex$iv$iv) goto L50;
        i$iv$iv = i$iv$iv + 1;
        isActive = isActive2;
        this_$iv3 = this_$iv4;
        r12 = 8;
    L50:
        ScatterMap this_$iv5 = this.sharedElements;
        Object[] k$iv2 = this_$iv5.keys;
        Object[] v$iv2 = this_$iv5.values;
        long[] m$iv$iv2 = this_$iv5.metadata;
        int lastIndex$iv$iv2 = m$iv$iv2.length - 2;
        int i$iv$iv2 = 0;
        if (0 > lastIndex$iv$iv2) goto L71;
    L52:
        long slot$iv$iv3 = m$iv$iv2[i$iv$iv2];
        ScatterMap this_$iv6 = this_$iv5;
        if (((((~slot$iv$iv3) << 7) & slot$iv$iv3) & (-9187201950435737472L)) == (-9187201950435737472L)) goto L67;
        int bitCount$iv$iv2 = 8 - ((~(i$iv$iv2 - lastIndex$iv$iv2)) >>> 31);
        int j$iv$iv2 = 0;
    L55:
        if (j$iv$iv2 >= bitCount$iv$iv2) goto L64;
        long value$iv$iv$iv2 = slot$iv$iv3 & r26;
        if (value$iv$iv$iv2 >= 128) goto L59;
        int $i$f$isFull2 = 1;
    L60:
        if ($i$f$isFull2 == 0) goto L62;
        int index$iv$iv2 = (i$iv$iv2 << 3) + j$iv$iv2;
        Object r24 = k$iv2[index$iv$iv2];
        SharedElement element3 = (SharedElement) v$iv2[index$iv$iv2];
        element3.updateMatch();
    L62:
        slot$iv$iv3 = slot$iv$iv3 >> 8;
        j$iv$iv2 = j$iv$iv2 + 1;
        goto L55
    L59:
        $i$f$isFull2 = 0;
        goto L60
    L64:
        if (bitCount$iv$iv2 != 8) goto L71;
    L67:
        if (i$iv$iv2 == lastIndex$iv$iv2) goto L71;
        i$iv$iv2 = i$iv$iv2 + 1;
        this_$iv5 = this_$iv6;
    L71:
        observeIsAnimating();
        return;
    L17:
        slot$iv$iv$iv = slot$iv$iv$iv >> 8;
        j$iv$iv$iv = j$iv$iv$iv + 1;
        goto L7
    L11:
        r13 = false;
        goto L12
    L18:
        if (bitCount$iv$iv$iv == 8) goto L19;
    L23:
        isActive = false;
    L19:
        if (i$iv$iv$iv == lastIndex$iv$iv$iv) goto L23;
        i$iv$iv$iv = i$iv$iv$iv + 1;
        this_$iv = this_$iv2;
        $i$f$any = $i$f$any2;
        goto L4
    L21:
        r26 = 255;
        goto L23
    }

    static /* synthetic */ Modifier sharedBoundsImpl$default(SharedTransitionScopeImpl r12, Modifier r13, SharedTransitionScope.SharedContentState r14, Transition r15, Function1 r16, BoundsTransform r17, SharedTransitionScope.PlaceHolderSize r18, boolean r19, boolean r20, float r21, SharedTransitionScope.OverlayClip r22, int r23, Object r24) {
        if ((r23 & 16) == 0) goto L5;
        SharedTransitionScope.PlaceHolderSize r7 = SharedTransitionScope.PlaceHolderSize.Companion.getContentSize();
    L7:
        return r12.sharedBoundsImpl(r13, r14, r15, r16, r17, r7, r19, r20, r21, r22);
    L5:
        r7 = r18;
        goto L7
    }

    private final <T> Modifier sharedBoundsImpl(Modifier $this$sharedBoundsImpl, final SharedTransitionScope.SharedContentState sharedContentState, final Transition<T> r14, final Function1<? super T, Boolean> r15, final BoundsTransform boundsTransform, final SharedTransitionScope.PlaceHolderSize placeHolderSize, final boolean renderOnlyWhenVisible, final boolean renderInOverlayDuringTransition, final float zIndexInOverlay, final SharedTransitionScope.OverlayClip clipInOverlayDuringTransition) {
        return ComposedModifierKt.composed$default($this$sharedBoundsImpl, null, new C01841(sharedContentState, r14, r15, this, placeHolderSize, renderOnlyWhenVisible, clipInOverlayDuringTransition, zIndexInOverlay, renderInOverlayDuringTransition, boundsTransform), 1, null);
    }

    private final SharedElementInternalState rememberSharedElementState(SharedElement sharedElement, BoundsAnimation boundsAnimation, SharedTransitionScope.PlaceHolderSize placeHolderSize, boolean renderOnlyWhenVisible, SharedTransitionScope.SharedContentState sharedContentState, SharedTransitionScope.OverlayClip clipInOverlayDuringTransition, float zIndexInOverlay, boolean renderInOverlayDuringTransition, Composer $composer, int $changed) {
        ComposerKt.sourceInformationMarkerStart($composer, 2066772852, "C(rememberSharedElementState)P(6!1,2,4,5!1,7)*991@54957L511:SharedTransitionScope.kt#xbi5r1");
        if (ComposerKt.isTraceInProgress() == false) goto L6;
        ComposerKt.traceEventStart(2066772852, $changed, -1, "androidx.compose.animation.SharedTransitionScopeImpl.rememberSharedElementState (SharedTransitionScope.kt:991)");
    L6:
        ComposerKt.sourceInformationMarkerStart($composer, -663248987, "CC(remember):SharedTransitionScope.kt#9igjgp");
        Object it$iv = $composer.rememberedValue();
        if (it$iv != Composer.Companion.getEmpty()) goto L9;
        SharedTransitionScope.SharedContentState r7 = sharedContentState;
        Object value$iv = new SharedElementInternalState(sharedElement, boundsAnimation, placeHolderSize, renderOnlyWhenVisible, clipInOverlayDuringTransition, renderInOverlayDuringTransition, r7, zIndexInOverlay);
        $composer.updateRememberedValue(value$iv);
        it$iv = value$iv;
    L10:
        SharedElementInternalState it = (SharedElementInternalState) it$iv;
        ComposerKt.sourceInformationMarkerEnd($composer);
        r7.setInternalState$animation_release(it);
        it.setSharedElement(sharedElement);
        it.setRenderOnlyWhenVisible(renderOnlyWhenVisible);
        it.setBoundsAnimation(boundsAnimation);
        it.setPlaceHolderSize(placeHolderSize);
        it.setOverlayClip(clipInOverlayDuringTransition);
        it.setZIndex(zIndexInOverlay);
        it.setRenderInOverlayDuringTransition(renderInOverlayDuringTransition);
        it.setUserState(r7);
        if (ComposerKt.isTraceInProgress() == false) goto L13;
        ComposerKt.traceEventEnd();
    L13:
        ComposerKt.sourceInformationMarkerEnd($composer);
        return it;
    L9:
        r7 = sharedContentState;
        goto L10
    }

    public final LayoutCoordinates getRoot$animation_release() {
        LayoutCoordinates r0 = this.root;
        if (r0 == null) goto L5;
        return r0;
    L5:
        Intrinsics.throwUninitializedPropertyAccessException("root");
        return null;
    }

    public final void setRoot$animation_release(LayoutCoordinates r1) {
        this.root = r1;
    }

    public final LayoutCoordinates getLookaheadRoot$animation_release() {
        LayoutCoordinates r0 = this.nullableLookaheadRoot;
        if (r0 == null) goto L6;
        return r0;
    L6:
        throw new IllegalArgumentException("Error: Uninitialized LayoutCoordinates. Please make sure when using the SharedTransitionScope composable function, the modifier passed to the child content is being used, or use SharedTransitionLayout instead.".toString());
    }

    public final LayoutCoordinates getNullableLookaheadRoot$animation_release() {
        return this.nullableLookaheadRoot;
    }

    public final void setNullableLookaheadRoot$animation_release(LayoutCoordinates r1) {
        this.nullableLookaheadRoot = r1;
    }

    private final SharedElement sharedElementsFor(Object key) {
        SharedElement r0 = this.sharedElements.get(key);
        if (r0 != null) goto L6;
        SharedElement it = new SharedElement(key, this);
        this.sharedElements.set(key, it);
        return it;
    L6:
        return r0;
    }

    public final void drawInOverlay$animation_release(ContentDrawScope scope) {
        List $this$sortBy$iv = this.renderers;
        if ($this$sortBy$iv.size() <= 1) goto L5;
        CollectionsKt.sortWith($this$sortBy$iv, new SharedTransitionScopeImpl$drawInOverlay$$inlined$sortBy$1());
    L5:
        List $this$fastForEach$iv = this.renderers;
        int index$iv = 0;
        int r3 = $this$fastForEach$iv.size();
    L6:
        if (index$iv >= r3) goto L9;
        Object item$iv = $this$fastForEach$iv.get(index$iv);
        LayerRenderer it = (LayerRenderer) item$iv;
        it.drawInOverlay(scope);
        index$iv = index$iv + 1;
        goto L6
    }

    public final void onStateRemoved$animation_release(SharedElementInternalState sharedElementState) {
        SharedElement $this$onStateRemoved_u24lambda_u2410 = sharedElementState.getSharedElement();
        $this$onStateRemoved_u24lambda_u2410.removeState(sharedElementState);
        this.updateTransitionActiveness.invoke(this);
        $this$onStateRemoved_u24lambda_u2410.getScope().observeIsAnimating();
        this.renderers.remove(sharedElementState);
        if ($this$onStateRemoved_u24lambda_u2410.getStates().isEmpty() == false) goto L7;
        BuildersKt.launch$default($this$onStateRemoved_u24lambda_u2410.getScope().coroutineScope, null, null, new SharedTransitionScopeImpl$onStateRemoved$1$1($this$onStateRemoved_u24lambda_u2410, null), 3, null);
        return;
    }

    public final void onStateAdded$animation_release(SharedElementInternalState sharedElementState) {
        SharedElement $this$onStateAdded_u24lambda_u2412 = sharedElementState.getSharedElement();
        $this$onStateAdded_u24lambda_u2412.addState(sharedElementState);
        this.updateTransitionActiveness.invoke(this);
        $this$onStateAdded_u24lambda_u2412.getScope().observeIsAnimating();
        List $this$indexOfFirst$iv = this.renderers;
        int index$iv = 0;
        Iterator<LayerRenderer> r5 = $this$indexOfFirst$iv.iterator();
    L4:
        if (r5.hasNext() == false) goto L15;
        Object item$iv = r5.next();
        LayerRenderer it = (LayerRenderer) item$iv;
        SharedElement r11 = null;
        if ((it instanceof SharedElementInternalState) == false) goto L8;
        SharedElementInternalState r10 = (SharedElementInternalState) it;
    L9:
        if (r10 == null) goto L12;
        r11 = r10.getSharedElement();
    L12:
        if (Intrinsics.areEqual(r11, sharedElementState.getSharedElement()) == true) goto L17;
        index$iv = index$iv + 1;
    L17:
        if (index$iv == (this.renderers.size() - 1)) goto L21;
        if (index$iv == (-1)) goto L21;
        this.renderers.add(index$iv + 1, sharedElementState);
        return;
    L21:
        this.renderers.add(sharedElementState);
        return;
    L8:
        r10 = null;
        goto L9
    L15:
        index$iv = -1;
        goto L17
    }

    public final void onLayerRendererCreated$animation_release(LayerRenderer renderer) {
        this.renderers.add(renderer);
    }

    public final void onLayerRendererRemoved$animation_release(LayerRenderer renderer) {
        this.renderers.remove(renderer);
    }

    public final void onDispose$animation_release() {
        Companion.access$getSharedTransitionObserver(Companion).clear(this);
        this.disposed = true;
    }

    public final SnapshotStateObserver getObserverForTest$animation_release() {
        return Companion.access$getSharedTransitionObserver(Companion);
    }

    private final void observeIsAnimating() {
        if (this.disposed == true) goto L6;
        Companion.access$getSharedTransitionObserver(Companion).observeReads(this, this.updateTransitionActiveness, this.observeAnimatingBlock);
        return;
    }

    public final void observeReads$animation_release(SharedElement scope, Function1<? super SharedElement, Unit> r3, Function0<Unit> r4) {
        if (this.disposed == true) goto L6;
        Companion.access$getSharedTransitionObserver(Companion).observeReads(scope, r3, r4);
        return;
    }

    public final void clearObservation$animation_release(Object scope) {
        Companion.access$getSharedTransitionObserver(Companion).clear(scope);
    }
}
