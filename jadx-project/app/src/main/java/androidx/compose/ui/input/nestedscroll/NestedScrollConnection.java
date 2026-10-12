package androidx.compose.ui.input.nestedscroll;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.unit.Velocity;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;

/* JADX INFO: compiled from: NestedScrollModifier.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\bf\u0018\u00002\u00020\u0001J#\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0003H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007J*\u0010\b\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016ø\u0001\u0000¢\u0006\u0004\b\f\u0010\rJ\u001b\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0003H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010J\"\u0010\u0011\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0013ø\u0001\u0001\u0082\u0002\r\n\u0005\b¡\u001e0\u0001\n\u0004\b!0\u0001¨\u0006\u0014À\u0006\u0003"}, d2 = {"Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;", "", "onPostFling", "Landroidx/compose/ui/unit/Velocity;", "consumed", "available", "onPostFling-RZ2iAVY", "(JJLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "onPostScroll", "Landroidx/compose/ui/geometry/Offset;", "source", "Landroidx/compose/ui/input/nestedscroll/NestedScrollSource;", "onPostScroll-DzOQY0M", "(JJI)J", "onPreFling", "onPreFling-QWom1Mo", "(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "onPreScroll", "onPreScroll-OzD1aCk", "(JI)J", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public interface NestedScrollConnection {

    /* JADX INFO: compiled from: NestedScrollModifier.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class DefaultImpls {
        @Deprecated
        /* JADX INFO: renamed from: onPreScroll-OzD1aCk, reason: not valid java name */
        public static long m5462onPreScrollOzD1aCk(NestedScrollConnection $this, long available, int source) {
            return NestedScrollConnection.m5456access$onPreScrollOzD1aCk$jd($this, available, source);
        }

        @Deprecated
        /* JADX INFO: renamed from: onPostScroll-DzOQY0M, reason: not valid java name */
        public static long m5460onPostScrollDzOQY0M(NestedScrollConnection $this, long consumed, long available, int source) {
            return NestedScrollConnection.m5454access$onPostScrollDzOQY0M$jd($this, consumed, available, source);
        }

        @Deprecated
        /* JADX INFO: renamed from: onPreFling-QWom1Mo, reason: not valid java name */
        public static Object m5461onPreFlingQWom1Mo(NestedScrollConnection $this, long available, Continuation<? super Velocity> r4) {
            return NestedScrollConnection.m5455access$onPreFlingQWom1Mo$jd($this, available, r4);
        }

        @Deprecated
        /* JADX INFO: renamed from: onPostFling-RZ2iAVY, reason: not valid java name */
        public static Object m5459onPostFlingRZ2iAVY(NestedScrollConnection $this, long consumed, long available, Continuation<? super Velocity> r6) {
            return NestedScrollConnection.m5453access$onPostFlingRZ2iAVY$jd($this, consumed, available, r6);
        }
    }

    /* JADX INFO: renamed from: onPostFling-RZ2iAVY */
    default Object mo496onPostFlingRZ2iAVY(long r2, long r4, Continuation<? super Velocity> r6) {
        return m5457onPostFlingRZ2iAVY$suspendImpl(this, r2, r4, r6);
    }

    /* JADX INFO: renamed from: onPreFling-QWom1Mo */
    default Object mo802onPreFlingQWom1Mo(long r2, Continuation<? super Velocity> r4) {
        return m5458onPreFlingQWom1Mo$suspendImpl(this, r2, r4);
    }

    /* JADX INFO: renamed from: access$onPostFling-RZ2iAVY$jd, reason: not valid java name */
    static /* synthetic */ Object m5453access$onPostFlingRZ2iAVY$jd(NestedScrollConnection $this, long consumed, long available, Continuation $completion) {
        return super.mo496onPostFlingRZ2iAVY(consumed, available, $completion);
    }

    /* JADX INFO: renamed from: access$onPostScroll-DzOQY0M$jd, reason: not valid java name */
    static /* synthetic */ long m5454access$onPostScrollDzOQY0M$jd(NestedScrollConnection $this, long consumed, long available, int source) {
        return super.mo497onPostScrollDzOQY0M(consumed, available, source);
    }

    /* JADX INFO: renamed from: access$onPreFling-QWom1Mo$jd, reason: not valid java name */
    static /* synthetic */ Object m5455access$onPreFlingQWom1Mo$jd(NestedScrollConnection $this, long available, Continuation $completion) {
        return super.mo802onPreFlingQWom1Mo(available, $completion);
    }

    /* JADX INFO: renamed from: access$onPreScroll-OzD1aCk$jd, reason: not valid java name */
    static /* synthetic */ long m5456access$onPreScrollOzD1aCk$jd(NestedScrollConnection $this, long available, int source) {
        return super.mo803onPreScrollOzD1aCk(available, source);
    }

    /* JADX INFO: renamed from: onPreScroll-OzD1aCk */
    default long mo803onPreScrollOzD1aCk(long available, int source) {
        return Offset.Companion.m4141getZeroF1C5BW0();
    }

    /* JADX INFO: renamed from: onPostScroll-DzOQY0M */
    default long mo497onPostScrollDzOQY0M(long consumed, long available, int source) {
        return Offset.Companion.m4141getZeroF1C5BW0();
    }

    /* JADX INFO: renamed from: onPreFling-QWom1Mo$suspendImpl, reason: not valid java name */
    static /* synthetic */ Object m5458onPreFlingQWom1Mo$suspendImpl(NestedScrollConnection $this, long available, Continuation<? super Velocity> r5) {
        return Velocity.m7202boximpl(Velocity.Companion.m7222getZero9UxMQ8M());
    }

    /* JADX INFO: renamed from: onPostFling-RZ2iAVY$suspendImpl, reason: not valid java name */
    static /* synthetic */ Object m5457onPostFlingRZ2iAVY$suspendImpl(NestedScrollConnection $this, long consumed, long available, Continuation<? super Velocity> r7) {
        return Velocity.m7202boximpl(Velocity.Companion.m7222getZero9UxMQ8M());
    }
}
