package androidx.webkit.internal;

import java.util.Objects;
import org.chromium.support_lib_boundary.WebMessagePayloadBoundaryInterface;

/* JADX INFO: loaded from: classes4.dex */
public class WebMessagePayloadAdapter implements WebMessagePayloadBoundaryInterface {
    private final byte[] mArrayBuffer;
    private final String mString;
    private final int mType;

    public WebMessagePayloadAdapter(String data) {
        this.mType = 0;
        this.mString = data;
        this.mArrayBuffer = null;
    }

    public WebMessagePayloadAdapter(byte[] arrayBuffer) {
        this.mType = 1;
        this.mString = null;
        this.mArrayBuffer = arrayBuffer;
    }

    @Override // org.chromium.support_lib_boundary.FeatureFlagHolderBoundaryInterface
    public String[] getSupportedFeatures() {
        return new String[0];
    }

    @Override // org.chromium.support_lib_boundary.WebMessagePayloadBoundaryInterface
    public int getType() {
        return this.mType;
    }

    @Override // org.chromium.support_lib_boundary.WebMessagePayloadBoundaryInterface
    public String getAsString() {
        checkType(0);
        return this.mString;
    }

    @Override // org.chromium.support_lib_boundary.WebMessagePayloadBoundaryInterface
    public byte[] getAsArrayBuffer() {
        checkType(1);
        return (byte[]) Objects.requireNonNull(this.mArrayBuffer);
    }

    private void checkType(int expectedType) {
        if (this.mType != expectedType) goto L6;
        return;
    L6:
        throw new IllegalStateException("Expected " + expectedType + ", but type is " + this.mType);
    }
}
