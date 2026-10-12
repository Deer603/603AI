package androidx.compose.material3;

import kotlin.Metadata;

/* JADX INFO: compiled from: Slider.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0082\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Landroidx/compose/material3/RangeSliderComponents;", "", "(Ljava/lang/String;I)V", "ENDTHUMB", "STARTTHUMB", "TRACK", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
final enum RangeSliderComponents extends Enum<RangeSliderComponents> {
    private static final /* synthetic */ RangeSliderComponents[] $VALUES = null;
    public static final RangeSliderComponents ENDTHUMB = null;
    public static final RangeSliderComponents STARTTHUMB = null;
    public static final RangeSliderComponents TRACK = null;

    private static final /* synthetic */ RangeSliderComponents[] $values() {
        return new RangeSliderComponents[]{ENDTHUMB, STARTTHUMB, TRACK};
    }

    public static RangeSliderComponents valueOf(String r1) {
        return (RangeSliderComponents) Enum.valueOf(RangeSliderComponents.class, r1);
    }

    public static RangeSliderComponents[] values() {
        return (RangeSliderComponents[]) $VALUES.clone();
    }

    private RangeSliderComponents(String $enum$name, int $enum$ordinal) {
        super($enum$name, $enum$ordinal);
    }

    static {
        ENDTHUMB = new RangeSliderComponents("ENDTHUMB", 0);
        STARTTHUMB = new RangeSliderComponents("STARTTHUMB", 1);
        TRACK = new RangeSliderComponents("TRACK", 2);
        $VALUES = $values();
    }
}
