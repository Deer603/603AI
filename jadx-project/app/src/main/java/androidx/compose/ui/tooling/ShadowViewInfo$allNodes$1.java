package androidx.compose.ui.tooling;

import androidx.core.view.MotionEventCompat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.sequences.SequenceScope;

/* JADX INFO: compiled from: ShadowViewInfo.android.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlin/sequences/SequenceScope;", "Landroidx/compose/ui/tooling/ShadowViewInfo;"}, k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "androidx.compose.ui.tooling.ShadowViewInfo$allNodes$1", f = "ShadowViewInfo.android.kt", i = {0, 1}, l = {MotionEventCompat.AXIS_GENERIC_12, MotionEventCompat.AXIS_GENERIC_13}, m = "invokeSuspend", n = {"$this$sequence", "$this$sequence"}, s = {"L$0", "L$0"})
final class ShadowViewInfo$allNodes$1 extends RestrictedSuspendLambda implements Function2<SequenceScope<? super ShadowViewInfo>, Continuation<? super Unit>, Object> {
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ ShadowViewInfo this$0;

    ShadowViewInfo$allNodes$1(ShadowViewInfo r2, Continuation<? super ShadowViewInfo$allNodes$1> r3) {
        this.this$0 = r2;
        super(2, r3);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object r3, Continuation<?> r4) {
        ShadowViewInfo$allNodes$1 r0 = new ShadowViewInfo$allNodes$1(this.this$0, r4);
        r0.L$0 = r3;
        return r0;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(SequenceScope<? super ShadowViewInfo> r2, Continuation<? super Unit> r3) {
        return invoke2(r2, r3);
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(SequenceScope<? super ShadowViewInfo> r3, Continuation<? super Unit> r4) {
        return ((ShadowViewInfo$allNodes$1) create(r3, r4)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x009b -> B:22:0x009f). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object $result) {
        Object r0 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch(this.label) {
            case 0: goto L8;
            case 1: goto L7;
            case 2: goto L6;
            default: goto L5;
        };
    L6:
        Iterator r3 = (Iterator) this.L$1;
        SequenceScope $this$sequence = (SequenceScope) this.L$0;
        ResultKt.throwOnFailure($result);
        SequenceScope $this$sequence2 = $this$sequence;
        Iterator r4 = r3;
        ShadowViewInfo$allNodes$1 r5 = this;
    L22:
        ShadowViewInfo$allNodes$1 r2 = r5;
        Iterator r6 = r4;
        SequenceScope $this$sequence3 = $this$sequence2;
    L17:
        if (r6.hasNext() == false) goto L24;
        Object element$iv = r6.next();
        ShadowViewInfo it = (ShadowViewInfo) element$iv;
        r2.L$0 = $this$sequence3;
        r2.L$1 = r6;
        r2.label = 2;
        if ($this$sequence3.yield(it, r2) != r0) goto L21;
        return r0;
    L21:
        $this$sequence2 = $this$sequence3;
        r4 = r6;
        r5 = r2;
        goto L22
    L24:
        return Unit.INSTANCE;
    L7:
        SequenceScope $this$sequence4 = (SequenceScope) this.L$0;
        ResultKt.throwOnFailure($result);
    L11:
        Iterable $this$flatMapTo$iv$iv = this.this$0.getChildren();
        Collection destination$iv$iv = new ArrayList();
        Iterator r7 = $this$flatMapTo$iv$iv.iterator();
    L13:
        if (r7.hasNext() == false) goto L15;
        Object element$iv$iv = r7.next();
        ShadowViewInfo it2 = (ShadowViewInfo) element$iv$iv;
        CollectionsKt.addAll(destination$iv$iv, it2.getAllNodes());
        goto L13
    L15:
        Iterable $this$forEach$iv = (List) destination$iv$iv;
        $this$sequence3 = $this$sequence4;
        r6 = $this$forEach$iv.iterator();
        r2 = this;
        goto L17
    L8:
        ResultKt.throwOnFailure($result);
        $this$sequence4 = (SequenceScope) this.L$0;
        this.L$0 = $this$sequence4;
        this.label = 1;
        if ($this$sequence4.yield(this.this$0, this) != r0) goto L11;
        return r0;
    L5:
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
