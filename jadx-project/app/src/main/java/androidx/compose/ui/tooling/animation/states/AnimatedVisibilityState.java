package androidx.compose.ui.tooling.animation.states;

import kotlin.Metadata;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: AnimatedVisibilityState.android.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\b\u0081@\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0013\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u0088\u0001\u0002¨\u0006\u0015"}, d2 = {"Landroidx/compose/ui/tooling/animation/states/AnimatedVisibilityState;", "Landroidx/compose/ui/tooling/animation/states/ComposeAnimationState;", "value", "", "constructor-impl", "(Ljava/lang/String;)Ljava/lang/String;", "getValue", "()Ljava/lang/String;", "equals", "", "other", "", "equals-impl", "(Ljava/lang/String;Ljava/lang/Object;)Z", "hashCode", "", "hashCode-impl", "(Ljava/lang/String;)I", "toString", "toString-impl", "Companion", "ui-tooling_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@JvmInline
public final class AnimatedVisibilityState implements ComposeAnimationState {
    public static final Companion Companion = null;
    private static final String Enter = null;
    private static final String Exit = null;
    private final String value;

    /* JADX INFO: compiled from: AnimatedVisibilityState.android.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0019\u0010\u0003\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0005\u0010\u0006R\u0019\u0010\b\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\t\u0010\u0006\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\n"}, d2 = {"Landroidx/compose/ui/tooling/animation/states/AnimatedVisibilityState$Companion;", "", "()V", "Enter", "Landroidx/compose/ui/tooling/animation/states/AnimatedVisibilityState;", "getEnter-jXw82LU", "()Ljava/lang/String;", "Ljava/lang/String;", "Exit", "getExit-jXw82LU", "ui-tooling_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker r1) {
            this();
        }

        private Companion() {
        }

        /* JADX INFO: renamed from: getEnter-jXw82LU, reason: not valid java name */
        public final String m6911getEnterjXw82LU() {
            return AnimatedVisibilityState.access$getEnter$cp();
        }

        /* JADX INFO: renamed from: getExit-jXw82LU, reason: not valid java name */
        public final String m6912getExitjXw82LU() {
            return AnimatedVisibilityState.access$getExit$cp();
        }
    }

    /* JADX INFO: renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ AnimatedVisibilityState m6904boximpl(String r1) {
        return new AnimatedVisibilityState(r1);
    }

    /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
    private static String m6905constructorimpl(String r0) {
        return r0;
    }

    /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
    public static boolean m6906equalsimpl(String r2, Object r3) {
        if ((r3 instanceof AnimatedVisibilityState) == true) goto L6;
        return false;
    L6:
        if (Intrinsics.areEqual(r2, ((AnimatedVisibilityState) r3).m6910unboximpl()) == true) goto L8;
        return false;
    L8:
        return true;
    }

    /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m6907equalsimpl0(String r1, String r2) {
        return Intrinsics.areEqual(r1, r2);
    }

    /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
    public static int m6908hashCodeimpl(String r1) {
        return r1.hashCode();
    }

    public boolean equals(Object r2) {
        return m6906equalsimpl(this.value, r2);
    }

    public int hashCode() {
        return m6908hashCodeimpl(this.value);
    }

    /* JADX INFO: renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ String m6910unboximpl() {
        return this.value;
    }

    public static final /* synthetic */ String access$getEnter$cp() {
        return Enter;
    }

    public static final /* synthetic */ String access$getExit$cp() {
        return Exit;
    }

    private /* synthetic */ AnimatedVisibilityState(String value) {
        this.value = value;
    }

    public final String getValue() {
        return this.value;
    }

    /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
    public static String m6909toStringimpl(String arg0) {
        return arg0;
    }

    public String toString() {
        return m6909toStringimpl(this.value);
    }

    static {
        Companion = new Companion(null);
        Enter = m6905constructorimpl("Enter");
        Exit = m6905constructorimpl("Exit");
    }
}
