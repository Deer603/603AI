package androidx.compose.animation;

import androidx.autofill.HintConstants;
import androidx.collection.MutableScatterMap;
import androidx.collection.ScatterMapKt;
import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.animation.core.Transition;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.profileinstaller.ProfileVerifier;
import java.util.Iterator;
import java.util.List;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: AnimatedContent.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000z\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a´\u0001\u0010\u0003\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u00052\u0006\u0010\u0006\u001a\u0002H\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\u001f\b\u0002\u0010\t\u001a\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00050\u000b\u0012\u0004\u0012\u00020\f0\n¢\u0006\u0002\b\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112%\b\u0002\u0010\u0012\u001a\u001f\u0012\u0013\u0012\u0011H\u0005¢\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00150\n21\u0010\u0016\u001a-\u0012\u0004\u0012\u00020\u0018\u0012\u0013\u0012\u0011H\u0005¢\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\u0006\u0012\u0004\u0012\u00020\u00040\u0017¢\u0006\u0002\b\u0019¢\u0006\u0002\b\rH\u0007¢\u0006\u0002\u0010\u001a\u001aP\u0010\u001b\u001a\u00020\u001c2\b\b\u0002\u0010\u001d\u001a\u00020\u001e2>\b\u0002\u0010\u001f\u001a8\u0012\u0013\u0012\u00110\u0001¢\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b( \u0012\u0013\u0012\u00110\u0001¢\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(!\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\"0\u0017\u001a¬\u0001\u0010\u0003\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0005*\b\u0012\u0004\u0012\u0002H\u00050#2\b\b\u0002\u0010\u0007\u001a\u00020\b2\u001f\b\u0002\u0010\t\u001a\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00050\u000b\u0012\u0004\u0012\u00020\f0\n¢\u0006\u0002\b\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2%\b\u0002\u0010\u0012\u001a\u001f\u0012\u0013\u0012\u0011H\u0005¢\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00150\n21\u0010\u0016\u001a-\u0012\u0004\u0012\u00020\u0018\u0012\u0013\u0012\u0011H\u0005¢\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\u0006\u0012\u0004\u0012\u00020\u00040\u0017¢\u0006\u0002\b\u0019¢\u0006\u0002\b\rH\u0007¢\u0006\u0002\u0010$\u001a\u0015\u0010%\u001a\u00020\f*\u00020&2\u0006\u0010'\u001a\u00020(H\u0086\u0004\u001a\u0015\u0010)\u001a\u00020\f*\u00020&2\u0006\u0010'\u001a\u00020(H\u0087\u0004\"\u0010\u0010\u0000\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0002¨\u0006*"}, d2 = {"UnspecifiedSize", "Landroidx/compose/ui/unit/IntSize;", "J", "AnimatedContent", "", "S", "targetState", "modifier", "Landroidx/compose/ui/Modifier;", "transitionSpec", "Lkotlin/Function1;", "Landroidx/compose/animation/AnimatedContentTransitionScope;", "Landroidx/compose/animation/ContentTransform;", "Lkotlin/ExtensionFunctionType;", "contentAlignment", "Landroidx/compose/ui/Alignment;", "label", "", "contentKey", "Lkotlin/ParameterName;", HintConstants.AUTOFILL_HINT_NAME, "", "content", "Lkotlin/Function2;", "Landroidx/compose/animation/AnimatedContentScope;", "Landroidx/compose/runtime/Composable;", "(Ljava/lang/Object;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Alignment;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function4;Landroidx/compose/runtime/Composer;II)V", "SizeTransform", "Landroidx/compose/animation/SizeTransform;", "clip", "", "sizeAnimationSpec", "initialSize", "targetSize", "Landroidx/compose/animation/core/FiniteAnimationSpec;", "Landroidx/compose/animation/core/Transition;", "(Landroidx/compose/animation/core/Transition;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Alignment;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function4;Landroidx/compose/runtime/Composer;II)V", "togetherWith", "Landroidx/compose/animation/EnterTransition;", "exit", "Landroidx/compose/animation/ExitTransition;", "with", "animation_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class AnimatedContentKt {
    private static final long UnspecifiedSize = 0;

    public static final /* synthetic */ long access$getUnspecifiedSize$p() {
        return UnspecifiedSize;
    }

    public static final <S> void AnimatedContent(final S r19, Modifier modifier, Function1<? super AnimatedContentTransitionScope<S>, ContentTransform> r21, Alignment contentAlignment, String label, Function1<? super S, ? extends Object> r24, final Function4<? super AnimatedContentScope, ? super S, ? super Composer, ? super Integer, Unit> r25, Composer $composer, final int $changed, final int r28) {
        Composer $composer2 = $composer.startRestartGroup(2132720749);
        ComposerKt.sourceInformation($composer2, "C(AnimatedContent)P(5,4,6,1,3,2)141@7609L58,142@7683L136:AnimatedContent.kt#xbi5r1");
        int $dirty = $changed;
        if ((r28 & 1) == 0) goto L6;
        $dirty = $dirty | 6;
    L15:
        int r3 = r28 & 2;
        if (r3 == 0) goto L19;
        $dirty = $dirty | 48;
    L26:
        int r5 = r28 & 4;
        if (r5 == 0) goto L30;
        $dirty = $dirty | 384;
        Function1<? super AnimatedContentTransitionScope<S>, ContentTransform> r6 = r21;
    L37:
        int r7 = r28 & 8;
        if (r7 == 0) goto L41;
        $dirty = $dirty | 3072;
        Alignment r9 = contentAlignment;
    L48:
        int r10 = r28 & 16;
        if (r10 == 0) goto L52;
        $dirty = $dirty | 24576;
    L59:
        int r12 = r28 & 32;
        if (r12 == 0) goto L63;
        $dirty = $dirty | ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
        Function1<? super S, ? extends Object> r13 = r24;
    L71:
        if ((r28 & 64) == 0) goto L74;
        $dirty = $dirty | 1572864;
        Function4<? super AnimatedContentScope, ? super S, ? super Composer, ? super Integer, Unit> r14 = r25;
    L82:
        if (($dirty & 599187) == 599186) goto L84;
        boolean r0 = true;
    L86:
        if ($composer2.shouldExecute(r0, $dirty & 1) == false) goto L108;
        if (r3 == 0) goto L89;
        Modifier modifier2 = Modifier.Companion;
        int r1 = r10;
    L90:
        if (r5 == 0) goto L92;
        Function1<? super AnimatedContentTransitionScope<S>, ContentTransform> r11 = AnonymousClass1.INSTANCE;
    L93:
        if (r7 == 0) goto L95;
        Alignment contentAlignment2 = Alignment.Companion.getTopStart();
        int r4 = r12;
    L96:
        if (r1 == 0) goto L98;
        String label2 = "AnimatedContent";
    L99:
        if (r4 == 0) goto L102;
        r13 = AnonymousClass2.INSTANCE;
    L102:
        if (ComposerKt.isTraceInProgress() == false) goto L104;
        ComposerKt.traceEventStart(2132720749, $dirty, -1, "androidx.compose.animation.AnimatedContent (AnimatedContent.kt:140)");
    L104:
        Transition transition = androidx.compose.animation.core.TransitionKt.updateTransition(r19, label2, $composer2, (($dirty & 8) | ($dirty & 14)) | (($dirty >> 9) & 112), 0);
        AnimatedContent(transition, modifier2, r11, contentAlignment2, r13, r14, $composer2, (((($dirty & 112) | ($dirty & 896)) | ($dirty & 7168)) | (($dirty >> 3) & 57344)) | (458752 & ($dirty >> 3)), 0);
        if (ComposerKt.isTraceInProgress() == false) goto L107;
        ComposerKt.traceEventEnd();
    L107:
        final String label3 = label2;
        final Function1<? super AnimatedContentTransitionScope<S>, ContentTransform> r8 = r11;
        final Alignment contentAlignment3 = contentAlignment2;
        final Function1<? super S, ? extends Object> r15 = r13;
    L109:
        ScopeUpdateScope r16 = $composer2.endRestartGroup();
        if (r16 == null) goto L113;
        final Modifier modifier3 = modifier2;
        r16.updateScope(new AnonymousClass3(r19, modifier3, r8, contentAlignment3, label3, r15, r25, $changed, r28));
        return;
    L113:
        return;
    L98:
        label2 = label;
        goto L99
    L95:
        r4 = r12;
        contentAlignment2 = r9;
        goto L96
    L92:
        r11 = r6;
        goto L93
    L89:
        r1 = r10;
        modifier2 = modifier;
        goto L90
    L108:
        $composer2.skipToGroupEnd();
        modifier2 = modifier;
        label3 = label;
        r8 = r6;
        contentAlignment3 = r9;
        r15 = r13;
        goto L109
    L84:
        r0 = false;
        goto L86
    L74:
        if (($changed & 1572864) != 0) goto L80;
        r14 = r25;
        if ($composer2.changedInstance(r14) == false) goto L78;
        int r17 = 1048576;
    L79:
        $dirty = $dirty | r17;
        goto L82
    L78:
        r17 = 524288;
        goto L79
    L80:
        r14 = r25;
        goto L82
    L63:
        if ((196608 & $changed) != 0) goto L69;
        r13 = r24;
        if ($composer2.changedInstance(r13) == false) goto L67;
        int r18 = 131072;
    L68:
        $dirty = $dirty | r18;
        goto L71
    L67:
        r18 = 65536;
        goto L68
    L69:
        r13 = r24;
        goto L71
    L52:
        if (($changed & 24576) != 0) goto L59;
        if ($composer2.changed(label) == false) goto L56;
        int r110 = 16384;
    L57:
        $dirty = $dirty | r110;
        goto L59
    L56:
        r110 = 8192;
        goto L57
    L41:
        if (($changed & 3072) != 0) goto L47;
        r9 = contentAlignment;
        if ($composer2.changed(r9) == false) goto L45;
        int r111 = 2048;
    L46:
        $dirty = $dirty | r111;
        goto L48
    L45:
        r111 = 1024;
        goto L46
    L47:
        r9 = contentAlignment;
        goto L48
    L30:
        if (($changed & 384) != 0) goto L36;
        r6 = r21;
        if ($composer2.changedInstance(r6) == false) goto L34;
        int r20 = 256;
    L35:
        $dirty = $dirty | r20;
        goto L37
    L34:
        r20 = 128;
        goto L35
    L36:
        r6 = r21;
        goto L37
    L19:
        if (($changed & 48) != 0) goto L26;
        if ($composer2.changed(modifier) == false) goto L23;
        int r22 = 32;
    L24:
        $dirty = $dirty | r22;
        goto L26
    L23:
        r22 = 16;
        goto L24
    L6:
        if (($changed & 6) != 0) goto L15;
        if (($changed & 8) != 0) goto L10;
        boolean r23 = $composer2.changed(r19);
    L11:
        if (r23 == false) goto L13;
        int r26 = 4;
    L14:
        $dirty = $dirty | r26;
        goto L15
    L13:
        r26 = 2;
        goto L14
    L10:
        r23 = $composer2.changedInstance(r19);
        goto L11
    }

    public static /* synthetic */ SizeTransform SizeTransform$default(boolean r0, C01601 r1, int r2, Object r3) {
        if ((r2 & 1) == 0) goto L6;
        r0 = true;
    L6:
        if ((r2 & 2) == 0) goto L9;
        r1 = C01601.INSTANCE;
    L9:
        return SizeTransform(r0, r1);
    }

    public static final SizeTransform SizeTransform(boolean clip, Function2<? super IntSize, ? super IntSize, ? extends FiniteAnimationSpec<IntSize>> r2) {
        return new SizeTransformImpl(clip, r2);
    }

    public static final ContentTransform togetherWith(EnterTransition $this$togetherWith, ExitTransition exit) {
        float r3 = 0.0f;
        SizeTransform r4 = null;
        return new ContentTransform($this$togetherWith, exit, r3, r4, 12, null);
    }

    @Deprecated(message = "Infix fun EnterTransition.with(ExitTransition) has been renamed to togetherWith", replaceWith = @ReplaceWith(expression = "togetherWith(exit)", imports = {}))
    public static final ContentTransform with(EnterTransition $this$with, ExitTransition exit) {
        float r3 = 0.0f;
        SizeTransform r4 = null;
        return new ContentTransform($this$with, exit, r3, r4, 12, null);
    }

    static {
        UnspecifiedSize = IntSize.m7139constructorimpl((((long) Integer.MIN_VALUE) << 32) | (((long) Integer.MIN_VALUE) & 4294967295L));
    }

    public static final <S> void AnimatedContent(final Transition<S> r29, Modifier modifier, Function1<? super AnimatedContentTransitionScope<S>, ContentTransform> r31, Alignment contentAlignment, Function1<? super S, ? extends Object> r33, final Function4<? super AnimatedContentScope, ? super S, ? super Composer, ? super Integer, Unit> r34, Composer $composer, final int $changed, final int r37) {
        Composer $composer2 = $composer.startRestartGroup(-114689412);
        ComposerKt.sourceInformation($composer2, "C(AnimatedContent)P(3,4,1,2)773@38528L7,775@38564L114,779@38766L51,780@38839L69,866@43373L58,867@43465L45,873@43720L52,868@43515L263:AnimatedContent.kt#xbi5r1");
        int $dirty = $changed;
        if ((r37 & Integer.MIN_VALUE) == 0) goto L6;
        $dirty = $dirty | 6;
    L12:
        int r3 = r37 & 1;
        if (r3 == 0) goto L16;
        $dirty = $dirty | 48;
        Modifier r5 = modifier;
    L23:
        int r6 = r37 & 2;
        if (r6 == 0) goto L27;
        $dirty = $dirty | 384;
        Function1<? super AnimatedContentTransitionScope<S>, ContentTransform> r8 = r31;
    L34:
        int r10 = r37 & 4;
        if (r10 == 0) goto L38;
        $dirty = $dirty | 3072;
        Alignment contentAlignment2 = contentAlignment;
    L45:
        int r12 = r37 & 8;
        if (r12 == 0) goto L49;
        $dirty = $dirty | 24576;
        Function1<? super S, ? extends Object> r13 = r33;
    L57:
        if ((r37 & 16) == 0) goto L60;
        $dirty = $dirty | ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
        Function4<? super AnimatedContentScope, ? super S, ? super Composer, ? super Integer, Unit> r14 = r34;
    L67:
        int $dirty2 = $dirty;
        if ((74899 & $dirty2) == 74898) goto L70;
        boolean r2 = true;
    L72:
        if ($composer2.shouldExecute(r2, $dirty2 & 1) == false) goto L202;
        if (r3 == 0) goto L75;
        Modifier.Companion modifier2 = Modifier.Companion;
    L76:
        if (r6 == 0) goto L78;
        final AnonymousClass4 r4 = AnonymousClass4.INSTANCE;
    L79:
        if (r10 == 0) goto L81;
        contentAlignment2 = Alignment.Companion.getTopStart();
    L81:
        if (r12 == 0) goto L84;
        r13 = AnonymousClass5.INSTANCE;
    L84:
        if (ComposerKt.isTraceInProgress() == false) goto L86;
        ComposerKt.traceEventStart(-114689412, $dirty2, -1, "androidx.compose.animation.AnimatedContent (AnimatedContent.kt:772)");
    L86:
        ProvidableCompositionLocal<LayoutDirection> r7 = CompositionLocalsKt.getLocalLayoutDirection();
        ComposerKt.sourceInformationMarkerStart($composer2, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
        Object r11 = $composer2.consume(r7);
        ComposerKt.sourceInformationMarkerEnd($composer2);
        LayoutDirection layoutDirection = (LayoutDirection) r11;
        ComposerKt.sourceInformationMarkerStart($composer2, -801775907, "CC(remember):AnimatedContent.kt#9igjgp");
        if (($dirty2 & 14) != 4) goto L89;
        boolean invalid$iv = true;
    L90:
        Object it$iv = $composer2.rememberedValue();
        if (invalid$iv == false) goto L93;
    L96:
        Object value$iv = new AnimatedContentTransitionScopeImpl(r29, contentAlignment2, layoutDirection);
        $composer2.updateRememberedValue(value$iv);
        it$iv = value$iv;
    L97:
        final AnimatedContentTransitionScopeImpl rootScope = (AnimatedContentTransitionScopeImpl) it$iv;
        ComposerKt.sourceInformationMarkerEnd($composer2);
        ComposerKt.sourceInformationMarkerStart($composer2, -801769506, "CC(remember):AnimatedContent.kt#9igjgp");
        if (($dirty2 & 14) != 4) goto L100;
        boolean invalid$iv2 = true;
    L101:
        Object it$iv2 = $composer2.rememberedValue();
        if (invalid$iv2 == true) goto L108;
        if (it$iv2 == Composer.Companion.getEmpty()) goto L108;
    L109:
        final SnapshotStateList currentlyVisible = (SnapshotStateList) it$iv2;
        ComposerKt.sourceInformationMarkerEnd($composer2);
        ComposerKt.sourceInformationMarkerStart($composer2, -801767152, "CC(remember):AnimatedContent.kt#9igjgp");
        if (($dirty2 & 14) != 4) goto L112;
        boolean invalid$iv3 = true;
    L113:
        boolean invalid$iv4 = invalid$iv3;
        Object it$iv3 = $composer2.rememberedValue();
        if (invalid$iv4 == false) goto L116;
    L119:
        Object value$iv2 = ScatterMapKt.mutableScatterMapOf();
        $composer2.updateRememberedValue(value$iv2);
        it$iv3 = value$iv2;
    L120:
        MutableScatterMap contentMap = (MutableScatterMap) it$iv3;
        ComposerKt.sourceInformationMarkerEnd($composer2);
        if (currentlyVisible.contains(r29.getCurrentState()) == true) goto L124;
        currentlyVisible.clear();
        currentlyVisible.add(r29.getCurrentState());
    L124:
        if (Intrinsics.areEqual(r29.getCurrentState(), r29.getTargetState()) == false) goto L140;
        if (currentlyVisible.size() != 1) goto L131;
        if (Intrinsics.areEqual(currentlyVisible.get(0), r29.getCurrentState()) == false) goto L131;
    L133:
        if (contentMap.getSize() == 1) goto L135;
    L136:
        contentMap.clear();
    L137:
        rootScope.setContentAlignment(contentAlignment2);
        rootScope.setLayoutDirection$animation_release(layoutDirection);
        goto L140
    L135:
        if (contentMap.containsKey(r29.getCurrentState()) == false) goto L137;
    L131:
        currentlyVisible.clear();
        currentlyVisible.add(r29.getCurrentState());
    L140:
        if (Intrinsics.areEqual(r29.getCurrentState(), r29.getTargetState()) == true) goto L156;
        if (currentlyVisible.contains(r29.getTargetState()) == true) goto L156;
        SnapshotStateList $this$indexOfFirst$iv = currentlyVisible;
        int $i$f$indexOfFirst = 0;
        int index$iv = 0;
        Iterator r18 = $this$indexOfFirst$iv.iterator();
    L145:
        if (r18.hasNext() == false) goto L150;
        List $this$indexOfFirst$iv2 = $this$indexOfFirst$iv;
        int $i$f$indexOfFirst2 = $i$f$indexOfFirst;
        if (Intrinsics.areEqual(r13.invoke(r18.next()), r13.invoke(r29.getTargetState())) == true) goto L151;
        index$iv = index$iv + 1;
        $this$indexOfFirst$iv = $this$indexOfFirst$iv2;
        $i$f$indexOfFirst = $i$f$indexOfFirst2;
    L151:
        int id = index$iv;
        if (id != (-1)) goto L154;
        currentlyVisible.add(r29.getTargetState());
        goto L156
    L154:
        currentlyVisible.set(id, r29.getTargetState());
        goto L156
    L150:
        index$iv = -1;
    L156:
        if (contentMap.containsKey(r29.getTargetState()) == true) goto L158;
    L161:
        $composer2.startReplaceGroup(916905750);
        ComposerKt.sourceInformation($composer2, "*816@40785L2544");
        contentMap.clear();
        SnapshotStateList $this$fastForEach$iv = currentlyVisible;
        int index$iv2 = 0;
        int r9 = $this$fastForEach$iv.size();
    L162:
        if (index$iv2 >= r9) goto L164;
        final Object item$iv = $this$fastForEach$iv.get(index$iv2);
        final Function4<? super AnimatedContentScope, ? super S, ? super Composer, ? super Integer, Unit> r30 = r14;
        contentMap.set(item$iv, ComposableLambdaKt.rememberComposableLambda(885640742, true, new AnimatedContentKt$AnimatedContent$6$1(r29, item$iv, r4, rootScope, currentlyVisible, r30), $composer2, 54));
        index$iv2 = index$iv2 + 1;
        layoutDirection = layoutDirection;
        modifier2 = modifier2;
        r9 = r9;
        $this$fastForEach$iv = $this$fastForEach$iv;
        r14 = r34;
        goto L162
    L164:
        Modifier modifier3 = modifier2;
        $composer2.endReplaceGroup();
    L165:
        Transition.Segment<S> r0 = r29.getSegment();
        ComposerKt.sourceInformationMarkerStart($composer2, -801622075, "CC(remember):AnimatedContent.kt#9igjgp");
        boolean invalid$iv5 = $composer2.changed(r0) | $composer2.changed(rootScope);
        Object it$iv4 = $composer2.rememberedValue();
        if (invalid$iv5 == false) goto L168;
    L171:
        Object value$iv3 = (ContentTransform) r4.invoke(rootScope);
        $composer2.updateRememberedValue(value$iv3);
        it$iv4 = value$iv3;
    L172:
        ContentTransform contentTransform = (ContentTransform) it$iv4;
        ComposerKt.sourceInformationMarkerEnd($composer2);
        Modifier sizeModifier = rootScope.createSizeAnimationModifier$animation_release(contentTransform, $composer2, 0);
        Modifier r1 = modifier3.then(sizeModifier);
        ComposerKt.sourceInformationMarkerStart($composer2, -801610977, "CC(remember):AnimatedContent.kt#9igjgp");
        Object it$iv5 = $composer2.rememberedValue();
        if (it$iv5 != Composer.Companion.getEmpty()) goto L176;
        Object value$iv4 = new AnimatedContentMeasurePolicy(rootScope);
        $composer2.updateRememberedValue(value$iv4);
        it$iv5 = value$iv4;
    L176:
        AnimatedContentMeasurePolicy r15 = (AnimatedContentMeasurePolicy) it$iv5;
        ComposerKt.sourceInformationMarkerEnd($composer2);
        ComposerKt.sourceInformationMarkerStart($composer2, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
        int compositeKeyHash$iv = ComposablesKt.getCurrentCompositeKeyHash($composer2, 0);
        CompositionLocalMap localMap$iv = $composer2.getCurrentCompositionLocalMap();
        Modifier materialized$iv = ComposedModifierKt.materializeModifier($composer2, r1);
        Function0<ComposeUiNode> r16 = ComposeUiNode.Companion.getConstructor();
        int $changed$iv = 384 << 6;
        int $changed$iv$iv = ($changed$iv & 896) | 6;
        ComposerKt.sourceInformationMarkerStart($composer2, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
        if (($composer2.getApplier() instanceof Applier) == true) goto L179;
        ComposablesKt.invalidApplier();
    L179:
        $composer2.startReusableNode();
        if ($composer2.getInserting() == false) goto L182;
        Function0<ComposeUiNode> r17 = r16;
        $composer2.createNode(r17);
    L183:
        Composer $this$Layout_u24lambda_u240$iv = Updater.m3808constructorimpl($composer2);
        Updater.m3815setimpl($this$Layout_u24lambda_u240$iv, r15, ComposeUiNode.Companion.getSetMeasurePolicy());
        Updater.m3815setimpl($this$Layout_u24lambda_u240$iv, localMap$iv, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> r19 = ComposeUiNode.Companion.getSetCompositeKeyHash();
        if ($this$Layout_u24lambda_u240$iv.getInserting() == true) goto L189;
        Function1<? super AnimatedContentTransitionScope<S>, ContentTransform> r22 = r4;
        if (Intrinsics.areEqual($this$Layout_u24lambda_u240$iv.rememberedValue(), Integer.valueOf(compositeKeyHash$iv)) == true) goto L191;
    L190:
        $this$Layout_u24lambda_u240$iv.updateRememberedValue(Integer.valueOf(compositeKeyHash$iv));
        $this$Layout_u24lambda_u240$iv.apply(Integer.valueOf(compositeKeyHash$iv), r19);
    L191:
        Updater.m3815setimpl($this$Layout_u24lambda_u240$iv, materialized$iv, ComposeUiNode.Companion.getSetModifier());
        int r20 = ($changed$iv$iv >> 6) & 14;
        int r21 = 0;
        ComposerKt.sourceInformationMarkerStart($composer2, 1027519816, "C:AnimatedContent.kt#xbi5r1");
        $composer2.startReplaceGroup(-1490874326);
        ComposerKt.sourceInformation($composer2, "");
        SnapshotStateList $this$fastForEach$iv2 = currentlyVisible;
        int $changed2 = $this$fastForEach$iv2.size();
        int index$iv3 = 0;
    L192:
        if (index$iv3 >= $changed2) goto L198;
        Object item$iv2 = $this$fastForEach$iv2.get(index$iv3);
        int r27 = $changed2;
        int index$iv4 = index$iv3;
        int r28 = r21;
        $composer2.startMovableGroup(1908442329, r13.invoke(item$iv2));
        ComposerKt.sourceInformation($composer2, "");
        Function2 r23 = (Function2) contentMap.get(item$iv2);
        if (r23 != null) goto L196;
        $composer2.startReplaceGroup(-967793488);
        $composer2.endReplaceGroup();
    L197:
        $composer2.endMovableGroup();
        index$iv3 = index$iv4 + 1;
        $changed2 = r27;
        r21 = r28;
        goto L192
    L196:
        $composer2.startReplaceGroup(1908443505);
        ComposerKt.sourceInformation($composer2, "871@43672L8");
        r23.invoke($composer2, 0);
        $composer2.endReplaceGroup();
        goto L197
    L198:
        $composer2.endReplaceGroup();
        ComposerKt.sourceInformationMarkerEnd($composer2);
        $composer2.endNode();
        ComposerKt.sourceInformationMarkerEnd($composer2);
        ComposerKt.sourceInformationMarkerEnd($composer2);
        if (ComposerKt.isTraceInProgress() == false) goto L201;
        ComposerKt.traceEventEnd();
    L201:
        final Modifier modifier4 = modifier3;
        final Function1<? super AnimatedContentTransitionScope<S>, ContentTransform> r24 = r22;
        final Alignment contentAlignment3 = contentAlignment2;
        final Function1<? super S, ? extends Object> r25 = r13;
    L203:
        ScopeUpdateScope r110 = $composer2.endRestartGroup();
        if (r110 == null) goto L213;
        r110.updateScope(new AnonymousClass9(r29, modifier4, r24, contentAlignment3, r25, r34, $changed, r37));
        return;
    L213:
        return;
    L189:
        r22 = r4;
        goto L190
    L182:
        r17 = r16;
        $composer2.useNode();
        goto L183
    L168:
        if (it$iv4 != Composer.Companion.getEmpty()) goto L172;
    L158:
        if (contentMap.containsKey(r29.getCurrentState()) == false) goto L161;
        $composer2.startReplaceGroup(919489879);
        $composer2.endReplaceGroup();
        modifier3 = modifier2;
        goto L165
    L116:
        if (it$iv3 != Composer.Companion.getEmpty()) goto L120;
    L112:
        invalid$iv3 = false;
    L108:
        Object value$iv5 = SnapshotStateKt.mutableStateListOf(new Object[]{r29.getCurrentState()});
        $composer2.updateRememberedValue(value$iv5);
        it$iv2 = value$iv5;
        goto L109
    L100:
        invalid$iv2 = false;
        goto L101
    L93:
        if (it$iv != Composer.Companion.getEmpty()) goto L97;
    L89:
        invalid$iv = false;
        goto L90
    L78:
        r4 = r8;
        goto L79
    L75:
        modifier2 = r5;
        goto L76
    L202:
        $composer2.skipToGroupEnd();
        modifier4 = r5;
        r24 = r8;
        contentAlignment3 = contentAlignment2;
        r25 = r13;
        goto L203
    L70:
        r2 = false;
        goto L72
    L60:
        if (($changed & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) != 0) goto L66;
        r14 = r34;
        if ($composer2.changedInstance(r14) == false) goto L64;
        int r111 = 131072;
    L65:
        $dirty = $dirty | r111;
        goto L67
    L64:
        r111 = 65536;
        goto L65
    L66:
        r14 = r34;
        goto L67
    L49:
        if (($changed & 24576) != 0) goto L55;
        r13 = r33;
        if ($composer2.changedInstance(r13) == false) goto L53;
        int r112 = 16384;
    L54:
        $dirty = $dirty | r112;
        goto L57
    L53:
        r112 = 8192;
        goto L54
    L55:
        r13 = r33;
        goto L57
    L38:
        if (($changed & 3072) != 0) goto L44;
        contentAlignment2 = contentAlignment;
        if ($composer2.changed(contentAlignment2) == false) goto L42;
        int r113 = 2048;
    L43:
        $dirty = $dirty | r113;
        goto L45
    L42:
        r113 = 1024;
        goto L43
    L44:
        contentAlignment2 = contentAlignment;
        goto L45
    L27:
        if (($changed & 384) != 0) goto L33;
        r8 = r31;
        if ($composer2.changedInstance(r8) == false) goto L31;
        int r114 = 256;
    L32:
        $dirty = $dirty | r114;
        goto L34
    L31:
        r114 = 128;
        goto L32
    L33:
        r8 = r31;
        goto L34
    L16:
        if (($changed & 48) != 0) goto L22;
        r5 = modifier;
        if ($composer2.changed(r5) == false) goto L20;
        int r26 = 32;
    L21:
        $dirty = $dirty | r26;
        goto L23
    L20:
        r26 = 16;
        goto L21
    L22:
        r5 = modifier;
        goto L23
    L6:
        if (($changed & 6) != 0) goto L12;
        if ($composer2.changed(r29) == false) goto L10;
        int r32 = 4;
    L11:
        $dirty = $dirty | r32;
        goto L12
    L10:
        r32 = 2;
        goto L11
    }
}
