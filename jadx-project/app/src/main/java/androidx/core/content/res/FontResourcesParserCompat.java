package androidx.core.content.res;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Base64;
import android.util.Xml;
import androidx.core.R;
import androidx.core.provider.FontRequest;
import java.io.IOException;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes4.dex */
public class FontResourcesParserCompat {
    private static final int DEFAULT_TIMEOUT_MILLIS = 500;
    public static final int FETCH_STRATEGY_ASYNC = 1;
    public static final int FETCH_STRATEGY_BLOCKING = 0;
    public static final int INFINITE_TIMEOUT_VALUE = -1;
    private static final int ITALIC = 1;
    private static final int NORMAL_WEIGHT = 400;

    static class Api21Impl {
        private Api21Impl() {
        }

        static int getType(TypedArray typedArray, int index) {
            return typedArray.getType(index);
        }
    }

    public interface FamilyResourceEntry {
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface FetchStrategy {
    }

    public static final class FontFamilyFilesResourceEntry implements FamilyResourceEntry {
        private final FontFileResourceEntry[] mEntries;

        public FontFamilyFilesResourceEntry(FontFileResourceEntry[] entries) {
            this.mEntries = entries;
        }

        public FontFileResourceEntry[] getEntries() {
            return this.mEntries;
        }
    }

    public static final class FontFileResourceEntry {
        private final String mFileName;
        private final boolean mItalic;
        private final int mResourceId;
        private final int mTtcIndex;
        private final String mVariationSettings;
        private final int mWeight;

        public FontFileResourceEntry(String fileName, int weight, boolean italic, String variationSettings, int ttcIndex, int resourceId) {
            this.mFileName = fileName;
            this.mWeight = weight;
            this.mItalic = italic;
            this.mVariationSettings = variationSettings;
            this.mTtcIndex = ttcIndex;
            this.mResourceId = resourceId;
        }

        public String getFileName() {
            return this.mFileName;
        }

        public int getWeight() {
            return this.mWeight;
        }

        public boolean isItalic() {
            return this.mItalic;
        }

        public String getVariationSettings() {
            return this.mVariationSettings;
        }

        public int getTtcIndex() {
            return this.mTtcIndex;
        }

        public int getResourceId() {
            return this.mResourceId;
        }
    }

    public static final class ProviderResourceEntry implements FamilyResourceEntry {
        private final FontRequest mFallbackRequest;
        private final FontRequest mRequest;
        private final int mStrategy;
        private final String mSystemFontFamilyName;
        private final int mTimeoutMs;

        public ProviderResourceEntry(FontRequest request, FontRequest fallbackRequest, int strategy, int timeoutMs, String systemFontFamilyName) {
            this.mRequest = request;
            this.mFallbackRequest = fallbackRequest;
            this.mStrategy = strategy;
            this.mTimeoutMs = timeoutMs;
            this.mSystemFontFamilyName = systemFontFamilyName;
        }

        public ProviderResourceEntry(FontRequest request, int strategy, int timeoutMs) {
            this(request, null, strategy, timeoutMs, null);
        }

        public FontRequest getRequest() {
            return this.mRequest;
        }

        public FontRequest getFallbackRequest() {
            return this.mFallbackRequest;
        }

        public int getFetchStrategy() {
            return this.mStrategy;
        }

        public int getTimeout() {
            return this.mTimeoutMs;
        }

        public String getSystemFontFamilyName() {
            return this.mSystemFontFamilyName;
        }
    }

    public static FamilyResourceEntry parse(XmlPullParser parser, Resources resources) throws XmlPullParserException, IOException {
    L2:
        int type = parser.next();
        if (type == 2) goto L7;
        if (type != 1) goto L2;
    L7:
        if (type != 2) goto L11;
        return readFamilies(parser, resources);
    L11:
        throw new XmlPullParserException("No start tag found");
    }

    private static FamilyResourceEntry readFamilies(XmlPullParser parser, Resources resources) throws XmlPullParserException, IOException {
        parser.require(2, null, "font-family");
        String tag = parser.getName();
        if (tag.equals("font-family") == true) goto L5;
        skip(parser);
        return null;
    L5:
        return readFamily(parser, resources);
    }

    private static FamilyResourceEntry readFamily(XmlPullParser parser, Resources resources) throws XmlPullParserException, IOException {
        AttributeSet attrs = Xml.asAttributeSet(parser);
        TypedArray array = resources.obtainAttributes(attrs, R.styleable.FontFamily);
        String authority = array.getString(R.styleable.FontFamily_fontProviderAuthority);
        String providerPackage = array.getString(R.styleable.FontFamily_fontProviderPackage);
        String query = array.getString(R.styleable.FontFamily_fontProviderQuery);
        String fallbackQuery = array.getString(R.styleable.FontFamily_fontProviderFallbackQuery);
        int certsId = array.getResourceId(R.styleable.FontFamily_fontProviderCerts, 0);
        int strategy = array.getInteger(R.styleable.FontFamily_fontProviderFetchStrategy, 1);
        int timeoutMs = array.getInteger(R.styleable.FontFamily_fontProviderFetchTimeout, DEFAULT_TIMEOUT_MILLIS);
        String systemFontFamilyName = array.getString(R.styleable.FontFamily_fontProviderSystemFontFamily);
        array.recycle();
        if (authority == null) goto L15;
        if (providerPackage == null) goto L15;
        if (query == null) goto L15;
    L7:
        if (parser.next() == 3) goto L9;
        skip(parser);
        goto L7
    L9:
        List<List<byte[]>> certs = readCerts(resources, certsId);
        if (fallbackQuery == null) goto L12;
        FontRequest fallbackRequest = new FontRequest(authority, providerPackage, fallbackQuery, certs);
    L14:
        return new ProviderResourceEntry(new FontRequest(authority, providerPackage, query, certs), fallbackRequest, strategy, timeoutMs, systemFontFamilyName);
    L12:
        fallbackRequest = null;
    L15:
        List<FontFileResourceEntry> fonts = new ArrayList();
    L17:
        if (parser.next() == 3) goto L27;
        if (parser.getEventType() != 2) goto L17;
        String tag = parser.getName();
        if (tag.equals("font") == true) goto L23;
        skip(parser);
        goto L17
    L23:
        fonts.add(readFont(parser, resources));
        goto L17
    L27:
        if (fonts.isEmpty() == false) goto L31;
        return null;
    L31:
        return new FontFamilyFilesResourceEntry((FontFileResourceEntry[]) fonts.toArray(new FontFileResourceEntry[0]));
    }

