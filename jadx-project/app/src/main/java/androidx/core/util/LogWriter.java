package androidx.core.util;

import android.util.Log;
import java.io.Writer;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public class LogWriter extends Writer {
    private StringBuilder mBuilder;
    private final String mTag;

    public LogWriter(String tag) {
        this.mBuilder = new StringBuilder(128);
        this.mTag = tag;
    }

    @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        flushBuilder();
    }

    @Override // java.io.Writer, java.io.Flushable
    public void flush() {
        flushBuilder();
    }

    @Override // java.io.Writer
    public void write(char[] buf, int offset, int count) {
        int i = 0;
    L3:
        if (i >= count) goto L9;
        char c = buf[offset + i];
        if (c != '\n') goto L7;
        flushBuilder();
    L8:
        i = i + 1;
        goto L3
    L7:
        this.mBuilder.append(c);
        goto L8
    }

    private void flushBuilder() {
        if (this.mBuilder.length() <= 0) goto L6;
        Log.d(this.mTag, this.mBuilder.toString());
        this.mBuilder.delete(0, this.mBuilder.length());
        return;
    }
}
