package androidx.compose.runtime.internal;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: Trace.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a*\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u00012\u0006\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u0002H\u00010\u0005H\u0080\b¢\u0006\u0002\u0010\u0006¨\u0006\u0007"}, d2 = {"trace", "T", "sectionName", "", "block", "Lkotlin/Function0;", "(Ljava/lang/String;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "runtime_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class TraceKt {
    public static final <T> T trace(String sectionName, Function0<? extends T> r5) {
        Object token = Trace.INSTANCE.beginSection(sectionName);
        T r2 = r5.invoke();     // Catch: Throwable -> L6
        Trace.INSTANCE.endSection(token);
        return r2;
    L6:
        th = move-exception;
        Trace.INSTANCE.endSection(token);
        throw th;
    }
}
