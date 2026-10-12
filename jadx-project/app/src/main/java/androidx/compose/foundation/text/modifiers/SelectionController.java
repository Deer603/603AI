package androidx.compose.foundation.text.modifiers;

import androidx.compose.foundation.text.TextPointerIcon_androidKt;
import androidx.compose.foundation.text.selection.MultiWidgetSelectionDelegate;
import androidx.compose.foundation.text.selection.Selectable;
import androidx.compose.foundation.text.selection.Selection;
import androidx.compose.foundation.text.selection.SelectionRegistrar;
import androidx.compose.runtime.RememberObserver;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.ClipOp;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.drawscope.DrawContext;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.drawscope.DrawTransform;
import androidx.compose.ui.input.pointer.PointerIconKt;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.text.TextLayoutResult;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;

/* JADX INFO: compiled from: SelectionController.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u000e\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015J\b\u0010\u0016\u001a\u00020\u0013H\u0016J\b\u0010\u0017\u001a\u00020\u0013H\u0016J\b\u0010\u0018\u001a\u00020\u0013H\u0016J\u000e\u0010\u0019\u001a\u00020\u00132\u0006\u0010\u001a\u001a\u00020\u001bJ\u000e\u0010\u001c\u001a\u00020\u00132\u0006\u0010\u001d\u001a\u00020\u001eR\u0016\u0010\u0006\u001a\u00020\u0007X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\n\u0002\u0010\u000bR\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u000e\u0010\b\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u001f"}, d2 = {"Landroidx/compose/foundation/text/modifiers/SelectionController;", "Landroidx/compose/runtime/RememberObserver;", "selectableId", "", "selectionRegistrar", "Landroidx/compose/foundation/text/selection/SelectionRegistrar;", "backgroundSelectionColor", "Landroidx/compose/ui/graphics/Color;", "params", "Landroidx/compose/foundation/text/modifiers/StaticTextSelectionParams;", "(JLandroidx/compose/foundation/text/selection/SelectionRegistrar;JLandroidx/compose/foundation/text/modifiers/StaticTextSelectionParams;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "J", "modifier", "Landroidx/compose/ui/Modifier;", "getModifier", "()Landroidx/compose/ui/Modifier;", "selectable", "Landroidx/compose/foundation/text/selection/Selectable;", "draw", "", "drawScope", "Landroidx/compose/ui/graphics/drawscope/DrawScope;", "onAbandoned", "onForgotten", "onRemembered", "updateGlobalPosition", "coordinates", "Landroidx/compose/ui/layout/LayoutCoordinates;", "updateTextLayout", "textLayoutResult", "Landroidx/compose/ui/text/TextLayoutResult;", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class SelectionController implements RememberObserver {
    public static final int $stable = 0;
    private final long backgroundSelectionColor;
    private final Modifier modifier;
    private StaticTextSelectionParams params;
    private Selectable selectable;
    private final long selectableId;
    private final SelectionRegistrar selectionRegistrar;

    static {
        $stable = 8;
    }

    public /* synthetic */ SelectionController(long r1, SelectionRegistrar r3, long r4, StaticTextSelectionParams r6, DefaultConstructorMarker r7) {
        this(r1, r3, r4, r6);
    }

    private SelectionController(long selectableId, SelectionRegistrar selectionRegistrar, long backgroundSelectionColor, StaticTextSelectionParams params) {
        this.selectableId = selectableId;
        this.selectionRegistrar = selectionRegistrar;
        this.backgroundSelectionColor = backgroundSelectionColor;
        this.params = params;
        this.modifier = PointerIconKt.pointerHoverIcon$default(SelectionControllerKt.access$makeSelectionModifier(this.selectionRegistrar, this.selectableId, new SelectionController$modifier$1(this)), TextPointerIcon_androidKt.getTextPointerIcon(), false, 2, null);
    }

    public /* synthetic */ SelectionController(long r9, SelectionRegistrar r11, long r12, StaticTextSelectionParams r14, int r15, DefaultConstructorMarker r16) {
        if ((r15 & 8) == 0) goto L5;
        StaticTextSelectionParams r6 = StaticTextSelectionParams.Companion.getEmpty();
    L6:
        this(r9, r11, r12, r6, null);
        return;
    L5:
        r6 = r14;
        goto L6
    }

    public static final /* synthetic */ StaticTextSelectionParams access$getParams$p(SelectionController $this) {
        return $this.params;
    }

    public final Modifier getModifier() {
        return this.modifier;
    }

    @Override // androidx.compose.runtime.RememberObserver
    public void onRemembered() {
        this.selectable = this.selectionRegistrar.subscribe(new MultiWidgetSelectionDelegate(this.selectableId, new AnonymousClass1(this), new AnonymousClass2(this)));
    }

    @Override // androidx.compose.runtime.RememberObserver
    public void onForgotten() {
        Selectable localSelectable = this.selectable;
        if (localSelectable == null) goto L6;
        this.selectionRegistrar.unsubscribe(localSelectable);
        this.selectable = null;
        return;
    }

    @Override // androidx.compose.runtime.RememberObserver
    public void onAbandoned() {
        Selectable localSelectable = this.selectable;
        if (localSelectable == null) goto L6;
        this.selectionRegistrar.unsubscribe(localSelectable);
        this.selectable = null;
        return;
    }

    public final void updateTextLayout(TextLayoutResult textLayoutResult) {
        TextLayoutResult prevTextLayoutResult = this.params.getTextLayoutResult();
        if (prevTextLayoutResult != null) goto L5;
    L7:
        this.params = StaticTextSelectionParams.copy$default(this.params, null, textLayoutResult, 1, null);
        return;
    L5:
        if (Intrinsics.areEqual(prevTextLayoutResult.getLayoutInput().getText(), textLayoutResult.getLayoutInput().getText()) == true) goto L7;
        this.selectionRegistrar.notifySelectableChange(this.selectableId);
        goto L7
    }

    public final void updateGlobalPosition(LayoutCoordinates coordinates) {
        this.params = StaticTextSelectionParams.copy$default(this.params, coordinates, null, 2, null);
        this.selectionRegistrar.notifyPositionChange(this.selectableId);
    }

    public final void draw(DrawScope drawScope) {
        Selection selection = this.selectionRegistrar.getSubselections().get(this.selectableId);
        if (selection != null) goto L6;
        return;
    L6:
        if (selection.getHandlesCrossed() == true) goto L8;
        int r0 = selection.getStart().getOffset();
    L9:
        int start = r0;
        if (selection.getHandlesCrossed() == true) goto L12;
        int r1 = selection.getEnd().getOffset();
    L13:
        int end = r1;
        if (start != end) goto L16;
        return;
    L16:
        Selectable r2 = this.selectable;
        if (r2 == null) goto L19;
        int r3 = r2.getLastVisibleOffset();
    L20:
        int lastOffset = r3;
        int clippedStart = RangesKt.coerceAtMost(start, lastOffset);
        int clippedEnd = RangesKt.coerceAtMost(end, lastOffset);
        Path selectionPath = this.params.getPathForRange(clippedStart, clippedEnd);
        if (selectionPath != null) goto L24;
        return;
    L24:
        if (this.params.getShouldClip() == false) goto L40;
        long arg0$iv$iv = drawScope.mo4917getSizeNHjbRc();
        int bits$iv$iv$iv$iv = (int) (arg0$iv$iv >> 32);
        float right$iv = Float.intBitsToFloat(bits$iv$iv$iv$iv);
        long arg0$iv$iv2 = drawScope.mo4917getSizeNHjbRc();
        int bits$iv$iv$iv$iv2 = (int) (arg0$iv$iv2 & 4294967295L);
        float bottom$iv = Float.intBitsToFloat(bits$iv$iv$iv$iv2);
        int clipOp$iv = ClipOp.Companion.m4355getIntersectrtfAjoo();
        DrawContext $this$withTransform_u24lambda_u246$iv$iv = drawScope.getDrawContext();
        long previousSize$iv$iv = $this$withTransform_u24lambda_u246$iv$iv.mo4838getSizeNHjbRc();
        $this$withTransform_u24lambda_u246$iv$iv.getCanvas().save();
        DrawTransform $this$clipRect_rOu3jXo_u24lambda_u244$iv = $this$withTransform_u24lambda_u246$iv$iv.getTransform();     // Catch: Throwable -> L36
        $this$clipRect_rOu3jXo_u24lambda_u244$iv.mo4841clipRectN_I0leg(0.0f, 0.0f, right$iv, bottom$iv, clipOp$iv);     // Catch: Throwable -> L36
        DrawScope.m4907drawPathLG529CI$default(drawScope, selectionPath, this.backgroundSelectionColor, 0.0f, null, null, 0, 60, null);     // Catch: Throwable -> L32
        $this$withTransform_u24lambda_u246$iv$iv.getCanvas().restore();
        $this$withTransform_u24lambda_u246$iv$iv.mo4839setSizeuvyYCjk(previousSize$iv$iv);
        return;
    L32:
        th = th;
        DrawContext $this$withTransform_u24lambda_u246$iv$iv2 = $this$withTransform_u24lambda_u246$iv$iv;
    L38:
        $this$withTransform_u24lambda_u246$iv$iv2.getCanvas().restore();
        $this$withTransform_u24lambda_u246$iv$iv2.mo4839setSizeuvyYCjk(previousSize$iv$iv);
        throw th;
    L34:
        th = th;
        $this$withTransform_u24lambda_u246$iv$iv2 = $this$withTransform_u24lambda_u246$iv$iv;
    L36:
        th = th;
        $this$withTransform_u24lambda_u246$iv$iv2 = $this$withTransform_u24lambda_u246$iv$iv;
        goto L38
    L40:
        DrawScope.m4907drawPathLG529CI$default(drawScope, selectionPath, this.backgroundSelectionColor, 0.0f, null, null, 0, 60, null);
        return;
    L19:
        r3 = 0;
        goto L20
    L12:
        r1 = selection.getStart().getOffset();
        goto L13
    L8:
        r0 = selection.getEnd().getOffset();
        goto L9
    }
}
