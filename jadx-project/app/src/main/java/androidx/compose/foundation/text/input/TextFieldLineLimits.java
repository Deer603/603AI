package androidx.compose.foundation.text.input;

import androidx.compose.foundation.internal.InlineClassHelperKt;
import androidx.webkit.Profile;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: TextFieldLineLimits.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u0000 \u00022\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0002\u0005\u0006ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0007À\u0006\u0001"}, d2 = {"Landroidx/compose/foundation/text/input/TextFieldLineLimits;", "", "Companion", "MultiLine", "SingleLine", "Landroidx/compose/foundation/text/input/TextFieldLineLimits$MultiLine;", "Landroidx/compose/foundation/text/input/TextFieldLineLimits$SingleLine;", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public interface TextFieldLineLimits {
    public static final Companion Companion = null;

    /* JADX INFO: compiled from: TextFieldLineLimits.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Landroidx/compose/foundation/text/input/TextFieldLineLimits$Companion;", "", "()V", Profile.DEFAULT_PROFILE_NAME, "Landroidx/compose/foundation/text/input/TextFieldLineLimits;", "getDefault", "()Landroidx/compose/foundation/text/input/TextFieldLineLimits;", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = null;
        private static final TextFieldLineLimits Default = null;

        private Companion() {
        }

        static {
            $$INSTANCE = new Companion();
            int r3 = 0;
            Default = new MultiLine(r3, r3, 3, null);
        }

        public final TextFieldLineLimits getDefault() {
            return Default;
        }
    }

    /* JADX INFO: compiled from: TextFieldLineLimits.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0096\u0002J\b\u0010\r\u001a\u00020\u0003H\u0016J\b\u0010\u000e\u001a\u00020\u000fH\u0016R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0010"}, d2 = {"Landroidx/compose/foundation/text/input/TextFieldLineLimits$MultiLine;", "Landroidx/compose/foundation/text/input/TextFieldLineLimits;", "minHeightInLines", "", "maxHeightInLines", "(II)V", "getMaxHeightInLines", "()I", "getMinHeightInLines", "equals", "", "other", "", "hashCode", "toString", "", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class MultiLine implements TextFieldLineLimits {
        public static final int $stable = 0;
        private final int maxHeightInLines;
        private final int minHeightInLines;

        static {
        }

        public MultiLine() {
            int r2 = 0;
            this(r2, r2, 3, null);
        }

        public MultiLine(int minHeightInLines, int maxHeightInLines) {
            this.minHeightInLines = minHeightInLines;
            this.maxHeightInLines = maxHeightInLines;
            int r0 = this.maxHeightInLines;
            int r1 = this.minHeightInLines;
            boolean value$iv = false;
            if (1 > r1) goto L7;
            if (r1 > r0) goto L7;
            value$iv = true;
        L7:
            if (value$iv == true) goto L11;
            InlineClassHelperKt.throwIllegalArgumentException("Expected 1 ≤ minHeightInLines ≤ maxHeightInLines, were " + this.minHeightInLines + ", " + this.maxHeightInLines);
            return;
        }

        public /* synthetic */ MultiLine(int r1, int r2, int r3, DefaultConstructorMarker r4) {
            if ((r3 & 1) == 0) goto L6;
            r1 = 1;
        L6:
            if ((r3 & 2) == 0) goto L8;
            r2 = Integer.MAX_VALUE;
        L8:
            this(r1, r2);
        }

        public final int getMaxHeightInLines() {
            return this.maxHeightInLines;
        }

        public final int getMinHeightInLines() {
            return this.minHeightInLines;
        }

        public String toString() {
            return "MultiLine(minHeightInLines=" + this.minHeightInLines + ", maxHeightInLines=" + this.maxHeightInLines + ')';
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
            MultiLine r2 = (MultiLine) other;
            if (this.minHeightInLines == ((MultiLine) other).minHeightInLines) goto L15;
            return false;
        L15:
            if (this.maxHeightInLines == ((MultiLine) other).maxHeightInLines) goto L17;
            return false;
        L17:
            return true;
        }

        public int hashCode() {
            int result = this.minHeightInLines;
            return (result * 31) + this.maxHeightInLines;
        }
    }

    /* JADX INFO: compiled from: TextFieldLineLimits.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016¨\u0006\u0005"}, d2 = {"Landroidx/compose/foundation/text/input/TextFieldLineLimits$SingleLine;", "Landroidx/compose/foundation/text/input/TextFieldLineLimits;", "()V", "toString", "", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class SingleLine implements TextFieldLineLimits {
        public static final int $stable = 0;
        public static final SingleLine INSTANCE = null;

        static {
            INSTANCE = new SingleLine();
        }

        private SingleLine() {
        }

        public String toString() {
            return "TextFieldLineLimits.SingleLine";
        }
    }

    static {
        Companion = Companion.$$INSTANCE;
    }
}
