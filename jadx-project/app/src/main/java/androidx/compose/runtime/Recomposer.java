package androidx.compose.runtime;

import androidx.autofill.HintConstants;
import androidx.collection.MutableObjectList;
import androidx.collection.MutableScatterMap;
import androidx.collection.MutableScatterSet;
import androidx.collection.ObjectList;
import androidx.collection.ObjectListKt;
import androidx.collection.ScatterMap;
import androidx.collection.ScatterMapKt;
import androidx.collection.ScatterSet;
import androidx.collection.ScatterSetKt;
import androidx.compose.runtime.collection.MultiValueMap;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.runtime.collection.ScatterSetWrapperKt;
import androidx.compose.runtime.external.kotlinx.collections.immutable.ExtensionsKt;
import androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentSet;
import androidx.compose.runtime.internal.SnapshotThreadLocal;
import androidx.compose.runtime.internal.Utils_androidKt;
import androidx.compose.runtime.snapshots.MutableSnapshot;
import androidx.compose.runtime.snapshots.ObserverHandle;
import androidx.compose.runtime.snapshots.Snapshot;
import androidx.compose.runtime.snapshots.SnapshotApplyResult;
import androidx.compose.runtime.tooling.CompositionData;
import androidx.compose.runtime.tooling.CompositionObserverHandle;
import androidx.compose.runtime.tooling.CompositionRegistrationObserver;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ReplaceWith;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.CompletableJob;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;

