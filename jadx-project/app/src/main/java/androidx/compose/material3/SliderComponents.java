package androidx.compose.material3;

import kotlin.Metadata;

/* JADX INFO: compiled from: Slider.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0082\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Landroidx/compose/material3/SliderComponents;", "", "(Ljava/lang/String;I)V", "THUMB", "TRACK", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
final enum SliderComponents extends Enum<SliderComponents> {
    private static final /* synthetic */ SliderComponents[] $VALUES = null;
    public static final SliderComponents THUMB = null;
    public static final SliderComponents TRACK = null;

    private static final /* synthetic */ SliderComponents[] $values() {
        return new SliderComponents[]{THUMB, TRACK};
    }

    public static SliderComponents valueOf(String r1) {
        return (SliderComponents) Enum.valueOf(SliderComponents.class, r1);
    }

    public static SliderComponents[] values() {
        return (SliderComponents[]) $VALUES.clone();
    }

    private SliderComponents(String $enum$name, int $enum$ordinal) {
        super($enum$name, $enum$ordinal);
    }

    static {
        THUMB = new SliderComponents("THUMB", 0);
        TRACK = new SliderComponents("TRACK", 1);
        $VALUES = $values();
    }
}
