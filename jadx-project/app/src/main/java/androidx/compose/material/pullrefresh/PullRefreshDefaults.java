package androidx.compose.material.pullrefresh;

import androidx.compose.ui.unit.Dp;
import kotlin.Metadata;

/* JADX INFO: compiled from: PullRefreshState.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0019\u0010\u0003\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0005\u0010\u0006R\u0019\u0010\b\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\t\u0010\u0006\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\n"}, d2 = {"Landroidx/compose/material/pullrefresh/PullRefreshDefaults;", "", "()V", "RefreshThreshold", "Landroidx/compose/ui/unit/Dp;", "getRefreshThreshold-D9Ej5fM", "()F", "F", "RefreshingOffset", "getRefreshingOffset-D9Ej5fM", "material_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class PullRefreshDefaults {
    public static final int $stable = 0;
    public static final PullRefreshDefaults INSTANCE = null;
    private static final float RefreshThreshold = 0.0f;
    private static final float RefreshingOffset = 0.0f;

    private PullRefreshDefaults() {
    }

    static {
        INSTANCE = new PullRefreshDefaults();
        RefreshThreshold = Dp.m6973constructorimpl(80);
        RefreshingOffset = Dp.m6973constructorimpl(56);
    }

    /* JADX INFO: renamed from: getRefreshThreshold-D9Ej5fM, reason: not valid java name */
    public final float m1855getRefreshThresholdD9Ej5fM() {
        return RefreshThreshold;
    }

    /* JADX INFO: renamed from: getRefreshingOffset-D9Ej5fM, reason: not valid java name */
    public final float m1856getRefreshingOffsetD9Ej5fM() {
        return RefreshingOffset;
    }
}
