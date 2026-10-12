package androidx.emoji2.text;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Typeface;
import androidx.emoji2.text.flatbuffer.MetadataItem;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* JADX INFO: loaded from: classes4.dex */
public class TypefaceEmojiRasterizer {
    static final int HAS_GLYPH_ABSENT = 1;
    static final int HAS_GLYPH_EXISTS = 2;
    static final int HAS_GLYPH_UNKNOWN = 0;
    private static final ThreadLocal<MetadataItem> sMetadataItem = null;
    private volatile int mCache;
    private final int mIndex;
    private final MetadataRepo mMetadataRepo;

    @Retention(RetentionPolicy.SOURCE)
    public @interface HasGlyph {
    }

    static {
        sMetadataItem = new ThreadLocal();
    }

    TypefaceEmojiRasterizer(MetadataRepo metadataRepo, int index) {
        this.mCache = 0;
        this.mMetadataRepo = metadataRepo;
        this.mIndex = index;
    }

    public void draw(Canvas canvas, float x, float y, Paint paint) {
        Typeface typeface = this.mMetadataRepo.getTypeface();
        Typeface oldTypeface = paint.getTypeface();
        paint.setTypeface(typeface);
        int charArrayStartIndex = this.mIndex * 2;
        canvas.drawText(this.mMetadataRepo.getEmojiCharArray(), charArrayStartIndex, 2, x, y, paint);
        paint.setTypeface(oldTypeface);
    }

    public Typeface getTypeface() {
        return this.mMetadataRepo.getTypeface();
    }

    private MetadataItem getMetadataItem() {
        MetadataItem result = sMetadataItem.get();
        if (result != null) goto L5;
        result = new MetadataItem();
        sMetadataItem.set(result);
    L5:
        this.mMetadataRepo.getMetadataList().list(result, this.mIndex);
        return result;
    }

    public int getId() {
        return getMetadataItem().id();
    }

    public int getWidth() {
        return getMetadataItem().width();
    }

    public int getHeight() {
        return getMetadataItem().height();
    }

    public short getCompatAdded() {
        return getMetadataItem().compatAdded();
    }

    public short getSdkAdded() {
        return getMetadataItem().sdkAdded();
    }

    public int getHasGlyph() {
        return this.mCache & 3;
    }

    public void resetHasGlyphCache() {
        boolean willExclude = isPreferredSystemRender();
        if (willExclude == false) goto L5;
        this.mCache = 4;
        return;
    L5:
        this.mCache = 0;
    }

    public void setHasGlyph(boolean hasGlyph) {
        int newValue = this.mCache & 4;
        if (hasGlyph == false) goto L5;
        int newValue2 = newValue | 2;
    L6:
        this.mCache = newValue2;
        return;
    L5:
        newValue2 = newValue | 1;
        goto L6
    }

    public void setExclusion(boolean exclude) {
        int hasGlyphBits = getHasGlyph();
        if (exclude == false) goto L5;
        this.mCache = hasGlyphBits | 4;
        return;
    L5:
        this.mCache = hasGlyphBits;
    }

    public boolean isPreferredSystemRender() {
        if ((this.mCache & 4) <= 0) goto L5;
        return true;
    L5:
        return false;
    }

    public boolean isDefaultEmoji() {
        return getMetadataItem().emojiStyle();
    }

    public int getCodepointAt(int index) {
        return getMetadataItem().codepoints(index);
    }

    public int getCodepointsLength() {
        return getMetadataItem().codepointsLength();
    }

    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append(super.toString());
        builder.append(", id:");
        builder.append(Integer.toHexString(getId()));
        builder.append(", codepoints:");
        int codepointsLength = getCodepointsLength();
        int i = 0;
    L3:
        if (i >= codepointsLength) goto L6;
        builder.append(Integer.toHexString(getCodepointAt(i)));
        builder.append(" ");
        i = i + 1;
        goto L3
    L6:
        return builder.toString();
    }
}
