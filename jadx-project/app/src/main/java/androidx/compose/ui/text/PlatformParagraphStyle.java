package androidx.compose.ui.text;

import androidx.webkit.Profile;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: AndroidTextStyle.android.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0007\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B\u0011\b\u0016\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u001b\b\u0016\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0007B\u0011\b\u0016\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\bB\u0007\b\u0016¢\u0006\u0002\u0010\tJ\u0013\u0010\u0010\u001a\u00020\u00032\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u0012\u001a\u00020\u0013H\u0016J\u0010\u0010\u0014\u001a\u00020\u00002\b\u0010\u0011\u001a\u0004\u0018\u00010\u0000J\b\u0010\u0015\u001a\u00020\u0016H\u0016R\u0019\u0010\u0005\u001a\u00020\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\n\u0010\u000bR\u0019\u0010\u0002\u001a\u00020\u00038F¢\u0006\u000e\n\u0000\u0012\u0004\b\r\u0010\t\u001a\u0004\b\u000e\u0010\u000f\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0018"}, d2 = {"Landroidx/compose/ui/text/PlatformParagraphStyle;", "", "includeFontPadding", "", "(Z)V", "emojiSupportMatch", "Landroidx/compose/ui/text/EmojiSupportMatch;", "(IZLkotlin/jvm/internal/DefaultConstructorMarker;)V", "(ILkotlin/jvm/internal/DefaultConstructorMarker;)V", "()V", "getEmojiSupportMatch-_3YsG6Y", "()I", "I", "getIncludeFontPadding$annotations", "getIncludeFontPadding", "()Z", "equals", "other", "hashCode", "", "merge", "toString", "", "Companion", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class PlatformParagraphStyle {
    public static final int $stable = 0;
    public static final Companion Companion = null;
    private static final PlatformParagraphStyle Default = null;
    private final int emojiSupportMatch;
    private final boolean includeFontPadding;

    /* JADX INFO: compiled from: AndroidTextStyle.android.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Landroidx/compose/ui/text/PlatformParagraphStyle$Companion;", "", "()V", Profile.DEFAULT_PROFILE_NAME, "Landroidx/compose/ui/text/PlatformParagraphStyle;", "getDefault", "()Landroidx/compose/ui/text/PlatformParagraphStyle;", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker r1) {
            this();
        }

        private Companion() {
        }

        public final PlatformParagraphStyle getDefault() {
            return PlatformParagraphStyle.access$getDefault$cp();
        }
    }

    public /* synthetic */ PlatformParagraphStyle(int r1, DefaultConstructorMarker r2) {
        this(r1);
    }

    public /* synthetic */ PlatformParagraphStyle(int r1, boolean r2, DefaultConstructorMarker r3) {
        this(r1, r2);
    }

    public static /* synthetic */ void getIncludeFontPadding$annotations() {
    }

    public static final /* synthetic */ PlatformParagraphStyle access$getDefault$cp() {
        return Default;
    }

    static {
        Companion = new Companion(null);
        Default = new PlatformParagraphStyle();
    }

    public final boolean getIncludeFontPadding() {
        return this.includeFontPadding;
    }

    /* JADX INFO: renamed from: getEmojiSupportMatch-_3YsG6Y, reason: not valid java name */
    public final int m6335getEmojiSupportMatch_3YsG6Y() {
        return this.emojiSupportMatch;
    }

    public PlatformParagraphStyle(boolean includeFontPadding) {
        this.includeFontPadding = includeFontPadding;
        this.emojiSupportMatch = EmojiSupportMatch.Companion.m6262getDefault_3YsG6Y();
    }

    public /* synthetic */ PlatformParagraphStyle(boolean r1, int r2, DefaultConstructorMarker r3) {
        if ((r2 & 1) == 0) goto L5;
        r1 = false;
    L5:
        this(r1);
    }

    public /* synthetic */ PlatformParagraphStyle(int r1, boolean r2, int r3, DefaultConstructorMarker r4) {
        if ((r3 & 1) == 0) goto L6;
        r1 = EmojiSupportMatch.Companion.m6262getDefault_3YsG6Y();
    L6:
        if ((r3 & 2) == 0) goto L8;
        r2 = false;
    L8:
        this(r1, r2, null);
    }

    private PlatformParagraphStyle(int emojiSupportMatch, boolean includeFontPadding) {
        this.includeFontPadding = includeFontPadding;
        this.emojiSupportMatch = emojiSupportMatch;
    }

    private PlatformParagraphStyle(int emojiSupportMatch) {
        this.includeFontPadding = false;
        this.emojiSupportMatch = emojiSupportMatch;
    }

    public /* synthetic */ PlatformParagraphStyle(int r1, int r2, DefaultConstructorMarker r3) {
        if ((r2 & 1) == 0) goto L5;
        r1 = EmojiSupportMatch.Companion.m6262getDefault_3YsG6Y();
    L5:
        this(r1, null);
    }

    public PlatformParagraphStyle() {
        this(EmojiSupportMatch.Companion.m6262getDefault_3YsG6Y(), false, null);
    }

    public boolean equals(Object other) {
        if (this != other) goto L6;
        return true;
    L6:
        if ((other instanceof PlatformParagraphStyle) == true) goto L9;
        return false;
    L9:
        if (this.includeFontPadding == ((PlatformParagraphStyle) other).includeFontPadding) goto L12;
        return false;
    L12:
        if (EmojiSupportMatch.m6257equalsimpl0(this.emojiSupportMatch, ((PlatformParagraphStyle) other).emojiSupportMatch) == true) goto L14;
        return false;
    L14:
        return true;
    }

    public int hashCode() {
        int result = Boolean.hashCode(this.includeFontPadding);
        return (result * 31) + EmojiSupportMatch.m6258hashCodeimpl(this.emojiSupportMatch);
    }

    public String toString() {
        return "PlatformParagraphStyle(includeFontPadding=" + this.includeFontPadding + ", emojiSupportMatch=" + EmojiSupportMatch.m6259toStringimpl(this.emojiSupportMatch) + ')';
    }

    public final PlatformParagraphStyle merge(PlatformParagraphStyle other) {
        if (other != null) goto L4;
        return this;
    L4:
        return other;
    }
}
