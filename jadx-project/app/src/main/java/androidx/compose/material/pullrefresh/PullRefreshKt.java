package androidx.compose.material.pullrefresh;

import androidx.autofill.HintConstants;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.input.nestedscroll.NestedScrollModifierKt;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendFunction;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AdaptedFunctionReference;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* JADX INFO: compiled from: PullRefresh.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u001aq\u0010\u0000\u001a\u00020\u0001*\u00020\u00012!\u0010\u0002\u001a\u001d\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020\u00040\u000321\u0010\b\u001a-\b\u0001\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\n\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u000b\u0012\u0006\u0012\u0004\u0018\u00010\f0\t2\b\b\u0002\u0010\r\u001a\u00020\u000eH\u0007¢\u0006\u0002\u0010\u000f\u001a\u001e\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\r\u001a\u00020\u000eH\u0007¨\u0006\u0012"}, d2 = {"pullRefresh", "Landroidx/compose/ui/Modifier;", "onPull", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", HintConstants.AUTOFILL_HINT_NAME, "pullDelta", "onRelease", "Lkotlin/Function2;", "flingVelocity", "Lkotlin/coroutines/Continuation;", "", "enabled", "", "(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;Z)Landroidx/compose/ui/Modifier;", "state", "Landroidx/compose/material/pullrefresh/PullRefreshState;", "material_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class PullRefreshKt {

    /* JADX INFO: renamed from: androidx.compose.material.pullrefresh.PullRefreshKt$pullRefresh$1, reason: invalid class name */
    /* JADX INFO: compiled from: PullRefresh.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* synthetic */ class AnonymousClass1 extends FunctionReferenceImpl implements Function1<Float, Float> {
        AnonymousClass1(Object r8) {
            super(1, r8, PullRefreshState.class, "onPull", "onPull$material_release(F)F", 0);
        }

        public final Float invoke(float p0) {
            return Float.valueOf(((PullRefreshState) this.receiver).onPull$material_release(p0));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Float invoke(Float r2) {
            return invoke(r2.floatValue());
        }
    }

    /* JADX INFO: renamed from: androidx.compose.material.pullrefresh.PullRefreshKt$pullRefresh$2, reason: invalid class name */
    /* JADX INFO: compiled from: PullRefresh.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* synthetic */ class AnonymousClass2 extends AdaptedFunctionReference implements Function2<Float, Continuation<? super Float>, Object>, SuspendFunction {
        AnonymousClass2(Object r8) {
            super(2, r8, PullRefreshState.class, "onRelease", "onRelease$material_release(F)F", 4);
        }

        public final Object invoke(float p0, Continuation<? super Float> r3) {
            return PullRefreshKt.access$pullRefresh$onRelease((PullRefreshState) this.receiver, p0, r3);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Float r3, Continuation<? super Float> r4) {
            return invoke(r3.floatValue(), r4);
        }
    }

    public static final /* synthetic */ Object access$pullRefresh$onRelease(PullRefreshState $receiver, float p0, Continuation $completion) {
        return pullRefresh$onRelease($receiver, p0, $completion);
    }

    public static /* synthetic */ Modifier pullRefresh$default(Modifier r0, PullRefreshState r1, boolean r2, int r3, Object r4) {
        if ((r3 & 2) == 0) goto L6;
        r2 = true;
    L6:
        return pullRefresh(r0, r1, r2);
    }

    public static final Modifier pullRefresh(Modifier $this$pullRefresh, PullRefreshState state, boolean enabled) {
        return pullRefresh($this$pullRefresh, new AnonymousClass1(state), new AnonymousClass2(state), enabled);
    }

    private static final /* synthetic */ Object pullRefresh$onRelease(PullRefreshState $this$pullRefresh_u24onRelease, float p0, Continuation $completion) {
        return Boxing.boxFloat($this$pullRefresh_u24onRelease.onRelease$material_release(p0));
    }

    public static /* synthetic */ Modifier pullRefresh$default(Modifier r0, Function1 r1, Function2 r2, boolean r3, int r4, Object r5) {
        if ((r4 & 4) == 0) goto L6;
        r3 = true;
    L6:
        return pullRefresh(r0, r1, r2, r3);
    }

    public static final Modifier pullRefresh(Modifier $this$pullRefresh, Function1<? super Float, Float> r4, Function2<? super Float, ? super Continuation<? super Float>, ? extends Object> r5, boolean enabled) {
        return NestedScrollModifierKt.nestedScroll$default($this$pullRefresh, new PullRefreshNestedScrollConnection(r4, r5, enabled), null, 2, null);
    }
}
