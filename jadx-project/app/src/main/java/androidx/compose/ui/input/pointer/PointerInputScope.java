package androidx.compose.ui.input.pointer;

import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.platform.ViewConfiguration;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.DpRect;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: SuspendingPointerInputFilter.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J=\u0010\u0016\u001a\u0002H\u0017\"\u0004\b\u0000\u0010\u00172'\u0010\u0018\u001a#\b\u0001\u0012\u0004\u0012\u00020\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00170\u001b\u0012\u0006\u0012\u0004\u0018\u00010\u001c0\u0019¢\u0006\u0002\b\u001dH¦@¢\u0006\u0002\u0010\u001eR\u001a\u0010\u0002\u001a\u00020\u00038VX\u0096\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R*\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u00078V@VX\u0097\u000e¢\u0006\u0012\u0012\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u0018\u0010\u000f\u001a\u00020\u0010X¦\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0005R\u0012\u0010\u0012\u001a\u00020\u0013X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015ø\u0001\u0002\u0082\u0002\u0011\n\u0005\b¡\u001e0\u0001\n\u0002\b!\n\u0004\b!0\u0001¨\u0006\u001fÀ\u0006\u0003"}, d2 = {"Landroidx/compose/ui/input/pointer/PointerInputScope;", "Landroidx/compose/ui/unit/Density;", "extendedTouchPadding", "Landroidx/compose/ui/geometry/Size;", "getExtendedTouchPadding-NH-jbRc", "()J", "<anonymous parameter 0>", "", "interceptOutOfBoundsChildEvents", "getInterceptOutOfBoundsChildEvents$annotations", "()V", "getInterceptOutOfBoundsChildEvents", "()Z", "setInterceptOutOfBoundsChildEvents", "(Z)V", "size", "Landroidx/compose/ui/unit/IntSize;", "getSize-YbymL2g", "viewConfiguration", "Landroidx/compose/ui/platform/ViewConfiguration;", "getViewConfiguration", "()Landroidx/compose/ui/platform/ViewConfiguration;", "awaitPointerEventScope", "R", "block", "Lkotlin/Function2;", "Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;", "Lkotlin/coroutines/Continuation;", "", "Lkotlin/ExtensionFunctionType;", "(Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public interface PointerInputScope extends Density {

    /* JADX INFO: compiled from: SuspendingPointerInputFilter.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class DefaultImpls {
        public static /* synthetic */ void getInterceptOutOfBoundsChildEvents$annotations() {
        }

        @Deprecated
        /* JADX INFO: renamed from: roundToPx--R2X_6o, reason: not valid java name */
        public static int m5627roundToPxR2X_6o(PointerInputScope $this, long $receiver) {
            return PointerInputScope.m5614access$roundToPxR2X_6o$jd($this, $receiver);
        }

        @Deprecated
        /* JADX INFO: renamed from: roundToPx-0680j_4, reason: not valid java name */
        public static int m5628roundToPx0680j_4(PointerInputScope $this, float $receiver) {
            return PointerInputScope.m5615access$roundToPx0680j_4$jd($this, $receiver);
        }

        @Deprecated
        /* JADX INFO: renamed from: toDp-GaN1DYA, reason: not valid java name */
        public static float m5629toDpGaN1DYA(PointerInputScope $this, long $receiver) {
            return PointerInputScope.m5616access$toDpGaN1DYA$jd($this, $receiver);
        }

        @Deprecated
        /* JADX INFO: renamed from: toDp-u2uoSUM, reason: not valid java name */
        public static float m5630toDpu2uoSUM(PointerInputScope $this, float $receiver) {
            return PointerInputScope.m5617access$toDpu2uoSUM$jd($this, $receiver);
        }

        @Deprecated
        /* JADX INFO: renamed from: toDp-u2uoSUM, reason: not valid java name */
        public static float m5631toDpu2uoSUM(PointerInputScope $this, int $receiver) {
            return PointerInputScope.m5618access$toDpu2uoSUM$jd($this, $receiver);
        }

        @Deprecated
        /* JADX INFO: renamed from: toDpSize-k-rfVVM, reason: not valid java name */
        public static long m5632toDpSizekrfVVM(PointerInputScope $this, long $receiver) {
            return PointerInputScope.m5619access$toDpSizekrfVVM$jd($this, $receiver);
        }

        @Deprecated
        /* JADX INFO: renamed from: toPx--R2X_6o, reason: not valid java name */
        public static float m5633toPxR2X_6o(PointerInputScope $this, long $receiver) {
            return PointerInputScope.m5620access$toPxR2X_6o$jd($this, $receiver);
        }

        @Deprecated
        /* JADX INFO: renamed from: toPx-0680j_4, reason: not valid java name */
        public static float m5634toPx0680j_4(PointerInputScope $this, float $receiver) {
            return PointerInputScope.m5621access$toPx0680j_4$jd($this, $receiver);
        }

        @Deprecated
        public static Rect toRect(PointerInputScope $this, DpRect $receiver) {
            return PointerInputScope.access$toRect$jd($this, $receiver);
        }

        @Deprecated
        /* JADX INFO: renamed from: toSize-XkaWNTQ, reason: not valid java name */
        public static long m5635toSizeXkaWNTQ(PointerInputScope $this, long $receiver) {
            return PointerInputScope.m5622access$toSizeXkaWNTQ$jd($this, $receiver);
        }

        @Deprecated
        /* JADX INFO: renamed from: toSp-0xMU5do, reason: not valid java name */
        public static long m5636toSp0xMU5do(PointerInputScope $this, float $receiver) {
            return PointerInputScope.m5623access$toSp0xMU5do$jd($this, $receiver);
        }

        @Deprecated
        /* JADX INFO: renamed from: toSp-kPz2Gy4, reason: not valid java name */
        public static long m5637toSpkPz2Gy4(PointerInputScope $this, float $receiver) {
            return PointerInputScope.m5624access$toSpkPz2Gy4$jd($this, $receiver);
        }

        @Deprecated
        /* JADX INFO: renamed from: toSp-kPz2Gy4, reason: not valid java name */
        public static long m5638toSpkPz2Gy4(PointerInputScope $this, int $receiver) {
            return PointerInputScope.m5625access$toSpkPz2Gy4$jd($this, $receiver);
        }

        @Deprecated
        /* JADX INFO: renamed from: getExtendedTouchPadding-NH-jbRc, reason: not valid java name */
        public static long m5626getExtendedTouchPaddingNHjbRc(PointerInputScope $this) {
            return PointerInputScope.m5613access$getExtendedTouchPaddingNHjbRc$jd($this);
        }

        @Deprecated
        public static boolean getInterceptOutOfBoundsChildEvents(PointerInputScope $this) {
            return PointerInputScope.access$getInterceptOutOfBoundsChildEvents$jd($this);
        }

        @Deprecated
        public static void setInterceptOutOfBoundsChildEvents(PointerInputScope $this, boolean r1) {
            PointerInputScope.access$setInterceptOutOfBoundsChildEvents$jd($this, r1);
        }
    }

    <R> Object awaitPointerEventScope(Function2<? super AwaitPointerEventScope, ? super Continuation<? super R>, ? extends Object> r1, Continuation<? super R> r2);

    /* JADX INFO: renamed from: getSize-YbymL2g */
    long mo367getSizeYbymL2g();

    ViewConfiguration getViewConfiguration();

    /* JADX INFO: renamed from: access$getExtendedTouchPadding-NH-jbRc$jd, reason: not valid java name */
    static /* synthetic */ long m5613access$getExtendedTouchPaddingNHjbRc$jd(PointerInputScope $this) {
        return super.mo366getExtendedTouchPaddingNHjbRc();
    }

    static /* synthetic */ boolean access$getInterceptOutOfBoundsChildEvents$jd(PointerInputScope $this) {
        return super.getInterceptOutOfBoundsChildEvents();
    }

    /* JADX INFO: renamed from: access$roundToPx--R2X_6o$jd, reason: not valid java name */
    static /* synthetic */ int m5614access$roundToPxR2X_6o$jd(PointerInputScope $this, long $receiver) {
        return super.mo369roundToPxR2X_6o($receiver);
    }

    /* JADX INFO: renamed from: access$roundToPx-0680j_4$jd, reason: not valid java name */
    static /* synthetic */ int m5615access$roundToPx0680j_4$jd(PointerInputScope $this, float $receiver) {
        return super.mo370roundToPx0680j_4($receiver);
    }

    static /* synthetic */ void access$setInterceptOutOfBoundsChildEvents$jd(PointerInputScope $this, boolean r1) {
        super.setInterceptOutOfBoundsChildEvents(r1);
    }

    /* JADX INFO: renamed from: access$toDp-GaN1DYA$jd, reason: not valid java name */
    static /* synthetic */ float m5616access$toDpGaN1DYA$jd(PointerInputScope $this, long $receiver) {
        return super.mo371toDpGaN1DYA($receiver);
    }

    /* JADX INFO: renamed from: access$toDp-u2uoSUM$jd, reason: not valid java name */
    static /* synthetic */ float m5617access$toDpu2uoSUM$jd(PointerInputScope $this, float $receiver) {
        return super.mo372toDpu2uoSUM($receiver);
    }

    /* JADX INFO: renamed from: access$toDp-u2uoSUM$jd, reason: not valid java name */
    static /* synthetic */ float m5618access$toDpu2uoSUM$jd(PointerInputScope $this, int $receiver) {
        return super.mo373toDpu2uoSUM($receiver);
    }

    /* JADX INFO: renamed from: access$toDpSize-k-rfVVM$jd, reason: not valid java name */
    static /* synthetic */ long m5619access$toDpSizekrfVVM$jd(PointerInputScope $this, long $receiver) {
        return super.mo374toDpSizekrfVVM($receiver);
    }

    /* JADX INFO: renamed from: access$toPx--R2X_6o$jd, reason: not valid java name */
    static /* synthetic */ float m5620access$toPxR2X_6o$jd(PointerInputScope $this, long $receiver) {
        return super.mo375toPxR2X_6o($receiver);
    }

    /* JADX INFO: renamed from: access$toPx-0680j_4$jd, reason: not valid java name */
    static /* synthetic */ float m5621access$toPx0680j_4$jd(PointerInputScope $this, float $receiver) {
        return super.mo376toPx0680j_4($receiver);
    }

    static /* synthetic */ Rect access$toRect$jd(PointerInputScope $this, DpRect $receiver) {
        return super.toRect($receiver);
    }

    /* JADX INFO: renamed from: access$toSize-XkaWNTQ$jd, reason: not valid java name */
    static /* synthetic */ long m5622access$toSizeXkaWNTQ$jd(PointerInputScope $this, long $receiver) {
        return super.mo377toSizeXkaWNTQ($receiver);
    }

    /* JADX INFO: renamed from: access$toSp-0xMU5do$jd, reason: not valid java name */
    static /* synthetic */ long m5623access$toSp0xMU5do$jd(PointerInputScope $this, float $receiver) {
        return super.mo378toSp0xMU5do($receiver);
    }

    /* JADX INFO: renamed from: access$toSp-kPz2Gy4$jd, reason: not valid java name */
    static /* synthetic */ long m5624access$toSpkPz2Gy4$jd(PointerInputScope $this, float $receiver) {
        return super.mo379toSpkPz2Gy4($receiver);
    }

    /* JADX INFO: renamed from: access$toSp-kPz2Gy4$jd, reason: not valid java name */
    static /* synthetic */ long m5625access$toSpkPz2Gy4$jd(PointerInputScope $this, int $receiver) {
        return super.mo380toSpkPz2Gy4($receiver);
    }

    /* JADX INFO: renamed from: getExtendedTouchPadding-NH-jbRc */
    default long mo366getExtendedTouchPaddingNHjbRc() {
        return Size.Companion.m4203getZeroNHjbRc();
    }

    default boolean getInterceptOutOfBoundsChildEvents() {
        return false;
    }

    default void setInterceptOutOfBoundsChildEvents(boolean r1) {
    }
}
