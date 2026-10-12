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
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextForegroundStyle;
import androidx.compose.ui.text.style.TextGeometricTransform;
import androidx.compose.ui.unit.TextUnit;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: SpanStyle.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0094\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b/\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B§\u0001\b\u0017\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0014\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0016\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0019\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u001b¢\u0006\u0002\u0010\u001cB³\u0001\b\u0017\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0014\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0016\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0019\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u001b\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001e¢\u0006\u0002\u0010\u001fB¿\u0001\b\u0016\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0014\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0016\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0019\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u001b\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001e\u0012\n\b\u0002\u0010 \u001a\u0004\u0018\u00010!¢\u0006\u0002\u0010\"BÉ\u0001\b\u0016\u0012\b\u0010#\u001a\u0004\u0018\u00010$\u0012\b\b\u0002\u0010%\u001a\u00020&\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0014\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0016\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0019\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u001b\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001e\u0012\n\b\u0002\u0010 \u001a\u0004\u0018\u00010!¢\u0006\u0002\u0010'B½\u0001\b\u0000\u0012\u0006\u0010(\u001a\u00020)\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0014\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0016\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0019\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u001b\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001e\u0012\n\b\u0002\u0010 \u001a\u0004\u0018\u00010!¢\u0006\u0002\u0010*JÒ\u0001\u0010O\u001a\u00020\u00002\b\u0010#\u001a\u0004\u0018\u00010$2\b\b\u0002\u0010%\u001a\u00020&2\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00052\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00142\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00162\b\b\u0002\u0010\u0017\u001a\u00020\u00032\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00192\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u001b2\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001e2\n\b\u0002\u0010 \u001a\u0004\u0018\u00010!ø\u0001\u0000¢\u0006\u0004\bP\u0010QJ²\u0001\u0010O\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00052\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00142\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00162\b\b\u0002\u0010\u0017\u001a\u00020\u00032\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00192\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0007ø\u0001\u0000¢\u0006\u0004\bR\u0010SJ¾\u0001\u0010O\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00052\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00142\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00162\b\b\u0002\u0010\u0017\u001a\u00020\u00032\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00192\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u001b2\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001eH\u0007ø\u0001\u0000¢\u0006\u0004\bT\u0010UJÈ\u0001\u0010O\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00052\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00142\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00162\b\b\u0002\u0010\u0017\u001a\u00020\u00032\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00192\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u001b2\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001e2\n\b\u0002\u0010 \u001a\u0004\u0018\u00010!ø\u0001\u0000¢\u0006\u0004\bV\u0010WJ\u0013\u0010X\u001a\u00020Y2\b\u0010Z\u001a\u0004\u0018\u00010[H\u0096\u0002J\u0015\u0010\\\u001a\u00020Y2\u0006\u0010Z\u001a\u00020\u0000H\u0000¢\u0006\u0002\b]J\u0015\u0010^\u001a\u00020Y2\u0006\u0010Z\u001a\u00020\u0000H\u0000¢\u0006\u0002\b_J\b\u0010`\u001a\u00020aH\u0016J\r\u0010b\u001a\u00020aH\u0000¢\u0006\u0002\bcJ\u0014\u0010d\u001a\u00020\u00002\n\b\u0002\u0010Z\u001a\u0004\u0018\u00010\u0000H\u0007J\u0011\u0010e\u001a\u00020\u00002\u0006\u0010Z\u001a\u00020\u0000H\u0087\u0002J\b\u0010f\u001a\u00020\u000fH\u0016R\u0011\u0010%\u001a\u00020&8F¢\u0006\u0006\u001a\u0004\b+\u0010,R\u0019\u0010\u0017\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010/\u001a\u0004\b-\u0010.R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u0012ø\u0001\u0000ø\u0001\u0001¢\u0006\b\n\u0000\u001a\u0004\b0\u00101R\u0013\u0010#\u001a\u0004\u0018\u00010$8F¢\u0006\u0006\u001a\u0004\b2\u00103R\u0017\u0010\u0002\u001a\u00020\u00038Fø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b4\u0010.R\u0013\u0010 \u001a\u0004\u0018\u00010!¢\u0006\b\n\u0000\u001a\u0004\b5\u00106R\u0013\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b7\u00108R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\b\n\u0000\u001a\u0004\b9\u0010:R\u0019\u0010\u0004\u001a\u00020\u0005ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010/\u001a\u0004\b;\u0010.R\u0019\u0010\b\u001a\u0004\u0018\u00010\tø\u0001\u0000ø\u0001\u0001¢\u0006\b\n\u0000\u001a\u0004\b<\u0010=R\u0019\u0010\n\u001a\u0004\u0018\u00010\u000bø\u0001\u0000ø\u0001\u0001¢\u0006\b\n\u0000\u001a\u0004\b>\u0010?R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b@\u0010AR\u0019\u0010\u0010\u001a\u00020\u0005ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010/\u001a\u0004\bB\u0010.R\u0013\u0010\u0015\u001a\u0004\u0018\u00010\u0016¢\u0006\b\n\u0000\u001a\u0004\bC\u0010DR\u0013\u0010\u001d\u001a\u0004\u0018\u00010\u001e¢\u0006\b\n\u0000\u001a\u0004\bE\u0010FR\u0013\u0010\u001a\u001a\u0004\u0018\u00010\u001b¢\u0006\b\n\u0000\u001a\u0004\bG\u0010HR\u0013\u0010\u0018\u001a\u0004\u0018\u00010\u0019¢\u0006\b\n\u0000\u001a\u0004\bI\u0010JR\u0014\u0010(\u001a\u00020)X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\bK\u0010LR\u0013\u0010\u0013\u001a\u0004\u0018\u00010\u0014¢\u0006\b\n\u0000\u001a\u0004\bM\u0010N\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006g"}, d2 = {"Landroidx/compose/ui/text/SpanStyle;", "Landroidx/compose/ui/text/AnnotatedString$Annotation;", "color", "Landroidx/compose/ui/graphics/Color;", "fontSize", "Landroidx/compose/ui/unit/TextUnit;", "fontWeight", "Landroidx/compose/ui/text/font/FontWeight;", "fontStyle", "Landroidx/compose/ui/text/font/FontStyle;", "fontSynthesis", "Landroidx/compose/ui/text/font/FontSynthesis;", "fontFamily", "Landroidx/compose/ui/text/font/FontFamily;", "fontFeatureSettings", "", "letterSpacing", "baselineShift", "Landroidx/compose/ui/text/style/BaselineShift;", "textGeometricTransform", "Landroidx/compose/ui/text/style/TextGeometricTransform;", "localeList", "Landroidx/compose/ui/text/intl/LocaleList;", "background", "textDecoration", "Landroidx/compose/ui/text/style/TextDecoration;", "shadow", "Landroidx/compose/ui/graphics/Shadow;", "(JJLandroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontSynthesis;Landroidx/compose/ui/text/font/FontFamily;Ljava/lang/String;JLandroidx/compose/ui/text/style/BaselineShift;Landroidx/compose/ui/text/style/TextGeometricTransform;Landroidx/compose/ui/text/intl/LocaleList;JLandroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/graphics/Shadow;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "platformStyle", "Landroidx/compose/ui/text/PlatformSpanStyle;", "(JJLandroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontSynthesis;Landroidx/compose/ui/text/font/FontFamily;Ljava/lang/String;JLandroidx/compose/ui/text/style/BaselineShift;Landroidx/compose/ui/text/style/TextGeometricTransform;Landroidx/compose/ui/text/intl/LocaleList;JLandroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/graphics/Shadow;Landroidx/compose/ui/text/PlatformSpanStyle;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "drawStyle", "Landroidx/compose/ui/graphics/drawscope/DrawStyle;", "(JJLandroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontSynthesis;Landroidx/compose/ui/text/font/FontFamily;Ljava/lang/String;JLandroidx/compose/ui/text/style/BaselineShift;Landroidx/compose/ui/text/style/TextGeometricTransform;Landroidx/compose/ui/text/intl/LocaleList;JLandroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/graphics/Shadow;Landroidx/compose/ui/text/PlatformSpanStyle;Landroidx/compose/ui/graphics/drawscope/DrawStyle;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "brush", "Landroidx/compose/ui/graphics/Brush;", "alpha", "", "(Landroidx/compose/ui/graphics/Brush;FJLandroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontSynthesis;Landroidx/compose/ui/text/font/FontFamily;Ljava/lang/String;JLandroidx/compose/ui/text/style/BaselineShift;Landroidx/compose/ui/text/style/TextGeometricTransform;Landroidx/compose/ui/text/intl/LocaleList;JLandroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/graphics/Shadow;Landroidx/compose/ui/text/PlatformSpanStyle;Landroidx/compose/ui/graphics/drawscope/DrawStyle;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "textForegroundStyle", "Landroidx/compose/ui/text/style/TextForegroundStyle;", "(Landroidx/compose/ui/text/style/TextForegroundStyle;JLandroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontSynthesis;Landroidx/compose/ui/text/font/FontFamily;Ljava/lang/String;JLandroidx/compose/ui/text/style/BaselineShift;Landroidx/compose/ui/text/style/TextGeometricTransform;Landroidx/compose/ui/text/intl/LocaleList;JLandroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/graphics/Shadow;Landroidx/compose/ui/text/PlatformSpanStyle;Landroidx/compose/ui/graphics/drawscope/DrawStyle;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "getAlpha", "()F", "getBackground-0d7_KjU", "()J", "J", "getBaselineShift-5SSeXJ0", "()Landroidx/compose/ui/text/style/BaselineShift;", "getBrush", "()Landroidx/compose/ui/graphics/Brush;", "getColor-0d7_KjU", "getDrawStyle", "()Landroidx/compose/ui/graphics/drawscope/DrawStyle;", "getFontFamily", "()Landroidx/compose/ui/text/font/FontFamily;", "getFontFeatureSettings", "()Ljava/lang/String;", "getFontSize-XSAIIZE", "getFontStyle-4Lr2A7w", "()Landroidx/compose/ui/text/font/FontStyle;", "getFontSynthesis-ZQGJjVo", "()Landroidx/compose/ui/text/font/FontSynthesis;", "getFontWeight", "()Landroidx/compose/ui/text/font/FontWeight;", "getLetterSpacing-XSAIIZE", "getLocaleList", "()Landroidx/compose/ui/text/intl/LocaleList;", "getPlatformStyle", "()Landroidx/compose/ui/text/PlatformSpanStyle;", "getShadow", "()Landroidx/compose/ui/graphics/Shadow;", "getTextDecoration", "()Landroidx/compose/ui/text/style/TextDecoration;", "getTextForegroundStyle$ui_text_release", "()Landroidx/compose/ui/text/style/TextForegroundStyle;", "getTextGeometricTransform", "()Landroidx/compose/ui/text/style/TextGeometricTransform;", "copy", "copy-NcG25M8", "(Landroidx/compose/ui/graphics/Brush;FJLandroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontSynthesis;Landroidx/compose/ui/text/font/FontFamily;Ljava/lang/String;JLandroidx/compose/ui/text/style/BaselineShift;Landroidx/compose/ui/text/style/TextGeometricTransform;Landroidx/compose/ui/text/intl/LocaleList;JLandroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/graphics/Shadow;Landroidx/compose/ui/text/PlatformSpanStyle;Landroidx/compose/ui/graphics/drawscope/DrawStyle;)Landroidx/compose/ui/text/SpanStyle;", "copy-IuqyXdg", "(JJLandroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontSynthesis;Landroidx/compose/ui/text/font/FontFamily;Ljava/lang/String;JLandroidx/compose/ui/text/style/BaselineShift;Landroidx/compose/ui/text/style/TextGeometricTransform;Landroidx/compose/ui/text/intl/LocaleList;JLandroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/graphics/Shadow;)Landroidx/compose/ui/text/SpanStyle;", "copy-2BkPm_w", "(JJLandroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontSynthesis;Landroidx/compose/ui/text/font/FontFamily;Ljava/lang/String;JLandroidx/compose/ui/text/style/BaselineShift;Landroidx/compose/ui/text/style/TextGeometricTransform;Landroidx/compose/ui/text/intl/LocaleList;JLandroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/graphics/Shadow;Landroidx/compose/ui/text/PlatformSpanStyle;)Landroidx/compose/ui/text/SpanStyle;", "copy-GSF8kmg", "(JJLandroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontSynthesis;Landroidx/compose/ui/text/font/FontFamily;Ljava/lang/String;JLandroidx/compose/ui/text/style/BaselineShift;Landroidx/compose/ui/text/style/TextGeometricTransform;Landroidx/compose/ui/text/intl/LocaleList;JLandroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/graphics/Shadow;Landroidx/compose/ui/text/PlatformSpanStyle;Landroidx/compose/ui/graphics/drawscope/DrawStyle;)Landroidx/compose/ui/text/SpanStyle;", "equals", "", "other", "", "hasSameLayoutAffectingAttributes", "hasSameLayoutAffectingAttributes$ui_text_release", "hasSameNonLayoutAttributes", "hasSameNonLayoutAttributes$ui_text_release", "hashCode", "", "hashCodeLayoutAffectingAttributes", "hashCodeLayoutAffectingAttributes$ui_text_release", "merge", "plus", "toString", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class SpanStyle implements AnnotatedString.Annotation {
    public static final int $stable = 0;
    private final long background;
    private final BaselineShift baselineShift;
    private final DrawStyle drawStyle;
    private final FontFamily fontFamily;
    private final String fontFeatureSettings;
    private final long fontSize;
    private final FontStyle fontStyle;
    private final FontSynthesis fontSynthesis;
    private final FontWeight fontWeight;
    private final long letterSpacing;
    private final LocaleList localeList;
    private final PlatformSpanStyle platformStyle;
    private final Shadow shadow;
    private final TextDecoration textDecoration;
    private final TextForegroundStyle textForegroundStyle;
    private final TextGeometricTransform textGeometricTransform;

    static {
    }

    public /* synthetic */ SpanStyle(long r1, long r3, FontWeight r5, FontStyle r6, FontSynthesis r7, FontFamily r8, String r9, long r10, BaselineShift r12, TextGeometricTransform r13, LocaleList r14, long r15, TextDecoration r17, Shadow r18, PlatformSpanStyle r19, DrawStyle r20, DefaultConstructorMarker r21) {
        this(r1, r3, r5, r6, r7, r8, r9, r10, r12, r13, r14, r15, r17, r18, r19, r20);
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "SpanStyle constructors that do not take new stable parameters like PlatformStyle, DrawStyle are deprecated. Please use the new stable constructor.")
    public /* synthetic */ SpanStyle(long r1, long r3, FontWeight r5, FontStyle r6, FontSynthesis r7, FontFamily r8, String r9, long r10, BaselineShift r12, TextGeometricTransform r13, LocaleList r14, long r15, TextDecoration r17, Shadow r18, PlatformSpanStyle r19, DefaultConstructorMarker r20) {
        this(r1, r3, r5, r6, r7, r8, r9, r10, r12, r13, r14, r15, r17, r18, r19);
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "SpanStyle constructors that do not take new stable parameters like PlatformStyle, DrawStyle are deprecated. Please use the new stable constructor.")
    public /* synthetic */ SpanStyle(long r1, long r3, FontWeight r5, FontStyle r6, FontSynthesis r7, FontFamily r8, String r9, long r10, BaselineShift r12, TextGeometricTransform r13, LocaleList r14, long r15, TextDecoration r17, Shadow r18, DefaultConstructorMarker r19) {
        this(r1, r3, r5, r6, r7, r8, r9, r10, r12, r13, r14, r15, r17, r18);
    }

    public /* synthetic */ SpanStyle(Brush r1, float r2, long r3, FontWeight r5, FontStyle r6, FontSynthesis r7, FontFamily r8, String r9, long r10, BaselineShift r12, TextGeometricTransform r13, LocaleList r14, long r15, TextDecoration r17, Shadow r18, PlatformSpanStyle r19, DrawStyle r20, DefaultConstructorMarker r21) {
        this(r1, r2, r3, r5, r6, r7, r8, r9, r10, r12, r13, r14, r15, r17, r18, r19, r20);
    }

    public /* synthetic */ SpanStyle(TextForegroundStyle r1, long r2, FontWeight r4, FontStyle r5, FontSynthesis r6, FontFamily r7, String r8, long r9, BaselineShift r11, TextGeometricTransform r12, LocaleList r13, long r14, TextDecoration r16, Shadow r17, PlatformSpanStyle r18, DrawStyle r19, DefaultConstructorMarker r20) {
        this(r1, r2, r4, r5, r6, r7, r8, r9, r11, r12, r13, r14, r16, r17, r18, r19);
    }

    private SpanStyle(TextForegroundStyle textForegroundStyle, long fontSize, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String fontFeatureSettings, long letterSpacing, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long background, TextDecoration textDecoration, Shadow shadow, PlatformSpanStyle platformStyle, DrawStyle drawStyle) {
        this.textForegroundStyle = textForegroundStyle;
        this.fontSize = fontSize;
        this.fontWeight = fontWeight;
        this.fontStyle = fontStyle;
        this.fontSynthesis = fontSynthesis;
        this.fontFamily = fontFamily;
        this.fontFeatureSettings = fontFeatureSettings;
        this.letterSpacing = letterSpacing;
        this.baselineShift = baselineShift;
        this.textGeometricTransform = textGeometricTransform;
        this.localeList = localeList;
        this.background = background;
        this.textDecoration = textDecoration;
        this.shadow = shadow;
        this.platformStyle = platformStyle;
        this.drawStyle = drawStyle;
    }

    public /* synthetic */ SpanStyle(TextForegroundStyle r25, long r26, FontWeight r28, FontStyle r29, FontSynthesis r30, FontFamily r31, String r32, long r33, BaselineShift r35, TextGeometricTransform r36, LocaleList r37, long r38, TextDecoration r40, Shadow r41, PlatformSpanStyle r42, DrawStyle r43, int r44, DefaultConstructorMarker r45) {
        if ((r44 & 2) == 0) goto L5;
        long r5 = TextUnit.Companion.m7178getUnspecifiedXSAIIZE();
    L7:
        if ((r44 & 4) == 0) goto L9;
        FontWeight r7 = null;
    L11:
        if ((r44 & 8) == 0) goto L13;
        FontStyle r8 = null;
    L15:
        if ((r44 & 16) == 0) goto L17;
        FontSynthesis r9 = null;
    L19:
        if ((r44 & 32) == 0) goto L21;
        FontFamily r10 = null;
    L23:
        if ((r44 & 64) == 0) goto L25;
        String r11 = null;
    L27:
        if ((r44 & 128) == 0) goto L29;
        long r12 = TextUnit.Companion.m7178getUnspecifiedXSAIIZE();
    L31:
        if ((r44 & 256) == 0) goto L33;
        BaselineShift r14 = null;
    L35:
        if ((r44 & 512) == 0) goto L37;
        TextGeometricTransform r15 = null;
    L39:
        if ((r44 & 1024) == 0) goto L41;
        LocaleList r16 = null;
    L43:
        if ((r44 & 2048) == 0) goto L45;
        long r17 = Color.Companion.m4402getUnspecified0d7_KjU();
    L47:
        if ((r44 & 4096) == 0) goto L49;
        TextDecoration r19 = null;
    L51:
        if ((r44 & 8192) == 0) goto L53;
        Shadow r20 = null;
    L55:
        if ((r44 & 16384) == 0) goto L57;
        PlatformSpanStyle r21 = null;
    L59:
        if ((r44 & 32768) == 0) goto L61;
        DrawStyle r22 = null;
    L62:
        this(r25, r5, r7, r8, r9, r10, r11, r12, r14, r15, r16, r17, r19, r20, r21, r22, null);
        return;
    L61:
        r22 = r43;
        goto L62
    L57:
        r21 = r42;
        goto L59
    L53:
        r20 = r41;
        goto L55
    L49:
        r19 = r40;
        goto L51
    L45:
        r17 = r38;
        goto L47
    L41:
        r16 = r37;
        goto L43
    L37:
        r15 = r36;
        goto L39
    L33:
        r14 = r35;
        goto L35
    L29:
        r12 = r33;
        goto L31
    L25:
        r11 = r32;
        goto L27
    L21:
        r10 = r31;
        goto L23
    L17:
        r9 = r30;
        goto L19
    L13:
        r8 = r29;
        goto L15
    L9:
        r7 = r28;
        goto L11
    L5:
        r5 = r26;
        goto L7
    }

    public final TextForegroundStyle getTextForegroundStyle$ui_text_release() {
        return this.textForegroundStyle;
    }

    /* JADX INFO: renamed from: getFontSize-XSAIIZE, reason: not valid java name */
    public final long m6359getFontSizeXSAIIZE() {
        return this.fontSize;
    }

    public final FontWeight getFontWeight() {
        return this.fontWeight;
    }

    /* JADX INFO: renamed from: getFontStyle-4Lr2A7w, reason: not valid java name */
    public final FontStyle m6360getFontStyle4Lr2A7w() {
        return this.fontStyle;
    }

    /* JADX INFO: renamed from: getFontSynthesis-ZQGJjVo, reason: not valid java name */
    public final FontSynthesis m6361getFontSynthesisZQGJjVo() {
        return this.fontSynthesis;
    }

    public final FontFamily getFontFamily() {
        return this.fontFamily;
    }

    public final String getFontFeatureSettings() {
        return this.fontFeatureSettings;
    }

    /* JADX INFO: renamed from: getLetterSpacing-XSAIIZE, reason: not valid java name */
    public final long m6362getLetterSpacingXSAIIZE() {
        return this.letterSpacing;
    }

    /* JADX INFO: renamed from: getBaselineShift-5SSeXJ0, reason: not valid java name */
    public final BaselineShift m6357getBaselineShift5SSeXJ0() {
        return this.baselineShift;
    }

    public final TextGeometricTransform getTextGeometricTransform() {
        return this.textGeometricTransform;
    }

    public final LocaleList getLocaleList() {
        return this.localeList;
    }

    /* JADX INFO: renamed from: getBackground-0d7_KjU, reason: not valid java name */
    public final long m6356getBackground0d7_KjU() {
        return this.background;
    }

    public final TextDecoration getTextDecoration() {
        return this.textDecoration;
    }

    public final Shadow getShadow() {
        return this.shadow;
    }

    public final PlatformSpanStyle getPlatformStyle() {
        return this.platformStyle;
    }

    public final DrawStyle getDrawStyle() {
        return this.drawStyle;
    }

    public /* synthetic */ SpanStyle(long r20, long r22, FontWeight r24, FontStyle r25, FontSynthesis r26, FontFamily r27, String r28, long r29, BaselineShift r31, TextGeometricTransform r32, LocaleList r33, long r34, TextDecoration r36, Shadow r37, int r38, DefaultConstructorMarker r39) {
        if ((r38 & 1) == 0) goto L5;
        long r1 = Color.Companion.m4402getUnspecified0d7_KjU();
    L7:
        if ((r38 & 2) == 0) goto L9;
        long r3 = TextUnit.Companion.m7178getUnspecifiedXSAIIZE();
    L11:
        if ((r38 & 4) == 0) goto L13;
        FontWeight r5 = null;
    L15:
        if ((r38 & 8) == 0) goto L17;
        FontStyle r7 = null;
    L19:
        if ((r38 & 16) == 0) goto L21;
        FontSynthesis r8 = null;
    L23:
        if ((r38 & 32) == 0) goto L25;
        FontFamily r9 = null;
    L27:
        if ((r38 & 64) == 0) goto L29;
        String r10 = null;
    L31:
        if ((r38 & 128) == 0) goto L33;
        long r11 = TextUnit.Companion.m7178getUnspecifiedXSAIIZE();
    L35:
        if ((r38 & 256) == 0) goto L37;
        BaselineShift r13 = null;
    L39:
        if ((r38 & 512) == 0) goto L41;
        TextGeometricTransform r14 = null;
    L43:
        if ((r38 & 1024) == 0) goto L45;
        LocaleList r15 = null;
    L47:
        if ((r38 & 2048) == 0) goto L49;
        long r16 = Color.Companion.m4402getUnspecified0d7_KjU();
    L51:
        if ((r38 & 4096) == 0) goto L53;
        TextDecoration r6 = null;
    L55:
        if ((r38 & 8192) == 0) goto L57;
        Shadow r0 = null;
    L58:
        Shadow r310 = r0;
        long r21 = r1;
        long r23 = r3;
        FontWeight r210 = r5;
        TextDecoration r311 = r6;
        FontStyle r211 = r7;
        FontSynthesis r212 = r8;
        FontFamily r213 = r9;
        String r214 = r10;
        long r30 = r11;
        BaselineShift r35 = r13;
        TextGeometricTransform r312 = r14;
        LocaleList r313 = r15;
        long r314 = r16;
        this(r21, r23, r210, r211, r212, r213, r214, r30, r35, r312, r313, r314, r311, r310, null);
        return;
    L57:
        r0 = r37;
        goto L58
    L53:
        r6 = r36;
        goto L55
    L49:
        r16 = r34;
        goto L51
    L45:
        r15 = r33;
        goto L47
    L41:
        r14 = r32;
        goto L43
    L37:
        r13 = r31;
        goto L39
    L33:
        r11 = r29;
        goto L35
    L29:
        r10 = r28;
        goto L31
    L25:
        r9 = r27;
        goto L27
    L21:
        r8 = r26;
        goto L23
    L17:
        r7 = r25;
        goto L19
    L13:
        r5 = r24;
        goto L15
    L9:
        r3 = r22;
        goto L11
    L5:
        r1 = r20;
        goto L7
    }

    private SpanStyle(long color, long fontSize, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String fontFeatureSettings, long letterSpacing, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long background, TextDecoration textDecoration, Shadow shadow) {
        PlatformSpanStyle r21 = null;
        DrawStyle r22 = null;
        this(TextForegroundStyle.Companion.m6856from8_81llA(color), fontSize, fontWeight, fontStyle, fontSynthesis, fontFamily, fontFeatureSettings, letterSpacing, baselineShift, textGeometricTransform, localeList, background, textDecoration, shadow, r21, r22, 32768, null);
    }

    public /* synthetic */ SpanStyle(long r21, long r23, FontWeight r25, FontStyle r26, FontSynthesis r27, FontFamily r28, String r29, long r30, BaselineShift r32, TextGeometricTransform r33, LocaleList r34, long r35, TextDecoration r37, Shadow r38, PlatformSpanStyle r39, int r40, DefaultConstructorMarker r41) {
        if ((r40 & 1) == 0) goto L5;
        long r1 = Color.Companion.m4402getUnspecified0d7_KjU();
    L7:
        if ((r40 & 2) == 0) goto L9;
        long r3 = TextUnit.Companion.m7178getUnspecifiedXSAIIZE();
    L11:
        if ((r40 & 4) == 0) goto L13;
        FontWeight r5 = null;
    L15:
        if ((r40 & 8) == 0) goto L17;
        FontStyle r7 = null;
    L19:
        if ((r40 & 16) == 0) goto L21;
        FontSynthesis r8 = null;
    L23:
        if ((r40 & 32) == 0) goto L25;
        FontFamily r9 = null;
    L27:
        if ((r40 & 64) == 0) goto L29;
        String r10 = null;
    L31:
        if ((r40 & 128) == 0) goto L33;
        long r11 = TextUnit.Companion.m7178getUnspecifiedXSAIIZE();
    L35:
        if ((r40 & 256) == 0) goto L37;
        BaselineShift r13 = null;
    L39:
        if ((r40 & 512) == 0) goto L41;
        TextGeometricTransform r14 = null;
    L43:
        if ((r40 & 1024) == 0) goto L45;
        LocaleList r15 = null;
    L47:
        if ((r40 & 2048) == 0) goto L49;
        long r16 = Color.Companion.m4402getUnspecified0d7_KjU();
    L51:
        if ((r40 & 4096) == 0) goto L53;
        TextDecoration r6 = null;
    L54:
        long r18 = r1;
        if ((r40 & 8192) == 0) goto L57;
        Shadow r2 = null;
    L59:
        if ((r40 & 16384) == 0) goto L61;
        PlatformSpanStyle r0 = null;
    L62:
        PlatformSpanStyle r42 = r0;
        Shadow r310 = r2;
        long r24 = r3;
        FontWeight r210 = r5;
        TextDecoration r311 = r6;
        FontStyle r211 = r7;
        FontSynthesis r212 = r8;
        FontFamily r213 = r9;
        String r31 = r10;
        long r36 = r11;
        BaselineShift r312 = r13;
        TextGeometricTransform r313 = r14;
        LocaleList r314 = r15;
        long r315 = r16;
        this(r18, r24, r210, r211, r212, r213, r31, r36, r312, r313, r314, r315, r311, r310, r42, null);
        return;
    L61:
        r0 = r39;
        goto L62
    L57:
        r2 = r38;
        goto L59
    L53:
        r6 = r37;
        goto L54
    L49:
        r16 = r35;
        goto L51
    L45:
        r15 = r34;
        goto L47
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
        r5 = r25;
        goto L15
    L9:
        r3 = r23;
        goto L11
    L5:
        r1 = r21;
        goto L7
    }

    private SpanStyle(long color, long fontSize, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String fontFeatureSettings, long letterSpacing, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long background, TextDecoration textDecoration, Shadow shadow, PlatformSpanStyle platformStyle) {
        DrawStyle r22 = null;
        this(TextForegroundStyle.Companion.m6856from8_81llA(color), fontSize, fontWeight, fontStyle, fontSynthesis, fontFamily, fontFeatureSettings, letterSpacing, baselineShift, textGeometricTransform, localeList, background, textDecoration, shadow, platformStyle, r22, 32768, null);
    }

    public /* synthetic */ SpanStyle(long r22, long r24, FontWeight r26, FontStyle r27, FontSynthesis r28, FontFamily r29, String r30, long r31, BaselineShift r33, TextGeometricTransform r34, LocaleList r35, long r36, TextDecoration r38, Shadow r39, PlatformSpanStyle r40, DrawStyle r41, int r42, DefaultConstructorMarker r43) {
        if ((r42 & 1) == 0) goto L5;
        long r1 = Color.Companion.m4402getUnspecified0d7_KjU();
    L7:
        if ((r42 & 2) == 0) goto L9;
        long r3 = TextUnit.Companion.m7178getUnspecifiedXSAIIZE();
    L11:
        if ((r42 & 4) == 0) goto L13;
        FontWeight r5 = null;
    L15:
        if ((r42 & 8) == 0) goto L17;
        FontStyle r7 = null;
    L19:
        if ((r42 & 16) == 0) goto L21;
        FontSynthesis r8 = null;
    L23:
        if ((r42 & 32) == 0) goto L25;
        FontFamily r9 = null;
    L27:
        if ((r42 & 64) == 0) goto L29;
        String r10 = null;
    L31:
        if ((r42 & 128) == 0) goto L33;
        long r11 = TextUnit.Companion.m7178getUnspecifiedXSAIIZE();
    L35:
        if ((r42 & 256) == 0) goto L37;
        BaselineShift r13 = null;
    L39:
        if ((r42 & 512) == 0) goto L41;
        TextGeometricTransform r14 = null;
    L43:
        if ((r42 & 1024) == 0) goto L45;
        LocaleList r15 = null;
    L47:
        if ((r42 & 2048) == 0) goto L49;
        long r16 = Color.Companion.m4402getUnspecified0d7_KjU();
    L51:
        if ((r42 & 4096) == 0) goto L53;
        TextDecoration r6 = null;
    L54:
        long r18 = r1;
        if ((r42 & 8192) == 0) goto L57;
        Shadow r2 = null;
    L59:
        if ((r42 & 16384) == 0) goto L61;
        PlatformSpanStyle r4 = null;
    L63:
        if ((r42 & 32768) == 0) goto L65;
        DrawStyle r0 = null;
    L66:
        DrawStyle r44 = r0;
        Shadow r45 = r2;
        PlatformSpanStyle r46 = r4;
        long r25 = r3;
        FontWeight r210 = r5;
        TextDecoration r310 = r6;
        FontStyle r211 = r7;
        FontSynthesis r212 = r8;
        FontFamily r32 = r9;
        String r37 = r10;
        long r311 = r11;
        BaselineShift r312 = r13;
        TextGeometricTransform r313 = r14;
        LocaleList r314 = r15;
        long r315 = r16;
        this(r18, r25, r210, r211, r212, r32, r37, r311, r312, r313, r314, r315, r310, r45, r46, r44, null);
        return;
    L65:
        r0 = r41;
        goto L66
    L61:
        r4 = r40;
        goto L63
    L57:
        r2 = r39;
        goto L59
    L53:
        r6 = r38;
        goto L54
    L49:
        r16 = r36;
        goto L51
    L45:
        r15 = r35;
        goto L47
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
        r5 = r26;
        goto L15
    L9:
        r3 = r24;
        goto L11
    L5:
        r1 = r22;
        goto L7
    }

    private SpanStyle(long color, long fontSize, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String fontFeatureSettings, long letterSpacing, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long background, TextDecoration textDecoration, Shadow shadow, PlatformSpanStyle platformStyle, DrawStyle drawStyle) {
        this(TextForegroundStyle.Companion.m6856from8_81llA(color), fontSize, fontWeight, fontStyle, fontSynthesis, fontFamily, fontFeatureSettings, letterSpacing, baselineShift, textGeometricTransform, localeList, background, textDecoration, shadow, platformStyle, drawStyle, null);
    }

    public /* synthetic */ SpanStyle(Brush r25, float r26, long r27, FontWeight r29, FontStyle r30, FontSynthesis r31, FontFamily r32, String r33, long r34, BaselineShift r36, TextGeometricTransform r37, LocaleList r38, long r39, TextDecoration r41, Shadow r42, PlatformSpanStyle r43, DrawStyle r44, int r45, DefaultConstructorMarker r46) {
        if ((r45 & 2) == 0) goto L5;
        float r4 = Float.NaN;
    L7:
        if ((r45 & 4) == 0) goto L9;
        long r5 = TextUnit.Companion.m7178getUnspecifiedXSAIIZE();
    L11:
        if ((r45 & 8) == 0) goto L13;
        FontWeight r7 = null;
    L15:
        if ((r45 & 16) == 0) goto L17;
        FontStyle r8 = null;
    L19:
        if ((r45 & 32) == 0) goto L21;
        FontSynthesis r9 = null;
    L23:
        if ((r45 & 64) == 0) goto L25;
        FontFamily r10 = null;
    L27:
        if ((r45 & 128) == 0) goto L29;
        String r11 = null;
    L31:
        if ((r45 & 256) == 0) goto L33;
        long r12 = TextUnit.Companion.m7178getUnspecifiedXSAIIZE();
    L35:
        if ((r45 & 512) == 0) goto L37;
        BaselineShift r14 = null;
    L39:
        if ((r45 & 1024) == 0) goto L41;
        TextGeometricTransform r15 = null;
    L43:
        if ((r45 & 2048) == 0) goto L45;
        LocaleList r16 = null;
    L47:
        if ((r45 & 4096) == 0) goto L49;
        long r17 = Color.Companion.m4402getUnspecified0d7_KjU();
    L51:
        if ((r45 & 8192) == 0) goto L53;
        TextDecoration r19 = null;
    L55:
        if ((r45 & 16384) == 0) goto L57;
        Shadow r20 = null;
    L59:
        if ((32768 & r45) == 0) goto L61;
        PlatformSpanStyle r21 = null;
    L63:
        if ((r45 & 65536) == 0) goto L65;
        DrawStyle r22 = null;
    L66:
        this(r25, r4, r5, r7, r8, r9, r10, r11, r12, r14, r15, r16, r17, r19, r20, r21, r22, null);
        return;
    L65:
        r22 = r44;
        goto L66
    L61:
        r21 = r43;
        goto L63
    L57:
        r20 = r42;
        goto L59
    L53:
        r19 = r41;
        goto L55
    L49:
        r17 = r39;
        goto L51
    L45:
        r16 = r38;
        goto L47
    L41:
        r15 = r37;
        goto L43
    L37:
        r14 = r36;
        goto L39
    L33:
        r12 = r34;
        goto L35
    L29:
        r11 = r33;
        goto L31
    L25:
        r10 = r32;
        goto L27
    L21:
        r9 = r31;
        goto L23
    L17:
        r8 = r30;
        goto L19
    L13:
        r7 = r29;
        goto L15
    L9:
        r5 = r27;
        goto L11
    L5:
        r4 = r26;
        goto L7
    }

    private SpanStyle(Brush brush, float alpha, long fontSize, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String fontFeatureSettings, long letterSpacing, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long background, TextDecoration textDecoration, Shadow shadow, PlatformSpanStyle platformStyle, DrawStyle drawStyle) {
        this(TextForegroundStyle.Companion.from(brush, alpha), fontSize, fontWeight, fontStyle, fontSynthesis, fontFamily, fontFeatureSettings, letterSpacing, baselineShift, textGeometricTransform, localeList, background, textDecoration, shadow, platformStyle, drawStyle, null);
    }

    /* JADX INFO: renamed from: getColor-0d7_KjU, reason: not valid java name */
    public final long m6358getColor0d7_KjU() {
        return this.textForegroundStyle.mo6721getColor0d7_KjU();
    }

    public final Brush getBrush() {
        return this.textForegroundStyle.getBrush();
    }

    public final float getAlpha() {
        return this.textForegroundStyle.getAlpha();
    }

    public static /* synthetic */ SpanStyle merge$default(SpanStyle r0, SpanStyle r1, int r2, Object r3) {
        if ((r2 & 1) == 0) goto L6;
        r1 = null;
    L6:
        return r0.merge(r1);
    }

    public final SpanStyle merge(SpanStyle other) {
        if (other != null) goto L6;
        return this;
    L6:
        return SpanStyleKt.m6363fastMergedSHsh3o(this, other.textForegroundStyle.mo6721getColor0d7_KjU(), other.textForegroundStyle.getBrush(), other.textForegroundStyle.getAlpha(), other.fontSize, other.fontWeight, other.fontStyle, other.fontSynthesis, other.fontFamily, other.fontFeatureSettings, other.letterSpacing, other.baselineShift, other.textGeometricTransform, other.localeList, other.background, other.textDecoration, other.shadow, other.platformStyle, other.drawStyle);
    }

    public final SpanStyle plus(SpanStyle other) {
        return merge(other);
    }

    /* JADX INFO: renamed from: copy-IuqyXdg$default, reason: not valid java name */
    public static /* synthetic */ SpanStyle m6350copyIuqyXdg$default(SpanStyle r18, long r19, long r21, FontWeight r23, FontStyle r24, FontSynthesis r25, FontFamily r26, String r27, long r28, BaselineShift r30, TextGeometricTransform r31, LocaleList r32, long r33, TextDecoration r35, Shadow r36, int r37, Object r38) {
        if ((r37 & 1) == 0) goto L5;
        long r2 = r18.m6358getColor0d7_KjU();
    L7:
        if ((r37 & 2) == 0) goto L9;
        long r4 = r18.fontSize;
    L11:
        if ((r37 & 4) == 0) goto L13;
        FontWeight r6 = r18.fontWeight;
    L15:
        if ((r37 & 8) == 0) goto L17;
        FontStyle r7 = r18.fontStyle;
    L19:
        if ((r37 & 16) == 0) goto L21;
        FontSynthesis r8 = r18.fontSynthesis;
    L23:
        if ((r37 & 32) == 0) goto L25;
        FontFamily r9 = r18.fontFamily;
    L27:
        if ((r37 & 64) == 0) goto L29;
        String r10 = r18.fontFeatureSettings;
    L31:
        if ((r37 & 128) == 0) goto L33;
        long r11 = r18.letterSpacing;
    L35:
        if ((r37 & 256) == 0) goto L37;
        BaselineShift r13 = r18.baselineShift;
    L39:
        if ((r37 & 512) == 0) goto L41;
        TextGeometricTransform r14 = r18.textGeometricTransform;
    L43:
        if ((r37 & 1024) == 0) goto L45;
        LocaleList r15 = r18.localeList;
    L46:
        long r16 = r2;
        if ((r37 & 2048) == 0) goto L49;
        long r3 = r18.background;
    L50:
        long r110 = r3;
        if ((r37 & 4096) == 0) goto L53;
        TextDecoration r5 = r18.textDecoration;
    L55:
        if ((r37 & 8192) == 0) goto L57;
        Shadow r1 = r18.shadow;
    L58:
        TextDecoration r39 = r5;
        long r22 = r4;
        FontWeight r29 = r6;
        FontStyle r210 = r7;
        FontSynthesis r211 = r8;
        FontFamily r212 = r9;
        String r213 = r10;
        long r214 = r11;
        BaselineShift r34 = r13;
        TextGeometricTransform r310 = r14;
        LocaleList r311 = r15;
        return r18.m6354copyIuqyXdg(r16, r22, r29, r210, r211, r212, r213, r214, r34, r310, r311, r110, r39, r1);
    L57:
        r1 = r36;
        goto L58
    L53:
        r5 = r35;
        goto L55
    L49:
        r3 = r33;
        goto L50
    L45:
        r15 = r32;
        goto L46
    L41:
        r14 = r31;
        goto L43
    L37:
        r13 = r30;
        goto L39
    L33:
        r11 = r28;
        goto L35
    L29:
        r10 = r27;
        goto L31
    L25:
        r9 = r26;
        goto L27
    L21:
        r8 = r25;
        goto L23
    L17:
        r7 = r24;
        goto L19
    L13:
        r6 = r23;
        goto L15
    L9:
        r4 = r21;
        goto L11
    L5:
        r2 = r19;
        goto L7
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "SpanStyle copy constructors that do not take new stable parameters like PlatformStyle, DrawStyle are deprecated. Please use the new stable copy constructor.")
    /* JADX INFO: renamed from: copy-IuqyXdg, reason: not valid java name */
    public final /* synthetic */ SpanStyle m6354copyIuqyXdg(long color, long fontSize, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String fontFeatureSettings, long letterSpacing, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long background, TextDecoration textDecoration, Shadow shadow) {
        if (Color.m4367equalsimpl0(color, m6358getColor0d7_KjU()) == false) goto L5;
        TextForegroundStyle r4 = this.textForegroundStyle;
    L7:
        return new SpanStyle(r4, fontSize, fontWeight, fontStyle, fontSynthesis, fontFamily, fontFeatureSettings, letterSpacing, baselineShift, textGeometricTransform, localeList, background, textDecoration, shadow, this.platformStyle, this.drawStyle, null);
    L5:
        r4 = TextForegroundStyle.Companion.m6856from8_81llA(color);
        goto L7
    }

    /* JADX INFO: renamed from: copy-2BkPm_w$default, reason: not valid java name */
    public static /* synthetic */ SpanStyle m6348copy2BkPm_w$default(SpanStyle r18, long r19, long r21, FontWeight r23, FontStyle r24, FontSynthesis r25, FontFamily r26, String r27, long r28, BaselineShift r30, TextGeometricTransform r31, LocaleList r32, long r33, TextDecoration r35, Shadow r36, PlatformSpanStyle r37, int r38, Object r39) {
        if ((r38 & 1) == 0) goto L5;
        long r2 = r18.m6358getColor0d7_KjU();
    L7:
        if ((r38 & 2) == 0) goto L9;
        long r4 = r18.fontSize;
    L11:
        if ((r38 & 4) == 0) goto L13;
        FontWeight r6 = r18.fontWeight;
    L15:
        if ((r38 & 8) == 0) goto L17;
        FontStyle r7 = r18.fontStyle;
    L19:
        if ((r38 & 16) == 0) goto L21;
        FontSynthesis r8 = r18.fontSynthesis;
    L23:
        if ((r38 & 32) == 0) goto L25;
        FontFamily r9 = r18.fontFamily;
    L27:
        if ((r38 & 64) == 0) goto L29;
        String r10 = r18.fontFeatureSettings;
    L31:
        if ((r38 & 128) == 0) goto L33;
        long r11 = r18.letterSpacing;
    L35:
        if ((r38 & 256) == 0) goto L37;
        BaselineShift r13 = r18.baselineShift;
    L39:
        if ((r38 & 512) == 0) goto L41;
        TextGeometricTransform r14 = r18.textGeometricTransform;
    L43:
        if ((r38 & 1024) == 0) goto L45;
        LocaleList r15 = r18.localeList;
    L46:
        long r16 = r2;
        if ((r38 & 2048) == 0) goto L49;
        long r3 = r18.background;
    L50:
        long r110 = r3;
        if ((r38 & 4096) == 0) goto L53;
        TextDecoration r5 = r18.textDecoration;
    L55:
        if ((r38 & 8192) == 0) goto L57;
        Shadow r12 = r18.shadow;
    L59:
        if ((r38 & 16384) == 0) goto L61;
        PlatformSpanStyle r1 = r18.platformStyle;
    L62:
        TextDecoration r310 = r5;
        Shadow r311 = r12;
        long r22 = r4;
        FontWeight r29 = r6;
        FontStyle r210 = r7;
        FontSynthesis r211 = r8;
        FontFamily r212 = r9;
        String r213 = r10;
        long r214 = r11;
        BaselineShift r34 = r13;
        TextGeometricTransform r312 = r14;
        LocaleList r313 = r15;
        return r18.m6352copy2BkPm_w(r16, r22, r29, r210, r211, r212, r213, r214, r34, r312, r313, r110, r310, r311, r1);
    L61:
        r1 = r37;
        goto L62
    L57:
        r12 = r36;
        goto L59
    L53:
        r5 = r35;
        goto L55
    L49:
        r3 = r33;
        goto L50
    L45:
        r15 = r32;
        goto L46
    L41:
        r14 = r31;
        goto L43
    L37:
        r13 = r30;
        goto L39
    L33:
        r11 = r28;
        goto L35
    L29:
        r10 = r27;
        goto L31
    L25:
        r9 = r26;
        goto L27
    L21:
        r8 = r25;
        goto L23
    L17:
        r7 = r24;
        goto L19
    L13:
        r6 = r23;
        goto L15
    L9:
        r4 = r21;
        goto L11
    L5:
        r2 = r19;
        goto L7
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "SpanStyle copy constructors that do not take new stable parameters like PlatformStyle, DrawStyle are deprecated. Please use the new stable copy constructor.")
    /* JADX INFO: renamed from: copy-2BkPm_w, reason: not valid java name */
    public final /* synthetic */ SpanStyle m6352copy2BkPm_w(long color, long fontSize, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String fontFeatureSettings, long letterSpacing, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long background, TextDecoration textDecoration, Shadow shadow, PlatformSpanStyle platformStyle) {
        if (Color.m4367equalsimpl0(color, m6358getColor0d7_KjU()) == false) goto L5;
        TextForegroundStyle r4 = this.textForegroundStyle;
    L6:
        DrawStyle r21 = null;
        TextForegroundStyle r3 = r4;
        return new SpanStyle(r3, fontSize, fontWeight, fontStyle, fontSynthesis, fontFamily, fontFeatureSettings, letterSpacing, baselineShift, textGeometricTransform, localeList, background, textDecoration, shadow, platformStyle, r21, 32768, null);
    L5:
        r4 = TextForegroundStyle.Companion.m6856from8_81llA(color);
        goto L6
    }

    /* JADX INFO: renamed from: copy-GSF8kmg$default, reason: not valid java name */
    public static /* synthetic */ SpanStyle m6349copyGSF8kmg$default(SpanStyle r19, long r20, long r22, FontWeight r24, FontStyle r25, FontSynthesis r26, FontFamily r27, String r28, long r29, BaselineShift r31, TextGeometricTransform r32, LocaleList r33, long r34, TextDecoration r36, Shadow r37, PlatformSpanStyle r38, DrawStyle r39, int r40, Object r41) {
        if ((r40 & 1) == 0) goto L5;
        long r2 = r19.m6358getColor0d7_KjU();
    L7:
        if ((r40 & 2) == 0) goto L9;
        long r4 = r19.fontSize;
    L11:
        if ((r40 & 4) == 0) goto L13;
        FontWeight r6 = r19.fontWeight;
    L15:
        if ((r40 & 8) == 0) goto L17;
        FontStyle r7 = r19.fontStyle;
    L19:
        if ((r40 & 16) == 0) goto L21;
        FontSynthesis r8 = r19.fontSynthesis;
    L23:
        if ((r40 & 32) == 0) goto L25;
        FontFamily r9 = r19.fontFamily;
    L27:
        if ((r40 & 64) == 0) goto L29;
        String r10 = r19.fontFeatureSettings;
    L31:
        if ((r40 & 128) == 0) goto L33;
        long r11 = r19.letterSpacing;
    L35:
        if ((r40 & 256) == 0) goto L37;
        BaselineShift r13 = r19.baselineShift;
    L39:
        if ((r40 & 512) == 0) goto L41;
        TextGeometricTransform r14 = r19.textGeometricTransform;
    L43:
        if ((r40 & 1024) == 0) goto L45;
        LocaleList r15 = r19.localeList;
    L46:
        long r16 = r2;
        if ((r40 & 2048) == 0) goto L49;
        long r3 = r19.background;
    L50:
        long r21 = r3;
        if ((r40 & 4096) == 0) goto L53;
        TextDecoration r5 = r19.textDecoration;
    L55:
        if ((r40 & 8192) == 0) goto L57;
        Shadow r12 = r19.shadow;
    L58:
        TextDecoration r23 = r5;
        if ((r40 & 16384) == 0) goto L61;
        PlatformSpanStyle r17 = r19.platformStyle;
    L63:
        if ((r40 & 32768) == 0) goto L65;
        DrawStyle r1 = r19.drawStyle;
    L66:
        PlatformSpanStyle r310 = r17;
        Shadow r311 = r12;
        long r210 = r4;
        FontWeight r211 = r6;
        FontStyle r212 = r7;
        FontSynthesis r213 = r8;
        FontFamily r214 = r9;
        String r215 = r10;
        long r30 = r11;
        BaselineShift r35 = r13;
        TextGeometricTransform r312 = r14;
        LocaleList r313 = r15;
        return r19.m6353copyGSF8kmg(r16, r210, r211, r212, r213, r214, r215, r30, r35, r312, r313, r21, r23, r311, r310, r1);
    L65:
        r1 = r39;
        goto L66
    L61:
        r17 = r38;
        goto L63
    L57:
        r12 = r37;
        goto L58
    L53:
        r5 = r36;
        goto L55
    L49:
        r3 = r34;
        goto L50
    L45:
        r15 = r33;
        goto L46
    L41:
        r14 = r32;
        goto L43
    L37:
        r13 = r31;
        goto L39
    L33:
        r11 = r29;
        goto L35
    L29:
        r10 = r28;
        goto L31
    L25:
        r9 = r27;
        goto L27
    L21:
        r8 = r26;
        goto L23
    L17:
        r7 = r25;
        goto L19
    L13:
        r6 = r24;
        goto L15
    L9:
        r4 = r22;
        goto L11
    L5:
        r2 = r20;
        goto L7
    }

    /* JADX INFO: renamed from: copy-GSF8kmg, reason: not valid java name */
    public final SpanStyle m6353copyGSF8kmg(long color, long fontSize, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String fontFeatureSettings, long letterSpacing, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long background, TextDecoration textDecoration, Shadow shadow, PlatformSpanStyle platformStyle, DrawStyle drawStyle) {
        if (Color.m4367equalsimpl0(color, m6358getColor0d7_KjU()) == false) goto L5;
        TextForegroundStyle r4 = this.textForegroundStyle;
    L6:
        TextForegroundStyle r3 = r4;
        return new SpanStyle(r3, fontSize, fontWeight, fontStyle, fontSynthesis, fontFamily, fontFeatureSettings, letterSpacing, baselineShift, textGeometricTransform, localeList, background, textDecoration, shadow, platformStyle, drawStyle, null);
    L5:
        r4 = TextForegroundStyle.Companion.m6856from8_81llA(color);
        goto L6
    }

    /* JADX INFO: renamed from: copy-NcG25M8$default, reason: not valid java name */
    public static /* synthetic */ SpanStyle m6351copyNcG25M8$default(SpanStyle r17, Brush r18, float r19, long r20, FontWeight r22, FontStyle r23, FontSynthesis r24, FontFamily r25, String r26, long r27, BaselineShift r29, TextGeometricTransform r30, LocaleList r31, long r32, TextDecoration r34, Shadow r35, PlatformSpanStyle r36, DrawStyle r37, int r38, Object r39) {
        if ((r38 & 2) == 0) goto L5;
        float r2 = r17.getAlpha();
    L7:
        if ((r38 & 4) == 0) goto L9;
        long r3 = r17.fontSize;
    L11:
        if ((r38 & 8) == 0) goto L13;
        FontWeight r5 = r17.fontWeight;
    L15:
        if ((r38 & 16) == 0) goto L17;
        FontStyle r6 = r17.fontStyle;
    L19:
        if ((r38 & 32) == 0) goto L21;
        FontSynthesis r7 = r17.fontSynthesis;
    L23:
        if ((r38 & 64) == 0) goto L25;
        FontFamily r8 = r17.fontFamily;
    L27:
        if ((r38 & 128) == 0) goto L29;
        String r9 = r17.fontFeatureSettings;
    L31:
        if ((r38 & 256) == 0) goto L33;
        long r10 = r17.letterSpacing;
    L35:
        if ((r38 & 512) == 0) goto L37;
        BaselineShift r12 = r17.baselineShift;
    L39:
        if ((r38 & 1024) == 0) goto L41;
        TextGeometricTransform r13 = r17.textGeometricTransform;
    L43:
        if ((r38 & 2048) == 0) goto L45;
        LocaleList r14 = r17.localeList;
    L47:
        if ((r38 & 4096) == 0) goto L49;
        long r4 = r17.background;
    L51:
        if ((r38 & 8192) == 0) goto L53;
        TextDecoration r11 = r17.textDecoration;
    L55:
        if ((r38 & 16384) == 0) goto L57;
        Shadow r15 = r17.shadow;
    L59:
        if ((r38 & 32768) == 0) goto L61;
        PlatformSpanStyle r1 = r17.platformStyle;
    L63:
        if ((r38 & 65536) == 0) goto L65;
        DrawStyle r16 = r17.drawStyle;
    L66:
        long r310 = r4;
        TextDecoration r311 = r11;
        FontWeight r28 = r5;
        FontStyle r210 = r6;
        FontSynthesis r211 = r7;
        FontFamily r212 = r8;
        String r213 = r9;
        long r214 = r10;
        BaselineShift r33 = r12;
        TextGeometricTransform r312 = r13;
        LocaleList r313 = r14;
        Shadow r314 = r15;
        long r215 = r3;
        float r21 = r2;
        return r17.m6355copyNcG25M8(r18, r21, r215, r28, r210, r211, r212, r213, r214, r33, r312, r313, r310, r311, r314, r1, r16);
    L65:
        r16 = r37;
        goto L66
    L61:
        r1 = r36;
        goto L63
    L57:
        r15 = r35;
        goto L59
    L53:
        r11 = r34;
        goto L55
    L49:
        r4 = r32;
        goto L51
    L45:
        r14 = r31;
        goto L47
    L41:
        r13 = r30;
        goto L43
    L37:
        r12 = r29;
        goto L39
    L33:
        r10 = r27;
        goto L35
    L29:
        r9 = r26;
        goto L31
    L25:
        r8 = r25;
        goto L27
    L21:
        r7 = r24;
        goto L23
    L17:
        r6 = r23;
        goto L19
    L13:
        r5 = r22;
        goto L15
    L9:
        r3 = r20;
        goto L11
    L5:
        r2 = r19;
        goto L7
    }

    /* JADX INFO: renamed from: copy-NcG25M8, reason: not valid java name */
    public final SpanStyle m6355copyNcG25M8(Brush brush, float alpha, long fontSize, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String fontFeatureSettings, long letterSpacing, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long background, TextDecoration textDecoration, Shadow shadow, PlatformSpanStyle platformStyle, DrawStyle drawStyle) {
        return new SpanStyle(TextForegroundStyle.Companion.from(brush, alpha), fontSize, fontWeight, fontStyle, fontSynthesis, fontFamily, fontFeatureSettings, letterSpacing, baselineShift, textGeometricTransform, localeList, background, textDecoration, shadow, platformStyle, drawStyle, null);
    }

    public boolean equals(Object other) {
        if (this != other) goto L6;
        return true;
    L6:
        if ((other instanceof SpanStyle) == true) goto L9;
        return false;
    L9:
        if (hasSameLayoutAffectingAttributes$ui_text_release((SpanStyle) other) == false) goto L14;
        if (hasSameNonLayoutAttributes$ui_text_release((SpanStyle) other) == false) goto L14;
        return true;
    L14:
        return false;
    }

    public final boolean hasSameLayoutAffectingAttributes$ui_text_release(SpanStyle other) {
        if (this != other) goto L6;
        return true;
    L6:
        if (TextUnit.m7164equalsimpl0(this.fontSize, other.fontSize) == true) goto L9;
        return false;
    L9:
        if (Intrinsics.areEqual(this.fontWeight, other.fontWeight) == true) goto L12;
        return false;
    L12:
        if (Intrinsics.areEqual(this.fontStyle, other.fontStyle) == true) goto L15;
        return false;
    L15:
        if (Intrinsics.areEqual(this.fontSynthesis, other.fontSynthesis) == true) goto L18;
        return false;
    L18:
        if (Intrinsics.areEqual(this.fontFamily, other.fontFamily) == true) goto L21;
        return false;
    L21:
        if (Intrinsics.areEqual(this.fontFeatureSettings, other.fontFeatureSettings) == true) goto L24;
        return false;
    L24:
        if (TextUnit.m7164equalsimpl0(this.letterSpacing, other.letterSpacing) == true) goto L27;
        return false;
    L27:
        if (Intrinsics.areEqual(this.baselineShift, other.baselineShift) == true) goto L30;
        return false;
    L30:
        if (Intrinsics.areEqual(this.textGeometricTransform, other.textGeometricTransform) == true) goto L33;
        return false;
    L33:
        if (Intrinsics.areEqual(this.localeList, other.localeList) == true) goto L36;
        return false;
    L36:
        if (Color.m4367equalsimpl0(this.background, other.background) == true) goto L39;
        return false;
    L39:
        if (Intrinsics.areEqual(this.platformStyle, other.platformStyle) == true) goto L41;
        return false;
    L41:
        return true;
    }

    public final boolean hasSameNonLayoutAttributes$ui_text_release(SpanStyle other) {
        if (Intrinsics.areEqual(this.textForegroundStyle, other.textForegroundStyle) == true) goto L6;
        return false;
    L6:
        if (Intrinsics.areEqual(this.textDecoration, other.textDecoration) == true) goto L9;
        return false;
    L9:
        if (Intrinsics.areEqual(this.shadow, other.shadow) == true) goto L12;
        return false;
    L12:
        if (Intrinsics.areEqual(this.drawStyle, other.drawStyle) == true) goto L14;
        return false;
    L14:
        return true;
    }

    public int hashCode() {
        int result = Color.m4373hashCodeimpl(m6358getColor0d7_KjU());
        int r1 = result * 31;
        Brush r2 = getBrush();
        int r3 = 0;
        if (r2 == null) goto L5;
        int r4 = r2.hashCode();
    L6:
        int result2 = r1 + r4;
        int result3 = ((((result2 * 31) + Float.hashCode(getAlpha())) * 31) + TextUnit.m7168hashCodeimpl(this.fontSize)) * 31;
        FontWeight r5 = this.fontWeight;
        if (r5 == null) goto L9;
        int r6 = r5.hashCode();
    L10:
        int result4 = (result3 + r6) * 31;
        FontStyle r7 = this.fontStyle;
        if (r7 == null) goto L13;
        int r8 = FontStyle.m6529hashCodeimpl(r7.m6531unboximpl());
    L14:
        int result5 = (result4 + r8) * 31;
        FontSynthesis r9 = this.fontSynthesis;
        if (r9 == null) goto L17;
        int r10 = FontSynthesis.m6540hashCodeimpl(r9.m6544unboximpl());
    L18:
        int result6 = (result5 + r10) * 31;
        FontFamily r11 = this.fontFamily;
        if (r11 == null) goto L21;
        int r12 = r11.hashCode();
    L22:
        int result7 = (result6 + r12) * 31;
        String r13 = this.fontFeatureSettings;
        if (r13 == null) goto L25;
        int r14 = r13.hashCode();
    L26:
        int result8 = (((result7 + r14) * 31) + TextUnit.m7168hashCodeimpl(this.letterSpacing)) * 31;
        BaselineShift r15 = this.baselineShift;
        if (r15 == null) goto L29;
        int r16 = BaselineShift.m6711hashCodeimpl(r15.m6713unboximpl());
    L30:
        int result9 = (result8 + r16) * 31;
        TextGeometricTransform r17 = this.textGeometricTransform;
        if (r17 == null) goto L33;
        int r18 = r17.hashCode();
    L34:
        int result10 = (result9 + r18) * 31;
        LocaleList r19 = this.localeList;
        if (r19 == null) goto L37;
        int r20 = r19.hashCode();
    L38:
        int result11 = (((result10 + r20) * 31) + Color.m4373hashCodeimpl(this.background)) * 31;
        TextDecoration r21 = this.textDecoration;
        if (r21 == null) goto L41;
        int r22 = r21.hashCode();
    L42:
        int result12 = (result11 + r22) * 31;
        Shadow r23 = this.shadow;
        if (r23 == null) goto L45;
        int r24 = r23.hashCode();
    L46:
        int result13 = (result12 + r24) * 31;
        PlatformSpanStyle r25 = this.platformStyle;
        if (r25 == null) goto L49;
        int r26 = r25.hashCode();
    L50:
        int result14 = (result13 + r26) * 31;
        DrawStyle r27 = this.drawStyle;
        if (r27 == null) goto L54;
        r3 = r27.hashCode();
    L54:
        return result14 + r3;
    L49:
        r26 = 0;
        goto L50
    L45:
        r24 = 0;
        goto L46
    L41:
        r22 = 0;
        goto L42
    L37:
        r20 = 0;
        goto L38
    L33:
        r18 = 0;
        goto L34
    L29:
        r16 = 0;
        goto L30
    L25:
        r14 = 0;
        goto L26
    L21:
        r12 = 0;
        goto L22
    L17:
        r10 = 0;
        goto L18
    L13:
        r8 = 0;
        goto L14
    L9:
        r6 = 0;
        goto L10
    L5:
        r4 = 0;
        goto L6
    }

    public final int hashCodeLayoutAffectingAttributes$ui_text_release() {
        int result = TextUnit.m7168hashCodeimpl(this.fontSize);
        int r1 = result * 31;
        FontWeight r2 = this.fontWeight;
        int r3 = 0;
        if (r2 == null) goto L5;
        int r4 = r2.hashCode();
    L6:
        int result2 = r1 + r4;
        int result3 = result2 * 31;
        FontStyle r5 = this.fontStyle;
        if (r5 == null) goto L9;
        int r6 = FontStyle.m6529hashCodeimpl(r5.m6531unboximpl());
    L10:
        int result4 = (result3 + r6) * 31;
        FontSynthesis r7 = this.fontSynthesis;
        if (r7 == null) goto L13;
        int r8 = FontSynthesis.m6540hashCodeimpl(r7.m6544unboximpl());
    L14:
        int result5 = (result4 + r8) * 31;
        FontFamily r9 = this.fontFamily;
        if (r9 == null) goto L17;
        int r10 = r9.hashCode();
    L18:
        int result6 = (result5 + r10) * 31;
        String r11 = this.fontFeatureSettings;
        if (r11 == null) goto L21;
        int r12 = r11.hashCode();
    L22:
        int result7 = (((result6 + r12) * 31) + TextUnit.m7168hashCodeimpl(this.letterSpacing)) * 31;
        BaselineShift r13 = this.baselineShift;
        if (r13 == null) goto L25;
        int r14 = BaselineShift.m6711hashCodeimpl(r13.m6713unboximpl());
    L26:
        int result8 = (result7 + r14) * 31;
        TextGeometricTransform r15 = this.textGeometricTransform;
        if (r15 == null) goto L29;
        int r16 = r15.hashCode();
    L30:
        int result9 = (result8 + r16) * 31;
        LocaleList r17 = this.localeList;
        if (r17 == null) goto L33;
        int r18 = r17.hashCode();
    L34:
        int result10 = (((result9 + r18) * 31) + Color.m4373hashCodeimpl(this.background)) * 31;
        PlatformSpanStyle r19 = this.platformStyle;
        if (r19 == null) goto L38;
        r3 = r19.hashCode();
    L38:
        return result10 + r3;
    L33:
        r18 = 0;
        goto L34
    L29:
        r16 = 0;
        goto L30
    L25:
        r14 = 0;
        goto L26
    L21:
        r12 = 0;
        goto L22
    L17:
        r10 = 0;
        goto L18
    L13:
        r8 = 0;
        goto L14
    L9:
        r6 = 0;
        goto L10
    L5:
        r4 = 0;
        goto L6
    }

    public String toString() {
        StringBuilder r0 = new StringBuilder();
        r0.append("SpanStyle(color=").append(Color.m4374toStringimpl(m6358getColor0d7_KjU())).append(", brush=").append(getBrush()).append(", alpha=").append(getAlpha()).append(", fontSize=").append(TextUnit.m7174toStringimpl(this.fontSize)).append(", fontWeight=").append(this.fontWeight).append(", fontStyle=").append(this.fontStyle).append(", fontSynthesis=").append(this.fontSynthesis).append(", fontFamily=").append(this.fontFamily).append(", fontFeatureSettings=").append(this.fontFeatureSettings).append(", letterSpacing=").append(TextUnit.m7174toStringimpl(this.letterSpacing)).append(", baselineShift=").append(this.baselineShift).append(", textGeometricTransform=");
        r0.append(this.textGeometricTransform).append(", localeList=").append(this.localeList).append(", background=").append(Color.m4374toStringimpl(this.background)).append(", textDecoration=").append(this.textDecoration).append(", shadow=").append(this.shadow).append(", platformStyle=").append(this.platformStyle).append(", drawStyle=").append(this.drawStyle).append(')');
        return r0.toString();
    }
}
