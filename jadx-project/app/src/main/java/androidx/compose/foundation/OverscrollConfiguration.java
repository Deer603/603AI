package androidx.compose.foundation;

import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: OverscrollConfiguration.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Deprecated(message = "Providing `OverscrollConfiguration` through `LocalOverscrollConfiguration` to disable / configure overscroll has been replaced with `LocalOverscrollFactory` and `rememberPlatformOverscrollFactory`. To disable overscroll, instead of `LocalOverscrollConfiguration provides null`, use `LocalOverscrollFactory provides null`. To change the glow color / padding, instead of `LocalOverscrollConfiguration provides OverscrollConfiguration(myColor, myPadding)`, use `LocalOverscrollFactory provides rememberPlatformOverscrollFactory(myColor, myPadding)`")
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u000f\u001a\u00020\u0010H\u0016J\b\u0010\u0011\u001a\u00020\u0012H\u0016R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0019\u0010\u0002\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\t\u0010\n\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0013"}, d2 = {"Landroidx/compose/foundation/OverscrollConfiguration;", "", "glowColor", "Landroidx/compose/ui/graphics/Color;", "drawPadding", "Landroidx/compose/foundation/layout/PaddingValues;", "(JLandroidx/compose/foundation/layout/PaddingValues;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "getDrawPadding", "()Landroidx/compose/foundation/layout/PaddingValues;", "getGlowColor-0d7_KjU", "()J", "J", "equals", "", "other", "hashCode", "", "toString", "", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class OverscrollConfiguration {
    public static final int $stable = 0;
    private final PaddingValues drawPadding;
    private final long glowColor;

    static {
    }

    public /* synthetic */ OverscrollConfiguration(long r1, PaddingValues r3, DefaultConstructorMarker r4) {
        this(r1, r3);
    }

    private OverscrollConfiguration(long glowColor, PaddingValues drawPadding) {
        this.glowColor = glowColor;
        this.drawPadding = drawPadding;
    }

    public /* synthetic */ OverscrollConfiguration(long r1, PaddingValues r3, int r4, DefaultConstructorMarker r5) {
        if ((r4 & 1) == 0) goto L5;
        r1 = ColorKt.Color(4284900966L);
    L5:
        DefaultConstructorMarker r6 = null;
        if ((r4 & 2) == 0) goto L8;
        r3 = PaddingKt.m720PaddingValuesYgX7TsA$default(0.0f, 0.0f, 3, null);
    L8:
        this(r1, r3, r6);
    }

    /* JADX INFO: renamed from: getGlowColor-0d7_KjU, reason: not valid java name */
    public final long m323getGlowColor0d7_KjU() {
        return this.glowColor;
    }

    public final PaddingValues getDrawPadding() {
        return this.drawPadding;
    }

    public boolean equals(Object other) {
        if (this != other) goto L5;
        return true;
    L5:
        Class<?> r1 = getClass();
        if (other == null) goto L8;
        Class<?> r2 = other.getClass();
    L10:
        if (Intrinsics.areEqual(r1, r2) == true) goto L12;
        return false;
    L12:
        Intrinsics.checkNotNull(other, "null cannot be cast to non-null type androidx.compose.foundation.OverscrollConfiguration");
        OverscrollConfiguration r3 = (OverscrollConfiguration) other;
        if (Color.m4367equalsimpl0(this.glowColor, ((OverscrollConfiguration) other).glowColor) == true) goto L16;
        return false;
    L16:
        if (Intrinsics.areEqual(this.drawPadding, ((OverscrollConfiguration) other).drawPadding) == true) goto L18;
        return false;
    L18:
        return true;
    L8:
        r2 = null;
        goto L10
    }

    public int hashCode() {
        int result = Color.m4373hashCodeimpl(this.glowColor);
        return (result * 31) + this.drawPadding.hashCode();
    }

    public String toString() {
        return "OverscrollConfiguration(glowColor=" + Color.m4374toStringimpl(this.glowColor) + ", drawPadding=" + this.drawPadding + ')';
    }
}
