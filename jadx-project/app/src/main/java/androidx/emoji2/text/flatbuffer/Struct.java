package androidx.emoji2.text.flatbuffer;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes4.dex */
public class Struct {
    protected ByteBuffer bb;
    protected int bb_pos;

    public Struct() {
    }

    protected void __reset(int _i, ByteBuffer _bb) {
        this.bb = _bb;
        if (this.bb == null) goto L5;
        this.bb_pos = _i;
        return;
    L5:
        this.bb_pos = 0;
    }

    public void __reset() {
        __reset(0, null);
    }
}
