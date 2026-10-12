package androidx.core.text;

import java.nio.CharBuffer;
import java.util.Locale;

/* JADX INFO: loaded from: classes4.dex */
public final class TextDirectionHeuristicsCompat {
    public static final TextDirectionHeuristicCompat ANYRTL_LTR = null;
    public static final TextDirectionHeuristicCompat FIRSTSTRONG_LTR = null;
    public static final TextDirectionHeuristicCompat FIRSTSTRONG_RTL = null;
    public static final TextDirectionHeuristicCompat LOCALE = null;
    public static final TextDirectionHeuristicCompat LTR = null;
    public static final TextDirectionHeuristicCompat RTL = null;
    private static final int STATE_FALSE = 1;
    private static final int STATE_TRUE = 0;
    private static final int STATE_UNKNOWN = 2;

    private static class AnyStrong implements TextDirectionAlgorithm {
        static final AnyStrong INSTANCE_RTL = null;
        private final boolean mLookForRtl;

        @Override // androidx.core.text.TextDirectionHeuristicsCompat.TextDirectionAlgorithm
        public int checkRtl(CharSequence r5, int r6, int r7) {
            boolean r0 = false;
            int r1 = r6;
            int r2 = r6 + r7;
        L3:
            if (r1 >= r2) goto L18;
            switch(TextDirectionHeuristicsCompat.isRtlText(Character.getDirectionality(r5.charAt(r1)))) {
                case 0: goto L13;
                case 1: goto L8;
                default: goto L17;
            };
        L8:
            if (this.mLookForRtl == false) goto L9;
            r0 = true;
            goto L17
        L9:
            return 1;
        L13:
            if (this.mLookForRtl == true) goto L14;
            r0 = true;
            goto L17
        L14:
            return 0;
        L17:
            r1 = r1 + 1;
            goto L3
        L18:
            if (r0 == true) goto L20;
            return 2;
        L20:
            return this.mLookForRtl ? 1 : 0;
        }

        private AnyStrong(boolean lookForRtl) {
            this.mLookForRtl = lookForRtl;
        }

        static {
            INSTANCE_RTL = new AnyStrong(true);
        }
    }

    private static class FirstStrong implements TextDirectionAlgorithm {
        static final FirstStrong INSTANCE = null;

        @Override // androidx.core.text.TextDirectionHeuristicsCompat.TextDirectionAlgorithm
        public int checkRtl(CharSequence cs, int start, int count) {
            int result = 2;
            int i = start;
            int e = start + count;
        L3:
            if (i >= e) goto L7;
            if (result != 2) goto L7;
            result = TextDirectionHeuristicsCompat.isRtlTextOrFormat(Character.getDirectionality(cs.charAt(i)));
            i = i + 1;
        L7:
            return result;
        }

        private FirstStrong() {
        }

        static {
            INSTANCE = new FirstStrong();
        }
    }

    private interface TextDirectionAlgorithm {
        int checkRtl(CharSequence r1, int r2, int r3);
    }

    private static abstract class TextDirectionHeuristicImpl implements TextDirectionHeuristicCompat {
        private final TextDirectionAlgorithm mAlgorithm;

        protected abstract boolean defaultIsRtl();

        TextDirectionHeuristicImpl(TextDirectionAlgorithm algorithm) {
            this.mAlgorithm = algorithm;
        }

        @Override // androidx.core.text.TextDirectionHeuristicCompat
        public boolean isRtl(char[] array, int start, int count) {
            return isRtl(CharBuffer.wrap(array), start, count);
        }

        @Override // androidx.core.text.TextDirectionHeuristicCompat
        public boolean isRtl(CharSequence cs, int start, int count) {
            if (cs == null) goto L14;
            if (start < 0) goto L14;
            if (count < 0) goto L14;
            if ((cs.length() - count) < start) goto L14;
            if (this.mAlgorithm != null) goto L12;
            return defaultIsRtl();
        L12:
            return doCheck(cs, start, count);
        L14:
            throw new IllegalArgumentException();
        }

        private boolean doCheck(CharSequence cs, int start, int count) {
            switch(this.mAlgorithm.checkRtl(cs, start, count)) {
                case 0: goto L8;
                case 1: goto L6;
                default: goto L5;
            };
        L6:
            return false;
        L8:
            return true;
        L5:
            return defaultIsRtl();
        }
    }

    private static class TextDirectionHeuristicInternal extends TextDirectionHeuristicImpl {
        private final boolean mDefaultIsRtl;

        TextDirectionHeuristicInternal(TextDirectionAlgorithm algorithm, boolean defaultIsRtl) {
            super(algorithm);
            this.mDefaultIsRtl = defaultIsRtl;
        }

        @Override // androidx.core.text.TextDirectionHeuristicsCompat.TextDirectionHeuristicImpl
        protected boolean defaultIsRtl() {
            return this.mDefaultIsRtl;
        }
    }

    private static class TextDirectionHeuristicLocale extends TextDirectionHeuristicImpl {
        static final TextDirectionHeuristicLocale INSTANCE = null;

        TextDirectionHeuristicLocale() {
            super(null);
        }

        @Override // androidx.core.text.TextDirectionHeuristicsCompat.TextDirectionHeuristicImpl
        protected boolean defaultIsRtl() {
            int dir = TextUtilsCompat.getLayoutDirectionFromLocale(Locale.getDefault());
            if (dir == 1) goto L7;
            return false;
        L7:
            return true;
        }

        static {
            INSTANCE = new TextDirectionHeuristicLocale();
        }
    }

    static {
        LTR = new TextDirectionHeuristicInternal(null, false);
        RTL = new TextDirectionHeuristicInternal(null, true);
        FIRSTSTRONG_LTR = new TextDirectionHeuristicInternal(FirstStrong.INSTANCE, false);
        FIRSTSTRONG_RTL = new TextDirectionHeuristicInternal(FirstStrong.INSTANCE, true);
        ANYRTL_LTR = new TextDirectionHeuristicInternal(AnyStrong.INSTANCE_RTL, false);
        LOCALE = TextDirectionHeuristicLocale.INSTANCE;
    }

    static int isRtlText(int directionality) {
        switch(directionality) {
            case 0: goto L7;
            case 1: goto L5;
            case 2: goto L5;
            default: goto L3;
        };
    L3:
        return 2;
    L5:
        return 0;
    L7:
        return 1;
    }

    static int isRtlTextOrFormat(int directionality) {
        switch(directionality) {
            case 0: goto L7;
            case 1: goto L5;
            case 2: goto L5;
            case 14: goto L7;
            case 15: goto L7;
            case 16: goto L5;
            case 17: goto L5;
            default: goto L3;
        };
    L3:
        return 2;
    L5:
        return 0;
    L7:
        return 1;
    }

    private TextDirectionHeuristicsCompat() {
    }
}
