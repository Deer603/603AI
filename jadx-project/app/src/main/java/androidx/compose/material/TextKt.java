package androidx.compose.material;

import androidx.compose.foundation.text.BasicTextKt;
import androidx.compose.foundation.text.InlineTextContent;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorProducer;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextOverflow;
import androidx.compose.ui.unit.TextUnit;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import androidx.profileinstaller.ProfileVerifier;
import java.util.Map;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: Text.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u008a\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\u001a(\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00022\u0011\u0010\b\u001a\r\u0012\u0004\u0012\u00020\u00060\t¢\u0006\u0002\b\nH\u0007¢\u0006\u0002\u0010\u000b\u001aæ\u0001\u0010\f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00122\b\b\u0002\u0010\u0013\u001a\u00020\u00142\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00162\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00182\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\b\b\u0002\u0010\u001b\u001a\u00020\u00142\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001d2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001f2\b\b\u0002\u0010 \u001a\u00020\u00142\b\b\u0002\u0010!\u001a\u00020\"2\b\b\u0002\u0010#\u001a\u00020$2\b\b\u0002\u0010%\u001a\u00020&2\b\b\u0002\u0010'\u001a\u00020&2\u0014\b\u0002\u0010(\u001a\u000e\u0012\u0004\u0012\u00020*\u0012\u0004\u0012\u00020+0)2\u0014\b\u0002\u0010,\u001a\u000e\u0012\u0004\u0012\u00020.\u0012\u0004\u0012\u00020\u00060-2\b\b\u0002\u0010/\u001a\u00020\u0002H\u0007ø\u0001\u0000¢\u0006\u0004\b0\u00101\u001aÜ\u0001\u0010\f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00122\b\b\u0002\u0010\u0013\u001a\u00020\u00142\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00162\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00182\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\b\b\u0002\u0010\u001b\u001a\u00020\u00142\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001d2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001f2\b\b\u0002\u0010 \u001a\u00020\u00142\b\b\u0002\u0010!\u001a\u00020\"2\b\b\u0002\u0010#\u001a\u00020$2\b\b\u0002\u0010%\u001a\u00020&2\u0014\b\u0002\u0010(\u001a\u000e\u0012\u0004\u0012\u00020*\u0012\u0004\u0012\u00020+0)2\u0014\b\u0002\u0010,\u001a\u000e\u0012\u0004\u0012\u00020.\u0012\u0004\u0012\u00020\u00060-2\b\b\u0002\u0010/\u001a\u00020\u0002H\u0007ø\u0001\u0000¢\u0006\u0004\b2\u00103\u001aÆ\u0001\u0010\f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020*2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00122\b\b\u0002\u0010\u0013\u001a\u00020\u00142\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00162\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00182\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\b\b\u0002\u0010\u001b\u001a\u00020\u00142\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001d2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001f2\b\b\u0002\u0010 \u001a\u00020\u00142\b\b\u0002\u0010!\u001a\u00020\"2\b\b\u0002\u0010#\u001a\u00020$2\b\b\u0002\u0010%\u001a\u00020&2\u0014\b\u0002\u0010,\u001a\u000e\u0012\u0004\u0012\u00020.\u0012\u0004\u0012\u00020\u00060-2\b\b\u0002\u0010/\u001a\u00020\u0002H\u0007ø\u0001\u0000¢\u0006\u0004\b4\u00105\u001aÒ\u0001\u0010\f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020*2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00122\b\b\u0002\u0010\u0013\u001a\u00020\u00142\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00162\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00182\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\b\b\u0002\u0010\u001b\u001a\u00020\u00142\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001d2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001f2\b\b\u0002\u0010 \u001a\u00020\u00142\b\b\u0002\u0010!\u001a\u00020\"2\b\b\u0002\u0010#\u001a\u00020$2\b\b\u0002\u0010%\u001a\u00020&2\b\b\u0002\u0010'\u001a\u00020&2\u0016\b\u0002\u0010,\u001a\u0010\u0012\u0004\u0012\u00020.\u0012\u0004\u0012\u00020\u0006\u0018\u00010-2\b\b\u0002\u0010/\u001a\u00020\u0002H\u0007ø\u0001\u0000¢\u0006\u0004\b2\u00106\"\u0017\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u0003\u0010\u0004\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u00067"}, d2 = {"LocalTextStyle", "Landroidx/compose/runtime/ProvidableCompositionLocal;", "Landroidx/compose/ui/text/TextStyle;", "getLocalTextStyle", "()Landroidx/compose/runtime/ProvidableCompositionLocal;", "ProvideTextStyle", "", "value", "content", "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "(Landroidx/compose/ui/text/TextStyle;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "Text", "text", "Landroidx/compose/ui/text/AnnotatedString;", "modifier", "Landroidx/compose/ui/Modifier;", "color", "Landroidx/compose/ui/graphics/Color;", "fontSize", "Landroidx/compose/ui/unit/TextUnit;", "fontStyle", "Landroidx/compose/ui/text/font/FontStyle;", "fontWeight", "Landroidx/compose/ui/text/font/FontWeight;", "fontFamily", "Landroidx/compose/ui/text/font/FontFamily;", "letterSpacing", "textDecoration", "Landroidx/compose/ui/text/style/TextDecoration;", "textAlign", "Landroidx/compose/ui/text/style/TextAlign;", "lineHeight", "overflow", "Landroidx/compose/ui/text/style/TextOverflow;", "softWrap", "", "maxLines", "", "minLines", "inlineContent", "", "", "Landroidx/compose/foundation/text/InlineTextContent;", "onTextLayout", "Lkotlin/Function1;", "Landroidx/compose/ui/text/TextLayoutResult;", "style", "Text-IbK3jfQ", "(Landroidx/compose/ui/text/AnnotatedString;Landroidx/compose/ui/Modifier;JJLandroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontFamily;JLandroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/text/style/TextAlign;JIZIILjava/util/Map;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/runtime/Composer;III)V", "Text--4IGK_g", "(Landroidx/compose/ui/text/AnnotatedString;Landroidx/compose/ui/Modifier;JJLandroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontFamily;JLandroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/text/style/TextAlign;JIZILjava/util/Map;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/runtime/Composer;III)V", "Text-fLXpl1I", "(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLandroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontFamily;JLandroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/text/style/TextAlign;JIZILkotlin/jvm/functions/Function1;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/runtime/Composer;III)V", "(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLandroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontFamily;JLandroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/text/style/TextAlign;JIZIILkotlin/jvm/functions/Function1;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/runtime/Composer;III)V", "material_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class TextKt {
    private static final ProvidableCompositionLocal<TextStyle> LocalTextStyle = null;

    /* JADX INFO: renamed from: Text--4IGK_g, reason: not valid java name */
    public static final void m1843Text4IGK_g(final String text, Modifier modifier, long color, long fontSize, FontStyle fontStyle, FontWeight fontWeight, FontFamily fontFamily, long letterSpacing, TextDecoration textDecoration, TextAlign textAlign, long lineHeight, int overflow, boolean softWrap, int maxLines, int minLines, Function1<? super TextLayoutResult, Unit> r77, TextStyle style, Composer $composer, final int $changed, final int $changed1, final int r82) {
        Composer $composer2 = $composer.startRestartGroup(1028090691);
        ComposerKt.sourceInformation($composer2, "C(Text)P(14,9,0:c#ui.graphics.Color,2:c#ui.unit.TextUnit,3:c#ui.text.font.FontStyle,4!1,5:c#ui.unit.TextUnit,16,15:c#ui.text.style.TextAlign,6:c#ui.unit.TextUnit,11:c#ui.text.style.TextOverflow,12)128@6955L7,129@7009L7,158@7912L30,139@7268L680:Text.kt#jmzs0o");
        int $dirty = $changed;
        int $dirty1 = $changed1;
        if ((r82 & 1) == 0) goto L6;
        $dirty = $dirty | 6;
        String r6 = text;
    L13:
        int r9 = r82 & 2;
        if (r9 == 0) goto L17;
        $dirty = $dirty | 48;
        Modifier modifier2 = modifier;
    L24:
        int r13 = r82 & 4;
        if (r13 == 0) goto L28;
        $dirty = $dirty | 384;
        long color2 = color;
    L35:
        int r17 = r82 & 8;
        int r18 = 2048;
        if (r17 == 0) goto L39;
        $dirty = $dirty | 3072;
        long fontSize2 = fontSize;
    L46:
        int r22 = r82 & 16;
        int r23 = 16384;
        if (r22 == 0) goto L50;
        $dirty = $dirty | 24576;
        final FontStyle fontStyle2 = fontStyle;
    L57:
        int r26 = r82 & 32;
        if (r26 == 0) goto L61;
        $dirty = $dirty | ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
        FontWeight fontWeight2 = fontWeight;
    L68:
        int r30 = r82 & 64;
        if (r30 == 0) goto L72;
        $dirty = $dirty | 1572864;
        FontFamily fontFamily2 = fontFamily;
    L79:
        int $dirty2 = r82 & 128;
        if ($dirty2 == 0) goto L83;
        int $dirty3 = $dirty | 12582912;
    L90:
        int $dirty4 = r82 & 256;
        if ($dirty4 == 0) goto L94;
        $dirty3 = $dirty3 | 100663296;
    L101:
        int $dirty5 = r82 & 512;
        if ($dirty5 == 0) goto L105;
        $dirty3 = $dirty3 | 805306368;
    L112:
        int $dirty6 = $dirty3;
        int $dirty7 = r82 & 1024;
        if ($dirty7 == 0) goto L115;
        $dirty1 = $dirty1 | 6;
    L123:
        int $dirty8 = r82 & 2048;
        if ($dirty8 == 0) goto L127;
        $dirty1 = $dirty1 | 48;
    L134:
        int $dirty9 = $dirty1;
        int r5 = r82 & 4096;
        if (r5 == 0) goto L137;
        int $dirty10 = $dirty9 | 384;
    L146:
        int r7 = r82 & 8192;
        if (r7 == 0) goto L149;
        int $dirty11 = $dirty10 | 3072;
    L157:
        int r8 = r82 & 16384;
        if (r8 == 0) goto L161;
        $dirty11 = $dirty11 | 24576;
    L168:
        int r19 = r82 & 32768;
        if (r19 == 0) goto L172;
        $dirty11 = $dirty11 | ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
    L180:
        if (($changed1 & 1572864) != 0) goto L190;
        if ((r82 & 65536) != 0) goto L187;
        if ($composer2.changed(style) == false) goto L187;
        int r24 = 1048576;
    L188:
        $dirty11 = $dirty11 | r24;
    L187:
        r24 = 524288;
    L190:
        boolean r25 = false;
        if (($dirty6 & 306783379) == 306783378) goto L193;
    L196:
        boolean r1 = true;
    L198:
        if ($composer2.shouldExecute(r1, $dirty6 & 1) == false) goto L282;
        $composer2.startDefaults();
        ComposerKt.sourceInformation($composer2, "109@5743L7");
        if (($changed & 1) != 0) goto L202;
    L208:
        if (r9 == 0) goto L210;
        modifier2 = Modifier.Companion;
    L210:
        if (r13 == 0) goto L212;
        color2 = Color.Companion.m4402getUnspecified0d7_KjU();
    L212:
        if (r17 == 0) goto L214;
        fontSize2 = TextUnit.Companion.m7178getUnspecifiedXSAIIZE();
    L214:
        if (r22 == 0) goto L216;
        fontStyle2 = null;
    L216:
        if (r26 == 0) goto L218;
        fontWeight2 = null;
    L218:
        if (r30 == 0) goto L220;
        fontFamily2 = null;
    L220:
        if ($dirty2 == 0) goto L222;
        long letterSpacing2 = TextUnit.Companion.m7178getUnspecifiedXSAIIZE();
    L223:
        if ($dirty4 == 0) goto L225;
        TextDecoration textDecoration2 = null;
    L226:
        if ($dirty5 == 0) goto L228;
        final TextAlign textAlign2 = null;
    L229:
        if ($dirty7 == 0) goto L231;
        long lineHeight2 = TextUnit.Companion.m7178getUnspecifiedXSAIIZE();
    L232:
        if ($dirty8 == 0) goto L234;
        int overflow2 = TextOverflow.Companion.m6886getClipgIe3tQ8();
    L235:
        if (r5 == 0) goto L237;
        boolean softWrap2 = true;
    L238:
        if (r7 == 0) goto L240;
        final int maxLines2 = Integer.MAX_VALUE;
    L241:
        if (r8 == 0) goto L243;
        int minLines2 = 1;
    L244:
        if (r19 == 0) goto L246;
        Function1<? super TextLayoutResult, Unit> r110 = null;
    L248:
        if ((r82 & 65536) == 0) goto L250;
        ProvidableCompositionLocal<TextStyle> r2 = LocalTextStyle;
        TextDecoration textDecoration3 = textDecoration2;
        ComposerKt.sourceInformationMarkerStart($composer2, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
        Object r3 = $composer2.consume(r2);
        ComposerKt.sourceInformationMarkerEnd($composer2);
        TextDecoration textDecoration4 = textDecoration3;
        $dirty11 = $dirty11 & (-3670017);
        FontStyle fontStyle3 = fontStyle2;
        long fontSize3 = fontSize2;
        FontWeight fontWeight3 = fontWeight2;
        FontFamily fontFamily3 = fontFamily2;
        long letterSpacing3 = letterSpacing2;
        long lineHeight3 = lineHeight2;
        TextStyle style2 = (TextStyle) r3;
    L251:
        $composer2.endDefaults();
        if (ComposerKt.isTraceInProgress() == false) goto L254;
        ComposerKt.traceEventStart(1028090691, $dirty6, $dirty11, "androidx.compose.material.Text (Text.kt:110)");
    L254:
        ProvidableCompositionLocal<Color> r4 = ContentColorKt.getLocalContentColor();
        ComposerKt.sourceInformationMarkerStart($composer2, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
        Object r10 = $composer2.consume(r4);
        ComposerKt.sourceInformationMarkerEnd($composer2);
        long localContentColor = ((Color) r10).m4376unboximpl();
        ProvidableCompositionLocal<Float> r11 = ContentAlphaKt.getLocalContentAlpha();
        ComposerKt.sourceInformationMarkerStart($composer2, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
        Object r14 = $composer2.consume(r11);
        ComposerKt.sourceInformationMarkerEnd($composer2);
        float localContentAlpha = ((Number) r14).floatValue();
        long $this$isSpecified$iv = color2;
        if ($this$isSpecified$iv == 16) goto L257;
        boolean r12 = true;
    L258:
        if (r12 == false) goto L260;
        final long overrideColorOrUnspecified = color2;
    L267:
        if (textAlign2 == null) goto L269;
        int r15 = textAlign2.m6834unboximpl();
    L270:
        TextStyle r16 = TextStyle.m6437mergedA7vx0o$default(style2, 0, fontSize3, fontWeight3, fontStyle3, null, fontFamily3, null, letterSpacing3, null, null, null, 0, textDecoration4, null, null, r15, 0, lineHeight3, null, null, 0, 0, null, null, 16609105, null);
        int $dirty12 = $dirty6;
        ComposerKt.sourceInformationMarkerStart($composer2, 1041445489, "CC(remember):Text.kt#9igjgp");
        boolean invalid$iv = $composer2.changed(overrideColorOrUnspecified);
        Object it$iv = $composer2.rememberedValue();
        if (invalid$iv == true) goto L277;
        if (it$iv == Composer.Companion.getEmpty()) goto L277;
    L278:
        ComposerKt.sourceInformationMarkerEnd($composer2);
        String r59 = r6;
        Modifier modifier3 = modifier2;
        int maxLines3 = maxLines2;
        Function1<? super TextLayoutResult, Unit> r62 = r110;
        int overflow3 = overflow2;
        boolean softWrap3 = softWrap2;
        BasicTextKt.m1035BasicTextVhcvRP8(r59, modifier3, r16, r62, overflow3, softWrap3, maxLines3, minLines2, (ColorProducer) it$iv, $composer2, (((((($dirty12 & 14) | ($dirty12 & 112)) | (($dirty11 >> 6) & 7168)) | (($dirty11 << 9) & 57344)) | (($dirty11 << 9) & 458752)) | (($dirty11 << 9) & 3670016)) | (29360128 & ($dirty11 << 9)), 0);
        Composer $composer3 = $composer2;
        if (ComposerKt.isTraceInProgress() == false) goto L281;
        ComposerKt.traceEventEnd();
    L281:
        final Modifier modifier4 = modifier2;
        final int overflow4 = overflow2;
        final boolean softWrap4 = softWrap2;
        final TextStyle style3 = style2;
        fontStyle2 = fontStyle3;
        final long letterSpacing4 = letterSpacing3;
        final TextDecoration textDecoration5 = textDecoration4;
        final long lineHeight4 = lineHeight3;
        final Function1<? super TextLayoutResult, Unit> r20 = r110;
        final int minLines3 = minLines2;
        final long fontSize4 = fontSize3;
        final long color3 = color2;
        final FontWeight fontWeight4 = fontWeight3;
        final FontFamily fontFamily4 = fontFamily3;
    L283:
        ScopeUpdateScope r0 = $composer3.endRestartGroup();
        if (r0 == null) goto L287;
        r0.updateScope(new TextKt$Text$2(text, modifier4, color3, fontSize4, fontStyle2, fontWeight4, fontFamily4, letterSpacing4, textDecoration5, textAlign2, lineHeight4, overflow4, softWrap4, maxLines2, minLines3, r20, style3, $changed, $changed1, r82));
        return;
    L287:
        return;
    L277:
        Object value$iv = (ColorProducer) new TextKt$Text$1$1(overrideColorOrUnspecified);
        $composer2.updateRememberedValue(value$iv);
        it$iv = value$iv;
        goto L278
    L269:
        r15 = TextAlign.Companion.m6841getUnspecifiede0LSkKk();
        goto L270
    L260:
        long $this$isSpecified$iv2 = style2.m6447getColor0d7_KjU();
        if ($this$isSpecified$iv2 == 16) goto L263;
        r25 = true;
    L263:
        if (r25 == false) goto L265;
        overrideColorOrUnspecified = style2.m6447getColor0d7_KjU();
        goto L267
    L265:
        overrideColorOrUnspecified = Color.m4365copywmQWz5c$default(localContentColor, localContentAlpha, 0.0f, 0.0f, 0.0f, 14, null);
        goto L267
    L257:
        r12 = false;
        goto L258
    L250:
        textDecoration4 = textDecoration2;
        fontStyle3 = fontStyle2;
        fontWeight3 = fontWeight2;
        fontFamily3 = fontFamily2;
        letterSpacing3 = letterSpacing2;
        lineHeight3 = lineHeight2;
        style2 = style;
        fontSize3 = fontSize2;
        goto L251
    L246:
        r110 = r77;
        goto L248
    L243:
        minLines2 = minLines;
        goto L244
    L240:
        maxLines2 = maxLines;
        goto L241
    L237:
        softWrap2 = softWrap;
        goto L238
    L234:
        overflow2 = overflow;
        goto L235
    L231:
        lineHeight2 = lineHeight;
        goto L232
    L228:
        textAlign2 = textAlign;
        goto L229
    L225:
        textDecoration2 = textDecoration;
        goto L226
    L222:
        letterSpacing2 = letterSpacing;
        goto L223
    L202:
        if ($composer2.getDefaultsInvalid() == true) goto L208;
        $composer2.skipToGroupEnd();
        if ((r82 & 65536) == 0) goto L207;
        letterSpacing3 = letterSpacing;
        textDecoration4 = textDecoration;
        textAlign2 = textAlign;
        lineHeight3 = lineHeight;
        overflow2 = overflow;
        softWrap2 = softWrap;
        maxLines2 = maxLines;
        minLines2 = minLines;
        r110 = r77;
        style2 = style;
        $dirty11 = (-3670017) & $dirty11;
        fontStyle3 = fontStyle2;
        fontSize3 = fontSize2;
        fontWeight3 = fontWeight2;
        fontFamily3 = fontFamily2;
        goto L251
    L207:
        letterSpacing3 = letterSpacing;
        textDecoration4 = textDecoration;
        textAlign2 = textAlign;
        lineHeight3 = lineHeight;
        overflow2 = overflow;
        softWrap2 = softWrap;
        maxLines2 = maxLines;
        minLines2 = minLines;
        r110 = r77;
        style2 = style;
        fontStyle3 = fontStyle2;
        fontSize3 = fontSize2;
        fontWeight3 = fontWeight2;
        fontFamily3 = fontFamily2;
        goto L251
    L282:
        $dirty12 = $dirty6;
        $composer3 = $composer2;
        $composer3.skipToGroupEnd();
        textAlign2 = textAlign;
        overflow4 = overflow;
        softWrap4 = softWrap;
        maxLines2 = maxLines;
        minLines3 = minLines;
        r20 = r77;
        style3 = style;
        color3 = color2;
        fontSize4 = fontSize2;
        modifier4 = modifier2;
        fontWeight4 = fontWeight2;
        fontFamily4 = fontFamily2;
        letterSpacing4 = letterSpacing;
        textDecoration5 = textDecoration;
        lineHeight4 = lineHeight;
        goto L283
    L193:
        if ((599187 & $dirty11) != 599186) goto L196;
        r1 = false;
        goto L198
    L172:
        if (($changed1 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) != 0) goto L180;
        if ($composer2.changedInstance(r77) == false) goto L176;
        int r27 = 131072;
    L177:
        $dirty11 = $dirty11 | r27;
        goto L180
    L176:
        r27 = 65536;
        goto L177
    L161:
        if (($changed1 & 24576) != 0) goto L168;
        if ($composer2.changed(minLines) == true) goto L166;
        r23 = 8192;
    L166:
        $dirty11 = $dirty11 | r23;
        goto L168
    L149:
        int $dirty13 = $dirty10;
        int $dirty14 = $changed1 & 3072;
        if ($dirty14 == 0) goto L152;
        $dirty11 = $dirty13;
        goto L157
    L152:
        if ($composer2.changed(maxLines) == true) goto L155;
        r18 = 1024;
    L155:
        $dirty11 = $dirty13 | r18;
        goto L157
    L137:
        int $dirty15 = $dirty9;
        int $dirty16 = $changed1 & 384;
        if ($dirty16 != 0) goto L145;
        if ($composer2.changed(softWrap) == false) goto L142;
        int r29 = 256;
    L143:
        $dirty15 = $dirty15 | r29;
        goto L145
    L142:
        r29 = 128;
    L145:
        $dirty10 = $dirty15;
        goto L146
    L127:
        if (($changed1 & 48) != 0) goto L134;
        if ($composer2.changed(overflow) == false) goto L131;
        int r28 = 32;
    L132:
        $dirty1 = $dirty1 | r28;
        goto L134
    L131:
        r28 = 16;
        goto L132
    L115:
        int $dirty17 = $changed1 & 6;
        if ($dirty17 != 0) goto L123;
        if ($composer2.changed(lineHeight) == false) goto L120;
        int r21 = 4;
    L121:
        $dirty1 = $dirty1 | r21;
        goto L123
    L120:
        r21 = 2;
        goto L121
    L105:
        if (($changed & 805306368) != 0) goto L112;
        if ($composer2.changed(textAlign) == false) goto L109;
        int r38 = 536870912;
    L110:
        $dirty3 = $dirty3 | r38;
        goto L112
    L109:
        r38 = 268435456;
        goto L110
    L94:
        if (($changed & 100663296) != 0) goto L101;
        if ($composer2.changed(textDecoration) == false) goto L98;
        int r37 = AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
    L99:
        $dirty3 = $dirty3 | r37;
        goto L101
    L98:
        r37 = 33554432;
        goto L99
    L83:
        if (($changed & 12582912) != 0) goto L89;
        int $dirty18 = $dirty;
        if ($composer2.changed(letterSpacing) == false) goto L87;
        int r35 = 8388608;
    L88:
        $dirty3 = $dirty18 | r35;
        goto L90
    L87:
        r35 = 4194304;
        goto L88
    L89:
        $dirty3 = $dirty;
        goto L90
    L72:
        if (($changed & 1572864) != 0) goto L78;
        fontFamily2 = fontFamily;
        if ($composer2.changed(fontFamily2) == false) goto L76;
        int r33 = 1048576;
    L77:
        $dirty = $dirty | r33;
        goto L79
    L76:
        r33 = 524288;
        goto L77
    L78:
        fontFamily2 = fontFamily;
        goto L79
    L61:
        if (($changed & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) != 0) goto L67;
        fontWeight2 = fontWeight;
        if ($composer2.changed(fontWeight2) == false) goto L65;
        int r31 = 131072;
    L66:
        $dirty = $dirty | r31;
        goto L68
    L65:
        r31 = 65536;
        goto L66
    L67:
        fontWeight2 = fontWeight;
        goto L68
    L50:
        if (($changed & 24576) != 0) goto L56;
        fontStyle2 = fontStyle;
        if ($composer2.changed(fontStyle2) == false) goto L54;
        int r210 = 16384;
    L55:
        $dirty = $dirty | r210;
        goto L57
    L54:
        r210 = 8192;
        goto L55
    L56:
        fontStyle2 = fontStyle;
        goto L57
    L39:
        if (($changed & 3072) != 0) goto L45;
        fontSize2 = fontSize;
        if ($composer2.changed(fontSize2) == false) goto L43;
        int r211 = 2048;
    L44:
        $dirty = $dirty | r211;
        goto L46
    L43:
        r211 = 1024;
        goto L44
    L45:
        fontSize2 = fontSize;
        goto L46
    L28:
        if (($changed & 384) != 0) goto L34;
        color2 = color;
        if ($composer2.changed(color2) == false) goto L32;
        int r111 = 256;
    L33:
        $dirty = $dirty | r111;
        goto L35
    L32:
        r111 = 128;
        goto L33
    L34:
        color2 = color;
        goto L35
    L17:
        if (($changed & 48) != 0) goto L23;
        modifier2 = modifier;
        if ($composer2.changed(modifier2) == false) goto L21;
        int r112 = 32;
    L22:
        $dirty = $dirty | r112;
        goto L24
    L21:
        r112 = 16;
        goto L22
    L23:
        modifier2 = modifier;
        goto L24
    L6:
        if (($changed & 6) != 0) goto L12;
        r6 = text;
        if ($composer2.changed(r6) == false) goto L10;
        int r32 = 4;
    L11:
        $dirty = $dirty | r32;
        goto L13
    L10:
        r32 = 2;
        goto L11
    L12:
        r6 = text;
        goto L13
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Maintained for binary compatibility. Use version with minLines instead")
    /* JADX INFO: renamed from: Text-fLXpl1I, reason: not valid java name */
    public static final /* synthetic */ void m1845TextfLXpl1I(final String text, Modifier modifier, long color, long fontSize, FontStyle fontStyle, FontWeight fontWeight, FontFamily fontFamily, long letterSpacing, TextDecoration textDecoration, TextAlign textAlign, long lineHeight, int overflow, boolean softWrap, int maxLines, Function1 onTextLayout, TextStyle style, Composer $composer, final int $changed, final int $changed1, final int r66) {
        Composer $composer2 = $composer.startRestartGroup(-366126944);
        ComposerKt.sourceInformation($composer2, "C(Text)P(13,8,0:c#ui.graphics.Color,2:c#ui.unit.TextUnit,3:c#ui.text.font.FontStyle,4!1,5:c#ui.unit.TextUnit,15,14:c#ui.text.style.TextAlign,6:c#ui.unit.TextUnit,10:c#ui.text.style.TextOverflow,11)185@8744L322:Text.kt#jmzs0o");
        int $dirty = $changed;
        if ((r66 & 1) == 0) goto L6;
        $dirty = $dirty | 6;
    L13:
        int r10 = r66 & 2;
        if (r10 == 0) goto L17;
        $dirty = $dirty | 48;
        Modifier modifier2 = modifier;
    L24:
        int r14 = r66 & 4;
        if (r14 == 0) goto L28;
        $dirty = $dirty | 384;
        long color2 = color;
    L35:
        int r18 = r66 & 8;
        int r19 = 2048;
        if (r18 == 0) goto L39;
        $dirty = $dirty | 3072;
        long fontSize2 = fontSize;
    L46:
        int r23 = r66 & 16;
        int r24 = 16384;
        if (r23 == 0) goto L50;
        $dirty = $dirty | 24576;
        FontStyle fontStyle2 = fontStyle;
    L57:
        int r27 = r66 & 32;
        int r28 = 131072;
        if (r27 == 0) goto L61;
        $dirty = $dirty | ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
        FontWeight fontWeight2 = fontWeight;
    L68:
        int r32 = r66 & 64;
        if (r32 == 0) goto L72;
        $dirty = $dirty | 1572864;
    L79:
        int $dirty2 = r66 & 128;
        if ($dirty2 == 0) goto L83;
        int $dirty3 = $dirty | 12582912;
    L90:
        int $dirty4 = r66 & 256;
        if ($dirty4 == 0) goto L94;
        $dirty3 = $dirty3 | 100663296;
    L101:
        int $dirty5 = r66 & 512;
        if ($dirty5 == 0) goto L105;
        $dirty3 = $dirty3 | 805306368;
    L112:
        int $dirty6 = $dirty3;
        int $dirty1 = r66 & 1024;
        if ($dirty1 == 0) goto L117;
        int $dirty7 = $changed1 | 6;
    L124:
        int $dirty8 = r66 & 2048;
        if ($dirty8 == 0) goto L128;
        $dirty7 = $dirty7 | 48;
    L135:
        int $dirty9 = $dirty7;
        int r5 = r66 & 4096;
        if (r5 == 0) goto L139;
        $dirty9 = $dirty9 | 384;
        boolean softWrap2 = softWrap;
    L146:
        int r6 = r66 & 8192;
        if (r6 == 0) goto L149;
        int $dirty10 = $dirty9 | 3072;
    L157:
        int r7 = r66 & 16384;
        if (r7 == 0) goto L161;
        $dirty10 = $dirty10 | 24576;
    L169:
        if (($changed1 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) != 0) goto L180;
        if ((r66 & 32768) != 0) goto L176;
        if ($composer2.changed(style) == false) goto L176;
    L177:
        $dirty10 = $dirty10 | r28;
    L176:
        r28 = 65536;
    L180:
        if (($dirty6 & 306783379) == 306783378) goto L182;
    L185:
        boolean r1 = true;
    L187:
        if ($composer2.shouldExecute(r1, $dirty6 & 1) == false) goto L244;
        $composer2.startDefaults();
        ComposerKt.sourceInformation($composer2, "183@8728L7");
        if (($changed & 1) != 0) goto L191;
    L197:
        if (r10 == 0) goto L199;
        modifier2 = Modifier.Companion;
    L199:
        if (r14 == 0) goto L201;
        color2 = Color.Companion.m4402getUnspecified0d7_KjU();
    L201:
        if (r18 == 0) goto L203;
        fontSize2 = TextUnit.Companion.m7178getUnspecifiedXSAIIZE();
    L203:
        if (r23 == 0) goto L205;
        fontStyle2 = null;
    L205:
        if (r27 == 0) goto L207;
        fontWeight2 = null;
    L207:
        if (r32 == 0) goto L209;
        FontFamily fontFamily2 = null;
    L210:
        if ($dirty2 == 0) goto L212;
        long letterSpacing2 = TextUnit.Companion.m7178getUnspecifiedXSAIIZE();
    L213:
        if ($dirty4 == 0) goto L215;
        TextDecoration textDecoration2 = null;
    L216:
        if ($dirty5 == 0) goto L218;
        TextAlign textAlign2 = null;
    L219:
        if ($dirty1 == 0) goto L221;
        long lineHeight2 = TextUnit.Companion.m7178getUnspecifiedXSAIIZE();
    L222:
        if ($dirty8 == 0) goto L224;
        int overflow2 = TextOverflow.Companion.m6886getClipgIe3tQ8();
    L225:
        if (r5 == 0) goto L227;
        softWrap2 = true;
    L227:
        if (r6 == 0) goto L229;
        int maxLines2 = Integer.MAX_VALUE;
    L230:
        if (r7 == 0) goto L232;
        TextKt$Text$3 onTextLayout2 = TextKt$Text$3.INSTANCE;
    L234:
        if ((r66 & 32768) == 0) goto L236;
        FontFamily fontFamily3 = fontFamily2;
        ProvidableCompositionLocal<TextStyle> r2 = LocalTextStyle;
        TextDecoration textDecoration3 = textDecoration2;
        ComposerKt.sourceInformationMarkerStart($composer2, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
        Object r3 = $composer2.consume(r2);
        ComposerKt.sourceInformationMarkerEnd($composer2);
        TextStyle style2 = (TextStyle) r3;
        $dirty10 = $dirty10 & (-458753);
        int maxLines3 = maxLines2;
        int overflow3 = overflow2;
        boolean softWrap3 = softWrap2;
        long color3 = color2;
        TextAlign textAlign3 = textAlign2;
        FontStyle fontStyle3 = fontStyle2;
        long fontSize3 = fontSize2;
        FontWeight fontWeight3 = fontWeight2;
        FontFamily fontFamily4 = fontFamily3;
        TextDecoration textDecoration4 = textDecoration3;
        Function1 onTextLayout3 = onTextLayout2;
        Modifier modifier3 = modifier2;
        long letterSpacing3 = letterSpacing2;
        long letterSpacing4 = lineHeight2;
    L237:
        $composer2.endDefaults();
        if (ComposerKt.isTraceInProgress() == false) goto L240;
        ComposerKt.traceEventStart(-366126944, $dirty6, $dirty10, "androidx.compose.material.Text (Text.kt:184)");
    L240:
        Composer $composer3 = $composer2;
        m1843Text4IGK_g(text, modifier3, color3, fontSize3, fontStyle3, fontWeight3, fontFamily4, letterSpacing3, textDecoration4, textAlign3, letterSpacing4, overflow3, softWrap3, maxLines3, 1, onTextLayout3, style2, $composer3, ((((((((($dirty6 & 14) | ($dirty6 & 112)) | ($dirty6 & 896)) | ($dirty6 & 7168)) | (57344 & $dirty6)) | (458752 & $dirty6)) | (3670016 & $dirty6)) | (29360128 & $dirty6)) | (234881024 & $dirty6)) | (1879048192 & $dirty6), (((((($dirty10 & 14) | 24576) | ($dirty10 & 112)) | ($dirty10 & 896)) | ($dirty10 & 7168)) | (($dirty10 << 3) & 458752)) | (($dirty10 << 3) & 3670016), 0);
        if (ComposerKt.isTraceInProgress() == false) goto L243;
        ComposerKt.traceEventEnd();
    L243:
        final Modifier modifier4 = modifier3;
        final long color4 = color3;
        final long fontSize4 = fontSize3;
        final FontStyle fontStyle4 = fontStyle3;
        final FontWeight fontWeight4 = fontWeight3;
        final FontFamily fontFamily5 = fontFamily4;
        final long letterSpacing5 = letterSpacing3;
        final TextDecoration textDecoration5 = textDecoration4;
        final TextAlign textAlign4 = textAlign3;
        final long lineHeight3 = letterSpacing4;
        final int overflow4 = overflow3;
        final boolean softWrap4 = softWrap3;
        final int maxLines4 = maxLines3;
        final Function1 onTextLayout4 = onTextLayout3;
        final TextStyle style3 = style2;
    L245:
        ScopeUpdateScope r4 = $composer3.endRestartGroup();
        if (r4 == null) goto L249;
        r4.updateScope(new TextKt$Text$4(text, modifier4, color4, fontSize4, fontStyle4, fontWeight4, fontFamily5, letterSpacing5, textDecoration5, textAlign4, lineHeight3, overflow4, softWrap4, maxLines4, onTextLayout4, style3, $changed, $changed1, r66));
        return;
    L249:
        return;
    L236:
        style2 = style;
        maxLines3 = maxLines2;
        overflow3 = overflow2;
        softWrap3 = softWrap2;
        color3 = color2;
        textAlign3 = textAlign2;
        fontStyle3 = fontStyle2;
        fontSize3 = fontSize2;
        fontWeight3 = fontWeight2;
        fontFamily4 = fontFamily2;
        textDecoration4 = textDecoration2;
        onTextLayout3 = onTextLayout2;
        modifier3 = modifier2;
        letterSpacing3 = letterSpacing2;
        letterSpacing4 = lineHeight2;
        goto L237
    L232:
        onTextLayout2 = onTextLayout;
        goto L234
    L229:
        maxLines2 = maxLines;
        goto L230
    L224:
        overflow2 = overflow;
        goto L225
    L221:
        lineHeight2 = lineHeight;
        goto L222
    L218:
        textAlign2 = textAlign;
        goto L219
    L215:
        textDecoration2 = textDecoration;
        goto L216
    L212:
        letterSpacing2 = letterSpacing;
        goto L213
    L209:
        fontFamily2 = fontFamily;
        goto L210
    L191:
        if ($composer2.getDefaultsInvalid() == true) goto L197;
        $composer2.skipToGroupEnd();
        if ((r66 & 32768) == 0) goto L196;
        textAlign3 = textAlign;
        letterSpacing4 = lineHeight;
        overflow3 = overflow;
        maxLines3 = maxLines;
        onTextLayout3 = onTextLayout;
        style2 = style;
        $dirty10 = (-458753) & $dirty10;
        softWrap3 = softWrap2;
        color3 = color2;
        modifier3 = modifier2;
        letterSpacing3 = letterSpacing;
        fontStyle3 = fontStyle2;
        fontSize3 = fontSize2;
        fontWeight3 = fontWeight2;
        fontFamily4 = fontFamily;
        textDecoration4 = textDecoration;
        goto L237
    L196:
        textAlign3 = textAlign;
        letterSpacing4 = lineHeight;
        overflow3 = overflow;
        maxLines3 = maxLines;
        onTextLayout3 = onTextLayout;
        style2 = style;
        softWrap3 = softWrap2;
        color3 = color2;
        modifier3 = modifier2;
        letterSpacing3 = letterSpacing;
        fontStyle3 = fontStyle2;
        fontSize3 = fontSize2;
        fontWeight3 = fontWeight2;
        fontFamily4 = fontFamily;
        textDecoration4 = textDecoration;
        goto L237
    L244:
        $composer3 = $composer2;
        $composer3.skipToGroupEnd();
        overflow4 = overflow;
        maxLines4 = maxLines;
        onTextLayout4 = onTextLayout;
        style3 = style;
        softWrap4 = softWrap2;
        fontStyle4 = fontStyle2;
        color4 = color2;
        fontSize4 = fontSize2;
        modifier4 = modifier2;
        fontWeight4 = fontWeight2;
        fontFamily5 = fontFamily;
        letterSpacing5 = letterSpacing;
        textDecoration5 = textDecoration;
        textAlign4 = textAlign;
        lineHeight3 = lineHeight;
        goto L245
    L182:
        if ((74899 & $dirty10) != 74898) goto L185;
        r1 = false;
        goto L187
    L161:
        if (($changed1 & 24576) != 0) goto L169;
        if ($composer2.changedInstance(onTextLayout) == true) goto L166;
        r24 = 8192;
    L166:
        $dirty10 = $dirty10 | r24;
        goto L169
    L149:
        int $dirty11 = $dirty9;
        if (($changed1 & 3072) == 0) goto L152;
        $dirty10 = $dirty11;
        goto L157
    L152:
        if ($composer2.changed(maxLines) == true) goto L155;
        r19 = 1024;
    L155:
        $dirty10 = $dirty11 | r19;
        goto L157
    L139:
        if (($changed1 & 384) != 0) goto L145;
        softWrap2 = softWrap;
        if ($composer2.changed(softWrap2) == false) goto L143;
        int r31 = 256;
    L144:
        $dirty9 = $dirty9 | r31;
        goto L146
    L143:
        r31 = 128;
        goto L144
    L145:
        softWrap2 = softWrap;
        goto L146
    L128:
        if (($changed1 & 48) != 0) goto L135;
        if ($composer2.changed(overflow) == false) goto L132;
        int r26 = 32;
    L133:
        $dirty7 = $dirty7 | r26;
        goto L135
    L132:
        r26 = 16;
        goto L133
    L117:
        if (($changed1 & 6) == 0) goto L119;
        $dirty7 = r6;
        goto L124
    L119:
        if ($composer2.changed(lineHeight) == false) goto L121;
        int r21 = 4;
    L122:
        $dirty7 = r6 | r21;
        goto L124
    L121:
        r21 = 2;
        goto L122
    L105:
        if (($changed & 805306368) != 0) goto L112;
        if ($composer2.changed(textAlign) == false) goto L109;
        int r39 = 536870912;
    L110:
        $dirty3 = $dirty3 | r39;
        goto L112
    L109:
        r39 = 268435456;
        goto L110
    L94:
        if (($changed & 100663296) != 0) goto L101;
        if ($composer2.changed(textDecoration) == false) goto L98;
        int r38 = AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
    L99:
        $dirty3 = $dirty3 | r38;
        goto L101
    L98:
        r38 = 33554432;
        goto L99
    L83:
        if (($changed & 12582912) != 0) goto L89;
        int $dirty12 = $dirty;
        if ($composer2.changed(letterSpacing) == false) goto L87;
        int r36 = 8388608;
    L88:
        $dirty3 = $dirty12 | r36;
        goto L90
    L87:
        r36 = 4194304;
        goto L88
    L89:
        $dirty3 = $dirty;
        goto L90
    L72:
        if (($changed & 1572864) != 0) goto L79;
        if ($composer2.changed(fontFamily) == false) goto L76;
        int r34 = 1048576;
    L77:
        $dirty = $dirty | r34;
        goto L79
    L76:
        r34 = 524288;
        goto L77
    L61:
        if (($changed & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) != 0) goto L67;
        fontWeight2 = fontWeight;
        if ($composer2.changed(fontWeight2) == false) goto L65;
        int r33 = 131072;
    L66:
        $dirty = $dirty | r33;
        goto L68
    L65:
        r33 = 65536;
        goto L66
    L67:
        fontWeight2 = fontWeight;
        goto L68
    L50:
        if (($changed & 24576) != 0) goto L56;
        fontStyle2 = fontStyle;
        if ($composer2.changed(fontStyle2) == false) goto L54;
        int r29 = 16384;
    L55:
        $dirty = $dirty | r29;
        goto L57
    L54:
        r29 = 8192;
        goto L55
    L56:
        fontStyle2 = fontStyle;
        goto L57
    L39:
        if (($changed & 3072) != 0) goto L45;
        fontSize2 = fontSize;
        if ($composer2.changed(fontSize2) == false) goto L43;
        int r25 = 2048;
    L44:
        $dirty = $dirty | r25;
        goto L46
    L43:
        r25 = 1024;
        goto L44
    L45:
        fontSize2 = fontSize;
        goto L46
    L28:
        if (($changed & 384) != 0) goto L34;
        color2 = color;
        if ($composer2.changed(color2) == false) goto L32;
        int r110 = 256;
    L33:
        $dirty = $dirty | r110;
        goto L35
    L32:
        r110 = 128;
        goto L33
    L34:
        color2 = color;
        goto L35
    L17:
        if (($changed & 48) != 0) goto L23;
        modifier2 = modifier;
        if ($composer2.changed(modifier2) == false) goto L21;
        int r15 = 32;
    L22:
        $dirty = $dirty | r15;
        goto L24
    L21:
        r15 = 16;
        goto L22
    L23:
        modifier2 = modifier;
        goto L24
    L6:
        if (($changed & 6) != 0) goto L13;
        if ($composer2.changed(text) == false) goto L10;
        int r11 = 4;
    L11:
        $dirty = $dirty | r11;
        goto L13
    L10:
        r11 = 2;
        goto L11
    }

    /* JADX INFO: renamed from: Text-IbK3jfQ, reason: not valid java name */
    public static final void m1844TextIbK3jfQ(final AnnotatedString text, Modifier modifier, long color, long fontSize, FontStyle fontStyle, FontWeight fontWeight, FontFamily fontFamily, long letterSpacing, TextDecoration textDecoration, TextAlign textAlign, long lineHeight, int overflow, boolean softWrap, int maxLines, int minLines, Map<String, InlineTextContent> r77, Function1<? super TextLayoutResult, Unit> r78, TextStyle style, Composer $composer, final int $changed, final int $changed1, final int r83) {
        Composer $composer2 = $composer.startRestartGroup(744129681);
        ComposerKt.sourceInformation($composer2, "C(Text)P(15,10,0:c#ui.graphics.Color,2:c#ui.unit.TextUnit,3:c#ui.text.font.FontStyle,4!1,6:c#ui.unit.TextUnit,17,16:c#ui.text.style.TextAlign,7:c#ui.unit.TextUnit,12:c#ui.text.style.TextOverflow,13,8,9)301@14827L7,302@14881L7,332@15816L30,312@15133L719:Text.kt#jmzs0o");
        int $dirty = $changed;
        int $dirty1 = $changed1;
        if ((r83 & 1) == 0) goto L6;
        $dirty = $dirty | 6;
        AnnotatedString r6 = text;
    L13:
        int r9 = r83 & 2;
        if (r9 == 0) goto L17;
        $dirty = $dirty | 48;
        Modifier modifier2 = modifier;
    L24:
        int r13 = r83 & 4;
        if (r13 == 0) goto L28;
        $dirty = $dirty | 384;
        long color2 = color;
    L35:
        int r17 = r83 & 8;
        int r18 = 2048;
        if (r17 == 0) goto L39;
        $dirty = $dirty | 3072;
        long fontSize2 = fontSize;
    L46:
        int r22 = r83 & 16;
        int r23 = 16384;
        if (r22 == 0) goto L50;
        $dirty = $dirty | 24576;
        final FontStyle fontStyle2 = fontStyle;
    L57:
        int r26 = r83 & 32;
        if (r26 == 0) goto L61;
        $dirty = $dirty | ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
        FontWeight fontWeight2 = fontWeight;
    L68:
        int r31 = r83 & 64;
        if (r31 == 0) goto L72;
        $dirty = $dirty | 1572864;
        FontFamily fontFamily2 = fontFamily;
    L79:
        int $dirty2 = r83 & 128;
        if ($dirty2 == 0) goto L83;
        int $dirty3 = $dirty | 12582912;
    L90:
        int $dirty4 = r83 & 256;
        if ($dirty4 == 0) goto L94;
        $dirty3 = $dirty3 | 100663296;
    L101:
        int $dirty5 = r83 & 512;
        if ($dirty5 == 0) goto L105;
        $dirty3 = $dirty3 | 805306368;
    L112:
        int $dirty6 = $dirty3;
        int $dirty7 = r83 & 1024;
        if ($dirty7 == 0) goto L115;
        $dirty1 = $dirty1 | 6;
    L123:
        int $dirty8 = r83 & 2048;
        if ($dirty8 == 0) goto L127;
        $dirty1 = $dirty1 | 48;
    L134:
        int $dirty9 = $dirty1;
        int r5 = r83 & 4096;
        if (r5 == 0) goto L137;
        int $dirty10 = $dirty9 | 384;
    L146:
        int r7 = r83 & 8192;
        if (r7 == 0) goto L149;
        int $dirty11 = $dirty10 | 3072;
    L157:
        int r8 = r83 & 16384;
        if (r8 == 0) goto L161;
        $dirty11 = $dirty11 | 24576;
    L168:
        int r19 = r83 & 32768;
        if (r19 == 0) goto L172;
        $dirty11 = $dirty11 | ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
    L179:
        int r24 = r83 & 65536;
        if (r24 == 0) goto L183;
        $dirty11 = $dirty11 | 1572864;
    L191:
        if (($changed1 & 12582912) != 0) goto L201;
        if ((r83 & 131072) != 0) goto L198;
        if ($composer2.changed(style) == false) goto L198;
        int r25 = 8388608;
    L199:
        $dirty11 = $dirty11 | r25;
    L198:
        r25 = 4194304;
    L201:
        boolean r27 = true;
        if (($dirty6 & 306783379) == 306783378) goto L204;
    L207:
        boolean r1 = true;
    L209:
        if ($composer2.shouldExecute(r1, $dirty6 & 1) == false) goto L297;
        $composer2.startDefaults();
        ComposerKt.sourceInformation($composer2, "282@13615L7");
        if (($changed & 1) != 0) goto L213;
    L219:
        if (r9 == 0) goto L221;
        modifier2 = Modifier.Companion;
    L221:
        if (r13 == 0) goto L223;
        color2 = Color.Companion.m4402getUnspecified0d7_KjU();
    L223:
        if (r17 == 0) goto L225;
        fontSize2 = TextUnit.Companion.m7178getUnspecifiedXSAIIZE();
    L225:
        if (r22 == 0) goto L227;
        fontStyle2 = null;
    L227:
        if (r26 == 0) goto L229;
        fontWeight2 = null;
    L229:
        if (r31 == 0) goto L231;
        fontFamily2 = null;
    L231:
        if ($dirty2 == 0) goto L233;
        long letterSpacing2 = TextUnit.Companion.m7178getUnspecifiedXSAIIZE();
    L234:
        if ($dirty4 == 0) goto L236;
        TextDecoration textDecoration2 = null;
    L237:
        if ($dirty5 == 0) goto L239;
        TextAlign textAlign2 = null;
    L240:
        if ($dirty7 == 0) goto L242;
        long lineHeight2 = TextUnit.Companion.m7178getUnspecifiedXSAIIZE();
    L243:
        if ($dirty8 == 0) goto L245;
        int overflow2 = TextOverflow.Companion.m6886getClipgIe3tQ8();
    L246:
        if (r5 == 0) goto L248;
        boolean softWrap2 = true;
    L249:
        if (r7 == 0) goto L251;
        final int maxLines2 = Integer.MAX_VALUE;
    L252:
        if (r8 == 0) goto L254;
        int minLines2 = 1;
    L255:
        if (r19 == 0) goto L257;
        Map<String, InlineTextContent> r110 = MapsKt.emptyMap();
    L258:
        if (r24 == 0) goto L260;
        final TextKt$Text$5 r21 = TextKt$Text$5.INSTANCE;
    L262:
        if ((r83 & 131072) == 0) goto L264;
        long letterSpacing3 = letterSpacing2;
        ProvidableCompositionLocal<TextStyle> r2 = LocalTextStyle;
        ComposerKt.sourceInformationMarkerStart($composer2, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
        Object r3 = $composer2.consume(r2);
        ComposerKt.sourceInformationMarkerEnd($composer2);
        long letterSpacing4 = letterSpacing3;
        $dirty11 = $dirty11 & (-29360129);
        FontStyle fontStyle3 = fontStyle2;
        long fontSize3 = fontSize2;
        TextDecoration textDecoration3 = textDecoration2;
        FontWeight fontWeight3 = fontWeight2;
        FontFamily fontFamily3 = fontFamily2;
        long lineHeight3 = lineHeight2;
        TextStyle style2 = (TextStyle) r3;
    L265:
        $composer2.endDefaults();
        if (ComposerKt.isTraceInProgress() == false) goto L268;
        ComposerKt.traceEventStart(744129681, $dirty6, $dirty11, "androidx.compose.material.Text (Text.kt:283)");
    L268:
        ProvidableCompositionLocal<Color> r4 = ContentColorKt.getLocalContentColor();
        ComposerKt.sourceInformationMarkerStart($composer2, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
        Object r10 = $composer2.consume(r4);
        ComposerKt.sourceInformationMarkerEnd($composer2);
        long localContentColor = ((Color) r10).m4376unboximpl();
        ProvidableCompositionLocal<Float> r11 = ContentAlphaKt.getLocalContentAlpha();
        ComposerKt.sourceInformationMarkerStart($composer2, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
        Object r14 = $composer2.consume(r11);
        ComposerKt.sourceInformationMarkerEnd($composer2);
        float localContentAlpha = ((Number) r14).floatValue();
        long $this$isSpecified$iv = color2;
        if ($this$isSpecified$iv == 16) goto L271;
        boolean r15 = true;
    L272:
        if (r15 == false) goto L274;
        final long overrideColorOrUnspecified = color2;
    L282:
        if (textAlign2 == null) goto L284;
        int r16 = textAlign2.m6834unboximpl();
    L285:
        TextStyle r111 = TextStyle.m6437mergedA7vx0o$default(style2, 0, fontSize3, fontWeight3, fontStyle3, null, fontFamily3, null, letterSpacing4, null, null, null, 0, textDecoration3, null, null, r16, 0, lineHeight3, null, null, 0, 0, null, null, 16609105, null);
        ComposerKt.sourceInformationMarkerStart($composer2, 1041698417, "CC(remember):Text.kt#9igjgp");
        boolean invalid$iv = $composer2.changed(overrideColorOrUnspecified);
        int $dirty12 = $dirty6;
        Object it$iv = $composer2.rememberedValue();
        if (invalid$iv == true) goto L292;
        if (it$iv == Composer.Companion.getEmpty()) goto L292;
    L293:
        ComposerKt.sourceInformationMarkerEnd($composer2);
        AnnotatedString r59 = r6;
        Modifier modifier3 = modifier2;
        int overflow3 = overflow2;
        int maxLines3 = maxLines2;
        boolean softWrap3 = softWrap2;
        Function1<? super TextLayoutResult, Unit> r62 = r21;
        BasicTextKt.m1032BasicTextRWo7tUw(r59, modifier3, r111, r62, overflow3, softWrap3, maxLines3, minLines2, r110, (ColorProducer) it$iv, $composer2, ((((((($dirty12 & 14) | ($dirty12 & 112)) | (($dirty11 >> 9) & 7168)) | (($dirty11 << 9) & 57344)) | (($dirty11 << 9) & 458752)) | (($dirty11 << 9) & 3670016)) | (($dirty11 << 9) & 29360128)) | (234881024 & ($dirty11 << 9)), 0);
        Composer $composer3 = $composer2;
        if (ComposerKt.isTraceInProgress() == false) goto L296;
        ComposerKt.traceEventEnd();
    L296:
        final long color3 = color2;
        final Modifier modifier4 = modifier2;
        final TextAlign textAlign3 = textAlign2;
        final int overflow4 = overflow2;
        final boolean softWrap4 = softWrap2;
        final TextStyle style3 = style2;
        final FontWeight fontWeight4 = fontWeight3;
        fontStyle2 = fontStyle3;
        final FontFamily fontFamily4 = fontFamily3;
        final long letterSpacing5 = letterSpacing4;
        final TextDecoration textDecoration4 = textDecoration3;
        final long lineHeight4 = lineHeight3;
        final Map<String, InlineTextContent> r20 = r110;
        final int minLines3 = minLines2;
        final long fontSize4 = fontSize3;
    L298:
        ScopeUpdateScope r0 = $composer3.endRestartGroup();
        if (r0 == null) goto L302;
        r0.updateScope(new TextKt$Text$7(text, modifier4, color3, fontSize4, fontStyle2, fontWeight4, fontFamily4, letterSpacing5, textDecoration4, textAlign3, lineHeight4, overflow4, softWrap4, maxLines2, minLines3, r20, r21, style3, $changed, $changed1, r83));
        return;
    L302:
        return;
    L292:
        Object value$iv = (ColorProducer) new TextKt$Text$6$1(overrideColorOrUnspecified);
        $composer2.updateRememberedValue(value$iv);
        it$iv = value$iv;
        goto L293
    L284:
        r16 = TextAlign.Companion.m6841getUnspecifiede0LSkKk();
        goto L285
    L274:
        long $this$isSpecified$iv2 = style2.m6447getColor0d7_KjU();
        if ($this$isSpecified$iv2 != 16) goto L278;
        r27 = false;
    L278:
        if (r27 == false) goto L280;
        overrideColorOrUnspecified = style2.m6447getColor0d7_KjU();
        goto L282
    L280:
        overrideColorOrUnspecified = Color.m4365copywmQWz5c$default(localContentColor, localContentAlpha, 0.0f, 0.0f, 0.0f, 14, null);
        goto L282
    L271:
        r15 = false;
        goto L272
    L264:
        letterSpacing4 = letterSpacing2;
        fontStyle3 = fontStyle2;
        fontSize3 = fontSize2;
        textDecoration3 = textDecoration2;
        fontWeight3 = fontWeight2;
        fontFamily3 = fontFamily2;
        lineHeight3 = lineHeight2;
        style2 = style;
        goto L265
    L260:
        r21 = r78;
        goto L262
    L257:
        r110 = r77;
        goto L258
    L254:
        minLines2 = minLines;
        goto L255
    L251:
        maxLines2 = maxLines;
        goto L252
    L248:
        softWrap2 = softWrap;
        goto L249
    L245:
        overflow2 = overflow;
        goto L246
    L242:
        lineHeight2 = lineHeight;
        goto L243
    L239:
        textAlign2 = textAlign;
        goto L240
    L236:
        textDecoration2 = textDecoration;
        goto L237
    L233:
        letterSpacing2 = letterSpacing;
        goto L234
    L213:
        if ($composer2.getDefaultsInvalid() == true) goto L219;
        $composer2.skipToGroupEnd();
        if ((r83 & 131072) == 0) goto L218;
        letterSpacing4 = letterSpacing;
        textDecoration3 = textDecoration;
        textAlign2 = textAlign;
        lineHeight3 = lineHeight;
        overflow2 = overflow;
        softWrap2 = softWrap;
        maxLines2 = maxLines;
        minLines2 = minLines;
        r110 = r77;
        r21 = r78;
        style2 = style;
        $dirty11 = (-29360129) & $dirty11;
        fontStyle3 = fontStyle2;
        fontSize3 = fontSize2;
        fontWeight3 = fontWeight2;
        fontFamily3 = fontFamily2;
        goto L265
    L218:
        letterSpacing4 = letterSpacing;
        textDecoration3 = textDecoration;
        textAlign2 = textAlign;
        lineHeight3 = lineHeight;
        overflow2 = overflow;
        softWrap2 = softWrap;
        maxLines2 = maxLines;
        minLines2 = minLines;
        r110 = r77;
        r21 = r78;
        style2 = style;
        fontStyle3 = fontStyle2;
        fontSize3 = fontSize2;
        fontWeight3 = fontWeight2;
        fontFamily3 = fontFamily2;
        goto L265
    L297:
        $dirty12 = $dirty6;
        $composer3 = $composer2;
        $composer3.skipToGroupEnd();
        textAlign3 = textAlign;
        overflow4 = overflow;
        softWrap4 = softWrap;
        maxLines2 = maxLines;
        minLines3 = minLines;
        r20 = r77;
        r21 = r78;
        style3 = style;
        color3 = color2;
        fontSize4 = fontSize2;
        modifier4 = modifier2;
        fontWeight4 = fontWeight2;
        fontFamily4 = fontFamily2;
        letterSpacing5 = letterSpacing;
        textDecoration4 = textDecoration;
        lineHeight4 = lineHeight;
        goto L298
    L204:
        if ((4793491 & $dirty11) != 4793490) goto L207;
        r1 = false;
        goto L209
    L183:
        if (($changed1 & 1572864) != 0) goto L191;
        if ($composer2.changedInstance(r78) == false) goto L187;
        int r28 = 1048576;
    L188:
        $dirty11 = $dirty11 | r28;
        goto L191
    L187:
        r28 = 524288;
        goto L188
    L172:
        if (($changed1 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) != 0) goto L179;
        if ($composer2.changedInstance(r77) == false) goto L176;
        int r29 = 131072;
    L177:
        $dirty11 = $dirty11 | r29;
        goto L179
    L176:
        r29 = 65536;
        goto L177
    L161:
        if (($changed1 & 24576) != 0) goto L168;
        if ($composer2.changed(minLines) == true) goto L166;
        r23 = 8192;
    L166:
        $dirty11 = $dirty11 | r23;
        goto L168
    L149:
        int $dirty13 = $dirty10;
        int $dirty14 = $changed1 & 3072;
        if ($dirty14 == 0) goto L152;
        $dirty11 = $dirty13;
        goto L157
    L152:
        if ($composer2.changed(maxLines) == true) goto L155;
        r18 = 1024;
    L155:
        $dirty11 = $dirty13 | r18;
        goto L157
    L137:
        int $dirty15 = $dirty9;
        int $dirty16 = $changed1 & 384;
        if ($dirty16 != 0) goto L145;
        if ($composer2.changed(softWrap) == false) goto L142;
        int r30 = 256;
    L143:
        $dirty15 = $dirty15 | r30;
        goto L145
    L142:
        r30 = 128;
    L145:
        $dirty10 = $dirty15;
        goto L146
    L127:
        if (($changed1 & 48) != 0) goto L134;
        if ($composer2.changed(overflow) == false) goto L131;
        int r210 = 32;
    L132:
        $dirty1 = $dirty1 | r210;
        goto L134
    L131:
        r210 = 16;
        goto L132
    L115:
        int $dirty17 = $changed1 & 6;
        if ($dirty17 != 0) goto L123;
        if ($composer2.changed(lineHeight) == false) goto L120;
        int r211 = 4;
    L121:
        $dirty1 = $dirty1 | r211;
        goto L123
    L120:
        r211 = 2;
        goto L121
    L105:
        if (($changed & 805306368) != 0) goto L112;
        if ($composer2.changed(textAlign) == false) goto L109;
        int r40 = 536870912;
    L110:
        $dirty3 = $dirty3 | r40;
        goto L112
    L109:
        r40 = 268435456;
        goto L110
    L94:
        if (($changed & 100663296) != 0) goto L101;
        if ($composer2.changed(textDecoration) == false) goto L98;
        int r39 = AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
    L99:
        $dirty3 = $dirty3 | r39;
        goto L101
    L98:
        r39 = 33554432;
        goto L99
    L83:
        if (($changed & 12582912) != 0) goto L89;
        int $dirty18 = $dirty;
        if ($composer2.changed(letterSpacing) == false) goto L87;
        int r37 = 8388608;
    L88:
        $dirty3 = $dirty18 | r37;
        goto L90
    L87:
        r37 = 4194304;
        goto L88
    L89:
        $dirty3 = $dirty;
        goto L90
    L72:
        if (($changed & 1572864) != 0) goto L78;
        fontFamily2 = fontFamily;
        if ($composer2.changed(fontFamily2) == false) goto L76;
        int r34 = 1048576;
    L77:
        $dirty = $dirty | r34;
        goto L79
    L76:
        r34 = 524288;
        goto L77
    L78:
        fontFamily2 = fontFamily;
        goto L79
    L61:
        if (($changed & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) != 0) goto L67;
        fontWeight2 = fontWeight;
        if ($composer2.changed(fontWeight2) == false) goto L65;
        int r32 = 131072;
    L66:
        $dirty = $dirty | r32;
        goto L68
    L65:
        r32 = 65536;
        goto L66
    L67:
        fontWeight2 = fontWeight;
        goto L68
    L50:
        if (($changed & 24576) != 0) goto L56;
        fontStyle2 = fontStyle;
        if ($composer2.changed(fontStyle2) == false) goto L54;
        int r212 = 16384;
    L55:
        $dirty = $dirty | r212;
        goto L57
    L54:
        r212 = 8192;
        goto L55
    L56:
        fontStyle2 = fontStyle;
        goto L57
    L39:
        if (($changed & 3072) != 0) goto L45;
        fontSize2 = fontSize;
        if ($composer2.changed(fontSize2) == false) goto L43;
        int r213 = 2048;
    L44:
        $dirty = $dirty | r213;
        goto L46
    L43:
        r213 = 1024;
        goto L44
    L45:
        fontSize2 = fontSize;
        goto L46
    L28:
        if (($changed & 384) != 0) goto L34;
        color2 = color;
        if ($composer2.changed(color2) == false) goto L32;
        int r112 = 256;
    L33:
        $dirty = $dirty | r112;
        goto L35
    L32:
        r112 = 128;
        goto L33
    L34:
        color2 = color;
        goto L35
    L17:
        if (($changed & 48) != 0) goto L23;
        modifier2 = modifier;
        if ($composer2.changed(modifier2) == false) goto L21;
        int r113 = 32;
    L22:
        $dirty = $dirty | r113;
        goto L24
    L21:
        r113 = 16;
        goto L22
    L23:
        modifier2 = modifier;
        goto L24
    L6:
        if (($changed & 6) != 0) goto L12;
        r6 = text;
        if ($composer2.changed(r6) == false) goto L10;
        int r12 = 4;
    L11:
        $dirty = $dirty | r12;
        goto L13
    L10:
        r12 = 2;
        goto L11
    L12:
        r6 = text;
        goto L13
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Maintained for binary compatibility. Use version with minLines instead")
    /* JADX INFO: renamed from: Text--4IGK_g, reason: not valid java name */
    public static final /* synthetic */ void m1842Text4IGK_g(final AnnotatedString text, Modifier modifier, long color, long fontSize, FontStyle fontStyle, FontWeight fontWeight, FontFamily fontFamily, long letterSpacing, TextDecoration textDecoration, TextAlign textAlign, long lineHeight, int overflow, boolean softWrap, int maxLines, Map inlineContent, Function1 onTextLayout, TextStyle style, Composer $composer, final int $changed, final int $changed1, final int r67) {
        Composer $composer2 = $composer.startRestartGroup(-422393234);
        ComposerKt.sourceInformation($composer2, "C(Text)P(14,9,0:c#ui.graphics.Color,2:c#ui.unit.TextUnit,3:c#ui.text.font.FontStyle,4!1,6:c#ui.unit.TextUnit,16,15:c#ui.text.style.TextAlign,7:c#ui.unit.TextUnit,11:c#ui.text.style.TextOverflow,12,8)360@16718L345:Text.kt#jmzs0o");
        int $dirty = $changed;
        if ((r67 & 1) == 0) goto L6;
        $dirty = $dirty | 6;
    L13:
        int r10 = r67 & 2;
        if (r10 == 0) goto L17;
        $dirty = $dirty | 48;
        Modifier modifier2 = modifier;
    L24:
        int r14 = r67 & 4;
        if (r14 == 0) goto L28;
        $dirty = $dirty | 384;
        long color2 = color;
    L35:
        int r18 = r67 & 8;
        int r19 = 2048;
        if (r18 == 0) goto L39;
        $dirty = $dirty | 3072;
        long fontSize2 = fontSize;
    L46:
        int r23 = r67 & 16;
        int r24 = 16384;
        if (r23 == 0) goto L50;
        $dirty = $dirty | 24576;
        FontStyle fontStyle2 = fontStyle;
    L57:
        int r27 = r67 & 32;
        int r28 = 131072;
        if (r27 == 0) goto L61;
        $dirty = $dirty | ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
        FontWeight fontWeight2 = fontWeight;
    L68:
        int r32 = r67 & 64;
        if (r32 == 0) goto L72;
        $dirty = $dirty | 1572864;
    L79:
        int $dirty2 = r67 & 128;
        if ($dirty2 == 0) goto L83;
        int $dirty3 = $dirty | 12582912;
    L90:
        int $dirty4 = r67 & 256;
        if ($dirty4 == 0) goto L94;
        $dirty3 = $dirty3 | 100663296;
    L101:
        int $dirty5 = r67 & 512;
        if ($dirty5 == 0) goto L105;
        $dirty3 = $dirty3 | 805306368;
    L112:
        int $dirty6 = $dirty3;
        int $dirty1 = r67 & 1024;
        if ($dirty1 == 0) goto L117;
        int $dirty7 = $changed1 | 6;
    L124:
        int $dirty8 = r67 & 2048;
        if ($dirty8 == 0) goto L128;
        $dirty7 = $dirty7 | 48;
    L135:
        int $dirty9 = $dirty7;
        int r5 = r67 & 4096;
        if (r5 == 0) goto L139;
        $dirty9 = $dirty9 | 384;
        boolean softWrap2 = softWrap;
    L146:
        int r6 = r67 & 8192;
        if (r6 == 0) goto L149;
        int $dirty10 = $dirty9 | 3072;
    L157:
        int r7 = r67 & 16384;
        if (r7 == 0) goto L161;
        $dirty10 = $dirty10 | 24576;
    L168:
        int r20 = r67 & 32768;
        if (r20 == 0) goto L172;
        $dirty10 = $dirty10 | ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
    L180:
        if (($changed1 & 1572864) != 0) goto L191;
        if ((r67 & 65536) != 0) goto L187;
        if ($composer2.changed(style) == false) goto L187;
        int r21 = 1048576;
    L188:
        $dirty10 = $dirty10 | r21;
    L187:
        r21 = 524288;
    L191:
        if (($dirty6 & 306783379) == 306783378) goto L193;
    L196:
        boolean r1 = true;
    L198:
        if ($composer2.shouldExecute(r1, $dirty6 & 1) == false) goto L258;
        $composer2.startDefaults();
        ComposerKt.sourceInformation($composer2, "358@16702L7");
        if (($changed & 1) != 0) goto L202;
    L208:
        if (r10 == 0) goto L210;
        modifier2 = Modifier.Companion;
    L210:
        if (r14 == 0) goto L212;
        color2 = Color.Companion.m4402getUnspecified0d7_KjU();
    L212:
        if (r18 == 0) goto L214;
        fontSize2 = TextUnit.Companion.m7178getUnspecifiedXSAIIZE();
    L214:
        if (r23 == 0) goto L216;
        fontStyle2 = null;
    L216:
        if (r27 == 0) goto L218;
        fontWeight2 = null;
    L218:
        if (r32 == 0) goto L220;
        FontFamily fontFamily2 = null;
    L221:
        if ($dirty2 == 0) goto L223;
        long letterSpacing2 = TextUnit.Companion.m7178getUnspecifiedXSAIIZE();
    L224:
        if ($dirty4 == 0) goto L226;
        TextDecoration textDecoration2 = null;
    L227:
        if ($dirty5 == 0) goto L229;
        TextAlign textAlign2 = null;
    L230:
        if ($dirty1 == 0) goto L232;
        long lineHeight2 = TextUnit.Companion.m7178getUnspecifiedXSAIIZE();
    L233:
        if ($dirty8 == 0) goto L235;
        int overflow2 = TextOverflow.Companion.m6886getClipgIe3tQ8();
    L236:
        if (r5 == 0) goto L238;
        softWrap2 = true;
    L238:
        if (r6 == 0) goto L240;
        int maxLines2 = Integer.MAX_VALUE;
    L241:
        if (r7 == 0) goto L243;
        Map inlineContent2 = MapsKt.emptyMap();
    L244:
        if (r20 == 0) goto L246;
        TextKt$Text$8 onTextLayout2 = TextKt$Text$8.INSTANCE;
    L248:
        if ((r67 & 65536) == 0) goto L250;
        FontFamily fontFamily3 = fontFamily2;
        ProvidableCompositionLocal<TextStyle> r2 = LocalTextStyle;
        TextDecoration textDecoration3 = textDecoration2;
        ComposerKt.sourceInformationMarkerStart($composer2, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
        Object r3 = $composer2.consume(r2);
        ComposerKt.sourceInformationMarkerEnd($composer2);
        TextStyle style2 = (TextStyle) r3;
        $dirty10 = $dirty10 & (-3670017);
        boolean softWrap3 = softWrap2;
        long color3 = color2;
        Function1 onTextLayout3 = onTextLayout2;
        int overflow3 = overflow2;
        Map inlineContent3 = inlineContent2;
        FontStyle fontStyle3 = fontStyle2;
        long fontSize3 = fontSize2;
        Modifier modifier3 = modifier2;
        FontWeight fontWeight3 = fontWeight2;
        FontFamily fontFamily4 = fontFamily3;
        TextDecoration textDecoration4 = textDecoration3;
        int r42 = maxLines2;
        TextAlign textAlign3 = textAlign2;
        long letterSpacing3 = letterSpacing2;
        long letterSpacing4 = lineHeight2;
        int maxLines3 = r42;
    L251:
        $composer2.endDefaults();
        if (ComposerKt.isTraceInProgress() == false) goto L254;
        ComposerKt.traceEventStart(-422393234, $dirty6, $dirty10, "androidx.compose.material.Text (Text.kt:359)");
    L254:
        Composer $composer3 = $composer2;
        m1844TextIbK3jfQ(text, modifier3, color3, fontSize3, fontStyle3, fontWeight3, fontFamily4, letterSpacing3, textDecoration4, textAlign3, letterSpacing4, overflow3, softWrap3, maxLines3, 1, inlineContent3, onTextLayout3, style2, $composer3, ((((((((($dirty6 & 14) | ($dirty6 & 112)) | ($dirty6 & 896)) | ($dirty6 & 7168)) | (57344 & $dirty6)) | (458752 & $dirty6)) | (3670016 & $dirty6)) | (29360128 & $dirty6)) | (234881024 & $dirty6)) | (1879048192 & $dirty6), ((((((($dirty10 & 14) | 24576) | ($dirty10 & 112)) | ($dirty10 & 896)) | ($dirty10 & 7168)) | (($dirty10 << 3) & 458752)) | (($dirty10 << 3) & 3670016)) | (($dirty10 << 3) & 29360128), 0);
        if (ComposerKt.isTraceInProgress() == false) goto L257;
        ComposerKt.traceEventEnd();
    L257:
        final Modifier modifier4 = modifier3;
        final long color4 = color3;
        final long fontSize4 = fontSize3;
        final FontStyle fontStyle4 = fontStyle3;
        final FontWeight fontWeight4 = fontWeight3;
        final FontFamily fontFamily5 = fontFamily4;
        final long letterSpacing5 = letterSpacing3;
        final TextDecoration textDecoration5 = textDecoration4;
        final TextAlign textAlign4 = textAlign3;
        final long lineHeight3 = letterSpacing4;
        final int overflow4 = overflow3;
        final boolean softWrap4 = softWrap3;
        final int maxLines4 = maxLines3;
        final Map inlineContent4 = inlineContent3;
        final Function1 onTextLayout4 = onTextLayout3;
        final TextStyle style3 = style2;
    L259:
        ScopeUpdateScope r4 = $composer3.endRestartGroup();
        if (r4 == null) goto L263;
        r4.updateScope(new TextKt$Text$9(text, modifier4, color4, fontSize4, fontStyle4, fontWeight4, fontFamily5, letterSpacing5, textDecoration5, textAlign4, lineHeight3, overflow4, softWrap4, maxLines4, inlineContent4, onTextLayout4, style3, $changed, $changed1, r67));
        return;
    L263:
        return;
    L250:
        style2 = style;
        softWrap3 = softWrap2;
        color3 = color2;
        onTextLayout3 = onTextLayout2;
        overflow3 = overflow2;
        inlineContent3 = inlineContent2;
        fontStyle3 = fontStyle2;
        fontSize3 = fontSize2;
        modifier3 = modifier2;
        fontWeight3 = fontWeight2;
        fontFamily4 = fontFamily2;
        textDecoration4 = textDecoration2;
        int r43 = maxLines2;
        textAlign3 = textAlign2;
        letterSpacing3 = letterSpacing2;
        letterSpacing4 = lineHeight2;
        maxLines3 = r43;
        goto L251
    L246:
        onTextLayout2 = onTextLayout;
        goto L248
    L243:
        inlineContent2 = inlineContent;
        goto L244
    L240:
        maxLines2 = maxLines;
        goto L241
    L235:
        overflow2 = overflow;
        goto L236
    L232:
        lineHeight2 = lineHeight;
        goto L233
    L229:
        textAlign2 = textAlign;
        goto L230
    L226:
        textDecoration2 = textDecoration;
        goto L227
    L223:
        letterSpacing2 = letterSpacing;
        goto L224
    L220:
        fontFamily2 = fontFamily;
        goto L221
    L202:
        if ($composer2.getDefaultsInvalid() == true) goto L208;
        $composer2.skipToGroupEnd();
        if ((r67 & 65536) == 0) goto L207;
        textAlign3 = textAlign;
        letterSpacing4 = lineHeight;
        overflow3 = overflow;
        maxLines3 = maxLines;
        inlineContent3 = inlineContent;
        onTextLayout3 = onTextLayout;
        style2 = style;
        $dirty10 = (-3670017) & $dirty10;
        softWrap3 = softWrap2;
        color3 = color2;
        modifier3 = modifier2;
        letterSpacing3 = letterSpacing;
        fontStyle3 = fontStyle2;
        fontSize3 = fontSize2;
        fontWeight3 = fontWeight2;
        fontFamily4 = fontFamily;
        textDecoration4 = textDecoration;
        goto L251
    L207:
        textAlign3 = textAlign;
        letterSpacing4 = lineHeight;
        overflow3 = overflow;
        maxLines3 = maxLines;
        inlineContent3 = inlineContent;
        onTextLayout3 = onTextLayout;
        style2 = style;
        softWrap3 = softWrap2;
        color3 = color2;
        modifier3 = modifier2;
        letterSpacing3 = letterSpacing;
        fontStyle3 = fontStyle2;
        fontSize3 = fontSize2;
        fontWeight3 = fontWeight2;
        fontFamily4 = fontFamily;
        textDecoration4 = textDecoration;
        goto L251
    L258:
        $composer3 = $composer2;
        $composer3.skipToGroupEnd();
        overflow4 = overflow;
        maxLines4 = maxLines;
        inlineContent4 = inlineContent;
        onTextLayout4 = onTextLayout;
        style3 = style;
        softWrap4 = softWrap2;
        fontStyle4 = fontStyle2;
        color4 = color2;
        fontSize4 = fontSize2;
        modifier4 = modifier2;
        fontWeight4 = fontWeight2;
        fontFamily5 = fontFamily;
        letterSpacing5 = letterSpacing;
        textDecoration5 = textDecoration;
        textAlign4 = textAlign;
        lineHeight3 = lineHeight;
        goto L259
    L193:
        if ((599187 & $dirty10) != 599186) goto L196;
        r1 = false;
        goto L198
    L172:
        if (($changed1 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) != 0) goto L180;
        if ($composer2.changedInstance(onTextLayout) == true) goto L177;
        r28 = 65536;
    L177:
        $dirty10 = $dirty10 | r28;
        goto L180
    L161:
        if (($changed1 & 24576) != 0) goto L168;
        if ($composer2.changedInstance(inlineContent) == true) goto L166;
        r24 = 8192;
    L166:
        $dirty10 = $dirty10 | r24;
        goto L168
    L149:
        int $dirty11 = $dirty9;
        if (($changed1 & 3072) == 0) goto L152;
        $dirty10 = $dirty11;
        goto L157
    L152:
        if ($composer2.changed(maxLines) == true) goto L155;
        r19 = 1024;
    L155:
        $dirty10 = $dirty11 | r19;
        goto L157
    L139:
        if (($changed1 & 384) != 0) goto L145;
        softWrap2 = softWrap;
        if ($composer2.changed(softWrap2) == false) goto L143;
        int r31 = 256;
    L144:
        $dirty9 = $dirty9 | r31;
        goto L146
    L143:
        r31 = 128;
        goto L144
    L145:
        softWrap2 = softWrap;
        goto L146
    L128:
        if (($changed1 & 48) != 0) goto L135;
        if ($composer2.changed(overflow) == false) goto L132;
        int r26 = 32;
    L133:
        $dirty7 = $dirty7 | r26;
        goto L135
    L132:
        r26 = 16;
        goto L133
    L117:
        if (($changed1 & 6) == 0) goto L119;
        $dirty7 = r6;
        goto L124
    L119:
        if ($composer2.changed(lineHeight) == false) goto L121;
        int r22 = 4;
    L122:
        $dirty7 = r6 | r22;
        goto L124
    L121:
        r22 = 2;
        goto L122
    L105:
        if (($changed & 805306368) != 0) goto L112;
        if ($composer2.changed(textAlign) == false) goto L109;
        int r40 = 536870912;
    L110:
        $dirty3 = $dirty3 | r40;
        goto L112
    L109:
        r40 = 268435456;
        goto L110
    L94:
        if (($changed & 100663296) != 0) goto L101;
        if ($composer2.changed(textDecoration) == false) goto L98;
        int r39 = AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
    L99:
        $dirty3 = $dirty3 | r39;
        goto L101
    L98:
        r39 = 33554432;
        goto L99
    L83:
        if (($changed & 12582912) != 0) goto L89;
        int $dirty12 = $dirty;
        if ($composer2.changed(letterSpacing) == false) goto L87;
        int r37 = 8388608;
    L88:
        $dirty3 = $dirty12 | r37;
        goto L90
    L87:
        r37 = 4194304;
        goto L88
    L89:
        $dirty3 = $dirty;
        goto L90
    L72:
        if (($changed & 1572864) != 0) goto L79;
        if ($composer2.changed(fontFamily) == false) goto L76;
        int r35 = 1048576;
    L77:
        $dirty = $dirty | r35;
        goto L79
    L76:
        r35 = 524288;
        goto L77
    L61:
        if (($changed & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) != 0) goto L67;
        fontWeight2 = fontWeight;
        if ($composer2.changed(fontWeight2) == false) goto L65;
        int r33 = 131072;
    L66:
        $dirty = $dirty | r33;
        goto L68
    L65:
        r33 = 65536;
        goto L66
    L67:
        fontWeight2 = fontWeight;
        goto L68
    L50:
        if (($changed & 24576) != 0) goto L56;
        fontStyle2 = fontStyle;
        if ($composer2.changed(fontStyle2) == false) goto L54;
        int r29 = 16384;
    L55:
        $dirty = $dirty | r29;
        goto L57
    L54:
        r29 = 8192;
        goto L55
    L56:
        fontStyle2 = fontStyle;
        goto L57
    L39:
        if (($changed & 3072) != 0) goto L45;
        fontSize2 = fontSize;
        if ($composer2.changed(fontSize2) == false) goto L43;
        int r25 = 2048;
    L44:
        $dirty = $dirty | r25;
        goto L46
    L43:
        r25 = 1024;
        goto L44
    L45:
        fontSize2 = fontSize;
        goto L46
    L28:
        if (($changed & 384) != 0) goto L34;
        color2 = color;
        if ($composer2.changed(color2) == false) goto L32;
        int r110 = 256;
    L33:
        $dirty = $dirty | r110;
        goto L35
    L32:
        r110 = 128;
        goto L33
    L34:
        color2 = color;
        goto L35
    L17:
        if (($changed & 48) != 0) goto L23;
        modifier2 = modifier;
        if ($composer2.changed(modifier2) == false) goto L21;
        int r15 = 32;
    L22:
        $dirty = $dirty | r15;
        goto L24
    L21:
        r15 = 16;
        goto L22
    L23:
        modifier2 = modifier;
        goto L24
    L6:
        if (($changed & 6) != 0) goto L13;
        if ($composer2.changed(text) == false) goto L10;
        int r11 = 4;
    L11:
        $dirty = $dirty | r11;
        goto L13
    L10:
        r11 = 2;
        goto L11
    }

    static {
        LocalTextStyle = CompositionLocalKt.compositionLocalOf(SnapshotStateKt.structuralEqualityPolicy(), TextKt$LocalTextStyle$1.INSTANCE);
    }

    public static final ProvidableCompositionLocal<TextStyle> getLocalTextStyle() {
        return LocalTextStyle;
    }

    public static final void ProvideTextStyle(final TextStyle value, final Function2<? super Composer, ? super Integer, Unit> r7, Composer $composer, final int $changed) {
        Composer $composer2 = $composer.startRestartGroup(1772272796);
        ComposerKt.sourceInformation($composer2, "C(ProvideTextStyle)P(1)401@18018L7,402@18043L80:Text.kt#jmzs0o");
        int $dirty = $changed;
        if (($changed & 6) != 0) goto L10;
        if ($composer2.changed(value) == false) goto L7;
        int r2 = 4;
    L8:
        $dirty = $dirty | r2;
        goto L10
    L7:
        r2 = 2;
    L10:
        if (($changed & 48) != 0) goto L17;
        if ($composer2.changedInstance(r7) == false) goto L14;
        int r3 = 32;
    L15:
        $dirty = $dirty | r3;
        goto L17
    L14:
        r3 = 16;
    L17:
        if (($dirty & 19) == 18) goto L19;
        boolean r4 = true;
    L21:
        if ($composer2.shouldExecute(r4, $dirty & 1) == true) goto L23;
        $composer2.skipToGroupEnd();
    L29:
        ScopeUpdateScope r0 = $composer2.endRestartGroup();
        if (r0 == null) goto L33;
        r0.updateScope(new AnonymousClass1(value, r7, $changed));
        return;
    L33:
        return;
    L23:
        if (ComposerKt.isTraceInProgress() == false) goto L25;
        ComposerKt.traceEventStart(1772272796, $dirty, -1, "androidx.compose.material.ProvideTextStyle (Text.kt:400)");
    L25:
        ProvidableCompositionLocal<TextStyle> r1 = LocalTextStyle;
        ComposerKt.sourceInformationMarkerStart($composer2, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
        Object r5 = $composer2.consume(r1);
        ComposerKt.sourceInformationMarkerEnd($composer2);
        TextStyle mergedStyle = ((TextStyle) r5).merge(value);
        CompositionLocalKt.CompositionLocalProvider(LocalTextStyle.provides(mergedStyle), r7, $composer2, ProvidedValue.$stable | ($dirty & 112));
        if (ComposerKt.isTraceInProgress() == false) goto L29;
        ComposerKt.traceEventEnd();
        goto L29
    L19:
        r4 = false;
        goto L21
    }
}
