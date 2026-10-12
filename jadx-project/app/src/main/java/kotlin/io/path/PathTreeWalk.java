package kotlin.io.path;

import java.nio.file.FileSystemLoopException;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.ArrayDeque;
import kotlin.collections.ArraysKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.coroutines.jvm.internal.SpillingKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequenceScope;
import kotlin.sequences.SequencesKt;

/* JADX INFO: compiled from: PathTreeWalk.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010(\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0004\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u000e\u0010\u0004\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u0016H\u0096\u0002JB\u0010\u0017\u001a\u00020\u0018*\b\u0012\u0004\u0012\u00020\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\u0018\u0010\u001e\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001b0 \u0012\u0004\u0012\u00020\u00180\u001fH\u0082H¢\u0006\u0002\u0010!J\u000e\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00020\u0016H\u0002J\u000e\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00020\u0016H\u0002R\u000e\u0010\u0003\u001a\u00020\u0002X\u0082\u0004¢\u0006\u0002\n\u0000R\u0018\u0010\u0004\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\tR\u0014\u0010\n\u001a\u00020\u000b8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00058BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u000b8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\rR\u0014\u0010\u0014\u001a\u00020\u000b8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\r¨\u0006$"}, d2 = {"Lkotlin/io/path/PathTreeWalk;", "Lkotlin/sequences/Sequence;", "Ljava/nio/file/Path;", "start", "options", "", "Lkotlin/io/path/PathWalkOption;", "<init>", "(Ljava/nio/file/Path;[Lkotlin/io/path/PathWalkOption;)V", "[Lkotlin/io/path/PathWalkOption;", "followLinks", "", "getFollowLinks", "()Z", "linkOptions", "Ljava/nio/file/LinkOption;", "getLinkOptions", "()[Ljava/nio/file/LinkOption;", "includeDirectories", "getIncludeDirectories", "isBFS", "iterator", "", "yieldIfNeeded", "", "Lkotlin/sequences/SequenceScope;", "node", "Lkotlin/io/path/PathNode;", "entriesReader", "Lkotlin/io/path/DirectoryEntriesReader;", "entriesAction", "Lkotlin/Function1;", "", "(Lkotlin/sequences/SequenceScope;Lkotlin/io/path/PathNode;Lkotlin/io/path/DirectoryEntriesReader;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "dfsIterator", "bfsIterator", "kotlin-stdlib-jdk7"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class PathTreeWalk implements Sequence<Path> {
    private final PathWalkOption[] options;
    private final Path start;

    /* JADX INFO: renamed from: kotlin.io.path.PathTreeWalk$bfsIterator$1, reason: invalid class name */
    /* JADX INFO: compiled from: PathTreeWalk.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlin/sequences/SequenceScope;", "Ljava/nio/file/Path;"}, k = 3, mv = {2, 2, 0}, xi = 48)
    @DebugMetadata(c = "kotlin.io.path.PathTreeWalk$bfsIterator$1", f = "PathTreeWalk.kt", i = {0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1}, l = {191, 197}, m = "invokeSuspend", n = {"$this$iterator", "queue", "entriesReader", "pathNode", "this_$iv", "$this$yieldIfNeeded$iv", "path$iv", "$i$f$yieldIfNeeded", "$this$iterator", "queue", "entriesReader", "pathNode", "this_$iv", "$this$yieldIfNeeded$iv", "path$iv", "$i$f$yieldIfNeeded"}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "I$0", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "I$0"})
    static final class AnonymousClass1 extends RestrictedSuspendLambda implements Function2<SequenceScope<? super Path>, Continuation<? super Unit>, Object> {
        int I$0;
        private /* synthetic */ Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        Object L$6;
        int label;
        final /* synthetic */ PathTreeWalk this$0;

        AnonymousClass1(PathTreeWalk r2, Continuation<? super AnonymousClass1> r3) {
            this.this$0 = r2;
            super(2, r3);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object r3, Continuation<?> r4) {
            AnonymousClass1 r0 = new AnonymousClass1(this.this$0, r4);
            r0.L$0 = r3;
            return r0;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(SequenceScope<? super Path> r2, Continuation<? super Unit> r3) {
            return invoke2(r2, r3);
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(SequenceScope<? super Path> r3, Continuation<? super Unit> r4) {
            return ((AnonymousClass1) create(r3, r4)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x011d -> B:9:0x00a0). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x011f -> B:9:0x00a0). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x0177 -> B:35:0x0182). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object $result) {
            SequenceScope $this$iterator = (SequenceScope) this.L$0;
            Object r2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            switch(this.label) {
                case 0: goto L8;
                case 1: goto L7;
                case 2: goto L6;
                default: goto L5;
            };
        L6:
            int r3 = this.I$0;
            Path r4 = (Path) this.L$6;
            SequenceScope r5 = (SequenceScope) this.L$5;
            PathTreeWalk r6 = (PathTreeWalk) this.L$4;
            PathNode r7 = (PathNode) this.L$3;
            DirectoryEntriesReader entriesReader = (DirectoryEntriesReader) this.L$2;
            ArrayDeque queue = (ArrayDeque) this.L$1;
            ResultKt.throwOnFailure($result);
            ArrayDeque queue2 = queue;
            Object r8 = r2;
            DirectoryEntriesReader entriesReader2 = entriesReader;
            SequenceScope $this$iterator2 = $this$iterator;
            AnonymousClass1 r9 = this;
        L35:
            Object r10 = r8;
            AnonymousClass1 r11 = r9;
            DirectoryEntriesReader entriesReader3 = entriesReader2;
            ArrayDeque queue3 = queue2;
        L10:
            if (queue3.isEmpty() == true) goto L37;
            PathNode pathNode = (PathNode) queue3.removeFirst();
            PathTreeWalk this_$iv = r11.this$0;
            SequenceScope $this$yieldIfNeeded$iv = $this$iterator2;
            Path path$iv = pathNode.getPath();
            if (pathNode.getParent() == null) goto L14;
            PathsKt.checkFileName(path$iv);
        L14:
            LinkOption[] r12 = PathTreeWalk.access$getLinkOptions(this_$iv);
            LinkOption[] r13 = (LinkOption[]) Arrays.copyOf(r12, r12.length);
            if (Files.isDirectory(path$iv, (LinkOption[]) Arrays.copyOf(r13, r13.length)) == true) goto L17;
            if (Files.exists(path$iv, (LinkOption[]) Arrays.copyOf(new LinkOption[]{LinkOption.NOFOLLOW_LINKS}, 1)) == false) goto L10;
            r11.L$0 = $this$iterator2;
            r11.L$1 = queue3;
            r11.L$2 = entriesReader3;
            r11.L$3 = SpillingKt.nullOutSpilledVariable(pathNode);
            r11.L$4 = SpillingKt.nullOutSpilledVariable(this_$iv);
            r11.L$5 = SpillingKt.nullOutSpilledVariable($this$yieldIfNeeded$iv);
            r11.L$6 = SpillingKt.nullOutSpilledVariable(path$iv);
            r11.I$0 = 0;
            r11.label = 2;
            if ($this$yieldIfNeeded$iv.yield(path$iv, r11) != r10) goto L34;
            return r10;
        L34:
            AnonymousClass1 r16 = r11;
            r8 = r10;
            queue2 = queue3;
            entriesReader2 = entriesReader3;
            r9 = r16;
            goto L35
        L17:
            if (PathTreeWalkKt.access$createsCycle(pathNode) == true) goto L28;
            if (PathTreeWalk.access$getIncludeDirectories(this_$iv) == false) goto L24;
            r11.L$0 = $this$iterator2;
            r11.L$1 = queue3;
            r11.L$2 = entriesReader3;
            r11.L$3 = pathNode;
            r11.L$4 = this_$iv;
            r11.L$5 = SpillingKt.nullOutSpilledVariable($this$yieldIfNeeded$iv);
            r11.L$6 = path$iv;
            r11.I$0 = 0;
            r11.label = 1;
            if ($this$yieldIfNeeded$iv.yield(path$iv, r11) != r10) goto L24;
            return r10;
        L24:
            LinkOption[] r14 = PathTreeWalk.access$getLinkOptions(this_$iv);
            LinkOption[] r15 = (LinkOption[]) Arrays.copyOf(r14, r14.length);
            if (Files.isDirectory(path$iv, (LinkOption[]) Arrays.copyOf(r15, r15.length)) == false) goto L10;
            queue3.addAll(entriesReader3.readEntries(pathNode));
            goto L10
        L28:
            throw new FileSystemLoopException(path$iv.toString());
        L37:
            return Unit.INSTANCE;
        L7:
            int $i$f$yieldIfNeeded = this.I$0;
            Path path$iv2 = (Path) this.L$6;
            SequenceScope r17 = (SequenceScope) this.L$5;
            this_$iv = (PathTreeWalk) this.L$4;
            pathNode = (PathNode) this.L$3;
            entriesReader3 = (DirectoryEntriesReader) this.L$2;
            queue3 = (ArrayDeque) this.L$1;
            ResultKt.throwOnFailure($result);
            path$iv = path$iv2;
            r11 = this;
            r10 = r2;
            $this$iterator2 = $this$iterator;
            goto L24
        L8:
            ResultKt.throwOnFailure($result);
            ArrayDeque queue4 = new ArrayDeque();
            DirectoryEntriesReader entriesReader4 = new DirectoryEntriesReader(PathTreeWalk.access$getFollowLinks(this.this$0));
            queue4.addLast(new PathNode(PathTreeWalk.access$getStart$p(this.this$0), PathTreeWalkKt.access$keyOf(PathTreeWalk.access$getStart$p(this.this$0), PathTreeWalk.access$getLinkOptions(this.this$0)), null));
            queue3 = queue4;
            entriesReader3 = entriesReader4;
            r11 = this;
            r10 = r2;
            $this$iterator2 = $this$iterator;
            goto L10
        L5:
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: renamed from: kotlin.io.path.PathTreeWalk$dfsIterator$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: PathTreeWalk.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlin/sequences/SequenceScope;", "Ljava/nio/file/Path;"}, k = 3, mv = {2, 2, 0}, xi = 48)
    @DebugMetadata(c = "kotlin.io.path.PathTreeWalk$dfsIterator$1", f = "PathTreeWalk.kt", i = {0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3}, l = {191, 197, 210, 216}, m = "invokeSuspend", n = {"$this$iterator", "stack", "entriesReader", "startNode", "this_$iv", "$this$yieldIfNeeded$iv", "path$iv", "$i$f$yieldIfNeeded", "$this$iterator", "stack", "entriesReader", "startNode", "this_$iv", "$this$yieldIfNeeded$iv", "path$iv", "$i$f$yieldIfNeeded", "$this$iterator", "stack", "entriesReader", "startNode", "topNode", "topIterator", "pathNode", "this_$iv", "$this$yieldIfNeeded$iv", "path$iv", "$i$f$yieldIfNeeded", "$this$iterator", "stack", "entriesReader", "startNode", "topNode", "topIterator", "pathNode", "this_$iv", "$this$yieldIfNeeded$iv", "path$iv", "$i$f$yieldIfNeeded"}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "I$0", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "I$0", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "L$8", "L$9", "I$0", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "L$8", "L$9", "I$0"})
    static final class C06991 extends RestrictedSuspendLambda implements Function2<SequenceScope<? super Path>, Continuation<? super Unit>, Object> {
        int I$0;
        private /* synthetic */ Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        Object L$6;
        Object L$7;
        Object L$8;
        Object L$9;
        int label;
        final /* synthetic */ PathTreeWalk this$0;

        C06991(PathTreeWalk r2, Continuation<? super C06991> r3) {
            this.this$0 = r2;
            super(2, r3);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object r3, Continuation<?> r4) {
            C06991 r0 = new C06991(this.this$0, r4);
            r0.L$0 = r3;
            return r0;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(SequenceScope<? super Path> r2, Continuation<? super Unit> r3) {
            return invoke2(r2, r3);
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(SequenceScope<? super Path> r3, Continuation<? super Unit> r4) {
            return ((C06991) create(r3, r4)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:56:0x028d -> B:36:0x01d2). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:64:0x02f0 -> B:65:0x02f5). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object $result) {
            SequenceScope $this$iterator = (SequenceScope) this.L$0;
            Object r2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            char r4 = 0;
            switch(this.label) {
                case 0: goto L10;
                case 1: goto L9;
                case 2: goto L8;
                case 3: goto L7;
                case 4: goto L6;
                default: goto L5;
            };
        L6:
            int r3 = this.I$0;
            Path r6 = (Path) this.L$9;
            SequenceScope r7 = (SequenceScope) this.L$8;
            PathTreeWalk r8 = (PathTreeWalk) this.L$7;
            PathNode r9 = (PathNode) this.L$6;
            Iterator r10 = (Iterator) this.L$5;
            PathNode r11 = (PathNode) this.L$4;
            PathNode startNode = (PathNode) this.L$3;
            DirectoryEntriesReader entriesReader = (DirectoryEntriesReader) this.L$2;
            ArrayDeque stack = (ArrayDeque) this.L$1;
            ResultKt.throwOnFailure($result);
            char r16 = 0;
            C06991 r5 = this;
            Object r0 = r2;
            SequenceScope $this$iterator2 = $this$iterator;
        L65:
            Object r12 = r0;
            C06991 r13 = r5;
            r4 = r16;
        L37:
            if (stack.isEmpty() == true) goto L68;
            PathNode topNode = (PathNode) stack.last();
            Iterator<PathNode> r14 = topNode.getContentIterator();
            Intrinsics.checkNotNull(r14);
            if (r14.hasNext() == false) goto L66;
            PathNode pathNode = r14.next();
            PathTreeWalk this_$iv = r13.this$0;
            SequenceScope $this$yieldIfNeeded$iv = $this$iterator2;
            r16 = r4;
            Path path$iv = pathNode.getPath();
            if (pathNode.getParent() == null) goto L43;
            PathsKt.checkFileName(path$iv);
        L43:
            LinkOption[] r15 = PathTreeWalk.access$getLinkOptions(this_$iv);
            LinkOption[] r1 = (LinkOption[]) Arrays.copyOf(r15, r15.length);
            if (Files.isDirectory(path$iv, (LinkOption[]) Arrays.copyOf(r1, r1.length)) == true) goto L46;
            LinkOption[] r17 = new LinkOption[1];
            r17[r16] = LinkOption.NOFOLLOW_LINKS;
            if (Files.exists(path$iv, (LinkOption[]) Arrays.copyOf(r17, 1)) == true) goto L61;
        L56:
            r4 = r16;
            goto L37
        L61:
            r13.L$0 = $this$iterator2;
            r13.L$1 = stack;
            r13.L$2 = entriesReader;
            r13.L$3 = SpillingKt.nullOutSpilledVariable(startNode);
            r13.L$4 = SpillingKt.nullOutSpilledVariable(topNode);
            r13.L$5 = SpillingKt.nullOutSpilledVariable(r14);
            r13.L$6 = SpillingKt.nullOutSpilledVariable(pathNode);
            r13.L$7 = SpillingKt.nullOutSpilledVariable(this_$iv);
            r13.L$8 = SpillingKt.nullOutSpilledVariable($this$yieldIfNeeded$iv);
            r13.L$9 = SpillingKt.nullOutSpilledVariable(path$iv);
            r13.I$0 = 0;
            r13.label = 4;
            if ($this$yieldIfNeeded$iv.yield(path$iv, r13) != r12) goto L64;
            return r12;
        L64:
            r5 = r13;
            r0 = r12;
            goto L65
        L46:
            if (PathTreeWalkKt.access$createsCycle(pathNode) == true) goto L58;
            if (PathTreeWalk.access$getIncludeDirectories(this_$iv) == false) goto L53;
            r13.L$0 = $this$iterator2;
            r13.L$1 = stack;
            r13.L$2 = entriesReader;
            r13.L$3 = SpillingKt.nullOutSpilledVariable(startNode);
            r13.L$4 = SpillingKt.nullOutSpilledVariable(topNode);
            r13.L$5 = SpillingKt.nullOutSpilledVariable(r14);
            r13.L$6 = pathNode;
            r13.L$7 = this_$iv;
            r13.L$8 = SpillingKt.nullOutSpilledVariable($this$yieldIfNeeded$iv);
            r13.L$9 = path$iv;
            r13.I$0 = 0;
            r13.label = 3;
            if ($this$yieldIfNeeded$iv.yield(path$iv, r13) != r12) goto L53;
            return r12;
        L53:
            LinkOption[] r18 = PathTreeWalk.access$getLinkOptions(this_$iv);
            LinkOption[] r19 = (LinkOption[]) Arrays.copyOf(r18, r18.length);
            if (Files.isDirectory(path$iv, (LinkOption[]) Arrays.copyOf(r19, r19.length)) == false) goto L56;
            pathNode.setContentIterator(entriesReader.readEntries(pathNode).iterator());
            stack.addLast(pathNode);
            goto L56
        L58:
            throw new FileSystemLoopException(path$iv.toString());
        L66:
            r16 = r4;
            stack.removeLast();
            goto L56
        L68:
            return Unit.INSTANCE;
        L7:
            int $i$f$yieldIfNeeded = this.I$0;
            Path path$iv2 = (Path) this.L$9;
            SequenceScope r20 = (SequenceScope) this.L$8;
            this_$iv = (PathTreeWalk) this.L$7;
            pathNode = (PathNode) this.L$6;
            Iterator r110 = (Iterator) this.L$5;
            PathNode r111 = (PathNode) this.L$4;
            startNode = (PathNode) this.L$3;
            entriesReader = (DirectoryEntriesReader) this.L$2;
            stack = (ArrayDeque) this.L$1;
            ResultKt.throwOnFailure($result);
            r16 = 0;
            path$iv = path$iv2;
            r13 = this;
            r12 = r2;
            $this$iterator2 = $this$iterator;
            goto L53
        L8:
            int $i$f$yieldIfNeeded2 = this.I$0;
            Path r21 = (Path) this.L$6;
            SequenceScope r22 = (SequenceScope) this.L$5;
            PathTreeWalk r23 = (PathTreeWalk) this.L$4;
            PathNode startNode2 = (PathNode) this.L$3;
            DirectoryEntriesReader entriesReader2 = (DirectoryEntriesReader) this.L$2;
            ArrayDeque stack2 = (ArrayDeque) this.L$1;
            ResultKt.throwOnFailure($result);
        L34:
            r13 = this;
            r12 = r2;
            startNode = startNode2;
            entriesReader = entriesReader2;
            stack = stack2;
            $this$iterator2 = $this$iterator;
            goto L37
        L9:
            int $i$f$yieldIfNeeded3 = this.I$0;
            Path path$iv3 = (Path) this.L$6;
            SequenceScope r24 = (SequenceScope) this.L$5;
            PathTreeWalk this_$iv2 = (PathTreeWalk) this.L$4;
            startNode2 = (PathNode) this.L$3;
            entriesReader2 = (DirectoryEntriesReader) this.L$2;
            stack2 = (ArrayDeque) this.L$1;
            ResultKt.throwOnFailure($result);
        L23:
            LinkOption[] r112 = PathTreeWalk.access$getLinkOptions(this_$iv2);
            LinkOption[] r113 = (LinkOption[]) Arrays.copyOf(r112, r112.length);
            if (Files.isDirectory(path$iv3, (LinkOption[]) Arrays.copyOf(r113, r113.length)) == false) goto L26;
            startNode2.setContentIterator(entriesReader2.readEntries(startNode2).iterator());
            stack2.addLast(startNode2);
        L26:
            r13 = this;
            r12 = r2;
            startNode = startNode2;
            entriesReader = entriesReader2;
            stack = stack2;
            $this$iterator2 = $this$iterator;
            goto L37
        L10:
            ResultKt.throwOnFailure($result);
            stack2 = new ArrayDeque();
            entriesReader2 = new DirectoryEntriesReader(PathTreeWalk.access$getFollowLinks(this.this$0));
            startNode2 = new PathNode(PathTreeWalk.access$getStart$p(this.this$0), PathTreeWalkKt.access$keyOf(PathTreeWalk.access$getStart$p(this.this$0), PathTreeWalk.access$getLinkOptions(this.this$0)), null);
            this_$iv2 = this.this$0;
            path$iv3 = startNode2.getPath();
            if (startNode2.getParent() == null) goto L13;
            PathsKt.checkFileName(path$iv3);
        L13:
            LinkOption[] r114 = PathTreeWalk.access$getLinkOptions(this_$iv2);
            LinkOption[] r115 = (LinkOption[]) Arrays.copyOf(r114, r114.length);
            if (Files.isDirectory(path$iv3, (LinkOption[]) Arrays.copyOf(r115, r115.length)) == false) goto L30;
            if (PathTreeWalkKt.access$createsCycle(startNode2) == true) goto L28;
            if (PathTreeWalk.access$getIncludeDirectories(this_$iv2) == false) goto L23;
            this.L$0 = $this$iterator;
            this.L$1 = stack2;
            this.L$2 = entriesReader2;
            this.L$3 = startNode2;
            this.L$4 = this_$iv2;
            this.L$5 = SpillingKt.nullOutSpilledVariable($this$iterator);
            this.L$6 = path$iv3;
            this.I$0 = 0;
            this.label = 1;
            if ($this$iterator.yield(path$iv3, this) != r2) goto L23;
            return r2;
        L28:
            throw new FileSystemLoopException(path$iv3.toString());
        L30:
            if (Files.exists(path$iv3, (LinkOption[]) Arrays.copyOf(new LinkOption[]{LinkOption.NOFOLLOW_LINKS}, 1)) == false) goto L35;
            this.L$0 = $this$iterator;
            this.L$1 = stack2;
            this.L$2 = entriesReader2;
            this.L$3 = SpillingKt.nullOutSpilledVariable(startNode2);
            this.L$4 = SpillingKt.nullOutSpilledVariable(this_$iv2);
            this.L$5 = SpillingKt.nullOutSpilledVariable($this$iterator);
            this.L$6 = SpillingKt.nullOutSpilledVariable(path$iv3);
            this.I$0 = 0;
            this.label = 2;
            if ($this$iterator.yield(path$iv3, this) != r2) goto L34;
            return r2;
        L35:
            r13 = this;
            r12 = r2;
            startNode = startNode2;
            entriesReader = entriesReader2;
            stack = stack2;
            $this$iterator2 = $this$iterator;
            goto L37
        L5:
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public PathTreeWalk(Path start, PathWalkOption[] options) {
        Intrinsics.checkNotNullParameter(start, "start");
        Intrinsics.checkNotNullParameter(options, "options");
        this.start = start;
        this.options = options;
    }

    public static final /* synthetic */ boolean access$getFollowLinks(PathTreeWalk $this) {
        return $this.getFollowLinks();
    }

    public static final /* synthetic */ boolean access$getIncludeDirectories(PathTreeWalk $this) {
        return $this.getIncludeDirectories();
    }

    public static final /* synthetic */ LinkOption[] access$getLinkOptions(PathTreeWalk $this) {
        return $this.getLinkOptions();
    }

    public static final /* synthetic */ Path access$getStart$p(PathTreeWalk $this) {
        return $this.start;
    }

    private final boolean getFollowLinks() {
        return ArraysKt.contains(this.options, PathWalkOption.FOLLOW_LINKS);
    }

    private final LinkOption[] getLinkOptions() {
        return LinkFollowing.INSTANCE.toLinkOptions(getFollowLinks());
    }

    private final boolean getIncludeDirectories() {
        return ArraysKt.contains(this.options, PathWalkOption.INCLUDE_DIRECTORIES);
    }

    private final boolean isBFS() {
        return ArraysKt.contains(this.options, PathWalkOption.BREADTH_FIRST);
    }

    @Override // kotlin.sequences.Sequence
    public Iterator<Path> iterator() {
        if (isBFS() == false) goto L6;
        return bfsIterator();
    L6:
        return dfsIterator();
    }

    private final Object yieldIfNeeded(SequenceScope<? super Path> r7, PathNode node, DirectoryEntriesReader entriesReader, Function1<? super List<PathNode>, Unit> r10, Continuation<? super Unit> r11) {
        Path path = node.getPath();
        if (node.getParent() == null) goto L5;
        PathsKt.checkFileName(path);
    L5:
        LinkOption[] r2 = access$getLinkOptions(this);
        LinkOption[] r3 = (LinkOption[]) Arrays.copyOf(r2, r2.length);
        if (Files.isDirectory(path, (LinkOption[]) Arrays.copyOf(r3, r3.length)) == false) goto L19;
        if (PathTreeWalkKt.access$createsCycle(node) == true) goto L17;
        if (access$getIncludeDirectories(this) == false) goto L12;
        r7.yield(path, r11);
    L12:
        LinkOption[] r4 = access$getLinkOptions(this);
        LinkOption[] r5 = (LinkOption[]) Arrays.copyOf(r4, r4.length);
        if (Files.isDirectory(path, (LinkOption[]) Arrays.copyOf(r5, r5.length)) == false) goto L23;
        r10.invoke(entriesReader.readEntries(node));
    L23:
        return Unit.INSTANCE;
    L17:
        throw new FileSystemLoopException(path.toString());
    L19:
        if (Files.exists(path, (LinkOption[]) Arrays.copyOf(new LinkOption[]{LinkOption.NOFOLLOW_LINKS}, 1)) == false) goto L23;
        r7.yield(path, r11);
        return Unit.INSTANCE;
    }

    private final Iterator<Path> dfsIterator() {
        return SequencesKt.iterator(new C06991(this, null));
    }

    private final Iterator<Path> bfsIterator() {
        return SequencesKt.iterator(new AnonymousClass1(this, null));
    }
}
