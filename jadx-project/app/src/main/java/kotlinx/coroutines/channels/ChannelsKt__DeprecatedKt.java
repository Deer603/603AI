package kotlinx.coroutines.channels;

import androidx.autofill.HintConstants;
import androidx.compose.animation.core.AnimationConstants;
import androidx.compose.runtime.ComposerKt;
import androidx.core.view.MotionEventCompat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.IndexedValue;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.GlobalScope;
import kotlinx.coroutines.scheduling.WorkQueueKt;

/* JADX INFO: compiled from: Deprecated.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000®\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u001f\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\b\u0002\n\u0002\u0010!\n\u0000\n\u0002\u0010#\n\u0000\n\u0002\u0010\"\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001aJ\u0010\u0000\u001a#\u0012\u0015\u0012\u0013\u0018\u00010\u0002¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\b(\u0005\u0012\u0004\u0012\u00020\u00060\u0001j\u0002`\u00072\u001a\u0010\b\u001a\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030\n0\t\"\u0006\u0012\u0002\b\u00030\nH\u0001¢\u0006\u0002\u0010\u000b\u001a\u001e\u0010\f\u001a\u00020\r\"\u0004\b\u0000\u0010\u000e*\b\u0012\u0004\u0012\u0002H\u000e0\nH\u0087@¢\u0006\u0002\u0010\u000f\u001aC\u0010\u0010\u001a\u0002H\u0011\"\u0004\b\u0000\u0010\u000e\"\u0004\b\u0001\u0010\u0011*\b\u0012\u0004\u0012\u0002H\u000e0\u00122\u001d\u0010\u0013\u001a\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u000e0\n\u0012\u0004\u0012\u0002H\u00110\u0001¢\u0006\u0002\b\u0014H\u0087\b¢\u0006\u0002\u0010\u0015\u001a2\u0010\u0016\u001a\u00020\u0006\"\u0004\b\u0000\u0010\u000e*\b\u0012\u0004\u0012\u0002H\u000e0\u00122\u0012\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u0002H\u000e\u0012\u0004\u0012\u00020\u00060\u0001H\u0087H¢\u0006\u0002\u0010\u0018\u001a1\u0010\u0019\u001a#\u0012\u0015\u0012\u0013\u0018\u00010\u0002¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\b(\u0005\u0012\u0004\u0012\u00020\u00060\u0001j\u0002`\u0007*\u0006\u0012\u0002\b\u00030\nH\u0001\u001a\u001e\u0010\u001a\u001a\u00020\u001b\"\u0004\b\u0000\u0010\u000e*\b\u0012\u0004\u0012\u0002H\u000e0\nH\u0087@¢\u0006\u0002\u0010\u000f\u001a\u001e\u0010\u001c\u001a\b\u0012\u0004\u0012\u0002H\u000e0\n\"\u0004\b\u0000\u0010\u000e*\b\u0012\u0004\u0012\u0002H\u000e0\nH\u0007\u001aW\u0010\u001d\u001a\b\u0012\u0004\u0012\u0002H\u000e0\n\"\u0004\b\u0000\u0010\u000e\"\u0004\b\u0001\u0010\u001e*\b\u0012\u0004\u0012\u0002H\u000e0\n2\b\b\u0002\u0010\u001f\u001a\u00020 2\"\u0010!\u001a\u001e\b\u0001\u0012\u0004\u0012\u0002H\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u001e0#\u0012\u0006\u0012\u0004\u0018\u00010$0\"H\u0001¢\u0006\u0002\u0010%\u001a0\u0010&\u001a\b\u0012\u0004\u0012\u0002H\u000e0\n\"\u0004\b\u0000\u0010\u000e*\b\u0012\u0004\u0012\u0002H\u000e0\n2\u0006\u0010'\u001a\u00020\u001b2\b\b\u0002\u0010\u001f\u001a\u00020 H\u0007\u001aQ\u0010(\u001a\b\u0012\u0004\u0012\u0002H\u000e0\n\"\u0004\b\u0000\u0010\u000e*\b\u0012\u0004\u0012\u0002H\u000e0\n2\b\b\u0002\u0010\u001f\u001a\u00020 2\"\u0010)\u001a\u001e\b\u0001\u0012\u0004\u0012\u0002H\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0#\u0012\u0006\u0012\u0004\u0018\u00010$0\"H\u0007¢\u0006\u0002\u0010%\u001a&\u0010*\u001a\u0002H\u000e\"\u0004\b\u0000\u0010\u000e*\b\u0012\u0004\u0012\u0002H\u000e0\n2\u0006\u0010+\u001a\u00020\u001bH\u0087@¢\u0006\u0002\u0010,\u001a(\u0010-\u001a\u0004\u0018\u0001H\u000e\"\u0004\b\u0000\u0010\u000e*\b\u0012\u0004\u0012\u0002H\u000e0\n2\u0006\u0010+\u001a\u00020\u001bH\u0087@¢\u0006\u0002\u0010,\u001aQ\u0010.\u001a\b\u0012\u0004\u0012\u0002H\u000e0\n\"\u0004\b\u0000\u0010\u000e*\b\u0012\u0004\u0012\u0002H\u000e0\n2\b\b\u0002\u0010\u001f\u001a\u00020 2\"\u0010)\u001a\u001e\b\u0001\u0012\u0004\u0012\u0002H\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0#\u0012\u0006\u0012\u0004\u0018\u00010$0\"H\u0001¢\u0006\u0002\u0010%\u001af\u0010/\u001a\b\u0012\u0004\u0012\u0002H\u000e0\n\"\u0004\b\u0000\u0010\u000e*\b\u0012\u0004\u0012\u0002H\u000e0\n2\b\b\u0002\u0010\u001f\u001a\u00020 27\u0010)\u001a3\b\u0001\u0012\u0013\u0012\u00110\u001b¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\b(+\u0012\u0004\u0012\u0002H\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0#\u0012\u0006\u0012\u0004\u0018\u00010$00H\u0007¢\u0006\u0002\u00101\u001aQ\u00102\u001a\b\u0012\u0004\u0012\u0002H\u000e0\n\"\u0004\b\u0000\u0010\u000e*\b\u0012\u0004\u0012\u0002H\u000e0\n2\b\b\u0002\u0010\u001f\u001a\u00020 2\"\u0010)\u001a\u001e\b\u0001\u0012\u0004\u0012\u0002H\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0#\u0012\u0006\u0012\u0004\u0018\u00010$0\"H\u0007¢\u0006\u0002\u0010%\u001a$\u00103\u001a\b\u0012\u0004\u0012\u0002H\u000e0\n\"\b\b\u0000\u0010\u000e*\u00020$*\n\u0012\u0006\u0012\u0004\u0018\u0001H\u000e0\nH\u0001\u001a>\u00104\u001a\u0002H5\"\b\b\u0000\u0010\u000e*\u00020$\"\u0010\b\u0001\u00105*\n\u0012\u0006\b\u0000\u0012\u0002H\u000e06*\n\u0012\u0006\u0012\u0004\u0018\u0001H\u000e0\n2\u0006\u00107\u001a\u0002H5H\u0087@¢\u0006\u0002\u00108\u001a<\u00104\u001a\u0002H5\"\b\b\u0000\u0010\u000e*\u00020$\"\u000e\b\u0001\u00105*\b\u0012\u0004\u0012\u0002H\u000e09*\n\u0012\u0006\u0012\u0004\u0018\u0001H\u000e0\n2\u0006\u00107\u001a\u0002H5H\u0087@¢\u0006\u0002\u0010:\u001a\u001e\u0010;\u001a\u0002H\u000e\"\u0004\b\u0000\u0010\u000e*\b\u0012\u0004\u0012\u0002H\u000e0\nH\u0087@¢\u0006\u0002\u0010\u000f\u001a \u0010<\u001a\u0004\u0018\u0001H\u000e\"\u0004\b\u0000\u0010\u000e*\b\u0012\u0004\u0012\u0002H\u000e0\nH\u0087@¢\u0006\u0002\u0010\u000f\u001a]\u0010=\u001a\b\u0012\u0004\u0012\u0002H\u00110\n\"\u0004\b\u0000\u0010\u000e\"\u0004\b\u0001\u0010\u0011*\b\u0012\u0004\u0012\u0002H\u000e0\n2\b\b\u0002\u0010\u001f\u001a\u00020 2(\u0010>\u001a$\b\u0001\u0012\u0004\u0012\u0002H\u000e\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00110\n0#\u0012\u0006\u0012\u0004\u0018\u00010$0\"H\u0007¢\u0006\u0002\u0010%\u001a&\u0010?\u001a\u00020\u001b\"\u0004\b\u0000\u0010\u000e*\b\u0012\u0004\u0012\u0002H\u000e0\n2\u0006\u0010@\u001a\u0002H\u000eH\u0087@¢\u0006\u0002\u0010A\u001a\u001e\u0010B\u001a\u0002H\u000e\"\u0004\b\u0000\u0010\u000e*\b\u0012\u0004\u0012\u0002H\u000e0\nH\u0087@¢\u0006\u0002\u0010\u000f\u001a&\u0010C\u001a\u00020\u001b\"\u0004\b\u0000\u0010\u000e*\b\u0012\u0004\u0012\u0002H\u000e0\n2\u0006\u0010@\u001a\u0002H\u000eH\u0087@¢\u0006\u0002\u0010A\u001a \u0010D\u001a\u0004\u0018\u0001H\u000e\"\u0004\b\u0000\u0010\u000e*\b\u0012\u0004\u0012\u0002H\u000e0\nH\u0087@¢\u0006\u0002\u0010\u000f\u001aW\u0010E\u001a\b\u0012\u0004\u0012\u0002H\u00110\n\"\u0004\b\u0000\u0010\u000e\"\u0004\b\u0001\u0010\u0011*\b\u0012\u0004\u0012\u0002H\u000e0\n2\b\b\u0002\u0010\u001f\u001a\u00020 2\"\u0010>\u001a\u001e\b\u0001\u0012\u0004\u0012\u0002H\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00110#\u0012\u0006\u0012\u0004\u0018\u00010$0\"H\u0001¢\u0006\u0002\u0010%\u001al\u0010F\u001a\b\u0012\u0004\u0012\u0002H\u00110\n\"\u0004\b\u0000\u0010\u000e\"\u0004\b\u0001\u0010\u0011*\b\u0012\u0004\u0012\u0002H\u000e0\n2\b\b\u0002\u0010\u001f\u001a\u00020 27\u0010>\u001a3\b\u0001\u0012\u0013\u0012\u00110\u001b¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\b(+\u0012\u0004\u0012\u0002H\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00110#\u0012\u0006\u0012\u0004\u0018\u00010$00H\u0001¢\u0006\u0002\u00101\u001ar\u0010G\u001a\b\u0012\u0004\u0012\u0002H\u00110\n\"\u0004\b\u0000\u0010\u000e\"\b\b\u0001\u0010\u0011*\u00020$*\b\u0012\u0004\u0012\u0002H\u000e0\n2\b\b\u0002\u0010\u001f\u001a\u00020 29\u0010>\u001a5\b\u0001\u0012\u0013\u0012\u00110\u001b¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\b(+\u0012\u0004\u0012\u0002H\u000e\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u0001H\u00110#\u0012\u0006\u0012\u0004\u0018\u00010$00H\u0007¢\u0006\u0002\u00101\u001a]\u0010H\u001a\b\u0012\u0004\u0012\u0002H\u00110\n\"\u0004\b\u0000\u0010\u000e\"\b\b\u0001\u0010\u0011*\u00020$*\b\u0012\u0004\u0012\u0002H\u000e0\n2\b\b\u0002\u0010\u001f\u001a\u00020 2$\u0010>\u001a \b\u0001\u0012\u0004\u0012\u0002H\u000e\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u0001H\u00110#\u0012\u0006\u0012\u0004\u0018\u00010$0\"H\u0007¢\u0006\u0002\u0010%\u001a<\u0010I\u001a\u0004\u0018\u0001H\u000e\"\u0004\b\u0000\u0010\u000e*\b\u0012\u0004\u0012\u0002H\u000e0\n2\u001a\u0010J\u001a\u0016\u0012\u0006\b\u0000\u0012\u0002H\u000e0Kj\n\u0012\u0006\b\u0000\u0012\u0002H\u000e`LH\u0087@¢\u0006\u0002\u0010M\u001a<\u0010N\u001a\u0004\u0018\u0001H\u000e\"\u0004\b\u0000\u0010\u000e*\b\u0012\u0004\u0012\u0002H\u000e0\n2\u001a\u0010J\u001a\u0016\u0012\u0006\b\u0000\u0012\u0002H\u000e0Kj\n\u0012\u0006\b\u0000\u0012\u0002H\u000e`LH\u0087@¢\u0006\u0002\u0010M\u001a\u001e\u0010O\u001a\u00020\r\"\u0004\b\u0000\u0010\u000e*\b\u0012\u0004\u0012\u0002H\u000e0\nH\u0087@¢\u0006\u0002\u0010\u000f\u001a$\u0010P\u001a\b\u0012\u0004\u0012\u0002H\u000e0\n\"\b\b\u0000\u0010\u000e*\u00020$*\n\u0012\u0006\u0012\u0004\u0018\u0001H\u000e0\nH\u0007\u001a\u001e\u0010Q\u001a\u0002H\u000e\"\u0004\b\u0000\u0010\u000e*\b\u0012\u0004\u0012\u0002H\u000e0\nH\u0087@¢\u0006\u0002\u0010\u000f\u001a \u0010R\u001a\u0004\u0018\u0001H\u000e\"\u0004\b\u0000\u0010\u000e*\b\u0012\u0004\u0012\u0002H\u000e0\nH\u0087@¢\u0006\u0002\u0010\u000f\u001a0\u0010S\u001a\b\u0012\u0004\u0012\u0002H\u000e0\n\"\u0004\b\u0000\u0010\u000e*\b\u0012\u0004\u0012\u0002H\u000e0\n2\u0006\u0010'\u001a\u00020\u001b2\b\b\u0002\u0010\u001f\u001a\u00020 H\u0007\u001aQ\u0010T\u001a\b\u0012\u0004\u0012\u0002H\u000e0\n\"\u0004\b\u0000\u0010\u000e*\b\u0012\u0004\u0012\u0002H\u000e0\n2\b\b\u0002\u0010\u001f\u001a\u00020 2\"\u0010)\u001a\u001e\b\u0001\u0012\u0004\u0012\u0002H\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0#\u0012\u0006\u0012\u0004\u0018\u00010$0\"H\u0007¢\u0006\u0002\u0010%\u001a6\u0010U\u001a\u0002H5\"\u0004\b\u0000\u0010\u000e\"\u000e\b\u0001\u00105*\b\u0012\u0004\u0012\u0002H\u000e09*\b\u0012\u0004\u0012\u0002H\u000e0\n2\u0006\u00107\u001a\u0002H5H\u0081@¢\u0006\u0002\u0010:\u001a8\u0010V\u001a\u0002H5\"\u0004\b\u0000\u0010\u000e\"\u0010\b\u0001\u00105*\n\u0012\u0006\b\u0000\u0012\u0002H\u000e06*\b\u0012\u0004\u0012\u0002H\u000e0\n2\u0006\u00107\u001a\u0002H5H\u0081@¢\u0006\u0002\u00108\u001a<\u0010W\u001a\u000e\u0012\u0004\u0012\u0002H\u001e\u0012\u0004\u0012\u0002HY0X\"\u0004\b\u0000\u0010\u001e\"\u0004\b\u0001\u0010Y*\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u0002H\u001e\u0012\u0004\u0012\u0002HY0Z0\nH\u0087@¢\u0006\u0002\u0010\u000f\u001aR\u0010W\u001a\u0002H[\"\u0004\b\u0000\u0010\u001e\"\u0004\b\u0001\u0010Y\"\u0018\b\u0002\u0010[*\u0012\u0012\u0006\b\u0000\u0012\u0002H\u001e\u0012\u0006\b\u0000\u0012\u0002HY0\\*\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u0002H\u001e\u0012\u0004\u0012\u0002HY0Z0\n2\u0006\u00107\u001a\u0002H[H\u0081@¢\u0006\u0002\u0010]\u001a$\u0010^\u001a\b\u0012\u0004\u0012\u0002H\u000e0_\"\u0004\b\u0000\u0010\u000e*\b\u0012\u0004\u0012\u0002H\u000e0\nH\u0087@¢\u0006\u0002\u0010\u000f\u001a$\u0010`\u001a\b\u0012\u0004\u0012\u0002H\u000e0a\"\u0004\b\u0000\u0010\u000e*\b\u0012\u0004\u0012\u0002H\u000e0\nH\u0081@¢\u0006\u0002\u0010\u000f\u001a$\u0010b\u001a\b\u0012\u0004\u0012\u0002H\u000e0c\"\u0004\b\u0000\u0010\u000e*\b\u0012\u0004\u0012\u0002H\u000e0\nH\u0087@¢\u0006\u0002\u0010\u000f\u001a.\u0010d\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u000e0e0\n\"\u0004\b\u0000\u0010\u000e*\b\u0012\u0004\u0012\u0002H\u000e0\n2\b\b\u0002\u0010\u001f\u001a\u00020 H\u0007\u001a?\u0010f\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u0002H\u000e\u0012\u0004\u0012\u0002H\u00110Z0\n\"\u0004\b\u0000\u0010\u000e\"\u0004\b\u0001\u0010\u0011*\b\u0012\u0004\u0012\u0002H\u000e0\n2\f\u0010g\u001a\b\u0012\u0004\u0012\u0002H\u00110\nH\u0087\u0004\u001az\u0010f\u001a\b\u0012\u0004\u0012\u0002HY0\n\"\u0004\b\u0000\u0010\u000e\"\u0004\b\u0001\u0010\u0011\"\u0004\b\u0002\u0010Y*\b\u0012\u0004\u0012\u0002H\u000e0\n2\f\u0010g\u001a\b\u0012\u0004\u0012\u0002H\u00110\n2\b\b\u0002\u0010\u001f\u001a\u00020 26\u0010>\u001a2\u0012\u0013\u0012\u0011H\u000e¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\b(h\u0012\u0013\u0012\u0011H\u0011¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\b(i\u0012\u0004\u0012\u0002HY0\"H\u0001¨\u0006j"}, d2 = {"consumesAll", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", HintConstants.AUTOFILL_HINT_NAME, "cause", "", "Lkotlinx/coroutines/CompletionHandler;", "channels", "", "Lkotlinx/coroutines/channels/ReceiveChannel;", "([Lkotlinx/coroutines/channels/ReceiveChannel;)Lkotlin/jvm/functions/Function1;", "any", "", "E", "(Lkotlinx/coroutines/channels/ReceiveChannel;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "consume", "R", "Lkotlinx/coroutines/channels/BroadcastChannel;", "block", "Lkotlin/ExtensionFunctionType;", "(Lkotlinx/coroutines/channels/BroadcastChannel;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "consumeEach", "action", "(Lkotlinx/coroutines/channels/BroadcastChannel;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "consumes", "count", "", "distinct", "distinctBy", "K", "context", "Lkotlin/coroutines/CoroutineContext;", "selector", "Lkotlin/Function2;", "Lkotlin/coroutines/Continuation;", "", "(Lkotlinx/coroutines/channels/ReceiveChannel;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;)Lkotlinx/coroutines/channels/ReceiveChannel;", "drop", "n", "dropWhile", "predicate", "elementAt", "index", "(Lkotlinx/coroutines/channels/ReceiveChannel;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "elementAtOrNull", "filter", "filterIndexed", "Lkotlin/Function3;", "(Lkotlinx/coroutines/channels/ReceiveChannel;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function3;)Lkotlinx/coroutines/channels/ReceiveChannel;", "filterNot", "filterNotNull", "filterNotNullTo", "C", "", "destination", "(Lkotlinx/coroutines/channels/ReceiveChannel;Ljava/util/Collection;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lkotlinx/coroutines/channels/SendChannel;", "(Lkotlinx/coroutines/channels/ReceiveChannel;Lkotlinx/coroutines/channels/SendChannel;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "first", "firstOrNull", "flatMap", "transform", "indexOf", "element", "(Lkotlinx/coroutines/channels/ReceiveChannel;Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "last", "lastIndexOf", "lastOrNull", "map", "mapIndexed", "mapIndexedNotNull", "mapNotNull", "maxWith", "comparator", "Ljava/util/Comparator;", "Lkotlin/Comparator;", "(Lkotlinx/coroutines/channels/ReceiveChannel;Ljava/util/Comparator;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "minWith", "none", "requireNoNulls", "single", "singleOrNull", "take", "takeWhile", "toChannel", "toCollection", "toMap", "", "V", "Lkotlin/Pair;", "M", "", "(Lkotlinx/coroutines/channels/ReceiveChannel;Ljava/util/Map;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "toMutableList", "", "toMutableSet", "", "toSet", "", "withIndex", "Lkotlin/collections/IndexedValue;", "zip", "other", "a", "b", "kotlinx-coroutines-core"}, k = 5, mv = {1, 9, 0}, xi = 48, xs = "kotlinx/coroutines/channels/ChannelsKt")
final /* synthetic */ class ChannelsKt__DeprecatedKt {

    /* JADX INFO: renamed from: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$any$1, reason: invalid class name */
    /* JADX INFO: compiled from: Deprecated.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt", f = "Deprecated.kt", i = {0}, l = {434}, m = "any", n = {"$this$consume$iv"}, s = {"L$0"})
    static final class AnonymousClass1<E> extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        AnonymousClass1(Continuation<? super AnonymousClass1> r1) {
            super(r1);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object r3) {
            this.result = r3;
            this.label |= Integer.MIN_VALUE;
            return ChannelsKt.any(null, this);
        }
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$consumeEach$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: Deprecated.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 176)
    @DebugMetadata(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt", f = "Deprecated.kt", i = {0, 0}, l = {MotionEventCompat.AXIS_GENERIC_10}, m = "consumeEach", n = {"action", "channel$iv"}, s = {"L$0", "L$1"})
    static final class C07181<E> extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        C07181(Continuation<? super C07181> r1) {
            super(r1);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object r3) {
            this.result = r3;
            this.label |= Integer.MIN_VALUE;
            return ChannelsKt__DeprecatedKt.consumeEach(null, null, this);
        }
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$count$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: Deprecated.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt", f = "Deprecated.kt", i = {0, 0}, l = {517}, m = "count", n = {"count", "$this$consume$iv$iv"}, s = {"L$0", "L$1"})
    static final class C07211<E> extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        C07211(Continuation<? super C07211> r1) {
            super(r1);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object r3) {
            this.result = r3;
            this.label |= Integer.MIN_VALUE;
            return ChannelsKt.count(null, this);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [E] */
    /* JADX INFO: renamed from: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$distinct$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: Deprecated.kt */
    @Metadata(d1 = {"\u0000\u0004\n\u0002\b\u0003\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u00012\u0006\u0010\u0002\u001a\u0002H\u0001H\u008a@"}, d2 = {"<anonymous>", "E", "it"}, k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$distinct$1", f = "Deprecated.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class C07221<E> extends SuspendLambda implements Function2<E, Continuation<? super E>, Object> {
        /* synthetic */ Object L$0;
        int label;

        C07221(Continuation<? super C07221> r2) {
            super(2, r2);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object r2, Continuation<?> r3) {
            C07221 r0 = new C07221(r3);
            r0.L$0 = r2;
            return r0;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object r2, Object r3) {
            return invoke(r2, (Continuation) r3);
        }

        public final Object invoke(E r3, Continuation<? super E> r4) {
            return ((C07221) create(r3, r4)).invokeSuspend(Unit.INSTANCE);
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
            Object it = this.L$0;
            return it;
        L5:
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Add missing generic type declarations: [E] */
    /* JADX INFO: renamed from: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$distinctBy$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: Deprecated.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003*\b\u0012\u0004\u0012\u0002H\u00020\u0004H\u008a@"}, d2 = {"<anonymous>", "", "E", "K", "Lkotlinx/coroutines/channels/ProducerScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$distinctBy$1", f = "Deprecated.kt", i = {0, 0, 1, 1, 1, 2, 2, 2}, l = {417, 418, 420}, m = "invokeSuspend", n = {"$this$produce", "keys", "$this$produce", "keys", "e", "$this$produce", "keys", "k"}, s = {"L$0", "L$1", "L$0", "L$1", "L$3", "L$0", "L$1", "L$3"})
    static final class C07231<E> extends SuspendLambda implements Function2<ProducerScope<? super E>, Continuation<? super Unit>, Object> {
        final /* synthetic */ Function2<E, Continuation<? super K>, Object> $selector;
        final /* synthetic */ ReceiveChannel<E> $this_distinctBy;
        private /* synthetic */ Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;

        /* JADX WARN: Multi-variable type inference failed */
        C07231(ReceiveChannel<? extends E> r2, Function2<? super E, ? super Continuation<? super K>, ? extends Object> r3, Continuation<? super C07231> r4) {
            this.$this_distinctBy = r2;
            this.$selector = r3;
            super(2, r4);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object r4, Continuation<?> r5) {
            C07231 r0 = new C07231(this.$this_distinctBy, this.$selector, r5);
            r0.L$0 = r4;
            return r0;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object r2, Continuation<? super Unit> r3) {
            return invoke((ProducerScope) r2, r3);
        }

        public final Object invoke(ProducerScope<? super E> r3, Continuation<? super Unit> r4) {
            return ((C07231) create(r3, r4)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r4v10 */
        /* JADX WARN: Type inference failed for: r4v14, types: [java.lang.Object] */
        /* JADX WARN: Type inference failed for: r4v17 */
        /* JADX WARN: Type inference failed for: r4v2 */
        /* JADX WARN: Type inference failed for: r5v0 */
        /* JADX WARN: Type inference failed for: r5v11 */
        /* JADX WARN: Type inference failed for: r5v12 */
        /* JADX WARN: Type inference failed for: r5v15 */
        /* JADX WARN: Type inference failed for: r5v5 */
        /* JADX WARN: Type inference failed for: r5v6, types: [java.lang.Object] */
        /* JADX WARN: Type inference failed for: r6v0 */
        /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Object, kotlinx.coroutines.channels.ProducerScope] */
        /* JADX WARN: Type inference failed for: r6v4 */
        /* JADX WARN: Type inference failed for: r6v8, types: [java.util.Collection] */
        /* JADX WARN: Type inference incomplete: some casts might be missing */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x00cd -> B:26:0x00d5). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:27:0x00df -> B:10:0x006d). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object r11) {
            Object r0 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            switch(this.label) {
                case 0: goto L9;
                case 1: goto L8;
                case 2: goto L7;
                case 3: goto L6;
                default: goto L5;
            };
        L6:
            C07231<E> r1 = this;
            Object r2 = r1.L$3;
            ChannelIterator<E> r3 = (ChannelIterator) r1.L$2;
            HashSet r4 = (HashSet) r1.L$1;
            ProducerScope r5 = (ProducerScope) r1.L$0;
            ResultKt.throwOnFailure(r11);
            ?? r6 = r5;
        L26:
            r4.add(r2);
            ChannelIterator<E> r7 = r3;
            HashSet r8 = r4;
            ?? r9 = r6;
        L10:
            r1.L$0 = r9;
            r1.L$1 = r8;
            r1.L$2 = r7;
            r1.L$3 = null;
            r1.label = 1;
            Object r10 = r7.hasNext(r1);
            if (r10 != r0) goto L13;
            return r0;
        L13:
            Object r12 = r0;
            Object r13 = r11;
            r11 = r10;
            ?? r14 = r9;
            HashSet r15 = r8;
            ChannelIterator<E> r16 = r7;
            C07231<E> r17 = r1;
            Object r18 = r12;
        L15:
            if (((Boolean) r11).booleanValue() == false) goto L29;
            E r19 = r16.next();
            Function2 r20 = r17.$selector;
            r17.L$0 = r14;
            r17.L$1 = r15;
            r17.L$2 = r16;
            r17.L$3 = r19;
            r17.label = 2;
            Object r21 = r20.invoke(r19, r17);
            if (r21 != r18) goto L19;
            return r18;
        L19:
            ChannelIterator<E> r22 = r16;
            Object r23 = r19;
            r11 = r21;
            ?? r24 = r14;
            HashSet r25 = r15;
            ChannelIterator<E> r26 = r22;
        L21:
            if (r25.contains(r11) == true) goto L27;
            r17.L$0 = r24;
            r17.L$1 = r25;
            r17.L$2 = r26;
            r17.L$3 = r11;
            r17.label = 3;
            if (r24.send(r23, r17) != r18) goto L25;
            return r18;
        L25:
            C07231<E> r27 = r17;
            r2 = r11;
            r11 = r13;
            r0 = r18;
            r1 = r27;
            r3 = r26;
            r4 = r25;
            r6 = r24;
            goto L26
        L27:
            r11 = r13;
            r0 = r18;
            r1 = r17;
            r7 = r26;
            r8 = r25;
            r9 = r24;
            goto L10
        L29:
            return Unit.INSTANCE;
        L7:
            Object r28 = this.L$3;
            ChannelIterator<E> r29 = (ChannelIterator) this.L$2;
            HashSet r30 = (HashSet) this.L$1;
            ProducerScope r31 = (ProducerScope) this.L$0;
            ResultKt.throwOnFailure(r11);
            r24 = r31;
            r25 = r30;
            r26 = r29;
            r23 = r28;
            r17 = this;
            r18 = r0;
            r13 = r11;
            goto L21
        L8:
            ChannelIterator<E> r32 = (ChannelIterator) this.L$2;
            HashSet r33 = (HashSet) this.L$1;
            ProducerScope r34 = (ProducerScope) this.L$0;
            ResultKt.throwOnFailure(r11);
            r14 = r34;
            r15 = r33;
            r16 = r32;
            r17 = this;
            r18 = r0;
            r13 = r11;
            goto L15
        L9:
            ResultKt.throwOnFailure(r11);
            r1 = this;
            ProducerScope r35 = (ProducerScope) r1.L$0;
            r8 = new HashSet();
            ChannelIterator<E> r36 = r1.$this_distinctBy.iterator();
            r9 = r35;
            r7 = r36;
            goto L10
        L5:
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Add missing generic type declarations: [E] */
    /* JADX INFO: renamed from: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$drop$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: Deprecated.kt */
    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0003H\u008a@"}, d2 = {"<anonymous>", "", "E", "Lkotlinx/coroutines/channels/ProducerScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$drop$1", f = "Deprecated.kt", i = {0, 0, 1, 2}, l = {194, 199, ComposerKt.invocationKey}, m = "invokeSuspend", n = {"$this$produce", "remaining", "$this$produce", "$this$produce"}, s = {"L$0", "I$0", "L$0", "L$0"})
    static final class C07241<E> extends SuspendLambda implements Function2<ProducerScope<? super E>, Continuation<? super Unit>, Object> {
        final /* synthetic */ int $n;
        final /* synthetic */ ReceiveChannel<E> $this_drop;
        int I$0;
        private /* synthetic */ Object L$0;
        Object L$1;
        int label;

        /* JADX WARN: Multi-variable type inference failed */
        C07241(int r2, ReceiveChannel<? extends E> r3, Continuation<? super C07241> r4) {
            this.$n = r2;
            this.$this_drop = r3;
            super(2, r4);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object r4, Continuation<?> r5) {
            C07241 r0 = new C07241(this.$n, this.$this_drop, r5);
            r0.L$0 = r4;
            return r0;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object r2, Continuation<? super Unit> r3) {
            return invoke((ProducerScope) r2, r3);
        }

        public final Object invoke(ProducerScope<? super E> r3, Continuation<? super Unit> r4) {
            return ((C07241) create(r3, r4)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x007b -> B:22:0x0083). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:39:0x00da -> B:30:0x00a5). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object $result) {
            Object $result2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            switch(this.label) {
                case 0: goto L9;
                case 1: goto L8;
                case 2: goto L7;
                case 3: goto L6;
                default: goto L5;
            };
        L6:
            C07241<E> r1 = this;
            ChannelIterator<E> r2 = (ChannelIterator) r1.L$1;
            ProducerScope $this$produce = (ProducerScope) r1.L$0;
            ResultKt.throwOnFailure($result);
        L30:
            r1.L$0 = $this$produce;
            r1.L$1 = r2;
            r1.label = 2;
            Object r4 = r2.hasNext(r1);
            if (r4 != $result2) goto L33;
            return $result2;
        L33:
            Object r7 = $result2;
            Object $result3 = $result;
            $result = r4;
            ProducerScope $this$produce2 = $this$produce;
            ChannelIterator<E> r3 = r2;
            C07241<E> r5 = r1;
            Object r6 = r7;
        L35:
            if (((Boolean) $result).booleanValue() == false) goto L42;
            r5.L$0 = $this$produce2;
            r5.L$1 = r3;
            r5.label = 3;
            Object e = $this$produce2.send(r3.next(), r5);
            if (e != r6) goto L39;
            return r6;
        L39:
            $result = $result3;
            $result2 = r6;
            r1 = r5;
            r2 = r3;
            $this$produce = $this$produce2;
            goto L30
        L42:
            return Unit.INSTANCE;
        L7:
            ChannelIterator<E> r8 = (ChannelIterator) this.L$1;
            ProducerScope $this$produce3 = (ProducerScope) this.L$0;
            ResultKt.throwOnFailure($result);
            $this$produce2 = $this$produce3;
            r3 = r8;
            r5 = this;
            r6 = $result2;
            $result3 = $result;
            goto L35
        L8:
            int remaining = this.I$0;
            ChannelIterator<E> r9 = (ChannelIterator) this.L$1;
            ProducerScope $this$produce4 = (ProducerScope) this.L$0;
            ResultKt.throwOnFailure($result);
            ProducerScope $this$produce5 = $this$produce4;
            ChannelIterator<E> r10 = r9;
            int remaining2 = remaining;
            C07241<E> r11 = this;
            Object r12 = $result2;
            Object $result4 = $result;
        L23:
            if (((Boolean) $result).booleanValue() == false) goto L28;
            r10.next();
            int remaining3 = remaining2 - 1;
            if (remaining3 == 0) goto L28;
            C07241<E> r13 = r11;
            int remaining4 = remaining3;
            $result = $result4;
            $result2 = r12;
            r1 = r13;
            ChannelIterator<E> r14 = r10;
            ProducerScope $this$produce6 = $this$produce5;
        L18:
            r1.L$0 = $this$produce6;
            r1.L$1 = r14;
            r1.I$0 = remaining4;
            r1.label = 1;
            Object r15 = r14.hasNext(r1);
            if (r15 != $result2) goto L21;
            return $result2;
        L21:
            Object r16 = $result2;
            $result4 = $result;
            $result = r15;
            $this$produce5 = $this$produce6;
            r10 = r14;
            remaining2 = remaining4;
            r11 = r1;
            r12 = r16;
        L28:
            $result = $result4;
            $result2 = r12;
            r1 = r11;
            $this$produce = $this$produce5;
        L29:
            r2 = r1.$this_drop.iterator();
            goto L30
        L9:
            ResultKt.throwOnFailure($result);
            r1 = this;
            $this$produce = (ProducerScope) r1.L$0;
            if (r1.$n < 0) goto L12;
            boolean r17 = true;
        L13:
            int r18 = r1.$n;
            if (r17 == false) goto L44;
            int remaining5 = r1.$n;
            if (remaining5 <= 0) goto L29;
            $this$produce6 = $this$produce;
            remaining4 = remaining5;
            r14 = r1.$this_drop.iterator();
            goto L18
        L44:
            throw new IllegalArgumentException(("Requested element count " + r18 + " is less than zero.").toString());
        L12:
            r17 = false;
            goto L13
        L5:
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Add missing generic type declarations: [E] */
    /* JADX INFO: renamed from: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$dropWhile$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: Deprecated.kt */
    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0003H\u008a@"}, d2 = {"<anonymous>", "", "E", "Lkotlinx/coroutines/channels/ProducerScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$dropWhile$1", f = "Deprecated.kt", i = {0, 1, 1, 2, 3, 4}, l = {211, 212, 213, 217, 218}, m = "invokeSuspend", n = {"$this$produce", "$this$produce", "e", "$this$produce", "$this$produce", "$this$produce"}, s = {"L$0", "L$0", "L$2", "L$0", "L$0", "L$0"})
    static final class C07251<E> extends SuspendLambda implements Function2<ProducerScope<? super E>, Continuation<? super Unit>, Object> {
        final /* synthetic */ Function2<E, Continuation<? super Boolean>, Object> $predicate;
        final /* synthetic */ ReceiveChannel<E> $this_dropWhile;
        private /* synthetic */ Object L$0;
        Object L$1;
        Object L$2;
        int label;

        /* JADX WARN: Multi-variable type inference failed */
        C07251(ReceiveChannel<? extends E> r2, Function2<? super E, ? super Continuation<? super Boolean>, ? extends Object> r3, Continuation<? super C07251> r4) {
            this.$this_dropWhile = r2;
            this.$predicate = r3;
            super(2, r4);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object r4, Continuation<?> r5) {
            C07251 r0 = new C07251(this.$this_dropWhile, this.$predicate, r5);
            r0.L$0 = r4;
            return r0;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object r2, Continuation<? super Unit> r3) {
            return invoke((ProducerScope) r2, r3);
        }

        public final Object invoke(ProducerScope<? super E> r3, Continuation<? super Unit> r4) {
            return ((C07251) create(r3, r4)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r2v15 */
        /* JADX WARN: Type inference failed for: r2v2 */
        /* JADX WARN: Type inference failed for: r2v3 */
        /* JADX WARN: Type inference failed for: r3v22 */
        /* JADX WARN: Type inference failed for: r3v6, types: [java.lang.Object] */
        /* JADX WARN: Type inference failed for: r3v9 */
        /* JADX WARN: Type inference failed for: r5v0 */
        /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object] */
        /* JADX WARN: Type inference failed for: r5v10 */
        /* JADX WARN: Type inference failed for: r5v11 */
        /* JADX WARN: Type inference failed for: r5v12, types: [java.lang.Object, kotlinx.coroutines.channels.ProducerScope] */
        /* JADX WARN: Type inference failed for: r5v13, types: [java.lang.Object] */
        /* JADX WARN: Type inference failed for: r5v14 */
        /* JADX WARN: Type inference failed for: r5v15 */
        /* JADX WARN: Type inference failed for: r5v16 */
        /* JADX WARN: Type inference failed for: r5v17 */
        /* JADX WARN: Type inference failed for: r5v18 */
        /* JADX WARN: Type inference failed for: r5v19 */
        /* JADX WARN: Type inference failed for: r5v20 */
        /* JADX WARN: Type inference failed for: r5v5 */
        /* JADX WARN: Type inference failed for: r5v6, types: [java.lang.Object, kotlinx.coroutines.channels.ProducerScope] */
        /* JADX WARN: Type inference failed for: r5v9 */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x00ad -> B:22:0x00b1). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:40:0x0112 -> B:31:0x00e1). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object r10) {
            Object r0 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            switch(this.label) {
                case 0: goto L11;
                case 1: goto L10;
                case 2: goto L9;
                case 3: goto L8;
                case 4: goto L7;
                case 5: goto L6;
                default: goto L5;
            };
        L6:
            ChannelIterator<E> r2 = (ChannelIterator) this.L$1;
            ProducerScope r3 = (ProducerScope) this.L$0;
            ResultKt.throwOnFailure(r10);
            ?? r5 = r3;
            C07251<E> r4 = this;
            Object r1 = r0;
            ChannelIterator<E> r11 = r2;
        L31:
            r4.L$0 = r5;
            r4.L$1 = r11;
            r4.label = 4;
            Object r6 = r11.hasNext(r4);
            if (r6 != r1) goto L34;
            return r1;
        L34:
            ChannelIterator<E> r7 = r11;
            r10 = r6;
            ?? r8 = r5;
        L36:
            if (((Boolean) r10).booleanValue() == false) goto L43;
            r4.L$0 = r8;
            r4.L$1 = r7;
            r4.label = 5;
            if (r8.send(r7.next(), r4) != r1) goto L40;
            return r1;
        L40:
            r11 = r7;
            r5 = r8;
            goto L31
        L43:
            return Unit.INSTANCE;
        L7:
            r7 = (ChannelIterator) this.L$1;
            ProducerScope r9 = (ProducerScope) this.L$0;
            ResultKt.throwOnFailure(r10);
            r8 = r9;
            r4 = this;
            r1 = r0;
            goto L36
        L8:
            C07251<E> r12 = this;
            ProducerScope r13 = (ProducerScope) r12.L$0;
            ResultKt.throwOnFailure(r10);
            ?? r14 = r13;
        L28:
            r4 = r12;
            ?? r15 = r14;
            r1 = r0;
        L30:
            r11 = r4.$this_dropWhile.iterator();
            r5 = r15;
            goto L31
        L9:
            Object r16 = this.L$2;
            ChannelIterator<E> r17 = (ChannelIterator) this.L$1;
            ProducerScope r18 = (ProducerScope) this.L$0;
            ResultKt.throwOnFailure(r10);
            ChannelIterator<E> r19 = r17;
            Object r20 = r16;
            r4 = this;
            r1 = r0;
            Object r21 = r10;
            ?? r22 = r18;
        L23:
            if (((Boolean) r10).booleanValue() == true) goto L29;
            r4.L$0 = r22;
            r4.L$1 = null;
            r4.L$2 = null;
            r4.label = 3;
            if (r22.send(r20, r4) != r1) goto L27;
            return r1;
        L27:
            r10 = r21;
            r0 = r1;
            r12 = r4;
            r14 = r22;
            goto L28
        L29:
            r10 = r21;
            r0 = r1;
            C07251<E> r23 = r4;
            ?? r24 = r22;
            ChannelIterator<E> r25 = r19;
        L12:
            r23.L$0 = r24;
            r23.L$1 = r25;
            r23.L$2 = null;
            r23.label = 1;
            Object r26 = r25.hasNext(r23);
            if (r26 != r0) goto L15;
            return r0;
        L15:
            Object r27 = r0;
            r21 = r10;
            r10 = r26;
            ?? r28 = r24;
            r4 = r23;
            r1 = r27;
        L16:
            r15 = r28;
            if (((Boolean) r10).booleanValue() == false) goto L30;
            E r110 = r25.next();
            Function2<E, Continuation<? super Boolean>, Object> r29 = r4.$predicate;
            r4.L$0 = r28;
            r4.L$1 = r25;
            r4.L$2 = r110;
            r4.label = 2;
            Object r30 = r29.invoke(r110, r4);
            if (r30 != r1) goto L21;
            return r1;
        L21:
            ChannelIterator<E> r31 = r25;
            r20 = r110;
            r10 = r30;
            r19 = r31;
            r22 = r28;
            goto L23
        L10:
            ChannelIterator<E> r32 = (ChannelIterator) this.L$1;
            ProducerScope r33 = (ProducerScope) this.L$0;
            ResultKt.throwOnFailure(r10);
            r28 = r33;
            r25 = r32;
            r4 = this;
            r1 = r0;
            r21 = r10;
            goto L16
        L11:
            ResultKt.throwOnFailure(r10);
            r23 = this;
            ProducerScope r34 = (ProducerScope) r23.L$0;
            r25 = r23.$this_dropWhile.iterator();
            r24 = r34;
            goto L12
        L5:
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$elementAt$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: Deprecated.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt", f = "Deprecated.kt", i = {0, 0, 0}, l = {68}, m = "elementAt", n = {"$this$consume$iv", "index", "count"}, s = {"L$0", "I$0", "I$1"})
    static final class C07261<E> extends ContinuationImpl {
        int I$0;
        int I$1;
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        C07261(Continuation<? super C07261> r1) {
            super(r1);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object r4) {
            this.result = r4;
            this.label |= Integer.MIN_VALUE;
            return ChannelsKt.elementAt(null, 0, this);
        }
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$elementAtOrNull$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: Deprecated.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt", f = "Deprecated.kt", i = {0, 0, 0}, l = {83}, m = "elementAtOrNull", n = {"$this$consume$iv", "index", "count"}, s = {"L$0", "I$0", "I$1"})
    static final class C07271<E> extends ContinuationImpl {
        int I$0;
        int I$1;
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        C07271(Continuation<? super C07271> r1) {
            super(r1);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object r4) {
            this.result = r4;
            this.label |= Integer.MIN_VALUE;
            return ChannelsKt.elementAtOrNull(null, 0, this);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [E] */
    /* JADX INFO: renamed from: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$filter$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: Deprecated.kt */
    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0003H\u008a@"}, d2 = {"<anonymous>", "", "E", "Lkotlinx/coroutines/channels/ProducerScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$filter$1", f = "Deprecated.kt", i = {0, 1, 1, 2}, l = {228, 229, 229}, m = "invokeSuspend", n = {"$this$produce", "$this$produce", "e", "$this$produce"}, s = {"L$0", "L$0", "L$2", "L$0"})
    static final class C07281<E> extends SuspendLambda implements Function2<ProducerScope<? super E>, Continuation<? super Unit>, Object> {
        final /* synthetic */ Function2<E, Continuation<? super Boolean>, Object> $predicate;
        final /* synthetic */ ReceiveChannel<E> $this_filter;
        private /* synthetic */ Object L$0;
        Object L$1;
        Object L$2;
        int label;

        /* JADX WARN: Multi-variable type inference failed */
        C07281(ReceiveChannel<? extends E> r2, Function2<? super E, ? super Continuation<? super Boolean>, ? extends Object> r3, Continuation<? super C07281> r4) {
            this.$this_filter = r2;
            this.$predicate = r3;
            super(2, r4);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object r4, Continuation<?> r5) {
            C07281 r0 = new C07281(this.$this_filter, this.$predicate, r5);
            r0.L$0 = r4;
            return r0;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object r2, Continuation<? super Unit> r3) {
            return invoke((ProducerScope) r2, r3);
        }

        public final Object invoke(ProducerScope<? super E> r3, Continuation<? super Unit> r4) {
            return ((C07281) create(r3, r4)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r4v10 */
        /* JADX WARN: Type inference failed for: r4v11 */
        /* JADX WARN: Type inference failed for: r4v14, types: [java.lang.Object] */
        /* JADX WARN: Type inference failed for: r4v18 */
        /* JADX WARN: Type inference failed for: r4v2 */
        /* JADX WARN: Type inference failed for: r5v0 */
        /* JADX WARN: Type inference failed for: r5v10 */
        /* JADX WARN: Type inference failed for: r5v5, types: [java.lang.Object] */
        /* JADX WARN: Type inference failed for: r6v0 */
        /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Object, kotlinx.coroutines.channels.ProducerScope] */
        /* JADX WARN: Type inference failed for: r6v4 */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x00b1 -> B:10:0x0059). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:27:0x00b7 -> B:10:0x0059). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object r10) {
            Object r0 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            switch(this.label) {
                case 0: goto L9;
                case 1: goto L8;
                case 2: goto L7;
                case 3: goto L6;
                default: goto L5;
            };
        L6:
            C07281<E> r1 = this;
            ChannelIterator<E> r3 = (ChannelIterator) r1.L$1;
            ProducerScope r4 = (ProducerScope) r1.L$0;
            ResultKt.throwOnFailure(r10);
            ?? r5 = r4;
        L10:
            r1.L$0 = r5;
            r1.L$1 = r3;
            r1.L$2 = null;
            r1.label = 1;
            Object r6 = r3.hasNext(r1);
            if (r6 != r0) goto L13;
            return r0;
        L13:
            Object r8 = r0;
            Object r2 = r10;
            r10 = r6;
            ?? r7 = r5;
            ChannelIterator<E> r9 = r3;
            C07281<E> r11 = r1;
            Object r12 = r8;
        L15:
            if (((Boolean) r10).booleanValue() == false) goto L29;
            E r13 = r9.next();
            Function2<E, Continuation<? super Boolean>, Object> r14 = r11.$predicate;
            r11.L$0 = r7;
            r11.L$1 = r9;
            r11.L$2 = r13;
            r11.label = 2;
            Object r15 = r14.invoke(r13, r11);
            if (r15 != r12) goto L19;
            return r12;
        L19:
            ChannelIterator<E> r16 = r9;
            Object r17 = r13;
            r10 = r15;
            ?? r18 = r7;
            ChannelIterator<E> r19 = r16;
        L21:
            if (((Boolean) r10).booleanValue() == false) goto L27;
            r11.L$0 = r18;
            r11.L$1 = r19;
            r11.L$2 = null;
            r11.label = 3;
            if (r18.send(r17, r11) != r12) goto L25;
            return r12;
        L25:
            r10 = r2;
            r0 = r12;
            r1 = r11;
            r3 = r19;
            r5 = r18;
            goto L10
        L27:
            r10 = r2;
            r0 = r12;
            r1 = r11;
            r3 = r19;
            r5 = r18;
            goto L10
        L29:
            return Unit.INSTANCE;
        L7:
            Object r20 = this.L$2;
            ChannelIterator<E> r21 = (ChannelIterator) this.L$1;
            ProducerScope r22 = (ProducerScope) this.L$0;
            ResultKt.throwOnFailure(r10);
            r18 = r22;
            r19 = r21;
            r17 = r20;
            r11 = this;
            r12 = r0;
            r2 = r10;
            goto L21
        L8:
            ChannelIterator<E> r23 = (ChannelIterator) this.L$1;
            ProducerScope r24 = (ProducerScope) this.L$0;
            ResultKt.throwOnFailure(r10);
            r7 = r24;
            r9 = r23;
            r11 = this;
            r12 = r0;
            r2 = r10;
            goto L15
        L9:
            ResultKt.throwOnFailure(r10);
            r1 = this;
            ProducerScope r25 = (ProducerScope) r1.L$0;
            ChannelIterator<E> r26 = r1.$this_filter.iterator();
            r5 = r25;
            r3 = r26;
            goto L10
        L5:
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Add missing generic type declarations: [E] */
    /* JADX INFO: renamed from: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$filterIndexed$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: Deprecated.kt */
    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0003H\u008a@"}, d2 = {"<anonymous>", "", "E", "Lkotlinx/coroutines/channels/ProducerScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$filterIndexed$1", f = "Deprecated.kt", i = {0, 0, 1, 1, 1, 2, 2}, l = {241, 242, 242}, m = "invokeSuspend", n = {"$this$produce", "index", "$this$produce", "e", "index", "$this$produce", "index"}, s = {"L$0", "I$0", "L$0", "L$2", "I$0", "L$0", "I$0"})
    static final class C07291<E> extends SuspendLambda implements Function2<ProducerScope<? super E>, Continuation<? super Unit>, Object> {
        final /* synthetic */ Function3<Integer, E, Continuation<? super Boolean>, Object> $predicate;
        final /* synthetic */ ReceiveChannel<E> $this_filterIndexed;
        int I$0;
        private /* synthetic */ Object L$0;
        Object L$1;
        Object L$2;
        int label;

        /* JADX WARN: Multi-variable type inference failed */
        C07291(ReceiveChannel<? extends E> r2, Function3<? super Integer, ? super E, ? super Continuation<? super Boolean>, ? extends Object> r3, Continuation<? super C07291> r4) {
            this.$this_filterIndexed = r2;
            this.$predicate = r3;
            super(2, r4);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object r4, Continuation<?> r5) {
            C07291 r0 = new C07291(this.$this_filterIndexed, this.$predicate, r5);
            r0.L$0 = r4;
            return r0;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object r2, Continuation<? super Unit> r3) {
            return invoke((ProducerScope) r2, r3);
        }

        public final Object invoke(ProducerScope<? super E> r3, Continuation<? super Unit> r4) {
            return ((C07291) create(r3, r4)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r5v10 */
        /* JADX WARN: Type inference failed for: r5v12, types: [java.lang.Object] */
        /* JADX WARN: Type inference failed for: r5v16 */
        /* JADX WARN: Type inference failed for: r5v2 */
        /* JADX WARN: Type inference failed for: r5v9 */
        /* JADX WARN: Type inference failed for: r6v0 */
        /* JADX WARN: Type inference failed for: r6v10 */
        /* JADX WARN: Type inference failed for: r6v3, types: [java.lang.Object, kotlinx.coroutines.channels.ProducerScope] */
        /* JADX WARN: Type inference failed for: r6v4, types: [java.lang.Object] */
        /* JADX WARN: Type inference failed for: r6v8 */
        /* JADX WARN: Type inference failed for: r6v9 */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x00c3 -> B:10:0x0060). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:27:0x00ca -> B:10:0x0060). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object r12) {
            Object r0 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            switch(this.label) {
                case 0: goto L9;
                case 1: goto L8;
                case 2: goto L7;
                case 3: goto L6;
                default: goto L5;
            };
        L6:
            C07291<E> r1 = this;
            int r3 = r1.I$0;
            ChannelIterator<E> r4 = (ChannelIterator) r1.L$1;
            ProducerScope r5 = (ProducerScope) r1.L$0;
            ResultKt.throwOnFailure(r12);
            ?? r6 = r5;
        L10:
            r1.L$0 = r6;
            r1.L$1 = r4;
            r1.L$2 = null;
            r1.I$0 = r3;
            r1.label = 1;
            Object r7 = r4.hasNext(r1);
            if (r7 != r0) goto L13;
            return r0;
        L13:
            Object r10 = r0;
            Object r2 = r12;
            r12 = r7;
            ?? r8 = r6;
            ChannelIterator<E> r9 = r4;
            int r11 = r3;
            C07291<E> r13 = r1;
            Object r14 = r10;
        L15:
            if (((Boolean) r12).booleanValue() == false) goto L29;
            E r15 = r9.next();
            Function3<Integer, E, Continuation<? super Boolean>, Object> r16 = r13.$predicate;
            int r17 = r11 + 1;
            Integer r18 = Boxing.boxInt(r11);
            r13.L$0 = r8;
            r13.L$1 = r9;
            r13.L$2 = r15;
            r13.I$0 = r17;
            r13.label = 2;
            Object r19 = r16.invoke(r18, r15, r13);
            if (r19 != r14) goto L19;
            return r14;
        L19:
            Object r20 = r15;
            r12 = r19;
            ?? r21 = r8;
        L21:
            if (((Boolean) r12).booleanValue() == false) goto L27;
            r13.L$0 = r21;
            r13.L$1 = r9;
            r13.L$2 = null;
            r13.I$0 = r17;
            r13.label = 3;
            if (r21.send(r20, r13) != r14) goto L25;
            return r14;
        L25:
            r12 = r2;
            r0 = r14;
            r1 = r13;
            r4 = r9;
            r6 = r21;
            r3 = r17;
            goto L10
        L27:
            r12 = r2;
            r0 = r14;
            r1 = r13;
            r4 = r9;
            r6 = r21;
            r3 = r17;
            goto L10
        L29:
            return Unit.INSTANCE;
        L7:
            int r22 = this.I$0;
            r20 = this.L$2;
            r9 = (ChannelIterator) this.L$1;
            ProducerScope r23 = (ProducerScope) this.L$0;
            ResultKt.throwOnFailure(r12);
            r17 = r22;
            r13 = this;
            r14 = r0;
            r2 = r12;
            r21 = r23;
            goto L21
        L8:
            int r24 = this.I$0;
            ChannelIterator<E> r25 = (ChannelIterator) this.L$1;
            ProducerScope r26 = (ProducerScope) this.L$0;
            ResultKt.throwOnFailure(r12);
            r8 = r26;
            r9 = r25;
            r11 = r24;
            r13 = this;
            r14 = r0;
            r2 = r12;
            goto L15
        L9:
            ResultKt.throwOnFailure(r12);
            r1 = this;
            ProducerScope r27 = (ProducerScope) r1.L$0;
            r6 = r27;
            r3 = 0;
            r4 = r1.$this_filterIndexed.iterator();
            goto L10
        L5:
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Add missing generic type declarations: [E] */
    /* JADX INFO: renamed from: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$filterNot$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: Deprecated.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u0002H\u0002H\u008a@"}, d2 = {"<anonymous>", "", "E", "it"}, k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$filterNot$1", f = "Deprecated.kt", i = {}, l = {252}, m = "invokeSuspend", n = {}, s = {})
    static final class C07301<E> extends SuspendLambda implements Function2<E, Continuation<? super Boolean>, Object> {
        final /* synthetic */ Function2<E, Continuation<? super Boolean>, Object> $predicate;
        /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: Multi-variable type inference failed */
        C07301(Function2<? super E, ? super Continuation<? super Boolean>, ? extends Object> r2, Continuation<? super C07301> r3) {
            this.$predicate = r2;
            super(2, r3);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object r3, Continuation<?> r4) {
            C07301 r0 = new C07301(this.$predicate, r4);
            r0.L$0 = r3;
            return r0;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object r2, Continuation<? super Boolean> r3) {
            return invoke2(r2, r3);
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(E r3, Continuation<? super Boolean> r4) {
            return ((C07301) create(r3, r4)).invokeSuspend(Unit.INSTANCE);
        }

        /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type java.lang.Object to kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$filterNot$1<E> for r5v1 'this'  java.lang.Object
            	at jadx.core.dex.instructions.args.SSAVar.setType(SSAVar.java:114)
            	at jadx.core.dex.instructions.args.RegisterArg.setType(RegisterArg.java:52)
            	at jadx.core.dex.visitors.ModVisitor.removeCheckCast(ModVisitor.java:417)
            	at jadx.core.dex.visitors.ModVisitor.replaceStep(ModVisitor.java:152)
            	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
            */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object r6) {
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int r1 = r5.label;
            switch(r1) {
                case 0: goto L7;
                case 1: goto L6;
                default: goto L4;
            };
        L4:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            throw r6;
        L6:
            kotlin.ResultKt.throwOnFailure(r6);
        L11:
            java.lang.Boolean r6 = (java.lang.Boolean) r6;
            boolean r6 = r6.booleanValue();
            boolean r6 = r6 ^ true;
            java.lang.Boolean r6 = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(r6);
            return r6;
        L7:
            kotlin.ResultKt.throwOnFailure(r6);
            java.lang.Object r3 = r5.L$0;
            kotlin.jvm.functions.Function2<E, kotlin.coroutines.Continuation<? super java.lang.Boolean>, java.lang.Object> r4 = r5.$predicate;
            r5.label = 1;
            E r3 = (E) r3;
            java.lang.Object r5 = (kotlin.coroutines.Continuation<? super java.lang.Boolean>) r5;
            java.lang.Object r3 = r4.invoke(r3, r5);
            if (r3 != r0) goto L10;
            return r0;
        L10:
            r6 = r3;
            goto L11
        }
    }

    /* JADX INFO: Add missing generic type declarations: [E] */
    /* JADX INFO: renamed from: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$filterNotNull$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: Deprecated.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u0001H\u0002H\u008a@"}, d2 = {"<anonymous>", "", "E", "", "it"}, k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$filterNotNull$1", f = "Deprecated.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class C07311<E> extends SuspendLambda implements Function2<E, Continuation<? super Boolean>, Object> {
        /* synthetic */ Object L$0;
        int label;

        C07311(Continuation<? super C07311> r2) {
            super(2, r2);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object r2, Continuation<?> r3) {
            C07311 r0 = new C07311(r3);
            r0.L$0 = r2;
            return r0;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object r2, Continuation<? super Boolean> r3) {
            return invoke2(r2, r3);
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(E r3, Continuation<? super Boolean> r4) {
            return ((C07311) create(r3, r4)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object r4) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            switch(this.label) {
                case 0: goto L6;
                default: goto L5;
            };
        L6:
            ResultKt.throwOnFailure(r4);
            Object it = this.L$0;
            if (it == null) goto L9;
            boolean r2 = true;
        L11:
            return Boxing.boxBoolean(r2);
        L9:
            r2 = false;
            goto L11
        L5:
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$filterNotNullTo$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: Deprecated.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt", f = "Deprecated.kt", i = {0, 0}, l = {517}, m = "filterNotNullTo", n = {"destination", "$this$consume$iv$iv"}, s = {"L$0", "L$1"})
    static final class C07321<E, C extends Collection<? super E>> extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        C07321(Continuation<? super C07321> r1) {
            super(r1);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object r3) {
            this.result = r3;
            this.label |= Integer.MIN_VALUE;
            return ChannelsKt.filterNotNullTo(null, null, this);
        }
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$filterNotNullTo$3, reason: invalid class name */
    /* JADX INFO: compiled from: Deprecated.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt", f = "Deprecated.kt", i = {0, 0, 1, 1}, l = {517, 272}, m = "filterNotNullTo", n = {"destination", "$this$consume$iv$iv", "destination", "$this$consume$iv$iv"}, s = {"L$0", "L$1", "L$0", "L$1"})
    static final class AnonymousClass3<E, C extends SendChannel<? super E>> extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        AnonymousClass3(Continuation<? super AnonymousClass3> r1) {
            super(r1);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object r3) {
            this.result = r3;
            this.label |= Integer.MIN_VALUE;
            return ChannelsKt.filterNotNullTo(null, null, this);
        }
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$first$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: Deprecated.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt", f = "Deprecated.kt", i = {0, 0}, l = {95}, m = "first", n = {"$this$consume$iv", "iterator"}, s = {"L$0", "L$1"})
    static final class C07331<E> extends ContinuationImpl {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        C07331(Continuation<? super C07331> r1) {
            super(r1);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object r3) {
            this.result = r3;
            this.label |= Integer.MIN_VALUE;
            return ChannelsKt.first(null, this);
        }
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$firstOrNull$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: Deprecated.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt", f = "Deprecated.kt", i = {0, 0}, l = {105}, m = "firstOrNull", n = {"$this$consume$iv", "iterator"}, s = {"L$0", "L$1"})
    static final class C07341<E> extends ContinuationImpl {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        C07341(Continuation<? super C07341> r1) {
            super(r1);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object r3) {
            this.result = r3;
            this.label |= Integer.MIN_VALUE;
            return ChannelsKt.firstOrNull(null, this);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    /* JADX INFO: renamed from: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$flatMap$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: Deprecated.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003*\b\u0012\u0004\u0012\u0002H\u00030\u0004H\u008a@"}, d2 = {"<anonymous>", "", "E", "R", "Lkotlinx/coroutines/channels/ProducerScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$flatMap$1", f = "Deprecated.kt", i = {0, 1, 2}, l = {351, 352, 352}, m = "invokeSuspend", n = {"$this$produce", "$this$produce", "$this$produce"}, s = {"L$0", "L$0", "L$0"})
    static final class C07351<R> extends SuspendLambda implements Function2<ProducerScope<? super R>, Continuation<? super Unit>, Object> {
        final /* synthetic */ ReceiveChannel<E> $this_flatMap;
        final /* synthetic */ Function2<E, Continuation<? super ReceiveChannel<? extends R>>, Object> $transform;
        private /* synthetic */ Object L$0;
        Object L$1;
        int label;

        /* JADX WARN: Multi-variable type inference failed */
        C07351(ReceiveChannel<? extends E> r2, Function2<? super E, ? super Continuation<? super ReceiveChannel<? extends R>>, ? extends Object> r3, Continuation<? super C07351> r4) {
            this.$this_flatMap = r2;
            this.$transform = r3;
            super(2, r4);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object r4, Continuation<?> r5) {
            C07351 r0 = new C07351(this.$this_flatMap, this.$transform, r5);
            r0.L$0 = r4;
            return r0;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object r2, Continuation<? super Unit> r3) {
            return invoke((ProducerScope) r2, r3);
        }

        public final Object invoke(ProducerScope<? super R> r3, Continuation<? super Unit> r4) {
            return ((C07351) create(r3, r4)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x009f -> B:10:0x0055). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object r10) {
            Object r0 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            switch(this.label) {
                case 0: goto L9;
                case 1: goto L8;
                case 2: goto L7;
                case 3: goto L6;
                default: goto L5;
            };
        L6:
            C07351<R> r1 = this;
            ChannelIterator r2 = (ChannelIterator) r1.L$1;
            ProducerScope r3 = (ProducerScope) r1.L$0;
            ResultKt.throwOnFailure(r10);
        L10:
            r1.L$0 = r3;
            r1.L$1 = r2;
            r1.label = 1;
            Object r4 = r2.hasNext(r1);
            if (r4 != r0) goto L13;
            return r0;
        L13:
            Object r8 = r0;
            Object r5 = r10;
            r10 = r4;
            ProducerScope r6 = r3;
            ChannelIterator r7 = r2;
            C07351<R> r9 = r1;
            Object r11 = r8;
        L15:
            if (((Boolean) r10).booleanValue() == false) goto L25;
            Object r12 = r7.next();
            Function2<E, Continuation<? super ReceiveChannel<? extends R>>, Object> r13 = r9.$transform;
            r9.L$0 = r6;
            r9.L$1 = r7;
            r9.label = 2;
            r10 = r13.invoke((E) r12, r9);
            if (r10 != r11) goto L19;
            return r11;
        L19:
            r9.L$0 = r6;
            r9.L$1 = r7;
            r9.label = 3;
            if (ChannelsKt.toChannel((ReceiveChannel) r10, r6, r9) != r11) goto L22;
            return r11;
        L22:
            r10 = r5;
            r0 = r11;
            r1 = r9;
            r2 = r7;
            r3 = r6;
            goto L10
        L25:
            return Unit.INSTANCE;
        L7:
            ChannelIterator r14 = (ChannelIterator) this.L$1;
            ProducerScope r15 = (ProducerScope) this.L$0;
            ResultKt.throwOnFailure(r10);
            r6 = r15;
            r7 = r14;
            r9 = this;
            r11 = r0;
            r5 = r10;
            goto L19
        L8:
            ChannelIterator r16 = (ChannelIterator) this.L$1;
            ProducerScope r17 = (ProducerScope) this.L$0;
            ResultKt.throwOnFailure(r10);
            r6 = r17;
            r7 = r16;
            r9 = this;
            r11 = r0;
            r5 = r10;
            goto L15
        L9:
            ResultKt.throwOnFailure(r10);
            r1 = this;
            ProducerScope r18 = (ProducerScope) r1.L$0;
            ChannelIterator r19 = r1.$this_flatMap.iterator();
            r3 = r18;
            r2 = r19;
            goto L10
        L5:
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$indexOf$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: Deprecated.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt", f = "Deprecated.kt", i = {0, 0, 0}, l = {517}, m = "indexOf", n = {"element", "index", "$this$consume$iv$iv"}, s = {"L$0", "L$1", "L$2"})
    static final class C07361<E> extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;
        /* synthetic */ Object result;

        C07361(Continuation<? super C07361> r1) {
            super(r1);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object r3) {
            this.result = r3;
            this.label |= Integer.MIN_VALUE;
            return ChannelsKt.indexOf(null, null, this);
        }
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$last$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: Deprecated.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt", f = "Deprecated.kt", i = {0, 0, 1, 1, 1}, l = {WorkQueueKt.MASK, 130}, m = "last", n = {"$this$consume$iv", "iterator", "$this$consume$iv", "iterator", "last"}, s = {"L$0", "L$1", "L$0", "L$1", "L$2"})
    static final class C07371<E> extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        C07371(Continuation<? super C07371> r1) {
            super(r1);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object r3) {
            this.result = r3;
            this.label |= Integer.MIN_VALUE;
            return ChannelsKt.last(null, this);
        }
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$lastIndexOf$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: Deprecated.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt", f = "Deprecated.kt", i = {0, 0, 0, 0}, l = {517}, m = "lastIndexOf", n = {"element", "lastIndex", "index", "$this$consume$iv$iv"}, s = {"L$0", "L$1", "L$2", "L$3"})
    static final class C07381<E> extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        int label;
        /* synthetic */ Object result;

        C07381(Continuation<? super C07381> r1) {
            super(r1);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object r3) {
            this.result = r3;
            this.label |= Integer.MIN_VALUE;
            return ChannelsKt.lastIndexOf(null, null, this);
        }
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$lastOrNull$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: Deprecated.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt", f = "Deprecated.kt", i = {0, 0, 1, 1, 1}, l = {153, 156}, m = "lastOrNull", n = {"$this$consume$iv", "iterator", "$this$consume$iv", "iterator", "last"}, s = {"L$0", "L$1", "L$0", "L$1", "L$2"})
    static final class C07391<E> extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        C07391(Continuation<? super C07391> r1) {
            super(r1);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object r3) {
            this.result = r3;
            this.label |= Integer.MIN_VALUE;
            return ChannelsKt.lastOrNull(null, this);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    /* JADX INFO: renamed from: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$map$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: Deprecated.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003*\b\u0012\u0004\u0012\u0002H\u00030\u0004H\u008a@"}, d2 = {"<anonymous>", "", "E", "R", "Lkotlinx/coroutines/channels/ProducerScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$map$1", f = "Deprecated.kt", i = {0, 0, 1, 1, 2, 2}, l = {517, 363, 363}, m = "invokeSuspend", n = {"$this$produce", "$this$consume$iv$iv", "$this$produce", "$this$consume$iv$iv", "$this$produce", "$this$consume$iv$iv"}, s = {"L$0", "L$2", "L$0", "L$2", "L$0", "L$2"})
    static final class C07401<R> extends SuspendLambda implements Function2<ProducerScope<? super R>, Continuation<? super Unit>, Object> {
        final /* synthetic */ ReceiveChannel<E> $this_map;
        final /* synthetic */ Function2<E, Continuation<? super R>, Object> $transform;
        private /* synthetic */ Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        int label;

        /* JADX WARN: Multi-variable type inference failed */
        C07401(ReceiveChannel<? extends E> r2, Function2<? super E, ? super Continuation<? super R>, ? extends Object> r3, Continuation<? super C07401> r4) {
            this.$this_map = r2;
            this.$transform = r3;
            super(2, r4);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object r4, Continuation<?> r5) {
            C07401 r0 = new C07401(this.$this_map, this.$transform, r5);
            r0.L$0 = r4;
            return r0;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object r2, Continuation<? super Unit> r3) {
            return invoke((ProducerScope) r2, r3);
        }

        public final Object invoke(ProducerScope<? super R> r3, Continuation<? super Unit> r4) {
            return ((C07401) create(r3, r4)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x00fd -> B:35:0x0106). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object r18) {
            Object r0 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            switch(this.label) {
                case 0: goto L19;
                case 1: goto L14;
                case 2: goto L9;
                case 3: goto L6;
                default: goto L5;
            };
        L6:
            C07401<R> r2 = this;
            Object $result = r18;
            ChannelIterator r8 = (ChannelIterator) r2.L$3;
            Throwable cause$iv$iv = null;
            ReceiveChannel $this$consume$iv$iv = (ReceiveChannel) r2.L$2;
            Function2 r11 = (Function2) r2.L$1;
            ProducerScope $this$produce = (ProducerScope) r2.L$0;
            ResultKt.throwOnFailure($result);     // Catch: Throwable -> L17
            int $i$f$consumeEach = 0;
            ProducerScope $this$produce2 = $this$produce;
            ChannelIterator r12 = r8;
        L35:
            int $i$f$consumeEach2 = $i$f$consumeEach;
            Function2 r9 = r11;
        L21:
            r2.L$0 = $this$produce2;     // Catch: Throwable -> L41
            r2.L$1 = r9;     // Catch: Throwable -> L41
            r2.L$2 = $this$consume$iv$iv;     // Catch: Throwable -> L41
            r2.L$3 = r12;     // Catch: Throwable -> L41
            r2.label = 1;     // Catch: Throwable -> L41
            Object r13 = r12.hasNext(r2);     // Catch: Throwable -> L41
            if (r13 != r0) goto L24;
            return r0;
        L24:
            ProducerScope r16 = $this$produce2;
            Object $result2 = $result;
            Object $result3 = r13;
            ReceiveChannel $this$consume$iv$iv2 = $this$consume$iv$iv;
            Throwable cause$iv$iv2 = cause$iv$iv;
            Function2 r10 = r9;
            ProducerScope $this$produce3 = r16;
        L50:
        L39:
            e$iv$iv = th;
            $this$consume$iv$iv = $this$consume$iv$iv2;
        L43:
            Throwable cause$iv$iv3 = e$iv$iv;
            throw e$iv$iv;     // Catch: Throwable -> L45
        L45:
            e$iv$iv = move-exception;
            ChannelsKt.cancelConsumed($this$consume$iv$iv, cause$iv$iv3);
            throw e$iv$iv;
        L26:
            if (((Boolean) $result3).booleanValue() == false) goto L36;
            Object it = r12.next();     // Catch: Throwable -> L39
            ProducerScope $this$produce4 = null;
            r2.L$0 = $this$produce3;     // Catch: Throwable -> L39
            r2.L$1 = r10;     // Catch: Throwable -> L39
            r2.L$2 = $this$consume$iv$iv2;     // Catch: Throwable -> L39
            r2.L$3 = r12;     // Catch: Throwable -> L39
            r2.L$4 = $this$produce3;     // Catch: Throwable -> L39
            r2.label = 2;     // Catch: Throwable -> L39
            Object r14 = r10.invoke(it, r2);     // Catch: Throwable -> L39
            if (r14 != r0) goto L30;
            return r0;
        L30:
            ChannelIterator r3 = r12;
            Function2 r15 = r10;
            ChannelIterator r17 = r3;
            Object $result4 = r14;
            ProducerScope $this$produce5 = $this$produce3;
        L31:
            r2.L$0 = $this$produce5;     // Catch: Throwable -> L39
            r2.L$1 = r15;     // Catch: Throwable -> L39
            r2.L$2 = $this$consume$iv$iv2;     // Catch: Throwable -> L39
            r2.L$3 = r17;     // Catch: Throwable -> L39
            r2.L$4 = null;     // Catch: Throwable -> L39
            r2.label = 3;     // Catch: Throwable -> L39
            if ($this$produce3.send($result4, r2) != r0) goto L34;
            return r0;
        L34:
            Function2 r4 = r15;
            r12 = r17;
            cause$iv$iv = cause$iv$iv2;
            $this$consume$iv$iv = $this$consume$iv$iv2;
            r11 = r4;
            $result = $result2;
            $i$f$consumeEach = $i$f$consumeEach2;
            $this$produce2 = $this$produce5;
            goto L35
        L36:
            Unit r1 = Unit.INSTANCE;     // Catch: Throwable -> L39
            ChannelsKt.cancelConsumed($this$consume$iv$iv2, cause$iv$iv2);
            return Unit.INSTANCE;
        L41:
            e$iv$iv = th;
            goto L43
        L9:
            r2 = this;
            $result4 = r18;
            $this$produce3 = (ProducerScope) r2.L$4;
            r17 = (ChannelIterator) r2.L$3;
            cause$iv$iv2 = null;
            $this$consume$iv$iv2 = (ReceiveChannel) r2.L$2;
            r15 = (Function2) r2.L$1;
            ProducerScope $this$produce6 = (ProducerScope) r2.L$0;
            ResultKt.throwOnFailure($result4);     // Catch: Throwable -> L12
            $this$produce5 = $this$produce6;
            $this$produce4 = null;
            $i$f$consumeEach2 = 0;
            $result2 = $result4;
        L12:
            e$iv$iv = th;
            $this$consume$iv$iv = $this$consume$iv$iv2;
            goto L43
        L14:
            r2 = this;
            $result3 = r18;
            ChannelIterator r7 = (ChannelIterator) r2.L$3;
            ReceiveChannel $this$consume$iv$iv3 = (ReceiveChannel) r2.L$2;
            Function2 r19 = (Function2) r2.L$1;
            ProducerScope $this$produce7 = (ProducerScope) r2.L$0;
            ResultKt.throwOnFailure($result3);     // Catch: Throwable -> L17
            r10 = r19;
            $this$produce3 = $this$produce7;
            $this$consume$iv$iv2 = $this$consume$iv$iv3;
            cause$iv$iv2 = null;
            r12 = r7;
            $i$f$consumeEach2 = 0;
            $result2 = $result3;
            goto L50
        L19:
            ResultKt.throwOnFailure(r18);
            r2 = this;
            $result = r18;
            $this$produce2 = (ProducerScope) r2.L$0;
            ReceiveChannel $this$consumeEach$iv = r2.$this_map;
            Function2 r6 = r2.$transform;
            $i$f$consumeEach2 = 0;
            $this$consume$iv$iv = $this$consumeEach$iv;
            cause$iv$iv = null;
            r12 = $this$consume$iv$iv.iterator();     // Catch: Throwable -> L41
            r9 = r6;
            goto L21
        L5:
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        L17:
            e$iv$iv = th;
            goto L43
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    /* JADX INFO: renamed from: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$mapIndexed$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: Deprecated.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003*\b\u0012\u0004\u0012\u0002H\u00030\u0004H\u008a@"}, d2 = {"<anonymous>", "", "E", "R", "Lkotlinx/coroutines/channels/ProducerScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$mapIndexed$1", f = "Deprecated.kt", i = {0, 0, 1, 1, 2, 2}, l = {374, 375, 375}, m = "invokeSuspend", n = {"$this$produce", "index", "$this$produce", "index", "$this$produce", "index"}, s = {"L$0", "I$0", "L$0", "I$0", "L$0", "I$0"})
    static final class C07411<R> extends SuspendLambda implements Function2<ProducerScope<? super R>, Continuation<? super Unit>, Object> {
        final /* synthetic */ ReceiveChannel<E> $this_mapIndexed;
        final /* synthetic */ Function3<Integer, E, Continuation<? super R>, Object> $transform;
        int I$0;
        private /* synthetic */ Object L$0;
        Object L$1;
        Object L$2;
        int label;

        /* JADX WARN: Multi-variable type inference failed */
        C07411(ReceiveChannel<? extends E> r2, Function3<? super Integer, ? super E, ? super Continuation<? super R>, ? extends Object> r3, Continuation<? super C07411> r4) {
            this.$this_mapIndexed = r2;
            this.$transform = r3;
            super(2, r4);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object r4, Continuation<?> r5) {
            C07411 r0 = new C07411(this.$this_mapIndexed, this.$transform, r5);
            r0.L$0 = r4;
            return r0;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object r2, Continuation<? super Unit> r3) {
            return invoke((ProducerScope) r2, r3);
        }

        public final Object invoke(ProducerScope<? super R> r3, Continuation<? super Unit> r4) {
            return ((C07411) create(r3, r4)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x00b9 -> B:10:0x0060). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object r11) {
            Object r0 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            switch(this.label) {
                case 0: goto L9;
                case 1: goto L8;
                case 2: goto L7;
                case 3: goto L6;
                default: goto L5;
            };
        L6:
            C07411<R> r1 = this;
            int r2 = r1.I$0;
            ChannelIterator r3 = (ChannelIterator) r1.L$1;
            ProducerScope r4 = (ProducerScope) r1.L$0;
            ResultKt.throwOnFailure(r11);
            int r5 = r2;
            ProducerScope r6 = r4;
            ChannelIterator r7 = r3;
        L10:
            r1.L$0 = r6;
            r1.L$1 = r7;
            r1.I$0 = r5;
            r1.label = 1;
            Object r8 = r7.hasNext(r1);
            if (r8 != r0) goto L13;
            return r0;
        L13:
            Object r9 = r0;
            Object r10 = r11;
            r11 = r8;
            ChannelIterator r12 = r7;
            ProducerScope r13 = r6;
            C07411<R> r14 = r1;
            Object r15 = r9;
        L15:
            if (((Boolean) r11).booleanValue() == false) goto L26;
            Object r16 = r12.next();
            Function3<Integer, E, Continuation<? super R>, Object> r17 = r14.$transform;
            int r18 = r5 + 1;
            Integer r19 = Boxing.boxInt(r5);
            r14.L$0 = r13;
            r14.L$1 = r12;
            r14.L$2 = r13;
            r14.I$0 = r18;
            r14.label = 2;
            r11 = r17.invoke(r19, (E) r16, r14);
            if (r11 != r15) goto L19;
            return r15;
        L19:
            ProducerScope r20 = r13;
            r7 = r12;
            ProducerScope r21 = r20;
        L20:
            r14.L$0 = r21;
            r14.L$1 = r7;
            r14.L$2 = null;
            r14.I$0 = r18;
            r14.label = 3;
            if (r20.send(r11, r14) != r15) goto L23;
            return r15;
        L23:
            r11 = r10;
            r0 = r15;
            r1 = r14;
            r6 = r21;
            r5 = r18;
            goto L10
        L26:
            return Unit.INSTANCE;
        L7:
            int r22 = this.I$0;
            r20 = (ProducerScope) this.L$2;
            r7 = (ChannelIterator) this.L$1;
            r21 = (ProducerScope) this.L$0;
            ResultKt.throwOnFailure(r11);
            r18 = r22;
            r14 = this;
            r15 = r0;
            r10 = r11;
            goto L20
        L8:
            int r23 = this.I$0;
            ChannelIterator r24 = (ChannelIterator) this.L$1;
            r13 = (ProducerScope) this.L$0;
            ResultKt.throwOnFailure(r11);
            r12 = r24;
            r5 = r23;
            r14 = this;
            r15 = r0;
            r10 = r11;
            goto L15
        L9:
            ResultKt.throwOnFailure(r11);
            r1 = this;
            r6 = (ProducerScope) r1.L$0;
            r5 = 0;
            r7 = r1.$this_mapIndexed.iterator();
            goto L10
        L5:
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$maxWith$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: Deprecated.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt", f = "Deprecated.kt", i = {0, 0, 0, 1, 1, 1, 1}, l = {450, 452}, m = "maxWith", n = {"comparator", "$this$consume$iv", "iterator", "comparator", "$this$consume$iv", "iterator", "max"}, s = {"L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "L$3"})
    static final class C07421<E> extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;
        /* synthetic */ Object result;

        C07421(Continuation<? super C07421> r1) {
            super(r1);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object r3) {
            this.result = r3;
            this.label |= Integer.MIN_VALUE;
            return ChannelsKt.maxWith(null, null, this);
        }
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$minWith$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: Deprecated.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt", f = "Deprecated.kt", i = {0, 0, 0, 1, 1, 1, 1}, l = {464, 466}, m = "minWith", n = {"comparator", "$this$consume$iv", "iterator", "comparator", "$this$consume$iv", "iterator", "min"}, s = {"L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "L$3"})
    static final class C07431<E> extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;
        /* synthetic */ Object result;

        C07431(Continuation<? super C07431> r1) {
            super(r1);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object r3) {
            this.result = r3;
            this.label |= Integer.MIN_VALUE;
            return ChannelsKt.minWith(null, null, this);
        }
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$none$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: Deprecated.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt", f = "Deprecated.kt", i = {0}, l = {477}, m = "none", n = {"$this$consume$iv"}, s = {"L$0"})
    static final class C07441<E> extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        C07441(Continuation<? super C07441> r1) {
            super(r1);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object r3) {
            this.result = r3;
            this.label |= Integer.MIN_VALUE;
            return ChannelsKt.none(null, this);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [E] */
    /* JADX INFO: renamed from: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$requireNoNulls$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: Deprecated.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\u0010\u0000\u001a\u0002H\u0001\"\b\b\u0000\u0010\u0001*\u00020\u00022\b\u0010\u0003\u001a\u0004\u0018\u0001H\u0001H\u008a@"}, d2 = {"<anonymous>", "E", "", "it"}, k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$requireNoNulls$1", f = "Deprecated.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class C07451<E> extends SuspendLambda implements Function2<E, Continuation<? super E>, Object> {
        final /* synthetic */ ReceiveChannel<E> $this_requireNoNulls;
        /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: Multi-variable type inference failed */
        C07451(ReceiveChannel<? extends E> r2, Continuation<? super C07451> r3) {
            this.$this_requireNoNulls = r2;
            super(2, r3);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object r3, Continuation<?> r4) {
            C07451 r0 = new C07451(this.$this_requireNoNulls, r4);
            r0.L$0 = r3;
            return r0;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object r2, Object r3) {
            return invoke(r2, (Continuation) r3);
        }

        public final Object invoke(E r3, Continuation<? super E> r4) {
            return ((C07451) create(r3, r4)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object r6) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            switch(this.label) {
                case 0: goto L6;
                default: goto L5;
            };
        L6:
            ResultKt.throwOnFailure(r6);
            Object it = this.L$0;
            if (it == null) goto L10;
            return it;
        L10:
            throw new IllegalArgumentException("null element found in " + this.$this_requireNoNulls + '.');
        L5:
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$single$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: Deprecated.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt", f = "Deprecated.kt", i = {0, 0, 1, 1}, l = {166, 169}, m = "single", n = {"$this$consume$iv", "iterator", "$this$consume$iv", "single"}, s = {"L$0", "L$1", "L$0", "L$1"})
    static final class C07461<E> extends ContinuationImpl {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        C07461(Continuation<? super C07461> r1) {
            super(r1);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object r3) {
            this.result = r3;
            this.label |= Integer.MIN_VALUE;
            return ChannelsKt.single(null, this);
        }
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$singleOrNull$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: Deprecated.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt", f = "Deprecated.kt", i = {0, 0, 1, 1}, l = {179, 182}, m = "singleOrNull", n = {"$this$consume$iv", "iterator", "$this$consume$iv", "single"}, s = {"L$0", "L$1", "L$0", "L$1"})
    static final class C07471<E> extends ContinuationImpl {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        C07471(Continuation<? super C07471> r1) {
            super(r1);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object r3) {
            this.result = r3;
            this.label |= Integer.MIN_VALUE;
            return ChannelsKt.singleOrNull(null, this);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [E] */
    /* JADX INFO: renamed from: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$take$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: Deprecated.kt */
    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0003H\u008a@"}, d2 = {"<anonymous>", "", "E", "Lkotlinx/coroutines/channels/ProducerScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$take$1", f = "Deprecated.kt", i = {0, 0, 1, 1}, l = {284, 285}, m = "invokeSuspend", n = {"$this$produce", "remaining", "$this$produce", "remaining"}, s = {"L$0", "I$0", "L$0", "I$0"})
    static final class C07481<E> extends SuspendLambda implements Function2<ProducerScope<? super E>, Continuation<? super Unit>, Object> {
        final /* synthetic */ int $n;
        final /* synthetic */ ReceiveChannel<E> $this_take;
        int I$0;
        private /* synthetic */ Object L$0;
        Object L$1;
        int label;

        /* JADX WARN: Multi-variable type inference failed */
        C07481(int r2, ReceiveChannel<? extends E> r3, Continuation<? super C07481> r4) {
            this.$n = r2;
            this.$this_take = r3;
            super(2, r4);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object r4, Continuation<?> r5) {
            C07481 r0 = new C07481(this.$n, this.$this_take, r5);
            r0.L$0 = r4;
            return r0;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object r2, Continuation<? super Unit> r3) {
            return invoke((ProducerScope) r2, r3);
        }

        public final Object invoke(ProducerScope<? super E> r3, Continuation<? super Unit> r4) {
            return ((C07481) create(r3, r4)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:28:0x0090 -> B:29:0x0096). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object $result) {
            Object $result2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            switch(this.label) {
                case 0: goto L8;
                case 1: goto L7;
                case 2: goto L6;
                default: goto L5;
            };
        L6:
            C07481<E> r1 = this;
            int remaining = r1.I$0;
            ChannelIterator<E> r4 = (ChannelIterator) r1.L$1;
            ProducerScope $this$produce = (ProducerScope) r1.L$0;
            ResultKt.throwOnFailure($result);
        L29:
            int remaining2 = remaining - 1;
            if (remaining2 == 0) goto L32;
            ChannelIterator<E> r9 = r4;
            int remaining3 = remaining2;
            ProducerScope $this$produce2 = $this$produce;
            ChannelIterator<E> r5 = r9;
        L19:
            r1.L$0 = $this$produce2;
            r1.L$1 = r5;
            r1.I$0 = remaining3;
            r1.label = 1;
            Object r6 = r5.hasNext(r1);
            if (r6 != $result2) goto L22;
            return $result2;
        L22:
            Object r10 = $result2;
            Object $result3 = $result;
            $result = r6;
            ProducerScope $this$produce3 = $this$produce2;
            C07481<E> r3 = r1;
            Object r2 = r10;
        L24:
            if (((Boolean) $result).booleanValue() == false) goto L35;
            r3.L$0 = $this$produce3;
            r3.L$1 = r5;
            r3.I$0 = remaining3;
            r3.label = 2;
            Object e = $this$produce3.send(r5.next(), r3);
            if (e != r2) goto L28;
            return r2;
        L28:
            $result = $result3;
            $result2 = r2;
            r1 = r3;
            remaining = remaining3;
            r4 = r5;
            $this$produce = $this$produce3;
            goto L29
        L35:
            return Unit.INSTANCE;
        L32:
            return Unit.INSTANCE;
        L7:
            int remaining4 = this.I$0;
            ChannelIterator<E> r7 = (ChannelIterator) this.L$1;
            ProducerScope $this$produce4 = (ProducerScope) this.L$0;
            ResultKt.throwOnFailure($result);
            $this$produce3 = $this$produce4;
            r5 = r7;
            remaining3 = remaining4;
            r3 = this;
            r2 = $result2;
            $result3 = $result;
            goto L24
        L8:
            ResultKt.throwOnFailure($result);
            r1 = this;
            $this$produce2 = (ProducerScope) r1.L$0;
            if (r1.$n != 0) goto L13;
            return Unit.INSTANCE;
        L13:
            if (r1.$n < 0) goto L15;
            boolean r8 = true;
        L16:
            int r11 = r1.$n;
            if (r8 == false) goto L37;
            remaining3 = r1.$n;
            r5 = r1.$this_take.iterator();
            goto L19
        L37:
            throw new IllegalArgumentException(("Requested element count " + r11 + " is less than zero.").toString());
        L15:
            r8 = false;
            goto L16
        L5:
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Add missing generic type declarations: [E] */
    /* JADX INFO: renamed from: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$takeWhile$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: Deprecated.kt */
    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0003H\u008a@"}, d2 = {"<anonymous>", "", "E", "Lkotlinx/coroutines/channels/ProducerScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$takeWhile$1", f = "Deprecated.kt", i = {0, 1, 1, 2}, l = {299, AnimationConstants.DefaultDurationMillis, 301}, m = "invokeSuspend", n = {"$this$produce", "$this$produce", "e", "$this$produce"}, s = {"L$0", "L$0", "L$2", "L$0"})
    static final class C07491<E> extends SuspendLambda implements Function2<ProducerScope<? super E>, Continuation<? super Unit>, Object> {
        final /* synthetic */ Function2<E, Continuation<? super Boolean>, Object> $predicate;
        final /* synthetic */ ReceiveChannel<E> $this_takeWhile;
        private /* synthetic */ Object L$0;
        Object L$1;
        Object L$2;
        int label;

        /* JADX WARN: Multi-variable type inference failed */
        C07491(ReceiveChannel<? extends E> r2, Function2<? super E, ? super Continuation<? super Boolean>, ? extends Object> r3, Continuation<? super C07491> r4) {
            this.$this_takeWhile = r2;
            this.$predicate = r3;
            super(2, r4);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object r4, Continuation<?> r5) {
            C07491 r0 = new C07491(this.$this_takeWhile, this.$predicate, r5);
            r0.L$0 = r4;
            return r0;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object r2, Continuation<? super Unit> r3) {
            return invoke((ProducerScope) r2, r3);
        }

        public final Object invoke(ProducerScope<? super E> r3, Continuation<? super Unit> r4) {
            return ((C07491) create(r3, r4)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r3v10 */
        /* JADX WARN: Type inference failed for: r3v13, types: [java.lang.Object] */
        /* JADX WARN: Type inference failed for: r3v17 */
        /* JADX WARN: Type inference failed for: r3v2 */
        /* JADX WARN: Type inference failed for: r4v0 */
        /* JADX WARN: Type inference failed for: r4v10 */
        /* JADX WARN: Type inference failed for: r4v5, types: [java.lang.Object] */
        /* JADX WARN: Type inference failed for: r5v0 */
        /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, kotlinx.coroutines.channels.ProducerScope] */
        /* JADX WARN: Type inference failed for: r5v4 */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:27:0x00b2 -> B:10:0x0058). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object r9) {
            Object r0 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            switch(this.label) {
                case 0: goto L9;
                case 1: goto L8;
                case 2: goto L7;
                case 3: goto L6;
                default: goto L5;
            };
        L6:
            C07491<E> r1 = this;
            ChannelIterator<E> r2 = (ChannelIterator) r1.L$1;
            ProducerScope r3 = (ProducerScope) r1.L$0;
            ResultKt.throwOnFailure(r9);
            ?? r4 = r3;
        L10:
            r1.L$0 = r4;
            r1.L$1 = r2;
            r1.label = 1;
            Object r5 = r2.hasNext(r1);
            if (r5 != r0) goto L13;
            return r0;
        L13:
            Object r7 = r0;
            Object r6 = r9;
            r9 = r5;
            ?? r8 = r4;
            ChannelIterator<E> r10 = r2;
            C07491<E> r11 = r1;
            Object r12 = r7;
        L15:
            if (((Boolean) r9).booleanValue() == false) goto L30;
            E r13 = r10.next();
            Function2<E, Continuation<? super Boolean>, Object> r14 = r11.$predicate;
            r11.L$0 = r8;
            r11.L$1 = r10;
            r11.L$2 = r13;
            r11.label = 2;
            Object r15 = r14.invoke(r13, r11);
            if (r15 != r12) goto L19;
            return r12;
        L19:
            ChannelIterator<E> r16 = r10;
            Object r17 = r13;
            r9 = r15;
            ?? r18 = r8;
            ChannelIterator<E> r19 = r16;
        L21:
            if (((Boolean) r9).booleanValue() == false) goto L23;
            r11.L$0 = r18;
            r11.L$1 = r19;
            r11.L$2 = null;
            r11.label = 3;
            if (r18.send(r17, r11) != r12) goto L27;
            return r12;
        L27:
            r9 = r6;
            r0 = r12;
            r1 = r11;
            r2 = r19;
            r4 = r18;
            goto L10
        L23:
            return Unit.INSTANCE;
        L30:
            return Unit.INSTANCE;
        L7:
            Object r20 = this.L$2;
            ChannelIterator<E> r21 = (ChannelIterator) this.L$1;
            ProducerScope r22 = (ProducerScope) this.L$0;
            ResultKt.throwOnFailure(r9);
            r18 = r22;
            r19 = r21;
            r17 = r20;
            r11 = this;
            r12 = r0;
            r6 = r9;
            goto L21
        L8:
            ChannelIterator<E> r23 = (ChannelIterator) this.L$1;
            ProducerScope r24 = (ProducerScope) this.L$0;
            ResultKt.throwOnFailure(r9);
            r8 = r24;
            r10 = r23;
            r11 = this;
            r12 = r0;
            r6 = r9;
            goto L15
        L9:
            ResultKt.throwOnFailure(r9);
            r1 = this;
            ProducerScope r25 = (ProducerScope) r1.L$0;
            ChannelIterator<E> r26 = r1.$this_takeWhile.iterator();
            r4 = r25;
            r2 = r26;
            goto L10
        L5:
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$toChannel$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: Deprecated.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt", f = "Deprecated.kt", i = {0, 0, 1, 1}, l = {517, 308}, m = "toChannel", n = {"destination", "$this$consume$iv$iv", "destination", "$this$consume$iv$iv"}, s = {"L$0", "L$1", "L$0", "L$1"})
    static final class C07501<E, C extends SendChannel<? super E>> extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        C07501(Continuation<? super C07501> r1) {
            super(r1);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object r3) {
            this.result = r3;
            this.label |= Integer.MIN_VALUE;
            return ChannelsKt.toChannel(null, null, this);
        }
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$toCollection$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: Deprecated.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt", f = "Deprecated.kt", i = {0, 0}, l = {517}, m = "toCollection", n = {"destination", "$this$consume$iv$iv"}, s = {"L$0", "L$1"})
    static final class C07511<E, C extends Collection<? super E>> extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        C07511(Continuation<? super C07511> r1) {
            super(r1);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object r3) {
            this.result = r3;
            this.label |= Integer.MIN_VALUE;
            return ChannelsKt.toCollection(null, null, this);
        }
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$toMap$2, reason: invalid class name */
    /* JADX INFO: compiled from: Deprecated.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt", f = "Deprecated.kt", i = {0, 0}, l = {517}, m = "toMap", n = {"destination", "$this$consume$iv$iv"}, s = {"L$0", "L$1"})
    static final class AnonymousClass2<K, V, M extends Map<? super K, ? super V>> extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        AnonymousClass2(Continuation<? super AnonymousClass2> r1) {
            super(r1);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object r3) {
            this.result = r3;
            this.label |= Integer.MIN_VALUE;
            return ChannelsKt.toMap(null, null, this);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [E] */
    /* JADX INFO: renamed from: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$withIndex$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: Deprecated.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\u00040\u0003H\u008a@"}, d2 = {"<anonymous>", "", "E", "Lkotlinx/coroutines/channels/ProducerScope;", "Lkotlin/collections/IndexedValue;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$withIndex$1", f = "Deprecated.kt", i = {0, 0, 1, 1}, l = {400, 401}, m = "invokeSuspend", n = {"$this$produce", "index", "$this$produce", "index"}, s = {"L$0", "I$0", "L$0", "I$0"})
    static final class C07521<E> extends SuspendLambda implements Function2<ProducerScope<? super IndexedValue<? extends E>>, Continuation<? super Unit>, Object> {
        final /* synthetic */ ReceiveChannel<E> $this_withIndex;
        int I$0;
        private /* synthetic */ Object L$0;
        Object L$1;
        int label;

        /* JADX WARN: Multi-variable type inference failed */
        C07521(ReceiveChannel<? extends E> r2, Continuation<? super C07521> r3) {
            this.$this_withIndex = r2;
            super(2, r3);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object r3, Continuation<?> r4) {
            C07521 r0 = new C07521(this.$this_withIndex, r4);
            r0.L$0 = r3;
            return r0;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object r2, Continuation<? super Unit> r3) {
            return invoke((ProducerScope) r2, r3);
        }

        public final Object invoke(ProducerScope<? super IndexedValue<? extends E>> r3, Continuation<? super Unit> r4) {
            return ((C07521) create(r3, r4)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x0088 -> B:9:0x0049). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object $result) {
            Object $result2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            switch(this.label) {
                case 0: goto L8;
                case 1: goto L7;
                case 2: goto L6;
                default: goto L5;
            };
        L6:
            C07521<E> r1 = this;
            int index = r1.I$0;
            ChannelIterator<E> r3 = (ChannelIterator) r1.L$1;
            ProducerScope $this$produce = (ProducerScope) r1.L$0;
            ResultKt.throwOnFailure($result);
            int index2 = index;
            ProducerScope $this$produce2 = $this$produce;
            ChannelIterator<E> r4 = r3;
        L9:
            r1.L$0 = $this$produce2;
            r1.L$1 = r4;
            r1.I$0 = index2;
            r1.label = 1;
            Object r5 = r4.hasNext(r1);
            if (r5 != $result2) goto L12;
            return $result2;
        L12:
            Object r9 = $result2;
            Object $result3 = $result;
            $result = r5;
            ProducerScope $this$produce3 = $this$produce2;
            C07521<E> r2 = r1;
            Object r6 = r9;
        L14:
            if (((Boolean) $result).booleanValue() == false) goto L21;
            Object e = r4.next();
            int index3 = index2 + 1;
            r2.L$0 = $this$produce3;
            r2.L$1 = r4;
            r2.I$0 = index3;
            r2.label = 2;
            if ($this$produce3.send(new IndexedValue(index2, e), r2) != r6) goto L18;
            return r6;
        L18:
            $result = $result3;
            $result2 = r6;
            r1 = r2;
            $this$produce2 = $this$produce3;
            index2 = index3;
            goto L9
        L21:
            return Unit.INSTANCE;
        L7:
            int index4 = this.I$0;
            ChannelIterator<E> r7 = (ChannelIterator) this.L$1;
            ProducerScope $this$produce4 = (ProducerScope) this.L$0;
            ResultKt.throwOnFailure($result);
            $this$produce3 = $this$produce4;
            r4 = r7;
            index2 = index4;
            r2 = this;
            r6 = $result2;
            $result3 = $result;
            goto L14
        L8:
            ResultKt.throwOnFailure($result);
            r1 = this;
            $this$produce2 = (ProducerScope) r1.L$0;
            index2 = 0;
            r4 = r1.$this_withIndex.iterator();
            goto L9
        L5:
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Add missing generic type declarations: [V] */
    /* JADX INFO: renamed from: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$zip$2, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: Deprecated.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003\"\u0004\b\u0002\u0010\u0004*\b\u0012\u0004\u0012\u0002H\u00040\u0005H\u008a@"}, d2 = {"<anonymous>", "", "E", "R", "V", "Lkotlinx/coroutines/channels/ProducerScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$zip$2", f = "Deprecated.kt", i = {0, 0, 0, 1, 1, 1, 1, 2, 2, 2}, l = {517, 499, 501}, m = "invokeSuspend", n = {"$this$produce", "otherIterator", "$this$consume$iv$iv", "$this$produce", "otherIterator", "$this$consume$iv$iv", "element1", "$this$produce", "otherIterator", "$this$consume$iv$iv"}, s = {"L$0", "L$1", "L$3", "L$0", "L$1", "L$3", "L$5", "L$0", "L$1", "L$3"})
    static final class C07542<V> extends SuspendLambda implements Function2<ProducerScope<? super V>, Continuation<? super Unit>, Object> {
        final /* synthetic */ ReceiveChannel<R> $other;
        final /* synthetic */ ReceiveChannel<E> $this_zip;
        final /* synthetic */ Function2<E, R, V> $transform;
        private /* synthetic */ Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        int label;

        /* JADX WARN: Multi-variable type inference failed */
        C07542(ReceiveChannel<? extends R> r2, ReceiveChannel<? extends E> r3, Function2<? super E, ? super R, ? extends V> r4, Continuation<? super C07542> r5) {
            this.$other = r2;
            this.$this_zip = r3;
            this.$transform = r4;
            super(2, r5);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object r5, Continuation<?> r6) {
            C07542 r0 = new C07542(this.$other, this.$this_zip, this.$transform, r6);
            r0.L$0 = r5;
            return r0;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object r2, Continuation<? super Unit> r3) {
            return invoke((ProducerScope) r2, r3);
        }

        public final Object invoke(ProducerScope<? super V> r3, Continuation<? super Unit> r4) {
            return ((C07542) create(r3, r4)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:37:0x0133 -> B:38:0x013d). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:39:0x0142 -> B:40:0x014f). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object r18) {
            Object r0 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            Object r3 = null;
            switch(this.label) {
                case 0: goto L19;
                case 1: goto L14;
                case 2: goto L9;
                case 3: goto L6;
                default: goto L5;
            };
        L6:
            C07542<V> r2 = this;
            Object $result = r18;
            Object $result2 = null;
            ChannelIterator otherIterator = null;
            int $i$f$consume = 0;
            ChannelIterator r9 = (ChannelIterator) r2.L$4;
            Throwable cause$iv$iv = null;
            ReceiveChannel $this$consume$iv$iv = (ReceiveChannel) r2.L$3;
            Function2 r12 = (Function2) r2.L$2;
            ChannelIterator otherIterator2 = (ChannelIterator) r2.L$1;
            ProducerScope $this$produce = (ProducerScope) r2.L$0;
            ResultKt.throwOnFailure($result);     // Catch: Throwable -> L17
        L38:
            ChannelIterator r8 = r9;
            Function2 r10 = r12;
            ChannelIterator otherIterator3 = otherIterator2;
            ProducerScope $this$produce2 = $this$produce;
        L40:
            r3 = null;
        L22:
            r2.L$0 = $this$produce2;     // Catch: Throwable -> L17
            r2.L$1 = otherIterator3;     // Catch: Throwable -> L17
            r2.L$2 = r10;     // Catch: Throwable -> L17
            r2.L$3 = $this$consume$iv$iv;     // Catch: Throwable -> L17
            r2.L$4 = r8;     // Catch: Throwable -> L17
            r2.L$5 = r3;     // Catch: Throwable -> L17
            r2.label = 1;     // Catch: Throwable -> L17
            Object r14 = r8.hasNext(r2);     // Catch: Throwable -> L17
            if (r14 != r0) goto L25;
            return r0;
        L25:
            Object r16 = $result2;
            Object $result3 = $result;
            Object $result4 = r14;
            $this$produce = $this$produce2;
            otherIterator2 = otherIterator3;
            ReceiveChannel $this$consume$iv$iv2 = $this$consume$iv$iv;
            Throwable cause$iv$iv2 = cause$iv$iv;
            Function2 r11 = r10;
            ChannelIterator r13 = r8;
            int r15 = $i$f$consume;
            ChannelIterator r7 = otherIterator;
            Object r6 = r16;
        L63:
        L46:
            e$iv$iv = th;
            $this$consume$iv$iv = $this$consume$iv$iv2;
        L50:
            Throwable cause$iv$iv3 = e$iv$iv;
            throw e$iv$iv;     // Catch: Throwable -> L52
        L52:
            e$iv$iv = move-exception;
            ChannelsKt.cancelConsumed($this$consume$iv$iv, cause$iv$iv3);
            throw e$iv$iv;
        L27:
            if (((Boolean) $result4).booleanValue() == false) goto L43;
            Object element1 = r13.next();     // Catch: Throwable -> L46
            int r17 = 0;
            r2.L$0 = $this$produce;     // Catch: Throwable -> L46
            r2.L$1 = otherIterator2;     // Catch: Throwable -> L46
            r2.L$2 = r11;     // Catch: Throwable -> L46
            r2.L$3 = $this$consume$iv$iv2;     // Catch: Throwable -> L46
            r2.L$4 = r13;     // Catch: Throwable -> L46
            r2.L$5 = element1;     // Catch: Throwable -> L46
            r2.label = 2;     // Catch: Throwable -> L46
            Object r4 = otherIterator2.hasNext(r2);     // Catch: Throwable -> L46
            if (r4 != r0) goto L31;
            return r0;
        L31:
            Object element2 = r4;
            Function2 r5 = r11;
            ChannelIterator r19 = r13;
            Object element3 = element1;
        L61:
            if (((Boolean) element2).booleanValue() == false) goto L39;
            Object element4 = otherIterator2.next();     // Catch: Throwable -> L46
            Object r1 = r5.invoke(element3, element4);     // Catch: Throwable -> L46
            r2.L$0 = $this$produce;     // Catch: Throwable -> L46
            r2.L$1 = otherIterator2;     // Catch: Throwable -> L46
            r2.L$2 = r5;     // Catch: Throwable -> L46
            r2.L$3 = $this$consume$iv$iv2;     // Catch: Throwable -> L46
            r2.L$4 = r19;     // Catch: Throwable -> L46
            Function2 r110 = r5;
            r2.L$5 = null;     // Catch: Throwable -> L46
            r2.label = 3;     // Catch: Throwable -> L46
            if ($this$produce.send(r1, r2) != r0) goto L37;
            return r0;
        L37:
            $result = $result3;
            $result2 = r6;
            otherIterator = r7;
            $i$f$consume = r15;
            r9 = r19;
            cause$iv$iv = cause$iv$iv2;
            $this$consume$iv$iv = $this$consume$iv$iv2;
            r12 = r110;
            goto L38
        L39:
            r10 = r5;
            $result = $result3;
            $result2 = r6;
            otherIterator = r7;
            $i$f$consume = r15;
            r8 = r19;
            cause$iv$iv = cause$iv$iv2;
            $this$consume$iv$iv = $this$consume$iv$iv2;
            otherIterator3 = otherIterator2;
            $this$produce2 = $this$produce;
        L41:
            e$iv$iv = th;
            $this$consume$iv$iv = $this$consume$iv$iv2;
            goto L50
        L43:
            Unit r20 = Unit.INSTANCE;     // Catch: Throwable -> L46
            ChannelsKt.cancelConsumed($this$consume$iv$iv2, cause$iv$iv2);
            return Unit.INSTANCE;
        L9:
            r2 = this;
            element2 = r18;
            element3 = r2.L$5;
            r19 = (ChannelIterator) r2.L$4;
            $this$consume$iv$iv = (ReceiveChannel) r2.L$3;
            Function2 r111 = (Function2) r2.L$2;
            otherIterator2 = (ChannelIterator) r2.L$1;
            $this$produce = (ProducerScope) r2.L$0;
            ResultKt.throwOnFailure(element2);     // Catch: Throwable -> L12
            cause$iv$iv2 = null;
            r5 = r111;
            $this$consume$iv$iv2 = $this$consume$iv$iv;
            r17 = 0;
            r15 = 0;
            r7 = null;
            r6 = null;
            $result3 = element2;
        L12:
            e$iv$iv = th;
            goto L50
        L14:
            r2 = this;
            $result4 = r18;
            ChannelIterator r21 = (ChannelIterator) r2.L$4;
            ReceiveChannel $this$consume$iv$iv3 = (ReceiveChannel) r2.L$3;
            Function2 r22 = (Function2) r2.L$2;
            ChannelIterator otherIterator4 = (ChannelIterator) r2.L$1;
            ProducerScope $this$produce3 = (ProducerScope) r2.L$0;
            ResultKt.throwOnFailure($result4);     // Catch: Throwable -> L17
            $this$produce = $this$produce3;
            otherIterator2 = otherIterator4;
            $this$consume$iv$iv2 = $this$consume$iv$iv3;
            cause$iv$iv2 = null;
            r11 = r22;
            r13 = r21;
            r15 = 0;
            r7 = null;
            r6 = null;
            $result3 = $result4;
            goto L63
        L19:
            ResultKt.throwOnFailure(r18);
            r2 = this;
            $result = r18;
            ProducerScope $this$produce4 = (ProducerScope) r2.L$0;
            ChannelIterator otherIterator5 = r2.$other.iterator();
            ReceiveChannel $this$consumeEach$iv = r2.$this_zip;
            $this$consume$iv$iv = $this$consumeEach$iv;
            cause$iv$iv = null;
            otherIterator3 = otherIterator5;
            otherIterator = null;
            $i$f$consume = 0;
            $this$produce2 = $this$produce4;
            $result2 = null;
            r10 = r2.$transform;
            r8 = $this$consume$iv$iv.iterator();     // Catch: Throwable -> L48
        L48:
            e$iv$iv = th;
            goto L50
        L5:
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        L17:
            e$iv$iv = th;
            goto L50
        }
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "BroadcastChannel is deprecated in the favour of SharedFlow and is no longer supported")
    public static final <E, R> R consume(BroadcastChannel<E> r5, Function1<? super ReceiveChannel<? extends E>, ? extends R> r6) {
        ReceiveChannel<E> r1 = r5.openSubscription();
        R r4 = r6.invoke(r1);     // Catch: Throwable -> L6
        ReceiveChannel.DefaultImpls.cancel$default(r1, null, 1, null);
        return r4;
    L6:
        th = move-exception;
        ReceiveChannel.DefaultImpls.cancel$default(r1, null, 1, null);
        throw th;
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x0070 -> B:40:0x0079). Please report as a decompilation issue!!! */
    @Deprecated(level = DeprecationLevel.ERROR, message = "BroadcastChannel is deprecated in the favour of SharedFlow and is no longer supported")
    public static final <E> Object consumeEach(BroadcastChannel<E> r10, Function1<? super E, Unit> r11, Continuation<? super Unit> r12) {
        if ((r12 instanceof C07181) == false) goto L7;
        C07181 r0 = (C07181) r12;
        if ((r0.label & Integer.MIN_VALUE) == 0) goto L7;
        r0.label -= Integer.MIN_VALUE;
    L8:
        Object element = r0.result;
        Object r1 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch(r0.label) {
            case 0: goto L17;
            case 1: goto L12;
            default: goto L11;
        };
    L12:
        ChannelIterator r5 = (ChannelIterator) r0.L$2;
        ReceiveChannel<E> r6 = (ReceiveChannel) r0.L$1;
        Function1<? super E, Unit> r7 = (Function1) r0.L$0;
        ResultKt.throwOnFailure(element);     // Catch: Throwable -> L15
        Function1<? super E, Unit> r8 = r7;
        ReceiveChannel<E> r9 = r6;
        ChannelIterator r13 = r5;
        int r14 = 0;
        Object r2 = r1;
        C07181 r3 = r0;
        Object $result = element;
    L40:
    L30:
        th = move-exception;
        th = th;
        r6 = r9;
    L34:
        ReceiveChannel.DefaultImpls.cancel$default(r6, null, 1, null);
        throw th;
    L25:
        if (((Boolean) element).booleanValue() == false) goto L27;
        r8.invoke(r13.next());     // Catch: Throwable -> L30
        element = $result;
        r0 = r3;
        r1 = r2;
        int $i$f$consumeEach = r14;
        ChannelIterator r15 = r13;
        r6 = r9;
        Function1<? super E, Unit> r16 = r8;
    L20:
        r0.L$0 = r16;     // Catch: Throwable -> L15
        r0.L$1 = r6;     // Catch: Throwable -> L15
        r0.L$2 = r15;     // Catch: Throwable -> L15
        r0.label = 1;     // Catch: Throwable -> L15
        Object r17 = r15.hasNext(r0);     // Catch: Throwable -> L15
        if (r17 != r1) goto L23;
        return r1;
    L23:
        C07181 r18 = r0;
        $result = element;
        element = r17;
        r8 = r16;
        r9 = r6;
        r13 = r15;
        r14 = $i$f$consumeEach;
        r2 = r1;
        r3 = r18;
        goto L40
    L27:
        Unit r19 = Unit.INSTANCE;     // Catch: Throwable -> L30
        ReceiveChannel.DefaultImpls.cancel$default(r9, null, 1, null);
        return Unit.INSTANCE;
    L15:
        th = th;
        goto L34
    L17:
        ResultKt.throwOnFailure(element);
        r6 = r10.openSubscription();
        $i$f$consumeEach = 0;
        r16 = r11;
        r15 = r6.iterator();     // Catch: Throwable -> L32
    L32:
        th = th;
        goto L34
    L11:
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    L7:
        r0 = new C07181(r12);
        goto L8
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "BroadcastChannel is deprecated in the favour of SharedFlow and is no longer supported")
    private static final <E> Object consumeEach$$forInline(BroadcastChannel<E> r10, Function1<? super E, Unit> r11, Continuation<? super Unit> r12) {
        ReceiveChannel<E> r3 = r10.openSubscription();
        ChannelIterator<E> r8 = r3.iterator();     // Catch: Throwable -> L10
    L5:
        if (((Boolean) r8.hasNext(null)).booleanValue() == false) goto L7;
        Object element = r8.next();     // Catch: Throwable -> L10
        r11.invoke(element);     // Catch: Throwable -> L10
        goto L5
    L7:
        Unit r6 = Unit.INSTANCE;     // Catch: Throwable -> L10
        ReceiveChannel.DefaultImpls.cancel$default(r3, null, 1, null);
        return Unit.INSTANCE;
    L10:
        th = move-exception;
        ReceiveChannel.DefaultImpls.cancel$default(r3, null, 1, null);
        throw th;
    }

    public static final Function1<Throwable, Unit> consumesAll(final ReceiveChannel<?>... r1) {
        return new C07201(r1);
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x0076 -> B:56:0x0080). Please report as a decompilation issue!!! */
    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Binary compatibility")
    public static final /* synthetic */ Object elementAt(ReceiveChannel $this$elementAt, int index, Continuation r14) {
        if ((r14 instanceof C07261) == false) goto L7;
        C07261 r0 = (C07261) r14;
        if ((r0.label & Integer.MIN_VALUE) == 0) goto L7;
        r0.label -= Integer.MIN_VALUE;
    L8:
        Object $result = r0.result;
        Object r1 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch(r0.label) {
            case 0: goto L17;
            case 1: goto L12;
            default: goto L11;
        };
    L12:
        int count = r0.I$1;
        int index2 = r0.I$0;
        ChannelIterator r6 = (ChannelIterator) r0.L$1;
        ReceiveChannel $this$consume$iv = (ReceiveChannel) r0.L$0;
        ResultKt.throwOnFailure($result);     // Catch: Throwable -> L15
        Throwable r9 = null;
        ReceiveChannel $this$consume$iv2 = $this$consume$iv;
        ChannelIterator r7 = r6;
        int index3 = index2;
        int index4 = count;
        Object r2 = r1;
        C07261 r3 = r0;
        Object $result2 = $result;
    L56:
    L38:
        e$iv = th;
        $this$consume$iv = $this$consume$iv2;
    L44:
        Throwable cause$iv = e$iv;
        throw e$iv;     // Catch: Throwable -> L46
    L46:
        e$iv = move-exception;
        ChannelsKt.cancelConsumed($this$consume$iv, cause$iv);
        throw e$iv;
    L26:
        if (((Boolean) $result).booleanValue() == false) goto L33;
        Object r15 = r7.next();     // Catch: Throwable -> L38
        int count2 = index4 + 1;
        if (index3 != index4) goto L32;
        ChannelsKt.cancelConsumed($this$consume$iv2, r9);
        return r15;
    L32:
        $result = $result2;
        r0 = r3;
        r1 = r2;
        int index5 = index3;
        ChannelIterator r8 = r7;
        ReceiveChannel $this$consume$iv3 = $this$consume$iv2;
        Throwable cause$iv2 = r9;
        int count3 = count2;
    L21:
        r0.L$0 = $this$consume$iv3;     // Catch: Throwable -> L40
        r0.L$1 = r8;     // Catch: Throwable -> L40
        r0.I$0 = index5;     // Catch: Throwable -> L40
        r0.I$1 = count3;     // Catch: Throwable -> L40
        r0.label = 1;     // Catch: Throwable -> L40
        Object r10 = r8.hasNext(r0);     // Catch: Throwable -> L40
        if (r10 != r1) goto L24;
        return r1;
    L24:
        C07261 r11 = r0;
        $result2 = $result;
        $result = r10;
        r9 = cause$iv2;
        $this$consume$iv2 = $this$consume$iv3;
        r7 = r8;
        index3 = index5;
        index4 = count3;
        r2 = r1;
        r3 = r11;
        goto L56
    L33:
        $this$consume$iv = $this$consume$iv2;
    L36:
        e$iv = th;
        goto L44
    L35:
        throw new IndexOutOfBoundsException("ReceiveChannel doesn't contain element at index " + index3 + '.');     // Catch: Throwable -> L36
    L15:
        e$iv = th;
        goto L44
    L17:
        ResultKt.throwOnFailure($result);
        $this$consume$iv3 = $this$elementAt;
        cause$iv2 = null;
        if (index < 0) goto L43;
        index5 = index;
        count3 = 0;
        r8 = $this$consume$iv3.iterator();     // Catch: Throwable -> L40
        goto L21
    L43:
        throw new IndexOutOfBoundsException("ReceiveChannel doesn't contain element at index " + index + '.');     // Catch: Throwable -> L40
    L11:
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    L40:
        e$iv = th;
    L7:
        r0 = new C07261(r14);
        goto L8
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:27:0x0079 -> B:51:0x0082). Please report as a decompilation issue!!! */
    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Binary compatibility")
    public static final /* synthetic */ Object elementAtOrNull(ReceiveChannel $this$elementAtOrNull_u24lambda_u242, int index, Continuation r13) {
        if ((r13 instanceof C07271) == false) goto L7;
        C07271 r0 = (C07271) r13;
        if ((r0.label & Integer.MIN_VALUE) == 0) goto L7;
        r0.label -= Integer.MIN_VALUE;
    L8:
        Object $result = r0.result;
        Object r1 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch(r0.label) {
            case 0: goto L17;
            case 1: goto L12;
            default: goto L11;
        };
    L12:
        int count = r0.I$1;
        int index2 = r0.I$0;
        ChannelIterator r5 = (ChannelIterator) r0.L$1;
        ReceiveChannel $this$consume$iv = (ReceiveChannel) r0.L$0;
        ResultKt.throwOnFailure($result);     // Catch: Throwable -> L15
        ChannelIterator r8 = r5;
        ReceiveChannel $this$consume$iv2 = $this$consume$iv;
        Throwable r6 = null;
        int index3 = index2;
        int index4 = count;
        Object r2 = r1;
        C07271 r3 = r0;
        Object $result2 = $result;
    L51:
    L38:
        Throwable cause$iv = th;
        $this$consume$iv = $this$consume$iv2;
    L44:
        Throwable cause$iv2 = cause$iv;
        throw cause$iv;     // Catch: Throwable -> L46
    L46:
        e$iv = move-exception;
        ChannelsKt.cancelConsumed($this$consume$iv, cause$iv2);
        throw e$iv;
    L29:
        if (((Boolean) $result).booleanValue() == false) goto L36;
        Object r14 = r8.next();     // Catch: Throwable -> L38
        int count2 = index4 + 1;
        if (index3 != index4) goto L35;
        ChannelsKt.cancelConsumed($this$consume$iv2, r6);
        return r14;
    L35:
        Throwable cause$iv3 = r6;
        $result = $result2;
        r0 = r3;
        r1 = r2;
        int index5 = index3;
        $this$consume$iv = $this$consume$iv2;
        int $i$f$consume = count2;
    L55:
        r0.L$0 = $this$consume$iv;     // Catch: Throwable -> L40
        r0.L$1 = r8;     // Catch: Throwable -> L40
        r0.I$0 = index5;     // Catch: Throwable -> L40
        r0.I$1 = $i$f$consume;     // Catch: Throwable -> L40
        r0.label = 1;     // Catch: Throwable -> L40
        Object r7 = r8.hasNext(r0);     // Catch: Throwable -> L40
        if (r7 != r1) goto L27;
        return r1;
    L27:
        C07271 r10 = r0;
        $result2 = $result;
        $result = r7;
        $this$consume$iv2 = $this$consume$iv;
        index3 = index5;
        r6 = cause$iv3;
        index4 = $i$f$consume;
        r2 = r1;
        r3 = r10;
    L40:
        cause$iv = th;
        goto L44
    L36:
        ChannelsKt.cancelConsumed($this$consume$iv2, r6);
        return null;
    L15:
        cause$iv = th;
        goto L44
    L17:
        ResultKt.throwOnFailure($result);
        if (index >= 0) goto L21;
        ChannelsKt.cancelConsumed($this$elementAtOrNull_u24lambda_u242, null);
        return null;
    L21:
        $this$consume$iv = $this$elementAtOrNull_u24lambda_u242;
        r8 = $this$elementAtOrNull_u24lambda_u242.iterator();     // Catch: Throwable -> L42
        cause$iv3 = null;
        index5 = index;
        $i$f$consume = 0;
    L42:
        th = move-exception;
        cause$iv = th;
        goto L44
    L11:
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    L7:
        r0 = new C07271(r13);
        goto L8
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Binary compatibility")
    public static final /* synthetic */ Object first(ReceiveChannel $this$first, Continuation r8) {
        if ((r8 instanceof C07331) == false) goto L7;
        C07331 r0 = (C07331) r8;
        if ((r0.label & Integer.MIN_VALUE) == 0) goto L7;
        r0.label -= Integer.MIN_VALUE;
    L8:
        Object $result = r0.result;
        Object r1 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch(r0.label) {
            case 0: goto L17;
            case 1: goto L12;
            default: goto L11;
        };
    L12:
        ChannelIterator iterator = (ChannelIterator) r0.L$1;
        ReceiveChannel $this$consume$iv = (ReceiveChannel) r0.L$0;
        Throwable cause$iv = null;
        ResultKt.throwOnFailure($result);     // Catch: Throwable -> L15
        Object r6 = $result;
    L23:
        if (((Boolean) r6).booleanValue() == false) goto L28;
        Object r5 = iterator.next();     // Catch: Throwable -> L15
        ChannelsKt.cancelConsumed($this$consume$iv, cause$iv);
        return r5;
    L28:
        throw new NoSuchElementException("ReceiveChannel is empty.");     // Catch: Throwable -> L15
    L15:
        e$iv = th;
    L30:
        Throwable cause$iv2 = e$iv;
        throw e$iv;     // Catch: Throwable -> L32
    L32:
        e$iv = move-exception;
        ChannelsKt.cancelConsumed($this$consume$iv, cause$iv2);
        throw e$iv;
    L17:
        ResultKt.throwOnFailure($result);
        $this$consume$iv = $this$first;
        cause$iv = null;
        iterator = $this$consume$iv.iterator();     // Catch: Throwable -> L29
        r0.L$0 = $this$consume$iv;     // Catch: Throwable -> L29
        r0.L$1 = iterator;     // Catch: Throwable -> L29
        r0.label = 1;     // Catch: Throwable -> L29
        r6 = iterator.hasNext(r0);     // Catch: Throwable -> L29
        if (r6 != r1) goto L23;
        return r1;
    L29:
        e$iv = th;
        goto L30
    L11:
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    L7:
        r0 = new C07331(r8);
        goto L8
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Binary compatibility")
    public static final /* synthetic */ Object firstOrNull(ReceiveChannel $this$firstOrNull, Continuation r9) {
        if ((r9 instanceof C07341) == false) goto L7;
        C07341 r0 = (C07341) r9;
        if ((r0.label & Integer.MIN_VALUE) == 0) goto L7;
        r0.label -= Integer.MIN_VALUE;
    L8:
        Object $result = r0.result;
        Object r1 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        Object r3 = null;
        switch(r0.label) {
            case 0: goto L17;
            case 1: goto L12;
            default: goto L11;
        };
    L12:
        ChannelIterator iterator = (ChannelIterator) r0.L$1;
        ReceiveChannel $this$consume$iv = (ReceiveChannel) r0.L$0;
        ResultKt.throwOnFailure($result);     // Catch: Throwable -> L15
        Object r5 = $result;
        ChannelIterator iterator2 = iterator;
        Throwable cause$iv = null;
    L43:
    L28:
        e$iv = th;
    L32:
        Throwable cause$iv2 = e$iv;
        throw e$iv;     // Catch: Throwable -> L34
    L34:
        e$iv = move-exception;
        ChannelsKt.cancelConsumed($this$consume$iv, cause$iv2);
        throw e$iv;
    L23:
        if (((Boolean) r5).booleanValue() == true) goto L26;
    L24:
        ChannelsKt.cancelConsumed($this$consume$iv, cause$iv);
        return r3;
    L26:
        r3 = iterator2.next();     // Catch: Throwable -> L28
    L15:
        e$iv = th;
        goto L32
    L17:
        ResultKt.throwOnFailure($result);
        $this$consume$iv = $this$firstOrNull;
        cause$iv = null;
        iterator2 = $this$consume$iv.iterator();     // Catch: Throwable -> L30
        r0.L$0 = $this$consume$iv;     // Catch: Throwable -> L30
        r0.L$1 = iterator2;     // Catch: Throwable -> L30
        r0.label = 1;     // Catch: Throwable -> L30
        r5 = iterator2.hasNext(r0);     // Catch: Throwable -> L30
        if (r5 != r1) goto L43;
        return r1;
    L30:
        e$iv = th;
        goto L32
    L11:
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    L7:
        r0 = new C07341(r9);
        goto L8
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x0081 -> B:60:0x008e). Please report as a decompilation issue!!! */
    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Binary compatibility")
    public static final /* synthetic */ Object indexOf(ReceiveChannel $this$consumeEach$iv, Object element, Continuation r19) {
        if ((r19 instanceof C07361) == false) goto L7;
        C07361 r1 = (C07361) r19;
        if ((r1.label & Integer.MIN_VALUE) == 0) goto L7;
        r1.label -= Integer.MIN_VALUE;
    L8:
        Object $result = r1.result;
        Object r0 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch(r1.label) {
            case 0: goto L17;
            case 1: goto L12;
            default: goto L11;
        };
    L12:
        ChannelIterator r7 = (ChannelIterator) r1.L$3;
        ReceiveChannel $this$consume$iv$iv = (ReceiveChannel) r1.L$2;
        Ref.IntRef index = (Ref.IntRef) r1.L$1;
        Object element2 = r1.L$0;
        ResultKt.throwOnFailure($result);     // Catch: Throwable -> L15
        Throwable cause$iv$iv = null;
        Object element3 = element2;
        Ref.IntRef index2 = index;
        ReceiveChannel $this$consume$iv$iv2 = $this$consume$iv$iv;
        ChannelIterator r8 = r7;
        Ref.IntRef r9 = null;
        Object r6 = null;
        int $i$f$consume = 0;
        Object $result2 = $result;
    L60:
    L41:
        e$iv$iv = th;
        $this$consume$iv$iv = $this$consume$iv$iv2;
    L47:
        Throwable cause$iv$iv2 = e$iv$iv;
        throw e$iv$iv;     // Catch: Throwable -> L49
    L49:
        e$iv$iv = move-exception;
        ChannelsKt.cancelConsumed($this$consume$iv$iv, cause$iv$iv2);
        throw e$iv$iv;
    L25:
        if (((Boolean) $result).booleanValue() == false) goto L35;
        Object e$iv = r8.next();     // Catch: Throwable -> L41
        if (Intrinsics.areEqual(element3, e$iv) == false) goto L62;
        Integer r2 = Boxing.boxInt(index2.element);     // Catch: Throwable -> L41
        ChannelsKt.cancelConsumed($this$consume$iv$iv2, cause$iv$iv);
        return r2;
    L62:
        index2.element++;     // Catch: Throwable -> L33
        $result = $result2;
        int $i$f$consume2 = $i$f$consume;
        Object element4 = r6;
        Ref.IntRef index3 = r9;
        ChannelIterator r10 = r8;
        $this$consume$iv$iv = $this$consume$iv$iv2;
        Ref.IntRef index4 = index2;
        Object element5 = element3;
        Throwable cause$iv$iv3 = cause$iv$iv;
    L52:
        r1.L$0 = element5;     // Catch: Throwable -> L43
        r1.L$1 = index4;     // Catch: Throwable -> L43
        r1.L$2 = $this$consume$iv$iv;     // Catch: Throwable -> L43
        r1.L$3 = r10;     // Catch: Throwable -> L43
        r1.label = 1;     // Catch: Throwable -> L43
        Object r12 = r10.hasNext(r1);     // Catch: Throwable -> L43
        if (r12 != r0) goto L23;
        return r0;
    L23:
        int r16 = $i$f$consume2;
        $result2 = $result;
        $result = r12;
        cause$iv$iv = cause$iv$iv3;
        element3 = element5;
        index2 = index4;
        $this$consume$iv$iv2 = $this$consume$iv$iv;
        r8 = r10;
        r9 = index3;
        r6 = element4;
        $i$f$consume = r16;
    L43:
        e$iv$iv = th;
    L33:
        e$iv$iv = th;
        $this$consume$iv$iv = $this$consume$iv$iv2;
        goto L47
    L35:
        $this$consume$iv$iv = $this$consume$iv$iv2;
        Throwable cause$iv$iv4 = cause$iv$iv;
        Unit r3 = Unit.INSTANCE;     // Catch: Throwable -> L39
        ChannelsKt.cancelConsumed($this$consume$iv$iv, cause$iv$iv4);
        return Boxing.boxInt(-1);
    L39:
        e$iv$iv = th;
    L15:
        e$iv$iv = th;
        goto L47
    L17:
        ResultKt.throwOnFailure($result);
        Ref.IntRef index5 = new Ref.IntRef();
        $this$consume$iv$iv = $this$consumeEach$iv;
        cause$iv$iv3 = null;
        index4 = index5;
        index3 = null;
        element5 = element;
        element4 = null;
        $i$f$consume2 = 0;
        r10 = $this$consume$iv$iv.iterator();     // Catch: Throwable -> L45
    L45:
        e$iv$iv = th;
        goto L47
    L11:
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    L7:
        r1 = new C07361(r19);
        goto L8
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:30:0x0097 -> B:52:0x00a1). Please report as a decompilation issue!!! */
    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Binary compatibility")
    public static final /* synthetic */ Object last(ReceiveChannel $this$last, Continuation r10) {
        if ((r10 instanceof C07371) == false) goto L7;
        C07371 r0 = (C07371) r10;
        if ((r0.label & Integer.MIN_VALUE) == 0) goto L7;
        r0.label -= Integer.MIN_VALUE;
    L8:
        Object last = r0.result;
        Object r1 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch(r0.label) {
            case 0: goto L20;
            case 1: goto L17;
            case 2: goto L12;
            default: goto L11;
        };
    L12:
        Object last2 = r0.L$2;
        ChannelIterator iterator = (ChannelIterator) r0.L$1;
        ReceiveChannel $this$consume$iv = (ReceiveChannel) r0.L$0;
        ResultKt.throwOnFailure(last);     // Catch: Throwable -> L15
        Throwable r7 = null;
        ReceiveChannel $this$consume$iv2 = $this$consume$iv;
        ChannelIterator iterator2 = iterator;
        Object r4 = last2;
        int r3 = 0;
        Object r2 = r1;
        C07371 r5 = r0;
        Object $result = last;
    L52:
    L37:
        th = move-exception;
        $this$consume$iv = $this$consume$iv2;
        e$iv = th;
    L42:
        Throwable cause$iv = e$iv;
        throw e$iv;     // Catch: Throwable -> L44
    L44:
        e$iv = move-exception;
        ChannelsKt.cancelConsumed($this$consume$iv, cause$iv);
        throw e$iv;
    L32:
        if (((Boolean) last).booleanValue() == false) goto L35;
        int r6 = r3;
        Object last3 = iterator2.next();     // Catch: Throwable -> L37
        last = $result;
        r0 = r5;
        r1 = r2;
        int r8 = r6;
        ChannelIterator iterator3 = iterator2;
        ReceiveChannel $this$consume$iv3 = $this$consume$iv2;
        Throwable cause$iv2 = r7;
    L27:
        r0.L$0 = $this$consume$iv3;     // Catch: Throwable -> L41
        r0.L$1 = iterator3;     // Catch: Throwable -> L41
        r0.L$2 = last3;     // Catch: Throwable -> L41
        r0.label = 2;     // Catch: Throwable -> L41
        Object r9 = iterator3.hasNext(r0);     // Catch: Throwable -> L41
        if (r9 != r1) goto L30;
        return r1;
    L30:
        C07371 r11 = r0;
        $result = last;
        last = r9;
        r7 = cause$iv2;
        $this$consume$iv2 = $this$consume$iv3;
        iterator2 = iterator3;
        r4 = last3;
        r3 = r8;
        r2 = r1;
        r5 = r11;
        goto L52
    L35:
        ChannelsKt.cancelConsumed($this$consume$iv2, r7);
        return r4;
    L15:
        e$iv = th;
        goto L42
    L17:
        ChannelIterator iterator4 = (ChannelIterator) r0.L$1;
        cause$iv2 = null;
        $this$consume$iv3 = (ReceiveChannel) r0.L$0;
        ResultKt.throwOnFailure(last);     // Catch: Throwable -> L41
        iterator3 = iterator4;
        int r12 = 0;
        Object r13 = last;
    L25:
        if (((Boolean) r13).booleanValue() == false) goto L40;
        int r14 = r12;
        last3 = iterator3.next();     // Catch: Throwable -> L41
        r8 = r14;
        goto L27
    L40:
        throw new NoSuchElementException("ReceiveChannel is empty.");     // Catch: Throwable -> L41
    L20:
        ResultKt.throwOnFailure(last);
        $this$consume$iv3 = $this$last;
        cause$iv2 = null;
        r12 = 0;
        iterator3 = $this$consume$iv3.iterator();     // Catch: Throwable -> L41
        r0.L$0 = $this$consume$iv3;     // Catch: Throwable -> L41
        r0.L$1 = iterator3;     // Catch: Throwable -> L41
        r0.label = 1;     // Catch: Throwable -> L41
        r13 = iterator3.hasNext(r0);     // Catch: Throwable -> L41
        if (r13 != r1) goto L25;
        return r1;
    L11:
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    L41:
        e$iv = th;
    L7:
        r0 = new C07371(r10);
        goto L8
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x0092 -> B:46:0x00a0). Please report as a decompilation issue!!! */
    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Binary compatibility")
    public static final /* synthetic */ Object lastIndexOf(ReceiveChannel $this$consumeEach$iv, Object element, Continuation r19) {
        if ((r19 instanceof C07381) == false) goto L7;
        C07381 r1 = (C07381) r19;
        if ((r1.label & Integer.MIN_VALUE) == 0) goto L7;
        r1.label -= Integer.MIN_VALUE;
    L8:
        Object $result = r1.result;
        Object r0 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch(r1.label) {
            case 0: goto L17;
            case 1: goto L12;
            default: goto L11;
        };
    L12:
        ChannelIterator r7 = (ChannelIterator) r1.L$4;
        ReceiveChannel $this$consume$iv$iv = (ReceiveChannel) r1.L$3;
        Ref.IntRef index = (Ref.IntRef) r1.L$2;
        Ref.IntRef lastIndex = (Ref.IntRef) r1.L$1;
        Object element2 = r1.L$0;
        ResultKt.throwOnFailure($result);     // Catch: Throwable -> L15
        Object element3 = element2;
        Ref.IntRef lastIndex2 = lastIndex;
        Ref.IntRef lastIndex3 = index;
        ReceiveChannel $this$consume$iv$iv2 = $this$consume$iv$iv;
        Throwable cause$iv$iv = null;
        ChannelIterator r8 = r7;
        Ref.IntRef r9 = null;
        Object r6 = null;
        int $i$f$consume = 0;
        Object $result2 = $result;
    L46:
    L33:
        e$iv$iv = th;
        $this$consume$iv$iv = $this$consume$iv$iv2;
    L37:
        Throwable cause$iv$iv2 = e$iv$iv;
        throw e$iv$iv;     // Catch: Throwable -> L39
    L39:
        e$iv$iv = move-exception;
        ChannelsKt.cancelConsumed($this$consume$iv$iv, cause$iv$iv2);
        throw e$iv$iv;
    L25:
        if (((Boolean) $result).booleanValue() == false) goto L30;
        Object it = r8.next();     // Catch: Throwable -> L33
        if (Intrinsics.areEqual(element3, it) == false) goto L29;
        lastIndex2.element = lastIndex3.element;     // Catch: Throwable -> L33
    L29:
        lastIndex3.element++;     // Catch: Throwable -> L33
        $result = $result2;
        int $i$f$consume2 = $i$f$consume;
        Object element4 = r6;
        Ref.IntRef lastIndex4 = r9;
        ChannelIterator r10 = r8;
        Throwable cause$iv$iv3 = cause$iv$iv;
        $this$consume$iv$iv = $this$consume$iv$iv2;
        Ref.IntRef index2 = lastIndex3;
        Ref.IntRef index3 = lastIndex2;
        Object element5 = element3;
    L20:
        r1.L$0 = element5;     // Catch: Throwable -> L15
        r1.L$1 = index3;     // Catch: Throwable -> L15
        r1.L$2 = index2;     // Catch: Throwable -> L15
        r1.L$3 = $this$consume$iv$iv;     // Catch: Throwable -> L15
        r1.L$4 = r10;     // Catch: Throwable -> L15
        r1.label = 1;     // Catch: Throwable -> L15
        Object r13 = r10.hasNext(r1);     // Catch: Throwable -> L15
        if (r13 != r0) goto L23;
        return r0;
    L23:
        int r16 = $i$f$consume2;
        $result2 = $result;
        $result = r13;
        element3 = element5;
        lastIndex2 = index3;
        lastIndex3 = index2;
        $this$consume$iv$iv2 = $this$consume$iv$iv;
        cause$iv$iv = cause$iv$iv3;
        r8 = r10;
        r9 = lastIndex4;
        r6 = element4;
        $i$f$consume = r16;
        goto L46
    L30:
        Unit r2 = Unit.INSTANCE;     // Catch: Throwable -> L33
        ChannelsKt.cancelConsumed($this$consume$iv$iv2, cause$iv$iv);
        return Boxing.boxInt(lastIndex2.element);
    L15:
        e$iv$iv = th;
        goto L37
    L17:
        ResultKt.throwOnFailure($result);
        Ref.IntRef lastIndex5 = new Ref.IntRef();
        lastIndex5.element = -1;
        Ref.IntRef index4 = new Ref.IntRef();
        $this$consume$iv$iv = $this$consumeEach$iv;
        index3 = lastIndex5;
        lastIndex4 = null;
        element5 = element;
        element4 = null;
        $i$f$consume2 = 0;
        cause$iv$iv3 = null;
        index2 = index4;
        r10 = $this$consume$iv$iv.iterator();     // Catch: Throwable -> L35
    L35:
        e$iv$iv = th;
        goto L37
    L11:
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    L7:
        r1 = new C07381(r19);
        goto L8
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:36:0x00a1 -> B:58:0x00ab). Please report as a decompilation issue!!! */
    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Binary compatibility")
    public static final /* synthetic */ Object lastOrNull(ReceiveChannel $this$lastOrNull, Continuation r10) {
        if ((r10 instanceof C07391) == false) goto L7;
        C07391 r0 = (C07391) r10;
        if ((r0.label & Integer.MIN_VALUE) == 0) goto L7;
        r0.label -= Integer.MIN_VALUE;
    L8:
        Object last = r0.result;
        Object r1 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch(r0.label) {
            case 0: goto L23;
            case 1: goto L17;
            case 2: goto L12;
            default: goto L11;
        };
    L12:
        Object last2 = r0.L$2;
        ChannelIterator iterator = (ChannelIterator) r0.L$1;
        ReceiveChannel $this$consume$iv = (ReceiveChannel) r0.L$0;
        ResultKt.throwOnFailure(last);     // Catch: Throwable -> L15
        ReceiveChannel $this$consume$iv2 = $this$consume$iv;
        ChannelIterator iterator2 = iterator;
        Object r5 = last2;
        Throwable r4 = null;
        int $i$f$consume = 0;
        Object r2 = r1;
        C07391 r3 = r0;
        Object $result = last;
    L58:
    L43:
        Throwable cause$iv = th;
        $this$consume$iv = $this$consume$iv2;
    L51:
        Throwable cause$iv2 = cause$iv;
        throw cause$iv;     // Catch: Throwable -> L53
    L53:
        e$iv = move-exception;
        ChannelsKt.cancelConsumed($this$consume$iv, cause$iv2);
        throw e$iv;
    L38:
        if (((Boolean) last).booleanValue() == false) goto L41;
        Throwable r6 = r4;
        Object last3 = iterator2.next();     // Catch: Throwable -> L43
        last = $result;
        r0 = r3;
        r1 = r2;
        int $i$f$consume2 = $i$f$consume;
        Throwable cause$iv3 = r6;
        ChannelIterator iterator3 = iterator2;
        $this$consume$iv = $this$consume$iv2;
    L33:
        r0.L$0 = $this$consume$iv;     // Catch: Throwable -> L45
        r0.L$1 = iterator3;     // Catch: Throwable -> L45
        r0.L$2 = last3;     // Catch: Throwable -> L45
        r0.label = 2;     // Catch: Throwable -> L45
        Object r7 = iterator3.hasNext(r0);     // Catch: Throwable -> L45
        if (r7 != r1) goto L36;
        return r1;
    L36:
        C07391 r8 = r0;
        $result = last;
        last = r7;
        $this$consume$iv2 = $this$consume$iv;
        iterator2 = iterator3;
        r5 = last3;
        r4 = cause$iv3;
        $i$f$consume = $i$f$consume2;
        r2 = r1;
        r3 = r8;
    L45:
        cause$iv = th;
        goto L51
    L41:
        ChannelsKt.cancelConsumed($this$consume$iv2, r4);
        return r5;
    L15:
        cause$iv = th;
        goto L51
    L17:
        $i$f$consume2 = 0;
        ChannelIterator iterator4 = (ChannelIterator) r0.L$1;
        ReceiveChannel r9 = (ReceiveChannel) r0.L$0;
        ResultKt.throwOnFailure(last);     // Catch: Throwable -> L20
        Object r11 = last;
        $this$consume$iv = r9;
        int r12 = 0;
        Throwable cause$iv4 = null;
    L68:
        if (((Boolean) r11).booleanValue() == true) goto L31;
        ChannelsKt.cancelConsumed($this$consume$iv, cause$iv4);
        return null;
    L31:
        cause$iv3 = cause$iv4;
        ChannelIterator r13 = iterator4;
        last3 = iterator4.next();     // Catch: Throwable -> L45
        iterator3 = r13;
    L47:
        th = move-exception;
        cause$iv = th;
    L20:
        cause$iv = th;
        $this$consume$iv = r9;
        goto L51
    L23:
        ResultKt.throwOnFailure(last);
        $this$consume$iv = $this$lastOrNull;
        $i$f$consume2 = 0;
        cause$iv4 = null;
        r12 = 0;
        iterator4 = $this$consume$iv.iterator();     // Catch: Throwable -> L49
        r0.L$0 = $this$consume$iv;     // Catch: Throwable -> L49
        r0.L$1 = iterator4;     // Catch: Throwable -> L49
        r0.label = 1;     // Catch: Throwable -> L49
        r11 = iterator4.hasNext(r0);     // Catch: Throwable -> L49
        if (r11 != r1) goto L68;
        return r1;
    L49:
        th = move-exception;
        cause$iv = th;
        goto L51
    L11:
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    L7:
        r0 = new C07391(r10);
        goto L8
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Binary compatibility")
    public static final /* synthetic */ Object single(ReceiveChannel $this$single, Continuation r10) {
        if ((r10 instanceof C07461) == false) goto L7;
        C07461 r0 = (C07461) r10;
        if ((r0.label & Integer.MIN_VALUE) == 0) goto L7;
        r0.label -= Integer.MIN_VALUE;
    L8:
        Object $result = r0.result;
        Object r1 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch(r0.label) {
            case 0: goto L22;
            case 1: goto L17;
            case 2: goto L12;
            default: goto L11;
        };
    L12:
        Object r2 = r0.L$1;
        ReceiveChannel $this$consume$iv = (ReceiveChannel) r0.L$0;
        Throwable cause$iv = null;
        ResultKt.throwOnFailure($result);     // Catch: Throwable -> L15
        Object r7 = $result;
    L34:
        if (((Boolean) r7).booleanValue() == true) goto L38;
        ChannelsKt.cancelConsumed($this$consume$iv, cause$iv);
        return r2;
    L38:
        throw new IllegalArgumentException("ReceiveChannel has more than one element.");     // Catch: Throwable -> L15
    L15:
        e$iv = th;
    L42:
        Throwable cause$iv2 = e$iv;
        throw e$iv;     // Catch: Throwable -> L44
    L44:
        e$iv = move-exception;
        ChannelsKt.cancelConsumed($this$consume$iv, cause$iv2);
        throw e$iv;
    L17:
        int r3 = 0;
        ChannelIterator iterator = (ChannelIterator) r0.L$1;
        cause$iv = null;
        ReceiveChannel $this$consume$iv2 = (ReceiveChannel) r0.L$0;
        ResultKt.throwOnFailure($result);     // Catch: Throwable -> L20
        ChannelIterator iterator2 = iterator;
        Object r4 = $result;
    L28:
        if (((Boolean) r4).booleanValue() == false) goto L40;
        Object single = iterator2.next();     // Catch: Throwable -> L20
        r0.L$0 = $this$consume$iv2;     // Catch: Throwable -> L20
        r0.L$1 = single;     // Catch: Throwable -> L20
        r0.label = 2;     // Catch: Throwable -> L20
        r7 = iterator2.hasNext(r0);     // Catch: Throwable -> L20
        if (r7 != r1) goto L32;
        return r1;
    L32:
        r2 = single;
        $this$consume$iv = $this$consume$iv2;
        goto L34
    L40:
        throw new NoSuchElementException("ReceiveChannel is empty.");     // Catch: Throwable -> L20
    L20:
        e$iv = th;
        $this$consume$iv = $this$consume$iv2;
        goto L42
    L22:
        ResultKt.throwOnFailure($result);
        $this$consume$iv = $this$single;
        cause$iv = null;
        iterator2 = $this$consume$iv.iterator();     // Catch: Throwable -> L41
        r0.L$0 = $this$consume$iv;     // Catch: Throwable -> L41
        r0.L$1 = iterator2;     // Catch: Throwable -> L41
        r0.label = 1;     // Catch: Throwable -> L41
        Object r5 = iterator2.hasNext(r0);     // Catch: Throwable -> L41
        if (r5 != r1) goto L26;
        return r1;
    L26:
        r4 = r5;
        r3 = 0;
        $this$consume$iv2 = $this$consume$iv;
    L41:
        e$iv = th;
        goto L42
    L11:
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    L7:
        r0 = new C07461(r10);
        goto L8
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Binary compatibility")
    public static final /* synthetic */ Object singleOrNull(ReceiveChannel $this$singleOrNull, Continuation r11) {
        if ((r11 instanceof C07471) == false) goto L7;
        C07471 r0 = (C07471) r11;
        if ((r0.label & Integer.MIN_VALUE) == 0) goto L7;
        r0.label -= Integer.MIN_VALUE;
    L8:
        Object $result = r0.result;
        Object r1 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch(r0.label) {
            case 0: goto L22;
            case 1: goto L17;
            case 2: goto L12;
            default: goto L11;
        };
    L12:
        Object r2 = r0.L$1;
        ReceiveChannel $this$consume$iv = (ReceiveChannel) r0.L$0;
        ResultKt.throwOnFailure($result);     // Catch: Throwable -> L15
        Object r8 = $result;
        Throwable r5 = null;
    L54:
        if (((Boolean) r8).booleanValue() == false) goto L39;
        ChannelsKt.cancelConsumed($this$consume$iv, r5);
        return null;
    L39:
        ChannelsKt.cancelConsumed($this$consume$iv, r5);
        return r2;
    L41:
        Throwable e$iv = th;
    L49:
        Throwable cause$iv = e$iv;
        throw e$iv;     // Catch: Throwable -> L51
    L51:
        e$iv = move-exception;
        ChannelsKt.cancelConsumed($this$consume$iv, cause$iv);
        throw e$iv;
    L15:
        e$iv = th;
        goto L49
    L17:
        ChannelIterator iterator = (ChannelIterator) r0.L$1;
        ReceiveChannel r6 = (ReceiveChannel) r0.L$0;
        ResultKt.throwOnFailure($result);     // Catch: Throwable -> L20
        Throwable cause$iv2 = null;
        ChannelIterator iterator2 = iterator;
        ReceiveChannel $this$consume$iv2 = r6;
        Object r7 = $result;
        Throwable cause$iv3 = null;
    L62:
        if (((Boolean) r7).booleanValue() == true) goto L56;
        ChannelsKt.cancelConsumed($this$consume$iv2, cause$iv3);
        return null;
    L56:
        Object single = iterator2.next();     // Catch: Throwable -> L43
        r0.L$0 = $this$consume$iv2;     // Catch: Throwable -> L43
        r0.L$1 = single;     // Catch: Throwable -> L43
        r0.label = 2;     // Catch: Throwable -> L43
        r8 = iterator2.hasNext(r0);     // Catch: Throwable -> L43
        if (r8 != r1) goto L34;
        return r1;
    L34:
        r2 = single;
        r5 = cause$iv3;
        $this$consume$iv = $this$consume$iv2;
    L43:
        e$iv = th;
        $this$consume$iv = $this$consume$iv2;
    L45:
        e$iv = th;
        $this$consume$iv = $this$consume$iv2;
    L20:
        th = move-exception;
        $this$consume$iv = r6;
        e$iv = th;
        goto L49
    L22:
        ResultKt.throwOnFailure($result);
        $this$consume$iv = $this$singleOrNull;
        iterator2 = $this$consume$iv.iterator();     // Catch: Throwable -> L47
        r0.L$0 = $this$consume$iv;     // Catch: Throwable -> L47
        r0.L$1 = iterator2;     // Catch: Throwable -> L47
        r0.label = 1;     // Catch: Throwable -> L47
        r7 = iterator2.hasNext(r0);     // Catch: Throwable -> L47
        if (r7 != r1) goto L26;
        return r1;
    L26:
        cause$iv2 = null;
        $this$consume$iv2 = $this$consume$iv;
        cause$iv3 = null;
    L47:
        th = move-exception;
        e$iv = th;
        goto L49
    L11:
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    L7:
        r0 = new C07471(r11);
        goto L8
    }

    public static /* synthetic */ ReceiveChannel drop$default(ReceiveChannel r0, int r1, CoroutineDispatcher r2, int r3, Object r4) {
        if ((r3 & 2) == 0) goto L6;
        r2 = Dispatchers.getUnconfined();
    L6:
        return ChannelsKt.drop(r0, r1, r2);
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Binary compatibility")
    public static final /* synthetic */ ReceiveChannel drop(ReceiveChannel $this$drop, int n, CoroutineContext context) {
        return ProduceKt.produce$default(GlobalScope.INSTANCE, context, 0, null, ChannelsKt.consumes($this$drop), new C07241(n, $this$drop, null), 6, null);
    }

    public static /* synthetic */ ReceiveChannel dropWhile$default(ReceiveChannel r0, CoroutineDispatcher r1, Function2 r2, int r3, Object r4) {
        if ((r3 & 1) == 0) goto L6;
        r1 = Dispatchers.getUnconfined();
    L6:
        return ChannelsKt.dropWhile(r0, r1, r2);
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Binary compatibility")
    public static final /* synthetic */ ReceiveChannel dropWhile(ReceiveChannel $this$dropWhile, CoroutineContext context, Function2 predicate) {
        return ProduceKt.produce$default(GlobalScope.INSTANCE, context, 0, null, ChannelsKt.consumes($this$dropWhile), new C07251($this$dropWhile, predicate, null), 6, null);
    }

    public static /* synthetic */ ReceiveChannel filter$default(ReceiveChannel r0, CoroutineDispatcher r1, Function2 r2, int r3, Object r4) {
        if ((r3 & 1) == 0) goto L6;
        r1 = Dispatchers.getUnconfined();
    L6:
        return ChannelsKt.filter(r0, r1, r2);
    }

    public static final <E> ReceiveChannel<E> filter(ReceiveChannel<? extends E> r9, CoroutineContext context, Function2<? super E, ? super Continuation<? super Boolean>, ? extends Object> r11) {
        return ProduceKt.produce$default(GlobalScope.INSTANCE, context, 0, null, ChannelsKt.consumes(r9), new C07281(r9, r11, null), 6, null);
    }

    public static /* synthetic */ ReceiveChannel filterIndexed$default(ReceiveChannel r0, CoroutineDispatcher r1, Function3 r2, int r3, Object r4) {
        if ((r3 & 1) == 0) goto L6;
        r1 = Dispatchers.getUnconfined();
    L6:
        return ChannelsKt.filterIndexed(r0, r1, r2);
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Binary compatibility")
    public static final /* synthetic */ ReceiveChannel filterIndexed(ReceiveChannel $this$filterIndexed, CoroutineContext context, Function3 predicate) {
        return ProduceKt.produce$default(GlobalScope.INSTANCE, context, 0, null, ChannelsKt.consumes($this$filterIndexed), new C07291($this$filterIndexed, predicate, null), 6, null);
    }

    public static /* synthetic */ ReceiveChannel filterNot$default(ReceiveChannel r0, CoroutineDispatcher r1, Function2 r2, int r3, Object r4) {
        if ((r3 & 1) == 0) goto L6;
        r1 = Dispatchers.getUnconfined();
    L6:
        return ChannelsKt.filterNot(r0, r1, r2);
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Binary compatibility")
    public static final /* synthetic */ ReceiveChannel filterNot(ReceiveChannel $this$filterNot, CoroutineContext context, Function2 predicate) {
        return ChannelsKt.filter($this$filterNot, context, new C07301(predicate, null));
    }

    public static final <E> ReceiveChannel<E> filterNotNull(ReceiveChannel<? extends E> r3) {
        ReceiveChannel<E> r0 = ChannelsKt.filter$default(r3, null, new C07311(null), 1, null);
        Intrinsics.checkNotNull(r0, "null cannot be cast to non-null type kotlinx.coroutines.channels.ReceiveChannel<E of kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.filterNotNull>");
        return r0;
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x0071 -> B:42:0x007b). Please report as a decompilation issue!!! */
    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Binary compatibility")
    public static final /* synthetic */ Object filterNotNullTo(ReceiveChannel $this$consumeEach$iv, Collection destination, Continuation r12) {
        if ((r12 instanceof C07321) == false) goto L7;
        C07321 r0 = (C07321) r12;
        if ((r0.label & Integer.MIN_VALUE) == 0) goto L7;
        r0.label -= Integer.MIN_VALUE;
    L8:
        Object $result = r0.result;
        Object r1 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch(r0.label) {
            case 0: goto L17;
            case 1: goto L12;
            default: goto L11;
        };
    L12:
        ChannelIterator r3 = (ChannelIterator) r0.L$2;
        ReceiveChannel $this$consume$iv$iv = (ReceiveChannel) r0.L$1;
        Collection destination2 = (Collection) r0.L$0;
        ResultKt.throwOnFailure($result);     // Catch: Throwable -> L15
        Collection destination3 = destination2;
        ReceiveChannel $this$consume$iv$iv2 = $this$consume$iv$iv;
        Throwable cause$iv$iv = null;
        ChannelIterator r4 = r3;
        int r5 = 0;
        Object r2 = r1;
        C07321 r6 = r0;
        Object $result2 = $result;
    L42:
    L33:
        th = move-exception;
        e$iv$iv = th;
        $this$consume$iv$iv = $this$consume$iv$iv2;
    L37:
        Throwable cause$iv$iv2 = e$iv$iv;
        throw e$iv$iv;     // Catch: Throwable -> L39
    L39:
        e$iv$iv = move-exception;
        ChannelsKt.cancelConsumed($this$consume$iv$iv, cause$iv$iv2);
        throw e$iv$iv;
    L25:
        if (((Boolean) $result).booleanValue() == false) goto L30;
        Object it = r4.next();     // Catch: Throwable -> L33
        if (it == null) goto L29;
        destination3.add(it);     // Catch: Throwable -> L33
    L29:
        $result = $result2;
        r0 = r6;
        r1 = r2;
        int $i$f$consumeEach = r5;
        ChannelIterator r7 = r4;
        Throwable cause$iv$iv3 = cause$iv$iv;
        $this$consume$iv$iv = $this$consume$iv$iv2;
        Collection destination4 = destination3;
    L20:
        r0.L$0 = destination4;     // Catch: Throwable -> L15
        r0.L$1 = $this$consume$iv$iv;     // Catch: Throwable -> L15
        r0.L$2 = r7;     // Catch: Throwable -> L15
        r0.label = 1;     // Catch: Throwable -> L15
        Object r8 = r7.hasNext(r0);     // Catch: Throwable -> L15
        if (r8 != r1) goto L23;
        return r1;
    L23:
        C07321 r9 = r0;
        $result2 = $result;
        $result = r8;
        destination3 = destination4;
        $this$consume$iv$iv2 = $this$consume$iv$iv;
        cause$iv$iv = cause$iv$iv3;
        r4 = r7;
        r5 = $i$f$consumeEach;
        r2 = r1;
        r6 = r9;
        goto L42
    L30:
        Unit r13 = Unit.INSTANCE;     // Catch: Throwable -> L33
        ChannelsKt.cancelConsumed($this$consume$iv$iv2, cause$iv$iv);
        return destination3;
    L15:
        e$iv$iv = th;
        goto L37
    L17:
        ResultKt.throwOnFailure($result);
        $this$consume$iv$iv = $this$consumeEach$iv;
        cause$iv$iv3 = null;
        $i$f$consumeEach = 0;
        destination4 = destination;
        r7 = $this$consume$iv$iv.iterator();     // Catch: Throwable -> L35
    L35:
        e$iv$iv = th;
        goto L37
    L11:
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    L7:
        r0 = new C07321(r12);
        goto L8
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x00a9 -> B:35:0x00af). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:36:0x00b8 -> B:37:0x00bb). Please report as a decompilation issue!!! */
    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Binary compatibility")
    public static final /* synthetic */ Object filterNotNullTo(ReceiveChannel $this$consumeEach$iv, SendChannel destination, Continuation r13) {
        if ((r13 instanceof AnonymousClass3) == false) goto L7;
        AnonymousClass3 r0 = (AnonymousClass3) r13;
        if ((r0.label & Integer.MIN_VALUE) == 0) goto L7;
        r0.label -= Integer.MIN_VALUE;
    L8:
        Object $result = r0.result;
        Object r1 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch(r0.label) {
            case 0: goto L20;
            case 1: goto L15;
            case 2: goto L12;
            default: goto L11;
        };
    L12:
        Object destination2 = null;
        int r2 = 0;
        ChannelIterator r4 = (ChannelIterator) r0.L$2;
        Throwable cause$iv$iv = null;
        ReceiveChannel $this$consume$iv$iv = (ReceiveChannel) r0.L$1;
        SendChannel destination3 = (SendChannel) r0.L$0;
        ResultKt.throwOnFailure($result);     // Catch: Throwable -> L18
    L35:
        Object r10 = $result;
        Object $result2 = destination2;
        destination = destination3;
        ChannelIterator r7 = r4;
        int r5 = r2;
        Object r3 = r1;
        AnonymousClass3 r6 = r0;
        Object $result3 = r10;
    L58:
        r6.L$0 = destination;     // Catch: Throwable -> L43
        r6.L$1 = $this$consume$iv$iv;     // Catch: Throwable -> L43
        r6.L$2 = r7;     // Catch: Throwable -> L43
        r6.label = 1;     // Catch: Throwable -> L43
        Object r8 = r7.hasNext(r6);     // Catch: Throwable -> L43
        if (r8 != r3) goto L26;
        return r3;
    L26:
        ChannelIterator r11 = r7;
        destination3 = destination;
        destination2 = $result2;
        $result = r8;
        ChannelIterator r9 = r11;
    L54:
    L41:
        th = move-exception;
        e$iv$iv = th;
    L47:
        Throwable cause$iv$iv2 = e$iv$iv;
        throw e$iv$iv;     // Catch: Throwable -> L49
    L49:
        e$iv$iv = move-exception;
        ChannelsKt.cancelConsumed($this$consume$iv$iv, cause$iv$iv2);
        throw e$iv$iv;
    L28:
        if (((Boolean) $result).booleanValue() == false) goto L38;
        Object it = r9.next();     // Catch: Throwable -> L41
        if (it == null) goto L36;
        r6.L$0 = destination3;     // Catch: Throwable -> L41
        r6.L$1 = $this$consume$iv$iv;     // Catch: Throwable -> L41
        r6.L$2 = r9;     // Catch: Throwable -> L41
        r6.label = 2;     // Catch: Throwable -> L41
        if (destination3.send(it, r6) != r3) goto L34;
        return r3;
    L34:
        $result = $result3;
        r0 = r6;
        r1 = r3;
        r2 = r5;
        r4 = r9;
        goto L35
    L36:
        $result2 = destination2;
        destination = destination3;
        r7 = r9;
        goto L58
    L38:
        Unit r14 = Unit.INSTANCE;     // Catch: Throwable -> L41
        ChannelsKt.cancelConsumed($this$consume$iv$iv, cause$iv$iv);
        return destination3;
    L43:
        th = move-exception;
        e$iv$iv = th;
        goto L47
    L15:
        destination2 = null;
        r9 = (ChannelIterator) r0.L$2;
        cause$iv$iv = null;
        ReceiveChannel $this$consume$iv$iv2 = (ReceiveChannel) r0.L$1;
        $this$consume$iv$iv = $this$consume$iv$iv2;
        SendChannel destination4 = (SendChannel) r0.L$0;
        ResultKt.throwOnFailure($result);     // Catch: Throwable -> L18
        destination3 = destination4;
        r5 = 0;
        r3 = r1;
        r6 = r0;
        $result3 = $result;
        goto L54
    L20:
        ResultKt.throwOnFailure($result);
        $this$consume$iv$iv = $this$consumeEach$iv;
        cause$iv$iv = null;
        r5 = 0;
        r7 = $this$consume$iv$iv.iterator();     // Catch: Throwable -> L45
        $result2 = null;
        r3 = r1;
        r6 = r0;
        $result3 = $result;
    L45:
        e$iv$iv = th;
        goto L47
    L11:
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    L18:
        e$iv$iv = th;
    L7:
        r0 = new AnonymousClass3(r13);
        goto L8
    }

    public static /* synthetic */ ReceiveChannel take$default(ReceiveChannel r0, int r1, CoroutineDispatcher r2, int r3, Object r4) {
        if ((r3 & 2) == 0) goto L6;
        r2 = Dispatchers.getUnconfined();
    L6:
        return ChannelsKt.take(r0, r1, r2);
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Binary compatibility")
    public static final /* synthetic */ ReceiveChannel take(ReceiveChannel $this$take, int n, CoroutineContext context) {
        return ProduceKt.produce$default(GlobalScope.INSTANCE, context, 0, null, ChannelsKt.consumes($this$take), new C07481(n, $this$take, null), 6, null);
    }

    public static /* synthetic */ ReceiveChannel takeWhile$default(ReceiveChannel r0, CoroutineDispatcher r1, Function2 r2, int r3, Object r4) {
        if ((r3 & 1) == 0) goto L6;
        r1 = Dispatchers.getUnconfined();
    L6:
        return ChannelsKt.takeWhile(r0, r1, r2);
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Binary compatibility")
    public static final /* synthetic */ ReceiveChannel takeWhile(ReceiveChannel $this$takeWhile, CoroutineContext context, Function2 predicate) {
        return ProduceKt.produce$default(GlobalScope.INSTANCE, context, 0, null, ChannelsKt.consumes($this$takeWhile), new C07491($this$takeWhile, predicate, null), 6, null);
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:32:0x00af -> B:33:0x00b3). Please report as a decompilation issue!!! */
    public static final <E, C extends SendChannel<? super E>> Object toChannel(ReceiveChannel<? extends E> r11, C r12, Continuation<? super C> r13) {
        if ((r13 instanceof C07501) == false) goto L7;
        C07501 r0 = (C07501) r13;
        if ((r0.label & Integer.MIN_VALUE) == 0) goto L7;
        r0.label -= Integer.MIN_VALUE;
    L8:
        Object r14 = r0.result;
        Object r1 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch(r0.label) {
            case 0: goto L20;
            case 1: goto L15;
            case 2: goto L12;
            default: goto L11;
        };
    L12:
        ChannelIterator<? extends E> r4 = (ChannelIterator) r0.L$2;
        Throwable r5 = null;
        ReceiveChannel<? extends E> r6 = (ReceiveChannel) r0.L$1;
        SendChannel r7 = (SendChannel) r0.L$0;
        ResultKt.throwOnFailure(r14);     // Catch: Throwable -> L18
        Object r15 = null;
        SendChannel r16 = (C) r7;
        ChannelIterator<? extends E> r8 = r4;
        Object r2 = r1;
        C07501 r3 = r0;
        Object r9 = r14;
        SendChannel r17 = r16;
    L33:
        SendChannel r18 = r17;
    L51:
        r3.L$0 = r18;     // Catch: Throwable -> L39
        r3.L$1 = r6;     // Catch: Throwable -> L39
        r3.L$2 = r8;     // Catch: Throwable -> L39
        r3.label = 1;     // Catch: Throwable -> L39
        Object r10 = r8.hasNext(r3);     // Catch: Throwable -> L39
        if (r10 != r2) goto L26;
        return r2;
    L26:
        ChannelIterator<? extends E> r19 = r8;
        SendChannel r20 = r18;
        Object r110 = r15;
        r14 = r10;
        ChannelIterator<? extends E> r21 = r19;
    L55:
    L37:
        th = move-exception;
        th = th;
    L43:
        Throwable r22 = th;
        throw th;     // Catch: Throwable -> L45
    L45:
        th = move-exception;
        ChannelsKt.cancelConsumed(r6, r22);
        throw th;
    L28:
        if (((Boolean) r14).booleanValue() == false) goto L34;
        E r111 = r21.next();     // Catch: Throwable -> L37
        r3.L$0 = r20;     // Catch: Throwable -> L37
        r3.L$1 = r6;     // Catch: Throwable -> L37
        r3.L$2 = r21;     // Catch: Throwable -> L37
        r3.label = 2;     // Catch: Throwable -> L37
        if (r20.send(r111, r3) != r2) goto L32;
        return r2;
    L32:
        r15 = r110;
        r17 = r20;
        r8 = r21;
        goto L33
    L34:
        Unit r112 = Unit.INSTANCE;     // Catch: Throwable -> L37
        ChannelsKt.cancelConsumed(r6, r5);
        return r20;
    L39:
        th = move-exception;
        th = th;
        goto L43
    L15:
        r110 = null;
        r21 = (ChannelIterator) r0.L$2;
        r5 = null;
        r6 = (ReceiveChannel) r0.L$1;
        SendChannel r23 = (SendChannel) r0.L$0;
        ResultKt.throwOnFailure(r14);     // Catch: Throwable -> L18
        r20 = r23;
        r2 = r1;
        r3 = r0;
        r9 = r14;
        goto L55
    L20:
        ResultKt.throwOnFailure(r14);
        r6 = r11;
        r5 = null;
        r8 = r6.iterator();     // Catch: Throwable -> L41
        r15 = null;
        r2 = r1;
        r3 = r0;
        r9 = r14;
        r18 = r12;
    L41:
        th = th;
        goto L43
    L11:
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    L18:
        th = th;
    L7:
        r0 = new C07501(r13);
        goto L8
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v4, types: [java.lang.Object, java.util.Collection] */
    /* JADX WARN: Type inference failed for: r7v5 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x0071 -> B:39:0x007b). Please report as a decompilation issue!!! */
    public static final <E, C extends Collection<? super E>> Object toCollection(ReceiveChannel<? extends E> r11, C r12, Continuation<? super C> r13) {
        if ((r13 instanceof C07511) == false) goto L7;
        C07511 r0 = (C07511) r13;
        if ((r0.label & Integer.MIN_VALUE) == 0) goto L7;
        r0.label -= Integer.MIN_VALUE;
    L8:
        Object e$iv = r0.result;
        Object r1 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch(r0.label) {
            case 0: goto L17;
            case 1: goto L12;
            default: goto L11;
        };
    L12:
        ChannelIterator r3 = (ChannelIterator) r0.L$2;
        ReceiveChannel<? extends E> r5 = (ReceiveChannel) r0.L$1;
        Collection destination = (Collection) r0.L$0;
        ResultKt.throwOnFailure(e$iv);     // Catch: Throwable -> L15
        ?? r7 = destination;
        ReceiveChannel<? extends E> r6 = r5;
        Throwable cause$iv$iv = null;
        ChannelIterator r4 = r3;
        int r8 = 0;
        Object r2 = r1;
        C07511 r9 = r0;
        Object $result = e$iv;
    L39:
    L30:
        th = move-exception;
        e$iv$iv = th;
        r5 = r6;
    L34:
        Throwable cause$iv$iv2 = e$iv$iv;
        throw e$iv$iv;     // Catch: Throwable -> L36
    L36:
        e$iv$iv = move-exception;
        ChannelsKt.cancelConsumed(r5, cause$iv$iv2);
        throw e$iv$iv;
    L25:
        if (((Boolean) e$iv).booleanValue() == false) goto L27;
        r7.add(r4.next());     // Catch: Throwable -> L30
        e$iv = $result;
        r0 = r9;
        r1 = r2;
        int $i$f$consumeEach = r8;
        ChannelIterator r10 = r4;
        Throwable cause$iv$iv3 = cause$iv$iv;
        r5 = r6;
        ?? r14 = r7;
    L20:
        r0.L$0 = r14;     // Catch: Throwable -> L15
        r0.L$1 = r5;     // Catch: Throwable -> L15
        r0.L$2 = r10;     // Catch: Throwable -> L15
        r0.label = 1;     // Catch: Throwable -> L15
        Object r15 = r10.hasNext(r0);     // Catch: Throwable -> L15
        if (r15 != r1) goto L23;
        return r1;
    L23:
        C07511 r16 = r0;
        $result = e$iv;
        e$iv = r15;
        r7 = r14;
        r6 = r5;
        cause$iv$iv = cause$iv$iv3;
        r4 = r10;
        r8 = $i$f$consumeEach;
        r2 = r1;
        r9 = r16;
        goto L39
    L27:
        Unit r17 = Unit.INSTANCE;     // Catch: Throwable -> L30
        ChannelsKt.cancelConsumed(r6, cause$iv$iv);
        return r7;
    L15:
        e$iv$iv = th;
        goto L34
    L17:
        ResultKt.throwOnFailure(e$iv);
        r5 = r11;
        cause$iv$iv3 = null;
        $i$f$consumeEach = 0;
        r14 = r12;
        r10 = r5.iterator();     // Catch: Throwable -> L32
    L32:
        e$iv$iv = th;
        goto L34
    L11:
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    L7:
        r0 = new C07511(r13);
        goto L8
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Binary compatibility")
    public static final /* synthetic */ Object toMap(ReceiveChannel $this$toMap, Continuation $completion) {
        return ChannelsKt.toMap($this$toMap, new LinkedHashMap(), $completion);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v4, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r7v5 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x0071 -> B:45:0x007b). Please report as a decompilation issue!!! */
    public static final <K, V, M extends Map<? super K, ? super V>> Object toMap(ReceiveChannel<? extends Pair<? extends K, ? extends V>> r13, M r14, Continuation<? super M> r15) {
        if ((r15 instanceof AnonymousClass2) == false) goto L7;
        AnonymousClass2 r0 = (AnonymousClass2) r15;
        if ((r0.label & Integer.MIN_VALUE) == 0) goto L7;
        r0.label -= Integer.MIN_VALUE;
    L8:
        Object e$iv = r0.result;
        Object r1 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch(r0.label) {
            case 0: goto L17;
            case 1: goto L12;
            default: goto L11;
        };
    L12:
        ChannelIterator r3 = (ChannelIterator) r0.L$2;
        ReceiveChannel<? extends Pair<? extends K, ? extends V>> r5 = (ReceiveChannel) r0.L$1;
        Map destination = (Map) r0.L$0;
        ResultKt.throwOnFailure(e$iv);     // Catch: Throwable -> L15
        ?? r7 = destination;
        ReceiveChannel<? extends Pair<? extends K, ? extends V>> r6 = r5;
        Throwable cause$iv$iv = null;
        ChannelIterator r4 = r3;
        int r8 = 0;
        Object r2 = r1;
        AnonymousClass2 r9 = r0;
        Object $result = e$iv;
    L45:
    L30:
        th = move-exception;
        e$iv$iv = th;
        r5 = r6;
    L34:
        Throwable cause$iv$iv2 = e$iv$iv;
        throw e$iv$iv;     // Catch: Throwable -> L36
    L36:
        e$iv$iv = move-exception;
        ChannelsKt.cancelConsumed(r5, cause$iv$iv2);
        throw e$iv$iv;
    L25:
        if (((Boolean) e$iv).booleanValue() == false) goto L27;
        Pair it = (Pair) r4.next();     // Catch: Throwable -> L30
        r7.put(it.getFirst(), it.getSecond());     // Catch: Throwable -> L30
        e$iv = $result;
        r0 = r9;
        r1 = r2;
        int $i$f$consumeEach = r8;
        ChannelIterator r10 = r4;
        Throwable cause$iv$iv3 = cause$iv$iv;
        r5 = r6;
        ?? r11 = r7;
    L20:
        r0.L$0 = r11;     // Catch: Throwable -> L15
        r0.L$1 = r5;     // Catch: Throwable -> L15
        r0.L$2 = r10;     // Catch: Throwable -> L15
        r0.label = 1;     // Catch: Throwable -> L15
        Object r12 = r10.hasNext(r0);     // Catch: Throwable -> L15
        if (r12 != r1) goto L23;
        return r1;
    L23:
        AnonymousClass2 r16 = r0;
        $result = e$iv;
        e$iv = r12;
        r7 = r11;
        r6 = r5;
        cause$iv$iv = cause$iv$iv3;
        r4 = r10;
        r8 = $i$f$consumeEach;
        r2 = r1;
        r9 = r16;
        goto L45
    L27:
        Unit r17 = Unit.INSTANCE;     // Catch: Throwable -> L30
        ChannelsKt.cancelConsumed(r6, cause$iv$iv);
        return r7;
    L15:
        e$iv$iv = th;
        goto L34
    L17:
        ResultKt.throwOnFailure(e$iv);
        r5 = r13;
        cause$iv$iv3 = null;
        $i$f$consumeEach = 0;
        r11 = r14;
        r10 = r5.iterator();     // Catch: Throwable -> L32
    L32:
        e$iv$iv = th;
        goto L34
    L11:
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    L7:
        r0 = new AnonymousClass2(r15);
        goto L8
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Binary compatibility")
    public static final /* synthetic */ Object toMutableList(ReceiveChannel $this$toMutableList, Continuation $completion) {
        return ChannelsKt.toCollection($this$toMutableList, new ArrayList(), $completion);
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Binary compatibility")
    public static final /* synthetic */ Object toSet(ReceiveChannel $this$toSet, Continuation $completion) {
        return ChannelsKt.toMutableSet($this$toSet, $completion);
    }

    public static /* synthetic */ ReceiveChannel flatMap$default(ReceiveChannel r0, CoroutineDispatcher r1, Function2 r2, int r3, Object r4) {
        if ((r3 & 1) == 0) goto L6;
        r1 = Dispatchers.getUnconfined();
    L6:
        return ChannelsKt.flatMap(r0, r1, r2);
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Binary compatibility")
    public static final /* synthetic */ ReceiveChannel flatMap(ReceiveChannel $this$flatMap, CoroutineContext context, Function2 transform) {
        return ProduceKt.produce$default(GlobalScope.INSTANCE, context, 0, null, ChannelsKt.consumes($this$flatMap), new C07351($this$flatMap, transform, null), 6, null);
    }

    public static /* synthetic */ ReceiveChannel map$default(ReceiveChannel r0, CoroutineDispatcher r1, Function2 r2, int r3, Object r4) {
        if ((r3 & 1) == 0) goto L6;
        r1 = Dispatchers.getUnconfined();
    L6:
        return ChannelsKt.map(r0, r1, r2);
    }

    public static final <E, R> ReceiveChannel<R> map(ReceiveChannel<? extends E> r9, CoroutineContext context, Function2<? super E, ? super Continuation<? super R>, ? extends Object> r11) {
        return ProduceKt.produce$default(GlobalScope.INSTANCE, context, 0, null, ChannelsKt.consumes(r9), new C07401(r9, r11, null), 6, null);
    }

    public static /* synthetic */ ReceiveChannel mapIndexed$default(ReceiveChannel r0, CoroutineDispatcher r1, Function3 r2, int r3, Object r4) {
        if ((r3 & 1) == 0) goto L6;
        r1 = Dispatchers.getUnconfined();
    L6:
        return ChannelsKt.mapIndexed(r0, r1, r2);
    }

    public static final <E, R> ReceiveChannel<R> mapIndexed(ReceiveChannel<? extends E> r9, CoroutineContext context, Function3<? super Integer, ? super E, ? super Continuation<? super R>, ? extends Object> r11) {
        return ProduceKt.produce$default(GlobalScope.INSTANCE, context, 0, null, ChannelsKt.consumes(r9), new C07411(r9, r11, null), 6, null);
    }

    public static /* synthetic */ ReceiveChannel mapIndexedNotNull$default(ReceiveChannel r0, CoroutineDispatcher r1, Function3 r2, int r3, Object r4) {
        if ((r3 & 1) == 0) goto L6;
        r1 = Dispatchers.getUnconfined();
    L6:
        return ChannelsKt.mapIndexedNotNull(r0, r1, r2);
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Binary compatibility")
    public static final /* synthetic */ ReceiveChannel mapIndexedNotNull(ReceiveChannel $this$mapIndexedNotNull, CoroutineContext context, Function3 transform) {
        return ChannelsKt.filterNotNull(ChannelsKt.mapIndexed($this$mapIndexedNotNull, context, transform));
    }

    public static /* synthetic */ ReceiveChannel mapNotNull$default(ReceiveChannel r0, CoroutineDispatcher r1, Function2 r2, int r3, Object r4) {
        if ((r3 & 1) == 0) goto L6;
        r1 = Dispatchers.getUnconfined();
    L6:
        return ChannelsKt.mapNotNull(r0, r1, r2);
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Binary compatibility")
    public static final /* synthetic */ ReceiveChannel mapNotNull(ReceiveChannel $this$mapNotNull, CoroutineContext context, Function2 transform) {
        return ChannelsKt.filterNotNull(ChannelsKt.map($this$mapNotNull, context, transform));
    }

    public static /* synthetic */ ReceiveChannel withIndex$default(ReceiveChannel r0, CoroutineDispatcher r1, int r2, Object r3) {
        if ((r2 & 1) == 0) goto L6;
        r1 = Dispatchers.getUnconfined();
    L6:
        return ChannelsKt.withIndex(r0, r1);
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Binary compatibility")
    public static final /* synthetic */ ReceiveChannel withIndex(ReceiveChannel $this$withIndex, CoroutineContext context) {
        return ProduceKt.produce$default(GlobalScope.INSTANCE, context, 0, null, ChannelsKt.consumes($this$withIndex), new C07521($this$withIndex, null), 6, null);
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Binary compatibility")
    public static final /* synthetic */ ReceiveChannel distinct(ReceiveChannel $this$distinct) {
        return ChannelsKt.distinctBy$default($this$distinct, null, new C07221(null), 1, null);
    }

    public static /* synthetic */ ReceiveChannel distinctBy$default(ReceiveChannel r0, CoroutineDispatcher r1, Function2 r2, int r3, Object r4) {
        if ((r3 & 1) == 0) goto L6;
        r1 = Dispatchers.getUnconfined();
    L6:
        return ChannelsKt.distinctBy(r0, r1, r2);
    }

    public static final <E, K> ReceiveChannel<E> distinctBy(ReceiveChannel<? extends E> r9, CoroutineContext context, Function2<? super E, ? super Continuation<? super K>, ? extends Object> r11) {
        return ProduceKt.produce$default(GlobalScope.INSTANCE, context, 0, null, ChannelsKt.consumes(r9), new C07231(r9, r11, null), 6, null);
    }

    public static final <E> Object toMutableSet(ReceiveChannel<? extends E> r1, Continuation<? super Set<E>> r2) {
        return ChannelsKt.toCollection(r1, new LinkedHashSet(), r2);
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Binary compatibility")
    public static final /* synthetic */ Object any(ReceiveChannel $this$any, Continuation r9) {
        if ((r9 instanceof AnonymousClass1) == false) goto L7;
        AnonymousClass1 r0 = (AnonymousClass1) r9;
        if ((r0.label & Integer.MIN_VALUE) == 0) goto L7;
        r0.label -= Integer.MIN_VALUE;
    L8:
        Object $result = r0.result;
        Object r1 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch(r0.label) {
            case 0: goto L17;
            case 1: goto L12;
            default: goto L11;
        };
    L12:
        ReceiveChannel $this$consume$iv = (ReceiveChannel) r0.L$0;
        Throwable cause$iv = null;
        ResultKt.throwOnFailure($result);     // Catch: Throwable -> L15
        Object r6 = $result;
    L21:
        ChannelsKt.cancelConsumed($this$consume$iv, cause$iv);
        return r6;
    L15:
        e$iv = th;
    L24:
        Throwable cause$iv2 = e$iv;
        throw e$iv;     // Catch: Throwable -> L26
    L26:
        e$iv = move-exception;
        ChannelsKt.cancelConsumed($this$consume$iv, cause$iv2);
        throw e$iv;
    L17:
        ResultKt.throwOnFailure($result);
        $this$consume$iv = $this$any;
        cause$iv = null;
        ChannelIterator r7 = $this$consume$iv.iterator();     // Catch: Throwable -> L23
        r0.L$0 = $this$consume$iv;     // Catch: Throwable -> L23
        r0.label = 1;     // Catch: Throwable -> L23
        r6 = r7.hasNext(r0);     // Catch: Throwable -> L23
        if (r6 != r1) goto L21;
        return r1;
    L23:
        e$iv = th;
        goto L24
    L11:
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    L7:
        r0 = new AnonymousClass1(r9);
        goto L8
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x0077 -> B:45:0x0082). Please report as a decompilation issue!!! */
    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Binary compatibility")
    public static final /* synthetic */ Object count(ReceiveChannel $this$consumeEach$iv, Continuation r14) {
        if ((r14 instanceof C07211) == false) goto L7;
        C07211 r0 = (C07211) r14;
        if ((r0.label & Integer.MIN_VALUE) == 0) goto L7;
        r0.label -= Integer.MIN_VALUE;
    L8:
        Object e$iv = r0.result;
        Object r1 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch(r0.label) {
            case 0: goto L17;
            case 1: goto L12;
            default: goto L11;
        };
    L12:
        ChannelIterator r5 = (ChannelIterator) r0.L$2;
        ReceiveChannel $this$consume$iv$iv = (ReceiveChannel) r0.L$1;
        Ref.IntRef count = (Ref.IntRef) r0.L$0;
        ResultKt.throwOnFailure(e$iv);     // Catch: Throwable -> L15
        Ref.IntRef count2 = count;
        ReceiveChannel $this$consume$iv$iv2 = $this$consume$iv$iv;
        Throwable cause$iv$iv = null;
        ChannelIterator r6 = r5;
        int r7 = 0;
        Ref.IntRef r4 = null;
        Object r2 = r1;
        C07211 r3 = r0;
        Object $result = e$iv;
    L45:
    L30:
        th = move-exception;
        e$iv$iv = th;
        $this$consume$iv$iv = $this$consume$iv$iv2;
    L34:
        Throwable cause$iv$iv2 = e$iv$iv;
        throw e$iv$iv;     // Catch: Throwable -> L36
    L36:
        e$iv$iv = move-exception;
        ChannelsKt.cancelConsumed($this$consume$iv$iv, cause$iv$iv2);
        throw e$iv$iv;
    L25:
        if (((Boolean) e$iv).booleanValue() == false) goto L27;
        r6.next();     // Catch: Throwable -> L30
        count2.element++;     // Catch: Throwable -> L30
        e$iv = $result;
        r0 = r3;
        r1 = r2;
        Ref.IntRef count3 = r4;
        int $i$f$consume = r7;
        ChannelIterator r8 = r6;
        Throwable cause$iv$iv3 = cause$iv$iv;
        $this$consume$iv$iv = $this$consume$iv$iv2;
        Ref.IntRef count4 = count2;
    L20:
        r0.L$0 = count4;     // Catch: Throwable -> L15
        r0.L$1 = $this$consume$iv$iv;     // Catch: Throwable -> L15
        r0.L$2 = r8;     // Catch: Throwable -> L15
        r0.label = 1;     // Catch: Throwable -> L15
        Object r9 = r8.hasNext(r0);     // Catch: Throwable -> L15
        if (r9 != r1) goto L23;
        return r1;
    L23:
        C07211 r12 = r0;
        $result = e$iv;
        e$iv = r9;
        count2 = count4;
        $this$consume$iv$iv2 = $this$consume$iv$iv;
        cause$iv$iv = cause$iv$iv3;
        r6 = r8;
        r7 = $i$f$consume;
        r4 = count3;
        r2 = r1;
        r3 = r12;
        goto L45
    L27:
        Unit r15 = Unit.INSTANCE;     // Catch: Throwable -> L30
        ChannelsKt.cancelConsumed($this$consume$iv$iv2, cause$iv$iv);
        int $i$f$consumeEach = count2.element;
        return Boxing.boxInt($i$f$consumeEach);
    L15:
        e$iv$iv = th;
        goto L34
    L17:
        ResultKt.throwOnFailure(e$iv);
        Ref.IntRef count5 = new Ref.IntRef();
        $this$consume$iv$iv = $this$consumeEach$iv;
        cause$iv$iv3 = null;
        count3 = null;
        $i$f$consume = 0;
        count4 = count5;
        r8 = $this$consume$iv$iv.iterator();     // Catch: Throwable -> L32
    L32:
        e$iv$iv = th;
        goto L34
    L11:
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    L7:
        r0 = new C07211(r14);
        goto L8
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:36:0x00af -> B:58:0x00b9). Please report as a decompilation issue!!! */
    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Binary compatibility")
    public static final /* synthetic */ Object maxWith(ReceiveChannel $this$consume$iv, Comparator comparator, Continuation r12) {
        if ((r12 instanceof C07421) == false) goto L7;
        C07421 r0 = (C07421) r12;
        if ((r0.label & Integer.MIN_VALUE) == 0) goto L7;
        r0.label -= Integer.MIN_VALUE;
    L8:
        Object max = r0.result;
        Object r1 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch(r0.label) {
            case 0: goto L22;
            case 1: goto L17;
            case 2: goto L12;
            default: goto L11;
        };
    L12:
        Object max2 = r0.L$3;
        ChannelIterator iterator = (ChannelIterator) r0.L$2;
        ReceiveChannel $this$consume$iv2 = (ReceiveChannel) r0.L$1;
        Comparator comparator2 = (Comparator) r0.L$0;
        ResultKt.throwOnFailure(max);     // Catch: Throwable -> L15
        Comparator comparator3 = comparator2;
        ReceiveChannel $this$consume$iv3 = $this$consume$iv2;
        ChannelIterator iterator2 = iterator;
        Throwable r4 = null;
        Object max3 = max2;
        Object max4 = r1;
        C07421 r2 = r0;
        Object $result = max;
    L58:
    L45:
        Throwable e$iv = th;
        $this$consume$iv2 = $this$consume$iv3;
    L53:
        Throwable cause$iv = e$iv;
        throw e$iv;     // Catch: Throwable -> L55
    L55:
        e$iv = move-exception;
        ChannelsKt.cancelConsumed($this$consume$iv2, cause$iv);
        throw e$iv;
    L38:
        if (((Boolean) max).booleanValue() == false) goto L43;
        Object e = iterator2.next();     // Catch: Throwable -> L45
        if (comparator3.compare(max3, e) >= 0) goto L42;
        Throwable cause$iv2 = r4;
        Object r5 = max4;
        Object max5 = e;
        max = $result;
        r0 = r2;
        r1 = r5;
        ChannelIterator iterator3 = iterator2;
        $this$consume$iv2 = $this$consume$iv3;
        Comparator comparator4 = comparator3;
    L33:
        r0.L$0 = comparator4;     // Catch: Throwable -> L47
        r0.L$1 = $this$consume$iv2;     // Catch: Throwable -> L47
        r0.L$2 = iterator3;     // Catch: Throwable -> L47
        r0.L$3 = max5;     // Catch: Throwable -> L47
        r0.label = 2;     // Catch: Throwable -> L47
        Object r7 = iterator3.hasNext(r0);     // Catch: Throwable -> L47
        if (r7 != r1) goto L36;
        return r1;
    L36:
        C07421 r9 = r0;
        $result = max;
        max = r7;
        comparator3 = comparator4;
        $this$consume$iv3 = $this$consume$iv2;
        iterator2 = iterator3;
        r4 = cause$iv2;
        max3 = max5;
        max4 = r1;
        r2 = r9;
    L47:
        e$iv = th;
        goto L53
    L42:
        max = $result;
        r0 = r2;
        r1 = max4;
        max5 = max3;
        cause$iv2 = r4;
        iterator3 = iterator2;
        $this$consume$iv2 = $this$consume$iv3;
        comparator4 = comparator3;
        goto L33
    L43:
        ChannelsKt.cancelConsumed($this$consume$iv3, r4);
        return max3;
    L15:
        e$iv = th;
        goto L53
    L17:
        ChannelIterator iterator4 = (ChannelIterator) r0.L$2;
        ReceiveChannel r6 = (ReceiveChannel) r0.L$1;
        Comparator comparator5 = (Comparator) r0.L$0;
        ResultKt.throwOnFailure(max);     // Catch: Throwable -> L20
        ChannelIterator iterator5 = iterator4;
        Throwable cause$iv3 = null;
        comparator4 = comparator5;
        $this$consume$iv2 = r6;
        Object r8 = max;
    L68:
        if (((Boolean) r8).booleanValue() == true) goto L31;
        ChannelsKt.cancelConsumed($this$consume$iv2, cause$iv3);
        return null;
    L31:
        cause$iv2 = cause$iv3;
        max5 = iterator5.next();     // Catch: Throwable -> L47
        iterator3 = iterator5;
    L49:
        e$iv = th;
    L20:
        e$iv = th;
        $this$consume$iv2 = r6;
        goto L53
    L22:
        ResultKt.throwOnFailure(max);
        cause$iv3 = null;
        iterator5 = $this$consume$iv.iterator();     // Catch: Throwable -> L51
        r0.L$0 = comparator;     // Catch: Throwable -> L51
        r0.L$1 = $this$consume$iv;     // Catch: Throwable -> L51
        r0.L$2 = iterator5;     // Catch: Throwable -> L51
        r0.label = 1;     // Catch: Throwable -> L51
        r8 = iterator5.hasNext(r0);     // Catch: Throwable -> L51
        if (r8 != r1) goto L26;
        return r1;
    L26:
        $this$consume$iv2 = $this$consume$iv;
        comparator4 = comparator;
    L51:
        th = move-exception;
        $this$consume$iv2 = $this$consume$iv;
        e$iv = th;
        goto L53
    L11:
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    L7:
        r0 = new C07421(r12);
        goto L8
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:36:0x00af -> B:58:0x00b9). Please report as a decompilation issue!!! */
    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Binary compatibility")
    public static final /* synthetic */ Object minWith(ReceiveChannel $this$consume$iv, Comparator comparator, Continuation r12) {
        if ((r12 instanceof C07431) == false) goto L7;
        C07431 r0 = (C07431) r12;
        if ((r0.label & Integer.MIN_VALUE) == 0) goto L7;
        r0.label -= Integer.MIN_VALUE;
    L8:
        Object min = r0.result;
        Object r1 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch(r0.label) {
            case 0: goto L22;
            case 1: goto L17;
            case 2: goto L12;
            default: goto L11;
        };
    L12:
        Object min2 = r0.L$3;
        ChannelIterator iterator = (ChannelIterator) r0.L$2;
        ReceiveChannel $this$consume$iv2 = (ReceiveChannel) r0.L$1;
        Comparator comparator2 = (Comparator) r0.L$0;
        ResultKt.throwOnFailure(min);     // Catch: Throwable -> L15
        Comparator comparator3 = comparator2;
        ReceiveChannel $this$consume$iv3 = $this$consume$iv2;
        ChannelIterator iterator2 = iterator;
        Throwable r4 = null;
        Object min3 = min2;
        Object min4 = r1;
        C07431 r2 = r0;
        Object $result = min;
    L58:
    L45:
        Throwable e$iv = th;
        $this$consume$iv2 = $this$consume$iv3;
    L53:
        Throwable cause$iv = e$iv;
        throw e$iv;     // Catch: Throwable -> L55
    L55:
        e$iv = move-exception;
        ChannelsKt.cancelConsumed($this$consume$iv2, cause$iv);
        throw e$iv;
    L38:
        if (((Boolean) min).booleanValue() == false) goto L43;
        Object e = iterator2.next();     // Catch: Throwable -> L45
        if (comparator3.compare(min3, e) <= 0) goto L42;
        Throwable cause$iv2 = r4;
        Object r5 = min4;
        Object min5 = e;
        min = $result;
        r0 = r2;
        r1 = r5;
        ChannelIterator iterator3 = iterator2;
        $this$consume$iv2 = $this$consume$iv3;
        Comparator comparator4 = comparator3;
    L33:
        r0.L$0 = comparator4;     // Catch: Throwable -> L47
        r0.L$1 = $this$consume$iv2;     // Catch: Throwable -> L47
        r0.L$2 = iterator3;     // Catch: Throwable -> L47
        r0.L$3 = min5;     // Catch: Throwable -> L47
        r0.label = 2;     // Catch: Throwable -> L47
        Object r7 = iterator3.hasNext(r0);     // Catch: Throwable -> L47
        if (r7 != r1) goto L36;
        return r1;
    L36:
        C07431 r9 = r0;
        $result = min;
        min = r7;
        comparator3 = comparator4;
        $this$consume$iv3 = $this$consume$iv2;
        iterator2 = iterator3;
        r4 = cause$iv2;
        min3 = min5;
        min4 = r1;
        r2 = r9;
    L47:
        e$iv = th;
        goto L53
    L42:
        min = $result;
        r0 = r2;
        r1 = min4;
        min5 = min3;
        cause$iv2 = r4;
        iterator3 = iterator2;
        $this$consume$iv2 = $this$consume$iv3;
        comparator4 = comparator3;
        goto L33
    L43:
        ChannelsKt.cancelConsumed($this$consume$iv3, r4);
        return min3;
    L15:
        e$iv = th;
        goto L53
    L17:
        ChannelIterator iterator4 = (ChannelIterator) r0.L$2;
        ReceiveChannel r6 = (ReceiveChannel) r0.L$1;
        Comparator comparator5 = (Comparator) r0.L$0;
        ResultKt.throwOnFailure(min);     // Catch: Throwable -> L20
        ChannelIterator iterator5 = iterator4;
        Throwable cause$iv3 = null;
        comparator4 = comparator5;
        $this$consume$iv2 = r6;
        Object r8 = min;
    L68:
        if (((Boolean) r8).booleanValue() == true) goto L31;
        ChannelsKt.cancelConsumed($this$consume$iv2, cause$iv3);
        return null;
    L31:
        cause$iv2 = cause$iv3;
        min5 = iterator5.next();     // Catch: Throwable -> L47
        iterator3 = iterator5;
    L49:
        e$iv = th;
    L20:
        e$iv = th;
        $this$consume$iv2 = r6;
        goto L53
    L22:
        ResultKt.throwOnFailure(min);
        cause$iv3 = null;
        iterator5 = $this$consume$iv.iterator();     // Catch: Throwable -> L51
        r0.L$0 = comparator;     // Catch: Throwable -> L51
        r0.L$1 = $this$consume$iv;     // Catch: Throwable -> L51
        r0.L$2 = iterator5;     // Catch: Throwable -> L51
        r0.label = 1;     // Catch: Throwable -> L51
        r8 = iterator5.hasNext(r0);     // Catch: Throwable -> L51
        if (r8 != r1) goto L26;
        return r1;
    L26:
        $this$consume$iv2 = $this$consume$iv;
        comparator4 = comparator;
    L51:
        th = move-exception;
        $this$consume$iv2 = $this$consume$iv;
        e$iv = th;
        goto L53
    L11:
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    L7:
        r0 = new C07431(r12);
        goto L8
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Binary compatibility")
    public static final /* synthetic */ Object none(ReceiveChannel $this$none, Continuation r9) {
        if ((r9 instanceof C07441) == false) goto L7;
        C07441 r0 = (C07441) r9;
        if ((r0.label & Integer.MIN_VALUE) == 0) goto L7;
        r0.label -= Integer.MIN_VALUE;
    L8:
        Object $result = r0.result;
        Object r1 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        boolean r3 = true;
        switch(r0.label) {
            case 0: goto L17;
            case 1: goto L12;
            default: goto L11;
        };
    L12:
        ReceiveChannel $this$consume$iv = (ReceiveChannel) r0.L$0;
        Throwable cause$iv = null;
        ResultKt.throwOnFailure($result);     // Catch: Throwable -> L15
        Object r7 = $result;
    L23:
        if (((Boolean) r7).booleanValue() == false) goto L26;
        r3 = false;
    L26:
        Boolean r4 = Boxing.boxBoolean(r3);     // Catch: Throwable -> L15
        ChannelsKt.cancelConsumed($this$consume$iv, cause$iv);
        return r4;
    L15:
        e$iv = th;
    L30:
        Throwable cause$iv2 = e$iv;
        throw e$iv;     // Catch: Throwable -> L32
    L32:
        e$iv = move-exception;
        ChannelsKt.cancelConsumed($this$consume$iv, cause$iv2);
        throw e$iv;
    L17:
        ResultKt.throwOnFailure($result);
        $this$consume$iv = $this$none;
        cause$iv = null;
        ChannelIterator r8 = $this$consume$iv.iterator();     // Catch: Throwable -> L29
        r0.L$0 = $this$consume$iv;     // Catch: Throwable -> L29
        r0.label = 1;     // Catch: Throwable -> L29
        r7 = r8.hasNext(r0);     // Catch: Throwable -> L29
        if (r7 != r1) goto L23;
        return r1;
    L29:
        e$iv = th;
        goto L30
    L11:
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    L7:
        r0 = new C07441(r9);
        goto L8
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Left for binary compatibility")
    public static final /* synthetic */ ReceiveChannel requireNoNulls(ReceiveChannel $this$requireNoNulls) {
        return ChannelsKt.map$default($this$requireNoNulls, null, new C07451($this$requireNoNulls, null), 1, null);
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Binary compatibility")
    public static final /* synthetic */ ReceiveChannel zip(ReceiveChannel $this$zip, ReceiveChannel other) {
        return ChannelsKt.zip$default($this$zip, other, null, C07531.INSTANCE, 2, null);
    }

    public static /* synthetic */ ReceiveChannel zip$default(ReceiveChannel r0, ReceiveChannel r1, CoroutineDispatcher r2, Function2 r3, int r4, Object r5) {
        if ((r4 & 2) == 0) goto L6;
        r2 = Dispatchers.getUnconfined();
    L6:
        return ChannelsKt.zip(r0, r1, r2, r3);
    }

    public static final <E, R, V> ReceiveChannel<V> zip(ReceiveChannel<? extends E> r9, ReceiveChannel<? extends R> r10, CoroutineContext context, Function2<? super E, ? super R, ? extends V> r12) {
        return ProduceKt.produce$default(GlobalScope.INSTANCE, context, 0, null, ChannelsKt.consumesAll(new ReceiveChannel[]{r9, r10}), new C07542(r10, r9, r12, null), 6, null);
    }

    public static final Function1<Throwable, Unit> consumes(final ReceiveChannel<?> r1) {
        return new C07191(r1);
    }
}
