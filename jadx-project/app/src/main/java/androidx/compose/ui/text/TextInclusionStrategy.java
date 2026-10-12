package androidx.compose.ui.text;

import androidx.compose.ui.geometry.Rect;
import kotlin.Metadata;

/* JADX INFO: compiled from: TextInclusionStrategy.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bæ\u0080\u0001\u0018\u0000 \u00072\u00020\u0001:\u0001\u0007J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\bÀ\u0006\u0001"}, d2 = {"Landroidx/compose/ui/text/TextInclusionStrategy;", "", "isIncluded", "", "textBounds", "Landroidx/compose/ui/geometry/Rect;", "rect", "Companion", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public interface TextInclusionStrategy {
    public static final Companion Companion = null;

    /* JADX INFO: compiled from: TextInclusionStrategy.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0011\u0010\u0007\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0006R\u0011\u0010\t\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u0006¨\u0006\u000b"}, d2 = {"Landroidx/compose/ui/text/TextInclusionStrategy$Companion;", "", "()V", "AnyOverlap", "Landroidx/compose/ui/text/TextInclusionStrategy;", "getAnyOverlap", "()Landroidx/compose/ui/text/TextInclusionStrategy;", "ContainsAll", "getContainsAll", "ContainsCenter", "getContainsCenter", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = null;
        private static final TextInclusionStrategy AnyOverlap = null;
        private static final TextInclusionStrategy ContainsAll = null;
        private static final TextInclusionStrategy ContainsCenter = null;

        private Companion() {
        }

        static {
            $$INSTANCE = new Companion();
            AnyOverlap = new TextInclusionStrategy$Companion$$ExternalSyntheticLambda0();
            ContainsAll = new TextInclusionStrategy$Companion$$ExternalSyntheticLambda1();
            ContainsCenter = new TextInclusionStrategy$Companion$$ExternalSyntheticLambda2();
        }

        static final boolean AnyOverlap$lambda$0(Rect textBounds, Rect rect) {
            return textBounds.overlaps(rect);
        }

        public final TextInclusionStrategy getAnyOverlap() {
            return AnyOverlap;
        }

        public final TextInclusionStrategy getContainsAll() {
            return ContainsAll;
        }

        static final boolean ContainsAll$lambda$1(Rect textBounds, Rect rect) {
            if (rect.isEmpty() == false) goto L5;
        L13:
            return false;
        L5:
            if (textBounds.getLeft() < rect.getLeft()) goto L13;
            if (textBounds.getRight() > rect.getRight()) goto L13;
            if (textBounds.getTop() < rect.getTop()) goto L13;
            if (textBounds.getBottom() > rect.getBottom()) goto L13;
            return true;
        }

        public final TextInclusionStrategy getContainsCenter() {
            return ContainsCenter;
        }

        static final boolean ContainsCenter$lambda$2(Rect textBounds, Rect rect) {
            return rect.m4151containsk4lQ0M(textBounds.m4155getCenterF1C5BW0());
        }
    }

    static {
        Companion = Companion.$$INSTANCE;
    }

    boolean isIncluded(Rect r1, Rect r2);
}
