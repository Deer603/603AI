package androidx.compose.foundation.gestures;

import androidx.compose.ui.geometry.Offset;
import kotlin.Metadata;

/* JADX INFO: compiled from: TransformableState.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J0\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u0005H&ø\u0001\u0000¢\u0006\u0004\b\t\u0010\nø\u0001\u0001\u0082\u0002\r\n\u0005\b¡\u001e0\u0001\n\u0004\b!0\u0001¨\u0006\u000bÀ\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/gestures/TransformScope;", "", "transformBy", "", "zoomChange", "", "panChange", "Landroidx/compose/ui/geometry/Offset;", "rotationChange", "transformBy-d-4ec7I", "(FJF)V", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public interface TransformScope {

    /* JADX INFO: compiled from: TransformableState.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class DefaultImpls {
        /* JADX INFO: renamed from: transformBy-d-4ec7I$default, reason: not valid java name */
        public static /* synthetic */ void m527transformByd4ec7I$default(TransformScope r0, float r1, long r2, float r4, int r5, Object r6) {
            TransformScope.m526transformByd4ec7I$default(r0, r1, r2, r4, r5, r6);
        }
    }

    /* JADX INFO: renamed from: transformBy-d-4ec7I */
    void mo412transformByd4ec7I(float r1, long r2, float r4);

    /* JADX INFO: renamed from: transformBy-d-4ec7I$default, reason: not valid java name */
    static /* synthetic */ void m526transformByd4ec7I$default(TransformScope r0, float r1, long r2, float r4, int r5, Object r6) {
        if (r6 != null) goto L15;
        if ((r5 & 1) == 0) goto L7;
        r1 = 1.0f;
    L7:
        if ((r5 & 2) == 0) goto L10;
        r2 = Offset.Companion.m4141getZeroF1C5BW0();
    L10:
        if ((r5 & 4) == 0) goto L12;
        r4 = 0.0f;
    L12:
        r0.mo412transformByd4ec7I(r1, r2, r4);
        return;
    L15:
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: transformBy-d-4ec7I");
    }
}
