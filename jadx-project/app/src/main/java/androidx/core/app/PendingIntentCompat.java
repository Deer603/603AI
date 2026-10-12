package androidx.core.app;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import java.io.Closeable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.concurrent.CountDownLatch;

/* JADX INFO: loaded from: classes4.dex */
public final class PendingIntentCompat {

    private static class Api23Impl {
        private Api23Impl() {
        }

        public static void send(PendingIntent pendingIntent, Context context, int code, Intent intent, PendingIntent.OnFinished onFinished, Handler handler, String requiredPermission, Bundle options) throws PendingIntent.CanceledException {
            pendingIntent.send(context, code, intent, onFinished, handler, requiredPermission, options);
        }
    }

    private static class Api26Impl {
        private Api26Impl() {
        }

        public static PendingIntent getForegroundService(Context context, int requestCode, Intent intent, int flags) {
            return PendingIntent.getForegroundService(context, requestCode, intent, flags);
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface Flags {
    }

    private static class GatedCallback implements Closeable {
        private PendingIntent.OnFinished mCallback;
        private final CountDownLatch mComplete;
        private boolean mSuccess;

        /* JADX INFO: renamed from: $r8$lambda$-_JLK_p2qvpYOAwGjpaXu2HJ864, reason: not valid java name */
        public static /* synthetic */ void m7233$r8$lambda$_JLK_p2qvpYOAwGjpaXu2HJ864(GatedCallback r0, PendingIntent r1, Intent r2, int r3, String r4, Bundle r5) {
            r0.onSendFinished(r1, r2, r3, r4, r5);
        }

        GatedCallback(PendingIntent.OnFinished callback) {
            this.mComplete = new CountDownLatch(1);
            this.mCallback = callback;
            this.mSuccess = false;
        }

        public PendingIntent.OnFinished getCallback() {
            if (this.mCallback != null) goto L7;
            return null;
        L7:
            return new PendingIntentCompat$GatedCallback$$ExternalSyntheticLambda0(this);
        }

        public void complete() {
            this.mSuccess = true;
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (this.mSuccess == true) goto L5;
            this.mCallback = null;
        L5:
            this.mComplete.countDown();
        }

        private void onSendFinished(PendingIntent pendingIntent, Intent intent, int resultCode, String resultData, Bundle resultExtras) {
            boolean interrupted = false;
        L18:
            this.mComplete.await();     // Catch: Throwable -> L11 InterruptedException -> L16
            goto L17
        L4:
            if (interrupted == false) goto L7;
            Thread.currentThread().interrupt();
        L7:
            if (this.mCallback == null) goto L10;
            this.mCallback.onSendFinished(pendingIntent, intent, resultCode, resultData, resultExtras);
            this.mCallback = null;
            return;
        L10:
            return;
        L11:
            th = move-exception;
            if (interrupted == false) goto L22;
            Thread.currentThread().interrupt();
            throw th;
        L22:
            throw th;
        L17:
            interrupted = true;
            pendingIntent = pendingIntent;
            intent = intent;
            resultCode = resultCode;
            resultData = resultData;
            resultExtras = resultExtras;
            goto L18
        }
    }

    public static PendingIntent getActivities(Context context, int requestCode, Intent[] intents, int flags, Bundle options, boolean isMutable) {
        return PendingIntent.getActivities(context, requestCode, intents, addMutabilityFlags(isMutable, flags), options);
    }

    public static PendingIntent getActivities(Context context, int requestCode, Intent[] intents, int flags, boolean isMutable) {
        return PendingIntent.getActivities(context, requestCode, intents, addMutabilityFlags(isMutable, flags));
    }

    public static PendingIntent getActivity(Context context, int requestCode, Intent intent, int flags, boolean isMutable) {
        return PendingIntent.getActivity(context, requestCode, intent, addMutabilityFlags(isMutable, flags));
    }

    public static PendingIntent getActivity(Context context, int requestCode, Intent intent, int flags, Bundle options, boolean isMutable) {
        return PendingIntent.getActivity(context, requestCode, intent, addMutabilityFlags(isMutable, flags), options);
    }

    public static PendingIntent getBroadcast(Context context, int requestCode, Intent intent, int flags, boolean isMutable) {
        return PendingIntent.getBroadcast(context, requestCode, intent, addMutabilityFlags(isMutable, flags));
    }

    public static PendingIntent getForegroundService(Context context, int requestCode, Intent intent, int flags, boolean isMutable) {
        return Api26Impl.getForegroundService(context, requestCode, intent, addMutabilityFlags(isMutable, flags));
    }

    public static PendingIntent getService(Context context, int requestCode, Intent intent, int flags, boolean isMutable) {
        return PendingIntent.getService(context, requestCode, intent, addMutabilityFlags(isMutable, flags));
    }

    public static void send(PendingIntent pendingIntent, int code, PendingIntent.OnFinished onFinished, Handler handler) throws PendingIntent.CanceledException {
        GatedCallback gatedCallback = new GatedCallback(onFinished);
        pendingIntent.send(code, gatedCallback.getCallback(), handler);     // Catch: Throwable -> L6
        gatedCallback.complete();     // Catch: Throwable -> L6
        gatedCallback.close();
        return;
    L6:
        th = move-exception;
        gatedCallback.close();     // Catch: Throwable -> L9
    L11:
        throw th;
    L9:
        th = move-exception;
        th.addSuppressed(th);
        goto L11
    }

    public static void send(PendingIntent pendingIntent, Context context, int code, Intent intent, PendingIntent.OnFinished onFinished, Handler handler) throws PendingIntent.CanceledException {
        send(pendingIntent, context, code, intent, onFinished, handler, null, null);
    }

    public static void send(PendingIntent pendingIntent, Context context, int code, Intent intent, PendingIntent.OnFinished onFinished, Handler handler, String requiredPermissions, Bundle options) throws PendingIntent.CanceledException {
        GatedCallback gatedCallback = new GatedCallback(onFinished);
        Api23Impl.send(pendingIntent, context, code, intent, onFinished, handler, requiredPermissions, options);     // Catch: Throwable -> L6
        gatedCallback.complete();     // Catch: Throwable -> L6
        gatedCallback.close();
        return;
    L6:
        th = move-exception;
        gatedCallback.close();     // Catch: Throwable -> L10
        throw th;
    L10:
        th = move-exception;
        th.addSuppressed(th);
        throw th;
    }

    static int addMutabilityFlags(boolean isMutable, int flags) {
        if (isMutable == false) goto L7;
        if (Build.VERSION.SDK_INT >= 31) goto L9;
        return flags;
    L9:
        return flags | 33554432;
    L7:
        return flags | AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
    }

    private PendingIntentCompat() {
    }
}
