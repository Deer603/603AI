package androidx.compose.ui.input.pointer;

import android.os.SystemClock;
import android.view.MotionEvent;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: PointerInteropUtils.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000.\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\u001a&\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00010\u0005H\u0000\u001a2\u0010\u0007\u001a\u00020\u0001*\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00010\u0005H\u0000ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\f\u001a2\u0010\r\u001a\u00020\u0001*\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00010\u0005H\u0000ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\f\u001a:\u0010\r\u001a\u00020\u0001*\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00010\u00052\u0006\u0010\u000f\u001a\u00020\u0010H\u0002ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0013"}, d2 = {"emptyCancelMotionEventScope", "", "nowMillis", "", "block", "Lkotlin/Function1;", "Landroid/view/MotionEvent;", "toCancelMotionEventScope", "Landroidx/compose/ui/input/pointer/PointerEvent;", "offset", "Landroidx/compose/ui/geometry/Offset;", "toCancelMotionEventScope-d-4ec7I", "(Landroidx/compose/ui/input/pointer/PointerEvent;JLkotlin/jvm/functions/Function1;)V", "toMotionEventScope", "toMotionEventScope-d-4ec7I", "cancel", "", "toMotionEventScope-ubNVwUQ", "(Landroidx/compose/ui/input/pointer/PointerEvent;JLkotlin/jvm/functions/Function1;Z)V", "ui_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class PointerInteropUtils_androidKt {
    /* JADX INFO: renamed from: toMotionEventScope-d-4ec7I, reason: not valid java name */
    public static final void m5648toMotionEventScoped4ec7I(PointerEvent $this$toMotionEventScope_u2dd_u2d4ec7I, long offset, Function1<? super MotionEvent, Unit> r4) {
        m5649toMotionEventScopeubNVwUQ($this$toMotionEventScope_u2dd_u2d4ec7I, offset, r4, false);
    }

    /* JADX INFO: renamed from: toCancelMotionEventScope-d-4ec7I, reason: not valid java name */
    public static final void m5647toCancelMotionEventScoped4ec7I(PointerEvent $this$toCancelMotionEventScope_u2dd_u2d4ec7I, long offset, Function1<? super MotionEvent, Unit> r4) {
        m5649toMotionEventScopeubNVwUQ($this$toCancelMotionEventScope_u2dd_u2d4ec7I, offset, r4, true);
    }

    public static /* synthetic */ void emptyCancelMotionEventScope$default(long r0, Function1 r2, int r3, Object r4) {
        if ((r3 & 1) == 0) goto L5;
        r0 = SystemClock.uptimeMillis();
    L5:
        emptyCancelMotionEventScope(r0, r2);
    }

    public static final void emptyCancelMotionEventScope(long nowMillis, Function1<? super MotionEvent, Unit> r10) {
        MotionEvent motionEvent = MotionEvent.obtain(nowMillis, nowMillis, 3, 0.0f, 0.0f, 0);
        motionEvent.setSource(0);
        r10.invoke(motionEvent);
        motionEvent.recycle();
    }

    /* JADX INFO: renamed from: toMotionEventScope-ubNVwUQ, reason: not valid java name */
    private static final void m5649toMotionEventScopeubNVwUQ(PointerEvent $this$toMotionEventScope_u2dubNVwUQ, long offset, Function1<? super MotionEvent, Unit> r17, boolean cancel) {
        MotionEvent motionEvent = $this$toMotionEventScope_u2dubNVwUQ.getMotionEvent$ui_release();
        if (motionEvent == null) goto L10;
        int oldAction = motionEvent.getAction();
        if (cancel == false) goto L7;
        motionEvent.setAction(3);
    L7:
        int bits$iv$iv$iv = (int) (offset >> 32);
        int bits$iv$iv$iv2 = (int) (offset & 4294967295L);
        motionEvent.offsetLocation(-Float.intBitsToFloat(bits$iv$iv$iv), -Float.intBitsToFloat(bits$iv$iv$iv2));
        r17.invoke(motionEvent);
        int bits$iv$iv$iv3 = (int) (offset >> 32);
        int bits$iv$iv$iv4 = (int) (4294967295L & offset);
        motionEvent.offsetLocation(Float.intBitsToFloat(bits$iv$iv$iv3), Float.intBitsToFloat(bits$iv$iv$iv4));
        motionEvent.setAction(oldAction);
        return;
    L10:
        throw new IllegalArgumentException("The PointerEvent receiver cannot have a null MotionEvent.".toString());
    }
}