/* JADX INFO: compiled from: Recomposer.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000Ð\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010#\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\r\b\u0007\u0018\u0000 Ú\u00012\u00020\u0001:\nÚ\u0001Û\u0001Ü\u0001Ý\u0001Þ\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0015\u0010p\u001a\u00020q2\u0006\u0010r\u001a\u00020_H\u0001¢\u0006\u0002\bsJ\u0010\u0010t\u001a\u00020o2\u0006\u0010\u001e\u001a\u00020\u0007H\u0002J\u0010\u0010u\u001a\u00020o2\u0006\u0010v\u001a\u00020wH\u0002J\u0006\u0010x\u001a\u00020yJ\u000e\u0010z\u001a\u00020oH\u0086@¢\u0006\u0002\u0010{J\u000e\u0010|\u001a\u00020oH\u0082@¢\u0006\u0002\u0010{J\u0006\u0010}\u001a\u00020oJ\b\u0010~\u001a\u00020oH\u0002J\u0006\u0010\u007f\u001a\u00020oJ0\u0010\u0080\u0001\u001a\u00020o2\u0006\u0010\u001e\u001a\u00020\u00072\u0014\u0010\u0081\u0001\u001a\u000f\u0012\u0004\u0012\u00020o0\u0082\u0001¢\u0006\u0003\b\u0083\u0001H\u0010¢\u0006\u0006\b\u0084\u0001\u0010\u0085\u0001JA\u0010\u0086\u0001\u001a\t\u0012\u0004\u0012\u00020X0\u0087\u00012\u0006\u0010\u001e\u001a\u00020\u00072\b\u0010\u0088\u0001\u001a\u00030\u0089\u00012\u0014\u0010\u0081\u0001\u001a\u000f\u0012\u0004\u0012\u00020o0\u0082\u0001¢\u0006\u0003\b\u0083\u0001H\u0010¢\u0006\u0006\b\u008a\u0001\u0010\u008b\u0001JB\u0010\u008c\u0001\u001a\u0003H\u008d\u0001\"\u0005\b\u0000\u0010\u008d\u00012\u0006\u0010\u001e\u001a\u00020\u00072\u000f\u0010\u008e\u0001\u001a\n\u0012\u0004\u0012\u00020Q\u0018\u00010W2\u000f\u0010\u008f\u0001\u001a\n\u0012\u0005\u0012\u0003H\u008d\u00010\u0082\u0001H\u0082\b¢\u0006\u0003\u0010\u0090\u0001J\u0018\u0010\u0091\u0001\u001a\u00020o2\u0007\u0010\u0092\u0001\u001a\u00020IH\u0010¢\u0006\u0003\b\u0093\u0001J\u0011\u0010\u0094\u0001\u001a\n\u0012\u0004\u0012\u00020o\u0018\u00010nH\u0002J\t\u0010\u0095\u0001\u001a\u00020oH\u0002J\u0018\u0010\u0096\u0001\u001a\u00020o2\u0007\u0010\u0092\u0001\u001a\u00020IH\u0010¢\u0006\u0003\b\u0097\u0001J\u0017\u0010\u0098\u0001\u001a\u00020o2\u0006\u0010\u001e\u001a\u00020\u0007H\u0010¢\u0006\u0003\b\u0099\u0001J\u0018\u0010\u009a\u0001\u001a\u00020o2\u0007\u0010\u009b\u0001\u001a\u00020XH\u0010¢\u0006\u0003\b\u009c\u0001J\u000f\u0010\u009d\u0001\u001a\u00020oH\u0086@¢\u0006\u0002\u0010{J/\u0010\u009e\u0001\u001a\u00020o2\u0007\u0010\u0092\u0001\u001a\u00020I2\u0007\u0010\u009f\u0001\u001a\u00020T2\f\u0010 \u0001\u001a\u0007\u0012\u0002\b\u00030¡\u0001H\u0010¢\u0006\u0003\b¢\u0001J\u001a\u0010£\u0001\u001a\u0004\u0018\u00010T2\u0007\u0010\u0092\u0001\u001a\u00020IH\u0010¢\u0006\u0003\b¤\u0001J\u0007\u0010¥\u0001\u001a\u00020oJ\u0011\u0010¦\u0001\u001a\u00020o2\u0006\u0010\u001e\u001a\u00020\u0007H\u0002J/\u0010§\u0001\u001a\b\u0012\u0004\u0012\u00020\u00070\t2\r\u0010¨\u0001\u001a\b\u0012\u0004\u0012\u00020I0\t2\u000f\u0010\u008e\u0001\u001a\n\u0012\u0004\u0012\u00020Q\u0018\u00010WH\u0002J$\u0010©\u0001\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u001e\u001a\u00020\u00072\u000f\u0010\u008e\u0001\u001a\n\u0012\u0004\u0012\u00020Q\u0018\u00010WH\u0002J*\u0010ª\u0001\u001a\u00020o2\u0007\u0010«\u0001\u001a\u00020\u00152\u000b\b\u0002\u0010¬\u0001\u001a\u0004\u0018\u00010\u00072\t\b\u0002\u0010\u00ad\u0001\u001a\u00020\u0017H\u0002J\u001e\u0010®\u0001\u001a\u000f\u0012\u0004\u0012\u00020Q\u0012\u0004\u0012\u00020o0¯\u00012\u0006\u0010\u001e\u001a\u00020\u0007H\u0002J8\u0010°\u0001\u001a\t\u0012\u0004\u0012\u00020X0\u0087\u00012\u0006\u0010\u001e\u001a\u00020\u00072\b\u0010\u0088\u0001\u001a\u00030\u0089\u00012\u000e\u0010±\u0001\u001a\t\u0012\u0004\u0012\u00020X0\u0087\u0001H\u0010¢\u0006\u0003\b²\u0001JW\u0010³\u0001\u001a\u00020o2E\u0010\u008f\u0001\u001a@\b\u0001\u0012\u0005\u0012\u00030µ\u0001\u0012\u0017\u0012\u00150¶\u0001¢\u0006\u000f\b·\u0001\u0012\n\b¸\u0001\u0012\u0005\b\b(¹\u0001\u0012\u000b\u0012\t\u0012\u0004\u0012\u00020o0º\u0001\u0012\u0006\u0012\u0004\u0018\u00010Q0´\u0001¢\u0006\u0003\b»\u0001H\u0082@¢\u0006\u0003\u0010¼\u0001J\t\u0010½\u0001\u001a\u00020\u0017H\u0002J \u0010½\u0001\u001a\u00020o2\u0014\u0010¾\u0001\u001a\u000f\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020o0¯\u0001H\u0082\bJ\u0011\u0010¿\u0001\u001a\u00020o2\u0006\u0010\u001e\u001a\u00020\u0007H\u0002J\u001f\u0010À\u0001\u001a\u00020o2\u000e\u0010Á\u0001\u001a\t\u0012\u0005\u0012\u00030Â\u00010&H\u0010¢\u0006\u0003\bÃ\u0001J\u0017\u0010Ä\u0001\u001a\u00020o2\u0006\u0010\u001e\u001a\u00020\u0007H\u0010¢\u0006\u0003\bÅ\u0001J\u0012\u0010Æ\u0001\u001a\u00020o2\u0007\u0010Ç\u0001\u001a\u00020cH\u0002J\u0011\u0010È\u0001\u001a\u00020o2\u0006\u0010\u001e\u001a\u00020\u0007H\u0002J\u0018\u0010É\u0001\u001a\u00020o2\u0007\u0010\u009b\u0001\u001a\u00020XH\u0010¢\u0006\u0003\bÊ\u0001J\u0017\u0010Ë\u0001\u001a\u00020o2\u0006\u0010\u001e\u001a\u00020\u0007H\u0010¢\u0006\u0003\bÌ\u0001J\u000b\u0010Í\u0001\u001a\u0004\u0018\u000105H\u0002J\u0007\u0010Î\u0001\u001a\u00020oJ\t\u0010Ï\u0001\u001a\u00020oH\u0002J$\u0010Ð\u0001\u001a\u00020o2\b\u0010¹\u0001\u001a\u00030¶\u00012\b\u0010Ñ\u0001\u001a\u00030Ò\u0001H\u0082@¢\u0006\u0003\u0010Ó\u0001J\u000f\u0010Ô\u0001\u001a\u00020oH\u0086@¢\u0006\u0002\u0010{J\u0018\u0010Õ\u0001\u001a\u00020o2\u0006\u0010Y\u001a\u00020\u0003H\u0087@¢\u0006\u0003\u0010Ö\u0001J\u0017\u0010×\u0001\u001a\u00020o2\u0006\u0010\u001e\u001a\u00020\u0007H\u0010¢\u0006\u0003\bØ\u0001J/\u0010Ù\u0001\u001a\u000f\u0012\u0004\u0012\u00020Q\u0012\u0004\u0012\u00020o0¯\u00012\u0006\u0010\u001e\u001a\u00020\u00072\u000f\u0010\u008e\u0001\u001a\n\u0012\u0004\u0012\u00020Q\u0018\u00010WH\u0002R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u001e\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u0010@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0015X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0016\u001a\u00020\u00178PX\u0090\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001a\u001a\u00020\u00178PX\u0090\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u0019R\u0014\u0010\u001c\u001a\u00020\u00178PX\u0090\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u0019R\u0016\u0010\u001e\u001a\u0004\u0018\u00010\u001f8PX\u0090\u0004¢\u0006\u0006\u001a\u0004\b \u0010!R\u0014\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00070#X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010%\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010&X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010'\u001a\u00020(8PX\u0090\u0004¢\u0006\u0006\u001a\u0004\b)\u0010*R\u000e\u0010+\u001a\u00020(X\u0082\u000e¢\u0006\u0002\n\u0000R\u0017\u0010,\u001a\b\u0012\u0004\u0012\u00020\f0-8F¢\u0006\u0006\u001a\u0004\b.\u0010/R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b0\u00101R\u000e\u00102\u001a\u000203X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u00104\u001a\u0004\u0018\u000105X\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u00106\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u00107\u001a\u00020\u0017X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u00108\u001a\u00020\u00178BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b9\u0010\u0019R\u0014\u0010:\u001a\u00020\u00178BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b;\u0010\u0019R\u0014\u0010<\u001a\u00020\u00178BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b=\u0010\u0019R\u0014\u0010>\u001a\u00020\u00178BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b?\u0010\u0019R\u0011\u0010@\u001a\u00020\u00178F¢\u0006\u0006\u001a\u0004\bA\u0010\u0019R\u0014\u0010B\u001a\u00020\u00178BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bC\u0010\u0019R\u000e\u0010D\u001a\u00020\u0017X\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010E\u001a\b\u0012\u0004\u0012\u00020\u00070\t8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bF\u0010GR\u0014\u0010H\u001a\b\u0012\u0004\u0012\u00020I0\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\"\u0010J\u001a\u000e\u0012\u0004\u0012\u00020I\u0012\u0004\u0012\u00020I0KX\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\n\u0002\u0010LR\u000e\u0010M\u001a\u00020NX\u0082\u0004¢\u0006\u0002\n\u0000R*\u0010O\u001a\u0016\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010Q0P\u0012\u0004\u0012\u00020I0KX\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\n\u0002\u0010LR\u001a\u0010R\u001a\u000e\u0012\u0004\u0012\u00020I\u0012\u0004\u0012\u00020T0SX\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010U\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020X\u0018\u00010W0VX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010Y\u001a\u00020\u00038PX\u0090\u0004¢\u0006\u0006\u001a\u0004\bZ\u00101R\u0012\u0010[\u001a\u00060\\R\u00020\u0000X\u0082\u0004¢\u0006\u0002\n\u0000R \u0010]\u001a\n\u0012\u0004\u0012\u00020_\u0018\u00010^8\u0002@\u0002X\u0083\u000e¢\u0006\b\n\u0000\u0012\u0004\b`\u0010aR\u0010\u0010b\u001a\u0004\u0018\u00010cX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010d\u001a\u00020\u00178BX\u0082\u0004¢\u0006\u0006\u001a\u0004\be\u0010\u0019R\u0014\u0010f\u001a\b\u0012\u0004\u0012\u00020Q0WX\u0082\u000e¢\u0006\u0002\n\u0000R \u0010g\u001a\b\u0012\u0004\u0012\u00020\f0h8FX\u0087\u0004¢\u0006\f\u0012\u0004\bi\u0010a\u001a\u0004\bj\u0010kR\u000e\u0010l\u001a\u00020QX\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010m\u001a\n\u0012\u0004\u0012\u00020o\u0018\u00010nX\u0082\u000e¢\u0006\u0002\n\u0000\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006ß\u0001"}, d2 = {"Landroidx/compose/runtime/Recomposer;", "Landroidx/compose/runtime/CompositionContext;", "effectCoroutineContext", "Lkotlin/coroutines/CoroutineContext;", "(Lkotlin/coroutines/CoroutineContext;)V", "_knownCompositions", "", "Landroidx/compose/runtime/ControlledComposition;", "_knownCompositionsCache", "", "_state", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Landroidx/compose/runtime/Recomposer$State;", "broadcastFrameClock", "Landroidx/compose/runtime/BroadcastFrameClock;", "<set-?>", "", "changeCount", "getChangeCount", "()J", "closeCause", "", "collectingCallByInformation", "", "getCollectingCallByInformation$runtime_release", "()Z", "collectingParameterInformation", "getCollectingParameterInformation$runtime_release", "collectingSourceInformation", "getCollectingSourceInformation$runtime_release", "composition", "Landroidx/compose/runtime/Composition;", "getComposition$runtime_release", "()Landroidx/compose/runtime/Composition;", "compositionInvalidations", "Landroidx/compose/runtime/collection/MutableVector;", "compositionsAwaitingApply", "compositionsRemoved", "", "compoundHashKey", "", "getCompoundHashKey$runtime_release", "()I", "concurrentCompositionsOutstanding", "currentState", "Lkotlinx/coroutines/flow/StateFlow;", "getCurrentState", "()Lkotlinx/coroutines/flow/StateFlow;", "getEffectCoroutineContext", "()Lkotlin/coroutines/CoroutineContext;", "effectJob", "Lkotlinx/coroutines/CompletableJob;", "errorState", "Landroidx/compose/runtime/Recomposer$RecomposerErrorState;", "failedCompositions", "frameClockPaused", "hasBroadcastFrameClockAwaiters", "getHasBroadcastFrameClockAwaiters", "hasBroadcastFrameClockAwaitersLocked", "getHasBroadcastFrameClockAwaitersLocked", "hasConcurrentFrameWorkLocked", "getHasConcurrentFrameWorkLocked", "hasFrameWorkLocked", "getHasFrameWorkLocked", "hasPendingWork", "getHasPendingWork", "hasSchedulingWork", "getHasSchedulingWork", "isClosed", "knownCompositions", "getKnownCompositions", "()Ljava/util/List;", "movableContentAwaitingInsert", "Landroidx/compose/runtime/MovableContentStateReference;", "movableContentNestedExtractionsPending", "Landroidx/compose/runtime/collection/MultiValueMap;", "Landroidx/collection/MutableScatterMap;", "movableContentNestedStatesAvailable", "Landroidx/compose/runtime/NestedContentMap;", "movableContentRemoved", "Landroidx/compose/runtime/MovableContent;", "", "movableContentStatesAvailable", "Landroidx/collection/MutableScatterMap;", "Landroidx/compose/runtime/MovableContentState;", "pausedScopes", "Landroidx/compose/runtime/internal/SnapshotThreadLocal;", "Landroidx/collection/MutableScatterSet;", "Landroidx/compose/runtime/RecomposeScopeImpl;", "recomposeCoroutineContext", "getRecomposeCoroutineContext$runtime_release", "recomposerInfo", "Landroidx/compose/runtime/Recomposer$RecomposerInfoImpl;", "registrationObservers", "Landroidx/collection/MutableObjectList;", "Landroidx/compose/runtime/tooling/CompositionRegistrationObserver;", "getRegistrationObservers$annotations", "()V", "runnerJob", "Lkotlinx/coroutines/Job;", "shouldKeepRecomposing", "getShouldKeepRecomposing", "snapshotInvalidations", "state", "Lkotlinx/coroutines/flow/Flow;", "getState$annotations", "getState", "()Lkotlinx/coroutines/flow/Flow;", "stateLock", "workContinuation", "Lkotlinx/coroutines/CancellableContinuation;", "", "addCompositionRegistrationObserver", "Landroidx/compose/runtime/tooling/CompositionObserverHandle;", "observer", "addCompositionRegistrationObserver$runtime_release", "addKnownCompositionLocked", "applyAndCheck", "snapshot", "Landroidx/compose/runtime/snapshots/MutableSnapshot;", "asRecomposerInfo", "Landroidx/compose/runtime/RecomposerInfo;", "awaitIdle", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "awaitWorkAvailable", "cancel", "clearKnownCompositionsLocked", "close", "composeInitial", "content", "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "composeInitial$runtime_release", "(Landroidx/compose/runtime/ControlledComposition;Lkotlin/jvm/functions/Function2;)V", "composeInitialPaused", "Landroidx/collection/ScatterSet;", "shouldPause", "Landroidx/compose/runtime/ShouldPauseCallback;", "composeInitialPaused$runtime_release", "(Landroidx/compose/runtime/ControlledComposition;Landroidx/compose/runtime/ShouldPauseCallback;Lkotlin/jvm/functions/Function2;)Landroidx/collection/ScatterSet;", "composing", "T", "modifiedValues", "block", "(Landroidx/compose/runtime/ControlledComposition;Landroidx/collection/MutableScatterSet;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "deletedMovableContent", "reference", "deletedMovableContent$runtime_release", "deriveStateLocked", "discardUnusedMovableContentState", "insertMovableContent", "insertMovableContent$runtime_release", "invalidate", "invalidate$runtime_release", "invalidateScope", "scope", "invalidateScope$runtime_release", "join", "movableContentStateReleased", "data", "applier", "Landroidx/compose/runtime/Applier;", "movableContentStateReleased$runtime_release", "movableContentStateResolve", "movableContentStateResolve$runtime_release", "pauseCompositionFrameClock", "performInitialMovableContentInserts", "performInsertValues", "references", "performRecompose", "processCompositionError", "e", "failedInitialComposition", "recoverable", "readObserverOf", "Lkotlin/Function1;", "recomposePaused", "invalidScopes", "recomposePaused$runtime_release", "recompositionRunner", "Lkotlin/Function3;", "Lkotlinx/coroutines/CoroutineScope;", "Landroidx/compose/runtime/MonotonicFrameClock;", "Lkotlin/ParameterName;", HintConstants.AUTOFILL_HINT_NAME, "parentFrameClock", "Lkotlin/coroutines/Continuation;", "Lkotlin/ExtensionFunctionType;", "(Lkotlin/jvm/functions/Function3;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "recordComposerModifications", "onEachInvalidComposition", "recordFailedCompositionLocked", "recordInspectionTable", "table", "Landroidx/compose/runtime/tooling/CompositionData;", "recordInspectionTable$runtime_release", "registerComposition", "registerComposition$runtime_release", "registerRunnerJob", "callingJob", "removeKnownCompositionLocked", "reportPausedScope", "reportPausedScope$runtime_release", "reportRemovedComposition", "reportRemovedComposition$runtime_release", "resetErrorState", "resumeCompositionFrameClock", "retryFailedCompositions", "runFrameLoop", "frameSignal", "Landroidx/compose/runtime/ProduceFrameSignal;", "(Landroidx/compose/runtime/MonotonicFrameClock;Landroidx/compose/runtime/ProduceFrameSignal;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "runRecomposeAndApplyChanges", "runRecomposeConcurrentlyAndApplyChanges", "(Lkotlin/coroutines/CoroutineContext;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "unregisterComposition", "unregisterComposition$runtime_release", "writeObserverOf", "Companion", "HotReloadable", "RecomposerErrorState", "RecomposerInfoImpl", "State", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class Recomposer extends CompositionContext {
    public static final int $stable = 0;
    public static final Companion Companion = null;
    private static final AtomicReference<Boolean> _hotReloadEnabled = null;
    private static final MutableStateFlow<PersistentSet<RecomposerInfoImpl>> _runningRecomposers = null;
    private final List<ControlledComposition> _knownCompositions;
    private List<? extends ControlledComposition> _knownCompositionsCache;
    private final MutableStateFlow<State> _state;
    private final BroadcastFrameClock broadcastFrameClock;
    private long changeCount;
    private Throwable closeCause;
    private final MutableVector<ControlledComposition> compositionInvalidations;
    private final List<ControlledComposition> compositionsAwaitingApply;
    private Set<ControlledComposition> compositionsRemoved;
    private int concurrentCompositionsOutstanding;
    private final CoroutineContext effectCoroutineContext;
    private final CompletableJob effectJob;
    private RecomposerErrorState errorState;
    private List<ControlledComposition> failedCompositions;
    private boolean frameClockPaused;
    private boolean isClosed;
    private final List<MovableContentStateReference> movableContentAwaitingInsert;
    private final MutableScatterMap<Object, Object> movableContentNestedExtractionsPending;
    private final NestedContentMap movableContentNestedStatesAvailable;
    private final MutableScatterMap<Object, Object> movableContentRemoved;
    private final MutableScatterMap<MovableContentStateReference, MovableContentState> movableContentStatesAvailable;
    private final SnapshotThreadLocal<MutableScatterSet<RecomposeScopeImpl>> pausedScopes;
    private final RecomposerInfoImpl recomposerInfo;
    private MutableObjectList<CompositionRegistrationObserver> registrationObservers;
    private Job runnerJob;
    private MutableScatterSet<Object> snapshotInvalidations;
    private final Object stateLock;
    private CancellableContinuation<? super Unit> workContinuation;

    /* JADX INFO: compiled from: Recomposer.kt */
    @Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u000b\b\u0087\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0014\u0010\u0013\u001a\u00020\u00142\n\u0010\u0015\u001a\u00060\u000bR\u00020\fH\u0002J\r\u0010\u0016\u001a\u00020\u0014H\u0000¢\u0006\u0002\b\u0017J\u0013\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fH\u0000¢\u0006\u0002\b\u0019J\u0013\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001bH\u0000¢\u0006\u0002\b\u001dJ\u0015\u0010\u001e\u001a\u00020\u00142\u0006\u0010\u001f\u001a\u00020 H\u0000¢\u0006\u0002\b!J\u0015\u0010\"\u001a\u00020\u00142\u0006\u0010#\u001a\u00020\u0001H\u0000¢\u0006\u0002\b$J\u0014\u0010%\u001a\u00020\u00142\n\u0010\u0015\u001a\u00060\u000bR\u00020\fH\u0002J\r\u0010&\u001a\u00020\u0001H\u0000¢\u0006\u0002\b'J\u0015\u0010(\u001a\u00020\u00142\u0006\u0010)\u001a\u00020\u0005H\u0000¢\u0006\u0002\b*R.\u0010\u0003\u001a\"\u0012\f\u0012\n \u0006*\u0004\u0018\u00010\u00050\u00050\u0004j\u0010\u0012\f\u0012\n \u0006*\u0004\u0018\u00010\u00050\u0005`\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u001e\u0010\b\u001a\u0012\u0012\u000e\u0012\f\u0012\b\u0012\u00060\u000bR\u00020\f0\n0\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u001d\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u000f0\u000e8F¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012¨\u0006+"}, d2 = {"Landroidx/compose/runtime/Recomposer$Companion;", "", "()V", "_hotReloadEnabled", "Ljava/util/concurrent/atomic/AtomicReference;", "", "kotlin.jvm.PlatformType", "Landroidx/compose/runtime/internal/AtomicReference;", "_runningRecomposers", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentSet;", "Landroidx/compose/runtime/Recomposer$RecomposerInfoImpl;", "Landroidx/compose/runtime/Recomposer;", "runningRecomposers", "Lkotlinx/coroutines/flow/StateFlow;", "", "Landroidx/compose/runtime/RecomposerInfo;", "getRunningRecomposers", "()Lkotlinx/coroutines/flow/StateFlow;", "addRunning", "", "info", "clearErrors", "clearErrors$runtime_release", "currentRunningRecomposers", "currentRunningRecomposers$runtime_release", "getCurrentErrors", "", "Landroidx/compose/runtime/RecomposerErrorInfo;", "getCurrentErrors$runtime_release", "invalidateGroupsWithKey", "key", "", "invalidateGroupsWithKey$runtime_release", "loadStateAndComposeForHotReload", "token", "loadStateAndComposeForHotReload$runtime_release", "removeRunning", "saveStateAndDisposeForHotReload", "saveStateAndDisposeForHotReload$runtime_release", "setHotReloadEnabled", "value", "setHotReloadEnabled$runtime_release", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker r1) {
            this();
        }

        private Companion() {
        }

        public static final /* synthetic */ void access$addRunning(Companion $this, RecomposerInfoImpl info) {
            $this.addRunning(info);
        }

        public static final /* synthetic */ void access$removeRunning(Companion $this, RecomposerInfoImpl info) {
            $this.removeRunning(info);
        }

        public final StateFlow<Set<RecomposerInfo>> getRunningRecomposers() {
            return Recomposer.access$get_runningRecomposers$cp();
        }

        public final Set<RecomposerInfo> currentRunningRecomposers$runtime_release() {
            return (Set) Recomposer.access$get_runningRecomposers$cp().getValue();
        }

        public final void setHotReloadEnabled$runtime_release(boolean value) {
            Recomposer.access$get_hotReloadEnabled$cp().set(Boolean.valueOf(value));
        }

        private final void addRunning(RecomposerInfoImpl info) {
        L2:
            PersistentSet old = (PersistentSet) Recomposer.access$get_runningRecomposers$cp().getValue();
            PersistentSet r1 = old.add(info);
            if (old == r1) goto L6;
            if (Recomposer.access$get_runningRecomposers$cp().compareAndSet(old, r1) == false) goto L2;
            return;
        }

        private final void removeRunning(RecomposerInfoImpl info) {
        L2:
            PersistentSet old = (PersistentSet) Recomposer.access$get_runningRecomposers$cp().getValue();
            PersistentSet r1 = old.remove(info);
            if (old == r1) goto L6;
            if (Recomposer.access$get_runningRecomposers$cp().compareAndSet(old, r1) == false) goto L2;
            return;
        }

        public final Object saveStateAndDisposeForHotReload$runtime_release() {
            Recomposer.access$get_hotReloadEnabled$cp().set(true);
            Iterable $this$flatMap$iv = (Iterable) Recomposer.access$get_runningRecomposers$cp().getValue();
            Collection destination$iv$iv = new ArrayList();
            Iterator r5 = $this$flatMap$iv.iterator();
        L4:
            if (r5.hasNext() == false) goto L7;
            Object element$iv$iv = r5.next();
            RecomposerInfoImpl it = (RecomposerInfoImpl) element$iv$iv;
            Iterable list$iv$iv = it.saveStateAndDisposeForHotReload();
            CollectionsKt.addAll(destination$iv$iv, list$iv$iv);
            goto L4
        L7:
            return (List) destination$iv$iv;
        }

        public final void loadStateAndComposeForHotReload$runtime_release(Object token) {
            Recomposer.access$get_hotReloadEnabled$cp().set(true);
            Iterable $this$forEach$iv = (Iterable) Recomposer.access$get_runningRecomposers$cp().getValue();
            Iterator r2 = $this$forEach$iv.iterator();
        L4:
            if (r2.hasNext() == false) goto L6;
            Object element$iv = r2.next();
            RecomposerInfoImpl it = (RecomposerInfoImpl) element$iv;
            it.resetErrorState();
            goto L4
        L6:
            Intrinsics.checkNotNull(token, "null cannot be cast to non-null type kotlin.collections.List<androidx.compose.runtime.Recomposer.HotReloadable>");
            List holders = (List) token;
            int index$iv = 0;
            int r4 = holders.size();
        L7:
            if (index$iv >= r4) goto L9;
            Object item$iv = holders.get(index$iv);
            HotReloadable it2 = (HotReloadable) item$iv;
            it2.resetContent();
            index$iv = index$iv + 1;
            goto L7
        L9:
            int index$iv2 = 0;
            int r5 = holders.size();
        L10:
            if (index$iv2 >= r5) goto L12;
            Object item$iv2 = holders.get(index$iv2);
            HotReloadable it3 = (HotReloadable) item$iv2;
            it3.recompose();
            index$iv2 = index$iv2 + 1;
            goto L10
        L12:
            Iterable $this$forEach$iv2 = (Iterable) Recomposer.access$get_runningRecomposers$cp().getValue();
            Iterator r3 = $this$forEach$iv2.iterator();
        L14:
            if (r3.hasNext() == false) goto L17;
            Object element$iv2 = r3.next();
            RecomposerInfoImpl it4 = (RecomposerInfoImpl) element$iv2;
            it4.retryFailedCompositions();
            goto L14
        }

        public final void invalidateGroupsWithKey$runtime_release(int key) {
            Recomposer.access$get_hotReloadEnabled$cp().set(true);
            Iterable $this$forEach$iv = (Iterable) Recomposer.access$get_runningRecomposers$cp().getValue();
            Iterator r3 = $this$forEach$iv.iterator();
        L4:
            if (r3.hasNext() == false) goto L15;
            Object element$iv = r3.next();
            RecomposerInfoImpl it = (RecomposerInfoImpl) element$iv;
            RecomposerErrorInfo r7 = it.getCurrentError();
            boolean r8 = false;
            if (r7 != null) goto L8;
        L10:
            if (r8 == true) goto L4;
            it.resetErrorState();
            it.invalidateGroupsWithKey(key);
            it.retryFailedCompositions();
            goto L4
        L8:
            if (r7.getRecoverable() == true) goto L10;
            r8 = true;
            goto L10
        }

        public final List<RecomposerErrorInfo> getCurrentErrors$runtime_release() {
            Iterable $this$mapNotNull$iv = (Iterable) Recomposer.access$get_runningRecomposers$cp().getValue();
            Collection destination$iv$iv = new ArrayList();
            Iterator r7 = $this$mapNotNull$iv.iterator();
        L4:
            if (r7.hasNext() == false) goto L10;
            Object element$iv$iv$iv = r7.next();
            RecomposerInfoImpl it = (RecomposerInfoImpl) element$iv$iv$iv;
            RecomposerErrorInfo r11 = it.getCurrentError();
            if (r11 == null) goto L4;
            destination$iv$iv.add(r11);
            goto L4
        L10:
            return (List) destination$iv$iv;
        }

        public final void clearErrors$runtime_release() {
            Iterable $this$mapNotNull$iv = (Iterable) Recomposer.access$get_runningRecomposers$cp().getValue();
            Collection destination$iv$iv = new ArrayList();
            Iterator r7 = $this$mapNotNull$iv.iterator();
        L4:
            if (r7.hasNext() == false) goto L9;
            Object element$iv$iv$iv = r7.next();
            RecomposerInfoImpl it = (RecomposerInfoImpl) element$iv$iv$iv;
            RecomposerErrorState r11 = it.resetErrorState();
            if (r11 == null) goto L4;
            destination$iv$iv.add(r11);
            goto L4
        L9:
            ArrayList r2 = (List) destination$iv$iv;
        }
    }

    /* JADX INFO: compiled from: Recomposer.kt */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0006\u0010\n\u001a\u00020\u0007J\u0006\u0010\u000b\u001a\u00020\u0007J\u0006\u0010\f\u001a\u00020\u0007R\u001b\u0010\u0005\u001a\r\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0002\b\bX\u0082\u000e¢\u0006\u0004\n\u0002\u0010\tR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Landroidx/compose/runtime/Recomposer$HotReloadable;", "", "composition", "Landroidx/compose/runtime/CompositionImpl;", "(Landroidx/compose/runtime/CompositionImpl;)V", "composable", "Lkotlin/Function0;", "", "Landroidx/compose/runtime/Composable;", "Lkotlin/jvm/functions/Function2;", "clearContent", "recompose", "resetContent", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    private static final class HotReloadable {
        private Function2<? super Composer, ? super Integer, Unit> composable;
        private final CompositionImpl composition;

        public HotReloadable(CompositionImpl composition) {
            this.composition = composition;
            this.composable = this.composition.getComposable();
        }

        public final void clearContent() {
            if (this.composition.isRoot() == false) goto L6;
            this.composition.setContent(ComposableSingletons$RecomposerKt.INSTANCE.m3746getLambda1$runtime_release());
            return;
        }

        public final void resetContent() {
            this.composition.setComposable(this.composable);
        }

        public final void recompose() {
            if (this.composition.isRoot() == false) goto L6;
            this.composition.setContent(this.composable);
            return;
        }
    }

    /* JADX INFO: compiled from: Recomposer.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0006\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Landroidx/compose/runtime/Recomposer$RecomposerErrorState;", "Landroidx/compose/runtime/RecomposerErrorInfo;", "recoverable", "", "cause", "", "(ZLjava/lang/Throwable;)V", "getCause", "()Ljava/lang/Throwable;", "getRecoverable", "()Z", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    private static final class RecomposerErrorState implements RecomposerErrorInfo {
        private final Throwable cause;
        private final boolean recoverable;

        public RecomposerErrorState(boolean recoverable, Throwable cause) {
            this.recoverable = recoverable;
            this.cause = cause;
        }

        @Override // androidx.compose.runtime.RecomposerErrorInfo
        public boolean getRecoverable() {
            return this.recoverable;
        }

        @Override // androidx.compose.runtime.RecomposerErrorInfo
        public Throwable getCause() {
            return this.cause;
        }
    }

    /* JADX INFO: compiled from: Recomposer.kt */
    @Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017J\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019J\u0006\u0010\u001a\u001a\u00020\u0015J\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001cR\u0014\u0010\u0003\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b8F¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u00108VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u001e"}, d2 = {"Landroidx/compose/runtime/Recomposer$RecomposerInfoImpl;", "Landroidx/compose/runtime/RecomposerInfo;", "(Landroidx/compose/runtime/Recomposer;)V", "changeCount", "", "getChangeCount", "()J", "currentError", "Landroidx/compose/runtime/RecomposerErrorInfo;", "getCurrentError", "()Landroidx/compose/runtime/RecomposerErrorInfo;", "hasPendingWork", "", "getHasPendingWork", "()Z", "state", "Lkotlinx/coroutines/flow/Flow;", "Landroidx/compose/runtime/Recomposer$State;", "getState", "()Lkotlinx/coroutines/flow/Flow;", "invalidateGroupsWithKey", "", "key", "", "resetErrorState", "Landroidx/compose/runtime/Recomposer$RecomposerErrorState;", "retryFailedCompositions", "saveStateAndDisposeForHotReload", "", "Landroidx/compose/runtime/Recomposer$HotReloadable;", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    private final class RecomposerInfoImpl implements RecomposerInfo {
        final /* synthetic */ Recomposer this$0;

        public RecomposerInfoImpl(Recomposer this$0) {
            this.this$0 = this$0;
        }

        @Override // androidx.compose.runtime.RecomposerInfo
        public Flow<State> getState() {
            return this.this$0.getCurrentState();
        }

        @Override // androidx.compose.runtime.RecomposerInfo
        public boolean getHasPendingWork() {
            return this.this$0.getHasPendingWork();
        }

        @Override // androidx.compose.runtime.RecomposerInfo
        public long getChangeCount() {
            return this.this$0.getChangeCount();
        }

        public final RecomposerErrorInfo getCurrentError() {
            Object lock$iv = Recomposer.access$getStateLock$p(this.this$0);
            Recomposer r1 = this.this$0;
            monitor-enter(lock$iv);
            RecomposerErrorState r2 = Recomposer.access$getErrorState$p(r1);     // Catch: Throwable -> L9
            monitor-exit(lock$iv);
            return r2;
        L9:
            th = move-exception;
            throw th;
        }

        public final void invalidateGroupsWithKey(int key) {
            Object lock$iv = Recomposer.access$getStateLock$p(this.this$0);
            Recomposer r1 = this.this$0;
            monitor-enter(lock$iv);
            List compositions = Recomposer.access$getKnownCompositions(r1);     // Catch: Throwable -> L21
            monitor-exit(lock$iv);
            List target$iv = new ArrayList(compositions.size());
            int index$iv$iv = 0;
            int r7 = compositions.size();
        L8:
            if (index$iv$iv >= r7) goto L16;
            Object item$iv$iv = compositions.get(index$iv$iv);
            ControlledComposition it = (ControlledComposition) item$iv$iv;
            if ((it instanceof CompositionImpl) == false) goto L12;
            CompositionImpl r13 = (CompositionImpl) it;
        L13:
            if (r13 == null) goto L15;
            target$iv.add(r13);
        L15:
            index$iv$iv = index$iv$iv + 1;
            goto L8
        L12:
            r13 = null;
            goto L13
        L16:
            List $this$fastForEach$iv = target$iv;
            int index$iv = 0;
            int r4 = $this$fastForEach$iv.size();
        L17:
            if (index$iv >= r4) goto L20;
            Object item$iv = $this$fastForEach$iv.get(index$iv);
            ((CompositionImpl) item$iv).invalidateGroupsWithKey(key);
            index$iv = index$iv + 1;
            goto L17
        L20:
            return;
        L21:
            th = move-exception;
            throw th;
        }

        public final List<HotReloadable> saveStateAndDisposeForHotReload() {
            Object lock$iv = Recomposer.access$getStateLock$p(this.this$0);
            Recomposer r0 = this.this$0;
            monitor-enter(lock$iv);
            List compositions = Recomposer.access$getKnownCompositions(r0);     // Catch: Throwable -> L21
            monitor-exit(lock$iv);
            List target$iv = new ArrayList(compositions.size());
            int index$iv$iv = 0;
            int r8 = compositions.size();
        L8:
            if (index$iv$iv >= r8) goto L16;
            Object item$iv$iv = compositions.get(index$iv$iv);
            ControlledComposition it = (ControlledComposition) item$iv$iv;
            if ((it instanceof CompositionImpl) == false) goto L12;
            CompositionImpl r14 = (CompositionImpl) it;
        L13:
            if (r14 == null) goto L15;
            target$iv.add(r14);
        L15:
            index$iv$iv = index$iv$iv + 1;
            goto L8
        L12:
            r14 = null;
            goto L13
        L16:
            List $this$fastMap$iv = target$iv;
            List target$iv2 = new ArrayList($this$fastMap$iv.size());
            int index$iv$iv2 = 0;
            int r9 = $this$fastMap$iv.size();
        L17:
            if (index$iv$iv2 >= r9) goto L20;
            Object item$iv$iv2 = $this$fastMap$iv.get(index$iv$iv2);
            HotReloadable $this$saveStateAndDisposeForHotReload_u24lambda_u247_u24lambda_u246 = new HotReloadable((CompositionImpl) item$iv$iv2);
            $this$saveStateAndDisposeForHotReload_u24lambda_u247_u24lambda_u246.clearContent();
            target$iv2.add($this$saveStateAndDisposeForHotReload_u24lambda_u247_u24lambda_u246);
            index$iv$iv2 = index$iv$iv2 + 1;
            goto L17
        L20:
            return target$iv2;
        L21:
            th = move-exception;
            throw th;
        }

        public final RecomposerErrorState resetErrorState() {
            return Recomposer.access$resetErrorState(this.this$0);
        }

        public final void retryFailedCompositions() {
            Recomposer.access$retryFailedCompositions(this.this$0);
        }
    }

    /* JADX INFO: compiled from: Recomposer.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Landroidx/compose/runtime/Recomposer$State;", "", "(Ljava/lang/String;I)V", "ShutDown", "ShuttingDown", "Inactive", "InactivePendingWork", "Idle", "PendingWork", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final enum State extends Enum<State> {
        private static final /* synthetic */ EnumEntries $ENTRIES = null;
        private static final /* synthetic */ State[] $VALUES = null;
        public static final State Idle = null;
        public static final State Inactive = null;
        public static final State InactivePendingWork = null;
        public static final State PendingWork = null;
        public static final State ShutDown = null;
        public static final State ShuttingDown = null;

        private static final /* synthetic */ State[] $values() {
            return new State[]{ShutDown, ShuttingDown, Inactive, InactivePendingWork, Idle, PendingWork};
        }

        public static EnumEntries<State> getEntries() {
            return $ENTRIES;
        }

        public static State valueOf(String r1) {
            return (State) Enum.valueOf(State.class, r1);
        }

        public static State[] values() {
            return (State[]) $VALUES.clone();
        }

        private State(String $enum$name, int $enum$ordinal) {
            super($enum$name, $enum$ordinal);
        }

        static {
            ShutDown = new State("ShutDown", 0);
            ShuttingDown = new State("ShuttingDown", 1);
            Inactive = new State("Inactive", 2);
            InactivePendingWork = new State("InactivePendingWork", 3);
            Idle = new State("Idle", 4);
            PendingWork = new State("PendingWork", 5);
            $VALUES = $values();
            $ENTRIES = EnumEntriesKt.enumEntries($VALUES);
        }
    }

    /* JADX INFO: renamed from: androidx.compose.runtime.Recomposer$awaitIdle$2, reason: invalid class name */
    /* JADX INFO: compiled from: Recomposer.kt */
    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u008a@"}, d2 = {"<anonymous>", "", "it", "Landroidx/compose/runtime/Recomposer$State;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "androidx.compose.runtime.Recomposer$awaitIdle$2", f = "Recomposer.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class AnonymousClass2 extends SuspendLambda implements Function2<State, Continuation<? super Boolean>, Object> {
        /* synthetic */ Object L$0;
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
        public final Object invoke2(State r3, Continuation<? super Boolean> r4) {
            return ((AnonymousClass2) create(r3, r4)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(State r2, Continuation<? super Boolean> r3) {
            return invoke2(r2, r3);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object r3) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            switch(this.label) {
                case 0: goto L6;
                default: goto L5;
            };
        L6:
            ResultKt.throwOnFailure(r3);
            State it = (State) this.L$0;
            if (it.compareTo(State.Idle) <= 0) goto L9;
            boolean r1 = true;
        L11:
            return Boxing.boxBoolean(r1);
        L9:
            r1 = false;
            goto L11
        L5:
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: renamed from: androidx.compose.runtime.Recomposer$join$2, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: Recomposer.kt */
    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u008a@"}, d2 = {"<anonymous>", "", "it", "Landroidx/compose/runtime/Recomposer$State;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "androidx.compose.runtime.Recomposer$join$2", f = "Recomposer.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class C06142 extends SuspendLambda implements Function2<State, Continuation<? super Boolean>, Object> {
        /* synthetic */ Object L$0;
        int label;

        C06142(Continuation<? super C06142> r2) {
            super(2, r2);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object r2, Continuation<?> r3) {
            C06142 r0 = new C06142(r3);
            r0.L$0 = r2;
            return r0;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(State r3, Continuation<? super Boolean> r4) {
            return ((C06142) create(r3, r4)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(State r2, Continuation<? super Boolean> r3) {
            return invoke2(r2, r3);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object r3) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            switch(this.label) {
                case 0: goto L6;
                default: goto L5;
            };
        L6:
            ResultKt.throwOnFailure(r3);
            State it = (State) this.L$0;
            if (it != State.ShutDown) goto L9;
            boolean r1 = true;
        L11:
            return Boxing.boxBoolean(r1);
        L9:
            r1 = false;
            goto L11
        L5:
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: renamed from: androidx.compose.runtime.Recomposer$recompositionRunner$2, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: Recomposer.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "androidx.compose.runtime.Recomposer$recompositionRunner$2", f = "Recomposer.kt", i = {0, 0}, l = {1072}, m = "invokeSuspend", n = {"callingJob", "unregisterApplyObserver"}, s = {"L$0", "L$1"})
    static final class C06152 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Function3<CoroutineScope, MonotonicFrameClock, Continuation<? super Unit>, Object> $block;
        final /* synthetic */ MonotonicFrameClock $parentFrameClock;
        private /* synthetic */ Object L$0;
        Object L$1;
        int label;
        final /* synthetic */ Recomposer this$0;

        /* JADX INFO: renamed from: androidx.compose.runtime.Recomposer$recompositionRunner$2$3, reason: invalid class name */
        /* JADX INFO: compiled from: Recomposer.kt */
        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
        @DebugMetadata(c = "androidx.compose.runtime.Recomposer$recompositionRunner$2$3", f = "Recomposer.kt", i = {}, l = {1072}, m = "invokeSuspend", n = {}, s = {})
        static final class AnonymousClass3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ Function3<CoroutineScope, MonotonicFrameClock, Continuation<? super Unit>, Object> $block;
            final /* synthetic */ MonotonicFrameClock $parentFrameClock;
            private /* synthetic */ Object L$0;
            int label;

            /* JADX WARN: Multi-variable type inference failed */
            AnonymousClass3(Function3<? super CoroutineScope, ? super MonotonicFrameClock, ? super Continuation<? super Unit>, ? extends Object> r2, MonotonicFrameClock r3, Continuation<? super AnonymousClass3> r4) {
                this.$block = r2;
                this.$parentFrameClock = r3;
                super(2, r4);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object r4, Continuation<?> r5) {
                AnonymousClass3 r0 = new AnonymousClass3(this.$block, this.$parentFrameClock, r5);
                r0.L$0 = r4;
                return r0;
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(CoroutineScope r2, Continuation<? super Unit> r3) {
                return invoke2(r2, r3);
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final Object invoke2(CoroutineScope r3, Continuation<? super Unit> r4) {
                return ((AnonymousClass3) create(r3, r4)).invokeSuspend(Unit.INSTANCE);
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
                CoroutineScope $this$coroutineScope = (CoroutineScope) this.L$0;
                Function3<CoroutineScope, MonotonicFrameClock, Continuation<? super Unit>, Object> r2 = this.$block;
                MonotonicFrameClock r3 = this.$parentFrameClock;
                this.label = 1;
                if (r2.invoke($this$coroutineScope, r3, this) != r0) goto L11;
                return r0;
            L5:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        C06152(Recomposer r2, Function3<? super CoroutineScope, ? super MonotonicFrameClock, ? super Continuation<? super Unit>, ? extends Object> r3, MonotonicFrameClock r4, Continuation<? super C06152> r5) {
            this.this$0 = r2;
            this.$block = r3;
            this.$parentFrameClock = r4;
            super(2, r5);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object r5, Continuation<?> r6) {
            C06152 r0 = new C06152(this.this$0, this.$block, this.$parentFrameClock, r6);
            r0.L$0 = r5;
            return r0;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(CoroutineScope r2, Continuation<? super Unit> r3) {
            return invoke2(r2, r3);
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(CoroutineScope r3, Continuation<? super Unit> r4) {
            return ((C06152) create(r3, r4)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object $result) {
            Object r0 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            switch(this.label) {
                case 0: goto L11;
                case 1: goto L6;
                default: goto L5;
            };
        L6:
            ObserverHandle unregisterApplyObserver = (ObserverHandle) this.L$1;
            Job callingJob = (Job) this.L$0;
            ResultKt.throwOnFailure($result);     // Catch: Throwable -> L9
        L24:
            unregisterApplyObserver.dispose();
            Object lock$iv = Recomposer.access$getStateLock$p(this.this$0);
            Recomposer r3 = this.this$0;
            monitor-enter(lock$iv);
        L34:
            th = move-exception;
            throw th;
        L28:
            if (Recomposer.access$getRunnerJob$p(r3) != callingJob) goto L30;
            Recomposer.access$setRunnerJob$p(r3, null);     // Catch: Throwable -> L34
        L30:
            Recomposer.access$deriveStateLocked(r3);     // Catch: Throwable -> L34
            monitor-exit(lock$iv);
            Companion.access$removeRunning(Recomposer.Companion, Recomposer.access$getRecomposerInfo$p(this.this$0));
            return Unit.INSTANCE;
        L9:
            Throwable th = th;
        L42:
            unregisterApplyObserver.dispose();
            Object lock$iv2 = Recomposer.access$getStateLock$p(this.this$0);
            Recomposer r4 = this.this$0;
            monitor-enter(lock$iv2);
        L52:
            th = move-exception;
            throw th;
        L46:
            if (Recomposer.access$getRunnerJob$p(r4) != callingJob) goto L48;
            Recomposer.access$setRunnerJob$p(r4, null);     // Catch: Throwable -> L52
        L48:
            Recomposer.access$deriveStateLocked(r4);     // Catch: Throwable -> L52
            monitor-exit(lock$iv2);
            Companion.access$removeRunning(Recomposer.Companion, Recomposer.access$getRecomposerInfo$p(this.this$0));
            throw th;
        L11:
            ResultKt.throwOnFailure($result);
            CoroutineScope $this$withContext = (CoroutineScope) this.L$0;
            callingJob = JobKt.getJob($this$withContext.getCoroutineContext());
            Recomposer.access$registerRunnerJob(this.this$0, callingJob);
            Snapshot.Companion r5 = Snapshot.Companion;
            final Recomposer r6 = this.this$0;
            ObserverHandle unregisterApplyObserver2 = r5.registerApplyObserver(new Recomposer$recompositionRunner$2$unregisterApplyObserver$1(r6));
            Companion.access$addRunning(Recomposer.Companion, Recomposer.access$getRecomposerInfo$p(this.this$0));
            Object lock$iv3 = Recomposer.access$getStateLock$p(this.this$0);     // Catch: Throwable -> L40
            Recomposer r7 = this.this$0;     // Catch: Throwable -> L40
            monitor-enter(lock$iv3);     // Catch: Throwable -> L40
            List $this$fastForEach$iv = Recomposer.access$getKnownCompositions(r7);     // Catch: Throwable -> L37
            monitor-exit(lock$iv3);     // Catch: Throwable -> L40
            int index$iv = 0;
            int r8 = $this$fastForEach$iv.size();     // Catch: Throwable -> L40
        L18:
            if (index$iv >= r8) goto L20;
            Object item$iv = $this$fastForEach$iv.get(index$iv);     // Catch: Throwable -> L40
            ControlledComposition it = (ControlledComposition) item$iv;     // Catch: Throwable -> L40
            it.invalidateAll();     // Catch: Throwable -> L40
            index$iv = index$iv + 1;     // Catch: Throwable -> L40
            goto L18
        L20:
            this.L$0 = callingJob;     // Catch: Throwable -> L40
            this.L$1 = unregisterApplyObserver2;     // Catch: Throwable -> L40
            this.label = 1;     // Catch: Throwable -> L40
            if (CoroutineScopeKt.coroutineScope(new AnonymousClass3(this.$block, this.$parentFrameClock, null), this) != r0) goto L23;
            return r0;
        L23:
            unregisterApplyObserver = unregisterApplyObserver2;
            goto L24
        L37:
            th = move-exception;
            throw th;     // Catch: Throwable -> L40
        L40:
            th = move-exception;
            th = th;
            unregisterApplyObserver = unregisterApplyObserver2;
            goto L42
        L5:
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: renamed from: androidx.compose.runtime.Recomposer$runFrameLoop$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: Recomposer.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "androidx.compose.runtime.Recomposer", f = "Recomposer.kt", i = {0, 0, 0, 0, 0, 1, 1, 1, 1, 1}, l = {942, 949}, m = "runFrameLoop", n = {"this", "parentFrameClock", "frameSignal", "toRecompose", "toApply", "this", "parentFrameClock", "frameSignal", "toRecompose", "toApply"}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$0", "L$1", "L$2", "L$3", "L$4"})
    static final class C06161 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ Recomposer this$0;

        C06161(Recomposer r1, Continuation<? super C06161> r2) {
            this.this$0 = r1;
            super(r2);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object r4) {
            this.result = r4;
            this.label |= Integer.MIN_VALUE;
            return Recomposer.access$runFrameLoop(this.this$0, null, null, this);
        }
    }

    /* JADX INFO: renamed from: androidx.compose.runtime.Recomposer$runRecomposeAndApplyChanges$2, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: Recomposer.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;", "parentFrameClock", "Landroidx/compose/runtime/MonotonicFrameClock;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "androidx.compose.runtime.Recomposer$runRecomposeAndApplyChanges$2", f = "Recomposer.kt", i = {0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1}, l = {580, 591}, m = "invokeSuspend", n = {"parentFrameClock", "toRecompose", "toInsert", "toApply", "toLateApply", "toComplete", "modifiedValues", "modifiedValuesSet", "alreadyComposed", "parentFrameClock", "toRecompose", "toInsert", "toApply", "toLateApply", "toComplete", "modifiedValues", "modifiedValuesSet", "alreadyComposed"}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "L$8", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "L$8"})
    static final class C06182 extends SuspendLambda implements Function3<CoroutineScope, MonotonicFrameClock, Continuation<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        Object L$6;
        Object L$7;
        Object L$8;
        int label;
        final /* synthetic */ Recomposer this$0;

        C06182(Recomposer r2, Continuation<? super C06182> r3) {
            this.this$0 = r2;
            super(3, r3);
        }

        public static final /* synthetic */ void access$invokeSuspend$clearRecompositionState(Recomposer r0, List r1, List r2, List r3, MutableScatterSet r4, MutableScatterSet r5, MutableScatterSet r6, MutableScatterSet r7) {
            invokeSuspend$clearRecompositionState(r0, r1, r2, r3, r4, r5, r6, r7);
        }

        public static final /* synthetic */ void access$invokeSuspend$fillToInsert(List r0, Recomposer r1) {
            invokeSuspend$fillToInsert(r0, r1);
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Object invoke(CoroutineScope r2, MonotonicFrameClock r3, Continuation<? super Unit> r4) {
            return invoke2(r2, r3, r4);
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(CoroutineScope r3, MonotonicFrameClock r4, Continuation<? super Unit> r5) {
            C06182 r0 = new C06182(this.this$0, r5);
            r0.L$0 = r4;
            return r0.invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x011b -> B:21:0x0124). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x012b -> B:9:0x00ba). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object $result) {
            Object r1 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int r3 = 1;
            switch(this.label) {
                case 0: goto L8;
                case 1: goto L7;
                case 2: goto L6;
                default: goto L5;
            };
        L6:
            MutableScatterSet alreadyComposed = (MutableScatterSet) this.L$8;
            Set modifiedValuesSet = (Set) this.L$7;
            MutableScatterSet modifiedValues = (MutableScatterSet) this.L$6;
            MutableScatterSet modifiedValues2 = (MutableScatterSet) this.L$5;
            MutableScatterSet alreadyComposed2 = (MutableScatterSet) this.L$4;
            List toRecompose = (List) this.L$3;
            final List toInsert = (List) this.L$2;
            List toRecompose2 = (List) this.L$1;
            MonotonicFrameClock parentFrameClock = (MonotonicFrameClock) this.L$0;
            ResultKt.throwOnFailure($result);
            MutableScatterSet alreadyComposed3 = alreadyComposed;
            MonotonicFrameClock parentFrameClock2 = parentFrameClock;
            C06182 r13 = this;
        L21:
            Recomposer.access$discardUnusedMovableContentState(r13.this$0);
            r3 = 1;
        L10:
            if (Recomposer.access$getShouldKeepRecomposing(r13.this$0) == false) goto L24;
            r13.L$0 = parentFrameClock2;
            r13.L$1 = toRecompose2;
            r13.L$2 = toInsert;
            r13.L$3 = toRecompose;
            r13.L$4 = alreadyComposed2;
            r13.L$5 = modifiedValues2;
            r13.L$6 = modifiedValues;
            r13.L$7 = modifiedValuesSet;
            r13.L$8 = alreadyComposed3;
            r13.label = r3;
            if (Recomposer.access$awaitWorkAvailable(r13.this$0, r13) != r1) goto L14;
            return r1;
        L14:
            List r14 = toRecompose2;
            final MutableScatterSet toLateApply = alreadyComposed2;
            final MutableScatterSet toLateApply2 = alreadyComposed3;
            final List toApply = toRecompose;
            final List toApply2 = r14;
            C06182 r15 = r13;
            final Set modifiedValuesSet2 = modifiedValuesSet;
            final MutableScatterSet toComplete = modifiedValues2;
            final MutableScatterSet toComplete2 = modifiedValues;
        L16:
            if (Recomposer.access$recordComposerModifications(r15.this$0) == false) goto L22;
            final Recomposer r6 = r15.this$0;
            r15.L$0 = parentFrameClock2;
            r15.L$1 = toApply2;
            r15.L$2 = toInsert;
            r15.L$3 = toApply;
            r15.L$4 = toLateApply;
            r15.L$5 = toComplete;
            r15.L$6 = toComplete2;
            r15.L$7 = modifiedValuesSet2;
            r15.L$8 = toLateApply2;
            r15.label = 2;
            if (parentFrameClock2.withFrameNanos(new AnonymousClass1(r6, toComplete2, toLateApply2, toApply2, toInsert, toLateApply, toApply, toComplete, modifiedValuesSet2), r15) != r1) goto L20;
            return r1;
        L20:
            List r5 = toApply;
            alreadyComposed3 = toLateApply2;
            alreadyComposed2 = toLateApply;
            toRecompose2 = toApply2;
            toRecompose = r5;
            modifiedValues = toComplete2;
            modifiedValues2 = toComplete;
            modifiedValuesSet = modifiedValuesSet2;
            r13 = r15;
            goto L21
        L22:
            List r4 = toApply;
            alreadyComposed3 = toLateApply2;
            alreadyComposed2 = toLateApply;
            toRecompose2 = toApply2;
            toRecompose = r4;
            modifiedValues = toComplete2;
            modifiedValues2 = toComplete;
            modifiedValuesSet = modifiedValuesSet2;
            r13 = r15;
            r3 = 1;
            goto L10
        L24:
            return Unit.INSTANCE;
        L7:
            MutableScatterSet alreadyComposed4 = (MutableScatterSet) this.L$8;
            Set modifiedValuesSet3 = (Set) this.L$7;
            MutableScatterSet modifiedValues3 = (MutableScatterSet) this.L$6;
            MutableScatterSet toComplete3 = (MutableScatterSet) this.L$5;
            MutableScatterSet toLateApply3 = (MutableScatterSet) this.L$4;
            List toApply3 = (List) this.L$3;
            toInsert = (List) this.L$2;
            List toRecompose3 = (List) this.L$1;
            MonotonicFrameClock parentFrameClock3 = (MonotonicFrameClock) this.L$0;
            ResultKt.throwOnFailure($result);
            toLateApply2 = alreadyComposed4;
            parentFrameClock2 = parentFrameClock3;
            toApply = toApply3;
            toApply2 = toRecompose3;
            toLateApply = toLateApply3;
            r15 = this;
            modifiedValuesSet2 = modifiedValuesSet3;
            toComplete = toComplete3;
            toComplete2 = modifiedValues3;
            goto L16
        L8:
            ResultKt.throwOnFailure($result);
            parentFrameClock2 = (MonotonicFrameClock) this.L$0;
            List toRecompose4 = new ArrayList();
            List toInsert2 = new ArrayList();
            List toApply4 = new ArrayList();
            alreadyComposed2 = ScatterSetKt.mutableScatterSetOf();
            MutableScatterSet toComplete4 = ScatterSetKt.mutableScatterSetOf();
            MutableScatterSet modifiedValues4 = new MutableScatterSet(0, r3, null);
            Set modifiedValuesSet4 = ScatterSetWrapperKt.wrapIntoSet(modifiedValues4);
            alreadyComposed3 = ScatterSetKt.mutableScatterSetOf();
            toRecompose2 = toRecompose4;
            modifiedValuesSet = modifiedValuesSet4;
            toInsert = toInsert2;
            modifiedValues = modifiedValues4;
            toRecompose = toApply4;
            modifiedValues2 = toComplete4;
            r13 = this;
            goto L10
        L5:
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        private static final void invokeSuspend$clearRecompositionState(Recomposer this$0, List<ControlledComposition> r33, List<MovableContentStateReference> r34, List<ControlledComposition> r35, MutableScatterSet<ControlledComposition> r36, MutableScatterSet<ControlledComposition> r37, MutableScatterSet<Object> r38, MutableScatterSet<ControlledComposition> r39) {
            Object lock$iv = Recomposer.access$getStateLock$p(this$0);
            int $i$f$synchronized = 0;
            monitor-enter(lock$iv);
            int r0 = 0;
            r33.clear();     // Catch: Throwable -> L81
            r34.clear();     // Catch: Throwable -> L81
            int index$iv = 0;
            int r7 = r35.size();     // Catch: Throwable -> L81
        L6:
            if (index$iv >= r7) goto L12;
            Object item$iv = r35.get(index$iv);     // Catch: Throwable -> L9
            ControlledComposition it = (ControlledComposition) item$iv;     // Catch: Throwable -> L9
            it.abandonChanges();     // Catch: Throwable -> L9
            Recomposer.access$recordFailedCompositionLocked(this$0, it);     // Catch: Throwable -> L9
            index$iv = index$iv + 1;
        L9:
            th = th;
        L83:
            monitor-exit(lock$iv);
            throw th;
        L12:
            r35.clear();     // Catch: Throwable -> L81
            MutableScatterSet<ControlledComposition> this_$iv = r36;     // Catch: Throwable -> L81
            Object[] elements$iv = this_$iv.elements;     // Catch: Throwable -> L81
            long[] m$iv$iv = this_$iv.metadata;     // Catch: Throwable -> L81
            int lastIndex$iv$iv = m$iv$iv.length - 2;     // Catch: Throwable -> L81
            int i$iv$iv = 0;
            long r15 = 255;
            int r12 = 8;
            if (0 > lastIndex$iv$iv) goto L34;
        L14:
            long slot$iv$iv = m$iv$iv[i$iv$iv];     // Catch: Throwable -> L81
            long r26 = 128;
            int $i$f$synchronized2 = $i$f$synchronized;
            ScatterSet this_$iv2 = this_$iv;
            if (((((~slot$iv$iv) << 7) & slot$iv$iv) & (-9187201950435737472L)) == (-9187201950435737472L)) goto L31;
            int bitCount$iv$iv = 8 - ((~(i$iv$iv - lastIndex$iv$iv)) >>> 31);
            int j$iv$iv = 0;
        L18:
            if (j$iv$iv >= bitCount$iv$iv) goto L28;
            long value$iv$iv$iv = slot$iv$iv & r15;
            if (value$iv$iv$iv >= 128) goto L22;
            boolean r13 = true;
        L23:
            if (r13 == false) goto L27;
            int index$iv$iv = (i$iv$iv << 3) + j$iv$iv;
            ControlledComposition it2 = (ControlledComposition) elements$iv[index$iv$iv];     // Catch: Throwable -> L79
            it2.abandonChanges();     // Catch: Throwable -> L79
            Recomposer.access$recordFailedCompositionLocked(this$0, it2);     // Catch: Throwable -> L79
        L79:
            th = th;
        L27:
            slot$iv$iv = slot$iv$iv >> 8;     // Catch: Throwable -> L79
            j$iv$iv = j$iv$iv + 1;     // Catch: Throwable -> L79
            r15 = r15;
            goto L18
        L22:
            r13 = false;
            goto L23
        L28:
            long r30 = r15;
            if (bitCount$iv$iv != 8) goto L36;
        L32:
            if (i$iv$iv == lastIndex$iv$iv) goto L36;
            i$iv$iv = i$iv$iv + 1;     // Catch: Throwable -> L79
            $i$f$synchronized = $i$f$synchronized2;
            this_$iv = this_$iv2;
            r15 = r30;
        L36:
            r36.clear();     // Catch: Throwable -> L79
            MutableScatterSet<ControlledComposition> this_$iv3 = r37;     // Catch: Throwable -> L79
            Object[] elements$iv2 = this_$iv3.elements;     // Catch: Throwable -> L79
            long[] m$iv$iv2 = this_$iv3.metadata;     // Catch: Throwable -> L79
            int lastIndex$iv$iv2 = m$iv$iv2.length - 2;     // Catch: Throwable -> L79
            int i$iv$iv2 = 0;
            if (0 > lastIndex$iv$iv2) goto L54;
        L38:
            long slot$iv$iv2 = m$iv$iv2[i$iv$iv2];     // Catch: Throwable -> L79
            int r21 = r12;
            if (((((~slot$iv$iv2) << 7) & slot$iv$iv2) & (-9187201950435737472L)) == (-9187201950435737472L)) goto L51;
            int bitCount$iv$iv2 = 8 - ((~(i$iv$iv2 - lastIndex$iv$iv2)) >>> 31);     // Catch: Throwable -> L79
            int j$iv$iv2 = 0;
            long slot$iv$iv3 = slot$iv$iv2;
        L41:
            if (j$iv$iv2 >= bitCount$iv$iv2) goto L50;
            long value$iv$iv$iv2 = slot$iv$iv3 & r30;     // Catch: Throwable -> L79
            if (value$iv$iv$iv2 >= r26) goto L45;
            boolean r16 = true;
        L46:
            if (r16 == false) goto L48;
            int index$iv$iv2 = (i$iv$iv2 << 3) + j$iv$iv2;     // Catch: Throwable -> L79
            ((ControlledComposition) elements$iv2[index$iv$iv2]).changesApplied();     // Catch: Throwable -> L79
        L48:
            slot$iv$iv3 = slot$iv$iv3 >> r21;     // Catch: Throwable -> L79
            j$iv$iv2 = j$iv$iv2 + 1;     // Catch: Throwable -> L79
            goto L41
        L45:
            r16 = false;
            goto L46
        L50:
            if (bitCount$iv$iv2 != r21) goto L54;
        L51:
            if (i$iv$iv2 == lastIndex$iv$iv2) goto L54;
            i$iv$iv2 = i$iv$iv2 + 1;     // Catch: Throwable -> L79
            r12 = 8;
        L54:
            r37.clear();     // Catch: Throwable -> L79
            r38.clear();     // Catch: Throwable -> L79
            MutableScatterSet<ControlledComposition> this_$iv4 = r39;     // Catch: Throwable -> L79
            int $i$f$forEach = 0;
            Object[] elements$iv3 = this_$iv4.elements;     // Catch: Throwable -> L79
            long[] m$iv$iv3 = this_$iv4.metadata;     // Catch: Throwable -> L79
            int lastIndex$iv$iv3 = m$iv$iv3.length - 2;     // Catch: Throwable -> L79
            int i$iv$iv3 = 0;
            if (0 > lastIndex$iv$iv3) goto L76;
        L56:
            long slot$iv$iv4 = m$iv$iv3[i$iv$iv3];     // Catch: Throwable -> L79
            ScatterSet this_$iv5 = this_$iv4;
            int $i$f$forEach2 = $i$f$forEach;
            if (((((~slot$iv$iv4) << 7) & slot$iv$iv4) & (-9187201950435737472L)) == (-9187201950435737472L)) goto L71;
            int bitCount$iv$iv3 = 8 - ((~(i$iv$iv3 - lastIndex$iv$iv3)) >>> 31);     // Catch: Throwable -> L79
            int j$iv$iv3 = 0;
        L59:
            if (j$iv$iv3 >= bitCount$iv$iv3) goto L68;
            long value$iv$iv$iv3 = slot$iv$iv4 & r30;     // Catch: Throwable -> L79
            if (value$iv$iv$iv3 >= r26) goto L63;
            boolean r14 = true;
        L64:
            if (r14 == false) goto L67;
            int index$iv$iv3 = (i$iv$iv3 << 3) + j$iv$iv3;     // Catch: Throwable -> L79
            ControlledComposition it3 = (ControlledComposition) elements$iv3[index$iv$iv3];     // Catch: Throwable -> L79
            it3.abandonChanges();     // Catch: Throwable -> L79
            Recomposer.access$recordFailedCompositionLocked(this$0, it3);     // Catch: Throwable -> L79
        L67:
            slot$iv$iv4 = slot$iv$iv4 >> 8;     // Catch: Throwable -> L79
            j$iv$iv3 = j$iv$iv3 + 1;     // Catch: Throwable -> L79
            r0 = r0;
            goto L59
        L63:
            r14 = false;
            goto L64
        L68:
            int r28 = r0;
            if (bitCount$iv$iv3 != 8) goto L76;
        L72:
            if (i$iv$iv3 == lastIndex$iv$iv3) goto L76;
            i$iv$iv3 = i$iv$iv3 + 1;     // Catch: Throwable -> L79
            this_$iv4 = this_$iv5;
            $i$f$forEach = $i$f$forEach2;
            r0 = r28;
            goto L56
        L71:
            r28 = r0;
        L76:
            r39.clear();     // Catch: Throwable -> L79
            Unit r1 = Unit.INSTANCE;     // Catch: Throwable -> L79
            monitor-exit(lock$iv);
            return;
        L31:
            r30 = r15;
            goto L32
        L34:
            r30 = 255;
            r26 = 128;
        L81:
            th = th;
            goto L83
        }

        private static final void invokeSuspend$fillToInsert(List<MovableContentStateReference> r11, Recomposer this$0) {
            r11.clear();
            Object lock$iv = Recomposer.access$getStateLock$p(this$0);
            monitor-enter(lock$iv);
            List $this$fastForEach$iv = Recomposer.access$getMovableContentAwaitingInsert$p(this$0);     // Catch: Throwable -> L11
            int index$iv = 0;
            int r6 = $this$fastForEach$iv.size();     // Catch: Throwable -> L11
        L6:
            if (index$iv >= r6) goto L8;
            Object item$iv = $this$fastForEach$iv.get(index$iv);     // Catch: Throwable -> L11
            MovableContentStateReference it = (MovableContentStateReference) item$iv;     // Catch: Throwable -> L11
            r11.add(it);     // Catch: Throwable -> L11
            index$iv = index$iv + 1;     // Catch: Throwable -> L11
            goto L6
        L8:
            Recomposer.access$getMovableContentAwaitingInsert$p(this$0).clear();     // Catch: Throwable -> L11
            Unit r2 = Unit.INSTANCE;     // Catch: Throwable -> L11
            monitor-exit(lock$iv);
            return;
        L11:
            th = move-exception;
            throw th;
        }
    }

    /* JADX INFO: renamed from: androidx.compose.runtime.Recomposer$runRecomposeConcurrentlyAndApplyChanges$2, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: Recomposer.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;", "parentFrameClock", "Landroidx/compose/runtime/MonotonicFrameClock;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "androidx.compose.runtime.Recomposer$runRecomposeConcurrentlyAndApplyChanges$2", f = "Recomposer.kt", i = {0, 0, 0, 1}, l = {911, 931, 932}, m = "invokeSuspend", n = {"recomposeCoroutineScope", "frameSignal", "frameLoop", "frameLoop"}, s = {"L$0", "L$1", "L$2", "L$0"})
    static final class C06192 extends SuspendLambda implements Function3<CoroutineScope, MonotonicFrameClock, Continuation<? super Unit>, Object> {
        final /* synthetic */ CoroutineContext $recomposeCoroutineContext;
        private /* synthetic */ Object L$0;
        /* synthetic */ Object L$1;
        Object L$2;
        int label;
        final /* synthetic */ Recomposer this$0;

        C06192(CoroutineContext r2, Recomposer r3, Continuation<? super C06192> r4) {
            this.$recomposeCoroutineContext = r2;
            this.this$0 = r3;
            super(3, r4);
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Object invoke(CoroutineScope r2, MonotonicFrameClock r3, Continuation<? super Unit> r4) {
            return invoke2(r2, r3, r4);
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(CoroutineScope r4, MonotonicFrameClock r5, Continuation<? super Unit> r6) {
            C06192 r0 = new C06192(this.$recomposeCoroutineContext, this.this$0, r6);
            r0.L$0 = r4;
            r0.L$1 = r5;
            return r0.invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x00da -> B:23:0x00dc). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object $result) {
            Object r0 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int r4 = 1;
            DefaultConstructorMarker r5 = null;
            switch(this.label) {
                case 0: goto L9;
                case 1: goto L8;
                case 2: goto L7;
                case 3: goto L6;
                default: goto L5;
            };
        L6:
            ResultKt.throwOnFailure($result);
        L95:
            return Unit.INSTANCE;
        L7:
            Object $result2 = $result;
            Job frameLoop = (Job) this.L$0;
            ResultKt.throwOnFailure($result2);
            C06192 r6 = this;
        L90:
            r6.L$0 = r5;
            r6.label = 3;
            if (JobKt.cancelAndJoin(frameLoop, r6) != r0) goto L95;
            return r0;
        L8:
            $result2 = $result;
            Job frameLoop2 = (Job) this.L$2;
            ProduceFrameSignal frameSignal = (ProduceFrameSignal) this.L$1;
            CoroutineScope recomposeCoroutineScope = (CoroutineScope) this.L$0;
            ResultKt.throwOnFailure($result2);
            Job frameLoop3 = frameLoop2;
            r6 = this;
        L23:
            Recomposer this_$iv = r6.this$0;
            Recomposer r9 = r6.this$0;
            Object lock$iv$iv = Recomposer.access$getStateLock$p(this_$iv);
            monitor-enter(lock$iv$iv);
            MutableScatterSet it$iv = Recomposer.access$getSnapshotInvalidations$p(this_$iv);     // Catch: Throwable -> L82
            if (it$iv.isNotEmpty() == false) goto L34;
            Object r25 = lock$iv$iv;
            Recomposer.access$setSnapshotInvalidations$p(this_$iv, new MutableScatterSet(0, r4, r5));     // Catch: Throwable -> L32
        L36:
            monitor-exit(r25);
            Set<? extends Object> r3 = ScatterSetWrapperKt.wrapIntoSet(it$iv);
            if (r3.isEmpty() == true) goto L44;
            List $this$fastForEach$iv$iv = Recomposer.access$getKnownCompositions(this_$iv);
            int index$iv$iv = 0;
            int r7 = $this$fastForEach$iv$iv.size();
        L40:
            if (index$iv$iv >= r7) goto L44;
            Object item$iv$iv = $this$fastForEach$iv$iv.get(index$iv$iv);
            ControlledComposition composition$iv = (ControlledComposition) item$iv$iv;
            composition$iv.recordModificationsOf(r3);
            index$iv$iv = index$iv$iv + 1;
        L44:
            MutableVector this_$iv$iv = Recomposer.access$getCompositionInvalidations$p(this_$iv);
            Object[] content$iv$iv = this_$iv$iv.content;
            int size$iv$iv = this_$iv$iv.getSize();
            int i$iv$iv = 0;
        L45:
            if (i$iv$iv >= size$iv$iv) goto L55;
            ControlledComposition composition = (ControlledComposition) content$iv$iv[i$iv$iv];
            Object lock$iv = Recomposer.access$getStateLock$p(r9);
            monitor-enter(lock$iv);
            Recomposer.access$setConcurrentCompositionsOutstanding$p(r9, Recomposer.access$getConcurrentCompositionsOutstanding$p(r9) + 1);     // Catch: Throwable -> L52
            monitor-exit(lock$iv);
            BuildersKt.launch$default(recomposeCoroutineScope, CompositionKt.getRecomposeCoroutineContext(composition), null, new Recomposer$runRecomposeConcurrentlyAndApplyChanges$2$2$2(r9, composition, null), 2, null);
            i$iv$iv = i$iv$iv + 1;
            r9 = r9;
            content$iv$iv = content$iv$iv;
            size$iv$iv = size$iv$iv;
            r0 = r0;
        L52:
            th = move-exception;
            throw th;
        L55:
            Object r21 = r0;
            Recomposer.access$getCompositionInvalidations$p(this_$iv).clear();
            Object lock$iv$iv2 = Recomposer.access$getStateLock$p(this_$iv);
            monitor-enter(lock$iv$iv2);
        L79:
            th = move-exception;
            throw th;
        L59:
            if (Recomposer.access$deriveStateLocked(this_$iv) != null) goto L78;
            Unit r1 = Unit.INSTANCE;     // Catch: Throwable -> L79
            monitor-exit(lock$iv$iv2);
            Object lock$iv2 = Recomposer.access$getStateLock$p(r6.this$0);
            Recomposer r2 = r6.this$0;
            monitor-enter(lock$iv2);
        L74:
            th = move-exception;
            throw th;
        L66:
            if (Recomposer.access$getHasConcurrentFrameWorkLocked(r2) == false) goto L69;
            Continuation<Unit> r8 = frameSignal.requestFrameLocked();     // Catch: Throwable -> L74
        L70:
            monitor-exit(lock$iv2);
            if (r8 == null) goto L73;
            Result.Companion r10 = Result.Companion;
            r8.resumeWith(Result.m7425constructorimpl(Unit.INSTANCE));
        L73:
            CoroutineScope recomposeCoroutineScope2 = recomposeCoroutineScope;
            Job frameLoop4 = frameLoop3;
            r4 = r4;
            r0 = r21;
            r5 = null;
        L18:
            if (Recomposer.access$getShouldKeepRecomposing(r6.this$0) == false) goto L86;
            r6.L$0 = recomposeCoroutineScope2;
            r6.L$1 = frameSignal;
            r6.L$2 = frameLoop4;
            r6.label = r4;
            if (Recomposer.access$awaitWorkAvailable(r6.this$0, r6) != r0) goto L22;
            return r0;
        L22:
            frameLoop3 = frameLoop4;
            recomposeCoroutineScope = recomposeCoroutineScope2;
            goto L23
        L86:
            r6.L$0 = frameLoop4;
            r5 = null;
            r6.L$1 = null;
            r6.L$2 = null;
            r6.label = 2;
            if (JobKt.cancelAndJoin(JobKt.getJob(recomposeCoroutineScope2.getCoroutineContext()), r6) != r0) goto L89;
            return r0;
        L89:
            frameLoop = frameLoop4;
            goto L90
        L69:
            r8 = null;
            goto L70
        L78:
            throw new IllegalStateException("called outside of runRecomposeAndApplyChanges".toString());     // Catch: Throwable -> L79
        L32:
            th = th;
        L84:
            monitor-exit(r25);
            throw th;
        L34:
            r25 = lock$iv$iv;
        L82:
            th = th;
            r25 = lock$iv$iv;
            goto L84
        L9:
            ResultKt.throwOnFailure($result);
            $result2 = $result;
            CoroutineScope $this$recompositionRunner = (CoroutineScope) this.L$0;
            MonotonicFrameClock parentFrameClock = (MonotonicFrameClock) this.L$1;
            if (this.$recomposeCoroutineContext.get(Job.Key) != null) goto L12;
            boolean value$iv = true;
        L13:
            CoroutineContext r11 = this.$recomposeCoroutineContext;
            if (value$iv == true) goto L16;
            PreconditionsKt.throwIllegalArgumentException("recomposeCoroutineContext may not contain a Job; found " + r11.get(Job.Key));
        L16:
            recomposeCoroutineScope2 = CoroutineScopeKt.CoroutineScope($this$recompositionRunner.getCoroutineContext().plus(this.$recomposeCoroutineContext).plus(JobKt.Job(JobKt.getJob($this$recompositionRunner.getCoroutineContext()))));
            ProduceFrameSignal frameSignal2 = new ProduceFrameSignal();
            frameLoop4 = BuildersKt.launch$default($this$recompositionRunner, null, null, new Recomposer$runRecomposeConcurrentlyAndApplyChanges$2$frameLoop$1(this.this$0, parentFrameClock, frameSignal2, null), 3, null);
            r6 = this;
            frameSignal = frameSignal2;
            goto L18
        L12:
            value$iv = false;
            goto L13
        L5:
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    private static /* synthetic */ void getRegistrationObservers$annotations() {
    }

    @Deprecated(message = "Replaced by currentState as a StateFlow", replaceWith = @ReplaceWith(expression = "currentState", imports = {}))
    public static /* synthetic */ void getState$annotations() {
    }

    public static final /* synthetic */ Object access$awaitWorkAvailable(Recomposer $this, Continuation $completion) {
        return $this.awaitWorkAvailable($completion);
    }

    public static final /* synthetic */ CancellableContinuation access$deriveStateLocked(Recomposer $this) {
        return $this.deriveStateLocked();
    }

    public static final /* synthetic */ void access$discardUnusedMovableContentState(Recomposer $this) {
        $this.discardUnusedMovableContentState();
    }

    public static final /* synthetic */ BroadcastFrameClock access$getBroadcastFrameClock$p(Recomposer $this) {
        return $this.broadcastFrameClock;
    }

    public static final /* synthetic */ Throwable access$getCloseCause$p(Recomposer $this) {
        return $this.closeCause;
    }

    public static final /* synthetic */ MutableVector access$getCompositionInvalidations$p(Recomposer $this) {
        return $this.compositionInvalidations;
    }

    public static final /* synthetic */ List access$getCompositionsAwaitingApply$p(Recomposer $this) {
        return $this.compositionsAwaitingApply;
    }

    public static final /* synthetic */ int access$getConcurrentCompositionsOutstanding$p(Recomposer $this) {
        return $this.concurrentCompositionsOutstanding;
    }

    public static final /* synthetic */ RecomposerErrorState access$getErrorState$p(Recomposer $this) {
        return $this.errorState;
    }

    public static final /* synthetic */ boolean access$getHasBroadcastFrameClockAwaiters(Recomposer $this) {
        return $this.getHasBroadcastFrameClockAwaiters();
    }

    public static final /* synthetic */ boolean access$getHasConcurrentFrameWorkLocked(Recomposer $this) {
        return $this.getHasConcurrentFrameWorkLocked();
    }

    public static final /* synthetic */ boolean access$getHasSchedulingWork(Recomposer $this) {
        return $this.getHasSchedulingWork();
    }

    public static final /* synthetic */ List access$getKnownCompositions(Recomposer $this) {
        return $this.getKnownCompositions();
    }

    public static final /* synthetic */ List access$getMovableContentAwaitingInsert$p(Recomposer $this) {
        return $this.movableContentAwaitingInsert;
    }

    public static final /* synthetic */ RecomposerInfoImpl access$getRecomposerInfo$p(Recomposer $this) {
        return $this.recomposerInfo;
    }

    public static final /* synthetic */ MutableObjectList access$getRegistrationObservers$p(Recomposer $this) {
        return $this.registrationObservers;
    }

    public static final /* synthetic */ Job access$getRunnerJob$p(Recomposer $this) {
        return $this.runnerJob;
    }

    public static final /* synthetic */ boolean access$getShouldKeepRecomposing(Recomposer $this) {
        return $this.getShouldKeepRecomposing();
    }

    public static final /* synthetic */ MutableScatterSet access$getSnapshotInvalidations$p(Recomposer $this) {
        return $this.snapshotInvalidations;
    }

    public static final /* synthetic */ Object access$getStateLock$p(Recomposer $this) {
        return $this.stateLock;
    }

    public static final /* synthetic */ CancellableContinuation access$getWorkContinuation$p(Recomposer $this) {
        return $this.workContinuation;
    }

    public static final /* synthetic */ AtomicReference access$get_hotReloadEnabled$cp() {
        return _hotReloadEnabled;
    }

    public static final /* synthetic */ MutableStateFlow access$get_runningRecomposers$cp() {
        return _runningRecomposers;
    }

    public static final /* synthetic */ MutableStateFlow access$get_state$p(Recomposer $this) {
        return $this._state;
    }

    public static final /* synthetic */ boolean access$isClosed$p(Recomposer $this) {
        return $this.isClosed;
    }

    public static final /* synthetic */ List access$performInsertValues(Recomposer $this, List references, MutableScatterSet modifiedValues) {
        return $this.performInsertValues(references, modifiedValues);
    }

    public static final /* synthetic */ ControlledComposition access$performRecompose(Recomposer $this, ControlledComposition composition, MutableScatterSet modifiedValues) {
        return $this.performRecompose(composition, modifiedValues);
    }

    public static final /* synthetic */ Object access$recompositionRunner(Recomposer $this, Function3 block, Continuation $completion) {
        return $this.recompositionRunner(block, $completion);
    }

    public static final /* synthetic */ boolean access$recordComposerModifications(Recomposer $this) {
        return $this.recordComposerModifications();
    }

    public static final /* synthetic */ void access$recordFailedCompositionLocked(Recomposer $this, ControlledComposition composition) {
        $this.recordFailedCompositionLocked(composition);
    }

    public static final /* synthetic */ void access$registerRunnerJob(Recomposer $this, Job callingJob) {
        $this.registerRunnerJob(callingJob);
    }

    public static final /* synthetic */ RecomposerErrorState access$resetErrorState(Recomposer $this) {
        return $this.resetErrorState();
    }

    public static final /* synthetic */ void access$retryFailedCompositions(Recomposer $this) {
        $this.retryFailedCompositions();
    }

    public static final /* synthetic */ Object access$runFrameLoop(Recomposer $this, MonotonicFrameClock parentFrameClock, ProduceFrameSignal frameSignal, Continuation $completion) {
        return $this.runFrameLoop(parentFrameClock, frameSignal, $completion);
    }

    public static final /* synthetic */ void access$setChangeCount$p(Recomposer $this, long r1) {
        $this.changeCount = r1;
    }

    public static final /* synthetic */ void access$setCloseCause$p(Recomposer $this, Throwable r1) {
        $this.closeCause = r1;
    }

    public static final /* synthetic */ void access$setCompositionsRemoved$p(Recomposer $this, Set r1) {
        $this.compositionsRemoved = r1;
    }

    public static final /* synthetic */ void access$setConcurrentCompositionsOutstanding$p(Recomposer $this, int r1) {
        $this.concurrentCompositionsOutstanding = r1;
    }

    public static final /* synthetic */ void access$setRunnerJob$p(Recomposer $this, Job r1) {
        $this.runnerJob = r1;
    }

    public static final /* synthetic */ void access$setSnapshotInvalidations$p(Recomposer $this, MutableScatterSet r1) {
        $this.snapshotInvalidations = r1;
    }

    public static final /* synthetic */ void access$setWorkContinuation$p(Recomposer $this, CancellableContinuation r1) {
        $this.workContinuation = r1;
    }

    public Recomposer(CoroutineContext effectCoroutineContext) {
        this.broadcastFrameClock = new BroadcastFrameClock(new Recomposer$broadcastFrameClock$1(this));
        this.stateLock = new Object();
        this._knownCompositions = new ArrayList();
        this.snapshotInvalidations = new MutableScatterSet(0, 1, null);
        this.compositionInvalidations = new MutableVector(new ControlledComposition[16], 0);
        this.compositionsAwaitingApply = new ArrayList();
        this.movableContentAwaitingInsert = new ArrayList();
        this.movableContentRemoved = MultiValueMap.m3887constructorimpl$default(null, 1, null);
        this.movableContentNestedStatesAvailable = new NestedContentMap();
        this.movableContentStatesAvailable = ScatterMapKt.mutableScatterMapOf();
        this.movableContentNestedExtractionsPending = MultiValueMap.m3887constructorimpl$default(null, 1, null);
        this._state = StateFlowKt.MutableStateFlow(State.Inactive);
        this.pausedScopes = new SnapshotThreadLocal();
        CompletableJob $this$effectJob_u24lambda_u241 = JobKt.Job((Job) effectCoroutineContext.get(Job.Key));
        $this$effectJob_u24lambda_u241.invokeOnCompletion(new Recomposer$effectJob$1$1(this));
        this.effectJob = $this$effectJob_u24lambda_u241;
        this.effectCoroutineContext = effectCoroutineContext.plus(this.broadcastFrameClock).plus(this.effectJob);
        this.recomposerInfo = new RecomposerInfoImpl(this);
    }

    public final long getChangeCount() {
        return this.changeCount;
    }

    private final List<ControlledComposition> getKnownCompositions() {
        List r0 = this._knownCompositionsCache;
        if (r0 != null) goto L10;
        Recomposer $this$_get_knownCompositions__u24lambda_u240 = this;
        List<ControlledComposition> r2 = $this$_get_knownCompositions__u24lambda_u240._knownCompositions;
        if (r2.isEmpty() == false) goto L7;
        ArrayList r3 = CollectionsKt.emptyList();
    L8:
        $this$_get_knownCompositions__u24lambda_u240._knownCompositionsCache = r3;
        return r3;
    L7:
        r3 = new ArrayList(r2);
        goto L8
    L10:
        return r0;
    }

    @Override // androidx.compose.runtime.CompositionContext
    public CoroutineContext getEffectCoroutineContext() {
        return this.effectCoroutineContext;
    }

    @Override // androidx.compose.runtime.CompositionContext
    public CoroutineContext getRecomposeCoroutineContext$runtime_release() {
        return EmptyCoroutineContext.INSTANCE;
    }

    private final boolean getHasBroadcastFrameClockAwaitersLocked() {
        if (this.frameClockPaused == false) goto L5;
    L7:
        return false;
    L5:
        if (this.broadcastFrameClock.getHasAwaiters() == false) goto L7;
        return true;
    }

    private final boolean getHasBroadcastFrameClockAwaiters() {
        Object lock$iv = this.stateLock;
        monitor-enter(lock$iv);
        boolean r3 = getHasBroadcastFrameClockAwaitersLocked();     // Catch: Throwable -> L8
        monitor-exit(lock$iv);
        return r3;
    L8:
        th = move-exception;
        throw th;
    }

    private final CancellableContinuation<Unit> deriveStateLocked() {
        int r1 = 0;
        int r2 = 1;
        DefaultConstructorMarker r3 = null;
        if (this._state.getValue().compareTo(State.ShuttingDown) > 0) goto L10;
        clearKnownCompositionsLocked();
        this.snapshotInvalidations = new MutableScatterSet(r1, r2, r3);
        this.compositionInvalidations.clear();
        this.compositionsAwaitingApply.clear();
        this.movableContentAwaitingInsert.clear();
        this.failedCompositions = null;
        CancellableContinuation<? super Unit> r0 = this.workContinuation;
        if (r0 == null) goto L7;
        CancellableContinuation.DefaultImpls.cancel$default(r0, null, 1, null);
    L7:
        this.workContinuation = null;
        this.errorState = null;
        return null;
    L10:
        if (this.errorState == null) goto L13;
        State newState = State.Inactive;
    L35:
        this._state.setValue(newState);
        if (newState != State.PendingWork) goto L40;
        CancellableContinuation r4 = this.workContinuation;
        this.workContinuation = null;
        return r4;
    L40:
        return null;
    L13:
        if (this.runnerJob != null) goto L19;
        this.snapshotInvalidations = new MutableScatterSet(r1, r2, r3);
        this.compositionInvalidations.clear();
        if (getHasBroadcastFrameClockAwaitersLocked() == false) goto L17;
        newState = State.InactivePendingWork;
        goto L35
    L17:
        newState = State.Inactive;
        goto L35
    L19:
        if (this.compositionInvalidations.getSize() == 0) goto L21;
        r1 = 1;
    L21:
        if (r1 == 0) goto L23;
    L34:
        newState = State.PendingWork;
        goto L35
    L23:
        if (this.snapshotInvalidations.isNotEmpty() == true) goto L34;
        if (this.compositionsAwaitingApply.isEmpty() == false) goto L34;
        if (this.movableContentAwaitingInsert.isEmpty() == false) goto L34;
        if (this.concurrentCompositionsOutstanding > 0) goto L34;
        if (getHasBroadcastFrameClockAwaitersLocked() == true) goto L34;
        newState = State.Idle;
        goto L35
    }

    private final boolean getShouldKeepRecomposing() {
        Object lock$iv = this.stateLock;
        monitor-enter(lock$iv);
        boolean r3 = this.isClosed;     // Catch: Throwable -> L20
        monitor-exit(lock$iv);
        if (r3 == false) goto L28;
        Iterator<Job> r4 = this.effectJob.getChildren().iterator();
    L11:
        if (r4.hasNext() == false) goto L15;
        Object element$iv = r4.next();
        Job it = (Job) element$iv;
        if (it.isActive() == false) goto L11;
        boolean r1 = true;
    L16:
        if (r1 == false) goto L19;
        return true;
    L19:
        return false;
    L15:
        r1 = false;
        goto L16
    L28:
        return true;
    L20:
        th = move-exception;
        throw th;
    }

    public final Flow<State> getState() {
        return getCurrentState();
    }

    public final StateFlow<State> getCurrentState() {
        return this._state;
    }

    public final RecomposerInfo asRecomposerInfo() {
        return this.recomposerInfo;
    }

    private final boolean recordComposerModifications() {
        Object lock$iv = this.stateLock;
        monitor-enter(lock$iv);
    L58:
        th = move-exception;
        throw th;
    L6:
        if (this.snapshotInvalidations.isEmpty() == false) goto L10;
        boolean r4 = getHasFrameWorkLocked();     // Catch: Throwable -> L58
        monitor-exit(lock$iv);
        return r4;
    L10:
        Set<? extends Object> r5 = ScatterSetWrapperKt.wrapIntoSet(this.snapshotInvalidations);     // Catch: Throwable -> L58
        int r9 = 0;
        int r10 = 1;
        this.snapshotInvalidations = new MutableScatterSet(r9, r10, null);     // Catch: Throwable -> L58
        monitor-exit(lock$iv);
        Object lock$iv2 = this.stateLock;
        monitor-enter(lock$iv2);
        List<ControlledComposition> r6 = getKnownCompositions();     // Catch: Throwable -> L55
        monitor-exit(lock$iv2);
        Recomposer $this$recordComposerModifications_u24lambda_u2410 = this;     // Catch: Throwable -> L45
        int index$iv = 0;
        int r12 = r6.size();     // Catch: Throwable -> L45
    L19:
        if (index$iv >= r12) goto L24;
        Object item$iv = r6.get(index$iv);     // Catch: Throwable -> L45
        ControlledComposition composition = (ControlledComposition) item$iv;     // Catch: Throwable -> L45
        composition.recordModificationsOf(r5);     // Catch: Throwable -> L45
        if ($this$recordComposerModifications_u24lambda_u2410._state.getValue().compareTo(State.ShuttingDown) <= 0) goto L24;
        index$iv = index$iv + 1;     // Catch: Throwable -> L45
    L24:
        Object lock$iv3 = this.stateLock;     // Catch: Throwable -> L45
        monitor-enter(lock$iv3);     // Catch: Throwable -> L45
        int r11 = 0;
        this.snapshotInvalidations = new MutableScatterSet(r11, r10, null);     // Catch: Throwable -> L42
        Unit r0 = Unit.INSTANCE;     // Catch: Throwable -> L42
        monitor-exit(lock$iv3);     // Catch: Throwable -> L45
        Object lock$iv4 = this.stateLock;
        monitor-enter(lock$iv4);
    L39:
        th = move-exception;
        throw th;
    L33:
        if (deriveStateLocked() != null) goto L38;
        boolean r7 = getHasFrameWorkLocked();     // Catch: Throwable -> L39
        monitor-exit(lock$iv4);
        return r7;
    L38:
        throw new IllegalStateException("called outside of runRecomposeAndApplyChanges".toString());     // Catch: Throwable -> L39
    L42:
        th = move-exception;
        throw th;     // Catch: Throwable -> L45
    L45:
        th = move-exception;
        monitor-enter(this.stateLock);
        this.snapshotInvalidations.addAll(r5);     // Catch: Throwable -> L52
        throw th;
    L52:
        th = move-exception;
        throw th;
    L55:
        th = move-exception;
        throw th;
    }

    private final void recordComposerModifications(Function1<? super ControlledComposition, Unit> r12) {
        Object lock$iv = access$getStateLock$p(this);
        monitor-enter(lock$iv);
        MutableScatterSet it = access$getSnapshotInvalidations$p(this);     // Catch: Throwable -> L32
        if (it.isNotEmpty() == false) goto L9;
        int r10 = 1;
        access$setSnapshotInvalidations$p(this, new MutableScatterSet(0, r10, null));     // Catch: Throwable -> L32
    L9:
        monitor-exit(lock$iv);
        Set<? extends Object> r1 = ScatterSetWrapperKt.wrapIntoSet(it);
        if (r1.isEmpty() == true) goto L16;
        List $this$fastForEach$iv = access$getKnownCompositions(this);
        int index$iv = 0;
        int r5 = $this$fastForEach$iv.size();
    L13:
        if (index$iv >= r5) goto L16;
        Object item$iv = $this$fastForEach$iv.get(index$iv);
        ControlledComposition composition = (ControlledComposition) item$iv;
        composition.recordModificationsOf(r1);
        index$iv = index$iv + 1;
    L16:
        MutableVector this_$iv = access$getCompositionInvalidations$p(this);
        int i$iv = 0;
        Object[] content$iv = this_$iv.content;
        int size$iv = this_$iv.getSize();
    L17:
        if (i$iv >= size$iv) goto L19;
        r12.invoke(content$iv[i$iv]);
        i$iv = i$iv + 1;
        goto L17
    L19:
        access$getCompositionInvalidations$p(this).clear();
        Object lock$iv2 = access$getStateLock$p(this);
        monitor-enter(lock$iv2);
    L29:
        th = move-exception;
        throw th;
    L23:
        if (access$deriveStateLocked(this) != null) goto L28;
        Unit r4 = Unit.INSTANCE;     // Catch: Throwable -> L29
        monitor-exit(lock$iv2);
        return;
    L28:
        throw new IllegalStateException("called outside of runRecomposeAndApplyChanges".toString());     // Catch: Throwable -> L29
    L32:
        th = move-exception;
        throw th;
    }

    private final void registerRunnerJob(Job callingJob) {
        Object lock$iv = this.stateLock;
        monitor-enter(lock$iv);
        Throwable it = this.closeCause;     // Catch: Throwable -> L20
        if (it != null) goto L19;
        if (this._state.getValue().compareTo(State.ShuttingDown) <= 0) goto L17;
        if (this.runnerJob != null) goto L15;
        this.runnerJob = callingJob;     // Catch: Throwable -> L20
        deriveStateLocked();     // Catch: Throwable -> L20
        monitor-exit(lock$iv);
        return;
    L15:
        throw new IllegalStateException("Recomposer already running".toString());     // Catch: Throwable -> L20
    L17:
        throw new IllegalStateException("Recomposer shut down".toString());     // Catch: Throwable -> L20
    L19:
        throw it;     // Catch: Throwable -> L20
    L20:
        th = move-exception;
        throw th;
    }

    public final Object runRecomposeAndApplyChanges(Continuation<? super Unit> r3) {
        Object r0 = recompositionRunner(new C06182(this, null), r3);
        if (r0 != IntrinsicsKt.getCOROUTINE_SUSPENDED()) goto L6;
        return r0;
    L6:
        return Unit.INSTANCE;
    }

    static /* synthetic */ void processCompositionError$default(Recomposer r0, Throwable r1, ControlledComposition r2, boolean r3, int r4, Object r5) {
        if ((r4 & 2) == 0) goto L6;
        r2 = null;
    L6:
        if ((r4 & 4) == 0) goto L8;
        r3 = false;
    L8:
        r0.processCompositionError(r1, r2, r3);
    }

    private final void processCompositionError(Throwable e, ControlledComposition failedInitialComposition, boolean recoverable) {
        int r1 = 0;
        if (_hotReloadEnabled.get().booleanValue() == true) goto L5;
    L18:
        Object lock$iv = this.stateLock;
        monitor-enter(lock$iv);
        RecomposerErrorState errorState = this.errorState;     // Catch: Throwable -> L28
        if (errorState != null) goto L27;
        this.errorState = new RecomposerErrorState(false, e);     // Catch: Throwable -> L28
        Unit r2 = Unit.INSTANCE;     // Catch: Throwable -> L28
        monitor-exit(lock$iv);
        throw e;
    L27:
        throw errorState.getCause();     // Catch: Throwable -> L28
    L28:
        th = move-exception;
        throw th;
    L5:
        if ((e instanceof ComposeRuntimeError) == true) goto L18;
        Object lock$iv2 = this.stateLock;
        monitor-enter(lock$iv2);
        Utils_androidKt.logError("Error was captured in composition while live edit was enabled.", e);     // Catch: Throwable -> L15
        this.compositionsAwaitingApply.clear();     // Catch: Throwable -> L15
        this.compositionInvalidations.clear();     // Catch: Throwable -> L15
        this.snapshotInvalidations = new MutableScatterSet(r1, 1, null);     // Catch: Throwable -> L15
        this.movableContentAwaitingInsert.clear();     // Catch: Throwable -> L15
        MultiValueMap.m3885clearimpl(this.movableContentRemoved);     // Catch: Throwable -> L15
        this.movableContentStatesAvailable.clear();     // Catch: Throwable -> L15
        this.errorState = new RecomposerErrorState(recoverable, e);     // Catch: Throwable -> L15
        if (failedInitialComposition == null) goto L12;
        recordFailedCompositionLocked(failedInitialComposition);     // Catch: Throwable -> L15
    L12:
        deriveStateLocked();     // Catch: Throwable -> L15
        monitor-exit(lock$iv2);
        return;
    L15:
        th = move-exception;
        throw th;
    }

    private final void clearKnownCompositionsLocked() {
        ObjectList r0 = this.registrationObservers;
        if (r0 == null) goto L12;
        ObjectList this_$iv = r0;
        Object[] content$iv = this_$iv.content;
        int i$iv = 0;
        int r4 = this_$iv._size;
    L5:
        if (i$iv >= r4) goto L12;
        CompositionRegistrationObserver observer = (CompositionRegistrationObserver) content$iv[i$iv];
        Iterable $this$forEach$iv = getKnownCompositions();
        Iterator r9 = $this$forEach$iv.iterator();
    L8:
        if (r9.hasNext() == false) goto L10;
        Object element$iv = r9.next();
        ControlledComposition composition = (ControlledComposition) element$iv;
        observer.onCompositionUnregistered(this, composition);
        goto L8
    L10:
        i$iv = i$iv + 1;
    L12:
        this._knownCompositions.clear();
        this._knownCompositionsCache = CollectionsKt.emptyList();
    }

    private final void removeKnownCompositionLocked(ControlledComposition composition) {
        if (this._knownCompositions.remove(composition) == false) goto L10;
        this._knownCompositionsCache = null;
        ObjectList r0 = this.registrationObservers;
        if (r0 == null) goto L12;
        ObjectList this_$iv = r0;
        Object[] content$iv = this_$iv.content;
        int i$iv = 0;
        int r4 = this_$iv._size;
    L7:
        if (i$iv >= r4) goto L13;
        CompositionRegistrationObserver it = (CompositionRegistrationObserver) content$iv[i$iv];
        it.onCompositionUnregistered(this, composition);
        i$iv = i$iv + 1;
        goto L7
    L13:
        return;
    L12:
        return;
    }

    private final void addKnownCompositionLocked(ControlledComposition composition) {
        this._knownCompositions.add(composition);
        this._knownCompositionsCache = null;
        ObjectList r0 = this.registrationObservers;
        if (r0 == null) goto L8;
        ObjectList this_$iv = r0;
        Object[] content$iv = this_$iv.content;
        int i$iv = 0;
        int r4 = this_$iv._size;
    L5:
        if (i$iv >= r4) goto L10;
        CompositionRegistrationObserver it = (CompositionRegistrationObserver) content$iv[i$iv];
        it.onCompositionRegistered(this, composition);
        i$iv = i$iv + 1;
        goto L5
    L10:
        return;
    }

    public final CompositionObserverHandle addCompositionRegistrationObserver$runtime_release(final CompositionRegistrationObserver observer) {
        Object lock$iv = this.stateLock;
        monitor-enter(lock$iv);
        MutableObjectList<CompositionRegistrationObserver> r3 = this.registrationObservers;     // Catch: Throwable -> L15
        if (r3 != null) goto L8;
        int r6 = 1;
        r3 = new MutableObjectList(0, r6, null);     // Catch: Throwable -> L15
        this.registrationObservers = r3;     // Catch: Throwable -> L15
    L8:
        r3.add(observer);     // Catch: Throwable -> L15
        List<ControlledComposition> r4 = this._knownCompositions;     // Catch: Throwable -> L15
        int index$iv = 0;
        int r7 = r4.size();     // Catch: Throwable -> L15
    L9:
        if (index$iv >= r7) goto L11;
        Object item$iv = r4.get(index$iv);     // Catch: Throwable -> L15
        ControlledComposition composition = (ControlledComposition) item$iv;     // Catch: Throwable -> L15
        observer.onCompositionRegistered(this, composition);     // Catch: Throwable -> L15
        index$iv = index$iv + 1;     // Catch: Throwable -> L15
        goto L9
    L11:
        Unit r2 = Unit.INSTANCE;     // Catch: Throwable -> L15
        monitor-exit(lock$iv);
        return new Recomposer$addCompositionRegistrationObserver$2(this, observer);
    L15:
        th = move-exception;
        throw th;
    }

    private final RecomposerErrorState resetErrorState() {
        Object lock$iv = this.stateLock;
        monitor-enter(lock$iv);
        RecomposerErrorState error = this.errorState;     // Catch: Throwable -> L11
        if (error == null) goto L9;
        this.errorState = null;     // Catch: Throwable -> L11
        deriveStateLocked();     // Catch: Throwable -> L11
    L9:
        monitor-exit(lock$iv);
        return error;
    L11:
        th = move-exception;
        throw th;
    }

    private final void retryFailedCompositions() {
        Object lock$iv = this.stateLock;
        monitor-enter(lock$iv);
        List<ControlledComposition> r3 = this.failedCompositions;     // Catch: Throwable -> L48
        this.failedCompositions = null;     // Catch: Throwable -> L48
        monitor-exit(lock$iv);
        if (r3 != null) goto L55;
        return;
    L55:
    L32:
        th = move-exception;
        if (r3.isEmpty() == false) goto L36;
    L47:
        throw th;
    L36:
        monitor-enter(this.stateLock);
        int index$iv = 0;
        int r8 = r3.size();     // Catch: Throwable -> L44
    L39:
        if (index$iv >= r8) goto L41;
        Object item$iv = r3.get(index$iv);     // Catch: Throwable -> L44
        ControlledComposition it = (ControlledComposition) item$iv;     // Catch: Throwable -> L44
        recordFailedCompositionLocked(it);     // Catch: Throwable -> L44
        index$iv = index$iv + 1;     // Catch: Throwable -> L44
        goto L39
    L41:
        Unit r4 = Unit.INSTANCE;     // Catch: Throwable -> L44
    L44:
        th = move-exception;
        throw th;
    L11:
        if (r3.isEmpty() == true) goto L17;
        ControlledComposition composition = (ControlledComposition) CollectionsKt.removeLast(r3);     // Catch: Throwable -> L32
        if ((composition instanceof CompositionImpl) == false) goto L55;
        composition.invalidateAll();     // Catch: Throwable -> L32
        composition.setContent(((CompositionImpl) composition).getComposable());     // Catch: Throwable -> L32
        if (this.errorState == null) goto L55;
    L17:
        if (r3.isEmpty() == true) goto L31;
        Object lock$iv2 = this.stateLock;
        monitor-enter(lock$iv2);
        int index$iv2 = 0;
        int r7 = r3.size();     // Catch: Throwable -> L27
    L22:
        if (index$iv2 >= r7) goto L24;
        Object item$iv2 = r3.get(index$iv2);     // Catch: Throwable -> L27
        ControlledComposition it2 = (ControlledComposition) item$iv2;     // Catch: Throwable -> L27
        recordFailedCompositionLocked(it2);     // Catch: Throwable -> L27
        index$iv2 = index$iv2 + 1;     // Catch: Throwable -> L27
        goto L22
    L24:
        Unit r2 = Unit.INSTANCE;     // Catch: Throwable -> L27
        monitor-exit(lock$iv2);
        return;
    L27:
        th = move-exception;
        throw th;
    L31:
        return;
    L48:
        th = move-exception;
        throw th;
    }

    private final void recordFailedCompositionLocked(ControlledComposition composition) {
        ArrayList r0 = this.failedCompositions;
        if (r0 != null) goto L6;
        r0 = new ArrayList();
        this.failedCompositions = r0;
    L6:
        if (r0.contains(composition) == true) goto L8;
        r0.add(composition);
    L8:
        removeKnownCompositionLocked(composition);
    }

    public final Object runRecomposeConcurrentlyAndApplyChanges(CoroutineContext recomposeCoroutineContext, Continuation<? super Unit> r4) {
        Object r0 = recompositionRunner(new C06192(recomposeCoroutineContext, this, null), r4);
        if (r0 != IntrinsicsKt.getCOROUTINE_SUSPENDED()) goto L6;
        return r0;
    L6:
        return Unit.INSTANCE;
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x00ad -> B:15:0x0075). Please report as a decompilation issue!!! */
    private final Object runFrameLoop(MonotonicFrameClock parentFrameClock, ProduceFrameSignal frameSignal, Continuation<? super Unit> r12) {
        if ((r12 instanceof C06161) == false) goto L7;
        C06161 r0 = (C06161) r12;
        if ((r0.label & Integer.MIN_VALUE) == 0) goto L7;
        r0.label -= Integer.MIN_VALUE;
    L8:
        Object $result = r0.result;
        Object r2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch(r0.label) {
            case 0: goto L14;
            case 1: goto L13;
            case 2: goto L12;
            default: goto L11;
        };
    L12:
        List toApply = (List) r0.L$4;
        List toRecompose = (List) r0.L$3;
        ProduceFrameSignal frameSignal2 = (ProduceFrameSignal) r0.L$2;
        MonotonicFrameClock parentFrameClock2 = (MonotonicFrameClock) r0.L$1;
        Recomposer r5 = (Recomposer) r0.L$0;
        ResultKt.throwOnFailure($result);
        ArrayList toApply2 = toApply;
        parentFrameClock = parentFrameClock2;
        ArrayList toRecompose2 = toRecompose;
        frameSignal = frameSignal2;
        Recomposer r3 = r5;
    L15:
        Object r6 = r3.stateLock;
        r0.L$0 = r3;
        r0.L$1 = parentFrameClock;
        r0.L$2 = frameSignal;
        r0.L$3 = toRecompose2;
        r0.L$4 = toApply2;
        r0.label = 1;
        if (frameSignal.awaitFrameRequest(r6, r0) != r2) goto L18;
        return r2;
    L18:
        List r8 = toRecompose2;
        MonotonicFrameClock parentFrameClock3 = parentFrameClock;
        final List toApply3 = toApply2;
        final Recomposer r7 = r3;
        final ProduceFrameSignal frameSignal3 = frameSignal;
        final List toRecompose3 = r8;
    L19:
        Function1<Long, CancellableContinuation<? super Unit>> r9 = new C06172(r7, toRecompose3, toApply3, frameSignal3);
        r0.L$0 = r7;
        r0.L$1 = parentFrameClock3;
        r0.L$2 = frameSignal3;
        r0.L$3 = toRecompose3;
        r0.L$4 = toApply3;
        r0.label = 2;
        if (parentFrameClock3.withFrameNanos(r9, r0) != r2) goto L22;
        return r2;
    L22:
        Recomposer r10 = r7;
        toApply2 = toApply3;
        parentFrameClock = parentFrameClock3;
        toRecompose2 = toRecompose3;
        frameSignal = frameSignal3;
        r3 = r10;
        goto L15
    L13:
        toApply3 = (List) r0.L$4;
        toRecompose3 = (List) r0.L$3;
        frameSignal3 = (ProduceFrameSignal) r0.L$2;
        parentFrameClock3 = (MonotonicFrameClock) r0.L$1;
        r7 = (Recomposer) r0.L$0;
        ResultKt.throwOnFailure($result);
        goto L19
    L14:
        ResultKt.throwOnFailure($result);
        r3 = this;
        toRecompose2 = new ArrayList();
        toApply2 = new ArrayList();
        goto L15
    L11:
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    L7:
        r0 = new C06161(this, r12);
        goto L8
    }

    private final boolean getHasSchedulingWork() {
        Object lock$iv = this.stateLock;
        monitor-enter(lock$iv);
        boolean r4 = true;
        if (this.snapshotInvalidations.isNotEmpty() == false) goto L8;
    L17:
        monitor-exit(lock$iv);
        return r4;
    L8:
        if (this.compositionInvalidations.getSize() == 0) goto L10;
        boolean r3 = true;
    L11:
        if (r3 == true) goto L17;
        if (getHasBroadcastFrameClockAwaitersLocked() == true) goto L17;
        r4 = false;
        goto L17
    L10:
        r3 = false;
    L19:
        th = move-exception;
        throw th;
    }

    private final Object awaitWorkAvailable(Continuation<? super Unit> r11) {
        if (getHasSchedulingWork() == true) goto L28;
        CancellableContinuationImpl cancellable$iv = new CancellableContinuationImpl(IntrinsicsKt.intercepted(r11), 1);
        cancellable$iv.initCancellability();
        CancellableContinuationImpl co = cancellable$iv;
        Object lock$iv = access$getStateLock$p(this);
        monitor-enter(lock$iv);
    L24:
        th = move-exception;
        throw th;
    L8:
        if (access$getHasSchedulingWork(this) == false) goto L10;
        CancellableContinuation r9 = co;
    L13:
        monitor-exit(lock$iv);
        if (r9 == null) goto L16;
        Result.Companion r6 = Result.Companion;
        r9.resumeWith(Result.m7425constructorimpl(Unit.INSTANCE));
    L16:
        Object r1 = cancellable$iv.getResult();
        if (r1 != IntrinsicsKt.getCOROUTINE_SUSPENDED()) goto L20;
        DebugProbesKt.probeCoroutineSuspended(r11);
    L20:
        if (r1 != IntrinsicsKt.getCOROUTINE_SUSPENDED()) goto L23;
        return r1;
    L23:
        return Unit.INSTANCE;
    L10:
        access$setWorkContinuation$p(this, co);     // Catch: Throwable -> L24
        r9 = null;
        goto L13
    L28:
        return Unit.INSTANCE;
    }

    private final Object recompositionRunner(Function3<? super CoroutineScope, ? super MonotonicFrameClock, ? super Continuation<? super Unit>, ? extends Object> r5, Continuation<? super Unit> r6) {
        MonotonicFrameClock parentFrameClock = MonotonicFrameClockKt.getMonotonicFrameClock(r6.getContext());
        Object r1 = BuildersKt.withContext(this.broadcastFrameClock, new C06152(this, r5, parentFrameClock, null), r6);
        if (r1 != IntrinsicsKt.getCOROUTINE_SUSPENDED()) goto L6;
        return r1;
    L6:
        return Unit.INSTANCE;
    }

    public final void cancel() {
        Object lock$iv = this.stateLock;
        monitor-enter(lock$iv);
    L12:
        th = move-exception;
        throw th;
    L6:
        if (this._state.getValue().compareTo(State.Idle) < 0) goto L8;
        this._state.setValue(State.ShuttingDown);     // Catch: Throwable -> L12
    L8:
        Unit r2 = Unit.INSTANCE;     // Catch: Throwable -> L12
        monitor-exit(lock$iv);
        Job.DefaultImpls.cancel$default((Job) this.effectJob, null, 1, null);
    }

    public final void close() {
        if (this.effectJob.complete() == false) goto L13;
        Object lock$iv = this.stateLock;
        monitor-enter(lock$iv);
        this.isClosed = true;     // Catch: Throwable -> L10
        Unit r2 = Unit.INSTANCE;     // Catch: Throwable -> L10
        monitor-exit(lock$iv);
        return;
    L10:
        th = move-exception;
        throw th;
    }

    public final Object join(Continuation<? super Unit> r4) {
        Object r0 = FlowKt.first(getCurrentState(), new C06142(null), r4);
        if (r0 != IntrinsicsKt.getCOROUTINE_SUSPENDED()) goto L6;
        return r0;
    L6:
        return Unit.INSTANCE;
    }

    @Override // androidx.compose.runtime.CompositionContext
    public void composeInitial$runtime_release(ControlledComposition composition, Function2<? super Composer, ? super Integer, Unit> r12) {
        boolean composerWasComposing = composition.isComposing();
        MutableSnapshot snapshot$iv = Snapshot.Companion.takeMutableSnapshot(readObserverOf(composition), writeObserverOf(composition, null));     // Catch: Throwable -> L42
        MutableSnapshot this_$iv$iv = snapshot$iv;     // Catch: Throwable -> L39
        Snapshot previous$iv$iv = this_$iv$iv.makeCurrent();     // Catch: Throwable -> L39
        composition.composeContent(r12);     // Catch: Throwable -> L36
        Unit r0 = Unit.INSTANCE;     // Catch: Throwable -> L36
        this_$iv$iv.restoreCurrent(previous$iv$iv);     // Catch: Throwable -> L39
        applyAndCheck(snapshot$iv);     // Catch: Throwable -> L42
        if (composerWasComposing == true) goto L12;
        Snapshot.Companion.notifyObjectsInitialized();
    L12:
        Object lock$iv = this.stateLock;
        monitor-enter(lock$iv);
    L33:
        e = move-exception;
        throw e;
    L16:
        if (this._state.getValue().compareTo(State.ShuttingDown) > 0) goto L18;
    L20:
        Unit r1 = Unit.INSTANCE;     // Catch: Throwable -> L33
        monitor-exit(lock$iv);
        performInitialMovableContentInserts(composition);     // Catch: Throwable -> L30
        composition.applyChanges();     // Catch: Throwable -> L27
        composition.applyLateChanges();     // Catch: Throwable -> L27
        if (composerWasComposing == true) goto L55;
        Snapshot.Companion.notifyObjectsInitialized();
        return;
    L55:
        return;
    L27:
        e = move-exception;
        processCompositionError$default(this, e, null, false, 6, null);
        return;
    L30:
        e = move-exception;
        processCompositionError(e, composition, true);
        return;
    L18:
        if (getKnownCompositions().contains(composition) == true) goto L20;
        addKnownCompositionLocked(composition);     // Catch: Throwable -> L33
        goto L20
    L36:
        th = move-exception;
        this_$iv$iv.restoreCurrent(previous$iv$iv);     // Catch: Throwable -> L39
        throw th;     // Catch: Throwable -> L39
    L39:
        th = move-exception;
        applyAndCheck(snapshot$iv);     // Catch: Throwable -> L42
        throw th;     // Catch: Throwable -> L42
    L42:
        e = move-exception;
        processCompositionError(e, composition, true);
    }

    @Override // androidx.compose.runtime.CompositionContext
    public ScatterSet<RecomposeScopeImpl> composeInitialPaused$runtime_release(ControlledComposition composition, ShouldPauseCallback shouldPause, Function2<? super Composer, ? super Integer, Unit> r9) {
        ShouldPauseCallback previous$iv = composition.getAndSetShouldPauseCallback(shouldPause);     // Catch: Throwable -> L16
        composeInitial$runtime_release(composition, r9);     // Catch: Throwable -> L13
        MutableScatterSet<RecomposeScopeImpl> r5 = this.pausedScopes.get();     // Catch: Throwable -> L13
        if (r5 == null) goto L8;
        MutableScatterSet<RecomposeScopeImpl> r6 = r5;     // Catch: Throwable -> L13
    L10:
        composition.getAndSetShouldPauseCallback(previous$iv);     // Catch: Throwable -> L16
        this.pausedScopes.set(null);
        return r6;
    L8:
        r6 = ScatterSetKt.emptyScatterSet();     // Catch: Throwable -> L13
    L13:
        th = move-exception;
        composition.getAndSetShouldPauseCallback(previous$iv);     // Catch: Throwable -> L16
        throw th;     // Catch: Throwable -> L16
    L16:
        th = move-exception;
        this.pausedScopes.set(null);
        throw th;
    }

    @Override // androidx.compose.runtime.CompositionContext
    public ScatterSet<RecomposeScopeImpl> recomposePaused$runtime_release(ControlledComposition composition, ShouldPauseCallback shouldPause, ScatterSet<RecomposeScopeImpl> r10) {
        recordComposerModifications();     // Catch: Throwable -> L19
        composition.recordModificationsOf(ScatterSetWrapperKt.wrapIntoSet(r10));     // Catch: Throwable -> L19
        ShouldPauseCallback previous$iv = composition.getAndSetShouldPauseCallback(shouldPause);     // Catch: Throwable -> L19
        ControlledComposition needsApply = performRecompose(composition, null);     // Catch: Throwable -> L16
        if (needsApply == null) goto L8;
        performInitialMovableContentInserts(composition);     // Catch: Throwable -> L16
        needsApply.applyChanges();     // Catch: Throwable -> L16
        needsApply.applyLateChanges();     // Catch: Throwable -> L16
    L8:
        MutableScatterSet<RecomposeScopeImpl> r6 = this.pausedScopes.get();     // Catch: Throwable -> L16
        if (r6 == null) goto L11;
        MutableScatterSet<RecomposeScopeImpl> r7 = r6;     // Catch: Throwable -> L16
    L13:
        composition.getAndSetShouldPauseCallback(previous$iv);     // Catch: Throwable -> L19
        this.pausedScopes.set(null);
        return r7;
    L11:
        r7 = ScatterSetKt.emptyScatterSet();     // Catch: Throwable -> L16
    L16:
        th = move-exception;
        composition.getAndSetShouldPauseCallback(previous$iv);     // Catch: Throwable -> L19
        throw th;     // Catch: Throwable -> L19
    L19:
        th = move-exception;
        this.pausedScopes.set(null);
        throw th;
    }

    @Override // androidx.compose.runtime.CompositionContext
    public void reportPausedScope$runtime_release(RecomposeScopeImpl scope) {
        MutableScatterSet<RecomposeScopeImpl> r0 = this.pausedScopes.get();
        if (r0 != null) goto L5;
        Recomposer $this$reportPausedScope_u24lambda_u2444 = this;
        MutableScatterSet<RecomposeScopeImpl> r2 = ScatterSetKt.mutableScatterSetOf();
        $this$reportPausedScope_u24lambda_u2444.pausedScopes.set(r2);
        r0 = r2;
    L5:
        r0.add(scope);
    }

    private final void performInitialMovableContentInserts(ControlledComposition composition) {
        Object lock$iv = this.stateLock;
        monitor-enter(lock$iv);
        int r0 = 0;
        List<MovableContentStateReference> r5 = this.movableContentAwaitingInsert;     // Catch: Throwable -> L23
        int index$iv$iv = 0;
        int r10 = r5.size();     // Catch: Throwable -> L23
    L6:
        if (index$iv$iv >= r10) goto L11;
        Object item$iv$iv = r5.get(index$iv$iv);     // Catch: Throwable -> L23
        MovableContentStateReference it = (MovableContentStateReference) item$iv$iv;     // Catch: Throwable -> L23
        int r16 = r0;
        if (Intrinsics.areEqual(it.getComposition$runtime_release(), composition) == true) goto L9;
        index$iv$iv = index$iv$iv + 1;
        r0 = r16;
        goto L6
    L9:
        boolean r1 = true;
    L12:
        if (r1 == true) goto L16;
        monitor-exit(lock$iv);
        return;
    L16:
        Unit r2 = Unit.INSTANCE;     // Catch: Throwable -> L23
        monitor-exit(lock$iv);
        List toInsert = new ArrayList();
        performInitialMovableContentInserts$fillToInsert(toInsert, this, composition);
    L20:
        if (toInsert.isEmpty() == true) goto L22;
        performInsertValues(toInsert, null);
        performInitialMovableContentInserts$fillToInsert(toInsert, this, composition);
        goto L20
    L22:
        return;
    L11:
        r1 = false;
    L23:
        th = move-exception;
        throw th;
    }

    private static final void performInitialMovableContentInserts$fillToInsert(List<MovableContentStateReference> r6, Recomposer this$0, ControlledComposition $composition) {
        r6.clear();
        Object lock$iv = this$0.stateLock;
        monitor-enter(lock$iv);
        Iterator<MovableContentStateReference> r3 = this$0.movableContentAwaitingInsert.iterator();     // Catch: Throwable -> L14
    L7:
        if (r3.hasNext() == false) goto L11;
        MovableContentStateReference value = r3.next();     // Catch: Throwable -> L14
        if (Intrinsics.areEqual(value.getComposition$runtime_release(), $composition) == false) goto L7;
        r6.add(value);     // Catch: Throwable -> L14
        r3.remove();     // Catch: Throwable -> L14
        goto L7
    L11:
        Unit r2 = Unit.INSTANCE;     // Catch: Throwable -> L14
        monitor-exit(lock$iv);
        return;
    L14:
        th = move-exception;
        throw th;
    }

    private final ControlledComposition performRecompose(final ControlledComposition composition, final MutableScatterSet<Object> r13) {
        if (composition.isComposing() == false) goto L5;
    L38:
        return null;
    L5:
        if (composition.isDisposed() == true) goto L38;
        Set<ControlledComposition> r0 = this.compositionsRemoved;
        boolean r2 = true;
        if (r0 != null) goto L9;
    L11:
        boolean r1 = false;
    L12:
        if (r1 == true) goto L38;
        MutableSnapshot snapshot$iv = Snapshot.Companion.takeMutableSnapshot(readObserverOf(composition), writeObserverOf(composition, r13));
        MutableSnapshot this_$iv$iv = snapshot$iv;     // Catch: Throwable -> L35
        Snapshot previous$iv$iv = this_$iv$iv.makeCurrent();     // Catch: Throwable -> L35
        if (r13 != null) goto L39;
    L23:
        r2 = false;
    L24:
        if (r2 == false) goto L26;
        composition.prepareCompose(new Recomposer$performRecompose$1$1(r13, composition));     // Catch: Throwable -> L21
    L26:
        boolean r3 = composition.recompose();     // Catch: Throwable -> L21
        this_$iv$iv.restoreCurrent(previous$iv$iv);     // Catch: Throwable -> L35
        applyAndCheck(snapshot$iv);
        if (r3 == true) goto L32;
        return null;
    L32:
        return composition;
    L21:
        th = move-exception;
        this_$iv$iv.restoreCurrent(previous$iv$iv);     // Catch: Throwable -> L35
        throw th;     // Catch: Throwable -> L35
    L39:
        if (r13.isNotEmpty() != true) goto L23;
    L35:
        th = move-exception;
        applyAndCheck(snapshot$iv);
        throw th;
    L9:
        if (r0.contains(composition) != true) goto L11;
        r1 = true;
        goto L12
    }

    private final List<ControlledComposition> performInsertValues(List<MovableContentStateReference> r34, MutableScatterSet<Object> r35) {
        Map destination$iv = new HashMap(r34.size());
        int index$iv$iv = 0;
        int r7 = r34.size();
    L3:
        if (index$iv$iv >= r7) goto L9;
        MovableContentStateReference it = r34.get(index$iv$iv);
        ControlledComposition r11 = it.getComposition$runtime_release();
        Map $this$getOrPut$iv$iv = destination$iv;
        Object value$iv$iv = $this$getOrPut$iv$iv.get(r11);
        if (value$iv$iv != null) goto L7;
        Object answer$iv$iv = new ArrayList();
        $this$getOrPut$iv$iv.put(r11, answer$iv$iv);
    L8:
        ArrayList list$iv = (ArrayList) answer$iv$iv;
        list$iv.add(it);
        index$iv$iv = index$iv$iv + 1;
        goto L3
    L7:
        answer$iv$iv = value$iv$iv;
        goto L8
    L9:
        Map tasks = destination$iv;
        Iterator r0 = tasks.entrySet().iterator();
    L11:
        if (r0.hasNext() == false) goto L144;
        Map.Entry r3 = (Map.Entry) r0.next();
        ControlledComposition composition = (ControlledComposition) r3.getKey();
        List refs = (List) r3.getValue();
        boolean value$iv = !composition.isComposing();
        if (value$iv == true) goto L15;
        ComposerKt.composeImmediateRuntimeError("Check failed");
    L15:
        MutableSnapshot snapshot$iv = Snapshot.Companion.takeMutableSnapshot(readObserverOf(composition), writeObserverOf(composition, r35));
        MutableSnapshot this_$iv$iv = snapshot$iv;     // Catch: Throwable -> L139
        Snapshot previous$iv$iv = this_$iv$iv.makeCurrent();     // Catch: Throwable -> L139
        Object lock$iv = this.stateLock;     // Catch: Throwable -> L133
        monitor-enter(lock$iv);     // Catch: Throwable -> L133
        Iterator r19 = r0;
        ArrayList target$iv = new ArrayList(refs.size());     // Catch: Throwable -> L127
        List $this$fastForEach$iv$iv = refs;
        Map tasks2 = tasks;
        int r2 = $this$fastForEach$iv$iv.size();     // Catch: Throwable -> L125
        int index$iv$iv2 = 0;
    L25:
        if (index$iv$iv2 >= r2) goto L31;
        Object item$iv$iv = $this$fastForEach$iv$iv.get(index$iv$iv2);     // Catch: Throwable -> L123
        List $this$fastForEach$iv$iv2 = $this$fastForEach$iv$iv;
        ArrayList r1 = target$iv;     // Catch: Throwable -> L123
        MovableContentStateReference reference = (MovableContentStateReference) item$iv$iv;     // Catch: Throwable -> L123
        int r29 = r2;
        int index$iv$iv3 = index$iv$iv2;
        Object r4 = MultiValueMap.m3897removeLastimpl(this.movableContentRemoved, reference.getContent$runtime_release());     // Catch: Throwable -> L123
        MovableContentStateReference it2 = (MovableContentStateReference) r4;     // Catch: Throwable -> L123
        if (it2 == null) goto L30;
        this.movableContentNestedStatesAvailable.usedContainer(it2);     // Catch: Throwable -> L123
    L30:
        r1.add(TuplesKt.to(reference, r4));     // Catch: Throwable -> L123
        index$iv$iv2 = index$iv$iv3 + 1;     // Catch: Throwable -> L123
        $this$fastForEach$iv$iv = $this$fastForEach$iv$iv2;
        r2 = r29;
        target$iv = target$iv;
    L123:
        th = th;
    L129:
        monitor-exit(lock$iv);     // Catch: Throwable -> L131
        throw th;     // Catch: Throwable -> L131
    L31:
        ArrayList pairs = target$iv;     // Catch: Throwable -> L123
        int r5 = 0;
        if (ComposeRuntimeFlags.isMovingNestedMovableContentEnabled == false) goto L62;
        List $this$fastForEach$iv$iv3 = pairs;
        int r6 = $this$fastForEach$iv$iv3.size();     // Catch: Throwable -> L123
        List pairs2 = pairs;
        int index$iv$iv4 = 0;
    L34:
        if (index$iv$iv4 >= r6) goto L46;
        int r21 = r5;
        List $this$fastForEach$iv$iv4 = $this$fastForEach$iv$iv3;
        Object item$iv$iv2 = $this$fastForEach$iv$iv4.get(index$iv$iv4);     // Catch: Throwable -> L123
        Pair<MovableContentStateReference, MovableContentStateReference> r28 = (Pair) item$iv$iv2;     // Catch: Throwable -> L123
        if (r28.getSecond() != null) goto L40;
        int index$iv$iv5 = index$iv$iv4;
        List $this$fastForEach$iv$iv5 = $this$fastForEach$iv$iv4;
        if (this.movableContentNestedStatesAvailable.contains(r28.getFirst().getContent$runtime_release()) == false) goto L41;
        int index$iv$iv6 = 1;
    L43:
        if (index$iv$iv6 != 0) goto L44;
        index$iv$iv4 = index$iv$iv5 + 1;     // Catch: Throwable -> L123
        r5 = r21;
        $this$fastForEach$iv$iv3 = $this$fastForEach$iv$iv5;
        goto L34
    L44:
        boolean r8 = true;
    L47:
        if (r8 == false) goto L63;
        List $this$map$iv = pairs2;     // Catch: Throwable -> L123
        int $i$f$map = 0;
        Collection destination$iv$iv = new ArrayList(CollectionsKt.collectionSizeOrDefault($this$map$iv, 10));     // Catch: Throwable -> L123
        Iterable $this$mapTo$iv$iv = $this$map$iv;
        Iterator r18 = $this$mapTo$iv$iv.iterator();     // Catch: Throwable -> L123
    L50:
        if (r18.hasNext() == false) goto L60;
        Object item$iv$iv3 = r18.next();     // Catch: Throwable -> L123
        Pair pair = (Pair) item$iv$iv3;     // Catch: Throwable -> L123
        if (pair.getSecond() != null) goto L57;
        Iterable $this$map$iv2 = $this$map$iv;
        int $i$f$map2 = $i$f$map;
        NestedMovableContent nestedContentReference = this.movableContentNestedStatesAvailable.removeLast(((MovableContentStateReference) pair.getFirst()).getContent$runtime_release());     // Catch: Throwable -> L123
        if (nestedContentReference == null) goto L58;
        MovableContentStateReference content = nestedContentReference.getContent();     // Catch: Throwable -> L123
        MovableContentStateReference container = nestedContentReference.getContainer();     // Catch: Throwable -> L123
        $this$mapTo$iv$iv = $this$mapTo$iv$iv;
        MultiValueMap.m3883addimpl(this.movableContentNestedExtractionsPending, container, content);     // Catch: Throwable -> L123
        Pair r9 = TuplesKt.to(pair.getFirst(), content);     // Catch: Throwable -> L123
    L59:
        destination$iv$iv.add(r9);     // Catch: Throwable -> L123
        $this$map$iv = $this$map$iv2;
        $i$f$map = $i$f$map2;
        $this$mapTo$iv$iv = $this$mapTo$iv$iv;
    L58:
        r9 = pair;
        goto L59
    L57:
        $this$map$iv2 = $this$map$iv;
        $i$f$map2 = $i$f$map;
        goto L58
    L60:
        List $this$fastAll$iv = (List) destination$iv$iv;     // Catch: Throwable -> L123
    L157:
        monitor-exit(lock$iv);     // Catch: Throwable -> L131
        List pairs3 = $this$fastAll$iv;
        List $this$fastForEach$iv$iv6 = $this$fastAll$iv;
        int index$iv$iv7 = 0;
        int r10 = $this$fastForEach$iv$iv6.size();     // Catch: Throwable -> L131
    L67:
        if (index$iv$iv7 >= r10) goto L75;
        Object item$iv$iv4 = $this$fastForEach$iv$iv6.get(index$iv$iv7);     // Catch: Throwable -> L131
        if (((Pair) item$iv$iv4).getSecond() != null) goto L71;
        boolean r22 = true;
    L72:
        if (r22 == false) goto L73;
        index$iv$iv7 = index$iv$iv7 + 1;     // Catch: Throwable -> L131
        goto L67
    L73:
        boolean r12 = false;
    L76:
        if (r12 == true) goto L119;
        int index$iv$iv8 = 0;
        int r13 = pairs3.size();     // Catch: Throwable -> L131
    L78:
        if (index$iv$iv8 >= r13) goto L86;
        Object item$iv$iv5 = pairs3.get(index$iv$iv8);     // Catch: Throwable -> L131
        if (((Pair) item$iv$iv5).getSecond() == null) goto L82;
        boolean r23 = true;
    L83:
        if (r23 == false) goto L84;
        index$iv$iv8 = index$iv$iv8 + 1;     // Catch: Throwable -> L131
        goto L78
    L84:
        boolean r14 = false;
    L87:
        if (r14 == true) goto L119;
        List target$iv2 = new ArrayList(pairs3.size());     // Catch: Throwable -> L131
        int r15 = pairs3.size();     // Catch: Throwable -> L131
        int index$iv$iv9 = 0;
    L90:
        if (index$iv$iv9 >= r15) goto L99;
        Object item$iv$iv6 = pairs3.get(index$iv$iv9);     // Catch: Throwable -> L131
        Pair<MovableContentStateReference, MovableContentStateReference> r24 = (Pair) item$iv$iv6;     // Catch: Throwable -> L131
        if (r24.getSecond() != null) goto L94;
        MovableContentStateReference r27 = r24.getFirst();     // Catch: Throwable -> L131
    L95:
        if (r27 == null) goto L98;
        target$iv2.add(r27);     // Catch: Throwable -> L131
    L98:
        index$iv$iv9 = index$iv$iv9 + 1;     // Catch: Throwable -> L131
        r15 = r15;
        goto L90
    L94:
        r27 = null;
        goto L95
    L99:
        List toReturn = target$iv2;     // Catch: Throwable -> L131
        Object lock$iv2 = this.stateLock;     // Catch: Throwable -> L131
        monitor-enter(lock$iv2);     // Catch: Throwable -> L131
        CollectionsKt.addAll(this.movableContentAwaitingInsert, toReturn);     // Catch: Throwable -> L115
        Unit r16 = Unit.INSTANCE;     // Catch: Throwable -> L115
        monitor-exit(lock$iv2);     // Catch: Throwable -> L131
        ArrayList target$iv3 = new ArrayList(pairs3.size());     // Catch: Throwable -> L131
        int r17 = pairs3.size();     // Catch: Throwable -> L131
        int index$iv$iv10 = 0;
    L105:
        if (index$iv$iv10 >= r17) goto L114;
        Pair<MovableContentStateReference, MovableContentStateReference> r110 = pairs3.get(index$iv$iv10);     // Catch: Throwable -> L131
        if (r110.getSecond() == null) goto L109;
        boolean r26 = true;
    L110:
        if (r26 == false) goto L113;
        target$iv3.add(r110);     // Catch: Throwable -> L131
    L113:
        index$iv$iv10 = index$iv$iv10 + 1;     // Catch: Throwable -> L131
        r17 = r17;
        goto L105
    L109:
        r26 = false;
        goto L110
    L114:
        ArrayList toInsert = target$iv3;     // Catch: Throwable -> L131
    L120:
        composition.insertMovableContent(toInsert);     // Catch: Throwable -> L131
        Unit r20 = Unit.INSTANCE;     // Catch: Throwable -> L131
        this_$iv$iv.restoreCurrent(previous$iv$iv);     // Catch: Throwable -> L137
        applyAndCheck(snapshot$iv);
        r0 = r19;
        tasks = tasks2;
    L137:
        th = th;
    L141:
        applyAndCheck(snapshot$iv);
        throw th;
    L115:
        th = move-exception;
        throw th;     // Catch: Throwable -> L131
    L82:
        r23 = false;
        goto L83
    L86:
        r14 = true;
    L119:
        toInsert = pairs3;
        goto L120
    L71:
        r22 = false;
        goto L72
    L75:
        r12 = true;
    L131:
        th = th;
    L135:
        this_$iv$iv.restoreCurrent(previous$iv$iv);     // Catch: Throwable -> L137
        throw th;     // Catch: Throwable -> L137
    L63:
        $this$fastAll$iv = pairs2;
    L41:
        index$iv$iv6 = 0;
        goto L43
    L40:
        index$iv$iv5 = index$iv$iv4;
        $this$fastForEach$iv$iv5 = $this$fastForEach$iv$iv4;
        goto L41
    L46:
        r8 = false;
        goto L47
    L62:
        pairs2 = pairs;
    L125:
        th = th;
    L127:
        th = th;
    L133:
        th = th;
    L139:
        th = th;
        goto L141
    L144:
        return CollectionsKt.toList(tasks.keySet());
    }

    private final void discardUnusedMovableContentState() {
        Object lock$iv = this.stateLock;
        monitor-enter(lock$iv);
        int r0 = 0;
    L21:
        th = move-exception;
        throw th;
    L6:
        if (MultiValueMap.m3895isNotEmptyimpl(this.movableContentRemoved) == false) goto L11;
        ObjectList references = MultiValueMap.m3900valuesimpl(this.movableContentRemoved);     // Catch: Throwable -> L21
        MultiValueMap.m3885clearimpl(this.movableContentRemoved);     // Catch: Throwable -> L21
        this.movableContentNestedStatesAvailable.clear();     // Catch: Throwable -> L21
        MultiValueMap.m3885clearimpl(this.movableContentNestedExtractionsPending);     // Catch: Throwable -> L21
        MutableObjectList target$iv = new MutableObjectList(references.getSize());     // Catch: Throwable -> L21
        Object[] content$iv$iv = references.content;     // Catch: Throwable -> L21
        int i$iv$iv = 0;
        int r12 = references._size;     // Catch: Throwable -> L21
    L8:
        if (i$iv$iv >= r12) goto L10;
        Object it$iv = content$iv$iv[i$iv$iv];     // Catch: Throwable -> L21
        MovableContentStateReference it = (MovableContentStateReference) it$iv;     // Catch: Throwable -> L21
        int r17 = r0;
        target$iv.add(TuplesKt.to(it, this.movableContentStatesAvailable.get(it)));     // Catch: Throwable -> L21
        i$iv$iv = i$iv$iv + 1;     // Catch: Throwable -> L21
        r0 = r17;
        goto L8
    L10:
        MutableObjectList unusedValues = target$iv;     // Catch: Throwable -> L21
        this.movableContentStatesAvailable.clear();     // Catch: Throwable -> L21
    L12:
        monitor-exit(lock$iv);
        ObjectList this_$iv = unusedValues;
        Object[] content$iv = this_$iv.content;
        int i$iv = 0;
        int r6 = this_$iv._size;
    L14:
        if (i$iv >= r6) goto L20;
        Pair r7 = (Pair) content$iv[i$iv];
        MovableContentStateReference reference = (MovableContentStateReference) r7.component1();
        MovableContentState state = (MovableContentState) r7.component2();
        if (state == null) goto L18;
        reference.getComposition$runtime_release().disposeUnusedMovableContent(state);
    L18:
        i$iv = i$iv + 1;
        goto L14
    L20:
        return;
    L11:
        unusedValues = ObjectListKt.emptyObjectList();     // Catch: Throwable -> L21
        goto L12
    }

    private final Function1<Object, Unit> readObserverOf(final ControlledComposition composition) {
        return new AnonymousClass1(composition);
    }

    private final Function1<Object, Unit> writeObserverOf(final ControlledComposition composition, final MutableScatterSet<Object> r3) {
        return new C06201(composition, r3);
    }

    private final <T> T composing(ControlledComposition composition, MutableScatterSet<Object> r8, Function0<? extends T> r9) {
        MutableSnapshot snapshot = Snapshot.Companion.takeMutableSnapshot(readObserverOf(composition), writeObserverOf(composition, r8));
        MutableSnapshot this_$iv = snapshot;     // Catch: Throwable -> L11
        Snapshot previous$iv = this_$iv.makeCurrent();     // Catch: Throwable -> L11
        T r5 = r9.invoke();     // Catch: Throwable -> L8
        this_$iv.restoreCurrent(previous$iv);     // Catch: Throwable -> L11
        applyAndCheck(snapshot);
        return r5;
    L8:
        th = move-exception;
        this_$iv.restoreCurrent(previous$iv);     // Catch: Throwable -> L11
        throw th;     // Catch: Throwable -> L11
    L11:
        th = move-exception;
        applyAndCheck(snapshot);
        throw th;
    }

    private final void applyAndCheck(MutableSnapshot snapshot) {
        SnapshotApplyResult applyResult = snapshot.apply();     // Catch: Throwable -> L8
        if ((applyResult instanceof SnapshotApplyResult.Failure) == true) goto L7;
        snapshot.dispose();
        return;
    L7:
        throw new IllegalStateException("Unsupported concurrent change during composition. A state object was modified by composition as well as being modified outside composition.".toString());     // Catch: Throwable -> L8
    L8:
        th = move-exception;
        snapshot.dispose();
        throw th;
    }

    public final boolean getHasPendingWork() {
        Object lock$iv = this.stateLock;
        monitor-enter(lock$iv);
        boolean r4 = true;
        if (this.snapshotInvalidations.isNotEmpty() == false) goto L8;
    L21:
        monitor-exit(lock$iv);
        return r4;
    L8:
        if (this.compositionInvalidations.getSize() == 0) goto L10;
        boolean r3 = true;
    L11:
        if (r3 == true) goto L21;
        if (this.concurrentCompositionsOutstanding > 0) goto L21;
        if (this.compositionsAwaitingApply.isEmpty() == false) goto L21;
        if (getHasBroadcastFrameClockAwaitersLocked() == true) goto L21;
        r4 = false;
        goto L21
    L10:
        r3 = false;
    L23:
        th = move-exception;
        throw th;
    }

    private final boolean getHasFrameWorkLocked() {
        if (this.compositionInvalidations.getSize() == 0) goto L5;
        boolean r0 = true;
    L6:
        if (r0 == false) goto L8;
        return true;
    L8:
        if (getHasBroadcastFrameClockAwaitersLocked() == false) goto L11;
        return true;
    L11:
        return false;
    L5:
        r0 = false;
        goto L6
    }

    private final boolean getHasConcurrentFrameWorkLocked() {
        if (this.compositionsAwaitingApply.isEmpty() == true) goto L5;
    L8:
        return true;
    L5:
        if (getHasBroadcastFrameClockAwaitersLocked() == true) goto L8;
        return false;
    }

    public final Object awaitIdle(Continuation<? super Unit> r4) {
        Object r0 = FlowKt.collect(FlowKt.takeWhile(getCurrentState(), new AnonymousClass2(null)), r4);
        if (r0 != IntrinsicsKt.getCOROUTINE_SUSPENDED()) goto L6;
        return r0;
    L6:
        return Unit.INSTANCE;
    }

    public final void pauseCompositionFrameClock() {
        Object lock$iv = this.stateLock;
        monitor-enter(lock$iv);
        this.frameClockPaused = true;     // Catch: Throwable -> L8
        Unit r2 = Unit.INSTANCE;     // Catch: Throwable -> L8
        monitor-exit(lock$iv);
        return;
    L8:
        th = move-exception;
        throw th;
    }

    public final void resumeCompositionFrameClock() {
        Object lock$iv = this.stateLock;
        monitor-enter(lock$iv);
    L14:
        th = move-exception;
        throw th;
    L6:
        if (this.frameClockPaused == false) goto L9;
        this.frameClockPaused = false;     // Catch: Throwable -> L14
        CancellableContinuation<Unit> r3 = deriveStateLocked();     // Catch: Throwable -> L14
    L10:
        monitor-exit(lock$iv);
        if (r3 == null) goto L19;
        Result.Companion r0 = Result.Companion;
        r3.resumeWith(Result.m7425constructorimpl(Unit.INSTANCE));
        return;
    L19:
        return;
    L9:
        r3 = null;
        goto L10
    }

    @Override // androidx.compose.runtime.CompositionContext
    public int getCompoundHashKey$runtime_release() {
        return 1000;
    }

    @Override // androidx.compose.runtime.CompositionContext
    public boolean getCollectingCallByInformation$runtime_release() {
        return _hotReloadEnabled.get().booleanValue();
    }

    @Override // androidx.compose.runtime.CompositionContext
    public boolean getCollectingParameterInformation$runtime_release() {
        return false;
    }

    @Override // androidx.compose.runtime.CompositionContext
    public boolean getCollectingSourceInformation$runtime_release() {
        return false;
    }

    @Override // androidx.compose.runtime.CompositionContext
    public void recordInspectionTable$runtime_release(Set<CompositionData> r1) {
    }

    @Override // androidx.compose.runtime.CompositionContext
    public void registerComposition$runtime_release(ControlledComposition composition) {
    }

    @Override // androidx.compose.runtime.CompositionContext
    public void unregisterComposition$runtime_release(ControlledComposition composition) {
        Object lock$iv = this.stateLock;
        monitor-enter(lock$iv);
        removeKnownCompositionLocked(composition);     // Catch: Throwable -> L8
        this.compositionInvalidations.remove(composition);     // Catch: Throwable -> L8
        this.compositionsAwaitingApply.remove(composition);     // Catch: Throwable -> L8
        Unit r2 = Unit.INSTANCE;     // Catch: Throwable -> L8
        monitor-exit(lock$iv);
        return;
    L8:
        th = move-exception;
        throw th;
    }

    @Override // androidx.compose.runtime.CompositionContext
    public void invalidate$runtime_release(ControlledComposition composition) {
        Object lock$iv = this.stateLock;
        monitor-enter(lock$iv);
    L14:
        th = move-exception;
        throw th;
    L6:
        if (this.compositionInvalidations.contains(composition) == true) goto L9;
        this.compositionInvalidations.add(composition);     // Catch: Throwable -> L14
        CancellableContinuation<Unit> r3 = deriveStateLocked();     // Catch: Throwable -> L14
    L10:
        monitor-exit(lock$iv);
        if (r3 == null) goto L19;
        Result.Companion r0 = Result.Companion;
        r3.resumeWith(Result.m7425constructorimpl(Unit.INSTANCE));
        return;
    L19:
        return;
    L9:
        r3 = null;
        goto L10
    }

    @Override // androidx.compose.runtime.CompositionContext
    public void invalidateScope$runtime_release(RecomposeScopeImpl scope) {
        Object lock$iv = this.stateLock;
        monitor-enter(lock$iv);
        this.snapshotInvalidations.add(scope);     // Catch: Throwable -> L10
        CancellableContinuation<Unit> r3 = deriveStateLocked();     // Catch: Throwable -> L10
        monitor-exit(lock$iv);
        if (r3 == null) goto L15;
        Result.Companion r0 = Result.Companion;
        r3.resumeWith(Result.m7425constructorimpl(Unit.INSTANCE));
        return;
    L15:
        return;
    L10:
        th = move-exception;
        throw th;
    }

    @Override // androidx.compose.runtime.CompositionContext
    public void insertMovableContent$runtime_release(MovableContentStateReference reference) {
        Object lock$iv = this.stateLock;
        monitor-enter(lock$iv);
        this.movableContentAwaitingInsert.add(reference);     // Catch: Throwable -> L10
        CancellableContinuation<Unit> r3 = deriveStateLocked();     // Catch: Throwable -> L10
        monitor-exit(lock$iv);
        if (r3 == null) goto L15;
        Result.Companion r0 = Result.Companion;
        r3.resumeWith(Result.m7425constructorimpl(Unit.INSTANCE));
        return;
    L15:
        return;
    L10:
        th = move-exception;
        throw th;
    }

    @Override // androidx.compose.runtime.CompositionContext
    public void deletedMovableContent$runtime_release(MovableContentStateReference reference) {
        Object lock$iv = this.stateLock;
        monitor-enter(lock$iv);
        MultiValueMap.m3883addimpl(this.movableContentRemoved, reference.getContent$runtime_release(), reference);     // Catch: Throwable -> L11
        if (reference.getNestedReferences$runtime_release() == null) goto L8;
        deletedMovableContent$lambda$73$recordNestedStatesOf(this, reference, reference);     // Catch: Throwable -> L11
    L8:
        Unit r2 = Unit.INSTANCE;     // Catch: Throwable -> L11
        monitor-exit(lock$iv);
        return;
    L11:
        th = move-exception;
        throw th;
    }

    private static final void deletedMovableContent$lambda$73$recordNestedStatesOf(Recomposer this$0, MovableContentStateReference container, MovableContentStateReference reference) {
        List<MovableContentStateReference> r0 = reference.getNestedReferences$runtime_release();
        if (r0 == null) goto L8;
        int index$iv = 0;
        int r3 = r0.size();
    L5:
        if (index$iv >= r3) goto L10;
        Object item$iv = r0.get(index$iv);
        MovableContentStateReference nestedReference = (MovableContentStateReference) item$iv;
        this$0.movableContentNestedStatesAvailable.add(nestedReference.getContent$runtime_release(), new NestedMovableContent(nestedReference, container));
        deletedMovableContent$lambda$73$recordNestedStatesOf(this$0, container, nestedReference);
        index$iv = index$iv + 1;
        goto L5
    L10:
        return;
    }

    @Override // androidx.compose.runtime.CompositionContext
    public void movableContentStateReleased$runtime_release(MovableContentStateReference reference, MovableContentState data, Applier<?> r31) {
        Recomposer r1 = this;
        Object lock$iv = r1.stateLock;
        int $i$f$synchronized = 0;
        monitor-enter(lock$iv);
        r1.movableContentStatesAvailable.set(reference, data);     // Catch: Throwable -> L39
        ObjectList<MovableContentStateReference> r6 = MultiValueMap.m3892getimpl(r1.movableContentNestedExtractionsPending, reference);     // Catch: Throwable -> L39
        if (r6.isNotEmpty() == true) goto L44;
        Object lock$iv2 = lock$iv;
    L34:
        Unit r0 = Unit.INSTANCE;     // Catch: Throwable -> L37
        monitor-exit(lock$iv2);
        return;
    L37:
        th = th;
    L42:
        monitor-exit(lock$iv2);
        throw th;
    L44:
        ScatterMap<MovableContentStateReference, MovableContentState> r8 = data.extractNestedStates$runtime_release(r31, r6);     // Catch: Throwable -> L31
        Object[] k$iv = r8.keys;     // Catch: Throwable -> L31
        Object[] v$iv = r8.values;     // Catch: Throwable -> L31
        long[] m$iv$iv = r8.metadata;     // Catch: Throwable -> L31
        int lastIndex$iv$iv = m$iv$iv.length - 2;     // Catch: Throwable -> L31
        int i$iv$iv = 0;
        if (0 > lastIndex$iv$iv) goto L28;
    L10:
        long slot$iv$iv = m$iv$iv[i$iv$iv];     // Catch: Throwable -> L31
        lock$iv2 = lock$iv;
        int $i$f$synchronized2 = $i$f$synchronized;
        ObjectList<MovableContentStateReference> r20 = r6;
        long $this$maskEmptyOrDeleted$iv$iv$iv = (((~slot$iv$iv) << 7) & slot$iv$iv) & (-9187201950435737472L);
        if ($this$maskEmptyOrDeleted$iv$iv$iv == (-9187201950435737472L)) goto L26;
        int r4 = 8;
        int bitCount$iv$iv = 8 - ((~(i$iv$iv - lastIndex$iv$iv)) >>> 31);
        int j$iv$iv = 0;
    L14:
        if (j$iv$iv >= bitCount$iv$iv) goto L25;
        long value$iv$iv$iv = slot$iv$iv & 255;
        if (value$iv$iv$iv >= 128) goto L18;
        boolean r21 = true;
    L19:
        if (r21 == false) goto L23;
        int index$iv$iv = (i$iv$iv << 3) + j$iv$iv;
        Object r24 = k$iv[index$iv$iv];     // Catch: Throwable -> L37
        MovableContentState state = (MovableContentState) v$iv[index$iv$iv];     // Catch: Throwable -> L37
        r1.movableContentStatesAvailable.set((MovableContentStateReference) r24, state);     // Catch: Throwable -> L37
    L23:
        slot$iv$iv = slot$iv$iv >> r4;     // Catch: Throwable -> L37
        j$iv$iv = j$iv$iv + 1;     // Catch: Throwable -> L37
        r1 = this;
        r4 = r4;
        goto L14
    L18:
        r21 = false;
        goto L19
    L25:
        if (bitCount$iv$iv != r4) goto L34;
    L26:
        if (i$iv$iv == lastIndex$iv$iv) goto L34;
        i$iv$iv = i$iv$iv + 1;     // Catch: Throwable -> L37
        r1 = this;
        $i$f$synchronized = $i$f$synchronized2;
        r6 = r20;
        lock$iv = lock$iv2;
        goto L10
    L28:
        lock$iv2 = lock$iv;
    L31:
        th = th;
    L41:
        lock$iv2 = lock$iv;
    L39:
        th = th;
        goto L41
    }

    @Override // androidx.compose.runtime.CompositionContext
    public void reportRemovedComposition$runtime_release(ControlledComposition composition) {
        Object lock$iv = this.stateLock;
        monitor-enter(lock$iv);
        LinkedHashSet r3 = this.compositionsRemoved;     // Catch: Throwable -> L11
        if (r3 != null) goto L8;
        r3 = new LinkedHashSet();     // Catch: Throwable -> L11
        this.compositionsRemoved = r3;     // Catch: Throwable -> L11
    L8:
        r3.add(composition);     // Catch: Throwable -> L11
        monitor-exit(lock$iv);
        return;
    L11:
        th = move-exception;
        throw th;
    }

    @Override // androidx.compose.runtime.CompositionContext
    public MovableContentState movableContentStateResolve$runtime_release(MovableContentStateReference reference) {
        Object lock$iv = this.stateLock;
        monitor-enter(lock$iv);
        MovableContentState r3 = this.movableContentStatesAvailable.remove(reference);     // Catch: Throwable -> L8
        monitor-exit(lock$iv);
        return r3;
    L8:
        th = move-exception;
        throw th;
    }

    @Override // androidx.compose.runtime.CompositionContext
    public Composition getComposition$runtime_release() {
        return null;
    }

    static {
        Companion = new Companion(null);
        $stable = 8;
        _runningRecomposers = StateFlowKt.MutableStateFlow(ExtensionsKt.persistentSetOf());
        _hotReloadEnabled = new AtomicReference(false);
    }
}
