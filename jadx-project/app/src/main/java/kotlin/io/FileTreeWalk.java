package kotlin.io;

import androidx.autofill.HintConstants;
import java.io.File;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.AbstractIterator;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;

/* JADX INFO: compiled from: FileTreeWalk.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010(\n\u0002\b\u0006\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0003\u001b\u001c\u001dB\u008b\u0001\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\u0014\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007\u0012\u0014\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\n\u0018\u00010\u0007\u00128\u0010\u000b\u001a4\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u000f\u0012\u0013\u0012\u00110\u0010¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u0011\u0012\u0004\u0012\u00020\n\u0018\u00010\f\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0013¢\u0006\u0004\b\u0014\u0010\u0015B\u001b\b\u0010\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0014\u0010\u0016J\u000f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00020\u0018H\u0096\u0002J\u001a\u0010\u0006\u001a\u00020\u00002\u0012\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\b0\u0007J\u001a\u0010\t\u001a\u00020\u00002\u0012\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\n0\u0007J \u0010\u000b\u001a\u00020\u00002\u0018\u0010\u0019\u001a\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\n0\fJ\u000e\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u001a\u001a\u00020\u0013R\u000e\u0010\u0003\u001a\u00020\u0002X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\n\u0018\u00010\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R@\u0010\u000b\u001a4\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u000f\u0012\u0013\u0012\u00110\u0010¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u0011\u0012\u0004\u0012\u00020\n\u0018\u00010\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001e"}, d2 = {"Lkotlin/io/FileTreeWalk;", "Lkotlin/sequences/Sequence;", "Ljava/io/File;", "start", "direction", "Lkotlin/io/FileWalkDirection;", "onEnter", "Lkotlin/Function1;", "", "onLeave", "", "onFail", "Lkotlin/Function2;", "Lkotlin/ParameterName;", HintConstants.AUTOFILL_HINT_NAME, "f", "Ljava/io/IOException;", "e", "maxDepth", "", "<init>", "(Ljava/io/File;Lkotlin/io/FileWalkDirection;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;I)V", "(Ljava/io/File;Lkotlin/io/FileWalkDirection;)V", "iterator", "", "function", "depth", "WalkState", "DirectoryState", "FileTreeWalkIterator", "kotlin-stdlib"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class FileTreeWalk implements Sequence<File> {
    private final FileWalkDirection direction;
    private final int maxDepth;
    private final Function1<File, Boolean> onEnter;
    private final Function2<File, IOException, Unit> onFail;
    private final Function1<File, Unit> onLeave;
    private final File start;

    /* JADX INFO: compiled from: FileTreeWalk.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\"\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lkotlin/io/FileTreeWalk$DirectoryState;", "Lkotlin/io/FileTreeWalk$WalkState;", "rootDir", "Ljava/io/File;", "<init>", "(Ljava/io/File;)V", "kotlin-stdlib"}, k = 1, mv = {2, 2, 0}, xi = 48)
    private static abstract class DirectoryState extends WalkState {
        public DirectoryState(File rootDir) {
            Intrinsics.checkNotNullParameter(rootDir, "rootDir");
            super(rootDir);
            if (rootDir.isDirectory() == false) goto L6;
            return;
        L6:
            throw new AssertionError("rootDir must be verified to be directory beforehand.");
        }
    }

    /* JADX INFO: compiled from: FileTreeWalk.kt */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0082\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0003\u000e\u000f\u0010B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\b\u0010\b\u001a\u00020\tH\u0014J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0002H\u0002J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0002H\u0082\u0010R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lkotlin/io/FileTreeWalk$FileTreeWalkIterator;", "Lkotlin/collections/AbstractIterator;", "Ljava/io/File;", "<init>", "(Lkotlin/io/FileTreeWalk;)V", "state", "Ljava/util/ArrayDeque;", "Lkotlin/io/FileTreeWalk$WalkState;", "computeNext", "", "directoryState", "Lkotlin/io/FileTreeWalk$DirectoryState;", "root", "gotoNext", "BottomUpDirectoryState", "TopDownDirectoryState", "SingleFileState", "kotlin-stdlib"}, k = 1, mv = {2, 2, 0}, xi = 48)
    private final class FileTreeWalkIterator extends AbstractIterator<File> {
        private final ArrayDeque<WalkState> state;
        final /* synthetic */ FileTreeWalk this$0;

        /* JADX INFO: compiled from: FileTreeWalk.kt */
        @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0082\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\n\u0010\u000e\u001a\u0004\u0018\u00010\u0003H\u0016R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u0018\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\tX\u0082\u000e¢\u0006\u0004\n\u0002\u0010\nR\u000e\u0010\u000b\u001a\u00020\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lkotlin/io/FileTreeWalk$FileTreeWalkIterator$BottomUpDirectoryState;", "Lkotlin/io/FileTreeWalk$DirectoryState;", "rootDir", "Ljava/io/File;", "<init>", "(Lkotlin/io/FileTreeWalk$FileTreeWalkIterator;Ljava/io/File;)V", "rootVisited", "", "fileList", "", "[Ljava/io/File;", "fileIndex", "", "failed", "step", "kotlin-stdlib"}, k = 1, mv = {2, 2, 0}, xi = 48)
        private final class BottomUpDirectoryState extends DirectoryState {
            private boolean failed;
            private int fileIndex;
            private File[] fileList;
            private boolean rootVisited;
            final /* synthetic */ FileTreeWalkIterator this$0;

            public BottomUpDirectoryState(FileTreeWalkIterator this$0, File rootDir) {
                Intrinsics.checkNotNullParameter(rootDir, "rootDir");
                this.this$0 = this$0;
                super(rootDir);
            }

            @Override // kotlin.io.FileTreeWalk.WalkState
            public File step() {
                if (this.failed == true) goto L20;
                if (this.fileList != null) goto L20;
                Function1 r0 = FileTreeWalk.access$getOnEnter$p(this.this$0.this$0);
                boolean r3 = false;
                if (r0 != null) goto L9;
            L11:
                if (r3 == false) goto L13;
                return null;
            L13:
                this.fileList = getRoot().listFiles();
                if (this.fileList != null) goto L20;
                Function2 r1 = FileTreeWalk.access$getOnFail$p(this.this$0.this$0);
                if (r1 == null) goto L18;
                r1.invoke(getRoot(), new AccessDeniedException(getRoot(), null, "Cannot list files in a directory", 2, null));
            L18:
                this.failed = true;
                goto L20
            L9:
                if (((Boolean) r0.invoke(getRoot())).booleanValue() == true) goto L11;
                r3 = true;
            L20:
                if (this.fileList == null) goto L26;
                int r2 = this.fileIndex;
                File[] r4 = this.fileList;
                Intrinsics.checkNotNull(r4);
                if (r2 >= r4.length) goto L26;
                File[] r5 = this.fileList;
                Intrinsics.checkNotNull(r5);
                int r6 = this.fileIndex;
                this.fileIndex = r6 + 1;
                return r5[r6];
            L26:
                if (this.rootVisited == true) goto L29;
                this.rootVisited = true;
                return getRoot();
            L29:
                Function1 r7 = FileTreeWalk.access$getOnLeave$p(this.this$0.this$0);
                if (r7 == null) goto L32;
                r7.invoke(getRoot());
            L32:
                return null;
            }
        }

        /* JADX INFO: compiled from: FileTreeWalk.kt */
        @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0082\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\n\u0010\b\u001a\u0004\u0018\u00010\u0003H\u0016R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lkotlin/io/FileTreeWalk$FileTreeWalkIterator$SingleFileState;", "Lkotlin/io/FileTreeWalk$WalkState;", "rootFile", "Ljava/io/File;", "<init>", "(Lkotlin/io/FileTreeWalk$FileTreeWalkIterator;Ljava/io/File;)V", "visited", "", "step", "kotlin-stdlib"}, k = 1, mv = {2, 2, 0}, xi = 48)
        private final class SingleFileState extends WalkState {
            final /* synthetic */ FileTreeWalkIterator this$0;
            private boolean visited;

            public SingleFileState(FileTreeWalkIterator this$0, File rootFile) {
                Intrinsics.checkNotNullParameter(rootFile, "rootFile");
                this.this$0 = this$0;
                super(rootFile);
                if (rootFile.isFile() == false) goto L6;
                return;
            L6:
                throw new AssertionError("rootFile must be verified to be file beforehand.");
            }

            @Override // kotlin.io.FileTreeWalk.WalkState
            public File step() {
                if (this.visited == false) goto L6;
                return null;
            L6:
                this.visited = true;
                return getRoot();
            }
        }

        /* JADX INFO: compiled from: FileTreeWalk.kt */
        @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0082\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\n\u0010\r\u001a\u0004\u0018\u00010\u0003H\u0016R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u0018\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\tX\u0082\u000e¢\u0006\u0004\n\u0002\u0010\nR\u000e\u0010\u000b\u001a\u00020\fX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lkotlin/io/FileTreeWalk$FileTreeWalkIterator$TopDownDirectoryState;", "Lkotlin/io/FileTreeWalk$DirectoryState;", "rootDir", "Ljava/io/File;", "<init>", "(Lkotlin/io/FileTreeWalk$FileTreeWalkIterator;Ljava/io/File;)V", "rootVisited", "", "fileList", "", "[Ljava/io/File;", "fileIndex", "", "step", "kotlin-stdlib"}, k = 1, mv = {2, 2, 0}, xi = 48)
        private final class TopDownDirectoryState extends DirectoryState {
            private int fileIndex;
            private File[] fileList;
            private boolean rootVisited;
            final /* synthetic */ FileTreeWalkIterator this$0;

            public TopDownDirectoryState(FileTreeWalkIterator this$0, File rootDir) {
                Intrinsics.checkNotNullParameter(rootDir, "rootDir");
                this.this$0 = this$0;
                super(rootDir);
            }

            @Override // kotlin.io.FileTreeWalk.WalkState
            public File step() {
                if (this.rootVisited == true) goto L14;
                Function1 r0 = FileTreeWalk.access$getOnEnter$p(this.this$0.this$0);
                boolean r2 = false;
                if (r0 != null) goto L7;
            L9:
                if (r2 == false) goto L11;
                return null;
            L11:
                this.rootVisited = true;
                return getRoot();
            L7:
                if (((Boolean) r0.invoke(getRoot())).booleanValue() == true) goto L9;
                r2 = true;
                goto L9
            L14:
                if (this.fileList == null) goto L23;
                int r1 = this.fileIndex;
                File[] r3 = this.fileList;
                Intrinsics.checkNotNull(r3);
                if (r1 < r3.length) goto L23;
                Function1 r4 = FileTreeWalk.access$getOnLeave$p(this.this$0.this$0);
                if (r4 == null) goto L21;
                r4.invoke(getRoot());
            L21:
                return null;
            L23:
                if (this.fileList != null) goto L37;
                this.fileList = getRoot().listFiles();
                if (this.fileList != null) goto L30;
                Function2 r5 = FileTreeWalk.access$getOnFail$p(this.this$0.this$0);
                if (r5 == null) goto L30;
                r5.invoke(getRoot(), new AccessDeniedException(getRoot(), null, "Cannot list files in a directory", 2, null));
            L30:
                if (this.fileList == null) goto L33;
                File[] r6 = this.fileList;
                Intrinsics.checkNotNull(r6);
                if (r6.length != 0) goto L37;
            L33:
                Function1 r7 = FileTreeWalk.access$getOnLeave$p(this.this$0.this$0);
                if (r7 == null) goto L36;
                r7.invoke(getRoot());
            L36:
                return null;
            L37:
                File[] r8 = this.fileList;
                Intrinsics.checkNotNull(r8);
                int r9 = this.fileIndex;
                this.fileIndex = r9 + 1;
                return r8[r9];
            }
        }

        /* JADX INFO: compiled from: FileTreeWalk.kt */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0 = null;

            static {
                int[] r0 = new int[FileWalkDirection.values().length];
                r0[FileWalkDirection.TOP_DOWN.ordinal()] = 1;     // Catch: NoSuchFieldError -> L5
            L11:
                r0[FileWalkDirection.BOTTOM_UP.ordinal()] = 2;     // Catch: NoSuchFieldError -> L8
            L9:
                $EnumSwitchMapping$0 = r0;
            }
        }

        public FileTreeWalkIterator(FileTreeWalk this$0) {
            this.this$0 = this$0;
            this.state = new ArrayDeque();
            if (FileTreeWalk.access$getStart$p(this.this$0).isDirectory() == false) goto L6;
            this.state.push(directoryState(FileTreeWalk.access$getStart$p(this.this$0)));
            return;
        L6:
            if (FileTreeWalk.access$getStart$p(this.this$0).isFile() == false) goto L8;
            this.state.push(new SingleFileState(this, FileTreeWalk.access$getStart$p(this.this$0)));
            return;
        L8:
            done();
        }

        @Override // kotlin.collections.AbstractIterator
        protected void computeNext() {
            File nextFile = gotoNext();
            if (nextFile == null) goto L5;
            setNext(nextFile);
            return;
        L5:
            done();
        }

        private final DirectoryState directoryState(File root) {
            FileWalkDirection r0 = FileTreeWalk.access$getDirection$p(this.this$0);
            switch(WhenMappings.$EnumSwitchMapping$0[r0.ordinal()]) {
                case 1: goto L8;
                case 2: goto L9;
                default: goto L5;
            };
        L5:
            throw new NoWhenBranchMatchedException();
        L9:
            return new BottomUpDirectoryState(this, root);
        L8:
            return new TopDownDirectoryState(this, root);
        }

        private final File gotoNext() {
        L2:
            WalkState topState = this.state.peek();
            if (topState == null) goto L4;
            File file = topState.step();
            if (file == null) goto L8;
            if (Intrinsics.areEqual(file, topState.getRoot()) == true) goto L17;
            if (file.isDirectory() == false) goto L17;
            if (this.state.size() >= FileTreeWalk.access$getMaxDepth$p(this.this$0)) goto L17;
            this.state.push(directoryState(file));
        L17:
            return file;
        L8:
            this.state.pop();
            goto L2
        L4:
            return null;
        }
    }

    /* JADX INFO: compiled from: FileTreeWalk.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\"\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\n\u0010\b\u001a\u0004\u0018\u00010\u0003H&R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lkotlin/io/FileTreeWalk$WalkState;", "", "root", "Ljava/io/File;", "<init>", "(Ljava/io/File;)V", "getRoot", "()Ljava/io/File;", "step", "kotlin-stdlib"}, k = 1, mv = {2, 2, 0}, xi = 48)
    private static abstract class WalkState {
        private final File root;

        public abstract File step();

        public WalkState(File root) {
            Intrinsics.checkNotNullParameter(root, "root");
            this.root = root;
        }

        public final File getRoot() {
            return this.root;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private FileTreeWalk(File start, FileWalkDirection direction, Function1<? super File, Boolean> r3, Function1<? super File, Unit> r4, Function2<? super File, ? super IOException, Unit> r5, int maxDepth) {
        this.start = start;
        this.direction = direction;
        this.onEnter = r3;
        this.onLeave = r4;
        this.onFail = r5;
        this.maxDepth = maxDepth;
    }

    /* synthetic */ FileTreeWalk(File r8, FileWalkDirection r9, Function1 r10, Function1 r11, Function2 r12, int r13, int r14, DefaultConstructorMarker r15) {
        if ((r14 & 2) == 0) goto L5;
        FileWalkDirection r2 = FileWalkDirection.TOP_DOWN;
    L7:
        if ((r14 & 32) == 0) goto L9;
        int r6 = Integer.MAX_VALUE;
    L10:
        this(r8, r2, r10, r11, r12, r6);
        return;
    L9:
        r6 = r13;
        goto L10
    L5:
        r2 = r9;
        goto L7
    }

    public static final /* synthetic */ FileWalkDirection access$getDirection$p(FileTreeWalk $this) {
        return $this.direction;
    }

    public static final /* synthetic */ int access$getMaxDepth$p(FileTreeWalk $this) {
        return $this.maxDepth;
    }

    public static final /* synthetic */ Function1 access$getOnEnter$p(FileTreeWalk $this) {
        return $this.onEnter;
    }

    public static final /* synthetic */ Function2 access$getOnFail$p(FileTreeWalk $this) {
        return $this.onFail;
    }

    public static final /* synthetic */ Function1 access$getOnLeave$p(FileTreeWalk $this) {
        return $this.onLeave;
    }

    public static final /* synthetic */ File access$getStart$p(FileTreeWalk $this) {
        return $this.start;
    }

    public FileTreeWalk(File start, FileWalkDirection direction) {
        Intrinsics.checkNotNullParameter(start, "start");
        Intrinsics.checkNotNullParameter(direction, "direction");
        Function1 r4 = null;
        Function1 r5 = null;
        Function2 r6 = null;
        int r7 = 0;
        this(start, direction, r4, r5, r6, r7, 32, null);
    }

    public /* synthetic */ FileTreeWalk(File r1, FileWalkDirection r2, int r3, DefaultConstructorMarker r4) {
        if ((r3 & 2) == 0) goto L5;
        r2 = FileWalkDirection.TOP_DOWN;
    L5:
        this(r1, r2);
    }

    @Override // kotlin.sequences.Sequence
    public Iterator<File> iterator() {
        return new FileTreeWalkIterator(this);
    }

    public final FileTreeWalk onEnter(Function1<? super File, Boolean> r9) {
        Intrinsics.checkNotNullParameter(r9, "function");
        return new FileTreeWalk(this.start, this.direction, r9, this.onLeave, this.onFail, this.maxDepth);
    }

    public final FileTreeWalk onLeave(Function1<? super File, Unit> r9) {
        Intrinsics.checkNotNullParameter(r9, "function");
        return new FileTreeWalk(this.start, this.direction, this.onEnter, r9, this.onFail, this.maxDepth);
    }

    public final FileTreeWalk onFail(Function2<? super File, ? super IOException, Unit> r9) {
        Intrinsics.checkNotNullParameter(r9, "function");
        return new FileTreeWalk(this.start, this.direction, this.onEnter, this.onLeave, r9, this.maxDepth);
    }

    public final FileTreeWalk maxDepth(int depth) {
        if (depth <= 0) goto L6;
        return new FileTreeWalk(this.start, this.direction, this.onEnter, this.onLeave, this.onFail, depth);
    L6:
        throw new IllegalArgumentException("depth must be positive, but was " + depth + '.');
    }
}
