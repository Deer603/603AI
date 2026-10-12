package androidx.compose.foundation.text.modifiers;

import androidx.compose.foundation.text.TextAutoSize;
import androidx.compose.foundation.text.TextDelegateKt;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.MultiParagraph;
import androidx.compose.ui.text.MultiParagraphIntrinsics;
import androidx.compose.ui.text.Placeholder;
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
import androidx.compose.ui.unit.TextUnit;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;

/* JADX INFO: compiled from: MultiParagraphLayoutCache.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0092\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0013\b\u0000\u0018\u00002\u00020\u0001:\u0001VBi\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\r\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r\u0012\u0016\b\u0002\u0010\u000f\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u0011\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0014¢\u0006\u0002\u0010\u0015J\u0016\u00107\u001a\u00020\r2\u0006\u00108\u001a\u00020\r2\u0006\u00109\u001a\u00020%J\"\u0010:\u001a\u00020;2\u0006\u0010<\u001a\u00020=2\u0006\u00109\u001a\u00020%H\u0002ø\u0001\u0000¢\u0006\u0004\b>\u0010?J \u0010@\u001a\u00020\u000b2\u0006\u0010<\u001a\u00020=2\u0006\u00109\u001a\u00020%ø\u0001\u0000¢\u0006\u0004\bA\u0010BJ\b\u0010C\u001a\u00020DH\u0002J\b\u0010E\u001a\u00020DH\u0002J\u000e\u0010F\u001a\u00020\r2\u0006\u00109\u001a\u00020%J\u000e\u0010G\u001a\u00020\r2\u0006\u00109\u001a\u00020%J\u0010\u0010H\u001a\u0002022\u0006\u00109\u001a\u00020%H\u0002J*\u00105\u001a\u00020*2\u0006\u00109\u001a\u00020%2\u0006\u0010I\u001a\u00020=2\u0006\u0010J\u001a\u00020;H\u0002ø\u0001\u0000¢\u0006\u0004\bK\u0010LJh\u0010M\u001a\u00020D2\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\r2\u0014\u0010\u000f\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u0011\u0018\u00010\u00102\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014ø\u0001\u0000¢\u0006\u0004\bN\u0010OJ\"\u0010P\u001a\u00020=2\u0006\u0010<\u001a\u00020=2\u0006\u00109\u001a\u00020%H\u0002ø\u0001\u0000¢\u0006\u0004\bQ\u0010RJ(\u0010S\u001a\u00020\u000b*\u0004\u0018\u00010*2\u0006\u0010<\u001a\u00020=2\u0006\u00109\u001a\u00020%H\u0002ø\u0001\u0000¢\u0006\u0004\bT\u0010UR\u0014\u0010\u0016\u001a\b\u0018\u00010\u0017R\u00020\u0000X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0014X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\rX\u0082\u000e¢\u0006\u0002\n\u0000R(\u0010\u001c\u001a\u0004\u0018\u00010\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u001b@@X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u0018\u0010!\u001a\u00060\u0017R\u00020\u00008BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\"\u0010#R\u0010\u0010$\u001a\u0004\u0018\u00010%X\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u0010&\u001a\u00020'X\u0082\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\n\u0002\u0010(R\u0010\u0010)\u001a\u0004\u0018\u00010*X\u0082\u000e¢\u0006\u0002\n\u0000R\u0013\u0010+\u001a\u0004\u0018\u00010*8F¢\u0006\u0006\u001a\u0004\b,\u0010-R\u0010\u0010.\u001a\u0004\u0018\u00010/X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\b\u001a\u00020\tX\u0082\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\n\u0002\u00100R\u0010\u00101\u001a\u0004\u0018\u000102X\u0082\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\u000f\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u0011\u0018\u00010\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u001a\u001a\u00020\u0005@BX\u0082\u000e¢\u0006\b\n\u0000\"\u0004\b3\u00104R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u000e¢\u0006\u0002\n\u0000R\u0011\u00105\u001a\u00020*8F¢\u0006\u0006\u001a\u0004\b6\u0010-\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006W"}, d2 = {"Landroidx/compose/foundation/text/modifiers/MultiParagraphLayoutCache;", "", "text", "Landroidx/compose/ui/text/AnnotatedString;", "style", "Landroidx/compose/ui/text/TextStyle;", "fontFamilyResolver", "Landroidx/compose/ui/text/font/FontFamily$Resolver;", "overflow", "Landroidx/compose/ui/text/style/TextOverflow;", "softWrap", "", "maxLines", "", "minLines", "placeholders", "", "Landroidx/compose/ui/text/AnnotatedString$Range;", "Landroidx/compose/ui/text/Placeholder;", "autoSize", "Landroidx/compose/foundation/text/TextAutoSize;", "(Landroidx/compose/ui/text/AnnotatedString;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/font/FontFamily$Resolver;IZIILjava/util/List;Landroidx/compose/foundation/text/TextAutoSize;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "_textAutoSizeLayoutScope", "Landroidx/compose/foundation/text/modifiers/MultiParagraphLayoutCache$TextAutoSizeLayoutScopeImpl;", "cachedIntrinsicHeight", "cachedIntrinsicHeightInputWidth", "value", "Landroidx/compose/ui/unit/Density;", "density", "getDensity$foundation_release", "()Landroidx/compose/ui/unit/Density;", "setDensity$foundation_release", "(Landroidx/compose/ui/unit/Density;)V", "fontSizeSearchScope", "getFontSizeSearchScope", "()Landroidx/compose/foundation/text/modifiers/MultiParagraphLayoutCache$TextAutoSizeLayoutScopeImpl;", "intrinsicsLayoutDirection", "Landroidx/compose/ui/unit/LayoutDirection;", "lastDensity", "Landroidx/compose/foundation/text/modifiers/InlineDensity;", "J", "layoutCache", "Landroidx/compose/ui/text/TextLayoutResult;", "layoutOrNull", "getLayoutOrNull", "()Landroidx/compose/ui/text/TextLayoutResult;", "mMinLinesConstrainer", "Landroidx/compose/foundation/text/modifiers/MinLinesConstrainer;", "I", "paragraphIntrinsics", "Landroidx/compose/ui/text/MultiParagraphIntrinsics;", "setStyle", "(Landroidx/compose/ui/text/TextStyle;)V", "textLayoutResult", "getTextLayoutResult", "intrinsicHeight", "width", "layoutDirection", "layoutText", "Landroidx/compose/ui/text/MultiParagraph;", "constraints", "Landroidx/compose/ui/unit/Constraints;", "layoutText-K40F9xA", "(JLandroidx/compose/ui/unit/LayoutDirection;)Landroidx/compose/ui/text/MultiParagraph;", "layoutWithConstraints", "layoutWithConstraints-K40F9xA", "(JLandroidx/compose/ui/unit/LayoutDirection;)Z", "markDirty", "", "markStyleAffectedDirty", "maxIntrinsicWidth", "minIntrinsicWidth", "setLayoutDirection", "finalConstraints", "multiParagraph", "textLayoutResult-VKLhPVY", "(Landroidx/compose/ui/unit/LayoutDirection;JLandroidx/compose/ui/text/MultiParagraph;)Landroidx/compose/ui/text/TextLayoutResult;", "update", "update-J2qo7bo", "(Landroidx/compose/ui/text/AnnotatedString;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/font/FontFamily$Resolver;IZIILjava/util/List;Landroidx/compose/foundation/text/TextAutoSize;)V", "useMinLinesConstrainer", "useMinLinesConstrainer-Oh53vG4", "(JLandroidx/compose/ui/unit/LayoutDirection;)J", "newLayoutWillBeDifferent", "newLayoutWillBeDifferent-VKLhPVY", "(Landroidx/compose/ui/text/TextLayoutResult;JLandroidx/compose/ui/unit/LayoutDirection;)Z", "TextAutoSizeLayoutScopeImpl", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class MultiParagraphLayoutCache {
    public static final int $stable = 0;
    private TextAutoSizeLayoutScopeImpl _textAutoSizeLayoutScope;
    private TextAutoSize autoSize;
    private int cachedIntrinsicHeight;
    private int cachedIntrinsicHeightInputWidth;
    private Density density;
    private FontFamily.Resolver fontFamilyResolver;
    private LayoutDirection intrinsicsLayoutDirection;
    private long lastDensity;
    private TextLayoutResult layoutCache;
    private MinLinesConstrainer mMinLinesConstrainer;
    private int maxLines;
    private int minLines;
    private int overflow;
    private MultiParagraphIntrinsics paragraphIntrinsics;
    private List<AnnotatedString.Range<Placeholder>> placeholders;
    private boolean softWrap;
    private TextStyle style;
    private AnnotatedString text;

    /* JADX INFO: compiled from: MultiParagraphLayoutCache.kt */
    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J*\u0010\u000e\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0016ø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0016J\u0016\u0010\u0017\u001a\u00020\u0004*\u00020\u0014H\u0016ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0003\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\u0006R\"\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\u0010\t\u001a\u0004\u0018\u00010\n@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u001a"}, d2 = {"Landroidx/compose/foundation/text/modifiers/MultiParagraphLayoutCache$TextAutoSizeLayoutScopeImpl;", "Landroidx/compose/foundation/text/modifiers/TextAutoSizeLayoutScope;", "(Landroidx/compose/foundation/text/modifiers/MultiParagraphLayoutCache;)V", "density", "", "getDensity", "()F", "fontScale", "getFontScale", "<set-?>", "Landroidx/compose/ui/text/TextLayoutResult;", "lastLayoutResult", "getLastLayoutResult", "()Landroidx/compose/ui/text/TextLayoutResult;", "performLayout", "constraints", "Landroidx/compose/ui/unit/Constraints;", "text", "Landroidx/compose/ui/text/AnnotatedString;", "fontSize", "Landroidx/compose/ui/unit/TextUnit;", "performLayout-5ZSfY2I", "(JLandroidx/compose/ui/text/AnnotatedString;J)Landroidx/compose/ui/text/TextLayoutResult;", "toPx", "toPx--R2X_6o", "(J)F", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    private final class TextAutoSizeLayoutScopeImpl implements TextAutoSizeLayoutScope {
        private TextLayoutResult lastLayoutResult;
        final /* synthetic */ MultiParagraphLayoutCache this$0;

        public TextAutoSizeLayoutScopeImpl(MultiParagraphLayoutCache this$0) {
            this.this$0 = this$0;
        }

        @Override // androidx.compose.ui.unit.Density
        public float getDensity() {
            Density r0 = this.this$0.getDensity$foundation_release();
            Intrinsics.checkNotNull(r0);
            return r0.getDensity();
        }

        @Override // androidx.compose.ui.unit.FontScaling
        public float getFontScale() {
            Density r0 = this.this$0.getDensity$foundation_release();
            Intrinsics.checkNotNull(r0);
            return r0.getFontScale();
        }

        public final TextLayoutResult getLastLayoutResult() {
            return this.lastLayoutResult;
        }

        @Override // androidx.compose.foundation.text.modifiers.TextAutoSizeLayoutScope
        /* JADX INFO: renamed from: performLayout-5ZSfY2I, reason: not valid java name */
        public TextLayoutResult mo1410performLayout5ZSfY2I(long constraints, AnnotatedString text, long fontSize) {
            TextStyle styleBeforeLayout = MultiParagraphLayoutCache.access$getStyle$p(this.this$0);
            if (TextUnit.m7169isEmimpl(fontSize) == false) goto L5;
            long r2 = MultiParagraphLayoutCacheKt.m1411access$timesNB67dxo(MultiParagraphLayoutCache.access$getStyle$p(this.this$0).m6448getFontSizeXSAIIZE(), fontSize);
        L6:
            long scaledFontSize = r2;
            if (TextUnit.m7164equalsimpl0(scaledFontSize, MultiParagraphLayoutCache.access$getStyle$p(this.this$0).m6448getFontSizeXSAIIZE()) == true) goto L10;
            MultiParagraphLayoutCache.access$setStyle(this.this$0, TextStyle.m6430copyp1EtxEg$default(MultiParagraphLayoutCache.access$getStyle$p(this.this$0), 0, scaledFontSize, null, null, null, null, null, 0, null, null, null, 0, null, null, null, 0, 0, 0, null, null, null, 0, 0, null, 16777213, null));
        L10:
            if (MultiParagraphLayoutCache.access$getMinLines$p(this.this$0) <= 1) goto L12;
            MultiParagraphLayoutCache r3 = this.this$0;
            LayoutDirection r4 = MultiParagraphLayoutCache.access$getIntrinsicsLayoutDirection$p(this.this$0);
            Intrinsics.checkNotNull(r4);
            long layoutConstraints = MultiParagraphLayoutCache.m1403access$useMinLinesConstrainerOh53vG4(r3, constraints, r4);
        L13:
            MultiParagraphLayoutCache r8 = this.this$0;
            LayoutDirection r11 = MultiParagraphLayoutCache.access$getIntrinsicsLayoutDirection$p(this.this$0);
            Intrinsics.checkNotNull(r11);
            MultiParagraph multiParagraph = MultiParagraphLayoutCache.m1401access$layoutTextK40F9xA(r8, layoutConstraints, r11);
            MultiParagraphLayoutCache r12 = this.this$0;
            LayoutDirection r13 = MultiParagraphLayoutCache.access$getIntrinsicsLayoutDirection$p(this.this$0);
            Intrinsics.checkNotNull(r13);
            TextLayoutResult layoutResult = MultiParagraphLayoutCache.m1402access$textLayoutResultVKLhPVY(r12, r13, layoutConstraints, multiParagraph);
            this.lastLayoutResult = layoutResult;
            MultiParagraphLayoutCache.access$setStyle(this.this$0, styleBeforeLayout);
            return layoutResult;
        L12:
            layoutConstraints = constraints;
            goto L13
        L5:
            r2 = fontSize;
            goto L6
        }

        @Override // androidx.compose.ui.unit.Density
        /* JADX INFO: renamed from: toPx--R2X_6o */
        public float mo375toPxR2X_6o(long $this$toPx_u2d_u2dR2X_6o) {
            if (TextUnit.m7169isEmimpl($this$toPx_u2d_u2dR2X_6o) == false) goto L15;
            if (TextUnit.m7169isEmimpl(MultiParagraphLayoutCache.access$getStyle$p(this.this$0).m6448getFontSizeXSAIIZE()) == true) goto L13;
            if (TextUnit.m7164equalsimpl0(MultiParagraphLayoutCache.access$getStyle$p(this.this$0).m6448getFontSizeXSAIIZE(), TextUnit.Companion.m7178getUnspecifiedXSAIIZE()) == true) goto L11;
            return mo375toPxR2X_6o(MultiParagraphLayoutCache.access$getStyle$p(this.this$0).m6448getFontSizeXSAIIZE()) * TextUnit.m7167getValueimpl($this$toPx_u2d_u2dR2X_6o);
        L11:
            throw new IllegalStateException("InternalAutoSize -> toPx(): Cannot convert Em to Px when style.fontSize is not set. Please specify a font size.".toString());
        L13:
            throw new IllegalStateException("InternalAutoSize -> toPx(): Cannot convert Em to Px when style.fontSize is Em\nDeclare the composable's style.fontSize with Sp units instead.".toString());
        L15:
            return mo376toPx0680j_4(mo371toDpGaN1DYA($this$toPx_u2d_u2dR2X_6o));
        }
    }

    static {
        $stable = 8;
    }

    public /* synthetic */ MultiParagraphLayoutCache(AnnotatedString r1, TextStyle r2, FontFamily.Resolver r3, int r4, boolean r5, int r6, int r7, List r8, TextAutoSize r9, DefaultConstructorMarker r10) {
        this(r1, r2, r3, r4, r5, r6, r7, r8, r9);
    }

    private MultiParagraphLayoutCache(AnnotatedString text, TextStyle style, FontFamily.Resolver fontFamilyResolver, int overflow, boolean softWrap, int maxLines, int minLines, List<AnnotatedString.Range<Placeholder>> r10, TextAutoSize autoSize) {
        this.text = text;
        this.fontFamilyResolver = fontFamilyResolver;
        this.overflow = overflow;
        this.softWrap = softWrap;
        this.maxLines = maxLines;
        this.minLines = minLines;
        this.placeholders = r10;
        this.autoSize = autoSize;
        this.lastDensity = InlineDensity.Companion.m1394getUnspecifiedL26CHvs();
        this.style = style;
        this.cachedIntrinsicHeightInputWidth = -1;
        this.cachedIntrinsicHeight = -1;
    }

    public /* synthetic */ MultiParagraphLayoutCache(AnnotatedString r14, TextStyle r15, FontFamily.Resolver r16, int r17, boolean r18, int r19, int r20, List r21, TextAutoSize r22, int r23, DefaultConstructorMarker r24) {
        if ((r23 & 8) == 0) goto L5;
        int r6 = TextOverflow.Companion.m6886getClipgIe3tQ8();
    L7:
        if ((r23 & 16) == 0) goto L9;
        boolean r7 = true;
    L11:
        if ((r23 & 32) == 0) goto L13;
        int r8 = Integer.MAX_VALUE;
    L15:
        if ((r23 & 64) == 0) goto L17;
        int r9 = 1;
    L19:
        if ((r23 & 128) == 0) goto L21;
        List r10 = null;
    L23:
        if ((r23 & 256) == 0) goto L25;
        TextAutoSize r11 = null;
    L26:
        this(r14, r15, r16, r6, r7, r8, r9, r10, r11, null);
        return;
    L25:
        r11 = r22;
        goto L26
    L21:
        r10 = r21;
        goto L23
    L17:
        r9 = r20;
        goto L19
    L13:
        r8 = r19;
        goto L15
    L9:
        r7 = r18;
        goto L11
    L5:
        r6 = r17;
        goto L7
    }

    public static final /* synthetic */ LayoutDirection access$getIntrinsicsLayoutDirection$p(MultiParagraphLayoutCache $this) {
        return $this.intrinsicsLayoutDirection;
    }

    public static final /* synthetic */ int access$getMinLines$p(MultiParagraphLayoutCache $this) {
        return $this.minLines;
    }

    public static final /* synthetic */ TextStyle access$getStyle$p(MultiParagraphLayoutCache $this) {
        return $this.style;
    }

    /* JADX INFO: renamed from: access$layoutText-K40F9xA, reason: not valid java name */
    public static final /* synthetic */ MultiParagraph m1401access$layoutTextK40F9xA(MultiParagraphLayoutCache $this, long constraints, LayoutDirection layoutDirection) {
        return $this.m1404layoutTextK40F9xA(constraints, layoutDirection);
    }

    public static final /* synthetic */ void access$setStyle(MultiParagraphLayoutCache $this, TextStyle value) {
        $this.setStyle(value);
    }

    /* JADX INFO: renamed from: access$textLayoutResult-VKLhPVY, reason: not valid java name */
    public static final /* synthetic */ TextLayoutResult m1402access$textLayoutResultVKLhPVY(MultiParagraphLayoutCache $this, LayoutDirection layoutDirection, long finalConstraints, MultiParagraph multiParagraph) {
        return $this.m1406textLayoutResultVKLhPVY(layoutDirection, finalConstraints, multiParagraph);
    }

    /* JADX INFO: renamed from: access$useMinLinesConstrainer-Oh53vG4, reason: not valid java name */
    public static final /* synthetic */ long m1403access$useMinLinesConstrainerOh53vG4(MultiParagraphLayoutCache $this, long constraints, LayoutDirection layoutDirection) {
        return $this.m1407useMinLinesConstrainerOh53vG4(constraints, layoutDirection);
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

    private final void setStyle(TextStyle value) {
        boolean newStyleHasSameLayoutAffectingAttrs = value.hasSameLayoutAffectingAttributes(this.style);
        this.style = value;
        if (newStyleHasSameLayoutAffectingAttrs == true) goto L6;
        markStyleAffectedDirty();
        return;
    }

    private final TextAutoSizeLayoutScopeImpl getFontSizeSearchScope() {
        if (this._textAutoSizeLayoutScope != null) goto L5;
        this._textAutoSizeLayoutScope = new TextAutoSizeLayoutScopeImpl(this);
    L5:
        TextAutoSizeLayoutScopeImpl r0 = this._textAutoSizeLayoutScope;
        Intrinsics.checkNotNull(r0);
        return r0;
    }

    public final TextLayoutResult getTextLayoutResult() {
        TextLayoutResult r0 = this.layoutCache;
        if (r0 == null) goto L6;
        return r0;
    L6:
        throw new IllegalStateException("You must call layoutWithConstraints first");
    }

    public final TextLayoutResult getLayoutOrNull() {
        return this.layoutCache;
    }

    /* JADX INFO: renamed from: layoutWithConstraints-K40F9xA, reason: not valid java name */
    public final boolean m1408layoutWithConstraintsK40F9xA(long constraints, LayoutDirection layoutDirection) {
        if (this.minLines <= 1) goto L5;
        long finalConstraints = m1407useMinLinesConstrainerOh53vG4(constraints, layoutDirection);
    L7:
        if (m1405newLayoutWillBeDifferentVKLhPVY(this.layoutCache, finalConstraints, layoutDirection) == true) goto L15;
        TextLayoutResult r2 = this.layoutCache;
        Intrinsics.checkNotNull(r2);
        if (Constraints.m6919equalsimpl0(finalConstraints, r2.getLayoutInput().m6383getConstraintsmsEJaDk()) == false) goto L12;
        return false;
    L12:
        TextLayoutResult r3 = this.layoutCache;
        Intrinsics.checkNotNull(r3);
        this.layoutCache = m1406textLayoutResultVKLhPVY(layoutDirection, finalConstraints, r3.getMultiParagraph());
        return true;
    L15:
        if (this.autoSize == null) goto L29;
        this.intrinsicsLayoutDirection = layoutDirection;
        long fontSizeBeforeLayout = this.style.m6448getFontSizeXSAIIZE();
        TextAutoSize $this$layoutWithConstraints_K40F9xA_u24lambda_u242 = this.autoSize;
        Intrinsics.checkNotNull($this$layoutWithConstraints_K40F9xA_u24lambda_u242);
        TextAutoSizeLayoutScopeImpl $this$layoutWithConstraints_K40F9xA_u24lambda_u242_u24lambda_u241 = getFontSizeSearchScope();
        long autoSizeFontSize = $this$layoutWithConstraints_K40F9xA_u24lambda_u242.mo1022getFontSizeCi0_558($this$layoutWithConstraints_K40F9xA_u24lambda_u242_u24lambda_u241, constraints, this.text);
        if (TextUnit.m7169isEmimpl(autoSizeFontSize) == false) goto L19;
        autoSizeFontSize = MultiParagraphLayoutCacheKt.m1411access$timesNB67dxo(fontSizeBeforeLayout, autoSizeFontSize);
    L19:
        TextLayoutResult autoSizeLayoutCache = getFontSizeSearchScope().getLastLayoutResult();
        if (autoSizeLayoutCache != null) goto L22;
    L27:
        long optimalFontSize = autoSizeFontSize;
        setStyle(TextStyle.m6430copyp1EtxEg$default(this.style, 0, optimalFontSize, null, null, null, null, null, 0, null, null, null, 0, null, null, null, 0, 0, 0, null, null, null, 0, 0, null, 16777213, null));
        goto L29
    L22:
        if (TextUnit.m7164equalsimpl0(autoSizeFontSize, autoSizeLayoutCache.getLayoutInput().getStyle().m6448getFontSizeXSAIIZE()) == false) goto L27;
        if (TextOverflow.m6877equalsimpl0(autoSizeLayoutCache.getLayoutInput().m6384getOverflowgIe3tQ8(), this.overflow) == false) goto L27;
        this.layoutCache = autoSizeLayoutCache;
        return true;
    L29:
        MultiParagraph multiParagraph = m1404layoutTextK40F9xA(finalConstraints, layoutDirection);
        this.layoutCache = m1406textLayoutResultVKLhPVY(layoutDirection, finalConstraints, multiParagraph);
        return true;
    L5:
        finalConstraints = constraints;
        goto L7
    }

    /* JADX INFO: renamed from: useMinLinesConstrainer-Oh53vG4, reason: not valid java name */
    private final long m1407useMinLinesConstrainerOh53vG4(long constraints, LayoutDirection layoutDirection) {
        MinLinesConstrainer.Companion r0 = MinLinesConstrainer.Companion;
        MinLinesConstrainer r1 = this.mMinLinesConstrainer;
        TextStyle r3 = this.style;
        Density r4 = this.density;
        Intrinsics.checkNotNull(r4);
        MinLinesConstrainer localMin = r0.from(r1, layoutDirection, r3, r4, this.fontFamilyResolver);
        this.mMinLinesConstrainer = localMin;
        return localMin.m1399coerceMinLinesOh53vG4$foundation_release(constraints, this.minLines);
    }

    /* JADX INFO: renamed from: textLayoutResult-VKLhPVY, reason: not valid java name */
    private final TextLayoutResult m1406textLayoutResultVKLhPVY(LayoutDirection layoutDirection, long finalConstraints, MultiParagraph multiParagraph) {
        float layoutWidth = Math.min(multiParagraph.getIntrinsics().getMaxIntrinsicWidth(), multiParagraph.getWidth());
        AnnotatedString r4 = this.text;
        TextStyle r5 = this.style;
        List<AnnotatedString.Range<Placeholder>> r6 = this.placeholders;
        if (r6 != null) goto L5;
        r6 = CollectionsKt.emptyList();
    L5:
        int r7 = this.maxLines;
        boolean r8 = this.softWrap;
        int r9 = this.overflow;
        Density r10 = this.density;
        Intrinsics.checkNotNull(r10);
        TextLayoutInput r3 = new TextLayoutInput(r4, r5, r6, r7, r8, r9, r10, layoutDirection, this.fontFamilyResolver, finalConstraints, null);
        int width$iv = TextDelegateKt.ceilToIntPx(layoutWidth);
        int height$iv = TextDelegateKt.ceilToIntPx(multiParagraph.getHeight());
        return new TextLayoutResult(r3, multiParagraph, ConstraintsKt.m6940constrain4WqzIAM(finalConstraints, IntSize.m7139constructorimpl((((long) width$iv) << 32) | (((long) height$iv) & 4294967295L))), null);
    }

    public final int intrinsicHeight(int width, LayoutDirection layoutDirection) {
        int localWidth = this.cachedIntrinsicHeightInputWidth;
        int localHeght = this.cachedIntrinsicHeight;
        if (width == localWidth) goto L5;
    L7:
        long constraints = ConstraintsKt.Constraints(0, width, 0, Integer.MAX_VALUE);
        if (this.minLines <= 1) goto L10;
        long finalConstraints = m1407useMinLinesConstrainerOh53vG4(constraints, layoutDirection);
    L11:
        int result = RangesKt.coerceAtLeast(TextDelegateKt.ceilToIntPx(m1404layoutTextK40F9xA(finalConstraints, layoutDirection).getHeight()), Constraints.m6927getMinHeightimpl(finalConstraints));
        this.cachedIntrinsicHeightInputWidth = width;
        this.cachedIntrinsicHeight = result;
        return result;
    L10:
        finalConstraints = constraints;
        goto L11
    L5:
        if (localWidth == (-1)) goto L7;
        return localHeght;
    }

    /* JADX INFO: renamed from: update-J2qo7bo, reason: not valid java name */
    public final void m1409updateJ2qo7bo(AnnotatedString text, TextStyle style, FontFamily.Resolver fontFamilyResolver, int overflow, boolean softWrap, int maxLines, int minLines, List<AnnotatedString.Range<Placeholder>> r8, TextAutoSize autoSize) {
        this.text = text;
        setStyle(style);
        this.fontFamilyResolver = fontFamilyResolver;
        this.overflow = overflow;
        this.softWrap = softWrap;
        this.maxLines = maxLines;
        this.minLines = minLines;
        this.placeholders = r8;
        this.autoSize = autoSize;
        markDirty();
    }

    private final MultiParagraphIntrinsics setLayoutDirection(LayoutDirection layoutDirection) {
        MultiParagraphIntrinsics localIntrinsics = this.paragraphIntrinsics;
        if (localIntrinsics != null) goto L5;
    L10:
        this.intrinsicsLayoutDirection = layoutDirection;
        AnnotatedString r3 = this.text;
        TextStyle r4 = TextStyleKt.resolveDefaults(this.style, layoutDirection);
        Density r6 = this.density;
        Intrinsics.checkNotNull(r6);
        FontFamily.Resolver r7 = this.fontFamilyResolver;
        List<AnnotatedString.Range<Placeholder>> r1 = this.placeholders;
        if (r1 != null) goto L13;
        r1 = CollectionsKt.emptyList();
    L13:
        MultiParagraphIntrinsics intrinsics = new MultiParagraphIntrinsics(r3, r4, r1, r6, r7);
    L14:
        this.paragraphIntrinsics = intrinsics;
        return intrinsics;
    L5:
        if (layoutDirection != this.intrinsicsLayoutDirection) goto L10;
        if (localIntrinsics.getHasStaleResolvedFonts() == true) goto L10;
        intrinsics = localIntrinsics;
        goto L14
    }

    /* JADX INFO: renamed from: layoutText-K40F9xA, reason: not valid java name */
    private final MultiParagraph m1404layoutTextK40F9xA(long constraints, LayoutDirection layoutDirection) {
        MultiParagraphIntrinsics localParagraphIntrinsics = setLayoutDirection(layoutDirection);
        return new MultiParagraph(localParagraphIntrinsics, LayoutUtilsKt.m1395finalConstraintstfFHcEY(constraints, this.softWrap, this.overflow, localParagraphIntrinsics.getMaxIntrinsicWidth()), LayoutUtilsKt.m1396finalMaxLinesxdlQI24(this.softWrap, this.overflow, this.maxLines), this.overflow, null);
    }

    /* JADX INFO: renamed from: newLayoutWillBeDifferent-VKLhPVY, reason: not valid java name */
    private final boolean m1405newLayoutWillBeDifferentVKLhPVY(TextLayoutResult $this$newLayoutWillBeDifferent_u2dVKLhPVY, long constraints, LayoutDirection layoutDirection) {
        if ($this$newLayoutWillBeDifferent_u2dVKLhPVY != null) goto L6;
        return true;
    L6:
        if ($this$newLayoutWillBeDifferent_u2dVKLhPVY.getMultiParagraph().getIntrinsics().getHasStaleResolvedFonts() == false) goto L9;
        return true;
    L9:
        if (layoutDirection == $this$newLayoutWillBeDifferent_u2dVKLhPVY.getLayoutInput().getLayoutDirection()) goto L12;
        return true;
    L12:
        if (Constraints.m6919equalsimpl0(constraints, $this$newLayoutWillBeDifferent_u2dVKLhPVY.getLayoutInput().m6383getConstraintsmsEJaDk()) == false) goto L15;
        return false;
    L15:
        if (Constraints.m6926getMaxWidthimpl(constraints) == Constraints.m6926getMaxWidthimpl($this$newLayoutWillBeDifferent_u2dVKLhPVY.getLayoutInput().m6383getConstraintsmsEJaDk())) goto L18;
        return true;
    L18:
        if (Constraints.m6928getMinWidthimpl(constraints) == Constraints.m6928getMinWidthimpl($this$newLayoutWillBeDifferent_u2dVKLhPVY.getLayoutInput().m6383getConstraintsmsEJaDk())) goto L21;
        return true;
    L21:
        if (Constraints.m6925getMaxHeightimpl(constraints) >= $this$newLayoutWillBeDifferent_u2dVKLhPVY.getMultiParagraph().getHeight()) goto L23;
    L26:
        return true;
    L23:
        if ($this$newLayoutWillBeDifferent_u2dVKLhPVY.getMultiParagraph().getDidExceedMaxLines() == true) goto L26;
        return false;
    }

    private final void markDirty() {
        this.paragraphIntrinsics = null;
        this.layoutCache = null;
        this.cachedIntrinsicHeight = -1;
        this.cachedIntrinsicHeightInputWidth = -1;
        this._textAutoSizeLayoutScope = null;
    }

    private final void markStyleAffectedDirty() {
        this.paragraphIntrinsics = null;
        this.layoutCache = null;
        this.cachedIntrinsicHeight = -1;
        this.cachedIntrinsicHeightInputWidth = -1;
    }

    public final int maxIntrinsicWidth(LayoutDirection layoutDirection) {
        return TextDelegateKt.ceilToIntPx(setLayoutDirection(layoutDirection).getMaxIntrinsicWidth());
    }

    public final int minIntrinsicWidth(LayoutDirection layoutDirection) {
        return TextDelegateKt.ceilToIntPx(setLayoutDirection(layoutDirection).getMinIntrinsicWidth());
    }
}
