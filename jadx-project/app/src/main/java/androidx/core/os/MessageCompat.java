package androidx.core.os;

import android.os.Message;

/* JADX INFO: loaded from: classes4.dex */
public final class MessageCompat {
    private static boolean sTryIsAsynchronous;
    private static boolean sTrySetAsynchronous;

    static class Api22Impl {
        private Api22Impl() {
        }

        static boolean isAsynchronous(Message message) {
            return message.isAsynchronous();
        }

        static void setAsynchronous(Message message, boolean async) {
            message.setAsynchronous(async);
        }
    }

    static {
        sTrySetAsynchronous = true;
        sTryIsAsynchronous = true;
    }

    public static void setAsynchronous(Message message, boolean async) {
        Api22Impl.setAsynchronous(message, async);
    }

    public static boolean isAsynchronous(Message message) {
        return Api22Impl.isAsynchronous(message);
    }

    private MessageCompat() {
    }
}
