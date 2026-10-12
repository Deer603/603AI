package androidx.activity.compose;

import android.content.Context;
import android.content.ContextWrapper;
import androidx.activity.result.ActivityResultRegistryOwner;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import kotlin.Metadata;

/* JADX INFO: compiled from: ActivityResultRegistry.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0019\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\n2\u0006\u0010\u000b\u001a\u00020\u0005H\u0086\u0004R\u0016\u0010\u0003\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u00058G¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\f"}, d2 = {"Landroidx/activity/compose/LocalActivityResultRegistryOwner;", "", "()V", "LocalComposition", "Landroidx/compose/runtime/ProvidableCompositionLocal;", "Landroidx/activity/result/ActivityResultRegistryOwner;", "current", "getCurrent", "(Landroidx/compose/runtime/Composer;I)Landroidx/activity/result/ActivityResultRegistryOwner;", "provides", "Landroidx/compose/runtime/ProvidedValue;", "registryOwner", "activity-compose_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class LocalActivityResultRegistryOwner {
    public static final int $stable = 0;
    public static final LocalActivityResultRegistryOwner INSTANCE = null;
    private static final ProvidableCompositionLocal<ActivityResultRegistryOwner> LocalComposition = null;

    private LocalActivityResultRegistryOwner() {
    }

    static {
        INSTANCE = new LocalActivityResultRegistryOwner();
        LocalComposition = CompositionLocalKt.compositionLocalOf$default(null, LocalActivityResultRegistryOwner$LocalComposition$1.INSTANCE, 1, null);
    }

    public final ActivityResultRegistryOwner getCurrent(Composer $composer, int $changed) {
        ComposerKt.sourceInformationMarkerStart($composer, 1418020823, "C(<get-current>)48@1959L7:ActivityResultRegistry.kt#q1dkbc");
        if (ComposerKt.isTraceInProgress() == false) goto L5;
        ComposerKt.traceEventStart(1418020823, $changed, -1, "androidx.activity.compose.LocalActivityResultRegistryOwner.<get-current> (ActivityResultRegistry.kt:48)");
    L5:
        ProvidableCompositionLocal<ActivityResultRegistryOwner> r0 = LocalComposition;
        ComposerKt.sourceInformationMarkerStart($composer, 2023513938, "CC:CompositionLocal.kt#9igjgp");
        Object r5 = $composer.consume(r0);
        ComposerKt.sourceInformationMarkerEnd($composer);
        ActivityResultRegistryOwner r6 = (ActivityResultRegistryOwner) r5;
        if (r6 != null) goto L16;
        $composer.startReplaceGroup(1006590171);
        ComposerKt.sourceInformation($composer, "*48@2022L7");
        ProvidableCompositionLocal<Context> r1 = AndroidCompositionLocals_androidKt.getLocalContext();
        ComposerKt.sourceInformationMarkerStart($composer, 2023513938, "CC:CompositionLocal.kt#9igjgp");
        Object r3 = $composer.consume(r1);
        ComposerKt.sourceInformationMarkerEnd($composer);
        Context context$iv = (Context) r3;
        Context innerContext$iv = context$iv;
    L9:
        if ((innerContext$iv instanceof ContextWrapper) == false) goto L14;
        if ((innerContext$iv instanceof ActivityResultRegistryOwner) == true) goto L15;
        innerContext$iv = ((ContextWrapper) innerContext$iv).getBaseContext();
    L15:
        r6 = (ActivityResultRegistryOwner) innerContext$iv;
    L17:
        $composer.endReplaceGroup();
        if (ComposerKt.isTraceInProgress() == false) goto L20;
        ComposerKt.traceEventEnd();
    L20:
        ComposerKt.sourceInformationMarkerEnd($composer);
        return r6;
    L14:
        innerContext$iv = null;
        goto L15
    L16:
        $composer.startReplaceGroup(1006589303);
        goto L17
    }

    public final ProvidedValue<ActivityResultRegistryOwner> provides(ActivityResultRegistryOwner registryOwner) {
        return LocalComposition.provides(registryOwner);
    }
}
