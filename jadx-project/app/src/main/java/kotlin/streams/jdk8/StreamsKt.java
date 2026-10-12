package kotlin.streams.jdk8;

import java.util.List;
import java.util.Spliterator;
import java.util.Spliterators;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;

/* JADX INFO: compiled from: Streams.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000.\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\u001a\u001e\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0003H\u0007\u001a\u0012\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00040\u0001*\u00020\u0005H\u0007\u001a\u0012\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001*\u00020\u0007H\u0007\u001a\u0012\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\b0\u0001*\u00020\tH\u0007\u001a\u001e\u0010\n\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0003\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0001H\u0007\u001a\u001e\u0010\u000b\u001a\b\u0012\u0004\u0012\u0002H\u00020\f\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0003H\u0007\u001a\u0012\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00040\f*\u00020\u0005H\u0007\u001a\u0012\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00060\f*\u00020\u0007H\u0007\u001a\u0012\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\b0\f*\u00020\tH\u0007¨\u0006\r"}, d2 = {"asSequence", "Lkotlin/sequences/Sequence;", "T", "Ljava/util/stream/Stream;", "", "Ljava/util/stream/IntStream;", "", "Ljava/util/stream/LongStream;", "", "Ljava/util/stream/DoubleStream;", "asStream", "toList", "", "kotlin-stdlib-jdk8"}, k = 2, mv = {2, 2, 0}, pn = "kotlin.streams", xi = 48)
public final class StreamsKt {
    public static final <T> Sequence<T> asSequence(final Stream<T> r1) {
        Intrinsics.checkNotNullParameter(r1, "<this>");
        return new StreamsKt$asSequence$$inlined$Sequence$1(r1);
    }

    public static final Sequence<Integer> asSequence(final IntStream $this$asSequence) {
        Intrinsics.checkNotNullParameter($this$asSequence, "<this>");
        return new StreamsKt$asSequence$$inlined$Sequence$2($this$asSequence);
    }

    public static final Sequence<Long> asSequence(final LongStream $this$asSequence) {
        Intrinsics.checkNotNullParameter($this$asSequence, "<this>");
        return new StreamsKt$asSequence$$inlined$Sequence$3($this$asSequence);
    }

    public static final Sequence<Double> asSequence(final DoubleStream $this$asSequence) {
        Intrinsics.checkNotNullParameter($this$asSequence, "<this>");
        return new StreamsKt$asSequence$$inlined$Sequence$4($this$asSequence);
    }

    public static final <T> Stream<T> asStream(final Sequence<? extends T> r3) {
        Intrinsics.checkNotNullParameter(r3, "<this>");
        Stream<T> r0 = StreamSupport.stream(new StreamsKt$$ExternalSyntheticLambda0(r3), 16, false);
        Intrinsics.checkNotNullExpressionValue(r0, "stream(...)");
        return r0;
    }

    static final Spliterator asStream$lambda$4(Sequence $this_asStream) {
        return Spliterators.spliteratorUnknownSize($this_asStream.iterator(), 16);
    }

    public static final <T> List<T> toList(Stream<T> r2) {
        Intrinsics.checkNotNullParameter(r2, "<this>");
        Object r0 = r2.collect(Collectors.toList());
        Intrinsics.checkNotNullExpressionValue(r0, "collect(...)");
        return (List) r0;
    }

    public static final List<Integer> toList(IntStream $this$toList) {
        Intrinsics.checkNotNullParameter($this$toList, "<this>");
        int[] r0 = $this$toList.toArray();
        Intrinsics.checkNotNullExpressionValue(r0, "toArray(...)");
        return ArraysKt.asList(r0);
    }

    public static final List<Long> toList(LongStream $this$toList) {
        Intrinsics.checkNotNullParameter($this$toList, "<this>");
        long[] r0 = $this$toList.toArray();
        Intrinsics.checkNotNullExpressionValue(r0, "toArray(...)");
        return ArraysKt.asList(r0);
    }

    public static final List<Double> toList(DoubleStream $this$toList) {
        Intrinsics.checkNotNullParameter($this$toList, "<this>");
        double[] r0 = $this$toList.toArray();
        Intrinsics.checkNotNullExpressionValue(r0, "toArray(...)");
        return ArraysKt.asList(r0);
    }
}
