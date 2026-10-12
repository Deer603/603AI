package kotlinx.coroutines.channels;

import androidx.autofill.HintConstants;
import androidx.collection.SieveCacheKt;
import androidx.concurrent.futures.AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0;
import androidx.webkit.ProxyConfig;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.ExceptionsKt;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.CoroutineStackFrame;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.TypeIntrinsics;
import kotlin.text.StringsKt;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.CancellableContinuationKt;
import kotlinx.coroutines.DebugKt;
import kotlinx.coroutines.DebugStringsKt;
import kotlinx.coroutines.Waiter;
import kotlinx.coroutines.internal.ConcurrentLinkedListKt;
import kotlinx.coroutines.internal.ConcurrentLinkedListNode;
import kotlinx.coroutines.internal.InlineList;
import kotlinx.coroutines.internal.OnUndeliveredElementKt;
import kotlinx.coroutines.internal.Segment;
import kotlinx.coroutines.internal.SegmentOrClosed;
import kotlinx.coroutines.internal.StackTraceRecoveryKt;
import kotlinx.coroutines.internal.Symbol;
import kotlinx.coroutines.internal.UndeliveredElementException;
import kotlinx.coroutines.selects.SelectClause1;
import kotlinx.coroutines.selects.SelectClause1Impl;
import kotlinx.coroutines.selects.SelectClause2;
import kotlinx.coroutines.selects.SelectClause2Impl;
import kotlinx.coroutines.selects.SelectImplementation;
import kotlinx.coroutines.selects.SelectInstance;
import kotlinx.coroutines.selects.TrySelectDetailedResult;

