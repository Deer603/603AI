package androidx.profileinstaller;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes4.dex */
class ProfileTranscoder {
    private static final int FIRST_FLAG = 1;
    private static final int HOT = 1;
    private static final int INLINE_CACHE_MEGAMORPHIC_ENCODING = 7;
    private static final int INLINE_CACHE_MISSING_TYPES_ENCODING = 6;
    private static final int LAST_FLAG = 4;
    static final byte[] MAGIC_PROF = null;
    static final byte[] MAGIC_PROFM = null;
    private static final int POST_STARTUP = 4;
    private static final int STARTUP = 2;

    private ProfileTranscoder() {
    }

    static {
        MAGIC_PROF = new byte[]{112, 114, 111, 0};
        MAGIC_PROFM = new byte[]{112, 114, 109, 0};
    }

    static byte[] readHeader(InputStream is, byte[] magic) throws IOException {
        byte[] fileMagic = Encoding.read(is, magic.length);
        if (Arrays.equals(magic, fileMagic) == false) goto L7;
        return Encoding.read(is, ProfileVersion.V010_P.length);
    L7:
        throw Encoding.error("Invalid magic");
    }

    static void writeHeader(OutputStream os, byte[] version) throws IOException {
        os.write(MAGIC_PROF);
        os.write(version);
    }

    static boolean transcodeAndWriteBody(OutputStream os, byte[] desiredVersion, DexProfileData[] data) throws IOException {
        if (Arrays.equals(desiredVersion, ProfileVersion.V015_S) == false) goto L7;
        writeProfileForS(os, data);
        return true;
    L7:
        if (Arrays.equals(desiredVersion, ProfileVersion.V010_P) == false) goto L11;
        writeProfileForP(os, data);
        return true;
    L11:
        if (Arrays.equals(desiredVersion, ProfileVersion.V005_O) == false) goto L15;
        writeProfileForO(os, data);
        return true;
    L15:
        if (Arrays.equals(desiredVersion, ProfileVersion.V009_O_MR1) == false) goto L19;
        writeProfileForO_MR1(os, data);
        return true;
    L19:
        if (Arrays.equals(desiredVersion, ProfileVersion.V001_N) == false) goto L22;
        writeProfileForN(os, data);
        return true;
    L22:
        return false;
    }

    private static void writeProfileForN(OutputStream os, DexProfileData[] lines) throws IOException {
        Encoding.writeUInt16(os, lines.length);
        int r0 = lines.length;
        int r2 = 0;
    L3:
        if (r2 >= r0) goto L12;
        DexProfileData data = lines[r2];
        String profileKey = generateDexKey(data.apkName, data.dexName, ProfileVersion.V001_N);
        Encoding.writeUInt16(os, Encoding.utf8Length(profileKey));
        Encoding.writeUInt16(os, data.methods.size());
        Encoding.writeUInt16(os, data.classes.length);
        Encoding.writeUInt32(os, data.dexChecksum);
        Encoding.writeString(os, profileKey);
        Iterator<Integer> r5 = data.methods.keySet().iterator();
    L6:
        if (r5.hasNext() == false) goto L8;
        int id = r5.next().intValue();
        Encoding.writeUInt16(os, id);
        goto L6
    L8:
        int[] r6 = data.classes;
        int r7 = r6.length;
        int r8 = 0;
    L9:
        if (r8 >= r7) goto L11;
        int id2 = r6[r8];
        Encoding.writeUInt16(os, id2);
        r8 = r8 + 1;
        goto L9
    L11:
        r2 = r2 + 1;
        goto L3
    }

    private static void writeProfileForS(OutputStream os, DexProfileData[] profileData) throws IOException {
        writeProfileSections(os, profileData);
    }

