package androidx.activity.compose;

import androidx.activity.FullyDrawnReporter;
import androidx.activity.FullyDrawnReporterOwner;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.ScopeUpdateScope;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: ReportDrawn.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000&\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u001a\r\u0010\u0000\u001a\u00020\u0001H\u0007¢\u0006\u0002\u0010\u0002\u001a+\u0010\u0003\u001a\u00020\u00012\u001c\u0010\u0004\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0005H\u0007¢\u0006\u0002\u0010\b\u001a\u001b\u0010\t\u001a\u00020\u00012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u0007¢\u0006\u0002\u0010\r¨\u0006\u000e"}, d2 = {"ReportDrawn", "", "(Landroidx/compose/runtime/Composer;I)V", "ReportDrawnAfter", "block", "Lkotlin/Function1;", "Lkotlin/coroutines/Continuation;", "", "(Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "ReportDrawnWhen", "predicate", "Lkotlin/Function0;", "", "(Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "activity-compose_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class ReportDrawnKt {
    public static final void ReportDrawnWhen(final Function0<Boolean> r9, Composer $composer, final int $changed) {
        Composer $composer2 = $composer.startRestartGroup(-2047119994);
        ComposerKt.sourceInformation($composer2, "C(ReportDrawnWhen)117@4373L7,118@4463L263,118@4415L311:ReportDrawn.kt#q1dkbc");
        int $dirty = $changed;
        if (($changed & 6) != 0) goto L10;
        if ($composer2.changedInstance(r9) == false) goto L7;
        int r2 = 4;
    L8:
        $dirty = $dirty | r2;
        goto L10
    L7:
        r2 = 2;
    L10:
        if (($dirty & 3) != 2) goto L16;
        if ($composer2.getSkipping() == false) goto L16;
        $composer2.skipToGroupEnd();
    L37:
        ScopeUpdateScope r0 = $composer2.endRestartGroup();
        if (r0 == null) goto L48;
        r0.updateScope(new C01572(r9, $changed));
        return;
    L48:
        return;
    L16:
        if (ComposerKt.isTraceInProgress() == false) goto L18;
        ComposerKt.traceEventStart(-2047119994, $dirty, -1, "androidx.activity.compose.ReportDrawnWhen (ReportDrawn.kt:116)");
    L18:
        FullyDrawnReporterOwner r1 = LocalFullyDrawnReporterOwner.INSTANCE.getCurrent($composer2, 6);
        if (r1 == null) goto L42;
        final FullyDrawnReporter fullyDrawnReporter = r1.getFullyDrawnReporter();
        if (fullyDrawnReporter == null) goto L42;
        ComposerKt.sourceInformationMarkerStart($composer2, 530578081, "CC(remember):ReportDrawn.kt#9igjgp");
        boolean r3 = $composer2.changedInstance(fullyDrawnReporter);
        if (($dirty & 14) != 4) goto L26;
        boolean r4 = true;
    L27:
        boolean invalid$iv = r3 | r4;
        Object it$iv = $composer2.rememberedValue();
        if (invalid$iv == false) goto L30;
    L33:
        Object value$iv = (Function1) new ReportDrawnKt$ReportDrawnWhen$1$1(fullyDrawnReporter, r9);
        $composer2.updateRememberedValue(value$iv);
    L34:
        ComposerKt.sourceInformationMarkerEnd($composer2);
        EffectsKt.DisposableEffect(fullyDrawnReporter, r9, (Function1) value$iv, $composer2, ($dirty << 3) & 112);
        if (ComposerKt.isTraceInProgress() == false) goto L37;
        ComposerKt.traceEventEnd();
        goto L37
    L30:
        if (it$iv == Composer.Companion.getEmpty()) goto L33;
        value$iv = it$iv;
        goto L34
    L26:
        r4 = false;
    L42:
        if (ComposerKt.isTraceInProgress() == false) goto L44;
        ComposerKt.traceEventEnd();
    L44:
        ScopeUpdateScope r5 = $composer2.endRestartGroup();
        if (r5 == null) goto L49;
        r5.updateScope(new ReportDrawnKt$ReportDrawnWhen$fullyDrawnReporter$1(r9, $changed));
        return;
    }

    public static final void ReportDrawn(Composer $composer, final int $changed) {
        Composer $composer2 = $composer.startRestartGroup(-1357012904);
        ComposerKt.sourceInformation($composer2, "C(ReportDrawn)135@4981L24:ReportDrawn.kt#q1dkbc");
        if ($changed != 0) goto L9;
        if ($composer2.getSkipping() == false) goto L9;
        $composer2.skipToGroupEnd();
    L14:
        ScopeUpdateScope r0 = $composer2.endRestartGroup();
        if (r0 == null) goto L18;
        r0.updateScope(new AnonymousClass2($changed));
        return;
    L18:
        return;
    L9:
        if (ComposerKt.isTraceInProgress() == false) goto L11;
        ComposerKt.traceEventStart(-1357012904, $changed, -1, "androidx.activity.compose.ReportDrawn (ReportDrawn.kt:135)");
    L11:
        ReportDrawnWhen(AnonymousClass1.INSTANCE, $composer2, 6);
        if (ComposerKt.isTraceInProgress() == false) goto L14;
        ComposerKt.traceEventEnd();
        goto L14
    }

    public static final void ReportDrawnAfter(final Function1<? super Continuation<? super Unit>, ? extends Object> r10, Composer $composer, final int $changed) {
        Composer $composer2 = $composer.startRestartGroup(945311272);
        ComposerKt.sourceInformation($composer2, "C(ReportDrawnAfter)149@5495L7,150@5579L48,150@5537L90:ReportDrawn.kt#q1dkbc");
        int $dirty = $changed;
        if (($changed & 6) != 0) goto L10;
        if ($composer2.changedInstance(r10) == false) goto L7;
        int r2 = 4;
    L8:
        $dirty = $dirty | r2;
        goto L10
    L7:
        r2 = 2;
    L10:
        if (($dirty & 3) != 2) goto L16;
        if ($composer2.getSkipping() == false) goto L16;
        $composer2.skipToGroupEnd();
    L33:
        ScopeUpdateScope r0 = $composer2.endRestartGroup();
        if (r0 == null) goto L44;
        r0.updateScope(new C01562(r10, $changed));
        return;
    L44:
        return;
    L16:
        if (ComposerKt.isTraceInProgress() == false) goto L18;
        ComposerKt.traceEventStart(945311272, $dirty, -1, "androidx.activity.compose.ReportDrawnAfter (ReportDrawn.kt:148)");
    L18:
        FullyDrawnReporterOwner r1 = LocalFullyDrawnReporterOwner.INSTANCE.getCurrent($composer2, 6);
        if (r1 == null) goto L38;
        FullyDrawnReporter fullyDrawnReporter = r1.getFullyDrawnReporter();
        if (fullyDrawnReporter == null) goto L38;
        ComposerKt.sourceInformationMarkerStart($composer2, 1169985900, "CC(remember):ReportDrawn.kt#9igjgp");
        boolean invalid$iv = $composer2.changedInstance(fullyDrawnReporter) | $composer2.changedInstance(r10);
        Object it$iv = $composer2.rememberedValue();
        if (invalid$iv == false) goto L26;
    L29:
        ReportDrawnKt$ReportDrawnAfter$1$1 value$iv = new ReportDrawnKt$ReportDrawnAfter$1$1(fullyDrawnReporter, r10, null);
        $composer2.updateRememberedValue(value$iv);
    L30:
        ComposerKt.sourceInformationMarkerEnd($composer2);
        EffectsKt.LaunchedEffect(r10, fullyDrawnReporter, (Function2) value$iv, $composer2, $dirty & 14);
        if (ComposerKt.isTraceInProgress() == false) goto L33;
        ComposerKt.traceEventEnd();
        goto L33
    L26:
        if (it$iv == Composer.Companion.getEmpty()) goto L29;
        value$iv = it$iv;
    L38:
        if (ComposerKt.isTraceInProgress() == false) goto L40;
        ComposerKt.traceEventEnd();
    L40:
        ScopeUpdateScope r3 = $composer2.endRestartGroup();
        if (r3 == null) goto L45;
        r3.updateScope(new ReportDrawnKt$ReportDrawnAfter$fullyDrawnReporter$1(r10, $changed));
        return;
    }
}
