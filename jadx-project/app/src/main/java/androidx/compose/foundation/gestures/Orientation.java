package androidx.compose.foundation.gestures;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX INFO: compiled from: Orientation.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Landroidx/compose/foundation/gestures/Orientation;", "", "(Ljava/lang/String;I)V", "Vertical", "Horizontal", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final enum Orientation extends Enum<Orientation> {
    private static final /* synthetic */ EnumEntries $ENTRIES = null;
    private static final /* synthetic */ Orientation[] $VALUES = null;
    public static final Orientation Horizontal = null;
    public static final Orientation Vertical = null;

    private static final /* synthetic */ Orientation[] $values() {
        return new Orientation[]{Vertical, Horizontal};
    }

    public static EnumEntries<Orientation> getEntries() {
        return $ENTRIES;
    }

    public static Orientation valueOf(String r1) {
        return (Orientation) Enum.valueOf(Orientation.class, r1);
    }

    public static Orientation[] values() {
        return (Orientation[]) $VALUES.clone();
    }

    private Orientation(String $enum$name, int $enum$ordinal) {
        super($enum$name, $enum$ordinal);
    }

    static {
        Vertical = new Orientation("Vertical", 0);
        Horizontal = new Orientation("Horizontal", 1);
        $VALUES = $values();
        $ENTRIES = EnumEntriesKt.enumEntries($VALUES);
    }
}
