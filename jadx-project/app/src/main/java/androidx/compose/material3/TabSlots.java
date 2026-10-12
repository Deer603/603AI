package androidx.compose.material3;

import kotlin.Metadata;

/* JADX INFO: compiled from: TabRow.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0082\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Landroidx/compose/material3/TabSlots;", "", "(Ljava/lang/String;I)V", "Tabs", "Divider", "Indicator", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
final enum TabSlots extends Enum<TabSlots> {
    private static final /* synthetic */ TabSlots[] $VALUES = null;
    public static final TabSlots Divider = null;
    public static final TabSlots Indicator = null;
    public static final TabSlots Tabs = null;

    private static final /* synthetic */ TabSlots[] $values() {
        return new TabSlots[]{Tabs, Divider, Indicator};
    }

    public static TabSlots valueOf(String r1) {
        return (TabSlots) Enum.valueOf(TabSlots.class, r1);
    }

    public static TabSlots[] values() {
        return (TabSlots[]) $VALUES.clone();
    }

    private TabSlots(String $enum$name, int $enum$ordinal) {
        super($enum$name, $enum$ordinal);
    }

    static {
        Tabs = new TabSlots("Tabs", 0);
        Divider = new TabSlots("Divider", 1);
        Indicator = new TabSlots("Indicator", 2);
        $VALUES = $values();
    }
}
