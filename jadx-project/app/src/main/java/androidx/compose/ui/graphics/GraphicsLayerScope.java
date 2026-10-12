package androidx.compose.ui.graphics;

import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.layout.PlacementScopeMarker;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.DpRect;
import kotlin.Metadata;

/* JADX INFO: compiled from: GraphicsLayerScope.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\bg\u0018\u00002\u00020\u0001R\u0018\u0010\u0002\u001a\u00020\u0003X¦\u000e¢\u0006\f\u001a\u0004\b\u0004\u0010\u0005\"\u0004\b\u0006\u0010\u0007R*\u0010\b\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t8V@VX\u0096\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\f\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u0018\u0010\u000e\u001a\u00020\u0003X¦\u000e¢\u0006\f\u001a\u0004\b\u000f\u0010\u0005\"\u0004\b\u0010\u0010\u0007R \u0010\u0011\u001a\u00020\u00128fX¦\u000e¢\u0006\u0012\u0012\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R*\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u0019\u001a\u00020\u001a8V@VX\u0096\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\f\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR(\u0010!\u001a\u0004\u0018\u00010 2\b\u0010\u001f\u001a\u0004\u0018\u00010 8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R\u0018\u0010&\u001a\u00020\u0003X¦\u000e¢\u0006\f\u001a\u0004\b'\u0010\u0005\"\u0004\b(\u0010\u0007R\u0018\u0010)\u001a\u00020\u0003X¦\u000e¢\u0006\f\u001a\u0004\b*\u0010\u0005\"\u0004\b+\u0010\u0007R\u0018\u0010,\u001a\u00020\u0003X¦\u000e¢\u0006\f\u001a\u0004\b-\u0010\u0005\"\u0004\b.\u0010\u0007R\u0018\u0010/\u001a\u00020\u0003X¦\u000e¢\u0006\f\u001a\u0004\b0\u0010\u0005\"\u0004\b1\u0010\u0007R\u0018\u00102\u001a\u00020\u0003X¦\u000e¢\u0006\f\u001a\u0004\b3\u0010\u0005\"\u0004\b4\u0010\u0007R\u0018\u00105\u001a\u00020\u0003X¦\u000e¢\u0006\f\u001a\u0004\b6\u0010\u0005\"\u0004\b7\u0010\u0007R\u0018\u00108\u001a\u000209X¦\u000e¢\u0006\f\u001a\u0004\b:\u0010;\"\u0004\b<\u0010=R\u001a\u0010>\u001a\u00020?8VX\u0096\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b@\u0010\u000bR*\u0010A\u001a\u00020\t2\u0006\u0010A\u001a\u00020\t8V@VX\u0096\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\f\u001a\u0004\bB\u0010\u000b\"\u0004\bC\u0010\rR\u001e\u0010D\u001a\u00020EX¦\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\f\u001a\u0004\bF\u0010\u000b\"\u0004\bG\u0010\rR\u0018\u0010H\u001a\u00020\u0003X¦\u000e¢\u0006\f\u001a\u0004\bI\u0010\u0005\"\u0004\bJ\u0010\u0007R\u0018\u0010K\u001a\u00020\u0003X¦\u000e¢\u0006\f\u001a\u0004\bL\u0010\u0005\"\u0004\bM\u0010\u0007ø\u0001\u0002\u0082\u0002\u0011\n\u0005\b¡\u001e0\u0001\n\u0002\b!\n\u0004\b!0\u0001¨\u0006NÀ\u0006\u0003"}, d2 = {"Landroidx/compose/ui/graphics/GraphicsLayerScope;", "Landroidx/compose/ui/unit/Density;", "alpha", "", "getAlpha", "()F", "setAlpha", "(F)V", "ambientShadowColor", "Landroidx/compose/ui/graphics/Color;", "getAmbientShadowColor-0d7_KjU", "()J", "setAmbientShadowColor-8_81llA", "(J)V", "cameraDistance", "getCameraDistance", "setCameraDistance", "clip", "", "getClip$annotations", "()V", "getClip", "()Z", "setClip", "(Z)V", "compositingStrategy", "Landroidx/compose/ui/graphics/CompositingStrategy;", "getCompositingStrategy--NrFUSI", "()I", "setCompositingStrategy-aDBOjCE", "(I)V", "<anonymous parameter 0>", "Landroidx/compose/ui/graphics/RenderEffect;", "renderEffect", "getRenderEffect", "()Landroidx/compose/ui/graphics/RenderEffect;", "setRenderEffect", "(Landroidx/compose/ui/graphics/RenderEffect;)V", "rotationX", "getRotationX", "setRotationX", "rotationY", "getRotationY", "setRotationY", "rotationZ", "getRotationZ", "setRotationZ", "scaleX", "getScaleX", "setScaleX", "scaleY", "getScaleY", "setScaleY", "shadowElevation", "getShadowElevation", "setShadowElevation", "shape", "Landroidx/compose/ui/graphics/Shape;", "getShape", "()Landroidx/compose/ui/graphics/Shape;", "setShape", "(Landroidx/compose/ui/graphics/Shape;)V", "size", "Landroidx/compose/ui/geometry/Size;", "getSize-NH-jbRc", "spotShadowColor", "getSpotShadowColor-0d7_KjU", "setSpotShadowColor-8_81llA", "transformOrigin", "Landroidx/compose/ui/graphics/TransformOrigin;", "getTransformOrigin-SzJe1aQ", "setTransformOrigin-__ExYCQ", "translationX", "getTranslationX", "setTranslationX", "translationY", "getTranslationY", "setTranslationY", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@PlacementScopeMarker
public interface GraphicsLayerScope extends Density {

    /* JADX INFO: compiled from: GraphicsLayerScope.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class DefaultImpls {
        public static /* synthetic */ void getClip$annotations() {
        }

        @Deprecated
        /* JADX INFO: renamed from: roundToPx--R2X_6o, reason: not valid java name */
        public static int m4563roundToPxR2X_6o(GraphicsLayerScope $this, long $receiver) {
            return GraphicsLayerScope.m4535access$roundToPxR2X_6o$jd($this, $receiver);
        }

        @Deprecated
        /* JADX INFO: renamed from: roundToPx-0680j_4, reason: not valid java name */
        public static int m4564roundToPx0680j_4(GraphicsLayerScope $this, float $receiver) {
            return GraphicsLayerScope.m4536access$roundToPx0680j_4$jd($this, $receiver);
        }

        @Deprecated
        /* JADX INFO: renamed from: toDp-GaN1DYA, reason: not valid java name */
        public static float m4568toDpGaN1DYA(GraphicsLayerScope $this, long $receiver) {
            return GraphicsLayerScope.m4540access$toDpGaN1DYA$jd($this, $receiver);
        }

        @Deprecated
        /* JADX INFO: renamed from: toDp-u2uoSUM, reason: not valid java name */
        public static float m4569toDpu2uoSUM(GraphicsLayerScope $this, float $receiver) {
            return GraphicsLayerScope.m4541access$toDpu2uoSUM$jd($this, $receiver);
        }

        @Deprecated
        /* JADX INFO: renamed from: toDp-u2uoSUM, reason: not valid java name */
        public static float m4570toDpu2uoSUM(GraphicsLayerScope $this, int $receiver) {
            return GraphicsLayerScope.m4542access$toDpu2uoSUM$jd($this, $receiver);
        }

        @Deprecated
        /* JADX INFO: renamed from: toDpSize-k-rfVVM, reason: not valid java name */
        public static long m4571toDpSizekrfVVM(GraphicsLayerScope $this, long $receiver) {
            return GraphicsLayerScope.m4543access$toDpSizekrfVVM$jd($this, $receiver);
        }

        @Deprecated
        /* JADX INFO: renamed from: toPx--R2X_6o, reason: not valid java name */
        public static float m4572toPxR2X_6o(GraphicsLayerScope $this, long $receiver) {
            return GraphicsLayerScope.m4544access$toPxR2X_6o$jd($this, $receiver);
        }

        @Deprecated
        /* JADX INFO: renamed from: toPx-0680j_4, reason: not valid java name */
        public static float m4573toPx0680j_4(GraphicsLayerScope $this, float $receiver) {
            return GraphicsLayerScope.m4545access$toPx0680j_4$jd($this, $receiver);
        }

        @Deprecated
        public static Rect toRect(GraphicsLayerScope $this, DpRect $receiver) {
            return GraphicsLayerScope.access$toRect$jd($this, $receiver);
        }

        @Deprecated
        /* JADX INFO: renamed from: toSize-XkaWNTQ, reason: not valid java name */
        public static long m4574toSizeXkaWNTQ(GraphicsLayerScope $this, long $receiver) {
            return GraphicsLayerScope.m4546access$toSizeXkaWNTQ$jd($this, $receiver);
        }

        @Deprecated
        /* JADX INFO: renamed from: toSp-0xMU5do, reason: not valid java name */
        public static long m4575toSp0xMU5do(GraphicsLayerScope $this, float $receiver) {
            return GraphicsLayerScope.m4547access$toSp0xMU5do$jd($this, $receiver);
        }

        @Deprecated
        /* JADX INFO: renamed from: toSp-kPz2Gy4, reason: not valid java name */
        public static long m4576toSpkPz2Gy4(GraphicsLayerScope $this, float $receiver) {
            return GraphicsLayerScope.m4548access$toSpkPz2Gy4$jd($this, $receiver);
        }

        @Deprecated
        /* JADX INFO: renamed from: toSp-kPz2Gy4, reason: not valid java name */
        public static long m4577toSpkPz2Gy4(GraphicsLayerScope $this, int $receiver) {
            return GraphicsLayerScope.m4549access$toSpkPz2Gy4$jd($this, $receiver);
        }

        @Deprecated
        /* JADX INFO: renamed from: getAmbientShadowColor-0d7_KjU, reason: not valid java name */
        public static long m4559getAmbientShadowColor0d7_KjU(GraphicsLayerScope $this) {
            return GraphicsLayerScope.m4531access$getAmbientShadowColor0d7_KjU$jd($this);
        }

        @Deprecated
        /* JADX INFO: renamed from: setAmbientShadowColor-8_81llA, reason: not valid java name */
        public static void m4565setAmbientShadowColor8_81llA(GraphicsLayerScope $this, long ambientShadowColor) {
            GraphicsLayerScope.m4537access$setAmbientShadowColor8_81llA$jd($this, ambientShadowColor);
        }

        @Deprecated
        /* JADX INFO: renamed from: getSpotShadowColor-0d7_KjU, reason: not valid java name */
        public static long m4562getSpotShadowColor0d7_KjU(GraphicsLayerScope $this) {
            return GraphicsLayerScope.m4534access$getSpotShadowColor0d7_KjU$jd($this);
        }

        @Deprecated
        /* JADX INFO: renamed from: setSpotShadowColor-8_81llA, reason: not valid java name */
        public static void m4567setSpotShadowColor8_81llA(GraphicsLayerScope $this, long spotShadowColor) {
            GraphicsLayerScope.m4539access$setSpotShadowColor8_81llA$jd($this, spotShadowColor);
        }

        @Deprecated
        public static RenderEffect getRenderEffect(GraphicsLayerScope $this) {
            return GraphicsLayerScope.access$getRenderEffect$jd($this);
        }

        @Deprecated
        public static void setRenderEffect(GraphicsLayerScope $this, RenderEffect r1) {
            GraphicsLayerScope.access$setRenderEffect$jd($this, r1);
        }

        @Deprecated
        /* JADX INFO: renamed from: getCompositingStrategy--NrFUSI, reason: not valid java name */
        public static int m4560getCompositingStrategyNrFUSI(GraphicsLayerScope $this) {
            return GraphicsLayerScope.m4532access$getCompositingStrategyNrFUSI$jd($this);
        }

        @Deprecated
        /* JADX INFO: renamed from: setCompositingStrategy-aDBOjCE, reason: not valid java name */
        public static void m4566setCompositingStrategyaDBOjCE(GraphicsLayerScope $this, int compositingStrategy) {
            GraphicsLayerScope.m4538access$setCompositingStrategyaDBOjCE$jd($this, compositingStrategy);
        }

        @Deprecated
        /* JADX INFO: renamed from: getSize-NH-jbRc, reason: not valid java name */
        public static long m4561getSizeNHjbRc(GraphicsLayerScope $this) {
            return GraphicsLayerScope.m4533access$getSizeNHjbRc$jd($this);
        }
    }

    float getAlpha();

    float getCameraDistance();

    boolean getClip();

    float getRotationX();

    float getRotationY();

    float getRotationZ();

    float getScaleX();

    float getScaleY();

    float getShadowElevation();

    Shape getShape();

    /* JADX INFO: renamed from: getTransformOrigin-SzJe1aQ, reason: not valid java name */
    long mo4554getTransformOriginSzJe1aQ();

    float getTranslationX();

    float getTranslationY();

    void setAlpha(float r1);

    void setCameraDistance(float r1);

    void setClip(boolean r1);

    void setRotationX(float r1);

    void setRotationY(float r1);

    void setRotationZ(float r1);

    void setScaleX(float r1);

    void setScaleY(float r1);

    void setShadowElevation(float r1);

    void setShape(Shape r1);

    /* JADX INFO: renamed from: setTransformOrigin-__ExYCQ, reason: not valid java name */
    void mo4558setTransformOrigin__ExYCQ(long r1);

    void setTranslationX(float r1);

    void setTranslationY(float r1);

    /* JADX INFO: renamed from: access$getAmbientShadowColor-0d7_KjU$jd, reason: not valid java name */
    static /* synthetic */ long m4531access$getAmbientShadowColor0d7_KjU$jd(GraphicsLayerScope $this) {
        return super.mo4550getAmbientShadowColor0d7_KjU();
    }

    /* JADX INFO: renamed from: access$getCompositingStrategy--NrFUSI$jd, reason: not valid java name */
    static /* synthetic */ int m4532access$getCompositingStrategyNrFUSI$jd(GraphicsLayerScope $this) {
        return super.mo4551getCompositingStrategyNrFUSI();
    }

    static /* synthetic */ RenderEffect access$getRenderEffect$jd(GraphicsLayerScope $this) {
        return super.getRenderEffect();
    }

    /* JADX INFO: renamed from: access$getSize-NH-jbRc$jd, reason: not valid java name */
    static /* synthetic */ long m4533access$getSizeNHjbRc$jd(GraphicsLayerScope $this) {
        return super.mo4552getSizeNHjbRc();
    }

    /* JADX INFO: renamed from: access$getSpotShadowColor-0d7_KjU$jd, reason: not valid java name */
    static /* synthetic */ long m4534access$getSpotShadowColor0d7_KjU$jd(GraphicsLayerScope $this) {
        return super.mo4553getSpotShadowColor0d7_KjU();
    }

    /* JADX INFO: renamed from: access$roundToPx--R2X_6o$jd, reason: not valid java name */
    static /* synthetic */ int m4535access$roundToPxR2X_6o$jd(GraphicsLayerScope $this, long $receiver) {
        return super.mo369roundToPxR2X_6o($receiver);
    }

    /* JADX INFO: renamed from: access$roundToPx-0680j_4$jd, reason: not valid java name */
    static /* synthetic */ int m4536access$roundToPx0680j_4$jd(GraphicsLayerScope $this, float $receiver) {
        return super.mo370roundToPx0680j_4($receiver);
    }

    /* JADX INFO: renamed from: access$setAmbientShadowColor-8_81llA$jd, reason: not valid java name */
    static /* synthetic */ void m4537access$setAmbientShadowColor8_81llA$jd(GraphicsLayerScope $this, long ambientShadowColor) {
        super.mo4555setAmbientShadowColor8_81llA(ambientShadowColor);
    }

    /* JADX INFO: renamed from: access$setCompositingStrategy-aDBOjCE$jd, reason: not valid java name */
    static /* synthetic */ void m4538access$setCompositingStrategyaDBOjCE$jd(GraphicsLayerScope $this, int compositingStrategy) {
        super.mo4556setCompositingStrategyaDBOjCE(compositingStrategy);
    }

    static /* synthetic */ void access$setRenderEffect$jd(GraphicsLayerScope $this, RenderEffect r1) {
        super.setRenderEffect(r1);
    }

    /* JADX INFO: renamed from: access$setSpotShadowColor-8_81llA$jd, reason: not valid java name */
    static /* synthetic */ void m4539access$setSpotShadowColor8_81llA$jd(GraphicsLayerScope $this, long spotShadowColor) {
        super.mo4557setSpotShadowColor8_81llA(spotShadowColor);
    }

    /* JADX INFO: renamed from: access$toDp-GaN1DYA$jd, reason: not valid java name */
    static /* synthetic */ float m4540access$toDpGaN1DYA$jd(GraphicsLayerScope $this, long $receiver) {
        return super.mo371toDpGaN1DYA($receiver);
    }

    /* JADX INFO: renamed from: access$toDp-u2uoSUM$jd, reason: not valid java name */
    static /* synthetic */ float m4541access$toDpu2uoSUM$jd(GraphicsLayerScope $this, float $receiver) {
        return super.mo372toDpu2uoSUM($receiver);
    }

    /* JADX INFO: renamed from: access$toDp-u2uoSUM$jd, reason: not valid java name */
    static /* synthetic */ float m4542access$toDpu2uoSUM$jd(GraphicsLayerScope $this, int $receiver) {
        return super.mo373toDpu2uoSUM($receiver);
    }

    /* JADX INFO: renamed from: access$toDpSize-k-rfVVM$jd, reason: not valid java name */
    static /* synthetic */ long m4543access$toDpSizekrfVVM$jd(GraphicsLayerScope $this, long $receiver) {
        return super.mo374toDpSizekrfVVM($receiver);
    }

    /* JADX INFO: renamed from: access$toPx--R2X_6o$jd, reason: not valid java name */
    static /* synthetic */ float m4544access$toPxR2X_6o$jd(GraphicsLayerScope $this, long $receiver) {
        return super.mo375toPxR2X_6o($receiver);
    }

    /* JADX INFO: renamed from: access$toPx-0680j_4$jd, reason: not valid java name */
    static /* synthetic */ float m4545access$toPx0680j_4$jd(GraphicsLayerScope $this, float $receiver) {
        return super.mo376toPx0680j_4($receiver);
    }

    static /* synthetic */ Rect access$toRect$jd(GraphicsLayerScope $this, DpRect $receiver) {
        return super.toRect($receiver);
    }

    /* JADX INFO: renamed from: access$toSize-XkaWNTQ$jd, reason: not valid java name */
    static /* synthetic */ long m4546access$toSizeXkaWNTQ$jd(GraphicsLayerScope $this, long $receiver) {
        return super.mo377toSizeXkaWNTQ($receiver);
    }

    /* JADX INFO: renamed from: access$toSp-0xMU5do$jd, reason: not valid java name */
    static /* synthetic */ long m4547access$toSp0xMU5do$jd(GraphicsLayerScope $this, float $receiver) {
        return super.mo378toSp0xMU5do($receiver);
    }

    /* JADX INFO: renamed from: access$toSp-kPz2Gy4$jd, reason: not valid java name */
    static /* synthetic */ long m4548access$toSpkPz2Gy4$jd(GraphicsLayerScope $this, float $receiver) {
        return super.mo379toSpkPz2Gy4($receiver);
    }

    /* JADX INFO: renamed from: access$toSp-kPz2Gy4$jd, reason: not valid java name */
    static /* synthetic */ long m4549access$toSpkPz2Gy4$jd(GraphicsLayerScope $this, int $receiver) {
        return super.mo380toSpkPz2Gy4($receiver);
    }

    /* JADX INFO: renamed from: getAmbientShadowColor-0d7_KjU, reason: not valid java name */
    default long mo4550getAmbientShadowColor0d7_KjU() {
        return GraphicsLayerScopeKt.getDefaultShadowColor();
    }

    /* JADX INFO: renamed from: setAmbientShadowColor-8_81llA, reason: not valid java name */
    default void mo4555setAmbientShadowColor8_81llA(long ambientShadowColor) {
    }

    /* JADX INFO: renamed from: getSpotShadowColor-0d7_KjU, reason: not valid java name */
    default long mo4553getSpotShadowColor0d7_KjU() {
        return GraphicsLayerScopeKt.getDefaultShadowColor();
    }

    /* JADX INFO: renamed from: setSpotShadowColor-8_81llA, reason: not valid java name */
    default void mo4557setSpotShadowColor8_81llA(long spotShadowColor) {
    }

    default RenderEffect getRenderEffect() {
        return null;
    }

    default void setRenderEffect(RenderEffect r1) {
    }

    /* JADX INFO: renamed from: getCompositingStrategy--NrFUSI, reason: not valid java name */
    default int mo4551getCompositingStrategyNrFUSI() {
        return CompositingStrategy.Companion.m4454getAutoNrFUSI();
    }

    /* JADX INFO: renamed from: setCompositingStrategy-aDBOjCE, reason: not valid java name */
    default void mo4556setCompositingStrategyaDBOjCE(int compositingStrategy) {
    }

    /* JADX INFO: renamed from: getSize-NH-jbRc, reason: not valid java name */
    default long mo4552getSizeNHjbRc() {
        return Size.Companion.m4202getUnspecifiedNHjbRc();
    }
}
