package androidx.compose.foundation.lazy.layout;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.ui.layout.PinnableContainer;
import androidx.compose.ui.layout.PinnableContainerKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: LazyLayoutPinnableItem.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000&\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a:\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0011\u0010\b\u001a\r\u0012\u0004\u0012\u00020\u00010\t¢\u0006\u0002\b\nH\u0007¢\u0006\u0002\u0010\u000b¨\u0006\f"}, d2 = {"LazyLayoutPinnableItem", "", "key", "", "index", "", "pinnedItemList", "Landroidx/compose/foundation/lazy/layout/LazyLayoutPinnedItemList;", "content", "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "(Ljava/lang/Object;ILandroidx/compose/foundation/lazy/layout/LazyLayoutPinnedItemList;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "foundation_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class LazyLayoutPinnableItemKt {
    public static final void LazyLayoutPinnableItem(final Object key, final int index, final LazyLayoutPinnedItemList pinnedItemList, final Function2<? super Composer, ? super Integer, Unit> r13, Composer $composer, final int $changed) {
        Composer $composer2 = $composer.startRestartGroup(-2079116560);
        ComposerKt.sourceInformation($composer2, "C(LazyLayoutPinnableItem)P(2,1,3)51@2043L77,53@2218L7,54@2261L43,54@2230L74,55@2309L89:LazyLayoutPinnableItem.kt#wow0x6");
        int $dirty = $changed;
        if (($changed & 6) != 0) goto L10;
        if ($composer2.changedInstance(key) == false) goto L7;
        int r2 = 4;
    L8:
        $dirty = $dirty | r2;
        goto L10
    L7:
        r2 = 2;
    L10:
        if (($changed & 48) != 0) goto L17;
        if ($composer2.changed(index) == false) goto L14;
        int r3 = 32;
    L15:
        $dirty = $dirty | r3;
        goto L17
    L14:
        r3 = 16;
    L17:
        if (($changed & 384) != 0) goto L24;
        if ($composer2.changedInstance(pinnedItemList) == false) goto L21;
        int r4 = 256;
    L22:
        $dirty = $dirty | r4;
        goto L24
    L21:
        r4 = 128;
    L24:
        if (($changed & 3072) != 0) goto L31;
        if ($composer2.changedInstance(r13) == false) goto L28;
        int r5 = 2048;
    L29:
        $dirty = $dirty | r5;
        goto L31
    L28:
        r5 = 1024;
    L31:
        if (($dirty & 1171) == 1170) goto L33;
        boolean r6 = true;
    L35:
        if ($composer2.shouldExecute(r6, $dirty & 1) == true) goto L37;
        $composer2.skipToGroupEnd();
    L57:
        ScopeUpdateScope r0 = $composer2.endRestartGroup();
        if (r0 == null) goto L61;
        r0.updateScope(new AnonymousClass2(key, index, pinnedItemList, r13, $changed));
        return;
    L61:
        return;
    L37:
        if (ComposerKt.isTraceInProgress() == false) goto L39;
        ComposerKt.traceEventStart(-2079116560, $dirty, -1, "androidx.compose.foundation.lazy.layout.LazyLayoutPinnableItem (LazyLayoutPinnableItem.kt:50)");
    L39:
        ComposerKt.sourceInformationMarkerStart($composer2, -752870795, "CC(remember):LazyLayoutPinnableItem.kt#9igjgp");
        boolean invalid$iv = $composer2.changed(key) | $composer2.changed(pinnedItemList);
        Object it$iv = $composer2.rememberedValue();
        if (invalid$iv == false) goto L42;
    L45:
        Object value$iv = new LazyLayoutPinnableItem(key, pinnedItemList);
        $composer2.updateRememberedValue(value$iv);
        it$iv = value$iv;
    L46:
        final LazyLayoutPinnableItem pinnableItem = (LazyLayoutPinnableItem) it$iv;
        ComposerKt.sourceInformationMarkerEnd($composer2);
        pinnableItem.setIndex(index);
        ProvidableCompositionLocal<PinnableContainer> r7 = PinnableContainerKt.getLocalPinnableContainer();
        ComposerKt.sourceInformationMarkerStart($composer2, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
        Object r8 = $composer2.consume(r7);
        ComposerKt.sourceInformationMarkerEnd($composer2);
        pinnableItem.setParentPinnableContainer((PinnableContainer) r8);
        ComposerKt.sourceInformationMarkerStart($composer2, -752863853, "CC(remember):LazyLayoutPinnableItem.kt#9igjgp");
        boolean invalid$iv2 = $composer2.changed(pinnableItem);
        Object it$iv2 = $composer2.rememberedValue();
        if (invalid$iv2 == false) goto L49;
    L52:
        Object value$iv2 = (Function1) new LazyLayoutPinnableItemKt$LazyLayoutPinnableItem$1$1(pinnableItem);
        $composer2.updateRememberedValue(value$iv2);
        it$iv2 = value$iv2;
    L53:
        ComposerKt.sourceInformationMarkerEnd($composer2);
        EffectsKt.DisposableEffect(pinnableItem, (Function1) it$iv2, $composer2, 0);
        CompositionLocalKt.CompositionLocalProvider(PinnableContainerKt.getLocalPinnableContainer().provides(pinnableItem), r13, $composer2, ProvidedValue.$stable | (($dirty >> 6) & 112));
        if (ComposerKt.isTraceInProgress() == false) goto L57;
        ComposerKt.traceEventEnd();
        goto L57
    L49:
        if (it$iv2 != Composer.Companion.getEmpty()) goto L53;
    L42:
        if (it$iv != Composer.Companion.getEmpty()) goto L46;
    L33:
        r6 = false;
        goto L35
    }
}
