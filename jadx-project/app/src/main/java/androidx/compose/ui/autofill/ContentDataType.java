package androidx.compose.ui.autofill;

import kotlin.Metadata;

/* JADX INFO: compiled from: ContentDataType.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\bv\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002\u0082\u0001\u0001\u0003ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0004À\u0006\u0001"}, d2 = {"Landroidx/compose/ui/autofill/ContentDataType;", "", "Companion", "Landroidx/compose/ui/autofill/AndroidContentDataType;", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public interface ContentDataType {
    public static final Companion Companion = null;

    /* JADX INFO: compiled from: ContentDataType.android.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0011\u0010\u0007\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0006R\u0011\u0010\t\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u0006R\u0011\u0010\u000b\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u0006R\u0011\u0010\r\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u0006¨\u0006\u000f"}, d2 = {"Landroidx/compose/ui/autofill/ContentDataType$Companion;", "", "()V", "Date", "Landroidx/compose/ui/autofill/ContentDataType;", "getDate", "()Landroidx/compose/ui/autofill/ContentDataType;", "List", "getList", "None", "getNone", "Text", "getText", "Toggle", "getToggle", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = null;
        private static final ContentDataType Date = null;
        private static final ContentDataType List = null;
        private static final ContentDataType None = null;
        private static final ContentDataType Text = null;
        private static final ContentDataType Toggle = null;

        private Companion() {
        }

        static {
            $$INSTANCE = new Companion();
            None = ContentDataType_androidKt.ContentDataType(0);
            Text = ContentDataType_androidKt.ContentDataType(1);
            List = ContentDataType_androidKt.ContentDataType(3);
            Date = ContentDataType_androidKt.ContentDataType(4);
            Toggle = ContentDataType_androidKt.ContentDataType(2);
        }

        public final ContentDataType getNone() {
            return None;
        }

        public final ContentDataType getText() {
            return Text;
        }

        public final ContentDataType getList() {
            return List;
        }

        public final ContentDataType getDate() {
            return Date;
        }

        public final ContentDataType getToggle() {
            return Toggle;
        }
    }

    static {
        Companion = Companion.$$INSTANCE;
    }
}
