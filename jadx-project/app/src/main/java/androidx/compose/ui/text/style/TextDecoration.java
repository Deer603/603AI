package androidx.compose.ui.text.style;

import androidx.compose.ui.util.ListUtilsKt;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: TextDecoration.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0007\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010B\u000f\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0011\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0000H\u0086\u0002J\u0013\u0010\n\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u000b\u001a\u00020\u0003H\u0016J\u0011\u0010\f\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\u0000H\u0086\u0002J\b\u0010\u000e\u001a\u00020\u000fH\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0011"}, d2 = {"Landroidx/compose/ui/text/style/TextDecoration;", "", "mask", "", "(I)V", "getMask", "()I", "contains", "", "other", "equals", "hashCode", "plus", "decoration", "toString", "", "Companion", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class TextDecoration {
    public static final int $stable = 0;
    public static final Companion Companion = null;
    private static final TextDecoration LineThrough = null;
    private static final TextDecoration None = null;
    private static final TextDecoration Underline = null;
    private final int mask;

    /* JADX INFO: compiled from: TextDecoration.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010 \n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0014\u0010\u000e\u001a\u00020\u00042\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00040\u0010R\u001c\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0005\u0010\u0002\u001a\u0004\b\u0006\u0010\u0007R\u001c\u0010\b\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\t\u0010\u0002\u001a\u0004\b\n\u0010\u0007R\u001c\u0010\u000b\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\f\u0010\u0002\u001a\u0004\b\r\u0010\u0007¨\u0006\u0011"}, d2 = {"Landroidx/compose/ui/text/style/TextDecoration$Companion;", "", "()V", "LineThrough", "Landroidx/compose/ui/text/style/TextDecoration;", "getLineThrough$annotations", "getLineThrough", "()Landroidx/compose/ui/text/style/TextDecoration;", "None", "getNone$annotations", "getNone", "Underline", "getUnderline$annotations", "getUnderline", "combine", "decorations", "", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker r1) {
            this();
        }

        public static /* synthetic */ void getLineThrough$annotations() {
        }

        public static /* synthetic */ void getNone$annotations() {
        }

        public static /* synthetic */ void getUnderline$annotations() {
        }

        private Companion() {
        }

        public final TextDecoration getNone() {
            return TextDecoration.access$getNone$cp();
        }

        public final TextDecoration getUnderline() {
            return TextDecoration.access$getUnderline$cp();
        }

        public final TextDecoration getLineThrough() {
            return TextDecoration.access$getLineThrough$cp();
        }

        public final TextDecoration combine(List<TextDecoration> r16) {
            Object accumulator$iv = 0;
            int index$iv$iv = 0;
            int r7 = r16.size();
        L3:
            if (index$iv$iv >= r7) goto L5;
            Object item$iv$iv = r16.get(index$iv$iv);
            TextDecoration decoration = (TextDecoration) item$iv$iv;
            int acc = ((Number) accumulator$iv).intValue();
            accumulator$iv = Integer.valueOf(acc | decoration.getMask());
            index$iv$iv = index$iv$iv + 1;
            goto L3
        L5:
            Object initial$iv = accumulator$iv;
            int mask = ((Number) initial$iv).intValue();
            return new TextDecoration(mask);
        }
    }

    public TextDecoration(int mask) {
        this.mask = mask;
    }

    public static final /* synthetic */ TextDecoration access$getLineThrough$cp() {
        return LineThrough;
    }

    public static final /* synthetic */ TextDecoration access$getNone$cp() {
        return None;
    }

    public static final /* synthetic */ TextDecoration access$getUnderline$cp() {
        return Underline;
    }

    public final int getMask() {
        return this.mask;
    }

    static {
        Companion = new Companion(null);
        None = new TextDecoration(0);
        Underline = new TextDecoration(1);
        LineThrough = new TextDecoration(2);
    }

    public final TextDecoration plus(TextDecoration decoration) {
        return new TextDecoration(this.mask | decoration.mask);
    }

    public final boolean contains(TextDecoration other) {
        if ((this.mask | other.mask) != this.mask) goto L5;
        return true;
    L5:
        return false;
    }

    public String toString() {
        if (this.mask != 0) goto L6;
        return "TextDecoration.None";
    L6:
        List values = new ArrayList();
        if ((this.mask & Underline.mask) == 0) goto L10;
        values.add("Underline");
    L10:
        if ((this.mask & LineThrough.mask) == 0) goto L13;
        values.add("LineThrough");
    L13:
        if (values.size() != 1) goto L17;
        return "TextDecoration." + ((String) values.get(0));
    L17:
        return "TextDecoration[" + ListUtilsKt.fastJoinToString$default(values, ", ", null, null, 0, null, null, 62, null) + ']';
    }

    public boolean equals(Object other) {
        if (this != other) goto L6;
        return true;
    L6:
        if ((other instanceof TextDecoration) == true) goto L9;
        return false;
    L9:
        if (this.mask == ((TextDecoration) other).mask) goto L11;
        return false;
    L11:
        return true;
    }

    public int hashCode() {
        return this.mask;
    }
}
