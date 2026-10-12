package androidx.compose.material3.carousel;

import androidx.compose.ui.util.MathHelpersKt;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: KeylineList.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000<\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\b\u0010\u0000\u001a\u00020\u0001H\u0000\u001aC\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00072\u0017\u0010\b\u001a\u0013\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t¢\u0006\u0002\b\fH\u0000ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000e\u001aA\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00042\u0017\u0010\b\u001a\u0013\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t¢\u0006\u0002\b\fH\u0000\u001a \u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0004H\u0000\u001a \u0010\u0012\u001a\u00020\u00012\u0006\u0010\u0017\u001a\u00020\u00012\u0006\u0010\u0018\u001a\u00020\u00012\u0006\u0010\u0016\u001a\u00020\u0004H\u0000\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0019"}, d2 = {"emptyKeylineList", "Landroidx/compose/material3/carousel/KeylineList;", "keylineListOf", "carouselMainAxisSize", "", "itemSpacing", "carouselAlignment", "Landroidx/compose/material3/carousel/CarouselAlignment;", "keylines", "Lkotlin/Function1;", "Landroidx/compose/material3/carousel/KeylineListScope;", "", "Lkotlin/ExtensionFunctionType;", "keylineListOf-WNYm7Xg", "(FFILkotlin/jvm/functions/Function1;)Landroidx/compose/material3/carousel/KeylineList;", "pivotIndex", "", "pivotOffset", "lerp", "Landroidx/compose/material3/carousel/Keyline;", "start", "end", "fraction", "from", "to", "material3_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class KeylineListKt {
    public static final KeylineList emptyKeylineList() {
        return KeylineList.Companion.getEmpty();
    }

    /* JADX INFO: renamed from: keylineListOf-WNYm7Xg, reason: not valid java name */
    public static final KeylineList m3014keylineListOfWNYm7Xg(float carouselMainAxisSize, float itemSpacing, int carouselAlignment, Function1<? super KeylineListScope, Unit> r5) {
        KeylineListScopeImpl keylineListScope = new KeylineListScopeImpl();
        r5.invoke(keylineListScope);
        return keylineListScope.m3015createWithAlignmentwaks0t8(carouselMainAxisSize, itemSpacing, carouselAlignment);
    }

    public static final KeylineList keylineListOf(float carouselMainAxisSize, float itemSpacing, int pivotIndex, float pivotOffset, Function1<? super KeylineListScope, Unit> r6) {
        KeylineListScopeImpl keylineListScope = new KeylineListScopeImpl();
        r6.invoke(keylineListScope);
        return keylineListScope.createWithPivot(carouselMainAxisSize, itemSpacing, pivotIndex, pivotOffset);
    }

    public static final Keyline lerp(Keyline start, Keyline end, float fraction) {
        float r1 = MathHelpersKt.lerp(start.getSize(), end.getSize(), fraction);
        float r2 = MathHelpersKt.lerp(start.getOffset(), end.getOffset(), fraction);
        float r3 = MathHelpersKt.lerp(start.getUnadjustedOffset(), end.getUnadjustedOffset(), fraction);
        if (fraction >= 0.5f) goto L5;
        boolean r5 = start.isFocal();
    L7:
        if (fraction >= 0.5f) goto L9;
        boolean r6 = start.isAnchor();
    L11:
        if (fraction >= 0.5f) goto L13;
        boolean r4 = start.isPivot();
    L14:
        boolean r9 = r6;
        boolean r7 = r4;
        boolean r8 = r5;
        return new Keyline(r1, r2, r3, r8, r9, r7, MathHelpersKt.lerp(start.getCutoff(), end.getCutoff(), fraction));
    L13:
        r4 = end.isPivot();
        goto L14
    L9:
        r6 = end.isAnchor();
        goto L11
    L5:
        r5 = end.isFocal();
        goto L7
    }

    public static final KeylineList lerp(KeylineList from, KeylineList to, float fraction) {
        KeylineList $this$fastMapIndexed$iv = from;
        int $i$f$fastMapIndexed = 0;
        List target$iv = new ArrayList($this$fastMapIndexed$iv.size());
        int index$iv$iv = 0;
        int r6 = $this$fastMapIndexed$iv.size();
    L3:
        if (index$iv$iv >= r6) goto L5;
        Object item$iv$iv = $this$fastMapIndexed$iv.get(index$iv$iv);
        int index$iv = index$iv$iv;
        Keyline k = (Keyline) item$iv$iv;
        List $this$fastMapIndexed$iv2 = $this$fastMapIndexed$iv;
        target$iv.add(lerp(k, to.get(index$iv), fraction));
        index$iv$iv = index$iv$iv + 1;
        $this$fastMapIndexed$iv = $this$fastMapIndexed$iv2;
        $i$f$fastMapIndexed = $i$f$fastMapIndexed;
        goto L3
    L5:
        List interpolatedKeylines = target$iv;
        return new KeylineList(interpolatedKeylines);
    }
}
