package androidx.compose.runtime;

import androidx.collection.MutableScatterMap;
import androidx.collection.MutableScatterSet;
import androidx.collection.ScatterSetKt;
import androidx.compose.runtime.collection.MultiValueMap;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Composer.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000¼\u0001\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0001\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0000\u001a\u0010\u0010<\u001a\u00020=2\u0006\u0010>\u001a\u00020?H\u0000\u001a\u0010\u0010@\u001a\u00020A2\u0006\u0010>\u001a\u00020?H\u0000\u001a\u0011\u0010B\u001a\u00020=2\u0006\u0010C\u001a\u00020\u0001H\u0080\b\u001a\u001f\u0010B\u001a\u00020=2\u0006\u0010C\u001a\u00020\u00012\f\u0010D\u001a\b\u0012\u0004\u0012\u00020?0EH\u0080\b\u001a.\u0010F\u001a\u00020G2\u0006\u0010H\u001a\u00020I2\u0006\u0010(\u001a\u00020J2\u0006\u0010K\u001a\u0002032\f\u0010L\u001a\b\u0012\u0002\b\u0003\u0018\u00010MH\u0000\u001a(\u0010N\u001a\u0004\u0018\u00010\u00062\b\u0010C\u001a\u0004\u0018\u00010\u00062\b\u0010O\u001a\u0004\u0018\u00010\u00062\b\u0010P\u001a\u0004\u0018\u00010\u0006H\u0002\u001a\b\u0010Q\u001a\u00020\u0001H\u0007\u001a5\u0010R\u001a\u000e\u0012\u0004\u0012\u0002HT\u0012\u0004\u0012\u0002HU0S\"\b\b\u0000\u0010T*\u00020\u0006\"\b\b\u0001\u0010U*\u00020\u00062\u0006\u0010V\u001a\u00020\fH\u0002¢\u0006\u0002\u0010W\u001a\u0011\u0010X\u001a\u00020=2\u0006\u0010C\u001a\u00020\u0001H\u0080\b\u001a*\u0010X\u001a\u00020=2\u0006\u0010C\u001a\u00020\u00012\f\u0010D\u001a\b\u0012\u0004\u0012\u00020?0EH\u0080\b\u0082\u0002\b\n\u0006\b\u0000\u001a\u0002\u0010\u0001\u001a\u0018\u0010Y\u001a\u00020=2\u0006\u0010Z\u001a\u00020[2\u0006\u0010Y\u001a\u00020?H\u0007\u001a\u0010\u0010\\\u001a\u00020=2\u0006\u0010Z\u001a\u00020[H\u0007\u001a \u0010]\u001a\u00020=2\u0006\u0010Z\u001a\u00020[2\u0006\u0010^\u001a\u00020\f2\u0006\u0010Y\u001a\u00020?H\u0007\u001a\b\u0010_\u001a\u00020=H\u0007\u001a(\u0010`\u001a\u00020=2\u0006\u0010^\u001a\u00020\f2\u0006\u0010a\u001a\u00020\f2\u0006\u0010b\u001a\u00020\f2\u0006\u0010c\u001a\u00020?H\u0007\u001a\u0018\u0010`\u001a\u00020=2\u0006\u0010^\u001a\u00020\f2\u0006\u0010c\u001a\u00020?H\u0007\u001a\f\u0010d\u001a\u00020\u0001*\u00020\fH\u0002\u001a\f\u0010e\u001a\u00020\f*\u00020\u0001H\u0002\u001a3\u0010f\u001a\u0002Hg\"\u0004\b\u0000\u0010g*\u00020[2\u0006\u0010h\u001a\u00020\u00012\u0011\u0010i\u001a\r\u0012\u0004\u0012\u0002Hg0E¢\u0006\u0002\bjH\u0087\b¢\u0006\u0002\u0010k\u001a\u001c\u0010l\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060m*\u00020n2\u0006\u0010o\u001a\u00020pH\u0002\u001a\u0014\u0010q\u001a\u00020=*\u0002032\u0006\u0010r\u001a\u00020sH\u0000\u001a\u001c\u0010t\u001a\u00020\f*\u0002012\u0006\u0010u\u001a\u00020\f2\u0006\u0010v\u001a\u00020\fH\u0002\u001a(\u0010w\u001a\b\u0012\u0004\u0012\u00020\u00040x*\b\u0012\u0004\u0012\u00020\u00040x2\u0006\u0010y\u001a\u00020\f2\u0006\u0010z\u001a\u00020\fH\u0002\u001a\u001a\u0010{\u001a\u00020\f*\b\u0012\u0004\u0012\u00020\u00040x2\u0006\u0010|\u001a\u00020\fH\u0002\u001a\u001a\u0010}\u001a\u00020\f*\b\u0012\u0004\u0012\u00020\u00040x2\u0006\u0010|\u001a\u00020\fH\u0002\u001a$\u0010~\u001a\u0004\u0018\u00010\u0004*\b\u0012\u0004\u0012\u00020\u00040x2\u0006\u0010y\u001a\u00020\f2\u0006\u0010z\u001a\u00020\fH\u0002\u001a/\u0010\u007f\u001a\u00020=*\b\u0012\u0004\u0012\u00020\u00040x2\u0006\u0010|\u001a\u00020\f2\b\u0010\u0080\u0001\u001a\u00030\u0081\u00012\t\u0010\u0082\u0001\u001a\u0004\u0018\u00010\u0006H\u0002\u001a(\u0010\u0083\u0001\u001a\u00020\f*\u0002012\u0007\u0010\u0084\u0001\u001a\u00020\f2\u0007\u0010\u0085\u0001\u001a\u00020\f2\u0007\u0010\u0086\u0001\u001a\u00020\fH\u0002\u001a\u0015\u0010\u0087\u0001\u001a\u00020=*\u0002032\u0006\u0010r\u001a\u00020sH\u0000\u001a \u0010\u0088\u0001\u001a\u00020=*\u0002032\u0006\u0010u\u001a\u00020\f2\t\u0010\u0089\u0001\u001a\u0004\u0018\u00010\u0006H\u0002\u001a\u001d\u0010\u008a\u0001\u001a\u0004\u0018\u00010\u0004*\b\u0012\u0004\u0012\u00020\u00040x2\u0006\u0010|\u001a\u00020\fH\u0002\u001a#\u0010\u008b\u0001\u001a\u00020=*\b\u0012\u0004\u0012\u00020\u00040x2\u0006\u0010y\u001a\u00020\f2\u0006\u0010z\u001a\u00020\fH\u0002\u001a<\u0010\u008c\u0001\u001a\u00020=\"\u0005\b\u0000\u0010\u008d\u0001*\u0002032\b\u0010o\u001a\u0004\u0018\u00010p2\u001b\u0010\u008e\u0001\u001a\u0016\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\f\u0012\u0005\u0012\u0003H\u008d\u00010\u008f\u0001H\u0080\b\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u0014\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0082\u0004¢\u0006\u0002\n\u0000\"\u001c\u0010\u0005\u001a\u00020\u00068\u0000X\u0081\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n\"\u0016\u0010\u000b\u001a\u00020\f8\u0000X\u0081T¢\u0006\b\n\u0000\u0012\u0004\b\r\u0010\b\"\u0016\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0082\u000e¢\u0006\b\n\u0000\u0012\u0004\b\u0010\u0010\b\"\u000e\u0010\u0011\u001a\u00020\fX\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0012\u001a\u00020\fX\u0082T¢\u0006\u0002\n\u0000\"\u001c\u0010\u0013\u001a\u00020\u00068\u0000X\u0081\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0014\u0010\b\u001a\u0004\b\u0015\u0010\n\"\u0016\u0010\u0016\u001a\u00020\f8\u0000X\u0081T¢\u0006\b\n\u0000\u0012\u0004\b\u0017\u0010\b\"\u000e\u0010\u0018\u001a\u00020\fX\u0082T¢\u0006\u0002\n\u0000\"\u001c\u0010\u0019\u001a\u00020\u00068\u0000X\u0081\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001a\u0010\b\u001a\u0004\b\u001b\u0010\n\"\u0016\u0010\u001c\u001a\u00020\f8\u0000X\u0081T¢\u0006\b\n\u0000\u0012\u0004\b\u001d\u0010\b\"\u001c\u0010\u001e\u001a\u00020\u00068\u0000X\u0081\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001f\u0010\b\u001a\u0004\b \u0010\n\"\u0016\u0010!\u001a\u00020\f8\u0000X\u0081T¢\u0006\b\n\u0000\u0012\u0004\b\"\u0010\b\"\u001c\u0010#\u001a\u00020\u00068\u0000X\u0081\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b$\u0010\b\u001a\u0004\b%\u0010\n\"\u0016\u0010&\u001a\u00020\f8\u0000X\u0081T¢\u0006\b\n\u0000\u0012\u0004\b'\u0010\b\"\u001c\u0010(\u001a\u00020\u00068\u0000X\u0081\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b)\u0010\b\u001a\u0004\b*\u0010\n\"\u0016\u0010+\u001a\u00020\f8\u0000X\u0081T¢\u0006\b\n\u0000\u0012\u0004\b,\u0010\b\"\u0016\u0010-\u001a\u00020\f8\u0000X\u0081T¢\u0006\b\n\u0000\u0012\u0004\b.\u0010\b\"\u000e\u0010/\u001a\u00020\fX\u0082T¢\u0006\u0002\n\u0000\"\u0018\u00100\u001a\u00020\u0001*\u0002018@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b0\u00102\"\u0018\u00100\u001a\u00020\u0001*\u0002038@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b0\u00104\"\u0018\u00105\u001a\u00020\u0006*\u0002068BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b7\u00108\"\u0018\u00109\u001a\u00020\f*\u0002038BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b:\u0010;¨\u0006\u0090\u0001"}, d2 = {"EnableDebugRuntimeChecks", "", "InvalidationLocationAscending", "Ljava/util/Comparator;", "Landroidx/compose/runtime/Invalidation;", "compositionLocalMap", "", "getCompositionLocalMap$annotations", "()V", "getCompositionLocalMap", "()Ljava/lang/Object;", "compositionLocalMapKey", "", "getCompositionLocalMapKey$annotations", "compositionTracer", "Landroidx/compose/runtime/CompositionTracer;", "getCompositionTracer$annotations", "defaultsKey", "invalidGroupLocation", "invocation", "getInvocation$annotations", "getInvocation", "invocationKey", "getInvocationKey$annotations", "nodeKey", "provider", "getProvider$annotations", "getProvider", "providerKey", "getProviderKey$annotations", "providerMaps", "getProviderMaps$annotations", "getProviderMaps", "providerMapsKey", "getProviderMapsKey$annotations", "providerValues", "getProviderValues$annotations", "getProviderValues", "providerValuesKey", "getProviderValuesKey$annotations", "reference", "getReference$annotations", "getReference", "referenceKey", "getReferenceKey$annotations", "reuseKey", "getReuseKey$annotations", "rootKey", "isAfterFirstChild", "Landroidx/compose/runtime/SlotReader;", "(Landroidx/compose/runtime/SlotReader;)Z", "Landroidx/compose/runtime/SlotWriter;", "(Landroidx/compose/runtime/SlotWriter;)Z", "joinedKey", "Landroidx/compose/runtime/KeyInfo;", "getJoinedKey", "(Landroidx/compose/runtime/KeyInfo;)Ljava/lang/Object;", "nextGroup", "getNextGroup", "(Landroidx/compose/runtime/SlotWriter;)I", "composeImmediateRuntimeError", "", "message", "", "composeRuntimeError", "", "debugRuntimeCheck", "value", "lazyMessage", "Lkotlin/Function0;", "extractMovableContentAtCurrent", "Landroidx/compose/runtime/MovableContentState;", "composition", "Landroidx/compose/runtime/ControlledComposition;", "Landroidx/compose/runtime/MovableContentStateReference;", "slots", "applier", "Landroidx/compose/runtime/Applier;", "getKey", "left", "right", "isTraceInProgress", "multiMap", "Landroidx/compose/runtime/collection/MultiValueMap;", "K", "V", "initialCapacity", "(I)Landroidx/collection/MutableScatterMap;", "runtimeCheck", "sourceInformation", "composer", "Landroidx/compose/runtime/Composer;", "sourceInformationMarkerEnd", "sourceInformationMarkerStart", "key", "traceEventEnd", "traceEventStart", "dirty1", "dirty2", "info", "asBool", "asInt", "cache", "T", "invalid", "block", "Landroidx/compose/runtime/DisallowComposableCalls;", "(Landroidx/compose/runtime/Composer;ZLkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "collectNodesFrom", "", "Landroidx/compose/runtime/SlotTable;", "anchor", "Landroidx/compose/runtime/Anchor;", "deactivateCurrentGroup", "rememberManager", "Landroidx/compose/runtime/RememberManager;", "distanceFrom", "index", "root", "filterToRange", "", "start", "end", "findInsertLocation", "location", "findLocation", "firstInRange", "insertIfMissing", "scope", "Landroidx/compose/runtime/RecomposeScopeImpl;", "instance", "nearestCommonRootOf", "a", "b", "common", "removeCurrentGroup", "removeData", "data", "removeLocation", "removeRange", "withAfterAnchorInfo", "R", "cb", "Lkotlin/Function2;", "runtime_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class ComposerKt {
    public static final boolean EnableDebugRuntimeChecks = false;
    private static final Comparator<Invalidation> InvalidationLocationAscending = null;
    private static final Object compositionLocalMap = null;
    public static final int compositionLocalMapKey = 202;
    private static CompositionTracer compositionTracer = null;
    private static final int defaultsKey = -127;
    private static final int invalidGroupLocation = -2;
    private static final Object invocation = null;
    public static final int invocationKey = 200;
    private static final int nodeKey = 125;
    private static final Object provider = null;
    public static final int providerKey = 201;
    private static final Object providerMaps = null;
    public static final int providerMapsKey = 204;
    private static final Object providerValues = null;
    public static final int providerValuesKey = 203;
    private static final Object reference = null;
    public static final int referenceKey = 206;
    public static final int reuseKey = 207;
    private static final int rootKey = 100;

    public static final /* synthetic */ boolean access$asBool(int $receiver) {
        return asBool($receiver);
    }

    public static final /* synthetic */ int access$asInt(boolean $receiver) {
        return asInt($receiver);
    }

    public static final /* synthetic */ List access$collectNodesFrom(SlotTable $receiver, Anchor anchor) {
        return collectNodesFrom($receiver, anchor);
    }

    public static final /* synthetic */ List access$filterToRange(List $receiver, int start, int end) {
        return filterToRange($receiver, start, end);
    }

    public static final /* synthetic */ Invalidation access$firstInRange(List $receiver, int start, int end) {
        return firstInRange($receiver, start, end);
    }

    public static final /* synthetic */ Comparator access$getInvalidationLocationAscending$p() {
        return InvalidationLocationAscending;
    }

    public static final /* synthetic */ Object access$getJoinedKey(KeyInfo $receiver) {
        return getJoinedKey($receiver);
    }

    public static final /* synthetic */ Object access$getKey(Object value, Object left, Object right) {
        return getKey(value, left, right);
    }

    public static final /* synthetic */ int access$getNextGroup(SlotWriter $receiver) {
        return getNextGroup($receiver);
    }

    public static final /* synthetic */ void access$insertIfMissing(List $receiver, int location, RecomposeScopeImpl scope, Object instance) {
        insertIfMissing($receiver, location, scope, instance);
    }

    public static final /* synthetic */ MutableScatterMap access$multiMap(int initialCapacity) {
        return multiMap(initialCapacity);
    }

    public static final /* synthetic */ int access$nearestCommonRootOf(SlotReader $receiver, int a, int b, int common) {
        return nearestCommonRootOf($receiver, a, b, common);
    }

    public static final /* synthetic */ Invalidation access$removeLocation(List $receiver, int location) {
        return removeLocation($receiver, location);
    }

    public static final /* synthetic */ void access$removeRange(List $receiver, int start, int end) {
        removeRange($receiver, start, end);
    }

    public static final /* synthetic */ void access$setCompositionTracer$p(CompositionTracer r0) {
        compositionTracer = r0;
    }

    public static /* synthetic */ void getCompositionLocalMap$annotations() {
    }

    public static /* synthetic */ void getCompositionLocalMapKey$annotations() {
    }

    private static /* synthetic */ void getCompositionTracer$annotations() {
    }

    public static /* synthetic */ void getInvocation$annotations() {
    }

    public static /* synthetic */ void getInvocationKey$annotations() {
    }

    public static /* synthetic */ void getProvider$annotations() {
    }

    public static /* synthetic */ void getProviderKey$annotations() {
    }

    public static /* synthetic */ void getProviderMaps$annotations() {
    }

    public static /* synthetic */ void getProviderMapsKey$annotations() {
    }

    public static /* synthetic */ void getProviderValues$annotations() {
    }

    public static /* synthetic */ void getProviderValuesKey$annotations() {
    }

    public static /* synthetic */ void getReference$annotations() {
    }

    public static /* synthetic */ void getReferenceKey$annotations() {
    }

    public static /* synthetic */ void getReuseKey$annotations() {
    }

    private static final int getNextGroup(SlotWriter $this$nextGroup) {
        return $this$nextGroup.getCurrentGroup() + $this$nextGroup.groupSize($this$nextGroup.getCurrentGroup());
    }

    @ComposeCompilerApi
    public static final <T> T cache(Composer r4, boolean r5, Function0<? extends T> r6) {
        T r1 = (T) r4.rememberedValue();
        if (r5 == false) goto L5;
    L8:
        T r3 = r6.invoke();
        r4.updateRememberedValue(r3);
        return r3;
    L5:
        if (r1 == Composer.Companion.getEmpty()) goto L8;
        return r1;
    }

    @ComposeCompilerApi
    public static final void sourceInformation(Composer composer, String sourceInformation) {
        composer.sourceInformation(sourceInformation);
    }

    @ComposeCompilerApi
    public static final void sourceInformationMarkerStart(Composer composer, int key, String sourceInformation) {
        composer.sourceInformationMarkerStart(key, sourceInformation);
    }

    @ComposeCompilerApi
    public static final boolean isTraceInProgress() {
        CompositionTracer it = compositionTracer;
        if (it != null) goto L5;
    L7:
        return false;
    L5:
        if (it.isTraceInProgress() == false) goto L7;
        return true;
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Use the overload with $dirty metadata instead", replaceWith = @ReplaceWith(expression = "traceEventStart(key, dirty1, dirty2, info)", imports = {}))
    @ComposeCompilerApi
    public static final /* synthetic */ void traceEventStart(int key, String info) {
        traceEventStart(key, -1, -1, info);
    }

    @ComposeCompilerApi
    public static final void traceEventStart(int key, int dirty1, int dirty2, String info) {
        CompositionTracer r0 = compositionTracer;
        if (r0 == null) goto L6;
        r0.traceEventStart(key, dirty1, dirty2, info);
        return;
    }

    @ComposeCompilerApi
    public static final void traceEventEnd() {
        CompositionTracer r0 = compositionTracer;
        if (r0 == null) goto L6;
        r0.traceEventEnd();
        return;
    }

    @ComposeCompilerApi
    public static final void sourceInformationMarkerEnd(Composer composer) {
        composer.sourceInformationMarkerEnd();
    }

    public static final void removeCurrentGroup(SlotWriter $this$removeCurrentGroup, RememberManager rememberManager) {
        int group$iv = $this$removeCurrentGroup.getCurrentGroup();
        SlotWriter this_$iv = $this$removeCurrentGroup;
        int $i$f$forAllData = 0;
        int address$iv = SlotWriter.access$groupIndexToAddress(this_$iv, group$iv);
        int start$iv = SlotWriter.access$dataIndex(this_$iv, SlotWriter.access$getGroups$p(this_$iv), address$iv);
        int end$iv = SlotWriter.access$dataIndex(this_$iv, SlotWriter.access$getGroups$p(this_$iv), SlotWriter.access$groupIndexToAddress(this_$iv, this_$iv.getCurrentGroup() + this_$iv.groupSize(this_$iv.getCurrentGroup())));
        int slot$iv = start$iv;
    L3:
        if (slot$iv >= end$iv) goto L20;
        Object slot = SlotWriter.access$getSlots$p(this_$iv)[SlotWriter.access$dataIndexToDataAddress(this_$iv, slot$iv)];
        int slotIndex = slot$iv;
        if ((slot instanceof ComposeNodeLifecycleCallback) == false) goto L8;
        int endRelativeOrder = $this$removeCurrentGroup.getSlotsSize() - slotIndex;
        rememberManager.releasing((ComposeNodeLifecycleCallback) slot, endRelativeOrder, -1, -1);
    L8:
        if ((slot instanceof RememberObserverHolder) == false) goto L17;
        int endRelativeSlotIndex = $this$removeCurrentGroup.getSlotsSize() - slotIndex;
        Anchor anchor$iv = ((RememberObserverHolder) slot).getAfter();
        int priority$iv = -1;
        int endRelativeAfter$iv = -1;
        if (anchor$iv != null) goto L12;
    L14:
        int priority = priority$iv;
        int endRelativeAfter = endRelativeAfter$iv;
        rememberManager.forgetting((RememberObserverHolder) slot, endRelativeSlotIndex, priority, endRelativeAfter);
        goto L17
    L12:
        if (anchor$iv.getValid() == false) goto L14;
        priority$iv = $this$removeCurrentGroup.anchorIndex(anchor$iv);
        endRelativeAfter$iv = $this$removeCurrentGroup.getSlotsSize() - $this$removeCurrentGroup.slotsEndAllIndex$runtime_release(priority$iv);
    L17:
        if ((slot instanceof RecomposeScopeImpl) == false) goto L19;
        ((RecomposeScopeImpl) slot).release();
    L19:
        slot$iv = slot$iv + 1;
        $i$f$forAllData = $i$f$forAllData;
        group$iv = group$iv;
        this_$iv = this_$iv;
        goto L3
    L20:
        $this$removeCurrentGroup.removeGroup();
    }

    public static final <R> void withAfterAnchorInfo(SlotWriter $this$withAfterAnchorInfo, Anchor anchor, Function2<? super Integer, ? super Integer, ? extends R> r7) {
        int priority = -1;
        int endRelativeAfter = -1;
        if (anchor != null) goto L5;
    L7:
        r7.invoke(Integer.valueOf(priority), Integer.valueOf(endRelativeAfter));
        return;
    L5:
        if (anchor.getValid() == false) goto L7;
        priority = $this$withAfterAnchorInfo.anchorIndex(anchor);
        endRelativeAfter = $this$withAfterAnchorInfo.getSlotsSize() - $this$withAfterAnchorInfo.slotsEndAllIndex$runtime_release(priority);
        goto L7
    }

    public static final boolean isAfterFirstChild(SlotWriter $this$isAfterFirstChild) {
        if ($this$isAfterFirstChild.getCurrentGroup() > ($this$isAfterFirstChild.getParent() + 1)) goto L7;
        return false;
    L7:
        return true;
    }

    public static final boolean isAfterFirstChild(SlotReader $this$isAfterFirstChild) {
        if ($this$isAfterFirstChild.getCurrentGroup() > ($this$isAfterFirstChild.getParent() + 1)) goto L7;
        return false;
    L7:
        return true;
    }

    public static final void deactivateCurrentGroup(SlotWriter $this$deactivateCurrentGroup, RememberManager rememberManager) {
        int group$iv = $this$deactivateCurrentGroup.getCurrentGroup();
        SlotWriter this_$iv = $this$deactivateCurrentGroup;
        int $i$f$forAllData = 0;
        int address$iv = SlotWriter.access$groupIndexToAddress(this_$iv, group$iv);
        int start$iv = SlotWriter.access$dataIndex(this_$iv, SlotWriter.access$getGroups$p(this_$iv), address$iv);
        int end$iv = SlotWriter.access$dataIndex(this_$iv, SlotWriter.access$getGroups$p(this_$iv), SlotWriter.access$groupIndexToAddress(this_$iv, this_$iv.getCurrentGroup() + this_$iv.groupSize(this_$iv.getCurrentGroup())));
        int slot$iv = start$iv;
    L3:
        if (slot$iv >= end$iv) goto L24;
        Object data = SlotWriter.access$getSlots$p(this_$iv)[SlotWriter.access$dataIndexToDataAddress(this_$iv, slot$iv)];
        int slotIndex = slot$iv;
        if ((data instanceof ComposeNodeLifecycleCallback) == false) goto L8;
        int endRelativeOrder = $this$deactivateCurrentGroup.getSlotsSize() - slotIndex;
        rememberManager.deactivating((ComposeNodeLifecycleCallback) data, endRelativeOrder, -1, -1);
        group$iv = group$iv;
        SlotWriter this_$iv2 = this_$iv;
        int $i$f$forAllData2 = $i$f$forAllData;
    L22:
        slot$iv = slot$iv + 1;
        group$iv = group$iv;
        this_$iv = this_$iv2;
        $i$f$forAllData = $i$f$forAllData2;
        goto L3
    L8:
        if ((data instanceof RememberObserverHolder) == false) goto L19;
        RememberObserver wrapped = ((RememberObserverHolder) data).getWrapped();
        if ((wrapped instanceof ReusableRememberObserver) == true) goto L18;
        removeData($this$deactivateCurrentGroup, slotIndex, data);
        int endRelativeOrder2 = $this$deactivateCurrentGroup.getSlotsSize() - slotIndex;
        Anchor anchor$iv = ((RememberObserverHolder) data).getAfter();
        int priority$iv = -1;
        int endRelativeAfter$iv = -1;
        if (anchor$iv == null) goto L17;
        if (anchor$iv.getValid() == false) goto L17;
        int priority$iv2 = $this$deactivateCurrentGroup.anchorIndex(anchor$iv);
        int priority$iv3 = $this$deactivateCurrentGroup.getSlotsSize();
        endRelativeAfter$iv = priority$iv3 - $this$deactivateCurrentGroup.slotsEndAllIndex$runtime_release(priority$iv2);
        priority$iv = priority$iv2;
    L17:
        int endRelativeAfter = endRelativeAfter$iv;
        this_$iv2 = this_$iv;
        RememberObserverHolder r3 = (RememberObserverHolder) data;
        $i$f$forAllData2 = $i$f$forAllData;
        rememberManager.forgetting(r3, endRelativeOrder2, priority$iv, endRelativeAfter);
        goto L22
    L18:
        group$iv = group$iv;
        this_$iv2 = this_$iv;
        $i$f$forAllData2 = $i$f$forAllData;
        goto L22
    L19:
        group$iv = group$iv;
        this_$iv2 = this_$iv;
        $i$f$forAllData2 = $i$f$forAllData;
        if ((data instanceof RecomposeScopeImpl) == false) goto L22;
        removeData($this$deactivateCurrentGroup, slotIndex, data);
        ((RecomposeScopeImpl) data).release();
        goto L22
    }

    private static final void removeData(SlotWriter $this$removeData, int index, Object data) {
        Object result = $this$removeData.clear(index);
        if (data != result) goto L5;
        boolean value$iv = true;
    L7:
        if (value$iv == true) goto L11;
        composeImmediateRuntimeError("Slot table is out of sync (expected " + data + ", got " + result + ')');
        return;
    L11:
        return;
    L5:
        value$iv = false;
        goto L7
    }

    private static final <K, V> MutableScatterMap<Object, Object> multiMap(int initialCapacity) {
        return MultiValueMap.m3886constructorimpl(new MutableScatterMap(initialCapacity));
    }

    private static final Object getKey(Object value, Object left, Object right) {
        if ((value instanceof JoinedKey) == false) goto L5;
        JoinedKey it = (JoinedKey) value;
    L6:
        if (it != null) goto L8;
        return null;
    L8:
        if (Intrinsics.areEqual(it.getLeft(), left) == true) goto L10;
    L12:
        Object r2 = getKey(it.getLeft(), left, right);
        if (r2 != null) goto L17;
        r2 = getKey(it.getRight(), left, right);
    L17:
        return r2;
    L10:
        if (Intrinsics.areEqual(it.getRight(), right) == false) goto L12;
        return value;
    L5:
        it = null;
        goto L6
    }

    private static final int findLocation(List<Invalidation> r5, int location) {
        int low = 0;
        int high = r5.size() - 1;
    L3:
        if (low > high) goto L11;
        int mid = (low + high) >>> 1;
        Invalidation midVal = r5.get(mid);
        int cmp = Intrinsics.compare(midVal.getLocation(), location);
        if (cmp < 0) goto L6;
        if (cmp <= 0) goto L9;
        high = mid - 1;
        goto L3
    L9:
        return mid;
    L6:
        low = mid + 1;
        goto L3
    L11:
        return -(low + 1);
    }

    private static final int findInsertLocation(List<Invalidation> r3, int location) {
        int it = findLocation(r3, location);
        if (it < 0) goto L5;
        return it;
    L5:
        return -(it + 1);
    }

    private static final void insertIfMissing(List<Invalidation> r5, int location, RecomposeScopeImpl scope, Object instance) {
        int index = findLocation(r5, location);
        Object r1 = null;
        if (index >= 0) goto L8;
        int r2 = -(index + 1);
        if ((instance instanceof DerivedState) == false) goto L7;
        r1 = instance;
    L7:
        r5.add(r2, new Invalidation(scope, location, r1));
        return;
    L8:
        Invalidation invalidation = r5.get(index);
        if ((instance instanceof DerivedState) == false) goto L17;
        Object oldInstance = invalidation.getInstances();
        if (oldInstance != null) goto L14;
        invalidation.setInstances(instance);
        return;
    L14:
        if ((oldInstance instanceof MutableScatterSet) == false) goto L16;
        MutableScatterSet r3 = (MutableScatterSet) oldInstance;
        ((MutableScatterSet) oldInstance).add(instance);
        return;
    L16:
        invalidation.setInstances(ScatterSetKt.mutableScatterSetOf(oldInstance, instance));
        return;
    L17:
        invalidation.setInstances(null);
    }

    private static final Invalidation firstInRange(List<Invalidation> r3, int start, int end) {
        int index = findInsertLocation(r3, start);
        if (index >= r3.size()) goto L7;
        Invalidation firstInvalidation = r3.get(index);
        if (firstInvalidation.getLocation() >= end) goto L9;
        return firstInvalidation;
    L9:
        return null;
    L7:
        return null;
    }

    private static final Invalidation removeLocation(List<Invalidation> r2, int location) {
        int index = findLocation(r2, location);
        if (index >= 0) goto L7;
        return null;
    L7:
        return r2.remove(index);
    }

    private static final void removeRange(List<Invalidation> r3, int start, int end) {
        int index = findInsertLocation(r3, start);
    L4:
        if (index >= r3.size()) goto L8;
        Invalidation validation = r3.get(index);
        if (validation.getLocation() >= end) goto L11;
        r3.remove(index);
        goto L4
    L11:
        return;
    }

    private static final List<Invalidation> filterToRange(List<Invalidation> r4, int start, int end) {
        List result = new ArrayList();
        int index = findInsertLocation(r4, start);
    L4:
        if (index >= r4.size()) goto L8;
        Invalidation invalidation = r4.get(index);
        if (invalidation.getLocation() >= end) goto L8;
        result.add(invalidation);
        index = index + 1;
    L8:
        return result;
    }

    private static final int asInt(boolean r0) {
        return r0 ? 1 : 0;
    }

    private static final boolean asBool(int $this$asBool) {
        if ($this$asBool == 0) goto L4;
        return true;
    L4:
        return false;
    }

    private static final List<Object> collectNodesFrom(SlotTable $this$collectNodesFrom, Anchor anchor) {
        List result = new ArrayList();
        SlotReader reader$iv = $this$collectNodesFrom.openReader();
        int index = $this$collectNodesFrom.anchorIndex(anchor);     // Catch: Throwable -> L6
        collectNodesFrom$lambda$10$collectFromGroup(reader$iv, result, index);     // Catch: Throwable -> L6
        Unit r5 = Unit.INSTANCE;     // Catch: Throwable -> L6
        reader$iv.close();
        return result;
    L6:
        th = move-exception;
        reader$iv.close();
        throw th;
    }

    private static final void collectNodesFrom$lambda$10$collectFromGroup(SlotReader $reader, List<Object> r4, int group) {
        if ($reader.isNode(group) == false) goto L5;
        r4.add($reader.node(group));
        return;
    L5:
        int current = group + 1;
        int end = $reader.groupSize(group) + group;
    L6:
        if (current >= end) goto L10;
        collectNodesFrom$lambda$10$collectFromGroup($reader, r4, current);
        current = current + $reader.groupSize(current);
        goto L6
    }

    private static final int distanceFrom(SlotReader $this$distanceFrom, int index, int root) {
        int count = 0;
        int current = index;
    L3:
        if (current <= 0) goto L6;
        if (current == root) goto L6;
        current = $this$distanceFrom.parent(current);
        count = count + 1;
    L6:
        return count;
    }

    private static final int nearestCommonRootOf(SlotReader $this$nearestCommonRootOf, int a, int b, int common) {
        if (a != b) goto L4;
        return a;
    L4:
        if (a == common) goto L26;
        if (b == common) goto L26;
        if ($this$nearestCommonRootOf.parent(a) != b) goto L11;
        return b;
    L11:
        if ($this$nearestCommonRootOf.parent(b) != a) goto L14;
        return a;
    L14:
        if ($this$nearestCommonRootOf.parent(a) == $this$nearestCommonRootOf.parent(b)) goto L16;
        int currentA = a;
        int currentB = b;
        int aDistance = distanceFrom($this$nearestCommonRootOf, a, common);
        int bDistance = distanceFrom($this$nearestCommonRootOf, b, common);
        int r4 = aDistance - bDistance;
        int r5 = 0;
        int r6 = 0;
    L18:
        if (r6 >= r4) goto L20;
        currentA = $this$nearestCommonRootOf.parent(currentA);
        r6 = r6 + 1;
        goto L18
    L20:
        int r7 = bDistance - aDistance;
    L21:
        if (r5 >= r7) goto L23;
        currentB = $this$nearestCommonRootOf.parent(currentB);
        r5 = r5 + 1;
    L23:
        if (currentA == currentB) goto L25;
        currentA = $this$nearestCommonRootOf.parent(currentA);
        currentB = $this$nearestCommonRootOf.parent(currentB);
        goto L23
    L25:
        return currentA;
    L16:
        return $this$nearestCommonRootOf.parent(a);
    L26:
        return common;
    }

    private static final Object getJoinedKey(KeyInfo $this$joinedKey) {
        if ($this$joinedKey.getObjectKey() == null) goto L6;
        return new JoinedKey(Integer.valueOf($this$joinedKey.getKey()), $this$joinedKey.getObjectKey());
    L6:
        return Integer.valueOf($this$joinedKey.getKey());
    }

    static {
        invocation = new OpaqueKey("provider");
        provider = new OpaqueKey("provider");
        compositionLocalMap = new OpaqueKey("compositionLocalMap");
        providerValues = new OpaqueKey("providerValues");
        providerMaps = new OpaqueKey("providers");
        reference = new OpaqueKey("reference");
        InvalidationLocationAscending = new ComposerKt$$ExternalSyntheticLambda0();
    }

    public static final Object getInvocation() {
        return invocation;
    }

    public static final Object getProvider() {
        return provider;
    }

    public static final Object getCompositionLocalMap() {
        return compositionLocalMap;
    }

    public static final Object getProviderValues() {
        return providerValues;
    }

    public static final Object getProviderMaps() {
        return providerMaps;
    }

    public static final Object getReference() {
        return reference;
    }

    public static final void runtimeCheck(boolean value, Function0<String> r3) {
        if (value == true) goto L6;
        composeImmediateRuntimeError(r3.invoke());
        return;
    }

    public static final void debugRuntimeCheck(boolean value, Function0<String> r2) {
    }

    public static final void debugRuntimeCheck(boolean value) {
    }

    public static final void runtimeCheck(boolean value) {
        if (value == true) goto L7;
        composeImmediateRuntimeError("Check failed");
        return;
    }

    public static final Void composeRuntimeError(String message) {
        throw new ComposeRuntimeError("Compose Runtime internal error. Unexpected or incorrect use of the Compose internal runtime API (" + message + "). Please report to Google or use https://goo.gle/compose-feedback");
    }

    public static final void composeImmediateRuntimeError(String message) {
        throw new ComposeRuntimeError("Compose Runtime internal error. Unexpected or incorrect use of the Compose internal runtime API (" + message + "). Please report to Google or use https://goo.gle/compose-feedback");
    }

    static final int InvalidationLocationAscending$lambda$16(Invalidation i1, Invalidation i2) {
        return Intrinsics.compare(i1.getLocation(), i2.getLocation());
    }

    public static final MovableContentState extractMovableContentAtCurrent(final ControlledComposition composition, final MovableContentStateReference reference2, SlotWriter slots, Applier<?> r19) {
        SlotTable slotTable = new SlotTable();
        if (slots.getCollectingSourceInformation() == false) goto L6;
        slotTable.collectSourceInformation();
    L6:
        if (slots.getCollectingCalledInformation() == false) goto L8;
        slotTable.collectCalledByInformation();
    L8:
        int currentGroup = slots.getCurrentGroup();
        if (r19 != null) goto L11;
    L35:
        SlotWriter writer$iv = slotTable.openWriter();
        writer$iv.beginInsert();     // Catch: Throwable -> L47
        writer$iv.startGroup(MovableContentKt.movableContentKey, reference2.getContent$runtime_release());     // Catch: Throwable -> L47
        SlotWriter.markGroup$default(writer$iv, 0, 1, null);     // Catch: Throwable -> L47
        writer$iv.update(reference2.getParameter$runtime_release());     // Catch: Throwable -> L47
        List<Anchor> r0 = slots.moveTo(reference2.getAnchor$runtime_release(), 1, writer$iv);     // Catch: Throwable -> L47
        writer$iv.skipGroup();     // Catch: Throwable -> L47
        writer$iv.endGroup();     // Catch: Throwable -> L47
        writer$iv.endInsert();     // Catch: Throwable -> L47
        writer$iv.close(true);
        MovableContentState state = new MovableContentState(slotTable);
        if (RecomposeScopeImpl.Companion.hasAnchoredRecomposeScopes$runtime_release(slotTable, r0) == false) goto L46;
        RecomposeScopeOwner r1 = new ComposerKt$extractMovableContentAtCurrent$movableContentRecomposeScopeOwner$1(composition, reference2);
        SlotWriter writer$iv2 = slotTable.openWriter();
        RecomposeScopeImpl.Companion.adoptAnchoredScopes$runtime_release(writer$iv2, r0, r1);     // Catch: Throwable -> L42
        Unit r2 = Unit.INSTANCE;     // Catch: Throwable -> L42
        writer$iv2.close(true);
    L42:
        th = move-exception;
        writer$iv2.close(false);
        throw th;
    L46:
        return state;
    L47:
        th = move-exception;
        writer$iv.close(false);
        throw th;
    L11:
        if (slots.nodeCount(currentGroup) <= 0) goto L35;
        int parentNodeGroup = slots.getParent();
    L13:
        if (parentNodeGroup <= 0) goto L17;
        if (slots.isNode(parentNodeGroup) == true) goto L17;
        parentNodeGroup = slots.parent(parentNodeGroup);
    L17:
        if (parentNodeGroup < 0) goto L35;
        if (slots.isNode(parentNodeGroup) == false) goto L35;
        Object node = slots.node(parentNodeGroup);
        int currentChild = parentNodeGroup + 1;
        int end = slots.groupSize(parentNodeGroup) + parentNodeGroup;
        int nodeIndex = 0;
    L21:
        if (currentChild >= end) goto L31;
        int size = slots.groupSize(currentChild);
        if ((currentChild + size) > currentGroup) goto L31;
        if (slots.isNode(currentChild) == false) goto L28;
        int r11 = 1;
    L29:
        nodeIndex = nodeIndex + r11;
        currentChild = currentChild + size;
        goto L21
    L28:
        r11 = slots.nodeCount(currentChild);
    L31:
        if (slots.isNode(currentGroup) == false) goto L33;
        int count = 1;
    L34:
        r19.down(node);
        r19.remove(nodeIndex, count);
        r19.up();
        goto L35
    L33:
        count = slots.nodeCount(currentGroup);
        goto L34
    }
}
