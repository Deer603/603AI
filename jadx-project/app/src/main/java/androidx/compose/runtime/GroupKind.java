package androidx.compose.runtime;

import kotlin.Metadata;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: Composer.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0083@\u0018\u0000 \u00182\u00020\u0001:\u0001\u0018B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\u000e\u001a\u00020\u00072\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0005J\u0010\u0010\u0014\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017R\u0012\u0010\u0006\u001a\u00020\u00078Æ\u0002¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0012\u0010\n\u001a\u00020\u00078Æ\u0002¢\u0006\u0006\u001a\u0004\b\u000b\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r\u0088\u0001\u0002¨\u0006\u0019"}, d2 = {"Landroidx/compose/runtime/GroupKind;", "", "value", "", "constructor-impl", "(I)I", "isNode", "", "isNode-impl", "(I)Z", "isReusable", "isReusable-impl", "getValue", "()I", "equals", "other", "equals-impl", "(ILjava/lang/Object;)Z", "hashCode", "hashCode-impl", "toString", "", "toString-impl", "(I)Ljava/lang/String;", "Companion", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@JvmInline
final class GroupKind {
    public static final Companion Companion = null;
    private static final int Group = 0;
    private static final int Node = 0;
    private static final int ReusableNode = 0;
    private final int value;

    /* JADX INFO: compiled from: Composer.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0019\u0010\u0003\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0005\u0010\u0006R\u0019\u0010\b\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\t\u0010\u0006R\u0019\u0010\n\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u000b\u0010\u0006\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\f"}, d2 = {"Landroidx/compose/runtime/GroupKind$Companion;", "", "()V", "Group", "Landroidx/compose/runtime/GroupKind;", "getGroup-ULZAiWs", "()I", "I", "Node", "getNode-ULZAiWs", "ReusableNode", "getReusableNode-ULZAiWs", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker r1) {
            this();
        }

        private Companion() {
        }

        /* JADX INFO: renamed from: getGroup-ULZAiWs, reason: not valid java name */
        public final int m3762getGroupULZAiWs() {
            return GroupKind.access$getGroup$cp();
        }

        /* JADX INFO: renamed from: getNode-ULZAiWs, reason: not valid java name */
        public final int m3763getNodeULZAiWs() {
            return GroupKind.access$getNode$cp();
        }

        /* JADX INFO: renamed from: getReusableNode-ULZAiWs, reason: not valid java name */
        public final int m3764getReusableNodeULZAiWs() {
            return GroupKind.access$getReusableNode$cp();
        }
    }

    /* JADX INFO: renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ GroupKind m3753boximpl(int r1) {
        return new GroupKind(r1);
    }

    /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
    private static int m3754constructorimpl(int r0) {
        return r0;
    }

    /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
    public static boolean m3755equalsimpl(int r2, Object r3) {
        if ((r3 instanceof GroupKind) == true) goto L6;
        return false;
    L6:
        if (r2 == ((GroupKind) r3).m3761unboximpl()) goto L8;
        return false;
    L8:
        return true;
    }

    /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m3756equalsimpl0(int r1, int r2) {
        if (r1 != r2) goto L4;
        return true;
    L4:
        return false;
    }

    /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
    public static int m3757hashCodeimpl(int r1) {
        return Integer.hashCode(r1);
    }

    /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
    public static String m3760toStringimpl(int r2) {
        return "GroupKind(value=" + r2 + ')';
    }

    public boolean equals(Object r2) {
        return m3755equalsimpl(this.value, r2);
    }

    public int hashCode() {
        return m3757hashCodeimpl(this.value);
    }

    public String toString() {
        return m3760toStringimpl(this.value);
    }

    /* JADX INFO: renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m3761unboximpl() {
        return this.value;
    }

    public static final /* synthetic */ int access$getGroup$cp() {
        return Group;
    }

    public static final /* synthetic */ int access$getNode$cp() {
        return Node;
    }

    public static final /* synthetic */ int access$getReusableNode$cp() {
        return ReusableNode;
    }

    private /* synthetic */ GroupKind(int value) {
        this.value = value;
    }

    public final int getValue() {
        return this.value;
    }

    /* JADX INFO: renamed from: isNode-impl, reason: not valid java name */
    public static final boolean m3758isNodeimpl(int arg0) {
        if (arg0 == Companion.m3762getGroupULZAiWs()) goto L5;
        return true;
    L5:
        return false;
    }

    /* JADX INFO: renamed from: isReusable-impl, reason: not valid java name */
    public static final boolean m3759isReusableimpl(int arg0) {
        if (arg0 == Companion.m3763getNodeULZAiWs()) goto L5;
        return true;
    L5:
        return false;
    }

    static {
        Companion = new Companion(null);
        Group = m3754constructorimpl(0);
        Node = m3754constructorimpl(1);
        ReusableNode = m3754constructorimpl(2);
    }
}
