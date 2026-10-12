package androidx.compose.material3;

import androidx.autofill.HintConstants;
import kotlin.Metadata;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: ExposedDropdownMenu.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0006\b\u0087@\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0010\u0010\u0005R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000\u0088\u0001\u0002\u0092\u0001\u00020\u0003¨\u0006\u0012"}, d2 = {"Landroidx/compose/material3/MenuAnchorType;", "", HintConstants.AUTOFILL_HINT_NAME, "", "constructor-impl", "(Ljava/lang/String;)Ljava/lang/String;", "equals", "", "other", "equals-impl", "(Ljava/lang/String;Ljava/lang/Object;)Z", "hashCode", "", "hashCode-impl", "(Ljava/lang/String;)I", "toString", "toString-impl", "Companion", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@JvmInline
public final class MenuAnchorType {
    public static final Companion Companion = null;
    private static final String PrimaryEditable = null;
    private static final String PrimaryNotEditable = null;
    private static final String SecondaryEditable = null;
    private final String name;

    /* JADX INFO: compiled from: ExposedDropdownMenu.android.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0019\u0010\u0003\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0005\u0010\u0006R\u0019\u0010\b\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\t\u0010\u0006R\u0019\u0010\n\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u000b\u0010\u0006\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\f"}, d2 = {"Landroidx/compose/material3/MenuAnchorType$Companion;", "", "()V", "PrimaryEditable", "Landroidx/compose/material3/MenuAnchorType;", "getPrimaryEditable-Mg6Rgbw", "()Ljava/lang/String;", "Ljava/lang/String;", "PrimaryNotEditable", "getPrimaryNotEditable-Mg6Rgbw", "SecondaryEditable", "getSecondaryEditable-Mg6Rgbw", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker r1) {
            this();
        }

        private Companion() {
        }

        /* JADX INFO: renamed from: getPrimaryNotEditable-Mg6Rgbw, reason: not valid java name */
        public final String m2352getPrimaryNotEditableMg6Rgbw() {
            return MenuAnchorType.access$getPrimaryNotEditable$cp();
        }

        /* JADX INFO: renamed from: getPrimaryEditable-Mg6Rgbw, reason: not valid java name */
        public final String m2351getPrimaryEditableMg6Rgbw() {
            return MenuAnchorType.access$getPrimaryEditable$cp();
        }

        /* JADX INFO: renamed from: getSecondaryEditable-Mg6Rgbw, reason: not valid java name */
        public final String m2353getSecondaryEditableMg6Rgbw() {
            return MenuAnchorType.access$getSecondaryEditable$cp();
        }
    }

    /* JADX INFO: renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ MenuAnchorType m2344boximpl(String r1) {
        return new MenuAnchorType(r1);
    }

    /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
    private static String m2345constructorimpl(String r0) {
        return r0;
    }

    /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
    public static boolean m2346equalsimpl(String r2, Object r3) {
        if ((r3 instanceof MenuAnchorType) == true) goto L6;
        return false;
    L6:
        if (Intrinsics.areEqual(r2, ((MenuAnchorType) r3).m2350unboximpl()) == true) goto L8;
        return false;
    L8:
        return true;
    }

    /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m2347equalsimpl0(String r1, String r2) {
        return Intrinsics.areEqual(r1, r2);
    }

    /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
    public static int m2348hashCodeimpl(String r1) {
        return r1.hashCode();
    }

    public boolean equals(Object r2) {
        return m2346equalsimpl(this.name, r2);
    }

    public int hashCode() {
        return m2348hashCodeimpl(this.name);
    }

    /* JADX INFO: renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ String m2350unboximpl() {
        return this.name;
    }

    public static final /* synthetic */ String access$getPrimaryEditable$cp() {
        return PrimaryEditable;
    }

    public static final /* synthetic */ String access$getPrimaryNotEditable$cp() {
        return PrimaryNotEditable;
    }

    public static final /* synthetic */ String access$getSecondaryEditable$cp() {
        return SecondaryEditable;
    }

    private /* synthetic */ MenuAnchorType(String name) {
        this.name = name;
    }

    static {
        Companion = new Companion(null);
        PrimaryNotEditable = m2345constructorimpl("PrimaryNotEditable");
        PrimaryEditable = m2345constructorimpl("PrimaryEditable");
        SecondaryEditable = m2345constructorimpl("SecondaryEditable");
    }

    /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
    public static String m2349toStringimpl(String arg0) {
        return arg0;
    }

    public String toString() {
        return m2349toStringimpl(this.name);
    }
}
