package androidx.compose.foundation;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.node.DelegatableNode;
import androidx.compose.ui.unit.Velocity;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Overscroll.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0001¢\u0006\u0002\u0010\u0006J?\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\"\u0010\u0011\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u0013\u0012\u0006\u0012\u0004\u0018\u00010\u00140\u0012H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0016J6\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u001b2\u0012\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00180\u001dH\u0016ø\u0001\u0000¢\u0006\u0004\b\u001e\u0010\u001fJ\u0013\u0010 \u001a\u00020\u00032\b\u0010!\u001a\u0004\u0018\u00010\u0014H\u0096\u0002J\b\u0010\"\u001a\u00020#H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u00020\nX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006$"}, d2 = {"Landroidx/compose/foundation/WrappedOverscrollEffect;", "Landroidx/compose/foundation/OverscrollEffect;", "attachNode", "", "eventHandlingEnabled", "innerOverscrollEffect", "(ZZLandroidx/compose/foundation/OverscrollEffect;)V", "isInProgress", "()Z", "node", "Landroidx/compose/ui/node/DelegatableNode;", "getNode", "()Landroidx/compose/ui/node/DelegatableNode;", "applyToFling", "", "velocity", "Landroidx/compose/ui/unit/Velocity;", "performFling", "Lkotlin/Function2;", "Lkotlin/coroutines/Continuation;", "", "applyToFling-BMRW4eQ", "(JLkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "applyToScroll", "Landroidx/compose/ui/geometry/Offset;", "delta", "source", "Landroidx/compose/ui/input/nestedscroll/NestedScrollSource;", "performScroll", "Lkotlin/Function1;", "applyToScroll-Rhakbz0", "(JILkotlin/jvm/functions/Function1;)J", "equals", "other", "hashCode", "", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
final class WrappedOverscrollEffect implements OverscrollEffect {
    private final boolean attachNode;
    private final boolean eventHandlingEnabled;
    private final OverscrollEffect innerOverscrollEffect;
    private final DelegatableNode node;

    public WrappedOverscrollEffect(boolean attachNode, boolean eventHandlingEnabled, OverscrollEffect innerOverscrollEffect) {
        this.attachNode = attachNode;
        this.eventHandlingEnabled = eventHandlingEnabled;
        this.innerOverscrollEffect = innerOverscrollEffect;
        if (this.attachNode == false) goto L5;
        Modifier.Node r0 = this.innerOverscrollEffect.getNode();
    L6:
        this.node = r0;
        return;
    L5:
        r0 = new WrappedOverscrollEffect$node$1();
        goto L6
    }

    @Override // androidx.compose.foundation.OverscrollEffect
    /* JADX INFO: renamed from: applyToScroll-Rhakbz0 */
    public long mo213applyToScrollRhakbz0(long delta, int source, Function1<? super Offset, Offset> r6) {
        if (this.eventHandlingEnabled == false) goto L6;
        return this.innerOverscrollEffect.mo213applyToScrollRhakbz0(delta, source, r6);
    L6:
        return r6.invoke(Offset.m4114boximpl(delta)).m4135unboximpl();
    }

    @Override // androidx.compose.foundation.OverscrollEffect
    /* JADX INFO: renamed from: applyToFling-BMRW4eQ */
    public Object mo212applyToFlingBMRW4eQ(long velocity, Function2<? super Velocity, ? super Continuation<? super Velocity>, ? extends Object> r5, Continuation<? super Unit> r6) {
        if (this.eventHandlingEnabled == false) goto L9;
        Object r0 = this.innerOverscrollEffect.mo212applyToFlingBMRW4eQ(velocity, r5, r6);
        if (r0 != IntrinsicsKt.getCOROUTINE_SUSPENDED()) goto L8;
        return r0;
    L8:
        return Unit.INSTANCE;
    L9:
        Object r1 = r5.invoke(Velocity.m7202boximpl(velocity), r6);
        if (r1 != IntrinsicsKt.getCOROUTINE_SUSPENDED()) goto L13;
        return r1;
    L13:
        return Unit.INSTANCE;
    }

    @Override // androidx.compose.foundation.OverscrollEffect
    public boolean isInProgress() {
        return this.innerOverscrollEffect.isInProgress();
    }

    @Override // androidx.compose.foundation.OverscrollEffect
    public DelegatableNode getNode() {
        return this.node;
    }

    public boolean equals(Object other) {
        if (this != other) goto L6;
        return true;
    L6:
        if ((other instanceof WrappedOverscrollEffect) == true) goto L9;
        return false;
    L9:
        if (this.attachNode == ((WrappedOverscrollEffect) other).attachNode) goto L12;
        return false;
    L12:
        if (this.eventHandlingEnabled == ((WrappedOverscrollEffect) other).eventHandlingEnabled) goto L15;
        return false;
    L15:
        if (Intrinsics.areEqual(this.innerOverscrollEffect, ((WrappedOverscrollEffect) other).innerOverscrollEffect) == true) goto L17;
        return false;
    L17:
        return true;
    }

    public int hashCode() {
        int result = Boolean.hashCode(this.attachNode);
        int result2 = (result * 31) + Boolean.hashCode(this.eventHandlingEnabled);
        return (result2 * 31) + this.innerOverscrollEffect.hashCode();
    }
}
