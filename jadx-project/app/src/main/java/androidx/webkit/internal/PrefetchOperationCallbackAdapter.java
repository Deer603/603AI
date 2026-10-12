package androidx.webkit.internal;

import androidx.webkit.OutcomeReceiverCompat;
import androidx.webkit.PrefetchException;
import java.lang.reflect.InvocationHandler;
import org.chromium.support_lib_boundary.PrefetchOperationCallbackBoundaryInterface;
import org.chromium.support_lib_boundary.util.BoundaryInterfaceReflectionUtil;

/* JADX INFO: loaded from: classes4.dex */
public class PrefetchOperationCallbackAdapter {
    public PrefetchOperationCallbackAdapter() {
    }

    public static InvocationHandler buildInvocationHandler(final OutcomeReceiverCompat<Void, PrefetchException> callback) {
        PrefetchOperationCallbackBoundaryInterface operationCallback = new AnonymousClass1(callback);
        return BoundaryInterfaceReflectionUtil.createInvocationHandlerFor(operationCallback);
    }
}
