package androidx.compose.ui.graphics;

import kotlin.Metadata;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: BlendMode.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087@\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B\u0011\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\f\u0010\u0005J\u000f\u0010\r\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000\u0088\u0001\u0002\u0092\u0001\u00020\u0003¨\u0006\u0012"}, d2 = {"Landroidx/compose/ui/graphics/BlendMode;", "", "value", "", "constructor-impl", "(I)I", "equals", "", "other", "equals-impl", "(ILjava/lang/Object;)Z", "hashCode", "hashCode-impl", "toString", "", "toString-impl", "(I)Ljava/lang/String;", "Companion", "ui-graphics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@JvmInline
public final class BlendMode {
    private static final int Clear = 0;
    private static final int Color = 0;
    private static final int ColorBurn = 0;
    private static final int ColorDodge = 0;
    public static final Companion Companion = null;
    private static final int Darken = 0;
    private static final int Difference = 0;
    private static final int Dst = 0;
    private static final int DstAtop = 0;
    private static final int DstIn = 0;
    private static final int DstOut = 0;
    private static final int DstOver = 0;
    private static final int Exclusion = 0;
    private static final int Hardlight = 0;
    private static final int Hue = 0;
    private static final int Lighten = 0;
    private static final int Luminosity = 0;
    private static final int Modulate = 0;
    private static final int Multiply = 0;
    private static final int Overlay = 0;
    private static final int Plus = 0;
    private static final int Saturation = 0;
    private static final int Screen = 0;
    private static final int Softlight = 0;
    private static final int Src = 0;
    private static final int SrcAtop = 0;
    private static final int SrcIn = 0;
    private static final int SrcOut = 0;
    private static final int SrcOver = 0;
    private static final int Xor = 0;
    private final int value;

    /* JADX INFO: compiled from: BlendMode.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b<\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0019\u0010\u0003\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0005\u0010\u0006R\u0019\u0010\b\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\t\u0010\u0006R\u0019\u0010\n\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u000b\u0010\u0006R\u0019\u0010\f\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\r\u0010\u0006R\u0019\u0010\u000e\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u000f\u0010\u0006R\u0019\u0010\u0010\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0011\u0010\u0006R\u0019\u0010\u0012\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0013\u0010\u0006R\u0019\u0010\u0014\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0015\u0010\u0006R\u0019\u0010\u0016\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0017\u0010\u0006R\u0019\u0010\u0018\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0019\u0010\u0006R\u0019\u0010\u001a\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u001b\u0010\u0006R\u0019\u0010\u001c\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u001d\u0010\u0006R\u0019\u0010\u001e\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u001f\u0010\u0006R\u0019\u0010 \u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b!\u0010\u0006R\u0019\u0010\"\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b#\u0010\u0006R\u0019\u0010$\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b%\u0010\u0006R\u0019\u0010&\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b'\u0010\u0006R\u0019\u0010(\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b)\u0010\u0006R\u0019\u0010*\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b+\u0010\u0006R\u0019\u0010,\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b-\u0010\u0006R\u0019\u0010.\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b/\u0010\u0006R\u0019\u00100\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b1\u0010\u0006R\u0019\u00102\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b3\u0010\u0006R\u0019\u00104\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b5\u0010\u0006R\u0019\u00106\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b7\u0010\u0006R\u0019\u00108\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b9\u0010\u0006R\u0019\u0010:\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b;\u0010\u0006R\u0019\u0010<\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b=\u0010\u0006R\u0019\u0010>\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b?\u0010\u0006\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006@"}, d2 = {"Landroidx/compose/ui/graphics/BlendMode$Companion;", "", "()V", "Clear", "Landroidx/compose/ui/graphics/BlendMode;", "getClear-0nO6VwU", "()I", "I", "Color", "getColor-0nO6VwU", "ColorBurn", "getColorBurn-0nO6VwU", "ColorDodge", "getColorDodge-0nO6VwU", "Darken", "getDarken-0nO6VwU", "Difference", "getDifference-0nO6VwU", "Dst", "getDst-0nO6VwU", "DstAtop", "getDstAtop-0nO6VwU", "DstIn", "getDstIn-0nO6VwU", "DstOut", "getDstOut-0nO6VwU", "DstOver", "getDstOver-0nO6VwU", "Exclusion", "getExclusion-0nO6VwU", "Hardlight", "getHardlight-0nO6VwU", "Hue", "getHue-0nO6VwU", "Lighten", "getLighten-0nO6VwU", "Luminosity", "getLuminosity-0nO6VwU", "Modulate", "getModulate-0nO6VwU", "Multiply", "getMultiply-0nO6VwU", "Overlay", "getOverlay-0nO6VwU", "Plus", "getPlus-0nO6VwU", "Saturation", "getSaturation-0nO6VwU", "Screen", "getScreen-0nO6VwU", "Softlight", "getSoftlight-0nO6VwU", "Src", "getSrc-0nO6VwU", "SrcAtop", "getSrcAtop-0nO6VwU", "SrcIn", "getSrcIn-0nO6VwU", "SrcOut", "getSrcOut-0nO6VwU", "SrcOver", "getSrcOver-0nO6VwU", "Xor", "getXor-0nO6VwU", "ui-graphics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker r1) {
            this();
        }

        private Companion() {
        }

        /* JADX INFO: renamed from: getClear-0nO6VwU, reason: not valid java name */
        public final int m4281getClear0nO6VwU() {
            return BlendMode.access$getClear$cp();
        }

