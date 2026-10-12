package androidx.compose.ui.graphics;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.InspectableValueKt;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: GraphicsLayerModifier.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000N\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a%\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\u0017\u0010\u0002\u001a\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\b\u0006H\u0007\u001a\u0098\u0001\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\b2\b\b\u0002\u0010\f\u001a\u00020\b2\b\b\u0002\u0010\r\u001a\u00020\b2\b\b\u0002\u0010\u000e\u001a\u00020\b2\b\b\u0002\u0010\u000f\u001a\u00020\b2\b\b\u0002\u0010\u0010\u001a\u00020\b2\b\b\u0002\u0010\u0011\u001a\u00020\b2\b\b\u0002\u0010\u0012\u001a\u00020\u00132\b\b\u0002\u0010\u0014\u001a\u00020\u00152\b\b\u0002\u0010\u0016\u001a\u00020\u0017H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0019\u001a¤\u0001\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\b2\b\b\u0002\u0010\f\u001a\u00020\b2\b\b\u0002\u0010\r\u001a\u00020\b2\b\b\u0002\u0010\u000e\u001a\u00020\b2\b\b\u0002\u0010\u000f\u001a\u00020\b2\b\b\u0002\u0010\u0010\u001a\u00020\b2\b\b\u0002\u0010\u0011\u001a\u00020\b2\b\b\u0002\u0010\u0012\u001a\u00020\u00132\b\b\u0002\u0010\u0014\u001a\u00020\u00152\b\b\u0002\u0010\u0016\u001a\u00020\u00172\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0007ø\u0001\u0000¢\u0006\u0004\b\u001c\u0010\u001d\u001a¸\u0001\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\b2\b\b\u0002\u0010\f\u001a\u00020\b2\b\b\u0002\u0010\r\u001a\u00020\b2\b\b\u0002\u0010\u000e\u001a\u00020\b2\b\b\u0002\u0010\u000f\u001a\u00020\b2\b\b\u0002\u0010\u0010\u001a\u00020\b2\b\b\u0002\u0010\u0011\u001a\u00020\b2\b\b\u0002\u0010\u0012\u001a\u00020\u00132\b\b\u0002\u0010\u0014\u001a\u00020\u00152\b\b\u0002\u0010\u0016\u001a\u00020\u00172\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u001b2\b\b\u0002\u0010\u001e\u001a\u00020\u001f2\b\b\u0002\u0010 \u001a\u00020\u001fH\u0007ø\u0001\u0000¢\u0006\u0004\b!\u0010\"\u001aÂ\u0001\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\b2\b\b\u0002\u0010\f\u001a\u00020\b2\b\b\u0002\u0010\r\u001a\u00020\b2\b\b\u0002\u0010\u000e\u001a\u00020\b2\b\b\u0002\u0010\u000f\u001a\u00020\b2\b\b\u0002\u0010\u0010\u001a\u00020\b2\b\b\u0002\u0010\u0011\u001a\u00020\b2\b\b\u0002\u0010\u0012\u001a\u00020\u00132\b\b\u0002\u0010\u0014\u001a\u00020\u00152\b\b\u0002\u0010\u0016\u001a\u00020\u00172\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u001b2\b\b\u0002\u0010\u001e\u001a\u00020\u001f2\b\b\u0002\u0010 \u001a\u00020\u001f2\b\b\u0002\u0010#\u001a\u00020$H\u0007ø\u0001\u0000¢\u0006\u0004\b%\u0010&\u001a\f\u0010'\u001a\u00020\u0001*\u00020\u0001H\u0007\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006("}, d2 = {"graphicsLayer", "Landroidx/compose/ui/Modifier;", "block", "Lkotlin/Function1;", "Landroidx/compose/ui/graphics/GraphicsLayerScope;", "", "Lkotlin/ExtensionFunctionType;", "scaleX", "", "scaleY", "alpha", "translationX", "translationY", "shadowElevation", "rotationX", "rotationY", "rotationZ", "cameraDistance", "transformOrigin", "Landroidx/compose/ui/graphics/TransformOrigin;", "shape", "Landroidx/compose/ui/graphics/Shape;", "clip", "", "graphicsLayer-sKFY_QE", "(Landroidx/compose/ui/Modifier;FFFFFFFFFFJLandroidx/compose/ui/graphics/Shape;Z)Landroidx/compose/ui/Modifier;", "renderEffect", "Landroidx/compose/ui/graphics/RenderEffect;", "graphicsLayer-2Xn7asI", "(Landroidx/compose/ui/Modifier;FFFFFFFFFFJLandroidx/compose/ui/graphics/Shape;ZLandroidx/compose/ui/graphics/RenderEffect;)Landroidx/compose/ui/Modifier;", "ambientShadowColor", "Landroidx/compose/ui/graphics/Color;", "spotShadowColor", "graphicsLayer-pANQ8Wg", "(Landroidx/compose/ui/Modifier;FFFFFFFFFFJLandroidx/compose/ui/graphics/Shape;ZLandroidx/compose/ui/graphics/RenderEffect;JJ)Landroidx/compose/ui/Modifier;", "compositingStrategy", "Landroidx/compose/ui/graphics/CompositingStrategy;", "graphicsLayer-Ap8cVGQ", "(Landroidx/compose/ui/Modifier;FFFFFFFFFFJLandroidx/compose/ui/graphics/Shape;ZLandroidx/compose/ui/graphics/RenderEffect;JJI)Landroidx/compose/ui/Modifier;", "toolingGraphicsLayer", "ui_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class GraphicsLayerModifierKt {
    /* JADX INFO: renamed from: graphicsLayer-sKFY_QE$default, reason: not valid java name */
    public static /* synthetic */ Modifier m4530graphicsLayersKFY_QE$default(Modifier r13, float r14, float r15, float r16, float r17, float r18, float r19, float r20, float r21, float r22, float r23, long r24, Shape r26, boolean r27, int r28, Object r29) {
        float r2 = 1.0f;
        if ((r28 & 1) == 0) goto L6;
        r14 = 1.0f;
    L6:
        if ((r28 & 2) == 0) goto L8;
        float r1 = 1.0f;
    L10:
        if ((r28 & 4) != 0) goto L13;
        r2 = r16;
    L13:
        float r4 = 0.0f;
        if ((r28 & 8) == 0) goto L16;
        float r3 = 0.0f;
    L18:
        if ((r28 & 16) == 0) goto L20;
        float r5 = 0.0f;
    L22:
        if ((r28 & 32) == 0) goto L24;
        float r6 = 0.0f;
    L26:
        if ((r28 & 64) == 0) goto L28;
        float r7 = 0.0f;
    L30:
        if ((r28 & 128) == 0) goto L32;
        float r8 = 0.0f;
    L34:
        if ((r28 & 256) != 0) goto L38;
        r4 = r22;
    L38:
        if ((r28 & 512) == 0) goto L40;
        float r9 = 8.0f;
    L42:
        if ((r28 & 1024) == 0) goto L44;
        long r10 = TransformOrigin.Companion.m4757getCenterSzJe1aQ();
    L46:
        if ((r28 & 2048) == 0) goto L48;
        Shape r12 = RectangleShapeKt.getRectangleShape();
    L50:
        if ((r28 & 4096) == 0) goto L52;
        boolean r0 = false;
    L54:
        return m4529graphicsLayersKFY_QE(r13, r14, r1, r2, r3, r5, r6, r7, r8, r4, r9, r10, r12, r0);
    L52:
        r0 = r27;
        goto L54
    L48:
        r12 = r26;
        goto L50
    L44:
        r10 = r24;
        goto L46
    L40:
        r9 = r23;
        goto L42
    L32:
        r8 = r21;
        goto L34
    L28:
        r7 = r20;
        goto L30
    L24:
        r6 = r19;
        goto L26
    L20:
        r5 = r18;
        goto L22
    L16:
        r3 = r17;
        goto L18
    L8:
        r1 = r15;
        goto L10
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Replace with graphicsLayer that consumes an optional RenderEffect parameter and shadow color parameters", replaceWith = @ReplaceWith(expression = "Modifier.graphicsLayer(scaleX, scaleY, alpha, translationX, translationY, shadowElevation, rotationX, rotationY, rotationZ, cameraDistance, transformOrigin, shape, clip, null, DefaultShadowColor, DefaultShadowColor)", imports = {"androidx.compose.ui.graphics"}))
    /* JADX INFO: renamed from: graphicsLayer-sKFY_QE, reason: not valid java name */
    public static final /* synthetic */ Modifier m4529graphicsLayersKFY_QE(Modifier $this$graphicsLayer_u2dsKFY_QE, float scaleX, float scaleY, float alpha, float translationX, float translationY, float shadowElevation, float rotationX, float rotationY, float rotationZ, float cameraDistance, long transformOrigin, Shape shape, boolean clip) {
        return m4526graphicsLayerAp8cVGQ$default($this$graphicsLayer_u2dsKFY_QE, scaleX, scaleY, alpha, translationX, translationY, shadowElevation, rotationX, rotationY, rotationZ, cameraDistance, transformOrigin, shape, clip, null, 0, 0, 0, 114688, null);
    }

    /* JADX INFO: renamed from: graphicsLayer-2Xn7asI$default, reason: not valid java name */
    public static /* synthetic */ Modifier m4524graphicsLayer2Xn7asI$default(Modifier r15, float r16, float r17, float r18, float r19, float r20, float r21, float r22, float r23, float r24, float r25, long r26, Shape r28, boolean r29, RenderEffect r30, int r31, Object r32) {
        float r2 = 1.0f;
        if ((r31 & 1) == 0) goto L5;
        float r1 = 1.0f;
    L7:
        if ((r31 & 2) == 0) goto L9;
        float r3 = 1.0f;
    L11:
        if ((r31 & 4) != 0) goto L14;
        r2 = r18;
    L14:
        float r5 = 0.0f;
        if ((r31 & 8) == 0) goto L17;
        float r4 = 0.0f;
    L19:
        if ((r31 & 16) == 0) goto L21;
        float r6 = 0.0f;
    L23:
        if ((r31 & 32) == 0) goto L25;
        float r7 = 0.0f;
    L27:
        if ((r31 & 64) == 0) goto L29;
        float r8 = 0.0f;
    L31:
        if ((r31 & 128) == 0) goto L33;
        float r9 = 0.0f;
    L35:
        if ((r31 & 256) != 0) goto L39;
        r5 = r24;
    L39:
        if ((r31 & 512) == 0) goto L41;
        float r10 = 8.0f;
    L43:
        if ((r31 & 1024) == 0) goto L45;
        long r11 = TransformOrigin.Companion.m4757getCenterSzJe1aQ();
    L47:
        if ((r31 & 2048) == 0) goto L49;
        Shape r13 = RectangleShapeKt.getRectangleShape();
    L51:
        if ((r31 & 4096) == 0) goto L53;
        boolean r14 = false;
    L55:
        if ((r31 & 8192) == 0) goto L57;
        RenderEffect r0 = null;
    L59:
        return m4523graphicsLayer2Xn7asI(r15, r1, r3, r2, r4, r6, r7, r8, r9, r5, r10, r11, r13, r14, r0);
    L57:
        r0 = r30;
        goto L59
    L53:
        r14 = r29;
        goto L55
    L49:
        r13 = r28;
        goto L51
    L45:
        r11 = r26;
        goto L47
    L41:
        r10 = r25;
        goto L43
    L33:
        r9 = r23;
        goto L35
    L29:
        r8 = r22;
        goto L31
    L25:
        r7 = r21;
        goto L27
    L21:
        r6 = r20;
        goto L23
    L17:
        r4 = r19;
        goto L19
    L9:
        r3 = r17;
        goto L11
    L5:
        r1 = r16;
        goto L7
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Replace with graphicsLayer that consumes shadow color parameters", replaceWith = @ReplaceWith(expression = "Modifier.graphicsLayer(scaleX, scaleY, alpha, translationX, translationY, shadowElevation, rotationX, rotationY, rotationZ, cameraDistance, transformOrigin, shape, clip, null, DefaultShadowColor, DefaultShadowColor)", imports = {"androidx.compose.ui.graphics"}))
    /* JADX INFO: renamed from: graphicsLayer-2Xn7asI, reason: not valid java name */
    public static final /* synthetic */ Modifier m4523graphicsLayer2Xn7asI(Modifier $this$graphicsLayer_u2d2Xn7asI, float scaleX, float scaleY, float alpha, float translationX, float translationY, float shadowElevation, float rotationX, float rotationY, float rotationZ, float cameraDistance, long transformOrigin, Shape shape, boolean clip, RenderEffect renderEffect) {
        return m4525graphicsLayerAp8cVGQ($this$graphicsLayer_u2d2Xn7asI, scaleX, scaleY, alpha, translationX, translationY, shadowElevation, rotationX, rotationY, rotationZ, cameraDistance, transformOrigin, shape, clip, renderEffect, GraphicsLayerScopeKt.getDefaultShadowColor(), GraphicsLayerScopeKt.getDefaultShadowColor(), CompositingStrategy.Companion.m4454getAutoNrFUSI());
    }

    /* JADX INFO: renamed from: graphicsLayer-pANQ8Wg$default, reason: not valid java name */
    public static /* synthetic */ Modifier m4528graphicsLayerpANQ8Wg$default(Modifier r18, float r19, float r20, float r21, float r22, float r23, float r24, float r25, float r26, float r27, float r28, long r29, Shape r31, boolean r32, RenderEffect r33, long r34, long r36, int r38, Object r39) {
        float r2 = 1.0f;
        if ((r38 & 1) == 0) goto L5;
        float r1 = 1.0f;
    L7:
        if ((r38 & 2) == 0) goto L9;
        float r3 = 1.0f;
    L11:
        if ((r38 & 4) != 0) goto L14;
        r2 = r21;
    L14:
        float r5 = 0.0f;
        if ((r38 & 8) == 0) goto L17;
        float r4 = 0.0f;
    L19:
        if ((r38 & 16) == 0) goto L21;
        float r6 = 0.0f;
    L23:
        if ((r38 & 32) == 0) goto L25;
        float r7 = 0.0f;
    L27:
        if ((r38 & 64) == 0) goto L29;
        float r8 = 0.0f;
    L31:
        if ((r38 & 128) == 0) goto L33;
        float r9 = 0.0f;
    L35:
        if ((r38 & 256) != 0) goto L39;
        r5 = r27;
    L39:
        if ((r38 & 512) == 0) goto L41;
        float r10 = 8.0f;
    L43:
        if ((r38 & 1024) == 0) goto L45;
        long r11 = TransformOrigin.Companion.m4757getCenterSzJe1aQ();
    L47:
        if ((r38 & 2048) == 0) goto L49;
        Shape r13 = RectangleShapeKt.getRectangleShape();
    L51:
        if ((r38 & 4096) == 0) goto L53;
        boolean r14 = false;
    L55:
        if ((r38 & 8192) == 0) goto L57;
        RenderEffect r15 = null;
    L58:
        float r110 = r1;
        if ((r38 & 16384) == 0) goto L61;
        long r16 = GraphicsLayerScopeKt.getDefaultShadowColor();
    L63:
        if ((r38 & 32768) == 0) goto L65;
        long r0 = GraphicsLayerScopeKt.getDefaultShadowColor();
    L67:
        return m4527graphicsLayerpANQ8Wg(r18, r110, r3, r2, r4, r6, r7, r8, r9, r5, r10, r11, r13, r14, r15, r16, r0);
    L65:
        r0 = r36;
        goto L67
    L61:
        r16 = r34;
        goto L63
    L57:
        r15 = r33;
        goto L58
    L53:
        r14 = r32;
        goto L55
    L49:
        r13 = r31;
        goto L51
    L45:
        r11 = r29;
        goto L47
    L41:
        r10 = r28;
        goto L43
    L33:
        r9 = r26;
        goto L35
    L29:
        r8 = r25;
        goto L31
    L25:
        r7 = r24;
        goto L27
    L21:
        r6 = r23;
        goto L23
    L17:
        r4 = r22;
        goto L19
    L9:
        r3 = r20;
        goto L11
    L5:
        r1 = r19;
        goto L7
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Replace with graphicsLayer that consumes a compositing strategy", replaceWith = @ReplaceWith(expression = "Modifier.graphicsLayer(scaleX, scaleY, alpha, translationX, translationY, shadowElevation, rotationX, rotationY, rotationZ, cameraDistance, transformOrigin, shape, clip, null, DefaultShadowColor, DefaultShadowColor, CompositingStrategy.Auto)", imports = {"androidx.compose.ui.graphics"}))
    /* JADX INFO: renamed from: graphicsLayer-pANQ8Wg, reason: not valid java name */
    public static final /* synthetic */ Modifier m4527graphicsLayerpANQ8Wg(Modifier $this$graphicsLayer_u2dpANQ8Wg, float scaleX, float scaleY, float alpha, float translationX, float translationY, float shadowElevation, float rotationX, float rotationY, float rotationZ, float cameraDistance, long transformOrigin, Shape shape, boolean clip, RenderEffect renderEffect, long ambientShadowColor, long spotShadowColor) {
        return m4525graphicsLayerAp8cVGQ($this$graphicsLayer_u2dpANQ8Wg, scaleX, scaleY, alpha, translationX, translationY, shadowElevation, rotationX, rotationY, rotationZ, cameraDistance, transformOrigin, shape, clip, renderEffect, ambientShadowColor, spotShadowColor, CompositingStrategy.Companion.m4454getAutoNrFUSI());
    }

    /* JADX INFO: renamed from: graphicsLayer-Ap8cVGQ$default, reason: not valid java name */
    public static /* synthetic */ Modifier m4526graphicsLayerAp8cVGQ$default(Modifier r20, float r21, float r22, float r23, float r24, float r25, float r26, float r27, float r28, float r29, float r30, long r31, Shape r33, boolean r34, RenderEffect r35, long r36, long r38, int r40, int r41, Object r42) {
        float r2 = 1.0f;
        if ((r41 & 1) == 0) goto L5;
        float r1 = 1.0f;
    L7:
        if ((r41 & 2) == 0) goto L9;
        float r3 = 1.0f;
    L11:
        if ((r41 & 4) != 0) goto L14;
        r2 = r23;
    L14:
        float r5 = 0.0f;
        if ((r41 & 8) == 0) goto L17;
        float r4 = 0.0f;
    L19:
        if ((r41 & 16) == 0) goto L21;
        float r6 = 0.0f;
    L23:
        if ((r41 & 32) == 0) goto L25;
        float r7 = 0.0f;
    L27:
        if ((r41 & 64) == 0) goto L29;
        float r8 = 0.0f;
    L31:
        if ((r41 & 128) == 0) goto L33;
        float r9 = 0.0f;
    L35:
        if ((r41 & 256) != 0) goto L39;
        r5 = r29;
    L39:
        if ((r41 & 512) == 0) goto L41;
        float r10 = 8.0f;
    L43:
        if ((r41 & 1024) == 0) goto L45;
        long r11 = TransformOrigin.Companion.m4757getCenterSzJe1aQ();
    L47:
        if ((r41 & 2048) == 0) goto L49;
        Shape r13 = RectangleShapeKt.getRectangleShape();
    L51:
        if ((r41 & 4096) == 0) goto L53;
        boolean r14 = false;
    L55:
        if ((r41 & 8192) == 0) goto L57;
        RenderEffect r15 = null;
    L58:
        float r210 = r1;
        if ((r41 & 16384) == 0) goto L61;
        long r16 = GraphicsLayerScopeKt.getDefaultShadowColor();
    L63:
        if ((32768 & r41) == 0) goto L65;
        long r18 = GraphicsLayerScopeKt.getDefaultShadowColor();
    L67:
        if ((r41 & 65536) == 0) goto L69;
        int r0 = CompositingStrategy.Companion.m4454getAutoNrFUSI();
    L71:
        return m4525graphicsLayerAp8cVGQ(r20, r210, r3, r2, r4, r6, r7, r8, r9, r5, r10, r11, r13, r14, r15, r16, r18, r0);
    L69:
        r0 = r40;
        goto L71
    L65:
        r18 = r38;
        goto L67
    L61:
        r16 = r36;
        goto L63
    L57:
        r15 = r35;
        goto L58
    L53:
        r14 = r34;
        goto L55
    L49:
        r13 = r33;
        goto L51
    L45:
        r11 = r31;
        goto L47
    L41:
        r10 = r30;
        goto L43
    L33:
        r9 = r28;
        goto L35
    L29:
        r8 = r27;
        goto L31
    L25:
        r7 = r26;
        goto L27
    L21:
        r6 = r25;
        goto L23
    L17:
        r4 = r24;
        goto L19
    L9:
        r3 = r22;
        goto L11
    L5:
        r1 = r21;
        goto L7
    }

    /* JADX INFO: renamed from: graphicsLayer-Ap8cVGQ, reason: not valid java name */
    public static final Modifier m4525graphicsLayerAp8cVGQ(Modifier $this$graphicsLayer_u2dAp8cVGQ, float scaleX, float scaleY, float alpha, float translationX, float translationY, float shadowElevation, float rotationX, float rotationY, float rotationZ, float cameraDistance, long transformOrigin, Shape shape, boolean clip, RenderEffect renderEffect, long ambientShadowColor, long spotShadowColor, int compositingStrategy) {
        return $this$graphicsLayer_u2dAp8cVGQ.then(new GraphicsLayerElement(scaleX, scaleY, alpha, translationX, translationY, shadowElevation, rotationX, rotationY, rotationZ, cameraDistance, transformOrigin, shape, clip, renderEffect, ambientShadowColor, spotShadowColor, compositingStrategy, null));
    }

    public static final Modifier graphicsLayer(Modifier $this$graphicsLayer, Function1<? super GraphicsLayerScope, Unit> r2) {
        return $this$graphicsLayer.then(new BlockGraphicsLayerElement(r2));
    }

    public static final Modifier toolingGraphicsLayer(Modifier $this$toolingGraphicsLayer) {
        if (InspectableValueKt.isDebugInspectorInfoEnabled() == false) goto L6;
        return $this$toolingGraphicsLayer.then(m4526graphicsLayerAp8cVGQ$default(Modifier.Companion, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0, null, false, null, 0, 0, 0, 131071, null));
    L6:
        return $this$toolingGraphicsLayer;
    }
}
