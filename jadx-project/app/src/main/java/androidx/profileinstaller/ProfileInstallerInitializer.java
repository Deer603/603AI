package androidx.profileinstaller;

import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;
import androidx.startup.Initializer;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes4.dex */
public class ProfileInstallerInitializer implements Initializer<Result> {
    private static final int DELAY_MS = 5000;

    private static class Handler28Impl {
        private Handler28Impl() {
        }

        public static Handler createAsync(Looper looper) {
            return Handler.createAsync(looper);
        }
    }

    public static class Result {
        public Result() {
        }
    }

    public ProfileInstallerInitializer() {
    }

    @Override // androidx.startup.Initializer
    public /* bridge */ /* synthetic */ Result create(Context r1) {
        return create(r1);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.startup.Initializer
    public Result create(Context context) {
        final Context appContext = context.getApplicationContext();
        Choreographer.getInstance().postFrameCallback(new ProfileInstallerInitializer$$ExternalSyntheticLambda0(this, appContext));
        return new Result();
    }

    /* JADX INFO: renamed from: lambda$create$0$androidx-profileinstaller-ProfileInstallerInitializer, reason: not valid java name */
    /* synthetic */ void m7267x451635a(Context appContext, long frameTimeNanos) {
        installAfterDelay(appContext);
    }

    void installAfterDelay(final Context appContext) {
        if (Build.VERSION.SDK_INT < 28) goto L5;
        Handler handler = Handler28Impl.createAsync(Looper.getMainLooper());
    L6:
        Random random = new Random();
        int extra = random.nextInt(Math.max(1000, 1));
        handler.postDelayed(new ProfileInstallerInitializer$$ExternalSyntheticLambda1(appContext), extra + DELAY_MS);
        return;
    L5:
        handler = new Handler(Looper.getMainLooper());
        goto L6
    }

    static /* synthetic */ void lambda$installAfterDelay$1(Context appContext) {
        writeInBackground(appContext);
    }

    @Override // androidx.startup.Initializer
    public List<Class<? extends Initializer<?>>> dependencies() {
        return Collections.emptyList();
    }

    private static void writeInBackground(final Context context) {
        Executor executor = new ThreadPoolExecutor(0, 1, 0, TimeUnit.MILLISECONDS, new LinkedBlockingQueue());
        executor.execute(new ProfileInstallerInitializer$$ExternalSyntheticLambda2(context));
    }

    static /* synthetic */ void lambda$writeInBackground$2(Context context) {
        ProfileInstaller.writeProfile(context);
    }
}
