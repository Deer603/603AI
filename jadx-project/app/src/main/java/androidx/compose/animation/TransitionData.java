package androidx.compose.animation;

import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: EnterExitTransition.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001BY\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\u0018\b\u0002\u0010\f\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u000e\u0012\u0004\u0012\u00020\u000f0\r¢\u0006\u0002\u0010\u0010J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\tHÆ\u0003J\t\u0010!\u001a\u00020\u000bHÆ\u0003J\u0019\u0010\"\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u000e\u0012\u0004\u0012\u00020\u000f0\rHÆ\u0003J]\u0010#\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\u0018\b\u0002\u0010\f\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u000e\u0012\u0004\u0012\u00020\u000f0\rHÆ\u0001J\u0013\u0010$\u001a\u00020\u000b2\b\u0010%\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010&\u001a\u00020'HÖ\u0001J\t\u0010(\u001a\u00020)HÖ\u0001R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R!\u0010\f\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u000e\u0012\u0004\u0012\u00020\u000f0\r¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001c¨\u0006*"}, d2 = {"Landroidx/compose/animation/TransitionData;", "", "fade", "Landroidx/compose/animation/Fade;", "slide", "Landroidx/compose/animation/Slide;", "changeSize", "Landroidx/compose/animation/ChangeSize;", "scale", "Landroidx/compose/animation/Scale;", "hold", "", "effectsMap", "", "Landroidx/compose/animation/TransitionEffectKey;", "Landroidx/compose/animation/TransitionEffect;", "(Landroidx/compose/animation/Fade;Landroidx/compose/animation/Slide;Landroidx/compose/animation/ChangeSize;Landroidx/compose/animation/Scale;ZLjava/util/Map;)V", "getChangeSize", "()Landroidx/compose/animation/ChangeSize;", "getEffectsMap", "()Ljava/util/Map;", "getFade", "()Landroidx/compose/animation/Fade;", "getHold", "()Z", "getScale", "()Landroidx/compose/animation/Scale;", "getSlide", "()Landroidx/compose/animation/Slide;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "other", "hashCode", "", "toString", "", "animation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class TransitionData {
    public static final int $stable = 0;
    private final ChangeSize changeSize;
    private final Map<TransitionEffectKey<?>, TransitionEffect> effectsMap;
    private final Fade fade;
    private final boolean hold;
    private final Scale scale;
    private final Slide slide;

    static {
    }

    public TransitionData() {
        Fade r1 = null;
        Slide r2 = null;
        ChangeSize r3 = null;
        Scale r4 = null;
        boolean r5 = false;
        Map r6 = null;
        this(r1, r2, r3, r4, r5, r6, 63, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ TransitionData copy$default(TransitionData r0, Fade r1, Slide r2, ChangeSize r3, Scale r4, boolean r5, Map r6, int r7, Object r8) {
        if ((r7 & 1) == 0) goto L6;
        r1 = r0.fade;
    L6:
        if ((r7 & 2) == 0) goto L9;
        r2 = r0.slide;
    L9:
        if ((r7 & 4) == 0) goto L12;
        r3 = r0.changeSize;
    L12:
        if ((r7 & 8) == 0) goto L15;
        r4 = r0.scale;
    L15:
        if ((r7 & 16) == 0) goto L18;
        r5 = r0.hold;
    L18:
        if ((r7 & 32) == 0) goto L20;
        r6 = r0.effectsMap;
    L20:
        boolean r9 = r5;
        Map r10 = r6;
        ChangeSize r11 = r3;
        Scale r12 = r4;
        return r0.copy(r1, r2, r11, r12, r9, r10);
    }

    public final Fade component1() {
        return this.fade;
    }

    public final Slide component2() {
        return this.slide;
    }

    public final ChangeSize component3() {
        return this.changeSize;
    }

    public final Scale component4() {
        return this.scale;
    }

    public final boolean component5() {
        return this.hold;
    }

    public final Map<TransitionEffectKey<?>, TransitionEffect> component6() {
        return this.effectsMap;
    }

    public final TransitionData copy(Fade r8, Slide r9, ChangeSize r10, Scale r11, boolean r12, Map<TransitionEffectKey<?>, ? extends TransitionEffect> r13) {
        return new TransitionData(r8, r9, r10, r11, r12, r13);
    }

    public boolean equals(Object r6) {
        if (this != r6) goto L6;
        return true;
    L6:
        if ((r6 instanceof TransitionData) == true) goto L8;
        return false;
    L8:
        TransitionData r1 = (TransitionData) r6;
        if (Intrinsics.areEqual(this.fade, r1.fade) == true) goto L12;
        return false;
    L12:
        if (Intrinsics.areEqual(this.slide, r1.slide) == true) goto L15;
        return false;
    L15:
        if (Intrinsics.areEqual(this.changeSize, r1.changeSize) == true) goto L18;
        return false;
    L18:
        if (Intrinsics.areEqual(this.scale, r1.scale) == true) goto L21;
        return false;
    L21:
        if (this.hold == r1.hold) goto L24;
        return false;
    L24:
        if (Intrinsics.areEqual(this.effectsMap, r1.effectsMap) == true) goto L26;
        return false;
    L26:
        return true;
    }

    public int hashCode() {
        int r1 = 0;
        if (this.fade != null) goto L5;
        int r0 = 0;
    L6:
        int r2 = r0 * 31;
        if (this.slide != null) goto L9;
        int r3 = 0;
    L10:
        int r4 = (r2 + r3) * 31;
        if (this.changeSize != null) goto L13;
        int r5 = 0;
    L14:
        int r6 = (r4 + r5) * 31;
        if (this.scale == null) goto L19;
        r1 = this.scale.hashCode();
    L19:
        return ((((r6 + r1) * 31) + Boolean.hashCode(this.hold)) * 31) + this.effectsMap.hashCode();
    L13:
        r5 = this.changeSize.hashCode();
        goto L14
    L9:
        r3 = this.slide.hashCode();
        goto L10
    L5:
        r0 = this.fade.hashCode();
        goto L6
    }

    public String toString() {
        return "TransitionData(fade=" + this.fade + ", slide=" + this.slide + ", changeSize=" + this.changeSize + ", scale=" + this.scale + ", hold=" + this.hold + ", effectsMap=" + this.effectsMap + ')';
    }

    /* JADX WARN: Multi-variable type inference failed */
    public TransitionData(Fade fade, Slide slide, ChangeSize changeSize, Scale scale, boolean hold, Map<TransitionEffectKey<?>, ? extends TransitionEffect> r6) {
        this.fade = fade;
        this.slide = slide;
        this.changeSize = changeSize;
        this.scale = scale;
        this.hold = hold;
        this.effectsMap = r6;
    }

    public /* synthetic */ TransitionData(Fade r2, Slide r3, ChangeSize r4, Scale r5, boolean r6, Map r7, int r8, DefaultConstructorMarker r9) {
        if ((r8 & 1) == 0) goto L6;
        r2 = null;
    L6:
        if ((r8 & 2) == 0) goto L9;
        r3 = null;
    L9:
        if ((r8 & 4) == 0) goto L12;
        r4 = null;
    L12:
        if ((r8 & 8) == 0) goto L15;
        r5 = null;
    L15:
        if ((r8 & 16) == 0) goto L18;
        r6 = false;
    L18:
        if ((r8 & 32) == 0) goto L20;
        Map r10 = MapsKt.emptyMap();
    L21:
        boolean r11 = r6;
        Scale r12 = r5;
        ChangeSize r13 = r4;
        this(r2, r3, r13, r12, r11, r10);
        return;
    L20:
        r10 = r7;
        goto L21
    }

    public final Fade getFade() {
        return this.fade;
    }

    public final Slide getSlide() {
        return this.slide;
    }

    public final ChangeSize getChangeSize() {
        return this.changeSize;
    }

    public final Scale getScale() {
        return this.scale;
    }

    public final boolean getHold() {
        return this.hold;
    }

    public final Map<TransitionEffectKey<?>, TransitionEffect> getEffectsMap() {
        return this.effectsMap;
    }
}
