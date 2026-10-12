package kotlinx.serialization.internal;

import java.lang.annotation.Annotation;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;

/* JADX INFO: compiled from: Enums.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000$\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0004\n\u0002\u0010\u001b\n\u0002\b\u0006\u001a9\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u000e\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0007H\u0001¢\u0006\u0002\u0010\b\u001a_\u0010\t\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u000e\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u0002H\u00020\u00072\u000e\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00072\u0014\u0010\u000b\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u00070\u0007H\u0001¢\u0006\u0002\u0010\r\u001ao\u0010\u000e\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u000e\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u0002H\u00020\u00072\u000e\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00072\u0014\u0010\u000f\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u00070\u00072\u000e\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u0007H\u0001¢\u0006\u0002\u0010\u0011¨\u0006\u0012"}, d2 = {"createSimpleEnumSerializer", "Lkotlinx/serialization/KSerializer;", "T", "", "serialName", "", "values", "", "(Ljava/lang/String;[Ljava/lang/Enum;)Lkotlinx/serialization/KSerializer;", "createMarkedEnumSerializer", "names", "annotations", "", "(Ljava/lang/String;[Ljava/lang/Enum;[Ljava/lang/String;[[Ljava/lang/annotation/Annotation;)Lkotlinx/serialization/KSerializer;", "createAnnotatedEnumSerializer", "entryAnnotations", "classAnnotations", "(Ljava/lang/String;[Ljava/lang/Enum;[Ljava/lang/String;[[Ljava/lang/annotation/Annotation;[Ljava/lang/annotation/Annotation;)Lkotlinx/serialization/KSerializer;", "kotlinx-serialization-core"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class EnumsKt {
    public static final <T extends Enum<T>> KSerializer<T> createSimpleEnumSerializer(String serialName, T[] r2) {
        Intrinsics.checkNotNullParameter(serialName, "serialName");
        Intrinsics.checkNotNullParameter(r2, "values");
        return new EnumSerializer(serialName, r2);
    }

    public static final <T extends Enum<T>> KSerializer<T> createMarkedEnumSerializer(String serialName, T[] r22, String[] names, Annotation[][] annotations) {
        String[] r2 = names;
        Intrinsics.checkNotNullParameter(serialName, "serialName");
        Intrinsics.checkNotNullParameter(r22, "values");
        Intrinsics.checkNotNullParameter(r2, "names");
        Intrinsics.checkNotNullParameter(annotations, "annotations");
        EnumDescriptor descriptor = new EnumDescriptor(serialName, r22.length);
        T[] r5 = r22;
        int index$iv = 0;
        int r8 = r5.length;
        int r10 = 0;
    L3:
        if (r10 >= r8) goto L15;
        T r11 = r5[r10];
        int index$iv2 = index$iv + 1;
        String elementName = (String) ArraysKt.getOrNull(r2, index$iv);
        if (elementName != null) goto L7;
        elementName = r11.name();
    L7:
        T[] r16 = r5;
        int r6 = 0;
        PluginGeneratedSerialDescriptor.addElement$default(descriptor, elementName, false, 2, null);
        Annotation[] r3 = (Annotation[]) ArraysKt.getOrNull(annotations, index$iv);
        if (r3 == null) goto L13;
        int r9 = r3.length;
    L10:
        if (r6 >= r9) goto L13;
        descriptor.pushAnnotation(r3[r6]);
        r6 = r6 + 1;
        r3 = r3;
    L13:
        r10 = r10 + 1;
        r2 = names;
        index$iv = index$iv2;
        r5 = r16;
        goto L3
    L15:
        return new EnumSerializer(serialName, r22, descriptor);
    }

    public static final <T extends Enum<T>> KSerializer<T> createAnnotatedEnumSerializer(String serialName, T[] r22, String[] names, Annotation[][] entryAnnotations, Annotation[] classAnnotations) {
        String[] r2 = names;
        Intrinsics.checkNotNullParameter(serialName, "serialName");
        Intrinsics.checkNotNullParameter(r22, "values");
        Intrinsics.checkNotNullParameter(r2, "names");
        Intrinsics.checkNotNullParameter(entryAnnotations, "entryAnnotations");
        EnumDescriptor descriptor = new EnumDescriptor(serialName, r22.length);
        if (classAnnotations == null) goto L8;
        int r8 = classAnnotations.length;
        int r9 = 0;
    L5:
        if (r9 >= r8) goto L8;
        descriptor.pushClassAnnotation(classAnnotations[r9]);
        r9 = r9 + 1;
    L8:
        T[] r6 = r22;
        int index$iv = 0;
        int r10 = r6.length;
        int r11 = 0;
    L9:
        if (r11 >= r10) goto L21;
        T r12 = r6[r11];
        int index$iv2 = index$iv + 1;
        String elementName = (String) ArraysKt.getOrNull(r2, index$iv);
        if (elementName != null) goto L13;
        elementName = r12.name();
    L13:
        T[] r16 = r6;
        int r7 = 0;
        PluginGeneratedSerialDescriptor.addElement$default(descriptor, elementName, false, 2, null);
        Annotation[] r3 = (Annotation[]) ArraysKt.getOrNull(entryAnnotations, index$iv);
        if (r3 == null) goto L19;
        int r5 = r3.length;
    L16:
        if (r7 >= r5) goto L19;
        descriptor.pushAnnotation(r3[r7]);
        r7 = r7 + 1;
        r3 = r3;
    L19:
        r11 = r11 + 1;
        r2 = names;
        index$iv = index$iv2;
        r6 = r16;
        goto L9
    L21:
        return new EnumSerializer(serialName, r22, descriptor);
    }
}
