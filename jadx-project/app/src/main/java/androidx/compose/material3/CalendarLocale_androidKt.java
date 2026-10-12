package androidx.compose.material3;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import java.util.Locale;
import kotlin.Metadata;

/* JADX INFO: compiled from: CalendarLocale.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0011\u0010\u0000\u001a\u00060\u0001j\u0002`\u0002H\u0001¢\u0006\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"defaultLocale", "Ljava/util/Locale;", "Landroidx/compose/material3/CalendarLocale;", "(Landroidx/compose/runtime/Composer;I)Ljava/util/Locale;", "material3_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class CalendarLocale_androidKt {
    public static final Locale defaultLocale(Composer $composer, int $changed) {
        ComposerKt.sourceInformationMarkerStart($composer, -1612326743, "C(defaultLocale):CalendarLocale.android.kt#uh7d8r");
        if (ComposerKt.isTraceInProgress() == false) goto L5;
        ComposerKt.traceEventStart(-1612326743, $changed, -1, "androidx.compose.material3.defaultLocale (CalendarLocale.android.kt:30)");
    L5:
        $composer.startReplaceGroup(-1190822718);
        ComposerKt.sourceInformation($composer, "32@1187L15");
        Locale r0 = Locale24.Companion.defaultLocale($composer, 6);
        $composer.endReplaceGroup();
        if (ComposerKt.isTraceInProgress() == false) goto L8;
        ComposerKt.traceEventEnd();
    L8:
        ComposerKt.sourceInformationMarkerEnd($composer);
        return r0;
    }
}
