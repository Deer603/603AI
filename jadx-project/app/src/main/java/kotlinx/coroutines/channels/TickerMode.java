package kotlinx.coroutines.channels;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX INFO: compiled from: TickerChannels.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lkotlinx/coroutines/channels/TickerMode;", "", "(Ljava/lang/String;I)V", "FIXED_PERIOD", "FIXED_DELAY", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final enum TickerMode extends Enum<TickerMode> {
    private static final /* synthetic */ EnumEntries $ENTRIES = null;
    private static final /* synthetic */ TickerMode[] $VALUES = null;
    public static final TickerMode FIXED_DELAY = null;
    public static final TickerMode FIXED_PERIOD = null;

    private static final /* synthetic */ TickerMode[] $values() {
        return new TickerMode[]{FIXED_PERIOD, FIXED_DELAY};
    }

    public static EnumEntries<TickerMode> getEntries() {
        return $ENTRIES;
    }

    public static TickerMode valueOf(String r1) {
        return (TickerMode) Enum.valueOf(TickerMode.class, r1);
    }

    public static TickerMode[] values() {
        return (TickerMode[]) $VALUES.clone();
    }

    private TickerMode(String $enum$name, int $enum$ordinal) {
        super($enum$name, $enum$ordinal);
    }

    static {
        FIXED_PERIOD = new TickerMode("FIXED_PERIOD", 0);
        FIXED_DELAY = new TickerMode("FIXED_DELAY", 1);
        $VALUES = $values();
        $ENTRIES = EnumEntriesKt.enumEntries($VALUES);
    }
}
