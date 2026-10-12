package androidx.compose.ui.text.android;

import kotlin.Metadata;

/* JADX INFO: compiled from: TextLayout.android.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J(\u0010\u000b\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000eH\u0002J\u000e\u0010\u0011\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u0006J\u000e\u0010\u0012\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u0006J\u000e\u0010\u0013\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u0006J\u000e\u0010\u0014\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u0006R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0015"}, d2 = {"Landroidx/compose/ui/text/android/HorizontalPositionCache;", "", "layout", "Landroidx/compose/ui/text/android/TextLayout;", "(Landroidx/compose/ui/text/android/TextLayout;)V", "cachedKey", "", "cachedValue", "", "getLayout", "()Landroidx/compose/ui/text/android/TextLayout;", "get", "offset", "upstream", "", "cache", "primary", "getPrimaryDownstream", "getPrimaryUpstream", "getSecondaryDownstream", "getSecondaryUpstream", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
final class HorizontalPositionCache {
    private int cachedKey;
    private float cachedValue;
    private final TextLayout layout;

    public HorizontalPositionCache(TextLayout layout) {
        this.layout = layout;
        this.cachedKey = -1;
    }

    public final TextLayout getLayout() {
        return this.layout;
    }

    public final float getPrimaryDownstream(int offset) {
        return get(offset, false, false, true);
    }

    public final float getPrimaryUpstream(int offset) {
        return get(offset, true, true, true);
    }

    public final float getSecondaryDownstream(int offset) {
        return get(offset, false, false, false);
    }

    public final float getSecondaryUpstream(int offset) {
        return get(offset, true, true, false);
    }

    private final float get(int offset, boolean upstream, boolean cache, boolean primary) {
        int r0 = 1;
        if (upstream == false) goto L10;
        int lineNo = LayoutCompat_androidKt.getLineForOffset(this.layout.getLayout(), offset, upstream);
        int lineStart = this.layout.getLineStart(lineNo);
        int lineEnd = this.layout.getLineEnd(lineNo);
        if (offset == lineStart) goto L9;
        if (offset == lineEnd) goto L9;
        int lineNo2 = 0;
    L11:
        int r3 = offset * 4;
        if (primary == false) goto L15;
        if (lineNo2 == 0) goto L18;
        r0 = 0;
    L18:
        int tmpKey = r3 + r0;
        if (this.cachedKey == tmpKey) goto L21;
        TextLayout r1 = this.layout;
        if (primary == false) goto L25;
        float result = r1.getPrimaryHorizontal(offset, upstream);
    L27:
        if (cache == false) goto L29;
        this.cachedKey = tmpKey;
        this.cachedValue = result;
    L29:
        return result;
    L25:
        result = r1.getSecondaryHorizontal(offset, upstream);
        goto L27
    L21:
        return this.cachedValue;
    L15:
        if (lineNo2 == 0) goto L17;
        r0 = 2;
        goto L18
    L17:
        r0 = 3;
    L9:
        lineNo2 = 1;
        goto L11
    L10:
        lineNo2 = 0;
        goto L11
    }
}
