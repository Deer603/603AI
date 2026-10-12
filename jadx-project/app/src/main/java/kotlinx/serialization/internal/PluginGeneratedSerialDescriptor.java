package kotlinx.serialization.internal;

import androidx.autofill.HintConstants;
import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.SerialKind;
import kotlinx.serialization.descriptors.StructureKind;

/* JADX INFO: compiled from: PluginGeneratedSerialDescriptor.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u001b\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0003\n\u0002\u0010\u0018\n\u0000\n\u0002\u0010\"\n\u0002\b\u0003\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0011\u0018\u00002\u00020\u00012\u00020\u0002B'\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\u0018\u00105\u001a\u0002062\u0006\u00107\u001a\u00020\u00042\b\b\u0002\u00108\u001a\u000209J\u000e\u0010:\u001a\u0002062\u0006\u0010;\u001a\u00020\u0015J\u000e\u0010<\u001a\u0002062\u0006\u0010=\u001a\u00020\u0015J\u0010\u0010>\u001a\u00020\u00012\u0006\u0010?\u001a\u00020\bH\u0016J\u0010\u0010@\u001a\u0002092\u0006\u0010?\u001a\u00020\bH\u0016J\u0016\u0010A\u001a\b\u0012\u0004\u0012\u00020\u00150\u00142\u0006\u0010?\u001a\u00020\bH\u0016J\u0010\u0010B\u001a\u00020\u00042\u0006\u0010?\u001a\u00020\bH\u0016J\u0010\u0010C\u001a\u00020\b2\u0006\u00107\u001a\u00020\u0004H\u0016J\u0014\u0010D\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\b0'H\u0002J\u0013\u0010E\u001a\u0002092\b\u0010F\u001a\u0004\u0018\u00010GH\u0096\u0002J\b\u0010H\u001a\u00020\bH\u0016J\b\u0010I\u001a\u00020\u0004H\u0016R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\u0005\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u000f\u001a\u00020\u00108VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00150\u00148VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017R\u000e\u0010\u0018\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00040\u001aX\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u001bR\u001e\u0010\u001c\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u001d0\u001aX\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u001eR\u0016\u0010\u001f\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u001dX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020!X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00040#8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b$\u0010%R\u001a\u0010&\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\b0'X\u0082\u000e¢\u0006\u0002\n\u0000R%\u0010(\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030)0\u001a8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b*\u0010+R!\u0010.\u001a\b\u0012\u0004\u0012\u00020\u00010\u001a8@X\u0080\u0084\u0002¢\u0006\f\n\u0004\b1\u0010-\u001a\u0004\b/\u00100R\u001b\u00102\u001a\u00020\b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b4\u0010-\u001a\u0004\b3\u0010\u000e¨\u0006J"}, d2 = {"Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "Lkotlinx/serialization/internal/CachedNames;", "serialName", "", "generatedSerializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "elementsCount", "", "<init>", "(Ljava/lang/String;Lkotlinx/serialization/internal/GeneratedSerializer;I)V", "getSerialName", "()Ljava/lang/String;", "getElementsCount", "()I", "kind", "Lkotlinx/serialization/descriptors/SerialKind;", "getKind", "()Lkotlinx/serialization/descriptors/SerialKind;", "annotations", "", "", "getAnnotations", "()Ljava/util/List;", "added", "names", "", "[Ljava/lang/String;", "propertiesAnnotations", "", "[Ljava/util/List;", "classAnnotations", "elementsOptionality", "", "serialNames", "", "getSerialNames", "()Ljava/util/Set;", "indices", "", "childSerializers", "Lkotlinx/serialization/KSerializer;", "getChildSerializers", "()[Lkotlinx/serialization/KSerializer;", "childSerializers$delegate", "Lkotlin/Lazy;", "typeParameterDescriptors", "getTypeParameterDescriptors$kotlinx_serialization_core", "()[Lkotlinx/serialization/descriptors/SerialDescriptor;", "typeParameterDescriptors$delegate", "_hashCode", "get_hashCode", "_hashCode$delegate", "addElement", "", HintConstants.AUTOFILL_HINT_NAME, "isOptional", "", "pushAnnotation", "annotation", "pushClassAnnotation", "a", "getElementDescriptor", "index", "isElementOptional", "getElementAnnotations", "getElementName", "getElementIndex", "buildIndices", "equals", "other", "", "hashCode", "toString", "kotlinx-serialization-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
public class PluginGeneratedSerialDescriptor implements SerialDescriptor, CachedNames {
    private final Lazy _hashCode$delegate;
    private int added;
    private final Lazy childSerializers$delegate;
    private List<Annotation> classAnnotations;
    private final int elementsCount;
    private final boolean[] elementsOptionality;
    private final GeneratedSerializer<?> generatedSerializer;
    private Map<String, Integer> indices;
    private final String[] names;
    private final List<Annotation>[] propertiesAnnotations;
    private final String serialName;
    private final Lazy typeParameterDescriptors$delegate;

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public boolean isInline() {
        return SerialDescriptor.DefaultImpls.isInline(this);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public boolean isNullable() {
        return SerialDescriptor.DefaultImpls.isNullable(this);
    }

    public PluginGeneratedSerialDescriptor(String serialName, GeneratedSerializer<?> r6, int elementsCount) {
        Intrinsics.checkNotNullParameter(serialName, "serialName");
        this.serialName = serialName;
        this.generatedSerializer = r6;
        this.elementsCount = elementsCount;
        this.added = -1;
        int r0 = this.elementsCount;
        String[] r1 = new String[r0];
        int r2 = 0;
    L3:
        if (r2 >= r0) goto L5;
        r1[r2] = "[UNINITIALIZED]";
        r2 = r2 + 1;
        goto L3
    L5:
        this.names = r1;
        this.propertiesAnnotations = new List[this.elementsCount];
        this.elementsOptionality = new boolean[this.elementsCount];
        this.indices = MapsKt.emptyMap();
        this.childSerializers$delegate = LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, new PluginGeneratedSerialDescriptor$$ExternalSyntheticLambda1(this));
        this.typeParameterDescriptors$delegate = LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, new PluginGeneratedSerialDescriptor$$ExternalSyntheticLambda2(this));
        this._hashCode$delegate = LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, new PluginGeneratedSerialDescriptor$$ExternalSyntheticLambda3(this));
    }

    public /* synthetic */ PluginGeneratedSerialDescriptor(String r1, GeneratedSerializer r2, int r3, int r4, DefaultConstructorMarker r5) {
        if ((r4 & 2) == 0) goto L5;
        r2 = null;
    L5:
        this(r1, r2, r3);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public String getSerialName() {
        return this.serialName;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final int getElementsCount() {
        return this.elementsCount;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public SerialKind getKind() {
        return StructureKind.CLASS.INSTANCE;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public List<Annotation> getAnnotations() {
        List<Annotation> r0 = this.classAnnotations;
        if (r0 == null) goto L5;
        return r0;
    L5:
        return CollectionsKt.emptyList();
    }

    @Override // kotlinx.serialization.internal.CachedNames
    public Set<String> getSerialNames() {
        return this.indices.keySet();
    }

    static final KSerializer[] childSerializers_delegate$lambda$0(PluginGeneratedSerialDescriptor this$0) {
        GeneratedSerializer<?> r0 = this$0.generatedSerializer;
        if (r0 == null) goto L7;
        KSerializer<?>[] r1 = r0.childSerializers();
        if (r1 == null) goto L7;
        return r1;
    L7:
        return PluginHelperInterfacesKt.EMPTY_SERIALIZER_ARRAY;
    }

    private final KSerializer<?>[] getChildSerializers() {
        return (KSerializer[]) this.childSerializers$delegate.getValue();
    }

    public final SerialDescriptor[] getTypeParameterDescriptors$kotlinx_serialization_core() {
        return (SerialDescriptor[]) this.typeParameterDescriptors$delegate.getValue();
    }

    static final SerialDescriptor[] typeParameterDescriptors_delegate$lambda$2(PluginGeneratedSerialDescriptor this$0) {
        GeneratedSerializer<?> r0 = this$0.generatedSerializer;
        if (r0 == null) goto L10;
        KSerializer<?>[] r1 = r0.typeParametersSerializers();
        if (r1 == null) goto L10;
        Collection destination$iv$iv = new ArrayList(r1.length);
        int r5 = r1.length;
        int r6 = 0;
    L7:
        if (r6 >= r5) goto L9;
        destination$iv$iv.add(r1[r6].getDescriptor());
        r6 = r6 + 1;
        goto L7
    L9:
        ArrayList r2 = (List) destination$iv$iv;
    L12:
        return Platform_commonKt.compactArray(r2);
    L10:
        r2 = null;
        goto L12
    }

    static final int _hashCode_delegate$lambda$3(PluginGeneratedSerialDescriptor this$0) {
        return PluginGeneratedSerialDescriptorKt.hashCodeImpl(this$0, this$0.getTypeParameterDescriptors$kotlinx_serialization_core());
    }

    private final int get_hashCode() {
        return ((Number) this._hashCode$delegate.getValue()).intValue();
    }

    public static /* synthetic */ void addElement$default(PluginGeneratedSerialDescriptor r0, String r1, boolean r2, int r3, Object r4) {
        if (r4 != null) goto L9;
        if ((r3 & 2) == 0) goto L6;
        r2 = false;
    L6:
        r0.addElement(r1, r2);
        return;
    L9:
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: addElement");
    }

    public final void addElement(String name, boolean isOptional) {
        Intrinsics.checkNotNullParameter(name, HintConstants.AUTOFILL_HINT_NAME);
        String[] r0 = this.names;
        this.added++;
        r0[this.added] = name;
        this.elementsOptionality[this.added] = isOptional;
        this.propertiesAnnotations[this.added] = null;
        if (this.added != (this.elementsCount - 1)) goto L6;
        this.indices = buildIndices();
        return;
    }

    public final void pushAnnotation(Annotation annotation) {
        Intrinsics.checkNotNullParameter(annotation, "annotation");
        List<Annotation> r0 = this.propertiesAnnotations[this.added];
        if (r0 != null) goto L5;
        ArrayList result = new ArrayList(1);
        this.propertiesAnnotations[this.added] = result;
        ArrayList r2 = result;
    L6:
        r2.add(annotation);
        return;
    L5:
        r2 = r0;
        goto L6
    }

    public final void pushClassAnnotation(Annotation a) {
        Intrinsics.checkNotNullParameter(a, "a");
        if (this.classAnnotations != null) goto L5;
        this.classAnnotations = new ArrayList(1);
    L5:
        List<Annotation> r0 = this.classAnnotations;
        Intrinsics.checkNotNull(r0);
        r0.add(a);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public SerialDescriptor getElementDescriptor(int index) {
        return getChildSerializers()[index].getDescriptor();
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public boolean isElementOptional(int index) {
        boolean[] $this$getChecked$iv = this.elementsOptionality;
        return $this$getChecked$iv[index];
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public List<Annotation> getElementAnnotations(int index) {
        List<Annotation> r0 = this.propertiesAnnotations[index];
        if (r0 == null) goto L5;
        return r0;
    L5:
        return CollectionsKt.emptyList();
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public String getElementName(int index) {
        return this.names[index];
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public int getElementIndex(String name) {
        Intrinsics.checkNotNullParameter(name, HintConstants.AUTOFILL_HINT_NAME);
        Integer r0 = this.indices.get(name);
        if (r0 != null) goto L7;
        return -3;
    L7:
        return r0.intValue();
    }

    private final Map<String, Integer> buildIndices() {
        HashMap indices = new HashMap();
        int i = 0;
        int r2 = this.names.length;
    L3:
        if (i >= r2) goto L6;
        Integer r3 = Integer.valueOf(i);
        indices.put(this.names[i], r3);
        i = i + 1;
        goto L3
    L6:
        return indices;
    }

    public boolean equals(Object other) {
        PluginGeneratedSerialDescriptor $this$equalsImpl$iv = this;
        if ($this$equalsImpl$iv != other) goto L6;
        return true;
    L6:
        if ((other instanceof PluginGeneratedSerialDescriptor) == true) goto L9;
        return false;
    L9:
        if (Intrinsics.areEqual($this$equalsImpl$iv.getSerialName(), ((SerialDescriptor) other).getSerialName()) == false) goto L31;
        PluginGeneratedSerialDescriptor otherDescriptor = (PluginGeneratedSerialDescriptor) other;
        if (Arrays.equals(getTypeParameterDescriptors$kotlinx_serialization_core(), otherDescriptor.getTypeParameterDescriptors$kotlinx_serialization_core()) == true) goto L15;
        return false;
    L15:
        if ($this$equalsImpl$iv.getElementsCount() != ((SerialDescriptor) other).getElementsCount()) goto L33;
        int index$iv = 0;
        int r5 = $this$equalsImpl$iv.getElementsCount();
    L18:
        if (index$iv >= r5) goto L37;
        if (Intrinsics.areEqual($this$equalsImpl$iv.getElementDescriptor(index$iv).getSerialName(), ((SerialDescriptor) other).getElementDescriptor(index$iv).getSerialName()) == false) goto L34;
        if (Intrinsics.areEqual($this$equalsImpl$iv.getElementDescriptor(index$iv).getKind(), ((SerialDescriptor) other).getElementDescriptor(index$iv).getKind()) == false) goto L35;
        index$iv = index$iv + 1;
        goto L18
    L35:
        return false;
    L34:
        return false;
    L37:
        return true;
    L33:
        return false;
    L31:
        return false;
    }

    public int hashCode() {
        return get_hashCode();
    }

    public String toString() {
        return CollectionsKt.joinToString$default(RangesKt.until(0, this.elementsCount), ", ", getSerialName() + '(', ")", 0, null, new PluginGeneratedSerialDescriptor$$ExternalSyntheticLambda0(this), 24, null);
    }

    static final CharSequence toString$lambda$6(PluginGeneratedSerialDescriptor this$0, int i) {
        return this$0.getElementName(i) + ": " + this$0.getElementDescriptor(i).getSerialName();
    }
}
