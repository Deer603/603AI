package androidx.compose.ui.platform;

import android.view.View;
import androidx.compose.runtime.CompositionContext;
import androidx.compose.runtime.Recomposer;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: WindowRecomposer.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "androidx.compose.ui.platform.WindowRecomposerPolicy$createAndInstallWindowRecomposer$unsetJob$1", f = "WindowRecomposer.android.kt", i = {}, l = {227}, m = "invokeSuspend", n = {}, s = {})
final class WindowRecomposerPolicy$createAndInstallWindowRecomposer$unsetJob$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Recomposer $newRecomposer;
    final /* synthetic */ View $rootView;
    int label;

    WindowRecomposerPolicy$createAndInstallWindowRecomposer$unsetJob$1(Recomposer r2, View r3, Continuation<? super WindowRecomposerPolicy$createAndInstallWindowRecomposer$unsetJob$1> r4) {
        this.$newRecomposer = r2;
        this.$rootView = r3;
        super(2, r4);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object r4, Continuation<?> r5) {
        return new WindowRecomposerPolicy$createAndInstallWindowRecomposer$unsetJob$1(this.$newRecomposer, this.$rootView, r5);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope r2, Continuation<? super Unit> r3) {
        return invoke2(r2, r3);
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(CoroutineScope r3, Continuation<? super Unit> r4) {
        return ((WindowRecomposerPolicy$createAndInstallWindowRecomposer$unsetJob$1) create(r3, r4)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object $result) {
        Object r0 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch(this.label) {
            case 0: goto L10;
            case 1: goto L6;
            default: goto L5;
        };
    L6:
        ResultKt.throwOnFailure($result);     // Catch: Throwable -> L8
    L14:
        CompositionContext viewTagRecomposer = WindowRecomposer_androidKt.getCompositionContext(this.$rootView);
        if (viewTagRecomposer != this.$newRecomposer) goto L18;
        WindowRecomposer_androidKt.setCompositionContext(this.$rootView, null);
    L18:
        return Unit.INSTANCE;
    L10:
        ResultKt.throwOnFailure($result);
        this.label = 1;     // Catch: Throwable -> L8
        if (this.$newRecomposer.join(this) != r0) goto L14;
        return r0;
    L5:
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    L8:
        th = move-exception;
        CompositionContext viewTagRecomposer2 = WindowRecomposer_androidKt.getCompositionContext(this.$rootView);
        if (viewTagRecomposer2 != this.$newRecomposer) goto L22;
        WindowRecomposer_androidKt.setCompositionContext(this.$rootView, null);
    L22:
        throw th;
    }
}
