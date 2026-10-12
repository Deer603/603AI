package androidx.activity.compose;

import androidx.activity.BackEventCompat;
import androidx.activity.OnBackPressedCallback;
import androidx.autofill.HintConstants;
import androidx.core.app.NotificationCompat;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.channels.ChannelResult;
import kotlinx.coroutines.flow.Flow;

/* JADX INFO: compiled from: PredictiveBackHandler.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u0000\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0002\u0018\u00002\u00020\u0001BN\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00127\u0010\u0006\u001a3\b\u0001\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020\t0\b¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\u0007¢\u0006\u0002\u0010\u0010J\b\u0010\u001d\u001a\u00020\u000eH\u0016J\b\u0010\u001e\u001a\u00020\u000eH\u0016J\u0010\u0010\u001f\u001a\u00020\u000e2\u0006\u0010 \u001a\u00020\tH\u0016J\u0010\u0010!\u001a\u00020\u000e2\u0006\u0010 \u001a\u00020\tH\u0016J\u000e\u0010\"\u001a\u00020\u000e2\u0006\u0010\u0002\u001a\u00020\u0003RM\u0010\u0006\u001a3\b\u0001\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020\t0\b¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\u0007X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0015\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u000e\u0010\u0016\u001a\u00020\u0003X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0018X\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001c¨\u0006#"}, d2 = {"Landroidx/activity/compose/PredictiveBackHandlerCallback;", "Landroidx/activity/OnBackPressedCallback;", "enabled", "", "onBackScope", "Lkotlinx/coroutines/CoroutineScope;", "currentOnBack", "Lkotlin/Function2;", "Lkotlinx/coroutines/flow/Flow;", "Landroidx/activity/BackEventCompat;", "Lkotlin/ParameterName;", HintConstants.AUTOFILL_HINT_NAME, NotificationCompat.CATEGORY_PROGRESS, "Lkotlin/coroutines/Continuation;", "", "", "(ZLkotlinx/coroutines/CoroutineScope;Lkotlin/jvm/functions/Function2;)V", "getCurrentOnBack", "()Lkotlin/jvm/functions/Function2;", "setCurrentOnBack", "(Lkotlin/jvm/functions/Function2;)V", "Lkotlin/jvm/functions/Function2;", "isActive", "onBackInstance", "Landroidx/activity/compose/OnBackInstance;", "getOnBackScope", "()Lkotlinx/coroutines/CoroutineScope;", "setOnBackScope", "(Lkotlinx/coroutines/CoroutineScope;)V", "handleOnBackCancelled", "handleOnBackPressed", "handleOnBackProgressed", "backEvent", "handleOnBackStarted", "setIsEnabled", "activity-compose_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
final class PredictiveBackHandlerCallback extends OnBackPressedCallback {
    private Function2<? super Flow<BackEventCompat>, ? super Continuation<? super Unit>, ? extends Object> currentOnBack;
    private boolean isActive;
    private OnBackInstance onBackInstance;
    private CoroutineScope onBackScope;

    public final CoroutineScope getOnBackScope() {
        return this.onBackScope;
    }

    public final void setOnBackScope(CoroutineScope r1) {
        this.onBackScope = r1;
    }

    public final Function2<Flow<BackEventCompat>, Continuation<? super Unit>, Object> getCurrentOnBack() {
        return this.currentOnBack;
    }

    public final void setCurrentOnBack(Function2<? super Flow<BackEventCompat>, ? super Continuation<? super Unit>, ? extends Object> r1) {
        this.currentOnBack = r1;
    }

    public PredictiveBackHandlerCallback(boolean enabled, CoroutineScope onBackScope, Function2<? super Flow<BackEventCompat>, ? super Continuation<? super Unit>, ? extends Object> r3) {
        super(enabled);
        this.onBackScope = onBackScope;
        this.currentOnBack = r3;
    }

    public final void setIsEnabled(boolean enabled) {
        if (enabled == false) goto L4;
    L10:
        setEnabled(enabled);
        return;
    L4:
        if (this.isActive == true) goto L10;
        if (isEnabled() == false) goto L10;
        OnBackInstance r0 = this.onBackInstance;
        if (r0 == null) goto L10;
        r0.cancel();
        goto L10
    }

    @Override // androidx.activity.OnBackPressedCallback
    public void handleOnBackStarted(BackEventCompat backEvent) {
        super.handleOnBackStarted(backEvent);
        OnBackInstance r0 = this.onBackInstance;
        if (r0 == null) goto L6;
        r0.cancel();
    L6:
        if (isEnabled() == false) goto L8;
        this.onBackInstance = new OnBackInstance(this.onBackScope, true, this.currentOnBack, this);
    L8:
        this.isActive = true;
    }

    @Override // androidx.activity.OnBackPressedCallback
    public void handleOnBackProgressed(BackEventCompat backEvent) {
        super.handleOnBackProgressed(backEvent);
        OnBackInstance r0 = this.onBackInstance;
        if (r0 == null) goto L6;
        ChannelResult.m8926boximpl(r0.m0sendJP2dKIU(backEvent));
        return;
    }

    @Override // androidx.activity.OnBackPressedCallback
    public void handleOnBackPressed() {
        OnBackInstance $this$handleOnBackPressed_u24lambda_u240 = this.onBackInstance;
        if ($this$handleOnBackPressed_u24lambda_u240 == null) goto L9;
        if ($this$handleOnBackPressed_u24lambda_u240.isPredictiveBack() == true) goto L9;
        $this$handleOnBackPressed_u24lambda_u240.cancel();
        this.onBackInstance = null;
    L9:
        if (this.onBackInstance != null) goto L11;
        this.onBackInstance = new OnBackInstance(this.onBackScope, false, this.currentOnBack, this);
    L11:
        OnBackInstance r0 = this.onBackInstance;
        if (r0 == null) goto L14;
        r0.close();
    L14:
        OnBackInstance r1 = this.onBackInstance;
        if (r1 == null) goto L18;
        r1.setPredictiveBack(false);
    L18:
        this.isActive = false;
    }

    @Override // androidx.activity.OnBackPressedCallback
    public void handleOnBackCancelled() {
        super.handleOnBackCancelled();
        OnBackInstance r0 = this.onBackInstance;
        if (r0 == null) goto L5;
        r0.cancel();
    L5:
        OnBackInstance r1 = this.onBackInstance;
        if (r1 == null) goto L9;
        r1.setPredictiveBack(false);
    L9:
        this.isActive = false;
    }
}
