package androidx.webkit.internal;

import androidx.webkit.WebMessageCompat;
import androidx.webkit.WebMessagePortCompat;
import java.lang.reflect.InvocationHandler;
import java.util.Objects;
import org.chromium.support_lib_boundary.WebMessageBoundaryInterface;
import org.chromium.support_lib_boundary.WebMessagePayloadBoundaryInterface;
import org.chromium.support_lib_boundary.util.BoundaryInterfaceReflectionUtil;

/* JADX INFO: loaded from: classes4.dex */
public class WebMessageAdapter implements WebMessageBoundaryInterface {
    private static final String[] sFeatures = null;
    private final WebMessageCompat mWebMessageCompat;

    static {
        sFeatures = new String[]{"WEB_MESSAGE_ARRAY_BUFFER"};
    }

    public WebMessageAdapter(WebMessageCompat webMessage) {
        this.mWebMessageCompat = webMessage;
    }

    @Override // org.chromium.support_lib_boundary.WebMessageBoundaryInterface
    @Deprecated
    public String getData() {
        return this.mWebMessageCompat.getData();
    }

    @Override // org.chromium.support_lib_boundary.WebMessageBoundaryInterface
    public InvocationHandler getMessagePayload() {
        switch(this.mWebMessageCompat.getType()) {
            case 0: goto L7;
            case 1: goto L6;
            default: goto L5;
        };
    L6:
        WebMessagePayloadAdapter adapter = new WebMessagePayloadAdapter((byte[]) Objects.requireNonNull(this.mWebMessageCompat.getArrayBuffer()));
    L9:
        return BoundaryInterfaceReflectionUtil.createInvocationHandlerFor(adapter);
    L7:
        adapter = new WebMessagePayloadAdapter(this.mWebMessageCompat.getData());
        goto L9
    L5:
        throw new IllegalStateException("Unknown web message payload type: " + this.mWebMessageCompat.getType());
    }

    @Override // org.chromium.support_lib_boundary.WebMessageBoundaryInterface
    public InvocationHandler[] getPorts() {
        WebMessagePortCompat[] ports = this.mWebMessageCompat.getPorts();
        if (ports != null) goto L6;
        return null;
    L6:
        InvocationHandler[] invocationHandlers = new InvocationHandler[ports.length];
        int n = 0;
    L8:
        if (n >= ports.length) goto L10;
        invocationHandlers[n] = ports[n].getInvocationHandler();
        n = n + 1;
        goto L8
    L10:
        return invocationHandlers;
    }

    @Override // org.chromium.support_lib_boundary.FeatureFlagHolderBoundaryInterface
    public String[] getSupportedFeatures() {
        return sFeatures;
    }

    public static boolean isMessagePayloadTypeSupportedByWebView(int type) {
        if (type == 0) goto L11;
        if (type == 1) goto L6;
    L8:
        return false;
    L6:
        if (WebViewFeatureInternal.WEB_MESSAGE_ARRAY_BUFFER.isSupportedByWebView() == false) goto L8;
        return true;
    L11:
        return true;
    }

    public static WebMessageCompat webMessageCompatFromBoundaryInterface(WebMessageBoundaryInterface boundaryInterface) {
        WebMessagePortCompat[] ports = toWebMessagePortCompats(boundaryInterface.getPorts());
        if (WebViewFeatureInternal.WEB_MESSAGE_ARRAY_BUFFER.isSupportedByWebView() == false) goto L13;
        WebMessagePayloadBoundaryInterface payloadInterface = (WebMessagePayloadBoundaryInterface) BoundaryInterfaceReflectionUtil.castToSuppLibClass(WebMessagePayloadBoundaryInterface.class, boundaryInterface.getMessagePayload());
        int type = payloadInterface.getType();
        switch(type) {
            case 0: goto L11;
            case 1: goto L9;
            default: goto L6;
        };
    L6:
        return null;
    L9:
        return new WebMessageCompat(payloadInterface.getAsArrayBuffer(), ports);
    L11:
        return new WebMessageCompat(payloadInterface.getAsString(), ports);
    L13:
        return new WebMessageCompat(boundaryInterface.getData(), ports);
    }

    private static WebMessagePortCompat[] toWebMessagePortCompats(InvocationHandler[] ports) {
        WebMessagePortCompat[] compatPorts = new WebMessagePortCompat[ports.length];
        int n = 0;
    L4:
        if (n >= ports.length) goto L6;
        compatPorts[n] = new WebMessagePortImpl(ports[n]);
        n = n + 1;
        goto L4
    L6:
        return compatPorts;
    }
}
