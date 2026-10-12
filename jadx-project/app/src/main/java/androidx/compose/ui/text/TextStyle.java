package androidx.compose.ui.text;

import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.intl.LocaleList;
import androidx.compose.ui.text.style.BaselineShift;
import androidx.compose.ui.text.style.Hyphens;
import androidx.compose.ui.text.style.LineBreak;
import androidx.compose.ui.text.style.LineHeightStyle;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextDirection;
import androidx.compose.ui.text.style.TextForegroundStyle;
import androidx.compose.ui.text.style.TextGeometricTransform;
import androidx.compose.ui.text.style.TextIndent;
import androidx.compose.ui.text.style.TextMotion;
import androidx.compose.ui.unit.TextUnit;
import androidx.core.view.ViewCompat;
import androidx.webkit.Profile;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: TextStyle.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000Â\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\bU\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\r\b\u0007\u0018\u0000 £\u00012\u00020\u0001:\u0002£\u0001B\u0017\b\u0010\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006BÕ\u0001\b\u0017\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0014\u0012\b\b\u0002\u0010\u0015\u001a\u00020\n\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0017\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0019\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u001b\u0012\b\b\u0002\u0010\u001c\u001a\u00020\b\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001e\u0012\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010 \u0012\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\"\u0012\n\b\u0002\u0010#\u001a\u0004\u0018\u00010$\u0012\b\b\u0002\u0010%\u001a\u00020\n\u0012\n\b\u0002\u0010&\u001a\u0004\u0018\u00010'¢\u0006\u0002\u0010(Bí\u0001\b\u0017\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0014\u0012\b\b\u0002\u0010\u0015\u001a\u00020\n\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0017\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0019\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u001b\u0012\b\b\u0002\u0010\u001c\u001a\u00020\b\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001e\u0012\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010 \u0012\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\"\u0012\n\b\u0002\u0010#\u001a\u0004\u0018\u00010$\u0012\b\b\u0002\u0010%\u001a\u00020\n\u0012\n\b\u0002\u0010&\u001a\u0004\u0018\u00010'\u0012\n\b\u0002\u0010)\u001a\u0004\u0018\u00010*\u0012\n\b\u0002\u0010+\u001a\u0004\u0018\u00010,¢\u0006\u0002\u0010-B\u0085\u0002\b\u0017\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0014\u0012\b\b\u0002\u0010\u0015\u001a\u00020\n\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0017\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0019\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u001b\u0012\b\b\u0002\u0010\u001c\u001a\u00020\b\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001e\u0012\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010 \u0012\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\"\u0012\n\b\u0002\u0010#\u001a\u0004\u0018\u00010$\u0012\b\b\u0002\u0010%\u001a\u00020\n\u0012\n\b\u0002\u0010&\u001a\u0004\u0018\u00010'\u0012\n\b\u0002\u0010)\u001a\u0004\u0018\u00010*\u0012\n\b\u0002\u0010+\u001a\u0004\u0018\u00010,\u0012\n\b\u0002\u0010.\u001a\u0004\u0018\u00010/\u0012\n\b\u0002\u00100\u001a\u0004\u0018\u000101¢\u0006\u0002\u00102B\u009d\u0002\b\u0017\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0014\u0012\b\b\u0002\u0010\u0015\u001a\u00020\n\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0017\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0019\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u001b\u0012\b\b\u0002\u0010\u001c\u001a\u00020\b\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001e\u0012\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010 \u0012\n\b\u0002\u00103\u001a\u0004\u0018\u000104\u0012\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\"\u0012\n\b\u0002\u0010#\u001a\u0004\u0018\u00010$\u0012\b\b\u0002\u0010%\u001a\u00020\n\u0012\n\b\u0002\u0010&\u001a\u0004\u0018\u00010'\u0012\n\b\u0002\u0010)\u001a\u0004\u0018\u00010*\u0012\n\b\u0002\u0010+\u001a\u0004\u0018\u00010,\u0012\n\b\u0002\u0010.\u001a\u0004\u0018\u00010/\u0012\n\b\u0002\u00100\u001a\u0004\u0018\u000101\u0012\n\b\u0002\u00105\u001a\u0004\u0018\u000106¢\u0006\u0002\u00107B\u0095\u0002\b\u0016\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0014\u0012\b\b\u0002\u0010\u0015\u001a\u00020\n\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0017\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0019\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u001b\u0012\b\b\u0002\u0010\u001c\u001a\u00020\b\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001e\u0012\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010 \u0012\n\b\u0002\u00103\u001a\u0004\u0018\u000104\u0012\b\b\u0002\u0010!\u001a\u00020\"\u0012\b\b\u0002\u0010#\u001a\u00020$\u0012\b\b\u0002\u0010%\u001a\u00020\n\u0012\n\b\u0002\u0010&\u001a\u0004\u0018\u00010'\u0012\n\b\u0002\u0010)\u001a\u0004\u0018\u00010*\u0012\n\b\u0002\u0010+\u001a\u0004\u0018\u00010,\u0012\b\b\u0002\u0010.\u001a\u00020/\u0012\b\b\u0002\u00100\u001a\u000201\u0012\n\b\u0002\u00105\u001a\u0004\u0018\u000106¢\u0006\u0002\u00108B\u009f\u0002\b\u0016\u0012\b\u00109\u001a\u0004\u0018\u00010:\u0012\b\b\u0002\u0010;\u001a\u00020<\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0014\u0012\b\b\u0002\u0010\u0015\u001a\u00020\n\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0017\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0019\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u001b\u0012\b\b\u0002\u0010\u001c\u001a\u00020\b\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001e\u0012\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010 \u0012\n\b\u0002\u00103\u001a\u0004\u0018\u000104\u0012\b\b\u0002\u0010!\u001a\u00020\"\u0012\b\b\u0002\u0010#\u001a\u00020$\u0012\b\b\u0002\u0010%\u001a\u00020\n\u0012\n\b\u0002\u0010&\u001a\u0004\u0018\u00010'\u0012\n\b\u0002\u0010)\u001a\u0004\u0018\u00010*\u0012\n\b\u0002\u0010+\u001a\u0004\u0018\u00010,\u0012\b\b\u0002\u0010.\u001a\u00020/\u0012\b\b\u0002\u00100\u001a\u000201\u0012\n\b\u0002\u00105\u001a\u0004\u0018\u000106¢\u0006\u0002\u0010=B§\u0002\b\u0017\u0012\b\u00109\u001a\u0004\u0018\u00010:\u0012\b\b\u0002\u0010;\u001a\u00020<\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0014\u0012\b\b\u0002\u0010\u0015\u001a\u00020\n\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0017\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0019\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u001b\u0012\b\b\u0002\u0010\u001c\u001a\u00020\b\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001e\u0012\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010 \u0012\n\b\u0002\u00103\u001a\u0004\u0018\u000104\u0012\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\"\u0012\n\b\u0002\u0010#\u001a\u0004\u0018\u00010$\u0012\b\b\u0002\u0010%\u001a\u00020\n\u0012\n\b\u0002\u0010&\u001a\u0004\u0018\u00010'\u0012\n\b\u0002\u0010)\u001a\u0004\u0018\u00010*\u0012\n\b\u0002\u0010+\u001a\u0004\u0018\u00010,\u0012\n\b\u0002\u0010.\u001a\u0004\u0018\u00010/\u0012\n\b\u0002\u00100\u001a\u0004\u0018\u000101\u0012\n\b\u0002\u00105\u001a\u0004\u0018\u000106¢\u0006\u0002\u0010>B#\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010)\u001a\u0004\u0018\u00010*¢\u0006\u0002\u0010?J«\u0002\u0010\u0082\u0001\u001a\u00020\u00002\b\u00109\u001a\u0004\u0018\u00010:2\b\b\u0002\u0010;\u001a\u00020<2\b\b\u0002\u0010\t\u001a\u00020\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00142\b\b\u0002\u0010\u0015\u001a\u00020\n2\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00172\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00192\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u001b2\b\b\u0002\u0010\u001c\u001a\u00020\b2\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001e2\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010 2\n\b\u0002\u00103\u001a\u0004\u0018\u0001042\b\b\u0002\u0010!\u001a\u00020\"2\b\b\u0002\u0010#\u001a\u00020$2\b\b\u0002\u0010%\u001a\u00020\n2\n\b\u0002\u0010&\u001a\u0004\u0018\u00010'2\n\b\u0002\u0010)\u001a\u0004\u0018\u00010*2\n\b\u0002\u0010+\u001a\u0004\u0018\u00010,2\b\b\u0002\u0010.\u001a\u00020/2\b\b\u0002\u00100\u001a\u0002012\n\b\u0002\u00105\u001a\u0004\u0018\u000106ø\u0001\u0000¢\u0006\u0006\b\u0083\u0001\u0010\u0084\u0001Jµ\u0002\u0010\u0082\u0001\u001a\u00020\u00002\b\u00109\u001a\u0004\u0018\u00010:2\b\b\u0002\u0010;\u001a\u00020<2\b\b\u0002\u0010\t\u001a\u00020\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00142\b\b\u0002\u0010\u0015\u001a\u00020\n2\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00172\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00192\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u001b2\b\b\u0002\u0010\u001c\u001a\u00020\b2\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001e2\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010 2\n\b\u0002\u00103\u001a\u0004\u0018\u0001042\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\"2\n\b\u0002\u0010#\u001a\u0004\u0018\u00010$2\b\b\u0002\u0010%\u001a\u00020\n2\n\b\u0002\u0010&\u001a\u0004\u0018\u00010'2\n\b\u0002\u0010)\u001a\u0004\u0018\u00010*2\n\b\u0002\u0010+\u001a\u0004\u0018\u00010,2\n\b\u0002\u0010.\u001a\u0004\u0018\u00010/2\n\b\u0002\u00100\u001a\u0004\u0018\u0001012\n\b\u0002\u00105\u001a\u0004\u0018\u000106H\u0007ø\u0001\u0000¢\u0006\u0006\b\u0085\u0001\u0010\u0086\u0001J¡\u0002\u0010\u0082\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00142\b\b\u0002\u0010\u0015\u001a\u00020\n2\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00172\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00192\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u001b2\b\b\u0002\u0010\u001c\u001a\u00020\b2\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001e2\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010 2\n\b\u0002\u00103\u001a\u0004\u0018\u0001042\b\b\u0002\u0010!\u001a\u00020\"2\b\b\u0002\u0010#\u001a\u00020$2\b\b\u0002\u0010%\u001a\u00020\n2\n\b\u0002\u0010&\u001a\u0004\u0018\u00010'2\n\b\u0002\u0010)\u001a\u0004\u0018\u00010*2\n\b\u0002\u0010+\u001a\u0004\u0018\u00010,2\b\b\u0002\u0010.\u001a\u00020/2\b\b\u0002\u00100\u001a\u0002012\n\b\u0002\u00105\u001a\u0004\u0018\u000106ø\u0001\u0000¢\u0006\u0006\b\u0087\u0001\u0010\u0088\u0001J«\u0002\u0010\u0082\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00142\b\b\u0002\u0010\u0015\u001a\u00020\n2\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00172\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00192\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u001b2\b\b\u0002\u0010\u001c\u001a\u00020\b2\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001e2\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010 2\n\b\u0002\u00103\u001a\u0004\u0018\u0001042\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\"2\n\b\u0002\u0010#\u001a\u0004\u0018\u00010$2\b\b\u0002\u0010%\u001a\u00020\n2\n\b\u0002\u0010&\u001a\u0004\u0018\u00010'2\n\b\u0002\u0010)\u001a\u0004\u0018\u00010*2\n\b\u0002\u0010+\u001a\u0004\u0018\u00010,2\n\b\u0002\u0010.\u001a\u0004\u0018\u00010/2\n\b\u0002\u00100\u001a\u0004\u0018\u0001012\n\b\u0002\u00105\u001a\u0004\u0018\u000106H\u0007ø\u0001\u0000¢\u0006\u0006\b\u0089\u0001\u0010\u008a\u0001Jã\u0001\u0010\u0082\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00142\b\b\u0002\u0010\u0015\u001a\u00020\n2\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00172\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00192\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u001b2\b\b\u0002\u0010\u001c\u001a\u00020\b2\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001e2\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010 2\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\"2\n\b\u0002\u0010#\u001a\u0004\u0018\u00010$2\b\b\u0002\u0010%\u001a\u00020\n2\n\b\u0002\u0010&\u001a\u0004\u0018\u00010'H\u0007ø\u0001\u0000¢\u0006\u0006\b\u008b\u0001\u0010\u008c\u0001Jû\u0001\u0010\u0082\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00142\b\b\u0002\u0010\u0015\u001a\u00020\n2\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00172\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00192\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u001b2\b\b\u0002\u0010\u001c\u001a\u00020\b2\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001e2\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010 2\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\"2\n\b\u0002\u0010#\u001a\u0004\u0018\u00010$2\b\b\u0002\u0010%\u001a\u00020\n2\n\b\u0002\u0010&\u001a\u0004\u0018\u00010'2\n\b\u0002\u0010)\u001a\u0004\u0018\u00010*2\n\b\u0002\u0010+\u001a\u0004\u0018\u00010,H\u0007ø\u0001\u0000¢\u0006\u0006\b\u008d\u0001\u0010\u008e\u0001J\u0093\u0002\u0010\u0082\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00142\b\b\u0002\u0010\u0015\u001a\u00020\n2\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00172\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00192\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u001b2\b\b\u0002\u0010\u001c\u001a\u00020\b2\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001e2\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010 2\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\"2\n\b\u0002\u0010#\u001a\u0004\u0018\u00010$2\b\b\u0002\u0010%\u001a\u00020\n2\n\b\u0002\u0010&\u001a\u0004\u0018\u00010'2\n\b\u0002\u0010)\u001a\u0004\u0018\u00010*2\n\b\u0002\u0010+\u001a\u0004\u0018\u00010,2\n\b\u0002\u0010.\u001a\u0004\u0018\u00010/2\n\b\u0002\u00100\u001a\u0004\u0018\u000101H\u0007ø\u0001\u0000¢\u0006\u0006\b\u008f\u0001\u0010\u0090\u0001J\u0016\u0010\u0091\u0001\u001a\u00030\u0092\u00012\t\u0010\u0093\u0001\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\u0011\u0010\u0094\u0001\u001a\u00030\u0092\u00012\u0007\u0010\u0093\u0001\u001a\u00020\u0000J\u0011\u0010\u0095\u0001\u001a\u00030\u0092\u00012\u0007\u0010\u0093\u0001\u001a\u00020\u0000J\n\u0010\u0096\u0001\u001a\u00030\u0097\u0001H\u0016J\u0010\u0010\u0098\u0001\u001a\u00030\u0097\u0001H\u0000¢\u0006\u0003\b\u0099\u0001J£\u0002\u0010\u009a\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00142\b\b\u0002\u0010\u0015\u001a\u00020\n2\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00172\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00192\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u001b2\b\b\u0002\u0010\u001c\u001a\u00020\b2\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001e2\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010 2\n\b\u0002\u00103\u001a\u0004\u0018\u0001042\b\b\u0002\u0010!\u001a\u00020\"2\b\b\u0002\u0010#\u001a\u00020$2\b\b\u0002\u0010%\u001a\u00020\n2\n\b\u0002\u0010&\u001a\u0004\u0018\u00010'2\n\b\u0002\u0010+\u001a\u0004\u0018\u00010,2\b\b\u0002\u0010.\u001a\u00020/2\b\b\u0002\u00100\u001a\u0002012\n\b\u0002\u0010)\u001a\u0004\u0018\u00010*2\n\b\u0002\u00105\u001a\u0004\u0018\u000106H\u0007ø\u0001\u0000¢\u0006\u0006\b\u009b\u0001\u0010\u009c\u0001J«\u0002\u0010\u009a\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00142\b\b\u0002\u0010\u0015\u001a\u00020\n2\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00172\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00192\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u001b2\b\b\u0002\u0010\u001c\u001a\u00020\b2\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001e2\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010 2\n\b\u0002\u00103\u001a\u0004\u0018\u0001042\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\"2\n\b\u0002\u0010#\u001a\u0004\u0018\u00010$2\b\b\u0002\u0010%\u001a\u00020\n2\n\b\u0002\u0010&\u001a\u0004\u0018\u00010'2\n\b\u0002\u0010+\u001a\u0004\u0018\u00010,2\n\b\u0002\u0010.\u001a\u0004\u0018\u00010/2\n\b\u0002\u00100\u001a\u0004\u0018\u0001012\n\b\u0002\u0010)\u001a\u0004\u0018\u00010*2\n\b\u0002\u00105\u001a\u0004\u0018\u000106H\u0007ø\u0001\u0000¢\u0006\u0006\b\u009d\u0001\u0010\u009e\u0001J\u0012\u0010\u009a\u0001\u001a\u00020\u00002\u0007\u0010\u0093\u0001\u001a\u00020\u0005H\u0007J\u0012\u0010\u009a\u0001\u001a\u00020\u00002\u0007\u0010\u0093\u0001\u001a\u00020\u0003H\u0007J\u0016\u0010\u009a\u0001\u001a\u00020\u00002\u000b\b\u0002\u0010\u0093\u0001\u001a\u0004\u0018\u00010\u0000H\u0007J\u0013\u0010\u009f\u0001\u001a\u00020\u00002\u0007\u0010\u0093\u0001\u001a\u00020\u0005H\u0087\u0002J\u0013\u0010\u009f\u0001\u001a\u00020\u00002\u0007\u0010\u0093\u0001\u001a\u00020\u0003H\u0087\u0002J\u0013\u0010\u009f\u0001\u001a\u00020\u00002\u0007\u0010\u0093\u0001\u001a\u00020\u0000H\u0087\u0002J\t\u0010 \u0001\u001a\u00020\u0005H\u0007J\t\u0010¡\u0001\u001a\u00020\u0003H\u0007J\t\u0010¢\u0001\u001a\u00020\u0014H\u0016R\u0011\u0010;\u001a\u00020<8F¢\u0006\u0006\u001a\u0004\b@\u0010AR\u0017\u0010\u001c\u001a\u00020\b8Fø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\bB\u0010CR\u0019\u0010\u0016\u001a\u0004\u0018\u00010\u00178Fø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\bD\u0010ER\u0013\u00109\u001a\u0004\u0018\u00010:8F¢\u0006\u0006\u001a\u0004\bF\u0010GR\u0017\u0010\u0007\u001a\u00020\b8Fø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\bH\u0010CR\"\u0010I\u001a\u0004\u0018\u0001018GX\u0087\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\f\u0012\u0004\bJ\u0010K\u001a\u0004\bL\u0010MR\"\u0010N\u001a\u0004\u0018\u00010/8GX\u0087\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\f\u0012\u0004\bO\u0010K\u001a\u0004\bP\u0010QR\"\u0010R\u001a\u0004\u0018\u00010\"8GX\u0087\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\f\u0012\u0004\bS\u0010K\u001a\u0004\bT\u0010UR\"\u0010V\u001a\u0004\u0018\u00010$8GX\u0087\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\f\u0012\u0004\bW\u0010K\u001a\u0004\bX\u0010YR\u0013\u00103\u001a\u0004\u0018\u0001048F¢\u0006\u0006\u001a\u0004\bZ\u0010[R\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u00128F¢\u0006\u0006\u001a\u0004\b\\\u0010]R\u0013\u0010\u0013\u001a\u0004\u0018\u00010\u00148F¢\u0006\u0006\u001a\u0004\b^\u0010_R\u0017\u0010\t\u001a\u00020\n8Fø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b`\u0010CR\u0019\u0010\r\u001a\u0004\u0018\u00010\u000e8Fø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\ba\u0010bR\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u00108Fø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\bc\u0010dR\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f8F¢\u0006\u0006\u001a\u0004\be\u0010fR\u0017\u00100\u001a\u0002018Fø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\bg\u0010hR\u0017\u0010\u0015\u001a\u00020\n8Fø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\bi\u0010CR\u0017\u0010.\u001a\u00020/8Fø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\bj\u0010hR\u0017\u0010%\u001a\u00020\n8Fø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\bk\u0010CR\u0013\u0010+\u001a\u0004\u0018\u00010,8F¢\u0006\u0006\u001a\u0004\bl\u0010mR\u0013\u0010\u001a\u001a\u0004\u0018\u00010\u001b8F¢\u0006\u0006\u001a\u0004\bn\u0010oR\u0014\u0010\u0004\u001a\u00020\u0005X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\bp\u0010qR\u0013\u0010)\u001a\u0004\u0018\u00010*¢\u0006\b\n\u0000\u001a\u0004\br\u0010sR\u0013\u0010\u001f\u001a\u0004\u0018\u00010 8F¢\u0006\u0006\u001a\u0004\bt\u0010uR\u0014\u0010\u0002\u001a\u00020\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\bv\u0010wR\u0017\u0010!\u001a\u00020\"8Fø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\bx\u0010hR\u0013\u0010\u001d\u001a\u0004\u0018\u00010\u001e8F¢\u0006\u0006\u001a\u0004\by\u0010zR\u0017\u0010#\u001a\u00020$8Fø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b{\u0010hR\u0013\u0010\u0018\u001a\u0004\u0018\u00010\u00198F¢\u0006\u0006\u001a\u0004\b|\u0010}R\u0013\u0010&\u001a\u0004\u0018\u00010'8F¢\u0006\u0006\u001a\u0004\b~\u0010\u007fR\u0015\u00105\u001a\u0004\u0018\u0001068F¢\u0006\b\u001a\u0006\b\u0080\u0001\u0010\u0081\u0001\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006¤\u0001"}, d2 = {"Landroidx/compose/ui/text/TextStyle;", "", "spanStyle", "Landroidx/compose/ui/text/SpanStyle;", "paragraphStyle", "Landroidx/compose/ui/text/ParagraphStyle;", "(Landroidx/compose/ui/text/SpanStyle;Landroidx/compose/ui/text/ParagraphStyle;)V", "color", "Landroidx/compose/ui/graphics/Color;", "fontSize", "Landroidx/compose/ui/unit/TextUnit;", "fontWeight", "Landroidx/compose/ui/text/font/FontWeight;", "fontStyle", "Landroidx/compose/ui/text/font/FontStyle;", "fontSynthesis", "Landroidx/compose/ui/text/font/FontSynthesis;", "fontFamily", "Landroidx/compose/ui/text/font/FontFamily;", "fontFeatureSettings", "", "letterSpacing", "baselineShift", "Landroidx/compose/ui/text/style/BaselineShift;", "textGeometricTransform", "Landroidx/compose/ui/text/style/TextGeometricTransform;", "localeList", "Landroidx/compose/ui/text/intl/LocaleList;", "background", "textDecoration", "Landroidx/compose/ui/text/style/TextDecoration;", "shadow", "Landroidx/compose/ui/graphics/Shadow;", "textAlign", "Landroidx/compose/ui/text/style/TextAlign;", "textDirection", "Landroidx/compose/ui/text/style/TextDirection;", "lineHeight", "textIndent", "Landroidx/compose/ui/text/style/TextIndent;", "(JJLandroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontSynthesis;Landroidx/compose/ui/text/font/FontFamily;Ljava/lang/String;JLandroidx/compose/ui/text/style/BaselineShift;Landroidx/compose/ui/text/style/TextGeometricTransform;Landroidx/compose/ui/text/intl/LocaleList;JLandroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/graphics/Shadow;Landroidx/compose/ui/text/style/TextAlign;Landroidx/compose/ui/text/style/TextDirection;JLandroidx/compose/ui/text/style/TextIndent;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "platformStyle", "Landroidx/compose/ui/text/PlatformTextStyle;", "lineHeightStyle", "Landroidx/compose/ui/text/style/LineHeightStyle;", "(JJLandroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontSynthesis;Landroidx/compose/ui/text/font/FontFamily;Ljava/lang/String;JLandroidx/compose/ui/text/style/BaselineShift;Landroidx/compose/ui/text/style/TextGeometricTransform;Landroidx/compose/ui/text/intl/LocaleList;JLandroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/graphics/Shadow;Landroidx/compose/ui/text/style/TextAlign;Landroidx/compose/ui/text/style/TextDirection;JLandroidx/compose/ui/text/style/TextIndent;Landroidx/compose/ui/text/PlatformTextStyle;Landroidx/compose/ui/text/style/LineHeightStyle;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "lineBreak", "Landroidx/compose/ui/text/style/LineBreak;", "hyphens", "Landroidx/compose/ui/text/style/Hyphens;", "(JJLandroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontSynthesis;Landroidx/compose/ui/text/font/FontFamily;Ljava/lang/String;JLandroidx/compose/ui/text/style/BaselineShift;Landroidx/compose/ui/text/style/TextGeometricTransform;Landroidx/compose/ui/text/intl/LocaleList;JLandroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/graphics/Shadow;Landroidx/compose/ui/text/style/TextAlign;Landroidx/compose/ui/text/style/TextDirection;JLandroidx/compose/ui/text/style/TextIndent;Landroidx/compose/ui/text/PlatformTextStyle;Landroidx/compose/ui/text/style/LineHeightStyle;Landroidx/compose/ui/text/style/LineBreak;Landroidx/compose/ui/text/style/Hyphens;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "drawStyle", "Landroidx/compose/ui/graphics/drawscope/DrawStyle;", "textMotion", "Landroidx/compose/ui/text/style/TextMotion;", "(JJLandroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontSynthesis;Landroidx/compose/ui/text/font/FontFamily;Ljava/lang/String;JLandroidx/compose/ui/text/style/BaselineShift;Landroidx/compose/ui/text/style/TextGeometricTransform;Landroidx/compose/ui/text/intl/LocaleList;JLandroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/graphics/Shadow;Landroidx/compose/ui/graphics/drawscope/DrawStyle;Landroidx/compose/ui/text/style/TextAlign;Landroidx/compose/ui/text/style/TextDirection;JLandroidx/compose/ui/text/style/TextIndent;Landroidx/compose/ui/text/PlatformTextStyle;Landroidx/compose/ui/text/style/LineHeightStyle;Landroidx/compose/ui/text/style/LineBreak;Landroidx/compose/ui/text/style/Hyphens;Landroidx/compose/ui/text/style/TextMotion;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "(JJLandroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontSynthesis;Landroidx/compose/ui/text/font/FontFamily;Ljava/lang/String;JLandroidx/compose/ui/text/style/BaselineShift;Landroidx/compose/ui/text/style/TextGeometricTransform;Landroidx/compose/ui/text/intl/LocaleList;JLandroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/graphics/Shadow;Landroidx/compose/ui/graphics/drawscope/DrawStyle;IIJLandroidx/compose/ui/text/style/TextIndent;Landroidx/compose/ui/text/PlatformTextStyle;Landroidx/compose/ui/text/style/LineHeightStyle;IILandroidx/compose/ui/text/style/TextMotion;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "brush", "Landroidx/compose/ui/graphics/Brush;", "alpha", "", "(Landroidx/compose/ui/graphics/Brush;FJLandroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontSynthesis;Landroidx/compose/ui/text/font/FontFamily;Ljava/lang/String;JLandroidx/compose/ui/text/style/BaselineShift;Landroidx/compose/ui/text/style/TextGeometricTransform;Landroidx/compose/ui/text/intl/LocaleList;JLandroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/graphics/Shadow;Landroidx/compose/ui/graphics/drawscope/DrawStyle;IIJLandroidx/compose/ui/text/style/TextIndent;Landroidx/compose/ui/text/PlatformTextStyle;Landroidx/compose/ui/text/style/LineHeightStyle;IILandroidx/compose/ui/text/style/TextMotion;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "(Landroidx/compose/ui/graphics/Brush;FJLandroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontSynthesis;Landroidx/compose/ui/text/font/FontFamily;Ljava/lang/String;JLandroidx/compose/ui/text/style/BaselineShift;Landroidx/compose/ui/text/style/TextGeometricTransform;Landroidx/compose/ui/text/intl/LocaleList;JLandroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/graphics/Shadow;Landroidx/compose/ui/graphics/drawscope/DrawStyle;Landroidx/compose/ui/text/style/TextAlign;Landroidx/compose/ui/text/style/TextDirection;JLandroidx/compose/ui/text/style/TextIndent;Landroidx/compose/ui/text/PlatformTextStyle;Landroidx/compose/ui/text/style/LineHeightStyle;Landroidx/compose/ui/text/style/LineBreak;Landroidx/compose/ui/text/style/Hyphens;Landroidx/compose/ui/text/style/TextMotion;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "(Landroidx/compose/ui/text/SpanStyle;Landroidx/compose/ui/text/ParagraphStyle;Landroidx/compose/ui/text/PlatformTextStyle;)V", "getAlpha", "()F", "getBackground-0d7_KjU", "()J", "getBaselineShift-5SSeXJ0", "()Landroidx/compose/ui/text/style/BaselineShift;", "getBrush", "()Landroidx/compose/ui/graphics/Brush;", "getColor-0d7_KjU", "deprecated_boxing_hyphens", "getHyphens-EaSxIns$annotations", "()V", "getHyphens-EaSxIns", "()Landroidx/compose/ui/text/style/Hyphens;", "deprecated_boxing_lineBreak", "getLineBreak-LgCVezo$annotations", "getLineBreak-LgCVezo", "()Landroidx/compose/ui/text/style/LineBreak;", "deprecated_boxing_textAlign", "getTextAlign-buA522U$annotations", "getTextAlign-buA522U", "()Landroidx/compose/ui/text/style/TextAlign;", "deprecated_boxing_textDirection", "getTextDirection-mmuk1to$annotations", "getTextDirection-mmuk1to", "()Landroidx/compose/ui/text/style/TextDirection;", "getDrawStyle", "()Landroidx/compose/ui/graphics/drawscope/DrawStyle;", "getFontFamily", "()Landroidx/compose/ui/text/font/FontFamily;", "getFontFeatureSettings", "()Ljava/lang/String;", "getFontSize-XSAIIZE", "getFontStyle-4Lr2A7w", "()Landroidx/compose/ui/text/font/FontStyle;", "getFontSynthesis-ZQGJjVo", "()Landroidx/compose/ui/text/font/FontSynthesis;", "getFontWeight", "()Landroidx/compose/ui/text/font/FontWeight;", "getHyphens-vmbZdU8", "()I", "getLetterSpacing-XSAIIZE", "getLineBreak-rAG3T2k", "getLineHeight-XSAIIZE", "getLineHeightStyle", "()Landroidx/compose/ui/text/style/LineHeightStyle;", "getLocaleList", "()Landroidx/compose/ui/text/intl/LocaleList;", "getParagraphStyle$ui_text_release", "()Landroidx/compose/ui/text/ParagraphStyle;", "getPlatformStyle", "()Landroidx/compose/ui/text/PlatformTextStyle;", "getShadow", "()Landroidx/compose/ui/graphics/Shadow;", "getSpanStyle$ui_text_release", "()Landroidx/compose/ui/text/SpanStyle;", "getTextAlign-e0LSkKk", "getTextDecoration", "()Landroidx/compose/ui/text/style/TextDecoration;", "getTextDirection-s_7X-co", "getTextGeometricTransform", "()Landroidx/compose/ui/text/style/TextGeometricTransform;", "getTextIndent", "()Landroidx/compose/ui/text/style/TextIndent;", "getTextMotion", "()Landroidx/compose/ui/text/style/TextMotion;", "copy", "copy-Ns73l9s", "(Landroidx/compose/ui/graphics/Brush;FJLandroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontSynthesis;Landroidx/compose/ui/text/font/FontFamily;Ljava/lang/String;JLandroidx/compose/ui/text/style/BaselineShift;Landroidx/compose/ui/text/style/TextGeometricTransform;Landroidx/compose/ui/text/intl/LocaleList;JLandroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/graphics/Shadow;Landroidx/compose/ui/graphics/drawscope/DrawStyle;IIJLandroidx/compose/ui/text/style/TextIndent;Landroidx/compose/ui/text/PlatformTextStyle;Landroidx/compose/ui/text/style/LineHeightStyle;IILandroidx/compose/ui/text/style/TextMotion;)Landroidx/compose/ui/text/TextStyle;", "copy-aIRg9q4", "(Landroidx/compose/ui/graphics/Brush;FJLandroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontSynthesis;Landroidx/compose/ui/text/font/FontFamily;Ljava/lang/String;JLandroidx/compose/ui/text/style/BaselineShift;Landroidx/compose/ui/text/style/TextGeometricTransform;Landroidx/compose/ui/text/intl/LocaleList;JLandroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/graphics/Shadow;Landroidx/compose/ui/graphics/drawscope/DrawStyle;Landroidx/compose/ui/text/style/TextAlign;Landroidx/compose/ui/text/style/TextDirection;JLandroidx/compose/ui/text/style/TextIndent;Landroidx/compose/ui/text/PlatformTextStyle;Landroidx/compose/ui/text/style/LineHeightStyle;Landroidx/compose/ui/text/style/LineBreak;Landroidx/compose/ui/text/style/Hyphens;Landroidx/compose/ui/text/style/TextMotion;)Landroidx/compose/ui/text/TextStyle;", "copy-p1EtxEg", "(JJLandroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontSynthesis;Landroidx/compose/ui/text/font/FontFamily;Ljava/lang/String;JLandroidx/compose/ui/text/style/BaselineShift;Landroidx/compose/ui/text/style/TextGeometricTransform;Landroidx/compose/ui/text/intl/LocaleList;JLandroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/graphics/Shadow;Landroidx/compose/ui/graphics/drawscope/DrawStyle;IIJLandroidx/compose/ui/text/style/TextIndent;Landroidx/compose/ui/text/PlatformTextStyle;Landroidx/compose/ui/text/style/LineHeightStyle;IILandroidx/compose/ui/text/style/TextMotion;)Landroidx/compose/ui/text/TextStyle;", "copy-v2rsoow", "(JJLandroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontSynthesis;Landroidx/compose/ui/text/font/FontFamily;Ljava/lang/String;JLandroidx/compose/ui/text/style/BaselineShift;Landroidx/compose/ui/text/style/TextGeometricTransform;Landroidx/compose/ui/text/intl/LocaleList;JLandroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/graphics/Shadow;Landroidx/compose/ui/graphics/drawscope/DrawStyle;Landroidx/compose/ui/text/style/TextAlign;Landroidx/compose/ui/text/style/TextDirection;JLandroidx/compose/ui/text/style/TextIndent;Landroidx/compose/ui/text/PlatformTextStyle;Landroidx/compose/ui/text/style/LineHeightStyle;Landroidx/compose/ui/text/style/LineBreak;Landroidx/compose/ui/text/style/Hyphens;Landroidx/compose/ui/text/style/TextMotion;)Landroidx/compose/ui/text/TextStyle;", "copy-HL5avdY", "(JJLandroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontSynthesis;Landroidx/compose/ui/text/font/FontFamily;Ljava/lang/String;JLandroidx/compose/ui/text/style/BaselineShift;Landroidx/compose/ui/text/style/TextGeometricTransform;Landroidx/compose/ui/text/intl/LocaleList;JLandroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/graphics/Shadow;Landroidx/compose/ui/text/style/TextAlign;Landroidx/compose/ui/text/style/TextDirection;JLandroidx/compose/ui/text/style/TextIndent;)Landroidx/compose/ui/text/TextStyle;", "copy-NOaFTUo", "(JJLandroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontSynthesis;Landroidx/compose/ui/text/font/FontFamily;Ljava/lang/String;JLandroidx/compose/ui/text/style/BaselineShift;Landroidx/compose/ui/text/style/TextGeometricTransform;Landroidx/compose/ui/text/intl/LocaleList;JLandroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/graphics/Shadow;Landroidx/compose/ui/text/style/TextAlign;Landroidx/compose/ui/text/style/TextDirection;JLandroidx/compose/ui/text/style/TextIndent;Landroidx/compose/ui/text/PlatformTextStyle;Landroidx/compose/ui/text/style/LineHeightStyle;)Landroidx/compose/ui/text/TextStyle;", "copy-CXVQc50", "(JJLandroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontSynthesis;Landroidx/compose/ui/text/font/FontFamily;Ljava/lang/String;JLandroidx/compose/ui/text/style/BaselineShift;Landroidx/compose/ui/text/style/TextGeometricTransform;Landroidx/compose/ui/text/intl/LocaleList;JLandroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/graphics/Shadow;Landroidx/compose/ui/text/style/TextAlign;Landroidx/compose/ui/text/style/TextDirection;JLandroidx/compose/ui/text/style/TextIndent;Landroidx/compose/ui/text/PlatformTextStyle;Landroidx/compose/ui/text/style/LineHeightStyle;Landroidx/compose/ui/text/style/LineBreak;Landroidx/compose/ui/text/style/Hyphens;)Landroidx/compose/ui/text/TextStyle;", "equals", "", "other", "hasSameDrawAffectingAttributes", "hasSameLayoutAffectingAttributes", "hashCode", "", "hashCodeLayoutAffectingAttributes", "hashCodeLayoutAffectingAttributes$ui_text_release", "merge", "merge-dA7vx0o", "(JJLandroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontSynthesis;Landroidx/compose/ui/text/font/FontFamily;Ljava/lang/String;JLandroidx/compose/ui/text/style/BaselineShift;Landroidx/compose/ui/text/style/TextGeometricTransform;Landroidx/compose/ui/text/intl/LocaleList;JLandroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/graphics/Shadow;Landroidx/compose/ui/graphics/drawscope/DrawStyle;IIJLandroidx/compose/ui/text/style/TextIndent;Landroidx/compose/ui/text/style/LineHeightStyle;IILandroidx/compose/ui/text/PlatformTextStyle;Landroidx/compose/ui/text/style/TextMotion;)Landroidx/compose/ui/text/TextStyle;", "merge-Z1GrekI", "(JJLandroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontSynthesis;Landroidx/compose/ui/text/font/FontFamily;Ljava/lang/String;JLandroidx/compose/ui/text/style/BaselineShift;Landroidx/compose/ui/text/style/TextGeometricTransform;Landroidx/compose/ui/text/intl/LocaleList;JLandroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/graphics/Shadow;Landroidx/compose/ui/graphics/drawscope/DrawStyle;Landroidx/compose/ui/text/style/TextAlign;Landroidx/compose/ui/text/style/TextDirection;JLandroidx/compose/ui/text/style/TextIndent;Landroidx/compose/ui/text/style/LineHeightStyle;Landroidx/compose/ui/text/style/LineBreak;Landroidx/compose/ui/text/style/Hyphens;Landroidx/compose/ui/text/PlatformTextStyle;Landroidx/compose/ui/text/style/TextMotion;)Landroidx/compose/ui/text/TextStyle;", "plus", "toParagraphStyle", "toSpanStyle", "toString", "Companion", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class TextStyle {
    public static final int $stable = 0;
    public static final Companion Companion = null;
    private static final TextStyle Default = null;
    private final ParagraphStyle paragraphStyle;
    private final PlatformTextStyle platformStyle;
    private final SpanStyle spanStyle;

    /* JADX INFO: compiled from: TextStyle.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0005\u0010\u0002\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Landroidx/compose/ui/text/TextStyle$Companion;", "", "()V", Profile.DEFAULT_PROFILE_NAME, "Landroidx/compose/ui/text/TextStyle;", "getDefault$annotations", "getDefault", "()Landroidx/compose/ui/text/TextStyle;", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker r1) {
            this();
        }

        public static /* synthetic */ void getDefault$annotations() {
        }

        private Companion() {
        }

        public final TextStyle getDefault() {
            return TextStyle.access$getDefault$cp();
        }
    }

    public /* synthetic */ TextStyle(long r1, long r3, FontWeight r5, FontStyle r6, FontSynthesis r7, FontFamily r8, String r9, long r10, BaselineShift r12, TextGeometricTransform r13, LocaleList r14, long r15, TextDecoration r17, Shadow r18, DrawStyle r19, int r20, int r21, long r22, TextIndent r24, PlatformTextStyle r25, LineHeightStyle r26, int r27, int r28, TextMotion r29, DefaultConstructorMarker r30) {
        this(r1, r3, r5, r6, r7, r8, r9, r10, r12, r13, r14, r15, r17, r18, r19, r20, r21, r22, r24, r25, r26, r27, r28, r29);
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "TextStyle constructors that take nullable TextAlign, TextDirection, LineBreak, and Hyphens are deprecated. Please use a new constructor where these parameters are non-nullable. Null value has been replaced by a special Unspecified object for performance reason.")
    public /* synthetic */ TextStyle(long r1, long r3, FontWeight r5, FontStyle r6, FontSynthesis r7, FontFamily r8, String r9, long r10, BaselineShift r12, TextGeometricTransform r13, LocaleList r14, long r15, TextDecoration r17, Shadow r18, DrawStyle r19, TextAlign r20, TextDirection r21, long r22, TextIndent r24, PlatformTextStyle r25, LineHeightStyle r26, LineBreak r27, Hyphens r28, TextMotion r29, DefaultConstructorMarker r30) {
        this(r1, r3, r5, r6, r7, r8, r9, r10, r12, r13, r14, r15, r17, r18, r19, r20, r21, r22, r24, r25, r26, r27, r28, r29);
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "TextStyle constructors that do not take new stable parameters like TextMotion are deprecated. Please use the new stable constructor.")
    public /* synthetic */ TextStyle(long r1, long r3, FontWeight r5, FontStyle r6, FontSynthesis r7, FontFamily r8, String r9, long r10, BaselineShift r12, TextGeometricTransform r13, LocaleList r14, long r15, TextDecoration r17, Shadow r18, TextAlign r19, TextDirection r20, long r21, TextIndent r23, PlatformTextStyle r24, LineHeightStyle r25, LineBreak r26, Hyphens r27, DefaultConstructorMarker r28) {
        this(r1, r3, r5, r6, r7, r8, r9, r10, r12, r13, r14, r15, r17, r18, r19, r20, r21, r23, r24, r25, r26, r27);
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "TextStyle constructors that do not take new stable parameters like LineHeightStyle, LineBreak, Hyphens are deprecated. Please use the new stable constructor.")
    public /* synthetic */ TextStyle(long r1, long r3, FontWeight r5, FontStyle r6, FontSynthesis r7, FontFamily r8, String r9, long r10, BaselineShift r12, TextGeometricTransform r13, LocaleList r14, long r15, TextDecoration r17, Shadow r18, TextAlign r19, TextDirection r20, long r21, TextIndent r23, PlatformTextStyle r24, LineHeightStyle r25, DefaultConstructorMarker r26) {
        this(r1, r3, r5, r6, r7, r8, r9, r10, r12, r13, r14, r15, r17, r18, r19, r20, r21, r23, r24, r25);
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "TextStyle constructors that do not take new stable parameters like LineHeightStyle, LineBreak, Hyphens are deprecated. Please use the new stable constructor.")
    public /* synthetic */ TextStyle(long r1, long r3, FontWeight r5, FontStyle r6, FontSynthesis r7, FontFamily r8, String r9, long r10, BaselineShift r12, TextGeometricTransform r13, LocaleList r14, long r15, TextDecoration r17, Shadow r18, TextAlign r19, TextDirection r20, long r21, TextIndent r23, DefaultConstructorMarker r24) {
        this(r1, r3, r5, r6, r7, r8, r9, r10, r12, r13, r14, r15, r17, r18, r19, r20, r21, r23);
    }

    public /* synthetic */ TextStyle(Brush r1, float r2, long r3, FontWeight r5, FontStyle r6, FontSynthesis r7, FontFamily r8, String r9, long r10, BaselineShift r12, TextGeometricTransform r13, LocaleList r14, long r15, TextDecoration r17, Shadow r18, DrawStyle r19, int r20, int r21, long r22, TextIndent r24, PlatformTextStyle r25, LineHeightStyle r26, int r27, int r28, TextMotion r29, DefaultConstructorMarker r30) {
        this(r1, r2, r3, r5, r6, r7, r8, r9, r10, r12, r13, r14, r15, r17, r18, r19, r20, r21, r22, r24, r25, r26, r27, r28, r29);
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "TextStyle constructors that take nullable TextAlign, TextDirection, LineBreak, and Hyphens are deprecated. Please use a new constructor where these parameters are non-nullable. Null value has been replaced by a special Unspecified object for performance reason.")
    public /* synthetic */ TextStyle(Brush r1, float r2, long r3, FontWeight r5, FontStyle r6, FontSynthesis r7, FontFamily r8, String r9, long r10, BaselineShift r12, TextGeometricTransform r13, LocaleList r14, long r15, TextDecoration r17, Shadow r18, DrawStyle r19, TextAlign r20, TextDirection r21, long r22, TextIndent r24, PlatformTextStyle r25, LineHeightStyle r26, LineBreak r27, Hyphens r28, TextMotion r29, DefaultConstructorMarker r30) {
        this(r1, r2, r3, r5, r6, r7, r8, r9, r10, r12, r13, r14, r15, r17, r18, r19, r20, r21, r22, r24, r25, r26, r27, r28, r29);
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "Kept for backwards compatibility.")
    /* JADX INFO: renamed from: getHyphens-EaSxIns$annotations, reason: not valid java name */
    public static /* synthetic */ void m6432getHyphensEaSxIns$annotations() {
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "Kept for backwards compatibility.")
    /* JADX INFO: renamed from: getLineBreak-LgCVezo$annotations, reason: not valid java name */
    public static /* synthetic */ void m6433getLineBreakLgCVezo$annotations() {
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "Kept for backwards compatibility.")
    /* JADX INFO: renamed from: getTextAlign-buA522U$annotations, reason: not valid java name */
    public static /* synthetic */ void m6434getTextAlignbuA522U$annotations() {
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "Kept for backwards compatibility.")
    /* JADX INFO: renamed from: getTextDirection-mmuk1to$annotations, reason: not valid java name */
    public static /* synthetic */ void m6435getTextDirectionmmuk1to$annotations() {
    }

    public TextStyle(SpanStyle spanStyle, ParagraphStyle paragraphStyle, PlatformTextStyle platformStyle) {
        this.spanStyle = spanStyle;
        this.paragraphStyle = paragraphStyle;
        this.platformStyle = platformStyle;
    }

    public static final /* synthetic */ TextStyle access$getDefault$cp() {
        return Default;
    }

    public /* synthetic */ TextStyle(SpanStyle r1, ParagraphStyle r2, PlatformTextStyle r3, int r4, DefaultConstructorMarker r5) {
        if ((r4 & 4) == 0) goto L5;
        r3 = null;
    L5:
        this(r1, r2, r3);
    }

    public final SpanStyle getSpanStyle$ui_text_release() {
        return this.spanStyle;
    }

    public final ParagraphStyle getParagraphStyle$ui_text_release() {
        return this.paragraphStyle;
    }

    public final PlatformTextStyle getPlatformStyle() {
        return this.platformStyle;
    }

    public TextStyle(SpanStyle spanStyle, ParagraphStyle paragraphStyle) {
        this(spanStyle, paragraphStyle, TextStyleKt.access$createPlatformTextStyleInternal(spanStyle.getPlatformStyle(), paragraphStyle.getPlatformStyle()));
    }

    public /* synthetic */ TextStyle(long r25, long r27, FontWeight r29, FontStyle r30, FontSynthesis r31, FontFamily r32, String r33, long r34, BaselineShift r36, TextGeometricTransform r37, LocaleList r38, long r39, TextDecoration r41, Shadow r42, TextAlign r43, TextDirection r44, long r45, TextIndent r47, int r48, DefaultConstructorMarker r49) {
        if ((r48 & 1) == 0) goto L5;
        long r1 = Color.Companion.m4402getUnspecified0d7_KjU();
    L7:
        if ((r48 & 2) == 0) goto L9;
        long r3 = TextUnit.Companion.m7178getUnspecifiedXSAIIZE();
    L11:
        if ((r48 & 4) == 0) goto L13;
        FontWeight r5 = null;
    L15:
        if ((r48 & 8) == 0) goto L17;
        FontStyle r7 = null;
    L19:
        if ((r48 & 16) == 0) goto L21;
        FontSynthesis r8 = null;
    L23:
        if ((r48 & 32) == 0) goto L25;
        FontFamily r9 = null;
    L27:
        if ((r48 & 64) == 0) goto L29;
        String r10 = null;
    L31:
        if ((r48 & 128) == 0) goto L33;
        long r11 = TextUnit.Companion.m7178getUnspecifiedXSAIIZE();
    L35:
        if ((r48 & 256) == 0) goto L37;
        BaselineShift r13 = null;
    L39:
        if ((r48 & 512) == 0) goto L41;
        TextGeometricTransform r14 = null;
    L43:
        if ((r48 & 1024) == 0) goto L45;
        LocaleList r15 = null;
    L47:
        if ((r48 & 2048) == 0) goto L49;
        long r16 = Color.Companion.m4402getUnspecified0d7_KjU();
    L51:
        if ((r48 & 4096) == 0) goto L53;
        TextDecoration r6 = null;
    L54:
        long r18 = r1;
        if ((r48 & 8192) == 0) goto L57;
        Shadow r2 = null;
    L59:
        if ((r48 & 16384) == 0) goto L61;
        TextAlign r4 = null;
    L63:
        if ((r48 & 32768) == 0) goto L65;
        TextDirection r20 = null;
    L67:
        if ((r48 & 65536) == 0) goto L69;
        long r21 = TextUnit.Companion.m7178getUnspecifiedXSAIIZE();
    L71:
        if ((r48 & 131072) == 0) goto L73;
        TextIndent r0 = null;
    L74:
        TextIndent r410 = r0;
        Shadow r46 = r2;
        TextAlign r411 = r4;
        long r28 = r3;
        FontWeight r35 = r5;
        TextDecoration r412 = r6;
        FontStyle r310 = r7;
        FontSynthesis r311 = r8;
        FontFamily r312 = r9;
        String r313 = r10;
        long r314 = r11;
        BaselineShift r315 = r13;
        TextGeometricTransform r316 = r14;
        LocaleList r317 = r15;
        long r40 = r16;
        TextDirection r413 = r20;
        long r414 = r21;
        this(r18, r28, r35, r310, r311, r312, r313, r314, r315, r316, r317, r40, r412, r46, r411, r413, r414, r410, null);
        return;
    L73:
        r0 = r47;
        goto L74
    L69:
        r21 = r45;
        goto L71
    L65:
        r20 = r44;
        goto L67
    L61:
        r4 = r43;
        goto L63
    L57:
        r2 = r42;
        goto L59
    L53:
        r6 = r41;
        goto L54
    L49:
        r16 = r39;
        goto L51
    L45:
        r15 = r38;
        goto L47
    L41:
        r14 = r37;
        goto L43
    L37:
        r13 = r36;
        goto L39
    L33:
        r11 = r34;
        goto L35
    L29:
        r10 = r33;
        goto L31
    L25:
        r9 = r32;
        goto L27
    L21:
        r8 = r31;
        goto L23
    L17:
        r7 = r30;
        goto L19
    L13:
        r5 = r29;
        goto L15
    L9:
        r3 = r27;
        goto L11
    L5:
        r1 = r25;
        goto L7
    }

    private TextStyle(long color, long fontSize, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String fontFeatureSettings, long letterSpacing, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long background, TextDecoration textDecoration, Shadow shadow, TextAlign textAlign, TextDirection textDirection, long lineHeight, TextIndent textIndent) {
        SpanStyle r0 = new SpanStyle(color, fontSize, fontWeight, fontStyle, fontSynthesis, fontFamily, fontFeatureSettings, letterSpacing, baselineShift, textGeometricTransform, localeList, background, textDecoration, shadow, null, null, null);
        if (textAlign == null) goto L5;
        int r2 = textAlign.m6834unboximpl();
    L6:
        if (textDirection == null) goto L8;
        int r3 = textDirection.m6848unboximpl();
    L9:
        PlatformParagraphStyle r7 = null;
        LineHeightStyle r8 = null;
        this(r0, new ParagraphStyle(r2, r3, lineHeight, textIndent, r7, r8, LineBreak.Companion.m6756getUnspecifiedrAG3T2k(), Hyphens.Companion.m6735getUnspecifiedvmbZdU8(), null, null), null);
        return;
    L8:
        r3 = TextDirection.Companion.m6854getUnspecifieds_7Xco();
        goto L9
    L5:
        r2 = TextAlign.Companion.m6841getUnspecifiede0LSkKk();
        goto L6
    }

    public /* synthetic */ TextStyle(long r27, long r29, FontWeight r31, FontStyle r32, FontSynthesis r33, FontFamily r34, String r35, long r36, BaselineShift r38, TextGeometricTransform r39, LocaleList r40, long r41, TextDecoration r43, Shadow r44, TextAlign r45, TextDirection r46, long r47, TextIndent r49, PlatformTextStyle r50, LineHeightStyle r51, int r52, DefaultConstructorMarker r53) {
        if ((r52 & 1) == 0) goto L5;
        long r1 = Color.Companion.m4402getUnspecified0d7_KjU();
    L7:
        if ((r52 & 2) == 0) goto L9;
        long r3 = TextUnit.Companion.m7178getUnspecifiedXSAIIZE();
    L11:
        if ((r52 & 4) == 0) goto L13;
        FontWeight r5 = null;
    L15:
        if ((r52 & 8) == 0) goto L17;
        FontStyle r7 = null;
    L19:
        if ((r52 & 16) == 0) goto L21;
        FontSynthesis r8 = null;
    L23:
        if ((r52 & 32) == 0) goto L25;
        FontFamily r9 = null;
    L27:
        if ((r52 & 64) == 0) goto L29;
        String r10 = null;
    L31:
        if ((r52 & 128) == 0) goto L33;
        long r11 = TextUnit.Companion.m7178getUnspecifiedXSAIIZE();
    L35:
        if ((r52 & 256) == 0) goto L37;
        BaselineShift r13 = null;
    L39:
        if ((r52 & 512) == 0) goto L41;
        TextGeometricTransform r14 = null;
    L43:
        if ((r52 & 1024) == 0) goto L45;
        LocaleList r15 = null;
    L47:
        if ((r52 & 2048) == 0) goto L49;
        long r16 = Color.Companion.m4402getUnspecified0d7_KjU();
    L51:
        if ((r52 & 4096) == 0) goto L53;
        TextDecoration r6 = null;
    L54:
        long r18 = r1;
        if ((r52 & 8192) == 0) goto L57;
        Shadow r2 = null;
    L59:
        if ((r52 & 16384) == 0) goto L61;
        TextAlign r4 = null;
    L63:
        if ((r52 & 32768) == 0) goto L65;
        TextDirection r20 = null;
    L67:
        if ((r52 & 65536) == 0) goto L69;
        long r21 = TextUnit.Companion.m7178getUnspecifiedXSAIIZE();
    L71:
        if ((r52 & 131072) == 0) goto L73;
        TextIndent r23 = null;
    L75:
        if ((r52 & 262144) == 0) goto L77;
        PlatformTextStyle r24 = null;
    L79:
        if ((r52 & 524288) == 0) goto L81;
        LineHeightStyle r0 = null;
    L82:
        LineHeightStyle r54 = r0;
        Shadow r48 = r2;
        TextAlign r410 = r4;
        long r30 = r3;
        FontWeight r37 = r5;
        TextDecoration r411 = r6;
        FontStyle r310 = r7;
        FontSynthesis r311 = r8;
        FontFamily r312 = r9;
        String r313 = r10;
        long r314 = r11;
        BaselineShift r315 = r13;
        TextGeometricTransform r42 = r14;
        LocaleList r412 = r15;
        long r413 = r16;
        TextDirection r414 = r20;
        long r415 = r21;
        TextIndent r55 = r23;
        PlatformTextStyle r56 = r24;
        this(r18, r30, r37, r310, r311, r312, r313, r314, r315, r42, r412, r413, r411, r48, r410, r414, r415, r55, r56, r54, null);
        return;
    L81:
        r0 = r51;
        goto L82
    L77:
        r24 = r50;
        goto L79
    L73:
        r23 = r49;
        goto L75
    L69:
        r21 = r47;
        goto L71
    L65:
        r20 = r46;
        goto L67
    L61:
        r4 = r45;
        goto L63
    L57:
        r2 = r44;
        goto L59
    L53:
        r6 = r43;
        goto L54
    L49:
        r16 = r41;
        goto L51
    L45:
        r15 = r40;
        goto L47
    L41:
        r14 = r39;
        goto L43
    L37:
        r13 = r38;
        goto L39
    L33:
        r11 = r36;
        goto L35
    L29:
        r10 = r35;
        goto L31
    L25:
        r9 = r34;
        goto L27
    L21:
        r8 = r33;
        goto L23
    L17:
        r7 = r32;
        goto L19
    L13:
        r5 = r31;
        goto L15
    L9:
        r3 = r29;
        goto L11
    L5:
        r1 = r27;
        goto L7
    }

    private TextStyle(long color, long fontSize, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String fontFeatureSettings, long letterSpacing, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long background, TextDecoration textDecoration, Shadow shadow, TextAlign textAlign, TextDirection textDirection, long lineHeight, TextIndent textIndent, PlatformTextStyle platformStyle, LineHeightStyle lineHeightStyle) {
        PlatformParagraphStyle r23 = null;
        if (platformStyle == null) goto L5;
        PlatformSpanStyle r20 = platformStyle.getSpanStyle();
    L6:
        SpanStyle r1 = new SpanStyle(color, fontSize, fontWeight, fontStyle, fontSynthesis, fontFamily, fontFeatureSettings, letterSpacing, baselineShift, textGeometricTransform, localeList, background, textDecoration, shadow, r20, null, null);
        if (textAlign == null) goto L9;
        int r3 = textAlign.m6834unboximpl();
    L10:
        if (textDirection == null) goto L12;
        int r4 = textDirection.m6848unboximpl();
    L14:
        if (platformStyle == null) goto L16;
        r23 = platformStyle.getParagraphStyle();
    L16:
        this(r1, new ParagraphStyle(r3, r4, lineHeight, textIndent, r23, lineHeightStyle, LineBreak.Companion.m6756getUnspecifiedrAG3T2k(), Hyphens.Companion.m6735getUnspecifiedvmbZdU8(), null, null), platformStyle);
        return;
    L12:
        r4 = TextDirection.Companion.m6854getUnspecifieds_7Xco();
        goto L14
    L9:
        r3 = TextAlign.Companion.m6841getUnspecifiede0LSkKk();
        goto L10
    L5:
        r20 = null;
        goto L6
    }

    public /* synthetic */ TextStyle(long r29, long r31, FontWeight r33, FontStyle r34, FontSynthesis r35, FontFamily r36, String r37, long r38, BaselineShift r40, TextGeometricTransform r41, LocaleList r42, long r43, TextDecoration r45, Shadow r46, TextAlign r47, TextDirection r48, long r49, TextIndent r51, PlatformTextStyle r52, LineHeightStyle r53, LineBreak r54, Hyphens r55, int r56, DefaultConstructorMarker r57) {
        if ((r56 & 1) == 0) goto L5;
        long r1 = Color.Companion.m4402getUnspecified0d7_KjU();
    L7:
        if ((r56 & 2) == 0) goto L9;
        long r3 = TextUnit.Companion.m7178getUnspecifiedXSAIIZE();
    L11:
        if ((r56 & 4) == 0) goto L13;
        FontWeight r5 = null;
    L15:
        if ((r56 & 8) == 0) goto L17;
        FontStyle r7 = null;
    L19:
        if ((r56 & 16) == 0) goto L21;
        FontSynthesis r8 = null;
    L23:
        if ((r56 & 32) == 0) goto L25;
        FontFamily r9 = null;
    L27:
        if ((r56 & 64) == 0) goto L29;
        String r10 = null;
    L31:
        if ((r56 & 128) == 0) goto L33;
        long r11 = TextUnit.Companion.m7178getUnspecifiedXSAIIZE();
    L35:
        if ((r56 & 256) == 0) goto L37;
        BaselineShift r13 = null;
    L39:
        if ((r56 & 512) == 0) goto L41;
        TextGeometricTransform r14 = null;
    L43:
        if ((r56 & 1024) == 0) goto L45;
        LocaleList r15 = null;
    L47:
        if ((r56 & 2048) == 0) goto L49;
        long r16 = Color.Companion.m4402getUnspecified0d7_KjU();
    L51:
        if ((r56 & 4096) == 0) goto L53;
        TextDecoration r6 = null;
    L54:
        long r18 = r1;
        if ((r56 & 8192) == 0) goto L57;
        Shadow r2 = null;
    L59:
        if ((r56 & 16384) == 0) goto L61;
        TextAlign r4 = null;
    L63:
        if ((r56 & 32768) == 0) goto L65;
        TextDirection r20 = null;
    L67:
        if ((r56 & 65536) == 0) goto L69;
        long r21 = TextUnit.Companion.m7178getUnspecifiedXSAIIZE();
    L71:
        if ((r56 & 131072) == 0) goto L73;
        TextIndent r23 = null;
    L75:
        if ((r56 & 262144) == 0) goto L77;
        PlatformTextStyle r24 = null;
    L79:
        if ((r56 & 524288) == 0) goto L81;
        LineHeightStyle r25 = null;
    L83:
        if ((r56 & 1048576) == 0) goto L85;
        LineBreak r26 = null;
    L87:
        if ((r56 & 2097152) == 0) goto L89;
        Hyphens r0 = null;
    L90:
        Hyphens r58 = r0;
        Shadow r410 = r2;
        TextAlign r411 = r4;
        long r32 = r3;
        FontWeight r39 = r5;
        TextDecoration r412 = r6;
        FontStyle r310 = r7;
        FontSynthesis r311 = r8;
        FontFamily r312 = r9;
        String r313 = r10;
        long r314 = r11;
        BaselineShift r44 = r13;
        TextGeometricTransform r413 = r14;
        LocaleList r414 = r15;
        long r415 = r16;
        TextDirection r416 = r20;
        long r50 = r21;
        TextIndent r59 = r23;
        PlatformTextStyle r510 = r24;
        LineHeightStyle r511 = r25;
        LineBreak r512 = r26;
        this(r18, r32, r39, r310, r311, r312, r313, r314, r44, r413, r414, r415, r412, r410, r411, r416, r50, r59, r510, r511, r512, r58, null);
        return;
    L89:
        r0 = r55;
        goto L90
    L85:
        r26 = r54;
        goto L87
    L81:
        r25 = r53;
        goto L83
    L77:
        r24 = r52;
        goto L79
    L73:
        r23 = r51;
        goto L75
    L69:
        r21 = r49;
        goto L71
    L65:
        r20 = r48;
        goto L67
    L61:
        r4 = r47;
        goto L63
    L57:
        r2 = r46;
        goto L59
    L53:
        r6 = r45;
        goto L54
    L49:
        r16 = r43;
        goto L51
    L45:
        r15 = r42;
        goto L47
    L41:
        r14 = r41;
        goto L43
    L37:
        r13 = r40;
        goto L39
    L33:
        r11 = r38;
        goto L35
    L29:
        r10 = r37;
        goto L31
    L25:
        r9 = r36;
        goto L27
    L21:
        r8 = r35;
        goto L23
    L17:
        r7 = r34;
        goto L19
    L13:
        r5 = r33;
        goto L15
    L9:
        r3 = r31;
        goto L11
    L5:
        r1 = r29;
        goto L7
    }

    private TextStyle(long color, long fontSize, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String fontFeatureSettings, long letterSpacing, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long background, TextDecoration textDecoration, Shadow shadow, TextAlign textAlign, TextDirection textDirection, long lineHeight, TextIndent textIndent, PlatformTextStyle platformStyle, LineHeightStyle lineHeightStyle, LineBreak lineBreak, Hyphens hyphens) {
        PlatformParagraphStyle r24 = null;
        if (platformStyle == null) goto L5;
        PlatformSpanStyle r20 = platformStyle.getSpanStyle();
    L6:
        SpanStyle r1 = new SpanStyle(color, fontSize, fontWeight, fontStyle, fontSynthesis, fontFamily, fontFeatureSettings, letterSpacing, baselineShift, textGeometricTransform, localeList, background, textDecoration, shadow, r20, null, 32768, null);
        if (textAlign == null) goto L9;
        int r3 = textAlign.m6834unboximpl();
    L10:
        if (textDirection == null) goto L12;
        int r4 = textDirection.m6848unboximpl();
    L14:
        if (platformStyle == null) goto L16;
        r24 = platformStyle.getParagraphStyle();
    L16:
        PlatformParagraphStyle r8 = r24;
        if (lineBreak == null) goto L19;
        int r5 = lineBreak.m6748unboximpl();
    L20:
        int r10 = r5;
        if (hyphens == null) goto L23;
        int r6 = hyphens.m6732unboximpl();
    L24:
        this(r1, new ParagraphStyle(r3, r4, lineHeight, textIndent, r8, lineHeightStyle, r10, r6, null, 256, null), platformStyle);
        return;
    L23:
        r6 = Hyphens.Companion.m6735getUnspecifiedvmbZdU8();
        goto L24
    L19:
        r5 = LineBreak.Companion.m6756getUnspecifiedrAG3T2k();
        goto L20
    L12:
        r4 = TextDirection.Companion.m6854getUnspecifieds_7Xco();
        goto L14
    L9:
        r3 = TextAlign.Companion.m6841getUnspecifiede0LSkKk();
        goto L10
    L5:
        r20 = null;
        goto L6
    }

    public /* synthetic */ TextStyle(long r31, long r33, FontWeight r35, FontStyle r36, FontSynthesis r37, FontFamily r38, String r39, long r40, BaselineShift r42, TextGeometricTransform r43, LocaleList r44, long r45, TextDecoration r47, Shadow r48, DrawStyle r49, TextAlign r50, TextDirection r51, long r52, TextIndent r54, PlatformTextStyle r55, LineHeightStyle r56, LineBreak r57, Hyphens r58, TextMotion r59, int r60, DefaultConstructorMarker r61) {
        if ((r60 & 1) == 0) goto L5;
        long r1 = Color.Companion.m4402getUnspecified0d7_KjU();
    L7:
        if ((r60 & 2) == 0) goto L9;
        long r3 = TextUnit.Companion.m7178getUnspecifiedXSAIIZE();
    L11:
        if ((r60 & 4) == 0) goto L13;
        FontWeight r5 = null;
    L15:
        if ((r60 & 8) == 0) goto L17;
        FontStyle r7 = null;
    L19:
        if ((r60 & 16) == 0) goto L21;
        FontSynthesis r8 = null;
    L23:
        if ((r60 & 32) == 0) goto L25;
        FontFamily r9 = null;
    L27:
        if ((r60 & 64) == 0) goto L29;
        String r10 = null;
    L31:
        if ((r60 & 128) == 0) goto L33;
        long r11 = TextUnit.Companion.m7178getUnspecifiedXSAIIZE();
    L35:
        if ((r60 & 256) == 0) goto L37;
        BaselineShift r13 = null;
    L39:
        if ((r60 & 512) == 0) goto L41;
        TextGeometricTransform r14 = null;
    L43:
        if ((r60 & 1024) == 0) goto L45;
        LocaleList r15 = null;
    L47:
        if ((r60 & 2048) == 0) goto L49;
        long r16 = Color.Companion.m4402getUnspecified0d7_KjU();
    L51:
        if ((r60 & 4096) == 0) goto L53;
        TextDecoration r6 = null;
    L54:
        long r18 = r1;
        if ((r60 & 8192) == 0) goto L57;
        Shadow r2 = null;
    L59:
        if ((r60 & 16384) == 0) goto L61;
        DrawStyle r4 = null;
    L63:
        if ((r60 & 32768) == 0) goto L65;
        TextAlign r20 = null;
    L67:
        if ((r60 & 65536) == 0) goto L69;
        TextDirection r21 = null;
    L71:
        if ((r60 & 131072) == 0) goto L73;
        long r22 = TextUnit.Companion.m7178getUnspecifiedXSAIIZE();
    L75:
        if ((r60 & 262144) == 0) goto L77;
        TextIndent r24 = null;
    L79:
        if ((r60 & 524288) == 0) goto L81;
        PlatformTextStyle r25 = null;
    L83:
        if ((r60 & 1048576) == 0) goto L85;
        LineHeightStyle r26 = null;
    L87:
        if ((r60 & 2097152) == 0) goto L89;
        LineBreak r27 = null;
    L91:
        if ((r60 & 4194304) == 0) goto L93;
        Hyphens r28 = null;
    L95:
        if ((r60 & 8388608) == 0) goto L97;
        TextMotion r0 = null;
    L98:
        TextMotion r62 = r0;
        Shadow r410 = r2;
        DrawStyle r53 = r4;
        long r34 = r3;
        FontWeight r310 = r5;
        TextDecoration r411 = r6;
        FontStyle r311 = r7;
        FontSynthesis r312 = r8;
        FontFamily r313 = r9;
        String r41 = r10;
        long r46 = r11;
        BaselineShift r412 = r13;
        TextGeometricTransform r413 = r14;
        LocaleList r414 = r15;
        long r415 = r16;
        TextAlign r510 = r20;
        TextDirection r511 = r21;
        long r512 = r22;
        TextIndent r513 = r24;
        PlatformTextStyle r514 = r25;
        LineHeightStyle r515 = r26;
        LineBreak r516 = r27;
        Hyphens r517 = r28;
        this(r18, r34, r310, r311, r312, r313, r41, r46, r412, r413, r414, r415, r411, r410, r53, r510, r511, r512, r513, r514, r515, r516, r517, r62, null);
        return;
    L97:
        r0 = r59;
        goto L98
    L93:
        r28 = r58;
        goto L95
    L89:
        r27 = r57;
        goto L91
    L85:
        r26 = r56;
        goto L87
    L81:
        r25 = r55;
        goto L83
    L77:
        r24 = r54;
        goto L79
    L73:
        r22 = r52;
        goto L75
    L69:
        r21 = r51;
        goto L71
    L65:
        r20 = r50;
        goto L67
    L61:
        r4 = r49;
        goto L63
    L57:
        r2 = r48;
        goto L59
    L53:
        r6 = r47;
        goto L54
    L49:
        r16 = r45;
        goto L51
    L45:
        r15 = r44;
        goto L47
    L41:
        r14 = r43;
        goto L43
    L37:
        r13 = r42;
        goto L39
    L33:
        r11 = r40;
        goto L35
    L29:
        r10 = r39;
        goto L31
    L25:
        r9 = r38;
        goto L27
    L21:
        r8 = r37;
        goto L23
    L17:
        r7 = r36;
        goto L19
    L13:
        r5 = r35;
        goto L15
    L9:
        r3 = r33;
        goto L11
    L5:
        r1 = r31;
        goto L7
    }

    private TextStyle(long color, long fontSize, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String fontFeatureSettings, long letterSpacing, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long background, TextDecoration textDecoration, Shadow shadow, DrawStyle drawStyle, TextAlign textAlign, TextDirection textDirection, long lineHeight, TextIndent textIndent, PlatformTextStyle platformStyle, LineHeightStyle lineHeightStyle, LineBreak lineBreak, Hyphens hyphens, TextMotion textMotion) {
        PlatformParagraphStyle r23 = null;
        if (platformStyle == null) goto L5;
        PlatformSpanStyle r20 = platformStyle.getSpanStyle();
    L6:
        SpanStyle r1 = new SpanStyle(color, fontSize, fontWeight, fontStyle, fontSynthesis, fontFamily, fontFeatureSettings, letterSpacing, baselineShift, textGeometricTransform, localeList, background, textDecoration, shadow, r20, drawStyle, null);
        if (textAlign == null) goto L9;
        int r3 = textAlign.m6834unboximpl();
    L10:
        if (textDirection == null) goto L12;
        int r4 = textDirection.m6848unboximpl();
    L14:
        if (platformStyle == null) goto L16;
        r23 = platformStyle.getParagraphStyle();
    L16:
        PlatformParagraphStyle r8 = r23;
        if (lineBreak == null) goto L19;
        int r5 = lineBreak.m6748unboximpl();
    L20:
        int r10 = r5;
        if (hyphens == null) goto L23;
        int r6 = hyphens.m6732unboximpl();
    L24:
        this(r1, new ParagraphStyle(r3, r4, lineHeight, textIndent, r8, lineHeightStyle, r10, r6, textMotion, null), platformStyle);
        return;
    L23:
        r6 = Hyphens.Companion.m6735getUnspecifiedvmbZdU8();
        goto L24
    L19:
        r5 = LineBreak.Companion.m6756getUnspecifiedrAG3T2k();
        goto L20
    L12:
        r4 = TextDirection.Companion.m6854getUnspecifieds_7Xco();
        goto L14
    L9:
        r3 = TextAlign.Companion.m6841getUnspecifiede0LSkKk();
        goto L10
    L5:
        r20 = null;
        goto L6
    }

    public /* synthetic */ TextStyle(long r31, long r33, FontWeight r35, FontStyle r36, FontSynthesis r37, FontFamily r38, String r39, long r40, BaselineShift r42, TextGeometricTransform r43, LocaleList r44, long r45, TextDecoration r47, Shadow r48, DrawStyle r49, int r50, int r51, long r52, TextIndent r54, PlatformTextStyle r55, LineHeightStyle r56, int r57, int r58, TextMotion r59, int r60, DefaultConstructorMarker r61) {
        if ((r60 & 1) == 0) goto L5;
        long r1 = Color.Companion.m4402getUnspecified0d7_KjU();
    L7:
        if ((r60 & 2) == 0) goto L9;
        long r3 = TextUnit.Companion.m7178getUnspecifiedXSAIIZE();
    L11:
        if ((r60 & 4) == 0) goto L13;
        FontWeight r5 = null;
    L15:
        if ((r60 & 8) == 0) goto L17;
        FontStyle r7 = null;
    L19:
        if ((r60 & 16) == 0) goto L21;
        FontSynthesis r8 = null;
    L23:
        if ((r60 & 32) == 0) goto L25;
        FontFamily r9 = null;
    L27:
        if ((r60 & 64) == 0) goto L29;
        String r10 = null;
    L31:
        if ((r60 & 128) == 0) goto L33;
        long r11 = TextUnit.Companion.m7178getUnspecifiedXSAIIZE();
    L35:
        if ((r60 & 256) == 0) goto L37;
        BaselineShift r13 = null;
    L39:
        if ((r60 & 512) == 0) goto L41;
        TextGeometricTransform r14 = null;
    L43:
        if ((r60 & 1024) == 0) goto L45;
        LocaleList r15 = null;
    L47:
        if ((r60 & 2048) == 0) goto L49;
        long r16 = Color.Companion.m4402getUnspecified0d7_KjU();
    L51:
        if ((r60 & 4096) == 0) goto L53;
        TextDecoration r6 = null;
    L54:
        long r18 = r1;
        if ((r60 & 8192) == 0) goto L57;
        Shadow r2 = null;
    L59:
        if ((r60 & 16384) == 0) goto L61;
        DrawStyle r4 = null;
    L63:
        if ((r60 & 32768) == 0) goto L65;
        int r20 = TextAlign.Companion.m6841getUnspecifiede0LSkKk();
    L67:
        if ((r60 & 65536) == 0) goto L69;
        int r21 = TextDirection.Companion.m6854getUnspecifieds_7Xco();
    L71:
        if ((r60 & 131072) == 0) goto L73;
        long r22 = TextUnit.Companion.m7178getUnspecifiedXSAIIZE();
    L75:
        if ((r60 & 262144) == 0) goto L77;
        TextIndent r24 = null;
    L79:
        if ((r60 & 524288) == 0) goto L81;
        PlatformTextStyle r25 = null;
    L83:
        if ((r60 & 1048576) == 0) goto L85;
        LineHeightStyle r26 = null;
    L87:
        if ((r60 & 2097152) == 0) goto L89;
        int r27 = LineBreak.Companion.m6756getUnspecifiedrAG3T2k();
    L91:
        if ((r60 & 4194304) == 0) goto L93;
        int r28 = Hyphens.Companion.m6735getUnspecifiedvmbZdU8();
    L95:
        if ((r60 & 8388608) == 0) goto L97;
        TextMotion r0 = null;
    L98:
        TextMotion r62 = r0;
        Shadow r410 = r2;
        DrawStyle r53 = r4;
        long r34 = r3;
        FontWeight r310 = r5;
        TextDecoration r411 = r6;
        FontStyle r311 = r7;
        FontSynthesis r312 = r8;
        FontFamily r313 = r9;
        String r41 = r10;
        long r46 = r11;
        BaselineShift r412 = r13;
        TextGeometricTransform r413 = r14;
        LocaleList r414 = r15;
        long r415 = r16;
        int r510 = r20;
        int r511 = r21;
        long r512 = r22;
        TextIndent r513 = r24;
        PlatformTextStyle r514 = r25;
        LineHeightStyle r515 = r26;
        int r516 = r27;
        int r517 = r28;
        this(r18, r34, r310, r311, r312, r313, r41, r46, r412, r413, r414, r415, r411, r410, r53, r510, r511, r512, r513, r514, r515, r516, r517, r62, null);
        return;
    L97:
        r0 = r59;
        goto L98
    L93:
        r28 = r58;
        goto L95
    L89:
        r27 = r57;
        goto L91
    L85:
        r26 = r56;
        goto L87
    L81:
        r25 = r55;
        goto L83
    L77:
        r24 = r54;
        goto L79
    L73:
        r22 = r52;
        goto L75
    L69:
        r21 = r51;
        goto L71
    L65:
        r20 = r50;
        goto L67
    L61:
        r4 = r49;
        goto L63
    L57:
        r2 = r48;
        goto L59
    L53:
        r6 = r47;
        goto L54
    L49:
        r16 = r45;
        goto L51
    L45:
        r15 = r44;
        goto L47
    L41:
        r14 = r43;
        goto L43
    L37:
        r13 = r42;
        goto L39
    L33:
        r11 = r40;
        goto L35
    L29:
        r10 = r39;
        goto L31
    L25:
        r9 = r38;
        goto L27
    L21:
        r8 = r37;
        goto L23
    L17:
        r7 = r36;
        goto L19
    L13:
        r5 = r35;
        goto L15
    L9:
        r3 = r33;
        goto L11
    L5:
        r1 = r31;
        goto L7
    }

    private TextStyle(long color, long fontSize, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String fontFeatureSettings, long letterSpacing, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long background, TextDecoration textDecoration, Shadow shadow, DrawStyle drawStyle, int textAlign, int textDirection, long lineHeight, TextIndent textIndent, PlatformTextStyle platformStyle, LineHeightStyle lineHeightStyle, int lineBreak, int hyphens, TextMotion textMotion) {
        PlatformParagraphStyle r23 = null;
        if (platformStyle == null) goto L5;
        PlatformSpanStyle r20 = platformStyle.getSpanStyle();
    L6:
        SpanStyle r1 = new SpanStyle(color, fontSize, fontWeight, fontStyle, fontSynthesis, fontFamily, fontFeatureSettings, letterSpacing, baselineShift, textGeometricTransform, localeList, background, textDecoration, shadow, r20, drawStyle, null);
        if (platformStyle == null) goto L9;
        r23 = platformStyle.getParagraphStyle();
    L9:
        this(r1, new ParagraphStyle(textAlign, textDirection, lineHeight, textIndent, r23, lineHeightStyle, lineBreak, hyphens, textMotion, null), platformStyle);
        return;
    L5:
        r20 = null;
        goto L6
    }

    public /* synthetic */ TextStyle(Brush r34, float r35, long r36, FontWeight r38, FontStyle r39, FontSynthesis r40, FontFamily r41, String r42, long r43, BaselineShift r45, TextGeometricTransform r46, LocaleList r47, long r48, TextDecoration r50, Shadow r51, DrawStyle r52, int r53, int r54, long r55, TextIndent r57, PlatformTextStyle r58, LineHeightStyle r59, int r60, int r61, TextMotion r62, int r63, DefaultConstructorMarker r64) {
        if ((r63 & 2) == 0) goto L5;
        float r4 = Float.NaN;
    L7:
        if ((r63 & 4) == 0) goto L9;
        long r5 = TextUnit.Companion.m7178getUnspecifiedXSAIIZE();
    L11:
        if ((r63 & 8) == 0) goto L13;
        FontWeight r7 = null;
    L15:
        if ((r63 & 16) == 0) goto L17;
        FontStyle r8 = null;
    L19:
        if ((r63 & 32) == 0) goto L21;
        FontSynthesis r9 = null;
    L23:
        if ((r63 & 64) == 0) goto L25;
        FontFamily r10 = null;
    L27:
        if ((r63 & 128) == 0) goto L29;
        String r11 = null;
    L31:
        if ((r63 & 256) == 0) goto L33;
        long r12 = TextUnit.Companion.m7178getUnspecifiedXSAIIZE();
    L35:
        if ((r63 & 512) == 0) goto L37;
        BaselineShift r14 = null;
    L39:
        if ((r63 & 1024) == 0) goto L41;
        TextGeometricTransform r15 = null;
    L43:
        if ((r63 & 2048) == 0) goto L45;
        LocaleList r16 = null;
    L47:
        if ((r63 & 4096) == 0) goto L49;
        long r17 = Color.Companion.m4402getUnspecified0d7_KjU();
    L51:
        if ((r63 & 8192) == 0) goto L53;
        TextDecoration r19 = null;
    L55:
        if ((r63 & 16384) == 0) goto L57;
        Shadow r20 = null;
    L59:
        if ((32768 & r63) == 0) goto L61;
        DrawStyle r21 = null;
    L63:
        if ((65536 & r63) == 0) goto L65;
        int r22 = TextAlign.Companion.m6841getUnspecifiede0LSkKk();
    L67:
        if ((131072 & r63) == 0) goto L69;
        int r23 = TextDirection.Companion.m6854getUnspecifieds_7Xco();
    L71:
        if ((262144 & r63) == 0) goto L73;
        long r24 = TextUnit.Companion.m7178getUnspecifiedXSAIIZE();
    L75:
        if ((524288 & r63) == 0) goto L77;
        TextIndent r26 = null;
    L79:
        if ((1048576 & r63) == 0) goto L81;
        PlatformTextStyle r27 = null;
    L83:
        if ((2097152 & r63) == 0) goto L85;
        LineHeightStyle r28 = null;
    L87:
        if ((4194304 & r63) == 0) goto L89;
        int r29 = LineBreak.Companion.m6756getUnspecifiedrAG3T2k();
    L91:
        if ((8388608 & r63) == 0) goto L93;
        int r30 = Hyphens.Companion.m6735getUnspecifiedvmbZdU8();
    L95:
        if ((r63 & 16777216) == 0) goto L97;
        TextMotion r31 = null;
    L98:
        this(r34, r4, r5, r7, r8, r9, r10, r11, r12, r14, r15, r16, r17, r19, r20, r21, r22, r23, r24, r26, r27, r28, r29, r30, r31, null);
        return;
    L97:
        r31 = r62;
        goto L98
    L93:
        r30 = r61;
        goto L95
    L89:
        r29 = r60;
        goto L91
    L85:
        r28 = r59;
        goto L87
    L81:
        r27 = r58;
        goto L83
    L77:
        r26 = r57;
        goto L79
    L73:
        r24 = r55;
        goto L75
    L69:
        r23 = r54;
        goto L71
    L65:
        r22 = r53;
        goto L67
    L61:
        r21 = r52;
        goto L63
    L57:
        r20 = r51;
        goto L59
    L53:
        r19 = r50;
        goto L55
    L49:
        r17 = r48;
        goto L51
    L45:
        r16 = r47;
        goto L47
    L41:
        r15 = r46;
        goto L43
    L37:
        r14 = r45;
        goto L39
    L33:
        r12 = r43;
        goto L35
    L29:
        r11 = r42;
        goto L31
    L25:
        r10 = r41;
        goto L27
    L21:
        r9 = r40;
        goto L23
    L17:
        r8 = r39;
        goto L19
    L13:
        r7 = r38;
        goto L15
    L9:
        r5 = r36;
        goto L11
    L5:
        r4 = r35;
        goto L7
    }

    private TextStyle(Brush brush, float alpha, long fontSize, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String fontFeatureSettings, long letterSpacing, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long background, TextDecoration textDecoration, Shadow shadow, DrawStyle drawStyle, int textAlign, int textDirection, long lineHeight, TextIndent textIndent, PlatformTextStyle platformStyle, LineHeightStyle lineHeightStyle, int lineBreak, int hyphens, TextMotion textMotion) {
        PlatformParagraphStyle r23 = null;
        if (platformStyle == null) goto L5;
        PlatformSpanStyle r20 = platformStyle.getSpanStyle();
    L6:
        SpanStyle r1 = new SpanStyle(brush, alpha, fontSize, fontWeight, fontStyle, fontSynthesis, fontFamily, fontFeatureSettings, letterSpacing, baselineShift, textGeometricTransform, localeList, background, textDecoration, shadow, r20, drawStyle, null);
        if (platformStyle == null) goto L9;
        r23 = platformStyle.getParagraphStyle();
    L9:
        this(r1, new ParagraphStyle(textAlign, textDirection, lineHeight, textIndent, r23, lineHeightStyle, lineBreak, hyphens, textMotion, null), platformStyle);
        return;
    L5:
        r20 = null;
        goto L6
    }

    public /* synthetic */ TextStyle(Brush r34, float r35, long r36, FontWeight r38, FontStyle r39, FontSynthesis r40, FontFamily r41, String r42, long r43, BaselineShift r45, TextGeometricTransform r46, LocaleList r47, long r48, TextDecoration r50, Shadow r51, DrawStyle r52, TextAlign r53, TextDirection r54, long r55, TextIndent r57, PlatformTextStyle r58, LineHeightStyle r59, LineBreak r60, Hyphens r61, TextMotion r62, int r63, DefaultConstructorMarker r64) {
        if ((r63 & 2) == 0) goto L5;
        float r4 = Float.NaN;
    L7:
        if ((r63 & 4) == 0) goto L9;
        long r5 = TextUnit.Companion.m7178getUnspecifiedXSAIIZE();
    L11:
        if ((r63 & 8) == 0) goto L13;
        FontWeight r7 = null;
    L15:
        if ((r63 & 16) == 0) goto L17;
        FontStyle r8 = null;
    L19:
        if ((r63 & 32) == 0) goto L21;
        FontSynthesis r9 = null;
    L23:
        if ((r63 & 64) == 0) goto L25;
        FontFamily r10 = null;
    L27:
        if ((r63 & 128) == 0) goto L29;
        String r11 = null;
    L31:
        if ((r63 & 256) == 0) goto L33;
        long r12 = TextUnit.Companion.m7178getUnspecifiedXSAIIZE();
    L35:
        if ((r63 & 512) == 0) goto L37;
        BaselineShift r14 = null;
    L39:
        if ((r63 & 1024) == 0) goto L41;
        TextGeometricTransform r15 = null;
    L43:
        if ((r63 & 2048) == 0) goto L45;
        LocaleList r16 = null;
    L47:
        if ((r63 & 4096) == 0) goto L49;
        long r17 = Color.Companion.m4402getUnspecified0d7_KjU();
    L51:
        if ((r63 & 8192) == 0) goto L53;
        TextDecoration r19 = null;
    L55:
        if ((r63 & 16384) == 0) goto L57;
        Shadow r20 = null;
    L59:
        if ((32768 & r63) == 0) goto L61;
        DrawStyle r21 = null;
    L63:
        if ((65536 & r63) == 0) goto L65;
        TextAlign r22 = null;
    L67:
        if ((131072 & r63) == 0) goto L69;
        TextDirection r23 = null;
    L71:
        if ((262144 & r63) == 0) goto L73;
        long r24 = TextUnit.Companion.m7178getUnspecifiedXSAIIZE();
    L75:
        if ((524288 & r63) == 0) goto L77;
        TextIndent r26 = null;
    L79:
        if ((1048576 & r63) == 0) goto L81;
        PlatformTextStyle r27 = null;
    L83:
        if ((2097152 & r63) == 0) goto L85;
        LineHeightStyle r28 = null;
    L87:
        if ((4194304 & r63) == 0) goto L89;
        LineBreak r29 = null;
    L91:
        if ((8388608 & r63) == 0) goto L93;
        Hyphens r30 = null;
    L95:
        if ((r63 & 16777216) == 0) goto L97;
        TextMotion r31 = null;
    L98:
        this(r34, r4, r5, r7, r8, r9, r10, r11, r12, r14, r15, r16, r17, r19, r20, r21, r22, r23, r24, r26, r27, r28, r29, r30, r31, null);
        return;
    L97:
        r31 = r62;
        goto L98
    L93:
        r30 = r61;
        goto L95
    L89:
        r29 = r60;
        goto L91
    L85:
        r28 = r59;
        goto L87
    L81:
        r27 = r58;
        goto L83
    L77:
        r26 = r57;
        goto L79
    L73:
        r24 = r55;
        goto L75
    L69:
        r23 = r54;
        goto L71
    L65:
        r22 = r53;
        goto L67
    L61:
        r21 = r52;
        goto L63
    L57:
        r20 = r51;
        goto L59
    L53:
        r19 = r50;
        goto L55
    L49:
        r17 = r48;
        goto L51
    L45:
        r16 = r47;
        goto L47
    L41:
        r15 = r46;
        goto L43
    L37:
        r14 = r45;
        goto L39
    L33:
        r12 = r43;
        goto L35
    L29:
        r11 = r42;
        goto L31
    L25:
        r10 = r41;
        goto L27
    L21:
        r9 = r40;
        goto L23
    L17:
        r8 = r39;
        goto L19
    L13:
        r7 = r38;
        goto L15
    L9:
        r5 = r36;
        goto L11
    L5:
        r4 = r35;
        goto L7
    }

    private TextStyle(Brush brush, float alpha, long fontSize, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String fontFeatureSettings, long letterSpacing, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long background, TextDecoration textDecoration, Shadow shadow, DrawStyle drawStyle, TextAlign textAlign, TextDirection textDirection, long lineHeight, TextIndent textIndent, PlatformTextStyle platformStyle, LineHeightStyle lineHeightStyle, LineBreak lineBreak, Hyphens hyphens, TextMotion textMotion) {
        PlatformParagraphStyle r23 = null;
        if (platformStyle == null) goto L5;
        PlatformSpanStyle r20 = platformStyle.getSpanStyle();
    L6:
        SpanStyle r1 = new SpanStyle(brush, alpha, fontSize, fontWeight, fontStyle, fontSynthesis, fontFamily, fontFeatureSettings, letterSpacing, baselineShift, textGeometricTransform, localeList, background, textDecoration, shadow, r20, drawStyle, null);
        if (textAlign == null) goto L9;
        int r3 = textAlign.m6834unboximpl();
    L10:
        if (textDirection == null) goto L12;
        int r4 = textDirection.m6848unboximpl();
    L14:
        if (platformStyle == null) goto L16;
        r23 = platformStyle.getParagraphStyle();
    L16:
        PlatformParagraphStyle r8 = r23;
        if (lineBreak == null) goto L19;
        int r5 = lineBreak.m6748unboximpl();
    L20:
        int r10 = r5;
        if (hyphens == null) goto L23;
        int r6 = hyphens.m6732unboximpl();
    L24:
        this(r1, new ParagraphStyle(r3, r4, lineHeight, textIndent, r8, lineHeightStyle, r10, r6, textMotion, null), platformStyle);
        return;
    L23:
        r6 = Hyphens.Companion.m6735getUnspecifiedvmbZdU8();
        goto L24
    L19:
        r5 = LineBreak.Companion.m6756getUnspecifiedrAG3T2k();
        goto L20
    L12:
        r4 = TextDirection.Companion.m6854getUnspecifieds_7Xco();
        goto L14
    L9:
        r3 = TextAlign.Companion.m6841getUnspecifiede0LSkKk();
        goto L10
    L5:
        r20 = null;
        goto L6
    }

    public final SpanStyle toSpanStyle() {
        return this.spanStyle;
    }

    public final ParagraphStyle toParagraphStyle() {
        return this.paragraphStyle;
    }

    public static /* synthetic */ TextStyle merge$default(TextStyle r0, TextStyle r1, int r2, Object r3) {
        if ((r2 & 1) == 0) goto L6;
        r1 = null;
    L6:
        return r0.merge(r1);
    }

    public final TextStyle merge(TextStyle other) {
        if (other != null) goto L4;
    L8:
        return this;
    L4:
        if (Intrinsics.areEqual(other, Default) == true) goto L8;
        return new TextStyle(toSpanStyle().merge(other.toSpanStyle()), toParagraphStyle().merge(other.toParagraphStyle()));
    }

    /* JADX INFO: renamed from: merge-dA7vx0o$default, reason: not valid java name */
    public static /* synthetic */ TextStyle m6437mergedA7vx0o$default(TextStyle r30, long r31, long r33, FontWeight r35, FontStyle r36, FontSynthesis r37, FontFamily r38, String r39, long r40, BaselineShift r42, TextGeometricTransform r43, LocaleList r44, long r45, TextDecoration r47, Shadow r48, DrawStyle r49, int r50, int r51, long r52, TextIndent r54, LineHeightStyle r55, int r56, int r57, PlatformTextStyle r58, TextMotion r59, int r60, Object r61) {
        if ((r60 & 1) == 0) goto L5;
        long r1 = Color.Companion.m4402getUnspecified0d7_KjU();
    L7:
        if ((r60 & 2) == 0) goto L9;
        long r3 = TextUnit.Companion.m7178getUnspecifiedXSAIIZE();
    L11:
        if ((r60 & 4) == 0) goto L13;
        FontWeight r5 = null;
    L15:
        if ((r60 & 8) == 0) goto L17;
        FontStyle r7 = null;
    L19:
        if ((r60 & 16) == 0) goto L21;
        FontSynthesis r8 = null;
    L23:
        if ((r60 & 32) == 0) goto L25;
        FontFamily r9 = null;
    L27:
        if ((r60 & 64) == 0) goto L29;
        String r10 = null;
    L31:
        if ((r60 & 128) == 0) goto L33;
        long r11 = TextUnit.Companion.m7178getUnspecifiedXSAIIZE();
    L35:
        if ((r60 & 256) == 0) goto L37;
        BaselineShift r13 = null;
    L39:
        if ((r60 & 512) == 0) goto L41;
        TextGeometricTransform r14 = null;
    L43:
        if ((r60 & 1024) == 0) goto L45;
        LocaleList r15 = null;
    L47:
        if ((r60 & 2048) == 0) goto L49;
        long r16 = Color.Companion.m4402getUnspecified0d7_KjU();
    L51:
        if ((r60 & 4096) == 0) goto L53;
        TextDecoration r6 = null;
    L54:
        long r18 = r1;
        if ((r60 & 8192) == 0) goto L57;
        Shadow r2 = null;
    L59:
        if ((r60 & 16384) == 0) goto L61;
        DrawStyle r4 = null;
    L63:
        if ((r60 & 32768) == 0) goto L65;
        int r20 = TextAlign.Companion.m6841getUnspecifiede0LSkKk();
    L67:
        if ((r60 & 65536) == 0) goto L69;
        int r21 = TextDirection.Companion.m6854getUnspecifieds_7Xco();
    L71:
        if ((r60 & 131072) == 0) goto L73;
        long r22 = TextUnit.Companion.m7178getUnspecifiedXSAIIZE();
    L75:
        if ((r60 & 262144) == 0) goto L77;
        TextIndent r24 = null;
    L79:
        if ((r60 & 524288) == 0) goto L81;
        LineHeightStyle r25 = null;
    L83:
        if ((r60 & 1048576) == 0) goto L85;
        int r26 = LineBreak.Companion.m6756getUnspecifiedrAG3T2k();
    L87:
        if ((r60 & 2097152) == 0) goto L89;
        int r27 = Hyphens.Companion.m6735getUnspecifiedvmbZdU8();
    L91:
        if ((r60 & 4194304) == 0) goto L93;
        PlatformTextStyle r28 = null;
    L95:
        if ((r60 & 8388608) == 0) goto L97;
        TextMotion r0 = null;
    L98:
        Shadow r410 = r2;
        DrawStyle r53 = r4;
        long r34 = r3;
        FontWeight r310 = r5;
        TextDecoration r411 = r6;
        FontStyle r311 = r7;
        FontSynthesis r312 = r8;
        FontFamily r313 = r9;
        String r41 = r10;
        long r46 = r11;
        BaselineShift r412 = r13;
        TextGeometricTransform r413 = r14;
        LocaleList r414 = r15;
        long r415 = r16;
        int r510 = r20;
        int r511 = r21;
        long r512 = r22;
        TextIndent r513 = r24;
        LineHeightStyle r514 = r25;
        int r515 = r26;
        int r516 = r27;
        PlatformTextStyle r517 = r28;
        return r30.m6462mergedA7vx0o(r18, r34, r310, r311, r312, r313, r41, r46, r412, r413, r414, r415, r411, r410, r53, r510, r511, r512, r513, r514, r515, r516, r517, r0);
    L97:
        r0 = r59;
        goto L98
    L93:
        r28 = r58;
        goto L95
    L89:
        r27 = r57;
        goto L91
    L85:
        r26 = r56;
        goto L87
    L81:
        r25 = r55;
        goto L83
    L77:
        r24 = r54;
        goto L79
    L73:
        r22 = r52;
        goto L75
    L69:
        r21 = r51;
        goto L71
    L65:
        r20 = r50;
        goto L67
    L61:
        r4 = r49;
        goto L63
    L57:
        r2 = r48;
        goto L59
    L53:
        r6 = r47;
        goto L54
    L49:
        r16 = r45;
        goto L51
    L45:
        r15 = r44;
        goto L47
    L41:
        r14 = r43;
        goto L43
    L37:
        r13 = r42;
        goto L39
    L33:
        r11 = r40;
        goto L35
    L29:
        r10 = r39;
        goto L31
    L25:
        r9 = r38;
        goto L27
    L21:
        r8 = r37;
        goto L23
    L17:
        r7 = r36;
        goto L19
    L13:
        r5 = r35;
        goto L15
    L9:
        r3 = r33;
        goto L11
    L5:
        r1 = r31;
        goto L7
    }

    /* JADX INFO: renamed from: merge-dA7vx0o, reason: not valid java name */
    public final TextStyle m6462mergedA7vx0o(long color, long fontSize, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String fontFeatureSettings, long letterSpacing, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long background, TextDecoration textDecoration, Shadow shadow, DrawStyle drawStyle, int textAlign, int textDirection, long lineHeight, TextIndent textIndent, LineHeightStyle lineHeightStyle, int lineBreak, int hyphens, PlatformTextStyle platformStyle, TextMotion textMotion) {
        SpanStyle r1 = this.spanStyle;
        PlatformParagraphStyle r24 = null;
        if (platformStyle == null) goto L5;
        PlatformSpanStyle r22 = platformStyle.getSpanStyle();
    L6:
        SpanStyle mergedSpanStyle = SpanStyleKt.m6363fastMergedSHsh3o(r1, color, null, Float.NaN, fontSize, fontWeight, fontStyle, fontSynthesis, fontFamily, fontFeatureSettings, letterSpacing, baselineShift, textGeometricTransform, localeList, background, textDecoration, shadow, r22, drawStyle);
        ParagraphStyle r2 = this.paragraphStyle;
        if (platformStyle == null) goto L9;
        r24 = platformStyle.getParagraphStyle();
    L9:
        ParagraphStyle mergedParagraphStyle = ParagraphStyleKt.m6315fastMergej5T8yCg(r2, textAlign, textDirection, lineHeight, textIndent, r24, lineHeightStyle, lineBreak, hyphens, textMotion);
        if (this.spanStyle != mergedSpanStyle) goto L15;
        if (this.paragraphStyle != mergedParagraphStyle) goto L15;
        return this;
    L15:
        return new TextStyle(mergedSpanStyle, mergedParagraphStyle);
    L5:
        r22 = null;
        goto L6
    }

    /* JADX INFO: renamed from: merge-Z1GrekI$default, reason: not valid java name */
    public static /* synthetic */ TextStyle m6436mergeZ1GrekI$default(TextStyle r30, long r31, long r33, FontWeight r35, FontStyle r36, FontSynthesis r37, FontFamily r38, String r39, long r40, BaselineShift r42, TextGeometricTransform r43, LocaleList r44, long r45, TextDecoration r47, Shadow r48, DrawStyle r49, TextAlign r50, TextDirection r51, long r52, TextIndent r54, LineHeightStyle r55, LineBreak r56, Hyphens r57, PlatformTextStyle r58, TextMotion r59, int r60, Object r61) {
        if ((r60 & 1) == 0) goto L5;
        long r1 = Color.Companion.m4402getUnspecified0d7_KjU();
    L7:
        if ((r60 & 2) == 0) goto L9;
        long r3 = TextUnit.Companion.m7178getUnspecifiedXSAIIZE();
    L11:
        if ((r60 & 4) == 0) goto L13;
        FontWeight r5 = null;
    L15:
        if ((r60 & 8) == 0) goto L17;
        FontStyle r7 = null;
    L19:
        if ((r60 & 16) == 0) goto L21;
        FontSynthesis r8 = null;
    L23:
        if ((r60 & 32) == 0) goto L25;
        FontFamily r9 = null;
    L27:
        if ((r60 & 64) == 0) goto L29;
        String r10 = null;
    L31:
        if ((r60 & 128) == 0) goto L33;
        long r11 = TextUnit.Companion.m7178getUnspecifiedXSAIIZE();
    L35:
        if ((r60 & 256) == 0) goto L37;
        BaselineShift r13 = null;
    L39:
        if ((r60 & 512) == 0) goto L41;
        TextGeometricTransform r14 = null;
    L43:
        if ((r60 & 1024) == 0) goto L45;
        LocaleList r15 = null;
    L47:
        if ((r60 & 2048) == 0) goto L49;
        long r16 = Color.Companion.m4402getUnspecified0d7_KjU();
    L51:
        if ((r60 & 4096) == 0) goto L53;
        TextDecoration r6 = null;
    L54:
        long r18 = r1;
        if ((r60 & 8192) == 0) goto L57;
        Shadow r2 = null;
    L59:
        if ((r60 & 16384) == 0) goto L61;
        DrawStyle r4 = null;
    L63:
        if ((r60 & 32768) == 0) goto L65;
        TextAlign r20 = null;
    L67:
        if ((r60 & 65536) == 0) goto L69;
        TextDirection r21 = null;
    L71:
        if ((r60 & 131072) == 0) goto L73;
        long r22 = TextUnit.Companion.m7178getUnspecifiedXSAIIZE();
    L75:
        if ((r60 & 262144) == 0) goto L77;
        TextIndent r24 = null;
    L79:
        if ((r60 & 524288) == 0) goto L81;
        LineHeightStyle r25 = null;
    L83:
        if ((r60 & 1048576) == 0) goto L85;
        LineBreak r26 = null;
    L87:
        if ((r60 & 2097152) == 0) goto L89;
        Hyphens r27 = null;
    L91:
        if ((r60 & 4194304) == 0) goto L93;
        PlatformTextStyle r28 = null;
    L95:
        if ((r60 & 8388608) == 0) goto L97;
        TextMotion r0 = null;
    L98:
        Shadow r410 = r2;
        DrawStyle r53 = r4;
        long r34 = r3;
        FontWeight r310 = r5;
        TextDecoration r411 = r6;
        FontStyle r311 = r7;
        FontSynthesis r312 = r8;
        FontFamily r313 = r9;
        String r41 = r10;
        long r46 = r11;
        BaselineShift r412 = r13;
        TextGeometricTransform r413 = r14;
        LocaleList r414 = r15;
        long r415 = r16;
        TextAlign r510 = r20;
        TextDirection r511 = r21;
        long r512 = r22;
        TextIndent r513 = r24;
        LineHeightStyle r514 = r25;
        LineBreak r515 = r26;
        Hyphens r516 = r27;
        PlatformTextStyle r517 = r28;
        return r30.m6461mergeZ1GrekI(r18, r34, r310, r311, r312, r313, r41, r46, r412, r413, r414, r415, r411, r410, r53, r510, r511, r512, r513, r514, r515, r516, r517, r0);
    L97:
        r0 = r59;
        goto L98
    L93:
        r28 = r58;
        goto L95
    L89:
        r27 = r57;
        goto L91
    L85:
        r26 = r56;
        goto L87
    L81:
        r25 = r55;
        goto L83
    L77:
        r24 = r54;
        goto L79
    L73:
        r22 = r52;
        goto L75
    L69:
        r21 = r51;
        goto L71
    L65:
        r20 = r50;
        goto L67
    L61:
        r4 = r49;
        goto L63
    L57:
        r2 = r48;
        goto L59
    L53:
        r6 = r47;
        goto L54
    L49:
        r16 = r45;
        goto L51
    L45:
        r15 = r44;
        goto L47
    L41:
        r14 = r43;
        goto L43
    L37:
        r13 = r42;
        goto L39
    L33:
        r11 = r40;
        goto L35
    L29:
        r10 = r39;
        goto L31
    L25:
        r9 = r38;
        goto L27
    L21:
        r8 = r37;
        goto L23
    L17:
        r7 = r36;
        goto L19
    L13:
        r5 = r35;
        goto L15
    L9:
        r3 = r33;
        goto L11
    L5:
        r1 = r31;
        goto L7
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "merge that takes nullable TextAlign, TextDirection, LineBreak, and Hyphens are deprecated. Please use a new constructor where these parameters are non-nullable. Null value has been replaced by a special Unspecified object for performance reason.")
    /* JADX INFO: renamed from: merge-Z1GrekI, reason: not valid java name */
    public final /* synthetic */ TextStyle m6461mergeZ1GrekI(long color, long fontSize, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String fontFeatureSettings, long letterSpacing, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long background, TextDecoration textDecoration, Shadow shadow, DrawStyle drawStyle, TextAlign textAlign, TextDirection textDirection, long lineHeight, TextIndent textIndent, LineHeightStyle lineHeightStyle, LineBreak lineBreak, Hyphens hyphens, PlatformTextStyle platformStyle, TextMotion textMotion) {
        SpanStyle r1 = this.spanStyle;
        PlatformParagraphStyle r24 = null;
        if (platformStyle == null) goto L5;
        PlatformSpanStyle r22 = platformStyle.getSpanStyle();
    L6:
        SpanStyle mergedSpanStyle = SpanStyleKt.m6363fastMergedSHsh3o(r1, color, null, Float.NaN, fontSize, fontWeight, fontStyle, fontSynthesis, fontFamily, fontFeatureSettings, letterSpacing, baselineShift, textGeometricTransform, localeList, background, textDecoration, shadow, r22, drawStyle);
        ParagraphStyle r2 = this.paragraphStyle;
        if (textAlign == null) goto L9;
        int r3 = textAlign.m6834unboximpl();
    L10:
        if (textDirection == null) goto L12;
        int r4 = textDirection.m6848unboximpl();
    L14:
        if (platformStyle == null) goto L16;
        r24 = platformStyle.getParagraphStyle();
    L16:
        PlatformParagraphStyle r8 = r24;
        if (lineBreak == null) goto L19;
        int r5 = lineBreak.m6748unboximpl();
    L20:
        int r10 = r5;
        if (hyphens == null) goto L23;
        int r6 = hyphens.m6732unboximpl();
    L24:
        ParagraphStyle mergedParagraphStyle = ParagraphStyleKt.m6315fastMergej5T8yCg(r2, r3, r4, lineHeight, textIndent, r8, lineHeightStyle, r10, r6, textMotion);
        if (this.spanStyle != mergedSpanStyle) goto L30;
        if (this.paragraphStyle != mergedParagraphStyle) goto L30;
        return this;
    L30:
        return new TextStyle(mergedSpanStyle, mergedParagraphStyle);
    L23:
        r6 = Hyphens.Companion.m6735getUnspecifiedvmbZdU8();
        goto L24
    L19:
        r5 = LineBreak.Companion.m6756getUnspecifiedrAG3T2k();
        goto L20
    L12:
        r4 = TextDirection.Companion.m6854getUnspecifieds_7Xco();
        goto L14
    L9:
        r3 = TextAlign.Companion.m6841getUnspecifiede0LSkKk();
        goto L10
    L5:
        r22 = null;
        goto L6
    }

    public final TextStyle merge(SpanStyle other) {
        return new TextStyle(toSpanStyle().merge(other), toParagraphStyle());
    }

    public final TextStyle merge(ParagraphStyle other) {
        return new TextStyle(toSpanStyle(), toParagraphStyle().merge(other));
    }

    public final TextStyle plus(TextStyle other) {
        return merge(other);
    }

    public final TextStyle plus(ParagraphStyle other) {
        return merge(other);
    }

    public final TextStyle plus(SpanStyle other) {
        return merge(other);
    }

    /* JADX INFO: renamed from: copy-HL5avdY$default, reason: not valid java name */
    public static /* synthetic */ TextStyle m6426copyHL5avdY$default(TextStyle r20, long r21, long r23, FontWeight r25, FontStyle r26, FontSynthesis r27, FontFamily r28, String r29, long r30, BaselineShift r32, TextGeometricTransform r33, LocaleList r34, long r35, TextDecoration r37, Shadow r38, TextAlign r39, TextDirection r40, long r41, TextIndent r43, int r44, Object r45) {
        if ((r44 & 1) == 0) goto L5;
        long r2 = r20.spanStyle.m6358getColor0d7_KjU();
    L7:
        if ((r44 & 2) == 0) goto L9;
        long r4 = r20.spanStyle.m6359getFontSizeXSAIIZE();
    L11:
        if ((r44 & 4) == 0) goto L13;
        FontWeight r6 = r20.spanStyle.getFontWeight();
    L15:
        if ((r44 & 8) == 0) goto L17;
        FontStyle r7 = r20.spanStyle.m6360getFontStyle4Lr2A7w();
    L19:
        if ((r44 & 16) == 0) goto L21;
        FontSynthesis r8 = r20.spanStyle.m6361getFontSynthesisZQGJjVo();
    L23:
        if ((r44 & 32) == 0) goto L25;
        FontFamily r9 = r20.spanStyle.getFontFamily();
    L27:
        if ((r44 & 64) == 0) goto L29;
        String r10 = r20.spanStyle.getFontFeatureSettings();
    L31:
        if ((r44 & 128) == 0) goto L33;
        long r11 = r20.spanStyle.m6362getLetterSpacingXSAIIZE();
    L35:
        if ((r44 & 256) == 0) goto L37;
        BaselineShift r13 = r20.spanStyle.m6357getBaselineShift5SSeXJ0();
    L39:
        if ((r44 & 512) == 0) goto L41;
        TextGeometricTransform r14 = r20.spanStyle.getTextGeometricTransform();
    L43:
        if ((r44 & 1024) == 0) goto L45;
        LocaleList r15 = r20.spanStyle.getLocaleList();
    L46:
        long r16 = r2;
        if ((r44 & 2048) == 0) goto L49;
        long r3 = r20.spanStyle.m6356getBackground0d7_KjU();
    L50:
        long r22 = r3;
        if ((r44 & 4096) == 0) goto L53;
        TextDecoration r5 = r20.spanStyle.getTextDecoration();
    L55:
        if ((r44 & 8192) == 0) goto L57;
        Shadow r12 = r20.spanStyle.getShadow();
    L58:
        TextDecoration r24 = r5;
        if ((r44 & 16384) == 0) goto L61;
        TextAlign r17 = TextAlign.m6828boximpl(r20.paragraphStyle.m6312getTextAligne0LSkKk());
    L63:
        if ((r44 & 32768) == 0) goto L65;
        TextDirection r1 = TextDirection.m6842boximpl(r20.paragraphStyle.m6314getTextDirections_7Xco());
    L67:
        if ((r44 & 65536) == 0) goto L69;
        long r18 = r20.paragraphStyle.m6310getLineHeightXSAIIZE();
    L71:
        if ((r44 & 131072) == 0) goto L73;
        TextIndent r19 = r20.paragraphStyle.getTextIndent();
    L74:
        TextAlign r42 = r17;
        Shadow r310 = r12;
        long r210 = r4;
        FontWeight r211 = r6;
        FontStyle r212 = r7;
        FontSynthesis r213 = r8;
        FontFamily r214 = r9;
        String r31 = r10;
        long r36 = r11;
        BaselineShift r311 = r13;
        TextGeometricTransform r312 = r14;
        LocaleList r313 = r15;
        long r46 = r18;
        return r20.m6439copyHL5avdY(r16, r210, r211, r212, r213, r214, r31, r36, r311, r312, r313, r22, r24, r310, r42, r1, r46, r19);
    L73:
        r19 = r43;
        goto L74
    L69:
        r18 = r41;
        goto L71
    L65:
        r1 = r40;
        goto L67
    L61:
        r17 = r39;
        goto L63
    L57:
        r12 = r38;
        goto L58
    L53:
        r5 = r37;
        goto L55
    L49:
        r3 = r35;
        goto L50
    L45:
        r15 = r34;
        goto L46
    L41:
        r14 = r33;
        goto L43
    L37:
        r13 = r32;
        goto L39
    L33:
        r11 = r30;
        goto L35
    L29:
        r10 = r29;
        goto L31
    L25:
        r9 = r28;
        goto L27
    L21:
        r8 = r27;
        goto L23
    L17:
        r7 = r26;
        goto L19
    L13:
        r6 = r25;
        goto L15
    L9:
        r4 = r23;
        goto L11
    L5:
        r2 = r21;
        goto L7
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "TextStyle copy constructors that do not take new stable parameters like LineHeightStyle, LineBreak, Hyphens are deprecated. Please use the new stable copy constructor.")
    /* JADX INFO: renamed from: copy-HL5avdY, reason: not valid java name */
    public final /* synthetic */ TextStyle m6439copyHL5avdY(long color, long fontSize, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String fontFeatureSettings, long letterSpacing, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long background, TextDecoration textDecoration, Shadow shadow, TextAlign textAlign, TextDirection textDirection, long lineHeight, TextIndent textIndent) {
        if (Color.m4367equalsimpl0(color, this.spanStyle.m6358getColor0d7_KjU()) == false) goto L5;
        TextForegroundStyle r5 = this.spanStyle.getTextForegroundStyle$ui_text_release();
    L6:
        SpanStyle r4 = new SpanStyle(r5, fontSize, fontWeight, fontStyle, fontSynthesis, fontFamily, fontFeatureSettings, letterSpacing, baselineShift, textGeometricTransform, localeList, background, textDecoration, shadow, this.spanStyle.getPlatformStyle(), this.spanStyle.getDrawStyle(), null);
        if (textAlign == null) goto L9;
        int r6 = textAlign.m6834unboximpl();
    L10:
        if (textDirection == null) goto L12;
        int r7 = textDirection.m6848unboximpl();
    L14:
        return new TextStyle(r4, new ParagraphStyle(r6, r7, lineHeight, textIndent, this.paragraphStyle.getPlatformStyle(), getLineHeightStyle(), m6455getLineBreakrAG3T2k(), m6452getHyphensvmbZdU8(), getTextMotion(), null), this.platformStyle);
    L12:
        r7 = TextDirection.Companion.m6854getUnspecifieds_7Xco();
        goto L14
    L9:
        r6 = TextAlign.Companion.m6841getUnspecifiede0LSkKk();
        goto L10
    L5:
        r5 = TextForegroundStyle.Companion.m6856from8_81llA(color);
        goto L6
    }

    /* JADX INFO: renamed from: copy-NOaFTUo$default, reason: not valid java name */
    public static /* synthetic */ TextStyle m6427copyNOaFTUo$default(TextStyle r21, long r22, long r24, FontWeight r26, FontStyle r27, FontSynthesis r28, FontFamily r29, String r30, long r31, BaselineShift r33, TextGeometricTransform r34, LocaleList r35, long r36, TextDecoration r38, Shadow r39, TextAlign r40, TextDirection r41, long r42, TextIndent r44, PlatformTextStyle r45, LineHeightStyle r46, int r47, Object r48) {
        if ((r47 & 1) == 0) goto L5;
        long r2 = r21.spanStyle.m6358getColor0d7_KjU();
    L7:
        if ((r47 & 2) == 0) goto L9;
        long r4 = r21.spanStyle.m6359getFontSizeXSAIIZE();
    L11:
        if ((r47 & 4) == 0) goto L13;
        FontWeight r6 = r21.spanStyle.getFontWeight();
    L15:
        if ((r47 & 8) == 0) goto L17;
        FontStyle r7 = r21.spanStyle.m6360getFontStyle4Lr2A7w();
    L19:
        if ((r47 & 16) == 0) goto L21;
        FontSynthesis r8 = r21.spanStyle.m6361getFontSynthesisZQGJjVo();
    L23:
        if ((r47 & 32) == 0) goto L25;
        FontFamily r9 = r21.spanStyle.getFontFamily();
    L27:
        if ((r47 & 64) == 0) goto L29;
        String r10 = r21.spanStyle.getFontFeatureSettings();
    L31:
        if ((r47 & 128) == 0) goto L33;
        long r11 = r21.spanStyle.m6362getLetterSpacingXSAIIZE();
    L35:
        if ((r47 & 256) == 0) goto L37;
        BaselineShift r13 = r21.spanStyle.m6357getBaselineShift5SSeXJ0();
    L39:
        if ((r47 & 512) == 0) goto L41;
        TextGeometricTransform r14 = r21.spanStyle.getTextGeometricTransform();
    L43:
        if ((r47 & 1024) == 0) goto L45;
        LocaleList r15 = r21.spanStyle.getLocaleList();
    L46:
        long r16 = r2;
        if ((r47 & 2048) == 0) goto L49;
        long r3 = r21.spanStyle.m6356getBackground0d7_KjU();
    L50:
        long r23 = r3;
        if ((r47 & 4096) == 0) goto L53;
        TextDecoration r5 = r21.spanStyle.getTextDecoration();
    L55:
        if ((r47 & 8192) == 0) goto L57;
        Shadow r12 = r21.spanStyle.getShadow();
    L58:
        TextDecoration r25 = r5;
        if ((r47 & 16384) == 0) goto L61;
        TextAlign r17 = TextAlign.m6828boximpl(r21.paragraphStyle.m6312getTextAligne0LSkKk());
    L63:
        if ((r47 & 32768) == 0) goto L65;
        TextDirection r1 = TextDirection.m6842boximpl(r21.paragraphStyle.m6314getTextDirections_7Xco());
    L67:
        if ((r47 & 65536) == 0) goto L69;
        long r18 = r21.paragraphStyle.m6310getLineHeightXSAIIZE();
    L71:
        if ((r47 & 131072) == 0) goto L73;
        TextIndent r19 = r21.paragraphStyle.getTextIndent();
    L75:
        if ((r47 & 262144) == 0) goto L77;
        PlatformTextStyle r20 = r21.platformStyle;
    L79:
        if ((r47 & 524288) == 0) goto L81;
        LineHeightStyle r32 = r21.paragraphStyle.getLineHeightStyle();
    L82:
        TextAlign r43 = r17;
        Shadow r49 = r12;
        long r210 = r4;
        FontWeight r211 = r6;
        FontStyle r212 = r7;
        FontSynthesis r213 = r8;
        FontFamily r37 = r9;
        String r310 = r10;
        long r311 = r11;
        BaselineShift r312 = r13;
        TextGeometricTransform r313 = r14;
        LocaleList r314 = r15;
        long r410 = r18;
        return r21.m6440copyNOaFTUo(r16, r210, r211, r212, r213, r37, r310, r311, r312, r313, r314, r23, r25, r49, r43, r1, r410, r19, r20, r32);
    L81:
        r32 = r46;
        goto L82
    L77:
        r20 = r45;
        goto L79
    L73:
        r19 = r44;
        goto L75
    L69:
        r18 = r42;
        goto L71
    L65:
        r1 = r41;
        goto L67
    L61:
        r17 = r40;
        goto L63
    L57:
        r12 = r39;
        goto L58
    L53:
        r5 = r38;
        goto L55
    L49:
        r3 = r36;
        goto L50
    L45:
        r15 = r35;
        goto L46
    L41:
        r14 = r34;
        goto L43
    L37:
        r13 = r33;
        goto L39
    L33:
        r11 = r31;
        goto L35
    L29:
        r10 = r30;
        goto L31
    L25:
        r9 = r29;
        goto L27
    L21:
        r8 = r28;
        goto L23
    L17:
        r7 = r27;
        goto L19
    L13:
        r6 = r26;
        goto L15
    L9:
        r4 = r24;
        goto L11
    L5:
        r2 = r22;
        goto L7
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "TextStyle copy constructors that do not take new stable parameters like LineHeightStyle, LineBreak, Hyphens are deprecated. Please use the new stable copy constructor.")
    /* JADX INFO: renamed from: copy-NOaFTUo, reason: not valid java name */
    public final /* synthetic */ TextStyle m6440copyNOaFTUo(long color, long fontSize, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String fontFeatureSettings, long letterSpacing, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long background, TextDecoration textDecoration, Shadow shadow, TextAlign textAlign, TextDirection textDirection, long lineHeight, TextIndent textIndent, PlatformTextStyle platformStyle, LineHeightStyle lineHeightStyle) {
        if (Color.m4367equalsimpl0(color, this.spanStyle.m6358getColor0d7_KjU()) == false) goto L5;
        TextForegroundStyle r6 = this.spanStyle.getTextForegroundStyle$ui_text_release();
    L6:
        PlatformParagraphStyle r26 = null;
        if (platformStyle == null) goto L9;
        PlatformSpanStyle r23 = platformStyle.getSpanStyle();
    L10:
        SpanStyle r5 = new SpanStyle(r6, fontSize, fontWeight, fontStyle, fontSynthesis, fontFamily, fontFeatureSettings, letterSpacing, baselineShift, textGeometricTransform, localeList, background, textDecoration, shadow, r23, this.spanStyle.getDrawStyle(), null);
        if (textAlign == null) goto L13;
        int r7 = textAlign.m6834unboximpl();
    L14:
        if (textDirection == null) goto L16;
        int r8 = textDirection.m6848unboximpl();
    L18:
        if (platformStyle == null) goto L21;
        r26 = platformStyle.getParagraphStyle();
    L21:
        return new TextStyle(r5, new ParagraphStyle(r7, r8, lineHeight, textIndent, r26, lineHeightStyle, m6455getLineBreakrAG3T2k(), m6452getHyphensvmbZdU8(), getTextMotion(), null), platformStyle);
    L16:
        r8 = TextDirection.Companion.m6854getUnspecifieds_7Xco();
        goto L18
    L13:
        r7 = TextAlign.Companion.m6841getUnspecifiede0LSkKk();
        goto L14
    L9:
        r23 = null;
        goto L10
    L5:
        r6 = TextForegroundStyle.Companion.m6856from8_81llA(color);
        goto L6
    }

    /* JADX INFO: renamed from: copy-CXVQc50$default, reason: not valid java name */
    public static /* synthetic */ TextStyle m6425copyCXVQc50$default(TextStyle r21, long r22, long r24, FontWeight r26, FontStyle r27, FontSynthesis r28, FontFamily r29, String r30, long r31, BaselineShift r33, TextGeometricTransform r34, LocaleList r35, long r36, TextDecoration r38, Shadow r39, TextAlign r40, TextDirection r41, long r42, TextIndent r44, PlatformTextStyle r45, LineHeightStyle r46, LineBreak r47, Hyphens r48, int r49, Object r50) {
        if ((r49 & 1) == 0) goto L5;
        long r2 = r21.spanStyle.m6358getColor0d7_KjU();
    L7:
        if ((r49 & 2) == 0) goto L9;
        long r4 = r21.spanStyle.m6359getFontSizeXSAIIZE();
    L11:
        if ((r49 & 4) == 0) goto L13;
        FontWeight r6 = r21.spanStyle.getFontWeight();
    L15:
        if ((r49 & 8) == 0) goto L17;
        FontStyle r7 = r21.spanStyle.m6360getFontStyle4Lr2A7w();
    L19:
        if ((r49 & 16) == 0) goto L21;
        FontSynthesis r8 = r21.spanStyle.m6361getFontSynthesisZQGJjVo();
    L23:
        if ((r49 & 32) == 0) goto L25;
        FontFamily r9 = r21.spanStyle.getFontFamily();
    L27:
        if ((r49 & 64) == 0) goto L29;
        String r10 = r21.spanStyle.getFontFeatureSettings();
    L31:
        if ((r49 & 128) == 0) goto L33;
        long r11 = r21.spanStyle.m6362getLetterSpacingXSAIIZE();
    L35:
        if ((r49 & 256) == 0) goto L37;
        BaselineShift r13 = r21.spanStyle.m6357getBaselineShift5SSeXJ0();
    L39:
        if ((r49 & 512) == 0) goto L41;
        TextGeometricTransform r14 = r21.spanStyle.getTextGeometricTransform();
    L43:
        if ((r49 & 1024) == 0) goto L45;
        LocaleList r15 = r21.spanStyle.getLocaleList();
    L46:
        long r16 = r2;
        if ((r49 & 2048) == 0) goto L49;
        long r3 = r21.spanStyle.m6356getBackground0d7_KjU();
    L50:
        long r23 = r3;
        if ((r49 & 4096) == 0) goto L53;
        TextDecoration r5 = r21.spanStyle.getTextDecoration();
    L55:
        if ((r49 & 8192) == 0) goto L57;
        Shadow r12 = r21.spanStyle.getShadow();
    L58:
        TextDecoration r25 = r5;
        if ((r49 & 16384) == 0) goto L61;
        TextAlign r17 = TextAlign.m6828boximpl(r21.paragraphStyle.m6312getTextAligne0LSkKk());
    L63:
        if ((r49 & 32768) == 0) goto L65;
        TextDirection r1 = TextDirection.m6842boximpl(r21.paragraphStyle.m6314getTextDirections_7Xco());
    L67:
        if ((r49 & 65536) == 0) goto L69;
        long r18 = r21.paragraphStyle.m6310getLineHeightXSAIIZE();
    L71:
        if ((r49 & 131072) == 0) goto L73;
        TextIndent r19 = r21.paragraphStyle.getTextIndent();
    L75:
        if ((r49 & 262144) == 0) goto L77;
        PlatformTextStyle r20 = r21.platformStyle;
    L79:
        if ((r49 & 524288) == 0) goto L81;
        LineHeightStyle r32 = r21.paragraphStyle.getLineHeightStyle();
    L83:
        if ((r49 & 1048576) == 0) goto L85;
        LineBreak r37 = LineBreak.m6736boximpl(r21.paragraphStyle.m6309getLineBreakrAG3T2k());
    L87:
        if ((r49 & 2097152) == 0) goto L89;
        Hyphens r43 = Hyphens.m6726boximpl(r21.paragraphStyle.m6307getHyphensvmbZdU8());
    L90:
        TextAlign r410 = r17;
        Shadow r411 = r12;
        long r210 = r4;
        FontWeight r211 = r6;
        FontStyle r212 = r7;
        FontSynthesis r213 = r8;
        FontFamily r310 = r9;
        String r311 = r10;
        long r312 = r11;
        BaselineShift r313 = r13;
        TextGeometricTransform r314 = r14;
        LocaleList r315 = r15;
        long r412 = r18;
        return r21.m6438copyCXVQc50(r16, r210, r211, r212, r213, r310, r311, r312, r313, r314, r315, r23, r25, r411, r410, r1, r412, r19, r20, r32, r37, r43);
    L89:
        r43 = r48;
        goto L90
    L85:
        r37 = r47;
        goto L87
    L81:
        r32 = r46;
        goto L83
    L77:
        r20 = r45;
        goto L79
    L73:
        r19 = r44;
        goto L75
    L69:
        r18 = r42;
        goto L71
    L65:
        r1 = r41;
        goto L67
    L61:
        r17 = r40;
        goto L63
    L57:
        r12 = r39;
        goto L58
    L53:
        r5 = r38;
        goto L55
    L49:
        r3 = r36;
        goto L50
    L45:
        r15 = r35;
        goto L46
    L41:
        r14 = r34;
        goto L43
    L37:
        r13 = r33;
        goto L39
    L33:
        r11 = r31;
        goto L35
    L29:
        r10 = r30;
        goto L31
    L25:
        r9 = r29;
        goto L27
    L21:
        r8 = r28;
        goto L23
    L17:
        r7 = r27;
        goto L19
    L13:
        r6 = r26;
        goto L15
    L9:
        r4 = r24;
        goto L11
    L5:
        r2 = r22;
        goto L7
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "TextStyle copy constructors that do not take new stable parameters like LineBreak, Hyphens, and TextMotion are deprecated. Please use the new stable copy constructor.")
    /* JADX INFO: renamed from: copy-CXVQc50, reason: not valid java name */
    public final /* synthetic */ TextStyle m6438copyCXVQc50(long color, long fontSize, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String fontFeatureSettings, long letterSpacing, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long background, TextDecoration textDecoration, Shadow shadow, TextAlign textAlign, TextDirection textDirection, long lineHeight, TextIndent textIndent, PlatformTextStyle platformStyle, LineHeightStyle lineHeightStyle, LineBreak lineBreak, Hyphens hyphens) {
        if (Color.m4367equalsimpl0(color, this.spanStyle.m6358getColor0d7_KjU()) == false) goto L5;
        TextForegroundStyle r6 = this.spanStyle.getTextForegroundStyle$ui_text_release();
    L6:
        PlatformParagraphStyle r26 = null;
        if (platformStyle == null) goto L9;
        PlatformSpanStyle r23 = platformStyle.getSpanStyle();
    L10:
        SpanStyle r5 = new SpanStyle(r6, fontSize, fontWeight, fontStyle, fontSynthesis, fontFamily, fontFeatureSettings, letterSpacing, baselineShift, textGeometricTransform, localeList, background, textDecoration, shadow, r23, getDrawStyle(), null);
        if (textAlign == null) goto L13;
        int r7 = textAlign.m6834unboximpl();
    L14:
        if (textDirection == null) goto L16;
        int r8 = textDirection.m6848unboximpl();
    L18:
        if (platformStyle == null) goto L20;
        r26 = platformStyle.getParagraphStyle();
    L20:
        PlatformParagraphStyle r12 = r26;
        if (lineBreak == null) goto L23;
        int r9 = lineBreak.m6748unboximpl();
    L24:
        int r14 = r9;
        if (hyphens == null) goto L27;
        int r10 = hyphens.m6732unboximpl();
    L29:
        return new TextStyle(r5, new ParagraphStyle(r7, r8, lineHeight, textIndent, r12, lineHeightStyle, r14, r10, getTextMotion(), null), platformStyle);
    L27:
        r10 = Hyphens.Companion.m6735getUnspecifiedvmbZdU8();
        goto L29
    L23:
        r9 = LineBreak.Companion.m6756getUnspecifiedrAG3T2k();
        goto L24
    L16:
        r8 = TextDirection.Companion.m6854getUnspecifieds_7Xco();
        goto L18
    L13:
        r7 = TextAlign.Companion.m6841getUnspecifiede0LSkKk();
        goto L14
    L9:
        r23 = null;
        goto L10
    L5:
        r6 = TextForegroundStyle.Companion.m6856from8_81llA(color);
        goto L6
    }

    /* JADX INFO: renamed from: copy-v2rsoow$default, reason: not valid java name */
    public static /* synthetic */ TextStyle m6431copyv2rsoow$default(TextStyle r21, long r22, long r24, FontWeight r26, FontStyle r27, FontSynthesis r28, FontFamily r29, String r30, long r31, BaselineShift r33, TextGeometricTransform r34, LocaleList r35, long r36, TextDecoration r38, Shadow r39, DrawStyle r40, TextAlign r41, TextDirection r42, long r43, TextIndent r45, PlatformTextStyle r46, LineHeightStyle r47, LineBreak r48, Hyphens r49, TextMotion r50, int r51, Object r52) {
        if ((r51 & 1) == 0) goto L5;
        long r2 = r21.spanStyle.m6358getColor0d7_KjU();
    L7:
        if ((r51 & 2) == 0) goto L9;
        long r4 = r21.spanStyle.m6359getFontSizeXSAIIZE();
    L11:
        if ((r51 & 4) == 0) goto L13;
        FontWeight r6 = r21.spanStyle.getFontWeight();
    L15:
        if ((r51 & 8) == 0) goto L17;
        FontStyle r7 = r21.spanStyle.m6360getFontStyle4Lr2A7w();
    L19:
        if ((r51 & 16) == 0) goto L21;
        FontSynthesis r8 = r21.spanStyle.m6361getFontSynthesisZQGJjVo();
    L23:
        if ((r51 & 32) == 0) goto L25;
        FontFamily r9 = r21.spanStyle.getFontFamily();
    L27:
        if ((r51 & 64) == 0) goto L29;
        String r10 = r21.spanStyle.getFontFeatureSettings();
    L31:
        if ((r51 & 128) == 0) goto L33;
        long r11 = r21.spanStyle.m6362getLetterSpacingXSAIIZE();
    L35:
        if ((r51 & 256) == 0) goto L37;
        BaselineShift r13 = r21.spanStyle.m6357getBaselineShift5SSeXJ0();
    L39:
        if ((r51 & 512) == 0) goto L41;
        TextGeometricTransform r14 = r21.spanStyle.getTextGeometricTransform();
    L43:
        if ((r51 & 1024) == 0) goto L45;
        LocaleList r15 = r21.spanStyle.getLocaleList();
    L46:
        long r16 = r2;
        if ((r51 & 2048) == 0) goto L49;
        long r3 = r21.spanStyle.m6356getBackground0d7_KjU();
    L50:
        long r23 = r3;
        if ((r51 & 4096) == 0) goto L53;
        TextDecoration r5 = r21.spanStyle.getTextDecoration();
    L55:
        if ((r51 & 8192) == 0) goto L57;
        Shadow r12 = r21.spanStyle.getShadow();
    L58:
        TextDecoration r25 = r5;
        if ((r51 & 16384) == 0) goto L61;
        DrawStyle r17 = r21.spanStyle.getDrawStyle();
    L63:
        if ((r51 & 32768) == 0) goto L65;
        TextAlign r1 = TextAlign.m6828boximpl(r21.paragraphStyle.m6312getTextAligne0LSkKk());
    L67:
        if ((r51 & 65536) == 0) goto L69;
        TextDirection r18 = TextDirection.m6842boximpl(r21.paragraphStyle.m6314getTextDirections_7Xco());
    L71:
        if ((r51 & 131072) == 0) goto L73;
        long r19 = r21.paragraphStyle.m6310getLineHeightXSAIIZE();
    L75:
        if ((r51 & 262144) == 0) goto L77;
        TextIndent r20 = r21.paragraphStyle.getTextIndent();
    L79:
        if ((r51 & 524288) == 0) goto L81;
        PlatformTextStyle r32 = r21.platformStyle;
    L83:
        if ((r51 & 1048576) == 0) goto L85;
        LineHeightStyle r37 = r21.paragraphStyle.getLineHeightStyle();
    L87:
        if ((r51 & 2097152) == 0) goto L89;
        LineBreak r44 = LineBreak.m6736boximpl(r21.paragraphStyle.m6309getLineBreakrAG3T2k());
    L91:
        if ((r51 & 4194304) == 0) goto L93;
        Hyphens r53 = Hyphens.m6726boximpl(r21.paragraphStyle.m6307getHyphensvmbZdU8());
    L95:
        if ((r51 & 8388608) == 0) goto L97;
        TextMotion r54 = r21.paragraphStyle.getTextMotion();
    L98:
        DrawStyle r410 = r17;
        Shadow r411 = r12;
        long r210 = r4;
        FontWeight r211 = r6;
        FontStyle r212 = r7;
        FontSynthesis r213 = r8;
        FontFamily r310 = r9;
        String r311 = r10;
        long r312 = r11;
        BaselineShift r313 = r13;
        TextGeometricTransform r314 = r14;
        LocaleList r315 = r15;
        long r412 = r19;
        return r21.m6444copyv2rsoow(r16, r210, r211, r212, r213, r310, r311, r312, r313, r314, r315, r23, r25, r411, r410, r1, r18, r412, r20, r32, r37, r44, r53, r54);
    L97:
        r54 = r50;
        goto L98
    L93:
        r53 = r49;
        goto L95
    L89:
        r44 = r48;
        goto L91
    L85:
        r37 = r47;
        goto L87
    L81:
        r32 = r46;
        goto L83
    L77:
        r20 = r45;
        goto L79
    L73:
        r19 = r43;
        goto L75
    L69:
        r18 = r42;
        goto L71
    L65:
        r1 = r41;
        goto L67
    L61:
        r17 = r40;
        goto L63
    L57:
        r12 = r39;
        goto L58
    L53:
        r5 = r38;
        goto L55
    L49:
        r3 = r36;
        goto L50
    L45:
        r15 = r35;
        goto L46
    L41:
        r14 = r34;
        goto L43
    L37:
        r13 = r33;
        goto L39
    L33:
        r11 = r31;
        goto L35
    L29:
        r10 = r30;
        goto L31
    L25:
        r9 = r29;
        goto L27
    L21:
        r8 = r28;
        goto L23
    L17:
        r7 = r27;
        goto L19
    L13:
        r6 = r26;
        goto L15
    L9:
        r4 = r24;
        goto L11
    L5:
        r2 = r22;
        goto L7
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "copy constructors that take nullable TextAlign, TextDirection, LineBreak, and Hyphens are deprecated. Please use a new constructor where these parameters are non-nullable. Null value has been replaced by a special Unspecified object for performance reason.")
    /* JADX INFO: renamed from: copy-v2rsoow, reason: not valid java name */
    public final /* synthetic */ TextStyle m6444copyv2rsoow(long color, long fontSize, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String fontFeatureSettings, long letterSpacing, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long background, TextDecoration textDecoration, Shadow shadow, DrawStyle drawStyle, TextAlign textAlign, TextDirection textDirection, long lineHeight, TextIndent textIndent, PlatformTextStyle platformStyle, LineHeightStyle lineHeightStyle, LineBreak lineBreak, Hyphens hyphens, TextMotion textMotion) {
        if (Color.m4367equalsimpl0(color, this.spanStyle.m6358getColor0d7_KjU()) == false) goto L5;
        TextForegroundStyle r6 = this.spanStyle.getTextForegroundStyle$ui_text_release();
    L6:
        PlatformParagraphStyle r26 = null;
        if (platformStyle == null) goto L9;
        PlatformSpanStyle r23 = platformStyle.getSpanStyle();
    L10:
        SpanStyle r5 = new SpanStyle(r6, fontSize, fontWeight, fontStyle, fontSynthesis, fontFamily, fontFeatureSettings, letterSpacing, baselineShift, textGeometricTransform, localeList, background, textDecoration, shadow, r23, drawStyle, null);
        if (textAlign == null) goto L13;
        int r7 = textAlign.m6834unboximpl();
    L14:
        if (textDirection == null) goto L16;
        int r8 = textDirection.m6848unboximpl();
    L18:
        if (platformStyle == null) goto L20;
        r26 = platformStyle.getParagraphStyle();
    L20:
        PlatformParagraphStyle r12 = r26;
        if (lineBreak == null) goto L23;
        int r9 = lineBreak.m6748unboximpl();
    L24:
        int r14 = r9;
        if (hyphens == null) goto L27;
        int r10 = hyphens.m6732unboximpl();
    L29:
        return new TextStyle(r5, new ParagraphStyle(r7, r8, lineHeight, textIndent, r12, lineHeightStyle, r14, r10, textMotion, null), platformStyle);
    L27:
        r10 = Hyphens.Companion.m6735getUnspecifiedvmbZdU8();
        goto L29
    L23:
        r9 = LineBreak.Companion.m6756getUnspecifiedrAG3T2k();
        goto L24
    L16:
        r8 = TextDirection.Companion.m6854getUnspecifieds_7Xco();
        goto L18
    L13:
        r7 = TextAlign.Companion.m6841getUnspecifiede0LSkKk();
        goto L14
    L9:
        r23 = null;
        goto L10
    L5:
        r6 = TextForegroundStyle.Companion.m6856from8_81llA(color);
        goto L6
    }

    /* JADX INFO: renamed from: copy-p1EtxEg$default, reason: not valid java name */
    public static /* synthetic */ TextStyle m6430copyp1EtxEg$default(TextStyle r21, long r22, long r24, FontWeight r26, FontStyle r27, FontSynthesis r28, FontFamily r29, String r30, long r31, BaselineShift r33, TextGeometricTransform r34, LocaleList r35, long r36, TextDecoration r38, Shadow r39, DrawStyle r40, int r41, int r42, long r43, TextIndent r45, PlatformTextStyle r46, LineHeightStyle r47, int r48, int r49, TextMotion r50, int r51, Object r52) {
        if ((r51 & 1) == 0) goto L5;
        long r2 = r21.spanStyle.m6358getColor0d7_KjU();
    L7:
        if ((r51 & 2) == 0) goto L9;
        long r4 = r21.spanStyle.m6359getFontSizeXSAIIZE();
    L11:
        if ((r51 & 4) == 0) goto L13;
        FontWeight r6 = r21.spanStyle.getFontWeight();
    L15:
        if ((r51 & 8) == 0) goto L17;
        FontStyle r7 = r21.spanStyle.m6360getFontStyle4Lr2A7w();
    L19:
        if ((r51 & 16) == 0) goto L21;
        FontSynthesis r8 = r21.spanStyle.m6361getFontSynthesisZQGJjVo();
    L23:
        if ((r51 & 32) == 0) goto L25;
        FontFamily r9 = r21.spanStyle.getFontFamily();
    L27:
        if ((r51 & 64) == 0) goto L29;
        String r10 = r21.spanStyle.getFontFeatureSettings();
    L31:
        if ((r51 & 128) == 0) goto L33;
        long r11 = r21.spanStyle.m6362getLetterSpacingXSAIIZE();
    L35:
        if ((r51 & 256) == 0) goto L37;
        BaselineShift r13 = r21.spanStyle.m6357getBaselineShift5SSeXJ0();
    L39:
        if ((r51 & 512) == 0) goto L41;
        TextGeometricTransform r14 = r21.spanStyle.getTextGeometricTransform();
    L43:
        if ((r51 & 1024) == 0) goto L45;
        LocaleList r15 = r21.spanStyle.getLocaleList();
    L46:
        long r16 = r2;
        if ((r51 & 2048) == 0) goto L49;
        long r3 = r21.spanStyle.m6356getBackground0d7_KjU();
    L50:
        long r23 = r3;
        if ((r51 & 4096) == 0) goto L53;
        TextDecoration r5 = r21.spanStyle.getTextDecoration();
    L55:
        if ((r51 & 8192) == 0) goto L57;
        Shadow r12 = r21.spanStyle.getShadow();
    L58:
        TextDecoration r25 = r5;
        if ((r51 & 16384) == 0) goto L61;
        DrawStyle r17 = r21.spanStyle.getDrawStyle();
    L63:
        if ((r51 & 32768) == 0) goto L65;
        int r1 = r21.paragraphStyle.m6312getTextAligne0LSkKk();
    L67:
        if ((r51 & 65536) == 0) goto L69;
        int r18 = r21.paragraphStyle.m6314getTextDirections_7Xco();
    L71:
        if ((r51 & 131072) == 0) goto L73;
        long r19 = r21.paragraphStyle.m6310getLineHeightXSAIIZE();
    L75:
        if ((r51 & 262144) == 0) goto L77;
        TextIndent r20 = r21.paragraphStyle.getTextIndent();
    L79:
        if ((r51 & 524288) == 0) goto L81;
        PlatformTextStyle r32 = r21.platformStyle;
    L83:
        if ((r51 & 1048576) == 0) goto L85;
        LineHeightStyle r37 = r21.paragraphStyle.getLineHeightStyle();
    L87:
        if ((r51 & 2097152) == 0) goto L89;
        int r44 = r21.paragraphStyle.m6309getLineBreakrAG3T2k();
    L91:
        if ((r51 & 4194304) == 0) goto L93;
        int r53 = r21.paragraphStyle.m6307getHyphensvmbZdU8();
    L95:
        if ((r51 & 8388608) == 0) goto L97;
        TextMotion r54 = r21.paragraphStyle.getTextMotion();
    L98:
        DrawStyle r410 = r17;
        Shadow r411 = r12;
        long r210 = r4;
        FontWeight r211 = r6;
        FontStyle r212 = r7;
        FontSynthesis r213 = r8;
        FontFamily r310 = r9;
        String r311 = r10;
        long r312 = r11;
        BaselineShift r313 = r13;
        TextGeometricTransform r314 = r14;
        LocaleList r315 = r15;
        long r412 = r19;
        return r21.m6443copyp1EtxEg(r16, r210, r211, r212, r213, r310, r311, r312, r313, r314, r315, r23, r25, r411, r410, r1, r18, r412, r20, r32, r37, r44, r53, r54);
    L97:
        r54 = r50;
        goto L98
    L93:
        r53 = r49;
        goto L95
    L89:
        r44 = r48;
        goto L91
    L85:
        r37 = r47;
        goto L87
    L81:
        r32 = r46;
        goto L83
    L77:
        r20 = r45;
        goto L79
    L73:
        r19 = r43;
        goto L75
    L69:
        r18 = r42;
        goto L71
    L65:
        r1 = r41;
        goto L67
    L61:
        r17 = r40;
        goto L63
    L57:
        r12 = r39;
        goto L58
    L53:
        r5 = r38;
        goto L55
    L49:
        r3 = r36;
        goto L50
    L45:
        r15 = r35;
        goto L46
    L41:
        r14 = r34;
        goto L43
    L37:
        r13 = r33;
        goto L39
    L33:
        r11 = r31;
        goto L35
    L29:
        r10 = r30;
        goto L31
    L25:
        r9 = r29;
        goto L27
    L21:
        r8 = r28;
        goto L23
    L17:
        r7 = r27;
        goto L19
    L13:
        r6 = r26;
        goto L15
    L9:
        r4 = r24;
        goto L11
    L5:
        r2 = r22;
        goto L7
    }

    /* JADX INFO: renamed from: copy-p1EtxEg, reason: not valid java name */
    public final TextStyle m6443copyp1EtxEg(long color, long fontSize, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String fontFeatureSettings, long letterSpacing, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long background, TextDecoration textDecoration, Shadow shadow, DrawStyle drawStyle, int textAlign, int textDirection, long lineHeight, TextIndent textIndent, PlatformTextStyle platformStyle, LineHeightStyle lineHeightStyle, int lineBreak, int hyphens, TextMotion textMotion) {
        if (Color.m4367equalsimpl0(color, this.spanStyle.m6358getColor0d7_KjU()) == false) goto L5;
        TextForegroundStyle r6 = this.spanStyle.getTextForegroundStyle$ui_text_release();
    L6:
        PlatformParagraphStyle r26 = null;
        if (platformStyle == null) goto L9;
        PlatformSpanStyle r23 = platformStyle.getSpanStyle();
    L10:
        SpanStyle r5 = new SpanStyle(r6, fontSize, fontWeight, fontStyle, fontSynthesis, fontFamily, fontFeatureSettings, letterSpacing, baselineShift, textGeometricTransform, localeList, background, textDecoration, shadow, r23, drawStyle, null);
        if (platformStyle == null) goto L14;
        r26 = platformStyle.getParagraphStyle();
    L14:
        return new TextStyle(r5, new ParagraphStyle(textAlign, textDirection, lineHeight, textIndent, r26, lineHeightStyle, lineBreak, hyphens, textMotion, null), platformStyle);
    L9:
        r23 = null;
        goto L10
    L5:
        r6 = TextForegroundStyle.Companion.m6856from8_81llA(color);
        goto L6
    }

    /* JADX INFO: renamed from: copy-aIRg9q4$default, reason: not valid java name */
    public static /* synthetic */ TextStyle m6429copyaIRg9q4$default(TextStyle r20, Brush r21, float r22, long r23, FontWeight r25, FontStyle r26, FontSynthesis r27, FontFamily r28, String r29, long r30, BaselineShift r32, TextGeometricTransform r33, LocaleList r34, long r35, TextDecoration r37, Shadow r38, DrawStyle r39, TextAlign r40, TextDirection r41, long r42, TextIndent r44, PlatformTextStyle r45, LineHeightStyle r46, LineBreak r47, Hyphens r48, TextMotion r49, int r50, Object r51) {
        if ((r50 & 2) == 0) goto L5;
        float r2 = r20.spanStyle.getAlpha();
    L7:
        if ((r50 & 4) == 0) goto L9;
        long r3 = r20.spanStyle.m6359getFontSizeXSAIIZE();
    L11:
        if ((r50 & 8) == 0) goto L13;
        FontWeight r5 = r20.spanStyle.getFontWeight();
    L15:
        if ((r50 & 16) == 0) goto L17;
        FontStyle r6 = r20.spanStyle.m6360getFontStyle4Lr2A7w();
    L19:
        if ((r50 & 32) == 0) goto L21;
        FontSynthesis r7 = r20.spanStyle.m6361getFontSynthesisZQGJjVo();
    L23:
        if ((r50 & 64) == 0) goto L25;
        FontFamily r8 = r20.spanStyle.getFontFamily();
    L27:
        if ((r50 & 128) == 0) goto L29;
        String r9 = r20.spanStyle.getFontFeatureSettings();
    L31:
        if ((r50 & 256) == 0) goto L33;
        long r10 = r20.spanStyle.m6362getLetterSpacingXSAIIZE();
    L35:
        if ((r50 & 512) == 0) goto L37;
        BaselineShift r12 = r20.spanStyle.m6357getBaselineShift5SSeXJ0();
    L39:
        if ((r50 & 1024) == 0) goto L41;
        TextGeometricTransform r13 = r20.spanStyle.getTextGeometricTransform();
    L43:
        if ((r50 & 2048) == 0) goto L45;
        LocaleList r14 = r20.spanStyle.getLocaleList();
    L47:
        if ((r50 & 4096) == 0) goto L49;
        long r15 = r20.spanStyle.m6356getBackground0d7_KjU();
    L50:
        float r24 = r2;
        if ((r50 & 8192) == 0) goto L53;
        TextDecoration r4 = r20.spanStyle.getTextDecoration();
    L54:
        TextDecoration r210 = r4;
        if ((r50 & 16384) == 0) goto L57;
        Shadow r11 = r20.spanStyle.getShadow();
    L59:
        if ((r50 & 32768) == 0) goto L61;
        DrawStyle r1 = r20.spanStyle.getDrawStyle();
    L63:
        if ((r50 & 65536) == 0) goto L65;
        TextAlign r16 = TextAlign.m6828boximpl(r20.paragraphStyle.m6312getTextAligne0LSkKk());
    L67:
        if ((r50 & 131072) == 0) goto L69;
        TextDirection r17 = TextDirection.m6842boximpl(r20.paragraphStyle.m6314getTextDirections_7Xco());
    L71:
        if ((r50 & 262144) == 0) goto L73;
        long r18 = r20.paragraphStyle.m6310getLineHeightXSAIIZE();
    L75:
        if ((r50 & 524288) == 0) goto L77;
        TextIndent r19 = r20.paragraphStyle.getTextIndent();
    L79:
        if ((r50 & 1048576) == 0) goto L81;
        PlatformTextStyle r31 = r20.platformStyle;
    L83:
        if ((r50 & 2097152) == 0) goto L85;
        LineHeightStyle r36 = r20.paragraphStyle.getLineHeightStyle();
    L87:
        if ((r50 & 4194304) == 0) goto L89;
        LineBreak r43 = LineBreak.m6736boximpl(r20.paragraphStyle.m6309getLineBreakrAG3T2k());
    L91:
        if ((r50 & 8388608) == 0) goto L93;
        Hyphens r52 = Hyphens.m6726boximpl(r20.paragraphStyle.m6307getHyphensvmbZdU8());
    L95:
        if ((r50 & 16777216) == 0) goto L97;
        TextMotion r53 = r20.paragraphStyle.getTextMotion();
    L98:
        Shadow r410 = r11;
        long r211 = r3;
        FontWeight r212 = r5;
        FontStyle r213 = r6;
        FontSynthesis r214 = r7;
        FontFamily r310 = r8;
        String r311 = r9;
        long r312 = r10;
        BaselineShift r313 = r12;
        TextGeometricTransform r314 = r13;
        LocaleList r315 = r14;
        long r316 = r15;
        long r411 = r18;
        return r20.m6442copyaIRg9q4(r21, r24, r211, r212, r213, r214, r310, r311, r312, r313, r314, r315, r316, r210, r410, r1, r16, r17, r411, r19, r31, r36, r43, r52, r53);
    L97:
        r53 = r49;
        goto L98
    L93:
        r52 = r48;
        goto L95
    L89:
        r43 = r47;
        goto L91
    L85:
        r36 = r46;
        goto L87
    L81:
        r31 = r45;
        goto L83
    L77:
        r19 = r44;
        goto L79
    L73:
        r18 = r42;
        goto L75
    L69:
        r17 = r41;
        goto L71
    L65:
        r16 = r40;
        goto L67
    L61:
        r1 = r39;
        goto L63
    L57:
        r11 = r38;
        goto L59
    L53:
        r4 = r37;
        goto L54
    L49:
        r15 = r35;
        goto L50
    L45:
        r14 = r34;
        goto L47
    L41:
        r13 = r33;
        goto L43
    L37:
        r12 = r32;
        goto L39
    L33:
        r10 = r30;
        goto L35
    L29:
        r9 = r29;
        goto L31
    L25:
        r8 = r28;
        goto L27
    L21:
        r7 = r27;
        goto L23
    L17:
        r6 = r26;
        goto L19
    L13:
        r5 = r25;
        goto L15
    L9:
        r3 = r23;
        goto L11
    L5:
        r2 = r22;
        goto L7
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "copy constructors that take nullable TextAlign, TextDirection, LineBreak, and Hyphens are deprecated. Please use a new constructor where these parameters are non-nullable. Null value has been replaced by a special Unspecified object for performance reason.")
    /* JADX INFO: renamed from: copy-aIRg9q4, reason: not valid java name */
    public final /* synthetic */ TextStyle m6442copyaIRg9q4(Brush brush, float alpha, long fontSize, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String fontFeatureSettings, long letterSpacing, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long background, TextDecoration textDecoration, Shadow shadow, DrawStyle drawStyle, TextAlign textAlign, TextDirection textDirection, long lineHeight, TextIndent textIndent, PlatformTextStyle platformStyle, LineHeightStyle lineHeightStyle, LineBreak lineBreak, Hyphens hyphens, TextMotion textMotion) {
        PlatformParagraphStyle r24 = null;
        if (platformStyle == null) goto L5;
        PlatformSpanStyle r21 = platformStyle.getSpanStyle();
    L6:
        SpanStyle r2 = new SpanStyle(brush, alpha, fontSize, fontWeight, fontStyle, fontSynthesis, fontFamily, fontFeatureSettings, letterSpacing, baselineShift, textGeometricTransform, localeList, background, textDecoration, shadow, r21, drawStyle, null);
        if (textAlign == null) goto L9;
        int r4 = textAlign.m6834unboximpl();
    L10:
        if (textDirection == null) goto L12;
        int r5 = textDirection.m6848unboximpl();
    L14:
        if (platformStyle == null) goto L16;
        r24 = platformStyle.getParagraphStyle();
    L16:
        PlatformParagraphStyle r9 = r24;
        if (lineBreak == null) goto L19;
        int r6 = lineBreak.m6748unboximpl();
    L20:
        int r11 = r6;
        if (hyphens == null) goto L23;
        int r7 = hyphens.m6732unboximpl();
    L25:
        return new TextStyle(r2, new ParagraphStyle(r4, r5, lineHeight, textIndent, r9, lineHeightStyle, r11, r7, textMotion, null), platformStyle);
    L23:
        r7 = Hyphens.Companion.m6735getUnspecifiedvmbZdU8();
        goto L25
    L19:
        r6 = LineBreak.Companion.m6756getUnspecifiedrAG3T2k();
        goto L20
    L12:
        r5 = TextDirection.Companion.m6854getUnspecifieds_7Xco();
        goto L14
    L9:
        r4 = TextAlign.Companion.m6841getUnspecifiede0LSkKk();
        goto L10
    L5:
        r21 = null;
        goto L6
    }

    /* JADX INFO: renamed from: copy-Ns73l9s$default, reason: not valid java name */
    public static /* synthetic */ TextStyle m6428copyNs73l9s$default(TextStyle r20, Brush r21, float r22, long r23, FontWeight r25, FontStyle r26, FontSynthesis r27, FontFamily r28, String r29, long r30, BaselineShift r32, TextGeometricTransform r33, LocaleList r34, long r35, TextDecoration r37, Shadow r38, DrawStyle r39, int r40, int r41, long r42, TextIndent r44, PlatformTextStyle r45, LineHeightStyle r46, int r47, int r48, TextMotion r49, int r50, Object r51) {
        if ((r50 & 2) == 0) goto L5;
        float r2 = r20.spanStyle.getAlpha();
    L7:
        if ((r50 & 4) == 0) goto L9;
        long r3 = r20.spanStyle.m6359getFontSizeXSAIIZE();
    L11:
        if ((r50 & 8) == 0) goto L13;
        FontWeight r5 = r20.spanStyle.getFontWeight();
    L15:
        if ((r50 & 16) == 0) goto L17;
        FontStyle r6 = r20.spanStyle.m6360getFontStyle4Lr2A7w();
    L19:
        if ((r50 & 32) == 0) goto L21;
        FontSynthesis r7 = r20.spanStyle.m6361getFontSynthesisZQGJjVo();
    L23:
        if ((r50 & 64) == 0) goto L25;
        FontFamily r8 = r20.spanStyle.getFontFamily();
    L27:
        if ((r50 & 128) == 0) goto L29;
        String r9 = r20.spanStyle.getFontFeatureSettings();
    L31:
        if ((r50 & 256) == 0) goto L33;
        long r10 = r20.spanStyle.m6362getLetterSpacingXSAIIZE();
    L35:
        if ((r50 & 512) == 0) goto L37;
        BaselineShift r12 = r20.spanStyle.m6357getBaselineShift5SSeXJ0();
    L39:
        if ((r50 & 1024) == 0) goto L41;
        TextGeometricTransform r13 = r20.spanStyle.getTextGeometricTransform();
    L43:
        if ((r50 & 2048) == 0) goto L45;
        LocaleList r14 = r20.spanStyle.getLocaleList();
    L47:
        if ((r50 & 4096) == 0) goto L49;
        long r15 = r20.spanStyle.m6356getBackground0d7_KjU();
    L50:
        float r24 = r2;
        if ((r50 & 8192) == 0) goto L53;
        TextDecoration r4 = r20.spanStyle.getTextDecoration();
    L54:
        TextDecoration r210 = r4;
        if ((r50 & 16384) == 0) goto L57;
        Shadow r11 = r20.spanStyle.getShadow();
    L59:
        if ((r50 & 32768) == 0) goto L61;
        DrawStyle r1 = r20.spanStyle.getDrawStyle();
    L63:
        if ((r50 & 65536) == 0) goto L65;
        int r16 = r20.paragraphStyle.m6312getTextAligne0LSkKk();
    L67:
        if ((r50 & 131072) == 0) goto L69;
        int r17 = r20.paragraphStyle.m6314getTextDirections_7Xco();
    L71:
        if ((r50 & 262144) == 0) goto L73;
        long r18 = r20.paragraphStyle.m6310getLineHeightXSAIIZE();
    L75:
        if ((r50 & 524288) == 0) goto L77;
        TextIndent r19 = r20.paragraphStyle.getTextIndent();
    L79:
        if ((r50 & 1048576) == 0) goto L81;
        PlatformTextStyle r31 = r20.platformStyle;
    L83:
        if ((r50 & 2097152) == 0) goto L85;
        LineHeightStyle r36 = r20.paragraphStyle.getLineHeightStyle();
    L87:
        if ((r50 & 4194304) == 0) goto L89;
        int r43 = r20.paragraphStyle.m6309getLineBreakrAG3T2k();
    L91:
        if ((r50 & 8388608) == 0) goto L93;
        int r52 = r20.paragraphStyle.m6307getHyphensvmbZdU8();
    L95:
        if ((r50 & 16777216) == 0) goto L97;
        TextMotion r53 = r20.paragraphStyle.getTextMotion();
    L98:
        Shadow r410 = r11;
        long r211 = r3;
        FontWeight r212 = r5;
        FontStyle r213 = r6;
        FontSynthesis r214 = r7;
        FontFamily r310 = r8;
        String r311 = r9;
        long r312 = r10;
        BaselineShift r313 = r12;
        TextGeometricTransform r314 = r13;
        LocaleList r315 = r14;
        long r316 = r15;
        long r411 = r18;
        return r20.m6441copyNs73l9s(r21, r24, r211, r212, r213, r214, r310, r311, r312, r313, r314, r315, r316, r210, r410, r1, r16, r17, r411, r19, r31, r36, r43, r52, r53);
    L97:
        r53 = r49;
        goto L98
    L93:
        r52 = r48;
        goto L95
    L89:
        r43 = r47;
        goto L91
    L85:
        r36 = r46;
        goto L87
    L81:
        r31 = r45;
        goto L83
    L77:
        r19 = r44;
        goto L79
    L73:
        r18 = r42;
        goto L75
    L69:
        r17 = r41;
        goto L71
    L65:
        r16 = r40;
        goto L67
    L61:
        r1 = r39;
        goto L63
    L57:
        r11 = r38;
        goto L59
    L53:
        r4 = r37;
        goto L54
    L49:
        r15 = r35;
        goto L50
    L45:
        r14 = r34;
        goto L47
    L41:
        r13 = r33;
        goto L43
    L37:
        r12 = r32;
        goto L39
    L33:
        r10 = r30;
        goto L35
    L29:
        r9 = r29;
        goto L31
    L25:
        r8 = r28;
        goto L27
    L21:
        r7 = r27;
        goto L23
    L17:
        r6 = r26;
        goto L19
    L13:
        r5 = r25;
        goto L15
    L9:
        r3 = r23;
        goto L11
    L5:
        r2 = r22;
        goto L7
    }

    /* JADX INFO: renamed from: copy-Ns73l9s, reason: not valid java name */
    public final TextStyle m6441copyNs73l9s(Brush brush, float alpha, long fontSize, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String fontFeatureSettings, long letterSpacing, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long background, TextDecoration textDecoration, Shadow shadow, DrawStyle drawStyle, int textAlign, int textDirection, long lineHeight, TextIndent textIndent, PlatformTextStyle platformStyle, LineHeightStyle lineHeightStyle, int lineBreak, int hyphens, TextMotion textMotion) {
        PlatformParagraphStyle r24 = null;
        if (platformStyle == null) goto L5;
        PlatformSpanStyle r21 = platformStyle.getSpanStyle();
    L6:
        SpanStyle r2 = new SpanStyle(brush, alpha, fontSize, fontWeight, fontStyle, fontSynthesis, fontFamily, fontFeatureSettings, letterSpacing, baselineShift, textGeometricTransform, localeList, background, textDecoration, shadow, r21, drawStyle, null);
        if (platformStyle == null) goto L10;
        r24 = platformStyle.getParagraphStyle();
    L10:
        return new TextStyle(r2, new ParagraphStyle(textAlign, textDirection, lineHeight, textIndent, r24, lineHeightStyle, lineBreak, hyphens, textMotion, null), platformStyle);
    L5:
        r21 = null;
        goto L6
    }

    public final Brush getBrush() {
        return this.spanStyle.getBrush();
    }

    /* JADX INFO: renamed from: getColor-0d7_KjU, reason: not valid java name */
    public final long m6447getColor0d7_KjU() {
        return this.spanStyle.m6358getColor0d7_KjU();
    }

    public final float getAlpha() {
        return this.spanStyle.getAlpha();
    }

    /* JADX INFO: renamed from: getFontSize-XSAIIZE, reason: not valid java name */
    public final long m6448getFontSizeXSAIIZE() {
        return this.spanStyle.m6359getFontSizeXSAIIZE();
    }

    public final FontWeight getFontWeight() {
        return this.spanStyle.getFontWeight();
    }

    /* JADX INFO: renamed from: getFontStyle-4Lr2A7w, reason: not valid java name */
    public final FontStyle m6449getFontStyle4Lr2A7w() {
        return this.spanStyle.m6360getFontStyle4Lr2A7w();
    }

    /* JADX INFO: renamed from: getFontSynthesis-ZQGJjVo, reason: not valid java name */
    public final FontSynthesis m6450getFontSynthesisZQGJjVo() {
        return this.spanStyle.m6361getFontSynthesisZQGJjVo();
    }

    public final FontFamily getFontFamily() {
        return this.spanStyle.getFontFamily();
    }

    public final String getFontFeatureSettings() {
        return this.spanStyle.getFontFeatureSettings();
    }

    /* JADX INFO: renamed from: getLetterSpacing-XSAIIZE, reason: not valid java name */
    public final long m6453getLetterSpacingXSAIIZE() {
        return this.spanStyle.m6362getLetterSpacingXSAIIZE();
    }

    /* JADX INFO: renamed from: getBaselineShift-5SSeXJ0, reason: not valid java name */
    public final BaselineShift m6446getBaselineShift5SSeXJ0() {
        return this.spanStyle.m6357getBaselineShift5SSeXJ0();
    }

    public final TextGeometricTransform getTextGeometricTransform() {
        return this.spanStyle.getTextGeometricTransform();
    }

    public final LocaleList getLocaleList() {
        return this.spanStyle.getLocaleList();
    }

    /* JADX INFO: renamed from: getBackground-0d7_KjU, reason: not valid java name */
    public final long m6445getBackground0d7_KjU() {
        return this.spanStyle.m6356getBackground0d7_KjU();
    }

    public final TextDecoration getTextDecoration() {
        return this.spanStyle.getTextDecoration();
    }

    public final Shadow getShadow() {
        return this.spanStyle.getShadow();
    }

    public final DrawStyle getDrawStyle() {
        return this.spanStyle.getDrawStyle();
    }

    /* JADX INFO: renamed from: getTextAlign-e0LSkKk, reason: not valid java name */
    public final int m6458getTextAligne0LSkKk() {
        return this.paragraphStyle.m6312getTextAligne0LSkKk();
    }

    /* JADX INFO: renamed from: getTextAlign-buA522U, reason: not valid java name */
    public final TextAlign m6457getTextAlignbuA522U() {
        return TextAlign.m6828boximpl(m6458getTextAligne0LSkKk());
    }

    /* JADX INFO: renamed from: getTextDirection-s_7X-co, reason: not valid java name */
    public final int m6460getTextDirections_7Xco() {
        return this.paragraphStyle.m6314getTextDirections_7Xco();
    }

    /* JADX INFO: renamed from: getTextDirection-mmuk1to, reason: not valid java name */
    public final TextDirection m6459getTextDirectionmmuk1to() {
        return TextDirection.m6842boximpl(m6460getTextDirections_7Xco());
    }

    /* JADX INFO: renamed from: getLineHeight-XSAIIZE, reason: not valid java name */
    public final long m6456getLineHeightXSAIIZE() {
        return this.paragraphStyle.m6310getLineHeightXSAIIZE();
    }

    public final TextIndent getTextIndent() {
        return this.paragraphStyle.getTextIndent();
    }

    public final LineHeightStyle getLineHeightStyle() {
        return this.paragraphStyle.getLineHeightStyle();
    }

    /* JADX INFO: renamed from: getHyphens-vmbZdU8, reason: not valid java name */
    public final int m6452getHyphensvmbZdU8() {
        return this.paragraphStyle.m6307getHyphensvmbZdU8();
    }

    /* JADX INFO: renamed from: getHyphens-EaSxIns, reason: not valid java name */
    public final Hyphens m6451getHyphensEaSxIns() {
        return Hyphens.m6726boximpl(m6452getHyphensvmbZdU8());
    }

    /* JADX INFO: renamed from: getLineBreak-rAG3T2k, reason: not valid java name */
    public final int m6455getLineBreakrAG3T2k() {
        return this.paragraphStyle.m6309getLineBreakrAG3T2k();
    }

    /* JADX INFO: renamed from: getLineBreak-LgCVezo, reason: not valid java name */
    public final LineBreak m6454getLineBreakLgCVezo() {
        return LineBreak.m6736boximpl(m6455getLineBreakrAG3T2k());
    }

    public final TextMotion getTextMotion() {
        return this.paragraphStyle.getTextMotion();
    }

    public boolean equals(Object other) {
        if (this != other) goto L6;
        return true;
    L6:
        if ((other instanceof TextStyle) == true) goto L9;
        return false;
    L9:
        if (Intrinsics.areEqual(this.spanStyle, ((TextStyle) other).spanStyle) == true) goto L12;
        return false;
    L12:
        if (Intrinsics.areEqual(this.paragraphStyle, ((TextStyle) other).paragraphStyle) == true) goto L15;
        return false;
    L15:
        if (Intrinsics.areEqual(this.platformStyle, ((TextStyle) other).platformStyle) == true) goto L17;
        return false;
    L17:
        return true;
    }

    public final boolean hasSameLayoutAffectingAttributes(TextStyle other) {
        if (this != other) goto L4;
    L9:
        return true;
    L4:
        if (Intrinsics.areEqual(this.paragraphStyle, other.paragraphStyle) == true) goto L6;
    L8:
        return false;
    L6:
        if (this.spanStyle.hasSameLayoutAffectingAttributes$ui_text_release(other.spanStyle) == false) goto L8;
        goto L8
    }

    public final boolean hasSameDrawAffectingAttributes(TextStyle other) {
        if (this != other) goto L4;
    L7:
        return true;
    L4:
        if (this.spanStyle.hasSameNonLayoutAttributes$ui_text_release(other.spanStyle) == true) goto L7;
        return false;
    }

    public int hashCode() {
        int result = this.spanStyle.hashCode();
        int result2 = (result * 31) + this.paragraphStyle.hashCode();
        int result3 = result2 * 31;
        PlatformTextStyle r2 = this.platformStyle;
        if (r2 == null) goto L5;
        int r3 = r2.hashCode();
    L7:
        return result3 + r3;
    L5:
        r3 = 0;
        goto L7
    }

    public final int hashCodeLayoutAffectingAttributes$ui_text_release() {
        int result = this.spanStyle.hashCodeLayoutAffectingAttributes$ui_text_release();
        int result2 = (result * 31) + this.paragraphStyle.hashCode();
        int result3 = result2 * 31;
        PlatformTextStyle r2 = this.platformStyle;
        if (r2 == null) goto L5;
        int r3 = r2.hashCode();
    L7:
        return result3 + r3;
    L5:
        r3 = 0;
        goto L7
    }

    public String toString() {
        StringBuilder r0 = new StringBuilder();
        r0.append("TextStyle(color=").append(Color.m4374toStringimpl(m6447getColor0d7_KjU())).append(", brush=").append(getBrush()).append(", alpha=").append(getAlpha()).append(", fontSize=").append(TextUnit.m7174toStringimpl(m6448getFontSizeXSAIIZE())).append(", fontWeight=").append(getFontWeight()).append(", fontStyle=").append(m6449getFontStyle4Lr2A7w()).append(", fontSynthesis=").append(m6450getFontSynthesisZQGJjVo()).append(", fontFamily=").append(getFontFamily()).append(", fontFeatureSettings=").append(getFontFeatureSettings()).append(", letterSpacing=").append(TextUnit.m7174toStringimpl(m6453getLetterSpacingXSAIIZE())).append(", baselineShift=").append(m6446getBaselineShift5SSeXJ0()).append(", textGeometricTransform=");
        r0.append(getTextGeometricTransform()).append(", localeList=").append(getLocaleList()).append(", background=").append(Color.m4374toStringimpl(m6445getBackground0d7_KjU())).append(", textDecoration=").append(getTextDecoration()).append(", shadow=").append(getShadow()).append(", drawStyle=").append(getDrawStyle()).append(", textAlign=").append(TextAlign.m6833toStringimpl(m6458getTextAligne0LSkKk())).append(", textDirection=").append(TextDirection.m6847toStringimpl(m6460getTextDirections_7Xco())).append(", lineHeight=").append(TextUnit.m7174toStringimpl(m6456getLineHeightXSAIIZE())).append(", textIndent=").append(getTextIndent()).append(", platformStyle=").append(this.platformStyle).append(", lineHeightStyle=").append(getLineHeightStyle());
        r0.append(", lineBreak=").append(LineBreak.m6747toStringimpl(m6455getLineBreakrAG3T2k())).append(", hyphens=").append(Hyphens.m6731toStringimpl(m6452getHyphensvmbZdU8())).append(", textMotion=").append(getTextMotion()).append(')');
        return r0.toString();
    }

    static {
        Companion = new Companion(null);
        long r3 = 0;
        long r5 = 0;
        FontWeight r7 = null;
        FontStyle r8 = null;
        FontSynthesis r9 = null;
        FontFamily r10 = null;
        String r11 = null;
        long r12 = 0;
        BaselineShift r14 = null;
        TextGeometricTransform r15 = null;
        LocaleList r16 = null;
        long r17 = 0;
        TextDecoration r19 = null;
        Shadow r20 = null;
        DrawStyle r21 = null;
        int r22 = 0;
        int r23 = 0;
        long r24 = 0;
        TextIndent r26 = null;
        PlatformTextStyle r27 = null;
        LineHeightStyle r28 = null;
        int r29 = 0;
        int r30 = 0;
        TextMotion r31 = null;
        Default = new TextStyle(r3, r5, r7, r8, r9, r10, r11, r12, r14, r15, r16, r17, r19, r20, r21, r22, r23, r24, r26, r27, r28, r29, r30, r31, ViewCompat.MEASURED_SIZE_MASK, null);
    }
}
