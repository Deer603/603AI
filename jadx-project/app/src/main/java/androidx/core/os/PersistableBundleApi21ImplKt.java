package androidx.core.os;

import android.os.PersistableBundle;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Typography;

/* JADX INFO: compiled from: PersistableBundle.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÃ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J$\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u00042\b\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001H\u0007¨\u0006\r"}, d2 = {"Landroidx/core/os/PersistableBundleApi21ImplKt;", "", "()V", "createPersistableBundle", "Landroid/os/PersistableBundle;", "capacity", "", "putValue", "", "persistableBundle", "key", "", "value", "core-ktx_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
final class PersistableBundleApi21ImplKt {
    public static final PersistableBundleApi21ImplKt INSTANCE = null;

    static {
        INSTANCE = new PersistableBundleApi21ImplKt();
    }

    private PersistableBundleApi21ImplKt() {
    }

    @JvmStatic
    public static final PersistableBundle createPersistableBundle(int capacity) {
        return new PersistableBundle(capacity);
    }

    @JvmStatic
    public static final void putValue(PersistableBundle persistableBundle, String key, Object value) {
        if (value != null) goto L6;
        persistableBundle.putString(key, null);
        return;
    L6:
        if ((value instanceof Boolean) == false) goto L9;
        PersistableBundleApi22ImplKt.putBoolean(persistableBundle, key, ((Boolean) value).booleanValue());
        return;
    L9:
        if ((value instanceof Double) == false) goto L12;
        persistableBundle.putDouble(key, ((Number) value).doubleValue());
        return;
    L12:
        if ((value instanceof Integer) == false) goto L15;
        persistableBundle.putInt(key, ((Number) value).intValue());
        return;
    L15:
        if ((value instanceof Long) == false) goto L18;
        persistableBundle.putLong(key, ((Number) value).longValue());
        return;
    L18:
        if ((value instanceof String) == false) goto L21;
        persistableBundle.putString(key, (String) value);
        return;
    L21:
        if ((value instanceof PersistableBundle) == false) goto L24;
        persistableBundle.putPersistableBundle(key, (PersistableBundle) value);
        return;
    L24:
        if ((value instanceof boolean[]) == false) goto L27;
        PersistableBundleApi22ImplKt.putBooleanArray(persistableBundle, key, (boolean[]) value);
        return;
    L27:
        if ((value instanceof double[]) == false) goto L30;
        persistableBundle.putDoubleArray(key, (double[]) value);
        return;
    L30:
        if ((value instanceof int[]) == false) goto L33;
        persistableBundle.putIntArray(key, (int[]) value);
        return;
    L33:
        if ((value instanceof long[]) == false) goto L36;
        persistableBundle.putLongArray(key, (long[]) value);
        return;
    L36:
        if ((value instanceof Object[]) == false) goto L44;
        Class<?> r2 = value.getClass().getComponentType();
        Intrinsics.checkNotNull(r2);
        if (String.class.isAssignableFrom(r2) == false) goto L42;
        Intrinsics.checkNotNull(value, "null cannot be cast to non-null type kotlin.Array<kotlin.String>");
        persistableBundle.putStringArray(key, (String[]) value);
        return;
    L42:
        String valueType = r2.getCanonicalName();
        throw new IllegalArgumentException("Unsupported value array type " + valueType + " for key \"" + key + Typography.quote);
    L44:
        String valueType2 = value.getClass().getCanonicalName();
        throw new IllegalArgumentException("Unsupported value type " + valueType2 + " for key \"" + key + Typography.quote);
    }
}
