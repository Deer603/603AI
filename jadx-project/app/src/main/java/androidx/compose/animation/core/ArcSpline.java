package androidx.compose.animation.core;

import kotlin.Metadata;
import kotlin.collections.ArraysKt;

/* JADX INFO: compiled from: ArcSpline.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0015\n\u0000\n\u0002\u0010\u0014\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0014B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007¢\u0006\u0002\u0010\bJ\u0016\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0005J\u0016\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0005R\u001c\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u00070\u0007X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u000bR\u000e\u0010\f\u001a\u00020\rX\u0082D¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Landroidx/compose/animation/core/ArcSpline;", "", "arcModes", "", "timePoints", "", "y", "", "([I[F[[F)V", "arcs", "Landroidx/compose/animation/core/ArcSpline$Arc;", "[[Landroidx/compose/animation/core/ArcSpline$Arc;", "isExtrapolate", "", "getPos", "", "time", "", "v", "getSlope", "Arc", "animation-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class ArcSpline {
    public static final int $stable = 0;
    private final Arc[][] arcs;
    private final boolean isExtrapolate;

    /* JADX INFO: compiled from: ArcSpline.kt */
    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0014\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\r\b\u0007\u0018\u00002\u00020\u0001B?\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\u0006\u0010\n\u001a\u00020\u0005¢\u0006\u0002\u0010\u000bJ-\u0010!\u001a\u00020\"2\u0006\u0010\u0007\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u0005H\u0000¢\u0006\u0002\b#J\u0011\u0010$\u001a\u00020\u00052\u0006\u0010%\u001a\u00020\u0005H\u0082\bJ\u0006\u0010&\u001a\u00020\u0005J\u0006\u0010'\u001a\u00020\u0005J\t\u0010(\u001a\u00020\u0005H\u0086\bJ\t\u0010)\u001a\u00020\u0005H\u0086\bJ\u000e\u0010*\u001a\u00020\u00052\u0006\u0010%\u001a\u00020\u0005J\u000e\u0010+\u001a\u00020\u00052\u0006\u0010%\u001a\u00020\u0005J\u0010\u0010,\u001a\u00020\u00052\u0006\u0010-\u001a\u00020\u0005H\u0002J\u000e\u0010.\u001a\u00020\"2\u0006\u0010%\u001a\u00020\u0005R\u000e\u0010\f\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u00020\u00058\u0000X\u0081\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u00020\u00058\u0000X\u0081\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0010\u001a\u00020\u00058\u0000X\u0081\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0011\u001a\u00020\u00058\u0000X\u0081\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0012\u001a\u00020\u00138\u0000X\u0081\u0004¢\u0006\u0002\n\u0000R\u0015\u0010\u0014\u001a\u00020\u00058À\u0002X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R\u0015\u0010\u0017\u001a\u00020\u00058À\u0002X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0016R\u000e\u0010\u0019\u001a\u00020\u001aX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0016R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0016R\u000e\u0010\u001e\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006/"}, d2 = {"Landroidx/compose/animation/core/ArcSpline$Arc;", "", "mode", "", "time1", "", "time2", "x1", "y1", "x2", "y2", "(IFFFFFF)V", "arcDistance", "arcVelocity", "ellipseA", "ellipseB", "ellipseCenterX", "ellipseCenterY", "isLinear", "", "linearDX", "getLinearDX$animation_core_release", "()F", "linearDY", "getLinearDY$animation_core_release", "lut", "", "oneOverDeltaTime", "getTime1", "getTime2", "tmpCosAngle", "tmpSinAngle", "vertical", "buildTable", "", "buildTable$animation_core_release", "calcAngle", "time", "calcDX", "calcDY", "calcX", "calcY", "getLinearX", "getLinearY", "lookup", "v", "setPoint", "animation-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Arc {
        public static final int $stable = 0;
        private float arcDistance;
        private final float arcVelocity;
        public final float ellipseA;
        public final float ellipseB;
        public final float ellipseCenterX;
        public final float ellipseCenterY;
        public final boolean isLinear;
        private final float[] lut;
        private final float oneOverDeltaTime;
        private final float time1;
        private final float time2;
        private float tmpCosAngle;
        private float tmpSinAngle;
        private final float vertical;
        private final float x1;
        private final float x2;
        private final float y1;
        private final float y2;

        static {
            $stable = 8;
        }

        public Arc(int mode, float time1, float time2, float x1, float y1, float x2, float y2) {
            this.time1 = time1;
            this.time2 = time2;
            this.x1 = x1;
            this.y1 = y1;
            this.x2 = x2;
            this.y2 = y2;
            float dx = this.x2 - this.x1;
            float dy = this.y2 - this.y1;
            boolean isLinear = false;
            switch(mode) {
                case 1: goto L13;
                case 2: goto L4;
                case 3: goto L4;
                case 4: goto L10;
                case 5: goto L6;
                default: goto L4;
            };
        L4:
            boolean isVertical = false;
        L15:
            if (isVertical == false) goto L17;
            float r6 = -1.0f;
        L18:
            this.vertical = r6;
            this.oneOverDeltaTime = 1.0f / (this.time2 - this.time1);
            this.lut = new float[101];
            if (mode != 3) goto L21;
            isLinear = true;
        L21:
            if (isLinear == false) goto L23;
        L36:
            isLinear = true;
            this.arcDistance = (float) Math.hypot(dy, dx);
            this.arcVelocity = this.arcDistance * this.oneOverDeltaTime;
            this.ellipseCenterX = this.oneOverDeltaTime * dx;
            this.ellipseCenterY = this.oneOverDeltaTime * dy;
            this.ellipseA = Float.NaN;
            this.ellipseB = Float.NaN;
        L37:
            this.isLinear = isLinear;
            return;
        L23:
            if (Math.abs(dx) < 0.001f) goto L36;
            if (Math.abs(dy) < 0.001f) goto L36;
            this.ellipseA = this.vertical * dx;
            this.ellipseB = (-this.vertical) * dy;
            if (isVertical == false) goto L30;
            float r4 = this.x2;
        L31:
            this.ellipseCenterX = r4;
            if (isVertical == false) goto L34;
            float r5 = this.y1;
        L35:
            this.ellipseCenterY = r5;
            buildTable$animation_core_release(this.x1, this.y1, this.x2, this.y2);
            this.arcVelocity = this.arcDistance * this.oneOverDeltaTime;
            goto L37
        L34:
            r5 = this.y2;
            goto L35
        L30:
            r4 = this.x1;
            goto L31
        L17:
            r6 = 1.0f;
            goto L18
        L13:
            isVertical = true;
            goto L15
        L6:
            if (dy >= 0.0f) goto L8;
            isVertical = true;
            goto L15
        L8:
            isVertical = false;
            goto L15
        L10:
            if (dy <= 0.0f) goto L12;
            isVertical = true;
            goto L15
        L12:
            isVertical = false;
            goto L15
        }

        public static final /* synthetic */ float access$getTmpCosAngle$p(Arc $this) {
            return $this.tmpCosAngle;
        }

        public static final /* synthetic */ float access$getTmpSinAngle$p(Arc $this) {
            return $this.tmpSinAngle;
        }

        public final float getTime1() {
            return this.time1;
        }

        public final float getTime2() {
            return this.time2;
        }

        public final float getLinearDX$animation_core_release() {
            return this.ellipseCenterX;
        }

        public final float getLinearDY$animation_core_release() {
            return this.ellipseCenterY;
        }

        public final void setPoint(float time) {
            if (this.vertical != (-1.0f)) goto L5;
            boolean r2 = true;
        L6:
            if (r2 == false) goto L8;
            float r3 = this.time2 - time;
        L9:
            float percent$iv = r3 * this.oneOverDeltaTime;
            float angle = lookup(percent$iv) * 1.5707964f;
            this.tmpSinAngle = (float) Math.sin(angle);
            this.tmpCosAngle = (float) Math.cos(angle);
            return;
        L8:
            r3 = time - this.time1;
            goto L9
        L5:
            r2 = false;
            goto L6
        }

        private final float calcAngle(float time) {
            if (this.vertical != (-1.0f)) goto L5;
            boolean r1 = true;
        L6:
            if (r1 == false) goto L8;
            float r2 = this.time2 - time;
        L9:
            float percent = r2 * this.oneOverDeltaTime;
            return lookup(percent) * 1.5707964f;
        L8:
            r2 = time - this.time1;
            goto L9
        L5:
            r1 = false;
            goto L6
        }

        public final float calcX() {
            return this.ellipseCenterX + (this.ellipseA * access$getTmpSinAngle$p(this));
        }

        public final float calcY() {
            return this.ellipseCenterY + (this.ellipseB * access$getTmpCosAngle$p(this));
        }

        public final float calcDX() {
            float vx = this.ellipseA * this.tmpCosAngle;
            float vy = (-this.ellipseB) * this.tmpSinAngle;
            float norm = this.arcVelocity / ((float) Math.hypot(vx, vy));
            return (this.vertical * vx) * norm;
        }

        public final float calcDY() {
            float vx = this.ellipseA * this.tmpCosAngle;
            float vy = (-this.ellipseB) * this.tmpSinAngle;
            float norm = this.arcVelocity / ((float) Math.hypot(vx, vy));
            return (this.vertical * vy) * norm;
        }

        public final float getLinearX(float time) {
            float t = (time - this.time1) * this.oneOverDeltaTime;
            float t2 = this.x1;
            return t2 + ((this.x2 - this.x1) * t);
        }

        public final float getLinearY(float time) {
            float t = (time - this.time1) * this.oneOverDeltaTime;
            float t2 = this.y1;
            return t2 + ((this.y2 - this.y1) * t);
        }

        private final float lookup(float v) {
            if (v > 0.0f) goto L6;
            return 0.0f;
        L6:
            if (v < 1.0f) goto L8;
            return 1.0f;
        L8:
            float pos = 100.0f * v;
            int iv = (int) pos;
            float off = pos - ((int) pos);
            return this.lut[iv] + ((this.lut[iv + 1] - this.lut[iv]) * off);
        }

        public final void buildTable$animation_core_release(float x1, float y1, float x2, float y2) {
            float a = x2 - x1;
            float b = y1 - y2;
            float lx = 0.0f;
            float ly = b;
            float dist = 0.0f;
            float[] ourPercent = ArcSplineKt.access$getOurPercentCache$p();
            int lastIndex = ourPercent.length - 1;
            float lastIndexFloat = lastIndex;
            float[] lut = this.lut;
            int i = 1;
            if (1 > lastIndex) goto L8;
        L4:
            double value$iv = (((double) i) * 90.0d) / ((double) lastIndex);
            float angle = (float) Math.toRadians(value$iv);
            float s = (float) Math.sin(angle);
            float c = (float) Math.cos(angle);
            float px = a * s;
            float py = b * c;
            float a2 = a;
            float a3 = px - lx;
            float b2 = b;
            float lx2 = py - ly;
            dist = dist + ((float) Math.hypot(a3, lx2));
            ourPercent[i] = dist;
            lx = px;
            ly = py;
            if (i == lastIndex) goto L8;
            i = i + 1;
            a = a2;
            b = b2;
        L8:
            this.arcDistance = dist;
            int i2 = 1;
            if (1 > lastIndex) goto L13;
        L10:
            ourPercent[i2] = ourPercent[i2] / dist;
            if (i2 == lastIndex) goto L13;
            i2 = i2 + 1;
        L13:
            int i3 = 0;
            int r15 = lut.length;
        L14:
            if (i3 >= r15) goto L23;
            float pos = i3 / 100.0f;
            int index = ArraysKt.binarySearch$default(ourPercent, pos, 0, 0, 6, null);
            if (index < 0) goto L19;
            lut[i3] = index / lastIndexFloat;
        L22:
            i3 = i3 + 1;
            goto L14
        L19:
            if (index != (-1)) goto L21;
            lut[i3] = 0.0f;
            goto L22
        L21:
            int p1 = (-index) - 2;
            int p2 = (-index) - 1;
            float ans = (p1 + ((pos - ourPercent[p1]) / (ourPercent[p2] - ourPercent[p1]))) / lastIndexFloat;
            lut[i3] = ans;
            goto L22
        }
    }

    static {
        $stable = 8;
    }

    public ArcSpline(int[] arcModes, float[] timePoints, float[][] y) {
        this.isExtrapolate = true;
        int mode = 1;
        int last = 1;
        int r5 = timePoints.length - 1;
        Arc[][] r6 = new Arc[r5][];
        int r8 = 0;
    L3:
        if (r8 >= r5) goto L20;
        switch(arcModes[r8]) {
            case 0: goto L15;
            case 1: goto L14;
            case 2: goto L13;
            case 3: goto L9;
            case 4: goto L8;
            case 5: goto L7;
            default: goto L6;
        };
    L6:
        int mode2 = mode;
    L16:
        float[] yArray = y[r8];
        int r9 = r8 + 1;
        float[] yArray1 = y[r9];
        float timeArray = timePoints[r8];
        float timeArray1 = timePoints[r9];
        int dim = (yArray.length / 2) + (yArray.length % 2);
        Arc[] r11 = new Arc[dim];
        int r15 = 0;
    L17:
        if (r15 >= dim) goto L19;
        int k = r15 * 2;
        Arc[] r16 = r11;
        int r17 = r15;
        r16[r17] = new Arc(mode2, timeArray, timeArray1, yArray[k], yArray[k + 1], yArray1[k], yArray1[k + 1]);
        r15 = r17 + 1;
        r11 = r16;
        goto L17
    L19:
        r6[r8] = r11;
        r8 = r9;
        mode = mode2;
        goto L3
    L7:
        mode2 = 5;
        goto L16
    L8:
        mode2 = 4;
        goto L16
    L9:
        if (last != 1) goto L11;
        int r10 = 2;
    L12:
        int mode3 = r10;
        last = mode3;
        mode2 = mode3;
        goto L16
    L11:
        r10 = 1;
        goto L12
    L13:
        last = 2;
        mode2 = 2;
        goto L16
    L14:
        last = 1;
        mode2 = 1;
        goto L16
    L15:
        mode2 = 3;
        goto L16
    L20:
        this.arcs = r6;
    }

    public final void getPos(float time, float[] v) {
        float[] r1 = v;
        float t = time;
        Arc[][] arcs = this.arcs;
        int lastIndex = arcs.length - 1;
        float start = arcs[0][0].getTime1();
        float end = arcs[lastIndex][0].getTime2();
        int size = r1.length;
        if (this.isExtrapolate == true) goto L5;
        t = Math.min(Math.max(t, start), end);
    L22:
        boolean populated = false;
        int i = 0;
        int r8 = arcs.length;
    L23:
        if (i >= r8) goto L40;
        int k = 0;
        int j = 0;
    L26:
        if (j >= (size - 1)) goto L36;
        Arc arc = arcs[i][k];
        if (t > arc.getTime2()) goto L35;
        if (arc.isLinear == false) goto L32;
        v[j] = arc.getLinearX(t);
        v[j + 1] = arc.getLinearY(t);
    L33:
        populated = true;
        goto L35
    L32:
        arc.setPoint(t);
        v[j] = arc.ellipseCenterX + (arc.ellipseA * Arc.access$getTmpSinAngle$p(arc));
        v[j + 1] = arc.ellipseCenterY + (arc.ellipseB * Arc.access$getTmpCosAngle$p(arc));
    L35:
        j = j + 2;
        k = k + 1;
        goto L26
    L36:
        boolean populated2 = populated;
        if (populated2 == true) goto L38;
        i = i + 1;
        populated = populated2;
        goto L23
    L38:
        return;
    L40:
        return;
    L5:
        if (t < start) goto L9;
        if (t <= end) goto L22;
    L9:
        if (t <= end) goto L11;
        int p = lastIndex;
        float t0 = end;
    L12:
        float dt = t - t0;
        int i2 = 0;
        int j2 = 0;
    L14:
        if (i2 >= (size - 1)) goto L20;
        Arc arc2 = arcs[p][j2];
        if (arc2.isLinear == false) goto L18;
        r1[i2] = arc2.getLinearX(t0) + (arc2.ellipseCenterX * dt);
        r1[i2 + 1] = arc2.getLinearY(t0) + (arc2.ellipseCenterY * dt);
    L19:
        i2 = i2 + 2;
        j2 = j2 + 1;
        r1 = v;
        goto L14
    L18:
        arc2.setPoint(t0);
        v[i2] = (arc2.ellipseCenterX + (arc2.ellipseA * Arc.access$getTmpSinAngle$p(arc2))) + (arc2.calcDX() * dt);
        v[i2 + 1] = (arc2.ellipseCenterY + (arc2.ellipseB * Arc.access$getTmpCosAngle$p(arc2))) + (arc2.calcDY() * dt);
        goto L19
    L20:
        return;
    L11:
        p = 0;
        t0 = start;
        goto L12
    }

    public final void getSlope(float time, float[] v) {
        Arc[][] arcs = this.arcs;
        float minimumValue$iv = arcs[0][0].getTime1();
        float maximumValue$iv = arcs[arcs.length - 1][0].getTime2();
        float $this$fastCoerceAtLeast$iv$iv = time;
        if ($this$fastCoerceAtLeast$iv$iv >= minimumValue$iv) goto L6;
        $this$fastCoerceAtLeast$iv$iv = minimumValue$iv;
    L6:
        if ($this$fastCoerceAtLeast$iv$iv <= maximumValue$iv) goto L8;
        $this$fastCoerceAtLeast$iv$iv = maximumValue$iv;
    L8:
        int size = v.length;
        boolean populated = false;
        int i = 0;
        int r4 = arcs.length;
    L9:
        if (i >= r4) goto L24;
        int j = 0;
        int k = 0;
    L12:
        if (j >= (size - 1)) goto L21;
        Arc arc = arcs[i][k];
        if ($this$fastCoerceAtLeast$iv$iv > arc.getTime2()) goto L20;
        if (arc.isLinear == false) goto L18;
        v[j] = arc.ellipseCenterX;
        v[j + 1] = arc.ellipseCenterY;
    L19:
        populated = true;
        goto L20
    L18:
        arc.setPoint($this$fastCoerceAtLeast$iv$iv);
        v[j] = arc.calcDX();
        v[j + 1] = arc.calcDY();
    L20:
        j = j + 2;
        k = k + 1;
        goto L12
    L21:
        if (populated == true) goto L22;
        i = i + 1;
        goto L9
    L22:
        return;
    }
}
