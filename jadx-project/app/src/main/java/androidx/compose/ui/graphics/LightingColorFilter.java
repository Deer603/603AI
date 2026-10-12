package androidx.compose.ui.graphics;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: ColorFilter.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0017\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005B#\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\u0010\u0006\u001a\u00060\u0007j\u0002`\b¢\u0006\u0002\u0010\tJ\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0096\u0002J\b\u0010\u0012\u001a\u00020\u0013H\u0016J\b\u0010\u0014\u001a\u00020\u0015H\u0016R\u0019\u0010\u0004\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\n\u0010\u000bR\u0019\u0010\u0002\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\r\u0010\u000b\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0016"}, d2 = {"Landroidx/compose/ui/graphics/LightingColorFilter;", "Landroidx/compose/ui/graphics/ColorFilter;", "multiply", "Landroidx/compose/ui/graphics/Color;", "add", "(JJLkotlin/jvm/internal/DefaultConstructorMarker;)V", "nativeColorFilter", "Landroid/graphics/ColorFilter;", "Landroidx/compose/ui/graphics/NativeColorFilter;", "(JJLandroid/graphics/ColorFilter;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "getAdd-0d7_KjU", "()J", "J", "getMultiply-0d7_KjU", "equals", "", "other", "", "hashCode", "", "toString", "", "ui-graphics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class LightingColorFilter extends ColorFilter {
    private final long add;
    private final long multiply;

    public /* synthetic */ LightingColorFilter(long r1, long r3, android.graphics.ColorFilter r5, DefaultConstructorMarker r6) {
        this(r1, r3, r5);
    }

    public /* synthetic */ LightingColorFilter(long r1, long r3, DefaultConstructorMarker r5) {
        this(r1, r3);
    }

    /* JADX INFO: renamed from: getAdd-0d7_KjU, reason: not valid java name */
    public final long m4592getAdd0d7_KjU() {
        return this.add;
    }

    /* JADX INFO: renamed from: getMultiply-0d7_KjU, reason: not valid java name */
    public final long m4593getMultiply0d7_KjU() {
        return this.multiply;
    }

    private LightingColorFilter(long multiply, long add, android.graphics.ColorFilter nativeColorFilter) {
        super(nativeColorFilter);
        this.multiply = multiply;
        this.add = add;
    }

    private LightingColorFilter(long multiply, long add) {
        this(multiply, add, AndroidColorFilter_androidKt.m4231actualLightingColorFilterOWjLjI(multiply, add), null);
    }

    public boolean equals(Object other) {
        if (this != other) goto L6;
        return true;
    L6:
        if ((other instanceof LightingColorFilter) == true) goto L9;
        return false;
    L9:
        if (Color.m4367equalsimpl0(this.multiply, ((LightingColorFilter) other).multiply) == true) goto L12;
        return false;
    L12:
        if (Color.m4367equalsimpl0(this.add, ((LightingColorFilter) other).add) == true) goto L14;
        return false;
    L14:
        return true;
    }

    public int hashCode() {
        int result = Color.m4373hashCodeimpl(this.multiply);
        return (result * 31) + Color.m4373hashCodeimpl(this.add);
    }

    public String toString() {
        return "LightingColorFilter(multiply=" + Color.m4374toStringimpl(this.multiply) + ", add=" + Color.m4374toStringimpl(this.add) + ')';
    }
}
