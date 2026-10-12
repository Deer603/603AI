package androidx.compose.runtime;

import kotlin.Metadata;

/* JADX INFO: compiled from: ComposeRuntimeFlags.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0018\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\b\n\u0000\u0012\u0004\b\u0005\u0010\u0002¨\u0006\u0006"}, d2 = {"Landroidx/compose/runtime/ComposeRuntimeFlags;", "", "()V", "isMovingNestedMovableContentEnabled", "", "isMovingNestedMovableContentEnabled$annotations", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class ComposeRuntimeFlags {
    public static final int $stable = 0;
    public static final ComposeRuntimeFlags INSTANCE = null;
    public static boolean isMovingNestedMovableContentEnabled;

    public static /* synthetic */ void isMovingNestedMovableContentEnabled$annotations() {
    }

    private ComposeRuntimeFlags() {
    }

    static {
        INSTANCE = new ComposeRuntimeFlags();
        isMovingNestedMovableContentEnabled = true;
        $stable = 8;
    }
}
