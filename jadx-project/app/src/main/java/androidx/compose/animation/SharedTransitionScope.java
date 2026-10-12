package androidx.compose.animation;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.LookaheadScope;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: SharedTransitionScope.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0086\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\bg\u0018\u00002\u00020\u0001:\u0004\u0005234J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH&J\u0015\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH'¢\u0006\u0002\u0010\rJ\u001c\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u0013H\u0017J\u001c\u0010\u0014\u001a\u00020\u00152\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u0013H\u0017JD\u0010\u0016\u001a\u00020\u0017*\u00020\u00172\u000e\b\u0002\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00030\u00192\b\b\u0002\u0010\u001a\u001a\u00020\u001b2\u001c\b\u0002\u0010\u001c\u001a\u0016\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u001f\u0012\u0006\u0012\u0004\u0018\u00010 0\u001dH&Jl\u0010!\u001a\u00020\u0017*\u00020\u00172\u0006\u0010\"\u001a\u00020\n2\u0006\u0010#\u001a\u00020$2\b\b\u0002\u0010%\u001a\u00020\u000f2\b\b\u0002\u0010&\u001a\u00020\u00152\b\b\u0002\u0010'\u001a\u00020(2\b\b\u0002\u0010)\u001a\u00020*2\b\b\u0002\u0010+\u001a\u00020,2\b\b\u0002\u0010-\u001a\u00020\u00032\b\b\u0002\u0010\u001a\u001a\u00020\u001b2\b\b\u0002\u0010\u001c\u001a\u00020\u0006H&JN\u0010.\u001a\u00020\u0017*\u00020\u00172\u0006\u0010\"\u001a\u00020\n2\u0006\u0010#\u001a\u00020$2\b\b\u0002\u0010'\u001a\u00020(2\b\b\u0002\u0010+\u001a\u00020,2\b\b\u0002\u0010-\u001a\u00020\u00032\b\b\u0002\u0010\u001a\u001a\u00020\u001b2\b\b\u0002\u0010\u001c\u001a\u00020\u0006H&JN\u0010/\u001a\u00020\u0017*\u00020\u00172\u0006\u0010\"\u001a\u00020\n2\u0006\u00100\u001a\u00020\u00032\b\b\u0002\u0010'\u001a\u00020(2\b\b\u0002\u0010+\u001a\u00020,2\b\b\u0002\u0010-\u001a\u00020\u00032\b\b\u0002\u0010\u001a\u001a\u00020\u001b2\b\b\u0002\u0010\u001c\u001a\u00020\u0006H&J\f\u00101\u001a\u00020\u0017*\u00020\u0017H&R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u0004ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u00065À\u0006\u0001"}, d2 = {"Landroidx/compose/animation/SharedTransitionScope;", "Landroidx/compose/ui/layout/LookaheadScope;", "isTransitionActive", "", "()Z", "OverlayClip", "Landroidx/compose/animation/SharedTransitionScope$OverlayClip;", "clipShape", "Landroidx/compose/ui/graphics/Shape;", "rememberSharedContentState", "Landroidx/compose/animation/SharedTransitionScope$SharedContentState;", "key", "", "(Ljava/lang/Object;Landroidx/compose/runtime/Composer;I)Landroidx/compose/animation/SharedTransitionScope$SharedContentState;", "scaleInSharedContentToBounds", "Landroidx/compose/animation/EnterTransition;", "contentScale", "Landroidx/compose/ui/layout/ContentScale;", "alignment", "Landroidx/compose/ui/Alignment;", "scaleOutSharedContentToBounds", "Landroidx/compose/animation/ExitTransition;", "renderInSharedTransitionScopeOverlay", "Landroidx/compose/ui/Modifier;", "renderInOverlay", "Lkotlin/Function0;", "zIndexInOverlay", "", "clipInOverlayDuringTransition", "Lkotlin/Function2;", "Landroidx/compose/ui/unit/LayoutDirection;", "Landroidx/compose/ui/unit/Density;", "Landroidx/compose/ui/graphics/Path;", "sharedBounds", "sharedContentState", "animatedVisibilityScope", "Landroidx/compose/animation/AnimatedVisibilityScope;", "enter", "exit", "boundsTransform", "Landroidx/compose/animation/BoundsTransform;", "resizeMode", "Landroidx/compose/animation/SharedTransitionScope$ResizeMode;", "placeHolderSize", "Landroidx/compose/animation/SharedTransitionScope$PlaceHolderSize;", "renderInOverlayDuringTransition", "sharedElement", "sharedElementWithCallerManagedVisibility", "visible", "skipToLookaheadSize", "PlaceHolderSize", "ResizeMode", "SharedContentState", "animation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public interface SharedTransitionScope extends LookaheadScope {

    /* JADX INFO: compiled from: SharedTransitionScope.kt */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J*\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\fÀ\u0006\u0001"}, d2 = {"Landroidx/compose/animation/SharedTransitionScope$OverlayClip;", "", "getClipPath", "Landroidx/compose/ui/graphics/Path;", "sharedContentState", "Landroidx/compose/animation/SharedTransitionScope$SharedContentState;", "bounds", "Landroidx/compose/ui/geometry/Rect;", "layoutDirection", "Landroidx/compose/ui/unit/LayoutDirection;", "density", "Landroidx/compose/ui/unit/Density;", "animation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface OverlayClip {
        Path getClipPath(SharedContentState r1, Rect r2, LayoutDirection r3, Density r4);
    }

    /* JADX INFO: compiled from: SharedTransitionScope.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bæ\u0080\u0001\u0018\u0000 \b2\u00020\u0001:\u0001\bJ\"\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0003H&ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007ø\u0001\u0001\u0082\u0002\r\n\u0005\b¡\u001e0\u0001\n\u0004\b!0\u0001¨\u0006\tÀ\u0006\u0001"}, d2 = {"Landroidx/compose/animation/SharedTransitionScope$PlaceHolderSize;", "", "calculateSize", "Landroidx/compose/ui/unit/IntSize;", "contentSize", "animatedSize", "calculateSize-JyjRU_E", "(JJ)J", "Companion", "animation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface PlaceHolderSize {
        public static final Companion Companion = null;

        /* JADX INFO: compiled from: SharedTransitionScope.kt */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0011\u0010\u0007\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0006¨\u0006\t"}, d2 = {"Landroidx/compose/animation/SharedTransitionScope$PlaceHolderSize$Companion;", "", "()V", "animatedSize", "Landroidx/compose/animation/SharedTransitionScope$PlaceHolderSize;", "getAnimatedSize", "()Landroidx/compose/animation/SharedTransitionScope$PlaceHolderSize;", "contentSize", "getContentSize", "animation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class Companion {
            static final /* synthetic */ Companion $$INSTANCE = null;
            private static final PlaceHolderSize animatedSize = null;
            private static final PlaceHolderSize contentSize = null;

            private Companion() {
            }

            static {
                $$INSTANCE = new Companion();
                animatedSize = SharedTransitionScope$PlaceHolderSize$Companion$animatedSize$1.INSTANCE;
                contentSize = SharedTransitionScope$PlaceHolderSize$Companion$contentSize$1.INSTANCE;
            }

            public final PlaceHolderSize getAnimatedSize() {
                return animatedSize;
            }

            public final PlaceHolderSize getContentSize() {
                return contentSize;
            }
        }

        static {
            Companion = Companion.$$INSTANCE;
        }

        /* JADX INFO: renamed from: calculateSize-JyjRU_E, reason: not valid java name */
        long mo107calculateSizeJyjRU_E(long r1, long r3);
    }

    /* JADX INFO: compiled from: SharedTransitionScope.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002\u0082\u0001\u0002\u0003\u0004ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0005À\u0006\u0001"}, d2 = {"Landroidx/compose/animation/SharedTransitionScope$ResizeMode;", "", "Companion", "Landroidx/compose/animation/RemeasureImpl;", "Landroidx/compose/animation/ScaleToBoundsImpl;", "animation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface ResizeMode {
        public static final Companion Companion = null;

        /* JADX INFO: compiled from: SharedTransitionScope.kt */
        @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001a\u0010\u0007\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000bR\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\f"}, d2 = {"Landroidx/compose/animation/SharedTransitionScope$ResizeMode$Companion;", "", "()V", "RemeasureToBounds", "Landroidx/compose/animation/SharedTransitionScope$ResizeMode;", "getRemeasureToBounds", "()Landroidx/compose/animation/SharedTransitionScope$ResizeMode;", "ScaleToBounds", "contentScale", "Landroidx/compose/ui/layout/ContentScale;", "alignment", "Landroidx/compose/ui/Alignment;", "animation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class Companion {
            static final /* synthetic */ Companion $$INSTANCE = null;
            private static final ResizeMode RemeasureToBounds = null;

            private Companion() {
            }

            static {
                $$INSTANCE = new Companion();
                RemeasureToBounds = RemeasureImpl.INSTANCE;
            }

            public final ResizeMode getRemeasureToBounds() {
                return RemeasureToBounds;
            }

            public static /* synthetic */ ResizeMode ScaleToBounds$default(Companion r0, ContentScale r1, Alignment r2, int r3, Object r4) {
                if ((r3 & 1) == 0) goto L6;
                r1 = ContentScale.Companion.getFillWidth();
            L6:
                if ((r3 & 2) == 0) goto L9;
                r2 = Alignment.Companion.getCenter();
            L9:
                return r0.ScaleToBounds(r1, r2);
            }

            public final ResizeMode ScaleToBounds(ContentScale contentScale, Alignment alignment) {
                return SharedTransitionScopeKt.access$ScaleToBoundsCached(contentScale, alignment);
            }
        }

        static {
            Companion = Companion.$$INSTANCE;
        }
    }

    /* JADX INFO: compiled from: SharedTransitionScope.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0002\u0010\u0003R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u00058F¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R/\u0010\n\u001a\u0004\u0018\u00010\t2\b\u0010\b\u001a\u0004\u0018\u00010\t8@@@X\u0080\u008e\u0002¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u0011\u0010\u0011\u001a\u00020\u00128F¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0013R\u0011\u0010\u0002\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0016\u001a\u00020\t8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\fR\u0013\u0010\u0018\u001a\u0004\u0018\u00010\u00008F¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"Landroidx/compose/animation/SharedTransitionScope$SharedContentState;", "", "key", "(Ljava/lang/Object;)V", "clipPathInOverlay", "Landroidx/compose/ui/graphics/Path;", "getClipPathInOverlay", "()Landroidx/compose/ui/graphics/Path;", "<set-?>", "Landroidx/compose/animation/SharedElementInternalState;", "internalState", "getInternalState$animation_release", "()Landroidx/compose/animation/SharedElementInternalState;", "setInternalState$animation_release", "(Landroidx/compose/animation/SharedElementInternalState;)V", "internalState$delegate", "Landroidx/compose/runtime/MutableState;", "isMatchFound", "", "()Z", "getKey", "()Ljava/lang/Object;", "nonNullInternalState", "getNonNullInternalState", "parentSharedContentState", "getParentSharedContentState", "()Landroidx/compose/animation/SharedTransitionScope$SharedContentState;", "animation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class SharedContentState {
        public static final int $stable = 0;
        private final MutableState internalState$delegate;
        private final Object key;

        static {
            $stable = 8;
        }

        public SharedContentState(Object key) {
            this.key = key;
            this.internalState$delegate = SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
        }

        public final Object getKey() {
            return this.key;
        }

        public final boolean isMatchFound() {
            SharedElementInternalState r0 = getInternalState$animation_release();
            if (r0 == null) goto L7;
            SharedElement r1 = r0.getSharedElement();
            if (r1 == null) goto L7;
            return r1.getFoundMatch();
        L7:
            return false;
        }

        public final Path getClipPathInOverlay() {
            return getNonNullInternalState().getClipPathInOverlay$animation_release();
        }

        public final SharedContentState getParentSharedContentState() {
            SharedElementInternalState r0 = getNonNullInternalState().getParentState();
            if (r0 != null) goto L7;
            return null;
        L7:
            return r0.getUserState();
        }

        public final SharedElementInternalState getInternalState$animation_release() {
            State $this$getValue$iv = this.internalState$delegate;
            return (SharedElementInternalState) $this$getValue$iv.getValue();
        }

        public final void setInternalState$animation_release(SharedElementInternalState r4) {
            MutableState $this$setValue$iv = this.internalState$delegate;
            $this$setValue$iv.setValue(r4);
        }

        private final SharedElementInternalState getNonNullInternalState() {
            SharedElementInternalState r0 = getInternalState$animation_release();
            if (r0 == null) goto L6;
            return r0;
        L6:
            throw new IllegalArgumentException("Error: SharedContentState has not been added to a sharedElement/sharedBoundsmodifier yet. Therefore the internal state has not bee initialized.".toString());
        }
    }

    OverlayClip OverlayClip(Shape r1);

    boolean isTransitionActive();

    SharedContentState rememberSharedContentState(Object r1, Composer r2, int r3);

    Modifier renderInSharedTransitionScopeOverlay(Modifier r1, Function0<Boolean> r2, float r3, Function2<? super LayoutDirection, ? super Density, ? extends Path> r4);

    Modifier sharedBounds(Modifier r1, SharedContentState r2, AnimatedVisibilityScope r3, EnterTransition r4, ExitTransition r5, BoundsTransform r6, ResizeMode r7, PlaceHolderSize r8, boolean r9, float r10, OverlayClip r11);

    Modifier sharedElement(Modifier r1, SharedContentState r2, AnimatedVisibilityScope r3, BoundsTransform r4, PlaceHolderSize r5, boolean r6, float r7, OverlayClip r8);

    Modifier sharedElementWithCallerManagedVisibility(Modifier r1, SharedContentState r2, boolean r3, BoundsTransform r4, PlaceHolderSize r5, boolean r6, float r7, OverlayClip r8);

    Modifier skipToLookaheadSize(Modifier r1);

    static /* synthetic */ EnterTransition scaleInSharedContentToBounds$default(SharedTransitionScope r0, ContentScale r1, Alignment r2, int r3, Object r4) {
        if (r4 != null) goto L12;
        if ((r3 & 1) == 0) goto L7;
        r1 = ContentScale.Companion.getFit();
    L7:
        if ((r3 & 2) == 0) goto L10;
        r2 = Alignment.Companion.getCenter();
    L10:
        return r0.scaleInSharedContentToBounds(r1, r2);
    L12:
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: scaleInSharedContentToBounds");
    }

    @Deprecated(message = "This EnterTransition has been deprecated. Please replace the usage with resizeMode = ScaleToBounds(...) in sharedBounds to achieve the scale-to-bounds effect.")
    default EnterTransition scaleInSharedContentToBounds(ContentScale contentScale, Alignment alignment) {
        return EnterExitTransitionKt.withEffect(EnterTransition.Companion.getNone(), new ContentScaleTransitionEffect(contentScale, alignment));
    }

    static /* synthetic */ ExitTransition scaleOutSharedContentToBounds$default(SharedTransitionScope r0, ContentScale r1, Alignment r2, int r3, Object r4) {
        if (r4 != null) goto L12;
        if ((r3 & 1) == 0) goto L7;
        r1 = ContentScale.Companion.getFit();
    L7:
        if ((r3 & 2) == 0) goto L10;
        r2 = Alignment.Companion.getCenter();
    L10:
        return r0.scaleOutSharedContentToBounds(r1, r2);
    L12:
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: scaleOutSharedContentToBounds");
    }

    @Deprecated(message = "This ExitTransition has been deprecated.  Please replace the usage with resizeMode = ScaleToBounds(...) in sharedBounds to achieve the scale-to-bounds effect.")
    default ExitTransition scaleOutSharedContentToBounds(ContentScale contentScale, Alignment alignment) {
        return EnterExitTransitionKt.withEffect(ExitTransition.Companion.getNone(), new ContentScaleTransitionEffect(contentScale, alignment));
    }

    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ Modifier renderInSharedTransitionScopeOverlay$default(final SharedTransitionScope r0, Modifier r1, Function0 r2, float r3, Function2 r4, int r5, Object r6) {
        if (r6 != null) goto L15;
        if ((r5 & 1) == 0) goto L7;
        r2 = new AnonymousClass1(r0);
    L7:
        if ((r5 & 2) == 0) goto L10;
        r3 = 0.0f;
    L10:
        if ((r5 & 4) == 0) goto L13;
        r4 = SharedTransitionScopeKt.access$getDefaultClipInOverlayDuringTransition$p();
    L13:
        return r0.renderInSharedTransitionScopeOverlay(r1, r2, r3, r4);
    L15:
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: renderInSharedTransitionScopeOverlay");
    }

    static /* synthetic */ Modifier sharedElement$default(SharedTransitionScope r9, Modifier r10, SharedContentState r11, AnimatedVisibilityScope r12, BoundsTransform r13, PlaceHolderSize r14, boolean r15, float r16, OverlayClip r17, int r18, Object r19) {
        if (r19 != null) goto L26;
        if ((r18 & 4) == 0) goto L6;
        BoundsTransform r4 = SharedTransitionScopeKt.access$getDefaultBoundsTransform$p();
    L8:
        if ((r18 & 8) == 0) goto L10;
        PlaceHolderSize r5 = PlaceHolderSize.Companion.getContentSize();
    L12:
        if ((r18 & 16) == 0) goto L14;
        boolean r6 = true;
    L16:
        if ((r18 & 32) == 0) goto L18;
        float r7 = 0.0f;
    L20:
        if ((r18 & 64) == 0) goto L22;
        OverlayClip r8 = SharedTransitionScopeKt.access$getParentClip$p();
    L24:
        return r9.sharedElement(r10, r11, r12, r4, r5, r6, r7, r8);
    L22:
        r8 = r17;
        goto L24
    L18:
        r7 = r16;
        goto L20
    L14:
        r6 = r15;
        goto L16
    L10:
        r5 = r14;
        goto L12
    L6:
        r4 = r13;
        goto L8
    L26:
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: sharedElement");
    }

    static /* synthetic */ Modifier sharedBounds$default(SharedTransitionScope r17, Modifier r18, SharedContentState r19, AnimatedVisibilityScope r20, EnterTransition r21, ExitTransition r22, BoundsTransform r23, ResizeMode r24, PlaceHolderSize r25, boolean r26, float r27, OverlayClip r28, int r29, Object r30) {
        if (r30 != null) goto L39;
        if ((r29 & 4) == 0) goto L7;
        EnterTransition r9 = EnterExitTransitionKt.fadeIn$default(null, 0.0f, 3, null);
    L9:
        if ((r29 & 8) == 0) goto L11;
        ExitTransition r10 = EnterExitTransitionKt.fadeOut$default(null, 0.0f, 3, null);
    L13:
        if ((r29 & 16) == 0) goto L15;
        BoundsTransform r11 = SharedTransitionScopeKt.access$getDefaultBoundsTransform$p();
    L17:
        if ((r29 & 32) == 0) goto L19;
        ResizeMode r12 = ResizeMode.Companion.ScaleToBounds(ContentScale.Companion.getFillWidth(), Alignment.Companion.getCenter());
    L21:
        if ((r29 & 64) == 0) goto L23;
        PlaceHolderSize r13 = PlaceHolderSize.Companion.getContentSize();
    L25:
        if ((r29 & 128) == 0) goto L27;
        boolean r14 = true;
    L29:
        if ((r29 & 256) == 0) goto L31;
        float r15 = 0.0f;
    L33:
        if ((r29 & 512) == 0) goto L35;
        OverlayClip r16 = SharedTransitionScopeKt.access$getParentClip$p();
    L37:
        return r17.sharedBounds(r18, r19, r20, r9, r10, r11, r12, r13, r14, r15, r16);
    L35:
        r16 = r28;
        goto L37
    L31:
        r15 = r27;
        goto L33
    L27:
        r14 = r26;
        goto L29
    L23:
        r13 = r25;
        goto L25
    L19:
        r12 = r24;
        goto L21
    L15:
        r11 = r23;
        goto L17
    L11:
        r10 = r22;
        goto L13
    L7:
        r9 = r21;
        goto L9
    L39:
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: sharedBounds");
    }

    static /* synthetic */ Modifier sharedElementWithCallerManagedVisibility$default(SharedTransitionScope r9, Modifier r10, SharedContentState r11, boolean r12, BoundsTransform r13, PlaceHolderSize r14, boolean r15, float r16, OverlayClip r17, int r18, Object r19) {
        if (r19 != null) goto L26;
        if ((r18 & 4) == 0) goto L6;
        BoundsTransform r4 = SharedTransitionScopeKt.access$getDefaultBoundsTransform$p();
    L8:
        if ((r18 & 8) == 0) goto L10;
        PlaceHolderSize r5 = PlaceHolderSize.Companion.getContentSize();
    L12:
        if ((r18 & 16) == 0) goto L14;
        boolean r6 = true;
    L16:
        if ((r18 & 32) == 0) goto L18;
        float r7 = 0.0f;
    L20:
        if ((r18 & 64) == 0) goto L22;
        OverlayClip r8 = SharedTransitionScopeKt.access$getParentClip$p();
    L24:
        return r9.sharedElementWithCallerManagedVisibility(r10, r11, r12, r4, r5, r6, r7, r8);
    L22:
        r8 = r17;
        goto L24
    L18:
        r7 = r16;
        goto L20
    L14:
        r6 = r15;
        goto L16
    L10:
        r5 = r14;
        goto L12
    L6:
        r4 = r13;
        goto L8
    L26:
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: sharedElementWithCallerManagedVisibility");
    }
}
