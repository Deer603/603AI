package androidx.compose.foundation.lazy.layout;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.saveable.SaveableStateHolder;
import kotlin.Metadata;

/* JADX INFO: compiled from: LazyLayoutItemContentFactory.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000&\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\u001a>\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0007\u001a\u00020\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0005H\u0003ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\f\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\r"}, d2 = {"SkippableItem", "", "itemProvider", "Landroidx/compose/foundation/lazy/layout/LazyLayoutItemProvider;", "saveableStateHolder", "Landroidx/compose/foundation/lazy/layout/StableValue;", "Landroidx/compose/runtime/saveable/SaveableStateHolder;", "index", "", "key", "", "SkippableItem-JVlU9Rs", "(Landroidx/compose/foundation/lazy/layout/LazyLayoutItemProvider;Ljava/lang/Object;ILjava/lang/Object;Landroidx/compose/runtime/Composer;I)V", "foundation_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class LazyLayoutItemContentFactoryKt {
    /* JADX INFO: renamed from: access$SkippableItem-JVlU9Rs, reason: not valid java name */
    public static final /* synthetic */ void m897access$SkippableItemJVlU9Rs(LazyLayoutItemProvider itemProvider, Object saveableStateHolder, int index, Object key, Composer $composer, int $changed) {
        m896SkippableItemJVlU9Rs(itemProvider, saveableStateHolder, index, key, $composer, $changed);
    }

    /* JADX INFO: renamed from: SkippableItem-JVlU9Rs, reason: not valid java name */
    private static final void m896SkippableItemJVlU9Rs(final LazyLayoutItemProvider itemProvider, final Object saveableStateHolder, final int index, final Object key, Composer $composer, final int $changed) {
        Composer $composer2 = $composer.startRestartGroup(1439843069);
        ComposerKt.sourceInformation($composer2, "C(SkippableItem)P(1,3:c#foundation.lazy.layout.StableValue!,2:c#foundation.lazy.layout.StableValue)128@4850L51,128@4817L84:LazyLayoutItemContentFactory.kt#wow0x6");
        int $dirty = $changed;
        if (($changed & 6) != 0) goto L10;
        if ($composer2.changed(itemProvider) == false) goto L7;
        int r2 = 4;
    L8:
        $dirty = $dirty | r2;
        goto L10
    L7:
        r2 = 2;
    L10:
        if (($changed & 48) != 0) goto L17;
        if ($composer2.changed(saveableStateHolder) == false) goto L14;
        int r3 = 32;
    L15:
        $dirty = $dirty | r3;
        goto L17
    L14:
        r3 = 16;
    L17:
        if (($changed & 384) != 0) goto L24;
        if ($composer2.changed(index) == false) goto L21;
        int r4 = 256;
    L22:
        $dirty = $dirty | r4;
        goto L24
    L21:
        r4 = 128;
    L24:
        if (($changed & 3072) != 0) goto L31;
        if ($composer2.changed(key) == false) goto L28;
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
    L43:
        ScopeUpdateScope r0 = $composer2.endRestartGroup();
        if (r0 == null) goto L47;
        r0.updateScope(new LazyLayoutItemContentFactoryKt$SkippableItem$2(itemProvider, saveableStateHolder, index, key, $changed));
        return;
    L47:
        return;
    L37:
        if (ComposerKt.isTraceInProgress() == false) goto L39;
        ComposerKt.traceEventStart(1439843069, $dirty, -1, "androidx.compose.foundation.lazy.layout.SkippableItem (LazyLayoutItemContentFactory.kt:127)");
    L39:
        ((SaveableStateHolder) saveableStateHolder).SaveableStateProvider(key, ComposableLambdaKt.rememberComposableLambda(980966366, true, new LazyLayoutItemContentFactoryKt$SkippableItem$1(itemProvider, index, key), $composer2, 54), $composer2, 48);
        if (ComposerKt.isTraceInProgress() == false) goto L43;
        ComposerKt.traceEventEnd();
        goto L43
    L33:
        r6 = false;
        goto L35
    }
}
