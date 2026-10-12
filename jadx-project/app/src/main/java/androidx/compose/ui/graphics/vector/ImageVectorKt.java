package androidx.compose.ui.graphics.vector;

import androidx.autofill.HintConstants;
import androidx.compose.ui.graphics.Brush;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: ImageVector.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000h\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\u001a\u0086\u0001\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\u00052\b\b\u0002\u0010\n\u001a\u00020\u00052\b\b\u0002\u0010\u000b\u001a\u00020\u00052\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\u0017\u0010\u000f\u001a\u0013\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00110\u0010¢\u0006\u0002\b\u0012H\u0086\b\u001a\u0098\u0001\u0010\u0013\u001a\u00020\u0001*\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00152\b\b\u0002\u0010\u0016\u001a\u00020\u00052\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00152\b\b\u0002\u0010\u0018\u001a\u00020\u00052\b\b\u0002\u0010\u0019\u001a\u00020\u00052\b\b\u0002\u0010\u001a\u001a\u00020\u001b2\b\b\u0002\u0010\u001c\u001a\u00020\u001d2\b\b\u0002\u0010\u001e\u001a\u00020\u00052\b\b\u0002\u0010\u001f\u001a\u00020 2\u0017\u0010!\u001a\u0013\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020\u00110\u0010¢\u0006\u0002\b\u0012H\u0086\bø\u0001\u0000¢\u0006\u0004\b#\u0010$\u001a'\u0010%\u001a\u0002H&\"\u0004\b\u0000\u0010&*\u0012\u0012\u0004\u0012\u0002H&0'j\b\u0012\u0004\u0012\u0002H&`(H\u0002¢\u0006\u0002\u0010)\u001a'\u0010*\u001a\u0002H&\"\u0004\b\u0000\u0010&*\u0012\u0012\u0004\u0012\u0002H&0'j\b\u0012\u0004\u0012\u0002H&`(H\u0002¢\u0006\u0002\u0010)\u001a/\u0010+\u001a\u00020,\"\u0004\b\u0000\u0010&*\u0012\u0012\u0004\u0012\u0002H&0'j\b\u0012\u0004\u0012\u0002H&`(2\u0006\u0010-\u001a\u0002H&H\u0002¢\u0006\u0002\u0010.\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006/"}, d2 = {"group", "Landroidx/compose/ui/graphics/vector/ImageVector$Builder;", HintConstants.AUTOFILL_HINT_NAME, "", "rotate", "", "pivotX", "pivotY", "scaleX", "scaleY", "translationX", "translationY", "clipPathData", "", "Landroidx/compose/ui/graphics/vector/PathNode;", "block", "Lkotlin/Function1;", "", "Lkotlin/ExtensionFunctionType;", "path", "fill", "Landroidx/compose/ui/graphics/Brush;", "fillAlpha", "stroke", "strokeAlpha", "strokeLineWidth", "strokeLineCap", "Landroidx/compose/ui/graphics/StrokeCap;", "strokeLineJoin", "Landroidx/compose/ui/graphics/StrokeJoin;", "strokeLineMiter", "pathFillType", "Landroidx/compose/ui/graphics/PathFillType;", "pathBuilder", "Landroidx/compose/ui/graphics/vector/PathBuilder;", "path-R_LF-3I", "(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFILkotlin/jvm/functions/Function1;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;", "peek", "T", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "(Ljava/util/ArrayList;)Ljava/lang/Object;", "pop", "push", "", "value", "(Ljava/util/ArrayList;Ljava/lang/Object;)Z", "ui_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class ImageVectorKt {
    public static final /* synthetic */ Object access$peek(ArrayList $receiver) {
        return peek($receiver);
    }

    public static final /* synthetic */ Object access$pop(ArrayList $receiver) {
        return pop($receiver);
    }

    public static final /* synthetic */ boolean access$push(ArrayList $receiver, Object value) {
        return push($receiver, value);
    }

    /* JADX INFO: renamed from: path-R_LF-3I$default, reason: not valid java name */
    public static /* synthetic */ ImageVector.Builder m5054pathR_LF3I$default(ImageVector.Builder $this$path_u2dR_LF_u2d3I_u24default, String name, Brush fill, float fillAlpha, Brush stroke, float strokeAlpha, float strokeLineWidth, int strokeLineCap, int strokeLineJoin, float strokeLineMiter, int pathFillType, Function1 pathBuilder, int r31, Object r32) {
        if ((r31 & 1) == 0) goto L5;
        String name2 = "";
    L7:
        if ((r31 & 2) == 0) goto L9;
        Brush fill2 = null;
    L11:
        if ((r31 & 4) == 0) goto L13;
        float fillAlpha2 = 1.0f;
    L15:
        if ((r31 & 8) == 0) goto L17;
        Brush stroke2 = null;
    L19:
        if ((r31 & 16) == 0) goto L21;
        float strokeAlpha2 = 1.0f;
    L23:
        if ((r31 & 32) == 0) goto L25;
        float strokeLineWidth2 = 0.0f;
    L27:
        if ((r31 & 64) == 0) goto L29;
        int strokeLineCap2 = VectorKt.getDefaultStrokeLineCap();
    L31:
        if ((r31 & 128) == 0) goto L33;
        int strokeLineJoin2 = VectorKt.getDefaultStrokeLineJoin();
    L35:
        if ((r31 & 256) == 0) goto L37;
        float strokeLineMiter2 = 4.0f;
    L39:
        if ((r31 & 512) == 0) goto L41;
        int pathFillType2 = VectorKt.getDefaultFillType();
    L42:
        PathBuilder $this$PathData_u24lambda_u240$iv = new PathBuilder();
        pathBuilder.invoke($this$PathData_u24lambda_u240$iv);
        return ImageVector.Builder.m5051addPathoIyEayM$default($this$path_u2dR_LF_u2d3I_u24default, $this$PathData_u24lambda_u240$iv.getNodes(), pathFillType2, name2, fill2, fillAlpha2, stroke2, strokeAlpha2, strokeLineWidth2, strokeLineCap2, strokeLineJoin2, strokeLineMiter2, 0.0f, 0.0f, 0.0f, 14336, null);
    L41:
        pathFillType2 = pathFillType;
        goto L42
    L37:
        strokeLineMiter2 = strokeLineMiter;
        goto L39
    L33:
        strokeLineJoin2 = strokeLineJoin;
        goto L35
    L29:
        strokeLineCap2 = strokeLineCap;
        goto L31
    L25:
        strokeLineWidth2 = strokeLineWidth;
        goto L27
    L21:
        strokeAlpha2 = strokeAlpha;
        goto L23
    L17:
        stroke2 = stroke;
        goto L19
    L13:
        fillAlpha2 = fillAlpha;
        goto L15
    L9:
        fill2 = fill;
        goto L11
    L5:
        name2 = name;
        goto L7
    }

    /* JADX INFO: renamed from: path-R_LF-3I, reason: not valid java name */
    public static final ImageVector.Builder m5053pathR_LF3I(ImageVector.Builder $this$path_u2dR_LF_u2d3I, String name, Brush fill, float fillAlpha, Brush stroke, float strokeAlpha, float strokeLineWidth, int strokeLineCap, int strokeLineJoin, float strokeLineMiter, int pathFillType, Function1<? super PathBuilder, Unit> r33) {
        PathBuilder $this$PathData_u24lambda_u240$iv = new PathBuilder();
        r33.invoke($this$PathData_u24lambda_u240$iv);
        return ImageVector.Builder.m5051addPathoIyEayM$default($this$path_u2dR_LF_u2d3I, $this$PathData_u24lambda_u240$iv.getNodes(), pathFillType, name, fill, fillAlpha, stroke, strokeAlpha, strokeLineWidth, strokeLineCap, strokeLineJoin, strokeLineMiter, 0.0f, 0.0f, 0.0f, 14336, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ImageVector.Builder group$default(ImageVector.Builder r11, String name, float rotate, float pivotX, float pivotY, float scaleX, float scaleY, float translationX, float translationY, List clipPathData, Function1 block, int r22, Object r23) {
        if ((r22 & 1) == 0) goto L5;
        String name2 = "";
    L7:
        if ((r22 & 2) == 0) goto L9;
        float rotate2 = 0.0f;
    L11:
        if ((r22 & 4) == 0) goto L13;
        float pivotX2 = 0.0f;
    L15:
        if ((r22 & 8) == 0) goto L17;
        float pivotY2 = 0.0f;
    L19:
        if ((r22 & 16) == 0) goto L21;
        float scaleX2 = 1.0f;
    L23:
        if ((r22 & 32) == 0) goto L25;
        float scaleY2 = 1.0f;
    L27:
        if ((r22 & 64) == 0) goto L29;
        float translationX2 = 0.0f;
    L31:
        if ((r22 & 128) == 0) goto L33;
        float translationY2 = 0.0f;
    L35:
        if ((r22 & 256) == 0) goto L37;
        List clipPathData2 = VectorKt.getEmptyPath();
    L38:
        r11.addGroup(name2, rotate2, pivotX2, pivotY2, scaleX2, scaleY2, translationX2, translationY2, clipPathData2);
        block.invoke(r11);
        r11.clearGroup();
        return r11;
    L37:
        clipPathData2 = clipPathData;
        goto L38
    L33:
        translationY2 = translationY;
        goto L35
    L29:
        translationX2 = translationX;
        goto L31
    L25:
        scaleY2 = scaleY;
        goto L27
    L21:
        scaleX2 = scaleX;
        goto L23
    L17:
        pivotY2 = pivotY;
        goto L19
    L13:
        pivotX2 = pivotX;
        goto L15
    L9:
        rotate2 = rotate;
        goto L11
    L5:
        name2 = name;
        goto L7
    }

    public static final ImageVector.Builder group(ImageVector.Builder $this$group, String name, float rotate, float pivotX, float pivotY, float scaleX, float scaleY, float translationX, float translationY, List<? extends PathNode> r21, Function1<? super ImageVector.Builder, Unit> r22) {
        $this$group.addGroup(name, rotate, pivotX, pivotY, scaleX, scaleY, translationX, translationY, r21);
        r22.invoke($this$group);
        $this$group.clearGroup();
        return $this$group;
    }

    private static final <T> boolean push(ArrayList<T> r1, T r2) {
        return r1.add(r2);
    }

    private static final <T> T pop(ArrayList<T> r1) {
        return r1.remove(r1.size() - 1);
    }

    private static final <T> T peek(ArrayList<T> r1) {
        return r1.get(r1.size() - 1);
    }
}
