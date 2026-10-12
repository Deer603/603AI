package androidx.core.content.res;

import androidx.core.graphics.ColorUtils;

/* JADX INFO: loaded from: classes4.dex */
public class CamColor {
    private static final float CHROMA_SEARCH_ENDPOINT = 0.4f;
    private static final float DE_MAX = 1.0f;
    private static final float DL_MAX = 0.2f;
    private static final float LIGHTNESS_SEARCH_ENDPOINT = 0.01f;
    private final float mAstar;
    private final float mBstar;
    private final float mChroma;
    private final float mHue;
    private final float mJ;
    private final float mJstar;
    private final float mM;
    private final float mQ;
    private final float mS;

    float getHue() {
        return this.mHue;
    }

    float getChroma() {
        return this.mChroma;
    }

    float getJ() {
        return this.mJ;
    }

    float getQ() {
        return this.mQ;
    }

    float getM() {
        return this.mM;
    }

    float getS() {
        return this.mS;
    }

    float getJStar() {
        return this.mJstar;
    }

    float getAStar() {
        return this.mAstar;
    }

    float getBStar() {
        return this.mBstar;
    }

    CamColor(float hue, float chroma, float j, float q, float m, float s, float jStar, float aStar, float bStar) {
        this.mHue = hue;
        this.mChroma = chroma;
        this.mJ = j;
        this.mQ = q;
        this.mM = m;
        this.mS = s;
        this.mJstar = jStar;
        this.mAstar = aStar;
        this.mBstar = bStar;
    }

    public static int toColor(float hue, float chroma, float lStar) {
        return toColor(hue, chroma, lStar, ViewingConditions.DEFAULT);
    }

    static CamColor fromColor(int color) {
        float[] outCamColor = new float[7];
        float[] outM3HCT = new float[3];
        fromColorInViewingConditions(color, ViewingConditions.DEFAULT, outCamColor, outM3HCT);
        return new CamColor(outM3HCT[0], outM3HCT[1], outCamColor[0], outCamColor[1], outCamColor[2], outCamColor[3], outCamColor[4], outCamColor[5], outCamColor[6]);
    }

    public static void getM3HCTfromColor(int color, float[] outM3HCT) {
        fromColorInViewingConditions(color, ViewingConditions.DEFAULT, null, outM3HCT);
        outM3HCT[2] = CamUtils.lStarFromInt(color);
    }

    static void fromColorInViewingConditions(int color, ViewingConditions viewingConditions, float[] outCamColor, float[] outM3HCT) {
        CamUtils.xyzFromInt(color, outM3HCT);
        float[][] matrix = CamUtils.XYZ_TO_CAM16RGB;
        float rT = ((outM3HCT[0] * matrix[0][0]) + (outM3HCT[1] * matrix[0][1])) + (outM3HCT[2] * matrix[0][2]);
        float gT = ((outM3HCT[0] * matrix[1][0]) + (outM3HCT[1] * matrix[1][1])) + (outM3HCT[2] * matrix[1][2]);
        float bT = ((outM3HCT[0] * matrix[2][0]) + (outM3HCT[1] * matrix[2][1])) + (outM3HCT[2] * matrix[2][2]);
        float rD = viewingConditions.getRgbD()[0] * rT;
        float gD = viewingConditions.getRgbD()[1] * gT;
        float bD = viewingConditions.getRgbD()[2] * bT;
        float rAF = (float) Math.pow(((double) (viewingConditions.getFl() * Math.abs(rD))) / 100.0d, 0.42d);
        float gAF = (float) Math.pow(((double) (viewingConditions.getFl() * Math.abs(gD))) / 100.0d, 0.42d);
        float bAF = (float) Math.pow(((double) (viewingConditions.getFl() * Math.abs(bD))) / 100.0d, 0.42d);
        float rA = ((Math.signum(rD) * 400.0f) * rAF) / (rAF + 27.13f);
        float gA = ((Math.signum(gD) * 400.0f) * gAF) / (gAF + 27.13f);
        float bA = ((Math.signum(bD) * 400.0f) * bAF) / (27.13f + bAF);
        float a = ((float) (((((double) rA) * 11.0d) + (((double) gA) * (-12.0d))) + ((double) bA))) / 11.0f;
        float b = ((float) (((double) (rA + gA)) - (((double) bA) * 2.0d))) / 9.0f;
        float u = (((rA * 20.0f) + (gA * 20.0f)) + (21.0f * bA)) / 20.0f;
        float p2 = (((40.0f * rA) + (gA * 20.0f)) + bA) / 20.0f;
        float atan2 = (float) Math.atan2(b, a);
        float atanDegrees = (atan2 * 180.0f) / 3.1415927f;
        if (atanDegrees >= 0.0f) goto L6;
        float r29 = atanDegrees + 360.0f;
    L9:
        float hue = r29;
        float hueRadians = (3.1415927f * hue) / 180.0f;
        float ac = viewingConditions.getNbb() * p2;
        float j = ((float) Math.pow(ac / viewingConditions.getAw(), viewingConditions.getC() * viewingConditions.getZ())) * 100.0f;
        float q = (((4.0f / viewingConditions.getC()) * ((float) Math.sqrt(j / 100.0f))) * (viewingConditions.getAw() + 4.0f)) * viewingConditions.getFlRoot();
        if (hue >= 20.14d) goto L12;
        float r31 = hue + 360.0f;
    L13:
        float huePrime = r31;
        float eHue = ((float) (Math.cos(((((double) huePrime) * 3.141592653589793d) / 180.0d) + 2.0d) + 3.8d)) * 0.25f;
        float p1 = ((3846.1538f * eHue) * viewingConditions.getNc()) * viewingConditions.getNcb();
        float eHue2 = (a * a) + (b * b);
        float t = (p1 * ((float) Math.sqrt(eHue2))) / (u + 0.305f);
        float alpha = ((float) Math.pow(1.64d - Math.pow(0.29d, viewingConditions.getN()), 0.73d)) * ((float) Math.pow(t, 0.9d));
        float c = ((float) Math.sqrt(((double) j) / 100.0d)) * alpha;
        float m = viewingConditions.getFlRoot() * c;
        float s = ((float) Math.sqrt((viewingConditions.getC() * alpha) / (viewingConditions.getAw() + 4.0f))) * 50.0f;
        float jstar = (1.7f * j) / ((0.007f * j) + 1.0f);
        float mstar = ((float) Math.log((0.0228f * m) + 1.0f)) * 43.85965f;
        float astar = ((float) Math.cos(hueRadians)) * mstar;
        float bstar = ((float) Math.sin(hueRadians)) * mstar;
        outM3HCT[0] = hue;
        outM3HCT[1] = c;
        if (outCamColor == null) goto L17;
        outCamColor[0] = j;
        outCamColor[1] = q;
        outCamColor[2] = m;
        outCamColor[3] = s;
        outCamColor[4] = jstar;
        outCamColor[5] = astar;
        outCamColor[6] = bstar;
        return;
    L17:
        return;
    L12:
        r31 = hue;
        goto L13
    L6:
        if (atanDegrees < 360.0f) goto L8;
        r29 = atanDegrees - 360.0f;
        goto L9
    L8:
        r29 = atanDegrees;
        goto L9
    }

