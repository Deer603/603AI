package androidx.compose.foundation.text.input.internal;

import android.content.ClipData;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.Bundle;
import android.text.Spanned;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import android.view.inputmethod.ExtractedText;
import androidx.compose.foundation.content.PlatformTransferableContent;
import androidx.compose.foundation.content.TransferableContent;
import androidx.compose.foundation.text.input.TextFieldCharSequence;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.platform.AndroidClipboardManager_androidKt;
import androidx.compose.ui.platform.ClipEntry;
import androidx.compose.ui.platform.ClipMetadata;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.SpanStyle;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.font.AndroidTypeface_androidKt;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.font.GenericFontFamily;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.core.view.inputmethod.InputContentInfoCompat;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: compiled from: StatelessInputConnection.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000^\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0014\u0010\b\u001a\u0004\u0018\u00010\t2\b\u0010\n\u001a\u0004\u0018\u00010\u0001H\u0002\u001a\u000e\u0010\u000b\u001a\u0004\u0018\u00010\f*\u00020\rH\u0002\u001a\u001e\u0010\u000e\u001a\u0014\u0012\u000e\u0012\f\u0012\u0004\u0012\u00020\f0\u0010j\u0002`\u0011\u0018\u00010\u000f*\u00020\u0012H\u0001\u001a\f\u0010\u0013\u001a\u00020\u0014*\u00020\u0015H\u0002\u001a\u000e\u0010\u0016\u001a\u0004\u0018\u00010\u0017*\u00020\u0018H\u0002\u001a\f\u0010\u0016\u001a\u00020\u0017*\u00020\u0019H\u0002\u001a\u0016\u0010\u001a\u001a\u00020\u001b*\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eH\u0000\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u0016\u0010\u0003\u001a\u00020\u00048\u0000X\u0081T¢\u0006\b\n\u0000\u0012\u0004\b\u0005\u0010\u0006\"\u000e\u0010\u0007\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u001f"}, d2 = {"DEBUG_CLASS", "", StatelessInputConnection_androidKt.EXTRA_INPUT_CONTENT_INFO, "SIC_DEBUG", "", "getSIC_DEBUG$annotations", "()V", "STATELESS_TAG", "optionalFontFamilyFromName", "Landroidx/compose/ui/text/font/FontFamily;", "familyName", "toAnnotation", "Landroidx/compose/ui/text/AnnotatedString$Annotation;", "", "toAnnotationList", "", "Landroidx/compose/ui/text/AnnotatedString$Range;", "Landroidx/compose/foundation/text/input/PlacedAnnotation;", "Landroid/text/Spanned;", "toExtractedText", "Landroid/view/inputmethod/ExtractedText;", "Landroidx/compose/foundation/text/input/TextFieldCharSequence;", "toSpanStyle", "Landroidx/compose/ui/text/SpanStyle;", "Landroid/text/style/StyleSpan;", "Landroid/text/style/TypefaceSpan;", "toTransferableContent", "Landroidx/compose/foundation/content/TransferableContent;", "Landroidx/core/view/inputmethod/InputContentInfoCompat;", "extras", "Landroid/os/Bundle;", "foundation_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class StatelessInputConnection_androidKt {
    private static final String DEBUG_CLASS = "StatelessInputConnection";
    private static final String EXTRA_INPUT_CONTENT_INFO = "EXTRA_INPUT_CONTENT_INFO";
    public static final boolean SIC_DEBUG = false;
    private static final String STATELESS_TAG = "StatelessIC";

    public static final /* synthetic */ ExtractedText access$toExtractedText(TextFieldCharSequence $receiver) {
        return toExtractedText($receiver);
    }

    public static /* synthetic */ void getSIC_DEBUG$annotations() {
    }

    private static final ExtractedText toExtractedText(TextFieldCharSequence r6) {
        ExtractedText r0 = new ExtractedText();
        r0.text = r6;
        r0.startOffset = 0;
        r0.partialEndOffset = r6.length();
        r0.partialStartOffset = -1;
        r0.selectionStart = TextRange.m6415getMinimpl(r6.m1188getSelectiond9O1mEE());
        r0.selectionEnd = TextRange.m6414getMaximpl(r6.m1188getSelectiond9O1mEE());
        r0.flags = !StringsKt.contains$default(r6, '\n', false, 2, null) ? 1 : 0;
        return r0;
    }

    public static final TransferableContent toTransferableContent(InputContentInfoCompat $this$toTransferableContent, Bundle extras) {
        ClipData clipData = new ClipData($this$toTransferableContent.getDescription(), new ClipData.Item($this$toTransferableContent.getContentUri()));
        ClipEntry r2 = AndroidClipboardManager_androidKt.toClipEntry(clipData);
        int r4 = TransferableContent.Source.Companion.m337getKeyboardkB6V9T0();
        ClipMetadata r3 = AndroidClipboardManager_androidKt.toClipMetadata($this$toTransferableContent.getDescription());
        Uri r1 = $this$toTransferableContent.getLinkUri();
        if (extras != null) goto L5;
        Bundle r6 = Bundle.EMPTY;
    L7:
        return new TransferableContent(r2, r3, r4, new PlatformTransferableContent(r1, r6), null);
    L5:
        r6 = extras;
        goto L7
    }

    public static final List<AnnotatedString.Range<AnnotatedString.Annotation>> toAnnotationList(Spanned $this$toAnnotationList) {
        ArrayList r0 = null;
        int r3 = 0;
        Object[] spans = $this$toAnnotationList.getSpans(0, $this$toAnnotationList.length(), Object.class);
        int r5 = spans.length;
    L3:
        if (r3 >= r5) goto L12;
        Object element$iv = spans[r3];
        AnnotatedString.Annotation annotation = toAnnotation(element$iv);
        if (annotation == null) goto L10;
        if (r0 != null) goto L9;
        Object mutableAnnotationList = new ArrayList();
        r0 = (List) mutableAnnotationList;
    L9:
        r0.add(new AnnotatedString.Range(annotation, $this$toAnnotationList.getSpanStart(element$iv), $this$toAnnotationList.getSpanEnd(element$iv)));
    L10:
        r3 = r3 + 1;
        goto L3
    L12:
        return r0;
    }

    private static final AnnotatedString.Annotation toAnnotation(Object $this$toAnnotation) {
        if (($this$toAnnotation instanceof BackgroundColorSpan) == false) goto L6;
        return new SpanStyle(0, 0, null, null, null, null, null, 0, null, null, null, ColorKt.Color(((BackgroundColorSpan) $this$toAnnotation).getBackgroundColor()), null, null, null, null, 63487, null);
    L6:
        if (($this$toAnnotation instanceof ForegroundColorSpan) == false) goto L9;
        return new SpanStyle(ColorKt.Color(((ForegroundColorSpan) $this$toAnnotation).getForegroundColor()), 0, null, null, null, null, null, 0, null, null, null, 0, null, null, null, null, 65534, null);
    L9:
        if (($this$toAnnotation instanceof StrikethroughSpan) == false) goto L12;
        return new SpanStyle(0, 0, null, null, null, null, null, 0, null, null, null, 0, TextDecoration.Companion.getLineThrough(), null, null, null, 61439, null);
    L12:
        if (($this$toAnnotation instanceof StyleSpan) == false) goto L15;
        return toSpanStyle((StyleSpan) $this$toAnnotation);
    L15:
        if (($this$toAnnotation instanceof TypefaceSpan) == false) goto L18;
        return toSpanStyle((TypefaceSpan) $this$toAnnotation);
    L18:
        if (($this$toAnnotation instanceof UnderlineSpan) == true) goto L27;
        return null;
    L27:
        return new SpanStyle(0, 0, null, null, null, null, null, 0, null, null, null, 0, TextDecoration.Companion.getUnderline(), null, null, null, 61439, null);
    }

    private static final SpanStyle toSpanStyle(StyleSpan $this$toSpanStyle) {
        switch($this$toSpanStyle.getStyle()) {
            case 1: goto L8;
            case 2: goto L11;
            case 3: goto L10;
            default: goto L4;
        };
    L4:
        return null;
    L10:
        return new SpanStyle(0, 0, FontWeight.Companion.getBold(), FontStyle.m6525boximpl(FontStyle.Companion.m6534getItalic_LCdwA()), null, null, null, 0, null, null, null, 0, null, null, null, null, 65523, null);
    L11:
        return new SpanStyle(0, 0, null, FontStyle.m6525boximpl(FontStyle.Companion.m6534getItalic_LCdwA()), null, null, null, 0, null, null, null, 0, null, null, null, null, 65527, null);
    L8:
        return new SpanStyle(0, 0, FontWeight.Companion.getBold(), null, null, null, null, 0, null, null, null, 0, null, null, null, null, 65531, null);
    }

    private static final SpanStyle toSpanStyle(TypefaceSpan $this$toSpanStyle) {
        String r0 = $this$toSpanStyle.getFamily();
        if (Intrinsics.areEqual(r0, FontFamily.Companion.getCursive().getName()) == false) goto L6;
        GenericFontFamily r1 = FontFamily.Companion.getCursive();
    L15:
        FontFamily fontFamily = r1;
        return new SpanStyle(0, 0, null, null, null, fontFamily, null, 0, null, null, null, 0, null, null, null, null, 65503, null);
    L6:
        if (Intrinsics.areEqual(r0, FontFamily.Companion.getMonospace().getName()) == false) goto L9;
        r1 = FontFamily.Companion.getMonospace();
        goto L15
    L9:
        if (Intrinsics.areEqual(r0, FontFamily.Companion.getSansSerif().getName()) == false) goto L12;
        r1 = FontFamily.Companion.getSansSerif();
        goto L15
    L12:
        if (Intrinsics.areEqual(r0, FontFamily.Companion.getSerif().getName()) == false) goto L14;
        r1 = FontFamily.Companion.getSerif();
        goto L15
    L14:
        r1 = optionalFontFamilyFromName($this$toSpanStyle.getFamily());
        goto L15
    }

    private static final FontFamily optionalFontFamilyFromName(String familyName) {
        String r0 = familyName;
        boolean r1 = true;
        if (r0 != null) goto L5;
    L8:
        boolean r2 = true;
    L10:
        if (r2 == false) goto L12;
        return null;
    L12:
        Typeface typeface = Typeface.create(familyName, 0);
        if (Intrinsics.areEqual(typeface, Typeface.DEFAULT) == false) goto L15;
    L17:
        r1 = false;
    L18:
        if (r1 == false) goto L20;
        Typeface it = typeface;
    L21:
        if (it != null) goto L23;
        return null;
    L23:
        return AndroidTypeface_androidKt.FontFamily(it);
    L20:
        it = null;
        goto L21
    L15:
        if (Intrinsics.areEqual(typeface, Typeface.create(Typeface.DEFAULT, 0)) == true) goto L17;
    L5:
        if (r0.length() == 0) goto L8;
        r2 = false;
        goto L10
    }
}
