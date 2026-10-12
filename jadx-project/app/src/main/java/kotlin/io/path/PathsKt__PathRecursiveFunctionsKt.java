package kotlin.io.path;

import androidx.autofill.HintConstants;
import java.io.IOException;
import java.nio.file.CopyOption;
import java.nio.file.DirectoryStream;
import java.nio.file.FileSystemException;
import java.nio.file.FileSystemLoopException;
import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;
import java.nio.file.SecureDirectoryStream;
import java.nio.file.StandardCopyOption;
import java.nio.file.attribute.BasicFileAttributeView;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.ExceptionsKt;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.io.CloseableKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SpreadBuilder;

/* JADX INFO: compiled from: PathRecursiveFunctions.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\f\u001aw\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012Q\b\u0002\u0010\u0003\u001aK\u0012\u0013\u0012\u00110\u0001¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0013\u0012\u00110\u0001¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0002\u0012\u0017\u0012\u00150\bj\u0002`\n¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\t\u0012\u0004\u0012\u00020\u000b0\u00042\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\rH\u0007\u001a´\u0001\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012Q\b\u0002\u0010\u0003\u001aK\u0012\u0013\u0012\u00110\u0001¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0013\u0012\u00110\u0001¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0002\u0012\u0017\u0012\u00150\bj\u0002`\n¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\t\u0012\u0004\u0012\u00020\u000b0\u00042\u0006\u0010\f\u001a\u00020\r2C\b\u0002\u0010\u000f\u001a=\u0012\u0004\u0012\u00020\u0010\u0012\u0013\u0012\u00110\u0001¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0013\u0012\u00110\u0001¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0002\u0012\u0004\u0012\u00020\u00110\u0004¢\u0006\u0002\b\u0012H\u0007\u001a\u0011\u0010\u0013\u001a\u00020\u0014*\u00020\u0011H\u0003¢\u0006\u0002\b\u0015\u001a\u0011\u0010\u0013\u001a\u00020\u0014*\u00020\u000bH\u0003¢\u0006\u0002\b\u0015\u001a\f\u0010\u0016\u001a\u00020\u0017*\u00020\u0001H\u0007\u001a\u001b\u0010\u0018\u001a\f\u0012\b\u0012\u00060\bj\u0002`\n0\u0019*\u00020\u0001H\u0002¢\u0006\u0002\b\u001a\u001a$\u0010\u001b\u001a\u00020\u00172\u0006\u0010\u001c\u001a\u00020\u001d2\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00170\u001fH\u0082\b¢\u0006\u0002\b \u001a&\u0010!\u001a\u0004\u0018\u0001H\"\"\u0004\b\u0000\u0010\"2\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u0002H\"0\u001fH\u0082\b¢\u0006\u0004\b#\u0010$\u001a1\u0010%\u001a\u00020\u0017*\b\u0012\u0004\u0012\u00020\u00010&2\u0006\u0010\u0006\u001a\u00020\u00012\b\u0010'\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u001c\u001a\u00020\u001dH\u0002¢\u0006\u0002\b(\u001a'\u0010)\u001a\u00020\u0017*\b\u0012\u0004\u0012\u00020\u00010&2\u0006\u0010\u0006\u001a\u00020\u00012\u0006\u0010\u001c\u001a\u00020\u001dH\u0002¢\u0006\u0002\b*\u001a5\u0010+\u001a\u00020\r*\b\u0012\u0004\u0012\u00020\u00010&2\u0006\u0010,\u001a\u00020\u00012\u0012\u0010-\u001a\n\u0012\u0006\b\u0001\u0012\u00020/0.\"\u00020/H\u0002¢\u0006\u0004\b0\u00101\u001a'\u00102\u001a\u00020\u00172\u0006\u00103\u001a\u00020\u00012\b\u0010'\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u001c\u001a\u00020\u001dH\u0002¢\u0006\u0002\b4\u001a\u001d\u00105\u001a\u00020\u00172\u0006\u00106\u001a\u00020\u00012\u0006\u0010\u001c\u001a\u00020\u001dH\u0002¢\u0006\u0002\b7\u001a\f\u00108\u001a\u00020\u0017*\u00020\u0001H\u0000\u001a\u0019\u00109\u001a\u00020\u0017*\u00020\u00012\u0006\u0010'\u001a\u00020\u0001H\u0002¢\u0006\u0002\b:¨\u0006;"}, d2 = {"copyToRecursively", "Ljava/nio/file/Path;", "target", "onError", "Lkotlin/Function3;", "Lkotlin/ParameterName;", HintConstants.AUTOFILL_HINT_NAME, "source", "Ljava/lang/Exception;", "exception", "Lkotlin/Exception;", "Lkotlin/io/path/OnErrorResult;", "followLinks", "", "overwrite", "copyAction", "Lkotlin/io/path/CopyActionContext;", "Lkotlin/io/path/CopyActionResult;", "Lkotlin/ExtensionFunctionType;", "toFileVisitResult", "Ljava/nio/file/FileVisitResult;", "toFileVisitResult$PathsKt__PathRecursiveFunctionsKt", "deleteRecursively", "", "deleteRecursivelyImpl", "", "deleteRecursivelyImpl$PathsKt__PathRecursiveFunctionsKt", "collectIfThrows", "collector", "Lkotlin/io/path/ExceptionsCollector;", "function", "Lkotlin/Function0;", "collectIfThrows$PathsKt__PathRecursiveFunctionsKt", "tryIgnoreNoSuchFileException", "R", "tryIgnoreNoSuchFileException$PathsKt__PathRecursiveFunctionsKt", "(Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "handleEntry", "Ljava/nio/file/SecureDirectoryStream;", "parent", "handleEntry$PathsKt__PathRecursiveFunctionsKt", "enterDirectory", "enterDirectory$PathsKt__PathRecursiveFunctionsKt", "isDirectory", "entryName", "options", "", "Ljava/nio/file/LinkOption;", "isDirectory$PathsKt__PathRecursiveFunctionsKt", "(Ljava/nio/file/SecureDirectoryStream;Ljava/nio/file/Path;[Ljava/nio/file/LinkOption;)Z", "insecureHandleEntry", "entry", "insecureHandleEntry$PathsKt__PathRecursiveFunctionsKt", "insecureEnterDirectory", "path", "insecureEnterDirectory$PathsKt__PathRecursiveFunctionsKt", "checkFileName", "checkNotSameAs", "checkNotSameAs$PathsKt__PathRecursiveFunctionsKt", "kotlin-stdlib-jdk7"}, k = 5, mv = {2, 2, 0}, xi = 49, xs = "kotlin/io/path/PathsKt")
class PathsKt__PathRecursiveFunctionsKt extends PathsKt__PathReadWriteKt {

    /* JADX INFO: compiled from: PathRecursiveFunctions.kt */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0 = null;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1 = null;

        static {
            int[] r0 = new int[CopyActionResult.values().length];
            r0[CopyActionResult.CONTINUE.ordinal()] = 1;     // Catch: NoSuchFieldError -> L5
        L22:
            r0[CopyActionResult.TERMINATE.ordinal()] = 2;     // Catch: NoSuchFieldError -> L9
        L28:
            r0[CopyActionResult.SKIP_SUBTREE.ordinal()] = 3;     // Catch: NoSuchFieldError -> L12
        L13:
            $EnumSwitchMapping$0 = r0;
            int[] r1 = new int[OnErrorResult.values().length];
            r1[OnErrorResult.TERMINATE.ordinal()] = 1;     // Catch: NoSuchFieldError -> L16
        L26:
            r1[OnErrorResult.SKIP_SUBTREE.ordinal()] = 2;     // Catch: NoSuchFieldError -> L19
        L20:
            $EnumSwitchMapping$1 = r1;
        }
    }

    public static /* synthetic */ CopyActionResult $r8$lambda$3VYkoVP17knpGuiVw5BoXBQ_zc8(boolean r0, CopyActionContext r1, Path r2, Path r3) {
        return copyToRecursively$lambda$1$PathsKt__PathRecursiveFunctionsKt(r0, r1, r2, r3);
    }

    public static /* synthetic */ FileVisitResult $r8$lambda$Dn4FOAPbjNDFACiW2KdbJH8lJzc(ArrayList r0, Function3 r1, Path r2, Path r3, Path r4, Path r5, IOException r6) {
        return copyToRecursively$lambda$6$lambda$5$PathsKt__PathRecursiveFunctionsKt(r0, r1, r2, r3, r4, r5, r6);
    }

    /* JADX INFO: renamed from: $r8$lambda$QF8Uhuq7fTQtpHX-cuQgT1yM3No, reason: not valid java name */
    public static /* synthetic */ Unit m8639$r8$lambda$QF8Uhuq7fTQtpHXcuQgT1yM3No(ArrayList r0, Function3 r1, Path r2, Path r3, Path r4, Function3 r5, FileVisitorBuilder r6) {
        return copyToRecursively$lambda$6$PathsKt__PathRecursiveFunctionsKt(r0, r1, r2, r3, r4, r5, r6);
    }

    public static /* synthetic */ CopyActionResult $r8$lambda$r0l1pONWwls6V3X1jucrTqZKxjo(boolean r0, CopyActionContext r1, Path r2, Path r3) {
        return copyToRecursively$lambda$0$PathsKt__PathRecursiveFunctionsKt(r0, r1, r2, r3);
    }

    public static /* synthetic */ FileVisitResult $r8$lambda$vrBef6cHhs3oA22HfQBDeNxsJGA(ArrayList r0, Function3 r1, Path r2, Path r3, Path r4, Function3 r5, Path r6, BasicFileAttributes r7) {
        return copyToRecursively$lambda$6$lambda$4$PathsKt__PathRecursiveFunctionsKt(r0, r1, r2, r3, r4, r5, r6, r7);
    }

    public PathsKt__PathRecursiveFunctionsKt() {
    }

    public static final /* synthetic */ FileVisitResult access$copyToRecursively$copy(ArrayList stack, Function3 $copyAction, Path $this_copyToRecursively, Path $target, Path normalizedTarget, Function3 $onError, Path source, BasicFileAttributes attributes) {
        return copyToRecursively$copy$PathsKt__PathRecursiveFunctionsKt(stack, $copyAction, $this_copyToRecursively, $target, normalizedTarget, $onError, source, attributes);
    }

    public static final /* synthetic */ FileVisitResult access$copyToRecursively$error(Function3 $onError, Path $this_copyToRecursively, Path $target, Path normalizedTarget, Path source, Exception exception) {
        return copyToRecursively$error$PathsKt__PathRecursiveFunctionsKt($onError, $this_copyToRecursively, $target, normalizedTarget, source, exception);
    }

    public static /* synthetic */ Path copyToRecursively$default(Path r0, Path r1, AnonymousClass1 r2, boolean r3, boolean r4, int r5, Object r6) {
        if ((r5 & 2) == 0) goto L6;
        r2 = AnonymousClass1.INSTANCE;
    L6:
        return PathsKt.copyToRecursively(r0, r1, r2, r3, r4);
    }

    public static final Path copyToRecursively(Path $this$copyToRecursively, Path target, Function3<? super Path, ? super Path, ? super Exception, ? extends OnErrorResult> r10, final boolean followLinks, boolean overwrite) {
        Intrinsics.checkNotNullParameter($this$copyToRecursively, "<this>");
        Intrinsics.checkNotNullParameter(target, "target");
        Intrinsics.checkNotNullParameter(r10, "onError");
        if (overwrite == false) goto L6;
        return PathsKt.copyToRecursively($this$copyToRecursively, target, r10, followLinks, new PathsKt__PathRecursiveFunctionsKt$$ExternalSyntheticLambda1(followLinks));
    L6:
        return PathsKt.copyToRecursively$default($this$copyToRecursively, target, r10, followLinks, null, 8, null);
    }

    private static final CopyActionResult copyToRecursively$lambda$0$PathsKt__PathRecursiveFunctionsKt(boolean $followLinks, CopyActionContext $this$copyToRecursively, Path src, Path dst) {
        Intrinsics.checkNotNullParameter($this$copyToRecursively, "$this$copyToRecursively");
        Intrinsics.checkNotNullParameter(src, "src");
        Intrinsics.checkNotNullParameter(dst, "dst");
        LinkOption[] options = LinkFollowing.INSTANCE.toLinkOptions($followLinks);
        boolean dstIsDirectory = Files.isDirectory(dst, (LinkOption[]) Arrays.copyOf(new LinkOption[]{LinkOption.NOFOLLOW_LINKS}, 1));
        LinkOption[] r2 = (LinkOption[]) Arrays.copyOf(options, options.length);
        boolean srcIsDirectory = Files.isDirectory(src, (LinkOption[]) Arrays.copyOf(r2, r2.length));
        if (srcIsDirectory == false) goto L5;
        if (dstIsDirectory == false) goto L5;
    L9:
        return CopyActionResult.CONTINUE;
    L5:
        if (dstIsDirectory == false) goto L7;
        PathsKt.deleteRecursively(dst);
    L7:
        SpreadBuilder r3 = new SpreadBuilder(2);
        r3.addSpread(options);
        r3.add(StandardCopyOption.REPLACE_EXISTING);
        CopyOption[] r4 = (CopyOption[]) r3.toArray(new CopyOption[r3.size()]);
        Intrinsics.checkNotNullExpressionValue(Files.copy(src, dst, (CopyOption[]) Arrays.copyOf(r4, r4.length)), "copy(...)");
        goto L9
    }

    public static /* synthetic */ Path copyToRecursively$default(Path r0, Path r1, AnonymousClass3 r2, final boolean r3, Function3 r4, int r5, Object r6) {
        if ((r5 & 2) == 0) goto L6;
        r2 = AnonymousClass3.INSTANCE;
    L6:
        if ((r5 & 8) == 0) goto L9;
        r4 = new PathsKt__PathRecursiveFunctionsKt$$ExternalSyntheticLambda0(r3);
    L9:
        return PathsKt.copyToRecursively(r0, r1, r2, r3, r4);
    }

    private static final CopyActionResult copyToRecursively$lambda$1$PathsKt__PathRecursiveFunctionsKt(boolean $followLinks, CopyActionContext r2, Path src, Path dst) {
        Intrinsics.checkNotNullParameter(r2, "<this>");
        Intrinsics.checkNotNullParameter(src, "src");
        Intrinsics.checkNotNullParameter(dst, "dst");
        return r2.copyToIgnoringExistingDirectory(src, dst, $followLinks);
    }

    public static final Path copyToRecursively(final Path $this$copyToRecursively, final Path target, final Function3<? super Path, ? super Path, ? super Exception, ? extends OnErrorResult> r14, boolean followLinks, final Function3<? super CopyActionContext, ? super Path, ? super Path, ? extends CopyActionResult> r16) {
        Intrinsics.checkNotNullParameter($this$copyToRecursively, "<this>");
        Intrinsics.checkNotNullParameter(target, "target");
        Intrinsics.checkNotNullParameter(r14, "onError");
        Intrinsics.checkNotNullParameter(r16, "copyAction");
        LinkOption[] r1 = LinkFollowing.INSTANCE.toLinkOptions(followLinks);
        LinkOption[] r2 = (LinkOption[]) Arrays.copyOf(r1, r1.length);
        if (Files.exists($this$copyToRecursively, (LinkOption[]) Arrays.copyOf(r2, r2.length)) == false) goto L39;
        boolean isSubdirectory = false;
        if (Files.exists($this$copyToRecursively, (LinkOption[]) Arrays.copyOf(new LinkOption[0], 0)) == false) goto L36;
        if (followLinks == true) goto L10;
        if (Files.isSymbolicLink($this$copyToRecursively) == true) goto L36;
    L10:
        if (Files.exists(target, (LinkOption[]) Arrays.copyOf(new LinkOption[0], 0)) == true) goto L12;
    L14:
        boolean targetExistsAndNotSymlink = false;
    L15:
        if (targetExistsAndNotSymlink == false) goto L20;
        if (Files.isSameFile($this$copyToRecursively, target) == true) goto L36;
    L20:
        if (Intrinsics.areEqual($this$copyToRecursively.getFileSystem(), target.getFileSystem()) == false) goto L32;
        if (targetExistsAndNotSymlink == false) goto L24;
        isSubdirectory = target.toRealPath(new LinkOption[0]).startsWith($this$copyToRecursively.toRealPath(new LinkOption[0]));
        goto L32
    L24:
        Path it = target.getParent();
        if (it == null) goto L32;
        if (Files.exists(it, (LinkOption[]) Arrays.copyOf(new LinkOption[0], 0)) == false) goto L32;
        if (it.toRealPath(new LinkOption[0]).startsWith($this$copyToRecursively.toRealPath(new LinkOption[0])) == false) goto L32;
        isSubdirectory = true;
    L32:
        if (isSubdirectory == false) goto L36;
        throw new FileSystemException($this$copyToRecursively.toString(), target.toString(), "Recursively copying a directory into its subdirectory is prohibited.");
    L12:
        if (Files.isSymbolicLink(target) == true) goto L14;
        targetExistsAndNotSymlink = true;
    L36:
        final Path normalizedTarget = target.normalize();
        final ArrayList stack = new ArrayList();
        PathsKt.visitFileTree$default($this$copyToRecursively, 0, followLinks, new PathsKt__PathRecursiveFunctionsKt$$ExternalSyntheticLambda2(stack, r16, $this$copyToRecursively, target, normalizedTarget, r14), 1, null);
        return target;
    L39:
        throw new NoSuchFileException($this$copyToRecursively.toString(), target.toString(), "The source file doesn't exist.");
    }

    private static final Path copyToRecursively$destination$PathsKt__PathRecursiveFunctionsKt(Path $this_copyToRecursively, Path $target, Path normalizedTarget, Path source) {
        Path relativePath = PathsKt.relativeTo(source, $this_copyToRecursively);
        Path destination = $target.resolve(relativePath.toString());
        if (destination.normalize().startsWith(normalizedTarget) == false) goto L7;
        Intrinsics.checkNotNull(destination);
        return destination;
    L7:
        throw new IllegalFileNameException(source, destination, "Copying files to outside the specified target directory is prohibited. The directory being recursively copied might contain an entry with an illegal name.");
    }

    private static final FileVisitResult copyToRecursively$error$PathsKt__PathRecursiveFunctionsKt(Function3<? super Path, ? super Path, ? super Exception, ? extends OnErrorResult> r1, Path $this_copyToRecursively, Path $target, Path normalizedTarget, Path source, Exception exception) {
        return toFileVisitResult$PathsKt__PathRecursiveFunctionsKt(r1.invoke(source, copyToRecursively$destination$PathsKt__PathRecursiveFunctionsKt($this_copyToRecursively, $target, normalizedTarget, source), exception));
    }

    private static final FileVisitResult copyToRecursively$copy$PathsKt__PathRecursiveFunctionsKt(ArrayList<Path> r7, Function3<? super CopyActionContext, ? super Path, ? super Path, ? extends CopyActionResult> r8, Path $this_copyToRecursively, Path $target, Path normalizedTarget, Function3<? super Path, ? super Path, ? super Exception, ? extends OnErrorResult> r12, Path source, BasicFileAttributes attributes) {
    L7:
        exception = move-exception;
        return copyToRecursively$error$PathsKt__PathRecursiveFunctionsKt(r12, $this_copyToRecursively, $target, normalizedTarget, source, exception);
    L3:
        if (r7.isEmpty() == true) goto L5;
        PathsKt.checkFileName(source);     // Catch: Exception -> L7
        Object r0 = CollectionsKt.last(r7);     // Catch: Exception -> L7
        Intrinsics.checkNotNullExpressionValue(r0, "last(...)");     // Catch: Exception -> L7
        checkNotSameAs$PathsKt__PathRecursiveFunctionsKt(source, (Path) r0);     // Catch: Exception -> L7
    L5:
        return toFileVisitResult$PathsKt__PathRecursiveFunctionsKt(r8.invoke(DefaultCopyActionContext.INSTANCE, source, copyToRecursively$destination$PathsKt__PathRecursiveFunctionsKt($this_copyToRecursively, $target, normalizedTarget, source)));
    }

    private static final Unit copyToRecursively$lambda$6$PathsKt__PathRecursiveFunctionsKt(final ArrayList $stack, final Function3 $copyAction, final Path $this_copyToRecursively, final Path $target, final Path $normalizedTarget, final Function3 $onError, FileVisitorBuilder $this$visitFileTree) {
        Intrinsics.checkNotNullParameter($this$visitFileTree, "$this$visitFileTree");
        $this$visitFileTree.onPreVisitDirectory(new PathsKt__PathRecursiveFunctionsKt$$ExternalSyntheticLambda3($stack, $copyAction, $this_copyToRecursively, $target, $normalizedTarget, $onError));
        $this$visitFileTree.onVisitFile(new PathsKt__PathRecursiveFunctionsKt$copyToRecursively$5$2($stack, $copyAction, $this_copyToRecursively, $target, $normalizedTarget, $onError));
        $this$visitFileTree.onVisitFileFailed(new PathsKt__PathRecursiveFunctionsKt$copyToRecursively$5$3($onError, $this_copyToRecursively, $target, $normalizedTarget));
        $this$visitFileTree.onPostVisitDirectory(new PathsKt__PathRecursiveFunctionsKt$$ExternalSyntheticLambda4($stack, $onError, $this_copyToRecursively, $target, $normalizedTarget));
        return Unit.INSTANCE;
    }

    private static final FileVisitResult copyToRecursively$lambda$6$lambda$4$PathsKt__PathRecursiveFunctionsKt(ArrayList $stack, Function3 $copyAction, Path $this_copyToRecursively, Path $target, Path $normalizedTarget, Function3 $onError, Path directory, BasicFileAttributes attributes) {
        Intrinsics.checkNotNullParameter(directory, "directory");
        Intrinsics.checkNotNullParameter(attributes, "attributes");
        FileVisitResult it = copyToRecursively$copy$PathsKt__PathRecursiveFunctionsKt($stack, $copyAction, $this_copyToRecursively, $target, $normalizedTarget, $onError, directory, attributes);
        if (it != FileVisitResult.CONTINUE) goto L6;
        $stack.add(directory);
    L6:
        return it;
    }

    private static final FileVisitResult copyToRecursively$lambda$6$lambda$5$PathsKt__PathRecursiveFunctionsKt(ArrayList $stack, Function3 $onError, Path $this_copyToRecursively, Path $target, Path $normalizedTarget, Path directory, IOException exception) {
        Intrinsics.checkNotNullParameter(directory, "directory");
        CollectionsKt.removeLast($stack);
        if (exception != null) goto L6;
        return FileVisitResult.CONTINUE;
    L6:
        return copyToRecursively$error$PathsKt__PathRecursiveFunctionsKt($onError, $this_copyToRecursively, $target, $normalizedTarget, directory, exception);
    }

    private static final FileVisitResult toFileVisitResult$PathsKt__PathRecursiveFunctionsKt(CopyActionResult $this$toFileVisitResult) {
        switch(WhenMappings.$EnumSwitchMapping$0[$this$toFileVisitResult.ordinal()]) {
            case 1: goto L9;
            case 2: goto L11;
            case 3: goto L10;
            default: goto L5;
        };
    L5:
        throw new NoWhenBranchMatchedException();
    L10:
        return FileVisitResult.SKIP_SUBTREE;
    L11:
        return FileVisitResult.TERMINATE;
    L9:
        return FileVisitResult.CONTINUE;
    }

    private static final FileVisitResult toFileVisitResult$PathsKt__PathRecursiveFunctionsKt(OnErrorResult $this$toFileVisitResult) {
        switch(WhenMappings.$EnumSwitchMapping$1[$this$toFileVisitResult.ordinal()]) {
            case 1: goto L8;
            case 2: goto L9;
            default: goto L5;
        };
    L5:
        throw new NoWhenBranchMatchedException();
    L9:
        return FileVisitResult.SKIP_SUBTREE;
    L8:
        return FileVisitResult.TERMINATE;
    }

    public static final void deleteRecursively(Path $this$deleteRecursively) {
        Intrinsics.checkNotNullParameter($this$deleteRecursively, "<this>");
        Iterable r0 = deleteRecursivelyImpl$PathsKt__PathRecursiveFunctionsKt($this$deleteRecursively);
        if (((Collection) r0).isEmpty() == true) goto L10;
        FileSystemException $this$deleteRecursively_u24lambda_u248 = new FileSystemException("Failed to delete one or more files. See suppressed exceptions for details.");
        Iterable $this$forEach$iv = r0;
        Iterator r6 = $this$forEach$iv.iterator();
    L6:
        if (r6.hasNext() == false) goto L9;
        Object element$iv = r6.next();
        Exception it = (Exception) element$iv;
        ExceptionsKt.addSuppressed($this$deleteRecursively_u24lambda_u248, it);
        goto L6
    L9:
        throw $this$deleteRecursively_u24lambda_u248;
    }

    private static final List<Exception> deleteRecursivelyImpl$PathsKt__PathRecursiveFunctionsKt(Path $this$deleteRecursivelyImpl) {
        ExceptionsCollector collector = new ExceptionsCollector(0, 1, null);
        boolean useInsecure = true;
        Path fileName = $this$deleteRecursivelyImpl.getFileName();
        if (fileName == null) goto L25;
        Path parent = $this$deleteRecursivelyImpl.getParent();
        if (parent != null) goto L31;
        parent = $this$deleteRecursivelyImpl.getFileSystem().getPath("", new String[0]);
    L31:
        DirectoryStream<Path> r1 = Files.newDirectoryStream(parent);     // Catch: Throwable -> L10
    L12:
        if (r1 == null) goto L25;
        DirectoryStream<Path> r7 = r1;
        DirectoryStream<Path> r8 = r7;     // Catch: Throwable -> L19
        if ((r8 instanceof SecureDirectoryStream) == false) goto L17;
        useInsecure = false;
        collector.setPath(parent);     // Catch: Throwable -> L19
        handleEntry$PathsKt__PathRecursiveFunctionsKt((SecureDirectoryStream) r8, fileName, null, collector);     // Catch: Throwable -> L19
    L17:
        Unit r9 = Unit.INSTANCE;     // Catch: Throwable -> L19
        CloseableKt.closeFinally(r7, null);
    L19:
        th = move-exception;
        throw th;     // Catch: Throwable -> L21
    L21:
        th = move-exception;
        CloseableKt.closeFinally(r7, th);
        throw th;
    L11:
        r1 = null;
    L25:
        if (useInsecure == false) goto L28;
        insecureHandleEntry$PathsKt__PathRecursiveFunctionsKt($this$deleteRecursivelyImpl, null, collector);
    L28:
        return collector.getCollectedExceptions();
    }

    private static final void collectIfThrows$PathsKt__PathRecursiveFunctionsKt(ExceptionsCollector collector, Function0<Unit> r3) {
        r3.invoke();     // Catch: Exception -> L5
        return;
    L5:
        exception = move-exception;
        collector.collect(exception);
    }

    private static final <R> R tryIgnoreNoSuchFileException$PathsKt__PathRecursiveFunctionsKt(Function0<? extends R> r3) {
        return r3.invoke();
    L7:
        return null;
    }

    private static final void handleEntry$PathsKt__PathRecursiveFunctionsKt(SecureDirectoryStream<Path> r5, Path name, Path parent, ExceptionsCollector collector) {
        collector.enterEntry(name);
        if (parent == null) goto L6;
        Path entry = collector.getPath();     // Catch: Exception -> L19
        Intrinsics.checkNotNull(entry);     // Catch: Exception -> L19
        PathsKt.checkFileName(entry);     // Catch: Exception -> L19
        checkNotSameAs$PathsKt__PathRecursiveFunctionsKt(entry, parent);     // Catch: Exception -> L19
    L19:
        exception$iv = move-exception;
        collector.collect(exception$iv);
    L21:
        collector.exitEntry(name);
        return;
    L6:
        if (isDirectory$PathsKt__PathRecursiveFunctionsKt(r5, name, new LinkOption[]{LinkOption.NOFOLLOW_LINKS}) == false) goto L23;
        int preEnterTotalExceptions = collector.getTotalExceptions();     // Catch: Exception -> L19
        enterDirectory$PathsKt__PathRecursiveFunctionsKt(r5, name, collector);     // Catch: Exception -> L19
        if (preEnterTotalExceptions != collector.getTotalExceptions()) goto L21;
        r5.deleteDirectory(name);     // Catch: NoSuchFileException -> L12 Exception -> L19
        Unit r4 = Unit.INSTANCE;     // Catch: NoSuchFileException -> L12 Exception -> L19
        goto L21
    L23:
        r5.deleteFile(name);     // Catch: NoSuchFileException -> L17 Exception -> L19
        Unit r3 = Unit.INSTANCE;     // Catch: NoSuchFileException -> L17 Exception -> L19
        goto L21
    }

    private static final void enterDirectory$PathsKt__PathRecursiveFunctionsKt(SecureDirectoryStream<Path> r10, Path name, ExceptionsCollector collector) {
        SecureDirectoryStream<Path> r4 = r10.newDirectoryStream(name, new LinkOption[]{LinkOption.NOFOLLOW_LINKS});     // Catch: Exception -> L5 NoSuchFileException -> L7
    L10:
        if (r4 == null) goto L35;
        SecureDirectoryStream<Path> r5 = r4;     // Catch: Exception -> L5
        SecureDirectoryStream<Path> r2 = r5;     // Catch: Throwable -> L19
        Iterator<Path> r6 = r2.iterator();     // Catch: Throwable -> L19
        Intrinsics.checkNotNullExpressionValue(r6, "iterator(...)");     // Catch: Throwable -> L19
    L14:
        if (r6.hasNext() == false) goto L16;
        Path entry = r6.next();     // Catch: Throwable -> L19
        Path r8 = entry.getFileName();     // Catch: Throwable -> L19
        Intrinsics.checkNotNullExpressionValue(r8, "getFileName(...)");     // Catch: Throwable -> L19
        handleEntry$PathsKt__PathRecursiveFunctionsKt(r2, r8, collector.getPath(), collector);     // Catch: Throwable -> L19
        goto L14
    L16:
        Unit r3 = Unit.INSTANCE;     // Catch: Throwable -> L19
        CloseableKt.closeFinally(r5, null);     // Catch: Exception -> L5
        return;
    L19:
        th = move-exception;
        throw th;     // Catch: Throwable -> L21
    L21:
        th = move-exception;
        CloseableKt.closeFinally(r5, th);     // Catch: Exception -> L5
        throw th;     // Catch: Exception -> L5
    L35:
        return;
    L5:
        exception$iv = move-exception;
        collector.collect(exception$iv);
        return;
    L8:
        r4 = null;
        goto L10
    }

    private static final boolean isDirectory$PathsKt__PathRecursiveFunctionsKt(SecureDirectoryStream<Path> r4, Path entryName, LinkOption... options) {
        Boolean r1 = Boolean.valueOf(((BasicFileAttributeView) r4.getFileAttributeView(entryName, BasicFileAttributeView.class, (LinkOption[]) Arrays.copyOf(options, options.length))).readAttributes().isDirectory());     // Catch: NoSuchFileException -> L5
    L7:
        if (r1 != null) goto L13;
        return false;
    L13:
        return r1.booleanValue();
    L6:
        r1 = null;
        goto L7
    }

    private static final void insecureHandleEntry$PathsKt__PathRecursiveFunctionsKt(Path entry, Path parent, ExceptionsCollector collector) {
        if (parent == null) goto L6;
        PathsKt.checkFileName(entry);     // Catch: Exception -> L12
        checkNotSameAs$PathsKt__PathRecursiveFunctionsKt(entry, parent);     // Catch: Exception -> L12
    L12:
        exception$iv = move-exception;
        collector.collect(exception$iv);
        return;
    L6:
        if (Files.isDirectory(entry, (LinkOption[]) Arrays.copyOf(new LinkOption[]{LinkOption.NOFOLLOW_LINKS}, 1)) == false) goto L10;
        int preEnterTotalExceptions = collector.getTotalExceptions();     // Catch: Exception -> L12
        insecureEnterDirectory$PathsKt__PathRecursiveFunctionsKt(entry, collector);     // Catch: Exception -> L12
        if (preEnterTotalExceptions != collector.getTotalExceptions()) goto L18;
        Files.deleteIfExists(entry);     // Catch: Exception -> L12
        return;
    L18:
        return;
    L10:
        Files.deleteIfExists(entry);     // Catch: Exception -> L12
    }

    private static final void insecureEnterDirectory$PathsKt__PathRecursiveFunctionsKt(Path path, ExceptionsCollector collector) {
        DirectoryStream<Path> r5 = Files.newDirectoryStream(path);     // Catch: Exception -> L5 NoSuchFileException -> L7
    L10:
        if (r5 == null) goto L35;
        DirectoryStream<Path> r6 = r5;     // Catch: Exception -> L5
        Iterator<Path> r7 = r6.iterator();     // Catch: Throwable -> L19
        Intrinsics.checkNotNullExpressionValue(r7, "iterator(...)");     // Catch: Throwable -> L19
    L14:
        if (r7.hasNext() == false) goto L16;
        Path entry = r7.next();     // Catch: Throwable -> L19
        Intrinsics.checkNotNull(entry);     // Catch: Throwable -> L19
        insecureHandleEntry$PathsKt__PathRecursiveFunctionsKt(entry, path, collector);     // Catch: Throwable -> L19
        goto L14
    L16:
        Unit r2 = Unit.INSTANCE;     // Catch: Throwable -> L19
        CloseableKt.closeFinally(r6, null);     // Catch: Exception -> L5
        return;
    L19:
        th = move-exception;
        throw th;     // Catch: Throwable -> L21
    L21:
        th = move-exception;
        CloseableKt.closeFinally(r6, th);     // Catch: Exception -> L5
        throw th;     // Catch: Exception -> L5
    L35:
        return;
    L5:
        exception$iv = move-exception;
        collector.collect(exception$iv);
        return;
    L8:
        r5 = null;
        goto L10
    }

    public static final void checkFileName(Path $this$checkFileName) {
        Intrinsics.checkNotNullParameter($this$checkFileName, "<this>");
        String fileName = PathsKt.getName($this$checkFileName);
        switch(fileName.hashCode()) {
            case 46: goto L21;
            case 1472: goto L18;
            case 1473: goto L15;
            case 1518: goto L12;
            case 45679: goto L9;
            case 45724: goto L6;
            default: goto L25;
        };
    L25:
        return;
    L6:
        if (fileName.equals("..\\") == true) goto L24;
        return;
    L24:
        throw new IllegalFileNameException($this$checkFileName);
    L9:
        if (fileName.equals("../") == true) goto L24;
        return;
    L12:
        if (fileName.equals(".\\") == true) goto L24;
        return;
    L15:
        if (fileName.equals("./") == true) goto L24;
        return;
    L18:
        if (fileName.equals("..") == true) goto L24;
        return;
    L21:
        if (fileName.equals(".") == true) goto L24;
    }

    private static final void checkNotSameAs$PathsKt__PathRecursiveFunctionsKt(Path $this$checkNotSameAs, Path parent) {
        if (Files.isSymbolicLink($this$checkNotSameAs) == false) goto L5;
        return;
    L5:
        if (Files.isSameFile($this$checkNotSameAs, parent) == true) goto L8;
        return;
    L8:
        throw new FileSystemLoopException($this$checkNotSameAs.toString());
    }
}
