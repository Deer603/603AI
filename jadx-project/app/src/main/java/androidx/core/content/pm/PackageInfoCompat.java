package androidx.core.content.pm;

import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.content.pm.SigningInfo;
import android.os.Build;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
public final class PackageInfoCompat {

    private static class Api28Impl {
        private Api28Impl() {
        }

        static boolean hasSigningCertificate(PackageManager packageManager, String packageName, byte[] bytes, int type) {
            return packageManager.hasSigningCertificate(packageName, bytes, type);
        }

        static boolean hasMultipleSigners(SigningInfo signingInfo) {
            return signingInfo.hasMultipleSigners();
        }

        static Signature[] getApkContentsSigners(SigningInfo signingInfo) {
            return signingInfo.getApkContentsSigners();
        }

        static Signature[] getSigningCertificateHistory(SigningInfo signingInfo) {
            return signingInfo.getSigningCertificateHistory();
        }

        static long getLongVersionCode(PackageInfo packageInfo) {
            return packageInfo.getLongVersionCode();
        }
    }

    public static long getLongVersionCode(PackageInfo info) {
        if (Build.VERSION.SDK_INT < 28) goto L7;
        return Api28Impl.getLongVersionCode(info);
    L7:
        return info.versionCode;
    }

    public static List<Signature> getSignatures(PackageManager packageManager, String packageName) throws PackageManager.NameNotFoundException {
        if (Build.VERSION.SDK_INT < 28) goto L9;
        PackageInfo pkgInfo = packageManager.getPackageInfo(packageName, 134217728);
        SigningInfo signingInfo = pkgInfo.signingInfo;
        if (Api28Impl.hasMultipleSigners(signingInfo) == false) goto L7;
        Signature[] array = Api28Impl.getApkContentsSigners(signingInfo);
    L10:
        if (array != null) goto L14;
        return Collections.emptyList();
    L14:
        return Arrays.asList(array);
    L7:
        array = Api28Impl.getSigningCertificateHistory(signingInfo);
        goto L10
    L9:
        PackageInfo pkgInfo2 = packageManager.getPackageInfo(packageName, 64);
        array = pkgInfo2.signatures;
        goto L10
    }

    public static boolean hasSignatures(PackageManager packageManager, String packageName, Map<byte[], Integer> certificatesAndType, boolean matchExact) throws PackageManager.NameNotFoundException {
        if (certificatesAndType.isEmpty() == false) goto L5;
        return false;
    L5:
        Set<byte[]> expectedCertBytes = certificatesAndType.keySet();
        Iterator<byte[]> r2 = expectedCertBytes.iterator();
    L7:
        if (r2.hasNext() == false) goto L21;
        byte[] bytes = r2.next();
        if (bytes == null) goto L20;
        Integer type = certificatesAndType.get(bytes);
        if (type == null) goto L18;
        switch(type.intValue()) {
            case 0: goto L7;
            case 1: goto L7;
            default: goto L15;
        };
    L15:
        throw new IllegalArgumentException("Unsupported certificate type " + type + " when verifying " + packageName);
    L18:
        throw new IllegalArgumentException("Type must be specified for cert when verifying " + packageName);
    L20:
        throw new IllegalArgumentException("Cert byte array cannot be null when verifying " + packageName);
    L21:
        List<Signature> signers = getSignatures(packageManager, packageName);
        if (matchExact == true) goto L34;
        if (Build.VERSION.SDK_INT < 28) goto L34;
        Iterator<byte[]> r4 = expectedCertBytes.iterator();
    L27:
        if (r4.hasNext() == false) goto L32;
        byte[] bytes2 = r4.next();
        if (Api28Impl.hasSigningCertificate(packageManager, packageName, bytes2, certificatesAndType.get(bytes2).intValue()) == true) goto L27;
        return false;
    L32:
        return true;
    L34:
        if (signers.size() != 0) goto L36;
    L61:
        return false;
    L36:
        if (certificatesAndType.size() > signers.size()) goto L61;
        if (matchExact == true) goto L39;
    L41:
        boolean hasSha256 = certificatesAndType.containsValue(1);
        byte[][] sha256Digests = null;
        if (hasSha256 == false) goto L47;
        sha256Digests = new byte[signers.size()][];
        int index = 0;
    L45:
        if (index >= signers.size()) goto L47;
        sha256Digests[index] = computeSHA256Digest(signers.get(index).toByteArray());
        index = index + 1;
    L47:
        Iterator<byte[]> r7 = expectedCertBytes.iterator();
        if (r7.hasNext() == false) goto L60;
        byte[] bytes3 = r7.next();
        Integer type2 = certificatesAndType.get(bytes3);
        switch(type2.intValue()) {
            case 0: goto L56;
            case 1: goto L54;
            default: goto L52;
        };
    L56:
        Signature expectedSignature = new Signature(bytes3);
        if (signers.contains(expectedSignature) == true) goto L59;
        return false;
    L59:
        return true;
    L52:
        throw new IllegalArgumentException("Unsupported certificate type " + type2);
    L54:
        if (byteArrayContains(sha256Digests, bytes3) == true) goto L59;
        return false;
    L60:
        return false;
    L39:
        if (certificatesAndType.size() == signers.size()) goto L41;
        goto L41
    }

    private static boolean byteArrayContains(byte[][] array, byte[] expected) {
        int r0 = array.length;
        int r2 = 0;
    L3:
        if (r2 >= r0) goto L9;
        byte[] item = array[r2];
        if (Arrays.equals(expected, item) == true) goto L6;
        r2 = r2 + 1;
        goto L3
    L6:
        return true;
    L9:
        return false;
    }

    private static byte[] computeSHA256Digest(byte[] bytes) {
        return MessageDigest.getInstance("SHA256").digest(bytes);
    L4:
        e = move-exception;
        throw new RuntimeException("Device doesn't support SHA256 cert checking", e);
    }

    private PackageInfoCompat() {
    }
}
