package androidx.compose.ui.node;

import androidx.autofill.HintConstants;
import androidx.compose.ui.geometry.MutableRect;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.ReusableGraphicsLayerScope;
import androidx.compose.ui.graphics.layer.GraphicsLayer;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: OwnedLayer.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\b`\u0018\u00002\u00020\u0001J\b\u0010\u0006\u001a\u00020\u0007H&J\u001a\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH&J\b\u0010\r\u001a\u00020\u0007H&J\u001a\u0010\u000e\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u0003H&ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015H&ø\u0001\u0000¢\u0006\u0004\b\u0016\u0010\u0017J\u0018\u0010\u0018\u001a\u00020\u00072\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u0013H&J\"\u0010\u001c\u001a\u00020\u00152\u0006\u0010\u001d\u001a\u00020\u00152\u0006\u0010\u001b\u001a\u00020\u0013H&ø\u0001\u0000¢\u0006\u0004\b\u001e\u0010\u001fJ\u001a\u0010 \u001a\u00020\u00072\u0006\u0010\u0014\u001a\u00020!H&ø\u0001\u0000¢\u0006\u0004\b\"\u0010#J\u001a\u0010$\u001a\u00020\u00072\u0006\u0010%\u001a\u00020&H&ø\u0001\u0000¢\u0006\u0004\b'\u0010#JP\u0010(\u001a\u00020\u000728\u0010)\u001a4\u0012\u0013\u0012\u00110\n¢\u0006\f\b+\u0012\b\b,\u0012\u0004\b\b(\t\u0012\u0015\u0012\u0013\u0018\u00010\f¢\u0006\f\b+\u0012\b\b,\u0012\u0004\b\b(\u000b\u0012\u0004\u0012\u00020\u00070*2\f\u0010-\u001a\b\u0012\u0004\u0012\u00020\u00070.H&J\u001a\u0010/\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u0003H&ø\u0001\u0000¢\u0006\u0004\b0\u0010\u0011J\b\u00101\u001a\u00020\u0007H&J\u0010\u00102\u001a\u00020\u00072\u0006\u00103\u001a\u000204H&R\u0018\u0010\u0002\u001a\u00020\u0003X¦\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005ø\u0001\u0002\u0082\u0002\u0011\n\u0005\b¡\u001e0\u0001\n\u0002\b!\n\u0004\b!0\u0001¨\u00065À\u0006\u0001"}, d2 = {"Landroidx/compose/ui/node/OwnedLayer;", "", "underlyingMatrix", "Landroidx/compose/ui/graphics/Matrix;", "getUnderlyingMatrix-sQKQjiQ", "()[F", "destroy", "", "drawLayer", "canvas", "Landroidx/compose/ui/graphics/Canvas;", "parentLayer", "Landroidx/compose/ui/graphics/layer/GraphicsLayer;", "invalidate", "inverseTransform", "matrix", "inverseTransform-58bKbWc", "([F)V", "isInLayer", "", "position", "Landroidx/compose/ui/geometry/Offset;", "isInLayer-k-4lQ0M", "(J)Z", "mapBounds", "rect", "Landroidx/compose/ui/geometry/MutableRect;", "inverse", "mapOffset", "point", "mapOffset-8S9VItk", "(JZ)J", "move", "Landroidx/compose/ui/unit/IntOffset;", "move--gyyYBs", "(J)V", "resize", "size", "Landroidx/compose/ui/unit/IntSize;", "resize-ozmzZPI", "reuseLayer", "drawBlock", "Lkotlin/Function2;", "Lkotlin/ParameterName;", HintConstants.AUTOFILL_HINT_NAME, "invalidateParentLayer", "Lkotlin/Function0;", "transform", "transform-58bKbWc", "updateDisplayList", "updateLayerProperties", "scope", "Landroidx/compose/ui/graphics/ReusableGraphicsLayerScope;", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public interface OwnedLayer {
    void destroy();

    void drawLayer(Canvas r1, GraphicsLayer r2);

    /* JADX INFO: renamed from: getUnderlyingMatrix-sQKQjiQ, reason: not valid java name */
    float[] mo6027getUnderlyingMatrixsQKQjiQ();

    void invalidate();

    /* JADX INFO: renamed from: inverseTransform-58bKbWc, reason: not valid java name */
    void mo6028inverseTransform58bKbWc(float[] r1);

    /* JADX INFO: renamed from: isInLayer-k-4lQ0M, reason: not valid java name */
    boolean mo6029isInLayerk4lQ0M(long r1);

    void mapBounds(MutableRect r1, boolean r2);

    /* JADX INFO: renamed from: mapOffset-8S9VItk, reason: not valid java name */
    long mo6030mapOffset8S9VItk(long r1, boolean r3);

    /* JADX INFO: renamed from: move--gyyYBs, reason: not valid java name */
    void mo6031movegyyYBs(long r1);

    /* JADX INFO: renamed from: resize-ozmzZPI, reason: not valid java name */
    void mo6032resizeozmzZPI(long r1);

    void reuseLayer(Function2<? super Canvas, ? super GraphicsLayer, Unit> r1, Function0<Unit> r2);

    /* JADX INFO: renamed from: transform-58bKbWc, reason: not valid java name */
    void mo6033transform58bKbWc(float[] r1);

    void updateDisplayList();

    void updateLayerProperties(ReusableGraphicsLayerScope r1);
}
