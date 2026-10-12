package androidx.emoji2.text;

import android.content.Context;
import android.content.pm.PackageManager;
import android.database.ContentObserver;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.Handler;
import android.os.SystemClock;
import androidx.core.graphics.TypefaceCompatUtil;
import androidx.core.os.TraceCompat;
import androidx.core.provider.FontRequest;
import androidx.core.provider.FontsContractCompat;
import androidx.core.util.Preconditions;
import java.nio.ByteBuffer;
import java.util.concurrent.Executor;
import java.util.concurrent.ThreadPoolExecutor;

/* JADX INFO: loaded from: classes4.dex */
public class FontRequestEmojiCompatConfig extends EmojiCompat.Config {
    private static final FontProviderHelper DEFAULT_FONTS_CONTRACT = null;

    public static class ExponentialBackoffRetryPolicy extends RetryPolicy {
        private long mRetryOrigin;
        private final long mTotalMs;

        public ExponentialBackoffRetryPolicy(long totalMs) {
            this.mTotalMs = totalMs;
        }

        @Override // androidx.emoji2.text.FontRequestEmojiCompatConfig.RetryPolicy
        public long getRetryDelay() {
            if (this.mRetryOrigin != 0) goto L6;
            this.mRetryOrigin = SystemClock.uptimeMillis();
            return 0;
        L6:
            long elapsedMillis = SystemClock.uptimeMillis() - this.mRetryOrigin;
            if (elapsedMillis <= this.mTotalMs) goto L11;
            return -1;
        L11:
            return Math.min(Math.max(elapsedMillis, 1000), this.mTotalMs - elapsedMillis);
        }
    }

    public static class FontProviderHelper {
        public FontProviderHelper() {
        }

        public FontsContractCompat.FontFamilyResult fetchFonts(Context context, FontRequest request) throws PackageManager.NameNotFoundException {
            return FontsContractCompat.fetchFonts(context, null, request);
        }

        public Typeface buildTypeface(Context context, FontsContractCompat.FontInfo font) throws PackageManager.NameNotFoundException {
            return FontsContractCompat.buildTypeface(context, null, new FontsContractCompat.FontInfo[]{font});
        }

        public void registerObserver(Context context, Uri uri, ContentObserver observer) {
            context.getContentResolver().registerContentObserver(uri, false, observer);
        }

        public void unregisterObserver(Context context, ContentObserver observer) {
            context.getContentResolver().unregisterContentObserver(observer);
        }
    }

    private static class FontRequestMetadataLoader implements EmojiCompat.MetadataRepoLoader {
        private static final String S_TRACE_BUILD_TYPEFACE = "EmojiCompat.FontRequestEmojiCompatConfig.buildTypeface";
        EmojiCompat.MetadataRepoLoaderCallback mCallback;
        private final Context mContext;
        private Executor mExecutor;
        private final FontProviderHelper mFontProviderHelper;
        private final Object mLock;
        private Handler mMainHandler;
        private Runnable mMainHandlerLoadCallback;
        private ThreadPoolExecutor mMyThreadPoolExecutor;
        private ContentObserver mObserver;
        private final FontRequest mRequest;
        private RetryPolicy mRetryPolicy;

        FontRequestMetadataLoader(Context context, FontRequest request, FontProviderHelper fontProviderHelper) {
            this.mLock = new Object();
            Preconditions.checkNotNull(context, "Context cannot be null");
            Preconditions.checkNotNull(request, "FontRequest cannot be null");
            this.mContext = context.getApplicationContext();
            this.mRequest = request;
            this.mFontProviderHelper = fontProviderHelper;
        }

        public void setExecutor(Executor executor) {
            Object r0 = this.mLock;
            monitor-enter(r0);
            this.mExecutor = executor;     // Catch: Throwable -> L7
            monitor-exit(r0);     // Catch: Throwable -> L7
            return;
        L7:
            th = move-exception;
            throw th;
        }

        public void setRetryPolicy(RetryPolicy policy) {
            Object r0 = this.mLock;
            monitor-enter(r0);
            this.mRetryPolicy = policy;     // Catch: Throwable -> L7
            monitor-exit(r0);     // Catch: Throwable -> L7
            return;
        L7:
            th = move-exception;
            throw th;
        }

