package androidx.compose.ui.graphics.vector;

import kotlin.Metadata;

/* JADX INFO: compiled from: VectorPainter.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J)\u0010\u0002\u001a\u0002H\u0003\"\u0004\b\u0000\u0010\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u0002H\u00030\u00052\u0006\u0010\u0006\u001a\u0002H\u0003H\u0016¢\u0006\u0002\u0010\u0007ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\bÀ\u0006\u0003"}, d2 = {"Landroidx/compose/ui/graphics/vector/VectorConfig;", "", "getOrDefault", "T", "property", "Landroidx/compose/ui/graphics/vector/VectorProperty;", "defaultValue", "(Landroidx/compose/ui/graphics/vector/VectorProperty;Ljava/lang/Object;)Ljava/lang/Object;", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public interface VectorConfig {

    /* JADX INFO: compiled from: VectorPainter.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class DefaultImpls {
        @Deprecated
        public static <T> T getOrDefault(VectorConfig r1, VectorProperty<T> r2, T r3) {
            return (T) VectorConfig.access$getOrDefault$jd(r1, r2, r3);
        }
    }

    static /* synthetic */ Object access$getOrDefault$jd(VectorConfig $this, VectorProperty property, Object defaultValue) {
        return super.getOrDefault(property, defaultValue);
    }

    default <T> T getOrDefault(VectorProperty<T> r1, T r2) {
        return r2;
    }
}
