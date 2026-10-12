package androidx.emoji2.text;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.Editable;
import android.view.KeyEvent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import androidx.collection.ArraySet;
import androidx.core.util.Preconditions;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* JADX INFO: loaded from: classes4.dex */
public class EmojiCompat {
    private static final Object CONFIG_LOCK = null;
    public static final String EDITOR_INFO_METAVERSION_KEY = "android.support.text.emoji.emojiCompat_metadataVersion";
    public static final String EDITOR_INFO_REPLACE_ALL_KEY = "android.support.text.emoji.emojiCompat_replaceAll";
    static final int EMOJI_COUNT_UNLIMITED = Integer.MAX_VALUE;
    public static final int EMOJI_FALLBACK = 2;
    public static final int EMOJI_SUPPORTED = 1;
    public static final int EMOJI_UNSUPPORTED = 0;
    private static final Object INSTANCE_LOCK = null;
    public static final int LOAD_STATE_DEFAULT = 3;
    public static final int LOAD_STATE_FAILED = 2;
    public static final int LOAD_STATE_LOADING = 0;
    public static final int LOAD_STATE_SUCCEEDED = 1;
    public static final int LOAD_STRATEGY_DEFAULT = 0;
    public static final int LOAD_STRATEGY_MANUAL = 1;
    private static final String NOT_INITIALIZED_ERROR_TEXT = "EmojiCompat is not initialized.\n\nYou must initialize EmojiCompat prior to referencing the EmojiCompat instance.\n\nThe most likely cause of this error is disabling the EmojiCompatInitializer\neither explicitly in AndroidManifest.xml, or by including\nandroidx.emoji2:emoji2-bundled.\n\nAutomatic initialization is typically performed by EmojiCompatInitializer. If\nyou are not expecting to initialize EmojiCompat manually in your application,\nplease check to ensure it has not been removed from your APK's manifest. You can\ndo this in Android Studio using Build > Analyze APK.\n\nIn the APK Analyzer, ensure that the startup entry for\nEmojiCompatInitializer and InitializationProvider is present in\n AndroidManifest.xml. If it is missing or contains tools:node=\"remove\", and you\nintend to use automatic configuration, verify:\n\n  1. Your application does not include emoji2-bundled\n  2. All modules do not contain an exclusion manifest rule for\n     EmojiCompatInitializer or InitializationProvider. For more information\n     about manifest exclusions see the documentation for the androidx startup\n     library.\n\nIf you intend to use emoji2-bundled, please call EmojiCompat.init. You can\nlearn more in the documentation for BundledEmojiCompatConfig.\n\nIf you intended to perform manual configuration, it is recommended that you call\nEmojiCompat.init immediately on application startup.\n\nIf you still cannot resolve this issue, please open a bug with your specific\nconfiguration to help improve error message.";
    public static final int REPLACE_STRATEGY_ALL = 1;
    public static final int REPLACE_STRATEGY_DEFAULT = 0;
    public static final int REPLACE_STRATEGY_NON_EXISTENT = 2;
    private static volatile boolean sHasDoneDefaultConfigLookup;
    private static volatile EmojiCompat sInstance;
    final int[] mEmojiAsDefaultStyleExceptions;
    private final int mEmojiSpanIndicatorColor;
    private final boolean mEmojiSpanIndicatorEnabled;
    private final GlyphChecker mGlyphChecker;
    private final CompatInternal mHelper;
    private final Set<InitCallback> mInitCallbacks;
    private final ReadWriteLock mInitLock;
    private volatile int mLoadState;
    private final Handler mMainHandler;
    private final int mMetadataLoadStrategy;
    final MetadataRepoLoader mMetadataLoader;
    final boolean mReplaceAll;
    private final SpanFactory mSpanFactory;
    final boolean mUseEmojiAsDefaultStyle;

    @Retention(RetentionPolicy.SOURCE)
    public @interface CodepointSequenceMatchResult {
    }

    private static class CompatInternal {
        final EmojiCompat mEmojiCompat;

        CompatInternal(EmojiCompat emojiCompat) {
            this.mEmojiCompat = emojiCompat;
        }

        void loadMetadata() {
            this.mEmojiCompat.onMetadataLoadSuccess();
        }

        boolean hasEmojiGlyph(CharSequence sequence) {
            return false;
        }

