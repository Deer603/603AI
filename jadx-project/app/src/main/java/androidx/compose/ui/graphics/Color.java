package androidx.compose.ui.graphics;

import androidx.compose.ui.graphics.colorspace.ColorSpace;
import androidx.compose.ui.graphics.colorspace.ColorSpaceKt;
import androidx.compose.ui.graphics.colorspace.ColorSpaces;
import androidx.compose.ui.graphics.colorspace.Connector;
import androidx.compose.ui.graphics.colorspace.Rgb;
import kotlin.Metadata;
import kotlin.ULong;
import kotlin.UnsignedKt;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.scheduling.WorkQueueKt;

/* JADX INFO: compiled from: Color.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u001d\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087@\u0018\u0000 :2\u00020\u0001:\u0001:B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u001d\u001a\u00020\u0007H\u0087\n¢\u0006\u0004\b\u001e\u0010\u000bJ\u0010\u0010\u001f\u001a\u00020\u0007H\u0087\n¢\u0006\u0004\b \u0010\u000bJ\u0010\u0010!\u001a\u00020\u0007H\u0087\n¢\u0006\u0004\b\"\u0010\u000bJ\u0010\u0010#\u001a\u00020\u0007H\u0087\n¢\u0006\u0004\b$\u0010\u000bJ\u0010\u0010%\u001a\u00020\u0010H\u0087\n¢\u0006\u0004\b&\u0010\u0013J\u001b\u0010'\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u0010ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b(\u0010)J=\u0010*\u001a\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\u0017\u001a\u00020\u00072\b\b\u0002\u0010\u0014\u001a\u00020\u00072\b\b\u0002\u0010\f\u001a\u00020\u0007H\u0007ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b+\u0010,J\u001a\u0010-\u001a\u00020.2\b\u0010/\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b0\u00101J\u0010\u00102\u001a\u000203HÖ\u0001¢\u0006\u0004\b4\u00105J\u000f\u00106\u001a\u000207H\u0016¢\u0006\u0004\b8\u00109R\u001a\u0010\u0006\u001a\u00020\u00078FX\u0087\u0004¢\u0006\f\u0012\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\f\u001a\u00020\u00078FX\u0087\u0004¢\u0006\f\u0012\u0004\b\r\u0010\t\u001a\u0004\b\u000e\u0010\u000bR\u001a\u0010\u000f\u001a\u00020\u00108FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0011\u0010\t\u001a\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0014\u001a\u00020\u00078FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0015\u0010\t\u001a\u0004\b\u0016\u0010\u000bR\u001a\u0010\u0017\u001a\u00020\u00078FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0018\u0010\t\u001a\u0004\b\u0019\u0010\u000bR\u0019\u0010\u0002\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u001c\u001a\u0004\b\u001a\u0010\u001b\u0088\u0001\u0002\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006;"}, d2 = {"Landroidx/compose/ui/graphics/Color;", "", "value", "Lkotlin/ULong;", "constructor-impl", "(J)J", "alpha", "", "getAlpha$annotations", "()V", "getAlpha-impl", "(J)F", "blue", "getBlue$annotations", "getBlue-impl", "colorSpace", "Landroidx/compose/ui/graphics/colorspace/ColorSpace;", "getColorSpace$annotations", "getColorSpace-impl", "(J)Landroidx/compose/ui/graphics/colorspace/ColorSpace;", "green", "getGreen$annotations", "getGreen-impl", "red", "getRed$annotations", "getRed-impl", "getValue-s-VKNKU", "()J", "J", "component1", "component1-impl", "component2", "component2-impl", "component3", "component3-impl", "component4", "component4-impl", "component5", "component5-impl", "convert", "convert-vNxB06k", "(JLandroidx/compose/ui/graphics/colorspace/ColorSpace;)J", "copy", "copy-wmQWz5c", "(JFFFF)J", "equals", "", "other", "equals-impl", "(JLjava/lang/Object;)Z", "hashCode", "", "hashCode-impl", "(J)I", "toString", "", "toString-impl", "(J)Ljava/lang/String;", "Companion", "ui-graphics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@JvmInline
public final class Color {
    private static final long Black = 0;
    private static final long Blue = 0;
    public static final Companion Companion = null;
    private static final long Cyan = 0;
    private static final long DarkGray = 0;
    private static final long Gray = 0;
    private static final long Green = 0;
    private static final long LightGray = 0;
    private static final long Magenta = 0;
    private static final long Red = 0;
    private static final long Transparent = 0;
    private static final long Unspecified = 0;
    private static final long White = 0;
    private static final long Yellow = 0;
    private final long value;

    /* JADX INFO: compiled from: Color.kt */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b*\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\t\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J?\u0010-\u001a\u00020\u00042\u0006\u0010.\u001a\u00020/2\u0006\u00100\u001a\u00020/2\u0006\u00101\u001a\u00020/2\b\b\u0002\u00102\u001a\u00020/2\b\b\u0002\u00103\u001a\u000204ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b5\u00106J(\u00107\u001a\u00020/2\u0006\u00108\u001a\u0002092\u0006\u0010:\u001a\u00020/2\u0006\u0010;\u001a\u00020/2\u0006\u0010<\u001a\u00020/H\u0002J?\u0010=\u001a\u00020\u00042\u0006\u0010.\u001a\u00020/2\u0006\u00100\u001a\u00020/2\u0006\u0010>\u001a\u00020/2\b\b\u0002\u00102\u001a\u00020/2\b\b\u0002\u00103\u001a\u000204ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b?\u00106J(\u0010@\u001a\u00020/2\u0006\u00108\u001a\u0002092\u0006\u0010:\u001a\u00020/2\u0006\u0010;\u001a\u00020/2\u0006\u0010A\u001a\u00020/H\u0002R$\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0010\n\u0002\u0010\b\u0012\u0004\b\u0005\u0010\u0002\u001a\u0004\b\u0006\u0010\u0007R$\u0010\t\u001a\u00020\u00048\u0006X\u0087\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0010\n\u0002\u0010\b\u0012\u0004\b\n\u0010\u0002\u001a\u0004\b\u000b\u0010\u0007R$\u0010\f\u001a\u00020\u00048\u0006X\u0087\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0010\n\u0002\u0010\b\u0012\u0004\b\r\u0010\u0002\u001a\u0004\b\u000e\u0010\u0007R$\u0010\u000f\u001a\u00020\u00048\u0006X\u0087\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0010\n\u0002\u0010\b\u0012\u0004\b\u0010\u0010\u0002\u001a\u0004\b\u0011\u0010\u0007R$\u0010\u0012\u001a\u00020\u00048\u0006X\u0087\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0010\n\u0002\u0010\b\u0012\u0004\b\u0013\u0010\u0002\u001a\u0004\b\u0014\u0010\u0007R$\u0010\u0015\u001a\u00020\u00048\u0006X\u0087\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0010\n\u0002\u0010\b\u0012\u0004\b\u0016\u0010\u0002\u001a\u0004\b\u0017\u0010\u0007R$\u0010\u0018\u001a\u00020\u00048\u0006X\u0087\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0010\n\u0002\u0010\b\u0012\u0004\b\u0019\u0010\u0002\u001a\u0004\b\u001a\u0010\u0007R$\u0010\u001b\u001a\u00020\u00048\u0006X\u0087\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0010\n\u0002\u0010\b\u0012\u0004\b\u001c\u0010\u0002\u001a\u0004\b\u001d\u0010\u0007R$\u0010\u001e\u001a\u00020\u00048\u0006X\u0087\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0010\n\u0002\u0010\b\u0012\u0004\b\u001f\u0010\u0002\u001a\u0004\b \u0010\u0007R$\u0010!\u001a\u00020\u00048\u0006X\u0087\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0010\n\u0002\u0010\b\u0012\u0004\b\"\u0010\u0002\u001a\u0004\b#\u0010\u0007R$\u0010$\u001a\u00020\u00048\u0006X\u0087\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0010\n\u0002\u0010\b\u0012\u0004\b%\u0010\u0002\u001a\u0004\b&\u0010\u0007R$\u0010'\u001a\u00020\u00048\u0006X\u0087\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0010\n\u0002\u0010\b\u0012\u0004\b(\u0010\u0002\u001a\u0004\b)\u0010\u0007R$\u0010*\u001a\u00020\u00048\u0006X\u0087\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0010\n\u0002\u0010\b\u0012\u0004\b+\u0010\u0002\u001a\u0004\b,\u0010\u0007\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006B"}, d2 = {"Landroidx/compose/ui/graphics/Color$Companion;", "", "()V", "Black", "Landroidx/compose/ui/graphics/Color;", "getBlack-0d7_KjU$annotations", "getBlack-0d7_KjU", "()J", "J", "Blue", "getBlue-0d7_KjU$annotations", "getBlue-0d7_KjU", "Cyan", "getCyan-0d7_KjU$annotations", "getCyan-0d7_KjU", "DarkGray", "getDarkGray-0d7_KjU$annotations", "getDarkGray-0d7_KjU", "Gray", "getGray-0d7_KjU$annotations", "getGray-0d7_KjU", "Green", "getGreen-0d7_KjU$annotations", "getGreen-0d7_KjU", "LightGray", "getLightGray-0d7_KjU$annotations", "getLightGray-0d7_KjU", "Magenta", "getMagenta-0d7_KjU$annotations", "getMagenta-0d7_KjU", "Red", "getRed-0d7_KjU$annotations", "getRed-0d7_KjU", "Transparent", "getTransparent-0d7_KjU$annotations", "getTransparent-0d7_KjU", "Unspecified", "getUnspecified-0d7_KjU$annotations", "getUnspecified-0d7_KjU", "White", "getWhite-0d7_KjU$annotations", "getWhite-0d7_KjU", "Yellow", "getYellow-0d7_KjU$annotations", "getYellow-0d7_KjU", "hsl", "hue", "", "saturation", "lightness", "alpha", "colorSpace", "Landroidx/compose/ui/graphics/colorspace/Rgb;", "hsl-JlNiLsg", "(FFFFLandroidx/compose/ui/graphics/colorspace/Rgb;)J", "hslToRgbComponent", "n", "", "h", "s", "l", "hsv", "value", "hsv-JlNiLsg", "hsvToRgbComponent", "v", "ui-graphics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker r1) {
            this();
        }

        /* JADX INFO: renamed from: getBlack-0d7_KjU$annotations, reason: not valid java name */
        public static /* synthetic */ void m4377getBlack0d7_KjU$annotations() {
        }

        /* JADX INFO: renamed from: getBlue-0d7_KjU$annotations, reason: not valid java name */
        public static /* synthetic */ void m4378getBlue0d7_KjU$annotations() {
        }

        /* JADX INFO: renamed from: getCyan-0d7_KjU$annotations, reason: not valid java name */
        public static /* synthetic */ void m4379getCyan0d7_KjU$annotations() {
        }

        /* JADX INFO: renamed from: getDarkGray-0d7_KjU$annotations, reason: not valid java name */
        public static /* synthetic */ void m4380getDarkGray0d7_KjU$annotations() {
        }

        /* JADX INFO: renamed from: getGray-0d7_KjU$annotations, reason: not valid java name */
        public static /* synthetic */ void m4381getGray0d7_KjU$annotations() {
        }

        /* JADX INFO: renamed from: getGreen-0d7_KjU$annotations, reason: not valid java name */
        public static /* synthetic */ void m4382getGreen0d7_KjU$annotations() {
        }

        /* JADX INFO: renamed from: getLightGray-0d7_KjU$annotations, reason: not valid java name */
        public static /* synthetic */ void m4383getLightGray0d7_KjU$annotations() {
        }

        /* JADX INFO: renamed from: getMagenta-0d7_KjU$annotations, reason: not valid java name */
        public static /* synthetic */ void m4384getMagenta0d7_KjU$annotations() {
        }

        /* JADX INFO: renamed from: getRed-0d7_KjU$annotations, reason: not valid java name */
        public static /* synthetic */ void m4385getRed0d7_KjU$annotations() {
        }

        /* JADX INFO: renamed from: getTransparent-0d7_KjU$annotations, reason: not valid java name */
        public static /* synthetic */ void m4386getTransparent0d7_KjU$annotations() {
        }

        /* JADX INFO: renamed from: getUnspecified-0d7_KjU$annotations, reason: not valid java name */
        public static /* synthetic */ void m4387getUnspecified0d7_KjU$annotations() {
        }

        /* JADX INFO: renamed from: getWhite-0d7_KjU$annotations, reason: not valid java name */
        public static /* synthetic */ void m4388getWhite0d7_KjU$annotations() {
        }

        /* JADX INFO: renamed from: getYellow-0d7_KjU$annotations, reason: not valid java name */
        public static /* synthetic */ void m4389getYellow0d7_KjU$annotations() {
        }

        private Companion() {
        }

        /* JADX INFO: renamed from: getBlack-0d7_KjU, reason: not valid java name */
        public final long m4392getBlack0d7_KjU() {
            return Color.access$getBlack$cp();
        }

        /* JADX INFO: renamed from: getDarkGray-0d7_KjU, reason: not valid java name */
        public final long m4395getDarkGray0d7_KjU() {
            return Color.access$getDarkGray$cp();
        }

        /* JADX INFO: renamed from: getGray-0d7_KjU, reason: not valid java name */
        public final long m4396getGray0d7_KjU() {
            return Color.access$getGray$cp();
        }

        /* JADX INFO: renamed from: getLightGray-0d7_KjU, reason: not valid java name */
        public final long m4398getLightGray0d7_KjU() {
            return Color.access$getLightGray$cp();
        }

        /* JADX INFO: renamed from: getWhite-0d7_KjU, reason: not valid java name */
        public final long m4403getWhite0d7_KjU() {
            return Color.access$getWhite$cp();
        }

        /* JADX INFO: renamed from: getRed-0d7_KjU, reason: not valid java name */
        public final long m4400getRed0d7_KjU() {
            return Color.access$getRed$cp();
        }

        /* JADX INFO: renamed from: getGreen-0d7_KjU, reason: not valid java name */
        public final long m4397getGreen0d7_KjU() {
            return Color.access$getGreen$cp();
        }

        /* JADX INFO: renamed from: getBlue-0d7_KjU, reason: not valid java name */
        public final long m4393getBlue0d7_KjU() {
            return Color.access$getBlue$cp();
        }

        /* JADX INFO: renamed from: getYellow-0d7_KjU, reason: not valid java name */
        public final long m4404getYellow0d7_KjU() {
            return Color.access$getYellow$cp();
        }

        /* JADX INFO: renamed from: getCyan-0d7_KjU, reason: not valid java name */
        public final long m4394getCyan0d7_KjU() {
            return Color.access$getCyan$cp();
        }

        /* JADX INFO: renamed from: getMagenta-0d7_KjU, reason: not valid java name */
        public final long m4399getMagenta0d7_KjU() {
            return Color.access$getMagenta$cp();
        }

        /* JADX INFO: renamed from: getTransparent-0d7_KjU, reason: not valid java name */
        public final long m4401getTransparent0d7_KjU() {
            return Color.access$getTransparent$cp();
        }

        /* JADX INFO: renamed from: getUnspecified-0d7_KjU, reason: not valid java name */
        public final long m4402getUnspecified0d7_KjU() {
            return Color.access$getUnspecified$cp();
        }

        /* JADX INFO: renamed from: hsv-JlNiLsg$default, reason: not valid java name */
        public static /* synthetic */ long m4391hsvJlNiLsg$default(Companion r6, float r7, float r8, float r9, float r10, Rgb r11, int r12, Object r13) {
            if ((r12 & 8) == 0) goto L5;
            float r4 = 1.0f;
        L7:
            if ((r12 & 16) == 0) goto L9;
            Rgb r5 = ColorSpaces.INSTANCE.getSrgb();
        L11:
            return r6.m4406hsvJlNiLsg(r7, r8, r9, r4, r5);
        L9:
            r5 = r11;
            goto L11
        L5:
            r4 = r10;
            goto L7
        }

        /* JADX INFO: renamed from: hsv-JlNiLsg, reason: not valid java name */
        public final long m4406hsvJlNiLsg(float hue, float saturation, float value, float alpha, Rgb colorSpace) {
            boolean value$iv = false;
            if (0.0f <= hue) goto L5;
        L7:
            boolean r1 = false;
        L8:
            if (r1 == false) goto L25;
            if (0.0f <= saturation) goto L12;
        L14:
            boolean r2 = false;
        L15:
            if (r2 == false) goto L25;
            if (0.0f <= value) goto L19;
        L21:
            boolean r0 = false;
        L22:
            if (r0 == false) goto L25;
            value$iv = true;
            goto L25
        L19:
            if (value > 1.0f) goto L21;
            r0 = true;
            goto L22
        L12:
            if (saturation > 1.0f) goto L14;
            r2 = true;
        L25:
            if (value$iv == true) goto L27;
            InlineClassHelperKt.throwIllegalArgumentException("HSV (" + hue + ", " + saturation + ", " + value + ") must be in range (0..360, 0..1, 0..1)");
        L27:
            float red = hsvToRgbComponent(5, hue, saturation, value);
            float green = hsvToRgbComponent(3, hue, saturation, value);
            float blue = hsvToRgbComponent(1, hue, saturation, value);
            return ColorKt.Color(red, green, blue, alpha, colorSpace);
        L5:
            if (hue > 360.0f) goto L7;
            r1 = true;
            goto L8
        }

        private final float hsvToRgbComponent(int n, float h, float s, float v) {
            float k = (n + (h / 60.0f)) % 6.0f;
            return v - ((v * s) * Math.max(0.0f, Math.min(k, Math.min(4.0f - k, 1.0f))));
        }

        /* JADX INFO: renamed from: hsl-JlNiLsg$default, reason: not valid java name */
        public static /* synthetic */ long m4390hslJlNiLsg$default(Companion r6, float r7, float r8, float r9, float r10, Rgb r11, int r12, Object r13) {
            if ((r12 & 8) == 0) goto L5;
            float r4 = 1.0f;
        L7:
            if ((r12 & 16) == 0) goto L9;
            Rgb r5 = ColorSpaces.INSTANCE.getSrgb();
        L11:
            return r6.m4405hslJlNiLsg(r7, r8, r9, r4, r5);
        L9:
            r5 = r11;
            goto L11
        L5:
            r4 = r10;
            goto L7
        }

        /* JADX INFO: renamed from: hsl-JlNiLsg, reason: not valid java name */
        public final long m4405hslJlNiLsg(float hue, float saturation, float lightness, float alpha, Rgb colorSpace) {
            boolean value$iv = true;
            if (0.0f <= hue) goto L5;
        L7:
            boolean r1 = false;
        L8:
            if (r1 == true) goto L10;
        L24:
            value$iv = false;
        L26:
            if (value$iv == true) goto L28;
            InlineClassHelperKt.throwIllegalArgumentException("HSL (" + hue + ", " + saturation + ", " + lightness + ") must be in range (0..360, 0..1, 0..1)");
        L28:
            float red = hslToRgbComponent(0, hue, saturation, lightness);
            float green = hslToRgbComponent(8, hue, saturation, lightness);
            float blue = hslToRgbComponent(4, hue, saturation, lightness);
            return ColorKt.Color(red, green, blue, alpha, colorSpace);
        L10:
            if (0.0f <= saturation) goto L12;
        L14:
            boolean r2 = false;
        L15:
            if (r2 == false) goto L24;
            if (0.0f <= lightness) goto L19;
        L21:
            boolean r0 = false;
        L22:
            if (r0 == false) goto L24;
        L19:
            if (lightness > 1.0f) goto L21;
            r0 = true;
            goto L22
        L12:
            if (saturation > 1.0f) goto L14;
            r2 = true;
            goto L15
        L5:
            if (hue > 360.0f) goto L7;
            r1 = true;
            goto L8
        }

        private final float hslToRgbComponent(int n, float h, float s, float l) {
            float k = (n + (h / 30.0f)) % 12.0f;
            float a = Math.min(l, 1.0f - l) * s;
            return l - (Math.max(-1.0f, Math.min(k - 3.0f, Math.min(9.0f - k, 1.0f))) * a);
        }
    }

    /* JADX INFO: renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ Color m4356boximpl(long r1) {
        return new Color(r1);
    }

    /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
    public static long m4362constructorimpl(long r0) {
        return r0;
    }

    /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
    public static boolean m4366equalsimpl(long r4, Object r6) {
        if ((r6 instanceof Color) == true) goto L6;
        return false;
    L6:
        if (r4 == ((Color) r6).m4376unboximpl()) goto L8;
        return false;
    L8:
        return true;
    }

    /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m4367equalsimpl0(long r1, long r3) {
        return ULong.m7606equalsimpl0(r1, r3);
    }

    public static /* synthetic */ void getAlpha$annotations() {
    }

    public static /* synthetic */ void getBlue$annotations() {
    }

    public static /* synthetic */ void getColorSpace$annotations() {
    }

    public static /* synthetic */ void getGreen$annotations() {
    }

    public static /* synthetic */ void getRed$annotations() {
    }

    /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
    public static int m4373hashCodeimpl(long r1) {
        return ULong.m7611hashCodeimpl(r1);
    }

    public boolean equals(Object r3) {
        return m4366equalsimpl(this.value, r3);
    }

    public int hashCode() {
        return m4373hashCodeimpl(this.value);
    }

    /* JADX INFO: renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ long m4376unboximpl() {
        return this.value;
    }

    public static final /* synthetic */ long access$getBlack$cp() {
        return Black;
    }

    public static final /* synthetic */ long access$getBlue$cp() {
        return Blue;
    }

    public static final /* synthetic */ long access$getCyan$cp() {
        return Cyan;
    }

    public static final /* synthetic */ long access$getDarkGray$cp() {
        return DarkGray;
    }

    public static final /* synthetic */ long access$getGray$cp() {
        return Gray;
    }

    public static final /* synthetic */ long access$getGreen$cp() {
        return Green;
    }

    public static final /* synthetic */ long access$getLightGray$cp() {
        return LightGray;
    }

    public static final /* synthetic */ long access$getMagenta$cp() {
        return Magenta;
    }

    public static final /* synthetic */ long access$getRed$cp() {
        return Red;
    }

    public static final /* synthetic */ long access$getTransparent$cp() {
        return Transparent;
    }

    public static final /* synthetic */ long access$getUnspecified$cp() {
        return Unspecified;
    }

    public static final /* synthetic */ long access$getWhite$cp() {
        return White;
    }

    public static final /* synthetic */ long access$getYellow$cp() {
        return Yellow;
    }

    private /* synthetic */ Color(long value) {
        this.value = value;
    }

    /* JADX INFO: renamed from: getValue-s-VKNKU, reason: not valid java name */
    public final long m4375getValuesVKNKU() {
        return this.value;
    }

    /* JADX INFO: renamed from: getColorSpace-impl, reason: not valid java name */
    public static final ColorSpace m4370getColorSpaceimpl(long arg0) {
        ColorSpaces this_$iv = ColorSpaces.INSTANCE;
        int id$iv = (int) ULong.m7599constructorimpl(63 & arg0);
        return this_$iv.getColorSpacesArray$ui_graphics_release()[id$iv];
    }

    /* JADX INFO: renamed from: convert-vNxB06k, reason: not valid java name */
    public static final long m4363convertvNxB06k(long arg0, ColorSpace colorSpace) {
        Connector connector = ColorSpaceKt.m4785connectYBCOT_4$default(m4370getColorSpaceimpl(arg0), colorSpace, 0, 2, null);
        return connector.mo4788transformToColorl2rxGTc$ui_graphics_release(arg0);
    }

    /* JADX INFO: renamed from: getRed-impl, reason: not valid java name */
    public static final float m4372getRedimpl(long arg0) {
        if (ULong.m7599constructorimpl(63 & arg0) == 0) goto L20;
        short h$iv = (short) ULong.m7599constructorimpl(ULong.m7599constructorimpl(arg0 >>> 48) & 65535);
        int bits$iv = 65535 & h$iv;
        int s$iv = 32768 & bits$iv;
        int e$iv = (bits$iv >>> 10) & 31;
        int m$iv = bits$iv & 1023;
        int outE$iv = 0;
        int outM$iv = 0;
        if (e$iv != 0) goto L12;
        if (m$iv == 0) goto L18;
        int bits$iv$iv = 1056964608 + m$iv;
        float o$iv = Float.intBitsToFloat(bits$iv$iv) - Float16Kt.access$getFp32DenormalFloat$p();
        if (s$iv != 0) goto L22;
        return o$iv;
    L22:
        return -o$iv;
    L18:
        int out$iv = ((s$iv << 16) | (outE$iv << 23)) | outM$iv;
        return Float.intBitsToFloat(out$iv);
    L12:
        outM$iv = m$iv << 13;
        if (e$iv != 31) goto L17;
        outE$iv = 255;
        if (outM$iv == 0) goto L18;
        outM$iv = outM$iv | 4194304;
        goto L18
    L17:
        outE$iv = (e$iv - 15) + WorkQueueKt.MASK;
        goto L18
    L20:
        return ((float) UnsignedKt.ulongToDouble(ULong.m7599constructorimpl(ULong.m7599constructorimpl(arg0 >>> 48) & 255))) / 255.0f;
    }

    /* JADX INFO: renamed from: getGreen-impl, reason: not valid java name */
    public static final float m4371getGreenimpl(long arg0) {
        if (ULong.m7599constructorimpl(63 & arg0) == 0) goto L20;
        short h$iv = (short) ULong.m7599constructorimpl(ULong.m7599constructorimpl(arg0 >>> 32) & 65535);
        int bits$iv = 65535 & h$iv;
        int s$iv = 32768 & bits$iv;
        int e$iv = (bits$iv >>> 10) & 31;
        int m$iv = bits$iv & 1023;
        int outE$iv = 0;
        int outM$iv = 0;
        if (e$iv != 0) goto L12;
        if (m$iv == 0) goto L18;
        int bits$iv$iv = 1056964608 + m$iv;
        float o$iv = Float.intBitsToFloat(bits$iv$iv) - Float16Kt.access$getFp32DenormalFloat$p();
        if (s$iv != 0) goto L22;
        return o$iv;
    L22:
        return -o$iv;
    L18:
        int out$iv = ((s$iv << 16) | (outE$iv << 23)) | outM$iv;
        return Float.intBitsToFloat(out$iv);
    L12:
        outM$iv = m$iv << 13;
        if (e$iv != 31) goto L17;
        outE$iv = 255;
        if (outM$iv == 0) goto L18;
        outM$iv = outM$iv | 4194304;
        goto L18
    L17:
        outE$iv = (e$iv - 15) + WorkQueueKt.MASK;
        goto L18
    L20:
        return ((float) UnsignedKt.ulongToDouble(ULong.m7599constructorimpl(ULong.m7599constructorimpl(arg0 >>> 40) & 255))) / 255.0f;
    }

    /* JADX INFO: renamed from: getBlue-impl, reason: not valid java name */
    public static final float m4369getBlueimpl(long arg0) {
        if (ULong.m7599constructorimpl(63 & arg0) == 0) goto L20;
        short h$iv = (short) ULong.m7599constructorimpl(ULong.m7599constructorimpl(arg0 >>> 16) & 65535);
        int bits$iv = 65535 & h$iv;
        int s$iv = 32768 & bits$iv;
        int e$iv = (bits$iv >>> 10) & 31;
        int m$iv = bits$iv & 1023;
        int outE$iv = 0;
        int outM$iv = 0;
        if (e$iv != 0) goto L12;
        if (m$iv == 0) goto L18;
        int bits$iv$iv = 1056964608 + m$iv;
        float o$iv = Float.intBitsToFloat(bits$iv$iv) - Float16Kt.access$getFp32DenormalFloat$p();
        if (s$iv != 0) goto L22;
        return o$iv;
    L22:
        return -o$iv;
    L18:
        int out$iv = ((s$iv << 16) | (outE$iv << 23)) | outM$iv;
        return Float.intBitsToFloat(out$iv);
    L12:
        outM$iv = m$iv << 13;
        if (e$iv != 31) goto L17;
        outE$iv = 255;
        if (outM$iv == 0) goto L18;
        outM$iv = outM$iv | 4194304;
        goto L18
    L17:
        outE$iv = (e$iv - 15) + WorkQueueKt.MASK;
        goto L18
    L20:
        return ((float) UnsignedKt.ulongToDouble(ULong.m7599constructorimpl(ULong.m7599constructorimpl(arg0 >>> 32) & 255))) / 255.0f;
    }

    /* JADX INFO: renamed from: getAlpha-impl, reason: not valid java name */
    public static final float m4368getAlphaimpl(long arg0) {
        if (ULong.m7599constructorimpl(63 & arg0) != 0) goto L6;
        return ((float) UnsignedKt.ulongToDouble(ULong.m7599constructorimpl(ULong.m7599constructorimpl(arg0 >>> 56) & 255))) / 255.0f;
    L6:
        return ((float) UnsignedKt.ulongToDouble(ULong.m7599constructorimpl(ULong.m7599constructorimpl(arg0 >>> 6) & 1023))) / 1023.0f;
    }

    /* JADX INFO: renamed from: component1-impl, reason: not valid java name */
    public static final float m4357component1impl(long arg0) {
        return m4372getRedimpl(arg0);
    }

    /* JADX INFO: renamed from: component2-impl, reason: not valid java name */
    public static final float m4358component2impl(long arg0) {
        return m4371getGreenimpl(arg0);
    }

    /* JADX INFO: renamed from: component3-impl, reason: not valid java name */
    public static final float m4359component3impl(long arg0) {
        return m4369getBlueimpl(arg0);
    }

    /* JADX INFO: renamed from: component4-impl, reason: not valid java name */
    public static final float m4360component4impl(long arg0) {
        return m4368getAlphaimpl(arg0);
    }

    /* JADX INFO: renamed from: component5-impl, reason: not valid java name */
    public static final ColorSpace m4361component5impl(long arg0) {
        return m4370getColorSpaceimpl(arg0);
    }

    /* JADX INFO: renamed from: copy-wmQWz5c$default, reason: not valid java name */
    public static /* synthetic */ long m4365copywmQWz5c$default(long r6, float r8, float r9, float r10, float r11, int r12, Object r13) {
        if ((r12 & 1) == 0) goto L5;
        float r2 = m4368getAlphaimpl(r6);
    L7:
        if ((r12 & 2) == 0) goto L9;
        float r3 = m4372getRedimpl(r6);
    L11:
        if ((r12 & 4) == 0) goto L13;
        float r4 = m4371getGreenimpl(r6);
    L15:
        if ((r12 & 8) == 0) goto L17;
        float r5 = m4369getBlueimpl(r6);
    L19:
        return m4364copywmQWz5c(r6, r2, r3, r4, r5);
    L17:
        r5 = r11;
        goto L19
    L13:
        r4 = r10;
        goto L15
    L9:
        r3 = r9;
        goto L11
    L5:
        r2 = r8;
        goto L7
    }

    /* JADX INFO: renamed from: copy-wmQWz5c, reason: not valid java name */
    public static final long m4364copywmQWz5c(long arg0, float alpha, float red, float green, float blue) {
        return ColorKt.Color(red, green, blue, alpha, m4370getColorSpaceimpl(arg0));
    }

    public String toString() {
        return m4374toStringimpl(this.value);
    }

    /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
    public static String m4374toStringimpl(long arg0) {
        return "Color(" + m4372getRedimpl(arg0) + ", " + m4371getGreenimpl(arg0) + ", " + m4369getBlueimpl(arg0) + ", " + m4368getAlphaimpl(arg0) + ", " + m4370getColorSpaceimpl(arg0).getName() + ')';
    }

    static {
        Companion = new Companion(null);
        Black = ColorKt.Color(4278190080L);
        DarkGray = ColorKt.Color(4282664004L);
        Gray = ColorKt.Color(4287137928L);
        LightGray = ColorKt.Color(4291611852L);
        White = ColorKt.Color(4294967295L);
        Red = ColorKt.Color(4294901760L);
        Green = ColorKt.Color(4278255360L);
        Blue = ColorKt.Color(4278190335L);
        Yellow = ColorKt.Color(4294967040L);
        Cyan = ColorKt.Color(4278255615L);
        Magenta = ColorKt.Color(4294902015L);
        Transparent = ColorKt.Color(0);
        Unspecified = ColorKt.Color(0.0f, 0.0f, 0.0f, 0.0f, ColorSpaces.INSTANCE.getUnspecified$ui_graphics_release());
    }
}
