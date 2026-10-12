package androidx.emoji2.text.flatbuffer;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes4.dex */
public final class Utf8Safe extends Utf8 {

    static class UnpairedSurrogateException extends IllegalArgumentException {
        UnpairedSurrogateException(int index, int length) {
            super("Unpaired surrogate at index " + index + " of " + length);
        }
    }

    public Utf8Safe() {
    }

    private static int computeEncodedLength(CharSequence sequence) {
        int utf16Length = sequence.length();
        int utf8Length = utf16Length;
        int i = 0;
    L3:
        if (i >= utf16Length) goto L7;
        if (sequence.charAt(i) >= 128) goto L7;
        i = i + 1;
    L7:
        if (i >= utf16Length) goto L12;
        char c = sequence.charAt(i);
        if (c >= 2048) goto L11;
        utf8Length = utf8Length + ((127 - c) >>> 31);
        i = i + 1;
        goto L7
    L11:
        utf8Length = utf8Length + encodedLengthGeneral(sequence, i);
    L12:
        if (utf8Length < utf16Length) goto L15;
        return utf8Length;
    L15:
        throw new IllegalArgumentException("UTF-8 length does not fit in int: " + (((long) utf8Length) + 4294967296L));
    }

    private static int encodedLengthGeneral(CharSequence sequence, int start) {
        int utf16Length = sequence.length();
        int utf8Length = 0;
        int i = start;
    L3:
        if (i >= utf16Length) goto L17;
        char c = sequence.charAt(i);
        if (c >= 2048) goto L7;
        utf8Length = utf8Length + ((127 - c) >>> 31);
    L16:
        i = i + 1;
        goto L3
    L7:
        utf8Length = utf8Length + 2;
        if (55296 > c) goto L16;
        if (c > 57343) goto L16;
        int cp = Character.codePointAt(sequence, i);
        if (cp < 65536) goto L15;
        i = i + 1;
        goto L16
    L15:
        throw new UnpairedSurrogateException(i, utf16Length);
    L17:
        return utf8Length;
    }

    public static String decodeUtf8Array(byte[] bytes, int index, int size) {
        if (((index | size) | ((bytes.length - index) - size)) < 0) goto L43;
        int offset = index;
        int limit = offset + size;
        char[] resultArr = new char[size];
        int resultPos = 0;
    L5:
        if (offset >= limit) goto L10;
        byte b = bytes[offset];
        if (Utf8.DecodeUtil.isOneByte(b) == false) goto L10;
        offset = offset + 1;
        Utf8.DecodeUtil.handleOneByte(b, resultArr, resultPos);
        resultPos = resultPos + 1;
    L10:
        int resultPos2 = resultPos;
    L11:
        if (offset >= limit) goto L41;
        int offset2 = offset + 1;
        byte byte1 = bytes[offset];
        if (Utf8.DecodeUtil.isOneByte(byte1) == true) goto L14;
        if (Utf8.DecodeUtil.isTwoBytes(byte1) == true) goto L23;
        if (Utf8.DecodeUtil.isThreeBytes(byte1) == true) goto L30;
        if (offset2 >= (limit - 2)) goto L39;
        int offset3 = offset2 + 1;
        int offset4 = offset3 + 1;
        Utf8.DecodeUtil.handleFourBytes(byte1, bytes[offset2], bytes[offset3], bytes[offset4], resultArr, resultPos2);
        offset = offset4 + 1;
        resultPos2 = (resultPos2 + 1) + 1;
        goto L11
    L39:
        throw new IllegalArgumentException("Invalid UTF-8");
    L30:
        if (offset2 >= (limit - 1)) goto L33;
        int offset5 = offset2 + 1;
        Utf8.DecodeUtil.handleThreeBytes(byte1, bytes[offset2], bytes[offset5], resultArr, resultPos2);
        offset = offset5 + 1;
        resultPos2 = resultPos2 + 1;
        goto L11
    L33:
        throw new IllegalArgumentException("Invalid UTF-8");
    L23:
        if (offset2 >= limit) goto L26;
        offset = offset2 + 1;
        Utf8.DecodeUtil.handleTwoBytes(byte1, bytes[offset2], resultArr, resultPos2);
        resultPos2 = resultPos2 + 1;
        goto L11
    L26:
        throw new IllegalArgumentException("Invalid UTF-8");
    L14:
        int resultPos3 = resultPos2 + 1;
        Utf8.DecodeUtil.handleOneByte(byte1, resultArr, resultPos2);
    L15:
        if (offset2 >= limit) goto L20;
        byte b2 = bytes[offset2];
        if (Utf8.DecodeUtil.isOneByte(b2) == false) goto L20;
        offset2 = offset2 + 1;
        Utf8.DecodeUtil.handleOneByte(b2, resultArr, resultPos3);
        resultPos3 = resultPos3 + 1;
    L20:
        resultPos2 = resultPos3;
        offset = offset2;
        goto L11
    L41:
        return new String(resultArr, 0, resultPos2);
    L43:
        throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", new Object[]{Integer.valueOf(bytes.length), Integer.valueOf(index), Integer.valueOf(size)}));
    }

