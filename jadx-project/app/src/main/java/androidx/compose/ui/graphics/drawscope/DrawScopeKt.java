package androidx.compose.ui.graphics.drawscope;

import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.ClipOp;
import androidx.compose.ui.graphics.DegreesKt;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.layer.GraphicsLayer;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: DrawScope.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000^\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\u001aB\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\u0017\u0010\u0007\u001a\u0013\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00010\b¢\u0006\u0002\b\tH\u0086\bø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000b\u001ab\u0010\f\u001a\u00020\u0001*\u00020\u00022\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\u000e2\b\b\u0002\u0010\u0011\u001a\u00020\u000e2\b\b\u0002\u0010\u0005\u001a\u00020\u00062\u0017\u0010\u0007\u001a\u0013\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00010\b¢\u0006\u0002\b\tH\u0086\bø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0013\u001aP\u0010\u0014\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\u0017\u0010\u0007\u001a\u0013\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00010\b¢\u0006\u0002\b\tH\u0087\bø\u0001\u0000¢\u0006\u0004\b\u001d\u0010\u001e\u001a\\\u0010\u0014\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010 2\u0017\u0010\u0007\u001a\u0013\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00010\b¢\u0006\u0002\b\tH\u0086\bø\u0001\u0000¢\u0006\u0004\b!\u0010\"\u001a!\u0010#\u001a\u00020\u0001*\u00020\u00022\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u00010\bH\u0086\b\u001a.\u0010$\u001a\u00020\u0001*\u00020\u00022\u0006\u0010$\u001a\u00020\u000e2\u0017\u0010\u0007\u001a\u0013\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00010\b¢\u0006\u0002\b\tH\u0086\b\u001a:\u0010$\u001a\u00020\u0001*\u00020\u00022\b\b\u0002\u0010%\u001a\u00020\u000e2\b\b\u0002\u0010&\u001a\u00020\u000e2\u0017\u0010\u0007\u001a\u0013\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00010\b¢\u0006\u0002\b\tH\u0086\b\u001aF\u0010$\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u000e2\u0017\u0010\u0007\u001a\u0013\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00010\b¢\u0006\u0002\b\tH\u0086\b\u001aB\u0010'\u001a\u00020\u0001*\u00020\u00022\u0006\u0010(\u001a\u00020\u000e2\b\b\u0002\u0010)\u001a\u00020*2\u0017\u0010\u0007\u001a\u0013\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00010\b¢\u0006\u0002\b\tH\u0086\bø\u0001\u0000¢\u0006\u0004\b+\u0010,\u001aB\u0010-\u001a\u00020\u0001*\u00020\u00022\u0006\u0010.\u001a\u00020\u000e2\b\b\u0002\u0010)\u001a\u00020*2\u0017\u0010\u0007\u001a\u0013\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00010\b¢\u0006\u0002\b\tH\u0086\bø\u0001\u0000¢\u0006\u0004\b/\u0010,\u001aB\u00100\u001a\u00020\u0001*\u00020\u00022\u0006\u00100\u001a\u00020\u000e2\b\b\u0002\u0010)\u001a\u00020*2\u0017\u0010\u0007\u001a\u0013\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00010\b¢\u0006\u0002\b\tH\u0086\bø\u0001\u0000¢\u0006\u0004\b1\u0010,\u001aJ\u00100\u001a\u00020\u0001*\u00020\u00022\u0006\u00102\u001a\u00020\u000e2\u0006\u00103\u001a\u00020\u000e2\b\b\u0002\u0010)\u001a\u00020*2\u0017\u0010\u0007\u001a\u0013\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00010\b¢\u0006\u0002\b\tH\u0086\bø\u0001\u0000¢\u0006\u0004\b4\u00105\u001a:\u00106\u001a\u00020\u0001*\u00020\u00022\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\u0017\u0010\u0007\u001a\u0013\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00010\b¢\u0006\u0002\b\tH\u0086\b\u001a?\u00107\u001a\u00020\u0001*\u00020\u00022\u0017\u00108\u001a\u0013\u0012\u0004\u0012\u000209\u0012\u0004\u0012\u00020\u00010\b¢\u0006\u0002\b\t2\u0017\u0010:\u001a\u0013\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00010\b¢\u0006\u0002\b\tH\u0086\b\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006;"}, d2 = {"clipPath", "", "Landroidx/compose/ui/graphics/drawscope/DrawScope;", "path", "Landroidx/compose/ui/graphics/Path;", "clipOp", "Landroidx/compose/ui/graphics/ClipOp;", "block", "Lkotlin/Function1;", "Lkotlin/ExtensionFunctionType;", "clipPath-KD09W0M", "(Landroidx/compose/ui/graphics/drawscope/DrawScope;Landroidx/compose/ui/graphics/Path;ILkotlin/jvm/functions/Function1;)V", "clipRect", "left", "", "top", "right", "bottom", "clipRect-rOu3jXo", "(Landroidx/compose/ui/graphics/drawscope/DrawScope;FFFFILkotlin/jvm/functions/Function1;)V", "draw", "density", "Landroidx/compose/ui/unit/Density;", "layoutDirection", "Landroidx/compose/ui/unit/LayoutDirection;", "canvas", "Landroidx/compose/ui/graphics/Canvas;", "size", "Landroidx/compose/ui/geometry/Size;", "draw-GRGpd60", "(Landroidx/compose/ui/graphics/drawscope/DrawScope;Landroidx/compose/ui/unit/Density;Landroidx/compose/ui/unit/LayoutDirection;Landroidx/compose/ui/graphics/Canvas;JLkotlin/jvm/functions/Function1;)V", "graphicsLayer", "Landroidx/compose/ui/graphics/layer/GraphicsLayer;", "draw-ymL40Pk", "(Landroidx/compose/ui/graphics/drawscope/DrawScope;Landroidx/compose/ui/unit/Density;Landroidx/compose/ui/unit/LayoutDirection;Landroidx/compose/ui/graphics/Canvas;JLandroidx/compose/ui/graphics/layer/GraphicsLayer;Lkotlin/jvm/functions/Function1;)V", "drawIntoCanvas", "inset", "horizontal", "vertical", "rotate", "degrees", "pivot", "Landroidx/compose/ui/geometry/Offset;", "rotate-Rg1IO4c", "(Landroidx/compose/ui/graphics/drawscope/DrawScope;FJLkotlin/jvm/functions/Function1;)V", "rotateRad", "radians", "rotateRad-Rg1IO4c", "scale", "scale-Rg1IO4c", "scaleX", "scaleY", "scale-Fgt4K4Q", "(Landroidx/compose/ui/graphics/drawscope/DrawScope;FFJLkotlin/jvm/functions/Function1;)V", "translate", "withTransform", "transformBlock", "Landroidx/compose/ui/graphics/drawscope/DrawTransform;", "drawBlock", "ui-graphics_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class DrawScopeKt {
    public static final void inset(DrawScope $this$inset, float left, float top, float right, float bottom, Function1<? super DrawScope, Unit> r12) {
        $this$inset.getDrawContext().getTransform().inset(left, top, right, bottom);
        r12.invoke($this$inset);     // Catch: Throwable -> L6
        $this$inset.getDrawContext().getTransform().inset(-left, -top, -right, -bottom);
        return;
    L6:
        th = move-exception;
        $this$inset.getDrawContext().getTransform().inset(-left, -top, -right, -bottom);
        throw th;
    }

    public static final void inset(DrawScope $this$inset, float inset, Function1<? super DrawScope, Unit> r9) {
        $this$inset.getDrawContext().getTransform().inset(inset, inset, inset, inset);
        r9.invoke($this$inset);     // Catch: Throwable -> L6
        $this$inset.getDrawContext().getTransform().inset(-inset, -inset, -inset, -inset);
        return;
    L6:
        th = move-exception;
        $this$inset.getDrawContext().getTransform().inset(-inset, -inset, -inset, -inset);
        throw th;
    }

    public static /* synthetic */ void inset$default(DrawScope $this$inset_u24default, float horizontal, float vertical, Function1 block, int r11, Object r12) {
        if ((r11 & 1) == 0) goto L6;
        horizontal = 0.0f;
    L6:
        if ((r11 & 2) == 0) goto L8;
        vertical = 0.0f;
    L8:
        $this$inset_u24default.getDrawContext().getTransform().inset(horizontal, vertical, horizontal, vertical);
        block.invoke($this$inset_u24default);     // Catch: Throwable -> L12
        $this$inset_u24default.getDrawContext().getTransform().inset(-horizontal, -vertical, -horizontal, -vertical);
        return;
    L12:
        th = move-exception;
        $this$inset_u24default.getDrawContext().getTransform().inset(-horizontal, -vertical, -horizontal, -vertical);
        throw th;
    }

    public static final void inset(DrawScope $this$inset, float horizontal, float vertical, Function1<? super DrawScope, Unit> r12) {
        $this$inset.getDrawContext().getTransform().inset(horizontal, vertical, horizontal, vertical);
        r12.invoke($this$inset);     // Catch: Throwable -> L6
        $this$inset.getDrawContext().getTransform().inset(-horizontal, -vertical, -horizontal, -vertical);
        return;
    L6:
        th = move-exception;
        $this$inset.getDrawContext().getTransform().inset(-horizontal, -vertical, -horizontal, -vertical);
        throw th;
    }

    public static /* synthetic */ void translate$default(DrawScope $this$translate_u24default, float left, float top, Function1 block, int r7, Object r8) {
        if ((r7 & 1) == 0) goto L6;
        left = 0.0f;
    L6:
        if ((r7 & 2) == 0) goto L8;
        top = 0.0f;
    L8:
        $this$translate_u24default.getDrawContext().getTransform().translate(left, top);
        block.invoke($this$translate_u24default);     // Catch: Throwable -> L12
        $this$translate_u24default.getDrawContext().getTransform().translate(-left, -top);
        return;
    L12:
        th = move-exception;
        $this$translate_u24default.getDrawContext().getTransform().translate(-left, -top);
        throw th;
    }

    public static final void translate(DrawScope $this$translate, float left, float top, Function1<? super DrawScope, Unit> r8) {
        $this$translate.getDrawContext().getTransform().translate(left, top);
        r8.invoke($this$translate);     // Catch: Throwable -> L6
        $this$translate.getDrawContext().getTransform().translate(-left, -top);
        return;
    L6:
        th = move-exception;
        $this$translate.getDrawContext().getTransform().translate(-left, -top);
        throw th;
    }

    /* JADX INFO: renamed from: rotate-Rg1IO4c$default, reason: not valid java name */
    public static /* synthetic */ void m4965rotateRg1IO4c$default(DrawScope $this$rotate_u2dRg1IO4c_u24default, float degrees, long pivot, Function1 block, int r12, Object r13) {
        if ((r12 & 2) == 0) goto L5;
        pivot = $this$rotate_u2dRg1IO4c_u24default.mo4916getCenterF1C5BW0();
    L5:
        DrawContext $this$withTransform_u24lambda_u246$iv = $this$rotate_u2dRg1IO4c_u24default.getDrawContext();
        long previousSize$iv = $this$withTransform_u24lambda_u246$iv.mo4838getSizeNHjbRc();
        $this$withTransform_u24lambda_u246$iv.getCanvas().save();
        DrawTransform $this$rotate_Rg1IO4c_u24lambda_u240 = $this$withTransform_u24lambda_u246$iv.getTransform();     // Catch: Throwable -> L9
        $this$rotate_Rg1IO4c_u24lambda_u240.mo4844rotateUv8p0NA(degrees, pivot);     // Catch: Throwable -> L9
        block.invoke($this$rotate_u2dRg1IO4c_u24default);     // Catch: Throwable -> L9
        $this$withTransform_u24lambda_u246$iv.getCanvas().restore();
        $this$withTransform_u24lambda_u246$iv.mo4839setSizeuvyYCjk(previousSize$iv);
        return;
    L9:
        th = move-exception;
        $this$withTransform_u24lambda_u246$iv.getCanvas().restore();
        $this$withTransform_u24lambda_u246$iv.mo4839setSizeuvyYCjk(previousSize$iv);
        throw th;
    }

    /* JADX INFO: renamed from: rotate-Rg1IO4c, reason: not valid java name */
    public static final void m4964rotateRg1IO4c(DrawScope $this$rotate_u2dRg1IO4c, float degrees, long pivot, Function1<? super DrawScope, Unit> r13) {
        DrawContext $this$withTransform_u24lambda_u246$iv = $this$rotate_u2dRg1IO4c.getDrawContext();
        long previousSize$iv = $this$withTransform_u24lambda_u246$iv.mo4838getSizeNHjbRc();
        $this$withTransform_u24lambda_u246$iv.getCanvas().save();
        DrawTransform $this$rotate_Rg1IO4c_u24lambda_u240 = $this$withTransform_u24lambda_u246$iv.getTransform();     // Catch: Throwable -> L6
        $this$rotate_Rg1IO4c_u24lambda_u240.mo4844rotateUv8p0NA(degrees, pivot);     // Catch: Throwable -> L6
        r13.invoke($this$rotate_u2dRg1IO4c);     // Catch: Throwable -> L6
        $this$withTransform_u24lambda_u246$iv.getCanvas().restore();
        $this$withTransform_u24lambda_u246$iv.mo4839setSizeuvyYCjk(previousSize$iv);
        return;
    L6:
        th = move-exception;
        $this$withTransform_u24lambda_u246$iv.getCanvas().restore();
        $this$withTransform_u24lambda_u246$iv.mo4839setSizeuvyYCjk(previousSize$iv);
        throw th;
    }

    /* JADX INFO: renamed from: rotateRad-Rg1IO4c$default, reason: not valid java name */
    public static /* synthetic */ void m4967rotateRadRg1IO4c$default(DrawScope $this$rotateRad_u2dRg1IO4c_u24default, float radians, long pivot, Function1 block, int r13, Object r14) {
        if ((r13 & 2) == 0) goto L5;
        pivot = $this$rotateRad_u2dRg1IO4c_u24default.mo4916getCenterF1C5BW0();
    L5:
        DrawContext $this$withTransform_u24lambda_u246$iv = $this$rotateRad_u2dRg1IO4c_u24default.getDrawContext();
        long previousSize$iv = $this$withTransform_u24lambda_u246$iv.mo4838getSizeNHjbRc();
        $this$withTransform_u24lambda_u246$iv.getCanvas().save();
        DrawTransform $this$rotateRad_Rg1IO4c_u24lambda_u241 = $this$withTransform_u24lambda_u246$iv.getTransform();     // Catch: Throwable -> L9
        $this$rotateRad_Rg1IO4c_u24lambda_u241.mo4844rotateUv8p0NA(DegreesKt.degrees(radians), pivot);     // Catch: Throwable -> L9
        block.invoke($this$rotateRad_u2dRg1IO4c_u24default);     // Catch: Throwable -> L9
        $this$withTransform_u24lambda_u246$iv.getCanvas().restore();
        $this$withTransform_u24lambda_u246$iv.mo4839setSizeuvyYCjk(previousSize$iv);
        return;
    L9:
        th = move-exception;
        $this$withTransform_u24lambda_u246$iv.getCanvas().restore();
        $this$withTransform_u24lambda_u246$iv.mo4839setSizeuvyYCjk(previousSize$iv);
        throw th;
    }

    /* JADX INFO: renamed from: rotateRad-Rg1IO4c, reason: not valid java name */
    public static final void m4966rotateRadRg1IO4c(DrawScope $this$rotateRad_u2dRg1IO4c, float radians, long pivot, Function1<? super DrawScope, Unit> r14) {
        DrawContext $this$withTransform_u24lambda_u246$iv = $this$rotateRad_u2dRg1IO4c.getDrawContext();
        long previousSize$iv = $this$withTransform_u24lambda_u246$iv.mo4838getSizeNHjbRc();
        $this$withTransform_u24lambda_u246$iv.getCanvas().save();
        DrawTransform $this$rotateRad_Rg1IO4c_u24lambda_u241 = $this$withTransform_u24lambda_u246$iv.getTransform();     // Catch: Throwable -> L6
        $this$rotateRad_Rg1IO4c_u24lambda_u241.mo4844rotateUv8p0NA(DegreesKt.degrees(radians), pivot);     // Catch: Throwable -> L6
        r14.invoke($this$rotateRad_u2dRg1IO4c);     // Catch: Throwable -> L6
        $this$withTransform_u24lambda_u246$iv.getCanvas().restore();
        $this$withTransform_u24lambda_u246$iv.mo4839setSizeuvyYCjk(previousSize$iv);
        return;
    L6:
        th = move-exception;
        $this$withTransform_u24lambda_u246$iv.getCanvas().restore();
        $this$withTransform_u24lambda_u246$iv.mo4839setSizeuvyYCjk(previousSize$iv);
        throw th;
    }

    /* JADX INFO: renamed from: scale-Fgt4K4Q$default, reason: not valid java name */
    public static /* synthetic */ void m4969scaleFgt4K4Q$default(DrawScope $this$scale_u2dFgt4K4Q_u24default, float scaleX, float scaleY, long pivot, Function1 block, int r13, Object r14) {
        if ((r13 & 4) == 0) goto L5;
        pivot = $this$scale_u2dFgt4K4Q_u24default.mo4916getCenterF1C5BW0();
    L5:
        DrawContext $this$withTransform_u24lambda_u246$iv = $this$scale_u2dFgt4K4Q_u24default.getDrawContext();
        long previousSize$iv = $this$withTransform_u24lambda_u246$iv.mo4838getSizeNHjbRc();
        $this$withTransform_u24lambda_u246$iv.getCanvas().save();
        DrawTransform $this$scale_Fgt4K4Q_u24lambda_u242 = $this$withTransform_u24lambda_u246$iv.getTransform();     // Catch: Throwable -> L9
        $this$scale_Fgt4K4Q_u24lambda_u242.mo4845scale0AR0LA0(scaleX, scaleY, pivot);     // Catch: Throwable -> L9
        block.invoke($this$scale_u2dFgt4K4Q_u24default);     // Catch: Throwable -> L9
        $this$withTransform_u24lambda_u246$iv.getCanvas().restore();
        $this$withTransform_u24lambda_u246$iv.mo4839setSizeuvyYCjk(previousSize$iv);
        return;
    L9:
        th = move-exception;
        $this$withTransform_u24lambda_u246$iv.getCanvas().restore();
        $this$withTransform_u24lambda_u246$iv.mo4839setSizeuvyYCjk(previousSize$iv);
        throw th;
    }

    /* JADX INFO: renamed from: scale-Fgt4K4Q, reason: not valid java name */
    public static final void m4968scaleFgt4K4Q(DrawScope $this$scale_u2dFgt4K4Q, float scaleX, float scaleY, long pivot, Function1<? super DrawScope, Unit> r14) {
        DrawContext $this$withTransform_u24lambda_u246$iv = $this$scale_u2dFgt4K4Q.getDrawContext();
        long previousSize$iv = $this$withTransform_u24lambda_u246$iv.mo4838getSizeNHjbRc();
        $this$withTransform_u24lambda_u246$iv.getCanvas().save();
        DrawTransform $this$scale_Fgt4K4Q_u24lambda_u242 = $this$withTransform_u24lambda_u246$iv.getTransform();     // Catch: Throwable -> L6
        $this$scale_Fgt4K4Q_u24lambda_u242.mo4845scale0AR0LA0(scaleX, scaleY, pivot);     // Catch: Throwable -> L6
        r14.invoke($this$scale_u2dFgt4K4Q);     // Catch: Throwable -> L6
        $this$withTransform_u24lambda_u246$iv.getCanvas().restore();
        $this$withTransform_u24lambda_u246$iv.mo4839setSizeuvyYCjk(previousSize$iv);
        return;
    L6:
        th = move-exception;
        $this$withTransform_u24lambda_u246$iv.getCanvas().restore();
        $this$withTransform_u24lambda_u246$iv.mo4839setSizeuvyYCjk(previousSize$iv);
        throw th;
    }

    /* JADX INFO: renamed from: scale-Rg1IO4c$default, reason: not valid java name */
    public static /* synthetic */ void m4971scaleRg1IO4c$default(DrawScope $this$scale_u2dRg1IO4c_u24default, float scale, long pivot, Function1 block, int r12, Object r13) {
        if ((r12 & 2) == 0) goto L5;
        pivot = $this$scale_u2dRg1IO4c_u24default.mo4916getCenterF1C5BW0();
    L5:
        DrawContext $this$withTransform_u24lambda_u246$iv = $this$scale_u2dRg1IO4c_u24default.getDrawContext();
        long previousSize$iv = $this$withTransform_u24lambda_u246$iv.mo4838getSizeNHjbRc();
        $this$withTransform_u24lambda_u246$iv.getCanvas().save();
        DrawTransform $this$scale_Rg1IO4c_u24lambda_u243 = $this$withTransform_u24lambda_u246$iv.getTransform();     // Catch: Throwable -> L9
        $this$scale_Rg1IO4c_u24lambda_u243.mo4845scale0AR0LA0(scale, scale, pivot);     // Catch: Throwable -> L9
        block.invoke($this$scale_u2dRg1IO4c_u24default);     // Catch: Throwable -> L9
        $this$withTransform_u24lambda_u246$iv.getCanvas().restore();
        $this$withTransform_u24lambda_u246$iv.mo4839setSizeuvyYCjk(previousSize$iv);
        return;
    L9:
        th = move-exception;
        $this$withTransform_u24lambda_u246$iv.getCanvas().restore();
        $this$withTransform_u24lambda_u246$iv.mo4839setSizeuvyYCjk(previousSize$iv);
        throw th;
    }

    /* JADX INFO: renamed from: scale-Rg1IO4c, reason: not valid java name */
    public static final void m4970scaleRg1IO4c(DrawScope $this$scale_u2dRg1IO4c, float scale, long pivot, Function1<? super DrawScope, Unit> r13) {
        DrawContext $this$withTransform_u24lambda_u246$iv = $this$scale_u2dRg1IO4c.getDrawContext();
        long previousSize$iv = $this$withTransform_u24lambda_u246$iv.mo4838getSizeNHjbRc();
        $this$withTransform_u24lambda_u246$iv.getCanvas().save();
        DrawTransform $this$scale_Rg1IO4c_u24lambda_u243 = $this$withTransform_u24lambda_u246$iv.getTransform();     // Catch: Throwable -> L6
        $this$scale_Rg1IO4c_u24lambda_u243.mo4845scale0AR0LA0(scale, scale, pivot);     // Catch: Throwable -> L6
        r13.invoke($this$scale_u2dRg1IO4c);     // Catch: Throwable -> L6
        $this$withTransform_u24lambda_u246$iv.getCanvas().restore();
        $this$withTransform_u24lambda_u246$iv.mo4839setSizeuvyYCjk(previousSize$iv);
        return;
    L6:
        th = move-exception;
        $this$withTransform_u24lambda_u246$iv.getCanvas().restore();
        $this$withTransform_u24lambda_u246$iv.mo4839setSizeuvyYCjk(previousSize$iv);
        throw th;
    }

    /* JADX INFO: renamed from: clipRect-rOu3jXo$default, reason: not valid java name */
    public static /* synthetic */ void m4960clipRectrOu3jXo$default(DrawScope $this$clipRect_u2drOu3jXo_u24default, float left, float top, float right, float bottom, int clipOp, Function1 block, int r22, Object r23) {
        if ((r22 & 1) == 0) goto L5;
        float left2 = 0.0f;
    L7:
        if ((r22 & 2) == 0) goto L9;
        float top2 = 0.0f;
    L11:
        if ((r22 & 4) == 0) goto L13;
        long arg0$iv = $this$clipRect_u2drOu3jXo_u24default.mo4917getSizeNHjbRc();
        int bits$iv$iv$iv = (int) (arg0$iv >> 32);
        float right2 = Float.intBitsToFloat(bits$iv$iv$iv);
    L15:
        if ((r22 & 8) == 0) goto L17;
        long arg0$iv2 = $this$clipRect_u2drOu3jXo_u24default.mo4917getSizeNHjbRc();
        int bits$iv$iv$iv2 = (int) (4294967295L & arg0$iv2);
        float bottom2 = Float.intBitsToFloat(bits$iv$iv$iv2);
    L19:
        if ((r22 & 16) == 0) goto L21;
        int clipOp2 = ClipOp.Companion.m4355getIntersectrtfAjoo();
    L22:
        DrawContext $this$withTransform_u24lambda_u246$iv = $this$clipRect_u2drOu3jXo_u24default.getDrawContext();
        long previousSize$iv = $this$withTransform_u24lambda_u246$iv.mo4838getSizeNHjbRc();
        $this$withTransform_u24lambda_u246$iv.getCanvas().save();
        DrawTransform $this$clipRect_rOu3jXo_u24lambda_u244 = $this$withTransform_u24lambda_u246$iv.getTransform();     // Catch: Throwable -> L30
        $this$clipRect_rOu3jXo_u24lambda_u244.mo4841clipRectN_I0leg(left2, top2, right2, bottom2, clipOp2);     // Catch: Throwable -> L30
        block.invoke($this$clipRect_u2drOu3jXo_u24default);     // Catch: Throwable -> L28
        $this$withTransform_u24lambda_u246$iv.getCanvas().restore();
        $this$withTransform_u24lambda_u246$iv.mo4839setSizeuvyYCjk(previousSize$iv);
        return;
    L28:
        th = th;
    L32:
        $this$withTransform_u24lambda_u246$iv.getCanvas().restore();
        $this$withTransform_u24lambda_u246$iv.mo4839setSizeuvyYCjk(previousSize$iv);
        throw th;
    L30:
        th = th;
        goto L32
    L21:
        clipOp2 = clipOp;
        goto L22
    L17:
        bottom2 = bottom;
        goto L19
    L13:
        right2 = right;
        goto L15
    L9:
        top2 = top;
        goto L11
    L5:
        left2 = left;
        goto L7
    }

    /* JADX INFO: renamed from: clipRect-rOu3jXo, reason: not valid java name */
    public static final void m4959clipRectrOu3jXo(DrawScope $this$clipRect_u2drOu3jXo, float left, float top, float right, float bottom, int clipOp, Function1<? super DrawScope, Unit> r20) {
        DrawContext $this$withTransform_u24lambda_u246$iv = $this$clipRect_u2drOu3jXo.getDrawContext();
        long previousSize$iv = $this$withTransform_u24lambda_u246$iv.mo4838getSizeNHjbRc();
        $this$withTransform_u24lambda_u246$iv.getCanvas().save();
        DrawTransform $this$clipRect_rOu3jXo_u24lambda_u244 = $this$withTransform_u24lambda_u246$iv.getTransform();     // Catch: Throwable -> L10
        $this$clipRect_rOu3jXo_u24lambda_u244.mo4841clipRectN_I0leg(left, top, right, bottom, clipOp);     // Catch: Throwable -> L10
        r20.invoke($this$clipRect_u2drOu3jXo);     // Catch: Throwable -> L8
        $this$withTransform_u24lambda_u246$iv.getCanvas().restore();
        $this$withTransform_u24lambda_u246$iv.mo4839setSizeuvyYCjk(previousSize$iv);
        return;
    L8:
        th = th;
    L12:
        $this$withTransform_u24lambda_u246$iv.getCanvas().restore();
        $this$withTransform_u24lambda_u246$iv.mo4839setSizeuvyYCjk(previousSize$iv);
        throw th;
    L10:
        th = th;
        goto L12
    }

    /* JADX INFO: renamed from: clipPath-KD09W0M$default, reason: not valid java name */
    public static /* synthetic */ void m4958clipPathKD09W0M$default(DrawScope $this$clipPath_u2dKD09W0M_u24default, Path path, int clipOp, Function1 block, int r11, Object r12) {
        if ((r11 & 2) == 0) goto L5;
        clipOp = ClipOp.Companion.m4355getIntersectrtfAjoo();
    L5:
        DrawContext $this$withTransform_u24lambda_u246$iv = $this$clipPath_u2dKD09W0M_u24default.getDrawContext();
        long previousSize$iv = $this$withTransform_u24lambda_u246$iv.mo4838getSizeNHjbRc();
        $this$withTransform_u24lambda_u246$iv.getCanvas().save();
        DrawTransform $this$clipPath_KD09W0M_u24lambda_u245 = $this$withTransform_u24lambda_u246$iv.getTransform();     // Catch: Throwable -> L9
        $this$clipPath_KD09W0M_u24lambda_u245.mo4840clipPathmtrdDE(path, clipOp);     // Catch: Throwable -> L9
        block.invoke($this$clipPath_u2dKD09W0M_u24default);     // Catch: Throwable -> L9
        $this$withTransform_u24lambda_u246$iv.getCanvas().restore();
        $this$withTransform_u24lambda_u246$iv.mo4839setSizeuvyYCjk(previousSize$iv);
        return;
    L9:
        th = move-exception;
        $this$withTransform_u24lambda_u246$iv.getCanvas().restore();
        $this$withTransform_u24lambda_u246$iv.mo4839setSizeuvyYCjk(previousSize$iv);
        throw th;
    }

    /* JADX INFO: renamed from: clipPath-KD09W0M, reason: not valid java name */
    public static final void m4957clipPathKD09W0M(DrawScope $this$clipPath_u2dKD09W0M, Path path, int clipOp, Function1<? super DrawScope, Unit> r12) {
        DrawContext $this$withTransform_u24lambda_u246$iv = $this$clipPath_u2dKD09W0M.getDrawContext();
        long previousSize$iv = $this$withTransform_u24lambda_u246$iv.mo4838getSizeNHjbRc();
        $this$withTransform_u24lambda_u246$iv.getCanvas().save();
        DrawTransform $this$clipPath_KD09W0M_u24lambda_u245 = $this$withTransform_u24lambda_u246$iv.getTransform();     // Catch: Throwable -> L6
        $this$clipPath_KD09W0M_u24lambda_u245.mo4840clipPathmtrdDE(path, clipOp);     // Catch: Throwable -> L6
        r12.invoke($this$clipPath_u2dKD09W0M);     // Catch: Throwable -> L6
        $this$withTransform_u24lambda_u246$iv.getCanvas().restore();
        $this$withTransform_u24lambda_u246$iv.mo4839setSizeuvyYCjk(previousSize$iv);
        return;
    L6:
        th = move-exception;
        $this$withTransform_u24lambda_u246$iv.getCanvas().restore();
        $this$withTransform_u24lambda_u246$iv.mo4839setSizeuvyYCjk(previousSize$iv);
        throw th;
    }

    public static final void drawIntoCanvas(DrawScope $this$drawIntoCanvas, Function1<? super Canvas, Unit> r3) {
        r3.invoke($this$drawIntoCanvas.getDrawContext().getCanvas());
    }

    public static final void withTransform(DrawScope $this$withTransform, Function1<? super DrawTransform, Unit> r8, Function1<? super DrawScope, Unit> r9) {
        DrawContext $this$withTransform_u24lambda_u246 = $this$withTransform.getDrawContext();
        long previousSize = $this$withTransform_u24lambda_u246.mo4838getSizeNHjbRc();
        $this$withTransform_u24lambda_u246.getCanvas().save();
        r8.invoke($this$withTransform_u24lambda_u246.getTransform());     // Catch: Throwable -> L6
        r9.invoke($this$withTransform);     // Catch: Throwable -> L6
        $this$withTransform_u24lambda_u246.getCanvas().restore();
        $this$withTransform_u24lambda_u246.mo4839setSizeuvyYCjk(previousSize);
        return;
    L6:
        th = move-exception;
        $this$withTransform_u24lambda_u246.getCanvas().restore();
        $this$withTransform_u24lambda_u246.mo4839setSizeuvyYCjk(previousSize);
        throw th;
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Please use a new overload accepting nullable GraphicsLayer")
    /* JADX INFO: renamed from: draw-GRGpd60, reason: not valid java name */
    public static final /* synthetic */ void m4961drawGRGpd60(DrawScope $this$draw_u2dGRGpd60, Density density, LayoutDirection layoutDirection, Canvas canvas, long size, Function1<? super DrawScope, Unit> r24) {
        Density prevDensity$iv = $this$draw_u2dGRGpd60.getDrawContext().getDensity();
        LayoutDirection prevLayoutDirection$iv = $this$draw_u2dGRGpd60.getDrawContext().getLayoutDirection();
        Canvas prevCanvas$iv = $this$draw_u2dGRGpd60.getDrawContext().getCanvas();
        long prevSize$iv = $this$draw_u2dGRGpd60.getDrawContext().mo4838getSizeNHjbRc();
        GraphicsLayer prevLayer$iv = $this$draw_u2dGRGpd60.getDrawContext().getGraphicsLayer();
        DrawContext $this$draw_ymL40Pk_u24lambda_u247$iv = $this$draw_u2dGRGpd60.getDrawContext();
        $this$draw_ymL40Pk_u24lambda_u247$iv.setDensity(density);
        $this$draw_ymL40Pk_u24lambda_u247$iv.setLayoutDirection(layoutDirection);
        $this$draw_ymL40Pk_u24lambda_u247$iv.setCanvas(canvas);
        $this$draw_ymL40Pk_u24lambda_u247$iv.mo4839setSizeuvyYCjk(size);
        $this$draw_ymL40Pk_u24lambda_u247$iv.setGraphicsLayer(null);
        canvas.save();
        r24.invoke($this$draw_u2dGRGpd60);     // Catch: Throwable -> L6
        canvas.restore();
        DrawContext $this$draw_ymL40Pk_u24lambda_u248$iv = $this$draw_u2dGRGpd60.getDrawContext();
        $this$draw_ymL40Pk_u24lambda_u248$iv.setDensity(prevDensity$iv);
        $this$draw_ymL40Pk_u24lambda_u248$iv.setLayoutDirection(prevLayoutDirection$iv);
        $this$draw_ymL40Pk_u24lambda_u248$iv.setCanvas(prevCanvas$iv);
        $this$draw_ymL40Pk_u24lambda_u248$iv.mo4839setSizeuvyYCjk(prevSize$iv);
        $this$draw_ymL40Pk_u24lambda_u248$iv.setGraphicsLayer(prevLayer$iv);
        return;
    L6:
        th = move-exception;
        canvas.restore();
        DrawContext $this$draw_ymL40Pk_u24lambda_u248$iv2 = $this$draw_u2dGRGpd60.getDrawContext();
        $this$draw_ymL40Pk_u24lambda_u248$iv2.setDensity(prevDensity$iv);
        $this$draw_ymL40Pk_u24lambda_u248$iv2.setLayoutDirection(prevLayoutDirection$iv);
        $this$draw_ymL40Pk_u24lambda_u248$iv2.setCanvas(prevCanvas$iv);
        $this$draw_ymL40Pk_u24lambda_u248$iv2.mo4839setSizeuvyYCjk(prevSize$iv);
        $this$draw_ymL40Pk_u24lambda_u248$iv2.setGraphicsLayer(prevLayer$iv);
        throw th;
    }

    /* JADX INFO: renamed from: draw-ymL40Pk$default, reason: not valid java name */
    public static /* synthetic */ void m4963drawymL40Pk$default(DrawScope $this$draw_u2dymL40Pk_u24default, Density density, LayoutDirection layoutDirection, Canvas canvas, long size, GraphicsLayer graphicsLayer, Function1 block, int r25, Object r26) {
        if ((r25 & 16) == 0) goto L5;
        GraphicsLayer graphicsLayer2 = null;
    L6:
        Density prevDensity = $this$draw_u2dymL40Pk_u24default.getDrawContext().getDensity();
        LayoutDirection prevLayoutDirection = $this$draw_u2dymL40Pk_u24default.getDrawContext().getLayoutDirection();
        Canvas prevCanvas = $this$draw_u2dymL40Pk_u24default.getDrawContext().getCanvas();
        long prevSize = $this$draw_u2dymL40Pk_u24default.getDrawContext().mo4838getSizeNHjbRc();
        GraphicsLayer prevLayer = $this$draw_u2dymL40Pk_u24default.getDrawContext().getGraphicsLayer();
        DrawContext $this$draw_ymL40Pk_u24lambda_u247 = $this$draw_u2dymL40Pk_u24default.getDrawContext();
        $this$draw_ymL40Pk_u24lambda_u247.setDensity(density);
        $this$draw_ymL40Pk_u24lambda_u247.setLayoutDirection(layoutDirection);
        $this$draw_ymL40Pk_u24lambda_u247.setCanvas(canvas);
        $this$draw_ymL40Pk_u24lambda_u247.mo4839setSizeuvyYCjk(size);
        $this$draw_ymL40Pk_u24lambda_u247.setGraphicsLayer(graphicsLayer2);
        canvas.save();
        block.invoke($this$draw_u2dymL40Pk_u24default);     // Catch: Throwable -> L10
        canvas.restore();
        DrawContext $this$draw_ymL40Pk_u24lambda_u248 = $this$draw_u2dymL40Pk_u24default.getDrawContext();
        $this$draw_ymL40Pk_u24lambda_u248.setDensity(prevDensity);
        $this$draw_ymL40Pk_u24lambda_u248.setLayoutDirection(prevLayoutDirection);
        $this$draw_ymL40Pk_u24lambda_u248.setCanvas(prevCanvas);
        $this$draw_ymL40Pk_u24lambda_u248.mo4839setSizeuvyYCjk(prevSize);
        $this$draw_ymL40Pk_u24lambda_u248.setGraphicsLayer(prevLayer);
        return;
    L10:
        th = move-exception;
        canvas.restore();
        DrawContext $this$draw_ymL40Pk_u24lambda_u249 = $this$draw_u2dymL40Pk_u24default.getDrawContext();
        $this$draw_ymL40Pk_u24lambda_u249.setDensity(prevDensity);
        $this$draw_ymL40Pk_u24lambda_u249.setLayoutDirection(prevLayoutDirection);
        $this$draw_ymL40Pk_u24lambda_u249.setCanvas(prevCanvas);
        $this$draw_ymL40Pk_u24lambda_u249.mo4839setSizeuvyYCjk(prevSize);
        $this$draw_ymL40Pk_u24lambda_u249.setGraphicsLayer(prevLayer);
        throw th;
    L5:
        graphicsLayer2 = graphicsLayer;
        goto L6
    }

    /* JADX INFO: renamed from: draw-ymL40Pk, reason: not valid java name */
    public static final void m4962drawymL40Pk(DrawScope $this$draw_u2dymL40Pk, Density density, LayoutDirection layoutDirection, Canvas canvas, long size, GraphicsLayer graphicsLayer, Function1<? super DrawScope, Unit> r25) {
        Density prevDensity = $this$draw_u2dymL40Pk.getDrawContext().getDensity();
        LayoutDirection prevLayoutDirection = $this$draw_u2dymL40Pk.getDrawContext().getLayoutDirection();
        Canvas prevCanvas = $this$draw_u2dymL40Pk.getDrawContext().getCanvas();
        long prevSize = $this$draw_u2dymL40Pk.getDrawContext().mo4838getSizeNHjbRc();
        GraphicsLayer prevLayer = $this$draw_u2dymL40Pk.getDrawContext().getGraphicsLayer();
        DrawContext $this$draw_ymL40Pk_u24lambda_u247 = $this$draw_u2dymL40Pk.getDrawContext();
        $this$draw_ymL40Pk_u24lambda_u247.setDensity(density);
        $this$draw_ymL40Pk_u24lambda_u247.setLayoutDirection(layoutDirection);
        $this$draw_ymL40Pk_u24lambda_u247.setCanvas(canvas);
        $this$draw_ymL40Pk_u24lambda_u247.mo4839setSizeuvyYCjk(size);
        $this$draw_ymL40Pk_u24lambda_u247.setGraphicsLayer(graphicsLayer);
        canvas.save();
        r25.invoke($this$draw_u2dymL40Pk);     // Catch: Throwable -> L6
        canvas.restore();
        DrawContext $this$draw_ymL40Pk_u24lambda_u248 = $this$draw_u2dymL40Pk.getDrawContext();
        $this$draw_ymL40Pk_u24lambda_u248.setDensity(prevDensity);
        $this$draw_ymL40Pk_u24lambda_u248.setLayoutDirection(prevLayoutDirection);
        $this$draw_ymL40Pk_u24lambda_u248.setCanvas(prevCanvas);
        $this$draw_ymL40Pk_u24lambda_u248.mo4839setSizeuvyYCjk(prevSize);
        $this$draw_ymL40Pk_u24lambda_u248.setGraphicsLayer(prevLayer);
        return;
    L6:
        th = move-exception;
        canvas.restore();
        DrawContext $this$draw_ymL40Pk_u24lambda_u249 = $this$draw_u2dymL40Pk.getDrawContext();
        $this$draw_ymL40Pk_u24lambda_u249.setDensity(prevDensity);
        $this$draw_ymL40Pk_u24lambda_u249.setLayoutDirection(prevLayoutDirection);
        $this$draw_ymL40Pk_u24lambda_u249.setCanvas(prevCanvas);
        $this$draw_ymL40Pk_u24lambda_u249.mo4839setSizeuvyYCjk(prevSize);
        $this$draw_ymL40Pk_u24lambda_u249.setGraphicsLayer(prevLayer);
        throw th;
    }
}
