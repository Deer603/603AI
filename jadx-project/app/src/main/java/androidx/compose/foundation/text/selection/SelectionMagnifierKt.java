package androidx.compose.foundation.text.selection;

import androidx.autofill.HintConstants;
import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimationVector2D;
import androidx.compose.animation.core.SpringSpec;
import androidx.compose.animation.core.TwoWayConverter;
import androidx.compose.animation.core.VectorConvertersKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Offset;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: SelectionMagnifier.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000>\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a!\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00020\u00102\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00020\u0012H\u0003¢\u0006\u0002\u0010\u0013\u001aC\u0010\u0014\u001a\u00020\u0015*\u00020\u00152\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00020\u00122'\u0010\u0017\u001a#\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020\u00020\u0012¢\u0006\f\b\u0019\u0012\b\b\u001a\u0012\u0004\b\b(\u001b\u0012\u0004\u0012\u00020\u00150\u0018H\u0000\"\u001a\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0003\u0010\u0004\"\u0016\u0010\u0005\u001a\u00020\u0002X\u0080\u0004¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\u0006\u0010\u0007\"\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000\" \u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\n0\fX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u001c²\u0006\n\u0010\u001b\u001a\u00020\u0002X\u008a\u0084\u0002²\u0006\n\u0010\u001d\u001a\u00020\u0002X\u008a\u0084\u0002"}, d2 = {"MagnifierSpringSpec", "Landroidx/compose/animation/core/SpringSpec;", "Landroidx/compose/ui/geometry/Offset;", "getMagnifierSpringSpec", "()Landroidx/compose/animation/core/SpringSpec;", "OffsetDisplacementThreshold", "getOffsetDisplacementThreshold", "()J", "J", "UnspecifiedAnimationVector2D", "Landroidx/compose/animation/core/AnimationVector2D;", "UnspecifiedSafeOffsetVectorConverter", "Landroidx/compose/animation/core/TwoWayConverter;", "getUnspecifiedSafeOffsetVectorConverter", "()Landroidx/compose/animation/core/TwoWayConverter;", "rememberAnimatedMagnifierPosition", "Landroidx/compose/runtime/State;", "targetCalculation", "Lkotlin/Function0;", "(Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;", "animatedSelectionMagnifier", "Landroidx/compose/ui/Modifier;", "magnifierCenter", "platformMagnifier", "Lkotlin/Function1;", "Lkotlin/ParameterName;", HintConstants.AUTOFILL_HINT_NAME, "animatedCenter", "foundation_release", "targetValue"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class SelectionMagnifierKt {
    private static final SpringSpec<Offset> MagnifierSpringSpec = null;
    private static final long OffsetDisplacementThreshold = 0;
    private static final AnimationVector2D UnspecifiedAnimationVector2D = null;
    private static final TwoWayConverter<Offset, AnimationVector2D> UnspecifiedSafeOffsetVectorConverter = null;

    /* JADX INFO: renamed from: androidx.compose.foundation.text.selection.SelectionMagnifierKt$animatedSelectionMagnifier$1, reason: invalid class name */
    /* JADX INFO: compiled from: SelectionMagnifier.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "Landroidx/compose/ui/Modifier;", "invoke", "(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/Modifier;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    static final class AnonymousClass1 extends Lambda implements Function3<Modifier, Composer, Integer, Modifier> {
        final /* synthetic */ Function0<Offset> $magnifierCenter;
        final /* synthetic */ Function1<Function0<Offset>, Modifier> $platformMagnifier;

        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass1(Function0<Offset> r2, Function1<? super Function0<Offset>, ? extends Modifier> r3) {
            this.$magnifierCenter = r2;
            this.$platformMagnifier = r3;
            super(3);
        }

        public static final /* synthetic */ long access$invoke$lambda$0(State $animatedCenter$delegate) {
            return invoke$lambda$0($animatedCenter$delegate);
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Modifier invoke(Modifier r4, Composer r5, Integer r6) {
            return invoke(r4, r5, r6.intValue());
        }

        private static final long invoke$lambda$0(State<Offset> r4) {
            Object thisObj$iv = r4.getValue();
            return ((Offset) thisObj$iv).m4135unboximpl();
        }

        public final Modifier invoke(Modifier $this$composed, Composer $composer, int $changed) {
            $composer.startReplaceGroup(759876635);
            ComposerKt.sourceInformation($composer, "C64@2536L70,65@2645L18:SelectionMagnifier.kt#eksfi3");
            if (ComposerKt.isTraceInProgress() == false) goto L5;
            ComposerKt.traceEventStart(759876635, $changed, -1, "androidx.compose.foundation.text.selection.animatedSelectionMagnifier.<anonymous> (SelectionMagnifier.kt:64)");
        L5:
            final State animatedCenter$delegate = SelectionMagnifierKt.access$rememberAnimatedMagnifierPosition(this.$magnifierCenter, $composer, 0);
            Function1<Function0<Offset>, Modifier> r1 = this.$platformMagnifier;
            ComposerKt.sourceInformationMarkerStart($composer, -1667323889, "CC(remember):SelectionMagnifier.kt#9igjgp");
            boolean invalid$iv = $composer.changed(animatedCenter$delegate);
            Object it$iv = $composer.rememberedValue();
            if (invalid$iv == false) goto L8;
        L11:
            Object value$iv = (Function0) new SelectionMagnifierKt$animatedSelectionMagnifier$1$1$1(animatedCenter$delegate);
            $composer.updateRememberedValue(value$iv);
            it$iv = value$iv;
        L12:
            ComposerKt.sourceInformationMarkerEnd($composer);
            Modifier r2 = r1.invoke((Function0) it$iv);
            if (ComposerKt.isTraceInProgress() == false) goto L15;
            ComposerKt.traceEventEnd();
        L15:
            $composer.endReplaceGroup();
            return r2;
        L8:
            if (it$iv != Composer.Companion.getEmpty()) goto L12;
            goto L11
        }
    }

    public static final /* synthetic */ AnimationVector2D access$getUnspecifiedAnimationVector2D$p() {
        return UnspecifiedAnimationVector2D;
    }

    public static final /* synthetic */ State access$rememberAnimatedMagnifierPosition(Function0 targetCalculation, Composer $composer, int $changed) {
        return rememberAnimatedMagnifierPosition(targetCalculation, $composer, $changed);
    }

    public static final /* synthetic */ long access$rememberAnimatedMagnifierPosition$lambda$1(State $targetValue$delegate) {
        return rememberAnimatedMagnifierPosition$lambda$1($targetValue$delegate);
    }

    static {
        UnspecifiedAnimationVector2D = new AnimationVector2D(Float.NaN, Float.NaN);
        UnspecifiedSafeOffsetVectorConverter = VectorConvertersKt.TwoWayConverter(SelectionMagnifierKt$UnspecifiedSafeOffsetVectorConverter$1.INSTANCE, SelectionMagnifierKt$UnspecifiedSafeOffsetVectorConverter$2.INSTANCE);
        long v1$iv$iv = Float.floatToRawIntBits(0.01f);
        long v2$iv$iv = Float.floatToRawIntBits(0.01f);
        OffsetDisplacementThreshold = Offset.m4117constructorimpl((v1$iv$iv << 32) | (4294967295L & v2$iv$iv));
        MagnifierSpringSpec = new SpringSpec(0.0f, 0.0f, Offset.m4114boximpl(OffsetDisplacementThreshold), 3, null);
    }

    public static final TwoWayConverter<Offset, AnimationVector2D> getUnspecifiedSafeOffsetVectorConverter() {
        return UnspecifiedSafeOffsetVectorConverter;
    }

    public static final long getOffsetDisplacementThreshold() {
        return OffsetDisplacementThreshold;
    }

    public static final SpringSpec<Offset> getMagnifierSpringSpec() {
        return MagnifierSpringSpec;
    }

    public static final Modifier animatedSelectionMagnifier(Modifier $this$animatedSelectionMagnifier, Function0<Offset> r4, Function1<? super Function0<Offset>, ? extends Modifier> r5) {
        return ComposedModifierKt.composed$default($this$animatedSelectionMagnifier, null, new AnonymousClass1(r4, r5), 1, null);
    }

    private static final State<Offset> rememberAnimatedMagnifierPosition(Function0<Offset> r17, Composer $composer, int $changed) {
        ComposerKt.sourceInformationMarkerStart($composer, -1589795249, "C(rememberAnimatedMagnifierPosition)76@3007L46,77@3075L208,81@3309L1129,81@3288L1150:SelectionMagnifier.kt#eksfi3");
        if (ComposerKt.isTraceInProgress() == false) goto L6;
        ComposerKt.traceEventStart(-1589795249, $changed, -1, "androidx.compose.foundation.text.selection.rememberAnimatedMagnifierPosition (SelectionMagnifier.kt:75)");
    L6:
        ComposerKt.sourceInformationMarkerStart($composer, 494973244, "CC(remember):SelectionMagnifier.kt#9igjgp");
        Object it$iv = $composer.rememberedValue();
        if (it$iv != Composer.Companion.getEmpty()) goto L10;
        Object value$iv = SnapshotStateKt.derivedStateOf(r17);
        $composer.updateRememberedValue(value$iv);
        it$iv = value$iv;
    L10:
        State targetValue$delegate = (State) it$iv;
        ComposerKt.sourceInformationMarkerEnd($composer);
        ComposerKt.sourceInformationMarkerStart($composer, 494975582, "CC(remember):SelectionMagnifier.kt#9igjgp");
        Object it$iv2 = $composer.rememberedValue();
        if (it$iv2 != Composer.Companion.getEmpty()) goto L14;
        Object value$iv2 = new Animatable(Offset.m4114boximpl(rememberAnimatedMagnifierPosition$lambda$1(targetValue$delegate)), UnspecifiedSafeOffsetVectorConverter, Offset.m4114boximpl(OffsetDisplacementThreshold), null, 8, null);
        $composer.updateRememberedValue(value$iv2);
        it$iv2 = value$iv2;
    L14:
        Animatable animatable = (Animatable) it$iv2;
        ComposerKt.sourceInformationMarkerEnd($composer);
        Unit r5 = Unit.INSTANCE;
        ComposerKt.sourceInformationMarkerStart($composer, 494983991, "CC(remember):SelectionMagnifier.kt#9igjgp");
        boolean invalid$iv = $composer.changedInstance(animatable);
        Object it$iv3 = $composer.rememberedValue();
        if (invalid$iv == false) goto L17;
    L20:
        Object value$iv3 = (Function2) new SelectionMagnifierKt$rememberAnimatedMagnifierPosition$1$1(targetValue$delegate, animatable, null);
        $composer.updateRememberedValue(value$iv3);
        it$iv3 = value$iv3;
    L21:
        ComposerKt.sourceInformationMarkerEnd($composer);
        EffectsKt.LaunchedEffect(r5, (Function2) it$iv3, $composer, 6);
        State<Offset> r2 = animatable.asState();
        if (ComposerKt.isTraceInProgress() == false) goto L24;
        ComposerKt.traceEventEnd();
    L24:
        ComposerKt.sourceInformationMarkerEnd($composer);
        return r2;
    L17:
        if (it$iv3 != Composer.Companion.getEmpty()) goto L21;
        goto L20
    }

    private static final long rememberAnimatedMagnifierPosition$lambda$1(State<Offset> r4) {
        Object thisObj$iv = r4.getValue();
        return ((Offset) thisObj$iv).m4135unboximpl();
    }
}