    private static void writeProfileSections(OutputStream os, DexProfileData[] profileData) throws IOException {
        List<WritableFileSection> sections = new ArrayList(3);
        List<byte[]> sectionContents = new ArrayList(3);
        sections.add(writeDexFileSection(profileData));
        sections.add(createCompressibleClassSection(profileData));
        sections.add(createCompressibleMethodsSection(profileData));
        long offset = ((long) ProfileVersion.V015_S.length) + ((long) MAGIC_PROF.length);
        long offset2 = (offset + 4) + ((long) (sections.size() * 16));
        Encoding.writeUInt32(os, sections.size());
        int i = 0;
    L4:
        if (i >= sections.size()) goto L10;
        WritableFileSection section = sections.get(i);
        Encoding.writeUInt32(os, section.mType.getValue());
        Encoding.writeUInt32(os, offset2);
        if (section.mNeedsCompression == false) goto L8;
        long inflatedSize = section.mContents.length;
        byte[] compressed = Encoding.compress(section.mContents);
        sectionContents.add(compressed);
        Encoding.writeUInt32(os, compressed.length);
        Encoding.writeUInt32(os, inflatedSize);
        offset2 = offset2 + ((long) compressed.length);
    L9:
        i = i + 1;
        goto L4
    L8:
        sectionContents.add(section.mContents);
        Encoding.writeUInt32(os, section.mContents.length);
        Encoding.writeUInt32(os, 0);
        offset2 = offset2 + ((long) section.mContents.length);
        goto L9
    L10:
        int i2 = 0;
    L12:
        if (i2 >= sectionContents.size()) goto L14;
        os.write(sectionContents.get(i2));
        i2 = i2 + 1;
        goto L12
    }

    private static WritableFileSection writeDexFileSection(DexProfileData[] profileData) throws IOException {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        int expectedSize = 0 + 2;
        Encoding.writeUInt16(out, profileData.length);     // Catch: Throwable -> L14
        int i = 0;
    L5:
        if (i >= profileData.length) goto L7;
        DexProfileData profile = profileData[i];     // Catch: Throwable -> L14
        Encoding.writeUInt32(out, profile.dexChecksum);     // Catch: Throwable -> L14
        Encoding.writeUInt32(out, profile.mTypeIdCount);     // Catch: Throwable -> L14
        Encoding.writeUInt32(out, profile.numMethodIds);     // Catch: Throwable -> L14
        String profileKey = generateDexKey(profile.apkName, profile.dexName, ProfileVersion.V015_S);     // Catch: Throwable -> L14
        int keyLength = Encoding.utf8Length(profileKey);     // Catch: Throwable -> L14
        Encoding.writeUInt16(out, keyLength);     // Catch: Throwable -> L14
        expectedSize = ((((expectedSize + 4) + 4) + 4) + 2) + (keyLength * 1);     // Catch: Throwable -> L14
        Encoding.writeString(out, profileKey);     // Catch: Throwable -> L14
        i = i + 1;     // Catch: Throwable -> L14
        goto L5
    L7:
        byte[] contents = out.toByteArray();     // Catch: Throwable -> L14
        if (expectedSize != contents.length) goto L13;
        WritableFileSection r3 = new WritableFileSection(FileSectionType.DEX_FILES, expectedSize, contents, false);     // Catch: Throwable -> L14
        out.close();
        return r3;
    L13:
        throw Encoding.error("Expected size " + expectedSize + ", does not match actual size " + contents.length);     // Catch: Throwable -> L14
    L14:
        th = move-exception;
        out.close();     // Catch: Throwable -> L17
    L19:
        throw th;
    L17:
        th = move-exception;
        th.addSuppressed(th);
        goto L19
    }

    private static WritableFileSection createCompressibleClassSection(DexProfileData[] profileData) throws IOException {
        int expectedSize = 0;
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        int i = 0;
    L19:
    L13:
        th = move-exception;
        out.close();     // Catch: Throwable -> L16
    L18:
        throw th;
    L16:
        th = move-exception;
        th.addSuppressed(th);
        goto L18
    L4:
        if (i >= profileData.length) goto L6;
        DexProfileData profile = profileData[i];     // Catch: Throwable -> L13
        Encoding.writeUInt16(out, i);     // Catch: Throwable -> L13
        Encoding.writeUInt16(out, profile.classSetSize);     // Catch: Throwable -> L13
        expectedSize = ((expectedSize + 2) + 2) + (profile.classSetSize * 2);     // Catch: Throwable -> L13
        writeClasses(out, profile);     // Catch: Throwable -> L13
        i = i + 1;     // Catch: Throwable -> L13
        goto L19
    L6:
        byte[] contents = out.toByteArray();     // Catch: Throwable -> L13
        if (expectedSize != contents.length) goto L12;
        WritableFileSection r3 = new WritableFileSection(FileSectionType.CLASSES, expectedSize, contents, true);     // Catch: Throwable -> L13
        out.close();
        return r3;
    L12:
        throw Encoding.error("Expected size " + expectedSize + ", does not match actual size " + contents.length);     // Catch: Throwable -> L13
    }

