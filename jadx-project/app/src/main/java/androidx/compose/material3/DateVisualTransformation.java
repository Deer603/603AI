package androidx.compose.material3;

import androidx.compose.material3.internal.DateInputFormat;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.input.TransformedText;
import androidx.compose.ui.text.input.VisualTransformation;
import kotlin.Metadata;
import kotlin.ranges.RangesKt;
import kotlin.text.StringsKt;

/* JADX INFO: compiled from: DateInput.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000+\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\b\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0004\n\u0002\u0010\tR\u000e\u0010\n\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Landroidx/compose/material3/DateVisualTransformation;", "Landroidx/compose/ui/text/input/VisualTransformation;", "dateInputFormat", "Landroidx/compose/material3/internal/DateInputFormat;", "(Landroidx/compose/material3/internal/DateInputFormat;)V", "dateFormatLength", "", "dateOffsetTranslator", "androidx/compose/material3/DateVisualTransformation$dateOffsetTranslator$1", "Landroidx/compose/material3/DateVisualTransformation$dateOffsetTranslator$1;", "firstDelimiterOffset", "secondDelimiterOffset", "filter", "Landroidx/compose/ui/text/input/TransformedText;", "text", "Landroidx/compose/ui/text/AnnotatedString;", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
final class DateVisualTransformation implements VisualTransformation {
    private final int dateFormatLength;
    private final DateInputFormat dateInputFormat;
    private final DateVisualTransformation$dateOffsetTranslator$1 dateOffsetTranslator;
    private final int firstDelimiterOffset;
    private final int secondDelimiterOffset;

    /* JADX WARN: Type inference failed for: r0v11, types: [androidx.compose.material3.DateVisualTransformation$dateOffsetTranslator$1] */
    public DateVisualTransformation(DateInputFormat dateInputFormat) {
        this.dateInputFormat = dateInputFormat;
        this.firstDelimiterOffset = StringsKt.indexOf$default(this.dateInputFormat.getPatternWithDelimiters(), this.dateInputFormat.getDelimiter(), 0, false, 6, null);
        this.secondDelimiterOffset = StringsKt.lastIndexOf$default(this.dateInputFormat.getPatternWithDelimiters(), this.dateInputFormat.getDelimiter(), 0, false, 6, null);
        this.dateFormatLength = this.dateInputFormat.getPatternWithoutDelimiters().length();
        this.dateOffsetTranslator = new DateVisualTransformation$dateOffsetTranslator$1(this);
    }

    public static final /* synthetic */ int access$getDateFormatLength$p(DateVisualTransformation $this) {
        return $this.dateFormatLength;
    }

    public static final /* synthetic */ int access$getFirstDelimiterOffset$p(DateVisualTransformation $this) {
        return $this.firstDelimiterOffset;
    }

    public static final /* synthetic */ int access$getSecondDelimiterOffset$p(DateVisualTransformation $this) {
        return $this.secondDelimiterOffset;
    }

    @Override // androidx.compose.ui.text.input.VisualTransformation
    public TransformedText filter(AnnotatedString text) {
        int r2 = 0;
        if (text.getText().length() <= this.dateFormatLength) goto L5;
        CharSequence trimmedText = StringsKt.substring(text.getText(), RangesKt.until(0, this.dateFormatLength));
    L6:
        CharSequence $this$forEachIndexed$iv = trimmedText;
        int index$iv = 0;
        String r7 = "";
    L8:
        if (r2 >= $this$forEachIndexed$iv.length()) goto L16;
        char item$iv = $this$forEachIndexed$iv.charAt(r2);
        int index$iv2 = index$iv + 1;
        r7 = r7 + item$iv;
        if ((index$iv + 1) != this.firstDelimiterOffset) goto L12;
    L13:
        r7 = r7 + this.dateInputFormat.getDelimiter();
    L14:
        r2 = r2 + 1;
        index$iv = index$iv2;
        goto L8
    L12:
        if ((index$iv + 2) != this.secondDelimiterOffset) goto L14;
    L16:
        return new TransformedText(new AnnotatedString(r7, null, null, 6, null), this.dateOffsetTranslator);
    L5:
        trimmedText = text.getText();
        goto L6
    }
}