        @Override // androidx.emoji2.text.EmojiCompat.MetadataRepoLoader
        public void load(EmojiCompat.MetadataRepoLoaderCallback loaderCallback) {
            Preconditions.checkNotNull(loaderCallback, "LoaderCallback cannot be null");
            Object r0 = this.mLock;
            monitor-enter(r0);
            this.mCallback = loaderCallback;     // Catch: Throwable -> L8
            monitor-exit(r0);     // Catch: Throwable -> L8
            loadInternal();
            return;
        L8:
            th = move-exception;
            throw th;
        }

        void loadInternal() {
            Object r0 = this.mLock;
            monitor-enter(r0);
        L14:
            th = move-exception;
            throw th;
        L5:
            if (this.mCallback != null) goto L9;
            monitor-exit(r0);     // Catch: Throwable -> L14
            return;
        L9:
            if (this.mExecutor != null) goto L11;
            this.mMyThreadPoolExecutor = ConcurrencyHelpers.createBackgroundPriorityExecutor("emojiCompat");     // Catch: Throwable -> L14
            this.mExecutor = this.mMyThreadPoolExecutor;     // Catch: Throwable -> L14
        L11:
            this.mExecutor.execute(new FontRequestEmojiCompatConfig$FontRequestMetadataLoader$$ExternalSyntheticLambda0(this));     // Catch: Throwable -> L14
            monitor-exit(r0);     // Catch: Throwable -> L14
        }

        private FontsContractCompat.FontInfo retrieveFontInfo() {
            FontsContractCompat.FontFamilyResult result = this.mFontProviderHelper.fetchFonts(this.mContext, this.mRequest);     // Catch: PackageManager.NameNotFoundException -> L15
            if (result.getStatusCode() != 0) goto L14;
            FontsContractCompat.FontInfo[] fonts = result.getFonts();
            if (fonts == null) goto L12;
            if (fonts.length == 0) goto L12;
            return fonts[0];
        L12:
            throw new RuntimeException("fetchFonts failed (empty result)");
        L14:
            throw new RuntimeException("fetchFonts failed (" + result.getStatusCode() + ")");
        L15:
            e = move-exception;
            throw new RuntimeException("provider not found", e);
        }

        private void scheduleRetry(Uri uri, long waitMs) {
            Object r0 = this.mLock;
            monitor-enter(r0);
            final Handler handler = this.mMainHandler;     // Catch: Throwable -> L16
            if (handler != null) goto L8;
            handler = ConcurrencyHelpers.mainHandlerAsync();     // Catch: Throwable -> L16
            this.mMainHandler = handler;     // Catch: Throwable -> L16
        L8:
            if (this.mObserver != null) goto L11;
            this.mObserver = new AnonymousClass1(this, handler);     // Catch: Throwable -> L16
            this.mFontProviderHelper.registerObserver(this.mContext, uri, this.mObserver);     // Catch: Throwable -> L16
        L11:
            if (this.mMainHandlerLoadCallback != null) goto L13;
            this.mMainHandlerLoadCallback = new FontRequestEmojiCompatConfig$FontRequestMetadataLoader$$ExternalSyntheticLambda1(this);     // Catch: Throwable -> L16
        L13:
            handler.postDelayed(this.mMainHandlerLoadCallback, waitMs);     // Catch: Throwable -> L16
            monitor-exit(r0);     // Catch: Throwable -> L16
            return;
        L16:
            th = move-exception;
            throw th;
        }

        private void cleanUp() {
            Object r0 = this.mLock;
            monitor-enter(r0);
            this.mCallback = null;     // Catch: Throwable -> L17
            if (this.mObserver == null) goto L9;
            this.mFontProviderHelper.unregisterObserver(this.mContext, this.mObserver);     // Catch: Throwable -> L17
            this.mObserver = null;     // Catch: Throwable -> L17
        L9:
            if (this.mMainHandler == null) goto L11;
            this.mMainHandler.removeCallbacks(this.mMainHandlerLoadCallback);     // Catch: Throwable -> L17
        L11:
            this.mMainHandler = null;     // Catch: Throwable -> L17
            if (this.mMyThreadPoolExecutor == null) goto L14;
            this.mMyThreadPoolExecutor.shutdown();     // Catch: Throwable -> L17
        L14:
            this.mExecutor = null;     // Catch: Throwable -> L17
            this.mMyThreadPoolExecutor = null;     // Catch: Throwable -> L17
            monitor-exit(r0);     // Catch: Throwable -> L17
            return;
        L17:
            th = move-exception;
            throw th;
        }

