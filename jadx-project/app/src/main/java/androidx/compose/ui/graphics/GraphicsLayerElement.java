package androidx.compose.ui.graphics;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: GraphicsLayerModifier.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b5\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u008f\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\u0006\u0010\t\u001a\u00020\u0004\u0012\u0006\u0010\n\u001a\u00020\u0004\u0012\u0006\u0010\u000b\u001a\u00020\u0004\u0012\u0006\u0010\f\u001a\u00020\u0004\u0012\u0006\u0010\r\u001a\u00020\u0004\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\u0006\u0010\u0012\u001a\u00020\u0013\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015\u0012\u0006\u0010\u0016\u001a\u00020\u0017\u0012\u0006\u0010\u0018\u001a\u00020\u0017\u0012\u0006\u0010\u0019\u001a\u00020\u001a¢\u0006\u0002\u0010\u001bJ\t\u00105\u001a\u00020\u0004HÆ\u0003J\t\u00106\u001a\u00020\u0004HÆ\u0003J\u0016\u00107\u001a\u00020\u000fHÆ\u0003ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b8\u0010\u001fJ\t\u00109\u001a\u00020\u0011HÆ\u0003J\t\u0010:\u001a\u00020\u0013HÆ\u0003J\u000b\u0010;\u001a\u0004\u0018\u00010\u0015HÆ\u0003J\u0016\u0010<\u001a\u00020\u0017HÆ\u0003ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b=\u0010\u001fJ\u0016\u0010>\u001a\u00020\u0017HÆ\u0003ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b?\u0010\u001fJ\u0016\u0010@\u001a\u00020\u001aHÆ\u0003ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\bA\u0010%J\t\u0010B\u001a\u00020\u0004HÆ\u0003J\t\u0010C\u001a\u00020\u0004HÆ\u0003J\t\u0010D\u001a\u00020\u0004HÆ\u0003J\t\u0010E\u001a\u00020\u0004HÆ\u0003J\t\u0010F\u001a\u00020\u0004HÆ\u0003J\t\u0010G\u001a\u00020\u0004HÆ\u0003J\t\u0010H\u001a\u00020\u0004HÆ\u0003J\t\u0010I\u001a\u00020\u0004HÆ\u0003J¿\u0001\u0010J\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u00042\b\b\u0002\u0010\t\u001a\u00020\u00042\b\b\u0002\u0010\n\u001a\u00020\u00042\b\b\u0002\u0010\u000b\u001a\u00020\u00042\b\b\u0002\u0010\f\u001a\u00020\u00042\b\b\u0002\u0010\r\u001a\u00020\u00042\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u00132\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00152\b\b\u0002\u0010\u0016\u001a\u00020\u00172\b\b\u0002\u0010\u0018\u001a\u00020\u00172\b\b\u0002\u0010\u0019\u001a\u00020\u001aHÆ\u0001ø\u0001\u0000¢\u0006\u0004\bK\u0010LJ\b\u0010M\u001a\u00020\u0002H\u0016J\u0013\u0010N\u001a\u00020\u00132\b\u0010O\u001a\u0004\u0018\u00010PHÖ\u0003J\t\u0010Q\u001a\u00020RHÖ\u0001J\t\u0010S\u001a\u00020THÖ\u0001J\u0010\u0010U\u001a\u00020V2\u0006\u0010W\u001a\u00020\u0002H\u0016J\f\u0010X\u001a\u00020V*\u00020YH\u0016R\u0011\u0010\u0006\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0019\u0010\u0016\u001a\u00020\u0017ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010 \u001a\u0004\b\u001e\u0010\u001fR\u0011\u0010\r\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u001dR\u0011\u0010\u0012\u001a\u00020\u0013¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0019\u0010\u0019\u001a\u00020\u001aø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010&\u001a\u0004\b$\u0010%R\u0013\u0010\u0014\u001a\u0004\u0018\u00010\u0015¢\u0006\b\n\u0000\u001a\u0004\b'\u0010(R\u0011\u0010\n\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b)\u0010\u001dR\u0011\u0010\u000b\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b*\u0010\u001dR\u0011\u0010\f\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b+\u0010\u001dR\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b,\u0010\u001dR\u0011\u0010\u0005\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b-\u0010\u001dR\u0011\u0010\t\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b.\u0010\u001dR\u0011\u0010\u0010\u001a\u00020\u0011¢\u0006\b\n\u0000\u001a\u0004\b/\u00100R\u0019\u0010\u0018\u001a\u00020\u0017ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010 \u001a\u0004\b1\u0010\u001fR\u0019\u0010\u000e\u001a\u00020\u000fø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010 \u001a\u0004\b2\u0010\u001fR\u0011\u0010\u0007\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b3\u0010\u001dR\u0011\u0010\b\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b4\u0010\u001d\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006Z"}, d2 = {"Landroidx/compose/ui/graphics/GraphicsLayerElement;", "Landroidx/compose/ui/node/ModifierNodeElement;", "Landroidx/compose/ui/graphics/SimpleGraphicsLayerModifier;", "scaleX", "", "scaleY", "alpha", "translationX", "translationY", "shadowElevation", "rotationX", "rotationY", "rotationZ", "cameraDistance", "transformOrigin", "Landroidx/compose/ui/graphics/TransformOrigin;", "shape", "Landroidx/compose/ui/graphics/Shape;", "clip", "", "renderEffect", "Landroidx/compose/ui/graphics/RenderEffect;", "ambientShadowColor", "Landroidx/compose/ui/graphics/Color;", "spotShadowColor", "compositingStrategy", "Landroidx/compose/ui/graphics/CompositingStrategy;", "(FFFFFFFFFFJLandroidx/compose/ui/graphics/Shape;ZLandroidx/compose/ui/graphics/RenderEffect;JJILkotlin/jvm/internal/DefaultConstructorMarker;)V", "getAlpha", "()F", "getAmbientShadowColor-0d7_KjU", "()J", "J", "getCameraDistance", "getClip", "()Z", "getCompositingStrategy--NrFUSI", "()I", "I", "getRenderEffect", "()Landroidx/compose/ui/graphics/RenderEffect;", "getRotationX", "getRotationY", "getRotationZ", "getScaleX", "getScaleY", "getShadowElevation", "getShape", "()Landroidx/compose/ui/graphics/Shape;", "getSpotShadowColor-0d7_KjU", "getTransformOrigin-SzJe1aQ", "getTranslationX", "getTranslationY", "component1", "component10", "component11", "component11-SzJe1aQ", "component12", "component13", "component14", "component15", "component15-0d7_KjU", "component16", "component16-0d7_KjU", "component17", "component17--NrFUSI", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "copy-JVvOYNQ", "(FFFFFFFFFFJLandroidx/compose/ui/graphics/Shape;ZLandroidx/compose/ui/graphics/RenderEffect;JJI)Landroidx/compose/ui/graphics/GraphicsLayerElement;", "create", "equals", "other", "", "hashCode", "", "toString", "", "update", "", "node", "inspectableProperties", "Landroidx/compose/ui/platform/InspectorInfo;", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
final class GraphicsLayerElement extends ModifierNodeElement<SimpleGraphicsLayerModifier> {
    private final float alpha;
    private final long ambientShadowColor;
    private final float cameraDistance;
    private final boolean clip;
    private final int compositingStrategy;
    private final RenderEffect renderEffect;
    private final float rotationX;
    private final float rotationY;
    private final float rotationZ;
    private final float scaleX;
    private final float scaleY;
    private final float shadowElevation;
    private final Shape shape;
    private final long spotShadowColor;
    private final long transformOrigin;
    private final float translationX;
    private final float translationY;

