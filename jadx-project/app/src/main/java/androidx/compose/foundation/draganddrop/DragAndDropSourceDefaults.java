package androidx.compose.foundation.draganddrop;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: AndroidDragAndDropSource.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÁ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R4\u0010\u0003\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0004¢\u0006\u0002\b\b¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\t\u0010\n¨\u0006\f"}, d2 = {"Landroidx/compose/foundation/draganddrop/DragAndDropSourceDefaults;", "", "()V", "DefaultStartDetector", "Lkotlin/Function2;", "Landroidx/compose/foundation/draganddrop/DragAndDropStartDetectorScope;", "Lkotlin/coroutines/Continuation;", "", "Lkotlin/ExtensionFunctionType;", "getDefaultStartDetector", "()Lkotlin/jvm/functions/Function2;", "Lkotlin/jvm/functions/Function2;", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class DragAndDropSourceDefaults {
    public static final int $stable = 0;
    private static final Function2<DragAndDropStartDetectorScope, Continuation<? super Unit>, Object> DefaultStartDetector = null;
    public static final DragAndDropSourceDefaults INSTANCE = null;

    private DragAndDropSourceDefaults() {
    }

    static {
        INSTANCE = new DragAndDropSourceDefaults();
        DefaultStartDetector = new DragAndDropSourceDefaults$DefaultStartDetector$1(null);
    }

    public final Function2<DragAndDropStartDetectorScope, Continuation<? super Unit>, Object> getDefaultStartDetector() {
        return DefaultStartDetector;
    }
}