    public static String decodeUtf8Buffer(ByteBuffer buffer, int offset, int length) {
        if (((offset | length) | ((buffer.limit() - offset) - length)) < 0) goto L43;
        int limit = offset + length;
        char[] resultArr = new char[length];
        int resultPos = 0;
    L5:
        if (offset >= limit) goto L10;
        byte b = buffer.get(offset);
        if (Utf8.DecodeUtil.isOneByte(b) == false) goto L10;
        offset = offset + 1;
        Utf8.DecodeUtil.handleOneByte(b, resultArr, resultPos);
        resultPos = resultPos + 1;
    L10:
        int resultPos2 = resultPos;
    L11:
        if (offset >= limit) goto L41;
        int offset2 = offset + 1;
        byte byte1 = buffer.get(offset);
        if (Utf8.DecodeUtil.isOneByte(byte1) == true) goto L14;
        if (Utf8.DecodeUtil.isTwoBytes(byte1) == true) goto L23;
        if (Utf8.DecodeUtil.isThreeBytes(byte1) == true) goto L30;
        if (offset2 >= (limit - 2)) goto L39;
        int offset3 = offset2 + 1;
        int offset4 = offset3 + 1;
        Utf8.DecodeUtil.handleFourBytes(byte1, buffer.get(offset2), buffer.get(offset3), buffer.get(offset4), resultArr, resultPos2);
        offset = offset4 + 1;
        resultPos2 = (resultPos2 + 1) + 1;
        goto L11
    L39:
        throw new IllegalArgumentException("Invalid UTF-8");
    L30:
        if (offset2 >= (limit - 1)) goto L33;
        int offset5 = offset2 + 1;
        Utf8.DecodeUtil.handleThreeBytes(byte1, buffer.get(offset2), buffer.get(offset5), resultArr, resultPos2);
        offset = offset5 + 1;
        resultPos2 = resultPos2 + 1;
        goto L11
    L33:
        throw new IllegalArgumentException("Invalid UTF-8");
    L23:
        if (offset2 >= limit) goto L26;
        offset = offset2 + 1;
        Utf8.DecodeUtil.handleTwoBytes(byte1, buffer.get(offset2), resultArr, resultPos2);
        resultPos2 = resultPos2 + 1;
        goto L11
    L26:
        throw new IllegalArgumentException("Invalid UTF-8");
    L14:
        int resultPos3 = resultPos2 + 1;
        Utf8.DecodeUtil.handleOneByte(byte1, resultArr, resultPos2);
    L15:
        if (offset2 >= limit) goto L20;
        byte b2 = buffer.get(offset2);
        if (Utf8.DecodeUtil.isOneByte(b2) == false) goto L20;
        offset2 = offset2 + 1;
        Utf8.DecodeUtil.handleOneByte(b2, resultArr, resultPos3);
        resultPos3 = resultPos3 + 1;
    L20:
        resultPos2 = resultPos3;
        offset = offset2;
        goto L11
    L41:
        return new String(resultArr, 0, resultPos2);
    L43:
        throw new ArrayIndexOutOfBoundsException(String.format("buffer limit=%d, index=%d, limit=%d", new Object[]{Integer.valueOf(buffer.limit()), Integer.valueOf(offset), Integer.valueOf(length)}));
    }

