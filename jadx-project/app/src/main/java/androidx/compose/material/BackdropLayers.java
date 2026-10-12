package androidx.compose.material;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX INFO: compiled from: BackdropScaffold.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0082\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Landroidx/compose/material/BackdropLayers;", "", "(Ljava/lang/String;I)V", "Back", "Front", "material_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
final enum BackdropLayers extends Enum<BackdropLayers> {
    private static final /* synthetic */ EnumEntries $ENTRIES = null;
    private static final /* synthetic */ BackdropLayers[] $VALUES = null;
    public static final BackdropLayers Back = null;
    public static final BackdropLayers Front = null;

    private static final /* synthetic */ BackdropLayers[] $values() {
        return new BackdropLayers[]{Back, Front};
    }

    public static EnumEntries<BackdropLayers> getEntries() {
        return $ENTRIES;
    }

    public static BackdropLayers valueOf(String r1) {
        return (BackdropLayers) Enum.valueOf(BackdropLayers.class, r1);
    }

    public static BackdropLayers[] values() {
        return (BackdropLayers[]) $VALUES.clone();
    }

    private BackdropLayers(String $enum$name, int $enum$ordinal) {
        super($enum$name, $enum$ordinal);
    }

    static {
        Back = new BackdropLayers("Back", 0);
        Front = new BackdropLayers("Front", 1);
        $VALUES = $values();
        $ENTRIES = EnumEntriesKt.enumEntries($VALUES);
    }
}
