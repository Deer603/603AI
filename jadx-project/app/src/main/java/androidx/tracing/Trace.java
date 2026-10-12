package androidx.tracing;

import android.os.Build;
import android.util.Log;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes4.dex */
public final class Trace {
    static final int MAX_TRACE_LABEL_LENGTH = 127;
    static final String TAG = "Trace";
    private static Method sAsyncTraceBeginMethod;
    private static Method sAsyncTraceEndMethod;
    private static boolean sHasAppTracingEnabled;
    private static Method sIsTagEnabledMethod;
    private static Method sTraceCounterMethod;
    private static long sTraceTagApp;

    public static boolean isEnabled() {
        if (Build.VERSION.SDK_INT < 29) goto L7;
        return TraceApi29Impl.isEnabled();
    L7:
        return isEnabledFallback();
    }

    public static void forceEnableAppTracing() {
        if (Build.VERSION.SDK_INT >= 31) goto L13;
    L8:
        exception = move-exception;
        handleException("setAppTracingAllowed", exception);
        return;
    L5:
        if (sHasAppTracingEnabled == true) goto L15;
        sHasAppTracingEnabled = true;     // Catch: Exception -> L8
        Method setAppTracingAllowed = android.os.Trace.class.getMethod("setAppTracingAllowed", new Class[]{Boolean.TYPE});     // Catch: Exception -> L8
        setAppTracingAllowed.invoke(null, new Object[]{true});     // Catch: Exception -> L8
        return;
    L15:
        return;
    }

    public static void beginSection(String label) {
        TraceApi18Impl.beginSection(truncatedTraceSectionLabel(label));
    }

    public static void endSection() {
        TraceApi18Impl.endSection();
    }

    public static void beginAsyncSection(String methodName, int cookie) {
        if (Build.VERSION.SDK_INT < 29) goto L5;
        TraceApi29Impl.beginAsyncSection(truncatedTraceSectionLabel(methodName), cookie);
        return;
    L5:
        beginAsyncSectionFallback(truncatedTraceSectionLabel(methodName), cookie);
    }

    public static void endAsyncSection(String methodName, int cookie) {
        if (Build.VERSION.SDK_INT < 29) goto L5;
        TraceApi29Impl.endAsyncSection(truncatedTraceSectionLabel(methodName), cookie);
        return;
    L5:
        endAsyncSectionFallback(truncatedTraceSectionLabel(methodName), cookie);
    }

    public static void setCounter(String counterName, int counterValue) {
        if (Build.VERSION.SDK_INT < 29) goto L5;
        TraceApi29Impl.setCounter(truncatedTraceSectionLabel(counterName), counterValue);
        return;
    L5:
        setCounterFallback(truncatedTraceSectionLabel(counterName), counterValue);
    }

    private static boolean isEnabledFallback() {
    L8:
        exception = move-exception;
        handleException("isTagEnabled", exception);
        return false;
    L4:
        if (sIsTagEnabledMethod != null) goto L6;
        Field traceTagAppField = android.os.Trace.class.getField("TRACE_TAG_APP");     // Catch: Exception -> L8
        sTraceTagApp = traceTagAppField.getLong(null);     // Catch: Exception -> L8
        sIsTagEnabledMethod = android.os.Trace.class.getMethod("isTagEnabled", new Class[]{Long.TYPE});     // Catch: Exception -> L8
    L6:
        return ((Boolean) sIsTagEnabledMethod.invoke(null, new Object[]{Long.valueOf(sTraceTagApp)})).booleanValue();
    }

    private static void beginAsyncSectionFallback(String methodName, int cookie) {
    L8:
        exception = move-exception;
        handleException("asyncTraceBegin", exception);
        return;
    L4:
        if (sAsyncTraceBeginMethod != null) goto L6;
        sAsyncTraceBeginMethod = android.os.Trace.class.getMethod("asyncTraceBegin", new Class[]{Long.TYPE, String.class, Integer.TYPE});     // Catch: Exception -> L8
    L6:
        sAsyncTraceBeginMethod.invoke(null, new Object[]{Long.valueOf(sTraceTagApp), methodName, Integer.valueOf(cookie)});     // Catch: Exception -> L8
    }

    private static void endAsyncSectionFallback(String methodName, int cookie) {
    L8:
        exception = move-exception;
        handleException("asyncTraceEnd", exception);
        return;
    L4:
        if (sAsyncTraceEndMethod != null) goto L6;
        sAsyncTraceEndMethod = android.os.Trace.class.getMethod("asyncTraceEnd", new Class[]{Long.TYPE, String.class, Integer.TYPE});     // Catch: Exception -> L8
    L6:
        sAsyncTraceEndMethod.invoke(null, new Object[]{Long.valueOf(sTraceTagApp), methodName, Integer.valueOf(cookie)});     // Catch: Exception -> L8
    }

    private static void setCounterFallback(String counterName, int counterValue) {
    L8:
        exception = move-exception;
        handleException("traceCounter", exception);
        return;
    L4:
        if (sTraceCounterMethod != null) goto L6;
        sTraceCounterMethod = android.os.Trace.class.getMethod("traceCounter", new Class[]{Long.TYPE, String.class, Integer.TYPE});     // Catch: Exception -> L8
    L6:
        sTraceCounterMethod.invoke(null, new Object[]{Long.valueOf(sTraceTagApp), counterName, Integer.valueOf(counterValue)});     // Catch: Exception -> L8
    }

    private static void handleException(String methodName, Exception exception) {
        if ((exception instanceof InvocationTargetException) == false) goto L10;
        Throwable cause = exception.getCause();
        if ((cause instanceof RuntimeException) == false) goto L9;
        throw ((RuntimeException) cause);
    L9:
        throw new RuntimeException(cause);
    L10:
        Log.v(TAG, "Unable to call " + methodName + " via reflection", exception);
    }

    private static String truncatedTraceSectionLabel(String labelName) {
        if (labelName.length() > 127) goto L6;
        return labelName;
    L6:
        return labelName.substring(0, 127);
    }

    private Trace() {
    }
}
