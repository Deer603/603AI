package kotlin.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;
import kotlin.text.StringsKt;

/* JADX INFO: compiled from: Utils.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000<\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0004\u001a*\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0001H\u0007\u001a*\u0010\u0006\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0001H\u0007\u001a\u0012\u0010\u000e\u001a\u00020\u0003*\u00020\u00012\u0006\u0010\u000f\u001a\u00020\u0001\u001a\u0012\u0010\u0010\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u000f\u001a\u00020\u0001\u001a\u0012\u0010\u0011\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u000f\u001a\u00020\u0001\u001a\u0014\u0010\u0012\u001a\u0004\u0018\u00010\u0001*\u00020\u00012\u0006\u0010\u000f\u001a\u00020\u0001\u001a\u001b\u0010\u0013\u001a\u0004\u0018\u00010\u0003*\u00020\u00012\u0006\u0010\u000f\u001a\u00020\u0001H\u0002¢\u0006\u0002\b\u0014\u001a&\u0010\u0015\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0016\u001a\u00020\u00012\b\b\u0002\u0010\u0017\u001a\u00020\u00182\b\b\u0002\u0010\u0019\u001a\u00020\u001a\u001a8\u0010\u001b\u001a\u00020\u0018*\u00020\u00012\u0006\u0010\u0016\u001a\u00020\u00012\b\b\u0002\u0010\u0017\u001a\u00020\u00182\u001a\b\u0002\u0010\u001c\u001a\u0014\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u001f0\u001d\u001a\n\u0010 \u001a\u00020\u0018*\u00020\u0001\u001a\u0012\u0010!\u001a\u00020\u0018*\u00020\u00012\u0006\u0010\"\u001a\u00020\u0001\u001a\u0012\u0010!\u001a\u00020\u0018*\u00020\u00012\u0006\u0010\"\u001a\u00020\u0003\u001a\u0012\u0010#\u001a\u00020\u0018*\u00020\u00012\u0006\u0010\"\u001a\u00020\u0001\u001a\u0012\u0010#\u001a\u00020\u0018*\u00020\u00012\u0006\u0010\"\u001a\u00020\u0003\u001a\n\u0010$\u001a\u00020\u0001*\u00020\u0001\u001a\u0011\u0010$\u001a\u00020%*\u00020%H\u0002¢\u0006\u0002\b&\u001a\u001d\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00010'*\b\u0012\u0004\u0012\u00020\u00010'H\u0002¢\u0006\u0002\b&\u001a\u0012\u0010(\u001a\u00020\u0001*\u00020\u00012\u0006\u0010)\u001a\u00020\u0001\u001a\u0012\u0010(\u001a\u00020\u0001*\u00020\u00012\u0006\u0010)\u001a\u00020\u0003\u001a\u0012\u0010*\u001a\u00020\u0001*\u00020\u00012\u0006\u0010)\u001a\u00020\u0001\u001a\u0012\u0010*\u001a\u00020\u0001*\u00020\u00012\u0006\u0010)\u001a\u00020\u0003\"\u0015\u0010\u0007\u001a\u00020\u0003*\u00020\u00018F¢\u0006\u0006\u001a\u0004\b\b\u0010\t\"\u0015\u0010\n\u001a\u00020\u0003*\u00020\u00018F¢\u0006\u0006\u001a\u0004\b\u000b\u0010\t\"\u0015\u0010\f\u001a\u00020\u0003*\u00020\u00018F¢\u0006\u0006\u001a\u0004\b\r\u0010\t¨\u0006+"}, d2 = {"createTempDir", "Ljava/io/File;", "prefix", "", "suffix", "directory", "createTempFile", "extension", "getExtension", "(Ljava/io/File;)Ljava/lang/String;", "invariantSeparatorsPath", "getInvariantSeparatorsPath", "nameWithoutExtension", "getNameWithoutExtension", "toRelativeString", "base", "relativeTo", "relativeToOrSelf", "relativeToOrNull", "toRelativeStringOrNull", "toRelativeStringOrNull$FilesKt__UtilsKt", "copyTo", "target", "overwrite", "", "bufferSize", "", "copyRecursively", "onError", "Lkotlin/Function2;", "Ljava/io/IOException;", "Lkotlin/io/OnErrorAction;", "deleteRecursively", "startsWith", "other", "endsWith", "normalize", "Lkotlin/io/FilePathComponents;", "normalize$FilesKt__UtilsKt", "", "resolve", "relative", "resolveSibling", "kotlin-stdlib"}, k = 5, mv = {2, 2, 0}, xi = 49, xs = "kotlin/io/FilesKt")
class FilesKt__UtilsKt extends FilesKt__FileTreeWalkKt {
    public static /* synthetic */ Unit $r8$lambda$b184Hv2lLSyaIabDgjGNkJ5ATf4(Function2 r0, File r1, IOException r2) {
        return copyRecursively$lambda$4$FilesKt__UtilsKt(r0, r1, r2);
    }

    public FilesKt__UtilsKt() {
    }

    public static /* synthetic */ File createTempDir$default(String r1, String r2, File r3, int r4, Object r5) {
        if ((r4 & 1) == 0) goto L6;
        r1 = "tmp";
    L6:
        if ((r4 & 2) == 0) goto L9;
        r2 = null;
    L9:
        if ((r4 & 4) == 0) goto L12;
        r3 = null;
    L12:
        return FilesKt.createTempDir(r1, r2, r3);
    }

    @Deprecated(message = "Avoid creating temporary directories in the default temp location with this function due to too wide permissions on the newly created directory. Use kotlin.io.path.createTempDirectory instead.")
    public static final File createTempDir(String prefix, String suffix, File directory) {
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        File dir = File.createTempFile(prefix, suffix, directory);
        dir.delete();
        if (dir.mkdir() == false) goto L7;
        Intrinsics.checkNotNull(dir);
        return dir;
    L7:
        throw new IOException("Unable to create temporary directory " + dir + '.');
    }

    public static /* synthetic */ File createTempFile$default(String r1, String r2, File r3, int r4, Object r5) {
        if ((r4 & 1) == 0) goto L6;
        r1 = "tmp";
    L6:
        if ((r4 & 2) == 0) goto L9;
        r2 = null;
    L9:
        if ((r4 & 4) == 0) goto L12;
        r3 = null;
    L12:
        return FilesKt.createTempFile(r1, r2, r3);
    }

    @Deprecated(message = "Avoid creating temporary files in the default temp location with this function due to too wide permissions on the newly created file. Use kotlin.io.path.createTempFile instead or resort to java.io.File.createTempFile.")
    public static final File createTempFile(String prefix, String suffix, File directory) {
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        File r0 = File.createTempFile(prefix, suffix, directory);
        Intrinsics.checkNotNullExpressionValue(r0, "createTempFile(...)");
        return r0;
    }

    public static final String getExtension(File $this$extension) {
        Intrinsics.checkNotNullParameter($this$extension, "<this>");
        String r0 = $this$extension.getName();
        Intrinsics.checkNotNullExpressionValue(r0, "getName(...)");
        return StringsKt.substringAfterLast(r0, '.', "");
    }

    public static final String getInvariantSeparatorsPath(File $this$invariantSeparatorsPath) {
        Intrinsics.checkNotNullParameter($this$invariantSeparatorsPath, "<this>");
        if (File.separatorChar == '/') goto L5;
        String r3 = $this$invariantSeparatorsPath.getPath();
        Intrinsics.checkNotNullExpressionValue(r3, "getPath(...)");
        return StringsKt.replace$default(r3, File.separatorChar, '/', false, 4, null);
    L5:
        String r0 = $this$invariantSeparatorsPath.getPath();
        Intrinsics.checkNotNullExpressionValue(r0, "getPath(...)");
        return r0;
    }

    public static final String getNameWithoutExtension(File $this$nameWithoutExtension) {
        Intrinsics.checkNotNullParameter($this$nameWithoutExtension, "<this>");
        String r0 = $this$nameWithoutExtension.getName();
        Intrinsics.checkNotNullExpressionValue(r0, "getName(...)");
        return StringsKt.substringBeforeLast$default(r0, ".", null, 2, null);
    }

    public static final String toRelativeString(File $this$toRelativeString, File base) {
        Intrinsics.checkNotNullParameter($this$toRelativeString, "<this>");
        Intrinsics.checkNotNullParameter(base, "base");
        String r0 = toRelativeStringOrNull$FilesKt__UtilsKt($this$toRelativeString, base);
        if (r0 == null) goto L6;
        return r0;
    L6:
        throw new IllegalArgumentException("this and base files have different roots: " + $this$toRelativeString + " and " + base + '.');
    }

    public static final File relativeTo(File $this$relativeTo, File base) {
        Intrinsics.checkNotNullParameter($this$relativeTo, "<this>");
        Intrinsics.checkNotNullParameter(base, "base");
        return new File(FilesKt.toRelativeString($this$relativeTo, base));
    }

    public static final File relativeToOrSelf(File $this$relativeToOrSelf, File base) {
        Intrinsics.checkNotNullParameter($this$relativeToOrSelf, "<this>");
        Intrinsics.checkNotNullParameter(base, "base");
        String p0 = toRelativeStringOrNull$FilesKt__UtilsKt($this$relativeToOrSelf, base);
        if (p0 == null) goto L6;
        return new File(p0);
    L6:
        return $this$relativeToOrSelf;
    }

    public static final File relativeToOrNull(File $this$relativeToOrNull, File base) {
        Intrinsics.checkNotNullParameter($this$relativeToOrNull, "<this>");
        Intrinsics.checkNotNullParameter(base, "base");
        String p0 = toRelativeStringOrNull$FilesKt__UtilsKt($this$relativeToOrNull, base);
        if (p0 != null) goto L7;
        return null;
    L7:
        return new File(p0);
    }

    private static final String toRelativeStringOrNull$FilesKt__UtilsKt(File $this$toRelativeStringOrNull, File base) {
        FilePathComponents thisComponents = normalize$FilesKt__UtilsKt(FilesKt.toComponents($this$toRelativeStringOrNull));
        FilePathComponents baseComponents = normalize$FilesKt__UtilsKt(FilesKt.toComponents(base));
        if (Intrinsics.areEqual(thisComponents.getRoot(), baseComponents.getRoot()) == true) goto L5;
        return null;
    L5:
        int baseCount = baseComponents.getSize();
        int thisCount = thisComponents.getSize();
        int i = 0;
        int maxSameCount = Math.min(thisCount, baseCount);
    L6:
        if (i >= maxSameCount) goto L10;
        if (Intrinsics.areEqual(thisComponents.getSegments().get(i), baseComponents.getSegments().get(i)) == false) goto L10;
        i = i + 1;
    L10:
        StringBuilder res = new StringBuilder();
        int i2 = baseCount - 1;
        if (i <= i2) goto L13;
    L20:
        if (i >= thisCount) goto L25;
        if (i >= baseCount) goto L23;
        res.append(File.separatorChar);
    L23:
        String r3 = File.separator;
        Intrinsics.checkNotNullExpressionValue(r3, "separator");
        CollectionsKt.joinTo$default(CollectionsKt.drop(thisComponents.getSegments(), i), res, r3, null, null, 0, null, null, 124, null);
    L25:
        return res.toString();
    L13:
        if (Intrinsics.areEqual(baseComponents.getSegments().get(i2).getName(), "..") == true) goto L14;
        res.append("..");
        if (i2 == i) goto L18;
        res.append(File.separatorChar);
    L18:
        if (i2 == i) goto L20;
        i2 = i2 - 1;
        goto L13
    L14:
        return null;
    }

    public static /* synthetic */ File copyTo$default(File r0, File r1, boolean r2, int r3, int r4, Object r5) {
        if ((r4 & 2) == 0) goto L6;
        r2 = false;
    L6:
        if ((r4 & 4) == 0) goto L9;
        r3 = 8192;
    L9:
        return FilesKt.copyTo(r0, r1, r2, r3);
    }

    public static final File copyTo(File $this$copyTo, File target, boolean overwrite, int bufferSize) {
        Intrinsics.checkNotNullParameter($this$copyTo, "<this>");
        Intrinsics.checkNotNullParameter(target, "target");
        if ($this$copyTo.exists() == false) goto L44;
        if (target.exists() == false) goto L15;
        if (overwrite == false) goto L13;
        if (target.delete() == true) goto L15;
        throw new FileAlreadyExistsException($this$copyTo, target, "Tried to overwrite the destination, but failed to delete it.");
    L13:
        throw new FileAlreadyExistsException($this$copyTo, target, "The destination file already exists.");
    L15:
        if ($this$copyTo.isDirectory() == true) goto L17;
        File r0 = target.getParentFile();
        if (r0 == null) goto L24;
        r0.mkdirs();
    L24:
        FileInputStream r1 = new FileInputStream($this$copyTo);
        FileInputStream input = r1;     // Catch: Throwable -> L37
        FileOutputStream r4 = new FileOutputStream(target);     // Catch: Throwable -> L37
        FileOutputStream output = r4;     // Catch: Throwable -> L31
        long r6 = ByteStreamsKt.copyTo(input, output, bufferSize);     // Catch: Throwable -> L31
    L28:
        CloseableKt.closeFinally(r4, null);     // Catch: Throwable -> L37
        Long.valueOf(r6);     // Catch: Throwable -> L37
        CloseableKt.closeFinally(r1, null);
    L30:
        return target;
    L31:
        th = move-exception;
        throw th;     // Catch: Throwable -> L34
    L34:
        th = move-exception;
        CloseableKt.closeFinally(r4, th);     // Catch: Throwable -> L37
        throw th;     // Catch: Throwable -> L37
    L37:
        th = move-exception;
        throw th;     // Catch: Throwable -> L40
    L40:
        th = move-exception;
        CloseableKt.closeFinally(r1, th);
        throw th;
    L17:
        if (target.mkdirs() == true) goto L30;
        throw new FileSystemException($this$copyTo, target, "Failed to create target directory.");
    L44:
        throw new NoSuchFileException($this$copyTo, null, "The source file doesn't exist.", 2, null);
    }

    public static /* synthetic */ boolean copyRecursively$default(File r0, File r1, boolean r2, AnonymousClass1 r3, int r4, Object r5) {
        if ((r4 & 2) == 0) goto L6;
        r2 = false;
    L6:
        if ((r4 & 4) == 0) goto L9;
        r3 = AnonymousClass1.INSTANCE;
    L9:
        return FilesKt.copyRecursively(r0, r1, r2, r3);
    }

    public static final boolean copyRecursively(File $this$copyRecursively, File target, boolean overwrite, final Function2<? super File, ? super IOException, ? extends OnErrorAction> r15) {
        Intrinsics.checkNotNullParameter($this$copyRecursively, "<this>");
        Intrinsics.checkNotNullParameter(target, "target");
        Intrinsics.checkNotNullParameter(r15, "onError");
        if ($this$copyRecursively.exists() == true) goto L68;
        if (r15.invoke($this$copyRecursively, new NoSuchFileException($this$copyRecursively, null, "The source file doesn't exist.", 2, null)) == OnErrorAction.TERMINATE) goto L8;
        return true;
    L8:
        return false;
    L68:
        Iterator<File> r12 = FilesKt.walkTopDown($this$copyRecursively).onFail(new FilesKt__UtilsKt$$ExternalSyntheticLambda0(r15)).iterator();     // Catch: TerminateException -> L61
    L12:
        if (r12.hasNext() == false) goto L60;
        File src = r12.next();     // Catch: TerminateException -> L61
        if (src.exists() == false) goto L66;
        String relPath = FilesKt.toRelativeString(src, $this$copyRecursively);     // Catch: TerminateException -> L61
        File dstFile = new File(target, relPath);     // Catch: TerminateException -> L61
        if (dstFile.exists() == false) goto L46;
        if (src.isDirectory() == true) goto L27;
    L28:
        if (overwrite == true) goto L31;
        boolean stillExists = true;
    L41:
        if (stillExists == false) goto L46;
        if (r15.invoke(dstFile, new FileAlreadyExistsException(src, dstFile, "The destination file already exists.")) != OnErrorAction.TERMINATE) goto L12;
        return false;
    L31:
        if (dstFile.isDirectory() == false) goto L37;
        if (FilesKt.deleteRecursively(dstFile) == true) goto L35;
        stillExists = true;
        goto L41
    L35:
        stillExists = false;
        goto L41
    L37:
        if (dstFile.delete() == true) goto L39;
        stillExists = true;
        goto L41
    L39:
        stillExists = false;
        goto L41
    L27:
        if (dstFile.isDirectory() == false) goto L28;
    L46:
        boolean stillExists2 = src.isDirectory();     // Catch: TerminateException -> L61
        if (stillExists2 == true) goto L48;
        boolean overwrite2 = overwrite;
        if (FilesKt.copyTo$default(src, dstFile, overwrite2, 0, 4, null).length() != src.length()) goto L53;
        overwrite = overwrite2;
        goto L12
    L53:
        if (r15.invoke(src, new IOException("Source file wasn't copied completely, length of destination file differs.")) == OnErrorAction.TERMINATE) goto L55;
        overwrite = overwrite2;
        goto L12
    L55:
        return false;
    L48:
        dstFile.mkdirs();     // Catch: TerminateException -> L19
        goto L12
    L66:
        if (r15.invoke(src, new NoSuchFileException(src, null, "The source file doesn't exist.", 2, null)) != OnErrorAction.TERMINATE) goto L12;
        return false;
    L60:
        return true;
    L63:
        return false;
    }

    private static final Unit copyRecursively$lambda$4$FilesKt__UtilsKt(Function2 $onError, File f, IOException e) {
        Intrinsics.checkNotNullParameter(f, "f");
        Intrinsics.checkNotNullParameter(e, "e");
        if ($onError.invoke(f, e) == OnErrorAction.TERMINATE) goto L7;
        return Unit.INSTANCE;
    L7:
        throw new TerminateException(f);
    }

    public static final boolean deleteRecursively(File $this$deleteRecursively) {
        Intrinsics.checkNotNullParameter($this$deleteRecursively, "<this>");
        Sequence $this$fold$iv = FilesKt.walkBottomUp($this$deleteRecursively);
        boolean accumulator$iv = true;
        Iterator<File> r4 = $this$fold$iv.iterator();
    L4:
        if (r4.hasNext() == false) goto L14;
        Object element$iv = r4.next();
        File it = (File) element$iv;
        boolean res = accumulator$iv;
        if (it.delete() == false) goto L8;
    L9:
        if (res == false) goto L11;
        boolean r9 = true;
    L12:
        accumulator$iv = r9;
    L11:
        r9 = false;
        goto L12
    L8:
        if (it.exists() == true) goto L11;
    L14:
        return accumulator$iv;
    }

    public static final boolean startsWith(File $this$startsWith, File other) {
        Intrinsics.checkNotNullParameter($this$startsWith, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        FilePathComponents components = FilesKt.toComponents($this$startsWith);
        FilePathComponents otherComponents = FilesKt.toComponents(other);
        if (Intrinsics.areEqual(components.getRoot(), otherComponents.getRoot()) == true) goto L6;
        return false;
    L6:
        if (components.getSize() >= otherComponents.getSize()) goto L9;
        return false;
    L9:
        return components.getSegments().subList(0, otherComponents.getSize()).equals(otherComponents.getSegments());
    }

    public static final boolean startsWith(File $this$startsWith, String other) {
        Intrinsics.checkNotNullParameter($this$startsWith, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        return FilesKt.startsWith($this$startsWith, new File(other));
    }

    public static final boolean endsWith(File $this$endsWith, File other) {
        Intrinsics.checkNotNullParameter($this$endsWith, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        FilePathComponents components = FilesKt.toComponents($this$endsWith);
        FilePathComponents otherComponents = FilesKt.toComponents(other);
        if (otherComponents.isRooted() == true) goto L5;
        int shift = components.getSize() - otherComponents.getSize();
        if (shift >= 0) goto L10;
        return false;
    L10:
        return components.getSegments().subList(shift, components.getSize()).equals(otherComponents.getSegments());
    L5:
        return Intrinsics.areEqual($this$endsWith, other);
    }

    public static final boolean endsWith(File $this$endsWith, String other) {
        Intrinsics.checkNotNullParameter($this$endsWith, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        return FilesKt.endsWith($this$endsWith, new File(other));
    }

    public static final File normalize(File $this$normalize) {
        Intrinsics.checkNotNullParameter($this$normalize, "<this>");
        FilePathComponents $this$normalize_u24lambda_u246 = FilesKt.toComponents($this$normalize);
        File r2 = $this$normalize_u24lambda_u246.getRoot();
        List<File> r4 = normalize$FilesKt__UtilsKt($this$normalize_u24lambda_u246.getSegments());
        String r3 = File.separator;
        Intrinsics.checkNotNullExpressionValue(r3, "separator");
        return FilesKt.resolve(r2, CollectionsKt.joinToString$default(r4, r3, null, null, 0, null, null, 62, null));
    }

    private static final FilePathComponents normalize$FilesKt__UtilsKt(FilePathComponents $this$normalize) {
        return new FilePathComponents($this$normalize.getRoot(), normalize$FilesKt__UtilsKt($this$normalize.getSegments()));
    }

    private static final List<File> normalize$FilesKt__UtilsKt(List<? extends File> r5) {
        List list = new ArrayList(r5.size());
        Iterator<? extends File> r1 = r5.iterator();
    L4:
        if (r1.hasNext() == false) goto L19;
        File file = r1.next();
        String r3 = file.getName();
        if (Intrinsics.areEqual(r3, ".") == true) goto L7;
        if (Intrinsics.areEqual(r3, "..") == true) goto L11;
        Boolean.valueOf(list.add(file));
        goto L4
    L11:
        if (list.isEmpty() == false) goto L13;
    L15:
        Object r4 = Boolean.valueOf(list.add(file));
    L16:
        Comparable r6 = (Comparable) r4;
        goto L4
    L13:
        if (Intrinsics.areEqual(((File) CollectionsKt.last(list)).getName(), "..") == true) goto L15;
        r4 = list.remove(list.size() - 1);
        goto L16
    L7:
        Unit r7 = Unit.INSTANCE;
        goto L4
    L19:
        return list;
    }

    public static final File resolve(File $this$resolve, File relative) {
        Intrinsics.checkNotNullParameter($this$resolve, "<this>");
        Intrinsics.checkNotNullParameter(relative, "relative");
        if (FilesKt.isRooted(relative) == false) goto L5;
        return relative;
    L5:
        String baseName = $this$resolve.toString();
        Intrinsics.checkNotNullExpressionValue(baseName, "toString(...)");
        if (baseName.length() != 0) goto L8;
        boolean r1 = true;
    L9:
        if (r1 == true) goto L15;
        if (StringsKt.endsWith$default(baseName, File.separatorChar, false, 2, null) == true) goto L15;
        return new File(baseName + File.separatorChar + relative);
    L15:
        return new File(baseName + relative);
    L8:
        r1 = false;
        goto L9
    }

    public static final File resolve(File $this$resolve, String relative) {
        Intrinsics.checkNotNullParameter($this$resolve, "<this>");
        Intrinsics.checkNotNullParameter(relative, "relative");
        return FilesKt.resolve($this$resolve, new File(relative));
    }

    public static final File resolveSibling(File $this$resolveSibling, File relative) {
        Intrinsics.checkNotNullParameter($this$resolveSibling, "<this>");
        Intrinsics.checkNotNullParameter(relative, "relative");
        FilePathComponents components = FilesKt.toComponents($this$resolveSibling);
        if (components.getSize() != 0) goto L5;
        File parentSubPath = new File("..");
    L7:
        return FilesKt.resolve(FilesKt.resolve(components.getRoot(), parentSubPath), relative);
    L5:
        parentSubPath = components.subPath(0, components.getSize() - 1);
        goto L7
    }

    public static final File resolveSibling(File $this$resolveSibling, String relative) {
        Intrinsics.checkNotNullParameter($this$resolveSibling, "<this>");
        Intrinsics.checkNotNullParameter(relative, "relative");
        return FilesKt.resolveSibling($this$resolveSibling, new File(relative));
    }
}
