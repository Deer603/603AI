package androidx.compose.material;

import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.runtime.saveable.SaverKt;
import androidx.compose.ui.unit.Density;
import androidx.core.app.NotificationCompat;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.ranges.RangesKt;

/* JADX INFO: compiled from: ModalBottomSheet.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u0002\n\u0002\b\u0014\b\u0007\u0018\u0000 72\u00020\u0001:\u00017BE\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0014\b\u0002\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\b0\u0007\u0012\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\b\b\u0002\u0010\f\u001a\u00020\b¢\u0006\u0002\u0010\rJ\"\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020\u00032\b\b\u0002\u0010&\u001a\u00020\u000bH\u0080@¢\u0006\u0004\b'\u0010(J\u0010\u0010)\u001a\u00020$H\u0080@¢\u0006\u0004\b*\u0010+J\u0010\u0010,\u001a\u00020$H\u0080@¢\u0006\u0004\b-\u0010+J\u000e\u0010.\u001a\u00020$H\u0086@¢\u0006\u0002\u0010+J\u0018\u0010\u001c\u001a\u00020\u000b2\u0006\u0010/\u001a\u00020\u00032\u0006\u00100\u001a\u00020\u0003H\u0007J\r\u00101\u001a\u00020\u000bH\u0000¢\u0006\u0002\b2J\u000e\u00103\u001a\u00020$H\u0086@¢\u0006\u0002\u0010+J\u0018\u00104\u001a\u00020$2\u0006\u0010%\u001a\u00020\u0003H\u0080@¢\u0006\u0004\b5\u00106R\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000fX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0014\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0017\u001a\u00020\b8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019R\u0014\u0010\f\u001a\u00020\bX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0019R\u0011\u0010\u001b\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u0019R\u001a\u0010\u001c\u001a\u00020\u000b8GX\u0087\u0004¢\u0006\f\u0012\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0011\u0010!\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\"\u0010\u0016¨\u00068"}, d2 = {"Landroidx/compose/material/ModalBottomSheetState;", "", "initialValue", "Landroidx/compose/material/ModalBottomSheetValue;", "density", "Landroidx/compose/ui/unit/Density;", "confirmValueChange", "Lkotlin/Function1;", "", "animationSpec", "Landroidx/compose/animation/core/AnimationSpec;", "", "isSkipHalfExpanded", "(Landroidx/compose/material/ModalBottomSheetValue;Landroidx/compose/ui/unit/Density;Lkotlin/jvm/functions/Function1;Landroidx/compose/animation/core/AnimationSpec;Z)V", "anchoredDraggableState", "Landroidx/compose/material/AnchoredDraggableState;", "getAnchoredDraggableState$material_release", "()Landroidx/compose/material/AnchoredDraggableState;", "getAnimationSpec$material_release", "()Landroidx/compose/animation/core/AnimationSpec;", "currentValue", "getCurrentValue", "()Landroidx/compose/material/ModalBottomSheetValue;", "hasHalfExpandedState", "getHasHalfExpandedState$material_release", "()Z", "isSkipHalfExpanded$material_release", "isVisible", NotificationCompat.CATEGORY_PROGRESS, "getProgress$annotations", "()V", "getProgress", "()F", "targetValue", "getTargetValue", "animateTo", "", "target", "velocity", "animateTo$material_release", "(Landroidx/compose/material/ModalBottomSheetValue;FLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "expand", "expand$material_release", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "halfExpand", "halfExpand$material_release", "hide", "from", "to", "requireOffset", "requireOffset$material_release", "show", "snapTo", "snapTo$material_release", "(Landroidx/compose/material/ModalBottomSheetValue;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Companion", "material_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class ModalBottomSheetState {
    public static final int $stable = 0;
    public static final Companion Companion = null;
    private final AnchoredDraggableState<ModalBottomSheetValue> anchoredDraggableState;
    private final AnimationSpec<Float> animationSpec;
    private final boolean isSkipHalfExpanded;

    /* JADX INFO: compiled from: ModalBottomSheet.kt */
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002JB\u0010\u0003\u001a\f\u0012\u0004\u0012\u00020\u0005\u0012\u0002\b\u00030\u00042\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u000f¨\u0006\u0010"}, d2 = {"Landroidx/compose/material/ModalBottomSheetState$Companion;", "", "()V", "Saver", "Landroidx/compose/runtime/saveable/Saver;", "Landroidx/compose/material/ModalBottomSheetState;", "animationSpec", "Landroidx/compose/animation/core/AnimationSpec;", "", "confirmValueChange", "Lkotlin/Function1;", "Landroidx/compose/material/ModalBottomSheetValue;", "", "skipHalfExpanded", "density", "Landroidx/compose/ui/unit/Density;", "material_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker r1) {
            this();
        }

        private Companion() {
        }

        public final Saver<ModalBottomSheetState, ?> Saver(final AnimationSpec<Float> r3, final Function1<? super ModalBottomSheetValue, Boolean> r4, final boolean skipHalfExpanded, final Density density) {
            return SaverKt.Saver(ModalBottomSheetState$Companion$Saver$1.INSTANCE, new ModalBottomSheetState$Companion$Saver$2(density, r4, r3, skipHalfExpanded));
        }
    }

    /* JADX INFO: compiled from: ModalBottomSheet.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0 = null;

        static {
            int[] r0 = new int[ModalBottomSheetValue.values().length];
            r0[ModalBottomSheetValue.Hidden.ordinal()] = 1;     // Catch: NoSuchFieldError -> L5
        L6:
            $EnumSwitchMapping$0 = r0;
        }
    }

    static {
        Companion = new Companion(null);
        $stable = 8;
    }

    @Deprecated(message = "Please use the progress function to query progress explicitly between targets.", replaceWith = @ReplaceWith(expression = "progress(from = , to = )", imports = {}))
    public static /* synthetic */ void getProgress$annotations() {
    }

    public ModalBottomSheetState(ModalBottomSheetValue initialValue, final Density density, Function1<? super ModalBottomSheetValue, Boolean> r9, AnimationSpec<Float> r10, boolean isSkipHalfExpanded) {
        this.animationSpec = r10;
        this.isSkipHalfExpanded = isSkipHalfExpanded;
        AnimationSpec<Float> r4 = this.animationSpec;
        this.anchoredDraggableState = new AnchoredDraggableState(initialValue, new ModalBottomSheetState$anchoredDraggableState$1(density), new ModalBottomSheetState$anchoredDraggableState$2(density), r4, r9);
        if (this.isSkipHalfExpanded == true) goto L5;
        return;
    L5:
        if (initialValue == ModalBottomSheetValue.HalfExpanded) goto L7;
        boolean r7 = true;
    L8:
        if (r7 == false) goto L11;
        return;
    L11:
        throw new IllegalArgumentException("The initial value must not be set to HalfExpanded if skipHalfExpanded is set to true.".toString());
    L7:
        r7 = false;
        goto L8
    }

    public /* synthetic */ ModalBottomSheetState(ModalBottomSheetValue r7, Density r8, Function1 r9, AnimationSpec r10, boolean r11, int r12, DefaultConstructorMarker r13) {
        if ((r12 & 4) == 0) goto L5;
        Function1 r3 = AnonymousClass1.INSTANCE;
    L7:
        if ((r12 & 8) == 0) goto L9;
        AnimationSpec r4 = ModalBottomSheetDefaults.INSTANCE.getAnimationSpec();
    L11:
        if ((r12 & 16) == 0) goto L13;
        boolean r5 = false;
    L14:
        this(r7, r8, r3, r4, r5);
        return;
    L13:
        r5 = r11;
        goto L14
    L9:
        r4 = r10;
        goto L11
    L5:
        r3 = r9;
        goto L7
    }

    public final AnimationSpec<Float> getAnimationSpec$material_release() {
        return this.animationSpec;
    }

    public final boolean isSkipHalfExpanded$material_release() {
        return this.isSkipHalfExpanded;
    }

    public final AnchoredDraggableState<ModalBottomSheetValue> getAnchoredDraggableState$material_release() {
        return this.anchoredDraggableState;
    }

    public final ModalBottomSheetValue getCurrentValue() {
        return this.anchoredDraggableState.getCurrentValue();
    }

    public final ModalBottomSheetValue getTargetValue() {
        return this.anchoredDraggableState.getTargetValue();
    }

    public final float getProgress() {
        return this.anchoredDraggableState.getProgress();
    }

    public final float progress(ModalBottomSheetValue from, ModalBottomSheetValue to) {
        float fromOffset = this.anchoredDraggableState.getAnchors().positionOf(from);
        float toOffset = this.anchoredDraggableState.getAnchors().positionOf(to);
        float currentOffset = RangesKt.coerceIn(this.anchoredDraggableState.getOffset(), Math.min(fromOffset, toOffset), Math.max(fromOffset, toOffset));
        float fraction = (currentOffset - fromOffset) / (toOffset - fromOffset);
        if (Float.isNaN(fraction) == false) goto L6;
        return 1.0f;
    L6:
        return Math.abs(fraction);
    }

    public final boolean isVisible() {
        if (this.anchoredDraggableState.getCurrentValue() == ModalBottomSheetValue.Hidden) goto L5;
        return true;
    L5:
        return false;
    }

    public final boolean getHasHalfExpandedState$material_release() {
        return this.anchoredDraggableState.getAnchors().hasAnchorFor(ModalBottomSheetValue.HalfExpanded);
    }

    public final Object show(Continuation<? super Unit> r9) {
        boolean hasExpandedState = this.anchoredDraggableState.getAnchors().hasAnchorFor(ModalBottomSheetValue.Expanded);
        ModalBottomSheetValue r1 = getCurrentValue();
        if (WhenMappings.$EnumSwitchMapping$0[r1.ordinal()] == 1) goto L5;
        if (hasExpandedState == false) goto L10;
        ModalBottomSheetValue r2 = ModalBottomSheetValue.Expanded;
    L11:
        ModalBottomSheetValue targetValue = r2;
        Object r10 = animateTo$material_release$default(this, targetValue, 0.0f, r9, 2, null);
        if (r10 != IntrinsicsKt.getCOROUTINE_SUSPENDED()) goto L15;
        return r10;
    L15:
        return Unit.INSTANCE;
    L10:
        r2 = ModalBottomSheetValue.Hidden;
        goto L11
    L5:
        if (getHasHalfExpandedState$material_release() == false) goto L7;
        r2 = ModalBottomSheetValue.HalfExpanded;
        goto L11
    L7:
        r2 = ModalBottomSheetValue.Expanded;
        goto L11
    }

    public final Object halfExpand$material_release(Continuation<? super Unit> r8) {
        if (getHasHalfExpandedState$material_release() == false) goto L5;
        Object r9 = animateTo$material_release$default(this, ModalBottomSheetValue.HalfExpanded, 0.0f, r8, 2, null);
        if (r9 != IntrinsicsKt.getCOROUTINE_SUSPENDED()) goto L10;
        return r9;
    L10:
        return Unit.INSTANCE;
    L5:
        return Unit.INSTANCE;
    }

    public final Object hide(Continuation<? super Unit> r7) {
        Object r8 = animateTo$material_release$default(this, ModalBottomSheetValue.Hidden, 0.0f, r7, 2, null);
        if (r8 != IntrinsicsKt.getCOROUTINE_SUSPENDED()) goto L6;
        return r8;
    L6:
        return Unit.INSTANCE;
    }

    public final Object expand$material_release(Continuation<? super Unit> r8) {
        if (this.anchoredDraggableState.getAnchors().hasAnchorFor(ModalBottomSheetValue.Expanded) == false) goto L5;
        Object r9 = animateTo$material_release$default(this, ModalBottomSheetValue.Expanded, 0.0f, r8, 2, null);
        if (r9 != IntrinsicsKt.getCOROUTINE_SUSPENDED()) goto L10;
        return r9;
    L10:
        return Unit.INSTANCE;
    L5:
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Object animateTo$material_release$default(ModalBottomSheetState r0, ModalBottomSheetValue r1, float r2, Continuation r3, int r4, Object r5) {
        if ((r4 & 2) == 0) goto L6;
        r2 = r0.anchoredDraggableState.getLastVelocity();
    L6:
        return r0.animateTo$material_release(r1, r2, r3);
    }

    public final Object animateTo$material_release(ModalBottomSheetValue target, float velocity, Continuation<? super Unit> r5) {
        Object r0 = AnchoredDraggableKt.animateTo(this.anchoredDraggableState, target, velocity, r5);
        if (r0 != IntrinsicsKt.getCOROUTINE_SUSPENDED()) goto L6;
        return r0;
    L6:
        return Unit.INSTANCE;
    }

    public final Object snapTo$material_release(ModalBottomSheetValue target, Continuation<? super Unit> r4) {
        Object r0 = AnchoredDraggableKt.snapTo(this.anchoredDraggableState, target, r4);
        if (r0 != IntrinsicsKt.getCOROUTINE_SUSPENDED()) goto L6;
        return r0;
    L6:
        return Unit.INSTANCE;
    }

    public final float requireOffset$material_release() {
        return this.anchoredDraggableState.requireOffset();
    }
}
