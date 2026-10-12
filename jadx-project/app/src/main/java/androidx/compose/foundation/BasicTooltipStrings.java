package androidx.compose.foundation;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.res.StringResources_androidKt;
import kotlin.Metadata;

/* JADX INFO: compiled from: BasicTooltip.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\r\u0010\u0003\u001a\u00020\u0004H\u0007¢\u0006\u0002\u0010\u0005J\r\u0010\u0006\u001a\u00020\u0004H\u0007¢\u0006\u0002\u0010\u0005¨\u0006\u0007"}, d2 = {"Landroidx/compose/foundation/BasicTooltipStrings;", "", "()V", "description", "", "(Landroidx/compose/runtime/Composer;I)Ljava/lang/String;", "label", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class BasicTooltipStrings {
    public static final int $stable = 0;
    public static final BasicTooltipStrings INSTANCE = null;

    static {
        INSTANCE = new BasicTooltipStrings();
    }

    private BasicTooltipStrings() {
    }

    public final String label(Composer $composer, int $changed) {
        ComposerKt.sourceInformationMarkerStart($composer, 187295226, "C(label)24@926L38:BasicTooltip.android.kt#71ulvw");
        if (ComposerKt.isTraceInProgress() == false) goto L5;
        ComposerKt.traceEventStart(187295226, $changed, -1, "androidx.compose.foundation.BasicTooltipStrings.label (BasicTooltip.android.kt:24)");
    L5:
        String r0 = StringResources_androidKt.stringResource(R.string.tooltip_label, $composer, 0);
        if (ComposerKt.isTraceInProgress() == false) goto L8;
        ComposerKt.traceEventEnd();
    L8:
        ComposerKt.sourceInformationMarkerEnd($composer);
        return r0;
    }

    public final String description(Composer $composer, int $changed) {
        ComposerKt.sourceInformationMarkerStart($composer, 1416633714, "C(description)26@1017L44:BasicTooltip.android.kt#71ulvw");
        if (ComposerKt.isTraceInProgress() == false) goto L5;
        ComposerKt.traceEventStart(1416633714, $changed, -1, "androidx.compose.foundation.BasicTooltipStrings.description (BasicTooltip.android.kt:26)");
    L5:
        String r0 = StringResources_androidKt.stringResource(R.string.tooltip_description, $composer, 0);
        if (ComposerKt.isTraceInProgress() == false) goto L8;
        ComposerKt.traceEventEnd();
    L8:
        ComposerKt.sourceInformationMarkerEnd($composer);
        return r0;
    }
}
