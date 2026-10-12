package androidx.compose.ui.contentcapture;

import kotlin.Metadata;

/* JADX INFO: compiled from: ContentCaptureManager.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\bw\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002\u0082\u0001\u0001\u0003ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0004À\u0006\u0001"}, d2 = {"Landroidx/compose/ui/contentcapture/ContentCaptureManager;", "", "Companion", "Landroidx/compose/ui/contentcapture/AndroidContentCaptureManager;", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public interface ContentCaptureManager {
    public static final Companion Companion = null;

    /* JADX INFO: compiled from: ContentCaptureManager.android.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R,\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00048G@GX\u0087\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b\u0006\u0010\u0002\u001a\u0004\b\u0005\u0010\u0007\"\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Landroidx/compose/ui/contentcapture/ContentCaptureManager$Companion;", "", "()V", "<set-?>", "", "isEnabled", "isEnabled$annotations", "()Z", "setEnabled", "(Z)V", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = null;
        private static boolean isEnabled;

        public static /* synthetic */ void isEnabled$annotations() {
        }

        private Companion() {
        }

        static {
            $$INSTANCE = new Companion();
            isEnabled = true;
        }

        public final boolean isEnabled() {
            return isEnabled;
        }

        public final void setEnabled(boolean r1) {
            isEnabled = r1;
        }
    }

    static {
        Companion = Companion.$$INSTANCE;
    }
}
