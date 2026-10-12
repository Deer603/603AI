package androidx.compose.runtime;

import kotlin.Metadata;
import kotlin.NotImplementedError;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Composables.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000v\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\\\u0010\u0012\u001a\u00020\u0013\"\b\b\u0000\u0010\u0014*\u00020\u0015\"\u000e\b\u0001\u0010\u0016\u0018\u0001*\u0006\u0012\u0002\b\u00030\u00172\u000e\b\b\u0010\u0018\u001a\b\u0012\u0004\u0012\u0002H\u00140\u00192\"\u0010\u001a\u001a\u001e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00140\u001c\u0012\u0004\u0012\u00020\u00130\u001b¢\u0006\u0002\b\u001d¢\u0006\u0002\b\u001eH\u0087\b¢\u0006\u0002\u0010\u001f\u001ak\u0010\u0012\u001a\u00020\u0013\"\u0004\b\u0000\u0010\u0014\"\u000e\b\u0001\u0010\u0016\u0018\u0001*\u0006\u0012\u0002\b\u00030\u00172\u000e\b\b\u0010\u0018\u001a\b\u0012\u0004\u0012\u0002H\u00140\u00192\"\u0010\u001a\u001a\u001e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00140\u001c\u0012\u0004\u0012\u00020\u00130\u001b¢\u0006\u0002\b\u001d¢\u0006\u0002\b\u001e2\u0011\u0010 \u001a\r\u0012\u0004\u0012\u00020\u00130\u0019¢\u0006\u0002\b!H\u0087\b¢\u0006\u0002\u0010\"\u001a\u0091\u0001\u0010\u0012\u001a\u00020\u0013\"\u0004\b\u0000\u0010\u0014\"\u000e\b\u0001\u0010\u0016\u0018\u0001*\u0006\u0012\u0002\b\u00030\u00172\u000e\b\b\u0010\u0018\u001a\b\u0012\u0004\u0012\u0002H\u00140\u00192\"\u0010\u001a\u001a\u001e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00140\u001c\u0012\u0004\u0012\u00020\u00130\u001b¢\u0006\u0002\b\u001d¢\u0006\u0002\b\u001e2$\b\b\u0010#\u001a\u001e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00140$\u0012\u0004\u0012\u00020\u00130\u001b¢\u0006\u0002\b!¢\u0006\u0002\b\u001e2\u0011\u0010 \u001a\r\u0012\u0004\u0012\u00020\u00130\u0019¢\u0006\u0002\b!H\u0087\b¢\u0006\u0002\u0010%\u001a\\\u0010&\u001a\u00020\u0013\"\b\b\u0000\u0010\u0014*\u00020\u0015\"\u000e\b\u0001\u0010\u0016\u0018\u0001*\u0006\u0012\u0002\b\u00030\u00172\u000e\b\b\u0010\u0018\u001a\b\u0012\u0004\u0012\u0002H\u00140\u00192\"\u0010\u001a\u001a\u001e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00140\u001c\u0012\u0004\u0012\u00020\u00130\u001b¢\u0006\u0002\b\u001d¢\u0006\u0002\b\u001eH\u0087\b¢\u0006\u0002\u0010\u001f\u001ak\u0010&\u001a\u00020\u0013\"\u0004\b\u0000\u0010\u0014\"\u000e\b\u0001\u0010\u0016\u0018\u0001*\u0006\u0012\u0002\b\u00030\u00172\u000e\b\b\u0010\u0018\u001a\b\u0012\u0004\u0012\u0002H\u00140\u00192\"\u0010\u001a\u001a\u001e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00140\u001c\u0012\u0004\u0012\u00020\u00130\u001b¢\u0006\u0002\b\u001d¢\u0006\u0002\b\u001e2\u0011\u0010 \u001a\r\u0012\u0004\u0012\u00020\u00130\u0019¢\u0006\u0002\b!H\u0087\b¢\u0006\u0002\u0010\"\u001a\u0091\u0001\u0010&\u001a\u00020\u0013\"\u0004\b\u0000\u0010\u0014\"\u000e\b\u0001\u0010\u0016\u0018\u0001*\u0006\u0012\u0002\b\u00030\u00172\u000e\b\b\u0010\u0018\u001a\b\u0012\u0004\u0012\u0002H\u00140\u00192\"\u0010\u001a\u001a\u001e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00140\u001c\u0012\u0004\u0012\u00020\u00130\u001b¢\u0006\u0002\b\u001d¢\u0006\u0002\b\u001e2$\b\b\u0010#\u001a\u001e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00140$\u0012\u0004\u0012\u00020\u00130\u001b¢\u0006\u0002\b!¢\u0006\u0002\b\u001e2\u0011\u0010 \u001a\r\u0012\u0004\u0012\u00020\u00130\u0019¢\u0006\u0002\b!H\u0087\b¢\u0006\u0002\u0010%\u001a+\u0010'\u001a\u00020\u00132\b\u0010(\u001a\u0004\u0018\u00010\u00152\u0011\u0010 \u001a\r\u0012\u0004\u0012\u00020\u00130\u0019¢\u0006\u0002\b!H\u0087\b¢\u0006\u0002\u0010)\u001a+\u0010*\u001a\u00020\u00132\u0006\u0010+\u001a\u00020,2\u0013\b\u0004\u0010 \u001a\r\u0012\u0004\u0012\u00020\u00130\u0019¢\u0006\u0002\b!H\u0087\b¢\u0006\u0002\u0010-\u001a\b\u0010.\u001a\u00020\u0013H\u0001\u001a?\u0010(\u001a\u0002H\u0014\"\u0004\b\u0000\u0010\u00142\u0016\u0010/\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u001500\"\u0004\u0018\u00010\u00152\u0011\u00101\u001a\r\u0012\u0004\u0012\u0002H\u00140\u0019¢\u0006\u0002\b!H\u0087\b¢\u0006\u0002\u00102\u001a)\u00103\u001a\u0002H\u0014\"\u0004\b\u0000\u0010\u00142\u0013\b\u0004\u00104\u001a\r\u0012\u0004\u0012\u0002H\u00140\u0019¢\u0006\u0002\b\u001dH\u0087\b¢\u0006\u0002\u00105\u001a3\u00103\u001a\u0002H\u0014\"\u0004\b\u0000\u0010\u00142\b\u00106\u001a\u0004\u0018\u00010\u00152\u0013\b\u0004\u00104\u001a\r\u0012\u0004\u0012\u0002H\u00140\u0019¢\u0006\u0002\b\u001dH\u0087\b¢\u0006\u0002\u00107\u001a=\u00103\u001a\u0002H\u0014\"\u0004\b\u0000\u0010\u00142\b\u00106\u001a\u0004\u0018\u00010\u00152\b\u00108\u001a\u0004\u0018\u00010\u00152\u0013\b\u0004\u00104\u001a\r\u0012\u0004\u0012\u0002H\u00140\u0019¢\u0006\u0002\b\u001dH\u0087\b¢\u0006\u0002\u00109\u001aG\u00103\u001a\u0002H\u0014\"\u0004\b\u0000\u0010\u00142\b\u00106\u001a\u0004\u0018\u00010\u00152\b\u00108\u001a\u0004\u0018\u00010\u00152\b\u0010:\u001a\u0004\u0018\u00010\u00152\u0013\b\u0004\u00104\u001a\r\u0012\u0004\u0012\u0002H\u00140\u0019¢\u0006\u0002\b\u001dH\u0087\b¢\u0006\u0002\u0010;\u001aA\u00103\u001a\u0002H\u0014\"\u0004\b\u0000\u0010\u00142\u0016\u0010/\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u001500\"\u0004\u0018\u00010\u00152\u0013\b\u0004\u00104\u001a\r\u0012\u0004\u0012\u0002H\u00140\u0019¢\u0006\u0002\b\u001dH\u0087\b¢\u0006\u0002\u0010<\u001a\r\u0010=\u001a\u00020>H\u0007¢\u0006\u0002\u0010?\"\u0011\u0010\u0000\u001a\u00020\u00018G¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u0003\"\u0011\u0010\u0004\u001a\u00020\u00058G¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007\"\u0017\u0010\b\u001a\u00020\t8G¢\u0006\f\u0012\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0011\u0010\u000e\u001a\u00020\u000f8G¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006@"}, d2 = {"currentComposer", "Landroidx/compose/runtime/Composer;", "getCurrentComposer", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/Composer;", "currentCompositeKeyHash", "", "getCurrentCompositeKeyHash", "(Landroidx/compose/runtime/Composer;I)I", "currentCompositionLocalContext", "Landroidx/compose/runtime/CompositionLocalContext;", "getCurrentCompositionLocalContext$annotations", "()V", "getCurrentCompositionLocalContext", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/CompositionLocalContext;", "currentRecomposeScope", "Landroidx/compose/runtime/RecomposeScope;", "getCurrentRecomposeScope", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/RecomposeScope;", "ComposeNode", "", "T", "", "E", "Landroidx/compose/runtime/Applier;", "factory", "Lkotlin/Function0;", "update", "Lkotlin/Function1;", "Landroidx/compose/runtime/Updater;", "Landroidx/compose/runtime/DisallowComposableCalls;", "Lkotlin/ExtensionFunctionType;", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "content", "Landroidx/compose/runtime/Composable;", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "skippableUpdate", "Landroidx/compose/runtime/SkippableUpdater;", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "ReusableComposeNode", "ReusableContent", "key", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "ReusableContentHost", "active", "", "(ZLkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "invalidApplier", "keys", "", "block", "([Ljava/lang/Object;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)Ljava/lang/Object;", "remember", "calculation", "(Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)Ljava/lang/Object;", "key1", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)Ljava/lang/Object;", "key2", "(Ljava/lang/Object;Ljava/lang/Object;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)Ljava/lang/Object;", "key3", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)Ljava/lang/Object;", "([Ljava/lang/Object;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)Ljava/lang/Object;", "rememberCompositionContext", "Landroidx/compose/runtime/CompositionContext;", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/CompositionContext;", "runtime_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class ComposablesKt {
    public static /* synthetic */ void getCurrentCompositionLocalContext$annotations() {
    }

    public static final <T> T remember(Function0<? extends T> r7, Composer r8, int r9) {
        ComposerKt.sourceInformationMarkerStart(r8, -492369756, "CC(remember):Composables.kt#9igjgp");
        T r4 = (T) r8.rememberedValue();
        if (r4 != Composer.Companion.getEmpty()) goto L6;
        T r6 = r7.invoke();
        r8.updateRememberedValue(r6);
        r4 = r6;
    L6:
        ComposerKt.sourceInformationMarkerEnd(r8);
        return r4;
    }

    public static final <T> T remember(Object r7, Function0<? extends T> r8, Composer r9, int r10) {
        ComposerKt.sourceInformationMarkerStart(r9, 1157296644, "CC(remember)P(1):Composables.kt#9igjgp");
        boolean r1 = r9.changed(r7);
        T r4 = (T) r9.rememberedValue();
        if (r1 == false) goto L5;
    L8:
        T r6 = r8.invoke();
        r9.updateRememberedValue(r6);
        r4 = r6;
    L9:
        ComposerKt.sourceInformationMarkerEnd(r9);
        return r4;
    L5:
        if (r4 != Composer.Companion.getEmpty()) goto L9;
        goto L8
    }

    public static final <T> T remember(Object r7, Object r8, Function0<? extends T> r9, Composer r10, int r11) {
        ComposerKt.sourceInformationMarkerStart(r10, 511388516, "CC(remember)P(1,2):Composables.kt#9igjgp");
        boolean r1 = r10.changed(r7) | r10.changed(r8);
        T r4 = (T) r10.rememberedValue();
        if (r1 == false) goto L5;
    L8:
        T r6 = r9.invoke();
        r10.updateRememberedValue(r6);
        r4 = r6;
    L9:
        ComposerKt.sourceInformationMarkerEnd(r10);
        return r4;
    L5:
        if (r4 != Composer.Companion.getEmpty()) goto L9;
        goto L8
    }

    public static final <T> T remember(Object r7, Object r8, Object r9, Function0<? extends T> r10, Composer r11, int r12) {
        ComposerKt.sourceInformationMarkerStart(r11, 1618982084, "CC(remember)P(1,2,3):Composables.kt#9igjgp");
        boolean r1 = (r11.changed(r7) | r11.changed(r8)) | r11.changed(r9);
        T r4 = (T) r11.rememberedValue();
        if (r1 == false) goto L5;
    L8:
        T r6 = r10.invoke();
        r11.updateRememberedValue(r6);
        r4 = r6;
    L9:
        ComposerKt.sourceInformationMarkerEnd(r11);
        return r4;
    L5:
        if (r4 != Composer.Companion.getEmpty()) goto L9;
        goto L8
    }

    public static final <T> T remember(Object[] r7, Function0<? extends T> r8, Composer r9, int r10) {
        ComposerKt.sourceInformationMarkerStart(r9, -568225417, "CC(remember)P(1):Composables.kt#9igjgp");
        boolean r1 = false;
        int r2 = r7.length;
        int r3 = 0;
    L3:
        if (r3 >= r2) goto L5;
        r1 = r1 | r9.changed(r7[r3]);
        r3 = r3 + 1;
        goto L3
    L5:
        T r4 = (T) r9.rememberedValue();
        if (r1 == false) goto L8;
    L11:
        T r6 = r8.invoke();
        r9.updateRememberedValue(r6);
        r4 = r6;
    L12:
        ComposerKt.sourceInformationMarkerEnd(r9);
        return r4;
    L8:
        if (r4 != Composer.Companion.getEmpty()) goto L12;
        goto L11
    }

    public static final <T> T key(Object[] keys, Function2<? super Composer, ? super Integer, ? extends T> r4, Composer $composer, int $changed) {
        ComposerKt.sourceInformationMarkerStart($composer, -11941951, "CC(key)P(1)124@4764L7:Composables.kt#9igjgp");
        T r1 = r4.invoke($composer, Integer.valueOf(($changed >> 3) & 14));
        ComposerKt.sourceInformationMarkerEnd($composer);
        return r1;
    }

    public static final void ReusableContent(Object key, Function2<? super Composer, ? super Integer, Unit> r4, Composer $composer, int $changed) {
        ComposerKt.sourceInformationMarkerStart($composer, 444418301, "CC(ReusableContent)P(1)138@5411L9:Composables.kt#9igjgp");
        $composer.startReusableGroup(ComposerKt.reuseKey, key);
        r4.invoke($composer, Integer.valueOf(($changed >> 3) & 14));
        $composer.endReusableGroup();
        ComposerKt.sourceInformationMarkerEnd($composer);
    }

    public static final void ReusableContentHost(boolean active, Function2<? super Composer, ? super Integer, Unit> r4, Composer $composer, int $changed) {
        ComposerKt.sourceInformationMarkerStart($composer, -570654463, "CC(ReusableContentHost)161@6675L9:Composables.kt#9igjgp");
        $composer.startReusableGroup(ComposerKt.reuseKey, Boolean.valueOf(active));
        boolean activeChanged = $composer.changed(active);
        if (active == false) goto L5;
        r4.invoke($composer, Integer.valueOf(($changed >> 3) & 14));
    L6:
        $composer.endReusableGroup();
        ComposerKt.sourceInformationMarkerEnd($composer);
        return;
    L5:
        $composer.deactivateToEndGroup(activeChanged);
        goto L6
    }

    public static final Composer getCurrentComposer(Composer $composer, int $changed) {
        ComposerKt.sourceInformationMarkerStart($composer, -554250212, "C(<get-currentComposer>):Composables.kt#9igjgp");
        if (ComposerKt.isTraceInProgress() == false) goto L6;
        ComposerKt.traceEventStart(-554250212, $changed, -1, "androidx.compose.runtime.<get-currentComposer> (Composables.kt:172)");
    L6:
        throw new NotImplementedError("Implemented as an intrinsic");
    }

    public static final RecomposeScope getCurrentRecomposeScope(Composer $composer, int $changed) {
        ComposerKt.sourceInformationMarkerStart($composer, 394957799, "C(<get-currentRecomposeScope>):Composables.kt#9igjgp");
        if (ComposerKt.isTraceInProgress() == false) goto L5;
        ComposerKt.traceEventStart(394957799, $changed, -1, "androidx.compose.runtime.<get-currentRecomposeScope> (Composables.kt:184)");
    L5:
        RecomposeScope scope = $composer.getRecomposeScope();
        if (scope == null) goto L13;
        $composer.recordUsed(scope);
        if (ComposerKt.isTraceInProgress() == false) goto L10;
        ComposerKt.traceEventEnd();
    L10:
        ComposerKt.sourceInformationMarkerEnd($composer);
        return scope;
    L13:
        throw new IllegalStateException("no recompose scope found".toString());
    }

    public static final CompositionLocalContext getCurrentCompositionLocalContext(Composer $composer, int $changed) {
        ComposerKt.sourceInformationMarkerStart($composer, -43352356, "C(<get-currentCompositionLocalContext>):Composables.kt#9igjgp");
        if (ComposerKt.isTraceInProgress() == false) goto L5;
        ComposerKt.traceEventStart(-43352356, $changed, -1, "androidx.compose.runtime.<get-currentCompositionLocalContext> (Composables.kt:199)");
    L5:
        CompositionLocalContext r0 = new CompositionLocalContext($composer.buildContext().getCompositionLocalScope$runtime_release());
        if (ComposerKt.isTraceInProgress() == false) goto L8;
        ComposerKt.traceEventEnd();
    L8:
        ComposerKt.sourceInformationMarkerEnd($composer);
        return r0;
    }

    public static final int getCurrentCompositeKeyHash(Composer $composer, int $changed) {
        ComposerKt.sourceInformationMarkerStart($composer, 524444915, "C(<get-currentCompositeKeyHash>):Composables.kt#9igjgp");
        if (ComposerKt.isTraceInProgress() == false) goto L5;
        ComposerKt.traceEventStart(524444915, $changed, -1, "androidx.compose.runtime.<get-currentCompositeKeyHash> (Composables.kt:213)");
    L5:
        int r0 = $composer.getCompoundKeyHash();
        if (ComposerKt.isTraceInProgress() == false) goto L8;
        ComposerKt.traceEventEnd();
    L8:
        ComposerKt.sourceInformationMarkerEnd($composer);
        return r0;
    }

    public static final /* synthetic */ <T, E extends Applier<?>> void ComposeNode(Function0<? extends T> r4, Function1<? super Updater<T>, Unit> r5, Composer $composer, int $changed) {
        ComposerKt.sourceInformationMarkerStart($composer, 1886828752, "CC(ComposeNode):Composables.kt#9igjgp");
        Applier<?> r1 = $composer.getApplier();
        Intrinsics.reifiedOperationMarker(3, "E");
        if ((r1 instanceof Applier) == true) goto L5;
        invalidApplier();
    L5:
        $composer.startNode();
        if ($composer.getInserting() == false) goto L8;
        $composer.createNode(r4);
    L9:
        r5.invoke(Updater.m3807boximpl(Updater.m3808constructorimpl($composer)));
        $composer.endNode();
        ComposerKt.sourceInformationMarkerEnd($composer);
        return;
    L8:
        $composer.useNode();
        goto L9
    }

    public static final /* synthetic */ <T, E extends Applier<?>> void ReusableComposeNode(Function0<? extends T> r4, Function1<? super Updater<T>, Unit> r5, Composer $composer, int $changed) {
        ComposerKt.sourceInformationMarkerStart($composer, 1405779621, "CC(ReusableComposeNode):Composables.kt#9igjgp");
        Applier<?> r1 = $composer.getApplier();
        Intrinsics.reifiedOperationMarker(3, "E");
        if ((r1 instanceof Applier) == true) goto L5;
        invalidApplier();
    L5:
        $composer.startReusableNode();
        if ($composer.getInserting() == false) goto L8;
        $composer.createNode(r4);
    L9:
        r5.invoke(Updater.m3807boximpl(Updater.m3808constructorimpl($composer)));
        $composer.endNode();
        ComposerKt.sourceInformationMarkerEnd($composer);
        return;
    L8:
        $composer.useNode();
        goto L9
    }

    public static final /* synthetic */ <T, E extends Applier<?>> void ComposeNode(Function0<? extends T> r4, Function1<? super Updater<T>, Unit> r5, Function2<? super Composer, ? super Integer, Unit> r6, Composer $composer, int $changed) {
        ComposerKt.sourceInformationMarkerStart($composer, -548224868, "CC(ComposeNode)P(1,2)317@12553L9:Composables.kt#9igjgp");
        Applier<?> r1 = $composer.getApplier();
        Intrinsics.reifiedOperationMarker(3, "E");
        if ((r1 instanceof Applier) == true) goto L5;
        invalidApplier();
    L5:
        $composer.startNode();
        if ($composer.getInserting() == false) goto L8;
        $composer.createNode(r4);
    L9:
        r5.invoke(Updater.m3807boximpl(Updater.m3808constructorimpl($composer)));
        r6.invoke($composer, Integer.valueOf(($changed >> 6) & 14));
        $composer.endNode();
        ComposerKt.sourceInformationMarkerEnd($composer);
        return;
    L8:
        $composer.useNode();
        goto L9
    }

    public static final /* synthetic */ <T, E extends Applier<?>> void ReusableComposeNode(Function0<? extends T> r4, Function1<? super Updater<T>, Unit> r5, Function2<? super Composer, ? super Integer, Unit> r6, Composer $composer, int $changed) {
        ComposerKt.sourceInformationMarkerStart($composer, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
        Applier<?> r1 = $composer.getApplier();
        Intrinsics.reifiedOperationMarker(3, "E");
        if ((r1 instanceof Applier) == true) goto L5;
        invalidApplier();
    L5:
        $composer.startReusableNode();
        if ($composer.getInserting() == false) goto L8;
        $composer.createNode(r4);
    L9:
        r5.invoke(Updater.m3807boximpl(Updater.m3808constructorimpl($composer)));
        r6.invoke($composer, Integer.valueOf(($changed >> 6) & 14));
        $composer.endNode();
        ComposerKt.sourceInformationMarkerEnd($composer);
        return;
    L8:
        $composer.useNode();
        goto L9
    }

    public static final /* synthetic */ <T, E extends Applier<?>> void ComposeNode(Function0<? extends T> r4, Function1<? super Updater<T>, Unit> r5, Function3<? super SkippableUpdater<T>, ? super Composer, ? super Integer, Unit> r6, Function2<? super Composer, ? super Integer, Unit> r7, Composer $composer, int $changed) {
        ComposerKt.sourceInformationMarkerStart($composer, -1609567895, "CC(ComposeNode)P(1,3,2)398@15846L17,400@15922L9:Composables.kt#9igjgp");
        Applier<?> r1 = $composer.getApplier();
        Intrinsics.reifiedOperationMarker(3, "E");
        if ((r1 instanceof Applier) == true) goto L5;
        invalidApplier();
    L5:
        $composer.startNode();
        if ($composer.getInserting() == false) goto L8;
        $composer.createNode(r4);
    L9:
        r5.invoke(Updater.m3807boximpl(Updater.m3808constructorimpl($composer)));
        r6.invoke(SkippableUpdater.m3781boximpl(SkippableUpdater.m3782constructorimpl($composer)), $composer, Integer.valueOf(($changed >> 3) & 112));
        $composer.startReplaceableGroup(2058660585);
        r7.invoke($composer, Integer.valueOf(($changed >> 9) & 14));
        $composer.endReplaceableGroup();
        $composer.endNode();
        ComposerKt.sourceInformationMarkerEnd($composer);
        return;
    L8:
        $composer.useNode();
        goto L9
    }

    public static final /* synthetic */ <T, E extends Applier<?>> void ReusableComposeNode(Function0<? extends T> r4, Function1<? super Updater<T>, Unit> r5, Function3<? super SkippableUpdater<T>, ? super Composer, ? super Integer, Unit> r6, Function2<? super Composer, ? super Integer, Unit> r7, Composer $composer, int $changed) {
        ComposerKt.sourceInformationMarkerStart($composer, -871138626, "CC(ReusableComposeNode)P(1,3,2)444@17820L17,446@17896L9:Composables.kt#9igjgp");
        Applier<?> r1 = $composer.getApplier();
        Intrinsics.reifiedOperationMarker(3, "E");
        if ((r1 instanceof Applier) == true) goto L5;
        invalidApplier();
    L5:
        $composer.startReusableNode();
        if ($composer.getInserting() == false) goto L8;
        $composer.createNode(r4);
    L9:
        r5.invoke(Updater.m3807boximpl(Updater.m3808constructorimpl($composer)));
        r6.invoke(SkippableUpdater.m3781boximpl(SkippableUpdater.m3782constructorimpl($composer)), $composer, Integer.valueOf(($changed >> 3) & 112));
        $composer.startReplaceableGroup(2058660585);
        r7.invoke($composer, Integer.valueOf(($changed >> 9) & 14));
        $composer.endReplaceableGroup();
        $composer.endNode();
        ComposerKt.sourceInformationMarkerEnd($composer);
        return;
    L8:
        $composer.useNode();
        goto L9
    }

    public static final void invalidApplier() {
        throw new IllegalStateException("Invalid applier".toString());
    }

    public static final CompositionContext rememberCompositionContext(Composer $composer, int $changed) {
        ComposerKt.sourceInformationMarkerStart($composer, -1165786124, "C(rememberCompositionContext):Composables.kt#9igjgp");
        if (ComposerKt.isTraceInProgress() == false) goto L5;
        ComposerKt.traceEventStart(-1165786124, $changed, -1, "androidx.compose.runtime.rememberCompositionContext (Composables.kt:461)");
    L5:
        CompositionContext r0 = $composer.buildContext();
        if (ComposerKt.isTraceInProgress() == false) goto L8;
        ComposerKt.traceEventEnd();
    L8:
        ComposerKt.sourceInformationMarkerEnd($composer);
        return r0;
    }
}
