package androidx.compose.ui.graphics;

import androidx.compose.ui.geometry.Offset;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: Vertices.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0010\u0017\n\u0002\b\u0002\n\u0002\u0010\u0014\n\u0002\b\n\u0018\u00002\u00020\u0001BE\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0005\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0005¢\u0006\u0002\u0010\fJ\u0016\u0010\u001a\u001a\u00020\r2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0005H\u0002J\u0016\u0010\u001b\u001a\u00020\u00132\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0002R\u0011\u0010\b\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\n\u001a\u00020\u0010¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0004\u001a\u00020\u0013¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0007\u001a\u00020\u0013¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0015R\u0019\u0010\u0002\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0019\u001a\u0004\b\u0017\u0010\u0018\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u001d"}, d2 = {"Landroidx/compose/ui/graphics/Vertices;", "", "vertexMode", "Landroidx/compose/ui/graphics/VertexMode;", "positions", "", "Landroidx/compose/ui/geometry/Offset;", "textureCoordinates", "colors", "Landroidx/compose/ui/graphics/Color;", "indices", "", "(ILjava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "", "getColors", "()[I", "", "getIndices", "()[S", "", "getPositions", "()[F", "getTextureCoordinates", "getVertexMode-c2xauaI", "()I", "I", "encodeColorList", "encodePointList", "points", "ui-graphics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class Vertices {
    private final int[] colors;
    private final short[] indices;
    private final float[] positions;
    private final float[] textureCoordinates;
    private final int vertexMode;

    public /* synthetic */ Vertices(int r1, List r2, List r3, List r4, List r5, DefaultConstructorMarker r6) {
        this(r1, r2, r3, r4, r5);
    }

    private Vertices(int vertexMode, List<Offset> r18, List<Offset> r19, List<Color> r20, List<Integer> r21) {
        this.vertexMode = vertexMode;
        if (r19.size() == r18.size()) goto L6;
        InlineClassHelperKt.throwIllegalArgumentException("positions and textureCoordinates lengths must match.");
    L6:
        if (r20.size() == r18.size()) goto L8;
        InlineClassHelperKt.throwIllegalArgumentException("positions and colors lengths must match.");
    L8:
        int index$iv$iv = 0;
        int r7 = r21.size();
    L9:
        int r8 = 0;
        if (index$iv$iv >= r7) goto L21;
        Object item$iv$iv = r21.get(index$iv$iv);
        int it = ((Number) item$iv$iv).intValue();
        boolean r14 = true;
        if (it >= 0) goto L14;
    L17:
        int it2 = 1;
    L18:
        if (it2 != 0) goto L22;
        index$iv$iv = index$iv$iv + 1;
    L22:
        if (r14 == false) goto L24;
        InlineClassHelperKt.throwIllegalArgumentException("indices values must be valid indices in the positions list.");
    L24:
        this.positions = encodePointList(r18);
        this.textureCoordinates = encodePointList(r19);
        this.colors = encodeColorList(r20);
        int r5 = r21.size();
        short[] r6 = new short[r5];
    L25:
        if (r8 >= r5) goto L27;
        r6[r8] = (short) r21.get(r8).intValue();
        r8 = r8 + 1;
        goto L25
    L27:
        this.indices = r6;
        return;
    L14:
        if (it >= r18.size()) goto L17;
        it2 = 0;
        goto L18
    L21:
        r14 = false;
        goto L22
    }

    /* JADX INFO: renamed from: getVertexMode-c2xauaI, reason: not valid java name */
    public final int m4768getVertexModec2xauaI() {
        return this.vertexMode;
    }

    public final float[] getPositions() {
        return this.positions;
    }

    public final float[] getTextureCoordinates() {
        return this.textureCoordinates;
    }

    public final int[] getColors() {
        return this.colors;
    }

    public final short[] getIndices() {
        return this.indices;
    }

    private final int[] encodeColorList(List<Color> r6) {
        int r0 = r6.size();
        int[] r1 = new int[r0];
        int r2 = 0;
    L3:
        if (r2 >= r0) goto L5;
        r1[r2] = ColorKt.m4420toArgb8_81llA(r6.get(r2).m4376unboximpl());
        r2 = r2 + 1;
        goto L3
    L5:
        return r1;
    }

    private final float[] encodePointList(List<Offset> r13) {
        int r0 = r13.size() * 2;
        float[] r1 = new float[r0];
        int r2 = 0;
    L3:
        if (r2 >= r0) goto L9;
        int pointIndex = r2 / 2;
        long point = r13.get(pointIndex).m4135unboximpl();
        if ((r2 % 2) != 0) goto L7;
        int bits$iv$iv$iv = (int) (point >> 32);
        float r10 = Float.intBitsToFloat(bits$iv$iv$iv);
    L8:
        r1[r2] = r10;
        r2 = r2 + 1;
        goto L3
    L7:
        int bits$iv$iv$iv2 = (int) (4294967295L & point);
        r10 = Float.intBitsToFloat(bits$iv$iv$iv2);
        goto L8
    L9:
        return r1;
    }
}
