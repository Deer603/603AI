package androidx.compose.foundation.layout;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.SubcomposeLayoutKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;

/* JADX INFO: compiled from: BoxWithConstraints.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001aN\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072!\u0010\b\u001a\u001d\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00010\t¢\u0006\u0002\b\u000b¢\u0006\u0002\b\f¢\u0006\u0002\b\rH\u0007¢\u0006\u0002\u0010\u000e¨\u0006\u000f"}, d2 = {"BoxWithConstraints", "", "modifier", "Landroidx/compose/ui/Modifier;", "contentAlignment", "Landroidx/compose/ui/Alignment;", "propagateMinConstraints", "", "content", "Lkotlin/Function1;", "Landroidx/compose/foundation/layout/BoxWithConstraintsScope;", "Landroidx/compose/runtime/Composable;", "Landroidx/compose/ui/UiComposable;", "Lkotlin/ExtensionFunctionType;", "(Landroidx/compose/ui/Modifier;Landroidx/compose/ui/Alignment;ZLkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "foundation-layout_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class BoxWithConstraintsKt {
    public static final void BoxWithConstraints(Modifier modifier, Alignment contentAlignment, boolean propagateMinConstraints, final Function3<? super BoxWithConstraintsScope, ? super Composer, ? super Integer, Unit> r19, Composer $composer, final int $changed, final int r22) {
        Composer $composer2 = $composer.startRestartGroup(1781813501);
        ComposerKt.sourceInformation($composer2, "C(BoxWithConstraints)P(2,1,3)63@3274L218,63@3247L245:BoxWithConstraints.kt#2w3rfo");
        int $dirty = $changed;
        int r2 = r22 & 1;
        if (r2 == 0) goto L6;
        $dirty = $dirty | 6;
        Modifier r3 = modifier;
    L13:
        int r6 = r22 & 2;
        if (r6 == 0) goto L17;
        $dirty = $dirty | 48;
        Alignment r8 = contentAlignment;
    L24:
        int r9 = r22 & 4;
        if (r9 == 0) goto L28;
        $dirty = $dirty | 384;
        boolean propagateMinConstraints2 = propagateMinConstraints;
    L36:
        if ((r22 & 8) == 0) goto L39;
        $dirty = $dirty | 3072;
    L45:
        int $dirty2 = $dirty;
        boolean r15 = true;
        if (($dirty2 & 1171) == 1170) goto L48;
        boolean r1 = true;
    L50:
        if ($composer2.shouldExecute(r1, $dirty2 & 1) == false) goto L77;
        if (r2 == 0) goto L53;
        final Modifier.Companion modifier2 = Modifier.Companion;
    L54:
        if (r6 == 0) goto L56;
        final Alignment contentAlignment2 = Alignment.Companion.getTopStart();
    L57:
        if (r9 == 0) goto L60;
        propagateMinConstraints2 = false;
    L60:
        if (ComposerKt.isTraceInProgress() == false) goto L62;
        ComposerKt.traceEventStart(1781813501, $dirty2, -1, "androidx.compose.foundation.layout.BoxWithConstraints (BoxWithConstraints.kt:61)");
    L62:
        final MeasurePolicy measurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(contentAlignment2, propagateMinConstraints2);
        ComposerKt.sourceInformationMarkerStart($composer2, 2066126665, "CC(remember):BoxWithConstraints.kt#9igjgp");
        if (($dirty2 & 7168) == 2048) goto L66;
        r15 = false;
    L66:
        boolean invalid$iv = $composer2.changed(measurePolicy) | r15;
        Object it$iv = $composer2.rememberedValue();
        if (invalid$iv == false) goto L69;
    L72:
        Object value$iv = (Function2) new BoxWithConstraintsKt$BoxWithConstraints$1$1(measurePolicy, r19);
        $composer2.updateRememberedValue(value$iv);
        it$iv = value$iv;
    L73:
        ComposerKt.sourceInformationMarkerEnd($composer2);
        SubcomposeLayoutKt.SubcomposeLayout(modifier2, (Function2) it$iv, $composer2, $dirty2 & 14, 0);
        if (ComposerKt.isTraceInProgress() == false) goto L76;
        ComposerKt.traceEventEnd();
    L76:
        final boolean propagateMinConstraints3 = propagateMinConstraints2;
    L78:
        ScopeUpdateScope r10 = $composer2.endRestartGroup();
        if (r10 == null) goto L82;
        r10.updateScope(new AnonymousClass2(modifier2, contentAlignment2, propagateMinConstraints3, r19, $changed, r22));
        return;
    L82:
        return;
    L69:
        if (it$iv != Composer.Companion.getEmpty()) goto L73;
    L56:
        contentAlignment2 = r8;
        goto L57
    L53:
        modifier2 = r3;
        goto L54
    L77:
        $composer2.skipToGroupEnd();
        modifier2 = r3;
        contentAlignment2 = r8;
        propagateMinConstraints3 = propagateMinConstraints2;
        goto L78
    L48:
        r1 = false;
        goto L50
    L39:
        if (($changed & 3072) != 0) goto L45;
        if ($composer2.changedInstance(r19) == false) goto L43;
        int r11 = 2048;
    L44:
        $dirty = $dirty | r11;
        goto L45
    L43:
        r11 = 1024;
        goto L44
    L28:
        if (($changed & 384) != 0) goto L34;
        propagateMinConstraints2 = propagateMinConstraints;
        if ($composer2.changed(propagateMinConstraints2) == false) goto L32;
        int r12 = 256;
    L33:
        $dirty = $dirty | r12;
        goto L36
    L32:
        r12 = 128;
        goto L33
    L34:
        propagateMinConstraints2 = propagateMinConstraints;
        goto L36
    L17:
        if (($changed & 48) != 0) goto L23;
        r8 = contentAlignment;
        if ($composer2.changed(r8) == false) goto L21;
        int r13 = 32;
    L22:
        $dirty = $dirty | r13;
        goto L24
    L21:
        r13 = 16;
        goto L22
    L23:
        r8 = contentAlignment;
        goto L24
    L6:
        if (($changed & 6) != 0) goto L12;
        r3 = modifier;
        if ($composer2.changed(r3) == false) goto L10;
        int r7 = 4;
    L11:
        $dirty = $dirty | r7;
        goto L13
    L10:
        r7 = 2;
        goto L11
    L12:
        r3 = modifier;
        goto L13
    }
}