        /* JADX INFO: renamed from: getSrc-0nO6VwU, reason: not valid java name */
        public final int m4304getSrc0nO6VwU() {
            return BlendMode.access$getSrc$cp();
        }

        /* JADX INFO: renamed from: getDst-0nO6VwU, reason: not valid java name */
        public final int m4287getDst0nO6VwU() {
            return BlendMode.access$getDst$cp();
        }

        /* JADX INFO: renamed from: getSrcOver-0nO6VwU, reason: not valid java name */
        public final int m4308getSrcOver0nO6VwU() {
            return BlendMode.access$getSrcOver$cp();
        }

        /* JADX INFO: renamed from: getDstOver-0nO6VwU, reason: not valid java name */
        public final int m4291getDstOver0nO6VwU() {
            return BlendMode.access$getDstOver$cp();
        }

        /* JADX INFO: renamed from: getSrcIn-0nO6VwU, reason: not valid java name */
        public final int m4306getSrcIn0nO6VwU() {
            return BlendMode.access$getSrcIn$cp();
        }

        /* JADX INFO: renamed from: getDstIn-0nO6VwU, reason: not valid java name */
        public final int m4289getDstIn0nO6VwU() {
            return BlendMode.access$getDstIn$cp();
        }

        /* JADX INFO: renamed from: getSrcOut-0nO6VwU, reason: not valid java name */
        public final int m4307getSrcOut0nO6VwU() {
            return BlendMode.access$getSrcOut$cp();
        }

        /* JADX INFO: renamed from: getDstOut-0nO6VwU, reason: not valid java name */
        public final int m4290getDstOut0nO6VwU() {
            return BlendMode.access$getDstOut$cp();
        }

        /* JADX INFO: renamed from: getSrcAtop-0nO6VwU, reason: not valid java name */
        public final int m4305getSrcAtop0nO6VwU() {
            return BlendMode.access$getSrcAtop$cp();
        }

        /* JADX INFO: renamed from: getDstAtop-0nO6VwU, reason: not valid java name */
        public final int m4288getDstAtop0nO6VwU() {
            return BlendMode.access$getDstAtop$cp();
        }

        /* JADX INFO: renamed from: getXor-0nO6VwU, reason: not valid java name */
        public final int m4309getXor0nO6VwU() {
            return BlendMode.access$getXor$cp();
        }

        /* JADX INFO: renamed from: getPlus-0nO6VwU, reason: not valid java name */
        public final int m4300getPlus0nO6VwU() {
            return BlendMode.access$getPlus$cp();
        }

