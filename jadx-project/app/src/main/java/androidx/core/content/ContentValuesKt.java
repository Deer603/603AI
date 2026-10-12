package androidx.core.content;

import android.content.ContentValues;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.text.Typography;

/* JADX INFO: compiled from: ContentValues.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\u0002\u001a;\u0010\u0000\u001a\u00020\u00012.\u0010\u0002\u001a\u0018\u0012\u0014\b\u0001\u0012\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u00040\u0003\"\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0004¢\u0006\u0002\u0010\u0007¨\u0006\b"}, d2 = {"contentValuesOf", "Landroid/content/ContentValues;", "pairs", "", "Lkotlin/Pair;", "", "", "([Lkotlin/Pair;)Landroid/content/ContentValues;", "core-ktx_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class ContentValuesKt {
    public static final ContentValues contentValuesOf(Pair<String, ? extends Object>... r8) {
        ContentValues $this$contentValuesOf_u24lambda_u240 = new ContentValues(r8.length);
        int r3 = r8.length;
        int r4 = 0;
    L3:
        if (r4 >= r3) goto L38;
        Pair<String, ? extends Object> r5 = r8[r4];
        String key = r5.component1();
        Object value = r5.component2();
        if (value != null) goto L8;
        $this$contentValuesOf_u24lambda_u240.putNull(key);
    L34:
        r4 = r4 + 1;
        goto L3
    L8:
        if ((value instanceof String) == false) goto L11;
        $this$contentValuesOf_u24lambda_u240.put(key, (String) value);
        goto L34
    L11:
        if ((value instanceof Integer) == false) goto L14;
        $this$contentValuesOf_u24lambda_u240.put(key, (Integer) value);
        goto L34
    L14:
        if ((value instanceof Long) == false) goto L17;
        $this$contentValuesOf_u24lambda_u240.put(key, (Long) value);
        goto L34
    L17:
        if ((value instanceof Boolean) == false) goto L20;
        $this$contentValuesOf_u24lambda_u240.put(key, (Boolean) value);
        goto L34
    L20:
        if ((value instanceof Float) == false) goto L23;
        $this$contentValuesOf_u24lambda_u240.put(key, (Float) value);
        goto L34
    L23:
        if ((value instanceof Double) == false) goto L26;
        $this$contentValuesOf_u24lambda_u240.put(key, (Double) value);
        goto L34
    L26:
        if ((value instanceof byte[]) == false) goto L29;
        $this$contentValuesOf_u24lambda_u240.put(key, (byte[]) value);
        goto L34
    L29:
        if ((value instanceof Byte) == false) goto L32;
        $this$contentValuesOf_u24lambda_u240.put(key, (Byte) value);
        goto L34
    L32:
        if ((value instanceof Short) == false) goto L35;
        $this$contentValuesOf_u24lambda_u240.put(key, (Short) value);
        goto L34
    L35:
        String valueType = value.getClass().getCanonicalName();
        throw new IllegalArgumentException("Illegal value type " + valueType + " for key \"" + key + Typography.quote);
    L38:
        return $this$contentValuesOf_u24lambda_u240;
    }
}
