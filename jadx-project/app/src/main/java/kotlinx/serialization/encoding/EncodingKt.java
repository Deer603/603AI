package kotlinx.serialization.encoding;

import androidx.autofill.HintConstants;
import java.util.Collection;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: compiled from: Encoding.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a3\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0019\b\u0004\u0010\u0005\u001a\u0013\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00010\u0006¢\u0006\u0002\b\bH\u0086\bø\u0001\u0000\u001a;\u0010\t\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u000b2\u0019\b\u0004\u0010\u0005\u001a\u0013\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00010\u0006¢\u0006\u0002\b\bH\u0086\bø\u0001\u0000\u001ab\u0010\t\u001a\u00020\u0001\"\u0004\b\u0000\u0010\f*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\f\u0010\r\u001a\b\u0012\u0004\u0012\u0002H\f0\u000e24\b\u0004\u0010\u0005\u001a.\u0012\u0004\u0012\u00020\u0007\u0012\u0013\u0012\u00110\u000b¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u0012\u0012\u0004\u0012\u0002H\f\u0012\u0004\u0012\u00020\u00010\u000f¢\u0006\u0002\b\bH\u0086\bø\u0001\u0000\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0013"}, d2 = {"encodeStructure", "", "Lkotlinx/serialization/encoding/Encoder;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "block", "Lkotlin/Function1;", "Lkotlinx/serialization/encoding/CompositeEncoder;", "Lkotlin/ExtensionFunctionType;", "encodeCollection", "collectionSize", "", "E", "collection", "", "Lkotlin/Function3;", "Lkotlin/ParameterName;", HintConstants.AUTOFILL_HINT_NAME, "index", "kotlinx-serialization-core"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class EncodingKt {
    public static final void encodeStructure(Encoder $this$encodeStructure, SerialDescriptor descriptor, Function1<? super CompositeEncoder, Unit> r4) {
        Intrinsics.checkNotNullParameter($this$encodeStructure, "<this>");
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        Intrinsics.checkNotNullParameter(r4, "block");
        CompositeEncoder composite = $this$encodeStructure.beginStructure(descriptor);
        r4.invoke(composite);
        composite.endStructure(descriptor);
    }

    public static final void encodeCollection(Encoder $this$encodeCollection, SerialDescriptor descriptor, int collectionSize, Function1<? super CompositeEncoder, Unit> r5) {
        Intrinsics.checkNotNullParameter($this$encodeCollection, "<this>");
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        Intrinsics.checkNotNullParameter(r5, "block");
        CompositeEncoder composite = $this$encodeCollection.beginCollection(descriptor, collectionSize);
        r5.invoke(composite);
        composite.endStructure(descriptor);
    }

    public static final <E> void encodeCollection(Encoder $this$encodeCollection, SerialDescriptor descriptor, Collection<? extends E> r22, Function3<? super CompositeEncoder, ? super Integer, ? super E, Unit> r23) {
        Intrinsics.checkNotNullParameter($this$encodeCollection, "<this>");
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        Intrinsics.checkNotNullParameter(r22, "collection");
        Intrinsics.checkNotNullParameter(r23, "block");
        int $i$f$encodeCollection = 0;
        int collectionSize$iv = r22.size();
        CompositeEncoder composite$iv = $this$encodeCollection.beginCollection(descriptor, collectionSize$iv);
        Collection<? extends E> $this$forEachIndexed$iv = r22;
        int index$iv = 0;
        Iterator r14 = $this$forEachIndexed$iv.iterator();
    L4:
        if (r14.hasNext() == false) goto L9;
        Object item$iv = r14.next();
        int index$iv2 = index$iv + 1;
        if (index$iv >= 0) goto L8;
        CollectionsKt.throwIndexOverflow();
    L8:
        r23.invoke(composite$iv, Integer.valueOf(index$iv), item$iv);
        index$iv = index$iv2;
        $i$f$encodeCollection = $i$f$encodeCollection;
        goto L4
    L9:
        composite$iv.endStructure(descriptor);
    }
}
