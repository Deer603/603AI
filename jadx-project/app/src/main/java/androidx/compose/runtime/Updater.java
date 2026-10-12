package androidx.compose.runtime;

import androidx.autofill.HintConstants;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmInline;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Composer.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0087@\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u001a\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002HÖ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J&\u0010\u0012\u001a\u00020\u00132\u0017\u0010\u0014\u001a\u0013\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00130\u0015¢\u0006\u0002\b\u0016¢\u0006\u0004\b\u0017\u0010\u0018J&\u0010\u0019\u001a\u00020\u00132\u0017\u0010\u0014\u001a\u0013\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00130\u0015¢\u0006\u0002\b\u0016¢\u0006\u0004\b\u001a\u0010\u0018JI\u0010\u001b\u001a\u00020\u0013\"\u0004\b\u0001\u0010\u001c2\u0006\u0010\u001d\u001a\u0002H\u001c2,\u0010\u0014\u001a(\u0012\u0004\u0012\u00028\u0000\u0012\u0013\u0012\u0011H\u001c¢\u0006\f\b\u001f\u0012\b\b \u0012\u0004\b\b(\u001d\u0012\u0004\u0012\u00020\u00130\u001e¢\u0006\u0002\b\u0016¢\u0006\u0004\b!\u0010\"JH\u0010\u001b\u001a\u00020\u00132\u0006\u0010\u001d\u001a\u00020\u000f2.\b\b\u0010\u0014\u001a(\u0012\u0004\u0012\u00028\u0000\u0012\u0013\u0012\u00110\u000f¢\u0006\f\b\u001f\u0012\b\b \u0012\u0004\b\b(\u001d\u0012\u0004\u0012\u00020\u00130\u001e¢\u0006\u0002\b\u0016H\u0086\b¢\u0006\u0004\b!\u0010#J\u0010\u0010$\u001a\u00020%HÖ\u0001¢\u0006\u0004\b&\u0010'JI\u0010(\u001a\u00020\u0013\"\u0004\b\u0001\u0010\u001c2\u0006\u0010\u001d\u001a\u0002H\u001c2,\u0010\u0014\u001a(\u0012\u0004\u0012\u00028\u0000\u0012\u0013\u0012\u0011H\u001c¢\u0006\f\b\u001f\u0012\b\b \u0012\u0004\b\b(\u001d\u0012\u0004\u0012\u00020\u00130\u001e¢\u0006\u0002\b\u0016¢\u0006\u0004\b)\u0010\"JH\u0010(\u001a\u00020\u00132\u0006\u0010\u001d\u001a\u00020\u000f2.\b\b\u0010\u0014\u001a(\u0012\u0004\u0012\u00028\u0000\u0012\u0013\u0012\u00110\u000f¢\u0006\f\b\u001f\u0012\b\b \u0012\u0004\b\b(\u001d\u0012\u0004\u0012\u00020\u00130\u001e¢\u0006\u0002\b\u0016H\u0086\b¢\u0006\u0004\b)\u0010#R\u0016\u0010\u0003\u001a\u00020\u00048\u0000X\u0081\u0004¢\u0006\b\n\u0000\u0012\u0004\b\u0007\u0010\b\u0088\u0001\u0003\u0092\u0001\u00020\u0004¨\u0006*"}, d2 = {"Landroidx/compose/runtime/Updater;", "T", "", "composer", "Landroidx/compose/runtime/Composer;", "constructor-impl", "(Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;", "getComposer$annotations", "()V", "equals", "", "other", "equals-impl", "(Landroidx/compose/runtime/Composer;Ljava/lang/Object;)Z", "hashCode", "", "hashCode-impl", "(Landroidx/compose/runtime/Composer;)I", "init", "", "block", "Lkotlin/Function1;", "Lkotlin/ExtensionFunctionType;", "init-impl", "(Landroidx/compose/runtime/Composer;Lkotlin/jvm/functions/Function1;)V", "reconcile", "reconcile-impl", "set", "V", "value", "Lkotlin/Function2;", "Lkotlin/ParameterName;", HintConstants.AUTOFILL_HINT_NAME, "set-impl", "(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V", "(Landroidx/compose/runtime/Composer;ILkotlin/jvm/functions/Function2;)V", "toString", "", "toString-impl", "(Landroidx/compose/runtime/Composer;)Ljava/lang/String;", "update", "update-impl", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@JvmInline
public final class Updater<T> {
    private final Composer composer;

    /* JADX INFO: renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ Updater m3807boximpl(Composer r1) {
        return new Updater(r1);
    }

    /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
    public static <T> Composer m3808constructorimpl(Composer r0) {
        return r0;
    }

    /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
    public static boolean m3809equalsimpl(Composer r2, Object r3) {
        if ((r3 instanceof Updater) == true) goto L6;
        return false;
    L6:
        if (Intrinsics.areEqual(r2, ((Updater) r3).m3819unboximpl()) == true) goto L8;
        return false;
    L8:
        return true;
    }

    /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m3810equalsimpl0(Composer r1, Composer r2) {
        return Intrinsics.areEqual(r1, r2);
    }

    public static /* synthetic */ void getComposer$annotations() {
    }

    /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
    public static int m3811hashCodeimpl(Composer r1) {
        return r1.hashCode();
    }

    /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
    public static String m3816toStringimpl(Composer r2) {
        return "Updater(composer=" + r2 + ')';
    }

    public boolean equals(Object r2) {
        return m3809equalsimpl(this.composer, r2);
    }

    public int hashCode() {
        return m3811hashCodeimpl(this.composer);
    }

    public String toString() {
        return m3816toStringimpl(this.composer);
    }

    /* JADX INFO: renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ Composer m3819unboximpl() {
        return this.composer;
    }

    private /* synthetic */ Updater(Composer composer) {
        this.composer = composer;
    }

    /* JADX INFO: renamed from: set-impl, reason: not valid java name */
    public static final void m3814setimpl(Composer arg0, int value, Function2<? super T, ? super Integer, Unit> r7) {
        if (arg0.getInserting() == false) goto L5;
    L6:
        arg0.updateRememberedValue(Integer.valueOf(value));
        arg0.apply(Integer.valueOf(value), r7);
        return;
    L5:
        if (Intrinsics.areEqual(arg0.rememberedValue(), Integer.valueOf(value)) == false) goto L6;
    }

    /* JADX INFO: renamed from: set-impl, reason: not valid java name */
    public static final <V> void m3815setimpl(Composer arg0, V r4, Function2<? super T, ? super V, Unit> r5) {
        if (arg0.getInserting() == false) goto L5;
    L6:
        arg0.updateRememberedValue(r4);
        arg0.apply(r4, r5);
        return;
    L5:
        if (Intrinsics.areEqual(arg0.rememberedValue(), r4) == false) goto L6;
    }

    /* JADX INFO: renamed from: update-impl, reason: not valid java name */
    public static final void m3817updateimpl(Composer arg0, int value, Function2<? super T, ? super Integer, Unit> r8) {
        boolean inserting = arg0.getInserting();
        if (inserting == false) goto L5;
    L6:
        arg0.updateRememberedValue(Integer.valueOf(value));
        if (inserting == true) goto L12;
        arg0.apply(Integer.valueOf(value), r8);
        return;
    L12:
        return;
    L5:
        if (Intrinsics.areEqual(arg0.rememberedValue(), Integer.valueOf(value)) == false) goto L6;
    }

    /* JADX INFO: renamed from: update-impl, reason: not valid java name */
    public static final <V> void m3818updateimpl(Composer arg0, V r5, Function2<? super T, ? super V, Unit> r6) {
        boolean inserting = arg0.getInserting();
        if (inserting == false) goto L5;
    L6:
        arg0.updateRememberedValue(r5);
        if (inserting == true) goto L12;
        arg0.apply(r5, r6);
        return;
    L12:
        return;
    L5:
        if (Intrinsics.areEqual(arg0.rememberedValue(), r5) == false) goto L6;
    }

    /* JADX INFO: renamed from: init-impl, reason: not valid java name */
    public static final void m3812initimpl(Composer arg0, final Function1<? super T, Unit> r3) {
        if (arg0.getInserting() == false) goto L6;
        arg0.apply(Unit.INSTANCE, new Updater$init$1(r3));
        return;
    }

    /* JADX INFO: renamed from: reconcile-impl, reason: not valid java name */
    public static final void m3813reconcileimpl(Composer arg0, final Function1<? super T, Unit> r3) {
        arg0.apply(Unit.INSTANCE, new Updater$reconcile$1(r3));
    }
}
