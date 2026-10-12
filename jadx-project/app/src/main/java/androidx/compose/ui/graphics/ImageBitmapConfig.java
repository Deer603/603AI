package androidx.compose.ui.graphics;

import kotlin.Metadata;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: ImageBitmap.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087@\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B\u0011\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u0005J\u000f\u0010\u000f\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u0088\u0001\u0002¨\u0006\u0014"}, d2 = {"Landroidx/compose/ui/graphics/ImageBitmapConfig;", "", "value", "", "constructor-impl", "(I)I", "getValue", "()I", "equals", "", "other", "equals-impl", "(ILjava/lang/Object;)Z", "hashCode", "hashCode-impl", "toString", "", "toString-impl", "(I)Ljava/lang/String;", "Companion", "ui-graphics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@JvmInline
public final class ImageBitmapConfig {
    private static final int Alpha8 = 0;
    private static final int Argb8888 = 0;
    public static final Companion Companion = null;
    private static final int F16 = 0;
    private static final int Gpu = 0;
    private static final int Rgb565 = 0;
    private final int value;

    /* JADX INFO: compiled from: ImageBitmap.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0019\u0010\u0003\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0005\u0010\u0006R\u0019\u0010\b\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\t\u0010\u0006R\u0019\u0010\n\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u000b\u0010\u0006R\u0019\u0010\f\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\r\u0010\u0006R\u0019\u0010\u000e\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u000f\u0010\u0006\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0010"}, d2 = {"Landroidx/compose/ui/graphics/ImageBitmapConfig$Companion;", "", "()V", "Alpha8", "Landroidx/compose/ui/graphics/ImageBitmapConfig;", "getAlpha8-_sVssgQ", "()I", "I", "Argb8888", "getArgb8888-_sVssgQ", "F16", "getF16-_sVssgQ", "Gpu", "getGpu-_sVssgQ", "Rgb565", "getRgb565-_sVssgQ", "ui-graphics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker r1) {
            this();
        }

        private Companion() {
        }

        /* JADX INFO: renamed from: getArgb8888-_sVssgQ, reason: not valid java name */
        public final int m4586getArgb8888_sVssgQ() {
            return ImageBitmapConfig.access$getArgb8888$cp();
        }

        /* JADX INFO: renamed from: getAlpha8-_sVssgQ, reason: not valid java name */
        public final int m4585getAlpha8_sVssgQ() {
            return ImageBitmapConfig.access$getAlpha8$cp();
        }

        /* JADX INFO: renamed from: getRgb565-_sVssgQ, reason: not valid java name */
        public final int m4589getRgb565_sVssgQ() {
            return ImageBitmapConfig.access$getRgb565$cp();
        }

        /* JADX INFO: renamed from: getF16-_sVssgQ, reason: not valid java name */
        public final int m4587getF16_sVssgQ() {
            return ImageBitmapConfig.access$getF16$cp();
        }

        /* JADX INFO: renamed from: getGpu-_sVssgQ, reason: not valid java name */
        public final int m4588getGpu_sVssgQ() {
            return ImageBitmapConfig.access$getGpu$cp();
        }
    }

    /* JADX INFO: renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ ImageBitmapConfig m4578boximpl(int r1) {
        return new ImageBitmapConfig(r1);
    }

    /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
    public static int m4579constructorimpl(int r0) {
        return r0;
    }

    /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
    public static boolean m4580equalsimpl(int r2, Object r3) {
        if ((r3 instanceof ImageBitmapConfig) == true) goto L6;
        return false;
    L6:
        if (r2 == ((ImageBitmapConfig) r3).m4584unboximpl()) goto L8;
        return false;
    L8:
        return true;
    }

    /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m4581equalsimpl0(int r1, int r2) {
        if (r1 != r2) goto L4;
        return true;
    L4:
        return false;
    }

    /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
    public static int m4582hashCodeimpl(int r1) {
        return Integer.hashCode(r1);
    }

    public boolean equals(Object r2) {
        return m4580equalsimpl(this.value, r2);
    }

    public int hashCode() {
        return m4582hashCodeimpl(this.value);
    }

    /* JADX INFO: renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m4584unboximpl() {
        return this.value;
    }

    public static final /* synthetic */ int access$getAlpha8$cp() {
        return Alpha8;
    }

    public static final /* synthetic */ int access$getArgb8888$cp() {
        return Argb8888;
    }

    public static final /* synthetic */ int access$getF16$cp() {
        return F16;
    }

    public static final /* synthetic */ int access$getGpu$cp() {
        return Gpu;
    }

    public static final /* synthetic */ int access$getRgb565$cp() {
        return Rgb565;
    }

    private /* synthetic */ ImageBitmapConfig(int value) {
        this.value = value;
    }

    public final int getValue() {
        return this.value;
    }

    static {
        Companion = new Companion(null);
        Argb8888 = m4579constructorimpl(0);
        Alpha8 = m4579constructorimpl(1);
        Rgb565 = m4579constructorimpl(2);
        F16 = m4579constructorimpl(3);
        Gpu = m4579constructorimpl(4);
    }

    public String toString() {
        return m4583toStringimpl(this.value);
    }

    /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
    public static String m4583toStringimpl(int arg0) {
        if (m4581equalsimpl0(arg0, Argb8888) == false) goto L6;
        return "Argb8888";
    L6:
        if (m4581equalsimpl0(arg0, Alpha8) == false) goto L9;
        return "Alpha8";
    L9:
        if (m4581equalsimpl0(arg0, Rgb565) == false) goto L12;
        return "Rgb565";
    L12:
        if (m4581equalsimpl0(arg0, F16) == false) goto L15;
        return "F16";
    L15:
        if (m4581equalsimpl0(arg0, Gpu) == false) goto L17;
        return "Gpu";
    L17:
        return "Unknown";
    }
}
