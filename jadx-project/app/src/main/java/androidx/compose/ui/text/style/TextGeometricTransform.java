package androidx.compose.ui.text.style;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: TextGeometricTransform.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0007\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B\u0019\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\u001a\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\r\u001a\u00020\u000eH\u0016J\b\u0010\u000f\u001a\u00020\u0010H\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0012"}, d2 = {"Landroidx/compose/ui/text/style/TextGeometricTransform;", "", "scaleX", "", "skewX", "(FF)V", "getScaleX", "()F", "getSkewX", "copy", "equals", "", "other", "hashCode", "", "toString", "", "Companion", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class TextGeometricTransform {
    public static final int $stable = 0;
    public static final Companion Companion = null;
    private static final TextGeometricTransform None = null;
    private final float scaleX;
    private final float skewX;

    /* JADX INFO: compiled from: TextGeometricTransform.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u00020\u00048\u0000X\u0081\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0005\u0010\u0002\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Landroidx/compose/ui/text/style/TextGeometricTransform$Companion;", "", "()V", "None", "Landroidx/compose/ui/text/style/TextGeometricTransform;", "getNone$ui_text_release$annotations", "getNone$ui_text_release", "()Landroidx/compose/ui/text/style/TextGeometricTransform;", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker r1) {
            this();
        }

        public static /* synthetic */ void getNone$ui_text_release$annotations() {
        }

        private Companion() {
        }

        public final TextGeometricTransform getNone$ui_text_release() {
            return TextGeometricTransform.access$getNone$cp();
        }
    }

    public TextGeometricTransform() {
        float r2 = 0.0f;
        this(r2, r2, 3, null);
    }

    public TextGeometricTransform(float scaleX, float skewX) {
        this.scaleX = scaleX;
        this.skewX = skewX;
    }

    public static final /* synthetic */ TextGeometricTransform access$getNone$cp() {
        return None;
    }

    public /* synthetic */ TextGeometricTransform(float r1, float r2, int r3, DefaultConstructorMarker r4) {
        if ((r3 & 1) == 0) goto L6;
        r1 = 1.0f;
    L6:
        if ((r3 & 2) == 0) goto L8;
        r2 = 0.0f;
    L8:
        this(r1, r2);
    }

    public final float getScaleX() {
        return this.scaleX;
    }

    public final float getSkewX() {
        return this.skewX;
    }

    static {
        Companion = new Companion(null);
        None = new TextGeometricTransform(1.0f, 0.0f);
    }

    public static /* synthetic */ TextGeometricTransform copy$default(TextGeometricTransform r0, float r1, float r2, int r3, Object r4) {
        if ((r3 & 1) == 0) goto L6;
        r1 = r0.scaleX;
    L6:
        if ((r3 & 2) == 0) goto L9;
        r2 = r0.skewX;
    L9:
        return r0.copy(r1, r2);
    }

    public final TextGeometricTransform copy(float scaleX, float skewX) {
        return new TextGeometricTransform(scaleX, skewX);
    }

    public boolean equals(Object other) {
        if (this != other) goto L6;
        return true;
    L6:
        if ((other instanceof TextGeometricTransform) == true) goto L9;
        return false;
    L9:
        if (this.scaleX != ((TextGeometricTransform) other).scaleX) goto L11;
        boolean r1 = true;
    L12:
        if (r1 == true) goto L15;
        return false;
    L15:
        if (this.skewX != ((TextGeometricTransform) other).skewX) goto L17;
        boolean r2 = true;
    L18:
        if (r2 == true) goto L20;
        return false;
    L20:
        return true;
    L17:
        r2 = false;
        goto L18
    L11:
        r1 = false;
        goto L12
    }

    public int hashCode() {
        int result = Float.hashCode(this.scaleX);
        return (result * 31) + Float.hashCode(this.skewX);
    }

    public String toString() {
        return "TextGeometricTransform(scaleX=" + this.scaleX + ", skewX=" + this.skewX + ')';
    }
}
