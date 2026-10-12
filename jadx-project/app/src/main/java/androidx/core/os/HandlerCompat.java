package androidx.core.os;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes4.dex */
public final class HandlerCompat {
    private static final String TAG = "HandlerCompat";

    private static class Api28Impl {
        private Api28Impl() {
        }

        public static Handler createAsync(Looper looper) {
            return Handler.createAsync(looper);
        }

        public static Handler createAsync(Looper looper, Handler.Callback callback) {
            return Handler.createAsync(looper, callback);
        }

        public static boolean postDelayed(Handler handler, Runnable r, Object token, long delayMillis) {
            return handler.postDelayed(r, token, delayMillis);
        }
    }

    private static class Api29Impl {
        private Api29Impl() {
        }

        public static boolean hasCallbacks(Handler handler, Runnable r) {
            return handler.hasCallbacks(r);
        }
    }

    public static Handler createAsync(Looper looper) {
        if (Build.VERSION.SDK_INT >= 28) goto L5;
        return (Handler) Handler.class.getDeclaredConstructor(new Class[]{Looper.class, Handler.Callback.class, Boolean.TYPE}).newInstance(new Object[]{looper, null, true});
    L23:
        wrappedException = e;
    L24:
        Log.w(TAG, "Unable to invoke Handler(Looper, Callback, boolean) constructor", wrappedException);
        return new Handler(looper);
    L21:
        wrappedException = e;
    L19:
        wrappedException = e;
    L8:
        e = move-exception;
        Throwable cause = e.getCause();
        if ((cause instanceof RuntimeException) == true) goto L18;
        if ((cause instanceof Error) == false) goto L16;
        throw ((Error) cause);
    L16:
        throw new RuntimeException(cause);
    L18:
        throw ((RuntimeException) cause);
    L5:
        return Api28Impl.createAsync(looper);
    }

    public static Handler createAsync(Looper looper, Handler.Callback callback) {
        if (Build.VERSION.SDK_INT >= 28) goto L5;
        return (Handler) Handler.class.getDeclaredConstructor(new Class[]{Looper.class, Handler.Callback.class, Boolean.TYPE}).newInstance(new Object[]{looper, callback, true});
    L23:
        wrappedException = e;
    L24:
        Log.w(TAG, "Unable to invoke Handler(Looper, Callback, boolean) constructor", wrappedException);
        return new Handler(looper, callback);
    L21:
        wrappedException = e;
    L19:
        wrappedException = e;
    L8:
        e = move-exception;
        Throwable cause = e.getCause();
        if ((cause instanceof RuntimeException) == true) goto L18;
        if ((cause instanceof Error) == false) goto L16;
        throw ((Error) cause);
    L16:
        throw new RuntimeException(cause);
    L18:
        throw ((RuntimeException) cause);
    L5:
        return Api28Impl.createAsync(looper, callback);
    }

    public static boolean postDelayed(Handler handler, Runnable r, Object token, long delayMillis) {
        if (Build.VERSION.SDK_INT >= 28) goto L5;
        Message message = Message.obtain(handler, r);
        message.obj = token;
        return handler.sendMessageDelayed(message, delayMillis);
    L5:
        return Api28Impl.postDelayed(handler, r, token, delayMillis);
    }

    public static boolean hasCallbacks(Handler handler, Runnable r) {
        if (Build.VERSION.SDK_INT >= 29) goto L5;
        Method hasCallbacksMethod = Handler.class.getMethod("hasCallbacks", new Class[]{Runnable.class});     // Catch: NullPointerException -> L8 NoSuchMethodException -> L10 IllegalAccessException -> L12 InvocationTargetException -> L17
        return ((Boolean) hasCallbacksMethod.invoke(handler, new Object[]{r})).booleanValue();
    L12:
        e = move-exception;
        Exception wrappedException = e;
    L16:
        throw new UnsupportedOperationException("Failed to call Handler.hasCallbacks(), but there is no safe failure mode for this method. Raising exception.", wrappedException);
    L10:
        e = move-exception;
        wrappedException = e;
    L8:
        e = move-exception;
        wrappedException = e;
    L17:
        e = move-exception;
        Throwable cause = e.getCause();
        if ((cause instanceof RuntimeException) == true) goto L27;
        if ((cause instanceof Error) == false) goto L25;
        throw ((Error) cause);
    L25:
        throw new RuntimeException(cause);
    L27:
        throw ((RuntimeException) cause);
    L5:
        return Api29Impl.hasCallbacks(handler, r);
    }

    private HandlerCompat() {
    }
}