        boolean hasEmojiGlyph(CharSequence sequence, int metadataVersion) {
            return false;
        }

        int getEmojiStart(CharSequence cs, int offset) {
            return -1;
        }

        int getEmojiEnd(CharSequence cs, int offset) {
            return -1;
        }

        CharSequence process(CharSequence charSequence, int start, int end, int maxEmojiCount, boolean replaceAll) {
            return charSequence;
        }

        void updateEditorInfoAttrs(EditorInfo outAttrs) {
        }

        String getAssetSignature() {
            return "";
        }

        public int getEmojiMatch(CharSequence sequence, int metadataVersion) {
            return 0;
        }
    }

    private static final class CompatInternal19 extends CompatInternal {
        private volatile MetadataRepo mMetadataRepo;
        private volatile EmojiProcessor mProcessor;

        CompatInternal19(EmojiCompat emojiCompat) {
            super(emojiCompat);
        }

        @Override // androidx.emoji2.text.EmojiCompat.CompatInternal
        void loadMetadata() {
            MetadataRepoLoaderCallback callback = new AnonymousClass1(this);     // Catch: Throwable -> L4
            this.mEmojiCompat.mMetadataLoader.load(callback);     // Catch: Throwable -> L4
            return;
        L4:
            t = move-exception;
            this.mEmojiCompat.onMetadataLoadFailed(t);
        }

        void onMetadataLoadSuccess(MetadataRepo metadataRepo) {
            if (metadataRepo != null) goto L5;
            this.mEmojiCompat.onMetadataLoadFailed(new IllegalArgumentException("metadataRepo cannot be null"));
            return;
        L5:
            this.mMetadataRepo = metadataRepo;
            this.mProcessor = new EmojiProcessor(this.mMetadataRepo, EmojiCompat.access$000(this.mEmojiCompat), EmojiCompat.access$100(this.mEmojiCompat), this.mEmojiCompat.mUseEmojiAsDefaultStyle, this.mEmojiCompat.mEmojiAsDefaultStyleExceptions, EmojiExclusions.getEmojiExclusions());
            this.mEmojiCompat.onMetadataLoadSuccess();
        }

        @Override // androidx.emoji2.text.EmojiCompat.CompatInternal
        boolean hasEmojiGlyph(CharSequence sequence) {
            if (this.mProcessor.getEmojiMatch(sequence) == 1) goto L7;
            return false;
        L7:
            return true;
        }

        @Override // androidx.emoji2.text.EmojiCompat.CompatInternal
        boolean hasEmojiGlyph(CharSequence sequence, int metadataVersion) {
            int emojiMatch = this.mProcessor.getEmojiMatch(sequence, metadataVersion);
            if (emojiMatch == 1) goto L7;
            return false;
        L7:
            return true;
        }

        @Override // androidx.emoji2.text.EmojiCompat.CompatInternal
        public int getEmojiMatch(CharSequence sequence, int metadataVersion) {
            return this.mProcessor.getEmojiMatch(sequence, metadataVersion);
        }

        @Override // androidx.emoji2.text.EmojiCompat.CompatInternal
        int getEmojiStart(CharSequence sequence, int offset) {
            return this.mProcessor.getEmojiStart(sequence, offset);
        }

        @Override // androidx.emoji2.text.EmojiCompat.CompatInternal
        int getEmojiEnd(CharSequence sequence, int offset) {
            return this.mProcessor.getEmojiEnd(sequence, offset);
        }

        @Override // androidx.emoji2.text.EmojiCompat.CompatInternal
        CharSequence process(CharSequence charSequence, int start, int end, int maxEmojiCount, boolean replaceAll) {
            return this.mProcessor.process(charSequence, start, end, maxEmojiCount, replaceAll);
        }

        @Override // androidx.emoji2.text.EmojiCompat.CompatInternal
        void updateEditorInfoAttrs(EditorInfo outAttrs) {
            outAttrs.extras.putInt(EmojiCompat.EDITOR_INFO_METAVERSION_KEY, this.mMetadataRepo.getMetadataVersion());
            outAttrs.extras.putBoolean(EmojiCompat.EDITOR_INFO_REPLACE_ALL_KEY, this.mEmojiCompat.mReplaceAll);
        }

