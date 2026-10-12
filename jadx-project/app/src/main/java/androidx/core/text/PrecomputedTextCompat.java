package androidx.core.text;

import android.os.Build;
import android.os.Trace;
import android.text.PrecomputedText;
import android.text.PrecomputedText$Params$Builder;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.MetricAffectingSpan;
import androidx.core.util.ObjectsCompat;
import androidx.core.util.Preconditions;
import java.util.ArrayList;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;

/* JADX INFO: loaded from: classes4.dex */
public class PrecomputedTextCompat implements Spannable {
    private static final char LINE_FEED = '\n';
    private static Executor sExecutor;
    private static final Object sLock = null;
    private final int[] mParagraphEnds;
    private final Params mParams;
    private final Spannable mText;
    private final PrecomputedText mWrapped;

    static class Api28Impl {
        private Api28Impl() {
        }

        static Spannable castToSpannable(PrecomputedText precomputedText) {
            return precomputedText;
        }
    }

    public static final class Params {
        private final int mBreakStrategy;
        private final int mHyphenationFrequency;
        private final TextPaint mPaint;
        private final TextDirectionHeuristic mTextDir;
        final PrecomputedText.Params mWrapped;

        public static class Builder {
            private int mBreakStrategy;
            private int mHyphenationFrequency;
            private final TextPaint mPaint;
            private TextDirectionHeuristic mTextDir;

            public Builder(TextPaint paint) {
                this.mPaint = paint;
                this.mBreakStrategy = 1;
                this.mHyphenationFrequency = 1;
                this.mTextDir = TextDirectionHeuristics.FIRSTSTRONG_LTR;
            }

            public Builder setBreakStrategy(int strategy) {
                this.mBreakStrategy = strategy;
                return this;
            }

            public Builder setHyphenationFrequency(int frequency) {
                this.mHyphenationFrequency = frequency;
                return this;
            }

            public Builder setTextDirection(TextDirectionHeuristic textDir) {
                this.mTextDir = textDir;
                return this;
            }

            public Params build() {
                return new Params(this.mPaint, this.mTextDir, this.mBreakStrategy, this.mHyphenationFrequency);
            }
        }

        Params(TextPaint paint, TextDirectionHeuristic textDir, int strategy, int frequency) {
            if (Build.VERSION.SDK_INT < 29) goto L5;
            this.mWrapped = new PrecomputedText$Params$Builder(paint).setBreakStrategy(strategy).setHyphenationFrequency(frequency).setTextDirection(textDir).build();
        L6:
            this.mPaint = paint;
            this.mTextDir = textDir;
            this.mBreakStrategy = strategy;
            this.mHyphenationFrequency = frequency;
            return;
        L5:
            this.mWrapped = null;
            goto L6
        }

        public Params(PrecomputedText.Params wrapped) {
            this.mPaint = wrapped.getTextPaint();
            this.mTextDir = wrapped.getTextDirection();
            this.mBreakStrategy = wrapped.getBreakStrategy();
            this.mHyphenationFrequency = wrapped.getHyphenationFrequency();
            if (Build.VERSION.SDK_INT < 29) goto L5;
            PrecomputedText.Params r0 = wrapped;
        L6:
            this.mWrapped = r0;
            return;
        L5:
            r0 = null;
            goto L6
        }

        public TextPaint getTextPaint() {
            return this.mPaint;
        }

        public TextDirectionHeuristic getTextDirection() {
            return this.mTextDir;
        }

        public int getBreakStrategy() {
            return this.mBreakStrategy;
        }

        public int getHyphenationFrequency() {
            return this.mHyphenationFrequency;
        }

        public boolean equalsWithoutTextDirection(Params other) {
            if (this.mBreakStrategy == other.getBreakStrategy()) goto L6;
            return false;
        L6:
            if (this.mHyphenationFrequency == other.getHyphenationFrequency()) goto L9;
            return false;
        L9:
            if (this.mPaint.getTextSize() == other.getTextPaint().getTextSize()) goto L12;
            return false;
        L12:
            if (this.mPaint.getTextScaleX() == other.getTextPaint().getTextScaleX()) goto L15;
            return false;
        L15:
            if (this.mPaint.getTextSkewX() == other.getTextPaint().getTextSkewX()) goto L18;
            return false;
        L18:
            if (this.mPaint.getLetterSpacing() == other.getTextPaint().getLetterSpacing()) goto L21;
            return false;
        L21:
            if (TextUtils.equals(this.mPaint.getFontFeatureSettings(), other.getTextPaint().getFontFeatureSettings()) == true) goto L24;
            return false;
        L24:
            if (this.mPaint.getFlags() == other.getTextPaint().getFlags()) goto L27;
            return false;
        L27:
            if (this.mPaint.getTextLocales().equals(other.getTextPaint().getTextLocales()) == true) goto L30;
            return false;
        L30:
            if (this.mPaint.getTypeface() != null) goto L35;
            if (other.getTextPaint().getTypeface() == null) goto L37;
            return false;
        L37:
            return true;
        L35:
            if (this.mPaint.getTypeface().equals(other.getTextPaint().getTypeface()) == true) goto L39;
            return false;
        L39:
            return true;
        }

