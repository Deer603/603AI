package androidx.compose.ui.text.android.selection;

import androidx.compose.ui.text.android.CharSequenceCharacterIterator;
import androidx.compose.ui.text.internal.InlineClassHelperKt;
import androidx.emoji2.text.EmojiCompat;
import java.text.BreakIterator;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: WordIterator.android.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0000\u0018\u0000 \"2\u00020\u0001:\u0001\"B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0002\u0010\tJ\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0005H\u0002J\u0018\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u0012\u001a\u00020\u0013H\u0002J\u0018\u0010\u0014\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u0015\u001a\u00020\u0013H\u0002J\u000e\u0010\u0015\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u0005J\u000e\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u0005J\u000e\u0010\u0016\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u0005J\u000e\u0010\u0017\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u0005J\u0010\u0010\u0018\u001a\u00020\u00132\u0006\u0010\u0010\u001a\u00020\u0005H\u0002J\u000e\u0010\u0019\u001a\u00020\u00132\u0006\u0010\u0010\u001a\u00020\u0005J\u0010\u0010\u001a\u001a\u00020\u00132\u0006\u0010\u0010\u001a\u00020\u0005H\u0002J\u0010\u0010\u001b\u001a\u00020\u00132\u0006\u0010\u0010\u001a\u00020\u0005H\u0002J\u0010\u0010\u001c\u001a\u00020\u00132\u0006\u0010\u0010\u001a\u00020\u0005H\u0002J\u000e\u0010\u001d\u001a\u00020\u00132\u0006\u0010\u0010\u001a\u00020\u0005J\u0010\u0010\u001e\u001a\u00020\u00132\u0006\u0010\u0010\u001a\u00020\u0005H\u0002J\u0010\u0010\u001f\u001a\u00020\u00132\u0006\u0010\u0010\u001a\u00020\u0005H\u0002J\u000e\u0010 \u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u0005J\u000e\u0010!\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u000e\u0010\u0006\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006#"}, d2 = {"Landroidx/compose/ui/text/android/selection/WordIterator;", "", "charSequence", "", "start", "", "end", "locale", "Ljava/util/Locale;", "(Ljava/lang/CharSequence;IILjava/util/Locale;)V", "getCharSequence", "()Ljava/lang/CharSequence;", "iterator", "Ljava/text/BreakIterator;", "checkOffsetIsValid", "", "offset", "getBeginning", "getPrevWordBeginningOnTwoWordsBoundary", "", "getEnd", "getNextWordEndOnTwoWordBoundary", "getPunctuationBeginning", "getPunctuationEnd", "isAfterLetterOrDigitOrEmoji", "isAfterPunctuation", "isBoundary", "isHiraganaKatakanaBoundary", "isOnLetterOrDigitOrEmoji", "isOnPunctuation", "isPunctuationEndBoundary", "isPunctuationStartBoundary", "nextBoundary", "prevBoundary", "Companion", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class WordIterator {
    public static final int $stable = 0;
    public static final Companion Companion = null;
    private static final int WINDOW_WIDTH = 50;
    private final CharSequence charSequence;
    private final int end;
    private final BreakIterator iterator;
    private final int start;

    /* JADX INFO: compiled from: WordIterator.android.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0015\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0004H\u0000¢\u0006\u0002\b\bR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Landroidx/compose/ui/text/android/selection/WordIterator$Companion;", "", "()V", "WINDOW_WIDTH", "", "isPunctuation", "", "cp", "isPunctuation$ui_text_release", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker r1) {
            this();
        }

        private Companion() {
        }

        public final boolean isPunctuation$ui_text_release(int cp) {
            int type = Character.getType(cp);
            if (type != 23) goto L5;
        L18:
            return true;
        L5:
            if (type == 20) goto L18;
            if (type == 22) goto L18;
            if (type == 30) goto L18;
            if (type == 29) goto L18;
            if (type == 24) goto L18;
            if (type == 21) goto L18;
            return false;
        }
    }

    static {
        Companion = new Companion(null);
        $stable = 8;
    }

    public WordIterator(CharSequence charSequence, int start, int end, Locale locale) {
        this.charSequence = charSequence;
        boolean value$iv = true;
        if (start >= 0) goto L5;
    L7:
        boolean value$iv2 = false;
    L9:
        if (value$iv2 == true) goto L12;
        InlineClassHelperKt.throwIllegalArgumentException("input start index is outside the CharSequence");
    L12:
        if (end >= 0) goto L14;
    L16:
        value$iv = false;
    L18:
        if (value$iv == true) goto L20;
        InlineClassHelperKt.throwIllegalArgumentException("input end index is outside the CharSequence");
    L20:
        this.iterator = BreakIterator.getWordInstance(locale);
        this.start = Math.max(0, start - 50);
        this.end = Math.min(this.charSequence.length(), end + 50);
        this.iterator.setText(new CharSequenceCharacterIterator(this.charSequence, start, end));
        return;
    L14:
        if (end > this.charSequence.length()) goto L16;
    L5:
        if (start > this.charSequence.length()) goto L7;
        value$iv2 = true;
        goto L9
    }

    public final CharSequence getCharSequence() {
        return this.charSequence;
    }

    public final int nextBoundary(int offset) {
        checkOffsetIsValid(offset);
        int following = this.iterator.following(offset);
        if (isOnLetterOrDigitOrEmoji(following - 1) == true) goto L5;
    L10:
        return following;
    L5:
        if (isOnLetterOrDigitOrEmoji(following) == false) goto L10;
        if (isHiraganaKatakanaBoundary(following) == true) goto L10;
        return nextBoundary(following);
    }

    public final int prevBoundary(int offset) {
        checkOffsetIsValid(offset);
        int preceding = this.iterator.preceding(offset);
        if (isOnLetterOrDigitOrEmoji(preceding) == false) goto L10;
        if (isAfterLetterOrDigitOrEmoji(preceding) == false) goto L10;
        if (isHiraganaKatakanaBoundary(preceding) == true) goto L10;
        return prevBoundary(preceding);
    L10:
        return preceding;
    }

    public final int getPrevWordBeginningOnTwoWordsBoundary(int offset) {
        return getBeginning(offset, true);
    }

    public final int getNextWordEndOnTwoWordBoundary(int offset) {
        return getEnd(offset, true);
    }

    public final int getPunctuationBeginning(int offset) {
        checkOffsetIsValid(offset);
        int result = offset;
    L4:
        if (result == (-1)) goto L8;
        if (isPunctuationStartBoundary(result) == true) goto L8;
        result = prevBoundary(result);
    L8:
        return result;
    }

    public final int getPunctuationEnd(int offset) {
        checkOffsetIsValid(offset);
        int result = offset;
    L4:
        if (result == (-1)) goto L8;
        if (isPunctuationEndBoundary(result) == true) goto L8;
        result = nextBoundary(result);
    L8:
        return result;
    }

    public final boolean isAfterPunctuation(int offset) {
        boolean r1 = true;
        int r0 = this.start + 1;
        if (offset > this.end) goto L6;
        if (r0 > offset) goto L6;
    L7:
        if (r1 == false) goto L10;
        int codePoint = Character.codePointBefore(this.charSequence, offset);
        return Companion.isPunctuation$ui_text_release(codePoint);
    L10:
        return false;
    L6:
        r1 = false;
        goto L7
    }

    public final boolean isOnPunctuation(int offset) {
        int r0 = this.start;
        if (offset >= this.end) goto L6;
        if (r0 > offset) goto L6;
        boolean r1 = true;
    L7:
        if (r1 == false) goto L10;
        int codePoint = Character.codePointAt(this.charSequence, offset);
        return Companion.isPunctuation$ui_text_release(codePoint);
    L10:
        return false;
    L6:
        r1 = false;
        goto L7
    }

    private final int getBeginning(int offset, boolean getPrevWordBeginningOnTwoWordsBoundary) {
        checkOffsetIsValid(offset);
        if (isOnLetterOrDigitOrEmoji(offset) == false) goto L13;
        if (isBoundary(offset) == false) goto L11;
        if (isAfterLetterOrDigitOrEmoji(offset) == false) goto L18;
        if (getPrevWordBeginningOnTwoWordsBoundary == true) goto L11;
    L18:
        return offset;
    L11:
        return prevBoundary(offset);
    L13:
        if (isAfterLetterOrDigitOrEmoji(offset) == true) goto L15;
        return -1;
    L15:
        return prevBoundary(offset);
    }

    private final int getEnd(int offset, boolean getNextWordEndOnTwoWordBoundary) {
        checkOffsetIsValid(offset);
        if (isAfterLetterOrDigitOrEmoji(offset) == false) goto L13;
        if (isBoundary(offset) == false) goto L11;
        if (isOnLetterOrDigitOrEmoji(offset) == false) goto L18;
        if (getNextWordEndOnTwoWordBoundary == true) goto L11;
    L18:
        return offset;
    L11:
        return nextBoundary(offset);
    L13:
        if (isOnLetterOrDigitOrEmoji(offset) == true) goto L15;
        return -1;
    L15:
        return nextBoundary(offset);
    }

    private final boolean isPunctuationStartBoundary(int offset) {
        if (isOnPunctuation(offset) == true) goto L5;
    L7:
        return false;
    L5:
        if (isAfterPunctuation(offset) == true) goto L7;
        return true;
    }

    private final boolean isPunctuationEndBoundary(int offset) {
        if (isOnPunctuation(offset) == false) goto L5;
    L7:
        return false;
    L5:
        if (isAfterPunctuation(offset) == false) goto L7;
        return true;
    }

    private final boolean isAfterLetterOrDigitOrEmoji(int offset) {
        int r0 = this.start + 1;
        if (offset > this.end) goto L6;
        if (r0 > offset) goto L6;
        boolean r1 = true;
    L7:
        if (r1 == false) goto L21;
        int codePoint = Character.codePointBefore(this.charSequence, offset);
        if (Character.isLetterOrDigit(codePoint) == false) goto L12;
        return true;
    L12:
        if (Character.isSurrogate(this.charSequence.charAt(offset - 1)) == false) goto L15;
        return true;
    L15:
        if (EmojiCompat.isConfigured() == false) goto L21;
        EmojiCompat emojiCompat = EmojiCompat.get();
        if (emojiCompat.getLoadState() != 1) goto L21;
        int emojiStart = emojiCompat.getEmojiStart(this.charSequence, offset - 1);
        if (emojiStart == (-1)) goto L21;
        return true;
    L21:
        return false;
    L6:
        r1 = false;
        goto L7
    }

    private final boolean isOnLetterOrDigitOrEmoji(int offset) {
        int r0 = this.start;
        if (offset >= this.end) goto L6;
        if (r0 > offset) goto L6;
        boolean r1 = true;
    L7:
        if (r1 == false) goto L21;
        int codePoint = Character.codePointAt(this.charSequence, offset);
        if (Character.isLetterOrDigit(codePoint) == false) goto L12;
        return true;
    L12:
        if (Character.isSurrogate(this.charSequence.charAt(offset)) == false) goto L15;
        return true;
    L15:
        if (EmojiCompat.isConfigured() == false) goto L21;
        EmojiCompat emojiCompat = EmojiCompat.get();
        if (emojiCompat.getLoadState() != 1) goto L21;
        int emojiStart = emojiCompat.getEmojiStart(this.charSequence, offset);
        if (emojiStart == (-1)) goto L21;
        return true;
    L21:
        return false;
    L6:
        r1 = false;
        goto L7
    }

    private final void checkOffsetIsValid(int offset) {
        int r0 = this.start;
        boolean value$iv = false;
        if (offset > this.end) goto L7;
        if (r0 > offset) goto L7;
        value$iv = true;
    L7:
        if (value$iv == true) goto L11;
        InlineClassHelperKt.throwIllegalArgumentException("Invalid offset: " + offset + ". Valid range is [" + this.start + " , " + this.end + ']');
        return;
    }

    private final boolean isBoundary(int offset) {
        checkOffsetIsValid(offset);
        if (this.iterator.isBoundary(offset) == true) goto L5;
    L19:
        return false;
    L5:
        if (isOnLetterOrDigitOrEmoji(offset) == false) goto L11;
        if (isOnLetterOrDigitOrEmoji(offset - 1) == false) goto L11;
        if (isOnLetterOrDigitOrEmoji(offset + 1) == true) goto L19;
    L11:
        if (offset > 0) goto L13;
        return true;
    L13:
        if (offset < (this.charSequence.length() - 1)) goto L15;
        return true;
    L15:
        if (isHiraganaKatakanaBoundary(offset) == true) goto L19;
        if (isHiraganaKatakanaBoundary(offset + 1) == true) goto L19;
        return true;
    }

    private final boolean isHiraganaKatakanaBoundary(int offset) {
        if (Intrinsics.areEqual(Character.UnicodeBlock.of(this.charSequence.charAt(offset - 1)), Character.UnicodeBlock.HIRAGANA) == false) goto L7;
        if (Intrinsics.areEqual(Character.UnicodeBlock.of(this.charSequence.charAt(offset)), Character.UnicodeBlock.KATAKANA) == false) goto L7;
    L10:
        return true;
    L7:
        if (Intrinsics.areEqual(Character.UnicodeBlock.of(this.charSequence.charAt(offset)), Character.UnicodeBlock.HIRAGANA) == true) goto L9;
    L11:
        return false;
    L9:
        if (Intrinsics.areEqual(Character.UnicodeBlock.of(this.charSequence.charAt(offset - 1)), Character.UnicodeBlock.KATAKANA) == false) goto L11;
        goto L10
    }
}
