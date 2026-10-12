package androidx.compose.ui.text.android;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.os.Trace;
import android.text.BoringLayout;
import android.text.Layout;
import android.text.Spanned;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.text.TextUtils;
import androidx.compose.ui.text.android.selection.WordIterator;
import androidx.compose.ui.text.android.style.BaselineShiftSpan;
import androidx.compose.ui.text.android.style.IndentationFixSpan_androidKt;
import androidx.compose.ui.text.android.style.LineHeightStyleSpan;
import androidx.compose.ui.text.internal.InlineClassHelperKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: TextLayout.android.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000 \u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u0014\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u001c\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001BÃ\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\t\u0012\b\b\u0002\u0010\r\u001a\u00020\u0005\u0012\b\b\u0003\u0010\u000e\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0012\u001a\u00020\t\u0012\b\b\u0002\u0010\u0013\u001a\u00020\t\u0012\b\b\u0002\u0010\u0014\u001a\u00020\t\u0012\b\b\u0002\u0010\u0015\u001a\u00020\t\u0012\b\b\u0002\u0010\u0016\u001a\u00020\t\u0012\b\b\u0002\u0010\u0017\u001a\u00020\t\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0019\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0019\u0012\b\b\u0002\u0010\u001b\u001a\u00020\u001c¢\u0006\u0002\u0010\u001dJ&\u0010V\u001a\u00020W2\u0006\u0010X\u001a\u00020\t2\u0006\u0010Y\u001a\u00020\t2\u0006\u0010Z\u001a\u00020[2\u0006\u0010\\\u001a\u00020\tJ\u001d\u0010]\u001a\u00020W2\u0006\u0010^\u001a\u00020\t2\u0006\u0010Z\u001a\u00020[H\u0000¢\u0006\u0002\b_J\u000e\u0010`\u001a\u00020a2\u0006\u0010b\u001a\u00020\tJ\u0010\u0010c\u001a\u00020\u00052\u0006\u0010d\u001a\u00020\tH\u0002J\u000e\u0010e\u001a\u00020\u00052\u0006\u0010d\u001a\u00020\tJ\u000e\u0010f\u001a\u00020\u00052\u0006\u0010d\u001a\u00020\tJ\u000e\u0010g\u001a\u00020\u00052\u0006\u0010d\u001a\u00020\tJ\u000e\u0010h\u001a\u00020\u00052\u0006\u0010d\u001a\u00020\tJ\u000e\u0010i\u001a\u00020\t2\u0006\u0010^\u001a\u00020\tJ\u000e\u0010j\u001a\u00020\t2\u0006\u0010^\u001a\u00020\tJ\u000e\u0010k\u001a\u00020\t2\u0006\u0010^\u001a\u00020\tJ\u000e\u0010l\u001a\u00020\t2\u0006\u0010b\u001a\u00020\tJ\u000e\u0010m\u001a\u00020\t2\u0006\u0010n\u001a\u00020\tJ\u000e\u0010o\u001a\u00020\u00052\u0006\u0010^\u001a\u00020\tJ\u000e\u0010p\u001a\u00020\u00052\u0006\u0010^\u001a\u00020\tJ\u000e\u0010q\u001a\u00020\u00052\u0006\u0010^\u001a\u00020\tJ\u000e\u0010r\u001a\u00020\t2\u0006\u0010^\u001a\u00020\tJ\u000e\u0010s\u001a\u00020\u00052\u0006\u0010d\u001a\u00020\tJ\u000e\u0010t\u001a\u00020\t2\u0006\u0010^\u001a\u00020\tJ\u000e\u0010u\u001a\u00020\u00052\u0006\u0010^\u001a\u00020\tJ\u0016\u0010v\u001a\u00020\t2\u0006\u0010d\u001a\u00020\t2\u0006\u0010w\u001a\u00020\u0005J\u000e\u0010x\u001a\u00020\t2\u0006\u0010d\u001a\u00020\tJ\u0018\u0010y\u001a\u00020\u00052\u0006\u0010b\u001a\u00020\t2\b\b\u0002\u0010z\u001a\u00020\u0010J2\u0010{\u001a\u0004\u0018\u00010\u00192\u0006\u0010H\u001a\u00020a2\u0006\u0010|\u001a\u00020\t2\u0018\u0010}\u001a\u0014\u0012\u0004\u0012\u00020a\u0012\u0004\u0012\u00020a\u0012\u0004\u0012\u00020\u00100~J\u0018\u0010\u007f\u001a\u00020\u00052\u0006\u0010b\u001a\u00020\t2\b\b\u0002\u0010z\u001a\u00020\u0010J#\u0010\u0080\u0001\u001a\u00020W2\u0007\u0010\u0081\u0001\u001a\u00020\t2\u0007\u0010\u0082\u0001\u001a\u00020\t2\b\u0010\u0083\u0001\u001a\u00030\u0084\u0001J\u000f\u0010\u0085\u0001\u001a\u00020\u0010H\u0000¢\u0006\u0003\b\u0086\u0001J\u000f\u0010\u0087\u0001\u001a\u00020\u00102\u0006\u0010^\u001a\u00020\tJ\u000f\u0010\u0088\u0001\u001a\u00020\u00102\u0006\u0010b\u001a\u00020\tJ\u0011\u0010\u0089\u0001\u001a\u00020W2\b\u0010\u008a\u0001\u001a\u00030\u008b\u0001R\u0010\u0010\u001e\u001a\u0004\u0018\u00010\u001fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010 \u001a\u0004\u0018\u00010!X\u0082\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\"\u001a\u00020\t8\u0000X\u0081\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b#\u0010$\u001a\u0004\b%\u0010&R\u0011\u0010'\u001a\u00020\u0010¢\u0006\b\n\u0000\u001a\u0004\b(\u0010)R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0011\u001a\u00020\u0010¢\u0006\b\n\u0000\u001a\u0004\b*\u0010)R\u0011\u0010+\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b,\u0010&R\u0011\u0010\u000f\u001a\u00020\u0010¢\u0006\b\n\u0000\u001a\u0004\b-\u0010)R\u000e\u0010.\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010/\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u00100\u001a\u0004\u0018\u000101X\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u00102\u001a\u0002038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b4\u0010$\u001a\u0004\b5\u00106R\u0014\u00107\u001a\u00020\u001f8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b8\u00109R\u0011\u0010\u001b\u001a\u00020\u001c¢\u0006\b\n\u0000\u001a\u0004\b:\u0010;R\u000e\u0010<\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010=\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b>\u0010&R\u0018\u0010?\u001a\n\u0012\u0004\u0012\u00020A\u0018\u00010@X\u0082\u0004¢\u0006\u0004\n\u0002\u0010BR\u0011\u0010C\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\bD\u0010ER\u0011\u0010F\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\bG\u0010ER\u000e\u0010H\u001a\u00020IX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010J\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010K\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\bL\u0010MR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\bN\u0010OR\u001c\u0010P\u001a\u00020\t8\u0000X\u0081\u0004¢\u0006\u000e\n\u0000\u0012\u0004\bQ\u0010$\u001a\u0004\bR\u0010&R\u0011\u0010S\u001a\u00020!8F¢\u0006\u0006\u001a\u0004\bT\u0010U¨\u0006\u008c\u0001"}, d2 = {"Landroidx/compose/ui/text/android/TextLayout;", "", "charSequence", "", "width", "", "textPaint", "Landroid/text/TextPaint;", "alignment", "", "ellipsize", "Landroid/text/TextUtils$TruncateAt;", "textDirectionHeuristic", "lineSpacingMultiplier", "lineSpacingExtra", "includePadding", "", "fallbackLineSpacing", "maxLines", "breakStrategy", "lineBreakStyle", "lineBreakWordStyle", "hyphenationFrequency", "justificationMode", "leftIndents", "", "rightIndents", "layoutIntrinsics", "Landroidx/compose/ui/text/android/LayoutIntrinsics;", "(Ljava/lang/CharSequence;FLandroid/text/TextPaint;ILandroid/text/TextUtils$TruncateAt;IFFZZIIIIII[I[ILandroidx/compose/ui/text/android/LayoutIntrinsics;)V", "backingLayoutHelper", "Landroidx/compose/ui/text/android/LayoutHelper;", "backingWordIterator", "Landroidx/compose/ui/text/android/selection/WordIterator;", "bottomPadding", "getBottomPadding$ui_text_release$annotations", "()V", "getBottomPadding$ui_text_release", "()I", "didExceedMaxLines", "getDidExceedMaxLines", "()Z", "getFallbackLineSpacing", "height", "getHeight", "getIncludePadding", "isBoringLayout", "lastLineExtra", "lastLineFontMetrics", "Landroid/graphics/Paint$FontMetricsInt;", "layout", "Landroid/text/Layout;", "getLayout$annotations", "getLayout", "()Landroid/text/Layout;", "layoutHelper", "getLayoutHelper", "()Landroidx/compose/ui/text/android/LayoutHelper;", "getLayoutIntrinsics", "()Landroidx/compose/ui/text/android/LayoutIntrinsics;", "leftPadding", "lineCount", "getLineCount", "lineHeightSpans", "", "Landroidx/compose/ui/text/android/style/LineHeightStyleSpan;", "[Landroidx/compose/ui/text/android/style/LineHeightStyleSpan;", "maxIntrinsicWidth", "getMaxIntrinsicWidth", "()F", "minIntrinsicWidth", "getMinIntrinsicWidth", "rect", "Landroid/graphics/Rect;", "rightPadding", "text", "getText", "()Ljava/lang/CharSequence;", "getTextPaint", "()Landroid/text/TextPaint;", "topPadding", "getTopPadding$ui_text_release$annotations", "getTopPadding$ui_text_release", "wordIterator", "getWordIterator", "()Landroidx/compose/ui/text/android/selection/WordIterator;", "fillBoundingBoxes", "", "startOffset", "endOffset", "array", "", "arrayStart", "fillLineHorizontalBounds", "lineIndex", "fillLineHorizontalBounds$ui_text_release", "getBoundingBox", "Landroid/graphics/RectF;", "offset", "getHorizontalPadding", "line", "getLineAscent", "getLineBaseline", "getLineBottom", "getLineDescent", "getLineEllipsisCount", "getLineEllipsisOffset", "getLineEnd", "getLineForOffset", "getLineForVertical", "vertical", "getLineHeight", "getLineLeft", "getLineRight", "getLineStart", "getLineTop", "getLineVisibleEnd", "getLineWidth", "getOffsetForHorizontal", "horizontal", "getParagraphDirection", "getPrimaryHorizontal", "upstream", "getRangeForRect", "granularity", "inclusionStrategy", "Lkotlin/Function2;", "getSecondaryHorizontal", "getSelectionPath", "start", "end", "dest", "Landroid/graphics/Path;", "isFallbackLinespacingApplied", "isFallbackLinespacingApplied$ui_text_release", "isLineEllipsized", "isRtlCharAt", "paint", "canvas", "Landroid/graphics/Canvas;", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class TextLayout {
    public static final int $stable = 0;
    private LayoutHelper backingLayoutHelper;
    private WordIterator backingWordIterator;
    private final int bottomPadding;
    private final boolean didExceedMaxLines;
    private final TextUtils.TruncateAt ellipsize;
    private final boolean fallbackLineSpacing;
    private final boolean includePadding;
    private final boolean isBoringLayout;
    private final int lastLineExtra;
    private final Paint.FontMetricsInt lastLineFontMetrics;
    private final Layout layout;
    private final LayoutIntrinsics layoutIntrinsics;
    private final float leftPadding;
    private final int lineCount;
    private final LineHeightStyleSpan[] lineHeightSpans;
    private final Rect rect;
    private final float rightPadding;
    private final TextPaint textPaint;
    private final int topPadding;

    static {
        $stable = 8;
    }

    public static /* synthetic */ void getBottomPadding$ui_text_release$annotations() {
    }

    public static /* synthetic */ void getLayout$annotations() {
    }

    public static /* synthetic */ void getTopPadding$ui_text_release$annotations() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [androidx.compose.ui.text.android.TextLayout, java.lang.Object] */
    public TextLayout(CharSequence r29, float r30, TextPaint r31, int r32, TextUtils.TruncateAt r33, int r34, float r35, float r36, boolean r37, boolean r38, int r39, int r40, int r41, int r42, int r43, int r44, int[] r45, int[] r46, LayoutIntrinsics r47) {
        ?? r1 = new Object();
        r1.textPaint = r31;
        r1.ellipsize = r33;
        r1.includePadding = r37;
        r1.fallbackLineSpacing = r38;
        r1.layoutIntrinsics = r47;
        r1.rect = new Rect();
        int r5 = r29.length();
        TextDirectionHeuristic r16 = TextLayout_androidKt.getTextDirectionHeuristic(r34);
        Layout.Alignment r7 = TextAlignmentAdapter.INSTANCE.get(r32);
        boolean r8 = true;
        if ((r29 instanceof Spanned) == true) goto L5;
        boolean r0 = false;
    L9:
        boolean r24 = r0;
        Trace.beginSection("TextLayout:initLayout");
        BoringLayout.Metrics r2 = r1.layoutIntrinsics.getBoringMetrics();     // Catch: Throwable -> L73
        int r10 = (int) Math.ceil(r30);
        if (r2 == null) goto L89;
    L28:
        th = th;
    L75:
        Trace.endSection();
        throw th;
    L14:
        if (r1.layoutIntrinsics.getMaxIntrinsicWidth() > r30) goto L89;
        if (r24 == true) goto L89;
        r1.isBoringLayout = true;     // Catch: Throwable -> L28
        r8 = true;
        BoringLayout r3 = BoringLayoutFactory.INSTANCE.create(r29, r1.textPaint, r10, r2, r7, r1.includePadding, r1.fallbackLineSpacing, r1.ellipsize, r10);     // Catch: Throwable -> L22
        int r11 = r39;
        TextDirectionHeuristic r9 = r16;
        TextLayout r4 = r1;
    L42:
        r4.layout = r3;     // Catch: Throwable -> L63
        Trace.endSection();
        r4.lineCount = Math.min(r4.layout.getLineCount(), r11);
        int r6 = r4.lineCount - 1;
        if (r4.lineCount >= r11) goto L47;
        boolean r12 = false;
    L53:
        r4.didExceedMaxLines = r12;
        long r13 = TextLayout_androidKt.access$getVerticalPaddings(r4);
        r4.lineHeightSpans = TextLayout_androidKt.access$getLineHeightSpans(r4);
        LineHeightStyleSpan[] r14 = r4.lineHeightSpans;
        if (r14 == null) goto L56;
        long r15 = TextLayout_androidKt.access$getLineHeightPaddings(r14);
    L57:
        r4.topPadding = Math.max(VerticalPaddings.m6469getTopPaddingimpl(r13), VerticalPaddings.m6469getTopPaddingimpl(r15));
        r4.bottomPadding = Math.max(VerticalPaddings.m6468getBottomPaddingimpl(r13), VerticalPaddings.m6468getBottomPaddingimpl(r15));
        Paint.FontMetricsInt r17 = TextLayout_androidKt.access$getLastLineMetrics(r4, r4.textPaint, r9, r4.lineHeightSpans);
        if (r17 == null) goto L60;
        int r18 = r17.bottom - ((int) r4.getLineHeight(r6));
    L61:
        r4.lastLineExtra = r18;
        r4.lastLineFontMetrics = r17;
        r4.leftPadding = IndentationFixSpan_androidKt.getEllipsizedLeftPadding$default(r4.layout, r6, null, 2, null);
        r4.rightPadding = IndentationFixSpan_androidKt.getEllipsizedRightPadding$default(r4.layout, r6, null, 2, null);
        return;
    L60:
        r18 = 0;
        goto L61
    L56:
        r15 = TextLayout_androidKt.access$getZeroVerticalPadding$p();
        goto L57
    L47:
        if (r4.layout.getEllipsisCount(r6) <= 0) goto L49;
    L52:
        r12 = r8;
        goto L53
    L49:
        if (r4.layout.getLineEnd(r6) != r29.length()) goto L52;
        r12 = false;
    L63:
        th = th;
    L22:
        th = th;
    L24:
        th = th;
    L89:
        r1.isBoringLayout = 0;     // Catch: Throwable -> L71
        StaticLayoutFactory r19 = StaticLayoutFactory.INSTANCE;     // Catch: Throwable -> L71
        TextPaint r20 = r1.textPaint;     // Catch: Throwable -> L71
        int r21 = r29.length();     // Catch: Throwable -> L69
        TextUtils.TruncateAt r110 = r1.ellipsize;     // Catch: Throwable -> L69
        TextLayout r22 = this;
        r11 = r39;
        r9 = r16;
        r3 = r19.create(r29, r20, r10, 0, r21, r9, r7, r11, r110, (int) Math.ceil(r30), r35, r36, r44, r22.includePadding, r22.fallbackLineSpacing, r40, r41, r42, r43, r45, r46);     // Catch: Throwable -> L65
        r4 = r22;
    L65:
        th = th;
    L67:
        th = th;
    L69:
        th = th;
    L71:
        th = th;
    L73:
        th = th;
        goto L75
    L5:
        if (((Spanned) r29).nextSpanTransition(-1, r5, BaselineShiftSpan.class) >= r5) goto L7;
        r0 = true;
        goto L9
    L7:
        r0 = false;
        goto L9
    }

    public /* synthetic */ TextLayout(CharSequence r24, float r25, TextPaint r26, int r27, TextUtils.TruncateAt r28, int r29, float r30, float r31, boolean r32, boolean r33, int r34, int r35, int r36, int r37, int r38, int r39, int[] r40, int[] r41, LayoutIntrinsics r42, int r43, DefaultConstructorMarker r44) {
        if ((r43 & 8) == 0) goto L5;
        int r7 = 0;
    L7:
        if ((r43 & 16) == 0) goto L9;
        TextUtils.TruncateAt r8 = null;
    L11:
        if ((r43 & 32) == 0) goto L13;
        int r9 = 2;
    L15:
        if ((r43 & 64) == 0) goto L17;
        float r10 = 1.0f;
    L19:
        if ((r43 & 128) == 0) goto L21;
        float r11 = 0.0f;
    L23:
        if ((r43 & 256) == 0) goto L25;
        boolean r12 = false;
    L27:
        if ((r43 & 512) == 0) goto L29;
        boolean r13 = true;
    L31:
        if ((r43 & 1024) == 0) goto L33;
        int r14 = Integer.MAX_VALUE;
    L35:
        if ((r43 & 2048) == 0) goto L37;
        int r15 = 0;
    L39:
        if ((r43 & 4096) == 0) goto L41;
        int r16 = 0;
    L43:
        if ((r43 & 8192) == 0) goto L45;
        int r17 = 0;
    L47:
        if ((r43 & 16384) == 0) goto L49;
        int r18 = 0;
    L51:
        if ((32768 & r43) == 0) goto L53;
        int r19 = 0;
    L55:
        if ((65536 & r43) == 0) goto L57;
        int[] r20 = null;
    L59:
        if ((131072 & r43) == 0) goto L61;
        int[] r21 = null;
    L63:
        if ((r43 & 262144) == 0) goto L65;
        CharSequence r4 = r24;
        TextPaint r6 = r26;
        LayoutIntrinsics r22 = new LayoutIntrinsics(r4, r6, r9);
    L66:
        this(r4, r25, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22);
        return;
    L65:
        r4 = r24;
        r6 = r26;
        r22 = r42;
        goto L66
    L61:
        r21 = r41;
        goto L63
    L57:
        r20 = r40;
        goto L59
    L53:
        r19 = r39;
        goto L55
    L49:
        r18 = r38;
        goto L51
    L45:
        r17 = r37;
        goto L47
    L41:
        r16 = r36;
        goto L43
    L37:
        r15 = r35;
        goto L39
    L33:
        r14 = r34;
        goto L35
    L29:
        r13 = r33;
        goto L31
    L25:
        r12 = r32;
        goto L27
    L21:
        r11 = r31;
        goto L23
    L17:
        r10 = r30;
        goto L19
    L13:
        r9 = r29;
        goto L15
    L9:
        r8 = r28;
        goto L11
    L5:
        r7 = r27;
        goto L7
    }

    public final TextPaint getTextPaint() {
        return this.textPaint;
    }

    public final boolean getIncludePadding() {
        return this.includePadding;
    }

    public final boolean getFallbackLineSpacing() {
        return this.fallbackLineSpacing;
    }

    public final LayoutIntrinsics getLayoutIntrinsics() {
        return this.layoutIntrinsics;
    }

    public final float getMaxIntrinsicWidth() {
        return this.layoutIntrinsics.getMaxIntrinsicWidth();
    }

    public final float getMinIntrinsicWidth() {
        return this.layoutIntrinsics.getMinIntrinsicWidth();
    }

    public final boolean getDidExceedMaxLines() {
        return this.didExceedMaxLines;
    }

    public final WordIterator getWordIterator() {
        WordIterator finalWordIterator = this.backingWordIterator;
        if (finalWordIterator == null) goto L5;
        return finalWordIterator;
    L5:
        WordIterator it = new WordIterator(this.layout.getText(), 0, this.layout.getText().length(), this.textPaint.getTextLocale());
        this.backingWordIterator = it;
        return it;
    }

    public final Layout getLayout() {
        return this.layout;
    }

    public final int getLineCount() {
        return this.lineCount;
    }

    public final int getTopPadding$ui_text_release() {
        return this.topPadding;
    }

    public final int getBottomPadding$ui_text_release() {
        return this.bottomPadding;
    }

    private final LayoutHelper getLayoutHelper() {
        if (this.backingLayoutHelper != null) goto L6;
        LayoutHelper it = new LayoutHelper(this.layout);
        this.backingLayoutHelper = it;
        return it;
    L6:
        LayoutHelper r0 = this.backingLayoutHelper;
        Intrinsics.checkNotNull(r0);
        return r0;
    }

    public final CharSequence getText() {
        return this.layout.getText();
    }

    public final int getHeight() {
        boolean r0 = this.didExceedMaxLines;
        Layout r1 = this.layout;
        if (r0 == false) goto L5;
        int r2 = r1.getLineBottom(this.lineCount - 1);
    L7:
        return ((r2 + this.topPadding) + this.bottomPadding) + this.lastLineExtra;
    L5:
        r2 = r1.getHeight();
        goto L7
    }

    private final float getHorizontalPadding(int line) {
        if (line == (this.lineCount - 1)) goto L7;
        return 0.0f;
    L7:
        return this.leftPadding + this.rightPadding;
    }

    public final float getLineLeft(int lineIndex) {
        float r0 = this.layout.getLineLeft(lineIndex);
        if (lineIndex != (this.lineCount - 1)) goto L5;
        float r1 = this.leftPadding;
    L7:
        return r0 + r1;
    L5:
        r1 = 0.0f;
        goto L7
    }

    public final float getLineRight(int lineIndex) {
        float r0 = this.layout.getLineRight(lineIndex);
        if (lineIndex != (this.lineCount - 1)) goto L5;
        float r1 = this.rightPadding;
    L7:
        return r0 + r1;
    L5:
        r1 = 0.0f;
        goto L7
    }

    public final float getLineTop(int line) {
        float top = this.layout.getLineTop(line);
        if (line != 0) goto L5;
        int r1 = 0;
    L7:
        return r1 + top;
    L5:
        r1 = this.topPadding;
        goto L7
    }

    public final float getLineBottom(int line) {
        if (line == (this.lineCount - 1)) goto L5;
    L8:
        float r0 = this.topPadding + this.layout.getLineBottom(line);
        if (line != (this.lineCount - 1)) goto L11;
        int r1 = this.bottomPadding;
    L13:
        return r0 + r1;
    L11:
        r1 = 0;
        goto L13
    L5:
        if (this.lastLineFontMetrics == null) goto L8;
        return this.layout.getLineBottom(line - 1) + this.lastLineFontMetrics.bottom;
    }

    public final float getLineAscent(int line) {
        if (line != (this.lineCount - 1)) goto L8;
        if (this.lastLineFontMetrics == null) goto L8;
        return this.lastLineFontMetrics.ascent;
    L8:
        return this.layout.getLineAscent(line);
    }

    public final float getLineBaseline(int line) {
        float r0 = this.topPadding;
        if (line == (this.lineCount - 1)) goto L5;
    L7:
        float r1 = this.layout.getLineBaseline(line);
    L9:
        return r0 + r1;
    L5:
        if (this.lastLineFontMetrics == null) goto L7;
        r1 = getLineTop(line) - this.lastLineFontMetrics.ascent;
        goto L9
    }

    public final float getLineDescent(int line) {
        if (line != (this.lineCount - 1)) goto L8;
        if (this.lastLineFontMetrics == null) goto L8;
        return this.lastLineFontMetrics.descent;
    L8:
        return this.layout.getLineDescent(line);
    }

    public final float getLineHeight(int lineIndex) {
        return getLineBottom(lineIndex) - getLineTop(lineIndex);
    }

    public final float getLineWidth(int lineIndex) {
        return this.layout.getLineWidth(lineIndex);
    }

    public final int getLineStart(int lineIndex) {
        return this.layout.getLineStart(lineIndex);
    }

    public final int getLineEnd(int lineIndex) {
        if (TextLayout_androidKt.isLineEllipsized(this.layout, lineIndex) == false) goto L8;
        if (this.ellipsize != TextUtils.TruncateAt.END) goto L8;
        return this.layout.getText().length();
    L8:
        return this.layout.getLineEnd(lineIndex);
    }

    public final int getLineVisibleEnd(int lineIndex) {
        if (TextLayout_androidKt.isLineEllipsized(this.layout, lineIndex) == false) goto L8;
        if (this.ellipsize != TextUtils.TruncateAt.END) goto L8;
        return this.layout.getLineStart(lineIndex) + this.layout.getEllipsisStart(lineIndex);
    L8:
        return getLayoutHelper().getLineVisibleEnd(lineIndex);
    }

    public final boolean isLineEllipsized(int lineIndex) {
        return TextLayout_androidKt.isLineEllipsized(this.layout, lineIndex);
    }

    public final int getLineEllipsisOffset(int lineIndex) {
        return this.layout.getEllipsisStart(lineIndex);
    }

    public final int getLineEllipsisCount(int lineIndex) {
        return this.layout.getEllipsisCount(lineIndex);
    }

    public final int getLineForVertical(int vertical) {
        return this.layout.getLineForVertical(vertical - this.topPadding);
    }

    public final int getOffsetForHorizontal(int line, float horizontal) {
        return this.layout.getOffsetForHorizontal(line, ((-1.0f) * getHorizontalPadding(line)) + horizontal);
    }

    public static /* synthetic */ float getPrimaryHorizontal$default(TextLayout r0, int r1, boolean r2, int r3, Object r4) {
        if ((r3 & 2) == 0) goto L6;
        r2 = false;
    L6:
        return r0.getPrimaryHorizontal(r1, r2);
    }

    public final float getPrimaryHorizontal(int offset, boolean upstream) {
        return getLayoutHelper().getHorizontalPosition(offset, true, upstream) + getHorizontalPadding(getLineForOffset(offset));
    }

    public static /* synthetic */ float getSecondaryHorizontal$default(TextLayout r0, int r1, boolean r2, int r3, Object r4) {
        if ((r3 & 2) == 0) goto L6;
        r2 = false;
    L6:
        return r0.getSecondaryHorizontal(r1, r2);
    }

    public final float getSecondaryHorizontal(int offset, boolean upstream) {
        return getLayoutHelper().getHorizontalPosition(offset, false, upstream) + getHorizontalPadding(getLineForOffset(offset));
    }

    public final int getLineForOffset(int offset) {
        return this.layout.getLineForOffset(offset);
    }

    public final boolean isRtlCharAt(int offset) {
        return this.layout.isRtlCharAt(offset);
    }

    public final int getParagraphDirection(int line) {
        return this.layout.getParagraphDirection(line);
    }

    public final void getSelectionPath(int start, int end, Path dest) {
        this.layout.getSelectionPath(start, end, dest);
        if (this.topPadding != 0) goto L5;
        return;
    L5:
        if (dest.isEmpty() == true) goto L9;
        dest.offset(0.0f, this.topPadding);
        return;
    }

    public final int[] getRangeForRect(RectF rect, int granularity, Function2<? super RectF, ? super RectF, Boolean> r10) {
        if (Build.VERSION.SDK_INT < 34) goto L7;
        return AndroidLayoutApi34.INSTANCE.getRangeForRect$ui_text_release(this, rect, granularity, r10);
    L7:
        return TextLayoutGetRangeForRectExtensions_androidKt.getRangeForRect(this, this.layout, getLayoutHelper(), rect, granularity, r10);
    }

    public final void fillLineHorizontalBounds$ui_text_release(int lineIndex, float[] array) {
        int lineStartOffset = getLineStart(lineIndex);
        int lineEndOffset = getLineEnd(lineIndex);
        int range = lineEndOffset - lineStartOffset;
        int minArraySize = range * 2;
        boolean isLtrLine = false;
        if (array.length < minArraySize) goto L5;
        boolean value$iv = true;
    L7:
        if (value$iv == true) goto L9;
        InlineClassHelperKt.throwIllegalArgumentException("array.size - arrayStart must be greater or equal than (endOffset - startOffset) * 2");
    L9:
        HorizontalPositionCache cache = new HorizontalPositionCache(this);
        if (getParagraphDirection(lineIndex) != 1) goto L12;
        isLtrLine = true;
    L12:
        int arrayOffset = 0;
        int offset = lineStartOffset;
    L13:
        if (offset >= lineEndOffset) goto L25;
        boolean isRtlChar = isRtlCharAt(offset);
        if (isLtrLine == false) goto L18;
        if (isRtlChar == true) goto L18;
        float left = cache.getPrimaryDownstream(offset);
        float right = cache.getPrimaryUpstream(offset + 1);
    L24:
        array[arrayOffset] = left;
        array[arrayOffset + 1] = right;
        arrayOffset = arrayOffset + 2;
        offset = offset + 1;
    L18:
        if (isLtrLine == false) goto L21;
        if (isRtlChar == false) goto L21;
        right = cache.getSecondaryDownstream(offset);
        left = cache.getSecondaryUpstream(offset + 1);
    L21:
        if (isRtlChar == false) goto L23;
        right = cache.getPrimaryDownstream(offset);
        left = cache.getPrimaryUpstream(offset + 1);
        goto L24
    L23:
        left = cache.getSecondaryDownstream(offset);
        right = cache.getSecondaryUpstream(offset + 1);
        goto L24
    L25:
        return;
    L5:
        value$iv = false;
        goto L7
    }

    public final void fillBoundingBoxes(int startOffset, int endOffset, float[] array, int arrayStart) {
        TextLayout r0 = this;
        int r1 = startOffset;
        int textLength = r0.getText().length();
        int r6 = 1;
        if (r1 < 0) goto L5;
        boolean value$iv = true;
    L7:
        if (value$iv == true) goto L10;
        InlineClassHelperKt.throwIllegalArgumentException("startOffset must be > 0");
    L10:
        if (r1 >= textLength) goto L12;
        boolean value$iv2 = true;
    L14:
        if (value$iv2 == true) goto L17;
        InlineClassHelperKt.throwIllegalArgumentException("startOffset must be less than text length");
    L17:
        if (endOffset <= r1) goto L19;
        boolean value$iv3 = true;
    L21:
        if (value$iv3 == true) goto L24;
        InlineClassHelperKt.throwIllegalArgumentException("endOffset must be greater than startOffset");
    L24:
        if (endOffset > textLength) goto L26;
        boolean value$iv4 = true;
    L28:
        if (value$iv4 == true) goto L30;
        InlineClassHelperKt.throwIllegalArgumentException("endOffset must be smaller or equal to text length");
    L30:
        int range = endOffset - r1;
        int minArraySize = range * 4;
        if ((array.length - arrayStart) < minArraySize) goto L33;
        boolean value$iv5 = true;
    L35:
        if (value$iv5 == true) goto L37;
        InlineClassHelperKt.throwIllegalArgumentException("array.size - arrayStart must be greater or equal than (endOffset - startOffset) * 4");
    L37:
        int firstLine = getLineForOffset(startOffset);
        int lastLine = r0.getLineForOffset(endOffset - 1);
        HorizontalPositionCache cache = new HorizontalPositionCache(r0);
        int arrayOffset = arrayStart;
        int line = firstLine;
        if (line > lastLine) goto L62;
    L39:
        int lineStartOffset = r0.getLineStart(line);
        int lineEndOffset = r0.getLineEnd(line);
        int actualStartOffset = Math.max(r1, lineStartOffset);
        int actualEndOffset = Math.min(endOffset, lineEndOffset);
        float lineTop = r0.getLineTop(line);
        float lineBottom = r0.getLineBottom(line);
        if (r0.getParagraphDirection(line) != r6) goto L42;
        int r2 = r6;
    L43:
        if (r2 != 0) goto L45;
        int r19 = r6;
    L46:
        int offset = actualStartOffset;
    L47:
        if (offset >= actualEndOffset) goto L60;
        boolean isRtlChar = r0.isRtlCharAt(offset);
        if (r2 == 0) goto L52;
        if (isRtlChar == true) goto L52;
        float left = cache.getPrimaryDownstream(offset);
        float right = cache.getPrimaryUpstream(offset + 1);
    L59:
        array[arrayOffset] = left;
        array[arrayOffset + 1] = lineTop;
        array[arrayOffset + 2] = right;
        array[arrayOffset + 3] = lineBottom;
        arrayOffset = arrayOffset + 4;
        offset = offset + 1;
        r0 = this;
    L52:
        if (r2 == 0) goto L55;
        if (isRtlChar == false) goto L55;
        float right2 = cache.getSecondaryDownstream(offset);
        left = cache.getSecondaryUpstream(offset + 1);
        right = right2;
    L55:
        if (r19 == 0) goto L58;
        if (isRtlChar == false) goto L58;
        float right3 = cache.getPrimaryDownstream(offset);
        left = cache.getPrimaryUpstream(offset + 1);
        right = right3;
    L58:
        left = cache.getSecondaryDownstream(offset);
        right = cache.getSecondaryUpstream(offset + 1);
        goto L59
    L60:
        if (line == lastLine) goto L69;
        line = line + 1;
        r6 = 1;
        r0 = this;
        r1 = startOffset;
        goto L39
    L69:
        return;
    L45:
        r19 = 0;
        goto L46
    L42:
        r2 = 0;
        goto L43
    L62:
        return;
    L33:
        value$iv5 = false;
        goto L35
    L26:
        value$iv4 = false;
        goto L28
    L19:
        value$iv3 = false;
        goto L21
    L12:
        value$iv2 = false;
        goto L14
    L5:
        value$iv = false;
        goto L7
    }

    public final RectF getBoundingBox(int offset) {
        int line = getLineForOffset(offset);
        float lineTop = getLineTop(line);
        float lineBottom = getLineBottom(line);
        if (getParagraphDirection(line) != 1) goto L5;
        boolean isLtrLine = true;
    L6:
        boolean isRtlChar = this.layout.isRtlCharAt(offset);
        if (isLtrLine == false) goto L10;
        if (isRtlChar == true) goto L10;
        float left = getPrimaryHorizontal(offset, false);
        float right = getPrimaryHorizontal(offset + 1, true);
    L17:
        return new RectF(left, lineTop, right, lineBottom);
    L10:
        if (isLtrLine == false) goto L13;
        if (isRtlChar == false) goto L13;
        float right2 = getSecondaryHorizontal(offset, false);
        right = right2;
        left = getSecondaryHorizontal(offset + 1, true);
    L13:
        if (isRtlChar == false) goto L15;
        float right3 = getPrimaryHorizontal(offset, false);
        right = right3;
        left = getPrimaryHorizontal(offset + 1, true);
        goto L17
    L15:
        left = getSecondaryHorizontal(offset, false);
        right = getSecondaryHorizontal(offset + 1, true);
        goto L17
    L5:
        isLtrLine = false;
        goto L6
    }

    public final void paint(Canvas canvas) {
        if (canvas.getClipBounds(this.rect) == true) goto L6;
        return;
    L6:
        if (this.topPadding == 0) goto L8;
        canvas.translate(0.0f, this.topPadding);
    L8:
        TextAndroidCanvas $this$paint_u24lambda_u248 = TextLayout_androidKt.access$getSharedTextAndroidCanvas$p();
        $this$paint_u24lambda_u248.setCanvas(canvas);
        this.layout.draw($this$paint_u24lambda_u248);
        if (this.topPadding == 0) goto L12;
        canvas.translate(0.0f, (-1.0f) * this.topPadding);
        return;
    }

    public final boolean isFallbackLinespacingApplied$ui_text_release() {
        if (this.isBoringLayout == false) goto L5;
        BoringLayoutFactory r0 = BoringLayoutFactory.INSTANCE;
        Layout r1 = this.layout;
        Intrinsics.checkNotNull(r1, "null cannot be cast to non-null type android.text.BoringLayout");
        return r0.isFallbackLineSpacingEnabled((BoringLayout) r1);
    L5:
        StaticLayoutFactory r2 = StaticLayoutFactory.INSTANCE;
        Layout r3 = this.layout;
        Intrinsics.checkNotNull(r3, "null cannot be cast to non-null type android.text.StaticLayout");
        return r2.isFallbackLineSpacingEnabled((StaticLayout) r3, this.fallbackLineSpacing);
    }
}
