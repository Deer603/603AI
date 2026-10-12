package androidx.compose.ui.layout;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX INFO: compiled from: Layout.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Landroidx/compose/ui/layout/IntrinsicWidthHeight;", "", "(Ljava/lang/String;I)V", "Width", "Height", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final enum IntrinsicWidthHeight extends Enum<IntrinsicWidthHeight> {
    private static final /* synthetic */ EnumEntries $ENTRIES = null;
    private static final /* synthetic */ IntrinsicWidthHeight[] $VALUES = null;
    public static final IntrinsicWidthHeight Height = null;
    public static final IntrinsicWidthHeight Width = null;

    private static final /* synthetic */ IntrinsicWidthHeight[] $values() {
        return new IntrinsicWidthHeight[]{Width, Height};
    }

    public static EnumEntries<IntrinsicWidthHeight> getEntries() {
        return $ENTRIES;
    }

    public static IntrinsicWidthHeight valueOf(String r1) {
        return (IntrinsicWidthHeight) Enum.valueOf(IntrinsicWidthHeight.class, r1);
    }

    public static IntrinsicWidthHeight[] values() {
        return (IntrinsicWidthHeight[]) $VALUES.clone();
    }

    private IntrinsicWidthHeight(String $enum$name, int $enum$ordinal) {
        super($enum$name, $enum$ordinal);
    }

    static {
        Width = new IntrinsicWidthHeight("Width", 0);
        Height = new IntrinsicWidthHeight("Height", 1);
        $VALUES = $values();
        $ENTRIES = EnumEntriesKt.enumEntries($VALUES);
    }
}
