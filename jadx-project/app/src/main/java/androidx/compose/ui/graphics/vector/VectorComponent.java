package androidx.compose.ui.graphics.vector;

import androidx.autofill.HintConstants;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.ImageBitmap;
import androidx.compose.ui.graphics.ImageBitmapConfig;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.unit.IntSize;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Vector.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u000e\b\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u00106\u001a\u00020\u000eH\u0002J\b\u00107\u001a\u00020\"H\u0016J\f\u00108\u001a\u00020\u000e*\u00020\rH\u0016J\u001c\u00108\u001a\u00020\u000e*\u00020\r2\u0006\u00109\u001a\u00020-2\b\u0010:\u001a\u0004\u0018\u00010\u0011R\u001a\u0010\u0005\u001a\u00020\u00068@X\u0080\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u001f\u0010\u000b\u001a\u0013\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\f¢\u0006\u0002\b\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R/\u0010\u0012\u001a\u0004\u0018\u00010\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u00118@@@X\u0080\u008e\u0002¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R \u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u000e0\u001aX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u000e\u0010\u001f\u001a\u00020 X\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010!\u001a\u00020\"X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R\u0016\u0010'\u001a\u00020(X\u0082\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\n\u0002\u0010)R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b*\u0010+R\u000e\u0010,\u001a\u00020-X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010.\u001a\u00020-X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010/\u001a\u0004\u0018\u00010\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R1\u00100\u001a\u00020(2\u0006\u0010\u0010\u001a\u00020(8@@@X\u0080\u008e\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b5\u0010\u0018\u001a\u0004\b1\u00102\"\u0004\b3\u00104\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006;"}, d2 = {"Landroidx/compose/ui/graphics/vector/VectorComponent;", "Landroidx/compose/ui/graphics/vector/VNode;", "root", "Landroidx/compose/ui/graphics/vector/GroupComponent;", "(Landroidx/compose/ui/graphics/vector/GroupComponent;)V", "cacheBitmapConfig", "Landroidx/compose/ui/graphics/ImageBitmapConfig;", "getCacheBitmapConfig-_sVssgQ$ui_release", "()I", "cacheDrawScope", "Landroidx/compose/ui/graphics/vector/DrawCache;", "drawVectorBlock", "Lkotlin/Function1;", "Landroidx/compose/ui/graphics/drawscope/DrawScope;", "", "Lkotlin/ExtensionFunctionType;", "<set-?>", "Landroidx/compose/ui/graphics/ColorFilter;", "intrinsicColorFilter", "getIntrinsicColorFilter$ui_release", "()Landroidx/compose/ui/graphics/ColorFilter;", "setIntrinsicColorFilter$ui_release", "(Landroidx/compose/ui/graphics/ColorFilter;)V", "intrinsicColorFilter$delegate", "Landroidx/compose/runtime/MutableState;", "invalidateCallback", "Lkotlin/Function0;", "getInvalidateCallback$ui_release", "()Lkotlin/jvm/functions/Function0;", "setInvalidateCallback$ui_release", "(Lkotlin/jvm/functions/Function0;)V", "isDirty", "", HintConstants.AUTOFILL_HINT_NAME, "", "getName", "()Ljava/lang/String;", "setName", "(Ljava/lang/String;)V", "previousDrawSize", "Landroidx/compose/ui/geometry/Size;", "J", "getRoot", "()Landroidx/compose/ui/graphics/vector/GroupComponent;", "rootScaleX", "", "rootScaleY", "tintFilter", "viewportSize", "getViewportSize-NH-jbRc$ui_release", "()J", "setViewportSize-uvyYCjk$ui_release", "(J)V", "viewportSize$delegate", "doInvalidate", "toString", "draw", "alpha", "colorFilter", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class VectorComponent extends VNode {
    public static final int $stable = 0;
    private final DrawCache cacheDrawScope;
    private final Function1<DrawScope, Unit> drawVectorBlock;
    private final MutableState intrinsicColorFilter$delegate;
    private Function0<Unit> invalidateCallback;
    private boolean isDirty;
    private String name;
    private long previousDrawSize;
    private final GroupComponent root;
    private float rootScaleX;
    private float rootScaleY;
    private ColorFilter tintFilter;
    private final MutableState viewportSize$delegate;

    static {
        $stable = 8;
    }

    public VectorComponent(GroupComponent root) {
        super(null);
        this.root = root;
        this.root.setInvalidateListener$ui_release(new AnonymousClass1(this));
        this.name = "";
        this.isDirty = true;
        this.cacheDrawScope = new DrawCache();
        this.invalidateCallback = VectorComponent$invalidateCallback$1.INSTANCE;
        this.intrinsicColorFilter$delegate = SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
        this.viewportSize$delegate = SnapshotStateKt.mutableStateOf$default(Size.m4182boximpl(Size.Companion.m4203getZeroNHjbRc()), null, 2, null);
        this.previousDrawSize = Size.Companion.m4202getUnspecifiedNHjbRc();
        this.rootScaleX = 1.0f;
        this.rootScaleY = 1.0f;
        this.drawVectorBlock = new VectorComponent$drawVectorBlock$1(this);
    }

    public static final /* synthetic */ void access$doInvalidate(VectorComponent $this) {
        $this.doInvalidate();
    }

    public static final /* synthetic */ float access$getRootScaleX$p(VectorComponent $this) {
        return $this.rootScaleX;
    }

    public static final /* synthetic */ float access$getRootScaleY$p(VectorComponent $this) {
        return $this.rootScaleY;
    }

    public final GroupComponent getRoot() {
        return this.root;
    }

    public final String getName() {
        return this.name;
    }

    public final void setName(String r1) {
        this.name = r1;
    }

    private final void doInvalidate() {
        this.isDirty = true;
        this.invalidateCallback.invoke();
    }

    /* JADX INFO: renamed from: getCacheBitmapConfig-_sVssgQ$ui_release, reason: not valid java name */
    public final int m5061getCacheBitmapConfig_sVssgQ$ui_release() {
        ImageBitmap r0 = this.cacheDrawScope.getMCachedImage();
        if (r0 == null) goto L6;
        return r0.mo4233getConfig_sVssgQ();
    L6:
        return ImageBitmapConfig.Companion.m4586getArgb8888_sVssgQ();
    }

    public final Function0<Unit> getInvalidateCallback$ui_release() {
        return this.invalidateCallback;
    }

    public final void setInvalidateCallback$ui_release(Function0<Unit> r1) {
        this.invalidateCallback = r1;
    }

    public final ColorFilter getIntrinsicColorFilter$ui_release() {
        State $this$getValue$iv = this.intrinsicColorFilter$delegate;
        return (ColorFilter) $this$getValue$iv.getValue();
    }

    public final void setIntrinsicColorFilter$ui_release(ColorFilter r4) {
        MutableState $this$setValue$iv = this.intrinsicColorFilter$delegate;
        $this$setValue$iv.setValue(r4);
    }

    /* JADX INFO: renamed from: getViewportSize-NH-jbRc$ui_release, reason: not valid java name */
    public final long m5062getViewportSizeNHjbRc$ui_release() {
        State $this$getValue$iv = this.viewportSize$delegate;
        return ((Size) $this$getValue$iv.getValue()).m4199unboximpl();
    }

    /* JADX INFO: renamed from: setViewportSize-uvyYCjk$ui_release, reason: not valid java name */
    public final void m5063setViewportSizeuvyYCjk$ui_release(long r5) {
        MutableState $this$setValue$iv = this.viewportSize$delegate;
        $this$setValue$iv.setValue(Size.m4182boximpl(r5));
    }

    public final void draw(DrawScope $this$draw, float alpha, ColorFilter colorFilter) {
        if (this.root.isTintable() == false) goto L10;
        long $this$isSpecified$iv = this.root.m5046getTintColor0d7_KjU();
        boolean isOneColor = true;
        if ($this$isSpecified$iv == 16) goto L7;
        int r2 = 1;
    L8:
        if (r2 == 0) goto L10;
    L12:
        if (isOneColor == true) goto L14;
    L18:
        int r3 = ImageBitmapConfig.Companion.m4586getArgb8888_sVssgQ();
    L19:
        int targetImageConfig = r3;
        if (this.isDirty == true) goto L28;
        if (Size.m4190equalsimpl0(this.previousDrawSize, $this$draw.mo4917getSizeNHjbRc()) == false) goto L28;
        if (ImageBitmapConfig.m4581equalsimpl0(targetImageConfig, m5061getCacheBitmapConfig_sVssgQ$ui_release()) == false) goto L28;
    L32:
        if (colorFilter == null) goto L35;
        ColorFilter targetFilter = colorFilter;
    L38:
        this.cacheDrawScope.drawInto($this$draw, alpha, targetFilter);
        return;
    L35:
        if (getIntrinsicColorFilter$ui_release() == null) goto L37;
        targetFilter = getIntrinsicColorFilter$ui_release();
        goto L38
    L37:
        targetFilter = this.tintFilter;
    L28:
        if (ImageBitmapConfig.m4581equalsimpl0(targetImageConfig, ImageBitmapConfig.Companion.m4585getAlpha8_sVssgQ()) == false) goto L30;
        ColorFilter r4 = ColorFilter.Companion.m4407tintxETnrds$default(ColorFilter.Companion, this.root.m5046getTintColor0d7_KjU(), 0, 2, null);
    L31:
        this.tintFilter = r4;
        long arg0$iv = $this$draw.mo4917getSizeNHjbRc();
        int bits$iv$iv$iv = (int) (arg0$iv >> 32);
        float r12 = Float.intBitsToFloat(bits$iv$iv$iv);
        long arg0$iv2 = m5062getViewportSizeNHjbRc$ui_release();
        int bits$iv$iv$iv2 = (int) (arg0$iv2 >> 32);
        this.rootScaleX = r12 / Float.intBitsToFloat(bits$iv$iv$iv2);
        long arg0$iv3 = $this$draw.mo4917getSizeNHjbRc();
        int bits$iv$iv$iv3 = (int) (arg0$iv3 & 4294967295L);
        float r14 = Float.intBitsToFloat(bits$iv$iv$iv3);
        long arg0$iv4 = m5062getViewportSizeNHjbRc$ui_release();
        int bits$iv$iv$iv4 = (int) (arg0$iv4 & 4294967295L);
        this.rootScaleY = r14 / Float.intBitsToFloat(bits$iv$iv$iv4);
        DrawCache r8 = this.cacheDrawScope;
        long arg0$iv5 = $this$draw.mo4917getSizeNHjbRc();
        int bits$iv$iv$iv5 = (int) (arg0$iv5 >> 32);
        int width$iv = (int) Math.ceil(Float.intBitsToFloat(bits$iv$iv$iv5));
        long arg0$iv6 = $this$draw.mo4917getSizeNHjbRc();
        int bits$iv$iv$iv6 = (int) (arg0$iv6 & 4294967295L);
        int height$iv = (int) Math.ceil(Float.intBitsToFloat(bits$iv$iv$iv6));
        r8.m5044drawCachedImageFqjB98A(targetImageConfig, IntSize.m7139constructorimpl((((long) width$iv) << 32) | (((long) height$iv) & 4294967295L)), $this$draw, $this$draw.getLayoutDirection(), this.drawVectorBlock);
        this.isDirty = false;
        this.previousDrawSize = $this$draw.mo4917getSizeNHjbRc();
        goto L32
    L30:
        r4 = null;
        goto L31
    L14:
        if (VectorKt.tintableWithAlphaMask(getIntrinsicColorFilter$ui_release()) == false) goto L18;
        if (VectorKt.tintableWithAlphaMask(colorFilter) == false) goto L18;
        r3 = ImageBitmapConfig.Companion.m4585getAlpha8_sVssgQ();
        goto L19
    L7:
        r2 = 0;
    L10:
        isOneColor = false;
        goto L12
    }

    @Override // androidx.compose.ui.graphics.vector.VNode
    public void draw(DrawScope $this$draw) {
        draw($this$draw, 1.0f, null);
    }

    public String toString() {
        StringBuilder $this$toString_u24lambda_u240 = new StringBuilder();
        $this$toString_u24lambda_u240.append("Params: ");
        $this$toString_u24lambda_u240.append("\tname: ").append(this.name).append("\n");
        StringBuilder r3 = $this$toString_u24lambda_u240.append("\tviewportWidth: ");
        long arg0$iv = m5062getViewportSizeNHjbRc$ui_release();
        int bits$iv$iv$iv = (int) (arg0$iv >> 32);
        r3.append(Float.intBitsToFloat(bits$iv$iv$iv)).append("\n");
        StringBuilder r4 = $this$toString_u24lambda_u240.append("\tviewportHeight: ");
        long arg0$iv2 = m5062getViewportSizeNHjbRc$ui_release();
        int bits$iv$iv$iv2 = (int) (4294967295L & arg0$iv2);
        r4.append(Float.intBitsToFloat(bits$iv$iv$iv2)).append("\n");
        String r0 = $this$toString_u24lambda_u240.toString();
        Intrinsics.checkNotNullExpressionValue(r0, "toString(...)");
        return r0;
    }
}
