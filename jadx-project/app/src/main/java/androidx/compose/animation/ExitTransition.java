package androidx.compose.animation;

import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: EnterExitTransition.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010B\u0007\b\u0004¢\u0006\u0002\u0010\u0002J\u0013\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\n\u001a\u00020\u000bH\u0016J\u0011\u0010\f\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\u0000H\u0087\u0002J\b\u0010\u000e\u001a\u00020\u000fH\u0016R\u0012\u0010\u0003\u001a\u00020\u0004X \u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006\u0082\u0001\u0001\u0011¨\u0006\u0012"}, d2 = {"Landroidx/compose/animation/ExitTransition;", "", "()V", "data", "Landroidx/compose/animation/TransitionData;", "getData$animation_release", "()Landroidx/compose/animation/TransitionData;", "equals", "", "other", "hashCode", "", "plus", "exit", "toString", "", "Companion", "Landroidx/compose/animation/ExitTransitionImpl;", "animation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public abstract class ExitTransition {
    public static final int $stable = 0;
    public static final Companion Companion = null;
    private static final ExitTransition KeepUntilTransitionsFinished = null;
    private static final ExitTransition None = null;

    /* JADX INFO: compiled from: EnterExitTransition.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0014\u0010\u0003\u001a\u00020\u0004X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0011\u0010\u0007\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0006¨\u0006\t"}, d2 = {"Landroidx/compose/animation/ExitTransition$Companion;", "", "()V", "KeepUntilTransitionsFinished", "Landroidx/compose/animation/ExitTransition;", "getKeepUntilTransitionsFinished$animation_release", "()Landroidx/compose/animation/ExitTransition;", "None", "getNone", "animation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker r1) {
            this();
        }

        private Companion() {
        }

        public final ExitTransition getNone() {
            return ExitTransition.access$getNone$cp();
        }

        public final ExitTransition getKeepUntilTransitionsFinished$animation_release() {
            return ExitTransition.access$getKeepUntilTransitionsFinished$cp();
        }
    }

    public /* synthetic */ ExitTransition(DefaultConstructorMarker r1) {
        this();
    }

    public abstract TransitionData getData$animation_release();

    private ExitTransition() {
    }

    public static final /* synthetic */ ExitTransition access$getKeepUntilTransitionsFinished$cp() {
        return KeepUntilTransitionsFinished;
    }

    public static final /* synthetic */ ExitTransition access$getNone$cp() {
        return None;
    }

    public final ExitTransition plus(ExitTransition exit) {
        Fade r2 = exit.getData$animation_release().getFade();
        if (r2 != null) goto L5;
        r2 = getData$animation_release().getFade();
    L5:
        Slide r3 = exit.getData$animation_release().getSlide();
        if (r3 != null) goto L8;
        r3 = getData$animation_release().getSlide();
    L8:
        ChangeSize r4 = exit.getData$animation_release().getChangeSize();
        if (r4 != null) goto L11;
        r4 = getData$animation_release().getChangeSize();
    L11:
        Scale r5 = exit.getData$animation_release().getScale();
        if (r5 != null) goto L15;
        r5 = getData$animation_release().getScale();
    L15:
        if (exit.getData$animation_release().getHold() == false) goto L17;
    L20:
        boolean r6 = true;
    L22:
        return new ExitTransitionImpl(new TransitionData(r2, r3, r4, r5, r6, MapsKt.plus(getData$animation_release().getEffectsMap(), exit.getData$animation_release().getEffectsMap())));
    L17:
        if (getData$animation_release().getHold() == true) goto L20;
        r6 = false;
        goto L22
    }

    public boolean equals(Object other) {
        if ((other instanceof ExitTransition) == true) goto L5;
    L7:
        return false;
    L5:
        if (Intrinsics.areEqual(((ExitTransition) other).getData$animation_release(), getData$animation_release()) == false) goto L7;
        return true;
    }

    public String toString() {
        if (Intrinsics.areEqual(this, None) == false) goto L6;
        return "ExitTransition.None";
    L6:
        if (Intrinsics.areEqual(this, KeepUntilTransitionsFinished) == false) goto L8;
        return "ExitTransition.KeepUntilTransitionsFinished";
    L8:
        TransitionData $this$toString_u24lambda_u240 = getData$animation_release();
        StringBuilder r2 = new StringBuilder().append("ExitTransition: \nFade - ");
        Fade r3 = $this$toString_u24lambda_u240.getFade();
        String r4 = null;
        if (r3 == null) goto L11;
        String r5 = r3.toString();
    L12:
        StringBuilder r6 = r2.append(r5).append(",\nSlide - ");
        Slide r7 = $this$toString_u24lambda_u240.getSlide();
        if (r7 == null) goto L15;
        String r8 = r7.toString();
    L16:
        StringBuilder r9 = r6.append(r8).append(",\nShrink - ");
        ChangeSize r10 = $this$toString_u24lambda_u240.getChangeSize();
        if (r10 == null) goto L19;
        String r11 = r10.toString();
    L20:
        StringBuilder r12 = r9.append(r11).append(",\nScale - ");
        Scale r13 = $this$toString_u24lambda_u240.getScale();
        if (r13 == null) goto L24;
        r4 = r13.toString();
    L24:
        return r12.append(r4).append(",\nKeepUntilTransitionsFinished - ").append($this$toString_u24lambda_u240.getHold()).toString();
    L19:
        r11 = null;
        goto L20
    L15:
        r8 = null;
        goto L16
    L11:
        r5 = null;
        goto L12
    }

    public int hashCode() {
        return getData$animation_release().hashCode();
    }

    static {
        Companion = new Companion(null);
        DefaultConstructorMarker r9 = null;
        Fade r2 = null;
        Slide r3 = null;
        ChangeSize r4 = null;
        Scale r5 = null;
        boolean r6 = false;
        Map r7 = null;
        None = new ExitTransitionImpl(new TransitionData(r2, r3, r4, r5, r6, r7, 63, r9));
        boolean r8 = true;
        KeepUntilTransitionsFinished = new ExitTransitionImpl(new TransitionData(r2, r3, r4, r5, r8, r7, 47, r9));
    }
}
