package androidx.core.animation;

import android.animation.Animator;
import androidx.autofill.HintConstants;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: Animator.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000(\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\u001a¡\u0001\u0010\u0000\u001a\u00020\u0001*\u00020\u00022#\b\u0006\u0010\u0003\u001a\u001d\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020\b0\u00042#\b\u0006\u0010\t\u001a\u001d\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020\b0\u00042#\b\u0006\u0010\n\u001a\u001d\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020\b0\u00042#\b\u0006\u0010\u000b\u001a\u001d\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020\b0\u0004H\u0086\b\u001aT\u0010\f\u001a\u00020\r*\u00020\u00022#\b\u0002\u0010\u000e\u001a\u001d\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020\b0\u00042#\b\u0002\u0010\u000f\u001a\u001d\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020\b0\u0004\u001a2\u0010\u0010\u001a\u00020\u0001*\u00020\u00022#\b\u0004\u0010\u0011\u001a\u001d\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020\b0\u0004H\u0086\b\u001a2\u0010\u0012\u001a\u00020\u0001*\u00020\u00022#\b\u0004\u0010\u0011\u001a\u001d\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020\b0\u0004H\u0086\b\u001a-\u0010\u0013\u001a\u00020\r*\u00020\u00022!\u0010\u0011\u001a\u001d\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020\b0\u0004\u001a2\u0010\u0014\u001a\u00020\u0001*\u00020\u00022#\b\u0004\u0010\u0011\u001a\u001d\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020\b0\u0004H\u0086\b\u001a-\u0010\u0015\u001a\u00020\r*\u00020\u00022!\u0010\u0011\u001a\u001d\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020\b0\u0004\u001a2\u0010\u0016\u001a\u00020\u0001*\u00020\u00022#\b\u0004\u0010\u0011\u001a\u001d\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020\b0\u0004H\u0086\b¨\u0006\u0017"}, d2 = {"addListener", "Landroid/animation/Animator$AnimatorListener;", "Landroid/animation/Animator;", "onEnd", "Lkotlin/Function1;", "Lkotlin/ParameterName;", HintConstants.AUTOFILL_HINT_NAME, "animator", "", "onStart", "onCancel", "onRepeat", "addPauseListener", "Landroid/animation/Animator$AnimatorPauseListener;", "onResume", "onPause", "doOnCancel", "action", "doOnEnd", "doOnPause", "doOnRepeat", "doOnResume", "doOnStart", "core-ktx_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class AnimatorKt {
    public static final Animator.AnimatorListener doOnEnd(Animator $this$doOnEnd, final Function1<? super Animator, Unit> r6) {
        Animator.AnimatorListener r3 = new AnimatorKt$doOnEnd$$inlined$addListener$default$1(r6);
        $this$doOnEnd.addListener(r3);
        return r3;
    }

    public static final Animator.AnimatorListener doOnStart(Animator $this$doOnStart, final Function1<? super Animator, Unit> r6) {
        Animator.AnimatorListener r3 = new AnimatorKt$doOnStart$$inlined$addListener$default$1(r6);
        $this$doOnStart.addListener(r3);
        return r3;
    }

    public static final Animator.AnimatorListener doOnCancel(Animator $this$doOnCancel, final Function1<? super Animator, Unit> r6) {
        Animator.AnimatorListener r3 = new AnimatorKt$doOnCancel$$inlined$addListener$default$1(r6);
        $this$doOnCancel.addListener(r3);
        return r3;
    }

    public static final Animator.AnimatorListener doOnRepeat(Animator $this$doOnRepeat, final Function1<? super Animator, Unit> r6) {
        Animator.AnimatorListener r3 = new AnimatorKt$doOnRepeat$$inlined$addListener$default$1(r6);
        $this$doOnRepeat.addListener(r3);
        return r3;
    }

    public static final Animator.AnimatorPauseListener doOnResume(Animator $this$doOnResume, Function1<? super Animator, Unit> r3) {
        return addPauseListener$default($this$doOnResume, r3, null, 2, null);
    }

    public static final Animator.AnimatorPauseListener doOnPause(Animator $this$doOnPause, Function1<? super Animator, Unit> r3) {
        return addPauseListener$default($this$doOnPause, null, r3, 1, null);
    }

    public static /* synthetic */ Animator.AnimatorListener addListener$default(Animator $this$addListener_u24default, Function1 onEnd, Function1 onStart, Function1 onCancel, Function1 onRepeat, int r6, Object r7) {
        if ((r6 & 1) == 0) goto L6;
        Function1 onEnd2 = AnonymousClass1.INSTANCE;
        onEnd = onEnd2;
    L6:
        if ((r6 & 2) == 0) goto L9;
        Function1 onStart2 = AnonymousClass2.INSTANCE;
        onStart = onStart2;
    L9:
        if ((r6 & 4) == 0) goto L12;
        Function1 onCancel2 = AnonymousClass3.INSTANCE;
        onCancel = onCancel2;
    L12:
        if ((r6 & 8) == 0) goto L14;
        Function1 onRepeat2 = AnonymousClass4.INSTANCE;
        onRepeat = onRepeat2;
    L14:
        AnimatorKt$addListener$listener$1 listener = new AnimatorKt$addListener$listener$1(onRepeat, onEnd, onCancel, onStart);
        $this$addListener_u24default.addListener(listener);
        return listener;
    }

    public static final Animator.AnimatorListener addListener(Animator $this$addListener, Function1<? super Animator, Unit> r4, Function1<? super Animator, Unit> r5, Function1<? super Animator, Unit> r6, Function1<? super Animator, Unit> r7) {
        AnimatorKt$addListener$listener$1 listener = new AnimatorKt$addListener$listener$1(r7, r4, r6, r5);
        $this$addListener.addListener(listener);
        return listener;
    }

    public static /* synthetic */ Animator.AnimatorPauseListener addPauseListener$default(Animator r0, C06801 r1, C06812 r2, int r3, Object r4) {
        if ((r3 & 1) == 0) goto L6;
        r1 = C06801.INSTANCE;
    L6:
        if ((r3 & 2) == 0) goto L9;
        r2 = C06812.INSTANCE;
    L9:
        return addPauseListener(r0, r1, r2);
    }

    public static final Animator.AnimatorPauseListener addPauseListener(Animator $this$addPauseListener, final Function1<? super Animator, Unit> r3, final Function1<? super Animator, Unit> r4) {
        Animator.AnimatorPauseListener r0 = new AnimatorKt$addPauseListener$listener$1(r4, r3);
        $this$addPauseListener.addPauseListener(r0);
        return r0;
    }
}
