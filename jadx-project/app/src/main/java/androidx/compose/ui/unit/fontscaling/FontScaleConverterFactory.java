package androidx.compose.ui.unit.fontscaling;

import androidx.collection.SparseArrayCompat;
import androidx.compose.ui.unit.InlineClassHelperKt;
import kotlin.Metadata;
import kotlin.Unit;

/* JADX INFO: compiled from: FontScaleConverterFactory.android.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0014\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J \u0010\u0013\u001a\u00020\r2\u0006\u0010\u0014\u001a\u00020\r2\u0006\u0010\u0015\u001a\u00020\r2\u0006\u0010\u0016\u001a\u00020\tH\u0002J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0018\u001a\u00020\tH\u0007J\u0013\u0010\u0019\u001a\u0004\u0018\u00010\r2\u0006\u0010\u001a\u001a\u00020\tH\u0082\u0002J\u0010\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u0018\u001a\u00020\tH\u0002J\u0010\u0010\u001d\u001a\u00020\t2\u0006\u0010\u001e\u001a\u00020\u001cH\u0002J\u0010\u0010\u001f\u001a\u00020 2\u0006\u0010\u0018\u001a\u00020\tH\u0007J\u0018\u0010!\u001a\u00020\"2\u0006\u0010\u001a\u001a\u00020\t2\u0006\u0010#\u001a\u00020\rH\u0002J&\u0010$\u001a\u00020\"2\f\u0010%\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u001a\u001a\u00020\t2\u0006\u0010#\u001a\u00020\rH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0018\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0006X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0007R\u000e\u0010\b\u001a\u00020\tX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\tX\u0082T¢\u0006\u0002\n\u0000R*\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f8\u0006@\u0006X\u0087\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b\u000e\u0010\u0002\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012¨\u0006&"}, d2 = {"Landroidx/compose/ui/unit/fontscaling/FontScaleConverterFactory;", "", "()V", "CommonFontSizes", "", "LookupTablesWriteLock", "", "[Ljava/lang/Object;", "MinScaleForNonLinear", "", "ScaleKeyMultiplier", "sLookupTables", "Landroidx/collection/SparseArrayCompat;", "Landroidx/compose/ui/unit/fontscaling/FontScaleConverter;", "getSLookupTables$annotations", "getSLookupTables", "()Landroidx/collection/SparseArrayCompat;", "setSLookupTables", "(Landroidx/collection/SparseArrayCompat;)V", "createInterpolatedTableBetween", "start", "end", "interpolationPoint", "forScale", "fontScale", "get", "scaleKey", "getKey", "", "getScaleFromKey", "key", "isNonLinearFontScalingActive", "", "put", "", "fontScaleConverter", "putInto", "table", "ui-unit_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class FontScaleConverterFactory {
    public static final int $stable = 0;
    private static final float[] CommonFontSizes = null;
    public static final FontScaleConverterFactory INSTANCE = null;
    private static final Object[] LookupTablesWriteLock = null;
    private static final float MinScaleForNonLinear = 1.03f;
    private static final float ScaleKeyMultiplier = 100.0f;
    private static volatile SparseArrayCompat<FontScaleConverter> sLookupTables;

    public static /* synthetic */ void getSLookupTables$annotations() {
    }

    private FontScaleConverterFactory() {
    }

    static {
        INSTANCE = new FontScaleConverterFactory();
        CommonFontSizes = new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, ScaleKeyMultiplier};
        int r3 = 0;
        sLookupTables = new SparseArrayCompat(r3, 1, null);
        LookupTablesWriteLock = new Object[0];
        Object[] r1 = LookupTablesWriteLock;
        monitor-enter(r1);
        INSTANCE.putInto(sLookupTables, 1.15f, new FontScaleConverterTable(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, ScaleKeyMultiplier}, new float[]{9.2f, 11.5f, 13.8f, 16.4f, 19.8f, 21.8f, 25.2f, 30.0f, ScaleKeyMultiplier}));     // Catch: Throwable -> L15
        INSTANCE.putInto(sLookupTables, 1.3f, new FontScaleConverterTable(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, ScaleKeyMultiplier}, new float[]{10.4f, 13.0f, 15.6f, 18.8f, 21.6f, 23.6f, 26.4f, 30.0f, ScaleKeyMultiplier}));     // Catch: Throwable -> L15
        INSTANCE.putInto(sLookupTables, 1.5f, new FontScaleConverterTable(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, ScaleKeyMultiplier}, new float[]{12.0f, 15.0f, 18.0f, 22.0f, 24.0f, 26.0f, 28.0f, 30.0f, ScaleKeyMultiplier}));     // Catch: Throwable -> L15
        INSTANCE.putInto(sLookupTables, 1.8f, new FontScaleConverterTable(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, ScaleKeyMultiplier}, new float[]{14.4f, 18.0f, 21.6f, 24.4f, 27.6f, 30.8f, 32.8f, 34.8f, ScaleKeyMultiplier}));     // Catch: Throwable -> L15
        INSTANCE.putInto(sLookupTables, 2.0f, new FontScaleConverterTable(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, ScaleKeyMultiplier}, new float[]{16.0f, 20.0f, 24.0f, 26.0f, 30.0f, 34.0f, 36.0f, 38.0f, ScaleKeyMultiplier}));     // Catch: Throwable -> L15
        Unit r0 = Unit.INSTANCE;     // Catch: Throwable -> L15
        monitor-exit(r1);
        float minScaleBeforeCurvesApplied = INSTANCE.getScaleFromKey(sLookupTables.keyAt(0)) - 0.01f;
        if (minScaleBeforeCurvesApplied <= MinScaleForNonLinear) goto L11;
        r3 = 1;
    L11:
        if (r3 != 0) goto L13;
        InlineClassHelperKt.throwIllegalStateException("You should only apply non-linear scaling to font scales > 1");
    L13:
        $stable = 8;
        return;
    L15:
        th = move-exception;
        throw th;
    }

    public final SparseArrayCompat<FontScaleConverter> getSLookupTables() {
        return sLookupTables;
    }

    public final void setSLookupTables(SparseArrayCompat<FontScaleConverter> r1) {
        sLookupTables = r1;
    }

    public final boolean isNonLinearFontScalingActive(float fontScale) {
        if (fontScale < MinScaleForNonLinear) goto L5;
        return true;
    L5:
        return false;
    }

    public final FontScaleConverter forScale(float fontScale) {
        if (isNonLinearFontScalingActive(fontScale) == true) goto L6;
        return null;
    L6:
        FontScaleConverter lookupTable = INSTANCE.get(fontScale);
        if (lookupTable == null) goto L9;
        return lookupTable;
    L9:
        int index = sLookupTables.indexOfKey(getKey(fontScale));
        if (index >= 0) goto L12;
        int lowerIndex = (-(index + 1)) - 1;
        int higherIndex = lowerIndex + 1;
        if (higherIndex < sLookupTables.size()) goto L17;
        FontScaleConverter converter = new FontScaleConverterTable(new float[]{1.0f}, new float[]{fontScale});
        put(fontScale, converter);
        FontScaleConverter startTable = converter;
        return startTable;
    L17:
        if (lowerIndex >= 0) goto L19;
        FontScaleConverter startTable2 = new FontScaleConverterTable(CommonFontSizes, CommonFontSizes);
        FontScaleConverter startTable3 = startTable2;
        float startScale = 1.0f;
    L20:
        float endScale = getScaleFromKey(sLookupTables.keyAt(higherIndex));
        float interpolationPoint = MathUtils.INSTANCE.constrainedMap(0.0f, 1.0f, startScale, endScale, fontScale);
        FontScaleConverter converter2 = createInterpolatedTableBetween(startTable3, sLookupTables.valueAt(higherIndex), interpolationPoint);
        put(fontScale, converter2);
        return converter2;
    L19:
        float startScale2 = getScaleFromKey(sLookupTables.keyAt(lowerIndex));
        FontScaleConverter startTable4 = sLookupTables.valueAt(lowerIndex);
        startTable3 = startTable4;
        startScale = startScale2;
        goto L20
    L12:
        return sLookupTables.valueAt(index);
    }

    private final FontScaleConverter createInterpolatedTableBetween(FontScaleConverter start, FontScaleConverter end, float interpolationPoint) {
        float[] dpInterpolated = new float[CommonFontSizes.length];
        int i = 0;
        int r2 = CommonFontSizes.length;
    L3:
        if (i >= r2) goto L6;
        float sp = CommonFontSizes[i];
        float startDp = start.convertSpToDp(sp);
        float endDp = end.convertSpToDp(sp);
        dpInterpolated[i] = MathUtils.INSTANCE.lerp(startDp, endDp, interpolationPoint);
        i = i + 1;
        goto L3
    L6:
        return new FontScaleConverterTable(CommonFontSizes, dpInterpolated);
    }

    private final int getKey(float fontScale) {
        return (int) (ScaleKeyMultiplier * fontScale);
    }

    private final float getScaleFromKey(int key) {
        return key / ScaleKeyMultiplier;
    }

    private final void put(float scaleKey, FontScaleConverter fontScaleConverter) {
        Object[] r0 = LookupTablesWriteLock;
        monitor-enter(r0);
        SparseArrayCompat<FontScaleConverter> r2 = sLookupTables.clone();     // Catch: Throwable -> L8
        INSTANCE.putInto(r2, scaleKey, fontScaleConverter);     // Catch: Throwable -> L8
        sLookupTables = r2;     // Catch: Throwable -> L8
        Unit r1 = Unit.INSTANCE;     // Catch: Throwable -> L8
        monitor-exit(r0);
        return;
    L8:
        th = move-exception;
        throw th;
    }

    private final void putInto(SparseArrayCompat<FontScaleConverter> r2, float scaleKey, FontScaleConverter fontScaleConverter) {
        r2.put(getKey(scaleKey), fontScaleConverter);
    }

    private final FontScaleConverter get(float scaleKey) {
        return sLookupTables.get(getKey(scaleKey));
    }
}
