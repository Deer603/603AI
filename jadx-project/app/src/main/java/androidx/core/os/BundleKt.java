package androidx.core.os;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcelable;
import android.util.Size;
import android.util.SizeF;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Typography;

/* JADX INFO: compiled from: Bundle.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\u0002\u001a\u0006\u0010\u0000\u001a\u00020\u0001\u001a;\u0010\u0000\u001a\u00020\u00012.\u0010\u0002\u001a\u0018\u0012\u0014\b\u0001\u0012\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u00040\u0003\"\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0004¢\u0006\u0002\u0010\u0007¨\u0006\b"}, d2 = {"bundleOf", "Landroid/os/Bundle;", "pairs", "", "Lkotlin/Pair;", "", "", "([Lkotlin/Pair;)Landroid/os/Bundle;", "core-ktx_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class BundleKt {
    public static final Bundle bundleOf(Pair<String, ? extends Object>... r11) {
        Bundle $this$bundleOf_u24lambda_u240 = new Bundle(r11.length);
        int r3 = r11.length;
        int r4 = 0;
    L3:
        if (r4 >= r3) goto L96;
        Pair<String, ? extends Object> r5 = r11[r4];
        String key = r5.component1();
        Object value = r5.component2();
        if (value != null) goto L8;
        $this$bundleOf_u24lambda_u240.putString(key, null);
    L92:
        r4 = r4 + 1;
        goto L3
    L8:
        if ((value instanceof Boolean) == false) goto L11;
        $this$bundleOf_u24lambda_u240.putBoolean(key, ((Boolean) value).booleanValue());
        goto L92
    L11:
        if ((value instanceof Byte) == false) goto L14;
        $this$bundleOf_u24lambda_u240.putByte(key, ((Number) value).byteValue());
        goto L92
    L14:
        if ((value instanceof Character) == false) goto L17;
        $this$bundleOf_u24lambda_u240.putChar(key, ((Character) value).charValue());
        goto L92
    L17:
        if ((value instanceof Double) == false) goto L20;
        $this$bundleOf_u24lambda_u240.putDouble(key, ((Number) value).doubleValue());
        goto L92
    L20:
        if ((value instanceof Float) == false) goto L23;
        $this$bundleOf_u24lambda_u240.putFloat(key, ((Number) value).floatValue());
        goto L92
    L23:
        if ((value instanceof Integer) == false) goto L26;
        $this$bundleOf_u24lambda_u240.putInt(key, ((Number) value).intValue());
        goto L92
    L26:
        if ((value instanceof Long) == false) goto L29;
        $this$bundleOf_u24lambda_u240.putLong(key, ((Number) value).longValue());
        goto L92
    L29:
        if ((value instanceof Short) == false) goto L32;
        $this$bundleOf_u24lambda_u240.putShort(key, ((Number) value).shortValue());
        goto L92
    L32:
        if ((value instanceof Bundle) == false) goto L35;
        $this$bundleOf_u24lambda_u240.putBundle(key, (Bundle) value);
        goto L92
    L35:
        if ((value instanceof CharSequence) == false) goto L38;
        $this$bundleOf_u24lambda_u240.putCharSequence(key, (CharSequence) value);
        goto L92
    L38:
        if ((value instanceof Parcelable) == false) goto L41;
        $this$bundleOf_u24lambda_u240.putParcelable(key, (Parcelable) value);
        goto L92
    L41:
        if ((value instanceof boolean[]) == false) goto L44;
        $this$bundleOf_u24lambda_u240.putBooleanArray(key, (boolean[]) value);
        goto L92
    L44:
        if ((value instanceof byte[]) == false) goto L47;
        $this$bundleOf_u24lambda_u240.putByteArray(key, (byte[]) value);
        goto L92
    L47:
        if ((value instanceof char[]) == false) goto L50;
        $this$bundleOf_u24lambda_u240.putCharArray(key, (char[]) value);
        goto L92
    L50:
        if ((value instanceof double[]) == false) goto L53;
        $this$bundleOf_u24lambda_u240.putDoubleArray(key, (double[]) value);
        goto L92
    L53:
        if ((value instanceof float[]) == false) goto L56;
        $this$bundleOf_u24lambda_u240.putFloatArray(key, (float[]) value);
        goto L92
    L56:
        if ((value instanceof int[]) == false) goto L59;
        $this$bundleOf_u24lambda_u240.putIntArray(key, (int[]) value);
        goto L92
    L59:
        if ((value instanceof long[]) == false) goto L62;
        $this$bundleOf_u24lambda_u240.putLongArray(key, (long[]) value);
        goto L92
    L62:
        if ((value instanceof short[]) == false) goto L65;
        $this$bundleOf_u24lambda_u240.putShortArray(key, (short[]) value);
        goto L92
    L65:
        if ((value instanceof Object[]) == false) goto L81;
        Class<?> r7 = value.getClass().getComponentType();
        Intrinsics.checkNotNull(r7);
        if (Parcelable.class.isAssignableFrom(r7) == false) goto L70;
        Intrinsics.checkNotNull(value, "null cannot be cast to non-null type kotlin.Array<android.os.Parcelable>");
        $this$bundleOf_u24lambda_u240.putParcelableArray(key, (Parcelable[]) value);
        goto L92
    L70:
        if (String.class.isAssignableFrom(r7) == false) goto L73;
        Intrinsics.checkNotNull(value, "null cannot be cast to non-null type kotlin.Array<kotlin.String>");
        $this$bundleOf_u24lambda_u240.putStringArray(key, (String[]) value);
        goto L92
    L73:
        if (CharSequence.class.isAssignableFrom(r7) == false) goto L76;
        Intrinsics.checkNotNull(value, "null cannot be cast to non-null type kotlin.Array<kotlin.CharSequence>");
        $this$bundleOf_u24lambda_u240.putCharSequenceArray(key, (CharSequence[]) value);
        goto L92
    L76:
        if (Serializable.class.isAssignableFrom(r7) == false) goto L78;
        $this$bundleOf_u24lambda_u240.putSerializable(key, (Serializable) value);
        goto L92
    L78:
        String valueType = r7.getCanonicalName();
        throw new IllegalArgumentException("Illegal value array type " + valueType + " for key \"" + key + Typography.quote);
    L81:
        if ((value instanceof Serializable) == false) goto L84;
        $this$bundleOf_u24lambda_u240.putSerializable(key, (Serializable) value);
        goto L92
    L84:
        if ((value instanceof IBinder) == false) goto L87;
        $this$bundleOf_u24lambda_u240.putBinder(key, (IBinder) value);
        goto L92
    L87:
        if ((value instanceof Size) == false) goto L90;
        BundleApi21ImplKt.putSize($this$bundleOf_u24lambda_u240, key, (Size) value);
        goto L92
    L90:
        if ((value instanceof SizeF) == false) goto L93;
        BundleApi21ImplKt.putSizeF($this$bundleOf_u24lambda_u240, key, (SizeF) value);
        goto L92
    L93:
        String valueType2 = value.getClass().getCanonicalName();
        throw new IllegalArgumentException("Illegal value type " + valueType2 + " for key \"" + key + Typography.quote);
    L96:
        return $this$bundleOf_u24lambda_u240;
    }

    public static final Bundle bundleOf() {
        return new Bundle(0);
    }
}
