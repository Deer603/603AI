package androidx.compose.foundation.lazy.layout;

import android.os.Build;
import android.view.View;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: PrefetchScheduler.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0001\u001a\r\u0010\u0005\u001a\u00020\u0006H\u0001¢\u0006\u0002\u0010\u0007\"\u001a\u0010\u0000\u001a\u0004\u0018\u00010\u00018\u0002X\u0083\u0004¢\u0006\n\n\u0002\u0010\u0004\u0012\u0004\b\u0002\u0010\u0003¨\u0006\b"}, d2 = {"RobolectricImpl", "androidx/compose/foundation/lazy/layout/PrefetchScheduler_androidKt$RobolectricImpl$1", "getRobolectricImpl$annotations", "()V", "Landroidx/compose/foundation/lazy/layout/PrefetchScheduler_androidKt$RobolectricImpl$1;", "rememberDefaultPrefetchScheduler", "Landroidx/compose/foundation/lazy/layout/PrefetchScheduler;", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/foundation/lazy/layout/PrefetchScheduler;", "foundation_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class PrefetchScheduler_androidKt {
    private static final PrefetchScheduler_androidKt$RobolectricImpl$1 RobolectricImpl = null;

    private static /* synthetic */ void getRobolectricImpl$annotations() {
    }

    public static final PrefetchScheduler rememberDefaultPrefetchScheduler(Composer $composer, int $changed) {
        ComposerKt.sourceInformationMarkerStart($composer, 1141871251, "C(rememberDefaultPrefetchScheduler):PrefetchScheduler.android.kt#wow0x6");
        if (ComposerKt.isTraceInProgress() == false) goto L6;
        ComposerKt.traceEventStart(1141871251, $changed, -1, "androidx.compose.foundation.lazy.layout.rememberDefaultPrefetchScheduler (PrefetchScheduler.android.kt:32)");
    L6:
        if (RobolectricImpl == null) goto L8;
        $composer.startReplaceGroup(1213893039);
        $composer.endReplaceGroup();
        AndroidPrefetchScheduler r0 = RobolectricImpl;
    L17:
        if (ComposerKt.isTraceInProgress() == false) goto L19;
        ComposerKt.traceEventEnd();
    L19:
        ComposerKt.sourceInformationMarkerEnd($composer);
        return r0;
    L8:
        $composer.startReplaceGroup(1213931944);
        ComposerKt.sourceInformation($composer, "36@1323L7,37@1339L49");
        ProvidableCompositionLocal<View> r1 = AndroidCompositionLocals_androidKt.getLocalView();
        ComposerKt.sourceInformationMarkerStart($composer, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
        Object r3 = $composer.consume(r1);
        ComposerKt.sourceInformationMarkerEnd($composer);
        View view = (View) r3;
        ComposerKt.sourceInformationMarkerStart($composer, -930670779, "CC(remember):PrefetchScheduler.android.kt#9igjgp");
        boolean invalid$iv = $composer.changed(view);
        Object it$iv = $composer.rememberedValue();
        if (invalid$iv == false) goto L11;
    L14:
        Object value$iv = new AndroidPrefetchScheduler(view);
        $composer.updateRememberedValue(value$iv);
        it$iv = value$iv;
    L15:
        ComposerKt.sourceInformationMarkerEnd($composer);
        $composer.endReplaceGroup();
        r0 = (AndroidPrefetchScheduler) it$iv;
        goto L17
    L11:
        if (it$iv != Composer.Companion.getEmpty()) goto L15;
        goto L14
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        String r0 = Build.FINGERPRINT.toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(r0, "toLowerCase(...)");
        if (Intrinsics.areEqual(r0, "robolectric") == false) goto L5;
        PrefetchScheduler_androidKt$RobolectricImpl$1 r1 = new PrefetchScheduler_androidKt$RobolectricImpl$1();
    L6:
        RobolectricImpl = r1;
        return;
    L5:
        r1 = 0;
        goto L6
    }
}
