package androidx.compose.ui.focus;

import androidx.compose.ui.input.InputMode;
import androidx.compose.ui.input.InputModeManager;
import androidx.compose.ui.node.CompositionLocalConsumerModifierNode;
import androidx.compose.ui.node.CompositionLocalConsumerModifierNodeKt;
import androidx.compose.ui.platform.CompositionLocalsKt;
import kotlin.Metadata;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: Focusability.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087@\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0000¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\f\u001a\u00020\u00072\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0005J\u000f\u0010\u0012\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000\u0088\u0001\u0002\u0092\u0001\u00020\u0003¨\u0006\u0017"}, d2 = {"Landroidx/compose/ui/focus/Focusability;", "", "value", "", "constructor-impl", "(I)I", "canFocus", "", "node", "Landroidx/compose/ui/node/CompositionLocalConsumerModifierNode;", "canFocus-impl$ui_release", "(ILandroidx/compose/ui/node/CompositionLocalConsumerModifierNode;)Z", "equals", "other", "equals-impl", "(ILjava/lang/Object;)Z", "hashCode", "hashCode-impl", "toString", "", "toString-impl", "(I)Ljava/lang/String;", "Companion", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@JvmInline
public final class Focusability {
    private static final int Always = 0;
    public static final Companion Companion = null;
    private static final int Never = 0;
    private static final int SystemDefined = 0;
    private final int value;

    /* JADX INFO: compiled from: Focusability.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0019\u0010\u0003\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0005\u0010\u0006R\u0019\u0010\b\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\t\u0010\u0006R\u0019\u0010\n\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u000b\u0010\u0006\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\f"}, d2 = {"Landroidx/compose/ui/focus/Focusability$Companion;", "", "()V", "Always", "Landroidx/compose/ui/focus/Focusability;", "getAlways-LCbbffg", "()I", "I", "Never", "getNever-LCbbffg", "SystemDefined", "getSystemDefined-LCbbffg", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker r1) {
            this();
        }

        private Companion() {
        }

        /* JADX INFO: renamed from: getAlways-LCbbffg, reason: not valid java name */
        public final int m4061getAlwaysLCbbffg() {
            return Focusability.access$getAlways$cp();
        }

        /* JADX INFO: renamed from: getSystemDefined-LCbbffg, reason: not valid java name */
        public final int m4063getSystemDefinedLCbbffg() {
            return Focusability.access$getSystemDefined$cp();
        }

        /* JADX INFO: renamed from: getNever-LCbbffg, reason: not valid java name */
        public final int m4062getNeverLCbbffg() {
            return Focusability.access$getNever$cp();
        }
    }

    /* JADX INFO: renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ Focusability m4053boximpl(int r1) {
        return new Focusability(r1);
    }

    /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
    private static int m4055constructorimpl(int r0) {
        return r0;
    }

    /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
    public static boolean m4056equalsimpl(int r2, Object r3) {
        if ((r3 instanceof Focusability) == true) goto L6;
        return false;
    L6:
        if (r2 == ((Focusability) r3).m4060unboximpl()) goto L8;
        return false;
    L8:
        return true;
    }

    /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m4057equalsimpl0(int r1, int r2) {
        if (r1 != r2) goto L4;
        return true;
    L4:
        return false;
    }

    /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
    public static int m4058hashCodeimpl(int r1) {
        return Integer.hashCode(r1);
    }

    public boolean equals(Object r2) {
        return m4056equalsimpl(this.value, r2);
    }

    public int hashCode() {
        return m4058hashCodeimpl(this.value);
    }

    /* JADX INFO: renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m4060unboximpl() {
        return this.value;
    }

    public static final /* synthetic */ int access$getAlways$cp() {
        return Always;
    }

    public static final /* synthetic */ int access$getNever$cp() {
        return Never;
    }

    public static final /* synthetic */ int access$getSystemDefined$cp() {
        return SystemDefined;
    }

    private /* synthetic */ Focusability(int value) {
        this.value = value;
    }

    static {
        Companion = new Companion(null);
        Always = m4055constructorimpl(1);
        SystemDefined = m4055constructorimpl(0);
        Never = m4055constructorimpl(2);
    }

    public String toString() {
        return m4059toStringimpl(this.value);
    }

    /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
    public static String m4059toStringimpl(int arg0) {
        if (m4057equalsimpl0(arg0, Always) == false) goto L6;
        return "Always";
    L6:
        if (m4057equalsimpl0(arg0, SystemDefined) == false) goto L9;
        return "SystemDefined";
    L9:
        if (m4057equalsimpl0(arg0, Never) == false) goto L13;
        return "Never";
    L13:
        throw new IllegalStateException("Unknown Focusability".toString());
    }

    /* JADX INFO: renamed from: canFocus-impl$ui_release, reason: not valid java name */
    public static final boolean m4054canFocusimpl$ui_release(int arg0, CompositionLocalConsumerModifierNode node) {
        if (m4057equalsimpl0(arg0, Always) == false) goto L6;
        return true;
    L6:
        if (m4057equalsimpl0(arg0, SystemDefined) == false) goto L9;
        return true ^ InputMode.m5123equalsimpl0(((InputModeManager) CompositionLocalConsumerModifierNodeKt.currentValueOf(node, CompositionLocalsKt.getLocalInputModeManager())).mo5129getInputModeaOaMEAU(), InputMode.Companion.m5128getTouchaOaMEAU());
    L9:
        if (m4057equalsimpl0(arg0, Never) == false) goto L13;
        return false;
    L13:
        throw new IllegalStateException("Unknown Focusability".toString());
    }
}
