package androidx.core.text;

import android.text.SpannableStringBuilder;
import java.util.Locale;
import kotlin.text.Typography;

/* JADX INFO: loaded from: classes4.dex */
public final class BidiFormatter {
    private static final int DEFAULT_FLAGS = 2;
    static final BidiFormatter DEFAULT_LTR_INSTANCE = null;
    static final BidiFormatter DEFAULT_RTL_INSTANCE = null;
    static final TextDirectionHeuristicCompat DEFAULT_TEXT_DIRECTION_HEURISTIC = null;
    private static final int DIR_LTR = -1;
    private static final int DIR_RTL = 1;
    private static final int DIR_UNKNOWN = 0;
    private static final String EMPTY_STRING = "";
    private static final int FLAG_STEREO_RESET = 2;
    private static final char LRE = 8234;
    private static final char LRM = 8206;
    private static final String LRM_STRING = null;
    private static final char PDF = 8236;
    private static final char RLE = 8235;
    private static final char RLM = 8207;
    private static final String RLM_STRING = null;
    private final TextDirectionHeuristicCompat mDefaultTextDirectionHeuristicCompat;
    private final int mFlags;
    private final boolean mIsRtlContext;

    public static final class Builder {
        private int mFlags;
        private boolean mIsRtlContext;
        private TextDirectionHeuristicCompat mTextDirectionHeuristicCompat;

        public Builder() {
            initialize(BidiFormatter.isRtlLocale(Locale.getDefault()));
        }

        public Builder(boolean rtlContext) {
            initialize(rtlContext);
        }

        public Builder(Locale locale) {
            initialize(BidiFormatter.isRtlLocale(locale));
        }

        private void initialize(boolean isRtlContext) {
            this.mIsRtlContext = isRtlContext;
            this.mTextDirectionHeuristicCompat = BidiFormatter.DEFAULT_TEXT_DIRECTION_HEURISTIC;
            this.mFlags = 2;
        }

        public Builder stereoReset(boolean stereoReset) {
            int r0 = this.mFlags;
            if (stereoReset == false) goto L5;
            this.mFlags = r0 | 2;
        L6:
            return this;
        L5:
            this.mFlags = r0 & (-3);
            goto L6
        }

        public Builder setTextDirectionHeuristic(TextDirectionHeuristicCompat heuristic) {
            this.mTextDirectionHeuristicCompat = heuristic;
            return this;
        }

        private static BidiFormatter getDefaultInstanceFromContext(boolean isRtlContext) {
            if (isRtlContext == false) goto L5;
            return BidiFormatter.DEFAULT_RTL_INSTANCE;
        L5:
            return BidiFormatter.DEFAULT_LTR_INSTANCE;
        }

        public BidiFormatter build() {
            if (this.mFlags != 2) goto L9;
            if (this.mTextDirectionHeuristicCompat != BidiFormatter.DEFAULT_TEXT_DIRECTION_HEURISTIC) goto L9;
            return getDefaultInstanceFromContext(this.mIsRtlContext);
        L9:
            return new BidiFormatter(this.mIsRtlContext, this.mFlags, this.mTextDirectionHeuristicCompat);
        }
    }

    private static class DirectionalityEstimator {
        private static final byte[] DIR_TYPE_CACHE = null;
        private static final int DIR_TYPE_CACHE_SIZE = 1792;
        private int charIndex;
        private final boolean isHtml;
        private char lastChar;
        private final int length;
        private final CharSequence text;

        static {
            DIR_TYPE_CACHE = new byte[DIR_TYPE_CACHE_SIZE];
            int i = 0;
        L3:
            if (i >= DIR_TYPE_CACHE_SIZE) goto L5;
            DIR_TYPE_CACHE[i] = Character.getDirectionality(i);
            i = i + 1;
            goto L3
        }

        DirectionalityEstimator(CharSequence text, boolean isHtml) {
            this.text = text;
            this.isHtml = isHtml;
            this.length = text.length();
        }

