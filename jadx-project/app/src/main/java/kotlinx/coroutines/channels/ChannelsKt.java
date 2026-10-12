package kotlinx.coroutines.channels;

import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ReplaceWith;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlinx.coroutines.selects.SelectClause1;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"kotlinx/coroutines/channels/ChannelsKt__ChannelsKt", "kotlinx/coroutines/channels/ChannelsKt__Channels_commonKt", "kotlinx/coroutines/channels/ChannelsKt__DeprecatedKt"}, k = 4, mv = {1, 9, 0}, xi = 48)
public final class ChannelsKt {
    public static final String DEFAULT_CLOSE_MESSAGE = "Channel was closed";

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Binary compatibility")
    public static final /* synthetic */ Object any(ReceiveChannel $this$any, Continuation $completion) {
        return ChannelsKt__DeprecatedKt.any($this$any, $completion);
    }

    public static final void cancelConsumed(ReceiveChannel<?> r0, Throwable cause) {
        ChannelsKt__Channels_commonKt.cancelConsumed(r0, cause);
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "BroadcastChannel is deprecated in the favour of SharedFlow and is no longer supported")
    public static final <E, R> R consume(BroadcastChannel<E> r1, Function1<? super ReceiveChannel<? extends E>, ? extends R> r2) {
        return (R) ChannelsKt__DeprecatedKt.consume(r1, r2);
    }

    public static final <E, R> R consume(ReceiveChannel<? extends E> r1, Function1<? super ReceiveChannel<? extends E>, ? extends R> r2) {
        return (R) ChannelsKt__Channels_commonKt.consume(r1, r2);
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "BroadcastChannel is deprecated in the favour of SharedFlow and is no longer supported")
    public static final <E> Object consumeEach(BroadcastChannel<E> r1, Function1<? super E, Unit> r2, Continuation<? super Unit> r3) {
        return ChannelsKt__DeprecatedKt.consumeEach(r1, r2, r3);
    }

    public static final <E> Object consumeEach(ReceiveChannel<? extends E> r1, Function1<? super E, Unit> r2, Continuation<? super Unit> r3) {
        return ChannelsKt__Channels_commonKt.consumeEach(r1, r2, r3);
    }

    public static final Function1<Throwable, Unit> consumes(ReceiveChannel<?> r1) {
        return ChannelsKt__DeprecatedKt.consumes(r1);
    }

