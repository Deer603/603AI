package androidx.compose.material3.tokens;

import kotlin.Metadata;

/* JADX INFO: compiled from: ShapeKeyTokens.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\r\b\u0080\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000e"}, d2 = {"Landroidx/compose/material3/tokens/ShapeKeyTokens;", "", "(Ljava/lang/String;I)V", "CornerExtraLarge", "CornerExtraLargeTop", "CornerExtraSmall", "CornerExtraSmallTop", "CornerFull", "CornerLarge", "CornerLargeEnd", "CornerLargeTop", "CornerMedium", "CornerNone", "CornerSmall", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final enum ShapeKeyTokens extends Enum<ShapeKeyTokens> {
    private static final /* synthetic */ ShapeKeyTokens[] $VALUES = null;
    public static final ShapeKeyTokens CornerExtraLarge = null;
    public static final ShapeKeyTokens CornerExtraLargeTop = null;
    public static final ShapeKeyTokens CornerExtraSmall = null;
    public static final ShapeKeyTokens CornerExtraSmallTop = null;
    public static final ShapeKeyTokens CornerFull = null;
    public static final ShapeKeyTokens CornerLarge = null;
    public static final ShapeKeyTokens CornerLargeEnd = null;
    public static final ShapeKeyTokens CornerLargeTop = null;
    public static final ShapeKeyTokens CornerMedium = null;
    public static final ShapeKeyTokens CornerNone = null;
    public static final ShapeKeyTokens CornerSmall = null;

    private static final /* synthetic */ ShapeKeyTokens[] $values() {
        return new ShapeKeyTokens[]{CornerExtraLarge, CornerExtraLargeTop, CornerExtraSmall, CornerExtraSmallTop, CornerFull, CornerLarge, CornerLargeEnd, CornerLargeTop, CornerMedium, CornerNone, CornerSmall};
    }

    public static ShapeKeyTokens valueOf(String r1) {
        return (ShapeKeyTokens) Enum.valueOf(ShapeKeyTokens.class, r1);
    }

    public static ShapeKeyTokens[] values() {
        return (ShapeKeyTokens[]) $VALUES.clone();
    }

    private ShapeKeyTokens(String $enum$name, int $enum$ordinal) {
        super($enum$name, $enum$ordinal);
    }

    static {
        CornerExtraLarge = new ShapeKeyTokens("CornerExtraLarge", 0);
        CornerExtraLargeTop = new ShapeKeyTokens("CornerExtraLargeTop", 1);
        CornerExtraSmall = new ShapeKeyTokens("CornerExtraSmall", 2);
        CornerExtraSmallTop = new ShapeKeyTokens("CornerExtraSmallTop", 3);
        CornerFull = new ShapeKeyTokens("CornerFull", 4);
        CornerLarge = new ShapeKeyTokens("CornerLarge", 5);
        CornerLargeEnd = new ShapeKeyTokens("CornerLargeEnd", 6);
        CornerLargeTop = new ShapeKeyTokens("CornerLargeTop", 7);
        CornerMedium = new ShapeKeyTokens("CornerMedium", 8);
        CornerNone = new ShapeKeyTokens("CornerNone", 9);
        CornerSmall = new ShapeKeyTokens("CornerSmall", 10);
        $VALUES = $values();
    }
}
