package androidx.compose.ui.text.font;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Font.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0007\u0018\u00002\u00020\u0001B7\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0003\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b¢\u0006\u0002\u0010\fJ.\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007ø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\u001aJD\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\b\u001a\u00020\tH\u0007ø\u0001\u0000¢\u0006\u0004\b\u001b\u0010\u001cJ\u0013\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010 H\u0096\u0002J\b\u0010!\u001a\u00020\u0003H\u0016J\b\u0010\"\u001a\u00020#H\u0016R$\u0010\n\u001a\u00020\u000b8WX\u0097\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0010\n\u0002\u0010\u0011\u0012\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0010R\u001c\u0010\u0006\u001a\u00020\u0007X\u0096\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0011\u001a\u0004\b\u0013\u0010\u0010R\u0013\u0010\b\u001a\u00020\t8\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006$"}, d2 = {"Landroidx/compose/ui/text/font/ResourceFont;", "Landroidx/compose/ui/text/font/Font;", "resId", "", "weight", "Landroidx/compose/ui/text/font/FontWeight;", "style", "Landroidx/compose/ui/text/font/FontStyle;", "variationSettings", "Landroidx/compose/ui/text/font/FontVariation$Settings;", "loadingStrategy", "Landroidx/compose/ui/text/font/FontLoadingStrategy;", "(ILandroidx/compose/ui/text/font/FontWeight;ILandroidx/compose/ui/text/font/FontVariation$Settings;ILkotlin/jvm/internal/DefaultConstructorMarker;)V", "getLoadingStrategy-PKNRLFQ$annotations", "()V", "getLoadingStrategy-PKNRLFQ", "()I", "I", "getResId", "getStyle-_-LCdwA", "getVariationSettings", "()Landroidx/compose/ui/text/font/FontVariation$Settings;", "getWeight", "()Landroidx/compose/ui/text/font/FontWeight;", "copy", "copy-RetOiIg", "(ILandroidx/compose/ui/text/font/FontWeight;I)Landroidx/compose/ui/text/font/ResourceFont;", "copy-F3nL8kk", "(ILandroidx/compose/ui/text/font/FontWeight;IILandroidx/compose/ui/text/font/FontVariation$Settings;)Landroidx/compose/ui/text/font/ResourceFont;", "equals", "", "other", "", "hashCode", "toString", "", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class ResourceFont implements Font {
    public static final int $stable = 0;
    private final int loadingStrategy;
    private final int resId;
    private final int style;
    private final FontVariation.Settings variationSettings;
    private final FontWeight weight;

    static {
    }

    public /* synthetic */ ResourceFont(int r1, FontWeight r2, int r3, FontVariation.Settings r4, int r5, DefaultConstructorMarker r6) {
        this(r1, r2, r3, r4, r5);
    }

    /* JADX INFO: renamed from: getLoadingStrategy-PKNRLFQ$annotations, reason: not valid java name */
    public static /* synthetic */ void m6566getLoadingStrategyPKNRLFQ$annotations() {
    }

    private ResourceFont(int resId, FontWeight weight, int style, FontVariation.Settings variationSettings, int loadingStrategy) {
        this.resId = resId;
        this.weight = weight;
        this.style = style;
        this.variationSettings = variationSettings;
        this.loadingStrategy = loadingStrategy;
    }

    public /* synthetic */ ResourceFont(int r8, FontWeight r9, int r10, FontVariation.Settings r11, int r12, int r13, DefaultConstructorMarker r14) {
        if ((r13 & 2) == 0) goto L5;
        FontWeight r2 = FontWeight.Companion.getNormal();
    L7:
        if ((r13 & 4) == 0) goto L9;
        int r3 = FontStyle.Companion.m6535getNormal_LCdwA();
    L11:
        if ((r13 & 8) == 0) goto L13;
        FontVariation.Settings r4 = FontVariation.INSTANCE.m6550Settings6EWAqTQ(r2, r3, new FontVariation.Setting[0]);
    L15:
        if ((r13 & 16) == 0) goto L17;
        int r5 = FontLoadingStrategy.Companion.m6519getAsyncPKNRLFQ();
    L18:
        this(r8, r2, r3, r4, r5, null);
        return;
    L17:
        r5 = r12;
        goto L18
    L13:
        r4 = r11;
        goto L15
    L9:
        r3 = r10;
        goto L11
    L5:
        r2 = r9;
        goto L7
    }

    public final int getResId() {
        return this.resId;
    }

    @Override // androidx.compose.ui.text.font.Font
    public FontWeight getWeight() {
        return this.weight;
    }

    @Override // androidx.compose.ui.text.font.Font
    /* JADX INFO: renamed from: getStyle-_-LCdwA */
    public int mo6481getStyle_LCdwA() {
        return this.style;
    }

    public final FontVariation.Settings getVariationSettings() {
        return this.variationSettings;
    }

    @Override // androidx.compose.ui.text.font.Font
    /* JADX INFO: renamed from: getLoadingStrategy-PKNRLFQ */
    public int mo6473getLoadingStrategyPKNRLFQ() {
        return this.loadingStrategy;
    }

    /* JADX INFO: renamed from: copy-RetOiIg$default, reason: not valid java name */
    public static /* synthetic */ ResourceFont m6565copyRetOiIg$default(ResourceFont r0, int r1, FontWeight r2, int r3, int r4, Object r5) {
        if ((r4 & 1) == 0) goto L6;
        r1 = r0.resId;
    L6:
        if ((r4 & 2) == 0) goto L9;
        r2 = r0.getWeight();
    L9:
        if ((r4 & 4) == 0) goto L12;
        r3 = r0.mo6481getStyle_LCdwA();
    L12:
        return r0.m6568copyRetOiIg(r1, r2, r3);
    }

    /* JADX INFO: renamed from: copy-RetOiIg, reason: not valid java name */
    public final ResourceFont m6568copyRetOiIg(int resId, FontWeight weight, int style) {
        return m6564copyF3nL8kk$default(this, resId, weight, style, mo6473getLoadingStrategyPKNRLFQ(), null, 16, null);
    }

    /* JADX INFO: renamed from: copy-F3nL8kk$default, reason: not valid java name */
    public static /* synthetic */ ResourceFont m6564copyF3nL8kk$default(ResourceFont r0, int r1, FontWeight r2, int r3, int r4, FontVariation.Settings r5, int r6, Object r7) {
        if ((r6 & 1) == 0) goto L6;
        r1 = r0.resId;
    L6:
        if ((r6 & 2) == 0) goto L9;
        r2 = r0.getWeight();
    L9:
        if ((r6 & 4) == 0) goto L12;
        r3 = r0.mo6481getStyle_LCdwA();
    L12:
        if ((r6 & 8) == 0) goto L15;
        r4 = r0.mo6473getLoadingStrategyPKNRLFQ();
    L15:
        if ((r6 & 16) == 0) goto L17;
        FontVariation.Settings r8 = r0.variationSettings;
    L18:
        int r9 = r3;
        int r10 = r4;
        return r0.m6567copyF3nL8kk(r1, r2, r9, r10, r8);
    L17:
        r8 = r5;
        goto L18
    }

    /* JADX INFO: renamed from: copy-F3nL8kk, reason: not valid java name */
    public final ResourceFont m6567copyF3nL8kk(int resId, FontWeight weight, int style, int loadingStrategy, FontVariation.Settings variationSettings) {
        return new ResourceFont(resId, weight, style, variationSettings, loadingStrategy, null);
    }

    public boolean equals(Object other) {
        if (this != other) goto L6;
        return true;
    L6:
        if ((other instanceof ResourceFont) == true) goto L9;
        return false;
    L9:
        if (this.resId == ((ResourceFont) other).resId) goto L12;
        return false;
    L12:
        if (Intrinsics.areEqual(getWeight(), ((ResourceFont) other).getWeight()) == true) goto L15;
        return false;
    L15:
        if (FontStyle.m6528equalsimpl0(mo6481getStyle_LCdwA(), ((ResourceFont) other).mo6481getStyle_LCdwA()) == true) goto L18;
        return false;
    L18:
        if (Intrinsics.areEqual(this.variationSettings, ((ResourceFont) other).variationSettings) == true) goto L21;
        return false;
    L21:
        if (FontLoadingStrategy.m6515equalsimpl0(mo6473getLoadingStrategyPKNRLFQ(), ((ResourceFont) other).mo6473getLoadingStrategyPKNRLFQ()) == true) goto L23;
        return false;
    L23:
        return true;
    }

    public int hashCode() {
        int result = this.resId;
        int result2 = (result * 31) + getWeight().hashCode();
        return (((((result2 * 31) + FontStyle.m6529hashCodeimpl(mo6481getStyle_LCdwA())) * 31) + FontLoadingStrategy.m6516hashCodeimpl(mo6473getLoadingStrategyPKNRLFQ())) * 31) + this.variationSettings.hashCode();
    }

    public String toString() {
        return "ResourceFont(resId=" + this.resId + ", weight=" + getWeight() + ", style=" + FontStyle.m6530toStringimpl(mo6481getStyle_LCdwA()) + ", loadingStrategy=" + FontLoadingStrategy.m6517toStringimpl(mo6473getLoadingStrategyPKNRLFQ()) + ')';
    }
}
