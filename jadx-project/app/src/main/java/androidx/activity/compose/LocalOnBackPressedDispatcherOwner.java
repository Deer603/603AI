package androidx.activity.compose;

import android.content.Context;
import android.content.ContextWrapper;
import android.view.View;
import androidx.activity.OnBackPressedDispatcherOwner;
import androidx.activity.ViewTreeOnBackPressedDispatcherOwner;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import kotlin.Metadata;

/* JADX INFO: compiled from: BackHandler.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0019\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\n2\u0006\u0010\u000b\u001a\u00020\u0005H\u0086\u0004R\u0016\u0010\u0003\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u00058G¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\f"}, d2 = {"Landroidx/activity/compose/LocalOnBackPressedDispatcherOwner;", "", "()V", "LocalOnBackPressedDispatcherOwner", "Landroidx/compose/runtime/ProvidableCompositionLocal;", "Landroidx/activity/OnBackPressedDispatcherOwner;", "current", "getCurrent", "(Landroidx/compose/runtime/Composer;I)Landroidx/activity/OnBackPressedDispatcherOwner;", "provides", "Landroidx/compose/runtime/ProvidedValue;", "dispatcherOwner", "activity-compose_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class LocalOnBackPressedDispatcherOwner {
    public static final int $stable = 0;
    public static final LocalOnBackPressedDispatcherOwner INSTANCE = null;
    private static final ProvidableCompositionLocal<OnBackPressedDispatcherOwner> LocalOnBackPressedDispatcherOwner = null;

    private LocalOnBackPressedDispatcherOwner() {
    }

    static {
        INSTANCE = new LocalOnBackPressedDispatcherOwner();
        LocalOnBackPressedDispatcherOwner = CompositionLocalKt.compositionLocalOf$default(null, LocalOnBackPressedDispatcherOwner$LocalOnBackPressedDispatcherOwner$1.INSTANCE, 1, null);
    }

    public final OnBackPressedDispatcherOwner getCurrent(Composer $composer, int $changed) {
        ComposerKt.sourceInformationMarkerStart($composer, -2068013981, "C(<get-current>)50@2099L7:BackHandler.kt#q1dkbc");
        if (ComposerKt.isTraceInProgress() == false) goto L5;
        ComposerKt.traceEventStart(-2068013981, $changed, -1, "androidx.activity.compose.LocalOnBackPressedDispatcherOwner.<get-current> (BackHandler.kt:50)");
    L5:
        ProvidableCompositionLocal<OnBackPressedDispatcherOwner> r0 = LocalOnBackPressedDispatcherOwner;
        ComposerKt.sourceInformationMarkerStart($composer, 2023513938, "CC:CompositionLocal.kt#9igjgp");
        Object r5 = $composer.consume(r0);
        ComposerKt.sourceInformationMarkerEnd($composer);
        OnBackPressedDispatcherOwner r6 = (OnBackPressedDispatcherOwner) r5;
        if (r6 != null) goto L8;
        $composer.startReplaceGroup(544166745);
        ComposerKt.sourceInformation($composer, "51@2136L7");
        ProvidableCompositionLocal<View> r1 = AndroidCompositionLocals_androidKt.getLocalView();
        ComposerKt.sourceInformationMarkerStart($composer, 2023513938, "CC:CompositionLocal.kt#9igjgp");
        Object r7 = $composer.consume(r1);
        ComposerKt.sourceInformationMarkerEnd($composer);
        r6 = ViewTreeOnBackPressedDispatcherOwner.get((View) r7);
        $composer.endReplaceGroup();
    L9:
        if (r6 != null) goto L19;
        $composer.startReplaceGroup(544168748);
        ComposerKt.sourceInformation($composer, "*52@2259L7");
        ProvidableCompositionLocal<Context> r2 = AndroidCompositionLocals_androidKt.getLocalContext();
        ComposerKt.sourceInformationMarkerStart($composer, 2023513938, "CC:CompositionLocal.kt#9igjgp");
        Object r3 = $composer.consume(r2);
        ComposerKt.sourceInformationMarkerEnd($composer);
        Context context$iv = (Context) r3;
        Context innerContext$iv = context$iv;
    L12:
        if ((innerContext$iv instanceof ContextWrapper) == false) goto L17;
        if ((innerContext$iv instanceof OnBackPressedDispatcherOwner) == true) goto L18;
        innerContext$iv = ((ContextWrapper) innerContext$iv).getBaseContext();
    L18:
        r6 = (OnBackPressedDispatcherOwner) innerContext$iv;
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
        $composer.startReplaceGroup(544164377);
        $composer.endReplaceGroup();
        goto L21
    L8:
        $composer.startReplaceGroup(544164296);
        $composer.endReplaceGroup();
        goto L9
    }

    public final ProvidedValue<OnBackPressedDispatcherOwner> provides(OnBackPressedDispatcherOwner dispatcherOwner) {
        return LocalOnBackPressedDispatcherOwner.provides(dispatcherOwner);
    }
}
