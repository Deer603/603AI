package androidx.compose.ui.util;

import androidx.autofill.HintConstants;
import androidx.collection.MutableScatterSet;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: ListUtils.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000n\n\u0000\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\u0010 \n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0010\u001c\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0013\n\u0002\u0010\u001f\n\u0002\b\u0003\n\u0002\u0010\u000f\n\u0002\b\u0011\u001a\u0010\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0001\u001a\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0002\u001a\u00020\u0003H\u0001\u001a9\u0010\u0006\u001a\u00020\u0005\"\u0004\b\u0000\u0010\u0007*\u00060\bj\u0002`\t2\u0006\u0010\n\u001a\u0002H\u00072\u0014\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u0002H\u0007\u0012\u0004\u0012\u00020\r\u0018\u00010\fH\u0002¢\u0006\u0002\u0010\u000e\u001a8\u0010\u000f\u001a\u00020\u0010\"\u0004\b\u0000\u0010\u0007*\b\u0012\u0004\u0012\u0002H\u00070\u00112\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u0002H\u0007\u0012\u0004\u0012\u00020\u00100\fH\u0086\b\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001\u001a8\u0010\u0013\u001a\u00020\u0010\"\u0004\b\u0000\u0010\u0007*\b\u0012\u0004\u0012\u0002H\u00070\u00112\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u0002H\u0007\u0012\u0004\u0012\u00020\u00100\fH\u0086\b\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001\u001aD\u0010\u0014\u001a\b\u0012\u0004\u0012\u0002H\u00070\u0011\"\u0004\b\u0000\u0010\u0007\"\u0004\b\u0001\u0010\u0015*\b\u0012\u0004\u0012\u0002H\u00070\u00112\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u0002H\u0007\u0012\u0004\u0012\u0002H\u00150\fH\u0086\b\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001\u001a>\u0010\u0017\u001a\b\u0012\u0004\u0012\u0002H\u00070\u0011\"\u0004\b\u0000\u0010\u0007*\b\u0012\u0004\u0012\u0002H\u00070\u00112\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u0002H\u0007\u0012\u0004\u0012\u00020\u00100\fH\u0086\b\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001\u001a\"\u0010\u0018\u001a\b\u0012\u0004\u0012\u0002H\u00070\u0011\"\b\b\u0000\u0010\u0007*\u00020\u0019*\n\u0012\u0006\u0012\u0004\u0018\u0001H\u00070\u0011\u001a`\u0010\u001a\u001a\b\u0012\u0004\u0012\u0002H\u001b0\u0011\"\u0004\b\u0000\u0010\u0007\"\u0004\b\u0001\u0010\u001b*\b\u0012\u0004\u0012\u0002H\u00070\u00112\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u0002H\u0007\u0012\u0004\u0012\u00020\u00100\f2\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u0002H\u0007\u0012\u0004\u0012\u0002H\u001b0\fH\u0086\b\u0082\u0002\u0010\n\u0006\b\u0001\u0012\u0002\u0010\u0001\n\u0006\b\u0001\u0012\u0002\u0010\u0002\u001a=\u0010\u001c\u001a\u0002H\u0007\"\u0004\b\u0000\u0010\u0007*\b\u0012\u0004\u0012\u0002H\u00070\u00112\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u0002H\u0007\u0012\u0004\u0012\u00020\u00100\fH\u0086\b\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001¢\u0006\u0002\u0010\u001d\u001a?\u0010\u001e\u001a\u0004\u0018\u0001H\u0007\"\u0004\b\u0000\u0010\u0007*\b\u0012\u0004\u0012\u0002H\u00070\u00112\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u0002H\u0007\u0012\u0004\u0012\u00020\u00100\fH\u0086\b\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001¢\u0006\u0002\u0010\u001d\u001aJ\u0010\u001f\u001a\b\u0012\u0004\u0012\u0002H\u001b0\u0011\"\u0004\b\u0000\u0010\u0007\"\u0004\b\u0001\u0010\u001b*\b\u0012\u0004\u0012\u0002H\u00070\u00112\u0018\u0010\u000b\u001a\u0014\u0012\u0004\u0012\u0002H\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u001b0 0\fH\u0086\b\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001\u001a`\u0010!\u001a\u0002H\u001b\"\u0004\b\u0000\u0010\u0007\"\u0004\b\u0001\u0010\u001b*\b\u0012\u0004\u0012\u0002H\u00070\u00112\u0006\u0010\"\u001a\u0002H\u001b2'\u0010#\u001a#\u0012\u0013\u0012\u0011H\u001b¢\u0006\f\b%\u0012\b\b&\u0012\u0004\b\b('\u0012\u0004\u0012\u0002H\u0007\u0012\u0004\u0012\u0002H\u001b0$H\u0086\b\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0002¢\u0006\u0002\u0010(\u001a8\u0010)\u001a\u00020\u0005\"\u0004\b\u0000\u0010\u0007*\b\u0012\u0004\u0012\u0002H\u00070\u00112\u0012\u0010*\u001a\u000e\u0012\u0004\u0012\u0002H\u0007\u0012\u0004\u0012\u00020\u00050\fH\u0086\b\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001\u001a>\u0010+\u001a\u00020\u0005\"\u0004\b\u0000\u0010\u0007*\b\u0012\u0004\u0012\u0002H\u00070\u00112\u0018\u0010*\u001a\u0014\u0012\u0004\u0012\u00020,\u0012\u0004\u0012\u0002H\u0007\u0012\u0004\u0012\u00020\u00050$H\u0086\b\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001\u001a8\u0010-\u001a\u00020\u0005\"\u0004\b\u0000\u0010\u0007*\b\u0012\u0004\u0012\u0002H\u00070\u00112\u0012\u0010*\u001a\u000e\u0012\u0004\u0012\u0002H\u0007\u0012\u0004\u0012\u00020\u00050\fH\u0086\b\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001\u001a}\u0010.\u001a\u0002H/\"\u0004\b\u0000\u0010\u0007\"\f\b\u0001\u0010/*\u00060\bj\u0002`\t*\b\u0012\u0004\u0012\u0002H\u00070\u00112\u0006\u00100\u001a\u0002H/2\b\b\u0002\u00101\u001a\u00020\r2\b\b\u0002\u00102\u001a\u00020\r2\b\b\u0002\u00103\u001a\u00020\r2\b\b\u0002\u00104\u001a\u00020,2\b\b\u0002\u00105\u001a\u00020\r2\u0016\b\u0002\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u0002H\u0007\u0012\u0004\u0012\u00020\r\u0018\u00010\fH\u0002¢\u0006\u0002\u00106\u001a`\u00107\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0007*\b\u0012\u0004\u0012\u0002H\u00070\u00112\b\b\u0002\u00101\u001a\u00020\r2\b\b\u0002\u00102\u001a\u00020\r2\b\b\u0002\u00103\u001a\u00020\r2\b\b\u0002\u00104\u001a\u00020,2\b\b\u0002\u00105\u001a\u00020\r2\u0016\b\u0002\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u0002H\u0007\u0012\u0004\u0012\u00020\r\u0018\u00010\f\u001a?\u00108\u001a\u0004\u0018\u0001H\u0007\"\u0004\b\u0000\u0010\u0007*\b\u0012\u0004\u0012\u0002H\u00070\u00112\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u0002H\u0007\u0012\u0004\u0012\u00020\u00100\fH\u0086\b\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001¢\u0006\u0002\u0010\u001d\u001aD\u00109\u001a\b\u0012\u0004\u0012\u0002H\u001b0\u0011\"\u0004\b\u0000\u0010\u0007\"\u0004\b\u0001\u0010\u001b*\b\u0012\u0004\u0012\u0002H\u00070\u00112\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u0002H\u0007\u0012\u0004\u0012\u0002H\u001b0\fH\u0086\b\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001\u001aY\u0010:\u001a\b\u0012\u0004\u0012\u0002H\u001b0\u0011\"\u0004\b\u0000\u0010\u0007\"\u0004\b\u0001\u0010\u001b*\b\u0012\u0004\u0012\u0002H\u00070\u00112'\u0010\u000b\u001a#\u0012\u0013\u0012\u00110,¢\u0006\f\b%\u0012\b\b&\u0012\u0004\b\b(;\u0012\u0004\u0012\u0002H\u0007\u0012\u0004\u0012\u0002H\u001b0$H\u0086\b\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001\u001a[\u0010<\u001a\b\u0012\u0004\u0012\u0002H\u001b0\u0011\"\u0004\b\u0000\u0010\u0007\"\u0004\b\u0001\u0010\u001b*\b\u0012\u0004\u0012\u0002H\u00070\u00112)\u0010\u000b\u001a%\u0012\u0013\u0012\u00110,¢\u0006\f\b%\u0012\b\b&\u0012\u0004\b\b(;\u0012\u0004\u0012\u0002H\u0007\u0012\u0006\u0012\u0004\u0018\u0001H\u001b0$H\u0086\b\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001\u001aF\u0010=\u001a\b\u0012\u0004\u0012\u0002H\u001b0\u0011\"\u0004\b\u0000\u0010\u0007\"\u0004\b\u0001\u0010\u001b*\b\u0012\u0004\u0012\u0002H\u00070\u00112\u0014\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u0002H\u0007\u0012\u0006\u0012\u0004\u0018\u0001H\u001b0\fH\u0086\b\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001\u001a]\u0010>\u001a\u0002H?\"\u0004\b\u0000\u0010\u0007\"\u0004\b\u0001\u0010\u001b\"\u0010\b\u0002\u0010?*\n\u0012\u0006\b\u0000\u0012\u0002H\u001b0@*\b\u0012\u0004\u0012\u0002H\u00070\u00112\u0006\u0010A\u001a\u0002H?2\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u0002H\u0007\u0012\u0004\u0012\u0002H\u001b0\fH\u0086\b\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0002¢\u0006\u0002\u0010B\u001aO\u0010C\u001a\u0004\u0018\u0001H\u0007\"\u0004\b\u0000\u0010\u0007\"\u000e\b\u0001\u0010\u001b*\b\u0012\u0004\u0012\u0002H\u001b0D*\b\u0012\u0004\u0012\u0002H\u00070\u00112\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u0002H\u0007\u0012\u0004\u0012\u0002H\u001b0\fH\u0086\b\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001¢\u0006\u0002\u0010\u001d\u001aU\u0010E\u001a\u0002H\u001b\"\u0004\b\u0000\u0010\u0007\"\u000e\b\u0001\u0010\u001b*\b\u0012\u0004\u0012\u0002H\u001b0D*\b\u0012\u0004\u0012\u0002H\u00070\u00112\u0006\u0010F\u001a\u0002H\u001b2\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u0002H\u0007\u0012\u0004\u0012\u0002H\u001b0\fH\u0086\b\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0002¢\u0006\u0002\u0010G\u001aO\u0010H\u001a\u0004\u0018\u0001H\u001b\"\u0004\b\u0000\u0010\u0007\"\u000e\b\u0001\u0010\u001b*\b\u0012\u0004\u0012\u0002H\u001b0D*\b\u0012\u0004\u0012\u0002H\u00070\u00112\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u0002H\u0007\u0012\u0004\u0012\u0002H\u001b0\fH\u0086\b\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001¢\u0006\u0002\u0010I\u001aO\u0010J\u001a\u0004\u0018\u0001H\u0007\"\u0004\b\u0000\u0010\u0007\"\u000e\b\u0001\u0010\u001b*\b\u0012\u0004\u0012\u0002H\u001b0D*\b\u0012\u0004\u0012\u0002H\u00070\u00112\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u0002H\u0007\u0012\u0004\u0012\u0002H\u001b0\fH\u0086\b\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001¢\u0006\u0002\u0010\u001d\u001a\\\u0010K\u001a\u0002HL\"\u0004\b\u0000\u0010L\"\b\b\u0001\u0010\u0007*\u0002HL*\b\u0012\u0004\u0012\u0002H\u00070\u00112'\u0010#\u001a#\u0012\u0013\u0012\u0011HL¢\u0006\f\b%\u0012\b\b&\u0012\u0004\b\b('\u0012\u0004\u0012\u0002H\u0007\u0012\u0004\u0012\u0002HL0$H\u0086\b\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001¢\u0006\u0002\u0010M\u001a8\u0010N\u001a\u00020,\"\u0004\b\u0000\u0010\u0007*\b\u0012\u0004\u0012\u0002H\u00070\u00112\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u0002H\u0007\u0012\u0004\u0012\u00020,0\fH\u0086\b\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001\u001a|\u0010O\u001a\b\u0012\u0004\u0012\u0002HP0\u0011\"\u0004\b\u0000\u0010\u0007\"\u0004\b\u0001\u0010\u001b\"\u0004\b\u0002\u0010P*\b\u0012\u0004\u0012\u0002H\u00070\u00112\f\u0010Q\u001a\b\u0012\u0004\u0012\u0002H\u001b0\u001126\u0010\u000b\u001a2\u0012\u0013\u0012\u0011H\u0007¢\u0006\f\b%\u0012\b\b&\u0012\u0004\b\b(R\u0012\u0013\u0012\u0011H\u001b¢\u0006\f\b%\u0012\b\b&\u0012\u0004\b\b(S\u0012\u0004\u0012\u0002HP0$H\u0086\b\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0002\u001aJ\u0010T\u001a\b\u0012\u0004\u0012\u0002H\u001b0\u0011\"\u0004\b\u0000\u0010\u0007\"\u0004\b\u0001\u0010\u001b*\b\u0012\u0004\u0012\u0002H\u00070\u00112\u0018\u0010\u000b\u001a\u0014\u0012\u0004\u0012\u0002H\u0007\u0012\u0004\u0012\u0002H\u0007\u0012\u0004\u0012\u0002H\u001b0$H\u0086\b\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001¨\u0006U"}, d2 = {"throwNoSuchElementException", "", "message", "", "throwUnsupportedOperationException", "", "appendElement", "T", "Ljava/lang/Appendable;", "Lkotlin/text/Appendable;", "element", "transform", "Lkotlin/Function1;", "", "(Ljava/lang/Appendable;Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)V", "fastAll", "", "", "predicate", "fastAny", "fastDistinctBy", "K", "selector", "fastFilter", "fastFilterNotNull", "", "fastFilteredMap", "R", "fastFirst", "(Ljava/util/List;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "fastFirstOrNull", "fastFlatMap", "", "fastFold", "initial", "operation", "Lkotlin/Function2;", "Lkotlin/ParameterName;", HintConstants.AUTOFILL_HINT_NAME, "acc", "(Ljava/util/List;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)Ljava/lang/Object;", "fastForEach", "action", "fastForEachIndexed", "", "fastForEachReversed", "fastJoinTo", "A", "buffer", "separator", "prefix", "postfix", "limit", "truncated", "(Ljava/util/List;Ljava/lang/Appendable;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/CharSequence;Lkotlin/jvm/functions/Function1;)Ljava/lang/Appendable;", "fastJoinToString", "fastLastOrNull", "fastMap", "fastMapIndexed", "index", "fastMapIndexedNotNull", "fastMapNotNull", "fastMapTo", "C", "", "destination", "(Ljava/util/List;Ljava/util/Collection;Lkotlin/jvm/functions/Function1;)Ljava/util/Collection;", "fastMaxBy", "", "fastMaxOfOrDefault", "defaultValue", "(Ljava/util/List;Ljava/lang/Comparable;Lkotlin/jvm/functions/Function1;)Ljava/lang/Comparable;", "fastMaxOfOrNull", "(Ljava/util/List;Lkotlin/jvm/functions/Function1;)Ljava/lang/Comparable;", "fastMinByOrNull", "fastReduce", "S", "(Ljava/util/List;Lkotlin/jvm/functions/Function2;)Ljava/lang/Object;", "fastSumBy", "fastZip", "V", "other", "a", "b", "fastZipWithNext", "ui-util_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class ListUtilsKt {
    public static final <T> void fastForEach(List<? extends T> r4, Function1<? super T, Unit> r5) {
        int index = 0;
        int r2 = r4.size();
    L3:
        if (index >= r2) goto L5;
        Object item = r4.get(index);
        r5.invoke(item);
        index = index + 1;
        goto L3
    }

    public static final <T> void fastForEachReversed(List<? extends T> r4, Function1<? super T, Unit> r5) {
        int r1 = r4.size() - 1;
        if (r1 < 0) goto L6;
    L4:
        int index = r1;
        r1 = r1 - 1;
        Object item = r4.get(index);
        r5.invoke(item);
        if (r1 >= 0) goto L4;
        return;
    }

    public static final <T> void fastForEachIndexed(List<? extends T> r5, Function2<? super Integer, ? super T, Unit> r6) {
        int index = 0;
        int r2 = r5.size();
    L3:
        if (index >= r2) goto L5;
        Object item = r5.get(index);
        r6.invoke(Integer.valueOf(index), item);
        index = index + 1;
        goto L3
    }

    public static final <T> boolean fastAll(List<? extends T> r9, Function1<? super T, Boolean> r10) {
        int index$iv = 0;
        int r4 = r9.size();
    L3:
        if (index$iv >= r4) goto L9;
        Object item$iv = r9.get(index$iv);
        if (r10.invoke(item$iv).booleanValue() == false) goto L6;
        index$iv = index$iv + 1;
        goto L3
    L6:
        return false;
    L9:
        return true;
    }

    public static final <T> boolean fastAny(List<? extends T> r9, Function1<? super T, Boolean> r10) {
        int index$iv = 0;
        int r4 = r9.size();
    L3:
        if (index$iv >= r4) goto L9;
        Object item$iv = r9.get(index$iv);
        if (r10.invoke(item$iv).booleanValue() == true) goto L6;
        index$iv = index$iv + 1;
        goto L3
    L6:
        return true;
    L9:
        return false;
    }

    /* JADX WARN: Type inference failed for: r5v0, types: [T, java.lang.Object] */
    public static final <T> T fastFirstOrNull(List<? extends T> r9, Function1<? super T, Boolean> r10) {
        int r3 = 0;
        int r4 = r9.size();
    L3:
        if (r3 >= r4) goto L8;
        T r5 = r9.get(r3);
        if (r10.invoke(r5).booleanValue() == true) goto L6;
        r3 = r3 + 1;
        goto L3
    L6:
        return r5;
    L8:
        return null;
    }

    public static final <T> int fastSumBy(List<? extends T> r10, Function1<? super T, Integer> r11) {
        int sum = 0;
        int index$iv = 0;
        int r5 = r10.size();
    L3:
        if (index$iv >= r5) goto L6;
        Object item$iv = r10.get(index$iv);
        sum = sum + r11.invoke(item$iv).intValue();
        index$iv = index$iv + 1;
        goto L3
    L6:
        return sum;
    }

    public static final <T, R> List<R> fastMap(List<? extends T> r11, Function1<? super T, ? extends R> r12) {
        ArrayList target = new ArrayList(r11.size());
        int index$iv = 0;
        int r5 = r11.size();
    L3:
        if (index$iv >= r5) goto L6;
        Object item$iv = r11.get(index$iv);
        target.add(r12.invoke(item$iv));
        index$iv = index$iv + 1;
        goto L3
    L6:
        return target;
    }

    public static final <T, R extends Comparable<? super R>> T fastMaxBy(List<? extends T> r8, Function1<? super T, ? extends R> r9) {
        if (r8.isEmpty() == false) goto L6;
        return null;
    L6:
        T r1 = r8.get(0);
        R r2 = r9.invoke(r1);
        int r3 = 1;
        int r4 = CollectionsKt.getLastIndex(r8);
        if (1 > r4) goto L13;
    L8:
        Object r5 = r8.get(r3);
        R r6 = r9.invoke(r5);
        if (r2.compareTo(r6) >= 0) goto L11;
        r1 = (T) r5;
        r2 = r6;
    L11:
        if (r3 == r4) goto L13;
        r3 = r3 + 1;
    L13:
        return (T) r1;
    }

    public static final <T, R, C extends Collection<? super R>> C fastMapTo(List<? extends T> r9, C r10, Function1<? super T, ? extends R> r11) {
        int index$iv = 0;
        int r4 = r9.size();
    L3:
        if (index$iv >= r4) goto L6;
        Object item$iv = r9.get(index$iv);
        r10.add(r11.invoke(item$iv));
        index$iv = index$iv + 1;
        goto L3
    L6:
        return r10;
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [T, java.lang.Object] */
    public static final <T> T fastLastOrNull(List<? extends T> r5, Function1<? super T, Boolean> r6) {
        int r1 = r5.size() - 1;
        if (r1 < 0) goto L8;
    L4:
        int r2 = r1;
        r1 = r1 - 1;
        T r3 = r5.get(r2);
        if (r6.invoke(r3).booleanValue() == true) goto L6;
        if (r1 >= 0) goto L4;
        return null;
    L6:
        return r3;
    L8:
        return null;
    }

    public static final <T> List<T> fastFilter(List<? extends T> r10, Function1<? super T, Boolean> r11) {
        ArrayList target = new ArrayList(r10.size());
        int index$iv = 0;
        int r5 = r10.size();
    L3:
        if (index$iv >= r5) goto L9;
        Object item$iv = r10.get(index$iv);
        if (r11.invoke(item$iv).booleanValue() == false) goto L7;
        target.add(item$iv);
    L7:
        index$iv = index$iv + 1;
        goto L3
    L9:
        return target;
    }

    public static final <T, R> List<R> fastFilteredMap(List<? extends T> r11, Function1<? super T, Boolean> r12, Function1<? super T, ? extends R> r13) {
        ArrayList target = new ArrayList(r11.size());
        int index$iv = 0;
        int r5 = r11.size();
    L3:
        if (index$iv >= r5) goto L9;
        Object item$iv = r11.get(index$iv);
        if (r12.invoke(item$iv).booleanValue() == false) goto L7;
        target.add(r13.invoke(item$iv));
    L7:
        index$iv = index$iv + 1;
        goto L3
    L9:
        return target;
    }

    public static final <T, R> R fastFold(List<? extends T> r9, R r10, Function2<? super R, ? super T, ? extends R> r11) {
        R r1 = r10;
        int r4 = 0;
        int r5 = r9.size();
    L3:
        if (r4 >= r5) goto L6;
        R r2 = r1;
        r1 = r11.invoke(r2, r9.get(r4));
        r4 = r4 + 1;
        goto L3
    L6:
        return r1;
    }

    public static final <T, R> List<R> fastMapIndexed(List<? extends T> r12, Function2<? super Integer, ? super T, ? extends R> r13) {
        ArrayList target = new ArrayList(r12.size());
        int index$iv = 0;
        int r5 = r12.size();
    L3:
        if (index$iv >= r5) goto L6;
        Object item$iv = r12.get(index$iv);
        int index = index$iv;
        target.add(r13.invoke(Integer.valueOf(index), item$iv));
        index$iv = index$iv + 1;
        goto L3
    L6:
        return target;
    }

    public static final <T, R> List<R> fastMapIndexedNotNull(List<? extends T> r13, Function2<? super Integer, ? super T, ? extends R> r14) {
        ArrayList target = new ArrayList(r13.size());
        int index$iv = 0;
        int r5 = r13.size();
    L3:
        if (index$iv >= r5) goto L9;
        Object item$iv = r13.get(index$iv);
        int index = index$iv;
        R r10 = r14.invoke(Integer.valueOf(index), item$iv);
        if (r10 == null) goto L7;
        target.add(r10);
    L7:
        index$iv = index$iv + 1;
        goto L3
    L9:
        return target;
    }

    public static final <T, R extends Comparable<? super R>> R fastMaxOfOrNull(List<? extends T> r6, Function1<? super T, ? extends R> r7) {
        if (r6.isEmpty() == false) goto L6;
        return null;
    L6:
        R r1 = r7.invoke(r6.get(0));
        int r2 = 1;
        int r3 = CollectionsKt.getLastIndex(r6);
        if (1 > r3) goto L13;
    L8:
        R r4 = r7.invoke(r6.get(r2));
        if (r4.compareTo(r1) <= 0) goto L11;
        r1 = r4;
    L11:
        if (r2 == r3) goto L13;
        r2 = r2 + 1;
    L13:
        return r1;
    }

    public static final <T, R extends Comparable<? super R>> R fastMaxOfOrDefault(List<? extends T> r6, R r7, Function1<? super T, ? extends R> r8) {
        if (r6.isEmpty() == false) goto L5;
        return r7;
    L5:
        R r1 = r8.invoke(r6.get(0));
        int r2 = 1;
        int r3 = CollectionsKt.getLastIndex(r6);
        if (1 > r3) goto L12;
    L7:
        R r4 = r8.invoke(r6.get(r2));
        if (r4.compareTo(r1) <= 0) goto L10;
        r1 = r4;
    L10:
        if (r2 == r3) goto L12;
        r2 = r2 + 1;
    L12:
        return r1;
    }

    public static final <T, R> List<R> fastZipWithNext(List<? extends T> r7, Function2<? super T, ? super T, ? extends R> r8) {
        if (r7.size() <= 1) goto L5;
        List result = new ArrayList();
        Object current = r7.get(0);
        int i = 0;
        int r4 = CollectionsKt.getLastIndex(r7);
    L7:
        if (i >= r4) goto L9;
        Object next = r7.get(i + 1);
        result.add(r8.invoke(current, next));
        current = next;
        i = i + 1;
        goto L7
    L9:
        return result;
    L5:
        return CollectionsKt.emptyList();
    }

    public static final <S, T extends S> S fastReduce(List<? extends T> r5, Function2<? super S, ? super T, ? extends S> r6) {
        if (r5.isEmpty() == false) goto L5;
        throwUnsupportedOperationException("Empty collection can't be reduced.");
    L5:
        S r1 = (Object) CollectionsKt.first(r5);
        int r2 = 1;
        int r3 = CollectionsKt.getLastIndex(r5);
        if (1 > r3) goto L10;
    L7:
        S r4 = r1;
        r1 = r6.invoke(r4, r5.get(r2));
        if (r2 == r3) goto L10;
        r2 = r2 + 1;
    L10:
        return r1;
    }

    public static final <T, R, V> List<V> fastZip(List<? extends T> r7, List<? extends R> r8, Function2<? super T, ? super R, ? extends V> r9) {
        int r1 = Math.min(r7.size(), r8.size());
        ArrayList r2 = new ArrayList(r1);
        int r3 = 0;
    L3:
        if (r3 >= r1) goto L6;
        r2.add(r9.invoke(r7.get(r3), r8.get(r3)));
        r3 = r3 + 1;
        goto L3
    L6:
        return r2;
    }

    public static final <T, R> List<R> fastMapNotNull(List<? extends T> r12, Function1<? super T, ? extends R> r13) {
        ArrayList target = new ArrayList(r12.size());
        int index$iv = 0;
        int r5 = r12.size();
    L3:
        if (index$iv >= r5) goto L9;
        Object item$iv = r12.get(index$iv);
        R r9 = r13.invoke(item$iv);
        if (r9 == null) goto L7;
        target.add(r9);
    L7:
        index$iv = index$iv + 1;
        goto L3
    L9:
        return target;
    }

    public static /* synthetic */ String fastJoinToString$default(List r1, CharSequence r2, CharSequence r3, CharSequence r4, int r5, CharSequence r6, Function1 r7, int r8, Object r9) {
        if ((r8 & 1) == 0) goto L6;
    L6:
        if ((r8 & 2) == 0) goto L9;
    L9:
        if ((r8 & 4) == 0) goto L12;
    L12:
        if ((r8 & 8) == 0) goto L15;
        r5 = -1;
    L15:
        if ((r8 & 16) == 0) goto L18;
    L18:
        if ((r8 & 32) == 0) goto L20;
        Function1 r10 = null;
    L21:
        CharSequence r11 = r6;
        CharSequence r12 = r4;
        return fastJoinToString(r1, r2, r3, r12, r5, r11, r10);
    L20:
        r10 = r7;
        goto L21
    }

    public static final <T> String fastJoinToString(List<? extends T> r9, CharSequence separator, CharSequence prefix, CharSequence postfix, int limit, CharSequence truncated, Function1<? super T, ? extends CharSequence> r15) {
        return ((StringBuilder) fastJoinTo(r9, new StringBuilder(), separator, prefix, postfix, limit, truncated, r15)).toString();
    }

    public static final <T, K> List<T> fastDistinctBy(List<? extends T> r12, Function1<? super T, ? extends K> r13) {
        MutableScatterSet set = new MutableScatterSet(r12.size());
        ArrayList target = new ArrayList(r12.size());
        int index$iv = 0;
        int r6 = r12.size();
    L3:
        if (index$iv >= r6) goto L9;
        Object item$iv = r12.get(index$iv);
        if (set.add(r13.invoke(item$iv)) == false) goto L7;
        target.add(item$iv);
    L7:
        index$iv = index$iv + 1;
        goto L3
    L9:
        return target;
    }

    public static final <T, R extends Comparable<? super R>> T fastMinByOrNull(List<? extends T> r8, Function1<? super T, ? extends R> r9) {
        if (r8.isEmpty() == false) goto L6;
        return null;
    L6:
        T r1 = r8.get(0);
        R r2 = r9.invoke(r1);
        int r3 = 1;
        int r4 = CollectionsKt.getLastIndex(r8);
        if (1 > r4) goto L13;
    L8:
        Object r5 = r8.get(r3);
        R r6 = r9.invoke(r5);
        if (r2.compareTo(r6) <= 0) goto L11;
        r1 = (T) r5;
        r2 = r6;
    L11:
        if (r3 == r4) goto L13;
        r3 = r3 + 1;
    L13:
        return (T) r1;
    }

    public static final <T, R> List<R> fastFlatMap(List<? extends T> r11, Function1<? super T, ? extends Iterable<? extends R>> r12) {
        ArrayList target = new ArrayList(r11.size());
        int index$iv = 0;
        int r5 = r11.size();
    L3:
        if (index$iv >= r5) goto L6;
        Object item$iv = r11.get(index$iv);
        ArrayList r10 = target;
        CollectionsKt.addAll(r10, r12.invoke(item$iv));
        index$iv = index$iv + 1;
        goto L3
    L6:
        return target;
    }

    public static final <T> List<T> fastFilterNotNull(List<? extends T> r9) {
        ArrayList target = new ArrayList(r9.size());
        int index$iv = 0;
        int r4 = r9.size();
    L3:
        if (index$iv >= r4) goto L9;
        T r5 = r9.get(index$iv);
        if (r5 == null) goto L7;
        target.add(r5);
    L7:
        index$iv = index$iv + 1;
        goto L3
    L9:
        return target;
    }

    /* JADX WARN: Type inference failed for: r5v0, types: [T, java.lang.Object] */
    public static final <T> T fastFirst(List<? extends T> r9, Function1<? super T, Boolean> r10) {
        int r3 = 0;
        int r4 = r9.size();
    L3:
        if (r3 >= r4) goto L8;
        T r5 = r9.get(r3);
        if (r10.invoke(r5).booleanValue() == true) goto L6;
        r3 = r3 + 1;
        goto L3
    L6:
        return r5;
    L8:
        throwNoSuchElementException("Collection contains no element matching the predicate.");
        throw new KotlinNothingValueException();
    }

    static /* synthetic */ Appendable fastJoinTo$default(List r6, Appendable r7, CharSequence r8, CharSequence r9, CharSequence r10, int r11, CharSequence r12, Function1 r13, int r14, Object r15) {
        if ((r14 & 2) == 0) goto L5;
    L7:
        if ((r14 & 4) == 0) goto L9;
    L11:
        if ((r14 & 8) == 0) goto L13;
    L15:
        if ((r14 & 16) == 0) goto L17;
        int r3 = -1;
    L19:
        if ((r14 & 32) == 0) goto L21;
    L23:
        if ((r14 & 64) == 0) goto L25;
        Function1 r5 = null;
    L27:
        return fastJoinTo(r6, r7, r0, r1, r2, r3, r4, r5);
    L25:
        r5 = r13;
        goto L27
    L21:
        CharSequence r4 = r12;
        goto L23
    L17:
        r3 = r11;
        goto L19
    L13:
        CharSequence r2 = r10;
        goto L15
    L9:
        CharSequence r1 = r9;
        goto L11
    L5:
        CharSequence r0 = r8;
        goto L7
    }

    private static final <T, A extends Appendable> A fastJoinTo(List<? extends T> r5, A r6, CharSequence separator, CharSequence prefix, CharSequence postfix, int limit, CharSequence truncated, Function1<? super T, ? extends CharSequence> r12) {
        r6.append(prefix);
        int count = 0;
        int index = 0;
        int r2 = r5.size();
    L3:
        if (index >= r2) goto L12;
        Object element = r5.get(index);
        count = count + 1;
        if (count <= 1) goto L7;
        r6.append(separator);
    L7:
        if (limit < 0) goto L11;
        if (count > limit) goto L12;
    L11:
        appendElement(r6, element, r12);
        index = index + 1;
    L12:
        if (limit < 0) goto L15;
        if (count <= limit) goto L15;
        r6.append(truncated);
    L15:
        r6.append(postfix);
        return r6;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final <T> void appendElement(Appendable $this$appendElement, T r2, Function1<? super T, ? extends CharSequence> r3) {
        if (r3 == null) goto L4;
        $this$appendElement.append(r3.invoke(r2));
        return;
    L4:
        if (r2 != 0) goto L6;
        boolean r0 = true;
    L7:
        if (r0 == false) goto L10;
        $this$appendElement.append((CharSequence) r2);
        return;
    L10:
        if ((r2 instanceof Character) == false) goto L12;
        $this$appendElement.append(((Character) r2).charValue());
        return;
    L12:
        $this$appendElement.append(String.valueOf(r2));
        return;
    L6:
        r0 = r2 instanceof CharSequence;
        goto L7
    }

    public static final Void throwNoSuchElementException(String message) {
        throw new NoSuchElementException(message);
    }

    public static final void throwUnsupportedOperationException(String message) {
        throw new UnsupportedOperationException(message);
    }
}
