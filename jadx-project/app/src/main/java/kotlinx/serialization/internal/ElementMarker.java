package kotlinx.serialization.internal;

import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: compiled from: ElementMarker.kt */
/* JADX INFO: loaded from: classes4.dex */
@CoreFriendModuleApi
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0016\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\b\u0007\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016B)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0018\u0010\u0004\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005¢\u0006\u0004\b\b\u0010\tJ\u000e\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0006J\u0006\u0010\u0011\u001a\u00020\u0006J\u0010\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\u0006H\u0002J\u0010\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0006H\u0002J\b\u0010\u0015\u001a\u00020\u0006H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R \u0010\u0004\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"Lkotlinx/serialization/internal/ElementMarker;", "", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "readIfAbsent", "Lkotlin/Function2;", "", "", "<init>", "(Lkotlinx/serialization/descriptors/SerialDescriptor;Lkotlin/jvm/functions/Function2;)V", "lowerMarks", "", "highMarksArray", "", "mark", "", "index", "nextUnmarkedIndex", "prepareHighMarksArray", "elementsCount", "markHigh", "nextUnmarkedHighIndex", "Companion", "kotlinx-serialization-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ElementMarker {
    private static final Companion Companion = null;
    private static final long[] EMPTY_HIGH_MARKS = null;
    private final SerialDescriptor descriptor;
    private final long[] highMarksArray;
    private long lowerMarks;
    private final Function2<SerialDescriptor, Integer, Boolean> readIfAbsent;

    /* JADX INFO: compiled from: ElementMarker.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0016\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lkotlinx/serialization/internal/ElementMarker$Companion;", "", "<init>", "()V", "EMPTY_HIGH_MARKS", "", "kotlinx-serialization-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker r1) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ElementMarker(SerialDescriptor descriptor, Function2<? super SerialDescriptor, ? super Integer, Boolean> r6) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        Intrinsics.checkNotNullParameter(r6, "readIfAbsent");
        this.descriptor = descriptor;
        this.readIfAbsent = r6;
        int elementsCount = this.descriptor.getElementsCount();
        long r1 = 0;
        if (elementsCount > 64) goto L8;
        if (elementsCount == 64) goto L7;
        r1 = (-1) << elementsCount;
    L7:
        this.lowerMarks = r1;
        this.highMarksArray = EMPTY_HIGH_MARKS;
        return;
    L8:
        this.lowerMarks = 0;
        this.highMarksArray = prepareHighMarksArray(elementsCount);
    }

    static {
        Companion = new Companion(null);
        EMPTY_HIGH_MARKS = new long[0];
    }

    public final void mark(int index) {
        if (index >= 64) goto L5;
        this.lowerMarks |= 1 << index;
        return;
    L5:
        markHigh(index);
    }

    public final int nextUnmarkedIndex() {
        int elementsCount = this.descriptor.getElementsCount();
    L4:
        if (this.lowerMarks == (-1)) goto L9;
        int index = Long.numberOfTrailingZeros(~this.lowerMarks);
        this.lowerMarks |= 1 << index;
        if (this.readIfAbsent.invoke(this.descriptor, Integer.valueOf(index)).booleanValue() == false) goto L4;
        return index;
    L9:
        if (elementsCount > 64) goto L11;
        return -1;
    L11:
        return nextUnmarkedHighIndex();
    }

    private final long[] prepareHighMarksArray(int elementsCount) {
        int slotsCount = (elementsCount - 1) >>> 6;
        int elementsInLastSlot = elementsCount & 63;
        long[] highMarks = new long[slotsCount];
        if (elementsInLastSlot == 0) goto L5;
        highMarks[ArraysKt.getLastIndex(highMarks)] = (-1) << elementsCount;
    L5:
        return highMarks;
    }

    private final void markHigh(int index) {
        int slot = (index >>> 6) - 1;
        int offsetInSlot = index & 63;
        this.highMarksArray[slot] = this.highMarksArray[slot] | (1 << offsetInSlot);
    }

    private final int nextUnmarkedHighIndex() {
        int slot = 0;
        int r1 = this.highMarksArray.length;
    L3:
        if (slot >= r1) goto L12;
        int slotOffset = (slot + 1) * 64;
        long slotMarks = this.highMarksArray[slot];
    L6:
        if (slotMarks == (-1)) goto L11;
        int indexInSlot = Long.numberOfTrailingZeros(~slotMarks);
        slotMarks = slotMarks | (1 << indexInSlot);
        int index = slotOffset + indexInSlot;
        if (this.readIfAbsent.invoke(this.descriptor, Integer.valueOf(index)).booleanValue() == false) goto L6;
        this.highMarksArray[slot] = slotMarks;
        return index;
    L11:
        this.highMarksArray[slot] = slotMarks;
        slot = slot + 1;
        goto L3
    L12:
        return -1;
    }
}