        int getEntryDir() {
            this.charIndex = 0;
            int embeddingLevel = 0;
            int embeddingLevelDir = 0;
            int firstNonEmptyEmbeddingLevel = 0;
        L4:
            if (this.charIndex >= this.length) goto L19;
            if (firstNonEmptyEmbeddingLevel != 0) goto L19;
            switch(dirTypeForward()) {
                case 0: goto L16;
                case 1: goto L13;
                case 2: goto L13;
                case 9: goto L4;
                case 14: goto L11;
                case 15: goto L11;
                case 16: goto L10;
                case 17: goto L10;
                case 18: goto L9;
                default: goto L8;
            };
        L8:
            firstNonEmptyEmbeddingLevel = embeddingLevel;
            goto L4
        L9:
            embeddingLevel = embeddingLevel - 1;
            embeddingLevelDir = 0;
            goto L4
        L10:
            embeddingLevel = embeddingLevel + 1;
            embeddingLevelDir = 1;
            goto L4
        L11:
            embeddingLevel = embeddingLevel + 1;
            embeddingLevelDir = -1;
            goto L4
        L13:
            if (embeddingLevel == 0) goto L14;
            firstNonEmptyEmbeddingLevel = embeddingLevel;
            goto L4
        L14:
            return 1;
        L16:
            if (embeddingLevel == 0) goto L17;
            firstNonEmptyEmbeddingLevel = embeddingLevel;
            goto L4
        L17:
            return -1;
        L19:
            if (firstNonEmptyEmbeddingLevel != 0) goto L21;
            return 0;
        L21:
            if (embeddingLevelDir == 0) goto L24;
            return embeddingLevelDir;
        L24:
            if (this.charIndex <= 0) goto L36;
            switch(dirTypeBackward()) {
                case 14: goto L32;
                case 15: goto L32;
                case 16: goto L29;
                case 17: goto L29;
                case 18: goto L28;
                default: goto L24;
            };
        L28:
            embeddingLevel = embeddingLevel + 1;
            goto L24
        L29:
            if (firstNonEmptyEmbeddingLevel == embeddingLevel) goto L30;
            embeddingLevel = embeddingLevel - 1;
            goto L24
        L30:
            return 1;
        L32:
            if (firstNonEmptyEmbeddingLevel == embeddingLevel) goto L33;
            embeddingLevel = embeddingLevel - 1;
            goto L24
        L33:
            return -1;
        L36:
            return 0;
        }

        int getExitDir() {
            this.charIndex = this.length;
            int embeddingLevel = 0;
            int lastNonEmptyEmbeddingLevel = 0;
        L4:
            if (this.charIndex <= 0) goto L25;
            switch(dirTypeBackward()) {
                case 0: goto L21;
                case 1: goto L17;
                case 2: goto L17;
                case 9: goto L4;
                case 14: goto L13;
                case 15: goto L13;
                case 16: goto L10;
                case 17: goto L10;
                case 18: goto L9;
                default: goto L7;
            };
        L7:
            if (lastNonEmptyEmbeddingLevel != 0) goto L4;
            lastNonEmptyEmbeddingLevel = embeddingLevel;
            goto L4
        L9:
            embeddingLevel = embeddingLevel + 1;
            goto L4
        L10:
            if (lastNonEmptyEmbeddingLevel == embeddingLevel) goto L11;
            embeddingLevel = embeddingLevel - 1;
            goto L4
        L11:
            return 1;
        L13:
            if (lastNonEmptyEmbeddingLevel == embeddingLevel) goto L14;
            embeddingLevel = embeddingLevel - 1;
            goto L4
        L14:
            return -1;
        L17:
            if (embeddingLevel == 0) goto L18;
            if (lastNonEmptyEmbeddingLevel != 0) goto L4;
            lastNonEmptyEmbeddingLevel = embeddingLevel;
            goto L4
        L18:
            return 1;
        L21:
            if (embeddingLevel == 0) goto L22;
            if (lastNonEmptyEmbeddingLevel != 0) goto L4;
            lastNonEmptyEmbeddingLevel = embeddingLevel;
            goto L4
        L22:
            return -1;
        L25:
            return 0;
        }

        private static byte getCachedDirectionality(char c) {
            if (c >= DIR_TYPE_CACHE_SIZE) goto L6;
            return DIR_TYPE_CACHE[c];
        L6:
            return Character.getDirectionality(c);
        }

        byte dirTypeForward() {
            this.lastChar = this.text.charAt(this.charIndex);
            if (Character.isHighSurrogate(this.lastChar) == false) goto L6;
            int codePoint = Character.codePointAt(this.text, this.charIndex);
            this.charIndex += Character.charCount(codePoint);
            return Character.getDirectionality(codePoint);
        L6:
            this.charIndex++;
            byte dirType = getCachedDirectionality(this.lastChar);
            if (this.isHtml == true) goto L9;
            return dirType;
        L9:
            if (this.lastChar != '<') goto L12;
            return skipTagForward();
        L12:
            if (this.lastChar == '&') goto L14;
            return dirType;
        L14:
            return skipEntityForward();
        }

