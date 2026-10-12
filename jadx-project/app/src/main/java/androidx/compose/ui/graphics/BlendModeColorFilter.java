package androidx.compose.ui.graphics;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: ColorFilter.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0017\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006B#\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\u0010\u0007\u001a\u00060\bj\u0002`\t¢\u0006\u0002\u0010\nJ\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0096\u0002J\b\u0010\u0015\u001a\u00020\u0016H\u0016J\b\u0010\u0017\u001a\u00020\u0018H\u0016R\u0019\u0010\u0004\u001a\u00020\u0005ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u000b\u0010\fR\u0019\u0010\u0002\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u000e\u0010\u000f\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0019"}, d2 = {"Landroidx/compose/ui/graphics/BlendModeColorFilter;", "Landroidx/compose/ui/graphics/ColorFilter;", "color", "Landroidx/compose/ui/graphics/Color;", "blendMode", "Landroidx/compose/ui/graphics/BlendMode;", "(JILkotlin/jvm/internal/DefaultConstructorMarker;)V", "nativeColorFilter", "Landroid/graphics/ColorFilter;", "Landroidx/compose/ui/graphics/NativeColorFilter;", "(JILandroid/graphics/ColorFilter;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "getBlendMode-0nO6VwU", "()I", "I", "getColor-0d7_KjU", "()J", "J", "equals", "", "other", "", "hashCode", "", "toString", "", "ui-graphics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class BlendModeColorFilter extends ColorFilter {
    private final int blendMode;
    private final long color;

    public /* synthetic */ BlendModeColorFilter(long r1, int r3, android.graphics.ColorFilter r4, DefaultConstructorMarker r5) {
        this(r1, r3, r4);
    }

    public /* synthetic */ BlendModeColorFilter(long r1, int r3, DefaultConstructorMarker r4) {
        this(r1, r3);
    }

    /* JADX INFO: renamed from: getColor-0d7_KjU, reason: not valid java name */
    public final long m4311getColor0d7_KjU() {
        return this.color;
    }

    /* JADX INFO: renamed from: getBlendMode-0nO6VwU, reason: not valid java name */
    public final int m4310getBlendMode0nO6VwU() {
        return this.blendMode;
    }

    private BlendModeColorFilter(long color, int blendMode, android.graphics.ColorFilter nativeColorFilter) {
        super(nativeColorFilter);
        this.color = color;
        this.blendMode = blendMode;
    }

    private BlendModeColorFilter(long color, int blendMode) {
        this(color, blendMode, AndroidColorFilter_androidKt.m4232actualTintColorFilterxETnrds(color, blendMode), null);
    }

    public boolean equals(Object other) {
        if (this != other) goto L6;
        return true;
    L6:
        if ((other instanceof BlendModeColorFilter) == true) goto L9;
        return false;
    L9:
        if (Color.m4367equalsimpl0(this.color, ((BlendModeColorFilter) other).color) == true) goto L12;
        return false;
    L12:
        if (BlendMode.m4277equalsimpl0(this.blendMode, ((BlendModeColorFilter) other).blendMode) == true) goto L14;
        return false;
    L14:
        return true;
    }

    public int hashCode() {
        int result = Color.m4373hashCodeimpl(this.color);
        return (result * 31) + BlendMode.m4278hashCodeimpl(this.blendMode);
    }

    public String toString() {
        return "BlendModeColorFilter(color=" + Color.m4374toStringimpl(this.color) + ", blendMode=" + BlendMode.m4279toStringimpl(this.blendMode) + ')';
    }
}
