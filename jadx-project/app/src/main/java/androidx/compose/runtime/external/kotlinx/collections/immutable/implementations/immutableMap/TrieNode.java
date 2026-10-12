package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap;

import androidx.autofill.HintConstants;
import androidx.compose.runtime.PreconditionsKt;
import androidx.compose.runtime.external.kotlinx.collections.immutable.internal.CommonFunctionsKt;
import androidx.compose.runtime.external.kotlinx.collections.immutable.internal.DeltaCounter;
import androidx.compose.runtime.external.kotlinx.collections.immutable.internal.MutabilityOwnership;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function5;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntProgression;
import kotlin.ranges.RangesKt;

/* JADX INFO: compiled from: TrieNode.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b*\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b(\b\u0000\u0018\u0000 }*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u00020\u0003:\u0002}~B'\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u000e\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\b¢\u0006\u0002\u0010\tB/\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u000e\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\u0002\u0010\fJ\u0091\u0001\u0010\u0011\u001a\u00020\u00122\u0081\u0001\u0010\u0013\u001a}\u0012\u001f\u0012\u001d\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0000¢\u0006\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\b(\u0017\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\b(\u0018\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\b(\u0019\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\b(\u0004\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\b(\u0006\u0012\u0004\u0012\u00020\u00120\u0014H\u0000¢\u0006\u0002\b\u001aJ\u009c\u0001\u0010\u0011\u001a\u00020\u00122\u0081\u0001\u0010\u0013\u001a}\u0012\u001f\u0012\u001d\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0000¢\u0006\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\b(\u0017\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\b(\u0018\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\b(\u0019\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\b(\u0004\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\b(\u0006\u0012\u0004\u0012\u00020\u00120\u00142\u0006\u0010\u0019\u001a\u00020\u00052\u0006\u0010\u0018\u001a\u00020\u0005H\u0002J\u0014\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u001cH\u0002J\u0014\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u001cH\u0002JO\u0010\u001e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\b2\u0006\u0010\u001f\u001a\u00020\u00052\u0006\u0010 \u001a\u00020\u00052\u0006\u0010!\u001a\u00020\u00052\u0006\u0010\"\u001a\u00028\u00002\u0006\u0010#\u001a\u00028\u00012\u0006\u0010\u0018\u001a\u00020\u00052\b\u0010$\u001a\u0004\u0018\u00010\u000bH\u0002¢\u0006\u0002\u0010%J\b\u0010&\u001a\u00020\u0005H\u0002J\u0015\u0010'\u001a\u00020(2\u0006\u0010)\u001a\u00028\u0000H\u0002¢\u0006\u0002\u0010*J\u0017\u0010+\u001a\u0004\u0018\u00018\u00012\u0006\u0010)\u001a\u00028\u0000H\u0002¢\u0006\u0002\u0010,J+\u0010-\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u001c2\u0006\u0010)\u001a\u00028\u00002\u0006\u0010.\u001a\u00028\u0001H\u0002¢\u0006\u0002\u0010/J#\u00100\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00002\u0006\u0010)\u001a\u00028\u0000H\u0002¢\u0006\u0002\u00101J+\u00100\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00002\u0006\u0010)\u001a\u00028\u00002\u0006\u0010.\u001a\u00028\u0001H\u0002¢\u0006\u0002\u00102J\u001e\u00103\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00002\u0006\u00104\u001a\u00020\u0005H\u0002J#\u00105\u001a\u00020(2\u0006\u00106\u001a\u00020\u00052\u0006\u0010)\u001a\u00028\u00002\u0006\u0010\u0018\u001a\u00020\u0005¢\u0006\u0002\u00107J\u001c\u00108\u001a\u00020(2\u0012\u00109\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0000H\u0002J\r\u0010:\u001a\u00020\u0005H\u0000¢\u0006\u0002\b;J\u0015\u0010<\u001a\u00020\u00052\u0006\u0010 \u001a\u00020\u0005H\u0000¢\u0006\u0002\b=J%\u0010>\u001a\u0004\u0018\u00018\u00012\u0006\u00106\u001a\u00020\u00052\u0006\u0010)\u001a\u00028\u00002\u0006\u0010\u0018\u001a\u00020\u0005¢\u0006\u0002\u0010?J\u0015\u0010@\u001a\u00020(2\u0006\u0010 \u001a\u00020\u0005H\u0000¢\u0006\u0002\bAJ\u0010\u0010B\u001a\u00020(2\u0006\u0010 \u001a\u00020\u0005H\u0002J1\u0010C\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00002\u0006\u0010 \u001a\u00020\u00052\u0006\u0010)\u001a\u00028\u00002\u0006\u0010.\u001a\u00028\u0001H\u0002¢\u0006\u0002\u0010DJ\u0015\u0010E\u001a\u00028\u00002\u0006\u0010\u001f\u001a\u00020\u0005H\u0002¢\u0006\u0002\u0010FJ[\u0010G\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00002\u0006\u0010H\u001a\u00020\u00052\u0006\u0010I\u001a\u00028\u00002\u0006\u0010J\u001a\u00028\u00012\u0006\u0010K\u001a\u00020\u00052\u0006\u0010L\u001a\u00028\u00002\u0006\u0010M\u001a\u00028\u00012\u0006\u0010\u0018\u001a\u00020\u00052\b\u0010$\u001a\u0004\u0018\u00010\u000bH\u0002¢\u0006\u0002\u0010NJI\u0010O\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00002\u0006\u0010\u001f\u001a\u00020\u00052\u0006\u0010 \u001a\u00020\u00052\u0006\u0010!\u001a\u00020\u00052\u0006\u0010\"\u001a\u00028\u00002\u0006\u0010#\u001a\u00028\u00012\u0006\u0010\u0018\u001a\u00020\u0005H\u0002¢\u0006\u0002\u0010PJ=\u0010Q\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00002\u0006\u0010)\u001a\u00028\u00002\u0006\u0010.\u001a\u00028\u00012\u0012\u0010R\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010SH\u0002¢\u0006\u0002\u0010TJ8\u0010U\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00002\u0012\u00109\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00002\u0006\u0010V\u001a\u00020W2\u0006\u0010$\u001a\u00020\u000bH\u0002J?\u0010X\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00002\u0006\u0010)\u001a\u00028\u00002\u0006\u0010.\u001a\u00028\u00012\u0012\u0010R\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010SH\u0002¢\u0006\u0002\u0010TJ7\u0010X\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00002\u0006\u0010)\u001a\u00028\u00002\u0012\u0010R\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010SH\u0002¢\u0006\u0002\u0010YJ2\u0010Z\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00002\u0006\u00104\u001a\u00020\u00052\u0012\u0010R\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010SH\u0002J9\u0010[\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00002\u0006\u0010 \u001a\u00020\u00052\u0006\u0010)\u001a\u00028\u00002\u0006\u0010.\u001a\u00028\u00012\u0006\u0010$\u001a\u00020\u000bH\u0002¢\u0006\u0002\u0010\\JQ\u0010]\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00002\u0006\u0010\u001f\u001a\u00020\u00052\u0006\u0010 \u001a\u00020\u00052\u0006\u0010!\u001a\u00020\u00052\u0006\u0010\"\u001a\u00028\u00002\u0006\u0010#\u001a\u00028\u00012\u0006\u0010\u0018\u001a\u00020\u00052\u0006\u0010$\u001a\u00020\u000bH\u0002¢\u0006\u0002\u0010^JK\u0010_\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00002\u0006\u00106\u001a\u00020\u00052\u0006\u0010)\u001a\u00028\u00002\u0006\u0010.\u001a\u00028\u00012\u0006\u0010\u0018\u001a\u00020\u00052\u0012\u0010R\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010S¢\u0006\u0002\u0010`JJ\u0010a\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00002\u0012\u00109\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00002\u0006\u0010\u0018\u001a\u00020\u00052\u0006\u0010V\u001a\u00020W2\u0012\u0010R\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010SJT\u0010b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00002\u0012\u00109\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00002\u0006\u0010 \u001a\u00020\u00052\u0006\u0010\u0018\u001a\u00020\u00052\u0006\u0010V\u001a\u00020W2\u0012\u0010R\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010SH\u0002JM\u0010c\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00002\u0006\u00106\u001a\u00020\u00052\u0006\u0010)\u001a\u00028\u00002\u0006\u0010.\u001a\u00028\u00012\u0006\u0010\u0018\u001a\u00020\u00052\u0012\u0010R\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010S¢\u0006\u0002\u0010`JE\u0010c\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00002\u0006\u00106\u001a\u00020\u00052\u0006\u0010)\u001a\u00028\u00002\u0006\u0010\u0018\u001a\u00020\u00052\u0012\u0010R\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010S¢\u0006\u0002\u0010dJ:\u0010e\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00002\u0006\u0010\u001f\u001a\u00020\u00052\u0006\u0010 \u001a\u00020\u00052\u0012\u0010R\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010SH\u0002J.\u0010f\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00002\u0006\u0010g\u001a\u00020\u00052\u0006\u0010 \u001a\u00020\u00052\u0006\u0010$\u001a\u00020\u000bH\u0002JX\u0010h\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00002\u0012\u0010i\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00002\u0014\u0010j\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00002\u0006\u0010g\u001a\u00020\u00052\u0006\u0010 \u001a\u00020\u00052\u0006\u0010$\u001a\u00020\u000bH\u0002J8\u0010k\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00002\u0006\u0010g\u001a\u00020\u00052\u0012\u0010j\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00002\u0006\u0010$\u001a\u00020\u000bH\u0002J=\u0010l\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00002\u0006\u0010\u001f\u001a\u00020\u00052\u0006\u0010.\u001a\u00028\u00012\u0012\u0010R\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010SH\u0002¢\u0006\u0002\u0010mJ!\u0010n\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00002\u0006\u0010g\u001a\u00020\u0005H\u0000¢\u0006\u0002\boJ\u0015\u0010g\u001a\u00020\u00052\u0006\u0010 \u001a\u00020\u0005H\u0000¢\u0006\u0002\bpJ9\u0010q\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u001c2\u0006\u00106\u001a\u00020\u00052\u0006\u0010)\u001a\u00028\u00002\u0006\u0010.\u001a\u00028\u00012\u0006\u0010\u0018\u001a\u00020\u0005¢\u0006\u0002\u0010rJ9\u0010s\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00002\u0006\u00106\u001a\u00020\u00052\u0006\u0010)\u001a\u00028\u00002\u0006\u0010.\u001a\u00028\u00012\u0006\u0010\u0018\u001a\u00020\u0005¢\u0006\u0002\u0010tJ1\u0010s\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00002\u0006\u00106\u001a\u00020\u00052\u0006\u0010)\u001a\u00028\u00002\u0006\u0010\u0018\u001a\u00020\u0005¢\u0006\u0002\u0010uJ&\u0010v\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00002\u0006\u0010\u001f\u001a\u00020\u00052\u0006\u0010 \u001a\u00020\u0005H\u0002J&\u0010w\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00002\u0006\u0010g\u001a\u00020\u00052\u0006\u0010 \u001a\u00020\u0005H\u0002JP\u0010x\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00002\u0012\u0010i\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00002\u0014\u0010j\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00002\u0006\u0010g\u001a\u00020\u00052\u0006\u0010 \u001a\u00020\u0005H\u0002J8\u0010y\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00002\u0006\u0010g\u001a\u00020\u00052\u0006\u0010 \u001a\u00020\u00052\u0012\u0010j\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0000H\u0002J)\u0010z\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00002\u0006\u0010\u001f\u001a\u00020\u00052\u0006\u0010.\u001a\u00028\u0001H\u0002¢\u0006\u0002\u0010{J\u0015\u0010|\u001a\u00028\u00012\u0006\u0010\u001f\u001a\u00020\u0005H\u0002¢\u0006\u0002\u0010FR0\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\b2\u000e\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\b@BX\u0080\u000e¢\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u000e\u0010\u000fR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u007f"}, d2 = {"Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNode;", "K", "V", "", "dataMap", "", "nodeMap", "buffer", "", "(II[Ljava/lang/Object;)V", "ownedBy", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/internal/MutabilityOwnership;", "(II[Ljava/lang/Object;Landroidx/compose/runtime/external/kotlinx/collections/immutable/internal/MutabilityOwnership;)V", "<set-?>", "getBuffer$runtime_release", "()[Ljava/lang/Object;", "[Ljava/lang/Object;", "accept", "", "visitor", "Lkotlin/Function5;", "Lkotlin/ParameterName;", HintConstants.AUTOFILL_HINT_NAME, "node", "shift", "hash", "accept$runtime_release", "asInsertResult", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNode$ModificationResult;", "asUpdateResult", "bufferMoveEntryToNode", "keyIndex", "positionMask", "newKeyHash", "newKey", "newValue", "owner", "(IIILjava/lang/Object;Ljava/lang/Object;ILandroidx/compose/runtime/external/kotlinx/collections/immutable/internal/MutabilityOwnership;)[Ljava/lang/Object;", "calculateSize", "collisionContainsKey", "", "key", "(Ljava/lang/Object;)Z", "collisionGet", "(Ljava/lang/Object;)Ljava/lang/Object;", "collisionPut", "value", "(Ljava/lang/Object;Ljava/lang/Object;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNode$ModificationResult;", "collisionRemove", "(Ljava/lang/Object;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNode;", "(Ljava/lang/Object;Ljava/lang/Object;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNode;", "collisionRemoveEntryAtIndex", "i", "containsKey", "keyHash", "(ILjava/lang/Object;I)Z", "elementsIdentityEquals", "otherNode", "entryCount", "entryCount$runtime_release", "entryKeyIndex", "entryKeyIndex$runtime_release", "get", "(ILjava/lang/Object;I)Ljava/lang/Object;", "hasEntryAt", "hasEntryAt$runtime_release", "hasNodeAt", "insertEntryAt", "(ILjava/lang/Object;Ljava/lang/Object;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNode;", "keyAtIndex", "(I)Ljava/lang/Object;", "makeNode", "keyHash1", "key1", "value1", "keyHash2", "key2", "value2", "(ILjava/lang/Object;Ljava/lang/Object;ILjava/lang/Object;Ljava/lang/Object;ILandroidx/compose/runtime/external/kotlinx/collections/immutable/internal/MutabilityOwnership;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNode;", "moveEntryToNode", "(IIILjava/lang/Object;Ljava/lang/Object;I)Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNode;", "mutableCollisionPut", "mutator", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/PersistentHashMapBuilder;", "(Ljava/lang/Object;Ljava/lang/Object;Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/PersistentHashMapBuilder;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNode;", "mutableCollisionPutAll", "intersectionCounter", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/internal/DeltaCounter;", "mutableCollisionRemove", "(Ljava/lang/Object;Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/PersistentHashMapBuilder;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNode;", "mutableCollisionRemoveEntryAtIndex", "mutableInsertEntryAt", "(ILjava/lang/Object;Ljava/lang/Object;Landroidx/compose/runtime/external/kotlinx/collections/immutable/internal/MutabilityOwnership;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNode;", "mutableMoveEntryToNode", "(IIILjava/lang/Object;Ljava/lang/Object;ILandroidx/compose/runtime/external/kotlinx/collections/immutable/internal/MutabilityOwnership;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNode;", "mutablePut", "(ILjava/lang/Object;Ljava/lang/Object;ILandroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/PersistentHashMapBuilder;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNode;", "mutablePutAll", "mutablePutAllFromOtherNodeCell", "mutableRemove", "(ILjava/lang/Object;ILandroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/PersistentHashMapBuilder;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNode;", "mutableRemoveEntryAtIndex", "mutableRemoveNodeAtIndex", "nodeIndex", "mutableReplaceNode", "targetNode", "newNode", "mutableUpdateNodeAtIndex", "mutableUpdateValueAtIndex", "(ILjava/lang/Object;Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/PersistentHashMapBuilder;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNode;", "nodeAtIndex", "nodeAtIndex$runtime_release", "nodeIndex$runtime_release", "put", "(ILjava/lang/Object;Ljava/lang/Object;I)Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNode$ModificationResult;", "remove", "(ILjava/lang/Object;Ljava/lang/Object;I)Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNode;", "(ILjava/lang/Object;I)Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNode;", "removeEntryAtIndex", "removeNodeAtIndex", "replaceNode", "updateNodeAtIndex", "updateValueAtIndex", "(ILjava/lang/Object;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNode;", "valueAtKeyIndex", "Companion", "ModificationResult", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class TrieNode<K, V> {
    public static final int $stable = 0;
    public static final Companion Companion = null;
    private static final TrieNode EMPTY = null;
    private Object[] buffer;
    private int dataMap;
    private int nodeMap;
    private final MutabilityOwnership ownedBy;

    /* JADX INFO: compiled from: TrieNode.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\b\u0003\b\u0080\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R \u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u0004X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNode$Companion;", "", "()V", "EMPTY", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNode;", "", "getEMPTY$runtime_release", "()Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNode;", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker r1) {
            this();
        }

        private Companion() {
        }

        public final TrieNode getEMPTY$runtime_release() {
            return TrieNode.access$getEMPTY$cp();
        }
    }

    /* JADX INFO: compiled from: TrieNode.kt */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u0000*\u0004\b\u0002\u0010\u0001*\u0004\b\u0003\u0010\u00022\u00020\u0003B!\u0012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJA\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u00002*\u0010\u0010\u001a&\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u0005\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u00050\u0011H\u0086\bR&\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0012"}, d2 = {"Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNode$ModificationResult;", "K", "V", "", "node", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNode;", "sizeDelta", "", "(Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNode;I)V", "getNode", "()Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNode;", "setNode", "(Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNode;)V", "getSizeDelta", "()I", "replaceNode", "operation", "Lkotlin/Function1;", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class ModificationResult<K, V> {
        public static final int $stable = 0;
        private TrieNode<K, V> node;
        private final int sizeDelta;

        static {
            $stable = 8;
        }

        public ModificationResult(TrieNode<K, V> r1, int sizeDelta) {
            this.node = r1;
            this.sizeDelta = sizeDelta;
        }

        public final TrieNode<K, V> getNode() {
            return this.node;
        }

        public final int getSizeDelta() {
            return this.sizeDelta;
        }

        public final void setNode(TrieNode<K, V> r1) {
            this.node = r1;
        }

        public final ModificationResult<K, V> replaceNode(Function1<? super TrieNode<K, V>, TrieNode<K, V>> r5) {
            ModificationResult<K, V> r1 = this;
            r1.setNode(r5.invoke(r1.getNode()));
            return this;
        }
    }

    public TrieNode(int dataMap, int nodeMap, Object[] buffer, MutabilityOwnership ownedBy) {
        this.dataMap = dataMap;
        this.nodeMap = nodeMap;
        this.ownedBy = ownedBy;
        this.buffer = buffer;
    }

    public static final /* synthetic */ TrieNode access$getEMPTY$cp() {
        return EMPTY;
    }

    public TrieNode(int dataMap, int nodeMap, Object[] buffer) {
        this(dataMap, nodeMap, buffer, null);
    }

    private final ModificationResult<K, V> asInsertResult() {
        return new ModificationResult(this, 1);
    }

    private final ModificationResult<K, V> asUpdateResult() {
        return new ModificationResult(this, 0);
    }

    public final Object[] getBuffer$runtime_release() {
        return this.buffer;
    }

    public final int entryCount$runtime_release() {
        return Integer.bitCount(this.dataMap);
    }

    public final boolean hasEntryAt$runtime_release(int positionMask) {
        if ((this.dataMap & positionMask) == 0) goto L5;
        return true;
    L5:
        return false;
    }

    private final boolean hasNodeAt(int positionMask) {
        if ((this.nodeMap & positionMask) == 0) goto L5;
        return true;
    L5:
        return false;
    }

    public final int entryKeyIndex$runtime_release(int positionMask) {
        return Integer.bitCount(this.dataMap & (positionMask - 1)) * 2;
    }

    public final int nodeIndex$runtime_release(int positionMask) {
        return (this.buffer.length - 1) - Integer.bitCount(this.nodeMap & (positionMask - 1));
    }

    private final K keyAtIndex(int r2) {
        return (K) this.buffer[r2];
    }

    private final V valueAtKeyIndex(int r3) {
        return (V) this.buffer[r3 + 1];
    }

    public final TrieNode<K, V> nodeAtIndex$runtime_release(int nodeIndex) {
        Object r0 = this.buffer[nodeIndex];
        Intrinsics.checkNotNull(r0, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode<K of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode, V of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode>");
        return (TrieNode) r0;
    }

    private final TrieNode<K, V> insertEntryAt(int positionMask, K r7, V r8) {
        int keyIndex = entryKeyIndex$runtime_release(positionMask);
        Object[] newBuffer = TrieNodeKt.access$insertEntryAtIndex(this.buffer, keyIndex, r7, r8);
        return new TrieNode(this.dataMap | positionMask, this.nodeMap, newBuffer);
    }

    private final TrieNode<K, V> mutableInsertEntryAt(int positionMask, K r7, V r8, MutabilityOwnership owner) {
        int keyIndex = entryKeyIndex$runtime_release(positionMask);
        MutabilityOwnership r1 = this.ownedBy;
        Object[] r2 = this.buffer;
        if (r1 != owner) goto L6;
        this.buffer = TrieNodeKt.access$insertEntryAtIndex(r2, keyIndex, r7, r8);
        this.dataMap |= positionMask;
        return this;
    L6:
        Object[] newBuffer = TrieNodeKt.access$insertEntryAtIndex(r2, keyIndex, r7, r8);
        return new TrieNode(this.dataMap | positionMask, this.nodeMap, newBuffer, owner);
    }

    private final TrieNode<K, V> updateValueAtIndex(int keyIndex, V r6) {
        Object[] r0 = this.buffer;
        Object[] newBuffer = Arrays.copyOf(r0, r0.length);
        Intrinsics.checkNotNullExpressionValue(newBuffer, "copyOf(...)");
        newBuffer[keyIndex + 1] = r6;
        return new TrieNode(this.dataMap, this.nodeMap, newBuffer);
    }

    private final TrieNode<K, V> mutableUpdateValueAtIndex(int keyIndex, V r7, PersistentHashMapBuilder<K, V> r8) {
        if (this.ownedBy != r8.getOwnership()) goto L6;
        this.buffer[keyIndex + 1] = r7;
        return this;
    L6:
        r8.setModCount$runtime_release(r8.getModCount$runtime_release() + 1);
        Object[] r0 = this.buffer;
        Object[] newBuffer = Arrays.copyOf(r0, r0.length);
        Intrinsics.checkNotNullExpressionValue(newBuffer, "copyOf(...)");
        newBuffer[keyIndex + 1] = r7;
        return new TrieNode(this.dataMap, this.nodeMap, newBuffer, r8.getOwnership());
    }

    private final TrieNode<K, V> updateNodeAtIndex(int nodeIndex, int positionMask, TrieNode<K, V> r9) {
        Object[] newNodeBuffer = r9.buffer;
        if (newNodeBuffer.length == 2) goto L5;
    L12:
        Object[] newBuffer = Arrays.copyOf(this.buffer, this.buffer.length);
        Intrinsics.checkNotNullExpressionValue(newBuffer, "copyOf(...)");
        newBuffer[nodeIndex] = r9;
        return new TrieNode(this.dataMap, this.nodeMap, newBuffer);
    L5:
        if (r9.nodeMap != 0) goto L12;
        if (this.buffer.length != 1) goto L10;
        r9.dataMap = this.nodeMap;
        return r9;
    L10:
        int keyIndex = entryKeyIndex$runtime_release(positionMask);
        Object[] newBuffer2 = TrieNodeKt.access$replaceNodeWithEntry(this.buffer, nodeIndex, keyIndex, newNodeBuffer[0], newNodeBuffer[1]);
        return new TrieNode(this.dataMap ^ positionMask, this.nodeMap ^ positionMask, newBuffer2);
    }

    private final TrieNode<K, V> mutableUpdateNodeAtIndex(int nodeIndex, TrieNode<K, V> r6, MutabilityOwnership owner) {
        if (this.buffer.length == 1) goto L5;
    L10:
        MutabilityOwnership r0 = this.ownedBy;
        Object[] r1 = this.buffer;
        if (r0 != owner) goto L14;
        r1[nodeIndex] = r6;
        return this;
    L14:
        Object[] newBuffer = Arrays.copyOf(r1, r1.length);
        Intrinsics.checkNotNullExpressionValue(newBuffer, "copyOf(...)");
        newBuffer[nodeIndex] = r6;
        return new TrieNode(this.dataMap, this.nodeMap, newBuffer, owner);
    L5:
        if (r6.buffer.length != 2) goto L10;
        if (r6.nodeMap != 0) goto L10;
        r6.dataMap = this.nodeMap;
        return r6;
    }

    private final TrieNode<K, V> removeNodeAtIndex(int nodeIndex, int positionMask) {
        if (this.buffer.length != 1) goto L6;
        return null;
    L6:
        Object[] newBuffer = TrieNodeKt.access$removeNodeAtIndex(this.buffer, nodeIndex);
        return new TrieNode(this.dataMap, this.nodeMap ^ positionMask, newBuffer);
    }

    private final TrieNode<K, V> mutableRemoveNodeAtIndex(int nodeIndex, int positionMask, MutabilityOwnership owner) {
        if (this.buffer.length != 1) goto L6;
        return null;
    L6:
        MutabilityOwnership r0 = this.ownedBy;
        Object[] r1 = this.buffer;
        if (r0 != owner) goto L10;
        this.buffer = TrieNodeKt.access$removeNodeAtIndex(r1, nodeIndex);
        this.nodeMap ^= positionMask;
        return this;
    L10:
        Object[] newBuffer = TrieNodeKt.access$removeNodeAtIndex(r1, nodeIndex);
        return new TrieNode(this.dataMap, this.nodeMap ^ positionMask, newBuffer, owner);
    }

    private final Object[] bufferMoveEntryToNode(int keyIndex, int positionMask, int newKeyHash, K r13, V r14, int shift, MutabilityOwnership owner) {
        K r2 = keyAtIndex(keyIndex);
        if (r2 == null) goto L5;
        int r0 = r2.hashCode();
    L6:
        int storedKeyHash = r0;
        TrieNode<K, V> r7 = makeNode(storedKeyHash, r2, valueAtKeyIndex(keyIndex), newKeyHash, r13, r14, shift + 5, owner);
        int nodeIndex = nodeIndex$runtime_release(positionMask) + 1;
        return TrieNodeKt.access$replaceEntryWithNode(this.buffer, keyIndex, nodeIndex, r7);
    L5:
        r0 = 0;
        goto L6
    }

    private final TrieNode<K, V> moveEntryToNode(int keyIndex, int positionMask, int newKeyHash, K r12, V r13, int shift) {
        Object[] newBuffer = bufferMoveEntryToNode(keyIndex, positionMask, newKeyHash, r12, r13, shift, null);
        return new TrieNode(this.dataMap ^ positionMask, this.nodeMap | positionMask, newBuffer);
    }

    private final TrieNode<K, V> mutableMoveEntryToNode(int keyIndex, int positionMask, int newKeyHash, K r8, V r9, int shift, MutabilityOwnership owner) {
        if (this.ownedBy != owner) goto L6;
        this.buffer = bufferMoveEntryToNode(keyIndex, positionMask, newKeyHash, r8, r9, shift, owner);
        this.dataMap ^= positionMask;
        this.nodeMap |= positionMask;
        return this;
    L6:
        Object[] newBuffer = bufferMoveEntryToNode(keyIndex, positionMask, newKeyHash, r8, r9, shift, owner);
        return new TrieNode(this.dataMap ^ positionMask, this.nodeMap | positionMask, newBuffer, owner);
    }

    private final TrieNode<K, V> makeNode(int keyHash1, K r17, V r18, int keyHash2, K r20, V r21, int shift, MutabilityOwnership owner) {
        if (shift > 30) goto L5;
        int setBit1 = TrieNodeKt.indexSegment(keyHash1, shift);
        int setBit2 = TrieNodeKt.indexSegment(keyHash2, shift);
        if (setBit1 == setBit2) goto L15;
        if (setBit1 >= setBit2) goto L11;
        Object[] nodeBuffer = {r17, r18, r20, r21};
    L13:
        return new TrieNode((1 << setBit1) | (1 << setBit2), 0, nodeBuffer, owner);
    L11:
        nodeBuffer = new Object[]{r20, r21, r17, r18};
        goto L13
    L15:
        return new TrieNode(0, 1 << setBit1, new Object[]{makeNode(keyHash1, r17, r18, keyHash2, r20, r21, shift + 5, owner)}, owner);
    L5:
        return new TrieNode(0, 0, new Object[]{r17, r18, r20, r21}, owner);
    }

    private final TrieNode<K, V> removeEntryAtIndex(int keyIndex, int positionMask) {
        if (this.buffer.length != 2) goto L6;
        return null;
    L6:
        Object[] newBuffer = TrieNodeKt.access$removeEntryAtIndex(this.buffer, keyIndex);
        return new TrieNode(this.dataMap ^ positionMask, this.nodeMap, newBuffer);
    }

    private final TrieNode<K, V> mutableRemoveEntryAtIndex(int keyIndex, int positionMask, PersistentHashMapBuilder<K, V> r8) {
        r8.setSize(r8.size() - 1);
        r8.setOperationResult$runtime_release(valueAtKeyIndex(keyIndex));
        if (this.buffer.length != 2) goto L6;
        return null;
    L6:
        MutabilityOwnership r0 = this.ownedBy;
        MutabilityOwnership r1 = r8.getOwnership();
        Object[] r2 = this.buffer;
        if (r0 != r1) goto L10;
        this.buffer = TrieNodeKt.access$removeEntryAtIndex(r2, keyIndex);
        this.dataMap ^= positionMask;
        return this;
    L10:
        Object[] newBuffer = TrieNodeKt.access$removeEntryAtIndex(r2, keyIndex);
        return new TrieNode(this.dataMap ^ positionMask, this.nodeMap, newBuffer, r8.getOwnership());
    }

    private final TrieNode<K, V> collisionRemoveEntryAtIndex(int i) {
        if (this.buffer.length != 2) goto L6;
        return null;
    L6:
        Object[] newBuffer = TrieNodeKt.access$removeEntryAtIndex(this.buffer, i);
        return new TrieNode(0, 0, newBuffer);
    }

    private final TrieNode<K, V> mutableCollisionRemoveEntryAtIndex(int i, PersistentHashMapBuilder<K, V> r6) {
        r6.setSize(r6.size() - 1);
        r6.setOperationResult$runtime_release(valueAtKeyIndex(i));
        if (this.buffer.length != 2) goto L6;
        return null;
    L6:
        MutabilityOwnership r0 = this.ownedBy;
        MutabilityOwnership r1 = r6.getOwnership();
        Object[] r2 = this.buffer;
        if (r0 != r1) goto L10;
        this.buffer = TrieNodeKt.access$removeEntryAtIndex(r2, i);
        return this;
    L10:
        Object[] newBuffer = TrieNodeKt.access$removeEntryAtIndex(r2, i);
        return new TrieNode(0, 0, newBuffer, r6.getOwnership());
    }

    private final boolean collisionContainsKey(K r6) {
        IntProgression r0 = RangesKt.step(RangesKt.until(0, this.buffer.length), 2);
        int i = r0.getFirst();
        int r3 = r0.getLast();
        int r1 = r0.getStep();
        if (r1 <= 0) goto L5;
        if (i > r3) goto L5;
    L8:
        if (Intrinsics.areEqual(r6, this.buffer[i]) == true) goto L9;
        if (i == r3) goto L13;
        i = i + r1;
    L13:
        return false;
    L9:
        return true;
    L5:
        if (r1 >= 0) goto L13;
        if (r3 > i) goto L13;
        goto L13
    }

    private final V collisionGet(K r5) {
        IntProgression r0 = RangesKt.step(RangesKt.until(0, this.buffer.length), 2);
        int i = r0.getFirst();
        int r2 = r0.getLast();
        int r1 = r0.getStep();
        if (r1 <= 0) goto L5;
        if (i > r2) goto L5;
    L8:
        if (Intrinsics.areEqual(r5, keyAtIndex(i)) == true) goto L10;
        if (i == r2) goto L19;
        i = i + r1;
        goto L8
    L19:
        return null;
    L10:
        return valueAtKeyIndex(i);
    L5:
        if (r1 >= 0) goto L13;
        if (r2 <= i) goto L8;
        return null;
    L13:
        return null;
    }

    private final ModificationResult<K, V> collisionPut(K r6, V r7) {
        IntProgression r0 = RangesKt.step(RangesKt.until(0, this.buffer.length), 2);
        int i = r0.getFirst();
        int r3 = r0.getLast();
        int r1 = r0.getStep();
        if (r1 <= 0) goto L5;
        if (i > r3) goto L5;
    L8:
        if (Intrinsics.areEqual(r6, keyAtIndex(i)) == true) goto L10;
        if (i == r3) goto L18;
        i = i + r1;
    L18:
        return new TrieNode(0, 0, TrieNodeKt.access$insertEntryAtIndex(this.buffer, 0, r6, r7)).asInsertResult();
    L10:
        if (r7 != valueAtKeyIndex(i)) goto L13;
        return null;
    L13:
        Object[] r2 = this.buffer;
        Object[] newBuffer = Arrays.copyOf(r2, r2.length);
        Intrinsics.checkNotNullExpressionValue(newBuffer, "copyOf(...)");
        newBuffer[i + 1] = r7;
        return new TrieNode(0, 0, newBuffer).asUpdateResult();
    L5:
        if (r1 >= 0) goto L18;
        if (r3 > i) goto L18;
        goto L8
    }

    private final TrieNode<K, V> mutableCollisionPut(K r6, V r7, PersistentHashMapBuilder<K, V> r8) {
        IntProgression r0 = RangesKt.step(RangesKt.until(0, this.buffer.length), 2);
        int i = r0.getFirst();
        int r3 = r0.getLast();
        int r1 = r0.getStep();
        if (r1 <= 0) goto L5;
        if (i > r3) goto L5;
    L8:
        if (Intrinsics.areEqual(r6, keyAtIndex(i)) == true) goto L9;
        if (i == r3) goto L17;
        i = i + r1;
    L17:
        r8.setSize(r8.size() + 1);
        return new TrieNode(0, 0, TrieNodeKt.access$insertEntryAtIndex(this.buffer, 0, r6, r7), r8.getOwnership());
    L9:
        r8.setOperationResult$runtime_release(valueAtKeyIndex(i));
        if (this.ownedBy != r8.getOwnership()) goto L13;
        this.buffer[i + 1] = r7;
        return this;
    L13:
        r8.setModCount$runtime_release(r8.getModCount$runtime_release() + 1);
        Object[] r2 = this.buffer;
        Object[] newBuffer = Arrays.copyOf(r2, r2.length);
        Intrinsics.checkNotNullExpressionValue(newBuffer, "copyOf(...)");
        newBuffer[i + 1] = r7;
        return new TrieNode(0, 0, newBuffer, r8.getOwnership());
    L5:
        if (r1 >= 0) goto L17;
        if (r3 > i) goto L17;
        goto L17
    }

    private final TrieNode<K, V> collisionRemove(K r5) {
        IntProgression r0 = RangesKt.step(RangesKt.until(0, this.buffer.length), 2);
        int i = r0.getFirst();
        int r2 = r0.getLast();
        int r1 = r0.getStep();
        if (r1 <= 0) goto L5;
        if (i > r2) goto L5;
    L8:
        if (Intrinsics.areEqual(r5, keyAtIndex(i)) == true) goto L10;
        if (i == r2) goto L13;
        i = i + r1;
    L13:
        return this;
    L10:
        return collisionRemoveEntryAtIndex(i);
    L5:
        if (r1 >= 0) goto L13;
        if (r2 > i) goto L13;
        goto L13
    }

    private final TrieNode<K, V> mutableCollisionRemove(K r5, PersistentHashMapBuilder<K, V> r6) {
        IntProgression r0 = RangesKt.step(RangesKt.until(0, this.buffer.length), 2);
        int i = r0.getFirst();
        int r2 = r0.getLast();
        int r1 = r0.getStep();
        if (r1 <= 0) goto L5;
        if (i > r2) goto L5;
    L8:
        if (Intrinsics.areEqual(r5, keyAtIndex(i)) == true) goto L10;
        if (i == r2) goto L13;
        i = i + r1;
    L13:
        return this;
    L10:
        return mutableCollisionRemoveEntryAtIndex(i, r6);
    L5:
        if (r1 >= 0) goto L13;
        if (r2 > i) goto L13;
        goto L13
    }

    private final TrieNode<K, V> collisionRemove(K r5, V r6) {
        IntProgression r0 = RangesKt.step(RangesKt.until(0, this.buffer.length), 2);
        int i = r0.getFirst();
        int r2 = r0.getLast();
        int r1 = r0.getStep();
        if (r1 <= 0) goto L5;
        if (i > r2) goto L5;
    L8:
        if (Intrinsics.areEqual(r5, keyAtIndex(i)) == true) goto L10;
    L13:
        if (i == r2) goto L15;
        i = i + r1;
    L15:
        return this;
    L10:
        if (Intrinsics.areEqual(r6, valueAtKeyIndex(i)) == false) goto L13;
        return collisionRemoveEntryAtIndex(i);
    L5:
        if (r1 >= 0) goto L15;
        if (r2 > i) goto L15;
        goto L15
    }

    private final TrieNode<K, V> mutableCollisionRemove(K r5, V r6, PersistentHashMapBuilder<K, V> r7) {
        IntProgression r0 = RangesKt.step(RangesKt.until(0, this.buffer.length), 2);
        int i = r0.getFirst();
        int r2 = r0.getLast();
        int r1 = r0.getStep();
        if (r1 <= 0) goto L5;
        if (i > r2) goto L5;
    L8:
        if (Intrinsics.areEqual(r5, keyAtIndex(i)) == true) goto L10;
    L13:
        if (i == r2) goto L15;
        i = i + r1;
    L15:
        return this;
    L10:
        if (Intrinsics.areEqual(r6, valueAtKeyIndex(i)) == false) goto L13;
        return mutableCollisionRemoveEntryAtIndex(i, r7);
    L5:
        if (r1 >= 0) goto L15;
        if (r2 > i) goto L15;
        goto L15
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final TrieNode<K, V> mutableCollisionPutAll(TrieNode<K, V> r12, DeltaCounter intersectionCounter, MutabilityOwnership owner) {
        if (this.nodeMap != 0) goto L5;
        boolean r0 = true;
    L6:
        CommonFunctionsKt.m3921assert(r0);
        if (this.dataMap != 0) goto L9;
        boolean r1 = true;
    L10:
        CommonFunctionsKt.m3921assert(r1);
        if (r12.nodeMap != 0) goto L13;
        boolean r2 = true;
    L14:
        CommonFunctionsKt.m3921assert(r2);
        if (r12.dataMap != 0) goto L17;
        boolean r3 = true;
    L18:
        CommonFunctionsKt.m3921assert(r3);
        Object[] tempBuffer = Arrays.copyOf(this.buffer, this.buffer.length + r12.buffer.length);
        Intrinsics.checkNotNullExpressionValue(tempBuffer, "copyOf(...)");
        int i = this.buffer.length;
        IntProgression r5 = RangesKt.step(RangesKt.until(0, r12.buffer.length), 2);
        int j = r5.getFirst();
        int r7 = r5.getLast();
        int r6 = r5.getStep();
        if (r6 <= 0) goto L21;
        if (j > r7) goto L21;
    L24:
        if (collisionContainsKey(r12.buffer[j]) == true) goto L26;
        tempBuffer[i] = r12.buffer[j];
        tempBuffer[i + 1] = r12.buffer[j + 1];
        i = i + 2;
    L27:
        if (j == r7) goto L29;
        j = j + r6;
    L29:
        int newSize = i;
        if (newSize != this.buffer.length) goto L33;
        return this;
    L33:
        if (newSize != r12.buffer.length) goto L36;
        return r12;
    L36:
        if (newSize == tempBuffer.length) goto L44;
        Object[] r8 = Arrays.copyOf(tempBuffer, newSize);
        Intrinsics.checkNotNullExpressionValue(r8, "copyOf(...)");
        return new TrieNode(0, 0, r8, owner);
    L44:
        return new TrieNode(0, 0, tempBuffer, owner);
    L26:
        intersectionCounter.setCount(intersectionCounter.getCount() + 1);
    L21:
        if (r6 >= 0) goto L29;
        if (r7 > j) goto L29;
    L17:
        r3 = false;
        goto L18
    L13:
        r2 = false;
        goto L14
    L9:
        r1 = false;
        goto L10
    L5:
        r0 = false;
        goto L6
    }

    private final TrieNode<K, V> mutablePutAllFromOtherNodeCell(TrieNode<K, V> r20, int positionMask, int shift, DeltaCounter intersectionCounter, PersistentHashMapBuilder<K, V> r24) {
        int r2 = 0;
        if (hasNodeAt(positionMask) == false) goto L18;
        TrieNode<K, V> r3 = nodeAtIndex$runtime_release(nodeIndex$runtime_release(positionMask));
        if (r20.hasNodeAt(positionMask) == false) goto L8;
        return r3.mutablePutAll(r20.nodeAtIndex$runtime_release(r20.nodeIndex$runtime_release(positionMask)), shift + 5, intersectionCounter, r24);
    L8:
        if (r20.hasEntryAt$runtime_release(positionMask) == false) goto L47;
        int keyIndex = r20.entryKeyIndex$runtime_release(positionMask);
        K r5 = r20.keyAtIndex(keyIndex);
        V r6 = r20.valueAtKeyIndex(keyIndex);
        int oldSize = r24.size();
        if (r5 == null) goto L12;
        r2 = r5.hashCode();
    L12:
        TrieNode<K, V> r4 = r3.mutablePut(r2, r5, r6, shift + 5, r24);
        if (r24.size() != oldSize) goto L44;
        intersectionCounter.setCount(intersectionCounter.getCount() + 1);
    L44:
        return r4;
    L47:
        return r3;
    L18:
        if (r20.hasNodeAt(positionMask) == false) goto L34;
        TrieNode<K, V> r12 = r20.nodeAtIndex$runtime_release(r20.nodeIndex$runtime_release(positionMask));
        if (hasEntryAt$runtime_release(positionMask) == false) goto L46;
        int keyIndex2 = entryKeyIndex$runtime_release(positionMask);
        K r14 = keyAtIndex(keyIndex2);
        if (r14 == null) goto L24;
        int r7 = r14.hashCode();
    L26:
        if (r12.containsKey(r7, r14, shift + 5) == false) goto L28;
        intersectionCounter.setCount(intersectionCounter.getCount() + 1);
        goto L46
    L28:
        V r15 = valueAtKeyIndex(keyIndex2);
        if (r14 == null) goto L45;
        r2 = r14.hashCode();
    L45:
        return r12.mutablePut(r2, r14, r15, shift + 5, r24);
    L24:
        r7 = 0;
    L46:
        return r12;
    L34:
        int thisKeyIndex = entryKeyIndex$runtime_release(positionMask);
        int r1 = 0;
        K r8 = keyAtIndex(thisKeyIndex);
        V r9 = valueAtKeyIndex(thisKeyIndex);
        int otherKeyIndex = r20.entryKeyIndex$runtime_release(positionMask);
        K r10 = r20.keyAtIndex(otherKeyIndex);
        V r11 = r20.valueAtKeyIndex(otherKeyIndex);
        if (r8 == null) goto L37;
        int r13 = r8.hashCode();
    L39:
        if (r10 == null) goto L42;
        r1 = r10.hashCode();
    L42:
        return makeNode(r13, r8, r9, r1, r10, r11, shift + 5, r24.getOwnership());
    L37:
        r13 = 0;
        goto L39
    }

    private final int calculateSize() {
        if (this.nodeMap == 0) goto L5;
        int numValues = Integer.bitCount(this.dataMap);
        int result = numValues;
        int i = numValues * 2;
        int r3 = this.buffer.length;
    L7:
        if (i >= r3) goto L9;
        result = result + nodeAtIndex$runtime_release(i).calculateSize();
        i = i + 1;
        goto L7
    L9:
        return result;
    L5:
        return this.buffer.length / 2;
    }

    private final boolean elementsIdentityEquals(TrieNode<K, V> r7) {
        if (this != r7) goto L6;
        return true;
    L6:
        if (this.nodeMap == r7.nodeMap) goto L9;
        return false;
    L9:
        if (this.dataMap == r7.dataMap) goto L11;
        return false;
    L11:
        int i = 0;
        int r2 = this.buffer.length;
    L12:
        if (i >= r2) goto L17;
        if (this.buffer[i] != r7.buffer[i]) goto L15;
        i = i + 1;
        goto L12
    L15:
        return false;
    L17:
        return true;
    }

    public final boolean containsKey(int keyHash, K r5, int shift) {
        int keyPositionMask = 1 << TrieNodeKt.indexSegment(keyHash, shift);
        if (hasEntryAt$runtime_release(keyPositionMask) == false) goto L7;
        return Intrinsics.areEqual(r5, keyAtIndex(entryKeyIndex$runtime_release(keyPositionMask)));
    L7:
        if (hasNodeAt(keyPositionMask) == false) goto L14;
        TrieNode<K, V> r1 = nodeAtIndex$runtime_release(nodeIndex$runtime_release(keyPositionMask));
        if (shift != 30) goto L13;
        return r1.collisionContainsKey(r5);
    L13:
        return r1.containsKey(keyHash, r5, shift + 5);
    L14:
        return false;
    }

    public final V get(int keyHash, K r6, int shift) {
        int keyPositionMask = 1 << TrieNodeKt.indexSegment(keyHash, shift);
        if (hasEntryAt$runtime_release(keyPositionMask) == false) goto L10;
        int keyIndex = entryKeyIndex$runtime_release(keyPositionMask);
        if (Intrinsics.areEqual(r6, keyAtIndex(keyIndex)) == true) goto L7;
        return null;
    L7:
        return valueAtKeyIndex(keyIndex);
    L10:
        if (hasNodeAt(keyPositionMask) == false) goto L17;
        TrieNode<K, V> r1 = nodeAtIndex$runtime_release(nodeIndex$runtime_release(keyPositionMask));
        if (shift != 30) goto L16;
        return r1.collisionGet(r6);
    L16:
        return r1.get(keyHash, r6, shift + 5);
    L17:
        return null;
    }

    public final TrieNode<K, V> mutablePutAll(TrieNode<K, V> r22, int shift, DeltaCounter intersectionCounter, PersistentHashMapBuilder<K, V> r25) {
        if (this != r22) goto L6;
        intersectionCounter.plusAssign(calculateSize());
        return this;
    L6:
        int r3 = shift;
        if (r3 > 30) goto L9;
        int newNodeMap = this.nodeMap | r22.nodeMap;
        int newDataMap = (this.dataMap ^ r22.dataMap) & (~newNodeMap);
        int $this$forEachOneBit$iv = this.dataMap & r22.dataMap;
        int mask$iv = newNodeMap;
        int newNodeMap2 = $this$forEachOneBit$iv;
        int newDataMap2 = newDataMap;
        int newDataMap3 = 0;
    L11:
        if (newNodeMap2 == 0) goto L17;
        int bit$iv = Integer.lowestOneBit(newNodeMap2);
        Object leftKey = keyAtIndex(entryKeyIndex$runtime_release(bit$iv));
        Object rightKey = r22.keyAtIndex(r22.entryKeyIndex$runtime_release(bit$iv));
        if (Intrinsics.areEqual(leftKey, rightKey) == false) goto L15;
        newDataMap2 = newDataMap2 | bit$iv;
    L16:
        newDataMap3 = newDataMap3 + 1;
        newNodeMap2 = newNodeMap2 ^ bit$iv;
        goto L11
    L15:
        mask$iv = mask$iv | bit$iv;
        goto L16
    L17:
        boolean r6 = true;
        if ((mask$iv & newDataMap2) != 0) goto L20;
        boolean value$iv = true;
    L22:
        if (value$iv == true) goto L25;
        PreconditionsKt.throwIllegalStateException("Check failed.");
    L25:
        if (Intrinsics.areEqual(this.ownedBy, r25.getOwnership()) == true) goto L27;
    L31:
        Object[] newBuffer = new Object[(Integer.bitCount(newDataMap2) * 2) + Integer.bitCount(mask$iv)];
        TrieNode<K, V> r5 = new TrieNode(newDataMap2, mask$iv, newBuffer);
    L32:
        TrieNode<K, V> r7 = r5;
        int $this$forEachOneBit$iv2 = mask$iv;
        int mask$iv2 = $this$forEachOneBit$iv2;
        int index$iv = 0;
    L33:
        if (mask$iv2 == 0) goto L35;
        int bit$iv2 = Integer.lowestOneBit(mask$iv2);
        int index = index$iv;
        int newNodeIndex = (r7.buffer.length - 1) - index;
        r7.buffer[newNodeIndex] = mutablePutAllFromOtherNodeCell(r22, bit$iv2, r3, intersectionCounter, r25);
        index$iv = index$iv + 1;
        mask$iv2 = mask$iv2 ^ bit$iv2;
        r3 = shift;
        goto L33
    L35:
        int $this$forEachOneBit$iv3 = newDataMap2;
        int mask$iv3 = $this$forEachOneBit$iv3;
        int index$iv2 = 0;
    L36:
        if (mask$iv3 == 0) goto L45;
        int bit$iv3 = Integer.lowestOneBit(mask$iv3);
        int index2 = index$iv2;
        int newKeyIndex = index2 * 2;
        if (r22.hasEntryAt$runtime_release(bit$iv3) == true) goto L40;
        boolean r16 = r6;
        int oldKeyIndex = entryKeyIndex$runtime_release(bit$iv3);
        int $this$forEachOneBit$iv4 = $this$forEachOneBit$iv3;
        r7.buffer[newKeyIndex] = keyAtIndex(oldKeyIndex);
        r7.buffer[newKeyIndex + 1] = valueAtKeyIndex(oldKeyIndex);
    L43:
        index$iv2 = index$iv2 + 1;
        mask$iv3 = mask$iv3 ^ bit$iv3;
        r6 = r16;
        $this$forEachOneBit$iv3 = $this$forEachOneBit$iv4;
        goto L36
    L40:
        $this$forEachOneBit$iv4 = $this$forEachOneBit$iv3;
        r16 = r6;
        int oldKeyIndex2 = r22.entryKeyIndex$runtime_release(bit$iv3);
        r7.buffer[newKeyIndex] = r22.keyAtIndex(oldKeyIndex2);
        r7.buffer[newKeyIndex + 1] = r22.valueAtKeyIndex(oldKeyIndex2);
        if (hasEntryAt$runtime_release(bit$iv3) == false) goto L43;
        intersectionCounter.setCount(intersectionCounter.getCount() + 1);
        goto L43
    L45:
        if (elementsIdentityEquals(r7) == false) goto L48;
        return this;
    L48:
        if (r22.elementsIdentityEquals(r7) == false) goto L51;
        return r22;
    L51:
        return r7;
    L27:
        if (this.dataMap != newDataMap2) goto L31;
        if (this.nodeMap != mask$iv) goto L31;
        r5 = this;
        goto L32
    L20:
        value$iv = false;
        goto L22
    L9:
        return mutableCollisionPutAll(r22, intersectionCounter, r25.getOwnership());
    }

    public final ModificationResult<K, V> put(int keyHash, K r12, V r13, int shift) {
        int keyPositionMask = 1 << TrieNodeKt.indexSegment(keyHash, shift);
        if (hasEntryAt$runtime_release(keyPositionMask) == false) goto L14;
        int keyIndex = entryKeyIndex$runtime_release(keyPositionMask);
        if (Intrinsics.areEqual(r12, keyAtIndex(keyIndex)) == false) goto L12;
        if (valueAtKeyIndex(keyIndex) != r13) goto L10;
        return null;
    L10:
        return updateValueAtIndex(keyIndex, r13).asUpdateResult();
    L12:
        return moveEntryToNode(keyIndex, keyPositionMask, keyHash, r12, r13, shift).asInsertResult();
    L14:
        if (hasNodeAt(keyPositionMask) == false) goto L26;
        int nodeIndex = nodeIndex$runtime_release(keyPositionMask);
        TrieNode<K, V> r14 = nodeAtIndex$runtime_release(nodeIndex);
        if (shift != 30) goto L20;
        ModificationResult<K, V> r15 = r14.collisionPut(r12, r13);
        if (r15 != null) goto L23;
        return null;
    L23:
        ModificationResult<K, V> r16 = r15;
        r16.setNode(updateNodeAtIndex(nodeIndex, keyPositionMask, r16.getNode()));
        return r16;
    L20:
        r15 = r14.put(keyHash, r12, r13, shift + 5);
        if (r15 != null) goto L23;
        return null;
    L26:
        return insertEntryAt(keyPositionMask, r12, r13).asInsertResult();
    }

    public final TrieNode<K, V> mutablePut(int keyHash, K r12, V r13, int shift, PersistentHashMapBuilder<K, V> r15) {
        int keyPositionMask = 1 << TrieNodeKt.indexSegment(keyHash, shift);
        if (hasEntryAt$runtime_release(keyPositionMask) == false) goto L14;
        int keyIndex = entryKeyIndex$runtime_release(keyPositionMask);
        if (Intrinsics.areEqual(r12, keyAtIndex(keyIndex)) == false) goto L11;
        r15.setOperationResult$runtime_release(valueAtKeyIndex(keyIndex));
        if (valueAtKeyIndex(keyIndex) != r13) goto L10;
        return this;
    L10:
        return mutableUpdateValueAtIndex(keyIndex, r13, r15);
    L11:
        r15.setSize(r15.size() + 1);
        return mutableMoveEntryToNode(keyIndex, keyPositionMask, keyHash, r12, r13, shift, r15.getOwnership());
    L14:
        if (hasNodeAt(keyPositionMask) == false) goto L24;
        int nodeIndex = nodeIndex$runtime_release(keyPositionMask);
        TrieNode<K, V> r0 = nodeAtIndex$runtime_release(nodeIndex);
        if (shift != 30) goto L18;
        TrieNode<K, V> r14 = r0.mutableCollisionPut(r12, r13, r15);
        PersistentHashMapBuilder<K, V> r16 = r15;
    L20:
        if (r0 != r14) goto L23;
        return this;
    L23:
        return mutableUpdateNodeAtIndex(nodeIndex, r14, r16.getOwnership());
    L18:
        r14 = r0.mutablePut(keyHash, r12, r13, shift + 5, r15);
        r16 = r15;
        goto L20
    L24:
        r15.setSize(r15.size() + 1);
        return mutableInsertEntryAt(keyPositionMask, r12, r13, r15.getOwnership());
    }

    public final TrieNode<K, V> remove(int keyHash, K r7, int shift) {
        int keyPositionMask = 1 << TrieNodeKt.indexSegment(keyHash, shift);
        if (hasEntryAt$runtime_release(keyPositionMask) == false) goto L10;
        int keyIndex = entryKeyIndex$runtime_release(keyPositionMask);
        if (Intrinsics.areEqual(r7, keyAtIndex(keyIndex)) == true) goto L7;
        return this;
    L7:
        return removeEntryAtIndex(keyIndex, keyPositionMask);
    L10:
        if (hasNodeAt(keyPositionMask) == false) goto L17;
        int nodeIndex = nodeIndex$runtime_release(keyPositionMask);
        TrieNode<K, V> r2 = nodeAtIndex$runtime_release(nodeIndex);
        if (shift != 30) goto L14;
        TrieNode<K, V> r3 = r2.collisionRemove(r7);
    L16:
        return replaceNode(r2, r3, nodeIndex, keyPositionMask);
    L14:
        r3 = r2.remove(keyHash, r7, shift + 5);
        goto L16
    L17:
        return this;
    }

    private final TrieNode<K, V> replaceNode(TrieNode<K, V> r2, TrieNode<K, V> r3, int nodeIndex, int positionMask) {
        if (r3 == null) goto L8;
        if (r2 == r3) goto L7;
        return updateNodeAtIndex(nodeIndex, positionMask, r3);
    L7:
        return this;
    L8:
        return removeNodeAtIndex(nodeIndex, positionMask);
    }

    public final TrieNode<K, V> mutableRemove(int keyHash, K r10, int shift, PersistentHashMapBuilder<K, V> r12) {
        int keyPositionMask = 1 << TrieNodeKt.indexSegment(keyHash, shift);
        if (hasEntryAt$runtime_release(keyPositionMask) == false) goto L10;
        int keyIndex = entryKeyIndex$runtime_release(keyPositionMask);
        if (Intrinsics.areEqual(r10, keyAtIndex(keyIndex)) == true) goto L7;
        return this;
    L7:
        return mutableRemoveEntryAtIndex(keyIndex, keyPositionMask, r12);
    L10:
        if (hasNodeAt(keyPositionMask) == false) goto L18;
        int nodeIndex = nodeIndex$runtime_release(keyPositionMask);
        TrieNode<K, V> r3 = nodeAtIndex$runtime_release(nodeIndex);
        if (shift != 30) goto L14;
        TrieNode<K, V> r4 = r3.mutableCollisionRemove(r10, r12);
    L16:
        return mutableReplaceNode(r3, r4, nodeIndex, keyPositionMask, r12.getOwnership());
    L14:
        r4 = r3.mutableRemove(keyHash, r10, shift + 5, r12);
        goto L16
    L18:
        return this;
    }

    private final TrieNode<K, V> mutableReplaceNode(TrieNode<K, V> r2, TrieNode<K, V> r3, int nodeIndex, int positionMask, MutabilityOwnership owner) {
        if (r3 != null) goto L5;
        return mutableRemoveNodeAtIndex(nodeIndex, positionMask, owner);
    L5:
        if (this.ownedBy == owner) goto L10;
        if (r2 != r3) goto L10;
        return this;
    L10:
        return mutableUpdateNodeAtIndex(nodeIndex, r3, owner);
    }

    public final TrieNode<K, V> remove(int keyHash, K r7, V r8, int shift) {
        int keyPositionMask = 1 << TrieNodeKt.indexSegment(keyHash, shift);
        if (hasEntryAt$runtime_release(keyPositionMask) == false) goto L12;
        int keyIndex = entryKeyIndex$runtime_release(keyPositionMask);
        if (Intrinsics.areEqual(r7, keyAtIndex(keyIndex)) == true) goto L7;
    L10:
        return this;
    L7:
        if (Intrinsics.areEqual(r8, valueAtKeyIndex(keyIndex)) == false) goto L10;
        return removeEntryAtIndex(keyIndex, keyPositionMask);
    L12:
        if (hasNodeAt(keyPositionMask) == false) goto L19;
        int nodeIndex = nodeIndex$runtime_release(keyPositionMask);
        TrieNode<K, V> r2 = nodeAtIndex$runtime_release(nodeIndex);
        if (shift != 30) goto L16;
        TrieNode<K, V> r3 = r2.collisionRemove(r7, r8);
    L18:
        return replaceNode(r2, r3, nodeIndex, keyPositionMask);
    L16:
        r3 = r2.remove(keyHash, r7, r8, shift + 5);
        goto L18
    L19:
        return this;
    }

    public final TrieNode<K, V> mutableRemove(int keyHash, K r11, V r12, int shift, PersistentHashMapBuilder<K, V> r14) {
        int keyPositionMask = 1 << TrieNodeKt.indexSegment(keyHash, shift);
        if (hasEntryAt$runtime_release(keyPositionMask) == false) goto L12;
        int keyIndex = entryKeyIndex$runtime_release(keyPositionMask);
        if (Intrinsics.areEqual(r11, keyAtIndex(keyIndex)) == true) goto L7;
    L10:
        return this;
    L7:
        if (Intrinsics.areEqual(r12, valueAtKeyIndex(keyIndex)) == false) goto L10;
        return mutableRemoveEntryAtIndex(keyIndex, keyPositionMask, r14);
    L12:
        if (hasNodeAt(keyPositionMask) == false) goto L19;
        int nodeIndex = nodeIndex$runtime_release(keyPositionMask);
        TrieNode<K, V> r1 = nodeAtIndex$runtime_release(nodeIndex);
        if (shift != 30) goto L16;
        TrieNode<K, V> r2 = r1.mutableCollisionRemove(r11, r12, r14);
    L18:
        return mutableReplaceNode(r1, r2, nodeIndex, keyPositionMask, r14.getOwnership());
    L16:
        r2 = r1.mutableRemove(keyHash, r11, r12, shift + 5, r14);
        goto L18
    L19:
        return this;
    }

    public final void accept$runtime_release(Function5<? super TrieNode<K, V>, ? super Integer, ? super Integer, ? super Integer, ? super Integer, Unit> r2) {
        accept(r2, 0, 0);
    }

    private final void accept(Function5<? super TrieNode<K, V>, ? super Integer, ? super Integer, ? super Integer, ? super Integer, Unit> r7, int hash, int shift) {
        r7.invoke(this, Integer.valueOf(shift), Integer.valueOf(hash), Integer.valueOf(this.dataMap), Integer.valueOf(this.nodeMap));
        int nodePositions = this.nodeMap;
    L3:
        if (nodePositions == 0) goto L5;
        int mask = Integer.lowestOneBit(nodePositions);
        int hashSegment = Integer.numberOfTrailingZeros(mask);
        nodeAtIndex$runtime_release(nodeIndex$runtime_release(mask)).accept(r7, (hashSegment << shift) + hash, shift + 5);
        nodePositions = nodePositions - mask;
        goto L3
    }

    static {
        Companion = new Companion(null);
        $stable = 8;
        EMPTY = new TrieNode(0, 0, new Object[0]);
    }
}