        public boolean equals(Object o) {
            if (o != this) goto L6;
            return true;
        L6:
            if ((o instanceof Params) == true) goto L8;
            return false;
        L8:
            Params other = (Params) o;
            if (equalsWithoutTextDirection(other) == true) goto L12;
            return false;
        L12:
            if (this.mTextDir != other.getTextDirection()) goto L15;
            return true;
        L15:
            return false;
        }

        public int hashCode() {
            return ObjectsCompat.hash(new Object[]{Float.valueOf(this.mPaint.getTextSize()), Float.valueOf(this.mPaint.getTextScaleX()), Float.valueOf(this.mPaint.getTextSkewX()), Float.valueOf(this.mPaint.getLetterSpacing()), Integer.valueOf(this.mPaint.getFlags()), this.mPaint.getTextLocales(), this.mPaint.getTypeface(), Boolean.valueOf(this.mPaint.isElegantTextHeight()), this.mTextDir, Integer.valueOf(this.mBreakStrategy), Integer.valueOf(this.mHyphenationFrequency)});
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("{");
            sb.append("textSize=" + this.mPaint.getTextSize());
            sb.append(", textScaleX=" + this.mPaint.getTextScaleX());
            sb.append(", textSkewX=" + this.mPaint.getTextSkewX());
            sb.append(", letterSpacing=" + this.mPaint.getLetterSpacing());
            sb.append(", elegantTextHeight=" + this.mPaint.isElegantTextHeight());
            sb.append(", textLocale=" + this.mPaint.getTextLocales());
            sb.append(", typeface=" + this.mPaint.getTypeface());
            sb.append(", variationSettings=" + this.mPaint.getFontVariationSettings());
            sb.append(", textDir=" + this.mTextDir);
            sb.append(", breakStrategy=" + this.mBreakStrategy);
            sb.append(", hyphenationFrequency=" + this.mHyphenationFrequency);
            sb.append("}");
            return sb.toString();
        }
    }

    private static class PrecomputedTextFutureTask extends FutureTask<PrecomputedTextCompat> {

        private static class PrecomputedTextCallback implements Callable<PrecomputedTextCompat> {
            private Params mParams;
            private CharSequence mText;

            @Override // java.util.concurrent.Callable
            public /* bridge */ /* synthetic */ PrecomputedTextCompat call() throws Exception {
                return call();
            }

            PrecomputedTextCallback(Params params, CharSequence cs) {
                this.mParams = params;
                this.mText = cs;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // java.util.concurrent.Callable
            public PrecomputedTextCompat call() throws Exception {
                return PrecomputedTextCompat.create(this.mText, this.mParams);
            }
        }

        PrecomputedTextFutureTask(Params params, CharSequence text) {
            super(new PrecomputedTextCallback(params, text));
        }
    }

    static {
        sLock = new Object();
        sExecutor = null;
    }

    public static PrecomputedTextCompat create(CharSequence text, Params params) {
        Preconditions.checkNotNull(text);
        Preconditions.checkNotNull(params);
        Trace.beginSection("PrecomputedText");     // Catch: Throwable -> L24
        if (Build.VERSION.SDK_INT >= 29) goto L6;
    L10:
        ArrayList<Integer> ends = new ArrayList();     // Catch: Throwable -> L24
        int end = text.length();     // Catch: Throwable -> L24
        int paraStart = 0;
    L11:
        if (paraStart >= end) goto L17;
        int paraEnd = TextUtils.indexOf(text, LINE_FEED, paraStart, end);     // Catch: Throwable -> L24
        if (paraEnd >= 0) goto L15;
        int paraEnd2 = end;
    L16:
        ends.add(Integer.valueOf(paraEnd2));     // Catch: Throwable -> L24
        paraStart = paraEnd2;
        goto L11
    L15:
        paraEnd2 = paraEnd + 1;     // Catch: Throwable -> L24
        goto L16
    L17:
        int paraStart2 = ends.size();     // Catch: Throwable -> L24
        int[] result = new int[paraStart2];     // Catch: Throwable -> L24
        int i = 0;
    L19:
        if (i >= ends.size()) goto L21;
        result[i] = ends.get(i).intValue();     // Catch: Throwable -> L24
        i = i + 1;     // Catch: Throwable -> L24
        goto L19
    L21:
        StaticLayout.Builder.obtain(text, 0, text.length(), params.getTextPaint(), Integer.MAX_VALUE).setBreakStrategy(params.getBreakStrategy()).setHyphenationFrequency(params.getHyphenationFrequency()).setTextDirection(params.getTextDirection()).build();     // Catch: Throwable -> L24
        PrecomputedTextCompat r4 = new PrecomputedTextCompat(text, params, result);     // Catch: Throwable -> L24
        Trace.endSection();
        return r4;
    L6:
        if (params.mWrapped == null) goto L10;
        PrecomputedTextCompat r0 = new PrecomputedTextCompat(PrecomputedText.create(text, params.mWrapped), params);     // Catch: Throwable -> L24
        Trace.endSection();
        return r0;
    L24:
        th = move-exception;
        Trace.endSection();
        throw th;
    }