    private static CamColor fromJch(float j, float c, float h) {
        return fromJchInFrame(j, c, h, ViewingConditions.DEFAULT);
    }

    private static CamColor fromJchInFrame(float j, float c, float h, ViewingConditions viewingConditions) {
        float q = (((4.0f / viewingConditions.getC()) * ((float) Math.sqrt(((double) j) / 100.0d))) * (viewingConditions.getAw() + 4.0f)) * viewingConditions.getFlRoot();
        float m = c * viewingConditions.getFlRoot();
        float alpha = c / ((float) Math.sqrt(((double) j) / 100.0d));
        float s = ((float) Math.sqrt((viewingConditions.getC() * alpha) / (viewingConditions.getAw() + 4.0f))) * 50.0f;
        float hueRadians = (3.1415927f * h) / 180.0f;
        float jstar = (1.7f * j) / ((0.007f * j) + 1.0f);
        float mstar = ((float) Math.log((((double) m) * 0.0228d) + 1.0d)) * 43.85965f;
        float astar = mstar * ((float) Math.cos(hueRadians));
        float bstar = mstar * ((float) Math.sin(hueRadians));
        return new CamColor(h, c, j, q, m, s, jstar, astar, bstar);
    }

    float distance(CamColor other) {
        float dJ = getJStar() - other.getJStar();
        float dA = getAStar() - other.getAStar();
        float dB = getBStar() - other.getBStar();
        double dEPrime = Math.sqrt(((dJ * dJ) + (dA * dA)) + (dB * dB));
        double dE = Math.pow(dEPrime, 0.63d) * 1.41d;
        return (float) dE;
    }

    int viewedInSrgb() {
        return viewed(ViewingConditions.DEFAULT);
    }

