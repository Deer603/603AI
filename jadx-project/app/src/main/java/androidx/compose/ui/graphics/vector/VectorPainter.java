package androidx.compose.ui.graphics.vector;

import androidx.autofill.HintConstants;
import androidx.compose.runtime.Composition;
import androidx.compose.runtime.IntState;
import androidx.compose.runtime.MutableIntState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotIntStateKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.drawscope.DrawContext;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.drawscope.DrawTransform;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: VectorPainter.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0000\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010@\u001a\u00020\u00062\u0006\u0010A\u001a\u00020\u0019H\u0014J\u0012\u0010B\u001a\u00020\u00062\b\u0010C\u001a\u0004\u0018\u00010\u001bH\u0014J\f\u0010D\u001a\u00020E*\u00020FH\u0014R+\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00068@@@X\u0080\u008e\u0002¢\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001a\u0010\u000e\u001a\u00020\u000f8@X\u0080\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u000e\u0010\u0018\u001a\u00020\u0019X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001a\u001a\u0004\u0018\u00010\u001bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u001dX\u0082\u000e¢\u0006\u0002\n\u0000R(\u0010\u001f\u001a\u0004\u0018\u00010\u001b2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001b8@@@X\u0080\u000e¢\u0006\f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\u001a\u0010$\u001a\u00020%8VX\u0096\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b&\u0010'R+\u0010(\u001a\u00020\u001d2\u0006\u0010\u0005\u001a\u00020\u001d8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b,\u0010-\u001a\u0004\b)\u0010\u0011\"\u0004\b*\u0010+R$\u0010/\u001a\u00020.2\u0006\u0010\u001e\u001a\u00020.8@@@X\u0080\u000e¢\u0006\f\u001a\u0004\b0\u00101\"\u0004\b2\u00103R1\u00104\u001a\u00020%2\u0006\u0010\u0005\u001a\u00020%8@@@X\u0080\u008e\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b8\u0010\r\u001a\u0004\b5\u0010'\"\u0004\b6\u00107R\u0014\u00109\u001a\u00020:X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b;\u0010<R*\u0010=\u001a\u00020%2\u0006\u0010\u001e\u001a\u00020%8@@@X\u0080\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\f\u001a\u0004\b>\u0010'\"\u0004\b?\u00107\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006G"}, d2 = {"Landroidx/compose/ui/graphics/vector/VectorPainter;", "Landroidx/compose/ui/graphics/painter/Painter;", "root", "Landroidx/compose/ui/graphics/vector/GroupComponent;", "(Landroidx/compose/ui/graphics/vector/GroupComponent;)V", "<set-?>", "", "autoMirror", "getAutoMirror$ui_release", "()Z", "setAutoMirror$ui_release", "(Z)V", "autoMirror$delegate", "Landroidx/compose/runtime/MutableState;", "bitmapConfig", "Landroidx/compose/ui/graphics/ImageBitmapConfig;", "getBitmapConfig-_sVssgQ$ui_release", "()I", "composition", "Landroidx/compose/runtime/Composition;", "getComposition$ui_release", "()Landroidx/compose/runtime/Composition;", "setComposition$ui_release", "(Landroidx/compose/runtime/Composition;)V", "currentAlpha", "", "currentColorFilter", "Landroidx/compose/ui/graphics/ColorFilter;", "drawCount", "", "value", "intrinsicColorFilter", "getIntrinsicColorFilter$ui_release", "()Landroidx/compose/ui/graphics/ColorFilter;", "setIntrinsicColorFilter$ui_release", "(Landroidx/compose/ui/graphics/ColorFilter;)V", "intrinsicSize", "Landroidx/compose/ui/geometry/Size;", "getIntrinsicSize-NH-jbRc", "()J", "invalidateCount", "getInvalidateCount", "setInvalidateCount", "(I)V", "invalidateCount$delegate", "Landroidx/compose/runtime/MutableIntState;", "", HintConstants.AUTOFILL_HINT_NAME, "getName$ui_release", "()Ljava/lang/String;", "setName$ui_release", "(Ljava/lang/String;)V", "size", "getSize-NH-jbRc$ui_release", "setSize-uvyYCjk$ui_release", "(J)V", "size$delegate", "vector", "Landroidx/compose/ui/graphics/vector/VectorComponent;", "getVector$ui_release", "()Landroidx/compose/ui/graphics/vector/VectorComponent;", "viewportSize", "getViewportSize-NH-jbRc$ui_release", "setViewportSize-uvyYCjk$ui_release", "applyAlpha", "alpha", "applyColorFilter", "colorFilter", "onDraw", "", "Landroidx/compose/ui/graphics/drawscope/DrawScope;", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class VectorPainter extends Painter {
    public static final int $stable = 0;
    private final MutableState autoMirror$delegate;
    private Composition composition;
    private float currentAlpha;
    private ColorFilter currentColorFilter;
    private int drawCount;
    private final MutableIntState invalidateCount$delegate;
    private final MutableState size$delegate;
    private final VectorComponent vector;

    static {
        $stable = 8;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public VectorPainter() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public VectorPainter(GroupComponent root) {
        this.size$delegate = SnapshotStateKt.mutableStateOf$default(Size.m4182boximpl(Size.Companion.m4203getZeroNHjbRc()), null, 2, null);
        this.autoMirror$delegate = SnapshotStateKt.mutableStateOf$default(false, null, 2, null);
        VectorComponent $this$vector_u24lambda_u240 = new VectorComponent(root);
        $this$vector_u24lambda_u240.setInvalidateCallback$ui_release(new VectorPainter$vector$1$1(this));
        this.vector = $this$vector_u24lambda_u240;
        this.invalidateCount$delegate = SnapshotIntStateKt.mutableIntStateOf(0);
        this.currentAlpha = 1.0f;
        this.drawCount = -1;
    }

    public /* synthetic */ VectorPainter(GroupComponent r1, int r2, DefaultConstructorMarker r3) {
        if ((r2 & 1) == 0) goto L5;
        r1 = new GroupComponent();
    L5:
        this(r1);
    }

    public static final /* synthetic */ int access$getDrawCount$p(VectorPainter $this) {
        return $this.drawCount;
    }

    public static final /* synthetic */ int access$getInvalidateCount(VectorPainter $this) {
        return $this.getInvalidateCount();
    }

    public static final /* synthetic */ void access$setInvalidateCount(VectorPainter $this, int r1) {
        $this.setInvalidateCount(r1);
    }

    /* JADX INFO: renamed from: getSize-NH-jbRc$ui_release, reason: not valid java name */
    public final long m5070getSizeNHjbRc$ui_release() {
        State $this$getValue$iv = this.size$delegate;
        return ((Size) $this$getValue$iv.getValue()).m4199unboximpl();
    }

    /* JADX INFO: renamed from: setSize-uvyYCjk$ui_release, reason: not valid java name */
    public final void m5072setSizeuvyYCjk$ui_release(long r5) {
        MutableState $this$setValue$iv = this.size$delegate;
        $this$setValue$iv.setValue(Size.m4182boximpl(r5));
    }

    public final boolean getAutoMirror$ui_release() {
        State $this$getValue$iv = this.autoMirror$delegate;
        return ((Boolean) $this$getValue$iv.getValue()).booleanValue();
    }

    public final void setAutoMirror$ui_release(boolean r5) {
        MutableState $this$setValue$iv = this.autoMirror$delegate;
        $this$setValue$iv.setValue(Boolean.valueOf(r5));
    }

    public final ColorFilter getIntrinsicColorFilter$ui_release() {
        return this.vector.getIntrinsicColorFilter$ui_release();
    }

    public final void setIntrinsicColorFilter$ui_release(ColorFilter value) {
        this.vector.setIntrinsicColorFilter$ui_release(value);
    }

    /* JADX INFO: renamed from: getViewportSize-NH-jbRc$ui_release, reason: not valid java name */
    public final long m5071getViewportSizeNHjbRc$ui_release() {
        return this.vector.m5062getViewportSizeNHjbRc$ui_release();
    }

    /* JADX INFO: renamed from: setViewportSize-uvyYCjk$ui_release, reason: not valid java name */
    public final void m5073setViewportSizeuvyYCjk$ui_release(long value) {
        this.vector.m5063setViewportSizeuvyYCjk$ui_release(value);
    }

    public final String getName$ui_release() {
        return this.vector.getName();
    }

    public final void setName$ui_release(String value) {
        this.vector.setName(value);
    }

    public final VectorComponent getVector$ui_release() {
        return this.vector;
    }

    /* JADX INFO: renamed from: getBitmapConfig-_sVssgQ$ui_release, reason: not valid java name */
    public final int m5069getBitmapConfig_sVssgQ$ui_release() {
        return this.vector.m5061getCacheBitmapConfig_sVssgQ$ui_release();
    }

    public final Composition getComposition$ui_release() {
        return this.composition;
    }

    public final void setComposition$ui_release(Composition r1) {
        this.composition = r1;
    }

    private final int getInvalidateCount() {
        IntState $this$getValue$iv = this.invalidateCount$delegate;
        return $this$getValue$iv.getIntValue();
    }

    private final void setInvalidateCount(int r4) {
        MutableIntState $this$setValue$iv = this.invalidateCount$delegate;
        $this$setValue$iv.setIntValue(r4);
    }

    @Override // androidx.compose.ui.graphics.painter.Painter
    /* JADX INFO: renamed from: getIntrinsicSize-NH-jbRc */
    public long mo5037getIntrinsicSizeNHjbRc() {
        return m5070getSizeNHjbRc$ui_release();
    }

    @Override // androidx.compose.ui.graphics.painter.Painter
    protected void onDraw(DrawScope $this$onDraw) {
        VectorComponent $this$onDraw_u24lambda_u242 = this.vector;
        ColorFilter r0 = this.currentColorFilter;
        if (r0 != null) goto L5;
        r0 = $this$onDraw_u24lambda_u242.getIntrinsicColorFilter$ui_release();
    L5:
        ColorFilter filter = r0;
        if (getAutoMirror$ui_release() == true) goto L8;
    L20:
        $this$onDraw_u24lambda_u242.draw($this$onDraw, this.currentAlpha, filter);
    L21:
        this.drawCount = getInvalidateCount();
        return;
    L8:
        if ($this$onDraw.getLayoutDirection() != LayoutDirection.Rtl) goto L20;
        long pivot$iv$iv = $this$onDraw.mo4916getCenterF1C5BW0();
        DrawContext $this$withTransform_u24lambda_u246$iv$iv$iv = $this$onDraw.getDrawContext();
        long previousSize$iv$iv$iv = $this$withTransform_u24lambda_u246$iv$iv$iv.mo4838getSizeNHjbRc();
        $this$withTransform_u24lambda_u246$iv$iv$iv.getCanvas().save();
        DrawTransform $this$scale_Fgt4K4Q_u24lambda_u242$iv$iv = $this$withTransform_u24lambda_u246$iv$iv$iv.getTransform();     // Catch: Throwable -> L16
        $this$scale_Fgt4K4Q_u24lambda_u242$iv$iv.mo4845scale0AR0LA0(-1.0f, 1.0f, pivot$iv$iv);     // Catch: Throwable -> L16
        $this$onDraw_u24lambda_u242.draw($this$onDraw, this.currentAlpha, filter);     // Catch: Throwable -> L14
        $this$withTransform_u24lambda_u246$iv$iv$iv.getCanvas().restore();
        $this$withTransform_u24lambda_u246$iv$iv$iv.mo4839setSizeuvyYCjk(previousSize$iv$iv$iv);
    L14:
        th = th;
    L18:
        $this$withTransform_u24lambda_u246$iv$iv$iv.getCanvas().restore();
        $this$withTransform_u24lambda_u246$iv$iv$iv.mo4839setSizeuvyYCjk(previousSize$iv$iv$iv);
        throw th;
    L16:
        th = th;
        goto L18
    }

    @Override // androidx.compose.ui.graphics.painter.Painter
    protected boolean applyAlpha(float alpha) {
        this.currentAlpha = alpha;
        return true;
    }

    @Override // androidx.compose.ui.graphics.painter.Painter
    protected boolean applyColorFilter(ColorFilter colorFilter) {
        this.currentColorFilter = colorFilter;
        return true;
    }
}
