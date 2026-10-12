package androidx.compose.foundation.text.modifiers;

import androidx.compose.foundation.text.TextDelegateKt;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.MultiParagraph;
import androidx.compose.ui.text.MultiParagraphIntrinsics;
import androidx.compose.ui.text.Paragraph;
import androidx.compose.ui.text.ParagraphIntrinsics;
import androidx.compose.ui.text.ParagraphIntrinsicsKt;
import androidx.compose.ui.text.ParagraphKt;
import androidx.compose.ui.text.TextLayoutInput;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.TextStyleKt;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.style.TextOverflow;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.LayoutDirection;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;

/* JADX INFO: compiled from: ParagraphLayoutCache.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001BE\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\r\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r¢\u0006\u0002\u0010\u000fJ\u0016\u0010:\u001a\u00020\r2\u0006\u0010;\u001a\u00020\r2\u0006\u0010<\u001a\u00020\u001fJ\"\u0010=\u001a\u0002012\u0006\u0010>\u001a\u0002092\u0006\u0010<\u001a\u00020\u001fH\u0000ø\u0001\u0000¢\u0006\u0004\b?\u0010@J \u0010A\u001a\u00020\u000b2\u0006\u0010>\u001a\u0002092\u0006\u0010<\u001a\u00020\u001fø\u0001\u0000¢\u0006\u0004\bB\u0010CJ\b\u0010D\u001a\u00020,H\u0002J\u000e\u0010E\u001a\u00020\r2\u0006\u0010<\u001a\u00020\u001fJ\u000e\u0010F\u001a\u00020\r2\u0006\u0010<\u001a\u00020\u001fJ\"\u0010G\u001a\u00020\u000b2\u0006\u0010>\u001a\u0002092\u0006\u0010<\u001a\u00020\u001fH\u0002ø\u0001\u0000¢\u0006\u0004\bH\u0010CJ\u0010\u0010I\u001a\u0002072\u0006\u0010<\u001a\u00020\u001fH\u0002J\u0010\u0010J\u001a\u0004\u0018\u00010K2\u0006\u0010\u0004\u001a\u00020\u0005J\b\u0010L\u001a\u00020\u0003H\u0016JH\u0010M\u001a\u00020,2\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\rø\u0001\u0000¢\u0006\u0004\bN\u0010OJ,\u0010P\u001a\u0002092\u0006\u0010>\u001a\u0002092\u0006\u0010<\u001a\u00020\u001f2\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u0002ø\u0001\u0000¢\u0006\u0004\bQ\u0010RR\u000e\u0010\u0010\u001a\u00020\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\rX\u0082\u000e¢\u0006\u0002\n\u0000R(\u0010\u0014\u001a\u0004\u0018\u00010\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013@@X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0019\u001a\u00020\u000bX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001e\u001a\u0004\u0018\u00010\u001fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u0010 \u001a\u00020!X\u0082\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\n\u0002\u0010\"R\"\u0010#\u001a\u00020$X\u0080\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0010\n\u0002\u0010\"\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R\u0010\u0010)\u001a\u0004\u0018\u00010*X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010+\u001a\u00020,8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b-\u0010.R\u0016\u0010\b\u001a\u00020\tX\u0082\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\n\u0002\u0010/R\u001c\u00100\u001a\u0004\u0018\u000101X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b2\u00103\"\u0004\b4\u00105R\u0010\u00106\u001a\u0004\u0018\u000107X\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u00108\u001a\u000209X\u0082\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\n\u0002\u0010\"R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u000e¢\u0006\u0002\n\u0000\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006S"}, d2 = {"Landroidx/compose/foundation/text/modifiers/ParagraphLayoutCache;", "", "text", "", "style", "Landroidx/compose/ui/text/TextStyle;", "fontFamilyResolver", "Landroidx/compose/ui/text/font/FontFamily$Resolver;", "overflow", "Landroidx/compose/ui/text/style/TextOverflow;", "softWrap", "", "maxLines", "", "minLines", "(Ljava/lang/String;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/font/FontFamily$Resolver;IZIILkotlin/jvm/internal/DefaultConstructorMarker;)V", "cachedIntrinsicHeight", "cachedIntrinsicHeightInputWidth", "value", "Landroidx/compose/ui/unit/Density;", "density", "getDensity$foundation_release", "()Landroidx/compose/ui/unit/Density;", "setDensity$foundation_release", "(Landroidx/compose/ui/unit/Density;)V", "didOverflow", "getDidOverflow$foundation_release", "()Z", "setDidOverflow$foundation_release", "(Z)V", "intrinsicsLayoutDirection", "Landroidx/compose/ui/unit/LayoutDirection;", "lastDensity", "Landroidx/compose/foundation/text/modifiers/InlineDensity;", "J", "layoutSize", "Landroidx/compose/ui/unit/IntSize;", "getLayoutSize-YbymL2g$foundation_release", "()J", "setLayoutSize-ozmzZPI$foundation_release", "(J)V", "mMinLinesConstrainer", "Landroidx/compose/foundation/text/modifiers/MinLinesConstrainer;", "observeFontChanges", "", "getObserveFontChanges$foundation_release", "()Lkotlin/Unit;", "I", "paragraph", "Landroidx/compose/ui/text/Paragraph;", "getParagraph$foundation_release", "()Landroidx/compose/ui/text/Paragraph;", "setParagraph$foundation_release", "(Landroidx/compose/ui/text/Paragraph;)V", "paragraphIntrinsics", "Landroidx/compose/ui/text/ParagraphIntrinsics;", "prevConstraints", "Landroidx/compose/ui/unit/Constraints;", "intrinsicHeight", "width", "layoutDirection", "layoutText", "constraints", "layoutText-K40F9xA$foundation_release", "(JLandroidx/compose/ui/unit/LayoutDirection;)Landroidx/compose/ui/text/Paragraph;", "layoutWithConstraints", "layoutWithConstraints-K40F9xA", "(JLandroidx/compose/ui/unit/LayoutDirection;)Z", "markDirty", "maxIntrinsicWidth", "minIntrinsicWidth", "newLayoutWillBeDifferent", "newLayoutWillBeDifferent-K40F9xA", "setLayoutDirection", "slowCreateTextLayoutResultOrNull", "Landroidx/compose/ui/text/TextLayoutResult;", "toString", "update", "update-L6sJoHM", "(Ljava/lang/String;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/font/FontFamily$Resolver;IZII)V", "useMinLinesConstrainer", "useMinLinesConstrainer-euUD3Qg", "(JLandroidx/compose/ui/unit/LayoutDirection;Landroidx/compose/ui/text/TextStyle;)J", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class ParagraphLayoutCache {
    public static final int $stable = 0;
    private int cachedIntrinsicHeight;
    private int cachedIntrinsicHeightInputWidth;
    private Density density;
    private boolean didOverflow;
    private FontFamily.Resolver fontFamilyResolver;
    private LayoutDirection intrinsicsLayoutDirection;
    private long lastDensity;
    private long layoutSize;
    private MinLinesConstrainer mMinLinesConstrainer;
    private int maxLines;
    private int minLines;
    private int overflow;
    private Paragraph paragraph;
    private ParagraphIntrinsics paragraphIntrinsics;
    private long prevConstraints;
    private boolean softWrap;
    private TextStyle style;
    private String text;

    static {
        $stable = 8;
    }

    public /* synthetic */ ParagraphLayoutCache(String r1, TextStyle r2, FontFamily.Resolver r3, int r4, boolean r5, int r6, int r7, DefaultConstructorMarker r8) {
        this(r1, r2, r3, r4, r5, r6, r7);
    }

    private ParagraphLayoutCache(String text, TextStyle style, FontFamily.Resolver fontFamilyResolver, int overflow, boolean softWrap, int maxLines, int minLines) {
        this.text = text;
        this.style = style;
        this.fontFamilyResolver = fontFamilyResolver;
        this.overflow = overflow;
        this.softWrap = softWrap;
        this.maxLines = maxLines;
        this.minLines = minLines;
        this.lastDensity = InlineDensity.Companion.m1394getUnspecifiedL26CHvs();
        this.layoutSize = IntSize.m7139constructorimpl((((long) 0) << 32) | (((long) 0) & 4294967295L));
        this.prevConstraints = Constraints.Companion.m6936fixedJhjzzOo(0, 0);
        this.cachedIntrinsicHeightInputWidth = -1;
        this.cachedIntrinsicHeight = -1;
    }

    public /* synthetic */ ParagraphLayoutCache(String r10, TextStyle r11, FontFamily.Resolver r12, int r13, boolean r14, int r15, int r16, int r17, DefaultConstructorMarker r18) {
        if ((r17 & 8) == 0) goto L5;
        int r4 = TextOverflow.Companion.m6886getClipgIe3tQ8();
    L7:
        if ((r17 & 16) == 0) goto L9;
        boolean r5 = true;
    L11:
        if ((r17 & 32) == 0) goto L13;
        int r6 = Integer.MAX_VALUE;
    L15:
        if ((r17 & 64) == 0) goto L17;
        int r7 = 1;
    L18:
        this(r10, r11, r12, r4, r5, r6, r7, null);
        return;
    L17:
        r7 = r16;
        goto L18
    L13:
        r6 = r15;
        goto L15
    L9:
        r5 = r14;
        goto L11
    L5:
        r4 = r13;
        goto L7
    }

    public final Density getDensity$foundation_release() {
        return this.density;
    }

    public final void setDensity$foundation_release(Density value) {
        Density localField = this.density;
        if (value == null) goto L5;
        long newDensity = InlineDensity.m1386constructorimpl(value);
    L6:
        if (localField != null) goto L9;
        this.density = value;
        this.lastDensity = newDensity;
        return;
    L9:
        if (value != null) goto L11;
    L12:
        this.density = value;
        this.lastDensity = newDensity;
        markDirty();
        return;
    L11:
        if (InlineDensity.m1388equalsimpl0(this.lastDensity, newDensity) == false) goto L12;
        return;
    L5:
        newDensity = InlineDensity.Companion.m1394getUnspecifiedL26CHvs();
        goto L6
    }

    public final Unit getObserveFontChanges$foundation_release() {
        ParagraphIntrinsics r0 = this.paragraphIntrinsics;
        if (r0 == null) goto L6;
        r0.getHasStaleResolvedFonts();
    L6:
        return Unit.INSTANCE;
    }

    public final Paragraph getParagraph$foundation_release() {
        return this.paragraph;
    }

    public final void setParagraph$foundation_release(Paragraph r1) {
        this.paragraph = r1;
    }

    public final boolean getDidOverflow$foundation_release() {
        return this.didOverflow;
    }

    public final void setDidOverflow$foundation_release(boolean r1) {
        this.didOverflow = r1;
    }

    /* JADX INFO: renamed from: getLayoutSize-YbymL2g$foundation_release, reason: not valid java name */
    public final long m1416getLayoutSizeYbymL2g$foundation_release() {
        return this.layoutSize;
    }

    /* JADX INFO: renamed from: setLayoutSize-ozmzZPI$foundation_release, reason: not valid java name */
    public final void m1419setLayoutSizeozmzZPI$foundation_release(long r1) {
        this.layoutSize = r1;
    }

    /* JADX INFO: renamed from: layoutWithConstraints-K40F9xA, reason: not valid java name */
    public final boolean m1418layoutWithConstraintsK40F9xA(long constraints, LayoutDirection layoutDirection) {
        if (this.minLines <= 1) goto L5;
        LayoutDirection r3 = layoutDirection;
        long finalConstraints = m1415useMinLinesConstrainereuUD3Qg$default(this, constraints, r3, null, 4, null);
    L7:
        if (m1413newLayoutWillBeDifferentK40F9xA(finalConstraints, r3) == false) goto L9;
        Paragraph it = m1417layoutTextK40F9xA$foundation_release(finalConstraints, r3);
        this.prevConstraints = finalConstraints;
        int width$iv = TextDelegateKt.ceilToIntPx(it.getWidth());
        int height$iv = TextDelegateKt.ceilToIntPx(it.getHeight());
        long localSize = ConstraintsKt.m6940constrain4WqzIAM(finalConstraints, IntSize.m7139constructorimpl((((long) height$iv) & 4294967295L) | (((long) width$iv) << 32)));
        this.layoutSize = localSize;
        if (TextOverflow.m6877equalsimpl0(this.overflow, TextOverflow.Companion.m6890getVisiblegIe3tQ8()) == false) goto L23;
    L27:
        boolean r14 = false;
    L28:
        this.didOverflow = r14;
        this.paragraph = it;
        return true;
    L23:
        if (((int) (localSize >> 32)) >= it.getWidth()) goto L25;
    L26:
        r14 = true;
        goto L28
    L25:
        if (((int) (localSize & 4294967295L)) >= it.getHeight()) goto L27;
    L9:
        if (Constraints.m6919equalsimpl0(finalConstraints, this.prevConstraints) == true) goto L19;
        Paragraph localParagraph = this.paragraph;
        Intrinsics.checkNotNull(localParagraph);
        float layoutWidth = Math.min(localParagraph.getMaxIntrinsicWidth(), localParagraph.getWidth());
        int width$iv2 = TextDelegateKt.ceilToIntPx(layoutWidth);
        int height$iv2 = TextDelegateKt.ceilToIntPx(localParagraph.getHeight());
        boolean r15 = true;
        long localSize2 = ConstraintsKt.m6940constrain4WqzIAM(finalConstraints, IntSize.m7139constructorimpl((((long) width$iv2) << 32) | (((long) height$iv2) & 4294967295L)));
        this.layoutSize = localSize2;
        if (TextOverflow.m6877equalsimpl0(this.overflow, TextOverflow.Companion.m6890getVisiblegIe3tQ8()) == true) goto L17;
        int $i$f$unpackInt1 = (int) (localSize2 >> 32);
        if ($i$f$unpackInt1 < localParagraph.getWidth()) goto L18;
        int $i$f$unpackInt2 = (int) (localSize2 & 4294967295L);
        if ($i$f$unpackInt2 >= localParagraph.getHeight()) goto L17;
    L18:
        this.didOverflow = r15;
        this.prevConstraints = finalConstraints;
    L17:
        r15 = false;
    L19:
        return false;
    L5:
        r3 = layoutDirection;
        finalConstraints = constraints;
        goto L7
    }

    /* JADX INFO: renamed from: useMinLinesConstrainer-euUD3Qg$default, reason: not valid java name */
    static /* synthetic */ long m1415useMinLinesConstrainereuUD3Qg$default(ParagraphLayoutCache r0, long r1, LayoutDirection r3, TextStyle r4, int r5, Object r6) {
        if ((r5 & 4) == 0) goto L6;
        r4 = r0.style;
    L6:
        return r0.m1414useMinLinesConstrainereuUD3Qg(r1, r3, r4);
    }

    /* JADX INFO: renamed from: useMinLinesConstrainer-euUD3Qg, reason: not valid java name */
    private final long m1414useMinLinesConstrainereuUD3Qg(long constraints, LayoutDirection layoutDirection, TextStyle style) {
        MinLinesConstrainer.Companion r0 = MinLinesConstrainer.Companion;
        MinLinesConstrainer r1 = this.mMinLinesConstrainer;
        Density r4 = this.density;
        Intrinsics.checkNotNull(r4);
        MinLinesConstrainer localMin = r0.from(r1, layoutDirection, style, r4, this.fontFamilyResolver);
        this.mMinLinesConstrainer = localMin;
        return localMin.m1399coerceMinLinesOh53vG4$foundation_release(constraints, this.minLines);
    }

    public final int intrinsicHeight(int width, LayoutDirection layoutDirection) {
        int localWidth = this.cachedIntrinsicHeightInputWidth;
        int localHeght = this.cachedIntrinsicHeight;
        if (width == localWidth) goto L5;
    L7:
        long constraints = ConstraintsKt.Constraints(0, width, 0, Integer.MAX_VALUE);
        if (this.minLines <= 1) goto L10;
        LayoutDirection layoutDirection2 = layoutDirection;
        long finalConstraints = m1415useMinLinesConstrainereuUD3Qg$default(this, constraints, layoutDirection2, null, 4, null);
    L11:
        int result = RangesKt.coerceAtLeast(TextDelegateKt.ceilToIntPx(m1417layoutTextK40F9xA$foundation_release(finalConstraints, layoutDirection2).getHeight()), Constraints.m6927getMinHeightimpl(finalConstraints));
        this.cachedIntrinsicHeightInputWidth = width;
        this.cachedIntrinsicHeight = result;
        return result;
    L10:
        layoutDirection2 = layoutDirection;
        finalConstraints = constraints;
        goto L11
    L5:
        if (localWidth == (-1)) goto L7;
        return localHeght;
    }

    /* JADX INFO: renamed from: update-L6sJoHM, reason: not valid java name */
    public final void m1420updateL6sJoHM(String text, TextStyle style, FontFamily.Resolver fontFamilyResolver, int overflow, boolean softWrap, int maxLines, int minLines) {
        this.text = text;
        this.style = style;
        this.fontFamilyResolver = fontFamilyResolver;
        this.overflow = overflow;
        this.softWrap = softWrap;
        this.maxLines = maxLines;
        this.minLines = minLines;
        markDirty();
    }

    private final ParagraphIntrinsics setLayoutDirection(LayoutDirection layoutDirection) {
        ParagraphIntrinsics localIntrinsics = this.paragraphIntrinsics;
        if (localIntrinsics != null) goto L5;
    L10:
        this.intrinsicsLayoutDirection = layoutDirection;
        String r2 = this.text;
        TextStyle r3 = TextStyleKt.resolveDefaults(this.style, layoutDirection);
        List r4 = CollectionsKt.emptyList();
        Density r5 = this.density;
        Intrinsics.checkNotNull(r5);
        ParagraphIntrinsics intrinsics = ParagraphIntrinsicsKt.ParagraphIntrinsics(r2, r3, r4, r5, this.fontFamilyResolver, CollectionsKt.emptyList());
    L11:
        this.paragraphIntrinsics = intrinsics;
        return intrinsics;
    L5:
        if (layoutDirection != this.intrinsicsLayoutDirection) goto L10;
        if (localIntrinsics.getHasStaleResolvedFonts() == true) goto L10;
        intrinsics = localIntrinsics;
        goto L11
    }

    /* JADX INFO: renamed from: layoutText-K40F9xA$foundation_release, reason: not valid java name */
    public final Paragraph m1417layoutTextK40F9xA$foundation_release(long constraints, LayoutDirection layoutDirection) {
        ParagraphIntrinsics localParagraphIntrinsics = setLayoutDirection(layoutDirection);
        return ParagraphKt.m6290ParagraphczeNHc(localParagraphIntrinsics, LayoutUtilsKt.m1395finalConstraintstfFHcEY(constraints, this.softWrap, this.overflow, localParagraphIntrinsics.getMaxIntrinsicWidth()), LayoutUtilsKt.m1396finalMaxLinesxdlQI24(this.softWrap, this.overflow, this.maxLines), this.overflow);
    }

    /* JADX INFO: renamed from: newLayoutWillBeDifferent-K40F9xA, reason: not valid java name */
    private final boolean m1413newLayoutWillBeDifferentK40F9xA(long constraints, LayoutDirection layoutDirection) {
        Paragraph localParagraph = this.paragraph;
        if (localParagraph != null) goto L5;
        return true;
    L5:
        ParagraphIntrinsics localParagraphIntrinsics = this.paragraphIntrinsics;
        if (localParagraphIntrinsics != null) goto L9;
        return true;
    L9:
        if (localParagraphIntrinsics.getHasStaleResolvedFonts() == false) goto L12;
        return true;
    L12:
        if (layoutDirection == this.intrinsicsLayoutDirection) goto L15;
        return true;
    L15:
        if (Constraints.m6919equalsimpl0(constraints, this.prevConstraints) == false) goto L18;
        return false;
    L18:
        if (Constraints.m6926getMaxWidthimpl(constraints) == Constraints.m6926getMaxWidthimpl(this.prevConstraints)) goto L21;
        return true;
    L21:
        if (Constraints.m6928getMinWidthimpl(constraints) == Constraints.m6928getMinWidthimpl(this.prevConstraints)) goto L24;
        return true;
    L24:
        if (Constraints.m6925getMaxHeightimpl(constraints) >= localParagraph.getHeight()) goto L26;
    L29:
        return true;
    L26:
        if (localParagraph.getDidExceedMaxLines() == true) goto L29;
        return false;
    }

    private final void markDirty() {
        this.paragraph = null;
        this.paragraphIntrinsics = null;
        this.intrinsicsLayoutDirection = null;
        this.cachedIntrinsicHeightInputWidth = -1;
        this.cachedIntrinsicHeight = -1;
        this.prevConstraints = Constraints.Companion.m6936fixedJhjzzOo(0, 0);
        this.layoutSize = IntSize.m7139constructorimpl((((long) 0) << 32) | (((long) 0) & 4294967295L));
        this.didOverflow = false;
    }

    public final TextLayoutResult slowCreateTextLayoutResultOrNull(TextStyle style) {
        LayoutDirection localLayoutDirection = this.intrinsicsLayoutDirection;
        if (localLayoutDirection != null) goto L5;
        return null;
    L5:
        Density localDensity = this.density;
        if (localDensity != null) goto L8;
        return null;
    L8:
        AnnotatedString annotatedString = new AnnotatedString(this.text, null, 2, null);
        if (this.paragraph != null) goto L12;
        return null;
    L12:
        if (this.paragraphIntrinsics != null) goto L14;
        return null;
    L14:
        long arg0$iv = this.prevConstraints;
        long finalConstraints = Constraints.m6914constructorimpl(ConstraintsKt.MaxDimensionsAndFocusMask & arg0$iv);
        return new TextLayoutResult(new TextLayoutInput(annotatedString, style, CollectionsKt.emptyList(), this.maxLines, this.softWrap, this.overflow, localDensity, localLayoutDirection, this.fontFamilyResolver, finalConstraints, null), new MultiParagraph(new MultiParagraphIntrinsics(annotatedString, style, CollectionsKt.emptyList(), localDensity, this.fontFamilyResolver), finalConstraints, this.maxLines, this.overflow, null), this.layoutSize, null);
    }

    public final int minIntrinsicWidth(LayoutDirection layoutDirection) {
        return TextDelegateKt.ceilToIntPx(setLayoutDirection(layoutDirection).getMinIntrinsicWidth());
    }

    public final int maxIntrinsicWidth(LayoutDirection layoutDirection) {
        return TextDelegateKt.ceilToIntPx(setLayoutDirection(layoutDirection).getMaxIntrinsicWidth());
    }

    public String toString() {
        StringBuilder r0 = new StringBuilder().append("ParagraphLayoutCache(paragraph=");
        if (this.paragraph == null) goto L5;
        String r1 = "<paragraph>";
    L7:
        return r0.append(r1).append(", lastDensity=").append(InlineDensity.m1392toStringimpl(this.lastDensity)).append(')').toString();
    L5:
        r1 = "null";
        goto L7
    }
}
