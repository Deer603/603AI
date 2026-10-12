package androidx.compose.foundation.layout;

import androidx.compose.foundation.layout.internal.InlineClassHelperKt;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: Padding.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\bg\u0018\u00002\u00020\u0001:\u0001\u000fJ\u0015\u0010\u0002\u001a\u00020\u0003H&ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH&ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\u000b\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH&ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\f\u0010\nJ\u0015\u0010\r\u001a\u00020\u0003H&ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000e\u0010\u0005ø\u0001\u0002\u0082\u0002\u0011\n\u0002\b!\n\u0005\b¡\u001e0\u0001\n\u0004\b!0\u0001¨\u0006\u0010À\u0006\u0001"}, d2 = {"Landroidx/compose/foundation/layout/PaddingValues;", "", "calculateBottomPadding", "Landroidx/compose/ui/unit/Dp;", "calculateBottomPadding-D9Ej5fM", "()F", "calculateLeftPadding", "layoutDirection", "Landroidx/compose/ui/unit/LayoutDirection;", "calculateLeftPadding-u2uoSUM", "(Landroidx/compose/ui/unit/LayoutDirection;)F", "calculateRightPadding", "calculateRightPadding-u2uoSUM", "calculateTopPadding", "calculateTopPadding-D9Ej5fM", "Absolute", "foundation-layout_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public interface PaddingValues {

    /* JADX INFO: compiled from: Padding.kt */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0007\u0018\u00002\u00020\u0001B-\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003¢\u0006\u0002\u0010\u0007J\u0015\u0010\u000e\u001a\u00020\u0003H\u0016ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010J\u001d\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u0013H\u0016ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0015J\u001d\u0010\u0016\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u0013H\u0016ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0015J\u0015\u0010\u0018\u001a\u00020\u0003H\u0016ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\u0010J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0096\u0002J\b\u0010\u001e\u001a\u00020\u001fH\u0016J\b\u0010 \u001a\u00020!H\u0016R\u001e\u0010\u0006\u001a\u00020\u00038\u0002X\u0083\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\n\u0012\u0004\b\b\u0010\tR\u001e\u0010\u0002\u001a\u00020\u00038\u0002X\u0083\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\n\u0012\u0004\b\u000b\u0010\tR\u001e\u0010\u0005\u001a\u00020\u00038\u0002X\u0083\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\n\u0012\u0004\b\f\u0010\tR\u001e\u0010\u0004\u001a\u00020\u00038\u0002X\u0083\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\n\u0012\u0004\b\r\u0010\t\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\""}, d2 = {"Landroidx/compose/foundation/layout/PaddingValues$Absolute;", "Landroidx/compose/foundation/layout/PaddingValues;", "left", "Landroidx/compose/ui/unit/Dp;", "top", "right", "bottom", "(FFFFLkotlin/jvm/internal/DefaultConstructorMarker;)V", "getBottom-D9Ej5fM$annotations", "()V", "F", "getLeft-D9Ej5fM$annotations", "getRight-D9Ej5fM$annotations", "getTop-D9Ej5fM$annotations", "calculateBottomPadding", "calculateBottomPadding-D9Ej5fM", "()F", "calculateLeftPadding", "layoutDirection", "Landroidx/compose/ui/unit/LayoutDirection;", "calculateLeftPadding-u2uoSUM", "(Landroidx/compose/ui/unit/LayoutDirection;)F", "calculateRightPadding", "calculateRightPadding-u2uoSUM", "calculateTopPadding", "calculateTopPadding-D9Ej5fM", "equals", "", "other", "", "hashCode", "", "toString", "", "foundation-layout_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Absolute implements PaddingValues {
        public static final int $stable = 0;
        private final float bottom;
        private final float left;
        private final float right;
        private final float top;

        static {
        }

        public /* synthetic */ Absolute(float r1, float r2, float r3, float r4, DefaultConstructorMarker r5) {
            this(r1, r2, r3, r4);
        }

        /* JADX INFO: renamed from: getBottom-D9Ej5fM$annotations, reason: not valid java name */
        private static /* synthetic */ void m738getBottomD9Ej5fM$annotations() {
        }

        /* JADX INFO: renamed from: getLeft-D9Ej5fM$annotations, reason: not valid java name */
        private static /* synthetic */ void m739getLeftD9Ej5fM$annotations() {
        }

        /* JADX INFO: renamed from: getRight-D9Ej5fM$annotations, reason: not valid java name */
        private static /* synthetic */ void m740getRightD9Ej5fM$annotations() {
        }

        /* JADX INFO: renamed from: getTop-D9Ej5fM$annotations, reason: not valid java name */
        private static /* synthetic */ void m741getTopD9Ej5fM$annotations() {
        }

        private Absolute(float left, float top, float right, float bottom) {
            this.left = left;
            this.top = top;
            this.right = right;
            this.bottom = bottom;
            boolean r2 = true;
            if (this.left < 0.0f) goto L5;
            boolean r0 = true;
        L7:
            if (this.top < 0.0f) goto L9;
            boolean r4 = true;
        L10:
            boolean r1 = r0 & r4;
            if (this.right < 0.0f) goto L13;
            boolean r5 = true;
        L14:
            boolean r3 = r1 & r5;
            if (this.bottom >= 0.0f) goto L18;
            r2 = false;
        L18:
            boolean value$iv = r3 & r2;
            if (value$iv == true) goto L23;
            InlineClassHelperKt.throwIllegalArgumentException("Padding must be non-negative");
            return;
        L23:
            return;
        L13:
            r5 = false;
            goto L14
        L9:
            r4 = false;
            goto L10
        L5:
            r0 = false;
            goto L7
        }

        public /* synthetic */ Absolute(float r7, float r8, float r9, float r10, int r11, DefaultConstructorMarker r12) {
            if ((r11 & 1) == 0) goto L5;
            float r1 = Dp.m6973constructorimpl(0);
        L7:
            if ((r11 & 2) == 0) goto L9;
            float r2 = Dp.m6973constructorimpl(0);
        L11:
            if ((r11 & 4) == 0) goto L13;
            float r3 = Dp.m6973constructorimpl(0);
        L15:
            if ((r11 & 8) == 0) goto L17;
            float r4 = Dp.m6973constructorimpl(0);
        L18:
            this(r1, r2, r3, r4, null);
            return;
        L17:
            r4 = r10;
            goto L18
        L13:
            r3 = r9;
            goto L15
        L9:
            r2 = r8;
            goto L11
        L5:
            r1 = r7;
            goto L7
        }

        @Override // androidx.compose.foundation.layout.PaddingValues
        /* JADX INFO: renamed from: calculateLeftPadding-u2uoSUM */
        public float mo675calculateLeftPaddingu2uoSUM(LayoutDirection layoutDirection) {
            return this.left;
        }

        @Override // androidx.compose.foundation.layout.PaddingValues
        /* JADX INFO: renamed from: calculateTopPadding-D9Ej5fM */
        public float mo677calculateTopPaddingD9Ej5fM() {
            return this.top;
        }

        @Override // androidx.compose.foundation.layout.PaddingValues
        /* JADX INFO: renamed from: calculateRightPadding-u2uoSUM */
        public float mo676calculateRightPaddingu2uoSUM(LayoutDirection layoutDirection) {
            return this.right;
        }

        @Override // androidx.compose.foundation.layout.PaddingValues
        /* JADX INFO: renamed from: calculateBottomPadding-D9Ej5fM */
        public float mo674calculateBottomPaddingD9Ej5fM() {
            return this.bottom;
        }

        public boolean equals(Object other) {
            if ((other instanceof Absolute) == true) goto L6;
            return false;
        L6:
            if (Dp.m6978equalsimpl0(this.left, ((Absolute) other).left) == true) goto L8;
            return false;
        L8:
            if (Dp.m6978equalsimpl0(this.top, ((Absolute) other).top) == true) goto L10;
            return false;
        L10:
            if (Dp.m6978equalsimpl0(this.right, ((Absolute) other).right) == true) goto L12;
            return false;
        L12:
            if (Dp.m6978equalsimpl0(this.bottom, ((Absolute) other).bottom) == false) goto L19;
            return true;
        L19:
            return false;
        }

        public int hashCode() {
            return (((((Dp.m6979hashCodeimpl(this.left) * 31) + Dp.m6979hashCodeimpl(this.top)) * 31) + Dp.m6979hashCodeimpl(this.right)) * 31) + Dp.m6979hashCodeimpl(this.bottom);
        }

        public String toString() {
            return "PaddingValues.Absolute(left=" + Dp.m6984toStringimpl(this.left) + ", top=" + Dp.m6984toStringimpl(this.top) + ", right=" + Dp.m6984toStringimpl(this.right) + ", bottom=" + Dp.m6984toStringimpl(this.bottom) + ')';
        }
    }

    /* JADX INFO: renamed from: calculateBottomPadding-D9Ej5fM */
    float mo674calculateBottomPaddingD9Ej5fM();

    /* JADX INFO: renamed from: calculateLeftPadding-u2uoSUM */
    float mo675calculateLeftPaddingu2uoSUM(LayoutDirection r1);

    /* JADX INFO: renamed from: calculateRightPadding-u2uoSUM */
    float mo676calculateRightPaddingu2uoSUM(LayoutDirection r1);

    /* JADX INFO: renamed from: calculateTopPadding-D9Ej5fM */
    float mo677calculateTopPaddingD9Ej5fM();
}
