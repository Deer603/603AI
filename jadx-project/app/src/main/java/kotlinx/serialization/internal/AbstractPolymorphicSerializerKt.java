package kotlinx.serialization.internal;

import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;
import kotlinx.serialization.SerializationException;

/* JADX INFO: compiled from: AbstractPolymorphicSerializer.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u001e\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u0005H\u0001\u001a \u0010\u0000\u001a\u00020\u00012\n\u0010\u0006\u001a\u0006\u0012\u0002\b\u00030\u00052\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u0005H\u0001¨\u0006\u0007"}, d2 = {"throwSubtypeNotRegistered", "", "subClassName", "", "baseClass", "Lkotlin/reflect/KClass;", "subClass", "kotlinx-serialization-core"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class AbstractPolymorphicSerializerKt {
    public static final Void throwSubtypeNotRegistered(String subClassName, KClass<?> r5) {
        Intrinsics.checkNotNullParameter(r5, "baseClass");
        String scope = "in the polymorphic scope of '" + r5.getSimpleName() + '\'';
        if (subClassName != null) goto L5;
        String r2 = "Class discriminator was missing and no default serializers were registered " + scope + '.';
    L7:
        throw new SerializationException(r2);
    L5:
        r2 = "Serializer for subclass '" + subClassName + "' is not found " + scope + ".\nCheck if class with serial name '" + subClassName + "' exists and serializer is registered in a corresponding SerializersModule.\nTo be registered automatically, class '" + subClassName + "' has to be '@Serializable', and the base class '" + r5.getSimpleName() + "' has to be sealed and '@Serializable'.";
        goto L7
    }

    public static final Void throwSubtypeNotRegistered(KClass<?> r1, KClass<?> r2) {
        Intrinsics.checkNotNullParameter(r1, "subClass");
        Intrinsics.checkNotNullParameter(r2, "baseClass");
        String r0 = r1.getSimpleName();
        if (r0 != null) goto L5;
        r0 = String.valueOf(r1);
    L5:
        throwSubtypeNotRegistered(r0, r2);
        throw new KotlinNothingValueException();
    }
}
