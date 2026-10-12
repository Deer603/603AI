package kotlin.text;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ReplaceWith;
import kotlin.TuplesKt;
import kotlin.collections.ArraysKt;
import kotlin.collections.CharIterator;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntProgression;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequencesKt;

/* JADX INFO: compiled from: Strings.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0080\u0001\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\f\n\u0002\u0010\u000b\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0019\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\n\u001a$\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003H\u0086\bø\u0001\u0000\u001a$\u0010\u0000\u001a\u00020\u0006*\u00020\u00062\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003H\u0086\bø\u0001\u0000\u001a$\u0010\u0007\u001a\u00020\u0001*\u00020\u00012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003H\u0086\bø\u0001\u0000\u001a$\u0010\u0007\u001a\u00020\u0006*\u00020\u00062\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003H\u0086\bø\u0001\u0000\u001a$\u0010\b\u001a\u00020\u0001*\u00020\u00012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003H\u0086\bø\u0001\u0000\u001a$\u0010\b\u001a\u00020\u0006*\u00020\u00062\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003H\u0086\bø\u0001\u0000\u001a\u0016\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\n\u0010\t\u001a\u00020\n\"\u00020\u0004\u001a\u0016\u0010\u0000\u001a\u00020\u0006*\u00020\u00062\n\u0010\t\u001a\u00020\n\"\u00020\u0004\u001a\u0016\u0010\u0007\u001a\u00020\u0001*\u00020\u00012\n\u0010\t\u001a\u00020\n\"\u00020\u0004\u001a\u0016\u0010\u0007\u001a\u00020\u0006*\u00020\u00062\n\u0010\t\u001a\u00020\n\"\u00020\u0004\u001a\u0016\u0010\b\u001a\u00020\u0001*\u00020\u00012\n\u0010\t\u001a\u00020\n\"\u00020\u0004\u001a\u0016\u0010\b\u001a\u00020\u0006*\u00020\u00062\n\u0010\t\u001a\u00020\n\"\u00020\u0004\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0001\u001a\r\u0010\u0000\u001a\u00020\u0006*\u00020\u0006H\u0087\b\u001a\n\u0010\u0007\u001a\u00020\u0001*\u00020\u0001\u001a\r\u0010\u0007\u001a\u00020\u0006*\u00020\u0006H\u0087\b\u001a\n\u0010\b\u001a\u00020\u0001*\u00020\u0001\u001a\r\u0010\b\u001a\u00020\u0006*\u00020\u0006H\u0087\b\u001a\u001c\u0010\u000b\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u0004\u001a\u001c\u0010\u000b\u001a\u00020\u0006*\u00020\u00062\u0006\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u0004\u001a\u001c\u0010\u000f\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u0004\u001a\u001c\u0010\u000f\u001a\u00020\u0006*\u00020\u00062\u0006\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u0004\u001a \u0010\u0010\u001a\u00020\u0005*\u0004\u0018\u00010\u0001H\u0087\b\u0082\u0002\u000e\n\f\b\u0000\u0012\u0002\u0018\u0001\u001a\u0004\b\u0003\u0010\u0000\u001a\r\u0010\u0011\u001a\u00020\u0005*\u00020\u0001H\u0087\b\u001a\r\u0010\u0012\u001a\u00020\u0005*\u00020\u0001H\u0087\b\u001a\n\u0010\u0013\u001a\u00020\u0005*\u00020\u0001\u001a\r\u0010\u0014\u001a\u00020\u0005*\u00020\u0001H\u0087\b\u001a \u0010\u0015\u001a\u00020\u0005*\u0004\u0018\u00010\u0001H\u0087\b\u0082\u0002\u000e\n\f\b\u0000\u0012\u0002\u0018\u0001\u001a\u0004\b\u0003\u0010\u0000\u001a\r\u0010\u0016\u001a\u00020\u0017*\u00020\u0001H\u0086\u0002\u001a\u000f\u0010\u0018\u001a\u00020\u0006*\u0004\u0018\u00010\u0006H\u0087\b\u001aD\u0010\u0019\u001a\u0002H\u001a\"\f\b\u0000\u0010\u001b*\u00020\u0001*\u0002H\u001a\"\u0004\b\u0001\u0010\u001a*\u0002H\u001b2\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u0002H\u001a0\u001dH\u0087\bø\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0000¢\u0006\u0002\u0010\u001e\u001aD\u0010\u001f\u001a\u0002H\u001a\"\f\b\u0000\u0010\u001b*\u00020\u0001*\u0002H\u001a\"\u0004\b\u0001\u0010\u001a*\u0002H\u001b2\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u0002H\u001a0\u001dH\u0087\bø\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0000¢\u0006\u0002\u0010\u001e\u001a\u0012\u0010'\u001a\u00020\u0005*\u00020\u00012\u0006\u0010(\u001a\u00020\r\u001a\u0012\u0010)\u001a\u00020\u0006*\u00020\u00062\u0006\u0010*\u001a\u00020!\u001a\u0012\u0010+\u001a\u00020\u0001*\u00020\u00012\u0006\u0010*\u001a\u00020!\u001a\u001d\u0010+\u001a\u00020\u0001*\u00020\u00062\u0006\u0010,\u001a\u00020\r2\u0006\u0010-\u001a\u00020\rH\u0087\b\u001a\u001f\u0010)\u001a\u00020\u0006*\u00020\u00012\u0006\u0010.\u001a\u00020\r2\b\b\u0002\u0010/\u001a\u00020\rH\u0087\b\u001a\u0012\u0010)\u001a\u00020\u0006*\u00020\u00012\u0006\u0010*\u001a\u00020!\u001a\u001c\u00100\u001a\u00020\u0006*\u00020\u00062\u0006\u00101\u001a\u00020\u00042\b\b\u0002\u00102\u001a\u00020\u0006\u001a\u001c\u00100\u001a\u00020\u0006*\u00020\u00062\u0006\u00101\u001a\u00020\u00062\b\b\u0002\u00102\u001a\u00020\u0006\u001a\u001c\u00103\u001a\u00020\u0006*\u00020\u00062\u0006\u00101\u001a\u00020\u00042\b\b\u0002\u00102\u001a\u00020\u0006\u001a\u001c\u00103\u001a\u00020\u0006*\u00020\u00062\u0006\u00101\u001a\u00020\u00062\b\b\u0002\u00102\u001a\u00020\u0006\u001a\u001c\u00104\u001a\u00020\u0006*\u00020\u00062\u0006\u00101\u001a\u00020\u00042\b\b\u0002\u00102\u001a\u00020\u0006\u001a\u001c\u00104\u001a\u00020\u0006*\u00020\u00062\u0006\u00101\u001a\u00020\u00062\b\b\u0002\u00102\u001a\u00020\u0006\u001a\u001c\u00105\u001a\u00020\u0006*\u00020\u00062\u0006\u00101\u001a\u00020\u00042\b\b\u0002\u00102\u001a\u00020\u0006\u001a\u001c\u00105\u001a\u00020\u0006*\u00020\u00062\u0006\u00101\u001a\u00020\u00062\b\b\u0002\u00102\u001a\u00020\u0006\u001a\"\u00106\u001a\u00020\u0001*\u00020\u00012\u0006\u0010.\u001a\u00020\r2\u0006\u0010/\u001a\u00020\r2\u0006\u00107\u001a\u00020\u0001\u001a%\u00106\u001a\u00020\u0006*\u00020\u00062\u0006\u0010.\u001a\u00020\r2\u0006\u0010/\u001a\u00020\r2\u0006\u00107\u001a\u00020\u0001H\u0087\b\u001a\u001a\u00106\u001a\u00020\u0001*\u00020\u00012\u0006\u0010*\u001a\u00020!2\u0006\u00107\u001a\u00020\u0001\u001a\u001d\u00106\u001a\u00020\u0006*\u00020\u00062\u0006\u0010*\u001a\u00020!2\u0006\u00107\u001a\u00020\u0001H\u0087\b\u001a\u001a\u00108\u001a\u00020\u0001*\u00020\u00012\u0006\u0010.\u001a\u00020\r2\u0006\u0010/\u001a\u00020\r\u001a\u001d\u00108\u001a\u00020\u0006*\u00020\u00062\u0006\u0010.\u001a\u00020\r2\u0006\u0010/\u001a\u00020\rH\u0087\b\u001a\u0012\u00108\u001a\u00020\u0001*\u00020\u00012\u0006\u0010*\u001a\u00020!\u001a\u0015\u00108\u001a\u00020\u0006*\u00020\u00062\u0006\u0010*\u001a\u00020!H\u0087\b\u001a\u0012\u00109\u001a\u00020\u0001*\u00020\u00012\u0006\u0010:\u001a\u00020\u0001\u001a\u0012\u00109\u001a\u00020\u0006*\u00020\u00062\u0006\u0010:\u001a\u00020\u0001\u001a\u0012\u0010;\u001a\u00020\u0001*\u00020\u00012\u0006\u0010<\u001a\u00020\u0001\u001a\u0012\u0010;\u001a\u00020\u0006*\u00020\u00062\u0006\u0010<\u001a\u00020\u0001\u001a\u001a\u0010=\u001a\u00020\u0001*\u00020\u00012\u0006\u0010:\u001a\u00020\u00012\u0006\u0010<\u001a\u00020\u0001\u001a\u001a\u0010=\u001a\u00020\u0006*\u00020\u00062\u0006\u0010:\u001a\u00020\u00012\u0006\u0010<\u001a\u00020\u0001\u001a\u0012\u0010=\u001a\u00020\u0001*\u00020\u00012\u0006\u00101\u001a\u00020\u0001\u001a\u0012\u0010=\u001a\u00020\u0006*\u00020\u00062\u0006\u00101\u001a\u00020\u0001\u001a$\u0010>\u001a\u00020\u0006*\u00020\u00062\u0006\u00101\u001a\u00020\u00042\u0006\u00107\u001a\u00020\u00062\b\b\u0002\u00102\u001a\u00020\u0006\u001a$\u0010>\u001a\u00020\u0006*\u00020\u00062\u0006\u00101\u001a\u00020\u00062\u0006\u00107\u001a\u00020\u00062\b\b\u0002\u00102\u001a\u00020\u0006\u001a$\u0010?\u001a\u00020\u0006*\u00020\u00062\u0006\u00101\u001a\u00020\u00042\u0006\u00107\u001a\u00020\u00062\b\b\u0002\u00102\u001a\u00020\u0006\u001a$\u0010?\u001a\u00020\u0006*\u00020\u00062\u0006\u00101\u001a\u00020\u00062\u0006\u00107\u001a\u00020\u00062\b\b\u0002\u00102\u001a\u00020\u0006\u001a$\u0010@\u001a\u00020\u0006*\u00020\u00062\u0006\u00101\u001a\u00020\u00062\u0006\u00107\u001a\u00020\u00062\b\b\u0002\u00102\u001a\u00020\u0006\u001a$\u0010@\u001a\u00020\u0006*\u00020\u00062\u0006\u00101\u001a\u00020\u00042\u0006\u00107\u001a\u00020\u00062\b\b\u0002\u00102\u001a\u00020\u0006\u001a$\u0010A\u001a\u00020\u0006*\u00020\u00062\u0006\u00101\u001a\u00020\u00042\u0006\u00107\u001a\u00020\u00062\b\b\u0002\u00102\u001a\u00020\u0006\u001a$\u0010A\u001a\u00020\u0006*\u00020\u00062\u0006\u00101\u001a\u00020\u00062\u0006\u00107\u001a\u00020\u00062\b\b\u0002\u00102\u001a\u00020\u0006\u001a\u001d\u0010B\u001a\u00020\u0006*\u00020\u00012\u0006\u0010C\u001a\u00020D2\u0006\u00107\u001a\u00020\u0006H\u0087\b\u001a.\u0010B\u001a\u00020\u0006*\u00020\u00012\u0006\u0010C\u001a\u00020D2\u0014\b\b\u0010E\u001a\u000e\u0012\u0004\u0012\u00020F\u0012\u0004\u0012\u00020\u00010\u0003H\u0087\bø\u0001\u0000\u001a\u001d\u0010G\u001a\u00020\u0006*\u00020\u00012\u0006\u0010C\u001a\u00020D2\u0006\u00107\u001a\u00020\u0006H\u0087\b\u001a)\u0010H\u001a\u00020\u0006*\u00020\u00062\u0012\u0010E\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u0003H\u0087\bø\u0001\u0000¢\u0006\u0002\bI\u001a)\u0010H\u001a\u00020\u0006*\u00020\u00062\u0012\u0010E\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u0003H\u0087\bø\u0001\u0000¢\u0006\u0002\bJ\u001a\u0015\u0010K\u001a\u00020\u0005*\u00020\u00012\u0006\u0010C\u001a\u00020DH\u0087\f\u001a4\u0010L\u001a\u00020\u0005*\u00020\u00012\u0006\u0010M\u001a\u00020\r2\u0006\u0010N\u001a\u00020\u00012\u0006\u0010O\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010P\u001a\u00020\u0005H\u0000\u001a\u001c\u0010Q\u001a\u00020\u0005*\u00020\u00012\u0006\u0010R\u001a\u00020\u00042\b\b\u0002\u0010P\u001a\u00020\u0005\u001a\u001c\u0010S\u001a\u00020\u0005*\u00020\u00012\u0006\u0010R\u001a\u00020\u00042\b\b\u0002\u0010P\u001a\u00020\u0005\u001a\u001c\u0010Q\u001a\u00020\u0005*\u00020\u00012\u0006\u0010:\u001a\u00020\u00012\b\b\u0002\u0010P\u001a\u00020\u0005\u001a$\u0010Q\u001a\u00020\u0005*\u00020\u00012\u0006\u0010:\u001a\u00020\u00012\u0006\u0010.\u001a\u00020\r2\b\b\u0002\u0010P\u001a\u00020\u0005\u001a\u001c\u0010S\u001a\u00020\u0005*\u00020\u00012\u0006\u0010<\u001a\u00020\u00012\b\b\u0002\u0010P\u001a\u00020\u0005\u001a\u001c\u0010T\u001a\u00020\u0006*\u00020\u00012\u0006\u0010N\u001a\u00020\u00012\b\b\u0002\u0010P\u001a\u00020\u0005\u001a\u001c\u0010U\u001a\u00020\u0006*\u00020\u00012\u0006\u0010N\u001a\u00020\u00012\b\b\u0002\u0010P\u001a\u00020\u0005\u001a&\u0010V\u001a\u00020\r*\u00020\u00012\u0006\u0010\t\u001a\u00020\n2\b\b\u0002\u0010.\u001a\u00020\r2\b\b\u0002\u0010P\u001a\u00020\u0005\u001a&\u0010W\u001a\u00020\r*\u00020\u00012\u0006\u0010\t\u001a\u00020\n2\b\b\u0002\u0010.\u001a\u00020\r2\b\b\u0002\u0010P\u001a\u00020\u0005\u001a;\u0010X\u001a\u00020\r*\u00020\u00012\u0006\u0010N\u001a\u00020\u00012\u0006\u0010.\u001a\u00020\r2\u0006\u0010/\u001a\u00020\r2\u0006\u0010P\u001a\u00020\u00052\b\b\u0002\u0010Y\u001a\u00020\u0005H\u0002¢\u0006\u0002\bZ\u001aE\u0010[\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u0006\u0018\u00010\\*\u00020\u00012\f\u0010]\u001a\b\u0012\u0004\u0012\u00020\u00060^2\u0006\u0010.\u001a\u00020\r2\u0006\u0010P\u001a\u00020\u00052\u0006\u0010Y\u001a\u00020\u0005H\u0002¢\u0006\u0002\b_\u001a:\u0010[\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u0006\u0018\u00010\\*\u00020\u00012\f\u0010]\u001a\b\u0012\u0004\u0012\u00020\u00060^2\b\b\u0002\u0010.\u001a\u00020\r2\b\b\u0002\u0010P\u001a\u00020\u0005\u001a:\u0010`\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u0006\u0018\u00010\\*\u00020\u00012\f\u0010]\u001a\b\u0012\u0004\u0012\u00020\u00060^2\b\b\u0002\u0010.\u001a\u00020\r2\b\b\u0002\u0010P\u001a\u00020\u0005\u001a,\u0010V\u001a\u00020\r*\u00020\u00012\f\u0010]\u001a\b\u0012\u0004\u0012\u00020\u00060^2\b\b\u0002\u0010.\u001a\u00020\r2\b\b\u0002\u0010P\u001a\u00020\u0005\u001a,\u0010W\u001a\u00020\r*\u00020\u00012\f\u0010]\u001a\b\u0012\u0004\u0012\u00020\u00060^2\b\b\u0002\u0010.\u001a\u00020\r2\b\b\u0002\u0010P\u001a\u00020\u0005\u001a&\u0010X\u001a\u00020\r*\u00020\u00012\u0006\u0010R\u001a\u00020\u00042\b\b\u0002\u0010.\u001a\u00020\r2\b\b\u0002\u0010P\u001a\u00020\u0005\u001a&\u0010X\u001a\u00020\r*\u00020\u00012\u0006\u0010a\u001a\u00020\u00062\b\b\u0002\u0010.\u001a\u00020\r2\b\b\u0002\u0010P\u001a\u00020\u0005\u001a&\u0010b\u001a\u00020\r*\u00020\u00012\u0006\u0010R\u001a\u00020\u00042\b\b\u0002\u0010.\u001a\u00020\r2\b\b\u0002\u0010P\u001a\u00020\u0005\u001a&\u0010b\u001a\u00020\r*\u00020\u00012\u0006\u0010a\u001a\u00020\u00062\b\b\u0002\u0010.\u001a\u00020\r2\b\b\u0002\u0010P\u001a\u00020\u0005\u001a\u001f\u0010c\u001a\u00020\u0005*\u00020\u00012\u0006\u0010N\u001a\u00020\u00012\b\b\u0002\u0010P\u001a\u00020\u0005H\u0086\u0002\u001a\u001f\u0010c\u001a\u00020\u0005*\u00020\u00012\u0006\u0010R\u001a\u00020\u00042\b\b\u0002\u0010P\u001a\u00020\u0005H\u0086\u0002\u001a\u0015\u0010c\u001a\u00020\u0005*\u00020\u00012\u0006\u0010C\u001a\u00020DH\u0087\n\u001a=\u0010d\u001a\b\u0012\u0004\u0012\u00020!0e*\u00020\u00012\u0006\u0010f\u001a\u00020\n2\b\b\u0002\u0010.\u001a\u00020\r2\b\b\u0002\u0010P\u001a\u00020\u00052\b\b\u0002\u0010g\u001a\u00020\rH\u0002¢\u0006\u0002\bh\u001aG\u0010d\u001a\b\u0012\u0004\u0012\u00020!0e*\u00020\u00012\u000e\u0010f\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00060i2\b\b\u0002\u0010.\u001a\u00020\r2\b\b\u0002\u0010P\u001a\u00020\u00052\b\b\u0002\u0010g\u001a\u00020\rH\u0002¢\u0006\u0004\bh\u0010j\u001a\u0010\u0010k\u001a\u00020l2\u0006\u0010g\u001a\u00020\rH\u0000\u001a=\u0010m\u001a\b\u0012\u0004\u0012\u00020\u00060e*\u00020\u00012\u0012\u0010f\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00060i\"\u00020\u00062\b\b\u0002\u0010P\u001a\u00020\u00052\b\b\u0002\u0010g\u001a\u00020\r¢\u0006\u0002\u0010n\u001a=\u0010o\u001a\b\u0012\u0004\u0012\u00020\u00060p*\u00020\u00012\u0012\u0010f\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00060i\"\u00020\u00062\b\b\u0002\u0010P\u001a\u00020\u00052\b\b\u0002\u0010g\u001a\u00020\r¢\u0006\u0002\u0010q\u001a0\u0010m\u001a\b\u0012\u0004\u0012\u00020\u00060e*\u00020\u00012\n\u0010f\u001a\u00020\n\"\u00020\u00042\b\b\u0002\u0010P\u001a\u00020\u00052\b\b\u0002\u0010g\u001a\u00020\r\u001a0\u0010o\u001a\b\u0012\u0004\u0012\u00020\u00060p*\u00020\u00012\n\u0010f\u001a\u00020\n\"\u00020\u00042\b\b\u0002\u0010P\u001a\u00020\u00052\b\b\u0002\u0010g\u001a\u00020\r\u001a/\u0010o\u001a\b\u0012\u0004\u0012\u00020\u00060p*\u00020\u00012\u0006\u00101\u001a\u00020\u00062\u0006\u0010P\u001a\u00020\u00052\u0006\u0010g\u001a\u00020\rH\u0002¢\u0006\u0002\br\u001a%\u0010o\u001a\b\u0012\u0004\u0012\u00020\u00060p*\u00020\u00012\u0006\u0010C\u001a\u00020D2\b\b\u0002\u0010g\u001a\u00020\rH\u0087\b\u001a%\u0010m\u001a\b\u0012\u0004\u0012\u00020\u00060e*\u00020\u00012\u0006\u0010C\u001a\u00020D2\b\b\u0002\u0010g\u001a\u00020\rH\u0087\b\u001a\u0010\u0010s\u001a\b\u0012\u0004\u0012\u00020\u00060e*\u00020\u0001\u001a\u0010\u0010t\u001a\b\u0012\u0004\u0012\u00020\u00060p*\u00020\u0001\u001a\u0018\u0010u\u001a\u00020\u0005*\u0004\u0018\u00010\u00012\b\u0010N\u001a\u0004\u0018\u00010\u0001H\u0000\u001a\u0018\u0010v\u001a\u00020\u0005*\u0004\u0018\u00010\u00012\b\u0010N\u001a\u0004\u0018\u00010\u0001H\u0000\u001a\f\u0010w\u001a\u00020\u0005*\u00020\u0006H\u0007\u001a\u0013\u0010x\u001a\u0004\u0018\u00010\u0005*\u00020\u0006H\u0007¢\u0006\u0002\u0010y\"\u0015\u0010 \u001a\u00020!*\u00020\u00018F¢\u0006\u0006\u001a\u0004\b\"\u0010#\"\u0015\u0010$\u001a\u00020\r*\u00020\u00018F¢\u0006\u0006\u001a\u0004\b%\u0010&\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006z"}, d2 = {"trim", "", "predicate", "Lkotlin/Function1;", "", "", "", "trimStart", "trimEnd", "chars", "", "padStart", "length", "", "padChar", "padEnd", "isNullOrEmpty", "isEmpty", "isNotEmpty", "isBlank", "isNotBlank", "isNullOrBlank", "iterator", "Lkotlin/collections/CharIterator;", "orEmpty", "ifEmpty", "R", "C", "defaultValue", "Lkotlin/Function0;", "(Ljava/lang/CharSequence;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "ifBlank", "indices", "Lkotlin/ranges/IntRange;", "getIndices", "(Ljava/lang/CharSequence;)Lkotlin/ranges/IntRange;", "lastIndex", "getLastIndex", "(Ljava/lang/CharSequence;)I", "hasSurrogatePairAt", "index", "substring", "range", "subSequence", "start", "end", "startIndex", "endIndex", "substringBefore", "delimiter", "missingDelimiterValue", "substringAfter", "substringBeforeLast", "substringAfterLast", "replaceRange", "replacement", "removeRange", "removePrefix", "prefix", "removeSuffix", "suffix", "removeSurrounding", "replaceBefore", "replaceAfter", "replaceAfterLast", "replaceBeforeLast", "replace", "regex", "Lkotlin/text/Regex;", "transform", "Lkotlin/text/MatchResult;", "replaceFirst", "replaceFirstChar", "replaceFirstCharWithChar", "replaceFirstCharWithCharSequence", "matches", "regionMatchesImpl", "thisOffset", "other", "otherOffset", "ignoreCase", "startsWith", "char", "endsWith", "commonPrefixWith", "commonSuffixWith", "indexOfAny", "lastIndexOfAny", "indexOf", "last", "indexOf$StringsKt__StringsKt", "findAnyOf", "Lkotlin/Pair;", "strings", "", "findAnyOf$StringsKt__StringsKt", "findLastAnyOf", "string", "lastIndexOf", "contains", "rangesDelimitedBy", "Lkotlin/sequences/Sequence;", "delimiters", "limit", "rangesDelimitedBy$StringsKt__StringsKt", "", "(Ljava/lang/CharSequence;[Ljava/lang/String;IZI)Lkotlin/sequences/Sequence;", "requireNonNegativeLimit", "", "splitToSequence", "(Ljava/lang/CharSequence;[Ljava/lang/String;ZI)Lkotlin/sequences/Sequence;", "split", "", "(Ljava/lang/CharSequence;[Ljava/lang/String;ZI)Ljava/util/List;", "split$StringsKt__StringsKt", "lineSequence", "lines", "contentEqualsIgnoreCaseImpl", "contentEqualsImpl", "toBooleanStrict", "toBooleanStrictOrNull", "(Ljava/lang/String;)Ljava/lang/Boolean;", "kotlin-stdlib"}, k = 5, mv = {2, 2, 0}, xi = 49, xs = "kotlin/text/StringsKt")
class StringsKt__StringsKt extends StringsKt__StringsJVMKt {
    public static /* synthetic */ Pair $r8$lambda$47p96K3L7I8wwKaOktkrnu8Fn3c(List r0, boolean r1, CharSequence r2, int r3) {
        return rangesDelimitedBy$lambda$16$StringsKt__StringsKt(r0, r1, r2, r3);
    }

    public static /* synthetic */ String $r8$lambda$OL4DSBm4SkIFRMQcEy4khBbhk_4(CharSequence r0, IntRange r1) {
        return splitToSequence$lambda$18$StringsKt__StringsKt(r0, r1);
    }

    public static /* synthetic */ Pair $r8$lambda$khMEFDjIj766SCh5THQNoen7fI8(char[] r0, boolean r1, CharSequence r2, int r3) {
        return rangesDelimitedBy$lambda$14$StringsKt__StringsKt(r0, r1, r2, r3);
    }

    /* JADX INFO: renamed from: $r8$lambda$omNPivlTjTSpoVPpZkGl-Ri0Hnk, reason: not valid java name */
    public static /* synthetic */ String m8728$r8$lambda$omNPivlTjTSpoVPpZkGlRi0Hnk(CharSequence r0, IntRange r1) {
        return splitToSequence$lambda$20$StringsKt__StringsKt(r0, r1);
    }

    public StringsKt__StringsKt() {
    }

    public static final CharSequence trim(CharSequence $this$trim, Function1<? super Character, Boolean> r7) {
        Intrinsics.checkNotNullParameter($this$trim, "<this>");
        Intrinsics.checkNotNullParameter(r7, "predicate");
        int startIndex = 0;
        int endIndex = $this$trim.length() - 1;
        boolean startFound = false;
    L3:
        if (startIndex > endIndex) goto L16;
        if (startFound == true) goto L6;
        int index = startIndex;
    L7:
        boolean match = r7.invoke(Character.valueOf($this$trim.charAt(index))).booleanValue();
        if (startFound == false) goto L9;
        if (match == false) goto L16;
        endIndex = endIndex - 1;
        goto L3
    L9:
        if (match == false) goto L10;
        startIndex = startIndex + 1;
        goto L3
    L10:
        startFound = true;
        goto L3
    L6:
        index = endIndex;
    L16:
        return $this$trim.subSequence(startIndex, endIndex + 1);
    }

    public static final String trim(String $this$trim, Function1<? super Character, Boolean> r9) {
        Intrinsics.checkNotNullParameter($this$trim, "<this>");
        Intrinsics.checkNotNullParameter(r9, "predicate");
        String $this$trim$iv = $this$trim;
        int startIndex$iv = 0;
        int endIndex$iv = $this$trim$iv.length() - 1;
        boolean startFound$iv = false;
    L3:
        if (startIndex$iv > endIndex$iv) goto L16;
        if (startFound$iv == true) goto L6;
        int index$iv = startIndex$iv;
    L7:
        boolean match$iv = r9.invoke(Character.valueOf($this$trim$iv.charAt(index$iv))).booleanValue();
        if (startFound$iv == false) goto L9;
        if (match$iv == false) goto L16;
        endIndex$iv = endIndex$iv - 1;
        goto L3
    L9:
        if (match$iv == false) goto L10;
        startIndex$iv = startIndex$iv + 1;
        goto L3
    L10:
        startFound$iv = true;
        goto L3
    L6:
        index$iv = endIndex$iv;
    L16:
        return $this$trim$iv.subSequence(startIndex$iv, endIndex$iv + 1).toString();
    }

    public static final CharSequence trimStart(CharSequence $this$trimStart, Function1<? super Character, Boolean> r5) {
        Intrinsics.checkNotNullParameter($this$trimStart, "<this>");
        Intrinsics.checkNotNullParameter(r5, "predicate");
        int index = 0;
        int r2 = $this$trimStart.length();
    L3:
        if (index >= r2) goto L10;
        if (r5.invoke(Character.valueOf($this$trimStart.charAt(index))).booleanValue() == false) goto L7;
        index = index + 1;
        goto L3
    L7:
        return $this$trimStart.subSequence(index, $this$trimStart.length());
    L10:
        return "";
    }

    public static final String trimStart(String $this$trimStart, Function1<? super Character, Boolean> r7) {
        Intrinsics.checkNotNullParameter($this$trimStart, "<this>");
        Intrinsics.checkNotNullParameter(r7, "predicate");
        String $this$trimStart$iv = $this$trimStart;
        int index$iv = 0;
        int r4 = $this$trimStart$iv.length();
    L3:
        if (index$iv >= r4) goto L8;
        if (r7.invoke(Character.valueOf($this$trimStart$iv.charAt(index$iv))).booleanValue() == false) goto L6;
        index$iv = index$iv + 1;
        goto L3
    L6:
        String r5 = $this$trimStart$iv.subSequence(index$iv, $this$trimStart$iv.length());
    L10:
        return r5.toString();
    L8:
        goto L10
    }

    public static final CharSequence trimEnd(CharSequence $this$trimEnd, Function1<? super Character, Boolean> r5) {
        Intrinsics.checkNotNullParameter($this$trimEnd, "<this>");
        Intrinsics.checkNotNullParameter(r5, "predicate");
        int r1 = $this$trimEnd.length() - 1;
        if (r1 < 0) goto L10;
    L4:
        int index = r1;
        r1 = r1 - 1;
        if (r5.invoke(Character.valueOf($this$trimEnd.charAt(index))).booleanValue() == false) goto L7;
        if (r1 >= 0) goto L4;
    L7:
        return $this$trimEnd.subSequence(0, index + 1);
    L10:
        return "";
    }

    public static final String trimEnd(String $this$trimEnd, Function1<? super Character, Boolean> r7) {
        Intrinsics.checkNotNullParameter($this$trimEnd, "<this>");
        Intrinsics.checkNotNullParameter(r7, "predicate");
        String $this$trimEnd$iv = $this$trimEnd;
        int r3 = $this$trimEnd$iv.length() - 1;
        if (r3 < 0) goto L8;
    L4:
        int index$iv = r3;
        r3 = r3 - 1;
        if (r7.invoke(Character.valueOf($this$trimEnd$iv.charAt(index$iv))).booleanValue() == false) goto L6;
        if (r3 >= 0) goto L4;
    L6:
        String r4 = $this$trimEnd$iv.subSequence(0, index$iv + 1);
    L10:
        return r4.toString();
    L8:
        goto L10
    }

    public static final CharSequence trim(CharSequence $this$trim, char... chars) {
        Intrinsics.checkNotNullParameter($this$trim, "<this>");
        Intrinsics.checkNotNullParameter(chars, "chars");
        int startIndex$iv = 0;
        int endIndex$iv = $this$trim.length() - 1;
        boolean startFound$iv = false;
    L3:
        if (startIndex$iv > endIndex$iv) goto L15;
        if (startFound$iv == true) goto L6;
        int index$iv = startIndex$iv;
    L7:
        char it = $this$trim.charAt(index$iv);
        boolean match$iv = ArraysKt.contains(chars, it);
        if (startFound$iv == false) goto L9;
        if (match$iv == false) goto L15;
        endIndex$iv = endIndex$iv - 1;
        goto L3
    L9:
        if (match$iv == false) goto L10;
        startIndex$iv = startIndex$iv + 1;
        goto L3
    L10:
        startFound$iv = true;
        goto L3
    L6:
        index$iv = endIndex$iv;
    L15:
        CharSequence $this$trim$iv = $this$trim.subSequence(startIndex$iv, endIndex$iv + 1);
        return $this$trim$iv;
    }

    public static final String trim(String $this$trim, char... chars) {
        Intrinsics.checkNotNullParameter($this$trim, "<this>");
        Intrinsics.checkNotNullParameter(chars, "chars");
        String $this$trim$iv$iv = $this$trim;
        int startIndex$iv$iv = 0;
        int endIndex$iv$iv = $this$trim$iv$iv.length() - 1;
        boolean startFound$iv$iv = false;
    L3:
        if (startIndex$iv$iv > endIndex$iv$iv) goto L15;
        if (startFound$iv$iv == true) goto L6;
        int index$iv$iv = startIndex$iv$iv;
    L7:
        char it = $this$trim$iv$iv.charAt(index$iv$iv);
        boolean match$iv$iv = ArraysKt.contains(chars, it);
        if (startFound$iv$iv == false) goto L9;
        if (match$iv$iv == false) goto L15;
        endIndex$iv$iv = endIndex$iv$iv - 1;
        goto L3
    L9:
        if (match$iv$iv == false) goto L10;
        startIndex$iv$iv = startIndex$iv$iv + 1;
        goto L3
    L10:
        startFound$iv$iv = true;
        goto L3
    L6:
        index$iv$iv = endIndex$iv$iv;
    L15:
        String $this$trim$iv = $this$trim$iv$iv.subSequence(startIndex$iv$iv, endIndex$iv$iv + 1).toString();
        return $this$trim$iv;
    }

    public static final CharSequence trimStart(CharSequence $this$trimStart, char... chars) {
        Intrinsics.checkNotNullParameter($this$trimStart, "<this>");
        Intrinsics.checkNotNullParameter(chars, "chars");
        int index$iv = 0;
        int r3 = $this$trimStart.length();
    L3:
        if (index$iv >= r3) goto L9;
        char it = $this$trimStart.charAt(index$iv);
        if (ArraysKt.contains(chars, it) == false) goto L12;
        index$iv = index$iv + 1;
        goto L3
    L12:
        return $this$trimStart.subSequence(index$iv, $this$trimStart.length());
    L9:
        return "";
    }

    public static final String trimStart(String $this$trimStart, char... chars) {
        Intrinsics.checkNotNullParameter($this$trimStart, "<this>");
        Intrinsics.checkNotNullParameter(chars, "chars");
        String $this$trimStart$iv$iv = $this$trimStart;
        int index$iv$iv = 0;
        int r5 = $this$trimStart$iv$iv.length();
    L3:
        if (index$iv$iv >= r5) goto L8;
        char it = $this$trimStart$iv$iv.charAt(index$iv$iv);
        if (ArraysKt.contains(chars, it) == false) goto L6;
        index$iv$iv = index$iv$iv + 1;
        goto L3
    L6:
        String r6 = $this$trimStart$iv$iv.subSequence(index$iv$iv, $this$trimStart$iv$iv.length());
    L9:
        String $this$trimStart$iv = r6.toString();
        return $this$trimStart$iv;
    L8:
        goto L9
    }

    public static final CharSequence trimEnd(CharSequence $this$trimEnd, char... chars) {
        Intrinsics.checkNotNullParameter($this$trimEnd, "<this>");
        Intrinsics.checkNotNullParameter(chars, "chars");
        int r2 = $this$trimEnd.length() - 1;
        if (r2 < 0) goto L9;
    L4:
        int index$iv = r2;
        r2 = r2 - 1;
        char it = $this$trimEnd.charAt(index$iv);
        if (ArraysKt.contains(chars, it) == false) goto L13;
        if (r2 >= 0) goto L4;
    L13:
        return $this$trimEnd.subSequence(0, index$iv + 1);
    L9:
        return "";
    }

    public static final String trimEnd(String $this$trimEnd, char... chars) {
        Intrinsics.checkNotNullParameter($this$trimEnd, "<this>");
        Intrinsics.checkNotNullParameter(chars, "chars");
        String $this$trimEnd$iv$iv = $this$trimEnd;
        int r4 = $this$trimEnd$iv$iv.length() - 1;
        if (r4 < 0) goto L8;
    L4:
        int index$iv$iv = r4;
        r4 = r4 - 1;
        char it = $this$trimEnd$iv$iv.charAt(index$iv$iv);
        if (ArraysKt.contains(chars, it) == false) goto L6;
        if (r4 >= 0) goto L4;
    L6:
        String r5 = $this$trimEnd$iv$iv.subSequence(0, index$iv$iv + 1);
    L9:
        String $this$trimEnd$iv = r5.toString();
        return $this$trimEnd$iv;
    L8:
        goto L9
    }

    public static final CharSequence trim(CharSequence $this$trim) {
        Intrinsics.checkNotNullParameter($this$trim, "<this>");
        int startIndex$iv = 0;
        int endIndex$iv = $this$trim.length() - 1;
        boolean startFound$iv = false;
    L3:
        if (startIndex$iv > endIndex$iv) goto L15;
        if (startFound$iv == true) goto L6;
        int index$iv = startIndex$iv;
    L7:
        char p0 = $this$trim.charAt(index$iv);
        boolean match$iv = CharsKt.isWhitespace(p0);
        if (startFound$iv == false) goto L9;
        if (match$iv == false) goto L15;
        endIndex$iv = endIndex$iv - 1;
        goto L3
    L9:
        if (match$iv == false) goto L10;
        startIndex$iv = startIndex$iv + 1;
        goto L3
    L10:
        startFound$iv = true;
        goto L3
    L6:
        index$iv = endIndex$iv;
    L15:
        CharSequence $this$trim$iv = $this$trim.subSequence(startIndex$iv, endIndex$iv + 1);
        return $this$trim$iv;
    }

    private static final String trim(String $this$trim) {
        Intrinsics.checkNotNullParameter($this$trim, "<this>");
        return StringsKt.trim($this$trim).toString();
    }

    public static final CharSequence trimStart(CharSequence $this$trimStart) {
        Intrinsics.checkNotNullParameter($this$trimStart, "<this>");
        int index$iv = 0;
        int r3 = $this$trimStart.length();
    L3:
        if (index$iv >= r3) goto L9;
        char p0 = $this$trimStart.charAt(index$iv);
        if (CharsKt.isWhitespace(p0) == false) goto L12;
        index$iv = index$iv + 1;
        goto L3
    L12:
        return $this$trimStart.subSequence(index$iv, $this$trimStart.length());
    L9:
        return "";
    }

    private static final String trimStart(String $this$trimStart) {
        Intrinsics.checkNotNullParameter($this$trimStart, "<this>");
        return StringsKt.trimStart($this$trimStart).toString();
    }

    public static final CharSequence trimEnd(CharSequence $this$trimEnd) {
        Intrinsics.checkNotNullParameter($this$trimEnd, "<this>");
        int r2 = $this$trimEnd.length() - 1;
        if (r2 < 0) goto L9;
    L4:
        int index$iv = r2;
        r2 = r2 - 1;
        char p0 = $this$trimEnd.charAt(index$iv);
        if (CharsKt.isWhitespace(p0) == false) goto L13;
        if (r2 >= 0) goto L4;
    L13:
        return $this$trimEnd.subSequence(0, index$iv + 1);
    L9:
        return "";
    }

    private static final String trimEnd(String $this$trimEnd) {
        Intrinsics.checkNotNullParameter($this$trimEnd, "<this>");
        return StringsKt.trimEnd($this$trimEnd).toString();
    }

    public static /* synthetic */ CharSequence padStart$default(CharSequence r0, int r1, char r2, int r3, Object r4) {
        if ((r3 & 2) == 0) goto L6;
        r2 = ' ';
    L6:
        return StringsKt.padStart(r0, r1, r2);
    }

    public static final CharSequence padStart(CharSequence $this$padStart, int length, char padChar) {
        Intrinsics.checkNotNullParameter($this$padStart, "<this>");
        if (length < 0) goto L16;
        if (length <= $this$padStart.length()) goto L7;
        StringBuilder sb = new StringBuilder(length);
        int i = 1;
        int r2 = length - $this$padStart.length();
        if (1 > r2) goto L13;
    L10:
        sb.append(padChar);
        if (i == r2) goto L13;
        i = i + 1;
    L13:
        sb.append($this$padStart);
        return sb;
    L7:
        return $this$padStart.subSequence(0, $this$padStart.length());
    L16:
        throw new IllegalArgumentException("Desired length " + length + " is less than zero.");
    }

    public static /* synthetic */ String padStart$default(String r0, int r1, char r2, int r3, Object r4) {
        if ((r3 & 2) == 0) goto L6;
        r2 = ' ';
    L6:
        return StringsKt.padStart(r0, r1, r2);
    }

    public static final String padStart(String $this$padStart, int length, char padChar) {
        Intrinsics.checkNotNullParameter($this$padStart, "<this>");
        return StringsKt.padStart($this$padStart, length, padChar).toString();
    }

    public static /* synthetic */ CharSequence padEnd$default(CharSequence r0, int r1, char r2, int r3, Object r4) {
        if ((r3 & 2) == 0) goto L6;
        r2 = ' ';
    L6:
        return StringsKt.padEnd(r0, r1, r2);
    }

    public static final CharSequence padEnd(CharSequence $this$padEnd, int length, char padChar) {
        Intrinsics.checkNotNullParameter($this$padEnd, "<this>");
        if (length < 0) goto L16;
        if (length <= $this$padEnd.length()) goto L7;
        StringBuilder sb = new StringBuilder(length);
        sb.append($this$padEnd);
        int i = 1;
        int r2 = length - $this$padEnd.length();
        if (1 > r2) goto L14;
    L10:
        sb.append(padChar);
        if (i == r2) goto L14;
        i = i + 1;
    L14:
        return sb;
    L7:
        return $this$padEnd.subSequence(0, $this$padEnd.length());
    L16:
        throw new IllegalArgumentException("Desired length " + length + " is less than zero.");
    }

    public static /* synthetic */ String padEnd$default(String r0, int r1, char r2, int r3, Object r4) {
        if ((r3 & 2) == 0) goto L6;
        r2 = ' ';
    L6:
        return StringsKt.padEnd(r0, r1, r2);
    }

    public static final String padEnd(String $this$padEnd, int length, char padChar) {
        Intrinsics.checkNotNullParameter($this$padEnd, "<this>");
        return StringsKt.padEnd($this$padEnd, length, padChar).toString();
    }

    private static final boolean isNullOrEmpty(CharSequence $this$isNullOrEmpty) {
        if ($this$isNullOrEmpty != null) goto L4;
    L7:
        return true;
    L4:
        if ($this$isNullOrEmpty.length() == 0) goto L7;
        return false;
    }

    private static final boolean isEmpty(CharSequence $this$isEmpty) {
        Intrinsics.checkNotNullParameter($this$isEmpty, "<this>");
        if ($this$isEmpty.length() != 0) goto L5;
        return true;
    L5:
        return false;
    }

    private static final boolean isNotEmpty(CharSequence $this$isNotEmpty) {
        Intrinsics.checkNotNullParameter($this$isNotEmpty, "<this>");
        if ($this$isNotEmpty.length() <= 0) goto L5;
        return true;
    L5:
        return false;
    }

    public static final boolean isBlank(CharSequence $this$isBlank) {
        Intrinsics.checkNotNullParameter($this$isBlank, "<this>");
        int r3 = 0;
    L4:
        if (r3 >= $this$isBlank.length()) goto L9;
        char element$iv = $this$isBlank.charAt(r3);
        if (CharsKt.isWhitespace(element$iv) == false) goto L13;
        r3 = r3 + 1;
        goto L4
    L13:
        return false;
    L9:
        return true;
    }

    private static final boolean isNotBlank(CharSequence $this$isNotBlank) {
        Intrinsics.checkNotNullParameter($this$isNotBlank, "<this>");
        return !StringsKt.isBlank($this$isNotBlank);
    }

    private static final boolean isNullOrBlank(CharSequence $this$isNullOrBlank) {
        if ($this$isNullOrBlank != null) goto L4;
    L7:
        return true;
    L4:
        if (StringsKt.isBlank($this$isNullOrBlank) == true) goto L7;
        return false;
    }

    public static final CharIterator iterator(final CharSequence $this$iterator) {
        Intrinsics.checkNotNullParameter($this$iterator, "<this>");
        return new AnonymousClass1($this$iterator);
    }

    private static final String orEmpty(String $this$orEmpty) {
        if ($this$orEmpty != null) goto L5;
        return "";
    L5:
        return $this$orEmpty;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final <C extends CharSequence & R, R> R ifEmpty(C r1, Function0<? extends R> r2) {
        Intrinsics.checkNotNullParameter(r2, "defaultValue");
        if (r1.length() != 0) goto L5;
        boolean r0 = true;
    L6:
        if (r0 == false) goto L9;
        return r2.invoke();
    L9:
        return r1;
    L5:
        r0 = false;
        goto L6
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final <C extends CharSequence & R, R> R ifBlank(C r1, Function0<? extends R> r2) {
        Intrinsics.checkNotNullParameter(r2, "defaultValue");
        if (StringsKt.isBlank(r1) == false) goto L6;
        return r2.invoke();
    L6:
        return r1;
    }

    public static final IntRange getIndices(CharSequence $this$indices) {
        Intrinsics.checkNotNullParameter($this$indices, "<this>");
        return new IntRange(0, $this$indices.length() - 1);
    }

    public static final int getLastIndex(CharSequence $this$lastIndex) {
        Intrinsics.checkNotNullParameter($this$lastIndex, "<this>");
        return $this$lastIndex.length() - 1;
    }

    public static final boolean hasSurrogatePairAt(CharSequence $this$hasSurrogatePairAt, int index) {
        Intrinsics.checkNotNullParameter($this$hasSurrogatePairAt, "<this>");
        if (index >= 0) goto L5;
    L7:
        boolean r2 = false;
    L8:
        if (r2 == false) goto L15;
        if (Character.isHighSurrogate($this$hasSurrogatePairAt.charAt(index)) == false) goto L15;
        if (Character.isLowSurrogate($this$hasSurrogatePairAt.charAt(index + 1)) == false) goto L15;
        return true;
    L15:
        return false;
    L5:
        if (index > ($this$hasSurrogatePairAt.length() - 2)) goto L7;
        r2 = true;
        goto L8
    }

    public static final String substring(String $this$substring, IntRange range) {
        Intrinsics.checkNotNullParameter($this$substring, "<this>");
        Intrinsics.checkNotNullParameter(range, "range");
        String r0 = $this$substring.substring(range.getStart().intValue(), range.getEndInclusive().intValue() + 1);
        Intrinsics.checkNotNullExpressionValue(r0, "substring(...)");
        return r0;
    }

    public static final CharSequence subSequence(CharSequence $this$subSequence, IntRange range) {
        Intrinsics.checkNotNullParameter($this$subSequence, "<this>");
        Intrinsics.checkNotNullParameter(range, "range");
        return $this$subSequence.subSequence(range.getStart().intValue(), range.getEndInclusive().intValue() + 1);
    }

    @Deprecated(message = "Use parameters named startIndex and endIndex.", replaceWith = @ReplaceWith(expression = "subSequence(startIndex = start, endIndex = end)", imports = {}))
    private static final CharSequence subSequence(String $this$subSequence, int start, int end) {
        Intrinsics.checkNotNullParameter($this$subSequence, "<this>");
        return $this$subSequence.subSequence(start, end);
    }

    static /* synthetic */ String substring$default(CharSequence $this$substring_u24default, int startIndex, int endIndex, int r3, Object r4) {
        if ((r3 & 2) == 0) goto L5;
        endIndex = $this$substring_u24default.length();
    L5:
        Intrinsics.checkNotNullParameter($this$substring_u24default, "<this>");
        return $this$substring_u24default.subSequence(startIndex, endIndex).toString();
    }

    private static final String substring(CharSequence $this$substring, int startIndex, int endIndex) {
        Intrinsics.checkNotNullParameter($this$substring, "<this>");
        return $this$substring.subSequence(startIndex, endIndex).toString();
    }

    public static final String substring(CharSequence $this$substring, IntRange range) {
        Intrinsics.checkNotNullParameter($this$substring, "<this>");
        Intrinsics.checkNotNullParameter(range, "range");
        return $this$substring.subSequence(range.getStart().intValue(), range.getEndInclusive().intValue() + 1).toString();
    }

    public static /* synthetic */ String substringBefore$default(String r0, char r1, String r2, int r3, Object r4) {
        if ((r3 & 2) == 0) goto L6;
        r2 = r0;
    L6:
        return StringsKt.substringBefore(r0, r1, r2);
    }

    public static final String substringBefore(String $this$substringBefore, char delimiter, String missingDelimiterValue) {
        Intrinsics.checkNotNullParameter($this$substringBefore, "<this>");
        Intrinsics.checkNotNullParameter(missingDelimiterValue, "missingDelimiterValue");
        int index = StringsKt.indexOf$default($this$substringBefore, delimiter, 0, false, 6, null);
        if (index == (-1)) goto L7;
        String r0 = $this$substringBefore.substring(0, index);
        Intrinsics.checkNotNullExpressionValue(r0, "substring(...)");
        return r0;
    L7:
        return missingDelimiterValue;
    }

    public static /* synthetic */ String substringBefore$default(String r0, String r1, String r2, int r3, Object r4) {
        if ((r3 & 2) == 0) goto L6;
        r2 = r0;
    L6:
        return StringsKt.substringBefore(r0, r1, r2);
    }

    public static final String substringBefore(String $this$substringBefore, String delimiter, String missingDelimiterValue) {
        Intrinsics.checkNotNullParameter($this$substringBefore, "<this>");
        Intrinsics.checkNotNullParameter(delimiter, "delimiter");
        Intrinsics.checkNotNullParameter(missingDelimiterValue, "missingDelimiterValue");
        int index = StringsKt.indexOf$default($this$substringBefore, delimiter, 0, false, 6, null);
        if (index == (-1)) goto L7;
        String r0 = $this$substringBefore.substring(0, index);
        Intrinsics.checkNotNullExpressionValue(r0, "substring(...)");
        return r0;
    L7:
        return missingDelimiterValue;
    }

    public static /* synthetic */ String substringAfter$default(String r0, char r1, String r2, int r3, Object r4) {
        if ((r3 & 2) == 0) goto L6;
        r2 = r0;
    L6:
        return StringsKt.substringAfter(r0, r1, r2);
    }

    public static final String substringAfter(String $this$substringAfter, char delimiter, String missingDelimiterValue) {
        Intrinsics.checkNotNullParameter($this$substringAfter, "<this>");
        Intrinsics.checkNotNullParameter(missingDelimiterValue, "missingDelimiterValue");
        int index = StringsKt.indexOf$default($this$substringAfter, delimiter, 0, false, 6, null);
        if (index == (-1)) goto L7;
        String r0 = $this$substringAfter.substring(index + 1, $this$substringAfter.length());
        Intrinsics.checkNotNullExpressionValue(r0, "substring(...)");
        return r0;
    L7:
        return missingDelimiterValue;
    }

    public static /* synthetic */ String substringAfter$default(String r0, String r1, String r2, int r3, Object r4) {
        if ((r3 & 2) == 0) goto L6;
        r2 = r0;
    L6:
        return StringsKt.substringAfter(r0, r1, r2);
    }

    public static final String substringAfter(String $this$substringAfter, String delimiter, String missingDelimiterValue) {
        Intrinsics.checkNotNullParameter($this$substringAfter, "<this>");
        Intrinsics.checkNotNullParameter(delimiter, "delimiter");
        Intrinsics.checkNotNullParameter(missingDelimiterValue, "missingDelimiterValue");
        int index = StringsKt.indexOf$default($this$substringAfter, delimiter, 0, false, 6, null);
        if (index == (-1)) goto L7;
        String r0 = $this$substringAfter.substring(delimiter.length() + index, $this$substringAfter.length());
        Intrinsics.checkNotNullExpressionValue(r0, "substring(...)");
        return r0;
    L7:
        return missingDelimiterValue;
    }

    public static /* synthetic */ String substringBeforeLast$default(String r0, char r1, String r2, int r3, Object r4) {
        if ((r3 & 2) == 0) goto L6;
        r2 = r0;
    L6:
        return StringsKt.substringBeforeLast(r0, r1, r2);
    }

    public static final String substringBeforeLast(String $this$substringBeforeLast, char delimiter, String missingDelimiterValue) {
        Intrinsics.checkNotNullParameter($this$substringBeforeLast, "<this>");
        Intrinsics.checkNotNullParameter(missingDelimiterValue, "missingDelimiterValue");
        int index = StringsKt.lastIndexOf$default($this$substringBeforeLast, delimiter, 0, false, 6, null);
        if (index == (-1)) goto L7;
        String r0 = $this$substringBeforeLast.substring(0, index);
        Intrinsics.checkNotNullExpressionValue(r0, "substring(...)");
        return r0;
    L7:
        return missingDelimiterValue;
    }

    public static /* synthetic */ String substringBeforeLast$default(String r0, String r1, String r2, int r3, Object r4) {
        if ((r3 & 2) == 0) goto L6;
        r2 = r0;
    L6:
        return StringsKt.substringBeforeLast(r0, r1, r2);
    }

    public static final String substringBeforeLast(String $this$substringBeforeLast, String delimiter, String missingDelimiterValue) {
        Intrinsics.checkNotNullParameter($this$substringBeforeLast, "<this>");
        Intrinsics.checkNotNullParameter(delimiter, "delimiter");
        Intrinsics.checkNotNullParameter(missingDelimiterValue, "missingDelimiterValue");
        int index = StringsKt.lastIndexOf$default($this$substringBeforeLast, delimiter, 0, false, 6, null);
        if (index == (-1)) goto L7;
        String r0 = $this$substringBeforeLast.substring(0, index);
        Intrinsics.checkNotNullExpressionValue(r0, "substring(...)");
        return r0;
    L7:
        return missingDelimiterValue;
    }

    public static /* synthetic */ String substringAfterLast$default(String r0, char r1, String r2, int r3, Object r4) {
        if ((r3 & 2) == 0) goto L6;
        r2 = r0;
    L6:
        return StringsKt.substringAfterLast(r0, r1, r2);
    }

    public static final String substringAfterLast(String $this$substringAfterLast, char delimiter, String missingDelimiterValue) {
        Intrinsics.checkNotNullParameter($this$substringAfterLast, "<this>");
        Intrinsics.checkNotNullParameter(missingDelimiterValue, "missingDelimiterValue");
        int index = StringsKt.lastIndexOf$default($this$substringAfterLast, delimiter, 0, false, 6, null);
        if (index == (-1)) goto L7;
        String r0 = $this$substringAfterLast.substring(index + 1, $this$substringAfterLast.length());
        Intrinsics.checkNotNullExpressionValue(r0, "substring(...)");
        return r0;
    L7:
        return missingDelimiterValue;
    }

    public static /* synthetic */ String substringAfterLast$default(String r0, String r1, String r2, int r3, Object r4) {
        if ((r3 & 2) == 0) goto L6;
        r2 = r0;
    L6:
        return StringsKt.substringAfterLast(r0, r1, r2);
    }

    public static final String substringAfterLast(String $this$substringAfterLast, String delimiter, String missingDelimiterValue) {
        Intrinsics.checkNotNullParameter($this$substringAfterLast, "<this>");
        Intrinsics.checkNotNullParameter(delimiter, "delimiter");
        Intrinsics.checkNotNullParameter(missingDelimiterValue, "missingDelimiterValue");
        int index = StringsKt.lastIndexOf$default($this$substringAfterLast, delimiter, 0, false, 6, null);
        if (index == (-1)) goto L7;
        String r0 = $this$substringAfterLast.substring(delimiter.length() + index, $this$substringAfterLast.length());
        Intrinsics.checkNotNullExpressionValue(r0, "substring(...)");
        return r0;
    L7:
        return missingDelimiterValue;
    }

    public static final CharSequence replaceRange(CharSequence $this$replaceRange, int startIndex, int endIndex, CharSequence replacement) {
        Intrinsics.checkNotNullParameter($this$replaceRange, "<this>");
        Intrinsics.checkNotNullParameter(replacement, "replacement");
        if (endIndex < startIndex) goto L7;
        StringBuilder sb = new StringBuilder();
        Intrinsics.checkNotNullExpressionValue(sb.append($this$replaceRange, 0, startIndex), "append(...)");
        sb.append(replacement);
        Intrinsics.checkNotNullExpressionValue(sb.append($this$replaceRange, endIndex, $this$replaceRange.length()), "append(...)");
        return sb;
    L7:
        throw new IndexOutOfBoundsException("End index (" + endIndex + ") is less than start index (" + startIndex + ").");
    }

    private static final String replaceRange(String $this$replaceRange, int startIndex, int endIndex, CharSequence replacement) {
        Intrinsics.checkNotNullParameter($this$replaceRange, "<this>");
        Intrinsics.checkNotNullParameter(replacement, "replacement");
        return StringsKt.replaceRange($this$replaceRange, startIndex, endIndex, replacement).toString();
    }

    public static final CharSequence replaceRange(CharSequence $this$replaceRange, IntRange range, CharSequence replacement) {
        Intrinsics.checkNotNullParameter($this$replaceRange, "<this>");
        Intrinsics.checkNotNullParameter(range, "range");
        Intrinsics.checkNotNullParameter(replacement, "replacement");
        return StringsKt.replaceRange($this$replaceRange, range.getStart().intValue(), range.getEndInclusive().intValue() + 1, replacement);
    }

    private static final String replaceRange(String $this$replaceRange, IntRange range, CharSequence replacement) {
        Intrinsics.checkNotNullParameter($this$replaceRange, "<this>");
        Intrinsics.checkNotNullParameter(range, "range");
        Intrinsics.checkNotNullParameter(replacement, "replacement");
        return StringsKt.replaceRange($this$replaceRange, range, replacement).toString();
    }

    public static final CharSequence removeRange(CharSequence $this$removeRange, int startIndex, int endIndex) {
        Intrinsics.checkNotNullParameter($this$removeRange, "<this>");
        if (endIndex < startIndex) goto L11;
        if (endIndex == startIndex) goto L7;
        StringBuilder sb = new StringBuilder($this$removeRange.length() - (endIndex - startIndex));
        Intrinsics.checkNotNullExpressionValue(sb.append($this$removeRange, 0, startIndex), "append(...)");
        Intrinsics.checkNotNullExpressionValue(sb.append($this$removeRange, endIndex, $this$removeRange.length()), "append(...)");
        return sb;
    L7:
        return $this$removeRange.subSequence(0, $this$removeRange.length());
    L11:
        throw new IndexOutOfBoundsException("End index (" + endIndex + ") is less than start index (" + startIndex + ").");
    }

    private static final String removeRange(String $this$removeRange, int startIndex, int endIndex) {
        Intrinsics.checkNotNullParameter($this$removeRange, "<this>");
        return StringsKt.removeRange($this$removeRange, startIndex, endIndex).toString();
    }

    public static final CharSequence removeRange(CharSequence $this$removeRange, IntRange range) {
        Intrinsics.checkNotNullParameter($this$removeRange, "<this>");
        Intrinsics.checkNotNullParameter(range, "range");
        return StringsKt.removeRange($this$removeRange, range.getStart().intValue(), range.getEndInclusive().intValue() + 1);
    }

    private static final String removeRange(String $this$removeRange, IntRange range) {
        Intrinsics.checkNotNullParameter($this$removeRange, "<this>");
        Intrinsics.checkNotNullParameter(range, "range");
        return StringsKt.removeRange($this$removeRange, range).toString();
    }

    public static final CharSequence removePrefix(CharSequence $this$removePrefix, CharSequence prefix) {
        Intrinsics.checkNotNullParameter($this$removePrefix, "<this>");
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        if (StringsKt.startsWith$default($this$removePrefix, prefix, false, 2, null) == false) goto L7;
        return $this$removePrefix.subSequence(prefix.length(), $this$removePrefix.length());
    L7:
        return $this$removePrefix.subSequence(0, $this$removePrefix.length());
    }

    public static final String removePrefix(String $this$removePrefix, CharSequence prefix) {
        Intrinsics.checkNotNullParameter($this$removePrefix, "<this>");
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        if (StringsKt.startsWith$default($this$removePrefix, prefix, false, 2, null) == false) goto L6;
        String r0 = $this$removePrefix.substring(prefix.length());
        Intrinsics.checkNotNullExpressionValue(r0, "substring(...)");
        return r0;
    L6:
        return $this$removePrefix;
    }

    public static final CharSequence removeSuffix(CharSequence $this$removeSuffix, CharSequence suffix) {
        Intrinsics.checkNotNullParameter($this$removeSuffix, "<this>");
        Intrinsics.checkNotNullParameter(suffix, "suffix");
        if (StringsKt.endsWith$default($this$removeSuffix, suffix, false, 2, null) == false) goto L7;
        return $this$removeSuffix.subSequence(0, $this$removeSuffix.length() - suffix.length());
    L7:
        return $this$removeSuffix.subSequence(0, $this$removeSuffix.length());
    }

    public static final String removeSuffix(String $this$removeSuffix, CharSequence suffix) {
        Intrinsics.checkNotNullParameter($this$removeSuffix, "<this>");
        Intrinsics.checkNotNullParameter(suffix, "suffix");
        if (StringsKt.endsWith$default($this$removeSuffix, suffix, false, 2, null) == false) goto L6;
        String r0 = $this$removeSuffix.substring(0, $this$removeSuffix.length() - suffix.length());
        Intrinsics.checkNotNullExpressionValue(r0, "substring(...)");
        return r0;
    L6:
        return $this$removeSuffix;
    }

    public static final CharSequence removeSurrounding(CharSequence $this$removeSurrounding, CharSequence prefix, CharSequence suffix) {
        Intrinsics.checkNotNullParameter($this$removeSurrounding, "<this>");
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        Intrinsics.checkNotNullParameter(suffix, "suffix");
        if ($this$removeSurrounding.length() < (prefix.length() + suffix.length())) goto L11;
        if (StringsKt.startsWith$default($this$removeSurrounding, prefix, false, 2, null) == false) goto L11;
        if (StringsKt.endsWith$default($this$removeSurrounding, suffix, false, 2, null) == false) goto L11;
        return $this$removeSurrounding.subSequence(prefix.length(), $this$removeSurrounding.length() - suffix.length());
    L11:
        return $this$removeSurrounding.subSequence(0, $this$removeSurrounding.length());
    }

    public static final String removeSurrounding(String $this$removeSurrounding, CharSequence prefix, CharSequence suffix) {
        Intrinsics.checkNotNullParameter($this$removeSurrounding, "<this>");
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        Intrinsics.checkNotNullParameter(suffix, "suffix");
        if ($this$removeSurrounding.length() >= (prefix.length() + suffix.length())) goto L5;
    L10:
        return $this$removeSurrounding;
    L5:
        if (StringsKt.startsWith$default($this$removeSurrounding, prefix, false, 2, null) == false) goto L10;
        if (StringsKt.endsWith$default($this$removeSurrounding, suffix, false, 2, null) == false) goto L10;
        String r0 = $this$removeSurrounding.substring(prefix.length(), $this$removeSurrounding.length() - suffix.length());
        Intrinsics.checkNotNullExpressionValue(r0, "substring(...)");
        return r0;
    }

    public static final CharSequence removeSurrounding(CharSequence $this$removeSurrounding, CharSequence delimiter) {
        Intrinsics.checkNotNullParameter($this$removeSurrounding, "<this>");
        Intrinsics.checkNotNullParameter(delimiter, "delimiter");
        return StringsKt.removeSurrounding($this$removeSurrounding, delimiter, delimiter);
    }

    public static final String removeSurrounding(String $this$removeSurrounding, CharSequence delimiter) {
        Intrinsics.checkNotNullParameter($this$removeSurrounding, "<this>");
        Intrinsics.checkNotNullParameter(delimiter, "delimiter");
        return StringsKt.removeSurrounding($this$removeSurrounding, delimiter, delimiter);
    }

    public static /* synthetic */ String replaceBefore$default(String r0, char r1, String r2, String r3, int r4, Object r5) {
        if ((r4 & 4) == 0) goto L6;
        r3 = r0;
    L6:
        return StringsKt.replaceBefore(r0, r1, r2, r3);
    }

    public static final String replaceBefore(String $this$replaceBefore, char delimiter, String replacement, String missingDelimiterValue) {
        Intrinsics.checkNotNullParameter($this$replaceBefore, "<this>");
        Intrinsics.checkNotNullParameter(replacement, "replacement");
        Intrinsics.checkNotNullParameter(missingDelimiterValue, "missingDelimiterValue");
        int index = StringsKt.indexOf$default($this$replaceBefore, delimiter, 0, false, 6, null);
        if (index != (-1)) goto L6;
        return missingDelimiterValue;
    L6:
        return StringsKt.replaceRange($this$replaceBefore, 0, index, replacement).toString();
    }

    public static /* synthetic */ String replaceBefore$default(String r0, String r1, String r2, String r3, int r4, Object r5) {
        if ((r4 & 4) == 0) goto L6;
        r3 = r0;
    L6:
        return StringsKt.replaceBefore(r0, r1, r2, r3);
    }

    public static final String replaceBefore(String $this$replaceBefore, String delimiter, String replacement, String missingDelimiterValue) {
        Intrinsics.checkNotNullParameter($this$replaceBefore, "<this>");
        Intrinsics.checkNotNullParameter(delimiter, "delimiter");
        Intrinsics.checkNotNullParameter(replacement, "replacement");
        Intrinsics.checkNotNullParameter(missingDelimiterValue, "missingDelimiterValue");
        int index = StringsKt.indexOf$default($this$replaceBefore, delimiter, 0, false, 6, null);
        if (index != (-1)) goto L6;
        return missingDelimiterValue;
    L6:
        return StringsKt.replaceRange($this$replaceBefore, 0, index, replacement).toString();
    }

    public static /* synthetic */ String replaceAfter$default(String r0, char r1, String r2, String r3, int r4, Object r5) {
        if ((r4 & 4) == 0) goto L6;
        r3 = r0;
    L6:
        return StringsKt.replaceAfter(r0, r1, r2, r3);
    }

    public static final String replaceAfter(String $this$replaceAfter, char delimiter, String replacement, String missingDelimiterValue) {
        Intrinsics.checkNotNullParameter($this$replaceAfter, "<this>");
        Intrinsics.checkNotNullParameter(replacement, "replacement");
        Intrinsics.checkNotNullParameter(missingDelimiterValue, "missingDelimiterValue");
        int index = StringsKt.indexOf$default($this$replaceAfter, delimiter, 0, false, 6, null);
        if (index == (-1)) goto L7;
        String r3 = $this$replaceAfter;
        return StringsKt.replaceRange(r3, index + 1, $this$replaceAfter.length(), replacement).toString();
    L7:
        return missingDelimiterValue;
    }

    public static /* synthetic */ String replaceAfter$default(String r0, String r1, String r2, String r3, int r4, Object r5) {
        if ((r4 & 4) == 0) goto L6;
        r3 = r0;
    L6:
        return StringsKt.replaceAfter(r0, r1, r2, r3);
    }

    public static final String replaceAfter(String $this$replaceAfter, String delimiter, String replacement, String missingDelimiterValue) {
        Intrinsics.checkNotNullParameter($this$replaceAfter, "<this>");
        Intrinsics.checkNotNullParameter(delimiter, "delimiter");
        Intrinsics.checkNotNullParameter(replacement, "replacement");
        Intrinsics.checkNotNullParameter(missingDelimiterValue, "missingDelimiterValue");
        int index = StringsKt.indexOf$default($this$replaceAfter, delimiter, 0, false, 6, null);
        if (index == (-1)) goto L7;
        String r3 = $this$replaceAfter;
        return StringsKt.replaceRange(r3, delimiter.length() + index, $this$replaceAfter.length(), replacement).toString();
    L7:
        return missingDelimiterValue;
    }

    public static /* synthetic */ String replaceAfterLast$default(String r0, String r1, String r2, String r3, int r4, Object r5) {
        if ((r4 & 4) == 0) goto L6;
        r3 = r0;
    L6:
        return StringsKt.replaceAfterLast(r0, r1, r2, r3);
    }

    public static final String replaceAfterLast(String $this$replaceAfterLast, String delimiter, String replacement, String missingDelimiterValue) {
        Intrinsics.checkNotNullParameter($this$replaceAfterLast, "<this>");
        Intrinsics.checkNotNullParameter(delimiter, "delimiter");
        Intrinsics.checkNotNullParameter(replacement, "replacement");
        Intrinsics.checkNotNullParameter(missingDelimiterValue, "missingDelimiterValue");
        int index = StringsKt.lastIndexOf$default($this$replaceAfterLast, delimiter, 0, false, 6, null);
        if (index == (-1)) goto L7;
        String r3 = $this$replaceAfterLast;
        return StringsKt.replaceRange(r3, delimiter.length() + index, $this$replaceAfterLast.length(), replacement).toString();
    L7:
        return missingDelimiterValue;
    }

    public static /* synthetic */ String replaceAfterLast$default(String r0, char r1, String r2, String r3, int r4, Object r5) {
        if ((r4 & 4) == 0) goto L6;
        r3 = r0;
    L6:
        return StringsKt.replaceAfterLast(r0, r1, r2, r3);
    }

    public static final String replaceAfterLast(String $this$replaceAfterLast, char delimiter, String replacement, String missingDelimiterValue) {
        Intrinsics.checkNotNullParameter($this$replaceAfterLast, "<this>");
        Intrinsics.checkNotNullParameter(replacement, "replacement");
        Intrinsics.checkNotNullParameter(missingDelimiterValue, "missingDelimiterValue");
        int index = StringsKt.lastIndexOf$default($this$replaceAfterLast, delimiter, 0, false, 6, null);
        if (index == (-1)) goto L7;
        String r3 = $this$replaceAfterLast;
        return StringsKt.replaceRange(r3, index + 1, $this$replaceAfterLast.length(), replacement).toString();
    L7:
        return missingDelimiterValue;
    }

    public static /* synthetic */ String replaceBeforeLast$default(String r0, char r1, String r2, String r3, int r4, Object r5) {
        if ((r4 & 4) == 0) goto L6;
        r3 = r0;
    L6:
        return StringsKt.replaceBeforeLast(r0, r1, r2, r3);
    }

    public static final String replaceBeforeLast(String $this$replaceBeforeLast, char delimiter, String replacement, String missingDelimiterValue) {
        Intrinsics.checkNotNullParameter($this$replaceBeforeLast, "<this>");
        Intrinsics.checkNotNullParameter(replacement, "replacement");
        Intrinsics.checkNotNullParameter(missingDelimiterValue, "missingDelimiterValue");
        int index = StringsKt.lastIndexOf$default($this$replaceBeforeLast, delimiter, 0, false, 6, null);
        if (index != (-1)) goto L6;
        return missingDelimiterValue;
    L6:
        return StringsKt.replaceRange($this$replaceBeforeLast, 0, index, replacement).toString();
    }

    public static /* synthetic */ String replaceBeforeLast$default(String r0, String r1, String r2, String r3, int r4, Object r5) {
        if ((r4 & 4) == 0) goto L6;
        r3 = r0;
    L6:
        return StringsKt.replaceBeforeLast(r0, r1, r2, r3);
    }

    public static final String replaceBeforeLast(String $this$replaceBeforeLast, String delimiter, String replacement, String missingDelimiterValue) {
        Intrinsics.checkNotNullParameter($this$replaceBeforeLast, "<this>");
        Intrinsics.checkNotNullParameter(delimiter, "delimiter");
        Intrinsics.checkNotNullParameter(replacement, "replacement");
        Intrinsics.checkNotNullParameter(missingDelimiterValue, "missingDelimiterValue");
        int index = StringsKt.lastIndexOf$default($this$replaceBeforeLast, delimiter, 0, false, 6, null);
        if (index != (-1)) goto L6;
        return missingDelimiterValue;
    L6:
        return StringsKt.replaceRange($this$replaceBeforeLast, 0, index, replacement).toString();
    }

    private static final String replace(CharSequence $this$replace, Regex regex, String replacement) {
        Intrinsics.checkNotNullParameter($this$replace, "<this>");
        Intrinsics.checkNotNullParameter(regex, "regex");
        Intrinsics.checkNotNullParameter(replacement, "replacement");
        return regex.replace($this$replace, replacement);
    }

    private static final String replace(CharSequence $this$replace, Regex regex, Function1<? super MatchResult, ? extends CharSequence> r3) {
        Intrinsics.checkNotNullParameter($this$replace, "<this>");
        Intrinsics.checkNotNullParameter(regex, "regex");
        Intrinsics.checkNotNullParameter(r3, "transform");
        return regex.replace($this$replace, r3);
    }

    private static final String replaceFirst(CharSequence $this$replaceFirst, Regex regex, String replacement) {
        Intrinsics.checkNotNullParameter($this$replaceFirst, "<this>");
        Intrinsics.checkNotNullParameter(regex, "regex");
        Intrinsics.checkNotNullParameter(replacement, "replacement");
        return regex.replaceFirst($this$replaceFirst, replacement);
    }

    private static final String replaceFirstCharWithChar(String $this$replaceFirstChar, Function1<? super Character, Character> r4) {
        Intrinsics.checkNotNullParameter($this$replaceFirstChar, "<this>");
        Intrinsics.checkNotNullParameter(r4, "transform");
        if ($this$replaceFirstChar.length() <= 0) goto L5;
        boolean r0 = true;
    L6:
        if (r0 == false) goto L9;
        char r1 = r4.invoke(Character.valueOf($this$replaceFirstChar.charAt(0))).charValue();
        String r2 = $this$replaceFirstChar.substring(1);
        Intrinsics.checkNotNullExpressionValue(r2, "substring(...)");
        return r1 + r2;
    L9:
        return $this$replaceFirstChar;
    L5:
        r0 = false;
        goto L6
    }

    private static final String replaceFirstCharWithCharSequence(String $this$replaceFirstChar, Function1<? super Character, ? extends CharSequence> r4) {
        Intrinsics.checkNotNullParameter($this$replaceFirstChar, "<this>");
        Intrinsics.checkNotNullParameter(r4, "transform");
        if ($this$replaceFirstChar.length() <= 0) goto L5;
        boolean r0 = true;
    L6:
        if (r0 == false) goto L9;
        StringBuilder r1 = new StringBuilder().append(r4.invoke(Character.valueOf($this$replaceFirstChar.charAt(0))));
        String r2 = $this$replaceFirstChar.substring(1);
        Intrinsics.checkNotNullExpressionValue(r2, "substring(...)");
        return r1.append(r2).toString();
    L9:
        return $this$replaceFirstChar;
    L5:
        r0 = false;
        goto L6
    }

    private static final boolean matches(CharSequence $this$matches, Regex regex) {
        Intrinsics.checkNotNullParameter($this$matches, "<this>");
        Intrinsics.checkNotNullParameter(regex, "regex");
        return regex.matches($this$matches);
    }

    public static final boolean regionMatchesImpl(CharSequence $this$regionMatchesImpl, int thisOffset, CharSequence other, int otherOffset, int length, boolean ignoreCase) {
        Intrinsics.checkNotNullParameter($this$regionMatchesImpl, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        if (otherOffset < 0) goto L18;
        if (thisOffset < 0) goto L18;
        if (thisOffset > ($this$regionMatchesImpl.length() - length)) goto L18;
        if (otherOffset > (other.length() - length)) goto L18;
        int index = 0;
    L11:
        if (index >= length) goto L16;
        if (CharsKt.equals($this$regionMatchesImpl.charAt(thisOffset + index), other.charAt(otherOffset + index), ignoreCase) == false) goto L14;
        index = index + 1;
        goto L11
    L14:
        return false;
    L16:
        return true;
    L18:
        return false;
    }

    public static /* synthetic */ boolean startsWith$default(CharSequence r0, char r1, boolean r2, int r3, Object r4) {
        if ((r3 & 2) == 0) goto L6;
        r2 = false;
    L6:
        return StringsKt.startsWith(r0, r1, r2);
    }

    public static final boolean startsWith(CharSequence $this$startsWith, char r3, boolean ignoreCase) {
        Intrinsics.checkNotNullParameter($this$startsWith, "<this>");
        if ($this$startsWith.length() > 0) goto L5;
        return false;
    L5:
        if (CharsKt.equals($this$startsWith.charAt(0), r3, ignoreCase) == false) goto L9;
        return true;
    L9:
        return false;
    }

    public static /* synthetic */ boolean endsWith$default(CharSequence r0, char r1, boolean r2, int r3, Object r4) {
        if ((r3 & 2) == 0) goto L6;
        r2 = false;
    L6:
        return StringsKt.endsWith(r0, r1, r2);
    }

    public static final boolean endsWith(CharSequence $this$endsWith, char r2, boolean ignoreCase) {
        Intrinsics.checkNotNullParameter($this$endsWith, "<this>");
        if ($this$endsWith.length() > 0) goto L5;
    L7:
        return false;
    L5:
        if (CharsKt.equals($this$endsWith.charAt(StringsKt.getLastIndex($this$endsWith)), r2, ignoreCase) == false) goto L7;
        return true;
    }

    public static /* synthetic */ boolean startsWith$default(CharSequence r0, CharSequence r1, boolean r2, int r3, Object r4) {
        if ((r3 & 2) == 0) goto L6;
        r2 = false;
    L6:
        return StringsKt.startsWith(r0, r1, r2);
    }

    public static final boolean startsWith(CharSequence $this$startsWith, CharSequence prefix, boolean ignoreCase) {
        Intrinsics.checkNotNullParameter($this$startsWith, "<this>");
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        if (ignoreCase == true) goto L11;
        if (($this$startsWith instanceof String) == false) goto L11;
        if ((prefix instanceof String) == false) goto L11;
        return StringsKt.startsWith$default((String) $this$startsWith, (String) prefix, false, 2, null);
    L11:
        return StringsKt.regionMatchesImpl($this$startsWith, 0, prefix, 0, prefix.length(), ignoreCase);
    }

    public static /* synthetic */ boolean startsWith$default(CharSequence r0, CharSequence r1, int r2, boolean r3, int r4, Object r5) {
        if ((r4 & 4) == 0) goto L6;
        r3 = false;
    L6:
        return StringsKt.startsWith(r0, r1, r2, r3);
    }

    public static final boolean startsWith(CharSequence $this$startsWith, CharSequence prefix, int startIndex, boolean ignoreCase) {
        Intrinsics.checkNotNullParameter($this$startsWith, "<this>");
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        if (ignoreCase == true) goto L11;
        if (($this$startsWith instanceof String) == false) goto L11;
        if ((prefix instanceof String) == false) goto L11;
        return StringsKt.startsWith$default((String) $this$startsWith, (String) prefix, startIndex, false, 4, null);
    L11:
        return StringsKt.regionMatchesImpl($this$startsWith, startIndex, prefix, 0, prefix.length(), ignoreCase);
    }

    public static /* synthetic */ boolean endsWith$default(CharSequence r0, CharSequence r1, boolean r2, int r3, Object r4) {
        if ((r3 & 2) == 0) goto L6;
        r2 = false;
    L6:
        return StringsKt.endsWith(r0, r1, r2);
    }

    public static final boolean endsWith(CharSequence $this$endsWith, CharSequence suffix, boolean ignoreCase) {
        Intrinsics.checkNotNullParameter($this$endsWith, "<this>");
        Intrinsics.checkNotNullParameter(suffix, "suffix");
        if (ignoreCase == true) goto L11;
        if (($this$endsWith instanceof String) == false) goto L11;
        if ((suffix instanceof String) == false) goto L11;
        return StringsKt.endsWith$default((String) $this$endsWith, (String) suffix, false, 2, null);
    L11:
        return StringsKt.regionMatchesImpl($this$endsWith, $this$endsWith.length() - suffix.length(), suffix, 0, suffix.length(), ignoreCase);
    }

    public static /* synthetic */ String commonPrefixWith$default(CharSequence r0, CharSequence r1, boolean r2, int r3, Object r4) {
        if ((r3 & 2) == 0) goto L6;
        r2 = false;
    L6:
        return StringsKt.commonPrefixWith(r0, r1, r2);
    }

    public static final String commonPrefixWith(CharSequence $this$commonPrefixWith, CharSequence other, boolean ignoreCase) {
        Intrinsics.checkNotNullParameter($this$commonPrefixWith, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        int shortestLength = Math.min($this$commonPrefixWith.length(), other.length());
        int i = 0;
    L3:
        if (i >= shortestLength) goto L8;
        if (CharsKt.equals($this$commonPrefixWith.charAt(i), other.charAt(i), ignoreCase) == false) goto L8;
        i = i + 1;
    L8:
        if (StringsKt.hasSurrogatePairAt($this$commonPrefixWith, i - 1) == false) goto L10;
    L11:
        i = i - 1;
    L13:
        return $this$commonPrefixWith.subSequence(0, i).toString();
    L10:
        if (StringsKt.hasSurrogatePairAt(other, i - 1) == false) goto L13;
        goto L11
    }

    public static /* synthetic */ String commonSuffixWith$default(CharSequence r0, CharSequence r1, boolean r2, int r3, Object r4) {
        if ((r3 & 2) == 0) goto L6;
        r2 = false;
    L6:
        return StringsKt.commonSuffixWith(r0, r1, r2);
    }

    public static final String commonSuffixWith(CharSequence $this$commonSuffixWith, CharSequence other, boolean ignoreCase) {
        Intrinsics.checkNotNullParameter($this$commonSuffixWith, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        int thisLength = $this$commonSuffixWith.length();
        int otherLength = other.length();
        int shortestLength = Math.min(thisLength, otherLength);
        int i = 0;
    L3:
        if (i >= shortestLength) goto L8;
        if (CharsKt.equals($this$commonSuffixWith.charAt((thisLength - i) - 1), other.charAt((otherLength - i) - 1), ignoreCase) == false) goto L8;
        i = i + 1;
    L8:
        if (StringsKt.hasSurrogatePairAt($this$commonSuffixWith, (thisLength - i) - 1) == false) goto L10;
    L11:
        i = i - 1;
    L13:
        return $this$commonSuffixWith.subSequence(thisLength - i, thisLength).toString();
    L10:
        if (StringsKt.hasSurrogatePairAt(other, (otherLength - i) - 1) == false) goto L13;
        goto L11
    }

    public static /* synthetic */ int indexOfAny$default(CharSequence r1, char[] r2, int r3, boolean r4, int r5, Object r6) {
        if ((r5 & 2) == 0) goto L6;
        r3 = 0;
    L6:
        if ((r5 & 4) == 0) goto L9;
        r4 = false;
    L9:
        return StringsKt.indexOfAny(r1, r2, r3, r4);
    }

    public static final int indexOfAny(CharSequence $this$indexOfAny, char[] chars, int startIndex, boolean ignoreCase) {
        Intrinsics.checkNotNullParameter($this$indexOfAny, "<this>");
        Intrinsics.checkNotNullParameter(chars, "chars");
        if (ignoreCase == false) goto L5;
    L10:
        int index = RangesKt.coerceAtLeast(startIndex, 0);
        int r3 = StringsKt.getLastIndex($this$indexOfAny);
        if (index > r3) goto L23;
    L12:
        char charAtIndex = $this$indexOfAny.charAt(index);
        int r7 = chars.length;
        int r8 = 0;
    L13:
        if (r8 >= r7) goto L18;
        char element$iv = chars[r8];
        if (CharsKt.equals(element$iv, charAtIndex, ignoreCase) == true) goto L16;
        r8 = r8 + 1;
        goto L13
    L16:
        boolean r5 = true;
    L19:
        if (r5 == true) goto L20;
        if (index == r3) goto L29;
        index = index + 1;
        goto L12
    L29:
        return -1;
    L20:
        return index;
    L18:
        r5 = false;
        goto L19
    L23:
        return -1;
    L5:
        if (chars.length != 1) goto L10;
        if (($this$indexOfAny instanceof String) == false) goto L10;
        return ((String) $this$indexOfAny).indexOf(ArraysKt.single(chars), startIndex);
    }

    public static /* synthetic */ int lastIndexOfAny$default(CharSequence r0, char[] r1, int r2, boolean r3, int r4, Object r5) {
        if ((r4 & 2) == 0) goto L6;
        r2 = StringsKt.getLastIndex(r0);
    L6:
        if ((r4 & 4) == 0) goto L9;
        r3 = false;
    L9:
        return StringsKt.lastIndexOfAny(r0, r1, r2, r3);
    }

    public static final int lastIndexOfAny(CharSequence $this$lastIndexOfAny, char[] chars, int startIndex, boolean ignoreCase) {
        Intrinsics.checkNotNullParameter($this$lastIndexOfAny, "<this>");
        Intrinsics.checkNotNullParameter(chars, "chars");
        if (ignoreCase == false) goto L5;
    L10:
        int index = RangesKt.coerceAtMost(startIndex, StringsKt.getLastIndex($this$lastIndexOfAny));
    L12:
        if ((-1) >= index) goto L23;
        char charAtIndex = $this$lastIndexOfAny.charAt(index);
        int r5 = chars.length;
        boolean r6 = false;
        int r7 = 0;
    L14:
        if (r7 >= r5) goto L20;
        char element$iv = chars[r7];
        if (CharsKt.equals(element$iv, charAtIndex, ignoreCase) == true) goto L17;
        r7 = r7 + 1;
        goto L14
    L17:
        r6 = true;
    L20:
        if (r6 == true) goto L21;
        index = index - 1;
        goto L12
    L21:
        return index;
    L23:
        return -1;
    L5:
        if (chars.length != 1) goto L10;
        if (($this$lastIndexOfAny instanceof String) == false) goto L10;
        return ((String) $this$lastIndexOfAny).lastIndexOf(ArraysKt.single(chars), startIndex);
    }

    static /* synthetic */ int indexOf$StringsKt__StringsKt$default(CharSequence r6, CharSequence r7, int r8, int r9, boolean r10, boolean r11, int r12, Object r13) {
        if ((r12 & 16) == 0) goto L6;
        r11 = false;
    L6:
        return indexOf$StringsKt__StringsKt(r6, r7, r8, r9, r10, r11);
    }

    private static final int indexOf$StringsKt__StringsKt(CharSequence $this$indexOf, CharSequence other, int startIndex, int endIndex, boolean ignoreCase, boolean last) {
        CharSequence r0 = other;
        if (last == true) goto L5;
        IntRange r2 = new IntRange(RangesKt.coerceAtLeast(startIndex, 0), RangesKt.coerceAtMost(endIndex, $this$indexOf.length()));
    L6:
        IntProgression indices = r2;
        if (($this$indexOf instanceof String) == true) goto L9;
    L21:
        int index = indices.getFirst();
        int r9 = indices.getLast();
        int r10 = indices.getStep();
        if (r10 <= 0) goto L24;
        if (index > r9) goto L24;
    L26:
        int index2 = index;
    L28:
        if (StringsKt.regionMatchesImpl(r0, 0, $this$indexOf, index2, r0.length(), ignoreCase) == true) goto L29;
        if (index2 == r9) goto L42;
        index2 = index2 + r10;
        r0 = other;
        goto L28
    L42:
        return -1;
    L29:
        return index2;
    L24:
        if (r10 >= 0) goto L39;
        if (r9 <= index) goto L26;
        return -1;
    L39:
        return -1;
    L9:
        if ((r0 instanceof String) == false) goto L21;
        int index3 = indices.getFirst();
        int r3 = indices.getLast();
        int r4 = indices.getStep();
        if (r4 <= 0) goto L13;
        if (index3 > r3) goto L13;
    L15:
        int index4 = index3;
    L17:
        if (StringsKt.regionMatches((String) r0, 0, (String) $this$indexOf, index4, ((String) r0).length(), ignoreCase) == true) goto L18;
        if (index4 == r3) goto L41;
        index4 = index4 + r4;
        goto L17
    L41:
        return -1;
    L18:
        return index4;
    L13:
        if (r4 >= 0) goto L32;
        if (r3 <= index3) goto L15;
        return -1;
    L32:
        return -1;
    L5:
        r2 = RangesKt.downTo(RangesKt.coerceAtMost(startIndex, StringsKt.getLastIndex($this$indexOf)), RangesKt.coerceAtLeast(endIndex, 0));
        goto L6
    }

    private static final Pair<Integer, String> findAnyOf$StringsKt__StringsKt(CharSequence $this$findAnyOf, Collection<String> r18, int startIndex, boolean ignoreCase, boolean last) {
        if (ignoreCase == true) goto L15;
        if (r18.size() != 1) goto L15;
        String string = (String) CollectionsKt.single(r18);
        if (last == true) goto L9;
        int index = StringsKt.indexOf$default($this$findAnyOf, string, startIndex, false, 4, null);
    L10:
        if (index >= 0) goto L13;
        return null;
    L13:
        return TuplesKt.to(Integer.valueOf(index), string);
    L9:
        index = StringsKt.lastIndexOf$default($this$findAnyOf, string, startIndex, false, 4, null);
    L15:
        if (last == true) goto L17;
        IntRange r2 = new IntRange(RangesKt.coerceAtLeast(startIndex, 0), $this$findAnyOf.length());
    L18:
        IntProgression indices = r2;
        if (($this$findAnyOf instanceof String) == false) goto L39;
        int index2 = indices.getFirst();
        int r3 = indices.getLast();
        int r4 = indices.getStep();
        if (r4 <= 0) goto L23;
        if (index2 > r3) goto L23;
    L25:
        int index3 = index2;
    L26:
        Collection<String> $this$firstOrNull$iv = r18;
        Iterator r5 = $this$firstOrNull$iv.iterator();
    L28:
        if (r5.hasNext() == false) goto L32;
        Object element$iv = r5.next();
        String it = (String) element$iv;
        if (StringsKt.regionMatches(it, 0, (String) $this$findAnyOf, index3, it.length(), ignoreCase) == false) goto L28;
    L33:
        String matchingString = (String) element$iv;
        if (matchingString != null) goto L36;
        if (index3 == r3) goto L59;
        index3 = index3 + r4;
    L59:
        return null;
    L36:
        return TuplesKt.to(Integer.valueOf(index3), matchingString);
    L32:
        element$iv = null;
    L23:
        if (r4 >= 0) goto L59;
        if (r3 > index2) goto L59;
    L39:
        int index4 = indices.getFirst();
        int r9 = indices.getLast();
        int r10 = indices.getStep();
        if (r10 <= 0) goto L42;
        if (index4 > r9) goto L42;
    L44:
        int index5 = index4;
    L45:
        Collection<String> $this$firstOrNull$iv2 = r18;
        Iterator r13 = $this$firstOrNull$iv2.iterator();
    L47:
        if (r13.hasNext() == false) goto L52;
        Object element$iv2 = r13.next();
        String it2 = (String) element$iv2;
        if (StringsKt.regionMatchesImpl(it2, 0, $this$findAnyOf, index5, it2.length(), ignoreCase) == false) goto L47;
    L53:
        String matchingString2 = (String) element$iv2;
        if (matchingString2 != null) goto L56;
        if (index5 == r9) goto L59;
        index5 = index5 + r10;
        goto L45
    L56:
        return TuplesKt.to(Integer.valueOf(index5), matchingString2);
    L52:
        element$iv2 = null;
    L42:
        if (r10 >= 0) goto L59;
        if (r9 > index4) goto L59;
    L17:
        r2 = RangesKt.downTo(RangesKt.coerceAtMost(startIndex, StringsKt.getLastIndex($this$findAnyOf)), 0);
        goto L18
    }

    public static /* synthetic */ Pair findAnyOf$default(CharSequence r1, Collection r2, int r3, boolean r4, int r5, Object r6) {
        if ((r5 & 2) == 0) goto L6;
        r3 = 0;
    L6:
        if ((r5 & 4) == 0) goto L9;
        r4 = false;
    L9:
        return StringsKt.findAnyOf(r1, r2, r3, r4);
    }

    public static final Pair<Integer, String> findAnyOf(CharSequence $this$findAnyOf, Collection<String> r2, int startIndex, boolean ignoreCase) {
        Intrinsics.checkNotNullParameter($this$findAnyOf, "<this>");
        Intrinsics.checkNotNullParameter(r2, "strings");
        return findAnyOf$StringsKt__StringsKt($this$findAnyOf, r2, startIndex, ignoreCase, false);
    }

    public static /* synthetic */ Pair findLastAnyOf$default(CharSequence r0, Collection r1, int r2, boolean r3, int r4, Object r5) {
        if ((r4 & 2) == 0) goto L6;
        r2 = StringsKt.getLastIndex(r0);
    L6:
        if ((r4 & 4) == 0) goto L9;
        r3 = false;
    L9:
        return StringsKt.findLastAnyOf(r0, r1, r2, r3);
    }

    public static final Pair<Integer, String> findLastAnyOf(CharSequence $this$findLastAnyOf, Collection<String> r2, int startIndex, boolean ignoreCase) {
        Intrinsics.checkNotNullParameter($this$findLastAnyOf, "<this>");
        Intrinsics.checkNotNullParameter(r2, "strings");
        return findAnyOf$StringsKt__StringsKt($this$findLastAnyOf, r2, startIndex, ignoreCase, true);
    }

    public static /* synthetic */ int indexOfAny$default(CharSequence r1, Collection r2, int r3, boolean r4, int r5, Object r6) {
        if ((r5 & 2) == 0) goto L6;
        r3 = 0;
    L6:
        if ((r5 & 4) == 0) goto L9;
        r4 = false;
    L9:
        return StringsKt.indexOfAny(r1, r2, r3, r4);
    }

    public static final int indexOfAny(CharSequence $this$indexOfAny, Collection<String> r2, int startIndex, boolean ignoreCase) {
        Intrinsics.checkNotNullParameter($this$indexOfAny, "<this>");
        Intrinsics.checkNotNullParameter(r2, "strings");
        Pair<Integer, String> r0 = findAnyOf$StringsKt__StringsKt($this$indexOfAny, r2, startIndex, ignoreCase, false);
        if (r0 != null) goto L7;
        return -1;
    L7:
        return r0.getFirst().intValue();
    }

    public static /* synthetic */ int lastIndexOfAny$default(CharSequence r0, Collection r1, int r2, boolean r3, int r4, Object r5) {
        if ((r4 & 2) == 0) goto L6;
        r2 = StringsKt.getLastIndex(r0);
    L6:
        if ((r4 & 4) == 0) goto L9;
        r3 = false;
    L9:
        return StringsKt.lastIndexOfAny(r0, r1, r2, r3);
    }

    public static final int lastIndexOfAny(CharSequence $this$lastIndexOfAny, Collection<String> r2, int startIndex, boolean ignoreCase) {
        Intrinsics.checkNotNullParameter($this$lastIndexOfAny, "<this>");
        Intrinsics.checkNotNullParameter(r2, "strings");
        Pair<Integer, String> r0 = findAnyOf$StringsKt__StringsKt($this$lastIndexOfAny, r2, startIndex, ignoreCase, true);
        if (r0 != null) goto L7;
        return -1;
    L7:
        return r0.getFirst().intValue();
    }

    public static /* synthetic */ int indexOf$default(CharSequence r1, char r2, int r3, boolean r4, int r5, Object r6) {
        if ((r5 & 2) == 0) goto L6;
        r3 = 0;
    L6:
        if ((r5 & 4) == 0) goto L9;
        r4 = false;
    L9:
        return StringsKt.indexOf(r1, r2, r3, r4);
    }

    public static final int indexOf(CharSequence $this$indexOf, char r3, int startIndex, boolean ignoreCase) {
        Intrinsics.checkNotNullParameter($this$indexOf, "<this>");
        if (ignoreCase == true) goto L9;
        if (($this$indexOf instanceof String) == false) goto L9;
        return ((String) $this$indexOf).indexOf(r3, startIndex);
    L9:
        return StringsKt.indexOfAny($this$indexOf, new char[]{r3}, startIndex, ignoreCase);
    }

    public static /* synthetic */ int indexOf$default(CharSequence r1, String r2, int r3, boolean r4, int r5, Object r6) {
        if ((r5 & 2) == 0) goto L6;
        r3 = 0;
    L6:
        if ((r5 & 4) == 0) goto L9;
        r4 = false;
    L9:
        return StringsKt.indexOf(r1, r2, r3, r4);
    }

    public static final int indexOf(CharSequence $this$indexOf, String string, int startIndex, boolean ignoreCase) {
        Intrinsics.checkNotNullParameter($this$indexOf, "<this>");
        Intrinsics.checkNotNullParameter(string, "string");
        if (ignoreCase == true) goto L9;
        if (($this$indexOf instanceof String) == false) goto L9;
        return ((String) $this$indexOf).indexOf(string, startIndex);
    L9:
        return indexOf$StringsKt__StringsKt$default($this$indexOf, string, startIndex, $this$indexOf.length(), ignoreCase, false, 16, null);
    }

    public static /* synthetic */ int lastIndexOf$default(CharSequence r0, char r1, int r2, boolean r3, int r4, Object r5) {
        if ((r4 & 2) == 0) goto L6;
        r2 = StringsKt.getLastIndex(r0);
    L6:
        if ((r4 & 4) == 0) goto L9;
        r3 = false;
    L9:
        return StringsKt.lastIndexOf(r0, r1, r2, r3);
    }

    public static final int lastIndexOf(CharSequence $this$lastIndexOf, char r3, int startIndex, boolean ignoreCase) {
        Intrinsics.checkNotNullParameter($this$lastIndexOf, "<this>");
        if (ignoreCase == true) goto L9;
        if (($this$lastIndexOf instanceof String) == false) goto L9;
        return ((String) $this$lastIndexOf).lastIndexOf(r3, startIndex);
    L9:
        return StringsKt.lastIndexOfAny($this$lastIndexOf, new char[]{r3}, startIndex, ignoreCase);
    }

    public static /* synthetic */ int lastIndexOf$default(CharSequence r0, String r1, int r2, boolean r3, int r4, Object r5) {
        if ((r4 & 2) == 0) goto L6;
        r2 = StringsKt.getLastIndex(r0);
    L6:
        if ((r4 & 4) == 0) goto L9;
        r3 = false;
    L9:
        return StringsKt.lastIndexOf(r0, r1, r2, r3);
    }

    public static final int lastIndexOf(CharSequence $this$lastIndexOf, String string, int startIndex, boolean ignoreCase) {
        Intrinsics.checkNotNullParameter($this$lastIndexOf, "<this>");
        Intrinsics.checkNotNullParameter(string, "string");
        if (ignoreCase == true) goto L9;
        if (($this$lastIndexOf instanceof String) == false) goto L9;
        return ((String) $this$lastIndexOf).lastIndexOf(string, startIndex);
    L9:
        return indexOf$StringsKt__StringsKt($this$lastIndexOf, string, startIndex, 0, ignoreCase, true);
    }

    public static /* synthetic */ boolean contains$default(CharSequence r0, CharSequence r1, boolean r2, int r3, Object r4) {
        if ((r3 & 2) == 0) goto L6;
        r2 = false;
    L6:
        return StringsKt.contains(r0, r1, r2);
    }

    public static final boolean contains(CharSequence $this$contains, CharSequence other, boolean ignoreCase) {
        Intrinsics.checkNotNullParameter($this$contains, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        if ((other instanceof String) == false) goto L9;
        if (StringsKt.indexOf$default($this$contains, (String) other, 0, ignoreCase, 2, null) < 0) goto L13;
        return true;
    L13:
        return false;
    L9:
        if (indexOf$StringsKt__StringsKt$default($this$contains, other, 0, $this$contains.length(), ignoreCase, false, 16, null) < 0) goto L12;
        return true;
    L12:
        return false;
    }

    public static /* synthetic */ boolean contains$default(CharSequence r0, char r1, boolean r2, int r3, Object r4) {
        if ((r3 & 2) == 0) goto L6;
        r2 = false;
    L6:
        return StringsKt.contains(r0, r1, r2);
    }

    public static final boolean contains(CharSequence $this$contains, char r8, boolean ignoreCase) {
        Intrinsics.checkNotNullParameter($this$contains, "<this>");
        if (StringsKt.indexOf$default($this$contains, r8, 0, ignoreCase, 2, null) < 0) goto L5;
        return true;
    L5:
        return false;
    }

    private static final boolean contains(CharSequence $this$contains, Regex regex) {
        Intrinsics.checkNotNullParameter($this$contains, "<this>");
        Intrinsics.checkNotNullParameter(regex, "regex");
        return regex.containsMatchIn($this$contains);
    }

    static /* synthetic */ Sequence rangesDelimitedBy$StringsKt__StringsKt$default(CharSequence r1, char[] r2, int r3, boolean r4, int r5, int r6, Object r7) {
        if ((r6 & 2) == 0) goto L6;
        r3 = 0;
    L6:
        if ((r6 & 4) == 0) goto L9;
        r4 = false;
    L9:
        if ((r6 & 8) == 0) goto L12;
        r5 = 0;
    L12:
        return rangesDelimitedBy$StringsKt__StringsKt(r1, r2, r3, r4, r5);
    }

    private static final Sequence<IntRange> rangesDelimitedBy$StringsKt__StringsKt(CharSequence $this$rangesDelimitedBy, final char[] delimiters, int startIndex, final boolean ignoreCase, int limit) {
        StringsKt.requireNonNegativeLimit(limit);
        return new DelimitedRangesSequence($this$rangesDelimitedBy, startIndex, limit, new StringsKt__StringsKt$$ExternalSyntheticLambda1(delimiters, ignoreCase));
    }

    private static final Pair rangesDelimitedBy$lambda$14$StringsKt__StringsKt(char[] $delimiters, boolean $ignoreCase, CharSequence $this$DelimitedRangesSequence, int currentIndex) {
        Intrinsics.checkNotNullParameter($this$DelimitedRangesSequence, "$this$DelimitedRangesSequence");
        int it = StringsKt.indexOfAny($this$DelimitedRangesSequence, $delimiters, currentIndex, $ignoreCase);
        if (it >= 0) goto L6;
        return null;
    L6:
        return TuplesKt.to(Integer.valueOf(it), 1);
    }

    static /* synthetic */ Sequence rangesDelimitedBy$StringsKt__StringsKt$default(CharSequence r1, String[] r2, int r3, boolean r4, int r5, int r6, Object r7) {
        if ((r6 & 2) == 0) goto L6;
        r3 = 0;
    L6:
        if ((r6 & 4) == 0) goto L9;
        r4 = false;
    L9:
        if ((r6 & 8) == 0) goto L12;
        r5 = 0;
    L12:
        return rangesDelimitedBy$StringsKt__StringsKt(r1, r2, r3, r4, r5);
    }

    private static final Sequence<IntRange> rangesDelimitedBy$StringsKt__StringsKt(CharSequence $this$rangesDelimitedBy, String[] delimiters, int startIndex, final boolean ignoreCase, int limit) {
        StringsKt.requireNonNegativeLimit(limit);
        final List delimitersList = ArraysKt.asList(delimiters);
        return new DelimitedRangesSequence($this$rangesDelimitedBy, startIndex, limit, new StringsKt__StringsKt$$ExternalSyntheticLambda2(delimitersList, ignoreCase));
    }

    private static final Pair rangesDelimitedBy$lambda$16$StringsKt__StringsKt(List $delimitersList, boolean $ignoreCase, CharSequence $this$DelimitedRangesSequence, int currentIndex) {
        Intrinsics.checkNotNullParameter($this$DelimitedRangesSequence, "$this$DelimitedRangesSequence");
        Pair<Integer, String> r0 = findAnyOf$StringsKt__StringsKt($this$DelimitedRangesSequence, $delimitersList, currentIndex, $ignoreCase, false);
        if (r0 == null) goto L5;
        Pair it = TuplesKt.to(r0.getFirst(), Integer.valueOf(r0.getSecond().length()));
        return it;
    L5:
        return null;
    }

    public static final void requireNonNegativeLimit(int limit) {
        if (limit < 0) goto L4;
        boolean r0 = true;
    L5:
        if (r0 == false) goto L8;
        return;
    L8:
        throw new IllegalArgumentException(("Limit must be non-negative, but was " + limit).toString());
    L4:
        r0 = false;
        goto L5
    }

    public static /* synthetic */ Sequence splitToSequence$default(CharSequence r1, String[] r2, boolean r3, int r4, int r5, Object r6) {
        if ((r5 & 2) == 0) goto L6;
        r3 = false;
    L6:
        if ((r5 & 4) == 0) goto L9;
        r4 = 0;
    L9:
        return StringsKt.splitToSequence(r1, r2, r3, r4);
    }

    public static final Sequence<String> splitToSequence(final CharSequence $this$splitToSequence, String[] delimiters, boolean ignoreCase, int limit) {
        Intrinsics.checkNotNullParameter($this$splitToSequence, "<this>");
        Intrinsics.checkNotNullParameter(delimiters, "delimiters");
        return SequencesKt.map(rangesDelimitedBy$StringsKt__StringsKt$default($this$splitToSequence, delimiters, 0, ignoreCase, limit, 2, null), new StringsKt__StringsKt$$ExternalSyntheticLambda3($this$splitToSequence));
    }

    private static final String splitToSequence$lambda$18$StringsKt__StringsKt(CharSequence $this_splitToSequence, IntRange it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return StringsKt.substring($this_splitToSequence, it);
    }

    public static /* synthetic */ List split$default(CharSequence r1, String[] r2, boolean r3, int r4, int r5, Object r6) {
        if ((r5 & 2) == 0) goto L6;
        r3 = false;
    L6:
        if ((r5 & 4) == 0) goto L9;
        r4 = 0;
    L9:
        return StringsKt.split(r1, r2, r3, r4);
    }

    public static final List<String> split(CharSequence $this$split, String[] delimiters, boolean ignoreCase, int limit) {
        Intrinsics.checkNotNullParameter($this$split, "<this>");
        Intrinsics.checkNotNullParameter(delimiters, "delimiters");
        boolean r1 = true;
        if (delimiters.length != 1) goto L11;
        String delimiter = delimiters[0];
        if (delimiter.length() == 0) goto L8;
        r1 = false;
    L8:
        if (r1 == true) goto L11;
        return split$StringsKt__StringsKt($this$split, delimiter, ignoreCase, limit);
    L11:
        Iterable $this$map$iv = SequencesKt.asIterable(rangesDelimitedBy$StringsKt__StringsKt$default($this$split, delimiters, 0, ignoreCase, limit, 2, null));
        Collection destination$iv$iv = new ArrayList(CollectionsKt.collectionSizeOrDefault($this$map$iv, 10));
        Iterator r2 = $this$map$iv.iterator();
    L13:
        if (r2.hasNext() == false) goto L16;
        Object item$iv$iv = r2.next();
        IntRange it = (IntRange) item$iv$iv;
        destination$iv$iv.add(StringsKt.substring($this$split, it));
        goto L13
    L16:
        return (List) destination$iv$iv;
    }

    public static /* synthetic */ Sequence splitToSequence$default(CharSequence r1, char[] r2, boolean r3, int r4, int r5, Object r6) {
        if ((r5 & 2) == 0) goto L6;
        r3 = false;
    L6:
        if ((r5 & 4) == 0) goto L9;
        r4 = 0;
    L9:
        return StringsKt.splitToSequence(r1, r2, r3, r4);
    }

    public static final Sequence<String> splitToSequence(final CharSequence $this$splitToSequence, char[] delimiters, boolean ignoreCase, int limit) {
        Intrinsics.checkNotNullParameter($this$splitToSequence, "<this>");
        Intrinsics.checkNotNullParameter(delimiters, "delimiters");
        return SequencesKt.map(rangesDelimitedBy$StringsKt__StringsKt$default($this$splitToSequence, delimiters, 0, ignoreCase, limit, 2, null), new StringsKt__StringsKt$$ExternalSyntheticLambda0($this$splitToSequence));
    }

    private static final String splitToSequence$lambda$20$StringsKt__StringsKt(CharSequence $this_splitToSequence, IntRange it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return StringsKt.substring($this_splitToSequence, it);
    }

    public static /* synthetic */ List split$default(CharSequence r1, char[] r2, boolean r3, int r4, int r5, Object r6) {
        if ((r5 & 2) == 0) goto L6;
        r3 = false;
    L6:
        if ((r5 & 4) == 0) goto L9;
        r4 = 0;
    L9:
        return StringsKt.split(r1, r2, r3, r4);
    }

    public static final List<String> split(CharSequence $this$split, char[] delimiters, boolean ignoreCase, int limit) {
        Intrinsics.checkNotNullParameter($this$split, "<this>");
        Intrinsics.checkNotNullParameter(delimiters, "delimiters");
        if (delimiters.length == 1) goto L5;
        Iterable $this$map$iv = SequencesKt.asIterable(rangesDelimitedBy$StringsKt__StringsKt$default($this$split, delimiters, 0, ignoreCase, limit, 2, null));
        Collection destination$iv$iv = new ArrayList(CollectionsKt.collectionSizeOrDefault($this$map$iv, 10));
        Iterator r3 = $this$map$iv.iterator();
    L8:
        if (r3.hasNext() == false) goto L11;
        Object item$iv$iv = r3.next();
        IntRange it = (IntRange) item$iv$iv;
        destination$iv$iv.add(StringsKt.substring($this$split, it));
        goto L8
    L11:
        return (List) destination$iv$iv;
    L5:
        return split$StringsKt__StringsKt($this$split, String.valueOf(delimiters[0]), ignoreCase, limit);
    }

    private static final List<String> split$StringsKt__StringsKt(CharSequence $this$split, String delimiter, boolean ignoreCase, int limit) {
        StringsKt.requireNonNegativeLimit(limit);
        int currentOffset = 0;
        int nextIndex = StringsKt.indexOf($this$split, delimiter, 0, ignoreCase);
        if (nextIndex == (-1)) goto L23;
        boolean isLimited = true;
        if (limit == 1) goto L23;
        if (limit > 0) goto L10;
        isLimited = false;
    L10:
        int r5 = 10;
        if (isLimited == false) goto L13;
        r5 = RangesKt.coerceAtMost(limit, 10);
    L13:
        ArrayList result = new ArrayList(r5);
    L14:
        result.add($this$split.subSequence(currentOffset, nextIndex).toString());
        currentOffset = nextIndex + delimiter.length();
        if (isLimited == true) goto L17;
    L18:
        nextIndex = StringsKt.indexOf($this$split, delimiter, currentOffset, ignoreCase);
        if (nextIndex != (-1)) goto L14;
    L20:
        result.add($this$split.subSequence(currentOffset, $this$split.length()).toString());
        return result;
    L17:
        if (result.size() == (limit - 1)) goto L20;
    L23:
        return CollectionsKt.listOf($this$split.toString());
    }

    static /* synthetic */ List split$default(CharSequence $this$split_u24default, Regex regex, int limit, int r3, Object r4) {
        if ((r3 & 2) == 0) goto L5;
        limit = 0;
    L5:
        Intrinsics.checkNotNullParameter($this$split_u24default, "<this>");
        Intrinsics.checkNotNullParameter(regex, "regex");
        return regex.split($this$split_u24default, limit);
    }

    private static final List<String> split(CharSequence $this$split, Regex regex, int limit) {
        Intrinsics.checkNotNullParameter($this$split, "<this>");
        Intrinsics.checkNotNullParameter(regex, "regex");
        return regex.split($this$split, limit);
    }

    static /* synthetic */ Sequence splitToSequence$default(CharSequence $this$splitToSequence_u24default, Regex regex, int limit, int r3, Object r4) {
        if ((r3 & 2) == 0) goto L5;
        limit = 0;
    L5:
        Intrinsics.checkNotNullParameter($this$splitToSequence_u24default, "<this>");
        Intrinsics.checkNotNullParameter(regex, "regex");
        return regex.splitToSequence($this$splitToSequence_u24default, limit);
    }

    private static final Sequence<String> splitToSequence(CharSequence $this$splitToSequence, Regex regex, int limit) {
        Intrinsics.checkNotNullParameter($this$splitToSequence, "<this>");
        Intrinsics.checkNotNullParameter(regex, "regex");
        return regex.splitToSequence($this$splitToSequence, limit);
    }

    public static final Sequence<String> lineSequence(final CharSequence $this$lineSequence) {
        Intrinsics.checkNotNullParameter($this$lineSequence, "<this>");
        return new StringsKt__StringsKt$lineSequence$$inlined$Sequence$1($this$lineSequence);
    }

    public static final List<String> lines(CharSequence $this$lines) {
        Intrinsics.checkNotNullParameter($this$lines, "<this>");
        return SequencesKt.toList(StringsKt.lineSequence($this$lines));
    }

    public static final boolean contentEqualsIgnoreCaseImpl(CharSequence $this$contentEqualsIgnoreCaseImpl, CharSequence other) {
        if (($this$contentEqualsIgnoreCaseImpl instanceof String) == true) goto L5;
    L8:
        if ($this$contentEqualsIgnoreCaseImpl != other) goto L11;
        return true;
    L11:
        if ($this$contentEqualsIgnoreCaseImpl == null) goto L23;
        if (other == null) goto L23;
        if ($this$contentEqualsIgnoreCaseImpl.length() != other.length()) goto L23;
        int i = 0;
        int r3 = $this$contentEqualsIgnoreCaseImpl.length();
    L17:
        if (i >= r3) goto L22;
        if (CharsKt.equals($this$contentEqualsIgnoreCaseImpl.charAt(i), other.charAt(i), true) == false) goto L20;
        i = i + 1;
        goto L17
    L20:
        return false;
    L22:
        return true;
    L23:
        return false;
    L5:
        if ((other instanceof String) == false) goto L8;
        return StringsKt.equals((String) $this$contentEqualsIgnoreCaseImpl, (String) other, true);
    }

    public static final boolean contentEqualsImpl(CharSequence $this$contentEqualsImpl, CharSequence other) {
        if (($this$contentEqualsImpl instanceof String) == false) goto L9;
        if ((other instanceof String) == false) goto L9;
        return Intrinsics.areEqual($this$contentEqualsImpl, other);
    L9:
        if ($this$contentEqualsImpl != other) goto L12;
        return true;
    L12:
        if ($this$contentEqualsImpl == null) goto L24;
        if (other == null) goto L24;
        if ($this$contentEqualsImpl.length() != other.length()) goto L24;
        int i = 0;
        int r3 = $this$contentEqualsImpl.length();
    L18:
        if (i >= r3) goto L23;
        if ($this$contentEqualsImpl.charAt(i) != other.charAt(i)) goto L21;
        i = i + 1;
        goto L18
    L21:
        return false;
    L23:
        return true;
    L24:
        return false;
    }

    public static final boolean toBooleanStrict(String $this$toBooleanStrict) {
        Intrinsics.checkNotNullParameter($this$toBooleanStrict, "<this>");
        if (Intrinsics.areEqual($this$toBooleanStrict, "true") == false) goto L6;
        return true;
    L6:
        if (Intrinsics.areEqual($this$toBooleanStrict, "false") == false) goto L10;
        return false;
    L10:
        throw new IllegalArgumentException("The string doesn't represent a boolean value: " + $this$toBooleanStrict);
    }

    public static final Boolean toBooleanStrictOrNull(String $this$toBooleanStrictOrNull) {
        Intrinsics.checkNotNullParameter($this$toBooleanStrictOrNull, "<this>");
        if (Intrinsics.areEqual($this$toBooleanStrictOrNull, "true") == false) goto L6;
        return true;
    L6:
        if (Intrinsics.areEqual($this$toBooleanStrictOrNull, "false") == true) goto L11;
        return null;
    L11:
        return false;
    }
}
