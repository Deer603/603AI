package androidx.compose.animation.core;

import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: AnimationSpec.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087@\u0018\u00002\u00020\u0001B\u001b\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007B\u0011\b\u0002\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\u0006\u0010\nJ\u001a\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0014\u0010\fJ\u0010\u0010\u0015\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018R\u0011\u0010\u0002\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u0004\u001a\u00020\u00058Fø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\r\u0010\fR\u000e\u0010\b\u001a\u00020\tX\u0080\u0004¢\u0006\u0002\n\u0000\u0088\u0001\b\u0092\u0001\u00020\t\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0019"}, d2 = {"Landroidx/compose/animation/core/StartOffset;", "", "offsetMillis", "", "offsetType", "Landroidx/compose/animation/core/StartOffsetType;", "constructor-impl", "(II)J", "value", "", "(J)J", "getOffsetMillis-impl", "(J)I", "getOffsetType-Eo1U57Q", "equals", "", "other", "equals-impl", "(JLjava/lang/Object;)Z", "hashCode", "hashCode-impl", "toString", "", "toString-impl", "(J)Ljava/lang/String;", "animation-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@JvmInline
public final class StartOffset {
    private final long value;

    /* JADX INFO: renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ StartOffset m164boximpl(long r1) {
        return new StartOffset(r1);
    }

    /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
    private static long m166constructorimpl(long r0) {
        return r0;
    }

    /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
    public static boolean m168equalsimpl(long r4, Object r6) {
        if ((r6 instanceof StartOffset) == true) goto L6;
        return false;
    L6:
        if (r4 == ((StartOffset) r6).m174unboximpl()) goto L8;
        return false;
    L8:
        return true;
    }

    /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m169equalsimpl0(long r1, long r3) {
        if (r1 != r3) goto L5;
        return true;
    L5:
        return false;
    }

    /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
    public static int m172hashCodeimpl(long r1) {
        return Long.hashCode(r1);
    }

    /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
    public static String m173toStringimpl(long r2) {
        return "StartOffset(value=" + r2 + ')';
    }

    public boolean equals(Object r3) {
        return m168equalsimpl(this.value, r3);
    }

    public int hashCode() {
        return m172hashCodeimpl(this.value);
    }

    public String toString() {
        return m173toStringimpl(this.value);
    }

    /* JADX INFO: renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ long m174unboximpl() {
        return this.value;
    }

    private /* synthetic */ StartOffset(long value) {
        this.value = value;
    }

    /* JADX INFO: renamed from: constructor-impl$default, reason: not valid java name */
    public static /* synthetic */ long m167constructorimpl$default(int r0, int r1, int r2, DefaultConstructorMarker r3) {
        if ((r2 & 2) == 0) goto L6;
        r1 = StartOffsetType.Companion.m182getDelayEo1U57Q();
    L6:
        return m165constructorimpl(r0, r1);
    }

    /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
    public static long m165constructorimpl(int offsetMillis, int offsetType) {
        return m166constructorimpl(offsetMillis * offsetType);
    }

    /* JADX INFO: renamed from: getOffsetMillis-impl, reason: not valid java name */
    public static final int m170getOffsetMillisimpl(long arg0) {
        return Math.abs((int) arg0);
    }

    /* JADX INFO: renamed from: getOffsetType-Eo1U57Q, reason: not valid java name */
    public static final int m171getOffsetTypeEo1U57Q(long arg0) {
        if (arg0 <= 0) goto L5;
        boolean r0 = true;
    L6:
        if (r0 == true) goto L13;
        if (r0 == true) goto L12;
        return StartOffsetType.Companion.m182getDelayEo1U57Q();
    L12:
        throw new NoWhenBranchMatchedException();
    L13:
        return StartOffsetType.Companion.m183getFastForwardEo1U57Q();
    L5:
        r0 = false;
        goto L6
    }
}