    private PrecomputedTextCompat(CharSequence text, Params params, int[] paraEnds) {
        this.mText = new SpannableString(text);
        this.mParams = params;
        this.mParagraphEnds = paraEnds;
        this.mWrapped = null;
    }

    private PrecomputedTextCompat(PrecomputedText precomputed, Params params) {
        this.mText = Api28Impl.castToSpannable(precomputed);
        this.mParams = params;
        PrecomputedText r0 = null;
        this.mParagraphEnds = null;
        if (Build.VERSION.SDK_INT < 29) goto L5;
        r0 = precomputed;
    L5:
        this.mWrapped = r0;
    }

    public PrecomputedText getPrecomputedText() {
        if ((this.mText instanceof PrecomputedText) == true) goto L5;
        return null;
    L5:
        return (PrecomputedText) this.mText;
    }

    public Params getParams() {
        return this.mParams;
    }

    public int getParagraphCount() {
        if (Build.VERSION.SDK_INT < 29) goto L7;
        return this.mWrapped.getParagraphCount();
    L7:
        return this.mParagraphEnds.length;
    }

    public int getParagraphStart(int paraIndex) {
        Preconditions.checkArgumentInRange(paraIndex, 0, getParagraphCount(), "paraIndex");
        if (Build.VERSION.SDK_INT >= 29) goto L5;
        if (paraIndex != 0) goto L9;
        return 0;
    L9:
        return this.mParagraphEnds[paraIndex - 1];
    L5:
        return this.mWrapped.getParagraphStart(paraIndex);
    }

    public int getParagraphEnd(int paraIndex) {
        Preconditions.checkArgumentInRange(paraIndex, 0, getParagraphCount(), "paraIndex");
        if (Build.VERSION.SDK_INT < 29) goto L7;
        return this.mWrapped.getParagraphEnd(paraIndex);
    L7:
        return this.mParagraphEnds[paraIndex];
    }

    public static Future<PrecomputedTextCompat> getTextFuture(CharSequence charSequence, Params params, Executor executor) {
        PrecomputedTextFutureTask task = new PrecomputedTextFutureTask(params, charSequence);
        if (executor != null) goto L15;
        Object r1 = sLock;
        monitor-enter(r1);
    L12:
        th = move-exception;
        throw th;
    L7:
        if (sExecutor != null) goto L9;
        sExecutor = Executors.newFixedThreadPool(1);     // Catch: Throwable -> L12
    L9:
        executor = sExecutor;     // Catch: Throwable -> L12
        monitor-exit(r1);     // Catch: Throwable -> L12
    L15:
        executor.execute(task);
        return task;
    }

    @Override // android.text.Spannable
    public void setSpan(Object what, int start, int end, int flags) {
        if ((what instanceof MetricAffectingSpan) == true) goto L10;
        if (Build.VERSION.SDK_INT < 29) goto L7;
        this.mWrapped.setSpan(what, start, end, flags);
        return;
    L7:
        this.mText.setSpan(what, start, end, flags);
        return;
    L10:
        throw new IllegalArgumentException("MetricAffectingSpan can not be set to PrecomputedText.");
    }

    @Override // android.text.Spannable
    public void removeSpan(Object what) {
        if ((what instanceof MetricAffectingSpan) == true) goto L10;
        if (Build.VERSION.SDK_INT < 29) goto L7;
        this.mWrapped.removeSpan(what);
        return;
    L7:
        this.mText.removeSpan(what);
        return;
    L10:
        throw new IllegalArgumentException("MetricAffectingSpan can not be removed from PrecomputedText.");
    }

    @Override // android.text.Spanned
    public <T> T[] getSpans(int r3, int r4, Class<T> r5) {
        if (Build.VERSION.SDK_INT < 29) goto L7;
        return (T[]) this.mWrapped.getSpans(r3, r4, r5);
    L7:
        return (T[]) this.mText.getSpans(r3, r4, r5);
    }

    @Override // android.text.Spanned
    public int getSpanStart(Object tag) {
        return this.mText.getSpanStart(tag);
    }

    @Override // android.text.Spanned
    public int getSpanEnd(Object tag) {
        return this.mText.getSpanEnd(tag);
    }

    @Override // android.text.Spanned
    public int getSpanFlags(Object tag) {
        return this.mText.getSpanFlags(tag);
    }

    @Override // android.text.Spanned
    public int nextSpanTransition(int start, int limit, Class type) {
        return this.mText.nextSpanTransition(start, limit, type);
    }

    @Override // java.lang.CharSequence
    public int length() {
        return this.mText.length();
    }

    @Override // java.lang.CharSequence
    public char charAt(int index) {
        return this.mText.charAt(index);
    }

    @Override // java.lang.CharSequence
    public CharSequence subSequence(int start, int end) {
        return this.mText.subSequence(start, end);
    }

    @Override // java.lang.CharSequence
    public String toString() {
        return this.mText.toString();
    }
}
