package androidx.compose.ui.text;

import android.graphics.Paint;
import android.graphics.RectF;
import android.os.Build;
import android.text.Spanned;
import android.text.TextUtils;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.AndroidCanvas_androidKt;
import androidx.compose.ui.graphics.AndroidPath_androidKt;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.RectHelper_androidKt;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import androidx.compose.ui.text.android.LayoutIntrinsics;
import androidx.compose.ui.text.android.TextLayout;
import androidx.compose.ui.text.android.selection.WordBoundary_androidKt;
import androidx.compose.ui.text.android.selection.WordIterator;
import androidx.compose.ui.text.android.style.PlaceholderSpan;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.internal.InlineClassHelperKt;
import androidx.compose.ui.text.platform.AndroidParagraphHelper_androidKt;
import androidx.compose.ui.text.platform.AndroidParagraphIntrinsics;
import androidx.compose.ui.text.platform.AndroidTextPaint;
import androidx.compose.ui.text.platform.style.ShaderBrushSpan;
import androidx.compose.ui.text.style.LineBreak;
import androidx.compose.ui.text.style.ResolvedTextDirection;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextOverflow;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Density;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.ArrayIteratorKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;

/* JADX INFO: compiled from: AndroidParagraph.android.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0094\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0014\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u001d\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001Bi\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0014\u0010\u0006\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\t0\b0\u0007\u0012\u0012\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\b0\u0007\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\u0006\u0010\u0012\u001a\u00020\u0013\u0012\u0006\u0010\u0014\u001a\u00020\u0015¢\u0006\u0002\u0010\u0016B%\u0012\u0006\u0010\u0017\u001a\u00020\u0018\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011¢\u0006\u0002\u0010\u0019JT\u0010M\u001a\u0002002\u0006\u0010N\u001a\u00020\r2\u0006\u0010O\u001a\u00020\r2\b\u0010P\u001a\u0004\u0018\u00010Q2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010R\u001a\u00020\r2\u0006\u0010S\u001a\u00020\r2\u0006\u0010T\u001a\u00020\r2\u0006\u0010U\u001a\u00020\r2\b\b\u0002\u0010\u001a\u001a\u00020\u001bH\u0002J,\u0010V\u001a\u00020W2\u0006\u0010X\u001a\u00020Y2\u0006\u0010Z\u001a\u00020[2\b\b\u0001\u0010\\\u001a\u00020\rH\u0016ø\u0001\u0000¢\u0006\u0004\b]\u0010^J\u0010\u0010_\u001a\u00020`2\u0006\u0010a\u001a\u00020\rH\u0016J\u0010\u0010b\u001a\u00020>2\u0006\u0010a\u001a\u00020\rH\u0016J\u0010\u0010c\u001a\u00020>2\u0006\u0010a\u001a\u00020\rH\u0016J\u0018\u0010d\u001a\u00020(2\u0006\u0010a\u001a\u00020\r2\u0006\u0010e\u001a\u00020$H\u0016J\u0015\u0010f\u001a\u00020(2\u0006\u0010g\u001a\u00020\rH\u0000¢\u0006\u0002\bhJ\u0010\u0010i\u001a\u00020(2\u0006\u0010g\u001a\u00020\rH\u0016J\u0010\u0010j\u001a\u00020(2\u0006\u0010g\u001a\u00020\rH\u0016J\u0015\u0010k\u001a\u00020(2\u0006\u0010g\u001a\u00020\rH\u0000¢\u0006\u0002\blJ\u0015\u0010m\u001a\u00020\r2\u0006\u0010g\u001a\u00020\rH\u0000¢\u0006\u0002\bnJ\u0015\u0010o\u001a\u00020\r2\u0006\u0010g\u001a\u00020\rH\u0000¢\u0006\u0002\bpJ\u0018\u0010q\u001a\u00020\r2\u0006\u0010g\u001a\u00020\r2\u0006\u0010r\u001a\u00020$H\u0016J\u0010\u0010s\u001a\u00020\r2\u0006\u0010a\u001a\u00020\rH\u0016J\u0010\u0010t\u001a\u00020\r2\u0006\u0010u\u001a\u00020(H\u0016J\u0010\u0010v\u001a\u00020(2\u0006\u0010g\u001a\u00020\rH\u0016J\u0010\u0010w\u001a\u00020(2\u0006\u0010g\u001a\u00020\rH\u0016J\u0010\u0010x\u001a\u00020(2\u0006\u0010g\u001a\u00020\rH\u0016J\u0010\u0010y\u001a\u00020\r2\u0006\u0010g\u001a\u00020\rH\u0016J\u0010\u0010z\u001a\u00020(2\u0006\u0010g\u001a\u00020\rH\u0016J\u0010\u0010{\u001a\u00020(2\u0006\u0010g\u001a\u00020\rH\u0016J\u001b\u0010|\u001a\u00020\r2\u0006\u0010}\u001a\u00020~H\u0016ø\u0001\u0000¢\u0006\u0005\b\u007f\u0010\u0080\u0001J\u0011\u0010\u0081\u0001\u001a\u00020`2\u0006\u0010a\u001a\u00020\rH\u0016J\u001c\u0010\u0082\u0001\u001a\u00030\u0083\u00012\u0007\u0010\u0084\u0001\u001a\u00020\r2\u0007\u0010\u0085\u0001\u001a\u00020\rH\u0016J2\u0010\u0086\u0001\u001a\u00020Y2\u0007\u0010\u0087\u0001\u001a\u00020>2\b\u0010\u0088\u0001\u001a\u00030\u0089\u00012\b\u0010\u008a\u0001\u001a\u00030\u008b\u0001H\u0016ø\u0001\u0000¢\u0006\u0006\b\u008c\u0001\u0010\u008d\u0001J \u0010\u008e\u0001\u001a\u00020Y2\u0006\u0010a\u001a\u00020\rH\u0016ø\u0001\u0001ø\u0001\u0000¢\u0006\u0006\b\u008f\u0001\u0010\u0090\u0001J\u0011\u0010\u0091\u0001\u001a\u00020$2\u0006\u0010g\u001a\u00020\rH\u0016J\u0013\u0010\u0092\u0001\u001a\u00020W2\b\u0010\u0093\u0001\u001a\u00030\u0094\u0001H\u0002J`\u0010\u0092\u0001\u001a\u00020W2\b\u0010\u0093\u0001\u001a\u00030\u0094\u00012\b\u0010\u0095\u0001\u001a\u00030\u0096\u00012\u0007\u0010\u0097\u0001\u001a\u00020(2\n\u0010\u0098\u0001\u001a\u0005\u0018\u00010\u0099\u00012\n\u0010\u009a\u0001\u001a\u0005\u0018\u00010\u009b\u00012\n\u0010\u009c\u0001\u001a\u0005\u0018\u00010\u009d\u00012\b\u0010\u009e\u0001\u001a\u00030\u009f\u0001H\u0016ø\u0001\u0000¢\u0006\u0006\b \u0001\u0010¡\u0001JA\u0010\u0092\u0001\u001a\u00020W2\b\u0010\u0093\u0001\u001a\u00030\u0094\u00012\b\u0010¢\u0001\u001a\u00030£\u00012\n\u0010\u0098\u0001\u001a\u0005\u0018\u00010\u0099\u00012\n\u0010\u009a\u0001\u001a\u0005\u0018\u00010\u009b\u0001H\u0016ø\u0001\u0000¢\u0006\u0006\b¤\u0001\u0010¥\u0001JW\u0010\u0092\u0001\u001a\u00020W2\b\u0010\u0093\u0001\u001a\u00030\u0094\u00012\b\u0010¢\u0001\u001a\u00030£\u00012\n\u0010\u0098\u0001\u001a\u0005\u0018\u00010\u0099\u00012\n\u0010\u009a\u0001\u001a\u0005\u0018\u00010\u009b\u00012\n\u0010\u009c\u0001\u001a\u0005\u0018\u00010\u009d\u00012\b\u0010\u009e\u0001\u001a\u00030\u009f\u0001H\u0016ø\u0001\u0000¢\u0006\u0006\b¦\u0001\u0010§\u0001J\u001d\u0010¨\u0001\u001a\f\u0012\u0005\u0012\u00030ª\u0001\u0018\u00010©\u0001*\u000200H\u0002¢\u0006\u0003\u0010«\u0001J\u001c\u0010¬\u0001\u001a\u00020$*\u00030\u00ad\u00012\f\u0010®\u0001\u001a\u0007\u0012\u0002\b\u00030¯\u0001H\u0002R\u001c\u0010\u001a\u001a\u00020\u001b8\u0000X\u0081\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0019\u0010\u0010\u001a\u00020\u0011ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\"\u001a\u0004\b \u0010!R\u0014\u0010#\u001a\u00020$8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b%\u0010&R\u0014\u0010'\u001a\u00020(8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b)\u0010*R\u0014\u0010+\u001a\u00020(8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b,\u0010*R\u0014\u0010-\u001a\u00020(8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b.\u0010*R\u000e\u0010/\u001a\u000200X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u00101\u001a\u00020\r8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b2\u00103R\u0014\u00104\u001a\u00020(8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b5\u0010*R\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b6\u00103R\u0014\u00107\u001a\u00020(8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b8\u0010*R\u0019\u0010\u000e\u001a\u00020\u000fø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010:\u001a\u0004\b9\u00103R\u0011\u0010\u0017\u001a\u00020\u0018¢\u0006\b\n\u0000\u001a\u0004\b;\u0010<R\u001c\u0010=\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010>0\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b?\u0010@R\u001a\u0010A\u001a\u00020B8@X\u0081\u0004¢\u0006\f\u0012\u0004\bC\u0010\u001d\u001a\u0004\bD\u0010ER\u001a\u0010F\u001a\u00020G8@X\u0081\u0004¢\u0006\f\u0012\u0004\bH\u0010\u001d\u001a\u0004\bI\u0010JR\u0014\u0010K\u001a\u00020(8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bL\u0010*\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006°\u0001"}, d2 = {"Landroidx/compose/ui/text/AndroidParagraph;", "Landroidx/compose/ui/text/Paragraph;", "text", "", "style", "Landroidx/compose/ui/text/TextStyle;", "annotations", "", "Landroidx/compose/ui/text/AnnotatedString$Range;", "Landroidx/compose/ui/text/AnnotatedString$Annotation;", "placeholders", "Landroidx/compose/ui/text/Placeholder;", "maxLines", "", "overflow", "Landroidx/compose/ui/text/style/TextOverflow;", "constraints", "Landroidx/compose/ui/unit/Constraints;", "fontFamilyResolver", "Landroidx/compose/ui/text/font/FontFamily$Resolver;", "density", "Landroidx/compose/ui/unit/Density;", "(Ljava/lang/String;Landroidx/compose/ui/text/TextStyle;Ljava/util/List;Ljava/util/List;IIJLandroidx/compose/ui/text/font/FontFamily$Resolver;Landroidx/compose/ui/unit/Density;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "paragraphIntrinsics", "Landroidx/compose/ui/text/platform/AndroidParagraphIntrinsics;", "(Landroidx/compose/ui/text/platform/AndroidParagraphIntrinsics;IIJLkotlin/jvm/internal/DefaultConstructorMarker;)V", "charSequence", "", "getCharSequence$ui_text_release$annotations", "()V", "getCharSequence$ui_text_release", "()Ljava/lang/CharSequence;", "getConstraints-msEJaDk", "()J", "J", "didExceedMaxLines", "", "getDidExceedMaxLines", "()Z", "firstBaseline", "", "getFirstBaseline", "()F", "height", "getHeight", "lastBaseline", "getLastBaseline", "layout", "Landroidx/compose/ui/text/android/TextLayout;", "lineCount", "getLineCount", "()I", "maxIntrinsicWidth", "getMaxIntrinsicWidth", "getMaxLines", "minIntrinsicWidth", "getMinIntrinsicWidth", "getOverflow-gIe3tQ8", "I", "getParagraphIntrinsics", "()Landroidx/compose/ui/text/platform/AndroidParagraphIntrinsics;", "placeholderRects", "Landroidx/compose/ui/geometry/Rect;", "getPlaceholderRects", "()Ljava/util/List;", "textLocale", "Ljava/util/Locale;", "getTextLocale$ui_text_release$annotations", "getTextLocale$ui_text_release", "()Ljava/util/Locale;", "textPaint", "Landroidx/compose/ui/text/platform/AndroidTextPaint;", "getTextPaint$ui_text_release$annotations", "getTextPaint$ui_text_release", "()Landroidx/compose/ui/text/platform/AndroidTextPaint;", "width", "getWidth", "constructTextLayout", "alignment", "justificationMode", "ellipsize", "Landroid/text/TextUtils$TruncateAt;", "hyphens", "breakStrategy", "lineBreakStyle", "lineBreakWordStyle", "fillBoundingBoxes", "", "range", "Landroidx/compose/ui/text/TextRange;", "array", "", "arrayStart", "fillBoundingBoxes-8ffj60Q", "(J[FI)V", "getBidiRunDirection", "Landroidx/compose/ui/text/style/ResolvedTextDirection;", "offset", "getBoundingBox", "getCursorRect", "getHorizontalPosition", "usePrimaryDirection", "getLineAscent", "lineIndex", "getLineAscent$ui_text_release", "getLineBaseline", "getLineBottom", "getLineDescent", "getLineDescent$ui_text_release", "getLineEllipsisCount", "getLineEllipsisCount$ui_text_release", "getLineEllipsisOffset", "getLineEllipsisOffset$ui_text_release", "getLineEnd", "visibleEnd", "getLineForOffset", "getLineForVerticalPosition", "vertical", "getLineHeight", "getLineLeft", "getLineRight", "getLineStart", "getLineTop", "getLineWidth", "getOffsetForPosition", "position", "Landroidx/compose/ui/geometry/Offset;", "getOffsetForPosition-k-4lQ0M", "(J)I", "getParagraphDirection", "getPathForRange", "Landroidx/compose/ui/graphics/Path;", "start", "end", "getRangeForRect", "rect", "granularity", "Landroidx/compose/ui/text/TextGranularity;", "inclusionStrategy", "Landroidx/compose/ui/text/TextInclusionStrategy;", "getRangeForRect-8-6BmAI", "(Landroidx/compose/ui/geometry/Rect;ILandroidx/compose/ui/text/TextInclusionStrategy;)J", "getWordBoundary", "getWordBoundary--jx7JFs", "(I)J", "isLineEllipsized", "paint", "canvas", "Landroidx/compose/ui/graphics/Canvas;", "brush", "Landroidx/compose/ui/graphics/Brush;", "alpha", "shadow", "Landroidx/compose/ui/graphics/Shadow;", "textDecoration", "Landroidx/compose/ui/text/style/TextDecoration;", "drawStyle", "Landroidx/compose/ui/graphics/drawscope/DrawStyle;", "blendMode", "Landroidx/compose/ui/graphics/BlendMode;", "paint-hn5TExg", "(Landroidx/compose/ui/graphics/Canvas;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Shadow;Landroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/graphics/drawscope/DrawStyle;I)V", "color", "Landroidx/compose/ui/graphics/Color;", "paint-RPmYEkk", "(Landroidx/compose/ui/graphics/Canvas;JLandroidx/compose/ui/graphics/Shadow;Landroidx/compose/ui/text/style/TextDecoration;)V", "paint-LG529CI", "(Landroidx/compose/ui/graphics/Canvas;JLandroidx/compose/ui/graphics/Shadow;Landroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/graphics/drawscope/DrawStyle;I)V", "getShaderBrushSpans", "", "Landroidx/compose/ui/text/platform/style/ShaderBrushSpan;", "(Landroidx/compose/ui/text/android/TextLayout;)[Landroidx/compose/ui/text/platform/style/ShaderBrushSpan;", "hasSpan", "Landroid/text/Spanned;", "clazz", "Ljava/lang/Class;", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class AndroidParagraph implements Paragraph {
    public static final int $stable = 0;
    private final CharSequence charSequence;
    private final long constraints;
    private final TextLayout layout;
    private final int maxLines;
    private final int overflow;
    private final AndroidParagraphIntrinsics paragraphIntrinsics;
    private final List<Rect> placeholderRects;

    /* JADX INFO: compiled from: AndroidParagraph.android.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0 = null;

        static {
            int[] r0 = new int[ResolvedTextDirection.values().length];
            r0[ResolvedTextDirection.Ltr.ordinal()] = 1;     // Catch: NoSuchFieldError -> L5
        L11:
            r0[ResolvedTextDirection.Rtl.ordinal()] = 2;     // Catch: NoSuchFieldError -> L8
        L9:
            $EnumSwitchMapping$0 = r0;
        }
    }

    static {
        $stable = 8;
    }

    public /* synthetic */ AndroidParagraph(AndroidParagraphIntrinsics r1, int r2, int r3, long r4, DefaultConstructorMarker r6) {
        this(r1, r2, r3, r4);
    }

    public /* synthetic */ AndroidParagraph(String r1, TextStyle r2, List r3, List r4, int r5, int r6, long r7, FontFamily.Resolver r9, Density r10, DefaultConstructorMarker r11) {
        this(r1, r2, r3, r4, r5, r6, r7, r9, r10);
    }

    public static /* synthetic */ void getCharSequence$ui_text_release$annotations() {
    }

    public static /* synthetic */ void getTextLocale$ui_text_release$annotations() {
    }

    public static /* synthetic */ void getTextPaint$ui_text_release$annotations() {
    }

    private AndroidParagraph(AndroidParagraphIntrinsics paragraphIntrinsics, int maxLines, int overflow, long constraints) {
        this.paragraphIntrinsics = paragraphIntrinsics;
        this.maxLines = maxLines;
        this.overflow = overflow;
        this.constraints = constraints;
        if (Constraints.m6927getMinHeightimpl(this.constraints) == 0) goto L5;
    L7:
        boolean value$iv = false;
    L9:
        if (value$iv == true) goto L12;
        InlineClassHelperKt.throwIllegalArgumentException("Setting Constraints.minWidth and Constraints.minHeight is not supported, these should be the default zero values instead.");
    L12:
        if (this.maxLines < 1) goto L14;
        boolean value$iv2 = true;
    L16:
        if (value$iv2 == true) goto L18;
        InlineClassHelperKt.throwIllegalArgumentException("maxLines should be greater than 0");
    L18:
        TextStyle style = this.paragraphIntrinsics.getStyle();
        boolean r5 = AndroidParagraph_androidKt.access$shouldAttachIndentationFixSpan(style, TextOverflow.m6877equalsimpl0(this.overflow, TextOverflow.Companion.m6887getEllipsisgIe3tQ8()));
        AndroidParagraphIntrinsics r6 = this.paragraphIntrinsics;
        if (r5 == false) goto L21;
        CharSequence r7 = AndroidParagraph_androidKt.access$attachIndentationFixSpan(r6.getCharSequence$ui_text_release());
    L22:
        this.charSequence = r7;
        int alignment = AndroidParagraph_androidKt.m6234access$toLayoutAlignaXe7zB0(style.m6458getTextAligne0LSkKk());
        if (TextAlign.m6831equalsimpl0(style.m6458getTextAligne0LSkKk(), TextAlign.Companion.m6837getJustifye0LSkKk()) == false) goto L25;
        int justificationMode = 1;
    L26:
        int hyphens = AndroidParagraph_androidKt.m6236access$toLayoutHyphenationFrequency3fSNIE(style.getParagraphStyle$ui_text_release().m6307getHyphensvmbZdU8());
        int breakStrategy = AndroidParagraph_androidKt.m6235access$toLayoutBreakStrategyxImikfE(LineBreak.m6743getStrategyfcGXIks(style.m6455getLineBreakrAG3T2k()));
        int lineBreakStyle = AndroidParagraph_androidKt.m6237access$toLayoutLineBreakStylehpcqdu8(LineBreak.m6744getStrictnessusljTpc(style.m6455getLineBreakrAG3T2k()));
        int lineBreakWordStyle = AndroidParagraph_androidKt.m6238access$toLayoutLineBreakWordStylewPN0Rpw(LineBreak.m6745getWordBreakjp8hJ3c(style.m6455getLineBreakrAG3T2k()));
        int r11 = this.overflow;
        if (TextOverflow.m6877equalsimpl0(r11, TextOverflow.Companion.m6887getEllipsisgIe3tQ8()) == false) goto L30;
        TextUtils.TruncateAt ellipsize = TextUtils.TruncateAt.END;
    L36:
        TextUtils.TruncateAt ellipsize2 = ellipsize;
        int justificationMode2 = justificationMode;
        int afterEllipsis = alignment;
        TextLayout firstLayout = constructTextLayout$default(this, afterEllipsis, justificationMode2, ellipsize2, this.maxLines, hyphens, breakStrategy, lineBreakStyle, lineBreakWordStyle, null, 256, null);
        if (Build.VERSION.SDK_INT < 35) goto L39;
    L50:
        TextLayout firstLayout2 = firstLayout;
    L52:
        if (TextOverflow.m6877equalsimpl0(this.overflow, TextOverflow.Companion.m6887getEllipsisgIe3tQ8()) == true) goto L54;
    L64:
        this.layout = firstLayout2;
    L65:
        AndroidTextPaint r4 = getTextPaint$ui_text_release();
        Brush r9 = style.getBrush();
        float width$iv = getWidth();
        float height$iv = getHeight();
        int alignment2 = Float.floatToRawIntBits(width$iv);
        long v1$iv$iv = alignment2;
        long v2$iv$iv = Float.floatToRawIntBits(height$iv);
        long v2$iv$iv2 = Size.m4185constructorimpl((v1$iv$iv << 32) | (v2$iv$iv & 4294967295L));
        float width$iv2 = style.getAlpha();
        r4.m6683setBrush12SF9DM(r9, v2$iv$iv2, width$iv2);
        ShaderBrushSpan[] shaderBrushSpans = getShaderBrushSpans(this.layout);
        if (shaderBrushSpans == null) goto L73;
        Iterator r2 = ArrayIteratorKt.iterator(shaderBrushSpans);
    L69:
        if (r2.hasNext() == false) goto L73;
        ShaderBrushSpan shaderBrushSpan = (ShaderBrushSpan) r2.next();
        float width$iv3 = getWidth();
        float height$iv2 = getHeight();
        ShaderBrushSpan[] shaderBrushSpans2 = shaderBrushSpans;
        long v1$iv$iv2 = Float.floatToRawIntBits(width$iv3);
        long v2$iv$iv3 = Float.floatToRawIntBits(height$iv2);
        shaderBrushSpan.m6706setSizeuvyYCjk(Size.m4185constructorimpl((v1$iv$iv2 << 32) | (v2$iv$iv3 & 4294967295L)));
        shaderBrushSpans = shaderBrushSpans2;
        r2 = r2;
    L73:
        CharSequence $this$placeholderRects_u24lambda_u245 = this.charSequence;
        int r3 = 0;
        if (($this$placeholderRects_u24lambda_u245 instanceof Spanned) == true) goto L76;
        List<Rect> r8 = CollectionsKt.emptyList();
    L118:
        this.placeholderRects = r8;
        return;
    L76:
        Object[] $this$map$iv = ((Spanned) $this$placeholderRects_u24lambda_u245).getSpans(0, $this$placeholderRects_u24lambda_u245.length(), PlaceholderSpan.class);
        int $i$f$map = 0;
        Collection destination$iv$iv = new ArrayList($this$map$iv.length);
        Object[] $this$mapTo$iv$iv = $this$map$iv;
        int r10 = $this$mapTo$iv$iv.length;
        int r12 = 0;
    L77:
        if (r12 >= r10) goto L117;
        Object item$iv$iv = $this$mapTo$iv$iv[r12];
        PlaceholderSpan span = (PlaceholderSpan) item$iv$iv;
        int start = ((Spanned) $this$placeholderRects_u24lambda_u245).getSpanStart(span);
        CharSequence $this$placeholderRects_u24lambda_u246 = $this$placeholderRects_u24lambda_u245;
        int end = ((Spanned) $this$placeholderRects_u24lambda_u246).getSpanEnd(span);
        int r21 = r3;
        int line = this.layout.getLineForOffset(start);
        Object[] $this$map$iv2 = $this$map$iv;
        if (line < this.maxLines) goto L81;
        boolean exceedsMaxLines = true;
    L82:
        boolean exceedsMaxLines2 = exceedsMaxLines;
        if (this.layout.getLineEllipsisCount(line) > 0) goto L85;
    L87:
        boolean isPlaceholderSpanEllipsized = false;
    L88:
        boolean isPlaceholderSpanEllipsized2 = isPlaceholderSpanEllipsized;
        if (end <= this.layout.getLineEnd(line)) goto L91;
        boolean isPlaceholderSpanTruncated = true;
    L92:
        if (isPlaceholderSpanEllipsized2 == true) goto L115;
        if (isPlaceholderSpanTruncated == true) goto L115;
        if (exceedsMaxLines2 == true) goto L115;
        ResolvedTextDirection direction = getBidiRunDirection(start);
        switch(WhenMappings.$EnumSwitchMapping$0[direction.ordinal()]) {
            case 1: goto L101;
            case 2: goto L100;
            default: goto L99;
        };
    L100:
        float r19 = getHorizontalPosition(start, true) - span.getWidthPx();
    L102:
        float left = r19;
        float right = left + span.getWidthPx();
        TextLayout $this$placeholderRects_u24lambda_u245_u24lambda_u244_u24lambda_u243 = this.layout;
        switch(span.getVerticalAlign()) {
            case 0: goto L112;
            case 1: goto L111;
            case 2: goto L110;
            case 3: goto L109;
            case 4: goto L108;
            case 5: goto L107;
            case 6: goto L106;
            default: goto L105;
        };
    L106:
        Paint.FontMetricsInt $this$placeholderRects_u24lambda_u245_u24lambda_u244_u24lambda_u243_u24lambda_u242 = span.getFontMetrics();
        float top = ((($this$placeholderRects_u24lambda_u245_u24lambda_u244_u24lambda_u243_u24lambda_u242.ascent + $this$placeholderRects_u24lambda_u245_u24lambda_u244_u24lambda_u243_u24lambda_u242.descent) - span.getHeightPx()) / 2) + $this$placeholderRects_u24lambda_u245_u24lambda_u244_u24lambda_u243.getLineBaseline(line);
    L113:
        float bottom = span.getHeightPx() + top;
        Rect r13 = new Rect(left, top, right, bottom);
    L116:
        destination$iv$iv.add(r13);
        r12 = r12 + 1;
        $this$placeholderRects_u24lambda_u245 = $this$placeholderRects_u24lambda_u246;
        r3 = r21;
        $this$map$iv = $this$map$iv2;
        $i$f$map = $i$f$map;
        $this$mapTo$iv$iv = $this$mapTo$iv$iv;
        goto L77
    L107:
        top = (span.getFontMetrics().descent + $this$placeholderRects_u24lambda_u245_u24lambda_u244_u24lambda_u243.getLineBaseline(line)) - span.getHeightPx();
        goto L113
    L108:
        top = $this$placeholderRects_u24lambda_u245_u24lambda_u244_u24lambda_u243.getLineBaseline(line) + span.getFontMetrics().ascent;
        goto L113
    L109:
        top = (($this$placeholderRects_u24lambda_u245_u24lambda_u244_u24lambda_u243.getLineTop(line) + $this$placeholderRects_u24lambda_u245_u24lambda_u244_u24lambda_u243.getLineBottom(line)) - span.getHeightPx()) / 2.0f;
        goto L113
    L110:
        top = $this$placeholderRects_u24lambda_u245_u24lambda_u244_u24lambda_u243.getLineBottom(line) - span.getHeightPx();
        goto L113
    L111:
        top = $this$placeholderRects_u24lambda_u245_u24lambda_u244_u24lambda_u243.getLineTop(line);
        goto L113
    L112:
        top = $this$placeholderRects_u24lambda_u245_u24lambda_u244_u24lambda_u243.getLineBaseline(line) - span.getHeightPx();
        goto L113
    L105:
        throw new IllegalStateException("unexpected verticalAlignment");
    L101:
        r19 = getHorizontalPosition(start, true);
        goto L102
    L99:
        throw new NoWhenBranchMatchedException();
    L115:
        r13 = null;
        goto L116
    L91:
        isPlaceholderSpanTruncated = false;
        goto L92
    L85:
        if (end <= this.layout.getLineEllipsisOffset(line)) goto L87;
        isPlaceholderSpanEllipsized = true;
        goto L88
    L81:
        exceedsMaxLines = false;
        goto L82
    L117:
        r8 = (List) destination$iv$iv;
        goto L118
    L54:
        if (firstLayout2.getHeight() <= Constraints.m6925getMaxHeightimpl(this.constraints)) goto L64;
        if (this.maxLines <= 1) goto L64;
        int calculatedMaxLines = AndroidParagraph_androidKt.access$numberOfLinesThatFitMaxHeight(firstLayout2, Constraints.m6925getMaxHeightimpl(this.constraints));
        if (calculatedMaxLines >= 0) goto L60;
    L62:
        TextLayout r14 = firstLayout2;
    L63:
        this.layout = r14;
        goto L65
    L60:
        if (calculatedMaxLines == this.maxLines) goto L62;
        r14 = constructTextLayout$default(this, afterEllipsis, justificationMode2, ellipsize2, RangesKt.coerceAtLeast(calculatedMaxLines, 1), hyphens, breakStrategy, lineBreakStyle, lineBreakWordStyle, null, 256, null);
        goto L63
    L39:
        if (getTextPaint$ui_text_release().getLetterSpacing() != 0.0f) goto L41;
        boolean r15 = true;
    L42:
        if (r15 == true) goto L50;
        if (TextOverflow.m6877equalsimpl0(this.overflow, TextOverflow.Companion.m6889getStartEllipsisgIe3tQ8()) == true) goto L48;
        if (TextOverflow.m6877equalsimpl0(this.overflow, TextOverflow.Companion.m6888getMiddleEllipsisgIe3tQ8()) == false) goto L50;
    L48:
        if (firstLayout.getLineEllipsisCount(0) <= 0) goto L50;
        int beforeEllipsis = firstLayout.getLineEllipsisOffset(0);
        CharSequence newSpannable = TextUtils.concat(new CharSequence[]{this.charSequence.subSequence(0, beforeEllipsis), "…", this.charSequence.subSequence(firstLayout.getLineEllipsisCount(0) + beforeEllipsis, this.charSequence.length())});
        afterEllipsis = afterEllipsis;
        firstLayout2 = constructTextLayout(afterEllipsis, justificationMode2, ellipsize2, this.maxLines, hyphens, breakStrategy, lineBreakStyle, lineBreakWordStyle, newSpannable);
        goto L52
    L41:
        r15 = false;
        goto L42
    L30:
        if (TextOverflow.m6877equalsimpl0(r11, TextOverflow.Companion.m6888getMiddleEllipsisgIe3tQ8()) == false) goto L33;
        ellipsize = TextUtils.TruncateAt.MIDDLE;
        goto L36
    L33:
        if (TextOverflow.m6877equalsimpl0(r11, TextOverflow.Companion.m6889getStartEllipsisgIe3tQ8()) == false) goto L35;
        ellipsize = TextUtils.TruncateAt.START;
        goto L36
    L35:
        ellipsize = null;
        goto L36
    L25:
        justificationMode = 0;
        goto L26
    L21:
        r7 = r6.getCharSequence$ui_text_release();
        goto L22
    L14:
        value$iv2 = false;
        goto L16
    L5:
        if (Constraints.m6928getMinWidthimpl(this.constraints) != 0) goto L7;
        value$iv = true;
        goto L9
    }

    public final AndroidParagraphIntrinsics getParagraphIntrinsics() {
        return this.paragraphIntrinsics;
    }

    public final int getMaxLines() {
        return this.maxLines;
    }

    /* JADX INFO: renamed from: getOverflow-gIe3tQ8, reason: not valid java name */
    public final int m6228getOverflowgIe3tQ8() {
        return this.overflow;
    }

    /* JADX INFO: renamed from: getConstraints-msEJaDk, reason: not valid java name */
    public final long m6226getConstraintsmsEJaDk() {
        return this.constraints;
    }

    private AndroidParagraph(String text, TextStyle style, List<? extends AnnotatedString.Range<? extends AnnotatedString.Annotation>> r10, List<AnnotatedString.Range<Placeholder>> r11, int maxLines, int overflow, long constraints, FontFamily.Resolver fontFamilyResolver, Density density) {
        this(new AndroidParagraphIntrinsics(text, style, r10, r11, fontFamilyResolver, density), maxLines, overflow, constraints, null);
    }

    public final CharSequence getCharSequence$ui_text_release() {
        return this.charSequence;
    }

    @Override // androidx.compose.ui.text.Paragraph
    public float getWidth() {
        return Constraints.m6926getMaxWidthimpl(this.constraints);
    }

    @Override // androidx.compose.ui.text.Paragraph
    public float getHeight() {
        return this.layout.getHeight();
    }

    @Override // androidx.compose.ui.text.Paragraph
    public float getMaxIntrinsicWidth() {
        return this.paragraphIntrinsics.getMaxIntrinsicWidth();
    }

    @Override // androidx.compose.ui.text.Paragraph
    public float getMinIntrinsicWidth() {
        return this.paragraphIntrinsics.getMinIntrinsicWidth();
    }

    @Override // androidx.compose.ui.text.Paragraph
    public float getFirstBaseline() {
        return getLineBaseline(0);
    }

    @Override // androidx.compose.ui.text.Paragraph
    public float getLastBaseline() {
        return getLineBaseline(getLineCount() - 1);
    }

    @Override // androidx.compose.ui.text.Paragraph
    public boolean getDidExceedMaxLines() {
        return this.layout.getDidExceedMaxLines();
    }

    public final Locale getTextLocale$ui_text_release() {
        return this.paragraphIntrinsics.getTextPaint$ui_text_release().getTextLocale();
    }

    @Override // androidx.compose.ui.text.Paragraph
    public int getLineCount() {
        return this.layout.getLineCount();
    }

    @Override // androidx.compose.ui.text.Paragraph
    public List<Rect> getPlaceholderRects() {
        return this.placeholderRects;
    }

    public final AndroidTextPaint getTextPaint$ui_text_release() {
        return this.paragraphIntrinsics.getTextPaint$ui_text_release();
    }

    @Override // androidx.compose.ui.text.Paragraph
    public int getLineForVerticalPosition(float vertical) {
        return this.layout.getLineForVertical((int) vertical);
    }

    @Override // androidx.compose.ui.text.Paragraph
    /* JADX INFO: renamed from: getOffsetForPosition-k-4lQ0M, reason: not valid java name */
    public int mo6227getOffsetForPositionk4lQ0M(long position) {
        int bits$iv$iv$iv = (int) (4294967295L & position);
        int line = this.layout.getLineForVertical((int) Float.intBitsToFloat(bits$iv$iv$iv));
        int bits$iv$iv$iv2 = (int) (position >> 32);
        return this.layout.getOffsetForHorizontal(line, Float.intBitsToFloat(bits$iv$iv$iv2));
    }

    @Override // androidx.compose.ui.text.Paragraph
    /* JADX INFO: renamed from: getRangeForRect-8-6BmAI, reason: not valid java name */
    public long mo6229getRangeForRect86BmAI(Rect rect, int granularity, final TextInclusionStrategy inclusionStrategy) {
        int[] range = this.layout.getRangeForRect(RectHelper_androidKt.toAndroidRectF(rect), AndroidParagraph_androidKt.m6239access$toLayoutTextGranularityduNsdkg(granularity), new AndroidParagraph$getRangeForRect$range$1(inclusionStrategy));
        if (range != null) goto L7;
        return TextRange.Companion.m6422getZerod9O1mEE();
    L7:
        return TextRangeKt.TextRange(range[0], range[1]);
    }

    @Override // androidx.compose.ui.text.Paragraph
    public Rect getBoundingBox(int offset) {
        boolean value$iv = false;
        if (offset < 0) goto L8;
        if (offset >= this.charSequence.length()) goto L8;
        value$iv = true;
    L8:
        if (value$iv == true) goto L10;
        InlineClassHelperKt.throwIllegalArgumentException("offset(" + offset + ") is out of bounds [0," + this.charSequence.length() + ')');
    L10:
        RectF rectF = this.layout.getBoundingBox(offset);
        return new Rect(rectF.left, rectF.top, rectF.right, rectF.bottom);
    }

    @Override // androidx.compose.ui.text.Paragraph
    /* JADX INFO: renamed from: fillBoundingBoxes-8ffj60Q, reason: not valid java name */
    public void mo6225fillBoundingBoxes8ffj60Q(long range, float[] array, int arrayStart) {
        this.layout.fillBoundingBoxes(TextRange.m6415getMinimpl(range), TextRange.m6414getMaximpl(range), array, arrayStart);
    }

    @Override // androidx.compose.ui.text.Paragraph
    public Path getPathForRange(int start, int end) {
        boolean value$iv = true;
        if (start < 0) goto L6;
        if (start > end) goto L6;
        boolean r2 = true;
    L7:
        if (r2 == true) goto L9;
    L11:
        value$iv = false;
    L13:
        if (value$iv == true) goto L15;
        InlineClassHelperKt.throwIllegalArgumentException("start(" + start + ") or end(" + end + ") is out of range [0.." + this.charSequence.length() + "], or start > end!");
    L15:
        android.graphics.Path path = new android.graphics.Path();
        this.layout.getSelectionPath(start, end, path);
        return AndroidPath_androidKt.asComposePath(path);
    L9:
        if (end > this.charSequence.length()) goto L11;
    L6:
        r2 = false;
        goto L7
    }

    @Override // androidx.compose.ui.text.Paragraph
    public Rect getCursorRect(int offset) {
        if (offset >= 0) goto L5;
    L7:
        boolean value$iv = false;
    L9:
        if (value$iv == true) goto L11;
        InlineClassHelperKt.throwIllegalArgumentException("offset(" + offset + ") is out of bounds [0," + this.charSequence.length() + ']');
    L11:
        float horizontal = TextLayout.getPrimaryHorizontal$default(this.layout, offset, false, 2, null);
        int line = this.layout.getLineForOffset(offset);
        return new Rect(horizontal, this.layout.getLineTop(line), horizontal, this.layout.getLineBottom(line));
    L5:
        if (offset > this.charSequence.length()) goto L7;
        value$iv = true;
        goto L9
    }

    @Override // androidx.compose.ui.text.Paragraph
    /* JADX INFO: renamed from: getWordBoundary--jx7JFs, reason: not valid java name */
    public long mo6230getWordBoundaryjx7JFs(int offset) {
        WordIterator wordIterator = this.layout.getWordIterator();
        return TextRangeKt.TextRange(WordBoundary_androidKt.getWordStart(wordIterator, offset), WordBoundary_androidKt.getWordEnd(wordIterator, offset));
    }

    @Override // androidx.compose.ui.text.Paragraph
    public float getLineLeft(int lineIndex) {
        return this.layout.getLineLeft(lineIndex);
    }

    @Override // androidx.compose.ui.text.Paragraph
    public float getLineRight(int lineIndex) {
        return this.layout.getLineRight(lineIndex);
    }

    @Override // androidx.compose.ui.text.Paragraph
    public float getLineTop(int lineIndex) {
        return this.layout.getLineTop(lineIndex);
    }

    public final float getLineAscent$ui_text_release(int lineIndex) {
        return this.layout.getLineAscent(lineIndex);
    }

    @Override // androidx.compose.ui.text.Paragraph
    public float getLineBaseline(int lineIndex) {
        return this.layout.getLineBaseline(lineIndex);
    }

    public final float getLineDescent$ui_text_release(int lineIndex) {
        return this.layout.getLineDescent(lineIndex);
    }

    @Override // androidx.compose.ui.text.Paragraph
    public float getLineBottom(int lineIndex) {
        return this.layout.getLineBottom(lineIndex);
    }

    @Override // androidx.compose.ui.text.Paragraph
    public float getLineHeight(int lineIndex) {
        return this.layout.getLineHeight(lineIndex);
    }

    @Override // androidx.compose.ui.text.Paragraph
    public float getLineWidth(int lineIndex) {
        return this.layout.getLineWidth(lineIndex);
    }

    @Override // androidx.compose.ui.text.Paragraph
    public int getLineStart(int lineIndex) {
        return this.layout.getLineStart(lineIndex);
    }

    @Override // androidx.compose.ui.text.Paragraph
    public int getLineEnd(int lineIndex, boolean visibleEnd) {
        TextLayout r0 = this.layout;
        if (visibleEnd == false) goto L6;
        return r0.getLineVisibleEnd(lineIndex);
    L6:
        return r0.getLineEnd(lineIndex);
    }

    @Override // androidx.compose.ui.text.Paragraph
    public boolean isLineEllipsized(int lineIndex) {
        return this.layout.isLineEllipsized(lineIndex);
    }

    public final int getLineEllipsisOffset$ui_text_release(int lineIndex) {
        return this.layout.getLineEllipsisOffset(lineIndex);
    }

    public final int getLineEllipsisCount$ui_text_release(int lineIndex) {
        return this.layout.getLineEllipsisCount(lineIndex);
    }

    @Override // androidx.compose.ui.text.Paragraph
    public int getLineForOffset(int offset) {
        return this.layout.getLineForOffset(offset);
    }

    @Override // androidx.compose.ui.text.Paragraph
    public float getHorizontalPosition(int offset, boolean usePrimaryDirection) {
        TextLayout r0 = this.layout;
        if (usePrimaryDirection == false) goto L6;
        return TextLayout.getPrimaryHorizontal$default(r0, offset, false, 2, null);
    L6:
        return TextLayout.getSecondaryHorizontal$default(r0, offset, false, 2, null);
    }

    @Override // androidx.compose.ui.text.Paragraph
    public ResolvedTextDirection getParagraphDirection(int offset) {
        int lineIndex = this.layout.getLineForOffset(offset);
        int direction = this.layout.getParagraphDirection(lineIndex);
        if (direction != 1) goto L6;
        return ResolvedTextDirection.Ltr;
    L6:
        return ResolvedTextDirection.Rtl;
    }

    @Override // androidx.compose.ui.text.Paragraph
    public ResolvedTextDirection getBidiRunDirection(int offset) {
        if (this.layout.isRtlCharAt(offset) == false) goto L6;
        return ResolvedTextDirection.Rtl;
    L6:
        return ResolvedTextDirection.Ltr;
    }

    private final ShaderBrushSpan[] getShaderBrushSpans(TextLayout $this$getShaderBrushSpans) {
        if (($this$getShaderBrushSpans.getText() instanceof Spanned) == true) goto L5;
        return null;
    L5:
        CharSequence r0 = $this$getShaderBrushSpans.getText();
        Intrinsics.checkNotNull(r0, "null cannot be cast to non-null type android.text.Spanned");
        if (hasSpan((Spanned) r0, ShaderBrushSpan.class) == true) goto L8;
        return null;
    L8:
        CharSequence r1 = $this$getShaderBrushSpans.getText();
        Intrinsics.checkNotNull(r1, "null cannot be cast to non-null type android.text.Spanned");
        ShaderBrushSpan[] brushSpans = (ShaderBrushSpan[]) ((Spanned) r1).getSpans(0, $this$getShaderBrushSpans.getText().length(), ShaderBrushSpan.class);
        return brushSpans;
    }

    private final boolean hasSpan(Spanned $this$hasSpan, Class<?> r4) {
        if ($this$hasSpan.nextSpanTransition(-1, $this$hasSpan.length(), r4) == $this$hasSpan.length()) goto L5;
        return true;
    L5:
        return false;
    }

    @Override // androidx.compose.ui.text.Paragraph
    /* JADX INFO: renamed from: paint-RPmYEkk, reason: not valid java name */
    public void mo6232paintRPmYEkk(Canvas canvas, long color, Shadow shadow, TextDecoration textDecoration) {
        AndroidTextPaint $this$paint_RPmYEkk_u24lambda_u2410 = getTextPaint$ui_text_release();
        $this$paint_RPmYEkk_u24lambda_u2410.m6685setColor8_81llA(color);
        $this$paint_RPmYEkk_u24lambda_u2410.setShadow(shadow);
        $this$paint_RPmYEkk_u24lambda_u2410.setTextDecoration(textDecoration);
        paint(canvas);
    }

    @Override // androidx.compose.ui.text.Paragraph
    /* JADX INFO: renamed from: paint-LG529CI, reason: not valid java name */
    public void mo6231paintLG529CI(Canvas canvas, long color, Shadow shadow, TextDecoration textDecoration, DrawStyle drawStyle, int blendMode) {
        int currBlendMode = getTextPaint$ui_text_release().m6680getBlendMode0nO6VwU();
        AndroidTextPaint $this$paint_LG529CI_u24lambda_u2411 = getTextPaint$ui_text_release();
        $this$paint_LG529CI_u24lambda_u2411.m6685setColor8_81llA(color);
        $this$paint_LG529CI_u24lambda_u2411.setShadow(shadow);
        $this$paint_LG529CI_u24lambda_u2411.setTextDecoration(textDecoration);
        $this$paint_LG529CI_u24lambda_u2411.setDrawStyle(drawStyle);
        $this$paint_LG529CI_u24lambda_u2411.m6682setBlendModes9anfk8(blendMode);
        paint(canvas);
        getTextPaint$ui_text_release().m6682setBlendModes9anfk8(currBlendMode);
    }

    @Override // androidx.compose.ui.text.Paragraph
    /* JADX INFO: renamed from: paint-hn5TExg, reason: not valid java name */
    public void mo6233painthn5TExg(Canvas canvas, Brush brush, float alpha, Shadow shadow, TextDecoration textDecoration, DrawStyle drawStyle, int blendMode) {
        int currBlendMode = getTextPaint$ui_text_release().m6680getBlendMode0nO6VwU();
        AndroidTextPaint $this$paint_hn5TExg_u24lambda_u2412 = getTextPaint$ui_text_release();
        float width$iv = getWidth();
        float height$iv = getHeight();
        long v1$iv$iv = Float.floatToRawIntBits(width$iv);
        long v2$iv$iv = Float.floatToRawIntBits(height$iv);
        $this$paint_hn5TExg_u24lambda_u2412.m6683setBrush12SF9DM(brush, Size.m4185constructorimpl((v1$iv$iv << 32) | (4294967295L & v2$iv$iv)), alpha);
        $this$paint_hn5TExg_u24lambda_u2412.setShadow(shadow);
        $this$paint_hn5TExg_u24lambda_u2412.setTextDecoration(textDecoration);
        $this$paint_hn5TExg_u24lambda_u2412.setDrawStyle(drawStyle);
        $this$paint_hn5TExg_u24lambda_u2412.m6682setBlendModes9anfk8(blendMode);
        paint(canvas);
        getTextPaint$ui_text_release().m6682setBlendModes9anfk8(currBlendMode);
    }

    private final void paint(Canvas canvas) {
        android.graphics.Canvas nativeCanvas = AndroidCanvas_androidKt.getNativeCanvas(canvas);
        if (getDidExceedMaxLines() == false) goto L5;
        nativeCanvas.save();
        nativeCanvas.clipRect(0.0f, 0.0f, getWidth(), getHeight());
    L5:
        this.layout.paint(nativeCanvas);
        if (getDidExceedMaxLines() == false) goto L9;
        nativeCanvas.restore();
        return;
    }

    static /* synthetic */ TextLayout constructTextLayout$default(AndroidParagraph r11, int r12, int r13, TextUtils.TruncateAt r14, int r15, int r16, int r17, int r18, int r19, CharSequence r20, int r21, Object r22) {
        if ((r21 & 256) == 0) goto L5;
        CharSequence r10 = r11.charSequence;
    L7:
        return r11.constructTextLayout(r12, r13, r14, r15, r16, r17, r18, r19, r10);
    L5:
        r10 = r20;
        goto L7
    }

    private final TextLayout constructTextLayout(int alignment, int justificationMode, TextUtils.TruncateAt ellipsize, int maxLines, int hyphens, int breakStrategy, int lineBreakStyle, int lineBreakWordStyle, CharSequence charSequence) {
        float r3 = getWidth();
        AndroidTextPaint r1 = getTextPaint$ui_text_release();
        int r7 = this.paragraphIntrinsics.getTextDirectionHeuristic$ui_text_release();
        LayoutIntrinsics r20 = this.paragraphIntrinsics.getLayoutIntrinsics$ui_text_release();
        AndroidTextPaint r4 = r1;
        return new TextLayout(charSequence, r3, r4, alignment, ellipsize, r7, 1.0f, 0.0f, AndroidParagraphHelper_androidKt.isIncludeFontPaddingEnabled(this.paragraphIntrinsics.getStyle()), true, maxLines, breakStrategy, lineBreakStyle, lineBreakWordStyle, hyphens, justificationMode, null, null, r20, 196736, null);
    }
}