    private static WritableFileSection createCompressibleMethodsSection(DexProfileData[] profileData) throws IOException {
        int expectedSize = 0;
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        int i = 0;
    L21:
    L13:
        th = move-exception;
        out.close();     // Catch: Throwable -> L16
    L18:
        throw th;
    L16:
        th = move-exception;
        th.addSuppressed(th);
        goto L18
    L4:
        if (i >= profileData.length) goto L6;
        DexProfileData profile = profileData[i];     // Catch: Throwable -> L13
        int methodFlags = computeMethodFlags(profile);     // Catch: Throwable -> L13
        byte[] bitmapContents = createMethodBitmapRegionForS(methodFlags, profile);     // Catch: Throwable -> L13
        byte[] methodRegionContents = createMethodsWithInlineCaches(profile);     // Catch: Throwable -> L13
        Encoding.writeUInt16(out, i);     // Catch: Throwable -> L13
        int followingDataSize = (bitmapContents.length + 2) + methodRegionContents.length;     // Catch: Throwable -> L13
        Encoding.writeUInt32(out, followingDataSize);     // Catch: Throwable -> L13
        Encoding.writeUInt16(out, methodFlags);     // Catch: Throwable -> L13
        out.write(bitmapContents);     // Catch: Throwable -> L13
        out.write(methodRegionContents);     // Catch: Throwable -> L13
        expectedSize = ((expectedSize + 2) + 4) + followingDataSize;     // Catch: Throwable -> L13
        i = i + 1;     // Catch: Throwable -> L13
        goto L21
    L6:
        byte[] contents = out.toByteArray();     // Catch: Throwable -> L13
        if (expectedSize != contents.length) goto L12;
        WritableFileSection r3 = new WritableFileSection(FileSectionType.METHODS, expectedSize, contents, true);     // Catch: Throwable -> L13
        out.close();
        return r3;
    L12:
        throw Encoding.error("Expected size " + expectedSize + ", does not match actual size " + contents.length);     // Catch: Throwable -> L13
    }

    private static byte[] createMethodBitmapRegionForS(int methodFlags, DexProfileData profile) throws IOException {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        writeMethodBitmapForS(out, methodFlags, profile);     // Catch: Throwable -> L6
        byte[] r1 = out.toByteArray();     // Catch: Throwable -> L6
        out.close();
        return r1;
    L6:
        th = move-exception;
        out.close();     // Catch: Throwable -> L9
    L11:
        throw th;
    L9:
        th = move-exception;
        th.addSuppressed(th);
        goto L11
    }

    private static byte[] createMethodsWithInlineCaches(DexProfileData profile) throws IOException {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        writeMethodsWithInlineCaches(out, profile);     // Catch: Throwable -> L6
        byte[] r1 = out.toByteArray();     // Catch: Throwable -> L6
        out.close();
        return r1;
    L6:
        th = move-exception;
        out.close();     // Catch: Throwable -> L9
    L11:
        throw th;
    L9:
        th = move-exception;
        th.addSuppressed(th);
        goto L11
    }

    private static int computeMethodFlags(DexProfileData profileData) {
        int methodFlags = 0;
        Iterator<Map.Entry<Integer, Integer>> r1 = profileData.methods.entrySet().iterator();
    L4:
        if (r1.hasNext() == false) goto L6;
        Map.Entry<Integer, Integer> entry = r1.next();
        int flagValue = entry.getValue().intValue();
        methodFlags = methodFlags | flagValue;
        goto L4
    L6:
        return methodFlags;
    }

    private static void writeProfileForP(OutputStream os, DexProfileData[] lines) throws IOException {
        byte[] profileBytes = createCompressibleBody(lines, ProfileVersion.V010_P);
        Encoding.writeUInt8(os, lines.length);
        Encoding.writeCompressed(os, profileBytes);
    }

    private static void writeProfileForO_MR1(OutputStream os, DexProfileData[] lines) throws IOException {
        byte[] profileBytes = createCompressibleBody(lines, ProfileVersion.V009_O_MR1);
        Encoding.writeUInt8(os, lines.length);
        Encoding.writeCompressed(os, profileBytes);
    }