    int viewed(ViewingConditions viewingConditions) {
        if (getChroma() != 0.0d) goto L5;
    L8:
        float alpha = 0.0f;
    L9:
        float t = (float) Math.pow(((double) alpha) / Math.pow(1.64d - Math.pow(0.29d, viewingConditions.getN()), 0.73d), 1.1111111111111112d);
        float hRad = (getHue() * 3.1415927f) / 180.0f;
        float eHue = ((float) (Math.cos(((double) hRad) + 2.0d) + 3.8d)) * 0.25f;
        float ac = viewingConditions.getAw() * ((float) Math.pow(((double) getJ()) / 100.0d, (1.0d / ((double) viewingConditions.getC())) / ((double) viewingConditions.getZ())));
        float p1 = ((3846.1538f * eHue) * viewingConditions.getNc()) * viewingConditions.getNcb();
        float p2 = ac / viewingConditions.getNbb();
        float hSin = (float) Math.sin(hRad);
        float hCos = (float) Math.cos(hRad);
        float gamma = (((0.305f + p2) * 23.0f) * t) / (((23.0f * p1) + ((11.0f * t) * hCos)) + ((108.0f * t) * hSin));
        float a = gamma * hCos;
        float b = gamma * hSin;
        float rA = (((p2 * 460.0f) + (451.0f * a)) + (288.0f * b)) / 1403.0f;
        float gA = (((p2 * 460.0f) - (891.0f * a)) - (261.0f * b)) / 1403.0f;
        float bA = (((460.0f * p2) - (220.0f * a)) - (6300.0f * b)) / 1403.0f;
        double r2 = ((double) Math.abs(rA)) * 27.13d;
        float alpha2 = Math.abs(rA);
        float rCBase = (float) Math.max(0.0d, r2 / (400.0d - ((double) alpha2)));
        float rC = ((float) Math.pow(rCBase, 2.380952380952381d)) * (Math.signum(rA) * (100.0f / viewingConditions.getFl()));
        float gCBase = (float) Math.max(0.0d, (((double) Math.abs(gA)) * 27.13d) / (400.0d - ((double) Math.abs(gA))));
        float gC = (Math.signum(gA) * (100.0f / viewingConditions.getFl())) * ((float) Math.pow(gCBase, 2.380952380952381d));
        float bCBase = (float) Math.max(0.0d, (((double) Math.abs(bA)) * 27.13d) / (400.0d - ((double) Math.abs(bA))));
        float bC = (Math.signum(bA) * (100.0f / viewingConditions.getFl())) * ((float) Math.pow(bCBase, 2.380952380952381d));
        float rF = rC / viewingConditions.getRgbD()[0];
        float gF = gC / viewingConditions.getRgbD()[1];
        float bF = bC / viewingConditions.getRgbD()[2];
        float[][] matrix = CamUtils.CAM16RGB_TO_XYZ;
        float x = ((matrix[0][0] * rF) + (matrix[0][1] * gF)) + (matrix[0][2] * bF);
        float gF2 = ((matrix[1][0] * rF) + (matrix[1][1] * gF)) + (matrix[1][2] * bF);
        float bC2 = ((matrix[2][0] * rF) + (matrix[2][1] * gF)) + (matrix[2][2] * bF);
        int argb = ColorUtils.XYZToColor(x, gF2, bC2);
        return argb;
    L5:
        if (getJ() == 0.0d) goto L8;
        alpha = getChroma() / ((float) Math.sqrt(((double) getJ()) / 100.0d));
        goto L9
    }

    static int toColor(float hue, float chroma, float lstar, ViewingConditions viewingConditions) {
        if (chroma < 1.0d) goto L32;
        if (Math.round(lstar) <= 0.0d) goto L32;
        if (Math.round(lstar) >= 100.0d) goto L32;
        float hue2 = 0.0f;
        if (hue < 0.0f) goto L13;
        hue2 = Math.min(360.0f, hue);
    L13:
        float high = chroma;
        float mid = chroma;
        float low = 0.0f;
        boolean isFirstLoop = true;
        CamColor answer = null;
    L15:
        if (Math.abs(low - high) < 0.4f) goto L26;
        CamColor possibleAnswer = findCamByJ(hue2, mid, lstar);
        if (isFirstLoop == true) goto L18;
        if (possibleAnswer != null) goto L24;
        high = mid;
    L25:
        mid = low + ((high - low) / 2.0f);
        goto L15
    L24:
        answer = possibleAnswer;
        low = mid;
        goto L25
    L18:
        if (possibleAnswer != null) goto L20;
        isFirstLoop = false;
        mid = low + ((high - low) / 2.0f);
        goto L15
    L20:
        return possibleAnswer.viewed(viewingConditions);
    L26:
        if (answer != null) goto L30;
        return CamUtils.intFromLStar(lstar);
    L30:
        return answer.viewed(viewingConditions);
    L32:
        return CamUtils.intFromLStar(lstar);
    }

    private static CamColor findCamByJ(float hue, float chroma, float lstar) {
        float low = 0.0f;
        float high = 100.0f;
        float bestdL = 1000.0f;
        float bestdE = 1000.0f;
        CamColor bestCam = null;
    L4:
        if (Math.abs(low - high) <= 0.01f) goto L20;
        float mid = low + ((high - low) / 2.0f);
        CamColor camBeforeClip = fromJch(mid, chroma, hue);
        int clipped = camBeforeClip.viewedInSrgb();
        float clippedLstar = CamUtils.lStarFromInt(clipped);
        float dL = Math.abs(lstar - clippedLstar);
        if (dL >= 0.2f) goto L11;
        CamColor camClipped = fromColor(clipped);
        float dE = camClipped.distance(fromJch(camClipped.getJ(), camClipped.getChroma(), hue));
        if (dE > 1.0f) goto L11;
        bestdL = dL;
        bestdE = dE;
        bestCam = camClipped;
    L11:
        if (bestdL != 0.0f) goto L16;
        if (bestdE == 0.0f) goto L20;
    L16:
        if (clippedLstar < lstar) goto L17;
        high = mid;
        goto L4
    L17:
        low = mid;
    L20:
        return bestCam;
    }
}
