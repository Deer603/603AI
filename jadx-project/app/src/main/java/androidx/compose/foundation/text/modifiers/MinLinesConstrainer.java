package androidx.compose.foundation.text.modifiers;

import androidx.compose.ui.text.ParagraphKt;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.TextStyleKt;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.style.TextOverflow;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.DensityKt;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;

/* JADX INFO: compiled from: MinLinesConstrainer.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0000\u0018\u0000 \u001e2\u00020\u0001:\u0001\u001eB'\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\"\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u001bH\u0000ø\u0001\u0000¢\u0006\u0004\b\u001c\u0010\u001dR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0014X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u001f"}, d2 = {"Landroidx/compose/foundation/text/modifiers/MinLinesConstrainer;", "", "layoutDirection", "Landroidx/compose/ui/unit/LayoutDirection;", "inputTextStyle", "Landroidx/compose/ui/text/TextStyle;", "density", "Landroidx/compose/ui/unit/Density;", "fontFamilyResolver", "Landroidx/compose/ui/text/font/FontFamily$Resolver;", "(Landroidx/compose/ui/unit/LayoutDirection;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/unit/Density;Landroidx/compose/ui/text/font/FontFamily$Resolver;)V", "getDensity", "()Landroidx/compose/ui/unit/Density;", "getFontFamilyResolver", "()Landroidx/compose/ui/text/font/FontFamily$Resolver;", "getInputTextStyle", "()Landroidx/compose/ui/text/TextStyle;", "getLayoutDirection", "()Landroidx/compose/ui/unit/LayoutDirection;", "lineHeightCache", "", "oneLineHeightCache", "resolvedStyle", "coerceMinLines", "Landroidx/compose/ui/unit/Constraints;", "inConstraints", "minLines", "", "coerceMinLines-Oh53vG4$foundation_release", "(JI)J", "Companion", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class MinLinesConstrainer {
    public static final int $stable = 0;
    public static final Companion Companion = null;
    private static MinLinesConstrainer last;
    private final Density density;
    private final FontFamily.Resolver fontFamilyResolver;
    private final TextStyle inputTextStyle;
    private final LayoutDirection layoutDirection;
    private float lineHeightCache;
    private float oneLineHeightCache;
    private final TextStyle resolvedStyle;

    /* JADX INFO: compiled from: MinLinesConstrainer.kt */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J0\u0010\u0005\u001a\u00020\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eR\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Landroidx/compose/foundation/text/modifiers/MinLinesConstrainer$Companion;", "", "()V", "last", "Landroidx/compose/foundation/text/modifiers/MinLinesConstrainer;", "from", "minMaxUtil", "layoutDirection", "Landroidx/compose/ui/unit/LayoutDirection;", "paramStyle", "Landroidx/compose/ui/text/TextStyle;", "density", "Landroidx/compose/ui/unit/Density;", "fontFamilyResolver", "Landroidx/compose/ui/text/font/FontFamily$Resolver;", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker r1) {
            this();
        }

        private Companion() {
        }

        public final MinLinesConstrainer from(MinLinesConstrainer minMaxUtil, LayoutDirection layoutDirection, TextStyle paramStyle, Density density, FontFamily.Resolver fontFamilyResolver) {
            boolean r0 = true;
            if (minMaxUtil != null) goto L5;
        L17:
            MinLinesConstrainer it = MinLinesConstrainer.access$getLast$cp();
            if (it != null) goto L20;
        L32:
            MinLinesConstrainer it2 = new MinLinesConstrainer(layoutDirection, TextStyleKt.resolveDefaults(paramStyle, layoutDirection), DensityKt.Density(density.getDensity(), density.getFontScale()), fontFamilyResolver);
            Companion r3 = MinLinesConstrainer.Companion;
            MinLinesConstrainer.access$setLast$cp(it2);
            return it2;
        L20:
            if (layoutDirection != it.getLayoutDirection()) goto L32;
            if (Intrinsics.areEqual(TextStyleKt.resolveDefaults(paramStyle, layoutDirection), it.getInputTextStyle()) == false) goto L32;
            if (density.getDensity() == it.getDensity().getDensity()) goto L27;
            r0 = false;
        L27:
            if (r0 == false) goto L32;
            if (fontFamilyResolver != it.getFontFamilyResolver()) goto L32;
            return it;
        L5:
            if (layoutDirection != minMaxUtil.getLayoutDirection()) goto L17;
            if (Intrinsics.areEqual(TextStyleKt.resolveDefaults(paramStyle, layoutDirection), minMaxUtil.getInputTextStyle()) == false) goto L17;
            if (density.getDensity() != minMaxUtil.getDensity().getDensity()) goto L11;
            boolean r4 = true;
        L12:
            if (r4 == false) goto L17;
            if (fontFamilyResolver != minMaxUtil.getFontFamilyResolver()) goto L17;
            return minMaxUtil;
        L11:
            r4 = false;
            goto L12
        }
    }

    static {
        Companion = new Companion(null);
        $stable = 8;
    }

    public MinLinesConstrainer(LayoutDirection layoutDirection, TextStyle inputTextStyle, Density density, FontFamily.Resolver fontFamilyResolver) {
        this.layoutDirection = layoutDirection;
        this.inputTextStyle = inputTextStyle;
        this.density = density;
        this.fontFamilyResolver = fontFamilyResolver;
        this.resolvedStyle = TextStyleKt.resolveDefaults(this.inputTextStyle, this.layoutDirection);
        this.lineHeightCache = Float.NaN;
        this.oneLineHeightCache = Float.NaN;
    }

    public static final /* synthetic */ MinLinesConstrainer access$getLast$cp() {
        return last;
    }

    public static final /* synthetic */ void access$setLast$cp(MinLinesConstrainer r0) {
        last = r0;
    }

    public final LayoutDirection getLayoutDirection() {
        return this.layoutDirection;
    }

    public final TextStyle getInputTextStyle() {
        return this.inputTextStyle;
    }

    public final Density getDensity() {
        return this.density;
    }

    public final FontFamily.Resolver getFontFamilyResolver() {
        return this.fontFamilyResolver;
    }

    /* JADX INFO: renamed from: coerceMinLines-Oh53vG4$foundation_release, reason: not valid java name */
    public final long m1399coerceMinLinesOh53vG4$foundation_release(long inConstraints, int minLines) {
        float oneLineHeight = this.oneLineHeightCache;
        float lineHeight = this.lineHeightCache;
        if (Float.isNaN(oneLineHeight) == false) goto L5;
    L7:
        oneLineHeight = ParagraphKt.m6287ParagraphUl8oQg4$default(MinLinesConstrainerKt.access$getEmptyTextReplacement$p(), this.resolvedStyle, ConstraintsKt.Constraints$default(0, 0, 0, 0, 15, null), this.density, this.fontFamilyResolver, null, null, 1, TextOverflow.Companion.m6886getClipgIe3tQ8(), 96, null).getHeight();
        float twoLineHeight = ParagraphKt.m6287ParagraphUl8oQg4$default(MinLinesConstrainerKt.access$getTwoLineTextReplacement$p(), this.resolvedStyle, ConstraintsKt.Constraints$default(0, 0, 0, 0, 15, null), this.density, this.fontFamilyResolver, null, null, 2, TextOverflow.Companion.m6886getClipgIe3tQ8(), 96, null).getHeight();
        lineHeight = twoLineHeight - oneLineHeight;
        this.oneLineHeightCache = oneLineHeight;
        this.lineHeightCache = lineHeight;
    L9:
        if (minLines == 1) goto L11;
        float $this$fastRoundToInt$iv = ((minLines - 1) * lineHeight) + oneLineHeight;
        int minHeight = RangesKt.coerceAtMost(RangesKt.coerceAtLeast(Math.round($this$fastRoundToInt$iv), 0), Constraints.m6925getMaxHeightimpl(inConstraints));
    L13:
        return ConstraintsKt.Constraints(Constraints.m6928getMinWidthimpl(inConstraints), Constraints.m6926getMaxWidthimpl(inConstraints), minHeight, Constraints.m6925getMaxHeightimpl(inConstraints));
    L11:
        minHeight = Constraints.m6927getMinHeightimpl(inConstraints);
        goto L13
    L5:
        if (Float.isNaN(lineHeight) == false) goto L9;
        goto L7
    }
}