        byte dirTypeBackward() {
            this.lastChar = this.text.charAt(this.charIndex - 1);
            if (Character.isLowSurrogate(this.lastChar) == false) goto L6;
            int codePoint = Character.codePointBefore(this.text, this.charIndex);
            this.charIndex -= Character.charCount(codePoint);
            return Character.getDirectionality(codePoint);
        L6:
            this.charIndex--;
            byte dirType = getCachedDirectionality(this.lastChar);
            if (this.isHtml == true) goto L9;
            return dirType;
        L9:
            if (this.lastChar != '>') goto L12;
            return skipTagBackward();
        L12:
            if (this.lastChar == ';') goto L14;
            return dirType;
        L14:
            return skipEntityBackward();
        }

        private byte skipTagForward() {
            int initialCharIndex = this.charIndex;
        L4:
            if (this.charIndex >= this.length) goto L20;
            CharSequence r1 = this.text;
            int r2 = this.charIndex;
            this.charIndex = r2 + 1;
            this.lastChar = r1.charAt(r2);
            if (this.lastChar == '>') goto L7;
            if (this.lastChar == '\"') goto L13;
            if (this.lastChar != '\'') goto L4;
        L13:
            char quote = this.lastChar;
        L15:
            if (this.charIndex >= this.length) goto L4;
            CharSequence r3 = this.text;
            int r4 = this.charIndex;
            this.charIndex = r4 + 1;
            char r5 = r3.charAt(r4);
            this.lastChar = r5;
            if (r5 == quote) goto L4;
        L7:
            return 12;
        L20:
            this.charIndex = initialCharIndex;
            this.lastChar = Typography.less;
            return 13;
        }

        private byte skipTagBackward() {
            int initialCharIndex = this.charIndex;
        L4:
            if (this.charIndex <= 0) goto L23;
            CharSequence r1 = this.text;
            int r3 = this.charIndex - 1;
            this.charIndex = r3;
            this.lastChar = r1.charAt(r3);
            if (this.lastChar == '<') goto L7;
            if (this.lastChar == '>') goto L23;
            if (this.lastChar == '\"') goto L16;
            if (this.lastChar != '\'') goto L4;
        L16:
            char quote = this.lastChar;
        L18:
            if (this.charIndex <= 0) goto L4;
            CharSequence r2 = this.text;
            int r4 = this.charIndex - 1;
            this.charIndex = r4;
            char r5 = r2.charAt(r4);
            this.lastChar = r5;
            if (r5 == quote) goto L4;
        L7:
            return 12;
        L23:
            this.charIndex = initialCharIndex;
            this.lastChar = Typography.greater;
            return 13;
        }

        private byte skipEntityForward() {
        L3:
            if (this.charIndex >= this.length) goto L7;
            CharSequence r0 = this.text;
            int r1 = this.charIndex;
            this.charIndex = r1 + 1;
            char r2 = r0.charAt(r1);
            this.lastChar = r2;
            if (r2 != ';') goto L3;
            return 12;
        L7:
            return 12;
        }

        private byte skipEntityBackward() {
            int initialCharIndex = this.charIndex;
        L4:
            if (this.charIndex <= 0) goto L11;
            CharSequence r1 = this.text;
            int r3 = this.charIndex - 1;
            this.charIndex = r3;
            this.lastChar = r1.charAt(r3);
            if (this.lastChar == '&') goto L7;
            if (this.lastChar != ';') goto L4;
        L7:
            return 12;
        L11:
            this.charIndex = initialCharIndex;
            this.lastChar = ';';
            return 13;
        }
    }

    static {
        DEFAULT_TEXT_DIRECTION_HEURISTIC = TextDirectionHeuristicsCompat.FIRSTSTRONG_LTR;
        LRM_STRING = Character.toString(LRM);
        RLM_STRING = Character.toString(RLM);
        DEFAULT_LTR_INSTANCE = new BidiFormatter(false, 2, DEFAULT_TEXT_DIRECTION_HEURISTIC);
        DEFAULT_RTL_INSTANCE = new BidiFormatter(true, 2, DEFAULT_TEXT_DIRECTION_HEURISTIC);
    }

    public static BidiFormatter getInstance() {
        return new Builder().build();
    }

    public static BidiFormatter getInstance(boolean rtlContext) {
        return new Builder(rtlContext).build();
    }

    public static BidiFormatter getInstance(Locale locale) {
        return new Builder(locale).build();
    }

    BidiFormatter(boolean isRtlContext, int flags, TextDirectionHeuristicCompat heuristic) {
        this.mIsRtlContext = isRtlContext;
        this.mFlags = flags;
        this.mDefaultTextDirectionHeuristicCompat = heuristic;
    }

    public boolean isRtlContext() {
        return this.mIsRtlContext;
    }

