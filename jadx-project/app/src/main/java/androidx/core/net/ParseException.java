package androidx.core.net;

/* JADX INFO: loaded from: classes4.dex */
public class ParseException extends RuntimeException {
    public final String response;

    ParseException(String response) {
        super(response);
        this.response = response;
    }
}
