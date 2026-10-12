package kotlin.io;

import java.io.Closeable;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Closeable.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\u001aH\u0010\u0000\u001a\u0002H\u0001\"\n\b\u0000\u0010\u0002*\u0004\u0018\u00010\u0003\"\u0004\b\u0001\u0010\u0001*\u0002H\u00022\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00010\u0005H\u0087\bø\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0001¢\u0006\u0002\u0010\u0006\u001a\u0018\u0010\u0007\u001a\u00020\b*\u0004\u0018\u00010\u00032\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0001\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u000b"}, d2 = {"use", "R", "T", "Ljava/io/Closeable;", "block", "Lkotlin/Function1;", "(Ljava/io/Closeable;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "closeFinally", "", "cause", "", "kotlin-stdlib"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class CloseableKt {
    private static final <T extends Closeable, R> R use(T r2, Function1<? super T, ? extends R> r3) {
        Intrinsics.checkNotNullParameter(r3, "block");
        R r1 = r3.invoke(r2);     // Catch: Throwable -> L6
        closeFinally(r2, null);
        return r1;
    L6:
        e = move-exception;
        throw e;     // Catch: Throwable -> L9
    L9:
        e = move-exception;
        closeFinally(r2, e);
        throw e;
    }

    public static final void closeFinally(Closeable $this$closeFinally, Throwable cause) {
        if ($this$closeFinally == null) goto L13;
        if (cause != null) goto L11;
        $this$closeFinally.close();
        return;
    L11:
        $this$closeFinally.close();     // Catch: Throwable -> L8
        return;
    L8:
        closeException = move-exception;
        kotlin.ExceptionsKt.addSuppressed(cause, closeException);
        return;
    }
}
