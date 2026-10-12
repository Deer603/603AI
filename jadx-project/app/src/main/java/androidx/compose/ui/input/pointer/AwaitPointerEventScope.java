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
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\u0018\u0010\u0011\u001a\u00020\u00032\b\b\u0002\u0010\u0012\u001a\u00020\u0013H¦@¢\u0006\u0002\u0010\u0014JE\u0010\u0015\u001a\u0002H\u0016\"\u0004\b\u0000\u0010\u00162\u0006\u0010\u0017\u001a\u00020\u00182'\u0010\u0019\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00160\u001b\u0012\u0006\u0012\u0004\u0018\u00010\u001c0\u001a¢\u0006\u0002\b\u001dH\u0096@¢\u0006\u0002\u0010\u001eJG\u0010\u001f\u001a\u0004\u0018\u0001H\u0016\"\u0004\b\u0000\u0010\u00162\u0006\u0010\u0017\u001a\u00020\u00182'\u0010\u0019\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00160\u001b\u0012\u0006\u0012\u0004\u0018\u00010\u001c0\u001a¢\u0006\u0002\b\u001dH\u0096@¢\u0006\u0002\u0010\u001eR\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0006\u001a\u00020\u00078VX\u0096\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0018\u0010\n\u001a\u00020\u000bX¦\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\f\u0010\tR\u0012\u0010\r\u001a\u00020\u000eX¦\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010ø\u0001\u0002\u0082\u0002\u0011\n\u0005\b¡\u001e0\u0001\n\u0002\b!\n\u0004\b!0\u0001¨\u0006 À\u0006\u0003"}, d2 = {"Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;", "Landroidx/compose/ui/unit/Density;", "currentEvent", "Landroidx/compose/ui/input/pointer/PointerEvent;", "getCurrentEvent", "()Landroidx/compose/ui/input/pointer/PointerEvent;", "extendedTouchPadding", "Landroidx/compose/ui/geometry/Size;", "getExtendedTouchPadding-NH-jbRc", "()J", "size", "Landroidx/compose/ui/unit/IntSize;", "getSize-YbymL2g", "viewConfiguration", "Landroidx/compose/ui/platform/ViewConfiguration;", "getViewConfiguration", "()Landroidx/compose/ui/platform/ViewConfiguration;", "awaitPointerEvent", "pass", "Landroidx/compose/ui/input/pointer/PointerEventPass;", "(Landroidx/compose/ui/input/pointer/PointerEventPass;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "withTimeout", "T", "timeMillis", "", "block", "Lkotlin/Function2;", "Lkotlin/coroutines/Continuation;", "", "Lkotlin/ExtensionFunctionType;", "(JLkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "withTimeoutOrNull", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public interface AwaitPointerEventScope extends Density {

    /* JADX INFO: compiled from: SuspendingPointerInputFilter.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class DefaultImpls {
        @Deprecated
        /* JADX INFO: renamed from: roundToPx--R2X_6o, reason: not valid java name */
        public static int m5500roundToPxR2X_6o(AwaitPointerEventScope $this, long $receiver) {
            return AwaitPointerEventScope.m5485access$roundToPxR2X_6o$jd($this, $receiver);
        }

        @Deprecated
        /* JADX INFO: renamed from: roundToPx-0680j_4, reason: not valid java name */
        public static int m5501roundToPx0680j_4(AwaitPointerEventScope $this, float $receiver) {
            return AwaitPointerEventScope.m5486access$roundToPx0680j_4$jd($this, $receiver);
        }

        @Deprecated
        /* JADX INFO: renamed from: toDp-GaN1DYA, reason: not valid java name */
        public static float m5502toDpGaN1DYA(AwaitPointerEventScope $this, long $receiver) {
            return AwaitPointerEventScope.m5487access$toDpGaN1DYA$jd($this, $receiver);
        }

        @Deprecated
        /* JADX INFO: renamed from: toDp-u2uoSUM, reason: not valid java name */
        public static float m5503toDpu2uoSUM(AwaitPointerEventScope $this, float $receiver) {
            return AwaitPointerEventScope.m5488access$toDpu2uoSUM$jd($this, $receiver);
        }

        @Deprecated
        /* JADX INFO: renamed from: toDp-u2uoSUM, reason: not valid java name */
        public static float m5504toDpu2uoSUM(AwaitPointerEventScope $this, int $receiver) {
            return AwaitPointerEventScope.m5489access$toDpu2uoSUM$jd($this, $receiver);
        }

        @Deprecated
        /* JADX INFO: renamed from: toDpSize-k-rfVVM, reason: not valid java name */
        public static long m5505toDpSizekrfVVM(AwaitPointerEventScope $this, long $receiver) {
            return AwaitPointerEventScope.m5490access$toDpSizekrfVVM$jd($this, $receiver);
        }

        @Deprecated
        /* JADX INFO: renamed from: toPx--R2X_6o, reason: not valid java name */
        public static float m5506toPxR2X_6o(AwaitPointerEventScope $this, long $receiver) {
            return AwaitPointerEventScope.m5491access$toPxR2X_6o$jd($this, $receiver);
        }

        @Deprecated
        /* JADX INFO: renamed from: toPx-0680j_4, reason: not valid java name */
        public static float m5507toPx0680j_4(AwaitPointerEventScope $this, float $receiver) {
            return AwaitPointerEventScope.m5492access$toPx0680j_4$jd($this, $receiver);
        }

        @Deprecated
        public static Rect toRect(AwaitPointerEventScope $this, DpRect $receiver) {
            return AwaitPointerEventScope.access$toRect$jd($this, $receiver);
        }

        @Deprecated
        /* JADX INFO: renamed from: toSize-XkaWNTQ, reason: not valid java name */
        public static long m5508toSizeXkaWNTQ(AwaitPointerEventScope $this, long $receiver) {
            return AwaitPointerEventScope.m5493access$toSizeXkaWNTQ$jd($this, $receiver);
        }

        @Deprecated
        /* JADX INFO: renamed from: toSp-0xMU5do, reason: not valid java name */
        public static long m5509toSp0xMU5do(AwaitPointerEventScope $this, float $receiver) {
            return AwaitPointerEventScope.m5494access$toSp0xMU5do$jd($this, $receiver);
        }

        @Deprecated
        /* JADX INFO: renamed from: toSp-kPz2Gy4, reason: not valid java name */
        public static long m5510toSpkPz2Gy4(AwaitPointerEventScope $this, float $receiver) {
            return AwaitPointerEventScope.m5495access$toSpkPz2Gy4$jd($this, $receiver);
        }

        @Deprecated
        /* JADX INFO: renamed from: toSp-kPz2Gy4, reason: not valid java name */
        public static long m5511toSpkPz2Gy4(AwaitPointerEventScope $this, int $receiver) {
            return AwaitPointerEventScope.m5496access$toSpkPz2Gy4$jd($this, $receiver);
        }

        @Deprecated
        /* JADX INFO: renamed from: getExtendedTouchPadding-NH-jbRc, reason: not valid java name */
        public static long m5499getExtendedTouchPaddingNHjbRc(AwaitPointerEventScope $this) {
            return AwaitPointerEventScope.m5484access$getExtendedTouchPaddingNHjbRc$jd($this);
        }

        public static /* synthetic */ Object awaitPointerEvent$default(AwaitPointerEventScope r0, PointerEventPass r1, Continuation r2, int r3, Object r4) {
            return AwaitPointerEventScope.awaitPointerEvent$default(r0, r1, r2, r3, r4);
        }

        @Deprecated
        public static <T> Object withTimeoutOrNull(AwaitPointerEventScope $this, long timeMillis, Function2<? super AwaitPointerEventScope, ? super Continuation<? super T>, ? extends Object> r4, Continuation<? super T> r5) {
            return AwaitPointerEventScope.access$withTimeoutOrNull$jd($this, timeMillis, r4, r5);
        }

        @Deprecated
        public static <T> Object withTimeout(AwaitPointerEventScope $this, long timeMillis, Function2<? super AwaitPointerEventScope, ? super Continuation<? super T>, ? extends Object> r4, Continuation<? super T> r5) {
            return AwaitPointerEventScope.access$withTimeout$jd($this, timeMillis, r4, r5);
        }
    }

    Object awaitPointerEvent(PointerEventPass r1, Continuation<? super PointerEvent> r2);

    PointerEvent getCurrentEvent();

    /* JADX INFO: renamed from: getSize-YbymL2g, reason: not valid java name */
    long mo5498getSizeYbymL2g();

    ViewConfiguration getViewConfiguration();

    default <T> Object withTimeout(long r2, Function2<? super AwaitPointerEventScope, ? super Continuation<? super T>, ? extends Object> r4, Continuation<? super T> r5) {
        return withTimeout$suspendImpl(this, r2, r4, r5);
    }

    default <T> Object withTimeoutOrNull(long r2, Function2<? super AwaitPointerEventScope, ? super Continuation<? super T>, ? extends Object> r4, Continuation<? super T> r5) {
        return withTimeoutOrNull$suspendImpl(this, r2, r4, r5);
    }

    /* JADX INFO: renamed from: access$getExtendedTouchPadding-NH-jbRc$jd, reason: not valid java name */
    static /* synthetic */ long m5484access$getExtendedTouchPaddingNHjbRc$jd(AwaitPointerEventScope $this) {
        return super.mo5497getExtendedTouchPaddingNHjbRc();
    }

    /* JADX INFO: renamed from: access$roundToPx--R2X_6o$jd, reason: not valid java name */
    static /* synthetic */ int m5485access$roundToPxR2X_6o$jd(AwaitPointerEventScope $this, long $receiver) {
        return super.mo369roundToPxR2X_6o($receiver);
    }

    /* JADX INFO: renamed from: access$roundToPx-0680j_4$jd, reason: not valid java name */
    static /* synthetic */ int m5486access$roundToPx0680j_4$jd(AwaitPointerEventScope $this, float $receiver) {
        return super.mo370roundToPx0680j_4($receiver);
    }

    /* JADX INFO: renamed from: access$toDp-GaN1DYA$jd, reason: not valid java name */
    static /* synthetic */ float m5487access$toDpGaN1DYA$jd(AwaitPointerEventScope $this, long $receiver) {
        return super.mo371toDpGaN1DYA($receiver);
    }

    /* JADX INFO: renamed from: access$toDp-u2uoSUM$jd, reason: not valid java name */
    static /* synthetic */ float m5488access$toDpu2uoSUM$jd(AwaitPointerEventScope $this, float $receiver) {
        return super.mo372toDpu2uoSUM($receiver);
    }

    /* JADX INFO: renamed from: access$toDp-u2uoSUM$jd, reason: not valid java name */
    static /* synthetic */ float m5489access$toDpu2uoSUM$jd(AwaitPointerEventScope $this, int $receiver) {
        return super.mo373toDpu2uoSUM($receiver);
    }

    /* JADX INFO: renamed from: access$toDpSize-k-rfVVM$jd, reason: not valid java name */
    static /* synthetic */ long m5490access$toDpSizekrfVVM$jd(AwaitPointerEventScope $this, long $receiver) {
        return super.mo374toDpSizekrfVVM($receiver);
    }

    /* JADX INFO: renamed from: access$toPx--R2X_6o$jd, reason: not valid java name */
    static /* synthetic */ float m5491access$toPxR2X_6o$jd(AwaitPointerEventScope $this, long $receiver) {
        return super.mo375toPxR2X_6o($receiver);
    }

    /* JADX INFO: renamed from: access$toPx-0680j_4$jd, reason: not valid java name */
    static /* synthetic */ float m5492access$toPx0680j_4$jd(AwaitPointerEventScope $this, float $receiver) {
        return super.mo376toPx0680j_4($receiver);
    }

    static /* synthetic */ Rect access$toRect$jd(AwaitPointerEventScope $this, DpRect $receiver) {
        return super.toRect($receiver);
    }

    /* JADX INFO: renamed from: access$toSize-XkaWNTQ$jd, reason: not valid java name */
    static /* synthetic */ long m5493access$toSizeXkaWNTQ$jd(AwaitPointerEventScope $this, long $receiver) {
        return super.mo377toSizeXkaWNTQ($receiver);
    }

    /* JADX INFO: renamed from: access$toSp-0xMU5do$jd, reason: not valid java name */
    static /* synthetic */ long m5494access$toSp0xMU5do$jd(AwaitPointerEventScope $this, float $receiver) {
        return super.mo378toSp0xMU5do($receiver);
    }

    /* JADX INFO: renamed from: access$toSp-kPz2Gy4$jd, reason: not valid java name */
    static /* synthetic */ long m5495access$toSpkPz2Gy4$jd(AwaitPointerEventScope $this, float $receiver) {
        return super.mo379toSpkPz2Gy4($receiver);
    }

    /* JADX INFO: renamed from: access$toSp-kPz2Gy4$jd, reason: not valid java name */
    static /* synthetic */ long m5496access$toSpkPz2Gy4$jd(AwaitPointerEventScope $this, int $receiver) {
        return super.mo380toSpkPz2Gy4($receiver);
    }

    static /* synthetic */ Object access$withTimeout$jd(AwaitPointerEventScope $this, long timeMillis, Function2 block, Continuation $completion) {
        return super.withTimeout(timeMillis, block, $completion);
    }

    static /* synthetic */ Object access$withTimeoutOrNull$jd(AwaitPointerEventScope $this, long timeMillis, Function2 block, Continuation $completion) {
        return super.withTimeoutOrNull(timeMillis, block, $completion);
    }

    /* JADX INFO: renamed from: getExtendedTouchPadding-NH-jbRc, reason: not valid java name */
    default long mo5497getExtendedTouchPaddingNHjbRc() {
        return Size.Companion.m4203getZeroNHjbRc();
    }

    static /* synthetic */ Object awaitPointerEvent$default(AwaitPointerEventScope r0, PointerEventPass r1, Continuation r2, int r3, Object r4) {
        if (r4 != null) goto L9;
        if ((r3 & 1) == 0) goto L7;
        r1 = PointerEventPass.Main;
    L7:
        return r0.awaitPointerEvent(r1, r2);
    L9:
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: awaitPointerEvent");
    }

    static /* synthetic */ <T> Object withTimeoutOrNull$suspendImpl(AwaitPointerEventScope $this, long timeMillis, Function2<? super AwaitPointerEventScope, ? super Continuation<? super T>, ? extends Object> r4, Continuation<? super T> r5) {
        return r4.invoke($this, r5);
    }

    static /* synthetic */ <T> Object withTimeout$suspendImpl(AwaitPointerEventScope $this, long timeMillis, Function2<? super AwaitPointerEventScope, ? super Continuation<? super T>, ? extends Object> r4, Continuation<? super T> r5) {
        return r4.invoke($this, r5);
    }
}
