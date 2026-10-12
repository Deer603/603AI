package androidx.activity.contextaware;

import android.content.Context;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CancellableContinuation;

/* JADX INFO: compiled from: ContextAware.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"androidx/activity/contextaware/ContextAwareKt$withContextAvailable$2$listener$1", "Landroidx/activity/contextaware/OnContextAvailableListener;", "onContextAvailable", "", "context", "Landroid/content/Context;", "activity_release"}, k = 1, mv = {1, 8, 0}, xi = 176)
public final class ContextAwareKt$withContextAvailable$2$listener$1 implements OnContextAvailableListener {
    final /* synthetic */ CancellableContinuation<R> $co;
    final /* synthetic */ Function1<Context, R> $onContextAvailable;

    public ContextAwareKt$withContextAvailable$2$listener$1(CancellableContinuation<R> r1, Function1<Context, R> r2) {
        this.$co = r1;
        this.$onContextAvailable = r2;
    }

    @Override // androidx.activity.contextaware.OnContextAvailableListener
    public void onContextAvailable(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        Continuation r0 = this.$co;
        Function1<Context, R> r1 = this.$onContextAvailable;
        Result.Companion r2 = Result.Companion;     // Catch: Throwable -> L5
        ContextAwareKt$withContextAvailable$2$listener$1 r3 = this;     // Catch: Throwable -> L5
        Object r4 = Result.m7425constructorimpl(r1.invoke(context));     // Catch: Throwable -> L5
    L7:
        r0.resumeWith(r4);
        return;
    L5:
        th = move-exception;
        Result.Companion r5 = Result.Companion;
        r4 = Result.m7425constructorimpl(ResultKt.createFailure(th));
        goto L7
    }
}
