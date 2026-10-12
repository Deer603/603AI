package kotlinx.coroutines.internal;

import kotlin.Metadata;
import kotlin.text.StringsKt;

/* JADX INFO: compiled from: SystemProps.common.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\u001a\u0018\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0001H\u0000\u001a,\u0010\u0000\u001a\u00020\u00052\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u0005H\u0000\u001a,\u0010\u0000\u001a\u00020\b2\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\b2\b\b\u0002\u0010\u0006\u001a\u00020\b2\b\b\u0002\u0010\u0007\u001a\u00020\bH\u0000\u001a\u0018\u0010\u0000\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003H\u0000¨\u0006\t"}, d2 = {"systemProp", "", "propertyName", "", "defaultValue", "", "minValue", "maxValue", "", "kotlinx-coroutines-core"}, k = 5, mv = {1, 9, 0}, xi = 48, xs = "kotlinx/coroutines/internal/SystemPropsKt")
final /* synthetic */ class SystemPropsKt__SystemProps_commonKt {
    public static final boolean systemProp(String propertyName, boolean defaultValue) {
        String r0 = SystemPropsKt.systemProp(propertyName);
        if (r0 == null) goto L6;
        return Boolean.parseBoolean(r0);
    L6:
        return defaultValue;
    }

    public static /* synthetic */ int systemProp$default(String r0, int r1, int r2, int r3, int r4, Object r5) {
        if ((r4 & 4) == 0) goto L6;
        r2 = 1;
    L6:
        if ((r4 & 8) == 0) goto L9;
        r3 = Integer.MAX_VALUE;
    L9:
        return SystemPropsKt.systemProp(r0, r1, r2, r3);
    }

    public static final int systemProp(String propertyName, int defaultValue, int minValue, int maxValue) {
        return (int) SystemPropsKt.systemProp(propertyName, defaultValue, minValue, maxValue);
    }

    public static /* synthetic */ long systemProp$default(String r7, long r8, long r10, long r12, int r14, Object r15) {
        if ((r14 & 4) == 0) goto L5;
        long r3 = 1;
    L7:
        if ((r14 & 8) == 0) goto L9;
        long r5 = Long.MAX_VALUE;
    L11:
        return SystemPropsKt.systemProp(r7, r8, r3, r5);
    L9:
        r5 = r12;
        goto L11
    L5:
        r3 = r10;
        goto L7
    }

    public static final long systemProp(String propertyName, long defaultValue, long minValue, long maxValue) {
        String value = SystemPropsKt.systemProp(propertyName);
        if (value != null) goto L5;
        return defaultValue;
    L5:
        Long r1 = StringsKt.toLongOrNull(value);
        if (r1 == null) goto L17;
        long parsed = r1.longValue();
        boolean r6 = false;
        if (minValue <= parsed) goto L10;
    L12:
        if (r6 == false) goto L15;
        return parsed;
    L15:
        throw new IllegalStateException(("System property '" + propertyName + "' should be in range " + minValue + ".." + maxValue + ", but is '" + parsed + '\'').toString());
    L10:
        if (parsed > maxValue) goto L12;
        r6 = true;
        goto L12
    L17:
        throw new IllegalStateException(("System property '" + propertyName + "' has unrecognized value '" + value + '\'').toString());
    }

    public static final String systemProp(String propertyName, String defaultValue) {
        String r0 = SystemPropsKt.systemProp(propertyName);
        if (r0 == null) goto L5;
        return r0;
    L5:
        return defaultValue;
    }
}
