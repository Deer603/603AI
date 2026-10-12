package androidx.compose.foundation.layout;

import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.InspectableValueKt;
import androidx.compose.ui.platform.InspectorInfo;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.DpSize;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Size.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000H\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a*\u0010\u000b\u001a\u00020\f*\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u000eH\u0007ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011\u001a\u0016\u0010\u0012\u001a\u00020\f*\u00020\f2\b\b\u0003\u0010\u0013\u001a\u00020\u0014H\u0007\u001a\u0016\u0010\u0015\u001a\u00020\f*\u00020\f2\b\b\u0003\u0010\u0013\u001a\u00020\u0014H\u0007\u001a\u0016\u0010\u0016\u001a\u00020\f*\u00020\f2\b\b\u0003\u0010\u0013\u001a\u00020\u0014H\u0007\u001a\u001e\u0010\u0017\u001a\u00020\f*\u00020\f2\u0006\u0010\u0017\u001a\u00020\u000eH\u0007ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0019\u001a*\u0010\u001a\u001a\u00020\f*\u00020\f2\b\b\u0002\u0010\u001b\u001a\u00020\u000e2\b\b\u0002\u0010\u001c\u001a\u00020\u000eH\u0007ø\u0001\u0000¢\u0006\u0004\b\u001d\u0010\u0011\u001a\u001e\u0010\u001e\u001a\u00020\f*\u00020\f2\u0006\u0010\u0017\u001a\u00020\u000eH\u0007ø\u0001\u0000¢\u0006\u0004\b\u001f\u0010\u0019\u001a*\u0010 \u001a\u00020\f*\u00020\f2\b\b\u0002\u0010\u001b\u001a\u00020\u000e2\b\b\u0002\u0010\u001c\u001a\u00020\u000eH\u0007ø\u0001\u0000¢\u0006\u0004\b!\u0010\u0011\u001a\u001e\u0010\"\u001a\u00020\f*\u00020\f2\u0006\u0010#\u001a\u00020\u000eH\u0007ø\u0001\u0000¢\u0006\u0004\b$\u0010\u0019\u001a&\u0010\"\u001a\u00020\f*\u00020\f2\u0006\u0010%\u001a\u00020\u000e2\u0006\u0010\u0017\u001a\u00020\u000eH\u0007ø\u0001\u0000¢\u0006\u0004\b&\u0010\u0011\u001a\u001e\u0010\"\u001a\u00020\f*\u00020\f2\u0006\u0010#\u001a\u00020'H\u0007ø\u0001\u0000¢\u0006\u0004\b(\u0010)\u001a>\u0010*\u001a\u00020\f*\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010+\u001a\u00020\u000e2\b\b\u0002\u0010,\u001a\u00020\u000eH\u0007ø\u0001\u0000¢\u0006\u0004\b-\u0010.\u001a\u001e\u0010/\u001a\u00020\f*\u00020\f2\u0006\u0010%\u001a\u00020\u000eH\u0007ø\u0001\u0000¢\u0006\u0004\b0\u0010\u0019\u001a*\u00101\u001a\u00020\f*\u00020\f2\b\b\u0002\u0010\u001b\u001a\u00020\u000e2\b\b\u0002\u0010\u001c\u001a\u00020\u000eH\u0007ø\u0001\u0000¢\u0006\u0004\b2\u0010\u0011\u001a\u001e\u0010#\u001a\u00020\f*\u00020\f2\u0006\u0010#\u001a\u00020\u000eH\u0007ø\u0001\u0000¢\u0006\u0004\b3\u0010\u0019\u001a&\u0010#\u001a\u00020\f*\u00020\f2\u0006\u0010%\u001a\u00020\u000e2\u0006\u0010\u0017\u001a\u00020\u000eH\u0007ø\u0001\u0000¢\u0006\u0004\b4\u0010\u0011\u001a\u001e\u0010#\u001a\u00020\f*\u00020\f2\u0006\u0010#\u001a\u00020'H\u0007ø\u0001\u0000¢\u0006\u0004\b5\u0010)\u001a>\u00106\u001a\u00020\f*\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010+\u001a\u00020\u000e2\b\b\u0002\u0010,\u001a\u00020\u000eH\u0007ø\u0001\u0000¢\u0006\u0004\b7\u0010.\u001a\u001e\u0010%\u001a\u00020\f*\u00020\f2\u0006\u0010%\u001a\u00020\u000eH\u0007ø\u0001\u0000¢\u0006\u0004\b8\u0010\u0019\u001a*\u00109\u001a\u00020\f*\u00020\f2\b\b\u0002\u0010\u001b\u001a\u00020\u000e2\b\b\u0002\u0010\u001c\u001a\u00020\u000eH\u0007ø\u0001\u0000¢\u0006\u0004\b:\u0010\u0011\u001a \u0010;\u001a\u00020\f*\u00020\f2\b\b\u0002\u0010<\u001a\u00020=2\b\b\u0002\u0010>\u001a\u00020?H\u0007\u001a \u0010@\u001a\u00020\f*\u00020\f2\b\b\u0002\u0010<\u001a\u00020A2\b\b\u0002\u0010>\u001a\u00020?H\u0007\u001a \u0010B\u001a\u00020\f*\u00020\f2\b\b\u0002\u0010<\u001a\u00020C2\b\b\u0002\u0010>\u001a\u00020?H\u0007\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\u0003\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\u0006\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\u0007\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\b\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\t\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\n\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006D"}, d2 = {"FillWholeMaxHeight", "Landroidx/compose/foundation/layout/FillElement;", "FillWholeMaxSize", "FillWholeMaxWidth", "WrapContentHeightCenter", "Landroidx/compose/foundation/layout/WrapContentElement;", "WrapContentHeightTop", "WrapContentSizeCenter", "WrapContentSizeTopStart", "WrapContentWidthCenter", "WrapContentWidthStart", "defaultMinSize", "Landroidx/compose/ui/Modifier;", "minWidth", "Landroidx/compose/ui/unit/Dp;", "minHeight", "defaultMinSize-VpY3zN4", "(Landroidx/compose/ui/Modifier;FF)Landroidx/compose/ui/Modifier;", "fillMaxHeight", "fraction", "", "fillMaxSize", "fillMaxWidth", "height", "height-3ABfNKs", "(Landroidx/compose/ui/Modifier;F)Landroidx/compose/ui/Modifier;", "heightIn", "min", "max", "heightIn-VpY3zN4", "requiredHeight", "requiredHeight-3ABfNKs", "requiredHeightIn", "requiredHeightIn-VpY3zN4", "requiredSize", "size", "requiredSize-3ABfNKs", "width", "requiredSize-VpY3zN4", "Landroidx/compose/ui/unit/DpSize;", "requiredSize-6HolHcs", "(Landroidx/compose/ui/Modifier;J)Landroidx/compose/ui/Modifier;", "requiredSizeIn", "maxWidth", "maxHeight", "requiredSizeIn-qDBjuR0", "(Landroidx/compose/ui/Modifier;FFFF)Landroidx/compose/ui/Modifier;", "requiredWidth", "requiredWidth-3ABfNKs", "requiredWidthIn", "requiredWidthIn-VpY3zN4", "size-3ABfNKs", "size-VpY3zN4", "size-6HolHcs", "sizeIn", "sizeIn-qDBjuR0", "width-3ABfNKs", "widthIn", "widthIn-VpY3zN4", "wrapContentHeight", "align", "Landroidx/compose/ui/Alignment$Vertical;", "unbounded", "", "wrapContentSize", "Landroidx/compose/ui/Alignment;", "wrapContentWidth", "Landroidx/compose/ui/Alignment$Horizontal;", "foundation-layout_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class SizeKt {
    private static final FillElement FillWholeMaxHeight = null;
    private static final FillElement FillWholeMaxSize = null;
    private static final FillElement FillWholeMaxWidth = null;
    private static final WrapContentElement WrapContentHeightCenter = null;
    private static final WrapContentElement WrapContentHeightTop = null;
    private static final WrapContentElement WrapContentSizeCenter = null;
    private static final WrapContentElement WrapContentSizeTopStart = null;
    private static final WrapContentElement WrapContentWidthCenter = null;
    private static final WrapContentElement WrapContentWidthStart = null;

    /* JADX INFO: renamed from: width-3ABfNKs, reason: not valid java name */
    public static final Modifier m777width3ABfNKs(Modifier $this$width_u2d3ABfNKs, final float width) {
        if (InspectableValueKt.isDebugInspectorInfoEnabled() == false) goto L5;
        Function1<InspectorInfo, Unit> r2 = new SizeKt$width3ABfNKs$$inlined$debugInspectorInfo$1(width);
    L7:
        return $this$width_u2d3ABfNKs.then(new SizeElement(width, 0.0f, width, 0.0f, true, r2, 10, null));
    L5:
        r2 = InspectableValueKt.getNoInspectorInfo();
        goto L7
    }

    /* JADX INFO: renamed from: height-3ABfNKs, reason: not valid java name */
    public static final Modifier m758height3ABfNKs(Modifier $this$height_u2d3ABfNKs, final float height) {
        if (InspectableValueKt.isDebugInspectorInfoEnabled() == false) goto L5;
        Function1<InspectorInfo, Unit> r2 = new SizeKt$height3ABfNKs$$inlined$debugInspectorInfo$1(height);
    L7:
        return $this$height_u2d3ABfNKs.then(new SizeElement(0.0f, height, 0.0f, height, true, r2, 5, null));
    L5:
        r2 = InspectableValueKt.getNoInspectorInfo();
        goto L7
    }

    /* JADX INFO: renamed from: size-3ABfNKs, reason: not valid java name */
    public static final Modifier m772size3ABfNKs(Modifier $this$size_u2d3ABfNKs, final float size) {
        if (InspectableValueKt.isDebugInspectorInfoEnabled() == false) goto L5;
        Function1<InspectorInfo, Unit> r1 = new SizeKt$size3ABfNKs$$inlined$debugInspectorInfo$1(size);
    L7:
        return $this$size_u2d3ABfNKs.then(new SizeElement(size, size, size, size, true, r1, null));
    L5:
        r1 = InspectableValueKt.getNoInspectorInfo();
        goto L7
    }

    /* JADX INFO: renamed from: size-VpY3zN4, reason: not valid java name */
    public static final Modifier m774sizeVpY3zN4(Modifier $this$size_u2dVpY3zN4, final float width, final float height) {
        if (InspectableValueKt.isDebugInspectorInfoEnabled() == false) goto L5;
        Function1<InspectorInfo, Unit> r1 = new SizeKt$sizeVpY3zN4$$inlined$debugInspectorInfo$1(width, height);
    L7:
        return $this$size_u2dVpY3zN4.then(new SizeElement(width, height, width, height, true, r1, null));
    L5:
        r1 = InspectableValueKt.getNoInspectorInfo();
        goto L7
    }

    /* JADX INFO: renamed from: size-6HolHcs, reason: not valid java name */
    public static final Modifier m773size6HolHcs(Modifier $this$size_u2d6HolHcs, long size) {
        return m774sizeVpY3zN4($this$size_u2d6HolHcs, DpSize.m7071getWidthD9Ej5fM(size), DpSize.m7069getHeightD9Ej5fM(size));
    }

    /* JADX INFO: renamed from: widthIn-VpY3zN4$default, reason: not valid java name */
    public static /* synthetic */ Modifier m779widthInVpY3zN4$default(Modifier r0, float r1, float r2, int r3, Object r4) {
        if ((r3 & 1) == 0) goto L6;
        r1 = Dp.Companion.m6993getUnspecifiedD9Ej5fM();
    L6:
        if ((r3 & 2) == 0) goto L9;
        r2 = Dp.Companion.m6993getUnspecifiedD9Ej5fM();
    L9:
        return m778widthInVpY3zN4(r0, r1, r2);
    }

    /* JADX INFO: renamed from: widthIn-VpY3zN4, reason: not valid java name */
    public static final Modifier m778widthInVpY3zN4(Modifier $this$widthIn_u2dVpY3zN4, final float min, final float max) {
        if (InspectableValueKt.isDebugInspectorInfoEnabled() == false) goto L5;
        Function1<InspectorInfo, Unit> r2 = new SizeKt$widthInVpY3zN4$$inlined$debugInspectorInfo$1(min, max);
    L7:
        return $this$widthIn_u2dVpY3zN4.then(new SizeElement(min, 0.0f, max, 0.0f, true, r2, 10, null));
    L5:
        r2 = InspectableValueKt.getNoInspectorInfo();
        goto L7
    }

    /* JADX INFO: renamed from: heightIn-VpY3zN4$default, reason: not valid java name */
    public static /* synthetic */ Modifier m760heightInVpY3zN4$default(Modifier r0, float r1, float r2, int r3, Object r4) {
        if ((r3 & 1) == 0) goto L6;
        r1 = Dp.Companion.m6993getUnspecifiedD9Ej5fM();
    L6:
        if ((r3 & 2) == 0) goto L9;
        r2 = Dp.Companion.m6993getUnspecifiedD9Ej5fM();
    L9:
        return m759heightInVpY3zN4(r0, r1, r2);
    }

    /* JADX INFO: renamed from: heightIn-VpY3zN4, reason: not valid java name */
    public static final Modifier m759heightInVpY3zN4(Modifier $this$heightIn_u2dVpY3zN4, final float min, final float max) {
        if (InspectableValueKt.isDebugInspectorInfoEnabled() == false) goto L5;
        Function1<InspectorInfo, Unit> r2 = new SizeKt$heightInVpY3zN4$$inlined$debugInspectorInfo$1(min, max);
    L7:
        return $this$heightIn_u2dVpY3zN4.then(new SizeElement(0.0f, min, 0.0f, max, true, r2, 5, null));
    L5:
        r2 = InspectableValueKt.getNoInspectorInfo();
        goto L7
    }

    /* JADX INFO: renamed from: sizeIn-qDBjuR0$default, reason: not valid java name */
    public static /* synthetic */ Modifier m776sizeInqDBjuR0$default(Modifier r0, float r1, float r2, float r3, float r4, int r5, Object r6) {
        if ((r5 & 1) == 0) goto L6;
        r1 = Dp.Companion.m6993getUnspecifiedD9Ej5fM();
    L6:
        if ((r5 & 2) == 0) goto L9;
        r2 = Dp.Companion.m6993getUnspecifiedD9Ej5fM();
    L9:
        if ((r5 & 4) == 0) goto L12;
        r3 = Dp.Companion.m6993getUnspecifiedD9Ej5fM();
    L12:
        if ((r5 & 8) == 0) goto L15;
        r4 = Dp.Companion.m6993getUnspecifiedD9Ej5fM();
    L15:
        return m775sizeInqDBjuR0(r0, r1, r2, r3, r4);
    }

    /* JADX INFO: renamed from: sizeIn-qDBjuR0, reason: not valid java name */
    public static final Modifier m775sizeInqDBjuR0(Modifier $this$sizeIn_u2dqDBjuR0, final float minWidth, final float minHeight, final float maxWidth, final float maxHeight) {
        if (InspectableValueKt.isDebugInspectorInfoEnabled() == false) goto L5;
        Function1<InspectorInfo, Unit> r2 = new SizeKt$sizeInqDBjuR0$$inlined$debugInspectorInfo$1(minWidth, minHeight, maxWidth, maxHeight);
    L7:
        return $this$sizeIn_u2dqDBjuR0.then(new SizeElement(minWidth, minHeight, maxWidth, maxHeight, true, r2, null));
    L5:
        r2 = InspectableValueKt.getNoInspectorInfo();
        goto L7
    }

    /* JADX INFO: renamed from: requiredWidth-3ABfNKs, reason: not valid java name */
    public static final Modifier m769requiredWidth3ABfNKs(Modifier $this$requiredWidth_u2d3ABfNKs, final float width) {
        if (InspectableValueKt.isDebugInspectorInfoEnabled() == false) goto L5;
        Function1<InspectorInfo, Unit> r2 = new SizeKt$requiredWidth3ABfNKs$$inlined$debugInspectorInfo$1(width);
    L7:
        return $this$requiredWidth_u2d3ABfNKs.then(new SizeElement(width, 0.0f, width, 0.0f, false, r2, 10, null));
    L5:
        r2 = InspectableValueKt.getNoInspectorInfo();
        goto L7
    }

    /* JADX INFO: renamed from: requiredHeight-3ABfNKs, reason: not valid java name */
    public static final Modifier m761requiredHeight3ABfNKs(Modifier $this$requiredHeight_u2d3ABfNKs, final float height) {
        if (InspectableValueKt.isDebugInspectorInfoEnabled() == false) goto L5;
        Function1<InspectorInfo, Unit> r2 = new SizeKt$requiredHeight3ABfNKs$$inlined$debugInspectorInfo$1(height);
    L7:
        return $this$requiredHeight_u2d3ABfNKs.then(new SizeElement(0.0f, height, 0.0f, height, false, r2, 5, null));
    L5:
        r2 = InspectableValueKt.getNoInspectorInfo();
        goto L7
    }

    /* JADX INFO: renamed from: requiredSize-3ABfNKs, reason: not valid java name */
    public static final Modifier m764requiredSize3ABfNKs(Modifier $this$requiredSize_u2d3ABfNKs, final float size) {
        if (InspectableValueKt.isDebugInspectorInfoEnabled() == false) goto L5;
        Function1<InspectorInfo, Unit> r1 = new SizeKt$requiredSize3ABfNKs$$inlined$debugInspectorInfo$1(size);
    L7:
        return $this$requiredSize_u2d3ABfNKs.then(new SizeElement(size, size, size, size, false, r1, null));
    L5:
        r1 = InspectableValueKt.getNoInspectorInfo();
        goto L7
    }

    /* JADX INFO: renamed from: requiredSize-VpY3zN4, reason: not valid java name */
    public static final Modifier m766requiredSizeVpY3zN4(Modifier $this$requiredSize_u2dVpY3zN4, final float width, final float height) {
        if (InspectableValueKt.isDebugInspectorInfoEnabled() == false) goto L5;
        Function1<InspectorInfo, Unit> r1 = new SizeKt$requiredSizeVpY3zN4$$inlined$debugInspectorInfo$1(width, height);
    L7:
        return $this$requiredSize_u2dVpY3zN4.then(new SizeElement(width, height, width, height, false, r1, null));
    L5:
        r1 = InspectableValueKt.getNoInspectorInfo();
        goto L7
    }

    /* JADX INFO: renamed from: requiredSize-6HolHcs, reason: not valid java name */
    public static final Modifier m765requiredSize6HolHcs(Modifier $this$requiredSize_u2d6HolHcs, long size) {
        return m766requiredSizeVpY3zN4($this$requiredSize_u2d6HolHcs, DpSize.m7071getWidthD9Ej5fM(size), DpSize.m7069getHeightD9Ej5fM(size));
    }

    /* JADX INFO: renamed from: requiredWidthIn-VpY3zN4$default, reason: not valid java name */
    public static /* synthetic */ Modifier m771requiredWidthInVpY3zN4$default(Modifier r0, float r1, float r2, int r3, Object r4) {
        if ((r3 & 1) == 0) goto L6;
        r1 = Dp.Companion.m6993getUnspecifiedD9Ej5fM();
    L6:
        if ((r3 & 2) == 0) goto L9;
        r2 = Dp.Companion.m6993getUnspecifiedD9Ej5fM();
    L9:
        return m770requiredWidthInVpY3zN4(r0, r1, r2);
    }

    /* JADX INFO: renamed from: requiredWidthIn-VpY3zN4, reason: not valid java name */
    public static final Modifier m770requiredWidthInVpY3zN4(Modifier $this$requiredWidthIn_u2dVpY3zN4, final float min, final float max) {
        if (InspectableValueKt.isDebugInspectorInfoEnabled() == false) goto L5;
        Function1<InspectorInfo, Unit> r2 = new SizeKt$requiredWidthInVpY3zN4$$inlined$debugInspectorInfo$1(min, max);
    L7:
        return $this$requiredWidthIn_u2dVpY3zN4.then(new SizeElement(min, 0.0f, max, 0.0f, false, r2, 10, null));
    L5:
        r2 = InspectableValueKt.getNoInspectorInfo();
        goto L7
    }

    /* JADX INFO: renamed from: requiredHeightIn-VpY3zN4$default, reason: not valid java name */
    public static /* synthetic */ Modifier m763requiredHeightInVpY3zN4$default(Modifier r0, float r1, float r2, int r3, Object r4) {
        if ((r3 & 1) == 0) goto L6;
        r1 = Dp.Companion.m6993getUnspecifiedD9Ej5fM();
    L6:
        if ((r3 & 2) == 0) goto L9;
        r2 = Dp.Companion.m6993getUnspecifiedD9Ej5fM();
    L9:
        return m762requiredHeightInVpY3zN4(r0, r1, r2);
    }

    /* JADX INFO: renamed from: requiredHeightIn-VpY3zN4, reason: not valid java name */
    public static final Modifier m762requiredHeightInVpY3zN4(Modifier $this$requiredHeightIn_u2dVpY3zN4, final float min, final float max) {
        if (InspectableValueKt.isDebugInspectorInfoEnabled() == false) goto L5;
        Function1<InspectorInfo, Unit> r2 = new SizeKt$requiredHeightInVpY3zN4$$inlined$debugInspectorInfo$1(min, max);
    L7:
        return $this$requiredHeightIn_u2dVpY3zN4.then(new SizeElement(0.0f, min, 0.0f, max, false, r2, 5, null));
    L5:
        r2 = InspectableValueKt.getNoInspectorInfo();
        goto L7
    }

    /* JADX INFO: renamed from: requiredSizeIn-qDBjuR0$default, reason: not valid java name */
    public static /* synthetic */ Modifier m768requiredSizeInqDBjuR0$default(Modifier r0, float r1, float r2, float r3, float r4, int r5, Object r6) {
        if ((r5 & 1) == 0) goto L6;
        r1 = Dp.Companion.m6993getUnspecifiedD9Ej5fM();
    L6:
        if ((r5 & 2) == 0) goto L9;
        r2 = Dp.Companion.m6993getUnspecifiedD9Ej5fM();
    L9:
        if ((r5 & 4) == 0) goto L12;
        r3 = Dp.Companion.m6993getUnspecifiedD9Ej5fM();
    L12:
        if ((r5 & 8) == 0) goto L15;
        r4 = Dp.Companion.m6993getUnspecifiedD9Ej5fM();
    L15:
        return m767requiredSizeInqDBjuR0(r0, r1, r2, r3, r4);
    }

    /* JADX INFO: renamed from: requiredSizeIn-qDBjuR0, reason: not valid java name */
    public static final Modifier m767requiredSizeInqDBjuR0(Modifier $this$requiredSizeIn_u2dqDBjuR0, final float minWidth, final float minHeight, final float maxWidth, final float maxHeight) {
        if (InspectableValueKt.isDebugInspectorInfoEnabled() == false) goto L5;
        Function1<InspectorInfo, Unit> r2 = new SizeKt$requiredSizeInqDBjuR0$$inlined$debugInspectorInfo$1(minWidth, minHeight, maxWidth, maxHeight);
    L7:
        return $this$requiredSizeIn_u2dqDBjuR0.then(new SizeElement(minWidth, minHeight, maxWidth, maxHeight, false, r2, null));
    L5:
        r2 = InspectableValueKt.getNoInspectorInfo();
        goto L7
    }

    public static /* synthetic */ Modifier fillMaxWidth$default(Modifier r0, float r1, int r2, Object r3) {
        if ((r2 & 1) == 0) goto L6;
        r1 = 1.0f;
    L6:
        return fillMaxWidth(r0, r1);
    }

    public static final Modifier fillMaxWidth(Modifier $this$fillMaxWidth, float fraction) {
        if (fraction != 1.0f) goto L5;
        boolean r0 = true;
    L6:
        if (r0 == false) goto L8;
        FillElement r1 = FillWholeMaxWidth;
    L10:
        return $this$fillMaxWidth.then(r1);
    L8:
        r1 = FillElement.Companion.width(fraction);
        goto L10
    L5:
        r0 = false;
        goto L6
    }

    static {
        FillWholeMaxWidth = FillElement.Companion.width(1.0f);
        FillWholeMaxHeight = FillElement.Companion.height(1.0f);
        FillWholeMaxSize = FillElement.Companion.size(1.0f);
        WrapContentWidthCenter = WrapContentElement.Companion.width(Alignment.Companion.getCenterHorizontally(), false);
        WrapContentWidthStart = WrapContentElement.Companion.width(Alignment.Companion.getStart(), false);
        WrapContentHeightCenter = WrapContentElement.Companion.height(Alignment.Companion.getCenterVertically(), false);
        WrapContentHeightTop = WrapContentElement.Companion.height(Alignment.Companion.getTop(), false);
        WrapContentSizeCenter = WrapContentElement.Companion.size(Alignment.Companion.getCenter(), false);
        WrapContentSizeTopStart = WrapContentElement.Companion.size(Alignment.Companion.getTopStart(), false);
    }

    public static /* synthetic */ Modifier fillMaxHeight$default(Modifier r0, float r1, int r2, Object r3) {
        if ((r2 & 1) == 0) goto L6;
        r1 = 1.0f;
    L6:
        return fillMaxHeight(r0, r1);
    }

    public static final Modifier fillMaxHeight(Modifier $this$fillMaxHeight, float fraction) {
        if (fraction != 1.0f) goto L5;
        boolean r0 = true;
    L6:
        if (r0 == false) goto L8;
        FillElement r1 = FillWholeMaxHeight;
    L10:
        return $this$fillMaxHeight.then(r1);
    L8:
        r1 = FillElement.Companion.height(fraction);
        goto L10
    L5:
        r0 = false;
        goto L6
    }

    public static /* synthetic */ Modifier fillMaxSize$default(Modifier r0, float r1, int r2, Object r3) {
        if ((r2 & 1) == 0) goto L6;
        r1 = 1.0f;
    L6:
        return fillMaxSize(r0, r1);
    }

    public static final Modifier fillMaxSize(Modifier $this$fillMaxSize, float fraction) {
        if (fraction != 1.0f) goto L5;
        boolean r0 = true;
    L6:
        if (r0 == false) goto L8;
        FillElement r1 = FillWholeMaxSize;
    L10:
        return $this$fillMaxSize.then(r1);
    L8:
        r1 = FillElement.Companion.size(fraction);
        goto L10
    L5:
        r0 = false;
        goto L6
    }

    public static /* synthetic */ Modifier wrapContentWidth$default(Modifier r0, Alignment.Horizontal r1, boolean r2, int r3, Object r4) {
        if ((r3 & 1) == 0) goto L6;
        r1 = Alignment.Companion.getCenterHorizontally();
    L6:
        if ((r3 & 2) == 0) goto L9;
        r2 = false;
    L9:
        return wrapContentWidth(r0, r1, r2);
    }

    public static final Modifier wrapContentWidth(Modifier $this$wrapContentWidth, Alignment.Horizontal align, boolean unbounded) {
        if (Intrinsics.areEqual(align, Alignment.Companion.getCenterHorizontally()) == false) goto L7;
        if (unbounded == true) goto L7;
        WrapContentElement r0 = WrapContentWidthCenter;
    L12:
        return $this$wrapContentWidth.then(r0);
    L7:
        if (Intrinsics.areEqual(align, Alignment.Companion.getStart()) == false) goto L10;
        if (unbounded == true) goto L10;
        r0 = WrapContentWidthStart;
    L10:
        r0 = WrapContentElement.Companion.width(align, unbounded);
        goto L12
    }

    public static /* synthetic */ Modifier wrapContentHeight$default(Modifier r0, Alignment.Vertical r1, boolean r2, int r3, Object r4) {
        if ((r3 & 1) == 0) goto L6;
        r1 = Alignment.Companion.getCenterVertically();
    L6:
        if ((r3 & 2) == 0) goto L9;
        r2 = false;
    L9:
        return wrapContentHeight(r0, r1, r2);
    }

    public static final Modifier wrapContentHeight(Modifier $this$wrapContentHeight, Alignment.Vertical align, boolean unbounded) {
        if (Intrinsics.areEqual(align, Alignment.Companion.getCenterVertically()) == false) goto L7;
        if (unbounded == true) goto L7;
        WrapContentElement r0 = WrapContentHeightCenter;
    L12:
        return $this$wrapContentHeight.then(r0);
    L7:
        if (Intrinsics.areEqual(align, Alignment.Companion.getTop()) == false) goto L10;
        if (unbounded == true) goto L10;
        r0 = WrapContentHeightTop;
    L10:
        r0 = WrapContentElement.Companion.height(align, unbounded);
        goto L12
    }

    public static /* synthetic */ Modifier wrapContentSize$default(Modifier r0, Alignment r1, boolean r2, int r3, Object r4) {
        if ((r3 & 1) == 0) goto L6;
        r1 = Alignment.Companion.getCenter();
    L6:
        if ((r3 & 2) == 0) goto L9;
        r2 = false;
    L9:
        return wrapContentSize(r0, r1, r2);
    }

    public static final Modifier wrapContentSize(Modifier $this$wrapContentSize, Alignment align, boolean unbounded) {
        if (Intrinsics.areEqual(align, Alignment.Companion.getCenter()) == false) goto L7;
        if (unbounded == true) goto L7;
        WrapContentElement r0 = WrapContentSizeCenter;
    L12:
        return $this$wrapContentSize.then(r0);
    L7:
        if (Intrinsics.areEqual(align, Alignment.Companion.getTopStart()) == false) goto L10;
        if (unbounded == true) goto L10;
        r0 = WrapContentSizeTopStart;
    L10:
        r0 = WrapContentElement.Companion.size(align, unbounded);
        goto L12
    }

    /* JADX INFO: renamed from: defaultMinSize-VpY3zN4$default, reason: not valid java name */
    public static /* synthetic */ Modifier m757defaultMinSizeVpY3zN4$default(Modifier r0, float r1, float r2, int r3, Object r4) {
        if ((r3 & 1) == 0) goto L6;
        r1 = Dp.Companion.m6993getUnspecifiedD9Ej5fM();
    L6:
        if ((r3 & 2) == 0) goto L9;
        r2 = Dp.Companion.m6993getUnspecifiedD9Ej5fM();
    L9:
        return m756defaultMinSizeVpY3zN4(r0, r1, r2);
    }

    /* JADX INFO: renamed from: defaultMinSize-VpY3zN4, reason: not valid java name */
    public static final Modifier m756defaultMinSizeVpY3zN4(Modifier $this$defaultMinSize_u2dVpY3zN4, float minWidth, float minHeight) {
        return $this$defaultMinSize_u2dVpY3zN4.then(new UnspecifiedConstraintsElement(minWidth, minHeight, null));
    }
}
