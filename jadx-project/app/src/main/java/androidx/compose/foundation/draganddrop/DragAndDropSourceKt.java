package androidx.compose.foundation.draganddrop;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.draganddrop.DragAndDropTransferData;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"androidx/compose/foundation/draganddrop/DragAndDropSourceKt__DragAndDropSourceKt", "androidx/compose/foundation/draganddrop/DragAndDropSourceKt__LegacyDragAndDropSource_androidKt"}, k = 4, mv = {1, 9, 0}, xi = 48)
public final class DragAndDropSourceKt {
    public static final Modifier dragAndDropSource(Modifier $this$dragAndDropSource, Function1<? super Offset, DragAndDropTransferData> r2) {
        return DragAndDropSourceKt__DragAndDropSourceKt.dragAndDropSource($this$dragAndDropSource, r2);
    }

    public static final Modifier dragAndDropSource(Modifier $this$dragAndDropSource, Function1<? super DrawScope, Unit> r2, Function1<? super Offset, DragAndDropTransferData> r3) {
        return DragAndDropSourceKt__DragAndDropSourceKt.dragAndDropSource($this$dragAndDropSource, r2, r3);
    }

    @Deprecated(message = "Replaced by overload with a callback for obtain a transfer data,start detection is performed by Compose itself", replaceWith = @ReplaceWith(expression = "Modifier.dragAndDropSource(transferData)", imports = {}))
    public static final Modifier dragAndDropSource(Modifier $this$dragAndDropSource, Function1<? super DrawScope, Unit> r2, Function2<? super DragAndDropSourceScope, ? super Continuation<? super Unit>, ? extends Object> r3) {
        return DragAndDropSourceKt__LegacyDragAndDropSource_androidKt.dragAndDropSource($this$dragAndDropSource, r2, r3);
    }
}
