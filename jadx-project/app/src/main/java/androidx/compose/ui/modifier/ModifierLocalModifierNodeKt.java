package androidx.compose.ui.modifier;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.SpreadBuilder;

/* JADX INFO: compiled from: ModifierLocalModifierNode.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000$\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\u001a\u0006\u0010\u0000\u001a\u00020\u0001\u001a?\u0010\u0000\u001a\u00020\u00012\n\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u00032\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u00032\u001a\u0010\u0005\u001a\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030\u00030\u0006\"\u0006\u0012\u0002\b\u00030\u0003¢\u0006\u0002\u0010\u0007\u001a\u001a\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u0002H\b0\u0003\u001a)\u0010\u0000\u001a\u00020\u00012\u001a\u0010\u0005\u001a\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030\u00030\u0006\"\u0006\u0012\u0002\b\u00030\u0003H\u0007¢\u0006\u0002\u0010\n\u001aA\u0010\u0000\u001a\u00020\u000122\u0010\u000b\u001a\u001a\u0012\u0016\b\u0001\u0012\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0003\u0012\u0004\u0012\u00020\r0\f0\u0006\"\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0003\u0012\u0004\u0012\u00020\r0\fH\u0007¢\u0006\u0002\u0010\u000e\u001ao\u0010\u0000\u001a\u00020\u00012\u0016\u0010\u000f\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0003\u0012\u0004\u0012\u00020\r0\f2\u0016\u0010\u0010\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0003\u0012\u0004\u0012\u00020\r0\f22\u0010\u000b\u001a\u001a\u0012\u0016\b\u0001\u0012\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0003\u0012\u0004\u0012\u00020\r0\f0\u0006\"\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0003\u0012\u0004\u0012\u00020\r0\f¢\u0006\u0002\u0010\u0011\u001a&\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\b2\u0018\u0010\u0012\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\b0\u0003\u0012\u0004\u0012\u0002H\b0\f¨\u0006\u0013"}, d2 = {"modifierLocalMapOf", "Landroidx/compose/ui/modifier/ModifierLocalMap;", "key1", "Landroidx/compose/ui/modifier/ModifierLocal;", "key2", "keys", "", "(Landroidx/compose/ui/modifier/ModifierLocal;Landroidx/compose/ui/modifier/ModifierLocal;[Landroidx/compose/ui/modifier/ModifierLocal;)Landroidx/compose/ui/modifier/ModifierLocalMap;", "T", "key", "([Landroidx/compose/ui/modifier/ModifierLocal;)Landroidx/compose/ui/modifier/ModifierLocalMap;", "entries", "Lkotlin/Pair;", "", "([Lkotlin/Pair;)Landroidx/compose/ui/modifier/ModifierLocalMap;", "entry1", "entry2", "(Lkotlin/Pair;Lkotlin/Pair;[Lkotlin/Pair;)Landroidx/compose/ui/modifier/ModifierLocalMap;", "entry", "ui_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class ModifierLocalModifierNodeKt {
    public static final ModifierLocalMap modifierLocalMapOf() {
        return EmptyMap.INSTANCE;
    }

    public static final <T> ModifierLocalMap modifierLocalMapOf(ModifierLocal<T> r1) {
        return new SingleLocalMap(r1);
    }

    public static final <T> ModifierLocalMap modifierLocalMapOf(Pair<? extends ModifierLocal<T>, ? extends T> r5) {
        SingleLocalMap it = new SingleLocalMap(r5.getFirst());
        it.mo5820set$ui_release(r5.getFirst(), r5.getSecond());
        return it;
    }

    public static final ModifierLocalMap modifierLocalMapOf(ModifierLocal<?> r16, ModifierLocal<?> r17, ModifierLocal<?>... r18) {
        Pair r2 = TuplesKt.to(r16, null);
        SpreadBuilder r3 = new SpreadBuilder(2);
        r3.add(TuplesKt.to(r17, null));
        Collection destination$iv$iv = new ArrayList(r18.length);
        int r10 = r18.length;
        int r12 = 0;
    L3:
        if (r12 >= r10) goto L5;
        destination$iv$iv.add(TuplesKt.to(r18[r12], null));
        r12 = r12 + 1;
        goto L3
    L5:
        Collection $this$toTypedArray$iv = (List) destination$iv$iv;
        r3.addSpread($this$toTypedArray$iv.toArray(new Pair[0]));
        return new MultiLocalMap(r2, (Pair[]) r3.toArray(new Pair[r3.size()]));
    }

    public static final ModifierLocalMap modifierLocalMapOf(Pair<? extends ModifierLocal<?>, ? extends Object> r3, Pair<? extends ModifierLocal<?>, ? extends Object> r4, Pair<? extends ModifierLocal<?>, ? extends Object>... r5) {
        SpreadBuilder r1 = new SpreadBuilder(2);
        r1.add(r4);
        r1.addSpread(r5);
        return new MultiLocalMap(r3, (Pair[]) r1.toArray(new Pair[r1.size()]));
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Use a different overloaded version of this function")
    public static final /* synthetic */ ModifierLocalMap modifierLocalMapOf(ModifierLocal... keys) {
        switch(keys.length) {
            case 0: goto L13;
            case 1: goto L12;
            default: goto L4;
        };
    L4:
        Pair r0 = TuplesKt.to(ArraysKt.first(keys), null);
        List $this$fastMap$iv = ArraysKt.drop(keys, 1);
        Collection target$iv = new ArrayList($this$fastMap$iv.size());
        int index$iv$iv = 0;
        int r8 = $this$fastMap$iv.size();
    L7:
        if (index$iv$iv >= r8) goto L9;
        Object item$iv$iv = $this$fastMap$iv.get(index$iv$iv);
        ModifierLocal it = (ModifierLocal) item$iv$iv;
        target$iv.add(TuplesKt.to(it, null));
        index$iv$iv = index$iv$iv + 1;
        goto L7
    L9:
        Collection $this$toTypedArray$iv = (List) target$iv;
        Pair[] r1 = (Pair[]) $this$toTypedArray$iv.toArray(new Pair[0]);
        return new MultiLocalMap(r0, (Pair[]) Arrays.copyOf(r1, r1.length));
    L12:
        return new SingleLocalMap((ModifierLocal) ArraysKt.first(keys));
    L13:
        return EmptyMap.INSTANCE;
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Use a different overloaded version of this function")
    public static final /* synthetic */ ModifierLocalMap modifierLocalMapOf(Pair... entries) {
        switch(entries.length) {
            case 0: goto L7;
            case 1: goto L9;
            default: goto L4;
        };
    L4:
        Pair r2 = (Pair) ArraysKt.first(entries);
        Collection $this$toTypedArray$iv = ArraysKt.drop(entries, 1);
        Pair[] r1 = (Pair[]) $this$toTypedArray$iv.toArray(new Pair[0]);
        return new MultiLocalMap(r2, (Pair[]) Arrays.copyOf(r1, r1.length));
    L9:
        return new MultiLocalMap((Pair) ArraysKt.first(entries), new Pair[0]);
    L7:
        return EmptyMap.INSTANCE;
    }
}
