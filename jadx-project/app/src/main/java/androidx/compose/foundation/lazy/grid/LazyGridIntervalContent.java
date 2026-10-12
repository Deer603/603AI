package androidx.compose.foundation.lazy.grid;

import androidx.autofill.HintConstants;
import androidx.collection.IntList;
import androidx.collection.IntListKt;
import androidx.collection.MutableIntList;
import androidx.compose.foundation.lazy.layout.IntervalList;
import androidx.compose.foundation.lazy.layout.LazyLayoutIntervalContent;
import androidx.compose.foundation.lazy.layout.MutableIntervalList;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: LazyGridIntervalContent.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000 22\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002:\u00012B\u001e\u0012\u0017\u0010\u0004\u001a\u0013\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\b\u0007¢\u0006\u0002\u0010\bJZ\u0010\u001d\u001a\u00020\u00062\b\u0010\u001e\u001a\u0004\u0018\u00010\u001f2\u0019\u0010 \u001a\u0015\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020\"\u0018\u00010\u0005¢\u0006\u0002\b\u00072\b\u0010#\u001a\u0004\u0018\u00010\u001f2\u001c\u0010\u0004\u001a\u0018\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\b%¢\u0006\u0002\b\u0007H\u0016¢\u0006\u0002\u0010&J³\u0001\u0010'\u001a\u00020\u00062\u0006\u0010(\u001a\u00020)2#\u0010\u001e\u001a\u001f\u0012\u0013\u0012\u00110)¢\u0006\f\b*\u0012\b\b+\u0012\u0004\b\b(,\u0012\u0004\u0012\u00020\u001f\u0018\u00010\u00052\u001f\u0010 \u001a\u001b\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020)\u0012\u0004\u0012\u00020\"\u0018\u00010-¢\u0006\u0002\b\u00072#\u0010#\u001a\u001f\u0012\u0013\u0012\u00110)¢\u0006\f\b*\u0012\b\b+\u0012\u0004\b\b(,\u0012\u0006\u0012\u0004\u0018\u00010\u001f0\u000521\u0010.\u001a-\u0012\u0004\u0012\u00020$\u0012\u0013\u0012\u00110)¢\u0006\f\b*\u0012\b\b+\u0012\u0004\b\b(,\u0012\u0004\u0012\u00020\u00060-¢\u0006\u0002\b%¢\u0006\u0002\b\u0007H\u0016¢\u0006\u0002\u0010/JE\u00100\u001a\u00020\u00062\b\u0010\u001e\u001a\u0004\u0018\u00010\u001f2\b\u0010#\u001a\u0004\u0018\u00010\u001f2\"\u0010\u0004\u001a\u001e\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020)\u0012\u0004\u0012\u00020\u00060-¢\u0006\u0002\b%¢\u0006\u0002\b\u0007H\u0016¢\u0006\u0002\u00101R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u000b\u001a\u00020\fX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0011\u001a\u00020\u00128F¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00030\u0016X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0019\u001a\u00020\u001aX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001c¨\u00063"}, d2 = {"Landroidx/compose/foundation/lazy/grid/LazyGridIntervalContent;", "Landroidx/compose/foundation/lazy/grid/LazyGridScope;", "Landroidx/compose/foundation/lazy/layout/LazyLayoutIntervalContent;", "Landroidx/compose/foundation/lazy/grid/LazyGridInterval;", "content", "Lkotlin/Function1;", "", "Lkotlin/ExtensionFunctionType;", "(Lkotlin/jvm/functions/Function1;)V", "_headerIndexes", "Landroidx/collection/MutableIntList;", "hasCustomSpans", "", "getHasCustomSpans$foundation_release", "()Z", "setHasCustomSpans$foundation_release", "(Z)V", "headerIndexes", "Landroidx/collection/IntList;", "getHeaderIndexes", "()Landroidx/collection/IntList;", "intervals", "Landroidx/compose/foundation/lazy/layout/MutableIntervalList;", "getIntervals", "()Landroidx/compose/foundation/lazy/layout/MutableIntervalList;", "spanLayoutProvider", "Landroidx/compose/foundation/lazy/grid/LazyGridSpanLayoutProvider;", "getSpanLayoutProvider$foundation_release", "()Landroidx/compose/foundation/lazy/grid/LazyGridSpanLayoutProvider;", "item", "key", "", "span", "Landroidx/compose/foundation/lazy/grid/LazyGridItemSpanScope;", "Landroidx/compose/foundation/lazy/grid/GridItemSpan;", "contentType", "Landroidx/compose/foundation/lazy/grid/LazyGridItemScope;", "Landroidx/compose/runtime/Composable;", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Ljava/lang/Object;Lkotlin/jvm/functions/Function3;)V", "items", "count", "", "Lkotlin/ParameterName;", HintConstants.AUTOFILL_HINT_NAME, "index", "Lkotlin/Function2;", "itemContent", "(ILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function4;)V", "stickyHeader", "(Ljava/lang/Object;Ljava/lang/Object;Lkotlin/jvm/functions/Function4;)V", "Companion", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class LazyGridIntervalContent extends LazyLayoutIntervalContent<LazyGridInterval> implements LazyGridScope {
    public static final int $stable = 0;
    private static final Companion Companion = null;
    private static final Function2<LazyGridItemSpanScope, Integer, GridItemSpan> DefaultSpan = null;
    private MutableIntList _headerIndexes;
    private boolean hasCustomSpans;
    private final MutableIntervalList<LazyGridInterval> intervals;
    private final LazyGridSpanLayoutProvider spanLayoutProvider;

    /* JADX INFO: compiled from: LazyGridIntervalContent.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R(\u0010\u0003\u001a\u0019\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0004¢\u0006\u0002\b\b¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Landroidx/compose/foundation/lazy/grid/LazyGridIntervalContent$Companion;", "", "()V", "DefaultSpan", "Lkotlin/Function2;", "Landroidx/compose/foundation/lazy/grid/LazyGridItemSpanScope;", "", "Landroidx/compose/foundation/lazy/grid/GridItemSpan;", "Lkotlin/ExtensionFunctionType;", "getDefaultSpan", "()Lkotlin/jvm/functions/Function2;", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker r1) {
            this();
        }

        private Companion() {
        }

        public final Function2<LazyGridItemSpanScope, Integer, GridItemSpan> getDefaultSpan() {
            return LazyGridIntervalContent.access$getDefaultSpan$cp();
        }
    }

    public static final /* synthetic */ Function2 access$getDefaultSpan$cp() {
        return DefaultSpan;
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutIntervalContent
    public /* bridge */ /* synthetic */ IntervalList getIntervals() {
        return getIntervals();
    }

    public LazyGridIntervalContent(Function1<? super LazyGridScope, Unit> r2) {
        this.spanLayoutProvider = new LazyGridSpanLayoutProvider(this);
        this.intervals = new MutableIntervalList();
        r2.invoke(this);
    }

    public final LazyGridSpanLayoutProvider getSpanLayoutProvider$foundation_release() {
        return this.spanLayoutProvider;
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutIntervalContent
    public MutableIntervalList<LazyGridInterval> getIntervals() {
        return this.intervals;
    }

    public final boolean getHasCustomSpans$foundation_release() {
        return this.hasCustomSpans;
    }

    public final void setHasCustomSpans$foundation_release(boolean r1) {
        this.hasCustomSpans = r1;
    }

    public final IntList getHeaderIndexes() {
        MutableIntList r0 = this._headerIndexes;
        if (r0 == null) goto L6;
        return r0;
    L6:
        return IntListKt.emptyIntList();
    }

    @Override // androidx.compose.foundation.lazy.grid.LazyGridScope
    public void item(final Object key, final Function1<? super LazyGridItemSpanScope, GridItemSpan> r9, final Object contentType, final Function3<? super LazyGridItemScope, ? super Composer, ? super Integer, Unit> r11) {
        MutableIntervalList<LazyGridInterval> r0 = getIntervals();
        if (key == null) goto L5;
        Function1<Integer, Object> r3 = new LazyGridIntervalContent$item$1$1(key);
    L6:
        if (r9 == null) goto L8;
        Function2<LazyGridItemSpanScope, Integer, GridItemSpan> r4 = new LazyGridIntervalContent$item$2$1(r9);
    L9:
        r0.addInterval(1, new LazyGridInterval(r3, r4, new AnonymousClass3(contentType), ComposableLambdaKt.composableLambdaInstance(-34608120, true, new AnonymousClass4(r11))));
        if (r9 == null) goto L13;
        this.hasCustomSpans = true;
        return;
    L13:
        return;
    L8:
        r4 = DefaultSpan;
        goto L9
    L5:
        r3 = null;
        goto L6
    }

    @Override // androidx.compose.foundation.lazy.grid.LazyGridScope
    public void items(int count, Function1<? super Integer, ? extends Object> r5, Function2<? super LazyGridItemSpanScope, ? super Integer, GridItemSpan> r6, Function1<? super Integer, ? extends Object> r7, Function4<? super LazyGridItemScope, ? super Integer, ? super Composer, ? super Integer, Unit> r8) {
        MutableIntervalList<LazyGridInterval> r0 = getIntervals();
        if (r6 != null) goto L5;
        Function2<? super LazyGridItemSpanScope, ? super Integer, GridItemSpan> r2 = DefaultSpan;
    L6:
        r0.addInterval(count, new LazyGridInterval(r5, r2, r7, r8));
        if (r6 == null) goto L10;
        this.hasCustomSpans = true;
        return;
    L10:
        return;
    L5:
        r2 = r6;
        goto L6
    }

    @Override // androidx.compose.foundation.lazy.grid.LazyGridScope
    public void stickyHeader(Object key, Object contentType, final Function4<? super LazyGridItemScope, ? super Integer, ? super Composer, ? super Integer, Unit> r9) {
        MutableIntList it = this._headerIndexes;
        if (it != null) goto L5;
        it = new MutableIntList(0, 1, null);
        this._headerIndexes = it;
    L5:
        final int headerIndex = getIntervals().getSize();
        it.add(headerIndex);
        item(key, AnonymousClass1.INSTANCE, contentType, ComposableLambdaKt.composableLambdaInstance(2045010142, true, new AnonymousClass2(r9, headerIndex)));
    }

    static {
        Companion = new Companion(null);
        $stable = 8;
        DefaultSpan = LazyGridIntervalContent$Companion$DefaultSpan$1.INSTANCE;
    }
}
