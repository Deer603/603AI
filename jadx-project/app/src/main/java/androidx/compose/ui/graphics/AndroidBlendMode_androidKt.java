package androidx.compose.ui.graphics;

import android.graphics.PorterDuff;
import android.os.Build;
import kotlin.Metadata;

/* JADX INFO: compiled from: AndroidBlendMode.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0014\u0010\u0000\u001a\u00020\u0001*\u00020\u0002ø\u0001\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0016\u0010\u0005\u001a\u00020\u0006*\u00020\u0002H\u0001ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\b\u001a\u0011\u0010\t\u001a\u00020\u0002*\u00020\u0006H\u0001¢\u0006\u0002\u0010\n\u001a\u0016\u0010\u000b\u001a\u00020\f*\u00020\u0002H\u0000ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000e\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u000f"}, d2 = {"isSupported", "", "Landroidx/compose/ui/graphics/BlendMode;", "isSupported-s9anfk8", "(I)Z", "toAndroidBlendMode", "Landroid/graphics/BlendMode;", "toAndroidBlendMode-s9anfk8", "(I)Landroid/graphics/BlendMode;", "toComposeBlendMode", "(Landroid/graphics/BlendMode;)I", "toPorterDuffMode", "Landroid/graphics/PorterDuff$Mode;", "toPorterDuffMode-s9anfk8", "(I)Landroid/graphics/PorterDuff$Mode;", "ui-graphics_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class AndroidBlendMode_androidKt {

    /* JADX INFO: compiled from: AndroidBlendMode.android.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0 = null;

        static {
            int[] r0 = new int[android.graphics.BlendMode.values().length];
            r0[android.graphics.BlendMode.CLEAR.ordinal()] = 1;     // Catch: NoSuchFieldError -> L5
        L108:
            r0[android.graphics.BlendMode.SRC.ordinal()] = 2;     // Catch: NoSuchFieldError -> L8
        L120:
            r0[android.graphics.BlendMode.DST.ordinal()] = 3;     // Catch: NoSuchFieldError -> L11
        L134:
            r0[android.graphics.BlendMode.SRC_OVER.ordinal()] = 4;     // Catch: NoSuchFieldError -> L14
        L138:
            r0[android.graphics.BlendMode.DST_OVER.ordinal()] = 5;     // Catch: NoSuchFieldError -> L17
        L96:
            r0[android.graphics.BlendMode.SRC_IN.ordinal()] = 6;     // Catch: NoSuchFieldError -> L20
        L106:
            r0[android.graphics.BlendMode.DST_IN.ordinal()] = 7;     // Catch: NoSuchFieldError -> L23
        L112:
            r0[android.graphics.BlendMode.SRC_OUT.ordinal()] = 8;     // Catch: NoSuchFieldError -> L26
        L128:
            r0[android.graphics.BlendMode.DST_OUT.ordinal()] = 9;     // Catch: NoSuchFieldError -> L29
        L132:
            r0[android.graphics.BlendMode.SRC_ATOP.ordinal()] = 10;     // Catch: NoSuchFieldError -> L32
        L148:
            r0[android.graphics.BlendMode.DST_ATOP.ordinal()] = 11;     // Catch: NoSuchFieldError -> L35
        L94:
            r0[android.graphics.BlendMode.XOR.ordinal()] = 12;     // Catch: NoSuchFieldError -> L38
        L116:
            r0[android.graphics.BlendMode.PLUS.ordinal()] = 13;     // Catch: NoSuchFieldError -> L41
        L118:
            r0[android.graphics.BlendMode.MODULATE.ordinal()] = 14;     // Catch: NoSuchFieldError -> L44
        L136:
            r0[android.graphics.BlendMode.SCREEN.ordinal()] = 15;     // Catch: NoSuchFieldError -> L47
        L140:
            r0[android.graphics.BlendMode.OVERLAY.ordinal()] = 16;     // Catch: NoSuchFieldError -> L50
        L98:
            r0[android.graphics.BlendMode.DARKEN.ordinal()] = 17;     // Catch: NoSuchFieldError -> L53
        L100:
            r0[android.graphics.BlendMode.LIGHTEN.ordinal()] = 18;     // Catch: NoSuchFieldError -> L56
        L122:
            r0[android.graphics.BlendMode.COLOR_DODGE.ordinal()] = 19;     // Catch: NoSuchFieldError -> L59
        L124:
            r0[android.graphics.BlendMode.COLOR_BURN.ordinal()] = 20;     // Catch: NoSuchFieldError -> L62
        L142:
            r0[android.graphics.BlendMode.HARD_LIGHT.ordinal()] = 21;     // Catch: NoSuchFieldError -> L65
        L144:
            r0[android.graphics.BlendMode.SOFT_LIGHT.ordinal()] = 22;     // Catch: NoSuchFieldError -> L68
        L104:
            r0[android.graphics.BlendMode.DIFFERENCE.ordinal()] = 23;     // Catch: NoSuchFieldError -> L71
        L110:
            r0[android.graphics.BlendMode.EXCLUSION.ordinal()] = 24;     // Catch: NoSuchFieldError -> L74
        L126:
            r0[android.graphics.BlendMode.MULTIPLY.ordinal()] = 25;     // Catch: NoSuchFieldError -> L77
        L130:
            r0[android.graphics.BlendMode.HUE.ordinal()] = 26;     // Catch: NoSuchFieldError -> L80
        L146:
            r0[android.graphics.BlendMode.SATURATION.ordinal()] = 27;     // Catch: NoSuchFieldError -> L83
        L92:
            r0[android.graphics.BlendMode.COLOR.ordinal()] = 28;     // Catch: NoSuchFieldError -> L86
        L114:
            r0[android.graphics.BlendMode.LUMINOSITY.ordinal()] = 29;     // Catch: NoSuchFieldError -> L89
        L90:
            $EnumSwitchMapping$0 = r0;
        }
    }

    /* JADX INFO: renamed from: isSupported-s9anfk8, reason: not valid java name */
    public static final boolean m4216isSupporteds9anfk8(int $this$isSupported_u2ds9anfk8) {
        if (Build.VERSION.SDK_INT < 29) goto L5;
    L10:
        return true;
    L5:
        if (BlendMode.m4277equalsimpl0($this$isSupported_u2ds9anfk8, BlendMode.Companion.m4308getSrcOver0nO6VwU()) == true) goto L10;
        if (m4218toPorterDuffModes9anfk8($this$isSupported_u2ds9anfk8) != PorterDuff.Mode.SRC_OVER) goto L10;
        return false;
    }

    /* JADX INFO: renamed from: toPorterDuffMode-s9anfk8, reason: not valid java name */
    public static final PorterDuff.Mode m4218toPorterDuffModes9anfk8(int $this$toPorterDuffMode_u2ds9anfk8) {
        if (BlendMode.m4277equalsimpl0($this$toPorterDuffMode_u2ds9anfk8, BlendMode.Companion.m4281getClear0nO6VwU()) == false) goto L6;
        return PorterDuff.Mode.CLEAR;
    L6:
        if (BlendMode.m4277equalsimpl0($this$toPorterDuffMode_u2ds9anfk8, BlendMode.Companion.m4304getSrc0nO6VwU()) == false) goto L9;
        return PorterDuff.Mode.SRC;
    L9:
        if (BlendMode.m4277equalsimpl0($this$toPorterDuffMode_u2ds9anfk8, BlendMode.Companion.m4287getDst0nO6VwU()) == false) goto L12;
        return PorterDuff.Mode.DST;
    L12:
        if (BlendMode.m4277equalsimpl0($this$toPorterDuffMode_u2ds9anfk8, BlendMode.Companion.m4308getSrcOver0nO6VwU()) == false) goto L15;
        return PorterDuff.Mode.SRC_OVER;
    L15:
        if (BlendMode.m4277equalsimpl0($this$toPorterDuffMode_u2ds9anfk8, BlendMode.Companion.m4291getDstOver0nO6VwU()) == false) goto L18;
        return PorterDuff.Mode.DST_OVER;
    L18:
        if (BlendMode.m4277equalsimpl0($this$toPorterDuffMode_u2ds9anfk8, BlendMode.Companion.m4306getSrcIn0nO6VwU()) == false) goto L21;
        return PorterDuff.Mode.SRC_IN;
    L21:
        if (BlendMode.m4277equalsimpl0($this$toPorterDuffMode_u2ds9anfk8, BlendMode.Companion.m4289getDstIn0nO6VwU()) == false) goto L24;
        return PorterDuff.Mode.DST_IN;
    L24:
        if (BlendMode.m4277equalsimpl0($this$toPorterDuffMode_u2ds9anfk8, BlendMode.Companion.m4307getSrcOut0nO6VwU()) == false) goto L27;
        return PorterDuff.Mode.SRC_OUT;
    L27:
        if (BlendMode.m4277equalsimpl0($this$toPorterDuffMode_u2ds9anfk8, BlendMode.Companion.m4290getDstOut0nO6VwU()) == false) goto L30;
        return PorterDuff.Mode.DST_OUT;
    L30:
        if (BlendMode.m4277equalsimpl0($this$toPorterDuffMode_u2ds9anfk8, BlendMode.Companion.m4305getSrcAtop0nO6VwU()) == false) goto L33;
        return PorterDuff.Mode.SRC_ATOP;
    L33:
        if (BlendMode.m4277equalsimpl0($this$toPorterDuffMode_u2ds9anfk8, BlendMode.Companion.m4288getDstAtop0nO6VwU()) == false) goto L36;
        return PorterDuff.Mode.DST_ATOP;
    L36:
        if (BlendMode.m4277equalsimpl0($this$toPorterDuffMode_u2ds9anfk8, BlendMode.Companion.m4309getXor0nO6VwU()) == false) goto L39;
        return PorterDuff.Mode.XOR;
    L39:
        if (BlendMode.m4277equalsimpl0($this$toPorterDuffMode_u2ds9anfk8, BlendMode.Companion.m4300getPlus0nO6VwU()) == false) goto L42;
        return PorterDuff.Mode.ADD;
    L42:
        if (BlendMode.m4277equalsimpl0($this$toPorterDuffMode_u2ds9anfk8, BlendMode.Companion.m4302getScreen0nO6VwU()) == false) goto L45;
        return PorterDuff.Mode.SCREEN;
    L45:
        if (BlendMode.m4277equalsimpl0($this$toPorterDuffMode_u2ds9anfk8, BlendMode.Companion.m4299getOverlay0nO6VwU()) == false) goto L48;
        return PorterDuff.Mode.OVERLAY;
    L48:
        if (BlendMode.m4277equalsimpl0($this$toPorterDuffMode_u2ds9anfk8, BlendMode.Companion.m4285getDarken0nO6VwU()) == false) goto L51;
        return PorterDuff.Mode.DARKEN;
    L51:
        if (BlendMode.m4277equalsimpl0($this$toPorterDuffMode_u2ds9anfk8, BlendMode.Companion.m4295getLighten0nO6VwU()) == false) goto L54;
        return PorterDuff.Mode.LIGHTEN;
    L54:
        if (BlendMode.m4277equalsimpl0($this$toPorterDuffMode_u2ds9anfk8, BlendMode.Companion.m4297getModulate0nO6VwU()) == false) goto L57;
        return PorterDuff.Mode.MULTIPLY;
    L57:
        return PorterDuff.Mode.SRC_OVER;
    }

    /* JADX INFO: renamed from: toAndroidBlendMode-s9anfk8, reason: not valid java name */
    public static final android.graphics.BlendMode m4217toAndroidBlendModes9anfk8(int $this$toAndroidBlendMode_u2ds9anfk8) {
        if (BlendMode.m4277equalsimpl0($this$toAndroidBlendMode_u2ds9anfk8, BlendMode.Companion.m4281getClear0nO6VwU()) == false) goto L6;
        return android.graphics.BlendMode.CLEAR;
    L6:
        if (BlendMode.m4277equalsimpl0($this$toAndroidBlendMode_u2ds9anfk8, BlendMode.Companion.m4304getSrc0nO6VwU()) == false) goto L9;
        return android.graphics.BlendMode.SRC;
    L9:
        if (BlendMode.m4277equalsimpl0($this$toAndroidBlendMode_u2ds9anfk8, BlendMode.Companion.m4287getDst0nO6VwU()) == false) goto L12;
        return android.graphics.BlendMode.DST;
    L12:
        if (BlendMode.m4277equalsimpl0($this$toAndroidBlendMode_u2ds9anfk8, BlendMode.Companion.m4308getSrcOver0nO6VwU()) == false) goto L15;
        return android.graphics.BlendMode.SRC_OVER;
    L15:
        if (BlendMode.m4277equalsimpl0($this$toAndroidBlendMode_u2ds9anfk8, BlendMode.Companion.m4291getDstOver0nO6VwU()) == false) goto L18;
        return android.graphics.BlendMode.DST_OVER;
    L18:
        if (BlendMode.m4277equalsimpl0($this$toAndroidBlendMode_u2ds9anfk8, BlendMode.Companion.m4306getSrcIn0nO6VwU()) == false) goto L21;
        return android.graphics.BlendMode.SRC_IN;
    L21:
        if (BlendMode.m4277equalsimpl0($this$toAndroidBlendMode_u2ds9anfk8, BlendMode.Companion.m4289getDstIn0nO6VwU()) == false) goto L24;
        return android.graphics.BlendMode.DST_IN;
    L24:
        if (BlendMode.m4277equalsimpl0($this$toAndroidBlendMode_u2ds9anfk8, BlendMode.Companion.m4307getSrcOut0nO6VwU()) == false) goto L27;
        return android.graphics.BlendMode.SRC_OUT;
    L27:
        if (BlendMode.m4277equalsimpl0($this$toAndroidBlendMode_u2ds9anfk8, BlendMode.Companion.m4290getDstOut0nO6VwU()) == false) goto L30;
        return android.graphics.BlendMode.DST_OUT;
    L30:
        if (BlendMode.m4277equalsimpl0($this$toAndroidBlendMode_u2ds9anfk8, BlendMode.Companion.m4305getSrcAtop0nO6VwU()) == false) goto L33;
        return android.graphics.BlendMode.SRC_ATOP;
    L33:
        if (BlendMode.m4277equalsimpl0($this$toAndroidBlendMode_u2ds9anfk8, BlendMode.Companion.m4288getDstAtop0nO6VwU()) == false) goto L36;
        return android.graphics.BlendMode.DST_ATOP;
    L36:
        if (BlendMode.m4277equalsimpl0($this$toAndroidBlendMode_u2ds9anfk8, BlendMode.Companion.m4309getXor0nO6VwU()) == false) goto L39;
        return android.graphics.BlendMode.XOR;
    L39:
        if (BlendMode.m4277equalsimpl0($this$toAndroidBlendMode_u2ds9anfk8, BlendMode.Companion.m4300getPlus0nO6VwU()) == false) goto L42;
        return android.graphics.BlendMode.PLUS;
    L42:
        if (BlendMode.m4277equalsimpl0($this$toAndroidBlendMode_u2ds9anfk8, BlendMode.Companion.m4297getModulate0nO6VwU()) == false) goto L45;
        return android.graphics.BlendMode.MODULATE;
    L45:
        if (BlendMode.m4277equalsimpl0($this$toAndroidBlendMode_u2ds9anfk8, BlendMode.Companion.m4302getScreen0nO6VwU()) == false) goto L48;
        return android.graphics.BlendMode.SCREEN;
    L48:
        if (BlendMode.m4277equalsimpl0($this$toAndroidBlendMode_u2ds9anfk8, BlendMode.Companion.m4299getOverlay0nO6VwU()) == false) goto L51;
        return android.graphics.BlendMode.OVERLAY;
    L51:
        if (BlendMode.m4277equalsimpl0($this$toAndroidBlendMode_u2ds9anfk8, BlendMode.Companion.m4285getDarken0nO6VwU()) == false) goto L54;
        return android.graphics.BlendMode.DARKEN;
    L54:
        if (BlendMode.m4277equalsimpl0($this$toAndroidBlendMode_u2ds9anfk8, BlendMode.Companion.m4295getLighten0nO6VwU()) == false) goto L57;
        return android.graphics.BlendMode.LIGHTEN;
    L57:
        if (BlendMode.m4277equalsimpl0($this$toAndroidBlendMode_u2ds9anfk8, BlendMode.Companion.m4284getColorDodge0nO6VwU()) == false) goto L60;
        return android.graphics.BlendMode.COLOR_DODGE;
    L60:
        if (BlendMode.m4277equalsimpl0($this$toAndroidBlendMode_u2ds9anfk8, BlendMode.Companion.m4283getColorBurn0nO6VwU()) == false) goto L63;
        return android.graphics.BlendMode.COLOR_BURN;
    L63:
        if (BlendMode.m4277equalsimpl0($this$toAndroidBlendMode_u2ds9anfk8, BlendMode.Companion.m4293getHardlight0nO6VwU()) == false) goto L66;
        return android.graphics.BlendMode.HARD_LIGHT;
    L66:
        if (BlendMode.m4277equalsimpl0($this$toAndroidBlendMode_u2ds9anfk8, BlendMode.Companion.m4303getSoftlight0nO6VwU()) == false) goto L69;
        return android.graphics.BlendMode.SOFT_LIGHT;
    L69:
        if (BlendMode.m4277equalsimpl0($this$toAndroidBlendMode_u2ds9anfk8, BlendMode.Companion.m4286getDifference0nO6VwU()) == false) goto L72;
        return android.graphics.BlendMode.DIFFERENCE;
    L72:
        if (BlendMode.m4277equalsimpl0($this$toAndroidBlendMode_u2ds9anfk8, BlendMode.Companion.m4292getExclusion0nO6VwU()) == false) goto L75;
        return android.graphics.BlendMode.EXCLUSION;
    L75:
        if (BlendMode.m4277equalsimpl0($this$toAndroidBlendMode_u2ds9anfk8, BlendMode.Companion.m4298getMultiply0nO6VwU()) == false) goto L78;
        return android.graphics.BlendMode.MULTIPLY;
    L78:
        if (BlendMode.m4277equalsimpl0($this$toAndroidBlendMode_u2ds9anfk8, BlendMode.Companion.m4294getHue0nO6VwU()) == false) goto L81;
        return android.graphics.BlendMode.HUE;
    L81:
        if (BlendMode.m4277equalsimpl0($this$toAndroidBlendMode_u2ds9anfk8, BlendMode.Companion.m4301getSaturation0nO6VwU()) == false) goto L84;
        return android.graphics.BlendMode.SATURATION;
    L84:
        if (BlendMode.m4277equalsimpl0($this$toAndroidBlendMode_u2ds9anfk8, BlendMode.Companion.m4282getColor0nO6VwU()) == false) goto L87;
        return android.graphics.BlendMode.COLOR;
    L87:
        if (BlendMode.m4277equalsimpl0($this$toAndroidBlendMode_u2ds9anfk8, BlendMode.Companion.m4296getLuminosity0nO6VwU()) == false) goto L90;
        return android.graphics.BlendMode.LUMINOSITY;
    L90:
        return android.graphics.BlendMode.SRC_OVER;
    }

    public static final int toComposeBlendMode(android.graphics.BlendMode $this$toComposeBlendMode) {
        switch(WhenMappings.$EnumSwitchMapping$0[$this$toComposeBlendMode.ordinal()]) {
            case 1: goto L34;
            case 2: goto L63;
            case 3: goto L62;
            case 4: goto L61;
            case 5: goto L60;
            case 6: goto L59;
            case 7: goto L58;
            case 8: goto L57;
            case 9: goto L56;
            case 10: goto L55;
            case 11: goto L54;
            case 12: goto L53;
            case 13: goto L52;
            case 14: goto L51;
            case 15: goto L50;
            case 16: goto L49;
            case 17: goto L48;
            case 18: goto L47;
            case 19: goto L46;
            case 20: goto L45;
            case 21: goto L44;
            case 22: goto L43;
            case 23: goto L42;
            case 24: goto L41;
            case 25: goto L40;
            case 26: goto L39;
            case 27: goto L38;
            case 28: goto L37;
            case 29: goto L36;
            default: goto L35;
        };
    L35:
        return BlendMode.Companion.m4308getSrcOver0nO6VwU();
    L36:
        return BlendMode.Companion.m4296getLuminosity0nO6VwU();
    L37:
        return BlendMode.Companion.m4282getColor0nO6VwU();
    L38:
        return BlendMode.Companion.m4301getSaturation0nO6VwU();
    L39:
        return BlendMode.Companion.m4294getHue0nO6VwU();
    L40:
        return BlendMode.Companion.m4298getMultiply0nO6VwU();
    L41:
        return BlendMode.Companion.m4292getExclusion0nO6VwU();
    L42:
        return BlendMode.Companion.m4286getDifference0nO6VwU();
    L43:
        return BlendMode.Companion.m4303getSoftlight0nO6VwU();
    L44:
        return BlendMode.Companion.m4293getHardlight0nO6VwU();
    L45:
        return BlendMode.Companion.m4283getColorBurn0nO6VwU();
    L46:
        return BlendMode.Companion.m4284getColorDodge0nO6VwU();
    L47:
        return BlendMode.Companion.m4295getLighten0nO6VwU();
    L48:
        return BlendMode.Companion.m4285getDarken0nO6VwU();
    L49:
        return BlendMode.Companion.m4299getOverlay0nO6VwU();
    L50:
        return BlendMode.Companion.m4302getScreen0nO6VwU();
    L51:
        return BlendMode.Companion.m4297getModulate0nO6VwU();
    L52:
        return BlendMode.Companion.m4300getPlus0nO6VwU();
    L53:
        return BlendMode.Companion.m4309getXor0nO6VwU();
    L54:
        return BlendMode.Companion.m4288getDstAtop0nO6VwU();
    L55:
        return BlendMode.Companion.m4305getSrcAtop0nO6VwU();
    L56:
        return BlendMode.Companion.m4290getDstOut0nO6VwU();
    L57:
        return BlendMode.Companion.m4307getSrcOut0nO6VwU();
    L58:
        return BlendMode.Companion.m4289getDstIn0nO6VwU();
    L59:
        return BlendMode.Companion.m4306getSrcIn0nO6VwU();
    L60:
        return BlendMode.Companion.m4291getDstOver0nO6VwU();
    L61:
        return BlendMode.Companion.m4308getSrcOver0nO6VwU();
    L62:
        return BlendMode.Companion.m4287getDst0nO6VwU();
    L63:
        return BlendMode.Companion.m4304getSrc0nO6VwU();
    L34:
        return BlendMode.Companion.m4281getClear0nO6VwU();
    }
}
