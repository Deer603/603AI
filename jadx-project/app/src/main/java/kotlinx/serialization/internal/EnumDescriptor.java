package kotlinx.serialization.internal;

import androidx.autofill.HintConstants;
import java.util.Iterator;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.SerialDescriptorKt;
import kotlinx.serialization.descriptors.SerialDescriptorsKt;
import kotlinx.serialization.descriptors.SerialKind;
import kotlinx.serialization.descriptors.StructureKind;

/* JADX INFO: compiled from: Enums.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u0005H\u0016J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0096\u0002J\b\u0010\u0019\u001a\u00020\u0003H\u0016J\b\u0010\u001a\u001a\u00020\u0005H\u0016R\u0014\u0010\b\u001a\u00020\tX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR!\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001b"}, d2 = {"Lkotlinx/serialization/internal/EnumDescriptor;", "Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;", HintConstants.AUTOFILL_HINT_NAME, "", "elementsCount", "", "<init>", "(Ljava/lang/String;I)V", "kind", "Lkotlinx/serialization/descriptors/SerialKind;", "getKind", "()Lkotlinx/serialization/descriptors/SerialKind;", "elementDescriptors", "", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getElementDescriptors", "()[Lkotlinx/serialization/descriptors/SerialDescriptor;", "elementDescriptors$delegate", "Lkotlin/Lazy;", "getElementDescriptor", "index", "equals", "", "other", "", "toString", "hashCode", "kotlinx-serialization-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class EnumDescriptor extends PluginGeneratedSerialDescriptor {
    private final Lazy elementDescriptors$delegate;
    private final SerialKind kind;

    public EnumDescriptor(final String name, final int elementsCount) {
        Intrinsics.checkNotNullParameter(name, HintConstants.AUTOFILL_HINT_NAME);
        super(name, null, elementsCount, 2, null);
        this.kind = SerialKind.ENUM.INSTANCE;
        this.elementDescriptors$delegate = LazyKt.lazy(new EnumDescriptor$$ExternalSyntheticLambda0(elementsCount, name, this));
    }

    @Override // kotlinx.serialization.internal.PluginGeneratedSerialDescriptor, kotlinx.serialization.descriptors.SerialDescriptor
    public SerialKind getKind() {
        return this.kind;
    }

    private final SerialDescriptor[] getElementDescriptors() {
        return (SerialDescriptor[]) this.elementDescriptors$delegate.getValue();
    }

    static final SerialDescriptor[] elementDescriptors_delegate$lambda$0(int $elementsCount, String $name, EnumDescriptor this$0) {
        SerialDescriptor[] r0 = new SerialDescriptor[$elementsCount];
        int r2 = 0;
    L3:
        if (r2 >= $elementsCount) goto L5;
        r0[r2] = SerialDescriptorsKt.buildSerialDescriptor$default($name + '.' + this$0.getElementName(r2), StructureKind.OBJECT.INSTANCE, new SerialDescriptor[0], null, 8, null);
        r2 = r2 + 1;
        goto L3
    L5:
        return r0;
    }

    @Override // kotlinx.serialization.internal.PluginGeneratedSerialDescriptor, kotlinx.serialization.descriptors.SerialDescriptor
    public SerialDescriptor getElementDescriptor(int index) {
        return getElementDescriptors()[index];
    }

    @Override // kotlinx.serialization.internal.PluginGeneratedSerialDescriptor
    public boolean equals(Object other) {
        if (this != other) goto L6;
        return true;
    L6:
        if (other != null) goto L9;
        return false;
    L9:
        if ((other instanceof SerialDescriptor) == true) goto L12;
        return false;
    L12:
        if (((SerialDescriptor) other).getKind() == SerialKind.ENUM.INSTANCE) goto L15;
        return false;
    L15:
        if (Intrinsics.areEqual(getSerialName(), ((SerialDescriptor) other).getSerialName()) == true) goto L18;
        return false;
    L18:
        if (Intrinsics.areEqual(Platform_commonKt.cachedSerialNames(this), Platform_commonKt.cachedSerialNames((SerialDescriptor) other)) == true) goto L20;
        return false;
    L20:
        return true;
    }

    @Override // kotlinx.serialization.internal.PluginGeneratedSerialDescriptor
    public String toString() {
        return CollectionsKt.joinToString$default(SerialDescriptorKt.getElementNames(this), ", ", getSerialName() + '(', ")", 0, null, null, 56, null);
    }

    @Override // kotlinx.serialization.internal.PluginGeneratedSerialDescriptor
    public int hashCode() {
        int result = getSerialName().hashCode();
        int accumulator$iv$iv = 1;
        Iterator<String> r7 = SerialDescriptorKt.getElementNames(this).iterator();
    L4:
        if (r7.hasNext() == false) goto L11;
        Object element$iv$iv = r7.next();
        int hash$iv = accumulator$iv$iv;
        int r12 = hash$iv * 31;
        String it = (String) element$iv$iv;
        if (it == null) goto L8;
        int r13 = it.hashCode();
    L9:
        accumulator$iv$iv = r12 + r13;
        goto L4
    L8:
        r13 = 0;
        goto L9
    L11:
        return (result * 31) + accumulator$iv$iv;
    }
}
