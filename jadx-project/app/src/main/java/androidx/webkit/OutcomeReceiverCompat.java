package androidx.webkit;

import java.lang.Throwable;

/* JADX INFO: loaded from: classes4.dex */
public interface OutcomeReceiverCompat<T, E extends Throwable> {
    void onResult(T r1);

    default void onError(E error) {
    }
}
