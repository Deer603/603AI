package androidx.compose.ui.window;

import android.os.Handler;
import android.os.Looper;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: AndroidPopup.android.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "command", "Lkotlin/Function0;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
final class PopupLayout$snapshotStateObserver$1 extends Lambda implements Function1<Function0<? extends Unit>, Unit> {
    final /* synthetic */ PopupLayout this$0;

    PopupLayout$snapshotStateObserver$1(PopupLayout r2) {
        this.this$0 = r2;
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Function0<? extends Unit> r2) {
        invoke2(r2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(final Function0<Unit> r3) {
        Handler r0 = this.this$0.getHandler();
        if (r0 == null) goto L5;
        Looper r1 = r0.getLooper();
    L7:
        if (r1 != Looper.myLooper()) goto L9;
        r3.invoke();
        return;
    L9:
        Handler r2 = this.this$0.getHandler();
        if (r2 == null) goto L14;
        r2.post(new PopupLayout$snapshotStateObserver$1$$ExternalSyntheticLambda0(r3));
        return;
    L14:
        return;
    L5:
        r1 = null;
        goto L7
    }

    static final void invoke$lambda$0(Function0 $tmp0) {
        $tmp0.invoke();
    }
}
