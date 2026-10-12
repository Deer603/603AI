package androidx.compose.material;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX INFO: compiled from: BackdropScaffold.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Landroidx/compose/material/BackdropValue;", "", "(Ljava/lang/String;I)V", "Concealed", "Revealed", "material_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final enum BackdropValue extends Enum<BackdropValue> {
    private static final /* synthetic */ EnumEntries $ENTRIES = null;
    private static final /* synthetic */ BackdropValue[] $VALUES = null;
    public static final BackdropValue Concealed = null;
    public static final BackdropValue Revealed = null;

    private static final /* synthetic */ BackdropValue[] $values() {
        return new BackdropValue[]{Concealed, Revealed};
    }

    public static EnumEntries<BackdropValue> getEntries() {
        return $ENTRIES;
    }

    public static BackdropValue valueOf(String r1) {
        return (BackdropValue) Enum.valueOf(BackdropValue.class, r1);
    }

    public static BackdropValue[] values() {
        return (BackdropValue[]) $VALUES.clone();
    }

    private BackdropValue(String $enum$name, int $enum$ordinal) {
        super($enum$name, $enum$ordinal);
    }

    static {
        Concealed = new BackdropValue("Concealed", 0);
        Revealed = new BackdropValue("Revealed", 1);
        $VALUES = $values();
        $ENTRIES = EnumEntriesKt.enumEntries($VALUES);
    }
}