    public static final Function1<Throwable, Unit> consumesAll(ReceiveChannel<?>... r1) {
        return ChannelsKt__DeprecatedKt.consumesAll(r1);
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Binary compatibility")
    public static final /* synthetic */ Object count(ReceiveChannel $this$count, Continuation $completion) {
        return ChannelsKt__DeprecatedKt.count($this$count, $completion);
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Binary compatibility")
    public static final /* synthetic */ ReceiveChannel distinct(ReceiveChannel $this$distinct) {
        return ChannelsKt__DeprecatedKt.distinct($this$distinct);
    }

    public static final <E, K> ReceiveChannel<E> distinctBy(ReceiveChannel<? extends E> r1, CoroutineContext context, Function2<? super E, ? super Continuation<? super K>, ? extends Object> r3) {
        return ChannelsKt__DeprecatedKt.distinctBy(r1, context, r3);
    }

    public static /* synthetic */ ReceiveChannel distinctBy$default(ReceiveChannel r0, CoroutineContext r1, Function2 r2, int r3, Object r4) {
        return ChannelsKt__DeprecatedKt.distinctBy$default(r0, r1, r2, r3, r4);
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Binary compatibility")
    public static final /* synthetic */ ReceiveChannel drop(ReceiveChannel $this$drop, int n, CoroutineContext context) {
        return ChannelsKt__DeprecatedKt.drop($this$drop, n, context);
    }

    public static /* synthetic */ ReceiveChannel drop$default(ReceiveChannel r0, int r1, CoroutineContext r2, int r3, Object r4) {
        return ChannelsKt__DeprecatedKt.drop$default(r0, r1, r2, r3, r4);
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Binary compatibility")
    public static final /* synthetic */ ReceiveChannel dropWhile(ReceiveChannel $this$dropWhile, CoroutineContext context, Function2 predicate) {
        return ChannelsKt__DeprecatedKt.dropWhile($this$dropWhile, context, predicate);
    }

    public static /* synthetic */ ReceiveChannel dropWhile$default(ReceiveChannel r0, CoroutineContext r1, Function2 r2, int r3, Object r4) {
        return ChannelsKt__DeprecatedKt.dropWhile$default(r0, r1, r2, r3, r4);
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Binary compatibility")
    public static final /* synthetic */ Object elementAt(ReceiveChannel $this$elementAt, int index, Continuation $completion) {
        return ChannelsKt__DeprecatedKt.elementAt($this$elementAt, index, $completion);
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Binary compatibility")
    public static final /* synthetic */ Object elementAtOrNull(ReceiveChannel $this$elementAtOrNull, int index, Continuation $completion) {
        return ChannelsKt__DeprecatedKt.elementAtOrNull($this$elementAtOrNull, index, $completion);
    }

    public static final <E> ReceiveChannel<E> filter(ReceiveChannel<? extends E> r1, CoroutineContext context, Function2<? super E, ? super Continuation<? super Boolean>, ? extends Object> r3) {
        return ChannelsKt__DeprecatedKt.filter(r1, context, r3);
    }

    public static /* synthetic */ ReceiveChannel filter$default(ReceiveChannel r0, CoroutineContext r1, Function2 r2, int r3, Object r4) {
        return ChannelsKt__DeprecatedKt.filter$default(r0, r1, r2, r3, r4);
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Binary compatibility")
    public static final /* synthetic */ ReceiveChannel filterIndexed(ReceiveChannel $this$filterIndexed, CoroutineContext context, Function3 predicate) {
        return ChannelsKt__DeprecatedKt.filterIndexed($this$filterIndexed, context, predicate);
    }

    public static /* synthetic */ ReceiveChannel filterIndexed$default(ReceiveChannel r0, CoroutineContext r1, Function3 r2, int r3, Object r4) {
        return ChannelsKt__DeprecatedKt.filterIndexed$default(r0, r1, r2, r3, r4);
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Binary compatibility")
    public static final /* synthetic */ ReceiveChannel filterNot(ReceiveChannel $this$filterNot, CoroutineContext context, Function2 predicate) {
        return ChannelsKt__DeprecatedKt.filterNot($this$filterNot, context, predicate);
    }

    public static /* synthetic */ ReceiveChannel filterNot$default(ReceiveChannel r0, CoroutineContext r1, Function2 r2, int r3, Object r4) {
        return ChannelsKt__DeprecatedKt.filterNot$default(r0, r1, r2, r3, r4);
    }

    public static final <E> ReceiveChannel<E> filterNotNull(ReceiveChannel<? extends E> r1) {
        return ChannelsKt__DeprecatedKt.filterNotNull(r1);
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Binary compatibility")
    public static final /* synthetic */ Object filterNotNullTo(ReceiveChannel $this$filterNotNullTo, Collection destination, Continuation $completion) {
        return ChannelsKt__DeprecatedKt.filterNotNullTo($this$filterNotNullTo, destination, $completion);
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Binary compatibility")
    public static final /* synthetic */ Object filterNotNullTo(ReceiveChannel $this$filterNotNullTo, SendChannel destination, Continuation $completion) {
        return ChannelsKt__DeprecatedKt.filterNotNullTo($this$filterNotNullTo, destination, $completion);
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Binary compatibility")
    public static final /* synthetic */ Object first(ReceiveChannel $this$first, Continuation $completion) {
        return ChannelsKt__DeprecatedKt.first($this$first, $completion);
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Binary compatibility")
    public static final /* synthetic */ Object firstOrNull(ReceiveChannel $this$firstOrNull, Continuation $completion) {
        return ChannelsKt__DeprecatedKt.firstOrNull($this$firstOrNull, $completion);
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Binary compatibility")
    public static final /* synthetic */ ReceiveChannel flatMap(ReceiveChannel $this$flatMap, CoroutineContext context, Function2 transform) {
        return ChannelsKt__DeprecatedKt.flatMap($this$flatMap, context, transform);
    }

    public static /* synthetic */ ReceiveChannel flatMap$default(ReceiveChannel r0, CoroutineContext r1, Function2 r2, int r3, Object r4) {
        return ChannelsKt__DeprecatedKt.flatMap$default(r0, r1, r2, r3, r4);
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Binary compatibility")
    public static final /* synthetic */ Object indexOf(ReceiveChannel $this$indexOf, Object element, Continuation $completion) {
        return ChannelsKt__DeprecatedKt.indexOf($this$indexOf, element, $completion);
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Binary compatibility")
    public static final /* synthetic */ Object last(ReceiveChannel $this$last, Continuation $completion) {
        return ChannelsKt__DeprecatedKt.last($this$last, $completion);
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Binary compatibility")
    public static final /* synthetic */ Object lastIndexOf(ReceiveChannel $this$lastIndexOf, Object element, Continuation $completion) {
        return ChannelsKt__DeprecatedKt.lastIndexOf($this$lastIndexOf, element, $completion);
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Binary compatibility")
    public static final /* synthetic */ Object lastOrNull(ReceiveChannel $this$lastOrNull, Continuation $completion) {
        return ChannelsKt__DeprecatedKt.lastOrNull($this$lastOrNull, $completion);
    }

    public static final <E, R> ReceiveChannel<R> map(ReceiveChannel<? extends E> r1, CoroutineContext context, Function2<? super E, ? super Continuation<? super R>, ? extends Object> r3) {
        return ChannelsKt__DeprecatedKt.map(r1, context, r3);
    }

    public static /* synthetic */ ReceiveChannel map$default(ReceiveChannel r0, CoroutineContext r1, Function2 r2, int r3, Object r4) {
        return ChannelsKt__DeprecatedKt.map$default(r0, r1, r2, r3, r4);
    }

    public static final <E, R> ReceiveChannel<R> mapIndexed(ReceiveChannel<? extends E> r1, CoroutineContext context, Function3<? super Integer, ? super E, ? super Continuation<? super R>, ? extends Object> r3) {
        return ChannelsKt__DeprecatedKt.mapIndexed(r1, context, r3);
    }

    public static /* synthetic */ ReceiveChannel mapIndexed$default(ReceiveChannel r0, CoroutineContext r1, Function3 r2, int r3, Object r4) {
        return ChannelsKt__DeprecatedKt.mapIndexed$default(r0, r1, r2, r3, r4);
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Binary compatibility")
    public static final /* synthetic */ ReceiveChannel mapIndexedNotNull(ReceiveChannel $this$mapIndexedNotNull, CoroutineContext context, Function3 transform) {
        return ChannelsKt__DeprecatedKt.mapIndexedNotNull($this$mapIndexedNotNull, context, transform);
    }

    public static /* synthetic */ ReceiveChannel mapIndexedNotNull$default(ReceiveChannel r0, CoroutineContext r1, Function3 r2, int r3, Object r4) {
        return ChannelsKt__DeprecatedKt.mapIndexedNotNull$default(r0, r1, r2, r3, r4);
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Binary compatibility")
    public static final /* synthetic */ ReceiveChannel mapNotNull(ReceiveChannel $this$mapNotNull, CoroutineContext context, Function2 transform) {
        return ChannelsKt__DeprecatedKt.mapNotNull($this$mapNotNull, context, transform);
    }

    public static /* synthetic */ ReceiveChannel mapNotNull$default(ReceiveChannel r0, CoroutineContext r1, Function2 r2, int r3, Object r4) {
        return ChannelsKt__DeprecatedKt.mapNotNull$default(r0, r1, r2, r3, r4);
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Binary compatibility")
    public static final /* synthetic */ Object maxWith(ReceiveChannel $this$maxWith, Comparator comparator, Continuation $completion) {
        return ChannelsKt__DeprecatedKt.maxWith($this$maxWith, comparator, $completion);
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Binary compatibility")
    public static final /* synthetic */ Object minWith(ReceiveChannel $this$minWith, Comparator comparator, Continuation $completion) {
        return ChannelsKt__DeprecatedKt.minWith($this$minWith, comparator, $completion);
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Binary compatibility")
    public static final /* synthetic */ Object none(ReceiveChannel $this$none, Continuation $completion) {
        return ChannelsKt__DeprecatedKt.none($this$none, $completion);
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Deprecated in the favour of 'onReceiveCatching'")
    public static final /* synthetic */ SelectClause1 onReceiveOrNull(ReceiveChannel $this$onReceiveOrNull) {
        return ChannelsKt__Channels_commonKt.onReceiveOrNull($this$onReceiveOrNull);
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Deprecated in the favour of 'receiveCatching'", replaceWith = @ReplaceWith(expression = "receiveCatching().getOrNull()", imports = {}))
    public static final /* synthetic */ Object receiveOrNull(ReceiveChannel $this$receiveOrNull, Continuation $completion) {
        return ChannelsKt__Channels_commonKt.receiveOrNull($this$receiveOrNull, $completion);
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Left for binary compatibility")
    public static final /* synthetic */ ReceiveChannel requireNoNulls(ReceiveChannel $this$requireNoNulls) {
        return ChannelsKt__DeprecatedKt.requireNoNulls($this$requireNoNulls);
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Deprecated in the favour of 'trySendBlocking'. Consider handling the result of 'trySendBlocking' explicitly and rethrow exception if necessary", replaceWith = @ReplaceWith(expression = "trySendBlocking(element)", imports = {}))
    public static final /* synthetic */ void sendBlocking(SendChannel $this$sendBlocking, Object element) {
        ChannelsKt__ChannelsKt.sendBlocking($this$sendBlocking, element);
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Binary compatibility")
    public static final /* synthetic */ Object single(ReceiveChannel $this$single, Continuation $completion) {
        return ChannelsKt__DeprecatedKt.single($this$single, $completion);
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Binary compatibility")
    public static final /* synthetic */ Object singleOrNull(ReceiveChannel $this$singleOrNull, Continuation $completion) {
        return ChannelsKt__DeprecatedKt.singleOrNull($this$singleOrNull, $completion);
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Binary compatibility")
    public static final /* synthetic */ ReceiveChannel take(ReceiveChannel $this$take, int n, CoroutineContext context) {
        return ChannelsKt__DeprecatedKt.take($this$take, n, context);
    }

    public static /* synthetic */ ReceiveChannel take$default(ReceiveChannel r0, int r1, CoroutineContext r2, int r3, Object r4) {
        return ChannelsKt__DeprecatedKt.take$default(r0, r1, r2, r3, r4);
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Binary compatibility")
    public static final /* synthetic */ ReceiveChannel takeWhile(ReceiveChannel $this$takeWhile, CoroutineContext context, Function2 predicate) {
        return ChannelsKt__DeprecatedKt.takeWhile($this$takeWhile, context, predicate);
    }

    public static /* synthetic */ ReceiveChannel takeWhile$default(ReceiveChannel r0, CoroutineContext r1, Function2 r2, int r3, Object r4) {
        return ChannelsKt__DeprecatedKt.takeWhile$default(r0, r1, r2, r3, r4);
    }

    public static final <E, C extends SendChannel<? super E>> Object toChannel(ReceiveChannel<? extends E> r1, C r2, Continuation<? super C> r3) {
        return ChannelsKt__DeprecatedKt.toChannel(r1, r2, r3);
    }

    public static final <E, C extends Collection<? super E>> Object toCollection(ReceiveChannel<? extends E> r1, C r2, Continuation<? super C> r3) {
        return ChannelsKt__DeprecatedKt.toCollection(r1, r2, r3);
    }

    public static final <E> Object toList(ReceiveChannel<? extends E> r1, Continuation<? super List<? extends E>> r2) {
        return ChannelsKt__Channels_commonKt.toList(r1, r2);
    }

    public static final <K, V, M extends Map<? super K, ? super V>> Object toMap(ReceiveChannel<? extends Pair<? extends K, ? extends V>> r1, M r2, Continuation<? super M> r3) {
        return ChannelsKt__DeprecatedKt.toMap(r1, r2, r3);
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Binary compatibility")
    public static final /* synthetic */ Object toMap(ReceiveChannel $this$toMap, Continuation $completion) {
        return ChannelsKt__DeprecatedKt.toMap($this$toMap, $completion);
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Binary compatibility")
    public static final /* synthetic */ Object toMutableList(ReceiveChannel $this$toMutableList, Continuation $completion) {
        return ChannelsKt__DeprecatedKt.toMutableList($this$toMutableList, $completion);
    }

    public static final <E> Object toMutableSet(ReceiveChannel<? extends E> r1, Continuation<? super Set<E>> r2) {
        return ChannelsKt__DeprecatedKt.toMutableSet(r1, r2);
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Binary compatibility")
    public static final /* synthetic */ Object toSet(ReceiveChannel $this$toSet, Continuation $completion) {
        return ChannelsKt__DeprecatedKt.toSet($this$toSet, $completion);
    }

    public static final <E> Object trySendBlocking(SendChannel<? super E> r1, E r2) {
        return ChannelsKt__ChannelsKt.trySendBlocking(r1, r2);
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Binary compatibility")
    public static final /* synthetic */ ReceiveChannel withIndex(ReceiveChannel $this$withIndex, CoroutineContext context) {
        return ChannelsKt__DeprecatedKt.withIndex($this$withIndex, context);
    }

    public static /* synthetic */ ReceiveChannel withIndex$default(ReceiveChannel r0, CoroutineContext r1, int r2, Object r3) {
        return ChannelsKt__DeprecatedKt.withIndex$default(r0, r1, r2, r3);
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Binary compatibility")
    public static final /* synthetic */ ReceiveChannel zip(ReceiveChannel $this$zip, ReceiveChannel other) {
        return ChannelsKt__DeprecatedKt.zip($this$zip, other);
    }

    public static final <E, R, V> ReceiveChannel<V> zip(ReceiveChannel<? extends E> r1, ReceiveChannel<? extends R> r2, CoroutineContext context, Function2<? super E, ? super R, ? extends V> r4) {
        return ChannelsKt__DeprecatedKt.zip(r1, r2, context, r4);
    }

    public static /* synthetic */ ReceiveChannel zip$default(ReceiveChannel r0, ReceiveChannel r1, CoroutineContext r2, Function2 r3, int r4, Object r5) {
        return ChannelsKt__DeprecatedKt.zip$default(r0, r1, r2, r3, r4, r5);
    }
}
