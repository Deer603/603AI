package androidx.compose.material3;

import androidx.compose.foundation.shape.CornerBasedShape;
import androidx.compose.material3.tokens.ShapeTokens;
import kotlin.Metadata;

/* JADX INFO: compiled from: Shapes.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0011\u0010\u0007\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0006R\u0011\u0010\t\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u0006R\u0011\u0010\u000b\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u0006R\u0011\u0010\r\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u0006¨\u0006\u000f"}, d2 = {"Landroidx/compose/material3/ShapeDefaults;", "", "()V", "ExtraLarge", "Landroidx/compose/foundation/shape/CornerBasedShape;", "getExtraLarge", "()Landroidx/compose/foundation/shape/CornerBasedShape;", "ExtraSmall", "getExtraSmall", "Large", "getLarge", "Medium", "getMedium", "Small", "getSmall", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class ShapeDefaults {
    public static final int $stable = 0;
    private static final CornerBasedShape ExtraLarge = null;
    private static final CornerBasedShape ExtraSmall = null;
    public static final ShapeDefaults INSTANCE = null;
    private static final CornerBasedShape Large = null;
    private static final CornerBasedShape Medium = null;
    private static final CornerBasedShape Small = null;

    private ShapeDefaults() {
    }

    static {
        INSTANCE = new ShapeDefaults();
        ExtraSmall = ShapeTokens.INSTANCE.getCornerExtraSmall();
        Small = ShapeTokens.INSTANCE.getCornerSmall();
        Medium = ShapeTokens.INSTANCE.getCornerMedium();
        Large = ShapeTokens.INSTANCE.getCornerLarge();
        ExtraLarge = ShapeTokens.INSTANCE.getCornerExtraLarge();
    }

    public final CornerBasedShape getExtraSmall() {
        return ExtraSmall;
    }

    public final CornerBasedShape getSmall() {
        return Small;
    }

    public final CornerBasedShape getMedium() {
        return Medium;
    }

    public final CornerBasedShape getLarge() {
        return Large;
    }

    public final CornerBasedShape getExtraLarge() {
        return ExtraLarge;
    }
}
