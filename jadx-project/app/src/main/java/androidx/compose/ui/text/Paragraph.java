package androidx.compose.ui.text;

import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import androidx.compose.ui.text.style.ResolvedTextDirection;
import androidx.compose.ui.text.style.TextDecoration;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: compiled from: Paragraph.android.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u009e\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0014\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001J,\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"2\b\b\u0001\u0010#\u001a\u00020\u000fH&ø\u0001\u0000¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020\u000fH&J\u0010\u0010)\u001a\u00020\u00182\u0006\u0010(\u001a\u00020\u000fH&J\u0010\u0010*\u001a\u00020\u00182\u0006\u0010(\u001a\u00020\u000fH&J\u0018\u0010+\u001a\u00020\u00072\u0006\u0010(\u001a\u00020\u000f2\u0006\u0010,\u001a\u00020\u0003H&J\u0010\u0010-\u001a\u00020\u00072\u0006\u0010.\u001a\u00020\u000fH&J\u0010\u0010/\u001a\u00020\u00072\u0006\u0010.\u001a\u00020\u000fH&J\u001a\u00100\u001a\u00020\u000f2\u0006\u0010.\u001a\u00020\u000f2\b\b\u0002\u00101\u001a\u00020\u0003H&J\u0010\u00102\u001a\u00020\u000f2\u0006\u0010(\u001a\u00020\u000fH&J\u0010\u00103\u001a\u00020\u000f2\u0006\u00104\u001a\u00020\u0007H&J\u0010\u00105\u001a\u00020\u00072\u0006\u0010.\u001a\u00020\u000fH&J\u0010\u00106\u001a\u00020\u00072\u0006\u0010.\u001a\u00020\u000fH&J\u0010\u00107\u001a\u00020\u00072\u0006\u0010.\u001a\u00020\u000fH&J\u0010\u00108\u001a\u00020\u000f2\u0006\u0010.\u001a\u00020\u000fH&J\u0010\u00109\u001a\u00020\u00072\u0006\u0010.\u001a\u00020\u000fH&J\u0010\u0010:\u001a\u00020\u00072\u0006\u0010.\u001a\u00020\u000fH&J\u001a\u0010;\u001a\u00020\u000f2\u0006\u0010<\u001a\u00020=H&ø\u0001\u0000¢\u0006\u0004\b>\u0010?J\u0010\u0010@\u001a\u00020'2\u0006\u0010(\u001a\u00020\u000fH&J\u0018\u0010A\u001a\u00020B2\u0006\u0010C\u001a\u00020\u000f2\u0006\u0010D\u001a\u00020\u000fH&J*\u0010E\u001a\u00020 2\u0006\u0010F\u001a\u00020\u00182\u0006\u0010G\u001a\u00020H2\u0006\u0010I\u001a\u00020JH&ø\u0001\u0000¢\u0006\u0004\bK\u0010LJ\u001d\u0010M\u001a\u00020 2\u0006\u0010(\u001a\u00020\u000fH&ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\bN\u0010OJ\u0010\u0010P\u001a\u00020\u00032\u0006\u0010.\u001a\u00020\u000fH&JZ\u0010Q\u001a\u00020\u001e2\u0006\u0010R\u001a\u00020S2\u0006\u0010T\u001a\u00020U2\b\b\u0002\u0010V\u001a\u00020\u00072\n\b\u0002\u0010W\u001a\u0004\u0018\u00010X2\n\b\u0002\u0010Y\u001a\u0004\u0018\u00010Z2\n\b\u0002\u0010[\u001a\u0004\u0018\u00010\\2\b\b\u0002\u0010]\u001a\u00020^H&ø\u0001\u0000¢\u0006\u0004\b_\u0010`J<\u0010Q\u001a\u00020\u001e2\u0006\u0010R\u001a\u00020S2\b\b\u0002\u0010a\u001a\u00020b2\n\b\u0002\u0010W\u001a\u0004\u0018\u00010X2\n\b\u0002\u0010Y\u001a\u0004\u0018\u00010ZH&ø\u0001\u0000¢\u0006\u0004\bc\u0010dJR\u0010Q\u001a\u00020\u001e2\u0006\u0010R\u001a\u00020S2\b\b\u0002\u0010a\u001a\u00020b2\n\b\u0002\u0010W\u001a\u0004\u0018\u00010X2\n\b\u0002\u0010Y\u001a\u0004\u0018\u00010Z2\n\b\u0002\u0010[\u001a\u0004\u0018\u00010\\2\b\b\u0002\u0010]\u001a\u00020^H&ø\u0001\u0000¢\u0006\u0004\be\u0010fR\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0012\u0010\u0006\u001a\u00020\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0012\u0010\n\u001a\u00020\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\tR\u0012\u0010\f\u001a\u00020\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\tR\u0012\u0010\u000e\u001a\u00020\u000fX¦\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0012\u0010\u0012\u001a\u00020\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\tR\u0012\u0010\u0014\u001a\u00020\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\tR\u001a\u0010\u0016\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00180\u0017X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001aR\u0012\u0010\u001b\u001a\u00020\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\t\u0082\u0001\u0001gø\u0001\u0002\u0082\u0002\u0011\n\u0005\b¡\u001e0\u0001\n\u0002\b!\n\u0004\b!0\u0001¨\u0006hÀ\u0006\u0003"}, d2 = {"Landroidx/compose/ui/text/Paragraph;", "", "didExceedMaxLines", "", "getDidExceedMaxLines", "()Z", "firstBaseline", "", "getFirstBaseline", "()F", "height", "getHeight", "lastBaseline", "getLastBaseline", "lineCount", "", "getLineCount", "()I", "maxIntrinsicWidth", "getMaxIntrinsicWidth", "minIntrinsicWidth", "getMinIntrinsicWidth", "placeholderRects", "", "Landroidx/compose/ui/geometry/Rect;", "getPlaceholderRects", "()Ljava/util/List;", "width", "getWidth", "fillBoundingBoxes", "", "range", "Landroidx/compose/ui/text/TextRange;", "array", "", "arrayStart", "fillBoundingBoxes-8ffj60Q", "(J[FI)V", "getBidiRunDirection", "Landroidx/compose/ui/text/style/ResolvedTextDirection;", "offset", "getBoundingBox", "getCursorRect", "getHorizontalPosition", "usePrimaryDirection", "getLineBaseline", "lineIndex", "getLineBottom", "getLineEnd", "visibleEnd", "getLineForOffset", "getLineForVerticalPosition", "vertical", "getLineHeight", "getLineLeft", "getLineRight", "getLineStart", "getLineTop", "getLineWidth", "getOffsetForPosition", "position", "Landroidx/compose/ui/geometry/Offset;", "getOffsetForPosition-k-4lQ0M", "(J)I", "getParagraphDirection", "getPathForRange", "Landroidx/compose/ui/graphics/Path;", "start", "end", "getRangeForRect", "rect", "granularity", "Landroidx/compose/ui/text/TextGranularity;", "inclusionStrategy", "Landroidx/compose/ui/text/TextInclusionStrategy;", "getRangeForRect-8-6BmAI", "(Landroidx/compose/ui/geometry/Rect;ILandroidx/compose/ui/text/TextInclusionStrategy;)J", "getWordBoundary", "getWordBoundary--jx7JFs", "(I)J", "isLineEllipsized", "paint", "canvas", "Landroidx/compose/ui/graphics/Canvas;", "brush", "Landroidx/compose/ui/graphics/Brush;", "alpha", "shadow", "Landroidx/compose/ui/graphics/Shadow;", "textDecoration", "Landroidx/compose/ui/text/style/TextDecoration;", "drawStyle", "Landroidx/compose/ui/graphics/drawscope/DrawStyle;", "blendMode", "Landroidx/compose/ui/graphics/BlendMode;", "paint-hn5TExg", "(Landroidx/compose/ui/graphics/Canvas;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Shadow;Landroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/graphics/drawscope/DrawStyle;I)V", "color", "Landroidx/compose/ui/graphics/Color;", "paint-RPmYEkk", "(Landroidx/compose/ui/graphics/Canvas;JLandroidx/compose/ui/graphics/Shadow;Landroidx/compose/ui/text/style/TextDecoration;)V", "paint-LG529CI", "(Landroidx/compose/ui/graphics/Canvas;JLandroidx/compose/ui/graphics/Shadow;Landroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/graphics/drawscope/DrawStyle;I)V", "Landroidx/compose/ui/text/AndroidParagraph;", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public interface Paragraph {

    /* JADX INFO: compiled from: Paragraph.android.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class DefaultImpls {
        public static /* synthetic */ int getLineEnd$default(Paragraph r0, int r1, boolean r2, int r3, Object r4) {
            return Paragraph.getLineEnd$default(r0, r1, r2, r3, r4);
        }

        /* JADX INFO: renamed from: paint-RPmYEkk$default, reason: not valid java name */
        public static /* synthetic */ void m6279paintRPmYEkk$default(Paragraph r0, Canvas r1, long r2, Shadow r4, TextDecoration r5, int r6, Object r7) {
            Paragraph.m6276paintRPmYEkk$default(r0, r1, r2, r4, r5, r6, r7);
        }

        /* JADX INFO: renamed from: paint-LG529CI$default, reason: not valid java name */
        public static /* synthetic */ void m6278paintLG529CI$default(Paragraph r0, Canvas r1, long r2, Shadow r4, TextDecoration r5, DrawStyle r6, int r7, int r8, Object r9) {
            Paragraph.m6275paintLG529CI$default(r0, r1, r2, r4, r5, r6, r7, r8, r9);
        }

        /* JADX INFO: renamed from: paint-hn5TExg$default, reason: not valid java name */
        public static /* synthetic */ void m6280painthn5TExg$default(Paragraph r0, Canvas r1, Brush r2, float r3, Shadow r4, TextDecoration r5, DrawStyle r6, int r7, int r8, Object r9) {
            Paragraph.m6277painthn5TExg$default(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9);
        }
    }

    /* JADX INFO: renamed from: fillBoundingBoxes-8ffj60Q */
    void mo6225fillBoundingBoxes8ffj60Q(long r1, float[] r3, int r4);

    ResolvedTextDirection getBidiRunDirection(int r1);

    Rect getBoundingBox(int r1);

    Rect getCursorRect(int r1);

    boolean getDidExceedMaxLines();

    float getFirstBaseline();

    float getHeight();

    float getHorizontalPosition(int r1, boolean r2);

    float getLastBaseline();

    float getLineBaseline(int r1);

    float getLineBottom(int r1);

    int getLineCount();

    int getLineEnd(int r1, boolean r2);

    int getLineForOffset(int r1);

    int getLineForVerticalPosition(float r1);

    float getLineHeight(int r1);

    float getLineLeft(int r1);

    float getLineRight(int r1);

    int getLineStart(int r1);

    float getLineTop(int r1);

    float getLineWidth(int r1);

    float getMaxIntrinsicWidth();

    float getMinIntrinsicWidth();

    /* JADX INFO: renamed from: getOffsetForPosition-k-4lQ0M */
    int mo6227getOffsetForPositionk4lQ0M(long r1);

    ResolvedTextDirection getParagraphDirection(int r1);

    Path getPathForRange(int r1, int r2);

    List<Rect> getPlaceholderRects();

    /* JADX INFO: renamed from: getRangeForRect-8-6BmAI */
    long mo6229getRangeForRect86BmAI(Rect r1, int r2, TextInclusionStrategy r3);

    float getWidth();

    /* JADX INFO: renamed from: getWordBoundary--jx7JFs */
    long mo6230getWordBoundaryjx7JFs(int r1);

    boolean isLineEllipsized(int r1);

    /* JADX INFO: renamed from: paint-LG529CI */
    void mo6231paintLG529CI(Canvas r1, long r2, Shadow r4, TextDecoration r5, DrawStyle r6, int r7);

    /* JADX INFO: renamed from: paint-RPmYEkk */
    void mo6232paintRPmYEkk(Canvas r1, long r2, Shadow r4, TextDecoration r5);

    /* JADX INFO: renamed from: paint-hn5TExg */
    void mo6233painthn5TExg(Canvas r1, Brush r2, float r3, Shadow r4, TextDecoration r5, DrawStyle r6, int r7);

    static /* synthetic */ int getLineEnd$default(Paragraph r0, int r1, boolean r2, int r3, Object r4) {
        if (r4 != null) goto L9;
        if ((r3 & 2) == 0) goto L7;
        r2 = false;
    L7:
        return r0.getLineEnd(r1, r2);
    L9:
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getLineEnd");
    }

    /* JADX INFO: renamed from: paint-RPmYEkk$default, reason: not valid java name */
    static /* synthetic */ void m6276paintRPmYEkk$default(Paragraph r6, Canvas r7, long r8, Shadow r10, TextDecoration r11, int r12, Object r13) {
        if (r13 != null) goto L18;
        if ((r12 & 2) == 0) goto L6;
        long r2 = Color.Companion.m4402getUnspecified0d7_KjU();
    L8:
        if ((r12 & 4) == 0) goto L10;
        Shadow r4 = null;
    L12:
        if ((r12 & 8) == 0) goto L14;
        TextDecoration r5 = null;
    L15:
        r6.mo6232paintRPmYEkk(r7, r2, r4, r5);
        return;
    L14:
        r5 = r11;
        goto L15
    L10:
        r4 = r10;
        goto L12
    L6:
        r2 = r8;
        goto L8
    L18:
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: paint-RPmYEkk");
    }

    /* JADX INFO: renamed from: paint-LG529CI$default, reason: not valid java name */
    static /* synthetic */ void m6275paintLG529CI$default(Paragraph r6, Canvas r7, long r8, Shadow r10, TextDecoration r11, DrawStyle r12, int r13, int r14, Object r15) {
        if (r15 != null) goto L26;
        if ((r14 & 2) == 0) goto L6;
        long r0 = Color.Companion.m4402getUnspecified0d7_KjU();
    L7:
        DrawStyle r3 = null;
        if ((r14 & 4) == 0) goto L10;
        Shadow r2 = null;
    L12:
        if ((r14 & 8) == 0) goto L14;
        TextDecoration r4 = null;
    L16:
        if ((r14 & 16) != 0) goto L20;
        r3 = r12;
    L20:
        if ((r14 & 32) == 0) goto L22;
        int r5 = DrawScope.Companion.m4919getDefaultBlendMode0nO6VwU();
    L23:
        r6.mo6231paintLG529CI(r7, r0, r2, r4, r3, r5);
        return;
    L22:
        r5 = r13;
        goto L23
    L14:
        r4 = r11;
        goto L16
    L10:
        r2 = r10;
        goto L12
    L6:
        r0 = r8;
        goto L7
    L26:
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: paint-LG529CI");
    }

    /* JADX INFO: renamed from: paint-hn5TExg$default, reason: not valid java name */
    static /* synthetic */ void m6277painthn5TExg$default(Paragraph r8, Canvas r9, Brush r10, float r11, Shadow r12, TextDecoration r13, DrawStyle r14, int r15, int r16, Object r17) {
        if (r17 != null) goto L26;
        if ((r16 & 4) == 0) goto L6;
        float r3 = Float.NaN;
    L8:
        if ((r16 & 8) == 0) goto L10;
        Shadow r4 = null;
    L12:
        if ((r16 & 16) == 0) goto L14;
        TextDecoration r5 = null;
    L16:
        if ((r16 & 32) == 0) goto L18;
        DrawStyle r6 = null;
    L20:
        if ((r16 & 64) == 0) goto L22;
        int r7 = DrawScope.Companion.m4919getDefaultBlendMode0nO6VwU();
    L23:
        r8.mo6233painthn5TExg(r9, r10, r3, r4, r5, r6, r7);
        return;
    L22:
        r7 = r15;
        goto L23
    L18:
        r6 = r14;
        goto L20
    L14:
        r5 = r13;
        goto L16
    L10:
        r4 = r12;
        goto L12
    L6:
        r3 = r11;
        goto L8
    L26:
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: paint-hn5TExg");
    }
}
