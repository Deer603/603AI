package androidx.core.service.quicksettings;

import android.app.PendingIntent;
import android.content.Intent;
import android.os.Build;
import android.service.quicksettings.TileService;

/* JADX INFO: loaded from: classes4.dex */
public class TileServiceCompat {
    private static TileServiceWrapper sTileServiceWrapper;

    private static class Api24Impl {
        private Api24Impl() {
        }

        static void startActivityAndCollapse(TileService service, Intent intent) {
            service.startActivityAndCollapse(intent);
        }
    }

    private static class Api34Impl {
        private Api34Impl() {
        }

        static void startActivityAndCollapse(TileService service, PendingIntent pendingIntent) {
            service.startActivityAndCollapse(pendingIntent);
        }
    }

    interface TileServiceWrapper {
        void startActivityAndCollapse(PendingIntent r1);

        void startActivityAndCollapse(Intent r1);
    }

    public static void startActivityAndCollapse(TileService tileService, PendingIntentActivityWrapper wrapper) {
        if (Build.VERSION.SDK_INT < 34) goto L9;
        if (sTileServiceWrapper == null) goto L7;
        sTileServiceWrapper.startActivityAndCollapse(wrapper.getPendingIntent());
        return;
    L7:
        Api34Impl.startActivityAndCollapse(tileService, wrapper.getPendingIntent());
        return;
    L9:
        if (sTileServiceWrapper == null) goto L11;
        sTileServiceWrapper.startActivityAndCollapse(wrapper.getIntent());
        return;
    L11:
        Api24Impl.startActivityAndCollapse(tileService, wrapper.getIntent());
    }

    public static void setTileServiceWrapper(TileServiceWrapper serviceWrapper) {
        sTileServiceWrapper = serviceWrapper;
    }

    public static void clearTileServiceWrapper() {
        sTileServiceWrapper = null;
    }

    private TileServiceCompat() {
    }
}
