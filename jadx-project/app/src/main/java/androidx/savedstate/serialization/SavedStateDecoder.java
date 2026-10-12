package androidx.savedstate.serialization;

import android.os.Bundle;
import androidx.savedstate.SavedStateReader;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.DeserializationStrategy;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.StructureKind;
import kotlinx.serialization.encoding.AbstractDecoder;
import kotlinx.serialization.encoding.CompositeDecoder;
import kotlinx.serialization.modules.SerializersModule;

/* JADX INFO: compiled from: SavedStateDecoder.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000ª\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0005\n\u0000\n\u0002\u0010\n\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\f\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u0018\n\u0000\n\u0002\u0010\u0019\n\u0000\n\u0002\u0010\u0013\n\u0000\n\u0002\u0010\u0014\n\u0000\n\u0002\u0010\u0015\n\u0000\n\u0002\u0010\u0016\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u001b\u0012\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\u0017\u001a\u00020\u00122\u0006\u0010\u0018\u001a\u00020\u0019H\u0016J\b\u0010\u001a\u001a\u00020\u001bH\u0016J\b\u0010\u001c\u001a\u00020\u001dH\u0016J\b\u0010\u001e\u001a\u00020\u001fH\u0016J\b\u0010 \u001a\u00020\u0012H\u0016J\b\u0010!\u001a\u00020\"H\u0016J\b\u0010#\u001a\u00020$H\u0016J\b\u0010%\u001a\u00020&H\u0016J\b\u0010'\u001a\u00020(H\u0016J\b\u0010)\u001a\u00020\rH\u0016J\u0010\u0010*\u001a\u00020\u00122\u0006\u0010+\u001a\u00020\u0019H\u0016J\u000e\u0010,\u001a\b\u0012\u0004\u0012\u00020\u00120-H\u0002J\u000e\u0010.\u001a\b\u0012\u0004\u0012\u00020\r0-H\u0002J\b\u0010/\u001a\u000200H\u0002J\b\u00101\u001a\u000202H\u0002J\b\u00103\u001a\u000204H\u0002J\b\u00105\u001a\u000206H\u0002J\b\u00107\u001a\u000208H\u0002J\b\u00109\u001a\u00020:H\u0002J\u0013\u0010;\u001a\b\u0012\u0004\u0012\u00020\r0<H\u0002¢\u0006\u0002\u0010=J\u0010\u0010>\u001a\u00020?2\u0006\u0010\u0018\u001a\u00020\u0019H\u0016J\b\u0010@\u001a\u00020\u001bH\u0016J!\u0010A\u001a\u0002HB\"\u0004\b\u0000\u0010B2\f\u0010C\u001a\b\u0012\u0004\u0012\u0002HB0DH\u0016¢\u0006\u0002\u0010EJ#\u0010F\u001a\u0004\u0018\u0001HB\"\u0004\b\u0000\u0010B2\f\u0010C\u001a\b\u0012\u0004\u0012\u0002HB0DH\u0002¢\u0006\u0002\u0010ER\u001a\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004X\u0080\u0004¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\t\u0010\nR\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u001e\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\r@BX\u0080\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0013\u001a\u00020\u0014X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016¨\u0006G"}, d2 = {"Landroidx/savedstate/serialization/SavedStateDecoder;", "Lkotlinx/serialization/encoding/AbstractDecoder;", "savedState", "Landroid/os/Bundle;", "Landroidx/savedstate/SavedState;", "configuration", "Landroidx/savedstate/serialization/SavedStateConfiguration;", "<init>", "(Landroid/os/Bundle;Landroidx/savedstate/serialization/SavedStateConfiguration;)V", "getSavedState$savedstate_release", "()Landroid/os/Bundle;", "Landroid/os/Bundle;", "value", "", "key", "getKey$savedstate_release", "()Ljava/lang/String;", "index", "", "serializersModule", "Lkotlinx/serialization/modules/SerializersModule;", "getSerializersModule", "()Lkotlinx/serialization/modules/SerializersModule;", "decodeElementIndex", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "decodeBoolean", "", "decodeByte", "", "decodeShort", "", "decodeInt", "decodeLong", "", "decodeFloat", "", "decodeDouble", "", "decodeChar", "", "decodeString", "decodeEnum", "enumDescriptor", "decodeIntList", "", "decodeStringList", "decodeBooleanArray", "", "decodeCharArray", "", "decodeDoubleArray", "", "decodeFloatArray", "", "decodeIntArray", "", "decodeLongArray", "", "decodeStringArray", "", "()[Ljava/lang/String;", "beginStructure", "Lkotlinx/serialization/encoding/CompositeDecoder;", "decodeNotNullMark", "decodeSerializableValue", "T", "deserializer", "Lkotlinx/serialization/DeserializationStrategy;", "(Lkotlinx/serialization/DeserializationStrategy;)Ljava/lang/Object;", "decodeFormatSpecificTypes", "savedstate_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class SavedStateDecoder extends AbstractDecoder {
    private final SavedStateConfiguration configuration;
    private int index;
    private String key;
    private final Bundle savedState;
    private final SerializersModule serializersModule;

    public final Bundle getSavedState$savedstate_release() {
        return this.savedState;
    }

    public SavedStateDecoder(Bundle savedState, SavedStateConfiguration configuration) {
        Intrinsics.checkNotNullParameter(savedState, "savedState");
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        this.savedState = savedState;
        this.configuration = configuration;
        this.key = "";
        this.serializersModule = this.configuration.getSerializersModule();
    }

    public final String getKey$savedstate_release() {
        return this.key;
    }

    @Override // kotlinx.serialization.encoding.Decoder, kotlinx.serialization.encoding.CompositeDecoder
    public SerializersModule getSerializersModule() {
        return this.serializersModule;
    }

    @Override // kotlinx.serialization.encoding.CompositeDecoder
    public int decodeElementIndex(SerialDescriptor descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        if (Intrinsics.areEqual(descriptor.getKind(), StructureKind.LIST.INSTANCE) == false) goto L5;
    L8:
        Bundle $this$read$iv = this.savedState;
        Bundle $this$decodeElementIndex_u24lambda_u240 = SavedStateReader.m7271constructorimpl($this$read$iv);
        int size = SavedStateReader.m7351sizeimpl($this$decodeElementIndex_u24lambda_u240);
    L11:
        if (this.index >= size) goto L18;
        if (decodeElementIndex$hasDefaultValueDefined(descriptor, this.index) == false) goto L18;
        if (decodeElementIndex$presentInEncoding(this, descriptor, this.index) == true) goto L18;
        this.index++;
    L18:
        if (this.index >= size) goto L21;
        this.key = descriptor.getElementName(this.index);
        int r1 = this.index;
        this.index = r1 + 1;
        return r1;
    L21:
        return -1;
    L5:
        if (Intrinsics.areEqual(descriptor.getKind(), StructureKind.MAP.INSTANCE) == true) goto L8;
        size = descriptor.getElementsCount();
        goto L11
    }

    private static final boolean decodeElementIndex$hasDefaultValueDefined(SerialDescriptor $descriptor, int index) {
        return $descriptor.isElementOptional(index);
    }

    private static final boolean decodeElementIndex$presentInEncoding(SavedStateDecoder this$0, SerialDescriptor $descriptor, int index) {
        Bundle $this$read$iv = this$0.savedState;
        Bundle $this$decodeElementIndex_u24presentInEncoding_u24lambda_u241 = SavedStateReader.m7271constructorimpl($this$read$iv);
        String key = $descriptor.getElementName(index);
        return SavedStateReader.m7272containsimpl($this$decodeElementIndex_u24presentInEncoding_u24lambda_u241, key);
    }

    @Override // kotlinx.serialization.encoding.AbstractDecoder, kotlinx.serialization.encoding.Decoder
    public boolean decodeBoolean() {
        Bundle $this$read$iv = this.savedState;
        Bundle $this$decodeBoolean_u24lambda_u242 = SavedStateReader.m7271constructorimpl($this$read$iv);
        return SavedStateReader.m7280getBooleanimpl($this$decodeBoolean_u24lambda_u242, this.key);
    }

    @Override // kotlinx.serialization.encoding.AbstractDecoder, kotlinx.serialization.encoding.Decoder
    public byte decodeByte() {
        Bundle $this$read$iv = this.savedState;
        Bundle $this$decodeByte_u24lambda_u243 = SavedStateReader.m7271constructorimpl($this$read$iv);
        return (byte) SavedStateReader.m7302getIntimpl($this$decodeByte_u24lambda_u243, this.key);
    }

    @Override // kotlinx.serialization.encoding.AbstractDecoder, kotlinx.serialization.encoding.Decoder
    public short decodeShort() {
        Bundle $this$read$iv = this.savedState;
        Bundle $this$decodeShort_u24lambda_u244 = SavedStateReader.m7271constructorimpl($this$read$iv);
        return (short) SavedStateReader.m7302getIntimpl($this$decodeShort_u24lambda_u244, this.key);
    }

    @Override // kotlinx.serialization.encoding.AbstractDecoder, kotlinx.serialization.encoding.Decoder
    public int decodeInt() {
        Bundle $this$read$iv = this.savedState;
        Bundle $this$decodeInt_u24lambda_u245 = SavedStateReader.m7271constructorimpl($this$read$iv);
        return SavedStateReader.m7302getIntimpl($this$decodeInt_u24lambda_u245, this.key);
    }

    @Override // kotlinx.serialization.encoding.AbstractDecoder, kotlinx.serialization.encoding.Decoder
    public long decodeLong() {
        Bundle $this$read$iv = this.savedState;
        Bundle $this$decodeLong_u24lambda_u246 = SavedStateReader.m7271constructorimpl($this$read$iv);
        return SavedStateReader.m7312getLongimpl($this$decodeLong_u24lambda_u246, this.key);
    }

    @Override // kotlinx.serialization.encoding.AbstractDecoder, kotlinx.serialization.encoding.Decoder
    public float decodeFloat() {
        Bundle $this$read$iv = this.savedState;
        Bundle $this$decodeFloat_u24lambda_u247 = SavedStateReader.m7271constructorimpl($this$read$iv);
        return SavedStateReader.m7298getFloatimpl($this$decodeFloat_u24lambda_u247, this.key);
    }

    @Override // kotlinx.serialization.encoding.AbstractDecoder, kotlinx.serialization.encoding.Decoder
    public double decodeDouble() {
        Bundle $this$read$iv = this.savedState;
        Bundle $this$decodeDouble_u24lambda_u248 = SavedStateReader.m7271constructorimpl($this$read$iv);
        return SavedStateReader.m7294getDoubleimpl($this$decodeDouble_u24lambda_u248, this.key);
    }

    @Override // kotlinx.serialization.encoding.AbstractDecoder, kotlinx.serialization.encoding.Decoder
    public char decodeChar() {
        Bundle $this$read$iv = this.savedState;
        Bundle $this$decodeChar_u24lambda_u249 = SavedStateReader.m7271constructorimpl($this$read$iv);
        return SavedStateReader.m7284getCharimpl($this$decodeChar_u24lambda_u249, this.key);
    }

    @Override // kotlinx.serialization.encoding.AbstractDecoder, kotlinx.serialization.encoding.Decoder
    public String decodeString() {
        Bundle $this$read$iv = this.savedState;
        Bundle $this$decodeString_u24lambda_u2410 = SavedStateReader.m7271constructorimpl($this$read$iv);
        return SavedStateReader.m7342getStringimpl($this$decodeString_u24lambda_u2410, this.key);
    }

    @Override // kotlinx.serialization.encoding.AbstractDecoder, kotlinx.serialization.encoding.Decoder
    public int decodeEnum(SerialDescriptor enumDescriptor) {
        Intrinsics.checkNotNullParameter(enumDescriptor, "enumDescriptor");
        Bundle $this$read$iv = this.savedState;
        Bundle $this$decodeEnum_u24lambda_u2411 = SavedStateReader.m7271constructorimpl($this$read$iv);
        return SavedStateReader.m7302getIntimpl($this$decodeEnum_u24lambda_u2411, this.key);
    }

    private final List<Integer> decodeIntList() {
        Bundle $this$read$iv = this.savedState;
        Bundle $this$decodeIntList_u24lambda_u2412 = SavedStateReader.m7271constructorimpl($this$read$iv);
        return SavedStateReader.m7305getIntListimpl($this$decodeIntList_u24lambda_u2412, this.key);
    }

    private final List<String> decodeStringList() {
        Bundle $this$read$iv = this.savedState;
        Bundle $this$decodeStringList_u24lambda_u2413 = SavedStateReader.m7271constructorimpl($this$read$iv);
        return SavedStateReader.m7345getStringListimpl($this$decodeStringList_u24lambda_u2413, this.key);
    }

    private final boolean[] decodeBooleanArray() {
        Bundle $this$read$iv = this.savedState;
        Bundle $this$decodeBooleanArray_u24lambda_u2414 = SavedStateReader.m7271constructorimpl($this$read$iv);
        return SavedStateReader.m7281getBooleanArrayimpl($this$decodeBooleanArray_u24lambda_u2414, this.key);
    }

    private final char[] decodeCharArray() {
        Bundle $this$read$iv = this.savedState;
        Bundle $this$decodeCharArray_u24lambda_u2415 = SavedStateReader.m7271constructorimpl($this$read$iv);
        return SavedStateReader.m7285getCharArrayimpl($this$decodeCharArray_u24lambda_u2415, this.key);
    }

    private final double[] decodeDoubleArray() {
        Bundle $this$read$iv = this.savedState;
        Bundle $this$decodeDoubleArray_u24lambda_u2416 = SavedStateReader.m7271constructorimpl($this$read$iv);
        return SavedStateReader.m7295getDoubleArrayimpl($this$decodeDoubleArray_u24lambda_u2416, this.key);
    }

    private final float[] decodeFloatArray() {
        Bundle $this$read$iv = this.savedState;
        Bundle $this$decodeFloatArray_u24lambda_u2417 = SavedStateReader.m7271constructorimpl($this$read$iv);
        return SavedStateReader.m7299getFloatArrayimpl($this$decodeFloatArray_u24lambda_u2417, this.key);
    }

    private final int[] decodeIntArray() {
        Bundle $this$read$iv = this.savedState;
        Bundle $this$decodeIntArray_u24lambda_u2418 = SavedStateReader.m7271constructorimpl($this$read$iv);
        return SavedStateReader.m7303getIntArrayimpl($this$decodeIntArray_u24lambda_u2418, this.key);
    }

    private final long[] decodeLongArray() {
        Bundle $this$read$iv = this.savedState;
        Bundle $this$decodeLongArray_u24lambda_u2419 = SavedStateReader.m7271constructorimpl($this$read$iv);
        return SavedStateReader.m7313getLongArrayimpl($this$decodeLongArray_u24lambda_u2419, this.key);
    }

    private final String[] decodeStringArray() {
        Bundle $this$read$iv = this.savedState;
        Bundle $this$decodeStringArray_u24lambda_u2420 = SavedStateReader.m7271constructorimpl($this$read$iv);
        return SavedStateReader.m7343getStringArrayimpl($this$decodeStringArray_u24lambda_u2420, this.key);
    }

    @Override // kotlinx.serialization.encoding.AbstractDecoder, kotlinx.serialization.encoding.Decoder
    public CompositeDecoder beginStructure(SerialDescriptor descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        if (Intrinsics.areEqual(this.key, "") == true) goto L7;
        Bundle $this$read$iv = this.savedState;
        Bundle $this$beginStructure_u24lambda_u2421 = SavedStateReader.m7271constructorimpl($this$read$iv);
        return new SavedStateDecoder(SavedStateReader.m7328getSavedStateimpl($this$beginStructure_u24lambda_u2421, this.key), this.configuration);
    L7:
        return this;
    }

    @Override // kotlinx.serialization.encoding.AbstractDecoder, kotlinx.serialization.encoding.Decoder
    public boolean decodeNotNullMark() {
        Bundle $this$read$iv = this.savedState;
        Bundle $this$decodeNotNullMark_u24lambda_u2422 = SavedStateReader.m7271constructorimpl($this$read$iv);
        return !SavedStateReader.m7350isNullimpl($this$decodeNotNullMark_u24lambda_u2422, this.key);
    }

    @Override // kotlinx.serialization.encoding.AbstractDecoder, kotlinx.serialization.encoding.Decoder
    public <T> T decodeSerializableValue(DeserializationStrategy<? extends T> r2) {
        Intrinsics.checkNotNullParameter(r2, "deserializer");
        T r0 = (T) decodeFormatSpecificTypes(r2);
        if (r0 == null) goto L5;
        return r0;
    L5:
        return (T) super.decodeSerializableValue(r2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final <T> T decodeFormatSpecificTypes(DeserializationStrategy<? extends T> r3) {
        T r0 = (T) SavedStateDecoder_androidKt.decodeFormatSpecificTypesOnPlatform(this, r3);
        if (r0 != null) goto L33;
        SerialDescriptor r1 = r3.getDescriptor();
        if (Intrinsics.areEqual(r1, SavedStateCodecUtilsKt.getIntListDescriptor()) == false) goto L8;
        return (T) decodeIntList();
    L8:
        if (Intrinsics.areEqual(r1, SavedStateCodecUtilsKt.getStringListDescriptor()) == false) goto L11;
        return (T) decodeStringList();
    L11:
        if (Intrinsics.areEqual(r1, SavedStateCodecUtilsKt.getBooleanArrayDescriptor()) == false) goto L14;
        return (T) decodeBooleanArray();
    L14:
        if (Intrinsics.areEqual(r1, SavedStateCodecUtilsKt.getCharArrayDescriptor()) == false) goto L17;
        return (T) decodeCharArray();
    L17:
        if (Intrinsics.areEqual(r1, SavedStateCodecUtilsKt.getDoubleArrayDescriptor()) == false) goto L20;
        return (T) decodeDoubleArray();
    L20:
        if (Intrinsics.areEqual(r1, SavedStateCodecUtilsKt.getFloatArrayDescriptor()) == false) goto L23;
        return (T) decodeFloatArray();
    L23:
        if (Intrinsics.areEqual(r1, SavedStateCodecUtilsKt.getIntArrayDescriptor()) == false) goto L26;
        return (T) decodeIntArray();
    L26:
        if (Intrinsics.areEqual(r1, SavedStateCodecUtilsKt.getLongArrayDescriptor()) == false) goto L29;
        return (T) decodeLongArray();
    L29:
        if (Intrinsics.areEqual(r1, SavedStateCodecUtilsKt.getStringArrayDescriptor()) == true) goto L42;
        return null;
    L42:
        return (T) decodeStringArray();
    L33:
        return r0;
    }
}
