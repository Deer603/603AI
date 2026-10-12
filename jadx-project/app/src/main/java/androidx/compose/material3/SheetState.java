package androidx.compose.material3;

import androidx.compose.material3.internal.AnchoredDraggableKt;
import androidx.compose.material3.internal.AnchoredDraggableState;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.runtime.saveable.SaverKt;
import androidx.compose.ui.unit.Density;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: SheetDefaults.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0011\b\u0007\u0018\u0000 42\u00020\u0001:\u00014B?\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\u0014\b\u0002\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00030\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u0003¢\u0006\u0002\u0010\u000bJ\"\u0010#\u001a\u00020$2\u0006\u0010!\u001a\u00020\u00072\b\b\u0002\u0010%\u001a\u00020\u001cH\u0080@¢\u0006\u0004\b&\u0010'J\u000e\u0010(\u001a\u00020$H\u0086@¢\u0006\u0002\u0010)J\u000e\u0010*\u001a\u00020$H\u0086@¢\u0006\u0002\u0010)J\u000e\u0010+\u001a\u00020$H\u0086@¢\u0006\u0002\u0010)J\u0006\u0010,\u001a\u00020\u001cJ\u0018\u0010-\u001a\u00020$2\u0006\u0010%\u001a\u00020\u001cH\u0080@¢\u0006\u0004\b.\u0010/J\u000e\u00100\u001a\u00020$H\u0086@¢\u0006\u0002\u0010)J\u0018\u00101\u001a\u00020$2\u0006\u0010!\u001a\u00020\u0007H\u0080@¢\u0006\u0004\b2\u00103R \u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00070\rX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0012\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0015\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\u0018\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u0017R\u0011\u0010\u001a\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u0017R\u0016\u0010\u001b\u001a\u0004\u0018\u00010\u001c8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001eR\u0014\u0010\n\u001a\u00020\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0017R\u0014\u0010\u0002\u001a\u00020\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0017R\u0011\u0010!\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b\"\u0010\u0014¨\u00065"}, d2 = {"Landroidx/compose/material3/SheetState;", "", "skipPartiallyExpanded", "", "density", "Landroidx/compose/ui/unit/Density;", "initialValue", "Landroidx/compose/material3/SheetValue;", "confirmValueChange", "Lkotlin/Function1;", "skipHiddenState", "(ZLandroidx/compose/ui/unit/Density;Landroidx/compose/material3/SheetValue;Lkotlin/jvm/functions/Function1;Z)V", "anchoredDraggableState", "Landroidx/compose/material3/internal/AnchoredDraggableState;", "getAnchoredDraggableState$material3_release", "()Landroidx/compose/material3/internal/AnchoredDraggableState;", "setAnchoredDraggableState$material3_release", "(Landroidx/compose/material3/internal/AnchoredDraggableState;)V", "currentValue", "getCurrentValue", "()Landroidx/compose/material3/SheetValue;", "hasExpandedState", "getHasExpandedState", "()Z", "hasPartiallyExpandedState", "getHasPartiallyExpandedState", "isVisible", "offset", "", "getOffset$material3_release", "()Ljava/lang/Float;", "getSkipHiddenState$material3_release", "getSkipPartiallyExpanded$material3_release", "targetValue", "getTargetValue", "animateTo", "", "velocity", "animateTo$material3_release", "(Landroidx/compose/material3/SheetValue;FLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "expand", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "hide", "partialExpand", "requireOffset", "settle", "settle$material3_release", "(FLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "show", "snapTo", "snapTo$material3_release", "(Landroidx/compose/material3/SheetValue;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Companion", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class SheetState {
    public static final int $stable = 0;
    public static final Companion Companion = null;
    private AnchoredDraggableState<SheetValue> anchoredDraggableState;
    private final boolean skipHiddenState;
    private final boolean skipPartiallyExpanded;

    /* JADX INFO: compiled from: SheetDefaults.kt */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J>\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u0006\u0010\u0007\u001a\u00020\b2\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\b0\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\b¨\u0006\u000e"}, d2 = {"Landroidx/compose/material3/SheetState$Companion;", "", "()V", "Saver", "Landroidx/compose/runtime/saveable/Saver;", "Landroidx/compose/material3/SheetState;", "Landroidx/compose/material3/SheetValue;", "skipPartiallyExpanded", "", "confirmValueChange", "Lkotlin/Function1;", "density", "Landroidx/compose/ui/unit/Density;", "skipHiddenState", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker r1) {
            this();
        }

        private Companion() {
        }

        public final Saver<SheetState, SheetValue> Saver(final boolean skipPartiallyExpanded, final Function1<? super SheetValue, Boolean> r4, final Density density, final boolean skipHiddenState) {
            return SaverKt.Saver(SheetState$Companion$Saver$1.INSTANCE, new SheetState$Companion$Saver$2(skipPartiallyExpanded, density, r4, skipHiddenState));
        }
    }

    static {
        Companion = new Companion(null);
    }

    public SheetState(boolean skipPartiallyExpanded, final Density density, SheetValue initialValue, Function1<? super SheetValue, Boolean> r12, boolean skipHiddenState) {
        this.skipPartiallyExpanded = skipPartiallyExpanded;
        this.skipHiddenState = skipHiddenState;
        boolean r1 = true;
        if (this.skipPartiallyExpanded == false) goto L13;
        if (initialValue == SheetValue.PartiallyExpanded) goto L7;
        boolean r0 = true;
    L8:
        if (r0 == true) goto L13;
        throw new IllegalArgumentException("The initial value must not be set to PartiallyExpanded if skipPartiallyExpanded is set to true.".toString());
    L7:
        r0 = false;
    L13:
        if (this.skipHiddenState == true) goto L15;
    L22:
        this.anchoredDraggableState = new AnchoredDraggableState(initialValue, new SheetState$anchoredDraggableState$1(density), new SheetState$anchoredDraggableState$2(density), SheetDefaultsKt.access$getBottomSheetAnimationSpec$p(), r12);
        return;
    L15:
        if (initialValue != SheetValue.Hidden) goto L18;
        r1 = false;
    L18:
        if (r1 == true) goto L22;
        throw new IllegalArgumentException("The initial value must not be set to Hidden if skipHiddenState is set to true.".toString());
    }

    public /* synthetic */ SheetState(boolean r7, Density r8, SheetValue r9, Function1 r10, boolean r11, int r12, DefaultConstructorMarker r13) {
        if ((r12 & 4) == 0) goto L5;
        SheetValue r3 = SheetValue.Hidden;
    L7:
        if ((r12 & 8) == 0) goto L9;
        Function1 r4 = AnonymousClass1.INSTANCE;
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

    public final boolean getSkipPartiallyExpanded$material3_release() {
        return this.skipPartiallyExpanded;
    }

    public final boolean getSkipHiddenState$material3_release() {
        return this.skipHiddenState;
    }

    public final SheetValue getCurrentValue() {
        return this.anchoredDraggableState.getCurrentValue();
    }

    public final SheetValue getTargetValue() {
        return this.anchoredDraggableState.getTargetValue();
    }

    public final boolean isVisible() {
        if (this.anchoredDraggableState.getCurrentValue() == SheetValue.Hidden) goto L5;
        return true;
    L5:
        return false;
    }

    public final float requireOffset() {
        return this.anchoredDraggableState.requireOffset();
    }

    public final boolean getHasExpandedState() {
        return this.anchoredDraggableState.getAnchors().hasAnchorFor(SheetValue.Expanded);
    }

    public final boolean getHasPartiallyExpandedState() {
        return this.anchoredDraggableState.getAnchors().hasAnchorFor(SheetValue.PartiallyExpanded);
    }

    public final Object expand(Continuation<? super Unit> r7) {
        Object r8 = AnchoredDraggableKt.animateTo$default(this.anchoredDraggableState, SheetValue.Expanded, 0.0f, r7, 2, null);
        if (r8 != IntrinsicsKt.getCOROUTINE_SUSPENDED()) goto L6;
        return r8;
    L6:
        return Unit.INSTANCE;
    }

    public final Object partialExpand(Continuation<? super Unit> r8) {
        if (this.skipPartiallyExpanded == true) goto L10;
        Object r9 = animateTo$material3_release$default(this, SheetValue.PartiallyExpanded, 0.0f, r8, 2, null);
        if (r9 != IntrinsicsKt.getCOROUTINE_SUSPENDED()) goto L8;
        return r9;
    L8:
        return Unit.INSTANCE;
    L10:
        throw new IllegalStateException("Attempted to animate to partial expanded when skipPartiallyExpanded was enabled. Set skipPartiallyExpanded to false to use this function.".toString());
    }

    public final Object show(Continuation<? super Unit> r8) {
        if (getHasPartiallyExpandedState() == false) goto L5;
        SheetValue r0 = SheetValue.PartiallyExpanded;
    L6:
        SheetValue targetValue = r0;
        Object r9 = animateTo$material3_release$default(this, targetValue, 0.0f, r8, 2, null);
        if (r9 != IntrinsicsKt.getCOROUTINE_SUSPENDED()) goto L10;
        return r9;
    L10:
        return Unit.INSTANCE;
    L5:
        r0 = SheetValue.Expanded;
        goto L6
    }

    public final Object hide(Continuation<? super Unit> r8) {
        if (this.skipHiddenState == true) goto L10;
        Object r9 = animateTo$material3_release$default(this, SheetValue.Hidden, 0.0f, r8, 2, null);
        if (r9 != IntrinsicsKt.getCOROUTINE_SUSPENDED()) goto L8;
        return r9;
    L8:
        return Unit.INSTANCE;
    L10:
        throw new IllegalStateException("Attempted to animate to hidden when skipHiddenState was enabled. Set skipHiddenState to false to use this function.".toString());
    }

    public static /* synthetic */ Object animateTo$material3_release$default(SheetState r0, SheetValue r1, float r2, Continuation r3, int r4, Object r5) {
        if ((r4 & 2) == 0) goto L6;
        r2 = r0.anchoredDraggableState.getLastVelocity();
    L6:
        return r0.animateTo$material3_release(r1, r2, r3);
    }

    public final Object animateTo$material3_release(SheetValue targetValue, float velocity, Continuation<? super Unit> r5) {
        Object r0 = AnchoredDraggableKt.animateTo(this.anchoredDraggableState, targetValue, velocity, r5);
        if (r0 != IntrinsicsKt.getCOROUTINE_SUSPENDED()) goto L6;
        return r0;
    L6:
        return Unit.INSTANCE;
    }

    public final Object snapTo$material3_release(SheetValue targetValue, Continuation<? super Unit> r4) {
        Object r0 = AnchoredDraggableKt.snapTo(this.anchoredDraggableState, targetValue, r4);
        if (r0 != IntrinsicsKt.getCOROUTINE_SUSPENDED()) goto L6;
        return r0;
    L6:
        return Unit.INSTANCE;
    }

    public final Object settle$material3_release(float velocity, Continuation<? super Unit> r4) {
        Object r0 = this.anchoredDraggableState.settle(velocity, r4);
        if (r0 != IntrinsicsKt.getCOROUTINE_SUSPENDED()) goto L6;
        return r0;
    L6:
        return Unit.INSTANCE;
    }

    public final AnchoredDraggableState<SheetValue> getAnchoredDraggableState$material3_release() {
        return this.anchoredDraggableState;
    }

    public final void setAnchoredDraggableState$material3_release(AnchoredDraggableState<SheetValue> r1) {
        this.anchoredDraggableState = r1;
    }

    public final Float getOffset$material3_release() {
        return Float.valueOf(this.anchoredDraggableState.getOffset());
    }
}
