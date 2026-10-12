package androidx.compose.ui.graphics.vector;

import androidx.autofill.HintConstants;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.PathFillType;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: ImageVector.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0099\u0001\b\u0000\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\n\u0012\b\b\u0002\u0010\u000e\u001a\u00020\f\u0012\b\b\u0002\u0010\u000f\u001a\u00020\f\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0013\u0012\b\b\u0002\u0010\u0014\u001a\u00020\f\u0012\b\b\u0002\u0010\u0015\u001a\u00020\f\u0012\b\b\u0002\u0010\u0016\u001a\u00020\f\u0012\b\b\u0002\u0010\u0017\u001a\u00020\f¢\u0006\u0002\u0010\u0018J\u0013\u0010-\u001a\u00020.2\b\u0010/\u001a\u0004\u0018\u000100H\u0096\u0002J\b\u00101\u001a\u000202H\u0016R\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0019\u0010\u0007\u001a\u00020\bø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010#\u001a\u0004\b!\u0010\"R\u0013\u0010\r\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u001aR\u0011\u0010\u000e\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\u001cR\u0019\u0010\u0010\u001a\u00020\u0011ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010#\u001a\u0004\b&\u0010\"R\u0019\u0010\u0012\u001a\u00020\u0013ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010#\u001a\u0004\b'\u0010\"R\u0011\u0010\u0014\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b(\u0010\u001cR\u0011\u0010\u000f\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b)\u0010\u001cR\u0011\u0010\u0016\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b*\u0010\u001cR\u0011\u0010\u0017\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b+\u0010\u001cR\u0011\u0010\u0015\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b,\u0010\u001c\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u00063"}, d2 = {"Landroidx/compose/ui/graphics/vector/VectorPath;", "Landroidx/compose/ui/graphics/vector/VectorNode;", HintConstants.AUTOFILL_HINT_NAME, "", "pathData", "", "Landroidx/compose/ui/graphics/vector/PathNode;", "pathFillType", "Landroidx/compose/ui/graphics/PathFillType;", "fill", "Landroidx/compose/ui/graphics/Brush;", "fillAlpha", "", "stroke", "strokeAlpha", "strokeLineWidth", "strokeLineCap", "Landroidx/compose/ui/graphics/StrokeCap;", "strokeLineJoin", "Landroidx/compose/ui/graphics/StrokeJoin;", "strokeLineMiter", "trimPathStart", "trimPathEnd", "trimPathOffset", "(Ljava/lang/String;Ljava/util/List;ILandroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFLkotlin/jvm/internal/DefaultConstructorMarker;)V", "getFill", "()Landroidx/compose/ui/graphics/Brush;", "getFillAlpha", "()F", "getName", "()Ljava/lang/String;", "getPathData", "()Ljava/util/List;", "getPathFillType-Rg-k1Os", "()I", "I", "getStroke", "getStrokeAlpha", "getStrokeLineCap-KaPHkGw", "getStrokeLineJoin-LxFBmk8", "getStrokeLineMiter", "getStrokeLineWidth", "getTrimPathEnd", "getTrimPathOffset", "getTrimPathStart", "equals", "", "other", "", "hashCode", "", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class VectorPath extends VectorNode {
    public static final int $stable = 0;
    private final Brush fill;
    private final float fillAlpha;
    private final String name;
    private final List<PathNode> pathData;
    private final int pathFillType;
    private final Brush stroke;
    private final float strokeAlpha;
    private final int strokeLineCap;
    private final int strokeLineJoin;
    private final float strokeLineMiter;
    private final float strokeLineWidth;
    private final float trimPathEnd;
    private final float trimPathOffset;
    private final float trimPathStart;

    static {
    }

    public /* synthetic */ VectorPath(String r1, List r2, int r3, Brush r4, float r5, Brush r6, float r7, float r8, int r9, int r10, float r11, float r12, float r13, float r14, DefaultConstructorMarker r15) {
        this(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14);
    }

    public /* synthetic */ VectorPath(String r19, List r20, int r21, Brush r22, float r23, Brush r24, float r25, float r26, int r27, int r28, float r29, float r30, float r31, float r32, int r33, DefaultConstructorMarker r34) {
        if ((r33 & 1) == 0) goto L5;
        String r3 = "";
    L7:
        if ((r33 & 8) == 0) goto L9;
        Brush r6 = null;
    L11:
        if ((r33 & 16) == 0) goto L13;
        float r7 = 1.0f;
    L15:
        if ((r33 & 32) == 0) goto L17;
        Brush r8 = null;
    L19:
        if ((r33 & 64) == 0) goto L21;
        float r9 = 1.0f;
    L23:
        if ((r33 & 128) == 0) goto L25;
        float r10 = 0.0f;
    L27:
        if ((r33 & 256) == 0) goto L29;
        int r11 = VectorKt.getDefaultStrokeLineCap();
    L31:
        if ((r33 & 512) == 0) goto L33;
        int r12 = VectorKt.getDefaultStrokeLineJoin();
    L35:
        if ((r33 & 1024) == 0) goto L37;
        float r13 = 4.0f;
    L39:
        if ((r33 & 2048) == 0) goto L41;
        float r14 = 0.0f;
    L43:
        if ((r33 & 4096) == 0) goto L45;
        float r15 = 1.0f;
    L47:
        if ((r33 & 8192) == 0) goto L49;
        float r16 = 0.0f;
    L50:
        this(r3, r20, r21, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, null);
        return;
    L49:
        r16 = r32;
        goto L50
    L45:
        r15 = r31;
        goto L47
    L41:
        r14 = r30;
        goto L43
    L37:
        r13 = r29;
        goto L39
    L33:
        r12 = r28;
        goto L35
    L29:
        r11 = r27;
        goto L31
    L25:
        r10 = r26;
        goto L27
    L21:
        r9 = r25;
        goto L23
    L17:
        r8 = r24;
        goto L19
    L13:
        r7 = r23;
        goto L15
    L9:
        r6 = r22;
        goto L11
    L5:
        r3 = r19;
        goto L7
    }

    public final String getName() {
        return this.name;
    }

    public final List<PathNode> getPathData() {
        return this.pathData;
    }

    /* JADX INFO: renamed from: getPathFillType-Rg-k1Os, reason: not valid java name */
    public final int m5081getPathFillTypeRgk1Os() {
        return this.pathFillType;
    }

    public final Brush getFill() {
        return this.fill;
    }

    public final float getFillAlpha() {
        return this.fillAlpha;
    }

    public final Brush getStroke() {
        return this.stroke;
    }

    public final float getStrokeAlpha() {
        return this.strokeAlpha;
    }

    public final float getStrokeLineWidth() {
        return this.strokeLineWidth;
    }

    /* JADX INFO: renamed from: getStrokeLineCap-KaPHkGw, reason: not valid java name */
    public final int m5082getStrokeLineCapKaPHkGw() {
        return this.strokeLineCap;
    }

    /* JADX INFO: renamed from: getStrokeLineJoin-LxFBmk8, reason: not valid java name */
    public final int m5083getStrokeLineJoinLxFBmk8() {
        return this.strokeLineJoin;
    }

    public final float getStrokeLineMiter() {
        return this.strokeLineMiter;
    }

    public final float getTrimPathStart() {
        return this.trimPathStart;
    }

    public final float getTrimPathEnd() {
        return this.trimPathEnd;
    }

    public final float getTrimPathOffset() {
        return this.trimPathOffset;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private VectorPath(String name, List<? extends PathNode> r3, int pathFillType, Brush fill, float fillAlpha, Brush stroke, float strokeAlpha, float strokeLineWidth, int strokeLineCap, int strokeLineJoin, float strokeLineMiter, float trimPathStart, float trimPathEnd, float trimPathOffset) {
        super(null);
        this.name = name;
        this.pathData = r3;
        this.pathFillType = pathFillType;
        this.fill = fill;
        this.fillAlpha = fillAlpha;
        this.stroke = stroke;
        this.strokeAlpha = strokeAlpha;
        this.strokeLineWidth = strokeLineWidth;
        this.strokeLineCap = strokeLineCap;
        this.strokeLineJoin = strokeLineJoin;
        this.strokeLineMiter = strokeLineMiter;
        this.trimPathStart = trimPathStart;
        this.trimPathEnd = trimPathEnd;
        this.trimPathOffset = trimPathOffset;
    }

    public boolean equals(Object other) {
        if (this != other) goto L6;
        return true;
    L6:
        if (other != null) goto L8;
    L74:
        return false;
    L8:
        if (getClass() != other.getClass()) goto L74;
        VectorPath r2 = (VectorPath) other;
        if (Intrinsics.areEqual(this.name, ((VectorPath) other).name) == true) goto L14;
        return false;
    L14:
        if (Intrinsics.areEqual(this.fill, ((VectorPath) other).fill) == true) goto L17;
        return false;
    L17:
        if (this.fillAlpha != ((VectorPath) other).fillAlpha) goto L19;
        boolean r3 = true;
    L20:
        if (r3 == true) goto L23;
        return false;
    L23:
        if (Intrinsics.areEqual(this.stroke, ((VectorPath) other).stroke) == true) goto L26;
        return false;
    L26:
        if (this.strokeAlpha != ((VectorPath) other).strokeAlpha) goto L28;
        boolean r4 = true;
    L29:
        if (r4 == true) goto L32;
        return false;
    L32:
        if (this.strokeLineWidth != ((VectorPath) other).strokeLineWidth) goto L34;
        boolean r5 = true;
    L35:
        if (r5 == true) goto L38;
        return false;
    L38:
        if (StrokeCap.m4715equalsimpl0(this.strokeLineCap, ((VectorPath) other).strokeLineCap) == true) goto L41;
        return false;
    L41:
        if (StrokeJoin.m4725equalsimpl0(this.strokeLineJoin, ((VectorPath) other).strokeLineJoin) == true) goto L44;
        return false;
    L44:
        if (this.strokeLineMiter != ((VectorPath) other).strokeLineMiter) goto L46;
        boolean r6 = true;
    L47:
        if (r6 == true) goto L50;
        return false;
    L50:
        if (this.trimPathStart != ((VectorPath) other).trimPathStart) goto L52;
        boolean r7 = true;
    L53:
        if (r7 == true) goto L56;
        return false;
    L56:
        if (this.trimPathEnd != ((VectorPath) other).trimPathEnd) goto L58;
        boolean r8 = true;
    L59:
        if (r8 == true) goto L62;
        return false;
    L62:
        if (this.trimPathOffset != ((VectorPath) other).trimPathOffset) goto L64;
        boolean r9 = true;
    L65:
        if (r9 == true) goto L68;
        return false;
    L68:
        if (PathFillType.m4644equalsimpl0(this.pathFillType, ((VectorPath) other).pathFillType) == true) goto L71;
        return false;
    L71:
        if (Intrinsics.areEqual(this.pathData, ((VectorPath) other).pathData) == true) goto L73;
        return false;
    L73:
        return true;
    L64:
        r9 = false;
        goto L65
    L58:
        r8 = false;
        goto L59
    L52:
        r7 = false;
        goto L53
    L46:
        r6 = false;
        goto L47
    L34:
        r5 = false;
        goto L35
    L28:
        r4 = false;
        goto L29
    L19:
        r3 = false;
        goto L20
    }

    public int hashCode() {
        int result = this.name.hashCode();
        int result2 = ((result * 31) + this.pathData.hashCode()) * 31;
        Brush r2 = this.fill;
        int r3 = 0;
        if (r2 == null) goto L5;
        int r4 = r2.hashCode();
    L6:
        int result3 = (((result2 + r4) * 31) + Float.hashCode(this.fillAlpha)) * 31;
        Brush r5 = this.stroke;
        if (r5 == null) goto L10;
        r3 = r5.hashCode();
    L10:
        return ((((((((((((((((((result3 + r3) * 31) + Float.hashCode(this.strokeAlpha)) * 31) + Float.hashCode(this.strokeLineWidth)) * 31) + StrokeCap.m4716hashCodeimpl(this.strokeLineCap)) * 31) + StrokeJoin.m4726hashCodeimpl(this.strokeLineJoin)) * 31) + Float.hashCode(this.strokeLineMiter)) * 31) + Float.hashCode(this.trimPathStart)) * 31) + Float.hashCode(this.trimPathEnd)) * 31) + Float.hashCode(this.trimPathOffset)) * 31) + PathFillType.m4645hashCodeimpl(this.pathFillType);
    L5:
        r4 = 0;
        goto L6
    }
}
