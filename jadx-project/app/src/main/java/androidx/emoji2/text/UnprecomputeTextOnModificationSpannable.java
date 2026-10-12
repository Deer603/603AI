package androidx.emoji2.text;

import android.os.Build;
import android.text.PrecomputedText;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.Spanned;
import androidx.core.text.PrecomputedTextCompat;
import java.util.stream.IntStream;

/* JADX INFO: loaded from: classes4.dex */
class UnprecomputeTextOnModificationSpannable implements Spannable {
    private Spannable mDelegate;
    private boolean mSafeToWrite;

    private static class CharSequenceHelper_API24 {
        private CharSequenceHelper_API24() {
        }

        static IntStream codePoints(CharSequence charSequence) {
            return charSequence.codePoints();
        }

        static IntStream chars(CharSequence charSequence) {
            return charSequence.chars();
        }
    }

    static class PrecomputedTextDetector {
        PrecomputedTextDetector() {
        }

        boolean isPrecomputedText(CharSequence text) {
            return text instanceof PrecomputedTextCompat;
        }
    }

    static class PrecomputedTextDetector_28 extends PrecomputedTextDetector {
        PrecomputedTextDetector_28() {
        }

        @Override // androidx.emoji2.text.UnprecomputeTextOnModificationSpannable.PrecomputedTextDetector
        boolean isPrecomputedText(CharSequence text) {
            if ((text instanceof PrecomputedText) == false) goto L5;
        L8:
            return true;
        L5:
            if ((text instanceof PrecomputedTextCompat) == true) goto L8;
            return false;
        }
    }

    UnprecomputeTextOnModificationSpannable(Spannable delegate) {
        this.mSafeToWrite = false;
        this.mDelegate = delegate;
    }

    UnprecomputeTextOnModificationSpannable(Spanned delegate) {
        this.mSafeToWrite = false;
        this.mDelegate = new SpannableString(delegate);
    }

    UnprecomputeTextOnModificationSpannable(CharSequence delegate) {
        this.mSafeToWrite = false;
        this.mDelegate = new SpannableString(delegate);
    }

    private void ensureSafeWrites() {
        Spannable old = this.mDelegate;
        if (this.mSafeToWrite == false) goto L5;
    L7:
        this.mSafeToWrite = true;
        return;
    L5:
        if (precomputedTextDetector().isPrecomputedText(old) == false) goto L7;
        this.mDelegate = new SpannableString(old);
        goto L7
    }

    Spannable getUnwrappedSpannable() {
        return this.mDelegate;
    }

    @Override // android.text.Spannable
    public void setSpan(Object o, int i, int i1, int i2) {
        ensureSafeWrites();
        this.mDelegate.setSpan(o, i, i1, i2);
    }

    @Override // android.text.Spannable
    public void removeSpan(Object o) {
        ensureSafeWrites();
        this.mDelegate.removeSpan(o);
    }

    @Override // android.text.Spanned
    public <T> T[] getSpans(int r2, int r3, Class<T> r4) {
        return (T[]) this.mDelegate.getSpans(r2, r3, r4);
    }

    @Override // android.text.Spanned
    public int getSpanStart(Object o) {
        return this.mDelegate.getSpanStart(o);
    }

    @Override // android.text.Spanned
    public int getSpanEnd(Object o) {
        return this.mDelegate.getSpanEnd(o);
    }

    @Override // android.text.Spanned
    public int getSpanFlags(Object o) {
        return this.mDelegate.getSpanFlags(o);
    }

    @Override // android.text.Spanned
    public int nextSpanTransition(int i, int i1, Class aClass) {
        return this.mDelegate.nextSpanTransition(i, i1, aClass);
    }

    @Override // java.lang.CharSequence
    public int length() {
        return this.mDelegate.length();
    }

    @Override // java.lang.CharSequence
    public char charAt(int i) {
        return this.mDelegate.charAt(i);
    }

    @Override // java.lang.CharSequence
    public CharSequence subSequence(int i, int i1) {
        return this.mDelegate.subSequence(i, i1);
    }

    @Override // java.lang.CharSequence
    public String toString() {
        return this.mDelegate.toString();
    }

    @Override // java.lang.CharSequence
    public IntStream chars() {
        return CharSequenceHelper_API24.chars(this.mDelegate);
    }

    @Override // java.lang.CharSequence
    public IntStream codePoints() {
        return CharSequenceHelper_API24.codePoints(this.mDelegate);
    }

    static PrecomputedTextDetector precomputedTextDetector() {
        if (Build.VERSION.SDK_INT >= 28) goto L6;
        return new PrecomputedTextDetector();
    L6:
        return new PrecomputedTextDetector_28();
    }
}
