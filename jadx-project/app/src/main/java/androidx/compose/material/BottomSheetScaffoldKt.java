package androidx.compose.material;

import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.CornerBasedShape;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.saveable.RememberSaveableKt;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.input.nestedscroll.NestedScrollConnection;
import androidx.compose.ui.input.nestedscroll.NestedScrollSource;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MultiContentMeasurePolicy;
import androidx.compose.ui.layout.MultiContentMeasurePolicyKt;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.Velocity;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import androidx.profileinstaller.ProfileVerifier;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: BottomSheetScaffold.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0092\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001ar\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u00012\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u00012\b\b\u0002\u0010\u0012\u001a\u00020\u00132\u001c\u0010\u0014\u001a\u0018\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00060\u0015¢\u0006\u0002\b\u0017¢\u0006\u0002\b\u0018H\u0003ø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\u001a\u001a\u0080\u0002\u0010\u001b\u001a\u00020\u00062\u001c\u0010\u001c\u001a\u0018\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00060\u0015¢\u0006\u0002\b\u0017¢\u0006\u0002\b\u00182\b\b\u0002\u0010\u0012\u001a\u00020\u00132\b\b\u0002\u0010\u001d\u001a\u00020\u001e2\u0015\b\u0002\u0010\u001f\u001a\u000f\u0012\u0004\u0012\u00020\u0006\u0018\u00010 ¢\u0006\u0002\b\u00172\u0019\b\u0002\u0010!\u001a\u0013\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020\u00060\u0015¢\u0006\u0002\b\u00172\u0015\b\u0002\u0010#\u001a\u000f\u0012\u0004\u0012\u00020\u0006\u0018\u00010 ¢\u0006\u0002\b\u00172\b\b\u0002\u0010$\u001a\u00020%2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u00012\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u0011\u001a\u00020\u00012\b\b\u0002\u0010&\u001a\u00020\u000f2\b\b\u0002\u0010'\u001a\u00020\u000f2\u0017\u0010\u0014\u001a\u0013\u0012\u0004\u0012\u00020(\u0012\u0004\u0012\u00020\u00060\u0015¢\u0006\u0002\b\u0017H\u0007ø\u0001\u0000¢\u0006\u0004\b)\u0010*\u001a\u009b\u0001\u0010+\u001a\u00020\u00062\u0013\u0010\u001f\u001a\u000f\u0012\u0004\u0012\u00020\u0006\u0018\u00010 ¢\u0006\u0002\b\u00172\u0011\u0010,\u001a\r\u0012\u0004\u0012\u00020\u00060 ¢\u0006\u0002\b\u00172\u0011\u0010-\u001a\r\u0012\u0004\u0012\u00020\u00060 ¢\u0006\u0002\b\u00172\u0013\u0010#\u001a\u000f\u0012\u0004\u0012\u00020\u0006\u0018\u00010 ¢\u0006\u0002\b\u00172\u0011\u0010!\u001a\r\u0012\u0004\u0012\u00020\u00060 ¢\u0006\u0002\b\u00172\u0006\u0010\u0011\u001a\u00020\u00012\f\u0010.\u001a\b\u0012\u0004\u0012\u00020/0 2\u0006\u0010$\u001a\u00020%2\u0006\u00100\u001a\u00020\bH\u0003ø\u0001\u0000¢\u0006\u0004\b1\u00102\u001a\u001c\u00103\u001a\u0002042\n\u0010\u0007\u001a\u0006\u0012\u0002\b\u0003052\u0006\u00106\u001a\u000207H\u0002\u001a!\u00108\u001a\u00020\u001e2\b\b\u0002\u00109\u001a\u00020\b2\b\b\u0002\u0010:\u001a\u00020\"H\u0007¢\u0006\u0002\u0010;\u001a;\u0010<\u001a\u00020\b2\u0006\u0010=\u001a\u00020>2\u000e\b\u0002\u0010?\u001a\b\u0012\u0004\u0012\u00020/0@2\u0014\b\u0002\u0010A\u001a\u000e\u0012\u0004\u0012\u00020>\u0012\u0004\u0012\u00020\n0\u0015H\u0007¢\u0006\u0002\u0010B\"\u0010\u0010\u0000\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0002\"\u0010\u0010\u0003\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0002\"\u0010\u0010\u0004\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0002\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006C"}, d2 = {"BottomSheetScaffoldPositionalThreshold", "Landroidx/compose/ui/unit/Dp;", "F", "BottomSheetScaffoldVelocityThreshold", "FabSpacing", "BottomSheet", "", "state", "Landroidx/compose/material/BottomSheetState;", "sheetGesturesEnabled", "", "sheetShape", "Landroidx/compose/ui/graphics/Shape;", "sheetElevation", "sheetBackgroundColor", "Landroidx/compose/ui/graphics/Color;", "sheetContentColor", "sheetPeekHeight", "modifier", "Landroidx/compose/ui/Modifier;", "content", "Lkotlin/Function1;", "Landroidx/compose/foundation/layout/ColumnScope;", "Landroidx/compose/runtime/Composable;", "Lkotlin/ExtensionFunctionType;", "BottomSheet-dAqlCkY", "(Landroidx/compose/material/BottomSheetState;ZLandroidx/compose/ui/graphics/Shape;FJJFLandroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "BottomSheetScaffold", "sheetContent", "scaffoldState", "Landroidx/compose/material/BottomSheetScaffoldState;", "topBar", "Lkotlin/Function0;", "snackbarHost", "Landroidx/compose/material/SnackbarHostState;", "floatingActionButton", "floatingActionButtonPosition", "Landroidx/compose/material/FabPosition;", "backgroundColor", "contentColor", "Landroidx/compose/foundation/layout/PaddingValues;", "BottomSheetScaffold-HnlDQGw", "(Lkotlin/jvm/functions/Function3;Landroidx/compose/ui/Modifier;Landroidx/compose/material/BottomSheetScaffoldState;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function2;IZLandroidx/compose/ui/graphics/Shape;FJJFJJLkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;III)V", "BottomSheetScaffoldLayout", "body", "bottomSheet", "sheetOffset", "", "sheetState", "BottomSheetScaffoldLayout-HJHHjMs", "(Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;FLkotlin/jvm/functions/Function0;ILandroidx/compose/material/BottomSheetState;Landroidx/compose/runtime/Composer;I)V", "ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection", "Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;", "Landroidx/compose/material/AnchoredDraggableState;", "orientation", "Landroidx/compose/foundation/gestures/Orientation;", "rememberBottomSheetScaffoldState", "bottomSheetState", "snackbarHostState", "(Landroidx/compose/material/BottomSheetState;Landroidx/compose/material/SnackbarHostState;Landroidx/compose/runtime/Composer;II)Landroidx/compose/material/BottomSheetScaffoldState;", "rememberBottomSheetState", "initialValue", "Landroidx/compose/material/BottomSheetValue;", "animationSpec", "Landroidx/compose/animation/core/AnimationSpec;", "confirmStateChange", "(Landroidx/compose/material/BottomSheetValue;Landroidx/compose/animation/core/AnimationSpec;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)Landroidx/compose/material/BottomSheetState;", "material_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class BottomSheetScaffoldKt {
    private static final float BottomSheetScaffoldPositionalThreshold = 0.0f;
    private static final float BottomSheetScaffoldVelocityThreshold = 0.0f;
    private static final float FabSpacing = 0.0f;

    /* JADX INFO: renamed from: androidx.compose.material.BottomSheetScaffoldKt$ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection$1, reason: invalid class name */
    /* JADX INFO: compiled from: BottomSheetScaffold.kt */
    @Metadata(d1 = {"\u0000)\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0007\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J#\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0003H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007J*\u0010\b\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016ø\u0001\u0000¢\u0006\u0004\b\f\u0010\rJ\u001b\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0003H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010J\"\u0010\u0011\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0013J\u0013\u0010\u0014\u001a\u00020\u0015*\u00020\tH\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0013\u0010\u0014\u001a\u00020\u0015*\u00020\u0003H\u0003¢\u0006\u0004\b\u0018\u0010\u0017J\u0017\u0010\u0019\u001a\u00020\t*\u00020\u0015H\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0002\u0010\u001a\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u001b"}, d2 = {"androidx/compose/material/BottomSheetScaffoldKt$ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection$1", "Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;", "onPostFling", "Landroidx/compose/ui/unit/Velocity;", "consumed", "available", "onPostFling-RZ2iAVY", "(JJLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "onPostScroll", "Landroidx/compose/ui/geometry/Offset;", "source", "Landroidx/compose/ui/input/nestedscroll/NestedScrollSource;", "onPostScroll-DzOQY0M", "(JJI)J", "onPreFling", "onPreFling-QWom1Mo", "(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "onPreScroll", "onPreScroll-OzD1aCk", "(JI)J", "toFloat", "", "offsetToFloat", "(J)F", "velocityToFloat", "toOffset", "(F)J", "material_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class AnonymousClass1 implements NestedScrollConnection {
        final /* synthetic */ Orientation $orientation;
        final /* synthetic */ AnchoredDraggableState<?> $state;

        AnonymousClass1(AnchoredDraggableState<?> r1, Orientation $orientation) {
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
            if ((r10 instanceof BottomSheetScaffoldKt$ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection$1$onPreFling$1) == false) goto L7;
            BottomSheetScaffoldKt$ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection$1$onPreFling$1 r0 = (BottomSheetScaffoldKt$ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection$1$onPreFling$1) r10;
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
            r0 = new BottomSheetScaffoldKt$ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection$1$onPreFling$1(this, r10);
            goto L8
        }

        @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
        /* JADX INFO: renamed from: onPostFling-RZ2iAVY */
        public Object mo496onPostFlingRZ2iAVY(long r6, long available, Continuation<? super Velocity> r10) {
            if ((r10 instanceof BottomSheetScaffoldKt$ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection$1$onPostFling$1) == false) goto L7;
            BottomSheetScaffoldKt$ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection$1$onPostFling$1 r7 = (BottomSheetScaffoldKt$ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection$1$onPostFling$1) r10;
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
            r7 = new BottomSheetScaffoldKt$ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection$1$onPostFling$1(this, r10);
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

    /* JADX INFO: renamed from: access$BottomSheet-dAqlCkY, reason: not valid java name */
    public static final /* synthetic */ void m1561access$BottomSheetdAqlCkY(BottomSheetState state, boolean sheetGesturesEnabled, Shape sheetShape, float sheetElevation, long sheetBackgroundColor, long sheetContentColor, float sheetPeekHeight, Modifier modifier, Function3 content, Composer $composer, int $changed, int $default) {
        m1558BottomSheetdAqlCkY(state, sheetGesturesEnabled, sheetShape, sheetElevation, sheetBackgroundColor, sheetContentColor, sheetPeekHeight, modifier, content, $composer, $changed, $default);
    }

    /* JADX INFO: renamed from: access$BottomSheetScaffoldLayout-HJHHjMs, reason: not valid java name */
    public static final /* synthetic */ void m1562access$BottomSheetScaffoldLayoutHJHHjMs(Function2 topBar, Function2 body, Function2 bottomSheet, Function2 floatingActionButton, Function2 snackbarHost, float sheetPeekHeight, Function0 sheetOffset, int floatingActionButtonPosition, BottomSheetState sheetState, Composer $composer, int $changed) {
        m1560BottomSheetScaffoldLayoutHJHHjMs(topBar, body, bottomSheet, floatingActionButton, snackbarHost, sheetPeekHeight, sheetOffset, floatingActionButtonPosition, sheetState, $composer, $changed);
    }

    public static final /* synthetic */ NestedScrollConnection access$ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection(AnchoredDraggableState state, Orientation orientation) {
        return ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection(state, orientation);
    }

    public static final /* synthetic */ float access$getBottomSheetScaffoldPositionalThreshold$p() {
        return BottomSheetScaffoldPositionalThreshold;
    }

    public static final /* synthetic */ float access$getBottomSheetScaffoldVelocityThreshold$p() {
        return BottomSheetScaffoldVelocityThreshold;
    }

    public static final /* synthetic */ float access$getFabSpacing$p() {
        return FabSpacing;
    }

    public static final BottomSheetState rememberBottomSheetState(final BottomSheetValue initialValue, final AnimationSpec<Float> r10, final Function1 r11, Composer $composer, int $changed, int r14) {
        ComposerKt.sourceInformationMarkerStart($composer, 1808153344, "C(rememberBottomSheetState)P(2)225@8853L7,234@9123L210,226@8872L461:BottomSheetScaffold.kt#jmzs0o");
        if ((r14 & 2) == 0) goto L6;
        r10 = BottomSheetScaffoldDefaults.INSTANCE.getAnimationSpec();
    L6:
        if ((r14 & 4) == 0) goto L9;
        Function1 confirmStateChange = C04221.INSTANCE;
        r11 = confirmStateChange;
    L9:
        if (ComposerKt.isTraceInProgress() == false) goto L11;
        ComposerKt.traceEventStart(1808153344, $changed, -1, "androidx.compose.material.rememberBottomSheetState (BottomSheetScaffold.kt:224)");
    L11:
        ProvidableCompositionLocal<Density> r15 = CompositionLocalsKt.getLocalDensity();
        ComposerKt.sourceInformationMarkerStart($composer, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
        Object r3 = $composer.consume(r15);
        ComposerKt.sourceInformationMarkerEnd($composer);
        final Density density = (Density) r3;
        Object[] r2 = {r10};
        Saver<BottomSheetState, ?> r4 = BottomSheetState.Companion.Saver(r10, r11, density);
        ComposerKt.sourceInformationMarkerStart($composer, -1916209502, "CC(remember):BottomSheetScaffold.kt#9igjgp");
        boolean r5 = false;
        if ((($changed & 14) ^ 6) <= 4) goto L16;
        if ($composer.changed(initialValue) == false) goto L16;
    L17:
        boolean r0 = true;
    L19:
        boolean r1 = (r0 | $composer.changed(density)) | $composer.changedInstance(r10);
        if ((($changed & 896) ^ 384) <= 256) goto L24;
        if ($composer.changed(r11) == false) goto L24;
    L25:
        r5 = true;
    L26:
        boolean invalid$iv = r1 | r5;
        Object it$iv = $composer.rememberedValue();
        if (invalid$iv == false) goto L29;
    L32:
        Object value$iv = (Function0) new BottomSheetScaffoldKt$rememberBottomSheetState$2$1(initialValue, density, r10, r11);
        $composer.updateRememberedValue(value$iv);
        it$iv = value$iv;
    L33:
        ComposerKt.sourceInformationMarkerEnd($composer);
        BottomSheetState r12 = (BottomSheetState) RememberSaveableKt.m3923rememberSaveable(r2, r4, null, (Function0) it$iv, $composer, 0, 4);
        if (ComposerKt.isTraceInProgress() == false) goto L36;
        ComposerKt.traceEventEnd();
    L36:
        ComposerKt.sourceInformationMarkerEnd($composer);
        return r12;
    L29:
        if (it$iv != Composer.Companion.getEmpty()) goto L33;
    L24:
        if (($changed & 384) != 256) goto L26;
    L16:
        if (($changed & 6) == 4) goto L17;
        r0 = false;
        goto L19
    }

    public static final BottomSheetScaffoldState rememberBottomSheetScaffoldState(BottomSheetState bottomSheetState, SnackbarHostState snackbarHostState, Composer $composer, int $changed, int r12) {
        ComposerKt.sourceInformationMarkerStart($composer, -1022285988, "C(rememberBottomSheetScaffoldState)264@10017L35,265@10097L32,267@10171L196:BottomSheetScaffold.kt#jmzs0o");
        if ((r12 & 1) == 0) goto L5;
        Composer $composer2 = $composer;
        bottomSheetState = rememberBottomSheetState(BottomSheetValue.Collapsed, null, null, $composer2, 6, 6);
    L7:
        if ((r12 & 2) == 0) goto L14;
        ComposerKt.sourceInformationMarkerStart($composer2, 200091610, "CC(remember):BottomSheetScaffold.kt#9igjgp");
        Composer $this$cache$iv = $composer2;
        Object it$iv = $this$cache$iv.rememberedValue();
        if (it$iv != Composer.Companion.getEmpty()) goto L12;
        Object value$iv = new SnackbarHostState();
        $this$cache$iv.updateRememberedValue(value$iv);
        it$iv = value$iv;
    L12:
        snackbarHostState = (SnackbarHostState) it$iv;
        ComposerKt.sourceInformationMarkerEnd($composer2);
    L14:
        if (ComposerKt.isTraceInProgress() == false) goto L16;
        ComposerKt.traceEventStart(-1022285988, $changed, -1, "androidx.compose.material.rememberBottomSheetScaffoldState (BottomSheetScaffold.kt:266)");
    L16:
        ComposerKt.sourceInformationMarkerStart($composer2, 200094142, "CC(remember):BottomSheetScaffold.kt#9igjgp");
        boolean r13 = false;
        if ((($changed & 14) ^ 6) <= 4) goto L21;
        if ($composer2.changed(bottomSheetState) == false) goto L21;
    L22:
        boolean r10 = true;
    L25:
        if ((($changed & 112) ^ 48) <= 32) goto L29;
        if ($composer2.changed(snackbarHostState) == false) goto L29;
    L30:
        r13 = true;
    L31:
        boolean invalid$iv = r10 | r13;
        Composer $this$cache$iv2 = $composer2;
        Object it$iv2 = $this$cache$iv2.rememberedValue();
        if (invalid$iv == false) goto L34;
    L37:
        Object value$iv2 = new BottomSheetScaffoldState(bottomSheetState, snackbarHostState);
        $this$cache$iv2.updateRememberedValue(value$iv2);
        it$iv2 = value$iv2;
    L38:
        BottomSheetScaffoldState r1 = (BottomSheetScaffoldState) it$iv2;
        ComposerKt.sourceInformationMarkerEnd($composer2);
        if (ComposerKt.isTraceInProgress() == false) goto L41;
        ComposerKt.traceEventEnd();
    L41:
        ComposerKt.sourceInformationMarkerEnd($composer2);
        return r1;
    L34:
        if (it$iv2 != Composer.Companion.getEmpty()) goto L38;
    L29:
        if (($changed & 48) != 32) goto L31;
    L21:
        if (($changed & 6) == 4) goto L22;
        r10 = false;
        goto L25
    L5:
        $composer2 = $composer;
        goto L7
    }

    /* JADX INFO: renamed from: BottomSheetScaffold-HnlDQGw, reason: not valid java name */
    public static final void m1559BottomSheetScaffoldHnlDQGw(final Function3<? super ColumnScope, ? super Composer, ? super Integer, Unit> r33, Modifier modifier, BottomSheetScaffoldState scaffoldState, Function2<? super Composer, ? super Integer, Unit> r36, Function3<? super SnackbarHostState, ? super Composer, ? super Integer, Unit> r37, Function2<? super Composer, ? super Integer, Unit> r38, int floatingActionButtonPosition, boolean sheetGesturesEnabled, Shape sheetShape, float sheetElevation, long sheetBackgroundColor, long sheetContentColor, float sheetPeekHeight, long backgroundColor, long contentColor, final Function3<? super PaddingValues, ? super Composer, ? super Integer, Unit> r52, Composer $composer, final int $changed, final int $changed1, final int r56) {
        Composer $composer2 = $composer.startRestartGroup(-423121424);
        ComposerKt.sourceInformation($composer2, "C(BottomSheetScaffold)P(8,5,6,15,14,3,4:c#material.FabPosition,11,13,10:c#ui.unit.Dp,7:c#ui.graphics.Color,9:c#ui.graphics.Color,12:c#ui.unit.Dp,0:c#ui.graphics.Color,2:c#ui.graphics.Color)337@14344L1789,337@14258L1875:BottomSheetScaffold.kt#jmzs0o");
        int $dirty = $changed;
        if ((r56 & 1) == 0) goto L6;
        $dirty = $dirty | 6;
    L13:
        int r9 = r56 & 2;
        if (r9 == 0) goto L17;
        $dirty = $dirty | 48;
        Modifier modifier2 = modifier;
    L25:
        if (($changed & 384) == 0) goto L27;
        BottomSheetScaffoldState scaffoldState2 = scaffoldState;
    L35:
        int r16 = r56 & 8;
        int r17 = 2048;
        if (r16 == 0) goto L39;
        $dirty = $dirty | 3072;
        Function2<? super Composer, ? super Integer, Unit> r7 = r36;
    L46:
        int r19 = r56 & 16;
        int r20 = 16384;
        if (r19 == 0) goto L50;
        $dirty = $dirty | 24576;
        Function3<? super SnackbarHostState, ? super Composer, ? super Integer, Unit> r8 = r37;
    L57:
        int r23 = r56 & 32;
        if (r23 == 0) goto L61;
        $dirty = $dirty | ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
        Function2<? super Composer, ? super Integer, Unit> r10 = r38;
    L68:
        int r26 = r56 & 64;
        if (r26 == 0) goto L72;
        $dirty = $dirty | 1572864;
        int floatingActionButtonPosition2 = floatingActionButtonPosition;
    L79:
        int r14 = r56 & 128;
        if (r14 == 0) goto L83;
        $dirty = $dirty | 12582912;
        boolean sheetGesturesEnabled2 = sheetGesturesEnabled;
    L91:
        if (($changed & 100663296) != 0) goto L102;
        if ((r56 & 256) != 0) goto L98;
        if ($composer2.changed(sheetShape) == false) goto L98;
        int r31 = AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
    L99:
        $dirty = $dirty | r31;
    L98:
        r31 = 33554432;
    L102:
        if (($changed & 805306368) != 0) goto L113;
        if ((r56 & 512) != 0) goto L109;
        if ($composer2.changed(sheetElevation) == false) goto L109;
        int r32 = 536870912;
    L110:
        $dirty = $dirty | r32;
    L109:
        r32 = 268435456;
    L113:
        if (($changed1 & 6) == 0) goto L115;
        int $dirty1 = $changed1;
    L124:
        if (($changed1 & 48) != 0) goto L134;
        int $dirty2 = $dirty1;
        int $dirty3 = r56 & 2048;
        if ($dirty3 != 0) goto L131;
        if ($composer2.changed(sheetContentColor) == false) goto L131;
        int r25 = 32;
    L132:
        $dirty1 = $dirty2 | r25;
    L131:
        r25 = 16;
    L134:
        int $dirty4 = $dirty1;
        int $dirty5 = $changed1 & 384;
        if ($dirty5 == 0) goto L137;
        int $dirty6 = $dirty4;
    L146:
        if (($changed1 & 3072) != 0) goto L157;
        if ((r56 & 8192) != 0) goto L153;
        if ($composer2.changed(backgroundColor) == false) goto L153;
    L154:
        $dirty6 = $dirty6 | r17;
    L153:
        r17 = 1024;
    L157:
        if (($changed1 & 24576) != 0) goto L168;
        if ((r56 & 16384) != 0) goto L164;
        if ($composer2.changed(contentColor) == false) goto L164;
    L165:
        $dirty6 = $dirty6 | r20;
    L164:
        r20 = 8192;
    L168:
        if ((r56 & 32768) == 0) goto L171;
        $dirty6 = $dirty6 | ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
    L179:
        if ((306783379 & $dirty) == 306783378) goto L181;
    L184:
        boolean r0 = true;
    L186:
        if ($composer2.shouldExecute(r0, $dirty & 1) == false) goto L269;
        $composer2.startDefaults();
        ComposerKt.sourceInformation($composer2, "322@13422L34,328@13791L6,330@13922L6,331@13969L37,333@14122L6,334@14167L32");
        if (($changed & 1) != 0) goto L190;
    L217:
        if (r9 == 0) goto L220;
        modifier2 = Modifier.Companion;
    L220:
        if ((r56 & 4) == 0) goto L222;
        $dirty = $dirty & (-897);
        scaffoldState2 = rememberBottomSheetScaffoldState(null, null, $composer2, 0, 3);
    L222:
        if (r16 == 0) goto L224;
        Function2<? super Composer, ? super Integer, Unit> r1 = null;
    L225:
        if (r19 == 0) goto L227;
        r8 = ComposableSingletons$BottomSheetScaffoldKt.INSTANCE.m1624getLambda1$material_release();
    L227:
        if (r23 == 0) goto L229;
        r10 = null;
    L229:
        if (r26 == 0) goto L231;
        floatingActionButtonPosition2 = FabPosition.Companion.m1677getEnd5ygKITE();
    L231:
        if (r14 == 0) goto L234;
        sheetGesturesEnabled2 = true;
    L234:
        if ((r56 & 256) == 0) goto L236;
        CornerBasedShape sheetShape2 = MaterialTheme.INSTANCE.getShapes($composer2, 6).getLarge();
        $dirty = $dirty & (-234881025);
    L238:
        if ((r56 & 512) == 0) goto L240;
        float sheetElevation2 = BottomSheetScaffoldDefaults.INSTANCE.m1556getSheetElevationD9Ej5fM();
        $dirty = $dirty & (-1879048193);
    L242:
        if ((r56 & 1024) == 0) goto L244;
        $dirty6 = $dirty6 & (-15);
        long sheetBackgroundColor2 = MaterialTheme.INSTANCE.getColors($composer2, 6).m1602getSurface0d7_KjU();
    L246:
        if ((r56 & 2048) == 0) goto L248;
        long sheetContentColor2 = ColorsKt.m1616contentColorForek8zF_U(sheetBackgroundColor2, $composer2, $dirty6 & 14);
        int $dirty7 = $dirty6 & (-113);
    L250:
        if ((r56 & 4096) == 0) goto L252;
        float sheetPeekHeight2 = BottomSheetScaffoldDefaults.INSTANCE.m1557getSheetPeekHeightD9Ej5fM();
        $dirty7 = $dirty7 & (-897);
    L254:
        if ((r56 & 8192) == 0) goto L256;
        $dirty7 = $dirty7 & (-7169);
        long backgroundColor2 = MaterialTheme.INSTANCE.getColors($composer2, 6).m1591getBackground0d7_KjU();
    L258:
        if ((r56 & 16384) == 0) goto L260;
        long contentColor2 = ColorsKt.m1616contentColorForek8zF_U(backgroundColor2, $composer2, ($dirty7 >> 9) & 14);
        $dirty7 = (-57345) & $dirty7;
        long contentColor3 = contentColor2;
        r7 = r1;
        long backgroundColor3 = backgroundColor2;
        final Shape r2 = sheetShape2;
        final float sheetPeekHeight3 = sheetPeekHeight2;
    L261:
        $composer2.endDefaults();
        if (ComposerKt.isTraceInProgress() == false) goto L265;
        ComposerKt.traceEventStart(-423121424, $dirty, $dirty7, "androidx.compose.material.BottomSheetScaffold (BottomSheetScaffold.kt:336)");
    L265:
        final long sheetBackgroundColor3 = sheetBackgroundColor2;
        final Function2<? super Composer, ? super Integer, Unit> r39 = r7;
        final Function3<? super SnackbarHostState, ? super Composer, ? super Integer, Unit> r49 = r8;
        final float sheetElevation3 = sheetElevation2;
        final Function2<? super Composer, ? super Integer, Unit> r310 = r10;
        final int floatingActionButtonPosition3 = floatingActionButtonPosition2;
        final BottomSheetScaffoldState scaffoldState3 = scaffoldState2;
        final boolean sheetGesturesEnabled3 = sheetGesturesEnabled2;
        final long sheetContentColor3 = sheetContentColor2;
        float sheetPeekHeight4 = sheetPeekHeight3;
        Shape sheetShape3 = r2;
        long backgroundColor4 = backgroundColor3;
        long contentColor4 = contentColor3;
        SurfaceKt.m1782SurfaceFjzlyU(SizeKt.fillMaxSize$default(modifier2, 0.0f, 1, null), null, backgroundColor4, contentColor4, null, 0.0f, ComposableLambdaKt.rememberComposableLambda(-131096268, true, new BottomSheetScaffoldKt$BottomSheetScaffold$1(scaffoldState3, r39, r310, sheetPeekHeight3, floatingActionButtonPosition3, r52, sheetGesturesEnabled3, r2, sheetElevation3, sheetBackgroundColor3, sheetContentColor3, r33, r49), $composer2, 54), $composer2, ((($dirty7 >> 3) & 896) | 1572864) | (($dirty7 >> 3) & 7168), 50);
        Composer $composer3 = $composer2;
        if (ComposerKt.isTraceInProgress() == false) goto L268;
        ComposerKt.traceEventEnd();
    L268:
        float r3 = sheetElevation2;
        final Shape sheetShape4 = sheetShape3;
        final Function3<? super SnackbarHostState, ? super Composer, ? super Integer, Unit> r5 = r8;
        final boolean sheetGesturesEnabled4 = sheetGesturesEnabled2;
        final float sheetPeekHeight5 = sheetPeekHeight4;
        final Function2<? super Composer, ? super Integer, Unit> r6 = r10;
        final float sheetElevation4 = r3;
        final Function2<? super Composer, ? super Integer, Unit> r4 = r7;
        final int floatingActionButtonPosition4 = floatingActionButtonPosition2;
        final Modifier modifier3 = modifier2;
        final BottomSheetScaffoldState scaffoldState4 = scaffoldState2;
        final long sheetBackgroundColor4 = sheetBackgroundColor3;
        final long sheetContentColor4 = sheetContentColor3;
        final long sheetBackgroundColor5 = backgroundColor4;
        final long contentColor5 = contentColor4;
    L270:
        ScopeUpdateScope r11 = $composer3.endRestartGroup();
        if (r11 == null) goto L274;
        r11.updateScope(new BottomSheetScaffoldKt$BottomSheetScaffold$2(r33, modifier3, scaffoldState4, r4, r5, r6, floatingActionButtonPosition4, sheetGesturesEnabled4, sheetShape4, sheetElevation4, sheetBackgroundColor4, sheetContentColor4, sheetPeekHeight5, sheetBackgroundColor5, contentColor5, r52, $changed, $changed1, r56));
        return;
    L274:
        return;
    L260:
        r7 = r1;
        contentColor3 = contentColor;
        backgroundColor3 = backgroundColor2;
        r2 = sheetShape2;
        sheetPeekHeight3 = sheetPeekHeight2;
        goto L261
    L256:
        backgroundColor2 = backgroundColor;
        goto L258
    L252:
        sheetPeekHeight2 = sheetPeekHeight;
        goto L254
    L248:
        sheetContentColor2 = sheetContentColor;
        $dirty7 = $dirty6;
        goto L250
    L244:
        sheetBackgroundColor2 = sheetBackgroundColor;
        goto L246
    L240:
        sheetElevation2 = sheetElevation;
        goto L242
    L236:
        sheetShape2 = sheetShape;
        goto L238
    L224:
        r1 = r7;
        goto L225
    L190:
        if ($composer2.getDefaultsInvalid() == true) goto L217;
        $composer2.skipToGroupEnd();
        if ((r56 & 4) == 0) goto L196;
        $dirty = $dirty & (-897);
    L196:
        if ((r56 & 256) == 0) goto L199;
        $dirty = $dirty & (-234881025);
    L199:
        if ((r56 & 512) == 0) goto L202;
        $dirty = $dirty & (-1879048193);
    L202:
        if ((r56 & 1024) == 0) goto L205;
        $dirty6 = $dirty6 & (-15);
    L205:
        if ((r56 & 2048) == 0) goto L207;
        $dirty6 = $dirty6 & (-113);
    L207:
        int $dirty8 = $dirty6;
        if ((r56 & 4096) == 0) goto L211;
        $dirty8 = $dirty8 & (-897);
    L211:
        if ((r56 & 8192) == 0) goto L214;
        $dirty8 = $dirty8 & (-7169);
    L214:
        if ((r56 & 16384) == 0) goto L216;
        $dirty8 = $dirty8 & (-57345);
    L216:
        sheetElevation2 = sheetElevation;
        sheetBackgroundColor2 = sheetBackgroundColor;
        sheetContentColor2 = sheetContentColor;
        sheetPeekHeight3 = sheetPeekHeight;
        backgroundColor3 = backgroundColor;
        contentColor3 = contentColor;
        $dirty7 = $dirty8;
        r2 = sheetShape;
        goto L261
    L269:
        $composer3 = $composer2;
        $composer3.skipToGroupEnd();
        sheetShape4 = sheetShape;
        sheetBackgroundColor5 = backgroundColor;
        contentColor5 = contentColor;
        r4 = r7;
        r5 = r8;
        r6 = r10;
        floatingActionButtonPosition4 = floatingActionButtonPosition2;
        modifier3 = modifier2;
        scaffoldState4 = scaffoldState2;
        sheetGesturesEnabled4 = sheetGesturesEnabled2;
        sheetElevation4 = sheetElevation;
        sheetBackgroundColor4 = sheetBackgroundColor;
        sheetContentColor4 = sheetContentColor;
        sheetPeekHeight5 = sheetPeekHeight;
        goto L270
    L181:
        if (($dirty6 & 74899) != 74898) goto L184;
        r0 = false;
        goto L186
    L171:
        if (($changed1 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) != 0) goto L179;
        if ($composer2.changedInstance(r52) == false) goto L175;
        int r12 = 131072;
    L176:
        $dirty6 = $dirty6 | r12;
        goto L179
    L175:
        r12 = 65536;
        goto L176
    L137:
        if ((r56 & 4096) != 0) goto L142;
        if ($composer2.changed(sheetPeekHeight) == false) goto L142;
        int r29 = 256;
    L143:
        $dirty6 = $dirty4 | r29;
    L142:
        r29 = 128;
        goto L143
    L115:
        if ((r56 & 1024) != 0) goto L119;
        int $dirty9 = $changed1;
        if ($composer2.changed(sheetBackgroundColor) == false) goto L120;
        int r22 = 4;
    L121:
        $dirty1 = $dirty9 | r22;
    L120:
        r22 = 2;
        goto L121
    L119:
        $dirty9 = $changed1;
        goto L120
    L83:
        if (($changed & 12582912) != 0) goto L89;
        sheetGesturesEnabled2 = sheetGesturesEnabled;
        if ($composer2.changed(sheetGesturesEnabled2) == false) goto L87;
        int r34 = 8388608;
    L88:
        $dirty = $dirty | r34;
        goto L91
    L87:
        r34 = 4194304;
        goto L88
    L89:
        sheetGesturesEnabled2 = sheetGesturesEnabled;
        goto L91
    L72:
        if (($changed & 1572864) != 0) goto L78;
        floatingActionButtonPosition2 = floatingActionButtonPosition;
        if ($composer2.changed(floatingActionButtonPosition2) == false) goto L76;
        int r210 = 1048576;
    L77:
        $dirty = $dirty | r210;
        goto L79
    L76:
        r210 = 524288;
        goto L77
    L78:
        floatingActionButtonPosition2 = floatingActionButtonPosition;
        goto L79
    L61:
        if (($changed & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) != 0) goto L67;
        r10 = r38;
        if ($composer2.changedInstance(r10) == false) goto L65;
        int r27 = 131072;
    L66:
        $dirty = $dirty | r27;
        goto L68
    L65:
        r27 = 65536;
        goto L66
    L67:
        r10 = r38;
        goto L68
    L50:
        if (($changed & 24576) != 0) goto L56;
        r8 = r37;
        if ($composer2.changedInstance(r8) == false) goto L54;
        int r24 = 16384;
    L55:
        $dirty = $dirty | r24;
        goto L57
    L54:
        r24 = 8192;
        goto L55
    L56:
        r8 = r37;
        goto L57
    L39:
        if (($changed & 3072) != 0) goto L45;
        r7 = r36;
        if ($composer2.changedInstance(r7) == false) goto L43;
        int r110 = 2048;
    L44:
        $dirty = $dirty | r110;
        goto L46
    L43:
        r110 = 1024;
        goto L44
    L45:
        r7 = r36;
        goto L46
    L27:
        if ((r56 & 4) != 0) goto L31;
        scaffoldState2 = scaffoldState;
        if ($composer2.changed(scaffoldState2) == false) goto L32;
        int r18 = 256;
    L33:
        $dirty = $dirty | r18;
    L32:
        r18 = 128;
        goto L33
    L31:
        scaffoldState2 = scaffoldState;
        goto L32
    L17:
        if (($changed & 48) != 0) goto L23;
        modifier2 = modifier;
        if ($composer2.changed(modifier2) == false) goto L21;
        int r13 = 32;
    L22:
        $dirty = $dirty | r13;
        goto L25
    L21:
        r13 = 16;
        goto L22
    L23:
        modifier2 = modifier;
        goto L25
    L6:
        if (($changed & 6) != 0) goto L13;
        if ($composer2.changedInstance(r33) == false) goto L10;
        int r15 = 4;
    L11:
        $dirty = $dirty | r15;
        goto L13
    L10:
        r15 = 2;
        goto L11
    }

    /* JADX INFO: renamed from: BottomSheet-dAqlCkY, reason: not valid java name */
    private static final void m1558BottomSheetdAqlCkY(final BottomSheetState state, final boolean sheetGesturesEnabled, final Shape sheetShape, final float sheetElevation, final long sheetBackgroundColor, final long sheetContentColor, final float sheetPeekHeight, Modifier modifier, final Function3<? super ColumnScope, ? super Composer, ? super Integer, Unit> r37, Composer $composer, final int $changed, final int r40) {
        Composer $composer2 = $composer.startRestartGroup(-412323066);
        ComposerKt.sourceInformation($composer2, "C(BottomSheet)P(8,5,7,4:c#ui.unit.Dp,2:c#ui.graphics.Color,3:c#ui.graphics.Color,6:c#ui.unit.Dp,1)388@16515L24,*389@16581L7,392@16729L816,415@17769L893,440@18826L29,390@16621L2240:BottomSheetScaffold.kt#jmzs0o");
        int $dirty = $changed;
        if ((r40 & 1) == 0) goto L6;
        $dirty = $dirty | 6;
    L13:
        if ((r40 & 2) == 0) goto L16;
        $dirty = $dirty | 48;
    L24:
        if ((r40 & 4) == 0) goto L27;
        $dirty = $dirty | 384;
    L35:
        if ((r40 & 8) == 0) goto L38;
        $dirty = $dirty | 3072;
    L46:
        if ((r40 & 16) == 0) goto L49;
        $dirty = $dirty | 24576;
    L57:
        if ((r40 & 32) == 0) goto L60;
        $dirty = $dirty | ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
    L68:
        if ((r40 & 64) == 0) goto L71;
        $dirty = $dirty | 1572864;
    L77:
        int r8 = r40 & 128;
        if (r8 == 0) goto L81;
        $dirty = $dirty | 12582912;
        final Modifier modifier2 = modifier;
    L89:
        if ((r40 & 256) == 0) goto L92;
        $dirty = $dirty | 100663296;
    L98:
        int $dirty2 = $dirty;
        if ((38347923 & $dirty2) == 38347922) goto L101;
        boolean r3 = true;
    L103:
        if ($composer2.shouldExecute(r3, $dirty2 & 1) == false) goto L140;
        if (r8 == 0) goto L106;
        Modifier.Companion modifier3 = Modifier.Companion;
    L108:
        if (ComposerKt.isTraceInProgress() == false) goto L110;
        ComposerKt.traceEventStart(-412323066, $dirty2, -1, "androidx.compose.material.BottomSheet (BottomSheetScaffold.kt:387)");
    L110:
        ComposerKt.sourceInformationMarkerStart($composer2, 773894976, "CC(rememberCoroutineScope)558@25470L68:Effects.kt#9igjgp");
        ComposerKt.sourceInformationMarkerStart($composer2, -954203484, "CC(remember):Effects.kt#9igjgp");
        Object value$iv$iv = $composer2.rememberedValue();
        if (value$iv$iv != Composer.Companion.getEmpty()) goto L114;
        value$iv$iv = EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, $composer2);
        $composer2.updateRememberedValue(value$iv$iv);
    L114:
        final CoroutineScope scope = (CoroutineScope) value$iv$iv;
        ComposerKt.sourceInformationMarkerEnd($composer2);
        ComposerKt.sourceInformationMarkerEnd($composer2);
        ProvidableCompositionLocal<Density> r4 = CompositionLocalsKt.getLocalDensity();
        ComposerKt.sourceInformationMarkerStart($composer2, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
        Object r9 = $composer2.consume(r4);
        ComposerKt.sourceInformationMarkerEnd($composer2);
        Density $this$BottomSheet_dAqlCkY_u24lambda_u243 = (Density) r9;
        final float peekHeightPx = $this$BottomSheet_dAqlCkY_u24lambda_u243.mo376toPx0680j_4(sheetPeekHeight);
        AnchoredDraggableState<BottomSheetValue> r5 = state.getAnchoredDraggableState$material_release();
        Orientation r6 = Orientation.Vertical;
        ComposerKt.sourceInformationMarkerStart($composer2, -1416605410, "CC(remember):BottomSheetScaffold.kt#9igjgp");
        boolean r10 = $composer2.changed(peekHeightPx);
        if (($dirty2 & 14) != 4) goto L117;
        boolean r7 = true;
    L118:
        boolean invalid$iv = r10 | r7;
        Object value$iv = $composer2.rememberedValue();
        if (invalid$iv == false) goto L121;
    L124:
        value$iv = (Function2) new BottomSheetScaffoldKt$BottomSheet$1$1(state, peekHeightPx);
        $composer2.updateRememberedValue(value$iv);
    L125:
        ComposerKt.sourceInformationMarkerEnd($composer2);
        Modifier r11 = AnchoredDraggableKt.anchoredDraggable$default(AnchoredDraggableKt.draggableAnchors(modifier3, r5, r6, (Function2) value$iv), state.getAnchoredDraggableState$material_release(), Orientation.Vertical, sheetGesturesEnabled, false, null, false, 56, null);
        ComposerKt.sourceInformationMarkerStart($composer2, -1416572053, "CC(remember):BottomSheetScaffold.kt#9igjgp");
        if (($dirty2 & 14) != 4) goto L128;
        boolean r12 = true;
    L129:
        boolean invalid$iv2 = r12 | $composer2.changedInstance(scope);
        Object it$iv = $composer2.rememberedValue();
        if (invalid$iv2 == false) goto L132;
    L135:
        Object value$iv2 = (Function1) new BottomSheetScaffoldKt$BottomSheet$2$1(state, scope);
        $composer2.updateRememberedValue(value$iv2);
        it$iv = value$iv2;
    L136:
        ComposerKt.sourceInformationMarkerEnd($composer2);
        Composer $composer3 = $composer2;
        SurfaceKt.m1782SurfaceFjzlyU(SemanticsModifierKt.semantics$default(r11, false, (Function1) it$iv, 1, null), sheetShape, sheetBackgroundColor, sheetContentColor, null, sheetElevation, ComposableLambdaKt.rememberComposableLambda(2055704138, true, new BottomSheetScaffoldKt$BottomSheet$3(r37), $composer2, 54), $composer3, ((((($dirty2 >> 3) & 112) | 1572864) | (($dirty2 >> 6) & 896)) | (($dirty2 >> 6) & 7168)) | (458752 & ($dirty2 << 6)), 16);
        if (ComposerKt.isTraceInProgress() == false) goto L139;
        ComposerKt.traceEventEnd();
    L139:
        modifier2 = modifier3;
    L141:
        ScopeUpdateScope r14 = $composer3.endRestartGroup();
        if (r14 == null) goto L145;
        r14.updateScope(new BottomSheetScaffoldKt$BottomSheet$4(state, sheetGesturesEnabled, sheetShape, sheetElevation, sheetBackgroundColor, sheetContentColor, sheetPeekHeight, modifier2, r37, $changed, r40));
        return;
    L145:
        return;
    L132:
        if (it$iv != Composer.Companion.getEmpty()) goto L136;
    L128:
        r12 = false;
        goto L129
    L121:
        if (value$iv != Composer.Companion.getEmpty()) goto L125;
    L117:
        r7 = false;
        goto L118
    L106:
        modifier3 = modifier2;
        goto L108
    L140:
        $composer3 = $composer2;
        $composer3.skipToGroupEnd();
        goto L141
    L101:
        r3 = false;
        goto L103
    L92:
        if (($changed & 100663296) != 0) goto L98;
        if ($composer2.changedInstance(r37) == false) goto L96;
        int r0 = AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
    L97:
        $dirty = $dirty | r0;
        goto L98
    L96:
        r0 = 33554432;
        goto L97
    L81:
        if (($changed & 12582912) != 0) goto L87;
        modifier2 = modifier;
        if ($composer2.changed(modifier2) == false) goto L85;
        int r16 = 8388608;
    L86:
        $dirty = $dirty | r16;
        goto L89
    L85:
        r16 = 4194304;
        goto L86
    L87:
        modifier2 = modifier;
        goto L89
    L71:
        if (($changed & 1572864) != 0) goto L77;
        if ($composer2.changed(sheetPeekHeight) == false) goto L75;
        int r13 = 1048576;
    L76:
        $dirty = $dirty | r13;
        goto L77
    L75:
        r13 = 524288;
        goto L76
    L60:
        if (($changed & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) != 0) goto L68;
        if ($composer2.changed(sheetContentColor) == false) goto L64;
        int r15 = 131072;
    L65:
        $dirty = $dirty | r15;
        goto L68
    L64:
        r15 = 65536;
        goto L65
    L49:
        if (($changed & 24576) != 0) goto L57;
        if ($composer2.changed(sheetBackgroundColor) == false) goto L53;
        int r17 = 16384;
    L54:
        $dirty = $dirty | r17;
        goto L57
    L53:
        r17 = 8192;
        goto L54
    L38:
        if (($changed & 3072) != 0) goto L46;
        if ($composer2.changed(sheetElevation) == false) goto L42;
        int r18 = 2048;
    L43:
        $dirty = $dirty | r18;
        goto L46
    L42:
        r18 = 1024;
        goto L43
    L27:
        if (($changed & 384) != 0) goto L35;
        if ($composer2.changed(sheetShape) == false) goto L31;
        int r19 = 256;
    L32:
        $dirty = $dirty | r19;
        goto L35
    L31:
        r19 = 128;
        goto L32
    L16:
        if (($changed & 48) != 0) goto L24;
        if ($composer2.changed(sheetGesturesEnabled) == false) goto L20;
        int r20 = 32;
    L21:
        $dirty = $dirty | r20;
        goto L24
    L20:
        r20 = 16;
        goto L21
    L6:
        if (($changed & 6) != 0) goto L13;
        if ($composer2.changed(state) == false) goto L10;
        int r21 = 4;
    L11:
        $dirty = $dirty | r21;
        goto L13
    L10:
        r21 = 2;
        goto L11
    }

    /* JADX INFO: renamed from: BottomSheetScaffoldLayout-HJHHjMs, reason: not valid java name */
    private static final void m1560BottomSheetScaffoldLayoutHJHHjMs(final Function2<? super Composer, ? super Integer, Unit> r30, final Function2<? super Composer, ? super Integer, Unit> r31, final Function2<? super Composer, ? super Integer, Unit> r32, final Function2<? super Composer, ? super Integer, Unit> r33, final Function2<? super Composer, ? super Integer, Unit> r34, final float sheetPeekHeight, final Function0<Float> r36, final int floatingActionButtonPosition, final BottomSheetState sheetState, Composer $composer, final int $changed) {
        Composer $composer2 = $composer.startRestartGroup(1411837005);
        ComposerKt.sourceInformation($composer2, "C(BottomSheetScaffoldLayout)P(8!3,7,5:c#ui.unit.Dp,4,3:c#material.FabPosition)479@20032L2783,470@19787L3028:BottomSheetScaffold.kt#jmzs0o");
        int $dirty = $changed;
        if (($changed & 6) != 0) goto L10;
        if ($composer2.changedInstance(r30) == false) goto L7;
        int r13 = 4;
    L8:
        $dirty = $dirty | r13;
        goto L10
    L7:
        r13 = 2;
    L10:
        if (($changed & 48) != 0) goto L17;
        if ($composer2.changedInstance(r31) == false) goto L14;
        int r14 = 32;
    L15:
        $dirty = $dirty | r14;
        goto L17
    L14:
        r14 = 16;
    L17:
        if (($changed & 384) != 0) goto L24;
        if ($composer2.changedInstance(r32) == false) goto L21;
        int r15 = 256;
    L22:
        $dirty = $dirty | r15;
        goto L24
    L21:
        r15 = 128;
    L24:
        if (($changed & 3072) != 0) goto L31;
        if ($composer2.changedInstance(r33) == false) goto L28;
        int r16 = 2048;
    L29:
        $dirty = $dirty | r16;
        goto L31
    L28:
        r16 = 1024;
    L31:
        if (($changed & 24576) != 0) goto L38;
        if ($composer2.changedInstance(r34) == false) goto L35;
        int r17 = 16384;
    L36:
        $dirty = $dirty | r17;
        goto L38
    L35:
        r17 = 8192;
    L38:
        if ((196608 & $changed) != 0) goto L45;
        if ($composer2.changed(sheetPeekHeight) == false) goto L42;
        int r18 = 131072;
    L43:
        $dirty = $dirty | r18;
        goto L45
    L42:
        r18 = 65536;
    L45:
        if ((1572864 & $changed) != 0) goto L52;
        if ($composer2.changedInstance(r36) == false) goto L49;
        int r19 = 1048576;
    L50:
        $dirty = $dirty | r19;
        goto L52
    L49:
        r19 = 524288;
    L52:
        if ((12582912 & $changed) != 0) goto L59;
        if ($composer2.changed(floatingActionButtonPosition) == false) goto L56;
        int r110 = 8388608;
    L57:
        $dirty = $dirty | r110;
        goto L59
    L56:
        r110 = 4194304;
    L59:
        if ((100663296 & $changed) == 0) goto L61;
    L65:
        boolean invalid$iv$iv = true;
        if ((38347923 & $dirty) == 38347922) goto L68;
        boolean r111 = true;
    L70:
        if ($composer2.shouldExecute(r111, $dirty & 1) == true) goto L72;
        $composer2.skipToGroupEnd();
    L140:
        ScopeUpdateScope r112 = $composer2.endRestartGroup();
        if (r112 == null) goto L144;
        r112.updateScope(new BottomSheetScaffoldKt$BottomSheetScaffoldLayout$2(r30, r31, r32, r33, r34, sheetPeekHeight, r36, floatingActionButtonPosition, sheetState, $changed));
        return;
    L144:
        return;
    L72:
        if (ComposerKt.isTraceInProgress() == false) goto L74;
        ComposerKt.traceEventStart(1411837005, $dirty, -1, "androidx.compose.material.BottomSheetScaffoldLayout (BottomSheetScaffold.kt:469)");
    L74:
        Function2[] r0 = new Function2[5];
        if (r30 != null) goto L77;
        Function2<? super Composer, ? super Integer, Unit> r113 = ComposableSingletons$BottomSheetScaffoldKt.INSTANCE.m1625getLambda2$material_release();
    L78:
        r0[0] = r113;
        r0[1] = r31;
        r0[2] = r32;
        if (r33 != null) goto L81;
        Function2<? super Composer, ? super Integer, Unit> r114 = ComposableSingletons$BottomSheetScaffoldKt.INSTANCE.m1626getLambda3$material_release();
    L82:
        r0[3] = r114;
        r0[4] = r34;
        List contents$iv = CollectionsKt.listOf(r0);
        ComposerKt.sourceInformationMarkerStart($composer2, 539799565, "CC(remember):BottomSheetScaffold.kt#9igjgp");
        if ((3670016 & $dirty) != 1048576) goto L85;
        boolean r115 = true;
    L87:
        if ((29360128 & $dirty) != 8388608) goto L89;
        boolean r116 = true;
    L90:
        boolean r117 = r115 | r116;
        if ((458752 & $dirty) != 131072) goto L93;
        boolean r118 = true;
    L94:
        boolean r119 = r117 | r118;
        if ((234881024 & $dirty) != 67108864) goto L97;
        boolean r120 = true;
    L98:
        boolean invalid$iv = r119 | r120;
        MultiContentMeasurePolicy value$iv = $composer2.rememberedValue();
        if (invalid$iv == false) goto L101;
    L104:
        value$iv = new BottomSheetScaffoldKt$BottomSheetScaffoldLayout$1$1(r36, floatingActionButtonPosition, sheetPeekHeight, sheetState);
        $composer2.updateRememberedValue(value$iv);
    L105:
        MultiContentMeasurePolicy measurePolicy$iv = (MultiContentMeasurePolicy) value$iv;
        ComposerKt.sourceInformationMarkerEnd($composer2);
        ComposerKt.sourceInformationMarkerStart($composer2, 1399185516, "CC(Layout)P(!1,2)174@7002L62,171@6888L182:Layout.kt#80mrfh");
        Modifier modifier$iv = Modifier.Companion;
        Function2<Composer, Integer, Unit> r121 = LayoutKt.combineAsVirtualLayouts(contents$iv);
        ComposerKt.sourceInformationMarkerStart($composer2, -290761165, "CC(remember):Layout.kt#9igjgp");
        if (((0 & 896) ^ 384) <= 256) goto L110;
        if ($composer2.changed(measurePolicy$iv) == false) goto L110;
    L113:
        Object it$iv$iv = $composer2.rememberedValue();
        if (invalid$iv$iv == true) goto L119;
        int $changed$iv = 0;
        if (it$iv$iv == Composer.Companion.getEmpty()) goto L120;
        Object value$iv$iv = it$iv$iv;
    L121:
        MeasurePolicy measurePolicy$iv$iv = (MeasurePolicy) value$iv$iv;
        ComposerKt.sourceInformationMarkerEnd($composer2);
        int $changed$iv$iv = $changed$iv & 112;
        ComposerKt.sourceInformationMarkerStart($composer2, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
        int compositeKeyHash$iv$iv = ComposablesKt.getCurrentCompositeKeyHash($composer2, 0);
        CompositionLocalMap localMap$iv$iv = $composer2.getCurrentCompositionLocalMap();
        Modifier materialized$iv$iv = ComposedModifierKt.materializeModifier($composer2, modifier$iv);
        Function0<ComposeUiNode> r122 = ComposeUiNode.Companion.getConstructor();
        int $i$f$Layout = $changed$iv$iv << 6;
        int $changed$iv$iv$iv = ($i$f$Layout & 896) | 6;
        ComposerKt.sourceInformationMarkerStart($composer2, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
        if (($composer2.getApplier() instanceof Applier) == true) goto L124;
        ComposablesKt.invalidApplier();
    L124:
        $composer2.startReusableNode();
        if ($composer2.getInserting() == false) goto L127;
        Function0<ComposeUiNode> r2 = r122;
        $composer2.createNode(r2);
    L128:
        Composer $this$Layout_u24lambda_u240$iv$iv = Updater.m3808constructorimpl($composer2);
        Updater.m3815setimpl($this$Layout_u24lambda_u240$iv$iv, measurePolicy$iv$iv, ComposeUiNode.Companion.getSetMeasurePolicy());
        Updater.m3815setimpl($this$Layout_u24lambda_u240$iv$iv, localMap$iv$iv, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> r3 = ComposeUiNode.Companion.getSetCompositeKeyHash();
        if ($this$Layout_u24lambda_u240$iv$iv.getInserting() == true) goto L135;
        if (Intrinsics.areEqual($this$Layout_u24lambda_u240$iv$iv.rememberedValue(), Integer.valueOf(compositeKeyHash$iv$iv)) == false) goto L135;
    L136:
        Updater.m3815setimpl($this$Layout_u24lambda_u240$iv$iv, materialized$iv$iv, ComposeUiNode.Companion.getSetModifier());
        r121.invoke($composer2, Integer.valueOf(($changed$iv$iv$iv >> 6) & 14));
        $composer2.endNode();
        ComposerKt.sourceInformationMarkerEnd($composer2);
        ComposerKt.sourceInformationMarkerEnd($composer2);
        ComposerKt.sourceInformationMarkerEnd($composer2);
        if (ComposerKt.isTraceInProgress() == false) goto L140;
        ComposerKt.traceEventEnd();
    L135:
        $this$Layout_u24lambda_u240$iv$iv.updateRememberedValue(Integer.valueOf(compositeKeyHash$iv$iv));
        $this$Layout_u24lambda_u240$iv$iv.apply(Integer.valueOf(compositeKeyHash$iv$iv), r3);
        goto L136
    L127:
        r2 = r122;
        $composer2.useNode();
    L120:
        value$iv$iv = MultiContentMeasurePolicyKt.createMeasurePolicy(measurePolicy$iv);
        $composer2.updateRememberedValue(value$iv$iv);
        goto L121
    L119:
        $changed$iv = 0;
    L110:
        if ((0 & 384) == 256) goto L113;
        invalid$iv$iv = false;
        goto L113
    L101:
        if (value$iv != Composer.Companion.getEmpty()) goto L105;
    L97:
        r120 = false;
        goto L98
    L93:
        r118 = false;
        goto L94
    L89:
        r116 = false;
        goto L90
    L85:
        r115 = false;
        goto L87
    L81:
        r114 = r33;
        goto L82
    L77:
        r113 = r30;
        goto L78
    L68:
        r111 = false;
        goto L70
    L61:
        if ($composer2.changed(sheetState) == false) goto L63;
        int r123 = AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
    L64:
        $dirty = $dirty | r123;
        goto L65
    L63:
        r123 = 33554432;
        goto L64
    }

    private static final NestedScrollConnection ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection(AnchoredDraggableState<?> r1, Orientation orientation) {
        return new AnonymousClass1(r1, orientation);
    }

    static {
        FabSpacing = Dp.m6973constructorimpl(16);
        BottomSheetScaffoldPositionalThreshold = Dp.m6973constructorimpl(56);
        BottomSheetScaffoldVelocityThreshold = Dp.m6973constructorimpl(125);
    }
}
