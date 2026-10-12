package androidx.compose.foundation.text.input.internal;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX INFO: compiled from: TransformedTextFieldState.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Landroidx/compose/foundation/text/input/internal/WedgeAffinity;", "", "(Ljava/lang/String;I)V", "Start", "End", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final enum WedgeAffinity extends Enum<WedgeAffinity> {
    private static final /* synthetic */ EnumEntries $ENTRIES = null;
    private static final /* synthetic */ WedgeAffinity[] $VALUES = null;
    public static final WedgeAffinity End = null;
    public static final WedgeAffinity Start = null;

    private static final /* synthetic */ WedgeAffinity[] $values() {
        return new WedgeAffinity[]{Start, End};
    }

    public static EnumEntries<WedgeAffinity> getEntries() {
        return $ENTRIES;
    }

    public static WedgeAffinity valueOf(String r1) {
        return (WedgeAffinity) Enum.valueOf(WedgeAffinity.class, r1);
    }

    public static WedgeAffinity[] values() {
        return (WedgeAffinity[]) $VALUES.clone();
    }

    private WedgeAffinity(String $enum$name, int $enum$ordinal) {
        super($enum$name, $enum$ordinal);
    }

    static {
        Start = new WedgeAffinity("Start", 0);
        End = new WedgeAffinity("End", 1);
        $VALUES = $values();
        $ENTRIES = EnumEntriesKt.enumEntries($VALUES);
    }
}
