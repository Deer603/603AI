package androidx.compose.ui.graphics.drawscope;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.AndroidPaint_androidKt;
import androidx.compose.ui.graphics.BlendMode;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.FilterQuality;
import androidx.compose.ui.graphics.ImageBitmap;
import androidx.compose.ui.graphics.Paint;
import androidx.compose.ui.graphics.PaintingStyle;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.PathEffect;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import java.util.List;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ReplaceWith;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: CanvasDrawScope.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000Ö\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\r\u0018\u00002\u00020\u0001:\u0002\u0092\u0001B\u0005¢\u0006\u0002\u0010\u0002JJ\u0010\u0019\u001a\u00020\u00112\b\u0010\u001a\u001a\u0004\u0018\u00010\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\b\b\u0001\u0010\u001e\u001a\u00020\u00042\b\u0010\u001f\u001a\u0004\u0018\u00010 2\u0006\u0010!\u001a\u00020\"2\b\b\u0002\u0010#\u001a\u00020$H\u0002ø\u0001\u0000¢\u0006\u0004\b%\u0010&JH\u0010\u0019\u001a\u00020\u00112\u0006\u0010'\u001a\u00020(2\u0006\u0010\u001c\u001a\u00020\u001d2\b\b\u0001\u0010\u001e\u001a\u00020\u00042\b\u0010\u001f\u001a\u0004\u0018\u00010 2\u0006\u0010!\u001a\u00020\"2\b\b\u0002\u0010#\u001a\u00020$H\u0002ø\u0001\u0000¢\u0006\u0004\b)\u0010*Jl\u0010+\u001a\u00020\u00112\b\u0010\u001a\u001a\u0004\u0018\u00010\u001b2\u0006\u0010,\u001a\u00020\u00042\u0006\u0010-\u001a\u00020\u00042\u0006\u0010.\u001a\u00020/2\u0006\u00100\u001a\u0002012\b\u00102\u001a\u0004\u0018\u0001032\b\b\u0001\u0010\u001e\u001a\u00020\u00042\b\u0010\u001f\u001a\u0004\u0018\u00010 2\u0006\u0010!\u001a\u00020\"2\b\b\u0002\u0010#\u001a\u00020$H\u0002ø\u0001\u0000¢\u0006\u0004\b4\u00105Jj\u0010+\u001a\u00020\u00112\u0006\u0010'\u001a\u00020(2\u0006\u0010,\u001a\u00020\u00042\u0006\u0010-\u001a\u00020\u00042\u0006\u0010.\u001a\u00020/2\u0006\u00100\u001a\u0002012\b\u00102\u001a\u0004\u0018\u0001032\b\b\u0001\u0010\u001e\u001a\u00020\u00042\b\u0010\u001f\u001a\u0004\u0018\u00010 2\u0006\u0010!\u001a\u00020\"2\b\b\u0002\u0010#\u001a\u00020$H\u0002ø\u0001\u0000¢\u0006\u0004\b6\u00107JL\u00108\u001a\u0002092\u0006\u0010\u0003\u001a\u00020:2\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010;\u001a\u00020<2\u0006\u0010=\u001a\u00020>2\u0017\u0010?\u001a\u0013\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u0002090@¢\u0006\u0002\bAH\u0086\bø\u0001\u0000¢\u0006\u0004\bB\u0010CJf\u0010D\u001a\u0002092\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010E\u001a\u00020\u00042\u0006\u0010F\u001a\u00020\u00042\u0006\u0010G\u001a\u00020H2\u0006\u0010I\u001a\u00020J2\u0006\u0010=\u001a\u00020>2\b\b\u0001\u0010\u001e\u001a\u00020\u00042\u0006\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001f\u001a\u0004\u0018\u00010 2\u0006\u0010!\u001a\u00020\"H\u0016ø\u0001\u0000¢\u0006\u0004\bK\u0010LJf\u0010D\u001a\u0002092\u0006\u0010'\u001a\u00020(2\u0006\u0010E\u001a\u00020\u00042\u0006\u0010F\u001a\u00020\u00042\u0006\u0010G\u001a\u00020H2\u0006\u0010I\u001a\u00020J2\u0006\u0010=\u001a\u00020>2\b\b\u0001\u0010\u001e\u001a\u00020\u00042\u0006\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001f\u001a\u0004\u0018\u00010 2\u0006\u0010!\u001a\u00020\"H\u0016ø\u0001\u0000¢\u0006\u0004\bM\u0010NJN\u0010O\u001a\u0002092\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010P\u001a\u00020\u00042\u0006\u0010Q\u001a\u00020J2\b\b\u0001\u0010\u001e\u001a\u00020\u00042\u0006\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001f\u001a\u0004\u0018\u00010 2\u0006\u0010!\u001a\u00020\"H\u0016ø\u0001\u0000¢\u0006\u0004\bR\u0010SJN\u0010O\u001a\u0002092\u0006\u0010'\u001a\u00020(2\u0006\u0010P\u001a\u00020\u00042\u0006\u0010Q\u001a\u00020J2\b\b\u0001\u0010\u001e\u001a\u00020\u00042\u0006\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001f\u001a\u0004\u0018\u00010 2\u0006\u0010!\u001a\u00020\"H\u0016ø\u0001\u0000¢\u0006\u0004\bT\u0010UJF\u0010V\u001a\u0002092\u0006\u0010W\u001a\u00020X2\u0006\u0010I\u001a\u00020J2\b\b\u0001\u0010\u001e\u001a\u00020\u00042\u0006\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001f\u001a\u0004\u0018\u00010 2\u0006\u0010!\u001a\u00020\"H\u0016ø\u0001\u0000¢\u0006\u0004\bY\u0010ZJ^\u0010V\u001a\u0002092\u0006\u0010W\u001a\u00020X2\u0006\u0010[\u001a\u00020\\2\u0006\u0010]\u001a\u00020^2\u0006\u0010_\u001a\u00020\\2\u0006\u0010`\u001a\u00020^2\b\b\u0001\u0010\u001e\u001a\u00020\u00042\u0006\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001f\u001a\u0004\u0018\u00010 2\u0006\u0010!\u001a\u00020\"H\u0017ø\u0001\u0000¢\u0006\u0004\ba\u0010bJf\u0010V\u001a\u0002092\u0006\u0010W\u001a\u00020X2\u0006\u0010[\u001a\u00020\\2\u0006\u0010]\u001a\u00020^2\u0006\u0010_\u001a\u00020\\2\u0006\u0010`\u001a\u00020^2\b\b\u0001\u0010\u001e\u001a\u00020\u00042\u0006\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001f\u001a\u0004\u0018\u00010 2\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020$H\u0016ø\u0001\u0000¢\u0006\u0004\bc\u0010dJ`\u0010e\u001a\u0002092\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010f\u001a\u00020J2\u0006\u0010g\u001a\u00020J2\u0006\u0010,\u001a\u00020\u00042\u0006\u0010.\u001a\u00020/2\b\u00102\u001a\u0004\u0018\u0001032\b\b\u0001\u0010\u001e\u001a\u00020\u00042\b\u0010\u001f\u001a\u0004\u0018\u00010 2\u0006\u0010!\u001a\u00020\"H\u0016ø\u0001\u0000¢\u0006\u0004\bh\u0010iJ`\u0010e\u001a\u0002092\u0006\u0010'\u001a\u00020(2\u0006\u0010f\u001a\u00020J2\u0006\u0010g\u001a\u00020J2\u0006\u0010,\u001a\u00020\u00042\u0006\u0010.\u001a\u00020/2\b\u00102\u001a\u0004\u0018\u0001032\b\b\u0001\u0010\u001e\u001a\u00020\u00042\b\u0010\u001f\u001a\u0004\u0018\u00010 2\u0006\u0010!\u001a\u00020\"H\u0016ø\u0001\u0000¢\u0006\u0004\bj\u0010kJN\u0010l\u001a\u0002092\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010I\u001a\u00020J2\u0006\u0010=\u001a\u00020>2\b\b\u0001\u0010\u001e\u001a\u00020\u00042\u0006\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001f\u001a\u0004\u0018\u00010 2\u0006\u0010!\u001a\u00020\"H\u0016ø\u0001\u0000¢\u0006\u0004\bm\u0010nJN\u0010l\u001a\u0002092\u0006\u0010'\u001a\u00020(2\u0006\u0010I\u001a\u00020J2\u0006\u0010=\u001a\u00020>2\b\b\u0001\u0010\u001e\u001a\u00020\u00042\u0006\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001f\u001a\u0004\u0018\u00010 2\u0006\u0010!\u001a\u00020\"H\u0016ø\u0001\u0000¢\u0006\u0004\bo\u0010pJF\u0010q\u001a\u0002092\u0006\u0010r\u001a\u00020s2\u0006\u0010\u001a\u001a\u00020\u001b2\b\b\u0001\u0010\u001e\u001a\u00020\u00042\u0006\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001f\u001a\u0004\u0018\u00010 2\u0006\u0010!\u001a\u00020\"H\u0016ø\u0001\u0000¢\u0006\u0004\bt\u0010uJF\u0010q\u001a\u0002092\u0006\u0010r\u001a\u00020s2\u0006\u0010'\u001a\u00020(2\b\b\u0001\u0010\u001e\u001a\u00020\u00042\u0006\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001f\u001a\u0004\u0018\u00010 2\u0006\u0010!\u001a\u00020\"H\u0016ø\u0001\u0000¢\u0006\u0004\bv\u0010wJf\u0010x\u001a\u0002092\f\u0010y\u001a\b\u0012\u0004\u0012\u00020J0z2\u0006\u0010{\u001a\u00020|2\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010,\u001a\u00020\u00042\u0006\u0010.\u001a\u00020/2\b\u00102\u001a\u0004\u0018\u0001032\b\b\u0001\u0010\u001e\u001a\u00020\u00042\b\u0010\u001f\u001a\u0004\u0018\u00010 2\u0006\u0010!\u001a\u00020\"H\u0016ø\u0001\u0000¢\u0006\u0004\b}\u0010~Jg\u0010x\u001a\u0002092\f\u0010y\u001a\b\u0012\u0004\u0012\u00020J0z2\u0006\u0010{\u001a\u00020|2\u0006\u0010'\u001a\u00020(2\u0006\u0010,\u001a\u00020\u00042\u0006\u0010.\u001a\u00020/2\b\u00102\u001a\u0004\u0018\u0001032\b\b\u0001\u0010\u001e\u001a\u00020\u00042\b\u0010\u001f\u001a\u0004\u0018\u00010 2\u0006\u0010!\u001a\u00020\"H\u0016ø\u0001\u0000¢\u0006\u0005\b\u007f\u0010\u0080\u0001JP\u0010\u0081\u0001\u001a\u0002092\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010I\u001a\u00020J2\u0006\u0010=\u001a\u00020>2\b\b\u0001\u0010\u001e\u001a\u00020\u00042\u0006\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001f\u001a\u0004\u0018\u00010 2\u0006\u0010!\u001a\u00020\"H\u0016ø\u0001\u0000¢\u0006\u0005\b\u0082\u0001\u0010nJP\u0010\u0081\u0001\u001a\u0002092\u0006\u0010'\u001a\u00020(2\u0006\u0010I\u001a\u00020J2\u0006\u0010=\u001a\u00020>2\b\b\u0001\u0010\u001e\u001a\u00020\u00042\u0006\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001f\u001a\u0004\u0018\u00010 2\u0006\u0010!\u001a\u00020\"H\u0016ø\u0001\u0000¢\u0006\u0005\b\u0083\u0001\u0010pJ[\u0010\u0084\u0001\u001a\u0002092\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010I\u001a\u00020J2\u0006\u0010=\u001a\u00020>2\b\u0010\u0085\u0001\u001a\u00030\u0086\u00012\b\b\u0001\u0010\u001e\u001a\u00020\u00042\u0006\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001f\u001a\u0004\u0018\u00010 2\u0006\u0010!\u001a\u00020\"H\u0016ø\u0001\u0000¢\u0006\u0006\b\u0087\u0001\u0010\u0088\u0001J[\u0010\u0084\u0001\u001a\u0002092\u0006\u0010'\u001a\u00020(2\u0006\u0010I\u001a\u00020J2\u0006\u0010=\u001a\u00020>2\b\u0010\u0085\u0001\u001a\u00030\u0086\u00012\u0006\u0010\u001c\u001a\u00020\u001d2\b\b\u0001\u0010\u001e\u001a\u00020\u00042\b\u0010\u001f\u001a\u0004\u0018\u00010 2\u0006\u0010!\u001a\u00020\"H\u0016ø\u0001\u0000¢\u0006\u0006\b\u0089\u0001\u0010\u008a\u0001J\t\u0010\u008b\u0001\u001a\u00020\u0011H\u0002J\t\u0010\u008c\u0001\u001a\u00020\u0011H\u0002J\u0012\u0010\u008d\u0001\u001a\u00020\u00112\u0007\u0010\u008e\u0001\u001a\u00020\u001dH\u0002J!\u0010\u008f\u0001\u001a\u00020(*\u00020(2\u0006\u0010\u001e\u001a\u00020\u0004H\u0002ø\u0001\u0000¢\u0006\u0006\b\u0090\u0001\u0010\u0091\u0001R\u0014\u0010\u0003\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u001c\u0010\u000b\u001a\u00020\f8\u0000X\u0081\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\r\u0010\u0002\u001a\u0004\b\u000e\u0010\u000fR\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0012\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0006R\u0014\u0010\u0014\u001a\u00020\u00158VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017R\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u0011X\u0082\u000e¢\u0006\u0002\n\u0000\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0093\u0001"}, d2 = {"Landroidx/compose/ui/graphics/drawscope/CanvasDrawScope;", "Landroidx/compose/ui/graphics/drawscope/DrawScope;", "()V", "density", "", "getDensity", "()F", "drawContext", "Landroidx/compose/ui/graphics/drawscope/DrawContext;", "getDrawContext", "()Landroidx/compose/ui/graphics/drawscope/DrawContext;", "drawParams", "Landroidx/compose/ui/graphics/drawscope/CanvasDrawScope$DrawParams;", "getDrawParams$annotations", "getDrawParams", "()Landroidx/compose/ui/graphics/drawscope/CanvasDrawScope$DrawParams;", "fillPaint", "Landroidx/compose/ui/graphics/Paint;", "fontScale", "getFontScale", "layoutDirection", "Landroidx/compose/ui/unit/LayoutDirection;", "getLayoutDirection", "()Landroidx/compose/ui/unit/LayoutDirection;", "strokePaint", "configurePaint", "brush", "Landroidx/compose/ui/graphics/Brush;", "style", "Landroidx/compose/ui/graphics/drawscope/DrawStyle;", "alpha", "colorFilter", "Landroidx/compose/ui/graphics/ColorFilter;", "blendMode", "Landroidx/compose/ui/graphics/BlendMode;", "filterQuality", "Landroidx/compose/ui/graphics/FilterQuality;", "configurePaint-swdJneE", "(Landroidx/compose/ui/graphics/Brush;Landroidx/compose/ui/graphics/drawscope/DrawStyle;FLandroidx/compose/ui/graphics/ColorFilter;II)Landroidx/compose/ui/graphics/Paint;", "color", "Landroidx/compose/ui/graphics/Color;", "configurePaint-2qPWKa0", "(JLandroidx/compose/ui/graphics/drawscope/DrawStyle;FLandroidx/compose/ui/graphics/ColorFilter;II)Landroidx/compose/ui/graphics/Paint;", "configureStrokePaint", "strokeWidth", "miter", "cap", "Landroidx/compose/ui/graphics/StrokeCap;", "join", "Landroidx/compose/ui/graphics/StrokeJoin;", "pathEffect", "Landroidx/compose/ui/graphics/PathEffect;", "configureStrokePaint-ho4zsrM", "(Landroidx/compose/ui/graphics/Brush;FFIILandroidx/compose/ui/graphics/PathEffect;FLandroidx/compose/ui/graphics/ColorFilter;II)Landroidx/compose/ui/graphics/Paint;", "configureStrokePaint-Q_0CZUI", "(JFFIILandroidx/compose/ui/graphics/PathEffect;FLandroidx/compose/ui/graphics/ColorFilter;II)Landroidx/compose/ui/graphics/Paint;", "draw", "", "Landroidx/compose/ui/unit/Density;", "canvas", "Landroidx/compose/ui/graphics/Canvas;", "size", "Landroidx/compose/ui/geometry/Size;", "block", "Lkotlin/Function1;", "Lkotlin/ExtensionFunctionType;", "draw-yzxVdVo", "(Landroidx/compose/ui/unit/Density;Landroidx/compose/ui/unit/LayoutDirection;Landroidx/compose/ui/graphics/Canvas;JLkotlin/jvm/functions/Function1;)V", "drawArc", "startAngle", "sweepAngle", "useCenter", "", "topLeft", "Landroidx/compose/ui/geometry/Offset;", "drawArc-illE91I", "(Landroidx/compose/ui/graphics/Brush;FFZJJFLandroidx/compose/ui/graphics/drawscope/DrawStyle;Landroidx/compose/ui/graphics/ColorFilter;I)V", "drawArc-yD3GUKo", "(JFFZJJFLandroidx/compose/ui/graphics/drawscope/DrawStyle;Landroidx/compose/ui/graphics/ColorFilter;I)V", "drawCircle", "radius", "center", "drawCircle-V9BoPsw", "(Landroidx/compose/ui/graphics/Brush;FJFLandroidx/compose/ui/graphics/drawscope/DrawStyle;Landroidx/compose/ui/graphics/ColorFilter;I)V", "drawCircle-VaOC9Bg", "(JFJFLandroidx/compose/ui/graphics/drawscope/DrawStyle;Landroidx/compose/ui/graphics/ColorFilter;I)V", "drawImage", "image", "Landroidx/compose/ui/graphics/ImageBitmap;", "drawImage-gbVJVH8", "(Landroidx/compose/ui/graphics/ImageBitmap;JFLandroidx/compose/ui/graphics/drawscope/DrawStyle;Landroidx/compose/ui/graphics/ColorFilter;I)V", "srcOffset", "Landroidx/compose/ui/unit/IntOffset;", "srcSize", "Landroidx/compose/ui/unit/IntSize;", "dstOffset", "dstSize", "drawImage-9jGpkUE", "(Landroidx/compose/ui/graphics/ImageBitmap;JJJJFLandroidx/compose/ui/graphics/drawscope/DrawStyle;Landroidx/compose/ui/graphics/ColorFilter;I)V", "drawImage-AZ2fEMs", "(Landroidx/compose/ui/graphics/ImageBitmap;JJJJFLandroidx/compose/ui/graphics/drawscope/DrawStyle;Landroidx/compose/ui/graphics/ColorFilter;II)V", "drawLine", "start", "end", "drawLine-1RTmtNc", "(Landroidx/compose/ui/graphics/Brush;JJFILandroidx/compose/ui/graphics/PathEffect;FLandroidx/compose/ui/graphics/ColorFilter;I)V", "drawLine-NGM6Ib0", "(JJJFILandroidx/compose/ui/graphics/PathEffect;FLandroidx/compose/ui/graphics/ColorFilter;I)V", "drawOval", "drawOval-AsUm42w", "(Landroidx/compose/ui/graphics/Brush;JJFLandroidx/compose/ui/graphics/drawscope/DrawStyle;Landroidx/compose/ui/graphics/ColorFilter;I)V", "drawOval-n-J9OG0", "(JJJFLandroidx/compose/ui/graphics/drawscope/DrawStyle;Landroidx/compose/ui/graphics/ColorFilter;I)V", "drawPath", "path", "Landroidx/compose/ui/graphics/Path;", "drawPath-GBMwjPU", "(Landroidx/compose/ui/graphics/Path;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/drawscope/DrawStyle;Landroidx/compose/ui/graphics/ColorFilter;I)V", "drawPath-LG529CI", "(Landroidx/compose/ui/graphics/Path;JFLandroidx/compose/ui/graphics/drawscope/DrawStyle;Landroidx/compose/ui/graphics/ColorFilter;I)V", "drawPoints", "points", "", "pointMode", "Landroidx/compose/ui/graphics/PointMode;", "drawPoints-Gsft0Ws", "(Ljava/util/List;ILandroidx/compose/ui/graphics/Brush;FILandroidx/compose/ui/graphics/PathEffect;FLandroidx/compose/ui/graphics/ColorFilter;I)V", "drawPoints-F8ZwMP8", "(Ljava/util/List;IJFILandroidx/compose/ui/graphics/PathEffect;FLandroidx/compose/ui/graphics/ColorFilter;I)V", "drawRect", "drawRect-AsUm42w", "drawRect-n-J9OG0", "drawRoundRect", "cornerRadius", "Landroidx/compose/ui/geometry/CornerRadius;", "drawRoundRect-ZuiqVtQ", "(Landroidx/compose/ui/graphics/Brush;JJJFLandroidx/compose/ui/graphics/drawscope/DrawStyle;Landroidx/compose/ui/graphics/ColorFilter;I)V", "drawRoundRect-u-Aw5IA", "(JJJJLandroidx/compose/ui/graphics/drawscope/DrawStyle;FLandroidx/compose/ui/graphics/ColorFilter;I)V", "obtainFillPaint", "obtainStrokePaint", "selectPaint", "drawStyle", "modulate", "modulate-5vOe2sY", "(JF)J", "DrawParams", "ui-graphics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class CanvasDrawScope implements DrawScope {
    private final DrawContext drawContext;
    private final DrawParams drawParams;
    private Paint fillPaint;
    private Paint strokePaint;

    /* JADX INFO: compiled from: CanvasDrawScope.kt */
    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001B-\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0007HÆ\u0003J\u0016\u0010\u001f\u001a\u00020\tHÆ\u0003ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b \u0010\u0018J;\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\tHÆ\u0001ø\u0001\u0000¢\u0006\u0004\b\"\u0010#J\u0013\u0010$\u001a\u00020%2\b\u0010&\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010'\u001a\u00020(HÖ\u0001J\t\u0010)\u001a\u00020*HÖ\u0001R\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\"\u0010\b\u001a\u00020\tX\u0086\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0010\n\u0002\u0010\u001b\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001a\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006+"}, d2 = {"Landroidx/compose/ui/graphics/drawscope/CanvasDrawScope$DrawParams;", "", "density", "Landroidx/compose/ui/unit/Density;", "layoutDirection", "Landroidx/compose/ui/unit/LayoutDirection;", "canvas", "Landroidx/compose/ui/graphics/Canvas;", "size", "Landroidx/compose/ui/geometry/Size;", "(Landroidx/compose/ui/unit/Density;Landroidx/compose/ui/unit/LayoutDirection;Landroidx/compose/ui/graphics/Canvas;JLkotlin/jvm/internal/DefaultConstructorMarker;)V", "getCanvas", "()Landroidx/compose/ui/graphics/Canvas;", "setCanvas", "(Landroidx/compose/ui/graphics/Canvas;)V", "getDensity", "()Landroidx/compose/ui/unit/Density;", "setDensity", "(Landroidx/compose/ui/unit/Density;)V", "getLayoutDirection", "()Landroidx/compose/ui/unit/LayoutDirection;", "setLayoutDirection", "(Landroidx/compose/ui/unit/LayoutDirection;)V", "getSize-NH-jbRc", "()J", "setSize-uvyYCjk", "(J)V", "J", "component1", "component2", "component3", "component4", "component4-NH-jbRc", "copy", "copy-Ug5Nnss", "(Landroidx/compose/ui/unit/Density;Landroidx/compose/ui/unit/LayoutDirection;Landroidx/compose/ui/graphics/Canvas;J)Landroidx/compose/ui/graphics/drawscope/CanvasDrawScope$DrawParams;", "equals", "", "other", "hashCode", "", "toString", "", "ui-graphics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class DrawParams {
        private Canvas canvas;
        private Density density;
        private LayoutDirection layoutDirection;
        private long size;

        public /* synthetic */ DrawParams(Density r1, LayoutDirection r2, Canvas r3, long r4, DefaultConstructorMarker r6) {
            this(r1, r2, r3, r4);
        }

        /* JADX INFO: renamed from: copy-Ug5Nnss$default, reason: not valid java name */
        public static /* synthetic */ DrawParams m4833copyUg5Nnss$default(DrawParams r0, Density r1, LayoutDirection r2, Canvas r3, long r4, int r6, Object r7) {
            if ((r6 & 1) == 0) goto L6;
            r1 = r0.density;
        L6:
            if ((r6 & 2) == 0) goto L9;
            r2 = r0.layoutDirection;
        L9:
            if ((r6 & 4) == 0) goto L12;
            r3 = r0.canvas;
        L12:
            if ((r6 & 8) == 0) goto L14;
            r4 = r0.size;
        L14:
            long r8 = r4;
            Canvas r5 = r3;
            Density r9 = r1;
            return r0.m4835copyUg5Nnss(r9, r2, r5, r8);
        }

        public final Density component1() {
            return this.density;
        }

        public final LayoutDirection component2() {
            return this.layoutDirection;
        }

        public final Canvas component3() {
            return this.canvas;
        }

        /* JADX INFO: renamed from: component4-NH-jbRc, reason: not valid java name */
        public final long m4834component4NHjbRc() {
            return this.size;
        }

        /* JADX INFO: renamed from: copy-Ug5Nnss, reason: not valid java name */
        public final DrawParams m4835copyUg5Nnss(Density r8, LayoutDirection r9, Canvas r10, long r11) {
            return new DrawParams(r8, r9, r10, r11, null);
        }

        public boolean equals(Object r8) {
            if (this != r8) goto L6;
            return true;
        L6:
            if ((r8 instanceof DrawParams) == true) goto L8;
            return false;
        L8:
            DrawParams r1 = (DrawParams) r8;
            if (Intrinsics.areEqual(this.density, r1.density) == true) goto L12;
            return false;
        L12:
            if (this.layoutDirection == r1.layoutDirection) goto L15;
            return false;
        L15:
            if (Intrinsics.areEqual(this.canvas, r1.canvas) == true) goto L18;
            return false;
        L18:
            if (Size.m4190equalsimpl0(this.size, r1.size) == true) goto L20;
            return false;
        L20:
            return true;
        }

        public int hashCode() {
            return (((((this.density.hashCode() * 31) + this.layoutDirection.hashCode()) * 31) + this.canvas.hashCode()) * 31) + Size.m4195hashCodeimpl(this.size);
        }

        public String toString() {
            return "DrawParams(density=" + this.density + ", layoutDirection=" + this.layoutDirection + ", canvas=" + this.canvas + ", size=" + Size.m4198toStringimpl(this.size) + ')';
        }

        private DrawParams(Density density, LayoutDirection layoutDirection, Canvas canvas, long size) {
            this.density = density;
            this.layoutDirection = layoutDirection;
            this.canvas = canvas;
            this.size = size;
        }

        public /* synthetic */ DrawParams(Density r8, LayoutDirection r9, Canvas r10, long r11, int r13, DefaultConstructorMarker r14) {
            if ((r13 & 1) == 0) goto L5;
            Density r1 = DrawContextKt.getDefaultDensity();
        L7:
            if ((r13 & 2) == 0) goto L9;
            LayoutDirection r2 = LayoutDirection.Ltr;
        L11:
            if ((r13 & 4) == 0) goto L13;
            Canvas r3 = EmptyCanvas.INSTANCE;
        L15:
            if ((r13 & 8) == 0) goto L17;
            long r4 = Size.Companion.m4203getZeroNHjbRc();
        L18:
            this(r1, r2, r3, r4, null);
            return;
        L17:
            r4 = r11;
            goto L18
        L13:
            r3 = r10;
            goto L15
        L9:
            r2 = r9;
            goto L11
        L5:
            r1 = r8;
            goto L7
        }

        public final Density getDensity() {
            return this.density;
        }

        public final void setDensity(Density r1) {
            this.density = r1;
        }

        public final LayoutDirection getLayoutDirection() {
            return this.layoutDirection;
        }

        public final void setLayoutDirection(LayoutDirection r1) {
            this.layoutDirection = r1;
        }

        public final Canvas getCanvas() {
            return this.canvas;
        }

        public final void setCanvas(Canvas r1) {
            this.canvas = r1;
        }

        /* JADX INFO: renamed from: getSize-NH-jbRc, reason: not valid java name */
        public final long m4836getSizeNHjbRc() {
            return this.size;
        }

        /* JADX INFO: renamed from: setSize-uvyYCjk, reason: not valid java name */
        public final void m4837setSizeuvyYCjk(long r1) {
            this.size = r1;
        }
    }

    public static /* synthetic */ void getDrawParams$annotations() {
    }

    public CanvasDrawScope() {
        Density r1 = null;
        LayoutDirection r2 = null;
        Canvas r3 = null;
        long r4 = 0;
        this.drawParams = new DrawParams(r1, r2, r3, r4, 15, null);
        this.drawContext = new CanvasDrawScope$drawContext$1(this);
    }

    public final DrawParams getDrawParams() {
        return this.drawParams;
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    public LayoutDirection getLayoutDirection() {
        return this.drawParams.getLayoutDirection();
    }

    @Override // androidx.compose.ui.unit.Density
    public float getDensity() {
        return this.drawParams.getDensity().getDensity();
    }

    @Override // androidx.compose.ui.unit.FontScaling
    public float getFontScale() {
        return this.drawParams.getDensity().getFontScale();
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    public DrawContext getDrawContext() {
        return this.drawContext;
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    /* JADX INFO: renamed from: drawLine-1RTmtNc, reason: not valid java name */
    public void mo4821drawLine1RTmtNc(Brush brush, long start, long end, float strokeWidth, int cap, PathEffect pathEffect, float alpha, ColorFilter colorFilter, int blendMode) {
        this.drawParams.getCanvas().mo4225drawLineWko1d7g(start, end, m4811configureStrokePaintho4zsrM$default(this, brush, strokeWidth, 4.0f, cap, StrokeJoin.Companion.m4730getMiterLxFBmk8(), pathEffect, alpha, colorFilter, blendMode, 0, 512, null));
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    /* JADX INFO: renamed from: drawLine-NGM6Ib0, reason: not valid java name */
    public void mo4822drawLineNGM6Ib0(long color, long start, long end, float strokeWidth, int cap, PathEffect pathEffect, float alpha, ColorFilter colorFilter, int blendMode) {
        this.drawParams.getCanvas().mo4225drawLineWko1d7g(start, end, m4809configureStrokePaintQ_0CZUI$default(this, color, strokeWidth, 4.0f, cap, StrokeJoin.Companion.m4730getMiterLxFBmk8(), pathEffect, alpha, colorFilter, blendMode, 0, 512, null));
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    /* JADX INFO: renamed from: drawRect-AsUm42w, reason: not valid java name */
    public void mo4829drawRectAsUm42w(Brush brush, long topLeft, long size, float alpha, DrawStyle style, ColorFilter colorFilter, int blendMode) {
        Canvas r9 = this.drawParams.getCanvas();
        int bits$iv$iv$iv = (int) (topLeft >> 32);
        float r10 = Float.intBitsToFloat(bits$iv$iv$iv);
        int bits$iv$iv$iv2 = (int) (topLeft & 4294967295L);
        float r11 = Float.intBitsToFloat(bits$iv$iv$iv2);
        int bits$iv$iv$iv3 = (int) (topLeft >> 32);
        int bits$iv$iv$iv4 = (int) (size >> 32);
        float r12 = Float.intBitsToFloat(bits$iv$iv$iv3) + Float.intBitsToFloat(bits$iv$iv$iv4);
        int bits$iv$iv$iv5 = (int) (topLeft & 4294967295L);
        int bits$iv$iv$iv6 = (int) (4294967295L & size);
        r9.drawRect(r10, r11, r12, Float.intBitsToFloat(bits$iv$iv$iv5) + Float.intBitsToFloat(bits$iv$iv$iv6), m4807configurePaintswdJneE$default(this, brush, style, alpha, colorFilter, blendMode, 0, 32, null));
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    /* JADX INFO: renamed from: drawRect-n-J9OG0, reason: not valid java name */
    public void mo4830drawRectnJ9OG0(long color, long topLeft, long size, float alpha, DrawStyle style, ColorFilter colorFilter, int blendMode) {
        Canvas r10 = this.drawParams.getCanvas();
        int bits$iv$iv$iv = (int) (topLeft >> 32);
        float r11 = Float.intBitsToFloat(bits$iv$iv$iv);
        int bits$iv$iv$iv2 = (int) (topLeft & 4294967295L);
        float r12 = Float.intBitsToFloat(bits$iv$iv$iv2);
        int bits$iv$iv$iv3 = (int) (topLeft >> 32);
        int bits$iv$iv$iv4 = (int) (size >> 32);
        float r13 = Float.intBitsToFloat(bits$iv$iv$iv3) + Float.intBitsToFloat(bits$iv$iv$iv4);
        int bits$iv$iv$iv5 = (int) (topLeft & 4294967295L);
        int bits$iv$iv$iv6 = (int) (4294967295L & size);
        r10.drawRect(r11, r12, r13, Float.intBitsToFloat(bits$iv$iv$iv5) + Float.intBitsToFloat(bits$iv$iv$iv6), m4805configurePaint2qPWKa0$default(this, color, style, alpha, colorFilter, blendMode, 0, 32, null));
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    /* JADX INFO: renamed from: drawImage-gbVJVH8, reason: not valid java name */
    public void mo4820drawImagegbVJVH8(ImageBitmap image, long topLeft, float alpha, DrawStyle style, ColorFilter colorFilter, int blendMode) {
        this.drawParams.getCanvas().mo4223drawImaged4ec7I(image, topLeft, m4807configurePaintswdJneE$default(this, null, style, alpha, colorFilter, blendMode, 0, 32, null));
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Prefer usage of drawImage that consumes an optional FilterQuality parameter", replaceWith = @ReplaceWith(expression = "drawImage(image, srcOffset, srcSize, dstOffset, dstSize, alpha, style, colorFilter, blendMode, FilterQuality.Low)", imports = {"androidx.compose.ui.graphics.drawscope", "androidx.compose.ui.graphics.FilterQuality"}))
    /* JADX INFO: renamed from: drawImage-9jGpkUE, reason: not valid java name */
    public /* synthetic */ void mo4818drawImage9jGpkUE(ImageBitmap image, long srcOffset, long srcSize, long dstOffset, long dstSize, float alpha, DrawStyle style, ColorFilter colorFilter, int blendMode) {
        this.drawParams.getCanvas().mo4224drawImageRectHPBpro0(image, srcOffset, srcSize, dstOffset, dstSize, m4807configurePaintswdJneE$default(this, null, style, alpha, colorFilter, blendMode, 0, 32, null));
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    /* JADX INFO: renamed from: drawImage-AZ2fEMs, reason: not valid java name */
    public void mo4819drawImageAZ2fEMs(ImageBitmap image, long srcOffset, long srcSize, long dstOffset, long dstSize, float alpha, DrawStyle style, ColorFilter colorFilter, int blendMode, int filterQuality) {
        this.drawParams.getCanvas().mo4224drawImageRectHPBpro0(image, srcOffset, srcSize, dstOffset, dstSize, m4806configurePaintswdJneE(null, style, alpha, colorFilter, blendMode, filterQuality));
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    /* JADX INFO: renamed from: drawRoundRect-ZuiqVtQ, reason: not valid java name */
    public void mo4831drawRoundRectZuiqVtQ(Brush brush, long topLeft, long size, long cornerRadius, float alpha, DrawStyle style, ColorFilter colorFilter, int blendMode) {
        Canvas r9 = this.drawParams.getCanvas();
        int bits$iv$iv$iv = (int) (topLeft >> 32);
        float r10 = Float.intBitsToFloat(bits$iv$iv$iv);
        int bits$iv$iv$iv2 = (int) (topLeft & 4294967295L);
        float r11 = Float.intBitsToFloat(bits$iv$iv$iv2);
        int bits$iv$iv$iv3 = (int) (topLeft >> 32);
        float r8 = Float.intBitsToFloat(bits$iv$iv$iv3);
        int bits$iv$iv$iv4 = (int) (size >> 32);
        float r12 = Float.intBitsToFloat(bits$iv$iv$iv4) + r8;
        int bits$iv$iv$iv5 = (int) (topLeft & 4294967295L);
        float r13 = Float.intBitsToFloat(bits$iv$iv$iv5);
        int bits$iv$iv$iv6 = (int) (size & 4294967295L);
        float r14 = Float.intBitsToFloat(bits$iv$iv$iv6) + r13;
        int bits$iv$iv$iv7 = (int) (cornerRadius >> 32);
        float r15 = Float.intBitsToFloat(bits$iv$iv$iv7);
        int bits$iv$iv$iv8 = (int) (cornerRadius & 4294967295L);
        r9.drawRoundRect(r10, r11, r12, r14, r15, Float.intBitsToFloat(bits$iv$iv$iv8), m4807configurePaintswdJneE$default(this, brush, style, alpha, colorFilter, blendMode, 0, 32, null));
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    /* JADX INFO: renamed from: drawRoundRect-u-Aw5IA, reason: not valid java name */
    public void mo4832drawRoundRectuAw5IA(long color, long topLeft, long size, long cornerRadius, DrawStyle style, float alpha, ColorFilter colorFilter, int blendMode) {
        Canvas r10 = this.drawParams.getCanvas();
        int bits$iv$iv$iv = (int) (topLeft >> 32);
        float r11 = Float.intBitsToFloat(bits$iv$iv$iv);
        int bits$iv$iv$iv2 = (int) (topLeft & 4294967295L);
        float r12 = Float.intBitsToFloat(bits$iv$iv$iv2);
        int bits$iv$iv$iv3 = (int) (topLeft >> 32);
        int bits$iv$iv$iv4 = (int) (size >> 32);
        float r13 = Float.intBitsToFloat(bits$iv$iv$iv3) + Float.intBitsToFloat(bits$iv$iv$iv4);
        int bits$iv$iv$iv5 = (int) (topLeft & 4294967295L);
        int bits$iv$iv$iv6 = (int) (size & 4294967295L);
        float r14 = Float.intBitsToFloat(bits$iv$iv$iv5) + Float.intBitsToFloat(bits$iv$iv$iv6);
        int bits$iv$iv$iv7 = (int) (cornerRadius >> 32);
        float r15 = Float.intBitsToFloat(bits$iv$iv$iv7);
        int bits$iv$iv$iv8 = (int) (cornerRadius & 4294967295L);
        r10.drawRoundRect(r11, r12, r13, r14, r15, Float.intBitsToFloat(bits$iv$iv$iv8), m4805configurePaint2qPWKa0$default(this, color, style, alpha, colorFilter, blendMode, 0, 32, null));
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    /* JADX INFO: renamed from: drawCircle-V9BoPsw, reason: not valid java name */
    public void mo4816drawCircleV9BoPsw(Brush brush, float radius, long center, float alpha, DrawStyle style, ColorFilter colorFilter, int blendMode) {
        this.drawParams.getCanvas().mo4222drawCircle9KIMszo(center, radius, m4807configurePaintswdJneE$default(this, brush, style, alpha, colorFilter, blendMode, 0, 32, null));
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    /* JADX INFO: renamed from: drawCircle-VaOC9Bg, reason: not valid java name */
    public void mo4817drawCircleVaOC9Bg(long color, float radius, long center, float alpha, DrawStyle style, ColorFilter colorFilter, int blendMode) {
        this.drawParams.getCanvas().mo4222drawCircle9KIMszo(center, radius, m4805configurePaint2qPWKa0$default(this, color, style, alpha, colorFilter, blendMode, 0, 32, null));
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    /* JADX INFO: renamed from: drawOval-AsUm42w, reason: not valid java name */
    public void mo4823drawOvalAsUm42w(Brush brush, long topLeft, long size, float alpha, DrawStyle style, ColorFilter colorFilter, int blendMode) {
        Canvas r9 = this.drawParams.getCanvas();
        int bits$iv$iv$iv = (int) (topLeft >> 32);
        float r10 = Float.intBitsToFloat(bits$iv$iv$iv);
        int bits$iv$iv$iv2 = (int) (topLeft & 4294967295L);
        float r11 = Float.intBitsToFloat(bits$iv$iv$iv2);
        int bits$iv$iv$iv3 = (int) (topLeft >> 32);
        int bits$iv$iv$iv4 = (int) (size >> 32);
        float r12 = Float.intBitsToFloat(bits$iv$iv$iv3) + Float.intBitsToFloat(bits$iv$iv$iv4);
        int bits$iv$iv$iv5 = (int) (topLeft & 4294967295L);
        int bits$iv$iv$iv6 = (int) (4294967295L & size);
        r9.drawOval(r10, r11, r12, Float.intBitsToFloat(bits$iv$iv$iv5) + Float.intBitsToFloat(bits$iv$iv$iv6), m4807configurePaintswdJneE$default(this, brush, style, alpha, colorFilter, blendMode, 0, 32, null));
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    /* JADX INFO: renamed from: drawOval-n-J9OG0, reason: not valid java name */
    public void mo4824drawOvalnJ9OG0(long color, long topLeft, long size, float alpha, DrawStyle style, ColorFilter colorFilter, int blendMode) {
        Canvas r10 = this.drawParams.getCanvas();
        int bits$iv$iv$iv = (int) (topLeft >> 32);
        float r11 = Float.intBitsToFloat(bits$iv$iv$iv);
        int bits$iv$iv$iv2 = (int) (topLeft & 4294967295L);
        float r12 = Float.intBitsToFloat(bits$iv$iv$iv2);
        int bits$iv$iv$iv3 = (int) (topLeft >> 32);
        int bits$iv$iv$iv4 = (int) (size >> 32);
        float r13 = Float.intBitsToFloat(bits$iv$iv$iv3) + Float.intBitsToFloat(bits$iv$iv$iv4);
        int bits$iv$iv$iv5 = (int) (topLeft & 4294967295L);
        int bits$iv$iv$iv6 = (int) (4294967295L & size);
        r10.drawOval(r11, r12, r13, Float.intBitsToFloat(bits$iv$iv$iv5) + Float.intBitsToFloat(bits$iv$iv$iv6), m4805configurePaint2qPWKa0$default(this, color, style, alpha, colorFilter, blendMode, 0, 32, null));
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    /* JADX INFO: renamed from: drawArc-illE91I, reason: not valid java name */
    public void mo4814drawArcillE91I(Brush brush, float startAngle, float sweepAngle, boolean useCenter, long topLeft, long size, float alpha, DrawStyle style, ColorFilter colorFilter, int blendMode) {
        Canvas r9 = this.drawParams.getCanvas();
        int bits$iv$iv$iv = (int) (topLeft >> 32);
        float r10 = Float.intBitsToFloat(bits$iv$iv$iv);
        int bits$iv$iv$iv2 = (int) (topLeft & 4294967295L);
        float r11 = Float.intBitsToFloat(bits$iv$iv$iv2);
        int bits$iv$iv$iv3 = (int) (topLeft >> 32);
        int bits$iv$iv$iv4 = (int) (size >> 32);
        float r12 = Float.intBitsToFloat(bits$iv$iv$iv3) + Float.intBitsToFloat(bits$iv$iv$iv4);
        int bits$iv$iv$iv5 = (int) (topLeft & 4294967295L);
        int bits$iv$iv$iv6 = (int) (4294967295L & size);
        r9.drawArc(r10, r11, r12, Float.intBitsToFloat(bits$iv$iv$iv5) + Float.intBitsToFloat(bits$iv$iv$iv6), startAngle, sweepAngle, useCenter, m4807configurePaintswdJneE$default(this, brush, style, alpha, colorFilter, blendMode, 0, 32, null));
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    /* JADX INFO: renamed from: drawArc-yD3GUKo, reason: not valid java name */
    public void mo4815drawArcyD3GUKo(long color, float startAngle, float sweepAngle, boolean useCenter, long topLeft, long size, float alpha, DrawStyle style, ColorFilter colorFilter, int blendMode) {
        Canvas r10 = this.drawParams.getCanvas();
        int bits$iv$iv$iv = (int) (topLeft >> 32);
        float r11 = Float.intBitsToFloat(bits$iv$iv$iv);
        int bits$iv$iv$iv2 = (int) (topLeft & 4294967295L);
        float r12 = Float.intBitsToFloat(bits$iv$iv$iv2);
        int bits$iv$iv$iv3 = (int) (topLeft >> 32);
        int bits$iv$iv$iv4 = (int) (size >> 32);
        float r13 = Float.intBitsToFloat(bits$iv$iv$iv3) + Float.intBitsToFloat(bits$iv$iv$iv4);
        int bits$iv$iv$iv5 = (int) (topLeft & 4294967295L);
        int bits$iv$iv$iv6 = (int) (4294967295L & size);
        r10.drawArc(r11, r12, r13, Float.intBitsToFloat(bits$iv$iv$iv5) + Float.intBitsToFloat(bits$iv$iv$iv6), startAngle, sweepAngle, useCenter, m4805configurePaint2qPWKa0$default(this, color, style, alpha, colorFilter, blendMode, 0, 32, null));
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    /* JADX INFO: renamed from: drawPath-LG529CI, reason: not valid java name */
    public void mo4826drawPathLG529CI(Path path, long color, float alpha, DrawStyle style, ColorFilter colorFilter, int blendMode) {
        this.drawParams.getCanvas().drawPath(path, m4805configurePaint2qPWKa0$default(this, color, style, alpha, colorFilter, blendMode, 0, 32, null));
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    /* JADX INFO: renamed from: drawPath-GBMwjPU, reason: not valid java name */
    public void mo4825drawPathGBMwjPU(Path path, Brush brush, float alpha, DrawStyle style, ColorFilter colorFilter, int blendMode) {
        this.drawParams.getCanvas().drawPath(path, m4807configurePaintswdJneE$default(this, brush, style, alpha, colorFilter, blendMode, 0, 32, null));
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    /* JADX INFO: renamed from: drawPoints-F8ZwMP8, reason: not valid java name */
    public void mo4827drawPointsF8ZwMP8(List<Offset> r16, int pointMode, long color, float strokeWidth, int cap, PathEffect pathEffect, float alpha, ColorFilter colorFilter, int blendMode) {
        this.drawParams.getCanvas().mo4226drawPointsO7TthRY(pointMode, r16, m4809configureStrokePaintQ_0CZUI$default(this, color, strokeWidth, 4.0f, cap, StrokeJoin.Companion.m4730getMiterLxFBmk8(), pathEffect, alpha, colorFilter, blendMode, 0, 512, null));
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    /* JADX INFO: renamed from: drawPoints-Gsft0Ws, reason: not valid java name */
    public void mo4828drawPointsGsft0Ws(List<Offset> r15, int pointMode, Brush brush, float strokeWidth, int cap, PathEffect pathEffect, float alpha, ColorFilter colorFilter, int blendMode) {
        this.drawParams.getCanvas().mo4226drawPointsO7TthRY(pointMode, r15, m4811configureStrokePaintho4zsrM$default(this, brush, strokeWidth, 4.0f, cap, StrokeJoin.Companion.m4730getMiterLxFBmk8(), pathEffect, alpha, colorFilter, blendMode, 0, 512, null));
    }

    /* JADX INFO: renamed from: draw-yzxVdVo, reason: not valid java name */
    public final void m4813drawyzxVdVo(Density density, LayoutDirection layoutDirection, Canvas canvas, long size, Function1<? super DrawScope, Unit> r14) {
        DrawParams r1 = getDrawParams();
        Density prevDensity = r1.component1();
        LayoutDirection prevLayoutDirection = r1.component2();
        Canvas prevCanvas = r1.component3();
        long prevSize = r1.m4834component4NHjbRc();
        DrawParams $this$draw_yzxVdVo_u24lambda_u240 = getDrawParams();
        $this$draw_yzxVdVo_u24lambda_u240.setDensity(density);
        $this$draw_yzxVdVo_u24lambda_u240.setLayoutDirection(layoutDirection);
        $this$draw_yzxVdVo_u24lambda_u240.setCanvas(canvas);
        $this$draw_yzxVdVo_u24lambda_u240.m4837setSizeuvyYCjk(size);
        canvas.save();
        r14.invoke(this);
        canvas.restore();
        DrawParams $this$draw_yzxVdVo_u24lambda_u241 = getDrawParams();
        $this$draw_yzxVdVo_u24lambda_u241.setDensity(prevDensity);
        $this$draw_yzxVdVo_u24lambda_u241.setLayoutDirection(prevLayoutDirection);
        $this$draw_yzxVdVo_u24lambda_u241.setCanvas(prevCanvas);
        $this$draw_yzxVdVo_u24lambda_u241.m4837setSizeuvyYCjk(prevSize);
    }

    private final Paint obtainFillPaint() {
        Paint r0 = this.fillPaint;
        if (r0 != null) goto L6;
        Paint $this$obtainFillPaint_u24lambda_u242 = AndroidPaint_androidKt.Paint();
        $this$obtainFillPaint_u24lambda_u242.mo4249setStylek9PVt8s(PaintingStyle.Companion.m4633getFillTiuSbCo());
        this.fillPaint = $this$obtainFillPaint_u24lambda_u242;
        return $this$obtainFillPaint_u24lambda_u242;
    L6:
        return r0;
    }

    private final Paint obtainStrokePaint() {
        Paint r0 = this.strokePaint;
        if (r0 != null) goto L6;
        Paint $this$obtainStrokePaint_u24lambda_u244 = AndroidPaint_androidKt.Paint();
        $this$obtainStrokePaint_u24lambda_u244.mo4249setStylek9PVt8s(PaintingStyle.Companion.m4634getStrokeTiuSbCo());
        this.strokePaint = $this$obtainStrokePaint_u24lambda_u244;
        return $this$obtainStrokePaint_u24lambda_u244;
    L6:
        return r0;
    }

    private final Paint selectPaint(DrawStyle drawStyle) {
        if (Intrinsics.areEqual(drawStyle, Fill.INSTANCE) == false) goto L6;
        return obtainFillPaint();
    L6:
        if ((drawStyle instanceof Stroke) == false) goto L31;
        Paint $this$selectPaint_u24lambda_u246 = obtainStrokePaint();
        boolean r4 = true;
        if ($this$selectPaint_u24lambda_u246.getStrokeWidth() != ((Stroke) drawStyle).getWidth()) goto L10;
        boolean r3 = true;
    L11:
        if (r3 == true) goto L14;
        $this$selectPaint_u24lambda_u246.setStrokeWidth(((Stroke) drawStyle).getWidth());
    L14:
        if (StrokeCap.m4715equalsimpl0($this$selectPaint_u24lambda_u246.mo4241getStrokeCapKaPHkGw(), ((Stroke) drawStyle).m4986getCapKaPHkGw()) == true) goto L17;
        $this$selectPaint_u24lambda_u246.mo4247setStrokeCapBeK7IIE(((Stroke) drawStyle).m4986getCapKaPHkGw());
    L17:
        if ($this$selectPaint_u24lambda_u246.getStrokeMiterLimit() == ((Stroke) drawStyle).getMiter()) goto L20;
        r4 = false;
    L20:
        if (r4 == true) goto L23;
        $this$selectPaint_u24lambda_u246.setStrokeMiterLimit(((Stroke) drawStyle).getMiter());
    L23:
        if (StrokeJoin.m4725equalsimpl0($this$selectPaint_u24lambda_u246.mo4242getStrokeJoinLxFBmk8(), ((Stroke) drawStyle).m4987getJoinLxFBmk8()) == true) goto L26;
        $this$selectPaint_u24lambda_u246.mo4248setStrokeJoinWw9F2mQ(((Stroke) drawStyle).m4987getJoinLxFBmk8());
    L26:
        if (Intrinsics.areEqual($this$selectPaint_u24lambda_u246.getPathEffect(), ((Stroke) drawStyle).getPathEffect()) == true) goto L33;
        $this$selectPaint_u24lambda_u246.setPathEffect(((Stroke) drawStyle).getPathEffect());
        return $this$selectPaint_u24lambda_u246;
    L33:
        return $this$selectPaint_u24lambda_u246;
    L10:
        r3 = false;
        goto L11
    L31:
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: renamed from: configurePaint-swdJneE$default, reason: not valid java name */
    static /* synthetic */ Paint m4807configurePaintswdJneE$default(CanvasDrawScope r7, Brush r8, DrawStyle r9, float r10, ColorFilter r11, int r12, int r13, int r14, Object r15) {
        if ((r14 & 32) == 0) goto L5;
        int r6 = DrawScope.Companion.m4920getDefaultFilterQualityfv9h1I();
    L7:
        return r7.m4806configurePaintswdJneE(r8, r9, r10, r11, r12, r6);
    L5:
        r6 = r13;
        goto L7
    }

    /* JADX INFO: renamed from: configurePaint-swdJneE, reason: not valid java name */
    private final Paint m4806configurePaintswdJneE(Brush brush, DrawStyle style, float alpha, ColorFilter colorFilter, int blendMode, int filterQuality) {
        Paint $this$configurePaint_swdJneE_u24lambda_u247 = selectPaint(style);
        if (brush == null) goto L6;
        brush.mo4313applyToPq9zytI(mo4917getSizeNHjbRc(), $this$configurePaint_swdJneE_u24lambda_u247, alpha);
    L18:
        if (Intrinsics.areEqual($this$configurePaint_swdJneE_u24lambda_u247.getColorFilter(), colorFilter) == true) goto L21;
        $this$configurePaint_swdJneE_u24lambda_u247.setColorFilter(colorFilter);
    L21:
        if (BlendMode.m4277equalsimpl0($this$configurePaint_swdJneE_u24lambda_u247.mo4238getBlendMode0nO6VwU(), blendMode) == true) goto L24;
        $this$configurePaint_swdJneE_u24lambda_u247.mo4244setBlendModes9anfk8(blendMode);
    L24:
        if (FilterQuality.m4460equalsimpl0($this$configurePaint_swdJneE_u24lambda_u247.mo4240getFilterQualityfv9h1I(), filterQuality) == true) goto L27;
        $this$configurePaint_swdJneE_u24lambda_u247.mo4246setFilterQualityvDHp3xo(filterQuality);
    L27:
        return $this$configurePaint_swdJneE_u24lambda_u247;
    L6:
        if ($this$configurePaint_swdJneE_u24lambda_u247.getShader() == null) goto L9;
        $this$configurePaint_swdJneE_u24lambda_u247.setShader(null);
    L9:
        if (Color.m4367equalsimpl0($this$configurePaint_swdJneE_u24lambda_u247.mo4239getColor0d7_KjU(), Color.Companion.m4392getBlack0d7_KjU()) == true) goto L12;
        $this$configurePaint_swdJneE_u24lambda_u247.mo4245setColor8_81llA(Color.Companion.m4392getBlack0d7_KjU());
    L12:
        if ($this$configurePaint_swdJneE_u24lambda_u247.getAlpha() != alpha) goto L14;
        boolean r3 = true;
    L15:
        if (r3 == true) goto L18;
        $this$configurePaint_swdJneE_u24lambda_u247.setAlpha(alpha);
        goto L18
    L14:
        r3 = false;
        goto L15
    }

    /* JADX INFO: renamed from: configurePaint-2qPWKa0$default, reason: not valid java name */
    static /* synthetic */ Paint m4805configurePaint2qPWKa0$default(CanvasDrawScope r9, long r10, DrawStyle r12, float r13, ColorFilter r14, int r15, int r16, int r17, Object r18) {
        if ((r17 & 32) == 0) goto L5;
        int r8 = DrawScope.Companion.m4920getDefaultFilterQualityfv9h1I();
    L7:
        return r9.m4804configurePaint2qPWKa0(r10, r12, r13, r14, r15, r8);
    L5:
        r8 = r16;
        goto L7
    }

    /* JADX INFO: renamed from: configurePaint-2qPWKa0, reason: not valid java name */
    private final Paint m4804configurePaint2qPWKa0(long color, DrawStyle style, float alpha, ColorFilter colorFilter, int blendMode, int filterQuality) {
        Paint $this$configurePaint_2qPWKa0_u24lambda_u248 = selectPaint(style);
        long targetColor = m4812modulate5vOe2sY(color, alpha);
        if (Color.m4367equalsimpl0($this$configurePaint_2qPWKa0_u24lambda_u248.mo4239getColor0d7_KjU(), targetColor) == true) goto L6;
        $this$configurePaint_2qPWKa0_u24lambda_u248.mo4245setColor8_81llA(targetColor);
    L6:
        if ($this$configurePaint_2qPWKa0_u24lambda_u248.getShader() == null) goto L9;
        $this$configurePaint_2qPWKa0_u24lambda_u248.setShader(null);
    L9:
        if (Intrinsics.areEqual($this$configurePaint_2qPWKa0_u24lambda_u248.getColorFilter(), colorFilter) == true) goto L12;
        $this$configurePaint_2qPWKa0_u24lambda_u248.setColorFilter(colorFilter);
    L12:
        if (BlendMode.m4277equalsimpl0($this$configurePaint_2qPWKa0_u24lambda_u248.mo4238getBlendMode0nO6VwU(), blendMode) == true) goto L15;
        $this$configurePaint_2qPWKa0_u24lambda_u248.mo4244setBlendModes9anfk8(blendMode);
    L15:
        if (FilterQuality.m4460equalsimpl0($this$configurePaint_2qPWKa0_u24lambda_u248.mo4240getFilterQualityfv9h1I(), filterQuality) == true) goto L18;
        $this$configurePaint_2qPWKa0_u24lambda_u248.mo4246setFilterQualityvDHp3xo(filterQuality);
    L18:
        return $this$configurePaint_2qPWKa0_u24lambda_u248;
    }

    /* JADX INFO: renamed from: configureStrokePaint-Q_0CZUI$default, reason: not valid java name */
    static /* synthetic */ Paint m4809configureStrokePaintQ_0CZUI$default(CanvasDrawScope r13, long r14, float r16, float r17, int r18, int r19, PathEffect r20, float r21, ColorFilter r22, int r23, int r24, int r25, Object r26) {
        if ((r25 & 512) == 0) goto L5;
        int r12 = DrawScope.Companion.m4920getDefaultFilterQualityfv9h1I();
    L7:
        return r13.m4808configureStrokePaintQ_0CZUI(r14, r16, r17, r18, r19, r20, r21, r22, r23, r12);
    L5:
        r12 = r24;
        goto L7
    }

    /* JADX INFO: renamed from: configureStrokePaint-Q_0CZUI, reason: not valid java name */
    private final Paint m4808configureStrokePaintQ_0CZUI(long color, float strokeWidth, float miter, int cap, int join, PathEffect pathEffect, float alpha, ColorFilter colorFilter, int blendMode, int filterQuality) {
        Paint $this$configureStrokePaint_Q_0CZUI_u24lambda_u249 = obtainStrokePaint();
        long targetColor = m4812modulate5vOe2sY(color, alpha);
        if (Color.m4367equalsimpl0($this$configureStrokePaint_Q_0CZUI_u24lambda_u249.mo4239getColor0d7_KjU(), targetColor) == true) goto L6;
        $this$configureStrokePaint_Q_0CZUI_u24lambda_u249.mo4245setColor8_81llA(targetColor);
    L6:
        if ($this$configureStrokePaint_Q_0CZUI_u24lambda_u249.getShader() == null) goto L9;
        $this$configureStrokePaint_Q_0CZUI_u24lambda_u249.setShader(null);
    L9:
        if (Intrinsics.areEqual($this$configureStrokePaint_Q_0CZUI_u24lambda_u249.getColorFilter(), colorFilter) == true) goto L12;
        $this$configureStrokePaint_Q_0CZUI_u24lambda_u249.setColorFilter(colorFilter);
    L12:
        if (BlendMode.m4277equalsimpl0($this$configureStrokePaint_Q_0CZUI_u24lambda_u249.mo4238getBlendMode0nO6VwU(), blendMode) == true) goto L14;
        $this$configureStrokePaint_Q_0CZUI_u24lambda_u249.mo4244setBlendModes9anfk8(blendMode);
    L14:
        boolean r11 = true;
        if ($this$configureStrokePaint_Q_0CZUI_u24lambda_u249.getStrokeWidth() != strokeWidth) goto L17;
        boolean r10 = true;
    L18:
        if (r10 == true) goto L21;
        $this$configureStrokePaint_Q_0CZUI_u24lambda_u249.setStrokeWidth(strokeWidth);
    L21:
        if ($this$configureStrokePaint_Q_0CZUI_u24lambda_u249.getStrokeMiterLimit() == miter) goto L24;
        r11 = false;
    L24:
        if (r11 == true) goto L27;
        $this$configureStrokePaint_Q_0CZUI_u24lambda_u249.setStrokeMiterLimit(miter);
    L27:
        if (StrokeCap.m4715equalsimpl0($this$configureStrokePaint_Q_0CZUI_u24lambda_u249.mo4241getStrokeCapKaPHkGw(), cap) == true) goto L30;
        $this$configureStrokePaint_Q_0CZUI_u24lambda_u249.mo4247setStrokeCapBeK7IIE(cap);
    L30:
        if (StrokeJoin.m4725equalsimpl0($this$configureStrokePaint_Q_0CZUI_u24lambda_u249.mo4242getStrokeJoinLxFBmk8(), join) == true) goto L33;
        $this$configureStrokePaint_Q_0CZUI_u24lambda_u249.mo4248setStrokeJoinWw9F2mQ(join);
    L33:
        if (Intrinsics.areEqual($this$configureStrokePaint_Q_0CZUI_u24lambda_u249.getPathEffect(), pathEffect) == true) goto L36;
        $this$configureStrokePaint_Q_0CZUI_u24lambda_u249.setPathEffect(pathEffect);
    L36:
        if (FilterQuality.m4460equalsimpl0($this$configureStrokePaint_Q_0CZUI_u24lambda_u249.mo4240getFilterQualityfv9h1I(), filterQuality) == true) goto L39;
        $this$configureStrokePaint_Q_0CZUI_u24lambda_u249.mo4246setFilterQualityvDHp3xo(filterQuality);
    L39:
        return $this$configureStrokePaint_Q_0CZUI_u24lambda_u249;
    L17:
        r10 = false;
        goto L18
    }

    /* JADX INFO: renamed from: configureStrokePaint-ho4zsrM$default, reason: not valid java name */
    static /* synthetic */ Paint m4811configureStrokePaintho4zsrM$default(CanvasDrawScope r12, Brush r13, float r14, float r15, int r16, int r17, PathEffect r18, float r19, ColorFilter r20, int r21, int r22, int r23, Object r24) {
        if ((r23 & 512) == 0) goto L5;
        int r11 = DrawScope.Companion.m4920getDefaultFilterQualityfv9h1I();
    L7:
        return r12.m4810configureStrokePaintho4zsrM(r13, r14, r15, r16, r17, r18, r19, r20, r21, r11);
    L5:
        r11 = r22;
        goto L7
    }

    /* JADX INFO: renamed from: configureStrokePaint-ho4zsrM, reason: not valid java name */
    private final Paint m4810configureStrokePaintho4zsrM(Brush brush, float strokeWidth, float miter, int cap, int join, PathEffect pathEffect, float alpha, ColorFilter colorFilter, int blendMode, int filterQuality) {
        Paint $this$configureStrokePaint_ho4zsrM_u24lambda_u2410 = obtainStrokePaint();
        if (brush == null) goto L6;
        brush.mo4313applyToPq9zytI(mo4917getSizeNHjbRc(), $this$configureStrokePaint_ho4zsrM_u24lambda_u2410, alpha);
    L12:
        if (Intrinsics.areEqual($this$configureStrokePaint_ho4zsrM_u24lambda_u2410.getColorFilter(), colorFilter) == true) goto L15;
        $this$configureStrokePaint_ho4zsrM_u24lambda_u2410.setColorFilter(colorFilter);
    L15:
        if (BlendMode.m4277equalsimpl0($this$configureStrokePaint_ho4zsrM_u24lambda_u2410.mo4238getBlendMode0nO6VwU(), blendMode) == true) goto L18;
        $this$configureStrokePaint_ho4zsrM_u24lambda_u2410.mo4244setBlendModes9anfk8(blendMode);
    L18:
        if ($this$configureStrokePaint_ho4zsrM_u24lambda_u2410.getStrokeWidth() != strokeWidth) goto L20;
        boolean r13 = true;
    L21:
        if (r13 == true) goto L24;
        $this$configureStrokePaint_ho4zsrM_u24lambda_u2410.setStrokeWidth(strokeWidth);
    L24:
        if ($this$configureStrokePaint_ho4zsrM_u24lambda_u2410.getStrokeMiterLimit() != miter) goto L26;
        boolean r14 = true;
    L27:
        if (r14 == true) goto L30;
        $this$configureStrokePaint_ho4zsrM_u24lambda_u2410.setStrokeMiterLimit(miter);
    L30:
        if (StrokeCap.m4715equalsimpl0($this$configureStrokePaint_ho4zsrM_u24lambda_u2410.mo4241getStrokeCapKaPHkGw(), cap) == true) goto L33;
        $this$configureStrokePaint_ho4zsrM_u24lambda_u2410.mo4247setStrokeCapBeK7IIE(cap);
    L33:
        if (StrokeJoin.m4725equalsimpl0($this$configureStrokePaint_ho4zsrM_u24lambda_u2410.mo4242getStrokeJoinLxFBmk8(), join) == true) goto L36;
        $this$configureStrokePaint_ho4zsrM_u24lambda_u2410.mo4248setStrokeJoinWw9F2mQ(join);
    L36:
        if (Intrinsics.areEqual($this$configureStrokePaint_ho4zsrM_u24lambda_u2410.getPathEffect(), pathEffect) == true) goto L39;
        $this$configureStrokePaint_ho4zsrM_u24lambda_u2410.setPathEffect(pathEffect);
    L39:
        if (FilterQuality.m4460equalsimpl0($this$configureStrokePaint_ho4zsrM_u24lambda_u2410.mo4240getFilterQualityfv9h1I(), filterQuality) == true) goto L42;
        $this$configureStrokePaint_ho4zsrM_u24lambda_u2410.mo4246setFilterQualityvDHp3xo(filterQuality);
    L42:
        return $this$configureStrokePaint_ho4zsrM_u24lambda_u2410;
    L26:
        r14 = false;
        goto L27
    L20:
        r13 = false;
        goto L21
    L6:
        if ($this$configureStrokePaint_ho4zsrM_u24lambda_u2410.getAlpha() != alpha) goto L8;
        boolean r15 = true;
    L9:
        if (r15 == true) goto L12;
        $this$configureStrokePaint_ho4zsrM_u24lambda_u2410.setAlpha(alpha);
        goto L12
    L8:
        r15 = false;
        goto L9
    }

    /* JADX INFO: renamed from: modulate-5vOe2sY, reason: not valid java name */
    private final long m4812modulate5vOe2sY(long $this$modulate_u2d5vOe2sY, float alpha) {
        if (alpha != 1.0f) goto L5;
        boolean r0 = true;
    L6:
        if (r0 == true) goto L9;
        return Color.m4365copywmQWz5c$default($this$modulate_u2d5vOe2sY, Color.m4368getAlphaimpl($this$modulate_u2d5vOe2sY) * alpha, 0.0f, 0.0f, 0.0f, 14, null);
    L9:
        return $this$modulate_u2d5vOe2sY;
    L5:
        r0 = false;
        goto L6
    }
}
