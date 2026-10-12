package kotlinx.serialization.internal;

import java.util.Iterator;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import kotlin.text.CharsKt;
import kotlin.text.StringsKt;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.PrimitiveKind;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: compiled from: Primitives.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00000\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\u001a\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0000\u001a\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0006\u001a\u00020\u0007H\u0002\u001a\f\u0010\f\u001a\u00020\u0007*\u00020\u0007H\u0002\u001a$\u0010\r\u001a\n\u0012\u0004\u0012\u0002H\u000e\u0018\u00010\u0003\"\b\b\u0000\u0010\u000e*\u00020\u000f*\b\u0012\u0004\u0012\u0002H\u000e0\u0002H\u0000\"\"\u0010\u0000\u001a\u0016\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0002\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00030\u0001X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"BUILTIN_SERIALIZERS", "", "Lkotlin/reflect/KClass;", "Lkotlinx/serialization/KSerializer;", "PrimitiveDescriptorSafe", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialName", "", "kind", "Lkotlinx/serialization/descriptors/PrimitiveKind;", "checkName", "", "capitalize", "builtinSerializerOrNull", "T", "", "kotlinx-serialization-core"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class PrimitivesKt {
    private static final Map<KClass<?>, KSerializer<?>> BUILTIN_SERIALIZERS = null;

    static {
        BUILTIN_SERIALIZERS = PlatformKt.initBuiltins();
    }

    public static final SerialDescriptor PrimitiveDescriptorSafe(String serialName, PrimitiveKind kind) {
        Intrinsics.checkNotNullParameter(serialName, "serialName");
        Intrinsics.checkNotNullParameter(kind, "kind");
        checkName(serialName);
        return new PrimitiveSerialDescriptor(serialName, kind);
    }

    private static final void checkName(String serialName) {
        Iterator<KSerializer<?>> r1 = BUILTIN_SERIALIZERS.values().iterator();
    L4:
        if (r1.hasNext() == false) goto L10;
        KSerializer<?> r2 = r1.next();
        String primitiveName = r2.getDescriptor().getSerialName();
        if (Intrinsics.areEqual(serialName, primitiveName) == false) goto L4;
        throw new IllegalArgumentException(StringsKt.trimIndent("\n                The name of serial descriptor should uniquely identify associated serializer.\n                For serial name " + serialName + " there already exists " + Reflection.getOrCreateKotlinClass(r2.getClass()).getSimpleName() + ".\n                Please refer to SerialDescriptor documentation for additional information.\n            "));
    }

    private static final String capitalize(String $this$capitalize) {
        if ($this$capitalize.length() <= 0) goto L5;
        boolean r0 = true;
    L6:
        if (r0 == false) goto L13;
        StringBuilder r1 = new StringBuilder();
        char it = $this$capitalize.charAt(0);
        if (Character.isLowerCase(it) == false) goto L10;
        String r4 = CharsKt.titlecase(it);
    L11:
        StringBuilder r2 = r1.append(r4);
        String r3 = $this$capitalize.substring(1);
        Intrinsics.checkNotNullExpressionValue(r3, "substring(...)");
        return r2.append(r3).toString();
    L10:
        r4 = String.valueOf(it);
        goto L11
    L13:
        return $this$capitalize;
    L5:
        r0 = false;
        goto L6
    }

    public static final <T> KSerializer<T> builtinSerializerOrNull(KClass<T> r1) {
        Intrinsics.checkNotNullParameter(r1, "<this>");
        return (KSerializer) BUILTIN_SERIALIZERS.get(r1);
    }
}
