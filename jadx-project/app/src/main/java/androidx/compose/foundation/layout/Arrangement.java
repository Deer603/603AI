package androidx.compose.foundation.layout;

import androidx.compose.ui.Alignment;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Arrangement.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u0001:\u0005EFGHIB\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010!\u001a\u00020\u000e2\u0006\u0010\"\u001a\u00020#H\u0007J\u0010\u0010!\u001a\u00020\u00042\u0006\u0010\"\u001a\u00020$H\u0007J-\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020(2\u0006\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020*2\u0006\u0010,\u001a\u00020-H\u0000¢\u0006\u0002\b.J%\u0010/\u001a\u00020&2\u0006\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020*2\u0006\u0010,\u001a\u00020-H\u0000¢\u0006\u0002\b0J-\u00101\u001a\u00020&2\u0006\u0010'\u001a\u00020(2\u0006\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020*2\u0006\u0010,\u001a\u00020-H\u0000¢\u0006\u0002\b2J-\u00103\u001a\u00020&2\u0006\u0010'\u001a\u00020(2\u0006\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020*2\u0006\u0010,\u001a\u00020-H\u0000¢\u0006\u0002\b4J-\u00105\u001a\u00020&2\u0006\u0010'\u001a\u00020(2\u0006\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020*2\u0006\u0010,\u001a\u00020-H\u0000¢\u0006\u0002\b6J-\u00107\u001a\u00020&2\u0006\u0010'\u001a\u00020(2\u0006\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020*2\u0006\u0010,\u001a\u00020-H\u0000¢\u0006\u0002\b8J\u001a\u00109\u001a\u00020\t2\u0006\u0010:\u001a\u00020;H\u0007ø\u0001\u0000¢\u0006\u0004\b<\u0010=J\"\u00109\u001a\u00020\u000e2\u0006\u0010:\u001a\u00020;2\u0006\u0010\"\u001a\u00020#H\u0007ø\u0001\u0000¢\u0006\u0004\b>\u0010?J\"\u00109\u001a\u00020\u00042\u0006\u0010:\u001a\u00020;2\u0006\u0010\"\u001a\u00020$H\u0007ø\u0001\u0000¢\u0006\u0004\b>\u0010@J/\u0010A\u001a\u00020&*\u00020*2\u0006\u0010B\u001a\u00020-2\u0018\u0010C\u001a\u0014\u0012\u0004\u0012\u00020(\u0012\u0004\u0012\u00020(\u0012\u0004\u0012\u00020&0DH\u0082\bR\u001c\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0005\u0010\u0002\u001a\u0004\b\u0006\u0010\u0007R\u001c\u0010\b\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\n\u0010\u0002\u001a\u0004\b\u000b\u0010\fR\u001c\u0010\r\u001a\u00020\u000e8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u000f\u0010\u0002\u001a\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0012\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0013\u0010\u0002\u001a\u0004\b\u0014\u0010\fR\u001c\u0010\u0015\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0016\u0010\u0002\u001a\u0004\b\u0017\u0010\fR\u001c\u0010\u0018\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0019\u0010\u0002\u001a\u0004\b\u001a\u0010\fR\u001c\u0010\u001b\u001a\u00020\u000e8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001c\u0010\u0002\u001a\u0004\b\u001d\u0010\u0011R\u001c\u0010\u001e\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001f\u0010\u0002\u001a\u0004\b \u0010\u0007\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006J"}, d2 = {"Landroidx/compose/foundation/layout/Arrangement;", "", "()V", "Bottom", "Landroidx/compose/foundation/layout/Arrangement$Vertical;", "getBottom$annotations", "getBottom", "()Landroidx/compose/foundation/layout/Arrangement$Vertical;", "Center", "Landroidx/compose/foundation/layout/Arrangement$HorizontalOrVertical;", "getCenter$annotations", "getCenter", "()Landroidx/compose/foundation/layout/Arrangement$HorizontalOrVertical;", "End", "Landroidx/compose/foundation/layout/Arrangement$Horizontal;", "getEnd$annotations", "getEnd", "()Landroidx/compose/foundation/layout/Arrangement$Horizontal;", "SpaceAround", "getSpaceAround$annotations", "getSpaceAround", "SpaceBetween", "getSpaceBetween$annotations", "getSpaceBetween", "SpaceEvenly", "getSpaceEvenly$annotations", "getSpaceEvenly", "Start", "getStart$annotations", "getStart", "Top", "getTop$annotations", "getTop", "aligned", "alignment", "Landroidx/compose/ui/Alignment$Horizontal;", "Landroidx/compose/ui/Alignment$Vertical;", "placeCenter", "", "totalSize", "", "size", "", "outPosition", "reverseInput", "", "placeCenter$foundation_layout_release", "placeLeftOrTop", "placeLeftOrTop$foundation_layout_release", "placeRightOrBottom", "placeRightOrBottom$foundation_layout_release", "placeSpaceAround", "placeSpaceAround$foundation_layout_release", "placeSpaceBetween", "placeSpaceBetween$foundation_layout_release", "placeSpaceEvenly", "placeSpaceEvenly$foundation_layout_release", "spacedBy", "space", "Landroidx/compose/ui/unit/Dp;", "spacedBy-0680j_4", "(F)Landroidx/compose/foundation/layout/Arrangement$HorizontalOrVertical;", "spacedBy-D5KLDUw", "(FLandroidx/compose/ui/Alignment$Horizontal;)Landroidx/compose/foundation/layout/Arrangement$Horizontal;", "(FLandroidx/compose/ui/Alignment$Vertical;)Landroidx/compose/foundation/layout/Arrangement$Vertical;", "forEachIndexed", "reversed", "action", "Lkotlin/Function2;", "Absolute", "Horizontal", "HorizontalOrVertical", "SpacedAligned", "Vertical", "foundation-layout_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class Arrangement {
    public static final int $stable = 0;
    private static final Vertical Bottom = null;
    private static final HorizontalOrVertical Center = null;
    private static final Horizontal End = null;
    public static final Arrangement INSTANCE = null;
    private static final HorizontalOrVertical SpaceAround = null;
    private static final HorizontalOrVertical SpaceBetween = null;
    private static final HorizontalOrVertical SpaceEvenly = null;
    private static final Horizontal Start = null;
    private static final Vertical Top = null;

    /* JADX INFO: compiled from: Arrangement.kt */
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\u0019H\u0007J\u001a\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001dH\u0007ø\u0001\u0000¢\u0006\u0004\b\u001e\u0010\u001fJ\"\u0010\u001a\u001a\u00020\u00042\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u0018\u001a\u00020\u0019H\u0007ø\u0001\u0000¢\u0006\u0004\b \u0010!J\"\u0010\u001a\u001a\u00020\"2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u0018\u001a\u00020#H\u0007ø\u0001\u0000¢\u0006\u0004\b \u0010$R\u001c\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0005\u0010\u0002\u001a\u0004\b\u0006\u0010\u0007R\u001c\u0010\b\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\t\u0010\u0002\u001a\u0004\b\n\u0010\u0007R\u001c\u0010\u000b\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\f\u0010\u0002\u001a\u0004\b\r\u0010\u0007R\u001c\u0010\u000e\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u000f\u0010\u0002\u001a\u0004\b\u0010\u0010\u0007R\u001c\u0010\u0011\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0012\u0010\u0002\u001a\u0004\b\u0013\u0010\u0007R\u001c\u0010\u0014\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0015\u0010\u0002\u001a\u0004\b\u0016\u0010\u0007\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006%"}, d2 = {"Landroidx/compose/foundation/layout/Arrangement$Absolute;", "", "()V", "Center", "Landroidx/compose/foundation/layout/Arrangement$Horizontal;", "getCenter$annotations", "getCenter", "()Landroidx/compose/foundation/layout/Arrangement$Horizontal;", "Left", "getLeft$annotations", "getLeft", "Right", "getRight$annotations", "getRight", "SpaceAround", "getSpaceAround$annotations", "getSpaceAround", "SpaceBetween", "getSpaceBetween$annotations", "getSpaceBetween", "SpaceEvenly", "getSpaceEvenly$annotations", "getSpaceEvenly", "aligned", "alignment", "Landroidx/compose/ui/Alignment$Horizontal;", "spacedBy", "Landroidx/compose/foundation/layout/Arrangement$HorizontalOrVertical;", "space", "Landroidx/compose/ui/unit/Dp;", "spacedBy-0680j_4", "(F)Landroidx/compose/foundation/layout/Arrangement$HorizontalOrVertical;", "spacedBy-D5KLDUw", "(FLandroidx/compose/ui/Alignment$Horizontal;)Landroidx/compose/foundation/layout/Arrangement$Horizontal;", "Landroidx/compose/foundation/layout/Arrangement$Vertical;", "Landroidx/compose/ui/Alignment$Vertical;", "(FLandroidx/compose/ui/Alignment$Vertical;)Landroidx/compose/foundation/layout/Arrangement$Vertical;", "foundation-layout_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Absolute {
        public static final int $stable = 0;
        private static final Horizontal Center = null;
        public static final Absolute INSTANCE = null;
        private static final Horizontal Left = null;
        private static final Horizontal Right = null;
        private static final Horizontal SpaceAround = null;
        private static final Horizontal SpaceBetween = null;
        private static final Horizontal SpaceEvenly = null;

        public static /* synthetic */ void getCenter$annotations() {
        }

        public static /* synthetic */ void getLeft$annotations() {
        }

        public static /* synthetic */ void getRight$annotations() {
        }

        public static /* synthetic */ void getSpaceAround$annotations() {
        }

        public static /* synthetic */ void getSpaceBetween$annotations() {
        }

        public static /* synthetic */ void getSpaceEvenly$annotations() {
        }

        private Absolute() {
        }

        public final Horizontal getLeft() {
            return Left;
        }

        static {
            INSTANCE = new Absolute();
            Left = new Arrangement$Absolute$Left$1();
            Center = new Arrangement$Absolute$Center$1();
            Right = new Arrangement$Absolute$Right$1();
            SpaceBetween = new Arrangement$Absolute$SpaceBetween$1();
            SpaceEvenly = new Arrangement$Absolute$SpaceEvenly$1();
            SpaceAround = new Arrangement$Absolute$SpaceAround$1();
        }

        public final Horizontal getCenter() {
            return Center;
        }

        public final Horizontal getRight() {
            return Right;
        }

        public final Horizontal getSpaceBetween() {
            return SpaceBetween;
        }

        public final Horizontal getSpaceEvenly() {
            return SpaceEvenly;
        }

        public final Horizontal getSpaceAround() {
            return SpaceAround;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX INFO: renamed from: spacedBy-0680j_4, reason: not valid java name */
        public final HorizontalOrVertical m609spacedBy0680j_4(float r4) {
            return new SpacedAligned(r4, false, null, 0 == true ? 1 : 0);
        }

        /* JADX INFO: renamed from: spacedBy-D5KLDUw, reason: not valid java name */
        public final Horizontal m610spacedByD5KLDUw(float space, final Alignment.Horizontal alignment) {
            boolean r3 = false;
            return new SpacedAligned(space, r3, new Arrangement$Absolute$spacedBy$1(alignment), null);
        }

        /* JADX INFO: renamed from: spacedBy-D5KLDUw, reason: not valid java name */
        public final Vertical m611spacedByD5KLDUw(float space, final Alignment.Vertical alignment) {
            boolean r3 = false;
            return new SpacedAligned(space, r3, new Arrangement$Absolute$spacedBy$2(alignment), null);
        }

        public final Horizontal aligned(final Alignment.Horizontal alignment) {
            return new SpacedAligned(Dp.m6973constructorimpl(0), false, new Arrangement$Absolute$aligned$1(alignment), null);
        }
    }

    /* JADX INFO: compiled from: Arrangement.kt */
    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0015\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J,\u0010\u0006\u001a\u00020\u0007*\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\fH&R\u001a\u0010\u0002\u001a\u00020\u00038VX\u0096\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005ø\u0001\u0002\u0082\u0002\u0011\n\u0005\b¡\u001e0\u0001\n\u0002\b!\n\u0004\b!0\u0001¨\u0006\u0010À\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/layout/Arrangement$Horizontal;", "", "spacing", "Landroidx/compose/ui/unit/Dp;", "getSpacing-D9Ej5fM", "()F", "arrange", "", "Landroidx/compose/ui/unit/Density;", "totalSize", "", "sizes", "", "layoutDirection", "Landroidx/compose/ui/unit/LayoutDirection;", "outPositions", "foundation-layout_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface Horizontal {

        /* JADX INFO: compiled from: Arrangement.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class DefaultImpls {
            @Deprecated
            /* JADX INFO: renamed from: getSpacing-D9Ej5fM, reason: not valid java name */
            public static float m614getSpacingD9Ej5fM(Horizontal $this) {
                return Horizontal.m613access$getSpacingD9Ej5fM$jd($this);
            }
        }

        void arrange(Density r1, int r2, int[] r3, LayoutDirection r4, int[] r5);

        /* JADX INFO: renamed from: access$getSpacing-D9Ej5fM$jd, reason: not valid java name */
        static /* synthetic */ float m613access$getSpacingD9Ej5fM$jd(Horizontal $this) {
            return super.mo612getSpacingD9Ej5fM();
        }

        /* JADX INFO: renamed from: getSpacing-D9Ej5fM */
        default float mo612getSpacingD9Ej5fM() {
            return Dp.m6973constructorimpl(0);
        }
    }

    /* JADX INFO: compiled from: Arrangement.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u00012\u00020\u0002R\u001a\u0010\u0003\u001a\u00020\u00048VX\u0096\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006ø\u0001\u0002\u0082\u0002\u0011\n\u0005\b¡\u001e0\u0001\n\u0002\b!\n\u0004\b!0\u0001¨\u0006\u0007À\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/layout/Arrangement$HorizontalOrVertical;", "Landroidx/compose/foundation/layout/Arrangement$Horizontal;", "Landroidx/compose/foundation/layout/Arrangement$Vertical;", "spacing", "Landroidx/compose/ui/unit/Dp;", "getSpacing-D9Ej5fM", "()F", "foundation-layout_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface HorizontalOrVertical extends Horizontal, Vertical {

        /* JADX INFO: compiled from: Arrangement.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class DefaultImpls {
            @Deprecated
            /* JADX INFO: renamed from: getSpacing-D9Ej5fM, reason: not valid java name */
            public static float m616getSpacingD9Ej5fM(HorizontalOrVertical $this) {
                return HorizontalOrVertical.m615access$getSpacingD9Ej5fM$jd($this);
            }
        }

        /* JADX INFO: renamed from: access$getSpacing-D9Ej5fM$jd, reason: not valid java name */
        static /* synthetic */ float m615access$getSpacingD9Ej5fM$jd(HorizontalOrVertical $this) {
            return super.mo612getSpacingD9Ej5fM();
        }

        @Override // androidx.compose.foundation.layout.Arrangement.Horizontal, androidx.compose.foundation.layout.Arrangement.Vertical
        /* JADX INFO: renamed from: getSpacing-D9Ej5fM */
        default float mo612getSpacingD9Ej5fM() {
            return Dp.m6973constructorimpl(0);
        }
    }

    /* JADX INFO: compiled from: Arrangement.kt */
    @Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0002\b\u0003\b\u0081\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u001a\u0010\u0006\u001a\u0016\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007¢\u0006\u0002\u0010\nJ\u0016\u0010\u0014\u001a\u00020\u0003HÆ\u0003ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0010J\t\u0010\u0016\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u0017\u001a\u0016\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007HÆ\u0003JE\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u001c\b\u0002\u0010\u0006\u001a\u0016\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007HÆ\u0001ø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\u001aJ\u0013\u0010\u001b\u001a\u00020\u00052\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dHÖ\u0003J\t\u0010\u001e\u001a\u00020\bHÖ\u0001J\b\u0010\u001f\u001a\u00020 H\u0016J,\u0010!\u001a\u00020\"*\u00020#2\u0006\u0010$\u001a\u00020\b2\u0006\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020\t2\u0006\u0010(\u001a\u00020&H\u0016J$\u0010!\u001a\u00020\"*\u00020#2\u0006\u0010$\u001a\u00020\b2\u0006\u0010%\u001a\u00020&2\u0006\u0010(\u001a\u00020&H\u0016R%\u0010\u0006\u001a\u0016\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0019\u0010\u0002\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0011\u001a\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0012\u001a\u00020\u0003X\u0096\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0011\u001a\u0004\b\u0013\u0010\u0010\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006)"}, d2 = {"Landroidx/compose/foundation/layout/Arrangement$SpacedAligned;", "Landroidx/compose/foundation/layout/Arrangement$HorizontalOrVertical;", "space", "Landroidx/compose/ui/unit/Dp;", "rtlMirror", "", "alignment", "Lkotlin/Function2;", "", "Landroidx/compose/ui/unit/LayoutDirection;", "(FZLkotlin/jvm/functions/Function2;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "getAlignment", "()Lkotlin/jvm/functions/Function2;", "getRtlMirror", "()Z", "getSpace-D9Ej5fM", "()F", "F", "spacing", "getSpacing-D9Ej5fM", "component1", "component1-D9Ej5fM", "component2", "component3", "copy", "copy-8Feqmps", "(FZLkotlin/jvm/functions/Function2;)Landroidx/compose/foundation/layout/Arrangement$SpacedAligned;", "equals", "other", "", "hashCode", "toString", "", "arrange", "", "Landroidx/compose/ui/unit/Density;", "totalSize", "sizes", "", "layoutDirection", "outPositions", "foundation-layout_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class SpacedAligned implements HorizontalOrVertical {
        public static final int $stable = 0;
        private final Function2<Integer, LayoutDirection, Integer> alignment;
        private final boolean rtlMirror;
        private final float space;
        private final float spacing;

        static {
        }

        public /* synthetic */ SpacedAligned(float r1, boolean r2, Function2 r3, DefaultConstructorMarker r4) {
            this(r1, r2, r3);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX INFO: renamed from: copy-8Feqmps$default, reason: not valid java name */
        public static /* synthetic */ SpacedAligned m617copy8Feqmps$default(SpacedAligned r0, float r1, boolean r2, Function2 r3, int r4, Object r5) {
            if ((r4 & 1) == 0) goto L6;
            r1 = r0.space;
        L6:
            if ((r4 & 2) == 0) goto L9;
            r2 = r0.rtlMirror;
        L9:
            if ((r4 & 4) == 0) goto L12;
            r3 = r0.alignment;
        L12:
            return r0.m619copy8Feqmps(r1, r2, r3);
        }

        /* JADX INFO: renamed from: component1-D9Ej5fM, reason: not valid java name */
        public final float m618component1D9Ej5fM() {
            return this.space;
        }

        public final boolean component2() {
            return this.rtlMirror;
        }

        public final Function2<Integer, LayoutDirection, Integer> component3() {
            return this.alignment;
        }

        /* JADX INFO: renamed from: copy-8Feqmps, reason: not valid java name */
        public final SpacedAligned m619copy8Feqmps(float r3, boolean r4, Function2<? super Integer, ? super LayoutDirection, Integer> r5) {
            return new SpacedAligned(r3, r4, r5, null);
        }

        public boolean equals(Object r6) {
            if (this != r6) goto L6;
            return true;
        L6:
            if ((r6 instanceof SpacedAligned) == true) goto L8;
            return false;
        L8:
            SpacedAligned r1 = (SpacedAligned) r6;
            if (Dp.m6978equalsimpl0(this.space, r1.space) == true) goto L12;
            return false;
        L12:
            if (this.rtlMirror == r1.rtlMirror) goto L15;
            return false;
        L15:
            if (Intrinsics.areEqual(this.alignment, r1.alignment) == true) goto L17;
            return false;
        L17:
            return true;
        }

        public int hashCode() {
            int r0 = ((Dp.m6979hashCodeimpl(this.space) * 31) + Boolean.hashCode(this.rtlMirror)) * 31;
            if (this.alignment != null) goto L5;
            int r2 = 0;
        L7:
            return r0 + r2;
        L5:
            r2 = this.alignment.hashCode();
            goto L7
        }

        /* JADX WARN: Multi-variable type inference failed */
        private SpacedAligned(float space, boolean rtlMirror, Function2<? super Integer, ? super LayoutDirection, Integer> r4) {
            this.space = space;
            this.rtlMirror = rtlMirror;
            this.alignment = r4;
            this.spacing = this.space;
        }

        /* JADX INFO: renamed from: getSpace-D9Ej5fM, reason: not valid java name */
        public final float m620getSpaceD9Ej5fM() {
            return this.space;
        }

        public final boolean getRtlMirror() {
            return this.rtlMirror;
        }

        public final Function2<Integer, LayoutDirection, Integer> getAlignment() {
            return this.alignment;
        }

        @Override // androidx.compose.foundation.layout.Arrangement.HorizontalOrVertical, androidx.compose.foundation.layout.Arrangement.Horizontal, androidx.compose.foundation.layout.Arrangement.Vertical
        /* JADX INFO: renamed from: getSpacing-D9Ej5fM */
        public float mo612getSpacingD9Ej5fM() {
            return this.spacing;
        }

        @Override // androidx.compose.foundation.layout.Arrangement.Horizontal
        public void arrange(Density $this$arrange, int totalSize, int[] sizes, LayoutDirection layoutDirection, int[] outPositions) {
            if (sizes.length != 0) goto L5;
            boolean r5 = true;
        L6:
            if (r5 == false) goto L8;
            return;
        L8:
            int spacePx = $this$arrange.mo370roundToPx0680j_4(this.space);
            int occupied = 0;
            int lastSpace = 0;
            if (this.rtlMirror == true) goto L11;
        L13:
            boolean reversed = false;
        L14:
            Arrangement r12 = Arrangement.INSTANCE;
            if (reversed == true) goto L20;
            int r6 = sizes.length;
            int index$iv$iv = 0;
            int lastSpace2 = 0;
            int occupied2 = 0;
            int occupied3 = 0;
        L17:
            if (occupied3 >= r6) goto L25;
            int item$iv$iv = sizes[occupied3];
            outPositions[index$iv$iv] = Math.min(occupied2, totalSize - item$iv$iv);
            lastSpace2 = Math.min(spacePx, (totalSize - outPositions[index$iv$iv]) - item$iv$iv);
            occupied2 = (outPositions[index$iv$iv] + item$iv$iv) + lastSpace2;
            occupied3 = occupied3 + 1;
            index$iv$iv = index$iv$iv + 1;
        L25:
            int occupied4 = occupied2 - lastSpace2;
            if (this.alignment == null) goto L31;
            if (occupied4 >= totalSize) goto L35;
            int groupPosition = this.alignment.invoke(Integer.valueOf(totalSize - occupied4), layoutDirection).intValue();
            int index = 0;
            int r7 = outPositions.length;
        L29:
            if (index >= r7) goto L36;
            outPositions[index] = outPositions[index] + groupPosition;
            index = index + 1;
            goto L29
        L36:
            return;
        L35:
            return;
        L31:
            return;
        L20:
            int i$iv = sizes.length - 1;
        L22:
            if ((-1) >= i$iv) goto L24;
            int it = sizes[i$iv];
            int index2 = i$iv;
            int i$iv2 = i$iv;
            int i$iv3 = totalSize - it;
            outPositions[index2] = Math.min(occupied, i$iv3);
            lastSpace = Math.min(spacePx, (totalSize - outPositions[index2]) - it);
            occupied = (outPositions[index2] + it) + lastSpace;
            i$iv = i$iv2 - 1;
            goto L22
        L24:
            lastSpace2 = lastSpace;
            occupied2 = occupied;
            goto L25
        L11:
            if (layoutDirection != LayoutDirection.Rtl) goto L13;
            reversed = true;
            goto L14
        L5:
            r5 = false;
            goto L6
        }

        @Override // androidx.compose.foundation.layout.Arrangement.Vertical
        public void arrange(Density $this$arrange, int totalSize, int[] sizes, int[] outPositions) {
            arrange($this$arrange, totalSize, sizes, LayoutDirection.Ltr, outPositions);
        }

        public String toString() {
            StringBuilder r0 = new StringBuilder();
            if (this.rtlMirror == false) goto L5;
            String r1 = "";
        L7:
            return r0.append(r1).append("Arrangement#spacedAligned(").append(Dp.m6984toStringimpl(this.space)).append(", ").append(this.alignment).append(')').toString();
        L5:
            r1 = "Absolute";
            goto L7
        }
    }

    /* JADX INFO: compiled from: Arrangement.kt */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J$\u0010\u0006\u001a\u00020\u0007*\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\fH&R\u001a\u0010\u0002\u001a\u00020\u00038VX\u0096\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005ø\u0001\u0002\u0082\u0002\u0011\n\u0005\b¡\u001e0\u0001\n\u0002\b!\n\u0004\b!0\u0001¨\u0006\u000eÀ\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/layout/Arrangement$Vertical;", "", "spacing", "Landroidx/compose/ui/unit/Dp;", "getSpacing-D9Ej5fM", "()F", "arrange", "", "Landroidx/compose/ui/unit/Density;", "totalSize", "", "sizes", "", "outPositions", "foundation-layout_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface Vertical {

        /* JADX INFO: compiled from: Arrangement.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class DefaultImpls {
            @Deprecated
            /* JADX INFO: renamed from: getSpacing-D9Ej5fM, reason: not valid java name */
            public static float m622getSpacingD9Ej5fM(Vertical $this) {
                return Vertical.m621access$getSpacingD9Ej5fM$jd($this);
            }
        }

        void arrange(Density r1, int r2, int[] r3, int[] r4);

        /* JADX INFO: renamed from: access$getSpacing-D9Ej5fM$jd, reason: not valid java name */
        static /* synthetic */ float m621access$getSpacingD9Ej5fM$jd(Vertical $this) {
            return super.mo612getSpacingD9Ej5fM();
        }

        /* JADX INFO: renamed from: getSpacing-D9Ej5fM */
        default float mo612getSpacingD9Ej5fM() {
            return Dp.m6973constructorimpl(0);
        }
    }

    public static /* synthetic */ void getBottom$annotations() {
    }

    public static /* synthetic */ void getCenter$annotations() {
    }

    public static /* synthetic */ void getEnd$annotations() {
    }

    public static /* synthetic */ void getSpaceAround$annotations() {
    }

    public static /* synthetic */ void getSpaceBetween$annotations() {
    }

    public static /* synthetic */ void getSpaceEvenly$annotations() {
    }

    public static /* synthetic */ void getStart$annotations() {
    }

    public static /* synthetic */ void getTop$annotations() {
    }

    private Arrangement() {
    }

    public final Horizontal getStart() {
        return Start;
    }

    static {
        INSTANCE = new Arrangement();
        Start = new Arrangement$Start$1();
        End = new Arrangement$End$1();
        Top = new Arrangement$Top$1();
        Bottom = new Arrangement$Bottom$1();
        Center = new Arrangement$Center$1();
        SpaceEvenly = new Arrangement$SpaceEvenly$1();
        SpaceBetween = new Arrangement$SpaceBetween$1();
        SpaceAround = new Arrangement$SpaceAround$1();
    }

    public final Horizontal getEnd() {
        return End;
    }

    public final Vertical getTop() {
        return Top;
    }

    public final Vertical getBottom() {
        return Bottom;
    }

    public final HorizontalOrVertical getCenter() {
        return Center;
    }

    public final HorizontalOrVertical getSpaceEvenly() {
        return SpaceEvenly;
    }

    public final HorizontalOrVertical getSpaceBetween() {
        return SpaceBetween;
    }

    public final HorizontalOrVertical getSpaceAround() {
        return SpaceAround;
    }

    /* JADX INFO: renamed from: spacedBy-0680j_4, reason: not valid java name */
    public final HorizontalOrVertical m606spacedBy0680j_4(float space) {
        boolean r3 = true;
        return new SpacedAligned(space, r3, Arrangement$spacedBy$1.INSTANCE, null);
    }

    /* JADX INFO: renamed from: spacedBy-D5KLDUw, reason: not valid java name */
    public final Horizontal m607spacedByD5KLDUw(float space, final Alignment.Horizontal alignment) {
        boolean r3 = true;
        return new SpacedAligned(space, r3, new Arrangement$spacedBy$2(alignment), null);
    }

    /* JADX INFO: renamed from: spacedBy-D5KLDUw, reason: not valid java name */
    public final Vertical m608spacedByD5KLDUw(float space, final Alignment.Vertical alignment) {
        boolean r3 = false;
        return new SpacedAligned(space, r3, new Arrangement$spacedBy$3(alignment), null);
    }

    public final Horizontal aligned(final Alignment.Horizontal alignment) {
        return new SpacedAligned(Dp.m6973constructorimpl(0), true, new AnonymousClass1(alignment), null);
    }

    public final Vertical aligned(final Alignment.Vertical alignment) {
        return new SpacedAligned(Dp.m6973constructorimpl(0), false, new AnonymousClass2(alignment), null);
    }

    public final void placeRightOrBottom$foundation_layout_release(int totalSize, int[] size, int[] outPosition, boolean reverseInput) {
        int accumulator$iv = 0;
        int r4 = size.length;
        int r5 = 0;
        int r6 = 0;
    L3:
        if (r6 >= r4) goto L5;
        int element$iv = size[r6];
        int a = accumulator$iv;
        accumulator$iv = a + element$iv;
        r6 = r6 + 1;
        goto L3
    L5:
        int current = totalSize - accumulator$iv;
        if (reverseInput == true) goto L11;
        int index$iv$iv = 0;
        int r9 = size.length;
    L8:
        if (r5 >= r9) goto L16;
        int item$iv$iv = size[r5];
        outPosition[index$iv$iv] = current;
        current = current + item$iv$iv;
        r5 = r5 + 1;
        index$iv$iv = index$iv$iv + 1;
        goto L8
    L16:
        return;
    L11:
        int i$iv = size.length;
    L12:
        i$iv = i$iv - 1;
        if ((-1) >= i$iv) goto L20;
        int it = size[i$iv];
        outPosition[i$iv] = current;
        current = current + it;
        goto L12
    }

    public final void placeLeftOrTop$foundation_layout_release(int[] size, int[] outPosition, boolean reverseInput) {
        int current = 0;
        if (reverseInput == true) goto L8;
        int index$iv$iv = 0;
        int r7 = size.length;
        int r8 = 0;
    L5:
        if (r8 >= r7) goto L13;
        int item$iv$iv = size[r8];
        outPosition[index$iv$iv] = current;
        current = current + item$iv$iv;
        r8 = r8 + 1;
        index$iv$iv = index$iv$iv + 1;
        goto L5
    L13:
        return;
    L8:
        int i$iv = size.length;
    L9:
        i$iv = i$iv - 1;
        if ((-1) >= i$iv) goto L16;
        int it = size[i$iv];
        outPosition[i$iv] = current;
        current = current + it;
        goto L9
    }

    public final void placeCenter$foundation_layout_release(int totalSize, int[] size, int[] outPosition, boolean reverseInput) {
        int accumulator$iv = 0;
        int r4 = size.length;
        int r5 = 0;
        int r6 = 0;
    L3:
        if (r6 >= r4) goto L5;
        int element$iv = size[r6];
        int a = accumulator$iv;
        accumulator$iv = a + element$iv;
        r6 = r6 + 1;
        goto L3
    L5:
        float current = (totalSize - accumulator$iv) / 2.0f;
        if (reverseInput == true) goto L11;
        int index$iv$iv = 0;
        int r9 = size.length;
    L8:
        if (r5 >= r9) goto L16;
        int item$iv$iv = size[r5];
        float $this$fastRoundToInt$iv = current;
        outPosition[index$iv$iv] = Math.round($this$fastRoundToInt$iv);
        current = current + item$iv$iv;
        r5 = r5 + 1;
        index$iv$iv = index$iv$iv + 1;
        goto L8
    L16:
        return;
    L11:
        int i$iv = size.length;
    L12:
        i$iv = i$iv - 1;
        if ((-1) >= i$iv) goto L20;
        int it = size[i$iv];
        float $this$fastRoundToInt$iv2 = current;
        outPosition[i$iv] = Math.round($this$fastRoundToInt$iv2);
        current = current + it;
        goto L12
    }

    public final void placeSpaceEvenly$foundation_layout_release(int totalSize, int[] size, int[] outPosition, boolean reverseInput) {
        int accumulator$iv = 0;
        int r4 = size.length;
        int r5 = 0;
        int r6 = 0;
    L3:
        if (r6 >= r4) goto L5;
        int element$iv = size[r6];
        int a = accumulator$iv;
        accumulator$iv = a + element$iv;
        r6 = r6 + 1;
        goto L3
    L5:
        float gapSize = (totalSize - accumulator$iv) / (size.length + 1);
        float current = gapSize;
        if (reverseInput == true) goto L11;
        int index$iv$iv = 0;
        int r11 = size.length;
    L8:
        if (r5 >= r11) goto L16;
        int item$iv$iv = size[r5];
        float $this$fastRoundToInt$iv = current;
        outPosition[index$iv$iv] = Math.round($this$fastRoundToInt$iv);
        float gapSize2 = gapSize;
        current = current + (item$iv$iv + gapSize2);
        r5 = r5 + 1;
        index$iv$iv = index$iv$iv + 1;
        gapSize = gapSize2;
        goto L8
    L16:
        return;
    L11:
        int i$iv = size.length;
    L12:
        i$iv = i$iv - 1;
        if ((-1) >= i$iv) goto L20;
        int it = size[i$iv];
        float $this$fastRoundToInt$iv2 = current;
        outPosition[i$iv] = Math.round($this$fastRoundToInt$iv2);
        current = current + (it + gapSize);
        goto L12
    }

    public final void placeSpaceBetween$foundation_layout_release(int totalSize, int[] size, int[] outPosition, boolean reverseInput) {
        int r2 = 0;
        if (size.length != 0) goto L5;
        boolean r1 = true;
    L6:
        if (r1 == false) goto L8;
        return;
    L8:
        int accumulator$iv = 0;
        int r7 = size.length;
        int r8 = 0;
    L9:
        if (r8 >= r7) goto L11;
        int element$iv = size[r8];
        int a = accumulator$iv;
        accumulator$iv = a + element$iv;
        r8 = r8 + 1;
        goto L9
    L11:
        int noOfGaps = Math.max(ArraysKt.getLastIndex(size), 1);
        float gapSize = (totalSize - accumulator$iv) / noOfGaps;
        float current = 0.0f;
        if (reverseInput == false) goto L17;
        if (size.length != 1) goto L17;
        current = gapSize;
    L17:
        if (reverseInput == true) goto L22;
        int index$iv$iv = 0;
        int r12 = size.length;
    L19:
        if (r2 >= r12) goto L27;
        int item$iv$iv = size[r2];
        float $this$fastRoundToInt$iv = current;
        outPosition[index$iv$iv] = Math.round($this$fastRoundToInt$iv);
        current = current + (item$iv$iv + gapSize);
        r2 = r2 + 1;
        index$iv$iv = index$iv$iv + 1;
        goto L19
    L27:
        return;
    L22:
        int i$iv = size.length - 1;
    L24:
        if ((-1) >= i$iv) goto L31;
        int it = size[i$iv];
        int index = i$iv;
        float $this$fastRoundToInt$iv2 = current;
        outPosition[index] = Math.round($this$fastRoundToInt$iv2);
        current = current + (it + gapSize);
        i$iv = i$iv - 1;
        goto L24
    L31:
        return;
    L5:
        r1 = false;
        goto L6
    }

    public final void placeSpaceAround$foundation_layout_release(int totalSize, int[] size, int[] outPosition, boolean reverseInput) {
        int accumulator$iv = 0;
        int r5 = size.length;
        int r6 = 0;
        int r7 = 0;
    L3:
        if (r7 >= r5) goto L6;
        int element$iv = size[r7];
        int a = accumulator$iv;
        accumulator$iv = a + element$iv;
        r7 = r7 + 1;
        goto L3
    L6:
        if (size.length != 0) goto L8;
        boolean r1 = true;
    L9:
        if (r1 == true) goto L11;
        float gapSize = (totalSize - accumulator$iv) / size.length;
    L12:
        float current = gapSize / 2.0f;
        if (reverseInput == true) goto L18;
        int index$iv$iv = 0;
        int r11 = size.length;
    L15:
        if (r6 >= r11) goto L23;
        int item$iv$iv = size[r6];
        float $this$fastRoundToInt$iv = current;
        outPosition[index$iv$iv] = Math.round($this$fastRoundToInt$iv);
        current = current + (item$iv$iv + gapSize);
        r6 = r6 + 1;
        index$iv$iv = index$iv$iv + 1;
        goto L15
    L23:
        return;
    L18:
        int i$iv = size.length - 1;
    L20:
        if ((-1) >= i$iv) goto L27;
        int it = size[i$iv];
        int index = i$iv;
        float $this$fastRoundToInt$iv2 = current;
        outPosition[index] = Math.round($this$fastRoundToInt$iv2);
        current = current + (it + gapSize);
        i$iv = i$iv - 1;
        goto L20
    L27:
        return;
    L11:
        gapSize = 0.0f;
        goto L12
    L8:
        r1 = false;
        goto L9
    }

    private final void forEachIndexed(int[] $this$forEachIndexed, boolean reversed, Function2<? super Integer, ? super Integer, Unit> r12) {
        if (reversed == true) goto L8;
        int index$iv = 0;
        int r4 = $this$forEachIndexed.length;
        int r5 = 0;
    L5:
        if (r5 >= r4) goto L12;
        int item$iv = $this$forEachIndexed[r5];
        r12.invoke(Integer.valueOf(index$iv), Integer.valueOf(item$iv));
        r5 = r5 + 1;
        index$iv = index$iv + 1;
        goto L5
    L12:
        return;
    L8:
        int i = $this$forEachIndexed.length;
    L9:
        i = i - 1;
        if ((-1) >= i) goto L15;
        r12.invoke(Integer.valueOf(i), Integer.valueOf($this$forEachIndexed[i]));
        goto L9
    }
}
