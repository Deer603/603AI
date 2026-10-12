package androidx.compose.ui.platform;

import kotlin.Metadata;

/* JADX INFO: compiled from: AccessibilityManager.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J.\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u0006H&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\tÀ\u0006\u0003"}, d2 = {"Landroidx/compose/ui/platform/AccessibilityManager;", "", "calculateRecommendedTimeoutMillis", "", "originalTimeoutMillis", "containsIcons", "", "containsText", "containsControls", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public interface AccessibilityManager {

    /* JADX INFO: compiled from: AccessibilityManager.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class DefaultImpls {
        public static /* synthetic */ long calculateRecommendedTimeoutMillis$default(AccessibilityManager r0, long r1, boolean r3, boolean r4, boolean r5, int r6, Object r7) {
            return AccessibilityManager.calculateRecommendedTimeoutMillis$default(r0, r1, r3, r4, r5, r6, r7);
        }
    }

    long calculateRecommendedTimeoutMillis(long r1, boolean r3, boolean r4, boolean r5);

    static /* synthetic */ long calculateRecommendedTimeoutMillis$default(AccessibilityManager r1, long r2, boolean r4, boolean r5, boolean r6, int r7, Object r8) {
        if (r8 != null) goto L15;
        if ((r7 & 2) == 0) goto L7;
        r4 = false;
    L7:
        if ((r7 & 4) == 0) goto L10;
        r5 = false;
    L10:
        if ((r7 & 8) == 0) goto L13;
        r6 = false;
    L13:
        return r1.calculateRecommendedTimeoutMillis(r2, r4, r5, r6);
    L15:
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: calculateRecommendedTimeoutMillis");
    }
}