        /* JADX INFO: renamed from: getModulate-0nO6VwU, reason: not valid java name */
        public final int m4297getModulate0nO6VwU() {
            return BlendMode.access$getModulate$cp();
        }

        /* JADX INFO: renamed from: getScreen-0nO6VwU, reason: not valid java name */
        public final int m4302getScreen0nO6VwU() {
            return BlendMode.access$getScreen$cp();
        }

        /* JADX INFO: renamed from: getOverlay-0nO6VwU, reason: not valid java name */
        public final int m4299getOverlay0nO6VwU() {
            return BlendMode.access$getOverlay$cp();
        }

        /* JADX INFO: renamed from: getDarken-0nO6VwU, reason: not valid java name */
        public final int m4285getDarken0nO6VwU() {
            return BlendMode.access$getDarken$cp();
        }

        /* JADX INFO: renamed from: getLighten-0nO6VwU, reason: not valid java name */
        public final int m4295getLighten0nO6VwU() {
            return BlendMode.access$getLighten$cp();
        }

        /* JADX INFO: renamed from: getColorDodge-0nO6VwU, reason: not valid java name */
        public final int m4284getColorDodge0nO6VwU() {
            return BlendMode.access$getColorDodge$cp();
        }

        /* JADX INFO: renamed from: getColorBurn-0nO6VwU, reason: not valid java name */
        public final int m4283getColorBurn0nO6VwU() {
            return BlendMode.access$getColorBurn$cp();
        }

        /* JADX INFO: renamed from: getHardlight-0nO6VwU, reason: not valid java name */
        public final int m4293getHardlight0nO6VwU() {
            return BlendMode.access$getHardlight$cp();
        }

        /* JADX INFO: renamed from: getSoftlight-0nO6VwU, reason: not valid java name */
        public final int m4303getSoftlight0nO6VwU() {
            return BlendMode.access$getSoftlight$cp();
        }

        /* JADX INFO: renamed from: getDifference-0nO6VwU, reason: not valid java name */
        public final int m4286getDifference0nO6VwU() {
            return BlendMode.access$getDifference$cp();
        }

        /* JADX INFO: renamed from: getExclusion-0nO6VwU, reason: not valid java name */
        public final int m4292getExclusion0nO6VwU() {
            return BlendMode.access$getExclusion$cp();
        }

        /* JADX INFO: renamed from: getMultiply-0nO6VwU, reason: not valid java name */
        public final int m4298getMultiply0nO6VwU() {
            return BlendMode.access$getMultiply$cp();
        }

        /* JADX INFO: renamed from: getHue-0nO6VwU, reason: not valid java name */
        public final int m4294getHue0nO6VwU() {
            return BlendMode.access$getHue$cp();
        }

        /* JADX INFO: renamed from: getSaturation-0nO6VwU, reason: not valid java name */
        public final int m4301getSaturation0nO6VwU() {
            return BlendMode.access$getSaturation$cp();
        }

        /* JADX INFO: renamed from: getColor-0nO6VwU, reason: not valid java name */
        public final int m4282getColor0nO6VwU() {
            return BlendMode.access$getColor$cp();
        }

