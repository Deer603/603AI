package androidx.compose.ui.platform;

import androidx.compose.ui.graphics.CompositingStrategy;
import androidx.compose.ui.graphics.RenderEffect;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: DeviceRenderNode.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\bW\n\u0002\u0010\u000e\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001BÏ\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\u0006\u0010\n\u001a\u00020\u0005\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000e\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\f\u0012\u0006\u0010\u0010\u001a\u00020\f\u0012\u0006\u0010\u0011\u001a\u00020\u0005\u0012\u0006\u0010\u0012\u001a\u00020\u0005\u0012\u0006\u0010\u0013\u001a\u00020\f\u0012\u0006\u0010\u0014\u001a\u00020\f\u0012\u0006\u0010\u0015\u001a\u00020\f\u0012\u0006\u0010\u0016\u001a\u00020\f\u0012\u0006\u0010\u0017\u001a\u00020\f\u0012\u0006\u0010\u0018\u001a\u00020\f\u0012\u0006\u0010\u0019\u001a\u00020\u001a\u0012\u0006\u0010\u001b\u001a\u00020\u001a\u0012\u0006\u0010\u001c\u001a\u00020\f\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u001e\u0012\u0006\u0010\u001f\u001a\u00020 ¢\u0006\u0002\u0010!J\t\u0010W\u001a\u00020\u0003HÆ\u0003J\t\u0010X\u001a\u00020\fHÆ\u0003J\t\u0010Y\u001a\u00020\fHÆ\u0003J\t\u0010Z\u001a\u00020\fHÆ\u0003J\t\u0010[\u001a\u00020\u0005HÆ\u0003J\t\u0010\\\u001a\u00020\u0005HÆ\u0003J\t\u0010]\u001a\u00020\fHÆ\u0003J\t\u0010^\u001a\u00020\fHÆ\u0003J\t\u0010_\u001a\u00020\fHÆ\u0003J\t\u0010`\u001a\u00020\fHÆ\u0003J\t\u0010a\u001a\u00020\fHÆ\u0003J\t\u0010b\u001a\u00020\u0005HÆ\u0003J\t\u0010c\u001a\u00020\fHÆ\u0003J\t\u0010d\u001a\u00020\u001aHÆ\u0003J\t\u0010e\u001a\u00020\u001aHÆ\u0003J\t\u0010f\u001a\u00020\fHÆ\u0003J\u000b\u0010g\u001a\u0004\u0018\u00010\u001eHÆ\u0003J\u0016\u0010h\u001a\u00020 HÆ\u0003ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\bi\u0010'J\t\u0010j\u001a\u00020\u0005HÆ\u0003J\t\u0010k\u001a\u00020\u0005HÆ\u0003J\t\u0010l\u001a\u00020\u0005HÆ\u0003J\t\u0010m\u001a\u00020\u0005HÆ\u0003J\t\u0010n\u001a\u00020\u0005HÆ\u0003J\t\u0010o\u001a\u00020\fHÆ\u0003J\t\u0010p\u001a\u00020\fHÆ\u0003J\u008f\u0002\u0010q\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\u00052\b\b\u0002\u0010\n\u001a\u00020\u00052\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000e\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\f2\b\b\u0002\u0010\u0010\u001a\u00020\f2\b\b\u0002\u0010\u0011\u001a\u00020\u00052\b\b\u0002\u0010\u0012\u001a\u00020\u00052\b\b\u0002\u0010\u0013\u001a\u00020\f2\b\b\u0002\u0010\u0014\u001a\u00020\f2\b\b\u0002\u0010\u0015\u001a\u00020\f2\b\b\u0002\u0010\u0016\u001a\u00020\f2\b\b\u0002\u0010\u0017\u001a\u00020\f2\b\b\u0002\u0010\u0018\u001a\u00020\f2\b\b\u0002\u0010\u0019\u001a\u00020\u001a2\b\b\u0002\u0010\u001b\u001a\u00020\u001a2\b\b\u0002\u0010\u001c\u001a\u00020\f2\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001e2\b\b\u0002\u0010\u001f\u001a\u00020 HÆ\u0001ø\u0001\u0000¢\u0006\u0004\br\u0010sJ\u0013\u0010t\u001a\u00020\u001a2\b\u0010u\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010v\u001a\u00020\u0005HÖ\u0001J\t\u0010w\u001a\u00020xHÖ\u0001R\u001a\u0010\u001c\u001a\u00020\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R\u001a\u0010\u0011\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b*\u0010'R\u001a\u0010\u0016\u001a\u00020\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b+\u0010#\"\u0004\b,\u0010%R\u001a\u0010\u001b\u001a\u00020\u001aX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R\u001a\u0010\u0019\u001a\u00020\u001aX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b1\u0010.\"\u0004\b2\u00100R\"\u0010\u001f\u001a\u00020 X\u0086\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0010\n\u0002\u00105\u001a\u0004\b3\u0010'\"\u0004\b4\u0010)R\u001a\u0010\u0010\u001a\u00020\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b6\u0010#\"\u0004\b7\u0010%R\u0011\u0010\n\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b8\u0010'R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b9\u0010'R\u001a\u0010\u0017\u001a\u00020\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b:\u0010#\"\u0004\b;\u0010%R\u001a\u0010\u0018\u001a\u00020\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b<\u0010#\"\u0004\b=\u0010%R\u001c\u0010\u001d\u001a\u0004\u0018\u00010\u001eX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b>\u0010?\"\u0004\b@\u0010AR\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\bB\u0010'R\u001a\u0010\u0014\u001a\u00020\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bC\u0010#\"\u0004\bD\u0010%R\u001a\u0010\u0015\u001a\u00020\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bE\u0010#\"\u0004\bF\u0010%R\u001a\u0010\u0013\u001a\u00020\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bG\u0010#\"\u0004\bH\u0010%R\u001a\u0010\u000b\u001a\u00020\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bI\u0010#\"\u0004\bJ\u0010%R\u001a\u0010\r\u001a\u00020\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bK\u0010#\"\u0004\bL\u0010%R\u001a\u0010\u0012\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bM\u0010'\"\u0004\bN\u0010)R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\bO\u0010'R\u001a\u0010\u000e\u001a\u00020\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bP\u0010#\"\u0004\bQ\u0010%R\u001a\u0010\u000f\u001a\u00020\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bR\u0010#\"\u0004\bS\u0010%R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\bT\u0010UR\u0011\u0010\t\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\bV\u0010'\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006y"}, d2 = {"Landroidx/compose/ui/platform/DeviceRenderNodeData;", "", "uniqueId", "", "left", "", "top", "right", "bottom", "width", "height", "scaleX", "", "scaleY", "translationX", "translationY", "elevation", "ambientShadowColor", "spotShadowColor", "rotationZ", "rotationX", "rotationY", "cameraDistance", "pivotX", "pivotY", "clipToOutline", "", "clipToBounds", "alpha", "renderEffect", "Landroidx/compose/ui/graphics/RenderEffect;", "compositingStrategy", "Landroidx/compose/ui/graphics/CompositingStrategy;", "(JIIIIIIFFFFFIIFFFFFFZZFLandroidx/compose/ui/graphics/RenderEffect;ILkotlin/jvm/internal/DefaultConstructorMarker;)V", "getAlpha", "()F", "setAlpha", "(F)V", "getAmbientShadowColor", "()I", "setAmbientShadowColor", "(I)V", "getBottom", "getCameraDistance", "setCameraDistance", "getClipToBounds", "()Z", "setClipToBounds", "(Z)V", "getClipToOutline", "setClipToOutline", "getCompositingStrategy--NrFUSI", "setCompositingStrategy-aDBOjCE", "I", "getElevation", "setElevation", "getHeight", "getLeft", "getPivotX", "setPivotX", "getPivotY", "setPivotY", "getRenderEffect", "()Landroidx/compose/ui/graphics/RenderEffect;", "setRenderEffect", "(Landroidx/compose/ui/graphics/RenderEffect;)V", "getRight", "getRotationX", "setRotationX", "getRotationY", "setRotationY", "getRotationZ", "setRotationZ", "getScaleX", "setScaleX", "getScaleY", "setScaleY", "getSpotShadowColor", "setSpotShadowColor", "getTop", "getTranslationX", "setTranslationX", "getTranslationY", "setTranslationY", "getUniqueId", "()J", "getWidth", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component20", "component21", "component22", "component23", "component24", "component25", "component25--NrFUSI", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "copy-fuCbV5c", "(JIIIIIIFFFFFIIFFFFFFZZFLandroidx/compose/ui/graphics/RenderEffect;I)Landroidx/compose/ui/platform/DeviceRenderNodeData;", "equals", "other", "hashCode", "toString", "", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class DeviceRenderNodeData {
    public static final int $stable = 0;
    private float alpha;
    private int ambientShadowColor;
    private final int bottom;
    private float cameraDistance;
    private boolean clipToBounds;
    private boolean clipToOutline;
    private int compositingStrategy;
    private float elevation;
    private final int height;
    private final int left;
    private float pivotX;
    private float pivotY;
    private RenderEffect renderEffect;
    private final int right;
    private float rotationX;
    private float rotationY;
    private float rotationZ;
    private float scaleX;
    private float scaleY;
    private int spotShadowColor;
    private final int top;
    private float translationX;
    private float translationY;
    private final long uniqueId;
    private final int width;

    static {
        $stable = 8;
    }

    public /* synthetic */ DeviceRenderNodeData(long r1, int r3, int r4, int r5, int r6, int r7, int r8, float r9, float r10, float r11, float r12, float r13, int r14, int r15, float r16, float r17, float r18, float r19, float r20, float r21, boolean r22, boolean r23, float r24, RenderEffect r25, int r26, DefaultConstructorMarker r27) {
        this(r1, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26);
    }

    /* JADX INFO: renamed from: copy-fuCbV5c$default, reason: not valid java name */
    public static /* synthetic */ DeviceRenderNodeData m6112copyfuCbV5c$default(DeviceRenderNodeData r19, long r20, int r22, int r23, int r24, int r25, int r26, int r27, float r28, float r29, float r30, float r31, float r32, int r33, int r34, float r35, float r36, float r37, float r38, float r39, float r40, boolean r41, boolean r42, float r43, RenderEffect r44, int r45, int r46, Object r47) {
        if ((r46 & 1) == 0) goto L5;
        long r2 = r19.uniqueId;
    L7:
        if ((r46 & 2) == 0) goto L9;
        int r4 = r19.left;
    L11:
        if ((r46 & 4) == 0) goto L13;
        int r5 = r19.top;
    L15:
        if ((r46 & 8) == 0) goto L17;
        int r6 = r19.right;
    L19:
        if ((r46 & 16) == 0) goto L21;
        int r7 = r19.bottom;
    L23:
        if ((r46 & 32) == 0) goto L25;
        int r8 = r19.width;
    L27:
        if ((r46 & 64) == 0) goto L29;
        int r9 = r19.height;
    L31:
        if ((r46 & 128) == 0) goto L33;
        float r10 = r19.scaleX;
    L35:
        if ((r46 & 256) == 0) goto L37;
        float r11 = r19.scaleY;
    L39:
        if ((r46 & 512) == 0) goto L41;
        float r12 = r19.translationX;
    L43:
        if ((r46 & 1024) == 0) goto L45;
        float r13 = r19.translationY;
    L47:
        if ((r46 & 2048) == 0) goto L49;
        float r14 = r19.elevation;
    L51:
        if ((r46 & 4096) == 0) goto L53;
        int r15 = r19.ambientShadowColor;
    L54:
        long r16 = r2;
        if ((r46 & 8192) == 0) goto L57;
        int r3 = r19.spotShadowColor;
    L59:
        if ((r46 & 16384) == 0) goto L61;
        float r17 = r19.rotationZ;
    L63:
        if ((r46 & 32768) == 0) goto L65;
        float r1 = r19.rotationX;
    L66:
        float r21 = r1;
        if ((r46 & 65536) == 0) goto L69;
        float r18 = r19.rotationY;
    L70:
        float r210 = r18;
        if ((r46 & 131072) == 0) goto L73;
        float r48 = r19.cameraDistance;
    L74:
        float r211 = r48;
        if ((r46 & 262144) == 0) goto L77;
        float r49 = r19.pivotX;
    L78:
        float r212 = r49;
        if ((r46 & 524288) == 0) goto L81;
        float r50 = r19.pivotY;
    L82:
        float r213 = r50;
        if ((r46 & 1048576) == 0) goto L85;
        boolean r51 = r19.clipToOutline;
    L86:
        boolean r214 = r51;
        if ((r46 & 2097152) == 0) goto L89;
        boolean r52 = r19.clipToBounds;
    L90:
        boolean r215 = r52;
        if ((r46 & 4194304) == 0) goto L93;
        float r53 = r19.alpha;
    L94:
        float r216 = r53;
        if ((r46 & 8388608) == 0) goto L97;
        RenderEffect r54 = r19.renderEffect;
    L99:
        if ((r46 & 16777216) == 0) goto L101;
        RenderEffect r217 = r54;
        RenderEffect r410 = r217;
        int r411 = r19.compositingStrategy;
    L102:
        int r218 = r4;
        int r219 = r5;
        int r220 = r6;
        int r221 = r7;
        int r222 = r8;
        int r223 = r9;
        float r224 = r10;
        float r310 = r11;
        float r311 = r12;
        float r312 = r13;
        float r313 = r14;
        int r314 = r15;
        return r19.m6114copyfuCbV5c(r16, r218, r219, r220, r221, r222, r223, r224, r310, r311, r312, r313, r314, r3, r17, r21, r210, r211, r212, r213, r214, r215, r216, r410, r411);
    L101:
        r411 = r45;
        r410 = r54;
        goto L102
    L97:
        r54 = r44;
        goto L99
    L93:
        r53 = r43;
        goto L94
    L89:
        r52 = r42;
        goto L90
    L85:
        r51 = r41;
        goto L86
    L81:
        r50 = r40;
        goto L82
    L77:
        r49 = r39;
        goto L78
    L73:
        r48 = r38;
        goto L74
    L69:
        r18 = r37;
        goto L70
    L65:
        r1 = r36;
        goto L66
    L61:
        r17 = r35;
        goto L63
    L57:
        r3 = r34;
        goto L59
    L53:
        r15 = r33;
        goto L54
    L49:
        r14 = r32;
        goto L51
    L45:
        r13 = r31;
        goto L47
    L41:
        r12 = r30;
        goto L43
    L37:
        r11 = r29;
        goto L39
    L33:
        r10 = r28;
        goto L35
    L29:
        r9 = r27;
        goto L31
    L25:
        r8 = r26;
        goto L27
    L21:
        r7 = r25;
        goto L23
    L17:
        r6 = r24;
        goto L19
    L13:
        r5 = r23;
        goto L15
    L9:
        r4 = r22;
        goto L11
    L5:
        r2 = r20;
        goto L7
    }

    public final long component1() {
        return this.uniqueId;
    }

    public final float component10() {
        return this.translationX;
    }

    public final float component11() {
        return this.translationY;
    }

    public final float component12() {
        return this.elevation;
    }

    public final int component13() {
        return this.ambientShadowColor;
    }

    public final int component14() {
        return this.spotShadowColor;
    }

    public final float component15() {
        return this.rotationZ;
    }

    public final float component16() {
        return this.rotationX;
    }

    public final float component17() {
        return this.rotationY;
    }

    public final float component18() {
        return this.cameraDistance;
    }

    public final float component19() {
        return this.pivotX;
    }

    public final int component2() {
        return this.left;
    }

    public final float component20() {
        return this.pivotY;
    }

    public final boolean component21() {
        return this.clipToOutline;
    }

    public final boolean component22() {
        return this.clipToBounds;
    }

    public final float component23() {
        return this.alpha;
    }

    public final RenderEffect component24() {
        return this.renderEffect;
    }

    /* JADX INFO: renamed from: component25--NrFUSI, reason: not valid java name */
    public final int m6113component25NrFUSI() {
        return this.compositingStrategy;
    }

    public final int component3() {
        return this.top;
    }

    public final int component4() {
        return this.right;
    }

    public final int component5() {
        return this.bottom;
    }

    public final int component6() {
        return this.width;
    }

    public final int component7() {
        return this.height;
    }

    public final float component8() {
        return this.scaleX;
    }

    public final float component9() {
        return this.scaleY;
    }

    /* JADX INFO: renamed from: copy-fuCbV5c, reason: not valid java name */
    public final DeviceRenderNodeData m6114copyfuCbV5c(long r29, int r31, int r32, int r33, int r34, int r35, int r36, float r37, float r38, float r39, float r40, float r41, int r42, int r43, float r44, float r45, float r46, float r47, float r48, float r49, boolean r50, boolean r51, float r52, RenderEffect r53, int r54) {
        return new DeviceRenderNodeData(r29, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48, r49, r50, r51, r52, r53, r54, null);
    }

    public boolean equals(Object r8) {
        if (this != r8) goto L6;
        return true;
    L6:
        if ((r8 instanceof DeviceRenderNodeData) == true) goto L8;
        return false;
    L8:
        DeviceRenderNodeData r1 = (DeviceRenderNodeData) r8;
        if (this.uniqueId == r1.uniqueId) goto L12;
        return false;
    L12:
        if (this.left == r1.left) goto L15;
        return false;
    L15:
        if (this.top == r1.top) goto L18;
        return false;
    L18:
        if (this.right == r1.right) goto L21;
        return false;
    L21:
        if (this.bottom == r1.bottom) goto L24;
        return false;
    L24:
        if (this.width == r1.width) goto L27;
        return false;
    L27:
        if (this.height == r1.height) goto L30;
        return false;
    L30:
        if (Float.compare(this.scaleX, r1.scaleX) == 0) goto L33;
        return false;
    L33:
        if (Float.compare(this.scaleY, r1.scaleY) == 0) goto L36;
        return false;
    L36:
        if (Float.compare(this.translationX, r1.translationX) == 0) goto L39;
        return false;
    L39:
        if (Float.compare(this.translationY, r1.translationY) == 0) goto L42;
        return false;
    L42:
        if (Float.compare(this.elevation, r1.elevation) == 0) goto L45;
        return false;
    L45:
        if (this.ambientShadowColor == r1.ambientShadowColor) goto L48;
        return false;
    L48:
        if (this.spotShadowColor == r1.spotShadowColor) goto L51;
        return false;
    L51:
        if (Float.compare(this.rotationZ, r1.rotationZ) == 0) goto L54;
        return false;
    L54:
        if (Float.compare(this.rotationX, r1.rotationX) == 0) goto L57;
        return false;
    L57:
        if (Float.compare(this.rotationY, r1.rotationY) == 0) goto L60;
        return false;
    L60:
        if (Float.compare(this.cameraDistance, r1.cameraDistance) == 0) goto L63;
        return false;
    L63:
        if (Float.compare(this.pivotX, r1.pivotX) == 0) goto L66;
        return false;
    L66:
        if (Float.compare(this.pivotY, r1.pivotY) == 0) goto L69;
        return false;
    L69:
        if (this.clipToOutline == r1.clipToOutline) goto L72;
        return false;
    L72:
        if (this.clipToBounds == r1.clipToBounds) goto L75;
        return false;
    L75:
        if (Float.compare(this.alpha, r1.alpha) == 0) goto L78;
        return false;
    L78:
        if (Intrinsics.areEqual(this.renderEffect, r1.renderEffect) == true) goto L81;
        return false;
    L81:
        if (CompositingStrategy.m4450equalsimpl0(this.compositingStrategy, r1.compositingStrategy) == true) goto L83;
        return false;
    L83:
        return true;
    }

    public int hashCode() {
        int r1 = ((((((((((((((((((((((((((((((((((((((((((((Long.hashCode(this.uniqueId) * 31) + Integer.hashCode(this.left)) * 31) + Integer.hashCode(this.top)) * 31) + Integer.hashCode(this.right)) * 31) + Integer.hashCode(this.bottom)) * 31) + Integer.hashCode(this.width)) * 31) + Integer.hashCode(this.height)) * 31) + Float.hashCode(this.scaleX)) * 31) + Float.hashCode(this.scaleY)) * 31) + Float.hashCode(this.translationX)) * 31) + Float.hashCode(this.translationY)) * 31) + Float.hashCode(this.elevation)) * 31) + Integer.hashCode(this.ambientShadowColor)) * 31) + Integer.hashCode(this.spotShadowColor)) * 31) + Float.hashCode(this.rotationZ)) * 31) + Float.hashCode(this.rotationX)) * 31) + Float.hashCode(this.rotationY)) * 31) + Float.hashCode(this.cameraDistance)) * 31) + Float.hashCode(this.pivotX)) * 31) + Float.hashCode(this.pivotY)) * 31) + Boolean.hashCode(this.clipToOutline)) * 31) + Boolean.hashCode(this.clipToBounds)) * 31) + Float.hashCode(this.alpha)) * 31;
        if (this.renderEffect != null) goto L5;
        int r2 = 0;
    L7:
        return ((r1 + r2) * 31) + CompositingStrategy.m4451hashCodeimpl(this.compositingStrategy);
    L5:
        r2 = this.renderEffect.hashCode();
        goto L7
    }

    public String toString() {
        StringBuilder r0 = new StringBuilder();
        r0.append("DeviceRenderNodeData(uniqueId=").append(this.uniqueId).append(", left=").append(this.left).append(", top=").append(this.top).append(", right=").append(this.right).append(", bottom=").append(this.bottom).append(", width=").append(this.width).append(", height=").append(this.height).append(", scaleX=").append(this.scaleX).append(", scaleY=").append(this.scaleY).append(", translationX=").append(this.translationX).append(", translationY=").append(this.translationY).append(", elevation=");
        r0.append(this.elevation).append(", ambientShadowColor=").append(this.ambientShadowColor).append(", spotShadowColor=").append(this.spotShadowColor).append(", rotationZ=").append(this.rotationZ).append(", rotationX=").append(this.rotationX).append(", rotationY=").append(this.rotationY).append(", cameraDistance=").append(this.cameraDistance).append(", pivotX=").append(this.pivotX).append(", pivotY=").append(this.pivotY).append(", clipToOutline=").append(this.clipToOutline).append(", clipToBounds=").append(this.clipToBounds).append(", alpha=").append(this.alpha);
        r0.append(", renderEffect=").append(this.renderEffect).append(", compositingStrategy=").append(CompositingStrategy.m4452toStringimpl(this.compositingStrategy)).append(')');
        return r0.toString();
    }

    private DeviceRenderNodeData(long uniqueId, int left, int top, int right, int bottom, int width, int height, float scaleX, float scaleY, float translationX, float translationY, float elevation, int ambientShadowColor, int spotShadowColor, float rotationZ, float rotationX, float rotationY, float cameraDistance, float pivotX, float pivotY, boolean clipToOutline, boolean clipToBounds, float alpha, RenderEffect renderEffect, int compositingStrategy) {
        this.uniqueId = uniqueId;
        this.left = left;
        this.top = top;
        this.right = right;
        this.bottom = bottom;
        this.width = width;
        this.height = height;
        this.scaleX = scaleX;
        this.scaleY = scaleY;
        this.translationX = translationX;
        this.translationY = translationY;
        this.elevation = elevation;
        this.ambientShadowColor = ambientShadowColor;
        this.spotShadowColor = spotShadowColor;
        this.rotationZ = rotationZ;
        this.rotationX = rotationX;
        this.rotationY = rotationY;
        this.cameraDistance = cameraDistance;
        this.pivotX = pivotX;
        this.pivotY = pivotY;
        this.clipToOutline = clipToOutline;
        this.clipToBounds = clipToBounds;
        this.alpha = alpha;
        this.renderEffect = renderEffect;
        this.compositingStrategy = compositingStrategy;
    }

    public final long getUniqueId() {
        return this.uniqueId;
    }

    public final int getLeft() {
        return this.left;
    }

    public final int getTop() {
        return this.top;
    }

    public final int getRight() {
        return this.right;
    }

    public final int getBottom() {
        return this.bottom;
    }

    public final int getWidth() {
        return this.width;
    }

    public final int getHeight() {
        return this.height;
    }

    public final float getScaleX() {
        return this.scaleX;
    }

    public final void setScaleX(float r1) {
        this.scaleX = r1;
    }

    public final float getScaleY() {
        return this.scaleY;
    }

    public final void setScaleY(float r1) {
        this.scaleY = r1;
    }

    public final float getTranslationX() {
        return this.translationX;
    }

    public final void setTranslationX(float r1) {
        this.translationX = r1;
    }

    public final float getTranslationY() {
        return this.translationY;
    }

    public final void setTranslationY(float r1) {
        this.translationY = r1;
    }

    public final float getElevation() {
        return this.elevation;
    }

    public final void setElevation(float r1) {
        this.elevation = r1;
    }

    public final int getAmbientShadowColor() {
        return this.ambientShadowColor;
    }

    public final void setAmbientShadowColor(int r1) {
        this.ambientShadowColor = r1;
    }

    public final int getSpotShadowColor() {
        return this.spotShadowColor;
    }

    public final void setSpotShadowColor(int r1) {
        this.spotShadowColor = r1;
    }

    public final float getRotationZ() {
        return this.rotationZ;
    }

    public final void setRotationZ(float r1) {
        this.rotationZ = r1;
    }

    public final float getRotationX() {
        return this.rotationX;
    }

    public final void setRotationX(float r1) {
        this.rotationX = r1;
    }

    public final float getRotationY() {
        return this.rotationY;
    }

    public final void setRotationY(float r1) {
        this.rotationY = r1;
    }

    public final float getCameraDistance() {
        return this.cameraDistance;
    }

    public final void setCameraDistance(float r1) {
        this.cameraDistance = r1;
    }

    public final float getPivotX() {
        return this.pivotX;
    }

    public final void setPivotX(float r1) {
        this.pivotX = r1;
    }

    public final float getPivotY() {
        return this.pivotY;
    }

    public final void setPivotY(float r1) {
        this.pivotY = r1;
    }

    public final boolean getClipToOutline() {
        return this.clipToOutline;
    }

    public final void setClipToOutline(boolean r1) {
        this.clipToOutline = r1;
    }

    public final boolean getClipToBounds() {
        return this.clipToBounds;
    }

    public final void setClipToBounds(boolean r1) {
        this.clipToBounds = r1;
    }

    public final float getAlpha() {
        return this.alpha;
    }

    public final void setAlpha(float r1) {
        this.alpha = r1;
    }

    public final RenderEffect getRenderEffect() {
        return this.renderEffect;
    }

    public final void setRenderEffect(RenderEffect r1) {
        this.renderEffect = r1;
    }

    /* JADX INFO: renamed from: getCompositingStrategy--NrFUSI, reason: not valid java name */
    public final int m6115getCompositingStrategyNrFUSI() {
        return this.compositingStrategy;
    }

    /* JADX INFO: renamed from: setCompositingStrategy-aDBOjCE, reason: not valid java name */
    public final void m6116setCompositingStrategyaDBOjCE(int r1) {
        this.compositingStrategy = r1;
    }
}
