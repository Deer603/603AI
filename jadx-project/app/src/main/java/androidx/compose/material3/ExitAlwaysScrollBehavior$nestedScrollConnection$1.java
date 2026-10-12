package androidx.compose.material3;

import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.DecayAnimationSpec;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.nestedscroll.NestedScrollConnection;
import androidx.compose.ui.unit.Velocity;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;

/* JADX INFO: compiled from: AppBar.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J#\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0003H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007J*\u0010\b\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016ø\u0001\u0000¢\u0006\u0004\b\f\u0010\r\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u000e"}, d2 = {"androidx/compose/material3/ExitAlwaysScrollBehavior$nestedScrollConnection$1", "Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;", "onPostFling", "Landroidx/compose/ui/unit/Velocity;", "consumed", "available", "onPostFling-RZ2iAVY", "(JJLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "onPostScroll", "Landroidx/compose/ui/geometry/Offset;", "source", "Landroidx/compose/ui/input/nestedscroll/NestedScrollSource;", "onPostScroll-DzOQY0M", "(JJI)J", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class ExitAlwaysScrollBehavior$nestedScrollConnection$1 implements NestedScrollConnection {
    final /* synthetic */ ExitAlwaysScrollBehavior this$0;

    ExitAlwaysScrollBehavior$nestedScrollConnection$1(ExitAlwaysScrollBehavior $receiver) {
        this.this$0 = $receiver;
    }

    @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    /* JADX INFO: renamed from: onPostScroll-DzOQY0M */
    public long mo497onPostScrollDzOQY0M(long consumed, long available, int source) {
        if (this.this$0.getCanScroll().invoke().booleanValue() == false) goto L5;
        BottomAppBarState r0 = this.this$0.getState();
        r0.setContentOffset(r0.getContentOffset() + Offset.m4126getYimpl(consumed));
        boolean r2 = true;
        if (this.this$0.getState().getHeightOffset() != 0.0f) goto L9;
        boolean r1 = true;
    L10:
        if (r1 == true) goto L17;
        if (this.this$0.getState().getHeightOffset() != this.this$0.getState().getHeightOffsetLimit()) goto L14;
        boolean r3 = true;
    L15:
        if (r3 == true) goto L17;
    L24:
        this.this$0.getState().setHeightOffset(this.this$0.getState().getHeightOffset() + Offset.m4126getYimpl(consumed));
        return Offset.Companion.m4141getZeroF1C5BW0();
    L14:
        r3 = false;
    L17:
        if (Offset.m4126getYimpl(consumed) == 0.0f) goto L20;
        r2 = false;
    L20:
        if (r2 == false) goto L24;
        if (Offset.m4126getYimpl(available) <= 0.0f) goto L24;
        this.this$0.getState().setContentOffset(0.0f);
        goto L24
    L9:
        r1 = false;
        goto L10
    L5:
        return Offset.Companion.m4141getZeroF1C5BW0();
    }

    @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    /* JADX INFO: renamed from: onPostFling-RZ2iAVY */
    public Object mo496onPostFlingRZ2iAVY(long consumed, long r11, Continuation<? super Velocity> r13) {
        if ((r13 instanceof ExitAlwaysScrollBehavior$nestedScrollConnection$1$onPostFling$1) == false) goto L7;
        ExitAlwaysScrollBehavior$nestedScrollConnection$1$onPostFling$1 r0 = (ExitAlwaysScrollBehavior$nestedScrollConnection$1$onPostFling$1) r13;
        if ((r0.label & Integer.MIN_VALUE) == 0) goto L7;
        r0.label -= Integer.MIN_VALUE;
    L8:
        ExitAlwaysScrollBehavior$nestedScrollConnection$1$onPostFling$1 r6 = r0;
        Object $result = r6.result;
        Object r1 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch(r6.label) {
            case 0: goto L14;
            case 1: goto L13;
            case 2: goto L12;
            default: goto L11;
        };
    L12:
        long r9 = r6.J$0;
        ResultKt.throwOnFailure($result);
        Object r12 = $result;
    L22:
        return Velocity.m7202boximpl(Velocity.m7215plusAH228Gc(r9, ((Velocity) r12).m7220unboximpl()));
    L13:
        long available = r6.J$0;
        ExitAlwaysScrollBehavior$nestedScrollConnection$1 r14 = (ExitAlwaysScrollBehavior$nestedScrollConnection$1) r6.L$0;
        ResultKt.throwOnFailure($result);
        long available2 = available;
        Object r10 = $result;
    L18:
        r9 = ((Velocity) r10).m7220unboximpl();
        BottomAppBarState r15 = r14.this$0.getState();
        float r2 = Velocity.m7212getYimpl(available2);
        DecayAnimationSpec<Float> r3 = r14.this$0.getFlingAnimationSpec();
        AnimationSpec<Float> r4 = r14.this$0.getSnapAnimationSpec();
        r6.L$0 = null;
        r6.J$0 = r9;
        r6.label = 2;
        r12 = AppBarKt.access$settleAppBarBottom(r15, r2, r3, r4, r6);
        if (r12 != r1) goto L22;
        return r1;
    L14:
        ResultKt.throwOnFailure($result);
        available2 = r11;
        r6.L$0 = this;
        r6.J$0 = available2;
        r6.label = 1;
        r10 = super.mo496onPostFlingRZ2iAVY(consumed, available2, r6);
        if (r10 != r1) goto L17;
        return r1;
    L17:
        r14 = this;
        goto L18
    L11:
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    L7:
        r0 = new ExitAlwaysScrollBehavior$nestedScrollConnection$1$onPostFling$1(this, r13);
        goto L8
    }
}
