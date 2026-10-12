package androidx.compose.foundation.layout;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX INFO: compiled from: RowColumnImpl.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Landroidx/compose/foundation/layout/LayoutOrientation;", "", "(Ljava/lang/String;I)V", "Horizontal", "Vertical", "foundation-layout_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final enum LayoutOrientation extends Enum<LayoutOrientation> {
    private static final /* synthetic */ EnumEntries $ENTRIES = null;
    private static final /* synthetic */ LayoutOrientation[] $VALUES = null;
    public static final LayoutOrientation Horizontal = null;
    public static final LayoutOrientation Vertical = null;

    private static final /* synthetic */ LayoutOrientation[] $values() {
        return new LayoutOrientation[]{Horizontal, Vertical};
    }

    public static EnumEntries<LayoutOrientation> getEntries() {
        return $ENTRIES;
    }

    public static LayoutOrientation valueOf(String r1) {
        return (LayoutOrientation) Enum.valueOf(LayoutOrientation.class, r1);
    }

    public static LayoutOrientation[] values() {
        return (LayoutOrientation[]) $VALUES.clone();
    }

    private LayoutOrientation(String $enum$name, int $enum$ordinal) {
        super($enum$name, $enum$ordinal);
    }

    static {
        Horizontal = new LayoutOrientation("Horizontal", 0);
        Vertical = new LayoutOrientation("Vertical", 1);
        $VALUES = $values();
        $ENTRIES = EnumEntriesKt.enumEntries($VALUES);
    }
}
