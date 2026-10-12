package kotlin.text;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Char.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0000\n\u0002\u0010\b\n\u0002\u0010\f\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0007\u001a\u0014\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0001H\u0007\u001a\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\u0007¢\u0006\u0002\u0010\u0005\u001a\u001b\u0010\u0004\u001a\u0004\u0018\u00010\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0001H\u0007¢\u0006\u0002\u0010\u0006\u001a\f\u0010\u0007\u001a\u00020\u0002*\u00020\u0001H\u0007\u001a\u0014\u0010\u0007\u001a\u00020\u0002*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0001H\u0007\u001a\f\u0010\b\u001a\u00020\t*\u00020\u0002H\u0007\u001a\u0015\u0010\n\u001a\u00020\t*\u00020\u00022\u0006\u0010\u000b\u001a\u00020\tH\u0087\n\u001a\u001c\u0010\f\u001a\u00020\r*\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u00022\b\b\u0002\u0010\u000e\u001a\u00020\r\u001a\n\u0010\u000f\u001a\u00020\r*\u00020\u0002¨\u0006\u0010"}, d2 = {"digitToInt", "", "", "radix", "digitToIntOrNull", "(C)Ljava/lang/Integer;", "(CI)Ljava/lang/Integer;", "digitToChar", "titlecase", "", "plus", "other", "equals", "", "ignoreCase", "isSurrogate", "kotlin-stdlib"}, k = 5, mv = {2, 2, 0}, xi = 49, xs = "kotlin/text/CharsKt")
class CharsKt__CharKt extends CharsKt__CharJVMKt {
    public CharsKt__CharKt() {
    }

    public static final int digitToInt(char $this$digitToInt) {
        int it = CharsKt.digitOf($this$digitToInt, 10);
        if (it < 0) goto L6;
        return it;
    L6:
        throw new IllegalArgumentException("Char " + $this$digitToInt + " is not a decimal digit");
    }

    public static final int digitToInt(char $this$digitToInt, int radix) {
        Integer r0 = CharsKt.digitToIntOrNull($this$digitToInt, radix);
        if (r0 == null) goto L7;
        return r0.intValue();
    L7:
        throw new IllegalArgumentException("Char " + $this$digitToInt + " is not a digit in the given radix=" + radix);
    }

    public static final Integer digitToIntOrNull(char $this$digitToIntOrNull) {
        Integer r0 = Integer.valueOf(CharsKt.digitOf($this$digitToIntOrNull, 10));
        int it = r0.intValue();
        if (it < 0) goto L5;
        boolean r3 = true;
    L6:
        if (r3 == true) goto L10;
        return null;
    L10:
        return r0;
    L5:
        r3 = false;
        goto L6
    }

    public static final Integer digitToIntOrNull(char $this$digitToIntOrNull, int radix) {
        CharsKt.checkRadix(radix);
        Integer r0 = Integer.valueOf(CharsKt.digitOf($this$digitToIntOrNull, radix));
        int it = r0.intValue();
        if (it < 0) goto L5;
        boolean r3 = true;
    L6:
        if (r3 == true) goto L10;
        return null;
    L10:
        return r0;
    L5:
        r3 = false;
        goto L6
    }

    public static final char digitToChar(int $this$digitToChar) {
        boolean r0 = false;
        if ($this$digitToChar >= 0) goto L5;
    L7:
        if (r0 == false) goto L11;
        return (char) ($this$digitToChar + 48);
    L11:
        throw new IllegalArgumentException("Int " + $this$digitToChar + " is not a decimal digit");
    L5:
        if ($this$digitToChar >= 10) goto L7;
        r0 = true;
        goto L7
    }

    public static final char digitToChar(int $this$digitToChar, int radix) {
        boolean r1 = false;
        if (2 <= radix) goto L5;
    L7:
        if (r1 == false) goto L18;
        if ($this$digitToChar < 0) goto L16;
        if ($this$digitToChar >= radix) goto L16;
        if ($this$digitToChar >= 10) goto L14;
        return (char) ($this$digitToChar + 48);
    L14:
        return (char) (((char) ($this$digitToChar + 65)) - '\n');
    L16:
        throw new IllegalArgumentException("Digit " + $this$digitToChar + " does not represent a valid digit in radix " + radix);
    L18:
        throw new IllegalArgumentException("Invalid radix: " + radix + ". Valid radix values are in range 2..36");
    L5:
        if (radix >= 37) goto L7;
        r1 = true;
        goto L7
    }

    public static final String titlecase(char $this$titlecase) {
        return _OneToManyTitlecaseMappingsKt.titlecaseImpl($this$titlecase);
    }

    private static final String plus(char $this$plus, String other) {
        Intrinsics.checkNotNullParameter(other, "other");
        return $this$plus + other;
    }

    public static /* synthetic */ boolean equals$default(char r0, char r1, boolean r2, int r3, Object r4) {
        if ((r3 & 2) == 0) goto L6;
        r2 = false;
    L6:
        return CharsKt.equals(r0, r1, r2);
    }

    public static final boolean equals(char $this$equals, char other, boolean ignoreCase) {
        if ($this$equals != other) goto L6;
        return true;
    L6:
        if (ignoreCase == true) goto L8;
        return false;
    L8:
        char thisUpper = Character.toUpperCase($this$equals);
        char otherUpper = Character.toUpperCase(other);
        if (thisUpper != otherUpper) goto L11;
        return true;
    L11:
        if (Character.toLowerCase(thisUpper) != Character.toLowerCase(otherUpper)) goto L14;
        return true;
    L14:
        return false;
    }

    public static final boolean isSurrogate(char $this$isSurrogate) {
        if (55296 <= $this$isSurrogate) goto L5;
        return false;
    L5:
        if ($this$isSurrogate >= 57344) goto L9;
        return true;
    L9:
        return false;
    }
}
