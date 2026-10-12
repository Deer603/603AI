package androidx.compose.ui.layout;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: Ruler.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001B\u0007\b\u0004¢\u0006\u0002\u0010\u0002J%\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007H ¢\u0006\u0002\b\t\u0082\u0001\u0002\n\u000b¨\u0006\f"}, d2 = {"Landroidx/compose/ui/layout/Ruler;", "", "()V", "calculateCoordinate", "", "coordinate", "sourceCoordinates", "Landroidx/compose/ui/layout/LayoutCoordinates;", "targetCoordinates", "calculateCoordinate$ui_release", "Landroidx/compose/ui/layout/HorizontalRuler;", "Landroidx/compose/ui/layout/VerticalRuler;", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public abstract class Ruler {
    public static final int $stable = 0;

    static {
    }

    public /* synthetic */ Ruler(DefaultConstructorMarker r1) {
        this();
    }

    public abstract float calculateCoordinate$ui_release(float r1, LayoutCoordinates r2, LayoutCoordinates r3);

    private Ruler() {
    }
}
