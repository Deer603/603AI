package androidx.compose.ui.input.nestedscroll;

import androidx.compose.ui.ComposeUiFlags;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.unit.Velocity;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function0;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: NestedScrollModifier.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J#\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010!\u001a\u00020\u001fH\u0086@ø\u0001\u0000¢\u0006\u0004\b\"\u0010#J(\u0010$\u001a\u00020%2\u0006\u0010 \u001a\u00020%2\u0006\u0010!\u001a\u00020%2\u0006\u0010&\u001a\u00020'ø\u0001\u0000¢\u0006\u0004\b(\u0010)J\u001b\u0010*\u001a\u00020\u001f2\u0006\u0010!\u001a\u00020\u001fH\u0086@ø\u0001\u0000¢\u0006\u0004\b+\u0010,J \u0010-\u001a\u00020%2\u0006\u0010!\u001a\u00020%2\u0006\u0010&\u001a\u00020'ø\u0001\u0000¢\u0006\u0004\b.\u0010/R\"\u0010\u0003\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u0011\u0010\n\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u001c\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u000eX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0010\"\u0004\b\u0015\u0010\u0012R\u0016\u0010\u0016\u001a\u0004\u0018\u00010\u00178@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019R\u001c\u0010\u001a\u001a\u0004\u0018\u00010\u0005X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\f\"\u0004\b\u001c\u0010\u001d\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u00060"}, d2 = {"Landroidx/compose/ui/input/nestedscroll/NestedScrollDispatcher;", "", "()V", "calculateNestedScrollScope", "Lkotlin/Function0;", "Lkotlinx/coroutines/CoroutineScope;", "getCalculateNestedScrollScope$ui_release", "()Lkotlin/jvm/functions/Function0;", "setCalculateNestedScrollScope$ui_release", "(Lkotlin/jvm/functions/Function0;)V", "coroutineScope", "getCoroutineScope", "()Lkotlinx/coroutines/CoroutineScope;", "lastKnownParentNode", "Landroidx/compose/ui/input/nestedscroll/NestedScrollNode;", "getLastKnownParentNode$ui_release", "()Landroidx/compose/ui/input/nestedscroll/NestedScrollNode;", "setLastKnownParentNode$ui_release", "(Landroidx/compose/ui/input/nestedscroll/NestedScrollNode;)V", "nestedScrollNode", "getNestedScrollNode$ui_release", "setNestedScrollNode$ui_release", "parent", "Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;", "getParent$ui_release", "()Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;", "scope", "getScope$ui_release", "setScope$ui_release", "(Lkotlinx/coroutines/CoroutineScope;)V", "dispatchPostFling", "Landroidx/compose/ui/unit/Velocity;", "consumed", "available", "dispatchPostFling-RZ2iAVY", "(JJLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "dispatchPostScroll", "Landroidx/compose/ui/geometry/Offset;", "source", "Landroidx/compose/ui/input/nestedscroll/NestedScrollSource;", "dispatchPostScroll-DzOQY0M", "(JJI)J", "dispatchPreFling", "dispatchPreFling-QWom1Mo", "(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "dispatchPreScroll", "dispatchPreScroll-OzD1aCk", "(JI)J", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class NestedScrollDispatcher {
    public static final int $stable = 0;
    private Function0<? extends CoroutineScope> calculateNestedScrollScope;
    private NestedScrollNode lastKnownParentNode;
    private NestedScrollNode nestedScrollNode;
    private CoroutineScope scope;

    static {
        $stable = 8;
    }

    public NestedScrollDispatcher() {
        this.calculateNestedScrollScope = new NestedScrollDispatcher$calculateNestedScrollScope$1(this);
    }

    public final NestedScrollNode getNestedScrollNode$ui_release() {
        return this.nestedScrollNode;
    }

    public final void setNestedScrollNode$ui_release(NestedScrollNode r1) {
        this.nestedScrollNode = r1;
    }

    public final NestedScrollNode getLastKnownParentNode$ui_release() {
        return this.lastKnownParentNode;
    }

    public final void setLastKnownParentNode$ui_release(NestedScrollNode r1) {
        this.lastKnownParentNode = r1;
    }

    public final Function0<CoroutineScope> getCalculateNestedScrollScope$ui_release() {
        return this.calculateNestedScrollScope;
    }

    public final void setCalculateNestedScrollScope$ui_release(Function0<? extends CoroutineScope> r1) {
        this.calculateNestedScrollScope = r1;
    }

    public final CoroutineScope getScope$ui_release() {
        return this.scope;
    }

    public final void setScope$ui_release(CoroutineScope r1) {
        this.scope = r1;
    }

    public final CoroutineScope getCoroutineScope() {
        CoroutineScope r0 = this.calculateNestedScrollScope.invoke();
        if (r0 == null) goto L6;
        return r0;
    L6:
        throw new IllegalStateException("in order to access nested coroutine scope you need to attach dispatcher to the `Modifier.nestedScroll` first.");
    }

    public final NestedScrollConnection getParent$ui_release() {
        NestedScrollNode r0 = this.nestedScrollNode;
        if (r0 == null) goto L5;
        NestedScrollNode r1 = r0.getParentNestedScrollNode$ui_release();
    L7:
        return r1;
    L5:
        r1 = null;
        goto L7
    }

    /* JADX INFO: renamed from: dispatchPreScroll-OzD1aCk, reason: not valid java name */
    public final long m5466dispatchPreScrollOzD1aCk(long available, int source) {
        NestedScrollConnection r0 = getParent$ui_release();
        if (r0 == null) goto L6;
        return r0.mo803onPreScrollOzD1aCk(available, source);
    L6:
        return Offset.Companion.m4141getZeroF1C5BW0();
    }

    /* JADX INFO: renamed from: dispatchPostScroll-DzOQY0M, reason: not valid java name */
    public final long m5464dispatchPostScrollDzOQY0M(long consumed, long available, int source) {
        NestedScrollConnection r0 = getParent$ui_release();
        if (r0 == null) goto L6;
        return r0.mo497onPostScrollDzOQY0M(consumed, available, source);
    L6:
        return Offset.Companion.m4141getZeroF1C5BW0();
    }

    /* JADX INFO: renamed from: dispatchPreFling-QWom1Mo, reason: not valid java name */
    public final Object m5465dispatchPreFlingQWom1Mo(long available, Continuation<? super Velocity> r8) {
        if ((r8 instanceof NestedScrollDispatcher$dispatchPreFling$1) == false) goto L7;
        NestedScrollDispatcher$dispatchPreFling$1 r0 = (NestedScrollDispatcher$dispatchPreFling$1) r8;
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
        ResultKt.throwOnFailure($result);
        Object r6 = $result;
    L18:
        long r7 = ((Velocity) r6).m7220unboximpl();
    L21:
        return Velocity.m7202boximpl(r7);
    L13:
        ResultKt.throwOnFailure($result);
        NestedScrollConnection r3 = getParent$ui_release();
        if (r3 == null) goto L19;
        r0.label = 1;
        r6 = r3.mo802onPreFlingQWom1Mo(available, r0);
        if (r6 != r2) goto L18;
        return r2;
    L19:
        r7 = Velocity.Companion.m7222getZero9UxMQ8M();
        goto L21
    L11:
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    L7:
        r0 = new NestedScrollDispatcher$dispatchPreFling$1(this, r8);
        goto L8
    }

    /* JADX INFO: renamed from: dispatchPostFling-RZ2iAVY, reason: not valid java name */
    public final Object m5463dispatchPostFlingRZ2iAVY(long consumed, long available, Continuation<? super Velocity> r13) {
        if ((r13 instanceof NestedScrollDispatcher$dispatchPostFling$1) == false) goto L7;
        NestedScrollDispatcher$dispatchPostFling$1 r0 = (NestedScrollDispatcher$dispatchPostFling$1) r13;
        if ((r0.label & Integer.MIN_VALUE) == 0) goto L7;
        r0.label -= Integer.MIN_VALUE;
    L8:
        NestedScrollDispatcher$dispatchPostFling$1 r6 = r0;
        Object $result = r6.result;
        Object r7 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch(r6.label) {
            case 0: goto L14;
            case 1: goto L13;
            case 2: goto L12;
            default: goto L11;
        };
    L12:
        ResultKt.throwOnFailure($result);
        Object r9 = $result;
    L30:
        long r10 = ((Velocity) r9).m7220unboximpl();
    L33:
        return Velocity.m7202boximpl(r10);
    L13:
        ResultKt.throwOnFailure($result);
        Object r11 = $result;
    L23:
        r10 = ((Velocity) r11).m7220unboximpl();
        goto L33
    L14:
        ResultKt.throwOnFailure($result);
        if (getParent$ui_release() == null) goto L17;
    L25:
        NestedScrollConnection r1 = getParent$ui_release();
        if (r1 == null) goto L31;
        r6.label = 2;
        r9 = r1.mo496onPostFlingRZ2iAVY(consumed, available, r6);
        if (r9 != r7) goto L30;
        return r7;
    L31:
        r10 = Velocity.Companion.m7222getZero9UxMQ8M();
        goto L33
    L17:
        if (ComposeUiFlags.NewNestedScrollFlingDispatchingEnabled == false) goto L25;
        NestedScrollNode r2 = this.lastKnownParentNode;
        if (r2 == null) goto L24;
        r6.label = 1;
        r11 = r2.mo496onPostFlingRZ2iAVY(consumed, available, r6);
        if (r11 != r7) goto L23;
        return r7;
    L24:
        r10 = Velocity.Companion.m7222getZero9UxMQ8M();
        goto L33
    L11:
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    L7:
        r0 = new NestedScrollDispatcher$dispatchPostFling$1(this, r13);
        goto L8
    }
}
