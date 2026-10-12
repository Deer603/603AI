package androidx.compose.material3;

import android.content.res.Configuration;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: CalendarLocale.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0003\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, d2 = {"Landroidx/compose/material3/Locale24;", "", "()V", "Companion", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
final class Locale24 {
    public static final Companion Companion = null;

    /* JADX INFO: compiled from: CalendarLocale.android.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0011\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0007¢\u0006\u0002\u0010\u0006¨\u0006\u0007"}, d2 = {"Landroidx/compose/material3/Locale24$Companion;", "", "()V", "defaultLocale", "Ljava/util/Locale;", "Landroidx/compose/material3/CalendarLocale;", "(Landroidx/compose/runtime/Composer;I)Ljava/util/Locale;", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker r1) {
            this();
        }

        private Companion() {
        }

        public final Locale defaultLocale(Composer $composer, int $changed) {
            ComposerKt.sourceInformationMarkerStart($composer, 317587697, "C(defaultLocale)44@1519L7:CalendarLocale.android.kt#uh7d8r");
            if (ComposerKt.isTraceInProgress() == false) goto L5;
            ComposerKt.traceEventStart(317587697, $changed, -1, "androidx.compose.material3.Locale24.Companion.defaultLocale (CalendarLocale.android.kt:43)");
        L5:
            ProvidableCompositionLocal<Configuration> r0 = AndroidCompositionLocals_androidKt.getLocalConfiguration();
            ComposerKt.sourceInformationMarkerStart($composer, 2023513938, "CC:CompositionLocal.kt#9igjgp");
            Object r3 = $composer.consume(r0);
            ComposerKt.sourceInformationMarkerEnd($composer);
            Locale r1 = ((Configuration) r3).getLocales().get(0);
            if (ComposerKt.isTraceInProgress() == false) goto L8;
            ComposerKt.traceEventEnd();
        L8:
            ComposerKt.sourceInformationMarkerEnd($composer);
            return r1;
        }
    }

    static {
        Companion = new Companion(null);
    }

    public Locale24() {
    }
}
