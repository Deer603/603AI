package androidx.savedstate.serialization.serializers;

import android.util.SparseArray;
import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.SerializationConstructorMarker;

/* JADX INFO: compiled from: BuiltInSerializer.android.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00010\u00030\u0002:\u0001\u0015B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u001e\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0016J\u0016\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\u0006\u0010\u0013\u001a\u00020\u0014H\u0016R\u001a\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\b0\u0002X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\u00020\nX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0016"}, d2 = {"Landroidx/savedstate/serialization/serializers/SparseArraySerializer;", "T", "Lkotlinx/serialization/KSerializer;", "Landroid/util/SparseArray;", "elementSerializer", "<init>", "(Lkotlinx/serialization/KSerializer;)V", "surrogateSerializer", "Landroidx/savedstate/serialization/serializers/SparseArraySerializer$SparseArraySurrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "SparseArraySurrogate", "savedstate_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class SparseArraySerializer<T> implements KSerializer<SparseArray<T>> {
    private final SerialDescriptor descriptor;
    private final KSerializer<SparseArraySurrogate<T>> surrogateSerializer;

    /* JADX INFO: compiled from: BuiltInSerializer.android.kt */
    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0003\u0018\u0000 \u001b*\u0004\b\u0001\u0010\u00012\u00020\u0002:\u0002\u001a\u001bB#\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bB;\b\u0010\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\u000e\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u0004\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0007\u0010\fJE\u0010\u0010\u001a\u00020\u0011\"\n\b\u0002\u0010\u0001*\u0004\u0018\u00010\u00022\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u0002H\u00010\u00002\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u0002H\u00010\u0018H\u0001¢\u0006\u0002\b\u0019R\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000e¨\u0006\u001c"}, d2 = {"Landroidx/savedstate/serialization/serializers/SparseArraySerializer$SparseArraySurrogate;", "T", "", "keys", "", "", "values", "<init>", "(Ljava/util/List;Ljava/util/List;)V", "seen0", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/util/List;Ljava/util/List;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getKeys", "()Ljava/util/List;", "getValues", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "typeSerial0", "Lkotlinx/serialization/KSerializer;", "write$Self$savedstate_release", "$serializer", "Companion", "savedstate_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @Serializable
    private static final class SparseArraySurrogate<T> {
        private static final SerialDescriptor $cachedDescriptor = null;
        private static final Lazy<KSerializer<Object>>[] $childSerializers = null;
        public static final Companion Companion = null;
        private final List<Integer> keys;
        private final List<T> values;

        /* JADX INFO: compiled from: BuiltInSerializer.android.kt */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J&\u0010\u0004\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00070\u00060\u0005\"\u0004\b\u0002\u0010\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u0002H\u00070\u0005¨\u0006\t"}, d2 = {"Landroidx/savedstate/serialization/serializers/SparseArraySerializer$SparseArraySurrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Landroidx/savedstate/serialization/serializers/SparseArraySerializer$SparseArraySurrogate;", "T", "typeSerial0", "savedstate_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker r1) {
                this();
            }

            public final <T> KSerializer<SparseArraySurrogate<T>> serializer(KSerializer<T> r2) {
                Intrinsics.checkNotNullParameter(r2, "typeSerial0");
                return new SparseArraySerializer$SparseArraySurrogate$$serializer(r2);
            }
        }

        public static /* synthetic */ KSerializer $r8$lambda$Te6tq_6GXP9ROR7MsQbitRJE9jo() {
            return _childSerializers$_anonymous_();
        }

        static {
            Companion = new Companion(null);
            $childSerializers = new Lazy[]{LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, new SparseArraySerializer$SparseArraySurrogate$$ExternalSyntheticLambda0()), null};
            PluginGeneratedSerialDescriptor r2 = new PluginGeneratedSerialDescriptor("androidx.savedstate.serialization.serializers.SparseArraySerializer.SparseArraySurrogate", null, 2);
            r2.addElement("keys", false);
            r2.addElement("values", false);
            $cachedDescriptor = r2;
        }

        public /* synthetic */ SparseArraySurrogate(int seen0, List keys, List values, SerializationConstructorMarker serializationConstructorMarker) {
            if (3 == (seen0 & 3)) goto L5;
            PluginExceptionsKt.throwMissingFieldException(seen0, 3, $cachedDescriptor);
        L5:
            this.keys = keys;
            this.values = values;
        }

        private static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
            return new ArrayListSerializer(IntSerializer.INSTANCE);
        }

        public static final /* synthetic */ Lazy[] access$get$childSerializers$cp() {
            return $childSerializers;
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$savedstate_release(SparseArraySurrogate self, CompositeEncoder output, SerialDescriptor serialDesc, KSerializer typeSerial0) {
            output.encodeSerializableElement(serialDesc, 0, $childSerializers[0].getValue(), self.keys);
            output.encodeSerializableElement(serialDesc, 1, new ArrayListSerializer(typeSerial0), self.values);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public SparseArraySurrogate(List<Integer> r2, List<? extends T> r3) {
            Intrinsics.checkNotNullParameter(r2, "keys");
            Intrinsics.checkNotNullParameter(r3, "values");
            this.keys = r2;
            this.values = r3;
        }

        public final List<Integer> getKeys() {
            return this.keys;
        }

        public final List<T> getValues() {
            return this.values;
        }
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public /* bridge */ /* synthetic */ Object deserialize(Decoder decoder) {
        return deserialize(decoder);
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object value) {
        serialize(encoder, (SparseArray) value);
    }

    public SparseArraySerializer(KSerializer<T> r2) {
        Intrinsics.checkNotNullParameter(r2, "elementSerializer");
        this.surrogateSerializer = SparseArraySurrogate.Companion.serializer(r2);
        this.descriptor = this.surrogateSerializer.getDescriptor();
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public SerialDescriptor getDescriptor() {
        return this.descriptor;
    }

    public void serialize(Encoder encoder, SparseArray<T> r8) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(r8, "value");
        int r0 = r8.size();
        ArrayList r1 = new ArrayList(r0);
        int r2 = 0;
        int r3 = 0;
    L3:
        if (r3 >= r0) goto L5;
        int index = r3;
        r1.add(Integer.valueOf(r8.keyAt(index)));
        r3 = r3 + 1;
        goto L3
    L5:
        ArrayList r4 = r1;
        int r5 = r8.size();
        ArrayList r6 = new ArrayList(r5);
    L6:
        if (r2 >= r5) goto L8;
        int index2 = r2;
        r6.add(r8.valueAt(index2));
        r2 = r2 + 1;
        goto L6
    L8:
        SparseArraySurrogate surrogate = new SparseArraySurrogate(r4, r6);
        encoder.encodeSerializableValue(this.surrogateSerializer, surrogate);
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public SparseArray<T> deserialize(Decoder decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SparseArraySurrogate surrogate = (SparseArraySurrogate) decoder.decodeSerializableValue(this.surrogateSerializer);
        if (surrogate.getKeys().size() != surrogate.getValues().size()) goto L5;
        boolean r1 = true;
    L6:
        if (r1 == false) goto L13;
        SparseArray<T> r2 = new SparseArray(surrogate.getKeys().size());
        int index = 0;
        int r5 = surrogate.getKeys().size();
    L8:
        if (index >= r5) goto L11;
        r2.append(surrogate.getKeys().get(index).intValue(), surrogate.getValues().get(index));
        index = index + 1;
        goto L8
    L11:
        return r2;
    L13:
        throw new IllegalArgumentException("Failed requirement.".toString());
    L5:
        r1 = false;
        goto L6
    }
}
