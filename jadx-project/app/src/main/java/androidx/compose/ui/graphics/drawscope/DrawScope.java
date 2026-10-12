package androidx.compose.ui.graphics.drawscope;

import androidx.compose.ui.geometry.CornerRadius;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.geometry.SizeKt;
import androidx.compose.ui.graphics.BlendMode;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.FilterQuality;
import androidx.compose.ui.graphics.ImageBitmap;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.PathEffect;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.layer.GraphicsLayer;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.DpRect;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.IntSizeKt;
import androidx.compose.ui.unit.LayoutDirection;
import java.util.List;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: DrawScope.kt */
/* JADX INFO: loaded from: classes.dex */
@DrawScopeMarker
@Metadata(d1 = {"\u0000¾\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bg\u0018\u0000 u2\u00020\u0001:\u0001uJp\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u00192\b\b\u0002\u0010\u001a\u001a\u00020\u00032\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0003\u0010\u001b\u001a\u00020\u00162\b\b\u0002\u0010\u001c\u001a\u00020\u001d2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001f2\b\b\u0002\u0010 \u001a\u00020!H&ø\u0001\u0000¢\u0006\u0004\b\"\u0010#Jp\u0010\u0011\u001a\u00020\u00122\u0006\u0010$\u001a\u00020%2\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u00192\b\b\u0002\u0010\u001a\u001a\u00020\u00032\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0003\u0010\u001b\u001a\u00020\u00162\b\b\u0002\u0010\u001c\u001a\u00020\u001d2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001f2\b\b\u0002\u0010 \u001a\u00020!H&ø\u0001\u0000¢\u0006\u0004\b&\u0010'JX\u0010(\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\b\b\u0002\u0010)\u001a\u00020\u00162\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u001b\u001a\u00020\u00162\b\b\u0002\u0010\u001c\u001a\u00020\u001d2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001f2\b\b\u0002\u0010 \u001a\u00020!H&ø\u0001\u0000¢\u0006\u0004\b*\u0010+JX\u0010(\u001a\u00020\u00122\u0006\u0010$\u001a\u00020%2\b\b\u0002\u0010)\u001a\u00020\u00162\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u001b\u001a\u00020\u00162\b\b\u0002\u0010\u001c\u001a\u00020\u001d2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001f2\b\b\u0002\u0010 \u001a\u00020!H&ø\u0001\u0000¢\u0006\u0004\b,\u0010-JN\u0010.\u001a\u00020\u00122\u0006\u0010/\u001a\u0002002\b\b\u0002\u0010\u001a\u001a\u00020\u00032\b\b\u0003\u0010\u001b\u001a\u00020\u00162\b\b\u0002\u0010\u001c\u001a\u00020\u001d2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001f2\b\b\u0002\u0010 \u001a\u00020!H&ø\u0001\u0000¢\u0006\u0004\b1\u00102Jl\u0010.\u001a\u00020\u00122\u0006\u0010/\u001a\u0002002\b\b\u0002\u00103\u001a\u0002042\b\b\u0002\u00105\u001a\u0002062\b\b\u0002\u00107\u001a\u0002042\b\b\u0002\u00108\u001a\u0002062\b\b\u0003\u0010\u001b\u001a\u00020\u00162\b\b\u0002\u0010\u001c\u001a\u00020\u001d2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001f2\b\b\u0002\u0010 \u001a\u00020!H'ø\u0001\u0000¢\u0006\u0004\b9\u0010:Jv\u0010.\u001a\u00020\u00122\u0006\u0010/\u001a\u0002002\b\b\u0002\u00103\u001a\u0002042\b\b\u0002\u00105\u001a\u0002062\b\b\u0002\u00107\u001a\u0002042\b\b\u0002\u00108\u001a\u0002062\b\b\u0003\u0010\u001b\u001a\u00020\u00162\b\b\u0002\u0010\u001c\u001a\u00020\u001d2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001f2\b\b\u0002\u0010 \u001a\u00020!2\b\b\u0002\u0010;\u001a\u00020<H\u0016ø\u0001\u0000¢\u0006\u0004\b=\u0010>Jj\u0010?\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010@\u001a\u00020\u00032\u0006\u0010A\u001a\u00020\u00032\b\b\u0002\u0010B\u001a\u00020\u00162\b\b\u0002\u0010C\u001a\u00020D2\n\b\u0002\u0010E\u001a\u0004\u0018\u00010F2\b\b\u0003\u0010\u001b\u001a\u00020\u00162\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001f2\b\b\u0002\u0010 \u001a\u00020!H&ø\u0001\u0000¢\u0006\u0004\bG\u0010HJj\u0010?\u001a\u00020\u00122\u0006\u0010$\u001a\u00020%2\u0006\u0010@\u001a\u00020\u00032\u0006\u0010A\u001a\u00020\u00032\b\b\u0002\u0010B\u001a\u00020\u00162\b\b\u0002\u0010C\u001a\u00020D2\n\b\u0002\u0010E\u001a\u0004\u0018\u00010F2\b\b\u0003\u0010\u001b\u001a\u00020\u00162\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001f2\b\b\u0002\u0010 \u001a\u00020!H&ø\u0001\u0000¢\u0006\u0004\bI\u0010JJX\u0010K\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\b\b\u0002\u0010\u001a\u001a\u00020\u00032\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0003\u0010\u001b\u001a\u00020\u00162\b\b\u0002\u0010\u001c\u001a\u00020\u001d2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001f2\b\b\u0002\u0010 \u001a\u00020!H&ø\u0001\u0000¢\u0006\u0004\bL\u0010MJX\u0010K\u001a\u00020\u00122\u0006\u0010$\u001a\u00020%2\b\b\u0002\u0010\u001a\u001a\u00020\u00032\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0003\u0010\u001b\u001a\u00020\u00162\b\b\u0002\u0010\u001c\u001a\u00020\u001d2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001f2\b\b\u0002\u0010 \u001a\u00020!H&ø\u0001\u0000¢\u0006\u0004\bN\u0010OJL\u0010P\u001a\u00020\u00122\u0006\u0010Q\u001a\u00020R2\u0006\u0010\u0013\u001a\u00020\u00142\b\b\u0003\u0010\u001b\u001a\u00020\u00162\b\b\u0002\u0010\u001c\u001a\u00020\u001d2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001f2\b\b\u0002\u0010 \u001a\u00020!H&ø\u0001\u0000¢\u0006\u0004\bS\u0010TJL\u0010P\u001a\u00020\u00122\u0006\u0010Q\u001a\u00020R2\u0006\u0010$\u001a\u00020%2\b\b\u0003\u0010\u001b\u001a\u00020\u00162\b\b\u0002\u0010\u001c\u001a\u00020\u001d2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001f2\b\b\u0002\u0010 \u001a\u00020!H&ø\u0001\u0000¢\u0006\u0004\bU\u0010VJp\u0010W\u001a\u00020\u00122\f\u0010X\u001a\b\u0012\u0004\u0012\u00020\u00030Y2\u0006\u0010Z\u001a\u00020[2\u0006\u0010\u0013\u001a\u00020\u00142\b\b\u0002\u0010B\u001a\u00020\u00162\b\b\u0002\u0010C\u001a\u00020D2\n\b\u0002\u0010E\u001a\u0004\u0018\u00010F2\b\b\u0003\u0010\u001b\u001a\u00020\u00162\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001f2\b\b\u0002\u0010 \u001a\u00020!H&ø\u0001\u0000¢\u0006\u0004\b\\\u0010]Jp\u0010W\u001a\u00020\u00122\f\u0010X\u001a\b\u0012\u0004\u0012\u00020\u00030Y2\u0006\u0010Z\u001a\u00020[2\u0006\u0010$\u001a\u00020%2\b\b\u0002\u0010B\u001a\u00020\u00162\b\b\u0002\u0010C\u001a\u00020D2\n\b\u0002\u0010E\u001a\u0004\u0018\u00010F2\b\b\u0003\u0010\u001b\u001a\u00020\u00162\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001f2\b\b\u0002\u0010 \u001a\u00020!H&ø\u0001\u0000¢\u0006\u0004\b^\u0010_JX\u0010`\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\b\b\u0002\u0010\u001a\u001a\u00020\u00032\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0003\u0010\u001b\u001a\u00020\u00162\b\b\u0002\u0010\u001c\u001a\u00020\u001d2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001f2\b\b\u0002\u0010 \u001a\u00020!H&ø\u0001\u0000¢\u0006\u0004\ba\u0010MJX\u0010`\u001a\u00020\u00122\u0006\u0010$\u001a\u00020%2\b\b\u0002\u0010\u001a\u001a\u00020\u00032\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0003\u0010\u001b\u001a\u00020\u00162\b\b\u0002\u0010\u001c\u001a\u00020\u001d2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001f2\b\b\u0002\u0010 \u001a\u00020!H&ø\u0001\u0000¢\u0006\u0004\bb\u0010OJb\u0010c\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\b\b\u0002\u0010\u001a\u001a\u00020\u00032\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010d\u001a\u00020e2\b\b\u0003\u0010\u001b\u001a\u00020\u00162\b\b\u0002\u0010\u001c\u001a\u00020\u001d2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001f2\b\b\u0002\u0010 \u001a\u00020!H&ø\u0001\u0000¢\u0006\u0004\bf\u0010gJb\u0010c\u001a\u00020\u00122\u0006\u0010$\u001a\u00020%2\b\b\u0002\u0010\u001a\u001a\u00020\u00032\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010d\u001a\u00020e2\b\b\u0002\u0010\u001c\u001a\u00020\u001d2\b\b\u0003\u0010\u001b\u001a\u00020\u00162\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001f2\b\b\u0002\u0010 \u001a\u00020!H&ø\u0001\u0000¢\u0006\u0004\bh\u0010iJ\u001e\u0010j\u001a\u00020\u000f*\u00020\u000f2\u0006\u0010k\u001a\u00020\u0003H\u0002ø\u0001\u0000¢\u0006\u0004\bl\u0010mJ9\u0010n\u001a\u00020\u0012*\u00020o2\b\b\u0002\u0010\u000e\u001a\u0002062\u0017\u0010p\u001a\u0013\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00120q¢\u0006\u0002\brH\u0016ø\u0001\u0000¢\u0006\u0004\bs\u0010tR\u001a\u0010\u0002\u001a\u00020\u00038VX\u0096\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0012\u0010\u0006\u001a\u00020\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0012\u0010\n\u001a\u00020\u000bX¦\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u001a\u0010\u000e\u001a\u00020\u000f8VX\u0096\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0005ø\u0001\u0002\u0082\u0002\u0011\n\u0005\b¡\u001e0\u0001\n\u0002\b!\n\u0004\b!0\u0001¨\u0006vÀ\u0006\u0003"}, d2 = {"Landroidx/compose/ui/graphics/drawscope/DrawScope;", "Landroidx/compose/ui/unit/Density;", "center", "Landroidx/compose/ui/geometry/Offset;", "getCenter-F1C5BW0", "()J", "drawContext", "Landroidx/compose/ui/graphics/drawscope/DrawContext;", "getDrawContext", "()Landroidx/compose/ui/graphics/drawscope/DrawContext;", "layoutDirection", "Landroidx/compose/ui/unit/LayoutDirection;", "getLayoutDirection", "()Landroidx/compose/ui/unit/LayoutDirection;", "size", "Landroidx/compose/ui/geometry/Size;", "getSize-NH-jbRc", "drawArc", "", "brush", "Landroidx/compose/ui/graphics/Brush;", "startAngle", "", "sweepAngle", "useCenter", "", "topLeft", "alpha", "style", "Landroidx/compose/ui/graphics/drawscope/DrawStyle;", "colorFilter", "Landroidx/compose/ui/graphics/ColorFilter;", "blendMode", "Landroidx/compose/ui/graphics/BlendMode;", "drawArc-illE91I", "(Landroidx/compose/ui/graphics/Brush;FFZJJFLandroidx/compose/ui/graphics/drawscope/DrawStyle;Landroidx/compose/ui/graphics/ColorFilter;I)V", "color", "Landroidx/compose/ui/graphics/Color;", "drawArc-yD3GUKo", "(JFFZJJFLandroidx/compose/ui/graphics/drawscope/DrawStyle;Landroidx/compose/ui/graphics/ColorFilter;I)V", "drawCircle", "radius", "drawCircle-V9BoPsw", "(Landroidx/compose/ui/graphics/Brush;FJFLandroidx/compose/ui/graphics/drawscope/DrawStyle;Landroidx/compose/ui/graphics/ColorFilter;I)V", "drawCircle-VaOC9Bg", "(JFJFLandroidx/compose/ui/graphics/drawscope/DrawStyle;Landroidx/compose/ui/graphics/ColorFilter;I)V", "drawImage", "image", "Landroidx/compose/ui/graphics/ImageBitmap;", "drawImage-gbVJVH8", "(Landroidx/compose/ui/graphics/ImageBitmap;JFLandroidx/compose/ui/graphics/drawscope/DrawStyle;Landroidx/compose/ui/graphics/ColorFilter;I)V", "srcOffset", "Landroidx/compose/ui/unit/IntOffset;", "srcSize", "Landroidx/compose/ui/unit/IntSize;", "dstOffset", "dstSize", "drawImage-9jGpkUE", "(Landroidx/compose/ui/graphics/ImageBitmap;JJJJFLandroidx/compose/ui/graphics/drawscope/DrawStyle;Landroidx/compose/ui/graphics/ColorFilter;I)V", "filterQuality", "Landroidx/compose/ui/graphics/FilterQuality;", "drawImage-AZ2fEMs", "(Landroidx/compose/ui/graphics/ImageBitmap;JJJJFLandroidx/compose/ui/graphics/drawscope/DrawStyle;Landroidx/compose/ui/graphics/ColorFilter;II)V", "drawLine", "start", "end", "strokeWidth", "cap", "Landroidx/compose/ui/graphics/StrokeCap;", "pathEffect", "Landroidx/compose/ui/graphics/PathEffect;", "drawLine-1RTmtNc", "(Landroidx/compose/ui/graphics/Brush;JJFILandroidx/compose/ui/graphics/PathEffect;FLandroidx/compose/ui/graphics/ColorFilter;I)V", "drawLine-NGM6Ib0", "(JJJFILandroidx/compose/ui/graphics/PathEffect;FLandroidx/compose/ui/graphics/ColorFilter;I)V", "drawOval", "drawOval-AsUm42w", "(Landroidx/compose/ui/graphics/Brush;JJFLandroidx/compose/ui/graphics/drawscope/DrawStyle;Landroidx/compose/ui/graphics/ColorFilter;I)V", "drawOval-n-J9OG0", "(JJJFLandroidx/compose/ui/graphics/drawscope/DrawStyle;Landroidx/compose/ui/graphics/ColorFilter;I)V", "drawPath", "path", "Landroidx/compose/ui/graphics/Path;", "drawPath-GBMwjPU", "(Landroidx/compose/ui/graphics/Path;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/drawscope/DrawStyle;Landroidx/compose/ui/graphics/ColorFilter;I)V", "drawPath-LG529CI", "(Landroidx/compose/ui/graphics/Path;JFLandroidx/compose/ui/graphics/drawscope/DrawStyle;Landroidx/compose/ui/graphics/ColorFilter;I)V", "drawPoints", "points", "", "pointMode", "Landroidx/compose/ui/graphics/PointMode;", "drawPoints-Gsft0Ws", "(Ljava/util/List;ILandroidx/compose/ui/graphics/Brush;FILandroidx/compose/ui/graphics/PathEffect;FLandroidx/compose/ui/graphics/ColorFilter;I)V", "drawPoints-F8ZwMP8", "(Ljava/util/List;IJFILandroidx/compose/ui/graphics/PathEffect;FLandroidx/compose/ui/graphics/ColorFilter;I)V", "drawRect", "drawRect-AsUm42w", "drawRect-n-J9OG0", "drawRoundRect", "cornerRadius", "Landroidx/compose/ui/geometry/CornerRadius;", "drawRoundRect-ZuiqVtQ", "(Landroidx/compose/ui/graphics/Brush;JJJFLandroidx/compose/ui/graphics/drawscope/DrawStyle;Landroidx/compose/ui/graphics/ColorFilter;I)V", "drawRoundRect-u-Aw5IA", "(JJJJLandroidx/compose/ui/graphics/drawscope/DrawStyle;FLandroidx/compose/ui/graphics/ColorFilter;I)V", "offsetSize", "offset", "offsetSize-PENXr5M", "(JJ)J", "record", "Landroidx/compose/ui/graphics/layer/GraphicsLayer;", "block", "Lkotlin/Function1;", "Lkotlin/ExtensionFunctionType;", "record-JVtK1S4", "(Landroidx/compose/ui/graphics/layer/GraphicsLayer;JLkotlin/jvm/functions/Function1;)V", "Companion", "ui-graphics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public interface DrawScope extends Density {
    public static final Companion Companion = null;

    /* JADX INFO: compiled from: DrawScope.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0019\u0010\u0003\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0005\u0010\u0006R\u0019\u0010\b\u001a\u00020\tø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\n\u0010\u0006\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u000b"}, d2 = {"Landroidx/compose/ui/graphics/drawscope/DrawScope$Companion;", "", "()V", "DefaultBlendMode", "Landroidx/compose/ui/graphics/BlendMode;", "getDefaultBlendMode-0nO6VwU", "()I", "I", "DefaultFilterQuality", "Landroidx/compose/ui/graphics/FilterQuality;", "getDefaultFilterQuality-f-v9h1I", "ui-graphics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = null;
        private static final int DefaultBlendMode = 0;
        private static final int DefaultFilterQuality = 0;

        private Companion() {
        }

        static {
            $$INSTANCE = new Companion();
            DefaultBlendMode = BlendMode.Companion.m4308getSrcOver0nO6VwU();
            DefaultFilterQuality = FilterQuality.Companion.m4465getLowfv9h1I();
        }

        /* JADX INFO: renamed from: getDefaultBlendMode-0nO6VwU, reason: not valid java name */
        public final int m4919getDefaultBlendMode0nO6VwU() {
            return DefaultBlendMode;
        }

        /* JADX INFO: renamed from: getDefaultFilterQuality-f-v9h1I, reason: not valid java name */
        public final int m4920getDefaultFilterQualityfv9h1I() {
            return DefaultFilterQuality;
        }
    }

    /* JADX INFO: compiled from: DrawScope.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class DefaultImpls {
        @Deprecated
        /* JADX INFO: renamed from: roundToPx--R2X_6o, reason: not valid java name */
        public static int m4945roundToPxR2X_6o(DrawScope $this, long $receiver) {
            return DrawScope.m4883access$roundToPxR2X_6o$jd($this, $receiver);
        }

        @Deprecated
        /* JADX INFO: renamed from: roundToPx-0680j_4, reason: not valid java name */
        public static int m4946roundToPx0680j_4(DrawScope $this, float $receiver) {
            return DrawScope.m4884access$roundToPx0680j_4$jd($this, $receiver);
        }

        @Deprecated
        /* JADX INFO: renamed from: toDp-GaN1DYA, reason: not valid java name */
        public static float m4947toDpGaN1DYA(DrawScope $this, long $receiver) {
            return DrawScope.m4885access$toDpGaN1DYA$jd($this, $receiver);
        }

        @Deprecated
        /* JADX INFO: renamed from: toDp-u2uoSUM, reason: not valid java name */
        public static float m4948toDpu2uoSUM(DrawScope $this, float $receiver) {
            return DrawScope.m4886access$toDpu2uoSUM$jd($this, $receiver);
        }

        @Deprecated
        /* JADX INFO: renamed from: toDp-u2uoSUM, reason: not valid java name */
        public static float m4949toDpu2uoSUM(DrawScope $this, int $receiver) {
            return DrawScope.m4887access$toDpu2uoSUM$jd($this, $receiver);
        }

        @Deprecated
        /* JADX INFO: renamed from: toDpSize-k-rfVVM, reason: not valid java name */
        public static long m4950toDpSizekrfVVM(DrawScope $this, long $receiver) {
            return DrawScope.m4888access$toDpSizekrfVVM$jd($this, $receiver);
        }

        @Deprecated
        /* JADX INFO: renamed from: toPx--R2X_6o, reason: not valid java name */
        public static float m4951toPxR2X_6o(DrawScope $this, long $receiver) {
            return DrawScope.m4889access$toPxR2X_6o$jd($this, $receiver);
        }

        @Deprecated
        /* JADX INFO: renamed from: toPx-0680j_4, reason: not valid java name */
        public static float m4952toPx0680j_4(DrawScope $this, float $receiver) {
            return DrawScope.m4890access$toPx0680j_4$jd($this, $receiver);
        }

        @Deprecated
        public static Rect toRect(DrawScope $this, DpRect $receiver) {
            return DrawScope.access$toRect$jd($this, $receiver);
        }

        @Deprecated
        /* JADX INFO: renamed from: toSize-XkaWNTQ, reason: not valid java name */
        public static long m4953toSizeXkaWNTQ(DrawScope $this, long $receiver) {
            return DrawScope.m4891access$toSizeXkaWNTQ$jd($this, $receiver);
        }

        @Deprecated
        /* JADX INFO: renamed from: toSp-0xMU5do, reason: not valid java name */
        public static long m4954toSp0xMU5do(DrawScope $this, float $receiver) {
            return DrawScope.m4892access$toSp0xMU5do$jd($this, $receiver);
        }

        @Deprecated
        /* JADX INFO: renamed from: toSp-kPz2Gy4, reason: not valid java name */
        public static long m4955toSpkPz2Gy4(DrawScope $this, float $receiver) {
            return DrawScope.m4893access$toSpkPz2Gy4$jd($this, $receiver);
        }

        @Deprecated
        /* JADX INFO: renamed from: toSp-kPz2Gy4, reason: not valid java name */
        public static long m4956toSpkPz2Gy4(DrawScope $this, int $receiver) {
            return DrawScope.m4894access$toSpkPz2Gy4$jd($this, $receiver);
        }

        @Deprecated
        /* JADX INFO: renamed from: getCenter-F1C5BW0, reason: not valid java name */
        public static long m4941getCenterF1C5BW0(DrawScope $this) {
            return DrawScope.m4880access$getCenterF1C5BW0$jd($this);
        }

        @Deprecated
        /* JADX INFO: renamed from: getSize-NH-jbRc, reason: not valid java name */
        public static long m4942getSizeNHjbRc(DrawScope $this) {
            return DrawScope.m4881access$getSizeNHjbRc$jd($this);
        }

        /* JADX INFO: renamed from: drawLine-1RTmtNc$default, reason: not valid java name */
        public static /* synthetic */ void m4929drawLine1RTmtNc$default(DrawScope r0, Brush r1, long r2, long r4, float r6, int r7, PathEffect r8, float r9, ColorFilter r10, int r11, int r12, Object r13) {
            DrawScope.m4902drawLine1RTmtNc$default(r0, r1, r2, r4, r6, r7, r8, r9, r10, r11, r12, r13);
        }

        /* JADX INFO: renamed from: drawLine-NGM6Ib0$default, reason: not valid java name */
        public static /* synthetic */ void m4930drawLineNGM6Ib0$default(DrawScope r0, long r1, long r3, long r5, float r7, int r8, PathEffect r9, float r10, ColorFilter r11, int r12, int r13, Object r14) {
            DrawScope.m4903drawLineNGM6Ib0$default(r0, r1, r3, r5, r7, r8, r9, r10, r11, r12, r13, r14);
        }

        /* JADX INFO: renamed from: drawRect-AsUm42w$default, reason: not valid java name */
        public static /* synthetic */ void m4937drawRectAsUm42w$default(DrawScope r0, Brush r1, long r2, long r4, float r6, DrawStyle r7, ColorFilter r8, int r9, int r10, Object r11) {
            DrawScope.m4910drawRectAsUm42w$default(r0, r1, r2, r4, r6, r7, r8, r9, r10, r11);
        }

        /* JADX INFO: renamed from: drawRect-n-J9OG0$default, reason: not valid java name */
        public static /* synthetic */ void m4938drawRectnJ9OG0$default(DrawScope r0, long r1, long r3, long r5, float r7, DrawStyle r8, ColorFilter r9, int r10, int r11, Object r12) {
            DrawScope.m4911drawRectnJ9OG0$default(r0, r1, r3, r5, r7, r8, r9, r10, r11, r12);
        }

        /* JADX INFO: renamed from: drawImage-gbVJVH8$default, reason: not valid java name */
        public static /* synthetic */ void m4928drawImagegbVJVH8$default(DrawScope r0, ImageBitmap r1, long r2, float r4, DrawStyle r5, ColorFilter r6, int r7, int r8, Object r9) {
            DrawScope.m4901drawImagegbVJVH8$default(r0, r1, r2, r4, r5, r6, r7, r8, r9);
        }

        /* JADX INFO: renamed from: drawImage-9jGpkUE$default, reason: not valid java name */
        public static /* synthetic */ void m4925drawImage9jGpkUE$default(DrawScope r0, ImageBitmap r1, long r2, long r4, long r6, long r8, float r10, DrawStyle r11, ColorFilter r12, int r13, int r14, Object r15) {
            DrawScope.m4899drawImage9jGpkUE$default(r0, r1, r2, r4, r6, r8, r10, r11, r12, r13, r14, r15);
        }

        @Deprecated
        /* JADX INFO: renamed from: drawImage-AZ2fEMs, reason: not valid java name */
        public static void m4926drawImageAZ2fEMs(DrawScope $this, ImageBitmap image, long srcOffset, long srcSize, long dstOffset, long dstSize, float alpha, DrawStyle style, ColorFilter colorFilter, int blendMode, int filterQuality) {
            DrawScope.m4879access$drawImageAZ2fEMs$jd($this, image, srcOffset, srcSize, dstOffset, dstSize, alpha, style, colorFilter, blendMode, filterQuality);
        }

        /* JADX INFO: renamed from: drawImage-AZ2fEMs$default, reason: not valid java name */
        public static /* synthetic */ void m4927drawImageAZ2fEMs$default(DrawScope r0, ImageBitmap r1, long r2, long r4, long r6, long r8, float r10, DrawStyle r11, ColorFilter r12, int r13, int r14, int r15, Object r16) {
            DrawScope.m4900drawImageAZ2fEMs$default(r0, r1, r2, r4, r6, r8, r10, r11, r12, r13, r14, r15, r16);
        }

        /* JADX INFO: renamed from: drawRoundRect-ZuiqVtQ$default, reason: not valid java name */
        public static /* synthetic */ void m4939drawRoundRectZuiqVtQ$default(DrawScope r0, Brush r1, long r2, long r4, long r6, float r8, DrawStyle r9, ColorFilter r10, int r11, int r12, Object r13) {
            DrawScope.m4912drawRoundRectZuiqVtQ$default(r0, r1, r2, r4, r6, r8, r9, r10, r11, r12, r13);
        }

        /* JADX INFO: renamed from: drawRoundRect-u-Aw5IA$default, reason: not valid java name */
        public static /* synthetic */ void m4940drawRoundRectuAw5IA$default(DrawScope r0, long r1, long r3, long r5, long r7, DrawStyle r9, float r10, ColorFilter r11, int r12, int r13, Object r14) {
            DrawScope.m4913drawRoundRectuAw5IA$default(r0, r1, r3, r5, r7, r9, r10, r11, r12, r13, r14);
        }

        /* JADX INFO: renamed from: drawCircle-V9BoPsw$default, reason: not valid java name */
        public static /* synthetic */ void m4923drawCircleV9BoPsw$default(DrawScope r0, Brush r1, float r2, long r3, float r5, DrawStyle r6, ColorFilter r7, int r8, int r9, Object r10) {
            DrawScope.m4897drawCircleV9BoPsw$default(r0, r1, r2, r3, r5, r6, r7, r8, r9, r10);
        }

        /* JADX INFO: renamed from: drawCircle-VaOC9Bg$default, reason: not valid java name */
        public static /* synthetic */ void m4924drawCircleVaOC9Bg$default(DrawScope r0, long r1, float r3, long r4, float r6, DrawStyle r7, ColorFilter r8, int r9, int r10, Object r11) {
            DrawScope.m4898drawCircleVaOC9Bg$default(r0, r1, r3, r4, r6, r7, r8, r9, r10, r11);
        }

        /* JADX INFO: renamed from: drawOval-AsUm42w$default, reason: not valid java name */
        public static /* synthetic */ void m4931drawOvalAsUm42w$default(DrawScope r0, Brush r1, long r2, long r4, float r6, DrawStyle r7, ColorFilter r8, int r9, int r10, Object r11) {
            DrawScope.m4904drawOvalAsUm42w$default(r0, r1, r2, r4, r6, r7, r8, r9, r10, r11);
        }

        /* JADX INFO: renamed from: drawOval-n-J9OG0$default, reason: not valid java name */
        public static /* synthetic */ void m4932drawOvalnJ9OG0$default(DrawScope r0, long r1, long r3, long r5, float r7, DrawStyle r8, ColorFilter r9, int r10, int r11, Object r12) {
            DrawScope.m4905drawOvalnJ9OG0$default(r0, r1, r3, r5, r7, r8, r9, r10, r11, r12);
        }

        /* JADX INFO: renamed from: drawArc-illE91I$default, reason: not valid java name */
        public static /* synthetic */ void m4921drawArcillE91I$default(DrawScope r0, Brush r1, float r2, float r3, boolean r4, long r5, long r7, float r9, DrawStyle r10, ColorFilter r11, int r12, int r13, Object r14) {
            DrawScope.m4895drawArcillE91I$default(r0, r1, r2, r3, r4, r5, r7, r9, r10, r11, r12, r13, r14);
        }

        /* JADX INFO: renamed from: drawArc-yD3GUKo$default, reason: not valid java name */
        public static /* synthetic */ void m4922drawArcyD3GUKo$default(DrawScope r0, long r1, float r3, float r4, boolean r5, long r6, long r8, float r10, DrawStyle r11, ColorFilter r12, int r13, int r14, Object r15) {
            DrawScope.m4896drawArcyD3GUKo$default(r0, r1, r3, r4, r5, r6, r8, r10, r11, r12, r13, r14, r15);
        }

        /* JADX INFO: renamed from: drawPath-LG529CI$default, reason: not valid java name */
        public static /* synthetic */ void m4934drawPathLG529CI$default(DrawScope r0, Path r1, long r2, float r4, DrawStyle r5, ColorFilter r6, int r7, int r8, Object r9) {
            DrawScope.m4907drawPathLG529CI$default(r0, r1, r2, r4, r5, r6, r7, r8, r9);
        }

        /* JADX INFO: renamed from: drawPath-GBMwjPU$default, reason: not valid java name */
        public static /* synthetic */ void m4933drawPathGBMwjPU$default(DrawScope r0, Path r1, Brush r2, float r3, DrawStyle r4, ColorFilter r5, int r6, int r7, Object r8) {
            DrawScope.m4906drawPathGBMwjPU$default(r0, r1, r2, r3, r4, r5, r6, r7, r8);
        }

        /* JADX INFO: renamed from: drawPoints-F8ZwMP8$default, reason: not valid java name */
        public static /* synthetic */ void m4935drawPointsF8ZwMP8$default(DrawScope r0, List r1, int r2, long r3, float r5, int r6, PathEffect r7, float r8, ColorFilter r9, int r10, int r11, Object r12) {
            DrawScope.m4908drawPointsF8ZwMP8$default(r0, r1, r2, r3, r5, r6, r7, r8, r9, r10, r11, r12);
        }

        /* JADX INFO: renamed from: drawPoints-Gsft0Ws$default, reason: not valid java name */
        public static /* synthetic */ void m4936drawPointsGsft0Ws$default(DrawScope r0, List r1, int r2, Brush r3, float r4, int r5, PathEffect r6, float r7, ColorFilter r8, int r9, int r10, Object r11) {
            DrawScope.m4909drawPointsGsft0Ws$default(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11);
        }

        @Deprecated
        /* JADX INFO: renamed from: record-JVtK1S4, reason: not valid java name */
        public static void m4943recordJVtK1S4(DrawScope $this, GraphicsLayer $receiver, long size, Function1<? super DrawScope, Unit> r4) {
            DrawScope.m4882access$recordJVtK1S4$jd($this, $receiver, size, r4);
        }

        /* JADX INFO: renamed from: record-JVtK1S4$default, reason: not valid java name */
        public static /* synthetic */ void m4944recordJVtK1S4$default(DrawScope r0, GraphicsLayer r1, long r2, Function1 r4, int r5, Object r6) {
            DrawScope.m4915recordJVtK1S4$default(r0, r1, r2, r4, r5, r6);
        }
    }

    static {
        Companion = Companion.$$INSTANCE;
    }

    /* JADX INFO: renamed from: drawArc-illE91I */
    void mo4814drawArcillE91I(Brush r1, float r2, float r3, boolean r4, long r5, long r7, float r9, DrawStyle r10, ColorFilter r11, int r12);

    /* JADX INFO: renamed from: drawArc-yD3GUKo */
    void mo4815drawArcyD3GUKo(long r1, float r3, float r4, boolean r5, long r6, long r8, float r10, DrawStyle r11, ColorFilter r12, int r13);

    /* JADX INFO: renamed from: drawCircle-V9BoPsw */
    void mo4816drawCircleV9BoPsw(Brush r1, float r2, long r3, float r5, DrawStyle r6, ColorFilter r7, int r8);

    /* JADX INFO: renamed from: drawCircle-VaOC9Bg */
    void mo4817drawCircleVaOC9Bg(long r1, float r3, long r4, float r6, DrawStyle r7, ColorFilter r8, int r9);

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Prefer usage of drawImage that consumes an optional FilterQuality parameter", replaceWith = @ReplaceWith(expression = "drawImage(image, srcOffset, srcSize, dstOffset, dstSize, alpha, style, colorFilter, blendMode, FilterQuality.Low)", imports = {"androidx.compose.ui.graphics.drawscope", "androidx.compose.ui.graphics.FilterQuality"}))
    /* JADX INFO: renamed from: drawImage-9jGpkUE */
    /* synthetic */ void mo4818drawImage9jGpkUE(ImageBitmap r1, long r2, long r4, long r6, long r8, float r10, DrawStyle r11, ColorFilter r12, int r13);

    /* JADX INFO: renamed from: drawImage-gbVJVH8 */
    void mo4820drawImagegbVJVH8(ImageBitmap r1, long r2, float r4, DrawStyle r5, ColorFilter r6, int r7);

    /* JADX INFO: renamed from: drawLine-1RTmtNc */
    void mo4821drawLine1RTmtNc(Brush r1, long r2, long r4, float r6, int r7, PathEffect r8, float r9, ColorFilter r10, int r11);

    /* JADX INFO: renamed from: drawLine-NGM6Ib0 */
    void mo4822drawLineNGM6Ib0(long r1, long r3, long r5, float r7, int r8, PathEffect r9, float r10, ColorFilter r11, int r12);

    /* JADX INFO: renamed from: drawOval-AsUm42w */
    void mo4823drawOvalAsUm42w(Brush r1, long r2, long r4, float r6, DrawStyle r7, ColorFilter r8, int r9);

    /* JADX INFO: renamed from: drawOval-n-J9OG0 */
    void mo4824drawOvalnJ9OG0(long r1, long r3, long r5, float r7, DrawStyle r8, ColorFilter r9, int r10);

    /* JADX INFO: renamed from: drawPath-GBMwjPU */
    void mo4825drawPathGBMwjPU(Path r1, Brush r2, float r3, DrawStyle r4, ColorFilter r5, int r6);

    /* JADX INFO: renamed from: drawPath-LG529CI */
    void mo4826drawPathLG529CI(Path r1, long r2, float r4, DrawStyle r5, ColorFilter r6, int r7);

    /* JADX INFO: renamed from: drawPoints-F8ZwMP8 */
    void mo4827drawPointsF8ZwMP8(List<Offset> r1, int r2, long r3, float r5, int r6, PathEffect r7, float r8, ColorFilter r9, int r10);

    /* JADX INFO: renamed from: drawPoints-Gsft0Ws */
    void mo4828drawPointsGsft0Ws(List<Offset> r1, int r2, Brush r3, float r4, int r5, PathEffect r6, float r7, ColorFilter r8, int r9);

    /* JADX INFO: renamed from: drawRect-AsUm42w */
    void mo4829drawRectAsUm42w(Brush r1, long r2, long r4, float r6, DrawStyle r7, ColorFilter r8, int r9);

    /* JADX INFO: renamed from: drawRect-n-J9OG0 */
    void mo4830drawRectnJ9OG0(long r1, long r3, long r5, float r7, DrawStyle r8, ColorFilter r9, int r10);

    /* JADX INFO: renamed from: drawRoundRect-ZuiqVtQ */
    void mo4831drawRoundRectZuiqVtQ(Brush r1, long r2, long r4, long r6, float r8, DrawStyle r9, ColorFilter r10, int r11);

    /* JADX INFO: renamed from: drawRoundRect-u-Aw5IA */
    void mo4832drawRoundRectuAw5IA(long r1, long r3, long r5, long r7, DrawStyle r9, float r10, ColorFilter r11, int r12);

    DrawContext getDrawContext();

    LayoutDirection getLayoutDirection();

    /* JADX INFO: renamed from: access$drawImage-AZ2fEMs$jd, reason: not valid java name */
    static /* synthetic */ void m4879access$drawImageAZ2fEMs$jd(DrawScope $this, ImageBitmap image, long srcOffset, long srcSize, long dstOffset, long dstSize, float alpha, DrawStyle style, ColorFilter colorFilter, int blendMode, int filterQuality) {
        super.mo4819drawImageAZ2fEMs(image, srcOffset, srcSize, dstOffset, dstSize, alpha, style, colorFilter, blendMode, filterQuality);
    }

    /* JADX INFO: renamed from: access$getCenter-F1C5BW0$jd, reason: not valid java name */
    static /* synthetic */ long m4880access$getCenterF1C5BW0$jd(DrawScope $this) {
        return super.mo4916getCenterF1C5BW0();
    }

    /* JADX INFO: renamed from: access$getSize-NH-jbRc$jd, reason: not valid java name */
    static /* synthetic */ long m4881access$getSizeNHjbRc$jd(DrawScope $this) {
        return super.mo4917getSizeNHjbRc();
    }

    /* JADX INFO: renamed from: access$record-JVtK1S4$jd, reason: not valid java name */
    static /* synthetic */ void m4882access$recordJVtK1S4$jd(DrawScope $this, GraphicsLayer $receiver, long size, Function1 block) {
        super.mo4918recordJVtK1S4($receiver, size, block);
    }

    /* JADX INFO: renamed from: access$roundToPx--R2X_6o$jd, reason: not valid java name */
    static /* synthetic */ int m4883access$roundToPxR2X_6o$jd(DrawScope $this, long $receiver) {
        return super.mo369roundToPxR2X_6o($receiver);
    }

    /* JADX INFO: renamed from: access$roundToPx-0680j_4$jd, reason: not valid java name */
    static /* synthetic */ int m4884access$roundToPx0680j_4$jd(DrawScope $this, float $receiver) {
        return super.mo370roundToPx0680j_4($receiver);
    }

    /* JADX INFO: renamed from: access$toDp-GaN1DYA$jd, reason: not valid java name */
    static /* synthetic */ float m4885access$toDpGaN1DYA$jd(DrawScope $this, long $receiver) {
        return super.mo371toDpGaN1DYA($receiver);
    }

    /* JADX INFO: renamed from: access$toDp-u2uoSUM$jd, reason: not valid java name */
    static /* synthetic */ float m4886access$toDpu2uoSUM$jd(DrawScope $this, float $receiver) {
        return super.mo372toDpu2uoSUM($receiver);
    }

    /* JADX INFO: renamed from: access$toDp-u2uoSUM$jd, reason: not valid java name */
    static /* synthetic */ float m4887access$toDpu2uoSUM$jd(DrawScope $this, int $receiver) {
        return super.mo373toDpu2uoSUM($receiver);
    }

    /* JADX INFO: renamed from: access$toDpSize-k-rfVVM$jd, reason: not valid java name */
    static /* synthetic */ long m4888access$toDpSizekrfVVM$jd(DrawScope $this, long $receiver) {
        return super.mo374toDpSizekrfVVM($receiver);
    }

    /* JADX INFO: renamed from: access$toPx--R2X_6o$jd, reason: not valid java name */
    static /* synthetic */ float m4889access$toPxR2X_6o$jd(DrawScope $this, long $receiver) {
        return super.mo375toPxR2X_6o($receiver);
    }

    /* JADX INFO: renamed from: access$toPx-0680j_4$jd, reason: not valid java name */
    static /* synthetic */ float m4890access$toPx0680j_4$jd(DrawScope $this, float $receiver) {
        return super.mo376toPx0680j_4($receiver);
    }

    static /* synthetic */ Rect access$toRect$jd(DrawScope $this, DpRect $receiver) {
        return super.toRect($receiver);
    }

    /* JADX INFO: renamed from: access$toSize-XkaWNTQ$jd, reason: not valid java name */
    static /* synthetic */ long m4891access$toSizeXkaWNTQ$jd(DrawScope $this, long $receiver) {
        return super.mo377toSizeXkaWNTQ($receiver);
    }

    /* JADX INFO: renamed from: access$toSp-0xMU5do$jd, reason: not valid java name */
    static /* synthetic */ long m4892access$toSp0xMU5do$jd(DrawScope $this, float $receiver) {
        return super.mo378toSp0xMU5do($receiver);
    }

    /* JADX INFO: renamed from: access$toSp-kPz2Gy4$jd, reason: not valid java name */
    static /* synthetic */ long m4893access$toSpkPz2Gy4$jd(DrawScope $this, float $receiver) {
        return super.mo379toSpkPz2Gy4($receiver);
    }

    /* JADX INFO: renamed from: access$toSp-kPz2Gy4$jd, reason: not valid java name */
    static /* synthetic */ long m4894access$toSpkPz2Gy4$jd(DrawScope $this, int $receiver) {
        return super.mo380toSpkPz2Gy4($receiver);
    }

    /* JADX INFO: renamed from: getCenter-F1C5BW0, reason: not valid java name */
    default long mo4916getCenterF1C5BW0() {
        return SizeKt.m4204getCenteruvyYCjk(getDrawContext().mo4838getSizeNHjbRc());
    }

    /* JADX INFO: renamed from: getSize-NH-jbRc, reason: not valid java name */
    default long mo4917getSizeNHjbRc() {
        return getDrawContext().mo4838getSizeNHjbRc();
    }

    /* JADX INFO: renamed from: drawLine-1RTmtNc$default, reason: not valid java name */
    static /* synthetic */ void m4902drawLine1RTmtNc$default(DrawScope r14, Brush r15, long r16, long r18, float r20, int r21, PathEffect r22, float r23, ColorFilter r24, int r25, int r26, Object r27) {
        if (r27 != null) goto L31;
        if ((r26 & 8) == 0) goto L7;
        float r8 = 0.0f;
    L9:
        if ((r26 & 16) == 0) goto L11;
        int r9 = Stroke.Companion.m4988getDefaultCapKaPHkGw();
    L13:
        if ((r26 & 32) == 0) goto L15;
        PathEffect r10 = null;
    L17:
        if ((r26 & 64) == 0) goto L19;
        float r11 = 1.0f;
    L21:
        if ((r26 & 128) == 0) goto L23;
        ColorFilter r12 = null;
    L25:
        if ((r26 & 256) == 0) goto L27;
        int r13 = Companion.m4919getDefaultBlendMode0nO6VwU();
    L28:
        r14.mo4821drawLine1RTmtNc(r15, r16, r18, r8, r9, r10, r11, r12, r13);
        return;
    L27:
        r13 = r25;
        goto L28
    L23:
        r12 = r24;
        goto L25
    L19:
        r11 = r23;
        goto L21
    L15:
        r10 = r22;
        goto L17
    L11:
        r9 = r21;
        goto L13
    L7:
        r8 = r20;
        goto L9
    L31:
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawLine-1RTmtNc");
    }

    /* JADX INFO: renamed from: drawLine-NGM6Ib0$default, reason: not valid java name */
    static /* synthetic */ void m4903drawLineNGM6Ib0$default(DrawScope r15, long r16, long r18, long r20, float r22, int r23, PathEffect r24, float r25, ColorFilter r26, int r27, int r28, Object r29) {
        if (r29 != null) goto L31;
        if ((r28 & 8) == 0) goto L7;
        float r9 = 0.0f;
    L9:
        if ((r28 & 16) == 0) goto L11;
        int r10 = Stroke.Companion.m4988getDefaultCapKaPHkGw();
    L13:
        if ((r28 & 32) == 0) goto L15;
        PathEffect r11 = null;
    L17:
        if ((r28 & 64) == 0) goto L19;
        float r12 = 1.0f;
    L21:
        if ((r28 & 128) == 0) goto L23;
        ColorFilter r13 = null;
    L25:
        if ((r28 & 256) == 0) goto L27;
        int r14 = Companion.m4919getDefaultBlendMode0nO6VwU();
    L28:
        r15.mo4822drawLineNGM6Ib0(r16, r18, r20, r9, r10, r11, r12, r13, r14);
        return;
    L27:
        r14 = r27;
        goto L28
    L23:
        r13 = r26;
        goto L25
    L19:
        r12 = r25;
        goto L21
    L15:
        r11 = r24;
        goto L17
    L11:
        r10 = r23;
        goto L13
    L7:
        r9 = r22;
        goto L9
    L31:
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawLine-NGM6Ib0");
    }

    /* JADX INFO: renamed from: drawRect-AsUm42w$default, reason: not valid java name */
    static /* synthetic */ void m4910drawRectAsUm42w$default(DrawScope r8, Brush r9, long r10, long r12, float r14, DrawStyle r15, ColorFilter r16, int r17, int r18, Object r19) {
        if (r19 != null) goto L30;
        if ((r18 & 2) == 0) goto L6;
        long r0 = Offset.Companion.m4141getZeroF1C5BW0();
    L8:
        if ((r18 & 4) == 0) goto L10;
        long r2 = r8.m4914offsetSizePENXr5M(r8.mo4917getSizeNHjbRc(), r0);
    L12:
        if ((r18 & 8) == 0) goto L14;
        float r4 = 1.0f;
    L16:
        if ((r18 & 16) == 0) goto L18;
        Fill r5 = Fill.INSTANCE;
    L20:
        if ((r18 & 32) == 0) goto L22;
        ColorFilter r6 = null;
    L24:
        if ((r18 & 64) == 0) goto L26;
        int r7 = Companion.m4919getDefaultBlendMode0nO6VwU();
    L27:
        r8.mo4829drawRectAsUm42w(r9, r0, r2, r4, r5, r6, r7);
        return;
    L26:
        r7 = r17;
        goto L27
    L22:
        r6 = r16;
        goto L24
    L18:
        r5 = r15;
        goto L20
    L14:
        r4 = r14;
        goto L16
    L10:
        r2 = r12;
        goto L12
    L6:
        r0 = r10;
        goto L8
    L30:
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawRect-AsUm42w");
    }

    /* JADX INFO: renamed from: drawRect-n-J9OG0$default, reason: not valid java name */
    static /* synthetic */ void m4911drawRectnJ9OG0$default(DrawScope r13, long r14, long r16, long r18, float r20, DrawStyle r21, ColorFilter r22, int r23, int r24, Object r25) {
        if (r25 != null) goto L30;
        if ((r24 & 2) == 0) goto L6;
        long r5 = Offset.Companion.m4141getZeroF1C5BW0();
    L8:
        if ((r24 & 4) == 0) goto L10;
        long r7 = r13.m4914offsetSizePENXr5M(r13.mo4917getSizeNHjbRc(), r5);
    L12:
        if ((r24 & 8) == 0) goto L14;
        float r9 = 1.0f;
    L16:
        if ((r24 & 16) == 0) goto L18;
        DrawStyle r10 = Fill.INSTANCE;
    L20:
        if ((r24 & 32) == 0) goto L22;
        ColorFilter r11 = null;
    L24:
        if ((r24 & 64) == 0) goto L26;
        int r12 = Companion.m4919getDefaultBlendMode0nO6VwU();
    L27:
        r13.mo4830drawRectnJ9OG0(r14, r5, r7, r9, r10, r11, r12);
        return;
    L26:
        r12 = r23;
        goto L27
    L22:
        r11 = r22;
        goto L24
    L18:
        r10 = r21;
        goto L20
    L14:
        r9 = r20;
        goto L16
    L10:
        r7 = r18;
        goto L12
    L6:
        r5 = r16;
        goto L8
    L30:
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawRect-n-J9OG0");
    }

    /* JADX INFO: renamed from: drawImage-gbVJVH8$default, reason: not valid java name */
    static /* synthetic */ void m4901drawImagegbVJVH8$default(DrawScope r6, ImageBitmap r7, long r8, float r10, DrawStyle r11, ColorFilter r12, int r13, int r14, Object r15) {
        if (r15 != null) goto L26;
        if ((r14 & 2) == 0) goto L6;
        long r0 = Offset.Companion.m4141getZeroF1C5BW0();
    L8:
        if ((r14 & 4) == 0) goto L10;
        float r2 = 1.0f;
    L12:
        if ((r14 & 8) == 0) goto L14;
        Fill r3 = Fill.INSTANCE;
    L16:
        if ((r14 & 16) == 0) goto L18;
        ColorFilter r4 = null;
    L20:
        if ((r14 & 32) == 0) goto L22;
        int r5 = Companion.m4919getDefaultBlendMode0nO6VwU();
    L23:
        r6.mo4820drawImagegbVJVH8(r7, r0, r2, r3, r4, r5);
        return;
    L22:
        r5 = r13;
        goto L23
    L18:
        r4 = r12;
        goto L20
    L14:
        r3 = r11;
        goto L16
    L10:
        r2 = r10;
        goto L12
    L6:
        r0 = r8;
        goto L8
    L26:
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawImage-gbVJVH8");
    }

    /* JADX INFO: renamed from: drawImage-9jGpkUE$default, reason: not valid java name */
    static /* synthetic */ void m4899drawImage9jGpkUE$default(DrawScope r13, ImageBitmap r14, long r15, long r17, long r19, long r21, float r23, DrawStyle r24, ColorFilter r25, int r26, int r27, Object r28) {
        if (r28 != null) goto L39;
        if ((r27 & 2) == 0) goto L7;
        long r1 = IntOffset.Companion.m7112getZeronOccac();
    L9:
        if ((r27 & 4) == 0) goto L11;
        int width$iv = r14.getWidth();
        int height$iv = r14.getHeight();
        long r3 = IntSize.m7139constructorimpl((((long) width$iv) << 32) | (((long) height$iv) & 4294967295L));
    L13:
        if ((r27 & 8) == 0) goto L15;
        long r5 = IntOffset.Companion.m7112getZeronOccac();
    L17:
        if ((r27 & 16) == 0) goto L19;
        long r7 = r3;
    L21:
        if ((r27 & 32) == 0) goto L23;
        float r9 = 1.0f;
    L25:
        if ((r27 & 64) == 0) goto L27;
        Fill r10 = Fill.INSTANCE;
    L29:
        if ((r27 & 128) == 0) goto L31;
        ColorFilter r11 = null;
    L33:
        if ((r27 & 256) == 0) goto L35;
        int r0 = Companion.m4919getDefaultBlendMode0nO6VwU();
    L36:
        long r18 = r1;
        long r110 = r3;
        long r22 = r5;
        long r29 = r7;
        float r210 = r9;
        DrawStyle r211 = r10;
        ColorFilter r212 = r11;
        r13.mo4818drawImage9jGpkUE(r14, r18, r110, r22, r29, r210, r211, r212, r0);
        return;
    L35:
        r0 = r26;
        goto L36
    L31:
        r11 = r25;
        goto L33
    L27:
        r10 = r24;
        goto L29
    L23:
        r9 = r23;
        goto L25
    L19:
        r7 = r21;
        goto L21
    L15:
        r5 = r19;
        goto L17
    L11:
        r3 = r17;
        goto L13
    L7:
        r1 = r15;
        goto L9
    L39:
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawImage-9jGpkUE");
    }

    /* JADX INFO: renamed from: drawImage-AZ2fEMs$default, reason: not valid java name */
    static /* synthetic */ void m4900drawImageAZ2fEMs$default(DrawScope r13, ImageBitmap r14, long r15, long r17, long r19, long r21, float r23, DrawStyle r24, ColorFilter r25, int r26, int r27, int r28, Object r29) {
        if (r29 != null) goto L43;
        if ((r28 & 2) == 0) goto L7;
        long r1 = IntOffset.Companion.m7112getZeronOccac();
    L9:
        if ((r28 & 4) == 0) goto L11;
        int width$iv = r14.getWidth();
        int height$iv = r14.getHeight();
        long r3 = IntSize.m7139constructorimpl((((long) width$iv) << 32) | (((long) height$iv) & 4294967295L));
    L13:
        if ((r28 & 8) == 0) goto L15;
        long r5 = IntOffset.Companion.m7112getZeronOccac();
    L17:
        if ((r28 & 16) == 0) goto L19;
        long r7 = r3;
    L21:
        if ((r28 & 32) == 0) goto L23;
        float r9 = 1.0f;
    L25:
        if ((r28 & 64) == 0) goto L27;
        Fill r10 = Fill.INSTANCE;
    L29:
        if ((r28 & 128) == 0) goto L31;
        ColorFilter r11 = null;
    L33:
        if ((r28 & 256) == 0) goto L35;
        int r12 = Companion.m4919getDefaultBlendMode0nO6VwU();
    L37:
        if ((r28 & 512) == 0) goto L39;
        int r0 = Companion.m4920getDefaultFilterQualityfv9h1I();
    L40:
        long r18 = r1;
        long r110 = r3;
        long r22 = r5;
        long r210 = r7;
        float r211 = r9;
        DrawStyle r212 = r10;
        ColorFilter r213 = r11;
        int r214 = r12;
        r13.mo4819drawImageAZ2fEMs(r14, r18, r110, r22, r210, r211, r212, r213, r214, r0);
        return;
    L39:
        r0 = r27;
        goto L40
    L35:
        r12 = r26;
        goto L37
    L31:
        r11 = r25;
        goto L33
    L27:
        r10 = r24;
        goto L29
    L23:
        r9 = r23;
        goto L25
    L19:
        r7 = r21;
        goto L21
    L15:
        r5 = r19;
        goto L17
    L11:
        r3 = r17;
        goto L13
    L7:
        r1 = r15;
        goto L9
    L43:
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawImage-AZ2fEMs");
    }

    /* JADX INFO: renamed from: drawImage-AZ2fEMs */
    default void mo4819drawImageAZ2fEMs(ImageBitmap image, long srcOffset, long srcSize, long dstOffset, long dstSize, float alpha, DrawStyle style, ColorFilter colorFilter, int blendMode, int filterQuality) {
        m4900drawImageAZ2fEMs$default(this, image, srcOffset, srcSize, dstOffset, dstSize, alpha, style, colorFilter, blendMode, 0, 512, null);
    }

    /* JADX INFO: renamed from: drawRoundRect-ZuiqVtQ$default, reason: not valid java name */
    static /* synthetic */ void m4912drawRoundRectZuiqVtQ$default(DrawScope r10, Brush r11, long r12, long r14, long r16, float r18, DrawStyle r19, ColorFilter r20, int r21, int r22, Object r23) {
        if (r23 != null) goto L35;
        if ((r22 & 2) == 0) goto L7;
        long r1 = Offset.Companion.m4141getZeroF1C5BW0();
    L9:
        if ((r22 & 4) == 0) goto L11;
        long r3 = r10.m4914offsetSizePENXr5M(r10.mo4917getSizeNHjbRc(), r1);
    L13:
        if ((r22 & 8) == 0) goto L15;
        long r5 = CornerRadius.Companion.m4097getZerokKHJgLs();
    L17:
        if ((r22 & 16) == 0) goto L19;
        float r7 = 1.0f;
    L21:
        if ((r22 & 32) == 0) goto L23;
        Fill r8 = Fill.INSTANCE;
    L25:
        if ((r22 & 64) == 0) goto L27;
        ColorFilter r9 = null;
    L29:
        if ((r22 & 128) == 0) goto L31;
        int r0 = Companion.m4919getDefaultBlendMode0nO6VwU();
    L32:
        long r15 = r1;
        long r17 = r3;
        long r110 = r5;
        float r24 = r7;
        DrawStyle r25 = r8;
        ColorFilter r26 = r9;
        r10.mo4831drawRoundRectZuiqVtQ(r11, r15, r17, r110, r24, r25, r26, r0);
        return;
    L31:
        r0 = r21;
        goto L32
    L27:
        r9 = r20;
        goto L29
    L23:
        r8 = r19;
        goto L25
    L19:
        r7 = r18;
        goto L21
    L15:
        r5 = r16;
        goto L17
    L11:
        r3 = r14;
        goto L13
    L7:
        r1 = r12;
        goto L9
    L35:
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawRoundRect-ZuiqVtQ");
    }

    /* JADX INFO: renamed from: drawRoundRect-u-Aw5IA$default, reason: not valid java name */
    static /* synthetic */ void m4913drawRoundRectuAw5IA$default(DrawScope r16, long r17, long r19, long r21, long r23, DrawStyle r25, float r26, ColorFilter r27, int r28, int r29, Object r30) {
        if (r30 != null) goto L35;
        if ((r29 & 2) == 0) goto L7;
        long r6 = Offset.Companion.m4141getZeroF1C5BW0();
    L9:
        if ((r29 & 4) == 0) goto L11;
        DrawScope r3 = r16;
        long r8 = r3.m4914offsetSizePENXr5M(r16.mo4917getSizeNHjbRc(), r6);
    L13:
        if ((r29 & 8) == 0) goto L15;
        long r10 = CornerRadius.Companion.m4097getZerokKHJgLs();
    L17:
        if ((r29 & 16) == 0) goto L19;
        DrawStyle r12 = Fill.INSTANCE;
    L21:
        if ((r29 & 32) == 0) goto L23;
        float r13 = 1.0f;
    L25:
        if ((r29 & 64) == 0) goto L27;
        ColorFilter r14 = null;
    L29:
        if ((r29 & 128) == 0) goto L31;
        int r15 = Companion.m4919getDefaultBlendMode0nO6VwU();
    L32:
        r3.mo4832drawRoundRectuAw5IA(r17, r6, r8, r10, r12, r13, r14, r15);
        return;
    L31:
        r15 = r28;
        goto L32
    L27:
        r14 = r27;
        goto L29
    L23:
        r13 = r26;
        goto L25
    L19:
        r12 = r25;
        goto L21
    L15:
        r10 = r23;
        goto L17
    L11:
        r3 = r16;
        r8 = r21;
        goto L13
    L7:
        r6 = r19;
        goto L9
    L35:
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawRoundRect-u-Aw5IA");
    }

    /* JADX INFO: renamed from: drawCircle-V9BoPsw$default, reason: not valid java name */
    static /* synthetic */ void m4897drawCircleV9BoPsw$default(DrawScope r7, Brush r8, float r9, long r10, float r12, DrawStyle r13, ColorFilter r14, int r15, int r16, Object r17) {
        if (r17 != null) goto L30;
        if ((r16 & 2) == 0) goto L6;
        float r0 = Size.m4193getMinDimensionimpl(r7.mo4917getSizeNHjbRc()) / 2.0f;
    L8:
        if ((r16 & 4) == 0) goto L10;
        long r1 = r7.mo4916getCenterF1C5BW0();
    L12:
        if ((r16 & 8) == 0) goto L14;
        float r3 = 1.0f;
    L16:
        if ((r16 & 16) == 0) goto L18;
        Fill r4 = Fill.INSTANCE;
    L20:
        if ((r16 & 32) == 0) goto L22;
        ColorFilter r5 = null;
    L24:
        if ((r16 & 64) == 0) goto L26;
        int r6 = Companion.m4919getDefaultBlendMode0nO6VwU();
    L27:
        r7.mo4816drawCircleV9BoPsw(r8, r0, r1, r3, r4, r5, r6);
        return;
    L26:
        r6 = r15;
        goto L27
    L22:
        r5 = r14;
        goto L24
    L18:
        r4 = r13;
        goto L20
    L14:
        r3 = r12;
        goto L16
    L10:
        r1 = r10;
        goto L12
    L6:
        r0 = r9;
        goto L8
    L30:
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawCircle-V9BoPsw");
    }

    /* JADX INFO: renamed from: drawCircle-VaOC9Bg$default, reason: not valid java name */
    static /* synthetic */ void m4898drawCircleVaOC9Bg$default(DrawScope r10, long r11, float r13, long r14, float r16, DrawStyle r17, ColorFilter r18, int r19, int r20, Object r21) {
        if (r21 != null) goto L30;
        if ((r20 & 2) == 0) goto L6;
        float r3 = Size.m4193getMinDimensionimpl(r10.mo4917getSizeNHjbRc()) / 2.0f;
    L8:
        if ((r20 & 4) == 0) goto L10;
        long r4 = r10.mo4916getCenterF1C5BW0();
    L12:
        if ((r20 & 8) == 0) goto L14;
        float r6 = 1.0f;
    L16:
        if ((r20 & 16) == 0) goto L18;
        DrawStyle r7 = Fill.INSTANCE;
    L20:
        if ((r20 & 32) == 0) goto L22;
        ColorFilter r8 = null;
    L24:
        if ((r20 & 64) == 0) goto L26;
        int r9 = Companion.m4919getDefaultBlendMode0nO6VwU();
    L27:
        r10.mo4817drawCircleVaOC9Bg(r11, r3, r4, r6, r7, r8, r9);
        return;
    L26:
        r9 = r19;
        goto L27
    L22:
        r8 = r18;
        goto L24
    L18:
        r7 = r17;
        goto L20
    L14:
        r6 = r16;
        goto L16
    L10:
        r4 = r14;
        goto L12
    L6:
        r3 = r13;
        goto L8
    L30:
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawCircle-VaOC9Bg");
    }

    /* JADX INFO: renamed from: drawOval-AsUm42w$default, reason: not valid java name */
    static /* synthetic */ void m4904drawOvalAsUm42w$default(DrawScope r8, Brush r9, long r10, long r12, float r14, DrawStyle r15, ColorFilter r16, int r17, int r18, Object r19) {
        if (r19 != null) goto L30;
        if ((r18 & 2) == 0) goto L6;
        long r0 = Offset.Companion.m4141getZeroF1C5BW0();
    L8:
        if ((r18 & 4) == 0) goto L10;
        long r2 = r8.m4914offsetSizePENXr5M(r8.mo4917getSizeNHjbRc(), r0);
    L12:
        if ((r18 & 8) == 0) goto L14;
        float r4 = 1.0f;
    L16:
        if ((r18 & 16) == 0) goto L18;
        Fill r5 = Fill.INSTANCE;
    L20:
        if ((r18 & 32) == 0) goto L22;
        ColorFilter r6 = null;
    L24:
        if ((r18 & 64) == 0) goto L26;
        int r7 = Companion.m4919getDefaultBlendMode0nO6VwU();
    L27:
        r8.mo4823drawOvalAsUm42w(r9, r0, r2, r4, r5, r6, r7);
        return;
    L26:
        r7 = r17;
        goto L27
    L22:
        r6 = r16;
        goto L24
    L18:
        r5 = r15;
        goto L20
    L14:
        r4 = r14;
        goto L16
    L10:
        r2 = r12;
        goto L12
    L6:
        r0 = r10;
        goto L8
    L30:
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawOval-AsUm42w");
    }

    /* JADX INFO: renamed from: drawOval-n-J9OG0$default, reason: not valid java name */
    static /* synthetic */ void m4905drawOvalnJ9OG0$default(DrawScope r13, long r14, long r16, long r18, float r20, DrawStyle r21, ColorFilter r22, int r23, int r24, Object r25) {
        if (r25 != null) goto L30;
        if ((r24 & 2) == 0) goto L6;
        long r5 = Offset.Companion.m4141getZeroF1C5BW0();
    L8:
        if ((r24 & 4) == 0) goto L10;
        long r7 = r13.m4914offsetSizePENXr5M(r13.mo4917getSizeNHjbRc(), r5);
    L12:
        if ((r24 & 8) == 0) goto L14;
        float r9 = 1.0f;
    L16:
        if ((r24 & 16) == 0) goto L18;
        DrawStyle r10 = Fill.INSTANCE;
    L20:
        if ((r24 & 32) == 0) goto L22;
        ColorFilter r11 = null;
    L24:
        if ((r24 & 64) == 0) goto L26;
        int r12 = Companion.m4919getDefaultBlendMode0nO6VwU();
    L27:
        r13.mo4824drawOvalnJ9OG0(r14, r5, r7, r9, r10, r11, r12);
        return;
    L26:
        r12 = r23;
        goto L27
    L22:
        r11 = r22;
        goto L24
    L18:
        r10 = r21;
        goto L20
    L14:
        r9 = r20;
        goto L16
    L10:
        r7 = r18;
        goto L12
    L6:
        r5 = r16;
        goto L8
    L30:
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawOval-n-J9OG0");
    }

    /* JADX INFO: renamed from: drawArc-illE91I$default, reason: not valid java name */
    static /* synthetic */ void m4895drawArcillE91I$default(DrawScope r16, Brush r17, float r18, float r19, boolean r20, long r21, long r23, float r25, DrawStyle r26, ColorFilter r27, int r28, int r29, Object r30) {
        if (r30 != null) goto L31;
        if ((r29 & 16) == 0) goto L7;
        long r8 = Offset.Companion.m4141getZeroF1C5BW0();
    L9:
        if ((r29 & 32) == 0) goto L11;
        DrawScope r3 = r16;
        long r10 = r3.m4914offsetSizePENXr5M(r16.mo4917getSizeNHjbRc(), r8);
    L13:
        if ((r29 & 64) == 0) goto L15;
        float r12 = 1.0f;
    L17:
        if ((r29 & 128) == 0) goto L19;
        DrawStyle r13 = Fill.INSTANCE;
    L21:
        if ((r29 & 256) == 0) goto L23;
        ColorFilter r14 = null;
    L25:
        if ((r29 & 512) == 0) goto L27;
        int r15 = Companion.m4919getDefaultBlendMode0nO6VwU();
    L28:
        r3.mo4814drawArcillE91I(r17, r18, r19, r20, r8, r10, r12, r13, r14, r15);
        return;
    L27:
        r15 = r28;
        goto L28
    L23:
        r14 = r27;
        goto L25
    L19:
        r13 = r26;
        goto L21
    L15:
        r12 = r25;
        goto L17
    L11:
        r3 = r16;
        r10 = r23;
        goto L13
    L7:
        r8 = r21;
        goto L9
    L31:
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawArc-illE91I");
    }

    /* JADX INFO: renamed from: drawArc-yD3GUKo$default, reason: not valid java name */
    static /* synthetic */ void m4896drawArcyD3GUKo$default(DrawScope r17, long r18, float r20, float r21, boolean r22, long r23, long r25, float r27, DrawStyle r28, ColorFilter r29, int r30, int r31, Object r32) {
        if (r32 != null) goto L31;
        if ((r31 & 16) == 0) goto L7;
        long r9 = Offset.Companion.m4141getZeroF1C5BW0();
    L9:
        if ((r31 & 32) == 0) goto L11;
        DrawScope r3 = r17;
        long r11 = r3.m4914offsetSizePENXr5M(r17.mo4917getSizeNHjbRc(), r9);
    L13:
        if ((r31 & 64) == 0) goto L15;
        float r13 = 1.0f;
    L17:
        if ((r31 & 128) == 0) goto L19;
        DrawStyle r14 = Fill.INSTANCE;
    L21:
        if ((r31 & 256) == 0) goto L23;
        ColorFilter r15 = null;
    L25:
        if ((r31 & 512) == 0) goto L27;
        int r16 = Companion.m4919getDefaultBlendMode0nO6VwU();
    L28:
        r3.mo4815drawArcyD3GUKo(r18, r20, r21, r22, r9, r11, r13, r14, r15, r16);
        return;
    L27:
        r16 = r30;
        goto L28
    L23:
        r15 = r29;
        goto L25
    L19:
        r14 = r28;
        goto L21
    L15:
        r13 = r27;
        goto L17
    L11:
        r3 = r17;
        r11 = r25;
        goto L13
    L7:
        r9 = r23;
        goto L9
    L31:
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawArc-yD3GUKo");
    }

    /* JADX INFO: renamed from: drawPath-LG529CI$default, reason: not valid java name */
    static /* synthetic */ void m4907drawPathLG529CI$default(DrawScope r8, Path r9, long r10, float r12, DrawStyle r13, ColorFilter r14, int r15, int r16, Object r17) {
        if (r17 != null) goto L22;
        if ((r16 & 4) == 0) goto L6;
        float r4 = 1.0f;
    L8:
        if ((r16 & 8) == 0) goto L10;
        DrawStyle r5 = Fill.INSTANCE;
    L12:
        if ((r16 & 16) == 0) goto L14;
        ColorFilter r6 = null;
    L16:
        if ((r16 & 32) == 0) goto L18;
        int r7 = Companion.m4919getDefaultBlendMode0nO6VwU();
    L19:
        r8.mo4826drawPathLG529CI(r9, r10, r4, r5, r6, r7);
        return;
    L18:
        r7 = r15;
        goto L19
    L14:
        r6 = r14;
        goto L16
    L10:
        r5 = r13;
        goto L12
    L6:
        r4 = r12;
        goto L8
    L22:
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawPath-LG529CI");
    }

    /* JADX INFO: renamed from: drawPath-GBMwjPU$default, reason: not valid java name */
    static /* synthetic */ void m4906drawPathGBMwjPU$default(DrawScope r7, Path r8, Brush r9, float r10, DrawStyle r11, ColorFilter r12, int r13, int r14, Object r15) {
        if (r15 != null) goto L22;
        if ((r14 & 4) == 0) goto L6;
        float r3 = 1.0f;
    L8:
        if ((r14 & 8) == 0) goto L10;
        DrawStyle r4 = Fill.INSTANCE;
    L12:
        if ((r14 & 16) == 0) goto L14;
        ColorFilter r5 = null;
    L16:
        if ((r14 & 32) == 0) goto L18;
        int r6 = Companion.m4919getDefaultBlendMode0nO6VwU();
    L19:
        r7.mo4825drawPathGBMwjPU(r8, r9, r3, r4, r5, r6);
        return;
    L18:
        r6 = r13;
        goto L19
    L14:
        r5 = r12;
        goto L16
    L10:
        r4 = r11;
        goto L12
    L6:
        r3 = r10;
        goto L8
    L22:
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawPath-GBMwjPU");
    }

    /* JADX INFO: renamed from: drawPoints-F8ZwMP8$default, reason: not valid java name */
    static /* synthetic */ void m4908drawPointsF8ZwMP8$default(DrawScope r13, List r14, int r15, long r16, float r18, int r19, PathEffect r20, float r21, ColorFilter r22, int r23, int r24, Object r25) {
        if (r25 != null) goto L31;
        if ((r24 & 8) == 0) goto L7;
        float r7 = 0.0f;
    L9:
        if ((r24 & 16) == 0) goto L11;
        int r8 = StrokeCap.Companion.m4719getButtKaPHkGw();
    L13:
        if ((r24 & 32) == 0) goto L15;
        PathEffect r9 = null;
    L17:
        if ((r24 & 64) == 0) goto L19;
        float r10 = 1.0f;
    L21:
        if ((r24 & 128) == 0) goto L23;
        ColorFilter r11 = null;
    L25:
        if ((r24 & 256) == 0) goto L27;
        int r12 = Companion.m4919getDefaultBlendMode0nO6VwU();
    L28:
        r13.mo4827drawPointsF8ZwMP8(r14, r15, r16, r7, r8, r9, r10, r11, r12);
        return;
    L27:
        r12 = r23;
        goto L28
    L23:
        r11 = r22;
        goto L25
    L19:
        r10 = r21;
        goto L21
    L15:
        r9 = r20;
        goto L17
    L11:
        r8 = r19;
        goto L13
    L7:
        r7 = r18;
        goto L9
    L31:
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawPoints-F8ZwMP8");
    }

    /* JADX INFO: renamed from: drawPoints-Gsft0Ws$default, reason: not valid java name */
    static /* synthetic */ void m4909drawPointsGsft0Ws$default(DrawScope r12, List r13, int r14, Brush r15, float r16, int r17, PathEffect r18, float r19, ColorFilter r20, int r21, int r22, Object r23) {
        if (r23 != null) goto L31;
        if ((r22 & 8) == 0) goto L7;
        float r6 = 0.0f;
    L9:
        if ((r22 & 16) == 0) goto L11;
        int r7 = StrokeCap.Companion.m4719getButtKaPHkGw();
    L13:
        if ((r22 & 32) == 0) goto L15;
        PathEffect r8 = null;
    L17:
        if ((r22 & 64) == 0) goto L19;
        float r9 = 1.0f;
    L21:
        if ((r22 & 128) == 0) goto L23;
        ColorFilter r10 = null;
    L25:
        if ((r22 & 256) == 0) goto L27;
        int r11 = Companion.m4919getDefaultBlendMode0nO6VwU();
    L28:
        r12.mo4828drawPointsGsft0Ws(r13, r14, r15, r6, r7, r8, r9, r10, r11);
        return;
    L27:
        r11 = r21;
        goto L28
    L23:
        r10 = r20;
        goto L25
    L19:
        r9 = r19;
        goto L21
    L15:
        r8 = r18;
        goto L17
    L11:
        r7 = r17;
        goto L13
    L7:
        r6 = r16;
        goto L9
    L31:
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawPoints-Gsft0Ws");
    }

    /* JADX INFO: renamed from: record-JVtK1S4$default, reason: not valid java name */
    static /* synthetic */ void m4915recordJVtK1S4$default(DrawScope r0, GraphicsLayer r1, long r2, Function1 r4, int r5, Object r6) {
        if (r6 != null) goto L9;
        if ((r5 & 1) == 0) goto L6;
        r2 = IntSizeKt.m7155toIntSizeuvyYCjk(r0.mo4917getSizeNHjbRc());
    L6:
        r0.mo4918recordJVtK1S4(r1, r2, r4);
        return;
    L9:
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: record-JVtK1S4");
    }

    /* JADX INFO: renamed from: record-JVtK1S4, reason: not valid java name */
    default void mo4918recordJVtK1S4(GraphicsLayer $this$record_u2dJVtK1S4, long size, final Function1<? super DrawScope, Unit> r10) {
        $this$record_u2dJVtK1S4.m5011recordmLhObY(this, getLayoutDirection(), size, new DrawScope$record$1(this, r10));
    }

    /* JADX INFO: renamed from: offsetSize-PENXr5M, reason: not valid java name */
    private default long m4914offsetSizePENXr5M(long $this$offsetSize_u2dPENXr5M, long offset) {
        int bits$iv$iv$iv = (int) ($this$offsetSize_u2dPENXr5M >> 32);
        int bits$iv$iv$iv2 = (int) (offset >> 32);
        float width$iv = Float.intBitsToFloat(bits$iv$iv$iv) - Float.intBitsToFloat(bits$iv$iv$iv2);
        int bits$iv$iv$iv3 = (int) ($this$offsetSize_u2dPENXr5M & 4294967295L);
        int bits$iv$iv$iv4 = (int) (offset & 4294967295L);
        float height$iv = Float.intBitsToFloat(bits$iv$iv$iv3) - Float.intBitsToFloat(bits$iv$iv$iv4);
        long v1$iv$iv = Float.floatToRawIntBits(width$iv);
        long v2$iv$iv = Float.floatToRawIntBits(height$iv);
        return Size.m4185constructorimpl((v1$iv$iv << 32) | (4294967295L & v2$iv$iv));
    }
}
