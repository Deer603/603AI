package androidx.compose.ui.draganddrop;

import android.graphics.Canvas;
import android.graphics.Point;
import android.view.View;
import androidx.compose.ui.graphics.AndroidCanvas_androidKt;
import androidx.compose.ui.graphics.drawscope.CanvasDrawScope;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: ComposeDragShadowBuilder.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B.\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0017\u0010\u0006\u001a\u0013\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007¢\u0006\u0002\b\n¢\u0006\u0002\u0010\u000bJ\u0010\u0010\r\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\u0018\u0010\u0010\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0012H\u0016R\u0016\u0010\u0004\u001a\u00020\u0005X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\n\u0002\u0010\fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u001f\u0010\u0006\u001a\u0013\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007¢\u0006\u0002\b\nX\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0014"}, d2 = {"Landroidx/compose/ui/draganddrop/ComposeDragShadowBuilder;", "Landroid/view/View$DragShadowBuilder;", "density", "Landroidx/compose/ui/unit/Density;", "decorationSize", "Landroidx/compose/ui/geometry/Size;", "drawDragDecoration", "Lkotlin/Function1;", "Landroidx/compose/ui/graphics/drawscope/DrawScope;", "", "Lkotlin/ExtensionFunctionType;", "(Landroidx/compose/ui/unit/Density;JLkotlin/jvm/functions/Function1;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "J", "onDrawShadow", "canvas", "Landroid/graphics/Canvas;", "onProvideShadowMetrics", "outShadowSize", "Landroid/graphics/Point;", "outShadowTouchPoint", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class ComposeDragShadowBuilder extends View.DragShadowBuilder {
    public static final int $stable = 0;
    private final long decorationSize;
    private final Density density;
    private final Function1<DrawScope, Unit> drawDragDecoration;

    static {
    }

    public /* synthetic */ ComposeDragShadowBuilder(Density r1, long r2, Function1 r4, DefaultConstructorMarker r5) {
        this(r1, r2, r4);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private ComposeDragShadowBuilder(Density density, long decorationSize, Function1<? super DrawScope, Unit> r4) {
        this.density = density;
        this.decorationSize = decorationSize;
        this.drawDragDecoration = r4;
    }

    @Override // android.view.View.DragShadowBuilder
    public void onProvideShadowMetrics(Point outShadowSize, Point outShadowTouchPoint) {
        Density $this$onProvideShadowMetrics_u24lambda_u240 = this.density;
        long arg0$iv = this.decorationSize;
        int bits$iv$iv$iv = (int) (arg0$iv >> 32);
        int r2 = $this$onProvideShadowMetrics_u24lambda_u240.mo370roundToPx0680j_4($this$onProvideShadowMetrics_u24lambda_u240.mo372toDpu2uoSUM(Float.intBitsToFloat(bits$iv$iv$iv)));
        long arg0$iv2 = this.decorationSize;
        int bits$iv$iv$iv2 = (int) (4294967295L & arg0$iv2);
        outShadowSize.set(r2, $this$onProvideShadowMetrics_u24lambda_u240.mo370roundToPx0680j_4($this$onProvideShadowMetrics_u24lambda_u240.mo372toDpu2uoSUM(Float.intBitsToFloat(bits$iv$iv$iv2))));
        outShadowTouchPoint.set(outShadowSize.x / 2, outShadowSize.y / 2);
    }

    @Override // android.view.View.DragShadowBuilder
    public void onDrawShadow(Canvas canvas) {
        CanvasDrawScope this_$iv = new CanvasDrawScope();
        Density r2 = this.density;
        long r3 = this.decorationSize;
        LayoutDirection r5 = LayoutDirection.Ltr;
        androidx.compose.ui.graphics.Canvas r6 = AndroidCanvas_androidKt.Canvas(canvas);
        Function1<DrawScope, Unit> r7 = this.drawDragDecoration;
        CanvasDrawScope.DrawParams r9 = this_$iv.getDrawParams();
        Density prevDensity$iv = r9.component1();
        LayoutDirection prevLayoutDirection$iv = r9.component2();
        androidx.compose.ui.graphics.Canvas prevCanvas$iv = r9.component3();
        long prevSize$iv = r9.m4834component4NHjbRc();
        CanvasDrawScope.DrawParams $this$draw_yzxVdVo_u24lambda_u240$iv = this_$iv.getDrawParams();
        $this$draw_yzxVdVo_u24lambda_u240$iv.setDensity(r2);
        $this$draw_yzxVdVo_u24lambda_u240$iv.setLayoutDirection(r5);
        $this$draw_yzxVdVo_u24lambda_u240$iv.setCanvas(r6);
        $this$draw_yzxVdVo_u24lambda_u240$iv.m4837setSizeuvyYCjk(r3);
        r6.save();
        r7.invoke(this_$iv);
        r6.restore();
        CanvasDrawScope.DrawParams $this$draw_yzxVdVo_u24lambda_u241$iv = this_$iv.getDrawParams();
        $this$draw_yzxVdVo_u24lambda_u241$iv.setDensity(prevDensity$iv);
        $this$draw_yzxVdVo_u24lambda_u241$iv.setLayoutDirection(prevLayoutDirection$iv);
        $this$draw_yzxVdVo_u24lambda_u241$iv.setCanvas(prevCanvas$iv);
        $this$draw_yzxVdVo_u24lambda_u241$iv.m4837setSizeuvyYCjk(prevSize$iv);
    }
}
