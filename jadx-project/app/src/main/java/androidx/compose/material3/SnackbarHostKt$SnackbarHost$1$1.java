package androidx.compose.material3;

import androidx.compose.ui.platform.AccessibilityManager;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;

/* JADX INFO: compiled from: SnackbarHost.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "androidx.compose.material3.SnackbarHostKt$SnackbarHost$1$1", f = "SnackbarHost.kt", i = {}, l = {232}, m = "invokeSuspend", n = {}, s = {})
final class SnackbarHostKt$SnackbarHost$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ AccessibilityManager $accessibilityManager;
    final /* synthetic */ SnackbarData $currentSnackbarData;
    int label;

    SnackbarHostKt$SnackbarHost$1$1(SnackbarData r2, AccessibilityManager r3, Continuation<? super SnackbarHostKt$SnackbarHost$1$1> r4) {
        this.$currentSnackbarData = r2;
        this.$accessibilityManager = r3;
        super(2, r4);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object r4, Continuation<?> r5) {
        return new SnackbarHostKt$SnackbarHost$1$1(this.$currentSnackbarData, this.$accessibilityManager, r5);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope r2, Continuation<? super Unit> r3) {
        return invoke2(r2, r3);
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(CoroutineScope r3, Continuation<? super Unit> r4) {
        return ((SnackbarHostKt$SnackbarHost$1$1) create(r3, r4)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object $result) {
        Object r0 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch(this.label) {
            case 0: goto L7;
            case 1: goto L6;
            default: goto L5;
        };
    L6:
        SnackbarHostKt$SnackbarHost$1$1 r1 = this;
        ResultKt.throwOnFailure($result);
    L17:
        r1.$currentSnackbarData.dismiss();
    L19:
        return Unit.INSTANCE;
    L7:
        ResultKt.throwOnFailure($result);
        if (this.$currentSnackbarData == null) goto L19;
        SnackbarDuration r2 = this.$currentSnackbarData.getVisuals().getDuration();
        if (this.$currentSnackbarData.getVisuals().getActionLabel() == null) goto L12;
        boolean r3 = true;
    L13:
        long duration = SnackbarHostKt.toMillis(r2, r3, this.$accessibilityManager);
        this.label = 1;
        if (DelayKt.delay(duration, this) != r0) goto L16;
        return r0;
    L16:
        r1 = this;
        goto L17
    L12:
        r3 = false;
        goto L13
    L5:
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