        @Override // androidx.emoji2.text.EmojiCompat.CompatInternal
        String getAssetSignature() {
            String sha = this.mMetadataRepo.getMetadataList().sourceSha();
            if (sha != null) goto L6;
            return "";
        L6:
            return sha;
        }
    }

    public static abstract class Config {
        int[] mEmojiAsDefaultStyleExceptions;
        int mEmojiSpanIndicatorColor;
        boolean mEmojiSpanIndicatorEnabled;
        GlyphChecker mGlyphChecker;
        Set<InitCallback> mInitCallbacks;
        int mMetadataLoadStrategy;
        final MetadataRepoLoader mMetadataLoader;
        boolean mReplaceAll;
        SpanFactory mSpanFactory;
        boolean mUseEmojiAsDefaultStyle;

        protected Config(MetadataRepoLoader metadataLoader) {
            this.mEmojiSpanIndicatorColor = -16711936;
            this.mMetadataLoadStrategy = 0;
            this.mGlyphChecker = new DefaultGlyphChecker();
            Preconditions.checkNotNull(metadataLoader, "metadataLoader cannot be null.");
            this.mMetadataLoader = metadataLoader;
        }

        public Config registerInitCallback(InitCallback initCallback) {
            Preconditions.checkNotNull(initCallback, "initCallback cannot be null");
            if (this.mInitCallbacks != null) goto L5;
            this.mInitCallbacks = new ArraySet();
        L5:
            this.mInitCallbacks.add(initCallback);
            return this;
        }

        public Config unregisterInitCallback(InitCallback initCallback) {
            Preconditions.checkNotNull(initCallback, "initCallback cannot be null");
            if (this.mInitCallbacks == null) goto L5;
            this.mInitCallbacks.remove(initCallback);
        L5:
            return this;
        }

        public Config setReplaceAll(boolean replaceAll) {
            this.mReplaceAll = replaceAll;
            return this;
        }

        public Config setUseEmojiAsDefaultStyle(boolean useEmojiAsDefaultStyle) {
            return setUseEmojiAsDefaultStyle(useEmojiAsDefaultStyle, null);
        }

        public Config setUseEmojiAsDefaultStyle(boolean useEmojiAsDefaultStyle, List<Integer> emojiAsDefaultStyleExceptions) {
            this.mUseEmojiAsDefaultStyle = useEmojiAsDefaultStyle;
            if (this.mUseEmojiAsDefaultStyle == false) goto L10;
            if (emojiAsDefaultStyleExceptions == null) goto L10;
            this.mEmojiAsDefaultStyleExceptions = new int[emojiAsDefaultStyleExceptions.size()];
            int i = 0;
            Iterator<Integer> r1 = emojiAsDefaultStyleExceptions.iterator();
        L7:
            if (r1.hasNext() == false) goto L9;
            Integer exception = r1.next();
            this.mEmojiAsDefaultStyleExceptions[i] = exception.intValue();
            i = i + 1;
            goto L7
        L9:
            Arrays.sort(this.mEmojiAsDefaultStyleExceptions);
        L11:
            return this;
        L10:
            this.mEmojiAsDefaultStyleExceptions = null;
            goto L11
        }

        public Config setEmojiSpanIndicatorEnabled(boolean emojiSpanIndicatorEnabled) {
            this.mEmojiSpanIndicatorEnabled = emojiSpanIndicatorEnabled;
            return this;
        }

        public Config setEmojiSpanIndicatorColor(int color) {
            this.mEmojiSpanIndicatorColor = color;
            return this;
        }

        public Config setMetadataLoadStrategy(int strategy) {
            this.mMetadataLoadStrategy = strategy;
            return this;
        }

        public Config setSpanFactory(SpanFactory factory) {
            this.mSpanFactory = factory;
            return this;
        }

        public Config setGlyphChecker(GlyphChecker glyphChecker) {
            Preconditions.checkNotNull(glyphChecker, "GlyphChecker cannot be null");
            this.mGlyphChecker = glyphChecker;
            return this;
        }

        protected final MetadataRepoLoader getMetadataRepoLoader() {
            return this.mMetadataLoader;
        }
    }

    public static class DefaultSpanFactory implements SpanFactory {
        public DefaultSpanFactory() {
        }

        @Override // androidx.emoji2.text.EmojiCompat.SpanFactory
        public EmojiSpan createSpan(TypefaceEmojiRasterizer rasterizer) {
            return new TypefaceEmojiSpan(rasterizer);
        }
    }

