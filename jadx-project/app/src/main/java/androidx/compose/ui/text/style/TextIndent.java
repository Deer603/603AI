package androidx.compose.ui.text.style;

import androidx.compose.ui.unit.TextUnit;
import androidx.compose.ui.unit.TextUnitKt;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: TextIndent.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0007\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014B\u0019\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J$\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\fJ\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u0010\u001a\u00020\u0011H\u0016J\b\u0010\u0012\u001a\u00020\u0013H\u0016R\u0019\u0010\u0002\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\u0006\u0010\u0007R\u0019\u0010\u0004\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\t\u0010\u0007\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0015"}, d2 = {"Landroidx/compose/ui/text/style/TextIndent;", "", "firstLine", "Landroidx/compose/ui/unit/TextUnit;", "restLine", "(JJLkotlin/jvm/internal/DefaultConstructorMarker;)V", "getFirstLine-XSAIIZE", "()J", "J", "getRestLine-XSAIIZE", "copy", "copy-NB67dxo", "(JJ)Landroidx/compose/ui/text/style/TextIndent;", "equals", "", "other", "hashCode", "", "toString", "", "Companion", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class TextIndent {
    public static final int $stable = 0;
    public static final Companion Companion = null;
    private static final TextIndent None = null;
    private final long firstLine;
    private final long restLine;

    /* JADX INFO: compiled from: TextIndent.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0005\u0010\u0002\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Landroidx/compose/ui/text/style/TextIndent$Companion;", "", "()V", "None", "Landroidx/compose/ui/text/style/TextIndent;", "getNone$annotations", "getNone", "()Landroidx/compose/ui/text/style/TextIndent;", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker r1) {
            this();
        }

        public static /* synthetic */ void getNone$annotations() {
        }

        private Companion() {
        }

        public final TextIndent getNone() {
            return TextIndent.access$getNone$cp();
        }
    }

    public /* synthetic */ TextIndent(long r1, long r3, DefaultConstructorMarker r5) {
        this(r1, r3);
    }

    private TextIndent(long firstLine, long restLine) {
        this.firstLine = firstLine;
        this.restLine = restLine;
    }

    public static final /* synthetic */ TextIndent access$getNone$cp() {
        return None;
    }

    public /* synthetic */ TextIndent(long r8, long r10, int r12, DefaultConstructorMarker r13) {
        if ((r12 & 1) == 0) goto L5;
        r8 = TextUnitKt.getSp(0);
    L5:
        long r2 = r8;
        if ((r12 & 2) == 0) goto L8;
        r10 = TextUnitKt.getSp(0);
    L8:
        this(r2, r10, null);
    }

    /* JADX INFO: renamed from: getFirstLine-XSAIIZE, reason: not valid java name */
    public final long m6859getFirstLineXSAIIZE() {
        return this.firstLine;
    }

    /* JADX INFO: renamed from: getRestLine-XSAIIZE, reason: not valid java name */
    public final long m6860getRestLineXSAIIZE() {
        return this.restLine;
    }

    static {
        Companion = new Companion(null);
        long r3 = 0;
        long r5 = 0;
        None = new TextIndent(r3, r5, 3, null);
    }

    /* JADX INFO: renamed from: copy-NB67dxo$default, reason: not valid java name */
    public static /* synthetic */ TextIndent m6857copyNB67dxo$default(TextIndent r0, long r1, long r3, int r5, Object r6) {
        if ((r5 & 1) == 0) goto L6;
        r1 = r0.firstLine;
    L6:
        if ((r5 & 2) == 0) goto L9;
        r3 = r0.restLine;
    L9:
        return r0.m6858copyNB67dxo(r1, r3);
    }

    /* JADX INFO: renamed from: copy-NB67dxo, reason: not valid java name */
    public final TextIndent m6858copyNB67dxo(long firstLine, long restLine) {
        return new TextIndent(firstLine, restLine, null);
    }

    public boolean equals(Object other) {
        if (this != other) goto L6;
        return true;
    L6:
        if ((other instanceof TextIndent) == true) goto L9;
        return false;
    L9:
        if (TextUnit.m7164equalsimpl0(this.firstLine, ((TextIndent) other).firstLine) == true) goto L12;
        return false;
    L12:
        if (TextUnit.m7164equalsimpl0(this.restLine, ((TextIndent) other).restLine) == true) goto L14;
        return false;
    L14:
        return true;
    }

    public int hashCode() {
        int result = TextUnit.m7168hashCodeimpl(this.firstLine);
        return (result * 31) + TextUnit.m7168hashCodeimpl(this.restLine);
    }

    public String toString() {
        return "TextIndent(firstLine=" + TextUnit.m7174toStringimpl(this.firstLine) + ", restLine=" + TextUnit.m7174toStringimpl(this.restLine) + ')';
    }
}
