package androidx.compose.ui.unit.fontscaling;

import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: FontScaleConverterTable.android.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0014\n\u0002\b\u000b\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0007\u0018\u0000 \u001b2\u00020\u0001:\u0001\u001bB\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016J\u0010\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u000fH\u0016J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0096\u0002J\b\u0010\u0017\u001a\u00020\u0018H\u0016J\b\u0010\u0019\u001a\u00020\u001aH\u0016R\u001c\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR\u001c\u0010\u000b\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\f\u0010\b\u001a\u0004\b\r\u0010\n¨\u0006\u001c"}, d2 = {"Landroidx/compose/ui/unit/fontscaling/FontScaleConverterTable;", "Landroidx/compose/ui/unit/fontscaling/FontScaleConverter;", "fromSp", "", "toDp", "([F[F)V", "mFromSpValues", "getMFromSpValues$annotations", "()V", "getMFromSpValues", "()[F", "mToDpValues", "getMToDpValues$annotations", "getMToDpValues", "convertDpToSp", "", "dp", "convertSpToDp", "sp", "equals", "", "other", "", "hashCode", "", "toString", "", "Companion", "ui-unit_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class FontScaleConverterTable implements FontScaleConverter {
    public static final int $stable = 0;
    public static final Companion Companion = null;
    private final float[] mFromSpValues;
    private final float[] mToDpValues;

    /* JADX INFO: compiled from: FontScaleConverterTable.android.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u0014\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J \u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007H\u0002¨\u0006\t"}, d2 = {"Landroidx/compose/ui/unit/fontscaling/FontScaleConverterTable$Companion;", "", "()V", "lookupAndInterpolate", "", "sourceValue", "sourceValues", "", "targetValues", "ui-unit_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker r1) {
            this();
        }

        private Companion() {
        }

        public static final /* synthetic */ float access$lookupAndInterpolate(Companion $this, float sourceValue, float[] sourceValues, float[] targetValues) {
            return $this.lookupAndInterpolate(sourceValue, sourceValues, targetValues);
        }

        private final float lookupAndInterpolate(float sourceValue, float[] sourceValues, float[] targetValues) {
            float sourceValuePositive = Math.abs(sourceValue);
            float sign = Math.signum(sourceValue);
            int index = Arrays.binarySearch(sourceValues, sourceValuePositive);
            if (index >= 0) goto L21;
            boolean r1 = true;
            int lowerIndex = (-(index + 1)) - 1;
            if (lowerIndex < (sourceValues.length - 1)) goto L16;
            float startSp = sourceValues[sourceValues.length - 1];
            float startDp = targetValues[sourceValues.length - 1];
            if (startSp == 0.0f) goto L11;
            r1 = false;
        L11:
            if (r1 == false) goto L13;
            return 0.0f;
        L13:
            float scalingFactor = startDp / startSp;
            return sourceValue * scalingFactor;
        L16:
            if (lowerIndex != (-1)) goto L18;
            float startDp2 = 0.0f;
            float endSp = sourceValues[0];
            float endDp = endSp;
            float endSp2 = targetValues[0];
            float startSp2 = 0.0f;
        L20:
            return MathUtils.INSTANCE.constrainedMap(startDp2, endSp2, startSp2, endDp, sourceValuePositive) * sign;
        L18:
            float startSp3 = sourceValues[lowerIndex];
            float endSp3 = sourceValues[lowerIndex + 1];
            startDp2 = targetValues[lowerIndex];
            endDp = endSp3;
            endSp2 = targetValues[lowerIndex + 1];
            startSp2 = startSp3;
            goto L20
        L21:
            return targetValues[index] * sign;
        }
    }

    static {
        Companion = new Companion(null);
        $stable = 8;
    }

    public static /* synthetic */ void getMFromSpValues$annotations() {
    }

    public static /* synthetic */ void getMToDpValues$annotations() {
    }

    public FontScaleConverterTable(float[] fromSp, float[] toDp) {
        boolean r2 = false;
        if (fromSp.length == toDp.length) goto L5;
    L10:
        if (r2 == false) goto L14;
        this.mFromSpValues = fromSp;
        this.mToDpValues = toDp;
        return;
    L14:
        throw new IllegalArgumentException("Array lengths must match and be nonzero".toString());
    L5:
        if (fromSp.length != 0) goto L7;
        boolean r0 = true;
    L8:
        if (r0 == true) goto L10;
        r2 = true;
        goto L10
    L7:
        r0 = false;
        goto L8
    }

    public final float[] getMFromSpValues() {
        return this.mFromSpValues;
    }

    public final float[] getMToDpValues() {
        return this.mToDpValues;
    }

    @Override // androidx.compose.ui.unit.fontscaling.FontScaleConverter
    public float convertDpToSp(float dp) {
        return Companion.access$lookupAndInterpolate(Companion, dp, this.mToDpValues, this.mFromSpValues);
    }

    @Override // androidx.compose.ui.unit.fontscaling.FontScaleConverter
    public float convertSpToDp(float sp) {
        return Companion.access$lookupAndInterpolate(Companion, sp, this.mFromSpValues, this.mToDpValues);
    }

    public boolean equals(Object other) {
        if (this != other) goto L6;
        return true;
    L6:
        if (other != null) goto L9;
        return false;
    L9:
        if ((other instanceof FontScaleConverterTable) == true) goto L12;
        return false;
    L12:
        if (Arrays.equals(this.mFromSpValues, ((FontScaleConverterTable) other).mFromSpValues) == false) goto L17;
        if (Arrays.equals(this.mToDpValues, ((FontScaleConverterTable) other).mToDpValues) == false) goto L17;
        return true;
    L17:
        return false;
    }

    public int hashCode() {
        int result = Arrays.hashCode(this.mFromSpValues);
        return (result * 31) + Arrays.hashCode(this.mToDpValues);
    }

    public String toString() {
        StringBuilder r0 = new StringBuilder().append("FontScaleConverter{fromSpValues=");
        String r1 = Arrays.toString(this.mFromSpValues);
        Intrinsics.checkNotNullExpressionValue(r1, "toString(...)");
        StringBuilder r2 = r0.append(r1).append(", toDpValues=");
        String r3 = Arrays.toString(this.mToDpValues);
        Intrinsics.checkNotNullExpressionValue(r3, "toString(...)");
        return r2.append(r3).append('}').toString();
    }
}
