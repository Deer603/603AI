package androidx.compose.animation;

import androidx.autofill.HintConstants;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.animation.core.SpringSpec;
import androidx.compose.animation.core.Transition;
import androidx.compose.animation.core.VisibilityThresholdsKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.unit.IntOffset;
import kotlin.Metadata;
import kotlin.jvm.JvmInline;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: AnimatedContent.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bv\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002:\u0001#JO\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u000e\b\u0002\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112#\b\u0002\u0010\u0013\u001a\u001d\u0012\u0013\u0012\u00110\u0015¢\u0006\f\b\u0016\u0012\b\b\u0017\u0012\u0004\b\b(\u0018\u0012\u0004\u0012\u00020\u00150\u0014H&ø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\u001aJO\u0010\u001b\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\u000f2\u000e\b\u0002\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112#\b\u0002\u0010\u001c\u001a\u001d\u0012\u0013\u0012\u00110\u0015¢\u0006\f\b\u0016\u0012\b\b\u0017\u0012\u0004\b\b(\u0018\u0012\u0004\u0012\u00020\u00150\u0014H&ø\u0001\u0000¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010\u001f\u001a\u00020 *\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\"H¦\u0004R\u0012\u0010\u0003\u001a\u00020\u0004X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0018\u0010\u0007\u001a\u00020\b*\u00020\t8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b\u0082\u0001\u0001$ø\u0001\u0001\u0082\u0002\r\n\u0005\b¡\u001e0\u0001\n\u0004\b!0\u0001¨\u0006%À\u0006\u0001"}, d2 = {"Landroidx/compose/animation/AnimatedContentTransitionScope;", "S", "Landroidx/compose/animation/core/Transition$Segment;", "contentAlignment", "Landroidx/compose/ui/Alignment;", "getContentAlignment", "()Landroidx/compose/ui/Alignment;", "KeepUntilTransitionsFinished", "Landroidx/compose/animation/ExitTransition;", "Landroidx/compose/animation/ExitTransition$Companion;", "getKeepUntilTransitionsFinished", "(Landroidx/compose/animation/ExitTransition$Companion;)Landroidx/compose/animation/ExitTransition;", "slideIntoContainer", "Landroidx/compose/animation/EnterTransition;", "towards", "Landroidx/compose/animation/AnimatedContentTransitionScope$SlideDirection;", "animationSpec", "Landroidx/compose/animation/core/FiniteAnimationSpec;", "Landroidx/compose/ui/unit/IntOffset;", "initialOffset", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", HintConstants.AUTOFILL_HINT_NAME, "offsetForFullSlide", "slideIntoContainer-mOhB8PU", "(ILandroidx/compose/animation/core/FiniteAnimationSpec;Lkotlin/jvm/functions/Function1;)Landroidx/compose/animation/EnterTransition;", "slideOutOfContainer", "targetOffset", "slideOutOfContainer-mOhB8PU", "(ILandroidx/compose/animation/core/FiniteAnimationSpec;Lkotlin/jvm/functions/Function1;)Landroidx/compose/animation/ExitTransition;", "using", "Landroidx/compose/animation/ContentTransform;", "sizeTransform", "Landroidx/compose/animation/SizeTransform;", "SlideDirection", "Landroidx/compose/animation/AnimatedContentTransitionScopeImpl;", "animation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public interface AnimatedContentTransitionScope<S> extends Transition.Segment<S> {

    /* JADX INFO: compiled from: AnimatedContent.kt */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087@\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B\u0011\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\f\u0010\u0005J\u000f\u0010\r\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000\u0088\u0001\u0002\u0092\u0001\u00020\u0003¨\u0006\u0012"}, d2 = {"Landroidx/compose/animation/AnimatedContentTransitionScope$SlideDirection;", "", "value", "", "constructor-impl", "(I)I", "equals", "", "other", "equals-impl", "(ILjava/lang/Object;)Z", "hashCode", "hashCode-impl", "toString", "", "toString-impl", "(I)Ljava/lang/String;", "Companion", "animation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @JvmInline
    public static final class SlideDirection {
        public static final Companion Companion = null;
        private static final int Down = 0;
        private static final int End = 0;
        private static final int Left = 0;
        private static final int Right = 0;
        private static final int Start = 0;
        private static final int Up = 0;
        private final int value;

        /* JADX INFO: compiled from: AnimatedContent.kt */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0019\u0010\u0003\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0005\u0010\u0006R\u0019\u0010\b\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\t\u0010\u0006R\u0019\u0010\n\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u000b\u0010\u0006R\u0019\u0010\f\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\r\u0010\u0006R\u0019\u0010\u000e\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u000f\u0010\u0006R\u0019\u0010\u0010\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0011\u0010\u0006\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0012"}, d2 = {"Landroidx/compose/animation/AnimatedContentTransitionScope$SlideDirection$Companion;", "", "()V", "Down", "Landroidx/compose/animation/AnimatedContentTransitionScope$SlideDirection;", "getDown-DKzdypw", "()I", "I", "End", "getEnd-DKzdypw", "Left", "getLeft-DKzdypw", "Right", "getRight-DKzdypw", "Start", "getStart-DKzdypw", "Up", "getUp-DKzdypw", "animation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker r1) {
                this();
            }

            private Companion() {
            }

            /* JADX INFO: renamed from: getLeft-DKzdypw, reason: not valid java name */
            public final int m46getLeftDKzdypw() {
                return SlideDirection.access$getLeft$cp();
            }

            /* JADX INFO: renamed from: getRight-DKzdypw, reason: not valid java name */
            public final int m47getRightDKzdypw() {
                return SlideDirection.access$getRight$cp();
            }

            /* JADX INFO: renamed from: getUp-DKzdypw, reason: not valid java name */
            public final int m49getUpDKzdypw() {
                return SlideDirection.access$getUp$cp();
            }

            /* JADX INFO: renamed from: getDown-DKzdypw, reason: not valid java name */
            public final int m44getDownDKzdypw() {
                return SlideDirection.access$getDown$cp();
            }

            /* JADX INFO: renamed from: getStart-DKzdypw, reason: not valid java name */
            public final int m48getStartDKzdypw() {
                return SlideDirection.access$getStart$cp();
            }

            /* JADX INFO: renamed from: getEnd-DKzdypw, reason: not valid java name */
            public final int m45getEndDKzdypw() {
                return SlideDirection.access$getEnd$cp();
            }
        }

        /* JADX INFO: renamed from: box-impl, reason: not valid java name */
        public static final /* synthetic */ SlideDirection m37boximpl(int r1) {
            return new SlideDirection(r1);
        }

        /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
        public static int m38constructorimpl(int r0) {
            return r0;
        }

        /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
        public static boolean m39equalsimpl(int r2, Object r3) {
            if ((r3 instanceof SlideDirection) == true) goto L6;
            return false;
        L6:
            if (r2 == ((SlideDirection) r3).m43unboximpl()) goto L8;
            return false;
        L8:
            return true;
        }

        /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
        public static final boolean m40equalsimpl0(int r1, int r2) {
            if (r1 != r2) goto L4;
            return true;
        L4:
            return false;
        }

        /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
        public static int m41hashCodeimpl(int r1) {
            return Integer.hashCode(r1);
        }

        public boolean equals(Object r2) {
            return m39equalsimpl(this.value, r2);
        }

        public int hashCode() {
            return m41hashCodeimpl(this.value);
        }

        /* JADX INFO: renamed from: unbox-impl, reason: not valid java name */
        public final /* synthetic */ int m43unboximpl() {
            return this.value;
        }

        public static final /* synthetic */ int access$getDown$cp() {
            return Down;
        }

        public static final /* synthetic */ int access$getEnd$cp() {
            return End;
        }

        public static final /* synthetic */ int access$getLeft$cp() {
            return Left;
        }

        public static final /* synthetic */ int access$getRight$cp() {
            return Right;
        }

        public static final /* synthetic */ int access$getStart$cp() {
            return Start;
        }

        public static final /* synthetic */ int access$getUp$cp() {
            return Up;
        }

        private /* synthetic */ SlideDirection(int value) {
            this.value = value;
        }

        static {
            Companion = new Companion(null);
            Left = m38constructorimpl(0);
            Right = m38constructorimpl(1);
            Up = m38constructorimpl(2);
            Down = m38constructorimpl(3);
            Start = m38constructorimpl(4);
            End = m38constructorimpl(5);
        }

        public String toString() {
            return m42toStringimpl(this.value);
        }

        /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
        public static String m42toStringimpl(int arg0) {
            if (m40equalsimpl0(arg0, Left) == false) goto L6;
            return "Left";
        L6:
            if (m40equalsimpl0(arg0, Right) == false) goto L9;
            return "Right";
        L9:
            if (m40equalsimpl0(arg0, Up) == false) goto L12;
            return "Up";
        L12:
            if (m40equalsimpl0(arg0, Down) == false) goto L15;
            return "Down";
        L15:
            if (m40equalsimpl0(arg0, Start) == false) goto L18;
            return "Start";
        L18:
            if (m40equalsimpl0(arg0, End) == false) goto L20;
            return "End";
        L20:
            return "Invalid";
        }
    }

    Alignment getContentAlignment();

    /* JADX INFO: renamed from: slideIntoContainer-mOhB8PU, reason: not valid java name */
    EnterTransition mo35slideIntoContainermOhB8PU(int r1, FiniteAnimationSpec<IntOffset> r2, Function1<? super Integer, Integer> r3);

    /* JADX INFO: renamed from: slideOutOfContainer-mOhB8PU, reason: not valid java name */
    ExitTransition mo36slideOutOfContainermOhB8PU(int r1, FiniteAnimationSpec<IntOffset> r2, Function1<? super Integer, Integer> r3);

    ContentTransform using(ContentTransform r1, SizeTransform r2);

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: slideIntoContainer-mOhB8PU$default, reason: not valid java name */
    static /* synthetic */ EnterTransition m33slideIntoContainermOhB8PU$default(AnimatedContentTransitionScope r2, int r3, SpringSpec r4, AnimatedContentTransitionScope$slideIntoContainer$1 r5, int r6, Object r7) {
        if (r7 != null) goto L12;
        if ((r6 & 2) == 0) goto L7;
        r4 = AnimationSpecKt.spring$default(0.0f, 0.0f, IntOffset.m7092boximpl(VisibilityThresholdsKt.getVisibilityThreshold(IntOffset.Companion)), 3, null);
    L7:
        if ((r6 & 4) == 0) goto L10;
        r5 = AnimatedContentTransitionScope$slideIntoContainer$1.INSTANCE;
    L10:
        return r2.mo35slideIntoContainermOhB8PU(r3, r4, r5);
    L12:
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: slideIntoContainer-mOhB8PU");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: slideOutOfContainer-mOhB8PU$default, reason: not valid java name */
    static /* synthetic */ ExitTransition m34slideOutOfContainermOhB8PU$default(AnimatedContentTransitionScope r2, int r3, SpringSpec r4, AnimatedContentTransitionScope$slideOutOfContainer$1 r5, int r6, Object r7) {
        if (r7 != null) goto L12;
        if ((r6 & 2) == 0) goto L7;
        r4 = AnimationSpecKt.spring$default(0.0f, 0.0f, IntOffset.m7092boximpl(VisibilityThresholdsKt.getVisibilityThreshold(IntOffset.Companion)), 3, null);
    L7:
        if ((r6 & 4) == 0) goto L10;
        r5 = AnimatedContentTransitionScope$slideOutOfContainer$1.INSTANCE;
    L10:
        return r2.mo36slideOutOfContainermOhB8PU(r3, r4, r5);
    L12:
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: slideOutOfContainer-mOhB8PU");
    }

    default ExitTransition getKeepUntilTransitionsFinished(ExitTransition.Companion $this$KeepUntilTransitionsFinished) {
        return $this$KeepUntilTransitionsFinished.getKeepUntilTransitionsFinished$animation_release();
    }
}
