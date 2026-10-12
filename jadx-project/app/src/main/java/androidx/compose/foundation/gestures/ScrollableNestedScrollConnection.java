package androidx.compose.foundation.gestures;

import androidx.compose.foundation.ComposeFoundationFlags;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.nestedscroll.NestedScrollConnection;
import androidx.compose.ui.unit.Velocity;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;

/* JADX INFO: compiled from: Scrollable.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J#\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000eH\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012J*\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00142\u0006\u0010\u0010\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016H\u0016ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0019"}, d2 = {"Landroidx/compose/foundation/gestures/ScrollableNestedScrollConnection;", "Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;", "scrollingLogic", "Landroidx/compose/foundation/gestures/ScrollingLogic;", "enabled", "", "(Landroidx/compose/foundation/gestures/ScrollingLogic;Z)V", "getEnabled", "()Z", "setEnabled", "(Z)V", "getScrollingLogic", "()Landroidx/compose/foundation/gestures/ScrollingLogic;", "onPostFling", "Landroidx/compose/ui/unit/Velocity;", "consumed", "available", "onPostFling-RZ2iAVY", "(JJLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "onPostScroll", "Landroidx/compose/ui/geometry/Offset;", "source", "Landroidx/compose/ui/input/nestedscroll/NestedScrollSource;", "onPostScroll-DzOQY0M", "(JJI)J", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
final class ScrollableNestedScrollConnection implements NestedScrollConnection {
    private boolean enabled;
    private final ScrollingLogic scrollingLogic;

    public ScrollableNestedScrollConnection(ScrollingLogic scrollingLogic, boolean enabled) {
        this.scrollingLogic = scrollingLogic;
        this.enabled = enabled;
    }

    public final ScrollingLogic getScrollingLogic() {
        return this.scrollingLogic;
    }

    public final boolean getEnabled() {
        return this.enabled;
    }

    public final void setEnabled(boolean r1) {
        this.enabled = r1;
    }

    @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    /* JADX INFO: renamed from: onPostScroll-DzOQY0M, reason: not valid java name */
    public long mo497onPostScrollDzOQY0M(long consumed, long available, int source) {
        if (this.enabled == false) goto L6;
        return this.scrollingLogic.m511performRawScrollMKHz9U(available);
    L6:
        return Offset.Companion.m4141getZeroF1C5BW0();
    }

    @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    /* JADX INFO: renamed from: onPostFling-RZ2iAVY, reason: not valid java name */
    public Object mo496onPostFlingRZ2iAVY(long r5, long available, Continuation<? super Velocity> r9) {
        if ((r9 instanceof ScrollableNestedScrollConnection$onPostFling$1) == false) goto L7;
        ScrollableNestedScrollConnection$onPostFling$1 r6 = (ScrollableNestedScrollConnection$onPostFling$1) r9;
        if ((r6.label & Integer.MIN_VALUE) == 0) goto L7;
        r6.label -= Integer.MIN_VALUE;
    L8:
        Object $result = r6.result;
        Object r0 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch(r6.label) {
            case 0: goto L14;
            case 1: goto L13;
            case 2: goto L12;
            default: goto L11;
        };
    L12:
        available = r6.J$0;
        ResultKt.throwOnFailure($result);
        Object r1 = $result;
    L28:
        long velocityLeft = ((Velocity) r1).m7220unboximpl();
    L29:
        long available2 = Velocity.m7214minusAH228Gc(available, velocityLeft);
    L32:
        return Velocity.m7202boximpl(available2);
    L13:
        available = r6.J$0;
        ResultKt.throwOnFailure($result);
        Object r2 = $result;
    L24:
        velocityLeft = ((Velocity) r2).m7220unboximpl();
        goto L29
    L14:
        ResultKt.throwOnFailure($result);
        if (this.enabled == false) goto L30;
        boolean r3 = ComposeFoundationFlags.NewNestedFlingPropagationEnabled;
        ScrollingLogic r4 = this.scrollingLogic;
        if (r3 == true) goto L19;
        r6.J$0 = available;
        r6.label = 2;
        r1 = r4.m509doFlingAnimationQWom1Mo(available, r6);
        if (r1 != r0) goto L28;
        return r0;
    L19:
        if (r4.isFlinging() == false) goto L21;
        velocityLeft = Velocity.Companion.m7222getZero9UxMQ8M();
        goto L29
    L21:
        ScrollingLogic r7 = this.scrollingLogic;
        r6.J$0 = available;
        r6.label = 1;
        r2 = r7.m509doFlingAnimationQWom1Mo(available, r6);
        if (r2 != r0) goto L24;
        return r0;
    L30:
        available2 = Velocity.Companion.m7222getZero9UxMQ8M();
        goto L32
    L11:
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    L7:
        r6 = new ScrollableNestedScrollConnection$onPostFling$1(this, r9);
        goto L8
    }
}
