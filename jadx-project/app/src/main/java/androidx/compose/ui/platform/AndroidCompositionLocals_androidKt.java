package androidx.compose.ui.platform;

import android.content.Context;
import android.content.res.Configuration;
import android.view.View;
import androidx.autofill.HintConstants;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocal;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.saveable.SaveableStateRegistryKt;
import androidx.compose.ui.hapticfeedback.HapticFeedback;
import androidx.compose.ui.res.ImageVectorCache;
import androidx.compose.ui.res.ResourceIdCache;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.compose.LocalLifecycleOwnerKt;
import androidx.savedstate.SavedStateRegistryOwner;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: AndroidCompositionLocals.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\u001a(\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\u0011\u0010\u001d\u001a\r\u0012\u0004\u0012\u00020\u001a0\u001e¢\u0006\u0002\b\u001fH\u0001¢\u0006\u0002\u0010 \u001a\u0010\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020$H\u0002\u001a\u001f\u0010%\u001a\u00020\t2\u0006\u0010&\u001a\u00020\u00062\b\u0010'\u001a\u0004\u0018\u00010\u0002H\u0003¢\u0006\u0002\u0010(\u001a\u0015\u0010)\u001a\u00020\u00112\u0006\u0010&\u001a\u00020\u0006H\u0003¢\u0006\u0002\u0010*\"\u0017\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u0003\u0010\u0004\"\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\u0004\"\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0001X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u0004\" \u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u00018FX\u0087\u0004¢\u0006\f\u0012\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0004\"\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u0001X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0004\"\u0017\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0004\"\u0017\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00170\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0004¨\u0006+²\u0006\n\u0010'\u001a\u00020\u0002X\u008a\u008e\u0002"}, d2 = {"LocalConfiguration", "Landroidx/compose/runtime/ProvidableCompositionLocal;", "Landroid/content/res/Configuration;", "getLocalConfiguration", "()Landroidx/compose/runtime/ProvidableCompositionLocal;", "LocalContext", "Landroid/content/Context;", "getLocalContext", "LocalImageVectorCache", "Landroidx/compose/ui/res/ImageVectorCache;", "getLocalImageVectorCache", "LocalLifecycleOwner", "Landroidx/lifecycle/LifecycleOwner;", "getLocalLifecycleOwner$annotations", "()V", "getLocalLifecycleOwner", "LocalResourceIdCache", "Landroidx/compose/ui/res/ResourceIdCache;", "getLocalResourceIdCache", "LocalSavedStateRegistryOwner", "Landroidx/savedstate/SavedStateRegistryOwner;", "getLocalSavedStateRegistryOwner", "LocalView", "Landroid/view/View;", "getLocalView", "ProvideAndroidCompositionLocals", "", "owner", "Landroidx/compose/ui/platform/AndroidComposeView;", "content", "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "(Landroidx/compose/ui/platform/AndroidComposeView;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "noLocalProvidedFor", "", HintConstants.AUTOFILL_HINT_NAME, "", "obtainImageVectorCache", "context", "configuration", "(Landroid/content/Context;Landroid/content/res/Configuration;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/res/ImageVectorCache;", "obtainResourceIdCache", "(Landroid/content/Context;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/res/ResourceIdCache;", "ui_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class AndroidCompositionLocals_androidKt {
    private static final ProvidableCompositionLocal<Configuration> LocalConfiguration = null;
    private static final ProvidableCompositionLocal<Context> LocalContext = null;
    private static final ProvidableCompositionLocal<ImageVectorCache> LocalImageVectorCache = null;
    private static final ProvidableCompositionLocal<ResourceIdCache> LocalResourceIdCache = null;
    private static final ProvidableCompositionLocal<SavedStateRegistryOwner> LocalSavedStateRegistryOwner = null;
    private static final ProvidableCompositionLocal<View> LocalView = null;

    public static final /* synthetic */ void access$ProvideAndroidCompositionLocals$lambda$2(MutableState $configuration$delegate, Configuration value) {
        ProvideAndroidCompositionLocals$lambda$2($configuration$delegate, value);
    }

    public static final /* synthetic */ Void access$noLocalProvidedFor(String name) {
        return noLocalProvidedFor(name);
    }

    @Deprecated(message = "Moved to lifecycle-runtime-compose library in androidx.lifecycle.compose package.", replaceWith = @ReplaceWith(expression = "androidx.lifecycle.compose.LocalLifecycleOwner", imports = {}))
    public static /* synthetic */ void getLocalLifecycleOwner$annotations() {
    }

    public static final ProvidableCompositionLocal<Configuration> getLocalConfiguration() {
        return LocalConfiguration;
    }

    static {
        LocalConfiguration = CompositionLocalKt.compositionLocalOf$default(null, AndroidCompositionLocals_androidKt$LocalConfiguration$1.INSTANCE, 1, null);
        LocalContext = CompositionLocalKt.staticCompositionLocalOf(AndroidCompositionLocals_androidKt$LocalContext$1.INSTANCE);
        LocalImageVectorCache = CompositionLocalKt.staticCompositionLocalOf(AndroidCompositionLocals_androidKt$LocalImageVectorCache$1.INSTANCE);
        LocalResourceIdCache = CompositionLocalKt.staticCompositionLocalOf(AndroidCompositionLocals_androidKt$LocalResourceIdCache$1.INSTANCE);
        LocalSavedStateRegistryOwner = CompositionLocalKt.staticCompositionLocalOf(AndroidCompositionLocals_androidKt$LocalSavedStateRegistryOwner$1.INSTANCE);
        LocalView = CompositionLocalKt.staticCompositionLocalOf(AndroidCompositionLocals_androidKt$LocalView$1.INSTANCE);
    }

    public static final ProvidableCompositionLocal<Context> getLocalContext() {
        return LocalContext;
    }

    public static final ProvidableCompositionLocal<ImageVectorCache> getLocalImageVectorCache() {
        return LocalImageVectorCache;
    }

    public static final ProvidableCompositionLocal<ResourceIdCache> getLocalResourceIdCache() {
        return LocalResourceIdCache;
    }

    public static final ProvidableCompositionLocal<LifecycleOwner> getLocalLifecycleOwner() {
        return LocalLifecycleOwnerKt.getLocalLifecycleOwner();
    }

    public static final ProvidableCompositionLocal<SavedStateRegistryOwner> getLocalSavedStateRegistryOwner() {
        return LocalSavedStateRegistryOwner;
    }

    public static final ProvidableCompositionLocal<View> getLocalView() {
        return LocalView;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void ProvideAndroidCompositionLocals(final AndroidComposeView owner, final Function2<? super Composer, ? super Integer, Unit> r24, Composer $composer, final int $changed) {
        Composer $composer2 = $composer.startRestartGroup(1396852028);
        ComposerKt.sourceInformation($composer2, "C(ProvideAndroidCompositionLocals)P(1)81@3234L75,83@3351L37,85@3411L39,92@3687L102,95@3817L49,95@3794L72,97@3893L184,105@4106L46,106@4179L30,108@4281L7,120@4954L105,109@4326L733:AndroidCompositionLocals.android.kt#itgzvw");
        int $dirty = $changed;
        if (($changed & 6) != 0) goto L10;
        if ($composer2.changedInstance(owner) == false) goto L7;
        int r6 = 4;
    L8:
        $dirty = $dirty | r6;
        goto L10
    L7:
        r6 = 2;
    L10:
        if (($changed & 48) != 0) goto L17;
        if ($composer2.changedInstance(r24) == false) goto L14;
        int r7 = 32;
    L15:
        $dirty = $dirty | r7;
        goto L17
    L14:
        r7 = 16;
    L17:
        if (($dirty & 19) == 18) goto L19;
        boolean r8 = true;
    L21:
        if ($composer2.shouldExecute(r8, $dirty & 1) == true) goto L23;
        $composer2.skipToGroupEnd();
    L65:
        ScopeUpdateScope r3 = $composer2.endRestartGroup();
        if (r3 == null) goto L69;
        r3.updateScope(new AnonymousClass4(owner, r24, $changed));
        return;
    L69:
        return;
    L23:
        if (ComposerKt.isTraceInProgress() == false) goto L25;
        ComposerKt.traceEventStart(1396852028, $dirty, -1, "androidx.compose.ui.platform.ProvideAndroidCompositionLocals (AndroidCompositionLocals.android.kt:76)");
    L25:
        Context context = owner.getContext();
        ComposerKt.sourceInformationMarkerStart($composer2, -1970604435, "CC(remember):AndroidCompositionLocals.android.kt#9igjgp");
        Object it$iv = $composer2.rememberedValue();
        if (it$iv != Composer.Companion.getEmpty()) goto L28;
        char r17 = 1;
        Object value$iv = SnapshotStateKt.mutableStateOf$default(new Configuration(context.getResources().getConfiguration()), null, 2, null);
        $composer2.updateRememberedValue(value$iv);
        it$iv = value$iv;
    L29:
        final MutableState configuration$delegate = (MutableState) it$iv;
        ComposerKt.sourceInformationMarkerEnd($composer2);
        ComposerKt.sourceInformationMarkerStart($composer2, -1970600729, "CC(remember):AndroidCompositionLocals.android.kt#9igjgp");
        Object it$iv2 = $composer2.rememberedValue();
        if (it$iv2 != Composer.Companion.getEmpty()) goto L33;
        Object value$iv2 = (Function1) new AndroidCompositionLocals_androidKt$ProvideAndroidCompositionLocals$1$1(configuration$delegate);
        $composer2.updateRememberedValue(value$iv2);
        it$iv2 = value$iv2;
    L33:
        ComposerKt.sourceInformationMarkerEnd($composer2);
        owner.setConfigurationChangeObserver((Function1) it$iv2);
        ComposerKt.sourceInformationMarkerStart($composer2, -1970598807, "CC(remember):AndroidCompositionLocals.android.kt#9igjgp");
        Object it$iv3 = $composer2.rememberedValue();
        if (it$iv3 != Composer.Companion.getEmpty()) goto L37;
        Object value$iv3 = new AndroidUriHandler(context);
        $composer2.updateRememberedValue(value$iv3);
        it$iv3 = value$iv3;
    L37:
        final AndroidUriHandler uriHandler = (AndroidUriHandler) it$iv3;
        ComposerKt.sourceInformationMarkerEnd($composer2);
        AndroidComposeView.ViewTreeOwners viewTreeOwners = owner.getViewTreeOwners();
        if (viewTreeOwners == null) goto L63;
        ComposerKt.sourceInformationMarkerStart($composer2, -1970589912, "CC(remember):AndroidCompositionLocals.android.kt#9igjgp");
        Object it$iv4 = $composer2.rememberedValue();
        if (it$iv4 != Composer.Companion.getEmpty()) goto L43;
        Object value$iv4 = DisposableSaveableStateRegistry_androidKt.DisposableSaveableStateRegistry(owner, viewTreeOwners.getSavedStateRegistryOwner());
        $composer2.updateRememberedValue(value$iv4);
        it$iv4 = value$iv4;
    L43:
        final DisposableSaveableStateRegistry saveableStateRegistry = (DisposableSaveableStateRegistry) it$iv4;
        ComposerKt.sourceInformationMarkerEnd($composer2);
        Unit r5 = Unit.INSTANCE;
        ComposerKt.sourceInformationMarkerStart($composer2, -1970585805, "CC(remember):AndroidCompositionLocals.android.kt#9igjgp");
        boolean invalid$iv = $composer2.changedInstance(saveableStateRegistry);
        Object it$iv5 = $composer2.rememberedValue();
        if (invalid$iv == true) goto L49;
        MutableState configuration$delegate2 = configuration$delegate;
        if (it$iv5 != Composer.Companion.getEmpty()) goto L51;
    L50:
        Object value$iv5 = (Function1) new AndroidCompositionLocals_androidKt$ProvideAndroidCompositionLocals$2$1(saveableStateRegistry);
        $composer2.updateRememberedValue(value$iv5);
        it$iv5 = value$iv5;
    L51:
        ComposerKt.sourceInformationMarkerEnd($composer2);
        char r9 = 6;
        EffectsKt.DisposableEffect(r5, (Function1) it$iv5, $composer2, 6);
        ComposerKt.sourceInformationMarkerStart($composer2, -1970583238, "CC(remember):AndroidCompositionLocals.android.kt#9igjgp");
        Object it$iv6 = $composer2.rememberedValue();
        if (it$iv6 == Composer.Companion.getEmpty()) goto L54;
        r9 = 6;
    L59:
        HapticFeedback hapticFeedback = (HapticFeedback) it$iv6;
        ComposerKt.sourceInformationMarkerEnd($composer2);
        ImageVectorCache imageVectorCache = obtainImageVectorCache(context, ProvideAndroidCompositionLocals$lambda$1(configuration$delegate2), $composer2, 0);
        ResourceIdCache resourceIdCache = obtainResourceIdCache(context, $composer2, 0);
        CompositionLocal<Boolean> r10 = CompositionLocalsKt.getLocalScrollCaptureInProgress();
        ComposerKt.sourceInformationMarkerStart($composer2, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
        Object r14 = $composer2.consume(r10);
        ComposerKt.sourceInformationMarkerEnd($composer2);
        boolean scrollCaptureInProgress = ((Boolean) r14).booleanValue() | owner.getScrollCaptureInProgress$ui_release();
        ProvidedValue[] r12 = new ProvidedValue[10];
        r12[0] = LocalConfiguration.provides(ProvideAndroidCompositionLocals$lambda$1(configuration$delegate2));
        r12[r17] = LocalContext.provides(context);
        r12[2] = LocalLifecycleOwnerKt.getLocalLifecycleOwner().provides(viewTreeOwners.getLifecycleOwner());
        r12[3] = LocalSavedStateRegistryOwner.provides(viewTreeOwners.getSavedStateRegistryOwner());
        r12[4] = SaveableStateRegistryKt.getLocalSaveableStateRegistry().provides(saveableStateRegistry);
        r12[5] = LocalView.provides(owner.getView());
        r12[r9] = LocalImageVectorCache.provides(imageVectorCache);
        r12[7] = LocalResourceIdCache.provides(resourceIdCache);
        r12[8] = CompositionLocalsKt.getLocalProvidableScrollCaptureInProgress().provides(Boolean.valueOf(scrollCaptureInProgress));
        r12[9] = CompositionLocalsKt.getLocalHapticFeedback().provides(hapticFeedback);
        CompositionLocalKt.CompositionLocalProvider(r12, ComposableLambdaKt.rememberComposableLambda(1471621628, r17, new AnonymousClass3(owner, uriHandler, r24), $composer2, 54), $composer2, ProvidedValue.$stable | 48);
        if (ComposerKt.isTraceInProgress() == false) goto L65;
        ComposerKt.traceEventEnd();
        goto L65
    L54:
        if (HapticDefaults.INSTANCE.isPremiumVibratorEnabled(context) == false) goto L56;
        NoHapticFeedback value$iv6 = new DefaultHapticFeedback(owner.getView());
    L57:
        $composer2.updateRememberedValue(value$iv6);
        it$iv6 = value$iv6;
        goto L59
    L56:
        value$iv6 = new NoHapticFeedback();
        goto L57
    L49:
        configuration$delegate2 = configuration$delegate;
        goto L50
    L63:
        throw new IllegalStateException("Called when the ViewTreeOwnersAvailability is not yet in Available state");
    L28:
        r17 = 1;
        goto L29
    L19:
        r8 = false;
        goto L21
    }

    private static final Configuration ProvideAndroidCompositionLocals$lambda$1(MutableState<Configuration> r4) {
        MutableState<Configuration> $this$getValue$iv = r4;
        return $this$getValue$iv.getValue();
    }

    private static final void ProvideAndroidCompositionLocals$lambda$2(MutableState<Configuration> r4, Configuration value) {
        r4.setValue(value);
    }

    private static final ResourceIdCache obtainResourceIdCache(final Context context, Composer $composer, int $changed) {
        ComposerKt.sourceInformationMarkerStart($composer, -1348507246, "C(obtainResourceIdCache)128@5180L30,129@5231L469,145@5739L169,145@5705L203:AndroidCompositionLocals.android.kt#itgzvw");
        if (ComposerKt.isTraceInProgress() == false) goto L5;
        ComposerKt.traceEventStart(-1348507246, $changed, -1, "androidx.compose.ui.platform.obtainResourceIdCache (AndroidCompositionLocals.android.kt:127)");
    L5:
        ComposerKt.sourceInformationMarkerStart($composer, 1144665392, "CC(remember):AndroidCompositionLocals.android.kt#9igjgp");
        Object it$iv = $composer.rememberedValue();
        if (it$iv != Composer.Companion.getEmpty()) goto L9;
        Object value$iv = new ResourceIdCache();
        $composer.updateRememberedValue(value$iv);
        it$iv = value$iv;
    L9:
        final ResourceIdCache resourceIdCache = (ResourceIdCache) it$iv;
        ComposerKt.sourceInformationMarkerEnd($composer);
        ComposerKt.sourceInformationMarkerStart($composer, 1144667463, "CC(remember):AndroidCompositionLocals.android.kt#9igjgp");
        Object it$iv2 = $composer.rememberedValue();
        if (it$iv2 != Composer.Companion.getEmpty()) goto L13;
        Object value$iv2 = new AndroidCompositionLocals_androidKt$obtainResourceIdCache$callbacks$1$1(resourceIdCache);
        $composer.updateRememberedValue(value$iv2);
        it$iv2 = value$iv2;
    L13:
        final AndroidCompositionLocals_androidKt$obtainResourceIdCache$callbacks$1$1 callbacks = (AndroidCompositionLocals_androidKt$obtainResourceIdCache$callbacks$1$1) it$iv2;
        ComposerKt.sourceInformationMarkerEnd($composer);
        ComposerKt.sourceInformationMarkerStart($composer, 1144683419, "CC(remember):AndroidCompositionLocals.android.kt#9igjgp");
        boolean invalid$iv = $composer.changedInstance(context);
        Object it$iv3 = $composer.rememberedValue();
        if (invalid$iv == false) goto L16;
    L19:
        Object value$iv3 = (Function1) new AndroidCompositionLocals_androidKt$obtainResourceIdCache$1$1(context, callbacks);
        $composer.updateRememberedValue(value$iv3);
        it$iv3 = value$iv3;
    L20:
        ComposerKt.sourceInformationMarkerEnd($composer);
        EffectsKt.DisposableEffect(resourceIdCache, (Function1) it$iv3, $composer, 0);
        if (ComposerKt.isTraceInProgress() == false) goto L23;
        ComposerKt.traceEventEnd();
    L23:
        ComposerKt.sourceInformationMarkerEnd($composer);
        return resourceIdCache;
    L16:
        if (it$iv3 != Composer.Companion.getEmpty()) goto L20;
        goto L19
    }

    private static final ImageVectorCache obtainImageVectorCache(final Context context, Configuration configuration, Composer $composer, int $changed) {
        ComposerKt.sourceInformationMarkerStart($composer, -485908294, "C(obtainImageVectorCache)P(1)158@6100L31,159@6178L88,162@6287L628,180@6955L169,180@6920L204:AndroidCompositionLocals.android.kt#itgzvw");
        if (ComposerKt.isTraceInProgress() == false) goto L6;
        ComposerKt.traceEventStart(-485908294, $changed, -1, "androidx.compose.ui.platform.obtainImageVectorCache (AndroidCompositionLocals.android.kt:157)");
    L6:
        ComposerKt.sourceInformationMarkerStart($composer, 674260938, "CC(remember):AndroidCompositionLocals.android.kt#9igjgp");
        Object it$iv = $composer.rememberedValue();
        if (it$iv != Composer.Companion.getEmpty()) goto L10;
        Object value$iv = new ImageVectorCache();
        $composer.updateRememberedValue(value$iv);
        it$iv = value$iv;
    L10:
        final ImageVectorCache imageVectorCache = (ImageVectorCache) it$iv;
        ComposerKt.sourceInformationMarkerEnd($composer);
        ComposerKt.sourceInformationMarkerStart($composer, 674263491, "CC(remember):AndroidCompositionLocals.android.kt#9igjgp");
        Object it$iv2 = $composer.rememberedValue();
        if (it$iv2 != Composer.Companion.getEmpty()) goto L17;
        Configuration $this$obtainImageVectorCache_u24lambda_u2414_u24lambda_u2413 = new Configuration();
        if (configuration == null) goto L15;
        $this$obtainImageVectorCache_u24lambda_u2414_u24lambda_u2413.setTo(configuration);
    L15:
        $composer.updateRememberedValue($this$obtainImageVectorCache_u24lambda_u2414_u24lambda_u2413);
        it$iv2 = $this$obtainImageVectorCache_u24lambda_u2414_u24lambda_u2413;
    L17:
        final Configuration currentConfiguration = (Configuration) it$iv2;
        ComposerKt.sourceInformationMarkerEnd($composer);
        ComposerKt.sourceInformationMarkerStart($composer, 674267519, "CC(remember):AndroidCompositionLocals.android.kt#9igjgp");
        Object it$iv3 = $composer.rememberedValue();
        if (it$iv3 != Composer.Companion.getEmpty()) goto L21;
        Object value$iv2 = new AndroidCompositionLocals_androidKt$obtainImageVectorCache$callbacks$1$1(currentConfiguration, imageVectorCache);
        $composer.updateRememberedValue(value$iv2);
        it$iv3 = value$iv2;
    L21:
        final AndroidCompositionLocals_androidKt$obtainImageVectorCache$callbacks$1$1 callbacks = (AndroidCompositionLocals_androidKt$obtainImageVectorCache$callbacks$1$1) it$iv3;
        ComposerKt.sourceInformationMarkerEnd($composer);
        ComposerKt.sourceInformationMarkerStart($composer, 674288436, "CC(remember):AndroidCompositionLocals.android.kt#9igjgp");
        boolean invalid$iv = $composer.changedInstance(context);
        Object it$iv4 = $composer.rememberedValue();
        if (invalid$iv == false) goto L24;
    L27:
        Object value$iv3 = (Function1) new AndroidCompositionLocals_androidKt$obtainImageVectorCache$1$1(context, callbacks);
        $composer.updateRememberedValue(value$iv3);
        it$iv4 = value$iv3;
    L28:
        ComposerKt.sourceInformationMarkerEnd($composer);
        EffectsKt.DisposableEffect(imageVectorCache, (Function1) it$iv4, $composer, 0);
        if (ComposerKt.isTraceInProgress() == false) goto L31;
        ComposerKt.traceEventEnd();
    L31:
        ComposerKt.sourceInformationMarkerEnd($composer);
        return imageVectorCache;
    L24:
        if (it$iv4 != Composer.Companion.getEmpty()) goto L28;
        goto L27
    }

    private static final Void noLocalProvidedFor(String name) {
        throw new IllegalStateException(("CompositionLocal " + name + " not present").toString());
    }
}
