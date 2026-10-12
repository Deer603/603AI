package androidx.compose.ui.graphics.drawscope;

import androidx.compose.ui.graphics.PathEffect;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: DrawScope.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u0000 \u001d2\u00020\u0001:\u0001\u001dB9\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0002\u0010\u000bJ\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0096\u0002J\b\u0010\u0019\u001a\u00020\u001aH\u0016J\b\u0010\u001b\u001a\u00020\u001cH\u0016R\u0019\u0010\u0005\u001a\u00020\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\f\u0010\rR\u0019\u0010\u0007\u001a\u00020\bø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\u000f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0011\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u001e"}, d2 = {"Landroidx/compose/ui/graphics/drawscope/Stroke;", "Landroidx/compose/ui/graphics/drawscope/DrawStyle;", "width", "", "miter", "cap", "Landroidx/compose/ui/graphics/StrokeCap;", "join", "Landroidx/compose/ui/graphics/StrokeJoin;", "pathEffect", "Landroidx/compose/ui/graphics/PathEffect;", "(FFIILandroidx/compose/ui/graphics/PathEffect;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "getCap-KaPHkGw", "()I", "I", "getJoin-LxFBmk8", "getMiter", "()F", "getPathEffect", "()Landroidx/compose/ui/graphics/PathEffect;", "getWidth", "equals", "", "other", "", "hashCode", "", "toString", "", "Companion", "ui-graphics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class Stroke extends DrawStyle {
    public static final Companion Companion = null;
    private static final int DefaultCap = 0;
    private static final int DefaultJoin = 0;
    public static final float DefaultMiter = 4.0f;
    public static final float HairlineWidth = 0.0f;
    private final int cap;
    private final int join;
    private final float miter;
    private final PathEffect pathEffect;
    private final float width;

    /* JADX INFO: compiled from: DrawScope.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0019\u0010\u0003\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0005\u0010\u0006R\u0019\u0010\b\u001a\u00020\tø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\n\u0010\u0006R\u000e\u0010\u000b\u001a\u00020\fX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\fX\u0086T¢\u0006\u0002\n\u0000\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u000e"}, d2 = {"Landroidx/compose/ui/graphics/drawscope/Stroke$Companion;", "", "()V", "DefaultCap", "Landroidx/compose/ui/graphics/StrokeCap;", "getDefaultCap-KaPHkGw", "()I", "I", "DefaultJoin", "Landroidx/compose/ui/graphics/StrokeJoin;", "getDefaultJoin-LxFBmk8", "DefaultMiter", "", "HairlineWidth", "ui-graphics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker r1) {
            this();
        }

        private Companion() {
        }

        /* JADX INFO: renamed from: getDefaultCap-KaPHkGw, reason: not valid java name */
        public final int m4988getDefaultCapKaPHkGw() {
            return Stroke.access$getDefaultCap$cp();
        }

        /* JADX INFO: renamed from: getDefaultJoin-LxFBmk8, reason: not valid java name */
        public final int m4989getDefaultJoinLxFBmk8() {
            return Stroke.access$getDefaultJoin$cp();
        }
    }

    public /* synthetic */ Stroke(float r1, float r2, int r3, int r4, PathEffect r5, DefaultConstructorMarker r6) {
        this(r1, r2, r3, r4, r5);
    }

    public /* synthetic */ Stroke(float r8, float r9, int r10, int r11, PathEffect r12, int r13, DefaultConstructorMarker r14) {
        if ((r13 & 1) == 0) goto L5;
        float r1 = 0.0f;
    L7:
        if ((r13 & 2) == 0) goto L9;
        float r2 = 4.0f;
    L11:
        if ((r13 & 4) == 0) goto L13;
        int r3 = DefaultCap;
    L15:
        if ((r13 & 8) == 0) goto L17;
        int r4 = DefaultJoin;
    L19:
        if ((r13 & 16) == 0) goto L21;
        PathEffect r5 = null;
    L22:
        this(r1, r2, r3, r4, r5, null);
        return;
    L21:
        r5 = r12;
        goto L22
    L17:
        r4 = r11;
        goto L19
    L13:
        r3 = r10;
        goto L15
    L9:
        r2 = r9;
        goto L11
    L5:
        r1 = r8;
        goto L7
    }

    public static final /* synthetic */ int access$getDefaultCap$cp() {
        return DefaultCap;
    }

    public static final /* synthetic */ int access$getDefaultJoin$cp() {
        return DefaultJoin;
    }

    public final float getWidth() {
        return this.width;
    }

    public final float getMiter() {
        return this.miter;
    }

    /* JADX INFO: renamed from: getCap-KaPHkGw, reason: not valid java name */
    public final int m4986getCapKaPHkGw() {
        return this.cap;
    }

    /* JADX INFO: renamed from: getJoin-LxFBmk8, reason: not valid java name */
    public final int m4987getJoinLxFBmk8() {
        return this.join;
    }

    public final PathEffect getPathEffect() {
        return this.pathEffect;
    }

    private Stroke(float width, float miter, int cap, int join, PathEffect pathEffect) {
        super(null);
        this.width = width;
        this.miter = miter;
        this.cap = cap;
        this.join = join;
        this.pathEffect = pathEffect;
    }

    static {
        Companion = new Companion(null);
        DefaultCap = StrokeCap.Companion.m4719getButtKaPHkGw();
        DefaultJoin = StrokeJoin.Companion.m4730getMiterLxFBmk8();
    }

    public boolean equals(Object other) {
        if (this != other) goto L6;
        return true;
    L6:
        if ((other instanceof Stroke) == true) goto L9;
        return false;
    L9:
        if (this.width != ((Stroke) other).width) goto L11;
        boolean r1 = true;
    L12:
        if (r1 == true) goto L15;
        return false;
    L15:
        if (this.miter != ((Stroke) other).miter) goto L17;
        boolean r2 = true;
    L18:
        if (r2 == true) goto L21;
        return false;
    L21:
        if (StrokeCap.m4715equalsimpl0(this.cap, ((Stroke) other).cap) == true) goto L24;
        return false;
    L24:
        if (StrokeJoin.m4725equalsimpl0(this.join, ((Stroke) other).join) == true) goto L27;
        return false;
    L27:
        if (Intrinsics.areEqual(this.pathEffect, ((Stroke) other).pathEffect) == true) goto L29;
        return false;
    L29:
        return true;
    L17:
        r2 = false;
        goto L18
    L11:
        r1 = false;
        goto L12
    }

    public int hashCode() {
        int result = Float.hashCode(this.width);
        int result2 = (result * 31) + Float.hashCode(this.miter);
        int result3 = ((((result2 * 31) + StrokeCap.m4716hashCodeimpl(this.cap)) * 31) + StrokeJoin.m4726hashCodeimpl(this.join)) * 31;
        PathEffect r2 = this.pathEffect;
        if (r2 == null) goto L5;
        int r3 = r2.hashCode();
    L7:
        return result3 + r3;
    L5:
        r3 = 0;
        goto L7
    }

    public String toString() {
        return "Stroke(width=" + this.width + ", miter=" + this.miter + ", cap=" + StrokeCap.m4717toStringimpl(this.cap) + ", join=" + StrokeJoin.m4727toStringimpl(this.join) + ", pathEffect=" + this.pathEffect + ')';
    }
}
