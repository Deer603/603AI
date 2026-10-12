package androidx.compose.ui.text;

import androidx.webkit.Profile;
import kotlin.Metadata;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: EmojiSupportMatch.android.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087@\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\f\u0010\u0005J\u000f\u0010\r\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000\u0088\u0001\u0002\u0092\u0001\u00020\u0003¨\u0006\u0012"}, d2 = {"Landroidx/compose/ui/text/EmojiSupportMatch;", "", "value", "", "constructor-impl", "(I)I", "equals", "", "other", "equals-impl", "(ILjava/lang/Object;)Z", "hashCode", "hashCode-impl", "toString", "", "toString-impl", "(I)Ljava/lang/String;", "Companion", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@JvmInline
public final class EmojiSupportMatch {
    private static final int All = 0;
    public static final Companion Companion = null;
    private static final int Default = 0;
    private static final int None = 0;
    private final int value;

    /* JADX INFO: compiled from: EmojiSupportMatch.android.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0019\u0010\u0003\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0005\u0010\u0006R\u0019\u0010\b\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\t\u0010\u0006R\u0019\u0010\n\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u000b\u0010\u0006\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\f"}, d2 = {"Landroidx/compose/ui/text/EmojiSupportMatch$Companion;", "", "()V", "All", "Landroidx/compose/ui/text/EmojiSupportMatch;", "getAll-_3YsG6Y", "()I", "I", Profile.DEFAULT_PROFILE_NAME, "getDefault-_3YsG6Y", "None", "getNone-_3YsG6Y", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker r1) {
            this();
        }

        private Companion() {
        }

        /* JADX INFO: renamed from: getDefault-_3YsG6Y, reason: not valid java name */
        public final int m6262getDefault_3YsG6Y() {
            return EmojiSupportMatch.access$getDefault$cp();
        }

        /* JADX INFO: renamed from: getNone-_3YsG6Y, reason: not valid java name */
        public final int m6263getNone_3YsG6Y() {
            return EmojiSupportMatch.access$getNone$cp();
        }

        /* JADX INFO: renamed from: getAll-_3YsG6Y, reason: not valid java name */
        public final int m6261getAll_3YsG6Y() {
            return EmojiSupportMatch.access$getAll$cp();
        }
    }

    /* JADX INFO: renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ EmojiSupportMatch m6254boximpl(int r1) {
        return new EmojiSupportMatch(r1);
    }

    /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
    private static int m6255constructorimpl(int r0) {
        return r0;
    }

    /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
    public static boolean m6256equalsimpl(int r2, Object r3) {
        if ((r3 instanceof EmojiSupportMatch) == true) goto L6;
        return false;
    L6:
        if (r2 == ((EmojiSupportMatch) r3).m6260unboximpl()) goto L8;
        return false;
    L8:
        return true;
    }

    /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m6257equalsimpl0(int r1, int r2) {
        if (r1 != r2) goto L4;
        return true;
    L4:
        return false;
    }

    /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
    public static int m6258hashCodeimpl(int r1) {
        return Integer.hashCode(r1);
    }

    public boolean equals(Object r2) {
        return m6256equalsimpl(this.value, r2);
    }

    public int hashCode() {
        return m6258hashCodeimpl(this.value);
    }

    /* JADX INFO: renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m6260unboximpl() {
        return this.value;
    }

    public static final /* synthetic */ int access$getAll$cp() {
        return All;
    }

    public static final /* synthetic */ int access$getDefault$cp() {
        return Default;
    }

    public static final /* synthetic */ int access$getNone$cp() {
        return None;
    }

    private /* synthetic */ EmojiSupportMatch(int value) {
        this.value = value;
    }

    public String toString() {
        return m6259toStringimpl(this.value);
    }

    /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
    public static String m6259toStringimpl(int arg0) {
        if (arg0 != Default) goto L6;
        return "EmojiSupportMatch.Default";
    L6:
        if (arg0 != None) goto L9;
        return "EmojiSupportMatch.None";
    L9:
        if (arg0 != All) goto L12;
        return "EmojiSupportMatch.All";
    L12:
        return "Invalid(value=" + arg0 + ')';
    }

    static {
        Companion = new Companion(null);
        Default = m6255constructorimpl(0);
        None = m6255constructorimpl(1);
        All = m6255constructorimpl(2);
    }
}
