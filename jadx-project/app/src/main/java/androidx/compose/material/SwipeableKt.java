package androidx.compose.material;

import androidx.autofill.HintConstants;
import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.SpringSpec;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.saveable.RememberSaveableKt;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.input.nestedscroll.NestedScrollConnection;
import androidx.compose.ui.platform.InspectableValueKt;
import androidx.compose.ui.platform.InspectorInfo;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Swipeable.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u008c\u0001\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\"\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aP\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000b2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000b0\u000f2\u0018\u0010\u0010\u001a\u0014\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b0\u00112\u0006\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\u000bH\u0002\u001a$\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00152\u0006\u0010\f\u001a\u00020\u000b2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000b0\u000fH\u0002\u001aZ\u0010\u0016\u001a\b\u0012\u0004\u0012\u0002H\u00040\u0005\"\b\b\u0000\u0010\u0004*\u00020\u00172\u0006\u0010\u0018\u001a\u0002H\u00042\u000e\b\u0002\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u000b0\u001a2#\b\u0002\u0010\u001b\u001a\u001d\u0012\u0013\u0012\u0011H\u0004¢\u0006\f\b\u001d\u0012\b\b\u001e\u0012\u0004\b\b(\u001f\u0012\u0004\u0012\u00020 0\u001cH\u0007¢\u0006\u0002\u0010!\u001aI\u0010\"\u001a\b\u0012\u0004\u0012\u0002H\u00040\u0005\"\b\b\u0000\u0010\u0004*\u00020\u00172\u0006\u0010#\u001a\u0002H\u00042\u0012\u0010$\u001a\u000e\u0012\u0004\u0012\u0002H\u0004\u0012\u0004\u0012\u00020%0\u001c2\u000e\b\u0002\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u000b0\u001aH\u0001¢\u0006\u0002\u0010&\u001a-\u0010'\u001a\u0004\u0018\u00010\u000b\"\u0004\b\u0000\u0010\u0004*\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u0002H\u00040(2\u0006\u0010)\u001a\u0002H\u0004H\u0002¢\u0006\u0002\u0010*\u001a¶\u0001\u0010+\u001a\u00020,\"\u0004\b\u0000\u0010\u0004*\u00020,2\f\u0010)\u001a\b\u0012\u0004\u0012\u0002H\u00040\u00052\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u0002H\u00040(2\u0006\u0010-\u001a\u00020.2\b\b\u0002\u0010/\u001a\u00020 2\b\b\u0002\u00100\u001a\u00020 2\n\b\u0002\u00101\u001a\u0004\u0018\u00010228\b\u0002\u0010\u0010\u001a2\u0012\u0013\u0012\u0011H\u0004¢\u0006\f\b\u001d\u0012\b\b\u001e\u0012\u0004\b\b(3\u0012\u0013\u0012\u0011H\u0004¢\u0006\f\b\u001d\u0012\b\b\u001e\u0012\u0004\b\b(4\u0012\u0004\u0012\u0002050\u00112\n\b\u0002\u00106\u001a\u0004\u0018\u0001072\b\b\u0002\u0010\u0013\u001a\u000208H\u0007ø\u0001\u0000¢\u0006\u0004\b9\u0010:\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"*\u0010\u0002\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0004*\b\u0012\u0004\u0012\u0002H\u00040\u00058@X\u0081\u0004¢\u0006\f\u0012\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006;"}, d2 = {"SwipeableDeprecation", "", "PreUpPostDownNestedScrollConnection", "Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;", "T", "Landroidx/compose/material/SwipeableState;", "getPreUpPostDownNestedScrollConnection$annotations", "(Landroidx/compose/material/SwipeableState;)V", "getPreUpPostDownNestedScrollConnection", "(Landroidx/compose/material/SwipeableState;)Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;", "computeTarget", "", "offset", "lastValue", "anchors", "", "thresholds", "Lkotlin/Function2;", "velocity", "velocityThreshold", "findBounds", "", "rememberSwipeableState", "", "initialValue", "animationSpec", "Landroidx/compose/animation/core/AnimationSpec;", "confirmStateChange", "Lkotlin/Function1;", "Lkotlin/ParameterName;", HintConstants.AUTOFILL_HINT_NAME, "newValue", "", "(Ljava/lang/Object;Landroidx/compose/animation/core/AnimationSpec;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)Landroidx/compose/material/SwipeableState;", "rememberSwipeableStateFor", "value", "onValueChange", "", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Landroidx/compose/animation/core/AnimationSpec;Landroidx/compose/runtime/Composer;II)Landroidx/compose/material/SwipeableState;", "getOffset", "", "state", "(Ljava/util/Map;Ljava/lang/Object;)Ljava/lang/Float;", "swipeable", "Landroidx/compose/ui/Modifier;", "orientation", "Landroidx/compose/foundation/gestures/Orientation;", "enabled", "reverseDirection", "interactionSource", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "from", "to", "Landroidx/compose/material/ThresholdConfig;", "resistance", "Landroidx/compose/material/ResistanceConfig;", "Landroidx/compose/ui/unit/Dp;", "swipeable-pPrIpRY", "(Landroidx/compose/ui/Modifier;Landroidx/compose/material/SwipeableState;Ljava/util/Map;Landroidx/compose/foundation/gestures/Orientation;ZZLandroidx/compose/foundation/interaction/MutableInteractionSource;Lkotlin/jvm/functions/Function2;Landroidx/compose/material/ResistanceConfig;F)Landroidx/compose/ui/Modifier;", "material_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class SwipeableKt {
    private static final String SwipeableDeprecation = "Material's Swipeable has been replaced by Foundation's AnchoredDraggable APIs. Please see developer.android.com for an overview of the changes and a migration guide.";

    public static final /* synthetic */ float access$computeTarget(float offset, float lastValue, Set anchors, Function2 thresholds, float velocity, float velocityThreshold) {
        return computeTarget(offset, lastValue, anchors, thresholds, velocity, velocityThreshold);
    }

    public static final /* synthetic */ List access$findBounds(float offset, Set anchors) {
        return findBounds(offset, anchors);
    }

    public static final /* synthetic */ Float access$getOffset(Map $receiver, Object state) {
        return getOffset($receiver, state);
    }

    public static /* synthetic */ void getPreUpPostDownNestedScrollConnection$annotations(SwipeableState r0) {
    }

    @Deprecated(message = SwipeableDeprecation)
    public static final <T> SwipeableState<T> rememberSwipeableState(final T r9, final AnimationSpec r10, final Function1 r11, Composer $composer, int $changed, int r14) {
        ComposerKt.sourceInformationMarkerStart($composer, -1237755169, "C(rememberSwipeableState)P(2)473@19770L177,467@19579L368:Swipeable.kt#jmzs0o");
        if ((r14 & 2) == 0) goto L6;
        AnimationSpec animationSpec = SwipeableDefaults.INSTANCE.getAnimationSpec();
        r10 = animationSpec;
    L6:
        if ((r14 & 4) == 0) goto L9;
        Function1 confirmStateChange = AnonymousClass1.INSTANCE;
        r11 = confirmStateChange;
    L9:
        if (ComposerKt.isTraceInProgress() == false) goto L11;
        ComposerKt.traceEventStart(-1237755169, $changed, -1, "androidx.compose.material.rememberSwipeableState (Swipeable.kt:466)");
    L11:
        boolean r15 = false;
        Object[] r2 = new Object[0];
        Saver<SwipeableState<T>, T> r3 = SwipeableState.Companion.Saver(r10, r11);
        ComposerKt.sourceInformationMarkerStart($composer, -400378751, "CC(remember):Swipeable.kt#9igjgp");
        if ((($changed & 14) ^ 6) <= 4) goto L16;
        if ($composer.changedInstance(r9) == false) goto L16;
    L17:
        boolean r0 = true;
    L19:
        boolean r1 = r0 | $composer.changedInstance(r10);
        if ((($changed & 896) ^ 384) <= 256) goto L24;
        if ($composer.changed(r11) == false) goto L24;
    L25:
        r15 = true;
    L26:
        boolean invalid$iv = r15 | r1;
        Object it$iv = $composer.rememberedValue();
        if (invalid$iv == false) goto L29;
    L32:
        Object value$iv = (Function0) new SwipeableKt$rememberSwipeableState$2$1(r9, r10, r11);
        $composer.updateRememberedValue(value$iv);
        it$iv = value$iv;
    L33:
        ComposerKt.sourceInformationMarkerEnd($composer);
        SwipeableState<T> r12 = (SwipeableState) RememberSaveableKt.m3923rememberSaveable(r2, r3, null, (Function0) it$iv, $composer, 0, 4);
        if (ComposerKt.isTraceInProgress() == false) goto L36;
        ComposerKt.traceEventEnd();
    L36:
        ComposerKt.sourceInformationMarkerEnd($composer);
        return r12;
    L29:
        if (it$iv != Composer.Companion.getEmpty()) goto L33;
    L24:
        if (($changed & 384) != 256) goto L26;
    L16:
        if (($changed & 6) == 4) goto L17;
        r0 = false;
        goto L19
    }

    @Deprecated(message = SwipeableDeprecation)
    public static final <T> SwipeableState<T> rememberSwipeableStateFor(final T r17, final Function1<? super T, Unit> r18, AnimationSpec<Float> r19, Composer $composer, int $changed, int r22) {
        ComposerKt.sourceInformationMarkerStart($composer, 1156387078, "C(rememberSwipeableStateFor)P(2,1)498@20808L169,505@21008L34,506@21096L113,506@21047L162,511@21260L212,511@21214L258:Swipeable.kt#jmzs0o");
        if ((r22 & 4) == 0) goto L5;
        SpringSpec<Float> r6 = SwipeableDefaults.INSTANCE.getAnimationSpec();
    L7:
        if (ComposerKt.isTraceInProgress() == false) goto L9;
        ComposerKt.traceEventStart(1156387078, $changed, -1, "androidx.compose.material.rememberSwipeableStateFor (Swipeable.kt:497)");
    L9:
        ComposerKt.sourceInformationMarkerStart($composer, 2132124034, "CC(remember):Swipeable.kt#9igjgp");
        Object it$iv = $composer.rememberedValue();
        if (it$iv != Composer.Companion.getEmpty()) goto L13;
        Object value$iv = new SwipeableState(r17, r6, SwipeableKt$rememberSwipeableStateFor$swipeableState$1$1.INSTANCE);
        $composer.updateRememberedValue(value$iv);
        it$iv = value$iv;
    L13:
        final SwipeableState<T> r4 = (SwipeableState) it$iv;
        ComposerKt.sourceInformationMarkerEnd($composer);
        ComposerKt.sourceInformationMarkerStart($composer, 2132130299, "CC(remember):Swipeable.kt#9igjgp");
        Object it$iv2 = $composer.rememberedValue();
        if (it$iv2 != Composer.Companion.getEmpty()) goto L16;
        boolean r110 = false;
        Object value$iv2 = SnapshotStateKt.mutableStateOf$default(false, null, 2, null);
        $composer.updateRememberedValue(value$iv2);
        it$iv2 = value$iv2;
    L17:
        final MutableState forceAnimationCheck = (MutableState) it$iv2;
        ComposerKt.sourceInformationMarkerEnd($composer);
        Object r8 = forceAnimationCheck.getValue();
        ComposerKt.sourceInformationMarkerStart($composer, 2132133194, "CC(remember):Swipeable.kt#9igjgp");
        if ((($changed & 14) ^ 6) <= 4) goto L22;
        if ($composer.changedInstance(r17) == false) goto L22;
    L23:
        boolean invalid$iv = true;
    L25:
        Object it$iv3 = $composer.rememberedValue();
        if (invalid$iv == false) goto L28;
    L31:
        Object value$iv3 = (Function2) new SwipeableKt$rememberSwipeableStateFor$1$1(r17, r4, null);
        $composer.updateRememberedValue(value$iv3);
        it$iv3 = value$iv3;
    L32:
        ComposerKt.sourceInformationMarkerEnd($composer);
        EffectsKt.LaunchedEffect(r17, r8, (Function2) it$iv3, $composer, ($changed & 8) | ($changed & 14));
        T r3 = r4.getCurrentValue();
        ComposerKt.sourceInformationMarkerStart($composer, 2132138541, "CC(remember):Swipeable.kt#9igjgp");
        if ((($changed & 14) ^ 6) <= 4) goto L37;
        if ($composer.changedInstance(r17) == false) goto L37;
    L38:
        boolean r7 = true;
    L41:
        if ((($changed & 112) ^ 48) <= 32) goto L45;
        if ($composer.changed(r18) == false) goto L45;
    L46:
        boolean r15 = true;
    L48:
        boolean invalid$iv2 = r7 | r15;
        Object it$iv4 = $composer.rememberedValue();
        if (invalid$iv2 == false) goto L51;
    L54:
        Object value$iv4 = (Function1) new SwipeableKt$rememberSwipeableStateFor$2$1(r17, r4, r18, forceAnimationCheck);
        $composer.updateRememberedValue(value$iv4);
        it$iv4 = value$iv4;
    L55:
        ComposerKt.sourceInformationMarkerEnd($composer);
        EffectsKt.DisposableEffect(r3, (Function1) it$iv4, $composer, $changed & 8);
        if (ComposerKt.isTraceInProgress() == false) goto L58;
        ComposerKt.traceEventEnd();
    L58:
        ComposerKt.sourceInformationMarkerEnd($composer);
        return r4;
    L51:
        if (it$iv4 != Composer.Companion.getEmpty()) goto L55;
    L45:
        if (($changed & 48) == 32) goto L46;
        r15 = r110;
    L37:
        if (($changed & 6) == 4) goto L38;
        r7 = r110;
        goto L41
    L28:
        if (it$iv3 != Composer.Companion.getEmpty()) goto L32;
    L22:
        if (($changed & 6) == 4) goto L23;
        invalid$iv = r110;
        goto L25
    L16:
        r110 = false;
        goto L17
    L5:
        r6 = r19;
        goto L7
    }

    /* JADX INFO: renamed from: swipeable-pPrIpRY$default, reason: not valid java name */
    public static /* synthetic */ Modifier m1793swipeablepPrIpRY$default(Modifier r16, SwipeableState r17, Map r18, Orientation r19, boolean r20, boolean r21, MutableInteractionSource r22, Function2 r23, ResistanceConfig r24, float r25, int r26, Object r27) {
        if ((r26 & 8) == 0) goto L5;
        boolean r6 = true;
    L7:
        if ((r26 & 16) == 0) goto L9;
        boolean r7 = false;
    L11:
        if ((r26 & 32) == 0) goto L13;
        MutableInteractionSource r8 = null;
    L15:
        if ((r26 & 64) == 0) goto L17;
        Function2 r9 = SwipeableKt$swipeable$1.INSTANCE;
    L19:
        if ((r26 & 128) == 0) goto L21;
        ResistanceConfig r10 = SwipeableDefaults.resistanceConfig$default(SwipeableDefaults.INSTANCE, r18.keySet(), 0.0f, 0.0f, 6, null);
    L23:
        if ((r26 & 256) == 0) goto L25;
        float r11 = SwipeableDefaults.INSTANCE.m1791getVelocityThresholdD9Ej5fM();
    L27:
        return m1792swipeablepPrIpRY(r16, r17, r18, r19, r6, r7, r8, r9, r10, r11);
    L25:
        r11 = r25;
        goto L27
    L21:
        r10 = r24;
        goto L23
    L17:
        r9 = r23;
        goto L19
    L13:
        r8 = r22;
        goto L15
    L9:
        r7 = r21;
        goto L11
    L5:
        r6 = r20;
        goto L7
    }

    @Deprecated(message = SwipeableDeprecation)
    /* JADX INFO: renamed from: swipeable-pPrIpRY, reason: not valid java name */
    public static final <T> Modifier m1792swipeablepPrIpRY(Modifier $this$swipeable_u2dpPrIpRY, final SwipeableState<T> r14, final Map<Float, ? extends T> r15, final Orientation orientation, final boolean enabled, final boolean reverseDirection, final MutableInteractionSource interactionSource, final Function2<? super T, ? super T, ? extends ThresholdConfig> r20, final ResistanceConfig resistance, final float velocityThreshold) {
        if (InspectableValueKt.isDebugInspectorInfoEnabled() == false) goto L5;
        Function1<InspectorInfo, Unit> r2 = new SwipeableKt$swipeablepPrIpRY$$inlined$debugInspectorInfo$1(r14, r15, orientation, enabled, reverseDirection, interactionSource, r20, resistance, velocityThreshold);
    L7:
        return ComposedModifierKt.composed($this$swipeable_u2dpPrIpRY, r2, new SwipeableKt$swipeable$3(r15, r14, resistance, r20, velocityThreshold, orientation, enabled, interactionSource, reverseDirection));
    L5:
        r2 = InspectableValueKt.getNoInspectorInfo();
        goto L7
    }

    private static final List<Float> findBounds(float offset, Set<Float> r21) {
        Set<Float> $this$filter$iv = r21;
        Collection destination$iv$iv = new ArrayList();
        Iterator r6 = $this$filter$iv.iterator();
    L4:
        if (r6.hasNext() == false) goto L11;
        Object element$iv$iv = r6.next();
        float it = ((Number) element$iv$iv).floatValue();
        if (it > (((double) offset) + 0.001d)) goto L8;
        boolean r10 = true;
    L9:
        if (r10 == false) goto L4;
        destination$iv$iv.add(element$iv$iv);
        goto L4
    L8:
        r10 = false;
        goto L9
    L11:
        List $this$fastMaxBy$iv = (List) destination$iv$iv;
        Object minElem$iv = null;
        if ($this$fastMaxBy$iv.isEmpty() == false) goto L14;
        Object maxElem$iv = null;
    L22:
        Float a = (Float) maxElem$iv;
        Set<Float> $this$filter$iv2 = r21;
        Collection destination$iv$iv2 = new ArrayList();
        Iterator r8 = $this$filter$iv2.iterator();
    L24:
        if (r8.hasNext() == false) goto L32;
        Object element$iv$iv2 = r8.next();
        float it2 = ((Number) element$iv$iv2).floatValue();
        if (it2 < (((double) offset) - 0.001d)) goto L28;
        boolean r11 = true;
    L29:
        if (r11 == false) goto L24;
        destination$iv$iv2.add(element$iv$iv2);
        goto L24
    L28:
        r11 = false;
        goto L29
    L32:
        List $this$fastMinByOrNull$iv = (List) destination$iv$iv2;
        if ($this$fastMinByOrNull$iv.isEmpty() == true) goto L43;
        minElem$iv = $this$fastMinByOrNull$iv.get(0);
        float minValue$iv = ((Number) minElem$iv).floatValue();
        int i$iv = 1;
        int r7 = CollectionsKt.getLastIndex($this$fastMinByOrNull$iv);
        if (1 > r7) goto L43;
    L37:
        Object e$iv = $this$fastMinByOrNull$iv.get(i$iv);
        float v$iv = ((Number) e$iv).floatValue();
        if (Float.compare(minValue$iv, v$iv) <= 0) goto L40;
        minElem$iv = e$iv;
        minValue$iv = v$iv;
    L40:
        if (i$iv == r7) goto L43;
        i$iv = i$iv + 1;
    L43:
        Float b = (Float) minElem$iv;
        if (a == null) goto L63;
        if (b != null) goto L49;
        return CollectionsKt.listOf(a);
    L49:
        if (Intrinsics.areEqual(a, b) == false) goto L52;
        return CollectionsKt.listOf(a);
    L52:
        return CollectionsKt.listOf(new Float[]{a, b});
    L63:
        return CollectionsKt.listOfNotNull(b);
    L14:
        maxElem$iv = $this$fastMaxBy$iv.get(0);
        float maxValue$iv = ((Number) maxElem$iv).floatValue();
        int i$iv2 = 1;
        int r9 = CollectionsKt.getLastIndex($this$fastMaxBy$iv);
        if (1 > r9) goto L22;
    L16:
        Object e$iv2 = $this$fastMaxBy$iv.get(i$iv2);
        float v$iv2 = ((Number) e$iv2).floatValue();
        if (Float.compare(maxValue$iv, v$iv2) >= 0) goto L19;
        maxElem$iv = e$iv2;
        maxValue$iv = v$iv2;
    L19:
        if (i$iv2 == r9) goto L22;
        i$iv2 = i$iv2 + 1;
        goto L16
    }

    private static final float computeTarget(float offset, float lastValue, Set<Float> r7, Function2<? super Float, ? super Float, Float> r8, float velocity, float velocityThreshold) {
        List<Float> r0 = findBounds(offset, r7);
        switch(r0.size()) {
            case 0: goto L23;
            case 1: goto L22;
            default: goto L4;
        };
    L4:
        float lower = r0.get(0).floatValue();
        float upper = r0.get(1).floatValue();
        if (lastValue > offset) goto L16;
        if (velocity < velocityThreshold) goto L11;
        return upper;
    L11:
        float threshold = r8.invoke(Float.valueOf(lower), Float.valueOf(upper)).floatValue();
        if (offset >= threshold) goto L21;
        return lower;
    L21:
        return upper;
    L16:
        if (velocity > (-velocityThreshold)) goto L18;
        return lower;
    L18:
        float threshold2 = r8.invoke(Float.valueOf(upper), Float.valueOf(lower)).floatValue();
        if (offset > threshold2) goto L21;
        return lower;
    L22:
        return r0.get(0).floatValue();
    L23:
        return lastValue;
    }

    private static final <T> Float getOffset(Map<Float, ? extends T> r8, T r9) {
        Iterable $this$firstOrNull$iv = r8.entrySet();
        Iterator<T> r2 = $this$firstOrNull$iv.iterator();
    L4:
        if (r2.hasNext() == false) goto L8;
        Object element$iv = r2.next();
        Map.Entry it = (Map.Entry) element$iv;
        if (Intrinsics.areEqual(it.getValue(), r9) == false) goto L4;
    L9:
        Map.Entry r3 = (Map.Entry) element$iv;
        if (r3 != null) goto L12;
        return null;
    L12:
        return (Float) r3.getKey();
    L8:
        element$iv = null;
        goto L9
    }

    public static final <T> NestedScrollConnection getPreUpPostDownNestedScrollConnection(SwipeableState<T> r1) {
        return new SwipeableKt$PreUpPostDownNestedScrollConnection$1(r1);
    }
}
