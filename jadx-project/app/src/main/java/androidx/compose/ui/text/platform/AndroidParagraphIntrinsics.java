package androidx.compose.ui.text.platform;

import android.graphics.Typeface;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.ParagraphIntrinsics;
import androidx.compose.ui.text.Placeholder;
import androidx.compose.ui.text.SpanStyle;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.android.LayoutIntrinsics;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.platform.extensions.TextPaintExtensions_androidKt;
import androidx.compose.ui.unit.Density;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function4;

/* JADX INFO: compiled from: AndroidParagraphIntrinsics.android.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\r\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001BO\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0014\u0010\u0006\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\t0\b0\u0007\u0012\u0012\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\b0\u0007\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f¢\u0006\u0002\u0010\u0010R\u001f\u0010\u0006\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\t0\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0013\u001a\u00020\u0014X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u000e\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u000e\u0010\u0019\u001a\u00020\u001aX\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0014\u0010\u001d\u001a\u00020\u001a8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001fR\u0014\u0010 \u001a\u00020!X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0014\u0010$\u001a\u00020%8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b&\u0010'R\u0014\u0010(\u001a\u00020%8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b)\u0010'R\u001d\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b*\u0010\u0012R\u0010\u0010+\u001a\u0004\u0018\u00010,X\u0082\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b-\u0010.R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b/\u00100R\u0014\u00101\u001a\u000202X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b3\u00104R\u0014\u00105\u001a\u000206X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b7\u00108¨\u00069"}, d2 = {"Landroidx/compose/ui/text/platform/AndroidParagraphIntrinsics;", "Landroidx/compose/ui/text/ParagraphIntrinsics;", "text", "", "style", "Landroidx/compose/ui/text/TextStyle;", "annotations", "", "Landroidx/compose/ui/text/AnnotatedString$Range;", "Landroidx/compose/ui/text/AnnotatedString$Annotation;", "placeholders", "Landroidx/compose/ui/text/Placeholder;", "fontFamilyResolver", "Landroidx/compose/ui/text/font/FontFamily$Resolver;", "density", "Landroidx/compose/ui/unit/Density;", "(Ljava/lang/String;Landroidx/compose/ui/text/TextStyle;Ljava/util/List;Ljava/util/List;Landroidx/compose/ui/text/font/FontFamily$Resolver;Landroidx/compose/ui/unit/Density;)V", "getAnnotations", "()Ljava/util/List;", "charSequence", "", "getCharSequence$ui_text_release", "()Ljava/lang/CharSequence;", "getDensity", "()Landroidx/compose/ui/unit/Density;", "emojiCompatProcessed", "", "getFontFamilyResolver", "()Landroidx/compose/ui/text/font/FontFamily$Resolver;", "hasStaleResolvedFonts", "getHasStaleResolvedFonts", "()Z", "layoutIntrinsics", "Landroidx/compose/ui/text/android/LayoutIntrinsics;", "getLayoutIntrinsics$ui_text_release", "()Landroidx/compose/ui/text/android/LayoutIntrinsics;", "maxIntrinsicWidth", "", "getMaxIntrinsicWidth", "()F", "minIntrinsicWidth", "getMinIntrinsicWidth", "getPlaceholders", "resolvedTypefaces", "Landroidx/compose/ui/text/platform/TypefaceDirtyTrackerLinkedList;", "getStyle", "()Landroidx/compose/ui/text/TextStyle;", "getText", "()Ljava/lang/String;", "textDirectionHeuristic", "", "getTextDirectionHeuristic$ui_text_release", "()I", "textPaint", "Landroidx/compose/ui/text/platform/AndroidTextPaint;", "getTextPaint$ui_text_release", "()Landroidx/compose/ui/text/platform/AndroidTextPaint;", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class AndroidParagraphIntrinsics implements ParagraphIntrinsics {
    public static final int $stable = 0;
    private final List<AnnotatedString.Range<? extends AnnotatedString.Annotation>> annotations;
    private final CharSequence charSequence;
    private final Density density;
    private final boolean emojiCompatProcessed;
    private final FontFamily.Resolver fontFamilyResolver;
    private final LayoutIntrinsics layoutIntrinsics;
    private final List<AnnotatedString.Range<Placeholder>> placeholders;
    private TypefaceDirtyTrackerLinkedList resolvedTypefaces;
    private final TextStyle style;
    private final String text;
    private final int textDirectionHeuristic;
    private final AndroidTextPaint textPaint;

    static {
        $stable = 8;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AndroidParagraphIntrinsics(String text, TextStyle style, List<? extends AnnotatedString.Range<? extends AnnotatedString.Annotation>> r27, List<AnnotatedString.Range<Placeholder>> r28, FontFamily.Resolver fontFamilyResolver, Density density) {
        this.text = text;
        this.style = style;
        this.annotations = r27;
        this.placeholders = r28;
        this.fontFamilyResolver = fontFamilyResolver;
        this.density = density;
        this.textPaint = new AndroidTextPaint(1, this.density.getDensity());
        if (AndroidParagraphIntrinsics_androidKt.access$getHasEmojiCompat(this.style) == true) goto L5;
        boolean r7 = false;
    L6:
        this.emojiCompatProcessed = r7;
        this.textDirectionHeuristic = AndroidParagraphIntrinsics_androidKt.m6674resolveTextDirectionHeuristicsHklW4sA(this.style.m6460getTextDirections_7Xco(), this.style.getLocaleList());
        Function4<FontFamily, FontWeight, FontStyle, FontSynthesis, Typeface> r8 = new AndroidParagraphIntrinsics$resolveTypeface$1(this);
        TextPaintExtensions_androidKt.setTextMotion(this.textPaint, this.style.getTextMotion());
        AndroidTextPaint r10 = this.textPaint;
        SpanStyle r11 = this.style.toSpanStyle();
        Density r12 = this.density;
        List<AnnotatedString.Range<? extends AnnotatedString.Annotation>> r13 = this.annotations;
        int r9 = r13.size();
        int index$iv$iv = 0;
    L7:
        if (index$iv$iv >= r9) goto L12;
        Object item$iv$iv = r13.get(index$iv$iv);
        Object it$iv = item$iv$iv;
        if ((((AnnotatedString.Range) it$iv).getItem() instanceof SpanStyle) == true) goto L13;
        index$iv$iv = index$iv$iv + 1;
    L13:
        if (it$iv == null) goto L15;
        boolean r1 = true;
    L16:
        SpanStyle notAppliedStyle = TextPaintExtensions_androidKt.applySpanStyle(r10, r11, r8, r12, r1);
        List<AnnotatedString.Range<? extends AnnotatedString.Annotation>> r14 = this.annotations;
        if (notAppliedStyle == null) goto L26;
        int r15 = r14.size() + 1;
        ArrayList r16 = new ArrayList(r15);
        int r17 = 0;
    L19:
        if (r17 >= r15) goto L25;
        int position = r17;
        if (position != 0) goto L23;
        AnnotatedString.Range<? extends AnnotatedString.Annotation> r18 = new AnnotatedString.Range(notAppliedStyle, 0, this.text.length());
    L24:
        r16.add(r18);
        r17 = r17 + 1;
        goto L19
    L23:
        r18 = this.annotations.get(position - 1);
        goto L24
    L25:
        List<AnnotatedString.Range<? extends AnnotatedString.Annotation>> r19 = r16;
    L27:
        this.charSequence = AndroidParagraphHelper_androidKt.createCharSequence(this.text, this.textPaint.getTextSize(), this.style, r19, this.placeholders, this.density, r8, this.emojiCompatProcessed);
        this.layoutIntrinsics = new LayoutIntrinsics(this.charSequence, this.textPaint, this.textDirectionHeuristic);
        return;
    L26:
        r19 = r14;
        goto L27
    L15:
        r1 = false;
        goto L16
    L12:
        it$iv = null;
        goto L13
    L5:
        r7 = EmojiCompatStatus.INSTANCE.getFontLoaded().getValue().booleanValue();
        goto L6
    }

    public static final /* synthetic */ TypefaceDirtyTrackerLinkedList access$getResolvedTypefaces$p(AndroidParagraphIntrinsics $this) {
        return $this.resolvedTypefaces;
    }

    public static final /* synthetic */ void access$setResolvedTypefaces$p(AndroidParagraphIntrinsics $this, TypefaceDirtyTrackerLinkedList r1) {
        $this.resolvedTypefaces = r1;
    }

    public final String getText() {
        return this.text;
    }

    public final TextStyle getStyle() {
        return this.style;
    }

    public final List<AnnotatedString.Range<? extends AnnotatedString.Annotation>> getAnnotations() {
        return this.annotations;
    }

    public final List<AnnotatedString.Range<Placeholder>> getPlaceholders() {
        return this.placeholders;
    }

    public final FontFamily.Resolver getFontFamilyResolver() {
        return this.fontFamilyResolver;
    }

    public final Density getDensity() {
        return this.density;
    }

    public final AndroidTextPaint getTextPaint$ui_text_release() {
        return this.textPaint;
    }

    public final CharSequence getCharSequence$ui_text_release() {
        return this.charSequence;
    }

    public final LayoutIntrinsics getLayoutIntrinsics$ui_text_release() {
        return this.layoutIntrinsics;
    }

    @Override // androidx.compose.ui.text.ParagraphIntrinsics
    public float getMaxIntrinsicWidth() {
        return this.layoutIntrinsics.getMaxIntrinsicWidth();
    }

    @Override // androidx.compose.ui.text.ParagraphIntrinsics
    public float getMinIntrinsicWidth() {
        return this.layoutIntrinsics.getMinIntrinsicWidth();
    }

    @Override // androidx.compose.ui.text.ParagraphIntrinsics
    public boolean getHasStaleResolvedFonts() {
        TypefaceDirtyTrackerLinkedList r0 = this.resolvedTypefaces;
        if (r0 == null) goto L5;
        boolean r1 = r0.isStaleResolvedFont();
    L6:
        if (r1 == false) goto L8;
    L15:
        return true;
    L8:
        if (this.emojiCompatProcessed == false) goto L10;
        return false;
    L10:
        if (AndroidParagraphIntrinsics_androidKt.access$getHasEmojiCompat(this.style) == true) goto L12;
        return false;
    L12:
        if (EmojiCompatStatus.INSTANCE.getFontLoaded().getValue().booleanValue() == true) goto L15;
        return false;
    L5:
        r1 = false;
        goto L6
    }

    public final int getTextDirectionHeuristic$ui_text_release() {
        return this.textDirectionHeuristic;
    }
}
