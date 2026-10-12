package androidx.compose.material;

import androidx.compose.animation.core.AnimateAsStateKt;
import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.TweenSpec;
import androidx.compose.foundation.CanvasKt;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.saveable.RememberSaveableKt;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.graphics.GraphicsLayerModifierKt;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.input.nestedscroll.NestedScrollConnection;
import androidx.compose.ui.input.nestedscroll.NestedScrollSource;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.ui.layout.LayoutModifierKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.SubcomposeLayoutKt;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.Velocity;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import androidx.profileinstaller.ProfileVerifier;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: BackdropScaffold.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0084\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\u001a;\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0011\u0010\t\u001a\r\u0012\u0004\u0012\u00020\u00060\n¢\u0006\u0002\b\u000b2\u0011\u0010\f\u001a\r\u0012\u0004\u0012\u00020\u00060\n¢\u0006\u0002\b\u000bH\u0003¢\u0006\u0002\u0010\r\u001aò\u0001\u0010\u000e\u001a\u00020\u00062\u0011\u0010\t\u001a\r\u0012\u0004\u0012\u00020\u00060\n¢\u0006\u0002\b\u000b2\u0011\u0010\u000f\u001a\r\u0012\u0004\u0012\u00020\u00060\n¢\u0006\u0002\b\u000b2\u0011\u0010\u0010\u001a\r\u0012\u0004\u0012\u00020\u00060\n¢\u0006\u0002\b\u000b2\b\b\u0002\u0010\u0011\u001a\u00020\u00122\b\b\u0002\u0010\u0013\u001a\u00020\u00142\u0019\b\u0002\u0010\u0015\u001a\u0013\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00060\u0016¢\u0006\u0002\b\u000b2\b\b\u0002\u0010\u0018\u001a\u00020\u00192\b\b\u0002\u0010\u001a\u001a\u00020\u00012\b\b\u0002\u0010\u001b\u001a\u00020\u00012\b\b\u0002\u0010\u001c\u001a\u00020\u00192\b\b\u0002\u0010\u001d\u001a\u00020\u00192\b\b\u0002\u0010\u001e\u001a\u00020\u001f2\b\b\u0002\u0010 \u001a\u00020\u001f2\b\b\u0002\u0010!\u001a\u00020\"2\b\b\u0002\u0010#\u001a\u00020\u00012\b\b\u0002\u0010$\u001a\u00020\u001f2\b\b\u0002\u0010%\u001a\u00020\u001f2\b\b\u0002\u0010&\u001a\u00020\u001fH\u0007ø\u0001\u0000¢\u0006\u0004\b'\u0010(\u001aH\u0010)\u001a\u00020\u00142\u0006\u0010*\u001a\u00020\b2\u0006\u0010+\u001a\u00020,2\u000e\b\u0002\u0010-\u001a\b\u0012\u0004\u0012\u00020/0.2\u0014\b\u0002\u00100\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00190\u00162\b\b\u0002\u00101\u001a\u00020\u0017H\u0007\u001a[\u00102\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u00122\u0011\u00103\u001a\r\u0012\u0004\u0012\u00020\u00060\n¢\u0006\u0002\b\u000b2\u0012\u00104\u001a\u000e\u0012\u0004\u0012\u000205\u0012\u0004\u0012\u0002050\u00162\u001d\u00106\u001a\u0019\u0012\u0004\u0012\u000205\u0012\u0004\u0012\u00020/\u0012\u0004\u0012\u00020\u000607¢\u0006\u0002\b\u000bH\u0003¢\u0006\u0002\u00108\u001a\u001c\u00109\u001a\u00020:2\n\u0010;\u001a\u0006\u0012\u0002\b\u00030<2\u0006\u0010=\u001a\u00020>H\u0000\u001a0\u0010?\u001a\u00020\u00062\u0006\u0010@\u001a\u00020\u001f2\f\u0010A\u001a\b\u0012\u0004\u0012\u00020\u00060\n2\u0006\u0010B\u001a\u00020\u0019H\u0003ø\u0001\u0000¢\u0006\u0004\bC\u0010D\u001aE\u0010E\u001a\u00020\u00142\u0006\u0010*\u001a\u00020\b2\u000e\b\u0002\u0010-\u001a\b\u0012\u0004\u0012\u00020/0.2\u0014\b\u0002\u0010F\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00190\u00162\b\b\u0002\u00101\u001a\u00020\u0017H\u0007¢\u0006\u0002\u0010G\"\u0010\u0010\u0000\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0002\"\u0010\u0010\u0003\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0002\"\u0010\u0010\u0004\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0002\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006H²\u0006\n\u0010I\u001a\u00020/X\u008a\u0084\u0002²\u0006\n\u0010J\u001a\u00020/X\u008a\u0084\u0002"}, d2 = {"AnimationSlideOffset", "Landroidx/compose/ui/unit/Dp;", "F", "PositionalThreshold", "VelocityThreshold", "BackLayerTransition", "", "target", "Landroidx/compose/material/BackdropValue;", "appBar", "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "content", "(Landroidx/compose/material/BackdropValue;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "BackdropScaffold", "backLayerContent", "frontLayerContent", "modifier", "Landroidx/compose/ui/Modifier;", "scaffoldState", "Landroidx/compose/material/BackdropScaffoldState;", "snackbarHost", "Lkotlin/Function1;", "Landroidx/compose/material/SnackbarHostState;", "gesturesEnabled", "", "peekHeight", "headerHeight", "persistentAppBar", "stickyFrontLayer", "backLayerBackgroundColor", "Landroidx/compose/ui/graphics/Color;", "backLayerContentColor", "frontLayerShape", "Landroidx/compose/ui/graphics/Shape;", "frontLayerElevation", "frontLayerBackgroundColor", "frontLayerContentColor", "frontLayerScrimColor", "BackdropScaffold-0hNv9B8", "(Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/Modifier;Landroidx/compose/material/BackdropScaffoldState;Lkotlin/jvm/functions/Function3;ZFFZZJJLandroidx/compose/ui/graphics/Shape;FJJJLandroidx/compose/runtime/Composer;III)V", "BackdropScaffoldState", "initialValue", "density", "Landroidx/compose/ui/unit/Density;", "animationSpec", "Landroidx/compose/animation/core/AnimationSpec;", "", "confirmValueChange", "snackbarHostState", "BackdropStack", "backLayer", "calculateBackLayerConstraints", "Landroidx/compose/ui/unit/Constraints;", "frontLayer", "Lkotlin/Function2;", "(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function4;Landroidx/compose/runtime/Composer;I)V", "ConsumeSwipeNestedScrollConnection", "Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;", "state", "Landroidx/compose/material/AnchoredDraggableState;", "orientation", "Landroidx/compose/foundation/gestures/Orientation;", "Scrim", "color", "onDismiss", "visible", "Scrim-3J-VO9M", "(JLkotlin/jvm/functions/Function0;ZLandroidx/compose/runtime/Composer;I)V", "rememberBackdropScaffoldState", "confirmStateChange", "(Landroidx/compose/material/BackdropValue;Landroidx/compose/animation/core/AnimationSpec;Lkotlin/jvm/functions/Function1;Landroidx/compose/material/SnackbarHostState;Landroidx/compose/runtime/Composer;II)Landroidx/compose/material/BackdropScaffoldState;", "material_release", "alpha", "animationProgress"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class BackdropScaffoldKt {
    private static final float AnimationSlideOffset = 0.0f;
    private static final float PositionalThreshold = 0.0f;
    private static final float VelocityThreshold = 0.0f;

    /* JADX INFO: renamed from: androidx.compose.material.BackdropScaffoldKt$ConsumeSwipeNestedScrollConnection$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: BackdropScaffold.kt */
    @Metadata(d1 = {"\u0000)\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0007\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J#\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0003H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007J*\u0010\b\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016ø\u0001\u0000¢\u0006\u0004\b\f\u0010\rJ\u001b\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0003H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010J\"\u0010\u0011\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0013J\u0013\u0010\u0014\u001a\u00020\u0015*\u00020\tH\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0013\u0010\u0014\u001a\u00020\u0015*\u00020\u0003H\u0003¢\u0006\u0004\b\u0018\u0010\u0017J\u0017\u0010\u0019\u001a\u00020\t*\u00020\u0015H\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0002\u0010\u001a\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u001b"}, d2 = {"androidx/compose/material/BackdropScaffoldKt$ConsumeSwipeNestedScrollConnection$1", "Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;", "onPostFling", "Landroidx/compose/ui/unit/Velocity;", "consumed", "available", "onPostFling-RZ2iAVY", "(JJLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "onPostScroll", "Landroidx/compose/ui/geometry/Offset;", "source", "Landroidx/compose/ui/input/nestedscroll/NestedScrollSource;", "onPostScroll-DzOQY0M", "(JJI)J", "onPreFling", "onPreFling-QWom1Mo", "(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "onPreScroll", "onPreScroll-OzD1aCk", "(JI)J", "toFloat", "", "offsetToFloat", "(J)F", "velocityToFloat", "toOffset", "(F)J", "material_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class C04201 implements NestedScrollConnection {
        final /* synthetic */ Orientation $orientation;
        final /* synthetic */ AnchoredDraggableState<?> $state;

        C04201(AnchoredDraggableState<?> r1, Orientation $orientation) {
            this.$state = r1;
            this.$orientation = $orientation;
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
            if ((r10 instanceof BackdropScaffoldKt$ConsumeSwipeNestedScrollConnection$1$onPreFling$1) == false) goto L7;
            BackdropScaffoldKt$ConsumeSwipeNestedScrollConnection$1$onPreFling$1 r0 = (BackdropScaffoldKt$ConsumeSwipeNestedScrollConnection$1$onPreFling$1) r10;
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
            r0 = new BackdropScaffoldKt$ConsumeSwipeNestedScrollConnection$1$onPreFling$1(this, r10);
            goto L8
        }

        @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
        /* JADX INFO: renamed from: onPostFling-RZ2iAVY */
        public Object mo496onPostFlingRZ2iAVY(long r6, long available, Continuation<? super Velocity> r10) {
            if ((r10 instanceof BackdropScaffoldKt$ConsumeSwipeNestedScrollConnection$1$onPostFling$1) == false) goto L7;
            BackdropScaffoldKt$ConsumeSwipeNestedScrollConnection$1$onPostFling$1 r7 = (BackdropScaffoldKt$ConsumeSwipeNestedScrollConnection$1$onPostFling$1) r10;
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
            r7 = new BackdropScaffoldKt$ConsumeSwipeNestedScrollConnection$1$onPostFling$1(this, r10);
            goto L8
        }

        private final long toOffset(float $this$toOffset) {
            float r2 = 0.0f;
            if (this.$orientation != Orientation.Horizontal) goto L5;
            float r0 = $this$toOffset;
        L7:
            if (this.$orientation != Orientation.Vertical) goto L10;
            r2 = $this$toOffset;
        L10:
            return OffsetKt.Offset(r0, r2);
        L5:
            r0 = 0.0f;
            goto L7
        }

        private final float velocityToFloat(long $this$toFloat) {
            if (this.$orientation != Orientation.Horizontal) goto L6;
            return Velocity.m7211getXimpl($this$toFloat);
        L6:
            return Velocity.m7212getYimpl($this$toFloat);
        }

        private final float offsetToFloat(long $this$toFloat) {
            if (this.$orientation != Orientation.Horizontal) goto L6;
            return Offset.m4125getXimpl($this$toFloat);
        L6:
            return Offset.m4126getYimpl($this$toFloat);
        }
    }

    public static final /* synthetic */ void access$BackLayerTransition(BackdropValue target, Function2 appBar, Function2 content, Composer $composer, int $changed) {
        BackLayerTransition(target, appBar, content, $composer, $changed);
    }

    public static final /* synthetic */ float access$BackLayerTransition$lambda$10(State $animationProgress$delegate) {
        return BackLayerTransition$lambda$10($animationProgress$delegate);
    }

    public static final /* synthetic */ void access$BackdropStack(Modifier modifier, Function2 backLayer, Function1 calculateBackLayerConstraints, Function4 frontLayer, Composer $composer, int $changed) {
        BackdropStack(modifier, backLayer, calculateBackLayerConstraints, frontLayer, $composer, $changed);
    }

    /* JADX INFO: renamed from: access$Scrim-3J-VO9M, reason: not valid java name */
    public static final /* synthetic */ void m1537access$Scrim3JVO9M(long color, Function0 onDismiss, boolean visible, Composer $composer, int $changed) {
        m1536Scrim3JVO9M(color, onDismiss, visible, $composer, $changed);
    }

    public static final /* synthetic */ float access$Scrim_3J_VO9M$lambda$7(State $alpha$delegate) {
        return Scrim_3J_VO9M$lambda$7($alpha$delegate);
    }

    public static final /* synthetic */ float access$getPositionalThreshold$p() {
        return PositionalThreshold;
    }

    public static final /* synthetic */ float access$getVelocityThreshold$p() {
        return VelocityThreshold;
    }

    public static /* synthetic */ BackdropScaffoldState BackdropScaffoldState$default(BackdropValue r0, Density r1, AnimationSpec r2, AnonymousClass1 r3, SnackbarHostState r4, int r5, Object r6) {
        if ((r5 & 4) == 0) goto L6;
        r2 = BackdropScaffoldDefaults.INSTANCE.getAnimationSpec();
    L6:
        if ((r5 & 8) == 0) goto L9;
        r3 = AnonymousClass1.INSTANCE;
    L9:
        if ((r5 & 16) == 0) goto L12;
        r4 = new SnackbarHostState();
    L12:
        return BackdropScaffoldState(r0, r1, r2, r3, r4);
    }

    public static final BackdropScaffoldState BackdropScaffoldState(BackdropValue initialValue, Density density, AnimationSpec<Float> r5, Function1<? super BackdropValue, Boolean> r6, SnackbarHostState snackbarHostState) {
        BackdropScaffoldState it = new BackdropScaffoldState(initialValue, r5, r6, snackbarHostState);
        it.setDensity$material_release(density);
        return it;
    }

    public static final BackdropScaffoldState rememberBackdropScaffoldState(BackdropValue initialValue, AnimationSpec<Float> r17, Function1<? super BackdropValue, Boolean> r18, SnackbarHostState snackbarHostState, Composer $composer, int $changed, int r22) {
        ComposerKt.sourceInformationMarkerStart($composer, -862178912, "C(rememberBackdropScaffoldState)P(2)256@10436L32,258@10528L7,270@10913L266,259@10547L632:BackdropScaffold.kt#jmzs0o");
        if ((r22 & 2) == 0) goto L5;
        final AnimationSpec<Float> r11 = BackdropScaffoldDefaults.INSTANCE.getAnimationSpec();
    L7:
        if ((r22 & 4) == 0) goto L9;
        final Function1<? super BackdropValue, Boolean> r12 = C04211.INSTANCE;
    L11:
        if ((r22 & 8) == 0) goto L17;
        ComposerKt.sourceInformationMarkerStart($composer, -1082630382, "CC(remember):BackdropScaffold.kt#9igjgp");
        Object it$iv = $composer.rememberedValue();
        if (it$iv != Composer.Companion.getEmpty()) goto L16;
        Object value$iv = new SnackbarHostState();
        $composer.updateRememberedValue(value$iv);
        it$iv = value$iv;
    L16:
        SnackbarHostState snackbarHostState2 = (SnackbarHostState) it$iv;
        ComposerKt.sourceInformationMarkerEnd($composer);
        final SnackbarHostState snackbarHostState3 = snackbarHostState2;
    L19:
        if (ComposerKt.isTraceInProgress() == false) goto L21;
        ComposerKt.traceEventStart(-862178912, $changed, -1, "androidx.compose.material.rememberBackdropScaffoldState (BackdropScaffold.kt:257)");
    L21:
        ProvidableCompositionLocal<Density> r0 = CompositionLocalsKt.getLocalDensity();
        ComposerKt.sourceInformationMarkerStart($composer, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
        Object r5 = $composer.consume(r0);
        ComposerKt.sourceInformationMarkerEnd($composer);
        final Density density = (Density) r5;
        Object[] r1 = {r11, r12, snackbarHostState3};
        Saver<BackdropScaffoldState, ?> r2 = BackdropScaffoldState.Companion.Saver(r11, r12, snackbarHostState3, density);
        ComposerKt.sourceInformationMarkerStart($composer, -1082614884, "CC(remember):BackdropScaffold.kt#9igjgp");
        boolean r3 = false;
        if ((($changed & 14) ^ 6) <= 4) goto L26;
        final BackdropValue r9 = initialValue;
        if ($composer.changed(r9) == false) goto L28;
    L29:
        boolean r4 = true;
    L31:
        boolean r6 = (r4 | $composer.changed(density)) | $composer.changedInstance(r11);
        if ((($changed & 896) ^ 384) <= 256) goto L36;
        if ($composer.changed(r12) == false) goto L36;
    L37:
        boolean r7 = true;
    L39:
        boolean r8 = r6 | r7;
        if ((($changed & 7168) ^ 3072) <= 2048) goto L44;
        if ($composer.changed(snackbarHostState3) == false) goto L44;
    L45:
        r3 = true;
    L46:
        boolean invalid$iv = r8 | r3;
        Object it$iv2 = $composer.rememberedValue();
        if (invalid$iv == false) goto L49;
    L52:
        Object value$iv2 = (Function0) new BackdropScaffoldKt$rememberBackdropScaffoldState$3$1(r9, density, r11, r12, snackbarHostState3);
        $composer.updateRememberedValue(value$iv2);
        it$iv2 = value$iv2;
    L53:
        ComposerKt.sourceInformationMarkerEnd($composer);
        BackdropScaffoldState r10 = (BackdropScaffoldState) RememberSaveableKt.m3923rememberSaveable(r1, r2, null, (Function0) it$iv2, $composer, 0, 4);
        if (ComposerKt.isTraceInProgress() == false) goto L56;
        ComposerKt.traceEventEnd();
    L56:
        ComposerKt.sourceInformationMarkerEnd($composer);
        return r10;
    L49:
        if (it$iv2 != Composer.Companion.getEmpty()) goto L53;
    L44:
        if (($changed & 3072) != 2048) goto L46;
    L36:
        if (($changed & 384) == 256) goto L37;
        r7 = false;
    L28:
        if (($changed & 6) == 4) goto L29;
        r4 = false;
        goto L31
    L26:
        r9 = initialValue;
        goto L28
    L17:
        snackbarHostState3 = snackbarHostState;
        goto L19
    L9:
        r12 = r18;
        goto L11
    L5:
        r11 = r17;
        goto L7
    }

    /* JADX INFO: renamed from: BackdropScaffold-0hNv9B8, reason: not valid java name */
    public static final void m1535BackdropScaffold0hNv9B8(Function2<? super Composer, ? super Integer, Unit> r41, final Function2<? super Composer, ? super Integer, Unit> r42, final Function2<? super Composer, ? super Integer, Unit> r43, Modifier modifier, BackdropScaffoldState scaffoldState, Function3<? super SnackbarHostState, ? super Composer, ? super Integer, Unit> r46, boolean gesturesEnabled, float peekHeight, float headerHeight, boolean persistentAppBar, boolean stickyFrontLayer, long backLayerBackgroundColor, long backLayerContentColor, Shape frontLayerShape, float frontLayerElevation, long frontLayerBackgroundColor, long frontLayerContentColor, long frontLayerScrimColor, Composer $composer, final int $changed, final int $changed1, final int r67) {
        Composer $composer2 = $composer.startRestartGroup(113877443);
        ComposerKt.sourceInformation($composer2, "C(BackdropScaffold)P(!1,2,5,12,15,16,10,13:c#ui.unit.Dp,11:c#ui.unit.Dp,14,17,1:c#ui.graphics.Color,3:c#ui.graphics.Color,9,7:c#ui.unit.Dp,4:c#ui.graphics.Color,6:c#ui.graphics.Color,8:c#ui.graphics.Color)366@16924L7,367@16947L35,367@16936L46,*369@17025L7,370@17099L7,373@17173L383,387@17627L100,394@17885L4095,394@17805L4175:BackdropScaffold.kt#jmzs0o");
        int $dirty = $changed;
        int $dirty1 = $changed1;
        if ((r67 & 1) == 0) goto L6;
        $dirty = $dirty | 6;
    L13:
        if ((r67 & 2) == 0) goto L16;
        $dirty = $dirty | 48;
    L23:
        if ((r67 & 4) == 0) goto L26;
        $dirty = $dirty | 384;
    L33:
        int r7 = r67 & 8;
        int r16 = 1024;
        if (r7 == 0) goto L37;
        $dirty = $dirty | 3072;
    L44:
        int r19 = 8192;
        if (($changed & 24576) == 0) goto L47;
        BackdropScaffoldState r9 = scaffoldState;
    L55:
        int r21 = r67 & 32;
        if (r21 == 0) goto L59;
        $dirty = $dirty | ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
        Function3<? super SnackbarHostState, ? super Composer, ? super Integer, Unit> r14 = r46;
    L66:
        int r25 = r67 & 64;
        if (r25 == 0) goto L70;
        $dirty = $dirty | 1572864;
        boolean r13 = gesturesEnabled;
    L78:
        if (($changed & 12582912) == 0) goto L80;
        float r11 = peekHeight;
    L89:
        if (($changed & 100663296) == 0) goto L91;
        float r12 = headerHeight;
    L99:
        int r8 = r67 & 512;
        if (r8 == 0) goto L103;
        $dirty = $dirty | 805306368;
    L110:
        int r10 = r67 & 1024;
        if (r10 == 0) goto L114;
        $dirty1 = $dirty1 | 6;
    L122:
        if (($changed1 & 48) != 0) goto L133;
        if ((r67 & 2048) != 0) goto L129;
        if ($composer2.changed(backLayerBackgroundColor) == false) goto L129;
        int r27 = 32;
    L130:
        $dirty1 = $dirty1 | r27;
    L129:
        r27 = 16;
    L133:
        if (($changed1 & 384) != 0) goto L144;
        if ((r67 & 4096) != 0) goto L140;
        if ($composer2.changed(backLayerContentColor) == false) goto L140;
        int r24 = 256;
    L141:
        $dirty1 = $dirty1 | r24;
    L140:
        r24 = 128;
    L144:
        if (($changed1 & 3072) != 0) goto L154;
        if ((r67 & 8192) != 0) goto L151;
        if ($composer2.changed(frontLayerShape) == false) goto L151;
        r16 = 2048;
    L151:
        $dirty1 = $dirty1 | r16;
    L154:
        if (($changed1 & 24576) != 0) goto L164;
        if ((r67 & 16384) != 0) goto L161;
        if ($composer2.changed(frontLayerElevation) == false) goto L161;
        r19 = 16384;
    L161:
        $dirty1 = $dirty1 | r19;
    L164:
        if (($changed1 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) != 0) goto L175;
        if ((r67 & 32768) != 0) goto L171;
        if ($composer2.changed(frontLayerBackgroundColor) == false) goto L171;
        int r17 = 131072;
    L172:
        $dirty1 = $dirty1 | r17;
    L171:
        r17 = 65536;
    L175:
        if (($changed1 & 1572864) != 0) goto L186;
        if ((r67 & 65536) != 0) goto L182;
        if ($composer2.changed(frontLayerContentColor) == false) goto L182;
        int r18 = 1048576;
    L183:
        $dirty1 = $dirty1 | r18;
    L182:
        r18 = 524288;
    L186:
        if (($changed1 & 12582912) != 0) goto L196;
        if ((r67 & 131072) != 0) goto L193;
        if ($composer2.changed(frontLayerScrimColor) == false) goto L193;
        int r110 = 8388608;
    L194:
        $dirty1 = $dirty1 | r110;
    L193:
        r110 = 4194304;
    L196:
        int $dirty2 = $dirty1;
        if ((306783379 & $dirty) == 306783378) goto L199;
    L202:
        boolean r0 = true;
    L204:
        if ($composer2.shouldExecute(r0, $dirty & 1) == false) goto L326;
        $composer2.startDefaults();
        ComposerKt.sourceInformation($composer2, "350@15926L40,357@16335L6,358@16386L41,359@16483L15,361@16629L6,362@16681L42,363@16784L20");
        if (($changed & 1) != 0) goto L208;
    L241:
        if (r7 == 0) goto L243;
        Modifier.Companion modifier2 = Modifier.Companion;
    L245:
        if ((r67 & 16) == 0) goto L247;
        final BackdropScaffoldState scaffoldState2 = rememberBackdropScaffoldState(BackdropValue.Concealed, null, null, null, $composer2, 6, 14);
        $dirty = $dirty & (-57345);
    L248:
        if (r21 == 0) goto L250;
        Function3<? super SnackbarHostState, ? super Composer, ? super Integer, Unit> r15 = ComposableSingletons$BackdropScaffoldKt.INSTANCE.m1623getLambda1$material_release();
    L251:
        if (r25 == 0) goto L253;
        boolean gesturesEnabled2 = true;
    L255:
        if ((r67 & 128) == 0) goto L257;
        float peekHeight2 = BackdropScaffoldDefaults.INSTANCE.m1534getPeekHeightD9Ej5fM();
        $dirty = $dirty & (-29360129);
    L259:
        if ((r67 & 256) == 0) goto L261;
        float headerHeight2 = BackdropScaffoldDefaults.INSTANCE.m1533getHeaderHeightD9Ej5fM();
        $dirty = $dirty & (-234881025);
    L262:
        if (r8 == 0) goto L264;
        final boolean persistentAppBar2 = true;
    L265:
        if (r10 == 0) goto L267;
        boolean stickyFrontLayer2 = true;
    L269:
        if ((r67 & 2048) == 0) goto L271;
        long backLayerBackgroundColor2 = MaterialTheme.INSTANCE.getColors($composer2, 6).m1598getPrimary0d7_KjU();
        int $dirty3 = $dirty2 & (-113);
    L273:
        if ((r67 & 4096) == 0) goto L275;
        long backLayerContentColor2 = ColorsKt.m1616contentColorForek8zF_U(backLayerBackgroundColor2, $composer2, ($dirty3 >> 3) & 14);
        $dirty3 = $dirty3 & (-897);
    L277:
        if ((r67 & 8192) == 0) goto L279;
        Shape frontLayerShape2 = BackdropScaffoldDefaults.INSTANCE.getFrontLayerShape($composer2, 0);
        $dirty3 = $dirty3 & (-7169);
    L281:
        if ((r67 & 16384) == 0) goto L283;
        float frontLayerElevation2 = BackdropScaffoldDefaults.INSTANCE.m1532getFrontLayerElevationD9Ej5fM();
        $dirty3 = $dirty3 & (-57345);
    L285:
        if ((32768 & r67) == 0) goto L287;
        $dirty3 = $dirty3 & (-458753);
        long frontLayerBackgroundColor2 = MaterialTheme.INSTANCE.getColors($composer2, 6).m1602getSurface0d7_KjU();
    L289:
        if ((r67 & 65536) == 0) goto L291;
        final long frontLayerContentColor2 = ColorsKt.m1616contentColorForek8zF_U(frontLayerBackgroundColor2, $composer2, ($dirty3 >> 15) & 14);
        $dirty3 = $dirty3 & (-3670017);
    L293:
        if ((r67 & 131072) == 0) goto L295;
        long frontLayerBackgroundColor3 = frontLayerBackgroundColor2;
        final Modifier modifier3 = modifier2;
        $dirty3 = $dirty3 & (-29360129);
        final Function3<? super SnackbarHostState, ? super Composer, ? super Integer, Unit> r36 = r15;
        long backLayerBackgroundColor3 = backLayerBackgroundColor2;
        final long frontLayerScrimColor2 = BackdropScaffoldDefaults.INSTANCE.getFrontLayerScrimColor($composer2, 0);
        final Shape frontLayerShape3 = frontLayerShape2;
        final float frontLayerElevation3 = frontLayerElevation2;
        long r39 = backLayerContentColor2;
        final boolean gesturesEnabled3 = gesturesEnabled2;
        final boolean stickyFrontLayer3 = stickyFrontLayer2;
        long backLayerContentColor3 = r39;
    L296:
        $composer2.endDefaults();
        if (ComposerKt.isTraceInProgress() == false) goto L299;
        ComposerKt.traceEventStart(113877443, $dirty, $dirty3, "androidx.compose.material.BackdropScaffold (BackdropScaffold.kt:364)");
    L299:
        ProvidableCompositionLocal<Density> r3 = CompositionLocalsKt.getLocalDensity();
        long backLayerBackgroundColor4 = backLayerBackgroundColor3;
        ComposerKt.sourceInformationMarkerStart($composer2, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
        Object r1 = $composer2.consume(r3);
        ComposerKt.sourceInformationMarkerEnd($composer2);
        final Density density = (Density) r1;
        ComposerKt.sourceInformationMarkerStart($composer2, 1348845653, "CC(remember):BackdropScaffold.kt#9igjgp");
        if (((57344 & $dirty) ^ 24576) <= 16384) goto L304;
        if ($composer2.changed(scaffoldState2) == false) goto L304;
    L305:
        boolean r2 = true;
    L307:
        boolean invalid$iv = r2 | $composer2.changed(density);
        Object value$iv = $composer2.rememberedValue();
        if (invalid$iv == false) goto L310;
    L313:
        value$iv = (Function0) new BackdropScaffoldKt$BackdropScaffold$1$1(scaffoldState2, density);
        $composer2.updateRememberedValue(value$iv);
    L314:
        ComposerKt.sourceInformationMarkerEnd($composer2);
        EffectsKt.SideEffect((Function0) value$iv, $composer2, 0);
        ProvidableCompositionLocal<Density> r4 = CompositionLocalsKt.getLocalDensity();
        ComposerKt.sourceInformationMarkerStart($composer2, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
        Object r5 = $composer2.consume(r4);
        ComposerKt.sourceInformationMarkerEnd($composer2);
        Density $this$BackdropScaffold_0hNv9B8_u24lambda_u244 = (Density) r5;
        final float peekHeightPx = $this$BackdropScaffold_0hNv9B8_u24lambda_u244.mo376toPx0680j_4(peekHeight2);
        ProvidableCompositionLocal<Density> r6 = CompositionLocalsKt.getLocalDensity();
        ComposerKt.sourceInformationMarkerStart($composer2, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
        Object r20 = $composer2.consume(r6);
        ComposerKt.sourceInformationMarkerEnd($composer2);
        Density $this$BackdropScaffold_0hNv9B8_u24lambda_u245 = (Density) r20;
        final float headerHeightPx = $this$BackdropScaffold_0hNv9B8_u24lambda_u245.mo376toPx0680j_4(headerHeight2);
        final Function2<? super Composer, ? super Integer, Unit> r22 = r41;
        final Function2 backLayer = ComposableLambdaKt.rememberComposableLambda(461235665, true, new BackdropScaffoldKt$BackdropScaffold$backLayer$1(persistentAppBar2, scaffoldState2, r22, r42), $composer2, 54);
        ComposerKt.sourceInformationMarkerStart($composer2, 1348867478, "CC(remember):BackdropScaffold.kt#9igjgp");
        boolean invalid$iv2 = $composer2.changed(headerHeightPx);
        Object it$iv = $composer2.rememberedValue();
        if (invalid$iv2 == true) goto L321;
        if (it$iv == Composer.Companion.getEmpty()) goto L321;
    L322:
        final Function1 calculateBackLayerConstraints = (Function1) it$iv;
        ComposerKt.sourceInformationMarkerEnd($composer2);
        final long frontLayerBackgroundColor4 = frontLayerBackgroundColor3;
        final AnchoredDraggableState<BackdropValue> r23 = scaffoldState2.getAnchoredDraggableState$material_release();
        final BackdropScaffoldState scaffoldState3 = scaffoldState2;
        final float peekHeight3 = peekHeight2;
        final float headerHeight3 = headerHeight2;
        long backLayerContentColor4 = backLayerContentColor3;
        SurfaceKt.m1782SurfaceFjzlyU(null, null, backLayerBackgroundColor4, backLayerContentColor4, null, 0.0f, ComposableLambdaKt.rememberComposableLambda(1961515015, true, new BackdropScaffoldKt$BackdropScaffold$2(modifier3, backLayer, calculateBackLayerConstraints, headerHeightPx, stickyFrontLayer3, gesturesEnabled3, scaffoldState3, r23, frontLayerShape3, frontLayerBackgroundColor4, frontLayerContentColor2, frontLayerElevation3, headerHeight3, peekHeightPx, peekHeight3, r43, frontLayerScrimColor2, r36), $composer2, 54), $composer2, ((($dirty3 << 3) & 896) | 1572864) | (($dirty3 << 3) & 7168), 51);
        Composer $composer3 = $composer2;
        if (ComposerKt.isTraceInProgress() == false) goto L325;
        ComposerKt.traceEventEnd();
    L325:
        final boolean persistentAppBar3 = persistentAppBar2;
        final Modifier modifier4 = modifier3;
        final boolean stickyFrontLayer4 = stickyFrontLayer3;
        final Shape frontLayerShape4 = frontLayerShape3;
        final long frontLayerBackgroundColor5 = frontLayerBackgroundColor4;
        final float frontLayerElevation4 = frontLayerElevation3;
        final float headerHeight4 = headerHeight3;
        final float peekHeight4 = peekHeight3;
        final long backLayerBackgroundColor5 = backLayerBackgroundColor4;
        final BackdropScaffoldState scaffoldState4 = scaffoldState3;
        final long frontLayerScrimColor3 = frontLayerScrimColor2;
        final long backLayerContentColor5 = backLayerContentColor4;
        final boolean gesturesEnabled4 = gesturesEnabled3;
        final long frontLayerContentColor3 = frontLayerContentColor2;
        final Function3<? super SnackbarHostState, ? super Composer, ? super Integer, Unit> r26 = r36;
    L327:
        ScopeUpdateScope r28 = $composer3.endRestartGroup();
        if (r28 == null) goto L331;
        final Function2<? super Composer, ? super Integer, Unit> r29 = r22;
        r28.updateScope(new BackdropScaffoldKt$BackdropScaffold$3(r29, r42, r43, modifier4, scaffoldState4, r26, gesturesEnabled4, peekHeight4, headerHeight4, persistentAppBar3, stickyFrontLayer4, backLayerBackgroundColor5, backLayerContentColor5, frontLayerShape4, frontLayerElevation4, frontLayerBackgroundColor5, frontLayerContentColor3, frontLayerScrimColor3, $changed, $changed1, r67));
        return;
    L331:
        return;
    L321:
        Object value$iv2 = (Function1) new BackdropScaffoldKt$BackdropScaffold$calculateBackLayerConstraints$1$1(headerHeightPx);
        $composer2.updateRememberedValue(value$iv2);
        it$iv = value$iv2;
        goto L322
    L310:
        if (value$iv != Composer.Companion.getEmpty()) goto L314;
    L304:
        if (($dirty & 24576) == 16384) goto L305;
        r2 = false;
        goto L307
    L295:
        frontLayerBackgroundColor3 = frontLayerBackgroundColor2;
        modifier3 = modifier2;
        frontLayerElevation3 = frontLayerElevation2;
        frontLayerScrimColor2 = frontLayerScrimColor;
        r36 = r15;
        backLayerBackgroundColor3 = backLayerBackgroundColor2;
        frontLayerShape3 = frontLayerShape2;
        long r310 = backLayerContentColor2;
        gesturesEnabled3 = gesturesEnabled2;
        stickyFrontLayer3 = stickyFrontLayer2;
        backLayerContentColor3 = r310;
        goto L296
    L291:
        frontLayerContentColor2 = frontLayerContentColor;
        goto L293
    L287:
        frontLayerBackgroundColor2 = frontLayerBackgroundColor;
        goto L289
    L283:
        frontLayerElevation2 = frontLayerElevation;
        goto L285
    L279:
        frontLayerShape2 = frontLayerShape;
        goto L281
    L275:
        backLayerContentColor2 = backLayerContentColor;
        goto L277
    L271:
        backLayerBackgroundColor2 = backLayerBackgroundColor;
        $dirty3 = $dirty2;
        goto L273
    L267:
        stickyFrontLayer2 = stickyFrontLayer;
        goto L269
    L264:
        persistentAppBar2 = persistentAppBar;
        goto L265
    L261:
        headerHeight2 = headerHeight;
        goto L262
    L257:
        peekHeight2 = peekHeight;
        goto L259
    L253:
        gesturesEnabled2 = r13;
        goto L255
    L250:
        r15 = r14;
        goto L251
    L247:
        scaffoldState2 = scaffoldState;
        goto L248
    L243:
        modifier2 = modifier;
        goto L245
    L208:
        if ($composer2.getDefaultsInvalid() == true) goto L241;
        $composer2.skipToGroupEnd();
        if ((r67 & 16) == 0) goto L214;
        $dirty = $dirty & (-57345);
    L214:
        if ((r67 & 128) == 0) goto L217;
        $dirty = $dirty & (-29360129);
    L217:
        if ((r67 & 256) == 0) goto L220;
        $dirty = $dirty & (-234881025);
    L220:
        if ((r67 & 2048) == 0) goto L222;
        $dirty2 = $dirty2 & (-113);
    L222:
        int $dirty4 = $dirty2;
        if ((r67 & 4096) == 0) goto L226;
        $dirty4 = $dirty4 & (-897);
    L226:
        if ((r67 & 8192) == 0) goto L229;
        $dirty4 = $dirty4 & (-7169);
    L229:
        if ((r67 & 16384) == 0) goto L232;
        $dirty4 = $dirty4 & (-57345);
    L232:
        if ((32768 & r67) == 0) goto L235;
        $dirty4 = $dirty4 & (-458753);
    L235:
        if ((r67 & 65536) == 0) goto L238;
        $dirty4 = $dirty4 & (-3670017);
    L238:
        if ((r67 & 131072) == 0) goto L240;
        $dirty4 = $dirty4 & (-29360129);
    L240:
        modifier3 = modifier;
        stickyFrontLayer3 = stickyFrontLayer;
        backLayerContentColor3 = backLayerContentColor;
        frontLayerShape3 = frontLayerShape;
        frontLayerElevation3 = frontLayerElevation;
        frontLayerBackgroundColor3 = frontLayerBackgroundColor;
        frontLayerContentColor2 = frontLayerContentColor;
        frontLayerScrimColor2 = frontLayerScrimColor;
        scaffoldState2 = r9;
        peekHeight2 = r11;
        headerHeight2 = r12;
        gesturesEnabled3 = r13;
        r36 = r14;
        persistentAppBar2 = persistentAppBar;
        $dirty3 = $dirty4;
        backLayerBackgroundColor3 = backLayerBackgroundColor;
        goto L296
    L326:
        r22 = r41;
        $composer3 = $composer2;
        $composer3.skipToGroupEnd();
        modifier4 = modifier;
        peekHeight4 = peekHeight;
        headerHeight4 = headerHeight;
        persistentAppBar3 = persistentAppBar;
        stickyFrontLayer4 = stickyFrontLayer;
        frontLayerElevation4 = frontLayerElevation;
        frontLayerBackgroundColor5 = frontLayerBackgroundColor;
        frontLayerContentColor3 = frontLayerContentColor;
        frontLayerScrimColor3 = frontLayerScrimColor;
        gesturesEnabled4 = r13;
        r26 = r14;
        scaffoldState4 = scaffoldState;
        backLayerBackgroundColor5 = backLayerBackgroundColor;
        backLayerContentColor5 = backLayerContentColor;
        frontLayerShape4 = frontLayerShape;
        goto L327
    L199:
        if (($dirty2 & 4793491) != 4793490) goto L202;
        r0 = false;
        goto L204
    L114:
        if (($changed1 & 6) != 0) goto L122;
        if ($composer2.changed(stickyFrontLayer) == false) goto L118;
        int r111 = 4;
    L119:
        $dirty1 = $dirty1 | r111;
        goto L122
    L118:
        r111 = 2;
        goto L119
    L103:
        if (($changed & 805306368) != 0) goto L110;
        if ($composer2.changed(persistentAppBar) == false) goto L107;
        int r31 = 536870912;
    L108:
        $dirty = $dirty | r31;
        goto L110
    L107:
        r31 = 268435456;
        goto L108
    L91:
        if ((r67 & 256) != 0) goto L95;
        r12 = headerHeight;
        if ($composer2.changed(r12) == false) goto L96;
        int r210 = AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
    L97:
        $dirty = $dirty | r210;
    L96:
        r210 = 33554432;
        goto L97
    L95:
        r12 = headerHeight;
        goto L96
    L80:
        if ((r67 & 128) != 0) goto L84;
        r11 = peekHeight;
        if ($composer2.changed(r11) == false) goto L85;
        int r211 = 8388608;
    L86:
        $dirty = $dirty | r211;
    L85:
        r211 = 4194304;
        goto L86
    L84:
        r11 = peekHeight;
        goto L85
    L70:
        if (($changed & 1572864) != 0) goto L76;
        r13 = gesturesEnabled;
        if ($composer2.changed(r13) == false) goto L74;
        int r212 = 1048576;
    L75:
        $dirty = $dirty | r212;
        goto L78
    L74:
        r212 = 524288;
        goto L75
    L76:
        r13 = gesturesEnabled;
        goto L78
    L59:
        if (($changed & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) != 0) goto L65;
        r14 = r46;
        if ($composer2.changedInstance(r14) == false) goto L63;
        int r213 = 131072;
    L64:
        $dirty = $dirty | r213;
        goto L66
    L63:
        r213 = 65536;
        goto L64
    L65:
        r14 = r46;
        goto L66
    L47:
        if ((r67 & 16) != 0) goto L51;
        r9 = scaffoldState;
        if ($composer2.changed(r9) == false) goto L52;
        int r214 = 16384;
    L53:
        $dirty = $dirty | r214;
    L52:
        r214 = 8192;
        goto L53
    L51:
        r9 = scaffoldState;
        goto L52
    L37:
        if (($changed & 3072) != 0) goto L44;
        if ($composer2.changed(modifier) == false) goto L41;
        int r112 = 2048;
    L42:
        $dirty = $dirty | r112;
        goto L44
    L41:
        r112 = 1024;
        goto L42
    L26:
        if (($changed & 384) != 0) goto L33;
        if ($composer2.changedInstance(r43) == false) goto L30;
        int r30 = 256;
    L31:
        $dirty = $dirty | r30;
        goto L33
    L30:
        r30 = 128;
        goto L31
    L16:
        if (($changed & 48) != 0) goto L23;
        if ($composer2.changedInstance(r42) == false) goto L20;
        int r32 = 32;
    L21:
        $dirty = $dirty | r32;
        goto L23
    L20:
        r32 = 16;
        goto L21
    L6:
        if (($changed & 6) != 0) goto L13;
        if ($composer2.changedInstance(r41) == false) goto L10;
        int r33 = 4;
    L11:
        $dirty = $dirty | r33;
        goto L13
    L10:
        r33 = 2;
        goto L11
    }

    /* JADX INFO: renamed from: Scrim-3J-VO9M, reason: not valid java name */
    private static final void m1536Scrim3JVO9M(final long color, final Function0<Unit> r24, final boolean visible, Composer $composer, final int $changed) {
        Composer $composer2 = $composer.startRestartGroup(-92141505);
        ComposerKt.sourceInformation($composer2, "C(Scrim)P(0:c#ui.graphics.Color):BackdropScaffold.kt#jmzs0o");
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
    L73:
        ScopeUpdateScope r6 = $composer2.endRestartGroup();
        if (r6 == null) goto L77;
        r6.updateScope(new BackdropScaffoldKt$Scrim$2(color, r24, visible, $changed));
        return;
    L77:
        return;
    L30:
        if (ComposerKt.isTraceInProgress() == false) goto L33;
        ComposerKt.traceEventStart(-92141505, $dirty, -1, "androidx.compose.material.Scrim (BackdropScaffold.kt:494)");
    L33:
        if (color == 16) goto L35;
        int r0 = 1;
    L36:
        if (r0 == 0) goto L68;
        $composer2.startReplaceGroup(478794687);
        ComposerKt.sourceInformation($composer2, "497@22133L87,504@22481L62,504@22428L115");
        if (visible == false) goto L40;
        int $dirty2 = 1065353216;
    L41:
        int $dirty3 = $dirty;
        final State<Float> r11 = AnimateAsStateKt.animateFloatAsState($dirty2, new TweenSpec(0, 0, null, 7, null), 0.0f, null, null, $composer2, 48, 28);
        if (visible == false) goto L55;
        $composer2.startReplaceGroup(478960289);
        ComposerKt.sourceInformation($composer2, "500@22322L37");
        Modifier.Companion r12 = Modifier.Companion;
        Unit r13 = Unit.INSTANCE;
        ComposerKt.sourceInformationMarkerStart($composer2, 1262377733, "CC(remember):BackdropScaffold.kt#9igjgp");
        if (($dirty3 & 112) != 32) goto L46;
        boolean invalid$iv = true;
    L47:
        BackdropScaffoldKt$Scrim$dismissModifier$1$1 value$iv = $composer2.rememberedValue();
        if (invalid$iv == false) goto L50;
    L53:
        value$iv = new BackdropScaffoldKt$Scrim$dismissModifier$1$1(r24, null);
        $composer2.updateRememberedValue(value$iv);
    L54:
        ComposerKt.sourceInformationMarkerEnd($composer2);
        Modifier.Companion dismissModifier = SuspendingPointerInputFilterKt.pointerInput(r12, r13, (Function2) value$iv);
        $composer2.endReplaceGroup();
    L56:
        Modifier r14 = SizeKt.fillMaxSize$default(Modifier.Companion, 0.0f, 1, null).then(dismissModifier);
        ComposerKt.sourceInformationMarkerStart($composer2, 1262382846, "CC(remember):BackdropScaffold.kt#9igjgp");
        if (($dirty3 & 14) != 4) goto L59;
        boolean r15 = true;
    L60:
        boolean invalid$iv2 = $composer2.changed(r11) | r15;
        Object it$iv = $composer2.rememberedValue();
        if (invalid$iv2 == false) goto L63;
    L66:
        Object value$iv2 = (Function1) new BackdropScaffoldKt$Scrim$1$1(color, r11);
        $composer2.updateRememberedValue(value$iv2);
        it$iv = value$iv2;
    L67:
        ComposerKt.sourceInformationMarkerEnd($composer2);
        CanvasKt.Canvas(r14, (Function1) it$iv, $composer2, 0);
        $composer2.endReplaceGroup();
    L70:
        if (ComposerKt.isTraceInProgress() == false) goto L73;
        ComposerKt.traceEventEnd();
        goto L73
    L63:
        if (it$iv != Composer.Companion.getEmpty()) goto L67;
    L59:
        r15 = false;
        goto L60
    L50:
        if (value$iv != Composer.Companion.getEmpty()) goto L54;
    L46:
        invalid$iv = false;
        goto L47
    L55:
        $composer2.startReplaceGroup(479060698);
        $composer2.endReplaceGroup();
        dismissModifier = Modifier.Companion;
        goto L56
    L40:
        $dirty2 = 0;
        goto L41
    L68:
        $composer2.startReplaceGroup(479228098);
        $composer2.endReplaceGroup();
        goto L70
    L35:
        r0 = 0;
        goto L36
    L26:
        r10 = false;
        goto L28
    }

    private static final float Scrim_3J_VO9M$lambda$7(State<Float> r4) {
        return r4.getValue().floatValue();
    }

    private static final void BackLayerTransition(final BackdropValue target, final Function2<? super Composer, ? super Integer, Unit> r62, final Function2<? super Composer, ? super Integer, Unit> r63, Composer $composer, final int $changed) {
        Composer $composer2 = $composer.startRestartGroup(-950970976);
        ComposerKt.sourceInformation($composer2, "C(BackLayerTransition)P(2)524@23172L132,*528@23354L7,530@23400L1451:BackdropScaffold.kt#jmzs0o");
        int $dirty = $changed;
        if (($changed & 6) != 0) goto L10;
        if ($composer2.changed(target) == false) goto L7;
        int r6 = 4;
    L8:
        $dirty = $dirty | r6;
        goto L10
    L7:
        r6 = 2;
    L10:
        if (($changed & 48) != 0) goto L17;
        if ($composer2.changedInstance(r62) == false) goto L14;
        int r7 = 32;
    L15:
        $dirty = $dirty | r7;
        goto L17
    L14:
        r7 = 16;
    L17:
        if (($changed & 384) == 0) goto L19;
    L23:
        int $dirty2 = $dirty;
        if (($dirty2 & 147) == 146) goto L26;
        boolean r5 = true;
    L28:
        if ($composer2.shouldExecute(r5, $dirty2 & 1) == true) goto L30;
        Composer $composer3 = $composer2;
        $composer3.skipToGroupEnd();
    L117:
        ScopeUpdateScope r0 = $composer3.endRestartGroup();
        if (r0 == null) goto L121;
        r0.updateScope(new AnonymousClass2(target, r62, r63, $changed));
        return;
    L121:
        return;
    L30:
        if (ComposerKt.isTraceInProgress() == false) goto L33;
        ComposerKt.traceEventStart(-950970976, $dirty2, -1, "androidx.compose.material.BackLayerTransition (BackdropScaffold.kt:520)");
    L33:
        if (target != BackdropValue.Revealed) goto L35;
        float r4 = 0.0f;
    L36:
        final State<Float> r8 = AnimateAsStateKt.animateFloatAsState(r4, new TweenSpec(0, 0, null, 7, null), 0.0f, null, null, $composer2, 48, 28);
        ProvidableCompositionLocal<Density> r9 = CompositionLocalsKt.getLocalDensity();
        ComposerKt.sourceInformationMarkerStart($composer2, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
        Object r10 = $composer2.consume(r9);
        ComposerKt.sourceInformationMarkerEnd($composer2);
        Density $this$BackLayerTransition_u24lambda_u2411 = (Density) r10;
        final float animationSlideOffset = $this$BackLayerTransition_u24lambda_u2411.mo376toPx0680j_4(AnimationSlideOffset);
        ComposerKt.sourceInformationMarkerStart($composer2, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
        Modifier modifier$iv = Modifier.Companion;
        Alignment contentAlignment$iv = Alignment.Companion.getTopStart();
        MeasurePolicy measurePolicy$iv = BoxKt.maybeCachedBoxMeasurePolicy(contentAlignment$iv, false);
        int $changed$iv$iv = (0 << 3) & 112;
        ComposerKt.sourceInformationMarkerStart($composer2, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
        int compositeKeyHash$iv$iv = ComposablesKt.getCurrentCompositeKeyHash($composer2, 0);
        CompositionLocalMap localMap$iv$iv = $composer2.getCurrentCompositionLocalMap();
        Modifier materialized$iv$iv = ComposedModifierKt.materializeModifier($composer2, modifier$iv);
        Function0<ComposeUiNode> r23 = ComposeUiNode.Companion.getConstructor();
        int $changed$iv$iv$iv = (($changed$iv$iv << 6) & 896) | 6;
        ComposerKt.sourceInformationMarkerStart($composer2, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
        if (($composer2.getApplier() instanceof Applier) == true) goto L39;
        ComposablesKt.invalidApplier();
    L39:
        $composer2.startReusableNode();
        if ($composer2.getInserting() == false) goto L42;
        Function0<ComposeUiNode> r11 = r23;
        $composer2.createNode(r11);
    L43:
        $composer3 = $composer2;
        Composer $this$Layout_u24lambda_u240$iv$iv = Updater.m3808constructorimpl($composer3);
        Updater.m3815setimpl($this$Layout_u24lambda_u240$iv$iv, measurePolicy$iv, ComposeUiNode.Companion.getSetMeasurePolicy());
        Updater.m3815setimpl($this$Layout_u24lambda_u240$iv$iv, localMap$iv$iv, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> r12 = ComposeUiNode.Companion.getSetCompositeKeyHash();
        if ($this$Layout_u24lambda_u240$iv$iv.getInserting() == true) goto L49;
        int $dirty3 = $dirty2;
        if (Intrinsics.areEqual($this$Layout_u24lambda_u240$iv$iv.rememberedValue(), Integer.valueOf(compositeKeyHash$iv$iv)) == true) goto L51;
    L50:
        $this$Layout_u24lambda_u240$iv$iv.updateRememberedValue(Integer.valueOf(compositeKeyHash$iv$iv));
        $this$Layout_u24lambda_u240$iv$iv.apply(Integer.valueOf(compositeKeyHash$iv$iv), r12);
    L51:
        Updater.m3815setimpl($this$Layout_u24lambda_u240$iv$iv, materialized$iv$iv, ComposeUiNode.Companion.getSetModifier());
        int r13 = ($changed$iv$iv$iv >> 6) & 14;
        ComposerKt.sourceInformationMarkerStart($composer3, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
        BoxScopeInstance r30 = BoxScopeInstance.INSTANCE;
        int r32 = ((0 >> 6) & 112) | 6;
        ComposerKt.sourceInformationMarkerStart($composer3, -1148084396, "C532@23447L351,539@23830L218,531@23414L677,549@24195L353,556@24580L221,547@24100L745:BackdropScaffold.kt#jmzs0o");
        Modifier.Companion r14 = Modifier.Companion;
        ComposerKt.sourceInformationMarkerStart($composer3, -452677001, "CC(remember):BackdropScaffold.kt#9igjgp");
        boolean invalid$iv = $composer3.changed(r8);
        Object value$iv = $composer3.rememberedValue();
        if (invalid$iv == true) goto L58;
        if (value$iv == Composer.Companion.getEmpty()) goto L58;
    L59:
        ComposerKt.sourceInformationMarkerEnd($composer3);
        Modifier r15 = LayoutModifierKt.layout(r14, (Function3) value$iv);
        ComposerKt.sourceInformationMarkerStart($composer3, -452664878, "CC(remember):BackdropScaffold.kt#9igjgp");
        boolean invalid$iv2 = $composer3.changed(r8) | $composer3.changed(animationSlideOffset);
        Object value$iv2 = $composer3.rememberedValue();
        if (invalid$iv2 == true) goto L66;
        if (value$iv2 == Composer.Companion.getEmpty()) goto L66;
    L67:
        ComposerKt.sourceInformationMarkerEnd($composer3);
        Modifier modifier$iv2 = GraphicsLayerModifierKt.graphicsLayer(r15, (Function1) value$iv2);
        ComposerKt.sourceInformationMarkerStart($composer3, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
        Alignment contentAlignment$iv2 = Alignment.Companion.getTopStart();
        MeasurePolicy measurePolicy$iv2 = BoxKt.maybeCachedBoxMeasurePolicy(contentAlignment$iv2, false);
        int $changed$iv$iv2 = (0 << 3) & 112;
        ComposerKt.sourceInformationMarkerStart($composer3, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
        int compositeKeyHash$iv$iv2 = ComposablesKt.getCurrentCompositeKeyHash($composer3, 0);
        CompositionLocalMap localMap$iv$iv2 = $composer3.getCurrentCompositionLocalMap();
        Modifier materialized$iv$iv2 = ComposedModifierKt.materializeModifier($composer3, modifier$iv2);
        Function0<ComposeUiNode> r49 = ComposeUiNode.Companion.getConstructor();
        int $changed$iv$iv$iv2 = (($changed$iv$iv2 << 6) & 896) | 6;
        ComposerKt.sourceInformationMarkerStart($composer3, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
        if (($composer3.getApplier() instanceof Applier) == true) goto L70;
        ComposablesKt.invalidApplier();
    L70:
        $composer3.startReusableNode();
        if ($composer3.getInserting() == false) goto L73;
        Function0<ComposeUiNode> r16 = r49;
        $composer3.createNode(r16);
    L74:
        Composer $this$Layout_u24lambda_u240$iv$iv2 = Updater.m3808constructorimpl($composer3);
        Updater.m3815setimpl($this$Layout_u24lambda_u240$iv$iv2, measurePolicy$iv2, ComposeUiNode.Companion.getSetMeasurePolicy());
        Updater.m3815setimpl($this$Layout_u24lambda_u240$iv$iv2, localMap$iv$iv2, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> r1 = ComposeUiNode.Companion.getSetCompositeKeyHash();
        if ($this$Layout_u24lambda_u240$iv$iv2.getInserting() == true) goto L81;
        if (Intrinsics.areEqual($this$Layout_u24lambda_u240$iv$iv2.rememberedValue(), Integer.valueOf(compositeKeyHash$iv$iv2)) == false) goto L81;
    L82:
        Updater.m3815setimpl($this$Layout_u24lambda_u240$iv$iv2, materialized$iv$iv2, ComposeUiNode.Companion.getSetModifier());
        int r2 = ($changed$iv$iv$iv2 >> 6) & 14;
        ComposerKt.sourceInformationMarkerStart($composer3, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
        BoxScopeInstance r17 = BoxScopeInstance.INSTANCE;
        int r53 = ((0 >> 6) & 112) | 6;
        ComposerKt.sourceInformationMarkerStart($composer3, 799735428, "C545@24073L8:BackdropScaffold.kt#jmzs0o");
        r62.invoke($composer3, Integer.valueOf(($dirty3 >> 3) & 14));
        ComposerKt.sourceInformationMarkerEnd($composer3);
        ComposerKt.sourceInformationMarkerEnd($composer3);
        $composer3.endNode();
        ComposerKt.sourceInformationMarkerEnd($composer3);
        ComposerKt.sourceInformationMarkerEnd($composer3);
        ComposerKt.sourceInformationMarkerEnd($composer3);
        Modifier.Companion r3 = Modifier.Companion;
        ComposerKt.sourceInformationMarkerStart($composer3, -452653063, "CC(remember):BackdropScaffold.kt#9igjgp");
        boolean invalid$iv3 = $composer3.changed(r8);
        Object it$iv = $composer3.rememberedValue();
        if (invalid$iv3 == true) goto L89;
        if (it$iv == Composer.Companion.getEmpty()) goto L89;
    L90:
        ComposerKt.sourceInformationMarkerEnd($composer3);
        Modifier r18 = LayoutModifierKt.layout(r3, (Function3) it$iv);
        ComposerKt.sourceInformationMarkerStart($composer3, -452640875, "CC(remember):BackdropScaffold.kt#9igjgp");
        boolean invalid$iv4 = $composer3.changed(r8) | $composer3.changed(animationSlideOffset);
        Object it$iv2 = $composer3.rememberedValue();
        if (invalid$iv4 == true) goto L97;
        if (it$iv2 == Composer.Companion.getEmpty()) goto L97;
    L98:
        ComposerKt.sourceInformationMarkerEnd($composer3);
        Modifier modifier$iv3 = GraphicsLayerModifierKt.graphicsLayer(r18, (Function1) it$iv2);
        ComposerKt.sourceInformationMarkerStart($composer3, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
        Alignment contentAlignment$iv3 = Alignment.Companion.getTopStart();
        MeasurePolicy measurePolicy$iv3 = BoxKt.maybeCachedBoxMeasurePolicy(contentAlignment$iv3, false);
        int $changed$iv$iv3 = (0 << 3) & 112;
        ComposerKt.sourceInformationMarkerStart($composer3, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
        int compositeKeyHash$iv$iv3 = ComposablesKt.getCurrentCompositeKeyHash($composer3, 0);
        CompositionLocalMap localMap$iv$iv3 = $composer3.getCurrentCompositionLocalMap();
        Modifier materialized$iv$iv3 = ComposedModifierKt.materializeModifier($composer3, modifier$iv3);
        Function0<ComposeUiNode> r20 = ComposeUiNode.Companion.getConstructor();
        int $changed$iv$iv$iv3 = (($changed$iv$iv3 << 6) & 896) | 6;
        ComposerKt.sourceInformationMarkerStart($composer3, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
        if (($composer3.getApplier() instanceof Applier) == true) goto L101;
        ComposablesKt.invalidApplier();
    L101:
        $composer3.startReusableNode();
        if ($composer3.getInserting() == false) goto L104;
        Function0<ComposeUiNode> r19 = r20;
        $composer3.createNode(r19);
    L105:
        Composer $this$Layout_u24lambda_u240$iv$iv3 = Updater.m3808constructorimpl($composer3);
        Updater.m3815setimpl($this$Layout_u24lambda_u240$iv$iv3, measurePolicy$iv3, ComposeUiNode.Companion.getSetMeasurePolicy());
        Updater.m3815setimpl($this$Layout_u24lambda_u240$iv$iv3, localMap$iv$iv3, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> r21 = ComposeUiNode.Companion.getSetCompositeKeyHash();
        if ($this$Layout_u24lambda_u240$iv$iv3.getInserting() == true) goto L112;
        if (Intrinsics.areEqual($this$Layout_u24lambda_u240$iv$iv3.rememberedValue(), Integer.valueOf(compositeKeyHash$iv$iv3)) == false) goto L112;
    L113:
        Updater.m3815setimpl($this$Layout_u24lambda_u240$iv$iv3, materialized$iv$iv3, ComposeUiNode.Companion.getSetModifier());
        int r22 = ($changed$iv$iv$iv3 >> 6) & 14;
        ComposerKt.sourceInformationMarkerStart($composer3, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
        BoxScopeInstance r24 = BoxScopeInstance.INSTANCE;
        int r110 = ((0 >> 6) & 112) | 6;
        ComposerKt.sourceInformationMarkerStart($composer3, 800482435, "C562@24826L9:BackdropScaffold.kt#jmzs0o");
        r63.invoke($composer3, Integer.valueOf(($dirty3 >> 6) & 14));
        ComposerKt.sourceInformationMarkerEnd($composer3);
        ComposerKt.sourceInformationMarkerEnd($composer3);
        $composer3.endNode();
        ComposerKt.sourceInformationMarkerEnd($composer3);
        ComposerKt.sourceInformationMarkerEnd($composer3);
        ComposerKt.sourceInformationMarkerEnd($composer3);
        ComposerKt.sourceInformationMarkerEnd($composer3);
        ComposerKt.sourceInformationMarkerEnd($composer3);
        $composer3.endNode();
        ComposerKt.sourceInformationMarkerEnd($composer3);
        ComposerKt.sourceInformationMarkerEnd($composer3);
        ComposerKt.sourceInformationMarkerEnd($composer3);
        if (ComposerKt.isTraceInProgress() == false) goto L117;
        ComposerKt.traceEventEnd();
    L112:
        $this$Layout_u24lambda_u240$iv$iv3.updateRememberedValue(Integer.valueOf(compositeKeyHash$iv$iv3));
        $this$Layout_u24lambda_u240$iv$iv3.apply(Integer.valueOf(compositeKeyHash$iv$iv3), r21);
        goto L113
    L104:
        r19 = r20;
        $composer3.useNode();
    L97:
        Object value$iv3 = (Function1) new BackdropScaffoldKt$BackLayerTransition$1$5$1(animationSlideOffset, r8);
        $composer3.updateRememberedValue(value$iv3);
        it$iv2 = value$iv3;
    L89:
        Object value$iv4 = (Function3) new BackdropScaffoldKt$BackLayerTransition$1$4$1(r8);
        $composer3.updateRememberedValue(value$iv4);
        it$iv = value$iv4;
    L81:
        $this$Layout_u24lambda_u240$iv$iv2.updateRememberedValue(Integer.valueOf(compositeKeyHash$iv$iv2));
        $this$Layout_u24lambda_u240$iv$iv2.apply(Integer.valueOf(compositeKeyHash$iv$iv2), r1);
        goto L82
    L73:
        r16 = r49;
        $composer3.useNode();
    L66:
        value$iv2 = (Function1) new BackdropScaffoldKt$BackLayerTransition$1$2$1(animationSlideOffset, r8);
        $composer3.updateRememberedValue(value$iv2);
    L58:
        value$iv = (Function3) new BackdropScaffoldKt$BackLayerTransition$1$1$1(r8);
        $composer3.updateRememberedValue(value$iv);
        goto L59
    L49:
        $dirty3 = $dirty2;
        goto L50
    L42:
        r11 = r23;
        $composer2.useNode();
        goto L43
    L35:
        r4 = 2.0f;
        goto L36
    L26:
        r5 = false;
        goto L28
    L19:
        if ($composer2.changedInstance(r63) == false) goto L21;
        int r25 = 256;
    L22:
        $dirty = $dirty | r25;
        goto L23
    L21:
        r25 = 128;
        goto L22
    }

    private static final float BackLayerTransition$lambda$10(State<Float> r4) {
        return r4.getValue().floatValue();
    }

    private static final void BackdropStack(final Modifier modifier, final Function2<? super Composer, ? super Integer, Unit> r10, final Function1<? super Constraints, Constraints> r11, final Function4<? super Constraints, ? super Float, ? super Composer, ? super Integer, Unit> r12, Composer $composer, final int $changed) {
        Composer $composer2 = $composer.startRestartGroup(-1248995194);
        ComposerKt.sourceInformation($composer2, "C(BackdropStack)P(3)574@25114L896,574@25087L923:BackdropScaffold.kt#jmzs0o");
        int $dirty = $changed;
        if (($changed & 6) != 0) goto L10;
        if ($composer2.changed(modifier) == false) goto L7;
        int r2 = 4;
    L8:
        $dirty = $dirty | r2;
        goto L10
    L7:
        r2 = 2;
    L10:
        if (($changed & 48) != 0) goto L17;
        if ($composer2.changedInstance(r10) == false) goto L14;
        int r3 = 32;
    L15:
        $dirty = $dirty | r3;
        goto L17
    L14:
        r3 = 16;
    L17:
        if (($changed & 384) != 0) goto L24;
        if ($composer2.changedInstance(r11) == false) goto L21;
        int r4 = 256;
    L22:
        $dirty = $dirty | r4;
        goto L24
    L21:
        r4 = 128;
    L24:
        if (($changed & 3072) == 0) goto L26;
    L30:
        boolean r7 = true;
        if (($dirty & 1171) == 1170) goto L33;
        boolean r5 = true;
    L35:
        if ($composer2.shouldExecute(r5, $dirty & 1) == true) goto L37;
        $composer2.skipToGroupEnd();
    L62:
        ScopeUpdateScope r0 = $composer2.endRestartGroup();
        if (r0 == null) goto L66;
        r0.updateScope(new C04192(modifier, r10, r11, r12, $changed));
        return;
    L66:
        return;
    L37:
        if (ComposerKt.isTraceInProgress() == false) goto L39;
        ComposerKt.traceEventStart(-1248995194, $dirty, -1, "androidx.compose.material.BackdropStack (BackdropScaffold.kt:573)");
    L39:
        ComposerKt.sourceInformationMarkerStart($composer2, -1431300756, "CC(remember):BackdropScaffold.kt#9igjgp");
        if (($dirty & 112) != 32) goto L42;
        boolean r1 = true;
    L44:
        if (($dirty & 896) != 256) goto L46;
        boolean r6 = true;
    L47:
        boolean r8 = r1 | r6;
        if (($dirty & 7168) == 2048) goto L51;
        r7 = false;
    L51:
        boolean invalid$iv = r8 | r7;
        Object it$iv = $composer2.rememberedValue();
        if (invalid$iv == false) goto L54;
    L57:
        Object value$iv = (Function2) new BackdropScaffoldKt$BackdropStack$1$1(r10, r11, r12);
        $composer2.updateRememberedValue(value$iv);
        it$iv = value$iv;
    L58:
        ComposerKt.sourceInformationMarkerEnd($composer2);
        SubcomposeLayoutKt.SubcomposeLayout(modifier, (Function2) it$iv, $composer2, $dirty & 14, 0);
        if (ComposerKt.isTraceInProgress() == false) goto L62;
        ComposerKt.traceEventEnd();
        goto L62
    L54:
        if (it$iv != Composer.Companion.getEmpty()) goto L58;
    L46:
        r6 = false;
        goto L47
    L42:
        r1 = false;
        goto L44
    L33:
        r5 = false;
        goto L35
    L26:
        if ($composer2.changedInstance(r12) == false) goto L28;
        int r9 = 2048;
    L29:
        $dirty = $dirty | r9;
        goto L30
    L28:
        r9 = 1024;
        goto L29
    }

    static {
        AnimationSlideOffset = Dp.m6973constructorimpl(20);
        VelocityThreshold = Dp.m6973constructorimpl(125);
        PositionalThreshold = Dp.m6973constructorimpl(56);
    }

    public static final NestedScrollConnection ConsumeSwipeNestedScrollConnection(AnchoredDraggableState<?> r1, Orientation orientation) {
        return new C04201(r1, orientation);
    }
}
