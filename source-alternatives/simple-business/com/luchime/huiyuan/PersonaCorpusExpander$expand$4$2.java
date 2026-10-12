package com.luchime.huiyuan;

import androidx.core.view.MotionEventCompat;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.coroutines.jvm.internal.SpillingKt;
import kotlin.jvm.functions.Function2;
import kotlin.sequences.SequenceScope;

/* JADX INFO: compiled from: PersonaCorpusExpander.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlin/sequences/SequenceScope;", ""}, k = 3, mv = {2, 2, 0}, xi = 48)
@DebugMetadata(c = "com.luchime.huiyuan.PersonaCorpusExpander$expand$4$2", f = "PersonaCorpusExpander.kt", i = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, l = {MotionEventCompat.AXIS_GENERIC_6}, m = "invokeSuspend", n = {"$this$sequence", "$this$forEach\\1", "element\\1", "original\\2", "$this$forEach\\3", "element\\3", "action\\4", "$this$forEach\\5", "element\\5", "check\\6", "$i$f$forEach\\1\\34", "$i$a$-forEach-PersonaCorpusExpander$expand$4$2$1\\2\\153\\0", "$i$f$forEach\\3\\35", "$i$a$-forEach-PersonaCorpusExpander$expand$4$2$1$1\\4\\154\\2", "$i$f$forEach\\5\\36", "$i$a$-forEach-PersonaCorpusExpander$expand$4$2$1$1$1\\6\\155\\4"}, s = {"L$0", "L$1", "L$5", "L$6", "L$7", "L$9", "L$10", "L$11", "L$13", "L$14", "I$0", "I$1", "I$2", "I$3", "I$4", "I$5"})
final class PersonaCorpusExpander$expand$4$2 extends RestrictedSuspendLambda implements Function2<SequenceScope<? super String>, Continuation<? super Unit>, Object> {
    final /* synthetic */ List<String> $actions;
    final /* synthetic */ List<String> $checks;
    final /* synthetic */ List<LexiconEntry> $originals;
    int I$0;
    int I$1;
    int I$2;
    int I$3;
    int I$4;
    int I$5;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$10;
    Object L$11;
    Object L$12;
    Object L$13;
    Object L$14;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    Object L$6;
    Object L$7;
    Object L$8;
    Object L$9;
    int label;

    PersonaCorpusExpander$expand$4$2(List<LexiconEntry> r2, List<String> r3, List<String> r4, Continuation<? super PersonaCorpusExpander$expand$4$2> r5) {
        this.$originals = r2;
        this.$actions = r3;
        this.$checks = r4;
        super(2, r5);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object r5, Continuation<?> r6) {
        PersonaCorpusExpander$expand$4$2 r0 = new PersonaCorpusExpander$expand$4$2(this.$originals, this.$actions, this.$checks, r6);
        r0.L$0 = r5;
        return r0;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(SequenceScope<? super String> r2, Continuation<? super Unit> r3) {
        return invoke2(r2, r3);
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(SequenceScope<? super String> r3, Continuation<? super Unit> r4) {
        return ((PersonaCorpusExpander$expand$4$2) create(r3, r4)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x00a5 -> B:11:0x00b5). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x00bb -> B:14:0x00eb). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x0195 -> B:20:0x01b0). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object $result) {
        SequenceScope $this$sequence = (SequenceScope) this.L$0;
        Object r2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch(this.label) {
            case 0: goto L7;
            case 1: goto L6;
            default: goto L5;
        };
    L6:
        int r3 = this.I$5;
        int r4 = this.I$4;
        int r5 = this.I$3;
        int r6 = this.I$2;
        int r7 = this.I$1;
        int r8 = this.I$0;
        String r9 = (String) this.L$14;
        Object r10 = this.L$13;
        Iterator r11 = (Iterator) this.L$12;
        Iterable r12 = (Iterable) this.L$11;
        String r13 = (String) this.L$10;
        Object r14 = this.L$9;
        Iterator r15 = (Iterator) this.L$8;
        SequenceScope $this$sequence2 = $this$sequence;
        Iterable r1 = (Iterable) this.L$7;
        LexiconEntry r16 = (LexiconEntry) this.L$6;
        Object r19 = this.L$5;
        Iterator r20 = (Iterator) this.L$4;
        Iterable r21 = (List) this.L$3;
        Iterable r17 = (List) this.L$2;
        Iterable r18 = (Iterable) this.L$1;
        ResultKt.throwOnFailure($result);
        Iterable r110 = r18;
        int r22 = r6;
        int r23 = r4;
        Object r24 = r2;
        Iterator r25 = r15;
        Iterable r111 = r1;
        Object r112 = r14;
        int r113 = r7;
        int r26 = r5;
        Iterable r27 = r17;
        Iterable r28 = r12;
        LexiconEntry r114 = r16;
        String r29 = r13;
        Iterator r115 = r11;
        PersonaCorpusExpander$expand$4$2 r116 = this;
        Object $result2 = $result;
    L20:
        Object $result3 = $result2;
        Object r30 = r24;
        int r31 = r23;
        int r32 = r26;
        PersonaCorpusExpander$expand$4$2 r117 = r116;
        SequenceScope $this$sequence3 = $this$sequence2;
        Object r118 = r112;
        Iterable r119 = r110;
        Object r120 = r19;
        Iterator r33 = r20;
        Iterable r34 = r21;
        Iterable r121 = r28;
        String r0 = r29;
    L15:
        if (r115.hasNext() == false) goto L21;
        Object r210 = r115.next();
        Iterable r211 = r111;
        String r122 = (String) r210;
        Object r212 = r30;
        int r213 = r31;
        int r214 = r32;
        String r35 = PersonaCorpusExpander.access$sentence(PersonaCorpusExpander.INSTANCE, r114.getText()) + " " + PersonaCorpusExpander.access$sentence(PersonaCorpusExpander.INSTANCE, r0) + " " + PersonaCorpusExpander.access$sentence(PersonaCorpusExpander.INSTANCE, r122);
        r117.L$0 = $this$sequence3;
        r117.L$1 = SpillingKt.nullOutSpilledVariable(r119);
        r117.L$2 = r27;
        r117.L$3 = r34;
        r117.L$4 = r33;
        r117.L$5 = SpillingKt.nullOutSpilledVariable(r120);
        r117.L$6 = r114;
        r117.L$7 = SpillingKt.nullOutSpilledVariable(r211);
        r117.L$8 = r25;
        r117.L$9 = SpillingKt.nullOutSpilledVariable(r118);
        r117.L$10 = r0;
        r117.L$11 = SpillingKt.nullOutSpilledVariable(r121);
        r117.L$12 = r115;
        r117.L$13 = SpillingKt.nullOutSpilledVariable(r210);
        r117.L$14 = SpillingKt.nullOutSpilledVariable(r122);
        r117.I$0 = r8;
        r117.I$1 = r113;
        r117.I$2 = r22;
        r117.I$3 = r214;
        r23 = r213;
        r117.I$4 = r23;
        r117.I$5 = 0;
        r29 = r0;
        r117.label = 1;
        if ($this$sequence3.yield(r35, r117) != r212) goto L19;
        return r212;
    L19:
        r24 = r212;
        r111 = r211;
        r21 = r34;
        r26 = r214;
        r28 = r121;
        r19 = r120;
        r110 = r119;
        r112 = r118;
        $this$sequence2 = $this$sequence3;
        r116 = r117;
        r20 = r33;
        $result2 = $result3;
        goto L20
    L21:
        int r123 = r22;
        Iterable r36 = r27;
        Iterable r37 = r34;
        int r38 = r8;
        Iterator r39 = r33;
        PersonaCorpusExpander$expand$4$2 r40 = r117;
        SequenceScope $this$sequence4 = $this$sequence3;
        LexiconEntry r124 = r114;
        int r125 = r113;
        Object r41 = r120;
        Iterable r126 = r111;
        Object $result4 = $result3;
        Iterator r127 = r25;
        Iterable r42 = r119;
    L12:
        if (r127.hasNext() == false) goto L9;
        Object r128 = r127.next();
        r121 = r37;
        $result3 = $result4;
        r22 = r123;
        r0 = (String) r128;
        r115 = r121.iterator();
        r119 = r42;
        r25 = r127;
        r113 = r125;
        $this$sequence3 = $this$sequence4;
        r118 = r128;
        r111 = r126;
        r114 = r124;
        r117 = r40;
        r8 = r38;
        r32 = 0;
        r120 = r41;
        r33 = r39;
        r34 = r37;
        r27 = r36;
        r31 = 0;
    L9:
        if (r39.hasNext() == false) goto L24;
        r41 = r39.next();
        r124 = (LexiconEntry) r41;
        r125 = 0;
        r126 = r36;
        r123 = 0;
        r127 = r126.iterator();
        goto L12
    L24:
        return Unit.INSTANCE;
    L7:
        $this$sequence4 = $this$sequence;
        ResultKt.throwOnFailure($result);
        Iterable r43 = this.$originals;
        Iterable r44 = this.$actions;
        Iterable r45 = this.$checks;
        r40 = this;
        r39 = r43.iterator();
        r38 = 0;
        r37 = r45;
        r36 = r44;
        r30 = r2;
        r42 = r43;
        $result4 = $result;
        goto L9
    L5:
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
