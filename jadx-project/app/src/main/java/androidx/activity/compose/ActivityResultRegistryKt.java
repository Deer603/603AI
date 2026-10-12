package androidx.activity.compose;

import androidx.activity.result.ActivityResultRegistry;
import androidx.activity.result.ActivityResultRegistryOwner;
import androidx.activity.result.contract.ActivityResultContract;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.saveable.RememberSaveableKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: ActivityResultRegistry.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u001aM\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u00032\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u00052\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u0002H\u0003\u0012\u0004\u0012\u00020\b0\u0007H\u0007¢\u0006\u0002\u0010\t¨\u0006\n"}, d2 = {"rememberLauncherForActivityResult", "Landroidx/activity/compose/ManagedActivityResultLauncher;", "I", "O", "contract", "Landroidx/activity/result/contract/ActivityResultContract;", "onResult", "Lkotlin/Function1;", "", "(Landroidx/activity/result/contract/ActivityResultContract;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)Landroidx/activity/compose/ManagedActivityResultLauncher;", "activity-compose_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class ActivityResultRegistryKt {
    public static final <I, O> ManagedActivityResultLauncher<I, O> rememberLauncherForActivityResult(ActivityResultContract<I, O> r20, Function1<? super O, Unit> r21, Composer $composer, int $changed) {
        ComposerKt.sourceInformationMarkerStart($composer, -1408504823, "C(rememberLauncherForActivityResult)84@3541L30,85@3598L30,89@3767L49,*92@3905L7,96@4088L46,97@4162L73,101@4418L176,101@4362L232:ActivityResultRegistry.kt#q1dkbc");
        if (ComposerKt.isTraceInProgress() == false) goto L5;
        ComposerKt.traceEventStart(-1408504823, $changed, -1, "androidx.activity.compose.rememberLauncherForActivityResult (ActivityResultRegistry.kt:82)");
    L5:
        State currentContract = SnapshotStateKt.rememberUpdatedState(r20, $composer, $changed & 14);
        State currentOnResult = SnapshotStateKt.rememberUpdatedState(r21, $composer, ($changed >> 3) & 14);
        String key = (String) RememberSaveableKt.m3923rememberSaveable(new Object[0], null, null, ActivityResultRegistryKt$rememberLauncherForActivityResult$key$1.INSTANCE, $composer, 3072, 6);
        ActivityResultRegistryOwner r3 = LocalActivityResultRegistryOwner.INSTANCE.getCurrent($composer, 6);
        if (r3 == null) goto L28;
        ActivityResultRegistry activityResultRegistry = r3.getActivityResultRegistry();
        ComposerKt.sourceInformationMarkerStart($composer, -316131648, "CC(remember):ActivityResultRegistry.kt#9igjgp");
        Object it$iv = $composer.rememberedValue();
        if (it$iv != Composer.Companion.getEmpty()) goto L10;
        Object value$iv = new ActivityResultLauncherHolder();
        $composer.updateRememberedValue(value$iv);
    L11:
        ActivityResultLauncherHolder realLauncher = (ActivityResultLauncherHolder) value$iv;
        ComposerKt.sourceInformationMarkerEnd($composer);
        ComposerKt.sourceInformationMarkerStart($composer, -316129253, "CC(remember):ActivityResultRegistry.kt#9igjgp");
        Object it$iv2 = $composer.rememberedValue();
        if (it$iv2 != Composer.Companion.getEmpty()) goto L14;
        Object value$iv2 = new ManagedActivityResultLauncher(realLauncher, currentContract);
        $composer.updateRememberedValue(value$iv2);
    L15:
        ManagedActivityResultLauncher<I, O> r6 = (ManagedActivityResultLauncher) value$iv2;
        ComposerKt.sourceInformationMarkerEnd($composer);
        ComposerKt.sourceInformationMarkerStart($composer, -316120958, "CC(remember):ActivityResultRegistry.kt#9igjgp");
        boolean r5 = (($composer.changedInstance(realLauncher) | $composer.changedInstance(activityResultRegistry)) | $composer.changed(key)) | $composer.changedInstance(r20);
        boolean invalid$iv = $composer.changed(currentOnResult) | r5;
        Object it$iv3 = $composer.rememberedValue();
        if (invalid$iv == false) goto L18;
    L21:
        ActivityResultRegistryKt$rememberLauncherForActivityResult$1$1 r0 = new ActivityResultRegistryKt$rememberLauncherForActivityResult$1$1(realLauncher, activityResultRegistry, key, r20, currentOnResult);
        ActivityResultRegistry activityResultRegistry2 = activityResultRegistry;
        key = key;
        ActivityResultRegistryKt$rememberLauncherForActivityResult$1$1 value$iv3 = r0;
        $composer.updateRememberedValue(value$iv3);
    L22:
        ComposerKt.sourceInformationMarkerEnd($composer);
        EffectsKt.DisposableEffect(activityResultRegistry2, key, r20, (Function1) value$iv3, $composer, ($changed << 6) & 896);
        if (ComposerKt.isTraceInProgress() == false) goto L25;
        ComposerKt.traceEventEnd();
    L25:
        ComposerKt.sourceInformationMarkerEnd($composer);
        return r6;
    L18:
        if (it$iv3 == Composer.Companion.getEmpty()) goto L21;
        activityResultRegistry2 = activityResultRegistry;
        value$iv3 = it$iv3;
        goto L22
    L14:
        value$iv2 = it$iv2;
        goto L15
    L10:
        value$iv = it$iv;
        goto L11
    L28:
        throw new IllegalStateException("No ActivityResultRegistryOwner was provided via LocalActivityResultRegistryOwner".toString());
    }
}
