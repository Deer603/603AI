package kotlin.io;

import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: compiled from: FilePathComponents.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000&\n\u0000\n\u0002\u0010\b\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0011\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0002¢\u0006\u0002\b\u0003\u001a\f\u0010\u000e\u001a\u00020\u000f*\u00020\u0005H\u0000\u001a\u001c\u0010\u0010\u001a\u00020\u0005*\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u00012\u0006\u0010\u0012\u001a\u00020\u0001H\u0000\"\u0018\u0010\u0004\u001a\u00020\u0002*\u00020\u00058@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007\"\u0018\u0010\b\u001a\u00020\u0005*\u00020\u00058@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\n\"\u0015\u0010\u000b\u001a\u00020\f*\u00020\u00058F¢\u0006\u0006\u001a\u0004\b\u000b\u0010\r¨\u0006\u0013"}, d2 = {"getRootLength", "", "", "getRootLength$FilesKt__FilePathComponentsKt", "rootName", "Ljava/io/File;", "getRootName", "(Ljava/io/File;)Ljava/lang/String;", "root", "getRoot", "(Ljava/io/File;)Ljava/io/File;", "isRooted", "", "(Ljava/io/File;)Z", "toComponents", "Lkotlin/io/FilePathComponents;", "subPath", "beginIndex", "endIndex", "kotlin-stdlib"}, k = 5, mv = {2, 2, 0}, xi = 49, xs = "kotlin/io/FilesKt")
class FilesKt__FilePathComponentsKt {
    public FilesKt__FilePathComponentsKt() {
    }

    private static final int getRootLength$FilesKt__FilePathComponentsKt(String $this$getRootLength) {
        int first = StringsKt.indexOf$default($this$getRootLength, File.separatorChar, 0, false, 4, null);
        if (first != 0) goto L18;
        if ($this$getRootLength.length() > 1) goto L7;
    L16:
        return 1;
    L7:
        if ($this$getRootLength.charAt(1) != File.separatorChar) goto L16;
        int first2 = StringsKt.indexOf$default($this$getRootLength, File.separatorChar, 2, false, 4, null);
        if (first2 < 0) goto L16;
        int first3 = StringsKt.indexOf$default($this$getRootLength, File.separatorChar, first2 + 1, false, 4, null);
        if (first3 < 0) goto L15;
        return first3 + 1;
    L15:
        return $this$getRootLength.length();
    L18:
        if (first <= 0) goto L24;
        if ($this$getRootLength.charAt(first - 1) != ':') goto L24;
        return first + 1;
    L24:
        if (first == (-1)) goto L26;
    L29:
        return 0;
    L26:
        if (StringsKt.endsWith$default($this$getRootLength, ':', false, 2, null) == false) goto L29;
        return $this$getRootLength.length();
    }

    public static final String getRootName(File $this$rootName) {
        Intrinsics.checkNotNullParameter($this$rootName, "<this>");
        String r0 = $this$rootName.getPath();
        Intrinsics.checkNotNullExpressionValue(r0, "getPath(...)");
        String r2 = $this$rootName.getPath();
        Intrinsics.checkNotNullExpressionValue(r2, "getPath(...)");
        String r1 = r0.substring(0, getRootLength$FilesKt__FilePathComponentsKt(r2));
        Intrinsics.checkNotNullExpressionValue(r1, "substring(...)");
        return r1;
    }

    public static final File getRoot(File $this$root) {
        Intrinsics.checkNotNullParameter($this$root, "<this>");
        return new File(FilesKt.getRootName($this$root));
    }

    public static final boolean isRooted(File $this$isRooted) {
        Intrinsics.checkNotNullParameter($this$isRooted, "<this>");
        String r0 = $this$isRooted.getPath();
        Intrinsics.checkNotNullExpressionValue(r0, "getPath(...)");
        if (getRootLength$FilesKt__FilePathComponentsKt(r0) <= 0) goto L5;
        return true;
    L5:
        return false;
    }

    public static final FilePathComponents toComponents(File $this$toComponents) {
        Intrinsics.checkNotNullParameter($this$toComponents, "<this>");
        String path = $this$toComponents.getPath();
        Intrinsics.checkNotNull(path);
        int rootLength = getRootLength$FilesKt__FilePathComponentsKt(path);
        String rootName = path.substring(0, rootLength);
        Intrinsics.checkNotNullExpressionValue(rootName, "substring(...)");
        String subPath = path.substring(rootLength);
        Intrinsics.checkNotNullExpressionValue(subPath, "substring(...)");
        if (subPath.length() != 0) goto L5;
        boolean r4 = true;
    L6:
        if (r4 == false) goto L8;
        List list = CollectionsKt.emptyList();
    L14:
        return new FilePathComponents(new File(rootName), list);
    L8:
        Iterable $this$map$iv = StringsKt.split$default(subPath, new char[]{File.separatorChar}, false, 0, 6, null);
        Collection destination$iv$iv = new ArrayList(CollectionsKt.collectionSizeOrDefault($this$map$iv, 10));
        Iterator r9 = $this$map$iv.iterator();
    L10:
        if (r9.hasNext() == false) goto L12;
        Object item$iv$iv = r9.next();
        String p0 = (String) item$iv$iv;
        destination$iv$iv.add(new File(p0));
        goto L10
    L12:
        list = (List) destination$iv$iv;
        goto L14
    L5:
        r4 = false;
        goto L6
    }

    public static final File subPath(File $this$subPath, int beginIndex, int endIndex) {
        Intrinsics.checkNotNullParameter($this$subPath, "<this>");
        return FilesKt.toComponents($this$subPath).subPath(beginIndex, endIndex);
    }
}
