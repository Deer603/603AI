package com.luchime.huiyuan;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX INFO: compiled from: HuiyuanEngine.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/luchime/huiyuan/EnginePersona;", "", "<init>", "(Ljava/lang/String;I)V", "HUIYUAN", "PIAO", "GUIGUI", "TANGO", "app"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final enum EnginePersona extends Enum<EnginePersona> {
    private static final /* synthetic */ EnumEntries $ENTRIES = null;
    private static final /* synthetic */ EnginePersona[] $VALUES = null;
    public static final EnginePersona GUIGUI = null;
    public static final EnginePersona HUIYUAN = null;
    public static final EnginePersona PIAO = null;
    public static final EnginePersona TANGO = null;

    private static final /* synthetic */ EnginePersona[] $values() {
        return new EnginePersona[]{HUIYUAN, PIAO, GUIGUI, TANGO};
    }

    public static EnumEntries<EnginePersona> getEntries() {
        return $ENTRIES;
    }

    public static EnginePersona valueOf(String r1) {
        return (EnginePersona) Enum.valueOf(EnginePersona.class, r1);
    }

    public static EnginePersona[] values() {
        return (EnginePersona[]) $VALUES.clone();
    }

    static {
        HUIYUAN = new EnginePersona("HUIYUAN", 0);
        PIAO = new EnginePersona("PIAO", 1);
        GUIGUI = new EnginePersona("GUIGUI", 2);
        TANGO = new EnginePersona("TANGO", 3);
        $VALUES = $values();
        $ENTRIES = EnumEntriesKt.enumEntries($VALUES);
    }

    private EnginePersona(String $enum$name, int $enum$ordinal) {
        super($enum$name, $enum$ordinal);
    }
}
