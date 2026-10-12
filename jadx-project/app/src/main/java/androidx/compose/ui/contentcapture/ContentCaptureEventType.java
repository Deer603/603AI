package androidx.compose.ui.contentcapture;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX INFO: compiled from: AndroidContentCaptureManager.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0082\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Landroidx/compose/ui/contentcapture/ContentCaptureEventType;", "", "(Ljava/lang/String;I)V", "VIEW_APPEAR", "VIEW_DISAPPEAR", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
final enum ContentCaptureEventType extends Enum<ContentCaptureEventType> {
    private static final /* synthetic */ EnumEntries $ENTRIES = null;
    private static final /* synthetic */ ContentCaptureEventType[] $VALUES = null;
    public static final ContentCaptureEventType VIEW_APPEAR = null;
    public static final ContentCaptureEventType VIEW_DISAPPEAR = null;

    private static final /* synthetic */ ContentCaptureEventType[] $values() {
        return new ContentCaptureEventType[]{VIEW_APPEAR, VIEW_DISAPPEAR};
    }

    public static EnumEntries<ContentCaptureEventType> getEntries() {
        return $ENTRIES;
    }

    public static ContentCaptureEventType valueOf(String r1) {
        return (ContentCaptureEventType) Enum.valueOf(ContentCaptureEventType.class, r1);
    }

    public static ContentCaptureEventType[] values() {
        return (ContentCaptureEventType[]) $VALUES.clone();
    }

    private ContentCaptureEventType(String $enum$name, int $enum$ordinal) {
        super($enum$name, $enum$ordinal);
    }

    static {
        VIEW_APPEAR = new ContentCaptureEventType("VIEW_APPEAR", 0);
        VIEW_DISAPPEAR = new ContentCaptureEventType("VIEW_DISAPPEAR", 1);
        $VALUES = $values();
        $ENTRIES = EnumEntriesKt.enumEntries($VALUES);
    }
}