    private static void writeProfileForO(OutputStream os, DexProfileData[] lines) throws IOException {
        Encoding.writeUInt8(os, lines.length);
        int r0 = lines.length;
        int r2 = 0;
    L3:
        if (r2 >= r0) goto L12;
        DexProfileData data = lines[r2];
        int hotMethodRegionSize = data.methods.size() * 4;
        String dexKey = generateDexKey(data.apkName, data.dexName, ProfileVersion.V005_O);
        Encoding.writeUInt16(os, Encoding.utf8Length(dexKey));
        Encoding.writeUInt16(os, data.classes.length);
        Encoding.writeUInt32(os, hotMethodRegionSize);
        Encoding.writeUInt32(os, data.dexChecksum);
        Encoding.writeString(os, dexKey);
        Iterator<Integer> r6 = data.methods.keySet().iterator();
    L6:
        if (r6.hasNext() == false) goto L8;
        int id = r6.next().intValue();
        Encoding.writeUInt16(os, id);
        Encoding.writeUInt16(os, 0);
        goto L6
    L8:
        int[] r7 = data.classes;
        int r8 = r7.length;
        int r9 = 0;
    L9:
        if (r9 >= r8) goto L11;
        int id2 = r7[r9];
        Encoding.writeUInt16(os, id2);
        r9 = r9 + 1;
        goto L9
    L11:
        r2 = r2 + 1;
        goto L3
    }

    private static byte[] createCompressibleBody(DexProfileData[] lines, byte[] version) throws IOException {
        int requiredCapacity = 0;
        int r1 = lines.length;
        int r2 = 0;
        int r3 = 0;
    L3:
        if (r3 >= r1) goto L5;
        DexProfileData data = lines[r3];
        String dexKey = generateDexKey(data.apkName, data.dexName, version);
        requiredCapacity = requiredCapacity + ((((Encoding.utf8Length(dexKey) + 16) + (data.classSetSize * 2)) + data.hotMethodRegionSize) + getMethodBitmapStorageSize(data.numMethodIds));
        r3 = r3 + 1;
        goto L3
    L5:
        ByteArrayOutputStream dataBos = new ByteArrayOutputStream(requiredCapacity);
        if (Arrays.equals(version, ProfileVersion.V009_O_MR1) == false) goto L10;
        int r4 = lines.length;
    L8:
        if (r2 >= r4) goto L17;
        DexProfileData data2 = lines[r2];
        String dexKey2 = generateDexKey(data2.apkName, data2.dexName, version);
        writeLineHeader(dataBos, data2, dexKey2);
        writeLineData(dataBos, data2);
        r2 = r2 + 1;
    L17:
        if (dataBos.size() != requiredCapacity) goto L21;
        return dataBos.toByteArray();
    L21:
        throw Encoding.error("The bytes saved do not match expectation. actual=" + dataBos.size() + " expected=" + requiredCapacity);
    L10:
        int r5 = lines.length;
        int r6 = 0;
    L11:
        if (r6 >= r5) goto L13;
        DexProfileData data3 = lines[r6];
        String dexKey3 = generateDexKey(data3.apkName, data3.dexName, version);
        writeLineHeader(dataBos, data3, dexKey3);
        r6 = r6 + 1;
        goto L11
    L13:
        int r7 = lines.length;
    L14:
        if (r2 >= r7) goto L17;
        writeLineData(dataBos, lines[r2]);
        r2 = r2 + 1;
        goto L14
    }

    private static int getMethodBitmapStorageSize(int numMethodIds) {
        int methodBitmapBits = numMethodIds * 2;
        return roundUpToByte(methodBitmapBits) / 8;
    }

    private static int getMethodBitmapStorageSizeForS(int methodFlags, int numMethodIds) {
        int bits = Integer.bitCount(methodFlags & (-2));
        int methodBitmapBits = bits * numMethodIds;
        return roundUpToByte(methodBitmapBits) / 8;
    }

    private static int roundUpToByte(int bits) {
        return ((bits + 8) - 1) & (-8);
    }

    private static void setMethodBitmapBit(byte[] bitmap, int flag, int methodIndex, DexProfileData dexData) {
        int bitIndex = methodFlagBitmapIndex(flag, methodIndex, dexData.numMethodIds);
        int bitmapIndex = bitIndex / 8;
        byte value = (byte) (bitmap[bitmapIndex] | (1 << (bitIndex % 8)));
        bitmap[bitmapIndex] = value;
    }

    private static void writeLineHeader(OutputStream os, DexProfileData dexData, String dexKey) throws IOException {
        Encoding.writeUInt16(os, Encoding.utf8Length(dexKey));
        Encoding.writeUInt16(os, dexData.classSetSize);
        Encoding.writeUInt32(os, dexData.hotMethodRegionSize);
        Encoding.writeUInt32(os, dexData.dexChecksum);
        Encoding.writeUInt32(os, dexData.numMethodIds);
        Encoding.writeString(os, dexKey);
    }

