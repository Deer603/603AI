package androidx.compose.foundation.text;

import androidx.emoji2.text.EmojiCompat;
import java.text.BreakIterator;
import kotlin.Metadata;

/* JADX INFO: compiled from: StringHelpers.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\u0010\u000e\n\u0002\b\u0003\u001a\n\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\u0002\u001a\u0014\u0010\u0002\u001a\u00020\u0003*\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0003H\u0000\u001a\u0014\u0010\u0006\u001a\u00020\u0003*\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0003H\u0000¨\u0006\u0007"}, d2 = {"getEmojiCompatIfLoaded", "Landroidx/emoji2/text/EmojiCompat;", "findFollowingBreak", "", "", "index", "findPrecedingBreak", "foundation_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class StringHelpers_androidKt {
    public static final int findPrecedingBreak(String $this$findPrecedingBreak, int index) {
        EmojiCompat r0 = getEmojiCompatIfLoaded();
        Integer emojiBreak = null;
        if (r0 == null) goto L10;
        boolean r4 = false;
        Integer r1 = Integer.valueOf(r0.getEmojiStart($this$findPrecedingBreak, Math.max(0, index - 1)));
        if (r1.intValue() != (-1)) goto L7;
        r4 = true;
    L7:
        if (r4 == true) goto L10;
        emojiBreak = r1;
    L10:
        if (emojiBreak != null) goto L12;
        BreakIterator it = BreakIterator.getCharacterInstance();
        it.setText($this$findPrecedingBreak);
        return it.preceding(index);
    L12:
        return emojiBreak.intValue();
    }

    public static final int findFollowingBreak(String $this$findFollowingBreak, int index) {
        EmojiCompat r0 = getEmojiCompatIfLoaded();
        Integer emojiBreak = null;
        if (r0 == null) goto L10;
        Integer r1 = Integer.valueOf(r0.getEmojiEnd($this$findFollowingBreak, index));
        if (r1.intValue() != (-1)) goto L7;
        boolean r4 = true;
    L8:
        if (r4 == true) goto L10;
        emojiBreak = r1;
        goto L10
    L7:
        r4 = false;
    L10:
        if (emojiBreak != null) goto L12;
        BreakIterator it = BreakIterator.getCharacterInstance();
        it.setText($this$findFollowingBreak);
        return it.following(index);
    L12:
        return emojiBreak.intValue();
    }

    private static final EmojiCompat getEmojiCompatIfLoaded() {
        if (EmojiCompat.isConfigured() == false) goto L13;
        EmojiCompat it = EmojiCompat.get();
        boolean r5 = true;
        if (it.getLoadState() == 1) goto L8;
        r5 = false;
    L8:
        if (r5 == true) goto L12;
        return null;
    L12:
        return it;
    L13:
        return null;
    }
}
