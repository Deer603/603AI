package androidx.emoji2.text.flatbuffer;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes4.dex */
public class BaseVector {
    protected ByteBuffer bb;
    private int element_size;
    private int length;
    private int vector;

    public BaseVector() {
    }

    protected int __vector() {
        return this.vector;
    }

    protected int __element(int j) {
        return this.vector + (this.element_size * j);
    }

    protected void __reset(int _vector, int _element_size, ByteBuffer _bb) {
        this.bb = _bb;
        if (this.bb == null) goto L5;
        this.vector = _vector;
        this.length = this.bb.getInt(_vector - 4);
        this.element_size = _element_size;
        return;
    L5:
        this.vector = 0;
        this.length = 0;
        this.element_size = 0;
    }

    public void reset() {
        __reset(0, 0, null);
    }

    public int length() {
        return this.length;
    }
}