    private static void writeLineData(OutputStream os, DexProfileData dexData) throws IOException {
        writeMethodsWithInlineCaches(os, dexData);
        writeClasses(os, dexData);
        writeMethodBitmap(os, dexData);
    }

    private static void writeMethodsWithInlineCaches(OutputStream os, DexProfileData dexData) throws IOException {
        int lastMethodIndex = 0;
        Iterator<Map.Entry<Integer, Integer>> r1 = dexData.methods.entrySet().iterator();
    L4:
        if (r1.hasNext() == false) goto L9;
        Map.Entry<Integer, Integer> entry = r1.next();
        int methodId = entry.getKey().intValue();
        int flags = entry.getValue().intValue();
        if ((flags & 1) == 0) goto L4;
        int diffWithTheLastMethodIndex = methodId - lastMethodIndex;
        Encoding.writeUInt16(os, diffWithTheLastMethodIndex);
        Encoding.writeUInt16(os, 0);
        lastMethodIndex = methodId;
        goto L4
    }

    private static void writeClasses(OutputStream os, DexProfileData dexData) throws IOException {
        int lastClassIndex = 0;
        int[] r1 = dexData.classes;
        int r2 = r1.length;
        int r3 = 0;
    L3:
        if (r3 >= r2) goto L5;
        Integer classIndex = Integer.valueOf(r1[r3]);
        int diffWithTheLastClassIndex = classIndex.intValue() - lastClassIndex;
        Encoding.writeUInt16(os, diffWithTheLastClassIndex);
        lastClassIndex = classIndex.intValue();
        r3 = r3 + 1;
        goto L3
    }

    private static void writeMethodBitmapForS(OutputStream os, int methodFlags, DexProfileData dexData) throws IOException {
        int methodBitmapStorageSize = getMethodBitmapStorageSizeForS(methodFlags, dexData.numMethodIds);
        byte[] bitmap = new byte[methodBitmapStorageSize];
        Iterator<Map.Entry<Integer, Integer>> r2 = dexData.methods.entrySet().iterator();
    L4:
        if (r2.hasNext() == false) goto L19;
        Map.Entry<Integer, Integer> entry = r2.next();
        int methodIndex = entry.getKey().intValue();
        int flagValue = entry.getValue().intValue();
        int offset = 0;
        int flag = 1;
    L7:
        if (flag > 4) goto L4;
        if (flag == 1) goto L10;
        if ((flag & methodFlags) == 0) goto L13;
        if ((flag & flagValue) != flag) goto L17;
        int bitIndex = (dexData.numMethodIds * offset) + methodIndex;
        int bitmapIndex = bitIndex / 8;
        int r8 = 1 << (bitIndex % 8);
        byte value = (byte) (r8 | bitmap[bitmapIndex]);
        bitmap[bitmapIndex] = value;
    L17:
        offset = offset + 1;
        flag = flag << 1;
        goto L7
    L13:
        flag = flag << 1;
        goto L7
    L10:
        flag = flag << 1;
        goto L7
    L19:
        os.write(bitmap);
    }

    private static void writeMethodBitmap(OutputStream os, DexProfileData dexData) throws IOException {
        byte[] bitmap = new byte[getMethodBitmapStorageSize(dexData.numMethodIds)];
        Iterator<Map.Entry<Integer, Integer>> r1 = dexData.methods.entrySet().iterator();
    L4:
        if (r1.hasNext() == false) goto L12;
        Map.Entry<Integer, Integer> entry = r1.next();
        int methodIndex = entry.getKey().intValue();
        int flagValue = entry.getValue().intValue();
        if ((flagValue & 2) == 0) goto L9;
        setMethodBitmapBit(bitmap, 2, methodIndex, dexData);
    L9:
        if ((flagValue & 4) == 0) goto L4;
        setMethodBitmapBit(bitmap, 4, methodIndex, dexData);
        goto L4
    L12:
        os.write(bitmap);
    }

