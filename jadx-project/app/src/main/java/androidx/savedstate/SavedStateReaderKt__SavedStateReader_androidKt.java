package androidx.savedstate;

import android.os.Bundle;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: SavedStateReader.android.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\b\u0002\u001a!\u0010\u0000\u001a\u00020\u0001*\u00060\u0002j\u0002`\u00032\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003H\u0002¢\u0006\u0002\b\u0005\u001a\u0015\u0010\u0006\u001a\u00020\u0007*\u00060\u0002j\u0002`\u0003H\u0002¢\u0006\u0002\b\b\u001a3\u0010\t\u001a\u00020\n*\u00060\u0002j\u0002`\u00032\n\u0010\u000b\u001a\u00060\fj\u0002`\r2\u0010\u0010\u000e\u001a\f\u0012\b\u0012\u00060\u0002j\u0002`\u00030\u000fH\u0002¢\u0006\u0002\b\u0010¨\u0006\u0011"}, d2 = {"contentDeepEquals", "", "Landroid/os/Bundle;", "Landroidx/savedstate/SavedState;", "other", "contentDeepEquals$SavedStateReaderKt__SavedStateReader_androidKt", "contentDeepHashCode", "", "contentDeepHashCode$SavedStateReaderKt__SavedStateReader_androidKt", "contentDeepToString", "", "result", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "processed", "", "contentDeepToString$SavedStateReaderKt__SavedStateReader_androidKt", "savedstate_release"}, k = 5, mv = {2, 0, 0}, xi = 48, xs = "androidx/savedstate/SavedStateReaderKt")
final /* synthetic */ class SavedStateReaderKt__SavedStateReader_androidKt {
    public static final /* synthetic */ boolean access$contentDeepEquals(Bundle $receiver, Bundle other) {
        return contentDeepEquals$SavedStateReaderKt__SavedStateReader_androidKt($receiver, other);
    }

    public static final /* synthetic */ int access$contentDeepHashCode(Bundle $receiver) {
        return contentDeepHashCode$SavedStateReaderKt__SavedStateReader_androidKt($receiver);
    }

    public static final /* synthetic */ void access$contentDeepToString(Bundle $receiver, StringBuilder result, List processed) {
        contentDeepToString$SavedStateReaderKt__SavedStateReader_androidKt($receiver, result, processed);
    }

    private static final boolean contentDeepEquals$SavedStateReaderKt__SavedStateReader_androidKt(Bundle $this$contentDeepEquals, Bundle other) {
        if ($this$contentDeepEquals != other) goto L6;
        return true;
    L6:
        if ($this$contentDeepEquals.size() == other.size()) goto L8;
        return false;
    L8:
        Iterator<String> r1 = $this$contentDeepEquals.keySet().iterator();
    L10:
        if (r1.hasNext() == false) goto L92;
        String k = r1.next();
        Object v1 = $this$contentDeepEquals.get(k);
        Object v2 = other.get(k);
        if (v1 == v2) goto L10;
        if (Intrinsics.areEqual(v1, v2) == true) goto L10;
        if (v1 == null) goto L91;
        if (v2 == null) goto L91;
        if ((v1 instanceof Bundle) == false) goto L26;
        if ((v2 instanceof Bundle) == false) goto L26;
        if (contentDeepEquals$SavedStateReaderKt__SavedStateReader_androidKt((Bundle) v1, (Bundle) v2) == true) goto L10;
        return false;
    L26:
        if ((v1 instanceof Object[]) == false) goto L33;
        if ((v2 instanceof Object[]) == false) goto L33;
        if (ArraysKt.contentDeepEquals((Object[]) v1, (Object[]) v2) == true) goto L10;
        return false;
    L33:
        if ((v1 instanceof byte[]) == false) goto L40;
        if ((v2 instanceof byte[]) == false) goto L40;
        if (Arrays.equals((byte[]) v1, (byte[]) v2) == true) goto L10;
        return false;
    L40:
        if ((v1 instanceof short[]) == false) goto L47;
        if ((v2 instanceof short[]) == false) goto L47;
        if (Arrays.equals((short[]) v1, (short[]) v2) == true) goto L10;
        return false;
    L47:
        if ((v1 instanceof int[]) == false) goto L54;
        if ((v2 instanceof int[]) == false) goto L54;
        if (Arrays.equals((int[]) v1, (int[]) v2) == true) goto L10;
        return false;
    L54:
        if ((v1 instanceof long[]) == false) goto L61;
        if ((v2 instanceof long[]) == false) goto L61;
        if (Arrays.equals((long[]) v1, (long[]) v2) == true) goto L10;
        return false;
    L61:
        if ((v1 instanceof float[]) == false) goto L68;
        if ((v2 instanceof float[]) == false) goto L68;
        if (Arrays.equals((float[]) v1, (float[]) v2) == true) goto L10;
        return false;
    L68:
        if ((v1 instanceof double[]) == false) goto L75;
        if ((v2 instanceof double[]) == false) goto L75;
        if (Arrays.equals((double[]) v1, (double[]) v2) == true) goto L10;
        return false;
    L75:
        if ((v1 instanceof char[]) == false) goto L82;
        if ((v2 instanceof char[]) == false) goto L82;
        if (Arrays.equals((char[]) v1, (char[]) v2) == true) goto L10;
        return false;
    L82:
        if ((v1 instanceof boolean[]) == false) goto L89;
        if ((v2 instanceof boolean[]) == false) goto L89;
        if (Arrays.equals((boolean[]) v1, (boolean[]) v2) == true) goto L10;
        return false;
    L89:
        if (Intrinsics.areEqual(v1, v2) == true) goto L10;
        return false;
    L91:
        return false;
    L92:
        return true;
    }

    private static final int contentDeepHashCode$SavedStateReaderKt__SavedStateReader_androidKt(Bundle $this$contentDeepHashCode) {
        int result = 1;
        Iterator<String> r1 = $this$contentDeepHashCode.keySet().iterator();
    L4:
        if (r1.hasNext() == false) goto L39;
        String k = r1.next();
        Object element = $this$contentDeepHashCode.get(k);
        if ((element instanceof Bundle) == false) goto L9;
        int elementHash = contentDeepHashCode$SavedStateReaderKt__SavedStateReader_androidKt((Bundle) element);
    L38:
        result = (result * 31) + elementHash;
        goto L4
    L9:
        if ((element instanceof Object[]) == false) goto L12;
        elementHash = ArraysKt.contentDeepHashCode((Object[]) element);
        goto L38
    L12:
        if ((element instanceof byte[]) == false) goto L15;
        elementHash = Arrays.hashCode((byte[]) element);
        goto L38
    L15:
        if ((element instanceof short[]) == false) goto L18;
        elementHash = Arrays.hashCode((short[]) element);
        goto L38
    L18:
        if ((element instanceof int[]) == false) goto L21;
        elementHash = Arrays.hashCode((int[]) element);
        goto L38
    L21:
        if ((element instanceof long[]) == false) goto L24;
        elementHash = Arrays.hashCode((long[]) element);
        goto L38
    L24:
        if ((element instanceof float[]) == false) goto L27;
        elementHash = Arrays.hashCode((float[]) element);
        goto L38
    L27:
        if ((element instanceof double[]) == false) goto L30;
        elementHash = Arrays.hashCode((double[]) element);
        goto L38
    L30:
        if ((element instanceof char[]) == false) goto L33;
        elementHash = Arrays.hashCode((char[]) element);
        goto L38
    L33:
        if ((element instanceof boolean[]) == false) goto L35;
        elementHash = Arrays.hashCode((boolean[]) element);
        goto L38
    L35:
        if (element == null) goto L37;
        elementHash = element.hashCode();
        goto L38
    L37:
        elementHash = 0;
        goto L38
    L39:
        return result;
    }

    private static final void contentDeepToString$SavedStateReaderKt__SavedStateReader_androidKt(Bundle $this$contentDeepToString, StringBuilder result, List<Bundle> r9) {
        if (r9.contains($this$contentDeepToString) == false) goto L6;
        result.append("[...]");
        return;
    L6:
        r9.add($this$contentDeepToString);
        result.append('[');
        Iterator<T> r0 = $this$contentDeepToString.keySet().iterator();
        int r1 = 0;
    L8:
        if (r0.hasNext() == false) goto L47;
        int i = r1;
        r1 = r1 + 1;
        String k = (String) r0.next();
        if (i == 0) goto L12;
        result.append(", ");
    L12:
        result.append(k + '=');
        Object element = $this$contentDeepToString.get(k);
        if (element == null) goto L14;
        if ((element instanceof Bundle) == true) goto L17;
        if ((element instanceof Object[]) == true) goto L20;
        if ((element instanceof byte[]) == true) goto L23;
        if ((element instanceof short[]) == true) goto L26;
        if ((element instanceof int[]) == true) goto L29;
        if ((element instanceof long[]) == true) goto L32;
        if ((element instanceof float[]) == true) goto L35;
        if ((element instanceof double[]) == true) goto L38;
        if ((element instanceof char[]) == true) goto L41;
        if ((element instanceof boolean[]) == true) goto L44;
        result.append(element.toString());
        goto L8
    L44:
        String r5 = Arrays.toString((boolean[]) element);
        Intrinsics.checkNotNullExpressionValue(r5, "toString(...)");
        result.append(r5);
        goto L8
    L41:
        String r6 = Arrays.toString((char[]) element);
        Intrinsics.checkNotNullExpressionValue(r6, "toString(...)");
        result.append(r6);
        goto L8
    L38:
        String r7 = Arrays.toString((double[]) element);
        Intrinsics.checkNotNullExpressionValue(r7, "toString(...)");
        result.append(r7);
        goto L8
    L35:
        String r8 = Arrays.toString((float[]) element);
        Intrinsics.checkNotNullExpressionValue(r8, "toString(...)");
        result.append(r8);
        goto L8
    L32:
        String r10 = Arrays.toString((long[]) element);
        Intrinsics.checkNotNullExpressionValue(r10, "toString(...)");
        result.append(r10);
        goto L8
    L29:
        String r11 = Arrays.toString((int[]) element);
        Intrinsics.checkNotNullExpressionValue(r11, "toString(...)");
        result.append(r11);
        goto L8
    L26:
        String r12 = Arrays.toString((short[]) element);
        Intrinsics.checkNotNullExpressionValue(r12, "toString(...)");
        result.append(r12);
        goto L8
    L23:
        String r13 = Arrays.toString((byte[]) element);
        Intrinsics.checkNotNullExpressionValue(r13, "toString(...)");
        result.append(r13);
        goto L8
    L20:
        result.append(ArraysKt.contentDeepToString((Object[]) element));
        goto L8
    L17:
        contentDeepToString$SavedStateReaderKt__SavedStateReader_androidKt((Bundle) element, result, r9);
        Unit r14 = Unit.INSTANCE;
        goto L8
    L14:
        result.append("null");
        goto L8
    L47:
        result.append(']');
        r9.remove(CollectionsKt.getLastIndex(r9));
    }
}
