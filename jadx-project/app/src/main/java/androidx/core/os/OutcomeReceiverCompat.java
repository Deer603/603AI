package androidx.core.os;

import java.lang.Throwable;

/* JADX INFO: loaded from: classes4.dex */
public interface OutcomeReceiverCompat<R, E extends Throwable> {
    void onResult(R r1);

    default void onError(E error) {
    }
}
