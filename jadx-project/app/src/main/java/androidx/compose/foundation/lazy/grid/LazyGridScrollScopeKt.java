package androidx.compose.foundation.lazy.grid;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.gestures.ScrollScope;
import androidx.compose.foundation.lazy.layout.LazyLayoutScrollScope;
import androidx.compose.ui.unit.IntOffset;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;

/* JADX INFO: compiled from: LazyGridScrollScope.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0016\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005¨\u0006\u0006"}, d2 = {"LazyLayoutScrollScope", "Landroidx/compose/foundation/lazy/layout/LazyLayoutScrollScope;", "state", "Landroidx/compose/foundation/lazy/grid/LazyGridState;", "scrollScope", "Landroidx/compose/foundation/gestures/ScrollScope;", "foundation_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class LazyGridScrollScopeKt {

    /* JADX INFO: renamed from: androidx.compose.foundation.lazy.grid.LazyGridScrollScopeKt$LazyLayoutScrollScope$1, reason: invalid class name */
    /* JADX INFO: compiled from: LazyGridScrollScope.kt */
    @Metadata(d1 = {"\u0000'\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u00012\u00020\u0002J\u0018\u0010\r\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u0004H\u0016J\u0011\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0011H\u0096\u0001J\u0018\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u0004H\u0016R\u0014\u0010\u0003\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\u0006¨\u0006\u0017"}, d2 = {"androidx/compose/foundation/lazy/grid/LazyGridScrollScopeKt$LazyLayoutScrollScope$1", "Landroidx/compose/foundation/lazy/layout/LazyLayoutScrollScope;", "Landroidx/compose/foundation/gestures/ScrollScope;", "firstVisibleItemIndex", "", "getFirstVisibleItemIndex", "()I", "firstVisibleItemScrollOffset", "getFirstVisibleItemScrollOffset", "itemCount", "getItemCount", "lastVisibleItemIndex", "getLastVisibleItemIndex", "calculateDistanceTo", "targetIndex", "targetOffset", "scrollBy", "", "pixels", "snapToItem", "", "index", "offset", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class AnonymousClass1 implements LazyLayoutScrollScope, ScrollScope {
        private final /* synthetic */ ScrollScope $$delegate_0;
        final /* synthetic */ LazyGridState $state;

        @Override // androidx.compose.foundation.gestures.ScrollScope
        public float scrollBy(float r2) {
            return this.$$delegate_0.scrollBy(r2);
        }

        AnonymousClass1(ScrollScope $scrollScope, LazyGridState $state) {
            this.$state = $state;
            this.$$delegate_0 = $scrollScope;
        }

        @Override // androidx.compose.foundation.lazy.layout.LazyLayoutScrollScope
        public int getFirstVisibleItemIndex() {
            return this.$state.getFirstVisibleItemIndex();
        }

        @Override // androidx.compose.foundation.lazy.layout.LazyLayoutScrollScope
        public int getFirstVisibleItemScrollOffset() {
            return this.$state.getFirstVisibleItemScrollOffset();
        }

        @Override // androidx.compose.foundation.lazy.layout.LazyLayoutScrollScope
        public int getLastVisibleItemIndex() {
            LazyGridItemInfo r0 = (LazyGridItemInfo) CollectionsKt.lastOrNull(this.$state.getLayoutInfo().getVisibleItemsInfo());
            if (r0 != null) goto L7;
            return 0;
        L7:
            return r0.getIndex();
        }

        @Override // androidx.compose.foundation.lazy.layout.LazyLayoutScrollScope
        public int getItemCount() {
            return this.$state.getLayoutInfo().getTotalItemsCount();
        }

        @Override // androidx.compose.foundation.lazy.layout.LazyLayoutScrollScope
        public void snapToItem(int index, int offset) {
            this.$state.snapToItemIndexInternal$foundation_release(index, offset, true);
        }

        @Override // androidx.compose.foundation.lazy.layout.LazyLayoutScrollScope
        public int calculateDistanceTo(int targetIndex, int targetOffset) {
            LazyGridLayoutInfo layoutInfo = this.$state.getLayoutInfo();
            boolean before = false;
            if (layoutInfo.getVisibleItemsInfo().isEmpty() == false) goto L5;
            return 0;
        L5:
            int r3 = getFirstVisibleItemIndex();
            int r6 = 1;
            if (targetIndex > getLastVisibleItemIndex()) goto L9;
            if (r3 > targetIndex) goto L9;
            boolean r4 = true;
        L10:
            if (r4 == true) goto L18;
            int slotsPerLine = this.$state.getSlotsPerLine$foundation_release();
            int averageLineMainAxisSize = LazyGridLayoutInfoKt.visibleLinesAverageMainAxisSize(layoutInfo);
            if (targetIndex >= getFirstVisibleItemIndex()) goto L14;
            before = true;
        L14:
            int r7 = targetIndex - getFirstVisibleItemIndex();
            int r8 = slotsPerLine - 1;
            if (before == false) goto L17;
            r6 = -1;
        L17:
            int linesDiff = (r7 + (r8 * r6)) / slotsPerLine;
            int r5 = (averageLineMainAxisSize * linesDiff) - getFirstVisibleItemScrollOffset();
        L39:
            return r5 + targetOffset;
        L18:
            List<LazyGridItemInfo> r9 = layoutInfo.getVisibleItemsInfo();
            int index$iv$iv = 0;
            int r10 = r9.size();
        L19:
            Integer r11 = null;
            if (index$iv$iv >= r10) goto L28;
            Object item$iv$iv = r9.get(index$iv$iv);
            Object it$iv = item$iv$iv;
            LazyGridItemInfo it = (LazyGridItemInfo) it$iv;
            if (it.getIndex() != targetIndex) goto L24;
            boolean r12 = true;
        L25:
            if (r12 == true) goto L29;
            index$iv$iv = index$iv$iv + 1;
        L29:
            LazyGridItemInfo visibleItem = (LazyGridItemInfo) it$iv;
            if (layoutInfo.getOrientation() != Orientation.Vertical) goto L33;
            if (visibleItem == null) goto L35;
            r11 = Integer.valueOf(IntOffset.m7102getYimpl(visibleItem.mo864getOffsetnOccac()));
        L35:
            if (r11 == null) goto L37;
            r5 = r11.intValue();
            goto L39
        L37:
            r5 = 0;
            goto L39
        L33:
            if (visibleItem == null) goto L35;
            r11 = Integer.valueOf(IntOffset.m7101getXimpl(visibleItem.mo864getOffsetnOccac()));
            goto L35
        L24:
            r12 = false;
            goto L25
        L28:
            it$iv = null;
        L9:
            r4 = false;
            goto L10
        }
    }

    public static final LazyLayoutScrollScope LazyLayoutScrollScope(LazyGridState state, ScrollScope scrollScope) {
        return new AnonymousClass1(scrollScope, state);
    }
}