        /* JADX INFO: renamed from: getLuminosity-0nO6VwU, reason: not valid java name */
        public final int m4296getLuminosity0nO6VwU() {
            return BlendMode.access$getLuminosity$cp();
        }
    }

    /* JADX INFO: renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ BlendMode m4274boximpl(int r1) {
        return new BlendMode(r1);
    }

    /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
    public static int m4275constructorimpl(int r0) {
        return r0;
    }

    /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
    public static boolean m4276equalsimpl(int r2, Object r3) {
        if ((r3 instanceof BlendMode) == true) goto L6;
        return false;
    L6:
        if (r2 == ((BlendMode) r3).m4280unboximpl()) goto L8;
        return false;
    L8:
        return true;
    }

    /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m4277equalsimpl0(int r1, int r2) {
        if (r1 != r2) goto L4;
        return true;
    L4:
        return false;
    }

    /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
    public static int m4278hashCodeimpl(int r1) {
        return Integer.hashCode(r1);
    }

    public boolean equals(Object r2) {
        return m4276equalsimpl(this.value, r2);
    }

    public int hashCode() {
        return m4278hashCodeimpl(this.value);
    }

    /* JADX INFO: renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m4280unboximpl() {
        return this.value;
    }

    public static final /* synthetic */ int access$getClear$cp() {
        return Clear;
    }

    public static final /* synthetic */ int access$getColor$cp() {
        return Color;
    }

    public static final /* synthetic */ int access$getColorBurn$cp() {
        return ColorBurn;
    }

    public static final /* synthetic */ int access$getColorDodge$cp() {
        return ColorDodge;
    }

    public static final /* synthetic */ int access$getDarken$cp() {
        return Darken;
    }

    public static final /* synthetic */ int access$getDifference$cp() {
        return Difference;
    }

    public static final /* synthetic */ int access$getDst$cp() {
        return Dst;
    }

    public static final /* synthetic */ int access$getDstAtop$cp() {
        return DstAtop;
    }

    public static final /* synthetic */ int access$getDstIn$cp() {
        return DstIn;
    }

    public static final /* synthetic */ int access$getDstOut$cp() {
        return DstOut;
    }

    public static final /* synthetic */ int access$getDstOver$cp() {
        return DstOver;
    }

    public static final /* synthetic */ int access$getExclusion$cp() {
        return Exclusion;
    }

    public static final /* synthetic */ int access$getHardlight$cp() {
        return Hardlight;
    }

    public static final /* synthetic */ int access$getHue$cp() {
        return Hue;
    }

    public static final /* synthetic */ int access$getLighten$cp() {
        return Lighten;
    }

    public static final /* synthetic */ int access$getLuminosity$cp() {
        return Luminosity;
    }

    public static final /* synthetic */ int access$getModulate$cp() {
        return Modulate;
    }

    public static final /* synthetic */ int access$getMultiply$cp() {
        return Multiply;
    }

    public static final /* synthetic */ int access$getOverlay$cp() {
        return Overlay;
    }

    public static final /* synthetic */ int access$getPlus$cp() {
        return Plus;
    }

    public static final /* synthetic */ int access$getSaturation$cp() {
        return Saturation;
    }

    public static final /* synthetic */ int access$getScreen$cp() {
        return Screen;
    }

    public static final /* synthetic */ int access$getSoftlight$cp() {
        return Softlight;
    }

    public static final /* synthetic */ int access$getSrc$cp() {
        return Src;
    }

    public static final /* synthetic */ int access$getSrcAtop$cp() {
        return SrcAtop;
    }

    public static final /* synthetic */ int access$getSrcIn$cp() {
        return SrcIn;
    }

    public static final /* synthetic */ int access$getSrcOut$cp() {
        return SrcOut;
    }

    public static final /* synthetic */ int access$getSrcOver$cp() {
        return SrcOver;
    }

    public static final /* synthetic */ int access$getXor$cp() {
        return Xor;
    }

    private /* synthetic */ BlendMode(int value) {
        this.value = value;
    }

    static {
        Companion = new Companion(null);
        Clear = m4275constructorimpl(0);
        Src = m4275constructorimpl(1);
        Dst = m4275constructorimpl(2);
        SrcOver = m4275constructorimpl(3);
        DstOver = m4275constructorimpl(4);
        SrcIn = m4275constructorimpl(5);
        DstIn = m4275constructorimpl(6);
        SrcOut = m4275constructorimpl(7);
        DstOut = m4275constructorimpl(8);
        SrcAtop = m4275constructorimpl(9);
        DstAtop = m4275constructorimpl(10);
        Xor = m4275constructorimpl(11);
        Plus = m4275constructorimpl(12);
        Modulate = m4275constructorimpl(13);
        Screen = m4275constructorimpl(14);
        Overlay = m4275constructorimpl(15);
        Darken = m4275constructorimpl(16);
        Lighten = m4275constructorimpl(17);
        ColorDodge = m4275constructorimpl(18);
        ColorBurn = m4275constructorimpl(19);
        Hardlight = m4275constructorimpl(20);
        Softlight = m4275constructorimpl(21);
        Difference = m4275constructorimpl(22);
        Exclusion = m4275constructorimpl(23);
        Multiply = m4275constructorimpl(24);
        Hue = m4275constructorimpl(25);
        Saturation = m4275constructorimpl(26);
        Color = m4275constructorimpl(27);
        Luminosity = m4275constructorimpl(28);
    }

    public String toString() {
        return m4279toStringimpl(this.value);
    }

    /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
    public static String m4279toStringimpl(int arg0) {
        if (m4277equalsimpl0(arg0, Clear) == false) goto L6;
        return "Clear";
    L6:
        if (m4277equalsimpl0(arg0, Src) == false) goto L9;
        return "Src";
    L9:
        if (m4277equalsimpl0(arg0, Dst) == false) goto L12;
        return "Dst";
    L12:
        if (m4277equalsimpl0(arg0, SrcOver) == false) goto L15;
        return "SrcOver";
    L15:
        if (m4277equalsimpl0(arg0, DstOver) == false) goto L18;
        return "DstOver";
    L18:
        if (m4277equalsimpl0(arg0, SrcIn) == false) goto L21;
        return "SrcIn";
    L21:
        if (m4277equalsimpl0(arg0, DstIn) == false) goto L24;
        return "DstIn";
    L24:
        if (m4277equalsimpl0(arg0, SrcOut) == false) goto L27;
        return "SrcOut";
    L27:
        if (m4277equalsimpl0(arg0, DstOut) == false) goto L30;
        return "DstOut";
    L30:
        if (m4277equalsimpl0(arg0, SrcAtop) == false) goto L33;
        return "SrcAtop";
    L33:
        if (m4277equalsimpl0(arg0, DstAtop) == false) goto L36;
        return "DstAtop";
    L36:
        if (m4277equalsimpl0(arg0, Xor) == false) goto L39;
        return "Xor";
    L39:
        if (m4277equalsimpl0(arg0, Plus) == false) goto L42;
        return "Plus";
    L42:
        if (m4277equalsimpl0(arg0, Modulate) == false) goto L45;
        return "Modulate";
    L45:
        if (m4277equalsimpl0(arg0, Screen) == false) goto L48;
        return "Screen";
    L48:
        if (m4277equalsimpl0(arg0, Overlay) == false) goto L51;
        return "Overlay";
    L51:
        if (m4277equalsimpl0(arg0, Darken) == false) goto L54;
        return "Darken";
    L54:
        if (m4277equalsimpl0(arg0, Lighten) == false) goto L57;
        return "Lighten";
    L57:
        if (m4277equalsimpl0(arg0, ColorDodge) == false) goto L60;
        return "ColorDodge";
    L60:
        if (m4277equalsimpl0(arg0, ColorBurn) == false) goto L63;
        return "ColorBurn";
    L63:
        if (m4277equalsimpl0(arg0, Hardlight) == false) goto L66;
        return "HardLight";
    L66:
        if (m4277equalsimpl0(arg0, Softlight) == false) goto L69;
        return "Softlight";
    L69:
        if (m4277equalsimpl0(arg0, Difference) == false) goto L72;
        return "Difference";
    L72:
        if (m4277equalsimpl0(arg0, Exclusion) == false) goto L75;
        return "Exclusion";
    L75:
        if (m4277equalsimpl0(arg0, Multiply) == false) goto L78;
        return "Multiply";
    L78:
        if (m4277equalsimpl0(arg0, Hue) == false) goto L81;
        return "Hue";
    L81:
        if (m4277equalsimpl0(arg0, Saturation) == false) goto L84;
        return "Saturation";
    L84:
        if (m4277equalsimpl0(arg0, Color) == false) goto L87;
        return "Color";
    L87:
        if (m4277equalsimpl0(arg0, Luminosity) == false) goto L89;
        return "Luminosity";
    L89:
        return "Unknown";
    }
}
