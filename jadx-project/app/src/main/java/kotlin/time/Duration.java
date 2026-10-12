package kotlin.time;

import androidx.autofill.HintConstants;
import androidx.collection.SieveCacheKt;
import kotlin.Metadata;
import kotlin.comparisons.ComparisonsKt;
import kotlin.jvm.JvmInline;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.functions.Function5;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt;
import kotlin.ranges.LongRange;
import kotlin.ranges.RangesKt;
import kotlin.text.StringsKt;

/* JADX INFO: compiled from: Duration.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u0006\n\u0002\b\u0019\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b%\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087@\u0018\u0000 \u0089\u00012\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0002\u0089\u0001B\u0011\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\f\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0011\u0010\u000fJ\u0010\u0010\u0016\u001a\u00020\u0000H\u0086\u0002¢\u0006\u0004\b\u0017\u0010\u0005J\u0018\u0010\u0018\u001a\u00020\u00002\u0006\u0010\u0019\u001a\u00020\u0000H\u0086\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u001f\u0010\u001c\u001a\u00020\u00002\u0006\u0010\u001d\u001a\u00020\u00032\u0006\u0010\u001e\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u001f\u0010 J\u0018\u0010!\u001a\u00020\u00002\u0006\u0010\u0019\u001a\u00020\u0000H\u0086\u0002¢\u0006\u0004\b\"\u0010\u001bJ\u0018\u0010#\u001a\u00020\u00002\u0006\u0010$\u001a\u00020\tH\u0086\u0002¢\u0006\u0004\b%\u0010&J\u0018\u0010#\u001a\u00020\u00002\u0006\u0010$\u001a\u00020'H\u0086\u0002¢\u0006\u0004\b%\u0010(J\u0018\u0010)\u001a\u00020\u00002\u0006\u0010$\u001a\u00020\tH\u0086\u0002¢\u0006\u0004\b*\u0010&J\u0018\u0010)\u001a\u00020\u00002\u0006\u0010$\u001a\u00020'H\u0086\u0002¢\u0006\u0004\b*\u0010(J\u0018\u0010)\u001a\u00020'2\u0006\u0010\u0019\u001a\u00020\u0000H\u0086\u0002¢\u0006\u0004\b+\u0010,J\u0017\u0010-\u001a\u00020\u00002\u0006\u0010.\u001a\u00020\u0013H\u0000¢\u0006\u0004\b/\u00100J\r\u00101\u001a\u00020\r¢\u0006\u0004\b2\u0010\u000fJ\r\u00103\u001a\u00020\r¢\u0006\u0004\b4\u0010\u000fJ\r\u00105\u001a\u00020\r¢\u0006\u0004\b6\u0010\u000fJ\r\u00107\u001a\u00020\r¢\u0006\u0004\b8\u0010\u000fJ\u0018\u0010;\u001a\u00020\t2\u0006\u0010\u0019\u001a\u00020\u0000H\u0096\u0002¢\u0006\u0004\b<\u0010=J\u009d\u0001\u0010>\u001a\u0002H?\"\u0004\b\u0000\u0010?2u\u0010@\u001aq\u0012\u0013\u0012\u00110\u0003¢\u0006\f\bB\u0012\b\bC\u0012\u0004\b\b(D\u0012\u0013\u0012\u00110\t¢\u0006\f\bB\u0012\b\bC\u0012\u0004\b\b(E\u0012\u0013\u0012\u00110\t¢\u0006\f\bB\u0012\b\bC\u0012\u0004\b\b(F\u0012\u0013\u0012\u00110\t¢\u0006\f\bB\u0012\b\bC\u0012\u0004\b\b(G\u0012\u0013\u0012\u00110\t¢\u0006\f\bB\u0012\b\bC\u0012\u0004\b\b(H\u0012\u0004\u0012\u0002H?0AH\u0086\bø\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0001¢\u0006\u0004\bI\u0010JJ\u0088\u0001\u0010>\u001a\u0002H?\"\u0004\b\u0000\u0010?2`\u0010@\u001a\\\u0012\u0013\u0012\u00110\u0003¢\u0006\f\bB\u0012\b\bC\u0012\u0004\b\b(E\u0012\u0013\u0012\u00110\t¢\u0006\f\bB\u0012\b\bC\u0012\u0004\b\b(F\u0012\u0013\u0012\u00110\t¢\u0006\f\bB\u0012\b\bC\u0012\u0004\b\b(G\u0012\u0013\u0012\u00110\t¢\u0006\f\bB\u0012\b\bC\u0012\u0004\b\b(H\u0012\u0004\u0012\u0002H?0KH\u0086\bø\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0001¢\u0006\u0004\bI\u0010LJs\u0010>\u001a\u0002H?\"\u0004\b\u0000\u0010?2K\u0010@\u001aG\u0012\u0013\u0012\u00110\u0003¢\u0006\f\bB\u0012\b\bC\u0012\u0004\b\b(F\u0012\u0013\u0012\u00110\t¢\u0006\f\bB\u0012\b\bC\u0012\u0004\b\b(G\u0012\u0013\u0012\u00110\t¢\u0006\f\bB\u0012\b\bC\u0012\u0004\b\b(H\u0012\u0004\u0012\u0002H?0MH\u0086\bø\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0001¢\u0006\u0004\bI\u0010NJ^\u0010>\u001a\u0002H?\"\u0004\b\u0000\u0010?26\u0010@\u001a2\u0012\u0013\u0012\u00110\u0003¢\u0006\f\bB\u0012\b\bC\u0012\u0004\b\b(G\u0012\u0013\u0012\u00110\t¢\u0006\f\bB\u0012\b\bC\u0012\u0004\b\b(H\u0012\u0004\u0012\u0002H?0OH\u0086\bø\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0001¢\u0006\u0004\bI\u0010PJ\u0015\u0010^\u001a\u00020'2\u0006\u0010.\u001a\u00020\u0013¢\u0006\u0004\b_\u0010`J\u0015\u0010a\u001a\u00020\u00032\u0006\u0010.\u001a\u00020\u0013¢\u0006\u0004\bb\u00100J\u0015\u0010c\u001a\u00020\t2\u0006\u0010.\u001a\u00020\u0013¢\u0006\u0004\bd\u0010eJ\u000f\u0010t\u001a\u00020uH\u0016¢\u0006\u0004\bv\u0010wJA\u0010x\u001a\u00020y*\u00060zj\u0002`{2\u0006\u0010|\u001a\u00020\t2\u0006\u0010}\u001a\u00020\t2\u0006\u0010~\u001a\u00020\t2\u0006\u0010.\u001a\u00020u2\u0006\u0010\u007f\u001a\u00020\rH\u0002¢\u0006\u0006\b\u0080\u0001\u0010\u0081\u0001J!\u0010t\u001a\u00020u2\u0006\u0010.\u001a\u00020\u00132\t\b\u0002\u0010\u0082\u0001\u001a\u00020\t¢\u0006\u0005\bv\u0010\u0083\u0001J\u000f\u0010\u0084\u0001\u001a\u00020u¢\u0006\u0005\b\u0085\u0001\u0010wJ\u0015\u0010\u0086\u0001\u001a\u00020\r2\t\u0010\u0019\u001a\u0005\u0018\u00010\u0087\u0001HÖ\u0003J\n\u0010\u0088\u0001\u001a\u00020\tHÖ\u0001R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\u00020\u00038BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\u0005R\u0015\u0010\b\u001a\u00020\t8Â\u0002X\u0082\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\u0012\u001a\u00020\u00138BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R\u0011\u00109\u001a\u00020\u00008F¢\u0006\u0006\u001a\u0004\b:\u0010\u0005R\u001a\u0010Q\u001a\u00020\t8@X\u0081\u0004¢\u0006\f\u0012\u0004\bR\u0010S\u001a\u0004\bT\u0010\u000bR\u001a\u0010U\u001a\u00020\t8@X\u0081\u0004¢\u0006\f\u0012\u0004\bV\u0010S\u001a\u0004\bW\u0010\u000bR\u001a\u0010X\u001a\u00020\t8@X\u0081\u0004¢\u0006\f\u0012\u0004\bY\u0010S\u001a\u0004\bZ\u0010\u000bR\u001a\u0010[\u001a\u00020\t8@X\u0081\u0004¢\u0006\f\u0012\u0004\b\\\u0010S\u001a\u0004\b]\u0010\u000bR\u0011\u0010f\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\bg\u0010\u0005R\u0011\u0010h\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\bi\u0010\u0005R\u0011\u0010j\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\bk\u0010\u0005R\u0011\u0010l\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\bm\u0010\u0005R\u0011\u0010n\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\bo\u0010\u0005R\u0011\u0010p\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\bq\u0010\u0005R\u0011\u0010r\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\bs\u0010\u0005\u0088\u0001\u0002\u0092\u0001\u00020\u0003\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u008a\u0001"}, d2 = {"Lkotlin/time/Duration;", "", "rawValue", "", "constructor-impl", "(J)J", "value", "getValue-impl", "unitDiscriminator", "", "getUnitDiscriminator-impl", "(J)I", "isInNanos", "", "isInNanos-impl", "(J)Z", "isInMillis", "isInMillis-impl", "storageUnit", "Lkotlin/time/DurationUnit;", "getStorageUnit-impl", "(J)Lkotlin/time/DurationUnit;", "unaryMinus", "unaryMinus-UwyO8pc", "plus", "other", "plus-LRDsOJo", "(JJ)J", "addValuesMixedRanges", "thisMillis", "otherNanos", "addValuesMixedRanges-UwyO8pc", "(JJJ)J", "minus", "minus-LRDsOJo", "times", "scale", "times-UwyO8pc", "(JI)J", "", "(JD)J", "div", "div-UwyO8pc", "div-LRDsOJo", "(JJ)D", "truncateTo", "unit", "truncateTo-UwyO8pc$kotlin_stdlib", "(JLkotlin/time/DurationUnit;)J", "isNegative", "isNegative-impl", "isPositive", "isPositive-impl", "isInfinite", "isInfinite-impl", "isFinite", "isFinite-impl", "absoluteValue", "getAbsoluteValue-UwyO8pc", "compareTo", "compareTo-LRDsOJo", "(JJ)I", "toComponents", "T", "action", "Lkotlin/Function5;", "Lkotlin/ParameterName;", HintConstants.AUTOFILL_HINT_NAME, "days", "hours", "minutes", "seconds", "nanoseconds", "toComponents-impl", "(JLkotlin/jvm/functions/Function5;)Ljava/lang/Object;", "Lkotlin/Function4;", "(JLkotlin/jvm/functions/Function4;)Ljava/lang/Object;", "Lkotlin/Function3;", "(JLkotlin/jvm/functions/Function3;)Ljava/lang/Object;", "Lkotlin/Function2;", "(JLkotlin/jvm/functions/Function2;)Ljava/lang/Object;", "hoursComponent", "getHoursComponent$annotations", "()V", "getHoursComponent-impl", "minutesComponent", "getMinutesComponent$annotations", "getMinutesComponent-impl", "secondsComponent", "getSecondsComponent$annotations", "getSecondsComponent-impl", "nanosecondsComponent", "getNanosecondsComponent$annotations", "getNanosecondsComponent-impl", "toDouble", "toDouble-impl", "(JLkotlin/time/DurationUnit;)D", "toLong", "toLong-impl", "toInt", "toInt-impl", "(JLkotlin/time/DurationUnit;)I", "inWholeDays", "getInWholeDays-impl", "inWholeHours", "getInWholeHours-impl", "inWholeMinutes", "getInWholeMinutes-impl", "inWholeSeconds", "getInWholeSeconds-impl", "inWholeMilliseconds", "getInWholeMilliseconds-impl", "inWholeMicroseconds", "getInWholeMicroseconds-impl", "inWholeNanoseconds", "getInWholeNanoseconds-impl", "toString", "", "toString-impl", "(J)Ljava/lang/String;", "appendFractional", "", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "whole", "fractional", "fractionalSize", "isoZeroes", "appendFractional-impl", "(JLjava/lang/StringBuilder;IIILjava/lang/String;Z)V", "decimals", "(JLkotlin/time/DurationUnit;I)Ljava/lang/String;", "toIsoString", "toIsoString-impl", "equals", "", "hashCode", "Companion", "kotlin-stdlib"}, k = 1, mv = {2, 2, 0}, xi = 48)
@JvmInline
public final class Duration implements Comparable<Duration> {
    public static final Companion Companion = null;
    private static final long INFINITE = 0;
    private static final long NEG_INFINITE = 0;
    private static final long ZERO = 0;
    private final long rawValue;

    /* JADX INFO: compiled from: Duration.kt */
    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0017\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J \u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0011H\u0007J\u0015\u00100\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u000201¢\u0006\u0004\b2\u00103J\u0015\u00104\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u000201¢\u0006\u0004\b5\u00103J\u0015\u00106\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u000f\u001a\u000201¢\u0006\u0002\b7J\u0015\u00108\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u000f\u001a\u000201¢\u0006\u0002\b9R\u0013\u0010\u0004\u001a\u00020\u0005¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\u0006\u0010\u0007R\u0013\u0010\t\u001a\u00020\u0005¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\n\u0010\u0007R\u0016\u0010\u000b\u001a\u00020\u0005X\u0080\u0004¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\f\u0010\u0007R\u001f\u0010\u0013\u001a\u00020\u0005*\u00020\u00148Æ\u0002X\u0087\u0004¢\u0006\f\u0012\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001f\u0010\u0013\u001a\u00020\u0005*\u00020\u00198Æ\u0002X\u0087\u0004¢\u0006\f\u0012\u0004\b\u0015\u0010\u001a\u001a\u0004\b\u0017\u0010\u001bR\u001f\u0010\u0013\u001a\u00020\u0005*\u00020\u000e8Æ\u0002X\u0087\u0004¢\u0006\f\u0012\u0004\b\u0015\u0010\u001c\u001a\u0004\b\u0017\u0010\u001dR\u001f\u0010\u001e\u001a\u00020\u0005*\u00020\u00148Æ\u0002X\u0087\u0004¢\u0006\f\u0012\u0004\b\u001f\u0010\u0016\u001a\u0004\b \u0010\u0018R\u001f\u0010\u001e\u001a\u00020\u0005*\u00020\u00198Æ\u0002X\u0087\u0004¢\u0006\f\u0012\u0004\b\u001f\u0010\u001a\u001a\u0004\b \u0010\u001bR\u001f\u0010\u001e\u001a\u00020\u0005*\u00020\u000e8Æ\u0002X\u0087\u0004¢\u0006\f\u0012\u0004\b\u001f\u0010\u001c\u001a\u0004\b \u0010\u001dR\u001f\u0010!\u001a\u00020\u0005*\u00020\u00148Æ\u0002X\u0087\u0004¢\u0006\f\u0012\u0004\b\"\u0010\u0016\u001a\u0004\b#\u0010\u0018R\u001f\u0010!\u001a\u00020\u0005*\u00020\u00198Æ\u0002X\u0087\u0004¢\u0006\f\u0012\u0004\b\"\u0010\u001a\u001a\u0004\b#\u0010\u001bR\u001f\u0010!\u001a\u00020\u0005*\u00020\u000e8Æ\u0002X\u0087\u0004¢\u0006\f\u0012\u0004\b\"\u0010\u001c\u001a\u0004\b#\u0010\u001dR\u001f\u0010$\u001a\u00020\u0005*\u00020\u00148Æ\u0002X\u0087\u0004¢\u0006\f\u0012\u0004\b%\u0010\u0016\u001a\u0004\b&\u0010\u0018R\u001f\u0010$\u001a\u00020\u0005*\u00020\u00198Æ\u0002X\u0087\u0004¢\u0006\f\u0012\u0004\b%\u0010\u001a\u001a\u0004\b&\u0010\u001bR\u001f\u0010$\u001a\u00020\u0005*\u00020\u000e8Æ\u0002X\u0087\u0004¢\u0006\f\u0012\u0004\b%\u0010\u001c\u001a\u0004\b&\u0010\u001dR\u001f\u0010'\u001a\u00020\u0005*\u00020\u00148Æ\u0002X\u0087\u0004¢\u0006\f\u0012\u0004\b(\u0010\u0016\u001a\u0004\b)\u0010\u0018R\u001f\u0010'\u001a\u00020\u0005*\u00020\u00198Æ\u0002X\u0087\u0004¢\u0006\f\u0012\u0004\b(\u0010\u001a\u001a\u0004\b)\u0010\u001bR\u001f\u0010'\u001a\u00020\u0005*\u00020\u000e8Æ\u0002X\u0087\u0004¢\u0006\f\u0012\u0004\b(\u0010\u001c\u001a\u0004\b)\u0010\u001dR\u001f\u0010*\u001a\u00020\u0005*\u00020\u00148Æ\u0002X\u0087\u0004¢\u0006\f\u0012\u0004\b+\u0010\u0016\u001a\u0004\b,\u0010\u0018R\u001f\u0010*\u001a\u00020\u0005*\u00020\u00198Æ\u0002X\u0087\u0004¢\u0006\f\u0012\u0004\b+\u0010\u001a\u001a\u0004\b,\u0010\u001bR\u001f\u0010*\u001a\u00020\u0005*\u00020\u000e8Æ\u0002X\u0087\u0004¢\u0006\f\u0012\u0004\b+\u0010\u001c\u001a\u0004\b,\u0010\u001dR\u001f\u0010-\u001a\u00020\u0005*\u00020\u00148Æ\u0002X\u0087\u0004¢\u0006\f\u0012\u0004\b.\u0010\u0016\u001a\u0004\b/\u0010\u0018R\u001f\u0010-\u001a\u00020\u0005*\u00020\u00198Æ\u0002X\u0087\u0004¢\u0006\f\u0012\u0004\b.\u0010\u001a\u001a\u0004\b/\u0010\u001bR\u001f\u0010-\u001a\u00020\u0005*\u00020\u000e8Æ\u0002X\u0087\u0004¢\u0006\f\u0012\u0004\b.\u0010\u001c\u001a\u0004\b/\u0010\u001d¨\u0006:"}, d2 = {"Lkotlin/time/Duration$Companion;", "", "<init>", "()V", "ZERO", "Lkotlin/time/Duration;", "getZERO-UwyO8pc", "()J", "J", "INFINITE", "getINFINITE-UwyO8pc", "NEG_INFINITE", "getNEG_INFINITE-UwyO8pc$kotlin_stdlib", "convert", "", "value", "sourceUnit", "Lkotlin/time/DurationUnit;", "targetUnit", "nanoseconds", "", "getNanoseconds-UwyO8pc$annotations", "(I)V", "getNanoseconds-UwyO8pc", "(I)J", "", "(J)V", "(J)J", "(D)V", "(D)J", "microseconds", "getMicroseconds-UwyO8pc$annotations", "getMicroseconds-UwyO8pc", "milliseconds", "getMilliseconds-UwyO8pc$annotations", "getMilliseconds-UwyO8pc", "seconds", "getSeconds-UwyO8pc$annotations", "getSeconds-UwyO8pc", "minutes", "getMinutes-UwyO8pc$annotations", "getMinutes-UwyO8pc", "hours", "getHours-UwyO8pc$annotations", "getHours-UwyO8pc", "days", "getDays-UwyO8pc$annotations", "getDays-UwyO8pc", "parse", "", "parse-UwyO8pc", "(Ljava/lang/String;)J", "parseIsoString", "parseIsoString-UwyO8pc", "parseOrNull", "parseOrNull-FghU774", "parseIsoStringOrNull", "parseIsoStringOrNull-FghU774", "kotlin-stdlib"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker r1) {
            this();
        }

        /* JADX INFO: renamed from: getDays-UwyO8pc$annotations, reason: not valid java name */
        public static /* synthetic */ void m8814getDaysUwyO8pc$annotations(double r0) {
        }

        /* JADX INFO: renamed from: getDays-UwyO8pc$annotations, reason: not valid java name */
        public static /* synthetic */ void m8815getDaysUwyO8pc$annotations(int r0) {
        }

        /* JADX INFO: renamed from: getDays-UwyO8pc$annotations, reason: not valid java name */
        public static /* synthetic */ void m8816getDaysUwyO8pc$annotations(long r0) {
        }

        /* JADX INFO: renamed from: getHours-UwyO8pc$annotations, reason: not valid java name */
        public static /* synthetic */ void m8820getHoursUwyO8pc$annotations(double r0) {
        }

        /* JADX INFO: renamed from: getHours-UwyO8pc$annotations, reason: not valid java name */
        public static /* synthetic */ void m8821getHoursUwyO8pc$annotations(int r0) {
        }

        /* JADX INFO: renamed from: getHours-UwyO8pc$annotations, reason: not valid java name */
        public static /* synthetic */ void m8822getHoursUwyO8pc$annotations(long r0) {
        }

        /* JADX INFO: renamed from: getMicroseconds-UwyO8pc$annotations, reason: not valid java name */
        public static /* synthetic */ void m8826getMicrosecondsUwyO8pc$annotations(double r0) {
        }

        /* JADX INFO: renamed from: getMicroseconds-UwyO8pc$annotations, reason: not valid java name */
        public static /* synthetic */ void m8827getMicrosecondsUwyO8pc$annotations(int r0) {
        }

        /* JADX INFO: renamed from: getMicroseconds-UwyO8pc$annotations, reason: not valid java name */
        public static /* synthetic */ void m8828getMicrosecondsUwyO8pc$annotations(long r0) {
        }

        /* JADX INFO: renamed from: getMilliseconds-UwyO8pc$annotations, reason: not valid java name */
        public static /* synthetic */ void m8832getMillisecondsUwyO8pc$annotations(double r0) {
        }

        /* JADX INFO: renamed from: getMilliseconds-UwyO8pc$annotations, reason: not valid java name */
        public static /* synthetic */ void m8833getMillisecondsUwyO8pc$annotations(int r0) {
        }

        /* JADX INFO: renamed from: getMilliseconds-UwyO8pc$annotations, reason: not valid java name */
        public static /* synthetic */ void m8834getMillisecondsUwyO8pc$annotations(long r0) {
        }

        /* JADX INFO: renamed from: getMinutes-UwyO8pc$annotations, reason: not valid java name */
        public static /* synthetic */ void m8838getMinutesUwyO8pc$annotations(double r0) {
        }

        /* JADX INFO: renamed from: getMinutes-UwyO8pc$annotations, reason: not valid java name */
        public static /* synthetic */ void m8839getMinutesUwyO8pc$annotations(int r0) {
        }

        /* JADX INFO: renamed from: getMinutes-UwyO8pc$annotations, reason: not valid java name */
        public static /* synthetic */ void m8840getMinutesUwyO8pc$annotations(long r0) {
        }

        /* JADX INFO: renamed from: getNanoseconds-UwyO8pc$annotations, reason: not valid java name */
        public static /* synthetic */ void m8844getNanosecondsUwyO8pc$annotations(double r0) {
        }

        /* JADX INFO: renamed from: getNanoseconds-UwyO8pc$annotations, reason: not valid java name */
        public static /* synthetic */ void m8845getNanosecondsUwyO8pc$annotations(int r0) {
        }

        /* JADX INFO: renamed from: getNanoseconds-UwyO8pc$annotations, reason: not valid java name */
        public static /* synthetic */ void m8846getNanosecondsUwyO8pc$annotations(long r0) {
        }

        /* JADX INFO: renamed from: getSeconds-UwyO8pc$annotations, reason: not valid java name */
        public static /* synthetic */ void m8850getSecondsUwyO8pc$annotations(double r0) {
        }

        /* JADX INFO: renamed from: getSeconds-UwyO8pc$annotations, reason: not valid java name */
        public static /* synthetic */ void m8851getSecondsUwyO8pc$annotations(int r0) {
        }

        /* JADX INFO: renamed from: getSeconds-UwyO8pc$annotations, reason: not valid java name */
        public static /* synthetic */ void m8852getSecondsUwyO8pc$annotations(long r0) {
        }

        private Companion() {
        }

        /* JADX INFO: renamed from: getZERO-UwyO8pc, reason: not valid java name */
        public final long m8855getZEROUwyO8pc() {
            return Duration.access$getZERO$cp();
        }

        /* JADX INFO: renamed from: getINFINITE-UwyO8pc, reason: not valid java name */
        public final long m8853getINFINITEUwyO8pc() {
            return Duration.access$getINFINITE$cp();
        }

        /* JADX INFO: renamed from: getNEG_INFINITE-UwyO8pc$kotlin_stdlib, reason: not valid java name */
        public final long m8854getNEG_INFINITEUwyO8pc$kotlin_stdlib() {
            return Duration.access$getNEG_INFINITE$cp();
        }

        public final double convert(double value, DurationUnit sourceUnit, DurationUnit targetUnit) {
            Intrinsics.checkNotNullParameter(sourceUnit, "sourceUnit");
            Intrinsics.checkNotNullParameter(targetUnit, "targetUnit");
            return DurationUnitKt.convertDurationUnit(value, sourceUnit, targetUnit);
        }

        /* JADX INFO: renamed from: getNanoseconds-UwyO8pc, reason: not valid java name */
        private final long m8842getNanosecondsUwyO8pc(int $this$nanoseconds) {
            return DurationKt.toDuration($this$nanoseconds, DurationUnit.NANOSECONDS);
        }

        /* JADX INFO: renamed from: getNanoseconds-UwyO8pc, reason: not valid java name */
        private final long m8843getNanosecondsUwyO8pc(long $this$nanoseconds) {
            return DurationKt.toDuration($this$nanoseconds, DurationUnit.NANOSECONDS);
        }

        /* JADX INFO: renamed from: getNanoseconds-UwyO8pc, reason: not valid java name */
        private final long m8841getNanosecondsUwyO8pc(double $this$nanoseconds) {
            return DurationKt.toDuration($this$nanoseconds, DurationUnit.NANOSECONDS);
        }

        /* JADX INFO: renamed from: getMicroseconds-UwyO8pc, reason: not valid java name */
        private final long m8824getMicrosecondsUwyO8pc(int $this$microseconds) {
            return DurationKt.toDuration($this$microseconds, DurationUnit.MICROSECONDS);
        }

        /* JADX INFO: renamed from: getMicroseconds-UwyO8pc, reason: not valid java name */
        private final long m8825getMicrosecondsUwyO8pc(long $this$microseconds) {
            return DurationKt.toDuration($this$microseconds, DurationUnit.MICROSECONDS);
        }

        /* JADX INFO: renamed from: getMicroseconds-UwyO8pc, reason: not valid java name */
        private final long m8823getMicrosecondsUwyO8pc(double $this$microseconds) {
            return DurationKt.toDuration($this$microseconds, DurationUnit.MICROSECONDS);
        }

        /* JADX INFO: renamed from: getMilliseconds-UwyO8pc, reason: not valid java name */
        private final long m8830getMillisecondsUwyO8pc(int $this$milliseconds) {
            return DurationKt.toDuration($this$milliseconds, DurationUnit.MILLISECONDS);
        }

        /* JADX INFO: renamed from: getMilliseconds-UwyO8pc, reason: not valid java name */
        private final long m8831getMillisecondsUwyO8pc(long $this$milliseconds) {
            return DurationKt.toDuration($this$milliseconds, DurationUnit.MILLISECONDS);
        }

        /* JADX INFO: renamed from: getMilliseconds-UwyO8pc, reason: not valid java name */
        private final long m8829getMillisecondsUwyO8pc(double $this$milliseconds) {
            return DurationKt.toDuration($this$milliseconds, DurationUnit.MILLISECONDS);
        }

        /* JADX INFO: renamed from: getSeconds-UwyO8pc, reason: not valid java name */
        private final long m8848getSecondsUwyO8pc(int $this$seconds) {
            return DurationKt.toDuration($this$seconds, DurationUnit.SECONDS);
        }

        /* JADX INFO: renamed from: getSeconds-UwyO8pc, reason: not valid java name */
        private final long m8849getSecondsUwyO8pc(long $this$seconds) {
            return DurationKt.toDuration($this$seconds, DurationUnit.SECONDS);
        }

        /* JADX INFO: renamed from: getSeconds-UwyO8pc, reason: not valid java name */
        private final long m8847getSecondsUwyO8pc(double $this$seconds) {
            return DurationKt.toDuration($this$seconds, DurationUnit.SECONDS);
        }

        /* JADX INFO: renamed from: getMinutes-UwyO8pc, reason: not valid java name */
        private final long m8836getMinutesUwyO8pc(int $this$minutes) {
            return DurationKt.toDuration($this$minutes, DurationUnit.MINUTES);
        }

        /* JADX INFO: renamed from: getMinutes-UwyO8pc, reason: not valid java name */
        private final long m8837getMinutesUwyO8pc(long $this$minutes) {
            return DurationKt.toDuration($this$minutes, DurationUnit.MINUTES);
        }

        /* JADX INFO: renamed from: getMinutes-UwyO8pc, reason: not valid java name */
        private final long m8835getMinutesUwyO8pc(double $this$minutes) {
            return DurationKt.toDuration($this$minutes, DurationUnit.MINUTES);
        }

        /* JADX INFO: renamed from: getHours-UwyO8pc, reason: not valid java name */
        private final long m8818getHoursUwyO8pc(int $this$hours) {
            return DurationKt.toDuration($this$hours, DurationUnit.HOURS);
        }

        /* JADX INFO: renamed from: getHours-UwyO8pc, reason: not valid java name */
        private final long m8819getHoursUwyO8pc(long $this$hours) {
            return DurationKt.toDuration($this$hours, DurationUnit.HOURS);
        }

        /* JADX INFO: renamed from: getHours-UwyO8pc, reason: not valid java name */
        private final long m8817getHoursUwyO8pc(double $this$hours) {
            return DurationKt.toDuration($this$hours, DurationUnit.HOURS);
        }

        /* JADX INFO: renamed from: getDays-UwyO8pc, reason: not valid java name */
        private final long m8812getDaysUwyO8pc(int $this$days) {
            return DurationKt.toDuration($this$days, DurationUnit.DAYS);
        }

        /* JADX INFO: renamed from: getDays-UwyO8pc, reason: not valid java name */
        private final long m8813getDaysUwyO8pc(long $this$days) {
            return DurationKt.toDuration($this$days, DurationUnit.DAYS);
        }

        /* JADX INFO: renamed from: getDays-UwyO8pc, reason: not valid java name */
        private final long m8811getDaysUwyO8pc(double $this$days) {
            return DurationKt.toDuration($this$days, DurationUnit.DAYS);
        }

        /* JADX INFO: renamed from: parse-UwyO8pc, reason: not valid java name */
        public final long m8856parseUwyO8pc(String value) {
            Intrinsics.checkNotNullParameter(value, "value");
            return DurationKt.access$parseDuration(value, false);
        L5:
            e = move-exception;
            throw new IllegalArgumentException("Invalid duration string format: '" + value + "'.", e);
        }

        /* JADX INFO: renamed from: parseIsoString-UwyO8pc, reason: not valid java name */
        public final long m8857parseIsoStringUwyO8pc(String value) {
            Intrinsics.checkNotNullParameter(value, "value");
            return DurationKt.access$parseDuration(value, true);
        L5:
            e = move-exception;
            throw new IllegalArgumentException("Invalid ISO duration string format: '" + value + "'.", e);
        }

        /* JADX INFO: renamed from: parseOrNull-FghU774, reason: not valid java name */
        public final Duration m8859parseOrNullFghU774(String value) {
            Intrinsics.checkNotNullParameter(value, "value");
            return Duration.m8762boximpl(DurationKt.access$parseDuration(value, false));
        L7:
            return null;
        }

        /* JADX INFO: renamed from: parseIsoStringOrNull-FghU774, reason: not valid java name */
        public final Duration m8858parseIsoStringOrNullFghU774(String value) {
            Intrinsics.checkNotNullParameter(value, "value");
            return Duration.m8762boximpl(DurationKt.access$parseDuration(value, true));
        L7:
            return null;
        }
    }

    /* JADX INFO: renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ Duration m8762boximpl(long r1) {
        return new Duration(r1);
    }

    /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
    public static boolean m8768equalsimpl(long r4, Object r6) {
        if ((r6 instanceof Duration) == true) goto L6;
        return false;
    L6:
        if (r4 == ((Duration) r6).m8810unboximpl()) goto L8;
        return false;
    L8:
        return true;
    }

    /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m8769equalsimpl0(long r1, long r3) {
        if (r1 != r3) goto L5;
        return true;
    L5:
        return false;
    }

    public static /* synthetic */ void getHoursComponent$annotations() {
    }

    public static /* synthetic */ void getMinutesComponent$annotations() {
    }

    public static /* synthetic */ void getNanosecondsComponent$annotations() {
    }

    public static /* synthetic */ void getSecondsComponent$annotations() {
    }

    /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
    public static int m8785hashCodeimpl(long r1) {
        return Long.hashCode(r1);
    }

    public boolean equals(Object r3) {
        return m8768equalsimpl(this.rawValue, r3);
    }

    public int hashCode() {
        return m8785hashCodeimpl(this.rawValue);
    }

    /* JADX INFO: renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ long m8810unboximpl() {
        return this.rawValue;
    }

    public static final /* synthetic */ long access$getINFINITE$cp() {
        return INFINITE;
    }

    public static final /* synthetic */ long access$getNEG_INFINITE$cp() {
        return NEG_INFINITE;
    }

    public static final /* synthetic */ long access$getZERO$cp() {
        return ZERO;
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(Duration r3) {
        return m8809compareToLRDsOJo(r3.m8810unboximpl());
    }

    private /* synthetic */ Duration(long rawValue) {
        this.rawValue = rawValue;
    }

    /* JADX INFO: renamed from: getValue-impl, reason: not valid java name */
    private static final long m8784getValueimpl(long arg0) {
        return arg0 >> 1;
    }

    /* JADX INFO: renamed from: getUnitDiscriminator-impl, reason: not valid java name */
    private static final int m8783getUnitDiscriminatorimpl(long arg0) {
        return ((int) arg0) & 1;
    }

    /* JADX INFO: renamed from: isInNanos-impl, reason: not valid java name */
    private static final boolean m8788isInNanosimpl(long arg0) {
        if ((((int) arg0) & 1) == 0) goto L7;
        return false;
    L7:
        return true;
    }

    /* JADX INFO: renamed from: isInMillis-impl, reason: not valid java name */
    private static final boolean m8787isInMillisimpl(long arg0) {
        if ((((int) arg0) & 1) == 1) goto L7;
        return false;
    L7:
        return true;
    }

    /* JADX INFO: renamed from: getStorageUnit-impl, reason: not valid java name */
    private static final DurationUnit m8782getStorageUnitimpl(long arg0) {
        if (m8788isInNanosimpl(arg0) == false) goto L6;
        return DurationUnit.NANOSECONDS;
    L6:
        return DurationUnit.MILLISECONDS;
    }

    /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
    public static long m8764constructorimpl(long rawValue) {
        if (DurationJvmKt.getDurationAssertionsEnabled() == false) goto L35;
        boolean r1 = true;
        if (m8788isInNanosimpl(rawValue) == false) goto L16;
        long r3 = m8784getValueimpl(rawValue);
        if ((-4611686018426999999L) <= r3) goto L9;
    L11:
        r1 = false;
    L12:
        if (r1 == true) goto L35;
        throw new AssertionError(m8784getValueimpl(rawValue) + " ns is out of nanoseconds range");
    L9:
        if (r3 >= 4611686018427000000L) goto L11;
    L16:
        long r4 = m8784getValueimpl(rawValue);
        if ((-4611686018427387903L) <= r4) goto L19;
    L21:
        boolean r0 = false;
    L22:
        if (r0 == false) goto L34;
        long r5 = m8784getValueimpl(rawValue);
        if ((-4611686018426L) <= r5) goto L26;
    L28:
        r1 = false;
    L29:
        if (r1 == false) goto L35;
        throw new AssertionError(m8784getValueimpl(rawValue) + " ms is denormalized");
    L26:
        if (r5 >= 4611686018427L) goto L28;
    L34:
        throw new AssertionError(m8784getValueimpl(rawValue) + " ms is out of milliseconds range");
    L19:
        if (r4 >= SieveCacheKt.NodeVisitedBit) goto L21;
        r0 = true;
    L35:
        return rawValue;
    }

    static {
        Companion = new Companion(null);
        ZERO = m8764constructorimpl(0);
        INFINITE = DurationKt.access$durationOfMillis(4611686018427387903L);
        NEG_INFINITE = DurationKt.access$durationOfMillis(-4611686018427387903L);
    }

    /* JADX INFO: renamed from: unaryMinus-UwyO8pc, reason: not valid java name */
    public static final long m8808unaryMinusUwyO8pc(long arg0) {
        return DurationKt.access$durationOf(-m8784getValueimpl(arg0), ((int) arg0) & 1);
    }

    /* JADX INFO: renamed from: plus-LRDsOJo, reason: not valid java name */
    public static final long m8793plusLRDsOJo(long arg0, long other) {
        if (m8789isInfiniteimpl(arg0) == false) goto L13;
        if (m8786isFiniteimpl(other) == false) goto L7;
    L11:
        return arg0;
    L7:
        if ((arg0 ^ other) >= 0) goto L11;
        throw new IllegalArgumentException("Summing infinite durations of different signs yields an undefined result.");
    L13:
        if (m8789isInfiniteimpl(other) == false) goto L16;
        return other;
    L16:
        if ((((int) arg0) & 1) != (((int) other) & 1)) goto L22;
        long result = m8784getValueimpl(arg0) + m8784getValueimpl(other);
        if (m8788isInNanosimpl(arg0) == false) goto L27;
        return DurationKt.access$durationOfNanosNormalized(result);
    L27:
        return DurationKt.access$durationOfMillisNormalized(result);
    L22:
        if (m8787isInMillisimpl(arg0) == false) goto L25;
        return m8760addValuesMixedRangesUwyO8pc(arg0, m8784getValueimpl(arg0), m8784getValueimpl(other));
    L25:
        return m8760addValuesMixedRangesUwyO8pc(arg0, m8784getValueimpl(other), m8784getValueimpl(arg0));
    }

    /* JADX INFO: renamed from: addValuesMixedRanges-UwyO8pc, reason: not valid java name */
    private static final long m8760addValuesMixedRangesUwyO8pc(long arg0, long thisMillis, long otherNanos) {
        long otherMillis = DurationKt.access$nanosToMillis(otherNanos);
        long resultMillis = thisMillis + otherMillis;
        boolean r5 = false;
        if ((-4611686018426L) <= resultMillis) goto L5;
    L7:
        if (r5 == false) goto L10;
        long otherNanoRemainder = otherNanos - DurationKt.access$millisToNanos(otherMillis);
        return DurationKt.access$durationOfNanos(DurationKt.access$millisToNanos(resultMillis) + otherNanoRemainder);
    L10:
        return DurationKt.access$durationOfMillis(RangesKt.coerceIn(resultMillis, -4611686018427387903L, 4611686018427387903L));
    L5:
        if (resultMillis >= 4611686018427L) goto L7;
        r5 = true;
        goto L7
    }

    /* JADX INFO: renamed from: minus-LRDsOJo, reason: not valid java name */
    public static final long m8792minusLRDsOJo(long arg0, long other) {
        return m8793plusLRDsOJo(arg0, m8808unaryMinusUwyO8pc(other));
    }

    /* JADX INFO: renamed from: times-UwyO8pc, reason: not valid java name */
    public static final long m8795timesUwyO8pc(long arg0, int scale) {
        if (m8789isInfiniteimpl(arg0) == false) goto L11;
        if (scale == 0) goto L10;
        if (scale <= 0) goto L8;
        return arg0;
    L8:
        return m8808unaryMinusUwyO8pc(arg0);
    L10:
        throw new IllegalArgumentException("Multiplying infinite duration by zero yields an undefined result.");
    L11:
        if (scale == 0) goto L13;
        long value = m8784getValueimpl(arg0);
        long result = ((long) scale) * value;
        if (m8788isInNanosimpl(arg0) == false) goto L36;
        boolean r10 = false;
        if ((-2147483647L) <= value) goto L19;
    L21:
        if (r10 == false) goto L24;
        return DurationKt.access$durationOfNanos(result);
    L24:
        if ((result / ((long) scale)) == value) goto L45;
        long millis = DurationKt.access$nanosToMillis(value);
        long remNanos = value - DurationKt.access$millisToNanos(millis);
        long resultMillis = ((long) scale) * millis;
        long totalMillis = DurationKt.access$nanosToMillis(((long) scale) * remNanos) + resultMillis;
        if ((resultMillis / ((long) scale)) != millis) goto L32;
        if ((totalMillis ^ resultMillis) < 0) goto L32;
        return DurationKt.access$durationOfMillis(RangesKt.coerceIn(totalMillis, new LongRange(-4611686018427387903L, 4611686018427387903L)));
    L32:
        if ((MathKt.getSign(value) * MathKt.getSign(scale)) <= 0) goto L48;
        return INFINITE;
    L48:
        return NEG_INFINITE;
    L45:
        return DurationKt.access$durationOfNanosNormalized(result);
    L19:
        if (value >= 2147483648L) goto L21;
        r10 = true;
        goto L21
    L36:
        if ((result / ((long) scale)) != value) goto L39;
        return DurationKt.access$durationOfMillis(RangesKt.coerceIn(result, new LongRange(-4611686018427387903L, 4611686018427387903L)));
    L39:
        if ((MathKt.getSign(value) * MathKt.getSign(scale)) <= 0) goto L42;
        return INFINITE;
    L42:
        return NEG_INFINITE;
    L13:
        return ZERO;
    }

    /* JADX INFO: renamed from: times-UwyO8pc, reason: not valid java name */
    public static final long m8794timesUwyO8pc(long arg0, double scale) {
        int intScale = MathKt.roundToInt(scale);
        if (intScale != scale) goto L5;
        boolean r1 = true;
    L6:
        if (r1 == true) goto L8;
        DurationUnit unit = m8782getStorageUnitimpl(arg0);
        double result = m8800toDoubleimpl(arg0, unit) * scale;
        return DurationKt.toDuration(result, unit);
    L8:
        return m8795timesUwyO8pc(arg0, intScale);
    L5:
        r1 = false;
        goto L6
    }

    /* JADX INFO: renamed from: div-UwyO8pc, reason: not valid java name */
    public static final long m8767divUwyO8pc(long arg0, int scale) {
        if (scale != 0) goto L13;
        if (m8791isPositiveimpl(arg0) == false) goto L7;
        return INFINITE;
    L7:
        if (m8790isNegativeimpl(arg0) == false) goto L11;
        return NEG_INFINITE;
    L11:
        throw new IllegalArgumentException("Dividing zero duration by zero yields an undefined result.");
    L13:
        if (m8788isInNanosimpl(arg0) == false) goto L17;
        return DurationKt.access$durationOfNanos(m8784getValueimpl(arg0) / ((long) scale));
    L17:
        if (m8789isInfiniteimpl(arg0) == true) goto L19;
        long result = m8784getValueimpl(arg0) / ((long) scale);
        boolean r3 = false;
        if ((-4611686018426L) <= result) goto L23;
    L25:
        if (r3 == false) goto L28;
        long rem = DurationKt.access$millisToNanos(m8784getValueimpl(arg0) - (((long) scale) * result)) / ((long) scale);
        return DurationKt.access$durationOfNanos(DurationKt.access$millisToNanos(result) + rem);
    L28:
        long rem2 = DurationKt.access$durationOfMillis(result);
        return rem2;
    L23:
        if (result >= 4611686018427L) goto L25;
        r3 = true;
        goto L25
    L19:
        return m8795timesUwyO8pc(arg0, MathKt.getSign(scale));
    }

    /* JADX INFO: renamed from: div-UwyO8pc, reason: not valid java name */
    public static final long m8766divUwyO8pc(long arg0, double scale) {
        int intScale = MathKt.roundToInt(scale);
        if (intScale != scale) goto L5;
        boolean r1 = true;
    L6:
        if (r1 == false) goto L10;
        if (intScale == 0) goto L10;
        return m8767divUwyO8pc(arg0, intScale);
    L10:
        DurationUnit unit = m8782getStorageUnitimpl(arg0);
        double result = m8800toDoubleimpl(arg0, unit) / scale;
        return DurationKt.toDuration(result, unit);
    L5:
        r1 = false;
        goto L6
    }

    /* JADX INFO: renamed from: div-LRDsOJo, reason: not valid java name */
    public static final double m8765divLRDsOJo(long arg0, long other) {
        DurationUnit coarserUnit = (DurationUnit) ComparisonsKt.maxOf(m8782getStorageUnitimpl(arg0), m8782getStorageUnitimpl(other));
        return m8800toDoubleimpl(arg0, coarserUnit) / m8800toDoubleimpl(other, coarserUnit);
    }

    /* JADX INFO: renamed from: truncateTo-UwyO8pc$kotlin_stdlib, reason: not valid java name */
    public static final long m8807truncateToUwyO8pc$kotlin_stdlib(long arg0, DurationUnit unit) {
        Intrinsics.checkNotNullParameter(unit, "unit");
        DurationUnit storageUnit = m8782getStorageUnitimpl(arg0);
        if (unit.compareTo(storageUnit) > 0) goto L5;
    L9:
        return arg0;
    L5:
        if (m8789isInfiniteimpl(arg0) == true) goto L9;
        long scale = DurationUnitKt.convertDurationUnit(1, unit, storageUnit);
        long result = m8784getValueimpl(arg0) - (m8784getValueimpl(arg0) % scale);
        return DurationKt.toDuration(result, storageUnit);
    }

    /* JADX INFO: renamed from: isNegative-impl, reason: not valid java name */
    public static final boolean m8790isNegativeimpl(long arg0) {
        if (arg0 >= 0) goto L5;
        return true;
    L5:
        return false;
    }

    /* JADX INFO: renamed from: isPositive-impl, reason: not valid java name */
    public static final boolean m8791isPositiveimpl(long arg0) {
        if (arg0 <= 0) goto L5;
        return true;
    L5:
        return false;
    }

    /* JADX INFO: renamed from: isInfinite-impl, reason: not valid java name */
    public static final boolean m8789isInfiniteimpl(long arg0) {
        if (arg0 != INFINITE) goto L5;
    L8:
        return true;
    L5:
        if (arg0 == NEG_INFINITE) goto L8;
        return false;
    }

    /* JADX INFO: renamed from: isFinite-impl, reason: not valid java name */
    public static final boolean m8786isFiniteimpl(long arg0) {
        return !m8789isInfiniteimpl(arg0);
    }

    /* JADX INFO: renamed from: getAbsoluteValue-UwyO8pc, reason: not valid java name */
    public static final long m8770getAbsoluteValueUwyO8pc(long arg0) {
        if (m8790isNegativeimpl(arg0) == false) goto L6;
        return m8808unaryMinusUwyO8pc(arg0);
    L6:
        return arg0;
    }

    /* JADX INFO: renamed from: compareTo-LRDsOJo, reason: not valid java name */
    public int m8809compareToLRDsOJo(long other) {
        return m8763compareToLRDsOJo(this.rawValue, other);
    }

    /* JADX INFO: renamed from: compareTo-LRDsOJo, reason: not valid java name */
    public static int m8763compareToLRDsOJo(long arg0, long other) {
        long compareBits = arg0 ^ other;
        if (compareBits < 0) goto L13;
        if ((((int) compareBits) & 1) == 0) goto L13;
        int r = (((int) arg0) & 1) - (((int) other) & 1);
        if (m8790isNegativeimpl(arg0) == false) goto L11;
        return -r;
    L11:
        return r;
    L13:
        return Intrinsics.compare(arg0, other);
    }

    /* JADX INFO: renamed from: toComponents-impl, reason: not valid java name */
    public static final <T> T m8799toComponentsimpl(long arg0, Function5<? super Long, ? super Integer, ? super Integer, ? super Integer, ? super Integer, ? extends T> r11) {
        Intrinsics.checkNotNullParameter(r11, "action");
        return r11.invoke(Long.valueOf(m8772getInWholeDaysimpl(arg0)), Integer.valueOf(m8771getHoursComponentimpl(arg0)), Integer.valueOf(m8779getMinutesComponentimpl(arg0)), Integer.valueOf(m8781getSecondsComponentimpl(arg0)), Integer.valueOf(m8780getNanosecondsComponentimpl(arg0)));
    }

    /* JADX INFO: renamed from: toComponents-impl, reason: not valid java name */
    public static final <T> T m8798toComponentsimpl(long arg0, Function4<? super Long, ? super Integer, ? super Integer, ? super Integer, ? extends T> r7) {
        Intrinsics.checkNotNullParameter(r7, "action");
        return r7.invoke(Long.valueOf(m8773getInWholeHoursimpl(arg0)), Integer.valueOf(m8779getMinutesComponentimpl(arg0)), Integer.valueOf(m8781getSecondsComponentimpl(arg0)), Integer.valueOf(m8780getNanosecondsComponentimpl(arg0)));
    }

    /* JADX INFO: renamed from: toComponents-impl, reason: not valid java name */
    public static final <T> T m8797toComponentsimpl(long arg0, Function3<? super Long, ? super Integer, ? super Integer, ? extends T> r6) {
        Intrinsics.checkNotNullParameter(r6, "action");
        return r6.invoke(Long.valueOf(m8776getInWholeMinutesimpl(arg0)), Integer.valueOf(m8781getSecondsComponentimpl(arg0)), Integer.valueOf(m8780getNanosecondsComponentimpl(arg0)));
    }

    /* JADX INFO: renamed from: toComponents-impl, reason: not valid java name */
    public static final <T> T m8796toComponentsimpl(long arg0, Function2<? super Long, ? super Integer, ? extends T> r5) {
        Intrinsics.checkNotNullParameter(r5, "action");
        return r5.invoke(Long.valueOf(m8778getInWholeSecondsimpl(arg0)), Integer.valueOf(m8780getNanosecondsComponentimpl(arg0)));
    }

    /* JADX INFO: renamed from: getHoursComponent-impl, reason: not valid java name */
    public static final int m8771getHoursComponentimpl(long arg0) {
        if (m8789isInfiniteimpl(arg0) == false) goto L6;
        return 0;
    L6:
        return (int) (m8773getInWholeHoursimpl(arg0) % 24);
    }

    /* JADX INFO: renamed from: getMinutesComponent-impl, reason: not valid java name */
    public static final int m8779getMinutesComponentimpl(long arg0) {
        if (m8789isInfiniteimpl(arg0) == false) goto L6;
        return 0;
    L6:
        return (int) (m8776getInWholeMinutesimpl(arg0) % 60);
    }

    /* JADX INFO: renamed from: getSecondsComponent-impl, reason: not valid java name */
    public static final int m8781getSecondsComponentimpl(long arg0) {
        if (m8789isInfiniteimpl(arg0) == false) goto L6;
        return 0;
    L6:
        return (int) (m8778getInWholeSecondsimpl(arg0) % 60);
    }

    /* JADX INFO: renamed from: getNanosecondsComponent-impl, reason: not valid java name */
    public static final int m8780getNanosecondsComponentimpl(long arg0) {
        if (m8789isInfiniteimpl(arg0) == false) goto L6;
        return 0;
    L6:
        if (m8787isInMillisimpl(arg0) == false) goto L9;
        return (int) DurationKt.access$millisToNanos(m8784getValueimpl(arg0) % 1000);
    L9:
        return (int) (m8784getValueimpl(arg0) % 1000000000);
    }

    /* JADX INFO: renamed from: toDouble-impl, reason: not valid java name */
    public static final double m8800toDoubleimpl(long arg0, DurationUnit unit) {
        Intrinsics.checkNotNullParameter(unit, "unit");
        if (arg0 != INFINITE) goto L6;
        return Double.POSITIVE_INFINITY;
    L6:
        if (arg0 != NEG_INFINITE) goto L9;
        return Double.NEGATIVE_INFINITY;
    L9:
        return DurationUnitKt.convertDurationUnit(m8784getValueimpl(arg0), m8782getStorageUnitimpl(arg0), unit);
    }

    /* JADX INFO: renamed from: toLong-impl, reason: not valid java name */
    public static final long m8803toLongimpl(long arg0, DurationUnit unit) {
        Intrinsics.checkNotNullParameter(unit, "unit");
        if (arg0 != INFINITE) goto L6;
        return Long.MAX_VALUE;
    L6:
        if (arg0 != NEG_INFINITE) goto L9;
        return Long.MIN_VALUE;
    L9:
        return DurationUnitKt.convertDurationUnit(m8784getValueimpl(arg0), m8782getStorageUnitimpl(arg0), unit);
    }

    /* JADX INFO: renamed from: toInt-impl, reason: not valid java name */
    public static final int m8801toIntimpl(long arg0, DurationUnit unit) {
        Intrinsics.checkNotNullParameter(unit, "unit");
        return (int) RangesKt.coerceIn(m8803toLongimpl(arg0, unit), SieveCacheKt.NodeMetaAndPreviousMask, SieveCacheKt.NodeLinkMask);
    }

    /* JADX INFO: renamed from: getInWholeDays-impl, reason: not valid java name */
    public static final long m8772getInWholeDaysimpl(long arg0) {
        return m8803toLongimpl(arg0, DurationUnit.DAYS);
    }

    /* JADX INFO: renamed from: getInWholeHours-impl, reason: not valid java name */
    public static final long m8773getInWholeHoursimpl(long arg0) {
        return m8803toLongimpl(arg0, DurationUnit.HOURS);
    }

    /* JADX INFO: renamed from: getInWholeMinutes-impl, reason: not valid java name */
    public static final long m8776getInWholeMinutesimpl(long arg0) {
        return m8803toLongimpl(arg0, DurationUnit.MINUTES);
    }

    /* JADX INFO: renamed from: getInWholeSeconds-impl, reason: not valid java name */
    public static final long m8778getInWholeSecondsimpl(long arg0) {
        return m8803toLongimpl(arg0, DurationUnit.SECONDS);
    }

    /* JADX INFO: renamed from: getInWholeMilliseconds-impl, reason: not valid java name */
    public static final long m8775getInWholeMillisecondsimpl(long arg0) {
        if (m8787isInMillisimpl(arg0) == false) goto L8;
        if (m8786isFiniteimpl(arg0) == false) goto L8;
        return m8784getValueimpl(arg0);
    L8:
        return m8803toLongimpl(arg0, DurationUnit.MILLISECONDS);
    }

    /* JADX INFO: renamed from: getInWholeMicroseconds-impl, reason: not valid java name */
    public static final long m8774getInWholeMicrosecondsimpl(long arg0) {
        return m8803toLongimpl(arg0, DurationUnit.MICROSECONDS);
    }

    /* JADX INFO: renamed from: getInWholeNanoseconds-impl, reason: not valid java name */
    public static final long m8777getInWholeNanosecondsimpl(long arg0) {
        long value = m8784getValueimpl(arg0);
        if (m8788isInNanosimpl(arg0) == false) goto L6;
        return value;
    L6:
        if (value <= 9223372036854L) goto L9;
        return Long.MAX_VALUE;
    L9:
        if (value >= (-9223372036854L)) goto L12;
        return Long.MIN_VALUE;
    L12:
        return DurationKt.access$millisToNanos(value);
    }

    /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
    public static String m8804toStringimpl(long arg0) {
        if (arg0 != 0) goto L6;
        return "0s";
    L6:
        if (arg0 != INFINITE) goto L9;
        return "Infinity";
    L9:
        if (arg0 != NEG_INFINITE) goto L11;
        return "-Infinity";
    L11:
        boolean isNegative = m8790isNegativeimpl(arg0);
        StringBuilder $this$toString_impl_u24lambda_u241 = new StringBuilder();
        if (isNegative == false) goto L14;
        $this$toString_impl_u24lambda_u241.append('-');
    L14:
        long arg0$iv = m8770getAbsoluteValueUwyO8pc(arg0);
        long days = m8772getInWholeDaysimpl(arg0$iv);
        int hours = m8771getHoursComponentimpl(arg0$iv);
        int minutes = m8779getMinutesComponentimpl(arg0$iv);
        int seconds = m8781getSecondsComponentimpl(arg0$iv);
        int nanoseconds = m8780getNanosecondsComponentimpl(arg0$iv);
        boolean hasSeconds = false;
        if (days == 0) goto L17;
        boolean hasDays = true;
    L18:
        if (hours == 0) goto L20;
        boolean r11 = true;
    L21:
        boolean hasHours = r11;
        if (minutes == 0) goto L24;
        boolean r12 = true;
    L25:
        boolean hasMinutes = r12;
        if (seconds != 0) goto L28;
        if (nanoseconds != 0) goto L28;
    L29:
        int components = 0;
        if (hasDays == false) goto L34;
        $this$toString_impl_u24lambda_u241.append(days).append('d');
        components = 0 + 1;
    L34:
        if (hasHours == true) goto L38;
        if (hasDays == false) goto L42;
        if (hasMinutes == true) goto L38;
        if (hasSeconds == true) goto L38;
    L42:
        if (hasMinutes == true) goto L46;
        if (hasSeconds == false) goto L50;
        if (hasHours == true) goto L46;
        if (hasDays != 0) goto L46;
    L50:
        if (hasSeconds == false) goto L70;
        int components2 = components + 1;
        if (components <= 0) goto L55;
        $this$toString_impl_u24lambda_u241.append(' ');
    L55:
        if (seconds != 0) goto L67;
        if (hasDays != 0) goto L67;
        if (hasHours == true) goto L67;
        if (hasMinutes == false) goto L61;
        int r1 = 1;
    L68:
        m8761appendFractionalimpl(arg0, $this$toString_impl_u24lambda_u241, seconds, nanoseconds, 9, "s", false);
    L69:
        components = components2;
    L71:
        if (isNegative == false) goto L75;
        if (components <= r1) goto L75;
        $this$toString_impl_u24lambda_u241.insert(r1, '(').append(')');
    L75:
        return $this$toString_impl_u24lambda_u241.toString();
    L61:
        if (nanoseconds < 1000000) goto L63;
        components2 = components2;
        r1 = 1;
        m8761appendFractionalimpl(arg0, $this$toString_impl_u24lambda_u241, nanoseconds / DurationKt.NANOS_IN_MILLIS, nanoseconds % DurationKt.NANOS_IN_MILLIS, 6, "ms", false);
        goto L69
    L63:
        components2 = components2;
        r1 = 1;
        if (nanoseconds < 1000) goto L66;
        m8761appendFractionalimpl(arg0, $this$toString_impl_u24lambda_u241, nanoseconds / 1000, nanoseconds % 1000, 3, "us", false);
        goto L69
    L66:
        $this$toString_impl_u24lambda_u241.append(nanoseconds).append("ns");
    L67:
        r1 = 1;
        goto L68
    L70:
        r1 = 1;
    L46:
        int components3 = components + 1;
        if (components <= 0) goto L49;
        $this$toString_impl_u24lambda_u241.append(' ');
    L49:
        $this$toString_impl_u24lambda_u241.append(minutes).append('m');
        components = components3;
    L38:
        int components4 = components + 1;
        if (components <= 0) goto L41;
        $this$toString_impl_u24lambda_u241.append(' ');
    L41:
        $this$toString_impl_u24lambda_u241.append(hours).append('h');
        components = components4;
    L28:
        hasSeconds = true;
        goto L29
    L24:
        r12 = false;
        goto L25
    L20:
        r11 = false;
        goto L21
    L17:
        hasDays = false;
        goto L18
    }

    public String toString() {
        return m8804toStringimpl(this.rawValue);
    }

    /* JADX INFO: renamed from: appendFractional-impl, reason: not valid java name */
    private static final void m8761appendFractionalimpl(long arg0, StringBuilder $this$appendFractional, int whole, int fractional, int fractionalSize, String unit, boolean isoZeroes) {
        $this$appendFractional.append(whole);
        if (fractional == 0) goto L21;
        $this$appendFractional.append('.');
        CharSequence fracString = StringsKt.padStart(String.valueOf(fractional), fractionalSize, '0');
        CharSequence $this$indexOfLast$iv = fracString;
        int r6 = -1;
        int r5 = $this$indexOfLast$iv.length() - 1;
        if (r5 < 0) goto L14;
    L6:
        int index$iv = r5;
        r5 = r5 - 1;
        char it = $this$indexOfLast$iv.charAt(index$iv);
        if (it == '0') goto L9;
        char it2 = 1;
    L10:
        if (it2 != 0) goto L11;
        if (r5 >= 0) goto L6;
    L11:
        r6 = index$iv;
        goto L14
    L9:
        it2 = 0;
    L14:
        int nonZeroDigits = r6 + 1;
        if (isoZeroes == true) goto L18;
        if (nonZeroDigits >= 3) goto L18;
        Intrinsics.checkNotNullExpressionValue($this$appendFractional.append(fracString, 0, nonZeroDigits), "append(...)");
    L18:
        Intrinsics.checkNotNullExpressionValue($this$appendFractional.append(fracString, 0, ((nonZeroDigits + 2) / 3) * 3), "append(...)");
    L21:
        $this$appendFractional.append(unit);
    }

    /* JADX INFO: renamed from: toString-impl$default, reason: not valid java name */
    public static /* synthetic */ String m8806toStringimpl$default(long r0, DurationUnit r2, int r3, int r4, Object r5) {
        if ((r4 & 2) == 0) goto L6;
        r3 = 0;
    L6:
        return m8805toStringimpl(r0, r2, r3);
    }

    /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
    public static final String m8805toStringimpl(long arg0, DurationUnit unit, int decimals) {
        Intrinsics.checkNotNullParameter(unit, "unit");
        if (decimals < 0) goto L5;
        boolean r0 = true;
    L6:
        if (r0 == false) goto L14;
        double number = m8800toDoubleimpl(arg0, unit);
        if (Double.isInfinite(number) == false) goto L12;
        return String.valueOf(number);
    L12:
        return DurationJvmKt.formatToExactDecimals(number, RangesKt.coerceAtMost(decimals, 12)) + DurationUnitKt.shortName(unit);
    L14:
        throw new IllegalArgumentException(("decimals must be not negative, but was " + decimals).toString());
    L5:
        r0 = false;
        goto L6
    }

    /* JADX INFO: renamed from: toIsoString-impl, reason: not valid java name */
    public static final String m8802toIsoStringimpl(long arg0) {
        StringBuilder $this$toIsoString_impl_u24lambda_u245 = new StringBuilder();
        if (m8790isNegativeimpl(arg0) == false) goto L5;
        $this$toIsoString_impl_u24lambda_u245.append('-');
    L5:
        $this$toIsoString_impl_u24lambda_u245.append("PT");
        long arg0$iv = m8770getAbsoluteValueUwyO8pc(arg0);
        long hours = m8773getInWholeHoursimpl(arg0$iv);
        int minutes = m8779getMinutesComponentimpl(arg0$iv);
        int seconds = m8781getSecondsComponentimpl(arg0$iv);
        int nanoseconds = m8780getNanosecondsComponentimpl(arg0$iv);
        if (m8789isInfiniteimpl(arg0) == false) goto L8;
        hours = 9999999999999L;
    L8:
        boolean r7 = true;
        if (hours == 0) goto L11;
        boolean r6 = true;
    L12:
        boolean hasHours = r6;
        if (seconds != 0) goto L17;
        if (nanoseconds != 0) goto L17;
        boolean r8 = false;
    L18:
        boolean hasSeconds = r8;
        if (minutes != 0) goto L24;
        if (hasSeconds == false) goto L23;
        if (hasHours == true) goto L24;
    L23:
        r7 = false;
    L24:
        boolean hasMinutes = r7;
        if (hasHours == false) goto L27;
        $this$toIsoString_impl_u24lambda_u245.append(hours).append('H');
    L27:
        if (hasMinutes == false) goto L29;
        $this$toIsoString_impl_u24lambda_u245.append(minutes).append('M');
    L29:
        if (hasSeconds == true) goto L34;
        if (hasHours == true) goto L36;
        if (hasMinutes == false) goto L34;
    L36:
        return $this$toIsoString_impl_u24lambda_u245.toString();
    L34:
        m8761appendFractionalimpl(arg0, $this$toIsoString_impl_u24lambda_u245, seconds, nanoseconds, 9, "S", true);
    L17:
        r8 = true;
        goto L18
    L11:
        r6 = false;
        goto L12
    }
}
