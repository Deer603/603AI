package kotlin.io.path;

import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: PathTreeWalk.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000$\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\u001a%\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0002¢\u0006\u0002\u0010\u0007\u001a\f\u0010\b\u001a\u00020\t*\u00020\nH\u0002¨\u0006\u000b"}, d2 = {"keyOf", "", "path", "Ljava/nio/file/Path;", "linkOptions", "", "Ljava/nio/file/LinkOption;", "(Ljava/nio/file/Path;[Ljava/nio/file/LinkOption;)Ljava/lang/Object;", "createsCycle", "", "Lkotlin/io/path/PathNode;", "kotlin-stdlib-jdk7"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class PathTreeWalkKt {
    public static final /* synthetic */ boolean access$createsCycle(PathNode $receiver) {
        return createsCycle($receiver);
    }

    public static final /* synthetic */ Object access$keyOf(Path path, LinkOption[] linkOptions) {
        return keyOf(path, linkOptions);
    }

    private static final Object keyOf(Path path, LinkOption[] linkOptions) {
        LinkOption[] r0 = (LinkOption[]) Arrays.copyOf(linkOptions, linkOptions.length);     // Catch: Throwable -> L4
        BasicFileAttributes r1 = Files.readAttributes(path, BasicFileAttributes.class, (LinkOption[]) Arrays.copyOf(r0, r0.length));     // Catch: Throwable -> L4
        Intrinsics.checkNotNullExpressionValue(r1, "readAttributes(...)");     // Catch: Throwable -> L4
        return r1.fileKey();
    L6:
        return null;
    }

    private static final boolean createsCycle(PathNode $this$createsCycle) {
        PathNode ancestor = $this$createsCycle.getParent();
    L3:
        if (ancestor == null) goto L19;
        if (ancestor.getKey() != null) goto L7;
    L21:
        if (Files.isSameFile(ancestor.getPath(), $this$createsCycle.getPath()) == false) goto L18;
        return true;
    L18:
        ancestor = ancestor.getParent();
        goto L3
    L7:
        if ($this$createsCycle.getKey() == null) goto L21;
        if (Intrinsics.areEqual(ancestor.getKey(), $this$createsCycle.getKey()) == false) goto L18;
        return true;
    L19:
        return false;
    }
}