    static DexProfileData[] readProfile(InputStream is, byte[] version, String apkName) throws IOException {
        if (Arrays.equals(version, ProfileVersion.V010_P) == false) goto L19;
        int numberOfDexFiles = Encoding.readUInt8(is);
        long uncompressedDataSize = Encoding.readUInt32(is);
        long compressedDataSize = Encoding.readUInt32(is);
        byte[] uncompressedData = Encoding.readCompressed(is, (int) compressedDataSize, (int) uncompressedDataSize);
        if (is.read() > 0) goto L17;
        InputStream dataStream = new ByteArrayInputStream(uncompressedData);
        DexProfileData[] r7 = readUncompressedBody(dataStream, apkName, numberOfDexFiles);     // Catch: Throwable -> L10
        dataStream.close();
        return r7;
    L10:
        th = move-exception;
        dataStream.close();     // Catch: Throwable -> L13
    L15:
        throw th;
    L13:
        th = move-exception;
        th.addSuppressed(th);
        goto L15
    L17:
        throw Encoding.error("Content found after the end of file");
    L19:
        throw Encoding.error("Unsupported version");
    }

    static DexProfileData[] readMeta(InputStream is, byte[] metadataVersion, byte[] desiredProfileVersion, DexProfileData[] profile) throws IOException {
        if (Arrays.equals(metadataVersion, ProfileVersion.METADATA_V001_N) == false) goto L11;
        boolean requiresProfileV015 = Arrays.equals(ProfileVersion.V015_S, desiredProfileVersion);
        if (requiresProfileV015 == true) goto L9;
        return readMetadata001(is, metadataVersion, profile);
    L9:
        throw Encoding.error("Requires new Baseline Profile Metadata. Please rebuild the APK with Android Gradle Plugin 7.2 Canary 7 or higher");
    L11:
        if (Arrays.equals(metadataVersion, ProfileVersion.METADATA_V002) == false) goto L15;
        return readMetadataV002(is, desiredProfileVersion, profile);
    L15:
        throw Encoding.error("Unsupported meta version");
    }

    static DexProfileData[] readMetadata001(InputStream is, byte[] metadataVersion, DexProfileData[] profile) throws IOException {
        if (Arrays.equals(metadataVersion, ProfileVersion.METADATA_V001_N) == false) goto L19;
        int numberOfDexFiles = Encoding.readUInt8(is);
        long uncompressedDataSize = Encoding.readUInt32(is);
        long compressedDataSize = Encoding.readUInt32(is);
        byte[] uncompressedData = Encoding.readCompressed(is, (int) compressedDataSize, (int) uncompressedDataSize);
        if (is.read() > 0) goto L17;
        InputStream dataStream = new ByteArrayInputStream(uncompressedData);
        DexProfileData[] r7 = readMetadataForNBody(dataStream, numberOfDexFiles, profile);     // Catch: Throwable -> L10
        dataStream.close();
        return r7;
    L10:
        th = move-exception;
        dataStream.close();     // Catch: Throwable -> L13
    L15:
        throw th;
    L13:
        th = move-exception;
        th.addSuppressed(th);
        goto L15
    L17:
        throw Encoding.error("Content found after the end of file");
    L19:
        throw Encoding.error("Unsupported meta version");
    }

    static DexProfileData[] readMetadataV002(InputStream is, byte[] desiredProfileVersion, DexProfileData[] profile) throws IOException {
        int dexFileCount = Encoding.readUInt16(is);
        long uncompressed = Encoding.readUInt32(is);
        long compressed = Encoding.readUInt32(is);
        byte[] contents = Encoding.readCompressed(is, (int) compressed, (int) uncompressed);
        if (is.read() > 0) goto L15;
        InputStream dataStream = new ByteArrayInputStream(contents);
        DexProfileData[] r7 = readMetadataV002Body(dataStream, desiredProfileVersion, dexFileCount, profile);     // Catch: Throwable -> L8
        dataStream.close();
        return r7;
    L8:
        th = move-exception;
        dataStream.close();     // Catch: Throwable -> L11
    L13:
        throw th;
    L11:
        th = move-exception;
        th.addSuppressed(th);
        goto L13
    L15:
        throw Encoding.error("Content found after the end of file");
    }

    private static DexProfileData[] readMetadataV002Body(InputStream is, byte[] desiredProfileVersion, int dexFileCount, DexProfileData[] profile) throws IOException {
        if (is.available() != 0) goto L7;
        return new DexProfileData[0];
    L7:
        if (dexFileCount != profile.length) goto L20;
        int i = 0;
    L9:
        if (i >= dexFileCount) goto L18;
        Encoding.readUInt16(is);
        int profileKeySize = Encoding.readUInt16(is);
        String profileKey = Encoding.readString(is, profileKeySize);
        long typeIdCount = Encoding.readUInt32(is);
        int classIdSetSize = Encoding.readUInt16(is);
        DexProfileData data = findByDexName(profile, profileKey);
        if (data == null) goto L17;
        data.mTypeIdCount = typeIdCount;
        int[] classes = readClasses(is, classIdSetSize);
        if (Arrays.equals(desiredProfileVersion, ProfileVersion.V001_N) == false) goto L15;
        data.classSetSize = classIdSetSize;
        data.classes = classes;
    L15:
        i = i + 1;
        goto L9
    L17:
        throw Encoding.error("Missing profile key: " + profileKey);
    L18:
        return profile;
    L20:
        throw Encoding.error("Mismatched number of dex files found in metadata");
    }

