package com.luchime.huiyuan.ui;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX INFO: compiled from: AppHaptics.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\t\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lcom/luchime/huiyuan/ui/HapticCue;", "", "<init>", "(Ljava/lang/String;I)V", "TAP", "SELECTION", "CONFIRM", "DESTRUCTIVE", "STREAM_TICK", "STREAM_COMPLETE", "app"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final enum HapticCue extends Enum<HapticCue> {
    private static final /* synthetic */ EnumEntries $ENTRIES = null;
    private static final /* synthetic */ HapticCue[] $VALUES = null;
    public static final HapticCue CONFIRM = null;
    public static final HapticCue DESTRUCTIVE = null;
    public static final HapticCue SELECTION = null;
    public static final HapticCue STREAM_COMPLETE = null;
    public static final HapticCue STREAM_TICK = null;
    public static final HapticCue TAP = null;

    private static final /* synthetic */ HapticCue[] $values() {
        return new HapticCue[]{TAP, SELECTION, CONFIRM, DESTRUCTIVE, STREAM_TICK, STREAM_COMPLETE};
    }

    public static EnumEntries<HapticCue> getEntries() {
        return $ENTRIES;
    }

    public static HapticCue valueOf(String r1) {
        return (HapticCue) Enum.valueOf(HapticCue.class, r1);
    }

    public static HapticCue[] values() {
        return (HapticCue[]) $VALUES.clone();
    }

    private HapticCue(String $enum$name, int $enum$ordinal) {
        super($enum$name, $enum$ordinal);
    }

    static {
        TAP = new HapticCue("TAP", 0);
        SELECTION = new HapticCue("SELECTION", 1);
        CONFIRM = new HapticCue("CONFIRM", 2);
        DESTRUCTIVE = new HapticCue("DESTRUCTIVE", 3);
        STREAM_TICK = new HapticCue("STREAM_TICK", 4);
        STREAM_COMPLETE = new HapticCue("STREAM_COMPLETE", 5);
        $VALUES = $values();
        $ENTRIES = EnumEntriesKt.enumEntries($VALUES);
    }
}
