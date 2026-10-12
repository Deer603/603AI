package androidx.core.hardware.fingerprint;

import android.content.Context;
import android.hardware.fingerprint.FingerprintManager;
import android.os.CancellationSignal;
import android.os.Handler;
import java.security.Signature;
import javax.crypto.Cipher;
import javax.crypto.Mac;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public class FingerprintManagerCompat {
    private final Context mContext;

    static class Api23Impl {
        private Api23Impl() {
        }

        static boolean hasEnrolledFingerprints(Object fingerprintManager) {
            return ((FingerprintManager) fingerprintManager).hasEnrolledFingerprints();
        }

        static boolean isHardwareDetected(Object fingerprintManager) {
            return ((FingerprintManager) fingerprintManager).isHardwareDetected();
        }

        static void authenticate(Object fingerprintManager, Object crypto, CancellationSignal cancel, int flags, Object callback, Handler handler) {
            ((FingerprintManager) fingerprintManager).authenticate((FingerprintManager.CryptoObject) crypto, cancel, flags, (FingerprintManager.AuthenticationCallback) callback, handler);
        }

        static FingerprintManager.CryptoObject getCryptoObject(Object authenticationResult) {
            return ((FingerprintManager.AuthenticationResult) authenticationResult).getCryptoObject();
        }

        public static FingerprintManager getFingerprintManagerOrNull(Context context) {
            if (context.getPackageManager().hasSystemFeature("android.hardware.fingerprint") == true) goto L5;
            return null;
        L5:
            return (FingerprintManager) context.getSystemService(FingerprintManager.class);
        }

        public static FingerprintManager.CryptoObject wrapCryptoObject(CryptoObject cryptoObject) {
            if (cryptoObject != null) goto L6;
            return null;
        L6:
            if (cryptoObject.getCipher() == null) goto L10;
            return new FingerprintManager.CryptoObject(cryptoObject.getCipher());
        L10:
            if (cryptoObject.getSignature() == null) goto L14;
            return new FingerprintManager.CryptoObject(cryptoObject.getSignature());
        L14:
            if (cryptoObject.getMac() != null) goto L16;
            return null;
        L16:
            return new FingerprintManager.CryptoObject(cryptoObject.getMac());
        }

        public static CryptoObject unwrapCryptoObject(Object cryptoObjectObj) {
            FingerprintManager.CryptoObject cryptoObject = (FingerprintManager.CryptoObject) cryptoObjectObj;
            if (cryptoObject != null) goto L6;
            return null;
        L6:
            if (cryptoObject.getCipher() == null) goto L10;
            return new CryptoObject(cryptoObject.getCipher());
        L10:
            if (cryptoObject.getSignature() == null) goto L14;
            return new CryptoObject(cryptoObject.getSignature());
        L14:
            if (cryptoObject.getMac() != null) goto L16;
            return null;
        L16:
            return new CryptoObject(cryptoObject.getMac());
        }
    }

    public static abstract class AuthenticationCallback {
        public AuthenticationCallback() {
        }

        public void onAuthenticationError(int errMsgId, CharSequence errString) {
        }

        public void onAuthenticationHelp(int helpMsgId, CharSequence helpString) {
        }

        public void onAuthenticationSucceeded(AuthenticationResult result) {
        }

        public void onAuthenticationFailed() {
        }
    }

    public static final class AuthenticationResult {
        private final CryptoObject mCryptoObject;

        public AuthenticationResult(CryptoObject crypto) {
            this.mCryptoObject = crypto;
        }

        public CryptoObject getCryptoObject() {
            return this.mCryptoObject;
        }
    }

    public static class CryptoObject {
        private final Cipher mCipher;
        private final Mac mMac;
        private final Signature mSignature;

        public CryptoObject(Signature signature) {
            this.mSignature = signature;
            this.mCipher = null;
            this.mMac = null;
        }

        public CryptoObject(Cipher cipher) {
            this.mCipher = cipher;
            this.mSignature = null;
            this.mMac = null;
        }

        public CryptoObject(Mac mac) {
            this.mMac = mac;
            this.mCipher = null;
            this.mSignature = null;
        }

        public Signature getSignature() {
            return this.mSignature;
        }

        public Cipher getCipher() {
            return this.mCipher;
        }

        public Mac getMac() {
            return this.mMac;
        }
    }

    public static FingerprintManagerCompat from(Context context) {
        return new FingerprintManagerCompat(context);
    }

    private FingerprintManagerCompat(Context context) {
        this.mContext = context;
    }

    public boolean hasEnrolledFingerprints() {
        FingerprintManager fp = getFingerprintManagerOrNull(this.mContext);
        if (fp != null) goto L5;
    L7:
        return false;
    L5:
        if (Api23Impl.hasEnrolledFingerprints(fp) == false) goto L7;
        return true;
    }

    public boolean isHardwareDetected() {
        FingerprintManager fp = getFingerprintManagerOrNull(this.mContext);
        if (fp != null) goto L5;
    L7:
        return false;
    L5:
        if (Api23Impl.isHardwareDetected(fp) == false) goto L7;
        return true;
    }

    @Deprecated
    public void authenticate(CryptoObject crypto, int flags, androidx.core.os.CancellationSignal cancel, AuthenticationCallback callback, Handler handler) {
        if (cancel == null) goto L4;
        CancellationSignal r0 = (CancellationSignal) cancel.getCancellationSignalObject();
    L5:
        authenticate(crypto, flags, r0, callback, handler);
        return;
    L4:
        r0 = null;
        goto L5
    }

    public void authenticate(CryptoObject crypto, int flags, CancellationSignal cancel, AuthenticationCallback callback, Handler handler) {
        FingerprintManager fp = getFingerprintManagerOrNull(this.mContext);
        if (fp == null) goto L6;
        Api23Impl.authenticate(fp, wrapCryptoObject(crypto), cancel, flags, wrapCallback(callback), handler);
        return;
    }

    private static FingerprintManager getFingerprintManagerOrNull(Context context) {
        return Api23Impl.getFingerprintManagerOrNull(context);
    }

    private static FingerprintManager.CryptoObject wrapCryptoObject(CryptoObject cryptoObject) {
        return Api23Impl.wrapCryptoObject(cryptoObject);
    }

    static CryptoObject unwrapCryptoObject(FingerprintManager.CryptoObject cryptoObject) {
        return Api23Impl.unwrapCryptoObject(cryptoObject);
    }

    private static FingerprintManager.AuthenticationCallback wrapCallback(final AuthenticationCallback callback) {
        return new AnonymousClass1(callback);
    }
}
