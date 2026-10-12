package androidx.compose.foundation;

import android.content.Context;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.unit.Density;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: AndroidOverscroll.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\b\u0002\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\b\u0010\f\u001a\u00020\rH\u0016J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0096\u0002J\b\u0010\u0012\u001a\u00020\u0013H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0006\u001a\u00020\u0007X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\n\u0002\u0010\u000bR\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0014"}, d2 = {"Landroidx/compose/foundation/AndroidEdgeEffectOverscrollFactory;", "Landroidx/compose/foundation/OverscrollFactory;", "context", "Landroid/content/Context;", "density", "Landroidx/compose/ui/unit/Density;", "glowColor", "Landroidx/compose/ui/graphics/Color;", "glowDrawPadding", "Landroidx/compose/foundation/layout/PaddingValues;", "(Landroid/content/Context;Landroidx/compose/ui/unit/Density;JLandroidx/compose/foundation/layout/PaddingValues;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "J", "createOverscrollEffect", "Landroidx/compose/foundation/OverscrollEffect;", "equals", "", "other", "", "hashCode", "", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
final class AndroidEdgeEffectOverscrollFactory implements OverscrollFactory {
    private final Context context;
    private final Density density;
    private final long glowColor;
    private final PaddingValues glowDrawPadding;

    public /* synthetic */ AndroidEdgeEffectOverscrollFactory(Context r1, Density r2, long r3, PaddingValues r5, DefaultConstructorMarker r6) {
        this(r1, r2, r3, r5);
    }

    private AndroidEdgeEffectOverscrollFactory(Context context, Density density, long glowColor, PaddingValues glowDrawPadding) {
        this.context = context;
        this.density = density;
        this.glowColor = glowColor;
        this.glowDrawPadding = glowDrawPadding;
    }

    public /* synthetic */ AndroidEdgeEffectOverscrollFactory(Context r8, Density r9, long r10, PaddingValues r12, int r13, DefaultConstructorMarker r14) {
        if ((r13 & 4) == 0) goto L5;
        long r3 = AndroidOverscroll_androidKt.access$getDefaultGlowColor$p();
    L7:
        if ((r13 & 8) == 0) goto L9;
        PaddingValues r5 = AndroidOverscroll_androidKt.access$getDefaultGlowPaddingValues$p();
    L10:
        this(r8, r9, r3, r5, null);
        return;
    L9:
        r5 = r12;
        goto L10
    L5:
        r3 = r10;
        goto L7
    }

    @Override // androidx.compose.foundation.OverscrollFactory
    public OverscrollEffect createOverscrollEffect() {
        return new AndroidEdgeEffectOverscrollEffect(this.context, this.density, this.glowColor, this.glowDrawPadding, null);
    }

    @Override // androidx.compose.foundation.OverscrollFactory
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
        Intrinsics.checkNotNull(other, "null cannot be cast to non-null type androidx.compose.foundation.AndroidEdgeEffectOverscrollFactory");
        AndroidEdgeEffectOverscrollFactory r3 = (AndroidEdgeEffectOverscrollFactory) other;
        if (Intrinsics.areEqual(this.context, ((AndroidEdgeEffectOverscrollFactory) other).context) == true) goto L16;
        return false;
    L16:
        if (Intrinsics.areEqual(this.density, ((AndroidEdgeEffectOverscrollFactory) other).density) == true) goto L19;
        return false;
    L19:
        if (Color.m4367equalsimpl0(this.glowColor, ((AndroidEdgeEffectOverscrollFactory) other).glowColor) == true) goto L22;
        return false;
    L22:
        if (Intrinsics.areEqual(this.glowDrawPadding, ((AndroidEdgeEffectOverscrollFactory) other).glowDrawPadding) == true) goto L24;
        return false;
    L24:
        return true;
    L8:
        r2 = null;
        goto L10
    }

    @Override // androidx.compose.foundation.OverscrollFactory
    public int hashCode() {
        int result = this.context.hashCode();
        int result2 = (result * 31) + this.density.hashCode();
        return (((result2 * 31) + Color.m4373hashCodeimpl(this.glowColor)) * 31) + this.glowDrawPadding.hashCode();
    }
}
