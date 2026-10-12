package androidx.emoji2.text.flatbuffer;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes4.dex */
public abstract class Utf8 {
    private static Utf8 DEFAULT;

    static class DecodeUtil {
        DecodeUtil() {
        }

        static boolean isOneByte(byte b) {
            if (b < 0) goto L4;
            return true;
        L4:
            return false;
        }

        static boolean isTwoBytes(byte b) {
            if (b >= (-32)) goto L5;
            return true;
        L5:
            return false;
        }

        static boolean isThreeBytes(byte b) {
            if (b >= (-16)) goto L5;
            return true;
        L5:
            return false;
        }

        static void handleOneByte(byte byte1, char[] resultArr, int resultPos) {
            resultArr[resultPos] = (char) byte1;
        }

        static void handleTwoBytes(byte byte1, byte byte2, char[] resultArr, int resultPos) throws IllegalArgumentException {
            if (byte1 < (-62)) goto L11;
            if (isNotTrailingByte(byte2) == true) goto L9;
            resultArr[resultPos] = (char) (((byte1 & 31) << 6) | trailingByteValue(byte2));
            return;
        L9:
            throw new IllegalArgumentException("Invalid UTF-8: Illegal trailing byte in 2 bytes utf");
        L11:
            throw new IllegalArgumentException("Invalid UTF-8: Illegal leading byte in 2 bytes utf");
        }

        static void handleThreeBytes(byte byte1, byte byte2, byte byte3, char[] resultArr, int resultPos) throws IllegalArgumentException {
            if (isNotTrailingByte(byte2) == true) goto L15;
            if (byte1 != (-32)) goto L8;
            if (byte2 < (-96)) goto L15;
        L8:
            if (byte1 != (-19)) goto L11;
            if (byte2 >= (-96)) goto L15;
        L11:
            if (isNotTrailingByte(byte3) == true) goto L15;
            resultArr[resultPos] = (char) ((((byte1 & 15) << 12) | (trailingByteValue(byte2) << 6)) | trailingByteValue(byte3));
            return;
        L15:
            throw new IllegalArgumentException("Invalid UTF-8");
        }

        static void handleFourBytes(byte byte1, byte byte2, byte byte3, byte byte4, char[] resultArr, int resultPos) throws IllegalArgumentException {
            if (isNotTrailingByte(byte2) == true) goto L13;
            if ((((byte1 << 28) + (byte2 + 112)) >> 30) != 0) goto L13;
            if (isNotTrailingByte(byte3) == true) goto L13;
            if (isNotTrailingByte(byte4) == true) goto L13;
            int codepoint = ((((byte1 & 7) << 18) | (trailingByteValue(byte2) << 12)) | (trailingByteValue(byte3) << 6)) | trailingByteValue(byte4);
            resultArr[resultPos] = highSurrogate(codepoint);
            resultArr[resultPos + 1] = lowSurrogate(codepoint);
            return;
        L13:
            throw new IllegalArgumentException("Invalid UTF-8");
        }

        private static boolean isNotTrailingByte(byte b) {
            if (b <= (-65)) goto L5;
            return true;
        L5:
            return false;
        }

        private static int trailingByteValue(byte b) {
            return b & 63;
        }

        private static char highSurrogate(int codePoint) {
            return (char) ((codePoint >>> 10) + 55232);
        }

        private static char lowSurrogate(int codePoint) {
            return (char) ((codePoint & 1023) + 56320);
        }
    }

    static class UnpairedSurrogateException extends IllegalArgumentException {
        UnpairedSurrogateException(int index, int length) {
            super("Unpaired surrogate at index " + index + " of " + length);
        }
    }

    public abstract String decodeUtf8(ByteBuffer r1, int r2, int r3);

    public abstract void encodeUtf8(CharSequence r1, ByteBuffer r2);

    public abstract int encodedLength(CharSequence r1);

    public Utf8() {
    }

    public static Utf8 getDefault() {
        if (DEFAULT != null) goto L6;
        DEFAULT = new Utf8Safe();
    L6:
        return DEFAULT;
    }

    public static void setDefault(Utf8 instance) {
        DEFAULT = instance;
    }
}
