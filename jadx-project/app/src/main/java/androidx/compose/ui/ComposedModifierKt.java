package androidx.compose.ui;

import androidx.compose.runtime.Composer;
import androidx.compose.ui.platform.InspectableValueKt;
import androidx.compose.ui.platform.InspectorInfo;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;

/* JADX INFO: compiled from: ComposedModifier.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000@\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u001aH\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\u0019\b\u0002\u0010\u0002\u001a\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\b\u00062\u001c\u0010\u0007\u001a\u0018\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00010\u0003¢\u0006\u0002\b\b¢\u0006\u0002\b\u0006¢\u0006\u0002\u0010\t\u001aZ\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\r2\u0019\b\u0002\u0010\u0002\u001a\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\b\u00062\u001c\u0010\u0007\u001a\u0018\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00010\u0003¢\u0006\u0002\b\b¢\u0006\u0002\b\u0006¢\u0006\u0002\u0010\u000e\u001ad\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\r2\b\u0010\u000f\u001a\u0004\u0018\u00010\r2\u0019\b\u0002\u0010\u0002\u001a\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\b\u00062\u001c\u0010\u0007\u001a\u0018\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00010\u0003¢\u0006\u0002\b\b¢\u0006\u0002\b\u0006¢\u0006\u0002\u0010\u0010\u001an\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\r2\b\u0010\u000f\u001a\u0004\u0018\u00010\r2\b\u0010\u0011\u001a\u0004\u0018\u00010\r2\u0019\b\u0002\u0010\u0002\u001a\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\b\u00062\u001c\u0010\u0007\u001a\u0018\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00010\u0003¢\u0006\u0002\b\b¢\u0006\u0002\b\u0006¢\u0006\u0002\u0010\u0012\u001ah\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\n\u001a\u00020\u000b2\u0016\u0010\u0013\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\r0\u0014\"\u0004\u0018\u00010\r2\u0019\b\u0002\u0010\u0002\u001a\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\b\u00062\u001c\u0010\u0007\u001a\u0018\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00010\u0003¢\u0006\u0002\b\b¢\u0006\u0002\b\u0006¢\u0006\u0002\u0010\u0015\u001a\u0019\u0010\u0016\u001a\u00020\u0001*\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0001H\u0007¢\u0006\u0002\b\u0019\u001a\u0014\u0010\u001a\u001a\u00020\u0001*\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0001H\u0002\u001a\u0019\u0010\u001b\u001a\u00020\u0001*\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0001H\u0007¢\u0006\u0002\b\u0016\u001a\u0014\u0010\u001c\u001a\u00020\u0001*\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0001H\u0000¨\u0006\u001d"}, d2 = {"composed", "Landroidx/compose/ui/Modifier;", "inspectorInfo", "Lkotlin/Function1;", "Landroidx/compose/ui/platform/InspectorInfo;", "", "Lkotlin/ExtensionFunctionType;", "factory", "Landroidx/compose/runtime/Composable;", "(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function3;)Landroidx/compose/ui/Modifier;", "fullyQualifiedName", "", "key1", "", "(Landroidx/compose/ui/Modifier;Ljava/lang/String;Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function3;)Landroidx/compose/ui/Modifier;", "key2", "(Landroidx/compose/ui/Modifier;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function3;)Landroidx/compose/ui/Modifier;", "key3", "(Landroidx/compose/ui/Modifier;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function3;)Landroidx/compose/ui/Modifier;", "keys", "", "(Landroidx/compose/ui/Modifier;Ljava/lang/String;[Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function3;)Landroidx/compose/ui/Modifier;", "materialize", "Landroidx/compose/runtime/Composer;", "modifier", "materializeModifier", "materializeImpl", "materializeWithCompositionLocalInjection", "materializeWithCompositionLocalInjectionInternal", "ui_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class ComposedModifierKt {
    public static final /* synthetic */ Modifier access$materializeImpl(Composer $receiver, Modifier modifier) {
        return materializeImpl($receiver, modifier);
    }

    public static /* synthetic */ Modifier composed$default(Modifier r0, Function1 r1, Function3 r2, int r3, Object r4) {
        if ((r3 & 1) == 0) goto L6;
        r1 = InspectableValueKt.getNoInspectorInfo();
    L6:
        return composed(r0, r1, r2);
    }

    public static final Modifier composed(Modifier $this$composed, Function1<? super InspectorInfo, Unit> r2, Function3<? super Modifier, ? super Composer, ? super Integer, ? extends Modifier> r3) {
        return $this$composed.then(new ComposedModifier(r2, r3));
    }

    public static /* synthetic */ Modifier composed$default(Modifier r0, String r1, Object r2, Function1 r3, Function3 r4, int r5, Object r6) {
        if ((r5 & 4) == 0) goto L6;
        r3 = InspectableValueKt.getNoInspectorInfo();
    L6:
        return composed(r0, r1, r2, r3, r4);
    }

    public static final Modifier composed(Modifier $this$composed, String fullyQualifiedName, Object key1, Function1<? super InspectorInfo, Unit> r4, Function3<? super Modifier, ? super Composer, ? super Integer, ? extends Modifier> r5) {
        return $this$composed.then(new KeyedComposedModifier1(fullyQualifiedName, key1, r4, r5));
    }

    public static /* synthetic */ Modifier composed$default(Modifier r6, String r7, Object r8, Object r9, Function1 r10, Function3 r11, int r12, Object r13) {
        if ((r12 & 8) == 0) goto L5;
        Function1 r4 = InspectableValueKt.getNoInspectorInfo();
    L7:
        return composed(r6, r7, r8, r9, r4, r11);
    L5:
        r4 = r10;
        goto L7
    }

    public static final Modifier composed(Modifier $this$composed, String fullyQualifiedName, Object key1, Object key2, Function1<? super InspectorInfo, Unit> r10, Function3<? super Modifier, ? super Composer, ? super Integer, ? extends Modifier> r11) {
        return $this$composed.then(new KeyedComposedModifier2(fullyQualifiedName, key1, key2, r10, r11));
    }

    public static /* synthetic */ Modifier composed$default(Modifier r7, String r8, Object r9, Object r10, Object r11, Function1 r12, Function3 r13, int r14, Object r15) {
        if ((r14 & 16) == 0) goto L5;
        Function1 r5 = InspectableValueKt.getNoInspectorInfo();
    L7:
        return composed(r7, r8, r9, r10, r11, r5, r13);
    L5:
        r5 = r12;
        goto L7
    }

    public static final Modifier composed(Modifier $this$composed, String fullyQualifiedName, Object key1, Object key2, Object key3, Function1<? super InspectorInfo, Unit> r12, Function3<? super Modifier, ? super Composer, ? super Integer, ? extends Modifier> r13) {
        return $this$composed.then(new KeyedComposedModifier3(fullyQualifiedName, key1, key2, key3, r12, r13));
    }

    public static /* synthetic */ Modifier composed$default(Modifier r0, String r1, Object[] r2, Function1 r3, Function3 r4, int r5, Object r6) {
        if ((r5 & 4) == 0) goto L6;
        r3 = InspectableValueKt.getNoInspectorInfo();
    L6:
        return composed(r0, r1, r2, r3, r4);
    }

    public static final Modifier composed(Modifier $this$composed, String fullyQualifiedName, Object[] keys, Function1<? super InspectorInfo, Unit> r4, Function3<? super Modifier, ? super Composer, ? super Integer, ? extends Modifier> r5) {
        return $this$composed.then(new KeyedComposedModifierN(fullyQualifiedName, keys, r4, r5));
    }

    public static final Modifier materializeModifier(Composer $this$materialize, Modifier modifier) {
        $this$materialize.startReplaceGroup(439770924);
        Modifier result = materializeImpl($this$materialize, modifier);
        $this$materialize.endReplaceGroup();
        return result;
    }

    private static final Modifier materializeImpl(final Composer $this$materializeImpl, Modifier modifier) {
        if (modifier.all(AnonymousClass1.INSTANCE) == false) goto L5;
        return modifier;
    L5:
        $this$materializeImpl.startReplaceableGroup(1219399079);
        Modifier result = (Modifier) modifier.foldIn(Modifier.Companion, new ComposedModifierKt$materializeImpl$result$1($this$materializeImpl));
        $this$materializeImpl.endReplaceableGroup();
        return result;
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Kept for backwards compatibility only. If you are recompiling, use materialize.", replaceWith = @ReplaceWith(expression = "materialize", imports = {}))
    public static final /* synthetic */ Modifier materialize(Composer $this$materializeWithCompositionLocalInjection, Modifier modifier) {
        return materializeWithCompositionLocalInjectionInternal($this$materializeWithCompositionLocalInjection, modifier);
    }

    public static final Modifier materializeWithCompositionLocalInjectionInternal(Composer $this$materializeWithCompositionLocalInjectionInternal, Modifier modifier) {
        if (modifier != Modifier.Companion) goto L6;
        return modifier;
    L6:
        return materializeModifier($this$materializeWithCompositionLocalInjectionInternal, new CompositionLocalMapInjectionElement($this$materializeWithCompositionLocalInjectionInternal.getCurrentCompositionLocalMap()).then(modifier));
    }
}
