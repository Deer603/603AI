package androidx.webkit;

import android.os.Handler;
import android.webkit.WebMessagePort;
import java.lang.reflect.InvocationHandler;

/* JADX INFO: loaded from: classes4.dex */
public abstract class WebMessagePortCompat {

    public static abstract class WebMessageCallbackCompat {
        public WebMessageCallbackCompat() {
        }

        public void onMessage(WebMessagePortCompat port, WebMessageCompat message) {
        }
    }

    public abstract void close();

    public abstract WebMessagePort getFrameworkPort();

    public abstract InvocationHandler getInvocationHandler();

    public abstract void postMessage(WebMessageCompat r1);

    public abstract void setWebMessageCallback(Handler r1, WebMessageCallbackCompat r2);

    public abstract void setWebMessageCallback(WebMessageCallbackCompat r1);

    public WebMessagePortCompat() {
    }
}
