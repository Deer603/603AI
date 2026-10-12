package androidx.compose.material;

import androidx.compose.foundation.ScrollState;
import androidx.compose.ui.unit.Density;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.ranges.RangesKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: TabRow.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J,\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\b2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\u0006\u0010\u0007\u001a\u00020\bJ*\u0010\u0012\u001a\u00020\b*\u00020\u00112\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\b2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u000e¢\u0006\u0004\n\u0002\u0010\t¨\u0006\u0013"}, d2 = {"Landroidx/compose/material/ScrollableTabData;", "", "scrollState", "Landroidx/compose/foundation/ScrollState;", "coroutineScope", "Lkotlinx/coroutines/CoroutineScope;", "(Landroidx/compose/foundation/ScrollState;Lkotlinx/coroutines/CoroutineScope;)V", "selectedTab", "", "Ljava/lang/Integer;", "onLaidOut", "", "density", "Landroidx/compose/ui/unit/Density;", "edgeOffset", "tabPositions", "", "Landroidx/compose/material/TabPosition;", "calculateTabOffset", "material_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
final class ScrollableTabData {
    private final CoroutineScope coroutineScope;
    private final ScrollState scrollState;
    private Integer selectedTab;

    public ScrollableTabData(ScrollState scrollState, CoroutineScope coroutineScope) {
        this.scrollState = scrollState;
        this.coroutineScope = coroutineScope;
    }

    public static final /* synthetic */ ScrollState access$getScrollState$p(ScrollableTabData $this) {
        return $this.scrollState;
    }

    public final void onLaidOut(Density density, int edgeOffset, List<TabPosition> r13, int selectedTab) {
        Integer r0 = this.selectedTab;
        if (r0 != null) goto L6;
    L7:
        this.selectedTab = Integer.valueOf(selectedTab);
        TabPosition it = (TabPosition) CollectionsKt.getOrNull(r13, selectedTab);
        if (it == null) goto L14;
        int calculatedOffset = calculateTabOffset(it, density, edgeOffset, r13);
        if (this.scrollState.getValue() == calculatedOffset) goto L16;
        BuildersKt.launch$default(this.coroutineScope, null, null, new ScrollableTabData$onLaidOut$1$1(this, calculatedOffset, null), 3, null);
        return;
    L16:
        return;
    L14:
        return;
    L6:
        if (r0.intValue() != selectedTab) goto L7;
    }

    private final int calculateTabOffset(TabPosition $this$calculateTabOffset, Density density, int edgeOffset, List<TabPosition> r14) {
        int totalTabRowWidth = density.mo370roundToPx0680j_4(((TabPosition) CollectionsKt.last(r14)).m1804getRightD9Ej5fM()) + edgeOffset;
        int visibleWidth = totalTabRowWidth - this.scrollState.getMaxValue();
        int tabOffset = density.mo370roundToPx0680j_4($this$calculateTabOffset.m1803getLeftD9Ej5fM());
        int scrollerCenter = visibleWidth / 2;
        int tabWidth = density.mo370roundToPx0680j_4($this$calculateTabOffset.m1805getWidthD9Ej5fM());
        int centeredTabOffset = tabOffset - (scrollerCenter - (tabWidth / 2));
        int availableSpace = RangesKt.coerceAtLeast(totalTabRowWidth - visibleWidth, 0);
        return RangesKt.coerceIn(centeredTabOffset, 0, availableSpace);
    }
}
