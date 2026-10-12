package androidx.compose.ui.text.android;

import android.text.SpannableString;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.MetricAffectingSpan;
import androidx.compose.ui.text.android.style.LetterSpacingSpanEm;
import androidx.compose.ui.text.android.style.LetterSpacingSpanPx;
import kotlin.Metadata;

/* JADX INFO: compiled from: LayoutIntrinsics.android.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a \u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0002\u001a\u0010\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\bH\u0002\"\u0014\u0010\u0000\u001a\u00020\u0001X\u0082D¢\u0006\b\n\u0000\u0012\u0004\b\u0002\u0010\u0003¨\u0006\f"}, d2 = {"stripNonMetricAffectingCharSpans", "", "getStripNonMetricAffectingCharSpans$annotations", "()V", "shouldIncreaseMaxIntrinsic", "desiredWidth", "", "charSequence", "", "textPaint", "Landroid/text/TextPaint;", "stripNonMetricAffectingCharacterStyleSpans", "ui-text_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class LayoutIntrinsics_androidKt {
    private static final boolean stripNonMetricAffectingCharSpans = false;

    public static final /* synthetic */ boolean access$getStripNonMetricAffectingCharSpans$p() {
        return stripNonMetricAffectingCharSpans;
    }

    public static final /* synthetic */ boolean access$shouldIncreaseMaxIntrinsic(float desiredWidth, CharSequence charSequence, TextPaint textPaint) {
        return shouldIncreaseMaxIntrinsic(desiredWidth, charSequence, textPaint);
    }

    public static final /* synthetic */ CharSequence access$stripNonMetricAffectingCharacterStyleSpans(CharSequence charSequence) {
        return stripNonMetricAffectingCharacterStyleSpans(charSequence);
    }

    private static /* synthetic */ void getStripNonMetricAffectingCharSpans$annotations() {
    }

    static {
        stripNonMetricAffectingCharSpans = true;
    }

    private static final CharSequence stripNonMetricAffectingCharacterStyleSpans(CharSequence charSequence) {
        if ((charSequence instanceof Spanned) == true) goto L5;
    L30:
        return charSequence;
    L5:
        if (SpannedExtensions_androidKt.hasSpan((Spanned) charSequence, CharacterStyle.class) == false) goto L30;
        int r3 = 0;
        CharacterStyle[] spans = (CharacterStyle[]) ((Spanned) charSequence).getSpans(0, charSequence.length(), CharacterStyle.class);
        boolean r1 = true;
        if (spans != null) goto L10;
    L16:
        if (r1 == false) goto L18;
        return charSequence;
    L18:
        SpannableString spannableString = null;
        int r2 = spans.length;
    L19:
        if (r3 >= r2) goto L26;
        CharacterStyle span = spans[r3];
        if ((span instanceof MetricAffectingSpan) == true) goto L25;
        if (spannableString != null) goto L24;
        spannableString = new SpannableString(charSequence);
    L24:
        spannableString.removeSpan(span);
    L25:
        r3 = r3 + 1;
        goto L19
    L26:
        if (spannableString == null) goto L29;
        return spannableString;
    L29:
        return charSequence;
    L10:
        if (spans.length != 0) goto L12;
        boolean r4 = true;
    L13:
        if (r4 == true) goto L16;
        r1 = false;
        goto L16
    L12:
        r4 = false;
        goto L13
    }

    private static final boolean shouldIncreaseMaxIntrinsic(float desiredWidth, CharSequence charSequence, TextPaint textPaint) {
        if (desiredWidth != 0.0f) goto L5;
        boolean r1 = true;
    L6:
        if (r1 == true) goto L20;
        if ((charSequence instanceof Spanned) == false) goto L14;
        if (SpannedExtensions_androidKt.hasSpan((Spanned) charSequence, LetterSpacingSpanPx.class) == false) goto L12;
        return true;
    L12:
        if (SpannedExtensions_androidKt.hasSpan((Spanned) charSequence, LetterSpacingSpanEm.class) == false) goto L14;
        return true;
    L14:
        if (textPaint.getLetterSpacing() != 0.0f) goto L16;
        boolean r0 = true;
    L17:
        if (r0 == true) goto L20;
        return true;
    L16:
        r0 = false;
    L20:
        return false;
    L5:
        r1 = false;
        goto L6
    }
}
