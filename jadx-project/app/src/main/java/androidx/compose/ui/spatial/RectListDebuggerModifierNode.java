package androidx.compose.ui.spatial;

import android.graphics.Canvas;
import android.graphics.Paint;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.AndroidCanvas_androidKt;
import androidx.compose.ui.graphics.AndroidPaint_androidKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.PaintingStyle;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.node.DrawModifierNode;
import kotlin.Metadata;

/* JADX INFO: compiled from: RectListDebugger.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u0005¢\u0006\u0002\u0010\u0003J\b\u0010\r\u001a\u00020\u000eH\u0016J\b\u0010\u000f\u001a\u00020\u000eH\u0016J\f\u0010\u0010\u001a\u00020\u000e*\u00020\u0011H\u0016R\u0012\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\f¨\u0006\u0012"}, d2 = {"Landroidx/compose/ui/spatial/RectListDebuggerModifierNode;", "Landroidx/compose/ui/node/DrawModifierNode;", "Landroidx/compose/ui/Modifier$Node;", "()V", "paint", "Landroid/graphics/Paint;", "Landroidx/compose/ui/graphics/NativePaint;", "token", "", "getToken", "()Ljava/lang/Object;", "setToken", "(Ljava/lang/Object;)V", "onAttach", "", "onDetach", "draw", "Landroidx/compose/ui/graphics/drawscope/ContentDrawScope;", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
final class RectListDebuggerModifierNode extends Modifier.Node implements DrawModifierNode {
    private Paint paint;
    private Object token;

    public RectListDebuggerModifierNode() {
        androidx.compose.ui.graphics.Paint it = AndroidPaint_androidKt.Paint();
        it.mo4245setColor8_81llA(Color.Companion.m4400getRed0d7_KjU());
        it.mo4249setStylek9PVt8s(PaintingStyle.Companion.m4634getStrokeTiuSbCo());
        this.paint = it.asFrameworkPaint();
    }

    public final Object getToken() {
        return this.token;
    }

    public final void setToken(Object r1) {
        this.token = r1;
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void onAttach() {
        this.token = DelegatableNodeKt.requireOwner(this).getRectManager().registerOnChangedCallback(new AnonymousClass1(this));
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void onDetach() {
        DelegatableNodeKt.requireOwner(this).getRectManager().unregisterOnChangedCallback(this.token);
    }

    @Override // androidx.compose.ui.node.DrawModifierNode
    public void draw(ContentDrawScope $this$draw) {
        RectList rectList = DelegatableNodeKt.requireOwner(this).getRectManager().getRects();
        Canvas canvas = AndroidCanvas_androidKt.getNativeCanvas($this$draw.getDrawContext().getCanvas());
        Paint paint = this.paint;
        long[] items$iv = rectList.items;
        int size$iv = rectList.itemsSize;
        int i$iv = 0;
    L4:
        if (i$iv >= (items$iv.length - 2)) goto L10;
        if (i$iv >= size$iv) goto L13;
        long topLeft$iv = items$iv[i$iv + 0];
        long bottomRight$iv = items$iv[i$iv + 1];
        long r15 = items$iv[i$iv + 2];
        int $i$f$unpackX = (int) (topLeft$iv >> 32);
        int $i$f$unpackY = (int) topLeft$iv;
        RectList rectList2 = rectList;
        int r = (int) (bottomRight$iv >> 32);
        int $i$f$unpackY2 = (int) bottomRight$iv;
        paint = paint;
        canvas.drawRect($i$f$unpackX, $i$f$unpackY, r, $i$f$unpackY2, paint);
        i$iv = i$iv + 3;
        rectList = rectList2;
        goto L4
    L13:
        return;
    }
}
