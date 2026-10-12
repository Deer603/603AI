package androidx.emoji2.text;

import android.content.Context;
import android.os.Handler;
import androidx.core.os.TraceCompat;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ProcessLifecycleInitializer;
import androidx.startup.AppInitializer;
import androidx.startup.Initializer;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ThreadPoolExecutor;

/* JADX INFO: loaded from: classes4.dex */
public class EmojiCompatInitializer implements Initializer<Boolean> {
    private static final long STARTUP_THREAD_CREATION_DELAY_MS = 500;
    private static final String S_INITIALIZER_THREAD_NAME = "EmojiCompatInitializer";

    static class BackgroundDefaultConfig extends EmojiCompat.Config {
        protected BackgroundDefaultConfig(Context context) {
            super(new BackgroundDefaultLoader(context));
            setMetadataLoadStrategy(1);
        }
    }

    static class BackgroundDefaultLoader implements EmojiCompat.MetadataRepoLoader {
        private final Context mContext;

        BackgroundDefaultLoader(Context context) {
            this.mContext = context.getApplicationContext();
        }

        @Override // androidx.emoji2.text.EmojiCompat.MetadataRepoLoader
        public void load(final EmojiCompat.MetadataRepoLoaderCallback loaderCallback) {
            final ThreadPoolExecutor executor = ConcurrencyHelpers.createBackgroundPriorityExecutor(EmojiCompatInitializer.S_INITIALIZER_THREAD_NAME);
            executor.execute(new EmojiCompatInitializer$BackgroundDefaultLoader$$ExternalSyntheticLambda0(this, loaderCallback, executor));
        }

        /* JADX INFO: renamed from: lambda$load$0$androidx-emoji2-text-EmojiCompatInitializer$BackgroundDefaultLoader, reason: not valid java name */
        /* synthetic */ void m7264x5cc8028a(EmojiCompat.MetadataRepoLoaderCallback loaderCallback, ThreadPoolExecutor executor) {
            doLoad(loaderCallback, executor);
        }

        void doLoad(final EmojiCompat.MetadataRepoLoaderCallback loaderCallback, final ThreadPoolExecutor executor) {
            FontRequestEmojiCompatConfig config = DefaultEmojiCompatConfig.create(this.mContext);     // Catch: Throwable -> L7
            if (config == null) goto L6;
            config.setLoadingExecutor(executor);     // Catch: Throwable -> L7
            config.getMetadataRepoLoader().load(new AnonymousClass1(this, loaderCallback, executor));     // Catch: Throwable -> L7
            return;
        L6:
            throw new RuntimeException("EmojiCompat font provider not available on this device.");     // Catch: Throwable -> L7
        L7:
            t = move-exception;
            loaderCallback.onFailed(t);
            executor.shutdown();
        }
    }

    static class LoadEmojiCompatRunnable implements Runnable {
        LoadEmojiCompatRunnable() {
        }

        @Override // java.lang.Runnable
        public void run() {
            TraceCompat.beginSection("EmojiCompat.EmojiCompatInitializer.run");     // Catch: Throwable -> L7
            if (EmojiCompat.isConfigured() == false) goto L5;
            EmojiCompat.get().load();     // Catch: Throwable -> L7
        L5:
            TraceCompat.endSection();
            return;
        L7:
            th = move-exception;
            TraceCompat.endSection();
            throw th;
        }
    }

    public EmojiCompatInitializer() {
    }

    @Override // androidx.startup.Initializer
    public /* bridge */ /* synthetic */ Boolean create(Context r1) {
        return create(r1);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.startup.Initializer
    public Boolean create(Context context) {
        EmojiCompat.init(new BackgroundDefaultConfig(context));
        delayUntilFirstResume(context);
        return true;
    }

    void delayUntilFirstResume(Context context) {
        AppInitializer appInitializer = AppInitializer.getInstance(context);
        LifecycleOwner lifecycleOwner = (LifecycleOwner) appInitializer.initializeComponent(ProcessLifecycleInitializer.class);
        final Lifecycle lifecycle = lifecycleOwner.getLifecycle();
        lifecycle.addObserver(new AnonymousClass1(this, lifecycle));
    }

    void loadEmojiCompatAfterDelay() {
        Handler mainHandler = ConcurrencyHelpers.mainHandlerAsync();
        mainHandler.postDelayed(new LoadEmojiCompatRunnable(), STARTUP_THREAD_CREATION_DELAY_MS);
    }

    @Override // androidx.startup.Initializer
    public List<Class<? extends Initializer<?>>> dependencies() {
        return Collections.singletonList(ProcessLifecycleInitializer.class);
    }
}
