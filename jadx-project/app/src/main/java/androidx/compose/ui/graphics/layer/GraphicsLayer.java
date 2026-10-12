package androidx.compose.ui.graphics.layer;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Outline;
import android.graphics.RectF;
import android.os.Build;
import androidx.collection.MutableScatterSet;
import androidx.collection.ScatterSetKt;
import androidx.compose.ui.geometry.CornerRadius;
import androidx.compose.ui.geometry.InlineClassHelperKt;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.RoundRectKt;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.AndroidCanvas_androidKt;
import androidx.compose.ui.graphics.AndroidImageBitmap_androidKt;
import androidx.compose.ui.graphics.AndroidPaint_androidKt;
import androidx.compose.ui.graphics.AndroidPath;
import androidx.compose.ui.graphics.AndroidPath_androidKt;
import androidx.compose.ui.graphics.BlendMode;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.ImageBitmap;
import androidx.compose.ui.graphics.Paint;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.RenderEffect;
import androidx.compose.ui.graphics.drawscope.CanvasDrawScope;
import androidx.compose.ui.graphics.drawscope.DrawContext;
import androidx.compose.ui.graphics.drawscope.DrawContextKt;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.IntSizeKt;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: AndroidGraphicsLayer.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000è\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 ½\u00012\u00020\u0001:\u0002½\u0001B\u0019\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\u0012\u0010\u008a\u0001\u001a\u00020,2\u0007\u0010\u008b\u0001\u001a\u00020\u0000H\u0002J\t\u0010\u008c\u0001\u001a\u00020,H\u0002J\t\u0010\u008d\u0001\u001a\u00020,H\u0002J\u000f\u0010\u008e\u0001\u001a\u00020,H\u0000¢\u0006\u0003\b\u008f\u0001J$\u0010\u0090\u0001\u001a\u00020,2\b\u0010\u0091\u0001\u001a\u00030\u0092\u00012\t\u0010\u0093\u0001\u001a\u0004\u0018\u00010\u0000H\u0000¢\u0006\u0003\b\u0094\u0001J\u0019\u0010\u0095\u0001\u001a\u00020,2\b\u0010\u0091\u0001\u001a\u00030\u0092\u0001H\u0000¢\u0006\u0003\b\u0096\u0001J\u000f\u0010\u0097\u0001\u001a\u00020,H\u0001¢\u0006\u0003\b\u0098\u0001J\t\u0010\u0099\u0001\u001a\u00020\u0015H\u0002J\t\u0010\u009a\u0001\u001a\u00020QH\u0002J\t\u0010\u009b\u0001\u001a\u00020,H\u0002J\t\u0010\u009c\u0001\u001a\u00020,H\u0002JE\u0010\u009d\u0001\u001a\u00020,2\u0006\u00108\u001a\u0002092\u0006\u0010D\u001a\u00020E2\u0006\u0010u\u001a\u00020t2\u0018\u0010\u009e\u0001\u001a\u0013\u0012\u0004\u0012\u00020+\u0012\u0004\u0012\u00020,0*¢\u0006\u0002\b-ø\u0001\u0000¢\u0006\u0006\b\u009f\u0001\u0010 \u0001J\t\u0010¡\u0001\u001a\u00020,H\u0002J\t\u0010¢\u0001\u001a\u00020,H\u0002J\u000f\u0010£\u0001\u001a\u00020,H\u0000¢\u0006\u0003\b¤\u0001J\t\u0010¥\u0001\u001a\u00020,H\u0002J5\u0010¦\u0001\u001a\u0003H§\u0001\"\u0005\b\u0000\u0010§\u00012\u001b\u0010\u009e\u0001\u001a\u0016\u0012\u0004\u0012\u00020R\u0012\u0004\u0012\u00020i\u0012\u0005\u0012\u0003H§\u00010¨\u0001H\u0082\b¢\u0006\u0003\u0010©\u0001J\u0010\u0010ª\u0001\u001a\u00020,2\u0007\u0010«\u0001\u001a\u00020KJ&\u0010¬\u0001\u001a\u00020,2\u0007\u0010\u0080\u0001\u001a\u00020\u007f2\u0006\u0010u\u001a\u00020tH\u0002ø\u0001\u0000¢\u0006\u0006\b\u00ad\u0001\u0010®\u0001J(\u0010¯\u0001\u001a\u00020,2\t\b\u0002\u0010\u0080\u0001\u001a\u00020R2\b\b\u0002\u0010u\u001a\u00020iø\u0001\u0000¢\u0006\u0006\b°\u0001\u0010®\u0001J3\u0010±\u0001\u001a\u00020,2\t\b\u0002\u0010\u0080\u0001\u001a\u00020R2\b\b\u0002\u0010u\u001a\u00020i2\t\b\u0002\u0010²\u0001\u001a\u00020\bø\u0001\u0000¢\u0006\u0006\b³\u0001\u0010´\u0001J\u0011\u0010µ\u0001\u001a\u00030¶\u0001H\u0086@¢\u0006\u0003\u0010·\u0001J\u0013\u0010¸\u0001\u001a\u00020,2\b\u0010¹\u0001\u001a\u00030º\u0001H\u0002J\u0014\u0010»\u0001\u001a\u0004\u0018\u00010\u00152\u0007\u0010«\u0001\u001a\u00020KH\u0002J\r\u0010¼\u0001\u001a\u00020,*\u00020+H\u0002R$\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\b8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR*\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0007\u001a\u00020\u000e8F@FX\u0086\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0015X\u0082\u000e¢\u0006\u0002\n\u0000R*\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0007\u001a\u00020\u00168F@FX\u0086\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\f\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR$\u0010\u001c\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\b8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u001d\u0010\u000b\"\u0004\b\u001e\u0010\rR\u000e\u0010\u001f\u001a\u00020 X\u0082\u0004¢\u0006\u0002\n\u0000R,\u0010\"\u001a\u00020!2\u0006\u0010\u0007\u001a\u00020!8F@FX\u0086\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b#\u0010$\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R\u001f\u0010)\u001a\u0013\u0012\u0004\u0012\u00020+\u0012\u0004\u0012\u00020,0*¢\u0006\u0002\b-X\u0082\u0004¢\u0006\u0002\n\u0000R(\u0010/\u001a\u0004\u0018\u00010.2\b\u0010\u0007\u001a\u0004\u0018\u00010.8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b0\u00101\"\u0004\b2\u00103R*\u00105\u001a\u0002042\u0006\u0010\u0007\u001a\u0002048F@FX\u0086\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\f\u001a\u0004\b6\u0010\u0019\"\u0004\b7\u0010\u001bR\u000e\u00108\u001a\u000209X\u0082\u000e¢\u0006\u0002\n\u0000R\u001f\u0010:\u001a\u0013\u0012\u0004\u0012\u00020+\u0012\u0004\u0012\u00020,0*¢\u0006\u0002\b-X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0002\u001a\u00020\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b;\u0010<R\u0010\u0010=\u001a\u0004\u0018\u00010>X\u0082\u000e¢\u0006\u0002\n\u0000R\u001e\u0010@\u001a\u00020!2\u0006\u0010?\u001a\u00020!@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b@\u0010&R\u0011\u0010A\u001a\u00020B8F¢\u0006\u0006\u001a\u0004\bC\u0010\u0011R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010D\u001a\u00020EX\u0082\u000e¢\u0006\u0002\n\u0000R\u0011\u0010F\u001a\u00020>8F¢\u0006\u0006\u001a\u0004\bG\u0010HR\u000e\u0010I\u001a\u00020!X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010J\u001a\u0004\u0018\u00010KX\u0082\u000e¢\u0006\u0002\n\u0000R\u0011\u0010L\u001a\u00020B8F¢\u0006\u0006\u001a\u0004\bM\u0010\u0011R\u000e\u0010N\u001a\u00020OX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010P\u001a\u0004\u0018\u00010QX\u0082\u000e¢\u0006\u0002\n\u0000R,\u0010S\u001a\u00020R2\u0006\u0010\u0007\u001a\u00020R@FX\u0086\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0010\n\u0002\u0010V\u001a\u0004\bT\u0010\u0011\"\u0004\bU\u0010\u0013R(\u0010X\u001a\u0004\u0018\u00010W2\b\u0010\u0007\u001a\u0004\u0018\u00010W8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bY\u0010Z\"\u0004\b[\u0010\\R$\u0010]\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\b8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b^\u0010\u000b\"\u0004\b_\u0010\rR$\u0010`\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\b8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\ba\u0010\u000b\"\u0004\bb\u0010\rR$\u0010c\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\b8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bd\u0010\u000b\"\u0004\be\u0010\rR\u0010\u0010f\u001a\u0004\u0018\u00010KX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010g\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u0010h\u001a\u00020iX\u0082\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\n\u0002\u0010VR\u0016\u0010j\u001a\u00020RX\u0082\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\n\u0002\u0010VR$\u0010k\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\b8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bl\u0010\u000b\"\u0004\bm\u0010\rR$\u0010n\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\b8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bo\u0010\u000b\"\u0004\bp\u0010\rR$\u0010q\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\b8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\br\u0010\u000b\"\u0004\bs\u0010\rR,\u0010u\u001a\u00020t2\u0006\u0010\u0007\u001a\u00020t@BX\u0086\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0010\n\u0002\u0010V\u001a\u0004\bv\u0010\u0011\"\u0004\bw\u0010\u0013R\u0010\u0010x\u001a\u0004\u0018\u00010yX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010z\u001a\u0004\u0018\u00010{X\u0082\u000e¢\u0006\u0002\n\u0000R*\u0010|\u001a\u00020\u000e2\u0006\u0010\u0007\u001a\u00020\u000e8F@FX\u0086\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\f\u001a\u0004\b}\u0010\u0011\"\u0004\b~\u0010\u0013R/\u0010\u0080\u0001\u001a\u00020\u007f2\u0006\u0010\u0007\u001a\u00020\u007f@FX\u0086\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0002\u0010V\u001a\u0005\b\u0081\u0001\u0010\u0011\"\u0005\b\u0082\u0001\u0010\u0013R'\u0010\u0083\u0001\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\b8F@FX\u0086\u000e¢\u0006\u000e\u001a\u0005\b\u0084\u0001\u0010\u000b\"\u0005\b\u0085\u0001\u0010\rR'\u0010\u0086\u0001\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\b8F@FX\u0086\u000e¢\u0006\u000e\u001a\u0005\b\u0087\u0001\u0010\u000b\"\u0005\b\u0088\u0001\u0010\rR\u000f\u0010\u0089\u0001\u001a\u00020!X\u0082\u000e¢\u0006\u0002\n\u0000\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006¾\u0001"}, d2 = {"Landroidx/compose/ui/graphics/layer/GraphicsLayer;", "", "impl", "Landroidx/compose/ui/graphics/layer/GraphicsLayerImpl;", "layerManager", "Landroidx/compose/ui/graphics/layer/LayerManager;", "(Landroidx/compose/ui/graphics/layer/GraphicsLayerImpl;Landroidx/compose/ui/graphics/layer/LayerManager;)V", "value", "", "alpha", "getAlpha", "()F", "setAlpha", "(F)V", "Landroidx/compose/ui/graphics/Color;", "ambientShadowColor", "getAmbientShadowColor-0d7_KjU", "()J", "setAmbientShadowColor-8_81llA", "(J)V", "androidOutline", "Landroid/graphics/Outline;", "Landroidx/compose/ui/graphics/BlendMode;", "blendMode", "getBlendMode-0nO6VwU", "()I", "setBlendMode-s9anfk8", "(I)V", "cameraDistance", "getCameraDistance", "setCameraDistance", "childDependenciesTracker", "Landroidx/compose/ui/graphics/layer/ChildLayerDependenciesTracker;", "", "clip", "getClip$annotations", "()V", "getClip", "()Z", "setClip", "(Z)V", "clipDrawBlock", "Lkotlin/Function1;", "Landroidx/compose/ui/graphics/drawscope/DrawScope;", "", "Lkotlin/ExtensionFunctionType;", "Landroidx/compose/ui/graphics/ColorFilter;", "colorFilter", "getColorFilter", "()Landroidx/compose/ui/graphics/ColorFilter;", "setColorFilter", "(Landroidx/compose/ui/graphics/ColorFilter;)V", "Landroidx/compose/ui/graphics/layer/CompositingStrategy;", "compositingStrategy", "getCompositingStrategy-ke2Ky5w", "setCompositingStrategy-Wpw9cng", "density", "Landroidx/compose/ui/unit/Density;", "drawBlock", "getImpl$ui_graphics_release", "()Landroidx/compose/ui/graphics/layer/GraphicsLayerImpl;", "internalOutline", "Landroidx/compose/ui/graphics/Outline;", "<set-?>", "isReleased", "layerId", "", "getLayerId", "layoutDirection", "Landroidx/compose/ui/unit/LayoutDirection;", "outline", "getOutline", "()Landroidx/compose/ui/graphics/Outline;", "outlineDirty", "outlinePath", "Landroidx/compose/ui/graphics/Path;", "ownerViewId", "getOwnerViewId", "parentLayerUsages", "", "pathBounds", "Landroid/graphics/RectF;", "Landroidx/compose/ui/geometry/Offset;", "pivotOffset", "getPivotOffset-F1C5BW0", "setPivotOffset-k-4lQ0M", "J", "Landroidx/compose/ui/graphics/RenderEffect;", "renderEffect", "getRenderEffect", "()Landroidx/compose/ui/graphics/RenderEffect;", "setRenderEffect", "(Landroidx/compose/ui/graphics/RenderEffect;)V", "rotationX", "getRotationX", "setRotationX", "rotationY", "getRotationY", "setRotationY", "rotationZ", "getRotationZ", "setRotationZ", "roundRectClipPath", "roundRectCornerRadius", "roundRectOutlineSize", "Landroidx/compose/ui/geometry/Size;", "roundRectOutlineTopLeft", "scaleX", "getScaleX", "setScaleX", "scaleY", "getScaleY", "setScaleY", "shadowElevation", "getShadowElevation", "setShadowElevation", "Landroidx/compose/ui/unit/IntSize;", "size", "getSize-YbymL2g", "setSize-ozmzZPI", "softwareDrawScope", "Landroidx/compose/ui/graphics/drawscope/CanvasDrawScope;", "softwareLayerPaint", "Landroidx/compose/ui/graphics/Paint;", "spotShadowColor", "getSpotShadowColor-0d7_KjU", "setSpotShadowColor-8_81llA", "Landroidx/compose/ui/unit/IntOffset;", "topLeft", "getTopLeft-nOcc-ac", "setTopLeft--gyyYBs", "translationX", "getTranslationX", "setTranslationX", "translationY", "getTranslationY", "setTranslationY", "usePathForClip", "addSubLayer", "graphicsLayer", "configureOutlineAndClip", "discardContentIfReleasedAndHaveNoParentLayerUsages", "discardDisplayList", "discardDisplayList$ui_graphics_release", "draw", "canvas", "Landroidx/compose/ui/graphics/Canvas;", "parentLayer", "draw$ui_graphics_release", "drawForPersistence", "drawForPersistence$ui_graphics_release", "emulateTrimMemory", "emulateTrimMemory$ui_graphics_release", "obtainAndroidOutline", "obtainPathBounds", "onAddedToParentLayer", "onRemovedFromParentLayer", "record", "block", "record-mL-hObY", "(Landroidx/compose/ui/unit/Density;Landroidx/compose/ui/unit/LayoutDirection;JLkotlin/jvm/functions/Function1;)V", "recordInternal", "recreateDisplayListIfNeeded", "release", "release$ui_graphics_release", "resetOutlineParams", "resolveOutlinePosition", "T", "Lkotlin/Function2;", "(Lkotlin/jvm/functions/Function2;)Ljava/lang/Object;", "setPathOutline", "path", "setPosition", "setPosition-VbeCjmY", "(JJ)V", "setRectOutline", "setRectOutline-tz77jQw", "setRoundRectOutline", "cornerRadius", "setRoundRectOutline-TNW_H78", "(JJF)V", "toImageBitmap", "Landroidx/compose/ui/graphics/ImageBitmap;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "transformCanvas", "androidCanvas", "Landroid/graphics/Canvas;", "updatePathOutline", "drawWithChildTracking", "Companion", "ui-graphics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class GraphicsLayer {
    public static final Companion Companion = null;
    private static final LayerSnapshotImpl SnapshotImpl = null;
    private Outline androidOutline;
    private final ChildLayerDependenciesTracker childDependenciesTracker;
    private boolean clip;
    private final Function1<DrawScope, Unit> clipDrawBlock;
    private Density density;
    private Function1<? super DrawScope, Unit> drawBlock;
    private final GraphicsLayerImpl impl;
    private androidx.compose.ui.graphics.Outline internalOutline;
    private boolean isReleased;
    private final LayerManager layerManager;
    private LayoutDirection layoutDirection;
    private boolean outlineDirty;
    private Path outlinePath;
    private int parentLayerUsages;
    private RectF pathBounds;
    private long pivotOffset;
    private Path roundRectClipPath;
    private float roundRectCornerRadius;
    private long roundRectOutlineSize;
    private long roundRectOutlineTopLeft;
    private long size;
    private CanvasDrawScope softwareDrawScope;
    private Paint softwareLayerPaint;
    private long topLeft;
    private boolean usePathForClip;

    /* JADX INFO: compiled from: AndroidGraphicsLayer.android.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Landroidx/compose/ui/graphics/layer/GraphicsLayer$Companion;", "", "()V", "SnapshotImpl", "Landroidx/compose/ui/graphics/layer/LayerSnapshotImpl;", "ui-graphics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker r1) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX INFO: renamed from: androidx.compose.ui.graphics.layer.GraphicsLayer$toImageBitmap$1, reason: invalid class name */
    /* JADX INFO: compiled from: AndroidGraphicsLayer.android.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "androidx.compose.ui.graphics.layer.GraphicsLayer", f = "AndroidGraphicsLayer.android.kt", i = {}, l = {878}, m = "toImageBitmap", n = {}, s = {})
    static final class AnonymousClass1 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ GraphicsLayer this$0;

        AnonymousClass1(GraphicsLayer r1, Continuation<? super AnonymousClass1> r2) {
            this.this$0 = r1;
            super(r2);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object r3) {
            this.result = r3;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.toImageBitmap(this);
        }
    }

    public static /* synthetic */ void getClip$annotations() {
    }

    public GraphicsLayer(GraphicsLayerImpl impl, LayerManager layerManager) {
        this.impl = impl;
        this.layerManager = layerManager;
        this.density = DrawContextKt.getDefaultDensity();
        this.layoutDirection = LayoutDirection.Ltr;
        this.drawBlock = GraphicsLayer$drawBlock$1.INSTANCE;
        this.clipDrawBlock = new GraphicsLayer$clipDrawBlock$1(this);
        this.outlineDirty = true;
        this.roundRectOutlineTopLeft = Offset.Companion.m4141getZeroF1C5BW0();
        this.roundRectOutlineSize = Size.Companion.m4202getUnspecifiedNHjbRc();
        this.childDependenciesTracker = new ChildLayerDependenciesTracker();
        this.impl.setClip(false);
        this.topLeft = IntOffset.Companion.m7112getZeronOccac();
        this.size = IntSize.Companion.m7149getZeroYbymL2g();
        this.pivotOffset = Offset.Companion.m4140getUnspecifiedF1C5BW0();
    }

    public static final /* synthetic */ void access$drawWithChildTracking(GraphicsLayer $this, DrawScope $receiver) {
        $this.drawWithChildTracking($receiver);
    }

    public static final /* synthetic */ Path access$getOutlinePath$p(GraphicsLayer $this) {
        return $this.outlinePath;
    }

    public static final /* synthetic */ boolean access$getUsePathForClip$p(GraphicsLayer $this) {
        return $this.usePathForClip;
    }

    public final GraphicsLayerImpl getImpl$ui_graphics_release() {
        return this.impl;
    }

    public final boolean isReleased() {
        return this.isReleased;
    }

    /* JADX INFO: renamed from: getCompositingStrategy-ke2Ky5w, reason: not valid java name */
    public final int m5006getCompositingStrategyke2Ky5w() {
        return this.impl.mo5022getCompositingStrategyke2Ky5w();
    }

    /* JADX INFO: renamed from: setCompositingStrategy-Wpw9cng, reason: not valid java name */
    public final void m5014setCompositingStrategyWpw9cng(int value) {
        if (CompositingStrategy.m4993equalsimpl0(this.impl.mo5022getCompositingStrategyke2Ky5w(), value) == true) goto L6;
        this.impl.mo5027setCompositingStrategyWpw9cng(value);
        return;
    }

    /* JADX INFO: renamed from: getTopLeft-nOcc-ac, reason: not valid java name */
    public final long m5010getTopLeftnOccac() {
        return this.topLeft;
    }

    /* JADX INFO: renamed from: setTopLeft--gyyYBs, reason: not valid java name */
    public final void m5019setTopLeftgyyYBs(long value) {
        if (IntOffset.m7100equalsimpl0(this.topLeft, value) == true) goto L6;
        this.topLeft = value;
        m5000setPositionVbeCjmY(value, this.size);
        return;
    }

    /* JADX INFO: renamed from: getSize-YbymL2g, reason: not valid java name */
    public final long m5008getSizeYbymL2g() {
        return this.size;
    }

    /* JADX INFO: renamed from: setSize-ozmzZPI, reason: not valid java name */
    private final void m5003setSizeozmzZPI(long value) {
        if (IntSize.m7142equalsimpl0(this.size, value) == true) goto L11;
        this.size = value;
        m5000setPositionVbeCjmY(this.topLeft, value);
        long $this$isUnspecified$iv = this.roundRectOutlineSize;
        if ($this$isUnspecified$iv != InlineClassHelperKt.UnspecifiedPackedFloats) goto L7;
        boolean r3 = true;
    L8:
        if (r3 == false) goto L12;
        this.outlineDirty = true;
        configureOutlineAndClip();
        return;
    L12:
        return;
    L7:
        r3 = false;
        goto L8
    }

    public final float getAlpha() {
        return this.impl.getAlpha();
    }

    public final void setAlpha(float value) {
        if (this.impl.getAlpha() != value) goto L5;
        boolean r0 = true;
    L6:
        if (r0 == true) goto L9;
        this.impl.setAlpha(value);
        return;
    L9:
        return;
    L5:
        r0 = false;
        goto L6
    }

    /* JADX INFO: renamed from: getBlendMode-0nO6VwU, reason: not valid java name */
    public final int m5005getBlendMode0nO6VwU() {
        return this.impl.mo5021getBlendMode0nO6VwU();
    }

    /* JADX INFO: renamed from: setBlendMode-s9anfk8, reason: not valid java name */
    public final void m5013setBlendModes9anfk8(int value) {
        if (BlendMode.m4277equalsimpl0(this.impl.mo5021getBlendMode0nO6VwU(), value) == true) goto L6;
        this.impl.mo5026setBlendModes9anfk8(value);
        return;
    }

    public final ColorFilter getColorFilter() {
        return this.impl.getColorFilter();
    }

    public final void setColorFilter(ColorFilter value) {
        if (Intrinsics.areEqual(this.impl.getColorFilter(), value) == true) goto L6;
        this.impl.setColorFilter(value);
        return;
    }

    /* JADX INFO: renamed from: getPivotOffset-F1C5BW0, reason: not valid java name */
    public final long m5007getPivotOffsetF1C5BW0() {
        return this.pivotOffset;
    }

    /* JADX INFO: renamed from: setPivotOffset-k-4lQ0M, reason: not valid java name */
    public final void m5015setPivotOffsetk4lQ0M(long value) {
        if (Offset.m4122equalsimpl0(this.pivotOffset, value) == true) goto L6;
        this.pivotOffset = value;
        this.impl.mo5029setPivotOffsetk4lQ0M(value);
        return;
    }

    public final float getScaleX() {
        return this.impl.getScaleX();
    }

    public final void setScaleX(float value) {
        if (this.impl.getScaleX() != value) goto L5;
        boolean r0 = true;
    L6:
        if (r0 == true) goto L9;
        this.impl.setScaleX(value);
        return;
    L9:
        return;
    L5:
        r0 = false;
        goto L6
    }

    public final float getScaleY() {
        return this.impl.getScaleY();
    }

    public final void setScaleY(float value) {
        if (this.impl.getScaleY() != value) goto L5;
        boolean r0 = true;
    L6:
        if (r0 == true) goto L9;
        this.impl.setScaleY(value);
        return;
    L9:
        return;
    L5:
        r0 = false;
        goto L6
    }

    public final float getTranslationX() {
        return this.impl.getTranslationX();
    }

    public final void setTranslationX(float value) {
        if (this.impl.getTranslationX() != value) goto L5;
        boolean r0 = true;
    L6:
        if (r0 == true) goto L9;
        this.impl.setTranslationX(value);
        return;
    L9:
        return;
    L5:
        r0 = false;
        goto L6
    }

    public final float getTranslationY() {
        return this.impl.getTranslationY();
    }

    public final void setTranslationY(float value) {
        if (this.impl.getTranslationY() != value) goto L5;
        boolean r0 = true;
    L6:
        if (r0 == true) goto L9;
        this.impl.setTranslationY(value);
        return;
    L9:
        return;
    L5:
        r0 = false;
        goto L6
    }

    public final float getShadowElevation() {
        return this.impl.getShadowElevation();
    }

    public final void setShadowElevation(float value) {
        if (this.impl.getShadowElevation() != value) goto L5;
        boolean r0 = true;
    L6:
        if (r0 == true) goto L9;
        this.impl.setShadowElevation(value);
        this.outlineDirty = true;
        configureOutlineAndClip();
        return;
    L9:
        return;
    L5:
        r0 = false;
        goto L6
    }

    public final float getRotationX() {
        return this.impl.getRotationX();
    }

    public final void setRotationX(float value) {
        if (this.impl.getRotationX() != value) goto L5;
        boolean r0 = true;
    L6:
        if (r0 == true) goto L9;
        this.impl.setRotationX(value);
        return;
    L9:
        return;
    L5:
        r0 = false;
        goto L6
    }

    public final float getRotationY() {
        return this.impl.getRotationY();
    }

    public final void setRotationY(float value) {
        if (this.impl.getRotationY() != value) goto L5;
        boolean r0 = true;
    L6:
        if (r0 == true) goto L9;
        this.impl.setRotationY(value);
        return;
    L9:
        return;
    L5:
        r0 = false;
        goto L6
    }

    public final float getRotationZ() {
        return this.impl.getRotationZ();
    }

    public final void setRotationZ(float value) {
        if (this.impl.getRotationZ() != value) goto L5;
        boolean r0 = true;
    L6:
        if (r0 == true) goto L9;
        this.impl.setRotationZ(value);
        return;
    L9:
        return;
    L5:
        r0 = false;
        goto L6
    }

    public final float getCameraDistance() {
        return this.impl.getCameraDistance();
    }

    public final void setCameraDistance(float value) {
        if (this.impl.getCameraDistance() != value) goto L5;
        boolean r0 = true;
    L6:
        if (r0 == true) goto L9;
        this.impl.setCameraDistance(value);
        return;
    L9:
        return;
    L5:
        r0 = false;
        goto L6
    }

    public final boolean getClip() {
        return this.clip;
    }

    public final void setClip(boolean value) {
        if (this.clip == value) goto L6;
        this.clip = value;
        this.outlineDirty = true;
        configureOutlineAndClip();
        return;
    }

    public final RenderEffect getRenderEffect() {
        return this.impl.getRenderEffect();
    }

    public final void setRenderEffect(RenderEffect value) {
        if (Intrinsics.areEqual(this.impl.getRenderEffect(), value) == true) goto L6;
        this.impl.setRenderEffect(value);
        return;
    }

    /* JADX INFO: renamed from: setPosition-VbeCjmY, reason: not valid java name */
    private final void m5000setPositionVbeCjmY(long topLeft, long size) {
        this.impl.mo5030setPositionH0pRuoY(IntOffset.m7101getXimpl(topLeft), IntOffset.m7102getYimpl(topLeft), size);
    }

    /* JADX INFO: renamed from: record-mL-hObY, reason: not valid java name */
    public final void m5011recordmLhObY(Density density, LayoutDirection layoutDirection, long size, Function1<? super DrawScope, Unit> r7) {
        m5003setSizeozmzZPI(size);
        this.density = density;
        this.layoutDirection = layoutDirection;
        this.drawBlock = r7;
        this.impl.setInvalidated(true);
        recordInternal();
    }

    private final void recordInternal() {
        this.impl.record(this.density, this.layoutDirection, this, this.clipDrawBlock);
    }

    private final void drawWithChildTracking(DrawScope $this$drawWithChildTracking) {
        ChildLayerDependenciesTracker this_$iv = this.childDependenciesTracker;
        ChildLayerDependenciesTracker.access$setOldDependency$p(this_$iv, ChildLayerDependenciesTracker.access$getDependency$p(this_$iv));
        MutableScatterSet currentSet$iv = ChildLayerDependenciesTracker.access$getDependenciesSet$p(this_$iv);
        if (currentSet$iv != null) goto L5;
    L11:
        ChildLayerDependenciesTracker.access$setTrackingInProgress$p(this_$iv, true);
        this.drawBlock.invoke($this$drawWithChildTracking);
        ChildLayerDependenciesTracker.access$setTrackingInProgress$p(this_$iv, false);
        GraphicsLayer it = ChildLayerDependenciesTracker.access$getOldDependency$p(this_$iv);
        if (it == null) goto L14;
        it.onRemovedFromParentLayer();
    L14:
        MutableScatterSet oldSet$iv = ChildLayerDependenciesTracker.access$getOldDependenciesSet$p(this_$iv);
        if (oldSet$iv == null) goto L41;
        if (oldSet$iv.isNotEmpty() == false) goto L47;
        MutableScatterSet this_$iv$iv = oldSet$iv;
        Object[] elements$iv$iv = this_$iv$iv.elements;
        long[] m$iv$iv$iv = this_$iv$iv.metadata;
        int lastIndex$iv$iv$iv = m$iv$iv$iv.length - 2;
        int i$iv$iv$iv = 0;
        if (0 > lastIndex$iv$iv$iv) goto L36;
    L20:
        long slot$iv$iv$iv = m$iv$iv$iv[i$iv$iv$iv];
        ChildLayerDependenciesTracker this_$iv2 = this_$iv;
        if (((((~slot$iv$iv$iv) << 7) & slot$iv$iv$iv) & (-9187201950435737472L)) == (-9187201950435737472L)) goto L32;
        int bitCount$iv$iv$iv = 8 - ((~(i$iv$iv$iv - lastIndex$iv$iv$iv)) >>> 31);
        int j$iv$iv$iv = 0;
    L23:
        if (j$iv$iv$iv >= bitCount$iv$iv$iv) goto L31;
        long value$iv$iv$iv$iv = slot$iv$iv$iv & 255;
        if (value$iv$iv$iv$iv >= 128) goto L27;
        int $i$f$isFull = 1;
    L28:
        if ($i$f$isFull == 0) goto L30;
        int index$iv$iv$iv = (i$iv$iv$iv << 3) + j$iv$iv$iv;
        ((GraphicsLayer) elements$iv$iv[index$iv$iv$iv]).onRemovedFromParentLayer();
    L30:
        slot$iv$iv$iv = slot$iv$iv$iv >> 8;
        j$iv$iv$iv = j$iv$iv$iv + 1;
        goto L23
    L27:
        $i$f$isFull = 0;
        goto L28
    L31:
        if (bitCount$iv$iv$iv != 8) goto L36;
    L32:
        if (i$iv$iv$iv == lastIndex$iv$iv$iv) goto L36;
        i$iv$iv$iv = i$iv$iv$iv + 1;
        this_$iv = this_$iv2;
    L36:
        oldSet$iv.clear();
        return;
    L47:
        return;
    L41:
        return;
    L5:
        if (currentSet$iv.isNotEmpty() == false) goto L11;
        MutableScatterSet it$iv = ChildLayerDependenciesTracker.access$getOldDependenciesSet$p(this_$iv);
        if (it$iv != null) goto L9;
        it$iv = ScatterSetKt.mutableScatterSetOf();
        ChildLayerDependenciesTracker.access$setOldDependenciesSet$p(this_$iv, it$iv);
    L9:
        it$iv.addAll(currentSet$iv);
        currentSet$iv.clear();
        goto L11
    }

    private final void addSubLayer(GraphicsLayer graphicsLayer) {
        if (this.childDependenciesTracker.onDependencyAdded(graphicsLayer) == false) goto L6;
        graphicsLayer.onAddedToParentLayer();
        return;
    }

    private final void transformCanvas(Canvas androidCanvas) {
        float left = IntOffset.m7101getXimpl(this.topLeft);
        float top = IntOffset.m7102getYimpl(this.topLeft);
        float r0 = IntOffset.m7101getXimpl(this.topLeft);
        long arg0$iv = this.size;
        float right = r0 + ((int) (arg0$iv >> 32));
        float r1 = IntOffset.m7102getYimpl(this.topLeft);
        long arg0$iv2 = this.size;
        float bottom = r1 + ((int) (4294967295L & arg0$iv2));
        float layerAlpha = getAlpha();
        ColorFilter layerColorFilter = getColorFilter();
        int layerBlendMode = m5005getBlendMode0nO6VwU();
        if (layerAlpha >= 1.0f) goto L5;
    L11:
        boolean r2 = true;
    L12:
        boolean useSaveLayer = r2;
        if (useSaveLayer == false) goto L18;
        Paint it = this.softwareLayerPaint;
        if (it != null) goto L17;
        it = AndroidPaint_androidKt.Paint();
        this.softwareLayerPaint = it;
    L17:
        Paint it2 = it;
        it2.setAlpha(layerAlpha);
        it2.mo4244setBlendModes9anfk8(layerBlendMode);
        it2.setColorFilter(layerColorFilter);
        Paint paint = it;
        Canvas androidCanvas2 = androidCanvas;
        androidCanvas2.saveLayer(left, top, right, bottom, paint.asFrameworkPaint());
    L19:
        androidCanvas2.translate(left, top);
        androidCanvas2.concat(this.impl.calculateMatrix());
        return;
    L18:
        androidCanvas2 = androidCanvas;
        androidCanvas2.save();
        goto L19
    L5:
        if (BlendMode.m4277equalsimpl0(layerBlendMode, BlendMode.Companion.m4308getSrcOver0nO6VwU()) == false) goto L11;
        if (layerColorFilter != null) goto L11;
        if (CompositingStrategy.m4993equalsimpl0(m5006getCompositingStrategyke2Ky5w(), CompositingStrategy.Companion.m4999getOffscreenke2Ky5w()) == true) goto L11;
        r2 = false;
        goto L12
    }

    public final void drawForPersistence$ui_graphics_release(androidx.compose.ui.graphics.Canvas canvas) {
        if (AndroidCanvas_androidKt.getNativeCanvas(canvas).isHardwareAccelerated() == false) goto L5;
    L6:
        recreateDisplayListIfNeeded();
        this.impl.draw(canvas);
        return;
    L5:
        if (this.impl.getSupportsSoftwareRendering() == true) goto L6;
    }

    private final void recreateDisplayListIfNeeded() {
        if (this.impl.getHasDisplayList() == true) goto L10;
        recordInternal();     // Catch: Throwable -> L6
        return;
    L7:
        return;
    }

    public final void draw$ui_graphics_release(androidx.compose.ui.graphics.Canvas canvas, GraphicsLayer parentLayer) {
        if (this.isReleased == false) goto L5;
        return;
    L5:
        configureOutlineAndClip();
        recreateDisplayListIfNeeded();
        boolean willClipPath = true;
        if (getShadowElevation() <= 0.0f) goto L8;
        boolean r0 = true;
    L9:
        boolean useZ = r0;
        if (useZ == false) goto L12;
        canvas.enableZ();
    L12:
        Canvas androidCanvas = AndroidCanvas_androidKt.getNativeCanvas(canvas);
        boolean softwareRendered = !androidCanvas.isHardwareAccelerated();
        if (softwareRendered == false) goto L15;
        transformCanvas(androidCanvas);
    L15:
        if (softwareRendered == true) goto L17;
    L19:
        willClipPath = false;
    L20:
        if (willClipPath == false) goto L34;
        canvas.save();
        androidx.compose.ui.graphics.Outline tmpOutline = getOutline();
        if ((tmpOutline instanceof androidx.compose.ui.graphics.Outline.Rectangle) == false) goto L25;
        androidx.compose.ui.graphics.Canvas.m4339clipRectmtrdDE$default(canvas, tmpOutline.getBounds(), 0, 2, null);
        goto L34
    L25:
        if ((tmpOutline instanceof androidx.compose.ui.graphics.Outline.Rounded) == false) goto L32;
        Path rRectPath = this.roundRectClipPath;
        if (rRectPath == null) goto L29;
        rRectPath.rewind();
    L30:
        Path.addRoundRect$default(rRectPath, ((androidx.compose.ui.graphics.Outline.Rounded) tmpOutline).getRoundRect(), null, 2, null);
        androidx.compose.ui.graphics.Canvas.m4337clipPathmtrdDE$default(canvas, rRectPath, 0, 2, null);
        goto L34
    L29:
        rRectPath = AndroidPath_androidKt.Path();
        this.roundRectClipPath = rRectPath;
        goto L30
    L32:
        if ((tmpOutline instanceof androidx.compose.ui.graphics.Outline.Generic) == false) goto L34;
        androidx.compose.ui.graphics.Canvas.m4337clipPathmtrdDE$default(canvas, ((androidx.compose.ui.graphics.Outline.Generic) tmpOutline).getPath(), 0, 2, null);
    L34:
        if (parentLayer == null) goto L37;
        parentLayer.addSubLayer(this);
    L37:
        if (AndroidCanvas_androidKt.getNativeCanvas(canvas).isHardwareAccelerated() == true) goto L51;
        if (this.impl.getSupportsSoftwareRendering() == true) goto L51;
        CanvasDrawScope it = this.softwareDrawScope;
        if (it != null) goto L44;
        it = new CanvasDrawScope();
        this.softwareDrawScope = it;
    L44:
        DrawScope $this$draw_u2dymL40Pk$iv = it;
        Density density$iv = this.density;
        LayoutDirection layoutDirection$iv = this.layoutDirection;
        long size$iv = IntSizeKt.m7156toSizeozmzZPI(this.size);
        Density prevDensity$iv = $this$draw_u2dymL40Pk$iv.getDrawContext().getDensity();
        LayoutDirection prevLayoutDirection$iv = $this$draw_u2dymL40Pk$iv.getDrawContext().getLayoutDirection();
        willClipPath = willClipPath;
        androidx.compose.ui.graphics.Canvas prevCanvas$iv = $this$draw_u2dymL40Pk$iv.getDrawContext().getCanvas();
        useZ = useZ;
        long prevSize$iv = $this$draw_u2dymL40Pk$iv.getDrawContext().mo4838getSizeNHjbRc();
        androidCanvas = androidCanvas;
        GraphicsLayer prevLayer$iv = $this$draw_u2dymL40Pk$iv.getDrawContext().getGraphicsLayer();
        DrawContext $this$draw_ymL40Pk_u24lambda_u247$iv = $this$draw_u2dymL40Pk$iv.getDrawContext();
        $this$draw_ymL40Pk_u24lambda_u247$iv.setDensity(density$iv);
        $this$draw_ymL40Pk_u24lambda_u247$iv.setLayoutDirection(layoutDirection$iv);
        $this$draw_ymL40Pk_u24lambda_u247$iv.setCanvas(canvas);
        $this$draw_ymL40Pk_u24lambda_u247$iv.mo4839setSizeuvyYCjk(size$iv);
        $this$draw_ymL40Pk_u24lambda_u247$iv.setGraphicsLayer(this);
        canvas.save();
        drawWithChildTracking($this$draw_u2dymL40Pk$iv);     // Catch: Throwable -> L47
        canvas.restore();
        DrawContext $this$draw_ymL40Pk_u24lambda_u248$iv = $this$draw_u2dymL40Pk$iv.getDrawContext();
        $this$draw_ymL40Pk_u24lambda_u248$iv.setDensity(prevDensity$iv);
        $this$draw_ymL40Pk_u24lambda_u248$iv.setLayoutDirection(prevLayoutDirection$iv);
        $this$draw_ymL40Pk_u24lambda_u248$iv.setCanvas(prevCanvas$iv);
        $this$draw_ymL40Pk_u24lambda_u248$iv.mo4839setSizeuvyYCjk(prevSize$iv);
        $this$draw_ymL40Pk_u24lambda_u248$iv.setGraphicsLayer(prevLayer$iv);
    L52:
        if (willClipPath == false) goto L54;
        canvas.restore();
    L54:
        if (useZ == false) goto L56;
        canvas.disableZ();
    L56:
        if (softwareRendered == false) goto L61;
        androidCanvas.restore();
        return;
    L61:
        return;
    L47:
        th = move-exception;
        canvas.restore();
        DrawContext $this$draw_ymL40Pk_u24lambda_u248$iv2 = $this$draw_u2dymL40Pk$iv.getDrawContext();
        $this$draw_ymL40Pk_u24lambda_u248$iv2.setDensity(prevDensity$iv);
        $this$draw_ymL40Pk_u24lambda_u248$iv2.setLayoutDirection(prevLayoutDirection$iv);
        $this$draw_ymL40Pk_u24lambda_u248$iv2.setCanvas(prevCanvas$iv);
        $this$draw_ymL40Pk_u24lambda_u248$iv2.mo4839setSizeuvyYCjk(prevSize$iv);
        $this$draw_ymL40Pk_u24lambda_u248$iv2.setGraphicsLayer(prevLayer$iv);
        throw th;
    L51:
        this.impl.draw(canvas);
        goto L52
    L17:
        if (this.clip == false) goto L19;
    L8:
        r0 = false;
        goto L9
    }

    private final void onAddedToParentLayer() {
        this.parentLayerUsages++;
    }

    private final void onRemovedFromParentLayer() {
        this.parentLayerUsages--;
        discardContentIfReleasedAndHaveNoParentLayerUsages();
    }

    private final RectF obtainPathBounds() {
        RectF r0 = this.pathBounds;
        if (r0 != null) goto L6;
        RectF it = new RectF();
        this.pathBounds = it;
        return it;
    L6:
        return r0;
    }

    private final void configureOutlineAndClip() {
        if (this.outlineDirty == false) goto L37;
        boolean r3 = true;
        if (this.clip == false) goto L7;
    L10:
        boolean outlineIsNeeded = true;
    L11:
        Outline $this$configureOutlineAndClip_u24lambda_u249 = null;
        if (outlineIsNeeded == true) goto L14;
        this.impl.setClip(false);
        this.impl.mo5028setOutlineO0kMr_c(null, IntSize.Companion.m7149getZeroYbymL2g());
        goto L37
    L14:
        Path tmpPath = this.outlinePath;
        if (tmpPath == null) goto L29;
        RectF bounds = obtainPathBounds();
        if ((tmpPath instanceof AndroidPath) == false) goto L28;
        ((AndroidPath) tmpPath).getInternalPath().computeBounds(bounds, false);
        Outline r9 = updatePathOutline(tmpPath);
        if (r9 == null) goto L21;
        $this$configureOutlineAndClip_u24lambda_u249 = r9;
        $this$configureOutlineAndClip_u24lambda_u249.setAlpha(getAlpha());
    L21:
        GraphicsLayerImpl r10 = this.impl;
        float $this$fastRoundToInt$iv = bounds.width();
        int width$iv = Math.round($this$fastRoundToInt$iv);
        float $this$fastRoundToInt$iv2 = bounds.height();
        int height$iv = Math.round($this$fastRoundToInt$iv2);
        r10.mo5028setOutlineO0kMr_c($this$configureOutlineAndClip_u24lambda_u249, IntSize.m7139constructorimpl((((long) height$iv) & 4294967295L) | (((long) width$iv) << 32)));
        if (this.usePathForClip == true) goto L24;
    L26:
        this.impl.setClip(this.clip);
        goto L37
    L24:
        if (this.clip == false) goto L26;
        this.impl.setClip(false);
        this.impl.discardDisplayList();
        goto L37
    L28:
        throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
    L29:
        this.impl.setClip(this.clip);
        Size.Companion.m4203getZeroNHjbRc();
        Outline roundRectOutline = obtainAndroidOutline();
        long layerSize$iv = IntSizeKt.m7156toSizeozmzZPI(this.size);
        long rRectTopLeft$iv = this.roundRectOutlineTopLeft;
        long rRectSize$iv = this.roundRectOutlineSize;
        if (rRectSize$iv == InlineClassHelperKt.UnspecifiedPackedFloats) goto L33;
        r3 = false;
    L33:
        if (r3 == false) goto L35;
        long outlineSize$iv = layerSize$iv;
    L36:
        long outlineSize = outlineSize$iv;
        int bits$iv$iv$iv = (int) (rRectTopLeft$iv >> 32);
        float $this$fastRoundToInt$iv3 = Float.intBitsToFloat(bits$iv$iv$iv);
        int left = Math.round($this$fastRoundToInt$iv3);
        int bits$iv$iv$iv2 = (int) (rRectTopLeft$iv & 4294967295L);
        float $this$fastRoundToInt$iv4 = Float.intBitsToFloat(bits$iv$iv$iv2);
        int top = Math.round($this$fastRoundToInt$iv4);
        int bits$iv$iv$iv3 = (int) (rRectTopLeft$iv >> 32);
        float r1 = Float.intBitsToFloat(bits$iv$iv$iv3);
        int bits$iv$iv$iv4 = (int) (outlineSize >> 32);
        float $this$fastRoundToInt$iv5 = Float.intBitsToFloat(bits$iv$iv$iv4) + r1;
        int right = Math.round($this$fastRoundToInt$iv5);
        int bits$iv$iv$iv5 = (int) (rRectTopLeft$iv & 4294967295L);
        float r2 = Float.intBitsToFloat(bits$iv$iv$iv5);
        int bits$iv$iv$iv6 = (int) (outlineSize & 4294967295L);
        float $this$fastRoundToInt$iv6 = r2 + Float.intBitsToFloat(bits$iv$iv$iv6);
        int bottom = Math.round($this$fastRoundToInt$iv6);
        roundRectOutline.setRoundRect(left, top, right, bottom, this.roundRectCornerRadius);
        roundRectOutline.setAlpha(getAlpha());
        this.impl.mo5028setOutlineO0kMr_c(roundRectOutline, IntSizeKt.m7152roundToIntSizeuvyYCjk(outlineSize));
        goto L37
    L35:
        outlineSize$iv = rRectSize$iv;
        goto L36
    L7:
        if (getShadowElevation() > 0.0f) goto L10;
        outlineIsNeeded = false;
    L37:
        this.outlineDirty = false;
    }

    private final <T> T resolveOutlinePosition(Function2<? super Offset, ? super Size, ? extends T> r13) {
        long layerSize = IntSizeKt.m7156toSizeozmzZPI(this.size);
        long rRectTopLeft = this.roundRectOutlineTopLeft;
        long rRectSize = this.roundRectOutlineSize;
        if (rRectSize != InlineClassHelperKt.UnspecifiedPackedFloats) goto L5;
        boolean r10 = true;
    L6:
        if (r10 == false) goto L8;
        long outlineSize = layerSize;
    L10:
        return r13.invoke(Offset.m4114boximpl(rRectTopLeft), Size.m4182boximpl(outlineSize));
    L8:
        outlineSize = rRectSize;
        goto L10
    L5:
        r10 = false;
        goto L6
    }

    private final Outline updatePathOutline(Path path) {
        if (Build.VERSION.SDK_INT <= 28) goto L5;
    L11:
        Outline resultOutline = obtainAndroidOutline();
        if (Build.VERSION.SDK_INT < 30) goto L15;
        OutlineVerificationHelper.INSTANCE.setPath(resultOutline, path);
    L17:
        this.usePathForClip = !resultOutline.canClip();
    L18:
        this.outlinePath = path;
        return resultOutline;
    L15:
        if ((path instanceof AndroidPath) == false) goto L21;
        resultOutline.setConvexPath(((AndroidPath) path).getInternalPath());
        goto L17
    L21:
        throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
    L5:
        if (path.isConvex() == true) goto L11;
        Outline r1 = this.androidOutline;
        if (r1 == null) goto L10;
        r1.setEmpty();
    L10:
        resultOutline = null;
        this.usePathForClip = true;
        this.impl.setInvalidated(true);
        goto L18
    }

    private final Outline obtainAndroidOutline() {
        Outline r0 = this.androidOutline;
        if (r0 != null) goto L6;
        Outline it = new Outline();
        this.androidOutline = it;
        return it;
    L6:
        return r0;
    }

    public final void release$ui_graphics_release() {
        if (this.isReleased == true) goto L6;
        this.isReleased = true;
        discardContentIfReleasedAndHaveNoParentLayerUsages();
        return;
    }

    private final void discardContentIfReleasedAndHaveNoParentLayerUsages() {
        if (this.isReleased == true) goto L5;
        return;
    L5:
        if (this.parentLayerUsages == 0) goto L7;
        return;
    L7:
        if (this.layerManager == null) goto L9;
        this.layerManager.release(this);
        return;
    L9:
        discardDisplayList$ui_graphics_release();
    }

    public final void discardDisplayList$ui_graphics_release() {
        ChildLayerDependenciesTracker this_$iv = this.childDependenciesTracker;
        int $i$f$removeDependencies = 0;
        GraphicsLayer it$iv = ChildLayerDependenciesTracker.access$getDependency$p(this_$iv);
        if (it$iv == null) goto L5;
        it$iv.onRemovedFromParentLayer();
        ChildLayerDependenciesTracker.access$setDependency$p(this_$iv, null);
    L5:
        MutableScatterSet it$iv2 = ChildLayerDependenciesTracker.access$getDependenciesSet$p(this_$iv);
        if (it$iv2 == null) goto L27;
        int r4 = 0;
        MutableScatterSet this_$iv$iv = it$iv2;
        Object[] elements$iv$iv = this_$iv$iv.elements;
        long[] m$iv$iv$iv = this_$iv$iv.metadata;
        int lastIndex$iv$iv$iv = m$iv$iv$iv.length - 2;
        int i$iv$iv$iv = 0;
        if (0 > lastIndex$iv$iv$iv) goto L23;
    L9:
        long slot$iv$iv$iv = m$iv$iv$iv[i$iv$iv$iv];
        ChildLayerDependenciesTracker this_$iv2 = this_$iv;
        int $i$f$removeDependencies2 = $i$f$removeDependencies;
        MutableScatterSet it$iv3 = it$iv2;
        int r16 = r4;
        long $this$maskEmptyOrDeleted$iv$iv$iv$iv = (((~slot$iv$iv$iv) << 7) & slot$iv$iv$iv) & (-9187201950435737472L);
        if ($this$maskEmptyOrDeleted$iv$iv$iv$iv == (-9187201950435737472L)) goto L21;
        int bitCount$iv$iv$iv = 8 - ((~(i$iv$iv$iv - lastIndex$iv$iv$iv)) >>> 31);
        int j$iv$iv$iv = 0;
    L12:
        if (j$iv$iv$iv >= bitCount$iv$iv$iv) goto L20;
        long value$iv$iv$iv$iv = slot$iv$iv$iv & 255;
        if (value$iv$iv$iv$iv >= 128) goto L16;
        boolean r17 = true;
    L17:
        if (r17 == false) goto L19;
        int index$iv$iv$iv = (i$iv$iv$iv << 3) + j$iv$iv$iv;
        GraphicsLayer it = (GraphicsLayer) elements$iv$iv[index$iv$iv$iv];
        it.onRemovedFromParentLayer();
    L19:
        slot$iv$iv$iv = slot$iv$iv$iv >> 8;
        j$iv$iv$iv = j$iv$iv$iv + 1;
        goto L12
    L16:
        r17 = false;
        goto L17
    L20:
        if (bitCount$iv$iv$iv == 8) goto L21;
    L25:
        it$iv3.clear();
    L21:
        if (i$iv$iv$iv == lastIndex$iv$iv$iv) goto L25;
        i$iv$iv$iv = i$iv$iv$iv + 1;
        it$iv2 = it$iv3;
        r4 = r16;
        this_$iv = this_$iv2;
        $i$f$removeDependencies = $i$f$removeDependencies2;
        goto L9
    L23:
        it$iv3 = it$iv2;
    L27:
        this.impl.discardDisplayList();
    }

    public final void emulateTrimMemory$ui_graphics_release() {
        this.impl.discardDisplayList();
    }

    public final long getLayerId() {
        return this.impl.getLayerId();
    }

    public final long getOwnerViewId() {
        return this.impl.getOwnerId();
    }

    public final androidx.compose.ui.graphics.Outline getOutline() {
        androidx.compose.ui.graphics.Outline tmpOutline = this.internalOutline;
        Path tmpPath = this.outlinePath;
        if (tmpOutline != null) goto L20;
        if (tmpPath == null) goto L7;
        androidx.compose.ui.graphics.Outline.Generic it = new androidx.compose.ui.graphics.Outline.Generic(tmpPath);
        this.internalOutline = it;
        return it;
    L7:
        long layerSize$iv = IntSizeKt.m7156toSizeozmzZPI(this.size);
        long rRectTopLeft$iv = this.roundRectOutlineTopLeft;
        long rRectSize$iv = this.roundRectOutlineSize;
        if (rRectSize$iv != InlineClassHelperKt.UnspecifiedPackedFloats) goto L10;
        boolean r14 = true;
    L11:
        if (r14 == false) goto L13;
        long outlineSize$iv = layerSize$iv;
    L14:
        long outlineSize = outlineSize$iv;
        int bits$iv$iv$iv = (int) (rRectTopLeft$iv >> 32);
        float left = Float.intBitsToFloat(bits$iv$iv$iv);
        int bits$iv$iv$iv2 = (int) (rRectTopLeft$iv & 4294967295L);
        float top = Float.intBitsToFloat(bits$iv$iv$iv2);
        int bits$iv$iv$iv3 = (int) (outlineSize >> 32);
        float right = left + Float.intBitsToFloat(bits$iv$iv$iv3);
        int bits$iv$iv$iv4 = (int) (outlineSize & 4294967295L);
        float bottom = top + Float.intBitsToFloat(bits$iv$iv$iv4);
        float cornerRadius = this.roundRectCornerRadius;
        if (cornerRadius <= 0.0f) goto L17;
        long v1$iv$iv = Float.floatToRawIntBits(cornerRadius);
        long v1$iv$iv2 = Float.floatToRawIntBits(cornerRadius);
        long v2$iv$iv = (v1$iv$iv << 32) | (v1$iv$iv2 & 4294967295L);
        androidx.compose.ui.graphics.Outline.Rectangle it2 = new androidx.compose.ui.graphics.Outline.Rounded(RoundRectKt.m4179RoundRectgG7oq9Y(left, top, right, bottom, CornerRadius.m4079constructorimpl(v2$iv$iv)));
    L18:
        this.internalOutline = it2;
        return it2;
    L17:
        it2 = new androidx.compose.ui.graphics.Outline.Rectangle(new Rect(left, top, right, bottom));
        goto L18
    L13:
        outlineSize$iv = rRectSize$iv;
        goto L14
    L10:
        r14 = false;
        goto L11
    L20:
        return tmpOutline;
    }

    private final void resetOutlineParams() {
        this.internalOutline = null;
        this.outlinePath = null;
        this.roundRectOutlineSize = Size.Companion.m4202getUnspecifiedNHjbRc();
        this.roundRectOutlineTopLeft = Offset.Companion.m4141getZeroF1C5BW0();
        this.roundRectCornerRadius = 0.0f;
        this.outlineDirty = true;
        this.usePathForClip = false;
    }

    public final void setPathOutline(Path path) {
        resetOutlineParams();
        this.outlinePath = path;
        configureOutlineAndClip();
    }

    /* JADX INFO: renamed from: setRoundRectOutline-TNW_H78$default, reason: not valid java name */
    public static /* synthetic */ void m5002setRoundRectOutlineTNW_H78$default(GraphicsLayer r6, long r7, long r9, float r11, int r12, Object r13) {
        if ((r12 & 1) == 0) goto L5;
        long r1 = Offset.Companion.m4141getZeroF1C5BW0();
    L7:
        if ((r12 & 2) == 0) goto L9;
        long r3 = Size.Companion.m4202getUnspecifiedNHjbRc();
    L11:
        if ((r12 & 4) == 0) goto L13;
        float r5 = 0.0f;
    L14:
        r6.m5017setRoundRectOutlineTNW_H78(r1, r3, r5);
        return;
    L13:
        r5 = r11;
        goto L14
    L9:
        r3 = r9;
        goto L11
    L5:
        r1 = r7;
        goto L7
    }

    /* JADX INFO: renamed from: setRoundRectOutline-TNW_H78, reason: not valid java name */
    public final void m5017setRoundRectOutlineTNW_H78(long topLeft, long size, float cornerRadius) {
        if (Offset.m4122equalsimpl0(this.roundRectOutlineTopLeft, topLeft) == true) goto L5;
    L13:
        resetOutlineParams();
        this.roundRectOutlineTopLeft = topLeft;
        this.roundRectOutlineSize = size;
        this.roundRectCornerRadius = cornerRadius;
        configureOutlineAndClip();
        return;
    L5:
        if (Size.m4190equalsimpl0(this.roundRectOutlineSize, size) == false) goto L13;
        if (this.roundRectCornerRadius != cornerRadius) goto L9;
        boolean r0 = true;
    L10:
        if (r0 == false) goto L13;
        if (this.outlinePath != null) goto L13;
        return;
    L9:
        r0 = false;
        goto L10
    }

    /* JADX INFO: renamed from: setRectOutline-tz77jQw$default, reason: not valid java name */
    public static /* synthetic */ void m5001setRectOutlinetz77jQw$default(GraphicsLayer r0, long r1, long r3, int r5, Object r6) {
        if ((r5 & 1) == 0) goto L6;
        r1 = Offset.Companion.m4141getZeroF1C5BW0();
    L6:
        if ((r5 & 2) == 0) goto L8;
        r3 = Size.Companion.m4202getUnspecifiedNHjbRc();
    L8:
        r0.m5016setRectOutlinetz77jQw(r1, r3);
    }

    /* JADX INFO: renamed from: setRectOutline-tz77jQw, reason: not valid java name */
    public final void m5016setRectOutlinetz77jQw(long topLeft, long size) {
        m5017setRoundRectOutlineTNW_H78(topLeft, size, 0.0f);
    }

    /* JADX INFO: renamed from: getAmbientShadowColor-0d7_KjU, reason: not valid java name */
    public final long m5004getAmbientShadowColor0d7_KjU() {
        return this.impl.mo5020getAmbientShadowColor0d7_KjU();
    }

    /* JADX INFO: renamed from: setAmbientShadowColor-8_81llA, reason: not valid java name */
    public final void m5012setAmbientShadowColor8_81llA(long value) {
        if (Color.m4367equalsimpl0(value, this.impl.mo5020getAmbientShadowColor0d7_KjU()) == true) goto L6;
        this.impl.mo5025setAmbientShadowColor8_81llA(value);
        return;
    }

    /* JADX INFO: renamed from: getSpotShadowColor-0d7_KjU, reason: not valid java name */
    public final long m5009getSpotShadowColor0d7_KjU() {
        return this.impl.mo5024getSpotShadowColor0d7_KjU();
    }

    /* JADX INFO: renamed from: setSpotShadowColor-8_81llA, reason: not valid java name */
    public final void m5018setSpotShadowColor8_81llA(long value) {
        if (Color.m4367equalsimpl0(value, this.impl.mo5024getSpotShadowColor0d7_KjU()) == true) goto L6;
        this.impl.mo5031setSpotShadowColor8_81llA(value);
        return;
    }

    public final Object toImageBitmap(Continuation<? super ImageBitmap> r7) {
        if ((r7 instanceof AnonymousClass1) == false) goto L7;
        AnonymousClass1 r0 = (AnonymousClass1) r7;
        if ((r0.label & Integer.MIN_VALUE) == 0) goto L7;
        r0.label -= Integer.MIN_VALUE;
    L8:
        Object $result = r0.result;
        Object r2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch(r0.label) {
            case 0: goto L13;
            case 1: goto L12;
            default: goto L11;
        };
    L12:
        ResultKt.throwOnFailure($result);
        Object r3 = $result;
    L17:
        return AndroidImageBitmap_androidKt.asImageBitmap((Bitmap) r3);
    L13:
        ResultKt.throwOnFailure($result);
        LayerSnapshotImpl r4 = SnapshotImpl;
        r0.label = 1;
        r3 = r4.toBitmap(this, r0);
        if (r3 != r2) goto L17;
        return r2;
    L11:
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    L7:
        r0 = new AnonymousClass1(this, r7);
        goto L8
    }

    static {
        Companion = new Companion(null);
        if (LayerManager.Companion.isRobolectric() == false) goto L6;
        LayerSnapshotV21 r0 = LayerSnapshotV21.INSTANCE;
    L12:
        SnapshotImpl = r0;
        return;
    L6:
        if (Build.VERSION.SDK_INT < 28) goto L9;
        r0 = LayerSnapshotV28.INSTANCE;
        goto L12
    L9:
        if (SurfaceUtils.INSTANCE.isLockHardwareCanvasAvailable() == false) goto L11;
        r0 = LayerSnapshotV22.INSTANCE;
        goto L12
    L11:
        r0 = LayerSnapshotV21.INSTANCE;
        goto L12
    }
}
