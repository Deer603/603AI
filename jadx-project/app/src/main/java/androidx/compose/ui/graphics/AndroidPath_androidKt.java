package androidx.compose.ui.graphics;

import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: compiled from: AndroidPath.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000&\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u0006\u0010\u0000\u001a\u00020\u0001\u001a\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0000\u001a\r\u0010\u0006\u001a\u00020\u0007*\u00020\u0001H\u0086\b\u001a\n\u0010\b\u001a\u00020\u0001*\u00020\u0007\u001a\f\u0010\t\u001a\u00020\n*\u00020\u000bH\u0002¨\u0006\f"}, d2 = {"Path", "Landroidx/compose/ui/graphics/Path;", "throwIllegalStateException", "", "message", "", "asAndroidPath", "Landroid/graphics/Path;", "asComposePath", "toPlatformPathDirection", "Landroid/graphics/Path$Direction;", "Landroidx/compose/ui/graphics/Path$Direction;", "ui-graphics_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class AndroidPath_androidKt {

    /* JADX INFO: compiled from: AndroidPath.android.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0 = null;

        static {
            int[] r0 = new int[Path.Direction.values().length];
            r0[Path.Direction.CounterClockwise.ordinal()] = 1;     // Catch: NoSuchFieldError -> L5
        L11:
            r0[Path.Direction.Clockwise.ordinal()] = 2;     // Catch: NoSuchFieldError -> L8
        L9:
            $EnumSwitchMapping$0 = r0;
        }
    }

    public static final /* synthetic */ android.graphics.Path.Direction access$toPlatformPathDirection(Path.Direction $receiver) {
        return toPlatformPathDirection($receiver);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Path Path() {
        return new AndroidPath(null, 1, 0 == true ? 1 : 0);
    }

    public static final Path asComposePath(android.graphics.Path $this$asComposePath) {
        return new AndroidPath($this$asComposePath);
    }

    public static final android.graphics.Path asAndroidPath(Path $this$asAndroidPath) {
        if (($this$asAndroidPath instanceof AndroidPath) == false) goto L7;
        return ((AndroidPath) $this$asAndroidPath).getInternalPath();
    L7:
        throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
    }

    public static final void throwIllegalStateException(String message) {
        throw new IllegalStateException(message);
    }

    private static final android.graphics.Path.Direction toPlatformPathDirection(Path.Direction $this$toPlatformPathDirection) {
        switch(WhenMappings.$EnumSwitchMapping$0[$this$toPlatformPathDirection.ordinal()]) {
            case 1: goto L8;
            case 2: goto L9;
            default: goto L5;
        };
    L5:
        throw new NoWhenBranchMatchedException();
    L9:
        return android.graphics.Path.Direction.CW;
    L8:
        return android.graphics.Path.Direction.CCW;
    }
}
