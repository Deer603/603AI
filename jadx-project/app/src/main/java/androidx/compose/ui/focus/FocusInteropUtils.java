package androidx.compose.ui.focus;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: FocusInteropUtils.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0002\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, d2 = {"Landroidx/compose/ui/focus/FocusInteropUtils;", "", "()V", "Companion", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
final class FocusInteropUtils {
    public static final Companion Companion = null;
    private static final int[] tempCoordinates = null;

    /* JADX INFO: compiled from: FocusInteropUtils.android.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Landroidx/compose/ui/focus/FocusInteropUtils$Companion;", "", "()V", "tempCoordinates", "", "getTempCoordinates", "()[I", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker r1) {
            this();
        }

        private Companion() {
        }

        public final int[] getTempCoordinates() {
            return FocusInteropUtils.access$getTempCoordinates$cp();
        }
    }

    public FocusInteropUtils() {
    }

    public static final /* synthetic */ int[] access$getTempCoordinates$cp() {
        return tempCoordinates;
    }

    static {
        Companion = new Companion(null);
        tempCoordinates = new int[2];
    }
}
