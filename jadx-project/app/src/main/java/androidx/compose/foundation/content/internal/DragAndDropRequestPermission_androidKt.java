package androidx.compose.foundation.content.internal;

import android.app.Activity;
import android.content.ClipData;
import android.content.Context;
import android.content.ContextWrapper;
import android.net.Uri;
import android.view.View;
import androidx.compose.ui.draganddrop.DragAndDropEvent;
import androidx.compose.ui.draganddrop.DragAndDrop_androidKt;
import androidx.compose.ui.node.DelegatableNode;
import androidx.compose.ui.node.DelegatableNode_androidKt;
import androidx.core.app.NotificationCompat;
import androidx.core.view.DragAndDropPermissionsCompat;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: DragAndDropRequestPermission.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000(\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0012\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0002\u001a\f\u0010\u0004\u001a\u00020\u0005*\u00020\u0006H\u0002\u001a\u0014\u0010\u0007\u001a\u00020\b*\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0000¨\u0006\f"}, d2 = {"tryGetActivity", "Landroid/app/Activity;", "view", "Landroid/view/View;", "containsContentUri", "", "Landroid/content/ClipData;", "dragAndDropRequestPermission", "", "Landroidx/compose/ui/node/DelegatableNode;", NotificationCompat.CATEGORY_EVENT, "Landroidx/compose/ui/draganddrop/DragAndDropEvent;", "foundation_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class DragAndDropRequestPermission_androidKt {
    public static final void dragAndDropRequestPermission(DelegatableNode $this$dragAndDropRequestPermission, DragAndDropEvent event) {
        if (containsContentUri(DragAndDrop_androidKt.toAndroidDragEvent(event).getClipData()) == true) goto L6;
        return;
    L6:
        if ($this$dragAndDropRequestPermission.getNode().isAttached() == false) goto L12;
        View view = DelegatableNode_androidKt.requireView($this$dragAndDropRequestPermission);
        Activity activity = tryGetActivity(view);
        if (activity != null) goto L10;
        return;
    L10:
        DragAndDropPermissionsCompat.request(activity, DragAndDrop_androidKt.toAndroidDragEvent(event));
        return;
    }

    private static final boolean containsContentUri(ClipData $this$containsContentUri) {
        int i = 0;
        int r1 = $this$containsContentUri.getItemCount();
    L3:
        if (i >= r1) goto L11;
        Uri uri = $this$containsContentUri.getItemAt(i).getUri();
        if (uri == null) goto L10;
        if (Intrinsics.areEqual(uri.getScheme(), "content") == false) goto L10;
        return true;
    L10:
        i = i + 1;
        goto L3
    L11:
        return false;
    }

    private static final Activity tryGetActivity(View view) {
        Context context = view.getContext();
    L4:
        if ((context instanceof ContextWrapper) == false) goto L10;
        if ((context instanceof Activity) == true) goto L8;
        context = ((ContextWrapper) context).getBaseContext();
        goto L4
    L8:
        return (Activity) context;
    L10:
        return null;
    }
}
