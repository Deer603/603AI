package androidx.compose.ui.viewinterop;

import android.content.Context;
import android.view.View;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionContext;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.saveable.SaveableStateRegistry;
import androidx.compose.runtime.saveable.SaveableStateRegistryKt;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.internal.InlineClassHelperKt;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.UiApplier;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.compose.LocalLifecycleOwnerKt;
import androidx.savedstate.SavedStateRegistryOwner;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: AndroidView.android.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001ay\u0010\u0007\u001a\u00020\u0003\"\b\b\u0000\u0010\b*\u00020\u00022\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u0002H\b0\u00012\b\b\u0002\u0010\u000b\u001a\u00020\f2\u0016\b\u0002\u0010\r\u001a\u0010\u0012\u0004\u0012\u0002H\b\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00012\u0014\b\u0002\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u0002H\b\u0012\u0004\u0012\u00020\u00030\u00012\u0014\b\u0002\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u0002H\b\u0012\u0004\u0012\u00020\u00030\u0001H\u0007¢\u0006\u0002\u0010\u0010\u001aK\u0010\u0007\u001a\u00020\u0003\"\b\b\u0000\u0010\b*\u00020\u00022\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u0002H\b0\u00012\b\b\u0002\u0010\u000b\u001a\u00020\f2\u0014\b\u0002\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u0002H\b\u0012\u0004\u0012\u00020\u00030\u0001H\u0007¢\u0006\u0002\u0010\u0011\u001a1\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013\"\b\b\u0000\u0010\b*\u00020\u00022\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u0002H\b0\u0001H\u0003¢\u0006\u0002\u0010\u0015\u001a\u001c\u0010\u0016\u001a\b\u0012\u0004\u0012\u0002H\b0\u0017\"\b\b\u0000\u0010\b*\u00020\u0002*\u00020\u0014H\u0002\u001a^\u0010\u0018\u001a\u00020\u0003\"\b\b\u0000\u0010\b*\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00140\u00192\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020%H\u0002ø\u0001\u0000¢\u0006\u0004\b&\u0010'\"\"\u0010\u0000\u001a\u0013\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¢\u0006\u0002\b\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006("}, d2 = {"NoOpUpdate", "Lkotlin/Function1;", "Landroid/view/View;", "", "Lkotlin/ExtensionFunctionType;", "getNoOpUpdate", "()Lkotlin/jvm/functions/Function1;", "AndroidView", "T", "factory", "Landroid/content/Context;", "modifier", "Landroidx/compose/ui/Modifier;", "onReset", "onRelease", "update", "(Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "(Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "createAndroidViewNodeFactory", "Lkotlin/Function0;", "Landroidx/compose/ui/node/LayoutNode;", "(Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)Lkotlin/jvm/functions/Function0;", "requireViewFactoryHolder", "Landroidx/compose/ui/viewinterop/ViewFactoryHolder;", "updateViewHolderParams", "Landroidx/compose/runtime/Updater;", "compositeKeyHash", "", "density", "Landroidx/compose/ui/unit/Density;", "lifecycleOwner", "Landroidx/lifecycle/LifecycleOwner;", "savedStateRegistryOwner", "Landroidx/savedstate/SavedStateRegistryOwner;", "layoutDirection", "Landroidx/compose/ui/unit/LayoutDirection;", "compositionLocalMap", "Landroidx/compose/runtime/CompositionLocalMap;", "updateViewHolderParams-6NefGtU", "(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;ILandroidx/compose/ui/unit/Density;Landroidx/lifecycle/LifecycleOwner;Landroidx/savedstate/SavedStateRegistryOwner;Landroidx/compose/ui/unit/LayoutDirection;Landroidx/compose/runtime/CompositionLocalMap;)V", "ui_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class AndroidView_androidKt {
    private static final Function1<View, Unit> NoOpUpdate = null;

    public static final /* synthetic */ ViewFactoryHolder access$requireViewFactoryHolder(LayoutNode $receiver) {
        return requireViewFactoryHolder($receiver);
    }

    public static final <T extends View> void AndroidView(final Function1<? super Context, ? extends T> r14, Modifier modifier, Function1<? super T, Unit> r16, Composer $composer, final int $changed, final int r19) {
        Composer $composer2 = $composer.startRestartGroup(-1783766393);
        ComposerKt.sourceInformation($composer2, "C(AndroidView)105@5481L92:AndroidView.android.kt#z33iqn");
        int $dirty = $changed;
        if ((r19 & 1) == 0) goto L6;
        $dirty = $dirty | 6;
    L12:
        int r2 = r19 & 2;
        if (r2 == 0) goto L16;
        $dirty = $dirty | 48;
    L22:
        int r5 = r19 & 4;
        if (r5 == 0) goto L26;
        $dirty = $dirty | 384;
    L33:
        int $dirty2 = $dirty;
        if (($dirty2 & 147) == 146) goto L36;
        boolean r1 = true;
    L38:
        if ($composer2.shouldExecute(r1, $dirty2 & 1) == false) goto L52;
        if (r2 == 0) goto L41;
        Modifier modifier2 = Modifier.Companion;
    L42:
        if (r5 == 0) goto L44;
        Function1<? super T, Unit> r9 = NoOpUpdate;
    L46:
        if (ComposerKt.isTraceInProgress() == false) goto L48;
        ComposerKt.traceEventStart(-1783766393, $dirty2, -1, "androidx.compose.ui.viewinterop.AndroidView (AndroidView.android.kt:104)");
    L48:
        AndroidView(r14, modifier2, null, NoOpUpdate, r9, $composer2, ((($dirty2 & 14) | 3072) | ($dirty2 & 112)) | (57344 & ($dirty2 << 6)), 4);
        if (ComposerKt.isTraceInProgress() == false) goto L51;
        ComposerKt.traceEventEnd();
    L51:
        final Modifier modifier3 = modifier2;
        final Function1<? super T, Unit> r3 = r9;
    L53:
        ScopeUpdateScope r6 = $composer2.endRestartGroup();
        if (r6 == null) goto L57;
        r6.updateScope(new AnonymousClass1(r14, modifier3, r3, $changed, r19));
        return;
    L57:
        return;
    L44:
        r9 = r16;
        goto L46
    L41:
        modifier2 = modifier;
        goto L42
    L52:
        $composer2.skipToGroupEnd();
        modifier3 = modifier;
        r3 = r16;
        goto L53
    L36:
        r1 = false;
        goto L38
    L26:
        if (($changed & 384) != 0) goto L33;
        if ($composer2.changedInstance(r16) == false) goto L30;
        int r7 = 256;
    L31:
        $dirty = $dirty | r7;
        goto L33
    L30:
        r7 = 128;
        goto L31
    L16:
        if (($changed & 48) != 0) goto L22;
        if ($composer2.changed(modifier) == false) goto L20;
        int r8 = 32;
    L21:
        $dirty = $dirty | r8;
        goto L22
    L20:
        r8 = 16;
        goto L21
    L6:
        if (($changed & 6) != 0) goto L12;
        if ($composer2.changedInstance(r14) == false) goto L10;
        int r4 = 4;
    L11:
        $dirty = $dirty | r4;
        goto L12
    L10:
        r4 = 2;
        goto L11
    }

    public static final <T extends View> void AndroidView(final Function1<? super Context, ? extends T> r24, Modifier modifier, Function1<? super T, Unit> r26, Function1<? super T, Unit> r27, Function1<? super T, Unit> r28, Composer $composer, final int $changed, final int r31) {
        Composer $composer2 = $composer.startRestartGroup(-180024211);
        ComposerKt.sourceInformation($composer2, "C(AndroidView)P(!2,3)200@11861L23,202@12008L7,203@12063L7,210@12519L7,211@12590L7:AndroidView.android.kt#z33iqn");
        int $dirty = $changed;
        if ((r31 & 1) == 0) goto L6;
        $dirty = $dirty | 6;
    L12:
        int r3 = r31 & 2;
        if (r3 == 0) goto L16;
        $dirty = $dirty | 48;
        Modifier r4 = modifier;
    L23:
        int r5 = r31 & 4;
        if (r5 == 0) goto L27;
        $dirty = $dirty | 384;
        Function1<? super T, Unit> r7 = r26;
    L34:
        int r9 = r31 & 8;
        if (r9 == 0) goto L38;
        $dirty = $dirty | 3072;
        Function1<? super T, Unit> r10 = r27;
    L45:
        int r11 = r31 & 16;
        if (r11 == 0) goto L49;
        $dirty = $dirty | 24576;
        Function1<? super T, Unit> r12 = r28;
    L56:
        int $dirty2 = $dirty;
        if (($dirty2 & 9363) == 9362) goto L59;
        boolean r2 = true;
    L61:
        if ($composer2.shouldExecute(r2, $dirty2 & 1) == false) goto L97;
        if (r3 == 0) goto L64;
        final Modifier.Companion modifier2 = Modifier.Companion;
    L65:
        if (r5 == 0) goto L67;
        final Function1<? super T, Unit> r6 = null;
    L68:
        if (r9 == 0) goto L70;
        r10 = NoOpUpdate;
    L70:
        if (r11 == 0) goto L73;
        r12 = NoOpUpdate;
    L73:
        if (ComposerKt.isTraceInProgress() == false) goto L75;
        ComposerKt.traceEventStart(-180024211, $dirty2, -1, "androidx.compose.ui.viewinterop.AndroidView (AndroidView.android.kt:199)");
    L75:
        int compositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash($composer2, 0);
        Modifier materializedModifier = ComposedModifierKt.materializeModifier($composer2, FocusGroupNode_androidKt.focusInteropModifier(modifier2));
        ProvidableCompositionLocal<Density> r0 = CompositionLocalsKt.getLocalDensity();
        ComposerKt.sourceInformationMarkerStart($composer2, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
        Object r13 = $composer2.consume(r0);
        ComposerKt.sourceInformationMarkerEnd($composer2);
        Density density = (Density) r13;
        ProvidableCompositionLocal<LayoutDirection> r1 = CompositionLocalsKt.getLocalLayoutDirection();
        ComposerKt.sourceInformationMarkerStart($composer2, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
        Object r14 = $composer2.consume(r1);
        ComposerKt.sourceInformationMarkerEnd($composer2);
        LayoutDirection layoutDirection = (LayoutDirection) r14;
        CompositionLocalMap compositionLocalMap = $composer2.getCurrentCompositionLocalMap();
        ProvidableCompositionLocal<LifecycleOwner> r8 = LocalLifecycleOwnerKt.getLocalLifecycleOwner();
        ComposerKt.sourceInformationMarkerStart($composer2, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
        Object r15 = $composer2.consume(r8);
        ComposerKt.sourceInformationMarkerEnd($composer2);
        LifecycleOwner lifecycleOwner = (LifecycleOwner) r15;
        ProvidableCompositionLocal<SavedStateRegistryOwner> r16 = AndroidCompositionLocals_androidKt.getLocalSavedStateRegistryOwner();
        ComposerKt.sourceInformationMarkerStart($composer2, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
        Object r17 = $composer2.consume(r16);
        ComposerKt.sourceInformationMarkerEnd($composer2);
        SavedStateRegistryOwner savedStateRegistryOwner = (SavedStateRegistryOwner) r17;
        if (r6 == null) goto L85;
        $composer2.startReplaceGroup(607780130);
        ComposerKt.sourceInformation($composer2, "215@12700L37,214@12634L843");
        Function0<LayoutNode> r18 = createAndroidViewNodeFactory(r24, $composer2, $dirty2 & 14);
        ComposerKt.sourceInformationMarkerStart($composer2, 1405779621, "CC(ReusableComposeNode):Composables.kt#9igjgp");
        if (($composer2.getApplier() instanceof UiApplier) == true) goto L80;
        ComposablesKt.invalidApplier();
    L80:
        $composer2.startReusableNode();
        if ($composer2.getInserting() == false) goto L83;
        $composer2.createNode(r18);
    L84:
        Composer $this$AndroidView_u24lambda_u240 = Updater.m3808constructorimpl($composer2);
        m7223updateViewHolderParams6NefGtU($this$AndroidView_u24lambda_u240, materializedModifier, compositeKeyHash, density, lifecycleOwner, savedStateRegistryOwner, layoutDirection, compositionLocalMap);
        Updater.m3815setimpl($this$AndroidView_u24lambda_u240, r6, AndroidView_androidKt$AndroidView$2$1.INSTANCE);
        Updater.m3815setimpl($this$AndroidView_u24lambda_u240, r12, AndroidView_androidKt$AndroidView$2$2.INSTANCE);
        Updater.m3815setimpl($this$AndroidView_u24lambda_u240, r10, AndroidView_androidKt$AndroidView$2$3.INSTANCE);
        $composer2.endNode();
        ComposerKt.sourceInformationMarkerEnd($composer2);
        $composer2.endReplaceGroup();
    L94:
        if (ComposerKt.isTraceInProgress() == false) goto L96;
        ComposerKt.traceEventEnd();
    L96:
        final Function1<? super T, Unit> r19 = r10;
        final Function1<? super T, Unit> r20 = r12;
    L98:
        ScopeUpdateScope r21 = $composer2.endRestartGroup();
        if (r21 == null) goto L102;
        r21.updateScope(new AnonymousClass4(r24, modifier2, r6, r19, r20, $changed, r31));
        return;
    L102:
        return;
    L83:
        $composer2.useNode();
        goto L84
    L85:
        $composer2.startReplaceGroup(608635513);
        ComposerKt.sourceInformation($composer2, "233@13557L37,232@13499L756");
        Function0<LayoutNode> r22 = createAndroidViewNodeFactory(r24, $composer2, $dirty2 & 14);
        ComposerKt.sourceInformationMarkerStart($composer2, 1886828752, "CC(ComposeNode):Composables.kt#9igjgp");
        if (($composer2.getApplier() instanceof UiApplier) == true) goto L88;
        ComposablesKt.invalidApplier();
    L88:
        $composer2.startNode();
        if ($composer2.getInserting() == false) goto L91;
        $composer2.createNode(r22);
    L92:
        Composer $this$AndroidView_u24lambda_u241 = Updater.m3808constructorimpl($composer2);
        m7223updateViewHolderParams6NefGtU($this$AndroidView_u24lambda_u241, materializedModifier, compositeKeyHash, density, lifecycleOwner, savedStateRegistryOwner, layoutDirection, compositionLocalMap);
        Updater.m3815setimpl($this$AndroidView_u24lambda_u241, r12, AndroidView_androidKt$AndroidView$3$1.INSTANCE);
        Updater.m3815setimpl($this$AndroidView_u24lambda_u241, r10, AndroidView_androidKt$AndroidView$3$2.INSTANCE);
        $composer2.endNode();
        ComposerKt.sourceInformationMarkerEnd($composer2);
        $composer2.endReplaceGroup();
        goto L94
    L91:
        $composer2.useNode();
        goto L92
    L67:
        r6 = r7;
        goto L68
    L64:
        modifier2 = r4;
        goto L65
    L97:
        $composer2.skipToGroupEnd();
        modifier2 = r4;
        r6 = r7;
        r19 = r10;
        r20 = r12;
        goto L98
    L59:
        r2 = false;
        goto L61
    L49:
        if (($changed & 24576) != 0) goto L55;
        r12 = r28;
        if ($composer2.changedInstance(r12) == false) goto L53;
        int r110 = 16384;
    L54:
        $dirty = $dirty | r110;
        goto L56
    L53:
        r110 = 8192;
        goto L54
    L55:
        r12 = r28;
        goto L56
    L38:
        if (($changed & 3072) != 0) goto L44;
        r10 = r27;
        if ($composer2.changedInstance(r10) == false) goto L42;
        int r111 = 2048;
    L43:
        $dirty = $dirty | r111;
        goto L45
    L42:
        r111 = 1024;
        goto L43
    L44:
        r10 = r27;
        goto L45
    L27:
        if (($changed & 384) != 0) goto L33;
        r7 = r26;
        if ($composer2.changedInstance(r7) == false) goto L31;
        int r23 = 256;
    L32:
        $dirty = $dirty | r23;
        goto L34
    L31:
        r23 = 128;
        goto L32
    L33:
        r7 = r26;
        goto L34
    L16:
        if (($changed & 48) != 0) goto L22;
        r4 = modifier;
        if ($composer2.changed(r4) == false) goto L20;
        int r25 = 32;
    L21:
        $dirty = $dirty | r25;
        goto L23
    L20:
        r25 = 16;
        goto L21
    L22:
        r4 = modifier;
        goto L23
    L6:
        if (($changed & 6) != 0) goto L12;
        if ($composer2.changedInstance(r24) == false) goto L10;
        int r29 = 4;
    L11:
        $dirty = $dirty | r29;
        goto L12
    L10:
        r29 = 2;
        goto L11
    }

    private static final <T extends View> Function0<LayoutNode> createAndroidViewNodeFactory(final Function1<? super Context, ? extends T> r13, Composer $composer, int $changed) {
        ComposerKt.sourceInformationMarkerStart($composer, 2030558801, "C(createAndroidViewNodeFactory)253@14401L23,254@14456L7,255@14490L28,256@14570L7,257@14608L7,259@14628L338:AndroidView.android.kt#z33iqn");
        if (ComposerKt.isTraceInProgress() == false) goto L5;
        ComposerKt.traceEventStart(2030558801, $changed, -1, "androidx.compose.ui.viewinterop.createAndroidViewNodeFactory (AndroidView.android.kt:252)");
    L5:
        boolean r0 = false;
        final int compositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash($composer, 0);
        ProvidableCompositionLocal<Context> r1 = AndroidCompositionLocals_androidKt.getLocalContext();
        ComposerKt.sourceInformationMarkerStart($composer, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
        Object r7 = $composer.consume(r1);
        ComposerKt.sourceInformationMarkerEnd($composer);
        final Context context = (Context) r7;
        final CompositionContext parentReference = ComposablesKt.rememberCompositionContext($composer, 0);
        ProvidableCompositionLocal<SaveableStateRegistry> r3 = SaveableStateRegistryKt.getLocalSaveableStateRegistry();
        ComposerKt.sourceInformationMarkerStart($composer, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
        Object r9 = $composer.consume(r3);
        ComposerKt.sourceInformationMarkerEnd($composer);
        final SaveableStateRegistry stateRegistry = (SaveableStateRegistry) r9;
        ProvidableCompositionLocal<View> r8 = AndroidCompositionLocals_androidKt.getLocalView();
        ComposerKt.sourceInformationMarkerStart($composer, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
        Object r2 = $composer.consume(r8);
        ComposerKt.sourceInformationMarkerEnd($composer);
        final View ownerView = (View) r2;
        ComposerKt.sourceInformationMarkerStart($composer, -1137330319, "CC(remember):AndroidView.android.kt#9igjgp");
        boolean r4 = $composer.changedInstance(context);
        if ((($changed & 14) ^ 6) <= 4) goto L10;
        if ($composer.changed(r13) == false) goto L10;
    L11:
        r0 = true;
    L12:
        boolean invalid$iv = ((((r0 | r4) | $composer.changedInstance(parentReference)) | $composer.changedInstance(stateRegistry)) | $composer.changed(compositeKeyHash)) | $composer.changedInstance(ownerView);
        Object it$iv = $composer.rememberedValue();
        if (invalid$iv == false) goto L15;
    L18:
        Object value$iv = (Function0) new AndroidView_androidKt$createAndroidViewNodeFactory$1$1(context, r13, parentReference, stateRegistry, compositeKeyHash, ownerView);
        $composer.updateRememberedValue(value$iv);
        it$iv = value$iv;
    L19:
        Function0<LayoutNode> r10 = (Function0) it$iv;
        ComposerKt.sourceInformationMarkerEnd($composer);
        if (ComposerKt.isTraceInProgress() == false) goto L22;
        ComposerKt.traceEventEnd();
    L22:
        ComposerKt.sourceInformationMarkerEnd($composer);
        return r10;
    L15:
        if (it$iv != Composer.Companion.getEmpty()) goto L19;
    L10:
        if (($changed & 6) != 4) goto L12;
        goto L11
    }

    /* JADX INFO: renamed from: updateViewHolderParams-6NefGtU, reason: not valid java name */
    private static final <T extends View> void m7223updateViewHolderParams6NefGtU(Composer $this$updateViewHolderParams_u2d6NefGtU, Modifier modifier, int compositeKeyHash, Density density, LifecycleOwner lifecycleOwner, SavedStateRegistryOwner savedStateRegistryOwner, LayoutDirection layoutDirection, CompositionLocalMap compositionLocalMap) {
        Updater.m3815setimpl($this$updateViewHolderParams_u2d6NefGtU, compositionLocalMap, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
        Updater.m3815setimpl($this$updateViewHolderParams_u2d6NefGtU, modifier, AndroidView_androidKt$updateViewHolderParams$1.INSTANCE);
        Updater.m3815setimpl($this$updateViewHolderParams_u2d6NefGtU, density, AndroidView_androidKt$updateViewHolderParams$2.INSTANCE);
        Updater.m3815setimpl($this$updateViewHolderParams_u2d6NefGtU, lifecycleOwner, AndroidView_androidKt$updateViewHolderParams$3.INSTANCE);
        Updater.m3815setimpl($this$updateViewHolderParams_u2d6NefGtU, savedStateRegistryOwner, AndroidView_androidKt$updateViewHolderParams$4.INSTANCE);
        Updater.m3815setimpl($this$updateViewHolderParams_u2d6NefGtU, layoutDirection, AndroidView_androidKt$updateViewHolderParams$5.INSTANCE);
        Function2<ComposeUiNode, Integer, Unit> r0 = ComposeUiNode.Companion.getSetCompositeKeyHash();
        if ($this$updateViewHolderParams_u2d6NefGtU.getInserting() == false) goto L5;
    L6:
        $this$updateViewHolderParams_u2d6NefGtU.updateRememberedValue(Integer.valueOf(compositeKeyHash));
        $this$updateViewHolderParams_u2d6NefGtU.apply(Integer.valueOf(compositeKeyHash), r0);
        return;
    L5:
        if (Intrinsics.areEqual($this$updateViewHolderParams_u2d6NefGtU.rememberedValue(), Integer.valueOf(compositeKeyHash)) == false) goto L6;
    }

    private static final <T extends View> ViewFactoryHolder<T> requireViewFactoryHolder(LayoutNode $this$requireViewFactoryHolder) {
        Object value$iv = $this$requireViewFactoryHolder.getInteropViewFactoryHolder$ui_release();
        if (value$iv != null) goto L5;
        InlineClassHelperKt.throwIllegalStateExceptionForNullCheck("Required value was null.");
        throw new KotlinNothingValueException();
    L5:
        return (ViewFactoryHolder) value$iv;
    }

    static {
        NoOpUpdate = AndroidView_androidKt$NoOpUpdate$1.INSTANCE;
    }

    public static final Function1<View, Unit> getNoOpUpdate() {
        return NoOpUpdate;
    }
}
