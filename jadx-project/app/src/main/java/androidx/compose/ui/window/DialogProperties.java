package androidx.compose.ui.window;

import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: AndroidDialog.android.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\b\n\u0000\b\u0007\u0018\u00002\u00020\u0001B%\b\u0016\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003¢\u0006\u0002\u0010\u0006B%\b\u0017\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tB7\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\n\u001a\u00020\u0003¢\u0006\u0002\u0010\u000bJ\u0013\u0010\u0013\u001a\u00020\u00032\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u0015\u001a\u00020\u0016H\u0016R\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\rR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\r¨\u0006\u0017"}, d2 = {"Landroidx/compose/ui/window/DialogProperties;", "", "dismissOnBackPress", "", "dismissOnClickOutside", "usePlatformDefaultWidth", "(ZZZ)V", "securePolicy", "Landroidx/compose/ui/window/SecureFlagPolicy;", "(ZZLandroidx/compose/ui/window/SecureFlagPolicy;)V", "decorFitsSystemWindows", "(ZZLandroidx/compose/ui/window/SecureFlagPolicy;ZZ)V", "getDecorFitsSystemWindows", "()Z", "getDismissOnBackPress", "getDismissOnClickOutside", "getSecurePolicy", "()Landroidx/compose/ui/window/SecureFlagPolicy;", "getUsePlatformDefaultWidth", "equals", "other", "hashCode", "", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class DialogProperties {
    public static final int $stable = 0;
    private final boolean decorFitsSystemWindows;
    private final boolean dismissOnBackPress;
    private final boolean dismissOnClickOutside;
    private final SecureFlagPolicy securePolicy;
    private final boolean usePlatformDefaultWidth;

    static {
    }

    public DialogProperties() {
        boolean r1 = false;
        boolean r2 = false;
        SecureFlagPolicy r3 = null;
        boolean r4 = false;
        boolean r5 = false;
        this(r1, r2, r3, r4, r5, 31, null);
    }

    public DialogProperties(boolean dismissOnBackPress, boolean dismissOnClickOutside, SecureFlagPolicy securePolicy, boolean usePlatformDefaultWidth, boolean decorFitsSystemWindows) {
        this.dismissOnBackPress = dismissOnBackPress;
        this.dismissOnClickOutside = dismissOnClickOutside;
        this.securePolicy = securePolicy;
        this.usePlatformDefaultWidth = usePlatformDefaultWidth;
        this.decorFitsSystemWindows = decorFitsSystemWindows;
    }

    public /* synthetic */ DialogProperties(boolean r2, boolean r3, SecureFlagPolicy r4, boolean r5, boolean r6, int r7, DefaultConstructorMarker r8) {
        if ((r7 & 1) == 0) goto L6;
        r2 = true;
    L6:
        if ((r7 & 2) == 0) goto L9;
        r3 = true;
    L9:
        if ((r7 & 4) == 0) goto L12;
        r4 = SecureFlagPolicy.Inherit;
    L12:
        if ((r7 & 8) == 0) goto L15;
        r5 = true;
    L15:
        if ((r7 & 16) == 0) goto L17;
        boolean r9 = true;
    L18:
        boolean r10 = r5;
        SecureFlagPolicy r11 = r4;
        this(r2, r3, r11, r10, r9);
        return;
    L17:
        r9 = r6;
        goto L18
    }

    public final boolean getDismissOnBackPress() {
        return this.dismissOnBackPress;
    }

    public final boolean getDismissOnClickOutside() {
        return this.dismissOnClickOutside;
    }

    public final SecureFlagPolicy getSecurePolicy() {
        return this.securePolicy;
    }

    public final boolean getUsePlatformDefaultWidth() {
        return this.usePlatformDefaultWidth;
    }

    public final boolean getDecorFitsSystemWindows() {
        return this.decorFitsSystemWindows;
    }

    public /* synthetic */ DialogProperties(boolean r2, boolean r3, boolean r4, int r5, DefaultConstructorMarker r6) {
        if ((r5 & 1) == 0) goto L6;
        r2 = true;
    L6:
        if ((r5 & 2) == 0) goto L9;
        r3 = true;
    L9:
        if ((r5 & 4) == 0) goto L11;
        r4 = true;
    L11:
        this(r2, r3, r4);
    }

    public DialogProperties(boolean dismissOnBackPress, boolean dismissOnClickOutside, boolean usePlatformDefaultWidth) {
        this(dismissOnBackPress, dismissOnClickOutside, SecureFlagPolicy.Inherit, usePlatformDefaultWidth, true);
    }

    public /* synthetic */ DialogProperties(boolean r2, boolean r3, SecureFlagPolicy r4, int r5, DefaultConstructorMarker r6) {
        if ((r5 & 1) == 0) goto L6;
        r2 = true;
    L6:
        if ((r5 & 2) == 0) goto L9;
        r3 = true;
    L9:
        if ((r5 & 4) == 0) goto L11;
        r4 = SecureFlagPolicy.Inherit;
    L11:
        this(r2, r3, r4);
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Maintained for binary compatibility")
    public /* synthetic */ DialogProperties(boolean dismissOnBackPress, boolean dismissOnClickOutside, SecureFlagPolicy securePolicy) {
        this(dismissOnBackPress, dismissOnClickOutside, securePolicy, true, true);
    }

    public boolean equals(Object other) {
        if (this != other) goto L6;
        return true;
    L6:
        if ((other instanceof DialogProperties) == true) goto L9;
        return false;
    L9:
        if (this.dismissOnBackPress == ((DialogProperties) other).dismissOnBackPress) goto L12;
        return false;
    L12:
        if (this.dismissOnClickOutside == ((DialogProperties) other).dismissOnClickOutside) goto L15;
        return false;
    L15:
        if (this.securePolicy == ((DialogProperties) other).securePolicy) goto L18;
        return false;
    L18:
        if (this.usePlatformDefaultWidth == ((DialogProperties) other).usePlatformDefaultWidth) goto L21;
        return false;
    L21:
        if (this.decorFitsSystemWindows == ((DialogProperties) other).decorFitsSystemWindows) goto L23;
        return false;
    L23:
        return true;
    }

    public int hashCode() {
        int result = Boolean.hashCode(this.dismissOnBackPress);
        int result2 = (result * 31) + Boolean.hashCode(this.dismissOnClickOutside);
        return (((((result2 * 31) + this.securePolicy.hashCode()) * 31) + Boolean.hashCode(this.usePlatformDefaultWidth)) * 31) + Boolean.hashCode(this.decorFitsSystemWindows);
    }
}
