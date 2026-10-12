package androidx.compose.ui.graphics.drawscope;

import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.ImageBitmap;
import androidx.compose.ui.graphics.layer.GraphicsLayer;
import androidx.compose.ui.unit.DpRect;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: ContentDrawScope.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0004À\u0006\u0003"}, d2 = {"Landroidx/compose/ui/graphics/drawscope/ContentDrawScope;", "Landroidx/compose/ui/graphics/drawscope/DrawScope;", "drawContent", "", "ui-graphics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public interface ContentDrawScope extends DrawScope {

    /* JADX INFO: compiled from: ContentDrawScope.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class DefaultImpls {
        @Deprecated
        /* JADX INFO: renamed from: drawImage-AZ2fEMs, reason: not valid java name */
        public static void m4863drawImageAZ2fEMs(ContentDrawScope $this, ImageBitmap image, long srcOffset, long srcSize, long dstOffset, long dstSize, float alpha, DrawStyle style, ColorFilter colorFilter, int blendMode, int filterQuality) {
            ContentDrawScope.m4847access$drawImageAZ2fEMs$jd($this, image, srcOffset, srcSize, dstOffset, dstSize, alpha, style, colorFilter, blendMode, filterQuality);
        }

        @Deprecated
        /* JADX INFO: renamed from: getCenter-F1C5BW0, reason: not valid java name */
        public static long m4864getCenterF1C5BW0(ContentDrawScope $this) {
            return ContentDrawScope.m4848access$getCenterF1C5BW0$jd($this);
        }

        @Deprecated
        /* JADX INFO: renamed from: getSize-NH-jbRc, reason: not valid java name */
        public static long m4865getSizeNHjbRc(ContentDrawScope $this) {
            return ContentDrawScope.m4849access$getSizeNHjbRc$jd($this);
        }

        @Deprecated
        /* JADX INFO: renamed from: record-JVtK1S4, reason: not valid java name */
        public static void m4866recordJVtK1S4(ContentDrawScope $this, GraphicsLayer $receiver, long size, Function1<? super DrawScope, Unit> r4) {
            ContentDrawScope.m4850access$recordJVtK1S4$jd($this, $receiver, size, r4);
        }

        @Deprecated
        /* JADX INFO: renamed from: roundToPx--R2X_6o, reason: not valid java name */
        public static int m4867roundToPxR2X_6o(ContentDrawScope $this, long $receiver) {
            return ContentDrawScope.m4851access$roundToPxR2X_6o$jd($this, $receiver);
        }

        @Deprecated
        /* JADX INFO: renamed from: roundToPx-0680j_4, reason: not valid java name */
        public static int m4868roundToPx0680j_4(ContentDrawScope $this, float $receiver) {
            return ContentDrawScope.m4852access$roundToPx0680j_4$jd($this, $receiver);
        }

        @Deprecated
        /* JADX INFO: renamed from: toDp-GaN1DYA, reason: not valid java name */
        public static float m4869toDpGaN1DYA(ContentDrawScope $this, long $receiver) {
            return ContentDrawScope.m4853access$toDpGaN1DYA$jd($this, $receiver);
        }

        @Deprecated
        /* JADX INFO: renamed from: toDp-u2uoSUM, reason: not valid java name */
        public static float m4870toDpu2uoSUM(ContentDrawScope $this, float $receiver) {
            return ContentDrawScope.m4854access$toDpu2uoSUM$jd($this, $receiver);
        }

        @Deprecated
        /* JADX INFO: renamed from: toDp-u2uoSUM, reason: not valid java name */
        public static float m4871toDpu2uoSUM(ContentDrawScope $this, int $receiver) {
            return ContentDrawScope.m4855access$toDpu2uoSUM$jd($this, $receiver);
        }

        @Deprecated
        /* JADX INFO: renamed from: toDpSize-k-rfVVM, reason: not valid java name */
        public static long m4872toDpSizekrfVVM(ContentDrawScope $this, long $receiver) {
            return ContentDrawScope.m4856access$toDpSizekrfVVM$jd($this, $receiver);
        }

        @Deprecated
        /* JADX INFO: renamed from: toPx--R2X_6o, reason: not valid java name */
        public static float m4873toPxR2X_6o(ContentDrawScope $this, long $receiver) {
            return ContentDrawScope.m4857access$toPxR2X_6o$jd($this, $receiver);
        }

        @Deprecated
        /* JADX INFO: renamed from: toPx-0680j_4, reason: not valid java name */
        public static float m4874toPx0680j_4(ContentDrawScope $this, float $receiver) {
            return ContentDrawScope.m4858access$toPx0680j_4$jd($this, $receiver);
        }

        @Deprecated
        public static Rect toRect(ContentDrawScope $this, DpRect $receiver) {
            return ContentDrawScope.access$toRect$jd($this, $receiver);
        }

        @Deprecated
        /* JADX INFO: renamed from: toSize-XkaWNTQ, reason: not valid java name */
        public static long m4875toSizeXkaWNTQ(ContentDrawScope $this, long $receiver) {
            return ContentDrawScope.m4859access$toSizeXkaWNTQ$jd($this, $receiver);
        }

        @Deprecated
        /* JADX INFO: renamed from: toSp-0xMU5do, reason: not valid java name */
        public static long m4876toSp0xMU5do(ContentDrawScope $this, float $receiver) {
            return ContentDrawScope.m4860access$toSp0xMU5do$jd($this, $receiver);
        }

        @Deprecated
        /* JADX INFO: renamed from: toSp-kPz2Gy4, reason: not valid java name */
        public static long m4877toSpkPz2Gy4(ContentDrawScope $this, float $receiver) {
            return ContentDrawScope.m4861access$toSpkPz2Gy4$jd($this, $receiver);
        }

        @Deprecated
        /* JADX INFO: renamed from: toSp-kPz2Gy4, reason: not valid java name */
        public static long m4878toSpkPz2Gy4(ContentDrawScope $this, int $receiver) {
            return ContentDrawScope.m4862access$toSpkPz2Gy4$jd($this, $receiver);
        }
    }

    void drawContent();

    /* JADX INFO: renamed from: access$drawImage-AZ2fEMs$jd, reason: not valid java name */
    static /* synthetic */ void m4847access$drawImageAZ2fEMs$jd(ContentDrawScope $this, ImageBitmap image, long srcOffset, long srcSize, long dstOffset, long dstSize, float alpha, DrawStyle style, ColorFilter colorFilter, int blendMode, int filterQuality) {
        super.mo4819drawImageAZ2fEMs(image, srcOffset, srcSize, dstOffset, dstSize, alpha, style, colorFilter, blendMode, filterQuality);
    }

    /* JADX INFO: renamed from: access$getCenter-F1C5BW0$jd, reason: not valid java name */
    static /* synthetic */ long m4848access$getCenterF1C5BW0$jd(ContentDrawScope $this) {
        return super.mo4916getCenterF1C5BW0();
    }

    /* JADX INFO: renamed from: access$getSize-NH-jbRc$jd, reason: not valid java name */
    static /* synthetic */ long m4849access$getSizeNHjbRc$jd(ContentDrawScope $this) {
        return super.mo4917getSizeNHjbRc();
    }

    /* JADX INFO: renamed from: access$record-JVtK1S4$jd, reason: not valid java name */
    static /* synthetic */ void m4850access$recordJVtK1S4$jd(ContentDrawScope $this, GraphicsLayer $receiver, long size, Function1 block) {
        super.mo4918recordJVtK1S4($receiver, size, block);
    }

    /* JADX INFO: renamed from: access$roundToPx--R2X_6o$jd, reason: not valid java name */
    static /* synthetic */ int m4851access$roundToPxR2X_6o$jd(ContentDrawScope $this, long $receiver) {
        return super.mo369roundToPxR2X_6o($receiver);
    }

    /* JADX INFO: renamed from: access$roundToPx-0680j_4$jd, reason: not valid java name */
    static /* synthetic */ int m4852access$roundToPx0680j_4$jd(ContentDrawScope $this, float $receiver) {
        return super.mo370roundToPx0680j_4($receiver);
    }

    /* JADX INFO: renamed from: access$toDp-GaN1DYA$jd, reason: not valid java name */
    static /* synthetic */ float m4853access$toDpGaN1DYA$jd(ContentDrawScope $this, long $receiver) {
        return super.mo371toDpGaN1DYA($receiver);
    }

    /* JADX INFO: renamed from: access$toDp-u2uoSUM$jd, reason: not valid java name */
    static /* synthetic */ float m4854access$toDpu2uoSUM$jd(ContentDrawScope $this, float $receiver) {
        return super.mo372toDpu2uoSUM($receiver);
    }

    /* JADX INFO: renamed from: access$toDp-u2uoSUM$jd, reason: not valid java name */
    static /* synthetic */ float m4855access$toDpu2uoSUM$jd(ContentDrawScope $this, int $receiver) {
        return super.mo373toDpu2uoSUM($receiver);
    }

    /* JADX INFO: renamed from: access$toDpSize-k-rfVVM$jd, reason: not valid java name */
    static /* synthetic */ long m4856access$toDpSizekrfVVM$jd(ContentDrawScope $this, long $receiver) {
        return super.mo374toDpSizekrfVVM($receiver);
    }

    /* JADX INFO: renamed from: access$toPx--R2X_6o$jd, reason: not valid java name */
    static /* synthetic */ float m4857access$toPxR2X_6o$jd(ContentDrawScope $this, long $receiver) {
        return super.mo375toPxR2X_6o($receiver);
    }

    /* JADX INFO: renamed from: access$toPx-0680j_4$jd, reason: not valid java name */
    static /* synthetic */ float m4858access$toPx0680j_4$jd(ContentDrawScope $this, float $receiver) {
        return super.mo376toPx0680j_4($receiver);
    }

    static /* synthetic */ Rect access$toRect$jd(ContentDrawScope $this, DpRect $receiver) {
        return super.toRect($receiver);
    }

    /* JADX INFO: renamed from: access$toSize-XkaWNTQ$jd, reason: not valid java name */
    static /* synthetic */ long m4859access$toSizeXkaWNTQ$jd(ContentDrawScope $this, long $receiver) {
        return super.mo377toSizeXkaWNTQ($receiver);
    }

    /* JADX INFO: renamed from: access$toSp-0xMU5do$jd, reason: not valid java name */
    static /* synthetic */ long m4860access$toSp0xMU5do$jd(ContentDrawScope $this, float $receiver) {
        return super.mo378toSp0xMU5do($receiver);
    }

    /* JADX INFO: renamed from: access$toSp-kPz2Gy4$jd, reason: not valid java name */
    static /* synthetic */ long m4861access$toSpkPz2Gy4$jd(ContentDrawScope $this, float $receiver) {
        return super.mo379toSpkPz2Gy4($receiver);
    }

    /* JADX INFO: renamed from: access$toSp-kPz2Gy4$jd, reason: not valid java name */
    static /* synthetic */ long m4862access$toSpkPz2Gy4$jd(ContentDrawScope $this, int $receiver) {
        return super.mo380toSpkPz2Gy4($receiver);
    }
}