/* JADX INFO: compiled from: BufferedChannel.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000À\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b#\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b!\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b$\b\u0010\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002:\u0004à\u0001á\u0001B1\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\"\b\u0002\u0010\u0005\u001a\u001c\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006j\n\u0012\u0004\u0012\u00028\u0000\u0018\u0001`\b¢\u0006\u0002\u0010\tJ\u0010\u0010P\u001a\u00020\u001c2\u0006\u0010Q\u001a\u00020\u0010H\u0002J\u0006\u0010R\u001a\u00020\u0007J\u0010\u0010R\u001a\u00020\u001c2\b\u0010S\u001a\u0004\u0018\u00010\u0016J\u0016\u0010R\u001a\u00020\u00072\u000e\u0010S\u001a\n\u0018\u00010Tj\u0004\u0018\u0001`UJ\u0017\u0010V\u001a\u00020\u001c2\b\u0010S\u001a\u0004\u0018\u00010\u0016H\u0010¢\u0006\u0002\bWJ\u001e\u0010X\u001a\u00020\u00072\f\u0010Y\u001a\b\u0012\u0004\u0012\u00028\u00000\u00142\u0006\u0010K\u001a\u00020\u0010H\u0002J\u0006\u0010Z\u001a\u00020\u0007J\u0012\u0010[\u001a\u00020\u001c2\b\u0010S\u001a\u0004\u0018\u00010\u0016H\u0016J\u000e\u0010\\\u001a\b\u0012\u0004\u0012\u00028\u00000\u0014H\u0002J\u001a\u0010]\u001a\u00020\u001c2\b\u0010S\u001a\u0004\u0018\u00010\u00162\u0006\u0010R\u001a\u00020\u001cH\u0014J\u0010\u0010^\u001a\u00020\u00072\u0006\u0010_\u001a\u00020\u0010H\u0002J\u0016\u0010`\u001a\b\u0012\u0004\u0012\u00028\u00000\u00142\u0006\u0010_\u001a\u00020\u0010H\u0002J\b\u0010a\u001a\u00020\u0007H\u0002J\u0010\u0010b\u001a\u00020\u00072\u0006\u0010c\u001a\u00020\u0010H\u0004J\b\u0010d\u001a\u00020\u0007H\u0002J.\u0010e\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00142\u0006\u0010f\u001a\u00020\u00102\f\u0010g\u001a\b\u0012\u0004\u0012\u00028\u00000\u00142\u0006\u0010h\u001a\u00020\u0010H\u0002J&\u0010i\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00142\u0006\u0010f\u001a\u00020\u00102\f\u0010g\u001a\b\u0012\u0004\u0012\u00028\u00000\u0014H\u0002J&\u0010j\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00142\u0006\u0010f\u001a\u00020\u00102\f\u0010g\u001a\b\u0012\u0004\u0012\u00028\u00000\u0014H\u0002J\r\u0010k\u001a\u00020\u001cH\u0000¢\u0006\u0002\blJ\u0012\u0010m\u001a\u00020\u00072\b\b\u0002\u0010n\u001a\u00020\u0010H\u0002J\b\u0010o\u001a\u00020\u0007H\u0002J-\u0010p\u001a\u00020\u00072#\u0010q\u001a\u001f\u0012\u0015\u0012\u0013\u0018\u00010\u0016¢\u0006\f\b:\u0012\b\b;\u0012\u0004\b\b(S\u0012\u0004\u0012\u00020\u00070\u0006H\u0016J&\u0010r\u001a\u00020\u001c2\f\u0010s\u001a\b\u0012\u0004\u0012\u00028\u00000\u00142\u0006\u0010t\u001a\u00020\u00042\u0006\u0010u\u001a\u00020\u0010H\u0002J\u0018\u0010v\u001a\u00020\u001c2\u0006\u0010w\u001a\u00020\u00102\u0006\u0010\u001b\u001a\u00020\u001cH\u0002J\u000f\u0010x\u001a\b\u0012\u0004\u0012\u00028\u00000yH\u0096\u0002J\u0016\u0010z\u001a\u00020\u00102\f\u0010Y\u001a\b\u0012\u0004\u0012\u00028\u00000\u0014H\u0002J\b\u0010{\u001a\u00020\u0007H\u0002J\b\u0010|\u001a\u00020\u0007H\u0002J\b\u0010}\u001a\u00020\u0007H\u0002J\u001e\u0010~\u001a\u00020\u00072\u0006\u0010f\u001a\u00020\u00102\f\u0010g\u001a\b\u0012\u0004\u0012\u00028\u00000\u0014H\u0002J\b\u0010\u007f\u001a\u00020\u0007H\u0014J\u001f\u0010\u0080\u0001\u001a\u00020\u00072\u0014\u0010\u0081\u0001\u001a\u000f\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000,0\u0082\u0001H\u0002J\u0019\u0010\u0083\u0001\u001a\u00020\u00072\u000e\u0010\u0081\u0001\u001a\t\u0012\u0004\u0012\u00028\u00000\u0082\u0001H\u0002J\u0015\u0010\u0084\u0001\u001a\u00020\u00072\n\u0010<\u001a\u0006\u0012\u0002\b\u000309H\u0002J$\u0010\u0085\u0001\u001a\u00020\u00072\u0007\u0010\u0086\u0001\u001a\u00028\u00002\n\u0010<\u001a\u0006\u0012\u0002\b\u000309H\u0002¢\u0006\u0003\u0010\u0087\u0001J\u0019\u0010\u0088\u0001\u001a\u00020\u00072\u0007\u0010\u0086\u0001\u001a\u00028\u0000H\u0082@¢\u0006\u0003\u0010\u0089\u0001J(\u0010\u008a\u0001\u001a\u00020\u00072\u0007\u0010\u0086\u0001\u001a\u00028\u00002\u000e\u0010\u0081\u0001\u001a\t\u0012\u0004\u0012\u00020\u00070\u0082\u0001H\u0002¢\u0006\u0003\u0010\u008b\u0001J\t\u0010\u008c\u0001\u001a\u00020\u0007H\u0014J\t\u0010\u008d\u0001\u001a\u00020\u0007H\u0014J!\u0010\u008e\u0001\u001a\u0004\u0018\u00010\f2\t\u0010\u008f\u0001\u001a\u0004\u0018\u00010\f2\t\u0010\u0090\u0001\u001a\u0004\u0018\u00010\fH\u0002J!\u0010\u0091\u0001\u001a\u0004\u0018\u00010\f2\t\u0010\u008f\u0001\u001a\u0004\u0018\u00010\f2\t\u0010\u0090\u0001\u001a\u0004\u0018\u00010\fH\u0002J!\u0010\u0092\u0001\u001a\u0004\u0018\u00010\f2\t\u0010\u008f\u0001\u001a\u0004\u0018\u00010\f2\t\u0010\u0090\u0001\u001a\u0004\u0018\u00010\fH\u0002J!\u0010\u0093\u0001\u001a\u0004\u0018\u00010\f2\t\u0010\u008f\u0001\u001a\u0004\u0018\u00010\f2\t\u0010\u0090\u0001\u001a\u0004\u0018\u00010\fH\u0002J\u0010\u0010\u0094\u0001\u001a\u00028\u0000H\u0096@¢\u0006\u0003\u0010\u0095\u0001J\u001f\u0010\u0096\u0001\u001a\b\u0012\u0004\u0012\u00028\u00000,H\u0096@ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\b\u0097\u0001\u0010\u0095\u0001J>\u0010\u0098\u0001\u001a\b\u0012\u0004\u0012\u00028\u00000,2\f\u0010s\u001a\b\u0012\u0004\u0012\u00028\u00000\u00142\u0006\u0010t\u001a\u00020\u00042\u0007\u0010\u0099\u0001\u001a\u00020\u0010H\u0082@ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\b\u009a\u0001\u0010\u009b\u0001J\u008c\u0002\u0010\u009c\u0001\u001a\u0003H\u009d\u0001\"\u0005\b\u0001\u0010\u009d\u00012\t\u0010\u009e\u0001\u001a\u0004\u0018\u00010\f2$\u0010\u009f\u0001\u001a\u001f\u0012\u0014\u0012\u00128\u0000¢\u0006\r\b:\u0012\t\b;\u0012\u0005\b\b(\u0086\u0001\u0012\u0005\u0012\u0003H\u009d\u00010\u00062V\u0010 \u0001\u001aQ\u0012\u001a\u0012\u0018\u0012\u0004\u0012\u00028\u00000\u0014¢\u0006\r\b:\u0012\t\b;\u0012\u0005\b\b(¡\u0001\u0012\u0014\u0012\u00120\u0004¢\u0006\r\b:\u0012\t\b;\u0012\u0005\b\b(¢\u0001\u0012\u0014\u0012\u00120\u0010¢\u0006\r\b:\u0012\t\b;\u0012\u0005\b\b(\u0099\u0001\u0012\u0005\u0012\u0003H\u009d\u0001082\u000f\u0010£\u0001\u001a\n\u0012\u0005\u0012\u0003H\u009d\u00010¤\u00012X\b\u0002\u0010¥\u0001\u001aQ\u0012\u001a\u0012\u0018\u0012\u0004\u0012\u00028\u00000\u0014¢\u0006\r\b:\u0012\t\b;\u0012\u0005\b\b(¡\u0001\u0012\u0014\u0012\u00120\u0004¢\u0006\r\b:\u0012\t\b;\u0012\u0005\b\b(¢\u0001\u0012\u0014\u0012\u00120\u0010¢\u0006\r\b:\u0012\t\b;\u0012\u0005\b\b(\u0099\u0001\u0012\u0005\u0012\u0003H\u009d\u000108H\u0082\b¢\u0006\u0003\u0010¦\u0001Jh\u0010§\u0001\u001a\u00020\u00072\f\u0010s\u001a\b\u0012\u0004\u0012\u00028\u00000\u00142\u0006\u0010t\u001a\u00020\u00042\u0007\u0010\u0099\u0001\u001a\u00020\u00102\b\u0010\u009e\u0001\u001a\u00030¨\u00012#\u0010\u009f\u0001\u001a\u001e\u0012\u0014\u0012\u00128\u0000¢\u0006\r\b:\u0012\t\b;\u0012\u0005\b\b(\u0086\u0001\u0012\u0004\u0012\u00020\u00070\u00062\u000e\u0010£\u0001\u001a\t\u0012\u0004\u0012\u00020\u00070¤\u0001H\u0082\bJ/\u0010©\u0001\u001a\u00028\u00002\f\u0010s\u001a\b\u0012\u0004\u0012\u00028\u00000\u00142\u0006\u0010t\u001a\u00020\u00042\u0007\u0010\u0099\u0001\u001a\u00020\u0010H\u0082@¢\u0006\u0003\u0010\u009b\u0001J \u0010ª\u0001\u001a\u00020\u00072\n\u0010<\u001a\u0006\u0012\u0002\b\u0003092\t\u0010\u008f\u0001\u001a\u0004\u0018\u00010\fH\u0002J \u0010«\u0001\u001a\u00020\u00072\n\u0010<\u001a\u0006\u0012\u0002\b\u0003092\t\u0010\u0086\u0001\u001a\u0004\u0018\u00010\fH\u0014J\u0017\u0010¬\u0001\u001a\u00020\u00072\f\u0010Y\u001a\b\u0012\u0004\u0012\u00028\u00000\u0014H\u0002J\u0019\u0010\u00ad\u0001\u001a\u00020\u00072\u0007\u0010\u0086\u0001\u001a\u00028\u0000H\u0096@¢\u0006\u0003\u0010\u0089\u0001J\u001c\u0010®\u0001\u001a\u00020\u001c2\u0007\u0010\u0086\u0001\u001a\u00028\u0000H\u0090@¢\u0006\u0006\b¯\u0001\u0010\u0089\u0001J\u0082\u0002\u0010°\u0001\u001a\u0003H\u009d\u0001\"\u0005\b\u0001\u0010\u009d\u00012\u0007\u0010\u0086\u0001\u001a\u00028\u00002\t\u0010\u009e\u0001\u001a\u0004\u0018\u00010\f2\u000f\u0010±\u0001\u001a\n\u0012\u0005\u0012\u0003H\u009d\u00010¤\u00012A\u0010 \u0001\u001a<\u0012\u001a\u0012\u0018\u0012\u0004\u0012\u00028\u00000\u0014¢\u0006\r\b:\u0012\t\b;\u0012\u0005\b\b(¡\u0001\u0012\u0014\u0012\u00120\u0004¢\u0006\r\b:\u0012\t\b;\u0012\u0005\b\b(¢\u0001\u0012\u0005\u0012\u0003H\u009d\u00010²\u00012\u000f\u0010£\u0001\u001a\n\u0012\u0005\u0012\u0003H\u009d\u00010¤\u00012o\b\u0002\u0010¥\u0001\u001ah\u0012\u001a\u0012\u0018\u0012\u0004\u0012\u00028\u00000\u0014¢\u0006\r\b:\u0012\t\b;\u0012\u0005\b\b(¡\u0001\u0012\u0014\u0012\u00120\u0004¢\u0006\r\b:\u0012\t\b;\u0012\u0005\b\b(¢\u0001\u0012\u0014\u0012\u00128\u0000¢\u0006\r\b:\u0012\t\b;\u0012\u0005\b\b(\u0086\u0001\u0012\u0014\u0012\u00120\u0010¢\u0006\r\b:\u0012\t\b;\u0012\u0005\b\b(´\u0001\u0012\u0005\u0012\u0003H\u009d\u00010³\u0001H\u0082\b¢\u0006\u0003\u0010µ\u0001Jb\u0010¶\u0001\u001a\u00020\u00072\f\u0010s\u001a\b\u0012\u0004\u0012\u00028\u00000\u00142\u0006\u0010t\u001a\u00020\u00042\u0007\u0010\u0086\u0001\u001a\u00028\u00002\u0007\u0010´\u0001\u001a\u00020\u00102\b\u0010\u009e\u0001\u001a\u00030¨\u00012\u000e\u0010±\u0001\u001a\t\u0012\u0004\u0012\u00020\u00070¤\u00012\u000e\u0010£\u0001\u001a\t\u0012\u0004\u0012\u00020\u00070¤\u0001H\u0082\b¢\u0006\u0003\u0010·\u0001J8\u0010¸\u0001\u001a\u00020\u00072\f\u0010s\u001a\b\u0012\u0004\u0012\u00028\u00000\u00142\u0006\u0010t\u001a\u00020\u00042\u0007\u0010\u0086\u0001\u001a\u00028\u00002\u0007\u0010´\u0001\u001a\u00020\u0010H\u0082@¢\u0006\u0003\u0010¹\u0001J\u000f\u0010º\u0001\u001a\u00020\u001cH\u0010¢\u0006\u0003\b»\u0001J\u0012\u0010º\u0001\u001a\u00020\u001c2\u0007\u0010¼\u0001\u001a\u00020\u0010H\u0003J\n\u0010½\u0001\u001a\u00030¾\u0001H\u0016J\u0010\u0010¿\u0001\u001a\u00030¾\u0001H\u0000¢\u0006\u0003\bÀ\u0001J\u001e\u0010Á\u0001\u001a\b\u0012\u0004\u0012\u00028\u00000,H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\bÂ\u0001\u0010Ã\u0001J'\u0010Ä\u0001\u001a\b\u0012\u0004\u0012\u00020\u00070,2\u0007\u0010\u0086\u0001\u001a\u00028\u0000H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\bÅ\u0001\u0010Æ\u0001J'\u0010Ç\u0001\u001a\b\u0012\u0004\u0012\u00020\u00070,2\u0007\u0010\u0086\u0001\u001a\u00028\u0000H\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\bÈ\u0001\u0010Æ\u0001J(\u0010É\u0001\u001a\u00020\u001c2\f\u0010s\u001a\b\u0012\u0004\u0012\u00028\u00000\u00142\u0006\u0010t\u001a\u00020\u00042\u0007\u0010Ê\u0001\u001a\u00020\u0010H\u0002J(\u0010Ë\u0001\u001a\u00020\u001c2\f\u0010s\u001a\b\u0012\u0004\u0012\u00028\u00000\u00142\u0006\u0010t\u001a\u00020\u00042\u0007\u0010Ê\u0001\u001a\u00020\u0010H\u0002J5\u0010Ì\u0001\u001a\u0004\u0018\u00010\f2\f\u0010s\u001a\b\u0012\u0004\u0012\u00028\u00000\u00142\u0006\u0010t\u001a\u00020\u00042\u0007\u0010\u0099\u0001\u001a\u00020\u00102\t\u0010\u009e\u0001\u001a\u0004\u0018\u00010\fH\u0002J5\u0010Í\u0001\u001a\u0004\u0018\u00010\f2\f\u0010s\u001a\b\u0012\u0004\u0012\u00028\u00000\u00142\u0006\u0010t\u001a\u00020\u00042\u0007\u0010\u0099\u0001\u001a\u00020\u00102\t\u0010\u009e\u0001\u001a\u0004\u0018\u00010\fH\u0002JK\u0010Î\u0001\u001a\u00020\u00042\f\u0010s\u001a\b\u0012\u0004\u0012\u00028\u00000\u00142\u0006\u0010t\u001a\u00020\u00042\u0007\u0010\u0086\u0001\u001a\u00028\u00002\u0007\u0010´\u0001\u001a\u00020\u00102\t\u0010\u009e\u0001\u001a\u0004\u0018\u00010\f2\u0007\u0010Ï\u0001\u001a\u00020\u001cH\u0002¢\u0006\u0003\u0010Ð\u0001JK\u0010Ñ\u0001\u001a\u00020\u00042\f\u0010s\u001a\b\u0012\u0004\u0012\u00028\u00000\u00142\u0006\u0010t\u001a\u00020\u00042\u0007\u0010\u0086\u0001\u001a\u00028\u00002\u0007\u0010´\u0001\u001a\u00020\u00102\t\u0010\u009e\u0001\u001a\u0004\u0018\u00010\f2\u0007\u0010Ï\u0001\u001a\u00020\u001cH\u0002¢\u0006\u0003\u0010Ð\u0001J\u0012\u0010Ò\u0001\u001a\u00020\u00072\u0007\u0010Ó\u0001\u001a\u00020\u0010H\u0002J\u0012\u0010Ô\u0001\u001a\u00020\u00072\u0007\u0010Ó\u0001\u001a\u00020\u0010H\u0002J\u0017\u0010Õ\u0001\u001a\u00020\u00072\u0006\u0010u\u001a\u00020\u0010H\u0000¢\u0006\u0003\bÖ\u0001J$\u0010×\u0001\u001a\u00020\u0007*\u00030¨\u00012\f\u0010s\u001a\b\u0012\u0004\u0012\u00028\u00000\u00142\u0006\u0010t\u001a\u00020\u0004H\u0002J$\u0010Ø\u0001\u001a\u00020\u0007*\u00030¨\u00012\f\u0010s\u001a\b\u0012\u0004\u0012\u00028\u00000\u00142\u0006\u0010t\u001a\u00020\u0004H\u0002J\u000e\u0010Ù\u0001\u001a\u00020\u0007*\u00030¨\u0001H\u0002J\u000e\u0010Ú\u0001\u001a\u00020\u0007*\u00030¨\u0001H\u0002J\u0017\u0010Û\u0001\u001a\u00020\u0007*\u00030¨\u00012\u0007\u0010Ü\u0001\u001a\u00020\u001cH\u0002J\u001c\u0010Ý\u0001\u001a\u00020\u001c*\u00020\f2\u0007\u0010\u0086\u0001\u001a\u00028\u0000H\u0002¢\u0006\u0003\u0010Þ\u0001J#\u0010ß\u0001\u001a\u00020\u001c*\u00020\f2\f\u0010s\u001a\b\u0012\u0004\u0012\u00028\u00000\u00142\u0006\u0010t\u001a\u00020\u0004H\u0002R\u0011\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\f0\u000bX\u0082\u0004R\t\u0010\r\u001a\u00020\u000eX\u0082\u0004R\u0014\u0010\u000f\u001a\u00020\u00108BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u0015\u0010\u0013\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00140\u000bX\u0082\u0004R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0015\u001a\u0004\u0018\u00010\u00168DX\u0084\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\u0019\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\f0\u000bX\u0082\u0004R\t\u0010\u001a\u001a\u00020\u000eX\u0082\u0004R\u001a\u0010\u001b\u001a\u00020\u001c8VX\u0097\u0004¢\u0006\f\u0012\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001b\u0010\u001fR\u001a\u0010 \u001a\u00020\u001c8VX\u0097\u0004¢\u0006\f\u0012\u0004\b!\u0010\u001e\u001a\u0004\b \u0010\u001fR\u0014\u0010\"\u001a\u00020\u001c8TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\"\u0010\u001fR\u001a\u0010#\u001a\u00020\u001c8VX\u0097\u0004¢\u0006\f\u0012\u0004\b$\u0010\u001e\u001a\u0004\b#\u0010\u001fR\u0014\u0010%\u001a\u00020\u001c8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b%\u0010\u001fR \u0010&\u001a\b\u0012\u0004\u0012\u00028\u00000'8VX\u0096\u0004¢\u0006\f\u0012\u0004\b(\u0010\u001e\u001a\u0004\b)\u0010*R&\u0010+\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000,0'8VX\u0096\u0004¢\u0006\f\u0012\u0004\b-\u0010\u001e\u001a\u0004\b.\u0010*R\"\u0010/\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000'8VX\u0096\u0004¢\u0006\f\u0012\u0004\b0\u0010\u001e\u001a\u0004\b1\u0010*R,\u00102\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0000038VX\u0096\u0004¢\u0006\f\u0012\u0004\b4\u0010\u001e\u001a\u0004\b5\u00106R*\u0010\u0005\u001a\u001c\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006j\n\u0012\u0004\u0012\u00028\u0000\u0018\u0001`\b8\u0000X\u0081\u0004¢\u0006\u0002\n\u0000Ru\u00107\u001ac\u0012\u0017\u0012\u0015\u0012\u0002\b\u000309¢\u0006\f\b:\u0012\b\b;\u0012\u0004\b\b(<\u0012\u0015\u0012\u0013\u0018\u00010\f¢\u0006\f\b:\u0012\b\b;\u0012\u0004\b\b(=\u0012\u0015\u0012\u0013\u0018\u00010\f¢\u0006\f\b:\u0012\b\b;\u0012\u0004\b\b(>\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00070\u0006\u0018\u000108j\u0004\u0018\u0001`?X\u0082\u0004¢\u0006\b\n\u0000\u0012\u0004\b@\u0010\u001eR\u0014\u0010A\u001a\u00020\u00168BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bB\u0010\u0018R\u0015\u0010C\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00140\u000bX\u0082\u0004R\t\u0010D\u001a\u00020\u000eX\u0082\u0004R\u0014\u0010E\u001a\u00020\u00108@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bF\u0010\u0012R\u0014\u0010G\u001a\u00020\u00168DX\u0084\u0004¢\u0006\u0006\u001a\u0004\bH\u0010\u0018R\u0015\u0010I\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00140\u000bX\u0082\u0004R\t\u0010J\u001a\u00020\u000eX\u0082\u0004R\u0014\u0010K\u001a\u00020\u00108@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bL\u0010\u0012R\u0018\u0010M\u001a\u00020\u001c*\u00020\u00108BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bM\u0010NR\u0018\u0010O\u001a\u00020\u001c*\u00020\u00108BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bO\u0010N\u0082\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006â\u0001"}, d2 = {"Lkotlinx/coroutines/channels/BufferedChannel;", "E", "Lkotlinx/coroutines/channels/Channel;", "capacity", "", "onUndeliveredElement", "Lkotlin/Function1;", "", "Lkotlinx/coroutines/internal/OnUndeliveredElement;", "(ILkotlin/jvm/functions/Function1;)V", "_closeCause", "Lkotlinx/atomicfu/AtomicRef;", "", "bufferEnd", "Lkotlinx/atomicfu/AtomicLong;", "bufferEndCounter", "", "getBufferEndCounter", "()J", "bufferEndSegment", "Lkotlinx/coroutines/channels/ChannelSegment;", "closeCause", "", "getCloseCause", "()Ljava/lang/Throwable;", "closeHandler", "completedExpandBuffersAndPauseFlag", "isClosedForReceive", "", "isClosedForReceive$annotations", "()V", "()Z", "isClosedForSend", "isClosedForSend$annotations", "isConflatedDropOldest", "isEmpty", "isEmpty$annotations", "isRendezvousOrUnlimited", "onReceive", "Lkotlinx/coroutines/selects/SelectClause1;", "getOnReceive$annotations", "getOnReceive", "()Lkotlinx/coroutines/selects/SelectClause1;", "onReceiveCatching", "Lkotlinx/coroutines/channels/ChannelResult;", "getOnReceiveCatching$annotations", "getOnReceiveCatching", "onReceiveOrNull", "getOnReceiveOrNull$annotations", "getOnReceiveOrNull", "onSend", "Lkotlinx/coroutines/selects/SelectClause2;", "getOnSend$annotations", "getOnSend", "()Lkotlinx/coroutines/selects/SelectClause2;", "onUndeliveredElementReceiveCancellationConstructor", "Lkotlin/Function3;", "Lkotlinx/coroutines/selects/SelectInstance;", "Lkotlin/ParameterName;", HintConstants.AUTOFILL_HINT_NAME, "select", "param", "internalResult", "Lkotlinx/coroutines/selects/OnCancellationConstructor;", "getOnUndeliveredElementReceiveCancellationConstructor$annotations", "receiveException", "getReceiveException", "receiveSegment", "receivers", "receiversCounter", "getReceiversCounter$kotlinx_coroutines_core", "sendException", "getSendException", "sendSegment", "sendersAndCloseStatus", "sendersCounter", "getSendersCounter$kotlinx_coroutines_core", "isClosedForReceive0", "(J)Z", "isClosedForSend0", "bufferOrRendezvousSend", "curSenders", "cancel", "cause", "Ljava/util/concurrent/CancellationException;", "Lkotlinx/coroutines/CancellationException;", "cancelImpl", "cancelImpl$kotlinx_coroutines_core", "cancelSuspendedReceiveRequests", "lastSegment", "checkSegmentStructureInvariants", "close", "closeLinkedList", "closeOrCancelImpl", "completeCancel", "sendersCur", "completeClose", "completeCloseOrCancel", "dropFirstElementUntilTheSpecifiedCellIsInTheBuffer", "globalCellIndex", "expandBuffer", "findSegmentBufferEnd", "id", "startFrom", "currentBufferEndCounter", "findSegmentReceive", "findSegmentSend", "hasElements", "hasElements$kotlinx_coroutines_core", "incCompletedExpandBufferAttempts", "nAttempts", "invokeCloseHandler", "invokeOnClose", "handler", "isCellNonEmpty", "segment", "index", "globalIndex", "isClosed", "sendersAndCloseStatusCur", "iterator", "Lkotlinx/coroutines/channels/ChannelIterator;", "markAllEmptyCellsAsClosed", "markCancellationStarted", "markCancelled", "markClosed", "moveSegmentBufferEndToSpecifiedOrLast", "onClosedIdempotent", "onClosedReceiveCatchingOnNoWaiterSuspend", "cont", "Lkotlinx/coroutines/CancellableContinuation;", "onClosedReceiveOnNoWaiterSuspend", "onClosedSelectOnReceive", "onClosedSelectOnSend", "element", "(Ljava/lang/Object;Lkotlinx/coroutines/selects/SelectInstance;)V", "onClosedSend", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "onClosedSendOnNoWaiterSuspend", "(Ljava/lang/Object;Lkotlinx/coroutines/CancellableContinuation;)V", "onReceiveDequeued", "onReceiveEnqueued", "processResultSelectReceive", "ignoredParam", "selectResult", "processResultSelectReceiveCatching", "processResultSelectReceiveOrNull", "processResultSelectSend", "receive", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "receiveCatching", "receiveCatching-JP2dKIU", "receiveCatchingOnNoWaiterSuspend", "r", "receiveCatchingOnNoWaiterSuspend-GKJJFZk", "(Lkotlinx/coroutines/channels/ChannelSegment;IJLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "receiveImpl", "R", "waiter", "onElementRetrieved", "onSuspend", "segm", "i", "onClosed", "Lkotlin/Function0;", "onNoWaiterSuspend", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function3;)Ljava/lang/Object;", "receiveImplOnNoWaiter", "Lkotlinx/coroutines/Waiter;", "receiveOnNoWaiterSuspend", "registerSelectForReceive", "registerSelectForSend", "removeUnprocessedElements", "send", "sendBroadcast", "sendBroadcast$kotlinx_coroutines_core", "sendImpl", "onRendezvousOrBuffered", "Lkotlin/Function2;", "Lkotlin/Function4;", "s", "(Ljava/lang/Object;Ljava/lang/Object;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function4;)Ljava/lang/Object;", "sendImplOnNoWaiter", "(Lkotlinx/coroutines/channels/ChannelSegment;ILjava/lang/Object;JLkotlinx/coroutines/Waiter;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V", "sendOnNoWaiterSuspend", "(Lkotlinx/coroutines/channels/ChannelSegment;ILjava/lang/Object;JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "shouldSendSuspend", "shouldSendSuspend$kotlinx_coroutines_core", "curSendersAndCloseStatus", "toString", "", "toStringDebug", "toStringDebug$kotlinx_coroutines_core", "tryReceive", "tryReceive-PtdJZtk", "()Ljava/lang/Object;", "trySend", "trySend-JP2dKIU", "(Ljava/lang/Object;)Ljava/lang/Object;", "trySendDropOldest", "trySendDropOldest-JP2dKIU", "updateCellExpandBuffer", "b", "updateCellExpandBufferSlow", "updateCellReceive", "updateCellReceiveSlow", "updateCellSend", "closed", "(Lkotlinx/coroutines/channels/ChannelSegment;ILjava/lang/Object;JLjava/lang/Object;Z)I", "updateCellSendSlow", "updateReceiversCounterIfLower", "value", "updateSendersCounterIfLower", "waitExpandBufferCompletion", "waitExpandBufferCompletion$kotlinx_coroutines_core", "prepareReceiverForSuspension", "prepareSenderForSuspension", "resumeReceiverOnClosedChannel", "resumeSenderOnCancelledChannel", "resumeWaiterOnClosedChannel", "receiver", "tryResumeReceiver", "(Ljava/lang/Object;Ljava/lang/Object;)Z", "tryResumeSender", "BufferedChannelIterator", "SendBroadcast", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
public class BufferedChannel<E> implements Channel<E> {
    private static final /* synthetic */ AtomicReferenceFieldUpdater _closeCause$volatile$FU = null;
    private static final /* synthetic */ AtomicLongFieldUpdater bufferEnd$volatile$FU = null;
    private static final /* synthetic */ AtomicReferenceFieldUpdater bufferEndSegment$volatile$FU = null;
    private static final /* synthetic */ AtomicReferenceFieldUpdater closeHandler$volatile$FU = null;
    private static final /* synthetic */ AtomicLongFieldUpdater completedExpandBuffersAndPauseFlag$volatile$FU = null;
    private static final /* synthetic */ AtomicReferenceFieldUpdater receiveSegment$volatile$FU = null;
    private static final /* synthetic */ AtomicLongFieldUpdater receivers$volatile$FU = null;
    private static final /* synthetic */ AtomicReferenceFieldUpdater sendSegment$volatile$FU = null;
    private static final /* synthetic */ AtomicLongFieldUpdater sendersAndCloseStatus$volatile$FU = null;
    private volatile /* synthetic */ Object _closeCause$volatile;
    private volatile /* synthetic */ long bufferEnd$volatile;
    private volatile /* synthetic */ Object bufferEndSegment$volatile;
    private final int capacity;
    private volatile /* synthetic */ Object closeHandler$volatile;
    private volatile /* synthetic */ long completedExpandBuffersAndPauseFlag$volatile;
    public final Function1<E, Unit> onUndeliveredElement;
    private final Function3<SelectInstance<?>, Object, Object, Function1<Throwable, Unit>> onUndeliveredElementReceiveCancellationConstructor;
    private volatile /* synthetic */ Object receiveSegment$volatile;
    private volatile /* synthetic */ long receivers$volatile;
    private volatile /* synthetic */ Object sendSegment$volatile;
    private volatile /* synthetic */ long sendersAndCloseStatus$volatile;

    /* JADX INFO: compiled from: BufferedChannel.kt */
    @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0082\u0004\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u00012\u00020\u0002B\u0005¢\u0006\u0002\u0010\u0003J\u000e\u0010\t\u001a\u00020\u0006H\u0096B¢\u0006\u0002\u0010\nJ,\u0010\u000b\u001a\u00020\u00062\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0082@¢\u0006\u0002\u0010\u0012J\u001c\u0010\u0013\u001a\u00020\u00142\n\u0010\f\u001a\u0006\u0012\u0002\b\u00030\u00152\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\u000e\u0010\u0016\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0002\u0010\u0017J\b\u0010\u0018\u001a\u00020\u0006H\u0002J\b\u0010\u0019\u001a\u00020\u0014H\u0002J\u0013\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u001b\u001a\u00028\u0000¢\u0006\u0002\u0010\u001cJ\u0006\u0010\u001d\u001a\u00020\u0014R\u001a\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00058\u0002@\u0002X\u0083\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001e"}, d2 = {"Lkotlinx/coroutines/channels/BufferedChannel$BufferedChannelIterator;", "Lkotlinx/coroutines/channels/ChannelIterator;", "Lkotlinx/coroutines/Waiter;", "(Lkotlinx/coroutines/channels/BufferedChannel;)V", "continuation", "Lkotlinx/coroutines/CancellableContinuationImpl;", "", "receiveResult", "", "hasNext", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "hasNextOnNoWaiterSuspend", "segment", "Lkotlinx/coroutines/channels/ChannelSegment;", "index", "", "r", "", "(Lkotlinx/coroutines/channels/ChannelSegment;IJLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "invokeOnCancellation", "", "Lkotlinx/coroutines/internal/Segment;", "next", "()Ljava/lang/Object;", "onClosedHasNext", "onClosedHasNextNoWaiterSuspend", "tryResumeHasNext", "element", "(Ljava/lang/Object;)Z", "tryResumeHasNextOnClosedChannel", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
    private final class BufferedChannelIterator implements ChannelIterator<E>, Waiter {
        private CancellableContinuationImpl<? super Boolean> continuation;
        private Object receiveResult;
        final /* synthetic */ BufferedChannel<E> this$0;

        public BufferedChannelIterator(BufferedChannel this$0) {
            this.this$0 = this$0;
            this.receiveResult = BufferedChannelKt.access$getNO_RECEIVE_RESULT$p();
        }

        public static final /* synthetic */ Object access$hasNextOnNoWaiterSuspend(BufferedChannelIterator $this, ChannelSegment segment, int index, long r, Continuation $completion) {
            return $this.hasNextOnNoWaiterSuspend(segment, index, r, $completion);
        }

        public static final /* synthetic */ void access$onClosedHasNextNoWaiterSuspend(BufferedChannelIterator $this) {
            $this.onClosedHasNextNoWaiterSuspend();
        }

        public static final /* synthetic */ void access$setContinuation$p(BufferedChannelIterator $this, CancellableContinuationImpl r1) {
            $this.continuation = r1;
        }

        public static final /* synthetic */ void access$setReceiveResult$p(BufferedChannelIterator $this, Object r1) {
            $this.receiveResult = r1;
        }

        @Override // kotlinx.coroutines.channels.ChannelIterator
        @Deprecated(level = DeprecationLevel.HIDDEN, message = "Since 1.3.0, binary compatibility with versions <= 1.2.x")
        public /* synthetic */ Object next(Continuation $completion) {
            return ChannelIterator.DefaultImpls.next(this, $completion);
        }

        @Override // kotlinx.coroutines.channels.ChannelIterator
        public Object hasNext(Continuation<? super Boolean> r21) {
            BufferedChannel<E> r2 = this.this$0;
            BufferedChannel this_$iv = null;
            ChannelSegment<E> r1 = (ChannelSegment) BufferedChannel.access$getReceiveSegment$volatile$FU().get(r2);
        L4:
            if (r2.isClosedForReceive() == true) goto L36;
            long r$iv = BufferedChannel.access$getReceivers$volatile$FU().getAndIncrement(r2);
            long id$iv = r$iv / ((long) BufferedChannelKt.SEGMENT_SIZE);
            int i$iv = (int) (r$iv % ((long) BufferedChannelKt.SEGMENT_SIZE));
            if (r1.id == id$iv) goto L12;
            ChannelSegment<E> r6 = BufferedChannel.access$findSegmentReceive(r2, id$iv, r1);
            if (r6 == null) goto L4;
            r1 = r6;
        L12:
            ChannelSegment<E> r3 = r1;
            Object updCellResult$iv = BufferedChannel.access$updateCellReceive(r2, r3, i$iv, r$iv, this_$iv);
            BufferedChannel waiter$iv = this_$iv;
            BufferedChannel<E> r7 = r2;
            if (updCellResult$iv == BufferedChannelKt.access$getSUSPEND$p()) goto L27;
            if (updCellResult$iv != BufferedChannelKt.access$getFAILED$p()) goto L21;
            if (r$iv >= r7.getSendersCounter$kotlinx_coroutines_core()) goto L19;
            r3.cleanPrev();
        L19:
            r1 = r3;
            r2 = r7;
            this_$iv = waiter$iv;
            goto L4
        L21:
            if (updCellResult$iv == BufferedChannelKt.access$getSUSPEND_NO_WAITER$p()) goto L23;
            r3.cleanPrev();
            this.receiveResult = updCellResult$iv;
            return Boxing.boxBoolean(true);
        L23:
            return hasNextOnNoWaiterSuspend(r3, i$iv, r$iv, r21);
        L27:
            throw new IllegalStateException("unreachable".toString());
        L36:
            return Boxing.boxBoolean(onClosedHasNext());
        }

        private final boolean onClosedHasNext() {
            this.receiveResult = BufferedChannelKt.getCHANNEL_CLOSED();
            Throwable cause = this.this$0.getCloseCause();
            if (cause != null) goto L7;
            return false;
        L7:
            throw StackTraceRecoveryKt.recoverStackTrace(cause);
        }

        private final Object hasNextOnNoWaiterSuspend(ChannelSegment<E> r26, int index, long r, Continuation<? super Boolean> r30) {
            BufferedChannel<E> r0 = this.this$0;
            int $i$f$suspendCancellableCoroutineReusable = 0;
            Continuation<? super Boolean> r3 = r30;
            CancellableContinuationImpl cancellable$iv = CancellableContinuationKt.getOrCreateCancellableContinuation(IntrinsicsKt.intercepted(r3));
            access$setContinuation$p(this, cancellable$iv);     // Catch: Throwable -> L77
            Object updCellResult$iv = BufferedChannel.access$updateCellReceive(r0, r26, index, r, this);     // Catch: Throwable -> L77
            if (updCellResult$iv != BufferedChannelKt.access$getSUSPEND$p()) goto L81;
            BufferedChannel.access$prepareReceiverForSuspension(r0, this, r26, index);     // Catch: Throwable -> L9
        L70:
            Object r1 = cancellable$iv.getResult();
            if (r1 != IntrinsicsKt.getCOROUTINE_SUSPENDED()) goto L74;
            DebugProbesKt.probeCoroutineSuspended(r30);
        L74:
            return r1;
        L11:
            e$iv = th;
        L79:
            cancellable$iv.releaseClaimedReusableContinuation$kotlinx_coroutines_core();
            throw e$iv;
        L81:
            if (updCellResult$iv == BufferedChannelKt.access$getFAILED$p()) goto L19;
            r26.cleanPrev();     // Catch: Throwable -> L75
            access$setReceiveResult$p(this, updCellResult$iv);     // Catch: Throwable -> L75
            access$setContinuation$p(this, null);     // Catch: Throwable -> L75
            Boolean r10 = Boxing.boxBoolean(true);     // Catch: Throwable -> L75
            Function1<E, Unit> r2 = r0.onUndeliveredElement;     // Catch: Throwable -> L75
            if (r2 == null) goto L68;
            Function1<Throwable, Unit> r12 = OnUndeliveredElementKt.bindCancellationFun(r2, updCellResult$iv, cancellable$iv.getContext());     // Catch: Throwable -> L75
        L69:
            cancellable$iv.resume(r10, r12);     // Catch: Throwable -> L75
            goto L70
        L68:
            r12 = null;
            goto L69
        L19:
            if (r >= r0.getSendersCounter$kotlinx_coroutines_core()) goto L22;
            r26.cleanPrev();     // Catch: Throwable -> L9
        L22:
            ChannelSegment segment$iv$iv = (ChannelSegment) BufferedChannel.access$getReceiveSegment$volatile$FU().get(r0);     // Catch: Throwable -> L77
        L24:
            if (r0.isClosedForReceive() == true) goto L26;
            long r$iv$iv = BufferedChannel.access$getReceivers$volatile$FU().getAndIncrement(r0);     // Catch: Throwable -> L77
            long id$iv$iv = r$iv$iv / ((long) BufferedChannelKt.SEGMENT_SIZE);     // Catch: Throwable -> L77
            $i$f$suspendCancellableCoroutineReusable = $i$f$suspendCancellableCoroutineReusable;
            r3 = r3;
            int i$iv$iv = (int) (r$iv$iv % ((long) BufferedChannelKt.SEGMENT_SIZE));     // Catch: Throwable -> L75
            if (segment$iv$iv.id == id$iv$iv) goto L38;
            ChannelSegment r4 = BufferedChannel.access$findSegmentReceive(r0, id$iv$iv, segment$iv$iv);     // Catch: Throwable -> L75
            if (r4 == null) goto L24;
            segment$iv$iv = r4;
        L38:
            ChannelSegment segment$iv$iv2 = segment$iv$iv;
            Object updCellResult$iv$iv = BufferedChannel.access$updateCellReceive(r0, segment$iv$iv2, i$iv$iv, r$iv$iv, this);     // Catch: Throwable -> L75
            if (updCellResult$iv$iv == BufferedChannelKt.access$getSUSPEND$p()) goto L41;
            if (updCellResult$iv$iv != BufferedChannelKt.access$getFAILED$p()) goto L54;
            if (r$iv$iv >= r0.getSendersCounter$kotlinx_coroutines_core()) goto L52;
            segment$iv$iv2.cleanPrev();     // Catch: Throwable -> L75
        L52:
            segment$iv$iv = segment$iv$iv2;
            goto L24
        L54:
            if (updCellResult$iv$iv == BufferedChannelKt.access$getSUSPEND_NO_WAITER$p()) goto L62;
            segment$iv$iv2.cleanPrev();     // Catch: Throwable -> L75
            access$setReceiveResult$p(this, updCellResult$iv$iv);     // Catch: Throwable -> L75
            access$setContinuation$p(this, null);     // Catch: Throwable -> L75
            Boolean r5 = Boxing.boxBoolean(true);     // Catch: Throwable -> L75
            Function1<E, Unit> r6 = r0.onUndeliveredElement;     // Catch: Throwable -> L75
            if (r6 == null) goto L58;
            Function1<Throwable, Unit> r7 = OnUndeliveredElementKt.bindCancellationFun(r6, updCellResult$iv$iv, cancellable$iv.getContext());     // Catch: Throwable -> L75
        L59:
            cancellable$iv.resume(r5, r7);     // Catch: Throwable -> L75
            goto L70
        L58:
            r7 = null;
            goto L59
        L62:
            throw new IllegalStateException("unexpected".toString());     // Catch: Throwable -> L75
        L41:
            if ((this instanceof Waiter) == false) goto L43;
            BufferedChannelIterator r8 = this;     // Catch: Throwable -> L75
        L44:
            if (r8 == null) goto L70;
            BufferedChannel.access$prepareReceiverForSuspension(r0, r8, segment$iv$iv2, i$iv$iv);     // Catch: Throwable -> L75
            goto L70
        L43:
            r8 = null;
        L63:
            e$iv = th;
            goto L79
        L26:
            access$onClosedHasNextNoWaiterSuspend(this);     // Catch: Throwable -> L9
        L75:
            e$iv = th;
        L9:
            e$iv = th;
        L77:
            e$iv = th;
            goto L79
        }

        @Override // kotlinx.coroutines.Waiter
        public void invokeOnCancellation(Segment<?> r2, int index) {
            CancellableContinuationImpl<? super Boolean> r0 = this.continuation;
            if (r0 == null) goto L6;
            r0.invokeOnCancellation(r2, index);
            return;
        }

        private final void onClosedHasNextNoWaiterSuspend() {
            CancellableContinuationImpl<? super Boolean> r0 = this.continuation;
            Intrinsics.checkNotNull(r0);
            this.continuation = null;
            this.receiveResult = BufferedChannelKt.getCHANNEL_CLOSED();
            Throwable cause = this.this$0.getCloseCause();
            if (cause != null) goto L5;
            Result.Companion r3 = Result.Companion;
            r0.resumeWith(Result.m7425constructorimpl(false));
            return;
        L5:
            CancellableContinuationImpl<? super Boolean> r2 = r0;
            if (DebugKt.getRECOVER_STACK_TRACES() == true) goto L8;
        L11:
            Throwable r4 = cause;
        L12:
            Result.Companion r5 = Result.Companion;
            r2.resumeWith(Result.m7425constructorimpl(ResultKt.createFailure(r4)));
            return;
        L8:
            if ((r0 instanceof CoroutineStackFrame) == false) goto L11;
            r4 = StackTraceRecoveryKt.access$recoverFromStackFrame(cause, r0);
            goto L12
        }

        @Override // kotlinx.coroutines.channels.ChannelIterator
        public E next() {
            E r0 = (E) this.receiveResult;
            if (r0 == BufferedChannelKt.access$getNO_RECEIVE_RESULT$p()) goto L5;
            boolean r1 = true;
        L6:
            if (r1 == false) goto L13;
            this.receiveResult = BufferedChannelKt.access$getNO_RECEIVE_RESULT$p();
            if (r0 == BufferedChannelKt.getCHANNEL_CLOSED()) goto L11;
            return r0;
        L11:
            throw StackTraceRecoveryKt.recoverStackTrace(BufferedChannel.access$getReceiveException(this.this$0));
        L13:
            throw new IllegalStateException("`hasNext()` has not been invoked".toString());
        L5:
            r1 = false;
            goto L6
        }

        public final boolean tryResumeHasNext(E r6) {
            CancellableContinuationImpl<? super Boolean> r0 = this.continuation;
            Intrinsics.checkNotNull(r0);
            Function1<Throwable, Unit> r1 = null;
            this.continuation = null;
            this.receiveResult = r6;
            CancellableContinuationImpl<? super Boolean> r2 = r0;
            Function1<E, Unit> r4 = this.this$0.onUndeliveredElement;
            if (r4 == null) goto L6;
            r1 = OnUndeliveredElementKt.bindCancellationFun(r4, r6, r0.getContext());
        L6:
            return BufferedChannelKt.access$tryResume0(r2, true, r1);
        }

        public final void tryResumeHasNextOnClosedChannel() {
            CancellableContinuationImpl<? super Boolean> r0 = this.continuation;
            Intrinsics.checkNotNull(r0);
            this.continuation = null;
            this.receiveResult = BufferedChannelKt.getCHANNEL_CLOSED();
            Throwable cause = this.this$0.getCloseCause();
            if (cause != null) goto L5;
            Result.Companion r3 = Result.Companion;
            r0.resumeWith(Result.m7425constructorimpl(false));
            return;
        L5:
            CancellableContinuationImpl<? super Boolean> r2 = r0;
            if (DebugKt.getRECOVER_STACK_TRACES() == true) goto L8;
        L11:
            Throwable r4 = cause;
        L12:
            Result.Companion r5 = Result.Companion;
            r2.resumeWith(Result.m7425constructorimpl(ResultKt.createFailure(r4)));
            return;
        L8:
            if ((r0 instanceof CoroutineStackFrame) == false) goto L11;
            r4 = StackTraceRecoveryKt.access$recoverFromStackFrame(cause, r0);
            goto L12
        }
    }

    /* JADX INFO: compiled from: BufferedChannel.kt */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0002\u0018\u00002\u00020\u0001B\u0013\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\u0010\u0005J\u001d\u0010\b\u001a\u00020\t2\n\u0010\n\u001a\u0006\u0012\u0002\b\u00030\u000b2\u0006\u0010\f\u001a\u00020\rH\u0096\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000e"}, d2 = {"Lkotlinx/coroutines/channels/BufferedChannel$SendBroadcast;", "Lkotlinx/coroutines/Waiter;", "cont", "Lkotlinx/coroutines/CancellableContinuation;", "", "(Lkotlinx/coroutines/CancellableContinuation;)V", "getCont", "()Lkotlinx/coroutines/CancellableContinuation;", "invokeOnCancellation", "", "segment", "Lkotlinx/coroutines/internal/Segment;", "index", "", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
    private static final class SendBroadcast implements Waiter {
        private final /* synthetic */ CancellableContinuationImpl<Boolean> $$delegate_0;
        private final CancellableContinuation<Boolean> cont;

        @Override // kotlinx.coroutines.Waiter
        public void invokeOnCancellation(Segment<?> r2, int r3) {
            this.$$delegate_0.invokeOnCancellation(r2, r3);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public SendBroadcast(CancellableContinuation<? super Boolean> r2) {
            this.cont = r2;
            Intrinsics.checkNotNull(r2, "null cannot be cast to non-null type kotlinx.coroutines.CancellableContinuationImpl<kotlin.Boolean>");
            this.$$delegate_0 = (CancellableContinuationImpl) r2;
        }

        public final CancellableContinuation<Boolean> getCont() {
            return this.cont;
        }
    }

    static {
        sendersAndCloseStatus$volatile$FU = AtomicLongFieldUpdater.newUpdater(BufferedChannel.class, "sendersAndCloseStatus$volatile");
        receivers$volatile$FU = AtomicLongFieldUpdater.newUpdater(BufferedChannel.class, "receivers$volatile");
        bufferEnd$volatile$FU = AtomicLongFieldUpdater.newUpdater(BufferedChannel.class, "bufferEnd$volatile");
        completedExpandBuffersAndPauseFlag$volatile$FU = AtomicLongFieldUpdater.newUpdater(BufferedChannel.class, "completedExpandBuffersAndPauseFlag$volatile");
        sendSegment$volatile$FU = AtomicReferenceFieldUpdater.newUpdater(BufferedChannel.class, Object.class, "sendSegment$volatile");
        receiveSegment$volatile$FU = AtomicReferenceFieldUpdater.newUpdater(BufferedChannel.class, Object.class, "receiveSegment$volatile");
        bufferEndSegment$volatile$FU = AtomicReferenceFieldUpdater.newUpdater(BufferedChannel.class, Object.class, "bufferEndSegment$volatile");
        _closeCause$volatile$FU = AtomicReferenceFieldUpdater.newUpdater(BufferedChannel.class, Object.class, "_closeCause$volatile");
        closeHandler$volatile$FU = AtomicReferenceFieldUpdater.newUpdater(BufferedChannel.class, Object.class, "closeHandler$volatile");
    }

    private final /* synthetic */ Object getAndUpdate$atomicfu(Object r3, AtomicReferenceFieldUpdater r4, Function1<Object, ? extends Object> r5) {
    L2:
        Object r0 = r4.get(r3);
        if (AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(r4, r3, r0, r5.invoke(r0)) == false) goto L2;
        return r0;
    }

    private final /* synthetic */ long getBufferEnd$volatile() {
        return this.bufferEnd$volatile;
    }

    private static final /* synthetic */ AtomicLongFieldUpdater getBufferEnd$volatile$FU() {
        return bufferEnd$volatile$FU;
    }

    private final /* synthetic */ Object getBufferEndSegment$volatile() {
        return this.bufferEndSegment$volatile;
    }

    private static final /* synthetic */ AtomicReferenceFieldUpdater getBufferEndSegment$volatile$FU() {
        return bufferEndSegment$volatile$FU;
    }

    private final /* synthetic */ Object getCloseHandler$volatile() {
        return this.closeHandler$volatile;
    }

    private static final /* synthetic */ AtomicReferenceFieldUpdater getCloseHandler$volatile$FU() {
        return closeHandler$volatile$FU;
    }

    private final /* synthetic */ long getCompletedExpandBuffersAndPauseFlag$volatile() {
        return this.completedExpandBuffersAndPauseFlag$volatile;
    }

    private static final /* synthetic */ AtomicLongFieldUpdater getCompletedExpandBuffersAndPauseFlag$volatile$FU() {
        return completedExpandBuffersAndPauseFlag$volatile$FU;
    }

    public static /* synthetic */ void getOnReceive$annotations() {
    }

    public static /* synthetic */ void getOnReceiveCatching$annotations() {
    }

    public static /* synthetic */ void getOnReceiveOrNull$annotations() {
    }

    public static /* synthetic */ void getOnSend$annotations() {
    }

    private static /* synthetic */ void getOnUndeliveredElementReceiveCancellationConstructor$annotations() {
    }

    private final /* synthetic */ Object getReceiveSegment$volatile() {
        return this.receiveSegment$volatile;
    }

    private static final /* synthetic */ AtomicReferenceFieldUpdater getReceiveSegment$volatile$FU() {
        return receiveSegment$volatile$FU;
    }

    private final /* synthetic */ long getReceivers$volatile() {
        return this.receivers$volatile;
    }

    private static final /* synthetic */ AtomicLongFieldUpdater getReceivers$volatile$FU() {
        return receivers$volatile$FU;
    }

    private final /* synthetic */ Object getSendSegment$volatile() {
        return this.sendSegment$volatile;
    }

    private static final /* synthetic */ AtomicReferenceFieldUpdater getSendSegment$volatile$FU() {
        return sendSegment$volatile$FU;
    }

    private final /* synthetic */ long getSendersAndCloseStatus$volatile() {
        return this.sendersAndCloseStatus$volatile;
    }

    private static final /* synthetic */ AtomicLongFieldUpdater getSendersAndCloseStatus$volatile$FU() {
        return sendersAndCloseStatus$volatile$FU;
    }

    private final /* synthetic */ Object get_closeCause$volatile() {
        return this._closeCause$volatile;
    }

    private static final /* synthetic */ AtomicReferenceFieldUpdater get_closeCause$volatile$FU() {
        return _closeCause$volatile$FU;
    }

    public static /* synthetic */ void isClosedForReceive$annotations() {
    }

    public static /* synthetic */ void isClosedForSend$annotations() {
    }

    public static /* synthetic */ void isEmpty$annotations() {
    }

    private final /* synthetic */ void loop$atomicfu(Object r3, AtomicLongFieldUpdater r4, Function1<? super Long, Unit> r5) {
    L2:
        r5.invoke(Long.valueOf(r4.get(r3)));
        goto L2
    }

    private final /* synthetic */ void loop$atomicfu(Object r2, AtomicReferenceFieldUpdater r3, Function1<Object, Unit> r4) {
    L2:
        r4.invoke(r3.get(r2));
        goto L2
    }

    private final /* synthetic */ void setBufferEnd$volatile(long r1) {
        this.bufferEnd$volatile = r1;
    }

    private final /* synthetic */ void setBufferEndSegment$volatile(Object r1) {
        this.bufferEndSegment$volatile = r1;
    }

    private final /* synthetic */ void setCloseHandler$volatile(Object r1) {
        this.closeHandler$volatile = r1;
    }

    private final /* synthetic */ void setCompletedExpandBuffersAndPauseFlag$volatile(long r1) {
        this.completedExpandBuffersAndPauseFlag$volatile = r1;
    }

    private final /* synthetic */ void setReceiveSegment$volatile(Object r1) {
        this.receiveSegment$volatile = r1;
    }

    private final /* synthetic */ void setReceivers$volatile(long r1) {
        this.receivers$volatile = r1;
    }

    private final /* synthetic */ void setSendSegment$volatile(Object r1) {
        this.sendSegment$volatile = r1;
    }

    private final /* synthetic */ void setSendersAndCloseStatus$volatile(long r1) {
        this.sendersAndCloseStatus$volatile = r1;
    }

    private final /* synthetic */ void set_closeCause$volatile(Object r1) {
        this._closeCause$volatile = r1;
    }

    private final /* synthetic */ void update$atomicfu(Object r7, AtomicLongFieldUpdater r8, Function1<? super Long, Long> r9) {
    L2:
        long r2 = r8.get(r7);
        long r4 = r9.invoke(Long.valueOf(r2)).longValue();
        Object r1 = r7;
        AtomicLongFieldUpdater r0 = r8;
        if (r0.compareAndSet(r1, r2, r4) == true) goto L4;
        r8 = r0;
        r7 = r1;
        goto L2
    }

    @Override // kotlinx.coroutines.channels.ReceiveChannel
    public Object receive(Continuation<? super E> r2) {
        return receive$suspendImpl(this, r2);
    }

    @Override // kotlinx.coroutines.channels.ReceiveChannel
    /* JADX INFO: renamed from: receiveCatching-JP2dKIU, reason: not valid java name */
    public Object mo8919receiveCatchingJP2dKIU(Continuation<? super ChannelResult<? extends E>> r2) {
        return m8917receiveCatchingJP2dKIU$suspendImpl(this, r2);
    }

    @Override // kotlinx.coroutines.channels.SendChannel
    public Object send(E r2, Continuation<? super Unit> r3) {
        return send$suspendImpl(this, r2, r3);
    }

    public Object sendBroadcast$kotlinx_coroutines_core(E r2, Continuation<? super Boolean> r3) {
        return sendBroadcast$suspendImpl(this, r2, r3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public BufferedChannel(int capacity, Function1<? super E, Unit> r10) {
        this.capacity = capacity;
        this.onUndeliveredElement = r10;
        if (this.capacity < 0) goto L5;
        boolean r0 = true;
    L6:
        if (r0 == false) goto L18;
        this.bufferEnd$volatile = BufferedChannelKt.access$initialBufferEnd(this.capacity);
        this.completedExpandBuffersAndPauseFlag$volatile = getBufferEndCounter();
        ChannelSegment firstSegment = new ChannelSegment(0, null, this, 3);
        this.sendSegment$volatile = firstSegment;
        this.receiveSegment$volatile = firstSegment;
        if (isRendezvousOrUnlimited() == false) goto L10;
        ChannelSegment r1 = BufferedChannelKt.access$getNULL_SEGMENT$p();
        Intrinsics.checkNotNull(r1, "null cannot be cast to non-null type kotlinx.coroutines.channels.ChannelSegment<E of kotlinx.coroutines.channels.BufferedChannel>");
    L11:
        this.bufferEndSegment$volatile = r1;
        if (this.onUndeliveredElement == null) goto L14;
        Function3<SelectInstance<?>, Object, Object, Function1<Throwable, Unit>> r2 = (Function3) new BufferedChannel$onUndeliveredElementReceiveCancellationConstructor$1$1(this);
    L15:
        this.onUndeliveredElementReceiveCancellationConstructor = r2;
        this._closeCause$volatile = BufferedChannelKt.access$getNO_CLOSE_CAUSE$p();
        return;
    L14:
        r2 = null;
        goto L15
    L10:
        r1 = firstSegment;
        goto L11
    L18:
        throw new IllegalArgumentException(("Invalid channel capacity: " + this.capacity + ", should be >=0").toString());
    L5:
        r0 = false;
        goto L6
    }

    public /* synthetic */ BufferedChannel(int r1, Function1 r2, int r3, DefaultConstructorMarker r4) {
        if ((r3 & 2) == 0) goto L5;
        r2 = null;
    L5:
        this(r1, r2);
    }

    public static final /* synthetic */ ChannelSegment access$findSegmentReceive(BufferedChannel $this, long id, ChannelSegment startFrom) {
        return $this.findSegmentReceive(id, startFrom);
    }

    public static final /* synthetic */ ChannelSegment access$findSegmentSend(BufferedChannel $this, long id, ChannelSegment startFrom) {
        return $this.findSegmentSend(id, startFrom);
    }

    public static final /* synthetic */ Throwable access$getReceiveException(BufferedChannel $this) {
        return $this.getReceiveException();
    }

    public static final /* synthetic */ AtomicReferenceFieldUpdater access$getReceiveSegment$volatile$FU() {
        return getReceiveSegment$volatile$FU();
    }

    public static final /* synthetic */ AtomicLongFieldUpdater access$getReceivers$volatile$FU() {
        return getReceivers$volatile$FU();
    }

    public static final /* synthetic */ AtomicReferenceFieldUpdater access$getSendSegment$volatile$FU() {
        return getSendSegment$volatile$FU();
    }

    public static final /* synthetic */ AtomicLongFieldUpdater access$getSendersAndCloseStatus$volatile$FU() {
        return getSendersAndCloseStatus$volatile$FU();
    }

    public static final /* synthetic */ boolean access$isClosedForSend0(BufferedChannel $this, long $receiver) {
        return $this.isClosedForSend0($receiver);
    }

    public static final /* synthetic */ void access$onClosedReceiveCatchingOnNoWaiterSuspend(BufferedChannel $this, CancellableContinuation cont) {
        $this.onClosedReceiveCatchingOnNoWaiterSuspend(cont);
    }

    public static final /* synthetic */ void access$onClosedReceiveOnNoWaiterSuspend(BufferedChannel $this, CancellableContinuation cont) {
        $this.onClosedReceiveOnNoWaiterSuspend(cont);
    }

    public static final /* synthetic */ Object access$onClosedSend(BufferedChannel $this, Object element, Continuation $completion) {
        return $this.onClosedSend(element, $completion);
    }

    public static final /* synthetic */ void access$onClosedSendOnNoWaiterSuspend(BufferedChannel $this, Object element, CancellableContinuation cont) {
        $this.onClosedSendOnNoWaiterSuspend(element, cont);
    }

    public static final /* synthetic */ void access$prepareReceiverForSuspension(BufferedChannel $this, Waiter $receiver, ChannelSegment segment, int index) {
        $this.prepareReceiverForSuspension($receiver, segment, index);
    }

    public static final /* synthetic */ void access$prepareSenderForSuspension(BufferedChannel $this, Waiter $receiver, ChannelSegment segment, int index) {
        $this.prepareSenderForSuspension($receiver, segment, index);
    }

    public static final /* synthetic */ Object access$processResultSelectReceive(BufferedChannel $this, Object ignoredParam, Object selectResult) {
        return $this.processResultSelectReceive(ignoredParam, selectResult);
    }

    public static final /* synthetic */ Object access$processResultSelectReceiveCatching(BufferedChannel $this, Object ignoredParam, Object selectResult) {
        return $this.processResultSelectReceiveCatching(ignoredParam, selectResult);
    }

    public static final /* synthetic */ Object access$processResultSelectReceiveOrNull(BufferedChannel $this, Object ignoredParam, Object selectResult) {
        return $this.processResultSelectReceiveOrNull(ignoredParam, selectResult);
    }

    public static final /* synthetic */ Object access$processResultSelectSend(BufferedChannel $this, Object ignoredParam, Object selectResult) {
        return $this.processResultSelectSend(ignoredParam, selectResult);
    }

    /* JADX INFO: renamed from: access$receiveCatchingOnNoWaiterSuspend-GKJJFZk, reason: not valid java name */
    public static final /* synthetic */ Object m8916access$receiveCatchingOnNoWaiterSuspendGKJJFZk(BufferedChannel $this, ChannelSegment segment, int index, long r, Continuation $completion) {
        return $this.m8918receiveCatchingOnNoWaiterSuspendGKJJFZk(segment, index, r, $completion);
    }

    public static final /* synthetic */ Object access$receiveOnNoWaiterSuspend(BufferedChannel $this, ChannelSegment segment, int index, long r, Continuation $completion) {
        return $this.receiveOnNoWaiterSuspend(segment, index, r, $completion);
    }

    public static final /* synthetic */ void access$registerSelectForReceive(BufferedChannel $this, SelectInstance select, Object ignoredParam) {
        $this.registerSelectForReceive(select, ignoredParam);
    }

    public static final /* synthetic */ Object access$sendOnNoWaiterSuspend(BufferedChannel $this, ChannelSegment segment, int index, Object element, long s, Continuation $completion) {
        return $this.sendOnNoWaiterSuspend(segment, index, element, s, $completion);
    }

    public static final /* synthetic */ Object access$updateCellReceive(BufferedChannel $this, ChannelSegment segment, int index, long r, Object waiter) {
        return $this.updateCellReceive(segment, index, r, waiter);
    }

    public static final /* synthetic */ int access$updateCellSend(BufferedChannel $this, ChannelSegment segment, int index, Object element, long s, Object waiter, boolean closed) {
        return $this.updateCellSend(segment, index, element, s, waiter, closed);
    }

    @Override // kotlinx.coroutines.channels.SendChannel
    @Deprecated(level = DeprecationLevel.ERROR, message = "Deprecated in the favour of 'trySend' method", replaceWith = @ReplaceWith(expression = "trySend(element).isSuccess", imports = {}))
    public boolean offer(E r2) {
        return Channel.DefaultImpls.offer(this, r2);
    }

    @Override // kotlinx.coroutines.channels.ReceiveChannel
    @Deprecated(level = DeprecationLevel.ERROR, message = "Deprecated in the favour of 'tryReceive'. Please note that the provided replacement does not rethrow channel's close cause as 'poll' did, for the precise replacement please refer to the 'poll' documentation", replaceWith = @ReplaceWith(expression = "tryReceive().getOrNull()", imports = {}))
    public E poll() {
        return (E) Channel.DefaultImpls.poll(this);
    }

    @Override // kotlinx.coroutines.channels.ReceiveChannel
    @Deprecated(level = DeprecationLevel.ERROR, message = "Deprecated in favor of 'receiveCatching'. Please note that the provided replacement does not rethrow channel's close cause as 'receiveOrNull' did, for the detailed replacement please refer to the 'receiveOrNull' documentation", replaceWith = @ReplaceWith(expression = "receiveCatching().getOrNull()", imports = {}))
    public Object receiveOrNull(Continuation<? super E> r2) {
        return Channel.DefaultImpls.receiveOrNull(this, r2);
    }

    public final long getSendersCounter$kotlinx_coroutines_core() {
        long $this$sendersCounter$iv = getSendersAndCloseStatus$volatile$FU().get(this);
        return $this$sendersCounter$iv & 1152921504606846975L;
    }

    public final long getReceiversCounter$kotlinx_coroutines_core() {
        return getReceivers$volatile$FU().get(this);
    }

    private final long getBufferEndCounter() {
        return getBufferEnd$volatile$FU().get(this);
    }

    private final boolean isRendezvousOrUnlimited() {
        long it = getBufferEndCounter();
        if (it != 0) goto L5;
    L8:
        return true;
    L5:
        if (it == Long.MAX_VALUE) goto L8;
        return false;
    }

    static /* synthetic */ <E> Object send$suspendImpl(BufferedChannel<E> r21, E r22, Continuation<? super Unit> r23) {
        int $i$f$sendImpl = 0;
        ChannelSegment<E> r2 = (ChannelSegment) access$getSendSegment$volatile$FU().get(r21);
    L3:
        long sendersAndCloseStatusCur$iv = access$getSendersAndCloseStatus$volatile$FU().getAndIncrement(r21);
        long s$iv = sendersAndCloseStatusCur$iv & 1152921504606846975L;
        boolean closed$iv = access$isClosedForSend0(r21, sendersAndCloseStatusCur$iv);
        long id$iv = s$iv / ((long) BufferedChannelKt.SEGMENT_SIZE);
        int i$iv = (int) (s$iv % ((long) BufferedChannelKt.SEGMENT_SIZE));
        if (r2.id == id$iv) goto L15;
        ChannelSegment<E> r4 = access$findSegmentSend(r21, id$iv, r2);
        if (r4 == null) goto L7;
        r2 = r4;
        goto L15
    L7:
        if (closed$iv == false) goto L3;
        Object r13 = r21.onClosedSend(r22, r23);
        if (r13 != IntrinsicsKt.getCOROUTINE_SUSPENDED()) goto L43;
        return r13;
    L43:
        return Unit.INSTANCE;
    L15:
        switch(access$updateCellSend(r21, r2, i$iv, r22, s$iv, null, closed$iv)) {
            case 0: goto L41;
            case 1: goto L43;
            case 2: goto L30;
            case 3: goto L25;
            case 4: goto L19;
            case 5: goto L17;
            default: goto L44;
        };
    L17:
        r2.cleanPrev();
    L44:
        $i$f$sendImpl = $i$f$sendImpl;
        goto L3
    L19:
        if (s$iv >= r21.getReceiversCounter$kotlinx_coroutines_core()) goto L21;
        r2.cleanPrev();
    L21:
        Object r14 = r21.onClosedSend(r22, r23);
        if (r14 != IntrinsicsKt.getCOROUTINE_SUSPENDED()) goto L43;
        return r14;
    L25:
        Object r0 = r21.sendOnNoWaiterSuspend(r2, i$iv, r22, s$iv, r23);
        if (r0 != IntrinsicsKt.getCOROUTINE_SUSPENDED()) goto L43;
        return r0;
    L30:
        if (closed$iv == false) goto L36;
        r2.onSlotCleaned();
        Object r5 = r21.onClosedSend(r22, r23);
        if (r5 != IntrinsicsKt.getCOROUTINE_SUSPENDED()) goto L43;
        return r5;
    L36:
        if (DebugKt.getASSERTIONS_ENABLED() == false) goto L43;
        throw new AssertionError();
    L41:
        r2.cleanPrev();
        goto L43
    }

    private final Object onClosedSend(E r14, Continuation<? super Unit> r15) {
        CancellableContinuationImpl cancellable$iv = new CancellableContinuationImpl(IntrinsicsKt.intercepted(r15), 1);
        cancellable$iv.initCancellability();
        CancellableContinuationImpl continuation = cancellable$iv;
        Function1<E, Unit> r6 = this.onUndeliveredElement;
        if (r6 == null) goto L14;
        UndeliveredElementException it = OnUndeliveredElementKt.callUndeliveredElementCatchingException$default(r6, r14, null, 2, null);
        if (it == null) goto L14;
        ExceptionsKt.addSuppressed(it, getSendException());
        CancellableContinuationImpl $this$resumeWithStackTrace$iv = continuation;
        Result.Companion r10 = Result.Companion;
        if (DebugKt.getRECOVER_STACK_TRACES() == true) goto L9;
    L12:
        UndeliveredElementException r11 = it;
    L13:
        $this$resumeWithStackTrace$iv.resumeWith(Result.m7425constructorimpl(ResultKt.createFailure(r11)));
    L22:
        Object r1 = cancellable$iv.getResult();
        if (r1 != IntrinsicsKt.getCOROUTINE_SUSPENDED()) goto L26;
        DebugProbesKt.probeCoroutineSuspended(r15);
    L26:
        if (r1 != IntrinsicsKt.getCOROUTINE_SUSPENDED()) goto L29;
        return r1;
    L29:
        return Unit.INSTANCE;
    L9:
        if (($this$resumeWithStackTrace$iv instanceof CoroutineStackFrame) == false) goto L12;
        r11 = StackTraceRecoveryKt.access$recoverFromStackFrame(it, $this$resumeWithStackTrace$iv);
    L14:
        CancellableContinuationImpl $this$resumeWithStackTrace$iv2 = continuation;
        Throwable exception$iv = getSendException();
        Result.Companion r9 = Result.Companion;
        if (DebugKt.getRECOVER_STACK_TRACES() == true) goto L17;
    L20:
        Throwable r12 = exception$iv;
    L21:
        $this$resumeWithStackTrace$iv2.resumeWith(Result.m7425constructorimpl(ResultKt.createFailure(r12)));
        goto L22
    L17:
        if (($this$resumeWithStackTrace$iv2 instanceof CoroutineStackFrame) == false) goto L20;
        r12 = StackTraceRecoveryKt.access$recoverFromStackFrame(exception$iv, $this$resumeWithStackTrace$iv2);
        goto L21
    }

    private final Object sendOnNoWaiterSuspend(ChannelSegment<E> r28, int index, E r30, long s, Continuation<? super Unit> r33) {
        CancellableContinuationImpl cancellable$iv = CancellableContinuationKt.getOrCreateCancellableContinuation(IntrinsicsKt.intercepted(r33));
        CancellableContinuationImpl cont = cancellable$iv;
    L63:
        e$iv = th;
    L67:
        cancellable$iv.releaseClaimedReusableContinuation$kotlinx_coroutines_core();
        throw e$iv;
    L72:
        switch(access$updateCellSend(this, r28, index, r30, s, cont, false)) {
            case 0: goto L52;
            case 1: goto L51;
            case 2: goto L48;
            case 3: goto L62;
            case 4: goto L43;
            case 5: goto L11;
            default: goto L62;
        };
    L11:
        r28.cleanPrev();     // Catch: Throwable -> L49
        ChannelSegment segment$iv$iv = (ChannelSegment) access$getSendSegment$volatile$FU().get(this);     // Catch: Throwable -> L49
    L12:
        long sendersAndCloseStatusCur$iv$iv = access$getSendersAndCloseStatus$volatile$FU().getAndIncrement(this);     // Catch: Throwable -> L49
        long s$iv$iv = sendersAndCloseStatusCur$iv$iv & 1152921504606846975L;     // Catch: Throwable -> L49
        boolean closed$iv$iv = access$isClosedForSend0(this, sendersAndCloseStatusCur$iv$iv);     // Catch: Throwable -> L49
        cont = cont;
        long id$iv$iv = s$iv$iv / ((long) BufferedChannelKt.SEGMENT_SIZE);     // Catch: Throwable -> L49
        int i$iv$iv = (int) (s$iv$iv % ((long) BufferedChannelKt.SEGMENT_SIZE));     // Catch: Throwable -> L49
        if (segment$iv$iv.id == id$iv$iv) goto L21;
        ChannelSegment r8 = access$findSegmentSend(this, id$iv$iv, segment$iv$iv);     // Catch: Throwable -> L49
        if (r8 == null) goto L16;
        segment$iv$iv = r8;
        goto L21
    L16:
        if (closed$iv$iv == false) goto L12;
        access$onClosedSendOnNoWaiterSuspend(this, r30, cont);     // Catch: Throwable -> L49
    L53:
        Object r0 = cancellable$iv.getResult();
        if (r0 != IntrinsicsKt.getCOROUTINE_SUSPENDED()) goto L57;
        DebugProbesKt.probeCoroutineSuspended(r33);
    L57:
        if (r0 != IntrinsicsKt.getCOROUTINE_SUSPENDED()) goto L60;
        return r0;
    L60:
        return Unit.INSTANCE;
    L21:
        switch(access$updateCellSend(this, segment$iv$iv, i$iv$iv, r30, s$iv$iv, cont, closed$iv$iv)) {
            case 0: goto L40;
            case 1: goto L39;
            case 2: goto L30;
            case 3: goto L29;
            case 4: goto L25;
            case 5: goto L23;
            default: goto L12;
        };     // Catch: Throwable -> L49
    L23:
        segment$iv$iv.cleanPrev();     // Catch: Throwable -> L49
        goto L12
    L25:
        if (s$iv$iv >= getReceiversCounter$kotlinx_coroutines_core()) goto L27;
        segment$iv$iv.cleanPrev();     // Catch: Throwable -> L49
    L27:
        access$onClosedSendOnNoWaiterSuspend(this, r30, cont);     // Catch: Throwable -> L49
        goto L53
    L29:
        throw new IllegalStateException("unexpected".toString());     // Catch: Throwable -> L49
    L30:
        if (closed$iv$iv == false) goto L33;
        segment$iv$iv.onSlotCleaned();     // Catch: Throwable -> L49
        access$onClosedSendOnNoWaiterSuspend(this, r30, cont);     // Catch: Throwable -> L49
        goto L53
    L33:
        if ((cont instanceof Waiter) == false) goto L35;
        CancellableContinuationImpl r1 = cont;     // Catch: Throwable -> L49
    L36:
        if (r1 == null) goto L53;
        access$prepareSenderForSuspension(this, r1, segment$iv$iv, i$iv$iv);     // Catch: Throwable -> L49
        goto L53
    L35:
        r1 = null;
        goto L36
    L39:
        Result.Companion r16 = Result.Companion;     // Catch: Throwable -> L49
        cont.resumeWith(Result.m7425constructorimpl(Unit.INSTANCE));     // Catch: Throwable -> L49
        goto L53
    L40:
        segment$iv$iv.cleanPrev();     // Catch: Throwable -> L49
        Result.Companion r17 = Result.Companion;     // Catch: Throwable -> L49
        cont.resumeWith(Result.m7425constructorimpl(Unit.INSTANCE));     // Catch: Throwable -> L49
        goto L53
    L51:
        Result.Companion r7 = Result.Companion;     // Catch: Throwable -> L63
        cont.resumeWith(Result.m7425constructorimpl(Unit.INSTANCE));     // Catch: Throwable -> L63
        goto L53
    L52:
        r28.cleanPrev();     // Catch: Throwable -> L63
        Result.Companion r9 = Result.Companion;     // Catch: Throwable -> L63
        cont.resumeWith(Result.m7425constructorimpl(Unit.INSTANCE));     // Catch: Throwable -> L63
        goto L53
    L62:
        throw new IllegalStateException("unexpected".toString());     // Catch: Throwable -> L63
    L43:
        if (s >= getReceiversCounter$kotlinx_coroutines_core()) goto L45;
        r28.cleanPrev();     // Catch: Throwable -> L49
    L45:
        access$onClosedSendOnNoWaiterSuspend(this, r30, cont);     // Catch: Throwable -> L49
        goto L53
    L48:
        access$prepareSenderForSuspension(this, cont, r28, index);     // Catch: Throwable -> L63
    L49:
        e$iv = th;
    L65:
        e$iv = th;
        goto L67
    }

    private final void prepareSenderForSuspension(Waiter $this$prepareSenderForSuspension, ChannelSegment<E> r4, int index) {
        $this$prepareSenderForSuspension.invokeOnCancellation(r4, BufferedChannelKt.SEGMENT_SIZE + index);
    }

    private final void onClosedSendOnNoWaiterSuspend(E r5, CancellableContinuation<? super Unit> r6) {
        Function1<E, Unit> r0 = this.onUndeliveredElement;
        if (r0 == null) goto L5;
        OnUndeliveredElementKt.callUndeliveredElement(r0, r5, r6.getContext());
    L5:
        CancellableContinuation<? super Unit> r1 = r6;
        Throwable exception$iv = getSendException();
        if (DebugKt.getRECOVER_STACK_TRACES() == true) goto L8;
    L11:
        Result.Companion r2 = Result.Companion;
        r1.resumeWith(Result.m7425constructorimpl(ResultKt.createFailure(exception$iv)));
        return;
    L8:
        if ((r6 instanceof CoroutineStackFrame) == false) goto L11;
        exception$iv = StackTraceRecoveryKt.access$recoverFromStackFrame(exception$iv, (CoroutineStackFrame) r6);
        goto L11
    }

    @Override // kotlinx.coroutines.channels.SendChannel
    /* JADX INFO: renamed from: trySend-JP2dKIU */
    public Object mo8915trySendJP2dKIU(E r16) {
        if (shouldSendSuspend(getSendersAndCloseStatus$volatile$FU().get(this)) == true) goto L5;
        Object waiter$iv = BufferedChannelKt.access$getINTERRUPTED_SEND$p();
        ChannelSegment segment$iv = (ChannelSegment) access$getSendSegment$volatile$FU().get(this);
    L7:
        long sendersAndCloseStatusCur$iv = access$getSendersAndCloseStatus$volatile$FU().getAndIncrement(this);
        long s$iv = 1152921504606846975L & sendersAndCloseStatusCur$iv;
        boolean closed$iv = access$isClosedForSend0(this, sendersAndCloseStatusCur$iv);
        long id$iv = s$iv / ((long) BufferedChannelKt.SEGMENT_SIZE);
        int i$iv = (int) (s$iv % ((long) BufferedChannelKt.SEGMENT_SIZE));
        if (segment$iv.id == id$iv) goto L15;
        ChannelSegment segment$iv2 = access$findSegmentSend(this, id$iv, segment$iv);
        if (segment$iv2 == null) goto L11;
    L17:
        switch(access$updateCellSend(this, segment$iv2, i$iv, r16, s$iv, waiter$iv, closed$iv)) {
            case 0: goto L36;
            case 1: goto L55;
            case 2: goto L26;
            case 3: goto L25;
            case 4: goto L21;
            case 5: goto L19;
            default: goto L38;
        };
    L19:
        segment$iv2.cleanPrev();
    L38:
        segment$iv = segment$iv2;
        goto L7
    L21:
        if (s$iv >= getReceiversCounter$kotlinx_coroutines_core()) goto L52;
        segment$iv2.cleanPrev();
    L52:
        return ChannelResult.Companion.m8939closedJP2dKIU(getSendException());
    L25:
        throw new IllegalStateException("unexpected".toString());
    L26:
        if (closed$iv == false) goto L29;
        segment$iv2.onSlotCleaned();
        return ChannelResult.Companion.m8939closedJP2dKIU(getSendException());
    L29:
        if ((waiter$iv instanceof Waiter) == false) goto L31;
        Waiter r4 = (Waiter) waiter$iv;
    L32:
        if (r4 == null) goto L34;
        access$prepareSenderForSuspension(this, r4, segment$iv2, i$iv);
    L34:
        ChannelSegment segm = segment$iv2;
        segm.onSlotCleaned();
        return ChannelResult.Companion.m8940failurePtdJZtk();
    L31:
        r4 = null;
        goto L32
    L55:
        return ChannelResult.Companion.m8941successJP2dKIU(Unit.INSTANCE);
    L36:
        segment$iv2.cleanPrev();
        return ChannelResult.Companion.m8941successJP2dKIU(Unit.INSTANCE);
    L11:
        if (closed$iv == false) goto L7;
        return ChannelResult.Companion.m8939closedJP2dKIU(getSendException());
    L15:
        segment$iv2 = segment$iv;
        goto L17
    L5:
        return ChannelResult.Companion.m8940failurePtdJZtk();
    }

    static /* synthetic */ <E> Object sendBroadcast$suspendImpl(BufferedChannel<E> r24, E r25, Continuation<? super Boolean> r26) {
        boolean r11 = true;
        CancellableContinuationImpl cancellable$iv = new CancellableContinuationImpl(IntrinsicsKt.intercepted(r26), 1);
        cancellable$iv.initCancellability();
        CancellableContinuationImpl cont = cancellable$iv;
        if (r24.onUndeliveredElement != null) goto L5;
        boolean r1 = true;
    L6:
        if (r1 == false) goto L44;
        Object waiter$iv = new SendBroadcast(cont);
        ChannelSegment segment$iv = (ChannelSegment) access$getSendSegment$volatile$FU().get(r24);
    L8:
        long sendersAndCloseStatusCur$iv = access$getSendersAndCloseStatus$volatile$FU().getAndIncrement(r24);
        long s$iv = sendersAndCloseStatusCur$iv & 1152921504606846975L;
        boolean closed$iv = access$isClosedForSend0(r24, sendersAndCloseStatusCur$iv);
        r11 = r11;
        long id$iv = s$iv / ((long) BufferedChannelKt.SEGMENT_SIZE);
        int i$iv = (int) (s$iv % ((long) BufferedChannelKt.SEGMENT_SIZE));
        if (segment$iv.id == id$iv) goto L17;
        ChannelSegment r4 = access$findSegmentSend(r24, id$iv, segment$iv);
        if (r4 == null) goto L12;
        segment$iv = r4;
        goto L17
    L12:
        if (closed$iv == false) goto L8;
        Result.Companion r17 = Result.Companion;
        cont.resumeWith(Result.m7425constructorimpl(Boxing.boxBoolean(false)));
    L37:
        Object r2 = cancellable$iv.getResult();
        if (r2 != IntrinsicsKt.getCOROUTINE_SUSPENDED()) goto L41;
        DebugProbesKt.probeCoroutineSuspended(r26);
    L41:
        return r2;
    L17:
        switch(access$updateCellSend(r24, segment$iv, i$iv, r25, s$iv, waiter$iv, closed$iv)) {
            case 0: goto L36;
            case 1: goto L35;
            case 2: goto L26;
            case 3: goto L25;
            case 4: goto L21;
            case 5: goto L19;
            default: goto L8;
        };
    L19:
        segment$iv.cleanPrev();
        goto L8
    L21:
        if (s$iv >= r24.getReceiversCounter$kotlinx_coroutines_core()) goto L23;
        segment$iv.cleanPrev();
    L23:
        Result.Companion r18 = Result.Companion;
        cont.resumeWith(Result.m7425constructorimpl(Boxing.boxBoolean(false)));
        goto L37
    L25:
        throw new IllegalStateException("unexpected".toString());
    L26:
        if (closed$iv == false) goto L29;
        segment$iv.onSlotCleaned();
        Result.Companion r19 = Result.Companion;
        cont.resumeWith(Result.m7425constructorimpl(Boxing.boxBoolean(false)));
        goto L37
    L29:
        if ((waiter$iv instanceof Waiter) == false) goto L31;
        SendBroadcast r3 = (Waiter) waiter$iv;
    L32:
        if (r3 == null) goto L37;
        access$prepareSenderForSuspension(r24, r3, segment$iv, i$iv);
        goto L37
    L31:
        r3 = null;
        goto L32
    L35:
        Result.Companion r15 = Result.Companion;
        cont.resumeWith(Result.m7425constructorimpl(Boxing.boxBoolean(r11)));
        goto L37
    L36:
        segment$iv.cleanPrev();
        Result.Companion r16 = Result.Companion;
        cont.resumeWith(Result.m7425constructorimpl(Boxing.boxBoolean(r11)));
        goto L37
    L44:
        throw new IllegalStateException("the `onUndeliveredElement` feature is unsupported for `sendBroadcast(e)`".toString());
    L5:
        r1 = false;
        goto L6
    }

    static /* synthetic */ Object sendImpl$default(BufferedChannel $this, Object element, Object waiter, Function0 onRendezvousOrBuffered, Function2 onSuspend, Function0 onClosed, Function4 onNoWaiterSuspend, int r23, Object r24) {
        if (r24 != null) goto L46;
        if ((r23 & 32) == 0) goto L7;
        Function4 onNoWaiterSuspend2 = C07161.INSTANCE;
    L8:
        ChannelSegment segment = (ChannelSegment) access$getSendSegment$volatile$FU().get($this);
    L9:
        long sendersAndCloseStatusCur = access$getSendersAndCloseStatus$volatile$FU().getAndIncrement($this);
        long s = sendersAndCloseStatusCur & 1152921504606846975L;
        boolean closed = access$isClosedForSend0($this, sendersAndCloseStatusCur);
        long id = s / ((long) BufferedChannelKt.SEGMENT_SIZE);
        int i = (int) (s % ((long) BufferedChannelKt.SEGMENT_SIZE));
        if (segment.id == id) goto L19;
        ChannelSegment r3 = access$findSegmentSend($this, id, segment);
        if (r3 == null) goto L13;
        segment = r3;
        goto L19
    L13:
        if (closed == false) goto L9;
        return onClosed.invoke();
    L19:
        switch(access$updateCellSend($this, segment, i, element, s, waiter, closed)) {
            case 0: goto L43;
            case 1: goto L42;
            case 2: goto L30;
            case 3: goto L28;
            case 4: goto L23;
            case 5: goto L21;
            default: goto L9;
        };
    L21:
        segment.cleanPrev();
        goto L9
    L23:
        if (s >= $this.getReceiversCounter$kotlinx_coroutines_core()) goto L26;
        segment.cleanPrev();
    L26:
        return onClosed.invoke();
    L28:
        return onNoWaiterSuspend2.invoke(segment, Integer.valueOf(i), element, Long.valueOf(s));
    L30:
        if (closed == false) goto L34;
        segment.onSlotCleaned();
        return onClosed.invoke();
    L34:
        if ((waiter instanceof Waiter) == false) goto L36;
        Waiter r4 = (Waiter) waiter;
    L37:
        if (r4 == null) goto L40;
        access$prepareSenderForSuspension($this, r4, segment, i);
    L40:
        return onSuspend.invoke(segment, Integer.valueOf(i));
    L36:
        r4 = null;
        goto L37
    L42:
        return onRendezvousOrBuffered.invoke();
    L43:
        segment.cleanPrev();
        return onRendezvousOrBuffered.invoke();
    L7:
        onNoWaiterSuspend2 = onNoWaiterSuspend;
        goto L8
    L46:
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: sendImpl");
    }

    private final <R> R sendImpl(E r17, Object waiter, Function0<? extends R> r19, Function2<? super ChannelSegment<E>, ? super Integer, ? extends R> r20, Function0<? extends R> r21, Function4<? super ChannelSegment<E>, ? super Integer, ? super E, ? super Long, ? extends R> r22) {
        ChannelSegment segment = (ChannelSegment) access$getSendSegment$volatile$FU().get(this);
    L3:
        long sendersAndCloseStatusCur = access$getSendersAndCloseStatus$volatile$FU().getAndIncrement(this);
        long s = sendersAndCloseStatusCur & 1152921504606846975L;
        boolean closed = access$isClosedForSend0(this, sendersAndCloseStatusCur);
        long id = s / ((long) BufferedChannelKt.SEGMENT_SIZE);
        int i = (int) (s % ((long) BufferedChannelKt.SEGMENT_SIZE));
        if (segment.id == id) goto L13;
        ChannelSegment r3 = access$findSegmentSend(this, id, segment);
        if (r3 == null) goto L7;
        segment = r3;
        goto L13
    L7:
        if (closed == false) goto L3;
        return r21.invoke();
    L13:
        switch(access$updateCellSend(this, segment, i, r17, s, waiter, closed)) {
            case 0: goto L37;
            case 1: goto L36;
            case 2: goto L24;
            case 3: goto L22;
            case 4: goto L17;
            case 5: goto L15;
            default: goto L3;
        };
    L15:
        segment.cleanPrev();
        goto L3
    L17:
        if (s >= getReceiversCounter$kotlinx_coroutines_core()) goto L20;
        segment.cleanPrev();
    L20:
        return r21.invoke();
    L22:
        return r22.invoke(segment, Integer.valueOf(i), r17, Long.valueOf(s));
    L24:
        if (closed == false) goto L28;
        segment.onSlotCleaned();
        return r21.invoke();
    L28:
        if ((waiter instanceof Waiter) == false) goto L30;
        Waiter r4 = (Waiter) waiter;
    L31:
        if (r4 == null) goto L34;
        access$prepareSenderForSuspension(this, r4, segment, i);
    L34:
        return r20.invoke(segment, Integer.valueOf(i));
    L30:
        r4 = null;
        goto L31
    L36:
        return r19.invoke();
    L37:
        segment.cleanPrev();
        return r19.invoke();
    }

    /* JADX INFO: renamed from: trySendDropOldest-JP2dKIU, reason: not valid java name */
    protected final Object m8921trySendDropOldestJP2dKIU(E r20) {
        Object waiter$iv = BufferedChannelKt.BUFFERED;
        ChannelSegment segment$iv = (ChannelSegment) access$getSendSegment$volatile$FU().get(this);
    L3:
        long sendersAndCloseStatusCur$iv = access$getSendersAndCloseStatus$volatile$FU().getAndIncrement(this);
        long s$iv = sendersAndCloseStatusCur$iv & 1152921504606846975L;
        boolean closed$iv = access$isClosedForSend0(this, sendersAndCloseStatusCur$iv);
        long id$iv = s$iv / ((long) BufferedChannelKt.SEGMENT_SIZE);
        int i$iv = (int) (s$iv % ((long) BufferedChannelKt.SEGMENT_SIZE));
        if (segment$iv.id == id$iv) goto L14;
        ChannelSegment r3 = access$findSegmentSend(this, id$iv, segment$iv);
        if (r3 == null) goto L7;
        segment$iv = r3;
        goto L14
    L7:
        if (closed$iv == false) goto L3;
    L10:
        return ChannelResult.Companion.m8939closedJP2dKIU(getSendException());
    L14:
        switch(access$updateCellSend(this, segment$iv, i$iv, r20, s$iv, waiter$iv, closed$iv)) {
            case 0: goto L36;
            case 1: goto L35;
            case 2: goto L23;
            case 3: goto L22;
            case 4: goto L18;
            case 5: goto L16;
            default: goto L37;
        };
    L16:
        segment$iv.cleanPrev();
    L37:
        segment$iv = segment$iv;
        goto L3
    L18:
        if (s$iv >= getReceiversCounter$kotlinx_coroutines_core()) goto L10;
        segment$iv.cleanPrev();
        goto L10
    L22:
        throw new IllegalStateException("unexpected".toString());
    L23:
        if (closed$iv == false) goto L26;
        segment$iv.onSlotCleaned();
        goto L10
    L26:
        if ((waiter$iv instanceof Waiter) == false) goto L28;
        Waiter r4 = (Waiter) waiter$iv;
    L29:
        if (r4 == null) goto L31;
        access$prepareSenderForSuspension(this, r4, segment$iv, i$iv);
    L31:
        ChannelSegment segm = segment$iv;
        long r1 = segm.id;
        dropFirstElementUntilTheSpecifiedCellIsInTheBuffer((((long) BufferedChannelKt.SEGMENT_SIZE) * r1) + ((long) i$iv));
        return ChannelResult.Companion.m8941successJP2dKIU(Unit.INSTANCE);
    L28:
        r4 = null;
    L35:
        return ChannelResult.Companion.m8941successJP2dKIU(Unit.INSTANCE);
    L36:
        segment$iv.cleanPrev();
        goto L35
    }

    private final void sendImplOnNoWaiter(ChannelSegment<E> r18, int index, E r20, long s, Waiter waiter, Function0<Unit> r24, Function0<Unit> r25) {
        switch(access$updateCellSend(this, r18, index, r20, s, waiter, false)) {
            case 0: goto L43;
            case 1: goto L42;
            case 2: goto L41;
            case 3: goto L5;
            case 4: goto L38;
            case 5: goto L6;
            default: goto L5;
        };
    L6:
        r18.cleanPrev();
        ChannelSegment segment$iv = (ChannelSegment) access$getSendSegment$volatile$FU().get(this);
    L7:
        long sendersAndCloseStatusCur$iv = access$getSendersAndCloseStatus$volatile$FU().getAndIncrement(this);
        long s$iv = sendersAndCloseStatusCur$iv & 1152921504606846975L;
        boolean closed$iv = access$isClosedForSend0(this, sendersAndCloseStatusCur$iv);
        long id$iv = s$iv / ((long) BufferedChannelKt.SEGMENT_SIZE);
        int i$iv = (int) (s$iv % ((long) BufferedChannelKt.SEGMENT_SIZE));
        if (segment$iv.id == id$iv) goto L16;
        ChannelSegment r2 = access$findSegmentSend(this, id$iv, segment$iv);
        if (r2 == null) goto L11;
        segment$iv = r2;
        goto L16
    L11:
        if (closed$iv == false) goto L7;
        Unit r3 = r25.invoke();
    L59:
        return;
    L16:
        switch(access$updateCellSend(this, segment$iv, i$iv, r20, s$iv, waiter, closed$iv)) {
            case 0: goto L35;
            case 1: goto L34;
            case 2: goto L25;
            case 3: goto L24;
            case 4: goto L20;
            case 5: goto L18;
            default: goto L7;
        };
    L18:
        segment$iv.cleanPrev();
        goto L7
    L20:
        if (s$iv >= getReceiversCounter$kotlinx_coroutines_core()) goto L22;
        segment$iv.cleanPrev();
    L22:
        r3 = r25.invoke();
        goto L59
    L24:
        throw new IllegalStateException("unexpected".toString());
    L25:
        if (closed$iv == false) goto L28;
        segment$iv.onSlotCleaned();
        r3 = r25.invoke();
        goto L59
    L28:
        if ((waiter instanceof Waiter) == false) goto L30;
        Waiter r4 = waiter;
    L31:
        if (r4 == null) goto L33;
        access$prepareSenderForSuspension(this, r4, segment$iv, i$iv);
    L33:
        r3 = Unit.INSTANCE;
        goto L59
    L30:
        r4 = null;
        goto L31
    L34:
        r3 = r24.invoke();
        goto L59
    L35:
        segment$iv.cleanPrev();
        r3 = r24.invoke();
        goto L59
    L41:
        access$prepareSenderForSuspension(this, waiter, r18, index);
        return;
    L42:
        r24.invoke();
        return;
    L43:
        r18.cleanPrev();
        r24.invoke();
        return;
    L5:
        throw new IllegalStateException("unexpected".toString());
    L38:
        if (s >= getReceiversCounter$kotlinx_coroutines_core()) goto L40;
        r18.cleanPrev();
    L40:
        r25.invoke();
    }

    private final int updateCellSend(ChannelSegment<E> r5, int index, E r7, long s, Object waiter, boolean closed) {
        r5.storeElement$kotlinx_coroutines_core(index, r7);
        if (closed == true) goto L5;
        Object state = r5.getState$kotlinx_coroutines_core(index);
        if (state != null) goto L21;
        if (bufferOrRendezvousSend(s) == true) goto L11;
        if (waiter != null) goto L17;
        return 3;
    L17:
        if (r5.casState$kotlinx_coroutines_core(index, null, waiter) == false) goto L31;
        return 2;
    L31:
        return updateCellSendSlow(r5, index, r7, s, waiter, closed);
    L11:
        if (r5.casState$kotlinx_coroutines_core(index, null, BufferedChannelKt.BUFFERED) == false) goto L31;
        return 1;
    L21:
        if ((state instanceof Waiter) == false) goto L31;
        r5.cleanElement$kotlinx_coroutines_core(index);
        if (tryResumeReceiver(state, r7) == false) goto L26;
        r5.setState$kotlinx_coroutines_core(index, BufferedChannelKt.access$getDONE_RCV$p());
        onReceiveDequeued();
        return 0;
    L26:
        if (r5.getAndSetState$kotlinx_coroutines_core(index, BufferedChannelKt.access$getINTERRUPTED_RCV$p()) == BufferedChannelKt.access$getINTERRUPTED_RCV$p()) goto L28;
        r5.onCancelledRequest(index, true);
    L28:
        return 5;
    L5:
        return updateCellSendSlow(r5, index, r7, s, waiter, closed);
    }

    private final int updateCellSendSlow(ChannelSegment<E> r7, int index, E r9, long s, Object waiter, boolean closed) {
    L2:
        Object state = r7.getState$kotlinx_coroutines_core(index);
        if (state == null) goto L5;
        if (state != BufferedChannelKt.access$getIN_BUFFER$p()) goto L29;
        if (r7.casState$kotlinx_coroutines_core(index, state, BufferedChannelKt.BUFFERED) == false) goto L2;
        return 1;
    L29:
        if (state != BufferedChannelKt.access$getINTERRUPTED_RCV$p()) goto L33;
        r7.cleanElement$kotlinx_coroutines_core(index);
        return 5;
    L33:
        if (state != BufferedChannelKt.access$getPOISONED$p()) goto L37;
        r7.cleanElement$kotlinx_coroutines_core(index);
        return 5;
    L37:
        if (state != BufferedChannelKt.getCHANNEL_CLOSED()) goto L41;
        r7.cleanElement$kotlinx_coroutines_core(index);
        completeCloseOrCancel();
        return 4;
    L41:
        if (DebugKt.getASSERTIONS_ENABLED() == true) goto L43;
    L53:
        r7.cleanElement$kotlinx_coroutines_core(index);
        if ((state instanceof WaiterEB) == false) goto L56;
        Object receiver = ((WaiterEB) state).waiter;
    L58:
        if (tryResumeReceiver(receiver, r9) == false) goto L61;
        r7.setState$kotlinx_coroutines_core(index, BufferedChannelKt.access$getDONE_RCV$p());
        onReceiveDequeued();
        return 0;
    L61:
        if (r7.getAndSetState$kotlinx_coroutines_core(index, BufferedChannelKt.access$getINTERRUPTED_RCV$p()) == BufferedChannelKt.access$getINTERRUPTED_RCV$p()) goto L64;
        r7.onCancelledRequest(index, true);
    L64:
        return 5;
    L56:
        receiver = state;
        goto L58
    L43:
        if ((state instanceof Waiter) == false) goto L45;
    L48:
        int r1 = 1;
    L49:
        if (r1 != 0) goto L53;
        throw new AssertionError();
    L45:
        if ((state instanceof WaiterEB) == true) goto L48;
        r1 = 0;
        goto L49
    L5:
        if (bufferOrRendezvousSend(s) == false) goto L11;
        if (closed == true) goto L11;
        if (r7.casState$kotlinx_coroutines_core(index, null, BufferedChannelKt.BUFFERED) == false) goto L2;
        return 1;
    L11:
        if (closed == true) goto L13;
        if (waiter == null) goto L17;
        if (r7.casState$kotlinx_coroutines_core(index, null, waiter) == false) goto L2;
        return 2;
    L17:
        return 3;
    L13:
        if (r7.casState$kotlinx_coroutines_core(index, null, BufferedChannelKt.access$getINTERRUPTED_SEND$p()) == false) goto L2;
        r7.onCancelledRequest(index, false);
        return 4;
    }

    private final boolean shouldSendSuspend(long curSendersAndCloseStatus) {
        if (isClosedForSend0(curSendersAndCloseStatus) == false) goto L6;
        return false;
    L6:
        long $this$sendersCounter$iv = curSendersAndCloseStatus & 1152921504606846975L;
        return !bufferOrRendezvousSend($this$sendersCounter$iv);
    }

    private final boolean bufferOrRendezvousSend(long curSenders) {
        if (curSenders >= getBufferEndCounter()) goto L5;
    L8:
        return true;
    L5:
        if (curSenders < (getReceiversCounter$kotlinx_coroutines_core() + ((long) this.capacity))) goto L8;
        return false;
    }

    public boolean shouldSendSuspend$kotlinx_coroutines_core() {
        return shouldSendSuspend(getSendersAndCloseStatus$volatile$FU().get(this));
    }

    private final boolean tryResumeReceiver(Object $this$tryResumeReceiver, E r6) {
        if (($this$tryResumeReceiver instanceof SelectInstance) == true) goto L23;
        Function1<Throwable, Unit> r1 = null;
        if (($this$tryResumeReceiver instanceof ReceiveCatching) == false) goto L12;
        Intrinsics.checkNotNull($this$tryResumeReceiver, "null cannot be cast to non-null type kotlinx.coroutines.channels.ReceiveCatching<E of kotlinx.coroutines.channels.BufferedChannel>");
        ReceiveCatching r0 = (ReceiveCatching) $this$tryResumeReceiver;
        CancellableContinuationImpl<ChannelResult<? extends E>> r2 = ((ReceiveCatching) $this$tryResumeReceiver).cont;
        ChannelResult r3 = ChannelResult.m8926boximpl(ChannelResult.Companion.m8941successJP2dKIU(r6));
        Function1<E, Unit> r4 = this.onUndeliveredElement;
        if (r4 == null) goto L24;
        r1 = OnUndeliveredElementKt.bindCancellationFun(r4, r6, ((ReceiveCatching) $this$tryResumeReceiver).cont.getContext());
    L24:
        return BufferedChannelKt.access$tryResume0(r2, r3, r1);
    L12:
        if (($this$tryResumeReceiver instanceof BufferedChannelIterator) == false) goto L15;
        Intrinsics.checkNotNull($this$tryResumeReceiver, "null cannot be cast to non-null type kotlinx.coroutines.channels.BufferedChannel.BufferedChannelIterator<E of kotlinx.coroutines.channels.BufferedChannel>");
        BufferedChannelIterator r5 = (BufferedChannelIterator) $this$tryResumeReceiver;
        return ((BufferedChannelIterator) $this$tryResumeReceiver).tryResumeHasNext(r6);
    L15:
        if (($this$tryResumeReceiver instanceof CancellableContinuation) == false) goto L22;
        Intrinsics.checkNotNull($this$tryResumeReceiver, "null cannot be cast to non-null type kotlinx.coroutines.CancellableContinuation<E of kotlinx.coroutines.channels.BufferedChannel>");
        CancellableContinuation r7 = (CancellableContinuation) $this$tryResumeReceiver;
        CancellableContinuation r8 = (CancellableContinuation) $this$tryResumeReceiver;
        Function1<E, Unit> r9 = this.onUndeliveredElement;
        if (r9 == null) goto L20;
        r1 = OnUndeliveredElementKt.bindCancellationFun(r9, r6, ((CancellableContinuation) $this$tryResumeReceiver).getContext());
    L20:
        return BufferedChannelKt.access$tryResume0(r8, r6, r1);
    L22:
        throw new IllegalStateException(("Unexpected receiver type: " + $this$tryResumeReceiver).toString());
    L23:
        return ((SelectInstance) $this$tryResumeReceiver).trySelect(this, r6);
    }

    protected void onReceiveEnqueued() {
    }

    protected void onReceiveDequeued() {
    }

    static /* synthetic */ <E> Object receive$suspendImpl(BufferedChannel<E> r17, Continuation<? super E> r18) {
        ChannelSegment<E> r1 = (ChannelSegment) access$getReceiveSegment$volatile$FU().get(r17);
    L4:
        if (r17.isClosedForReceive() == true) goto L28;
        long r$iv = access$getReceivers$volatile$FU().getAndIncrement(r17);
        long id$iv = r$iv / ((long) BufferedChannelKt.SEGMENT_SIZE);
        int i$iv = (int) (r$iv % ((long) BufferedChannelKt.SEGMENT_SIZE));
        if (r1.id == id$iv) goto L11;
        ChannelSegment<E> r9 = access$findSegmentReceive(r17, id$iv, r1);
        if (r9 == null) goto L4;
        r1 = r9;
    L11:
        Object updCellResult$iv = access$updateCellReceive(r17, r1, i$iv, r$iv, null);
        if (updCellResult$iv == BufferedChannelKt.access$getSUSPEND$p()) goto L26;
        if (updCellResult$iv != BufferedChannelKt.access$getFAILED$p()) goto L20;
        if (r$iv >= r17.getSendersCounter$kotlinx_coroutines_core()) goto L4;
        r1.cleanPrev();
        goto L4
    L20:
        if (updCellResult$iv == BufferedChannelKt.access$getSUSPEND_NO_WAITER$p()) goto L22;
        r1.cleanPrev();
        return updCellResult$iv;
    L22:
        return r17.receiveOnNoWaiterSuspend(r1, i$iv, r$iv, r18);
    L26:
        throw new IllegalStateException("unexpected".toString());
    L28:
        throw StackTraceRecoveryKt.recoverStackTrace(r17.getReceiveException());
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 3921. Try increasing type updates limit count.
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:79)
        */
    private final java.lang.Object receiveOnNoWaiterSuspend(kotlinx.coroutines.channels.ChannelSegment<E> r25, int r26, long r27, kotlin.coroutines.Continuation<? super E> r29) {
        /*  JADX ERROR: Simple mode code generation failed
            jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0002: CONST (r2v0 ?? I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY]) = (0 ??[int, float, boolean, short, byte, char, OBJECT, ARRAY]) A[DECLARE_VAR] in method: kotlinx.coroutines.channels.BufferedChannel.receiveOnNoWaiterSuspend(kotlinx.coroutines.channels.ChannelSegment<E>, int, long, kotlin.coroutines.Continuation<? super E>):java.lang.Object, file: classes4.dex
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:310)
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:273)
            	at jadx.core.codegen.MethodGen.generateSimpleCode(MethodGen.java:348)
            	at jadx.core.codegen.MethodGen.addSimpleMethodCode(MethodGen.java:316)
            	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:279)
            	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:420)
            	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:345)
            	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:299)
            	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:184)
            	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
            	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
            	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
            Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.ArgType.getPrimitiveType()" because "type" is null
            	at jadx.core.codegen.ClassGen.useType(ClassGen.java:564)
            	at jadx.core.codegen.InsnGen.useType(InsnGen.java:269)
            	at jadx.core.codegen.InsnGen.declareVar(InsnGen.java:166)
            	at jadx.core.codegen.InsnGen.declareVar(InsnGen.java:159)
            	at jadx.core.codegen.InsnGen.assignVar(InsnGen.java:152)
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:299)
            	... 11 more
            */
        /*
            Method dump skipped, instruction units count: 392
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.BufferedChannel.receiveOnNoWaiterSuspend(kotlinx.coroutines.channels.ChannelSegment, int, long, kotlin.coroutines.Continuation):java.lang.Object");
    }

    private final void prepareReceiverForSuspension(Waiter $this$prepareReceiverForSuspension, ChannelSegment<E> r3, int index) {
        onReceiveEnqueued();
        $this$prepareReceiverForSuspension.invokeOnCancellation(r3, index);
    }

    private final void onClosedReceiveOnNoWaiterSuspend(CancellableContinuation<? super E> r3) {
        Result.Companion r1 = Result.Companion;
        r3.resumeWith(Result.m7425constructorimpl(ResultKt.createFailure(getReceiveException())));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: receiveCatching-JP2dKIU$suspendImpl, reason: not valid java name */
    static /* synthetic */ <E> Object m8917receiveCatchingJP2dKIU$suspendImpl(BufferedChannel<E> r13, Continuation<? super ChannelResult<? extends E>> r14) {
        if ((r14 instanceof BufferedChannel$receiveCatching$1) == false) goto L7;
        BufferedChannel$receiveCatching$1 r0 = (BufferedChannel$receiveCatching$1) r14;
        if ((r0.label & Integer.MIN_VALUE) == 0) goto L7;
        r0.label -= Integer.MIN_VALUE;
    L8:
        BufferedChannel$receiveCatching$1 r6 = r0;
        Object $result = r6.result;
        Object r1 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch(r6.label) {
            case 0: goto L13;
            case 1: goto L12;
            default: goto L11;
        };
    L12:
        ResultKt.throwOnFailure($result);
        Object r2 = ((ChannelResult) $result).m8938unboximpl();
    L53:
        return r2;
    L13:
        ResultKt.throwOnFailure($result);
        ChannelSegment<E> segment$iv = (ChannelSegment) access$getReceiveSegment$volatile$FU().get(r13);
    L15:
        if (r13.isClosedForReceive() == true) goto L41;
        long r$iv = access$getReceivers$volatile$FU().getAndIncrement(r13);
        long id$iv = r$iv / ((long) BufferedChannelKt.SEGMENT_SIZE);
        int i = (int) (r$iv % ((long) BufferedChannelKt.SEGMENT_SIZE));
        if (segment$iv.id == id$iv) goto L23;
        ChannelSegment<E> r10 = access$findSegmentReceive(r13, id$iv, segment$iv);
        if (r10 == null) goto L15;
        ChannelSegment<E> segment$iv2 = r10;
    L24:
        Object updCellResult$iv = access$updateCellReceive(r13, segment$iv2, i, r$iv, null);
        if (updCellResult$iv == BufferedChannelKt.access$getSUSPEND$p()) goto L43;
        if (updCellResult$iv != BufferedChannelKt.access$getFAILED$p()) goto L33;
        if (r$iv >= r13.getSendersCounter$kotlinx_coroutines_core()) goto L31;
        segment$iv2.cleanPrev();
    L31:
        segment$iv = segment$iv2;
        goto L15
    L33:
        if (updCellResult$iv != BufferedChannelKt.access$getSUSPEND_NO_WAITER$p()) goto L39;
        ChannelSegment<E> segm = segment$iv2;
        r6.label = 1;
        r2 = r13.m8918receiveCatchingOnNoWaiterSuspendGKJJFZk(segm, i, r$iv, r6);
        if (r2 != r1) goto L53;
        return r1;
    L39:
        segment$iv2.cleanPrev();
        return ChannelResult.Companion.m8941successJP2dKIU(updCellResult$iv);
    L43:
        throw new IllegalStateException("unexpected".toString());
    L23:
        segment$iv2 = segment$iv;
        goto L24
    L41:
        return ChannelResult.Companion.m8939closedJP2dKIU(r13.getCloseCause());
    L11:
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    L7:
        r0 = new BufferedChannel$receiveCatching$1(r13, r14);
        goto L8
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: receiveCatchingOnNoWaiterSuspend-GKJJFZk, reason: not valid java name */
    private final Object m8918receiveCatchingOnNoWaiterSuspendGKJJFZk(ChannelSegment<E> r25, int index, long r, Continuation<? super ChannelResult<? extends E>> r29) {
        if ((r29 instanceof BufferedChannel$receiveCatchingOnNoWaiterSuspend$1) == false) goto L7;
        BufferedChannel$receiveCatchingOnNoWaiterSuspend$1 r1 = (BufferedChannel$receiveCatchingOnNoWaiterSuspend$1) r29;
        if ((r1.label & Integer.MIN_VALUE) == 0) goto L7;
        r1.label -= Integer.MIN_VALUE;
    L8:
        Object $result = r1.result;
        Object r0 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch(r1.label) {
            case 0: goto L13;
            case 1: goto L12;
            default: goto L11;
        };
    L12:
        long r4 = r1.J$0;
        int r5 = r1.I$0;
        ChannelSegment r6 = (ChannelSegment) r1.L$1;
        BufferedChannel r7 = (BufferedChannel) r1.L$0;
        ResultKt.throwOnFailure($result);
        Object r2 = $result;
    L72:
        return ((ChannelResult) r2).m8938unboximpl();
    L13:
        ResultKt.throwOnFailure($result);
        r1.L$0 = this;
        r1.L$1 = r25;
        r1.I$0 = index;
        r1.J$0 = r;
        r1.label = 1;
        Continuation uCont$iv = r1;
        CancellableContinuationImpl cancellable$iv = CancellableContinuationKt.getOrCreateCancellableContinuation(IntrinsicsKt.intercepted(uCont$iv));
        Intrinsics.checkNotNull(cancellable$iv, "null cannot be cast to non-null type kotlinx.coroutines.CancellableContinuationImpl<kotlinx.coroutines.channels.ChannelResult<E of kotlinx.coroutines.channels.BufferedChannel.receiveCatchingOnNoWaiterSuspend_GKJJFZk$lambda$38>>");     // Catch: Throwable -> L75
        ReceiveCatching waiter = new ReceiveCatching(cancellable$iv);     // Catch: Throwable -> L75
        ReceiveCatching r10 = waiter;     // Catch: Throwable -> L75
        BufferedChannel<E> r8 = this;
        Object updCellResult$iv = access$updateCellReceive(r8, r25, index, r, r10);     // Catch: Throwable -> L75
        Continuation $continuation = r1;
    L73:
        e$iv = th;
    L77:
        cancellable$iv.releaseClaimedReusableContinuation$kotlinx_coroutines_core();
        throw e$iv;
    L17:
        if (updCellResult$iv != BufferedChannelKt.access$getSUSPEND$p()) goto L20;
        access$prepareReceiverForSuspension(r8, waiter, r25, index);     // Catch: Throwable -> L73
    L65:
        r2 = cancellable$iv.getResult();
        if (r2 != IntrinsicsKt.getCOROUTINE_SUSPENDED()) goto L68;
        DebugProbesKt.probeCoroutineSuspended($continuation);
    L68:
        if (r2 != r0) goto L72;
        return r0;
    L20:
        if (updCellResult$iv == BufferedChannelKt.access$getFAILED$p()) goto L22;
        r25.cleanPrev();     // Catch: Throwable -> L73
        ChannelResult r9 = ChannelResult.m8926boximpl(ChannelResult.Companion.m8941successJP2dKIU(updCellResult$iv));     // Catch: Throwable -> L73
        Function1<E, Unit> r11 = this.onUndeliveredElement;     // Catch: Throwable -> L73
        if (r11 == null) goto L63;
        Function1<Throwable, Unit> r12 = OnUndeliveredElementKt.bindCancellationFun(r11, updCellResult$iv, cancellable$iv.getContext());     // Catch: Throwable -> L73
    L64:
        cancellable$iv.resume(r9, r12);     // Catch: Throwable -> L73
        goto L65
    L63:
        r12 = null;
        goto L64
    L22:
        if (r >= r8.getSendersCounter$kotlinx_coroutines_core()) goto L24;
        r25.cleanPrev();     // Catch: Throwable -> L73
    L24:
        ChannelSegment segment$iv$iv = (ChannelSegment) access$getReceiveSegment$volatile$FU().get(r8);     // Catch: Throwable -> L73
    L26:
        if (r8.isClosedForReceive() == true) goto L27;
        long r$iv$iv = access$getReceivers$volatile$FU().getAndIncrement(r8);     // Catch: Throwable -> L73
        long id$iv$iv = r$iv$iv / ((long) BufferedChannelKt.SEGMENT_SIZE);     // Catch: Throwable -> L73
        int i$iv$iv = (int) (r$iv$iv % ((long) BufferedChannelKt.SEGMENT_SIZE));     // Catch: Throwable -> L73
        if (segment$iv$iv.id == id$iv$iv) goto L34;
        ChannelSegment r13 = access$findSegmentReceive(r8, id$iv$iv, segment$iv$iv);     // Catch: Throwable -> L73
        if (r13 == null) goto L26;
        ChannelSegment segment$iv$iv2 = r13;
    L35:
        BufferedChannel<E> r17 = r8;
        Object updCellResult$iv$iv = access$updateCellReceive(r17, segment$iv$iv2, i$iv$iv, r$iv$iv, waiter);     // Catch: Throwable -> L73
        segment$iv$iv = segment$iv$iv2;
        if (updCellResult$iv$iv == BufferedChannelKt.access$getSUSPEND$p()) goto L38;
        if (updCellResult$iv$iv != BufferedChannelKt.access$getFAILED$p()) goto L51;
        if (r$iv$iv >= r17.getSendersCounter$kotlinx_coroutines_core()) goto L49;
        segment$iv$iv.cleanPrev();     // Catch: Throwable -> L73
    L49:
        r8 = r17;
        goto L26
    L51:
        if (updCellResult$iv$iv == BufferedChannelKt.access$getSUSPEND_NO_WAITER$p()) goto L59;
        segment$iv$iv.cleanPrev();     // Catch: Throwable -> L73
        ChannelResult r14 = ChannelResult.m8926boximpl(ChannelResult.Companion.m8941successJP2dKIU(updCellResult$iv$iv));     // Catch: Throwable -> L73
        Function1<E, Unit> r15 = this.onUndeliveredElement;     // Catch: Throwable -> L73
        if (r15 == null) goto L55;
        Function1<Throwable, Unit> r16 = OnUndeliveredElementKt.bindCancellationFun(r15, updCellResult$iv$iv, cancellable$iv.getContext());     // Catch: Throwable -> L73
    L56:
        cancellable$iv.resume(r14, r16);     // Catch: Throwable -> L73
        goto L65
    L55:
        r16 = null;
        goto L56
    L59:
        throw new IllegalStateException("unexpected".toString());     // Catch: Throwable -> L73
    L38:
        if ((waiter instanceof Waiter) == false) goto L40;
        ReceiveCatching r18 = waiter;     // Catch: Throwable -> L73
    L41:
        if (r18 == null) goto L65;
        access$prepareReceiverForSuspension(r17, r18, segment$iv$iv, i$iv$iv);     // Catch: Throwable -> L73
        goto L65
    L40:
        r18 = null;
        goto L41
    L34:
        segment$iv$iv2 = segment$iv$iv;
        goto L35
    L27:
        access$onClosedReceiveCatchingOnNoWaiterSuspend(this, cancellable$iv);     // Catch: Throwable -> L73
    L75:
        e$iv = th;
        goto L77
    L11:
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    L7:
        r1 = new BufferedChannel$receiveCatchingOnNoWaiterSuspend$1(this, r29);
        goto L8
    }

    private final void onClosedReceiveCatchingOnNoWaiterSuspend(CancellableContinuation<? super ChannelResult<? extends E>> r4) {
        Result.Companion r1 = Result.Companion;
        r4.resumeWith(Result.m7425constructorimpl(ChannelResult.m8926boximpl(ChannelResult.Companion.m8939closedJP2dKIU(getCloseCause()))));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.coroutines.channels.ReceiveChannel
    /* JADX INFO: renamed from: tryReceive-PtdJZtk, reason: not valid java name */
    public Object mo8920tryReceivePtdJZtk() {
        long r = getReceivers$volatile$FU().get(this);
        long sendersAndCloseStatusCur = getSendersAndCloseStatus$volatile$FU().get(this);
        if (isClosedForReceive0(sendersAndCloseStatusCur) == true) goto L5;
        long $this$sendersCounter$iv = sendersAndCloseStatusCur & 1152921504606846975L;
        if (r >= $this$sendersCounter$iv) goto L9;
        Object waiter$iv = BufferedChannelKt.access$getINTERRUPTED_RCV$p();
        ChannelSegment segment$iv = (ChannelSegment) access$getReceiveSegment$volatile$FU().get(this);
    L12:
        if (isClosedForReceive() == true) goto L39;
        long r$iv = access$getReceivers$volatile$FU().getAndIncrement(this);
        long id$iv = r$iv / ((long) BufferedChannelKt.SEGMENT_SIZE);
        int i$iv = (int) (r$iv % ((long) BufferedChannelKt.SEGMENT_SIZE));
        if (segment$iv.id == id$iv) goto L20;
        ChannelSegment r3 = access$findSegmentReceive(this, id$iv, segment$iv);
        if (r3 == null) goto L12;
        segment$iv = r3;
    L20:
        Object updCellResult$iv = access$updateCellReceive(this, segment$iv, i$iv, r$iv, waiter$iv);
        if (updCellResult$iv == BufferedChannelKt.access$getSUSPEND$p()) goto L23;
        ChannelSegment segment$iv2 = segment$iv;
        if (updCellResult$iv != BufferedChannelKt.access$getFAILED$p()) goto L36;
        if (r$iv >= getSendersCounter$kotlinx_coroutines_core()) goto L34;
        segment$iv2.cleanPrev();
    L34:
        segment$iv = segment$iv2;
        goto L12
    L36:
        if (updCellResult$iv == BufferedChannelKt.access$getSUSPEND_NO_WAITER$p()) goto L41;
        segment$iv2.cleanPrev();
        return ChannelResult.Companion.m8941successJP2dKIU(updCellResult$iv);
    L41:
        throw new IllegalStateException("unexpected".toString());
    L23:
        if ((waiter$iv instanceof Waiter) == false) goto L25;
        Waiter r4 = (Waiter) waiter$iv;
    L26:
        if (r4 == null) goto L28;
        access$prepareReceiverForSuspension(this, r4, segment$iv, i$iv);
    L28:
        ChannelSegment segm = segment$iv;
        waitExpandBufferCompletion$kotlinx_coroutines_core(r$iv);
        segm.onSlotCleaned();
        return ChannelResult.Companion.m8940failurePtdJZtk();
    L25:
        r4 = null;
        goto L26
    L39:
        return ChannelResult.Companion.m8939closedJP2dKIU(getCloseCause());
    L9:
        return ChannelResult.Companion.m8940failurePtdJZtk();
    L5:
        return ChannelResult.Companion.m8939closedJP2dKIU(getCloseCause());
    }

    protected final void dropFirstElementUntilTheSpecifiedCellIsInTheBuffer(long globalCellIndex) {
        if (DebugKt.getASSERTIONS_ENABLED() == true) goto L5;
    L9:
        ChannelSegment<E> r0 = (ChannelSegment) getReceiveSegment$volatile$FU().get(this);
    L10:
        long r = getReceivers$volatile$FU().get(this);
        if (globalCellIndex < Math.max(((long) this.capacity) + r, getBufferEndCounter())) goto L12;
        if (getReceivers$volatile$FU().compareAndSet(this, r, 1 + r) == false) goto L10;
        long id = r / ((long) BufferedChannelKt.SEGMENT_SIZE);
        int i = (int) (r % ((long) BufferedChannelKt.SEGMENT_SIZE));
        if (r0.id == id) goto L21;
        ChannelSegment<E> r2 = findSegmentReceive(id, r0);
        if (r2 == null) goto L10;
        ChannelSegment<E> r3 = r2;
    L22:
        Object updCellResult = updateCellReceive(r3, i, r, null);
        if (updCellResult == BufferedChannelKt.access$getFAILED$p()) goto L25;
        r3.cleanPrev();
        Function1<E, Unit> r4 = this.onUndeliveredElement;
        if (r4 == null) goto L34;
        UndeliveredElementException it = OnUndeliveredElementKt.callUndeliveredElementCatchingException$default(r4, updCellResult, null, 2, null);
        if (it == null) goto L34;
        throw it;
    L34:
        r0 = r3;
        goto L10
    L25:
        if (r >= getSendersCounter$kotlinx_coroutines_core()) goto L34;
        r3.cleanPrev();
        goto L34
    L21:
        r3 = r0;
        goto L22
    L12:
        return;
    L5:
        if (isConflatedDropOldest() == true) goto L9;
        throw new AssertionError();
    }

    static /* synthetic */ Object receiveImpl$default(BufferedChannel $this, Object waiter, Function1 onElementRetrieved, Function3 onSuspend, Function0 onClosed, Function3 onNoWaiterSuspend, int r20, Object r21) {
        if (r21 != null) goto L39;
        if ((r20 & 16) == 0) goto L6;
        Function3 onNoWaiterSuspend2 = AnonymousClass1.INSTANCE;
    L7:
        ChannelSegment segment = (ChannelSegment) access$getReceiveSegment$volatile$FU().get($this);
    L9:
        if ($this.isClosedForReceive() == true) goto L11;
        long r = access$getReceivers$volatile$FU().getAndIncrement($this);
        long id = r / ((long) BufferedChannelKt.SEGMENT_SIZE);
        int i = (int) (r % ((long) BufferedChannelKt.SEGMENT_SIZE));
        if (segment.id == id) goto L18;
        ChannelSegment r5 = access$findSegmentReceive($this, id, segment);
        if (r5 == null) goto L9;
        segment = r5;
    L18:
        Object updCellResult = access$updateCellReceive($this, segment, i, r, waiter);
        if (updCellResult == BufferedChannelKt.access$getSUSPEND$p()) goto L21;
        if (updCellResult != BufferedChannelKt.access$getFAILED$p()) goto L34;
        if (r >= $this.getSendersCounter$kotlinx_coroutines_core()) goto L9;
        segment.cleanPrev();
        goto L9
    L34:
        if (updCellResult == BufferedChannelKt.access$getSUSPEND_NO_WAITER$p()) goto L51;
        segment.cleanPrev();
        return onElementRetrieved.invoke(updCellResult);
    L51:
        return onNoWaiterSuspend2.invoke(segment, Integer.valueOf(i), Long.valueOf(r));
    L21:
        if ((waiter instanceof Waiter) == false) goto L23;
        Waiter r11 = (Waiter) waiter;
    L24:
        if (r11 == null) goto L50;
        access$prepareReceiverForSuspension($this, r11, segment, i);
    L50:
        return onSuspend.invoke(segment, Integer.valueOf(i), Long.valueOf(r));
    L23:
        r11 = null;
        goto L24
    L11:
        return onClosed.invoke();
    L6:
        onNoWaiterSuspend2 = onNoWaiterSuspend;
        goto L7
    L39:
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: receiveImpl");
    }

    private final <R> R receiveImpl(Object waiter, Function1<? super E, ? extends R> r16, Function3<? super ChannelSegment<E>, ? super Integer, ? super Long, ? extends R> r17, Function0<? extends R> r18, Function3<? super ChannelSegment<E>, ? super Integer, ? super Long, ? extends R> r19) {
        ChannelSegment segment = (ChannelSegment) access$getReceiveSegment$volatile$FU().get(this);
    L4:
        if (isClosedForReceive() == true) goto L6;
        long r = access$getReceivers$volatile$FU().getAndIncrement(this);
        long id = r / ((long) BufferedChannelKt.SEGMENT_SIZE);
        int i = (int) (r % ((long) BufferedChannelKt.SEGMENT_SIZE));
        if (segment.id == id) goto L13;
        ChannelSegment r5 = access$findSegmentReceive(this, id, segment);
        if (r5 == null) goto L4;
        segment = r5;
    L13:
        Object updCellResult = access$updateCellReceive(this, segment, i, r, waiter);
        if (updCellResult == BufferedChannelKt.access$getSUSPEND$p()) goto L16;
        if (updCellResult != BufferedChannelKt.access$getFAILED$p()) goto L29;
        if (r >= getSendersCounter$kotlinx_coroutines_core()) goto L4;
        segment.cleanPrev();
        goto L4
    L29:
        if (updCellResult == BufferedChannelKt.access$getSUSPEND_NO_WAITER$p()) goto L44;
        segment.cleanPrev();
        return r16.invoke(updCellResult);
    L44:
        return r19.invoke(segment, Integer.valueOf(i), Long.valueOf(r));
    L16:
        if ((waiter instanceof Waiter) == false) goto L18;
        Waiter r10 = (Waiter) waiter;
    L19:
        if (r10 == null) goto L43;
        access$prepareReceiverForSuspension(this, r10, segment, i);
    L43:
        return r17.invoke(segment, Integer.valueOf(i), Long.valueOf(r));
    L18:
        r10 = null;
        goto L19
    L6:
        return r18.invoke();
    }

    private final void receiveImplOnNoWaiter(ChannelSegment<E> r19, int index, long r, Waiter waiter, Function1<? super E, Unit> r24, Function0<Unit> r25) {
        Object updCellResult = access$updateCellReceive(this, r19, index, r, waiter);
        if (updCellResult != BufferedChannelKt.access$getSUSPEND$p()) goto L6;
        access$prepareReceiverForSuspension(this, waiter, r19, index);
        return;
    L6:
        if (updCellResult == BufferedChannelKt.access$getFAILED$p()) goto L8;
        r19.cleanPrev();
        r24.invoke(updCellResult);
        return;
    L8:
        if (r >= getSendersCounter$kotlinx_coroutines_core()) goto L10;
        r19.cleanPrev();
    L10:
        ChannelSegment segment$iv = (ChannelSegment) access$getReceiveSegment$volatile$FU().get(this);
    L12:
        if (isClosedForReceive() == true) goto L13;
        long r$iv = access$getReceivers$volatile$FU().getAndIncrement(this);
        long id$iv = r$iv / ((long) BufferedChannelKt.SEGMENT_SIZE);
        int i$iv = (int) (r$iv % ((long) BufferedChannelKt.SEGMENT_SIZE));
        if (segment$iv.id == id$iv) goto L20;
        ChannelSegment r14 = access$findSegmentReceive(this, id$iv, segment$iv);
        if (r14 == null) goto L12;
        segment$iv = r14;
    L20:
        Object updCellResult$iv = access$updateCellReceive(this, segment$iv, i$iv, r$iv, waiter);
        if (updCellResult$iv == BufferedChannelKt.access$getSUSPEND$p()) goto L23;
        if (updCellResult$iv != BufferedChannelKt.access$getFAILED$p()) goto L36;
        if (r$iv >= getSendersCounter$kotlinx_coroutines_core()) goto L12;
        segment$iv.cleanPrev();
        goto L12
    L36:
        if (updCellResult$iv == BufferedChannelKt.access$getSUSPEND_NO_WAITER$p()) goto L41;
        segment$iv.cleanPrev();
        r24.invoke(updCellResult$iv);
        return;
    L41:
        throw new IllegalStateException("unexpected".toString());
    L23:
        if ((waiter instanceof Waiter) == false) goto L25;
        Waiter r15 = waiter;
    L26:
        if (r15 == null) goto L28;
        access$prepareReceiverForSuspension(this, r15, segment$iv, i$iv);
    L28:
        Unit r16 = Unit.INSTANCE;
        return;
    L25:
        r15 = null;
        goto L26
    L13:
        r25.invoke();
    }

    private final Object updateCellReceive(ChannelSegment<E> r7, int index, long r, Object waiter) {
        Object state = r7.getState$kotlinx_coroutines_core(index);
        if (state != null) goto L14;
        long $this$sendersCounter$iv = getSendersAndCloseStatus$volatile$FU().get(this);
        long senders = $this$sendersCounter$iv & 1152921504606846975L;
        if (r < senders) goto L20;
        if (waiter != null) goto L10;
        return BufferedChannelKt.access$getSUSPEND_NO_WAITER$p();
    L10:
        if (r7.casState$kotlinx_coroutines_core(index, state, waiter) == false) goto L20;
        expandBuffer();
        return BufferedChannelKt.access$getSUSPEND$p();
    L20:
        return updateCellReceiveSlow(r7, index, r, waiter);
    L14:
        if (state != BufferedChannelKt.BUFFERED) goto L20;
        if (r7.casState$kotlinx_coroutines_core(index, state, BufferedChannelKt.access$getDONE_RCV$p()) == false) goto L20;
        expandBuffer();
        return r7.retrieveElement$kotlinx_coroutines_core(index);
    }

    private final Object updateCellReceiveSlow(ChannelSegment<E> r7, int index, long r, Object waiter) {
    L2:
        Object state = r7.getState$kotlinx_coroutines_core(index);
        if (state == null) goto L41;
        if (state == BufferedChannelKt.access$getIN_BUFFER$p()) goto L41;
        if (state == BufferedChannelKt.BUFFERED) goto L10;
        if (state == BufferedChannelKt.access$getINTERRUPTED_SEND$p()) goto L16;
        if (state == BufferedChannelKt.access$getPOISONED$p()) goto L20;
        if (state == BufferedChannelKt.getCHANNEL_CLOSED()) goto L23;
        if (state == BufferedChannelKt.access$getRESUMING_BY_EB$p()) goto L2;
        if (r7.casState$kotlinx_coroutines_core(index, state, BufferedChannelKt.access$getRESUMING_BY_RCV$p()) == false) goto L2;
        boolean helpExpandBuffer = state instanceof WaiterEB;
        if ((state instanceof WaiterEB) == false) goto L32;
        Object sender = ((WaiterEB) state).waiter;
    L34:
        if (tryResumeSender(sender, r7, index) == false) goto L36;
        r7.setState$kotlinx_coroutines_core(index, BufferedChannelKt.access$getDONE_RCV$p());
        expandBuffer();
        return r7.retrieveElement$kotlinx_coroutines_core(index);
    L36:
        r7.setState$kotlinx_coroutines_core(index, BufferedChannelKt.access$getINTERRUPTED_SEND$p());
        r7.onCancelledRequest(index, false);
        if (helpExpandBuffer == false) goto L40;
        expandBuffer();
    L40:
        return BufferedChannelKt.access$getFAILED$p();
    L32:
        sender = state;
        goto L34
    L23:
        expandBuffer();
        return BufferedChannelKt.access$getFAILED$p();
    L20:
        return BufferedChannelKt.access$getFAILED$p();
    L16:
        return BufferedChannelKt.access$getFAILED$p();
    L10:
        if (r7.casState$kotlinx_coroutines_core(index, state, BufferedChannelKt.access$getDONE_RCV$p()) == false) goto L2;
        expandBuffer();
        return r7.retrieveElement$kotlinx_coroutines_core(index);
    L41:
        long $this$sendersCounter$iv = getSendersAndCloseStatus$volatile$FU().get(this);
        long senders = $this$sendersCounter$iv & 1152921504606846975L;
        if (r < senders) goto L44;
        if (waiter == null) goto L49;
        if (r7.casState$kotlinx_coroutines_core(index, state, waiter) == false) goto L2;
        expandBuffer();
        return BufferedChannelKt.access$getSUSPEND$p();
    L49:
        return BufferedChannelKt.access$getSUSPEND_NO_WAITER$p();
    L44:
        if (r7.casState$kotlinx_coroutines_core(index, state, BufferedChannelKt.access$getPOISONED$p()) == false) goto L2;
        expandBuffer();
        return BufferedChannelKt.access$getFAILED$p();
    }

    private final boolean tryResumeSender(Object $this$tryResumeSender, ChannelSegment<E> r6, int index) {
        if (($this$tryResumeSender instanceof CancellableContinuation) == false) goto L6;
        Intrinsics.checkNotNull($this$tryResumeSender, "null cannot be cast to non-null type kotlinx.coroutines.CancellableContinuation<kotlin.Unit>");
        CancellableContinuation r0 = (CancellableContinuation) $this$tryResumeSender;
        return BufferedChannelKt.tryResume0$default((CancellableContinuation) $this$tryResumeSender, Unit.INSTANCE, null, 2, null);
    L6:
        if (($this$tryResumeSender instanceof SelectInstance) == false) goto L15;
        Intrinsics.checkNotNull($this$tryResumeSender, "null cannot be cast to non-null type kotlinx.coroutines.selects.SelectImplementation<*>");
        SelectImplementation r1 = (SelectImplementation) $this$tryResumeSender;
        TrySelectDetailedResult trySelectResult = ((SelectImplementation) $this$tryResumeSender).trySelectDetailed(this, Unit.INSTANCE);
        if (trySelectResult != TrySelectDetailedResult.REREGISTER) goto L11;
        r6.cleanElement$kotlinx_coroutines_core(index);
    L11:
        if (trySelectResult == TrySelectDetailedResult.SUCCESSFUL) goto L21;
        return false;
    L21:
        return true;
    L15:
        if (($this$tryResumeSender instanceof SendBroadcast) == false) goto L19;
        return BufferedChannelKt.tryResume0$default(((SendBroadcast) $this$tryResumeSender).getCont(), true, null, 2, null);
    L19:
        throw new IllegalStateException(("Unexpected waiter: " + $this$tryResumeSender).toString());
    }

    private final void expandBuffer() {
        if (isRendezvousOrUnlimited() == false) goto L5;
        return;
    L5:
        ChannelSegment<E> r4 = (ChannelSegment) getBufferEndSegment$volatile$FU().get(this);
    L6:
        long b = getBufferEnd$volatile$FU().getAndIncrement(this);
        long id = b / ((long) BufferedChannelKt.SEGMENT_SIZE);
        long s = getSendersCounter$kotlinx_coroutines_core();
        if (s <= b) goto L9;
        if (r4.id == id) goto L21;
        ChannelSegment<E> r0 = findSegmentBufferEnd(id, r4, b);
        if (r0 == null) goto L6;
        r4 = r0;
    L21:
        int i = (int) (b % ((long) BufferedChannelKt.SEGMENT_SIZE));
        if (updateCellExpandBuffer(r4, i, b) == true) goto L23;
        incCompletedExpandBufferAttempts$default(this, 0, 1, null);
        goto L6
    L23:
        incCompletedExpandBufferAttempts$default(this, 0, 1, null);
        return;
    L9:
        if (r4.id < id) goto L11;
    L13:
        incCompletedExpandBufferAttempts$default(this, 0, 1, null);
        return;
    L11:
        if (r4.getNext() == 0) goto L13;
        moveSegmentBufferEndToSpecifiedOrLast(id, r4);
        goto L13
    }

    private final boolean updateCellExpandBuffer(ChannelSegment<E> r4, int index, long b) {
        Object state = r4.getState$kotlinx_coroutines_core(index);
        if ((state instanceof Waiter) == false) goto L14;
        if (b < getReceivers$volatile$FU().get(this)) goto L14;
        if (r4.casState$kotlinx_coroutines_core(index, state, BufferedChannelKt.access$getRESUMING_BY_EB$p()) == false) goto L14;
        if (tryResumeSender(state, r4, index) == false) goto L11;
        r4.setState$kotlinx_coroutines_core(index, BufferedChannelKt.BUFFERED);
        return true;
    L11:
        r4.setState$kotlinx_coroutines_core(index, BufferedChannelKt.access$getINTERRUPTED_SEND$p());
        r4.onCancelledRequest(index, false);
        return false;
    L14:
        return updateCellExpandBufferSlow(r4, index, b);
    }

    private final boolean updateCellExpandBufferSlow(ChannelSegment<E> r7, int index, long b) {
    L2:
        Object state = r7.getState$kotlinx_coroutines_core(index);
        if ((state instanceof Waiter) == true) goto L5;
        if (state == BufferedChannelKt.access$getINTERRUPTED_SEND$p()) goto L18;
        if (state == null) goto L21;
        if (state == BufferedChannelKt.BUFFERED) goto L25;
        if (state == BufferedChannelKt.access$getPOISONED$p()) goto L41;
        if (state == BufferedChannelKt.access$getDONE_RCV$p()) goto L41;
        if (state == BufferedChannelKt.access$getINTERRUPTED_RCV$p()) goto L41;
        if (state == BufferedChannelKt.getCHANNEL_CLOSED()) goto L35;
        if (state == BufferedChannelKt.access$getRESUMING_BY_RCV$p()) goto L2;
        throw new IllegalStateException(("Unexpected cell state: " + state).toString());
    L35:
        return true;
    L41:
        return true;
    L25:
        return true;
    L21:
        if (r7.casState$kotlinx_coroutines_core(index, state, BufferedChannelKt.access$getIN_BUFFER$p()) == false) goto L2;
        return true;
    L18:
        return false;
    L5:
        if (b < getReceivers$volatile$FU().get(this)) goto L7;
        if (r7.casState$kotlinx_coroutines_core(index, state, BufferedChannelKt.access$getRESUMING_BY_EB$p()) == false) goto L2;
        if (tryResumeSender(state, r7, index) == false) goto L14;
        r7.setState$kotlinx_coroutines_core(index, BufferedChannelKt.BUFFERED);
        return true;
    L14:
        r7.setState$kotlinx_coroutines_core(index, BufferedChannelKt.access$getINTERRUPTED_SEND$p());
        r7.onCancelledRequest(index, false);
        return false;
    L7:
        if (r7.casState$kotlinx_coroutines_core(index, state, new WaiterEB((Waiter) state)) == false) goto L2;
        return true;
    }

    static /* synthetic */ void incCompletedExpandBufferAttempts$default(BufferedChannel r0, long r1, int r3, Object r4) {
        if (r4 != null) goto L9;
        if ((r3 & 1) == 0) goto L6;
        r1 = 1;
    L6:
        r0.incCompletedExpandBufferAttempts(r1);
        return;
    L9:
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: incCompletedExpandBufferAttempts");
    }

    private final void incCompletedExpandBufferAttempts(long nAttempts) {
        long it = getCompletedExpandBuffersAndPauseFlag$volatile$FU().addAndGet(this, nAttempts);
        if ((it & SieveCacheKt.NodeVisitedBit) == 0) goto L5;
        boolean r6 = true;
    L6:
        if (r6 == false) goto L13;
    L7:
        long $this$ebPauseExpandBuffers$iv = getCompletedExpandBuffersAndPauseFlag$volatile$FU().get(this);
        if (($this$ebPauseExpandBuffers$iv & SieveCacheKt.NodeVisitedBit) == 0) goto L10;
        boolean r7 = true;
    L11:
        if (r7 == true) goto L7;
        return;
    L10:
        r7 = false;
        goto L11
    L13:
        return;
    L5:
        r6 = false;
        goto L6
    }

    public final void waitExpandBufferCompletion$kotlinx_coroutines_core(long globalIndex) {
        BufferedChannel<E> r1 = this;
        if (r1.isRendezvousOrUnlimited() == false) goto L6;
        return;
    L6:
        if (r1.getBufferEndCounter() > globalIndex) goto L7;
        r1 = this;
        goto L6
    L7:
        int r0 = BufferedChannelKt.access$getEXPAND_BUFFER_COMPLETION_WAIT_ITERATIONS$p();
        int r2 = 0;
    L8:
        long r7 = 4611686018427387903L;
        if (r2 >= r0) goto L16;
        long b = r1.getBufferEndCounter();
        long ebCompleted = 4611686018427387903L & getCompletedExpandBuffersAndPauseFlag$volatile$FU().get(r1);
        if (b != ebCompleted) goto L15;
        if (b != r1.getBufferEndCounter()) goto L15;
        return;
    L15:
        r2 = r2 + 1;
        goto L8
    L16:
        AtomicLongFieldUpdater handler$atomicfu$iv = getCompletedExpandBuffersAndPauseFlag$volatile$FU();
    L17:
        long it = handler$atomicfu$iv.get(r1);
        if (handler$atomicfu$iv.compareAndSet(r1, it, BufferedChannelKt.access$constructEBCompletedAndPauseFlag(it & 4611686018427387903L, true)) == true) goto L20;
        r1 = this;
    L20:
        long b2 = r1.getBufferEndCounter();
        long ebCompletedAndBit = getCompletedExpandBuffersAndPauseFlag$volatile$FU().get(r1);
        long $this$ebCompletedCounter$iv = ebCompletedAndBit & r7;
        if ((SieveCacheKt.NodeVisitedBit & ebCompletedAndBit) == 0) goto L23;
        int $i$f$getEbPauseExpandBuffers = 1;
    L24:
        int r16 = $i$f$getEbPauseExpandBuffers;
        if (b2 == $this$ebCompletedCounter$iv) goto L27;
    L33:
        r7 = r7;
        if (r16 == 0) goto L35;
        r1 = this;
        goto L20
    L35:
        r1 = this;
        getCompletedExpandBuffersAndPauseFlag$volatile$FU().compareAndSet(r1, ebCompletedAndBit, BufferedChannelKt.access$constructEBCompletedAndPauseFlag($this$ebCompletedCounter$iv, true));
        goto L20
    L27:
        if (b2 != r1.getBufferEndCounter()) goto L33;
        AtomicLongFieldUpdater handler$atomicfu$iv2 = getCompletedExpandBuffersAndPauseFlag$volatile$FU();
    L29:
        long it2 = handler$atomicfu$iv2.get(r1);
        long r21 = r7;
        if (handler$atomicfu$iv2.compareAndSet(r1, it2, BufferedChannelKt.access$constructEBCompletedAndPauseFlag(it2 & r21, false)) == true) goto L31;
        r1 = this;
        r7 = r21;
        goto L29
    L31:
        return;
    L23:
        $i$f$getEbPauseExpandBuffers = 0;
        goto L24
    }

    @Override // kotlinx.coroutines.channels.SendChannel
    public SelectClause2<E, BufferedChannel<E>> getOnSend() {
        BufferedChannel$onSend$1 r1 = BufferedChannel$onSend$1.INSTANCE;
        Intrinsics.checkNotNull(r1, "null cannot be cast to non-null type kotlin.Function3<@[ParameterName(name = 'clauseObject')] kotlin.Any, @[ParameterName(name = 'select')] kotlinx.coroutines.selects.SelectInstance<*>, @[ParameterName(name = 'param')] kotlin.Any?, kotlin.Unit>{ kotlinx.coroutines.selects.SelectKt.RegistrationFunction }");
        Function3 r2 = (Function3) TypeIntrinsics.beforeCheckcastToFunctionOfArity(r1, 3);
        BufferedChannel$onSend$2 r3 = BufferedChannel$onSend$2.INSTANCE;
        Intrinsics.checkNotNull(r3, "null cannot be cast to non-null type kotlin.Function3<@[ParameterName(name = 'clauseObject')] kotlin.Any, @[ParameterName(name = 'param')] kotlin.Any?, @[ParameterName(name = 'clauseResult')] kotlin.Any?, kotlin.Any?>{ kotlinx.coroutines.selects.SelectKt.ProcessResultFunction }");
        return new SelectClause2Impl(this, r2, (Function3) TypeIntrinsics.beforeCheckcastToFunctionOfArity(r3, 3), null, 8, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    protected void registerSelectForSend(SelectInstance<?> r19, Object r20) {
        Object r3 = r20;
        ChannelSegment segment$iv = (ChannelSegment) access$getSendSegment$volatile$FU().get(this);
    L3:
        long sendersAndCloseStatusCur$iv = access$getSendersAndCloseStatus$volatile$FU().getAndIncrement(this);
        long s$iv = sendersAndCloseStatusCur$iv & 1152921504606846975L;
        boolean closed$iv = access$isClosedForSend0(this, sendersAndCloseStatusCur$iv);
        long id$iv = s$iv / ((long) BufferedChannelKt.SEGMENT_SIZE);
        int i$iv = (int) (s$iv % ((long) BufferedChannelKt.SEGMENT_SIZE));
        if (segment$iv.id == id$iv) goto L12;
        ChannelSegment r14 = access$findSegmentSend(this, id$iv, segment$iv);
        if (r14 == null) goto L7;
        segment$iv = r14;
        goto L12
    L7:
        if (closed$iv == false) goto L3;
        onClosedSelectOnSend(r20, r19);
        return;
    L12:
        switch(access$updateCellSend(this, segment$iv, i$iv, r3, s$iv, r19, closed$iv)) {
            case 0: goto L32;
            case 1: goto L31;
            case 2: goto L22;
            case 3: goto L20;
            case 4: goto L16;
            case 5: goto L14;
            default: goto L34;
        };
    L14:
        segment$iv.cleanPrev();
    L34:
        r3 = r3;
        goto L3
    L16:
        if (s$iv >= getReceiversCounter$kotlinx_coroutines_core()) goto L18;
        segment$iv.cleanPrev();
    L18:
        onClosedSelectOnSend(r20, r19);
        return;
    L20:
        throw new IllegalStateException("unexpected".toString());
    L22:
        if (closed$iv == false) goto L25;
        segment$iv.onSlotCleaned();
        onClosedSelectOnSend(r20, r19);
        return;
    L25:
        if ((r19 instanceof Waiter) == false) goto L27;
        Waiter r4 = (Waiter) r19;
    L28:
        if (r4 == null) goto L50;
        access$prepareSenderForSuspension(this, r4, segment$iv, i$iv);
    L50:
        return;
    L27:
        r4 = null;
        goto L28
    L31:
        r19.selectInRegistrationPhase(Unit.INSTANCE);
        return;
    L32:
        segment$iv.cleanPrev();
        r19.selectInRegistrationPhase(Unit.INSTANCE);
    }

    private final void onClosedSelectOnSend(E r3, SelectInstance<?> r4) {
        Function1<E, Unit> r0 = this.onUndeliveredElement;
        if (r0 == null) goto L5;
        OnUndeliveredElementKt.callUndeliveredElement(r0, r3, r4.getContext());
    L5:
        r4.selectInRegistrationPhase(BufferedChannelKt.getCHANNEL_CLOSED());
    }

    private final Object processResultSelectSend(Object ignoredParam, Object selectResult) {
        if (selectResult == BufferedChannelKt.getCHANNEL_CLOSED()) goto L6;
        return this;
    L6:
        throw getSendException();
    }

    @Override // kotlinx.coroutines.channels.ReceiveChannel
    public SelectClause1<E> getOnReceive() {
        BufferedChannel$onReceive$1 r1 = BufferedChannel$onReceive$1.INSTANCE;
        Intrinsics.checkNotNull(r1, "null cannot be cast to non-null type kotlin.Function3<@[ParameterName(name = 'clauseObject')] kotlin.Any, @[ParameterName(name = 'select')] kotlinx.coroutines.selects.SelectInstance<*>, @[ParameterName(name = 'param')] kotlin.Any?, kotlin.Unit>{ kotlinx.coroutines.selects.SelectKt.RegistrationFunction }");
        Function3 r2 = (Function3) TypeIntrinsics.beforeCheckcastToFunctionOfArity(r1, 3);
        BufferedChannel$onReceive$2 r3 = BufferedChannel$onReceive$2.INSTANCE;
        Intrinsics.checkNotNull(r3, "null cannot be cast to non-null type kotlin.Function3<@[ParameterName(name = 'clauseObject')] kotlin.Any, @[ParameterName(name = 'param')] kotlin.Any?, @[ParameterName(name = 'clauseResult')] kotlin.Any?, kotlin.Any?>{ kotlinx.coroutines.selects.SelectKt.ProcessResultFunction }");
        return new SelectClause1Impl(this, r2, (Function3) TypeIntrinsics.beforeCheckcastToFunctionOfArity(r3, 3), this.onUndeliveredElementReceiveCancellationConstructor);
    }

    @Override // kotlinx.coroutines.channels.ReceiveChannel
    public SelectClause1<ChannelResult<E>> getOnReceiveCatching() {
        BufferedChannel$onReceiveCatching$1 r1 = BufferedChannel$onReceiveCatching$1.INSTANCE;
        Intrinsics.checkNotNull(r1, "null cannot be cast to non-null type kotlin.Function3<@[ParameterName(name = 'clauseObject')] kotlin.Any, @[ParameterName(name = 'select')] kotlinx.coroutines.selects.SelectInstance<*>, @[ParameterName(name = 'param')] kotlin.Any?, kotlin.Unit>{ kotlinx.coroutines.selects.SelectKt.RegistrationFunction }");
        Function3 r2 = (Function3) TypeIntrinsics.beforeCheckcastToFunctionOfArity(r1, 3);
        BufferedChannel$onReceiveCatching$2 r3 = BufferedChannel$onReceiveCatching$2.INSTANCE;
        Intrinsics.checkNotNull(r3, "null cannot be cast to non-null type kotlin.Function3<@[ParameterName(name = 'clauseObject')] kotlin.Any, @[ParameterName(name = 'param')] kotlin.Any?, @[ParameterName(name = 'clauseResult')] kotlin.Any?, kotlin.Any?>{ kotlinx.coroutines.selects.SelectKt.ProcessResultFunction }");
        return new SelectClause1Impl(this, r2, (Function3) TypeIntrinsics.beforeCheckcastToFunctionOfArity(r3, 3), this.onUndeliveredElementReceiveCancellationConstructor);
    }

    @Override // kotlinx.coroutines.channels.ReceiveChannel
    public SelectClause1<E> getOnReceiveOrNull() {
        BufferedChannel$onReceiveOrNull$1 r1 = BufferedChannel$onReceiveOrNull$1.INSTANCE;
        Intrinsics.checkNotNull(r1, "null cannot be cast to non-null type kotlin.Function3<@[ParameterName(name = 'clauseObject')] kotlin.Any, @[ParameterName(name = 'select')] kotlinx.coroutines.selects.SelectInstance<*>, @[ParameterName(name = 'param')] kotlin.Any?, kotlin.Unit>{ kotlinx.coroutines.selects.SelectKt.RegistrationFunction }");
        Function3 r2 = (Function3) TypeIntrinsics.beforeCheckcastToFunctionOfArity(r1, 3);
        BufferedChannel$onReceiveOrNull$2 r3 = BufferedChannel$onReceiveOrNull$2.INSTANCE;
        Intrinsics.checkNotNull(r3, "null cannot be cast to non-null type kotlin.Function3<@[ParameterName(name = 'clauseObject')] kotlin.Any, @[ParameterName(name = 'param')] kotlin.Any?, @[ParameterName(name = 'clauseResult')] kotlin.Any?, kotlin.Any?>{ kotlinx.coroutines.selects.SelectKt.ProcessResultFunction }");
        return new SelectClause1Impl(this, r2, (Function3) TypeIntrinsics.beforeCheckcastToFunctionOfArity(r3, 3), this.onUndeliveredElementReceiveCancellationConstructor);
    }

    private final void registerSelectForReceive(SelectInstance<?> r12, Object ignoredParam) {
        ChannelSegment segment$iv = (ChannelSegment) access$getReceiveSegment$volatile$FU().get(this);
    L4:
        if (isClosedForReceive() == true) goto L5;
        long r$iv = access$getReceivers$volatile$FU().getAndIncrement(this);
        long id$iv = r$iv / ((long) BufferedChannelKt.SEGMENT_SIZE);
        int i$iv = (int) (r$iv % ((long) BufferedChannelKt.SEGMENT_SIZE));
        if (segment$iv.id == id$iv) goto L12;
        ChannelSegment segment$iv2 = access$findSegmentReceive(this, id$iv, segment$iv);
        if (segment$iv2 == null) goto L4;
        ChannelSegment segment$iv3 = segment$iv2;
    L13:
        SelectInstance<?> r8 = r12;
        Object updCellResult$iv = access$updateCellReceive(this, segment$iv3, i$iv, r$iv, r8);
        if (updCellResult$iv == BufferedChannelKt.access$getSUSPEND$p()) goto L16;
        if (updCellResult$iv != BufferedChannelKt.access$getFAILED$p()) goto L29;
        if (r$iv >= getSendersCounter$kotlinx_coroutines_core()) goto L27;
        segment$iv3.cleanPrev();
    L27:
        segment$iv = segment$iv3;
        r12 = r8;
        goto L4
    L29:
        if (updCellResult$iv == BufferedChannelKt.access$getSUSPEND_NO_WAITER$p()) goto L34;
        segment$iv3.cleanPrev();
        r8.selectInRegistrationPhase(updCellResult$iv);
        return;
    L34:
        throw new IllegalStateException("unexpected".toString());
    L16:
        if ((r8 instanceof Waiter) == false) goto L18;
        Waiter r1 = (Waiter) r8;
    L19:
        if (r1 == null) goto L44;
        access$prepareReceiverForSuspension(this, r1, segment$iv3, i$iv);
    L44:
        return;
    L18:
        r1 = null;
        goto L19
    L12:
        segment$iv3 = segment$iv;
        goto L13
    L5:
        onClosedSelectOnReceive(r12);
    }

    private final void onClosedSelectOnReceive(SelectInstance<?> r2) {
        r2.selectInRegistrationPhase(BufferedChannelKt.getCHANNEL_CLOSED());
    }

    private final Object processResultSelectReceive(Object ignoredParam, Object selectResult) {
        if (selectResult == BufferedChannelKt.getCHANNEL_CLOSED()) goto L6;
        return selectResult;
    L6:
        throw getReceiveException();
    }

    private final Object processResultSelectReceiveOrNull(Object ignoredParam, Object selectResult) {
        if (selectResult != BufferedChannelKt.getCHANNEL_CLOSED()) goto L10;
        if (getCloseCause() != null) goto L8;
        return null;
    L8:
        throw getReceiveException();
    L10:
        return selectResult;
    }

    private final Object processResultSelectReceiveCatching(Object ignoredParam, Object selectResult) {
        if (selectResult != BufferedChannelKt.getCHANNEL_CLOSED()) goto L5;
        Object r0 = ChannelResult.Companion.m8939closedJP2dKIU(getCloseCause());
    L7:
        return ChannelResult.m8926boximpl(r0);
    L5:
        r0 = ChannelResult.Companion.m8941successJP2dKIU(selectResult);
        goto L7
    }

    @Override // kotlinx.coroutines.channels.ReceiveChannel
    public ChannelIterator<E> iterator() {
        return new BufferedChannelIterator(this);
    }

    protected final Throwable getCloseCause() {
        return (Throwable) get_closeCause$volatile$FU().get(this);
    }

    protected final Throwable getSendException() {
        Throwable r0 = getCloseCause();
        if (r0 == null) goto L5;
        return r0;
    L5:
        return new ClosedSendChannelException(ChannelsKt.DEFAULT_CLOSE_MESSAGE);
    }

    private final Throwable getReceiveException() {
        Throwable r0 = getCloseCause();
        if (r0 == null) goto L5;
        return r0;
    L5:
        return new ClosedReceiveChannelException(ChannelsKt.DEFAULT_CLOSE_MESSAGE);
    }

    protected void onClosedIdempotent() {
    }

    @Override // kotlinx.coroutines.channels.SendChannel
    public boolean close(Throwable cause) {
        return closeOrCancelImpl(cause, false);
    }

    @Override // kotlinx.coroutines.channels.ReceiveChannel
    public final boolean cancel(Throwable cause) {
        return cancelImpl$kotlinx_coroutines_core(cause);
    }

    @Override // kotlinx.coroutines.channels.ReceiveChannel
    public final void cancel() {
        cancelImpl$kotlinx_coroutines_core(null);
    }

    @Override // kotlinx.coroutines.channels.ReceiveChannel
    public final void cancel(CancellationException cause) {
        cancelImpl$kotlinx_coroutines_core(cause);
    }

    public boolean cancelImpl$kotlinx_coroutines_core(Throwable cause) {
        if (cause != null) goto L4;
        CancellationException r0 = new CancellationException("Channel was cancelled");
    L6:
        return closeOrCancelImpl(r0, true);
    L4:
        r0 = cause;
        goto L6
    }

    protected boolean closeOrCancelImpl(Throwable cause, boolean cancel) {
        if (cancel == false) goto L4;
        markCancellationStarted();
    L4:
        boolean closedByThisOperation = AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(get_closeCause$volatile$FU(), this, BufferedChannelKt.access$getNO_CLOSE_CAUSE$p(), cause);
        if (cancel == false) goto L7;
        markCancelled();
    L8:
        completeCloseOrCancel();
        onClosedIdempotent();
        if (closedByThisOperation == false) goto L12;
        invokeCloseHandler();
    L12:
        return closedByThisOperation;
    L7:
        markClosed();
        goto L8
    }

    private final void invokeCloseHandler() {
        AtomicReferenceFieldUpdater handler$atomicfu$iv = getCloseHandler$volatile$FU();
    L3:
        Object closeHandler = handler$atomicfu$iv.get(this);
        if (closeHandler != null) goto L6;
        Symbol r5 = BufferedChannelKt.access$getCLOSE_HANDLER_CLOSED$p();
    L8:
        if (AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(handler$atomicfu$iv, this, closeHandler, r5) == false) goto L3;
        if (closeHandler != null) goto L11;
        return;
    L11:
        Function1 r0 = (Function1) TypeIntrinsics.beforeCheckcastToFunctionOfArity(closeHandler, 1);
        ((Function1) closeHandler).invoke(getCloseCause());
        return;
    L6:
        r5 = BufferedChannelKt.access$getCLOSE_HANDLER_INVOKED$p();
        goto L8
    }

    @Override // kotlinx.coroutines.channels.SendChannel
    public void invokeOnClose(Function1<? super Throwable, Unit> r8) {
        if (AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(getCloseHandler$volatile$FU(), this, null, r8) == false) goto L5;
        return;
    L5:
        AtomicReferenceFieldUpdater handler$atomicfu$iv = getCloseHandler$volatile$FU();
    L6:
        Object cur = handler$atomicfu$iv.get(this);
        if (cur != BufferedChannelKt.access$getCLOSE_HANDLER_CLOSED$p()) goto L14;
        if (AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(getCloseHandler$volatile$FU(), this, BufferedChannelKt.access$getCLOSE_HANDLER_CLOSED$p(), BufferedChannelKt.access$getCLOSE_HANDLER_INVOKED$p()) == false) goto L6;
        r8.invoke(getCloseCause());
        return;
    L14:
        if (cur != BufferedChannelKt.access$getCLOSE_HANDLER_INVOKED$p()) goto L18;
        throw new IllegalStateException("Another handler was already registered and successfully invoked".toString());
    L18:
        throw new IllegalStateException(("Another handler is already registered: " + cur).toString());
    }

    private final void markClosed() {
        AtomicLongFieldUpdater handler$atomicfu$iv = getSendersAndCloseStatus$volatile$FU();
    L3:
        long cur = handler$atomicfu$iv.get(this);
        switch(((int) (cur >> 60))) {
            case 0: goto L7;
            case 1: goto L6;
            default: goto L5;
        };
    L6:
        long cur2 = BufferedChannelKt.access$constructSendersAndCloseStatus(cur & 1152921504606846975L, 3);
    L9:
        if (handler$atomicfu$iv.compareAndSet(this, cur, cur2) == false) goto L3;
        return;
    L7:
        cur2 = BufferedChannelKt.access$constructSendersAndCloseStatus(cur & 1152921504606846975L, 2);
        goto L9
    }

    private final void markCancelled() {
        AtomicLongFieldUpdater handler$atomicfu$iv = getSendersAndCloseStatus$volatile$FU();
    L3:
        long cur = handler$atomicfu$iv.get(this);
        long $this$sendersCounter$iv = cur & 1152921504606846975L;
        if (handler$atomicfu$iv.compareAndSet(this, cur, BufferedChannelKt.access$constructSendersAndCloseStatus($this$sendersCounter$iv, 3)) == false) goto L3;
    }

    private final void markCancellationStarted() {
        AtomicLongFieldUpdater handler$atomicfu$iv = getSendersAndCloseStatus$volatile$FU();
    L3:
        long cur = handler$atomicfu$iv.get(this);
        if (((int) (cur >> 60)) != 0) goto L8;
        long $this$sendersCounter$iv = cur & 1152921504606846975L;
        if (handler$atomicfu$iv.compareAndSet(this, cur, BufferedChannelKt.access$constructSendersAndCloseStatus($this$sendersCounter$iv, 1)) == false) goto L3;
        return;
    }

    private final void completeCloseOrCancel() {
        isClosedForSend();
    }

    protected boolean isConflatedDropOldest() {
        return false;
    }

    private final ChannelSegment<E> completeClose(long sendersCur) {
        ChannelSegment<E> r0 = closeLinkedList();
        if (isConflatedDropOldest() == false) goto L7;
        long lastBufferedCellGlobalIndex = markAllEmptyCellsAsClosed(r0);
        if (lastBufferedCellGlobalIndex == (-1)) goto L7;
        dropFirstElementUntilTheSpecifiedCellIsInTheBuffer(lastBufferedCellGlobalIndex);
    L7:
        cancelSuspendedReceiveRequests(r0, sendersCur);
        return r0;
    }

    private final void completeCancel(long sendersCur) {
        removeUnprocessedElements(completeClose(sendersCur));
    }

    private final ChannelSegment<E> closeLinkedList() {
        Object lastSegment = getBufferEndSegment$volatile$FU().get(this);
        ChannelSegment it = (ChannelSegment) getSendSegment$volatile$FU().get(this);
        if (it.id <= ((ChannelSegment) lastSegment).id) goto L5;
        lastSegment = it;
    L5:
        ChannelSegment it2 = (ChannelSegment) getReceiveSegment$volatile$FU().get(this);
        if (it2.id <= ((ChannelSegment) lastSegment).id) goto L9;
        lastSegment = it2;
    L9:
        return (ChannelSegment) ConcurrentLinkedListKt.close((ConcurrentLinkedListNode) lastSegment);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final long markAllEmptyCellsAsClosed(ChannelSegment<E> r9) {
        ChannelSegment<E> r0 = r9;
    L3:
        int index = BufferedChannelKt.SEGMENT_SIZE;
    L4:
        index = index - 1;
        if ((-1) >= index) goto L22;
        long globalIndex = (r0.id * ((long) BufferedChannelKt.SEGMENT_SIZE)) + ((long) index);
        if (globalIndex < getReceiversCounter$kotlinx_coroutines_core()) goto L8;
    L9:
        Object state = r0.getState$kotlinx_coroutines_core(index);
        if (state == null) goto L19;
        if (state == BufferedChannelKt.access$getIN_BUFFER$p()) goto L19;
        if (state != BufferedChannelKt.BUFFERED) goto L4;
        return globalIndex;
    L19:
        if (r0.casState$kotlinx_coroutines_core(index, state, BufferedChannelKt.getCHANNEL_CLOSED()) == false) goto L9;
        r0.onSlotCleaned();
        goto L4
    L8:
        return -1;
    L22:
        ChannelSegment<E> r1 = (ChannelSegment) r0.getPrev();
        if (r1 == null) goto L24;
        r0 = r1;
        goto L3
    L24:
        return -1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void removeUnprocessedElements(ChannelSegment<E> r13) {
        Function1<E, Unit> r0 = this.onUndeliveredElement;
        UndeliveredElementException undeliveredElementException = null;
        Object suspendedSenders = InlineList.m8961constructorimpl$default(null, 1, null);
        ChannelSegment<E> r4 = r13;
    L3:
        int index = BufferedChannelKt.SEGMENT_SIZE - 1;
    L5:
        if ((-1) >= index) goto L50;
        long globalIndex = (r4.id * ((long) BufferedChannelKt.SEGMENT_SIZE)) + ((long) index);
    L7:
        Object state = r4.getState$kotlinx_coroutines_core(index);
        if (state == BufferedChannelKt.access$getDONE_RCV$p()) goto L53;
        if (state == BufferedChannelKt.BUFFERED) goto L12;
        if (state == BufferedChannelKt.access$getIN_BUFFER$p()) goto L47;
        if (state == null) goto L47;
        if ((state instanceof Waiter) == true) goto L36;
        if ((state instanceof WaiterEB) == true) goto L36;
        if (state == BufferedChannelKt.access$getRESUMING_BY_EB$p()) goto L53;
        if (state == BufferedChannelKt.access$getRESUMING_BY_RCV$p()) goto L53;
        if (state == BufferedChannelKt.access$getRESUMING_BY_EB$p()) goto L7;
    L49:
        index = index - 1;
    L36:
        if (globalIndex < getReceiversCounter$kotlinx_coroutines_core()) goto L53;
        if ((state instanceof WaiterEB) == false) goto L40;
        Waiter sender = ((WaiterEB) state).waiter;
    L42:
        if (r4.casState$kotlinx_coroutines_core(index, state, BufferedChannelKt.getCHANNEL_CLOSED()) == false) goto L7;
        if (r0 == null) goto L45;
        Object element = r4.getElement$kotlinx_coroutines_core(index);
        undeliveredElementException = OnUndeliveredElementKt.callUndeliveredElementCatchingException(r0, element, undeliveredElementException);
    L45:
        suspendedSenders = InlineList.m8966plusFjFbRPM(suspendedSenders, sender);
        r4.cleanElement$kotlinx_coroutines_core(index);
        r4.onSlotCleaned();
        goto L49
    L40:
        sender = (Waiter) state;
    L47:
        if (r4.casState$kotlinx_coroutines_core(index, state, BufferedChannelKt.getCHANNEL_CLOSED()) == false) goto L7;
        r4.onSlotCleaned();
        goto L49
    L12:
        if (globalIndex < getReceiversCounter$kotlinx_coroutines_core()) goto L53;
        if (r4.casState$kotlinx_coroutines_core(index, state, BufferedChannelKt.getCHANNEL_CLOSED()) == false) goto L7;
        if (r0 == null) goto L17;
        Object element2 = r4.getElement$kotlinx_coroutines_core(index);
        undeliveredElementException = OnUndeliveredElementKt.callUndeliveredElementCatchingException(r0, element2, undeliveredElementException);
    L17:
        r4.cleanElement$kotlinx_coroutines_core(index);
        r4.onSlotCleaned();
    L53:
        if (suspendedSenders != null) goto L55;
    L61:
        if (undeliveredElementException != null) goto L63;
        return;
    L63:
        UndeliveredElementException it = undeliveredElementException;
        throw it;
    L55:
        if ((suspendedSenders instanceof ArrayList) == true) goto L57;
        Waiter it2 = (Waiter) suspendedSenders;
        resumeSenderOnCancelledChannel(it2);
        goto L61
    L57:
        Intrinsics.checkNotNull(suspendedSenders, "null cannot be cast to non-null type java.util.ArrayList<E of kotlinx.coroutines.internal.InlineList>{ kotlin.collections.TypeAliasesKt.ArrayList<E of kotlinx.coroutines.internal.InlineList> }");
        ArrayList list$iv = (ArrayList) suspendedSenders;
        int i$iv = list$iv.size() - 1;
    L58:
        if ((-1) >= i$iv) goto L61;
        Waiter it3 = (Waiter) list$iv.get(i$iv);
        resumeSenderOnCancelledChannel(it3);
        i$iv = i$iv - 1;
        goto L58
    L50:
        ChannelSegment<E> r5 = (ChannelSegment) r4.getPrev();
        if (r5 == null) goto L53;
        r4 = r5;
        goto L3
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void cancelSuspendedReceiveRequests(ChannelSegment<E> r10, long sendersCounter) {
        Object suspendedReceivers = InlineList.m8961constructorimpl$default(null, 1, null);
        ChannelSegment<E> r2 = r10;
    L4:
        if (r2 == null) goto L32;
        int index = BufferedChannelKt.SEGMENT_SIZE - 1;
    L6:
        if ((-1) >= index) goto L30;
        if (((r2.id * ((long) BufferedChannelKt.SEGMENT_SIZE)) + ((long) index)) < sendersCounter) goto L32;
    L10:
        Object state = r2.getState$kotlinx_coroutines_core(index);
        if (state == null) goto L27;
        if (state == BufferedChannelKt.access$getIN_BUFFER$p()) goto L27;
        if ((state instanceof WaiterEB) == true) goto L18;
        if ((state instanceof Waiter) == false) goto L29;
        if (r2.casState$kotlinx_coroutines_core(index, state, BufferedChannelKt.getCHANNEL_CLOSED()) == false) goto L10;
        suspendedReceivers = InlineList.m8966plusFjFbRPM(suspendedReceivers, state);
        r2.onCancelledRequest(index, true);
    L29:
        index = index - 1;
        goto L6
    L18:
        if (r2.casState$kotlinx_coroutines_core(index, state, BufferedChannelKt.getCHANNEL_CLOSED()) == false) goto L10;
        suspendedReceivers = InlineList.m8966plusFjFbRPM(suspendedReceivers, ((WaiterEB) state).waiter);
        r2.onCancelledRequest(index, true);
    L27:
        if (r2.casState$kotlinx_coroutines_core(index, state, BufferedChannelKt.getCHANNEL_CLOSED()) == false) goto L10;
        r2.onSlotCleaned();
        goto L29
    L30:
        r2 = (ChannelSegment) r2.getPrev();
    L32:
        if (suspendedReceivers != null) goto L34;
        return;
    L34:
        if ((suspendedReceivers instanceof ArrayList) == true) goto L36;
        Waiter it = (Waiter) suspendedReceivers;
        resumeReceiverOnClosedChannel(it);
        return;
    L36:
        Intrinsics.checkNotNull(suspendedReceivers, "null cannot be cast to non-null type java.util.ArrayList<E of kotlinx.coroutines.internal.InlineList>{ kotlin.collections.TypeAliasesKt.ArrayList<E of kotlinx.coroutines.internal.InlineList> }");
        ArrayList list$iv = (ArrayList) suspendedReceivers;
        int i$iv = list$iv.size() - 1;
    L37:
        if ((-1) >= i$iv) goto L62;
        Waiter it2 = (Waiter) list$iv.get(i$iv);
        resumeReceiverOnClosedChannel(it2);
        i$iv = i$iv - 1;
        goto L37
    }

    private final void resumeReceiverOnClosedChannel(Waiter $this$resumeReceiverOnClosedChannel) {
        resumeWaiterOnClosedChannel($this$resumeReceiverOnClosedChannel, true);
    }

    private final void resumeSenderOnCancelledChannel(Waiter $this$resumeSenderOnCancelledChannel) {
        resumeWaiterOnClosedChannel($this$resumeSenderOnCancelledChannel, false);
    }

    private final void resumeWaiterOnClosedChannel(Waiter $this$resumeWaiterOnClosedChannel, boolean receiver) {
        if (($this$resumeWaiterOnClosedChannel instanceof SendBroadcast) == false) goto L6;
        CancellableContinuation<Boolean> r0 = ((SendBroadcast) $this$resumeWaiterOnClosedChannel).getCont();
        Result.Companion r1 = Result.Companion;
        r0.resumeWith(Result.m7425constructorimpl(false));
        return;
    L6:
        if (($this$resumeWaiterOnClosedChannel instanceof CancellableContinuation) == false) goto L13;
        Continuation r2 = (Continuation) $this$resumeWaiterOnClosedChannel;
        Result.Companion r3 = Result.Companion;
        if (receiver == false) goto L10;
        Throwable r4 = getReceiveException();
    L11:
        r2.resumeWith(Result.m7425constructorimpl(ResultKt.createFailure(r4)));
        return;
    L10:
        r4 = getSendException();
        goto L11
    L13:
        if (($this$resumeWaiterOnClosedChannel instanceof ReceiveCatching) == false) goto L16;
        CancellableContinuationImpl<ChannelResult<? extends E>> r5 = ((ReceiveCatching) $this$resumeWaiterOnClosedChannel).cont;
        Result.Companion r6 = Result.Companion;
        r5.resumeWith(Result.m7425constructorimpl(ChannelResult.m8926boximpl(ChannelResult.Companion.m8939closedJP2dKIU(getCloseCause()))));
        return;
    L16:
        if (($this$resumeWaiterOnClosedChannel instanceof BufferedChannelIterator) == false) goto L19;
        ((BufferedChannelIterator) $this$resumeWaiterOnClosedChannel).tryResumeHasNextOnClosedChannel();
        return;
    L19:
        if (($this$resumeWaiterOnClosedChannel instanceof SelectInstance) == false) goto L23;
        ((SelectInstance) $this$resumeWaiterOnClosedChannel).trySelect(this, BufferedChannelKt.getCHANNEL_CLOSED());
        return;
    L23:
        throw new IllegalStateException(("Unexpected waiter: " + $this$resumeWaiterOnClosedChannel).toString());
    }

    @Override // kotlinx.coroutines.channels.SendChannel
    public boolean isClosedForSend() {
        return isClosedForSend0(getSendersAndCloseStatus$volatile$FU().get(this));
    }

    private final boolean isClosedForSend0(long $this$isClosedForSend0) {
        return isClosed($this$isClosedForSend0, false);
    }

    @Override // kotlinx.coroutines.channels.ReceiveChannel
    public boolean isClosedForReceive() {
        return isClosedForReceive0(getSendersAndCloseStatus$volatile$FU().get(this));
    }

    private final boolean isClosedForReceive0(long $this$isClosedForReceive0) {
        return isClosed($this$isClosedForReceive0, true);
    }

    private final boolean isClosed(long sendersAndCloseStatusCur, boolean isClosedForReceive) {
        switch(((int) (sendersAndCloseStatusCur >> 60))) {
            case 0: goto L15;
            case 1: goto L19;
            case 2: goto L7;
            case 3: goto L6;
            default: goto L5;
        };
    L6:
        completeCancel(sendersAndCloseStatusCur & 1152921504606846975L);
        return true;
    L7:
        completeClose(sendersAndCloseStatusCur & 1152921504606846975L);
        if (isClosedForReceive == true) goto L10;
        return true;
    L10:
        if (hasElements$kotlinx_coroutines_core() == true) goto L18;
        return true;
    L18:
        return false;
    L5:
        throw new IllegalStateException(("unexpected close status: " + ((int) (sendersAndCloseStatusCur >> 60))).toString());
    L19:
        return false;
    L15:
        return false;
    }

    @Override // kotlinx.coroutines.channels.ReceiveChannel
    public boolean isEmpty() {
        if (isClosedForReceive() == false) goto L6;
        return false;
    L6:
        if (hasElements$kotlinx_coroutines_core() == false) goto L9;
        return false;
    L9:
        return !isClosedForReceive();
    }

    public final boolean hasElements$kotlinx_coroutines_core() {
    L2:
        ChannelSegment<E> r0 = (ChannelSegment) getReceiveSegment$volatile$FU().get(this);
        long r = getReceiversCounter$kotlinx_coroutines_core();
        long s = getSendersCounter$kotlinx_coroutines_core();
        if (s <= r) goto L4;
        long id = r / ((long) BufferedChannelKt.SEGMENT_SIZE);
        if (r0.id == id) goto L13;
        ChannelSegment<E> r1 = findSegmentReceive(id, r0);
        if (r1 == null) goto L10;
        r0 = r1;
        goto L13
    L10:
        if (((ChannelSegment) getReceiveSegment$volatile$FU().get(this)).id >= id) goto L2;
        return false;
    L13:
        r0.cleanPrev();
        int i = (int) (r % ((long) BufferedChannelKt.SEGMENT_SIZE));
        if (isCellNonEmpty(r0, i, r) == true) goto L15;
        getReceivers$volatile$FU().compareAndSet(this, r, 1 + r);
        goto L2
    L15:
        return true;
    L4:
        return false;
    }

    private final boolean isCellNonEmpty(ChannelSegment<E> r7, int index, long globalIndex) {
    L2:
        Object state = r7.getState$kotlinx_coroutines_core(index);
        if (state == null) goto L33;
        if (state == BufferedChannelKt.access$getIN_BUFFER$p()) goto L33;
        if (state != BufferedChannelKt.BUFFERED) goto L11;
        return true;
    L11:
        if (state != BufferedChannelKt.access$getINTERRUPTED_SEND$p()) goto L14;
        return false;
    L14:
        if (state != BufferedChannelKt.getCHANNEL_CLOSED()) goto L17;
        return false;
    L17:
        if (state != BufferedChannelKt.access$getDONE_RCV$p()) goto L20;
        return false;
    L20:
        if (state != BufferedChannelKt.access$getPOISONED$p()) goto L23;
        return false;
    L23:
        if (state != BufferedChannelKt.access$getRESUMING_BY_EB$p()) goto L26;
        return true;
    L26:
        if (state != BufferedChannelKt.access$getRESUMING_BY_RCV$p()) goto L29;
        return false;
    L29:
        if (globalIndex == getReceiversCounter$kotlinx_coroutines_core()) goto L31;
        return false;
    L31:
        return true;
    L33:
        if (r7.casState$kotlinx_coroutines_core(index, state, BufferedChannelKt.access$getPOISONED$p()) == false) goto L2;
        expandBuffer();
        return false;
    }

    private final ChannelSegment<E> findSegmentSend(long id, ChannelSegment<E> r15) {
        AtomicReferenceFieldUpdater handler$atomicfu$iv = getSendSegment$volatile$FU();
        Function2 createNewSegment$iv = (Function2) BufferedChannelKt.createSegmentFunction();
    L3:
        Object s$iv = ConcurrentLinkedListKt.findSegmentInternal(r15, id, createNewSegment$iv);
        boolean r4 = false;
        if (SegmentOrClosed.m8978isClosedimpl(s$iv) == true) goto L25;
        Segment to$iv$iv = SegmentOrClosed.m8976getSegmentimpl(s$iv);
    L6:
        Segment cur$iv$iv = (Segment) handler$atomicfu$iv.get(this);
        if (cur$iv$iv.id >= to$iv$iv.id) goto L8;
        if (to$iv$iv.tryIncPointers$kotlinx_coroutines_core() == false) goto L11;
        if (AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(handler$atomicfu$iv, this, cur$iv$iv, to$iv$iv) == true) goto L15;
        if (to$iv$iv.decPointers$kotlinx_coroutines_core() == false) goto L6;
        to$iv$iv.remove();
        goto L6
    L15:
        if (cur$iv$iv.decPointers$kotlinx_coroutines_core() == false) goto L17;
        cur$iv$iv.remove();
    L17:
        boolean r3 = true;
    L18:
        if (r3 == false) goto L3;
    L11:
        r3 = false;
        goto L18
    L8:
        r3 = true;
    L25:
        if (SegmentOrClosed.m8978isClosedimpl(s$iv) == false) goto L30;
        completeCloseOrCancel();
        if ((r15.id * ((long) BufferedChannelKt.SEGMENT_SIZE)) >= getReceiversCounter$kotlinx_coroutines_core()) goto L62;
        r15.cleanPrev();
        return null;
    L62:
        return null;
    L30:
        ChannelSegment<E> r1 = (ChannelSegment) SegmentOrClosed.m8976getSegmentimpl(s$iv);
        if (r1.id <= id) goto L37;
        updateSendersCounterIfLower(r1.id * ((long) BufferedChannelKt.SEGMENT_SIZE));
        if ((r1.id * ((long) BufferedChannelKt.SEGMENT_SIZE)) >= getReceiversCounter$kotlinx_coroutines_core()) goto L64;
        r1.cleanPrev();
        return null;
    L64:
        return null;
    L37:
        if (DebugKt.getASSERTIONS_ENABLED() == false) goto L47;
        if (r1.id != id) goto L41;
        r4 = true;
    L41:
        if (r4 == true) goto L47;
        throw new AssertionError();
    L47:
        return r1;
    }

    private final ChannelSegment<E> findSegmentReceive(long id, ChannelSegment<E> r19) {
        AtomicReferenceFieldUpdater handler$atomicfu$iv = getReceiveSegment$volatile$FU();
        Function2 createNewSegment$iv = (Function2) BufferedChannelKt.createSegmentFunction();
    L3:
        Object s$iv = ConcurrentLinkedListKt.findSegmentInternal(r19, id, createNewSegment$iv);
        if (SegmentOrClosed.m8978isClosedimpl(s$iv) == true) goto L25;
        Segment to$iv$iv = SegmentOrClosed.m8976getSegmentimpl(s$iv);
    L6:
        Segment cur$iv$iv = (Segment) handler$atomicfu$iv.get(this);
        if (cur$iv$iv.id >= to$iv$iv.id) goto L8;
        if (to$iv$iv.tryIncPointers$kotlinx_coroutines_core() == false) goto L11;
        if (AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(handler$atomicfu$iv, this, cur$iv$iv, to$iv$iv) == true) goto L15;
        if (to$iv$iv.decPointers$kotlinx_coroutines_core() == false) goto L6;
        to$iv$iv.remove();
        goto L6
    L15:
        if (cur$iv$iv.decPointers$kotlinx_coroutines_core() == false) goto L17;
        cur$iv$iv.remove();
    L17:
        boolean r7 = true;
    L18:
        if (r7 == false) goto L3;
    L11:
        r7 = false;
        goto L18
    L8:
        r7 = true;
    L25:
        if (SegmentOrClosed.m8978isClosedimpl(s$iv) == false) goto L30;
        completeCloseOrCancel();
        if ((r19.id * ((long) BufferedChannelKt.SEGMENT_SIZE)) >= getSendersCounter$kotlinx_coroutines_core()) goto L29;
        r19.cleanPrev();
    L29:
        return null;
    L30:
        ChannelSegment<E> r5 = (ChannelSegment) SegmentOrClosed.m8976getSegmentimpl(s$iv);
        if (isRendezvousOrUnlimited() == true) goto L50;
        if (id > (getBufferEndCounter() / ((long) BufferedChannelKt.SEGMENT_SIZE))) goto L50;
        AtomicReferenceFieldUpdater handler$atomicfu$iv2 = getBufferEndSegment$volatile$FU();
    L35:
        Segment cur$iv = (Segment) handler$atomicfu$iv2.get(this);
        if (cur$iv.id >= r5.id) goto L50;
        if (r5.tryIncPointers$kotlinx_coroutines_core() == false) goto L50;
        if (AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(handler$atomicfu$iv2, this, cur$iv, r5) == true) goto L42;
        if (r5.decPointers$kotlinx_coroutines_core() == false) goto L35;
        r5.remove();
        goto L35
    L42:
        if (cur$iv.decPointers$kotlinx_coroutines_core() == false) goto L50;
        cur$iv.remove();
    L50:
        if (r5.id <= id) goto L56;
        updateReceiversCounterIfLower(r5.id * ((long) BufferedChannelKt.SEGMENT_SIZE));
        if ((r5.id * ((long) BufferedChannelKt.SEGMENT_SIZE)) >= getSendersCounter$kotlinx_coroutines_core()) goto L54;
        r5.cleanPrev();
    L54:
        return null;
    L56:
        if (DebugKt.getASSERTIONS_ENABLED() == false) goto L67;
        if (r5.id != id) goto L60;
        boolean r8 = true;
    L61:
        if (r8 == true) goto L67;
        throw new AssertionError();
    L60:
        r8 = false;
    L67:
        return r5;
    }

    private final ChannelSegment<E> findSegmentBufferEnd(long id, ChannelSegment<E> r20, long currentBufferEndCounter) {
        AtomicReferenceFieldUpdater handler$atomicfu$iv = getBufferEndSegment$volatile$FU();
        Function2 createNewSegment$iv = (Function2) BufferedChannelKt.createSegmentFunction();
    L3:
        Object s$iv = ConcurrentLinkedListKt.findSegmentInternal(r20, id, createNewSegment$iv);
        boolean r5 = false;
        if (SegmentOrClosed.m8978isClosedimpl(s$iv) == true) goto L25;
        Segment to$iv$iv = SegmentOrClosed.m8976getSegmentimpl(s$iv);
    L6:
        Segment cur$iv$iv = (Segment) handler$atomicfu$iv.get(this);
        if (cur$iv$iv.id >= to$iv$iv.id) goto L8;
        if (to$iv$iv.tryIncPointers$kotlinx_coroutines_core() == false) goto L11;
        if (AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(handler$atomicfu$iv, this, cur$iv$iv, to$iv$iv) == true) goto L15;
        if (to$iv$iv.decPointers$kotlinx_coroutines_core() == false) goto L6;
        to$iv$iv.remove();
        goto L6
    L15:
        if (cur$iv$iv.decPointers$kotlinx_coroutines_core() == false) goto L17;
        cur$iv$iv.remove();
    L17:
        boolean r4 = true;
    L18:
        if (r4 == false) goto L3;
    L11:
        r4 = false;
        goto L18
    L8:
        r4 = true;
    L25:
        if (SegmentOrClosed.m8978isClosedimpl(s$iv) == false) goto L27;
        completeCloseOrCancel();
        moveSegmentBufferEndToSpecifiedOrLast(id, r20);
        incCompletedExpandBufferAttempts$default(this, 0, 1, null);
        return null;
    L27:
        ChannelSegment<E> r14 = (ChannelSegment) SegmentOrClosed.m8976getSegmentimpl(s$iv);
        if (r14.id <= id) goto L35;
        if (getBufferEnd$volatile$FU().compareAndSet(this, currentBufferEndCounter + 1, r14.id * ((long) BufferedChannelKt.SEGMENT_SIZE)) == false) goto L32;
        incCompletedExpandBufferAttempts((r14.id * ((long) BufferedChannelKt.SEGMENT_SIZE)) - currentBufferEndCounter);
        return null;
    L32:
        incCompletedExpandBufferAttempts$default(this, 0, 1, null);
        return null;
    L35:
        if (DebugKt.getASSERTIONS_ENABLED() == false) goto L45;
        if (r14.id != id) goto L39;
        r5 = true;
    L39:
        if (r5 == true) goto L45;
        throw new AssertionError();
    L45:
        return r14;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void moveSegmentBufferEndToSpecifiedOrLast(long id, ChannelSegment<E> r11) {
        ChannelSegment<E> r0 = r11;
    L4:
        if (r0.id >= id) goto L11;
        ChannelSegment<E> r1 = (ChannelSegment) r0.getNext();
        if (r1 == null) goto L11;
        r0 = r1;
    L11:
        if (r0.isRemoved() == false) goto L16;
        ChannelSegment<E> r2 = (ChannelSegment) r0.getNext();
        if (r2 == null) goto L16;
        r0 = r2;
    L16:
        AtomicReferenceFieldUpdater handler$atomicfu$iv = getBufferEndSegment$volatile$FU();
    L17:
        Segment cur$iv = (Segment) handler$atomicfu$iv.get(this);
        boolean r5 = true;
        if (cur$iv.id >= r0.id) goto L29;
        if (r0.tryIncPointers$kotlinx_coroutines_core() == false) goto L22;
        if (AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(handler$atomicfu$iv, this, cur$iv, r0) == true) goto L26;
        if (r0.decPointers$kotlinx_coroutines_core() == false) goto L17;
        r0.remove();
        goto L17
    L26:
        if (cur$iv.decPointers$kotlinx_coroutines_core() == false) goto L29;
        cur$iv.remove();
        goto L29
    L22:
        r5 = false;
    L29:
        if (r5 == false) goto L11;
    }

    private final void updateSendersCounterIfLower(long value) {
        AtomicLongFieldUpdater handler$atomicfu$iv = getSendersAndCloseStatus$volatile$FU();
    L3:
        long cur = handler$atomicfu$iv.get(this);
        long $this$sendersCounter$iv = cur & 1152921504606846975L;
        if ($this$sendersCounter$iv >= value) goto L5;
        long update = BufferedChannelKt.access$constructSendersAndCloseStatus($this$sendersCounter$iv, (int) (cur >> 60));
        if (getSendersAndCloseStatus$volatile$FU().compareAndSet(this, cur, update) == false) goto L3;
        return;
    }

    private final void updateReceiversCounterIfLower(long value) {
        AtomicLongFieldUpdater handler$atomicfu$iv = getReceivers$volatile$FU();
    L3:
        long cur = handler$atomicfu$iv.get(this);
        if (cur >= value) goto L5;
        long value2 = value;
        if (getReceivers$volatile$FU().compareAndSet(this, cur, value2) == true) goto L8;
        value = value2;
        goto L3
    L8:
        return;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public String toString() {
        BufferedChannel<E> r0 = this;
        StringBuilder sb = new StringBuilder();
        long $this$sendersCloseStatus$iv = getSendersAndCloseStatus$volatile$FU().get(r0);
        switch(((int) ($this$sendersCloseStatus$iv >> 60))) {
            case 2: goto L6;
            case 3: goto L5;
            default: goto L7;
        };
    L5:
        sb.append("cancelled,");
        goto L7
    L6:
        sb.append("closed,");
    L7:
        sb.append("capacity=" + r0.capacity + ',');
        sb.append("data=[");
        boolean r6 = true;
        Iterable $this$filter$iv = CollectionsKt.listOf(new ChannelSegment[]{getReceiveSegment$volatile$FU().get(r0), getSendSegment$volatile$FU().get(r0), getBufferEndSegment$volatile$FU().get(r0)});
        ArrayList r7 = new ArrayList();
        Iterator r10 = $this$filter$iv.iterator();
    L9:
        if (r10.hasNext() == false) goto L16;
        Object element$iv$iv = r10.next();
        ChannelSegment it = (ChannelSegment) element$iv$iv;
        if (it == BufferedChannelKt.access$getNULL_SEGMENT$p()) goto L13;
        boolean r12 = true;
    L14:
        if (r12 == false) goto L9;
        r7.add(element$iv$iv);
        goto L9
    L13:
        r12 = false;
        goto L14
    L16:
        ArrayList $this$minBy$iv = r7;
        Iterator iterator$iv = $this$minBy$iv.iterator();
        if (iterator$iv.hasNext() == false) goto L112;
        Object minElem$iv = iterator$iv.next();
        if (iterator$iv.hasNext() == false) goto L27;
        ChannelSegment it2 = (ChannelSegment) minElem$iv;
        long minValue$iv = it2.id;
    L22:
        Object e$iv = iterator$iv.next();
        ChannelSegment it3 = (ChannelSegment) e$iv;
        long v$iv = it3.id;
        if (minValue$iv <= v$iv) goto L26;
        minElem$iv = e$iv;
        minValue$iv = v$iv;
    L26:
        if (iterator$iv.hasNext() == false) goto L27;
        r0 = this;
    L27:
        ChannelSegment firstSegment = (ChannelSegment) minElem$iv;
        long r = r0.getReceiversCounter$kotlinx_coroutines_core();
        long s = r0.getSendersCounter$kotlinx_coroutines_core();
        ChannelSegment segment = firstSegment;
    L28:
        int i = 0;
        int r5 = BufferedChannelKt.SEGMENT_SIZE;
    L29:
        if (i >= r5) goto L102;
        boolean r15 = r6;
        int r9 = r5;
        long globalCellIndex = (segment.id * ((long) BufferedChannelKt.SEGMENT_SIZE)) + ((long) i);
        if (globalCellIndex >= s) goto L33;
    L36:
        Object cellState = segment.getState$kotlinx_coroutines_core(i);
        Object element = segment.getElement$kotlinx_coroutines_core(i);
        if ((cellState instanceof CancellableContinuation) == false) goto L50;
        if (globalCellIndex >= r) goto L44;
        if (globalCellIndex < s) goto L44;
        String cellStateString = "receive";
    L98:
        if (element == null) goto L100;
        sb.append('(' + cellStateString + ',' + element + "),");
    L101:
        i = i + 1;
        r5 = r9;
        r6 = r15;
        goto L29
    L100:
        sb.append(cellStateString + ',');
    L44:
        if (globalCellIndex < s) goto L46;
    L48:
        cellStateString = "cont";
        goto L98
    L46:
        if (globalCellIndex < r) goto L48;
        cellStateString = "send";
        goto L98
    L50:
        if ((cellState instanceof SelectInstance) == false) goto L63;
        if (globalCellIndex >= r) goto L57;
        if (globalCellIndex < s) goto L57;
        cellStateString = "onReceive";
    L57:
        if (globalCellIndex < s) goto L59;
    L61:
        cellStateString = "select";
        goto L98
    L59:
        if (globalCellIndex < r) goto L61;
        cellStateString = "onSend";
        goto L98
    L63:
        if ((cellState instanceof ReceiveCatching) == false) goto L66;
        cellStateString = "receiveCatching";
        goto L98
    L66:
        if ((cellState instanceof SendBroadcast) == false) goto L69;
        cellStateString = "sendBroadcast";
        goto L98
    L69:
        if ((cellState instanceof WaiterEB) == false) goto L72;
        cellStateString = "EB(" + cellState + ')';
        goto L98
    L72:
        if (Intrinsics.areEqual(cellState, BufferedChannelKt.access$getRESUMING_BY_RCV$p()) == false) goto L74;
        boolean r3 = r15;
    L75:
        if (r3 == false) goto L77;
        cellStateString = "resuming_sender";
        goto L98
    L77:
        if (cellState != null) goto L79;
        boolean r4 = r15;
    L80:
        if (r4 == false) goto L82;
        boolean r8 = r15;
    L83:
        if (r8 == false) goto L85;
        boolean r11 = r15;
    L86:
        if (r11 == false) goto L88;
        boolean r13 = r15;
    L89:
        if (r13 == false) goto L91;
        boolean r14 = r15;
    L92:
        if (r14 == false) goto L94;
        boolean r16 = r15;
    L95:
        if (r16 == true) goto L101;
        cellStateString = cellState.toString();
        goto L98
    L94:
        r16 = Intrinsics.areEqual(cellState, BufferedChannelKt.getCHANNEL_CLOSED());
        goto L95
    L91:
        r14 = Intrinsics.areEqual(cellState, BufferedChannelKt.access$getINTERRUPTED_SEND$p());
        goto L92
    L88:
        r13 = Intrinsics.areEqual(cellState, BufferedChannelKt.access$getINTERRUPTED_RCV$p());
        goto L89
    L85:
        r11 = Intrinsics.areEqual(cellState, BufferedChannelKt.access$getPOISONED$p());
        goto L86
    L82:
        r8 = Intrinsics.areEqual(cellState, BufferedChannelKt.access$getDONE_RCV$p());
        goto L83
    L79:
        r4 = Intrinsics.areEqual(cellState, BufferedChannelKt.access$getIN_BUFFER$p());
        goto L80
    L74:
        r3 = Intrinsics.areEqual(cellState, BufferedChannelKt.access$getRESUMING_BY_EB$p());
        goto L75
    L33:
        if (globalCellIndex < r) goto L36;
    L105:
        if (StringsKt.last(sb) != ',') goto L107;
        Intrinsics.checkNotNullExpressionValue(sb.deleteCharAt(sb.length() - 1), "deleteCharAt(...)");
    L107:
        sb.append("]");
        return sb.toString();
    L102:
        boolean r17 = r6;
        ChannelSegment r1 = (ChannelSegment) segment.getNext();
        if (r1 == null) goto L105;
        segment = r1;
        r6 = r17;
        goto L28
    L112:
        throw new NoSuchElementException();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final String toStringDebug$kotlinx_coroutines_core() {
        StringBuilder sb = new StringBuilder();
        StringBuilder r1 = new StringBuilder().append("S=").append(getSendersCounter$kotlinx_coroutines_core()).append(",R=").append(getReceiversCounter$kotlinx_coroutines_core()).append(",B=").append(getBufferEndCounter()).append(",B'=").append(getCompletedExpandBuffersAndPauseFlag$volatile$FU().get(this)).append(",C=");
        long $this$sendersCloseStatus$iv = getSendersAndCloseStatus$volatile$FU().get(this);
        sb.append(r1.append((int) ($this$sendersCloseStatus$iv >> 60)).append(',').toString());
        long $this$sendersCloseStatus$iv2 = getSendersAndCloseStatus$volatile$FU().get(this);
        int $i$f$getSendersCloseStatus = (int) ($this$sendersCloseStatus$iv2 >> 60);
        switch($i$f$getSendersCloseStatus) {
            case 1: goto L7;
            case 2: goto L6;
            case 3: goto L5;
            default: goto L8;
        };
    L5:
        sb.append("CANCELLED,");
        goto L8
    L6:
        sb.append("CLOSED,");
        goto L8
    L7:
        sb.append("CANCELLATION_STARTED,");
    L8:
        sb.append("SEND_SEGM=" + DebugStringsKt.getHexAddress(getSendSegment$volatile$FU().get(this)) + ",RCV_SEGM=" + DebugStringsKt.getHexAddress(getReceiveSegment$volatile$FU().get(this)));
        if (isRendezvousOrUnlimited() == true) goto L11;
        sb.append(",EB_SEGM=" + DebugStringsKt.getHexAddress(getBufferEndSegment$volatile$FU().get(this)));
    L11:
        sb.append("  ");
        Iterable $this$filter$iv = CollectionsKt.listOf(new ChannelSegment[]{getReceiveSegment$volatile$FU().get(this), getSendSegment$volatile$FU().get(this), getBufferEndSegment$volatile$FU().get(this)});
        ArrayList r6 = new ArrayList();
        Iterator r9 = $this$filter$iv.iterator();
    L13:
        if (r9.hasNext() == false) goto L20;
        Object element$iv$iv = r9.next();
        ChannelSegment it = (ChannelSegment) element$iv$iv;
        if (it == BufferedChannelKt.access$getNULL_SEGMENT$p()) goto L17;
        boolean r11 = true;
    L18:
        if (r11 == false) goto L13;
        r6.add(element$iv$iv);
        goto L13
    L17:
        r11 = false;
        goto L18
    L20:
        ArrayList $this$minBy$iv = r6;
        Iterator iterator$iv = $this$minBy$iv.iterator();
        if (iterator$iv.hasNext() == false) goto L68;
        Object minElem$iv = iterator$iv.next();
        if (iterator$iv.hasNext() == false) goto L31;
        ChannelSegment it2 = (ChannelSegment) minElem$iv;
        long minValue$iv = it2.id;
    L26:
        Object e$iv = iterator$iv.next();
        ChannelSegment it3 = (ChannelSegment) e$iv;
        long v$iv = it3.id;
        if (minValue$iv <= v$iv) goto L30;
        minElem$iv = e$iv;
        minValue$iv = v$iv;
    L30:
        if (iterator$iv.hasNext() == true) goto L26;
    L31:
        ChannelSegment firstSegment = (ChannelSegment) minElem$iv;
        ChannelSegment r2 = firstSegment;
    L32:
        StringBuilder r3 = new StringBuilder().append(DebugStringsKt.getHexAddress(r2)).append("=[");
        if (r2.isRemoved() == false) goto L35;
        String r5 = ProxyConfig.MATCH_ALL_SCHEMES;
    L36:
        StringBuilder r4 = r3.append(r5).append(r2.id).append(",prev=");
        ChannelSegment r7 = (ChannelSegment) r2.getPrev();
        String r8 = null;
        if (r7 == null) goto L39;
        String r10 = DebugStringsKt.getHexAddress(r7);
    L40:
        sb.append(r4.append(r10).append(',').toString());
        int r12 = BufferedChannelKt.SEGMENT_SIZE;
        int r13 = 0;
    L41:
        if (r13 >= r12) goto L59;
        int i = r13;
        Object cellState = r2.getState$kotlinx_coroutines_core(i);
        Object element = r2.getElement$kotlinx_coroutines_core(i);
        if ((cellState instanceof CancellableContinuation) == false) goto L46;
        String cellStateString = "cont";
    L58:
        sb.append('[' + i + "]=(" + cellStateString + ',' + element + "),");
        r13 = r13 + 1;
        goto L41
    L46:
        if ((cellState instanceof SelectInstance) == false) goto L49;
        cellStateString = "select";
        goto L58
    L49:
        if ((cellState instanceof ReceiveCatching) == false) goto L52;
        cellStateString = "receiveCatching";
        goto L58
    L52:
        if ((cellState instanceof SendBroadcast) == false) goto L55;
        cellStateString = "send(broadcast)";
        goto L58
    L55:
        if ((cellState instanceof WaiterEB) == false) goto L57;
        cellStateString = "EB(" + cellState + ')';
        goto L58
    L57:
        cellStateString = String.valueOf(cellState);
        goto L58
    L59:
        StringBuilder r14 = new StringBuilder().append("next=");
        ChannelSegment r15 = (ChannelSegment) r2.getNext();
        if (r15 == null) goto L62;
        r8 = DebugStringsKt.getHexAddress(r15);
    L62:
        sb.append(r14.append(r8).append("]  ").toString());
        ChannelSegment r16 = (ChannelSegment) r2.getNext();
        if (r16 == null) goto L65;
        r2 = r16;
        goto L32
    L65:
        return sb.toString();
    L39:
        r10 = null;
        goto L40
    L35:
        r5 = "";
        goto L36
    L68:
        throw new NoSuchElementException();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void checkSegmentStructureInvariants() {
        if (isRendezvousOrUnlimited() == false) goto L13;
        if (getBufferEndSegment$volatile$FU().get(this) != BufferedChannelKt.access$getNULL_SEGMENT$p()) goto L7;
        boolean r0 = true;
    L8:
        if (r0 == false) goto L11;
    L17:
        Iterable $this$filter$iv = CollectionsKt.listOf(new ChannelSegment[]{getReceiveSegment$volatile$FU().get(this), getSendSegment$volatile$FU().get(this), getBufferEndSegment$volatile$FU().get(this)});
        ArrayList r4 = new ArrayList();
        Iterator r7 = $this$filter$iv.iterator();
    L19:
        if (r7.hasNext() == false) goto L26;
        Object element$iv$iv = r7.next();
        ChannelSegment it = (ChannelSegment) element$iv$iv;
        if (it == BufferedChannelKt.access$getNULL_SEGMENT$p()) goto L23;
        boolean r9 = true;
    L24:
        if (r9 == false) goto L19;
        r4.add(element$iv$iv);
        goto L19
    L23:
        r9 = false;
        goto L24
    L26:
        ArrayList destination$iv$iv = r4;
        ArrayList $this$minBy$iv = destination$iv$iv;
        Iterator iterator$iv = $this$minBy$iv.iterator();
        if (iterator$iv.hasNext() == false) goto L114;
        Object minElem$iv = iterator$iv.next();
        if (iterator$iv.hasNext() == false) goto L37;
        ChannelSegment it2 = (ChannelSegment) minElem$iv;
        long minValue$iv = it2.id;
    L32:
        Object e$iv = iterator$iv.next();
        ChannelSegment it3 = (ChannelSegment) e$iv;
        long v$iv = it3.id;
        if (minValue$iv <= v$iv) goto L36;
        minElem$iv = e$iv;
        minValue$iv = v$iv;
    L36:
        if (iterator$iv.hasNext() == true) goto L32;
    L37:
        ChannelSegment firstSegment = (ChannelSegment) minElem$iv;
        if (firstSegment.getPrev() != 0) goto L40;
        boolean r1 = true;
    L41:
        if (r1 == false) goto L112;
        ChannelSegment segment = firstSegment;
    L44:
        if (segment.getNext() == 0) goto L110;
        S r3 = segment.getNext();
        Intrinsics.checkNotNull(r3);
        if (((ChannelSegment) r3).getPrev() == 0) goto L51;
        S r5 = segment.getNext();
        Intrinsics.checkNotNull(r5);
        if (((ChannelSegment) r5).getPrev() == segment) goto L51;
        boolean r6 = false;
    L52:
        if (r6 == false) goto L109;
        int interruptedOrClosedCells = 0;
        int i = 0;
        int r8 = BufferedChannelKt.SEGMENT_SIZE;
    L54:
        if (i >= r8) goto L92;
        Object state = segment.getState$kotlinx_coroutines_core(i);
        if (Intrinsics.areEqual(state, BufferedChannelKt.BUFFERED) == true) goto L91;
        if ((state instanceof Waiter) == true) goto L91;
        if (Intrinsics.areEqual(state, BufferedChannelKt.access$getINTERRUPTED_RCV$p()) == false) goto L62;
        boolean r10 = true;
    L63:
        if (r10 == false) goto L65;
        boolean r11 = true;
    L67:
        if (r11 == false) goto L77;
        if (segment.getElement$kotlinx_coroutines_core(i) != null) goto L71;
        boolean r12 = true;
    L72:
        if (r12 == false) goto L75;
        interruptedOrClosedCells = interruptedOrClosedCells + 1;
        goto L91
    L75:
        throw new IllegalStateException("Check failed.".toString());
    L71:
        r12 = false;
        goto L72
    L77:
        if (Intrinsics.areEqual(state, BufferedChannelKt.access$getPOISONED$p()) == false) goto L79;
        boolean r13 = true;
    L80:
        if (r13 == false) goto L90;
        if (segment.getElement$kotlinx_coroutines_core(i) != null) goto L84;
        boolean r14 = true;
    L85:
        if (r14 == true) goto L91;
        throw new IllegalStateException("Check failed.".toString());
    L84:
        r14 = false;
        goto L85
    L90:
        throw new IllegalStateException(("Unexpected segment cell state: " + state + ".\nChannel state: " + this).toString());
    L79:
        r13 = Intrinsics.areEqual(state, BufferedChannelKt.access$getDONE_RCV$p());
        goto L80
    L65:
        r11 = Intrinsics.areEqual(state, BufferedChannelKt.getCHANNEL_CLOSED());
        goto L67
    L62:
        r10 = Intrinsics.areEqual(state, BufferedChannelKt.access$getINTERRUPTED_SEND$p());
    L91:
        i = i + 1;
        goto L54
    L92:
        int i2 = BufferedChannelKt.SEGMENT_SIZE;
        if (interruptedOrClosedCells != i2) goto L107;
        if (segment != getReceiveSegment$volatile$FU().get(this)) goto L97;
    L102:
        boolean r15 = true;
    L103:
        if (r15 == true) goto L107;
        throw new IllegalStateException(("Logically removed segment is reachable.\nChannel state: " + this).toString());
    L97:
        if (segment == getSendSegment$volatile$FU().get(this)) goto L102;
        if (segment == getBufferEndSegment$volatile$FU().get(this)) goto L102;
        r15 = false;
    L107:
        S r16 = segment.getNext();
        Intrinsics.checkNotNull(r16);
        segment = (ChannelSegment) r16;
        goto L44
    L109:
        throw new IllegalStateException(("The `segment.next.prev === segment` invariant is violated.\nChannel state: " + this).toString());
    L51:
        r6 = true;
        goto L52
    L110:
        return;
    L112:
        throw new IllegalStateException(("All processed segments should be unreachable from the data structure, but the `prev` link of the leftmost segment is non-null.\nChannel state: " + this).toString());
    L40:
        r1 = false;
        goto L41
    L114:
        throw new NoSuchElementException();
    L11:
        throw new IllegalStateException(("bufferEndSegment must be NULL_SEGMENT for rendezvous and unlimited channels; they do not manipulate it.\nChannel state: " + this).toString());
    L7:
        r0 = false;
        goto L8
    L13:
        if (((ChannelSegment) getReceiveSegment$volatile$FU().get(this)).id > ((ChannelSegment) getBufferEndSegment$volatile$FU().get(this)).id) goto L15;
        boolean r2 = true;
    L16:
        if (r2 == true) goto L17;
        throw new IllegalStateException(("bufferEndSegment should not have lower id than receiveSegment.\nChannel state: " + this).toString());
    L15:
        r2 = false;
        goto L16
    }
}
