package kotlin.text;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: CharCategoryJVM.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b%\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\f\n\u0002\b\u0002\b\u0086\u0081\u0002\u0018\u0000 .2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001.B\u0019\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0011\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020-H\u0086\u0002R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001ej\u0002\b\u001fj\u0002\b j\u0002\b!j\u0002\b\"j\u0002\b#j\u0002\b$j\u0002\b%j\u0002\b&j\u0002\b'j\u0002\b(j\u0002\b)¨\u0006/"}, d2 = {"Lkotlin/text/CharCategory;", "", "value", "", "code", "", "<init>", "(Ljava/lang/String;IILjava/lang/String;)V", "getValue", "()I", "getCode", "()Ljava/lang/String;", "UNASSIGNED", "UPPERCASE_LETTER", "LOWERCASE_LETTER", "TITLECASE_LETTER", "MODIFIER_LETTER", "OTHER_LETTER", "NON_SPACING_MARK", "ENCLOSING_MARK", "COMBINING_SPACING_MARK", "DECIMAL_DIGIT_NUMBER", "LETTER_NUMBER", "OTHER_NUMBER", "SPACE_SEPARATOR", "LINE_SEPARATOR", "PARAGRAPH_SEPARATOR", "CONTROL", "FORMAT", "PRIVATE_USE", "SURROGATE", "DASH_PUNCTUATION", "START_PUNCTUATION", "END_PUNCTUATION", "CONNECTOR_PUNCTUATION", "OTHER_PUNCTUATION", "MATH_SYMBOL", "CURRENCY_SYMBOL", "MODIFIER_SYMBOL", "OTHER_SYMBOL", "INITIAL_QUOTE_PUNCTUATION", "FINAL_QUOTE_PUNCTUATION", "contains", "", "char", "", "Companion", "kotlin-stdlib"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final enum CharCategory extends Enum<CharCategory> {
    private static final /* synthetic */ EnumEntries $ENTRIES = null;
    private static final /* synthetic */ CharCategory[] $VALUES = null;
    public static final CharCategory COMBINING_SPACING_MARK = null;
    public static final CharCategory CONNECTOR_PUNCTUATION = null;
    public static final CharCategory CONTROL = null;
    public static final CharCategory CURRENCY_SYMBOL = null;
    public static final Companion Companion = null;
    public static final CharCategory DASH_PUNCTUATION = null;
    public static final CharCategory DECIMAL_DIGIT_NUMBER = null;
    public static final CharCategory ENCLOSING_MARK = null;
    public static final CharCategory END_PUNCTUATION = null;
    public static final CharCategory FINAL_QUOTE_PUNCTUATION = null;
    public static final CharCategory FORMAT = null;
    public static final CharCategory INITIAL_QUOTE_PUNCTUATION = null;
    public static final CharCategory LETTER_NUMBER = null;
    public static final CharCategory LINE_SEPARATOR = null;
    public static final CharCategory LOWERCASE_LETTER = null;
    public static final CharCategory MATH_SYMBOL = null;
    public static final CharCategory MODIFIER_LETTER = null;
    public static final CharCategory MODIFIER_SYMBOL = null;
    public static final CharCategory NON_SPACING_MARK = null;
    public static final CharCategory OTHER_LETTER = null;
    public static final CharCategory OTHER_NUMBER = null;
    public static final CharCategory OTHER_PUNCTUATION = null;
    public static final CharCategory OTHER_SYMBOL = null;
    public static final CharCategory PARAGRAPH_SEPARATOR = null;
    public static final CharCategory PRIVATE_USE = null;
    public static final CharCategory SPACE_SEPARATOR = null;
    public static final CharCategory START_PUNCTUATION = null;
    public static final CharCategory SURROGATE = null;
    public static final CharCategory TITLECASE_LETTER = null;
    public static final CharCategory UNASSIGNED = null;
    public static final CharCategory UPPERCASE_LETTER = null;
    private final String code;
    private final int value;

    /* JADX INFO: compiled from: CharCategoryJVM.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, d2 = {"Lkotlin/text/CharCategory$Companion;", "", "<init>", "()V", "valueOf", "Lkotlin/text/CharCategory;", "category", "", "kotlin-stdlib"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker r1) {
            this();
        }

        private Companion() {
        }

        public final CharCategory valueOf(int category) {
            boolean r0 = true;
            if (category >= 0) goto L5;
        L7:
            boolean r2 = false;
        L8:
            if (r2 == false) goto L11;
            return CharCategory.getEntries().get(category);
        L11:
            if (18 <= category) goto L13;
        L15:
            r0 = false;
        L16:
            if (r0 == false) goto L20;
            return CharCategory.getEntries().get(category - 1);
        L20:
            throw new IllegalArgumentException("Category #" + category + " is not defined.");
        L13:
            if (category >= 31) goto L15;
        L5:
            if (category >= 17) goto L7;
            r2 = true;
            goto L8
        }
    }

    private static final /* synthetic */ CharCategory[] $values() {
        return new CharCategory[]{UNASSIGNED, UPPERCASE_LETTER, LOWERCASE_LETTER, TITLECASE_LETTER, MODIFIER_LETTER, OTHER_LETTER, NON_SPACING_MARK, ENCLOSING_MARK, COMBINING_SPACING_MARK, DECIMAL_DIGIT_NUMBER, LETTER_NUMBER, OTHER_NUMBER, SPACE_SEPARATOR, LINE_SEPARATOR, PARAGRAPH_SEPARATOR, CONTROL, FORMAT, PRIVATE_USE, SURROGATE, DASH_PUNCTUATION, START_PUNCTUATION, END_PUNCTUATION, CONNECTOR_PUNCTUATION, OTHER_PUNCTUATION, MATH_SYMBOL, CURRENCY_SYMBOL, MODIFIER_SYMBOL, OTHER_SYMBOL, INITIAL_QUOTE_PUNCTUATION, FINAL_QUOTE_PUNCTUATION};
    }

    public static EnumEntries<CharCategory> getEntries() {
        return $ENTRIES;
    }

    public static CharCategory valueOf(String r1) {
        return (CharCategory) Enum.valueOf(CharCategory.class, r1);
    }

    public static CharCategory[] values() {
        return (CharCategory[]) $VALUES.clone();
    }

    private CharCategory(String $enum$name, int $enum$ordinal, int value, String code) {
        super($enum$name, $enum$ordinal);
        this.value = value;
        this.code = code;
    }

    public final String getCode() {
        return this.code;
    }

    public final int getValue() {
        return this.value;
    }

    static {
        UNASSIGNED = new CharCategory("UNASSIGNED", 0, 0, "Cn");
        UPPERCASE_LETTER = new CharCategory("UPPERCASE_LETTER", 1, 1, "Lu");
        LOWERCASE_LETTER = new CharCategory("LOWERCASE_LETTER", 2, 2, "Ll");
        TITLECASE_LETTER = new CharCategory("TITLECASE_LETTER", 3, 3, "Lt");
        MODIFIER_LETTER = new CharCategory("MODIFIER_LETTER", 4, 4, "Lm");
        OTHER_LETTER = new CharCategory("OTHER_LETTER", 5, 5, "Lo");
        NON_SPACING_MARK = new CharCategory("NON_SPACING_MARK", 6, 6, "Mn");
        ENCLOSING_MARK = new CharCategory("ENCLOSING_MARK", 7, 7, "Me");
        COMBINING_SPACING_MARK = new CharCategory("COMBINING_SPACING_MARK", 8, 8, "Mc");
        DECIMAL_DIGIT_NUMBER = new CharCategory("DECIMAL_DIGIT_NUMBER", 9, 9, "Nd");
        LETTER_NUMBER = new CharCategory("LETTER_NUMBER", 10, 10, "Nl");
        OTHER_NUMBER = new CharCategory("OTHER_NUMBER", 11, 11, "No");
        SPACE_SEPARATOR = new CharCategory("SPACE_SEPARATOR", 12, 12, "Zs");
        LINE_SEPARATOR = new CharCategory("LINE_SEPARATOR", 13, 13, "Zl");
        PARAGRAPH_SEPARATOR = new CharCategory("PARAGRAPH_SEPARATOR", 14, 14, "Zp");
        CONTROL = new CharCategory("CONTROL", 15, 15, "Cc");
        FORMAT = new CharCategory("FORMAT", 16, 16, "Cf");
        PRIVATE_USE = new CharCategory("PRIVATE_USE", 17, 18, "Co");
        SURROGATE = new CharCategory("SURROGATE", 18, 19, "Cs");
        DASH_PUNCTUATION = new CharCategory("DASH_PUNCTUATION", 19, 20, "Pd");
        START_PUNCTUATION = new CharCategory("START_PUNCTUATION", 20, 21, "Ps");
        END_PUNCTUATION = new CharCategory("END_PUNCTUATION", 21, 22, "Pe");
        CONNECTOR_PUNCTUATION = new CharCategory("CONNECTOR_PUNCTUATION", 22, 23, "Pc");
        OTHER_PUNCTUATION = new CharCategory("OTHER_PUNCTUATION", 23, 24, "Po");
        MATH_SYMBOL = new CharCategory("MATH_SYMBOL", 24, 25, "Sm");
        CURRENCY_SYMBOL = new CharCategory("CURRENCY_SYMBOL", 25, 26, "Sc");
        MODIFIER_SYMBOL = new CharCategory("MODIFIER_SYMBOL", 26, 27, "Sk");
        OTHER_SYMBOL = new CharCategory("OTHER_SYMBOL", 27, 28, "So");
        INITIAL_QUOTE_PUNCTUATION = new CharCategory("INITIAL_QUOTE_PUNCTUATION", 28, 29, "Pi");
        FINAL_QUOTE_PUNCTUATION = new CharCategory("FINAL_QUOTE_PUNCTUATION", 29, 30, "Pf");
        $VALUES = $values();
        $ENTRIES = EnumEntriesKt.enumEntries($VALUES);
        Companion = new Companion(null);
    }

    public final boolean contains(char r3) {
        if (Character.getType(r3) != this.value) goto L5;
        return true;
    L5:
        return false;
    }
}