        void createMetadata() {
            Object r0 = this.mLock;
            monitor-enter(r0);
        L60:
            t = move-exception;
            throw t;
        L5:
            if (this.mCallback != null) goto L8;
            monitor-exit(r0);     // Catch: Throwable -> L60
            return;
        L8:
            monitor-exit(r0);     // Catch: Throwable -> L60
            FontsContractCompat.FontInfo font = retrieveFontInfo();     // Catch: Throwable -> L48
            int resultCode = font.getResultCode();     // Catch: Throwable -> L48
            if (resultCode != 2) goto L25;
            Object r2 = this.mLock;     // Catch: Throwable -> L48
            monitor-enter(r2);     // Catch: Throwable -> L48
        L22:
            th = move-exception;
            throw th;     // Catch: Throwable -> L48
        L14:
            if (this.mRetryPolicy == null) goto L20;
            long delayMs = this.mRetryPolicy.getRetryDelay();     // Catch: Throwable -> L22
            if (delayMs < 0) goto L20;
            scheduleRetry(font.getUri(), delayMs);     // Catch: Throwable -> L22
            monitor-exit(r2);     // Catch: Throwable -> L22
            return;
        L20:
            monitor-exit(r2);     // Catch: Throwable -> L22
        L25:
            if (resultCode != 0) goto L47;
            TraceCompat.beginSection(S_TRACE_BUILD_TYPEFACE);     // Catch: Throwable -> L43
            Typeface typeface = this.mFontProviderHelper.buildTypeface(this.mContext, font);     // Catch: Throwable -> L43
            ByteBuffer buffer = TypefaceCompatUtil.mmap(this.mContext, null, font.getUri());     // Catch: Throwable -> L43
            if (buffer == null) goto L42;
            if (typeface == null) goto L42;
            MetadataRepo metadataRepo = MetadataRepo.create(typeface, buffer);     // Catch: Throwable -> L43
            TraceCompat.endSection();     // Catch: Throwable -> L48
            Object r3 = this.mLock;     // Catch: Throwable -> L48
            monitor-enter(r3);     // Catch: Throwable -> L48
        L38:
            th = move-exception;
            throw th;     // Catch: Throwable -> L48
        L33:
            if (this.mCallback == null) goto L35;
            this.mCallback.onLoaded(metadataRepo);     // Catch: Throwable -> L38
        L35:
            monitor-exit(r3);     // Catch: Throwable -> L38
            cleanUp();     // Catch: Throwable -> L48
            return;
        L42:
            throw new RuntimeException("Unable to open file.");     // Catch: Throwable -> L43
        L43:
            th = move-exception;
            TraceCompat.endSection();     // Catch: Throwable -> L48
            throw th;     // Catch: Throwable -> L48
        L47:
            throw new RuntimeException("fetchFonts result is not OK. (" + resultCode + ")");     // Catch: Throwable -> L48
        L48:
            t = move-exception;
            monitor-enter(this.mLock);
        L57:
            th = move-exception;
            throw th;
        L52:
            if (this.mCallback == null) goto L54;
            this.mCallback.onFailed(t);     // Catch: Throwable -> L57
        L54:
            cleanUp();
        }
    }

    public static abstract class RetryPolicy {
        public abstract long getRetryDelay();

        public RetryPolicy() {
        }
    }

    public FontRequestEmojiCompatConfig(Context context, FontRequest request) {
        super(new FontRequestMetadataLoader(context, request, DEFAULT_FONTS_CONTRACT));
    }

    public FontRequestEmojiCompatConfig(Context context, FontRequest request, FontProviderHelper fontProviderHelper) {
        super(new FontRequestMetadataLoader(context, request, fontProviderHelper));
    }

    public FontRequestEmojiCompatConfig setLoadingExecutor(Executor executor) {
        ((FontRequestMetadataLoader) getMetadataRepoLoader()).setExecutor(executor);
        return this;
    }

    @Deprecated
    public FontRequestEmojiCompatConfig setHandler(Handler handler) {
        if (handler != null) goto L4;
        return this;
    L4:
        setLoadingExecutor(ConcurrencyHelpers.convertHandlerToExecutor(handler));
        return this;
    }

    public FontRequestEmojiCompatConfig setRetryPolicy(RetryPolicy policy) {
        ((FontRequestMetadataLoader) getMetadataRepoLoader()).setRetryPolicy(policy);
        return this;
    }

    static {
        DEFAULT_FONTS_CONTRACT = new FontProviderHelper();
    }
}
