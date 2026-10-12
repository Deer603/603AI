package kotlin.jvm.internal;

import androidx.webkit.ProxyConfig;
import java.lang.annotation.Annotation;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmClassMappingKt;
import kotlin.reflect.KClass;
import kotlin.reflect.KClassifier;
import kotlin.reflect.KType;
import kotlin.reflect.KTypeProjection;
import kotlin.reflect.KVariance;
import kotlinx.serialization.internal.CollectionDescriptorsKt;

/* JADX INFO: compiled from: TypeReference.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0010\u001b\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 *2\u00020\u0001:\u0001*B1\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0001\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bB'\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\f\u001a\u00020\r¢\u0006\u0004\b\n\u0010\u000eJ\u0013\u0010\u001e\u001a\u00020\r2\b\u0010\u001f\u001a\u0004\u0018\u00010 H\u0096\u0002J\b\u0010!\u001a\u00020\tH\u0016J\b\u0010\"\u001a\u00020#H\u0016J\u0010\u0010$\u001a\u00020#2\u0006\u0010%\u001a\u00020\rH\u0002J\f\u0010$\u001a\u00020#*\u00020\u0006H\u0002R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u001e\u0010\u0007\u001a\u0004\u0018\u00010\u00018\u0000X\u0081\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001c\u0010\b\u001a\u00020\t8\u0000X\u0081\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0017\u0010\u0014\u001a\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001b0\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u0012R\u0014\u0010\f\u001a\u00020\r8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\u001dR\u001c\u0010&\u001a\u00020#*\u0006\u0012\u0002\b\u00030'8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b(\u0010)¨\u0006+"}, d2 = {"Lkotlin/jvm/internal/TypeReference;", "Lkotlin/reflect/KType;", "classifier", "Lkotlin/reflect/KClassifier;", "arguments", "", "Lkotlin/reflect/KTypeProjection;", "platformTypeUpperBound", "flags", "", "<init>", "(Lkotlin/reflect/KClassifier;Ljava/util/List;Lkotlin/reflect/KType;I)V", "isMarkedNullable", "", "(Lkotlin/reflect/KClassifier;Ljava/util/List;Z)V", "getClassifier", "()Lkotlin/reflect/KClassifier;", "getArguments", "()Ljava/util/List;", "getPlatformTypeUpperBound$kotlin_stdlib$annotations", "()V", "getPlatformTypeUpperBound$kotlin_stdlib", "()Lkotlin/reflect/KType;", "getFlags$kotlin_stdlib$annotations", "getFlags$kotlin_stdlib", "()I", "annotations", "", "getAnnotations", "()Z", "equals", "other", "", "hashCode", "toString", "", "asString", "convertPrimitiveToWrapper", "arrayClassName", "Ljava/lang/Class;", "getArrayClassName", "(Ljava/lang/Class;)Ljava/lang/String;", "Companion", "kotlin-stdlib"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class TypeReference implements KType {
    public static final Companion Companion = null;
    public static final int IS_MARKED_NULLABLE = 1;
    public static final int IS_MUTABLE_COLLECTION_TYPE = 2;
    public static final int IS_NOTHING_TYPE = 4;
    private final List<KTypeProjection> arguments;
    private final KClassifier classifier;
    private final int flags;
    private final KType platformTypeUpperBound;

    /* JADX INFO: compiled from: TypeReference.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0080T¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lkotlin/jvm/internal/TypeReference$Companion;", "", "<init>", "()V", "IS_MARKED_NULLABLE", "", "IS_MUTABLE_COLLECTION_TYPE", "IS_NOTHING_TYPE", "kotlin-stdlib"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker r1) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX INFO: compiled from: TypeReference.kt */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0 = null;

        static {
            int[] r0 = new int[KVariance.values().length];
            r0[KVariance.INVARIANT.ordinal()] = 1;     // Catch: NoSuchFieldError -> L5
        L14:
            r0[KVariance.IN.ordinal()] = 2;     // Catch: NoSuchFieldError -> L8
        L16:
            r0[KVariance.OUT.ordinal()] = 3;     // Catch: NoSuchFieldError -> L11
        L12:
            $EnumSwitchMapping$0 = r0;
        }
    }

    static {
        Companion = new Companion(null);
    }

    public static /* synthetic */ void getFlags$kotlin_stdlib$annotations() {
    }

    public static /* synthetic */ void getPlatformTypeUpperBound$kotlin_stdlib$annotations() {
    }

    public TypeReference(KClassifier classifier, List<KTypeProjection> r3, KType platformTypeUpperBound, int flags) {
        Intrinsics.checkNotNullParameter(classifier, "classifier");
        Intrinsics.checkNotNullParameter(r3, "arguments");
        this.classifier = classifier;
        this.arguments = r3;
        this.platformTypeUpperBound = platformTypeUpperBound;
        this.flags = flags;
    }

    @Override // kotlin.reflect.KType
    public KClassifier getClassifier() {
        return this.classifier;
    }

    @Override // kotlin.reflect.KType
    public List<KTypeProjection> getArguments() {
        return this.arguments;
    }

    public final KType getPlatformTypeUpperBound$kotlin_stdlib() {
        return this.platformTypeUpperBound;
    }

    public final int getFlags$kotlin_stdlib() {
        return this.flags;
    }

    public TypeReference(KClassifier r2, List<KTypeProjection> r3, boolean r4) {
        Intrinsics.checkNotNullParameter(r2, "classifier");
        Intrinsics.checkNotNullParameter(r3, "arguments");
        this(r2, r3, null, r4 ? 1 : 0);
    }

    @Override // kotlin.reflect.KAnnotatedElement
    public List<Annotation> getAnnotations() {
        return CollectionsKt.emptyList();
    }

    @Override // kotlin.reflect.KType
    public boolean isMarkedNullable() {
        if ((this.flags & 1) != 0) goto L7;
        return false;
    L7:
        return true;
    }

    public boolean equals(Object other) {
        if ((other instanceof TypeReference) == true) goto L5;
    L13:
        return false;
    L5:
        if (Intrinsics.areEqual(getClassifier(), ((TypeReference) other).getClassifier()) == false) goto L13;
        if (Intrinsics.areEqual(getArguments(), ((TypeReference) other).getArguments()) == false) goto L13;
        if (Intrinsics.areEqual(this.platformTypeUpperBound, ((TypeReference) other).platformTypeUpperBound) == false) goto L13;
        if (this.flags != ((TypeReference) other).flags) goto L13;
        return true;
    }

    public int hashCode() {
        return (((getClassifier().hashCode() * 31) + getArguments().hashCode()) * 31) + Integer.hashCode(this.flags);
    }

    public String toString() {
        return asString(false) + " (Kotlin reflection is not available)";
    }

    private final String asString(boolean convertPrimitiveToWrapper) {
        KClassifier r0 = getClassifier();
        Class<?> r2 = null;
        if ((r0 instanceof KClass) == false) goto L5;
        KClass r1 = (KClass) r0;
    L6:
        if (r1 == null) goto L9;
        r2 = JvmClassMappingKt.getJavaClass(r1);
    L9:
        if (r2 != null) goto L12;
        String klass = getClassifier().toString();
    L22:
        String nullable = "";
        if (getArguments().isEmpty() == false) goto L25;
        String args = "";
    L27:
        if (isMarkedNullable() == false) goto L29;
        nullable = "?";
    L29:
        String result = klass + args + nullable;
        KType upper = this.platformTypeUpperBound;
        if ((upper instanceof TypeReference) == false) goto L40;
        String renderedUpper = ((TypeReference) upper).asString(true);
        if (Intrinsics.areEqual(renderedUpper, result) == true) goto L40;
        if (Intrinsics.areEqual(renderedUpper, result + '?') == false) goto L42;
        return result + '!';
    L42:
        return '(' + result + ".." + renderedUpper + ')';
    L40:
        return result;
    L25:
        args = CollectionsKt.joinToString$default(getArguments(), ", ", "<", ">", 0, null, new TypeReference$$ExternalSyntheticLambda0(this), 24, null);
        goto L27
    L12:
        if ((this.flags & 4) == 0) goto L15;
        klass = "kotlin.Nothing";
        goto L22
    L15:
        if (r2.isArray() == false) goto L17;
        klass = getArrayClassName(r2);
        goto L22
    L17:
        if (convertPrimitiveToWrapper == true) goto L19;
    L21:
        klass = r2.getName();
        goto L22
    L19:
        if (r2.isPrimitive() == false) goto L21;
        KClassifier r3 = getClassifier();
        Intrinsics.checkNotNull(r3, "null cannot be cast to non-null type kotlin.reflect.KClass<*>");
        klass = JvmClassMappingKt.getJavaObjectType((KClass) r3).getName();
        goto L22
    L5:
        r1 = null;
        goto L6
    }

    static final CharSequence asString$lambda$0(TypeReference this$0, KTypeProjection it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return this$0.asString(it);
    }

    private final String getArrayClassName(Class<?> r2) {
        if (Intrinsics.areEqual(r2, boolean[].class) == false) goto L6;
        return "kotlin.BooleanArray";
    L6:
        if (Intrinsics.areEqual(r2, char[].class) == false) goto L9;
        return "kotlin.CharArray";
    L9:
        if (Intrinsics.areEqual(r2, byte[].class) == false) goto L12;
        return "kotlin.ByteArray";
    L12:
        if (Intrinsics.areEqual(r2, short[].class) == false) goto L15;
        return "kotlin.ShortArray";
    L15:
        if (Intrinsics.areEqual(r2, int[].class) == false) goto L18;
        return "kotlin.IntArray";
    L18:
        if (Intrinsics.areEqual(r2, float[].class) == false) goto L21;
        return "kotlin.FloatArray";
    L21:
        if (Intrinsics.areEqual(r2, long[].class) == false) goto L24;
        return "kotlin.LongArray";
    L24:
        if (Intrinsics.areEqual(r2, double[].class) == false) goto L26;
        return "kotlin.DoubleArray";
    L26:
        return CollectionDescriptorsKt.ARRAY_NAME;
    }

    private final String asString(KTypeProjection $this$asString) {
        if ($this$asString.getVariance() != null) goto L6;
        return ProxyConfig.MATCH_ALL_SCHEMES;
    L6:
        KType r0 = $this$asString.getType();
        if ((r0 instanceof TypeReference) == false) goto L9;
        TypeReference r1 = (TypeReference) r0;
    L10:
        if (r1 == null) goto L13;
        String typeString = r1.asString(true);
        if (typeString == null) goto L13;
    L14:
        KVariance r2 = $this$asString.getVariance();
        if (r2 != null) goto L17;
        int r3 = -1;
    L18:
        switch(r3) {
            case 1: goto L24;
            case 2: goto L26;
            case 3: goto L25;
            default: goto L20;
        };
    L20:
        throw new NoWhenBranchMatchedException();
    L25:
        return "out " + typeString;
    L26:
        return "in " + typeString;
    L24:
        return typeString;
    L17:
        r3 = WhenMappings.$EnumSwitchMapping$0[r2.ordinal()];
    L13:
        typeString = String.valueOf($this$asString.getType());
        goto L14
    L9:
        r1 = null;
        goto L10
    }
}
