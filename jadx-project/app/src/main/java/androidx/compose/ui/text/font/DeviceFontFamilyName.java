package androidx.compose.ui.text.font;

import androidx.autofill.HintConstants;
import androidx.compose.ui.text.internal.InlineClassHelperKt;
import kotlin.Metadata;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: DeviceFontFamilyNameFont.android.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0005\b\u0087@\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u0088\u0001\u0002¨\u0006\u0013"}, d2 = {"Landroidx/compose/ui/text/font/DeviceFontFamilyName;", "", HintConstants.AUTOFILL_HINT_NAME, "", "constructor-impl", "(Ljava/lang/String;)Ljava/lang/String;", "getName", "()Ljava/lang/String;", "equals", "", "other", "equals-impl", "(Ljava/lang/String;Ljava/lang/Object;)Z", "hashCode", "", "hashCode-impl", "(Ljava/lang/String;)I", "toString", "toString-impl", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@JvmInline
public final class DeviceFontFamilyName {
    private final String name;

    /* JADX INFO: renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ DeviceFontFamilyName m6491boximpl(String r1) {
        return new DeviceFontFamilyName(r1);
    }

    /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
    public static boolean m6493equalsimpl(String r2, Object r3) {
        if ((r3 instanceof DeviceFontFamilyName) == true) goto L6;
        return false;
    L6:
        if (Intrinsics.areEqual(r2, ((DeviceFontFamilyName) r3).m6497unboximpl()) == true) goto L8;
        return false;
    L8:
        return true;
    }

    /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m6494equalsimpl0(String r1, String r2) {
        return Intrinsics.areEqual(r1, r2);
    }

    /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
    public static int m6495hashCodeimpl(String r1) {
        return r1.hashCode();
    }

    /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
    public static String m6496toStringimpl(String r2) {
        return "DeviceFontFamilyName(name=" + r2 + ')';
    }

    public boolean equals(Object r2) {
        return m6493equalsimpl(this.name, r2);
    }

    public int hashCode() {
        return m6495hashCodeimpl(this.name);
    }

    public String toString() {
        return m6496toStringimpl(this.name);
    }

    /* JADX INFO: renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ String m6497unboximpl() {
        return this.name;
    }

    private /* synthetic */ DeviceFontFamilyName(String name) {
        this.name = name;
    }

    public final String getName() {
        return this.name;
    }

    /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
    public static String m6492constructorimpl(String name) {
        if (name.length() <= 0) goto L5;
        boolean value$iv = true;
    L7:
        if (value$iv == true) goto L10;
        InlineClassHelperKt.throwIllegalArgumentException("name may not be empty");
    L10:
        return name;
    L5:
        value$iv = false;
        goto L7
    }
}
