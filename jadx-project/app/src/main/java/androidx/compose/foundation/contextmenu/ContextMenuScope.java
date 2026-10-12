package androidx.compose.foundation.contextmenu;

import androidx.autofill.HintConstants;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;

/* JADX INFO: compiled from: ContextMenuUi.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0007\b\u0000¢\u0006\u0002\u0010\u0002J\u0017\u0010\f\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0006H\u0001¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u000f\u001a\u00020\nH\u0000¢\u0006\u0002\b\u0010Jl\u0010\u0011\u001a\u00020\n2\u0011\u0010\u0012\u001a\r\u0012\u0004\u0012\u00020\u00140\u0013¢\u0006\u0002\b\u000b2\b\b\u0002\u0010\u0015\u001a\u00020\u00162\b\b\u0002\u0010\u0017\u001a\u00020\u00182*\b\u0002\u0010\u0019\u001a$\u0012\u0013\u0012\u00110\u001a¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\u001b\u0012\u0004\u0012\u00020\n\u0018\u00010\u0005¢\u0006\u0002\b\u000b2\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\n0\u0013¢\u0006\u0002\u0010\u001dR4\u0010\u0003\u001a(\u0012$\u0012\"\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0004\u0012\u00020\n0\u0005¢\u0006\u0002\b\u000b0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001e"}, d2 = {"Landroidx/compose/foundation/contextmenu/ContextMenuScope;", "", "()V", "composables", "Landroidx/compose/runtime/snapshots/SnapshotStateList;", "Lkotlin/Function1;", "Landroidx/compose/foundation/contextmenu/ContextMenuColors;", "Lkotlin/ParameterName;", HintConstants.AUTOFILL_HINT_NAME, "colors", "", "Landroidx/compose/runtime/Composable;", "Content", "Content$foundation_release", "(Landroidx/compose/foundation/contextmenu/ContextMenuColors;Landroidx/compose/runtime/Composer;I)V", "clear", "clear$foundation_release", "item", "label", "Lkotlin/Function0;", "", "modifier", "Landroidx/compose/ui/Modifier;", "enabled", "", "leadingIcon", "Landroidx/compose/ui/graphics/Color;", "iconColor", "onClick", "(Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/Modifier;ZLkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function0;)V", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class ContextMenuScope {
    public static final int $stable = 0;
    private final SnapshotStateList<Function3<ContextMenuColors, Composer, Integer, Unit>> composables;

    static {
    }

    public ContextMenuScope() {
        this.composables = SnapshotStateKt.mutableStateListOf();
    }

    public final void Content$foundation_release(final ContextMenuColors colors, Composer $composer, final int $changed) {
        Composer $composer2 = $composer.startRestartGroup(1320309496);
        ComposerKt.sourceInformation($composer2, "C(Content)*241@8836L18:ContextMenuUi.android.kt#3xeu6s");
        int $dirty = $changed;
        if (($changed & 6) != 0) goto L10;
        if ($composer2.changed(colors) == false) goto L7;
        int r2 = 4;
    L8:
        $dirty = $dirty | r2;
        goto L10
    L7:
        r2 = 2;
    L10:
        if (($changed & 48) != 0) goto L17;
        if ($composer2.changed(this) == false) goto L14;
        int r3 = 32;
    L15:
        $dirty = $dirty | r3;
        goto L17
    L14:
        r3 = 16;
    L17:
        if (($dirty & 19) == 18) goto L19;
        boolean r4 = true;
    L21:
        if ($composer2.shouldExecute(r4, $dirty & 1) == true) goto L23;
        $composer2.skipToGroupEnd();
    L32:
        ScopeUpdateScope r0 = $composer2.endRestartGroup();
        if (r0 == null) goto L37;
        r0.updateScope(new ContextMenuScope$Content$2(this, colors, $changed));
        return;
    L37:
        return;
    L23:
        if (ComposerKt.isTraceInProgress() == false) goto L25;
        ComposerKt.traceEventStart(1320309496, $dirty, -1, "androidx.compose.foundation.contextmenu.ContextMenuScope.Content (ContextMenuUi.android.kt:240)");
    L25:
        List $this$fastForEach$iv = this.composables;
        int index$iv = 0;
        int r5 = $this$fastForEach$iv.size();
    L26:
        if (index$iv >= r5) goto L29;
        Object item$iv = $this$fastForEach$iv.get(index$iv);
        ((Function3) item$iv).invoke(colors, $composer2, Integer.valueOf($dirty & 14));
        index$iv = index$iv + 1;
        goto L26
    L29:
        if (ComposerKt.isTraceInProgress() == false) goto L32;
        ComposerKt.traceEventEnd();
        goto L32
    L19:
        r4 = false;
        goto L21
    }

    public final void clear$foundation_release() {
        this.composables.clear();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void item$default(ContextMenuScope r6, Function2 r7, Modifier r8, boolean r9, Function3 r10, Function0 r11, int r12, Object r13) {
        if ((r12 & 2) == 0) goto L5;
        Modifier r2 = Modifier.Companion;
    L7:
        if ((r12 & 4) == 0) goto L9;
        boolean r3 = true;
    L11:
        if ((r12 & 8) == 0) goto L13;
        Function3 r4 = null;
    L14:
        r6.item(r7, r2, r3, r4, r11);
        return;
    L13:
        r4 = r10;
        goto L14
    L9:
        r3 = r9;
        goto L11
    L5:
        r2 = r8;
        goto L7
    }

    public final void item(final Function2<? super Composer, ? super Integer, String> r8, final Modifier modifier, final boolean enabled, final Function3<? super Color, ? super Composer, ? super Integer, Unit> r11, final Function0<Unit> r12) {
        this.composables.add(ComposableLambdaKt.composableLambdaInstance(262103052, true, new AnonymousClass1(r8, enabled, modifier, r11, r12)));
    }
}
