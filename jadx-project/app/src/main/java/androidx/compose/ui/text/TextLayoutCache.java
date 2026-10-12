package androidx.compose.ui.text;

import androidx.collection.LruCache;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: TextMeasurer.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\u000b\u001a\u0004\u0018\u00010\b2\u0006\u0010\f\u001a\u00020\rJ\u0016\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\bR\u001c\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\bX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Landroidx/compose/ui/text/TextLayoutCache;", "", "capacity", "", "(I)V", "cache", "Landroidx/collection/LruCache;", "Landroidx/compose/ui/text/CacheTextLayoutInput;", "Landroidx/compose/ui/text/TextLayoutResult;", "singleSizeCacheInput", "singleSizeCacheResult", "get", "key", "Landroidx/compose/ui/text/TextLayoutInput;", "put", "", "value", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class TextLayoutCache {
    public static final int $stable = 0;
    private final LruCache<CacheTextLayoutInput, TextLayoutResult> cache;
    private CacheTextLayoutInput singleSizeCacheInput;
    private TextLayoutResult singleSizeCacheResult;

    static {
        $stable = 8;
    }

    public TextLayoutCache() {
        int r2 = 0;
        this(r2, 1, null);
    }

    public TextLayoutCache(int capacity) {
        if (capacity == 1) goto L5;
        LruCache<CacheTextLayoutInput, TextLayoutResult> r0 = new LruCache(capacity);
    L6:
        this.cache = r0;
        return;
    L5:
        r0 = null;
        goto L6
    }

    public /* synthetic */ TextLayoutCache(int r1, int r2, DefaultConstructorMarker r3) {
        if ((r2 & 1) == 0) goto L5;
        r1 = 8;
    L5:
        this(r1);
    }

    public final TextLayoutResult get(TextLayoutInput key) {
        CacheTextLayoutInput cacheKey = new CacheTextLayoutInput(key);
        if (this.cache == null) goto L6;
        TextLayoutResult resultFromCache = this.cache.get(cacheKey);
    L9:
        if (resultFromCache != null) goto L12;
        return null;
    L12:
        if (resultFromCache.getMultiParagraph().getIntrinsics().getHasStaleResolvedFonts() == false) goto L14;
        return null;
    L14:
        return resultFromCache;
    L6:
        if (Intrinsics.areEqual(this.singleSizeCacheInput, cacheKey) == false) goto L15;
        resultFromCache = this.singleSizeCacheResult;
        goto L9
    L15:
        return null;
    }

    public final void put(TextLayoutInput key, TextLayoutResult value) {
        if (this.cache == null) goto L5;
        this.cache.put(new CacheTextLayoutInput(key), value);
        return;
    L5:
        this.singleSizeCacheInput = new CacheTextLayoutInput(key);
        this.singleSizeCacheResult = value;
    }
}
