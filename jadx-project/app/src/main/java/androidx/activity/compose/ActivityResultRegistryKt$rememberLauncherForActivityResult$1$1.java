package androidx.activity.compose;

import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.ActivityResultRegistry;
import androidx.activity.result.contract.ActivityResultContract;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.State;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: ActivityResultRegistry.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003*\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Landroidx/compose/runtime/DisposableEffectResult;", "I", "O", "Landroidx/compose/runtime/DisposableEffectScope;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
final class ActivityResultRegistryKt$rememberLauncherForActivityResult$1$1 extends Lambda implements Function1<DisposableEffectScope, DisposableEffectResult> {
    final /* synthetic */ ActivityResultRegistry $activityResultRegistry;
    final /* synthetic */ ActivityResultContract<I, O> $contract;
    final /* synthetic */ State<Function1<O, Unit>> $currentOnResult;
    final /* synthetic */ String $key;
    final /* synthetic */ ActivityResultLauncherHolder<I> $realLauncher;

    /* JADX WARN: Multi-variable type inference failed */
    ActivityResultRegistryKt$rememberLauncherForActivityResult$1$1(ActivityResultLauncherHolder<I> r2, ActivityResultRegistry r3, String r4, ActivityResultContract<I, O> r5, State<? extends Function1<? super O, Unit>> r6) {
        this.$realLauncher = r2;
        this.$activityResultRegistry = r3;
        this.$key = r4;
        this.$contract = r5;
        this.$currentOnResult = r6;
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ DisposableEffectResult invoke(DisposableEffectScope r2) {
        return invoke2(r2);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final DisposableEffectResult invoke2(DisposableEffectScope r7) {
        ActivityResultLauncherHolder<I> r0 = this.$realLauncher;
        ActivityResultRegistry r1 = this.$activityResultRegistry;
        String r2 = this.$key;
        ActivityResultContract<I, O> r3 = this.$contract;
        final State<Function1<O, Unit>> r4 = this.$currentOnResult;
        r0.setLauncher((ActivityResultLauncher<I>) r1.register(r2, r3, new ActivityResultRegistryKt$rememberLauncherForActivityResult$1$1$$ExternalSyntheticLambda0(r4)));
        final ActivityResultLauncherHolder<I> r5 = this.$realLauncher;
        return new ActivityResultRegistryKt$rememberLauncherForActivityResult$1$1$invoke$$inlined$onDispose$1(r5);
    }

    static final void invoke$lambda$0(State $currentOnResult, Object it) {
        ((Function1) $currentOnResult.getValue()).invoke(it);
    }
}
