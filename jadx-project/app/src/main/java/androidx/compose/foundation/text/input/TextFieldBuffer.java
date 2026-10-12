package androidx.compose.foundation.text.input;

import androidx.compose.foundation.internal.InlineClassHelperKt;
import androidx.compose.foundation.text.input.internal.ChangeTracker;
import androidx.compose.foundation.text.input.internal.OffsetMappingCalculator;
import androidx.compose.foundation.text.input.internal.PartialGapBuffer;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.TextRangeKt;
import androidx.savedstate.serialization.ClassDiscriminatorModeKt;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.ranges.RangesKt;

/* JADX INFO: compiled from: TextFieldBuffer.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0092\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\r\n\u0002\b\f\n\u0002\u0010\f\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0019\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0007\u0018\u00002\u00060\u0001j\u0002`\u0002:\u0001sB1\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0002\u0010\nJ\u0014\u0010@\u001a\u00060\u0001j\u0002`\u00022\u0006\u0010A\u001a\u00020BH\u0016J\u0016\u0010@\u001a\u00060\u0001j\u0002`\u00022\b\u0010C\u001a\u0004\u0018\u000105H\u0016J&\u0010@\u001a\u00060\u0001j\u0002`\u00022\b\u0010C\u001a\u0004\u0018\u0001052\u0006\u0010D\u001a\u00020.2\u0006\u0010E\u001a\u00020.H\u0016J\u0006\u0010F\u001a\u000205J\u000e\u0010G\u001a\u00020B2\u0006\u0010H\u001a\u00020.J\b\u0010I\u001a\u00020JH\u0002J\r\u0010K\u001a\u00020JH\u0000¢\u0006\u0002\bLJ\r\u0010M\u001a\u00020JH\u0000¢\u0006\u0002\bNJ\r\u0010O\u001a\u00020&H\u0000¢\u0006\u0002\bPJ \u0010Q\u001a\u00020J2\u0006\u0010R\u001a\u00020.2\u0006\u0010S\u001a\u00020.2\u0006\u0010T\u001a\u00020.H\u0002J\u000e\u0010U\u001a\u00020J2\u0006\u0010H\u001a\u00020.J\u000e\u0010V\u001a\u00020J2\u0006\u0010H\u001a\u00020.J\u001e\u0010W\u001a\u00020J2\u0006\u0010D\u001a\u00020.2\u0006\u0010E\u001a\u00020.2\u0006\u0010C\u001a\u000205J9\u0010W\u001a\u00020J2\u0006\u0010D\u001a\u00020.2\u0006\u0010E\u001a\u00020.2\u0006\u0010C\u001a\u0002052\b\b\u0002\u0010X\u001a\u00020.2\b\b\u0002\u0010Y\u001a\u00020.H\u0000¢\u0006\u0002\bZJ \u0010[\u001a\u00020J2\u0006\u0010H\u001a\u00020.2\u0006\u0010\\\u001a\u00020&2\u0006\u0010]\u001a\u00020&H\u0002J\u001a\u0010^\u001a\u00020J2\u0006\u0010_\u001a\u00020\u001fH\u0002ø\u0001\u0000¢\u0006\u0004\b`\u0010=J\u0006\u0010a\u001a\u00020JJ9\u0010b\u001a\u00020J2\u0006\u0010D\u001a\u00020.2\u0006\u0010E\u001a\u00020.2\u001a\b\u0002\u0010c\u001a\u0014\u0012\u000e\u0012\f\u0012\u0004\u0012\u00020\u001a0\u0019j\u0002`e\u0018\u00010dH\u0000¢\u0006\u0002\bfJ*\u0010g\u001a\u00020J2\u0006\u0010h\u001a\u00020)2\u0006\u0010D\u001a\u00020.2\u0006\u0010E\u001a\u00020.H\u0000ø\u0001\u0000¢\u0006\u0004\bi\u0010jJ\u0015\u0010k\u001a\u00020J2\u0006\u0010l\u001a\u000205H\u0000¢\u0006\u0002\bmJ\b\u0010n\u001a\u00020oH\u0016JD\u0010p\u001a\u00020\u00042\b\b\u0002\u0010:\u001a\u00020\u001f2\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u001f2\u001a\b\u0002\u0010\u001b\u001a\u0014\u0012\u000e\u0012\f\u0012\u0004\u0012\u00020\u001a0\u0019j\u0002`e\u0018\u00010dH\u0000ø\u0001\u0000¢\u0006\u0004\bq\u0010rR\u0010\u0010\u000b\u001a\u0004\u0018\u00010\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\u00020\u00068@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0011\u001a\u00020\u00128FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R:\u0010\u001b\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001a0\u0019\u0018\u00010\u00182\u0014\u0010\u0017\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001a0\u0019\u0018\u00010\u0018@BX\u0080\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR.\u0010 \u001a\u0004\u0018\u00010\u001f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001f@BX\u0080\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\u0011\u0010%\u001a\u00020&8G¢\u0006\u0006\u001a\u0004\b%\u0010'R:\u0010*\u001a\u0010\u0012\u0004\u0012\u00020)\u0012\u0004\u0012\u00020\u001f\u0018\u00010(2\u0014\u0010\u0017\u001a\u0010\u0012\u0004\u0012\u00020)\u0012\u0004\u0012\u00020\u001f\u0018\u00010(@BX\u0080\u000e¢\u0006\b\n\u0000\u001a\u0004\b+\u0010,R\u0011\u0010-\u001a\u00020.8F¢\u0006\u0006\u001a\u0004\b/\u00100R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u00101\u001a\u00020\u001f8Fø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b2\u00103R\u0011\u00104\u001a\u0002058F¢\u0006\u0006\u001a\u0004\b6\u00107R\u0014\u0010\u0007\u001a\u00020\u0004X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b8\u00109R*\u0010:\u001a\u00020\u001f2\u0006\u0010\u001e\u001a\u00020\u001f8F@FX\u0086\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\f\u001a\u0004\b;\u00103\"\u0004\b<\u0010=R\u0016\u0010>\u001a\u00020\u001fX\u0082\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\n\u0002\u0010?\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006t"}, d2 = {"Landroidx/compose/foundation/text/input/TextFieldBuffer;", "Ljava/lang/Appendable;", "Lkotlin/text/Appendable;", "initialValue", "Landroidx/compose/foundation/text/input/TextFieldCharSequence;", "initialChanges", "Landroidx/compose/foundation/text/input/internal/ChangeTracker;", "originalValue", "offsetMappingCalculator", "Landroidx/compose/foundation/text/input/internal/OffsetMappingCalculator;", "(Landroidx/compose/foundation/text/input/TextFieldCharSequence;Landroidx/compose/foundation/text/input/internal/ChangeTracker;Landroidx/compose/foundation/text/input/TextFieldCharSequence;Landroidx/compose/foundation/text/input/internal/OffsetMappingCalculator;)V", "backingChangeTracker", "buffer", "Landroidx/compose/foundation/text/input/internal/PartialGapBuffer;", "changeTracker", "getChangeTracker$foundation_release", "()Landroidx/compose/foundation/text/input/internal/ChangeTracker;", "changes", "Landroidx/compose/foundation/text/input/TextFieldBuffer$ChangeList;", "getChanges$annotations", "()V", "getChanges", "()Landroidx/compose/foundation/text/input/TextFieldBuffer$ChangeList;", "<set-?>", "Landroidx/compose/runtime/collection/MutableVector;", "Landroidx/compose/ui/text/AnnotatedString$Range;", "Landroidx/compose/ui/text/AnnotatedString$Annotation;", "composingAnnotations", "getComposingAnnotations$foundation_release", "()Landroidx/compose/runtime/collection/MutableVector;", "value", "Landroidx/compose/ui/text/TextRange;", "composition", "getComposition-MzsxiRA$foundation_release", "()Landroidx/compose/ui/text/TextRange;", "setComposition-OEnZFl4", "(Landroidx/compose/ui/text/TextRange;)V", "hasSelection", "", "()Z", "Lkotlin/Pair;", "Landroidx/compose/foundation/text/input/TextHighlightType;", "highlight", "getHighlight$foundation_release", "()Lkotlin/Pair;", "length", "", "getLength", "()I", "originalSelection", "getOriginalSelection-d9O1mEE", "()J", "originalText", "", "getOriginalText", "()Ljava/lang/CharSequence;", "getOriginalValue$foundation_release", "()Landroidx/compose/foundation/text/input/TextFieldCharSequence;", "selection", "getSelection-d9O1mEE", "setSelection-5zc-tL8", "(J)V", "selectionInChars", "J", "append", "char", "", "text", "start", "end", "asCharSequence", "charAt", "index", "clearChangeList", "", "clearHighlight", "clearHighlight$foundation_release", "commitComposition", "commitComposition$foundation_release", "hasComposition", "hasComposition$foundation_release", "onTextWillChange", "replaceStart", "replaceEnd", "newLength", "placeCursorAfterCharAt", "placeCursorBeforeCharAt", "replace", "textStart", "textEnd", "replace$foundation_release", "requireValidIndex", "startExclusive", "endExclusive", "requireValidRange", "range", "requireValidRange-5zc-tL8", "revertAllChanges", "setComposition", "annotations", "", "Landroidx/compose/foundation/text/input/PlacedAnnotation;", "setComposition$foundation_release", "setHighlight", ClassDiscriminatorModeKt.CLASS_DISCRIMINATOR_KEY, "setHighlight-K7f2yys$foundation_release", "(III)V", "setTextIfChanged", "newText", "setTextIfChanged$foundation_release", "toString", "", "toTextFieldCharSequence", "toTextFieldCharSequence-I88jaVs$foundation_release", "(JLandroidx/compose/ui/text/TextRange;Ljava/util/List;)Landroidx/compose/foundation/text/input/TextFieldCharSequence;", "ChangeList", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class TextFieldBuffer implements Appendable {
    public static final int $stable = 0;
    private ChangeTracker backingChangeTracker;
    private final PartialGapBuffer buffer;
    private MutableVector<AnnotatedString.Range<AnnotatedString.Annotation>> composingAnnotations;
    private TextRange composition;
    private Pair<TextHighlightType, TextRange> highlight;
    private final OffsetMappingCalculator offsetMappingCalculator;
    private final TextFieldCharSequence originalValue;
    private long selectionInChars;

    /* JADX INFO: compiled from: TextFieldBuffer.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001J\u001d\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0003H&ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\u000b\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0003H&ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\f\u0010\nR\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005ø\u0001\u0002\u0082\u0002\u0011\n\u0002\b!\n\u0005\b¡\u001e0\u0001\n\u0004\b!0\u0001¨\u0006\rÀ\u0006\u0001"}, d2 = {"Landroidx/compose/foundation/text/input/TextFieldBuffer$ChangeList;", "", "changeCount", "", "getChangeCount", "()I", "getOriginalRange", "Landroidx/compose/ui/text/TextRange;", "changeIndex", "getOriginalRange--jx7JFs", "(I)J", "getRange", "getRange--jx7JFs", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface ChangeList {
        int getChangeCount();

        /* JADX INFO: renamed from: getOriginalRange--jx7JFs, reason: not valid java name */
        long mo1184getOriginalRangejx7JFs(int r1);

        /* JADX INFO: renamed from: getRange--jx7JFs, reason: not valid java name */
        long mo1185getRangejx7JFs(int r1);
    }

    static {
        $stable = 8;
    }

    public static /* synthetic */ void getChanges$annotations() {
    }

    public TextFieldBuffer(final TextFieldCharSequence initialValue, ChangeTracker initialChanges, TextFieldCharSequence originalValue, OffsetMappingCalculator offsetMappingCalculator) {
        this.originalValue = originalValue;
        this.offsetMappingCalculator = offsetMappingCalculator;
        this.buffer = new PartialGapBuffer(initialValue);
        MutableVector<AnnotatedString.Range<AnnotatedString.Annotation>> r0 = null;
        if (initialChanges == null) goto L5;
        ChangeTracker r3 = new ChangeTracker(initialChanges);
    L6:
        this.backingChangeTracker = r3;
        this.selectionInChars = initialValue.m1188getSelectiond9O1mEE();
        this.composition = initialValue.m1187getCompositionMzsxiRA();
        List<AnnotatedString.Range<AnnotatedString.Annotation>> r1 = initialValue.getComposingAnnotations();
        int r2 = 0;
        if (r1 != null) goto L9;
    L12:
        boolean r4 = true;
    L13:
        if (r4 == true) goto L19;
        int size$iv = initialValue.getComposingAnnotations().size();
        Function1<Integer, AnnotatedString.Range<AnnotatedString.Annotation>> r5 = new TextFieldBuffer$composingAnnotations$1(initialValue);
        Object[] arr$iv = new AnnotatedString.Range[size$iv];
    L15:
        if (r2 >= size$iv) goto L17;
        arr$iv[r2] = r5.invoke(Integer.valueOf(r2));
        r2 = r2 + 1;
        goto L15
    L17:
        r0 = new MutableVector(arr$iv, size$iv);
    L19:
        this.composingAnnotations = r0;
        return;
    L9:
        if (r1.isEmpty() == true) goto L12;
        r4 = false;
        goto L13
    L5:
        r3 = null;
        goto L6
    }

    public /* synthetic */ TextFieldBuffer(TextFieldCharSequence r2, ChangeTracker r3, TextFieldCharSequence r4, OffsetMappingCalculator r5, int r6, DefaultConstructorMarker r7) {
        if ((r6 & 2) == 0) goto L6;
        r3 = null;
    L6:
        if ((r6 & 4) == 0) goto L9;
        r4 = r2;
    L9:
        if ((r6 & 8) == 0) goto L11;
        r5 = null;
    L11:
        this(r2, r3, r4, r5);
    }

    public final TextFieldCharSequence getOriginalValue$foundation_release() {
        return this.originalValue;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final ChangeTracker getChangeTracker$foundation_release() {
        ChangeTracker r0 = this.backingChangeTracker;
        if (r0 != null) goto L6;
        ChangeTracker r2 = null;
        ChangeTracker r1 = new ChangeTracker(r2, 1, 0 == true ? 1 : 0);
        this.backingChangeTracker = r1;
        return r1;
    L6:
        return r0;
    }

    public final int getLength() {
        return this.buffer.length();
    }

    public final CharSequence getOriginalText() {
        return this.originalValue.getText();
    }

    /* JADX INFO: renamed from: getOriginalSelection-d9O1mEE, reason: not valid java name */
    public final long m1179getOriginalSelectiond9O1mEE() {
        return this.originalValue.m1188getSelectiond9O1mEE();
    }

    public final ChangeList getChanges() {
        return getChangeTracker$foundation_release();
    }

    public final boolean hasSelection() {
        return !TextRange.m6411getCollapsedimpl(m1180getSelectiond9O1mEE());
    }

    /* JADX INFO: renamed from: getSelection-d9O1mEE, reason: not valid java name */
    public final long m1180getSelectiond9O1mEE() {
        return this.selectionInChars;
    }

    /* JADX INFO: renamed from: setSelection-5zc-tL8, reason: not valid java name */
    public final void m1182setSelection5zctL8(long value) {
        m1175requireValidRange5zctL8(value);
        this.selectionInChars = value;
        this.highlight = null;
    }

    /* JADX INFO: renamed from: getComposition-MzsxiRA$foundation_release, reason: not valid java name */
    public final TextRange m1178getCompositionMzsxiRA$foundation_release() {
        return this.composition;
    }

    /* JADX INFO: renamed from: setComposition-OEnZFl4, reason: not valid java name */
    private final void m1176setCompositionOEnZFl4(TextRange value) {
        if (value != null) goto L4;
    L7:
        this.composition = null;
        MutableVector<AnnotatedString.Range<AnnotatedString.Annotation>> r0 = this.composingAnnotations;
        if (r0 == null) goto L12;
        r0.clear();
        return;
    L12:
        return;
    L4:
        if (TextRange.m6411getCollapsedimpl(value.m6421unboximpl()) == true) goto L7;
        this.composition = value;
    }

    public final MutableVector<AnnotatedString.Range<AnnotatedString.Annotation>> getComposingAnnotations$foundation_release() {
        return this.composingAnnotations;
    }

    public final boolean hasComposition$foundation_release() {
        if (this.composition == null) goto L5;
        return true;
    L5:
        return false;
    }

    public final void commitComposition$foundation_release() {
        m1176setCompositionOEnZFl4(null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void setComposition$foundation_release$default(TextFieldBuffer r0, int r1, int r2, List r3, int r4, Object r5) {
        if ((r4 & 4) == 0) goto L5;
        r3 = null;
    L5:
        r0.setComposition$foundation_release(r1, r2, r3);
    }

    public final void setComposition$foundation_release(int start, int end, List<AnnotatedString.Range<AnnotatedString.Annotation>> r21) {
        if (start < 0) goto L38;
        if (start > this.buffer.length()) goto L38;
        if (end < 0) goto L36;
        if (end > this.buffer.length()) goto L36;
        if (start >= end) goto L34;
        m1176setCompositionOEnZFl4(TextRange.m6405boximpl(TextRangeKt.TextRange(start, end)));
        MutableVector<AnnotatedString.Range<AnnotatedString.Annotation>> r3 = this.composingAnnotations;
        if (r3 == null) goto L13;
        r3.clear();
    L13:
        List<AnnotatedString.Range<AnnotatedString.Annotation>> r4 = r21;
        if (r4 != null) goto L16;
    L19:
        boolean r5 = true;
    L20:
        if (r5 == false) goto L22;
        return;
    L22:
        if (this.composingAnnotations != null) goto L24;
        this.composingAnnotations = new MutableVector(new AnnotatedString.Range[16], 0);
    L24:
        List<AnnotatedString.Range<AnnotatedString.Annotation>> r6 = r21;
        int index$iv = 0;
        int r7 = r6.size();
    L25:
        if (index$iv >= r7) goto L32;
        Object item$iv = r6.get(index$iv);
        AnnotatedString.Range<AnnotatedString.Annotation> r8 = (AnnotatedString.Range) item$iv;
        MutableVector<AnnotatedString.Range<AnnotatedString.Annotation>> r9 = this.composingAnnotations;
        if (r9 == null) goto L30;
        r9.add(AnnotatedString.Range.copy$default(r8, null, r8.getStart() + start, r8.getEnd() + start, null, 9, null));
    L30:
        index$iv = index$iv + 1;
        r6 = r6;
        goto L25
    L32:
        return;
    L16:
        if (r4.isEmpty() == true) goto L19;
        r5 = false;
        goto L20
    L34:
        throw new IllegalArgumentException("Do not set reversed or empty range: " + start + " > " + end);
    L36:
        throw new IndexOutOfBoundsException("end (" + end + ") offset is outside of text region " + this.buffer.length());
    L38:
        throw new IndexOutOfBoundsException("start (" + start + ") offset is outside of text region " + this.buffer.length());
    }

    public final Pair<TextHighlightType, TextRange> getHighlight$foundation_release() {
        return this.highlight;
    }

    /* JADX INFO: renamed from: setHighlight-K7f2yys$foundation_release, reason: not valid java name */
    public final void m1181setHighlightK7f2yys$foundation_release(int type, int start, int end) {
        if (start >= end) goto L6;
        int clampedStart = RangesKt.coerceIn(start, 0, getLength());
        int clampedEnd = RangesKt.coerceIn(end, 0, getLength());
        this.highlight = new Pair(TextHighlightType.m1194boximpl(type), TextRange.m6405boximpl(TextRangeKt.TextRange(clampedStart, clampedEnd)));
        return;
    L6:
        throw new IllegalArgumentException("Do not set reversed or empty range: " + start + " > " + end);
    }

    public final void clearHighlight$foundation_release() {
        this.highlight = null;
    }

    public final void replace(int start, int end, CharSequence text) {
        replace$foundation_release(start, end, text, 0, text.length());
    }

    public static /* synthetic */ void replace$foundation_release$default(TextFieldBuffer r6, int r7, int r8, CharSequence r9, int r10, int r11, int r12, Object r13) {
        if ((r12 & 8) == 0) goto L5;
        int r4 = 0;
    L7:
        if ((r12 & 16) == 0) goto L9;
        int r5 = r9.length();
    L10:
        r6.replace$foundation_release(r7, r8, r9, r4, r5);
        return;
    L9:
        r5 = r11;
        goto L10
    L5:
        r4 = r10;
        goto L7
    }

    public final void replace$foundation_release(int start, int end, CharSequence text, int textStart, int textEnd) {
        boolean value$iv = true;
        if (start > end) goto L5;
        boolean value$iv2 = true;
    L7:
        if (value$iv2 == true) goto L10;
        InlineClassHelperKt.throwIllegalArgumentException("Expected start=" + start + " <= end=" + end);
    L10:
        if (textStart <= textEnd) goto L14;
        value$iv = false;
    L14:
        if (value$iv == true) goto L16;
        InlineClassHelperKt.throwIllegalArgumentException("Expected textStart=" + textStart + " <= textEnd=" + textEnd);
    L16:
        onTextWillChange(start, end, textEnd - textStart);
        this.buffer.replace(start, end, text, textStart, textEnd);
        commitComposition$foundation_release();
        clearHighlight$foundation_release();
        return;
    L5:
        value$iv2 = false;
        goto L7
    }

    public final void setTextIfChanged$foundation_release(CharSequence newText) {
        CharSequence a$iv = this.buffer;
        int aStart$iv = 0;
        int aEnd$iv = a$iv.length();
        int bStart$iv = 0;
        int bEnd$iv = newText.length();
        boolean r7 = false;
        if (a$iv.length() <= 0) goto L5;
        boolean r6 = true;
    L6:
        if (r6 == true) goto L8;
    L26:
        if (aStart$iv < aEnd$iv) goto L29;
        if (bStart$iv < bEnd$iv) goto L29;
        return;
    L29:
        int thisStart = aStart$iv;
        int thisEnd = aEnd$iv;
        int newStart = bStart$iv;
        int newEnd = bEnd$iv;
        replace$foundation_release(thisStart, thisEnd, newText, newStart, newEnd);
        return;
    L8:
        if (newText.length() <= 0) goto L10;
        r7 = true;
    L10:
        if (r7 == false) goto L26;
        boolean prefixFound$iv = false;
        boolean suffixFound$iv = false;
    L12:
        if (prefixFound$iv == false) goto L14;
    L17:
        if (suffixFound$iv == false) goto L19;
    L22:
        if (aStart$iv >= aEnd$iv) goto L26;
        if (bStart$iv >= bEnd$iv) goto L26;
        if (prefixFound$iv == false) goto L12;
        if (suffixFound$iv == false) goto L12;
    L19:
        if (a$iv.charAt(aEnd$iv - 1) != newText.charAt(bEnd$iv - 1)) goto L21;
        aEnd$iv = aEnd$iv - 1;
        bEnd$iv = bEnd$iv - 1;
        goto L22
    L21:
        suffixFound$iv = true;
        goto L22
    L14:
        if (a$iv.charAt(aStart$iv) != newText.charAt(bStart$iv)) goto L16;
        aStart$iv = aStart$iv + 1;
        bStart$iv = bStart$iv + 1;
        goto L17
    L16:
        prefixFound$iv = true;
        goto L17
    L5:
        r6 = false;
        goto L6
    }

    @Override // java.lang.Appendable
    public Appendable append(CharSequence text) {
        TextFieldBuffer $this$append_u24lambda_u246 = this;
        if (text == null) goto L7;
        $this$append_u24lambda_u246.onTextWillChange($this$append_u24lambda_u246.getLength(), $this$append_u24lambda_u246.getLength(), text.length());
        PartialGapBuffer.replace$default($this$append_u24lambda_u246.buffer, $this$append_u24lambda_u246.buffer.length(), $this$append_u24lambda_u246.buffer.length(), text, 0, 0, 24, null);
    L7:
        return this;
    }

    @Override // java.lang.Appendable
    public Appendable append(CharSequence text, int start, int end) {
        TextFieldBuffer $this$append_u24lambda_u247 = this;
        if (text == null) goto L6;
        $this$append_u24lambda_u247.onTextWillChange($this$append_u24lambda_u247.getLength(), $this$append_u24lambda_u247.getLength(), end - start);
        PartialGapBuffer.replace$default($this$append_u24lambda_u247.buffer, $this$append_u24lambda_u247.buffer.length(), $this$append_u24lambda_u247.buffer.length(), text.subSequence(start, end), 0, 0, 24, null);
    L6:
        return this;
    }

    @Override // java.lang.Appendable
    public Appendable append(char r14) {
        TextFieldBuffer $this$append_u24lambda_u248 = this;
        $this$append_u24lambda_u248.onTextWillChange($this$append_u24lambda_u248.getLength(), $this$append_u24lambda_u248.getLength(), 1);
        PartialGapBuffer.replace$default($this$append_u24lambda_u248.buffer, $this$append_u24lambda_u248.buffer.length(), $this$append_u24lambda_u248.buffer.length(), String.valueOf(r14), 0, 0, 24, null);
        return this;
    }

    private final void onTextWillChange(int replaceStart, int replaceEnd, int newLength) {
        getChangeTracker$foundation_release().trackChange(replaceStart, replaceEnd, newLength);
        OffsetMappingCalculator r0 = this.offsetMappingCalculator;
        if (r0 == null) goto L5;
        r0.recordEditOperation(replaceStart, replaceEnd, newLength);
    L5:
        this.selectionInChars = TextFieldBufferKt.m1186adjustTextRangevJH6DeI(m1180getSelectiond9O1mEE(), replaceStart, replaceEnd, newLength);
    }

    public final char charAt(int index) {
        return this.buffer.charAt(index);
    }

    public String toString() {
        return this.buffer.toString();
    }

    public final CharSequence asCharSequence() {
        return this.buffer;
    }

    private final void clearChangeList() {
        getChangeTracker$foundation_release().clearChanges();
    }

    public final void revertAllChanges() {
        replace(0, getLength(), this.originalValue.toString());
        m1182setSelection5zctL8(this.originalValue.m1188getSelectiond9O1mEE());
        clearChangeList();
    }

    public final void placeCursorBeforeCharAt(int index) {
        requireValidIndex(index, true, false);
        this.selectionInChars = TextRangeKt.TextRange(index);
    }

    public final void placeCursorAfterCharAt(int index) {
        requireValidIndex(index, false, true);
        this.selectionInChars = TextRangeKt.TextRange(RangesKt.coerceAtMost(index + 1, getLength()));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: toTextFieldCharSequence-I88jaVs$foundation_release$default, reason: not valid java name */
    public static /* synthetic */ TextFieldCharSequence m1177toTextFieldCharSequenceI88jaVs$foundation_release$default(TextFieldBuffer r2, long r3, TextRange r5, List it, int r7, Object r8) {
        if ((r7 & 1) == 0) goto L6;
        r3 = r2.m1180getSelectiond9O1mEE();
    L6:
        if ((r7 & 2) == 0) goto L9;
        r5 = r2.composition;
    L9:
        if ((r7 & 4) == 0) goto L19;
        MutableVector<AnnotatedString.Range<AnnotatedString.Annotation>> r6 = r2.composingAnnotations;
        if (r6 == null) goto L17;
        it = r6.asMutableList();
        if (it == null) goto L17;
        if (it.isEmpty() == false) goto L19;
    L17:
        it = null;
    L19:
        return r2.m1183toTextFieldCharSequenceI88jaVs$foundation_release(r3, r5, it);
    }

    /* JADX INFO: renamed from: toTextFieldCharSequence-I88jaVs$foundation_release, reason: not valid java name */
    public final TextFieldCharSequence m1183toTextFieldCharSequenceI88jaVs$foundation_release(long selection, TextRange composition, List<AnnotatedString.Range<AnnotatedString.Annotation>> r13) {
        return new TextFieldCharSequence(this.buffer.toString(), selection, composition, null, r13, 8, null);
    }

    private final void requireValidIndex(int index, boolean startExclusive, boolean endExclusive) {
        boolean value$iv = false;
        if (startExclusive == false) goto L5;
        int start = 0;
    L6:
        int end = getLength();
        if (endExclusive == true) goto L10;
        end = end + 1;
    L10:
        if (start > index) goto L14;
        if (index >= end) goto L14;
        value$iv = true;
    L14:
        if (value$iv == true) goto L18;
        InlineClassHelperKt.throwIllegalArgumentException("Expected " + index + " to be in [" + start + ", " + end + ')');
        return;
    L18:
        return;
    L5:
        start = -1;
        goto L6
    }

    /* JADX INFO: renamed from: requireValidRange-5zc-tL8, reason: not valid java name */
    private final void m1175requireValidRange5zctL8(long range) {
        long validRange = TextRangeKt.TextRange(0, getLength());
        boolean value$iv = TextRange.m6407contains5zctL8(validRange, range);
        if (value$iv == true) goto L7;
        InlineClassHelperKt.throwIllegalArgumentException("Expected " + TextRange.m6420toStringimpl(range) + " to be in " + TextRange.m6420toStringimpl(validRange));
        return;
    }
}