    private static int getType(TypedArray typedArray, int index) {
        return Api21Impl.getType(typedArray, index);
    }

    public static List<List<byte[]>> readCerts(Resources resources, int certsId) {
        if (certsId == 0) goto L4;
        TypedArray typedArray = resources.obtainTypedArray(certsId);
    L24:
        th = move-exception;
        typedArray.recycle();
        throw th;
    L7:
        if (typedArray.length() != 0) goto L11;
        List<List<byte[]>> r1 = Collections.emptyList();     // Catch: Throwable -> L24
        typedArray.recycle();
        return r1;
    L11:
        List<List<byte[]>> result = new ArrayList();     // Catch: Throwable -> L24
        if (getType(typedArray, 0) != 1) goto L21;
        int i = 0;
    L15:
        if (i >= typedArray.length()) goto L22;
        int certId = typedArray.getResourceId(i, 0);     // Catch: Throwable -> L24
        if (certId == 0) goto L19;
        result.add(toByteArrayList(resources.getStringArray(certId)));     // Catch: Throwable -> L24
    L19:
        i = i + 1;     // Catch: Throwable -> L24
    L22:
        typedArray.recycle();
        return result;
    L21:
        result.add(toByteArrayList(resources.getStringArray(certsId)));     // Catch: Throwable -> L24
        goto L22
    L4:
        return Collections.emptyList();
    }

    private static List<byte[]> toByteArrayList(String[] stringArray) {
        List<byte[]> result = new ArrayList();
        int r1 = stringArray.length;
        int r3 = 0;
    L3:
        if (r3 >= r1) goto L5;
        String item = stringArray[r3];
        result.add(Base64.decode(item, 0));
        r3 = r3 + 1;
        goto L3
    L5:
        return result;
    }

    private static FontFileResourceEntry readFont(XmlPullParser parser, Resources resources) throws XmlPullParserException, IOException {
        AttributeSet attrs = Xml.asAttributeSet(parser);
        TypedArray array = resources.obtainAttributes(attrs, R.styleable.FontFamilyFont);
        if (array.hasValue(R.styleable.FontFamilyFont_fontWeight) == false) goto L5;
        int weightAttr = R.styleable.FontFamilyFont_fontWeight;
    L6:
        int weight = array.getInt(weightAttr, NORMAL_WEIGHT);
        if (array.hasValue(R.styleable.FontFamilyFont_fontStyle) == false) goto L9;
        int styleAttr = R.styleable.FontFamilyFont_fontStyle;
    L10:
        boolean isItalic = true;
        if (1 == array.getInt(styleAttr, 0)) goto L15;
        isItalic = false;
    L15:
        if (array.hasValue(R.styleable.FontFamilyFont_ttcIndex) == false) goto L17;
        int r6 = R.styleable.FontFamilyFont_ttcIndex;
    L18:
        int ttcIndexAttr = r6;
        if (array.hasValue(R.styleable.FontFamilyFont_fontVariationSettings) == false) goto L21;
        int r7 = R.styleable.FontFamilyFont_fontVariationSettings;
    L22:
        int variationSettingsAttr = r7;
        String variationSettings = array.getString(variationSettingsAttr);
        int ttcIndex = array.getInt(ttcIndexAttr, 0);
        if (array.hasValue(R.styleable.FontFamilyFont_font) == false) goto L25;
        int r8 = R.styleable.FontFamilyFont_font;
    L26:
        int resourceAttr = r8;
        int resourceId = array.getResourceId(resourceAttr, 0);
        String filename = array.getString(resourceAttr);
        array.recycle();
    L28:
        if (parser.next() == 3) goto L31;
        skip(parser);
        goto L28
    L31:
        return new FontFileResourceEntry(filename, weight, isItalic, variationSettings, ttcIndex, resourceId);
    L25:
        r8 = R.styleable.FontFamilyFont_android_font;
        goto L26
    L21:
        r7 = R.styleable.FontFamilyFont_android_fontVariationSettings;
        goto L22
    L17:
        r6 = R.styleable.FontFamilyFont_android_ttcIndex;
        goto L18
    L9:
        styleAttr = R.styleable.FontFamilyFont_android_fontStyle;
        goto L10
    L5:
        weightAttr = R.styleable.FontFamilyFont_android_fontWeight;
        goto L6
    }

    private static void skip(XmlPullParser parser) throws XmlPullParserException, IOException {
        int depth = 1;
    L3:
        if (depth <= 0) goto L10;
        switch(parser.next()) {
            case 2: goto L8;
            case 3: goto L7;
            default: goto L3;
        };
    L7:
        depth = depth - 1;
        goto L3
    L8:
        depth = depth + 1;
        goto L3
    }

    private FontResourcesParserCompat() {
    }
}
