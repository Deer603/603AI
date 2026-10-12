package kotlinx.serialization.internal;

import androidx.autofill.HintConstants;
import java.util.Arrays;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.SerialDescriptorKt;
import kotlinx.serialization.descriptors.SerialKind;

/* JADX INFO: compiled from: PluginGeneratedSerialDescriptor.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000.\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0002\u001aN\u0010\u0000\u001a\u00020\u0001\"\n\b\u0000\u0010\u0002\u0018\u0001*\u00020\u0003*\u0002H\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052!\u0010\u0006\u001a\u001d\u0012\u0013\u0012\u0011H\u0002¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00020\u00010\u0007H\u0080\bø\u0001\u0000¢\u0006\u0002\u0010\u000b\u001a\u001f\u0010\f\u001a\u00020\r*\u00020\u00032\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000fH\u0000¢\u0006\u0002\u0010\u0010\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0011"}, d2 = {"equalsImpl", "", "SD", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "other", "", "typeParamsAreEqual", "Lkotlin/Function1;", "Lkotlin/ParameterName;", HintConstants.AUTOFILL_HINT_NAME, "otherDescriptor", "(Lkotlinx/serialization/descriptors/SerialDescriptor;Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)Z", "hashCodeImpl", "", "typeParams", "", "(Lkotlinx/serialization/descriptors/SerialDescriptor;[Lkotlinx/serialization/descriptors/SerialDescriptor;)I", "kotlinx-serialization-core"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class PluginGeneratedSerialDescriptorKt {
    public static final /* synthetic */ <SD extends SerialDescriptor> boolean equalsImpl(SD r7, Object other, Function1<? super SD, Boolean> r9) {
        Intrinsics.checkNotNullParameter(r7, "<this>");
        Intrinsics.checkNotNullParameter(r9, "typeParamsAreEqual");
        if (r7 != other) goto L5;
        return true;
    L5:
        Intrinsics.reifiedOperationMarker(3, "SD");
        if ((other instanceof SerialDescriptor) == true) goto L9;
        return false;
    L9:
        if (Intrinsics.areEqual(r7.getSerialName(), ((SerialDescriptor) other).getSerialName()) == true) goto L12;
        return false;
    L12:
        if (r9.invoke(other).booleanValue() == true) goto L15;
        return false;
    L15:
        if (r7.getElementsCount() == ((SerialDescriptor) other).getElementsCount()) goto L17;
        return false;
    L17:
        int index = 0;
        int r4 = r7.getElementsCount();
    L18:
        if (index >= r4) goto L26;
        if (Intrinsics.areEqual(r7.getElementDescriptor(index).getSerialName(), ((SerialDescriptor) other).getElementDescriptor(index).getSerialName()) == false) goto L21;
        if (Intrinsics.areEqual(r7.getElementDescriptor(index).getKind(), ((SerialDescriptor) other).getElementDescriptor(index).getKind()) == false) goto L24;
        index = index + 1;
        goto L18
    L24:
        return false;
    L21:
        return false;
    L26:
        return true;
    }

    public static final int hashCodeImpl(SerialDescriptor $this$hashCodeImpl, SerialDescriptor[] typeParams) {
        Intrinsics.checkNotNullParameter($this$hashCodeImpl, "<this>");
        Intrinsics.checkNotNullParameter(typeParams, "typeParams");
        int result = $this$hashCodeImpl.getSerialName().hashCode();
        int result2 = (result * 31) + Arrays.hashCode(typeParams);
        Iterable<SerialDescriptor> r0 = SerialDescriptorKt.getElementDescriptors($this$hashCodeImpl);
        int accumulator$iv$iv = 1;
        Iterator<SerialDescriptor> r10 = r0.iterator();
    L3:
        int r12 = 0;
        if (r10.hasNext() == false) goto L9;
        Object element$iv$iv = r10.next();
        int hash$iv = accumulator$iv$iv;
        int r16 = hash$iv * 31;
        SerialDescriptor it = (SerialDescriptor) element$iv$iv;
        String r17 = it.getSerialName();
        if (r17 == null) goto L8;
        r12 = r17.hashCode();
    L8:
        accumulator$iv$iv = r16 + r12;
        goto L3
    L9:
        int accumulator$iv$iv2 = 1;
        Iterator<SerialDescriptor> r11 = r0.iterator();
    L11:
        if (r11.hasNext() == false) goto L18;
        Object element$iv$iv2 = r11.next();
        int hash$iv2 = accumulator$iv$iv2;
        int r18 = hash$iv2 * 31;
        SerialDescriptor it2 = (SerialDescriptor) element$iv$iv2;
        SerialKind r19 = it2.getKind();
        if (r19 == null) goto L15;
        int r110 = r19.hashCode();
    L16:
        accumulator$iv$iv2 = r18 + r110;
        goto L11
    L15:
        r110 = 0;
        goto L16
    L18:
        return (((result2 * 31) + accumulator$iv$iv) * 31) + accumulator$iv$iv2;
    }
}
