package kotlin.text;

import java.util.Collections;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.Set;
import java.util.regex.Matcher;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt;

/* JADX INFO: compiled from: Regex.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000>\n\u0000\n\u0002\u0010\b\n\u0002\u0010\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0000\n\u0002\u0010\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0012\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0002\u001a-\u0010\u0004\u001a\b\u0012\u0004\u0012\u0002H\u00060\u0005\"\u0014\b\u0000\u0010\u0006\u0018\u0001*\u00020\u0003*\b\u0012\u0004\u0012\u0002H\u00060\u00072\u0006\u0010\b\u001a\u00020\u0001H\u0082\b\u001a\u001e\u0010\t\u001a\u0004\u0018\u00010\n*\u00020\u000b2\u0006\u0010\f\u001a\u00020\u00012\u0006\u0010\r\u001a\u00020\u000eH\u0002\u001a\u0016\u0010\u000f\u001a\u0004\u0018\u00010\n*\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000eH\u0002\u001a\f\u0010\u0010\u001a\u00020\u0011*\u00020\u0012H\u0002\u001a\u0014\u0010\u0010\u001a\u00020\u0011*\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0001H\u0002¨\u0006\u0014"}, d2 = {"toInt", "", "", "Lkotlin/text/FlagEnum;", "fromInt", "", "T", "", "value", "findNext", "Lkotlin/text/MatchResult;", "Ljava/util/regex/Matcher;", "from", "input", "", "matchEntire", "range", "Lkotlin/ranges/IntRange;", "Ljava/util/regex/MatchResult;", "groupIndex", "kotlin-stdlib"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class RegexKt {
    public static final /* synthetic */ MatchResult access$findNext(Matcher $receiver, int from, CharSequence input) {
        return findNext($receiver, from, input);
    }

    public static final /* synthetic */ MatchResult access$matchEntire(Matcher $receiver, CharSequence input) {
        return matchEntire($receiver, input);
    }

    public static final /* synthetic */ IntRange access$range(java.util.regex.MatchResult $receiver) {
        return range($receiver);
    }

    public static final /* synthetic */ IntRange access$range(java.util.regex.MatchResult $receiver, int groupIndex) {
        return range($receiver, groupIndex);
    }

    public static final /* synthetic */ int access$toInt(Iterable $receiver) {
        return toInt($receiver);
    }

    private static final int toInt(Iterable<? extends FlagEnum> r10) {
        int accumulator$iv = 0;
        Iterator<? extends FlagEnum> r4 = r10.iterator();
    L4:
        if (r4.hasNext() == false) goto L7;
        Object element$iv = r4.next();
        FlagEnum option = (FlagEnum) element$iv;
        int value = accumulator$iv;
        accumulator$iv = value | option.getValue();
        goto L4
    L7:
        return accumulator$iv;
    }

    private static final /* synthetic */ <T extends Enum<T> & FlagEnum> Set<T> fromInt(final int value) {
        Intrinsics.reifiedOperationMarker(4, "T");
        EnumSet r1 = EnumSet.allOf(Enum.class);
        EnumSet $this$fromInt_u24lambda_u241 = r1;
        Intrinsics.checkNotNull($this$fromInt_u24lambda_u241);
        Intrinsics.needClassReification();
        CollectionsKt.retainAll($this$fromInt_u24lambda_u241, new RegexKt$fromInt$1$1(value));
        Set<T> r2 = Collections.unmodifiableSet(r1);
        Intrinsics.checkNotNullExpressionValue(r2, "unmodifiableSet(...)");
        return r2;
    }

    private static final MatchResult findNext(Matcher $this$findNext, int from, CharSequence input) {
        if ($this$findNext.find(from) == true) goto L6;
        return null;
    L6:
        return new MatcherMatchResult($this$findNext, input);
    }

    private static final MatchResult matchEntire(Matcher $this$matchEntire, CharSequence input) {
        if ($this$matchEntire.matches() == true) goto L6;
        return null;
    L6:
        return new MatcherMatchResult($this$matchEntire, input);
    }

    private static final IntRange range(java.util.regex.MatchResult $this$range) {
        return RangesKt.until($this$range.start(), $this$range.end());
    }

    private static final IntRange range(java.util.regex.MatchResult $this$range, int groupIndex) {
        return RangesKt.until($this$range.start(groupIndex), $this$range.end(groupIndex));
    }
}