    private static DexProfileData findByDexName(DexProfileData[] profile, String profileKey) {
        if (profile.length > 0) goto L5;
        return null;
    L5:
        String dexName = extractKey(profileKey);
        int i = 0;
    L7:
        if (i >= profile.length) goto L13;
        if (profile[i].dexName.equals(dexName) == true) goto L11;
        i = i + 1;
        goto L7
    L11:
        return profile[i];
    L13:
        return null;
    }

    private static DexProfileData[] readMetadataForNBody(InputStream is, int numberOfDexFiles, DexProfileData[] profile) throws IOException {
        if (is.available() != 0) goto L7;
        return new DexProfileData[0];
    L7:
        if (numberOfDexFiles != profile.length) goto L20;
        String[] names = new String[numberOfDexFiles];
        int[] sizes = new int[numberOfDexFiles];
        int i = 0;
    L9:
        if (i >= numberOfDexFiles) goto L11;
        int dexNameSize = Encoding.readUInt16(is);
        sizes[i] = Encoding.readUInt16(is);
        names[i] = Encoding.readString(is, dexNameSize);
        i = i + 1;
        goto L9
    L11:
        int i2 = 0;
    L12:
        if (i2 >= numberOfDexFiles) goto L18;
        DexProfileData data = profile[i2];
        if (data.dexName.equals(names[i2]) == false) goto L17;
        data.classSetSize = sizes[i2];
        data.classes = readClasses(is, data.classSetSize);
        i2 = i2 + 1;
        goto L12
    L17:
        throw Encoding.error("Order of dexfiles in metadata did not match baseline");
    L18:
        return profile;
    L20:
        throw Encoding.error("Mismatched number of dex files found in metadata");
    }

    private static String generateDexKey(String apkName, String dexName, byte[] version) {
        String separator = ProfileVersion.dexKeySeparator(version);
        if (apkName.length() > 0) goto L7;
        return enforceSeparator(dexName, separator);
    L7:
        if (dexName.equals("classes.dex") == false) goto L10;
        return apkName;
    L10:
        if (dexName.contains("!") == true) goto L20;
        if (dexName.contains(":") == true) goto L20;
        if (dexName.endsWith(".apk") == false) goto L18;
        return dexName;
    L18:
        return apkName + ProfileVersion.dexKeySeparator(version) + dexName;
    L20:
        return enforceSeparator(dexName, separator);
    }

    private static String enforceSeparator(String value, String separator) {
        if ("!".equals(separator) == false) goto L7;
        return value.replace(":", "!");
    L7:
        if (":".equals(separator) == true) goto L9;
        return value;
    L9:
        return value.replace("!", ":");
    }

    private static String extractKey(String profileKey) {
        int index = profileKey.indexOf("!");
        if (index >= 0) goto L5;
        index = profileKey.indexOf(":");
    L5:
        if (index > 0) goto L7;
        return profileKey;
    L7:
        return profileKey.substring(index + 1);
    }

    private static DexProfileData[] readUncompressedBody(InputStream is, String apkName, int numberOfDexFiles) throws IOException {
        int r3 = 0;
        if (is.available() == 0) goto L5;
        DexProfileData[] lines = new DexProfileData[numberOfDexFiles];
        int i = 0;
    L7:
        if (i >= numberOfDexFiles) goto L9;
        int dexNameSize = Encoding.readUInt16(is);
        int classSetSize = Encoding.readUInt16(is);
        long hotMethodRegionSize = Encoding.readUInt32(is);
        long dexChecksum = Encoding.readUInt32(is);
        long numMethodIds = Encoding.readUInt32(is);
        lines[i] = new DexProfileData(apkName, Encoding.readString(is, dexNameSize), dexChecksum, 0, classSetSize, (int) hotMethodRegionSize, (int) numMethodIds, new int[classSetSize], new TreeMap());
        i = i + 1;
        goto L7
    L9:
        int i2 = lines.length;
    L10:
        if (r3 >= i2) goto L12;
        DexProfileData data = lines[r3];
        readHotMethodRegion(is, data);
        data.classes = readClasses(is, data.classSetSize);
        readMethodBitmap(is, data);
        r3 = r3 + 1;
        goto L10
    L12:
        return lines;
    L5:
        return new DexProfileData[0];
    }

