package androidx.compose.ui.graphics;

import androidx.compose.ui.geometry.Offset;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: Shadow.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0007\u0018\u0000 \u001d2\u00020\u0001:\u0001\u001dB#\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ.\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0015J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u0019\u001a\u00020\u001aH\u0016J\b\u0010\u001b\u001a\u00020\u001cH\u0016R\u001c\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR$\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0010\n\u0002\u0010\u0010\u0012\u0004\b\r\u0010\n\u001a\u0004\b\u000e\u0010\u000fR$\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0010\n\u0002\u0010\u0010\u0012\u0004\b\u0011\u0010\n\u001a\u0004\b\u0012\u0010\u000f\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u001e"}, d2 = {"Landroidx/compose/ui/graphics/Shadow;", "", "color", "Landroidx/compose/ui/graphics/Color;", "offset", "Landroidx/compose/ui/geometry/Offset;", "blurRadius", "", "(JJFLkotlin/jvm/internal/DefaultConstructorMarker;)V", "getBlurRadius$annotations", "()V", "getBlurRadius", "()F", "getColor-0d7_KjU$annotations", "getColor-0d7_KjU", "()J", "J", "getOffset-F1C5BW0$annotations", "getOffset-F1C5BW0", "copy", "copy-qcb84PM", "(JJF)Landroidx/compose/ui/graphics/Shadow;", "equals", "", "other", "hashCode", "", "toString", "", "Companion", "ui-graphics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class Shadow {
    public static final Companion Companion = null;
    private static final Shadow None = null;
    private final float blurRadius;
    private final long color;
    private final long offset;

    /* JADX INFO: compiled from: Shadow.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0005\u0010\u0002\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Landroidx/compose/ui/graphics/Shadow$Companion;", "", "()V", "None", "Landroidx/compose/ui/graphics/Shadow;", "getNone$annotations", "getNone", "()Landroidx/compose/ui/graphics/Shadow;", "ui-graphics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker r1) {
            this();
        }

        public static /* synthetic */ void getNone$annotations() {
        }

        private Companion() {
        }

        public final Shadow getNone() {
            return Shadow.access$getNone$cp();
        }
    }

    public /* synthetic */ Shadow(long r1, long r3, float r5, DefaultConstructorMarker r6) {
        this(r1, r3, r5);
    }

    public static /* synthetic */ void getBlurRadius$annotations() {
    }

    /* JADX INFO: renamed from: getColor-0d7_KjU$annotations, reason: not valid java name */
    public static /* synthetic */ void m4688getColor0d7_KjU$annotations() {
    }

    /* JADX INFO: renamed from: getOffset-F1C5BW0$annotations, reason: not valid java name */
    public static /* synthetic */ void m4689getOffsetF1C5BW0$annotations() {
    }

    private Shadow(long color, long offset, float blurRadius) {
        this.color = color;
        this.offset = offset;
        this.blurRadius = blurRadius;
    }

    public static final /* synthetic */ Shadow access$getNone$cp() {
        return None;
    }

    public /* synthetic */ Shadow(long r8, long r10, float r12, int r13, DefaultConstructorMarker r14) {
        if ((r13 & 1) == 0) goto L5;
        long r1 = ColorKt.Color(4278190080L);
    L7:
        if ((r13 & 2) == 0) goto L9;
        long r3 = Offset.Companion.m4141getZeroF1C5BW0();
    L11:
        if ((r13 & 4) == 0) goto L13;
        float r5 = 0.0f;
    L14:
        this(r1, r3, r5, null);
        return;
    L13:
        r5 = r12;
        goto L14
    L9:
        r3 = r10;
        goto L11
    L5:
        r1 = r8;
        goto L7
    }

    /* JADX INFO: renamed from: getColor-0d7_KjU, reason: not valid java name */
    public final long m4691getColor0d7_KjU() {
        return this.color;
    }

    /* JADX INFO: renamed from: getOffset-F1C5BW0, reason: not valid java name */
    public final long m4692getOffsetF1C5BW0() {
        return this.offset;
    }

    public final float getBlurRadius() {
        return this.blurRadius;
    }

    static {
        Companion = new Companion(null);
        long r3 = 0;
        long r5 = 0;
        float r7 = 0.0f;
        None = new Shadow(r3, r5, r7, 7, null);
    }

    public boolean equals(Object other) {
        if (this != other) goto L6;
        return true;
    L6:
        if ((other instanceof Shadow) == true) goto L9;
        return false;
    L9:
        if (Color.m4367equalsimpl0(this.color, ((Shadow) other).color) == true) goto L12;
        return false;
    L12:
        if (Offset.m4122equalsimpl0(this.offset, ((Shadow) other).offset) == true) goto L15;
        return false;
    L15:
        if (this.blurRadius != ((Shadow) other).blurRadius) goto L17;
        boolean r1 = true;
    L18:
        if (r1 == true) goto L20;
        return false;
    L20:
        return true;
    L17:
        r1 = false;
        goto L18
    }

    public int hashCode() {
        int result = Color.m4373hashCodeimpl(this.color);
        int result2 = (result * 31) + Offset.m4127hashCodeimpl(this.offset);
        return (result2 * 31) + Float.hashCode(this.blurRadius);
    }

    public String toString() {
        return "Shadow(color=" + Color.m4374toStringimpl(this.color) + ", offset=" + Offset.m4133toStringimpl(this.offset) + ", blurRadius=" + this.blurRadius + ')';
    }

    /* JADX INFO: renamed from: copy-qcb84PM$default, reason: not valid java name */
    public static /* synthetic */ Shadow m4687copyqcb84PM$default(Shadow r6, long r7, long r9, float r11, int r12, Object r13) {
        if ((r12 & 1) == 0) goto L5;
        long r1 = r6.color;
    L7:
        if ((r12 & 2) == 0) goto L9;
        long r3 = r6.offset;
    L11:
        if ((r12 & 4) == 0) goto L13;
        float r5 = r6.blurRadius;
    L15:
        return r6.m4690copyqcb84PM(r1, r3, r5);
    L13:
        r5 = r11;
        goto L15
    L9:
        r3 = r9;
        goto L11
    L5:
        r1 = r7;
        goto L7
    }

    /* JADX INFO: renamed from: copy-qcb84PM, reason: not valid java name */
    public final Shadow m4690copyqcb84PM(long color, long offset, float blurRadius) {
        return new Shadow(color, offset, blurRadius, null);
    }
}
