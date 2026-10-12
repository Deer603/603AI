package androidx.compose.material;

import androidx.compose.animation.core.AnimateAsStateKt;
import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.TweenSpec;
import androidx.compose.foundation.CanvasKt;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnScope;
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
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.input.nestedscroll.NestedScrollConnection;
import androidx.compose.ui.input.nestedscroll.NestedScrollModifierKt;
import androidx.compose.ui.input.nestedscroll.NestedScrollSource;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.Velocity;
import androidx.core.view.accessibility.AccessibilityEventCompat;
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
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: ModalBottomSheet.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000p\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0006\u001a\u001c\u0010\u0005\u001a\u00020\u00062\n\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\b2\u0006\u0010\t\u001a\u00020\nH\u0002\u001a\u0093\u0001\u0010\u000b\u001a\u00020\f2\u001c\u0010\r\u001a\u0018\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\f0\u000e¢\u0006\u0002\b\u0010¢\u0006\u0002\b\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u00132\b\b\u0002\u0010\u0014\u001a\u00020\u00152\b\b\u0002\u0010\u0016\u001a\u00020\u00172\b\b\u0002\u0010\u0018\u001a\u00020\u00192\b\b\u0002\u0010\u001a\u001a\u00020\u00012\b\b\u0002\u0010\u001b\u001a\u00020\u001c2\b\b\u0002\u0010\u001d\u001a\u00020\u001c2\b\b\u0002\u0010\u001e\u001a\u00020\u001c2\u0011\u0010\u001f\u001a\r\u0012\u0004\u0012\u00020\f0 ¢\u0006\u0002\b\u0010H\u0007ø\u0001\u0000¢\u0006\u0004\b!\u0010\"\u001a0\u0010#\u001a\u00020\f2\u0006\u0010$\u001a\u00020\u001c2\f\u0010%\u001a\b\u0012\u0004\u0012\u00020\f0 2\u0006\u0010&\u001a\u00020\u0017H\u0003ø\u0001\u0000¢\u0006\u0004\b'\u0010(\u001aE\u0010)\u001a\u00020\u00152\u0006\u0010*\u001a\u00020+2\u000e\b\u0002\u0010,\u001a\b\u0012\u0004\u0012\u00020.0-2\u0014\b\u0002\u0010/\u001a\u000e\u0012\u0004\u0012\u00020+\u0012\u0004\u0012\u00020\u00170\u000e2\b\b\u0002\u00100\u001a\u00020\u0017H\u0007¢\u0006\u0002\u00101\u001a\u0014\u00102\u001a\u00020\u0013*\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015H\u0002\"\u0010\u0010\u0000\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0002\"\u0010\u0010\u0003\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0002\"\u0010\u0010\u0004\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0002\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u00063²\u0006\n\u00104\u001a\u00020.X\u008a\u0084\u0002"}, d2 = {"MaxModalBottomSheetWidth", "Landroidx/compose/ui/unit/Dp;", "F", "ModalBottomSheetPositionalThreshold", "ModalBottomSheetVelocityThreshold", "ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection", "Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;", "state", "Landroidx/compose/material/AnchoredDraggableState;", "orientation", "Landroidx/compose/foundation/gestures/Orientation;", "ModalBottomSheetLayout", "", "sheetContent", "Lkotlin/Function1;", "Landroidx/compose/foundation/layout/ColumnScope;", "Landroidx/compose/runtime/Composable;", "Lkotlin/ExtensionFunctionType;", "modifier", "Landroidx/compose/ui/Modifier;", "sheetState", "Landroidx/compose/material/ModalBottomSheetState;", "sheetGesturesEnabled", "", "sheetShape", "Landroidx/compose/ui/graphics/Shape;", "sheetElevation", "sheetBackgroundColor", "Landroidx/compose/ui/graphics/Color;", "sheetContentColor", "scrimColor", "content", "Lkotlin/Function0;", "ModalBottomSheetLayout-Gs3lGvM", "(Lkotlin/jvm/functions/Function3;Landroidx/compose/ui/Modifier;Landroidx/compose/material/ModalBottomSheetState;ZLandroidx/compose/ui/graphics/Shape;FJJJLkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "Scrim", "color", "onDismiss", "visible", "Scrim-3J-VO9M", "(JLkotlin/jvm/functions/Function0;ZLandroidx/compose/runtime/Composer;I)V", "rememberModalBottomSheetState", "initialValue", "Landroidx/compose/material/ModalBottomSheetValue;", "animationSpec", "Landroidx/compose/animation/core/AnimationSpec;", "", "confirmValueChange", "skipHalfExpanded", "(Landroidx/compose/material/ModalBottomSheetValue;Landroidx/compose/animation/core/AnimationSpec;Lkotlin/jvm/functions/Function1;ZLandroidx/compose/runtime/Composer;II)Landroidx/compose/material/ModalBottomSheetState;", "modalBottomSheetAnchors", "material_release", "alpha"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class ModalBottomSheetKt {
    private static final float MaxModalBottomSheetWidth = 0.0f;
    private static final float ModalBottomSheetPositionalThreshold = 0.0f;
    private static final float ModalBottomSheetVelocityThreshold = 0.0f;

    /* JADX INFO: renamed from: androidx.compose.material.ModalBottomSheetKt$ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection$1, reason: invalid class name */
    /* JADX INFO: compiled from: ModalBottomSheet.kt */
    @Metadata(d1 = {"\u0000)\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0007\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J#\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0003H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007J*\u0010\b\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016ø\u0001\u0000¢\u0006\u0004\b\f\u0010\rJ\u001b\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0003H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010J\"\u0010\u0011\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0013J\u0013\u0010\u0014\u001a\u00020\u0015*\u00020\tH\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0013\u0010\u0014\u001a\u00020\u0015*\u00020\u0003H\u0003¢\u0006\u0004\b\u0018\u0010\u0017J\u0017\u0010\u0019\u001a\u00020\t*\u00020\u0015H\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0002\u0010\u001a\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u001b"}, d2 = {"androidx/compose/material/ModalBottomSheetKt$ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection$1", "Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;", "onPostFling", "Landroidx/compose/ui/unit/Velocity;", "consumed", "available", "onPostFling-RZ2iAVY", "(JJLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "onPostScroll", "Landroidx/compose/ui/geometry/Offset;", "source", "Landroidx/compose/ui/input/nestedscroll/NestedScrollSource;", "onPostScroll-DzOQY0M", "(JJI)J", "onPreFling", "onPreFling-QWom1Mo", "(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "onPreScroll", "onPreScroll-OzD1aCk", "(JI)J", "toFloat", "", "offsetToFloat", "(J)F", "velocityToFloat", "toOffset", "(F)J", "material_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
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
            if ((r10 instanceof ModalBottomSheetKt$ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection$1$onPreFling$1) == false) goto L7;
            ModalBottomSheetKt$ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection$1$onPreFling$1 r0 = (ModalBottomSheetKt$ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection$1$onPreFling$1) r10;
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
            r0 = new ModalBottomSheetKt$ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection$1$onPreFling$1(this, r10);
            goto L8
        }

        @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
        /* JADX INFO: renamed from: onPostFling-RZ2iAVY */
        public Object mo496onPostFlingRZ2iAVY(long r6, long available, Continuation<? super Velocity> r10) {
            if ((r10 instanceof ModalBottomSheetKt$ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection$1$onPostFling$1) == false) goto L7;
            ModalBottomSheetKt$ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection$1$onPostFling$1 r7 = (ModalBottomSheetKt$ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection$1$onPostFling$1) r10;
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
            r7 = new ModalBottomSheetKt$ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection$1$onPostFling$1(this, r10);
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

    /* JADX INFO: renamed from: access$Scrim-3J-VO9M, reason: not valid java name */
    public static final /* synthetic */ void m1702access$Scrim3JVO9M(long color, Function0 onDismiss, boolean visible, Composer $composer, int $changed) {
        m1701Scrim3JVO9M(color, onDismiss, visible, $composer, $changed);
    }

    public static final /* synthetic */ float access$Scrim_3J_VO9M$lambda$6(State $alpha$delegate) {
        return Scrim_3J_VO9M$lambda$6($alpha$delegate);
    }

    public static final /* synthetic */ float access$getModalBottomSheetPositionalThreshold$p() {
        return ModalBottomSheetPositionalThreshold;
    }

    public static final /* synthetic */ float access$getModalBottomSheetVelocityThreshold$p() {
        return ModalBottomSheetVelocityThreshold;
    }

    public static final ModalBottomSheetState rememberModalBottomSheetState(final ModalBottomSheetValue initialValue, AnimationSpec<Float> r21, Function1<? super ModalBottomSheetValue, Boolean> r22, boolean skipHalfExpanded, Composer $composer, int $changed, int r26) {
        ComposerKt.sourceInformationMarkerStart($composer, -126412120, "C(rememberModalBottomSheetState)P(2)278@11557L7:ModalBottomSheet.kt#jmzs0o");
        if ((r26 & 2) == 0) goto L5;
        final AnimationSpec<Float> r4 = ModalBottomSheetDefaults.INSTANCE.getAnimationSpec();
    L7:
        if ((r26 & 4) == 0) goto L9;
        final Function1<? super ModalBottomSheetValue, Boolean> r3 = C04351.INSTANCE;
    L11:
        if ((r26 & 8) == 0) goto L13;
        final boolean skipHalfExpanded2 = false;
    L15:
        if (ComposerKt.isTraceInProgress() == false) goto L17;
        ComposerKt.traceEventStart(-126412120, $changed, -1, "androidx.compose.material.rememberModalBottomSheetState (ModalBottomSheet.kt:277)");
    L17:
        ProvidableCompositionLocal<Density> r0 = CompositionLocalsKt.getLocalDensity();
        ComposerKt.sourceInformationMarkerStart($composer, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
        Object r9 = $composer.consume(r0);
        ComposerKt.sourceInformationMarkerEnd($composer);
        final Density density = (Density) r9;
        $composer.startMovableGroup(976451635, initialValue);
        ComposerKt.sourceInformation($composer, "296@12250L298,283@11818L730");
        Object[] r8 = {initialValue, r4, Boolean.valueOf(skipHalfExpanded2), r3, density};
        Saver<ModalBottomSheetState, ?> r10 = ModalBottomSheetState.Companion.Saver(r4, r3, skipHalfExpanded2, density);
        ComposerKt.sourceInformationMarkerStart($composer, 976465889, "CC(remember):ModalBottomSheet.kt#9igjgp");
        boolean r11 = false;
        if ((($changed & 14) ^ 6) <= 4) goto L22;
        if ($composer.changed(initialValue) == false) goto L22;
    L23:
        boolean r1 = true;
    L25:
        boolean r2 = r1 | $composer.changed(density);
        if ((($changed & 896) ^ 384) <= 256) goto L30;
        if ($composer.changed(r3) == false) goto L30;
    L31:
        boolean r12 = true;
    L33:
        boolean r5 = (r2 | r12) | $composer.changedInstance(r4);
        if ((($changed & 7168) ^ 3072) <= 2048) goto L38;
        if ($composer.changed(skipHalfExpanded2) == false) goto L38;
    L39:
        r11 = true;
    L40:
        boolean invalid$iv = r11 | r5;
        Object it$iv = $composer.rememberedValue();
        if (invalid$iv == false) goto L43;
    L46:
        Object value$iv = (Function0) new ModalBottomSheetKt$rememberModalBottomSheetState$2$1(initialValue, density, r3, r4, skipHalfExpanded2);
        $composer.updateRememberedValue(value$iv);
        it$iv = value$iv;
    L47:
        ComposerKt.sourceInformationMarkerEnd($composer);
        ModalBottomSheetState r6 = (ModalBottomSheetState) RememberSaveableKt.m3923rememberSaveable(r8, r10, null, (Function0) it$iv, $composer, 0, 4);
        $composer.endMovableGroup();
        if (ComposerKt.isTraceInProgress() == false) goto L50;
        ComposerKt.traceEventEnd();
    L50:
        ComposerKt.sourceInformationMarkerEnd($composer);
        return r6;
    L43:
        if (it$iv != Composer.Companion.getEmpty()) goto L47;
    L38:
        if (($changed & 3072) != 2048) goto L40;
    L30:
        if (($changed & 384) == 256) goto L31;
        r12 = false;
    L22:
        if (($changed & 6) == 4) goto L23;
        r1 = false;
        goto L25
    L13:
        skipHalfExpanded2 = skipHalfExpanded;
        goto L15
    L9:
        r3 = r22;
        goto L11
    L5:
        r4 = r21;
        goto L7
    }

    /* JADX INFO: renamed from: ModalBottomSheetLayout-Gs3lGvM, reason: not valid java name */
    public static final void m1700ModalBottomSheetLayoutGs3lGvM(final Function3<? super ColumnScope, ? super Composer, ? super Integer, Unit> r64, Modifier modifier, ModalBottomSheetState sheetState, boolean sheetGesturesEnabled, Shape sheetShape, float sheetElevation, long sheetBackgroundColor, long sheetContentColor, long scrimColor, final Function2<? super Composer, ? super Integer, Unit> r76, Composer $composer, final int $changed, final int r79) {
        Composer $composer2 = $composer.startRestartGroup(-92970288);
        ComposerKt.sourceInformation($composer2, "C(ModalBottomSheetLayout)P(4,1,9,7,8,6:c#ui.unit.Dp,3:c#ui.graphics.Color,5:c#ui.graphics.Color,2:c#ui.graphics.Color)353@15067L24,355@15139L3924:ModalBottomSheet.kt#jmzs0o");
        int $dirty = $changed;
        if ((r79 & 1) == 0) goto L6;
        $dirty = $dirty | 6;
    L12:
        int r3 = r79 & 2;
        if (r3 == 0) goto L16;
        $dirty = $dirty | 48;
    L24:
        if (($changed & 384) != 0) goto L34;
        if ((r79 & 4) != 0) goto L31;
        if ($composer2.changedInstance(sheetState) == false) goto L31;
        int r5 = 256;
    L32:
        $dirty = $dirty | r5;
    L31:
        r5 = 128;
    L34:
        int r11 = r79 & 8;
        if (r11 == 0) goto L38;
        $dirty = $dirty | 3072;
        boolean r12 = sheetGesturesEnabled;
    L46:
        if (($changed & 24576) == 0) goto L48;
        Shape r6 = sheetShape;
    L57:
        if ((196608 & $changed) == 0) goto L59;
        float r7 = sheetElevation;
    L68:
        if (($changed & 1572864) == 0) goto L70;
        long r9 = sheetBackgroundColor;
    L79:
        if ((12582912 & $changed) != 0) goto L90;
        if ((r79 & 128) != 0) goto L86;
        if ($composer2.changed(sheetContentColor) == false) goto L86;
        int r8 = 8388608;
    L87:
        $dirty = $dirty | r8;
    L86:
        r8 = 4194304;
    L90:
        if ((100663296 & $changed) == 0) goto L92;
        int r10 = r3;
    L101:
        if ((r79 & 512) == 0) goto L104;
        $dirty = $dirty | 805306368;
    L110:
        int $dirty2 = $dirty;
        if ((306783379 & $dirty2) == 306783378) goto L113;
        boolean r1 = true;
    L115:
        if ($composer2.shouldExecute(r1, $dirty2 & 1) == false) goto L253;
        $composer2.startDefaults();
        ComposerKt.sourceInformation($composer2, "344@14622L37,346@14741L6,348@14864L6,349@14911L37,350@14999L10");
        if (($changed & 1) != 0) goto L119;
    L140:
        if (r10 == 0) goto L142;
        Modifier.Companion modifier2 = Modifier.Companion;
    L144:
        if ((r79 & 4) == 0) goto L146;
        int r2 = 6;
        final ModalBottomSheetState sheetState2 = rememberModalBottomSheetState(ModalBottomSheetValue.Hidden, null, null, false, $composer2, 6, 14);
        $dirty2 = $dirty2 & (-897);
    L147:
        if (r11 == 0) goto L149;
        boolean sheetGesturesEnabled2 = true;
    L151:
        if ((r79 & 16) == 0) goto L153;
        CornerBasedShape sheetShape2 = MaterialTheme.INSTANCE.getShapes($composer2, r2).getLarge();
        $dirty2 = $dirty2 & (-57345);
    L155:
        if ((r79 & 32) == 0) goto L157;
        float sheetElevation2 = ModalBottomSheetDefaults.INSTANCE.m1699getElevationD9Ej5fM();
        $dirty2 = $dirty2 & (-458753);
    L159:
        if ((r79 & 64) == 0) goto L161;
        long sheetBackgroundColor2 = MaterialTheme.INSTANCE.getColors($composer2, r2).m1602getSurface0d7_KjU();
        $dirty2 = $dirty2 & (-3670017);
    L163:
        if ((r79 & 128) == 0) goto L165;
        long sheetContentColor2 = ColorsKt.m1616contentColorForek8zF_U(sheetBackgroundColor2, $composer2, ($dirty2 >> 18) & 14);
        $dirty2 = $dirty2 & (-29360129);
    L167:
        if ((r79 & 256) == 0) goto L169;
        float sheetElevation3 = sheetElevation2;
        long sheetBackgroundColor3 = sheetBackgroundColor2;
        long sheetContentColor3 = sheetContentColor2;
        int $dirty3 = $dirty2 & (-234881025);
        Modifier modifier3 = modifier2;
        Shape sheetShape3 = sheetShape2;
        long scrimColor2 = ModalBottomSheetDefaults.INSTANCE.getScrimColor($composer2, 0);
    L170:
        $composer2.endDefaults();
        if (ComposerKt.isTraceInProgress() == false) goto L173;
        ComposerKt.traceEventStart(-92970288, $dirty3, -1, "androidx.compose.material.ModalBottomSheetLayout (ModalBottomSheet.kt:352)");
    L173:
        ComposerKt.sourceInformationMarkerStart($composer2, 773894976, "CC(rememberCoroutineScope)558@25470L68:Effects.kt#9igjgp");
        Composer composer$iv = $composer2;
        ComposerKt.sourceInformationMarkerStart($composer2, -954203484, "CC(remember):Effects.kt#9igjgp");
        Composer $this$cache$iv$iv = $composer2;
        Object it$iv$iv = $this$cache$iv$iv.rememberedValue();
        Modifier modifier4 = modifier3;
        if (it$iv$iv != Composer.Companion.getEmpty()) goto L177;
        Object value$iv$iv = EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composer$iv);
        $this$cache$iv$iv.updateRememberedValue(value$iv$iv);
        it$iv$iv = value$iv$iv;
    L177:
        final CoroutineScope scope = (CoroutineScope) it$iv$iv;
        ComposerKt.sourceInformationMarkerEnd($composer2);
        ComposerKt.sourceInformationMarkerEnd($composer2);
        Orientation orientation = Orientation.Vertical;
        int $changed$iv = ($dirty3 >> 3) & 14;
        ComposerKt.sourceInformationMarkerStart($composer2, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
        Alignment contentAlignment$iv = Alignment.Companion.getTopStart();
        boolean sheetGesturesEnabled3 = sheetGesturesEnabled2;
        MeasurePolicy measurePolicy$iv = BoxKt.maybeCachedBoxMeasurePolicy(contentAlignment$iv, false);
        int $changed$iv$iv = ($changed$iv << 3) & 112;
        long scrimColor3 = scrimColor2;
        ComposerKt.sourceInformationMarkerStart($composer2, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
        int compositeKeyHash$iv$iv = ComposablesKt.getCurrentCompositeKeyHash($composer2, 0);
        CompositionLocalMap localMap$iv$iv = $composer2.getCurrentCompositionLocalMap();
        Modifier materialized$iv$iv = ComposedModifierKt.materializeModifier($composer2, modifier4);
        Function0<ComposeUiNode> r22 = ComposeUiNode.Companion.getConstructor();
        int $dirty4 = $dirty3;
        int $changed$iv$iv$iv = (($changed$iv$iv << 6) & 896) | 6;
        ComposerKt.sourceInformationMarkerStart($composer2, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
        if (($composer2.getApplier() instanceof Applier) == true) goto L180;
        ComposablesKt.invalidApplier();
    L180:
        $composer2.startReusableNode();
        if ($composer2.getInserting() == false) goto L183;
        Function0<ComposeUiNode> r13 = r22;
        $composer2.createNode(r13);
    L184:
        Composer $this$Layout_u24lambda_u240$iv$iv = Updater.m3808constructorimpl($composer2);
        Updater.m3815setimpl($this$Layout_u24lambda_u240$iv$iv, measurePolicy$iv, ComposeUiNode.Companion.getSetMeasurePolicy());
        Updater.m3815setimpl($this$Layout_u24lambda_u240$iv$iv, localMap$iv$iv, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> r14 = ComposeUiNode.Companion.getSetCompositeKeyHash();
        if ($this$Layout_u24lambda_u240$iv$iv.getInserting() == true) goto L191;
        if (Intrinsics.areEqual($this$Layout_u24lambda_u240$iv$iv.rememberedValue(), Integer.valueOf(compositeKeyHash$iv$iv)) == false) goto L191;
    L192:
        Updater.m3815setimpl($this$Layout_u24lambda_u240$iv$iv, materialized$iv$iv, ComposeUiNode.Companion.getSetModifier());
        int r4 = ($changed$iv$iv$iv >> 6) & 14;
        Composer $composer$iv = $composer2;
        ComposerKt.sourceInformationMarkerStart($composer$iv, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
        int r15 = (($changed$iv >> 6) & 112) | 6;
        BoxScope $this$ModalBottomSheetLayout_Gs3lGvM_u24lambda_u245 = BoxScopeInstance.INSTANCE;
        ComposerKt.sourceInformationMarkerStart($composer$iv, -893503817, "C356@15163L430,437@19003L54,368@15602L3455:ModalBottomSheet.kt#jmzs0o");
        Modifier modifier$iv = SizeKt.fillMaxSize$default(Modifier.Companion, 0.0f, 1, null);
        ComposerKt.sourceInformationMarkerStart($composer$iv, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
        Alignment contentAlignment$iv2 = Alignment.Companion.getTopStart();
        MeasurePolicy measurePolicy$iv2 = BoxKt.maybeCachedBoxMeasurePolicy(contentAlignment$iv2, false);
        int $changed$iv$iv2 = (6 << 3) & 112;
        ComposerKt.sourceInformationMarkerStart($composer$iv, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
        int compositeKeyHash$iv$iv2 = ComposablesKt.getCurrentCompositeKeyHash($composer$iv, 0);
        CompositionLocalMap localMap$iv$iv2 = $composer$iv.getCurrentCompositionLocalMap();
        Modifier materialized$iv$iv2 = ComposedModifierKt.materializeModifier($composer$iv, modifier$iv);
        Function0<ComposeUiNode> r35 = ComposeUiNode.Companion.getConstructor();
        int $changed$iv$iv$iv2 = (($changed$iv$iv2 << 6) & 896) | 6;
        ComposerKt.sourceInformationMarkerStart($composer$iv, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
        if (($composer$iv.getApplier() instanceof Applier) == true) goto L195;
        ComposablesKt.invalidApplier();
    L195:
        $composer$iv.startReusableNode();
        if ($composer$iv.getInserting() == false) goto L198;
        Function0<ComposeUiNode> r16 = r35;
        $composer$iv.createNode(r16);
    L199:
        Composer $this$Layout_u24lambda_u240$iv$iv2 = Updater.m3808constructorimpl($composer$iv);
        Updater.m3815setimpl($this$Layout_u24lambda_u240$iv$iv2, measurePolicy$iv2, ComposeUiNode.Companion.getSetMeasurePolicy());
        Updater.m3815setimpl($this$Layout_u24lambda_u240$iv$iv2, localMap$iv$iv2, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> r17 = ComposeUiNode.Companion.getSetCompositeKeyHash();
        if ($this$Layout_u24lambda_u240$iv$iv2.getInserting() == true) goto L206;
        if (Intrinsics.areEqual($this$Layout_u24lambda_u240$iv$iv2.rememberedValue(), Integer.valueOf(compositeKeyHash$iv$iv2)) == false) goto L206;
    L207:
        Updater.m3815setimpl($this$Layout_u24lambda_u240$iv$iv2, materialized$iv$iv2, ComposeUiNode.Companion.getSetModifier());
        int r18 = ($changed$iv$iv$iv2 >> 6) & 14;
        ComposerKt.sourceInformationMarkerStart($composer$iv, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
        BoxScopeInstance r19 = BoxScopeInstance.INSTANCE;
        int r110 = ((6 >> 6) & 112) | 6;
        ComposerKt.sourceInformationMarkerStart($composer$iv, 925281940, "C357@15205L9,360@15298L188,358@15227L356:ModalBottomSheet.kt#jmzs0o");
        r76.invoke($composer$iv, Integer.valueOf(($dirty4 >> 27) & 14));
        ComposerKt.sourceInformationMarkerStart($composer$iv, -1494170063, "CC(remember):ModalBottomSheet.kt#9igjgp");
        boolean invalid$iv = $composer2.changedInstance(sheetState2) | $composer2.changedInstance(scope);
        Object value$iv = $composer$iv.rememberedValue();
        if (invalid$iv == true) goto L213;
        Composer $composer3 = $composer$iv;
        if (value$iv != Composer.Companion.getEmpty()) goto L215;
    L214:
        value$iv = (Function0) new ModalBottomSheetKt$ModalBottomSheetLayout$1$1$1$1(sheetState2, scope);
        $composer$iv.updateRememberedValue(value$iv);
    L215:
        Function0 r20 = (Function0) value$iv;
        ComposerKt.sourceInformationMarkerEnd($composer3);
        if (sheetState2.getAnchoredDraggableState$material_release().getTargetValue() == ModalBottomSheetValue.Hidden) goto L218;
        boolean r21 = true;
    L219:
        m1701Scrim3JVO9M(scrimColor3, r20, r21, $composer3, ($dirty4 >> 24) & 14);
        ComposerKt.sourceInformationMarkerEnd($composer3);
        ComposerKt.sourceInformationMarkerEnd($composer$iv);
        $composer$iv.endNode();
        ComposerKt.sourceInformationMarkerEnd($composer$iv);
        ComposerKt.sourceInformationMarkerEnd($composer$iv);
        ComposerKt.sourceInformationMarkerEnd($composer$iv);
        Modifier r23 = SizeKt.fillMaxWidth$default(SizeKt.m779widthInVpY3zN4$default($this$ModalBottomSheetLayout_Gs3lGvM_u24lambda_u245.align(Modifier.Companion, Alignment.Companion.getTopCenter()), 0.0f, MaxModalBottomSheetWidth, 1, null), 0.0f, 1, null);
        if (sheetGesturesEnabled3 == false) goto L230;
        $composer$iv.startReplaceGroup(-892908339);
        ComposerKt.sourceInformation($composer$iv, "375@15947L354");
        Modifier.Companion r24 = Modifier.Companion;
        AnchoredDraggableState<ModalBottomSheetValue> r25 = sheetState2.getAnchoredDraggableState$material_release();
        ComposerKt.sourceInformationMarkerStart($composer$iv, -167348488, "CC(remember):ModalBottomSheet.kt#9igjgp");
        boolean invalid$iv2 = $composer$iv.changed(r25);
        Object value$iv2 = $composer$iv.rememberedValue();
        if (invalid$iv2 == true) goto L228;
        if (value$iv2 == Composer.Companion.getEmpty()) goto L228;
    L229:
        ComposerKt.sourceInformationMarkerEnd($composer$iv);
        Modifier.Companion r26 = NestedScrollModifierKt.nestedScroll$default(r24, (NestedScrollConnection) value$iv2, null, 2, null);
        $composer$iv.endReplaceGroup();
    L231:
        Modifier r30 = modalBottomSheetAnchors(r23.then(r26), sheetState2);
        AnchoredDraggableState<ModalBottomSheetValue> r31 = sheetState2.getAnchoredDraggableState$material_release();
        if (sheetGesturesEnabled3 == true) goto L234;
    L236:
        boolean r33 = false;
    L237:
        Modifier r0 = AnchoredDraggableKt.anchoredDraggable$default(r30, r31, orientation, r33, false, null, false, 56, null);
        if (sheetGesturesEnabled3 == false) goto L248;
        $composer$iv.startReplaceGroup(-891907876);
        ComposerKt.sourceInformation($composer$iv, "394@16877L1901");
        Modifier.Companion r27 = Modifier.Companion;
        ComposerKt.sourceInformationMarkerStart($composer$iv, -167317181, "CC(remember):ModalBottomSheet.kt#9igjgp");
        boolean invalid$iv3 = $composer2.changedInstance(sheetState2) | $composer2.changedInstance(scope);
        Object it$iv = $composer$iv.rememberedValue();
        if (invalid$iv3 == true) goto L245;
        Composer $composer4 = $composer2;
        if (it$iv != Composer.Companion.getEmpty()) goto L247;
    L246:
        Object value$iv3 = (Function1) new ModalBottomSheetKt$ModalBottomSheetLayout$1$3$1(sheetState2, scope);
        $composer$iv.updateRememberedValue(value$iv3);
        it$iv = value$iv3;
    L247:
        ComposerKt.sourceInformationMarkerEnd($composer$iv);
        Modifier.Companion r28 = SemanticsModifierKt.semantics$default(r27, false, (Function1) it$iv, 1, null);
        $composer$iv.endReplaceGroup();
    L249:
        SurfaceKt.m1782SurfaceFjzlyU(r0.then(r28), sheetShape3, sheetBackgroundColor3, sheetContentColor3, null, sheetElevation3, ComposableLambdaKt.rememberComposableLambda(17396558, true, new ModalBottomSheetKt$ModalBottomSheetLayout$1$4(r64), $composer$iv, 54), $composer$iv, ((((($dirty4 >> 9) & 112) | 1572864) | (($dirty4 >> 12) & 896)) | (($dirty4 >> 12) & 7168)) | ($dirty4 & 458752), 16);
        ComposerKt.sourceInformationMarkerEnd($composer$iv);
        ComposerKt.sourceInformationMarkerEnd($composer$iv);
        $composer4.endNode();
        ComposerKt.sourceInformationMarkerEnd($composer4);
        ComposerKt.sourceInformationMarkerEnd($composer4);
        ComposerKt.sourceInformationMarkerEnd($composer4);
        if (ComposerKt.isTraceInProgress() == false) goto L252;
        ComposerKt.traceEventEnd();
    L252:
        final boolean sheetGesturesEnabled4 = sheetGesturesEnabled3;
        final ModalBottomSheetState sheetState3 = sheetState2;
        final Shape sheetShape4 = sheetShape3;
        final long sheetBackgroundColor4 = sheetBackgroundColor3;
        final long sheetContentColor4 = sheetContentColor3;
        final float sheetElevation4 = sheetElevation3;
        final long scrimColor4 = scrimColor3;
        final Modifier modifier5 = modifier4;
    L254:
        ScopeUpdateScope r29 = $composer4.endRestartGroup();
        if (r29 == null) goto L258;
        r29.updateScope(new ModalBottomSheetKt$ModalBottomSheetLayout$2(r64, modifier5, sheetState3, sheetGesturesEnabled4, sheetShape4, sheetElevation4, sheetBackgroundColor4, sheetContentColor4, scrimColor4, r76, $changed, r79));
        return;
    L258:
        return;
    L245:
        $composer4 = $composer2;
        goto L246
    L248:
        $composer4 = $composer2;
        $composer$iv.startReplaceGroup(-167257346);
        $composer$iv.endReplaceGroup();
        r28 = Modifier.Companion;
        goto L249
    L234:
        if (sheetState2.getAnchoredDraggableState$material_release().getCurrentValue() == ModalBottomSheetValue.Hidden) goto L236;
        r33 = true;
    L228:
        value$iv2 = ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection(sheetState2.getAnchoredDraggableState$material_release(), orientation);
        $composer$iv.updateRememberedValue(value$iv2);
        goto L229
    L230:
        $composer$iv.startReplaceGroup(-167335778);
        $composer$iv.endReplaceGroup();
        r26 = Modifier.Companion;
        goto L231
    L218:
        r21 = false;
        goto L219
    L213:
        $composer3 = $composer$iv;
    L206:
        $this$Layout_u24lambda_u240$iv$iv2.updateRememberedValue(Integer.valueOf(compositeKeyHash$iv$iv2));
        $this$Layout_u24lambda_u240$iv$iv2.apply(Integer.valueOf(compositeKeyHash$iv$iv2), r17);
        goto L207
    L198:
        r16 = r35;
        $composer$iv.useNode();
    L191:
        $this$Layout_u24lambda_u240$iv$iv.updateRememberedValue(Integer.valueOf(compositeKeyHash$iv$iv));
        $this$Layout_u24lambda_u240$iv$iv.apply(Integer.valueOf(compositeKeyHash$iv$iv), r14);
        goto L192
    L183:
        r13 = r22;
        $composer2.useNode();
        goto L184
    L169:
        sheetShape3 = sheetShape2;
        sheetElevation3 = sheetElevation2;
        sheetBackgroundColor3 = sheetBackgroundColor2;
        sheetContentColor3 = sheetContentColor2;
        scrimColor2 = scrimColor;
        $dirty3 = $dirty2;
        modifier3 = modifier2;
        goto L170
    L165:
        sheetContentColor2 = sheetContentColor;
        goto L167
    L161:
        sheetBackgroundColor2 = r9;
        goto L163
    L157:
        sheetElevation2 = sheetElevation;
        goto L159
    L153:
        sheetShape2 = sheetShape;
        goto L155
    L149:
        sheetGesturesEnabled2 = r12;
        goto L151
    L146:
        r2 = 6;
        sheetState2 = sheetState;
        goto L147
    L142:
        modifier2 = modifier;
        goto L144
    L119:
        if ($composer2.getDefaultsInvalid() == true) goto L140;
        $composer2.skipToGroupEnd();
        if ((r79 & 4) == 0) goto L125;
        $dirty2 = $dirty2 & (-897);
    L125:
        if ((r79 & 16) == 0) goto L128;
        $dirty2 = $dirty2 & (-57345);
    L128:
        if ((r79 & 32) == 0) goto L131;
        $dirty2 = $dirty2 & (-458753);
    L131:
        if ((r79 & 64) == 0) goto L134;
        $dirty2 = $dirty2 & (-3670017);
    L134:
        if ((r79 & 128) == 0) goto L137;
        $dirty2 = $dirty2 & (-29360129);
    L137:
        if ((r79 & 256) == 0) goto L139;
        $dirty2 = $dirty2 & (-234881025);
    L139:
        sheetContentColor3 = sheetContentColor;
        r2 = 6;
        sheetShape3 = r6;
        $composer2 = $composer2;
        sheetElevation3 = r7;
        sheetBackgroundColor3 = r9;
        sheetGesturesEnabled2 = r12;
        sheetState2 = sheetState;
        scrimColor2 = scrimColor;
        $dirty3 = $dirty2;
        modifier3 = modifier;
        goto L170
    L253:
        $composer4 = $composer2;
        $composer4.skipToGroupEnd();
        modifier5 = modifier;
        sheetState3 = sheetState;
        sheetShape4 = sheetShape;
        sheetElevation4 = sheetElevation;
        sheetBackgroundColor4 = r9;
        sheetGesturesEnabled4 = r12;
        sheetContentColor4 = sheetContentColor;
        scrimColor4 = scrimColor;
        goto L254
    L113:
        r1 = false;
        goto L115
    L104:
        if (($changed & 805306368) != 0) goto L110;
        if ($composer2.changedInstance(r76) == false) goto L108;
        int r32 = 536870912;
    L109:
        $dirty = $dirty | r32;
        goto L110
    L108:
        r32 = 268435456;
        goto L109
    L92:
        if ((r79 & 256) != 0) goto L96;
        r10 = r3;
        if ($composer2.changed(scrimColor) == false) goto L97;
        int r111 = AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
    L98:
        $dirty = $dirty | r111;
    L97:
        r111 = 33554432;
        goto L98
    L96:
        r10 = r3;
        goto L97
    L70:
        if ((r79 & 64) != 0) goto L74;
        r9 = sheetBackgroundColor;
        if ($composer2.changed(r9) == false) goto L75;
        int r34 = 1048576;
    L76:
        $dirty = $dirty | r34;
    L75:
        r34 = 524288;
        goto L76
    L74:
        r9 = sheetBackgroundColor;
        goto L75
    L59:
        if ((r79 & 32) != 0) goto L63;
        r7 = sheetElevation;
        if ($composer2.changed(r7) == false) goto L64;
        int r36 = 131072;
    L65:
        $dirty = $dirty | r36;
    L64:
        r36 = 65536;
        goto L65
    L63:
        r7 = sheetElevation;
        goto L64
    L48:
        if ((r79 & 16) != 0) goto L52;
        r6 = sheetShape;
        if ($composer2.changed(r6) == false) goto L53;
        int r37 = 16384;
    L54:
        $dirty = $dirty | r37;
    L53:
        r37 = 8192;
        goto L54
    L52:
        r6 = sheetShape;
        goto L53
    L38:
        if (($changed & 3072) != 0) goto L44;
        r12 = sheetGesturesEnabled;
        if ($composer2.changed(r12) == false) goto L42;
        int r38 = 2048;
    L43:
        $dirty = $dirty | r38;
        goto L46
    L42:
        r38 = 1024;
        goto L43
    L44:
        r12 = sheetGesturesEnabled;
        goto L46
    L16:
        if (($changed & 48) != 0) goto L24;
        if ($composer2.changed(modifier) == false) goto L20;
        int r39 = 32;
    L21:
        $dirty = $dirty | r39;
        goto L24
    L20:
        r39 = 16;
        goto L21
    L6:
        if (($changed & 6) != 0) goto L12;
        if ($composer2.changedInstance(r64) == false) goto L10;
        int r40 = 4;
    L11:
        $dirty = $dirty | r40;
        goto L12
    L10:
        r40 = 2;
        goto L11
    }

    private static final Modifier modalBottomSheetAnchors(Modifier $this$modalBottomSheetAnchors, final ModalBottomSheetState sheetState) {
        return AnchoredDraggableKt.draggableAnchors($this$modalBottomSheetAnchors, sheetState.getAnchoredDraggableState$material_release(), Orientation.Vertical, new C04341(sheetState));
    }

    /* JADX INFO: renamed from: Scrim-3J-VO9M, reason: not valid java name */
    private static final void m1701Scrim3JVO9M(final long color, final Function0<Unit> r24, final boolean visible, Composer $composer, final int $changed) {
        Composer $composer2 = $composer.startRestartGroup(-526532668);
        ComposerKt.sourceInformation($composer2, "C(Scrim)P(0:c#ui.graphics.Color):ModalBottomSheet.kt#jmzs0o");
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
        r6.updateScope(new ModalBottomSheetKt$Scrim$2(color, r24, visible, $changed));
        return;
    L88:
        return;
    L30:
        if (ComposerKt.isTraceInProgress() == false) goto L33;
        ComposerKt.traceEventStart(-526532668, $dirty, -1, "androidx.compose.material.Scrim (ModalBottomSheet.kt:489)");
    L33:
        if (color == 16) goto L35;
        int r0 = 1;
    L36:
        if (r0 == 0) goto L79;
        $composer2.startReplaceGroup(477792612);
        ComposerKt.sourceInformation($composer2, "492@21112L87,493@21225L29,508@21790L79,508@21737L132");
        if (visible == false) goto L40;
        int $dirty2 = 1065353216;
    L41:
        int $dirty3 = $dirty;
        final State<Float> r11 = AnimateAsStateKt.animateFloatAsState($dirty2, new TweenSpec(0, 0, null, 7, null), 0.0f, null, null, $composer2, 48, 28);
        final String closeSheet = Strings_androidKt.m1781getString4foXLRw(Strings.Companion.m1774getCloseSheetUdPEhr4(), $composer2, 6);
        if (visible == false) goto L66;
        $composer2.startReplaceGroup(478010511);
        ComposerKt.sourceInformation($composer2, "496@21361L37,497@21455L212");
        Modifier.Companion r12 = Modifier.Companion;
        ComposerKt.sourceInformationMarkerStart($composer2, 1262346981, "CC(remember):ModalBottomSheet.kt#9igjgp");
        if (($dirty3 & 112) != 32) goto L46;
        boolean invalid$iv = true;
    L47:
        Object it$iv = $composer2.rememberedValue();
        if (invalid$iv == false) goto L50;
    L53:
        Object value$iv = (Function2) new ModalBottomSheetKt$Scrim$dismissModifier$1$1(r24, null);
        $composer2.updateRememberedValue(value$iv);
        it$iv = value$iv;
    L54:
        ComposerKt.sourceInformationMarkerEnd($composer2);
        Modifier r1 = SuspendingPointerInputFilterKt.pointerInput(r12, r24, (Function2) it$iv);
        ComposerKt.sourceInformationMarkerStart($composer2, 1262350164, "CC(remember):ModalBottomSheet.kt#9igjgp");
        boolean r13 = $composer2.changed(closeSheet);
        if (($dirty3 & 112) != 32) goto L57;
        boolean r14 = true;
    L58:
        boolean invalid$iv2 = r13 | r14;
        Object it$iv2 = $composer2.rememberedValue();
        if (invalid$iv2 == false) goto L61;
    L64:
        Object value$iv2 = (Function1) new ModalBottomSheetKt$Scrim$dismissModifier$2$1(closeSheet, r24);
        $composer2.updateRememberedValue(value$iv2);
        it$iv2 = value$iv2;
    L65:
        ComposerKt.sourceInformationMarkerEnd($composer2);
        Modifier.Companion dismissModifier = SemanticsModifierKt.semantics(r1, true, (Function1) it$iv2);
        $composer2.endReplaceGroup();
    L67:
        Modifier r4 = SizeKt.fillMaxSize$default(Modifier.Companion, 0.0f, 1, null).then(dismissModifier);
        ComposerKt.sourceInformationMarkerStart($composer2, 1262360751, "CC(remember):ModalBottomSheet.kt#9igjgp");
        if (($dirty3 & 14) != 4) goto L70;
        boolean r15 = true;
    L71:
        boolean invalid$iv3 = $composer2.changed(r11) | r15;
        Object it$iv3 = $composer2.rememberedValue();
        if (invalid$iv3 == false) goto L74;
    L77:
        Object value$iv3 = (Function1) new ModalBottomSheetKt$Scrim$1$1(color, r11);
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
        $composer2.startReplaceGroup(478374234);
        $composer2.endReplaceGroup();
        dismissModifier = Modifier.Companion;
        goto L67
    L40:
        $dirty2 = 0;
        goto L41
    L79:
        $composer2.startReplaceGroup(478559490);
        $composer2.endReplaceGroup();
        goto L81
    L35:
        r0 = 0;
        goto L36
    L26:
        r10 = false;
        goto L28
    }

    private static final float Scrim_3J_VO9M$lambda$6(State<Float> r4) {
        return r4.getValue().floatValue();
    }

    private static final NestedScrollConnection ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection(AnchoredDraggableState<?> r1, Orientation orientation) {
        return new AnonymousClass1(r1, orientation);
    }

    static {
        ModalBottomSheetPositionalThreshold = Dp.m6973constructorimpl(56);
        ModalBottomSheetVelocityThreshold = Dp.m6973constructorimpl(125);
        MaxModalBottomSheetWidth = Dp.m6973constructorimpl(640);
    }
}