    public /* synthetic */ GraphicsLayerElement(float r1, float r2, float r3, float r4, float r5, float r6, float r7, float r8, float r9, float r10, long r11, Shape r13, boolean r14, RenderEffect r15, long r16, long r18, int r20, DefaultConstructorMarker r21) {
        this(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r13, r14, r15, r16, r18, r20);
    }

    /* JADX INFO: renamed from: copy-JVvOYNQ$default, reason: not valid java name */
    public static /* synthetic */ GraphicsLayerElement m4513copyJVvOYNQ$default(GraphicsLayerElement r17, float r18, float r19, float r20, float r21, float r22, float r23, float r24, float r25, float r26, float r27, long r28, Shape r30, boolean r31, RenderEffect r32, long r33, long r35, int r37, int r38, Object r39) {
        if ((r38 & 1) == 0) goto L5;
        float r2 = r17.scaleX;
    L7:
        if ((r38 & 2) == 0) goto L9;
        float r3 = r17.scaleY;
    L11:
        if ((r38 & 4) == 0) goto L13;
        float r4 = r17.alpha;
    L15:
        if ((r38 & 8) == 0) goto L17;
        float r5 = r17.translationX;
    L19:
        if ((r38 & 16) == 0) goto L21;
        float r6 = r17.translationY;
    L23:
        if ((r38 & 32) == 0) goto L25;
        float r7 = r17.shadowElevation;
    L27:
        if ((r38 & 64) == 0) goto L29;
        float r8 = r17.rotationX;
    L31:
        if ((r38 & 128) == 0) goto L33;
        float r9 = r17.rotationY;
    L35:
        if ((r38 & 256) == 0) goto L37;
        float r10 = r17.rotationZ;
    L39:
        if ((r38 & 512) == 0) goto L41;
        float r11 = r17.cameraDistance;
    L43:
        if ((r38 & 1024) == 0) goto L45;
        long r12 = r17.transformOrigin;
    L47:
        if ((r38 & 2048) == 0) goto L49;
        Shape r14 = r17.shape;
    L51:
        if ((r38 & 4096) == 0) goto L53;
        boolean r15 = r17.clip;
    L54:
        float r110 = r2;
        if ((r38 & 8192) == 0) goto L57;
        RenderEffect r13 = r17.renderEffect;
    L58:
        RenderEffect r111 = r13;
        if ((r38 & 16384) == 0) goto L61;
        long r1 = r17.ambientShadowColor;
    L62:
        long r29 = r1;
        if ((r38 & 32768) == 0) goto L65;
        long r16 = r17.spotShadowColor;
    L67:
        if ((r38 & 65536) == 0) goto L69;
        long r210 = r16;
        long r36 = r210;
        int r310 = r17.compositingStrategy;
    L71:
        return r17.m4518copyJVvOYNQ(r110, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r14, r15, r111, r29, r36, r310);
    L69:
        r310 = r37;
        r36 = r16;
        goto L71
    L65:
        r16 = r35;
        goto L67
    L61:
        r1 = r33;
        goto L62
    L57:
        r13 = r32;
        goto L58
    L53:
        r15 = r31;
        goto L54
    L49:
        r14 = r30;
        goto L51
    L45:
        r12 = r28;
        goto L47
    L41:
        r11 = r27;
        goto L43
    L37:
        r10 = r26;
        goto L39
    L33:
        r9 = r25;
        goto L35
    L29:
        r8 = r24;
        goto L31
    L25:
        r7 = r23;
        goto L27
    L21:
        r6 = r22;
        goto L23
    L17:
        r5 = r21;
        goto L19
    L13:
        r4 = r20;
        goto L15
    L9:
        r3 = r19;
        goto L11
    L5:
        r2 = r18;
        goto L7
    }

