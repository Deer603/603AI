package androidx.compose.ui.window;

import androidx.compose.ui.platform.InfiniteAnimationPolicyKt;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;

/* JADX INFO: compiled from: AndroidPopup.android.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "androidx.compose.ui.window.AndroidPopup_androidKt$Popup$5$1", f = "AndroidPopup.android.kt", i = {0}, l = {371}, m = "invokeSuspend", n = {"$this$LaunchedEffect"}, s = {"L$0"})
final class AndroidPopup_androidKt$Popup$5$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ PopupLayout $popupLayout;
    private /* synthetic */ Object L$0;
    int label;

    AndroidPopup_androidKt$Popup$5$1(PopupLayout r2, Continuation<? super AndroidPopup_androidKt$Popup$5$1> r3) {
        this.$popupLayout = r2;
        super(2, r3);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object r3, Continuation<?> r4) {
        AndroidPopup_androidKt$Popup$5$1 r0 = new AndroidPopup_androidKt$Popup$5$1(this.$popupLayout, r4);
        r0.L$0 = r3;
        return r0;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope r2, Continuation<? super Unit> r3) {
        return invoke2(r2, r3);
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(CoroutineScope r3, Continuation<? super Unit> r4) {
        return ((AndroidPopup_androidKt$Popup$5$1) create(r3, r4)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:11:0x0038 -> B:13:0x003b). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object $result) {
        Object r0 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch(this.label) {
            case 0: goto L7;
            case 1: goto L6;
            default: goto L5;
        };
    L6:
        CoroutineScope $this$LaunchedEffect = (CoroutineScope) this.L$0;
        ResultKt.throwOnFailure($result);
        AndroidPopup_androidKt$Popup$5$1 r2 = this;
    L13:
        r2.$popupLayout.pollForLocationOnScreenChange();
    L9:
        if (CoroutineScopeKt.isActive($this$LaunchedEffect) == false) goto L15;
        r2.L$0 = $this$LaunchedEffect;
        r2.label = 1;
        if (InfiniteAnimationPolicyKt.withInfiniteAnimationFrameNanos(AnonymousClass1.INSTANCE, r2) != r0) goto L13;
        return r0;
    L15:
        return Unit.INSTANCE;
    L7:
        ResultKt.throwOnFailure($result);
        $this$LaunchedEffect = (CoroutineScope) this.L$0;
        r2 = this;
        goto L9
    L5:
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
