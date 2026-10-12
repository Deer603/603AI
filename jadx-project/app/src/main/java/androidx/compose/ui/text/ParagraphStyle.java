package androidx.compose.ui.text;

import androidx.compose.ui.text.internal.InlineClassHelperKt;
import androidx.compose.ui.text.style.Hyphens;
import androidx.compose.ui.text.style.LineBreak;
import androidx.compose.ui.text.style.LineHeightStyle;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDirection;
import androidx.compose.ui.text.style.TextIndent;
import androidx.compose.ui.text.style.TextMotion;
import androidx.compose.ui.unit.TextUnit;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: ParagraphStyle.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b3\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0007\u0018\u00002\u00020\u0001Bq\b\u0017\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0013¢\u0006\u0002\u0010\u0014B5\b\u0017\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0002\u0010\u0015BM\b\u0017\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\u0002\u0010\u0016Be\b\u0017\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0011¢\u0006\u0002\u0010\u0017Bg\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0011\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0013¢\u0006\u0002\u0010\u0018Jr\u0010;\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0013ø\u0001\u0000¢\u0006\u0004\b<\u0010=J@\u0010;\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tH\u0007ø\u0001\u0000¢\u0006\u0004\b>\u0010?JX\u0010;\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\rH\u0007ø\u0001\u0000¢\u0006\u0004\b@\u0010AJp\u0010;\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0007ø\u0001\u0000¢\u0006\u0004\bB\u0010CJ|\u0010;\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0007ø\u0001\u0000¢\u0006\u0004\bD\u0010EJ\u0013\u0010F\u001a\u00020G2\b\u0010H\u001a\u0004\u0018\u00010IH\u0096\u0002J\b\u0010J\u001a\u00020KH\u0016J\u0014\u0010L\u001a\u00020\u00002\n\b\u0002\u0010H\u001a\u0004\u0018\u00010\u0000H\u0007J\u0011\u0010M\u001a\u00020\u00002\u0006\u0010H\u001a\u00020\u0000H\u0087\u0002J\b\u0010N\u001a\u00020OH\u0016R\"\u0010\u0019\u001a\u0004\u0018\u00010\u00118GX\u0087\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\f\u0012\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\"\u0010\u001e\u001a\u0004\u0018\u00010\u000f8GX\u0087\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\f\u0012\u0004\b\u001f\u0010\u001b\u001a\u0004\b \u0010!R\"\u0010\"\u001a\u0004\u0018\u00010\u00038GX\u0087\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\f\u0012\u0004\b#\u0010\u001b\u001a\u0004\b$\u0010%R\"\u0010&\u001a\u0004\u0018\u00010\u00058GX\u0087\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\f\u0012\u0004\b'\u0010\u001b\u001a\u0004\b(\u0010)R\u0019\u0010\u0010\u001a\u00020\u0011ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010,\u001a\u0004\b*\u0010+R\u0019\u0010\u000e\u001a\u00020\u000fø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010,\u001a\u0004\b-\u0010+R\u0019\u0010\u0006\u001a\u00020\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u00100\u001a\u0004\b.\u0010/R\u0013\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b1\u00102R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b3\u00104R\u0019\u0010\u0002\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010,\u001a\u0004\b5\u0010+R\u0019\u0010\u0004\u001a\u00020\u0005ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010,\u001a\u0004\b6\u0010+R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b7\u00108R\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u0013¢\u0006\b\n\u0000\u001a\u0004\b9\u0010:\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006P"}, d2 = {"Landroidx/compose/ui/text/ParagraphStyle;", "Landroidx/compose/ui/text/AnnotatedString$Annotation;", "textAlign", "Landroidx/compose/ui/text/style/TextAlign;", "textDirection", "Landroidx/compose/ui/text/style/TextDirection;", "lineHeight", "Landroidx/compose/ui/unit/TextUnit;", "textIndent", "Landroidx/compose/ui/text/style/TextIndent;", "platformStyle", "Landroidx/compose/ui/text/PlatformParagraphStyle;", "lineHeightStyle", "Landroidx/compose/ui/text/style/LineHeightStyle;", "lineBreak", "Landroidx/compose/ui/text/style/LineBreak;", "hyphens", "Landroidx/compose/ui/text/style/Hyphens;", "textMotion", "Landroidx/compose/ui/text/style/TextMotion;", "(Landroidx/compose/ui/text/style/TextAlign;Landroidx/compose/ui/text/style/TextDirection;JLandroidx/compose/ui/text/style/TextIndent;Landroidx/compose/ui/text/PlatformParagraphStyle;Landroidx/compose/ui/text/style/LineHeightStyle;Landroidx/compose/ui/text/style/LineBreak;Landroidx/compose/ui/text/style/Hyphens;Landroidx/compose/ui/text/style/TextMotion;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "(Landroidx/compose/ui/text/style/TextAlign;Landroidx/compose/ui/text/style/TextDirection;JLandroidx/compose/ui/text/style/TextIndent;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "(Landroidx/compose/ui/text/style/TextAlign;Landroidx/compose/ui/text/style/TextDirection;JLandroidx/compose/ui/text/style/TextIndent;Landroidx/compose/ui/text/PlatformParagraphStyle;Landroidx/compose/ui/text/style/LineHeightStyle;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "(Landroidx/compose/ui/text/style/TextAlign;Landroidx/compose/ui/text/style/TextDirection;JLandroidx/compose/ui/text/style/TextIndent;Landroidx/compose/ui/text/PlatformParagraphStyle;Landroidx/compose/ui/text/style/LineHeightStyle;Landroidx/compose/ui/text/style/LineBreak;Landroidx/compose/ui/text/style/Hyphens;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "(IIJLandroidx/compose/ui/text/style/TextIndent;Landroidx/compose/ui/text/PlatformParagraphStyle;Landroidx/compose/ui/text/style/LineHeightStyle;IILandroidx/compose/ui/text/style/TextMotion;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "deprecated_boxing_hyphens", "getHyphens-EaSxIns$annotations", "()V", "getHyphens-EaSxIns", "()Landroidx/compose/ui/text/style/Hyphens;", "deprecated_boxing_lineBreak", "getLineBreak-LgCVezo$annotations", "getLineBreak-LgCVezo", "()Landroidx/compose/ui/text/style/LineBreak;", "deprecated_boxing_textAlign", "getTextAlign-buA522U$annotations", "getTextAlign-buA522U", "()Landroidx/compose/ui/text/style/TextAlign;", "deprecated_boxing_textDirection", "getTextDirection-mmuk1to$annotations", "getTextDirection-mmuk1to", "()Landroidx/compose/ui/text/style/TextDirection;", "getHyphens-vmbZdU8", "()I", "I", "getLineBreak-rAG3T2k", "getLineHeight-XSAIIZE", "()J", "J", "getLineHeightStyle", "()Landroidx/compose/ui/text/style/LineHeightStyle;", "getPlatformStyle", "()Landroidx/compose/ui/text/PlatformParagraphStyle;", "getTextAlign-e0LSkKk", "getTextDirection-s_7X-co", "getTextIndent", "()Landroidx/compose/ui/text/style/TextIndent;", "getTextMotion", "()Landroidx/compose/ui/text/style/TextMotion;", "copy", "copy-ykzQM6k", "(IIJLandroidx/compose/ui/text/style/TextIndent;Landroidx/compose/ui/text/PlatformParagraphStyle;Landroidx/compose/ui/text/style/LineHeightStyle;IILandroidx/compose/ui/text/style/TextMotion;)Landroidx/compose/ui/text/ParagraphStyle;", "copy-Elsmlbk", "(Landroidx/compose/ui/text/style/TextAlign;Landroidx/compose/ui/text/style/TextDirection;JLandroidx/compose/ui/text/style/TextIndent;)Landroidx/compose/ui/text/ParagraphStyle;", "copy-xPh5V4g", "(Landroidx/compose/ui/text/style/TextAlign;Landroidx/compose/ui/text/style/TextDirection;JLandroidx/compose/ui/text/style/TextIndent;Landroidx/compose/ui/text/PlatformParagraphStyle;Landroidx/compose/ui/text/style/LineHeightStyle;)Landroidx/compose/ui/text/ParagraphStyle;", "copy-ciSxzs0", "(Landroidx/compose/ui/text/style/TextAlign;Landroidx/compose/ui/text/style/TextDirection;JLandroidx/compose/ui/text/style/TextIndent;Landroidx/compose/ui/text/PlatformParagraphStyle;Landroidx/compose/ui/text/style/LineHeightStyle;Landroidx/compose/ui/text/style/LineBreak;Landroidx/compose/ui/text/style/Hyphens;)Landroidx/compose/ui/text/ParagraphStyle;", "copy-NH1kkwU", "(Landroidx/compose/ui/text/style/TextAlign;Landroidx/compose/ui/text/style/TextDirection;JLandroidx/compose/ui/text/style/TextIndent;Landroidx/compose/ui/text/PlatformParagraphStyle;Landroidx/compose/ui/text/style/LineHeightStyle;Landroidx/compose/ui/text/style/LineBreak;Landroidx/compose/ui/text/style/Hyphens;Landroidx/compose/ui/text/style/TextMotion;)Landroidx/compose/ui/text/ParagraphStyle;", "equals", "", "other", "", "hashCode", "", "merge", "plus", "toString", "", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class ParagraphStyle implements AnnotatedString.Annotation {
    public static final int $stable = 0;
    private final int hyphens;
    private final int lineBreak;
    private final long lineHeight;
    private final LineHeightStyle lineHeightStyle;
    private final PlatformParagraphStyle platformStyle;
    private final int textAlign;
    private final int textDirection;
    private final TextIndent textIndent;
    private final TextMotion textMotion;

    static {
    }

    public /* synthetic */ ParagraphStyle(int r1, int r2, long r3, TextIndent r5, PlatformParagraphStyle r6, LineHeightStyle r7, int r8, int r9, TextMotion r10, DefaultConstructorMarker r11) {
        this(r1, r2, r3, r5, r6, r7, r8, r9, r10);
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "ParagraphStyle constructors that take nullable TextAlign, TextDirection, LineBreak, and Hyphens are deprecated. Please use a new constructor where these parameters are non-nullable. Null value has been replaced by a special Unspecified object for performance reason.")
    public /* synthetic */ ParagraphStyle(TextAlign r1, TextDirection r2, long r3, TextIndent r5, PlatformParagraphStyle r6, LineHeightStyle r7, LineBreak r8, Hyphens r9, TextMotion r10, DefaultConstructorMarker r11) {
        this(r1, r2, r3, r5, r6, r7, r8, r9, r10);
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "ParagraphStyle constructors that do not take new stable parameters like LineBreak, Hyphens, TextMotion are deprecated. Please use the new stable constructors.")
    public /* synthetic */ ParagraphStyle(TextAlign r1, TextDirection r2, long r3, TextIndent r5, PlatformParagraphStyle r6, LineHeightStyle r7, LineBreak r8, Hyphens r9, DefaultConstructorMarker r10) {
        this(r1, r2, r3, r5, r6, r7, r8, r9);
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "ParagraphStyle constructors that do not take new stable parameters like LineHeightStyle, LineBreak, Hyphens are deprecated. Please use the new stable constructors.")
    public /* synthetic */ ParagraphStyle(TextAlign r1, TextDirection r2, long r3, TextIndent r5, PlatformParagraphStyle r6, LineHeightStyle r7, DefaultConstructorMarker r8) {
        this(r1, r2, r3, r5, r6, r7);
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "ParagraphStyle constructors that do not take new stable parameters like LineHeightStyle, LineBreak, Hyphens are deprecated. Please use the new stable constructor.")
    public /* synthetic */ ParagraphStyle(TextAlign r1, TextDirection r2, long r3, TextIndent r5, DefaultConstructorMarker r6) {
        this(r1, r2, r3, r5);
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "Kept for backwards compatibility.")
    /* JADX INFO: renamed from: getHyphens-EaSxIns$annotations, reason: not valid java name */
    public static /* synthetic */ void m6297getHyphensEaSxIns$annotations() {
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "Kept for backwards compatibility.")
    /* JADX INFO: renamed from: getLineBreak-LgCVezo$annotations, reason: not valid java name */
    public static /* synthetic */ void m6298getLineBreakLgCVezo$annotations() {
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "Kept for backwards compatibility.")
    /* JADX INFO: renamed from: getTextAlign-buA522U$annotations, reason: not valid java name */
    public static /* synthetic */ void m6299getTextAlignbuA522U$annotations() {
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "Kept for backwards compatibility.")
    /* JADX INFO: renamed from: getTextDirection-mmuk1to$annotations, reason: not valid java name */
    public static /* synthetic */ void m6300getTextDirectionmmuk1to$annotations() {
    }

    private ParagraphStyle(int textAlign, int textDirection, long lineHeight, TextIndent textIndent, PlatformParagraphStyle platformStyle, LineHeightStyle lineHeightStyle, int lineBreak, int hyphens, TextMotion textMotion) {
        this.textAlign = textAlign;
        this.textDirection = textDirection;
        this.lineHeight = lineHeight;
        this.textIndent = textIndent;
        this.platformStyle = platformStyle;
        this.lineHeightStyle = lineHeightStyle;
        this.lineBreak = lineBreak;
        this.hyphens = hyphens;
        this.textMotion = textMotion;
        if (TextUnit.m7164equalsimpl0(this.lineHeight, TextUnit.Companion.m7178getUnspecifiedXSAIIZE()) == false) goto L5;
        return;
    L5:
        if (TextUnit.m7167getValueimpl(this.lineHeight) < 0.0f) goto L7;
        boolean value$iv = true;
    L9:
        if (value$iv == true) goto L15;
        InlineClassHelperKt.throwIllegalStateException("lineHeight can't be negative (" + TextUnit.m7167getValueimpl(this.lineHeight) + ')');
        return;
    L15:
        return;
    L7:
        value$iv = false;
        goto L9
    }

    public /* synthetic */ ParagraphStyle(int r12, int r13, long r14, TextIndent r16, PlatformParagraphStyle r17, LineHeightStyle r18, int r19, int r20, TextMotion r21, int r22, DefaultConstructorMarker r23) {
        if ((r22 & 1) == 0) goto L5;
        int r1 = TextAlign.Companion.m6841getUnspecifiede0LSkKk();
    L7:
        if ((r22 & 2) == 0) goto L9;
        int r2 = TextDirection.Companion.m6854getUnspecifieds_7Xco();
    L11:
        if ((r22 & 4) == 0) goto L13;
        long r3 = TextUnit.Companion.m7178getUnspecifiedXSAIIZE();
    L14:
        TextMotion r6 = null;
        if ((r22 & 8) == 0) goto L17;
        TextIndent r5 = null;
    L19:
        if ((r22 & 16) == 0) goto L21;
        PlatformParagraphStyle r7 = null;
    L23:
        if ((r22 & 32) == 0) goto L25;
        LineHeightStyle r8 = null;
    L27:
        if ((r22 & 64) == 0) goto L29;
        int r9 = LineBreak.Companion.m6756getUnspecifiedrAG3T2k();
    L31:
        if ((r22 & 128) == 0) goto L33;
        int r10 = Hyphens.Companion.m6735getUnspecifiedvmbZdU8();
    L35:
        if ((r22 & 256) != 0) goto L38;
        r6 = r21;
    L38:
        PlatformParagraphStyle r110 = r7;
        LineHeightStyle r111 = r8;
        int r24 = r9;
        int r25 = r10;
        this(r1, r2, r3, r5, r110, r111, r24, r25, r6, null);
        return;
    L33:
        r10 = r20;
        goto L35
    L29:
        r9 = r19;
        goto L31
    L25:
        r8 = r18;
        goto L27
    L21:
        r7 = r17;
        goto L23
    L17:
        r5 = r16;
        goto L19
    L13:
        r3 = r14;
        goto L14
    L9:
        r2 = r13;
        goto L11
    L5:
        r1 = r12;
        goto L7
    }

    /* JADX INFO: renamed from: getTextAlign-e0LSkKk, reason: not valid java name */
    public final int m6312getTextAligne0LSkKk() {
        return this.textAlign;
    }

    /* JADX INFO: renamed from: getTextDirection-s_7X-co, reason: not valid java name */
    public final int m6314getTextDirections_7Xco() {
        return this.textDirection;
    }

    /* JADX INFO: renamed from: getLineHeight-XSAIIZE, reason: not valid java name */
    public final long m6310getLineHeightXSAIIZE() {
        return this.lineHeight;
    }

    public final TextIndent getTextIndent() {
        return this.textIndent;
    }

    public final PlatformParagraphStyle getPlatformStyle() {
        return this.platformStyle;
    }

    public final LineHeightStyle getLineHeightStyle() {
        return this.lineHeightStyle;
    }

    /* JADX INFO: renamed from: getLineBreak-rAG3T2k, reason: not valid java name */
    public final int m6309getLineBreakrAG3T2k() {
        return this.lineBreak;
    }

    /* JADX INFO: renamed from: getHyphens-vmbZdU8, reason: not valid java name */
    public final int m6307getHyphensvmbZdU8() {
        return this.hyphens;
    }

    public final TextMotion getTextMotion() {
        return this.textMotion;
    }

    /* JADX INFO: renamed from: getTextAlign-buA522U, reason: not valid java name */
    public final TextAlign m6311getTextAlignbuA522U() {
        return TextAlign.m6828boximpl(this.textAlign);
    }

    /* JADX INFO: renamed from: getTextDirection-mmuk1to, reason: not valid java name */
    public final TextDirection m6313getTextDirectionmmuk1to() {
        return TextDirection.m6842boximpl(this.textDirection);
    }

    /* JADX INFO: renamed from: getHyphens-EaSxIns, reason: not valid java name */
    public final Hyphens m6306getHyphensEaSxIns() {
        return Hyphens.m6726boximpl(this.hyphens);
    }

    /* JADX INFO: renamed from: getLineBreak-LgCVezo, reason: not valid java name */
    public final LineBreak m6308getLineBreakLgCVezo() {
        return LineBreak.m6736boximpl(this.lineBreak);
    }

    public /* synthetic */ ParagraphStyle(TextAlign r8, TextDirection r9, long r10, TextIndent r12, PlatformParagraphStyle r13, LineHeightStyle r14, LineBreak r15, Hyphens r16, TextMotion r17, int r18, DefaultConstructorMarker r19) {
        TextMotion r2 = null;
        if ((r18 & 1) == 0) goto L6;
        r8 = null;
    L6:
        if ((r18 & 2) == 0) goto L9;
        r9 = null;
    L9:
        if ((r18 & 4) == 0) goto L12;
        r10 = TextUnit.Companion.m7178getUnspecifiedXSAIIZE();
    L12:
        if ((r18 & 8) == 0) goto L14;
        TextIndent r1 = null;
    L16:
        if ((r18 & 16) == 0) goto L18;
        PlatformParagraphStyle r3 = null;
    L20:
        if ((r18 & 32) == 0) goto L22;
        LineHeightStyle r4 = null;
    L24:
        if ((r18 & 64) == 0) goto L26;
        LineBreak r5 = null;
    L28:
        if ((r18 & 128) == 0) goto L30;
        Hyphens r6 = null;
    L32:
        if ((r18 & 256) != 0) goto L35;
        r2 = r17;
    L35:
        PlatformParagraphStyle r110 = r3;
        LineHeightStyle r111 = r4;
        LineBreak r112 = r5;
        Hyphens r113 = r6;
        TextDirection r11 = r9;
        TextAlign r20 = r8;
        this(r20, r11, r10, r1, r110, r111, r112, r113, r2, null);
        return;
    L30:
        r6 = r16;
        goto L32
    L26:
        r5 = r15;
        goto L28
    L22:
        r4 = r14;
        goto L24
    L18:
        r3 = r13;
        goto L20
    L14:
        r1 = r12;
        goto L16
    }

    private ParagraphStyle(TextAlign textAlign, TextDirection textDirection, long lineHeight, TextIndent textIndent, PlatformParagraphStyle platformStyle, LineHeightStyle lineHeightStyle, LineBreak lineBreak, Hyphens hyphens, TextMotion textMotion) {
        if (textAlign == null) goto L4;
        int r0 = textAlign.m6834unboximpl();
    L5:
        int r2 = r0;
        if (textDirection == null) goto L8;
        int r1 = textDirection.m6848unboximpl();
    L9:
        int r3 = r1;
        if (lineBreak == null) goto L12;
        int r4 = lineBreak.m6748unboximpl();
    L13:
        int r9 = r4;
        if (hyphens == null) goto L16;
        int r5 = hyphens.m6732unboximpl();
    L17:
        this(r2, r3, lineHeight, textIndent, platformStyle, lineHeightStyle, r9, r5, textMotion, null);
        return;
    L16:
        r5 = Hyphens.Companion.m6735getUnspecifiedvmbZdU8();
        goto L17
    L12:
        r4 = LineBreak.Companion.m6756getUnspecifiedrAG3T2k();
        goto L13
    L8:
        r1 = TextDirection.Companion.m6854getUnspecifieds_7Xco();
        goto L9
    L4:
        r0 = TextAlign.Companion.m6841getUnspecifiede0LSkKk();
        goto L5
    }

    public /* synthetic */ ParagraphStyle(TextAlign r9, TextDirection r10, long r11, TextIndent r13, int r14, DefaultConstructorMarker r15) {
        if ((r14 & 1) == 0) goto L5;
        TextAlign r2 = null;
    L7:
        if ((r14 & 2) == 0) goto L9;
        TextDirection r3 = null;
    L11:
        if ((r14 & 4) == 0) goto L13;
        long r4 = TextUnit.Companion.m7178getUnspecifiedXSAIIZE();
    L15:
        if ((r14 & 8) == 0) goto L17;
        TextIndent r6 = null;
    L18:
        this(r2, r3, r4, r6, null);
        return;
    L17:
        r6 = r13;
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

    private ParagraphStyle(TextAlign textAlign, TextDirection textDirection, long lineHeight, TextIndent textIndent) {
        if (textAlign == null) goto L4;
        int r0 = textAlign.m6834unboximpl();
    L5:
        int r2 = r0;
        if (textDirection == null) goto L8;
        int r1 = textDirection.m6848unboximpl();
    L9:
        PlatformParagraphStyle r7 = null;
        LineHeightStyle r8 = null;
        this(r2, r1, lineHeight, textIndent, r7, r8, LineBreak.Companion.m6756getUnspecifiedrAG3T2k(), Hyphens.Companion.m6735getUnspecifiedvmbZdU8(), null, null);
        return;
    L8:
        r1 = TextDirection.Companion.m6854getUnspecifieds_7Xco();
        goto L9
    L4:
        r0 = TextAlign.Companion.m6841getUnspecifiede0LSkKk();
        goto L5
    }

    public /* synthetic */ ParagraphStyle(TextAlign r3, TextDirection r4, long r5, TextIndent r7, PlatformParagraphStyle r8, LineHeightStyle r9, int r10, DefaultConstructorMarker r11) {
        if ((r10 & 1) == 0) goto L6;
        r3 = null;
    L6:
        if ((r10 & 2) == 0) goto L9;
        r4 = null;
    L9:
        if ((r10 & 4) == 0) goto L12;
        r5 = TextUnit.Companion.m7178getUnspecifiedXSAIIZE();
    L12:
        if ((r10 & 8) == 0) goto L15;
        r7 = null;
    L15:
        if ((r10 & 16) == 0) goto L18;
        r8 = null;
    L18:
        if ((r10 & 32) == 0) goto L20;
        r9 = null;
    L20:
        LineHeightStyle r12 = r9;
        PlatformParagraphStyle r13 = r8;
        long r6 = r5;
        TextDirection r14 = r4;
        TextAlign r15 = r3;
        this(r15, r14, r6, r7, r13, r12, null);
    }

    private ParagraphStyle(TextAlign textAlign, TextDirection textDirection, long lineHeight, TextIndent textIndent, PlatformParagraphStyle platformStyle, LineHeightStyle lineHeightStyle) {
        if (textAlign == null) goto L4;
        int r0 = textAlign.m6834unboximpl();
    L5:
        int r2 = r0;
        if (textDirection == null) goto L8;
        int r1 = textDirection.m6848unboximpl();
    L9:
        this(r2, r1, lineHeight, textIndent, platformStyle, lineHeightStyle, LineBreak.Companion.m6756getUnspecifiedrAG3T2k(), Hyphens.Companion.m6735getUnspecifiedvmbZdU8(), null, null);
        return;
    L8:
        r1 = TextDirection.Companion.m6854getUnspecifieds_7Xco();
        goto L9
    L4:
        r0 = TextAlign.Companion.m6841getUnspecifiede0LSkKk();
        goto L5
    }

    public /* synthetic */ ParagraphStyle(TextAlign r6, TextDirection r7, long r8, TextIndent r10, PlatformParagraphStyle r11, LineHeightStyle r12, LineBreak r13, Hyphens r14, int r15, DefaultConstructorMarker r16) {
        Hyphens r2 = null;
        if ((r15 & 1) == 0) goto L6;
        r6 = null;
    L6:
        if ((r15 & 2) == 0) goto L9;
        r7 = null;
    L9:
        if ((r15 & 4) == 0) goto L12;
        r8 = TextUnit.Companion.m7178getUnspecifiedXSAIIZE();
    L12:
        if ((r15 & 8) == 0) goto L15;
        r10 = null;
    L15:
        if ((r15 & 16) == 0) goto L17;
        PlatformParagraphStyle r1 = null;
    L19:
        if ((r15 & 32) == 0) goto L21;
        LineHeightStyle r3 = null;
    L23:
        if ((r15 & 64) == 0) goto L25;
        LineBreak r4 = null;
    L27:
        if ((r15 & 128) != 0) goto L30;
        r2 = r14;
    L30:
        LineHeightStyle r17 = r3;
        LineBreak r18 = r4;
        long r9 = r8;
        TextDirection r19 = r7;
        TextAlign r20 = r6;
        this(r20, r19, r9, r10, r1, r17, r18, r2, null);
        return;
    L25:
        r4 = r13;
        goto L27
    L21:
        r3 = r12;
        goto L23
    L17:
        r1 = r11;
        goto L19
    }

    private ParagraphStyle(TextAlign textAlign, TextDirection textDirection, long lineHeight, TextIndent textIndent, PlatformParagraphStyle platformStyle, LineHeightStyle lineHeightStyle, LineBreak lineBreak, Hyphens hyphens) {
        if (textAlign == null) goto L4;
        int r0 = textAlign.m6834unboximpl();
    L5:
        int r2 = r0;
        if (textDirection == null) goto L8;
        int r1 = textDirection.m6848unboximpl();
    L9:
        int r3 = r1;
        if (lineBreak == null) goto L12;
        int r4 = lineBreak.m6748unboximpl();
    L13:
        int r9 = r4;
        if (hyphens == null) goto L16;
        int r5 = hyphens.m6732unboximpl();
    L17:
        this(r2, r3, lineHeight, textIndent, platformStyle, lineHeightStyle, r9, r5, null, null);
        return;
    L16:
        r5 = Hyphens.Companion.m6735getUnspecifiedvmbZdU8();
        goto L17
    L12:
        r4 = LineBreak.Companion.m6756getUnspecifiedrAG3T2k();
        goto L13
    L8:
        r1 = TextDirection.Companion.m6854getUnspecifieds_7Xco();
        goto L9
    L4:
        r0 = TextAlign.Companion.m6841getUnspecifiede0LSkKk();
        goto L5
    }

    public static /* synthetic */ ParagraphStyle merge$default(ParagraphStyle r0, ParagraphStyle r1, int r2, Object r3) {
        if ((r2 & 1) == 0) goto L6;
        r1 = null;
    L6:
        return r0.merge(r1);
    }

    public final ParagraphStyle merge(ParagraphStyle other) {
        if (other != null) goto L5;
        return this;
    L5:
        return ParagraphStyleKt.m6315fastMergej5T8yCg(this, other.textAlign, other.textDirection, other.lineHeight, other.textIndent, other.platformStyle, other.lineHeightStyle, other.lineBreak, other.hyphens, other.textMotion);
    }

    public final ParagraphStyle plus(ParagraphStyle other) {
        return merge(other);
    }

    /* JADX INFO: renamed from: copy-Elsmlbk$default, reason: not valid java name */
    public static /* synthetic */ ParagraphStyle m6292copyElsmlbk$default(ParagraphStyle r0, TextAlign r1, TextDirection r2, long r3, TextIndent r5, int r6, Object r7) {
        if ((r6 & 1) == 0) goto L6;
        r1 = TextAlign.m6828boximpl(r0.textAlign);
    L6:
        if ((r6 & 2) == 0) goto L9;
        r2 = TextDirection.m6842boximpl(r0.textDirection);
    L9:
        if ((r6 & 4) == 0) goto L12;
        r3 = r0.lineHeight;
    L12:
        if ((r6 & 8) == 0) goto L14;
        TextIndent r8 = r0.textIndent;
    L15:
        long r9 = r3;
        return r0.m6301copyElsmlbk(r1, r2, r9, r8);
    L14:
        r8 = r5;
        goto L15
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "ParagraphStyle copy constructors that do not take new stable parameters like LineHeightStyle, LineBreak, Hyphens are deprecated. Please use the new stable copy constructor.")
    /* JADX INFO: renamed from: copy-Elsmlbk, reason: not valid java name */
    public final /* synthetic */ ParagraphStyle m6301copyElsmlbk(TextAlign textAlign, TextDirection textDirection, long lineHeight, TextIndent textIndent) {
        if (textAlign == null) goto L5;
        int r1 = textAlign.m6834unboximpl();
    L6:
        if (textDirection == null) goto L8;
        int r2 = textDirection.m6848unboximpl();
    L10:
        return new ParagraphStyle(r1, r2, lineHeight, textIndent, this.platformStyle, this.lineHeightStyle, this.lineBreak, this.hyphens, this.textMotion, null);
    L8:
        r2 = TextDirection.Companion.m6854getUnspecifieds_7Xco();
        goto L10
    L5:
        r1 = TextAlign.Companion.m6841getUnspecifiede0LSkKk();
        goto L6
    }

    /* JADX INFO: renamed from: copy-xPh5V4g$default, reason: not valid java name */
    public static /* synthetic */ ParagraphStyle m6295copyxPh5V4g$default(ParagraphStyle r0, TextAlign r1, TextDirection r2, long r3, TextIndent r5, PlatformParagraphStyle r6, LineHeightStyle r7, int r8, Object r9) {
        if ((r8 & 1) == 0) goto L6;
        r1 = TextAlign.m6828boximpl(r0.textAlign);
    L6:
        if ((r8 & 2) == 0) goto L9;
        r2 = TextDirection.m6842boximpl(r0.textDirection);
    L9:
        if ((r8 & 4) == 0) goto L12;
        r3 = r0.lineHeight;
    L12:
        if ((r8 & 8) == 0) goto L15;
        r5 = r0.textIndent;
    L15:
        if ((r8 & 16) == 0) goto L18;
        r6 = r0.platformStyle;
    L18:
        if ((r8 & 32) == 0) goto L20;
        LineHeightStyle r10 = r0.lineHeightStyle;
    L21:
        long r11 = r3;
        TextAlign r4 = r1;
        TextDirection r12 = r2;
        return r0.m6304copyxPh5V4g(r4, r12, r11, r5, r6, r10);
    L20:
        r10 = r7;
        goto L21
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "ParagraphStyle copy constructors that do not take new stable parameters like LineHeightStyle, LineBreak, Hyphens are deprecated. Please use the new stable copy constructor.")
    /* JADX INFO: renamed from: copy-xPh5V4g, reason: not valid java name */
    public final /* synthetic */ ParagraphStyle m6304copyxPh5V4g(TextAlign textAlign, TextDirection textDirection, long lineHeight, TextIndent textIndent, PlatformParagraphStyle platformStyle, LineHeightStyle lineHeightStyle) {
        if (textAlign == null) goto L5;
        int r1 = textAlign.m6834unboximpl();
    L6:
        if (textDirection == null) goto L8;
        int r2 = textDirection.m6848unboximpl();
    L10:
        return new ParagraphStyle(r1, r2, lineHeight, textIndent, platformStyle, lineHeightStyle, this.lineBreak, this.hyphens, this.textMotion, null);
    L8:
        r2 = TextDirection.Companion.m6854getUnspecifieds_7Xco();
        goto L10
    L5:
        r1 = TextAlign.Companion.m6841getUnspecifiede0LSkKk();
        goto L6
    }

    /* JADX INFO: renamed from: copy-ciSxzs0$default, reason: not valid java name */
    public static /* synthetic */ ParagraphStyle m6294copyciSxzs0$default(ParagraphStyle r0, TextAlign r1, TextDirection r2, long r3, TextIndent r5, PlatformParagraphStyle r6, LineHeightStyle r7, LineBreak r8, Hyphens r9, int r10, Object r11) {
        if ((r10 & 1) == 0) goto L6;
        r1 = TextAlign.m6828boximpl(r0.textAlign);
    L6:
        if ((r10 & 2) == 0) goto L9;
        r2 = TextDirection.m6842boximpl(r0.textDirection);
    L9:
        if ((r10 & 4) == 0) goto L12;
        r3 = r0.lineHeight;
    L12:
        if ((r10 & 8) == 0) goto L15;
        r5 = r0.textIndent;
    L15:
        if ((r10 & 16) == 0) goto L18;
        r6 = r0.platformStyle;
    L18:
        if ((r10 & 32) == 0) goto L21;
        r7 = r0.lineHeightStyle;
    L21:
        if ((r10 & 64) == 0) goto L24;
        r8 = LineBreak.m6736boximpl(r0.lineBreak);
    L24:
        if ((r10 & 128) == 0) goto L26;
        Hyphens r12 = Hyphens.m6726boximpl(r0.hyphens);
    L27:
        LineHeightStyle r13 = r7;
        LineBreak r14 = r8;
        long r15 = r3;
        TextAlign r4 = r1;
        TextDirection r16 = r2;
        return r0.m6303copyciSxzs0(r4, r16, r15, r5, r6, r13, r14, r12);
    L26:
        r12 = r9;
        goto L27
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "ParagraphStyle copy constructors that do not take new stable parameters like LineBreak, Hyphens, TextMotion are deprecated. Please use the new stable copy constructor.")
    /* JADX INFO: renamed from: copy-ciSxzs0, reason: not valid java name */
    public final /* synthetic */ ParagraphStyle m6303copyciSxzs0(TextAlign textAlign, TextDirection textDirection, long lineHeight, TextIndent textIndent, PlatformParagraphStyle platformStyle, LineHeightStyle lineHeightStyle, LineBreak lineBreak, Hyphens hyphens) {
        if (textAlign == null) goto L5;
        int r1 = textAlign.m6834unboximpl();
    L6:
        if (textDirection == null) goto L8;
        int r2 = textDirection.m6848unboximpl();
    L10:
        if (lineBreak == null) goto L12;
        int r3 = lineBreak.m6748unboximpl();
    L13:
        int r8 = r3;
        if (hyphens == null) goto L16;
        int r4 = hyphens.m6732unboximpl();
    L18:
        return new ParagraphStyle(r1, r2, lineHeight, textIndent, platformStyle, lineHeightStyle, r8, r4, this.textMotion, null);
    L16:
        r4 = Hyphens.Companion.m6735getUnspecifiedvmbZdU8();
        goto L18
    L12:
        r3 = LineBreak.Companion.m6756getUnspecifiedrAG3T2k();
        goto L13
    L8:
        r2 = TextDirection.Companion.m6854getUnspecifieds_7Xco();
        goto L10
    L5:
        r1 = TextAlign.Companion.m6841getUnspecifiede0LSkKk();
        goto L6
    }

    /* JADX INFO: renamed from: copy-NH1kkwU$default, reason: not valid java name */
    public static /* synthetic */ ParagraphStyle m6293copyNH1kkwU$default(ParagraphStyle r0, TextAlign r1, TextDirection r2, long r3, TextIndent r5, PlatformParagraphStyle r6, LineHeightStyle r7, LineBreak r8, Hyphens r9, TextMotion r10, int r11, Object r12) {
        if ((r11 & 1) == 0) goto L6;
        r1 = TextAlign.m6828boximpl(r0.textAlign);
    L6:
        if ((r11 & 2) == 0) goto L9;
        r2 = TextDirection.m6842boximpl(r0.textDirection);
    L9:
        if ((r11 & 4) == 0) goto L12;
        r3 = r0.lineHeight;
    L12:
        if ((r11 & 8) == 0) goto L15;
        r5 = r0.textIndent;
    L15:
        if ((r11 & 16) == 0) goto L18;
        r6 = r0.platformStyle;
    L18:
        if ((r11 & 32) == 0) goto L21;
        r7 = r0.lineHeightStyle;
    L21:
        if ((r11 & 64) == 0) goto L24;
        r8 = LineBreak.m6736boximpl(r0.lineBreak);
    L24:
        if ((r11 & 128) == 0) goto L27;
        r9 = Hyphens.m6726boximpl(r0.hyphens);
    L27:
        if ((r11 & 256) == 0) goto L29;
        TextMotion r13 = r0.textMotion;
    L30:
        LineBreak r14 = r8;
        Hyphens r15 = r9;
        LineHeightStyle r16 = r7;
        TextIndent r17 = r5;
        long r18 = r3;
        TextAlign r4 = r1;
        TextDirection r19 = r2;
        return r0.m6302copyNH1kkwU(r4, r19, r18, r17, r6, r16, r14, r15, r13);
    L29:
        r13 = r10;
        goto L30
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "ParagraphStyle copy constructors that take nullable TextAlign, TextDirection, LineBreak, and Hyphens are deprecated. Please use a new constructor where these parameters are non-nullable. Null value has been replaced by a special Unspecified object for performance reason.")
    /* JADX INFO: renamed from: copy-NH1kkwU, reason: not valid java name */
    public final /* synthetic */ ParagraphStyle m6302copyNH1kkwU(TextAlign textAlign, TextDirection textDirection, long lineHeight, TextIndent textIndent, PlatformParagraphStyle platformStyle, LineHeightStyle lineHeightStyle, LineBreak lineBreak, Hyphens hyphens, TextMotion textMotion) {
        if (textAlign == null) goto L5;
        int r1 = textAlign.m6834unboximpl();
    L6:
        if (textDirection == null) goto L8;
        int r2 = textDirection.m6848unboximpl();
    L10:
        if (lineBreak == null) goto L12;
        int r3 = lineBreak.m6748unboximpl();
    L13:
        int r8 = r3;
        if (hyphens == null) goto L16;
        int r4 = hyphens.m6732unboximpl();
    L18:
        return new ParagraphStyle(r1, r2, lineHeight, textIndent, platformStyle, lineHeightStyle, r8, r4, textMotion, null);
    L16:
        r4 = Hyphens.Companion.m6735getUnspecifiedvmbZdU8();
        goto L18
    L12:
        r3 = LineBreak.Companion.m6756getUnspecifiedrAG3T2k();
        goto L13
    L8:
        r2 = TextDirection.Companion.m6854getUnspecifieds_7Xco();
        goto L10
    L5:
        r1 = TextAlign.Companion.m6841getUnspecifiede0LSkKk();
        goto L6
    }

    /* JADX INFO: renamed from: copy-ykzQM6k$default, reason: not valid java name */
    public static /* synthetic */ ParagraphStyle m6296copyykzQM6k$default(ParagraphStyle r0, int r1, int r2, long r3, TextIndent r5, PlatformParagraphStyle r6, LineHeightStyle r7, int r8, int r9, TextMotion r10, int r11, Object r12) {
        if ((r11 & 1) == 0) goto L6;
        r1 = r0.textAlign;
    L6:
        if ((r11 & 2) == 0) goto L9;
        r2 = r0.textDirection;
    L9:
        if ((r11 & 4) == 0) goto L12;
        r3 = r0.lineHeight;
    L12:
        if ((r11 & 8) == 0) goto L15;
        r5 = r0.textIndent;
    L15:
        if ((r11 & 16) == 0) goto L18;
        r6 = r0.platformStyle;
    L18:
        if ((r11 & 32) == 0) goto L21;
        r7 = r0.lineHeightStyle;
    L21:
        if ((r11 & 64) == 0) goto L24;
        r8 = r0.lineBreak;
    L24:
        if ((r11 & 128) == 0) goto L27;
        r9 = r0.hyphens;
    L27:
        if ((r11 & 256) == 0) goto L29;
        TextMotion r13 = r0.textMotion;
    L30:
        int r14 = r8;
        int r15 = r9;
        LineHeightStyle r16 = r7;
        TextIndent r17 = r5;
        long r18 = r3;
        int r4 = r1;
        int r19 = r2;
        return r0.m6305copyykzQM6k(r4, r19, r18, r17, r6, r16, r14, r15, r13);
    L29:
        r13 = r10;
        goto L30
    }

    /* JADX INFO: renamed from: copy-ykzQM6k, reason: not valid java name */
    public final ParagraphStyle m6305copyykzQM6k(int textAlign, int textDirection, long lineHeight, TextIndent textIndent, PlatformParagraphStyle platformStyle, LineHeightStyle lineHeightStyle, int lineBreak, int hyphens, TextMotion textMotion) {
        return new ParagraphStyle(textAlign, textDirection, lineHeight, textIndent, platformStyle, lineHeightStyle, lineBreak, hyphens, textMotion, null);
    }

    public boolean equals(Object other) {
        if (this != other) goto L6;
        return true;
    L6:
        if ((other instanceof ParagraphStyle) == true) goto L9;
        return false;
    L9:
        if (TextAlign.m6831equalsimpl0(this.textAlign, ((ParagraphStyle) other).textAlign) == true) goto L12;
        return false;
    L12:
        if (TextDirection.m6845equalsimpl0(this.textDirection, ((ParagraphStyle) other).textDirection) == true) goto L15;
        return false;
    L15:
        if (TextUnit.m7164equalsimpl0(this.lineHeight, ((ParagraphStyle) other).lineHeight) == true) goto L18;
        return false;
    L18:
        if (Intrinsics.areEqual(this.textIndent, ((ParagraphStyle) other).textIndent) == true) goto L21;
        return false;
    L21:
        if (Intrinsics.areEqual(this.platformStyle, ((ParagraphStyle) other).platformStyle) == true) goto L24;
        return false;
    L24:
        if (Intrinsics.areEqual(this.lineHeightStyle, ((ParagraphStyle) other).lineHeightStyle) == true) goto L27;
        return false;
    L27:
        if (LineBreak.m6742equalsimpl0(this.lineBreak, ((ParagraphStyle) other).lineBreak) == true) goto L30;
        return false;
    L30:
        if (Hyphens.m6729equalsimpl0(this.hyphens, ((ParagraphStyle) other).hyphens) == true) goto L33;
        return false;
    L33:
        if (Intrinsics.areEqual(this.textMotion, ((ParagraphStyle) other).textMotion) == true) goto L35;
        return false;
    L35:
        return true;
    }

    public int hashCode() {
        int result = TextAlign.m6832hashCodeimpl(this.textAlign);
        int result2 = ((((result * 31) + TextDirection.m6846hashCodeimpl(this.textDirection)) * 31) + TextUnit.m7168hashCodeimpl(this.lineHeight)) * 31;
        TextIndent r2 = this.textIndent;
        int r3 = 0;
        if (r2 == null) goto L5;
        int r4 = r2.hashCode();
    L6:
        int result3 = (result2 + r4) * 31;
        PlatformParagraphStyle r5 = this.platformStyle;
        if (r5 == null) goto L9;
        int r6 = r5.hashCode();
    L10:
        int result4 = (result3 + r6) * 31;
        LineHeightStyle r7 = this.lineHeightStyle;
        if (r7 == null) goto L13;
        int r8 = r7.hashCode();
    L14:
        int result5 = (((((result4 + r8) * 31) + LineBreak.m6746hashCodeimpl(this.lineBreak)) * 31) + Hyphens.m6730hashCodeimpl(this.hyphens)) * 31;
        TextMotion r9 = this.textMotion;
        if (r9 == null) goto L18;
        r3 = r9.hashCode();
    L18:
        return result5 + r3;
    L13:
        r8 = 0;
        goto L14
    L9:
        r6 = 0;
        goto L10
    L5:
        r4 = 0;
        goto L6
    }

    public String toString() {
        return "ParagraphStyle(textAlign=" + TextAlign.m6833toStringimpl(this.textAlign) + ", textDirection=" + TextDirection.m6847toStringimpl(this.textDirection) + ", lineHeight=" + TextUnit.m7174toStringimpl(this.lineHeight) + ", textIndent=" + this.textIndent + ", platformStyle=" + this.platformStyle + ", lineHeightStyle=" + this.lineHeightStyle + ", lineBreak=" + LineBreak.m6747toStringimpl(this.lineBreak) + ", hyphens=" + Hyphens.m6731toStringimpl(this.hyphens) + ", textMotion=" + this.textMotion + ')';
    }
}
