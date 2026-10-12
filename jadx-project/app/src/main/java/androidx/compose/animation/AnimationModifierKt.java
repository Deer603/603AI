package androidx.compose.animation;

import androidx.autofill.HintConstants;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.animation.core.SpringSpec;
import androidx.compose.animation.core.VisibilityThresholdsKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.unit.IntSize;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: AnimationModifier.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001aV\u0010\t\u001a\u00020\n*\u00020\n2\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00010\f2:\b\u0002\u0010\r\u001a4\u0012\u0013\u0012\u00110\u0001¢\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\u0011\u0012\u0013\u0012\u00110\u0001¢\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\u0012\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u000e\u001a`\u0010\t\u001a\u00020\n*\u00020\n2\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00010\f2\b\b\u0002\u0010\u0014\u001a\u00020\u00152:\b\u0002\u0010\r\u001a4\u0012\u0013\u0012\u00110\u0001¢\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\u0011\u0012\u0013\u0012\u00110\u0001¢\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\u0012\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u000e\"\u0016\u0010\u0000\u001a\u00020\u0001X\u0080\u0004¢\u0006\n\n\u0002\u0010\u0004\u001a\u0004\b\u0002\u0010\u0003\"\u0018\u0010\u0005\u001a\u00020\u0006*\u00020\u00018@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\u0016"}, d2 = {"InvalidSize", "Landroidx/compose/ui/unit/IntSize;", "getInvalidSize", "()J", "J", "isValid", "", "isValid-ozmzZPI", "(J)Z", "animateContentSize", "Landroidx/compose/ui/Modifier;", "animationSpec", "Landroidx/compose/animation/core/FiniteAnimationSpec;", "finishedListener", "Lkotlin/Function2;", "Lkotlin/ParameterName;", HintConstants.AUTOFILL_HINT_NAME, "initialValue", "targetValue", "", "alignment", "Landroidx/compose/ui/Alignment;", "animation_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class AnimationModifierKt {
    private static final long InvalidSize = 0;

    public static /* synthetic */ Modifier animateContentSize$default(Modifier r3, SpringSpec r4, Function2 r5, int r6, Object r7) {
        if ((r6 & 1) == 0) goto L6;
        r4 = AnimationSpecKt.spring$default(0.0f, 400.0f, IntSize.m7136boximpl(VisibilityThresholdsKt.getVisibilityThreshold(IntSize.Companion)), 1, null);
    L6:
        if ((r6 & 2) == 0) goto L9;
        r5 = null;
    L9:
        return animateContentSize(r3, r4, r5);
    }

    public static final Modifier animateContentSize(Modifier $this$animateContentSize, FiniteAnimationSpec<IntSize> r4, Function2<? super IntSize, ? super IntSize, Unit> r5) {
        return ClipKt.clipToBounds($this$animateContentSize).then(new SizeAnimationModifierElement(r4, Alignment.Companion.getTopStart(), r5));
    }

    public static /* synthetic */ Modifier animateContentSize$default(Modifier r3, SpringSpec r4, Alignment r5, Function2 r6, int r7, Object r8) {
        if ((r7 & 1) == 0) goto L6;
        r4 = AnimationSpecKt.spring$default(0.0f, 400.0f, IntSize.m7136boximpl(VisibilityThresholdsKt.getVisibilityThreshold(IntSize.Companion)), 1, null);
    L6:
        if ((r7 & 2) == 0) goto L9;
        r5 = Alignment.Companion.getTopStart();
    L9:
        if ((r7 & 4) == 0) goto L12;
        r6 = null;
    L12:
        return animateContentSize(r3, r4, r5, r6);
    }

    public static final Modifier animateContentSize(Modifier $this$animateContentSize, FiniteAnimationSpec<IntSize> r3, Alignment alignment, Function2<? super IntSize, ? super IntSize, Unit> r5) {
        return ClipKt.clipToBounds($this$animateContentSize).then(new SizeAnimationModifierElement(r3, alignment, r5));
    }

    static {
        InvalidSize = IntSize.m7139constructorimpl((((long) Integer.MIN_VALUE) << 32) | (((long) Integer.MIN_VALUE) & 4294967295L));
    }

    public static final long getInvalidSize() {
        return InvalidSize;
    }

    /* JADX INFO: renamed from: isValid-ozmzZPI, reason: not valid java name */
    public static final boolean m64isValidozmzZPI(long $this$isValid) {
        return !IntSize.m7142equalsimpl0($this$isValid, InvalidSize);
    }
}
