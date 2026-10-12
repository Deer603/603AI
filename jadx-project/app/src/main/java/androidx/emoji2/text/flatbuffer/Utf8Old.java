package androidx.emoji2.text.flatbuffer;

import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CharsetEncoder;
import java.nio.charset.CoderResult;
import java.nio.charset.StandardCharsets;

/* JADX INFO: loaded from: classes4.dex */
public class Utf8Old extends Utf8 {
    private static final ThreadLocal<Cache> CACHE = null;

    private static class Cache {
        final CharsetDecoder decoder;
        final CharsetEncoder encoder;
        CharSequence lastInput;
        ByteBuffer lastOutput;

        Cache() {
            this.lastInput = null;
            this.lastOutput = null;
            this.encoder = StandardCharsets.UTF_8.newEncoder();
            this.decoder = StandardCharsets.UTF_8.newDecoder();
        }
    }

    public Utf8Old() {
    }

    static {
        CACHE = ThreadLocal.withInitial(new Utf8Old$$ExternalSyntheticLambda0());
    }

    static /* synthetic */ Cache lambda$static$0() {
        return new Cache();
    }

    @Override // androidx.emoji2.text.flatbuffer.Utf8
    public int encodedLength(CharSequence in) {
        Cache cache = CACHE.get();
        int estimated = (int) (in.length() * cache.encoder.maxBytesPerChar());
        if (cache.lastOutput != null) goto L5;
    L6:
        cache.lastOutput = ByteBuffer.allocate(Math.max(128, estimated));
    L7:
        cache.lastOutput.clear();
        cache.lastInput = in;
        if ((in instanceof CharBuffer) == false) goto L10;
        CharBuffer wrap = (CharBuffer) in;
    L11:
        CoderResult result = cache.encoder.encode(wrap, cache.lastOutput, true);
        if (result.isError() == true) goto L20;
    L18:
        cache.lastOutput.flip();
        return cache.lastOutput.remaining();
    L20:
        result.throwException();     // Catch: CharacterCodingException -> L15
    L15:
        e = move-exception;
        throw new IllegalArgumentException("bad character encoding", e);
    L10:
        wrap = CharBuffer.wrap(in);
        goto L11
    L5:
        if (cache.lastOutput.capacity() >= estimated) goto L7;
        goto L6
    }

    @Override // androidx.emoji2.text.flatbuffer.Utf8
    public void encodeUtf8(CharSequence in, ByteBuffer out) {
        Cache cache = CACHE.get();
        if (cache.lastInput == in) goto L5;
        encodedLength(in);
    L5:
        out.put(cache.lastOutput);
    }

    @Override // androidx.emoji2.text.flatbuffer.Utf8
    public String decodeUtf8(ByteBuffer buffer, int offset, int length) {
        CharsetDecoder decoder = CACHE.get().decoder;
        decoder.reset();
        ByteBuffer buffer2 = buffer.duplicate();
        buffer2.position(offset);
        buffer2.limit(offset + length);
        CharBuffer result = decoder.decode(buffer2);     // Catch: CharacterCodingException -> L5
        return result.toString();
    L5:
        e = move-exception;
        throw new IllegalArgumentException("Bad encoding", e);
    }
}
