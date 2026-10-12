package androidx.core.os;

import android.os.Build;
import android.os.Trace;
import android.util.Log;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class TraceCompat {
    private static final String TAG = "TraceCompat";
    private static Method sAsyncTraceBeginMethod;
    private static Method sAsyncTraceEndMethod;
    private static Method sIsTagEnabledMethod;
    private static Method sTraceCounterMethod;
    private static long sTraceTagApp;

    static class Api29Impl {
        private Api29Impl() {
        }

        static boolean isEnabled() {
            return Trace.isEnabled();
        }

        static void endAsyncSection(String methodName, int cookie) {
            Trace.endAsyncSection(methodName, cookie);
        }

        static void beginAsyncSection(String methodName, int cookie) {
            Trace.beginAsyncSection(methodName, cookie);
        }

        static void setCounter(String counterName, long counterValue) {
            Trace.setCounter(counterName, counterValue);
        }
    }

    static {
        if (Build.VERSION.SDK_INT >= 29) goto L11;
        Field traceTagAppField = Trace.class.getField("TRACE_TAG_APP");     // Catch: Exception -> L6
        sTraceTagApp = traceTagAppField.getLong(null);     // Catch: Exception -> L6
        sIsTagEnabledMethod = Trace.class.getMethod("isTagEnabled", new Class[]{Long.TYPE});     // Catch: Exception -> L6
        sAsyncTraceBeginMethod = Trace.class.getMethod("asyncTraceBegin", new Class[]{Long.TYPE, String.class, Integer.TYPE});     // Catch: Exception -> L6
        sAsyncTraceEndMethod = Trace.class.getMethod("asyncTraceEnd", new Class[]{Long.TYPE, String.class, Integer.TYPE});     // Catch: Exception -> L6
        sTraceCounterMethod = Trace.class.getMethod("traceCounter", new Class[]{Long.TYPE, String.class, Integer.TYPE});     // Catch: Exception -> L6
        return;
    L6:
        e = move-exception;
        Log.i(TAG, "Unable to initialize via reflection.", e);
        return;
    }

    public static boolean isEnabled() {
        if (Build.VERSION.SDK_INT >= 29) goto L5;
        return ((Boolean) sIsTagEnabledMethod.invoke(null, new Object[]{Long.valueOf(sTraceTagApp)})).booleanValue();
    L9:
        Log.v(TAG, "Unable to invoke isTagEnabled() via reflection.");
        return false;
    L5:
        return Api29Impl.isEnabled();
    }

    public static void beginSection(String sectionName) {
        Trace.beginSection(sectionName);
    }

    public static void endSection() {
        Trace.endSection();
    }

    public static void beginAsyncSection(String methodName, int cookie) {
        if (Build.VERSION.SDK_INT < 29) goto L10;
        Api29Impl.beginAsyncSection(methodName, cookie);
        return;
    L10:
        sAsyncTraceBeginMethod.invoke(null, new Object[]{Long.valueOf(sTraceTagApp), methodName, Integer.valueOf(cookie)});     // Catch: Exception -> L7
        return;
    L8:
        Log.v(TAG, "Unable to invoke asyncTraceBegin() via reflection.");
    }

    public static void endAsyncSection(String methodName, int cookie) {
        if (Build.VERSION.SDK_INT < 29) goto L10;
        Api29Impl.endAsyncSection(methodName, cookie);
        return;
    L10:
        sAsyncTraceEndMethod.invoke(null, new Object[]{Long.valueOf(sTraceTagApp), methodName, Integer.valueOf(cookie)});     // Catch: Exception -> L7
        return;
    L8:
        Log.v(TAG, "Unable to invoke endAsyncSection() via reflection.");
    }

    public static void setCounter(String counterName, int counterValue) {
        if (Build.VERSION.SDK_INT < 29) goto L10;
        Api29Impl.setCounter(counterName, counterValue);
        return;
    L10:
        sTraceCounterMethod.invoke(null, new Object[]{Long.valueOf(sTraceTagApp), counterName, Integer.valueOf(counterValue)});     // Catch: Exception -> L7
        return;
    L8:
        Log.v(TAG, "Unable to invoke traceCounter() via reflection.");
    }

    private TraceCompat() {
    }
}
