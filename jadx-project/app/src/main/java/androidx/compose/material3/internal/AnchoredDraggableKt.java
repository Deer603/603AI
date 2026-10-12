package androidx.compose.material3.internal;

import androidx.autofill.HintConstants;
import androidx.compose.animation.core.SuspendAnimationKt;
import androidx.compose.foundation.gestures.DraggableKt;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.IntSize;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: compiled from: AnchoredDraggable.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000~\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a7\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u00032\u001d\u0010\u0004\u001a\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005¢\u0006\u0002\b\bH\u0000\u001a\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u0002H\u00020\n\"\u0004\b\u0000\u0010\u0002H\u0002\u001aF\u0010\u000b\u001a\u00020\u0007\"\u0004\b\u0000\u0010\f2\f\u0010\r\u001a\b\u0012\u0004\u0012\u0002H\f0\u000e2\"\u0010\u000f\u001a\u001e\b\u0001\u0012\u0004\u0012\u0002H\f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0011\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0010H\u0082@¢\u0006\u0002\u0010\u0012\u001aH\u0010\u0013\u001a\u00020\u0014\"\u0004\b\u0000\u0010\u0002*\u00020\u00142\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u0002H\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\b\b\u0002\u0010\u0019\u001a\u00020\u001a2\b\b\u0002\u0010\u001b\u001a\u00020\u001a2\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0000\u001a0\u0010\u001e\u001a\u00020\u0007\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00162\u0006\u0010\u001f\u001a\u0002H\u00022\b\b\u0002\u0010 \u001a\u00020!H\u0080@¢\u0006\u0002\u0010\"\u001ar\u0010#\u001a\u00020\u0014\"\u0004\b\u0000\u0010\u0002*\u00020\u00142\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u0002H\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182H\u0010$\u001aD\u0012\u0013\u0012\u00110%¢\u0006\f\b&\u0012\b\b'\u0012\u0004\b\b((\u0012\u0013\u0012\u00110)¢\u0006\f\b&\u0012\b\b'\u0012\u0004\b\b(*\u0012\u0016\u0012\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\u0001\u0012\u0004\u0012\u0002H\u00020+0\u0010H\u0000\u001a&\u0010,\u001a\u00020\u0007\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00162\u0006\u0010\u001f\u001a\u0002H\u0002H\u0080@¢\u0006\u0002\u0010-¨\u0006."}, d2 = {"DraggableAnchors", "Landroidx/compose/material3/internal/DraggableAnchors;", "T", "", "builder", "Lkotlin/Function1;", "Landroidx/compose/material3/internal/DraggableAnchorsConfig;", "", "Lkotlin/ExtensionFunctionType;", "emptyDraggableAnchors", "Landroidx/compose/material3/internal/MapDraggableAnchors;", "restartable", "I", "inputs", "Lkotlin/Function0;", "block", "Lkotlin/Function2;", "Lkotlin/coroutines/Continuation;", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "anchoredDraggable", "Landroidx/compose/ui/Modifier;", "state", "Landroidx/compose/material3/internal/AnchoredDraggableState;", "orientation", "Landroidx/compose/foundation/gestures/Orientation;", "enabled", "", "reverseDirection", "interactionSource", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "animateTo", "targetValue", "velocity", "", "(Landroidx/compose/material3/internal/AnchoredDraggableState;Ljava/lang/Object;FLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "draggableAnchors", "anchors", "Landroidx/compose/ui/unit/IntSize;", "Lkotlin/ParameterName;", HintConstants.AUTOFILL_HINT_NAME, "size", "Landroidx/compose/ui/unit/Constraints;", "constraints", "Lkotlin/Pair;", "snapTo", "(Landroidx/compose/material3/internal/AnchoredDraggableState;Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "material3_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class AnchoredDraggableKt {

    /* JADX INFO: renamed from: androidx.compose.material3.internal.AnchoredDraggableKt$anchoredDraggable$1, reason: invalid class name */
    /* JADX INFO: compiled from: AnchoredDraggable.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u008a@"}, d2 = {"<anonymous>", "", "T", "Lkotlinx/coroutines/CoroutineScope;", "velocity", ""}, k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "androidx.compose.material3.internal.AnchoredDraggableKt$anchoredDraggable$1", f = "AnchoredDraggable.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class AnonymousClass1 extends SuspendLambda implements Function3<CoroutineScope, Float, Continuation<? super Unit>, Object> {
        final /* synthetic */ AnchoredDraggableState<T> $state;
        /* synthetic */ float F$0;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX INFO: renamed from: androidx.compose.material3.internal.AnchoredDraggableKt$anchoredDraggable$1$1, reason: invalid class name and collision with other inner class name */
        /* JADX INFO: compiled from: AnchoredDraggable.kt */
        @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\u00020\u0003H\u008a@"}, d2 = {"<anonymous>", "", "T", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
        @DebugMetadata(c = "androidx.compose.material3.internal.AnchoredDraggableKt$anchoredDraggable$1$1", f = "AnchoredDraggable.kt", i = {}, l = {177}, m = "invokeSuspend", n = {}, s = {})
        static final class C01271 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ AnchoredDraggableState<T> $state;
            final /* synthetic */ float $velocity;
            int label;

            C01271(AnchoredDraggableState<T> r2, float r3, Continuation<? super C01271> r4) {
                this.$state = r2;
                this.$velocity = r3;
                super(2, r4);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object r4, Continuation<?> r5) {
                return new C01271(this.$state, this.$velocity, r5);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(CoroutineScope r2, Continuation<? super Unit> r3) {
                return invoke2(r2, r3);
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final Object invoke2(CoroutineScope r3, Continuation<? super Unit> r4) {
                return ((C01271) create(r3, r4)).invokeSuspend(Unit.INSTANCE);
            }

            /* JADX WARN: Type inference fix 'apply assigned field type' failed
            java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
            	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
            	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
            	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
             */
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
            L12:
                return Unit.INSTANCE;
            L7:
                ResultKt.throwOnFailure($result);
                this.label = 1;
                if (this.$state.settle(this.$velocity, this) != r0) goto L12;
                return r0;
            L5:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        AnonymousClass1(AnchoredDraggableState<T> r2, Continuation<? super AnonymousClass1> r3) {
            this.$state = r2;
            super(3, r3);
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Object invoke(CoroutineScope r4, Float r5, Continuation<? super Unit> r6) {
            return invoke(r4, r5.floatValue(), r6);
        }

        public final Object invoke(CoroutineScope r3, float r4, Continuation<? super Unit> r5) {
            AnonymousClass1 r0 = new AnonymousClass1(this.$state, r5);
            r0.L$0 = r3;
            r0.F$0 = r4;
            return r0.invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object r9) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            switch(this.label) {
                case 0: goto L6;
                default: goto L5;
            };
        L6:
            ResultKt.throwOnFailure(r9);
            CoroutineScope $this$draggable = (CoroutineScope) this.L$0;
            float velocity = this.F$0;
            BuildersKt.launch$default($this$draggable, null, null, new C01271(this.$state, velocity, null), 3, null);
            return Unit.INSTANCE;
        L5:
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: androidx.compose.material3.internal.AnchoredDraggableKt$animateTo$2, reason: invalid class name */
    /* JADX INFO: compiled from: AnchoredDraggable.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u0002H\u00020\u00052\u0006\u0010\u0006\u001a\u0002H\u0002H\u008a@"}, d2 = {"<anonymous>", "", "T", "Landroidx/compose/material3/internal/AnchoredDragScope;", "anchors", "Landroidx/compose/material3/internal/DraggableAnchors;", "latestTarget"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "androidx.compose.material3.internal.AnchoredDraggableKt$animateTo$2", f = "AnchoredDraggable.kt", i = {}, l = {685}, m = "invokeSuspend", n = {}, s = {})
    static final class AnonymousClass2<T> extends SuspendLambda implements Function4<AnchoredDragScope, DraggableAnchors<T>, T, Continuation<? super Unit>, Object> {
        final /* synthetic */ AnchoredDraggableState<T> $this_animateTo;
        final /* synthetic */ float $velocity;
        private /* synthetic */ Object L$0;
        /* synthetic */ Object L$1;
        /* synthetic */ Object L$2;
        int label;

        AnonymousClass2(AnchoredDraggableState<T> r2, float r3, Continuation<? super AnonymousClass2> r4) {
            this.$this_animateTo = r2;
            this.$velocity = r3;
            super(4, r4);
        }

        public final Object invoke(AnchoredDragScope r4, DraggableAnchors<T> r5, T r6, Continuation<? super Unit> r7) {
            AnonymousClass2 r0 = new AnonymousClass2(this.$this_animateTo, this.$velocity, r7);
            r0.L$0 = r4;
            r0.L$1 = r5;
            r0.L$2 = r6;
            return r0.invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.jvm.functions.Function4
        public /* bridge */ /* synthetic */ Object invoke(AnchoredDragScope r2, Object r3, Object r4, Continuation<? super Unit> r5) {
            return invoke(r2, (DraggableAnchors) r3, r4, r5);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object $result) {
            Object r0 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            switch(this.label) {
                case 0: goto L7;
                case 1: goto L6;
                default: goto L5;
            };
        L6:
            AnonymousClass2<T> r1 = this;
            ResultKt.throwOnFailure($result);
        L19:
            return Unit.INSTANCE;
        L7:
            ResultKt.throwOnFailure($result);
            final AnchoredDragScope $this$anchoredDrag = (AnchoredDragScope) this.L$0;
            DraggableAnchors r3 = (DraggableAnchors) this.L$1;
            Object latestTarget = this.L$2;
            float targetOffset = r3.positionOf(latestTarget);
            if (Float.isNaN(targetOffset) == true) goto L19;
            final Ref.FloatRef prev = new Ref.FloatRef();
            if (Float.isNaN(this.$this_animateTo.getOffset()) == false) goto L12;
            float r4 = 0.0f;
        L13:
            prev.element = r4;
            this.L$0 = null;
            this.L$1 = null;
            this.label = 1;
            if (SuspendAnimationKt.animate(prev.element, targetOffset, this.$velocity, this.$this_animateTo.getAnimationSpec(), new AnonymousClass1($this$anchoredDrag, prev), this) != r0) goto L16;
            return r0;
        L16:
            r1 = this;
            goto L19
        L12:
            r4 = this.$this_animateTo.getOffset();
            goto L13
        L5:
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: renamed from: androidx.compose.material3.internal.AnchoredDraggableKt$restartable$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: AnchoredDraggable.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "androidx.compose.material3.internal.AnchoredDraggableKt", f = "AnchoredDraggable.kt", i = {}, l = {713}, m = "restartable", n = {}, s = {})
    static final class C05921<I> extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C05921(Continuation<? super C05921> r1) {
            super(r1);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object r3) {
            this.result = r3;
            this.label |= Integer.MIN_VALUE;
            return AnchoredDraggableKt.access$restartable(null, null, this);
        }
    }

    /* JADX INFO: renamed from: androidx.compose.material3.internal.AnchoredDraggableKt$restartable$2, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: AnchoredDraggable.kt */
    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\u00020\u0003H\u008a@"}, d2 = {"<anonymous>", "", "I", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "androidx.compose.material3.internal.AnchoredDraggableKt$restartable$2", f = "AnchoredDraggable.kt", i = {}, l = {715}, m = "invokeSuspend", n = {}, s = {})
    static final class C05932 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Function2<I, Continuation<? super Unit>, Object> $block;
        final /* synthetic */ Function0<I> $inputs;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX INFO: renamed from: androidx.compose.material3.internal.AnchoredDraggableKt$restartable$2$1, reason: invalid class name */
        /* JADX INFO: compiled from: AnchoredDraggable.kt */
        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u0002H\u0002H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "I", "latestInputs", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, k = 3, mv = {1, 8, 0}, xi = 48)
        static final class AnonymousClass1<T> implements FlowCollector {
            final /* synthetic */ CoroutineScope $$this$coroutineScope;
            final /* synthetic */ Function2<I, Continuation<? super Unit>, Object> $block;
            final /* synthetic */ Ref.ObjectRef<Job> $previousDrag;

            /* JADX INFO: renamed from: androidx.compose.material3.internal.AnchoredDraggableKt$restartable$2$1$2, reason: invalid class name and collision with other inner class name */
            /* JADX INFO: compiled from: AnchoredDraggable.kt */
            @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\u00020\u0003H\u008a@"}, d2 = {"<anonymous>", "", "I", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
            @DebugMetadata(c = "androidx.compose.material3.internal.AnchoredDraggableKt$restartable$2$1$2", f = "AnchoredDraggable.kt", i = {}, l = {722}, m = "invokeSuspend", n = {}, s = {})
            static final class C01282 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                final /* synthetic */ CoroutineScope $$this$coroutineScope;
                final /* synthetic */ Function2<I, Continuation<? super Unit>, Object> $block;
                final /* synthetic */ I $latestInputs;
                int label;

                /* JADX WARN: Multi-variable type inference failed */
                C01282(Function2<? super I, ? super Continuation<? super Unit>, ? extends Object> r2, I r3, CoroutineScope r4, Continuation<? super C01282> r5) {
                    this.$block = r2;
                    this.$latestInputs = r3;
                    this.$$this$coroutineScope = r4;
                    super(2, r5);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<Unit> create(Object r5, Continuation<?> r6) {
                    return new C01282(this.$block, this.$latestInputs, this.$$this$coroutineScope, r6);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Object invoke(CoroutineScope r2, Continuation<? super Unit> r3) {
                    return invoke2(r2, r3);
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final Object invoke2(CoroutineScope r3, Continuation<? super Unit> r4) {
                    return ((C01282) create(r3, r4)).invokeSuspend(Unit.INSTANCE);
                }

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
                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object $result) {
                    Object r0 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    switch(this.label) {
                        case 0: goto L7;
                        case 1: goto L6;
                        default: goto L5;
                    };
                L6:
                    C01282 r1 = this;
                    ResultKt.throwOnFailure($result);
                L11:
                    CoroutineScopeKt.cancel(r1.$$this$coroutineScope, new AnchoredDragFinishedSignal());
                    return Unit.INSTANCE;
                L7:
                    ResultKt.throwOnFailure($result);
                    Function2<I, Continuation<? super Unit>, Object> r2 = this.$block;
                    I r3 = this.$latestInputs;
                    this.label = 1;
                    if (r2.invoke(r3, this) != r0) goto L10;
                    return r0;
                L10:
                    r1 = this;
                    goto L11
                L5:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }

            /* JADX WARN: Multi-variable type inference failed */
            AnonymousClass1(Ref.ObjectRef<Job> r1, CoroutineScope r2, Function2<? super I, ? super Continuation<? super Unit>, ? extends Object> r3) {
                this.$previousDrag = r1;
                this.$$this$coroutineScope = r2;
                this.$block = r3;
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            public final Object emit(I r10, Continuation<? super Unit> r11) {
                if ((r11 instanceof AnchoredDraggableKt$restartable$2$1$emit$1) == false) goto L7;
                AnchoredDraggableKt$restartable$2$1$emit$1 r0 = (AnchoredDraggableKt$restartable$2$1$emit$1) r11;
                if ((r0.label & Integer.MIN_VALUE) == 0) goto L7;
                r0.label -= Integer.MIN_VALUE;
            L8:
                Object r12 = r0.result;
                Object r1 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                switch(r0.label) {
                    case 0: goto L13;
                    case 1: goto L12;
                    default: goto L11;
                };
            L12:
                Job r2 = (Job) r0.L$2;
                Object r3 = r0.L$1;
                AnonymousClass1<T> r4 = (AnonymousClass1) r0.L$0;
                ResultKt.throwOnFailure(r12);
                Object r5 = r3;
            L19:
                Object r13 = r5;
            L20:
                r4.$previousDrag.element = (T) BuildersKt.launch$default(r4.$$this$coroutineScope, null, CoroutineStart.UNDISPATCHED, new C01282(r4.$block, r13, r4.$$this$coroutineScope, null), 1, null);
                return Unit.INSTANCE;
            L13:
                ResultKt.throwOnFailure(r12);
                r4 = this;
                Job r6 = r4.$previousDrag.element;
                r13 = r10;
                if (r6 == null) goto L20;
                r6.cancel(new AnchoredDragFinishedSignal());
                r0.L$0 = r4;
                r0.L$1 = r10;
                r0.L$2 = r6;
                r0.label = 1;
                if (r6.join(r0) != r1) goto L18;
                return r1;
            L18:
                r5 = r10;
                goto L19
            L11:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            L7:
                r0 = new AnchoredDraggableKt$restartable$2$1$emit$1(this, r11);
                goto L8
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        C05932(Function0<? extends I> r2, Function2<? super I, ? super Continuation<? super Unit>, ? extends Object> r3, Continuation<? super C05932> r4) {
            this.$inputs = r2;
            this.$block = r3;
            super(2, r4);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object r4, Continuation<?> r5) {
            C05932 r0 = new C05932(this.$inputs, this.$block, r5);
            r0.L$0 = r4;
            return r0;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(CoroutineScope r2, Continuation<? super Unit> r3) {
            return invoke2(r2, r3);
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(CoroutineScope r3, Continuation<? super Unit> r4) {
            return ((C05932) create(r3, r4)).invokeSuspend(Unit.INSTANCE);
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
        L12:
            return Unit.INSTANCE;
        L7:
            ResultKt.throwOnFailure($result);
            CoroutineScope $this$coroutineScope = (CoroutineScope) this.L$0;
            Ref.ObjectRef previousDrag = new Ref.ObjectRef();
            this.label = 1;
            if (SnapshotStateKt.snapshotFlow(this.$inputs).collect(new AnonymousClass1(previousDrag, $this$coroutineScope, this.$block), this) != r0) goto L12;
            return r0;
        L5:
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: androidx.compose.material3.internal.AnchoredDraggableKt$snapTo$2, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: AnchoredDraggable.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u0002H\u00020\u00052\u0006\u0010\u0006\u001a\u0002H\u0002H\u008a@"}, d2 = {"<anonymous>", "", "T", "Landroidx/compose/material3/internal/AnchoredDragScope;", "anchors", "Landroidx/compose/material3/internal/DraggableAnchors;", "latestTarget"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "androidx.compose.material3.internal.AnchoredDraggableKt$snapTo$2", f = "AnchoredDraggable.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class C05942<T> extends SuspendLambda implements Function4<AnchoredDragScope, DraggableAnchors<T>, T, Continuation<? super Unit>, Object> {
        private /* synthetic */ Object L$0;
        /* synthetic */ Object L$1;
        /* synthetic */ Object L$2;
        int label;

        C05942(Continuation<? super C05942> r2) {
            super(4, r2);
        }

        public final Object invoke(AnchoredDragScope r3, DraggableAnchors<T> r4, T r5, Continuation<? super Unit> r6) {
            C05942 r0 = new C05942(r6);
            r0.L$0 = r3;
            r0.L$1 = r4;
            r0.L$2 = r5;
            return r0.invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.jvm.functions.Function4
        public /* bridge */ /* synthetic */ Object invoke(AnchoredDragScope r2, Object r3, Object r4, Continuation<? super Unit> r5) {
            return invoke(r2, (DraggableAnchors) r3, r4, r5);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object r7) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            switch(this.label) {
                case 0: goto L6;
                default: goto L5;
            };
        L6:
            ResultKt.throwOnFailure(r7);
            AnchoredDragScope $this$anchoredDrag = (AnchoredDragScope) this.L$0;
            DraggableAnchors r2 = (DraggableAnchors) this.L$1;
            Object latestTarget = this.L$2;
            float targetOffset = r2.positionOf(latestTarget);
            if (Float.isNaN(targetOffset) == true) goto L10;
            AnchoredDragScope.dragTo$default($this$anchoredDrag, targetOffset, 0.0f, 2, null);
        L10:
            return Unit.INSTANCE;
        L5:
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public static final /* synthetic */ MapDraggableAnchors access$emptyDraggableAnchors() {
        return emptyDraggableAnchors();
    }

    public static final /* synthetic */ Object access$restartable(Function0 inputs, Function2 block, Continuation $completion) {
        return restartable(inputs, block, $completion);
    }

    public static final <T> DraggableAnchors<T> DraggableAnchors(Function1<? super DraggableAnchorsConfig<T>, Unit> r2) {
        DraggableAnchorsConfig r1 = new DraggableAnchorsConfig();
        r2.invoke(r1);
        return new MapDraggableAnchors(r1.getAnchors$material3_release());
    }

    public static /* synthetic */ Modifier anchoredDraggable$default(Modifier r6, AnchoredDraggableState r7, Orientation r8, boolean r9, boolean r10, MutableInteractionSource r11, int r12, Object r13) {
        if ((r12 & 4) == 0) goto L5;
        boolean r3 = true;
    L7:
        if ((r12 & 8) == 0) goto L9;
        boolean r4 = false;
    L11:
        if ((r12 & 16) == 0) goto L13;
        MutableInteractionSource r5 = null;
    L15:
        return anchoredDraggable(r6, r7, r8, r3, r4, r5);
    L13:
        r5 = r11;
        goto L15
    L9:
        r4 = r10;
        goto L11
    L5:
        r3 = r9;
        goto L7
    }

    public static final <T> Modifier anchoredDraggable(Modifier $this$anchoredDraggable, AnchoredDraggableState<T> r12, Orientation orientation, boolean enabled, boolean reverseDirection, MutableInteractionSource interactionSource) {
        return DraggableKt.draggable$default($this$anchoredDraggable, r12.getDraggableState$material3_release(), orientation, enabled, interactionSource, r12.isAnimationRunning(), null, new AnonymousClass1(r12, null), reverseDirection, 32, null);
    }

    public static final <T> Object snapTo(AnchoredDraggableState<T> r9, T r10, Continuation<? super Unit> r11) {
        Object r12 = AnchoredDraggableState.anchoredDrag$default(r9, r10, null, new C05942(null), r11, 2, null);
        if (r12 != IntrinsicsKt.getCOROUTINE_SUSPENDED()) goto L6;
        return r12;
    L6:
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Object animateTo$default(AnchoredDraggableState r0, Object r1, float r2, Continuation r3, int r4, Object r5) {
        if ((r4 & 2) == 0) goto L6;
        r2 = r0.getLastVelocity();
    L6:
        return animateTo(r0, r1, r2, r3);
    }

    public static final <T> Object animateTo(AnchoredDraggableState<T> r9, T r10, float velocity, Continuation<? super Unit> r12) {
        Object r11 = AnchoredDraggableState.anchoredDrag$default(r9, r10, null, new AnonymousClass2(r9, velocity, null), r12, 2, null);
        if (r11 != IntrinsicsKt.getCOROUTINE_SUSPENDED()) goto L6;
        return r11;
    L6:
        return Unit.INSTANCE;
    }

    private static final <I> Object restartable(Function0<? extends I> r4, Function2<? super I, ? super Continuation<? super Unit>, ? extends Object> r5, Continuation<? super Unit> r6) {
        if ((r6 instanceof C05921) == false) goto L7;
        C05921 r0 = (C05921) r6;
        if ((r0.label & Integer.MIN_VALUE) == 0) goto L7;
        r0.label -= Integer.MIN_VALUE;
    L8:
        Object $result = r0.result;
        Object r1 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch(r0.label) {
            case 0: goto L16;
            case 1: goto L12;
            default: goto L11;
        };
    L12:
        ResultKt.throwOnFailure($result);     // Catch: AnchoredDragFinishedSignal -> L14
    L23:
        goto L22
    L16:
        ResultKt.throwOnFailure($result);
        C05932 r2 = new C05932(r4, r5, null);     // Catch: AnchoredDragFinishedSignal -> L14
        r0.label = 1;     // Catch: AnchoredDragFinishedSignal -> L14
        if (CoroutineScopeKt.coroutineScope(r2, r0) != r1) goto L23;
        return r1;
    L11:
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    L22:
        return Unit.INSTANCE;
    L7:
        r0 = new C05921(r6);
        goto L8
    }

    private static final <T> MapDraggableAnchors<T> emptyDraggableAnchors() {
        return new MapDraggableAnchors(MapsKt.emptyMap());
    }

    public static final <T> Modifier draggableAnchors(Modifier $this$draggableAnchors, AnchoredDraggableState<T> r2, Orientation orientation, Function2<? super IntSize, ? super Constraints, ? extends Pair<? extends DraggableAnchors<T>, ? extends T>> r4) {
        return $this$draggableAnchors.then(new DraggableAnchorsElement(r2, r4, orientation));
    }
}
