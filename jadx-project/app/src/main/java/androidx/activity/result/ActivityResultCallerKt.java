package androidx.activity.result;

import androidx.activity.result.contract.ActivityResultContract;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: ActivityResultCaller.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001aV\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001\"\u0004\b\u0000\u0010\u0003\"\u0004\b\u0001\u0010\u0004*\u00020\u00052\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u0002H\u0003\u0012\u0004\u0012\u0002H\u00040\u00072\u0006\u0010\b\u001a\u0002H\u00032\u0017\u0010\t\u001a\u0013\u0012\t\u0012\u0007H\u0004¢\u0006\u0002\b\u000b\u0012\u0004\u0012\u00020\u00020\n¢\u0006\u0002\u0010\f\u001a^\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001\"\u0004\b\u0000\u0010\u0003\"\u0004\b\u0001\u0010\u0004*\u00020\u00052\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u0002H\u0003\u0012\u0004\u0012\u0002H\u00040\u00072\u0006\u0010\b\u001a\u0002H\u00032\u0006\u0010\r\u001a\u00020\u000e2\u0017\u0010\t\u001a\u0013\u0012\t\u0012\u0007H\u0004¢\u0006\u0002\b\u000b\u0012\u0004\u0012\u00020\u00020\n¢\u0006\u0002\u0010\u000f¨\u0006\u0010"}, d2 = {"registerForActivityResult", "Landroidx/activity/result/ActivityResultLauncher;", "", "I", "O", "Landroidx/activity/result/ActivityResultCaller;", "contract", "Landroidx/activity/result/contract/ActivityResultContract;", "input", "callback", "Lkotlin/Function1;", "Lkotlin/jvm/JvmSuppressWildcards;", "(Landroidx/activity/result/ActivityResultCaller;Landroidx/activity/result/contract/ActivityResultContract;Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)Landroidx/activity/result/ActivityResultLauncher;", "registry", "Landroidx/activity/result/ActivityResultRegistry;", "(Landroidx/activity/result/ActivityResultCaller;Landroidx/activity/result/contract/ActivityResultContract;Ljava/lang/Object;Landroidx/activity/result/ActivityResultRegistry;Lkotlin/jvm/functions/Function1;)Landroidx/activity/result/ActivityResultLauncher;", "activity_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class ActivityResultCallerKt {
    public static final <I, O> ActivityResultLauncher<Unit> registerForActivityResult(ActivityResultCaller $this$registerForActivityResult, ActivityResultContract<I, O> r3, I r4, ActivityResultRegistry registry, final Function1<O, Unit> r6) {
        Intrinsics.checkNotNullParameter($this$registerForActivityResult, "<this>");
        Intrinsics.checkNotNullParameter(r3, "contract");
        Intrinsics.checkNotNullParameter(registry, "registry");
        Intrinsics.checkNotNullParameter(r6, "callback");
        return new ActivityResultCallerLauncher($this$registerForActivityResult.registerForActivityResult(r3, registry, new ActivityResultCallerKt$$ExternalSyntheticLambda0(r6)), r3, r4);
    }

    static final void registerForActivityResult$lambda$0(Function1 $callback, Object it) {
        $callback.invoke(it);
    }

    public static final <I, O> ActivityResultLauncher<Unit> registerForActivityResult(ActivityResultCaller $this$registerForActivityResult, ActivityResultContract<I, O> r3, I r4, final Function1<O, Unit> r5) {
        Intrinsics.checkNotNullParameter($this$registerForActivityResult, "<this>");
        Intrinsics.checkNotNullParameter(r3, "contract");
        Intrinsics.checkNotNullParameter(r5, "callback");
        return new ActivityResultCallerLauncher($this$registerForActivityResult.registerForActivityResult(r3, new ActivityResultCallerKt$$ExternalSyntheticLambda1(r5)), r3, r4);
    }

    static final void registerForActivityResult$lambda$1(Function1 $callback, Object it) {
        $callback.invoke(it);
    }
}
