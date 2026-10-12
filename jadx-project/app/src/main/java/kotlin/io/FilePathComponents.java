package kotlin.io;

import java.io.File;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: FilePathComponents.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000e\b\u0080\b\u0018\u00002\u00020\u0001B\u001f\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0016\u0010\u0017\u001a\u00020\u00032\u0006\u0010\u0018\u001a\u00020\u00142\u0006\u0010\u0019\u001a\u00020\u0014J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005HÆ\u0003J(\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005HÀ\u0001¢\u0006\u0002\b\u001dJ\u0013\u0010\u001e\u001a\u00020\u00112\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010 \u001a\u00020\u0014HÖ\u0001J\t\u0010!\u001a\u00020\rHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\f\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0010\u001a\u00020\u00118F¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0012R\u0011\u0010\u0013\u001a\u00020\u00148F¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016¨\u0006\""}, d2 = {"Lkotlin/io/FilePathComponents;", "", "root", "Ljava/io/File;", "segments", "", "<init>", "(Ljava/io/File;Ljava/util/List;)V", "getRoot", "()Ljava/io/File;", "getSegments", "()Ljava/util/List;", "rootName", "", "getRootName", "()Ljava/lang/String;", "isRooted", "", "()Z", "size", "", "getSize", "()I", "subPath", "beginIndex", "endIndex", "component1", "component2", "copy", "copy$kotlin_stdlib", "equals", "other", "hashCode", "toString", "kotlin-stdlib"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class FilePathComponents {
    private final File root;
    private final List<File> segments;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ FilePathComponents copy$kotlin_stdlib$default(FilePathComponents r0, File r1, List r2, int r3, Object r4) {
        if ((r3 & 1) == 0) goto L6;
        r1 = r0.root;
    L6:
        if ((r3 & 2) == 0) goto L9;
        r2 = r0.segments;
    L9:
        return r0.copy$kotlin_stdlib(r1, r2);
    }

    public final File component1() {
        return this.root;
    }

    public final List<File> component2() {
        return this.segments;
    }

    public final FilePathComponents copy$kotlin_stdlib(File r2, List<? extends File> r3) {
        Intrinsics.checkNotNullParameter(r2, "root");
        Intrinsics.checkNotNullParameter(r3, "segments");
        return new FilePathComponents(r2, r3);
    }

    public boolean equals(Object r6) {
        if (this != r6) goto L6;
        return true;
    L6:
        if ((r6 instanceof FilePathComponents) == true) goto L8;
        return false;
    L8:
        FilePathComponents r1 = (FilePathComponents) r6;
        if (Intrinsics.areEqual(this.root, r1.root) == true) goto L12;
        return false;
    L12:
        if (Intrinsics.areEqual(this.segments, r1.segments) == true) goto L14;
        return false;
    L14:
        return true;
    }

    public int hashCode() {
        return (this.root.hashCode() * 31) + this.segments.hashCode();
    }

    public String toString() {
        return "FilePathComponents(root=" + this.root + ", segments=" + this.segments + ')';
    }

    /* JADX WARN: Multi-variable type inference failed */
    public FilePathComponents(File root, List<? extends File> r3) {
        Intrinsics.checkNotNullParameter(root, "root");
        Intrinsics.checkNotNullParameter(r3, "segments");
        this.root = root;
        this.segments = r3;
    }

    public final File getRoot() {
        return this.root;
    }

    public final List<File> getSegments() {
        return this.segments;
    }

    public final String getRootName() {
        String r0 = this.root.getPath();
        Intrinsics.checkNotNullExpressionValue(r0, "getPath(...)");
        return r0;
    }

    public final boolean isRooted() {
        String r0 = this.root.getPath();
        Intrinsics.checkNotNullExpressionValue(r0, "getPath(...)");
        if (r0.length() <= 0) goto L5;
        return true;
    L5:
        return false;
    }

    public final int getSize() {
        return this.segments.size();
    }

    public final File subPath(int beginIndex, int endIndex) {
        if (beginIndex < 0) goto L9;
        if (beginIndex > endIndex) goto L9;
        if (endIndex > getSize()) goto L9;
        List<File> r2 = this.segments.subList(beginIndex, endIndex);
        String r1 = File.separator;
        Intrinsics.checkNotNullExpressionValue(r1, "separator");
        return new File(CollectionsKt.joinToString$default(r2, r1, null, null, 0, null, null, 62, null));
    L9:
        throw new IllegalArgumentException();
    }
}
