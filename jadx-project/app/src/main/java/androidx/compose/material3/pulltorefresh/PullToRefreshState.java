package androidx.compose.material3.pulltorefresh;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

/* JADX INFO: compiled from: PullToRefresh.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\bg\u0018\u00002\u00020\u0001J\u000e\u0010\t\u001a\u00020\nH¦@¢\u0006\u0002\u0010\u000bJ\u000e\u0010\f\u001a\u00020\nH¦@¢\u0006\u0002\u0010\u000bJ\u0018\u0010\r\u001a\u00020\n2\b\b\u0001\u0010\u000e\u001a\u00020\u0003H¦@¢\u0006\u0002\u0010\u000fR\u0014\u0010\u0002\u001a\u00020\u00038gX¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0006\u001a\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\bø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0010À\u0006\u0001"}, d2 = {"Landroidx/compose/material3/pulltorefresh/PullToRefreshState;", "", "distanceFraction", "", "getDistanceFraction", "()F", "isAnimating", "", "()Z", "animateToHidden", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "animateToThreshold", "snapTo", "targetValue", "(FLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public interface PullToRefreshState {
    Object animateToHidden(Continuation<? super Unit> r1);

    Object animateToThreshold(Continuation<? super Unit> r1);

    float getDistanceFraction();

    Object snapTo(float r1, Continuation<? super Unit> r2);

    default boolean isAnimating() {
        return false;
    }
}