    public boolean getStereoReset() {
        if ((this.mFlags & 2) == 0) goto L5;
        return true;
    L5:
        return false;
    }

    private String markAfter(CharSequence str, TextDirectionHeuristicCompat heuristic) {
        boolean isRtl = heuristic.isRtl(str, 0, str.length());
        if (this.mIsRtlContext == true) goto L10;
        if (isRtl == true) goto L8;
        if (getExitDir(str) != 1) goto L10;
    L8:
        return LRM_STRING;
    L10:
        if (this.mIsRtlContext == false) goto L16;
        if (isRtl == false) goto L15;
        if (getExitDir(str) == (-1)) goto L15;
        return "";
    L15:
        return RLM_STRING;
    L16:
        return "";
    }

    private String markBefore(CharSequence str, TextDirectionHeuristicCompat heuristic) {
        boolean isRtl = heuristic.isRtl(str, 0, str.length());
        if (this.mIsRtlContext == true) goto L10;
        if (isRtl == true) goto L8;
        if (getEntryDir(str) != 1) goto L10;
    L8:
        return LRM_STRING;
    L10:
        if (this.mIsRtlContext == false) goto L16;
        if (isRtl == false) goto L15;
        if (getEntryDir(str) == (-1)) goto L15;
        return "";
    L15:
        return RLM_STRING;
    L16:
        return "";
    }

    public boolean isRtl(String str) {
        return isRtl(str);
    }

    public boolean isRtl(CharSequence str) {
        return this.mDefaultTextDirectionHeuristicCompat.isRtl(str, 0, str.length());
    }

    public String unicodeWrap(String str, TextDirectionHeuristicCompat heuristic, boolean isolate) {
        if (str != null) goto L6;
        return null;
    L6:
        return unicodeWrap(str, heuristic, isolate).toString();
    }

    public CharSequence unicodeWrap(CharSequence str, TextDirectionHeuristicCompat heuristic, boolean isolate) {
        if (str != null) goto L5;
        return null;
    L5:
        boolean isRtl = heuristic.isRtl(str, 0, str.length());
        SpannableStringBuilder result = new SpannableStringBuilder();
        if (getStereoReset() == false) goto L13;
        if (isolate == false) goto L13;
        if (isRtl == false) goto L10;
        TextDirectionHeuristicCompat r2 = TextDirectionHeuristicsCompat.RTL;
    L11:
        result.append(markBefore(str, r2));
        goto L13
    L10:
        r2 = TextDirectionHeuristicsCompat.LTR;
    L13:
        if (isRtl == this.mIsRtlContext) goto L18;
        if (isRtl == false) goto L16;
        char r3 = RLE;
    L17:
        result.append(r3);
        result.append(str);
        result.append(PDF);
    L19:
        if (isolate == false) goto L24;
        if (isRtl == false) goto L22;
        TextDirectionHeuristicCompat r4 = TextDirectionHeuristicsCompat.RTL;
    L23:
        result.append(markAfter(str, r4));
        goto L24
    L22:
        r4 = TextDirectionHeuristicsCompat.LTR;
    L24:
        return result;
    L16:
        r3 = LRE;
        goto L17
    L18:
        result.append(str);
        goto L19
    }

    public String unicodeWrap(String str, TextDirectionHeuristicCompat heuristic) {
        return unicodeWrap(str, heuristic, true);
    }

    public CharSequence unicodeWrap(CharSequence str, TextDirectionHeuristicCompat heuristic) {
        return unicodeWrap(str, heuristic, true);
    }

    public String unicodeWrap(String str, boolean isolate) {
        return unicodeWrap(str, this.mDefaultTextDirectionHeuristicCompat, isolate);
    }

    public CharSequence unicodeWrap(CharSequence str, boolean isolate) {
        return unicodeWrap(str, this.mDefaultTextDirectionHeuristicCompat, isolate);
    }

    public String unicodeWrap(String str) {
        return unicodeWrap(str, this.mDefaultTextDirectionHeuristicCompat, true);
    }

    public CharSequence unicodeWrap(CharSequence str) {
        return unicodeWrap(str, this.mDefaultTextDirectionHeuristicCompat, true);
    }

    static boolean isRtlLocale(Locale locale) {
        if (TextUtilsCompat.getLayoutDirectionFromLocale(locale) == 1) goto L7;
        return false;
    L7:
        return true;
    }

    private static int getExitDir(CharSequence str) {
        return new DirectionalityEstimator(str, false).getExitDir();
    }

    private static int getEntryDir(CharSequence str) {
        return new DirectionalityEstimator(str, false).getEntryDir();
    }
}
