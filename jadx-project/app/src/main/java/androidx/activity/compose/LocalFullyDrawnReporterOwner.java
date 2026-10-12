package androidx.activity.compose;

import android.content.Context;
import android.content.ContextWrapper;
import android.view.View;
import androidx.activity.FullyDrawnReporterOwner;
import androidx.activity.ViewTreeFullyDrawnReporterOwner;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import kotlin.Metadata;

/* JADX INFO: compiled from: ReportDrawn.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0019\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\n2\u0006\u0010\u000b\u001a\u00020\u0005H\u0086\u0004R\u0016\u0010\u0003\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u00058G¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\f"}, d2 = {"Landroidx/activity/compose/LocalFullyDrawnReporterOwner;", "", "()V", "LocalFullyDrawnReporterOwner", "Landroidx/compose/runtime/ProvidableCompositionLocal;", "Landroidx/activity/FullyDrawnReporterOwner;", "current", "getCurrent", "(Landroidx/compose/runtime/Composer;I)Landroidx/activity/FullyDrawnReporterOwner;", "provides", "Landroidx/compose/runtime/ProvidedValue;", "fullyDrawnReporterOwner", "activity-compose_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class LocalFullyDrawnReporterOwner {
    public static final int $stable = 0;
    public static final LocalFullyDrawnReporterOwner INSTANCE = null;
    private static final ProvidableCompositionLocal<FullyDrawnReporterOwner> LocalFullyDrawnReporterOwner = null;

    private LocalFullyDrawnReporterOwner() {
    }

    static {
        INSTANCE = new LocalFullyDrawnReporterOwner();
        LocalFullyDrawnReporterOwner = CompositionLocalKt.compositionLocalOf$default(null, LocalFullyDrawnReporterOwner$LocalFullyDrawnReporterOwner$1.INSTANCE, 1, null);
    }

    public final FullyDrawnReporterOwner getCurrent(Composer $composer, int $changed) {
        ComposerKt.sourceInformationMarkerStart($composer, 540186968, "C(<get-current>)95@3549L7:ReportDrawn.kt#q1dkbc");
        if (ComposerKt.isTraceInProgress() == false) goto L5;
        ComposerKt.traceEventStart(540186968, $changed, -1, "androidx.activity.compose.LocalFullyDrawnReporterOwner.<get-current> (ReportDrawn.kt:95)");
    L5:
        ProvidableCompositionLocal<FullyDrawnReporterOwner> r0 = LocalFullyDrawnReporterOwner;
        ComposerKt.sourceInformationMarkerStart($composer, 2023513938, "CC:CompositionLocal.kt#9igjgp");
        Object r5 = $composer.consume(r0);
        ComposerKt.sourceInformationMarkerEnd($composer);
        FullyDrawnReporterOwner r6 = (FullyDrawnReporterOwner) r5;
        if (r6 != null) goto L8;
        $composer.startReplaceGroup(-1738308180);
        ComposerKt.sourceInformation($composer, "96@3586L7");
        ProvidableCompositionLocal<View> r1 = AndroidCompositionLocals_androidKt.getLocalView();
        ComposerKt.sourceInformationMarkerStart($composer, 2023513938, "CC:CompositionLocal.kt#9igjgp");
        Object r7 = $composer.consume(r1);
        ComposerKt.sourceInformationMarkerEnd($composer);
        r6 = ViewTreeFullyDrawnReporterOwner.get((View) r7);
        $composer.endReplaceGroup();
    L9:
        if (r6 != null) goto L19;
        $composer.startReplaceGroup(-1738306337);
        ComposerKt.sourceInformation($composer, "*97@3699L7");
        ProvidableCompositionLocal<Context> r2 = AndroidCompositionLocals_androidKt.getLocalContext();
        ComposerKt.sourceInformationMarkerStart($composer, 2023513938, "CC:CompositionLocal.kt#9igjgp");
        Object r3 = $composer.consume(r2);
        ComposerKt.sourceInformationMarkerEnd($composer);
        Context context$iv = (Context) r3;
        Context innerContext$iv = context$iv;
    L12:
        if ((innerContext$iv instanceof ContextWrapper) == false) goto L17;
        if ((innerContext$iv instanceof FullyDrawnReporterOwner) == true) goto L18;
        innerContext$iv = ((ContextWrapper) innerContext$iv).getBaseContext();
    L18:
        r6 = (FullyDrawnReporterOwner) innerContext$iv;
        $composer.endReplaceGroup();
    L21:
        if (ComposerKt.isTraceInProgress() == false) goto L23;
        ComposerKt.traceEventEnd();
    L23:
        ComposerKt.sourceInformationMarkerEnd($composer);
        return r6;
    L17:
        innerContext$iv = null;
        goto L18
    L19:
        $composer.startReplaceGroup(-1738310398);
        $composer.endReplaceGroup();
        goto L21
    L8:
        $composer.startReplaceGroup(-1738310474);
        $composer.endReplaceGroup();
        goto L9
    }

    public final ProvidedValue<FullyDrawnReporterOwner> provides(FullyDrawnReporterOwner fullyDrawnReporterOwner) {
        return LocalFullyDrawnReporterOwner.provides(fullyDrawnReporterOwner);
    }
}
