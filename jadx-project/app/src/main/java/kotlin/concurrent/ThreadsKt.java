package kotlin.concurrent;

import androidx.autofill.HintConstants;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Thread.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aJ\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\t\u001a\u00020\n2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f\u001a3\u0010\u000e\u001a\u0002H\u000f\"\b\b\u0000\u0010\u000f*\u00020\u0010*\b\u0012\u0004\u0012\u0002H\u000f0\u00112\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u0002H\u000f0\fH\u0087\bø\u0001\u0000¢\u0006\u0002\u0010\u0013\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0014"}, d2 = {"thread", "Ljava/lang/Thread;", "start", "", "isDaemon", "contextClassLoader", "Ljava/lang/ClassLoader;", HintConstants.AUTOFILL_HINT_NAME, "", "priority", "", "block", "Lkotlin/Function0;", "", "getOrSet", "T", "", "Ljava/lang/ThreadLocal;", "default", "(Ljava/lang/ThreadLocal;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "kotlin-stdlib"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class ThreadsKt {
    public static /* synthetic */ Thread thread$default(boolean r1, boolean r2, ClassLoader r3, String r4, int r5, Function0 r6, int r7, Object r8) {
        if ((r7 & 1) == 0) goto L6;
        r1 = true;
    L6:
        if ((r7 & 2) == 0) goto L9;
        r2 = false;
    L9:
        if ((r7 & 4) == 0) goto L12;
        r3 = null;
    L12:
        if ((r7 & 8) == 0) goto L15;
        r4 = null;
    L15:
        if ((r7 & 16) == 0) goto L17;
        r5 = -1;
    L17:
        int r9 = r5;
        String r10 = r4;
        ClassLoader r11 = r3;
        return thread(r1, r2, r11, r10, r9, r6);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [kotlin.concurrent.ThreadsKt$thread$thread$1] */
    public static final Thread thread(boolean start, boolean isDaemon, ClassLoader contextClassLoader, String name, int priority, final Function0<Unit> r7) {
        Intrinsics.checkNotNullParameter(r7, "block");
        ?? r0 = new ThreadsKt$thread$thread$1(r7);
        if (isDaemon == false) goto L5;
        r0.setDaemon(true);
    L5:
        if (priority <= 0) goto L7;
        r0.setPriority(priority);
    L7:
        if (name == null) goto L9;
        r0.setName(name);
    L9:
        if (contextClassLoader == null) goto L11;
        r0.setContextClassLoader(contextClassLoader);
    L11:
        if (start == false) goto L14;
        r0.start();
    L14:
        return (Thread) r0;
    }

    private static final <T> T getOrSet(ThreadLocal<T> r3, Function0<? extends T> r4) {
        Intrinsics.checkNotNullParameter(r3, "<this>");
        Intrinsics.checkNotNullParameter(r4, "default");
        T r0 = r3.get();
        if (r0 != null) goto L6;
        T r1 = r4.invoke();
        r3.set(r1);
        return r1;
    L6:
        return r0;
    }
}
