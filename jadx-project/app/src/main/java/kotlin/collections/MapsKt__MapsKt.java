package kotlin.collections;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.TypeIntrinsics;
import kotlin.sequences.Sequence;

/* JADX INFO: compiled from: Maps.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0084\u0001\n\u0000\n\u0002\u0010$\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010&\n\u0002\b\t\n\u0002\u0010(\n\u0002\u0010)\n\u0002\u0010'\n\u0002\b\b\n\u0002\u0010\u001c\n\u0002\u0018\u0002\n\u0002\b\u001d\u001a\u001e\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003\u001aO\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u00032*\u0010\u0005\u001a\u0016\u0012\u0012\b\u0001\u0012\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u00070\u0006\"\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0007¢\u0006\u0002\u0010\b\u001a!\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003H\u0087\b\u001a!\u0010\t\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\n\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003H\u0087\b\u001aO\u0010\t\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\n\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u00032*\u0010\u0005\u001a\u0016\u0012\u0012\b\u0001\u0012\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u00070\u0006\"\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0007¢\u0006\u0002\u0010\b\u001a6\u0010\u000b\u001a\u001e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\fj\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u0003`\r\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003H\u0087\b¢\u0006\u0002\u0010\u000e\u001a_\u0010\u000b\u001a\u001e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\fj\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u0003`\r\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u00032*\u0010\u0005\u001a\u0016\u0012\u0012\b\u0001\u0012\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u00070\u0006\"\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0007¢\u0006\u0002\u0010\u000f\u001a6\u0010\u0010\u001a\u001e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0011j\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u0003`\u0012\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003H\u0087\b¢\u0006\u0002\u0010\u0013\u001a_\u0010\u0010\u001a\u001e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0011j\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u0003`\u0012\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u00032*\u0010\u0005\u001a\u0016\u0012\u0012\b\u0001\u0012\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u00070\u0006\"\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0007¢\u0006\u0002\u0010\u0014\u001aX\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u00032%\b\u0001\u0010\u0016\u001a\u001f\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\n\u0012\u0004\u0012\u00020\u00180\u0017¢\u0006\u0002\b\u0019H\u0087\bø\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0001\u001a`\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u00032\u0006\u0010\u001a\u001a\u00020\u001b2%\b\u0001\u0010\u0016\u001a\u001f\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\n\u0012\u0004\u0012\u00020\u00180\u0017¢\u0006\u0002\b\u0019H\u0087\bø\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0002 \u0001\u001a'\u0010\u001c\u001a\u00020\u001d\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003*\u0010\u0012\u0006\b\u0001\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0001H\u0087\b\u001a:\u0010\u001e\u001a\u00020\u001d\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003*\u0012\u0012\u0006\b\u0001\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u0003\u0018\u00010\u0001H\u0087\b\u0082\u0002\u000e\n\f\b\u0000\u0012\u0002\u0018\u0001\u001a\u0004\b\u0003\u0010\u0000\u001a3\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003*\u0010\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u0003\u0018\u00010\u0001H\u0087\b\u001aL\u0010 \u001a\u0002H!\"\u0014\b\u0000\u0010\"*\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u0001*\u0002H!\"\u0004\b\u0001\u0010!*\u0002H\"2\f\u0010#\u001a\b\u0012\u0004\u0012\u0002H!0$H\u0087\bø\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0000¢\u0006\u0002\u0010%\u001a9\u0010&\u001a\u00020\u001d\"\t\b\u0000\u0010\u0002¢\u0006\u0002\b'\"\u0004\b\u0001\u0010\u0003*\u0010\u0012\u0006\b\u0001\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u00012\u0006\u0010(\u001a\u0002H\u0002H\u0087\n¢\u0006\u0002\u0010)\u001a;\u0010*\u001a\u0004\u0018\u0001H\u0003\"\t\b\u0000\u0010\u0002¢\u0006\u0002\b'\"\u0004\b\u0001\u0010\u0003*\u0010\u0012\u0006\b\u0001\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u00012\u0006\u0010(\u001a\u0002H\u0002H\u0087\n¢\u0006\u0002\u0010+\u001a:\u0010,\u001a\u00020\u0018\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003*\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\n2\u0006\u0010(\u001a\u0002H\u00022\u0006\u0010-\u001a\u0002H\u0003H\u0087\n¢\u0006\u0002\u0010.\u001a1\u0010/\u001a\u00020\u001d\"\t\b\u0000\u0010\u0002¢\u0006\u0002\b'*\u000e\u0012\u0006\b\u0001\u0012\u0002H\u0002\u0012\u0002\b\u00030\u00012\u0006\u0010(\u001a\u0002H\u0002H\u0087\b¢\u0006\u0002\u0010)\u001a7\u00100\u001a\u00020\u001d\"\u0004\b\u0000\u0010\u0002\"\t\b\u0001\u0010\u0003¢\u0006\u0002\b'*\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u00012\u0006\u0010-\u001a\u0002H\u0003H\u0087\b¢\u0006\u0002\u0010)\u001a;\u00101\u001a\u0004\u0018\u0001H\u0003\"\t\b\u0000\u0010\u0002¢\u0006\u0002\b'\"\u0004\b\u0001\u0010\u0003*\u0010\u0012\u0006\b\u0001\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\n2\u0006\u0010(\u001a\u0002H\u0002H\u0087\b¢\u0006\u0002\u0010+\u001a*\u00102\u001a\u0002H\u0002\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003*\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u000303H\u0087\n¢\u0006\u0002\u00104\u001a*\u00105\u001a\u0002H\u0003\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003*\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u000303H\u0087\n¢\u0006\u0002\u00104\u001a1\u00106\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0007\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003*\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u000303H\u0087\b\u001aP\u00107\u001a\u0002H\u0003\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003*\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u00012\u0006\u0010(\u001a\u0002H\u00022\f\u0010#\u001a\b\u0012\u0004\u0012\u0002H\u00030$H\u0087\bø\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0002 \u0000¢\u0006\u0002\u00108\u001aC\u00109\u001a\u0002H\u0003\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003*\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u00012\u0006\u0010(\u001a\u0002H\u00022\f\u0010#\u001a\b\u0012\u0004\u0012\u0002H\u00030$H\u0080\bø\u0001\u0000¢\u0006\u0002\u00108\u001a1\u0010:\u001a\u0002H\u0003\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003*\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u00012\u0006\u0010(\u001a\u0002H\u0002H\u0007¢\u0006\u0002\u0010+\u001aC\u0010;\u001a\u0002H\u0003\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003*\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\n2\u0006\u0010(\u001a\u0002H\u00022\f\u0010#\u001a\b\u0012\u0004\u0012\u0002H\u00030$H\u0086\bø\u0001\u0000¢\u0006\u0002\u00108\u001a9\u0010<\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u0003030=\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003*\u0010\u0012\u0006\b\u0001\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0001H\u0087\n\u001a<\u0010<\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030?0>\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003*\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\nH\u0087\n¢\u0006\u0002\b@\u001aw\u0010A\u001a\u0002H\"\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003\"\u0004\b\u0002\u0010!\"\u0018\b\u0003\u0010\"*\u0012\u0012\u0006\b\u0000\u0012\u0002H\u0002\u0012\u0006\b\u0000\u0012\u0002H!0\n*\u0010\u0012\u0006\b\u0001\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u00012\u0006\u0010B\u001a\u0002H\"2\u001e\u0010C\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u000303\u0012\u0004\u0012\u0002H!0\u0017H\u0086\bø\u0001\u0000¢\u0006\u0002\u0010D\u001aw\u0010E\u001a\u0002H\"\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003\"\u0004\b\u0002\u0010!\"\u0018\b\u0003\u0010\"*\u0012\u0012\u0006\b\u0000\u0012\u0002H!\u0012\u0006\b\u0000\u0012\u0002H\u00030\n*\u0010\u0012\u0006\b\u0001\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u00012\u0006\u0010B\u001a\u0002H\"2\u001e\u0010C\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u000303\u0012\u0004\u0012\u0002H!0\u0017H\u0086\bø\u0001\u0000¢\u0006\u0002\u0010D\u001aG\u0010F\u001a\u00020\u0018\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003*\u0012\u0012\u0006\b\u0000\u0012\u0002H\u0002\u0012\u0006\b\u0000\u0012\u0002H\u00030\n2\u001a\u0010\u0005\u001a\u0016\u0012\u0012\b\u0001\u0012\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u00070\u0006¢\u0006\u0002\u0010G\u001a@\u0010F\u001a\u00020\u0018\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003*\u0012\u0012\u0006\b\u0000\u0012\u0002H\u0002\u0012\u0006\b\u0000\u0012\u0002H\u00030\n2\u0018\u0010\u0005\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u00070H\u001a@\u0010F\u001a\u00020\u0018\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003*\u0012\u0012\u0006\b\u0000\u0012\u0002H\u0002\u0012\u0006\b\u0000\u0012\u0002H\u00030\n2\u0018\u0010\u0005\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u00070I\u001a\\\u0010J\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H!0\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003\"\u0004\b\u0002\u0010!*\u0010\u0012\u0006\b\u0001\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u00012\u001e\u0010C\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u000303\u0012\u0004\u0012\u0002H!0\u0017H\u0086\bø\u0001\u0000\u001a\\\u0010K\u001a\u000e\u0012\u0004\u0012\u0002H!\u0012\u0004\u0012\u0002H\u00030\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003\"\u0004\b\u0002\u0010!*\u0010\u0012\u0006\b\u0001\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u00012\u001e\u0010C\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u000303\u0012\u0004\u0012\u0002H!0\u0017H\u0086\bø\u0001\u0000\u001aJ\u0010L\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003*\u0010\u0012\u0006\b\u0001\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u00012\u0012\u0010M\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u00020\u001d0\u0017H\u0086\bø\u0001\u0000\u001aJ\u0010N\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003*\u0010\u0012\u0006\b\u0001\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u00012\u0012\u0010M\u001a\u000e\u0012\u0004\u0012\u0002H\u0003\u0012\u0004\u0012\u00020\u001d0\u0017H\u0086\bø\u0001\u0000\u001aq\u0010O\u001a\u0002H\"\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003\"\u0018\b\u0002\u0010\"*\u0012\u0012\u0006\b\u0000\u0012\u0002H\u0002\u0012\u0006\b\u0000\u0012\u0002H\u00030\n*\u0010\u0012\u0006\b\u0001\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u00012\u0006\u0010B\u001a\u0002H\"2\u001e\u0010M\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u000303\u0012\u0004\u0012\u00020\u001d0\u0017H\u0086\bø\u0001\u0000¢\u0006\u0002\u0010D\u001aV\u0010P\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003*\u0010\u0012\u0006\b\u0001\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u00012\u001e\u0010M\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u000303\u0012\u0004\u0012\u00020\u001d0\u0017H\u0086\bø\u0001\u0000\u001aq\u0010Q\u001a\u0002H\"\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003\"\u0018\b\u0002\u0010\"*\u0012\u0012\u0006\b\u0000\u0012\u0002H\u0002\u0012\u0006\b\u0000\u0012\u0002H\u00030\n*\u0010\u0012\u0006\b\u0001\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u00012\u0006\u0010B\u001a\u0002H\"2\u001e\u0010M\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u000303\u0012\u0004\u0012\u00020\u001d0\u0017H\u0086\bø\u0001\u0000¢\u0006\u0002\u0010D\u001aV\u0010R\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003*\u0010\u0012\u0006\b\u0001\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u00012\u001e\u0010M\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u000303\u0012\u0004\u0012\u00020\u001d0\u0017H\u0086\bø\u0001\u0000\u001a4\u0010S\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003*\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u00070H\u001aO\u0010S\u001a\u0002H\"\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003\"\u0018\b\u0002\u0010\"*\u0012\u0012\u0006\b\u0000\u0012\u0002H\u0002\u0012\u0006\b\u0000\u0012\u0002H\u00030\n*\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u00070H2\u0006\u0010B\u001a\u0002H\"¢\u0006\u0002\u0010T\u001a;\u0010S\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003*\u0016\u0012\u0012\b\u0001\u0012\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u00070\u0006¢\u0006\u0002\u0010\b\u001aQ\u0010S\u001a\u0002H\"\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003\"\u0018\b\u0002\u0010\"*\u0012\u0012\u0006\b\u0000\u0012\u0002H\u0002\u0012\u0006\b\u0000\u0012\u0002H\u00030\n*\u0016\u0012\u0012\b\u0001\u0012\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u00070\u00062\u0006\u0010B\u001a\u0002H\"¢\u0006\u0002\u0010U\u001a4\u0010S\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003*\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u00070I\u001aO\u0010S\u001a\u0002H\"\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003\"\u0018\b\u0002\u0010\"*\u0012\u0012\u0006\b\u0000\u0012\u0002H\u0002\u0012\u0006\b\u0000\u0012\u0002H\u00030\n*\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u00070I2\u0006\u0010B\u001a\u0002H\"¢\u0006\u0002\u0010V\u001a2\u0010S\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003*\u0010\u0012\u0006\b\u0001\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0001H\u0007\u001a2\u0010W\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\n\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003*\u0010\u0012\u0006\b\u0001\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0001H\u0007\u001aM\u0010S\u001a\u0002H\"\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003\"\u0018\b\u0002\u0010\"*\u0012\u0012\u0006\b\u0000\u0012\u0002H\u0002\u0012\u0006\b\u0000\u0012\u0002H\u00030\n*\u0010\u0012\u0006\b\u0001\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u00012\u0006\u0010B\u001a\u0002H\"H\u0007¢\u0006\u0002\u0010X\u001aG\u0010Y\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003*\u0010\u0012\u0006\b\u0001\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u00012\u0012\u0010Z\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0007H\u0086\u0002\u001aM\u0010Y\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003*\u0010\u0012\u0006\b\u0001\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u00012\u0018\u0010\u0005\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u00070HH\u0086\u0002\u001aT\u0010Y\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003*\u0010\u0012\u0006\b\u0001\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u00012\u001a\u0010\u0005\u001a\u0016\u0012\u0012\b\u0001\u0012\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u00070\u0006H\u0086\u0002¢\u0006\u0002\u0010[\u001aM\u0010Y\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003*\u0010\u0012\u0006\b\u0001\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u00012\u0018\u0010\u0005\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u00070IH\u0086\u0002\u001aI\u0010Y\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003*\u0010\u0012\u0006\b\u0001\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u00012\u0014\u0010\\\u001a\u0010\u0012\u0006\b\u0001\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0001H\u0086\u0002\u001a=\u0010]\u001a\u00020\u0018\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003*\u0012\u0012\u0006\b\u0000\u0012\u0002H\u0002\u0012\u0006\b\u0000\u0012\u0002H\u00030\n2\u0012\u0010Z\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0007H\u0087\n\u001aC\u0010]\u001a\u00020\u0018\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003*\u0012\u0012\u0006\b\u0000\u0012\u0002H\u0002\u0012\u0006\b\u0000\u0012\u0002H\u00030\n2\u0018\u0010\u0005\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u00070HH\u0087\n\u001aJ\u0010]\u001a\u00020\u0018\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003*\u0012\u0012\u0006\b\u0000\u0012\u0002H\u0002\u0012\u0006\b\u0000\u0012\u0002H\u00030\n2\u001a\u0010\u0005\u001a\u0016\u0012\u0012\b\u0001\u0012\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u00070\u0006H\u0087\n¢\u0006\u0002\u0010G\u001aC\u0010]\u001a\u00020\u0018\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003*\u0012\u0012\u0006\b\u0000\u0012\u0002H\u0002\u0012\u0006\b\u0000\u0012\u0002H\u00030\n2\u0018\u0010\u0005\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u00070IH\u0087\n\u001a=\u0010]\u001a\u00020\u0018\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003*\u0012\u0012\u0006\b\u0000\u0012\u0002H\u0002\u0012\u0006\b\u0000\u0012\u0002H\u00030\n2\u0012\u0010\\\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0001H\u0087\n\u001a@\u0010^\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003*\u0010\u0012\u0006\b\u0001\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u00012\u0006\u0010(\u001a\u0002H\u0002H\u0087\u0002¢\u0006\u0002\u0010_\u001aA\u0010^\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003*\u0010\u0012\u0006\b\u0001\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u00012\f\u0010`\u001a\b\u0012\u0004\u0012\u0002H\u00020HH\u0087\u0002\u001aH\u0010^\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003*\u0010\u0012\u0006\b\u0001\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u00012\u000e\u0010`\u001a\n\u0012\u0006\b\u0001\u0012\u0002H\u00020\u0006H\u0087\u0002¢\u0006\u0002\u0010a\u001aA\u0010^\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003*\u0010\u0012\u0006\b\u0001\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u00012\f\u0010`\u001a\b\u0012\u0004\u0012\u0002H\u00020IH\u0087\u0002\u001a2\u0010b\u001a\u00020\u0018\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003*\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\n2\u0006\u0010(\u001a\u0002H\u0002H\u0087\n¢\u0006\u0002\u0010c\u001a3\u0010b\u001a\u00020\u0018\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003*\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\n2\f\u0010`\u001a\b\u0012\u0004\u0012\u0002H\u00020HH\u0087\n\u001a:\u0010b\u001a\u00020\u0018\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003*\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\n2\u000e\u0010`\u001a\n\u0012\u0006\b\u0001\u0012\u0002H\u00020\u0006H\u0087\n¢\u0006\u0002\u0010d\u001a3\u0010b\u001a\u00020\u0018\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003*\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\n2\f\u0010`\u001a\b\u0012\u0004\u0012\u0002H\u00020IH\u0087\n\u001a0\u0010e\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003*\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0001H\u0000\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006f"}, d2 = {"emptyMap", "", "K", "V", "mapOf", "pairs", "", "Lkotlin/Pair;", "([Lkotlin/Pair;)Ljava/util/Map;", "mutableMapOf", "", "hashMapOf", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "()Ljava/util/HashMap;", "([Lkotlin/Pair;)Ljava/util/HashMap;", "linkedMapOf", "Ljava/util/LinkedHashMap;", "Lkotlin/collections/LinkedHashMap;", "()Ljava/util/LinkedHashMap;", "([Lkotlin/Pair;)Ljava/util/LinkedHashMap;", "buildMap", "builderAction", "Lkotlin/Function1;", "", "Lkotlin/ExtensionFunctionType;", "capacity", "", "isNotEmpty", "", "isNullOrEmpty", "orEmpty", "ifEmpty", "R", "M", "defaultValue", "Lkotlin/Function0;", "(Ljava/util/Map;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "contains", "Lkotlin/internal/OnlyInputTypes;", "key", "(Ljava/util/Map;Ljava/lang/Object;)Z", "get", "(Ljava/util/Map;Ljava/lang/Object;)Ljava/lang/Object;", "set", "value", "(Ljava/util/Map;Ljava/lang/Object;Ljava/lang/Object;)V", "containsKey", "containsValue", "remove", "component1", "", "(Ljava/util/Map$Entry;)Ljava/lang/Object;", "component2", "toPair", "getOrElse", "(Ljava/util/Map;Ljava/lang/Object;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "getOrElseNullable", "getValue", "getOrPut", "iterator", "", "", "", "mutableIterator", "mapValuesTo", "destination", "transform", "(Ljava/util/Map;Ljava/util/Map;Lkotlin/jvm/functions/Function1;)Ljava/util/Map;", "mapKeysTo", "putAll", "(Ljava/util/Map;[Lkotlin/Pair;)V", "", "Lkotlin/sequences/Sequence;", "mapValues", "mapKeys", "filterKeys", "predicate", "filterValues", "filterTo", "filter", "filterNotTo", "filterNot", "toMap", "(Ljava/lang/Iterable;Ljava/util/Map;)Ljava/util/Map;", "([Lkotlin/Pair;Ljava/util/Map;)Ljava/util/Map;", "(Lkotlin/sequences/Sequence;Ljava/util/Map;)Ljava/util/Map;", "toMutableMap", "(Ljava/util/Map;Ljava/util/Map;)Ljava/util/Map;", "plus", "pair", "(Ljava/util/Map;[Lkotlin/Pair;)Ljava/util/Map;", "map", "plusAssign", "minus", "(Ljava/util/Map;Ljava/lang/Object;)Ljava/util/Map;", "keys", "(Ljava/util/Map;[Ljava/lang/Object;)Ljava/util/Map;", "minusAssign", "(Ljava/util/Map;Ljava/lang/Object;)V", "(Ljava/util/Map;[Ljava/lang/Object;)V", "optimizeReadOnlyMap", "kotlin-stdlib"}, k = 5, mv = {2, 2, 0}, xi = 49, xs = "kotlin/collections/MapsKt")
class MapsKt__MapsKt extends MapsKt__MapsJVMKt {
    public MapsKt__MapsKt() {
    }

    public static final <K, V> Map<K, V> emptyMap() {
        EmptyMap r0 = EmptyMap.INSTANCE;
        Intrinsics.checkNotNull(r0, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.MapsKt__MapsKt.emptyMap, V of kotlin.collections.MapsKt__MapsKt.emptyMap>");
        return r0;
    }

    public static final <K, V> Map<K, V> mapOf(Pair<? extends K, ? extends V>... r2) {
        Intrinsics.checkNotNullParameter(r2, "pairs");
        if (r2.length <= 0) goto L6;
        return MapsKt.toMap(r2, new LinkedHashMap(MapsKt.mapCapacity(r2.length)));
    L6:
        return MapsKt.emptyMap();
    }

    private static final <K, V> Map<K, V> mapOf() {
        return MapsKt.emptyMap();
    }

    private static final <K, V> Map<K, V> mutableMapOf() {
        return new LinkedHashMap();
    }

    public static final <K, V> Map<K, V> mutableMapOf(Pair<? extends K, ? extends V>... r4) {
        Intrinsics.checkNotNullParameter(r4, "pairs");
        LinkedHashMap $this$mutableMapOf_u24lambda_u240 = new LinkedHashMap(MapsKt.mapCapacity(r4.length));
        MapsKt.putAll($this$mutableMapOf_u24lambda_u240, r4);
        return $this$mutableMapOf_u24lambda_u240;
    }

    private static final <K, V> HashMap<K, V> hashMapOf() {
        return new HashMap();
    }

    public static final <K, V> HashMap<K, V> hashMapOf(Pair<? extends K, ? extends V>... r4) {
        Intrinsics.checkNotNullParameter(r4, "pairs");
        HashMap<K, V> r0 = new HashMap(MapsKt.mapCapacity(r4.length));
        MapsKt.putAll(r0, r4);
        return r0;
    }

    private static final <K, V> LinkedHashMap<K, V> linkedMapOf() {
        return new LinkedHashMap();
    }

    public static final <K, V> LinkedHashMap<K, V> linkedMapOf(Pair<? extends K, ? extends V>... r2) {
        Intrinsics.checkNotNullParameter(r2, "pairs");
        return (LinkedHashMap) MapsKt.toMap(r2, new LinkedHashMap(MapsKt.mapCapacity(r2.length)));
    }

    private static final <K, V> Map<K, V> buildMap(Function1<? super Map<K, V>, Unit> r1) {
        Intrinsics.checkNotNullParameter(r1, "builderAction");
        Map r0 = MapsKt.createMapBuilder();
        r1.invoke(r0);
        return MapsKt.build(r0);
    }

    private static final <K, V> Map<K, V> buildMap(int capacity, Function1<? super Map<K, V>, Unit> r2) {
        Intrinsics.checkNotNullParameter(r2, "builderAction");
        Map r0 = MapsKt.createMapBuilder(capacity);
        r2.invoke(r0);
        return MapsKt.build(r0);
    }

    private static final <K, V> boolean isNotEmpty(Map<? extends K, ? extends V> r1) {
        Intrinsics.checkNotNullParameter(r1, "<this>");
        return !r1.isEmpty();
    }

    private static final <K, V> boolean isNullOrEmpty(Map<? extends K, ? extends V> r1) {
        if (r1 != null) goto L4;
    L7:
        return true;
    L4:
        if (r1.isEmpty() == true) goto L7;
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final <K, V> Map<K, V> orEmpty(Map<K, ? extends V> r1) {
        if (r1 != 0) goto L5;
        return MapsKt.emptyMap();
    L5:
        return r1;
    }

    /* JADX WARN: Incorrect types in method signature: <M::Ljava/util/Map<**>;:TR;R:Ljava/lang/Object;>(TM;Lkotlin/jvm/functions/Function0<+TR;>;)TR; */
    private static final Object ifEmpty(Map $this$ifEmpty, Function0 defaultValue) {
        Intrinsics.checkNotNullParameter(defaultValue, "defaultValue");
        if ($this$ifEmpty.isEmpty() == false) goto L6;
        return defaultValue.invoke();
    L6:
        return $this$ifEmpty;
    }

    private static final <K, V> boolean contains(Map<? extends K, ? extends V> r1, K r2) {
        Intrinsics.checkNotNullParameter(r1, "<this>");
        return r1.containsKey(r2);
    }

    private static final <K, V> V get(Map<? extends K, ? extends V> r1, K r2) {
        Intrinsics.checkNotNullParameter(r1, "<this>");
        return r1.get(r2);
    }

    private static final <K, V> void set(Map<K, V> r1, K r2, V r3) {
        Intrinsics.checkNotNullParameter(r1, "<this>");
        r1.put(r2, r3);
    }

    private static final <K> boolean containsKey(Map<? extends K, ?> r1, K r2) {
        Intrinsics.checkNotNullParameter(r1, "<this>");
        return r1.containsKey(r2);
    }

    private static final <K, V> boolean containsValue(Map<K, ? extends V> r1, V r2) {
        Intrinsics.checkNotNullParameter(r1, "<this>");
        return r1.containsValue(r2);
    }

    private static final <K, V> V remove(Map<? extends K, V> r1, K r2) {
        Intrinsics.checkNotNullParameter(r1, "<this>");
        return (V) TypeIntrinsics.asMutableMap(r1).remove(r2);
    }

    private static final <K, V> K component1(Map.Entry<? extends K, ? extends V> r1) {
        Intrinsics.checkNotNullParameter(r1, "<this>");
        return r1.getKey();
    }

    private static final <K, V> V component2(Map.Entry<? extends K, ? extends V> r1) {
        Intrinsics.checkNotNullParameter(r1, "<this>");
        return r1.getValue();
    }

    private static final <K, V> Pair<K, V> toPair(Map.Entry<? extends K, ? extends V> r3) {
        Intrinsics.checkNotNullParameter(r3, "<this>");
        return new Pair(r3.getKey(), r3.getValue());
    }

    private static final <K, V> V getOrElse(Map<K, ? extends V> r1, K r2, Function0<? extends V> r3) {
        Intrinsics.checkNotNullParameter(r1, "<this>");
        Intrinsics.checkNotNullParameter(r3, "defaultValue");
        V r0 = r1.get(r2);
        if (r0 == null) goto L5;
        return r0;
    L5:
        return r3.invoke();
    }

    public static final <K, V> V getOrElseNullable(Map<K, ? extends V> r3, K r4, Function0<? extends V> r5) {
        Intrinsics.checkNotNullParameter(r3, "<this>");
        Intrinsics.checkNotNullParameter(r5, "defaultValue");
        V r1 = r3.get(r4);
        if (r1 == null) goto L5;
    L8:
        return r1;
    L5:
        if (r3.containsKey(r4) == true) goto L8;
        return r5.invoke();
    }

    public static final <K, V> V getValue(Map<K, ? extends V> r1, K r2) {
        Intrinsics.checkNotNullParameter(r1, "<this>");
        return (V) MapsKt.getOrImplicitDefaultNullable(r1, r2);
    }

    public static final <K, V> V getOrPut(Map<K, V> r3, K r4, Function0<? extends V> r5) {
        Intrinsics.checkNotNullParameter(r3, "<this>");
        Intrinsics.checkNotNullParameter(r5, "defaultValue");
        V r1 = r3.get(r4);
        if (r1 != null) goto L6;
        V r2 = r5.invoke();
        r3.put(r4, r2);
        return r2;
    L6:
        return r1;
    }

    private static final <K, V> Iterator<Map.Entry<K, V>> iterator(Map<? extends K, ? extends V> r1) {
        Intrinsics.checkNotNullParameter(r1, "<this>");
        return r1.entrySet().iterator();
    }

    private static final <K, V> Iterator<Map.Entry<K, V>> mutableIterator(Map<K, V> r1) {
        Intrinsics.checkNotNullParameter(r1, "<this>");
        return r1.entrySet().iterator();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <K, V, R, M extends Map<? super K, ? super R>> M mapValuesTo(Map<? extends K, ? extends V> r7, M r8, Function1<? super Map.Entry<? extends K, ? extends V>, ? extends R> r9) {
        Intrinsics.checkNotNullParameter(r7, "<this>");
        Intrinsics.checkNotNullParameter(r8, "destination");
        Intrinsics.checkNotNullParameter(r9, "transform");
        Iterable $this$associateByTo$iv = r7.entrySet();
        Iterator r3 = $this$associateByTo$iv.iterator();
    L4:
        if (r3.hasNext() == false) goto L7;
        Object element$iv = r3.next();
        Map.Entry it = (Map.Entry) element$iv;
        r8.put(it.getKey(), r9.invoke(element$iv));
        goto L4
    L7:
        return r8;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <K, V, R, M extends Map<? super R, ? super V>> M mapKeysTo(Map<? extends K, ? extends V> r8, M r9, Function1<? super Map.Entry<? extends K, ? extends V>, ? extends R> r10) {
        Intrinsics.checkNotNullParameter(r8, "<this>");
        Intrinsics.checkNotNullParameter(r9, "destination");
        Intrinsics.checkNotNullParameter(r10, "transform");
        Iterable $this$associateByTo$iv = r8.entrySet();
        Iterator r3 = $this$associateByTo$iv.iterator();
    L4:
        if (r3.hasNext() == false) goto L7;
        Object element$iv = r3.next();
        Map.Entry it = (Map.Entry) element$iv;
        r9.put(r10.invoke(element$iv), it.getValue());
        goto L4
    L7:
        return r9;
    }

    public static final <K, V> void putAll(Map<? super K, ? super V> r4, Pair<? extends K, ? extends V>[] r5) {
        Intrinsics.checkNotNullParameter(r4, "<this>");
        Intrinsics.checkNotNullParameter(r5, "pairs");
        int r0 = r5.length;
        int r1 = 0;
    L3:
        if (r1 >= r0) goto L5;
        Pair<? extends K, ? extends V> r2 = r5[r1];
        Object key = r2.component1();
        Object value = r2.component2();
        r4.put(key, value);
        r1 = r1 + 1;
        goto L3
    }

    public static final <K, V> void putAll(Map<? super K, ? super V> r3, Iterable<? extends Pair<? extends K, ? extends V>> r4) {
        Intrinsics.checkNotNullParameter(r3, "<this>");
        Intrinsics.checkNotNullParameter(r4, "pairs");
        Iterator<? extends Pair<? extends K, ? extends V>> r0 = r4.iterator();
    L4:
        if (r0.hasNext() == false) goto L6;
        Pair<? extends K, ? extends V> r1 = r0.next();
        Object key = r1.component1();
        Object value = r1.component2();
        r3.put(key, value);
        goto L4
    }

    public static final <K, V> void putAll(Map<? super K, ? super V> r3, Sequence<? extends Pair<? extends K, ? extends V>> r4) {
        Intrinsics.checkNotNullParameter(r3, "<this>");
        Intrinsics.checkNotNullParameter(r4, "pairs");
        Iterator<? extends Pair<? extends K, ? extends V>> r0 = r4.iterator();
    L4:
        if (r0.hasNext() == false) goto L6;
        Pair<? extends K, ? extends V> r1 = r0.next();
        Object key = r1.component1();
        Object value = r1.component2();
        r3.put(key, value);
        goto L4
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <K, V, R> Map<K, R> mapValues(Map<? extends K, ? extends V> r10, Function1<? super Map.Entry<? extends K, ? extends V>, ? extends R> r11) {
        Intrinsics.checkNotNullParameter(r10, "<this>");
        Intrinsics.checkNotNullParameter(r11, "transform");
        LinkedHashMap r1 = new LinkedHashMap(MapsKt.mapCapacity(r10.size()));
        Iterator<T> r6 = r10.entrySet().iterator();
    L4:
        if (r6.hasNext() == false) goto L7;
        Object r7 = r6.next();
        r1.put(((Map.Entry) r7).getKey(), r11.invoke(r7));
        goto L4
    L7:
        return r1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <K, V, R> Map<R, V> mapKeys(Map<? extends K, ? extends V> r11, Function1<? super Map.Entry<? extends K, ? extends V>, ? extends R> r12) {
        Intrinsics.checkNotNullParameter(r11, "<this>");
        Intrinsics.checkNotNullParameter(r12, "transform");
        LinkedHashMap r1 = new LinkedHashMap(MapsKt.mapCapacity(r11.size()));
        Iterator<T> r6 = r11.entrySet().iterator();
    L4:
        if (r6.hasNext() == false) goto L7;
        Object r7 = r6.next();
        r1.put(r12.invoke(r7), ((Map.Entry) r7).getValue());
        goto L4
    L7:
        return r1;
    }

    public static final <K, V> Map<K, V> filterKeys(Map<? extends K, ? extends V> r6, Function1<? super K, Boolean> r7) {
        Intrinsics.checkNotNullParameter(r6, "<this>");
        Intrinsics.checkNotNullParameter(r7, "predicate");
        LinkedHashMap r1 = new LinkedHashMap();
        Iterator<Map.Entry<? extends K, ? extends V>> r2 = r6.entrySet().iterator();
    L4:
        if (r2.hasNext() == false) goto L9;
        Map.Entry<? extends K, ? extends V> r3 = r2.next();
        if (r7.invoke(r3.getKey()).booleanValue() == false) goto L4;
        r1.put(r3.getKey(), r3.getValue());
        goto L4
    L9:
        return r1;
    }

    public static final <K, V> Map<K, V> filterValues(Map<? extends K, ? extends V> r6, Function1<? super V, Boolean> r7) {
        Intrinsics.checkNotNullParameter(r6, "<this>");
        Intrinsics.checkNotNullParameter(r7, "predicate");
        LinkedHashMap r1 = new LinkedHashMap();
        Iterator<Map.Entry<? extends K, ? extends V>> r2 = r6.entrySet().iterator();
    L4:
        if (r2.hasNext() == false) goto L9;
        Map.Entry<? extends K, ? extends V> r3 = r2.next();
        if (r7.invoke(r3.getValue()).booleanValue() == false) goto L4;
        r1.put(r3.getKey(), r3.getValue());
        goto L4
    L9:
        return r1;
    }

    public static final <K, V, M extends Map<? super K, ? super V>> M filterTo(Map<? extends K, ? extends V> r5, M r6, Function1<? super Map.Entry<? extends K, ? extends V>, Boolean> r7) {
        Intrinsics.checkNotNullParameter(r5, "<this>");
        Intrinsics.checkNotNullParameter(r6, "destination");
        Intrinsics.checkNotNullParameter(r7, "predicate");
        Iterator<Map.Entry<? extends K, ? extends V>> r1 = r5.entrySet().iterator();
    L4:
        if (r1.hasNext() == false) goto L8;
        Map.Entry<? extends K, ? extends V> r2 = r1.next();
        if (r7.invoke(r2).booleanValue() == false) goto L4;
        r6.put(r2.getKey(), r2.getValue());
        goto L4
    L8:
        return r6;
    }

    public static final <K, V> Map<K, V> filter(Map<? extends K, ? extends V> r8, Function1<? super Map.Entry<? extends K, ? extends V>, Boolean> r9) {
        Intrinsics.checkNotNullParameter(r8, "<this>");
        Intrinsics.checkNotNullParameter(r9, "predicate");
        Map destination$iv = new LinkedHashMap();
        Iterator<Map.Entry<? extends K, ? extends V>> r4 = r8.entrySet().iterator();
    L4:
        if (r4.hasNext() == false) goto L9;
        Map.Entry<? extends K, ? extends V> r5 = r4.next();
        if (r9.invoke(r5).booleanValue() == false) goto L4;
        destination$iv.put(r5.getKey(), r5.getValue());
        goto L4
    L9:
        return destination$iv;
    }

    public static final <K, V, M extends Map<? super K, ? super V>> M filterNotTo(Map<? extends K, ? extends V> r5, M r6, Function1<? super Map.Entry<? extends K, ? extends V>, Boolean> r7) {
        Intrinsics.checkNotNullParameter(r5, "<this>");
        Intrinsics.checkNotNullParameter(r6, "destination");
        Intrinsics.checkNotNullParameter(r7, "predicate");
        Iterator<Map.Entry<? extends K, ? extends V>> r1 = r5.entrySet().iterator();
    L4:
        if (r1.hasNext() == false) goto L8;
        Map.Entry<? extends K, ? extends V> r2 = r1.next();
        if (r7.invoke(r2).booleanValue() == true) goto L4;
        r6.put(r2.getKey(), r2.getValue());
        goto L4
    L8:
        return r6;
    }

    public static final <K, V> Map<K, V> filterNot(Map<? extends K, ? extends V> r8, Function1<? super Map.Entry<? extends K, ? extends V>, Boolean> r9) {
        Intrinsics.checkNotNullParameter(r8, "<this>");
        Intrinsics.checkNotNullParameter(r9, "predicate");
        Map destination$iv = new LinkedHashMap();
        Iterator<Map.Entry<? extends K, ? extends V>> r4 = r8.entrySet().iterator();
    L4:
        if (r4.hasNext() == false) goto L9;
        Map.Entry<? extends K, ? extends V> r5 = r4.next();
        if (r9.invoke(r5).booleanValue() == true) goto L4;
        destination$iv.put(r5.getKey(), r5.getValue());
        goto L4
    L9:
        return destination$iv;
    }

    public static final <K, V> Map<K, V> toMap(Iterable<? extends Pair<? extends K, ? extends V>> r2) {
        Intrinsics.checkNotNullParameter(r2, "<this>");
        if ((r2 instanceof Collection) == false) goto L15;
        switch(((Collection) r2).size()) {
            case 0: goto L13;
            case 1: goto L8;
            default: goto L16;
        };
    L16:
        return MapsKt.toMap(r2, new LinkedHashMap(MapsKt.mapCapacity(((Collection) r2).size())));
    L8:
        if ((r2 instanceof List) == false) goto L10;
        Object r0 = ((List) r2).get(0);
    L17:
        return MapsKt.mapOf((Pair) r0);
    L10:
        r0 = ((Collection) r2).iterator().next();
        goto L17
    L13:
        return MapsKt.emptyMap();
    L15:
        return MapsKt.optimizeReadOnlyMap(MapsKt.toMap(r2, new LinkedHashMap()));
    }

    public static final <K, V, M extends Map<? super K, ? super V>> M toMap(Iterable<? extends Pair<? extends K, ? extends V>> r2, M r3) {
        Intrinsics.checkNotNullParameter(r2, "<this>");
        Intrinsics.checkNotNullParameter(r3, "destination");
        MapsKt.putAll(r3, r2);
        return r3;
    }

    public static final <K, V> Map<K, V> toMap(Pair<? extends K, ? extends V>[] r2) {
        Intrinsics.checkNotNullParameter(r2, "<this>");
        switch(r2.length) {
            case 0: goto L7;
            case 1: goto L9;
            default: goto L8;
        };
    L8:
        return MapsKt.toMap(r2, new LinkedHashMap(MapsKt.mapCapacity(r2.length)));
    L9:
        return MapsKt.mapOf(r2[0]);
    L7:
        return MapsKt.emptyMap();
    }

    public static final <K, V, M extends Map<? super K, ? super V>> M toMap(Pair<? extends K, ? extends V>[] r2, M r3) {
        Intrinsics.checkNotNullParameter(r2, "<this>");
        Intrinsics.checkNotNullParameter(r3, "destination");
        MapsKt.putAll(r3, r2);
        return r3;
    }

    public static final <K, V> Map<K, V> toMap(Sequence<? extends Pair<? extends K, ? extends V>> r1) {
        Intrinsics.checkNotNullParameter(r1, "<this>");
        return MapsKt.optimizeReadOnlyMap(MapsKt.toMap(r1, new LinkedHashMap()));
    }

    public static final <K, V, M extends Map<? super K, ? super V>> M toMap(Sequence<? extends Pair<? extends K, ? extends V>> r2, M r3) {
        Intrinsics.checkNotNullParameter(r2, "<this>");
        Intrinsics.checkNotNullParameter(r3, "destination");
        MapsKt.putAll(r3, r2);
        return r3;
    }

    public static final <K, V> Map<K, V> toMap(Map<? extends K, ? extends V> r1) {
        Intrinsics.checkNotNullParameter(r1, "<this>");
        switch(r1.size()) {
            case 0: goto L7;
            case 1: goto L9;
            default: goto L8;
        };
    L8:
        return MapsKt.toMutableMap(r1);
    L9:
        return MapsKt.toSingletonMap(r1);
    L7:
        return MapsKt.emptyMap();
    }

    public static final <K, V> Map<K, V> toMutableMap(Map<? extends K, ? extends V> r1) {
        Intrinsics.checkNotNullParameter(r1, "<this>");
        return new LinkedHashMap(r1);
    }

    public static final <K, V, M extends Map<? super K, ? super V>> M toMap(Map<? extends K, ? extends V> r2, M r3) {
        Intrinsics.checkNotNullParameter(r2, "<this>");
        Intrinsics.checkNotNullParameter(r3, "destination");
        r3.putAll(r2);
        return r3;
    }

    public static final <K, V> Map<K, V> plus(Map<? extends K, ? extends V> r5, Pair<? extends K, ? extends V> r6) {
        Intrinsics.checkNotNullParameter(r5, "<this>");
        Intrinsics.checkNotNullParameter(r6, "pair");
        if (r5.isEmpty() == true) goto L7;
        LinkedHashMap $this$plus_u24lambda_u248 = new LinkedHashMap(r5);
        $this$plus_u24lambda_u248.put(r6.getFirst(), r6.getSecond());
        return $this$plus_u24lambda_u248;
    L7:
        return MapsKt.mapOf(r6);
    }

    public static final <K, V> Map<K, V> plus(Map<? extends K, ? extends V> r4, Iterable<? extends Pair<? extends K, ? extends V>> r5) {
        Intrinsics.checkNotNullParameter(r4, "<this>");
        Intrinsics.checkNotNullParameter(r5, "pairs");
        if (r4.isEmpty() == true) goto L7;
        LinkedHashMap $this$plus_u24lambda_u249 = new LinkedHashMap(r4);
        MapsKt.putAll($this$plus_u24lambda_u249, r5);
        return $this$plus_u24lambda_u249;
    L7:
        return MapsKt.toMap(r5);
    }

    public static final <K, V> Map<K, V> plus(Map<? extends K, ? extends V> r4, Pair<? extends K, ? extends V>[] r5) {
        Intrinsics.checkNotNullParameter(r4, "<this>");
        Intrinsics.checkNotNullParameter(r5, "pairs");
        if (r4.isEmpty() == true) goto L7;
        LinkedHashMap $this$plus_u24lambda_u2410 = new LinkedHashMap(r4);
        MapsKt.putAll($this$plus_u24lambda_u2410, r5);
        return $this$plus_u24lambda_u2410;
    L7:
        return MapsKt.toMap(r5);
    }

    public static final <K, V> Map<K, V> plus(Map<? extends K, ? extends V> r4, Sequence<? extends Pair<? extends K, ? extends V>> r5) {
        Intrinsics.checkNotNullParameter(r4, "<this>");
        Intrinsics.checkNotNullParameter(r5, "pairs");
        LinkedHashMap $this$plus_u24lambda_u2411 = new LinkedHashMap(r4);
        MapsKt.putAll($this$plus_u24lambda_u2411, r5);
        return MapsKt.optimizeReadOnlyMap($this$plus_u24lambda_u2411);
    }

    public static final <K, V> Map<K, V> plus(Map<? extends K, ? extends V> r3, Map<? extends K, ? extends V> r4) {
        Intrinsics.checkNotNullParameter(r3, "<this>");
        Intrinsics.checkNotNullParameter(r4, "map");
        LinkedHashMap $this$plus_u24lambda_u2412 = new LinkedHashMap(r3);
        $this$plus_u24lambda_u2412.putAll(r4);
        return $this$plus_u24lambda_u2412;
    }

    private static final <K, V> void plusAssign(Map<? super K, ? super V> r2, Pair<? extends K, ? extends V> r3) {
        Intrinsics.checkNotNullParameter(r2, "<this>");
        Intrinsics.checkNotNullParameter(r3, "pair");
        r2.put(r3.getFirst(), r3.getSecond());
    }

    private static final <K, V> void plusAssign(Map<? super K, ? super V> r1, Iterable<? extends Pair<? extends K, ? extends V>> r2) {
        Intrinsics.checkNotNullParameter(r1, "<this>");
        Intrinsics.checkNotNullParameter(r2, "pairs");
        MapsKt.putAll(r1, r2);
    }

    private static final <K, V> void plusAssign(Map<? super K, ? super V> r1, Pair<? extends K, ? extends V>[] r2) {
        Intrinsics.checkNotNullParameter(r1, "<this>");
        Intrinsics.checkNotNullParameter(r2, "pairs");
        MapsKt.putAll(r1, r2);
    }

    private static final <K, V> void plusAssign(Map<? super K, ? super V> r1, Sequence<? extends Pair<? extends K, ? extends V>> r2) {
        Intrinsics.checkNotNullParameter(r1, "<this>");
        Intrinsics.checkNotNullParameter(r2, "pairs");
        MapsKt.putAll(r1, r2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final <K, V> void plusAssign(Map<? super K, ? super V> r1, Map<K, ? extends V> r2) {
        Intrinsics.checkNotNullParameter(r1, "<this>");
        Intrinsics.checkNotNullParameter(r2, "map");
        r1.putAll(r2);
    }

    public static final <K, V> Map<K, V> minus(Map<? extends K, ? extends V> r3, K r4) {
        Intrinsics.checkNotNullParameter(r3, "<this>");
        Map $this$minus_u24lambda_u2413 = MapsKt.toMutableMap(r3);
        $this$minus_u24lambda_u2413.remove(r4);
        return MapsKt.optimizeReadOnlyMap($this$minus_u24lambda_u2413);
    }

    public static final <K, V> Map<K, V> minus(Map<? extends K, ? extends V> r4, Iterable<? extends K> r5) {
        Intrinsics.checkNotNullParameter(r4, "<this>");
        Intrinsics.checkNotNullParameter(r5, "keys");
        Map $this$minus_u24lambda_u2414 = MapsKt.toMutableMap(r4);
        CollectionsKt.removeAll($this$minus_u24lambda_u2414.keySet(), r5);
        return MapsKt.optimizeReadOnlyMap($this$minus_u24lambda_u2414);
    }

    public static final <K, V> Map<K, V> minus(Map<? extends K, ? extends V> r4, K[] r5) {
        Intrinsics.checkNotNullParameter(r4, "<this>");
        Intrinsics.checkNotNullParameter(r5, "keys");
        Map $this$minus_u24lambda_u2415 = MapsKt.toMutableMap(r4);
        CollectionsKt.removeAll($this$minus_u24lambda_u2415.keySet(), r5);
        return MapsKt.optimizeReadOnlyMap($this$minus_u24lambda_u2415);
    }

    public static final <K, V> Map<K, V> minus(Map<? extends K, ? extends V> r4, Sequence<? extends K> r5) {
        Intrinsics.checkNotNullParameter(r4, "<this>");
        Intrinsics.checkNotNullParameter(r5, "keys");
        Map $this$minus_u24lambda_u2416 = MapsKt.toMutableMap(r4);
        CollectionsKt.removeAll($this$minus_u24lambda_u2416.keySet(), r5);
        return MapsKt.optimizeReadOnlyMap($this$minus_u24lambda_u2416);
    }

    private static final <K, V> void minusAssign(Map<K, V> r1, K r2) {
        Intrinsics.checkNotNullParameter(r1, "<this>");
        r1.remove(r2);
    }

    private static final <K, V> void minusAssign(Map<K, V> r1, Iterable<? extends K> r2) {
        Intrinsics.checkNotNullParameter(r1, "<this>");
        Intrinsics.checkNotNullParameter(r2, "keys");
        CollectionsKt.removeAll(r1.keySet(), r2);
    }

    private static final <K, V> void minusAssign(Map<K, V> r1, K[] r2) {
        Intrinsics.checkNotNullParameter(r1, "<this>");
        Intrinsics.checkNotNullParameter(r2, "keys");
        CollectionsKt.removeAll(r1.keySet(), r2);
    }

    private static final <K, V> void minusAssign(Map<K, V> r1, Sequence<? extends K> r2) {
        Intrinsics.checkNotNullParameter(r1, "<this>");
        Intrinsics.checkNotNullParameter(r2, "keys");
        CollectionsKt.removeAll(r1.keySet(), r2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <K, V> Map<K, V> optimizeReadOnlyMap(Map<K, ? extends V> r1) {
        Intrinsics.checkNotNullParameter(r1, "<this>");
        switch(r1.size()) {
            case 0: goto L7;
            case 1: goto L9;
            default: goto L8;
        };
    L8:
        return r1;
    L9:
        return MapsKt.toSingletonMap(r1);
    L7:
        return MapsKt.emptyMap();
    }
}
