package kotlin.io.path;

import java.nio.file.Path;
import java.nio.file.Paths;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: compiled from: PathUtils.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u0005R\u0016\u0010\u0004\u001a\n \u0006*\u0004\u0018\u00010\u00050\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0007\u001a\n \u0006*\u0004\u0018\u00010\u00050\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lkotlin/io/path/PathRelativizer;", "", "<init>", "()V", "emptyPath", "Ljava/nio/file/Path;", "kotlin.jvm.PlatformType", "parentPath", "tryRelativeTo", "path", "base", "kotlin-stdlib-jdk7"}, k = 1, mv = {2, 2, 0}, xi = 48)
final class PathRelativizer {
    public static final PathRelativizer INSTANCE = null;
    private static final Path emptyPath = null;
    private static final Path parentPath = null;

    private PathRelativizer() {
    }

    static {
        INSTANCE = new PathRelativizer();
        emptyPath = Paths.get("", new String[0]);
        parentPath = Paths.get("..", new String[0]);
    }

    public final Path tryRelativeTo(Path path, Path base) {
        Intrinsics.checkNotNullParameter(path, "path");
        Intrinsics.checkNotNullParameter(base, "base");
        Path bn = base.normalize();
        Path pn = path.normalize();
        Path rn = bn.relativize(pn);
        int i = 0;
        int r4 = Math.min(bn.getNameCount(), pn.getNameCount());
    L3:
        if (i >= r4) goto L12;
        if (Intrinsics.areEqual(bn.getName(i), parentPath) == false) goto L12;
        if (Intrinsics.areEqual(pn.getName(i), parentPath) == false) goto L10;
        i = i + 1;
        goto L3
    L10:
        throw new IllegalArgumentException("Unable to compute relative path");
    L12:
        if (Intrinsics.areEqual(pn, bn) == false) goto L14;
    L16:
        String rnString = rn.toString();
        String r5 = rn.getFileSystem().getSeparator();
        Intrinsics.checkNotNullExpressionValue(r5, "getSeparator(...)");
        if (StringsKt.endsWith$default(rnString, r5, false, 2, null) == false) goto L19;
        Path r = rn.getFileSystem().getPath(StringsKt.dropLast(rnString, rn.getFileSystem().getSeparator().length()), new String[0]);
    L20:
        Intrinsics.checkNotNull(r);
        return r;
    L19:
        r = rn;
        goto L20
    L14:
        if (Intrinsics.areEqual(bn, emptyPath) == false) goto L16;
        r = pn;
        goto L20
    }
}
