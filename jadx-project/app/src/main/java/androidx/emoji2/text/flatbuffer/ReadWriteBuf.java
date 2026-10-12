package androidx.emoji2.text.flatbuffer;

/* JADX INFO: loaded from: classes4.dex */
interface ReadWriteBuf extends ReadBuf {
    @Override // androidx.emoji2.text.flatbuffer.ReadBuf
    int limit();

    void put(byte r1);

    void put(byte[] r1, int r2, int r3);

    void putBoolean(boolean r1);

    void putDouble(double r1);

    void putFloat(float r1);

    void putInt(int r1);

    void putLong(long r1);

    void putShort(short r1);

    boolean requestCapacity(int r1);

    void set(int r1, byte r2);

    void set(int r1, byte[] r2, int r3, int r4);

    void setBoolean(int r1, boolean r2);

    void setDouble(int r1, double r2);

    void setFloat(int r1, float r2);

    void setInt(int r1, int r2);

    void setLong(int r1, long r2);

    void setShort(int r1, short r2);

    int writePosition();
}
