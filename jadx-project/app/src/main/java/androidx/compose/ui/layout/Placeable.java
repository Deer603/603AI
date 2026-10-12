package androidx.compose.ui.layout;

import androidx.compose.ui.graphics.GraphicsLayerScope;
import androidx.compose.ui.graphics.layer.GraphicsLayer;
import androidx.compose.ui.node.MotionReferencePlacementDelegate;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.ranges.RangesKt;

/* JADX INFO: compiled from: Placeable.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b'\u0018\u00002\u00020\u0001:\u0001,B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u001d\u001a\u00020\u001eH\u0002J=\u0010\u001f\u001a\u00020\u001e2\u0006\u0010 \u001a\u00020\u00042\u0006\u0010!\u001a\u00020\"2\u0019\u0010#\u001a\u0015\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020\u001e\u0018\u00010$¢\u0006\u0002\b&H$ø\u0001\u0000¢\u0006\u0004\b'\u0010(J*\u0010\u001f\u001a\u00020\u001e2\u0006\u0010 \u001a\u00020\u00042\u0006\u0010!\u001a\u00020\"2\u0006\u0010)\u001a\u00020*H\u0014ø\u0001\u0000¢\u0006\u0004\b'\u0010+R&\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0004@BX\u0084\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\u0006\u0010\u0007R\u001e\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\t@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\t8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\fR,\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u0010@DX\u0084\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0010\n\u0002\u0010\b\u001a\u0004\b\u0012\u0010\u0007\"\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0015\u001a\u00020\t8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\fR,\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u000f\u001a\u00020\u0017@DX\u0084\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0010\n\u0002\u0010\b\u001a\u0004\b\u0019\u0010\u0007\"\u0004\b\u001a\u0010\u0014R\u001e\u0010\u001b\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\t@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\f\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006-"}, d2 = {"Landroidx/compose/ui/layout/Placeable;", "Landroidx/compose/ui/layout/Measured;", "()V", "<set-?>", "Landroidx/compose/ui/unit/IntOffset;", "apparentToRealOffset", "getApparentToRealOffset-nOcc-ac", "()J", "J", "", "height", "getHeight", "()I", "measuredHeight", "getMeasuredHeight", "value", "Landroidx/compose/ui/unit/IntSize;", "measuredSize", "getMeasuredSize-YbymL2g", "setMeasuredSize-ozmzZPI", "(J)V", "measuredWidth", "getMeasuredWidth", "Landroidx/compose/ui/unit/Constraints;", "measurementConstraints", "getMeasurementConstraints-msEJaDk", "setMeasurementConstraints-BRTryo0", "width", "getWidth", "onMeasuredSizeChanged", "", "placeAt", "position", "zIndex", "", "layerBlock", "Lkotlin/Function1;", "Landroidx/compose/ui/graphics/GraphicsLayerScope;", "Lkotlin/ExtensionFunctionType;", "placeAt-f8xVGno", "(JFLkotlin/jvm/functions/Function1;)V", "layer", "Landroidx/compose/ui/graphics/layer/GraphicsLayer;", "(JFLandroidx/compose/ui/graphics/layer/GraphicsLayer;)V", "PlacementScope", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public abstract class Placeable implements Measured {
    public static final int $stable = 0;
    private long apparentToRealOffset;
    private int height;
    private long measuredSize;
    private long measurementConstraints;
    private int width;

    /* JADX INFO: compiled from: Placeable.kt */
    @Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\b'\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u001f\u0010\u0011\u001a\u00020\u00122\u0017\u0010\u0013\u001a\u0013\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00120\u0014¢\u0006\u0002\b\u0015J\u0014\u0010\u0016\u001a\u00020\u0017*\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u0017H\u0016J\f\u0010\u001a\u001a\u00020\u0012*\u00020\u001bH\u0002J&\u0010\u001c\u001a\u00020\u0012*\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u001e2\b\b\u0002\u0010\u001f\u001a\u00020\u0017ø\u0001\u0000¢\u0006\u0004\b \u0010!J$\u0010\u001c\u001a\u00020\u0012*\u00020\u001b2\u0006\u0010\"\u001a\u00020\u000e2\u0006\u0010#\u001a\u00020\u000e2\b\b\u0002\u0010\u001f\u001a\u00020\u0017JD\u0010$\u001a\u00020\u0012*\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u00172\u001b\b\b\u0010%\u001a\u0015\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0014¢\u0006\u0002\b\u0015H\u0080\bø\u0001\u0000¢\u0006\u0004\b'\u0010(J/\u0010$\u001a\u00020\u0012*\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u00172\u0006\u0010)\u001a\u00020*H\u0080\bø\u0001\u0000¢\u0006\u0004\b'\u0010+JD\u0010,\u001a\u00020\u0012*\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u00172\u001b\b\b\u0010%\u001a\u0015\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0014¢\u0006\u0002\b\u0015H\u0080\bø\u0001\u0000¢\u0006\u0004\b-\u0010(J/\u0010,\u001a\u00020\u0012*\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u00172\u0006\u0010)\u001a\u00020*H\u0080\bø\u0001\u0000¢\u0006\u0004\b-\u0010+J&\u0010.\u001a\u00020\u0012*\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u001e2\b\b\u0002\u0010\u001f\u001a\u00020\u0017ø\u0001\u0000¢\u0006\u0004\b/\u0010!J$\u0010.\u001a\u00020\u0012*\u00020\u001b2\u0006\u0010\"\u001a\u00020\u000e2\u0006\u0010#\u001a\u00020\u000e2\b\b\u0002\u0010\u001f\u001a\u00020\u0017J.\u00100\u001a\u00020\u0012*\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010)\u001a\u00020*2\b\b\u0002\u0010\u001f\u001a\u00020\u0017ø\u0001\u0000¢\u0006\u0004\b1\u00102JA\u00100\u001a\u00020\u0012*\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u001e2\b\b\u0002\u0010\u001f\u001a\u00020\u00172\u0019\b\u0002\u0010%\u001a\u0013\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020\u00120\u0014¢\u0006\u0002\b\u0015ø\u0001\u0000¢\u0006\u0004\b1\u0010(J,\u00100\u001a\u00020\u0012*\u00020\u001b2\u0006\u0010\"\u001a\u00020\u000e2\u0006\u0010#\u001a\u00020\u000e2\u0006\u0010)\u001a\u00020*2\b\b\u0002\u0010\u001f\u001a\u00020\u0017J?\u00100\u001a\u00020\u0012*\u00020\u001b2\u0006\u0010\"\u001a\u00020\u000e2\u0006\u0010#\u001a\u00020\u000e2\b\b\u0002\u0010\u001f\u001a\u00020\u00172\u0019\b\u0002\u0010%\u001a\u0013\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020\u00120\u0014¢\u0006\u0002\b\u0015J.\u00103\u001a\u00020\u0012*\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010)\u001a\u00020*2\b\b\u0002\u0010\u001f\u001a\u00020\u0017ø\u0001\u0000¢\u0006\u0004\b4\u00102JA\u00103\u001a\u00020\u0012*\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u001e2\b\b\u0002\u0010\u001f\u001a\u00020\u00172\u0019\b\u0002\u0010%\u001a\u0013\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020\u00120\u0014¢\u0006\u0002\b\u0015ø\u0001\u0000¢\u0006\u0004\b4\u0010(J,\u00103\u001a\u00020\u0012*\u00020\u001b2\u0006\u0010\"\u001a\u00020\u000e2\u0006\u0010#\u001a\u00020\u000e2\u0006\u0010)\u001a\u00020*2\b\b\u0002\u0010\u001f\u001a\u00020\u0017J?\u00103\u001a\u00020\u0012*\u00020\u001b2\u0006\u0010\"\u001a\u00020\u000e2\u0006\u0010#\u001a\u00020\u000e2\b\b\u0002\u0010\u001f\u001a\u00020\u00172\u0019\b\u0002\u0010%\u001a\u0013\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020\u00120\u0014¢\u0006\u0002\b\u0015R\u0016\u0010\u0003\u001a\u0004\u0018\u00010\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\t\u001a\u00020\nX¤\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u0012\u0010\r\u001a\u00020\u000eX¤\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u00065"}, d2 = {"Landroidx/compose/ui/layout/Placeable$PlacementScope;", "", "()V", "coordinates", "Landroidx/compose/ui/layout/LayoutCoordinates;", "getCoordinates", "()Landroidx/compose/ui/layout/LayoutCoordinates;", "motionFrameOfReferencePlacement", "", "parentLayoutDirection", "Landroidx/compose/ui/unit/LayoutDirection;", "getParentLayoutDirection", "()Landroidx/compose/ui/unit/LayoutDirection;", "parentWidth", "", "getParentWidth", "()I", "withMotionFrameOfReferencePlacement", "", "block", "Lkotlin/Function1;", "Lkotlin/ExtensionFunctionType;", "current", "", "Landroidx/compose/ui/layout/Ruler;", "defaultValue", "handleMotionFrameOfReferencePlacement", "Landroidx/compose/ui/layout/Placeable;", "place", "position", "Landroidx/compose/ui/unit/IntOffset;", "zIndex", "place-70tqf50", "(Landroidx/compose/ui/layout/Placeable;JF)V", "x", "y", "placeApparentToRealOffset", "layerBlock", "Landroidx/compose/ui/graphics/GraphicsLayerScope;", "placeApparentToRealOffset-aW-9-wM$ui_release", "(Landroidx/compose/ui/layout/Placeable;JFLkotlin/jvm/functions/Function1;)V", "layer", "Landroidx/compose/ui/graphics/layer/GraphicsLayer;", "(Landroidx/compose/ui/layout/Placeable;JFLandroidx/compose/ui/graphics/layer/GraphicsLayer;)V", "placeAutoMirrored", "placeAutoMirrored-aW-9-wM$ui_release", "placeRelative", "placeRelative-70tqf50", "placeRelativeWithLayer", "placeRelativeWithLayer-aW-9-wM", "(Landroidx/compose/ui/layout/Placeable;JLandroidx/compose/ui/graphics/layer/GraphicsLayer;F)V", "placeWithLayer", "placeWithLayer-aW-9-wM", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @PlacementScopeMarker
    public static abstract class PlacementScope {
        public static final int $stable = 0;
        private boolean motionFrameOfReferencePlacement;

        static {
            $stable = 8;
        }

        protected abstract LayoutDirection getParentLayoutDirection();

        protected abstract int getParentWidth();

        public PlacementScope() {
        }

        public static final /* synthetic */ LayoutDirection access$getParentLayoutDirection(PlacementScope $this) {
            return $this.getParentLayoutDirection();
        }

        public static final /* synthetic */ int access$getParentWidth(PlacementScope $this) {
            return $this.getParentWidth();
        }

        public static final /* synthetic */ void access$handleMotionFrameOfReferencePlacement(PlacementScope $this, Placeable $receiver) {
            $this.handleMotionFrameOfReferencePlacement($receiver);
        }

        public LayoutCoordinates getCoordinates() {
            return null;
        }

        public float current(Ruler $this$current, float defaultValue) {
            return defaultValue;
        }

        /* JADX INFO: renamed from: placeRelative-70tqf50$default, reason: not valid java name */
        public static /* synthetic */ void m5779placeRelative70tqf50$default(PlacementScope r0, Placeable r1, long r2, float r4, int r5, Object r6) {
            if (r6 != null) goto L9;
            if ((r5 & 2) == 0) goto L6;
            r4 = 0.0f;
        L6:
            r0.m5789placeRelative70tqf50(r1, r2, r4);
            return;
        L9:
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: placeRelative-70tqf50");
        }

        /* JADX INFO: renamed from: placeRelative-70tqf50, reason: not valid java name */
        public final void m5789placeRelative70tqf50(Placeable $this$placeRelative_u2d70tqf50, long position, float zIndex) {
            if (access$getParentLayoutDirection(this) != LayoutDirection.Ltr) goto L5;
        L8:
            access$handleMotionFrameOfReferencePlacement(this, $this$placeRelative_u2d70tqf50);
            Placeable.m5771access$placeAtf8xVGno($this$placeRelative_u2d70tqf50, IntOffset.m7105plusqkQi6aY(position, Placeable.m5769access$getApparentToRealOffsetnOccac($this$placeRelative_u2d70tqf50)), zIndex, null);
            return;
        L5:
            if (access$getParentWidth(this) == 0) goto L8;
            int x$iv$iv = (access$getParentWidth(this) - $this$placeRelative_u2d70tqf50.getWidth()) - IntOffset.m7101getXimpl(position);
            int y$iv$iv = IntOffset.m7102getYimpl(position);
            long position$iv$iv = IntOffset.m7095constructorimpl((((long) x$iv$iv) << 32) | (((long) y$iv$iv) & 4294967295L));
            access$handleMotionFrameOfReferencePlacement(this, $this$placeRelative_u2d70tqf50);
            Placeable.m5771access$placeAtf8xVGno($this$placeRelative_u2d70tqf50, IntOffset.m7105plusqkQi6aY(position$iv$iv, Placeable.m5769access$getApparentToRealOffsetnOccac($this$placeRelative_u2d70tqf50)), zIndex, null);
        }

        public static /* synthetic */ void placeRelative$default(PlacementScope r0, Placeable r1, int r2, int r3, float r4, int r5, Object r6) {
            if (r6 != null) goto L9;
            if ((r5 & 4) == 0) goto L6;
            r4 = 0.0f;
        L6:
            r0.placeRelative(r1, r2, r3, r4);
            return;
        L9:
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: placeRelative");
        }

        public final void placeRelative(Placeable $this$placeRelative, int x, int y, float zIndex) {
            long position$iv = IntOffset.m7095constructorimpl((((long) x) << 32) | (((long) y) & 4294967295L));
            if (access$getParentLayoutDirection(this) != LayoutDirection.Ltr) goto L5;
        L8:
            access$handleMotionFrameOfReferencePlacement(this, $this$placeRelative);
            Placeable.m5771access$placeAtf8xVGno($this$placeRelative, IntOffset.m7105plusqkQi6aY(position$iv, Placeable.m5769access$getApparentToRealOffsetnOccac($this$placeRelative)), zIndex, null);
            return;
        L5:
            if (access$getParentWidth(this) == 0) goto L8;
            int x$iv$iv = (access$getParentWidth(this) - $this$placeRelative.getWidth()) - IntOffset.m7101getXimpl(position$iv);
            int y$iv$iv = IntOffset.m7102getYimpl(position$iv);
            long position$iv$iv = IntOffset.m7095constructorimpl((((long) x$iv$iv) << 32) | (((long) y$iv$iv) & 4294967295L));
            access$handleMotionFrameOfReferencePlacement(this, $this$placeRelative);
            Placeable.m5771access$placeAtf8xVGno($this$placeRelative, IntOffset.m7105plusqkQi6aY(position$iv$iv, Placeable.m5769access$getApparentToRealOffsetnOccac($this$placeRelative)), zIndex, null);
        }

        public static /* synthetic */ void place$default(PlacementScope r0, Placeable r1, int r2, int r3, float r4, int r5, Object r6) {
            if (r6 != null) goto L9;
            if ((r5 & 4) == 0) goto L6;
            r4 = 0.0f;
        L6:
            r0.place(r1, r2, r3, r4);
            return;
        L9:
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: place");
        }

        public final void place(Placeable $this$place, int x, int y, float zIndex) {
            long position$iv = IntOffset.m7095constructorimpl((((long) x) << 32) | (((long) y) & 4294967295L));
            access$handleMotionFrameOfReferencePlacement(this, $this$place);
            Placeable.m5771access$placeAtf8xVGno($this$place, IntOffset.m7105plusqkQi6aY(position$iv, Placeable.m5769access$getApparentToRealOffsetnOccac($this$place)), zIndex, null);
        }

        /* JADX INFO: renamed from: place-70tqf50$default, reason: not valid java name */
        public static /* synthetic */ void m5778place70tqf50$default(PlacementScope r0, Placeable r1, long r2, float r4, int r5, Object r6) {
            if (r6 != null) goto L9;
            if ((r5 & 2) == 0) goto L6;
            r4 = 0.0f;
        L6:
            r0.m5784place70tqf50(r1, r2, r4);
            return;
        L9:
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: place-70tqf50");
        }

        /* JADX INFO: renamed from: place-70tqf50, reason: not valid java name */
        public final void m5784place70tqf50(Placeable $this$place_u2d70tqf50, long position, float zIndex) {
            access$handleMotionFrameOfReferencePlacement(this, $this$place_u2d70tqf50);
            Placeable.m5771access$placeAtf8xVGno($this$place_u2d70tqf50, IntOffset.m7105plusqkQi6aY(position, Placeable.m5769access$getApparentToRealOffsetnOccac($this$place_u2d70tqf50)), zIndex, null);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX INFO: renamed from: placeRelativeWithLayer-aW-9-wM$default, reason: not valid java name */
        public static /* synthetic */ void m5780placeRelativeWithLayeraW9wM$default(PlacementScope r6, Placeable r7, long r8, float r10, Function1 r11, int r12, Object r13) {
            if (r13 != null) goto L14;
            if ((r12 & 2) == 0) goto L6;
            float r4 = 0.0f;
        L8:
            if ((r12 & 4) == 0) goto L10;
            Function1 r5 = PlaceableKt.access$getDefaultLayerBlock$p();
        L11:
            r6.m5790placeRelativeWithLayeraW9wM(r7, r8, r4, r5);
            return;
        L10:
            r5 = r11;
            goto L11
        L6:
            r4 = r10;
            goto L8
        L14:
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: placeRelativeWithLayer-aW-9-wM");
        }

        /* JADX INFO: renamed from: placeRelativeWithLayer-aW-9-wM, reason: not valid java name */
        public final void m5790placeRelativeWithLayeraW9wM(Placeable $this$placeRelativeWithLayer_u2daW_u2d9_u2dwM, long position, float zIndex, Function1<? super GraphicsLayerScope, Unit> r20) {
            if (access$getParentLayoutDirection(this) != LayoutDirection.Ltr) goto L5;
        L8:
            access$handleMotionFrameOfReferencePlacement(this, $this$placeRelativeWithLayer_u2daW_u2d9_u2dwM);
            Placeable.m5771access$placeAtf8xVGno($this$placeRelativeWithLayer_u2daW_u2d9_u2dwM, IntOffset.m7105plusqkQi6aY(position, Placeable.m5769access$getApparentToRealOffsetnOccac($this$placeRelativeWithLayer_u2daW_u2d9_u2dwM)), zIndex, r20);
            return;
        L5:
            if (access$getParentWidth(this) == 0) goto L8;
            int x$iv$iv = (access$getParentWidth(this) - $this$placeRelativeWithLayer_u2daW_u2d9_u2dwM.getWidth()) - IntOffset.m7101getXimpl(position);
            int y$iv$iv = IntOffset.m7102getYimpl(position);
            long position$iv$iv = IntOffset.m7095constructorimpl((((long) x$iv$iv) << 32) | (((long) y$iv$iv) & 4294967295L));
            access$handleMotionFrameOfReferencePlacement(this, $this$placeRelativeWithLayer_u2daW_u2d9_u2dwM);
            Placeable.m5771access$placeAtf8xVGno($this$placeRelativeWithLayer_u2daW_u2d9_u2dwM, IntOffset.m7105plusqkQi6aY(position$iv$iv, Placeable.m5769access$getApparentToRealOffsetnOccac($this$placeRelativeWithLayer_u2daW_u2d9_u2dwM)), zIndex, r20);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ void placeRelativeWithLayer$default(PlacementScope r6, Placeable r7, int r8, int r9, float r10, Function1 r11, int r12, Object r13) {
            if (r13 != null) goto L14;
            if ((r12 & 4) == 0) goto L6;
            float r4 = 0.0f;
        L8:
            if ((r12 & 8) == 0) goto L10;
            Function1 r5 = PlaceableKt.access$getDefaultLayerBlock$p();
        L11:
            r6.placeRelativeWithLayer(r7, r8, r9, r4, r5);
            return;
        L10:
            r5 = r11;
            goto L11
        L6:
            r4 = r10;
            goto L8
        L14:
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: placeRelativeWithLayer");
        }

        public final void placeRelativeWithLayer(Placeable $this$placeRelativeWithLayer, int x, int y, float zIndex, Function1<? super GraphicsLayerScope, Unit> r23) {
            long position$iv = IntOffset.m7095constructorimpl((((long) x) << 32) | (((long) y) & 4294967295L));
            if (access$getParentLayoutDirection(this) != LayoutDirection.Ltr) goto L5;
        L8:
            access$handleMotionFrameOfReferencePlacement(this, $this$placeRelativeWithLayer);
            Placeable.m5771access$placeAtf8xVGno($this$placeRelativeWithLayer, IntOffset.m7105plusqkQi6aY(position$iv, Placeable.m5769access$getApparentToRealOffsetnOccac($this$placeRelativeWithLayer)), zIndex, r23);
            return;
        L5:
            if (access$getParentWidth(this) == 0) goto L8;
            int x$iv$iv = (access$getParentWidth(this) - $this$placeRelativeWithLayer.getWidth()) - IntOffset.m7101getXimpl(position$iv);
            int y$iv$iv = IntOffset.m7102getYimpl(position$iv);
            long position$iv$iv = IntOffset.m7095constructorimpl((((long) x$iv$iv) << 32) | (((long) y$iv$iv) & 4294967295L));
            access$handleMotionFrameOfReferencePlacement(this, $this$placeRelativeWithLayer);
            Placeable.m5771access$placeAtf8xVGno($this$placeRelativeWithLayer, IntOffset.m7105plusqkQi6aY(position$iv$iv, Placeable.m5769access$getApparentToRealOffsetnOccac($this$placeRelativeWithLayer)), zIndex, r23);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ void placeWithLayer$default(PlacementScope r6, Placeable r7, int r8, int r9, float r10, Function1 r11, int r12, Object r13) {
            if (r13 != null) goto L14;
            if ((r12 & 4) == 0) goto L6;
            float r4 = 0.0f;
        L8:
            if ((r12 & 8) == 0) goto L10;
            Function1 r5 = PlaceableKt.access$getDefaultLayerBlock$p();
        L11:
            r6.placeWithLayer(r7, r8, r9, r4, r5);
            return;
        L10:
            r5 = r11;
            goto L11
        L6:
            r4 = r10;
            goto L8
        L14:
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: placeWithLayer");
        }

        public final void placeWithLayer(Placeable $this$placeWithLayer, int x, int y, float zIndex, Function1<? super GraphicsLayerScope, Unit> r13) {
            long position$iv = IntOffset.m7095constructorimpl((((long) x) << 32) | (((long) y) & 4294967295L));
            access$handleMotionFrameOfReferencePlacement(this, $this$placeWithLayer);
            Placeable.m5771access$placeAtf8xVGno($this$placeWithLayer, IntOffset.m7105plusqkQi6aY(position$iv, Placeable.m5769access$getApparentToRealOffsetnOccac($this$placeWithLayer)), zIndex, r13);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX INFO: renamed from: placeWithLayer-aW-9-wM$default, reason: not valid java name */
        public static /* synthetic */ void m5782placeWithLayeraW9wM$default(PlacementScope r6, Placeable r7, long r8, float r10, Function1 r11, int r12, Object r13) {
            if (r13 != null) goto L14;
            if ((r12 & 2) == 0) goto L6;
            float r4 = 0.0f;
        L8:
            if ((r12 & 4) == 0) goto L10;
            Function1 r5 = PlaceableKt.access$getDefaultLayerBlock$p();
        L11:
            r6.m5792placeWithLayeraW9wM(r7, r8, r4, r5);
            return;
        L10:
            r5 = r11;
            goto L11
        L6:
            r4 = r10;
            goto L8
        L14:
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: placeWithLayer-aW-9-wM");
        }

        /* JADX INFO: renamed from: placeWithLayer-aW-9-wM, reason: not valid java name */
        public final void m5792placeWithLayeraW9wM(Placeable $this$placeWithLayer_u2daW_u2d9_u2dwM, long position, float zIndex, Function1<? super GraphicsLayerScope, Unit> r10) {
            access$handleMotionFrameOfReferencePlacement(this, $this$placeWithLayer_u2daW_u2d9_u2dwM);
            Placeable.m5771access$placeAtf8xVGno($this$placeWithLayer_u2daW_u2d9_u2dwM, IntOffset.m7105plusqkQi6aY(position, Placeable.m5769access$getApparentToRealOffsetnOccac($this$placeWithLayer_u2daW_u2d9_u2dwM)), zIndex, r10);
        }

        public static /* synthetic */ void placeWithLayer$default(PlacementScope r6, Placeable r7, int r8, int r9, GraphicsLayer r10, float r11, int r12, Object r13) {
            if (r13 != null) goto L10;
            if ((r12 & 8) == 0) goto L6;
            float r5 = 0.0f;
        L7:
            r6.placeWithLayer(r7, r8, r9, r10, r5);
            return;
        L6:
            r5 = r11;
            goto L7
        L10:
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: placeWithLayer");
        }

        public final void placeWithLayer(Placeable $this$placeWithLayer, int x, int y, GraphicsLayer layer, float zIndex) {
            long position$iv = IntOffset.m7095constructorimpl((((long) x) << 32) | (((long) y) & 4294967295L));
            access$handleMotionFrameOfReferencePlacement(this, $this$placeWithLayer);
            Placeable.m5770access$placeAtf8xVGno($this$placeWithLayer, IntOffset.m7105plusqkQi6aY(position$iv, Placeable.m5769access$getApparentToRealOffsetnOccac($this$placeWithLayer)), zIndex, layer);
        }

        /* JADX INFO: renamed from: placeWithLayer-aW-9-wM$default, reason: not valid java name */
        public static /* synthetic */ void m5783placeWithLayeraW9wM$default(PlacementScope r6, Placeable r7, long r8, GraphicsLayer r10, float r11, int r12, Object r13) {
            if (r13 != null) goto L10;
            if ((r12 & 4) == 0) goto L6;
            float r5 = 0.0f;
        L7:
            r6.m5793placeWithLayeraW9wM(r7, r8, r10, r5);
            return;
        L6:
            r5 = r11;
            goto L7
        L10:
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: placeWithLayer-aW-9-wM");
        }

        /* JADX INFO: renamed from: placeWithLayer-aW-9-wM, reason: not valid java name */
        public final void m5793placeWithLayeraW9wM(Placeable $this$placeWithLayer_u2daW_u2d9_u2dwM, long position, GraphicsLayer layer, float zIndex) {
            access$handleMotionFrameOfReferencePlacement(this, $this$placeWithLayer_u2daW_u2d9_u2dwM);
            Placeable.m5770access$placeAtf8xVGno($this$placeWithLayer_u2daW_u2d9_u2dwM, IntOffset.m7105plusqkQi6aY(position, Placeable.m5769access$getApparentToRealOffsetnOccac($this$placeWithLayer_u2daW_u2d9_u2dwM)), zIndex, layer);
        }

        public static /* synthetic */ void placeRelativeWithLayer$default(PlacementScope r6, Placeable r7, int r8, int r9, GraphicsLayer r10, float r11, int r12, Object r13) {
            if (r13 != null) goto L10;
            if ((r12 & 8) == 0) goto L6;
            float r5 = 0.0f;
        L7:
            r6.placeRelativeWithLayer(r7, r8, r9, r10, r5);
            return;
        L6:
            r5 = r11;
            goto L7
        L10:
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: placeRelativeWithLayer");
        }

        public final void placeRelativeWithLayer(Placeable $this$placeRelativeWithLayer, int x, int y, GraphicsLayer layer, float zIndex) {
            long position$iv = IntOffset.m7095constructorimpl((((long) x) << 32) | (((long) y) & 4294967295L));
            if (access$getParentLayoutDirection(this) != LayoutDirection.Ltr) goto L5;
        L8:
            access$handleMotionFrameOfReferencePlacement(this, $this$placeRelativeWithLayer);
            Placeable.m5770access$placeAtf8xVGno($this$placeRelativeWithLayer, IntOffset.m7105plusqkQi6aY(position$iv, Placeable.m5769access$getApparentToRealOffsetnOccac($this$placeRelativeWithLayer)), zIndex, layer);
            return;
        L5:
            if (access$getParentWidth(this) == 0) goto L8;
            int x$iv$iv = (access$getParentWidth(this) - $this$placeRelativeWithLayer.getWidth()) - IntOffset.m7101getXimpl(position$iv);
            int y$iv$iv = IntOffset.m7102getYimpl(position$iv);
            long position$iv$iv = IntOffset.m7095constructorimpl((((long) x$iv$iv) << 32) | (((long) y$iv$iv) & 4294967295L));
            access$handleMotionFrameOfReferencePlacement(this, $this$placeRelativeWithLayer);
            Placeable.m5770access$placeAtf8xVGno($this$placeRelativeWithLayer, IntOffset.m7105plusqkQi6aY(position$iv$iv, Placeable.m5769access$getApparentToRealOffsetnOccac($this$placeRelativeWithLayer)), zIndex, layer);
        }

        /* JADX INFO: renamed from: placeRelativeWithLayer-aW-9-wM$default, reason: not valid java name */
        public static /* synthetic */ void m5781placeRelativeWithLayeraW9wM$default(PlacementScope r6, Placeable r7, long r8, GraphicsLayer r10, float r11, int r12, Object r13) {
            if (r13 != null) goto L10;
            if ((r12 & 4) == 0) goto L6;
            float r5 = 0.0f;
        L7:
            r6.m5791placeRelativeWithLayeraW9wM(r7, r8, r10, r5);
            return;
        L6:
            r5 = r11;
            goto L7
        L10:
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: placeRelativeWithLayer-aW-9-wM");
        }

        /* JADX INFO: renamed from: placeRelativeWithLayer-aW-9-wM, reason: not valid java name */
        public final void m5791placeRelativeWithLayeraW9wM(Placeable $this$placeRelativeWithLayer_u2daW_u2d9_u2dwM, long position, GraphicsLayer layer, float zIndex) {
            if (access$getParentLayoutDirection(this) != LayoutDirection.Ltr) goto L5;
        L8:
            access$handleMotionFrameOfReferencePlacement(this, $this$placeRelativeWithLayer_u2daW_u2d9_u2dwM);
            Placeable.m5770access$placeAtf8xVGno($this$placeRelativeWithLayer_u2daW_u2d9_u2dwM, IntOffset.m7105plusqkQi6aY(position, Placeable.m5769access$getApparentToRealOffsetnOccac($this$placeRelativeWithLayer_u2daW_u2d9_u2dwM)), zIndex, layer);
            return;
        L5:
            if (access$getParentWidth(this) == 0) goto L8;
            int x$iv$iv = (access$getParentWidth(this) - $this$placeRelativeWithLayer_u2daW_u2d9_u2dwM.getWidth()) - IntOffset.m7101getXimpl(position);
            int y$iv$iv = IntOffset.m7102getYimpl(position);
            long position$iv$iv = IntOffset.m7095constructorimpl((((long) x$iv$iv) << 32) | (((long) y$iv$iv) & 4294967295L));
            access$handleMotionFrameOfReferencePlacement(this, $this$placeRelativeWithLayer_u2daW_u2d9_u2dwM);
            Placeable.m5770access$placeAtf8xVGno($this$placeRelativeWithLayer_u2daW_u2d9_u2dwM, IntOffset.m7105plusqkQi6aY(position$iv$iv, Placeable.m5769access$getApparentToRealOffsetnOccac($this$placeRelativeWithLayer_u2daW_u2d9_u2dwM)), zIndex, layer);
        }

        /* JADX INFO: renamed from: placeAutoMirrored-aW-9-wM$ui_release, reason: not valid java name */
        public final void m5788placeAutoMirroredaW9wM$ui_release(Placeable $this$placeAutoMirrored_u2daW_u2d9_u2dwM, long position, float zIndex, Function1<? super GraphicsLayerScope, Unit> r18) {
            if (access$getParentLayoutDirection(this) != LayoutDirection.Ltr) goto L5;
        L8:
            access$handleMotionFrameOfReferencePlacement(this, $this$placeAutoMirrored_u2daW_u2d9_u2dwM);
            Placeable.m5771access$placeAtf8xVGno($this$placeAutoMirrored_u2daW_u2d9_u2dwM, IntOffset.m7105plusqkQi6aY(position, Placeable.m5769access$getApparentToRealOffsetnOccac($this$placeAutoMirrored_u2daW_u2d9_u2dwM)), zIndex, r18);
            return;
        L5:
            if (access$getParentWidth(this) == 0) goto L8;
            int x$iv = (access$getParentWidth(this) - $this$placeAutoMirrored_u2daW_u2d9_u2dwM.getWidth()) - IntOffset.m7101getXimpl(position);
            int y$iv = IntOffset.m7102getYimpl(position);
            long position$iv = IntOffset.m7095constructorimpl((((long) x$iv) << 32) | (((long) y$iv) & 4294967295L));
            access$handleMotionFrameOfReferencePlacement(this, $this$placeAutoMirrored_u2daW_u2d9_u2dwM);
            Placeable.m5771access$placeAtf8xVGno($this$placeAutoMirrored_u2daW_u2d9_u2dwM, IntOffset.m7105plusqkQi6aY(position$iv, Placeable.m5769access$getApparentToRealOffsetnOccac($this$placeAutoMirrored_u2daW_u2d9_u2dwM)), zIndex, r18);
        }

        /* JADX INFO: renamed from: placeAutoMirrored-aW-9-wM$ui_release, reason: not valid java name */
        public final void m5787placeAutoMirroredaW9wM$ui_release(Placeable $this$placeAutoMirrored_u2daW_u2d9_u2dwM, long position, float zIndex, GraphicsLayer layer) {
            if (access$getParentLayoutDirection(this) != LayoutDirection.Ltr) goto L5;
        L8:
            access$handleMotionFrameOfReferencePlacement(this, $this$placeAutoMirrored_u2daW_u2d9_u2dwM);
            Placeable.m5770access$placeAtf8xVGno($this$placeAutoMirrored_u2daW_u2d9_u2dwM, IntOffset.m7105plusqkQi6aY(position, Placeable.m5769access$getApparentToRealOffsetnOccac($this$placeAutoMirrored_u2daW_u2d9_u2dwM)), zIndex, layer);
            return;
        L5:
            if (access$getParentWidth(this) == 0) goto L8;
            int x$iv = (access$getParentWidth(this) - $this$placeAutoMirrored_u2daW_u2d9_u2dwM.getWidth()) - IntOffset.m7101getXimpl(position);
            int y$iv = IntOffset.m7102getYimpl(position);
            long position$iv = IntOffset.m7095constructorimpl((((long) x$iv) << 32) | (((long) y$iv) & 4294967295L));
            access$handleMotionFrameOfReferencePlacement(this, $this$placeAutoMirrored_u2daW_u2d9_u2dwM);
            Placeable.m5770access$placeAtf8xVGno($this$placeAutoMirrored_u2daW_u2d9_u2dwM, IntOffset.m7105plusqkQi6aY(position$iv, Placeable.m5769access$getApparentToRealOffsetnOccac($this$placeAutoMirrored_u2daW_u2d9_u2dwM)), zIndex, layer);
        }

        /* JADX INFO: renamed from: placeApparentToRealOffset-aW-9-wM$ui_release, reason: not valid java name */
        public final void m5786placeApparentToRealOffsetaW9wM$ui_release(Placeable $this$placeApparentToRealOffset_u2daW_u2d9_u2dwM, long position, float zIndex, Function1<? super GraphicsLayerScope, Unit> r8) {
            access$handleMotionFrameOfReferencePlacement(this, $this$placeApparentToRealOffset_u2daW_u2d9_u2dwM);
            Placeable.m5771access$placeAtf8xVGno($this$placeApparentToRealOffset_u2daW_u2d9_u2dwM, IntOffset.m7105plusqkQi6aY(position, Placeable.m5769access$getApparentToRealOffsetnOccac($this$placeApparentToRealOffset_u2daW_u2d9_u2dwM)), zIndex, r8);
        }

        /* JADX INFO: renamed from: placeApparentToRealOffset-aW-9-wM$ui_release, reason: not valid java name */
        public final void m5785placeApparentToRealOffsetaW9wM$ui_release(Placeable $this$placeApparentToRealOffset_u2daW_u2d9_u2dwM, long position, float zIndex, GraphicsLayer layer) {
            access$handleMotionFrameOfReferencePlacement(this, $this$placeApparentToRealOffset_u2daW_u2d9_u2dwM);
            Placeable.m5770access$placeAtf8xVGno($this$placeApparentToRealOffset_u2daW_u2d9_u2dwM, IntOffset.m7105plusqkQi6aY(position, Placeable.m5769access$getApparentToRealOffsetnOccac($this$placeApparentToRealOffset_u2daW_u2d9_u2dwM)), zIndex, layer);
        }

        public final void withMotionFrameOfReferencePlacement(Function1<? super PlacementScope, Unit> r2) {
            this.motionFrameOfReferencePlacement = true;
            r2.invoke(this);
            this.motionFrameOfReferencePlacement = false;
        }

        /* JADX WARN: Multi-variable type inference failed */
        private final void handleMotionFrameOfReferencePlacement(Placeable r3) {
            if ((r3 instanceof MotionReferencePlacementDelegate) == false) goto L6;
            ((MotionReferencePlacementDelegate) r3).updatePlacedUnderMotionFrameOfReference(this.motionFrameOfReferencePlacement);
            return;
        }
    }

    static {
        $stable = 8;
    }

    /* JADX INFO: renamed from: placeAt-f8xVGno */
    protected abstract void mo5715placeAtf8xVGno(long r1, float r3, Function1<? super GraphicsLayerScope, Unit> r4);

    public Placeable() {
        this.measuredSize = IntSize.m7139constructorimpl((((long) 0) << 32) | (((long) 0) & 4294967295L));
        this.measurementConstraints = PlaceableKt.access$getDefaultConstraints$p();
        this.apparentToRealOffset = IntOffset.Companion.m7112getZeronOccac();
    }

    /* JADX INFO: renamed from: access$getApparentToRealOffset-nOcc-ac, reason: not valid java name */
    public static final /* synthetic */ long m5769access$getApparentToRealOffsetnOccac(Placeable $this) {
        return $this.apparentToRealOffset;
    }

    /* JADX INFO: renamed from: access$placeAt-f8xVGno, reason: not valid java name */
    public static final /* synthetic */ void m5770access$placeAtf8xVGno(Placeable $this, long position, float zIndex, GraphicsLayer layer) {
        $this.mo5775placeAtf8xVGno(position, zIndex, layer);
    }

    /* JADX INFO: renamed from: access$placeAt-f8xVGno, reason: not valid java name */
    public static final /* synthetic */ void m5771access$placeAtf8xVGno(Placeable $this, long position, float zIndex, Function1 layerBlock) {
        $this.mo5715placeAtf8xVGno(position, zIndex, layerBlock);
    }

    public final int getWidth() {
        return this.width;
    }

    public final int getHeight() {
        return this.height;
    }

    @Override // androidx.compose.ui.layout.Measured
    public int getMeasuredWidth() {
        long arg0$iv = this.measuredSize;
        return (int) (arg0$iv >> 32);
    }

    @Override // androidx.compose.ui.layout.Measured
    public int getMeasuredHeight() {
        long arg0$iv = this.measuredSize;
        return (int) (4294967295L & arg0$iv);
    }

    /* JADX INFO: renamed from: getMeasuredSize-YbymL2g, reason: not valid java name */
    protected final long m5773getMeasuredSizeYbymL2g() {
        return this.measuredSize;
    }

    /* JADX INFO: renamed from: setMeasuredSize-ozmzZPI, reason: not valid java name */
    protected final void m5776setMeasuredSizeozmzZPI(long value) {
        if (IntSize.m7142equalsimpl0(this.measuredSize, value) == true) goto L6;
        this.measuredSize = value;
        onMeasuredSizeChanged();
        return;
    }

    private final void onMeasuredSizeChanged() {
        long arg0$iv = this.measuredSize;
        int r3 = (int) (arg0$iv >> 32);
        long arg0$iv2 = this.measurementConstraints;
        this.width = RangesKt.coerceIn(r3, Constraints.m6928getMinWidthimpl(arg0$iv2), Constraints.m6926getMaxWidthimpl(this.measurementConstraints));
        long arg0$iv3 = this.measuredSize;
        int r4 = (int) (arg0$iv3 & 4294967295L);
        long arg0$iv4 = this.measurementConstraints;
        this.height = RangesKt.coerceIn(r4, Constraints.m6927getMinHeightimpl(arg0$iv4), Constraints.m6925getMaxHeightimpl(this.measurementConstraints));
        int r0 = this.width;
        long arg0$iv5 = this.measuredSize;
        int x$iv = (r0 - ((int) (arg0$iv5 >> 32))) / 2;
        int r1 = this.height;
        long arg0$iv6 = this.measuredSize;
        int $i$f$unpackInt2 = (int) (arg0$iv6 & 4294967295L);
        int y$iv = (r1 - $i$f$unpackInt2) / 2;
        this.apparentToRealOffset = IntOffset.m7095constructorimpl((((long) x$iv) << 32) | (((long) y$iv) & 4294967295L));
    }

    /* JADX INFO: renamed from: placeAt-f8xVGno, reason: not valid java name */
    protected void mo5775placeAtf8xVGno(long position, float zIndex, GraphicsLayer layer) {
        mo5715placeAtf8xVGno(position, zIndex, null);
    }

    /* JADX INFO: renamed from: getMeasurementConstraints-msEJaDk, reason: not valid java name */
    protected final long m5774getMeasurementConstraintsmsEJaDk() {
        return this.measurementConstraints;
    }

    /* JADX INFO: renamed from: setMeasurementConstraints-BRTryo0, reason: not valid java name */
    protected final void m5777setMeasurementConstraintsBRTryo0(long value) {
        if (Constraints.m6919equalsimpl0(this.measurementConstraints, value) == true) goto L6;
        this.measurementConstraints = value;
        onMeasuredSizeChanged();
        return;
    }

    /* JADX INFO: renamed from: getApparentToRealOffset-nOcc-ac, reason: not valid java name */
    protected final long m5772getApparentToRealOffsetnOccac() {
        return this.apparentToRealOffset;
    }
}
