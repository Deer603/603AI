package androidx.compose.ui.graphics;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Size;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: Brush.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B\u0007\b\u0004¢\u0006\u0002\u0010\u0002J*\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH&ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0003\u001a\u00020\u0004X\u0096\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0005\u0010\u0006\u0082\u0001\u0002\u0012\u0013\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0014"}, d2 = {"Landroidx/compose/ui/graphics/Brush;", "", "()V", "intrinsicSize", "Landroidx/compose/ui/geometry/Size;", "getIntrinsicSize-NH-jbRc", "()J", "J", "applyTo", "", "size", "p", "Landroidx/compose/ui/graphics/Paint;", "alpha", "", "applyTo-Pq9zytI", "(JLandroidx/compose/ui/graphics/Paint;F)V", "Companion", "Landroidx/compose/ui/graphics/ShaderBrush;", "Landroidx/compose/ui/graphics/SolidColor;", "ui-graphics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public abstract class Brush {
    public static final Companion Companion = null;
    private final long intrinsicSize;

    /* JADX INFO: compiled from: Brush.kt */
    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0013\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\\\u0010\u0003\u001a\u00020\u00042*\u0010\u0005\u001a\u0016\u0012\u0012\b\u0001\u0012\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u00070\u0006\"\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u00072\b\b\u0002\u0010\n\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\b2\b\b\u0002\u0010\f\u001a\u00020\rH\u0007ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ>\u0010\u0003\u001a\u00020\u00042\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\t0\u00112\b\b\u0002\u0010\n\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\b2\b\b\u0002\u0010\f\u001a\u00020\rH\u0007ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u0012J\\\u0010\u0013\u001a\u00020\u00042*\u0010\u0005\u001a\u0016\u0012\u0012\b\u0001\u0012\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u00070\u0006\"\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u00072\b\b\u0002\u0010\u0014\u001a\u00020\u00152\b\b\u0002\u0010\u0016\u001a\u00020\u00152\b\b\u0002\u0010\f\u001a\u00020\rH\u0007ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0018J>\u0010\u0013\u001a\u00020\u00042\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\t0\u00112\b\b\u0002\u0010\u0014\u001a\u00020\u00152\b\b\u0002\u0010\u0016\u001a\u00020\u00152\b\b\u0002\u0010\f\u001a\u00020\rH\u0007ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0019J\\\u0010\u001a\u001a\u00020\u00042*\u0010\u0005\u001a\u0016\u0012\u0012\b\u0001\u0012\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u00070\u0006\"\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u00072\b\b\u0002\u0010\u001b\u001a\u00020\u00152\b\b\u0002\u0010\u001c\u001a\u00020\b2\b\b\u0002\u0010\f\u001a\u00020\rH\u0007ø\u0001\u0000¢\u0006\u0004\b\u001d\u0010\u001eJ>\u0010\u001a\u001a\u00020\u00042\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\t0\u00112\b\b\u0002\u0010\u001b\u001a\u00020\u00152\b\b\u0002\u0010\u001c\u001a\u00020\b2\b\b\u0002\u0010\f\u001a\u00020\rH\u0007ø\u0001\u0000¢\u0006\u0004\b\u001d\u0010\u001fJH\u0010 \u001a\u00020\u00042*\u0010\u0005\u001a\u0016\u0012\u0012\b\u0001\u0012\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u00070\u0006\"\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u00072\b\b\u0002\u0010\u001b\u001a\u00020\u0015H\u0007ø\u0001\u0000¢\u0006\u0004\b!\u0010\"J*\u0010 \u001a\u00020\u00042\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\t0\u00112\b\b\u0002\u0010\u001b\u001a\u00020\u0015H\u0007ø\u0001\u0000¢\u0006\u0004\b!\u0010#J\\\u0010$\u001a\u00020\u00042*\u0010\u0005\u001a\u0016\u0012\u0012\b\u0001\u0012\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u00070\u0006\"\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u00072\b\b\u0002\u0010%\u001a\u00020\b2\b\b\u0002\u0010&\u001a\u00020\b2\b\b\u0002\u0010\f\u001a\u00020\rH\u0007ø\u0001\u0000¢\u0006\u0004\b'\u0010\u000fJ>\u0010$\u001a\u00020\u00042\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\t0\u00112\b\b\u0002\u0010%\u001a\u00020\b2\b\b\u0002\u0010&\u001a\u00020\b2\b\b\u0002\u0010\f\u001a\u00020\rH\u0007ø\u0001\u0000¢\u0006\u0004\b'\u0010\u0012\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006("}, d2 = {"Landroidx/compose/ui/graphics/Brush$Companion;", "", "()V", "horizontalGradient", "Landroidx/compose/ui/graphics/Brush;", "colorStops", "", "Lkotlin/Pair;", "", "Landroidx/compose/ui/graphics/Color;", "startX", "endX", "tileMode", "Landroidx/compose/ui/graphics/TileMode;", "horizontalGradient-8A-3gB4", "([Lkotlin/Pair;FFI)Landroidx/compose/ui/graphics/Brush;", "colors", "", "(Ljava/util/List;FFI)Landroidx/compose/ui/graphics/Brush;", "linearGradient", "start", "Landroidx/compose/ui/geometry/Offset;", "end", "linearGradient-mHitzGk", "([Lkotlin/Pair;JJI)Landroidx/compose/ui/graphics/Brush;", "(Ljava/util/List;JJI)Landroidx/compose/ui/graphics/Brush;", "radialGradient", "center", "radius", "radialGradient-P_Vx-Ks", "([Lkotlin/Pair;JFI)Landroidx/compose/ui/graphics/Brush;", "(Ljava/util/List;JFI)Landroidx/compose/ui/graphics/Brush;", "sweepGradient", "sweepGradient-Uv8p0NA", "([Lkotlin/Pair;J)Landroidx/compose/ui/graphics/Brush;", "(Ljava/util/List;J)Landroidx/compose/ui/graphics/Brush;", "verticalGradient", "startY", "endY", "verticalGradient-8A-3gB4", "ui-graphics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker r1) {
            this();
        }

        private Companion() {
        }

        /* JADX INFO: renamed from: linearGradient-mHitzGk$default, reason: not valid java name */
        public static /* synthetic */ Brush m4318linearGradientmHitzGk$default(Companion r7, Pair[] r8, long r9, long r11, int r13, int r14, Object r15) {
            if ((r14 & 2) == 0) goto L5;
            long r2 = Offset.Companion.m4141getZeroF1C5BW0();
        L7:
            if ((r14 & 4) == 0) goto L9;
            long r4 = Offset.Companion.m4139getInfiniteF1C5BW0();
        L11:
            if ((r14 & 8) == 0) goto L13;
            int r6 = TileMode.Companion.m4739getClamp3opZhB0();
        L15:
            return r7.m4328linearGradientmHitzGk(r8, r2, r4, r6);
        L13:
            r6 = r13;
            goto L15
        L9:
            r4 = r11;
            goto L11
        L5:
            r2 = r9;
            goto L7
        }

        /* JADX INFO: renamed from: linearGradient-mHitzGk, reason: not valid java name */
        public final Brush m4328linearGradientmHitzGk(Pair<Float, Color>[] r14, long start, long end, int tileMode) {
            int r0 = r14.length;
            ArrayList r1 = new ArrayList(r0);
            int r2 = 0;
            int r3 = 0;
        L3:
            if (r3 >= r0) goto L5;
            int i = r3;
            r1.add(Color.m4356boximpl(r14[i].getSecond().m4376unboximpl()));
            r3 = r3 + 1;
            goto L3
        L5:
            ArrayList r5 = r1;
            int r4 = r14.length;
            ArrayList r6 = new ArrayList(r4);
        L6:
            if (r2 >= r4) goto L9;
            int i2 = r2;
            r6.add(Float.valueOf(r14[i2].getFirst().floatValue()));
            r2 = r2 + 1;
            goto L6
        L9:
            return new LinearGradient(r5, r6, start, end, tileMode, null);
        }

        /* JADX INFO: renamed from: linearGradient-mHitzGk$default, reason: not valid java name */
        public static /* synthetic */ Brush m4317linearGradientmHitzGk$default(Companion r7, List r8, long r9, long r11, int r13, int r14, Object r15) {
            if ((r14 & 2) == 0) goto L5;
            long r2 = Offset.Companion.m4141getZeroF1C5BW0();
        L7:
            if ((r14 & 4) == 0) goto L9;
            long r4 = Offset.Companion.m4139getInfiniteF1C5BW0();
        L11:
            if ((r14 & 8) == 0) goto L13;
            int r6 = TileMode.Companion.m4739getClamp3opZhB0();
        L15:
            return r7.m4327linearGradientmHitzGk(r8, r2, r4, r6);
        L13:
            r6 = r13;
            goto L15
        L9:
            r4 = r11;
            goto L11
        L5:
            r2 = r9;
            goto L7
        }

        /* JADX INFO: renamed from: linearGradient-mHitzGk, reason: not valid java name */
        public final Brush m4327linearGradientmHitzGk(List<Color> r10, long start, long end, int tileMode) {
            return new LinearGradient(r10, null, start, end, tileMode, null);
        }

        /* JADX INFO: renamed from: horizontalGradient-8A-3gB4$default, reason: not valid java name */
        public static /* synthetic */ Brush m4315horizontalGradient8A3gB4$default(Companion r0, List r1, float r2, float r3, int r4, int r5, Object r6) {
            if ((r5 & 2) == 0) goto L6;
            r2 = 0.0f;
        L6:
            if ((r5 & 4) == 0) goto L9;
            r3 = Float.POSITIVE_INFINITY;
        L9:
            if ((r5 & 8) == 0) goto L12;
            r4 = TileMode.Companion.m4739getClamp3opZhB0();
        L12:
            return r0.m4325horizontalGradient8A3gB4(r1, r2, r3, r4);
        }

        /* JADX INFO: renamed from: horizontalGradient-8A-3gB4, reason: not valid java name */
        public final Brush m4325horizontalGradient8A3gB4(List<Color> r20, float startX, float endX, int tileMode) {
            long v1$iv$iv = Float.floatToRawIntBits(startX);
            long v2$iv$iv = Float.floatToRawIntBits(0.0f);
            long r14 = Offset.m4117constructorimpl((v1$iv$iv << 32) | (v2$iv$iv & 4294967295L));
            long v1$iv$iv2 = Float.floatToRawIntBits(endX);
            long v2$iv$iv2 = Float.floatToRawIntBits(0.0f);
            return m4327linearGradientmHitzGk(r20, r14, Offset.m4117constructorimpl((v1$iv$iv2 << 32) | (v2$iv$iv2 & 4294967295L)), tileMode);
        }

        /* JADX INFO: renamed from: horizontalGradient-8A-3gB4$default, reason: not valid java name */
        public static /* synthetic */ Brush m4316horizontalGradient8A3gB4$default(Companion r0, Pair[] r1, float r2, float r3, int r4, int r5, Object r6) {
            if ((r5 & 2) == 0) goto L6;
            r2 = 0.0f;
        L6:
            if ((r5 & 4) == 0) goto L9;
            r3 = Float.POSITIVE_INFINITY;
        L9:
            if ((r5 & 8) == 0) goto L12;
            r4 = TileMode.Companion.m4739getClamp3opZhB0();
        L12:
            return r0.m4326horizontalGradient8A3gB4(r1, r2, r3, r4);
        }

        /* JADX INFO: renamed from: horizontalGradient-8A-3gB4, reason: not valid java name */
        public final Brush m4326horizontalGradient8A3gB4(Pair<Float, Color>[] r17, float startX, float endX, int tileMode) {
            Pair<Float, Color>[] r3 = (Pair[]) Arrays.copyOf(r17, r17.length);
            long v1$iv$iv = Float.floatToRawIntBits(startX);
            long v2$iv$iv = Float.floatToRawIntBits(0.0f);
            long r4 = Offset.m4117constructorimpl((v1$iv$iv << 32) | (v2$iv$iv & 4294967295L));
            long v1$iv$iv2 = Float.floatToRawIntBits(endX);
            long v2$iv$iv2 = Float.floatToRawIntBits(0.0f);
            return m4328linearGradientmHitzGk(r3, r4, Offset.m4117constructorimpl((v1$iv$iv2 << 32) | (4294967295L & v2$iv$iv2)), tileMode);
        }

        /* JADX INFO: renamed from: verticalGradient-8A-3gB4$default, reason: not valid java name */
        public static /* synthetic */ Brush m4323verticalGradient8A3gB4$default(Companion r0, List r1, float r2, float r3, int r4, int r5, Object r6) {
            if ((r5 & 2) == 0) goto L6;
            r2 = 0.0f;
        L6:
            if ((r5 & 4) == 0) goto L9;
            r3 = Float.POSITIVE_INFINITY;
        L9:
            if ((r5 & 8) == 0) goto L12;
            r4 = TileMode.Companion.m4739getClamp3opZhB0();
        L12:
            return r0.m4333verticalGradient8A3gB4(r1, r2, r3, r4);
        }

        /* JADX INFO: renamed from: verticalGradient-8A-3gB4, reason: not valid java name */
        public final Brush m4333verticalGradient8A3gB4(List<Color> r20, float startY, float endY, int tileMode) {
            long v1$iv$iv = Float.floatToRawIntBits(0.0f);
            long v2$iv$iv = Float.floatToRawIntBits(startY);
            long r14 = Offset.m4117constructorimpl((v1$iv$iv << 32) | (v2$iv$iv & 4294967295L));
            long v1$iv$iv2 = Float.floatToRawIntBits(0.0f);
            long v2$iv$iv2 = Float.floatToRawIntBits(endY);
            return m4327linearGradientmHitzGk(r20, r14, Offset.m4117constructorimpl((v1$iv$iv2 << 32) | (v2$iv$iv2 & 4294967295L)), tileMode);
        }

        /* JADX INFO: renamed from: verticalGradient-8A-3gB4$default, reason: not valid java name */
        public static /* synthetic */ Brush m4324verticalGradient8A3gB4$default(Companion r0, Pair[] r1, float r2, float r3, int r4, int r5, Object r6) {
            if ((r5 & 2) == 0) goto L6;
            r2 = 0.0f;
        L6:
            if ((r5 & 4) == 0) goto L9;
            r3 = Float.POSITIVE_INFINITY;
        L9:
            if ((r5 & 8) == 0) goto L12;
            r4 = TileMode.Companion.m4739getClamp3opZhB0();
        L12:
            return r0.m4334verticalGradient8A3gB4(r1, r2, r3, r4);
        }

        /* JADX INFO: renamed from: verticalGradient-8A-3gB4, reason: not valid java name */
        public final Brush m4334verticalGradient8A3gB4(Pair<Float, Color>[] r17, float startY, float endY, int tileMode) {
            Pair<Float, Color>[] r3 = (Pair[]) Arrays.copyOf(r17, r17.length);
            long v1$iv$iv = Float.floatToRawIntBits(0.0f);
            long v2$iv$iv = Float.floatToRawIntBits(startY);
            long r4 = Offset.m4117constructorimpl((v1$iv$iv << 32) | (v2$iv$iv & 4294967295L));
            long v1$iv$iv2 = Float.floatToRawIntBits(0.0f);
            long v2$iv$iv2 = Float.floatToRawIntBits(endY);
            return m4328linearGradientmHitzGk(r3, r4, Offset.m4117constructorimpl((v1$iv$iv2 << 32) | (4294967295L & v2$iv$iv2)), tileMode);
        }

        /* JADX INFO: renamed from: radialGradient-P_Vx-Ks$default, reason: not valid java name */
        public static /* synthetic */ Brush m4320radialGradientP_VxKs$default(Companion r6, Pair[] r7, long r8, float r10, int r11, int r12, Object r13) {
            if ((r12 & 2) == 0) goto L5;
            long r2 = Offset.Companion.m4140getUnspecifiedF1C5BW0();
        L7:
            if ((r12 & 4) == 0) goto L9;
            float r4 = Float.POSITIVE_INFINITY;
        L11:
            if ((r12 & 8) == 0) goto L13;
            int r5 = TileMode.Companion.m4739getClamp3opZhB0();
        L15:
            return r6.m4330radialGradientP_VxKs(r7, r2, r4, r5);
        L13:
            r5 = r11;
            goto L15
        L9:
            r4 = r10;
            goto L11
        L5:
            r2 = r8;
            goto L7
        }

        /* JADX INFO: renamed from: radialGradient-P_Vx-Ks, reason: not valid java name */
        public final Brush m4330radialGradientP_VxKs(Pair<Float, Color>[] r13, long center, float radius, int tileMode) {
            int r0 = r13.length;
            ArrayList r1 = new ArrayList(r0);
            int r2 = 0;
            int r3 = 0;
        L3:
            if (r3 >= r0) goto L5;
            int i = r3;
            r1.add(Color.m4356boximpl(r13[i].getSecond().m4376unboximpl()));
            r3 = r3 + 1;
            goto L3
        L5:
            ArrayList r5 = r1;
            int r4 = r13.length;
            ArrayList r6 = new ArrayList(r4);
        L6:
            if (r2 >= r4) goto L9;
            int i2 = r2;
            r6.add(Float.valueOf(r13[i2].getFirst().floatValue()));
            r2 = r2 + 1;
            goto L6
        L9:
            return new RadialGradient(r5, r6, center, radius, tileMode, null);
        }

        /* JADX INFO: renamed from: radialGradient-P_Vx-Ks$default, reason: not valid java name */
        public static /* synthetic */ Brush m4319radialGradientP_VxKs$default(Companion r6, List r7, long r8, float r10, int r11, int r12, Object r13) {
            if ((r12 & 2) == 0) goto L5;
            long r2 = Offset.Companion.m4140getUnspecifiedF1C5BW0();
        L7:
            if ((r12 & 4) == 0) goto L9;
            float r4 = Float.POSITIVE_INFINITY;
        L11:
            if ((r12 & 8) == 0) goto L13;
            int r5 = TileMode.Companion.m4739getClamp3opZhB0();
        L15:
            return r6.m4329radialGradientP_VxKs(r7, r2, r4, r5);
        L13:
            r5 = r11;
            goto L15
        L9:
            r4 = r10;
            goto L11
        L5:
            r2 = r8;
            goto L7
        }

        /* JADX INFO: renamed from: radialGradient-P_Vx-Ks, reason: not valid java name */
        public final Brush m4329radialGradientP_VxKs(List<Color> r9, long center, float radius, int tileMode) {
            return new RadialGradient(r9, null, center, radius, tileMode, null);
        }

        /* JADX INFO: renamed from: sweepGradient-Uv8p0NA$default, reason: not valid java name */
        public static /* synthetic */ Brush m4322sweepGradientUv8p0NA$default(Companion r0, Pair[] r1, long r2, int r4, Object r5) {
            if ((r4 & 2) == 0) goto L6;
            r2 = Offset.Companion.m4140getUnspecifiedF1C5BW0();
        L6:
            return r0.m4332sweepGradientUv8p0NA(r1, r2);
        }

        /* JADX INFO: renamed from: sweepGradient-Uv8p0NA, reason: not valid java name */
        public final Brush m4332sweepGradientUv8p0NA(Pair<Float, Color>[] r11, long center) {
            int r0 = r11.length;
            ArrayList r1 = new ArrayList(r0);
            int r2 = 0;
            int r3 = 0;
        L3:
            if (r3 >= r0) goto L5;
            int i = r3;
            r1.add(Color.m4356boximpl(r11[i].getSecond().m4376unboximpl()));
            r3 = r3 + 1;
            goto L3
        L5:
            ArrayList r7 = r1;
            int r4 = r11.length;
            ArrayList r5 = new ArrayList(r4);
        L6:
            if (r2 >= r4) goto L9;
            int i2 = r2;
            r5.add(Float.valueOf(r11[i2].getFirst().floatValue()));
            r2 = r2 + 1;
            goto L6
        L9:
            return new SweepGradient(center, r7, r5, null);
        }

        /* JADX INFO: renamed from: sweepGradient-Uv8p0NA$default, reason: not valid java name */
        public static /* synthetic */ Brush m4321sweepGradientUv8p0NA$default(Companion r0, List r1, long r2, int r4, Object r5) {
            if ((r4 & 2) == 0) goto L6;
            r2 = Offset.Companion.m4140getUnspecifiedF1C5BW0();
        L6:
            return r0.m4331sweepGradientUv8p0NA(r1, r2);
        }

        /* JADX INFO: renamed from: sweepGradient-Uv8p0NA, reason: not valid java name */
        public final Brush m4331sweepGradientUv8p0NA(List<Color> r7, long center) {
            return new SweepGradient(center, r7, null, null);
        }
    }

    static {
        Companion = new Companion(null);
    }

    public /* synthetic */ Brush(DefaultConstructorMarker r1) {
        this();
    }

    /* JADX INFO: renamed from: applyTo-Pq9zytI, reason: not valid java name */
    public abstract void mo4313applyToPq9zytI(long r1, Paint r3, float r4);

    private Brush() {
        this.intrinsicSize = Size.Companion.m4202getUnspecifiedNHjbRc();
    }

    /* JADX INFO: renamed from: getIntrinsicSize-NH-jbRc, reason: not valid java name */
    public long mo4314getIntrinsicSizeNHjbRc() {
        return this.intrinsicSize;
    }
}
