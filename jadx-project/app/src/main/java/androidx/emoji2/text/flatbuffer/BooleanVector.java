package androidx.emoji2.text.flatbuffer;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes4.dex */
public final class BooleanVector extends BaseVector {
    public BooleanVector() {
    }

    public BooleanVector __assign(int _vector, ByteBuffer _bb) {
        __reset(_vector, 1, _bb);
        return this;
    }

    public boolean get(int j) {
        if (this.bb.get(__element(j)) == 0) goto L5;
        return true;
    L5:
        return false;
    }
}
