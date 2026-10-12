package androidx.webkit;

/* JADX INFO: loaded from: classes4.dex */
public class PrefetchNetworkException extends PrefetchException {
    public static final int NO_HTTP_RESPONSE_STATUS_CODE = 0;
    public final int httpResponseStatusCode;

    public PrefetchNetworkException(String error) {
        this(error, 0);
    }

    public PrefetchNetworkException(String error, int httpResponseStatusCode) {
        super(error);
        this.httpResponseStatusCode = httpResponseStatusCode;
    }

    public PrefetchNetworkException(int httpResponseStatusCode) {
        this.httpResponseStatusCode = httpResponseStatusCode;
    }

    public PrefetchNetworkException() {
        this(0);
    }
}
