package androidx.compose.ui.draganddrop;

import android.content.ClipDescription;
import android.view.DragEvent;
import androidx.compose.ui.geometry.Offset;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.SetsKt;

/* JADX INFO: compiled from: DragAndDrop.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0010\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006*\u00020\u0002\u001a\n\u0010\b\u001a\u00020\t*\u00020\u0002\"\u0018\u0010\u0000\u001a\u00020\u0001*\u00020\u00028@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004¨\u0006\n"}, d2 = {"positionInRoot", "Landroidx/compose/ui/geometry/Offset;", "Landroidx/compose/ui/draganddrop/DragAndDropEvent;", "getPositionInRoot", "(Landroidx/compose/ui/draganddrop/DragAndDropEvent;)J", "mimeTypes", "", "", "toAndroidDragEvent", "Landroid/view/DragEvent;", "ui_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class DragAndDrop_androidKt {
    public static final DragEvent toAndroidDragEvent(DragAndDropEvent $this$toAndroidDragEvent) {
        return $this$toAndroidDragEvent.getDragEvent$ui_release();
    }

    public static final Set<String> mimeTypes(DragAndDropEvent $this$mimeTypes) {
        ClipDescription clipDescription = $this$mimeTypes.getDragEvent$ui_release().getClipDescription();
        if (clipDescription == null) goto L5;
        Set $this$mimeTypes_u24lambda_u240 = SetsKt.createSetBuilder(clipDescription.getMimeTypeCount());
        int i = 0;
        int r5 = clipDescription.getMimeTypeCount();
    L7:
        if (i >= r5) goto L10;
        $this$mimeTypes_u24lambda_u240.add(clipDescription.getMimeType(i));
        i = i + 1;
        goto L7
    L10:
        return SetsKt.build($this$mimeTypes_u24lambda_u240);
    L5:
        return SetsKt.emptySet();
    }

    public static final long getPositionInRoot(DragAndDropEvent $this$positionInRoot) {
        float x$iv = $this$positionInRoot.getDragEvent$ui_release().getX();
        float y$iv = $this$positionInRoot.getDragEvent$ui_release().getY();
        long v1$iv$iv = Float.floatToRawIntBits(x$iv);
        long v2$iv$iv = Float.floatToRawIntBits(y$iv);
        return Offset.m4117constructorimpl((v1$iv$iv << 32) | (4294967295L & v2$iv$iv));
    }
}
