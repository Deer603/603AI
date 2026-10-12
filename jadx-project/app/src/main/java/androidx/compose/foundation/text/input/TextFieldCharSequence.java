package androidx.compose.foundation.text.input;

import androidx.compose.foundation.text.input.internal.ToCharArray_androidKt;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.TextRangeKt;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: compiled from: TextFieldCharSequence.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\f\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0019\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\b\u0000\u0018\u00002\u00020\u0001BY\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0001\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0016\b\u0002\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0007\u0012\u001a\b\u0002\u0010\t\u001a\u0014\u0012\u000e\u0012\f\u0012\u0004\u0012\u00020\f0\u000bj\u0002`\r\u0018\u00010\n¢\u0006\u0002\u0010\u000eJ\u000e\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u0001J\u0013\u0010!\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010\"H\u0096\u0002J\u0011\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020\u0016H\u0096\u0002J\b\u0010&\u001a\u00020\u0016H\u0016J\u0006\u0010'\u001a\u00020\u001fJ\u0018\u0010(\u001a\u00020\u00012\u0006\u0010)\u001a\u00020\u00162\u0006\u0010*\u001a\u00020\u0016H\u0016J&\u0010+\u001a\u00020,2\u0006\u0010-\u001a\u00020.2\u0006\u0010/\u001a\u00020\u00162\u0006\u00100\u001a\u00020\u00162\u0006\u00101\u001a\u00020\u0016J\b\u00102\u001a\u000203H\u0016R#\u0010\t\u001a\u0014\u0012\u000e\u0012\f\u0012\u0004\u0012\u00020\f0\u000bj\u0002`\r\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u001f\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0015\u001a\u00020\u00168VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018R\u0019\u0010\u0003\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u001b\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\u0002\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001d\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u00064"}, d2 = {"Landroidx/compose/foundation/text/input/TextFieldCharSequence;", "", "text", "selection", "Landroidx/compose/ui/text/TextRange;", "composition", "highlight", "Lkotlin/Pair;", "Landroidx/compose/foundation/text/input/TextHighlightType;", "composingAnnotations", "", "Landroidx/compose/ui/text/AnnotatedString$Range;", "Landroidx/compose/ui/text/AnnotatedString$Annotation;", "Landroidx/compose/foundation/text/input/PlacedAnnotation;", "(Ljava/lang/CharSequence;JLandroidx/compose/ui/text/TextRange;Lkotlin/Pair;Ljava/util/List;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "getComposingAnnotations", "()Ljava/util/List;", "getComposition-MzsxiRA", "()Landroidx/compose/ui/text/TextRange;", "getHighlight", "()Lkotlin/Pair;", "length", "", "getLength", "()I", "getSelection-d9O1mEE", "()J", "J", "getText", "()Ljava/lang/CharSequence;", "contentEquals", "", "other", "equals", "", "get", "", "index", "hashCode", "shouldShowSelection", "subSequence", "startIndex", "endIndex", "toCharArray", "", "destination", "", "destinationOffset", "sourceStartIndex", "sourceEndIndex", "toString", "", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class TextFieldCharSequence implements CharSequence {
    public static final int $stable = 0;
    private final List<AnnotatedString.Range<AnnotatedString.Annotation>> composingAnnotations;
    private final TextRange composition;
    private final Pair<TextHighlightType, TextRange> highlight;
    private final long selection;
    private final CharSequence text;

    static {
        $stable = 8;
    }

    public /* synthetic */ TextFieldCharSequence(CharSequence r1, long r2, TextRange r4, Pair r5, List r6, DefaultConstructorMarker r7) {
        this(r1, r2, r4, r5, r6);
    }

    private TextFieldCharSequence(CharSequence text, long selection, TextRange composition, Pair<TextHighlightType, TextRange> r10, List<AnnotatedString.Range<AnnotatedString.Annotation>> r11) {
        this.composingAnnotations = r11;
        if ((text instanceof TextFieldCharSequence) == false) goto L5;
        CharSequence r0 = ((TextFieldCharSequence) text).text;
    L6:
        this.text = r0;
        this.selection = TextRangeKt.m6423coerceIn8ffj60Q(selection, 0, text.length());
        Pair<TextHighlightType, TextRange> r1 = null;
        if (composition == null) goto L9;
        TextRange r2 = TextRange.m6405boximpl(TextRangeKt.m6423coerceIn8ffj60Q(composition.m6421unboximpl(), 0, text.length()));
    L10:
        this.composition = r2;
        if (r10 == null) goto L13;
        r1 = Pair.copy$default(r10, null, TextRange.m6405boximpl(TextRangeKt.m6423coerceIn8ffj60Q(r10.getSecond().m6421unboximpl(), 0, text.length())), 1, null);
    L13:
        this.highlight = r1;
        return;
    L9:
        r2 = null;
        goto L10
    L5:
        r0 = text;
        goto L6
    }

    public /* synthetic */ TextFieldCharSequence(CharSequence r8, long r9, TextRange r11, Pair r12, List r13, int r14, DefaultConstructorMarker r15) {
        if ((r14 & 1) == 0) goto L5;
    L7:
        if ((r14 & 2) == 0) goto L9;
        long r1 = TextRange.Companion.m6422getZerod9O1mEE();
    L10:
        List r4 = null;
        if ((r14 & 4) == 0) goto L13;
        TextRange r3 = null;
    L15:
        if ((r14 & 8) == 0) goto L17;
        Pair r5 = null;
    L19:
        if ((r14 & 16) != 0) goto L22;
        r4 = r13;
    L22:
        Pair r16 = r5;
        this(r0, r1, r3, r16, r4, null);
        return;
    L17:
        r5 = r12;
        goto L19
    L13:
        r3 = r11;
        goto L15
    L9:
        r1 = r9;
        goto L10
    L5:
        CharSequence r0 = r8;
        goto L7
    }

    @Override // java.lang.CharSequence
    public final /* bridge */ char charAt(int index) {
        return get(index);
    }

    @Override // java.lang.CharSequence
    public final /* bridge */ int length() {
        return getLength();
    }

    public final List<AnnotatedString.Range<AnnotatedString.Annotation>> getComposingAnnotations() {
        return this.composingAnnotations;
    }

    public int getLength() {
        return this.text.length();
    }

    public final CharSequence getText() {
        return this.text;
    }

    /* JADX INFO: renamed from: getSelection-d9O1mEE, reason: not valid java name */
    public final long m1188getSelectiond9O1mEE() {
        return this.selection;
    }

    /* JADX INFO: renamed from: getComposition-MzsxiRA, reason: not valid java name */
    public final TextRange m1187getCompositionMzsxiRA() {
        return this.composition;
    }

    public final Pair<TextHighlightType, TextRange> getHighlight() {
        return this.highlight;
    }

    public char get(int index) {
        return this.text.charAt(index);
    }

    @Override // java.lang.CharSequence
    public CharSequence subSequence(int startIndex, int endIndex) {
        return this.text.subSequence(startIndex, endIndex);
    }

    @Override // java.lang.CharSequence
    public String toString() {
        return this.text.toString();
    }

    public final boolean contentEquals(CharSequence other) {
        return StringsKt.contentEquals(this.text, other);
    }

    public final void toCharArray(char[] destination, int destinationOffset, int sourceStartIndex, int sourceEndIndex) {
        ToCharArray_androidKt.toCharArray(this.text, destination, destinationOffset, sourceStartIndex, sourceEndIndex);
    }

    public final boolean shouldShowSelection() {
        if (this.highlight != null) goto L5;
        return true;
    L5:
        return false;
    }

    public boolean equals(Object other) {
        if (this != other) goto L6;
        return true;
    L6:
        if (other != null) goto L9;
        return false;
    L9:
        if (getClass() == other.getClass()) goto L11;
        return false;
    L11:
        TextFieldCharSequence r2 = (TextFieldCharSequence) other;
        if (TextRange.m6410equalsimpl0(this.selection, ((TextFieldCharSequence) other).selection) == true) goto L15;
        return false;
    L15:
        if (Intrinsics.areEqual(this.composition, ((TextFieldCharSequence) other).composition) == true) goto L18;
        return false;
    L18:
        if (Intrinsics.areEqual(this.highlight, ((TextFieldCharSequence) other).highlight) == true) goto L21;
        return false;
    L21:
        if (Intrinsics.areEqual(this.composingAnnotations, ((TextFieldCharSequence) other).composingAnnotations) == true) goto L24;
        return false;
    L24:
        if (contentEquals(((TextFieldCharSequence) other).text) == true) goto L26;
        return false;
    L26:
        return true;
    }

    public int hashCode() {
        int result = this.text.hashCode();
        int result2 = ((result * 31) + TextRange.m6418hashCodeimpl(this.selection)) * 31;
        TextRange r2 = this.composition;
        int r3 = 0;
        if (r2 == null) goto L5;
        int r4 = TextRange.m6418hashCodeimpl(r2.m6421unboximpl());
    L6:
        int result3 = (result2 + r4) * 31;
        Pair<TextHighlightType, TextRange> r5 = this.highlight;
        if (r5 == null) goto L9;
        int r6 = r5.hashCode();
    L10:
        int result4 = (result3 + r6) * 31;
        List<AnnotatedString.Range<AnnotatedString.Annotation>> r7 = this.composingAnnotations;
        if (r7 == null) goto L14;
        r3 = r7.hashCode();
    L14:
        return result4 + r3;
    L9:
        r6 = 0;
        goto L10
    L5:
        r4 = 0;
        goto L6
    }
}
