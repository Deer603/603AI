package androidx.compose.foundation;

import android.os.Build;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.semantics.SemanticsPropertyKey;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.DpSize;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: Magnifier.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000X\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0012\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\tH\u0001\u001a\u0014\u0010\n\u001a\u00020\u0007*\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000bH\u0000\u001a\u0094\u0001\u0010\r\u001a\u00020\u000e*\u00020\u000e2\u0017\u0010\u000f\u001a\u0013\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00030\u0010¢\u0006\u0002\b\u00122\u001b\b\u0002\u0010\u0013\u001a\u0015\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0010¢\u0006\u0002\b\u00122\u0016\b\u0002\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u00102\b\b\u0002\u0010\u0017\u001a\u00020\u000b2\b\b\u0002\u0010\u0018\u001a\u00020\u00152\b\b\u0002\u0010\u0019\u001a\u00020\u001a2\b\b\u0002\u0010\u001b\u001a\u00020\u001a2\b\b\u0002\u0010\u001c\u001a\u00020\u0007ø\u0001\u0000¢\u0006\u0004\b\u001d\u0010\u001e\u001a¬\u0001\u0010\r\u001a\u00020\u000e*\u00020\u000e2\u0017\u0010\u000f\u001a\u0013\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00030\u0010¢\u0006\u0002\b\u00122\u001b\b\u0002\u0010\u0013\u001a\u0015\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0010¢\u0006\u0002\b\u00122\u0016\b\u0002\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u00102\b\b\u0002\u0010\u0017\u001a\u00020\u000b2\b\b\u0002\u0010\u001f\u001a\u00020\u00072\b\b\u0002\u0010\u0018\u001a\u00020\u00152\b\b\u0002\u0010\u0019\u001a\u00020\u001a2\b\b\u0002\u0010\u001b\u001a\u00020\u001a2\b\b\u0002\u0010 \u001a\u00020\u00072\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\"H\u0000ø\u0001\u0000¢\u0006\u0004\b#\u0010$\" \u0010\u0000\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u0005\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006%"}, d2 = {"MagnifierPositionInRoot", "Landroidx/compose/ui/semantics/SemanticsPropertyKey;", "Lkotlin/Function0;", "Landroidx/compose/ui/geometry/Offset;", "getMagnifierPositionInRoot", "()Landroidx/compose/ui/semantics/SemanticsPropertyKey;", "isPlatformMagnifierSupported", "", "sdkVersion", "", "equalsIncludingNaN", "", "other", "magnifier", "Landroidx/compose/ui/Modifier;", "sourceCenter", "Lkotlin/Function1;", "Landroidx/compose/ui/unit/Density;", "Lkotlin/ExtensionFunctionType;", "magnifierCenter", "onSizeChanged", "Landroidx/compose/ui/unit/DpSize;", "", "zoom", "size", "cornerRadius", "Landroidx/compose/ui/unit/Dp;", "elevation", "clip", "magnifier-UpNRX3w", "(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;FJFFZ)Landroidx/compose/ui/Modifier;", "useTextDefault", "clippingEnabled", "platformMagnifierFactory", "Landroidx/compose/foundation/PlatformMagnifierFactory;", "magnifier-jPUL71Q", "(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;FZJFFZLandroidx/compose/foundation/PlatformMagnifierFactory;)Landroidx/compose/ui/Modifier;", "foundation_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class Magnifier_androidKt {
    private static final SemanticsPropertyKey<Function0<Offset>> MagnifierPositionInRoot = null;

    static {
        MagnifierPositionInRoot = new SemanticsPropertyKey("MagnifierPositionInRoot", null, 2, null);
    }

    public static final SemanticsPropertyKey<Function0<Offset>> getMagnifierPositionInRoot() {
        return MagnifierPositionInRoot;
    }

    /* JADX INFO: renamed from: magnifier-UpNRX3w$default, reason: not valid java name */
    public static /* synthetic */ Modifier m303magnifierUpNRX3w$default(Modifier r1, Function1 r2, Function1 r3, Function1 r4, float r5, long r6, float r8, float r9, boolean r10, int r11, Object r12) {
        if ((r11 & 2) == 0) goto L6;
        r3 = null;
    L6:
        if ((r11 & 4) == 0) goto L9;
        r4 = null;
    L9:
        if ((r11 & 8) == 0) goto L12;
        r5 = Float.NaN;
    L12:
        if ((r11 & 16) == 0) goto L15;
        r6 = DpSize.Companion.m7080getUnspecifiedMYxV2XQ();
    L15:
        if ((r11 & 32) == 0) goto L18;
        r8 = Dp.Companion.m6993getUnspecifiedD9Ej5fM();
    L18:
        if ((r11 & 64) == 0) goto L21;
        r9 = Dp.Companion.m6993getUnspecifiedD9Ej5fM();
    L21:
        if ((r11 & 128) == 0) goto L24;
        r10 = true;
    L24:
        return m302magnifierUpNRX3w(r1, r2, r3, r4, r5, r6, r8, r9, r10);
    }

    /* JADX INFO: renamed from: magnifier-UpNRX3w, reason: not valid java name */
    public static final Modifier m302magnifierUpNRX3w(Modifier $this$magnifier_u2dUpNRX3w, Function1<? super Density, Offset> r15, Function1<? super Density, Offset> r16, Function1<? super DpSize, Unit> r17, float zoom, long size, float cornerRadius, float elevation, boolean clip) {
        return m305magnifierjPUL71Q$default($this$magnifier_u2dUpNRX3w, r15, r16, r17, zoom, false, size, cornerRadius, elevation, clip, null, 512, null);
    }

    /* JADX INFO: renamed from: magnifier-jPUL71Q$default, reason: not valid java name */
    public static /* synthetic */ Modifier m305magnifierjPUL71Q$default(Modifier r1, Function1 r2, Function1 r3, Function1 r4, float r5, boolean r6, long r7, float r9, float r10, boolean r11, PlatformMagnifierFactory r12, int r13, Object r14) {
        if ((r13 & 2) == 0) goto L6;
        r3 = null;
    L6:
        if ((r13 & 4) == 0) goto L9;
        r4 = null;
    L9:
        if ((r13 & 8) == 0) goto L12;
        r5 = Float.NaN;
    L12:
        if ((r13 & 16) == 0) goto L15;
        r6 = false;
    L15:
        if ((r13 & 32) == 0) goto L18;
        r7 = DpSize.Companion.m7080getUnspecifiedMYxV2XQ();
    L18:
        if ((r13 & 64) == 0) goto L21;
        r9 = Dp.Companion.m6993getUnspecifiedD9Ej5fM();
    L21:
        if ((r13 & 128) == 0) goto L24;
        r10 = Dp.Companion.m6993getUnspecifiedD9Ej5fM();
    L24:
        if ((r13 & 256) == 0) goto L27;
        r11 = true;
    L27:
        if ((r13 & 512) == 0) goto L30;
        r12 = null;
    L30:
        return m304magnifierjPUL71Q(r1, r2, r3, r4, r5, r6, r7, r9, r10, r11, r12);
    }

    /* JADX INFO: renamed from: magnifier-jPUL71Q, reason: not valid java name */
    public static final Modifier m304magnifierjPUL71Q(Modifier $this$magnifier_u2djPUL71Q, Function1<? super Density, Offset> r15, Function1<? super Density, Offset> r16, Function1<? super DpSize, Unit> r17, float zoom, boolean useTextDefault, long size, float cornerRadius, float elevation, boolean clippingEnabled, PlatformMagnifierFactory platformMagnifierFactory) {
        if (isPlatformMagnifierSupported$default(0, 1, null) == false) goto L9;
        if (platformMagnifierFactory != null) goto L6;
        PlatformMagnifierFactory r12 = PlatformMagnifierFactory.Companion.getForCurrentPlatform();
    L10:
        return $this$magnifier_u2djPUL71Q.then(new MagnifierElement(r15, r16, r17, zoom, useTextDefault, size, cornerRadius, elevation, clippingEnabled, r12, null));
    L6:
        r12 = platformMagnifierFactory;
        goto L10
    L9:
        return $this$magnifier_u2djPUL71Q;
    }

    public static /* synthetic */ boolean isPlatformMagnifierSupported$default(int r0, int r1, Object r2) {
        if ((r1 & 1) == 0) goto L6;
        r0 = Build.VERSION.SDK_INT;
    L6:
        return isPlatformMagnifierSupported(r0);
    }

    public static final boolean isPlatformMagnifierSupported(int sdkVersion) {
        if (sdkVersion < 28) goto L5;
        return true;
    L5:
        return false;
    }

    public static final boolean equalsIncludingNaN(float $this$equalsIncludingNaN, float other) {
        if (Float.isNaN($this$equalsIncludingNaN) == false) goto L8;
        if (Float.isNaN(other) == false) goto L8;
        return true;
    L8:
        if ($this$equalsIncludingNaN == other) goto L12;
        return false;
    L12:
        return true;
    }
}
