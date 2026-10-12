package androidx.compose.foundation.text.input.internal.selection;

import androidx.compose.foundation.text.input.internal.WedgeAffinity;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.JvmInline;

/* JADX INFO: compiled from: TextPreparedSelection.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0081@\u0018\u00002\u00020\u0001B\u0011\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005B\u001b\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\u0004\u0010\bB\u000f\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u0004\u0010\u000bJ\u0010\u0010\u0010\u001a\u00020\u0003H\u0086\u0002¢\u0006\u0004\b\u0011\u0010\rJ\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u0007H\u0086\u0002¢\u0006\u0004\b\u0013\u0010\u000fJ\u001a\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u001a\u0010\rJ\u0010\u0010\u001b\u001a\u00020\u001cHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eR\u0011\u0010\u0002\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u00078F¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000f\u0088\u0001\t\u0092\u0001\u00020\n¨\u0006\u001f"}, d2 = {"Landroidx/compose/foundation/text/input/internal/selection/CursorAndWedgeAffinity;", "", "cursor", "", "constructor-impl", "(I)J", "wedgeAffinity", "Landroidx/compose/foundation/text/input/internal/WedgeAffinity;", "(ILandroidx/compose/foundation/text/input/internal/WedgeAffinity;)J", "value", "", "(J)J", "getCursor-impl", "(J)I", "getWedgeAffinity-impl", "(J)Landroidx/compose/foundation/text/input/internal/WedgeAffinity;", "component1", "component1-impl", "component2", "component2-impl", "equals", "", "other", "equals-impl", "(JLjava/lang/Object;)Z", "hashCode", "hashCode-impl", "toString", "", "toString-impl", "(J)Ljava/lang/String;", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@JvmInline
public final class CursorAndWedgeAffinity {
    private final long value;

    /* JADX INFO: compiled from: TextPreparedSelection.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0 = null;

        static {
            int[] r0 = new int[WedgeAffinity.values().length];
            r0[WedgeAffinity.Start.ordinal()] = 1;     // Catch: NoSuchFieldError -> L5
        L11:
            r0[WedgeAffinity.End.ordinal()] = 2;     // Catch: NoSuchFieldError -> L8
        L9:
            $EnumSwitchMapping$0 = r0;
        }
    }

    /* JADX INFO: renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ CursorAndWedgeAffinity m1323boximpl(long r1) {
        return new CursorAndWedgeAffinity(r1);
    }

    /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
    public static long m1328constructorimpl(long r0) {
        return r0;
    }

    /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
    public static boolean m1329equalsimpl(long r4, Object r6) {
        if ((r6 instanceof CursorAndWedgeAffinity) == true) goto L6;
        return false;
    L6:
        if (r4 == ((CursorAndWedgeAffinity) r6).m1335unboximpl()) goto L8;
        return false;
    L8:
        return true;
    }

    /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m1330equalsimpl0(long r1, long r3) {
        if (r1 != r3) goto L5;
        return true;
    L5:
        return false;
    }

    /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
    public static int m1333hashCodeimpl(long r1) {
        return Long.hashCode(r1);
    }

    /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
    public static String m1334toStringimpl(long r2) {
        return "CursorAndWedgeAffinity(value=" + r2 + ')';
    }

    public boolean equals(Object r3) {
        return m1329equalsimpl(this.value, r3);
    }

    public int hashCode() {
        return m1333hashCodeimpl(this.value);
    }

    public String toString() {
        return m1334toStringimpl(this.value);
    }

    /* JADX INFO: renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ long m1335unboximpl() {
        return this.value;
    }

    private /* synthetic */ CursorAndWedgeAffinity(long value) {
        this.value = value;
    }

    /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
    public static long m1326constructorimpl(int cursor) {
        return m1328constructorimpl((((long) cursor) << 32) | (((long) (-1)) & 4294967295L));
    }

    /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
    public static long m1327constructorimpl(int cursor, WedgeAffinity wedgeAffinity) {
        int val2$iv = -1;
        if (wedgeAffinity != null) goto L5;
        int r1 = -1;
    L6:
        switch(r1) {
            case -1: goto L13;
            case 0: goto L8;
            case 1: goto L10;
            case 2: goto L9;
            default: goto L8;
        };
    L9:
        val2$iv = 1;
        goto L13
    L10:
        val2$iv = 0;
        goto L13
    L8:
        throw new NoWhenBranchMatchedException();
    L13:
        return m1328constructorimpl((((long) cursor) << 32) | (((long) val2$iv) & 4294967295L));
    L5:
        r1 = WhenMappings.$EnumSwitchMapping$0[wedgeAffinity.ordinal()];
        goto L6
    }

    /* JADX INFO: renamed from: getCursor-impl, reason: not valid java name */
    public static final int m1331getCursorimpl(long arg0) {
        return (int) (arg0 >> 32);
    }

    /* JADX INFO: renamed from: getWedgeAffinity-impl, reason: not valid java name */
    public static final WedgeAffinity m1332getWedgeAffinityimpl(long arg0) {
        int it = (int) (4294967295L & arg0);
        if (it >= 0) goto L5;
        return null;
    L5:
        if (it != 0) goto L9;
        return WedgeAffinity.Start;
    L9:
        return WedgeAffinity.End;
    }

    /* JADX INFO: renamed from: component1-impl, reason: not valid java name */
    public static final int m1324component1impl(long arg0) {
        return m1331getCursorimpl(arg0);
    }

    /* JADX INFO: renamed from: component2-impl, reason: not valid java name */
    public static final WedgeAffinity m1325component2impl(long arg0) {
        return m1332getWedgeAffinityimpl(arg0);
    }
}
