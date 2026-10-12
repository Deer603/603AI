package androidx.compose.ui.text;

import androidx.collection.IntListKt;
import androidx.collection.MutableIntList;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.ui.text.internal.InlineClassHelperKt;
import androidx.compose.ui.text.style.LineHeightStyle;
import androidx.compose.ui.text.style.TextIndent;
import androidx.compose.ui.text.style.TextMotion;
import androidx.compose.ui.unit.TextUnit;
import androidx.compose.ui.unit.TextUnitKt;
import androidx.compose.ui.unit.TextUnitType;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ReplaceWith;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: AnnotatedString.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\f\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u0000 A2\u00020\u0001:\u0005?@ABCB;\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0014\b\u0002\u0010\u0004\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u0005\u0012\u0014\b\u0002\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u00060\u0005¢\u0006\u0002\u0010\nB'\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0016\b\u0002\u0010\u000b\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\f0\u00060\u0005¢\u0006\u0002\u0010\rB'\b\u0000\u0012\u0016\u0010\u000b\u001a\u0012\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\f0\u0006\u0018\u00010\u0005\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u000eJ\u0013\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010 H\u0096\u0002J0\u0010!\u001a\u00020\u00002(\u0010\"\u001a$\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\f0\u0006\u0012\u0012\u0012\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\f0\u00060\u00050#J\u0011\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020\u0012H\u0096\u0002J\"\u0010'\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020(0\u00060\u00052\u0006\u0010)\u001a\u00020\u00122\u0006\u0010*\u001a\u00020\u0012J\"\u0010+\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00060\u00052\u0006\u0010)\u001a\u00020\u00122\u0006\u0010*\u001a\u00020\u0012J*\u0010+\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00060\u00052\u0006\u0010,\u001a\u00020\u00032\u0006\u0010)\u001a\u00020\u00122\u0006\u0010*\u001a\u00020\u0012J\"\u0010-\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020.0\u00060\u00052\u0006\u0010)\u001a\u00020\u00122\u0006\u0010*\u001a\u00020\u0012J$\u0010/\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002000\u00060\u00052\u0006\u0010)\u001a\u00020\u00122\u0006\u0010*\u001a\u00020\u0012H\u0007J\u000e\u00101\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u0000J\u0016\u00102\u001a\u00020\u001e2\u0006\u0010)\u001a\u00020\u00122\u0006\u0010*\u001a\u00020\u0012J\u001e\u00103\u001a\u00020\u001e2\u0006\u0010,\u001a\u00020\u00032\u0006\u0010)\u001a\u00020\u00122\u0006\u0010*\u001a\u00020\u0012J\b\u00104\u001a\u00020\u0012H\u0016J*\u00105\u001a\u00020\u00002\"\u0010\"\u001a\u001e\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\f0\u0006\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\f0\u00060#J\u0011\u00106\u001a\u00020\u00002\u0006\u0010\u001f\u001a\u00020\u0000H\u0087\u0002J\u0018\u00107\u001a\u00020\u00002\u0006\u00108\u001a\u000209ø\u0001\u0000¢\u0006\u0004\b:\u0010;J\u0018\u00107\u001a\u00020\u00002\u0006\u0010<\u001a\u00020\u00122\u0006\u0010=\u001a\u00020\u0012H\u0016J\b\u0010>\u001a\u00020\u0003H\u0016R$\u0010\u000b\u001a\u0012\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\f0\u0006\u0018\u00010\u0005X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0011\u001a\u00020\u00128VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u001d\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u00060\u00058F¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0010R\"\u0010\u0016\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u0006\u0018\u00010\u0005X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0010R\u001d\u0010\u0004\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u00058F¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0010R\"\u0010\u0019\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0018\u00010\u0005X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0010R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001c\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006D"}, d2 = {"Landroidx/compose/ui/text/AnnotatedString;", "", "text", "", "spanStyles", "", "Landroidx/compose/ui/text/AnnotatedString$Range;", "Landroidx/compose/ui/text/SpanStyle;", "paragraphStyles", "Landroidx/compose/ui/text/ParagraphStyle;", "(Ljava/lang/String;Ljava/util/List;Ljava/util/List;)V", "annotations", "Landroidx/compose/ui/text/AnnotatedString$Annotation;", "(Ljava/lang/String;Ljava/util/List;)V", "(Ljava/util/List;Ljava/lang/String;)V", "getAnnotations$ui_text_release", "()Ljava/util/List;", "length", "", "getLength", "()I", "getParagraphStyles", "paragraphStylesOrNull", "getParagraphStylesOrNull$ui_text_release", "getSpanStyles", "spanStylesOrNull", "getSpanStylesOrNull$ui_text_release", "getText", "()Ljava/lang/String;", "equals", "", "other", "", "flatMapAnnotations", "transform", "Lkotlin/Function1;", "get", "", "index", "getLinkAnnotations", "Landroidx/compose/ui/text/LinkAnnotation;", "start", "end", "getStringAnnotations", "tag", "getTtsAnnotations", "Landroidx/compose/ui/text/TtsAnnotation;", "getUrlAnnotations", "Landroidx/compose/ui/text/UrlAnnotation;", "hasEqualAnnotations", "hasLinkAnnotations", "hasStringAnnotations", "hashCode", "mapAnnotations", "plus", "subSequence", "range", "Landroidx/compose/ui/text/TextRange;", "subSequence-5zc-tL8", "(J)Landroidx/compose/ui/text/AnnotatedString;", "startIndex", "endIndex", "toString", "Annotation", "Builder", "Companion", "ExhaustiveAnnotation", "Range", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class AnnotatedString implements CharSequence {
    public static final int $stable = 0;
    public static final Companion Companion = null;
    private static final Saver<AnnotatedString, ?> Saver = null;
    private final List<Range<? extends Annotation>> annotations;
    private final List<Range<ParagraphStyle>> paragraphStylesOrNull;
    private final List<Range<SpanStyle>> spanStylesOrNull;
    private final String text;

    /* JADX INFO: compiled from: AnnotatedString.kt */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001\u0082\u0001\b\u0002\u0003\u0004\u0005\u0006\u0007\b\tø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\nÀ\u0006\u0001"}, d2 = {"Landroidx/compose/ui/text/AnnotatedString$Annotation;", "", "Landroidx/compose/ui/text/AnnotatedString$ExhaustiveAnnotation;", "Landroidx/compose/ui/text/Bullet;", "Landroidx/compose/ui/text/LinkAnnotation;", "Landroidx/compose/ui/text/ParagraphStyle;", "Landroidx/compose/ui/text/SpanStyle;", "Landroidx/compose/ui/text/StringAnnotation;", "Landroidx/compose/ui/text/TtsAnnotation;", "Landroidx/compose/ui/text/UrlAnnotation;", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface Annotation {
    }

    /* JADX INFO: compiled from: AnnotatedString.kt */
    @Metadata(d1 = {"\u0000²\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\f\n\u0002\u0010\r\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00060\u0001j\u0002`\u0002:\u0002TUB\u000f\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005B\u000f\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007B\u000f\u0012\b\b\u0002\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ2\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\t2\u0006\u0010\u001f\u001a\u00020\tH\u0000ø\u0001\u0000¢\u0006\u0004\b \u0010!J%\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\t2\u0006\u0010\u001f\u001a\u00020\tH\u0000¢\u0006\u0002\b\"J\u001e\u0010#\u001a\u00020\u00192\u0006\u0010$\u001a\u00020%2\u0006\u0010\u001e\u001a\u00020\t2\u0006\u0010\u001f\u001a\u00020\tJ\u001e\u0010#\u001a\u00020\u00192\u0006\u0010&\u001a\u00020'2\u0006\u0010\u001e\u001a\u00020\t2\u0006\u0010\u001f\u001a\u00020\tJ&\u0010(\u001a\u00020\u00192\u0006\u0010)\u001a\u00020\u00042\u0006\u0010*\u001a\u00020\u00042\u0006\u0010\u001e\u001a\u00020\t2\u0006\u0010\u001f\u001a\u00020\tJ\u001e\u0010+\u001a\u00020\u00192\u0006\u0010,\u001a\u00020-2\u0006\u0010\u001e\u001a\u00020\t2\u0006\u0010\u001f\u001a\u00020\tJ\u001e\u0010+\u001a\u00020\u00192\u0006\u0010,\u001a\u00020.2\u0006\u0010\u001e\u001a\u00020\t2\u0006\u0010\u001f\u001a\u00020\tJ\u001e\u0010/\u001a\u00020\u00192\u0006\u00100\u001a\u0002012\u0006\u0010\u001e\u001a\u00020\t2\u0006\u0010\u001f\u001a\u00020\tJ \u00102\u001a\u00020\u00192\u0006\u00103\u001a\u0002042\u0006\u0010\u001e\u001a\u00020\t2\u0006\u0010\u001f\u001a\u00020\tH\u0007J\u000e\u00105\u001a\u00020\u00192\u0006\u0010\u0003\u001a\u00020\u0006J\u001e\u00105\u001a\u00020\u00192\u0006\u0010\u0003\u001a\u00020\u00062\u0006\u0010\u001e\u001a\u00020\t2\u0006\u0010\u001f\u001a\u00020\tJ\u0010\u00105\u001a\u00020\u00002\u0006\u00106\u001a\u000207H\u0016J\u0012\u00105\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u000108H\u0016J\"\u00105\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u0001082\u0006\u0010\u001e\u001a\u00020\t2\u0006\u0010\u001f\u001a\u00020\tH\u0016J\u000e\u00105\u001a\u00020\u00192\u0006\u0010\u0003\u001a\u00020\u0004J\u0015\u00109\u001a\u00020\u00192\u0006\u00106\u001a\u000207H\u0007¢\u0006\u0002\b5J7\u0010:\u001a\u00020\u00192(\u0010;\u001a$\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u000e0=\u0012\u0012\u0012\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u000e0=0>0<H\u0000¢\u0006\u0002\b?J1\u0010@\u001a\u00020\u00192\"\u0010;\u001a\u001e\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u000e0=\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u000e0=0<H\u0000¢\u0006\u0002\bAJ\u0006\u0010B\u001a\u00020\u0019J\u000e\u0010B\u001a\u00020\u00192\u0006\u0010C\u001a\u00020\tJ\u0015\u0010D\u001a\u00020\t2\u0006\u0010\u001a\u001a\u00020\u001bH\u0000¢\u0006\u0002\bEJ\u000e\u0010F\u001a\u00020\t2\u0006\u0010G\u001a\u00020HJ\u0016\u0010I\u001a\u00020\t2\u0006\u0010)\u001a\u00020\u00042\u0006\u0010*\u001a\u00020\u0004J\u000e\u0010J\u001a\u00020\t2\u0006\u0010,\u001a\u00020-J\u000e\u0010J\u001a\u00020\t2\u0006\u0010,\u001a\u00020.J\u000e\u0010K\u001a\u00020\t2\u0006\u00100\u001a\u000201J\u0010\u0010L\u001a\u00020\t2\u0006\u00103\u001a\u000204H\u0007J\u0006\u0010M\u001a\u00020\u0006JI\u0010N\u001a\u0002HO\"\b\b\u0000\u0010O*\u00020\u00152\b\b\u0002\u0010\u001c\u001a\u00020\u001d2\b\b\u0002\u0010\u001a\u001a\u00020\u001b2\u0017\u0010P\u001a\u0013\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u0002HO0<¢\u0006\u0002\bQH\u0000ø\u0001\u0000¢\u0006\u0004\bR\u0010SR\u001c\u0010\u000b\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u000e0\r0\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0011\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0014\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00150\r0\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0003\u001a\u00060\u0016j\u0002`\u0017X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006V"}, d2 = {"Landroidx/compose/ui/text/AnnotatedString$Builder;", "Ljava/lang/Appendable;", "Lkotlin/text/Appendable;", "text", "", "(Ljava/lang/String;)V", "Landroidx/compose/ui/text/AnnotatedString;", "(Landroidx/compose/ui/text/AnnotatedString;)V", "capacity", "", "(I)V", "annotations", "", "Landroidx/compose/ui/text/AnnotatedString$Builder$MutableRange;", "Landroidx/compose/ui/text/AnnotatedString$Annotation;", "bulletScope", "Landroidx/compose/ui/text/AnnotatedString$Builder$BulletScope;", "length", "getLength", "()I", "styleStack", "", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "addBullet", "", "bullet", "Landroidx/compose/ui/text/Bullet;", "indentation", "Landroidx/compose/ui/unit/TextUnit;", "start", "end", "addBullet-r9BaKPg$ui_text_release", "(Landroidx/compose/ui/text/Bullet;JII)V", "addBullet$ui_text_release", "addLink", "clickable", "Landroidx/compose/ui/text/LinkAnnotation$Clickable;", "url", "Landroidx/compose/ui/text/LinkAnnotation$Url;", "addStringAnnotation", "tag", "annotation", "addStyle", "style", "Landroidx/compose/ui/text/ParagraphStyle;", "Landroidx/compose/ui/text/SpanStyle;", "addTtsAnnotation", "ttsAnnotation", "Landroidx/compose/ui/text/TtsAnnotation;", "addUrlAnnotation", "urlAnnotation", "Landroidx/compose/ui/text/UrlAnnotation;", "append", "char", "", "", "deprecated_append_returning_void", "flatMapAnnotations", "transform", "Lkotlin/Function1;", "Landroidx/compose/ui/text/AnnotatedString$Range;", "", "flatMapAnnotations$ui_text_release", "mapAnnotations", "mapAnnotations$ui_text_release", "pop", "index", "pushBullet", "pushBullet$ui_text_release", "pushLink", "link", "Landroidx/compose/ui/text/LinkAnnotation;", "pushStringAnnotation", "pushStyle", "pushTtsAnnotation", "pushUrlAnnotation", "toAnnotatedString", "withBulletList", "R", "block", "Lkotlin/ExtensionFunctionType;", "withBulletList-o2QH7mI$ui_text_release", "(JLandroidx/compose/ui/text/Bullet;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "BulletScope", "MutableRange", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Builder implements Appendable {
        public static final int $stable = 0;
        private final List<MutableRange<? extends Annotation>> annotations;
        private final BulletScope bulletScope;
        private final List<MutableRange<? extends Object>> styleStack;
        private final StringBuilder text;

        /* JADX INFO: compiled from: AnnotatedString.kt */
        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u000f\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0014\u0010\u0002\u001a\u00020\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R&\u0010\u0007\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t0\bX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Landroidx/compose/ui/text/AnnotatedString$Builder$BulletScope;", "", "builder", "Landroidx/compose/ui/text/AnnotatedString$Builder;", "(Landroidx/compose/ui/text/AnnotatedString$Builder;)V", "getBuilder$ui_text_release", "()Landroidx/compose/ui/text/AnnotatedString$Builder;", "bulletListSettingStack", "", "Lkotlin/Pair;", "Landroidx/compose/ui/unit/TextUnit;", "Landroidx/compose/ui/text/Bullet;", "getBulletListSettingStack$ui_text_release", "()Ljava/util/List;", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class BulletScope {
            public static final int $stable = 0;
            private final Builder builder;
            private final List<Pair<TextUnit, Bullet>> bulletListSettingStack;

            static {
                $stable = 8;
            }

            public BulletScope(Builder builder) {
                this.builder = builder;
                this.bulletListSettingStack = new ArrayList();
            }

            public final Builder getBuilder$ui_text_release() {
                return this.builder;
            }

            public final List<Pair<TextUnit, Bullet>> getBulletListSettingStack$ui_text_release() {
                return this.bulletListSettingStack;
            }
        }

        /* JADX INFO: compiled from: AnnotatedString.kt */
        @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\b\u0018\u0000 %*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0001%B)\u0012\u0006\u0010\u0003\u001a\u00028\u0000\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\u000e\u0010\u0014\u001a\u00028\u0000HÆ\u0003¢\u0006\u0002\u0010\u000fJ\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0017\u001a\u00020\bHÆ\u0003J<\u0010\u0018\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\b\b\u0002\u0010\u0003\u001a\u00028\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001¢\u0006\u0002\u0010\u0019J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0002HÖ\u0003J\t\u0010\u001d\u001a\u00020\u0005HÖ\u0001J0\u0010\u001e\u001a\b\u0012\u0004\u0012\u0002H 0\u001f\"\u0004\b\u0001\u0010 2\u0012\u0010!\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u0002H 0\"2\b\b\u0002\u0010#\u001a\u00020\u0005J\u0016\u0010\u001e\u001a\b\u0012\u0004\u0012\u00028\u00000\u001f2\b\b\u0002\u0010#\u001a\u00020\u0005J\t\u0010$\u001a\u00020\bHÖ\u0001R\u001a\u0010\u0006\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u0013\u0010\u0003\u001a\u00028\u0000¢\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000bR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006&"}, d2 = {"Landroidx/compose/ui/text/AnnotatedString$Builder$MutableRange;", "T", "", "item", "start", "", "end", "tag", "", "(Ljava/lang/Object;IILjava/lang/String;)V", "getEnd", "()I", "setEnd", "(I)V", "getItem", "()Ljava/lang/Object;", "Ljava/lang/Object;", "getStart", "getTag", "()Ljava/lang/String;", "component1", "component2", "component3", "component4", "copy", "(Ljava/lang/Object;IILjava/lang/String;)Landroidx/compose/ui/text/AnnotatedString$Builder$MutableRange;", "equals", "", "other", "hashCode", "toRange", "Landroidx/compose/ui/text/AnnotatedString$Range;", "R", "transform", "Lkotlin/Function1;", "defaultEnd", "toString", "Companion", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        private static final class MutableRange<T> {
            public static final Companion Companion = null;
            private int end;
            private final T item;
            private final int start;
            private final String tag;

            /* JADX INFO: compiled from: AnnotatedString.kt */
            @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J \u0010\u0003\u001a\b\u0012\u0004\u0012\u0002H\u00050\u0004\"\u0004\b\u0001\u0010\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u0002H\u00050\u0007¨\u0006\b"}, d2 = {"Landroidx/compose/ui/text/AnnotatedString$Builder$MutableRange$Companion;", "", "()V", "fromRange", "Landroidx/compose/ui/text/AnnotatedString$Builder$MutableRange;", "T", "range", "Landroidx/compose/ui/text/AnnotatedString$Range;", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
            public static final class Companion {
                public /* synthetic */ Companion(DefaultConstructorMarker r1) {
                    this();
                }

                private Companion() {
                }

                public final <T> MutableRange<T> fromRange(Range<T> r6) {
                    return new MutableRange(r6.getItem(), r6.getStart(), r6.getEnd(), r6.getTag());
                }
            }

            static {
                Companion = new Companion(null);
            }

            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ MutableRange copy$default(MutableRange r0, Object r1, int r2, int r3, String r4, int r5, Object r6) {
                if ((r5 & 1) == 0) goto L6;
                r1 = r0.item;
            L6:
                if ((r5 & 2) == 0) goto L9;
                r2 = r0.start;
            L9:
                if ((r5 & 4) == 0) goto L12;
                r3 = r0.end;
            L12:
                if ((r5 & 8) == 0) goto L15;
                r4 = r0.tag;
            L15:
                return r0.copy(r1, r2, r3, r4);
            }

            public final T component1() {
                return this.item;
            }

            public final int component2() {
                return this.start;
            }

            public final int component3() {
                return this.end;
            }

            public final String component4() {
                return this.tag;
            }

            public final MutableRange<T> copy(T r2, int r3, int r4, String r5) {
                return new MutableRange(r2, r3, r4, r5);
            }

            public boolean equals(Object r6) {
                if (this != r6) goto L6;
                return true;
            L6:
                if ((r6 instanceof MutableRange) == true) goto L8;
                return false;
            L8:
                MutableRange r1 = (MutableRange) r6;
                if (Intrinsics.areEqual(this.item, r1.item) == true) goto L12;
                return false;
            L12:
                if (this.start == r1.start) goto L15;
                return false;
            L15:
                if (this.end == r1.end) goto L18;
                return false;
            L18:
                if (Intrinsics.areEqual(this.tag, r1.tag) == true) goto L20;
                return false;
            L20:
                return true;
            }

            public int hashCode() {
                if (this.item != null) goto L5;
                int r0 = 0;
            L7:
                return (((((r0 * 31) + Integer.hashCode(this.start)) * 31) + Integer.hashCode(this.end)) * 31) + this.tag.hashCode();
            L5:
                r0 = this.item.hashCode();
                goto L7
            }

            public String toString() {
                return "MutableRange(item=" + this.item + ", start=" + this.start + ", end=" + this.end + ", tag=" + this.tag + ')';
            }

            public MutableRange(T r1, int start, int end, String tag) {
                this.item = r1;
                this.start = start;
                this.end = end;
                this.tag = tag;
            }

            public /* synthetic */ MutableRange(Object r1, int r2, int r3, String r4, int r5, DefaultConstructorMarker r6) {
                if ((r5 & 4) == 0) goto L6;
                r3 = Integer.MIN_VALUE;
            L6:
                if ((r5 & 8) == 0) goto L8;
                r4 = "";
            L8:
                this(r1, r2, r3, r4);
            }

            public final T getItem() {
                return this.item;
            }

            public final int getStart() {
                return this.start;
            }

            public final int getEnd() {
                return this.end;
            }

            public final void setEnd(int r1) {
                this.end = r1;
            }

            public final String getTag() {
                return this.tag;
            }

            public static /* synthetic */ Range toRange$default(MutableRange r0, int r1, int r2, Object r3) {
                if ((r2 & 1) == 0) goto L6;
                r1 = Integer.MIN_VALUE;
            L6:
                return r0.toRange(r1);
            }

            public final Range<T> toRange(int defaultEnd) {
                if (this.end != Integer.MIN_VALUE) goto L5;
                int end = defaultEnd;
            L6:
                if (end == Integer.MIN_VALUE) goto L8;
                boolean value$iv = true;
            L10:
                if (value$iv == true) goto L13;
                InlineClassHelperKt.throwIllegalStateException("Item.end should be set first");
            L13:
                return new Range(this.item, this.start, end, this.tag);
            L8:
                value$iv = false;
                goto L10
            L5:
                end = this.end;
                goto L6
            }

            public static /* synthetic */ Range toRange$default(MutableRange r0, Function1 r1, int r2, int r3, Object r4) {
                if ((r3 & 2) == 0) goto L6;
                r2 = Integer.MIN_VALUE;
            L6:
                return r0.toRange(r1, r2);
            }

            public final <R> Range<R> toRange(Function1<? super T, ? extends R> r6, int r7) {
                if (this.end != Integer.MIN_VALUE) goto L5;
                int r0 = r7;
            L6:
                if (r0 == Integer.MIN_VALUE) goto L8;
                boolean r1 = true;
            L10:
                if (r1 == true) goto L13;
                InlineClassHelperKt.throwIllegalStateException("Item.end should be set first");
            L13:
                return new Range(r6.invoke(this.item), this.start, r0, this.tag);
            L8:
                r1 = false;
                goto L10
            L5:
                r0 = this.end;
                goto L6
            }
        }

        static {
            $stable = 8;
        }

        public Builder() {
            int r2 = 0;
            this(r2, 1, null);
        }

        public Builder(int capacity) {
            this.text = new StringBuilder(capacity);
            this.styleStack = new ArrayList();
            this.annotations = new ArrayList();
            this.bulletScope = new BulletScope(this);
        }

        public /* synthetic */ Builder(int r1, int r2, DefaultConstructorMarker r3) {
            if ((r2 & 1) == 0) goto L5;
            r1 = 16;
        L5:
            this(r1);
        }

        @Override // java.lang.Appendable
        public /* bridge */ /* synthetic */ Appendable append(char p0) {
            return append(p0);
        }

        @Override // java.lang.Appendable
        public /* bridge */ /* synthetic */ Appendable append(CharSequence p0) {
            return append(p0);
        }

        @Override // java.lang.Appendable
        public /* bridge */ /* synthetic */ Appendable append(CharSequence p0, int p1, int p2) {
            return append(p0, p1, p2);
        }

        public Builder(String text) {
            int r2 = 0;
            this(r2, 1, null);
            append(text);
        }

        public Builder(AnnotatedString text) {
            int r2 = 0;
            this(r2, 1, null);
            append(text);
        }

        public final int getLength() {
            return this.text.length();
        }

        public final void append(String text) {
            this.text.append(text);
        }

        @Override // java.lang.Appendable
        @Deprecated(level = DeprecationLevel.HIDDEN, message = "Replaced by the append(Char) method that returns an Appendable. This method must be kept around for binary compatibility.")
        public final /* synthetic */ void append(char r1) {
            append(r1);
        }

        @Override // java.lang.Appendable
        public Builder append(CharSequence text) {
            if ((text instanceof AnnotatedString) == false) goto L5;
            append((AnnotatedString) text);
        L6:
            return this;
        L5:
            this.text.append(text);
            goto L6
        }

        @Override // java.lang.Appendable
        public Builder append(CharSequence text, int start, int end) {
            if ((text instanceof AnnotatedString) == false) goto L5;
            append((AnnotatedString) text, start, end);
        L6:
            return this;
        L5:
            this.text.append(text, start, end);
            goto L6
        }

        @Override // java.lang.Appendable
        public Builder append(char r2) {
            this.text.append(r2);
            return this;
        }

        public final void append(AnnotatedString text) {
            int start = this.text.length();
            this.text.append(text.getText());
            List<Range<? extends Annotation>> r1 = text.getAnnotations$ui_text_release();
            if (r1 == null) goto L8;
            int index$iv = 0;
            int r4 = r1.size();
        L5:
            if (index$iv >= r4) goto L10;
            Object item$iv = r1.get(index$iv);
            Range<? extends Annotation> r6 = (Range) item$iv;
            this.annotations.add(new MutableRange(r6.getItem(), r6.getStart() + start, r6.getEnd() + start, r6.getTag()));
            index$iv = index$iv + 1;
            goto L5
        L10:
            return;
        }

        public final void append(AnnotatedString text, int start, int end) {
            int insertionStart = this.text.length();
            this.text.append(text.getText(), start, end);
            List $this$fastForEach$iv = AnnotatedStringKt.getLocalAnnotations$default(text, start, end, null, 4, null);
            if ($this$fastForEach$iv == null) goto L8;
            int index$iv = 0;
            int r4 = $this$fastForEach$iv.size();
        L5:
            if (index$iv >= r4) goto L10;
            Object item$iv = $this$fastForEach$iv.get(index$iv);
            Range it = (Range) item$iv;
            this.annotations.add(new MutableRange(it.getItem(), it.getStart() + insertionStart, it.getEnd() + insertionStart, it.getTag()));
            index$iv = index$iv + 1;
            goto L5
        L10:
            return;
        }

        public final void addStyle(SpanStyle style, int start, int end) {
            String r5 = null;
            this.annotations.add(new MutableRange(style, start, end, r5, 8, null));
        }

        public final void addStyle(ParagraphStyle style, int start, int end) {
            String r5 = null;
            this.annotations.add(new MutableRange(style, start, end, r5, 8, null));
        }

        public final void addStringAnnotation(String tag, String annotation, int start, int end) {
            this.annotations.add(new MutableRange(StringAnnotation.m6365boximpl(StringAnnotation.m6366constructorimpl(annotation)), start, end, tag));
        }

        public final void addTtsAnnotation(TtsAnnotation ttsAnnotation, int start, int end) {
            String r5 = null;
            this.annotations.add(new MutableRange(ttsAnnotation, start, end, r5, 8, null));
        }

        @Deprecated(message = "Use LinkAnnotation API for links instead", replaceWith = @ReplaceWith(expression = "addLink(, start, end)", imports = {}))
        public final void addUrlAnnotation(UrlAnnotation urlAnnotation, int start, int end) {
            String r5 = null;
            this.annotations.add(new MutableRange(urlAnnotation, start, end, r5, 8, null));
        }

        public final void addLink(LinkAnnotation.Url url, int start, int end) {
            String r5 = null;
            this.annotations.add(new MutableRange(url, start, end, r5, 8, null));
        }

        public final void addLink(LinkAnnotation.Clickable clickable, int start, int end) {
            String r5 = null;
            this.annotations.add(new MutableRange(clickable, start, end, r5, 8, null));
        }

        public final void addBullet$ui_text_release(Bullet bullet, int start, int end) {
            String r5 = null;
            this.annotations.add(new MutableRange(bullet, start, end, r5, 8, null));
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX INFO: renamed from: addBullet-r9BaKPg$ui_text_release, reason: not valid java name */
        public final void m6248addBulletr9BaKPg$ui_text_release(Bullet r17, long r18, int r20, int r21) {
            int r2 = 0;
            int r3 = 0;
            long r4 = 0;
            LineHeightStyle r8 = null;
            int r9 = 0;
            int r10 = 0;
            TextMotion r11 = null;
            Object[] r7 = 0 == true ? 1 : 0;
            ParagraphStyle r1 = new ParagraphStyle(r2, r3, r4, new TextIndent(r18, r18, null), r7, r8, r9, r10, r11, 503, null);
            String r6 = null;
            this.annotations.add(new MutableRange(r1, r20, r21, r6, 8, 0 == true ? 1 : 0));
            List<MutableRange<? extends Annotation>> r5 = this.annotations;
            Object[] r13 = 0 == true ? 1 : 0;
            r5.add(new MutableRange(r17, r20, r21, r13, 8, null));
        }

        public final int pushStyle(SpanStyle style) {
            MutableRange<? extends Annotation> r0 = new MutableRange(style, this.text.length(), 0, null, 12, null);
            this.styleStack.add(r0);
            this.annotations.add(r0);
            return this.styleStack.size() - 1;
        }

        public final int pushStyle(ParagraphStyle style) {
            MutableRange<? extends Annotation> r0 = new MutableRange(style, this.text.length(), 0, null, 12, null);
            this.styleStack.add(r0);
            this.annotations.add(r0);
            return this.styleStack.size() - 1;
        }

        public final int pushBullet$ui_text_release(Bullet bullet) {
            MutableRange<? extends Annotation> r0 = new MutableRange(bullet, this.text.length(), 0, null, 12, null);
            this.styleStack.add(r0);
            this.annotations.add(r0);
            return this.styleStack.size() - 1;
        }

        /* JADX INFO: renamed from: withBulletList-o2QH7mI$ui_text_release$default, reason: not valid java name */
        public static /* synthetic */ Object m6247withBulletListo2QH7mI$ui_text_release$default(Builder r0, long r1, Bullet r3, Function1 r4, int r5, Object r6) {
            if ((r5 & 1) == 0) goto L6;
            r1 = BulletKt.getDefaultBulletIndentation();
        L6:
            if ((r5 & 2) == 0) goto L9;
            r3 = BulletKt.getDefaultBullet();
        L9:
            return r0.m6249withBulletListo2QH7mI$ui_text_release(r1, r3, r4);
        }

        /* JADX INFO: renamed from: withBulletList-o2QH7mI$ui_text_release, reason: not valid java name */
        public final <R> R m6249withBulletListo2QH7mI$ui_text_release(long indentation, Bullet bullet, Function1<? super BulletScope, ? extends R> r26) {
            Pair r0 = (Pair) CollectionsKt.lastOrNull(this.bulletScope.getBulletListSettingStack$ui_text_release());
            if (r0 == null) goto L15;
            long it = ((TextUnit) r0.getFirst()).m7176unboximpl();
            boolean value$iv = TextUnitType.m7195equalsimpl0(TextUnit.m7166getTypeUIouoOA(it), TextUnit.m7166getTypeUIouoOA(indentation));
            if (value$iv == true) goto L7;
            InlineClassHelperKt.throwIllegalStateException("Indentation unit types of nested bullet lists must match. Current " + TextUnit.m7174toStringimpl(it) + " and previous is " + TextUnit.m7174toStringimpl(indentation));
        L7:
            long r4 = TextUnit.m7166getTypeUIouoOA(indentation);
            if (TextUnitType.m7195equalsimpl0(r4, TextUnitType.Companion.m7200getSpUIouoOA()) == false) goto L11;
            long r5 = TextUnitKt.getSp(TextUnit.m7167getValueimpl(indentation) + TextUnit.m7167getValueimpl(it));
        L16:
            long adjustedIndentation = r5;
            int parIndex = pushStyle(new ParagraphStyle(0, 0, 0, new TextIndent(adjustedIndentation, adjustedIndentation, null), null, null, 0, 0, null, 503, null));
            this.bulletScope.getBulletListSettingStack$ui_text_release().add(new Pair(TextUnit.m7157boximpl(adjustedIndentation), bullet));
            R r1 = r26.invoke(this.bulletScope);     // Catch: Throwable -> L25
            if (this.bulletScope.getBulletListSettingStack$ui_text_release().isEmpty() == true) goto L23;
            this.bulletScope.getBulletListSettingStack$ui_text_release().remove(CollectionsKt.getLastIndex(this.bulletScope.getBulletListSettingStack$ui_text_release()));
        L23:
            pop(parIndex);
            return r1;
        L25:
            th = th;
        L30:
            if (this.bulletScope.getBulletListSettingStack$ui_text_release().isEmpty() == true) goto L32;
            this.bulletScope.getBulletListSettingStack$ui_text_release().remove(CollectionsKt.getLastIndex(this.bulletScope.getBulletListSettingStack$ui_text_release()));
        L32:
            pop(parIndex);
            throw th;
        L27:
            th = th;
            goto L30
        L11:
            if (TextUnitType.m7195equalsimpl0(r4, TextUnitType.Companion.m7199getEmUIouoOA()) == false) goto L13;
            r5 = TextUnitKt.getEm(TextUnit.m7167getValueimpl(indentation) + TextUnit.m7167getValueimpl(it));
            goto L16
        L13:
            r5 = indentation;
            goto L16
        L15:
            r5 = indentation;
            goto L16
        }

        public final int pushStringAnnotation(String tag, String annotation) {
            MutableRange<? extends Annotation> r0 = new MutableRange(StringAnnotation.m6365boximpl(StringAnnotation.m6366constructorimpl(annotation)), this.text.length(), 0, tag, 4, null);
            this.styleStack.add(r0);
            this.annotations.add(r0);
            return this.styleStack.size() - 1;
        }

        public final int pushTtsAnnotation(TtsAnnotation ttsAnnotation) {
            MutableRange<? extends Annotation> r0 = new MutableRange(ttsAnnotation, this.text.length(), 0, null, 12, null);
            this.styleStack.add(r0);
            this.annotations.add(r0);
            return this.styleStack.size() - 1;
        }

        @Deprecated(message = "Use LinkAnnotation API for links instead", replaceWith = @ReplaceWith(expression = "pushLink(, start, end)", imports = {}))
        public final int pushUrlAnnotation(UrlAnnotation urlAnnotation) {
            MutableRange<? extends Annotation> r0 = new MutableRange(urlAnnotation, this.text.length(), 0, null, 12, null);
            this.styleStack.add(r0);
            this.annotations.add(r0);
            return this.styleStack.size() - 1;
        }

        public final int pushLink(LinkAnnotation link) {
            MutableRange<? extends Annotation> r0 = new MutableRange(link, this.text.length(), 0, null, 12, null);
            this.styleStack.add(r0);
            this.annotations.add(r0);
            return this.styleStack.size() - 1;
        }

        public final void pop() {
            boolean value$iv = !this.styleStack.isEmpty();
            if (value$iv == true) goto L5;
            InlineClassHelperKt.throwIllegalStateException("Nothing to pop.");
        L5:
            this.styleStack.remove(this.styleStack.size() - 1).setEnd(this.text.length());
        }

        public final void pop(int index) {
            if (index >= this.styleStack.size()) goto L5;
            boolean value$iv = true;
        L7:
            if (value$iv == true) goto L11;
            InlineClassHelperKt.throwIllegalStateException(index + " should be less than " + this.styleStack.size());
        L11:
            if ((this.styleStack.size() - 1) < index) goto L13;
            pop();
            goto L11
        L13:
            return;
        L5:
            value$iv = false;
            goto L7
        }

        public final AnnotatedString toAnnotatedString() {
            String r0 = this.text.toString();
            List<MutableRange<? extends Annotation>> r1 = this.annotations;
            List target$iv = new ArrayList(r1.size());
            int index$iv$iv = 0;
            int r7 = r1.size();
        L3:
            if (index$iv$iv >= r7) goto L5;
            Object item$iv$iv = r1.get(index$iv$iv);
            target$iv.add(((MutableRange) item$iv$iv).toRange(this.text.length()));
            index$iv$iv = index$iv$iv + 1;
            goto L3
        L5:
            List $this$fastMap$iv = target$iv;
            return new AnnotatedString(r0, $this$fastMap$iv);
        }

        public final void mapAnnotations$ui_text_release(Function1<? super Range<? extends Annotation>, ? extends Range<? extends Annotation>> r7) {
            int i = 0;
            int r1 = this.annotations.size();
        L3:
            if (i >= r1) goto L5;
            Range<? extends Annotation> r2 = r7.invoke(MutableRange.toRange$default(this.annotations.get(i), 0, 1, null));
            this.annotations.set(i, MutableRange.Companion.fromRange(r2));
            i = i + 1;
            goto L3
        }

        public final void flatMapAnnotations$ui_text_release(Function1<? super Range<? extends Annotation>, ? extends List<? extends Range<? extends Annotation>>> r29) {
            List<MutableRange<? extends Annotation>> r1 = this.annotations;
            int $i$f$fastFlatMap = 0;
            ArrayList target$iv = new ArrayList(r1.size());
            int index$iv$iv = 0;
            int r7 = r1.size();
        L3:
            if (index$iv$iv >= r7) goto L8;
            Object item$iv$iv = r1.get(index$iv$iv);
            List<? extends Range<? extends Annotation>> r13 = r29.invoke(MutableRange.toRange$default((MutableRange) item$iv$iv, 0, 1, null));
            List<MutableRange<? extends Annotation>> r16 = r1;
            int $i$f$fastFlatMap2 = $i$f$fastFlatMap;
            int $i$f$fastFlatMap3 = r13.size();
            Iterable target$iv2 = new ArrayList($i$f$fastFlatMap3);
            List<? extends Range<? extends Annotation>> r2 = r13;
            int r3 = r2.size();
            ArrayList target$iv3 = target$iv;
            int index$iv$iv2 = 0;
        L5:
            if (index$iv$iv2 >= r3) goto L7;
            Object item$iv$iv2 = r2.get(index$iv$iv2);
            int index$iv$iv3 = index$iv$iv2;
            ((Collection) target$iv2).add(MutableRange.Companion.fromRange((Range) item$iv$iv2));
            index$iv$iv2 = index$iv$iv3 + 1;
            r3 = r3;
            r2 = r2;
            goto L5
        L7:
            Iterable list$iv = (List) target$iv2;
            CollectionsKt.addAll(target$iv3, list$iv);
            index$iv$iv = index$iv$iv + 1;
            r1 = r16;
            $i$f$fastFlatMap = $i$f$fastFlatMap2;
            target$iv = target$iv3;
            goto L3
        L8:
            ArrayList replacedAnnotations = target$iv;
            this.annotations.clear();
            this.annotations.addAll(replacedAnnotations);
        }
    }

    /* JADX INFO: compiled from: AnnotatedString.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001b\u0010\u0003\u001a\f\u0012\u0004\u0012\u00020\u0005\u0012\u0002\b\u00030\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Landroidx/compose/ui/text/AnnotatedString$Companion;", "", "()V", "Saver", "Landroidx/compose/runtime/saveable/Saver;", "Landroidx/compose/ui/text/AnnotatedString;", "getSaver", "()Landroidx/compose/runtime/saveable/Saver;", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker r1) {
            this();
        }

        private Companion() {
        }

        public final Saver<AnnotatedString, ?> getSaver() {
            return AnnotatedString.access$getSaver$cp();
        }
    }

    /* JADX INFO: compiled from: AnnotatedString.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Landroidx/compose/ui/text/AnnotatedString$ExhaustiveAnnotation;", "Landroidx/compose/ui/text/AnnotatedString$Annotation;", "()V", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    private static final class ExhaustiveAnnotation implements Annotation {
        public ExhaustiveAnnotation() {
        }
    }

    /* JADX INFO: compiled from: AnnotatedString.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u001f\b\u0016\u0012\u0006\u0010\u0003\u001a\u00028\u0000\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0002\u0010\u0007B%\u0012\u0006\u0010\u0003\u001a\u00028\u0000\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u000e\u0010\u0013\u001a\u00028\u0000HÆ\u0003¢\u0006\u0002\u0010\u000eJ\t\u0010\u0014\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0016\u001a\u00020\tHÆ\u0003J<\u0010\u0017\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\b\b\u0002\u0010\u0003\u001a\u00028\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\tHÆ\u0001¢\u0006\u0002\u0010\u0018J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0002HÖ\u0003J\t\u0010\u001c\u001a\u00020\u0005HÖ\u0001J\t\u0010\u001d\u001a\u00020\tHÖ\u0001R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0003\u001a\u00028\u0000¢\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\fR\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u001e"}, d2 = {"Landroidx/compose/ui/text/AnnotatedString$Range;", "T", "", "item", "start", "", "end", "(Ljava/lang/Object;II)V", "tag", "", "(Ljava/lang/Object;IILjava/lang/String;)V", "getEnd", "()I", "getItem", "()Ljava/lang/Object;", "Ljava/lang/Object;", "getStart", "getTag", "()Ljava/lang/String;", "component1", "component2", "component3", "component4", "copy", "(Ljava/lang/Object;IILjava/lang/String;)Landroidx/compose/ui/text/AnnotatedString$Range;", "equals", "", "other", "hashCode", "toString", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Range<T> {
        public static final int $stable = 0;
        private final int end;
        private final T item;
        private final int start;
        private final String tag;

        static {
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Range copy$default(Range r0, Object r1, int r2, int r3, String r4, int r5, Object r6) {
            if ((r5 & 1) == 0) goto L6;
            r1 = r0.item;
        L6:
            if ((r5 & 2) == 0) goto L9;
            r2 = r0.start;
        L9:
            if ((r5 & 4) == 0) goto L12;
            r3 = r0.end;
        L12:
            if ((r5 & 8) == 0) goto L15;
            r4 = r0.tag;
        L15:
            return r0.copy(r1, r2, r3, r4);
        }

        public final T component1() {
            return this.item;
        }

        public final int component2() {
            return this.start;
        }

        public final int component3() {
            return this.end;
        }

        public final String component4() {
            return this.tag;
        }

        public final Range<T> copy(T r2, int r3, int r4, String r5) {
            return new Range(r2, r3, r4, r5);
        }

        public boolean equals(Object r6) {
            if (this != r6) goto L6;
            return true;
        L6:
            if ((r6 instanceof Range) == true) goto L8;
            return false;
        L8:
            Range r1 = (Range) r6;
            if (Intrinsics.areEqual(this.item, r1.item) == true) goto L12;
            return false;
        L12:
            if (this.start == r1.start) goto L15;
            return false;
        L15:
            if (this.end == r1.end) goto L18;
            return false;
        L18:
            if (Intrinsics.areEqual(this.tag, r1.tag) == true) goto L20;
            return false;
        L20:
            return true;
        }

        public int hashCode() {
            if (this.item != null) goto L5;
            int r0 = 0;
        L7:
            return (((((r0 * 31) + Integer.hashCode(this.start)) * 31) + Integer.hashCode(this.end)) * 31) + this.tag.hashCode();
        L5:
            r0 = this.item.hashCode();
            goto L7
        }

        public String toString() {
            return "Range(item=" + this.item + ", start=" + this.start + ", end=" + this.end + ", tag=" + this.tag + ')';
        }

        public Range(T r4, int start, int end, String tag) {
            this.item = r4;
            this.start = start;
            this.end = end;
            this.tag = tag;
            if (this.start > this.end) goto L5;
            boolean value$iv = true;
        L7:
            if (value$iv == true) goto L11;
            InlineClassHelperKt.throwIllegalArgumentException("Reversed range is not supported");
            return;
        L11:
            return;
        L5:
            value$iv = false;
            goto L7
        }

        public final int getEnd() {
            return this.end;
        }

        public final T getItem() {
            return this.item;
        }

        public final int getStart() {
            return this.start;
        }

        public final String getTag() {
            return this.tag;
        }

        public Range(T r2, int start, int end) {
            this(r2, start, end, "");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AnnotatedString(List<? extends Range<? extends Annotation>> r17, String text) {
        this.annotations = r17;
        this.text = text;
        ArrayList r3 = null;
        ArrayList r4 = null;
        List<Range<? extends Annotation>> r5 = this.annotations;
        if (r5 == null) goto L18;
        int index$iv = 0;
        int r8 = r5.size();
    L5:
        if (index$iv >= r8) goto L18;
        Object item$iv = r5.get(index$iv);
        Range<SpanStyle> r10 = (Range) item$iv;
        if ((r10.getItem() instanceof SpanStyle) == false) goto L12;
        if (r3 != null) goto L10;
        Object spanStyles = new ArrayList();
        r3 = (List) spanStyles;
    L10:
        Intrinsics.checkNotNull(r10, "null cannot be cast to non-null type androidx.compose.ui.text.AnnotatedString.Range<androidx.compose.ui.text.SpanStyle>");
        r3.add(r10);
    L16:
        index$iv = index$iv + 1;
        goto L5
    L12:
        if ((r10.getItem() instanceof ParagraphStyle) == false) goto L16;
        if (r4 != null) goto L15;
        Object paragraphStyles = new ArrayList();
        r4 = (List) paragraphStyles;
    L15:
        Intrinsics.checkNotNull(r10, "null cannot be cast to non-null type androidx.compose.ui.text.AnnotatedString.Range<androidx.compose.ui.text.ParagraphStyle>");
        r4.add(r10);
    L18:
        this.spanStylesOrNull = r3;
        this.paragraphStylesOrNull = r4;
        Iterable r6 = this.paragraphStylesOrNull;
        if (r6 == null) goto L21;
        Iterable $this$sortedBy$iv = r6;
        List sorted = CollectionsKt.sortedWith($this$sortedBy$iv, new AnnotatedString$special$$inlined$sortedBy$1());
    L22:
        List r7 = sorted;
        int r9 = 1;
        if (r7 != null) goto L25;
    L28:
        boolean r11 = true;
    L29:
        if (r11 == true) goto L51;
        MutableIntList previousEnds = IntListKt.mutableIntListOf(((Range) CollectionsKt.first(sorted)).getEnd());
        int i = 1;
        int r12 = sorted.size();
    L31:
        if (i >= r12) goto L61;
        Range current = (Range) sorted.get(i);
    L33:
        MutableIntList this_$iv = previousEnds;
        if (this_$iv._size == 0) goto L36;
        int r13 = r9;
    L37:
        if (r13 == 0) goto L49;
        int previousEnd = previousEnds.last();
        if (current.getStart() < previousEnd) goto L42;
        MutableIntList this_$iv2 = previousEnds;
        previousEnds.removeAt(this_$iv2._size - r9);
        goto L33
    L42:
        if (current.getEnd() > previousEnd) goto L44;
        int r14 = r9;
    L46:
        if (r14 != 0) goto L49;
        InlineClassHelperKt.throwIllegalArgumentException("Paragraph overlap not allowed, end " + current.getEnd() + " should be less than or equal to " + previousEnd);
        goto L49
    L44:
        r14 = 0;
    L49:
        previousEnds.add(current.getEnd());
        i = i + 1;
        r9 = 1;
        goto L31
    L36:
        r13 = 0;
        goto L37
    L61:
        return;
    L51:
        return;
    L25:
        if (r7.isEmpty() == true) goto L28;
        r11 = false;
        goto L29
    L21:
        sorted = null;
        goto L22
    }

    public static final /* synthetic */ Saver access$getSaver$cp() {
        return Saver;
    }

    @Override // java.lang.CharSequence
    public final /* bridge */ char charAt(int index) {
        return get(index);
    }

    @Override // java.lang.CharSequence
    public final /* bridge */ int length() {
        return getLength();
    }

    @Override // java.lang.CharSequence
    public /* bridge */ /* synthetic */ CharSequence subSequence(int startIndex, int endIndex) {
        return subSequence(startIndex, endIndex);
    }

    public final List<Range<? extends Annotation>> getAnnotations$ui_text_release() {
        return this.annotations;
    }

    public final String getText() {
        return this.text;
    }

    public final List<Range<SpanStyle>> getSpanStylesOrNull$ui_text_release() {
        return this.spanStylesOrNull;
    }

    public final List<Range<SpanStyle>> getSpanStyles() {
        List<Range<SpanStyle>> r0 = this.spanStylesOrNull;
        if (r0 == null) goto L5;
        return r0;
    L5:
        return CollectionsKt.emptyList();
    }

    public final List<Range<ParagraphStyle>> getParagraphStylesOrNull$ui_text_release() {
        return this.paragraphStylesOrNull;
    }

    public final List<Range<ParagraphStyle>> getParagraphStyles() {
        List<Range<ParagraphStyle>> r0 = this.paragraphStylesOrNull;
        if (r0 == null) goto L5;
        return r0;
    L5:
        return CollectionsKt.emptyList();
    }

    public /* synthetic */ AnnotatedString(String r1, List r2, List r3, int r4, DefaultConstructorMarker r5) {
        if ((r4 & 2) == 0) goto L6;
        r2 = CollectionsKt.emptyList();
    L6:
        if ((r4 & 4) == 0) goto L8;
        r3 = CollectionsKt.emptyList();
    L8:
        this(r1, r2, r3);
    }

    public AnnotatedString(String text, List<Range<SpanStyle>> r3, List<Range<ParagraphStyle>> r4) {
        this(AnnotatedStringKt.access$constructAnnotationsFromSpansAndParagraphs(r3, r4), text);
    }

    public /* synthetic */ AnnotatedString(String r1, List r2, int r3, DefaultConstructorMarker r4) {
        if ((r3 & 2) == 0) goto L5;
        r2 = CollectionsKt.emptyList();
    L5:
        this(r1, r2);
    }

    public AnnotatedString(String text, List<? extends Range<? extends Annotation>> r4) {
        List<? extends Range<? extends Annotation>> r0 = r4;
        if (r0.isEmpty() == false) goto L5;
        r0 = null;
    L5:
        this(r0, text);
    }

    public int getLength() {
        return this.text.length();
    }

    public char get(int index) {
        return this.text.charAt(index);
    }

    @Override // java.lang.CharSequence
    public AnnotatedString subSequence(int startIndex, int endIndex) {
        if (startIndex > endIndex) goto L4;
        boolean value$iv = true;
    L6:
        if (value$iv == true) goto L9;
        InlineClassHelperKt.throwIllegalArgumentException("start (" + startIndex + ") should be less or equal to end (" + endIndex + ')');
    L9:
        if (startIndex == 0) goto L11;
    L13:
        String text = this.text.substring(startIndex, endIndex);
        Intrinsics.checkNotNullExpressionValue(text, "substring(...)");
        return new AnnotatedString(AnnotatedStringKt.access$filterRanges(this.annotations, startIndex, endIndex), text);
    L11:
        if (endIndex != this.text.length()) goto L13;
        return this;
    L4:
        value$iv = false;
        goto L6
    }

    /* JADX INFO: renamed from: subSequence-5zc-tL8, reason: not valid java name */
    public final AnnotatedString m6246subSequence5zctL8(long range) {
        return subSequence(TextRange.m6415getMinimpl(range), TextRange.m6414getMaximpl(range));
    }

    public final AnnotatedString plus(AnnotatedString other) {
        Builder $this$plus_u24lambda_u245 = new Builder(this);
        $this$plus_u24lambda_u245.append(other);
        return $this$plus_u24lambda_u245.toAnnotatedString();
    }

    public final List<Range<String>> getStringAnnotations(String tag, int start, int end) {
        List<Range<? extends Annotation>> r1 = this.annotations;
        if (r1 == null) goto L21;
        ArrayList target$iv = new ArrayList(r1.size());
        int index$iv$iv = 0;
        int r7 = r1.size();
    L5:
        if (index$iv$iv >= r7) goto L25;
        Object item$iv$iv = r1.get(index$iv$iv);
        Range<? extends Annotation> r11 = (Range) item$iv$iv;
        if ((r11.getItem() instanceof StringAnnotation) == false) goto L14;
        if (Intrinsics.areEqual(tag, r11.getTag()) == false) goto L14;
        List<Range<? extends Annotation>> r16 = r1;
        if (AnnotatedStringKt.intersect(start, end, r11.getStart(), r11.getEnd()) == false) goto L15;
        boolean r13 = true;
    L16:
        if (r13 == false) goto L18;
        target$iv.add(StringAnnotationKt.unbox((Range) item$iv$iv));
    L18:
        index$iv$iv = index$iv$iv + 1;
        r1 = r16;
    L15:
        r13 = false;
    L14:
        r16 = r1;
        goto L15
    L25:
        return target$iv;
    L21:
        return CollectionsKt.emptyList();
    }

    public final boolean hasStringAnnotations(String tag, int start, int end) {
        List<Range<? extends Annotation>> r1 = this.annotations;
        if (r1 == null) goto L22;
        int index$iv$iv = 0;
        int r7 = r1.size();
    L5:
        if (index$iv$iv >= r7) goto L25;
        Object item$iv$iv = r1.get(index$iv$iv);
        Range<? extends Annotation> r11 = (Range) item$iv$iv;
        if ((r11.getItem() instanceof StringAnnotation) == false) goto L15;
        if (Intrinsics.areEqual(tag, r11.getTag()) == false) goto L15;
        if (AnnotatedStringKt.intersect(start, end, r11.getStart(), r11.getEnd()) == false) goto L15;
        boolean r2 = true;
    L16:
        if (r2 == true) goto L17;
        index$iv$iv = index$iv$iv + 1;
        goto L5
    L17:
        return true;
    L15:
        r2 = false;
        goto L16
    L25:
        return false;
    L22:
        return false;
    }

    public final List<Range<String>> getStringAnnotations(int start, int end) {
        List<Range<? extends Annotation>> r1 = this.annotations;
        if (r1 == null) goto L18;
        List target$iv = new ArrayList(r1.size());
        int index$iv$iv = 0;
        int r7 = r1.size();
    L5:
        if (index$iv$iv >= r7) goto L16;
        Object item$iv$iv = r1.get(index$iv$iv);
        Range<? extends Annotation> r11 = (Range) item$iv$iv;
        if ((r11.getItem() instanceof StringAnnotation) == false) goto L12;
        if (AnnotatedStringKt.intersect(start, end, r11.getStart(), r11.getEnd()) == false) goto L12;
        boolean r13 = true;
    L13:
        if (r13 == false) goto L15;
        target$iv.add(StringAnnotationKt.unbox((Range) item$iv$iv));
    L15:
        index$iv$iv = index$iv$iv + 1;
    L12:
        r13 = false;
        goto L13
    L16:
        List $this$fastFilteredMap$iv = target$iv;
        return $this$fastFilteredMap$iv;
    L18:
        return CollectionsKt.emptyList();
    }

    public final List<Range<TtsAnnotation>> getTtsAnnotations(int start, int end) {
        List<Range<? extends Annotation>> r1 = this.annotations;
        if (r1 == null) goto L17;
        ArrayList target$iv = new ArrayList(r1.size());
        int index$iv$iv = 0;
        int r7 = r1.size();
    L5:
        if (index$iv$iv >= r7) goto L16;
        Range<? extends Annotation> r8 = r1.get(index$iv$iv);
        Range<? extends Annotation> r11 = r8;
        if ((r11.getItem() instanceof TtsAnnotation) == false) goto L12;
        if (AnnotatedStringKt.intersect(start, end, r11.getStart(), r11.getEnd()) == false) goto L12;
        boolean r13 = true;
    L13:
        if (r13 == false) goto L15;
        target$iv.add(r8);
    L15:
        index$iv$iv = index$iv$iv + 1;
    L12:
        r13 = false;
        goto L13
    L16:
        ArrayList r2 = target$iv;
    L18:
        Intrinsics.checkNotNull(r2, "null cannot be cast to non-null type kotlin.collections.List<androidx.compose.ui.text.AnnotatedString.Range<androidx.compose.ui.text.TtsAnnotation>>");
        return r2;
    L17:
        r2 = CollectionsKt.emptyList();
        goto L18
    }

    @Deprecated(message = "Use LinkAnnotation API instead", replaceWith = @ReplaceWith(expression = "getLinkAnnotations(start, end)", imports = {}))
    public final List<Range<UrlAnnotation>> getUrlAnnotations(int start, int end) {
        List<Range<? extends Annotation>> r1 = this.annotations;
        if (r1 == null) goto L17;
        ArrayList target$iv = new ArrayList(r1.size());
        int index$iv$iv = 0;
        int r7 = r1.size();
    L5:
        if (index$iv$iv >= r7) goto L16;
        Range<? extends Annotation> r8 = r1.get(index$iv$iv);
        Range<? extends Annotation> r11 = r8;
        if ((r11.getItem() instanceof UrlAnnotation) == false) goto L12;
        if (AnnotatedStringKt.intersect(start, end, r11.getStart(), r11.getEnd()) == false) goto L12;
        boolean r13 = true;
    L13:
        if (r13 == false) goto L15;
        target$iv.add(r8);
    L15:
        index$iv$iv = index$iv$iv + 1;
    L12:
        r13 = false;
        goto L13
    L16:
        ArrayList r2 = target$iv;
    L18:
        Intrinsics.checkNotNull(r2, "null cannot be cast to non-null type kotlin.collections.List<androidx.compose.ui.text.AnnotatedString.Range<androidx.compose.ui.text.UrlAnnotation>>");
        return r2;
    L17:
        r2 = CollectionsKt.emptyList();
        goto L18
    }

    public final List<Range<LinkAnnotation>> getLinkAnnotations(int start, int end) {
        List<Range<? extends Annotation>> r1 = this.annotations;
        if (r1 == null) goto L17;
        ArrayList target$iv = new ArrayList(r1.size());
        int index$iv$iv = 0;
        int r7 = r1.size();
    L5:
        if (index$iv$iv >= r7) goto L16;
        Range<? extends Annotation> r8 = r1.get(index$iv$iv);
        Range<? extends Annotation> r11 = r8;
        if ((r11.getItem() instanceof LinkAnnotation) == false) goto L12;
        if (AnnotatedStringKt.intersect(start, end, r11.getStart(), r11.getEnd()) == false) goto L12;
        boolean r13 = true;
    L13:
        if (r13 == false) goto L15;
        target$iv.add(r8);
    L15:
        index$iv$iv = index$iv$iv + 1;
    L12:
        r13 = false;
        goto L13
    L16:
        ArrayList r2 = target$iv;
    L18:
        Intrinsics.checkNotNull(r2, "null cannot be cast to non-null type kotlin.collections.List<androidx.compose.ui.text.AnnotatedString.Range<androidx.compose.ui.text.LinkAnnotation>>");
        return r2;
    L17:
        r2 = CollectionsKt.emptyList();
        goto L18
    }

    public final boolean hasLinkAnnotations(int start, int end) {
        List<Range<? extends Annotation>> r1 = this.annotations;
        if (r1 == null) goto L19;
        int index$iv$iv = 0;
        int r7 = r1.size();
    L5:
        if (index$iv$iv >= r7) goto L22;
        Object item$iv$iv = r1.get(index$iv$iv);
        Range<? extends Annotation> r11 = (Range) item$iv$iv;
        if ((r11.getItem() instanceof LinkAnnotation) == false) goto L12;
        if (AnnotatedStringKt.intersect(start, end, r11.getStart(), r11.getEnd()) == false) goto L12;
        boolean r12 = true;
    L13:
        if (r12 == true) goto L14;
        index$iv$iv = index$iv$iv + 1;
        goto L5
    L14:
        return true;
    L12:
        r12 = false;
        goto L13
    L22:
        return false;
    L19:
        return false;
    }

    public boolean equals(Object other) {
        if (this != other) goto L6;
        return true;
    L6:
        if ((other instanceof AnnotatedString) == true) goto L9;
        return false;
    L9:
        if (Intrinsics.areEqual(this.text, ((AnnotatedString) other).text) == true) goto L12;
        return false;
    L12:
        if (Intrinsics.areEqual(this.annotations, ((AnnotatedString) other).annotations) == true) goto L14;
        return false;
    L14:
        return true;
    }

    public int hashCode() {
        int result = this.text.hashCode();
        int r1 = result * 31;
        List<Range<? extends Annotation>> r2 = this.annotations;
        if (r2 == null) goto L5;
        int r3 = r2.hashCode();
    L6:
        int result2 = r1 + r3;
        return result2;
    L5:
        r3 = 0;
        goto L6
    }

    @Override // java.lang.CharSequence
    public String toString() {
        return this.text;
    }

    public final boolean hasEqualAnnotations(AnnotatedString other) {
        return Intrinsics.areEqual(this.annotations, other.annotations);
    }

    public final AnnotatedString mapAnnotations(Function1<? super Range<? extends Annotation>, ? extends Range<? extends Annotation>> r3) {
        Builder builder = new Builder(this);
        builder.mapAnnotations$ui_text_release(r3);
        return builder.toAnnotatedString();
    }

    public final AnnotatedString flatMapAnnotations(Function1<? super Range<? extends Annotation>, ? extends List<? extends Range<? extends Annotation>>> r3) {
        Builder builder = new Builder(this);
        builder.flatMapAnnotations$ui_text_release(r3);
        return builder.toAnnotatedString();
    }

    static {
        Companion = new Companion(null);
        Saver = SaversKt.getAnnotatedStringSaver();
    }
}
