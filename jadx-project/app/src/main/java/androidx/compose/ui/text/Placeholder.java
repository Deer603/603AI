package androidx.compose.ui.text;

import androidx.compose.ui.text.internal.InlineClassHelperKt;
import androidx.compose.ui.unit.TextUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: Placeholder.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J.\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u0015\u001a\u00020\u0016H\u0016J\b\u0010\u0017\u001a\u00020\u0018H\u0016R\u0019\u0010\u0004\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\n\u001a\u0004\b\b\u0010\tR\u0019\u0010\u0005\u001a\u00020\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u000b\u0010\fR\u0019\u0010\u0002\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\n\u001a\u0004\b\u000e\u0010\t\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0019"}, d2 = {"Landroidx/compose/ui/text/Placeholder;", "", "width", "Landroidx/compose/ui/unit/TextUnit;", "height", "placeholderVerticalAlign", "Landroidx/compose/ui/text/PlaceholderVerticalAlign;", "(JJILkotlin/jvm/internal/DefaultConstructorMarker;)V", "getHeight-XSAIIZE", "()J", "J", "getPlaceholderVerticalAlign-J6kI3mc", "()I", "I", "getWidth-XSAIIZE", "copy", "copy-K8Q-__8", "(JJI)Landroidx/compose/ui/text/Placeholder;", "equals", "", "other", "hashCode", "", "toString", "", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class Placeholder {
    public static final int $stable = 0;
    private final long height;
    private final int placeholderVerticalAlign;
    private final long width;

    static {
    }

    public /* synthetic */ Placeholder(long r1, long r3, int r5, DefaultConstructorMarker r6) {
        this(r1, r3, r5);
    }

    private Placeholder(long width, long height, int placeholderVerticalAlign) {
        this.width = width;
        this.height = height;
        this.placeholderVerticalAlign = placeholderVerticalAlign;
        long $this$isUnspecified$iv = this.width;
        boolean r4 = false;
        if (TextUnit.m7165getRawTypeimpl($this$isUnspecified$iv) != 0) goto L5;
        boolean r0 = true;
    L6:
        boolean value$iv = !r0;
        if (value$iv == true) goto L9;
        InlineClassHelperKt.throwIllegalArgumentException("width cannot be TextUnit.Unspecified");
    L9:
        long $this$isUnspecified$iv2 = this.height;
        if (TextUnit.m7165getRawTypeimpl($this$isUnspecified$iv2) != 0) goto L12;
        r4 = true;
    L12:
        boolean value$iv2 = !r4;
        if (value$iv2 == true) goto L17;
        InlineClassHelperKt.throwIllegalArgumentException("height cannot be TextUnit.Unspecified");
        return;
    L17:
        return;
    L5:
        r0 = false;
        goto L6
    }

    /* JADX INFO: renamed from: getWidth-XSAIIZE, reason: not valid java name */
    public final long m6320getWidthXSAIIZE() {
        return this.width;
    }

    /* JADX INFO: renamed from: getHeight-XSAIIZE, reason: not valid java name */
    public final long m6318getHeightXSAIIZE() {
        return this.height;
    }

    /* JADX INFO: renamed from: getPlaceholderVerticalAlign-J6kI3mc, reason: not valid java name */
    public final int m6319getPlaceholderVerticalAlignJ6kI3mc() {
        return this.placeholderVerticalAlign;
    }

    /* JADX INFO: renamed from: copy-K8Q-__8$default, reason: not valid java name */
    public static /* synthetic */ Placeholder m6316copyK8Q__8$default(Placeholder r6, long r7, long r9, int r11, int r12, Object r13) {
        if ((r12 & 1) == 0) goto L5;
        long r1 = r6.width;
    L7:
        if ((r12 & 2) == 0) goto L9;
        long r3 = r6.height;
    L11:
        if ((r12 & 4) == 0) goto L13;
        int r5 = r6.placeholderVerticalAlign;
    L15:
        return r6.m6317copyK8Q__8(r1, r3, r5);
    L13:
        r5 = r11;
        goto L15
    L9:
        r3 = r9;
        goto L11
    L5:
        r1 = r7;
        goto L7
    }

    /* JADX INFO: renamed from: copy-K8Q-__8, reason: not valid java name */
    public final Placeholder m6317copyK8Q__8(long width, long height, int placeholderVerticalAlign) {
        return new Placeholder(width, height, placeholderVerticalAlign, null);
    }

    public boolean equals(Object other) {
        if (this != other) goto L6;
        return true;
    L6:
        if ((other instanceof Placeholder) == true) goto L9;
        return false;
    L9:
        if (TextUnit.m7164equalsimpl0(this.width, ((Placeholder) other).width) == true) goto L12;
        return false;
    L12:
        if (TextUnit.m7164equalsimpl0(this.height, ((Placeholder) other).height) == true) goto L15;
        return false;
    L15:
        if (PlaceholderVerticalAlign.m6324equalsimpl0(this.placeholderVerticalAlign, ((Placeholder) other).placeholderVerticalAlign) == true) goto L17;
        return false;
    L17:
        return true;
    }

    public int hashCode() {
        int result = TextUnit.m7168hashCodeimpl(this.width);
        int result2 = (result * 31) + TextUnit.m7168hashCodeimpl(this.height);
        return (result2 * 31) + PlaceholderVerticalAlign.m6325hashCodeimpl(this.placeholderVerticalAlign);
    }

    public String toString() {
        return "Placeholder(width=" + TextUnit.m7174toStringimpl(this.width) + ", height=" + TextUnit.m7174toStringimpl(this.height) + ", placeholderVerticalAlign=" + PlaceholderVerticalAlign.m6326toStringimpl(this.placeholderVerticalAlign) + ')';
    }
}
