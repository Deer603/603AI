package androidx.webkit;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
public class WebMessageCompat {
    public static final int TYPE_ARRAY_BUFFER = 1;
    public static final int TYPE_STRING = 0;
    private final byte[] mArrayBuffer;
    private final WebMessagePortCompat[] mPorts;
    private final String mString;
    private final int mType;

    @Retention(RetentionPolicy.SOURCE)
    public @interface Type {
    }

    public WebMessageCompat(String data) {
        this(data, null);
    }

    public WebMessageCompat(String data, WebMessagePortCompat[] ports) {
        this.mString = data;
        this.mArrayBuffer = null;
        this.mPorts = ports;
        this.mType = 0;
    }

    public WebMessageCompat(byte[] arrayBuffer) {
        this(arrayBuffer, null);
    }

    public WebMessageCompat(byte[] arrayBuffer, WebMessagePortCompat[] ports) {
        Objects.requireNonNull(arrayBuffer);
        this.mArrayBuffer = arrayBuffer;
        this.mString = null;
        this.mPorts = ports;
        this.mType = 1;
    }

    public int getType() {
        return this.mType;
    }

    public byte[] getArrayBuffer() {
        checkType(1);
        Objects.requireNonNull(this.mArrayBuffer);
        return this.mArrayBuffer;
    }

    public String getData() {
        checkType(0);
        return this.mString;
    }

    public WebMessagePortCompat[] getPorts() {
        return this.mPorts;
    }

    private String typeToString(int type) {
        switch(type) {
            case 0: goto L7;
            case 1: goto L5;
            default: goto L3;
        };
    L3:
        return "Unknown";
    L5:
        return "ArrayBuffer";
    L7:
        return "String";
    }

    private void checkType(int typeForGetter) {
        if (typeForGetter != this.mType) goto L6;
        return;
    L6:
        throw new IllegalStateException("Wrong data accessor type detected. " + typeToString(this.mType) + " expected, but got " + typeToString(typeForGetter));
    }
}
