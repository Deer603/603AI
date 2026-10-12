package kotlin.text;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: Regex.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u000e\b\u0086\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002B\u001b\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0014\u0010\u0005\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011¨\u0006\u0012"}, d2 = {"Lkotlin/text/RegexOption;", "Lkotlin/text/FlagEnum;", "", "value", "", "mask", "<init>", "(Ljava/lang/String;III)V", "getValue", "()I", "getMask", "IGNORE_CASE", "MULTILINE", "LITERAL", "UNIX_LINES", "COMMENTS", "DOT_MATCHES_ALL", "CANON_EQ", "kotlin-stdlib"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final enum RegexOption extends Enum<RegexOption> implements FlagEnum {
    private static final /* synthetic */ EnumEntries $ENTRIES = null;
    private static final /* synthetic */ RegexOption[] $VALUES = null;
    public static final RegexOption CANON_EQ = null;
    public static final RegexOption COMMENTS = null;
    public static final RegexOption DOT_MATCHES_ALL = null;
    public static final RegexOption IGNORE_CASE = null;
    public static final RegexOption LITERAL = null;
    public static final RegexOption MULTILINE = null;
    public static final RegexOption UNIX_LINES = null;
    private final int mask;
    private final int value;

    private static final /* synthetic */ RegexOption[] $values() {
        return new RegexOption[]{IGNORE_CASE, MULTILINE, LITERAL, UNIX_LINES, COMMENTS, DOT_MATCHES_ALL, CANON_EQ};
    }

    public static EnumEntries<RegexOption> getEntries() {
        return $ENTRIES;
    }

    public static RegexOption valueOf(String r1) {
        return (RegexOption) Enum.valueOf(RegexOption.class, r1);
    }

    public static RegexOption[] values() {
        return (RegexOption[]) $VALUES.clone();
    }

    private RegexOption(String $enum$name, int $enum$ordinal, int value, int mask) {
        super($enum$name, $enum$ordinal);
        this.value = value;
        this.mask = mask;
    }

    /* synthetic */ RegexOption(String r1, int r2, int r3, int r4, int r5, DefaultConstructorMarker r6) {
        if ((r5 & 2) == 0) goto L5;
        r4 = r3;
    L5:
        this(r1, r2, r3, r4);
    }

    @Override // kotlin.text.FlagEnum
    public int getMask() {
        return this.mask;
    }

    @Override // kotlin.text.FlagEnum
    public int getValue() {
        return this.value;
    }

    static {
        String r1 = "IGNORE_CASE";
        int r2 = 0;
        int r3 = 2;
        int r4 = 0;
        IGNORE_CASE = new RegexOption(r1, r2, r3, r4, 2, null);
        String r5 = "MULTILINE";
        int r6 = 1;
        int r7 = 8;
        int r8 = 0;
        MULTILINE = new RegexOption(r5, r6, r7, r8, 2, null);
        String r9 = "LITERAL";
        int r10 = 2;
        int r11 = 16;
        int r12 = 0;
        LITERAL = new RegexOption(r9, r10, r11, r12, 2, null);
        String r13 = "UNIX_LINES";
        int r14 = 3;
        int r15 = 1;
        int r16 = 0;
        UNIX_LINES = new RegexOption(r13, r14, r15, r16, 2, null);
        String r17 = "COMMENTS";
        int r18 = 4;
        int r19 = 4;
        int r20 = 0;
        COMMENTS = new RegexOption(r17, r18, r19, r20, 2, null);
        String r21 = "DOT_MATCHES_ALL";
        int r22 = 5;
        int r23 = 32;
        int r24 = 0;
        DOT_MATCHES_ALL = new RegexOption(r21, r22, r23, r24, 2, null);
        String r25 = "CANON_EQ";
        int r26 = 6;
        int r27 = 128;
        int r110 = 0;
        CANON_EQ = new RegexOption(r25, r26, r27, r110, 2, null);
        $VALUES = $values();
        $ENTRIES = EnumEntriesKt.enumEntries($VALUES);
    }
}
