package androidx.compose.material3;

import kotlin.Metadata;

/* JADX INFO: compiled from: NavigationDrawer.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Landroidx/compose/material3/DrawerValue;", "", "(Ljava/lang/String;I)V", "Closed", "Open", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final enum DrawerValue extends Enum<DrawerValue> {
    private static final /* synthetic */ DrawerValue[] $VALUES = null;
    public static final DrawerValue Closed = null;
    public static final DrawerValue Open = null;

    private static final /* synthetic */ DrawerValue[] $values() {
        return new DrawerValue[]{Closed, Open};
    }

    public static DrawerValue valueOf(String r1) {
        return (DrawerValue) Enum.valueOf(DrawerValue.class, r1);
    }

    public static DrawerValue[] values() {
        return (DrawerValue[]) $VALUES.clone();
    }

    private DrawerValue(String $enum$name, int $enum$ordinal) {
        super($enum$name, $enum$ordinal);
    }

    static {
        Closed = new DrawerValue("Closed", 0);
        Open = new DrawerValue("Open", 1);
        $VALUES = $values();
    }
}
