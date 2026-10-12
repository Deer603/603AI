package androidx.compose.ui.text.input;

import androidx.compose.runtime.saveable.Saver;
import androidx.compose.runtime.saveable.SaverKt;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.TextRangeKt;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: TextFieldValue.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0007\u0018\u0000 \u001e2\u00020\u0001:\u0001\u001eB'\b\u0016\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0007B#\u0012\u0006\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\nJ0\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005ø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0016J.\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005ø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0017J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u001b\u001a\u00020\u001cH\u0016J\b\u0010\u001d\u001a\u00020\u0003H\u0016R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u0005ø\u0001\u0000ø\u0001\u0001¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0019\u0010\u0004\u001a\u00020\u0005ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0011\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0002\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u001f"}, d2 = {"Landroidx/compose/ui/text/input/TextFieldValue;", "", "text", "", "selection", "Landroidx/compose/ui/text/TextRange;", "composition", "(Ljava/lang/String;JLandroidx/compose/ui/text/TextRange;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "annotatedString", "Landroidx/compose/ui/text/AnnotatedString;", "(Landroidx/compose/ui/text/AnnotatedString;JLandroidx/compose/ui/text/TextRange;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "getAnnotatedString", "()Landroidx/compose/ui/text/AnnotatedString;", "getComposition-MzsxiRA", "()Landroidx/compose/ui/text/TextRange;", "getSelection-d9O1mEE", "()J", "J", "getText", "()Ljava/lang/String;", "copy", "copy-3r_uNRQ", "(Landroidx/compose/ui/text/AnnotatedString;JLandroidx/compose/ui/text/TextRange;)Landroidx/compose/ui/text/input/TextFieldValue;", "(Ljava/lang/String;JLandroidx/compose/ui/text/TextRange;)Landroidx/compose/ui/text/input/TextFieldValue;", "equals", "", "other", "hashCode", "", "toString", "Companion", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class TextFieldValue {
    public static final int $stable = 0;
    public static final Companion Companion = null;
    private static final Saver<TextFieldValue, Object> Saver = null;
    private final AnnotatedString annotatedString;
    private final TextRange composition;
    private final long selection;

    /* JADX INFO: compiled from: TextFieldValue.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001d\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Landroidx/compose/ui/text/input/TextFieldValue$Companion;", "", "()V", "Saver", "Landroidx/compose/runtime/saveable/Saver;", "Landroidx/compose/ui/text/input/TextFieldValue;", "getSaver", "()Landroidx/compose/runtime/saveable/Saver;", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker r1) {
            this();
        }

        private Companion() {
        }

        public final Saver<TextFieldValue, Object> getSaver() {
            return TextFieldValue.access$getSaver$cp();
        }
    }

    public /* synthetic */ TextFieldValue(AnnotatedString r1, long r2, TextRange r4, DefaultConstructorMarker r5) {
        this(r1, r2, r4);
    }

    public /* synthetic */ TextFieldValue(String r1, long r2, TextRange r4, DefaultConstructorMarker r5) {
        this(r1, r2, r4);
    }

    private TextFieldValue(AnnotatedString annotatedString, long selection, TextRange composition) {
        this.annotatedString = annotatedString;
        this.selection = TextRangeKt.m6423coerceIn8ffj60Q(selection, 0, getText().length());
        if (composition == null) goto L5;
        TextRange r0 = TextRange.m6405boximpl(TextRangeKt.m6423coerceIn8ffj60Q(composition.m6421unboximpl(), 0, getText().length()));
    L6:
        this.composition = r0;
        return;
    L5:
        r0 = null;
        goto L6
    }

    public static final /* synthetic */ Saver access$getSaver$cp() {
        return Saver;
    }

    public /* synthetic */ TextFieldValue(AnnotatedString r7, long r8, TextRange r10, int r11, DefaultConstructorMarker r12) {
        if ((r11 & 2) == 0) goto L5;
        long r2 = TextRange.Companion.m6422getZerod9O1mEE();
    L7:
        if ((r11 & 4) == 0) goto L9;
        TextRange r4 = null;
    L10:
        this(r7, r2, r4, null);
        return;
    L9:
        r4 = r10;
        goto L10
    L5:
        r2 = r8;
        goto L7
    }

    public final AnnotatedString getAnnotatedString() {
        return this.annotatedString;
    }

    public /* synthetic */ TextFieldValue(String r7, long r8, TextRange r10, int r11, DefaultConstructorMarker r12) {
        if ((r11 & 1) == 0) goto L5;
        String r1 = "";
    L7:
        if ((r11 & 2) == 0) goto L9;
        long r2 = TextRange.Companion.m6422getZerod9O1mEE();
    L11:
        if ((r11 & 4) == 0) goto L13;
        TextRange r4 = null;
    L14:
        this(r1, r2, r4, null);
        return;
    L13:
        r4 = r10;
        goto L14
    L9:
        r2 = r8;
        goto L11
    L5:
        r1 = r7;
        goto L7
    }

    /* JADX WARN: Multi-variable type inference failed */
    private TextFieldValue(String r7, long r8, TextRange r10) {
        this(new AnnotatedString(r7, null, 2, 0 == true ? 1 : 0), r8, r10, null);
    }

    public final String getText() {
        return this.annotatedString.getText();
    }

    /* JADX INFO: renamed from: getSelection-d9O1mEE, reason: not valid java name */
    public final long m6665getSelectiond9O1mEE() {
        return this.selection;
    }

    /* JADX INFO: renamed from: getComposition-MzsxiRA, reason: not valid java name */
    public final TextRange m6664getCompositionMzsxiRA() {
        return this.composition;
    }

    /* JADX INFO: renamed from: copy-3r_uNRQ$default, reason: not valid java name */
    public static /* synthetic */ TextFieldValue m6660copy3r_uNRQ$default(TextFieldValue r0, AnnotatedString r1, long r2, TextRange r4, int r5, Object r6) {
        if ((r5 & 1) == 0) goto L6;
        r1 = r0.annotatedString;
    L6:
        if ((r5 & 2) == 0) goto L9;
        r2 = r0.selection;
    L9:
        if ((r5 & 4) == 0) goto L12;
        r4 = r0.composition;
    L12:
        return r0.m6662copy3r_uNRQ(r1, r2, r4);
    }

    /* JADX INFO: renamed from: copy-3r_uNRQ, reason: not valid java name */
    public final TextFieldValue m6662copy3r_uNRQ(AnnotatedString annotatedString, long selection, TextRange composition) {
        return new TextFieldValue(annotatedString, selection, composition, null);
    }

    /* JADX INFO: renamed from: copy-3r_uNRQ$default, reason: not valid java name */
    public static /* synthetic */ TextFieldValue m6661copy3r_uNRQ$default(TextFieldValue r0, String r1, long r2, TextRange r4, int r5, Object r6) {
        if ((r5 & 2) == 0) goto L6;
        r2 = r0.selection;
    L6:
        if ((r5 & 4) == 0) goto L9;
        r4 = r0.composition;
    L9:
        return r0.m6663copy3r_uNRQ(r1, r2, r4);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: copy-3r_uNRQ, reason: not valid java name */
    public final TextFieldValue m6663copy3r_uNRQ(String r7, long r8, TextRange r10) {
        return new TextFieldValue(new AnnotatedString(r7, null, 2, 0 == true ? 1 : 0), r8, r10, null);
    }

    public boolean equals(Object other) {
        if (this != other) goto L6;
        return true;
    L6:
        if ((other instanceof TextFieldValue) == true) goto L9;
        return false;
    L9:
        if (TextRange.m6410equalsimpl0(this.selection, ((TextFieldValue) other).selection) == false) goto L16;
        if (Intrinsics.areEqual(this.composition, ((TextFieldValue) other).composition) == false) goto L16;
        if (Intrinsics.areEqual(this.annotatedString, ((TextFieldValue) other).annotatedString) == false) goto L16;
        return true;
    L16:
        return false;
    }

    public int hashCode() {
        int result = this.annotatedString.hashCode();
        int result2 = (result * 31) + TextRange.m6418hashCodeimpl(this.selection);
        int result3 = result2 * 31;
        TextRange r2 = this.composition;
        if (r2 == null) goto L5;
        int r3 = TextRange.m6418hashCodeimpl(r2.m6421unboximpl());
    L7:
        return result3 + r3;
    L5:
        r3 = 0;
        goto L7
    }

    public String toString() {
        return "TextFieldValue(text='" + this.annotatedString + "', selection=" + TextRange.m6420toStringimpl(this.selection) + ", composition=" + this.composition + ')';
    }

    static {
        Companion = new Companion(null);
        Saver = SaverKt.Saver(TextFieldValue$Companion$Saver$1.INSTANCE, TextFieldValue$Companion$Saver$2.INSTANCE);
    }
}
