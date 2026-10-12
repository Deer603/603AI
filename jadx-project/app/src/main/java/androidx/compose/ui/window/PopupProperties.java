package androidx.compose.ui.window;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: AndroidPopup.android.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0012\b\u0007\u0018\u00002\u00020\u0001B/\b\u0016\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003¢\u0006\u0002\u0010\u0007BC\b\u0016\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003¢\u0006\u0002\u0010\u000bBM\b\u0016\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\f\u001a\u00020\u0003¢\u0006\u0002\u0010\rB?\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\n\u001a\u00020\u0003\u0012\b\b\u0002\u0010\f\u001a\u00020\u0003¢\u0006\u0002\u0010\u0011J\u0013\u0010\u001e\u001a\u00020\u00032\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010 \u001a\u00020\u000fH\u0016R\u0011\u0010\u0006\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0013R\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0013R\u0014\u0010\u000e\u001a\u00020\u000fX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\u0002\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u0013R\u0014\u0010\u0010\u001a\u00020\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0013R\u0011\u0010\b\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001cR\u0011\u0010\f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0013¨\u0006!"}, d2 = {"Landroidx/compose/ui/window/PopupProperties;", "", "focusable", "", "dismissOnBackPress", "dismissOnClickOutside", "clippingEnabled", "(ZZZZ)V", "securePolicy", "Landroidx/compose/ui/window/SecureFlagPolicy;", "excludeFromSystemGesture", "(ZZZLandroidx/compose/ui/window/SecureFlagPolicy;ZZ)V", "usePlatformDefaultWidth", "(ZZZLandroidx/compose/ui/window/SecureFlagPolicy;ZZZ)V", "flags", "", "inheritSecurePolicy", "(IZZZZZ)V", "getClippingEnabled", "()Z", "getDismissOnBackPress", "getDismissOnClickOutside", "getExcludeFromSystemGesture", "getFlags$ui_release", "()I", "getFocusable", "getInheritSecurePolicy$ui_release", "getSecurePolicy", "()Landroidx/compose/ui/window/SecureFlagPolicy;", "getUsePlatformDefaultWidth", "equals", "other", "hashCode", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class PopupProperties {
    public static final int $stable = 0;
    private final boolean dismissOnBackPress;
    private final boolean dismissOnClickOutside;
    private final boolean excludeFromSystemGesture;
    private final int flags;
    private final boolean inheritSecurePolicy;
    private final boolean usePlatformDefaultWidth;

    static {
    }

    public PopupProperties(int flags, boolean inheritSecurePolicy, boolean dismissOnBackPress, boolean dismissOnClickOutside, boolean excludeFromSystemGesture, boolean usePlatformDefaultWidth) {
        this.flags = flags;
        this.inheritSecurePolicy = inheritSecurePolicy;
        this.dismissOnBackPress = dismissOnBackPress;
        this.dismissOnClickOutside = dismissOnClickOutside;
        this.excludeFromSystemGesture = excludeFromSystemGesture;
        this.usePlatformDefaultWidth = usePlatformDefaultWidth;
    }

    public /* synthetic */ PopupProperties(int r2, boolean r3, boolean r4, boolean r5, boolean r6, boolean r7, int r8, DefaultConstructorMarker r9) {
        if ((r8 & 2) == 0) goto L6;
        r3 = true;
    L6:
        if ((r8 & 4) == 0) goto L9;
        r4 = true;
    L9:
        if ((r8 & 8) == 0) goto L12;
        r5 = true;
    L12:
        if ((r8 & 16) == 0) goto L15;
        r6 = true;
    L15:
        if ((r8 & 32) == 0) goto L17;
        boolean r10 = false;
    L18:
        boolean r11 = r6;
        boolean r12 = r5;
        this(r2, r3, r4, r12, r11, r10);
        return;
    L17:
        r10 = r7;
        goto L18
    }

    public final int getFlags$ui_release() {
        return this.flags;
    }

    public final boolean getInheritSecurePolicy$ui_release() {
        return this.inheritSecurePolicy;
    }

    public final boolean getDismissOnBackPress() {
        return this.dismissOnBackPress;
    }

    public final boolean getDismissOnClickOutside() {
        return this.dismissOnClickOutside;
    }

    public final boolean getExcludeFromSystemGesture() {
        return this.excludeFromSystemGesture;
    }

    public final boolean getUsePlatformDefaultWidth() {
        return this.usePlatformDefaultWidth;
    }

    public /* synthetic */ PopupProperties(boolean r2, boolean r3, boolean r4, boolean r5, int r6, DefaultConstructorMarker r7) {
        if ((r6 & 1) == 0) goto L6;
        r2 = false;
    L6:
        if ((r6 & 2) == 0) goto L9;
        r3 = true;
    L9:
        if ((r6 & 4) == 0) goto L12;
        r4 = true;
    L12:
        if ((r6 & 8) == 0) goto L14;
        r5 = true;
    L14:
        this(r2, r3, r4, r5);
    }

    public PopupProperties(boolean focusable, boolean dismissOnBackPress, boolean dismissOnClickOutside, boolean clippingEnabled) {
        this(focusable, dismissOnBackPress, dismissOnClickOutside, SecureFlagPolicy.Inherit, true, clippingEnabled);
    }

    public /* synthetic */ PopupProperties(boolean r2, boolean r3, boolean r4, SecureFlagPolicy r5, boolean r6, boolean r7, int r8, DefaultConstructorMarker r9) {
        if ((r8 & 1) == 0) goto L6;
        r2 = false;
    L6:
        if ((r8 & 2) == 0) goto L9;
        r3 = true;
    L9:
        if ((r8 & 4) == 0) goto L12;
        r4 = true;
    L12:
        if ((r8 & 8) == 0) goto L15;
        r5 = SecureFlagPolicy.Inherit;
    L15:
        if ((r8 & 16) == 0) goto L18;
        r6 = true;
    L18:
        if ((r8 & 32) == 0) goto L20;
        boolean r10 = true;
    L21:
        boolean r11 = r6;
        boolean r12 = r4;
        boolean r13 = r2;
        this(r13, r3, r12, r5, r11, r10);
        return;
    L20:
        r10 = r7;
        goto L21
    }

    public PopupProperties(boolean focusable, boolean dismissOnBackPress, boolean dismissOnClickOutside, SecureFlagPolicy securePolicy, boolean excludeFromSystemGesture, boolean clippingEnabled) {
        this(focusable, dismissOnBackPress, dismissOnClickOutside, securePolicy, excludeFromSystemGesture, clippingEnabled, false);
    }

    public /* synthetic */ PopupProperties(boolean r3, boolean r4, boolean r5, SecureFlagPolicy r6, boolean r7, boolean r8, boolean r9, int r10, DefaultConstructorMarker r11) {
        if ((r10 & 1) == 0) goto L6;
        r3 = false;
    L6:
        if ((r10 & 2) == 0) goto L9;
        r4 = true;
    L9:
        if ((r10 & 4) == 0) goto L12;
        r5 = true;
    L12:
        if ((r10 & 8) == 0) goto L15;
        r6 = SecureFlagPolicy.Inherit;
    L15:
        if ((r10 & 16) == 0) goto L18;
        r7 = true;
    L18:
        if ((r10 & 32) == 0) goto L21;
        r8 = true;
    L21:
        if ((r10 & 64) == 0) goto L23;
        boolean r12 = false;
    L24:
        boolean r13 = r8;
        boolean r14 = r7;
        SecureFlagPolicy r15 = r6;
        boolean r16 = r5;
        this(r3, r4, r16, r15, r14, r13, r12);
        return;
    L23:
        r12 = r9;
        goto L24
    }

    public PopupProperties(boolean focusable, boolean dismissOnBackPress, boolean dismissOnClickOutside, SecureFlagPolicy securePolicy, boolean excludeFromSystemGesture, boolean clippingEnabled, boolean usePlatformDefaultWidth) {
        int r1 = AndroidPopup_androidKt.access$createFlags(focusable, securePolicy, clippingEnabled);
        if (securePolicy != SecureFlagPolicy.Inherit) goto L5;
        boolean r0 = true;
    L6:
        this(r1, r0, dismissOnBackPress, dismissOnClickOutside, excludeFromSystemGesture, usePlatformDefaultWidth);
        return;
    L5:
        r0 = false;
        goto L6
    }

    public final boolean getFocusable() {
        if ((this.flags & 8) != 0) goto L5;
        return true;
    L5:
        return false;
    }

    public final SecureFlagPolicy getSecurePolicy() {
        if (this.inheritSecurePolicy == false) goto L6;
        return SecureFlagPolicy.Inherit;
    L6:
        if ((this.flags & 8192) != 0) goto L9;
        return SecureFlagPolicy.SecureOff;
    L9:
        return SecureFlagPolicy.SecureOn;
    }

    public final boolean getClippingEnabled() {
        if ((this.flags & 512) != 0) goto L5;
        return true;
    L5:
        return false;
    }

    public boolean equals(Object other) {
        if (this != other) goto L6;
        return true;
    L6:
        if ((other instanceof PopupProperties) == true) goto L9;
        return false;
    L9:
        if (this.flags == ((PopupProperties) other).flags) goto L12;
        return false;
    L12:
        if (this.inheritSecurePolicy == ((PopupProperties) other).inheritSecurePolicy) goto L15;
        return false;
    L15:
        if (this.dismissOnBackPress == ((PopupProperties) other).dismissOnBackPress) goto L18;
        return false;
    L18:
        if (this.dismissOnClickOutside == ((PopupProperties) other).dismissOnClickOutside) goto L21;
        return false;
    L21:
        if (this.excludeFromSystemGesture == ((PopupProperties) other).excludeFromSystemGesture) goto L24;
        return false;
    L24:
        if (this.usePlatformDefaultWidth == ((PopupProperties) other).usePlatformDefaultWidth) goto L26;
        return false;
    L26:
        return true;
    }

    public int hashCode() {
        int result = this.flags;
        int result2 = (result * 31) + Boolean.hashCode(this.inheritSecurePolicy);
        return (((((((result2 * 31) + Boolean.hashCode(this.dismissOnBackPress)) * 31) + Boolean.hashCode(this.dismissOnClickOutside)) * 31) + Boolean.hashCode(this.excludeFromSystemGesture)) * 31) + Boolean.hashCode(this.usePlatformDefaultWidth);
    }
}