    public interface GlyphChecker {
        boolean hasGlyph(CharSequence r1, int r2, int r3, int r4);
    }

    public static abstract class InitCallback {
        public InitCallback() {
        }

        public void onInitialized() {
        }

        public void onFailed(Throwable throwable) {
        }
    }

    private static class ListenerDispatcher implements Runnable {
        private final List<InitCallback> mInitCallbacks;
        private final int mLoadState;
        private final Throwable mThrowable;

        ListenerDispatcher(InitCallback initCallback, int loadState) {
            this(Arrays.asList(new InitCallback[]{(InitCallback) Preconditions.checkNotNull(initCallback, "initCallback cannot be null")}), loadState, null);
        }

        ListenerDispatcher(Collection<InitCallback> initCallbacks, int loadState) {
            this(initCallbacks, loadState, null);
        }

        ListenerDispatcher(Collection<InitCallback> initCallbacks, int loadState, Throwable throwable) {
            Preconditions.checkNotNull(initCallbacks, "initCallbacks cannot be null");
            this.mInitCallbacks = new ArrayList(initCallbacks);
            this.mLoadState = loadState;
            this.mThrowable = throwable;
        }

        @Override // java.lang.Runnable
        public void run() {
            int size = this.mInitCallbacks.size();
            switch(this.mLoadState) {
                case 1: goto L5;
                default: goto L4;
            };
        L4:
            int i = 0;
        L9:
            if (i >= size) goto L11;
            this.mInitCallbacks.get(i).onFailed(this.mThrowable);
            i = i + 1;
            goto L9
        L11:
            return;
        L5:
            int i2 = 0;
        L6:
            if (i2 >= size) goto L14;
            this.mInitCallbacks.get(i2).onInitialized();
            i2 = i2 + 1;
            goto L6
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface LoadStrategy {
    }

    public interface MetadataRepoLoader {
        void load(MetadataRepoLoaderCallback r1);
    }

    public static abstract class MetadataRepoLoaderCallback {
        public abstract void onFailed(Throwable r1);

        public abstract void onLoaded(MetadataRepo r1);

        public MetadataRepoLoaderCallback() {
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface ReplaceStrategy {
    }

    public interface SpanFactory {
        EmojiSpan createSpan(TypefaceEmojiRasterizer r1);
    }

    static /* synthetic */ SpanFactory access$000(EmojiCompat x0) {
        return x0.mSpanFactory;
    }

    static /* synthetic */ GlyphChecker access$100(EmojiCompat x0) {
        return x0.mGlyphChecker;
    }

    static {
        INSTANCE_LOCK = new Object();
        CONFIG_LOCK = new Object();
    }

    private EmojiCompat(Config config) {
        this.mInitLock = new ReentrantReadWriteLock();
        this.mLoadState = 3;
        this.mReplaceAll = config.mReplaceAll;
        this.mUseEmojiAsDefaultStyle = config.mUseEmojiAsDefaultStyle;
        this.mEmojiAsDefaultStyleExceptions = config.mEmojiAsDefaultStyleExceptions;
        this.mEmojiSpanIndicatorEnabled = config.mEmojiSpanIndicatorEnabled;
        this.mEmojiSpanIndicatorColor = config.mEmojiSpanIndicatorColor;
        this.mMetadataLoader = config.mMetadataLoader;
        this.mMetadataLoadStrategy = config.mMetadataLoadStrategy;
        this.mGlyphChecker = config.mGlyphChecker;
        this.mMainHandler = new Handler(Looper.getMainLooper());
        this.mInitCallbacks = new ArraySet();
        SpanFactory localSpanFactory = config.mSpanFactory;
        if (localSpanFactory == null) goto L5;
        SpanFactory r1 = localSpanFactory;
    L6:
        this.mSpanFactory = r1;
        if (config.mInitCallbacks != null) goto L9;
    L11:
        this.mHelper = new CompatInternal19(this);
        loadMetadata();
        return;
    L9:
        if (config.mInitCallbacks.isEmpty() == true) goto L11;
        this.mInitCallbacks.addAll(config.mInitCallbacks);
        goto L11
    L5:
        r1 = new DefaultSpanFactory();
        goto L6
    }

    public static EmojiCompat init(Context context) {
        return init(context, null);
    }

    public static EmojiCompat init(Context context, DefaultEmojiCompatConfig.DefaultEmojiCompatConfigFactory defaultFactory) {
        if (sHasDoneDefaultConfigLookup == true) goto L5;
        if (defaultFactory == null) goto L8;
        DefaultEmojiCompatConfig.DefaultEmojiCompatConfigFactory factory = defaultFactory;
    L9:
        Config config = factory.create(context);
        Object r1 = CONFIG_LOCK;
        monitor-enter(r1);
    L19:
        th = move-exception;
        throw th;
    L12:
        if (sHasDoneDefaultConfigLookup == true) goto L16;
        if (config == null) goto L15;
        init(config);     // Catch: Throwable -> L19
    L15:
        sHasDoneDefaultConfigLookup = true;     // Catch: Throwable -> L19
    L16:
        EmojiCompat r2 = sInstance;     // Catch: Throwable -> L19
        monitor-exit(r1);     // Catch: Throwable -> L19
        return r2;
    L8:
        factory = new DefaultEmojiCompatConfig.DefaultEmojiCompatConfigFactory(null);
        goto L9
    L5:
        return sInstance;
    }

    public static EmojiCompat init(Config config) {
        EmojiCompat localInstance = sInstance;
        if (localInstance != null) goto L14;
        Object r1 = INSTANCE_LOCK;
        monitor-enter(r1);
        localInstance = sInstance;     // Catch: Throwable -> L11
        if (localInstance != null) goto L9;
        localInstance = new EmojiCompat(config);     // Catch: Throwable -> L11
        sInstance = localInstance;     // Catch: Throwable -> L11
    L9:
        monitor-exit(r1);     // Catch: Throwable -> L11
    L11:
        th = move-exception;
        throw th;
    L14:
        return localInstance;
    }

    public static boolean isConfigured() {
        if (sInstance == null) goto L5;
        return true;
    L5:
        return false;
    }

    public static EmojiCompat reset(Config config) {
        Object r0 = INSTANCE_LOCK;
        monitor-enter(r0);
        EmojiCompat localInstance = new EmojiCompat(config);     // Catch: Throwable -> L7
        sInstance = localInstance;     // Catch: Throwable -> L7
        monitor-exit(r0);     // Catch: Throwable -> L7
        return localInstance;
    L7:
        th = move-exception;
        throw th;
    }

    public static EmojiCompat reset(EmojiCompat emojiCompat) {
        Object r0 = INSTANCE_LOCK;
        monitor-enter(r0);
        sInstance = emojiCompat;     // Catch: Throwable -> L7
        EmojiCompat r1 = sInstance;     // Catch: Throwable -> L7
        monitor-exit(r0);     // Catch: Throwable -> L7
        return r1;
    L7:
        th = move-exception;
        throw th;
    }

    public static void skipDefaultConfigurationLookup(boolean shouldSkip) {
        Object r0 = CONFIG_LOCK;
        monitor-enter(r0);
        sHasDoneDefaultConfigLookup = shouldSkip;     // Catch: Throwable -> L7
        monitor-exit(r0);     // Catch: Throwable -> L7
        return;
    L7:
        th = move-exception;
        throw th;
    }

    public static EmojiCompat get() {
        Object r0 = INSTANCE_LOCK;
        monitor-enter(r0);
        EmojiCompat localInstance = sInstance;     // Catch: Throwable -> L11
        if (localInstance == null) goto L7;
        boolean r2 = true;
    L8:
        Preconditions.checkState(r2, NOT_INITIALIZED_ERROR_TEXT);     // Catch: Throwable -> L11
        monitor-exit(r0);     // Catch: Throwable -> L11
        return localInstance;
    L7:
        r2 = false;
    L11:
        th = move-exception;
        throw th;
    }

    public void load() {
        boolean r2 = true;
        if (this.mMetadataLoadStrategy == 1) goto L6;
        r2 = false;
    L6:
        Preconditions.checkState(r2, "Set metadataLoadStrategy to LOAD_STRATEGY_MANUAL to execute manual loading");
        if (isInitialized() == false) goto L9;
        return;
    L9:
        this.mInitLock.writeLock().lock();
    L17:
        th = move-exception;
        this.mInitLock.writeLock().unlock();
        throw th;
    L11:
        if (this.mLoadState != 0) goto L14;
        this.mInitLock.writeLock().unlock();
        return;
    L14:
        this.mLoadState = 0;     // Catch: Throwable -> L17
        this.mInitLock.writeLock().unlock();
        this.mHelper.loadMetadata();
    }

    private void loadMetadata() {
        this.mInitLock.writeLock().lock();
    L10:
        th = move-exception;
        this.mInitLock.writeLock().unlock();
        throw th;
    L4:
        if (this.mMetadataLoadStrategy != 0) goto L6;
        this.mLoadState = 0;     // Catch: Throwable -> L10
    L6:
        this.mInitLock.writeLock().unlock();
        if (getLoadState() != 0) goto L15;
        this.mHelper.loadMetadata();
        return;
    }

    void onMetadataLoadSuccess() {
        Collection<InitCallback> initCallbacks = new ArrayList();
        this.mInitLock.writeLock().lock();
        this.mLoadState = 1;     // Catch: Throwable -> L6
        initCallbacks.addAll(this.mInitCallbacks);     // Catch: Throwable -> L6
        this.mInitCallbacks.clear();     // Catch: Throwable -> L6
        this.mInitLock.writeLock().unlock();
        this.mMainHandler.post(new ListenerDispatcher(initCallbacks, this.mLoadState));
        return;
    L6:
        th = move-exception;
        this.mInitLock.writeLock().unlock();
        throw th;
    }

    void onMetadataLoadFailed(Throwable throwable) {
        Collection<InitCallback> initCallbacks = new ArrayList();
        this.mInitLock.writeLock().lock();
        this.mLoadState = 2;     // Catch: Throwable -> L6
        initCallbacks.addAll(this.mInitCallbacks);     // Catch: Throwable -> L6
        this.mInitCallbacks.clear();     // Catch: Throwable -> L6
        this.mInitLock.writeLock().unlock();
        this.mMainHandler.post(new ListenerDispatcher(initCallbacks, this.mLoadState, throwable));
        return;
    L6:
        th = move-exception;
        this.mInitLock.writeLock().unlock();
        throw th;
    }

    public void registerInitCallback(InitCallback initCallback) {
        Preconditions.checkNotNull(initCallback, "initCallback cannot be null");
        this.mInitLock.writeLock().lock();
    L12:
        th = move-exception;
        this.mInitLock.writeLock().unlock();
        throw th;
    L4:
        if (this.mLoadState != 1) goto L6;
    L9:
        this.mMainHandler.post(new ListenerDispatcher(initCallback, this.mLoadState));     // Catch: Throwable -> L12
    L10:
        this.mInitLock.writeLock().unlock();
        return;
    L6:
        if (this.mLoadState == 2) goto L9;
        this.mInitCallbacks.add(initCallback);     // Catch: Throwable -> L12
        goto L10
    }

    public void unregisterInitCallback(InitCallback initCallback) {
        Preconditions.checkNotNull(initCallback, "initCallback cannot be null");
        this.mInitLock.writeLock().lock();
        this.mInitCallbacks.remove(initCallback);     // Catch: Throwable -> L6
        this.mInitLock.writeLock().unlock();
        return;
    L6:
        th = move-exception;
        this.mInitLock.writeLock().unlock();
        throw th;
    }

    public int getLoadState() {
        this.mInitLock.readLock().lock();
        int r0 = this.mLoadState;     // Catch: Throwable -> L6
        this.mInitLock.readLock().unlock();
        return r0;
    L6:
        th = move-exception;
        this.mInitLock.readLock().unlock();
        throw th;
    }

    private boolean isInitialized() {
        if (getLoadState() == 1) goto L7;
        return false;
    L7:
        return true;
    }

    public boolean isEmojiSpanIndicatorEnabled() {
        return this.mEmojiSpanIndicatorEnabled;
    }

    public int getEmojiSpanIndicatorColor() {
        return this.mEmojiSpanIndicatorColor;
    }

    public int getEmojiStart(CharSequence charSequence, int offset) {
        Preconditions.checkState(isInitialized(), "Not initialized yet");
        Preconditions.checkNotNull(charSequence, "charSequence cannot be null");
        return this.mHelper.getEmojiStart(charSequence, offset);
    }

    public int getEmojiEnd(CharSequence charSequence, int offset) {
        Preconditions.checkState(isInitialized(), "Not initialized yet");
        Preconditions.checkNotNull(charSequence, "charSequence cannot be null");
        return this.mHelper.getEmojiEnd(charSequence, offset);
    }

    public static boolean handleOnKeyDown(Editable editable, int keyCode, KeyEvent event) {
        return EmojiProcessor.handleOnKeyDown(editable, keyCode, event);
    }

    public static boolean handleDeleteSurroundingText(InputConnection inputConnection, Editable editable, int beforeLength, int afterLength, boolean inCodePoints) {
        return EmojiProcessor.handleDeleteSurroundingText(inputConnection, editable, beforeLength, afterLength, inCodePoints);
    }

    @Deprecated
    public boolean hasEmojiGlyph(CharSequence sequence) {
        Preconditions.checkState(isInitialized(), "Not initialized yet");
        Preconditions.checkNotNull(sequence, "sequence cannot be null");
        return this.mHelper.hasEmojiGlyph(sequence);
    }

    @Deprecated
    public boolean hasEmojiGlyph(CharSequence sequence, int metadataVersion) {
        Preconditions.checkState(isInitialized(), "Not initialized yet");
        Preconditions.checkNotNull(sequence, "sequence cannot be null");
        return this.mHelper.hasEmojiGlyph(sequence, metadataVersion);
    }

    public int getEmojiMatch(CharSequence sequence, int metadataVersion) {
        Preconditions.checkState(isInitialized(), "Not initialized yet");
        Preconditions.checkNotNull(sequence, "sequence cannot be null");
        return this.mHelper.getEmojiMatch(sequence, metadataVersion);
    }

    public CharSequence process(CharSequence charSequence) {
        if (charSequence != null) goto L5;
        int length = 0;
    L7:
        return process(charSequence, 0, length);
    L5:
        length = charSequence.length();
        goto L7
    }

    public CharSequence process(CharSequence charSequence, int start, int end) {
        return process(charSequence, start, end, Integer.MAX_VALUE);
    }

    public CharSequence process(CharSequence charSequence, int start, int end, int maxEmojiCount) {
        return process(charSequence, start, end, maxEmojiCount, 0);
    }

    public CharSequence process(CharSequence charSequence, int start, int end, int maxEmojiCount, int replaceStrategy) {
        Preconditions.checkState(isInitialized(), "Not initialized yet");
        Preconditions.checkArgumentNonnegative(start, "start cannot be negative");
        Preconditions.checkArgumentNonnegative(end, "end cannot be negative");
        Preconditions.checkArgumentNonnegative(maxEmojiCount, "maxEmojiCount cannot be negative");
        boolean r0 = true;
        if (start > end) goto L5;
        boolean r2 = true;
    L6:
        Preconditions.checkArgument(r2, "start should be <= than end");
        if (charSequence != null) goto L11;
        return null;
    L11:
        if (start > charSequence.length()) goto L13;
        boolean r3 = true;
    L14:
        Preconditions.checkArgument(r3, "start should be < than charSequence length");
        if (end <= charSequence.length()) goto L18;
        r0 = false;
    L18:
        Preconditions.checkArgument(r0, "end should be < than charSequence length");
        if (charSequence.length() == 0) goto L29;
        if (start == end) goto L30;
        switch(replaceStrategy) {
            case 1: goto L25;
            case 2: goto L24;
            default: goto L23;
        };
    L23:
        boolean replaceAll = this.mReplaceAll;
    L27:
        return this.mHelper.process(charSequence, start, end, maxEmojiCount, replaceAll);
    L24:
        replaceAll = false;
        goto L27
    L25:
        replaceAll = true;
        goto L27
    L30:
        return charSequence;
    L29:
        return charSequence;
    L13:
        r3 = false;
        goto L14
    L5:
        r2 = false;
        goto L6
    }

    public String getAssetSignature() {
        Preconditions.checkState(isInitialized(), "Not initialized yet");
        return this.mHelper.getAssetSignature();
    }

    public void updateEditorInfo(EditorInfo outAttrs) {
        if (isInitialized() == false) goto L11;
        if (outAttrs != null) goto L7;
        return;
    L7:
        if (outAttrs.extras != null) goto L9;
        outAttrs.extras = new Bundle();
    L9:
        this.mHelper.updateEditorInfoAttrs(outAttrs);
        return;
    }
}