    public final float component1() {
        return this.scaleX;
    }

    public final float component10() {
        return this.cameraDistance;
    }

    /* JADX INFO: renamed from: component11-SzJe1aQ, reason: not valid java name */
    public final long m4514component11SzJe1aQ() {
        return this.transformOrigin;
    }

    public final Shape component12() {
        return this.shape;
    }

    public final boolean component13() {
        return this.clip;
    }

    public final RenderEffect component14() {
        return this.renderEffect;
    }

    /* JADX INFO: renamed from: component15-0d7_KjU, reason: not valid java name */
    public final long m4515component150d7_KjU() {
        return this.ambientShadowColor;
    }

    /* JADX INFO: renamed from: component16-0d7_KjU, reason: not valid java name */
    public final long m4516component160d7_KjU() {
        return this.spotShadowColor;
    }

    /* JADX INFO: renamed from: component17--NrFUSI, reason: not valid java name */
    public final int m4517component17NrFUSI() {
        return this.compositingStrategy;
    }

    public final float component2() {
        return this.scaleY;
    }

    public final float component3() {
        return this.alpha;
    }

    public final float component4() {
        return this.translationX;
    }

    public final float component5() {
        return this.translationY;
    }

    public final float component6() {
        return this.shadowElevation;
    }

    public final float component7() {
        return this.rotationX;
    }

