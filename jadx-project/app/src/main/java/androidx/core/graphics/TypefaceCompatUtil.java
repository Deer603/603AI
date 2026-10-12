package androidx.core.graphics;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.Resources;
import android.net.Uri;
import android.os.CancellationSignal;
import android.os.ParcelFileDescriptor;
import android.os.Process;
import android.os.StrictMode;
import android.util.Log;
import androidx.core.provider.FontsContractCompat;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public class TypefaceCompatUtil {
    private static final String CACHE_FILE_PREFIX = ".font";
    private static final String TAG = "TypefaceCompatUtil";

    private TypefaceCompatUtil() {
    }

    public static File getTempFile(Context context) {
        File cacheDir = context.getCacheDir();
        if (cacheDir != null) goto L5;
        return null;
    L5:
        String prefix = CACHE_FILE_PREFIX + Process.myPid() + "-" + Process.myTid() + "-";
        int i = 0;
    L7:
        if (i >= 100) goto L15;
        File file = new File(cacheDir, prefix + i);
        if (file.createNewFile() == false) goto L14;
        return file;
    L14:
        i = i + 1;
        goto L7
    L15:
        return null;
    }

    private static ByteBuffer mmap(File file) {
        FileInputStream fis = new FileInputStream(file);     // Catch: IOException -> L14
        FileChannel channel = fis.getChannel();     // Catch: Throwable -> L7
        long size = channel.size();     // Catch: Throwable -> L7
        MappedByteBuffer r0 = channel.map(FileChannel.MapMode.READ_ONLY, 0, size);     // Catch: Throwable -> L7
        fis.close();     // Catch: IOException -> L14
        return r0;
    L7:
        th = move-exception;
        fis.close();     // Catch: Throwable -> L11
        goto L15
    L22:
        throw th;     // Catch: IOException -> L14
    L11:
        th = move-exception;
        th.addSuppressed(th);     // Catch: IOException -> L14
        throw th;     // Catch: IOException -> L14
    L15:
        return null;
    }

    public static ByteBuffer mmap(Context context, CancellationSignal cancellationSignal, Uri uri) {
        ContentResolver resolver = context.getContentResolver();
        ParcelFileDescriptor pfd = resolver.openFileDescriptor(uri, "r", cancellationSignal);     // Catch: IOException -> L30
        if (pfd != null) goto L32;
        if (pfd == null) goto L7;
        pfd.close();     // Catch: IOException -> L30
    L7:
        return null;
    L32:
        FileInputStream fis = new FileInputStream(pfd.getFileDescriptor());     // Catch: Throwable -> L22
        FileChannel channel = fis.getChannel();     // Catch: Throwable -> L15
        long size = channel.size();     // Catch: Throwable -> L15
        MappedByteBuffer r0 = channel.map(FileChannel.MapMode.READ_ONLY, 0, size);     // Catch: Throwable -> L15
        fis.close();     // Catch: Throwable -> L22
        if (pfd == null) goto L14;
        pfd.close();     // Catch: IOException -> L30
    L14:
        return r0;
    L15:
        th = move-exception;
        fis.close();     // Catch: Throwable -> L19
        goto L31
    L40:
        throw th;     // Catch: Throwable -> L22
    L19:
        th = move-exception;
        th.addSuppressed(th);     // Catch: Throwable -> L22
        throw th;     // Catch: Throwable -> L22
    L22:
        th = move-exception;
        if (pfd == null) goto L41;
        pfd.close();     // Catch: Throwable -> L27
        goto L31
    L42:
        throw th;     // Catch: IOException -> L30
    L27:
        th = move-exception;
        th.addSuppressed(th);     // Catch: IOException -> L30
        throw th;     // Catch: IOException -> L30
    L41:
        throw th;     // Catch: IOException -> L30
    L31:
        return null;
    }

    public static ByteBuffer copyToDirectBuffer(Context context, Resources res, int id) {
        File tmpFile = getTempFile(context);
        if (tmpFile != null) goto L15;
        return null;
    L15:
    L12:
        th = move-exception;
        tmpFile.delete();
        throw th;
    L6:
        if (copyToFile(tmpFile, res, id) == true) goto L9;
        tmpFile.delete();
        return null;
    L9:
        ByteBuffer r1 = mmap(tmpFile);     // Catch: Throwable -> L12
        tmpFile.delete();
        return r1;
    }

    public static boolean copyToFile(File file, InputStream is) {
        FileOutputStream os = null;
        StrictMode.ThreadPolicy old = StrictMode.allowThreadDiskWrites();
        os = new FileOutputStream(file, false);     // Catch: Throwable -> L10 IOException -> L12
        byte[] buffer = new byte[1024];     // Catch: Throwable -> L10 IOException -> L12
    L4:
        int readLen = is.read(buffer);     // Catch: Throwable -> L10 IOException -> L12
        if (readLen == (-1)) goto L8;
        os.write(buffer, 0, readLen);     // Catch: Throwable -> L10 IOException -> L12
    L8:
        closeQuietly(os);
        StrictMode.setThreadPolicy(old);
        return true;
    L12:
        e = move-exception;
        Log.e(TAG, "Error copying resource contents to temp file: " + e.getMessage());     // Catch: Throwable -> L10
        closeQuietly(os);
        StrictMode.setThreadPolicy(old);
        return false;
    L10:
        th = move-exception;
        closeQuietly(os);
        StrictMode.setThreadPolicy(old);
        throw th;
    }

    public static boolean copyToFile(File file, Resources res, int id) {
        InputStream is = null;
        is = res.openRawResource(id);     // Catch: Throwable -> L6
        boolean r1 = copyToFile(file, is);     // Catch: Throwable -> L6
        closeQuietly(is);
        return r1;
    L6:
        th = move-exception;
        closeQuietly(is);
        throw th;
    }

    public static void closeQuietly(Closeable c) {
        if (c == null) goto L9;
        c.close();     // Catch: IOException -> L5
        return;
    L6:
        return;
    }

    public static Map<Uri, ByteBuffer> readFontInfoIntoByteBuffer(Context context, FontsContractCompat.FontInfo[] fonts, CancellationSignal cancellationSignal) {
        HashMap<Uri, ByteBuffer> out = new HashMap();
        int r1 = fonts.length;
        int r2 = 0;
    L3:
        if (r2 >= r1) goto L13;
        FontsContractCompat.FontInfo font = fonts[r2];
        if (font.getResultCode() != 0) goto L11;
        Uri uri = font.getUri();
        if (out.containsKey(uri) == true) goto L11;
        ByteBuffer buffer = mmap(context, cancellationSignal, uri);
        out.put(uri, buffer);
    L11:
        r2 = r2 + 1;
        goto L3
    L13:
        return Collections.unmodifiableMap(out);
    }
}
