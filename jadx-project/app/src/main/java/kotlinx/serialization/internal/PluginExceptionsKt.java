package kotlinx.serialization.internal;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.InternalSerializationApi;
import kotlinx.serialization.MissingFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: compiled from: PluginExceptions.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000 \n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0002\b\u0002\u001a \u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\u0007\u001a \u0010\u0007\u001a\u00020\u00012\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u0006H\u0007¨\u0006\u000b"}, d2 = {"throwMissingFieldException", "", "seen", "", "goldenMask", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "throwArrayMissingFieldException", "seenArray", "", "goldenMaskArray", "kotlinx-serialization-core"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class PluginExceptionsKt {
    @InternalSerializationApi
    public static final void throwMissingFieldException(int seen, int goldenMask, SerialDescriptor descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        List missingFields = new ArrayList();
        int missingFieldsBits = (~seen) & goldenMask;
        int i = 0;
    L4:
        if (i >= 32) goto L10;
        if ((missingFieldsBits & 1) == 0) goto L8;
        missingFields.add(descriptor.getElementName(i));
    L8:
        missingFieldsBits = missingFieldsBits >>> 1;
        i = i + 1;
        goto L4
    L10:
        throw new MissingFieldException(missingFields, descriptor.getSerialName());
    }

    @InternalSerializationApi
    public static final void throwArrayMissingFieldException(int[] seenArray, int[] goldenMaskArray, SerialDescriptor descriptor) {
        Intrinsics.checkNotNullParameter(seenArray, "seenArray");
        Intrinsics.checkNotNullParameter(goldenMaskArray, "goldenMaskArray");
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        List missingFields = new ArrayList();
        int maskSlot = 0;
        int r2 = goldenMaskArray.length;
    L3:
        if (maskSlot >= r2) goto L15;
        int missingFieldsBits = goldenMaskArray[maskSlot] & (~seenArray[maskSlot]);
        if (missingFieldsBits == 0) goto L13;
        int i = 0;
    L8:
        if (i >= 32) goto L13;
        if ((missingFieldsBits & 1) == 0) goto L12;
        missingFields.add(descriptor.getElementName((maskSlot * 32) + i));
    L12:
        missingFieldsBits = missingFieldsBits >>> 1;
        i = i + 1;
    L13:
        maskSlot = maskSlot + 1;
        goto L3
    L15:
        throw new MissingFieldException(missingFields, descriptor.getSerialName());
    }
}