    public final float component8() {
        return this.rotationY;
    }

    public final float component9() {
        return this.rotationZ;
    }

    /* JADX INFO: renamed from: copy-JVvOYNQ, reason: not valid java name */
    public final GraphicsLayerElement m4518copyJVvOYNQ(float r23, float r24, float r25, float r26, float r27, float r28, float r29, float r30, float r31, float r32, long r33, Shape r35, boolean r36, RenderEffect r37, long r38, long r40, int r42) {
        return new GraphicsLayerElement(r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r35, r36, r37, r38, r40, r42, null);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public boolean equals(Object r8) {
        if (this != r8) goto L6;
        return true;
    L6:
        if ((r8 instanceof GraphicsLayerElement) == true) goto L8;
        return false;
    L8:
        GraphicsLayerElement r1 = (GraphicsLayerElement) r8;
        if (Float.compare(this.scaleX, r1.scaleX) == 0) goto L12;
        return false;
    L12:
        if (Float.compare(this.scaleY, r1.scaleY) == 0) goto L15;
        return false;
    L15:
        if (Float.compare(this.alpha, r1.alpha) == 0) goto L18;
        return false;
    L18:
        if (Float.compare(this.translationX, r1.translationX) == 0) goto L21;
        return false;
    L21:
        if (Float.compare(this.translationY, r1.translationY) == 0) goto L24;
        return false;
    L24:
        if (Float.compare(this.shadowElevation, r1.shadowElevation) == 0) goto L27;
        return false;
    L27:
        if (Float.compare(this.rotationX, r1.rotationX) == 0) goto L30;
        return false;
    L30:
        if (Float.compare(this.rotationY, r1.rotationY) == 0) goto L33;
        return false;
    L33:
        if (Float.compare(this.rotationZ, r1.rotationZ) == 0) goto L36;
        return false;
    L36:
        if (Float.compare(this.cameraDistance, r1.cameraDistance) == 0) goto L39;
        return false;
    L39:
        if (TransformOrigin.m4751equalsimpl0(this.transformOrigin, r1.transformOrigin) == true) goto L42;
        return false;
    L42:
        if (Intrinsics.areEqual(this.shape, r1.shape) == true) goto L45;
        return false;
    L45:
        if (this.clip == r1.clip) goto L48;
        return false;
    L48:
        if (Intrinsics.areEqual(this.renderEffect, r1.renderEffect) == true) goto L51;
        return false;
    L51:
        if (Color.m4367equalsimpl0(this.ambientShadowColor, r1.ambientShadowColor) == true) goto L54;
        return false;
    L54:
        if (Color.m4367equalsimpl0(this.spotShadowColor, r1.spotShadowColor) == true) goto L57;
        return false;
    L57:
        if (CompositingStrategy.m4450equalsimpl0(this.compositingStrategy, r1.compositingStrategy) == true) goto L59;
        return false;
    L59:
        return true;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public int hashCode() {
        int r1 = ((((((((((((((((((((((((Float.hashCode(this.scaleX) * 31) + Float.hashCode(this.scaleY)) * 31) + Float.hashCode(this.alpha)) * 31) + Float.hashCode(this.translationX)) * 31) + Float.hashCode(this.translationY)) * 31) + Float.hashCode(this.shadowElevation)) * 31) + Float.hashCode(this.rotationX)) * 31) + Float.hashCode(this.rotationY)) * 31) + Float.hashCode(this.rotationZ)) * 31) + Float.hashCode(this.cameraDistance)) * 31) + TransformOrigin.m4754hashCodeimpl(this.transformOrigin)) * 31) + this.shape.hashCode()) * 31) + Boolean.hashCode(this.clip)) * 31;
        if (this.renderEffect != null) goto L5;
        int r2 = 0;
    L7:
        return ((((((r1 + r2) * 31) + Color.m4373hashCodeimpl(this.ambientShadowColor)) * 31) + Color.m4373hashCodeimpl(this.spotShadowColor)) * 31) + CompositingStrategy.m4451hashCodeimpl(this.compositingStrategy);
    L5:
        r2 = this.renderEffect.hashCode();
        goto L7
    }

    public String toString() {
        StringBuilder r0 = new StringBuilder();
        r0.append("GraphicsLayerElement(scaleX=").append(this.scaleX).append(", scaleY=").append(this.scaleY).append(", alpha=").append(this.alpha).append(", translationX=").append(this.translationX).append(", translationY=").append(this.translationY).append(", shadowElevation=").append(this.shadowElevation).append(", rotationX=").append(this.rotationX).append(", rotationY=").append(this.rotationY).append(", rotationZ=").append(this.rotationZ).append(", cameraDistance=").append(this.cameraDistance).append(", transformOrigin=").append(TransformOrigin.m4755toStringimpl(this.transformOrigin)).append(", shape=");
        r0.append(this.shape).append(", clip=").append(this.clip).append(", renderEffect=").append(this.renderEffect).append(", ambientShadowColor=").append(Color.m4374toStringimpl(this.ambientShadowColor)).append(", spotShadowColor=").append(Color.m4374toStringimpl(this.spotShadowColor)).append(", compositingStrategy=").append(CompositingStrategy.m4452toStringimpl(this.compositingStrategy)).append(')');
        return r0.toString();
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public /* bridge */ /* synthetic */ Modifier.Node create() {
        return create();
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public /* bridge */ /* synthetic */ void update(Modifier.Node node) {
        update((SimpleGraphicsLayerModifier) node);
    }

    public final float getScaleX() {
        return this.scaleX;
    }

    public final float getScaleY() {
        return this.scaleY;
    }

    public final float getAlpha() {
        return this.alpha;
    }

    public final float getTranslationX() {
        return this.translationX;
    }

    public final float getTranslationY() {
        return this.translationY;
    }

    public final float getShadowElevation() {
        return this.shadowElevation;
    }

    public final float getRotationX() {
        return this.rotationX;
    }

    public final float getRotationY() {
        return this.rotationY;
    }

    public final float getRotationZ() {
        return this.rotationZ;
    }

    public final float getCameraDistance() {
        return this.cameraDistance;
    }

    /* JADX INFO: renamed from: getTransformOrigin-SzJe1aQ, reason: not valid java name */
    public final long m4522getTransformOriginSzJe1aQ() {
        return this.transformOrigin;
    }

    public final Shape getShape() {
        return this.shape;
    }

    public final boolean getClip() {
        return this.clip;
    }

    public final RenderEffect getRenderEffect() {
        return this.renderEffect;
    }

    /* JADX INFO: renamed from: getAmbientShadowColor-0d7_KjU, reason: not valid java name */
    public final long m4519getAmbientShadowColor0d7_KjU() {
        return this.ambientShadowColor;
    }

    /* JADX INFO: renamed from: getSpotShadowColor-0d7_KjU, reason: not valid java name */
    public final long m4521getSpotShadowColor0d7_KjU() {
        return this.spotShadowColor;
    }

    /* JADX INFO: renamed from: getCompositingStrategy--NrFUSI, reason: not valid java name */
    public final int m4520getCompositingStrategyNrFUSI() {
        return this.compositingStrategy;
    }

    private GraphicsLayerElement(float scaleX, float scaleY, float alpha, float translationX, float translationY, float shadowElevation, float rotationX, float rotationY, float rotationZ, float cameraDistance, long transformOrigin, Shape shape, boolean clip, RenderEffect renderEffect, long ambientShadowColor, long spotShadowColor, int compositingStrategy) {
        this.scaleX = scaleX;
        this.scaleY = scaleY;
        this.alpha = alpha;
        this.translationX = translationX;
        this.translationY = translationY;
        this.shadowElevation = shadowElevation;
        this.rotationX = rotationX;
        this.rotationY = rotationY;
        this.rotationZ = rotationZ;
        this.cameraDistance = cameraDistance;
        this.transformOrigin = transformOrigin;
        this.shape = shape;
        this.clip = clip;
        this.renderEffect = renderEffect;
        this.ambientShadowColor = ambientShadowColor;
        this.spotShadowColor = spotShadowColor;
        this.compositingStrategy = compositingStrategy;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public SimpleGraphicsLayerModifier create() {
        return new SimpleGraphicsLayerModifier(this.scaleX, this.scaleY, this.alpha, this.translationX, this.translationY, this.shadowElevation, this.rotationX, this.rotationY, this.rotationZ, this.cameraDistance, this.transformOrigin, this.shape, this.clip, this.renderEffect, this.ambientShadowColor, this.spotShadowColor, this.compositingStrategy, null);
    }

    public void update(SimpleGraphicsLayerModifier node) {
        node.setScaleX(this.scaleX);
        node.setScaleY(this.scaleY);
        node.setAlpha(this.alpha);
        node.setTranslationX(this.translationX);
        node.setTranslationY(this.translationY);
        node.setShadowElevation(this.shadowElevation);
        node.setRotationX(this.rotationX);
        node.setRotationY(this.rotationY);
        node.setRotationZ(this.rotationZ);
        node.setCameraDistance(this.cameraDistance);
        node.m4700setTransformOrigin__ExYCQ(this.transformOrigin);
        node.setShape(this.shape);
        node.setClip(this.clip);
        node.setRenderEffect(this.renderEffect);
        node.m4697setAmbientShadowColor8_81llA(this.ambientShadowColor);
        node.m4699setSpotShadowColor8_81llA(this.spotShadowColor);
        node.m4698setCompositingStrategyaDBOjCE(this.compositingStrategy);
        node.invalidateLayerBlock();
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void inspectableProperties(InspectorInfo $this$inspectableProperties) {
        $this$inspectableProperties.setName("graphicsLayer");
        $this$inspectableProperties.getProperties().set("scaleX", Float.valueOf(this.scaleX));
        $this$inspectableProperties.getProperties().set("scaleY", Float.valueOf(this.scaleY));
        $this$inspectableProperties.getProperties().set("alpha", Float.valueOf(this.alpha));
        $this$inspectableProperties.getProperties().set("translationX", Float.valueOf(this.translationX));
        $this$inspectableProperties.getProperties().set("translationY", Float.valueOf(this.translationY));
        $this$inspectableProperties.getProperties().set("shadowElevation", Float.valueOf(this.shadowElevation));
        $this$inspectableProperties.getProperties().set("rotationX", Float.valueOf(this.rotationX));
        $this$inspectableProperties.getProperties().set("rotationY", Float.valueOf(this.rotationY));
        $this$inspectableProperties.getProperties().set("rotationZ", Float.valueOf(this.rotationZ));
        $this$inspectableProperties.getProperties().set("cameraDistance", Float.valueOf(this.cameraDistance));
        $this$inspectableProperties.getProperties().set("transformOrigin", TransformOrigin.m4744boximpl(this.transformOrigin));
        $this$inspectableProperties.getProperties().set("shape", this.shape);
        $this$inspectableProperties.getProperties().set("clip", Boolean.valueOf(this.clip));
        $this$inspectableProperties.getProperties().set("renderEffect", this.renderEffect);
        $this$inspectableProperties.getProperties().set("ambientShadowColor", Color.m4356boximpl(this.ambientShadowColor));
        $this$inspectableProperties.getProperties().set("spotShadowColor", Color.m4356boximpl(this.spotShadowColor));
        $this$inspectableProperties.getProperties().set("compositingStrategy", CompositingStrategy.m4447boximpl(this.compositingStrategy));
    }
}
