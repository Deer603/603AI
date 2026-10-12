package kotlin.jdk7;

import androidx.lifecycle.viewmodel.internal.ViewModelImpl$$ExternalSyntheticAutoCloseableDispatcher0;
import kotlin.ExceptionsKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: AutoCloseableJVM.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000.\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0000\u001a \u0010\u0000\u001a\u00060\u0001j\u0002`\u00052\u000e\b\u0004\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0087\bø\u0001\u0000\u001aN\u0010\t\u001a\u0002H\n\"\u0010\b\u0000\u0010\u000b*\n\u0018\u00010\u0001j\u0004\u0018\u0001`\u0005\"\u0004\b\u0001\u0010\n*\u0002H\u000b2\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u0002H\u000b\u0012\u0004\u0012\u0002H\n0\rH\u0087\bø\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0001¢\u0006\u0002\u0010\u000e\u001a\u001e\u0010\u000f\u001a\u00020\b*\n\u0018\u00010\u0001j\u0004\u0018\u0001`\u00052\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0001*\u001a\b\u0007\u0010\u0000\"\u00020\u00012\u00020\u0001B\f\b\u0002\u0012\b\b\u0003\u0012\u0004\b\b(\u0004\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0012"}, d2 = {"AutoCloseable", "Ljava/lang/AutoCloseable;", "Lkotlin/SinceKotlin;", "version", "2.0", "Lkotlin/AutoCloseable;", "closeAction", "Lkotlin/Function0;", "", "use", "R", "T", "block", "Lkotlin/Function1;", "(Ljava/lang/AutoCloseable;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "closeFinally", "cause", "", "kotlin-stdlib"}, k = 2, mv = {2, 2, 0}, pn = "kotlin", xi = 48)
public final class AutoCloseableKt {
    public static /* synthetic */ void AutoCloseable$annotations() {
    }

    private static final AutoCloseable AutoCloseable(final Function0<Unit> r1) {
        Intrinsics.checkNotNullParameter(r1, "closeAction");
        return new AnonymousClass1(r1);
    }

    private static final <T extends AutoCloseable, R> R use(T r2, Function1<? super T, ? extends R> r3) {
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

    public static final void closeFinally(AutoCloseable $this$closeFinally, Throwable cause) {
        if ($this$closeFinally == null) goto L13;
        if (cause != null) goto L11;
        ViewModelImpl$$ExternalSyntheticAutoCloseableDispatcher0.m($this$closeFinally);
        return;
    L11:
        ViewModelImpl$$ExternalSyntheticAutoCloseableDispatcher0.m($this$closeFinally);     // Catch: Throwable -> L8
        return;
    L8:
        closeException = move-exception;
        ExceptionsKt.addSuppressed(cause, closeException);
        return;
    }
}
