package androidx.emoji2.text;

import android.content.res.AssetManager;
import android.graphics.Typeface;
import android.util.SparseArray;
import androidx.core.os.TraceCompat;
import androidx.core.util.Preconditions;
import androidx.emoji2.text.flatbuffer.MetadataList;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes4.dex */
public final class MetadataRepo {
    private static final int DEFAULT_ROOT_SIZE = 1024;
    private static final String S_TRACE_CREATE_REPO = "EmojiCompat.MetadataRepo.create";
    private final char[] mEmojiCharArray;
    private final MetadataList mMetadataList;
    private final Node mRootNode;
    private final Typeface mTypeface;

    static class Node {
        private final SparseArray<Node> mChildren;
        private TypefaceEmojiRasterizer mData;

        private Node() {
            this(1);
        }

        Node(int defaultChildrenSize) {
            this.mChildren = new SparseArray(defaultChildrenSize);
        }

        Node get(int key) {
            if (this.mChildren != null) goto L6;
            return null;
        L6:
            return this.mChildren.get(key);
        }

        final TypefaceEmojiRasterizer getData() {
            return this.mData;
        }

        void put(TypefaceEmojiRasterizer data, int start, int end) {
            Node node = get(data.getCodepointAt(start));
            if (node != null) goto L5;
            node = new Node();
            this.mChildren.put(data.getCodepointAt(start), node);
        L5:
            if (end <= start) goto L7;
            node.put(data, start + 1, end);
            return;
        L7:
            node.mData = data;
        }
    }

    private MetadataRepo(Typeface typeface, MetadataList metadataList) {
        this.mTypeface = typeface;
        this.mMetadataList = metadataList;
        this.mRootNode = new Node(1024);
        this.mEmojiCharArray = new char[this.mMetadataList.listLength() * 2];
        constructIndex(this.mMetadataList);
    }

    public static MetadataRepo create(Typeface typeface) {
        TraceCompat.beginSection(S_TRACE_CREATE_REPO);     // Catch: Throwable -> L5
        MetadataRepo r0 = new MetadataRepo(typeface, new MetadataList());     // Catch: Throwable -> L5
        TraceCompat.endSection();
        return r0;
    L5:
        th = move-exception;
        TraceCompat.endSection();
        throw th;
    }

    public static MetadataRepo create(Typeface typeface, InputStream inputStream) throws IOException {
        TraceCompat.beginSection(S_TRACE_CREATE_REPO);     // Catch: Throwable -> L5
        MetadataRepo r0 = new MetadataRepo(typeface, MetadataListReader.read(inputStream));     // Catch: Throwable -> L5
        TraceCompat.endSection();
        return r0;
    L5:
        th = move-exception;
        TraceCompat.endSection();
        throw th;
    }

    public static MetadataRepo create(Typeface typeface, ByteBuffer byteBuffer) throws IOException {
        TraceCompat.beginSection(S_TRACE_CREATE_REPO);     // Catch: Throwable -> L5
        MetadataRepo r0 = new MetadataRepo(typeface, MetadataListReader.read(byteBuffer));     // Catch: Throwable -> L5
        TraceCompat.endSection();
        return r0;
    L5:
        th = move-exception;
        TraceCompat.endSection();
        throw th;
    }

    public static MetadataRepo create(AssetManager assetManager, String assetPath) throws IOException {
        TraceCompat.beginSection(S_TRACE_CREATE_REPO);     // Catch: Throwable -> L5
        Typeface typeface = Typeface.createFromAsset(assetManager, assetPath);     // Catch: Throwable -> L5
        MetadataRepo r1 = new MetadataRepo(typeface, MetadataListReader.read(assetManager, assetPath));     // Catch: Throwable -> L5
        TraceCompat.endSection();
        return r1;
    L5:
        th = move-exception;
        TraceCompat.endSection();
        throw th;
    }

    private void constructIndex(MetadataList metadataList) {
        int length = metadataList.listLength();
        int i = 0;
    L3:
        if (i >= length) goto L5;
        TypefaceEmojiRasterizer metadata = new TypefaceEmojiRasterizer(this, i);
        Character.toChars(metadata.getId(), this.mEmojiCharArray, i * 2);
        put(metadata);
        i = i + 1;
        goto L3
    }

    Typeface getTypeface() {
        return this.mTypeface;
    }

    int getMetadataVersion() {
        return this.mMetadataList.version();
    }

    Node getRootNode() {
        return this.mRootNode;
    }

    public char[] getEmojiCharArray() {
        return this.mEmojiCharArray;
    }

    public MetadataList getMetadataList() {
        return this.mMetadataList;
    }

    void put(TypefaceEmojiRasterizer data) {
        Preconditions.checkNotNull(data, "emoji metadata cannot be null");
        if (data.getCodepointsLength() <= 0) goto L5;
        boolean r0 = true;
    L6:
        Preconditions.checkArgument(r0, "invalid metadata codepoint length");
        this.mRootNode.put(data, 0, data.getCodepointsLength() - 1);
        return;
    L5:
        r0 = false;
        goto L6
    }
}
