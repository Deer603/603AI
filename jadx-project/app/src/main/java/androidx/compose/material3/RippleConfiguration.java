package androidx.compose.material3;

import androidx.compose.material.ripple.RippleAlpha;
import androidx.compose.ui.graphics.Color;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Ripple.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u000f\u001a\u00020\u0010H\u0016J\b\u0010\u0011\u001a\u00020\u0012H\u0016R\u0019\u0010\u0002\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\t\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0013"}, d2 = {"Landroidx/compose/material3/RippleConfiguration;", "", "color", "Landroidx/compose/ui/graphics/Color;", "rippleAlpha", "Landroidx/compose/material/ripple/RippleAlpha;", "(JLandroidx/compose/material/ripple/RippleAlpha;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "getColor-0d7_KjU", "()J", "J", "getRippleAlpha", "()Landroidx/compose/material/ripple/RippleAlpha;", "equals", "", "other", "hashCode", "", "toString", "", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class RippleConfiguration {
    public static final int $stable = 0;
    private final long color;
    private final RippleAlpha rippleAlpha;

    static {
    }

    public /* synthetic */ RippleConfiguration(long r1, RippleAlpha r3, DefaultConstructorMarker r4) {
        this(r1, r3);
    }

    private RippleConfiguration(long color, RippleAlpha rippleAlpha) {
        this.color = color;
        this.rippleAlpha = rippleAlpha;
    }

    public /* synthetic */ RippleConfiguration(long r1, RippleAlpha r3, int r4, DefaultConstructorMarker r5) {
        if ((r4 & 1) == 0) goto L5;
        r1 = Color.Companion.m4402getUnspecified0d7_KjU();
    L5:
        DefaultConstructorMarker r6 = null;
        if ((r4 & 2) == 0) goto L8;
        r3 = null;
    L8:
        this(r1, r3, r6);
    }

    /* JADX INFO: renamed from: getColor-0d7_KjU, reason: not valid java name */
    public final long m2529getColor0d7_KjU() {
        return this.color;
    }

    public final RippleAlpha getRippleAlpha() {
        return this.rippleAlpha;
    }

    public boolean equals(Object other) {
        if (this != other) goto L6;
        return true;
    L6:
        if ((other instanceof RippleConfiguration) == true) goto L9;
        return false;
    L9:
        if (Color.m4367equalsimpl0(this.color, ((RippleConfiguration) other).color) == true) goto L12;
        return false;
    L12:
        if (Intrinsics.areEqual(this.rippleAlpha, ((RippleConfiguration) other).rippleAlpha) == true) goto L14;
        return false;
    L14:
        return true;
    }

    public int hashCode() {
        int result = Color.m4373hashCodeimpl(this.color);
        int r1 = result * 31;
        RippleAlpha r2 = this.rippleAlpha;
        if (r2 == null) goto L5;
        int r3 = r2.hashCode();
    L6:
        int result2 = r1 + r3;
        return result2;
    L5:
        r3 = 0;
        goto L6
    }

    public String toString() {
        return "RippleConfiguration(color=" + Color.m4374toStringimpl(this.color) + ", rippleAlpha=" + this.rippleAlpha + ')';
    }
}
