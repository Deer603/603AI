package androidx.compose.ui.text;

import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.graphics.AndroidPath_androidKt;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import androidx.compose.ui.text.font.DelegatingFontLoaderForDeprecatedUsage_androidKt;
import androidx.compose.ui.text.font.Font;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.internal.InlineClassHelperKt;
import androidx.compose.ui.text.platform.AndroidMultiParagraphDraw_androidKt;
import androidx.compose.ui.text.style.ResolvedTextDirection;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextOverflow;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.Density;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Ref;
import kotlin.ranges.RangesKt;

/* JADX INFO: compiled from: MultiParagraph.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000Þ\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B+\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nB+\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\f¢\u0006\u0002\u0010\rBY\b\u0017\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\u0014\b\u0002\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\u00140\u0013\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\u0016\u001a\u00020\u0017\u0012\u0006\u0010\u0018\u001a\u00020\u0019¢\u0006\u0002\u0010\u001aBY\b\u0017\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\u0016\u001a\u00020\u0017\u0012\u0006\u0010\u001b\u001a\u00020\u001c\u0012\u0014\b\u0002\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\u00140\u0013\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\u001dBY\b\u0017\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0016\u001a\u00020\u0017\u0012\u0006\u0010\u001b\u001a\u00020\u001c\u0012\u0014\b\u0002\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\u00140\u0013\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\u001eBY\b\u0016\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0016\u001a\u00020\u0017\u0012\u0006\u0010\u001b\u001a\u00020\u001c\u0012\u0014\b\u0002\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\u00140\u0013\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u001f\u001a\u00020 ¢\u0006\u0002\u0010!B)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u001f\u001a\u00020 ¢\u0006\u0002\u0010\"J*\u0010A\u001a\u00020B2\u0006\u0010C\u001a\u00020D2\u0006\u0010E\u001a\u00020B2\b\b\u0001\u0010F\u001a\u00020\u0007ø\u0001\u0000¢\u0006\u0004\bG\u0010HJ\u000e\u0010I\u001a\u00020J2\u0006\u0010K\u001a\u00020\u0007J\u000e\u0010L\u001a\u00020>2\u0006\u0010K\u001a\u00020\u0007J\u000e\u0010M\u001a\u00020>2\u0006\u0010K\u001a\u00020\u0007J\u0016\u0010N\u001a\u00020\f2\u0006\u0010K\u001a\u00020\u00072\u0006\u0010O\u001a\u00020\tJ\u000e\u0010P\u001a\u00020\f2\u0006\u0010Q\u001a\u00020\u0007J\u000e\u0010R\u001a\u00020\f2\u0006\u0010Q\u001a\u00020\u0007J\u0018\u0010S\u001a\u00020\u00072\u0006\u0010Q\u001a\u00020\u00072\b\b\u0002\u0010T\u001a\u00020\tJ\u000e\u0010U\u001a\u00020\u00072\u0006\u0010K\u001a\u00020\u0007J\u000e\u0010V\u001a\u00020\u00072\u0006\u0010W\u001a\u00020\fJ\u000e\u0010X\u001a\u00020\f2\u0006\u0010Q\u001a\u00020\u0007J\u000e\u0010Y\u001a\u00020\f2\u0006\u0010Q\u001a\u00020\u0007J\u000e\u0010Z\u001a\u00020\f2\u0006\u0010Q\u001a\u00020\u0007J\u000e\u0010[\u001a\u00020\u00072\u0006\u0010Q\u001a\u00020\u0007J\u000e\u0010\\\u001a\u00020\f2\u0006\u0010Q\u001a\u00020\u0007J\u000e\u0010]\u001a\u00020\f2\u0006\u0010Q\u001a\u00020\u0007J\u0018\u0010^\u001a\u00020\u00072\u0006\u0010_\u001a\u00020`ø\u0001\u0000¢\u0006\u0004\ba\u0010bJ\u000e\u0010c\u001a\u00020J2\u0006\u0010K\u001a\u00020\u0007J\u0016\u0010d\u001a\u00020e2\u0006\u0010f\u001a\u00020\u00072\u0006\u0010g\u001a\u00020\u0007J(\u0010h\u001a\u00020D2\u0006\u0010i\u001a\u00020>2\u0006\u0010j\u001a\u00020k2\u0006\u0010l\u001a\u00020mø\u0001\u0000¢\u0006\u0004\bn\u0010oJ\u001b\u0010p\u001a\u00020D2\u0006\u0010K\u001a\u00020\u0007ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\bq\u0010rJ\u000e\u0010s\u001a\u00020\t2\u0006\u0010Q\u001a\u00020\u0007J]\u0010t\u001a\u00020u2\u0006\u0010v\u001a\u00020w2\u0006\u0010x\u001a\u00020y2\b\b\u0002\u0010z\u001a\u00020\f2\n\b\u0002\u0010{\u001a\u0004\u0018\u00010|2\n\b\u0002\u0010}\u001a\u0004\u0018\u00010~2\u000b\b\u0002\u0010\u007f\u001a\u0005\u0018\u00010\u0080\u00012\n\b\u0002\u0010\u0081\u0001\u001a\u00030\u0082\u0001ø\u0001\u0000¢\u0006\u0006\b\u0083\u0001\u0010\u0084\u0001J@\u0010t\u001a\u00020u2\u0006\u0010v\u001a\u00020w2\n\b\u0002\u0010\u0085\u0001\u001a\u00030\u0086\u00012\n\b\u0002\u0010{\u001a\u0004\u0018\u00010|2\n\b\u0002\u0010}\u001a\u0004\u0018\u00010~H\u0007ø\u0001\u0000¢\u0006\u0006\b\u0087\u0001\u0010\u0088\u0001JW\u0010t\u001a\u00020u2\u0006\u0010v\u001a\u00020w2\n\b\u0002\u0010\u0085\u0001\u001a\u00030\u0086\u00012\n\b\u0002\u0010{\u001a\u0004\u0018\u00010|2\n\b\u0002\u0010}\u001a\u0004\u0018\u00010~2\u000b\b\u0002\u0010\u007f\u001a\u0005\u0018\u00010\u0080\u00012\n\b\u0002\u0010\u0081\u0001\u001a\u00030\u0082\u0001ø\u0001\u0000¢\u0006\u0006\b\u0089\u0001\u0010\u008a\u0001J\u0011\u0010\u008b\u0001\u001a\u00020u2\u0006\u0010K\u001a\u00020\u0007H\u0002J\u0011\u0010\u008c\u0001\u001a\u00020u2\u0006\u0010K\u001a\u00020\u0007H\u0002J\u0011\u0010\u008d\u0001\u001a\u00020u2\u0006\u0010Q\u001a\u00020\u0007H\u0002R\u0014\u0010\u000e\u001a\u00020\u000f8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b#\u0010$R\u0011\u0010%\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b&\u0010'R\u0011\u0010(\u001a\u00020\f8F¢\u0006\u0006\u001a\u0004\b)\u0010*R\u0011\u0010+\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b,\u0010*R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b-\u0010.R\u0011\u0010/\u001a\u00020\f8F¢\u0006\u0006\u001a\u0004\b0\u0010*R\u0011\u00101\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b2\u00103R\u0011\u00104\u001a\u00020\f8F¢\u0006\u0006\u001a\u0004\b5\u0010*R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b6\u00103R\u0011\u00107\u001a\u00020\f8F¢\u0006\u0006\u001a\u0004\b8\u0010*R\u001a\u00109\u001a\b\u0012\u0004\u0012\u00020:0\u0013X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b;\u0010<R\u0019\u0010=\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010>0\u0013¢\u0006\b\n\u0000\u001a\u0004\b?\u0010<R\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b@\u0010*\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u008e\u0001"}, d2 = {"Landroidx/compose/ui/text/MultiParagraph;", "", "intrinsics", "Landroidx/compose/ui/text/MultiParagraphIntrinsics;", "constraints", "Landroidx/compose/ui/unit/Constraints;", "maxLines", "", "ellipsis", "", "(Landroidx/compose/ui/text/MultiParagraphIntrinsics;JIZLkotlin/jvm/internal/DefaultConstructorMarker;)V", "width", "", "(Landroidx/compose/ui/text/MultiParagraphIntrinsics;IZF)V", "annotatedString", "Landroidx/compose/ui/text/AnnotatedString;", "style", "Landroidx/compose/ui/text/TextStyle;", "placeholders", "", "Landroidx/compose/ui/text/AnnotatedString$Range;", "Landroidx/compose/ui/text/Placeholder;", "density", "Landroidx/compose/ui/unit/Density;", "resourceLoader", "Landroidx/compose/ui/text/font/Font$ResourceLoader;", "(Landroidx/compose/ui/text/AnnotatedString;Landroidx/compose/ui/text/TextStyle;Ljava/util/List;IZFLandroidx/compose/ui/unit/Density;Landroidx/compose/ui/text/font/Font$ResourceLoader;)V", "fontFamilyResolver", "Landroidx/compose/ui/text/font/FontFamily$Resolver;", "(Landroidx/compose/ui/text/AnnotatedString;Landroidx/compose/ui/text/TextStyle;FLandroidx/compose/ui/unit/Density;Landroidx/compose/ui/text/font/FontFamily$Resolver;Ljava/util/List;IZ)V", "(Landroidx/compose/ui/text/AnnotatedString;Landroidx/compose/ui/text/TextStyle;JLandroidx/compose/ui/unit/Density;Landroidx/compose/ui/text/font/FontFamily$Resolver;Ljava/util/List;IZLkotlin/jvm/internal/DefaultConstructorMarker;)V", "overflow", "Landroidx/compose/ui/text/style/TextOverflow;", "(Landroidx/compose/ui/text/AnnotatedString;Landroidx/compose/ui/text/TextStyle;JLandroidx/compose/ui/unit/Density;Landroidx/compose/ui/text/font/FontFamily$Resolver;Ljava/util/List;IILkotlin/jvm/internal/DefaultConstructorMarker;)V", "(Landroidx/compose/ui/text/MultiParagraphIntrinsics;JIILkotlin/jvm/internal/DefaultConstructorMarker;)V", "getAnnotatedString", "()Landroidx/compose/ui/text/AnnotatedString;", "didExceedMaxLines", "getDidExceedMaxLines", "()Z", "firstBaseline", "getFirstBaseline", "()F", "height", "getHeight", "getIntrinsics", "()Landroidx/compose/ui/text/MultiParagraphIntrinsics;", "lastBaseline", "getLastBaseline", "lineCount", "getLineCount", "()I", "maxIntrinsicWidth", "getMaxIntrinsicWidth", "getMaxLines", "minIntrinsicWidth", "getMinIntrinsicWidth", "paragraphInfoList", "Landroidx/compose/ui/text/ParagraphInfo;", "getParagraphInfoList$ui_text_release", "()Ljava/util/List;", "placeholderRects", "Landroidx/compose/ui/geometry/Rect;", "getPlaceholderRects", "getWidth", "fillBoundingBoxes", "", "range", "Landroidx/compose/ui/text/TextRange;", "array", "arrayStart", "fillBoundingBoxes-8ffj60Q", "(J[FI)[F", "getBidiRunDirection", "Landroidx/compose/ui/text/style/ResolvedTextDirection;", "offset", "getBoundingBox", "getCursorRect", "getHorizontalPosition", "usePrimaryDirection", "getLineBaseline", "lineIndex", "getLineBottom", "getLineEnd", "visibleEnd", "getLineForOffset", "getLineForVerticalPosition", "vertical", "getLineHeight", "getLineLeft", "getLineRight", "getLineStart", "getLineTop", "getLineWidth", "getOffsetForPosition", "position", "Landroidx/compose/ui/geometry/Offset;", "getOffsetForPosition-k-4lQ0M", "(J)I", "getParagraphDirection", "getPathForRange", "Landroidx/compose/ui/graphics/Path;", "start", "end", "getRangeForRect", "rect", "granularity", "Landroidx/compose/ui/text/TextGranularity;", "inclusionStrategy", "Landroidx/compose/ui/text/TextInclusionStrategy;", "getRangeForRect-8-6BmAI", "(Landroidx/compose/ui/geometry/Rect;ILandroidx/compose/ui/text/TextInclusionStrategy;)J", "getWordBoundary", "getWordBoundary--jx7JFs", "(I)J", "isLineEllipsized", "paint", "", "canvas", "Landroidx/compose/ui/graphics/Canvas;", "brush", "Landroidx/compose/ui/graphics/Brush;", "alpha", "shadow", "Landroidx/compose/ui/graphics/Shadow;", "decoration", "Landroidx/compose/ui/text/style/TextDecoration;", "drawStyle", "Landroidx/compose/ui/graphics/drawscope/DrawStyle;", "blendMode", "Landroidx/compose/ui/graphics/BlendMode;", "paint-hn5TExg", "(Landroidx/compose/ui/graphics/Canvas;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Shadow;Landroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/graphics/drawscope/DrawStyle;I)V", "color", "Landroidx/compose/ui/graphics/Color;", "paint-RPmYEkk", "(Landroidx/compose/ui/graphics/Canvas;JLandroidx/compose/ui/graphics/Shadow;Landroidx/compose/ui/text/style/TextDecoration;)V", "paint-LG529CI", "(Landroidx/compose/ui/graphics/Canvas;JLandroidx/compose/ui/graphics/Shadow;Landroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/graphics/drawscope/DrawStyle;I)V", "requireIndexInRange", "requireIndexInRangeInclusiveEnd", "requireLineIndexInRange", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class MultiParagraph {
    public static final int $stable = 0;
    private final boolean didExceedMaxLines;
    private final float height;
    private final MultiParagraphIntrinsics intrinsics;
    private final int lineCount;
    private final int maxLines;
    private final List<ParagraphInfo> paragraphInfoList;
    private final List<Rect> placeholderRects;
    private final float width;

    static {
        $stable = 8;
    }

    public /* synthetic */ MultiParagraph(AnnotatedString r1, TextStyle r2, long r3, Density r5, FontFamily.Resolver r6, List r7, int r8, int r9, DefaultConstructorMarker r10) {
        this(r1, r2, r3, r5, r6, r7, r8, r9);
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Constructor with `ellipsis: Boolean` is deprecated, pass TextOverflow instead")
    public /* synthetic */ MultiParagraph(AnnotatedString r1, TextStyle r2, long r3, Density r5, FontFamily.Resolver r6, List r7, int r8, boolean r9, DefaultConstructorMarker r10) {
        this(r1, r2, r3, r5, r6, r7, r8, r9);
    }

    public /* synthetic */ MultiParagraph(MultiParagraphIntrinsics r1, long r2, int r4, int r5, DefaultConstructorMarker r6) {
        this(r1, r2, r4, r5);
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Constructor with `ellipsis: Boolean` is deprecated, pass TextOverflow instead")
    public /* synthetic */ MultiParagraph(MultiParagraphIntrinsics r1, long r2, int r4, boolean r5, DefaultConstructorMarker r6) {
        this(r1, r2, r4, r5);
    }

    private MultiParagraph(MultiParagraphIntrinsics intrinsics, long constraints, int maxLines, int overflow) {
        this.intrinsics = intrinsics;
        this.maxLines = maxLines;
        int r4 = 0;
        if (Constraints.m6928getMinWidthimpl(constraints) == 0) goto L5;
    L7:
        boolean value$iv = false;
    L9:
        if (value$iv == true) goto L11;
        InlineClassHelperKt.throwIllegalArgumentException("Setting Constraints.minWidth and Constraints.minHeight is not supported, these should be the default zero values instead.");
    L11:
        float currentHeight = 0.0f;
        int currentLineCount = 0;
        boolean didExceedMaxLines = false;
        List paragraphInfoList = new ArrayList();
        List<ParagraphIntrinsicInfo> r8 = this.intrinsics.getInfoList$ui_text_release();
        int index = 0;
        int r10 = r8.size();
    L12:
        if (index >= r10) goto L27;
        ParagraphIntrinsicInfo paragraphInfo = r8.get(index);
        ParagraphIntrinsics r12 = paragraphInfo.getIntrinsics();
        int r14 = Constraints.m6926getMaxWidthimpl(constraints);
        if (Constraints.m6921getHasBoundedHeightimpl(constraints) == false) goto L16;
        int r16 = RangesKt.coerceAtLeast(Constraints.m6925getMaxHeightimpl(constraints) - ParagraphKt.ceilToInt(currentHeight), r4);
    L17:
        Paragraph paragraph = ParagraphKt.m6290ParagraphczeNHc(r12, ConstraintsKt.Constraints$default(0, r14, 0, r16, 5, null), this.maxLines - currentLineCount, overflow);
        float paragraphTop = currentHeight;
        float paragraphBottom = currentHeight + paragraph.getHeight();
        currentHeight = paragraphBottom;
        int startLineIndex = currentLineCount;
        int endLineIndex = startLineIndex + paragraph.getLineCount();
        currentLineCount = endLineIndex;
        paragraphInfoList.add(new ParagraphInfo(paragraph, paragraphInfo.getStartIndex(), paragraphInfo.getEndIndex(), startLineIndex, endLineIndex, paragraphTop, paragraphBottom));
        if (paragraph.getDidExceedMaxLines() == true) goto L25;
        if (endLineIndex != this.maxLines) goto L24;
        if (index != CollectionsKt.getLastIndex(this.intrinsics.getInfoList$ui_text_release())) goto L25;
    L24:
        index = index + 1;
        r4 = 0;
    L25:
        didExceedMaxLines = true;
        goto L27
    L16:
        r16 = Constraints.m6925getMaxHeightimpl(constraints);
    L27:
        this.height = currentHeight;
        this.lineCount = currentLineCount;
        this.didExceedMaxLines = didExceedMaxLines;
        this.paragraphInfoList = paragraphInfoList;
        this.width = Constraints.m6926getMaxWidthimpl(constraints);
        ArrayList target$iv = new ArrayList(paragraphInfoList.size());
        int index$iv$iv = 0;
        int r15 = paragraphInfoList.size();
    L28:
        if (index$iv$iv >= r15) goto L37;
        Object item$iv$iv = paragraphInfoList.get(index$iv$iv);
        ParagraphInfo $this$lambda_u244_u24lambda_u243 = (ParagraphInfo) item$iv$iv;
        List<Rect> r24 = $this$lambda_u244_u24lambda_u243.getParagraph().getPlaceholderRects();
        Iterable target$iv2 = new ArrayList(r24.size());
        List<Rect> r2 = r24;
        int r1 = r2.size();
        float currentHeight2 = currentHeight;
        int index$iv$iv2 = 0;
    L30:
        if (index$iv$iv2 >= r1) goto L36;
        Object item$iv$iv2 = r2.get(index$iv$iv2);
        int r32 = r1;
        ArrayList r3 = (Collection) target$iv2;
        List<Rect> r33 = r2;
        Rect it = (Rect) item$iv$iv2;
        if (it == null) goto L34;
        ParagraphInfo $this$lambda_u244_u24lambda_u244 = $this$lambda_u244_u24lambda_u243;
        Rect it2 = $this$lambda_u244_u24lambda_u244.toGlobal(it);
    L35:
        r3.add(it2);
        $this$lambda_u244_u24lambda_u243 = $this$lambda_u244_u24lambda_u244;
        r2 = r33;
        index$iv$iv2 = index$iv$iv2 + 1;
        r1 = r32;
        goto L30
    L34:
        $this$lambda_u244_u24lambda_u244 = $this$lambda_u244_u24lambda_u243;
        it2 = null;
        goto L35
    L36:
        Iterable list$iv = (List) target$iv2;
        CollectionsKt.addAll(target$iv, list$iv);
        index$iv$iv = index$iv$iv + 1;
        currentHeight = currentHeight2;
        goto L28
    L37:
        ArrayList r5 = target$iv;
        if (r5.size() >= this.intrinsics.getPlaceholders().size()) goto L43;
        ArrayList r6 = r5;
        int r9 = this.intrinsics.getPlaceholders().size() - r5.size();
        ArrayList r11 = new ArrayList(r9);
        int r13 = 0;
    L40:
        if (r13 >= r9) goto L42;
        r11.add(null);
        r13 = r13 + 1;
        goto L40
    L42:
        List<Rect> r7 = CollectionsKt.plus(r6, r11);
    L44:
        this.placeholderRects = r7;
        return;
    L43:
        r7 = r5;
        goto L44
    L5:
        if (Constraints.m6927getMinHeightimpl(constraints) != 0) goto L7;
        value$iv = true;
        goto L9
    }

    public /* synthetic */ MultiParagraph(MultiParagraphIntrinsics r8, long r9, int r11, int r12, int r13, DefaultConstructorMarker r14) {
        if ((r13 & 4) == 0) goto L5;
        int r4 = Integer.MAX_VALUE;
    L7:
        if ((r13 & 8) == 0) goto L9;
        int r5 = TextOverflow.Companion.m6886getClipgIe3tQ8();
    L10:
        this(r8, r9, r4, r5, null);
        return;
    L9:
        r5 = r12;
        goto L10
    L5:
        r4 = r11;
        goto L7
    }

    public final MultiParagraphIntrinsics getIntrinsics() {
        return this.intrinsics;
    }

    public final int getMaxLines() {
        return this.maxLines;
    }

    public /* synthetic */ MultiParagraph(MultiParagraphIntrinsics r8, long r9, int r11, boolean r12, int r13, DefaultConstructorMarker r14) {
        if ((r13 & 4) == 0) goto L5;
        int r4 = Integer.MAX_VALUE;
    L7:
        if ((r13 & 8) == 0) goto L9;
        boolean r5 = false;
    L10:
        this(r8, r9, r4, r5, null);
        return;
    L9:
        r5 = r12;
        goto L10
    L5:
        r4 = r11;
        goto L7
    }

    private MultiParagraph(MultiParagraphIntrinsics intrinsics, long constraints, int maxLines, boolean ellipsis) {
        TextOverflow.Companion r0 = TextOverflow.Companion;
        if (ellipsis == false) goto L5;
        int r1 = r0.m6887getEllipsisgIe3tQ8();
    L6:
        this(intrinsics, constraints, maxLines, r1, null);
        return;
    L5:
        r1 = r0.m6886getClipgIe3tQ8();
        goto L6
    }

    public /* synthetic */ MultiParagraph(MultiParagraphIntrinsics r1, int r2, boolean r3, float r4, int r5, DefaultConstructorMarker r6) {
        if ((r5 & 2) == 0) goto L6;
        r2 = Integer.MAX_VALUE;
    L6:
        if ((r5 & 4) == 0) goto L8;
        r3 = false;
    L8:
        this(r1, r2, r3, r4);
    }

    @Deprecated(message = "MultiParagraph that takes maximum allowed width is deprecated, pass constraints instead.", replaceWith = @ReplaceWith(expression = "MultiParagraph(intrinsics, Constraints(maxWidth = ceil(width).toInt()), maxLines, ellipsis)", imports = {"kotlin.math.ceil", "androidx.compose.ui.unit.Constraints"}))
    public MultiParagraph(MultiParagraphIntrinsics intrinsics, int maxLines, boolean ellipsis, float width) {
        long r8 = ConstraintsKt.Constraints$default(0, ParagraphKt.ceilToInt(width), 0, 0, 13, null);
        TextOverflow.Companion r0 = TextOverflow.Companion;
        if (ellipsis == false) goto L5;
        int r1 = r0.m6887getEllipsisgIe3tQ8();
    L6:
        this(intrinsics, r8, maxLines, r1, null);
        return;
    L5:
        r1 = r0.m6886getClipgIe3tQ8();
        goto L6
    }

    public /* synthetic */ MultiParagraph(AnnotatedString r10, TextStyle r11, List r12, int r13, boolean r14, float r15, Density r16, Font.ResourceLoader r17, int r18, DefaultConstructorMarker r19) {
        if ((r18 & 4) == 0) goto L5;
        List r3 = CollectionsKt.emptyList();
    L7:
        if ((r18 & 8) == 0) goto L9;
        int r4 = Integer.MAX_VALUE;
    L11:
        if ((r18 & 16) == 0) goto L13;
        boolean r5 = false;
    L14:
        this(r10, r11, r3, r4, r5, r15, r16, r17);
        return;
    L13:
        r5 = r14;
        goto L14
    L9:
        r4 = r13;
        goto L11
    L5:
        r3 = r12;
        goto L7
    }

    @Deprecated(message = "Font.ResourceLoader is deprecated, use fontFamilyResolver instead", replaceWith = @ReplaceWith(expression = "MultiParagraph(annotatedString, style, placeholders, maxLines, ellipsis, width, density, fontFamilyResolver)", imports = {}))
    public MultiParagraph(AnnotatedString annotatedString, TextStyle style, List<AnnotatedString.Range<Placeholder>> r15, int maxLines, boolean ellipsis, float width, Density density, Font.ResourceLoader resourceLoader) {
        MultiParagraphIntrinsics r0 = new MultiParagraphIntrinsics(annotatedString, style, r15, density, DelegatingFontLoaderForDeprecatedUsage_androidKt.createFontFamilyResolver(resourceLoader));
        TextOverflow.Companion r1 = TextOverflow.Companion;
        if (ellipsis == false) goto L5;
        int r2 = r1.m6887getEllipsisgIe3tQ8();
    L6:
        long r3 = ConstraintsKt.Constraints$default(0, ParagraphKt.ceilToInt(width), 0, 0, 13, null);
        this(r0, r3, maxLines, r2, null);
        return;
    L5:
        r2 = r1.m6886getClipgIe3tQ8();
        goto L6
    }

    public /* synthetic */ MultiParagraph(AnnotatedString r12, TextStyle r13, float r14, Density r15, FontFamily.Resolver r16, List r17, int r18, boolean r19, int r20, DefaultConstructorMarker r21) {
        if ((r20 & 32) == 0) goto L5;
        List r8 = CollectionsKt.emptyList();
    L7:
        if ((r20 & 64) == 0) goto L9;
        int r9 = Integer.MAX_VALUE;
    L11:
        if ((r20 & 128) == 0) goto L13;
        boolean r10 = false;
    L14:
        this(r12, r13, r14, r15, r16, r8, r9, r10);
        return;
    L13:
        r10 = r19;
        goto L14
    L9:
        r9 = r18;
        goto L11
    L5:
        r8 = r17;
        goto L7
    }

    @Deprecated(message = "MultiParagraph that takes maximum allowed width is deprecated, pass constraints instead.", replaceWith = @ReplaceWith(expression = "MultiParagraph(annotatedString, style, Constraints(maxWidth = ceil(width).toInt()), density, fontFamilyResolver, placeholders, maxLines, ellipsis)", imports = {"kotlin.math.ceil", "androidx.compose.ui.unit.Constraints"}))
    public MultiParagraph(AnnotatedString annotatedString, TextStyle style, float width, Density density, FontFamily.Resolver fontFamilyResolver, List<AnnotatedString.Range<Placeholder>> r18, int maxLines, boolean ellipsis) {
        MultiParagraphIntrinsics r0 = new MultiParagraphIntrinsics(annotatedString, style, r18, density, fontFamilyResolver);
        TextOverflow.Companion r1 = TextOverflow.Companion;
        if (ellipsis == false) goto L5;
        int r2 = r1.m6887getEllipsisgIe3tQ8();
    L6:
        long r3 = ConstraintsKt.Constraints$default(0, ParagraphKt.ceilToInt(width), 0, 0, 13, null);
        this(r0, r3, maxLines, r2, null);
        return;
    L5:
        r2 = r1.m6886getClipgIe3tQ8();
        goto L6
    }

    public /* synthetic */ MultiParagraph(AnnotatedString r14, TextStyle r15, long r16, Density r18, FontFamily.Resolver r19, List r20, int r21, boolean r22, int r23, DefaultConstructorMarker r24) {
        if ((r23 & 32) == 0) goto L5;
        List r9 = CollectionsKt.emptyList();
    L7:
        if ((r23 & 64) == 0) goto L9;
        int r10 = Integer.MAX_VALUE;
    L11:
        if ((r23 & 128) == 0) goto L13;
        boolean r11 = false;
    L14:
        this(r14, r15, r16, r18, r19, r9, r10, r11, null);
        return;
    L13:
        r11 = r22;
        goto L14
    L9:
        r10 = r21;
        goto L11
    L5:
        r9 = r20;
        goto L7
    }

    private MultiParagraph(AnnotatedString annotatedString, TextStyle style, long constraints, Density density, FontFamily.Resolver fontFamilyResolver, List<AnnotatedString.Range<Placeholder>> r13, int maxLines, boolean ellipsis) {
        MultiParagraphIntrinsics r0 = new MultiParagraphIntrinsics(annotatedString, style, r13, density, fontFamilyResolver);
        TextOverflow.Companion r7 = TextOverflow.Companion;
        if (ellipsis == false) goto L5;
        int r8 = r7.m6887getEllipsisgIe3tQ8();
    L6:
        this(r0, constraints, maxLines, r8, null);
        return;
    L5:
        r8 = r7.m6886getClipgIe3tQ8();
        goto L6
    }

    public /* synthetic */ MultiParagraph(AnnotatedString r14, TextStyle r15, long r16, Density r18, FontFamily.Resolver r19, List r20, int r21, int r22, int r23, DefaultConstructorMarker r24) {
        if ((r23 & 32) == 0) goto L5;
        List r9 = CollectionsKt.emptyList();
    L7:
        if ((r23 & 64) == 0) goto L9;
        int r10 = Integer.MAX_VALUE;
    L11:
        if ((r23 & 128) == 0) goto L13;
        int r11 = TextOverflow.Companion.m6886getClipgIe3tQ8();
    L14:
        this(r14, r15, r16, r18, r19, r9, r10, r11, null);
        return;
    L13:
        r11 = r22;
        goto L14
    L9:
        r10 = r21;
        goto L11
    L5:
        r9 = r20;
        goto L7
    }

    private MultiParagraph(AnnotatedString annotatedString, TextStyle style, long constraints, Density density, FontFamily.Resolver fontFamilyResolver, List<AnnotatedString.Range<Placeholder>> r13, int maxLines, int overflow) {
        this(new MultiParagraphIntrinsics(annotatedString, style, r13, density, fontFamilyResolver), constraints, maxLines, overflow, null);
    }

    private final AnnotatedString getAnnotatedString() {
        return this.intrinsics.getAnnotatedString();
    }

    public final float getMinIntrinsicWidth() {
        return this.intrinsics.getMinIntrinsicWidth();
    }

    public final float getMaxIntrinsicWidth() {
        return this.intrinsics.getMaxIntrinsicWidth();
    }

    public final boolean getDidExceedMaxLines() {
        return this.didExceedMaxLines;
    }

    public final float getWidth() {
        return this.width;
    }

    public final float getHeight() {
        return this.height;
    }

    public final float getFirstBaseline() {
        if (this.paragraphInfoList.isEmpty() == false) goto L6;
        return 0.0f;
    L6:
        return this.paragraphInfoList.get(0).getParagraph().getFirstBaseline();
    }

    public final float getLastBaseline() {
        if (this.paragraphInfoList.isEmpty() == false) goto L5;
        return 0.0f;
    L5:
        ParagraphInfo $this$_get_lastBaseline__u24lambda_u240 = (ParagraphInfo) CollectionsKt.last(this.paragraphInfoList);
        return $this$_get_lastBaseline__u24lambda_u240.toGlobalYPosition($this$_get_lastBaseline__u24lambda_u240.getParagraph().getLastBaseline());
    }

    public final int getLineCount() {
        return this.lineCount;
    }

    public final List<Rect> getPlaceholderRects() {
        return this.placeholderRects;
    }

    public final List<ParagraphInfo> getParagraphInfoList$ui_text_release() {
        return this.paragraphInfoList;
    }

    /* JADX INFO: renamed from: paint-RPmYEkk$default, reason: not valid java name */
    public static /* synthetic */ void m6265paintRPmYEkk$default(MultiParagraph r6, Canvas r7, long r8, Shadow r10, TextDecoration r11, int r12, Object r13) {
        if ((r12 & 2) == 0) goto L5;
        long r2 = Color.Companion.m4402getUnspecified0d7_KjU();
    L7:
        if ((r12 & 4) == 0) goto L9;
        Shadow r4 = null;
    L11:
        if ((r12 & 8) == 0) goto L13;
        TextDecoration r5 = null;
    L14:
        r6.m6272paintRPmYEkk(r7, r2, r4, r5);
        return;
    L13:
        r5 = r11;
        goto L14
    L9:
        r4 = r10;
        goto L11
    L5:
        r2 = r8;
        goto L7
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Use the new paint function that takes canvas as the only required parameter.")
    /* JADX INFO: renamed from: paint-RPmYEkk, reason: not valid java name */
    public final /* synthetic */ void m6272paintRPmYEkk(Canvas canvas, long color, Shadow shadow, TextDecoration decoration) {
        canvas.save();
        List<ParagraphInfo> r0 = this.paragraphInfoList;
        int index$iv = 0;
        int r3 = r0.size();
    L3:
        if (index$iv >= r3) goto L5;
        Object item$iv = r0.get(index$iv);
        ParagraphInfo it = (ParagraphInfo) item$iv;
        it.getParagraph().mo6232paintRPmYEkk(canvas, color, shadow, decoration);
        canvas.translate(0.0f, it.getParagraph().getHeight());
        index$iv = index$iv + 1;
        goto L3
    L5:
        canvas.restore();
    }

    /* JADX INFO: renamed from: paint-LG529CI$default, reason: not valid java name */
    public static /* synthetic */ void m6264paintLG529CI$default(MultiParagraph r6, Canvas r7, long r8, Shadow r10, TextDecoration r11, DrawStyle r12, int r13, int r14, Object r15) {
        if ((r14 & 2) == 0) goto L5;
        long r0 = Color.Companion.m4402getUnspecified0d7_KjU();
    L6:
        DrawStyle r3 = null;
        if ((r14 & 4) == 0) goto L9;
        Shadow r2 = null;
    L11:
        if ((r14 & 8) == 0) goto L13;
        TextDecoration r4 = null;
    L15:
        if ((r14 & 16) != 0) goto L19;
        r3 = r12;
    L19:
        if ((r14 & 32) == 0) goto L21;
        int r5 = DrawScope.Companion.m4919getDefaultBlendMode0nO6VwU();
    L22:
        r6.m6271paintLG529CI(r7, r0, r2, r4, r3, r5);
        return;
    L21:
        r5 = r13;
        goto L22
    L13:
        r4 = r11;
        goto L15
    L9:
        r2 = r10;
        goto L11
    L5:
        r0 = r8;
        goto L6
    }

    /* JADX INFO: renamed from: paint-LG529CI, reason: not valid java name */
    public final void m6271paintLG529CI(Canvas canvas, long color, Shadow shadow, TextDecoration decoration, DrawStyle drawStyle, int blendMode) {
        canvas.save();
        List<ParagraphInfo> r1 = this.paragraphInfoList;
        int index$iv = 0;
        int r4 = r1.size();
    L3:
        if (index$iv >= r4) goto L5;
        Object item$iv = r1.get(index$iv);
        ParagraphInfo it = (ParagraphInfo) item$iv;
        it.getParagraph().mo6231paintLG529CI(canvas, color, shadow, decoration, drawStyle, blendMode);
        canvas.translate(0.0f, it.getParagraph().getHeight());
        index$iv = index$iv + 1;
        goto L3
    L5:
        canvas.restore();
    }

    /* JADX INFO: renamed from: paint-hn5TExg$default, reason: not valid java name */
    public static /* synthetic */ void m6266painthn5TExg$default(MultiParagraph r8, Canvas r9, Brush r10, float r11, Shadow r12, TextDecoration r13, DrawStyle r14, int r15, int r16, Object r17) {
        if ((r16 & 4) == 0) goto L5;
        float r3 = Float.NaN;
    L7:
        if ((r16 & 8) == 0) goto L9;
        Shadow r4 = null;
    L11:
        if ((r16 & 16) == 0) goto L13;
        TextDecoration r5 = null;
    L15:
        if ((r16 & 32) == 0) goto L17;
        DrawStyle r6 = null;
    L19:
        if ((r16 & 64) == 0) goto L21;
        int r7 = DrawScope.Companion.m4919getDefaultBlendMode0nO6VwU();
    L22:
        r8.m6273painthn5TExg(r9, r10, r3, r4, r5, r6, r7);
        return;
    L21:
        r7 = r15;
        goto L22
    L17:
        r6 = r14;
        goto L19
    L13:
        r5 = r13;
        goto L15
    L9:
        r4 = r12;
        goto L11
    L5:
        r3 = r11;
        goto L7
    }

    /* JADX INFO: renamed from: paint-hn5TExg, reason: not valid java name */
    public final void m6273painthn5TExg(Canvas canvas, Brush brush, float alpha, Shadow shadow, TextDecoration decoration, DrawStyle drawStyle, int blendMode) {
        AndroidMultiParagraphDraw_androidKt.m6670drawMultiParagraph7AXcY_I(this, canvas, brush, alpha, shadow, decoration, drawStyle, blendMode);
    }

    public final Path getPathForRange(final int start, final int end) {
        boolean value$iv = true;
        if (start < 0) goto L6;
        if (start > end) goto L6;
        boolean r2 = true;
    L7:
        if (r2 == true) goto L9;
    L11:
        value$iv = false;
    L13:
        if (value$iv == true) goto L16;
        InlineClassHelperKt.throwIllegalArgumentException("Start(" + start + ") or End(" + end + ") is out of range [0.." + getAnnotatedString().getText().length() + "), or start > end!");
    L16:
        if (start == end) goto L18;
        final Path path = AndroidPath_androidKt.Path();
        MultiParagraphKt.m6274findParagraphsByRangeSbBc2M(this.paragraphInfoList, TextRangeKt.TextRange(start, end), new AnonymousClass2(path, start, end));
        return path;
    L18:
        return AndroidPath_androidKt.Path();
    L9:
        if (end > getAnnotatedString().getText().length()) goto L11;
    L6:
        r2 = false;
        goto L7
    }

    public final int getLineForVerticalPosition(float vertical) {
        int paragraphIndex = MultiParagraphKt.findParagraphByY(this.paragraphInfoList, vertical);
        ParagraphInfo $this$getLineForVerticalPosition_u24lambda_u2410 = this.paragraphInfoList.get(paragraphIndex);
        if ($this$getLineForVerticalPosition_u24lambda_u2410.getLength() != 0) goto L7;
        return $this$getLineForVerticalPosition_u24lambda_u2410.getStartLineIndex();
    L7:
        return $this$getLineForVerticalPosition_u24lambda_u2410.toGlobalLineIndex($this$getLineForVerticalPosition_u24lambda_u2410.getParagraph().getLineForVerticalPosition($this$getLineForVerticalPosition_u24lambda_u2410.toLocalYPosition(vertical)));
    }

    /* JADX INFO: renamed from: getOffsetForPosition-k-4lQ0M, reason: not valid java name */
    public final int m6268getOffsetForPositionk4lQ0M(long position) {
        int bits$iv$iv$iv = (int) (4294967295L & position);
        int paragraphIndex = MultiParagraphKt.findParagraphByY(this.paragraphInfoList, Float.intBitsToFloat(bits$iv$iv$iv));
        ParagraphInfo $this$getOffsetForPosition_k_4lQ0M_u24lambda_u2411 = this.paragraphInfoList.get(paragraphIndex);
        if ($this$getOffsetForPosition_k_4lQ0M_u24lambda_u2411.getLength() != 0) goto L7;
        return $this$getOffsetForPosition_k_4lQ0M_u24lambda_u2411.getStartIndex();
    L7:
        return $this$getOffsetForPosition_k_4lQ0M_u24lambda_u2411.toGlobalIndex($this$getOffsetForPosition_k_4lQ0M_u24lambda_u2411.getParagraph().mo6227getOffsetForPositionk4lQ0M($this$getOffsetForPosition_k_4lQ0M_u24lambda_u2411.m6283toLocalMKHz9U(position)));
    }

    /* JADX INFO: renamed from: getRangeForRect-8-6BmAI, reason: not valid java name */
    public final long m6269getRangeForRect86BmAI(Rect rect, int granularity, TextInclusionStrategy inclusionStrategy) {
        int firstParagraph = MultiParagraphKt.findParagraphByY(this.paragraphInfoList, rect.getTop());
        if (this.paragraphInfoList.get(firstParagraph).getBottom() < rect.getBottom()) goto L5;
    L26:
        ParagraphInfo $this$getRangeForRect_8_6BmAI_u24lambda_u2412 = this.paragraphInfoList.get(firstParagraph);
        return ParagraphInfo.m6281toGlobalxdX6G0$default($this$getRangeForRect_8_6BmAI_u24lambda_u2412, $this$getRangeForRect_8_6BmAI_u24lambda_u2412.getParagraph().mo6229getRangeForRect86BmAI($this$getRangeForRect_8_6BmAI_u24lambda_u2412.toLocal(rect), granularity, inclusionStrategy), false, 1, null);
    L5:
        if (firstParagraph == CollectionsKt.getLastIndex(this.paragraphInfoList)) goto L26;
        int lastParagraph = MultiParagraphKt.findParagraphByY(this.paragraphInfoList, rect.getBottom());
        long startRange = TextRange.Companion.m6422getZerod9O1mEE();
    L9:
        if (TextRange.m6410equalsimpl0(startRange, TextRange.Companion.m6422getZerod9O1mEE()) == false) goto L13;
        if (firstParagraph > lastParagraph) goto L13;
        ParagraphInfo $this$getRangeForRect_8_6BmAI_u24lambda_u2413 = this.paragraphInfoList.get(firstParagraph);
        startRange = ParagraphInfo.m6281toGlobalxdX6G0$default($this$getRangeForRect_8_6BmAI_u24lambda_u2413, $this$getRangeForRect_8_6BmAI_u24lambda_u2413.getParagraph().mo6229getRangeForRect86BmAI($this$getRangeForRect_8_6BmAI_u24lambda_u2413.toLocal(rect), granularity, inclusionStrategy), false, 1, null);
        firstParagraph = firstParagraph + 1;
    L13:
        if (TextRange.m6410equalsimpl0(startRange, TextRange.Companion.m6422getZerod9O1mEE()) == true) goto L15;
        long endRange = TextRange.Companion.m6422getZerod9O1mEE();
    L18:
        if (TextRange.m6410equalsimpl0(endRange, TextRange.Companion.m6422getZerod9O1mEE()) == false) goto L22;
        if (firstParagraph > lastParagraph) goto L22;
        ParagraphInfo $this$getRangeForRect_8_6BmAI_u24lambda_u2414 = this.paragraphInfoList.get(lastParagraph);
        endRange = ParagraphInfo.m6281toGlobalxdX6G0$default($this$getRangeForRect_8_6BmAI_u24lambda_u2414, $this$getRangeForRect_8_6BmAI_u24lambda_u2414.getParagraph().mo6229getRangeForRect86BmAI($this$getRangeForRect_8_6BmAI_u24lambda_u2414.toLocal(rect), granularity, inclusionStrategy), false, 1, null);
        lastParagraph = lastParagraph - 1;
    L22:
        if (TextRange.m6410equalsimpl0(endRange, TextRange.Companion.m6422getZerod9O1mEE()) == false) goto L25;
        return startRange;
    L25:
        return TextRangeKt.TextRange(TextRange.m6417getStartimpl(startRange), TextRange.m6412getEndimpl(endRange));
    L15:
        return TextRange.Companion.m6422getZerod9O1mEE();
    }

    public final Rect getBoundingBox(int offset) {
        requireIndexInRange(offset);
        int paragraphIndex = MultiParagraphKt.findParagraphByIndex(this.paragraphInfoList, offset);
        ParagraphInfo $this$getBoundingBox_u24lambda_u2415 = this.paragraphInfoList.get(paragraphIndex);
        return $this$getBoundingBox_u24lambda_u2415.toGlobal($this$getBoundingBox_u24lambda_u2415.getParagraph().getBoundingBox($this$getBoundingBox_u24lambda_u2415.toLocalIndex(offset)));
    }

    /* JADX INFO: renamed from: fillBoundingBoxes-8ffj60Q, reason: not valid java name */
    public final float[] m6267fillBoundingBoxes8ffj60Q(final long range, final float[] array, int arrayStart) {
        requireIndexInRange(TextRange.m6415getMinimpl(range));
        requireIndexInRangeInclusiveEnd(TextRange.m6414getMaximpl(range));
        final Ref.IntRef currentArrayStart = new Ref.IntRef();
        currentArrayStart.element = arrayStart;
        final Ref.FloatRef currentHeight = new Ref.FloatRef();
        MultiParagraphKt.m6274findParagraphsByRangeSbBc2M(this.paragraphInfoList, range, new MultiParagraph$fillBoundingBoxes$1(range, array, currentArrayStart, currentHeight));
        return array;
    }

    public final float getHorizontalPosition(int offset, boolean usePrimaryDirection) {
        requireIndexInRangeInclusiveEnd(offset);
        int r0 = getAnnotatedString().length();
        List<ParagraphInfo> r1 = this.paragraphInfoList;
        if (offset != r0) goto L5;
        int paragraphIndex = CollectionsKt.getLastIndex(r1);
    L6:
        ParagraphInfo $this$getHorizontalPosition_u24lambda_u2416 = this.paragraphInfoList.get(paragraphIndex);
        return $this$getHorizontalPosition_u24lambda_u2416.getParagraph().getHorizontalPosition($this$getHorizontalPosition_u24lambda_u2416.toLocalIndex(offset), usePrimaryDirection);
    L5:
        paragraphIndex = MultiParagraphKt.findParagraphByIndex(r1, offset);
        goto L6
    }

    public final ResolvedTextDirection getParagraphDirection(int offset) {
        requireIndexInRangeInclusiveEnd(offset);
        int r0 = getAnnotatedString().length();
        List<ParagraphInfo> r1 = this.paragraphInfoList;
        if (offset != r0) goto L5;
        int paragraphIndex = CollectionsKt.getLastIndex(r1);
    L6:
        ParagraphInfo $this$getParagraphDirection_u24lambda_u2417 = this.paragraphInfoList.get(paragraphIndex);
        return $this$getParagraphDirection_u24lambda_u2417.getParagraph().getParagraphDirection($this$getParagraphDirection_u24lambda_u2417.toLocalIndex(offset));
    L5:
        paragraphIndex = MultiParagraphKt.findParagraphByIndex(r1, offset);
        goto L6
    }

    public final ResolvedTextDirection getBidiRunDirection(int offset) {
        requireIndexInRangeInclusiveEnd(offset);
        int r0 = getAnnotatedString().length();
        List<ParagraphInfo> r1 = this.paragraphInfoList;
        if (offset != r0) goto L5;
        int paragraphIndex = CollectionsKt.getLastIndex(r1);
    L6:
        ParagraphInfo $this$getBidiRunDirection_u24lambda_u2418 = this.paragraphInfoList.get(paragraphIndex);
        return $this$getBidiRunDirection_u24lambda_u2418.getParagraph().getBidiRunDirection($this$getBidiRunDirection_u24lambda_u2418.toLocalIndex(offset));
    L5:
        paragraphIndex = MultiParagraphKt.findParagraphByIndex(r1, offset);
        goto L6
    }

    /* JADX INFO: renamed from: getWordBoundary--jx7JFs, reason: not valid java name */
    public final long m6270getWordBoundaryjx7JFs(int offset) {
        requireIndexInRangeInclusiveEnd(offset);
        int r0 = getAnnotatedString().length();
        List<ParagraphInfo> r1 = this.paragraphInfoList;
        if (offset != r0) goto L5;
        int paragraphIndex = CollectionsKt.getLastIndex(r1);
    L6:
        ParagraphInfo $this$getWordBoundary__jx7JFs_u24lambda_u2419 = this.paragraphInfoList.get(paragraphIndex);
        return $this$getWordBoundary__jx7JFs_u24lambda_u2419.m6282toGlobalxdX6G0($this$getWordBoundary__jx7JFs_u24lambda_u2419.getParagraph().mo6230getWordBoundaryjx7JFs($this$getWordBoundary__jx7JFs_u24lambda_u2419.toLocalIndex(offset)), false);
    L5:
        paragraphIndex = MultiParagraphKt.findParagraphByIndex(r1, offset);
        goto L6
    }

    public final Rect getCursorRect(int offset) {
        requireIndexInRangeInclusiveEnd(offset);
        int r0 = getAnnotatedString().length();
        List<ParagraphInfo> r1 = this.paragraphInfoList;
        if (offset != r0) goto L5;
        int paragraphIndex = CollectionsKt.getLastIndex(r1);
    L6:
        ParagraphInfo $this$getCursorRect_u24lambda_u2420 = this.paragraphInfoList.get(paragraphIndex);
        return $this$getCursorRect_u24lambda_u2420.toGlobal($this$getCursorRect_u24lambda_u2420.getParagraph().getCursorRect($this$getCursorRect_u24lambda_u2420.toLocalIndex(offset)));
    L5:
        paragraphIndex = MultiParagraphKt.findParagraphByIndex(r1, offset);
        goto L6
    }

    public final int getLineForOffset(int offset) {
        if (offset < getAnnotatedString().length()) goto L5;
        int paragraphIndex = CollectionsKt.getLastIndex(this.paragraphInfoList);
    L8:
        ParagraphInfo $this$getLineForOffset_u24lambda_u2421 = this.paragraphInfoList.get(paragraphIndex);
        return $this$getLineForOffset_u24lambda_u2421.toGlobalLineIndex($this$getLineForOffset_u24lambda_u2421.getParagraph().getLineForOffset($this$getLineForOffset_u24lambda_u2421.toLocalIndex(offset)));
    L5:
        if (offset >= 0) goto L7;
        paragraphIndex = 0;
        goto L8
    L7:
        paragraphIndex = MultiParagraphKt.findParagraphByIndex(this.paragraphInfoList, offset);
        goto L8
    }

    public final float getLineLeft(int lineIndex) {
        requireLineIndexInRange(lineIndex);
        int paragraphIndex = MultiParagraphKt.findParagraphByLineIndex(this.paragraphInfoList, lineIndex);
        ParagraphInfo $this$getLineLeft_u24lambda_u2422 = this.paragraphInfoList.get(paragraphIndex);
        return $this$getLineLeft_u24lambda_u2422.getParagraph().getLineLeft($this$getLineLeft_u24lambda_u2422.toLocalLineIndex(lineIndex));
    }

    public final float getLineRight(int lineIndex) {
        requireLineIndexInRange(lineIndex);
        int paragraphIndex = MultiParagraphKt.findParagraphByLineIndex(this.paragraphInfoList, lineIndex);
        ParagraphInfo $this$getLineRight_u24lambda_u2423 = this.paragraphInfoList.get(paragraphIndex);
        return $this$getLineRight_u24lambda_u2423.getParagraph().getLineRight($this$getLineRight_u24lambda_u2423.toLocalLineIndex(lineIndex));
    }

    public final float getLineTop(int lineIndex) {
        requireLineIndexInRange(lineIndex);
        int paragraphIndex = MultiParagraphKt.findParagraphByLineIndex(this.paragraphInfoList, lineIndex);
        ParagraphInfo $this$getLineTop_u24lambda_u2424 = this.paragraphInfoList.get(paragraphIndex);
        return $this$getLineTop_u24lambda_u2424.toGlobalYPosition($this$getLineTop_u24lambda_u2424.getParagraph().getLineTop($this$getLineTop_u24lambda_u2424.toLocalLineIndex(lineIndex)));
    }

    public final float getLineBaseline(int lineIndex) {
        requireLineIndexInRange(lineIndex);
        int paragraphIndex = MultiParagraphKt.findParagraphByLineIndex(this.paragraphInfoList, lineIndex);
        ParagraphInfo $this$getLineBaseline_u24lambda_u2425 = this.paragraphInfoList.get(paragraphIndex);
        return $this$getLineBaseline_u24lambda_u2425.toGlobalYPosition($this$getLineBaseline_u24lambda_u2425.getParagraph().getLineBaseline($this$getLineBaseline_u24lambda_u2425.toLocalLineIndex(lineIndex)));
    }

    public final float getLineBottom(int lineIndex) {
        requireLineIndexInRange(lineIndex);
        int paragraphIndex = MultiParagraphKt.findParagraphByLineIndex(this.paragraphInfoList, lineIndex);
        ParagraphInfo $this$getLineBottom_u24lambda_u2426 = this.paragraphInfoList.get(paragraphIndex);
        return $this$getLineBottom_u24lambda_u2426.toGlobalYPosition($this$getLineBottom_u24lambda_u2426.getParagraph().getLineBottom($this$getLineBottom_u24lambda_u2426.toLocalLineIndex(lineIndex)));
    }

    public final float getLineHeight(int lineIndex) {
        requireLineIndexInRange(lineIndex);
        int paragraphIndex = MultiParagraphKt.findParagraphByLineIndex(this.paragraphInfoList, lineIndex);
        ParagraphInfo $this$getLineHeight_u24lambda_u2427 = this.paragraphInfoList.get(paragraphIndex);
        return $this$getLineHeight_u24lambda_u2427.getParagraph().getLineHeight($this$getLineHeight_u24lambda_u2427.toLocalLineIndex(lineIndex));
    }

    public final float getLineWidth(int lineIndex) {
        requireLineIndexInRange(lineIndex);
        int paragraphIndex = MultiParagraphKt.findParagraphByLineIndex(this.paragraphInfoList, lineIndex);
        ParagraphInfo $this$getLineWidth_u24lambda_u2428 = this.paragraphInfoList.get(paragraphIndex);
        return $this$getLineWidth_u24lambda_u2428.getParagraph().getLineWidth($this$getLineWidth_u24lambda_u2428.toLocalLineIndex(lineIndex));
    }

    public final int getLineStart(int lineIndex) {
        requireLineIndexInRange(lineIndex);
        int paragraphIndex = MultiParagraphKt.findParagraphByLineIndex(this.paragraphInfoList, lineIndex);
        ParagraphInfo $this$getLineStart_u24lambda_u2429 = this.paragraphInfoList.get(paragraphIndex);
        return $this$getLineStart_u24lambda_u2429.toGlobalIndex($this$getLineStart_u24lambda_u2429.getParagraph().getLineStart($this$getLineStart_u24lambda_u2429.toLocalLineIndex(lineIndex)));
    }

    public static /* synthetic */ int getLineEnd$default(MultiParagraph r0, int r1, boolean r2, int r3, Object r4) {
        if ((r3 & 2) == 0) goto L6;
        r2 = false;
    L6:
        return r0.getLineEnd(r1, r2);
    }

    public final int getLineEnd(int lineIndex, boolean visibleEnd) {
        requireLineIndexInRange(lineIndex);
        int paragraphIndex = MultiParagraphKt.findParagraphByLineIndex(this.paragraphInfoList, lineIndex);
        ParagraphInfo $this$getLineEnd_u24lambda_u2430 = this.paragraphInfoList.get(paragraphIndex);
        return $this$getLineEnd_u24lambda_u2430.toGlobalIndex($this$getLineEnd_u24lambda_u2430.getParagraph().getLineEnd($this$getLineEnd_u24lambda_u2430.toLocalLineIndex(lineIndex), visibleEnd));
    }

    public final boolean isLineEllipsized(int lineIndex) {
        requireLineIndexInRange(lineIndex);
        int paragraphIndex = MultiParagraphKt.findParagraphByLineIndex(this.paragraphInfoList, lineIndex);
        ParagraphInfo $this$isLineEllipsized_u24lambda_u2431 = this.paragraphInfoList.get(paragraphIndex);
        return $this$isLineEllipsized_u24lambda_u2431.getParagraph().isLineEllipsized(lineIndex);
    }

    private final void requireIndexInRange(int offset) {
        boolean value$iv = false;
        if (offset < 0) goto L8;
        if (offset >= getAnnotatedString().getText().length()) goto L8;
        value$iv = true;
    L8:
        if (value$iv == true) goto L12;
        InlineClassHelperKt.throwIllegalArgumentException("offset(" + offset + ") is out of bounds [0, " + getAnnotatedString().length() + ')');
        return;
    }

    private final void requireIndexInRangeInclusiveEnd(int offset) {
        boolean value$iv = false;
        if (offset < 0) goto L8;
        if (offset > getAnnotatedString().getText().length()) goto L8;
        value$iv = true;
    L8:
        if (value$iv == true) goto L12;
        InlineClassHelperKt.throwIllegalArgumentException("offset(" + offset + ") is out of bounds [0, " + getAnnotatedString().length() + ']');
        return;
    }

    private final void requireLineIndexInRange(int lineIndex) {
        boolean value$iv = false;
        if (lineIndex < 0) goto L8;
        if (lineIndex >= this.lineCount) goto L8;
        value$iv = true;
    L8:
        if (value$iv == true) goto L12;
        InlineClassHelperKt.throwIllegalArgumentException("lineIndex(" + lineIndex + ") is out of bounds [0, " + this.lineCount + ')');
        return;
    }
}
