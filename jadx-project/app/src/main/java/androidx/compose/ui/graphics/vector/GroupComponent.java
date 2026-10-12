package androidx.compose.ui.graphics.vector;

import androidx.autofill.HintConstants;
import androidx.compose.ui.graphics.AndroidPath_androidKt;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Matrix;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.drawscope.DrawContext;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.drawscope.DrawTransform;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: Vector.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0016\u0010I\u001a\u00020\u00142\u0006\u0010J\u001a\u00020&2\u0006\u0010K\u001a\u00020\u0001J\b\u0010L\u001a\u00020\u0014H\u0002J\u0012\u0010M\u001a\u00020\u00142\b\u0010N\u001a\u0004\u0018\u00010OH\u0002J\u001a\u0010P\u001a\u00020\u00142\u0006\u0010Q\u001a\u00020;H\u0002ø\u0001\u0000¢\u0006\u0004\bR\u0010SJ\u0010\u0010T\u001a\u00020\u00142\u0006\u0010U\u001a\u00020\u0001H\u0002J\u001e\u0010V\u001a\u00020\u00142\u0006\u0010W\u001a\u00020&2\u0006\u0010X\u001a\u00020&2\u0006\u0010Y\u001a\u00020&J\u0016\u0010Z\u001a\u00020\u00142\u0006\u0010J\u001a\u00020&2\u0006\u0010Y\u001a\u00020&J\b\u0010[\u001a\u00020\u001fH\u0016J\b\u0010\\\u001a\u00020\u0014H\u0002J\b\u0010]\u001a\u00020\u0014H\u0002J\f\u0010^\u001a\u00020\u0014*\u00020_H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00010\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R0\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u0018\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0082\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\n\u0002\u0010\u0011R(\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0013X\u0090\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u000e\u0010\u0019\u001a\u00020\u001aX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u001aX\u0082\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\u001d\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u001a@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR$\u0010 \u001a\u00020\u001f2\u0006\u0010\u0007\u001a\u00020\u001f@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\u0011\u0010%\u001a\u00020&8F¢\u0006\u0006\u001a\u0004\b'\u0010(R$\u0010*\u001a\u00020)2\u0006\u0010\u0007\u001a\u00020)@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R$\u0010/\u001a\u00020)2\u0006\u0010\u0007\u001a\u00020)@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b0\u0010,\"\u0004\b1\u0010.R$\u00102\u001a\u00020)2\u0006\u0010\u0007\u001a\u00020)@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b3\u0010,\"\u0004\b4\u0010.R$\u00105\u001a\u00020)2\u0006\u0010\u0007\u001a\u00020)@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b6\u0010,\"\u0004\b7\u0010.R$\u00108\u001a\u00020)2\u0006\u0010\u0007\u001a\u00020)@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b9\u0010,\"\u0004\b:\u0010.R&\u0010<\u001a\u00020;2\u0006\u0010\u001c\u001a\u00020;@BX\u0086\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010?\u001a\u0004\b=\u0010>R$\u0010@\u001a\u00020)2\u0006\u0010\u0007\u001a\u00020)@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bA\u0010,\"\u0004\bB\u0010.R$\u0010C\u001a\u00020)2\u0006\u0010\u0007\u001a\u00020)@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bD\u0010,\"\u0004\bE\u0010.R\u0014\u0010F\u001a\u00020\u001a8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bG\u0010\u001eR\u001a\u0010H\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00140\u0013X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006`"}, d2 = {"Landroidx/compose/ui/graphics/vector/GroupComponent;", "Landroidx/compose/ui/graphics/vector/VNode;", "()V", "children", "", "clipPath", "Landroidx/compose/ui/graphics/Path;", "value", "", "Landroidx/compose/ui/graphics/vector/PathNode;", "clipPathData", "getClipPathData", "()Ljava/util/List;", "setClipPathData", "(Ljava/util/List;)V", "groupMatrix", "Landroidx/compose/ui/graphics/Matrix;", "[F", "invalidateListener", "Lkotlin/Function1;", "", "getInvalidateListener$ui_release", "()Lkotlin/jvm/functions/Function1;", "setInvalidateListener$ui_release", "(Lkotlin/jvm/functions/Function1;)V", "isClipPathDirty", "", "isMatrixDirty", "<set-?>", "isTintable", "()Z", "", HintConstants.AUTOFILL_HINT_NAME, "getName", "()Ljava/lang/String;", "setName", "(Ljava/lang/String;)V", "numChildren", "", "getNumChildren", "()I", "", "pivotX", "getPivotX", "()F", "setPivotX", "(F)V", "pivotY", "getPivotY", "setPivotY", "rotation", "getRotation", "setRotation", "scaleX", "getScaleX", "setScaleX", "scaleY", "getScaleY", "setScaleY", "Landroidx/compose/ui/graphics/Color;", "tintColor", "getTintColor-0d7_KjU", "()J", "J", "translationX", "getTranslationX", "setTranslationX", "translationY", "getTranslationY", "setTranslationY", "willClipPath", "getWillClipPath", "wrappedListener", "insertAt", "index", "instance", "markNotTintable", "markTintForBrush", "brush", "Landroidx/compose/ui/graphics/Brush;", "markTintForColor", "color", "markTintForColor-8_81llA", "(J)V", "markTintForVNode", "node", "move", "from", "to", "count", "remove", "toString", "updateClipPath", "updateMatrix", "draw", "Landroidx/compose/ui/graphics/drawscope/DrawScope;", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class GroupComponent extends VNode {
    public static final int $stable = 0;
    private final List<VNode> children;
    private Path clipPath;
    private List<? extends PathNode> clipPathData;
    private float[] groupMatrix;
    private Function1<? super VNode, Unit> invalidateListener;
    private boolean isClipPathDirty;
    private boolean isMatrixDirty;
    private boolean isTintable;
    private String name;
    private float pivotX;
    private float pivotY;
    private float rotation;
    private float scaleX;
    private float scaleY;
    private long tintColor;
    private float translationX;
    private float translationY;
    private final Function1<VNode, Unit> wrappedListener;

    static {
        $stable = 8;
    }

    public GroupComponent() {
        super(null);
        this.children = new ArrayList();
        this.isTintable = true;
        this.tintColor = Color.Companion.m4402getUnspecified0d7_KjU();
        this.clipPathData = VectorKt.getEmptyPath();
        this.isClipPathDirty = true;
        this.wrappedListener = new GroupComponent$wrappedListener$1(this);
        this.name = "";
        this.scaleX = 1.0f;
        this.scaleY = 1.0f;
        this.isMatrixDirty = true;
    }

    public static final /* synthetic */ void access$markTintForVNode(GroupComponent $this, VNode node) {
        $this.markTintForVNode(node);
    }

    public final boolean isTintable() {
        return this.isTintable;
    }

    /* JADX INFO: renamed from: getTintColor-0d7_KjU, reason: not valid java name */
    public final long m5046getTintColor0d7_KjU() {
        return this.tintColor;
    }

    private final void markTintForBrush(Brush brush) {
        if (this.isTintable == true) goto L5;
        return;
    L5:
        if (brush != null) goto L7;
        return;
    L7:
        if ((brush instanceof SolidColor) == false) goto L9;
        m5045markTintForColor8_81llA(((SolidColor) brush).m4701getValue0d7_KjU());
        return;
    L9:
        markNotTintable();
    }

    /* JADX INFO: renamed from: markTintForColor-8_81llA, reason: not valid java name */
    private final void m5045markTintForColor8_81llA(long color) {
        if (this.isTintable == true) goto L5;
        return;
    L5:
        boolean r6 = true;
        if (color == 16) goto L8;
        boolean r0 = true;
    L9:
        if (r0 == false) goto L20;
        long $this$isUnspecified$iv = this.tintColor;
        if ($this$isUnspecified$iv == 16) goto L14;
        r6 = false;
    L14:
        if (r6 == false) goto L17;
        this.tintColor = color;
        return;
    L17:
        if (VectorKt.m5068rgbEqualOWjLjI(this.tintColor, color) == true) goto L22;
        markNotTintable();
        return;
    L22:
        return;
    L20:
        return;
    L8:
        r0 = false;
        goto L9
    }

    private final void markTintForVNode(VNode node) {
        if ((node instanceof PathComponent) == false) goto L6;
        markTintForBrush(((PathComponent) node).getFill());
        markTintForBrush(((PathComponent) node).getStroke());
        return;
    L6:
        if ((node instanceof GroupComponent) == true) goto L8;
        return;
    L8:
        if (((GroupComponent) node).isTintable == true) goto L10;
    L12:
        markNotTintable();
        return;
    L10:
        if (this.isTintable == false) goto L12;
        m5045markTintForColor8_81llA(((GroupComponent) node).tintColor);
    }

    private final void markNotTintable() {
        this.isTintable = false;
        this.tintColor = Color.Companion.m4402getUnspecified0d7_KjU();
    }

    public final List<PathNode> getClipPathData() {
        return this.clipPathData;
    }

    public final void setClipPathData(List<? extends PathNode> r2) {
        this.clipPathData = r2;
        this.isClipPathDirty = true;
        invalidate();
    }

    private final boolean getWillClipPath() {
        return !this.clipPathData.isEmpty();
    }

    @Override // androidx.compose.ui.graphics.vector.VNode
    public Function1<VNode, Unit> getInvalidateListener$ui_release() {
        return this.invalidateListener;
    }

    @Override // androidx.compose.ui.graphics.vector.VNode
    public void setInvalidateListener$ui_release(Function1<? super VNode, Unit> r1) {
        this.invalidateListener = r1;
    }

    private final void updateClipPath() {
        if (getWillClipPath() == false) goto L9;
        Path targetClip = this.clipPath;
        if (targetClip != null) goto L7;
        targetClip = AndroidPath_androidKt.Path();
        this.clipPath = targetClip;
    L7:
        PathParserKt.toPath(this.clipPathData, targetClip);
        return;
    }

    public final String getName() {
        return this.name;
    }

    public final void setName(String value) {
        this.name = value;
        invalidate();
    }

    public final float getRotation() {
        return this.rotation;
    }

    public final void setRotation(float value) {
        this.rotation = value;
        this.isMatrixDirty = true;
        invalidate();
    }

    public final float getPivotX() {
        return this.pivotX;
    }

    public final void setPivotX(float value) {
        this.pivotX = value;
        this.isMatrixDirty = true;
        invalidate();
    }

    public final float getPivotY() {
        return this.pivotY;
    }

    public final void setPivotY(float value) {
        this.pivotY = value;
        this.isMatrixDirty = true;
        invalidate();
    }

    public final float getScaleX() {
        return this.scaleX;
    }

    public final void setScaleX(float value) {
        this.scaleX = value;
        this.isMatrixDirty = true;
        invalidate();
    }

    public final float getScaleY() {
        return this.scaleY;
    }

    public final void setScaleY(float value) {
        this.scaleY = value;
        this.isMatrixDirty = true;
        invalidate();
    }

    public final float getTranslationX() {
        return this.translationX;
    }

    public final void setTranslationX(float value) {
        this.translationX = value;
        this.isMatrixDirty = true;
        invalidate();
    }

    public final float getTranslationY() {
        return this.translationY;
    }

    public final void setTranslationY(float value) {
        this.translationY = value;
        this.isMatrixDirty = true;
        invalidate();
    }

    public final int getNumChildren() {
        return this.children.size();
    }

    private final void updateMatrix() {
        float[] target = this.groupMatrix;
        if (target != null) goto L5;
        float[] matrix = Matrix.m4596constructorimpl$default(null, 1, null);
        this.groupMatrix = matrix;
        float[] matrix2 = matrix;
    L6:
        float r0 = this.translationX;
        float r3 = this.pivotX + r0;
        float r1 = this.translationY;
        Matrix.m4618translateimpl$default(matrix2, r3, this.pivotY + r1, 0.0f, 4, null);
        Matrix.m4610rotateZimpl(matrix2, this.rotation);
        Matrix.m4611scaleimpl(matrix2, this.scaleX, this.scaleY, 1.0f);
        Matrix.m4618translateimpl$default(matrix2, -this.pivotX, -this.pivotY, 0.0f, 4, null);
        return;
    L5:
        Matrix.m4605resetimpl(target);
        matrix2 = target;
        goto L6
    }

    public final void insertAt(int index, VNode instance) {
        int r0 = getNumChildren();
        List<VNode> r1 = this.children;
        if (index >= r0) goto L5;
        r1.set(index, instance);
    L6:
        markTintForVNode(instance);
        instance.setInvalidateListener$ui_release(this.wrappedListener);
        invalidate();
        return;
    L5:
        r1.add(instance);
        goto L6
    }

    public final void move(int from, int to, int count) {
        int r0 = 0;
        if (from <= to) goto L8;
        int current = to;
    L5:
        if (r0 >= count) goto L10;
        VNode node = this.children.get(from);
        this.children.remove(from);
        this.children.add(current, node);
        current = current + 1;
        r0 = r0 + 1;
    L10:
        invalidate();
        return;
    L8:
        if (r0 >= count) goto L10;
        VNode node2 = this.children.get(from);
        this.children.remove(from);
        this.children.add(to - 1, node2);
        r0 = r0 + 1;
        goto L8
    }

    public final void remove(int index, int count) {
        int r0 = 0;
    L3:
        if (r0 >= count) goto L8;
        if (index >= this.children.size()) goto L7;
        this.children.get(index).setInvalidateListener$ui_release(null);
        this.children.remove(index);
    L7:
        r0 = r0 + 1;
        goto L3
    L8:
        invalidate();
    }

    @Override // androidx.compose.ui.graphics.vector.VNode
    public void draw(DrawScope $this$draw) {
        if (this.isMatrixDirty == false) goto L6;
        updateMatrix();
        this.isMatrixDirty = false;
    L6:
        if (this.isClipPathDirty == false) goto L8;
        updateClipPath();
        this.isClipPathDirty = false;
    L8:
        DrawContext $this$withTransform_u24lambda_u246$iv = $this$draw.getDrawContext();
        long previousSize$iv = $this$withTransform_u24lambda_u246$iv.mo4838getSizeNHjbRc();
        $this$withTransform_u24lambda_u246$iv.getCanvas().save();
        DrawTransform $this$draw_u24lambda_u244 = $this$withTransform_u24lambda_u246$iv.getTransform();     // Catch: Throwable -> L29
        float[] r10 = this.groupMatrix;     // Catch: Throwable -> L29
        if (r10 == null) goto L15;
        if (r10 == null) goto L13;
        Matrix r11 = Matrix.m4594boximpl(r10);     // Catch: Throwable -> L29
    L14:
        float[] it = r11.m4619unboximpl();     // Catch: Throwable -> L29
        $this$draw_u24lambda_u244.mo4846transform58bKbWc(it);     // Catch: Throwable -> L29
        goto L15
    L13:
        r11 = null;
    L15:
        Path targetClip = this.clipPath;     // Catch: Throwable -> L29
        if (getWillClipPath() == false) goto L19;
        if (targetClip == null) goto L19;
        DrawTransform.m4973clipPathmtrdDE$default($this$draw_u24lambda_u244, targetClip, 0, 2, null);     // Catch: Throwable -> L29
    L19:
        DrawScope $this$draw_u24lambda_u247 = $this$draw;
        List<VNode> r9 = this.children;     // Catch: Throwable -> L29
        int index$iv = 0;
        int r12 = r9.size();     // Catch: Throwable -> L29
    L20:
        if (index$iv >= r12) goto L27;
        Object item$iv = r9.get(index$iv);     // Catch: Throwable -> L29
        VNode node = (VNode) item$iv;     // Catch: Throwable -> L29
        DrawScope $this$draw_u24lambda_u248 = $this$draw_u24lambda_u247;
        node.draw($this$draw);     // Catch: Throwable -> L25
        index$iv = index$iv + 1;
        $this$draw_u24lambda_u247 = $this$draw_u24lambda_u248;
    L25:
        th = th;
    L31:
        $this$withTransform_u24lambda_u246$iv.getCanvas().restore();
        $this$withTransform_u24lambda_u246$iv.mo4839setSizeuvyYCjk(previousSize$iv);
        throw th;
    L27:
        $this$withTransform_u24lambda_u246$iv.getCanvas().restore();
        $this$withTransform_u24lambda_u246$iv.mo4839setSizeuvyYCjk(previousSize$iv);
        return;
    L29:
        th = th;
        goto L31
    }

    public String toString() {
        StringBuilder sb = new StringBuilder().append("VGroup: ").append(this.name);
        List<VNode> r1 = this.children;
        int index$iv = 0;
        int r4 = r1.size();
    L3:
        if (index$iv >= r4) goto L6;
        Object item$iv = r1.get(index$iv);
        VNode node = (VNode) item$iv;
        sb.append("\t").append(node.toString()).append("\n");
        index$iv = index$iv + 1;
        goto L3
    L6:
        return sb.toString();
    }
}
