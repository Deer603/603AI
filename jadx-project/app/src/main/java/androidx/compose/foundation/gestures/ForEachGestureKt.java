package androidx.compose.foundation.gestures;

import androidx.compose.ui.input.pointer.AwaitPointerEventScope;
import androidx.compose.ui.input.pointer.PointerEvent;
import androidx.compose.ui.input.pointer.PointerEventPass;
import androidx.compose.ui.input.pointer.PointerInputChange;
import androidx.compose.ui.input.pointer.PointerInputScope;
import androidx.core.location.LocationRequestCompat;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.JobKt;

/* JADX INFO: compiled from: ForEachGesture.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00004\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0000\u001a\u001c\u0010\u0003\u001a\u00020\u0004*\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0006H\u0080@¢\u0006\u0002\u0010\u0007\u001a\u0012\u0010\u0003\u001a\u00020\u0004*\u00020\bH\u0080@¢\u0006\u0002\u0010\t\u001a;\u0010\n\u001a\u00020\u0004*\u00020\b2'\u0010\u000b\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\r\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\f¢\u0006\u0002\b\u000fH\u0086@¢\u0006\u0002\u0010\u0010\u001a;\u0010\u0011\u001a\u00020\u0004*\u00020\b2'\u0010\u000b\u001a#\b\u0001\u0012\u0004\u0012\u00020\b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\r\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\f¢\u0006\u0002\b\u000fH\u0087@¢\u0006\u0002\u0010\u0010¨\u0006\u0012"}, d2 = {"allPointersUp", "", "Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;", "awaitAllPointersUp", "", "pass", "Landroidx/compose/ui/input/pointer/PointerEventPass;", "(Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;Landroidx/compose/ui/input/pointer/PointerEventPass;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroidx/compose/ui/input/pointer/PointerInputScope;", "(Landroidx/compose/ui/input/pointer/PointerInputScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "awaitEachGesture", "block", "Lkotlin/Function2;", "Lkotlin/coroutines/Continuation;", "", "Lkotlin/ExtensionFunctionType;", "(Landroidx/compose/ui/input/pointer/PointerInputScope;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "forEachGesture", "foundation_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class ForEachGestureKt {

    /* JADX INFO: renamed from: androidx.compose.foundation.gestures.ForEachGestureKt$awaitAllPointersUp$2, reason: invalid class name */
    /* JADX INFO: compiled from: ForEachGesture.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "androidx.compose.foundation.gestures.ForEachGestureKt$awaitAllPointersUp$2", f = "ForEachGesture.kt", i = {}, l = {75}, m = "invokeSuspend", n = {}, s = {})
    static final class AnonymousClass2 extends RestrictedSuspendLambda implements Function2<AwaitPointerEventScope, Continuation<? super Unit>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        AnonymousClass2(Continuation<? super AnonymousClass2> r2) {
            super(2, r2);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object r2, Continuation<?> r3) {
            AnonymousClass2 r0 = new AnonymousClass2(r3);
            r0.L$0 = r2;
            return r0;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(AwaitPointerEventScope r3, Continuation<? super Unit> r4) {
            return ((AnonymousClass2) create(r3, r4)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(AwaitPointerEventScope r2, Continuation<? super Unit> r3) {
            return invoke2(r2, r3);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object $result) {
            Object r0 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            switch(this.label) {
                case 0: goto L7;
                case 1: goto L6;
                default: goto L5;
            };
        L6:
            ResultKt.throwOnFailure($result);
        L11:
            return Unit.INSTANCE;
        L7:
            ResultKt.throwOnFailure($result);
            AwaitPointerEventScope $this$awaitPointerEventScope = (AwaitPointerEventScope) this.L$0;
            this.label = 1;
            if (ForEachGestureKt.awaitAllPointersUp$default($this$awaitPointerEventScope, null, this, 1, null) != r0) goto L11;
            return r0;
        L5:
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: renamed from: androidx.compose.foundation.gestures.ForEachGestureKt$awaitAllPointersUp$3, reason: invalid class name */
    /* JADX INFO: compiled from: ForEachGesture.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "androidx.compose.foundation.gestures.ForEachGestureKt", f = "ForEachGesture.kt", i = {0, 0}, l = {84}, m = "awaitAllPointersUp", n = {"$this$awaitAllPointersUp", "pass"}, s = {"L$0", "L$1"})
    static final class AnonymousClass3 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        AnonymousClass3(Continuation<? super AnonymousClass3> r1) {
            super(r1);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object r3) {
            this.result = r3;
            this.label |= Integer.MIN_VALUE;
            return ForEachGestureKt.awaitAllPointersUp(null, null, this);
        }
    }

    /* JADX INFO: renamed from: androidx.compose.foundation.gestures.ForEachGestureKt$awaitEachGesture$2, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: ForEachGesture.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "androidx.compose.foundation.gestures.ForEachGestureKt$awaitEachGesture$2", f = "ForEachGesture.kt", i = {0, 1, 2}, l = {LocationRequestCompat.QUALITY_BALANCED_POWER_ACCURACY, 105, 110}, m = "invokeSuspend", n = {"$this$awaitPointerEventScope", "$this$awaitPointerEventScope", "$this$awaitPointerEventScope"}, s = {"L$0", "L$0", "L$0"})
    static final class C02502 extends RestrictedSuspendLambda implements Function2<AwaitPointerEventScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Function2<AwaitPointerEventScope, Continuation<? super Unit>, Object> $block;
        final /* synthetic */ CoroutineContext $currentContext;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: Multi-variable type inference failed */
        C02502(CoroutineContext r2, Function2<? super AwaitPointerEventScope, ? super Continuation<? super Unit>, ? extends Object> r3, Continuation<? super C02502> r4) {
            this.$currentContext = r2;
            this.$block = r3;
            super(2, r4);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object r4, Continuation<?> r5) {
            C02502 r0 = new C02502(this.$currentContext, this.$block, r5);
            r0.L$0 = r4;
            return r0;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(AwaitPointerEventScope r3, Continuation<? super Unit> r4) {
            return ((C02502) create(r3, r4)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(AwaitPointerEventScope r2, Continuation<? super Unit> r3) {
            return invoke2(r2, r3);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v1, types: [androidx.compose.ui.input.pointer.AwaitPointerEventScope, java.lang.Object] */
        /* JADX WARN: Type inference failed for: r1v12 */
        /* JADX WARN: Type inference failed for: r1v13 */
        /* JADX WARN: Type inference failed for: r1v14 */
        /* JADX WARN: Type inference failed for: r1v15 */
        /* JADX WARN: Type inference failed for: r1v16 */
        /* JADX WARN: Type inference failed for: r1v17 */
        /* JADX WARN: Type inference failed for: r1v18 */
        /* JADX WARN: Type inference failed for: r1v19 */
        /* JADX WARN: Type inference failed for: r1v2, types: [androidx.compose.ui.input.pointer.AwaitPointerEventScope, java.lang.Object] */
        /* JADX WARN: Type inference failed for: r1v20 */
        /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object] */
        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x005b -> B:16:0x0039). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:32:0x007a -> B:16:0x0039). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object r9) {
            Object r0 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int r1 = this.label;
            switch(r1) {
                case 0: goto L15;
                case 1: goto L10;
                case 2: goto L7;
                case 3: goto L6;
                default: goto L5;
            };
        L6:
            AwaitPointerEventScope r2 = (AwaitPointerEventScope) this.L$0;
            ResultKt.throwOnFailure(r9);
            C02502 r4 = this;
            ?? r3 = r2;
        L17:
            if (JobKt.isActive(r4.$currentContext) == false) goto L36;
            Function2 r5 = r4.$block;     // Catch: CancellationException -> L25
            r4.L$0 = r3;     // Catch: CancellationException -> L25
            r4.label = 1;     // Catch: CancellationException -> L25
            Object r6 = r5.invoke(r3, r4);     // Catch: CancellationException -> L25
            ?? r7 = r3;
            if (r6 != r0) goto L21;
            return r0;
        L21:
            r4.L$0 = r7;     // Catch: CancellationException -> L25
            r4.label = 2;     // Catch: CancellationException -> L25
            Object r8 = ForEachGestureKt.awaitAllPointersUp$default(r7, null, r4, 1, null);     // Catch: CancellationException -> L25
            r3 = r7;
            if (r8 != r0) goto L17;
            return r0;
        L25:
            e = move-exception;
            C02502 r10 = r4;
            e = e;
            ?? r11 = r3;
        L28:
            if (JobKt.isActive(r10.$currentContext) == false) goto L34;
            r10.L$0 = r11;
            r10.label = 3;
            if (ForEachGestureKt.awaitAllPointersUp$default(r11, null, r10, 1, null) != r0) goto L32;
            return r0;
        L32:
            r4 = r10;
            r3 = r11;
            goto L17
        L34:
            throw e;
        L36:
            return Unit.INSTANCE;
        L7:
            AwaitPointerEventScope r12 = (AwaitPointerEventScope) this.L$0;
            ResultKt.throwOnFailure(r9);     // Catch: CancellationException -> L13
            r4 = this;
            r3 = r12;
            goto L17
        L10:
            AwaitPointerEventScope r13 = (AwaitPointerEventScope) this.L$0;
            ResultKt.throwOnFailure(r9);     // Catch: CancellationException -> L13
            r4 = this;
            r7 = r13;
            goto L21
        L15:
            ResultKt.throwOnFailure(r9);
            r4 = this;
            r3 = (AwaitPointerEventScope) this.L$0;
            goto L17
        L5:
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        L13:
            e = e;
            r10 = this;
            r11 = r1;
            goto L28
        }
    }

    /* JADX INFO: renamed from: androidx.compose.foundation.gestures.ForEachGestureKt$forEachGesture$1, reason: invalid class name */
    /* JADX INFO: compiled from: ForEachGesture.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "androidx.compose.foundation.gestures.ForEachGestureKt", f = "ForEachGesture.kt", i = {0, 0, 0, 1, 1, 1, 2, 2, 2}, l = {48, 51, 56}, m = "forEachGesture", n = {"$this$forEachGesture", "block", "currentContext", "$this$forEachGesture", "block", "currentContext", "$this$forEachGesture", "block", "currentContext"}, s = {"L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "L$0", "L$1", "L$2"})
    static final class AnonymousClass1 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        AnonymousClass1(Continuation<? super AnonymousClass1> r1) {
            super(r1);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object r3) {
            this.result = r3;
            this.label |= Integer.MIN_VALUE;
            return ForEachGestureKt.forEachGesture(null, null, this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [int] */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v17 */
    /* JADX WARN: Type inference failed for: r3v2, types: [androidx.compose.ui.input.pointer.PointerInputScope, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v3, types: [androidx.compose.ui.input.pointer.PointerInputScope, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v9 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v13 */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v8, types: [java.lang.Object, kotlin.coroutines.CoroutineContext] */
    /* JADX WARN: Type inference failed for: r7v0, types: [androidx.compose.ui.input.pointer.PointerInputScope] */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v13 */
    /* JADX WARN: Type inference failed for: r7v16 */
    /* JADX WARN: Type inference failed for: r7v18 */
    /* JADX WARN: Type inference failed for: r7v19 */
    /* JADX WARN: Type inference failed for: r7v2, types: [java.lang.Object, kotlin.coroutines.CoroutineContext] */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v4, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v5 */
    /* JADX WARN: Type inference failed for: r7v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:31:0x0095 -> B:22:0x006c). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:40:0x00b3 -> B:22:0x006c). Please report as a decompilation issue!!! */
    @Deprecated(message = "Use awaitEachGesture instead. forEachGesture() can drop events between gestures.", replaceWith = @ReplaceWith(expression = "awaitEachGesture(block)", imports = {}))
    public static final Object forEachGesture(PointerInputScope r7, Function2<? super PointerInputScope, ? super Continuation<? super Unit>, ? extends Object> r8, Continuation<? super Unit> r9) {
        if ((r9 instanceof AnonymousClass1) == false) goto L7;
        AnonymousClass1 r0 = (AnonymousClass1) r9;
        if ((r0.label & Integer.MIN_VALUE) == 0) goto L7;
        r0.label -= Integer.MIN_VALUE;
    L8:
        Object r1 = r0.result;
        Object r2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ?? r3 = r0.label;
        switch(r3) {
            case 0: goto L21;
            case 1: goto L16;
            case 2: goto L13;
            case 3: goto L12;
            default: goto L11;
        };
    L12:
        CoroutineContext r10 = (CoroutineContext) r0.L$2;
        r8 = (Function2) r0.L$1;
        PointerInputScope r4 = (PointerInputScope) r0.L$0;
        ResultKt.throwOnFailure(r1);
        ?? r5 = r10;
        ?? r11 = r4;
    L23:
        if (JobKt.isActive(r5) == false) goto L44;
        r0.L$0 = r11;     // Catch: CancellationException -> L33
        r0.L$1 = r8;     // Catch: CancellationException -> L33
        r0.L$2 = r5;     // Catch: CancellationException -> L33
        r0.label = 1;     // Catch: CancellationException -> L33
        if (r8.invoke(r11, r0) != r2) goto L27;
        return r2;
    L27:
        r3 = r11;
        r7 = r5;
    L28:
        r0.L$0 = r3;     // Catch: CancellationException -> L19
        r0.L$1 = r8;     // Catch: CancellationException -> L19
        r0.L$2 = r7;     // Catch: CancellationException -> L19
        r0.label = 2;     // Catch: CancellationException -> L19
        if (awaitAllPointersUp(r3, r0) != r2) goto L31;
        return r2;
    L31:
        r5 = r7;
        r11 = r3;
    L33:
        e = move-exception;
        r3 = r11;
        r7 = r5;
        e = e;
    L36:
        if (JobKt.isActive(r7) == false) goto L42;
        r0.L$0 = r3;
        r0.L$1 = r8;
        r0.L$2 = r7;
        r0.label = 3;
        if (awaitAllPointersUp(r3, r0) != r2) goto L40;
        return r2;
    L40:
        r5 = r7;
        r11 = r3;
        goto L23
    L42:
        throw e;
    L44:
        return Unit.INSTANCE;
    L13:
        CoroutineContext r12 = (CoroutineContext) r0.L$2;
        r8 = (Function2) r0.L$1;
        PointerInputScope r6 = (PointerInputScope) r0.L$0;
        ResultKt.throwOnFailure(r1);     // Catch: CancellationException -> L19
        r5 = r12;
        r11 = r6;
        goto L23
    L16:
        CoroutineContext r13 = (CoroutineContext) r0.L$2;
        r8 = (Function2) r0.L$1;
        PointerInputScope r14 = (PointerInputScope) r0.L$0;
        ResultKt.throwOnFailure(r1);     // Catch: CancellationException -> L19
        r3 = r14;
        r7 = r13;
        goto L28
    L21:
        ResultKt.throwOnFailure(r1);
        r5 = r0.getContext();
        r11 = r7;
        goto L23
    L11:
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    L19:
        e = e;
    L7:
        r0 = new AnonymousClass1(r9);
        goto L8
    }

    public static final boolean allPointersUp(AwaitPointerEventScope $this$allPointersUp) {
        List<PointerInputChange> r0 = $this$allPointersUp.getCurrentEvent().getChanges();
        int index$iv$iv = 0;
        int r5 = r0.size();
    L4:
        if (index$iv$iv >= r5) goto L9;
        Object item$iv$iv = r0.get(index$iv$iv);
        PointerInputChange it = (PointerInputChange) item$iv$iv;
        if (it.getPressed() == true) goto L7;
        index$iv$iv = index$iv$iv + 1;
        goto L4
    L7:
        boolean r2 = true;
    L11:
        return !r2;
    L9:
        r2 = false;
        goto L11
    }

    public static final Object awaitAllPointersUp(PointerInputScope $this$awaitAllPointersUp, Continuation<? super Unit> r3) {
        Object r0 = $this$awaitAllPointersUp.awaitPointerEventScope(new AnonymousClass2(null), r3);
        if (r0 != IntrinsicsKt.getCOROUTINE_SUSPENDED()) goto L6;
        return r0;
    L6:
        return Unit.INSTANCE;
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x005e -> B:20:0x0066). Please report as a decompilation issue!!! */
    public static final Object awaitAllPointersUp(AwaitPointerEventScope $this$awaitAllPointersUp, PointerEventPass pass, Continuation<? super Unit> r20) {
        if ((r20 instanceof AnonymousClass3) == false) goto L7;
        AnonymousClass3 r1 = (AnonymousClass3) r20;
        if ((r1.label & Integer.MIN_VALUE) == 0) goto L7;
        r1.label -= Integer.MIN_VALUE;
    L8:
        Object $result = r1.result;
        Object $result2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch(r1.label) {
            case 0: goto L13;
            case 1: goto L12;
            default: goto L11;
        };
    L12:
        PointerEventPass pass2 = (PointerEventPass) r1.L$1;
        AwaitPointerEventScope $this$awaitAllPointersUp2 = (AwaitPointerEventScope) r1.L$0;
        ResultKt.throwOnFailure($result);
        AwaitPointerEventScope $this$awaitAllPointersUp3 = $this$awaitAllPointersUp2;
        PointerEventPass pass3 = pass2;
        Object r4 = $result2;
        Object $result3 = $result;
    L20:
        PointerEvent events = (PointerEvent) $result;
        List<PointerInputChange> r2 = events.getChanges();
        int index$iv$iv = 0;
        int r11 = r2.size();
    L21:
        if (index$iv$iv >= r11) goto L26;
        Object item$iv$iv = r2.get(index$iv$iv);
        PointerInputChange it = (PointerInputChange) item$iv$iv;
        if (it.getPressed() == true) goto L24;
        index$iv$iv = index$iv$iv + 1;
        goto L21
    L24:
        boolean r3 = true;
    L27:
        if (r3 == false) goto L31;
        $result = $result3;
        $result2 = r4;
        PointerEventPass pass4 = pass3;
        AwaitPointerEventScope $this$awaitAllPointersUp4 = $this$awaitAllPointersUp3;
    L16:
        r1.L$0 = $this$awaitAllPointersUp4;
        r1.L$1 = pass4;
        r1.label = 1;
        Object r7 = $this$awaitAllPointersUp4.awaitPointerEvent(pass4, r1);
        if (r7 != $result2) goto L19;
        return $result2;
    L19:
        Object r17 = $result2;
        $result3 = $result;
        $result = r7;
        $this$awaitAllPointersUp3 = $this$awaitAllPointersUp4;
        pass3 = pass4;
        r4 = r17;
    L31:
        return Unit.INSTANCE;
    L26:
        r3 = false;
        goto L27
    L13:
        ResultKt.throwOnFailure($result);
        if (allPointersUp($this$awaitAllPointersUp) == true) goto L31;
        $this$awaitAllPointersUp4 = $this$awaitAllPointersUp;
        pass4 = pass;
        goto L16
    L11:
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    L7:
        r1 = new AnonymousClass3(r20);
        goto L8
    }

    public static /* synthetic */ Object awaitAllPointersUp$default(AwaitPointerEventScope r0, PointerEventPass r1, Continuation r2, int r3, Object r4) {
        if ((r3 & 1) == 0) goto L6;
        r1 = PointerEventPass.Final;
    L6:
        return awaitAllPointersUp(r0, r1, r2);
    }

    public static final Object awaitEachGesture(PointerInputScope $this$awaitEachGesture, Function2<? super AwaitPointerEventScope, ? super Continuation<? super Unit>, ? extends Object> r4, Continuation<? super Unit> r5) {
        CoroutineContext currentContext = r5.getContext();
        Object r0 = $this$awaitEachGesture.awaitPointerEventScope(new C02502(currentContext, r4, null), r5);
        if (r0 != IntrinsicsKt.getCOROUTINE_SUSPENDED()) goto L6;
        return r0;
    L6:
        return Unit.INSTANCE;
    }
}
