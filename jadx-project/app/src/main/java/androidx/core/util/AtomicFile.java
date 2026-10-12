package androidx.core.util;

import android.util.Log;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
public class AtomicFile {
    private static final String LOG_TAG = "AtomicFile";
    private final File mBaseName;
    private final File mLegacyBackupName;
    private final File mNewName;

    public AtomicFile(File baseName) {
        this.mBaseName = baseName;
        this.mNewName = new File(baseName.getPath() + ".new");
        this.mLegacyBackupName = new File(baseName.getPath() + ".bak");
    }

    public File getBaseFile() {
        return this.mBaseName;
    }

    public void delete() {
        this.mBaseName.delete();
        this.mNewName.delete();
        this.mLegacyBackupName.delete();
    }

    public FileOutputStream startWrite() throws IOException {
        if (this.mLegacyBackupName.exists() == false) goto L17;
        rename(this.mLegacyBackupName, this.mBaseName);
    L17:
        return new FileOutputStream(this.mNewName);
    L8:
        File parent = this.mNewName.getParentFile();
        if (parent.mkdirs() == false) goto L16;
        return new FileOutputStream(this.mNewName);
    L12:
        e2 = move-exception;
        throw new IOException("Failed to create new file " + this.mNewName, e2);
    L16:
        throw new IOException("Failed to create directory for " + this.mNewName);
    }

    public void finishWrite(FileOutputStream str) {
        if (str != null) goto L5;
        return;
    L5:
        if (sync(str) == true) goto L13;
        Log.e(LOG_TAG, "Failed to sync file output stream");
    L13:
        str.close();     // Catch: IOException -> L9
    L11:
        rename(this.mNewName, this.mBaseName);
        return;
    L9:
        e = move-exception;
        Log.e(LOG_TAG, "Failed to close file output stream", e);
        goto L11
    }

    public void failWrite(FileOutputStream str) {
        if (str != null) goto L5;
        return;
    L5:
        if (sync(str) == true) goto L15;
        Log.e(LOG_TAG, "Failed to sync file output stream");
    L15:
        str.close();     // Catch: IOException -> L9
    L12:
        if (this.mNewName.delete() == true) goto L17;
        Log.e(LOG_TAG, "Failed to delete new file " + this.mNewName);
        return;
    L17:
        return;
    L9:
        e = move-exception;
        Log.e(LOG_TAG, "Failed to close file output stream", e);
        goto L12
    }

    public FileInputStream openRead() throws FileNotFoundException {
        if (this.mLegacyBackupName.exists() == false) goto L6;
        rename(this.mLegacyBackupName, this.mBaseName);
    L6:
        if (this.mNewName.exists() == false) goto L13;
        if (this.mBaseName.exists() == false) goto L13;
        if (this.mNewName.delete() == true) goto L13;
        Log.e(LOG_TAG, "Failed to delete outdated new file " + this.mNewName);
    L13:
        return new FileInputStream(this.mBaseName);
    }

    public byte[] readFully() throws IOException {
        FileInputStream stream = openRead();
        int pos = 0;
        byte[] data = new byte[stream.available()];     // Catch: Throwable -> L14
    L4:
        int amt = stream.read(data, pos, data.length - pos);     // Catch: Throwable -> L14
        if (amt <= 0) goto L6;
        pos = pos + amt;
        int avail = stream.available();     // Catch: Throwable -> L14
        if (avail <= (data.length - pos)) goto L4;
        byte[] newData = new byte[pos + avail];     // Catch: Throwable -> L14
        System.arraycopy(data, 0, newData, 0, pos);     // Catch: Throwable -> L14
        data = newData;
        goto L4
    L6:
        stream.close();
        return data;
    L14:
        th = move-exception;
        stream.close();
        throw th;
    }

    private static boolean sync(FileOutputStream stream) {
        stream.getFD().sync();     // Catch: IOException -> L5
        return true;
    L6:
        return false;
    }

    private static void rename(File source, File target) {
        if (target.isDirectory() == false) goto L8;
        if (target.delete() == true) goto L8;
        Log.e(LOG_TAG, "Failed to delete file which is a directory " + target);
    L8:
        if (source.renameTo(target) == true) goto L11;
        Log.e(LOG_TAG, "Failed to rename " + source + " to " + target);
        return;
    }
}
