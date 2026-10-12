package androidx.core.graphics;

import android.graphics.BlendMode;
import android.graphics.PorterDuff;

/* JADX INFO: loaded from: classes4.dex */
class BlendModeUtils {

    /* JADX INFO: renamed from: androidx.core.graphics.BlendModeUtils$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$androidx$core$graphics$BlendModeCompat = null;

        static {
            $SwitchMap$androidx$core$graphics$BlendModeCompat = new int[BlendModeCompat.values().length];
            $SwitchMap$androidx$core$graphics$BlendModeCompat[BlendModeCompat.CLEAR.ordinal()] = 1;     // Catch: NoSuchFieldError -> L5
        L119:
            $SwitchMap$androidx$core$graphics$BlendModeCompat[BlendModeCompat.SRC.ordinal()] = 2;     // Catch: NoSuchFieldError -> L8
        L127:
            $SwitchMap$androidx$core$graphics$BlendModeCompat[BlendModeCompat.DST.ordinal()] = 3;     // Catch: NoSuchFieldError -> L11
        L137:
            $SwitchMap$androidx$core$graphics$BlendModeCompat[BlendModeCompat.SRC_OVER.ordinal()] = 4;     // Catch: NoSuchFieldError -> L14
        L95:
            $SwitchMap$androidx$core$graphics$BlendModeCompat[BlendModeCompat.DST_OVER.ordinal()] = 5;     // Catch: NoSuchFieldError -> L17
        L101:
            $SwitchMap$androidx$core$graphics$BlendModeCompat[BlendModeCompat.SRC_IN.ordinal()] = 6;     // Catch: NoSuchFieldError -> L20
        L121:
            $SwitchMap$androidx$core$graphics$BlendModeCompat[BlendModeCompat.DST_IN.ordinal()] = 7;     // Catch: NoSuchFieldError -> L23
        L135:
            $SwitchMap$androidx$core$graphics$BlendModeCompat[BlendModeCompat.SRC_OUT.ordinal()] = 8;     // Catch: NoSuchFieldError -> L26
        L141:
            $SwitchMap$androidx$core$graphics$BlendModeCompat[BlendModeCompat.DST_OUT.ordinal()] = 9;     // Catch: NoSuchFieldError -> L29
        L91:
            $SwitchMap$androidx$core$graphics$BlendModeCompat[BlendModeCompat.SRC_ATOP.ordinal()] = 10;     // Catch: NoSuchFieldError -> L32
        L113:
            $SwitchMap$androidx$core$graphics$BlendModeCompat[BlendModeCompat.DST_ATOP.ordinal()] = 11;     // Catch: NoSuchFieldError -> L35
        L129:
            $SwitchMap$androidx$core$graphics$BlendModeCompat[BlendModeCompat.XOR.ordinal()] = 12;     // Catch: NoSuchFieldError -> L38
        L133:
            $SwitchMap$androidx$core$graphics$BlendModeCompat[BlendModeCompat.PLUS.ordinal()] = 13;     // Catch: NoSuchFieldError -> L41
        L145:
            $SwitchMap$androidx$core$graphics$BlendModeCompat[BlendModeCompat.MODULATE.ordinal()] = 14;     // Catch: NoSuchFieldError -> L44
        L107:
            $SwitchMap$androidx$core$graphics$BlendModeCompat[BlendModeCompat.SCREEN.ordinal()] = 15;     // Catch: NoSuchFieldError -> L47
        L117:
            $SwitchMap$androidx$core$graphics$BlendModeCompat[BlendModeCompat.OVERLAY.ordinal()] = 16;     // Catch: NoSuchFieldError -> L50
        L125:
            $SwitchMap$androidx$core$graphics$BlendModeCompat[BlendModeCompat.DARKEN.ordinal()] = 17;     // Catch: NoSuchFieldError -> L53
        L139:
            $SwitchMap$androidx$core$graphics$BlendModeCompat[BlendModeCompat.LIGHTEN.ordinal()] = 18;     // Catch: NoSuchFieldError -> L56
        L97:
            $SwitchMap$androidx$core$graphics$BlendModeCompat[BlendModeCompat.COLOR_DODGE.ordinal()] = 19;     // Catch: NoSuchFieldError -> L59
        L111:
            $SwitchMap$androidx$core$graphics$BlendModeCompat[BlendModeCompat.COLOR_BURN.ordinal()] = 20;     // Catch: NoSuchFieldError -> L62
        L115:
            $SwitchMap$androidx$core$graphics$BlendModeCompat[BlendModeCompat.HARD_LIGHT.ordinal()] = 21;     // Catch: NoSuchFieldError -> L65
        L131:
            $SwitchMap$androidx$core$graphics$BlendModeCompat[BlendModeCompat.SOFT_LIGHT.ordinal()] = 22;     // Catch: NoSuchFieldError -> L68
        L147:
            $SwitchMap$androidx$core$graphics$BlendModeCompat[BlendModeCompat.DIFFERENCE.ordinal()] = 23;     // Catch: NoSuchFieldError -> L71
        L105:
            $SwitchMap$androidx$core$graphics$BlendModeCompat[BlendModeCompat.EXCLUSION.ordinal()] = 24;     // Catch: NoSuchFieldError -> L74
        L109:
            $SwitchMap$androidx$core$graphics$BlendModeCompat[BlendModeCompat.MULTIPLY.ordinal()] = 25;     // Catch: NoSuchFieldError -> L77
        L123:
            $SwitchMap$androidx$core$graphics$BlendModeCompat[BlendModeCompat.HUE.ordinal()] = 26;     // Catch: NoSuchFieldError -> L80
        L143:
            $SwitchMap$androidx$core$graphics$BlendModeCompat[BlendModeCompat.SATURATION.ordinal()] = 27;     // Catch: NoSuchFieldError -> L83
        L93:
            $SwitchMap$androidx$core$graphics$BlendModeCompat[BlendModeCompat.COLOR.ordinal()] = 28;     // Catch: NoSuchFieldError -> L86
        L103:
            $SwitchMap$androidx$core$graphics$BlendModeCompat[BlendModeCompat.LUMINOSITY.ordinal()] = 29;     // Catch: NoSuchFieldError -> L89
            return;
        }
    }

    static class Api29Impl {
        private Api29Impl() {
        }

        static Object obtainBlendModeFromCompat(BlendModeCompat blendModeCompat) {
            switch(AnonymousClass1.$SwitchMap$androidx$core$graphics$BlendModeCompat[blendModeCompat.ordinal()]) {
                case 1: goto L63;
                case 2: goto L61;
                case 3: goto L59;
                case 4: goto L57;
                case 5: goto L55;
                case 6: goto L53;
                case 7: goto L51;
                case 8: goto L49;
                case 9: goto L47;
                case 10: goto L45;
                case 11: goto L43;
                case 12: goto L41;
                case 13: goto L39;
                case 14: goto L37;
                case 15: goto L35;
                case 16: goto L33;
                case 17: goto L31;
                case 18: goto L29;
                case 19: goto L27;
                case 20: goto L25;
                case 21: goto L23;
                case 22: goto L21;
                case 23: goto L19;
                case 24: goto L17;
                case 25: goto L15;
                case 26: goto L13;
                case 27: goto L11;
                case 28: goto L9;
                case 29: goto L7;
                default: goto L4;
            };
        L4:
            return null;
        L7:
            return BlendMode.LUMINOSITY;
        L9:
            return BlendMode.COLOR;
        L11:
            return BlendMode.SATURATION;
        L13:
            return BlendMode.HUE;
        L15:
            return BlendMode.MULTIPLY;
        L17:
            return BlendMode.EXCLUSION;
        L19:
            return BlendMode.DIFFERENCE;
        L21:
            return BlendMode.SOFT_LIGHT;
        L23:
            return BlendMode.HARD_LIGHT;
        L25:
            return BlendMode.COLOR_BURN;
        L27:
            return BlendMode.COLOR_DODGE;
        L29:
            return BlendMode.LIGHTEN;
        L31:
            return BlendMode.DARKEN;
        L33:
            return BlendMode.OVERLAY;
        L35:
            return BlendMode.SCREEN;
        L37:
            return BlendMode.MODULATE;
        L39:
            return BlendMode.PLUS;
        L41:
            return BlendMode.XOR;
        L43:
            return BlendMode.DST_ATOP;
        L45:
            return BlendMode.SRC_ATOP;
        L47:
            return BlendMode.DST_OUT;
        L49:
            return BlendMode.SRC_OUT;
        L51:
            return BlendMode.DST_IN;
        L53:
            return BlendMode.SRC_IN;
        L55:
            return BlendMode.DST_OVER;
        L57:
            return BlendMode.SRC_OVER;
        L59:
            return BlendMode.DST;
        L61:
            return BlendMode.SRC;
        L63:
            return BlendMode.CLEAR;
        }
    }

    private BlendModeUtils() {
    }

    static PorterDuff.Mode obtainPorterDuffFromCompat(BlendModeCompat blendModeCompat) {
        if (blendModeCompat != null) goto L6;
        return null;
    L6:
        switch(AnonymousClass1.$SwitchMap$androidx$core$graphics$BlendModeCompat[blendModeCompat.ordinal()]) {
            case 1: goto L43;
            case 2: goto L41;
            case 3: goto L39;
            case 4: goto L37;
            case 5: goto L35;
            case 6: goto L33;
            case 7: goto L31;
            case 8: goto L29;
            case 9: goto L27;
            case 10: goto L25;
            case 11: goto L23;
            case 12: goto L21;
            case 13: goto L19;
            case 14: goto L17;
            case 15: goto L15;
            case 16: goto L13;
            case 17: goto L11;
            case 18: goto L9;
            default: goto L7;
        };
    L7:
        return null;
    L9:
        return PorterDuff.Mode.LIGHTEN;
    L11:
        return PorterDuff.Mode.DARKEN;
    L13:
        return PorterDuff.Mode.OVERLAY;
    L15:
        return PorterDuff.Mode.SCREEN;
    L17:
        return PorterDuff.Mode.MULTIPLY;
    L19:
        return PorterDuff.Mode.ADD;
    L21:
        return PorterDuff.Mode.XOR;
    L23:
        return PorterDuff.Mode.DST_ATOP;
    L25:
        return PorterDuff.Mode.SRC_ATOP;
    L27:
        return PorterDuff.Mode.DST_OUT;
    L29:
        return PorterDuff.Mode.SRC_OUT;
    L31:
        return PorterDuff.Mode.DST_IN;
    L33:
        return PorterDuff.Mode.SRC_IN;
    L35:
        return PorterDuff.Mode.DST_OVER;
    L37:
        return PorterDuff.Mode.SRC_OVER;
    L39:
        return PorterDuff.Mode.DST;
    L41:
        return PorterDuff.Mode.SRC;
    L43:
        return PorterDuff.Mode.CLEAR;
    }
}
