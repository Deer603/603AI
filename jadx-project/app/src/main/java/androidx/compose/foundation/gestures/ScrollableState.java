package androidx.compose.foundation.gestures;

import androidx.compose.foundation.MutatePriority;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: ScrollableState.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000eH&JA\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u00132'\u0010\u0014\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u0017\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0015¢\u0006\u0002\b\u0018H¦@¢\u0006\u0002\u0010\u0019R\u0014\u0010\u0002\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0006\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\u0005R\u0012\u0010\b\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\u0005R\u0014\u0010\t\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u0005R\u0014\u0010\u000b\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\u0005ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u001aÀ\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/gestures/ScrollableState;", "", "canScrollBackward", "", "getCanScrollBackward", "()Z", "canScrollForward", "getCanScrollForward", "isScrollInProgress", "lastScrolledBackward", "getLastScrolledBackward", "lastScrolledForward", "getLastScrolledForward", "dispatchRawDelta", "", "delta", "scroll", "", "scrollPriority", "Landroidx/compose/foundation/MutatePriority;", "block", "Lkotlin/Function2;", "Landroidx/compose/foundation/gestures/ScrollScope;", "Lkotlin/coroutines/Continuation;", "Lkotlin/ExtensionFunctionType;", "(Landroidx/compose/foundation/MutatePriority;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public interface ScrollableState {

    /* JADX INFO: compiled from: ScrollableState.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class DefaultImpls {
        public static /* synthetic */ Object scroll$default(ScrollableState r0, MutatePriority r1, Function2 r2, Continuation r3, int r4, Object r5) {
            return ScrollableState.scroll$default(r0, r1, r2, r3, r4, r5);
        }

        @Deprecated
        public static boolean getCanScrollForward(ScrollableState $this) {
            return ScrollableState.access$getCanScrollForward$jd($this);
        }

        @Deprecated
        public static boolean getCanScrollBackward(ScrollableState $this) {
            return ScrollableState.access$getCanScrollBackward$jd($this);
        }

        @Deprecated
        public static boolean getLastScrolledForward(ScrollableState $this) {
            return ScrollableState.access$getLastScrolledForward$jd($this);
        }

        @Deprecated
        public static boolean getLastScrolledBackward(ScrollableState $this) {
            return ScrollableState.access$getLastScrolledBackward$jd($this);
        }
    }

    float dispatchRawDelta(float r1);

    boolean isScrollInProgress();

    Object scroll(MutatePriority r1, Function2<? super ScrollScope, ? super Continuation<? super Unit>, ? extends Object> r2, Continuation<? super Unit> r3);

    static /* synthetic */ boolean access$getCanScrollBackward$jd(ScrollableState $this) {
        return super.getCanScrollBackward();
    }

    static /* synthetic */ boolean access$getCanScrollForward$jd(ScrollableState $this) {
        return super.getCanScrollForward();
    }

    static /* synthetic */ boolean access$getLastScrolledBackward$jd(ScrollableState $this) {
        return super.getLastScrolledBackward();
    }

    static /* synthetic */ boolean access$getLastScrolledForward$jd(ScrollableState $this) {
        return super.getLastScrolledForward();
    }

    static /* synthetic */ Object scroll$default(ScrollableState r0, MutatePriority r1, Function2 r2, Continuation r3, int r4, Object r5) {
        if (r5 != null) goto L9;
        if ((r4 & 1) == 0) goto L7;
        r1 = MutatePriority.Default;
    L7:
        return r0.scroll(r1, r2, r3);
    L9:
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: scroll");
    }

    default boolean getCanScrollForward() {
        return true;
    }

    default boolean getCanScrollBackward() {
        return true;
    }

    default boolean getLastScrolledForward() {
        return false;
    }

    default boolean getLastScrolledBackward() {
        return false;
    }
}
