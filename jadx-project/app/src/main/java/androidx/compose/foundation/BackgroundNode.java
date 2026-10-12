package androidx.compose.foundation;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Outline;
import androidx.compose.ui.graphics.OutlineKt;
import androidx.compose.ui.graphics.RectangleShapeKt;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.node.DrawModifierNode;
import androidx.compose.ui.node.DrawModifierNodeKt;
import androidx.compose.ui.node.ObserverModifierNode;
import androidx.compose.ui.node.ObserverModifierNodeKt;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Background.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B'\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0002\u0010\fJ\b\u0010&\u001a\u00020'H\u0016J\f\u0010(\u001a\u00020'*\u00020)H\u0016J\f\u0010*\u001a\u00020'*\u00020)H\u0002J\f\u0010+\u001a\u00020'*\u00020)H\u0002J\f\u0010,\u001a\u00020\u001d*\u00020)H\u0002R\u001a\u0010\b\u001a\u00020\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\"\u0010\u0004\u001a\u00020\u0005X\u0086\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0010\n\u0002\u0010\u0019\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u0010\u0010\u001a\u001a\u0004\u0018\u00010\u001bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001c\u001a\u0004\u0018\u00010\u001dX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001e\u001a\u0004\u0018\u00010\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u001f\u001a\u00020 X\u0082\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\n\u0002\u0010\u0019R\u001a\u0010\n\u001a\u00020\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\u0010\u0010%\u001a\u0004\u0018\u00010\u001dX\u0082\u000e¢\u0006\u0002\n\u0000\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006-"}, d2 = {"Landroidx/compose/foundation/BackgroundNode;", "Landroidx/compose/ui/node/DrawModifierNode;", "Landroidx/compose/ui/Modifier$Node;", "Landroidx/compose/ui/node/ObserverModifierNode;", "color", "Landroidx/compose/ui/graphics/Color;", "brush", "Landroidx/compose/ui/graphics/Brush;", "alpha", "", "shape", "Landroidx/compose/ui/graphics/Shape;", "(JLandroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Shape;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "getAlpha", "()F", "setAlpha", "(F)V", "getBrush", "()Landroidx/compose/ui/graphics/Brush;", "setBrush", "(Landroidx/compose/ui/graphics/Brush;)V", "getColor-0d7_KjU", "()J", "setColor-8_81llA", "(J)V", "J", "lastLayoutDirection", "Landroidx/compose/ui/unit/LayoutDirection;", "lastOutline", "Landroidx/compose/ui/graphics/Outline;", "lastShape", "lastSize", "Landroidx/compose/ui/geometry/Size;", "getShape", "()Landroidx/compose/ui/graphics/Shape;", "setShape", "(Landroidx/compose/ui/graphics/Shape;)V", "tmpOutline", "onObservedReadsChanged", "", "draw", "Landroidx/compose/ui/graphics/drawscope/ContentDrawScope;", "drawOutline", "drawRect", "getOutline", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
final class BackgroundNode extends Modifier.Node implements DrawModifierNode, ObserverModifierNode {
    private float alpha;
    private Brush brush;
    private long color;
    private LayoutDirection lastLayoutDirection;
    private Outline lastOutline;
    private Shape lastShape;
    private long lastSize;
    private Shape shape;
    private Outline tmpOutline;

    public /* synthetic */ BackgroundNode(long r1, Brush r3, float r4, Shape r5, DefaultConstructorMarker r6) {
        this(r1, r3, r4, r5);
    }

    public static final /* synthetic */ void access$setTmpOutline$p(BackgroundNode $this, Outline r1) {
        $this.tmpOutline = r1;
    }

    /* JADX INFO: renamed from: getColor-0d7_KjU, reason: not valid java name */
    public final long m235getColor0d7_KjU() {
        return this.color;
    }

    /* JADX INFO: renamed from: setColor-8_81llA, reason: not valid java name */
    public final void m236setColor8_81llA(long r1) {
        this.color = r1;
    }

    public final Brush getBrush() {
        return this.brush;
    }

    public final void setBrush(Brush r1) {
        this.brush = r1;
    }

    public final float getAlpha() {
        return this.alpha;
    }

    public final void setAlpha(float r1) {
        this.alpha = r1;
    }

    public final Shape getShape() {
        return this.shape;
    }

    public final void setShape(Shape r1) {
        this.shape = r1;
    }

    private BackgroundNode(long color, Brush brush, float alpha, Shape shape) {
        this.color = color;
        this.brush = brush;
        this.alpha = alpha;
        this.shape = shape;
        this.lastSize = Size.Companion.m4202getUnspecifiedNHjbRc();
    }

    @Override // androidx.compose.ui.node.DrawModifierNode
    public void draw(ContentDrawScope $this$draw) {
        if (this.shape != RectangleShapeKt.getRectangleShape()) goto L5;
        drawRect($this$draw);
    L6:
        $this$draw.drawContent();
        return;
    L5:
        drawOutline($this$draw);
        goto L6
    }

    @Override // androidx.compose.ui.node.ObserverModifierNode
    public void onObservedReadsChanged() {
        this.lastSize = Size.Companion.m4202getUnspecifiedNHjbRc();
        this.lastLayoutDirection = null;
        this.lastOutline = null;
        this.lastShape = null;
        DrawModifierNodeKt.invalidateDraw(this);
    }

    private final void drawRect(ContentDrawScope $this$drawRect) {
        if (Color.m4367equalsimpl0(this.color, Color.Companion.m4402getUnspecified0d7_KjU()) == true) goto L5;
        DrawScope.m4911drawRectnJ9OG0$default($this$drawRect, this.color, 0, 0, 0.0f, null, null, 0, 126, null);
    L5:
        Brush it = this.brush;
        if (it == null) goto L9;
        DrawScope.m4910drawRectAsUm42w$default($this$drawRect, it, 0, 0, this.alpha, null, null, 0, 118, null);
        return;
    }

    private final void drawOutline(ContentDrawScope $this$drawOutline) {
        Outline outline = getOutline($this$drawOutline);
        if (Color.m4367equalsimpl0(this.color, Color.Companion.m4402getUnspecified0d7_KjU()) == true) goto L5;
        OutlineKt.m4625drawOutlinewDX37Ww$default($this$drawOutline, outline, this.color, 0.0f, null, null, 0, 60, null);
    L5:
        Brush it = this.brush;
        if (it == null) goto L9;
        OutlineKt.m4623drawOutlinehn5TExg$default($this$drawOutline, outline, it, this.alpha, null, null, 0, 56, null);
        return;
    }

    private final Outline getOutline(final ContentDrawScope $this$getOutline) {
        if (Size.m4190equalsimpl0($this$getOutline.mo4917getSizeNHjbRc(), this.lastSize) == true) goto L5;
    L9:
        ObserverModifierNodeKt.observeReads(this, new AnonymousClass1(this, $this$getOutline));
        Outline outline = this.tmpOutline;
        this.tmpOutline = null;
    L10:
        this.lastOutline = outline;
        this.lastSize = $this$getOutline.mo4917getSizeNHjbRc();
        this.lastLayoutDirection = $this$getOutline.getLayoutDirection();
        this.lastShape = this.shape;
        Intrinsics.checkNotNull(outline);
        return outline;
    L5:
        if ($this$getOutline.getLayoutDirection() != this.lastLayoutDirection) goto L9;
        if (Intrinsics.areEqual(this.lastShape, this.shape) == false) goto L9;
        outline = this.lastOutline;
        Intrinsics.checkNotNull(outline);
        goto L10
    }
}
