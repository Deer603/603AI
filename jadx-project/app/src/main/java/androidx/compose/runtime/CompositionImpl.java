package androidx.compose.runtime;

import androidx.autofill.HintConstants;
import androidx.collection.MutableScatterMap;
import androidx.collection.MutableScatterSet;
import androidx.collection.ObjectIntMap;
import androidx.collection.ScatterMap;
import androidx.collection.ScatterSet;
import androidx.compose.animation.core.MutatorMutex$$ExternalSyntheticBackportWithForwarding0;
import androidx.compose.runtime.changelist.ChangeList;
import androidx.compose.runtime.collection.ScatterSetWrapper;
import androidx.compose.runtime.collection.ScopeMap;
import androidx.compose.runtime.internal.RememberEventDispatcher;
import androidx.compose.runtime.internal.Trace;
import androidx.compose.runtime.snapshots.ReaderKind;
import androidx.compose.runtime.snapshots.StateObject;
import androidx.compose.runtime.snapshots.StateObjectImpl;
import androidx.compose.runtime.tooling.CompositionObserver;
import androidx.compose.runtime.tooling.CompositionObserverHandle;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Composition.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0084\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001c\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\f\b\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u0005B%\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\n\u0010\b\u001a\u0006\u0012\u0002\b\u00030\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\u0002\u0010\fJ\b\u0010`\u001a\u00020\u001bH\u0016J\u0018\u0010a\u001a\u00020\u001b2\u0006\u0010b\u001a\u00020-2\u0006\u0010c\u001a\u00020\u0014H\u0002J\u001e\u0010a\u001a\u00020\u001b2\f\u0010d\u001a\b\u0012\u0004\u0012\u00020-0,2\u0006\u0010c\u001a\u00020\u0014H\u0002J\b\u0010e\u001a\u00020\u001bH\u0016J\u0010\u0010f\u001a\u00020\u001b2\u0006\u0010\u0017\u001a\u00020\u0018H\u0002J\b\u0010g\u001a\u00020\u001bH\u0016J\b\u0010h\u001a\u00020\u001bH\u0016J\b\u0010i\u001a\u00020\u001bH\u0002J \u0010j\u001a\u00020\u001b2\u0011\u0010k\u001a\r\u0012\u0004\u0012\u00020\u001b0\u001a¢\u0006\u0002\b\u001cH\u0016¢\u0006\u0002\u0010 J \u0010l\u001a\u00020\u001b2\u0011\u0010k\u001a\r\u0012\u0004\u0012\u00020\u001b0\u001a¢\u0006\u0002\b\u001cH\u0002¢\u0006\u0002\u0010 J\r\u0010m\u001a\u00020<H\u0000¢\u0006\u0002\bnJ\b\u0010o\u001a\u00020\u001bH\u0016J3\u0010p\u001a\u0002Hq\"\u0004\b\u0000\u0010q2\b\u0010r\u001a\u0004\u0018\u00010\u00012\u0006\u0010s\u001a\u00020<2\f\u0010t\u001a\b\u0012\u0004\u0012\u0002Hq0\u001aH\u0016¢\u0006\u0002\u0010uJ\b\u0010v\u001a\u00020\u001bH\u0016J\u0010\u0010w\u001a\u00020\u001b2\u0006\u0010x\u001a\u00020yH\u0016J\b\u0010z\u001a\u00020\u001bH\u0002J\b\u0010{\u001a\u00020\u001bH\u0002J\b\u0010|\u001a\u00020\u001bH\u0002J\u0014\u0010}\u001a\u0004\u0018\u00010Z2\b\u0010Y\u001a\u0004\u0018\u00010ZH\u0016J&\u0010~\u001a\u0004\u0018\u0001H\u007f\"\u0004\b\u0000\u0010\u007f2\u000e\u0010\u0080\u0001\u001a\t\u0012\u0004\u0012\u0002H\u007f0\u0081\u0001H\u0016¢\u0006\u0003\u0010\u0082\u0001J$\u0010\u0083\u0001\u001a\u0002H\u007f\"\u0004\b\u0000\u0010\u007f2\f\u0010t\u001a\b\u0012\u0004\u0012\u0002H\u007f0\u001aH\u0082\b¢\u0006\u0003\u0010\u0084\u0001JH\u0010\u0085\u0001\u001a\u0002H\u007f\"\u0004\b\u0000\u0010\u007f20\u0010t\u001a,\u0012!\u0012\u001f\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020-01¢\u0006\u000e\b\u0087\u0001\u0012\t\b\u0088\u0001\u0012\u0004\b\b(\u0017\u0012\u0004\u0012\u0002H\u007f0\u0086\u0001H\u0082\b¢\u0006\u0003\u0010\u0089\u0001J)\u0010\u008a\u0001\u001a\u00020\u001b2\u001e\u0010\u008b\u0001\u001a\u0019\u0012\u0015\u0012\u0013\u0012\u0005\u0012\u00030\u008d\u0001\u0012\u0007\u0012\u0005\u0018\u00010\u008d\u00010\u008c\u00010%H\u0016J\u001e\u0010\u008e\u0001\u001a\u00030\u008f\u00012\u0007\u0010\u0090\u0001\u001a\u00020&2\t\u0010\u0091\u0001\u001a\u0004\u0018\u00010-H\u0016J\t\u0010\u0092\u0001\u001a\u00020\u001bH\u0016J(\u0010\u0093\u0001\u001a\u00030\u008f\u00012\u0007\u0010\u0090\u0001\u001a\u00020&2\b\u0010\u0094\u0001\u001a\u00030\u0095\u00012\t\u0010\u0091\u0001\u001a\u0004\u0018\u00010-H\u0002J\u0010\u0010\u0096\u0001\u001a\u00020\u001b2\u0007\u0010\u0080\u0001\u001a\u00020<J\u0011\u0010\u0097\u0001\u001a\u00020\u001b2\u0006\u0010b\u001a\u00020-H\u0002J\u001a\u0010\u0098\u0001\u001a\u00030\u0099\u00012\b\u0010\u009a\u0001\u001a\u00030\u009b\u0001H\u0000¢\u0006\u0003\b\u009c\u0001J\f\u0010\u009a\u0001\u001a\u0005\u0018\u00010\u009b\u0001H\u0002J\u0017\u0010\u009d\u0001\u001a\u00020\u00142\f\u0010d\u001a\b\u0012\u0004\u0012\u00020-0,H\u0016J\u000f\u0010\u009e\u0001\u001a\u00020\u001bH\u0000¢\u0006\u0003\b\u009f\u0001J\u0017\u0010 \u0001\u001a\u00020\u001b2\f\u0010t\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001aH\u0016J\t\u0010¡\u0001\u001a\u00020\u0014H\u0016J\u0012\u0010¢\u0001\u001a\u00020\u001b2\u0007\u0010\u0090\u0001\u001a\u00020&H\u0016J\u0017\u0010£\u0001\u001a\u00020\u001b2\f\u0010d\u001a\b\u0012\u0004\u0012\u00020-0,H\u0016J\u0011\u0010¤\u0001\u001a\u00020\u001b2\u0006\u0010b\u001a\u00020-H\u0016J\u0011\u0010¥\u0001\u001a\u00020\u001b2\u0006\u0010b\u001a\u00020-H\u0016J\u001b\u0010¦\u0001\u001a\u00020\u001b2\n\u0010x\u001a\u0006\u0012\u0002\b\u000302H\u0000¢\u0006\u0003\b§\u0001J!\u0010¨\u0001\u001a\u00020\u001b2\u0007\u0010\u0091\u0001\u001a\u00020-2\u0007\u0010\u0090\u0001\u001a\u00020&H\u0000¢\u0006\u0003\b©\u0001J!\u0010ª\u0001\u001a\u00020\u001b2\u0011\u0010k\u001a\r\u0012\u0004\u0012\u00020\u001b0\u001a¢\u0006\u0002\b\u001cH\u0016¢\u0006\u0002\u0010 J!\u0010«\u0001\u001a\u00020\u001b2\u0011\u0010k\u001a\r\u0012\u0004\u0012\u00020\u001b0\u001a¢\u0006\u0002\b\u001cH\u0016¢\u0006\u0002\u0010 J#\u0010¬\u0001\u001a\u00030\u00ad\u00012\u0011\u0010k\u001a\r\u0012\u0004\u0012\u00020\u001b0\u001a¢\u0006\u0002\b\u001cH\u0016¢\u0006\u0003\u0010®\u0001J#\u0010¯\u0001\u001a\u00030\u00ad\u00012\u0011\u0010k\u001a\r\u0012\u0004\u0012\u00020\u001b0\u001a¢\u0006\u0002\b\u001cH\u0016¢\u0006\u0003\u0010®\u0001J$\u0010°\u0001\u001a\u000e\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020-01H\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0006\b±\u0001\u0010²\u0001J$\u0010³\u0001\u001a\u0002H\u007f\"\u0004\b\u0000\u0010\u007f2\f\u0010t\u001a\b\u0012\u0004\u0012\u0002H\u007f0\u001aH\u0082\b¢\u0006\u0003\u0010\u0084\u0001J\u001d\u0010´\u0001\u001a\u00020\u00142\u0007\u0010\u0090\u0001\u001a\u00020&2\t\u0010\u0091\u0001\u001a\u0004\u0018\u00010-H\u0002J\u000f\u0010µ\u0001\u001a\u00020\u001bH\u0000¢\u0006\u0003\b¶\u0001J\u0011\u0010·\u0001\u001a\u00020\u001b2\u0006\u0010[\u001a\u00020\\H\u0002J\t\u0010¸\u0001\u001a\u00020\u001bH\u0016R\u0010\u0010\r\u001a\u0004\u0018\u00010\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fX\u0082\u0004¢\u0006\b\n\u0000\u0012\u0004\b\u0011\u0010\u0012R\u0012\u0010\b\u001a\u0006\u0012\u0002\b\u00030\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0013\u001a\u00020\u00148BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R\u000e\u0010\u0017\u001a\u00020\u0018X\u0082\u0004¢\u0006\u0002\n\u0000R'\u0010\u0019\u001a\r\u0012\u0004\u0012\u00020\u001b0\u001a¢\u0006\u0002\b\u001cX\u0086\u000e¢\u0006\u0010\n\u0002\u0010!\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\u000e\u0010\"\u001a\u00020#X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010$\u001a\b\u0012\u0004\u0012\u00020&0%8AX\u0080\u0004¢\u0006\u0006\u001a\u0004\b'\u0010(R\u0014\u0010)\u001a\b\u0012\u0004\u0012\u00020&0*X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010+\u001a\b\u0012\u0004\u0012\u00020-0,8AX\u0080\u0004¢\u0006\u0006\u001a\u0004\b.\u0010/R&\u00100\u001a\u0012\u0012\u0004\u0012\u00020-\u0012\b\u0012\u0006\u0012\u0002\b\u00030201X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\n\u0002\u00103R\u000e\u00104\u001a\u00020\u0014X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u00105\u001a\u00020\u00148VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b6\u0010\u0016R\u0014\u00107\u001a\u00020\u00148VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b8\u0010\u0016R\u0014\u00109\u001a\b\u0012\u0004\u0012\u00020&0*X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010:\u001a\u0004\u0018\u00010\u0000X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010;\u001a\u00020<X\u0082\u000e¢\u0006\u0002\n\u0000R\"\u0010=\u001a\u000e\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020-01X\u0082\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\n\u0002\u00103R\u0014\u0010>\u001a\u00020\u00148VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b>\u0010\u0016R\u0014\u0010?\u001a\u00020\u00148VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b?\u0010\u0016R\u0011\u0010@\u001a\u00020\u0014¢\u0006\b\n\u0000\u001a\u0004\b@\u0010\u0016R\u000e\u0010A\u001a\u00020\u0018X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010B\u001a\u00020-X\u0082\u0004¢\u0006\u0002\n\u0000R\"\u0010C\u001a\u000e\u0012\u0004\u0012\u00020-\u0012\u0004\u0012\u00020&01X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\n\u0002\u00103R\"\u0010D\u001a\u000e\u0012\u0004\u0012\u00020-\u0012\u0004\u0012\u00020&01X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\n\u0002\u00103R\u001a\u0010E\u001a\b\u0012\u0004\u0012\u00020-0,8AX\u0080\u0004¢\u0006\u0006\u001a\u0004\bF\u0010/R\u0014\u0010G\u001a\u00020HX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\bI\u0010JR\u0013\u0010\u0006\u001a\u00020\u00078\u0007¢\u0006\b\n\u0000\u001a\u0004\bK\u0010LR \u0010M\u001a\u00020\u0014X\u0080\u000e¢\u0006\u0014\n\u0000\u0012\u0004\bN\u0010\u0012\u001a\u0004\bO\u0010\u0016\"\u0004\bP\u0010QR\"\u0010R\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u00010-0Sj\n\u0012\u0006\u0012\u0004\u0018\u00010-`TX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010U\u001a\u0004\u0018\u00010VX\u0082\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\n\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\bW\u0010XR\u0010\u0010Y\u001a\u0004\u0018\u00010ZX\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010[\u001a\u00020\\X\u0080\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b]\u0010\u0012\u001a\u0004\b^\u0010_\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006¹\u0001"}, d2 = {"Landroidx/compose/runtime/CompositionImpl;", "Landroidx/compose/runtime/ControlledComposition;", "Landroidx/compose/runtime/ReusableComposition;", "Landroidx/compose/runtime/RecomposeScopeOwner;", "Landroidx/compose/runtime/CompositionServices;", "Landroidx/compose/runtime/PausableComposition;", "parent", "Landroidx/compose/runtime/CompositionContext;", "applier", "Landroidx/compose/runtime/Applier;", "recomposeContext", "Lkotlin/coroutines/CoroutineContext;", "(Landroidx/compose/runtime/CompositionContext;Landroidx/compose/runtime/Applier;Lkotlin/coroutines/CoroutineContext;)V", "_recomposeContext", "abandonSet", "", "Landroidx/compose/runtime/RememberObserver;", "getAbandonSet$annotations", "()V", "areChildrenComposing", "", "getAreChildrenComposing", "()Z", "changes", "Landroidx/compose/runtime/changelist/ChangeList;", "composable", "Lkotlin/Function0;", "", "Landroidx/compose/runtime/Composable;", "getComposable", "()Lkotlin/jvm/functions/Function2;", "setComposable", "(Lkotlin/jvm/functions/Function2;)V", "Lkotlin/jvm/functions/Function2;", "composer", "Landroidx/compose/runtime/ComposerImpl;", "conditionalScopes", "", "Landroidx/compose/runtime/RecomposeScopeImpl;", "getConditionalScopes$runtime_release", "()Ljava/util/List;", "conditionallyInvalidatedScopes", "Landroidx/collection/MutableScatterSet;", "derivedStateDependencies", "", "", "getDerivedStateDependencies$runtime_release", "()Ljava/util/Set;", "derivedStates", "Landroidx/compose/runtime/collection/ScopeMap;", "Landroidx/compose/runtime/DerivedState;", "Landroidx/collection/MutableScatterMap;", "disposed", "hasInvalidations", "getHasInvalidations", "hasPendingChanges", "getHasPendingChanges", "invalidatedScopes", "invalidationDelegate", "invalidationDelegateGroup", "", "invalidations", "isComposing", "isDisposed", "isRoot", "lateChanges", "lock", "observations", "observationsProcessed", "observedObjects", "getObservedObjects$runtime_release", "observerHolder", "Landroidx/compose/runtime/CompositionObserverHolder;", "getObserverHolder$runtime_release", "()Landroidx/compose/runtime/CompositionObserverHolder;", "getParent", "()Landroidx/compose/runtime/CompositionContext;", "pendingInvalidScopes", "getPendingInvalidScopes$runtime_release$annotations", "getPendingInvalidScopes$runtime_release", "setPendingInvalidScopes$runtime_release", "(Z)V", "pendingModifications", "Ljava/util/concurrent/atomic/AtomicReference;", "Landroidx/compose/runtime/internal/AtomicReference;", "pendingPausedComposition", "Landroidx/compose/runtime/PausedCompositionImpl;", "getRecomposeContext", "()Lkotlin/coroutines/CoroutineContext;", "shouldPause", "Landroidx/compose/runtime/ShouldPauseCallback;", "slotTable", "Landroidx/compose/runtime/SlotTable;", "getSlotTable$runtime_release$annotations", "getSlotTable$runtime_release", "()Landroidx/compose/runtime/SlotTable;", "abandonChanges", "addPendingInvalidationsLocked", "value", "forgetConditionalScopes", "values", "applyChanges", "applyChangesInLocked", "applyLateChanges", "changesApplied", "cleanUpDerivedStateObservations", "composeContent", "content", "composeInitial", "composerStacksSizes", "composerStacksSizes$runtime_release", "deactivate", "delegateInvalidations", "R", "to", "groupIndex", "block", "(Landroidx/compose/runtime/ControlledComposition;ILkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "dispose", "disposeUnusedMovableContent", "state", "Landroidx/compose/runtime/MovableContentState;", "drainPendingModificationsForCompositionLocked", "drainPendingModificationsLocked", "drainPendingModificationsOutOfBandLocked", "getAndSetShouldPauseCallback", "getCompositionService", "T", "key", "Landroidx/compose/runtime/CompositionServiceKey;", "(Landroidx/compose/runtime/CompositionServiceKey;)Ljava/lang/Object;", "guardChanges", "(Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "guardInvalidationsLocked", "Lkotlin/Function1;", "Lkotlin/ParameterName;", HintConstants.AUTOFILL_HINT_NAME, "(Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "insertMovableContent", "references", "Lkotlin/Pair;", "Landroidx/compose/runtime/MovableContentStateReference;", "invalidate", "Landroidx/compose/runtime/InvalidationResult;", "scope", "instance", "invalidateAll", "invalidateChecked", "anchor", "Landroidx/compose/runtime/Anchor;", "invalidateGroupsWithKey", "invalidateScopeOfLocked", "observe", "Landroidx/compose/runtime/tooling/CompositionObserverHandle;", "observer", "Landroidx/compose/runtime/tooling/CompositionObserver;", "observe$runtime_release", "observesAnyOf", "pausedCompositionFinished", "pausedCompositionFinished$runtime_release", "prepareCompose", "recompose", "recomposeScopeReleased", "recordModificationsOf", "recordReadOf", "recordWriteOf", "removeDerivedStateObservation", "removeDerivedStateObservation$runtime_release", "removeObservation", "removeObservation$runtime_release", "setContent", "setContentWithReuse", "setPausableContent", "Landroidx/compose/runtime/PausedComposition;", "(Lkotlin/jvm/functions/Function2;)Landroidx/compose/runtime/PausedComposition;", "setPausableContentWithReuse", "takeInvalidations", "takeInvalidations-afanTW4", "()Landroidx/collection/MutableScatterMap;", "trackAbandonedValues", "tryImminentInvalidation", "updateMovingInvalidations", "updateMovingInvalidations$runtime_release", "validateRecomposeScopeAnchors", "verifyConsistent", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class CompositionImpl implements ControlledComposition, ReusableComposition, RecomposeScopeOwner, CompositionServices, PausableComposition {
    public static final int $stable = 0;
    private final CoroutineContext _recomposeContext;
    private final Set<RememberObserver> abandonSet;
    private final Applier<?> applier;
    private final ChangeList changes;
    private Function2<? super Composer, ? super Integer, Unit> composable;
    private final ComposerImpl composer;
    private final MutableScatterSet<RecomposeScopeImpl> conditionallyInvalidatedScopes;
    private final MutableScatterMap<Object, Object> derivedStates;
    private boolean disposed;
    private final MutableScatterSet<RecomposeScopeImpl> invalidatedScopes;
    private CompositionImpl invalidationDelegate;
    private int invalidationDelegateGroup;
    private MutableScatterMap<Object, Object> invalidations;
    private final boolean isRoot;
    private final ChangeList lateChanges;
    private final Object lock;
    private final MutableScatterMap<Object, Object> observations;
    private final MutableScatterMap<Object, Object> observationsProcessed;
    private final CompositionObserverHolder observerHolder;
    private final CompositionContext parent;
    private boolean pendingInvalidScopes;
    private final AtomicReference<Object> pendingModifications;
    private PausedCompositionImpl pendingPausedComposition;
    private ShouldPauseCallback shouldPause;
    private final SlotTable slotTable;

    static {
        $stable = 8;
    }

    private static /* synthetic */ void getAbandonSet$annotations() {
    }

    public static /* synthetic */ void getPendingInvalidScopes$runtime_release$annotations() {
    }

    public static /* synthetic */ void getSlotTable$runtime_release$annotations() {
    }

    public CompositionImpl(CompositionContext parent, Applier<?> r14, CoroutineContext recomposeContext) {
        this.parent = parent;
        this.applier = r14;
        this.pendingModifications = new AtomicReference(null);
        this.lock = new Object();
        this.abandonSet = new MutableScatterSet(0, 1, null).asMutableSet();
        SlotTable it = new SlotTable();
        if (this.parent.getCollectingCallByInformation$runtime_release() == false) goto L6;
        it.collectCalledByInformation();
    L6:
        if (this.parent.getCollectingSourceInformation$runtime_release() == false) goto L8;
        it.collectSourceInformation();
    L8:
        this.slotTable = it;
        this.observations = ScopeMap.m3908constructorimpl$default(null, 1, null);
        this.invalidatedScopes = new MutableScatterSet(0, 1, null);
        this.conditionallyInvalidatedScopes = new MutableScatterSet(0, 1, null);
        this.derivedStates = ScopeMap.m3908constructorimpl$default(null, 1, null);
        this.changes = new ChangeList();
        this.lateChanges = new ChangeList();
        this.observationsProcessed = ScopeMap.m3908constructorimpl$default(null, 1, null);
        this.invalidations = ScopeMap.m3908constructorimpl$default(null, 1, null);
        this.observerHolder = new CompositionObserverHolder(null, false, 3, null);
        ComposerImpl it2 = new ComposerImpl(this.applier, this.parent, this.slotTable, this.abandonSet, this.changes, this.lateChanges, this);
        this.parent.registerComposer$runtime_release(it2);
        this.composer = it2;
        this._recomposeContext = recomposeContext;
        this.isRoot = this.parent instanceof Recomposer;
        this.composable = ComposableSingletons$CompositionKt.INSTANCE.m3744getLambda1$runtime_release();
    }

    public static final /* synthetic */ Object access$getLock$p(CompositionImpl $this) {
        return $this.lock;
    }

    public static final /* synthetic */ MutableScatterMap access$getObservations$p(CompositionImpl $this) {
        return $this.observations;
    }

    public /* synthetic */ CompositionImpl(CompositionContext r1, Applier r2, CoroutineContext r3, int r4, DefaultConstructorMarker r5) {
        if ((r4 & 4) == 0) goto L5;
        r3 = null;
    L5:
        this(r1, r2, r3);
    }

    public final CompositionContext getParent() {
        return this.parent;
    }

    public final SlotTable getSlotTable$runtime_release() {
        return this.slotTable;
    }

    public final Set<Object> getObservedObjects$runtime_release() {
        return this.observations.asMap().keySet();
    }

    public final Set<Object> getDerivedStateDependencies$runtime_release() {
        return this.derivedStates.asMap().keySet();
    }

    public final List<RecomposeScopeImpl> getConditionalScopes$runtime_release() {
        return CollectionsKt.toList(this.conditionallyInvalidatedScopes.asSet());
    }

    public final boolean getPendingInvalidScopes$runtime_release() {
        return this.pendingInvalidScopes;
    }

    public final void setPendingInvalidScopes$runtime_release(boolean r1) {
        this.pendingInvalidScopes = r1;
    }

    public final CompositionObserverHolder getObserverHolder$runtime_release() {
        return this.observerHolder;
    }

    public final CoroutineContext getRecomposeContext() {
        CoroutineContext r0 = this._recomposeContext;
        if (r0 == null) goto L5;
        return r0;
    L5:
        return this.parent.getRecomposeCoroutineContext$runtime_release();
    }

    public final boolean isRoot() {
        return this.isRoot;
    }

    private final boolean getAreChildrenComposing() {
        return this.composer.getAreChildrenComposing$runtime_release();
    }

    public final Function2<Composer, Integer, Unit> getComposable() {
        return this.composable;
    }

    public final void setComposable(Function2<? super Composer, ? super Integer, Unit> r1) {
        this.composable = r1;
    }

    @Override // androidx.compose.runtime.ControlledComposition
    public boolean isComposing() {
        return this.composer.isComposing$runtime_release();
    }

    @Override // androidx.compose.runtime.Composition
    public boolean isDisposed() {
        return this.disposed;
    }

    @Override // androidx.compose.runtime.ControlledComposition
    public boolean getHasPendingChanges() {
        Object lock$iv = this.lock;
        monitor-enter(lock$iv);
        boolean r3 = this.composer.getHasPendingChanges$runtime_release();     // Catch: Throwable -> L8
        monitor-exit(lock$iv);
        return r3;
    L8:
        th = move-exception;
        throw th;
    }

    @Override // androidx.compose.runtime.Composition
    public void setContent(Function2<? super Composer, ? super Integer, Unit> r4) {
        if (this.pendingPausedComposition != null) goto L5;
        boolean value$iv = true;
    L7:
        if (value$iv == true) goto L9;
        PreconditionsKt.throwIllegalStateException("A pausable composition is in progress");
    L9:
        composeInitial(r4);
        return;
    L5:
        value$iv = false;
        goto L7
    }

    @Override // androidx.compose.runtime.ReusableComposition
    public void setContentWithReuse(Function2<? super Composer, ? super Integer, Unit> r4) {
        if (this.pendingPausedComposition != null) goto L5;
        boolean value$iv = true;
    L7:
        if (value$iv == true) goto L9;
        PreconditionsKt.throwIllegalStateException("A pausable composition is in progress");
    L9:
        this.composer.startReuseFromRoot();
        composeInitial(r4);
        this.composer.endReuseFromRoot();
        return;
    L5:
        value$iv = false;
        goto L7
    }

    @Override // androidx.compose.runtime.PausableComposition
    public PausedComposition setPausableContent(Function2<? super Composer, ? super Integer, Unit> r13) {
        boolean value$iv = true;
        boolean value$iv2 = !this.disposed;
        if (value$iv2 == true) goto L6;
        PreconditionsKt.throwIllegalStateException("The composition is disposed");
    L6:
        if (this.pendingPausedComposition == null) goto L10;
        value$iv = false;
    L10:
        if (value$iv == true) goto L12;
        PreconditionsKt.throwIllegalStateException("A pausable composition is in progress");
    L12:
        PausedCompositionImpl pausedComposition = new PausedCompositionImpl(this, this.parent, this.composer, this.abandonSet, r13, false, this.applier, this.lock);
        this.pendingPausedComposition = pausedComposition;
        return pausedComposition;
    }

    @Override // androidx.compose.runtime.PausableComposition
    public PausedComposition setPausableContentWithReuse(Function2<? super Composer, ? super Integer, Unit> r13) {
        boolean value$iv = true;
        boolean value$iv2 = !this.disposed;
        if (value$iv2 == true) goto L6;
        PreconditionsKt.throwIllegalStateException("The composition is disposed");
    L6:
        if (this.pendingPausedComposition == null) goto L10;
        value$iv = false;
    L10:
        if (value$iv == true) goto L12;
        PreconditionsKt.throwIllegalStateException("A pausable composition is in progress");
    L12:
        PausedCompositionImpl pausedComposition = new PausedCompositionImpl(this, this.parent, this.composer, this.abandonSet, r13, true, this.applier, this.lock);
        this.pendingPausedComposition = pausedComposition;
        return pausedComposition;
    }

    public final void pausedCompositionFinished$runtime_release() {
        this.pendingPausedComposition = null;
    }

    private final void composeInitial(Function2<? super Composer, ? super Integer, Unit> r4) {
        boolean value$iv = !this.disposed;
        if (value$iv == true) goto L5;
        PreconditionsKt.throwIllegalStateException("The composition is disposed");
    L5:
        this.composable = r4;
        this.parent.composeInitial$runtime_release(this, this.composable);
    }

    public final CompositionObserverHandle observe$runtime_release(final CompositionObserver observer) {
        Object lock$iv = this.lock;
        monitor-enter(lock$iv);
        this.observerHolder.setObserver(observer);     // Catch: Throwable -> L9
        this.observerHolder.setRoot(true);     // Catch: Throwable -> L9
        Unit r2 = Unit.INSTANCE;     // Catch: Throwable -> L9
        monitor-exit(lock$iv);
        return new CompositionImpl$observe$2(this, observer);
    L9:
        th = move-exception;
        throw th;
    }

    public final void invalidateGroupsWithKey(int key) {
        Object lock$iv = this.lock;
        monitor-enter(lock$iv);
        List<RecomposeScopeImpl> r4 = this.slotTable.invalidateGroupsWithKey$runtime_release(key);     // Catch: Throwable -> L30
        monitor-exit(lock$iv);
        if (r4 == null) goto L23;
        int index$iv$iv = 0;
        int r9 = r4.size();
    L11:
        if (index$iv$iv >= r9) goto L19;
        Object item$iv$iv = r4.get(index$iv$iv);
        RecomposeScopeImpl it = (RecomposeScopeImpl) item$iv$iv;
        if (it.invalidateForResult(null) != InvalidationResult.IGNORED) goto L15;
        boolean r0 = true;
    L16:
        if (r0 == true) goto L17;
        index$iv$iv = index$iv$iv + 1;
        goto L11
    L17:
        boolean r1 = true;
    L20:
        if (r1 == true) goto L23;
        boolean forceComposition = false;
    L25:
        if (forceComposition == true) goto L27;
        return;
    L27:
        if (this.composer.forceRecomposeScopes$runtime_release() == false) goto L43;
        this.parent.invalidate$runtime_release(this);
        return;
    L43:
        return;
    L15:
        r0 = false;
        goto L16
    L19:
        r1 = false;
    L23:
        forceComposition = true;
    L30:
        th = th;
    L34:
        monitor-exit(lock$iv);
        throw th;
    L32:
        th = th;
        goto L34
    }

    private final void drainPendingModificationsForCompositionLocked() {
        Object toRecord = this.pendingModifications.getAndSet(CompositionKt.access$getPendingApplyNoModifications$p());
        if (toRecord != null) goto L5;
        return;
    L5:
        if (Intrinsics.areEqual(toRecord, CompositionKt.access$getPendingApplyNoModifications$p()) == false) goto L7;
        ComposerKt.composeRuntimeError("pending composition has not been applied");
        throw new KotlinNothingValueException();
    L7:
        if ((toRecord instanceof Set) == false) goto L10;
        addPendingInvalidationsLocked((Set) toRecord, true);
        return;
    L10:
        if ((toRecord instanceof Object[]) == false) goto L14;
        Set<? extends Object>[] r1 = (Set[]) toRecord;
        int r3 = r1.length;
        int r4 = 0;
    L12:
        if (r4 >= r3) goto L21;
        addPendingInvalidationsLocked(r1[r4], true);
        r4 = r4 + 1;
        goto L12
    L21:
        return;
    L14:
        ComposerKt.composeRuntimeError("corrupt pendingModifications drain: " + this.pendingModifications);
        throw new KotlinNothingValueException();
    }

    private final void drainPendingModificationsLocked() {
        Object toRecord = this.pendingModifications.getAndSet(null);
        if (Intrinsics.areEqual(toRecord, CompositionKt.access$getPendingApplyNoModifications$p()) == false) goto L5;
        return;
    L5:
        if ((toRecord instanceof Set) == false) goto L8;
        addPendingInvalidationsLocked((Set) toRecord, false);
        return;
    L8:
        if ((toRecord instanceof Object[]) == false) goto L12;
        Set<? extends Object>[] r1 = (Set[]) toRecord;
        int r3 = r1.length;
        int r4 = 0;
    L10:
        if (r4 >= r3) goto L20;
        addPendingInvalidationsLocked(r1[r4], false);
        r4 = r4 + 1;
        goto L10
    L20:
        return;
    L12:
        if (toRecord != null) goto L15;
        ComposerKt.composeRuntimeError("calling recordModificationsOf and applyChanges concurrently is not supported");
        throw new KotlinNothingValueException();
    L15:
        ComposerKt.composeRuntimeError("corrupt pendingModifications drain: " + this.pendingModifications);
        throw new KotlinNothingValueException();
    }

    private final void drainPendingModificationsOutOfBandLocked() {
        Object toRecord = this.pendingModifications.getAndSet(SetsKt.emptySet());
        boolean r2 = true;
        if (Intrinsics.areEqual(toRecord, CompositionKt.access$getPendingApplyNoModifications$p()) == true) goto L8;
        if (toRecord == null) goto L8;
        r2 = false;
    L8:
        if (r2 == false) goto L10;
        return;
    L10:
        if ((toRecord instanceof Set) == false) goto L13;
        addPendingInvalidationsLocked((Set) toRecord, false);
        return;
    L13:
        if ((toRecord instanceof Object[]) == false) goto L17;
        Set<? extends Object>[] r1 = (Set[]) toRecord;
        int r3 = r1.length;
        int r4 = 0;
    L15:
        if (r4 >= r3) goto L22;
        addPendingInvalidationsLocked(r1[r4], false);
        r4 = r4 + 1;
        goto L15
    L22:
        return;
    L17:
        ComposerKt.composeRuntimeError("corrupt pendingModifications drain: " + this.pendingModifications);
        throw new KotlinNothingValueException();
    }

    @Override // androidx.compose.runtime.ControlledComposition
    public void composeContent(Function2<? super Composer, ? super Integer, Unit> r20) {
        Object lock$iv = this.lock;     // Catch: Throwable -> L54
        monitor-enter(lock$iv);     // Catch: Throwable -> L54
        drainPendingModificationsForCompositionLocked();     // Catch: Throwable -> L48
        MutableScatterMap<Object, Object> r0 = m3752takeInvalidationsafanTW4();     // Catch: Throwable -> L48
        CompositionObserver observer = observer();     // Catch: Exception -> L42 Throwable -> L48
        if (observer == null) goto L25;
        CompositionImpl r2 = this;     // Catch: Throwable -> L20 Exception -> L22
    L79:
        Map<RecomposeScope, ? extends Set<? extends Object>> r3 = ScopeMap.m3904asMapimpl(r0);     // Catch: Throwable -> L16 Exception -> L18
    L75:
        Intrinsics.checkNotNull(r3, "null cannot be cast to non-null type kotlin.collections.Map<androidx.compose.runtime.RecomposeScope, kotlin.collections.Set<kotlin.Any>>");     // Catch: Throwable -> L38 Exception -> L40
        observer.onBeginComposition(r2, r3);     // Catch: Throwable -> L38 Exception -> L40
    L40:
        e$iv = e;
    L44:
        this.invalidations = r0;     // Catch: Throwable -> L46
        throw e$iv;     // Catch: Throwable -> L46
    L38:
        e$iv = th;
    L50:
        monitor-exit(lock$iv);     // Catch: Throwable -> L52
        throw e$iv;     // Catch: Throwable -> L52
    L18:
        e$iv = e;
    L16:
        e$iv = th;
    L22:
        e$iv = e;
    L20:
        e$iv = th;
    L25:
    L73:
        this.composer.m3749composeContentZbOJvo$runtime_release(r0, r20, this.shouldPause);     // Catch: Exception -> L36 Throwable -> L46
        if (observer == null) goto L33;
        observer.onEndComposition(this);     // Catch: Exception -> L36 Throwable -> L46
        Unit r4 = Unit.INSTANCE;     // Catch: Exception -> L36 Throwable -> L46
    L33:
        monitor-exit(lock$iv);     // Catch: Throwable -> L52
        return;
    L36:
        e$iv = e;
        goto L44
    L42:
        e$iv = e;
    L46:
        e$iv = th;
    L52:
        th = th;
    L56:
        if (0 == 0) goto L67;
    L61:
        throw th;     // Catch: Exception -> L62
    L62:
        e$iv = move-exception;
        abandonChanges();
        throw e$iv;
    L67:
        if (this.abandonSet.isEmpty() == true) goto L61;
        new RememberEventDispatcher(this.abandonSet).dispatchAbandons();     // Catch: Exception -> L62
    L48:
        e$iv = th;
    L54:
        th = th;
        goto L56
    }

    public final void updateMovingInvalidations$runtime_release() {
        Object lock$iv = this.lock;
        monitor-enter(lock$iv);
        drainPendingModificationsOutOfBandLocked();     // Catch: Throwable -> L14
        MutableScatterMap<Object, Object> r5 = m3752takeInvalidationsafanTW4();     // Catch: Throwable -> L14
        this.composer.m3751updateComposerInvalidationsRY85e9Y(r5);     // Catch: Exception -> L11 Throwable -> L14
        Unit r6 = Unit.INSTANCE;     // Catch: Exception -> L11 Throwable -> L14
        Unit r2 = Unit.INSTANCE;     // Catch: Throwable -> L14
        monitor-exit(lock$iv);
        return;
    L11:
        e$iv = move-exception;
        this.invalidations = r5;     // Catch: Throwable -> L14
        throw e$iv;     // Catch: Throwable -> L14
    L14:
        th = move-exception;
        throw th;
    }

    @Override // androidx.compose.runtime.Composition
    public void dispose() {
        Object lock$iv = this.lock;
        monitor-enter(lock$iv);
        boolean nonEmptySlotTable = true;
        boolean value$iv = !this.composer.isComposing$runtime_release();     // Catch: Throwable -> L36
        if (value$iv == true) goto L8;
        PreconditionsKt.throwIllegalStateException("Composition is disposed while composing. If dispose is triggered by a call in @Composable function, consider wrapping it with SideEffect block.");     // Catch: Throwable -> L36
    L8:
        boolean value$iv2 = this.disposed;     // Catch: Throwable -> L36
        if (value$iv2 == true) goto L32;
        this.disposed = true;     // Catch: Throwable -> L36
        this.composable = ComposableSingletons$CompositionKt.INSTANCE.m3745getLambda2$runtime_release();     // Catch: Throwable -> L36
        ChangeList deferredChanges = this.composer.getDeferredChanges$runtime_release();     // Catch: Throwable -> L36
        if (deferredChanges == null) goto L14;
        applyChangesInLocked(deferredChanges);     // Catch: Throwable -> L36
    L14:
        if (this.slotTable.getGroupsSize() > 0) goto L17;
        nonEmptySlotTable = false;
    L17:
        if (nonEmptySlotTable == false) goto L19;
    L20:
        RememberEventDispatcher manager = new RememberEventDispatcher(this.abandonSet);     // Catch: Throwable -> L36
        if (nonEmptySlotTable == false) goto L30;
        this.applier.onBeginChanges();     // Catch: Throwable -> L36
        SlotTable this_$iv = this.slotTable;     // Catch: Throwable -> L36
        SlotWriter writer$iv = this_$iv.openWriter();     // Catch: Throwable -> L36
        ComposerKt.removeCurrentGroup(writer$iv, manager);     // Catch: Throwable -> L27
        Unit r11 = Unit.INSTANCE;     // Catch: Throwable -> L27
    L26:
        writer$iv.close(true);     // Catch: Throwable -> L36
        this.applier.clear();     // Catch: Throwable -> L36
        this.applier.onEndChanges();     // Catch: Throwable -> L36
        manager.dispatchRememberObservers();     // Catch: Throwable -> L36
    L27:
        th = move-exception;
        writer$iv.close(false);     // Catch: Throwable -> L36
        throw th;     // Catch: Throwable -> L36
    L30:
        manager.dispatchAbandons();     // Catch: Throwable -> L36
    L31:
        this.composer.dispose$runtime_release();     // Catch: Throwable -> L36
        goto L32
    L19:
        if (this.abandonSet.isEmpty() == true) goto L31;
    L32:
        Unit r2 = Unit.INSTANCE;     // Catch: Throwable -> L36
        monitor-exit(lock$iv);
        this.parent.unregisterComposition$runtime_release(this);
        return;
    L36:
        th = move-exception;
        throw th;
    }

    @Override // androidx.compose.runtime.Composition
    public boolean getHasInvalidations() {
        Object lock$iv = this.lock;
        monitor-enter(lock$iv);
        if (ScopeMap.m3913getSizeimpl(this.invalidations) <= 0) goto L8;
        boolean r3 = true;
    L9:
        monitor-exit(lock$iv);
        return r3;
    L8:
        r3 = false;
    L11:
        th = move-exception;
        throw th;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.compose.runtime.ControlledComposition
    public void recordModificationsOf(Set<? extends Object> r6) {
    L2:
        Object r0 = this.pendingModifications.get();
        if (r0 != null) goto L5;
        boolean r2 = true;
    L6:
        if (r2 == false) goto L9;
        Object r3 = r6;
    L15:
        if (MutatorMutex$$ExternalSyntheticBackportWithForwarding0.m(this.pendingModifications, r0, r3) == false) goto L2;
        if (r0 != null) goto L27;
        Object r1 = this.lock;
        monitor-enter(r1);
        drainPendingModificationsLocked();     // Catch: Throwable -> L23
        Unit r4 = Unit.INSTANCE;     // Catch: Throwable -> L23
        monitor-exit(r1);
        return;
    L23:
        th = move-exception;
        throw th;
    L27:
        return;
    L9:
        if ((r0 instanceof Set) == false) goto L12;
        r3 = new Set[]{r0, r6};
        goto L15
    L12:
        if ((r0 instanceof Object[]) == false) goto L29;
        Intrinsics.checkNotNull(r0, "null cannot be cast to non-null type kotlin.Array<kotlin.collections.Set<kotlin.Any>>");
        r3 = ArraysKt.plus((Set[]) r0, r6);
        goto L15
    L29:
        throw new IllegalStateException(("corrupt pendingModifications: " + this.pendingModifications).toString());
    L5:
        r2 = Intrinsics.areEqual(r0, CompositionKt.access$getPendingApplyNoModifications$p());
        goto L6
    }

    @Override // androidx.compose.runtime.ControlledComposition
    public boolean observesAnyOf(Set<? extends Object> r25) {
        Set $this$fastForEach$iv = r25;
        int $i$f$fastForEach = 0;
        if (($this$fastForEach$iv instanceof ScatterSetWrapper) == false) goto L33;
        ScatterSet this_$iv$iv = ((ScatterSetWrapper) $this$fastForEach$iv).getSet$runtime_release();
        Object[] elements$iv$iv = this_$iv$iv.elements;
        long[] m$iv$iv$iv = this_$iv$iv.metadata;
        int lastIndex$iv$iv$iv = m$iv$iv$iv.length - 2;
        int i$iv$iv$iv = 0;
        if (0 > lastIndex$iv$iv$iv) goto L45;
    L6:
        long slot$iv$iv$iv = m$iv$iv$iv[i$iv$iv$iv];
        Set $this$fastForEach$iv2 = $this$fastForEach$iv;
        int $i$f$fastForEach2 = $i$f$fastForEach;
        if (((((~slot$iv$iv$iv) << 7) & slot$iv$iv$iv) & (-9187201950435737472L)) == (-9187201950435737472L)) goto L27;
        int r2 = 8;
        int bitCount$iv$iv$iv = 8 - ((~(i$iv$iv$iv - lastIndex$iv$iv$iv)) >>> 31);
        int j$iv$iv$iv = 0;
    L9:
        if (j$iv$iv$iv >= bitCount$iv$iv$iv) goto L24;
        long value$iv$iv$iv$iv = slot$iv$iv$iv & 255;
        if (value$iv$iv$iv$iv >= 128) goto L13;
        int $i$f$isFull = 1;
    L14:
        if ($i$f$isFull == 0) goto L23;
        int index$iv$iv$iv = (i$iv$iv$iv << 3) + j$iv$iv$iv;
        Object value = elements$iv$iv[index$iv$iv$iv];
        if (ScopeMap.m3909containsimpl(this.observations, value) == true) goto L21;
        if (ScopeMap.m3909containsimpl(this.derivedStates, value) == false) goto L23;
    L21:
        return true;
    L23:
        slot$iv$iv$iv = slot$iv$iv$iv >> r2;
        j$iv$iv$iv = j$iv$iv$iv + 1;
        r2 = r2;
        this_$iv$iv = this_$iv$iv;
        goto L9
    L13:
        $i$f$isFull = 0;
        goto L14
    L24:
        ScatterSet this_$iv$iv2 = this_$iv$iv;
        if (bitCount$iv$iv$iv != r2) goto L57;
    L28:
        if (i$iv$iv$iv == lastIndex$iv$iv$iv) goto L58;
        i$iv$iv$iv = i$iv$iv$iv + 1;
        $this$fastForEach$iv = $this$fastForEach$iv2;
        $i$f$fastForEach = $i$f$fastForEach2;
        this_$iv$iv = this_$iv$iv2;
        goto L6
    L58:
        return false;
    L57:
        return false;
    L27:
        this_$iv$iv2 = this_$iv$iv;
        goto L28
    L45:
        return false;
    L33:
        Set $this$forEach$iv$iv = $this$fastForEach$iv;
        Iterator r3 = $this$forEach$iv$iv.iterator();
    L35:
        if (r3.hasNext() == false) goto L59;
        Object element$iv$iv = r3.next();
        if (ScopeMap.m3909containsimpl(this.observations, element$iv$iv) == true) goto L42;
        if (ScopeMap.m3909containsimpl(this.derivedStates, element$iv$iv) == false) goto L35;
    L42:
        return true;
    L59:
        return false;
    }

    @Override // androidx.compose.runtime.ControlledComposition
    public void prepareCompose(Function0<Unit> r2) {
        this.composer.prepareCompose$runtime_release(r2);
    }

    private final void addPendingInvalidationsLocked(Object value, boolean forgetConditionalScopes) {
        MutableScatterMap<Object, Object> r2 = this.observations;
        int r3 = 0;
        Object value$iv = r2.get(value);
        if (value$iv == null) goto L49;
        if ((value$iv instanceof MutableScatterSet) == false) goto L37;
        ScatterSet this_$iv$iv = (MutableScatterSet) value$iv;
        Object[] elements$iv$iv = this_$iv$iv.elements;
        long[] m$iv$iv$iv = this_$iv$iv.metadata;
        int lastIndex$iv$iv$iv = m$iv$iv$iv.length - 2;
        int i$iv$iv$iv = 0;
        if (0 > lastIndex$iv$iv$iv) goto L58;
    L8:
        long slot$iv$iv$iv = m$iv$iv$iv[i$iv$iv$iv];
        MutableScatterMap<Object, Object> r18 = r2;
        int r19 = r3;
        Object value$iv2 = value$iv;
        ScatterSet this_$iv$iv2 = this_$iv$iv;
        long $this$maskEmptyOrDeleted$iv$iv$iv$iv = (((~slot$iv$iv$iv) << 7) & slot$iv$iv$iv) & (-9187201950435737472L);
        if ($this$maskEmptyOrDeleted$iv$iv$iv$iv == (-9187201950435737472L)) goto L32;
        int r4 = 8;
        int bitCount$iv$iv$iv = 8 - ((~(i$iv$iv$iv - lastIndex$iv$iv$iv)) >>> 31);
        int j$iv$iv$iv = 0;
    L11:
        if (j$iv$iv$iv >= bitCount$iv$iv$iv) goto L31;
        long value$iv$iv$iv$iv = slot$iv$iv$iv & 255;
        if (value$iv$iv$iv$iv >= 128) goto L15;
        boolean r17 = true;
    L16:
        if (r17 == false) goto L28;
        int index$iv$iv$iv = (i$iv$iv$iv << 3) + j$iv$iv$iv;
        int r22 = r4;
        RecomposeScopeImpl scope = (RecomposeScopeImpl) elements$iv$iv[index$iv$iv$iv];
        int j$iv$iv$iv2 = j$iv$iv$iv;
        if (ScopeMap.m3915removeimpl(this.observationsProcessed, value, scope) == true) goto L29;
        if (scope.invalidateForResult(value) == InvalidationResult.IGNORED) goto L29;
        if (scope.isConditional() == false) goto L25;
        if (forgetConditionalScopes == true) goto L25;
        this.conditionallyInvalidatedScopes.add(scope);
    L25:
        this.invalidatedScopes.add(scope);
    L29:
        slot$iv$iv$iv = slot$iv$iv$iv >> r22;
        j$iv$iv$iv = j$iv$iv$iv2 + 1;
        r4 = r22;
        goto L11
    L28:
        r22 = r4;
        j$iv$iv$iv2 = j$iv$iv$iv;
        goto L29
    L15:
        r17 = false;
        goto L16
    L31:
        if (bitCount$iv$iv$iv == r4) goto L32;
        return;
    L32:
        if (i$iv$iv$iv == lastIndex$iv$iv$iv) goto L64;
        i$iv$iv$iv = i$iv$iv$iv + 1;
        value$iv = value$iv2;
        this_$iv$iv = this_$iv$iv2;
        r2 = r18;
        r3 = r19;
        goto L8
    L64:
        return;
    L58:
        return;
    L37:
        RecomposeScopeImpl scope2 = (RecomposeScopeImpl) value$iv;
        if (ScopeMap.m3915removeimpl(this.observationsProcessed, value, scope2) == false) goto L40;
        return;
    L40:
        if (scope2.invalidateForResult(value) != InvalidationResult.IGNORED) goto L42;
        return;
    L42:
        if (scope2.isConditional() == false) goto L45;
        if (forgetConditionalScopes == true) goto L45;
        this.conditionallyInvalidatedScopes.add(scope2);
        return;
    L45:
        this.invalidatedScopes.add(scope2);
        return;
    }

    private final void addPendingInvalidationsLocked(Set<? extends Object> r52, boolean forgetConditionalScopes) {
        Set $this$fastForEach$iv = r52;
        int $i$f$fastForEach = 0;
        if (($this$fastForEach$iv instanceof ScatterSetWrapper) == false) goto L58;
        ScatterSet this_$iv$iv = ((ScatterSetWrapper) $this$fastForEach$iv).getSet$runtime_release();
        long r17 = 128;
        Object[] elements$iv$iv = this_$iv$iv.elements;
        ScatterSet this_$iv$iv$iv = this_$iv$iv;
        long r20 = 255;
        long[] m$iv$iv$iv = this_$iv$iv$iv.metadata;
        int lastIndex$iv$iv$iv = m$iv$iv$iv.length - 2;
        char r22 = 7;
        int i$iv$iv$iv = 0;
        if (0 > lastIndex$iv$iv$iv) goto L55;
    L6:
        long slot$iv$iv$iv = m$iv$iv$iv[i$iv$iv$iv];
        int r13 = 8;
        long r28 = -9187201950435737472L;
        long $this$maskEmptyOrDeleted$iv$iv$iv$iv = (((~slot$iv$iv$iv) << 7) & slot$iv$iv$iv) & (-9187201950435737472L);
        if ($this$maskEmptyOrDeleted$iv$iv$iv$iv == (-9187201950435737472L)) goto L52;
        int bitCount$iv$iv$iv = 8 - ((~(i$iv$iv$iv - lastIndex$iv$iv$iv)) >>> 31);
        int j$iv$iv$iv = 0;
    L9:
        if (j$iv$iv$iv >= bitCount$iv$iv$iv) goto L49;
        long value$iv$iv$iv$iv = slot$iv$iv$iv & 255;
        if (value$iv$iv$iv$iv >= 128) goto L13;
        int $i$f$isFull = 1;
    L14:
        if ($i$f$isFull == 0) goto L47;
        int r27 = r13;
        Object value = elements$iv$iv[(i$iv$iv$iv << 3) + j$iv$iv$iv];
        if ((value instanceof RecomposeScopeImpl) == false) goto L18;
        Set $this$fastForEach$iv2 = $this$fastForEach$iv;
        ((RecomposeScopeImpl) value).invalidateForResult(null);
        int $i$f$fastForEach2 = $i$f$fastForEach;
        ScatterSet this_$iv$iv2 = this_$iv$iv;
        Object[] elements$iv$iv2 = elements$iv$iv;
        ScatterSet this_$iv$iv$iv2 = this_$iv$iv$iv;
    L48:
        r13 = 8;
        slot$iv$iv$iv = slot$iv$iv$iv >> 8;
        j$iv$iv$iv = j$iv$iv$iv + 1;
        $this$fastForEach$iv = $this$fastForEach$iv2;
        $i$f$fastForEach = $i$f$fastForEach2;
        elements$iv$iv = elements$iv$iv2;
        this_$iv$iv$iv = this_$iv$iv$iv2;
        this_$iv$iv = this_$iv$iv2;
        goto L9
    L18:
        $this$fastForEach$iv2 = $this$fastForEach$iv;
        addPendingInvalidationsLocked(value, forgetConditionalScopes);
        int r5 = 0;
        $i$f$fastForEach2 = $i$f$fastForEach;
        Object value$iv = this.derivedStates.get(value);
        if (value$iv != null) goto L21;
        this_$iv$iv2 = this_$iv$iv;
        elements$iv$iv2 = elements$iv$iv;
        this_$iv$iv$iv2 = this_$iv$iv$iv;
        goto L48
    L21:
        if ((value$iv instanceof MutableScatterSet) == false) goto L43;
        ScatterSet this_$iv$iv3 = (MutableScatterSet) value$iv;
        Object[] elements$iv$iv3 = this_$iv$iv3.elements;
        long[] m$iv$iv$iv2 = this_$iv$iv3.metadata;
        int lastIndex$iv$iv$iv2 = m$iv$iv$iv2.length - 2;
        int i$iv$iv$iv2 = 0;
        if (0 > lastIndex$iv$iv$iv2) goto L40;
    L24:
        long slot$iv$iv$iv2 = m$iv$iv$iv2[i$iv$iv$iv2];
        this_$iv$iv2 = this_$iv$iv;
        int r48 = r5;
        elements$iv$iv2 = elements$iv$iv;
        this_$iv$iv$iv2 = this_$iv$iv$iv;
        long $this$maskEmptyOrDeleted$iv$iv$iv$iv2 = (((~slot$iv$iv$iv2) << 7) & slot$iv$iv$iv2) & (-9187201950435737472L);
        if ($this$maskEmptyOrDeleted$iv$iv$iv$iv2 == (-9187201950435737472L)) goto L38;
        int bitCount$iv$iv$iv2 = 8 - ((~(i$iv$iv$iv2 - lastIndex$iv$iv$iv2)) >>> 31);
        int j$iv$iv$iv2 = 0;
    L27:
        if (j$iv$iv$iv2 >= bitCount$iv$iv$iv2) goto L36;
        long value$iv$iv$iv$iv2 = slot$iv$iv$iv2 & 255;
        if (value$iv$iv$iv$iv2 >= 128) goto L31;
        boolean r6 = true;
    L32:
        if (r6 == false) goto L35;
        DerivedState it = (DerivedState) elements$iv$iv3[(i$iv$iv$iv2 << 3) + j$iv$iv$iv2];
        addPendingInvalidationsLocked(it, forgetConditionalScopes);
    L35:
        slot$iv$iv$iv2 = slot$iv$iv$iv2 >> r27;
        j$iv$iv$iv2 = j$iv$iv$iv2 + 1;
        goto L27
    L31:
        r6 = false;
        goto L32
    L36:
        int j$iv$iv$iv3 = r27;
        if (bitCount$iv$iv$iv2 != j$iv$iv$iv3) goto L48;
    L38:
        if (i$iv$iv$iv2 == lastIndex$iv$iv$iv2) goto L48;
        i$iv$iv$iv2 = i$iv$iv$iv2 + 1;
        elements$iv$iv = elements$iv$iv2;
        this_$iv$iv$iv = this_$iv$iv$iv2;
        this_$iv$iv = this_$iv$iv2;
        r5 = r48;
        r27 = 8;
        goto L24
    L40:
        this_$iv$iv2 = this_$iv$iv;
        elements$iv$iv2 = elements$iv$iv;
        this_$iv$iv$iv2 = this_$iv$iv$iv;
        goto L48
    L43:
        this_$iv$iv2 = this_$iv$iv;
        elements$iv$iv2 = elements$iv$iv;
        this_$iv$iv$iv2 = this_$iv$iv$iv;
        DerivedState it2 = (DerivedState) value$iv;
        addPendingInvalidationsLocked(it2, forgetConditionalScopes);
        goto L48
    L47:
        $this$fastForEach$iv2 = $this$fastForEach$iv;
        $i$f$fastForEach2 = $i$f$fastForEach;
        this_$iv$iv2 = this_$iv$iv;
        elements$iv$iv2 = elements$iv$iv;
        this_$iv$iv$iv2 = this_$iv$iv$iv;
        goto L48
    L13:
        $i$f$isFull = 0;
        goto L14
    L49:
        Set $this$fastForEach$iv3 = $this$fastForEach$iv;
        int $i$f$fastForEach3 = $i$f$fastForEach;
        ScatterSet this_$iv$iv4 = this_$iv$iv;
        Object[] elements$iv$iv4 = elements$iv$iv;
        ScatterSet this_$iv$iv$iv3 = this_$iv$iv$iv;
        if (bitCount$iv$iv$iv != r13) goto L93;
    L53:
        if (i$iv$iv$iv == lastIndex$iv$iv$iv) goto L93;
        i$iv$iv$iv = i$iv$iv$iv + 1;
        $this$fastForEach$iv = $this$fastForEach$iv3;
        $i$f$fastForEach = $i$f$fastForEach3;
        elements$iv$iv = elements$iv$iv4;
        this_$iv$iv$iv = this_$iv$iv$iv3;
        this_$iv$iv = this_$iv$iv4;
    L93:
        MutableScatterSet<RecomposeScopeImpl> r2 = this.conditionallyInvalidatedScopes;
        MutableScatterSet<RecomposeScopeImpl> r3 = this.invalidatedScopes;
        String r4 = "null cannot be cast to non-null type androidx.collection.MutableScatterSet<Scope of androidx.compose.runtime.collection.ScopeMap>";
        String r7 = "null cannot be cast to non-null type Scope of androidx.compose.runtime.collection.ScopeMap";
        if (forgetConditionalScopes == false) goto L166;
        if (r2.isNotEmpty() == false) goto L166;
        MutableScatterMap<Object, Object> r8 = this.observations;
        int r9 = 0;
        int $i$f$removeIf = 0;
        MutableScatterMap<Object, Object> this_$iv$iv$iv4 = r8;
        int $i$f$forEachIndexed = 0;
        long[] m$iv$iv$iv3 = this_$iv$iv$iv4.metadata;
        int lastIndex$iv$iv$iv3 = m$iv$iv$iv3.length - 2;
        int i$iv$iv$iv3 = 0;
        if (0 > lastIndex$iv$iv$iv3) goto L164;
    L99:
        long slot$iv$iv$iv3 = m$iv$iv$iv3[i$iv$iv$iv3];
        String r19 = r7;
        MutableScatterMap<Object, Object> r26 = r8;
        int r29 = r9;
        long $this$maskEmptyOrDeleted$iv$iv$iv$iv3 = (((~slot$iv$iv$iv3) << r22) & slot$iv$iv$iv3) & r28;
        if ($this$maskEmptyOrDeleted$iv$iv$iv$iv3 == r28) goto L159;
        int bitCount$iv$iv$iv3 = 8 - ((~(i$iv$iv$iv3 - lastIndex$iv$iv$iv3)) >>> 31);
        int i$iv$iv$iv4 = i$iv$iv$iv3;
        int j$iv$iv$iv4 = 0;
    L102:
        if (j$iv$iv$iv4 >= bitCount$iv$iv$iv3) goto L156;
        long value$iv$iv$iv$iv3 = slot$iv$iv$iv3 & r20;
        if (value$iv$iv$iv$iv3 >= r17) goto L106;
        int $i$f$isFull2 = 1;
    L107:
        if ($i$f$isFull2 == 0) goto L154;
        int index$iv$iv$iv = (i$iv$iv$iv4 << 3) + j$iv$iv$iv4;
        Object r14 = r8.keys[index$iv$iv$iv];
        Object value$iv2 = r8.values[index$iv$iv$iv];
        if ((value$iv2 instanceof MutableScatterSet) == false) goto L142;
        Intrinsics.checkNotNull(value$iv2, "null cannot be cast to non-null type androidx.collection.MutableScatterSet<Scope of androidx.compose.runtime.collection.ScopeMap>");
        MutableScatterSet this_$iv$iv5 = (MutableScatterSet) value$iv2;
        int j$iv$iv$iv5 = j$iv$iv$iv4;
        Object[] elements$iv$iv5 = this_$iv$iv5.elements;
        long[] m$iv$iv$iv4 = this_$iv$iv5.metadata;
        int lastIndex$iv$iv$iv4 = m$iv$iv$iv4.length - 2;
        int i$iv$iv$iv5 = 0;
        if (0 > lastIndex$iv$iv$iv4) goto L139;
    L112:
        long slot$iv$iv$iv4 = m$iv$iv$iv4[i$iv$iv$iv5];
        int $i$f$removeIf2 = $i$f$removeIf;
        ScatterMap this_$iv$iv$iv5 = this_$iv$iv$iv4;
        int $i$f$forEachIndexed2 = $i$f$forEachIndexed;
        Object r44 = value$iv2;
        long $this$maskEmptyOrDeleted$iv$iv$iv$iv4 = (((~slot$iv$iv$iv4) << r22) & slot$iv$iv$iv4) & r28;
        if ($this$maskEmptyOrDeleted$iv$iv$iv$iv4 == r28) goto L137;
        int bitCount$iv$iv$iv4 = 8 - ((~(i$iv$iv$iv5 - lastIndex$iv$iv$iv4)) >>> 31);
        int j$iv$iv$iv6 = 0;
    L115:
        if (j$iv$iv$iv6 >= bitCount$iv$iv$iv4) goto L134;
        long value$iv$iv$iv$iv4 = slot$iv$iv$iv4 & r20;
        if (value$iv$iv$iv$iv4 >= r17) goto L119;
        int $i$f$isFull3 = 1;
    L120:
        if ($i$f$isFull3 == 0) goto L132;
        int index$iv$iv$iv2 = (i$iv$iv$iv5 << 3) + j$iv$iv$iv6;
        RecomposeScopeImpl scope = (RecomposeScopeImpl) elements$iv$iv5[index$iv$iv$iv2];
        if (r2.contains(scope) == false) goto L124;
    L127:
        boolean r15 = true;
    L128:
        if (r15 == false) goto L132;
        this_$iv$iv5.removeElementAt(index$iv$iv$iv2);
        goto L132
    L124:
        if (r3.contains(scope) == true) goto L127;
        r15 = false;
    L132:
        slot$iv$iv$iv4 = slot$iv$iv$iv4 >> 8;
        j$iv$iv$iv6 = j$iv$iv$iv6 + 1;
        goto L115
    L119:
        $i$f$isFull3 = 0;
        goto L120
    L134:
        if (bitCount$iv$iv$iv4 == 8) goto L137;
    L141:
        boolean r10 = this_$iv$iv5.isEmpty();
        String r1 = r19;
    L150:
        if (r10 == false) goto L155;
        r8.removeValueAt(index$iv$iv$iv);
    L155:
        slot$iv$iv$iv3 = slot$iv$iv$iv3 >> 8;
        j$iv$iv$iv4 = j$iv$iv$iv5 + 1;
        r19 = r1;
        $i$f$forEachIndexed = $i$f$forEachIndexed2;
        $i$f$removeIf = $i$f$removeIf2;
        this_$iv$iv$iv4 = this_$iv$iv$iv5;
    L137:
        if (i$iv$iv$iv5 == lastIndex$iv$iv$iv4) goto L141;
        i$iv$iv$iv5 = i$iv$iv$iv5 + 1;
        value$iv2 = r44;
        $i$f$forEachIndexed = $i$f$forEachIndexed2;
        $i$f$removeIf = $i$f$removeIf2;
        this_$iv$iv$iv4 = this_$iv$iv$iv5;
        goto L112
    L139:
        $i$f$removeIf2 = $i$f$removeIf;
        this_$iv$iv$iv5 = this_$iv$iv$iv4;
        $i$f$forEachIndexed2 = $i$f$forEachIndexed;
        goto L141
    L142:
        j$iv$iv$iv5 = j$iv$iv$iv4;
        $i$f$removeIf2 = $i$f$removeIf;
        this_$iv$iv$iv5 = this_$iv$iv$iv4;
        $i$f$forEachIndexed2 = $i$f$forEachIndexed;
        r1 = r19;
        Intrinsics.checkNotNull(value$iv2, r1);
        RecomposeScopeImpl scope2 = (RecomposeScopeImpl) value$iv2;
        if (r2.contains(scope2) == false) goto L145;
    L148:
        r10 = true;
        goto L150
    L145:
        if (r3.contains(scope2) == true) goto L148;
        r10 = false;
        goto L150
    L154:
        j$iv$iv$iv5 = j$iv$iv$iv4;
        $i$f$removeIf2 = $i$f$removeIf;
        this_$iv$iv$iv5 = this_$iv$iv$iv4;
        $i$f$forEachIndexed2 = $i$f$forEachIndexed;
        r1 = r19;
        goto L155
    L106:
        $i$f$isFull2 = 0;
        goto L107
    L156:
        int $i$f$removeIf3 = $i$f$removeIf;
        ScatterMap this_$iv$iv$iv6 = this_$iv$iv$iv4;
        int $i$f$forEachIndexed3 = $i$f$forEachIndexed;
        String r11 = r19;
        if (bitCount$iv$iv$iv3 != 8) goto L164;
    L160:
        if (i$iv$iv$iv4 == lastIndex$iv$iv$iv3) goto L164;
        int r12 = i$iv$iv$iv4 + 1;
        r7 = r11;
        i$iv$iv$iv3 = r12;
        r8 = r26;
        r9 = r29;
        $i$f$forEachIndexed = $i$f$forEachIndexed3;
        $i$f$removeIf = $i$f$removeIf3;
        this_$iv$iv$iv4 = this_$iv$iv$iv6;
        goto L99
    L159:
        $i$f$removeIf3 = $i$f$removeIf;
        this_$iv$iv$iv6 = this_$iv$iv$iv4;
        $i$f$forEachIndexed3 = $i$f$forEachIndexed;
        i$iv$iv$iv4 = i$iv$iv$iv3;
        r11 = r19;
    L164:
        r2.clear();
        cleanUpDerivedStateObservations();
        return;
    L166:
        if (r3.isNotEmpty() == false) goto L225;
        MutableScatterMap<Object, Object> r16 = this.observations;
        int r18 = 0;
        int $i$f$removeIf4 = 0;
        MutableScatterMap<Object, Object> this_$iv$iv$iv7 = r16;
        long[] m$iv$iv$iv5 = this_$iv$iv$iv7.metadata;
        int lastIndex$iv$iv$iv5 = m$iv$iv$iv5.length - 2;
        int i$iv$iv$iv6 = 0;
        if (0 > lastIndex$iv$iv$iv5) goto L223;
    L169:
        long slot$iv$iv$iv5 = m$iv$iv$iv5[i$iv$iv$iv6];
        int i$iv$iv$iv7 = i$iv$iv$iv6;
        MutableScatterMap<Object, Object> r23 = r16;
        int r24 = r18;
        if (((((~slot$iv$iv$iv5) << r22) & slot$iv$iv$iv5) & r28) == r28) goto L217;
        int bitCount$iv$iv$iv5 = 8 - ((~(i$iv$iv$iv7 - lastIndex$iv$iv$iv5)) >>> 31);
        int j$iv$iv$iv7 = 0;
    L172:
        if (j$iv$iv$iv7 >= bitCount$iv$iv$iv5) goto L214;
        long value$iv$iv$iv$iv5 = slot$iv$iv$iv5 & r20;
        if (value$iv$iv$iv$iv5 >= r17) goto L176;
        int $i$f$isFull4 = 1;
    L177:
        if ($i$f$isFull4 == 0) goto L212;
        int index$iv$iv$iv3 = (i$iv$iv$iv7 << 3) + j$iv$iv$iv7;
        Object r110 = r16.keys[index$iv$iv$iv3];
        Object value$iv3 = r16.values[index$iv$iv$iv3];
        if ((value$iv3 instanceof MutableScatterSet) == false) goto L206;
        Intrinsics.checkNotNull(value$iv3, r4);
        MutableScatterSet this_$iv$iv6 = (MutableScatterSet) value$iv3;
        Object[] elements$iv$iv6 = this_$iv$iv6.elements;
        long[] m$iv$iv$iv6 = this_$iv$iv6.metadata;
        int lastIndex$iv$iv$iv6 = m$iv$iv$iv6.length - 2;
        int i$iv$iv$iv8 = 0;
        if (0 > lastIndex$iv$iv$iv6) goto L203;
    L182:
        long slot$iv$iv$iv6 = m$iv$iv$iv6[i$iv$iv$iv8];
        int j$iv$iv$iv8 = j$iv$iv$iv7;
        int index$iv$iv$iv4 = index$iv$iv$iv3;
        int $i$f$removeIf5 = $i$f$removeIf4;
        ScatterMap this_$iv$iv$iv8 = this_$iv$iv$iv7;
        long $this$maskEmptyOrDeleted$iv$iv$iv$iv5 = (((~slot$iv$iv$iv6) << r22) & slot$iv$iv$iv6) & r28;
        if ($this$maskEmptyOrDeleted$iv$iv$iv$iv5 == r28) goto L201;
        int bitCount$iv$iv$iv6 = 8 - ((~(i$iv$iv$iv8 - lastIndex$iv$iv$iv6)) >>> 31);
        int j$iv$iv$iv9 = 0;
    L185:
        if (j$iv$iv$iv9 >= bitCount$iv$iv$iv6) goto L198;
        long value$iv$iv$iv$iv6 = slot$iv$iv$iv6 & r20;
        if (value$iv$iv$iv$iv6 >= r17) goto L189;
        int $i$f$isFull5 = 1;
    L190:
        if ($i$f$isFull5 == 0) goto L196;
        int index$iv$iv$iv5 = (i$iv$iv$iv8 << 3) + j$iv$iv$iv9;
        RecomposeScopeImpl scope3 = (RecomposeScopeImpl) elements$iv$iv6[index$iv$iv$iv5];
        if (r3.contains(scope3) == false) goto L196;
        this_$iv$iv6.removeElementAt(index$iv$iv$iv5);
    L196:
        slot$iv$iv$iv6 = slot$iv$iv$iv6 >> 8;
        j$iv$iv$iv9 = j$iv$iv$iv9 + 1;
        goto L185
    L189:
        $i$f$isFull5 = 0;
        goto L190
    L198:
        if (bitCount$iv$iv$iv6 == 8) goto L201;
    L205:
        boolean r0 = this_$iv$iv6.isEmpty();
    L208:
        if (r0 == false) goto L213;
        r16.removeValueAt(index$iv$iv$iv3);
    L213:
        slot$iv$iv$iv5 = slot$iv$iv$iv5 >> 8;
        j$iv$iv$iv7 = j$iv$iv$iv8 + 1;
        r2 = r2;
        r4 = r4;
        $i$f$removeIf4 = $i$f$removeIf5;
        this_$iv$iv$iv7 = this_$iv$iv$iv8;
    L201:
        if (i$iv$iv$iv8 == lastIndex$iv$iv$iv6) goto L205;
        i$iv$iv$iv8 = i$iv$iv$iv8 + 1;
        value$iv3 = value$iv3;
        $i$f$removeIf4 = $i$f$removeIf5;
        this_$iv$iv$iv7 = this_$iv$iv$iv8;
        j$iv$iv$iv7 = j$iv$iv$iv8;
        index$iv$iv$iv3 = index$iv$iv$iv4;
        goto L182
    L203:
        j$iv$iv$iv8 = j$iv$iv$iv7;
        $i$f$removeIf5 = $i$f$removeIf4;
        this_$iv$iv$iv8 = this_$iv$iv$iv7;
        goto L205
    L206:
        j$iv$iv$iv8 = j$iv$iv$iv7;
        $i$f$removeIf5 = $i$f$removeIf4;
        this_$iv$iv$iv8 = this_$iv$iv$iv7;
        Intrinsics.checkNotNull(value$iv3, "null cannot be cast to non-null type Scope of androidx.compose.runtime.collection.ScopeMap");
        RecomposeScopeImpl scope4 = (RecomposeScopeImpl) value$iv3;
        r0 = r3.contains(scope4);
        goto L208
    L212:
        r2 = r2;
        r4 = r4;
        j$iv$iv$iv8 = j$iv$iv$iv7;
        $i$f$removeIf5 = $i$f$removeIf4;
        this_$iv$iv$iv8 = this_$iv$iv$iv7;
        goto L213
    L176:
        $i$f$isFull4 = 0;
        goto L177
    L214:
        MutableScatterSet<RecomposeScopeImpl> r31 = r2;
        String r36 = r4;
        int $i$f$removeIf6 = $i$f$removeIf4;
        ScatterMap this_$iv$iv$iv9 = this_$iv$iv$iv7;
        if (bitCount$iv$iv$iv5 != 8) goto L223;
    L219:
        if (i$iv$iv$iv7 == lastIndex$iv$iv$iv5) goto L223;
        i$iv$iv$iv6 = i$iv$iv$iv7 + 1;
        r16 = r23;
        r18 = r24;
        r2 = r31;
        r4 = r36;
        $i$f$removeIf4 = $i$f$removeIf6;
        this_$iv$iv$iv7 = this_$iv$iv$iv9;
        goto L169
    L217:
        r31 = r2;
        r36 = r4;
        $i$f$removeIf6 = $i$f$removeIf4;
        this_$iv$iv$iv9 = this_$iv$iv$iv7;
    L223:
        cleanUpDerivedStateObservations();
        r3.clear();
        return;
    L225:
        return;
    L52:
        $this$fastForEach$iv3 = $this$fastForEach$iv;
        $i$f$fastForEach3 = $i$f$fastForEach;
        this_$iv$iv4 = this_$iv$iv;
        elements$iv$iv4 = elements$iv$iv;
        this_$iv$iv$iv3 = this_$iv$iv$iv;
        goto L53
    L55:
        r28 = -9187201950435737472L;
        goto L93
    L58:
        r17 = 128;
        r20 = 255;
        r22 = 7;
        r28 = -9187201950435737472L;
        Set $this$forEach$iv$iv = $this$fastForEach$iv;
        int $i$f$forEach = 0;
        Iterator r21 = $this$forEach$iv$iv.iterator();
    L60:
        if (r21.hasNext() == false) goto L93;
        Object element$iv$iv = r21.next();
        Object value2 = element$iv$iv;
        int r25 = 0;
        if ((value2 instanceof RecomposeScopeImpl) == false) goto L64;
        ((RecomposeScopeImpl) value2).invalidateForResult(null);
        Iterable $this$forEach$iv$iv2 = $this$forEach$iv$iv;
        int $i$f$forEach2 = $i$f$forEach;
        Iterator r210 = r21;
    L91:
        $this$forEach$iv$iv = $this$forEach$iv$iv2;
        $i$f$forEach = $i$f$forEach2;
        r21 = r210;
        goto L60
    L64:
        addPendingInvalidationsLocked(value2, forgetConditionalScopes);
        Object value$iv4 = this.derivedStates.get(value2);
        if (value$iv4 != null) goto L67;
        $this$forEach$iv$iv2 = $this$forEach$iv$iv;
        $i$f$forEach2 = $i$f$forEach;
        r210 = r21;
        goto L91
    L67:
        if ((value$iv4 instanceof MutableScatterSet) == false) goto L88;
        ScatterSet this_$iv$iv7 = (MutableScatterSet) value$iv4;
        Object[] elements$iv$iv7 = this_$iv$iv7.elements;
        long[] m$iv$iv$iv7 = this_$iv$iv7.metadata;
        $this$forEach$iv$iv2 = $this$forEach$iv$iv;
        int lastIndex$iv$iv$iv7 = m$iv$iv$iv7.length - 2;
        $i$f$forEach2 = $i$f$forEach;
        int i$iv$iv$iv9 = 0;
        if (0 > lastIndex$iv$iv$iv7) goto L85;
    L70:
        long slot$iv$iv$iv7 = m$iv$iv$iv7[i$iv$iv$iv9];
        r210 = r21;
        Object element$iv$iv2 = element$iv$iv;
        Object value3 = value2;
        int r37 = r25;
        long $this$maskEmptyOrDeleted$iv$iv$iv$iv6 = (((~slot$iv$iv$iv7) << 7) & slot$iv$iv$iv7) & (-9187201950435737472L);
        if ($this$maskEmptyOrDeleted$iv$iv$iv$iv6 == (-9187201950435737472L)) goto L83;
        int bitCount$iv$iv$iv7 = 8 - ((~(i$iv$iv$iv9 - lastIndex$iv$iv$iv7)) >>> 31);
        int j$iv$iv$iv10 = 0;
    L73:
        if (j$iv$iv$iv10 >= bitCount$iv$iv$iv7) goto L82;
        long value$iv$iv$iv$iv7 = slot$iv$iv$iv7 & 255;
        if (value$iv$iv$iv$iv7 >= 128) goto L77;
        int $i$f$isFull6 = 1;
    L78:
        if ($i$f$isFull6 == 0) goto L80;
        DerivedState it3 = (DerivedState) elements$iv$iv7[(i$iv$iv$iv9 << 3) + j$iv$iv$iv10];
        addPendingInvalidationsLocked(it3, forgetConditionalScopes);
    L80:
        slot$iv$iv$iv7 = slot$iv$iv$iv7 >> 8;
        j$iv$iv$iv10 = j$iv$iv$iv10 + 1;
        goto L73
    L77:
        $i$f$isFull6 = 0;
        goto L78
    L82:
        if (bitCount$iv$iv$iv7 != 8) goto L91;
    L83:
        if (i$iv$iv$iv9 == lastIndex$iv$iv$iv7) goto L91;
        i$iv$iv$iv9 = i$iv$iv$iv9 + 1;
        r21 = r210;
        element$iv$iv = element$iv$iv2;
        value2 = value3;
        r25 = r37;
        goto L70
    L85:
        r210 = r21;
        goto L91
    L88:
        $this$forEach$iv$iv2 = $this$forEach$iv$iv;
        $i$f$forEach2 = $i$f$forEach;
        r210 = r21;
        DerivedState it4 = (DerivedState) value$iv4;
        addPendingInvalidationsLocked(it4, forgetConditionalScopes);
        goto L91
    }

    private final void cleanUpDerivedStateObservations() {
        MutableScatterMap<Object, Object> r1 = this.derivedStates;
        int r2 = 0;
        int $i$f$removeIf = 0;
        MutableScatterMap<Object, Object> this_$iv$iv$iv = r1;
        int $i$f$forEachIndexed = 0;
        long[] m$iv$iv$iv = this_$iv$iv$iv.metadata;
        int lastIndex$iv$iv$iv = m$iv$iv$iv.length - 2;
        int i$iv$iv$iv = 0;
        int r10 = 8;
        if (0 > lastIndex$iv$iv$iv) goto L57;
    L4:
        long slot$iv$iv$iv = m$iv$iv$iv[i$iv$iv$iv];
        char r22 = 7;
        long r25 = 255;
        long $this$maskEmptyOrDeleted$iv$iv$iv$iv = (((~slot$iv$iv$iv) << 7) & slot$iv$iv$iv) & (-9187201950435737472L);
        if ($this$maskEmptyOrDeleted$iv$iv$iv$iv == (-9187201950435737472L)) goto L54;
        int bitCount$iv$iv$iv = 8 - ((~(i$iv$iv$iv - lastIndex$iv$iv$iv)) >>> 31);
        int j$iv$iv$iv = 0;
    L7:
        if (j$iv$iv$iv >= bitCount$iv$iv$iv) goto L51;
        long value$iv$iv$iv$iv = slot$iv$iv$iv & 255;
        if (value$iv$iv$iv$iv >= 128) goto L11;
        boolean r13 = true;
    L12:
        if (r13 == false) goto L49;
        int index$iv$iv$iv = (i$iv$iv$iv << 3) + j$iv$iv$iv;
        Object r15 = r1.keys[index$iv$iv$iv];
        Object value$iv = r1.values[index$iv$iv$iv];
        int r29 = r10;
        if ((value$iv instanceof MutableScatterSet) == false) goto L41;
        Intrinsics.checkNotNull(value$iv, "null cannot be cast to non-null type androidx.collection.MutableScatterSet<Scope of androidx.compose.runtime.collection.ScopeMap>");
        MutableScatterSet set$iv = (MutableScatterSet) value$iv;
        MutableScatterMap<Object, Object> r32 = r1;
        int r30 = r2;
        Object[] elements$iv$iv = set$iv.elements;
        int $i$f$removeIf2 = $i$f$removeIf;
        long[] m$iv$iv$iv2 = set$iv.metadata;
        int lastIndex$iv$iv$iv2 = m$iv$iv$iv2.length - 2;
        int i$iv$iv$iv2 = 0;
        if (0 > lastIndex$iv$iv$iv2) goto L38;
    L17:
        long slot$iv$iv$iv2 = m$iv$iv$iv2[i$iv$iv$iv2];
        ScatterMap this_$iv$iv$iv2 = this_$iv$iv$iv;
        int $i$f$forEachIndexed2 = $i$f$forEachIndexed;
        int j$iv$iv$iv2 = j$iv$iv$iv;
        int index$iv$iv$iv2 = index$iv$iv$iv;
        long $this$maskEmptyOrDeleted$iv$iv$iv$iv2 = (((~slot$iv$iv$iv2) << 7) & slot$iv$iv$iv2) & (-9187201950435737472L);
        if ($this$maskEmptyOrDeleted$iv$iv$iv$iv2 == (-9187201950435737472L)) goto L35;
        int bitCount$iv$iv$iv2 = 8 - ((~(i$iv$iv$iv2 - lastIndex$iv$iv$iv2)) >>> 31);
        int j$iv$iv$iv3 = 0;
    L20:
        if (j$iv$iv$iv3 >= bitCount$iv$iv$iv2) goto L32;
        long value$iv$iv$iv$iv2 = slot$iv$iv$iv2 & 255;
        if (value$iv$iv$iv$iv2 >= 128) goto L24;
        boolean r12 = true;
    L25:
        if (r12 == false) goto L30;
        int index$iv$iv$iv3 = (i$iv$iv$iv2 << 3) + j$iv$iv$iv3;
        int j$iv$iv$iv4 = j$iv$iv$iv3;
        DerivedState derivedState = (DerivedState) elements$iv$iv[index$iv$iv$iv3];
        long[] m$iv$iv$iv3 = m$iv$iv$iv;
        if (ScopeMap.m3909containsimpl(access$getObservations$p(this), derivedState) == true) goto L31;
        set$iv.removeElementAt(index$iv$iv$iv3);
    L31:
        slot$iv$iv$iv2 = slot$iv$iv$iv2 >> r29;
        j$iv$iv$iv3 = j$iv$iv$iv4 + 1;
        m$iv$iv$iv = m$iv$iv$iv3;
        goto L20
    L30:
        j$iv$iv$iv4 = j$iv$iv$iv3;
        m$iv$iv$iv3 = m$iv$iv$iv;
        goto L31
    L24:
        r12 = false;
        goto L25
    L32:
        long[] m$iv$iv$iv4 = m$iv$iv$iv;
        int j$iv$iv$iv5 = r29;
        if (bitCount$iv$iv$iv2 != j$iv$iv$iv5) goto L40;
    L36:
        if (i$iv$iv$iv2 == lastIndex$iv$iv$iv2) goto L40;
        i$iv$iv$iv2 = i$iv$iv$iv2 + 1;
        j$iv$iv$iv = j$iv$iv$iv2;
        index$iv$iv$iv = index$iv$iv$iv2;
        this_$iv$iv$iv = this_$iv$iv$iv2;
        $i$f$forEachIndexed = $i$f$forEachIndexed2;
        m$iv$iv$iv = m$iv$iv$iv4;
        r29 = 8;
    L40:
        boolean r3 = set$iv.isEmpty();
    L46:
        if (r3 == false) goto L50;
        r1.removeValueAt(index$iv$iv$iv);
    L50:
        slot$iv$iv$iv = slot$iv$iv$iv >> 8;
        j$iv$iv$iv = j$iv$iv$iv2 + 1;
        r10 = 8;
        r2 = r30;
        r1 = r32;
        $i$f$removeIf = $i$f$removeIf2;
        this_$iv$iv$iv = this_$iv$iv$iv2;
        $i$f$forEachIndexed = $i$f$forEachIndexed2;
        m$iv$iv$iv = m$iv$iv$iv4;
        goto L7
    L35:
        m$iv$iv$iv4 = m$iv$iv$iv;
        goto L36
    L38:
        this_$iv$iv$iv2 = this_$iv$iv$iv;
        $i$f$forEachIndexed2 = $i$f$forEachIndexed;
        m$iv$iv$iv4 = m$iv$iv$iv;
        j$iv$iv$iv2 = j$iv$iv$iv;
        goto L40
    L41:
        r32 = r1;
        r30 = r2;
        $i$f$removeIf2 = $i$f$removeIf;
        this_$iv$iv$iv2 = this_$iv$iv$iv;
        $i$f$forEachIndexed2 = $i$f$forEachIndexed;
        m$iv$iv$iv4 = m$iv$iv$iv;
        j$iv$iv$iv2 = j$iv$iv$iv;
        Intrinsics.checkNotNull(value$iv, "null cannot be cast to non-null type Scope of androidx.compose.runtime.collection.ScopeMap");
        DerivedState derivedState2 = (DerivedState) value$iv;
        if (ScopeMap.m3909containsimpl(access$getObservations$p(this), derivedState2) == true) goto L44;
        r3 = true;
        goto L46
    L44:
        r3 = false;
        goto L46
    L49:
        r32 = r1;
        r30 = r2;
        $i$f$removeIf2 = $i$f$removeIf;
        this_$iv$iv$iv2 = this_$iv$iv$iv;
        $i$f$forEachIndexed2 = $i$f$forEachIndexed;
        m$iv$iv$iv4 = m$iv$iv$iv;
        j$iv$iv$iv2 = j$iv$iv$iv;
        goto L50
    L11:
        r13 = false;
        goto L12
    L51:
        MutableScatterMap<Object, Object> r33 = r1;
        int r31 = r2;
        int $i$f$removeIf3 = $i$f$removeIf;
        ScatterMap this_$iv$iv$iv3 = this_$iv$iv$iv;
        int $i$f$forEachIndexed3 = $i$f$forEachIndexed;
        long[] m$iv$iv$iv5 = m$iv$iv$iv;
        int $i$f$forEachIndexed4 = r10;
        if (bitCount$iv$iv$iv != $i$f$forEachIndexed4) goto L60;
    L55:
        if (i$iv$iv$iv == lastIndex$iv$iv$iv) goto L60;
        i$iv$iv$iv = i$iv$iv$iv + 1;
        r2 = r31;
        r1 = r33;
        $i$f$removeIf = $i$f$removeIf3;
        this_$iv$iv$iv = this_$iv$iv$iv3;
        $i$f$forEachIndexed = $i$f$forEachIndexed3;
        m$iv$iv$iv = m$iv$iv$iv5;
        r10 = 8;
    L60:
        if (this.conditionallyInvalidatedScopes.isNotEmpty() == false) goto L85;
        MutableScatterSet<RecomposeScopeImpl> r4 = this.conditionallyInvalidatedScopes;
        Object[] elements$iv = r4.elements;
        MutableScatterSet<RecomposeScopeImpl> this_$iv$iv = r4;
        long[] m$iv$iv = this_$iv$iv.metadata;
        int lastIndex$iv$iv = m$iv$iv.length - 2;
        int i$iv$iv = 0;
        if (0 > lastIndex$iv$iv) goto L104;
    L63:
        long slot$iv$iv = m$iv$iv[i$iv$iv];
        long $this$maskEmptyOrDeleted$iv$iv$iv = (((~slot$iv$iv) << r22) & slot$iv$iv) & (-9187201950435737472L);
        if ($this$maskEmptyOrDeleted$iv$iv$iv == (-9187201950435737472L)) goto L81;
        int bitCount$iv$iv = 8 - ((~(i$iv$iv - lastIndex$iv$iv)) >>> 31);
        int j$iv$iv = 0;
    L66:
        if (j$iv$iv >= bitCount$iv$iv) goto L78;
        long value$iv$iv$iv = slot$iv$iv & r25;
        if (value$iv$iv$iv >= 128) goto L70;
        boolean r14 = true;
    L71:
        if (r14 == false) goto L76;
        int index$iv$iv = (i$iv$iv << 3) + j$iv$iv;
        RecomposeScopeImpl scope = (RecomposeScopeImpl) elements$iv[index$iv$iv];
        if (scope.isConditional() == true) goto L76;
        r4.removeElementAt(index$iv$iv);
    L76:
        slot$iv$iv = slot$iv$iv >> 8;
        j$iv$iv = j$iv$iv + 1;
        goto L66
    L70:
        r14 = false;
        goto L71
    L78:
        if (bitCount$iv$iv == 8) goto L81;
        return;
    L81:
        if (i$iv$iv == lastIndex$iv$iv) goto L106;
        i$iv$iv = i$iv$iv + 1;
        goto L63
    L106:
        return;
    L104:
        return;
    L85:
        return;
    L54:
        r33 = r1;
        r31 = r2;
        $i$f$removeIf3 = $i$f$removeIf;
        this_$iv$iv$iv3 = this_$iv$iv$iv;
        $i$f$forEachIndexed3 = $i$f$forEachIndexed;
        m$iv$iv$iv5 = m$iv$iv$iv;
        goto L55
    L57:
        r22 = 7;
        r25 = 255;
        goto L60
    }

    @Override // androidx.compose.runtime.ControlledComposition, androidx.compose.runtime.RecomposeScopeOwner
    public void recordReadOf(Object value) {
        if (getAreChildrenComposing() == true) goto L43;
        RecomposeScopeImpl it = this.composer.getCurrentRecomposeScope$runtime_release();
        if (it == null) goto L49;
        int r3 = 0;
        int r4 = 1;
        it.setUsed(true);
        boolean alreadyRead = it.recordRead(value);
        if (alreadyRead == true) goto L50;
        if ((value instanceof StateObjectImpl) == false) goto L11;
        ReaderKind.Companion r7 = ReaderKind.Companion;
        ((StateObjectImpl) value).m3941recordReadInh_f27i8$runtime_release(ReaderKind.m3928constructorimpl(1));
    L11:
        ScopeMap.m3902addimpl(this.observations, value, it);
        if ((value instanceof DerivedState) == false) goto L52;
        DerivedState.Record record = ((DerivedState) value).getCurrentRecord();
        ScopeMap.m3916removeScopeimpl(this.derivedStates, value);
        ObjectIntMap<StateObject> r8 = record.getDependencies();
        Object[] k$iv = r8.keys;
        long[] m$iv$iv = r8.metadata;
        int lastIndex$iv$iv = m$iv$iv.length - 2;
        int i$iv$iv = 0;
        if (0 > lastIndex$iv$iv) goto L37;
    L15:
        long slot$iv$iv = m$iv$iv[i$iv$iv];
        int r20 = r4;
        boolean alreadyRead2 = alreadyRead;
        DerivedState.Record record2 = record;
        ObjectIntMap<StateObject> r18 = r8;
        long $this$maskEmptyOrDeleted$iv$iv$iv = (((~slot$iv$iv) << 7) & slot$iv$iv) & (-9187201950435737472L);
        if ($this$maskEmptyOrDeleted$iv$iv$iv == (-9187201950435737472L)) goto L34;
        int r5 = 8;
        int bitCount$iv$iv = 8 - ((~(i$iv$iv - lastIndex$iv$iv)) >>> 31);
        int j$iv$iv = 0;
    L18:
        if (j$iv$iv >= bitCount$iv$iv) goto L31;
        long value$iv$iv$iv = slot$iv$iv & 255;
        if (value$iv$iv$iv >= 128) goto L22;
        int r19 = r20;
    L23:
        if (r19 == 0) goto L29;
        int index$iv$iv = (i$iv$iv << 3) + j$iv$iv;
        StateObject dependency = (StateObject) k$iv[index$iv$iv];
        if ((dependency instanceof StateObjectImpl) == false) goto L28;
        ReaderKind.Companion r26 = ReaderKind.Companion;
        int j$iv$iv2 = ReaderKind.m3928constructorimpl(r20);
        ((StateObjectImpl) dependency).m3941recordReadInh_f27i8$runtime_release(j$iv$iv2);
    L28:
        ScopeMap.m3902addimpl(this.derivedStates, dependency, value);
    L30:
        slot$iv$iv = slot$iv$iv >> r5;
        j$iv$iv = j$iv$iv + 1;
        r5 = r5;
        r3 = r3;
        goto L18
    L29:
        j$iv$iv = j$iv$iv;
        goto L30
    L22:
        r19 = 0;
        goto L23
    L31:
        int r25 = r3;
        if (bitCount$iv$iv != r5) goto L39;
    L35:
        if (i$iv$iv == lastIndex$iv$iv) goto L39;
        i$iv$iv = i$iv$iv + 1;
        record = record2;
        r8 = r18;
        r4 = r20;
        alreadyRead = alreadyRead2;
        r3 = r25;
    L39:
        it.recordDerivedStateValue((DerivedState) value, record2.getCurrentValue());
        return;
    L34:
        r25 = r3;
        goto L35
    L37:
        record2 = record;
        goto L39
    L52:
        return;
    L50:
        return;
    L49:
        return;
    }

    private final void invalidateScopeOfLocked(Object value) {
        MutableScatterMap<Object, Object> r2 = this.observations;
        int r3 = 0;
        Object value$iv = r2.get(value);
        if (value$iv == null) goto L36;
        if ((value$iv instanceof MutableScatterSet) == false) goto L30;
        ScatterSet this_$iv$iv = (MutableScatterSet) value$iv;
        Object[] elements$iv$iv = this_$iv$iv.elements;
        long[] m$iv$iv$iv = this_$iv$iv.metadata;
        int lastIndex$iv$iv$iv = m$iv$iv$iv.length - 2;
        int i$iv$iv$iv = 0;
        if (0 > lastIndex$iv$iv$iv) goto L43;
    L8:
        long slot$iv$iv$iv = m$iv$iv$iv[i$iv$iv$iv];
        MutableScatterMap<Object, Object> r18 = r2;
        int r19 = r3;
        Object value$iv2 = value$iv;
        ScatterSet this_$iv$iv2 = this_$iv$iv;
        long $this$maskEmptyOrDeleted$iv$iv$iv$iv = (((~slot$iv$iv$iv) << 7) & slot$iv$iv$iv) & (-9187201950435737472L);
        if ($this$maskEmptyOrDeleted$iv$iv$iv$iv == (-9187201950435737472L)) goto L25;
        int r4 = 8;
        int bitCount$iv$iv$iv = 8 - ((~(i$iv$iv$iv - lastIndex$iv$iv$iv)) >>> 31);
        int j$iv$iv$iv = 0;
    L11:
        if (j$iv$iv$iv >= bitCount$iv$iv$iv) goto L24;
        long value$iv$iv$iv$iv = slot$iv$iv$iv & 255;
        if (value$iv$iv$iv$iv >= 128) goto L15;
        boolean r17 = true;
    L16:
        if (r17 == false) goto L21;
        int index$iv$iv$iv = (i$iv$iv$iv << 3) + j$iv$iv$iv;
        int r22 = r4;
        RecomposeScopeImpl scope = (RecomposeScopeImpl) elements$iv$iv[index$iv$iv$iv];
        int j$iv$iv$iv2 = j$iv$iv$iv;
        if (scope.invalidateForResult(value) != InvalidationResult.IMMINENT) goto L22;
        ScopeMap.m3902addimpl(this.observationsProcessed, value, scope);
    L22:
        slot$iv$iv$iv = slot$iv$iv$iv >> r22;
        j$iv$iv$iv = j$iv$iv$iv2 + 1;
        r4 = r22;
        goto L11
    L21:
        r22 = r4;
        j$iv$iv$iv2 = j$iv$iv$iv;
        goto L22
    L15:
        r17 = false;
        goto L16
    L24:
        if (bitCount$iv$iv$iv == r4) goto L25;
        return;
    L25:
        if (i$iv$iv$iv == lastIndex$iv$iv$iv) goto L47;
        i$iv$iv$iv = i$iv$iv$iv + 1;
        value$iv = value$iv2;
        this_$iv$iv = this_$iv$iv2;
        r2 = r18;
        r3 = r19;
        goto L8
    L47:
        return;
    L43:
        return;
    L30:
        RecomposeScopeImpl scope2 = (RecomposeScopeImpl) value$iv;
        if (scope2.invalidateForResult(value) != InvalidationResult.IMMINENT) goto L45;
        ScopeMap.m3902addimpl(this.observationsProcessed, value, scope2);
        return;
    L45:
        return;
    }

    @Override // androidx.compose.runtime.ControlledComposition
    public void recordWriteOf(Object value) {
        Object lock$iv = this.lock;
        int $i$f$synchronized = 0;
        monitor-enter(lock$iv);
        invalidateScopeOfLocked(value);     // Catch: Throwable -> L39
        MutableScatterMap<Object, Object> r4 = this.derivedStates;     // Catch: Throwable -> L39
        int r5 = 0;
        Object value$iv = r4.get(value);     // Catch: Throwable -> L39
        if (value$iv == null) goto L34;
        if ((value$iv instanceof MutableScatterSet) == false) goto L32;
        ScatterSet this_$iv$iv = (MutableScatterSet) value$iv;     // Catch: Throwable -> L39
        Object[] elements$iv$iv = this_$iv$iv.elements;     // Catch: Throwable -> L39
        long[] m$iv$iv$iv = this_$iv$iv.metadata;     // Catch: Throwable -> L39
        int lastIndex$iv$iv$iv = m$iv$iv$iv.length - 2;     // Catch: Throwable -> L39
        int i$iv$iv$iv = 0;
        if (0 > lastIndex$iv$iv$iv) goto L34;
    L11:
        long slot$iv$iv$iv = m$iv$iv$iv[i$iv$iv$iv];     // Catch: Throwable -> L39
        int $i$f$synchronized2 = $i$f$synchronized;
        MutableScatterMap<Object, Object> r22 = r4;
        int r18 = r5;
        long $this$maskEmptyOrDeleted$iv$iv$iv$iv = (((~slot$iv$iv$iv) << 7) & slot$iv$iv$iv) & (-9187201950435737472L);
        if ($this$maskEmptyOrDeleted$iv$iv$iv$iv == (-9187201950435737472L)) goto L27;
        int r6 = 8;
        int bitCount$iv$iv$iv = 8 - ((~(i$iv$iv$iv - lastIndex$iv$iv$iv)) >>> 31);
        int j$iv$iv$iv = 0;
    L15:
        if (j$iv$iv$iv >= bitCount$iv$iv$iv) goto L26;
        long value$iv$iv$iv$iv = slot$iv$iv$iv & 255;
        if (value$iv$iv$iv$iv >= 128) goto L19;
        boolean r23 = true;
    L20:
        if (r23 == false) goto L24;
        int index$iv$iv$iv = (i$iv$iv$iv << 3) + j$iv$iv$iv;
        DerivedState it = (DerivedState) elements$iv$iv[index$iv$iv$iv];     // Catch: Throwable -> L37
        invalidateScopeOfLocked(it);     // Catch: Throwable -> L37
    L24:
        slot$iv$iv$iv = slot$iv$iv$iv >> r6;     // Catch: Throwable -> L37
        j$iv$iv$iv = j$iv$iv$iv + 1;     // Catch: Throwable -> L37
        r6 = r6;
        goto L15
    L19:
        r23 = false;
        goto L20
    L26:
        if (bitCount$iv$iv$iv != r6) goto L34;
    L27:
        if (i$iv$iv$iv == lastIndex$iv$iv$iv) goto L34;
        i$iv$iv$iv = i$iv$iv$iv + 1;     // Catch: Throwable -> L37
        r5 = r18;
        $i$f$synchronized = $i$f$synchronized2;
        r4 = r22;
        goto L11
    L32:
        DerivedState it2 = (DerivedState) value$iv;     // Catch: Throwable -> L37
        invalidateScopeOfLocked(it2);     // Catch: Throwable -> L37
    L34:
        Unit r0 = Unit.INSTANCE;     // Catch: Throwable -> L37
        monitor-exit(lock$iv);
        return;
    L37:
        th = th;
    L41:
        monitor-exit(lock$iv);
        throw th;
    L39:
        th = th;
        goto L41
    }

    @Override // androidx.compose.runtime.ControlledComposition
    public boolean recompose() {
        Object lock$iv = this.lock;
        monitor-enter(lock$iv);
        drainPendingModificationsForCompositionLocked();     // Catch: Throwable -> L57
        MutableScatterMap<Object, Object> r0 = m3752takeInvalidationsafanTW4();     // Catch: Throwable -> L44
        CompositionObserver observer = observer();     // Catch: Exception -> L38 Throwable -> L44
        if (observer != null) goto L74;
        CompositionImpl this_$iv = this;
    L26:
        boolean shouldDrain = this.composer.m3750recomposeaFTiNEg$runtime_release(r0, this.shouldPause);     // Catch: Exception -> L36 Throwable -> L42
        if (shouldDrain == true) goto L29;
        drainPendingModificationsLocked();     // Catch: Exception -> L36 Throwable -> L42
    L29:
        if (observer == null) goto L34;
        observer.onEndComposition(this);     // Catch: Exception -> L36 Throwable -> L42
    L36:
        e$iv = e;
    L40:
        this.invalidations = r0;     // Catch: Throwable -> L42
        throw e$iv;     // Catch: Throwable -> L42
    L42:
        e$iv = th;
    L61:
        if (0 == 0) goto L67;
    L51:
        throw e$iv;     // Catch: Throwable -> L52 Exception -> L54
    L54:
        e$iv = move-exception;
        this_$iv.abandonChanges();     // Catch: Throwable -> L52
        throw e$iv;     // Catch: Throwable -> L52
    L67:
        if (this.abandonSet.isEmpty() == true) goto L51;
        new RememberEventDispatcher(this.abandonSet).dispatchAbandons();     // Catch: Throwable -> L52 Exception -> L54
    L52:
        e$iv = th;
    L59:
        monitor-exit(lock$iv);
        throw e$iv;
    L34:
        monitor-exit(lock$iv);
        return shouldDrain;
    L74:
        CompositionImpl r3 = this;     // Catch: Throwable -> L21 Exception -> L23
    L72:
        Map<RecomposeScope, ? extends Set<? extends Object>> r4 = ScopeMap.m3904asMapimpl(r0);     // Catch: Throwable -> L17 Exception -> L19
        this_$iv = this;
        Intrinsics.checkNotNull(r4, "null cannot be cast to non-null type kotlin.collections.Map<androidx.compose.runtime.RecomposeScope, kotlin.collections.Set<kotlin.Any>>");     // Catch: Exception -> L36 Throwable -> L42
        observer.onBeginComposition(r3, r4);     // Catch: Exception -> L36 Throwable -> L42
        goto L26
    L19:
        e$iv = e;
        this_$iv = this;
    L17:
        e$iv = th;
        this_$iv = this;
    L23:
        e$iv = e;
        this_$iv = this;
    L21:
        e$iv = th;
        this_$iv = this;
        goto L61
    L38:
        e$iv = e;
        this_$iv = this;
    L44:
        e$iv = th;
        this_$iv = this;
    L57:
        e$iv = th;
        goto L59
    }

    @Override // androidx.compose.runtime.ControlledComposition
    public void insertMovableContent(List<Pair<MovableContentStateReference, MovableContentStateReference>> r13) {
        int index$iv$iv = 0;
        int r5 = r13.size();
    L3:
        if (index$iv$iv >= r5) goto L8;
        Object item$iv$iv = r13.get(index$iv$iv);
        if (Intrinsics.areEqual(((Pair) item$iv$iv).getFirst().getComposition$runtime_release(), this) == false) goto L6;
        index$iv$iv = index$iv$iv + 1;
        goto L3
    L6:
        boolean value$iv = false;
    L10:
        if (value$iv == true) goto L26;
        ComposerKt.composeImmediateRuntimeError("Check failed");
    L26:
        this.composer.insertMovableContentReferences(r13);     // Catch: Throwable -> L16
        Unit r6 = Unit.INSTANCE;     // Catch: Throwable -> L16
        return;
    L16:
        th = move-exception;
        if (0 == 0) goto L28;
    L22:
        throw th;     // Catch: Exception -> L23
    L23:
        e$iv = move-exception;
        abandonChanges();
        throw e$iv;
    L28:
        if (this.abandonSet.isEmpty() == true) goto L22;
        new RememberEventDispatcher(this.abandonSet).dispatchAbandons();     // Catch: Exception -> L23
        goto L22
    L8:
        value$iv = true;
        goto L10
    }

    @Override // androidx.compose.runtime.ControlledComposition
    public void disposeUnusedMovableContent(MovableContentState state) {
        RememberEventDispatcher manager = new RememberEventDispatcher(this.abandonSet);
        SlotTable slotTable = state.getSlotTable$runtime_release();
        SlotWriter writer$iv = slotTable.openWriter();
        ComposerKt.removeCurrentGroup(writer$iv, manager);     // Catch: Throwable -> L6
        Unit r7 = Unit.INSTANCE;     // Catch: Throwable -> L6
        writer$iv.close(true);
        manager.dispatchRememberObservers();
        return;
    L6:
        th = move-exception;
        writer$iv.close(false);
        throw th;
    }

    private final void applyChangesInLocked(ChangeList changes) {
        RememberEventDispatcher manager = new RememberEventDispatcher(this.abandonSet);
    L129:
        th = th;
    L132:
        if (this.lateChanges.isEmpty() == true) goto L134;
    L136:
        throw th;
    L134:
        if (this.pendingPausedComposition != null) goto L136;
        manager.dispatchAbandons();
        goto L136
    L4:
        if (changes.isEmpty() == true) goto L6;
        Object token$iv = Trace.INSTANCE.beginSection("Compose:applyChanges");     // Catch: Throwable -> L129
        PausedCompositionImpl r0 = this.pendingPausedComposition;     // Catch: Throwable -> L123
        if (r0 != null) goto L149;
    L21:
        RecordingApplier<Object> r1 = this.applier;     // Catch: Throwable -> L123
    L22:
        Applier<?> r7 = r1;
        PausedCompositionImpl r2 = this.pendingPausedComposition;     // Catch: Throwable -> L123
        if (r2 == null) goto L26;
        RememberEventDispatcher r3 = r2.getRememberManager$runtime_release();     // Catch: Throwable -> L19
        if (r3 == null) goto L26;
    L27:
        RememberEventDispatcher rememberManager = r3;
        r7.onBeginChanges();     // Catch: Throwable -> L123
        SlotTable this_$iv = this.slotTable;     // Catch: Throwable -> L123
        SlotWriter writer$iv = this_$iv.openWriter();     // Catch: Throwable -> L123
        changes.executeAndFlushAllPendingChanges(r7, writer$iv, rememberManager);     // Catch: Throwable -> L115
        Unit r4 = Unit.INSTANCE;     // Catch: Throwable -> L115
        writer$iv.close(true);     // Catch: Throwable -> L121
        r7.onEndChanges();     // Catch: Throwable -> L121
        Unit r5 = Unit.INSTANCE;     // Catch: Throwable -> L121
        Trace.INSTANCE.endSection(token$iv);     // Catch: Throwable -> L127
        manager.dispatchRememberObservers();     // Catch: Throwable -> L127
        manager.dispatchSideEffects();     // Catch: Throwable -> L127
        if (this.pendingInvalidScopes == false) goto L109;
        String sectionName$iv = "Compose:unobserve";
        int $i$f$trace = 0;
        Object token$iv2 = Trace.INSTANCE.beginSection(sectionName$iv);     // Catch: Throwable -> L127
        int r6 = 0;
        this.pendingInvalidScopes = false;     // Catch: Throwable -> L104
        MutableScatterMap<Object, Object> r8 = this.observations;     // Catch: Throwable -> L104
        int r9 = 0;
        int $i$f$removeIf = 0;
        MutableScatterMap<Object, Object> this_$iv$iv$iv = r8;     // Catch: Throwable -> L104
        long[] m$iv$iv$iv = this_$iv$iv$iv.metadata;     // Catch: Throwable -> L104
        int lastIndex$iv$iv$iv = m$iv$iv$iv.length - 2;     // Catch: Throwable -> L104
        int i$iv$iv$iv = 0;
        if (0 > lastIndex$iv$iv$iv) goto L100;
    L41:
        long slot$iv$iv$iv = m$iv$iv$iv[i$iv$iv$iv];     // Catch: Throwable -> L104
        MutableScatterMap<Object, Object> r22 = r8;
        String sectionName$iv2 = sectionName$iv;
        if (((((~slot$iv$iv$iv) << 7) & slot$iv$iv$iv) & (-9187201950435737472L)) == (-9187201950435737472L)) goto L95;
        int r10 = 8;
        int bitCount$iv$iv$iv = 8 - ((~(i$iv$iv$iv - lastIndex$iv$iv$iv)) >>> 31);
        int j$iv$iv$iv = 0;
    L45:
        if (j$iv$iv$iv >= bitCount$iv$iv$iv) goto L92;
        long value$iv$iv$iv$iv = slot$iv$iv$iv & 255;
        boolean r31 = true;
        if (value$iv$iv$iv$iv >= 128) goto L49;
        int $i$f$isFull = 1;
    L50:
        if ($i$f$isFull == 0) goto L90;
        int index$iv$iv$iv = (i$iv$iv$iv << 3) + j$iv$iv$iv;
        int r28 = r10;
        Object r11 = r8.keys[index$iv$iv$iv];     // Catch: Throwable -> L88
        Object value$iv = r8.values[index$iv$iv$iv];     // Catch: Throwable -> L88
        if ((value$iv instanceof MutableScatterSet) == false) goto L79;
        Intrinsics.checkNotNull(value$iv, "null cannot be cast to non-null type androidx.collection.MutableScatterSet<Scope of androidx.compose.runtime.collection.ScopeMap>");     // Catch: Throwable -> L88
        MutableScatterSet this_$iv$iv = (MutableScatterSet) value$iv;     // Catch: Throwable -> L88
        int $i$f$trace2 = $i$f$trace;
        Object[] elements$iv$iv = this_$iv$iv.elements;     // Catch: Throwable -> L102
        int j$iv$iv$iv2 = j$iv$iv$iv;
        long[] m$iv$iv$iv2 = this_$iv$iv.metadata;     // Catch: Throwable -> L102
        int lastIndex$iv$iv$iv2 = m$iv$iv$iv2.length - 2;     // Catch: Throwable -> L102
        int i$iv$iv$iv2 = 0;
        if (0 > lastIndex$iv$iv$iv2) goto L76;
    L58:
        long slot$iv$iv$iv2 = m$iv$iv$iv2[i$iv$iv$iv2];     // Catch: Throwable -> L102
        int index$iv$iv$iv2 = index$iv$iv$iv;
        int r47 = r9;
        int $i$f$removeIf2 = $i$f$removeIf;
        ScatterMap this_$iv$iv$iv2 = this_$iv$iv$iv;
        long $this$maskEmptyOrDeleted$iv$iv$iv$iv = (((~slot$iv$iv$iv2) << 7) & slot$iv$iv$iv2) & (-9187201950435737472L);     // Catch: Throwable -> L102
        if ($this$maskEmptyOrDeleted$iv$iv$iv$iv == (-9187201950435737472L)) goto L74;
        int bitCount$iv$iv$iv2 = 8 - ((~(i$iv$iv$iv2 - lastIndex$iv$iv$iv2)) >>> 31);     // Catch: Throwable -> L102
        int j$iv$iv$iv3 = 0;
    L61:
        if (j$iv$iv$iv3 >= bitCount$iv$iv$iv2) goto L72;
        long value$iv$iv$iv$iv2 = slot$iv$iv$iv2 & 255;     // Catch: Throwable -> L102
        if (value$iv$iv$iv$iv2 >= 128) goto L65;
        boolean r12 = true;
    L66:
        if (r12 == false) goto L71;
        int index$iv$iv$iv3 = (i$iv$iv$iv2 << 3) + j$iv$iv$iv3;     // Catch: Throwable -> L102
        RecomposeScopeImpl scope = (RecomposeScopeImpl) elements$iv$iv[index$iv$iv$iv3];     // Catch: Throwable -> L102
        if (scope.getValid() == true) goto L71;
        this_$iv$iv.removeElementAt(index$iv$iv$iv3);     // Catch: Throwable -> L102
    L71:
        slot$iv$iv$iv2 = slot$iv$iv$iv2 >> r28;     // Catch: Throwable -> L102
        j$iv$iv$iv3 = j$iv$iv$iv3 + 1;     // Catch: Throwable -> L102
        goto L61
    L65:
        r12 = false;
        goto L66
    L72:
        int j$iv$iv$iv4 = r28;
        if (bitCount$iv$iv$iv2 == j$iv$iv$iv4) goto L74;
    L78:
        r31 = this_$iv$iv.isEmpty();     // Catch: Throwable -> L102
    L84:
        if (r31 == false) goto L91;
        r8.removeValueAt(index$iv$iv$iv);     // Catch: Throwable -> L102
    L91:
        slot$iv$iv$iv = slot$iv$iv$iv >> 8;     // Catch: Throwable -> L102
        j$iv$iv$iv = j$iv$iv$iv2 + 1;     // Catch: Throwable -> L102
        r10 = 8;
        r6 = r6;
        $i$f$trace = $i$f$trace2;
        $i$f$removeIf = $i$f$removeIf2;
        this_$iv$iv$iv = this_$iv$iv$iv2;
        r9 = r47;
    L74:
        if (i$iv$iv$iv2 == lastIndex$iv$iv$iv2) goto L78;
        i$iv$iv$iv2 = i$iv$iv$iv2 + 1;     // Catch: Throwable -> L102
        $i$f$removeIf = $i$f$removeIf2;
        this_$iv$iv$iv = this_$iv$iv$iv2;
        r9 = r47;
        index$iv$iv$iv = index$iv$iv$iv2;
        r28 = 8;
        goto L58
    L76:
        r47 = r9;
        $i$f$removeIf2 = $i$f$removeIf;
        this_$iv$iv$iv2 = this_$iv$iv$iv;
    L102:
        th = th;
    L106:
        Trace.INSTANCE.endSection(token$iv2);     // Catch: Throwable -> L127
        throw th;     // Catch: Throwable -> L127
    L79:
        $i$f$trace2 = $i$f$trace;
        j$iv$iv$iv2 = j$iv$iv$iv;
        r47 = r9;
        $i$f$removeIf2 = $i$f$removeIf;
        this_$iv$iv$iv2 = this_$iv$iv$iv;
        Intrinsics.checkNotNull(value$iv, "null cannot be cast to non-null type Scope of androidx.compose.runtime.collection.ScopeMap");     // Catch: Throwable -> L102
        RecomposeScopeImpl scope2 = (RecomposeScopeImpl) value$iv;     // Catch: Throwable -> L102
        if (scope2.getValid() == false) goto L84;
        r31 = false;
    L88:
        th = th;
        goto L106
    L90:
        $i$f$trace2 = $i$f$trace;
        j$iv$iv$iv2 = j$iv$iv$iv;
        r47 = r9;
        $i$f$removeIf2 = $i$f$removeIf;
        this_$iv$iv$iv2 = this_$iv$iv$iv;
        goto L91
    L49:
        $i$f$isFull = 0;
        goto L50
    L92:
        int r33 = r6;
        int $i$f$trace3 = $i$f$trace;
        int r48 = r9;
        int $i$f$removeIf3 = $i$f$removeIf;
        ScatterMap this_$iv$iv$iv3 = this_$iv$iv$iv;
        if (bitCount$iv$iv$iv != r10) goto L100;
    L96:
        if (i$iv$iv$iv == lastIndex$iv$iv$iv) goto L100;
        i$iv$iv$iv = i$iv$iv$iv + 1;     // Catch: Throwable -> L102
        sectionName$iv = sectionName$iv2;
        r8 = r22;
        r6 = r33;
        $i$f$trace = $i$f$trace3;
        $i$f$removeIf = $i$f$removeIf3;
        this_$iv$iv$iv = this_$iv$iv$iv3;
        r9 = r48;
        goto L41
    L95:
        r33 = r6;
        $i$f$trace3 = $i$f$trace;
        r48 = r9;
        $i$f$removeIf3 = $i$f$removeIf;
        this_$iv$iv$iv3 = this_$iv$iv$iv;
    L100:
        cleanUpDerivedStateObservations();     // Catch: Throwable -> L102
        Unit r13 = Unit.INSTANCE;     // Catch: Throwable -> L102
        Trace.INSTANCE.endSection(token$iv2);     // Catch: Throwable -> L127
    L104:
        th = th;
    L109:
        if (this.lateChanges.isEmpty() == true) goto L111;
        return;
    L111:
        if (this.pendingPausedComposition != null) goto L168;
        manager.dispatchAbandons();
        return;
    L168:
        return;
    L115:
        th = th;
    L119:
        writer$iv.close(false);     // Catch: Throwable -> L121
        throw th;     // Catch: Throwable -> L121
    L117:
        th = th;
    L121:
        th = th;
    L125:
        Trace.INSTANCE.endSection(token$iv);     // Catch: Throwable -> L127
        throw th;     // Catch: Throwable -> L127
    L19:
        th = th;
    L26:
        r3 = manager;
        goto L27
    L149:
        RecordingApplier<Object> r14 = r0.getPausableApplier$runtime_release();     // Catch: Throwable -> L19
        if (r14 == null) goto L21;
        r1 = r14;     // Catch: Throwable -> L19
    L127:
        th = th;
    L123:
        th = th;
        goto L125
    L6:
        if (this.lateChanges.isEmpty() == true) goto L8;
        return;
    L8:
        if (this.pendingPausedComposition != null) goto L166;
        manager.dispatchAbandons();
        return;
    }

    @Override // androidx.compose.runtime.ControlledComposition
    public void applyChanges() {
        Object lock$iv = this.lock;
        monitor-enter(lock$iv);
        applyChangesInLocked(this.changes);     // Catch: Throwable -> L10
        drainPendingModificationsLocked();     // Catch: Throwable -> L10
        Unit r8 = Unit.INSTANCE;     // Catch: Throwable -> L10
    L7:
        Unit r2 = Unit.INSTANCE;     // Catch: Throwable -> L17
        monitor-exit(lock$iv);
        return;
    L10:
        th = move-exception;
        if (0 == 0) goto L24;
    L16:
        throw th;     // Catch: Throwable -> L17 Exception -> L19
    L19:
        e$iv = move-exception;
        abandonChanges();     // Catch: Throwable -> L17
        throw e$iv;     // Catch: Throwable -> L17
    L24:
        if (this.abandonSet.isEmpty() == true) goto L16;
        new RememberEventDispatcher(this.abandonSet).dispatchAbandons();     // Catch: Throwable -> L17 Exception -> L19
    L17:
        th = move-exception;
        throw th;
    }

    @Override // androidx.compose.runtime.ControlledComposition
    public void applyLateChanges() {
        Object lock$iv = this.lock;
        monitor-enter(lock$iv);
    L20:
        th = move-exception;
        throw th;
    L13:
        th = move-exception;
        if (0 == 0) goto L29;
    L19:
        throw th;     // Catch: Throwable -> L20 Exception -> L22
    L22:
        e$iv = move-exception;
        abandonChanges();     // Catch: Throwable -> L20
        throw e$iv;     // Catch: Throwable -> L20
    L29:
        if (this.abandonSet.isEmpty() == true) goto L19;
        new RememberEventDispatcher(this.abandonSet).dispatchAbandons();     // Catch: Throwable -> L20 Exception -> L22
        goto L19
    L6:
        if (this.lateChanges.isNotEmpty() == false) goto L8;
        applyChangesInLocked(this.lateChanges);     // Catch: Throwable -> L13
    L8:
        Unit r8 = Unit.INSTANCE;     // Catch: Throwable -> L13
    L10:
        Unit r2 = Unit.INSTANCE;     // Catch: Throwable -> L20
        monitor-exit(lock$iv);
    }

    @Override // androidx.compose.runtime.ControlledComposition
    public void changesApplied() {
        Object lock$iv = this.lock;
        monitor-enter(lock$iv);
        this.composer.changesApplied$runtime_release();     // Catch: Throwable -> L13
        if (this.abandonSet.isEmpty() == true) goto L8;
        new RememberEventDispatcher(this.abandonSet).dispatchAbandons();     // Catch: Throwable -> L13
    L8:
        Unit r8 = Unit.INSTANCE;     // Catch: Throwable -> L13
    L10:
        Unit r2 = Unit.INSTANCE;     // Catch: Throwable -> L20
        monitor-exit(lock$iv);
        return;
    L13:
        th = move-exception;
        if (0 == 0) goto L29;
    L19:
        throw th;     // Catch: Throwable -> L20 Exception -> L22
    L22:
        e$iv = move-exception;
        abandonChanges();     // Catch: Throwable -> L20
        throw e$iv;     // Catch: Throwable -> L20
    L29:
        if (this.abandonSet.isEmpty() == true) goto L19;
        new RememberEventDispatcher(this.abandonSet).dispatchAbandons();     // Catch: Throwable -> L20 Exception -> L22
    L20:
        th = move-exception;
        throw th;
    }

    private final <T> T guardInvalidationsLocked(Function1<? super ScopeMap<RecomposeScopeImpl, Object>, ? extends T> r4) {
        MutableScatterMap<Object, Object> r1 = m3752takeInvalidationsafanTW4();
        return r4.invoke(ScopeMap.m3905boximpl(r1));
    L5:
        e = move-exception;
        this.invalidations = r1;
        throw e;
    }

    private final <T> T guardChanges(Function0<? extends T> r8) {
        return r8.invoke();
    L6:
        th = move-exception;
        if (0 == 0) goto L19;
    L14:
        throw th;     // Catch: Exception -> L11
    L11:
        e = move-exception;
        abandonChanges();
        throw e;
    L19:
        if (this.abandonSet.isEmpty() == true) goto L14;
        new RememberEventDispatcher(this.abandonSet).dispatchAbandons();     // Catch: Exception -> L11
        goto L14
    }

    @Override // androidx.compose.runtime.ControlledComposition
    public void abandonChanges() {
        this.pendingModifications.set(null);
        this.changes.clear();
        this.lateChanges.clear();
        if (this.abandonSet.isEmpty() == true) goto L6;
        new RememberEventDispatcher(this.abandonSet).dispatchAbandons();
        return;
    }

    @Override // androidx.compose.runtime.ControlledComposition
    public void invalidateAll() {
        Object lock$iv = this.lock;
        monitor-enter(lock$iv);
        Object[] $this$forEach$iv = this.slotTable.getSlots();     // Catch: Throwable -> L17
        int r5 = $this$forEach$iv.length;     // Catch: Throwable -> L17
        int r6 = 0;
    L6:
        if (r6 >= r5) goto L14;
        Object element$iv = $this$forEach$iv[r6];     // Catch: Throwable -> L17
        if ((element$iv instanceof RecomposeScopeImpl) == false) goto L10;
        RecomposeScopeImpl r10 = (RecomposeScopeImpl) element$iv;     // Catch: Throwable -> L17
    L11:
        if (r10 == null) goto L13;
        r10.invalidate();     // Catch: Throwable -> L17
    L13:
        r6 = r6 + 1;     // Catch: Throwable -> L17
        goto L6
    L10:
        r10 = null;
        goto L11
    L14:
        Unit r2 = Unit.INSTANCE;     // Catch: Throwable -> L17
        monitor-exit(lock$iv);
        return;
    L17:
        th = move-exception;
        throw th;
    }

    @Override // androidx.compose.runtime.ControlledComposition
    public void verifyConsistent() {
        Object lock$iv = this.lock;
        monitor-enter(lock$iv);
    L11:
        th = move-exception;
        throw th;
    L6:
        if (isComposing() == true) goto L8;
        this.composer.verifyConsistent$runtime_release();     // Catch: Throwable -> L11
        this.slotTable.verifyWellFormed();     // Catch: Throwable -> L11
        validateRecomposeScopeAnchors(this.slotTable);     // Catch: Throwable -> L11
    L8:
        Unit r2 = Unit.INSTANCE;     // Catch: Throwable -> L11
        monitor-exit(lock$iv);
    }

    @Override // androidx.compose.runtime.ControlledComposition
    public <R> R delegateInvalidations(ControlledComposition to, int groupIndex, Function0<? extends R> r6) {
        if (to == null) goto L13;
        if (Intrinsics.areEqual(to, this) == true) goto L13;
        if (groupIndex < 0) goto L13;
        this.invalidationDelegate = (CompositionImpl) to;
        this.invalidationDelegateGroup = groupIndex;
        R r2 = r6.invoke();     // Catch: Throwable -> L9
        this.invalidationDelegate = null;
        this.invalidationDelegateGroup = 0;
        return r2;
    L9:
        th = move-exception;
        this.invalidationDelegate = null;
        this.invalidationDelegateGroup = 0;
        throw th;
    L13:
        return r6.invoke();
    }

    @Override // androidx.compose.runtime.ControlledComposition
    public ShouldPauseCallback getAndSetShouldPauseCallback(ShouldPauseCallback shouldPause) {
        ShouldPauseCallback previous = this.shouldPause;
        this.shouldPause = shouldPause;
        return previous;
    }

    @Override // androidx.compose.runtime.RecomposeScopeOwner
    public InvalidationResult invalidate(RecomposeScopeImpl scope, Object instance) {
        boolean r1 = true;
        if (scope.getDefaultsInScope() == false) goto L5;
        scope.setDefaultsInvalid(true);
    L5:
        Anchor anchor = scope.getAnchor();
        if (anchor == null) goto L38;
        if (anchor.getValid() == false) goto L38;
        if (this.slotTable.ownsAnchor(anchor) == true) goto L32;
        Object lock$iv = this.lock;
        monitor-enter(lock$iv);
        CompositionImpl delegate = this.invalidationDelegate;     // Catch: Throwable -> L28
        monitor-exit(lock$iv);
        if (delegate != null) goto L20;
    L22:
        r1 = false;
    L23:
        if (r1 == false) goto L27;
        return InvalidationResult.IMMINENT;
    L27:
        return InvalidationResult.IGNORED;
    L20:
        if (delegate.tryImminentInvalidation(scope, instance) != true) goto L22;
    L28:
        th = move-exception;
        throw th;
    L32:
        if (scope.getCanRecompose() == true) goto L36;
        return InvalidationResult.IGNORED;
    L36:
        return invalidateChecked(scope, anchor, instance);
    L38:
        return InvalidationResult.IGNORED;
    }

    @Override // androidx.compose.runtime.RecomposeScopeOwner
    public void recomposeScopeReleased(RecomposeScopeImpl scope) {
        this.pendingInvalidScopes = true;
    }

    @Override // androidx.compose.runtime.CompositionServices
    public <T> T getCompositionService(CompositionServiceKey<T> r2) {
        if (Intrinsics.areEqual(r2, CompositionKt.getCompositionImplServiceKey()) == true) goto L7;
        return null;
    L7:
        return (T) this;
    }

    private final boolean tryImminentInvalidation(RecomposeScopeImpl scope, Object instance) {
        if (isComposing() == true) goto L5;
    L7:
        return false;
    L5:
        if (this.composer.tryImminentInvalidation$runtime_release(scope, instance) == false) goto L7;
        return true;
    }

    private final InvalidationResult invalidateChecked(RecomposeScopeImpl scope, Anchor anchor, Object instance) {
        Object lock$iv = this.lock;
        monitor-enter(lock$iv);
        CompositionImpl changeDelegate = this.invalidationDelegate;     // Catch: Throwable -> L89
        CompositionImpl delegate = null;
        if (changeDelegate != null) goto L93;
    L16:
        if (delegate == null) goto L18;
        CompositionImpl delegate2 = delegate;
    L79:
        monitor-exit(lock$iv);
        CompositionImpl delegate3 = delegate2;
        if (delegate3 != null) goto L83;
        this.parent.invalidate$runtime_release(this);
        if (isComposing() == false) goto L88;
        return InvalidationResult.DEFERRED;
    L88:
        return InvalidationResult.SCHEDULED;
    L83:
        return delegate3.invalidateChecked(scope, anchor, instance);
    L18:
        if (tryImminentInvalidation(scope, instance) == false) goto L22;
        InvalidationResult r7 = InvalidationResult.IMMINENT;     // Catch: Throwable -> L13
        monitor-exit(lock$iv);
        return r7;
    L22:
        CompositionObserver observer = observer();     // Catch: Throwable -> L89
        if (instance != null) goto L25;
        ScopeMap.m3918setimpl(this.invalidations, scope, ScopeInvalidated.INSTANCE);     // Catch: Throwable -> L13
        delegate2 = delegate;
        goto L79
    L25:
        if (observer == null) goto L27;
    L30:
        MutableScatterMap<Object, Object> r9 = this.invalidations;     // Catch: Throwable -> L89
        int r10 = 0;
        Object value$iv$iv = r9.get(scope);     // Catch: Throwable -> L89
        if (value$iv$iv != null) goto L33;
        delegate2 = delegate;
    L71:
        boolean r13 = false;
    L72:
        if (r13 == true) goto L79;
        ScopeMap.m3902addimpl(this.invalidations, scope, instance);     // Catch: Throwable -> L75
        goto L79
    L33:
        if ((value$iv$iv instanceof MutableScatterSet) == false) goto L63;
        ScatterSet this_$iv$iv$iv = (MutableScatterSet) value$iv$iv;     // Catch: Throwable -> L89
        Object[] elements$iv$iv$iv = this_$iv$iv$iv.elements;     // Catch: Throwable -> L89
        long[] m$iv$iv$iv$iv = this_$iv$iv$iv.metadata;     // Catch: Throwable -> L89
        int $i$f$synchronized = m$iv$iv$iv$iv.length;     // Catch: Throwable -> L75
        int lastIndex$iv$iv$iv$iv = $i$f$synchronized - 2;     // Catch: Throwable -> L75
        int i$iv$iv$iv$iv = 0;
        if (0 > lastIndex$iv$iv$iv$iv) goto L60;
    L38:
        long slot$iv$iv$iv$iv = m$iv$iv$iv$iv[i$iv$iv$iv$iv];     // Catch: Throwable -> L75
        CompositionObserver observer2 = observer;
        delegate2 = delegate;
        MutableScatterMap<Object, Object> r23 = r9;
        int r24 = r10;
        long $this$maskEmptyOrDeleted$iv$iv$iv$iv$iv = (((~slot$iv$iv$iv$iv) << 7) & slot$iv$iv$iv$iv) & (-9187201950435737472L);     // Catch: Throwable -> L75
        if ($this$maskEmptyOrDeleted$iv$iv$iv$iv$iv == (-9187201950435737472L)) goto L58;
        int r8 = 8;
        int bitCount$iv$iv$iv$iv = 8 - ((~(i$iv$iv$iv$iv - lastIndex$iv$iv$iv$iv)) >>> 31);     // Catch: Throwable -> L75
        int j$iv$iv$iv$iv = 0;
    L41:
        if (j$iv$iv$iv$iv >= bitCount$iv$iv$iv$iv) goto L57;
        long value$iv$iv$iv$iv$iv = slot$iv$iv$iv$iv & 255;     // Catch: Throwable -> L75
        if (value$iv$iv$iv$iv$iv >= 128) goto L45;
        int $i$f$isFull = 1;
    L46:
        if ($i$f$isFull == 0) goto L55;
        int index$iv$iv$iv$iv = (i$iv$iv$iv$iv << 3) + j$iv$iv$iv$iv;     // Catch: Throwable -> L75
        Object it$iv = elements$iv$iv$iv[index$iv$iv$iv$iv];     // Catch: Throwable -> L75
        if (it$iv != ScopeInvalidated.INSTANCE) goto L50;
        boolean r11 = true;
    L51:
        if (r11 == false) goto L55;
        r13 = true;
        goto L72
    L50:
        r11 = false;
    L55:
        slot$iv$iv$iv$iv = slot$iv$iv$iv$iv >> r8;     // Catch: Throwable -> L75
        j$iv$iv$iv$iv = j$iv$iv$iv$iv + 1;     // Catch: Throwable -> L75
        r8 = r8;
        goto L41
    L45:
        $i$f$isFull = 0;
        goto L46
    L57:
        if (bitCount$iv$iv$iv$iv != r8) goto L71;
    L58:
        if (i$iv$iv$iv$iv == lastIndex$iv$iv$iv$iv) goto L71;
        i$iv$iv$iv$iv = i$iv$iv$iv$iv + 1;     // Catch: Throwable -> L75
        r9 = r23;
        r10 = r24;
        delegate = delegate2;
        observer = observer2;
        goto L38
    L60:
        delegate2 = delegate;
        goto L71
    L63:
        delegate2 = delegate;
        if (value$iv$iv != ScopeInvalidated.INSTANCE) goto L66;
        boolean r12 = true;
    L67:
        if (r12 == false) goto L71;
        r13 = true;
        goto L72
    L66:
        r12 = false;
    L75:
        th = th;
    L91:
        monitor-exit(lock$iv);
        throw th;
    L27:
        if ((instance instanceof DerivedState) == true) goto L30;
        ScopeMap.m3918setimpl(this.invalidations, scope, ScopeInvalidated.INSTANCE);     // Catch: Throwable -> L13
        delegate2 = delegate;
        goto L79
    L93:
    L13:
        th = th;
        goto L91
    L10:
        if (this.slotTable.groupContainsAnchor(this.invalidationDelegateGroup, anchor) == false) goto L16;
        delegate = changeDelegate;
    L89:
        th = th;
        goto L91
    }

    public final void removeObservation$runtime_release(Object instance, RecomposeScopeImpl scope) {
        ScopeMap.m3915removeimpl(this.observations, instance, scope);
    }

    public final void removeDerivedStateObservation$runtime_release(DerivedState<?> r2) {
        if (ScopeMap.m3909containsimpl(this.observations, r2) == true) goto L6;
        ScopeMap.m3916removeScopeimpl(this.derivedStates, r2);
        return;
    }

    /* JADX INFO: renamed from: takeInvalidations-afanTW4, reason: not valid java name */
    private final MutableScatterMap<Object, Object> m3752takeInvalidationsafanTW4() {
        MutableScatterMap<Object, Object> r0 = this.invalidations;
        this.invalidations = ScopeMap.m3908constructorimpl$default(null, 1, null);
        return r0;
    }

    private final void validateRecomposeScopeAnchors(SlotTable slotTable) {
        SlotTable r0 = slotTable;
        Object[] $this$mapNotNull$iv = r0.getSlots();
        Collection destination$iv$iv = new ArrayList();
        int r8 = $this$mapNotNull$iv.length;
        int r9 = 0;
    L3:
        if (r9 >= r8) goto L11;
        Object element$iv$iv$iv = $this$mapNotNull$iv[r9];
        if ((element$iv$iv$iv instanceof RecomposeScopeImpl) == false) goto L7;
        RecomposeScopeImpl r15 = (RecomposeScopeImpl) element$iv$iv$iv;
    L8:
        if (r15 == null) goto L10;
        destination$iv$iv.add(r15);
    L10:
        r9 = r9 + 1;
        goto L3
    L7:
        r15 = null;
        goto L8
    L11:
        List scopes = (List) destination$iv$iv;
        int index$iv = 0;
        int r5 = scopes.size();
    L12:
        if (index$iv >= r5) goto L21;
        Object item$iv = scopes.get(index$iv);
        RecomposeScopeImpl scope = (RecomposeScopeImpl) item$iv;
        Anchor anchor = scope.getAnchor();
        if (anchor == null) goto L19;
        boolean value$iv = r0.slotsOf$runtime_release(anchor.toIndexFor(r0)).contains(scope);
        if (value$iv == true) goto L19;
        int dataIndex = ArraysKt.indexOf(r0.getSlots(), scope);
        PreconditionsKt.throwIllegalStateException("Misaligned anchor " + anchor + " in scope " + scope + " encountered, scope found at " + dataIndex);
    L19:
        index$iv = index$iv + 1;
        r0 = slotTable;
        goto L12
    }

    private final <T> T trackAbandonedValues(Function0<? extends T> r6) {
        return r6.invoke();
    L6:
        th = move-exception;
        if (0 == 0) goto L9;
    L11:
        throw th;
    L9:
        if (this.abandonSet.isEmpty() == true) goto L11;
        new RememberEventDispatcher(this.abandonSet).dispatchAbandons();
        goto L11
    }

    private final CompositionObserver observer() {
        CompositionObserverHolder holder = this.observerHolder;
        if (holder.getRoot() == true) goto L14;
        CompositionObserverHolder parentHolder = this.parent.getObserverHolder$runtime_release();
        if (parentHolder == null) goto L8;
        CompositionObserver parentObserver = parentHolder.getObserver();
    L10:
        if (Intrinsics.areEqual(parentObserver, holder.getObserver()) == true) goto L13;
        holder.setObserver(parentObserver);
    L13:
        return parentObserver;
    L8:
        parentObserver = null;
        goto L10
    L14:
        return holder.getObserver();
    }

    @Override // androidx.compose.runtime.ReusableComposition
    public void deactivate() {
        Object lock$iv = this.lock;
        monitor-enter(lock$iv);
    L43:
        th = th;
    L45:
        monitor-exit(lock$iv);
        throw th;
    L6:
        if (this.slotTable.getGroupsSize() <= 0) goto L8;
        boolean r0 = true;
    L9:
        boolean nonEmptySlotTable = r0;
        if (nonEmptySlotTable == false) goto L49;
    L17:
        Object token$iv = Trace.INSTANCE.beginSection("Compose:deactivate");     // Catch: Throwable -> L43
        RememberEventDispatcher manager = new RememberEventDispatcher(this.abandonSet);     // Catch: Throwable -> L39
        if (nonEmptySlotTable == false) goto L30;
        this.applier.onBeginChanges();     // Catch: Throwable -> L39
        SlotTable this_$iv = this.slotTable;     // Catch: Throwable -> L39
        SlotWriter writer$iv = this_$iv.openWriter();     // Catch: Throwable -> L39
        ComposerKt.deactivateCurrentGroup(writer$iv, manager);     // Catch: Throwable -> L26
        Unit r1 = Unit.INSTANCE;     // Catch: Throwable -> L26
    L25:
        writer$iv.close(true);     // Catch: Throwable -> L37
        this.applier.onEndChanges();     // Catch: Throwable -> L37
        manager.dispatchRememberObservers();     // Catch: Throwable -> L37
    L26:
        th = move-exception;
        writer$iv.close(false);     // Catch: Throwable -> L37
        throw th;     // Catch: Throwable -> L37
    L37:
        th = th;
    L41:
        Trace.INSTANCE.endSection(token$iv);     // Catch: Throwable -> L35
        throw th;     // Catch: Throwable -> L35
    L30:
        manager.dispatchAbandons();     // Catch: Throwable -> L37
        Unit r2 = Unit.INSTANCE;     // Catch: Throwable -> L37
        Trace.INSTANCE.endSection(token$iv);     // Catch: Throwable -> L35
    L32:
        ScopeMap.m3906clearimpl(this.observations);     // Catch: Throwable -> L35
        ScopeMap.m3906clearimpl(this.derivedStates);     // Catch: Throwable -> L35
        ScopeMap.m3906clearimpl(this.invalidations);     // Catch: Throwable -> L35
        this.changes.clear();     // Catch: Throwable -> L35
        this.lateChanges.clear();     // Catch: Throwable -> L35
        this.composer.deactivate$runtime_release();     // Catch: Throwable -> L35
        Unit r3 = Unit.INSTANCE;     // Catch: Throwable -> L35
        monitor-exit(lock$iv);
        return;
    L39:
        th = th;
        goto L41
    L49:
        if (this.abandonSet.isEmpty() == true) goto L32;
    L15:
        th = th;
    L35:
        th = th;
        goto L45
    L8:
        r0 = false;
        goto L9
    }

    public final int composerStacksSizes$runtime_release() {
        return this.composer.stacksSize$runtime_release();
    }
}