    @Override // androidx.emoji2.text.flatbuffer.Utf8
    public int encodedLength(CharSequence in) {
        return computeEncodedLength(in);
    }

    @Override // androidx.emoji2.text.flatbuffer.Utf8
    public String decodeUtf8(ByteBuffer buffer, int offset, int length) throws IllegalArgumentException {
        if (buffer.hasArray() == false) goto L7;
        return decodeUtf8Array(buffer.array(), buffer.arrayOffset() + offset, length);
    L7:
        return decodeUtf8Buffer(buffer, offset, length);
    }

    private static void encodeUtf8Buffer(CharSequence in, ByteBuffer out) {
        int inLength = in.length();
        int outIx = out.position();
        int inIx = 0;
    L4:
        if (inIx >= inLength) goto L10;
        char c = in.charAt(inIx);     // Catch: IndexOutOfBoundsException -> L8
        if (c >= 128) goto L10;
        out.put(outIx + inIx, (byte) c);     // Catch: IndexOutOfBoundsException -> L8
        inIx = inIx + 1;     // Catch: IndexOutOfBoundsException -> L8
    L55:
        int badWriteIndex = out.position() + Math.max(inIx, (outIx - out.position()) + 1);
        throw new ArrayIndexOutOfBoundsException("Failed writing " + in.charAt(inIx) + " at index " + badWriteIndex);
    L10:
        if (inIx != inLength) goto L13;
        out.position(outIx + inIx);     // Catch: IndexOutOfBoundsException -> L8
        return;
    L13:
        int outIx2 = outIx + inIx;     // Catch: IndexOutOfBoundsException -> L8
    L14:
        if (inIx >= inLength) goto L53;
        char c2 = in.charAt(inIx);     // Catch: IndexOutOfBoundsException -> L8
        if (c2 >= 128) goto L20;
        out.put(outIx2, (byte) c2);     // Catch: IndexOutOfBoundsException -> L8
    L52:
        inIx = inIx + 1;     // Catch: IndexOutOfBoundsException -> L8
        outIx2 = outIx2 + 1;     // Catch: IndexOutOfBoundsException -> L8
        goto L14
    L20:
        if (c2 >= 2048) goto L27;
        int outIx3 = outIx2 + 1;
        out.put(outIx2, (byte) ((c2 >>> 6) | 192));     // Catch: IndexOutOfBoundsException -> L24
        out.put(outIx3, (byte) ((c2 & '?') | 128));     // Catch: IndexOutOfBoundsException -> L24
        outIx2 = outIx3;
    L25:
        outIx = outIx3;
        goto L55
    L27:
        if (c2 >= 55296) goto L29;
    L48:
        int outIx4 = outIx2 + 1;
        out.put(outIx2, (byte) ((c2 >>> '\f') | 224));     // Catch: IndexOutOfBoundsException -> L24
        outIx2 = outIx4 + 1;
        out.put(outIx4, (byte) (((c2 >>> 6) & 63) | 128));     // Catch: IndexOutOfBoundsException -> L8
        out.put(outIx2, (byte) ((c2 & '?') | 128));     // Catch: IndexOutOfBoundsException -> L8
        goto L52
    L29:
        if (57343 < c2) goto L48;
        if ((inIx + 1) == inLength) goto L47;
        inIx = inIx + 1;
        char low = in.charAt(inIx);     // Catch: IndexOutOfBoundsException -> L8
        if (Character.isSurrogatePair(c2, low) == false) goto L47;
        int codePoint = Character.toCodePoint(c2, low);     // Catch: IndexOutOfBoundsException -> L8
        int outIx5 = outIx2 + 1;
        out.put(outIx2, (byte) ((codePoint >>> 18) | 240));     // Catch: IndexOutOfBoundsException -> L44
        int outIx6 = outIx5 + 1;
        out.put(outIx5, (byte) (((codePoint >>> 12) & 63) | 128));     // Catch: IndexOutOfBoundsException -> L8
        outIx5 = outIx6 + 1;
        out.put(outIx6, (byte) (((codePoint >>> 6) & 63) | 128));     // Catch: IndexOutOfBoundsException -> L44
        out.put(outIx5, (byte) ((codePoint & 63) | 128));     // Catch: IndexOutOfBoundsException -> L44
        outIx2 = outIx5;
    L45:
        outIx = outIx5;
    L47:
        throw new UnpairedSurrogateException(inIx, inLength);     // Catch: IndexOutOfBoundsException -> L8
    L53:
        out.position(outIx2);     // Catch: IndexOutOfBoundsException -> L8
    }

