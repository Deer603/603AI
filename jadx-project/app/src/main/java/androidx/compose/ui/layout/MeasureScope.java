package androidx.compose.ui.layout;

import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.internal.InlineClassHelperKt;
import androidx.compose.ui.unit.DpRect;
import androidx.core.view.ViewCompat;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: MeasureScope.kt */
/* JADX INFO: loaded from: classes.dex */
@MeasureScopeMarker
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001Jd\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00050\b2\u001b\b\u0002\u0010\n\u001a\u0015\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r\u0018\u00010\u000b¢\u0006\u0002\b\u000e2\u0017\u0010\u000f\u001a\u0013\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\r0\u000b¢\u0006\u0002\b\u000eH\u0016JG\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00050\b2\u0017\u0010\u000f\u001a\u0013\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\r0\u000b¢\u0006\u0002\b\u000eH\u0016ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0011À\u0006\u0003"}, d2 = {"Landroidx/compose/ui/layout/MeasureScope;", "Landroidx/compose/ui/layout/IntrinsicMeasureScope;", "layout", "Landroidx/compose/ui/layout/MeasureResult;", "width", "", "height", "alignmentLines", "", "Landroidx/compose/ui/layout/AlignmentLine;", "rulers", "Lkotlin/Function1;", "Landroidx/compose/ui/layout/RulerScope;", "", "Lkotlin/ExtensionFunctionType;", "placementBlock", "Landroidx/compose/ui/layout/Placeable$PlacementScope;", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public interface MeasureScope extends IntrinsicMeasureScope {

    /* JADX INFO: compiled from: MeasureScope.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class DefaultImpls {
        @Deprecated
        public static boolean isLookingAhead(MeasureScope $this) {
            return MeasureScope.access$isLookingAhead$jd($this);
        }

        @Deprecated
        /* JADX INFO: renamed from: roundToPx--R2X_6o, reason: not valid java name */
        public static int m5756roundToPxR2X_6o(MeasureScope $this, long $receiver) {
            return MeasureScope.m5744access$roundToPxR2X_6o$jd($this, $receiver);
        }

        @Deprecated
        /* JADX INFO: renamed from: roundToPx-0680j_4, reason: not valid java name */
        public static int m5757roundToPx0680j_4(MeasureScope $this, float $receiver) {
            return MeasureScope.m5745access$roundToPx0680j_4$jd($this, $receiver);
        }

        @Deprecated
        /* JADX INFO: renamed from: toDp-GaN1DYA, reason: not valid java name */
        public static float m5758toDpGaN1DYA(MeasureScope $this, long $receiver) {
            return MeasureScope.m5746access$toDpGaN1DYA$jd($this, $receiver);
        }

        @Deprecated
        /* JADX INFO: renamed from: toDp-u2uoSUM, reason: not valid java name */
        public static float m5759toDpu2uoSUM(MeasureScope $this, float $receiver) {
            return MeasureScope.m5747access$toDpu2uoSUM$jd($this, $receiver);
        }

        @Deprecated
        /* JADX INFO: renamed from: toDp-u2uoSUM, reason: not valid java name */
        public static float m5760toDpu2uoSUM(MeasureScope $this, int $receiver) {
            return MeasureScope.m5748access$toDpu2uoSUM$jd($this, $receiver);
        }

        @Deprecated
        /* JADX INFO: renamed from: toDpSize-k-rfVVM, reason: not valid java name */
        public static long m5761toDpSizekrfVVM(MeasureScope $this, long $receiver) {
            return MeasureScope.m5749access$toDpSizekrfVVM$jd($this, $receiver);
        }

        @Deprecated
        /* JADX INFO: renamed from: toPx--R2X_6o, reason: not valid java name */
        public static float m5762toPxR2X_6o(MeasureScope $this, long $receiver) {
            return MeasureScope.m5750access$toPxR2X_6o$jd($this, $receiver);
        }

        @Deprecated
        /* JADX INFO: renamed from: toPx-0680j_4, reason: not valid java name */
        public static float m5763toPx0680j_4(MeasureScope $this, float $receiver) {
            return MeasureScope.m5751access$toPx0680j_4$jd($this, $receiver);
        }

        @Deprecated
        public static Rect toRect(MeasureScope $this, DpRect $receiver) {
            return MeasureScope.access$toRect$jd($this, $receiver);
        }

        @Deprecated
        /* JADX INFO: renamed from: toSize-XkaWNTQ, reason: not valid java name */
        public static long m5764toSizeXkaWNTQ(MeasureScope $this, long $receiver) {
            return MeasureScope.m5752access$toSizeXkaWNTQ$jd($this, $receiver);
        }

        @Deprecated
        /* JADX INFO: renamed from: toSp-0xMU5do, reason: not valid java name */
        public static long m5765toSp0xMU5do(MeasureScope $this, float $receiver) {
            return MeasureScope.m5753access$toSp0xMU5do$jd($this, $receiver);
        }

        @Deprecated
        /* JADX INFO: renamed from: toSp-kPz2Gy4, reason: not valid java name */
        public static long m5766toSpkPz2Gy4(MeasureScope $this, float $receiver) {
            return MeasureScope.m5754access$toSpkPz2Gy4$jd($this, $receiver);
        }

        @Deprecated
        /* JADX INFO: renamed from: toSp-kPz2Gy4, reason: not valid java name */
        public static long m5767toSpkPz2Gy4(MeasureScope $this, int $receiver) {
            return MeasureScope.m5755access$toSpkPz2Gy4$jd($this, $receiver);
        }

        @Deprecated
        public static MeasureResult layout(MeasureScope $this, int width, int height, Map<AlignmentLine, Integer> r4, Function1<? super Placeable.PlacementScope, Unit> r5) {
            return MeasureScope.access$layout$jd($this, width, height, r4, r5);
        }

        public static /* synthetic */ MeasureResult layout$default(MeasureScope r0, int r1, int r2, Map r3, Function1 r4, int r5, Object r6) {
            return MeasureScope.layout$default(r0, r1, r2, r3, r4, r5, r6);
        }

        @Deprecated
        public static MeasureResult layout(MeasureScope $this, int width, int height, Map<AlignmentLine, Integer> r4, Function1<? super RulerScope, Unit> r5, Function1<? super Placeable.PlacementScope, Unit> r6) {
            return MeasureScope.access$layout$jd($this, width, height, r4, r5, r6);
        }

        public static /* synthetic */ MeasureResult layout$default(MeasureScope r0, int r1, int r2, Map r3, Function1 r4, Function1 r5, int r6, Object r7) {
            return MeasureScope.layout$default(r0, r1, r2, r3, r4, r5, r6, r7);
        }
    }

    static /* synthetic */ boolean access$isLookingAhead$jd(MeasureScope $this) {
        return super.isLookingAhead();
    }

    static /* synthetic */ MeasureResult access$layout$jd(MeasureScope $this, int width, int height, Map alignmentLines, Function1 placementBlock) {
        return super.layout(width, height, alignmentLines, placementBlock);
    }

    static /* synthetic */ MeasureResult access$layout$jd(MeasureScope $this, int width, int height, Map alignmentLines, Function1 rulers, Function1 placementBlock) {
        return super.layout(width, height, alignmentLines, rulers, placementBlock);
    }

    /* JADX INFO: renamed from: access$roundToPx--R2X_6o$jd, reason: not valid java name */
    static /* synthetic */ int m5744access$roundToPxR2X_6o$jd(MeasureScope $this, long $receiver) {
        return super.mo369roundToPxR2X_6o($receiver);
    }

    /* JADX INFO: renamed from: access$roundToPx-0680j_4$jd, reason: not valid java name */
    static /* synthetic */ int m5745access$roundToPx0680j_4$jd(MeasureScope $this, float $receiver) {
        return super.mo370roundToPx0680j_4($receiver);
    }

    /* JADX INFO: renamed from: access$toDp-GaN1DYA$jd, reason: not valid java name */
    static /* synthetic */ float m5746access$toDpGaN1DYA$jd(MeasureScope $this, long $receiver) {
        return super.mo371toDpGaN1DYA($receiver);
    }

    /* JADX INFO: renamed from: access$toDp-u2uoSUM$jd, reason: not valid java name */
    static /* synthetic */ float m5747access$toDpu2uoSUM$jd(MeasureScope $this, float $receiver) {
        return super.mo372toDpu2uoSUM($receiver);
    }

    /* JADX INFO: renamed from: access$toDp-u2uoSUM$jd, reason: not valid java name */
    static /* synthetic */ float m5748access$toDpu2uoSUM$jd(MeasureScope $this, int $receiver) {
        return super.mo373toDpu2uoSUM($receiver);
    }

    /* JADX INFO: renamed from: access$toDpSize-k-rfVVM$jd, reason: not valid java name */
    static /* synthetic */ long m5749access$toDpSizekrfVVM$jd(MeasureScope $this, long $receiver) {
        return super.mo374toDpSizekrfVVM($receiver);
    }

    /* JADX INFO: renamed from: access$toPx--R2X_6o$jd, reason: not valid java name */
    static /* synthetic */ float m5750access$toPxR2X_6o$jd(MeasureScope $this, long $receiver) {
        return super.mo375toPxR2X_6o($receiver);
    }

    /* JADX INFO: renamed from: access$toPx-0680j_4$jd, reason: not valid java name */
    static /* synthetic */ float m5751access$toPx0680j_4$jd(MeasureScope $this, float $receiver) {
        return super.mo376toPx0680j_4($receiver);
    }

    static /* synthetic */ Rect access$toRect$jd(MeasureScope $this, DpRect $receiver) {
        return super.toRect($receiver);
    }

    /* JADX INFO: renamed from: access$toSize-XkaWNTQ$jd, reason: not valid java name */
    static /* synthetic */ long m5752access$toSizeXkaWNTQ$jd(MeasureScope $this, long $receiver) {
        return super.mo377toSizeXkaWNTQ($receiver);
    }

    /* JADX INFO: renamed from: access$toSp-0xMU5do$jd, reason: not valid java name */
    static /* synthetic */ long m5753access$toSp0xMU5do$jd(MeasureScope $this, float $receiver) {
        return super.mo378toSp0xMU5do($receiver);
    }

    /* JADX INFO: renamed from: access$toSp-kPz2Gy4$jd, reason: not valid java name */
    static /* synthetic */ long m5754access$toSpkPz2Gy4$jd(MeasureScope $this, float $receiver) {
        return super.mo379toSpkPz2Gy4($receiver);
    }

    /* JADX INFO: renamed from: access$toSp-kPz2Gy4$jd, reason: not valid java name */
    static /* synthetic */ long m5755access$toSpkPz2Gy4$jd(MeasureScope $this, int $receiver) {
        return super.mo380toSpkPz2Gy4($receiver);
    }

    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ MeasureResult layout$default(MeasureScope r0, int r1, int r2, Map r3, Function1 r4, int r5, Object r6) {
        if (r6 != null) goto L9;
        if ((r5 & 4) == 0) goto L7;
        r3 = MapsKt.emptyMap();
    L7:
        return r0.layout(r1, r2, r3, r4);
    L9:
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: layout");
    }

    default MeasureResult layout(int width, int height, Map<AlignmentLine, Integer> r9, Function1<? super Placeable.PlacementScope, Unit> r10) {
        return layout(width, height, r9, null, r10);
    }

    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ MeasureResult layout$default(MeasureScope r6, int r7, int r8, Map r9, Function1 r10, Function1 r11, int r12, Object r13) {
        if (r13 != null) goto L14;
        if ((r12 & 4) == 0) goto L6;
        Map r3 = MapsKt.emptyMap();
    L8:
        if ((r12 & 8) == 0) goto L10;
        Function1 r4 = null;
    L12:
        return r6.layout(r7, r8, r3, r4, r11);
    L10:
        r4 = r10;
        goto L12
    L6:
        r3 = r9;
        goto L8
    L14:
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: layout");
    }

    default MeasureResult layout(final int width, final int height, final Map<AlignmentLine, Integer> r11, final Function1<? super RulerScope, Unit> r12, final Function1<? super Placeable.PlacementScope, Unit> r13) {
        if ((width & ViewCompat.MEASURED_STATE_MASK) == 0) goto L5;
    L7:
        boolean value$iv$iv = false;
    L9:
        if (value$iv$iv == true) goto L12;
        InlineClassHelperKt.throwIllegalStateException("Size(" + width + " x " + height + ") is out of range. Each dimension must be between 0 and 16777215.");
    L12:
        return new AnonymousClass1(width, height, r11, r12, this, r13);
    L5:
        if (((-16777216) & height) != 0) goto L7;
        value$iv$iv = true;
        goto L9
    }
}
