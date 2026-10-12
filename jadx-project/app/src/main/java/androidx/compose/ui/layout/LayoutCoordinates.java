package androidx.compose.ui.layout;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.internal.InlineClassHelperKt;
import java.util.Set;
import kotlin.Metadata;

/* JADX INFO: compiled from: LayoutCoordinates.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\bf\u0018\u00002\u00020\u0001J\u0011\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u0010H¦\u0002J\u001a\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u001d\u001a\u00020\u0003H&J\"\u0010\u001e\u001a\u00020\u001f2\u0006\u0010\u001c\u001a\u00020\u00002\u0006\u0010 \u001a\u00020\u001fH&ø\u0001\u0000¢\u0006\u0004\b!\u0010\"J.\u0010\u001e\u001a\u00020\u001f2\u0006\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010 \u001a\u00020\u001f2\b\b\u0002\u0010#\u001a\u00020\u0003H\u0016ø\u0001\u0000¢\u0006\u0004\b$\u0010%J\u001a\u0010&\u001a\u00020\u001f2\u0006\u0010'\u001a\u00020\u001fH&ø\u0001\u0000¢\u0006\u0004\b(\u0010)J\u001a\u0010*\u001a\u00020\u001f2\u0006\u0010'\u001a\u00020\u001fH\u0016ø\u0001\u0000¢\u0006\u0004\b+\u0010)J\u001a\u0010,\u001a\u00020\u001f2\u0006\u0010'\u001a\u00020\u001fH&ø\u0001\u0000¢\u0006\u0004\b-\u0010)J\u001a\u0010.\u001a\u00020\u001f2\u0006\u0010/\u001a\u00020\u001fH\u0016ø\u0001\u0000¢\u0006\u0004\b0\u0010)J\"\u00101\u001a\u0002022\u0006\u0010\u001c\u001a\u00020\u00002\u0006\u00103\u001a\u000204H\u0016ø\u0001\u0000¢\u0006\u0004\b5\u00106J\u001a\u00107\u001a\u0002022\u0006\u00103\u001a\u000204H\u0016ø\u0001\u0000¢\u0006\u0004\b8\u00109J\u001a\u0010:\u001a\u00020\u001f2\u0006\u0010;\u001a\u00020\u001fH&ø\u0001\u0000¢\u0006\u0004\b<\u0010)R\u001a\u0010\u0002\u001a\u00020\u00038VX\u0096\u0004¢\u0006\f\u0012\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007R\u0012\u0010\b\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\u0007R\u0014\u0010\t\u001a\u0004\u0018\u00010\u0000X¦\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u0004\u0018\u00010\u0000X¦\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000bR\u0018\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fX¦\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u0018\u0010\u0013\u001a\u00020\u0014X¦\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016ø\u0001\u0002\u0082\u0002\u0011\n\u0005\b¡\u001e0\u0001\n\u0002\b!\n\u0004\b!0\u0001¨\u0006=À\u0006\u0003"}, d2 = {"Landroidx/compose/ui/layout/LayoutCoordinates;", "", "introducesMotionFrameOfReference", "", "getIntroducesMotionFrameOfReference$annotations", "()V", "getIntroducesMotionFrameOfReference", "()Z", "isAttached", "parentCoordinates", "getParentCoordinates", "()Landroidx/compose/ui/layout/LayoutCoordinates;", "parentLayoutCoordinates", "getParentLayoutCoordinates", "providedAlignmentLines", "", "Landroidx/compose/ui/layout/AlignmentLine;", "getProvidedAlignmentLines", "()Ljava/util/Set;", "size", "Landroidx/compose/ui/unit/IntSize;", "getSize-YbymL2g", "()J", "get", "", "alignmentLine", "localBoundingBoxOf", "Landroidx/compose/ui/geometry/Rect;", "sourceCoordinates", "clipBounds", "localPositionOf", "Landroidx/compose/ui/geometry/Offset;", "relativeToSource", "localPositionOf-R5De75A", "(Landroidx/compose/ui/layout/LayoutCoordinates;J)J", "includeMotionFrameOfReference", "localPositionOf-S_NoaFU", "(Landroidx/compose/ui/layout/LayoutCoordinates;JZ)J", "localToRoot", "relativeToLocal", "localToRoot-MK-Hz9U", "(J)J", "localToScreen", "localToScreen-MK-Hz9U", "localToWindow", "localToWindow-MK-Hz9U", "screenToLocal", "relativeToScreen", "screenToLocal-MK-Hz9U", "transformFrom", "", "matrix", "Landroidx/compose/ui/graphics/Matrix;", "transformFrom-EL8BTi8", "(Landroidx/compose/ui/layout/LayoutCoordinates;[F)V", "transformToScreen", "transformToScreen-58bKbWc", "([F)V", "windowToLocal", "relativeToWindow", "windowToLocal-MK-Hz9U", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public interface LayoutCoordinates {

    /* JADX INFO: compiled from: LayoutCoordinates.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class DefaultImpls {
        public static /* synthetic */ void getIntroducesMotionFrameOfReference$annotations() {
        }

        @Deprecated
        public static boolean getIntroducesMotionFrameOfReference(LayoutCoordinates $this) {
            return LayoutCoordinates.access$getIntroducesMotionFrameOfReference$jd($this);
        }

        @Deprecated
        /* JADX INFO: renamed from: screenToLocal-MK-Hz9U, reason: not valid java name */
        public static long m5735screenToLocalMKHz9U(LayoutCoordinates $this, long relativeToScreen) {
            return LayoutCoordinates.m5718access$screenToLocalMKHz9U$jd($this, relativeToScreen);
        }

        @Deprecated
        /* JADX INFO: renamed from: localToScreen-MK-Hz9U, reason: not valid java name */
        public static long m5734localToScreenMKHz9U(LayoutCoordinates $this, long relativeToLocal) {
            return LayoutCoordinates.m5717access$localToScreenMKHz9U$jd($this, relativeToLocal);
        }

        @Deprecated
        /* JADX INFO: renamed from: localPositionOf-S_NoaFU, reason: not valid java name */
        public static long m5732localPositionOfS_NoaFU(LayoutCoordinates $this, LayoutCoordinates sourceCoordinates, long relativeToSource, boolean includeMotionFrameOfReference) {
            return LayoutCoordinates.m5716access$localPositionOfS_NoaFU$jd($this, sourceCoordinates, relativeToSource, includeMotionFrameOfReference);
        }

        /* JADX INFO: renamed from: localPositionOf-S_NoaFU$default, reason: not valid java name */
        public static /* synthetic */ long m5733localPositionOfS_NoaFU$default(LayoutCoordinates r0, LayoutCoordinates r1, long r2, boolean r4, int r5, Object r6) {
            return LayoutCoordinates.m5721localPositionOfS_NoaFU$default(r0, r1, r2, r4, r5, r6);
        }

        public static /* synthetic */ Rect localBoundingBoxOf$default(LayoutCoordinates r0, LayoutCoordinates r1, boolean r2, int r3, Object r4) {
            return LayoutCoordinates.localBoundingBoxOf$default(r0, r1, r2, r3, r4);
        }

        @Deprecated
        /* JADX INFO: renamed from: transformFrom-EL8BTi8, reason: not valid java name */
        public static void m5736transformFromEL8BTi8(LayoutCoordinates $this, LayoutCoordinates sourceCoordinates, float[] matrix) {
            LayoutCoordinates.m5719access$transformFromEL8BTi8$jd($this, sourceCoordinates, matrix);
        }

        @Deprecated
        /* JADX INFO: renamed from: transformToScreen-58bKbWc, reason: not valid java name */
        public static void m5737transformToScreen58bKbWc(LayoutCoordinates $this, float[] matrix) {
            LayoutCoordinates.m5720access$transformToScreen58bKbWc$jd($this, matrix);
        }
    }

    int get(AlignmentLine r1);

    LayoutCoordinates getParentCoordinates();

    LayoutCoordinates getParentLayoutCoordinates();

    Set<AlignmentLine> getProvidedAlignmentLines();

    /* JADX INFO: renamed from: getSize-YbymL2g, reason: not valid java name */
    long mo5722getSizeYbymL2g();

    boolean isAttached();

    Rect localBoundingBoxOf(LayoutCoordinates r1, boolean r2);

    /* JADX INFO: renamed from: localPositionOf-R5De75A, reason: not valid java name */
    long mo5723localPositionOfR5De75A(LayoutCoordinates r1, long r2);

    /* JADX INFO: renamed from: localToRoot-MK-Hz9U, reason: not valid java name */
    long mo5725localToRootMKHz9U(long r1);

    /* JADX INFO: renamed from: localToWindow-MK-Hz9U, reason: not valid java name */
    long mo5727localToWindowMKHz9U(long r1);

    /* JADX INFO: renamed from: windowToLocal-MK-Hz9U, reason: not valid java name */
    long mo5731windowToLocalMKHz9U(long r1);

    static /* synthetic */ boolean access$getIntroducesMotionFrameOfReference$jd(LayoutCoordinates $this) {
        return super.getIntroducesMotionFrameOfReference();
    }

    /* JADX INFO: renamed from: access$localPositionOf-S_NoaFU$jd, reason: not valid java name */
    static /* synthetic */ long m5716access$localPositionOfS_NoaFU$jd(LayoutCoordinates $this, LayoutCoordinates sourceCoordinates, long relativeToSource, boolean includeMotionFrameOfReference) {
        return super.mo5724localPositionOfS_NoaFU(sourceCoordinates, relativeToSource, includeMotionFrameOfReference);
    }

    /* JADX INFO: renamed from: access$localToScreen-MK-Hz9U$jd, reason: not valid java name */
    static /* synthetic */ long m5717access$localToScreenMKHz9U$jd(LayoutCoordinates $this, long relativeToLocal) {
        return super.mo5726localToScreenMKHz9U(relativeToLocal);
    }

    /* JADX INFO: renamed from: access$screenToLocal-MK-Hz9U$jd, reason: not valid java name */
    static /* synthetic */ long m5718access$screenToLocalMKHz9U$jd(LayoutCoordinates $this, long relativeToScreen) {
        return super.mo5728screenToLocalMKHz9U(relativeToScreen);
    }

    /* JADX INFO: renamed from: access$transformFrom-EL8BTi8$jd, reason: not valid java name */
    static /* synthetic */ void m5719access$transformFromEL8BTi8$jd(LayoutCoordinates $this, LayoutCoordinates sourceCoordinates, float[] matrix) {
        super.mo5729transformFromEL8BTi8(sourceCoordinates, matrix);
    }

    /* JADX INFO: renamed from: access$transformToScreen-58bKbWc$jd, reason: not valid java name */
    static /* synthetic */ void m5720access$transformToScreen58bKbWc$jd(LayoutCoordinates $this, float[] matrix) {
        super.mo5730transformToScreen58bKbWc(matrix);
    }

    default boolean getIntroducesMotionFrameOfReference() {
        return false;
    }

    /* JADX INFO: renamed from: screenToLocal-MK-Hz9U, reason: not valid java name */
    default long mo5728screenToLocalMKHz9U(long relativeToScreen) {
        return Offset.Companion.m4140getUnspecifiedF1C5BW0();
    }

    /* JADX INFO: renamed from: localToScreen-MK-Hz9U, reason: not valid java name */
    default long mo5726localToScreenMKHz9U(long relativeToLocal) {
        return Offset.Companion.m4140getUnspecifiedF1C5BW0();
    }

    /* JADX INFO: renamed from: localPositionOf-S_NoaFU$default, reason: not valid java name */
    static /* synthetic */ long m5721localPositionOfS_NoaFU$default(LayoutCoordinates r0, LayoutCoordinates r1, long r2, boolean r4, int r5, Object r6) {
        if (r6 != null) goto L12;
        if ((r5 & 2) == 0) goto L7;
        r2 = Offset.Companion.m4141getZeroF1C5BW0();
    L7:
        if ((r5 & 4) == 0) goto L10;
        r4 = true;
    L10:
        return r0.mo5724localPositionOfS_NoaFU(r1, r2, r4);
    L12:
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: localPositionOf-S_NoaFU");
    }

    /* JADX INFO: renamed from: localPositionOf-S_NoaFU, reason: not valid java name */
    default long mo5724localPositionOfS_NoaFU(LayoutCoordinates sourceCoordinates, long relativeToSource, boolean includeMotionFrameOfReference) {
        throw new UnsupportedOperationException("localPositionOf is not implemented on this LayoutCoordinates");
    }

    static /* synthetic */ Rect localBoundingBoxOf$default(LayoutCoordinates r0, LayoutCoordinates r1, boolean r2, int r3, Object r4) {
        if (r4 != null) goto L9;
        if ((r3 & 2) == 0) goto L7;
        r2 = true;
    L7:
        return r0.localBoundingBoxOf(r1, r2);
    L9:
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: localBoundingBoxOf");
    }

    /* JADX INFO: renamed from: transformFrom-EL8BTi8, reason: not valid java name */
    default void mo5729transformFromEL8BTi8(LayoutCoordinates sourceCoordinates, float[] matrix) {
        InlineClassHelperKt.throwUnsupportedOperationException("transformFrom is not implemented on this LayoutCoordinates");
    }

    /* JADX INFO: renamed from: transformToScreen-58bKbWc, reason: not valid java name */
    default void mo5730transformToScreen58bKbWc(float[] matrix) {
        throw new UnsupportedOperationException("transformToScreen is not implemented on this LayoutCoordinates");
    }
}