    private static void readHotMethodRegion(InputStream is, DexProfileData data) throws IOException {
        int expectedBytesAvailableAfterRead = is.available() - data.hotMethodRegionSize;
        int lastMethodIndex = 0;
    L4:
        if (is.available() <= expectedBytesAvailableAfterRead) goto L10;
        int diffWithLastMethodDexIndex = Encoding.readUInt16(is);
        int methodDexIndex = lastMethodIndex + diffWithLastMethodDexIndex;
        data.methods.put(Integer.valueOf(methodDexIndex), 1);
        int inlineCacheSize = Encoding.readUInt16(is);
    L6:
        if (inlineCacheSize <= 0) goto L8;
        skipInlineCache(is);
        inlineCacheSize = inlineCacheSize - 1;
        goto L6
    L8:
        lastMethodIndex = methodDexIndex;
        goto L4
    L10:
        if (is.available() != expectedBytesAvailableAfterRead) goto L13;
        return;
    L13:
        throw Encoding.error("Read too much data during profile line parse");
    }

    private static void skipInlineCache(InputStream is) throws IOException {
        Encoding.readUInt16(is);
        int dexPcMapSize = Encoding.readUInt8(is);
        if (dexPcMapSize != 6) goto L6;
        return;
    L6:
        if (dexPcMapSize != 7) goto L8;
        return;
    L8:
        if (dexPcMapSize <= 0) goto L13;
        Encoding.readUInt8(is);
        int numClasses = Encoding.readUInt8(is);
    L10:
        if (numClasses <= 0) goto L12;
        Encoding.readUInt16(is);
        numClasses = numClasses - 1;
        goto L10
    L12:
        dexPcMapSize = dexPcMapSize - 1;
        goto L8
    }

    private static int[] readClasses(InputStream is, int classSetSize) throws IOException {
        int[] classes = new int[classSetSize];
        int lastClassIndex = 0;
        int k = 0;
    L3:
        if (k >= classSetSize) goto L5;
        int diffWithTheLastClassIndex = Encoding.readUInt16(is);
        int classDexIndex = lastClassIndex + diffWithTheLastClassIndex;
        classes[k] = classDexIndex;
        lastClassIndex = classDexIndex;
        k = k + 1;
        goto L3
    L5:
        return classes;
    }

    private static void readMethodBitmap(InputStream is, DexProfileData data) throws IOException {
        int methodBitmapStorageSize = Encoding.bitsToBytes(data.numMethodIds * 2);
        byte[] methodBitmap = Encoding.read(is, methodBitmapStorageSize);
        BitSet bs = BitSet.valueOf(methodBitmap);
        int methodIndex = 0;
    L4:
        if (methodIndex >= data.numMethodIds) goto L12;
        int newFlags = readFlagsFromBitmap(bs, methodIndex, data.numMethodIds);
        if (newFlags == 0) goto L11;
        Integer current = data.methods.get(Integer.valueOf(methodIndex));
        if (current != null) goto L10;
        current = 0;
    L10:
        data.methods.put(Integer.valueOf(methodIndex), Integer.valueOf(current.intValue() | newFlags));
    L11:
        methodIndex = methodIndex + 1;
        goto L4
    }

    private static int readFlagsFromBitmap(BitSet bs, int methodIndex, int numMethodIds) {
        int result = 0;
        if (bs.get(methodFlagBitmapIndex(2, methodIndex, numMethodIds)) == false) goto L6;
        result = 0 | 2;
    L6:
        if (bs.get(methodFlagBitmapIndex(4, methodIndex, numMethodIds)) == true) goto L8;
        return result;
    L8:
        return result | 4;
    }

    private static int methodFlagBitmapIndex(int flag, int methodIndex, int numMethodIds) {
        switch(flag) {
            case 1: goto L9;
            case 2: goto L7;
            case 3: goto L4;
            case 4: goto L6;
            default: goto L4;
        };
    L7:
        return methodIndex;
    L4:
        throw Encoding.error("Unexpected flag: " + flag);
    L6:
        return methodIndex + numMethodIds;
    L9:
        throw Encoding.error("HOT methods are not stored in the bitmap");
    }
}
