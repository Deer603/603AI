package kotlinx.serialization.descriptors;

import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.markers.KMappedMarker;

/* JADX INFO: compiled from: SerialDescriptor.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u001d\n\u0000\n\u0002\u0010(\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\t\u0010\u0005\u001a\u00020\u0006H\u0096\u0002J\t\u0010\u0007\u001a\u00020\u0002H\u0096\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"kotlinx/serialization/descriptors/SerialDescriptorKt$elementNames$1$1", "", "", "elementsLeft", "", "hasNext", "", "next", "kotlinx-serialization-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class SerialDescriptorKt$elementNames$1$1 implements Iterator<String>, KMappedMarker {
    final /* synthetic */ SerialDescriptor $this_elementNames;
    private int elementsLeft;

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    SerialDescriptorKt$elementNames$1$1(SerialDescriptor $receiver) {
        this.$this_elementNames = $receiver;
        this.elementsLeft = $receiver.getElementsCount();
    }

    @Override // java.util.Iterator
    public /* bridge */ /* synthetic */ String next() {
        return next2();
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        if (this.elementsLeft <= 0) goto L5;
        return true;
    L5:
        return false;
    }

    @Override // java.util.Iterator
    /* JADX INFO: renamed from: next, reason: avoid collision after fix types in other method */
    public String next2() {
        SerialDescriptor r0 = this.$this_elementNames;
        int r1 = this.$this_elementNames.getElementsCount();
        int r2 = this.elementsLeft;
        this.elementsLeft = r2 - 1;
        return r0.getElementName(r1 - r2);
    }
}
