package kotlinx.coroutines.internal;

import java.util.Iterator;
import kotlin.ExceptionsKt;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.CoroutineExceptionHandler;
import kotlinx.coroutines.CoroutineExceptionHandlerKt;

/* JADX INFO: compiled from: CoroutineExceptionHandlerImpl.common.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\u001a\u0018\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0000¨\u0006\u0006"}, d2 = {"handleUncaughtCoroutineException", "", "context", "Lkotlin/coroutines/CoroutineContext;", "exception", "", "kotlinx-coroutines-core"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class CoroutineExceptionHandlerImpl_commonKt {
    public static final void handleUncaughtCoroutineException(CoroutineContext context, Throwable exception) {
        Iterator<CoroutineExceptionHandler> r0 = CoroutineExceptionHandlerImplKt.getPlatformExceptionHandlers().iterator();
    L4:
        if (r0.hasNext() == false) goto L18;
        CoroutineExceptionHandler handler = r0.next();
        handler.handleException(context, exception);     // Catch: Throwable -> L8 ExceptionSuccessfullyProcessed -> L10
    L8:
        t = move-exception;
        CoroutineExceptionHandlerImplKt.propagateExceptionFinalResort(CoroutineExceptionHandlerKt.handlerException(exception, t));
    L11:
        return;
    L18:
        ExceptionsKt.addSuppressed(exception, new DiagnosticCoroutineContextException(context));     // Catch: Throwable -> L15
    L16:
        CoroutineExceptionHandlerImplKt.propagateExceptionFinalResort(exception);
    }
}
