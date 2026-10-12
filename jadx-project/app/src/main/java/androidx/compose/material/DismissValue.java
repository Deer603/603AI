package androidx.compose.material;

import androidx.webkit.Profile;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX INFO: compiled from: SwipeToDismiss.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Landroidx/compose/material/DismissValue;", "", "(Ljava/lang/String;I)V", Profile.DEFAULT_PROFILE_NAME, "DismissedToEnd", "DismissedToStart", "material_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final enum DismissValue extends Enum<DismissValue> {
    private static final /* synthetic */ EnumEntries $ENTRIES = null;
    private static final /* synthetic */ DismissValue[] $VALUES = null;
    public static final DismissValue Default = null;
    public static final DismissValue DismissedToEnd = null;
    public static final DismissValue DismissedToStart = null;

    private static final /* synthetic */ DismissValue[] $values() {
        return new DismissValue[]{Default, DismissedToEnd, DismissedToStart};
    }

    public static EnumEntries<DismissValue> getEntries() {
        return $ENTRIES;
    }

    public static DismissValue valueOf(String r1) {
        return (DismissValue) Enum.valueOf(DismissValue.class, r1);
    }

    public static DismissValue[] values() {
        return (DismissValue[]) $VALUES.clone();
    }

    private DismissValue(String $enum$name, int $enum$ordinal) {
        super($enum$name, $enum$ordinal);
    }

    static {
        Default = new DismissValue(Profile.DEFAULT_PROFILE_NAME, 0);
        DismissedToEnd = new DismissValue("DismissedToEnd", 1);
        DismissedToStart = new DismissValue("DismissedToStart", 2);
        $VALUES = $values();
        $ENTRIES = EnumEntriesKt.enumEntries($VALUES);
    }
}
