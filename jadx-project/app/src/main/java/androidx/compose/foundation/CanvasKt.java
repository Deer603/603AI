package androidx.compose.foundation;

import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.DrawModifierKt;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: Canvas.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000&\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u001a.\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0017\u0010\u0004\u001a\u0013\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00010\u0005¢\u0006\u0002\b\u0007H\u0007¢\u0006\u0002\u0010\b\u001a6\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\n2\u0017\u0010\u0004\u001a\u0013\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00010\u0005¢\u0006\u0002\b\u0007H\u0007¢\u0006\u0002\u0010\u000b¨\u0006\f"}, d2 = {"Canvas", "", "modifier", "Landroidx/compose/ui/Modifier;", "onDraw", "Lkotlin/Function1;", "Landroidx/compose/ui/graphics/drawscope/DrawScope;", "Lkotlin/ExtensionFunctionType;", "(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "contentDescription", "", "(Landroidx/compose/ui/Modifier;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "foundation_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class CanvasKt {
    public static final void Canvas(final Modifier modifier, final Function1<? super DrawScope, Unit> r6, Composer $composer, final int $changed) {
        Composer $composer2 = $composer.startRestartGroup(-932836462);
        ComposerKt.sourceInformation($composer2, "C(Canvas)40@1873L35:Canvas.kt#71ulvw");
        int $dirty = $changed;
        if (($changed & 6) != 0) goto L10;
        if ($composer2.changed(modifier) == false) goto L7;
        int r2 = 4;
    L8:
        $dirty = $dirty | r2;
        goto L10
    L7:
        r2 = 2;
    L10:
        if (($changed & 48) != 0) goto L17;
        if ($composer2.changedInstance(r6) == false) goto L14;
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
    L29:
        ScopeUpdateScope r0 = $composer2.endRestartGroup();
        if (r0 == null) goto L33;
        r0.updateScope(new AnonymousClass1(modifier, r6, $changed));
        return;
    L33:
        return;
    L23:
        if (ComposerKt.isTraceInProgress() == false) goto L25;
        ComposerKt.traceEventStart(-932836462, $dirty, -1, "androidx.compose.foundation.Canvas (Canvas.kt:40)");
    L25:
        SpacerKt.Spacer(DrawModifierKt.drawBehind(modifier, r6), $composer2, 0);
        if (ComposerKt.isTraceInProgress() == false) goto L29;
        ComposerKt.traceEventEnd();
        goto L29
    L19:
        r4 = false;
        goto L21
    }

    public static final void Canvas(final Modifier modifier, final String contentDescription, final Function1<? super DrawScope, Unit> r13, Composer $composer, final int $changed) {
        Composer $composer2 = $composer.startRestartGroup(-1162737955);
        ComposerKt.sourceInformation($composer2, "C(Canvas)P(1)60@3180L48,60@3135L94:Canvas.kt#71ulvw");
        int $dirty = $changed;
        if (($changed & 6) != 0) goto L10;
        if ($composer2.changed(modifier) == false) goto L7;
        int r2 = 4;
    L8:
        $dirty = $dirty | r2;
        goto L10
    L7:
        r2 = 2;
    L10:
        if (($changed & 48) != 0) goto L17;
        if ($composer2.changed(contentDescription) == false) goto L14;
        int r3 = 32;
    L15:
        $dirty = $dirty | r3;
        goto L17
    L14:
        r3 = 16;
    L17:
        if (($changed & 384) != 0) goto L24;
        if ($composer2.changedInstance(r13) == false) goto L21;
        int r4 = 256;
    L22:
        $dirty = $dirty | r4;
        goto L24
    L21:
        r4 = 128;
    L24:
        if (($dirty & 147) == 146) goto L26;
        boolean r5 = true;
    L28:
        if ($composer2.shouldExecute(r5, $dirty & 1) == true) goto L30;
        $composer2.skipToGroupEnd();
    L47:
        ScopeUpdateScope r0 = $composer2.endRestartGroup();
        if (r0 == null) goto L51;
        r0.updateScope(new AnonymousClass3(modifier, contentDescription, r13, $changed));
        return;
    L51:
        return;
    L30:
        if (ComposerKt.isTraceInProgress() == false) goto L32;
        ComposerKt.traceEventStart(-1162737955, $dirty, -1, "androidx.compose.foundation.Canvas (Canvas.kt:60)");
    L32:
        Modifier r1 = DrawModifierKt.drawBehind(modifier, r13);
        ComposerKt.sourceInformationMarkerStart($composer2, 1782764834, "CC(remember):Canvas.kt#9igjgp");
        if (($dirty & 112) != 32) goto L35;
        boolean invalid$iv = true;
    L36:
        Object it$iv = $composer2.rememberedValue();
        if (invalid$iv == false) goto L39;
    L42:
        Object value$iv = (Function1) new CanvasKt$Canvas$2$1(contentDescription);
        $composer2.updateRememberedValue(value$iv);
        it$iv = value$iv;
    L43:
        ComposerKt.sourceInformationMarkerEnd($composer2);
        SpacerKt.Spacer(SemanticsModifierKt.semantics$default(r1, false, (Function1) it$iv, 1, null), $composer2, 0);
        if (ComposerKt.isTraceInProgress() == false) goto L47;
        ComposerKt.traceEventEnd();
        goto L47
    L39:
        if (it$iv != Composer.Companion.getEmpty()) goto L43;
    L35:
        invalid$iv = false;
        goto L36
    L26:
        r5 = false;
        goto L28
    }
}