    private static int encodeUtf8Array(CharSequence in, byte[] out, int offset, int length) {
        int utf16Length = in.length();
        int i = 0;
        int limit = offset + length;
    L4:
        if (i >= utf16Length) goto L10;
        if ((i + offset) >= limit) goto L10;
        char c = in.charAt(i);
        if (c >= 128) goto L10;
        out[offset + i] = (byte) c;
        i = i + 1;
    L10:
        if (i == utf16Length) goto L12;
        int j = offset + i;
    L14:
        if (i >= utf16Length) goto L50;
        char c2 = in.charAt(i);
        if (c2 >= 128) goto L20;
        if (j >= limit) goto L20;
        out[j] = (byte) c2;
        j = j + 1;
    L37:
        i = i + 1;
    L20:
        if (c2 >= 2048) goto L25;
        if (j > (limit - 2)) goto L25;
        int j2 = j + 1;
        out[j] = (byte) ((c2 >>> 6) | 960);
        j = j2 + 1;
        out[j2] = (byte) ((c2 & '?') | 128);
    L25:
        if (c2 < 55296) goto L28;
        if (57343 < c2) goto L28;
    L31:
        if (j > (limit - 4)) goto L40;
        if ((i + 1) == in.length()) goto L39;
        i = i + 1;
        char low = in.charAt(i);
        if (Character.isSurrogatePair(c2, low) == false) goto L39;
        int codePoint = Character.toCodePoint(c2, low);
        int j3 = j + 1;
        out[j] = (byte) ((codePoint >>> 18) | 240);
        int j4 = j3 + 1;
        out[j3] = (byte) (((codePoint >>> 12) & 63) | 128);
        int j5 = j4 + 1;
        out[j4] = (byte) (((codePoint >>> 6) & 63) | 128);
        j = j5 + 1;
        out[j5] = (byte) ((codePoint & 63) | 128);
    L39:
        throw new UnpairedSurrogateException(i - 1, utf16Length);
    L40:
        if (55296 > c2) goto L49;
        if (c2 > 57343) goto L49;
        if ((i + 1) == in.length()) goto L47;
        if (Character.isSurrogatePair(c2, in.charAt(i + 1)) == true) goto L49;
    L47:
        throw new UnpairedSurrogateException(i, utf16Length);
    L49:
        throw new ArrayIndexOutOfBoundsException("Failed writing " + c2 + " at index " + j);
    L28:
        if (j > (limit - 3)) goto L31;
        int j6 = j + 1;
        out[j] = (byte) ((c2 >>> '\f') | 480);
        int j7 = j6 + 1;
        out[j6] = (byte) (((c2 >>> 6) & 63) | 128);
        out[j7] = (byte) ((c2 & '?') | 128);
        j = j7 + 1;
        goto L37
    L50:
        return j;
    L12:
        return offset + utf16Length;
    }

    @Override // androidx.emoji2.text.flatbuffer.Utf8
    public void encodeUtf8(CharSequence in, ByteBuffer out) {
        if (out.hasArray() == false) goto L5;
        int start = out.arrayOffset();
        int end = encodeUtf8Array(in, out.array(), out.position() + start, out.remaining());
        out.position(end - start);
        return;
    L5:
        encodeUtf8Buffer(in, out);
    }
}
