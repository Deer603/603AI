package androidx.compose.foundation.text.input.internal;

import androidx.autofill.HintConstants;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmInline;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: OffsetMappingCalculator.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0015\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0083@\u0018\u00002\u00020\u0001B\u0011\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005B\u0011\b\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\u0004\u0010\bJ\u001b\u0010\u000b\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013Jo\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00032\b\b\u0002\u0010\u0017\u001a\u00020\u00102K\u0010\u0018\u001aG\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\u001a\u0012\b\b\u001b\u0012\u0004\b\b(\u001c\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\u001a\u0012\b\b\u001b\u0012\u0004\b\b(\u001d\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\u001a\u0012\b\b\u001b\u0012\u0004\b\b(\u001e\u0012\u0004\u0012\u00020\u00150\u0019H\u0086\b¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\"\u0010\nJ-\u0010#\u001a\u00020\u00152\u0006\u0010$\u001a\u00020\u00032\u0006\u0010\u001c\u001a\u00020\u00032\u0006\u0010\u001d\u001a\u00020\u00032\u0006\u0010\u001e\u001a\u00020\u0003¢\u0006\u0004\b%\u0010&J\u0010\u0010'\u001a\u00020(HÖ\u0001¢\u0006\u0004\b)\u0010*R\u0011\u0010\u0002\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000\u0088\u0001\u0006\u0092\u0001\u00020\u0007\u0082\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006+"}, d2 = {"Landroidx/compose/foundation/text/input/internal/OpArray;", "", "size", "", "constructor-impl", "(I)[I", "values", "", "([I)[I", "getSize-impl", "([I)I", "copyOf", "newSize", "copyOf-pSmdads", "([II)[I", "equals", "", "other", "equals-impl", "([ILjava/lang/Object;)Z", "forEach", "", "max", "reversed", "block", "Lkotlin/Function3;", "Lkotlin/ParameterName;", HintConstants.AUTOFILL_HINT_NAME, "offset", "srcLen", "destLen", "forEach-impl", "([IIZLkotlin/jvm/functions/Function3;)V", "hashCode", "hashCode-impl", "set", "index", "set-impl", "([IIIII)V", "toString", "", "toString-impl", "([I)Ljava/lang/String;", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@JvmInline
final class OpArray {
    private final int[] values;

    /* JADX INFO: renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ OpArray m1263boximpl(int[] r1) {
        return new OpArray(r1);
    }

    /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
    private static int[] m1265constructorimpl(int[] r0) {
        return r0;
    }

    /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
    public static boolean m1267equalsimpl(int[] r2, Object r3) {
        if ((r3 instanceof OpArray) == true) goto L6;
        return false;
    L6:
        if (Intrinsics.areEqual(r2, ((OpArray) r3).m1275unboximpl()) == true) goto L8;
        return false;
    L8:
        return true;
    }

    /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m1268equalsimpl0(int[] r1, int[] r2) {
        return Intrinsics.areEqual(r1, r2);
    }

    /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
    public static int m1272hashCodeimpl(int[] r1) {
        return Arrays.hashCode(r1);
    }

    /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
    public static String m1274toStringimpl(int[] r2) {
        return "OpArray(values=" + Arrays.toString(r2) + ')';
    }

    public boolean equals(Object r2) {
        return m1267equalsimpl(this.values, r2);
    }

    public int hashCode() {
        return m1272hashCodeimpl(this.values);
    }

    public String toString() {
        return m1274toStringimpl(this.values);
    }

    /* JADX INFO: renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int[] m1275unboximpl() {
        return this.values;
    }

    private /* synthetic */ OpArray(int[] values) {
        this.values = values;
    }

    /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
    public static int[] m1264constructorimpl(int size) {
        return m1265constructorimpl(new int[size * 3]);
    }

    /* JADX INFO: renamed from: getSize-impl, reason: not valid java name */
    public static final int m1271getSizeimpl(int[] arg0) {
        return arg0.length / 3;
    }

    /* JADX INFO: renamed from: set-impl, reason: not valid java name */
    public static final void m1273setimpl(int[] arg0, int index, int offset, int srcLen, int destLen) {
        arg0[index * 3] = offset;
        arg0[(index * 3) + 1] = srcLen;
        arg0[(index * 3) + 2] = destLen;
    }

    /* JADX INFO: renamed from: copyOf-pSmdads, reason: not valid java name */
    public static final int[] m1266copyOfpSmdads(int[] arg0, int newSize) {
        int[] r0 = Arrays.copyOf(arg0, newSize * 3);
        Intrinsics.checkNotNullExpressionValue(r0, "copyOf(...)");
        return m1265constructorimpl(r0);
    }

    /* JADX INFO: renamed from: forEach-impl$default, reason: not valid java name */
    public static /* synthetic */ void m1270forEachimpl$default(int[] arg0, int max, boolean reversed, Function3 block, int r10, Object r11) {
        if ((r10 & 2) == 0) goto L6;
        reversed = false;
    L6:
        if (max >= 0) goto L8;
        return;
    L8:
        if (reversed == false) goto L13;
        int i = max - 1;
    L11:
        if ((-1) >= i) goto L16;
        int offset = arg0[i * 3];
        int srcLen = arg0[(i * 3) + 1];
        int destLen = arg0[(i * 3) + 2];
        block.invoke(Integer.valueOf(offset), Integer.valueOf(srcLen), Integer.valueOf(destLen));
        i = i - 1;
        goto L11
    L16:
        return;
    L13:
        int i2 = 0;
    L14:
        if (i2 >= max) goto L19;
        int offset2 = arg0[i2 * 3];
        int srcLen2 = arg0[(i2 * 3) + 1];
        int destLen2 = arg0[(i2 * 3) + 2];
        block.invoke(Integer.valueOf(offset2), Integer.valueOf(srcLen2), Integer.valueOf(destLen2));
        i2 = i2 + 1;
        goto L14
    }

    /* JADX INFO: renamed from: forEach-impl, reason: not valid java name */
    public static final void m1269forEachimpl(int[] arg0, int max, boolean reversed, Function3<? super Integer, ? super Integer, ? super Integer, Unit> r11) {
        if (max >= 0) goto L5;
        return;
    L5:
        if (reversed == false) goto L10;
        int i = max - 1;
    L8:
        if ((-1) >= i) goto L13;
        int offset = arg0[i * 3];
        int srcLen = arg0[(i * 3) + 1];
        int destLen = arg0[(i * 3) + 2];
        r11.invoke(Integer.valueOf(offset), Integer.valueOf(srcLen), Integer.valueOf(destLen));
        i = i - 1;
        goto L8
    L13:
        return;
    L10:
        int i2 = 0;
    L11:
        if (i2 >= max) goto L16;
        int offset2 = arg0[i2 * 3];
        int srcLen2 = arg0[(i2 * 3) + 1];
        int destLen2 = arg0[(i2 * 3) + 2];
        r11.invoke(Integer.valueOf(offset2), Integer.valueOf(srcLen2), Integer.valueOf(destLen2));
        i2 = i2 + 1;
        goto L11
    }
}
