package androidx.compose.material3.carousel;

import androidx.collection.FloatList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt;

/* JADX INFO: compiled from: Strategy.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0010\b\n\u0002\b\u0002\b\u0000\u0018\u0000 +2\u00020\u0001:\u0001+B/\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005¢\u0006\u0002\u0010\tBK\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00030\u000b\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00030\u000b\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005¢\u0006\u0002\u0010\rJ\u0013\u0010\"\u001a\u00020\u001a2\b\u0010#\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J'\u0010$\u001a\u00020\u00032\u0006\u0010%\u001a\u00020\u00052\u0006\u0010&\u001a\u00020\u00052\b\b\u0002\u0010'\u001a\u00020\u001aH\u0000¢\u0006\u0002\b(J\b\u0010)\u001a\u00020*H\u0016R\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0017\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00030\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u000e\u0010\u0016\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0018X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0019\u001a\u00020\u001a¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001bR\u0011\u0010\u001c\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u000fR\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00030\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0015R\u000e\u0010 \u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010!\u001a\u00020\u0018X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006,"}, d2 = {"Landroidx/compose/material3/carousel/Strategy;", "", "defaultKeylines", "Landroidx/compose/material3/carousel/KeylineList;", "availableSpace", "", "itemSpacing", "beforeContentPadding", "afterContentPadding", "(Landroidx/compose/material3/carousel/KeylineList;FFFF)V", "startKeylineSteps", "", "endKeylineSteps", "(Landroidx/compose/material3/carousel/KeylineList;Ljava/util/List;Ljava/util/List;FFFF)V", "getAfterContentPadding", "()F", "getAvailableSpace", "getBeforeContentPadding", "getDefaultKeylines", "()Landroidx/compose/material3/carousel/KeylineList;", "getEndKeylineSteps", "()Ljava/util/List;", "endShiftDistance", "endShiftPoints", "Landroidx/collection/FloatList;", "isValid", "", "()Z", "itemMainAxisSize", "getItemMainAxisSize", "getItemSpacing", "getStartKeylineSteps", "startShiftDistance", "startShiftPoints", "equals", "other", "getKeylineListForScrollOffset", "scrollOffset", "maxScrollOffset", "roundToNearestStep", "getKeylineListForScrollOffset$material3_release", "hashCode", "", "Companion", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class Strategy {
    public static final int $stable = 0;
    public static final Companion Companion = null;
    private static final Strategy Empty = null;
    private final float afterContentPadding;
    private final float availableSpace;
    private final float beforeContentPadding;
    private final KeylineList defaultKeylines;
    private final List<KeylineList> endKeylineSteps;
    private final float endShiftDistance;
    private final FloatList endShiftPoints;
    private final boolean isValid;
    private final float itemSpacing;
    private final List<KeylineList> startKeylineSteps;
    private final float startShiftDistance;
    private final FloatList startShiftPoints;

    /* JADX INFO: compiled from: Strategy.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Landroidx/compose/material3/carousel/Strategy$Companion;", "", "()V", "Empty", "Landroidx/compose/material3/carousel/Strategy;", "getEmpty", "()Landroidx/compose/material3/carousel/Strategy;", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker r1) {
            this();
        }

        private Companion() {
        }

        public final Strategy getEmpty() {
            return Strategy.access$getEmpty$cp();
        }
    }

    private Strategy(KeylineList defaultKeylines, List<KeylineList> r6, List<KeylineList> r7, float availableSpace, float itemSpacing, float beforeContentPadding, float afterContentPadding) {
        this.defaultKeylines = defaultKeylines;
        this.startKeylineSteps = r6;
        this.endKeylineSteps = r7;
        this.availableSpace = availableSpace;
        this.itemSpacing = itemSpacing;
        this.beforeContentPadding = beforeContentPadding;
        this.afterContentPadding = afterContentPadding;
        this.startShiftDistance = StrategyKt.access$getStartShiftDistance(this.startKeylineSteps, this.beforeContentPadding);
        this.endShiftDistance = StrategyKt.access$getEndShiftDistance(this.endKeylineSteps, this.afterContentPadding);
        boolean r2 = true;
        this.startShiftPoints = StrategyKt.access$getStepInterpolationPoints(this.startShiftDistance, this.startKeylineSteps, true);
        this.endShiftPoints = StrategyKt.access$getStepInterpolationPoints(this.endShiftDistance, this.endKeylineSteps, false);
        if (this.defaultKeylines.isEmpty() == false) goto L5;
    L15:
        r2 = false;
    L16:
        this.isValid = r2;
        return;
    L5:
        if (this.availableSpace != 0.0f) goto L7;
        boolean r0 = true;
    L8:
        if (r0 == true) goto L15;
        if (getItemMainAxisSize() != 0.0f) goto L12;
        boolean r1 = true;
    L13:
        if (r1 == true) goto L15;
    L12:
        r1 = false;
        goto L13
    L7:
        r0 = false;
        goto L8
    }

    public static final /* synthetic */ Strategy access$getEmpty$cp() {
        return Empty;
    }

    public final KeylineList getDefaultKeylines() {
        return this.defaultKeylines;
    }

    public final List<KeylineList> getStartKeylineSteps() {
        return this.startKeylineSteps;
    }

    public final List<KeylineList> getEndKeylineSteps() {
        return this.endKeylineSteps;
    }

    public final float getAvailableSpace() {
        return this.availableSpace;
    }

    public final float getItemSpacing() {
        return this.itemSpacing;
    }

    public final float getBeforeContentPadding() {
        return this.beforeContentPadding;
    }

    public final float getAfterContentPadding() {
        return this.afterContentPadding;
    }

    public Strategy(KeylineList defaultKeylines, float availableSpace, float itemSpacing, float beforeContentPadding, float afterContentPadding) {
        this(defaultKeylines, StrategyKt.access$getStartKeylineSteps(defaultKeylines, availableSpace, itemSpacing, beforeContentPadding), StrategyKt.access$getEndKeylineSteps(defaultKeylines, availableSpace, itemSpacing, afterContentPadding), availableSpace, itemSpacing, beforeContentPadding, afterContentPadding);
    }

    public final float getItemMainAxisSize() {
        return this.defaultKeylines.getFirstFocal().getSize();
    }

    public final boolean isValid() {
        return this.isValid;
    }

    public static /* synthetic */ KeylineList getKeylineListForScrollOffset$material3_release$default(Strategy r0, float r1, float r2, boolean r3, int r4, Object r5) {
        if ((r4 & 4) == 0) goto L6;
        r3 = false;
    L6:
        return r0.getKeylineListForScrollOffset$material3_release(r1, r2, r3);
    }

    public final KeylineList getKeylineListForScrollOffset$material3_release(float scrollOffset, float maxScrollOffset, boolean roundToNearestStep) {
        float positiveScrollOffset = Math.max(0.0f, scrollOffset);
        float startShiftOffset = this.startShiftDistance;
        float endShiftOffset = Math.max(0.0f, maxScrollOffset - this.endShiftDistance);
        boolean r5 = false;
        if (startShiftOffset <= positiveScrollOffset) goto L5;
    L7:
        if (r5 == true) goto L9;
        float interpolation = StrategyKt.access$lerp(1.0f, 0.0f, 0.0f, startShiftOffset, positiveScrollOffset);
        FloatList shiftPoints = this.startShiftPoints;
        List<KeylineList> r7 = this.startKeylineSteps;
        if (positiveScrollOffset <= endShiftOffset) goto L13;
        interpolation = StrategyKt.access$lerp(0.0f, 1.0f, endShiftOffset, maxScrollOffset, positiveScrollOffset);
        shiftPoints = this.endShiftPoints;
        r7 = this.endKeylineSteps;
    L13:
        ShiftPointRange shiftPointRange = StrategyKt.access$getShiftPointRange(r7.size(), shiftPoints, interpolation);
        if (roundToNearestStep == true) goto L16;
        int roundedStepIndex = shiftPointRange.getFromStepIndex();
        return KeylineListKt.lerp(r7.get(roundedStepIndex), r7.get(shiftPointRange.getToStepIndex()), shiftPointRange.getSteppedInterpolation());
    L16:
        if (MathKt.roundToInt(shiftPointRange.getSteppedInterpolation()) != 0) goto L18;
        int roundedStepIndex2 = shiftPointRange.getFromStepIndex();
    L20:
        return r7.get(roundedStepIndex2);
    L18:
        roundedStepIndex2 = shiftPointRange.getToStepIndex();
        goto L20
    L9:
        return this.defaultKeylines;
    L5:
        if (positiveScrollOffset > endShiftOffset) goto L7;
        r5 = true;
        goto L7
    }

    public boolean equals(Object other) {
        if (this != other) goto L6;
        return true;
    L6:
        if ((other instanceof Strategy) == true) goto L9;
        return false;
    L9:
        if (this.isValid == true) goto L14;
        if (((Strategy) other).isValid == true) goto L14;
        return true;
    L14:
        if (this.isValid == ((Strategy) other).isValid) goto L17;
        return false;
    L17:
        if (this.availableSpace != ((Strategy) other).availableSpace) goto L19;
        boolean r1 = true;
    L20:
        if (r1 == true) goto L23;
        return false;
    L23:
        if (this.itemSpacing != ((Strategy) other).itemSpacing) goto L25;
        boolean r2 = true;
    L26:
        if (r2 == true) goto L29;
        return false;
    L29:
        if (this.beforeContentPadding != ((Strategy) other).beforeContentPadding) goto L31;
        boolean r3 = true;
    L32:
        if (r3 == true) goto L35;
        return false;
    L35:
        if (this.afterContentPadding != ((Strategy) other).afterContentPadding) goto L37;
        boolean r4 = true;
    L38:
        if (r4 == true) goto L41;
        return false;
    L41:
        if (getItemMainAxisSize() != ((Strategy) other).getItemMainAxisSize()) goto L43;
        boolean r5 = true;
    L44:
        if (r5 == true) goto L47;
        return false;
    L47:
        if (this.startShiftDistance != ((Strategy) other).startShiftDistance) goto L49;
        boolean r6 = true;
    L50:
        if (r6 == true) goto L53;
        return false;
    L53:
        if (this.endShiftDistance != ((Strategy) other).endShiftDistance) goto L55;
        boolean r7 = true;
    L56:
        if (r7 == true) goto L59;
        return false;
    L59:
        if (Intrinsics.areEqual(this.startShiftPoints, ((Strategy) other).startShiftPoints) == true) goto L62;
        return false;
    L62:
        if (Intrinsics.areEqual(this.endShiftPoints, ((Strategy) other).endShiftPoints) == true) goto L65;
        return false;
    L65:
        if (Intrinsics.areEqual(this.defaultKeylines, ((Strategy) other).defaultKeylines) == true) goto L67;
        return false;
    L67:
        return true;
    L55:
        r7 = false;
        goto L56
    L49:
        r6 = false;
        goto L50
    L43:
        r5 = false;
        goto L44
    L37:
        r4 = false;
        goto L38
    L31:
        r3 = false;
        goto L32
    L25:
        r2 = false;
        goto L26
    L19:
        r1 = false;
        goto L20
    }

    public int hashCode() {
        boolean r0 = this.isValid;
        boolean r1 = this.isValid;
        if (r0 == false) goto L5;
        int result = Boolean.hashCode(r1);
        int result2 = (result * 31) + Float.hashCode(this.availableSpace);
        return (((((((((((((((((result2 * 31) + Float.hashCode(this.itemSpacing)) * 31) + Float.hashCode(this.beforeContentPadding)) * 31) + Float.hashCode(this.afterContentPadding)) * 31) + Float.hashCode(getItemMainAxisSize())) * 31) + Float.hashCode(this.startShiftDistance)) * 31) + Float.hashCode(this.endShiftDistance)) * 31) + this.startShiftPoints.hashCode()) * 31) + this.endShiftPoints.hashCode()) * 31) + this.defaultKeylines.hashCode();
    L5:
        return Boolean.hashCode(r1);
    }

    static {
        Companion = new Companion(null);
        $stable = 8;
        Empty = new Strategy(KeylineListKt.emptyKeylineList(), CollectionsKt.emptyList(), CollectionsKt.emptyList(), 0.0f, 0.0f, 0.0f, 0.0f);
    }
}
