package androidx.compose.material;

import androidx.compose.animation.core.AnimateAsStateKt;
import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.TweenSpec;
import androidx.compose.foundation.CanvasKt;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.layout.BoxWithConstraintsKt;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.State;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.saveable.RememberSaveableKt;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.input.nestedscroll.NestedScrollConnection;
import androidx.compose.ui.input.nestedscroll.NestedScrollSource;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.Velocity;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import androidx.profileinstaller.ProfileVerifier;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: Drawer.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0084\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0093\u0001\u0010\t\u001a\u00020\n2\u001c\u0010\u000b\u001a\u0018\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\n0\f¢\u0006\u0002\b\u000e¢\u0006\u0002\b\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u00132\b\b\u0002\u0010\u0014\u001a\u00020\u00152\b\b\u0002\u0010\u0016\u001a\u00020\u00172\b\b\u0002\u0010\u0018\u001a\u00020\u00052\b\b\u0002\u0010\u0019\u001a\u00020\u001a2\b\b\u0002\u0010\u001b\u001a\u00020\u001a2\b\b\u0002\u0010\u001c\u001a\u00020\u001a2\u0011\u0010\u001d\u001a\r\u0012\u0004\u0012\u00020\n0\u001e¢\u0006\u0002\b\u000eH\u0007ø\u0001\u0000¢\u0006\u0004\b\u001f\u0010 \u001a0\u0010!\u001a\u00020\n2\u0006\u0010\"\u001a\u00020\u001a2\f\u0010#\u001a\b\u0012\u0004\u0012\u00020\n0\u001e2\u0006\u0010$\u001a\u00020\u0015H\u0003ø\u0001\u0000¢\u0006\u0004\b%\u0010&\u001a\u0014\u0010'\u001a\u00020(2\n\u0010)\u001a\u0006\u0012\u0002\b\u00030*H\u0002\u001a\u0093\u0001\u0010+\u001a\u00020\n2\u001c\u0010\u000b\u001a\u0018\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\n0\f¢\u0006\u0002\b\u000e¢\u0006\u0002\b\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020,2\b\b\u0002\u0010\u0014\u001a\u00020\u00152\b\b\u0002\u0010\u0016\u001a\u00020\u00172\b\b\u0002\u0010\u0018\u001a\u00020\u00052\b\b\u0002\u0010\u0019\u001a\u00020\u001a2\b\b\u0002\u0010\u001b\u001a\u00020\u001a2\b\b\u0002\u0010\u001c\u001a\u00020\u001a2\u0011\u0010\u001d\u001a\r\u0012\u0004\u0012\u00020\n0\u001e¢\u0006\u0002\b\u000eH\u0007ø\u0001\u0000¢\u0006\u0004\b-\u0010.\u001a>\u0010/\u001a\u00020\n2\u0006\u00100\u001a\u00020\u00152\f\u00101\u001a\b\u0012\u0004\u0012\u00020\n0\u001e2\f\u00102\u001a\b\u0012\u0004\u0012\u00020\u00020\u001e2\u0006\u0010\"\u001a\u00020\u001aH\u0003ø\u0001\u0000¢\u0006\u0004\b3\u00104\u001a \u00105\u001a\u00020\u00022\u0006\u00106\u001a\u00020\u00022\u0006\u00107\u001a\u00020\u00022\u0006\u00108\u001a\u00020\u0002H\u0002\u001a;\u00109\u001a\u00020\u00132\u0006\u0010:\u001a\u00020;2\u0014\b\u0002\u0010<\u001a\u000e\u0012\u0004\u0012\u00020;\u0012\u0004\u0012\u00020\u00150\f2\u000e\b\u0002\u0010=\u001a\b\u0012\u0004\u0012\u00020\u00020>H\u0007¢\u0006\u0002\u0010?\u001a+\u0010@\u001a\u00020,2\u0006\u0010:\u001a\u00020A2\u0014\b\u0002\u0010<\u001a\u000e\u0012\u0004\u0012\u00020A\u0012\u0004\u0012\u00020\u00150\fH\u0007¢\u0006\u0002\u0010B\"\u0014\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\u0003\u001a\u00020\u0002X\u0082T¢\u0006\u0002\n\u0000\"\u0010\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0006\"\u0010\u0010\u0007\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0006\"\u0010\u0010\b\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0006\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006C²\u0006\n\u0010D\u001a\u00020\u0002X\u008a\u0084\u0002"}, d2 = {"AnimationSpec", "Landroidx/compose/animation/core/TweenSpec;", "", "BottomDrawerOpenFraction", "DrawerPositionalThreshold", "Landroidx/compose/ui/unit/Dp;", "F", "DrawerVelocityThreshold", "EndDrawerPadding", "BottomDrawer", "", "drawerContent", "Lkotlin/Function1;", "Landroidx/compose/foundation/layout/ColumnScope;", "Landroidx/compose/runtime/Composable;", "Lkotlin/ExtensionFunctionType;", "modifier", "Landroidx/compose/ui/Modifier;", "drawerState", "Landroidx/compose/material/BottomDrawerState;", "gesturesEnabled", "", "drawerShape", "Landroidx/compose/ui/graphics/Shape;", "drawerElevation", "drawerBackgroundColor", "Landroidx/compose/ui/graphics/Color;", "drawerContentColor", "scrimColor", "content", "Lkotlin/Function0;", "BottomDrawer-Gs3lGvM", "(Lkotlin/jvm/functions/Function3;Landroidx/compose/ui/Modifier;Landroidx/compose/material/BottomDrawerState;ZLandroidx/compose/ui/graphics/Shape;FJJJLkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "BottomDrawerScrim", "color", "onDismiss", "visible", "BottomDrawerScrim-3J-VO9M", "(JLkotlin/jvm/functions/Function0;ZLandroidx/compose/runtime/Composer;I)V", "ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection", "Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;", "state", "Landroidx/compose/material/AnchoredDraggableState;", "ModalDrawer", "Landroidx/compose/material/DrawerState;", "ModalDrawer-Gs3lGvM", "(Lkotlin/jvm/functions/Function3;Landroidx/compose/ui/Modifier;Landroidx/compose/material/DrawerState;ZLandroidx/compose/ui/graphics/Shape;FJJJLkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "Scrim", "open", "onClose", "fraction", "Scrim-Bx497Mc", "(ZLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;JLandroidx/compose/runtime/Composer;I)V", "calculateFraction", "a", "b", "pos", "rememberBottomDrawerState", "initialValue", "Landroidx/compose/material/BottomDrawerValue;", "confirmStateChange", "animationSpec", "Landroidx/compose/animation/core/AnimationSpec;", "(Landroidx/compose/material/BottomDrawerValue;Lkotlin/jvm/functions/Function1;Landroidx/compose/animation/core/AnimationSpec;Landroidx/compose/runtime/Composer;II)Landroidx/compose/material/BottomDrawerState;", "rememberDrawerState", "Landroidx/compose/material/DrawerValue;", "(Landroidx/compose/material/DrawerValue;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)Landroidx/compose/material/DrawerState;", "material_release", "alpha"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class DrawerKt {
    private static final TweenSpec<Float> AnimationSpec = null;
    private static final float BottomDrawerOpenFraction = 0.5f;
    private static final float DrawerPositionalThreshold = 0.0f;
    private static final float DrawerVelocityThreshold = 0.0f;
    private static final float EndDrawerPadding = 0.0f;

    /* JADX INFO: renamed from: androidx.compose.material.DrawerKt$ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection$1, reason: invalid class name */
    /* JADX INFO: compiled from: Drawer.kt */
    @Metadata(d1 = {"\u00001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0007\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J#\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007H\u0096@ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000bJ*\u0010\f\u001a\u00020\r2\u0006\u0010\b\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011J\u001b\u0010\u0012\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0014J\"\u0010\u0015\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016ø\u0001\u0000¢\u0006\u0004\b\u0016\u0010\u0017J\u0013\u0010\u0018\u001a\u00020\u0019*\u00020\rH\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0013\u0010\u0018\u001a\u00020\u0019*\u00020\u0007H\u0003¢\u0006\u0004\b\u001c\u0010\u001bJ\u0017\u0010\u001d\u001a\u00020\r*\u00020\u0019H\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0002\u0010\u001eR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u0005\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u001f"}, d2 = {"androidx/compose/material/DrawerKt$ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection$1", "Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;", "orientation", "Landroidx/compose/foundation/gestures/Orientation;", "getOrientation", "()Landroidx/compose/foundation/gestures/Orientation;", "onPostFling", "Landroidx/compose/ui/unit/Velocity;", "consumed", "available", "onPostFling-RZ2iAVY", "(JJLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "onPostScroll", "Landroidx/compose/ui/geometry/Offset;", "source", "Landroidx/compose/ui/input/nestedscroll/NestedScrollSource;", "onPostScroll-DzOQY0M", "(JJI)J", "onPreFling", "onPreFling-QWom1Mo", "(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "onPreScroll", "onPreScroll-OzD1aCk", "(JI)J", "toFloat", "", "offsetToFloat", "(J)F", "velocityToFloat", "toOffset", "(F)J", "material_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class AnonymousClass1 implements NestedScrollConnection {
        final /* synthetic */ AnchoredDraggableState<?> $state;
        private final Orientation orientation;

        AnonymousClass1(AnchoredDraggableState<?> r2) {
            this.$state = r2;
            this.orientation = Orientation.Vertical;
        }

        public final Orientation getOrientation() {
            return this.orientation;
        }

        @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
        /* JADX INFO: renamed from: onPreScroll-OzD1aCk */
        public long mo803onPreScrollOzD1aCk(long available, int source) {
            float delta = offsetToFloat(available);
            if (delta >= 0.0f) goto L8;
            if (NestedScrollSource.m5470equalsimpl0(source, NestedScrollSource.Companion.m5482getUserInputWNlRxjI()) == false) goto L8;
            return toOffset(this.$state.dispatchRawDelta(delta));
        L8:
            return Offset.Companion.m4141getZeroF1C5BW0();
        }

        @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
        /* JADX INFO: renamed from: onPostScroll-DzOQY0M */
        public long mo497onPostScrollDzOQY0M(long consumed, long available, int source) {
            if (NestedScrollSource.m5470equalsimpl0(source, NestedScrollSource.Companion.m5482getUserInputWNlRxjI()) == false) goto L6;
            return toOffset(this.$state.dispatchRawDelta(offsetToFloat(available)));
        L6:
            return Offset.Companion.m4141getZeroF1C5BW0();
        }

        @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
        /* JADX INFO: renamed from: onPreFling-QWom1Mo */
        public Object mo802onPreFlingQWom1Mo(long available, Continuation<? super Velocity> r10) {
            if ((r10 instanceof DrawerKt$ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection$1$onPreFling$1) == false) goto L7;
            DrawerKt$ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection$1$onPreFling$1 r0 = (DrawerKt$ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection$1$onPreFling$1) r10;
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
            available = r0.J$0;
            ResultKt.throwOnFailure($result);
        L23:
            return Velocity.m7202boximpl(available);
        L13:
            ResultKt.throwOnFailure($result);
            float toFling = velocityToFloat(available);
            float currentOffset = this.$state.requireOffset();
            if (toFling < 0.0f) goto L16;
        L21:
            available = Velocity.Companion.m7222getZero9UxMQ8M();
            goto L23
        L16:
            if (currentOffset <= this.$state.getAnchors().minAnchor()) goto L21;
            AnchoredDraggableState<?> r5 = this.$state;
            r0.J$0 = available;
            r0.label = 1;
            if (r5.settle(toFling, r0) != r2) goto L23;
            return r2;
        L11:
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        L7:
            r0 = new DrawerKt$ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection$1$onPreFling$1(this, r10);
            goto L8
        }

        @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
        /* JADX INFO: renamed from: onPostFling-RZ2iAVY */
        public Object mo496onPostFlingRZ2iAVY(long r6, long available, Continuation<? super Velocity> r10) {
            if ((r10 instanceof DrawerKt$ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection$1$onPostFling$1) == false) goto L7;
            DrawerKt$ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection$1$onPostFling$1 r7 = (DrawerKt$ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection$1$onPostFling$1) r10;
            if ((r7.label & Integer.MIN_VALUE) == 0) goto L7;
            r7.label -= Integer.MIN_VALUE;
        L8:
            Object $result = r7.result;
            Object r0 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            switch(r7.label) {
                case 0: goto L13;
                case 1: goto L12;
                default: goto L11;
            };
        L12:
            available = r7.J$0;
            ResultKt.throwOnFailure($result);
        L17:
            return Velocity.m7202boximpl(available);
        L13:
            ResultKt.throwOnFailure($result);
            AnchoredDraggableState<?> r2 = this.$state;
            float r3 = velocityToFloat(available);
            r7.J$0 = available;
            r7.label = 1;
            if (r2.settle(r3, r7) != r0) goto L17;
            return r0;
        L11:
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        L7:
            r7 = new DrawerKt$ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection$1$onPostFling$1(this, r10);
            goto L8
        }

        private final long toOffset(float $this$toOffset) {
            float r2 = 0.0f;
            if (this.orientation != Orientation.Horizontal) goto L5;
            float r0 = $this$toOffset;
        L7:
            if (this.orientation != Orientation.Vertical) goto L10;
            r2 = $this$toOffset;
        L10:
            return OffsetKt.Offset(r0, r2);
        L5:
            r0 = 0.0f;
            goto L7
        }

        private final float velocityToFloat(long $this$toFloat) {
            if (this.orientation != Orientation.Horizontal) goto L6;
            return Velocity.m7211getXimpl($this$toFloat);
        L6:
            return Velocity.m7212getYimpl($this$toFloat);
        }

        private final float offsetToFloat(long $this$toFloat) {
            if (this.orientation != Orientation.Horizontal) goto L6;
            return Offset.m4125getXimpl($this$toFloat);
        L6:
            return Offset.m4126getYimpl($this$toFloat);
        }
    }

    /* JADX INFO: renamed from: access$BottomDrawerScrim-3J-VO9M, reason: not valid java name */
    public static final /* synthetic */ void m1651access$BottomDrawerScrim3JVO9M(long color, Function0 onDismiss, boolean visible, Composer $composer, int $changed) {
        m1648BottomDrawerScrim3JVO9M(color, onDismiss, visible, $composer, $changed);
    }

    public static final /* synthetic */ float access$BottomDrawerScrim_3J_VO9M$lambda$2(State $alpha$delegate) {
        return BottomDrawerScrim_3J_VO9M$lambda$2($alpha$delegate);
    }

    public static final /* synthetic */ NestedScrollConnection access$ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection(AnchoredDraggableState state) {
        return ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection(state);
    }

    /* JADX INFO: renamed from: access$Scrim-Bx497Mc, reason: not valid java name */
    public static final /* synthetic */ void m1652access$ScrimBx497Mc(boolean open, Function0 onClose, Function0 fraction, long color, Composer $composer, int $changed) {
        m1650ScrimBx497Mc(open, onClose, fraction, color, $composer, $changed);
    }

    public static final /* synthetic */ float access$calculateFraction(float a, float b, float pos) {
        return calculateFraction(a, b, pos);
    }

    public static final /* synthetic */ TweenSpec access$getAnimationSpec$p() {
        return AnimationSpec;
    }

    public static final /* synthetic */ float access$getDrawerPositionalThreshold$p() {
        return DrawerPositionalThreshold;
    }

    public static final /* synthetic */ float access$getDrawerVelocityThreshold$p() {
        return DrawerVelocityThreshold;
    }

    public static final /* synthetic */ float access$getEndDrawerPadding$p() {
        return EndDrawerPadding;
    }

    public static final DrawerState rememberDrawerState(final DrawerValue initialValue, final Function1 r9, Composer $composer, int $changed, int r12) {
        ComposerKt.sourceInformationMarkerStart($composer, -1435874229, "C(rememberDrawerState)P(1)395@15023L61,395@14959L125:Drawer.kt#jmzs0o");
        if ((r12 & 2) == 0) goto L6;
        Function1 confirmStateChange = C04281.INSTANCE;
        r9 = confirmStateChange;
    L6:
        if (ComposerKt.isTraceInProgress() == false) goto L8;
        ComposerKt.traceEventStart(-1435874229, $changed, -1, "androidx.compose.material.rememberDrawerState (Drawer.kt:394)");
    L8:
        boolean r13 = false;
        Object[] r0 = new Object[0];
        Saver<DrawerState, DrawerValue> r1 = DrawerState.Companion.Saver(r9);
        ComposerKt.sourceInformationMarkerStart($composer, -524632406, "CC(remember):Drawer.kt#9igjgp");
        if ((($changed & 14) ^ 6) <= 4) goto L13;
        if ($composer.changed(initialValue) == false) goto L13;
    L14:
        boolean r2 = true;
    L17:
        if ((($changed & 112) ^ 48) <= 32) goto L21;
        if ($composer.changed(r9) == false) goto L21;
    L22:
        r13 = true;
    L23:
        boolean invalid$iv = r13 | r2;
        Object it$iv = $composer.rememberedValue();
        if (invalid$iv == false) goto L26;
    L29:
        Object value$iv = (Function0) new DrawerKt$rememberDrawerState$2$1(initialValue, r9);
        $composer.updateRememberedValue(value$iv);
        it$iv = value$iv;
    L30:
        ComposerKt.sourceInformationMarkerEnd($composer);
        DrawerState r10 = (DrawerState) RememberSaveableKt.m3923rememberSaveable(r0, r1, null, (Function0) it$iv, $composer, 0, 4);
        if (ComposerKt.isTraceInProgress() == false) goto L33;
        ComposerKt.traceEventEnd();
    L33:
        ComposerKt.sourceInformationMarkerEnd($composer);
        return r10;
    L26:
        if (it$iv != Composer.Companion.getEmpty()) goto L30;
    L21:
        if (($changed & 48) != 32) goto L23;
    L13:
        if (($changed & 6) == 4) goto L14;
        r2 = false;
        goto L17
    }

    public static final BottomDrawerState rememberBottomDrawerState(final BottomDrawerValue initialValue, final Function1 r10, final AnimationSpec r11, Composer $composer, int $changed, int r14) {
        ComposerKt.sourceInformationMarkerStart($composer, 1477366969, "C(rememberBottomDrawerState)P(2,1)414@15700L7,418@15844L91,415@15719L216:Drawer.kt#jmzs0o");
        if ((r14 & 2) == 0) goto L6;
        Function1 confirmStateChange = C04271.INSTANCE;
        r10 = confirmStateChange;
    L6:
        if ((r14 & 4) == 0) goto L9;
        AnimationSpec animationSpec = DrawerDefaults.INSTANCE.getAnimationSpec();
        r11 = animationSpec;
    L9:
        if (ComposerKt.isTraceInProgress() == false) goto L11;
        ComposerKt.traceEventStart(1477366969, $changed, -1, "androidx.compose.material.rememberBottomDrawerState (Drawer.kt:413)");
    L11:
        ProvidableCompositionLocal<Density> r15 = CompositionLocalsKt.getLocalDensity();
        ComposerKt.sourceInformationMarkerStart($composer, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
        Object r3 = $composer.consume(r15);
        ComposerKt.sourceInformationMarkerEnd($composer);
        final Density density = (Density) r3;
        Object[] r2 = {density};
        Saver<BottomDrawerState, BottomDrawerValue> r4 = BottomDrawerState.Companion.Saver(density, r10, r11);
        ComposerKt.sourceInformationMarkerStart($composer, -1985309891, "CC(remember):Drawer.kt#9igjgp");
        boolean r5 = false;
        if ((($changed & 14) ^ 6) <= 4) goto L16;
        if ($composer.changed(initialValue) == false) goto L16;
    L17:
        boolean r0 = true;
    L19:
        boolean r1 = r0 | $composer.changed(density);
        if ((($changed & 112) ^ 48) <= 32) goto L24;
        if ($composer.changed(r10) == false) goto L24;
    L25:
        r5 = true;
    L26:
        boolean invalid$iv = (r1 | r5) | $composer.changedInstance(r11);
        Object it$iv = $composer.rememberedValue();
        if (invalid$iv == false) goto L29;
    L32:
        Object value$iv = (Function0) new DrawerKt$rememberBottomDrawerState$2$1(initialValue, density, r10, r11);
        $composer.updateRememberedValue(value$iv);
        it$iv = value$iv;
    L33:
        ComposerKt.sourceInformationMarkerEnd($composer);
        BottomDrawerState r12 = (BottomDrawerState) RememberSaveableKt.m3923rememberSaveable(r2, r4, null, (Function0) it$iv, $composer, 0, 4);
        if (ComposerKt.isTraceInProgress() == false) goto L36;
        ComposerKt.traceEventEnd();
    L36:
        ComposerKt.sourceInformationMarkerEnd($composer);
        return r12;
    L29:
        if (it$iv != Composer.Companion.getEmpty()) goto L33;
    L24:
        if (($changed & 48) != 32) goto L26;
    L16:
        if (($changed & 6) == 4) goto L17;
        r0 = false;
        goto L19
    }

    /* JADX INFO: renamed from: ModalDrawer-Gs3lGvM, reason: not valid java name */
    public static final void m1649ModalDrawerGs3lGvM(final Function3<? super ColumnScope, ? super Composer, ? super Integer, Unit> r31, Modifier modifier, DrawerState drawerState, boolean gesturesEnabled, Shape drawerShape, float drawerElevation, long drawerBackgroundColor, long drawerContentColor, long scrimColor, final Function2<? super Composer, ? super Integer, Unit> r43, Composer $composer, final int $changed, final int r46) {
        Composer $composer2 = $composer.startRestartGroup(1305806945);
        ComposerKt.sourceInformation($composer2, "C(ModalDrawer)P(2,8,6,7,5,4:c#ui.unit.Dp,1:c#ui.graphics.Color,3:c#ui.graphics.Color,9:c#ui.graphics.Color)466@18174L24,467@18246L3417,467@18203L3460:Drawer.kt#jmzs0o");
        int $dirty = $changed;
        if ((r46 & 1) == 0) goto L6;
        $dirty = $dirty | 6;
    L13:
        int r5 = r46 & 2;
        if (r5 == 0) goto L17;
        $dirty = $dirty | 48;
        Modifier r6 = modifier;
    L25:
        if (($changed & 384) == 0) goto L27;
        DrawerState r7 = drawerState;
    L35:
        int r8 = r46 & 8;
        if (r8 == 0) goto L39;
        $dirty = $dirty | 3072;
        boolean r9 = gesturesEnabled;
    L47:
        if (($changed & 24576) == 0) goto L49;
        Shape r10 = drawerShape;
    L57:
        int r11 = r46 & 32;
        if (r11 == 0) goto L61;
        $dirty = $dirty | ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
        float r12 = drawerElevation;
    L69:
        if ((1572864 & $changed) == 0) goto L71;
        int r13 = r5;
    L80:
        if (($changed & 12582912) == 0) goto L82;
        int $dirty2 = $dirty;
    L91:
        if (($changed & 100663296) != 0) goto L101;
        int $dirty3 = $dirty2;
        if ((r46 & 256) != 0) goto L98;
        if ($composer2.changed(scrimColor) == false) goto L98;
        int r0 = AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
    L99:
        $dirty2 = $dirty3 | r0;
    L98:
        r0 = 33554432;
    L101:
        int $dirty4 = $dirty2;
        if ((r46 & 512) == 0) goto L105;
        int $dirty5 = $dirty4 | 805306368;
    L114:
        if (($dirty5 & 306783379) == 306783378) goto L116;
        boolean r2 = true;
    L118:
        if ($composer2.shouldExecute(r2, $dirty5 & 1) == false) goto L180;
        $composer2.startDefaults();
        ComposerKt.sourceInformation($composer2, "457@17751L39,459@17869L5,461@17978L15,462@18027L38,463@18106L10");
        if (($changed & 1) != 0) goto L122;
    L140:
        if (r13 == 0) goto L142;
        final Modifier.Companion modifier2 = Modifier.Companion;
    L144:
        if ((r46 & 4) == 0) goto L146;
        DrawerState drawerState2 = rememberDrawerState(DrawerValue.Closed, null, $composer2, 6, 2);
        $dirty5 = $dirty5 & (-897);
    L147:
        if (r8 == 0) goto L149;
        boolean gesturesEnabled2 = true;
    L151:
        if ((r46 & 16) == 0) goto L153;
        Shape drawerShape2 = DrawerDefaults.INSTANCE.getShape($composer2, 6);
        $dirty5 = $dirty5 & (-57345);
    L154:
        if (r11 == 0) goto L156;
        float drawerElevation2 = DrawerDefaults.INSTANCE.m1646getElevationD9Ej5fM();
    L158:
        if ((r46 & 64) == 0) goto L160;
        long drawerBackgroundColor2 = DrawerDefaults.INSTANCE.getBackgroundColor($composer2, 6);
        $dirty5 = $dirty5 & (-3670017);
    L162:
        if ((r46 & 128) == 0) goto L164;
        long drawerContentColor2 = ColorsKt.m1616contentColorForek8zF_U(drawerBackgroundColor2, $composer2, ($dirty5 >> 18) & 14);
        $dirty5 = $dirty5 & (-29360129);
    L166:
        if ((r46 & 256) == 0) goto L168;
        $dirty5 = $dirty5 & (-234881025);
        final Shape drawerShape3 = drawerShape2;
        final float drawerElevation3 = drawerElevation2;
        final long drawerBackgroundColor3 = drawerBackgroundColor2;
        final long drawerContentColor3 = drawerContentColor2;
        final long scrimColor2 = DrawerDefaults.INSTANCE.getScrimColor($composer2, 6);
        final DrawerState drawerState3 = drawerState2;
        final boolean gesturesEnabled3 = gesturesEnabled2;
    L169:
        $composer2.endDefaults();
        if (ComposerKt.isTraceInProgress() == false) goto L172;
        ComposerKt.traceEventStart(1305806945, $dirty5, -1, "androidx.compose.material.ModalDrawer (Drawer.kt:465)");
    L172:
        ComposerKt.sourceInformationMarkerStart($composer2, 773894976, "CC(rememberCoroutineScope)558@25470L68:Effects.kt#9igjgp");
        ComposerKt.sourceInformationMarkerStart($composer2, -954203484, "CC(remember):Effects.kt#9igjgp");
        Object it$iv$iv = $composer2.rememberedValue();
        if (it$iv$iv != Composer.Companion.getEmpty()) goto L176;
        Object value$iv$iv = EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, $composer2);
        $composer2.updateRememberedValue(value$iv$iv);
        it$iv$iv = value$iv$iv;
    L176:
        final CoroutineScope scope = (CoroutineScope) it$iv$iv;
        ComposerKt.sourceInformationMarkerEnd($composer2);
        ComposerKt.sourceInformationMarkerEnd($composer2);
        BoxWithConstraintsKt.BoxWithConstraints(SizeKt.fillMaxSize$default(modifier2, 0.0f, 1, null), null, false, ComposableLambdaKt.rememberComposableLambda(816674999, true, new DrawerKt$ModalDrawer$1(drawerState3, gesturesEnabled3, scope, scrimColor2, drawerShape3, drawerBackgroundColor3, drawerContentColor3, drawerElevation3, r43, r31), $composer2, 54), $composer2, 3072, 6);
        Composer $composer3 = $composer2;
        if (ComposerKt.isTraceInProgress() == false) goto L179;
        ComposerKt.traceEventEnd();
    L179:
        final DrawerState drawerState4 = drawerState3;
        final boolean gesturesEnabled4 = gesturesEnabled3;
        final long scrimColor3 = scrimColor2;
        final Shape drawerShape4 = drawerShape3;
        final long drawerBackgroundColor4 = drawerBackgroundColor3;
        final long drawerContentColor4 = drawerContentColor3;
        final float drawerElevation4 = drawerElevation3;
    L181:
        ScopeUpdateScope r1 = $composer3.endRestartGroup();
        if (r1 == null) goto L185;
        r1.updateScope(new DrawerKt$ModalDrawer$2(r31, modifier2, drawerState4, gesturesEnabled4, drawerShape4, drawerElevation4, drawerBackgroundColor4, drawerContentColor4, scrimColor3, r43, $changed, r46));
        return;
    L185:
        return;
    L168:
        scrimColor2 = scrimColor;
        gesturesEnabled3 = gesturesEnabled2;
        drawerShape3 = drawerShape2;
        drawerElevation3 = drawerElevation2;
        drawerBackgroundColor3 = drawerBackgroundColor2;
        drawerContentColor3 = drawerContentColor2;
        drawerState3 = drawerState2;
        goto L169
    L164:
        drawerContentColor2 = drawerContentColor;
        goto L166
    L160:
        drawerBackgroundColor2 = drawerBackgroundColor;
        goto L162
    L156:
        drawerElevation2 = r12;
        goto L158
    L153:
        drawerShape2 = r10;
        goto L154
    L149:
        gesturesEnabled2 = r9;
        goto L151
    L146:
        drawerState2 = r7;
        goto L147
    L142:
        modifier2 = r6;
        goto L144
    L122:
        if ($composer2.getDefaultsInvalid() == true) goto L140;
        $composer2.skipToGroupEnd();
        if ((r46 & 4) == 0) goto L128;
        $dirty5 = $dirty5 & (-897);
    L128:
        if ((r46 & 16) == 0) goto L131;
        $dirty5 = $dirty5 & (-57345);
    L131:
        if ((r46 & 64) == 0) goto L134;
        $dirty5 = $dirty5 & (-3670017);
    L134:
        if ((r46 & 128) == 0) goto L137;
        $dirty5 = $dirty5 & (-29360129);
    L137:
        if ((r46 & 256) == 0) goto L139;
        $dirty5 = $dirty5 & (-234881025);
    L139:
        drawerBackgroundColor3 = drawerBackgroundColor;
        drawerContentColor3 = drawerContentColor;
        scrimColor2 = scrimColor;
        modifier2 = r6;
        gesturesEnabled3 = r9;
        drawerShape3 = r10;
        drawerElevation3 = r12;
        drawerState3 = r7;
        goto L169
    L180:
        $composer3 = $composer2;
        $composer3.skipToGroupEnd();
        modifier2 = r6;
        drawerState4 = r7;
        gesturesEnabled4 = r9;
        drawerShape4 = r10;
        drawerElevation4 = r12;
        drawerBackgroundColor4 = drawerBackgroundColor;
        drawerContentColor4 = drawerContentColor;
        scrimColor3 = scrimColor;
        goto L181
    L116:
        r2 = false;
        goto L118
    L105:
        if (($changed & 805306368) != 0) goto L112;
        if ($composer2.changedInstance(r43) == false) goto L109;
        int r18 = 536870912;
    L110:
        $dirty4 = $dirty4 | r18;
        goto L112
    L109:
        r18 = 268435456;
    L112:
        $dirty5 = $dirty4;
        goto L114
    L82:
        if ((r46 & 128) != 0) goto L86;
        int $dirty6 = $dirty;
        if ($composer2.changed(drawerContentColor) == false) goto L87;
        int r17 = 8388608;
    L88:
        $dirty2 = $dirty6 | r17;
    L87:
        r17 = 4194304;
        goto L88
    L86:
        $dirty6 = $dirty;
        goto L87
    L71:
        if ((r46 & 64) != 0) goto L75;
        r13 = r5;
        if ($composer2.changed(drawerBackgroundColor) == false) goto L76;
        int r16 = 1048576;
    L77:
        $dirty = $dirty | r16;
    L76:
        r16 = 524288;
        goto L77
    L75:
        r13 = r5;
        goto L76
    L61:
        if ((196608 & $changed) != 0) goto L67;
        r12 = drawerElevation;
        if ($composer2.changed(r12) == false) goto L65;
        int r14 = 131072;
    L66:
        $dirty = $dirty | r14;
        goto L69
    L65:
        r14 = 65536;
        goto L66
    L67:
        r12 = drawerElevation;
        goto L69
    L49:
        if ((r46 & 16) != 0) goto L53;
        r10 = drawerShape;
        if ($composer2.changed(r10) == false) goto L54;
        int r15 = 16384;
    L55:
        $dirty = $dirty | r15;
    L54:
        r15 = 8192;
        goto L55
    L53:
        r10 = drawerShape;
        goto L54
    L39:
        if (($changed & 3072) != 0) goto L45;
        r9 = gesturesEnabled;
        if ($composer2.changed(r9) == false) goto L43;
        int r19 = 2048;
    L44:
        $dirty = $dirty | r19;
        goto L47
    L43:
        r19 = 1024;
        goto L44
    L45:
        r9 = gesturesEnabled;
        goto L47
    L27:
        if ((r46 & 4) != 0) goto L31;
        r7 = drawerState;
        if ($composer2.changed(r7) == false) goto L32;
        int r20 = 256;
    L33:
        $dirty = $dirty | r20;
    L32:
        r20 = 128;
        goto L33
    L31:
        r7 = drawerState;
        goto L32
    L17:
        if (($changed & 48) != 0) goto L23;
        r6 = modifier;
        if ($composer2.changed(r6) == false) goto L21;
        int r21 = 32;
    L22:
        $dirty = $dirty | r21;
        goto L25
    L21:
        r21 = 16;
        goto L22
    L23:
        r6 = modifier;
        goto L25
    L6:
        if (($changed & 6) != 0) goto L13;
        if ($composer2.changedInstance(r31) == false) goto L10;
        int r22 = 4;
    L11:
        $dirty = $dirty | r22;
        goto L13
    L10:
        r22 = 2;
        goto L11
    }

    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v13 */
    /* JADX WARN: Type inference failed for: r7v7, types: [boolean, int] */
    /* JADX INFO: renamed from: BottomDrawer-Gs3lGvM, reason: not valid java name */
    public static final void m1647BottomDrawerGs3lGvM(final Function3<? super ColumnScope, ? super Composer, ? super Integer, Unit> r31, Modifier r32, BottomDrawerState r33, boolean r34, Shape r35, float r36, long r37, long r39, long r41, final Function2<? super Composer, ? super Integer, Unit> r43, Composer r44, final int r45, final int r46) {
        Composer r4 = r44.startRestartGroup(625649286);
        ComposerKt.sourceInformation(r4, "C(BottomDrawer)P(2,8,6,7,5,4:c#ui.unit.Dp,1:c#ui.graphics.Color,3:c#ui.graphics.Color,9:c#ui.graphics.Color)593@23983L24,594@24055L4658,594@24012L4701:Drawer.kt#jmzs0o");
        int r1 = r45;
        if ((r46 & 1) == 0) goto L6;
        r1 = r1 | 6;
    L13:
        int r2 = r46 & 2;
        if (r2 == 0) goto L17;
        r1 = r1 | 48;
    L25:
        if ((r45 & 384) == 0) goto L27;
        BottomDrawerState r8 = r33;
    L35:
        int r9 = r46 & 8;
        if (r9 == 0) goto L39;
        r1 = r1 | 3072;
        boolean r10 = r34;
    L47:
        if ((r45 & 24576) == 0) goto L49;
        Shape r11 = r35;
    L57:
        int r12 = r46 & 32;
        if (r12 == 0) goto L61;
        r1 = r1 | ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
        float r13 = r36;
    L69:
        if ((1572864 & r45) == 0) goto L71;
        long r5 = r37;
    L80:
        if ((r45 & 12582912) == 0) goto L82;
        int r47 = r2;
    L91:
        if ((100663296 & r45) != 0) goto L102;
        if ((r46 & 256) != 0) goto L98;
        if (r4.changed(r41) == false) goto L98;
        int r0 = AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
    L99:
        r1 = r1 | r0;
    L98:
        r0 = 33554432;
    L102:
        if ((r46 & 512) == 0) goto L105;
        r1 = r1 | 805306368;
    L113:
        if ((r1 & 306783379) == 306783378) goto L115;
        boolean r3 = true;
    L117:
        if (r4.shouldExecute(r3, r1 & 1) == false) goto L179;
        r4.startDefaults();
        ComposerKt.sourceInformation(r4, "584@23566L33,586@23678L5,588@23787L15,589@23836L38,590@23915L10");
        if ((r45 & 1) != 0) goto L121;
    L139:
        if (r47 == 0) goto L141;
        Modifier.Companion r6 = Modifier.Companion;
    L143:
        if ((r46 & 4) == 0) goto L145;
        int r7 = r1;
        boolean r14 = true;
        BottomDrawerState r15 = rememberBottomDrawerState(BottomDrawerValue.Closed, null, null, r4, 6, 6);
        int r16 = r7 & (-897);
    L146:
        if (r9 == 0) goto L148;
        boolean r17 = true;
    L150:
        if ((r46 & 16) == 0) goto L152;
        Shape r18 = DrawerDefaults.INSTANCE.getShape(r4, 6);
        r16 = r16 & (-57345);
    L153:
        if (r12 == 0) goto L155;
        float r19 = DrawerDefaults.INSTANCE.m1646getElevationD9Ej5fM();
    L157:
        if ((r46 & 64) == 0) goto L159;
        long r20 = DrawerDefaults.INSTANCE.getBackgroundColor(r4, 6);
        r16 = r16 & (-3670017);
    L161:
        if ((r46 & 128) == 0) goto L163;
        long r110 = ColorsKt.m1616contentColorForek8zF_U(r20, r4, (r16 >> 18) & 14);
        r16 = r16 & (-29360129);
    L165:
        if ((r46 & 256) == 0) goto L167;
        final boolean r111 = r17;
        final BottomDrawerState r112 = r15;
        final Shape r23 = r18;
        final float r28 = r19;
        final long r24 = r20;
        final long r26 = r110;
        final long r21 = DrawerDefaults.INSTANCE.getScrimColor(r4, 6);
        r1 = r16 & (-234881025);
        Modifier r22 = r6;
        ?? r25 = r14;
    L168:
        r4.endDefaults();
        if (ComposerKt.isTraceInProgress() == false) goto L171;
        ComposerKt.traceEventStart(625649286, r1, -1, "androidx.compose.material.BottomDrawer (Drawer.kt:592)");
    L171:
        ComposerKt.sourceInformationMarkerStart(r4, 773894976, "CC(rememberCoroutineScope)558@25470L68:Effects.kt#9igjgp");
        ComposerKt.sourceInformationMarkerStart(r4, -954203484, "CC(remember):Effects.kt#9igjgp");
        Object r113 = r4.rememberedValue();
        if (r113 != Composer.Companion.getEmpty()) goto L175;
        CoroutineScope r114 = EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, r4);
        r4.updateRememberedValue(r114);
        r113 = r114;
    L175:
        final CoroutineScope r27 = (CoroutineScope) r113;
        ComposerKt.sourceInformationMarkerEnd(r4);
        ComposerKt.sourceInformationMarkerEnd(r4);
        BoxWithConstraintsKt.BoxWithConstraints(SizeKt.fillMaxSize$default(r22, 0.0f, r25, null), null, false, ComposableLambdaKt.rememberComposableLambda(1220102512, r25, new DrawerKt$BottomDrawer$1(r111, r112, r43, r21, r27, r23, r24, r26, r28, r31), r4, 54), r4, 3072, 6);
        Composer r115 = r4;
        if (ComposerKt.isTraceInProgress() == false) goto L178;
        ComposerKt.traceEventEnd();
    L178:
        final Modifier r29 = r22;
        final boolean r30 = r111;
        final BottomDrawerState r38 = r112;
        final long r116 = r21;
        final Shape r40 = r23;
        final long r42 = r24;
        final long r48 = r26;
        final float r49 = r28;
    L180:
        ScopeUpdateScope r50 = r115.endRestartGroup();
        if (r50 == null) goto L184;
        r50.updateScope(new DrawerKt$BottomDrawer$2(r31, r29, r38, r30, r40, r49, r42, r48, r116, r43, r45, r46));
        return;
    L184:
        return;
    L167:
        r111 = r17;
        r21 = r41;
        r112 = r15;
        r23 = r18;
        r28 = r19;
        r24 = r20;
        r26 = r110;
        r1 = r16;
        r22 = r6;
        r25 = r14;
        goto L168
    L163:
        r110 = r39;
        goto L165
    L159:
        r20 = r37;
        goto L161
    L155:
        r19 = r13;
        goto L157
    L152:
        r18 = r11;
        goto L153
    L148:
        r17 = r10;
        goto L150
    L145:
        r16 = r1;
        r14 = true;
        r15 = r8;
        goto L146
    L141:
        r6 = r32;
        goto L143
    L121:
        if (r4.getDefaultsInvalid() == true) goto L139;
        r4.skipToGroupEnd();
        if ((r46 & 4) == 0) goto L127;
        r1 = r1 & (-897);
    L127:
        if ((r46 & 16) == 0) goto L130;
        r1 = r1 & (-57345);
    L130:
        if ((r46 & 64) == 0) goto L133;
        r1 = r1 & (-3670017);
    L133:
        if ((r46 & 128) == 0) goto L136;
        r1 = r1 & (-29360129);
    L136:
        if ((r46 & 256) == 0) goto L138;
        r26 = r39;
        r21 = r41;
        r1 = r1 & (-234881025);
        r25 = 1;
        r24 = r5;
        r112 = r8;
        r23 = r11;
        r28 = r13;
        r22 = r32;
        r111 = r10;
        goto L168
    L138:
        r22 = r32;
        r26 = r39;
        r21 = r41;
        r25 = 1;
        r24 = r5;
        r112 = r8;
        r23 = r11;
        r28 = r13;
        r111 = r10;
        goto L168
    L179:
        r115 = r4;
        r115.skipToGroupEnd();
        r29 = r32;
        r38 = r8;
        r30 = r10;
        r40 = r11;
        r49 = r13;
        r42 = r37;
        r48 = r39;
        r116 = r41;
        goto L180
    L115:
        r3 = false;
        goto L117
    L105:
        if ((r45 & 805306368) != 0) goto L113;
        if (r4.changedInstance(r43) == false) goto L109;
        int r117 = 536870912;
    L110:
        r1 = r1 | r117;
        goto L113
    L109:
        r117 = 268435456;
        goto L110
    L82:
        if ((r46 & 128) != 0) goto L86;
        r47 = r2;
        if (r4.changed(r39) == false) goto L87;
        int r51 = 8388608;
    L88:
        r1 = r1 | r51;
    L87:
        r51 = 4194304;
        goto L88
    L86:
        r47 = r2;
        goto L87
    L71:
        if ((r46 & 64) != 0) goto L75;
        r5 = r37;
        if (r4.changed(r5) == false) goto L76;
        int r118 = 1048576;
    L77:
        r1 = r1 | r118;
    L76:
        r118 = 524288;
        goto L77
    L75:
        r5 = r37;
        goto L76
    L61:
        if ((196608 & r45) != 0) goto L67;
        r13 = r36;
        if (r4.changed(r13) == false) goto L65;
        int r52 = 131072;
    L66:
        r1 = r1 | r52;
        goto L69
    L65:
        r52 = 65536;
        goto L66
    L67:
        r13 = r36;
        goto L69
    L49:
        if ((r46 & 16) != 0) goto L53;
        r11 = r35;
        if (r4.changed(r11) == false) goto L54;
        int r53 = 16384;
    L55:
        r1 = r1 | r53;
    L54:
        r53 = 8192;
        goto L55
    L53:
        r11 = r35;
        goto L54
    L39:
        if ((r45 & 3072) != 0) goto L45;
        r10 = r34;
        if (r4.changed(r10) == false) goto L43;
        int r54 = 2048;
    L44:
        r1 = r1 | r54;
        goto L47
    L43:
        r54 = 1024;
        goto L44
    L45:
        r10 = r34;
        goto L47
    L27:
        if ((r46 & 4) != 0) goto L31;
        r8 = r33;
        if (r4.changedInstance(r8) == false) goto L32;
        int r55 = 256;
    L33:
        r1 = r1 | r55;
    L32:
        r55 = 128;
        goto L33
    L31:
        r8 = r33;
        goto L32
    L17:
        if ((r45 & 48) != 0) goto L25;
        if (r4.changed(r32) == false) goto L21;
        int r56 = 32;
    L22:
        r1 = r1 | r56;
        goto L25
    L21:
        r56 = 16;
        goto L22
    L6:
        if ((r45 & 6) != 0) goto L13;
        if (r4.changedInstance(r31) == false) goto L10;
        int r57 = 4;
    L11:
        r1 = r1 | r57;
        goto L13
    L10:
        r57 = 2;
        goto L11
    }

    private static final float calculateFraction(float a, float b, float pos) {
        float $this$fastCoerceIn$iv = (pos - a) / (b - a);
        float $this$fastCoerceAtLeast$iv$iv = $this$fastCoerceIn$iv;
        if ($this$fastCoerceAtLeast$iv$iv >= 0.0f) goto L6;
        $this$fastCoerceAtLeast$iv$iv = 0.0f;
    L6:
        if ($this$fastCoerceAtLeast$iv$iv > 1.0f) goto L9;
        return $this$fastCoerceAtLeast$iv$iv;
    L9:
        return 1.0f;
    }

    /* JADX INFO: renamed from: BottomDrawerScrim-3J-VO9M, reason: not valid java name */
    private static final void m1648BottomDrawerScrim3JVO9M(final long color, final Function0<Unit> r24, final boolean visible, Composer $composer, final int $changed) {
        Composer $composer2 = $composer.startRestartGroup(-513067266);
        ComposerKt.sourceInformation($composer2, "C(BottomDrawerScrim)P(0:c#ui.graphics.Color):Drawer.kt#jmzs0o");
        int $dirty = $changed;
        if (($changed & 6) != 0) goto L10;
        if ($composer2.changed(color) == false) goto L7;
        int r7 = 4;
    L8:
        $dirty = $dirty | r7;
        goto L10
    L7:
        r7 = 2;
    L10:
        if (($changed & 48) != 0) goto L17;
        if ($composer2.changedInstance(r24) == false) goto L14;
        int r8 = 32;
    L15:
        $dirty = $dirty | r8;
        goto L17
    L14:
        r8 = 16;
    L17:
        if (($changed & 384) != 0) goto L24;
        if ($composer2.changed(visible) == false) goto L21;
        int r9 = 256;
    L22:
        $dirty = $dirty | r9;
        goto L24
    L21:
        r9 = 128;
    L24:
        if (($dirty & 147) == 146) goto L26;
        boolean r10 = true;
    L28:
        if ($composer2.shouldExecute(r10, $dirty & 1) == true) goto L30;
        $composer2.skipToGroupEnd();
    L84:
        ScopeUpdateScope r6 = $composer2.endRestartGroup();
        if (r6 == null) goto L88;
        r6.updateScope(new DrawerKt$BottomDrawerScrim$2(color, r24, visible, $changed));
        return;
    L88:
        return;
    L30:
        if (ComposerKt.isTraceInProgress() == false) goto L33;
        ComposerKt.traceEventStart(-513067266, $dirty, -1, "androidx.compose.material.BottomDrawerScrim (Drawer.kt:729)");
    L33:
        if (color == 16) goto L35;
        int r0 = 1;
    L36:
        if (r0 == 0) goto L79;
        $composer2.startReplaceGroup(1552573422);
        ComposerKt.sourceInformation($composer2, "732@29959L87,733@30073L30,748@30640L62,748@30587L115");
        if (visible == false) goto L40;
        int $dirty2 = 1065353216;
    L41:
        int $dirty3 = $dirty;
        final State<Float> r11 = AnimateAsStateKt.animateFloatAsState($dirty2, new TweenSpec(0, 0, null, 7, null), 0.0f, null, null, $composer2, 48, 28);
        final String closeDrawer = Strings_androidKt.m1781getString4foXLRw(Strings.Companion.m1773getCloseDrawerUdPEhr4(), $composer2, 6);
        if (visible == false) goto L66;
        $composer2.startReplaceGroup(1552793770);
        ComposerKt.sourceInformation($composer2, "736@30210L37,737@30304L213");
        Modifier.Companion r12 = Modifier.Companion;
        ComposerKt.sourceInformationMarkerStart($composer2, -1612476567, "CC(remember):Drawer.kt#9igjgp");
        if (($dirty3 & 112) != 32) goto L46;
        boolean invalid$iv = true;
    L47:
        Object it$iv = $composer2.rememberedValue();
        if (invalid$iv == false) goto L50;
    L53:
        Object value$iv = (Function2) new DrawerKt$BottomDrawerScrim$dismissModifier$1$1(r24, null);
        $composer2.updateRememberedValue(value$iv);
        it$iv = value$iv;
    L54:
        ComposerKt.sourceInformationMarkerEnd($composer2);
        Modifier r1 = SuspendingPointerInputFilterKt.pointerInput(r12, r24, (Function2) it$iv);
        ComposerKt.sourceInformationMarkerStart($composer2, -1612473383, "CC(remember):Drawer.kt#9igjgp");
        boolean r13 = $composer2.changed(closeDrawer);
        if (($dirty3 & 112) != 32) goto L57;
        boolean r14 = true;
    L58:
        boolean invalid$iv2 = r13 | r14;
        Object it$iv2 = $composer2.rememberedValue();
        if (invalid$iv2 == false) goto L61;
    L64:
        Object value$iv2 = (Function1) new DrawerKt$BottomDrawerScrim$dismissModifier$2$1(closeDrawer, r24);
        $composer2.updateRememberedValue(value$iv2);
        it$iv2 = value$iv2;
    L65:
        ComposerKt.sourceInformationMarkerEnd($composer2);
        Modifier.Companion dismissModifier = SemanticsModifierKt.semantics(r1, true, (Function1) it$iv2);
        $composer2.endReplaceGroup();
    L67:
        Modifier r4 = SizeKt.fillMaxSize$default(Modifier.Companion, 0.0f, 1, null).then(dismissModifier);
        ComposerKt.sourceInformationMarkerStart($composer2, -1612462782, "CC(remember):Drawer.kt#9igjgp");
        if (($dirty3 & 14) != 4) goto L70;
        boolean r15 = true;
    L71:
        boolean invalid$iv3 = $composer2.changed(r11) | r15;
        Object it$iv3 = $composer2.rememberedValue();
        if (invalid$iv3 == false) goto L74;
    L77:
        Object value$iv3 = (Function1) new DrawerKt$BottomDrawerScrim$1$1(color, r11);
        $composer2.updateRememberedValue(value$iv3);
        it$iv3 = value$iv3;
    L78:
        ComposerKt.sourceInformationMarkerEnd($composer2);
        CanvasKt.Canvas(r4, (Function1) it$iv3, $composer2, 0);
        $composer2.endReplaceGroup();
    L81:
        if (ComposerKt.isTraceInProgress() == false) goto L84;
        ComposerKt.traceEventEnd();
        goto L84
    L74:
        if (it$iv3 != Composer.Companion.getEmpty()) goto L78;
    L70:
        r15 = false;
        goto L71
    L61:
        if (it$iv2 != Composer.Companion.getEmpty()) goto L65;
    L57:
        r14 = false;
        goto L58
    L50:
        if (it$iv != Composer.Companion.getEmpty()) goto L54;
    L46:
        invalid$iv = false;
        goto L47
    L66:
        $composer2.startReplaceGroup(1553158454);
        $composer2.endReplaceGroup();
        dismissModifier = Modifier.Companion;
        goto L67
    L40:
        $dirty2 = 0;
        goto L41
    L79:
        $composer2.startReplaceGroup(1553326846);
        $composer2.endReplaceGroup();
        goto L81
    L35:
        r0 = 0;
        goto L36
    L26:
        r10 = false;
        goto L28
    }

    private static final float BottomDrawerScrim_3J_VO9M$lambda$2(State<Float> r4) {
        return r4.getValue().floatValue();
    }

    /* JADX INFO: renamed from: Scrim-Bx497Mc, reason: not valid java name */
    private static final void m1650ScrimBx497Mc(final boolean open, final Function0<Unit> r22, final Function0<Float> r23, final long color, Composer $composer, final int $changed) {
        Composer $composer2 = $composer.startRestartGroup(1983403750);
        ComposerKt.sourceInformation($composer2, "C(Scrim)P(3,2,1,0:c#ui.graphics.Color)756@30839L30,771@31337L39,771@31286L90:Drawer.kt#jmzs0o");
        int $dirty = $changed;
        if (($changed & 6) != 0) goto L10;
        if ($composer2.changed(open) == false) goto L7;
        int r9 = 4;
    L8:
        $dirty = $dirty | r9;
        goto L10
    L7:
        r9 = 2;
    L10:
        if (($changed & 48) != 0) goto L17;
        if ($composer2.changedInstance(r22) == false) goto L14;
        int r10 = 32;
    L15:
        $dirty = $dirty | r10;
        goto L17
    L14:
        r10 = 16;
    L17:
        if (($changed & 384) != 0) goto L24;
        if ($composer2.changedInstance(r23) == false) goto L21;
        int r11 = 256;
    L22:
        $dirty = $dirty | r11;
        goto L24
    L21:
        r11 = 128;
    L24:
        if (($changed & 3072) != 0) goto L31;
        if ($composer2.changed(color) == false) goto L28;
        int r12 = 2048;
    L29:
        $dirty = $dirty | r12;
        goto L31
    L28:
        r12 = 1024;
    L31:
        if (($dirty & 1171) == 1170) goto L33;
        boolean r13 = true;
    L35:
        if ($composer2.shouldExecute(r13, $dirty & 1) == true) goto L37;
        $composer2.skipToGroupEnd();
    L84:
        ScopeUpdateScope r14 = $composer2.endRestartGroup();
        if (r14 == null) goto L88;
        r14.updateScope(new DrawerKt$Scrim$2(open, r22, r23, color, $changed));
        return;
    L88:
        return;
    L37:
        if (ComposerKt.isTraceInProgress() == false) goto L39;
        ComposerKt.traceEventStart(1983403750, $dirty, -1, "androidx.compose.material.Scrim (Drawer.kt:755)");
    L39:
        final String closeDrawer = Strings_androidKt.m1781getString4foXLRw(Strings.Companion.m1773getCloseDrawerUdPEhr4(), $composer2, 6);
        if (open == false) goto L64;
        $composer2.startReplaceGroup(487534424);
        ComposerKt.sourceInformation($composer2, "759@30957L35,760@31045L187");
        Modifier.Companion r15 = Modifier.Companion;
        ComposerKt.sourceInformationMarkerStart($composer2, 1262654051, "CC(remember):Drawer.kt#9igjgp");
        if (($dirty & 112) != 32) goto L44;
        boolean invalid$iv = true;
    L45:
        Object it$iv = $composer2.rememberedValue();
        if (invalid$iv == false) goto L48;
    L51:
        Object value$iv = (Function2) new DrawerKt$Scrim$dismissDrawer$1$1(r22, null);
        $composer2.updateRememberedValue(value$iv);
        it$iv = value$iv;
    L52:
        ComposerKt.sourceInformationMarkerEnd($composer2);
        Modifier r16 = SuspendingPointerInputFilterKt.pointerInput(r15, r22, (Function2) it$iv);
        ComposerKt.sourceInformationMarkerStart($composer2, 1262657019, "CC(remember):Drawer.kt#9igjgp");
        boolean r17 = $composer2.changed(closeDrawer);
        if (($dirty & 112) != 32) goto L55;
        boolean r18 = true;
    L56:
        boolean invalid$iv2 = r17 | r18;
        Object it$iv2 = $composer2.rememberedValue();
        if (invalid$iv2 == false) goto L59;
    L62:
        Object value$iv2 = (Function1) new DrawerKt$Scrim$dismissDrawer$2$1(closeDrawer, r22);
        $composer2.updateRememberedValue(value$iv2);
        it$iv2 = value$iv2;
    L63:
        ComposerKt.sourceInformationMarkerEnd($composer2);
        Modifier.Companion dismissDrawer = SemanticsModifierKt.semantics(r16, true, (Function1) it$iv2);
        $composer2.endReplaceGroup();
    L65:
        Modifier r1 = SizeKt.fillMaxSize$default(Modifier.Companion, 0.0f, 1, null).then(dismissDrawer);
        ComposerKt.sourceInformationMarkerStart($composer2, 1262666215, "CC(remember):Drawer.kt#9igjgp");
        if (($dirty & 7168) != 2048) goto L68;
        boolean r19 = true;
    L70:
        if (($dirty & 896) != 256) goto L72;
        boolean r110 = true;
    L73:
        boolean invalid$iv3 = r19 | r110;
        Object it$iv3 = $composer2.rememberedValue();
        if (invalid$iv3 == false) goto L76;
    L79:
        Object value$iv3 = (Function1) new DrawerKt$Scrim$1$1(color, r23);
        $composer2.updateRememberedValue(value$iv3);
        it$iv3 = value$iv3;
    L80:
        ComposerKt.sourceInformationMarkerEnd($composer2);
        CanvasKt.Canvas(r1, (Function1) it$iv3, $composer2, 0);
        if (ComposerKt.isTraceInProgress() == false) goto L84;
        ComposerKt.traceEventEnd();
        goto L84
    L76:
        if (it$iv3 != Composer.Companion.getEmpty()) goto L80;
    L72:
        r110 = false;
        goto L73
    L68:
        r19 = false;
        goto L70
    L59:
        if (it$iv2 != Composer.Companion.getEmpty()) goto L63;
    L55:
        r18 = false;
        goto L56
    L48:
        if (it$iv != Composer.Companion.getEmpty()) goto L52;
    L44:
        invalid$iv = false;
        goto L45
    L64:
        $composer2.startReplaceGroup(487858498);
        $composer2.endReplaceGroup();
        dismissDrawer = Modifier.Companion;
        goto L65
    L33:
        r13 = false;
        goto L35
    }

    static {
        EndDrawerPadding = Dp.m6973constructorimpl(56);
        DrawerPositionalThreshold = Dp.m6973constructorimpl(56);
        DrawerVelocityThreshold = Dp.m6973constructorimpl(400);
        AnimationSpec = new TweenSpec(256, 0, null, 6, null);
    }

    private static final NestedScrollConnection ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection(AnchoredDraggableState<?> r1) {
        return new AnonymousClass1(r1);
    }
}
