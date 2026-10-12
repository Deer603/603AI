package androidx.core.transition;

import android.transition.Transition;
import androidx.autofill.HintConstants;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: Transition.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u000b\u001aÆ\u0001\u0010\u0000\u001a\u00020\u0001*\u00020\u00022#\b\u0006\u0010\u0003\u001a\u001d\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020\b0\u00042#\b\u0006\u0010\t\u001a\u001d\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020\b0\u00042#\b\u0006\u0010\n\u001a\u001d\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020\b0\u00042#\b\u0006\u0010\u000b\u001a\u001d\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020\b0\u00042#\b\u0006\u0010\f\u001a\u001d\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020\b0\u0004H\u0086\b\u001a2\u0010\r\u001a\u00020\u0001*\u00020\u00022#\b\u0004\u0010\u000e\u001a\u001d\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020\b0\u0004H\u0086\b\u001a2\u0010\u000f\u001a\u00020\u0001*\u00020\u00022#\b\u0004\u0010\u000e\u001a\u001d\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020\b0\u0004H\u0086\b\u001a2\u0010\u0010\u001a\u00020\u0001*\u00020\u00022#\b\u0004\u0010\u000e\u001a\u001d\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020\b0\u0004H\u0086\b\u001a2\u0010\u0011\u001a\u00020\u0001*\u00020\u00022#\b\u0004\u0010\u000e\u001a\u001d\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020\b0\u0004H\u0086\b\u001a2\u0010\u0012\u001a\u00020\u0001*\u00020\u00022#\b\u0004\u0010\u000e\u001a\u001d\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020\b0\u0004H\u0086\b¨\u0006\u0013"}, d2 = {"addListener", "Landroid/transition/Transition$TransitionListener;", "Landroid/transition/Transition;", "onEnd", "Lkotlin/Function1;", "Lkotlin/ParameterName;", HintConstants.AUTOFILL_HINT_NAME, "transition", "", "onStart", "onCancel", "onResume", "onPause", "doOnCancel", "action", "doOnEnd", "doOnPause", "doOnResume", "doOnStart", "core-ktx_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class TransitionKt {
    public static final Transition.TransitionListener doOnEnd(Transition $this$doOnEnd, final Function1<? super Transition, Unit> r6) {
        Transition.TransitionListener r3 = new TransitionKt$doOnEnd$$inlined$addListener$default$1(r6);
        $this$doOnEnd.addListener(r3);
        return r3;
    }

    public static final Transition.TransitionListener doOnStart(Transition $this$doOnStart, final Function1<? super Transition, Unit> r6) {
        Transition.TransitionListener r3 = new TransitionKt$doOnStart$$inlined$addListener$default$1(r6);
        $this$doOnStart.addListener(r3);
        return r3;
    }

    public static final Transition.TransitionListener doOnCancel(Transition $this$doOnCancel, final Function1<? super Transition, Unit> r6) {
        Transition.TransitionListener r3 = new TransitionKt$doOnCancel$$inlined$addListener$default$1(r6);
        $this$doOnCancel.addListener(r3);
        return r3;
    }

    public static final Transition.TransitionListener doOnResume(Transition $this$doOnResume, final Function1<? super Transition, Unit> r6) {
        Transition.TransitionListener r3 = new TransitionKt$doOnResume$$inlined$addListener$default$1(r6);
        $this$doOnResume.addListener(r3);
        return r3;
    }

    public static final Transition.TransitionListener doOnPause(Transition $this$doOnPause, final Function1<? super Transition, Unit> r6) {
        Transition.TransitionListener r3 = new TransitionKt$doOnPause$$inlined$addListener$default$1(r6);
        $this$doOnPause.addListener(r3);
        return r3;
    }

    public static /* synthetic */ Transition.TransitionListener addListener$default(Transition $this$addListener_u24default, Function1 onEnd, Function1 onStart, Function1 onCancel, Function1 onResume, Function1 onPause, int r7, Object r8) {
        if ((r7 & 1) == 0) goto L6;
        Function1 onEnd2 = AnonymousClass1.INSTANCE;
        onEnd = onEnd2;
    L6:
        if ((r7 & 2) == 0) goto L8;
        Function1 onStart2 = AnonymousClass2.INSTANCE;
        Function1 onStart3 = onStart2;
    L10:
        if ((r7 & 4) == 0) goto L13;
        Function1 onCancel2 = AnonymousClass3.INSTANCE;
        onCancel = onCancel2;
    L13:
        if ((r7 & 8) == 0) goto L16;
        Function1 onResume2 = AnonymousClass4.INSTANCE;
        onResume = onResume2;
    L16:
        if ((r7 & 16) == 0) goto L18;
        Function1 onPause2 = AnonymousClass5.INSTANCE;
        onPause = onPause2;
    L18:
        Function1 onCancel3 = onCancel;
        Function1 onCancel4 = onEnd;
        TransitionKt$addListener$listener$1 listener = new TransitionKt$addListener$listener$1(onCancel4, onResume, onPause, onCancel3, onStart3);
        $this$addListener_u24default.addListener(listener);
        return listener;
    L8:
        onStart3 = onStart;
        goto L10
    }

    public static final Transition.TransitionListener addListener(Transition $this$addListener, Function1<? super Transition, Unit> r8, Function1<? super Transition, Unit> r9, Function1<? super Transition, Unit> r10, Function1<? super Transition, Unit> r11, Function1<? super Transition, Unit> r12) {
        TransitionKt$addListener$listener$1 listener = new TransitionKt$addListener$listener$1(r8, r11, r12, r10, r9);
        $this$addListener.addListener(listener);
        return listener;
    }
}
