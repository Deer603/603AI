package androidx.compose.material3;

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
@Metadata(d1 = {"\u0000\u008a\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\u001a(\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00022\u0011\u0010\b\u001a\r\u0012\u0004\u0012\u00020\u00060\t¢\u0006\u0002\b\nH\u0007¢\u0006\u0002\u0010\u000b\u001aæ\u0001\u0010\f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00122\b\b\u0002\u0010\u0013\u001a\u00020\u00142\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00162\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00182\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\b\b\u0002\u0010\u001b\u001a\u00020\u00142\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001d2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001f2\b\b\u0002\u0010 \u001a\u00020\u00142\b\b\u0002\u0010!\u001a\u00020\"2\b\b\u0002\u0010#\u001a\u00020$2\b\b\u0002\u0010%\u001a\u00020&2\b\b\u0002\u0010'\u001a\u00020&2\u0014\b\u0002\u0010(\u001a\u000e\u0012\u0004\u0012\u00020*\u0012\u0004\u0012\u00020+0)2\u0014\b\u0002\u0010,\u001a\u000e\u0012\u0004\u0012\u00020.\u0012\u0004\u0012\u00020\u00060-2\b\b\u0002\u0010/\u001a\u00020\u0002H\u0007ø\u0001\u0000¢\u0006\u0004\b0\u00101\u001aÜ\u0001\u0010\f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00122\b\b\u0002\u0010\u0013\u001a\u00020\u00142\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00162\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00182\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\b\b\u0002\u0010\u001b\u001a\u00020\u00142\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001d2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001f2\b\b\u0002\u0010 \u001a\u00020\u00142\b\b\u0002\u0010!\u001a\u00020\"2\b\b\u0002\u0010#\u001a\u00020$2\b\b\u0002\u0010%\u001a\u00020&2\u0014\b\u0002\u0010(\u001a\u000e\u0012\u0004\u0012\u00020*\u0012\u0004\u0012\u00020+0)2\u0014\b\u0002\u0010,\u001a\u000e\u0012\u0004\u0012\u00020.\u0012\u0004\u0012\u00020\u00060-2\b\b\u0002\u0010/\u001a\u00020\u0002H\u0007ø\u0001\u0000¢\u0006\u0004\b2\u00103\u001aÆ\u0001\u0010\f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020*2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00122\b\b\u0002\u0010\u0013\u001a\u00020\u00142\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00162\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00182\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\b\b\u0002\u0010\u001b\u001a\u00020\u00142\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001d2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001f2\b\b\u0002\u0010 \u001a\u00020\u00142\b\b\u0002\u0010!\u001a\u00020\"2\b\b\u0002\u0010#\u001a\u00020$2\b\b\u0002\u0010%\u001a\u00020&2\u0014\b\u0002\u0010,\u001a\u000e\u0012\u0004\u0012\u00020.\u0012\u0004\u0012\u00020\u00060-2\b\b\u0002\u0010/\u001a\u00020\u0002H\u0007ø\u0001\u0000¢\u0006\u0004\b4\u00105\u001aÒ\u0001\u0010\f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020*2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00122\b\b\u0002\u0010\u0013\u001a\u00020\u00142\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00162\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00182\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\b\b\u0002\u0010\u001b\u001a\u00020\u00142\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001d2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001f2\b\b\u0002\u0010 \u001a\u00020\u00142\b\b\u0002\u0010!\u001a\u00020\"2\b\b\u0002\u0010#\u001a\u00020$2\b\b\u0002\u0010%\u001a\u00020&2\b\b\u0002\u0010'\u001a\u00020&2\u0016\b\u0002\u0010,\u001a\u0010\u0012\u0004\u0012\u00020.\u0012\u0004\u0012\u00020\u0006\u0018\u00010-2\b\b\u0002\u0010/\u001a\u00020\u0002H\u0007ø\u0001\u0000¢\u0006\u0004\b2\u00106\"\u0017\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u0003\u0010\u0004\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u00067"}, d2 = {"LocalTextStyle", "Landroidx/compose/runtime/ProvidableCompositionLocal;", "Landroidx/compose/ui/text/TextStyle;", "getLocalTextStyle", "()Landroidx/compose/runtime/ProvidableCompositionLocal;", "ProvideTextStyle", "", "value", "content", "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "(Landroidx/compose/ui/text/TextStyle;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "Text", "text", "Landroidx/compose/ui/text/AnnotatedString;", "modifier", "Landroidx/compose/ui/Modifier;", "color", "Landroidx/compose/ui/graphics/Color;", "fontSize", "Landroidx/compose/ui/unit/TextUnit;", "fontStyle", "Landroidx/compose/ui/text/font/FontStyle;", "fontWeight", "Landroidx/compose/ui/text/font/FontWeight;", "fontFamily", "Landroidx/compose/ui/text/font/FontFamily;", "letterSpacing", "textDecoration", "Landroidx/compose/ui/text/style/TextDecoration;", "textAlign", "Landroidx/compose/ui/text/style/TextAlign;", "lineHeight", "overflow", "Landroidx/compose/ui/text/style/TextOverflow;", "softWrap", "", "maxLines", "", "minLines", "inlineContent", "", "", "Landroidx/compose/foundation/text/InlineTextContent;", "onTextLayout", "Lkotlin/Function1;", "Landroidx/compose/ui/text/TextLayoutResult;", "style", "Text-IbK3jfQ", "(Landroidx/compose/ui/text/AnnotatedString;Landroidx/compose/ui/Modifier;JJLandroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontFamily;JLandroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/text/style/TextAlign;JIZIILjava/util/Map;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/runtime/Composer;III)V", "Text--4IGK_g", "(Landroidx/compose/ui/text/AnnotatedString;Landroidx/compose/ui/Modifier;JJLandroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontFamily;JLandroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/text/style/TextAlign;JIZILjava/util/Map;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/runtime/Composer;III)V", "Text-fLXpl1I", "(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLandroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontFamily;JLandroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/text/style/TextAlign;JIZILkotlin/jvm/functions/Function1;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/runtime/Composer;III)V", "(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLandroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontFamily;JLandroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/text/style/TextAlign;JIZIILkotlin/jvm/functions/Function1;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/runtime/Composer;III)V", "material3_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class TextKt {
    private static final ProvidableCompositionLocal<TextStyle> LocalTextStyle = null;

    /* JADX INFO: renamed from: Text--4IGK_g, reason: not valid java name */
    public static final void m2820Text4IGK_g(final String text, Modifier modifier, long color, long fontSize, FontStyle fontStyle, FontWeight fontWeight, FontFamily fontFamily, long letterSpacing, TextDecoration textDecoration, TextAlign textAlign, long lineHeight, int overflow, boolean softWrap, int maxLines, int minLines, Function1<? super TextLayoutResult, Unit> r87, TextStyle style, Composer $composer, final int $changed, final int $changed1, final int r92) {
        Composer $composer2 = $composer.startRestartGroup(-2055108902);
        ComposerKt.sourceInformation($composer2, "C(Text)P(14,9,0:c#ui.graphics.Color,2:c#ui.unit.TextUnit,3:c#ui.text.font.FontStyle,4!1,5:c#ui.unit.TextUnit,16,15:c#ui.text.style.TextAlign,6:c#ui.unit.TextUnit,11:c#ui.text.style.TextOverflow,12)108@5620L7,113@5732L530:Text.kt#uh7d8r");
        int $dirty = $changed;
        if ((r92 & 1) == 0) goto L6;
        $dirty = $dirty | 6;
        String r7 = text;
    L13:
        int r10 = r92 & 2;
        if (r10 == 0) goto L17;
        $dirty = $dirty | 48;
        Modifier modifier2 = modifier;
    L24:
        int r14 = r92 & 4;
        if (r14 == 0) goto L28;
        $dirty = $dirty | 384;
        long color2 = color;
    L35:
        int r18 = r92 & 8;
        int r19 = 2048;
        if (r18 == 0) goto L39;
        $dirty = $dirty | 3072;
        long fontSize2 = fontSize;
    L46:
        int r23 = r92 & 16;
        int r24 = 16384;
        if (r23 == 0) goto L50;
        $dirty = $dirty | 24576;
        FontStyle fontStyle2 = fontStyle;
    L57:
        int r27 = r92 & 32;
        int r28 = 131072;
        if (r27 == 0) goto L61;
        $dirty = $dirty | ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
        FontWeight fontWeight2 = fontWeight;
    L68:
        int r32 = r92 & 64;
        if (r32 == 0) goto L72;
        $dirty = $dirty | 1572864;
    L79:
        int $dirty2 = r92 & 128;
        if ($dirty2 == 0) goto L83;
        int $dirty3 = $dirty | 12582912;
    L90:
        int $dirty4 = r92 & 256;
        if ($dirty4 == 0) goto L94;
        $dirty3 = $dirty3 | 100663296;
    L101:
        int $dirty5 = r92 & 512;
        if ($dirty5 == 0) goto L105;
        $dirty3 = $dirty3 | 805306368;
    L112:
        int $dirty6 = $dirty3;
        int $dirty1 = r92 & 1024;
        if ($dirty1 == 0) goto L117;
        int $dirty7 = $changed1 | 6;
    L124:
        int $dirty8 = r92 & 2048;
        if ($dirty8 == 0) goto L128;
        $dirty7 = $dirty7 | 48;
    L135:
        int $dirty9 = $dirty7;
        int r5 = r92 & 4096;
        if (r5 == 0) goto L139;
        $dirty9 = $dirty9 | 384;
        boolean softWrap2 = softWrap;
    L146:
        int r6 = r92 & 8192;
        if (r6 == 0) goto L149;
        int $dirty10 = $dirty9 | 3072;
    L157:
        int r8 = r92 & 16384;
        if (r8 == 0) goto L161;
        $dirty10 = $dirty10 | 24576;
    L168:
        int r20 = r92 & 32768;
        if (r20 == 0) goto L172;
        $dirty10 = $dirty10 | ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
    L180:
        if (($changed1 & 1572864) != 0) goto L191;
        if ((r92 & 65536) != 0) goto L187;
        if ($composer2.changed(style) == false) goto L187;
        int r21 = 1048576;
    L188:
        $dirty10 = $dirty10 | r21;
    L187:
        r21 = 524288;
    L191:
        if (($dirty6 & 306783379) == 306783378) goto L193;
    L198:
        $composer2.startDefaults();
        if (($changed & 1) != 0) goto L201;
    L207:
        if (r10 == 0) goto L209;
        modifier2 = Modifier.Companion;
    L209:
        if (r14 == 0) goto L211;
        color2 = Color.Companion.m4402getUnspecified0d7_KjU();
    L211:
        if (r18 == 0) goto L213;
        fontSize2 = TextUnit.Companion.m7178getUnspecifiedXSAIIZE();
    L213:
        if (r23 == 0) goto L215;
        fontStyle2 = null;
    L215:
        if (r27 == 0) goto L217;
        fontWeight2 = null;
    L217:
        if (r32 == 0) goto L219;
        FontFamily fontFamily2 = null;
    L220:
        if ($dirty2 == 0) goto L222;
        long letterSpacing2 = TextUnit.Companion.m7178getUnspecifiedXSAIIZE();
    L223:
        if ($dirty4 == 0) goto L225;
        TextDecoration textDecoration2 = null;
    L226:
        if ($dirty5 == 0) goto L228;
        TextAlign textAlign2 = null;
    L229:
        if ($dirty1 == 0) goto L231;
        long lineHeight2 = TextUnit.Companion.m7178getUnspecifiedXSAIIZE();
    L232:
        if ($dirty8 == 0) goto L234;
        int overflow2 = TextOverflow.Companion.m6886getClipgIe3tQ8();
    L235:
        if (r5 == 0) goto L237;
        softWrap2 = true;
    L237:
        if (r6 == 0) goto L239;
        int maxLines2 = Integer.MAX_VALUE;
    L240:
        if (r8 == 0) goto L242;
        int minLines2 = 1;
    L243:
        if (r20 == 0) goto L245;
        Function1<? super TextLayoutResult, Unit> r110 = null;
    L247:
        if ((r92 & 65536) == 0) goto L249;
        FontFamily fontFamily3 = fontFamily2;
        ProvidableCompositionLocal<TextStyle> r1 = LocalTextStyle;
        TextDecoration textDecoration3 = textDecoration2;
        ComposerKt.sourceInformationMarkerStart($composer2, 2023513938, "CC:CompositionLocal.kt#9igjgp");
        Object r2 = $composer2.consume(r1);
        ComposerKt.sourceInformationMarkerEnd($composer2);
        FontFamily fontFamily4 = fontFamily3;
        TextDecoration textDecoration4 = textDecoration3;
        TextStyle style2 = (TextStyle) r2;
        $dirty10 = $dirty10 & (-3670017);
        FontStyle fontStyle3 = fontStyle2;
        long fontSize3 = fontSize2;
        FontWeight fontWeight3 = fontWeight2;
        long letterSpacing3 = letterSpacing2;
        long lineHeight3 = lineHeight2;
    L250:
        $composer2.endDefaults();
        if (ComposerKt.isTraceInProgress() == false) goto L253;
        ComposerKt.traceEventStart(-2055108902, $dirty6, $dirty10, "androidx.compose.material3.Text (Text.kt:109)");
    L253:
        $composer2.startReplaceGroup(-1827892941);
        ComposerKt.sourceInformation($composer2, "");
        long $this$takeOrElse_u2dDxMtmZc$iv = color2;
        boolean r111 = true;
        if ($this$takeOrElse_u2dDxMtmZc$iv == 16) goto L256;
        boolean r17 = true;
    L257:
        if (r17 == false) goto L259;
        $dirty6 = $dirty6;
        long textColor = $this$takeOrElse_u2dDxMtmZc$iv;
    L267:
        $composer2.endReplaceGroup();
        if (textAlign2 == null) goto L270;
        int r0 = textAlign2.m6834unboximpl();
    L271:
        boolean softWrap3 = softWrap2;
        String r69 = r7;
        Modifier modifier3 = modifier2;
        int maxLines3 = maxLines2;
        Function1<? super TextLayoutResult, Unit> r72 = r110;
        int overflow3 = overflow2;
        BasicTextKt.m1035BasicTextVhcvRP8(r69, modifier3, TextStyle.m6437mergedA7vx0o$default(style2, textColor, fontSize3, fontWeight3, fontStyle3, null, fontFamily4, null, letterSpacing3, null, null, null, 0, textDecoration4, null, null, r0, 0, lineHeight3, null, null, 0, 0, null, null, 16609104, null), r72, overflow3, softWrap3, maxLines3, minLines2, null, $composer2, (((((($dirty6 & 14) | ($dirty6 & 112)) | (($dirty10 >> 6) & 7168)) | (($dirty10 << 9) & 57344)) | (($dirty10 << 9) & 458752)) | (($dirty10 << 9) & 3670016)) | (29360128 & ($dirty10 << 9)), 256);
        Composer $composer3 = $composer2;
        if (ComposerKt.isTraceInProgress() == false) goto L274;
        ComposerKt.traceEventEnd();
    L274:
        final boolean softWrap4 = softWrap2;
        final long color3 = color2;
        final Modifier modifier4 = modifier2;
        final TextAlign textAlign3 = textAlign2;
        final int maxLines4 = maxLines2;
        final Function1<? super TextLayoutResult, Unit> r22 = r110;
        final int maxLines5 = overflow2;
        final TextStyle style3 = style2;
        final FontWeight fontWeight4 = fontWeight3;
        final FontStyle fontStyle4 = fontStyle3;
        final FontFamily fontFamily5 = fontFamily4;
        final long letterSpacing4 = letterSpacing3;
        final TextDecoration textDecoration5 = textDecoration4;
        final long lineHeight4 = lineHeight3;
        final int minLines3 = minLines2;
        final long fontSize4 = fontSize3;
    L275:
        ScopeUpdateScope r3 = $composer3.endRestartGroup();
        if (r3 == null) goto L279;
        r3.updateScope(new TextKt$Text$1(text, modifier4, color3, fontSize4, fontStyle4, fontWeight4, fontFamily5, letterSpacing4, textDecoration5, textAlign3, lineHeight4, maxLines5, softWrap4, maxLines4, minLines3, r22, style3, $changed, $changed1, r92));
        return;
    L279:
        return;
    L270:
        r0 = TextAlign.Companion.m6841getUnspecifiede0LSkKk();
        goto L271
    L259:
        $composer2.startReplaceGroup(-1827892168);
        ComposerKt.sourceInformation($composer2, "*111@5715L7");
        long $this$takeOrElse_u2dDxMtmZc$iv2 = style2.m6447getColor0d7_KjU();
        if ($this$takeOrElse_u2dDxMtmZc$iv2 != 16) goto L263;
        r111 = false;
    L263:
        if (r111 == true) goto L266;
        ProvidableCompositionLocal<Color> r4 = ContentColorKt.getLocalContentColor();
        ComposerKt.sourceInformationMarkerStart($composer2, 2023513938, "CC:CompositionLocal.kt#9igjgp");
        Object r9 = $composer2.consume(r4);
        ComposerKt.sourceInformationMarkerEnd($composer2);
        $this$takeOrElse_u2dDxMtmZc$iv2 = ((Color) r9).m4376unboximpl();
    L266:
        $composer2.endReplaceGroup();
        textColor = $this$takeOrElse_u2dDxMtmZc$iv2;
        goto L267
    L256:
        r17 = false;
        goto L257
    L249:
        fontFamily4 = fontFamily2;
        textDecoration4 = textDecoration2;
        style2 = style;
        fontStyle3 = fontStyle2;
        fontSize3 = fontSize2;
        fontWeight3 = fontWeight2;
        letterSpacing3 = letterSpacing2;
        lineHeight3 = lineHeight2;
        goto L250
    L245:
        r110 = r87;
        goto L247
    L242:
        minLines2 = minLines;
        goto L243
    L239:
        maxLines2 = maxLines;
        goto L240
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
    L219:
        fontFamily2 = fontFamily;
        goto L220
    L201:
        if ($composer2.getDefaultsInvalid() == true) goto L207;
        $composer2.skipToGroupEnd();
        if ((r92 & 65536) == 0) goto L206;
        fontFamily4 = fontFamily;
        letterSpacing3 = letterSpacing;
        textDecoration4 = textDecoration;
        textAlign2 = textAlign;
        lineHeight3 = lineHeight;
        overflow2 = overflow;
        maxLines2 = maxLines;
        minLines2 = minLines;
        r110 = r87;
        style2 = style;
        $dirty10 = (-3670017) & $dirty10;
        fontStyle3 = fontStyle2;
        fontSize3 = fontSize2;
        fontWeight3 = fontWeight2;
        goto L250
    L206:
        fontFamily4 = fontFamily;
        letterSpacing3 = letterSpacing;
        textDecoration4 = textDecoration;
        textAlign2 = textAlign;
        lineHeight3 = lineHeight;
        overflow2 = overflow;
        maxLines2 = maxLines;
        minLines2 = minLines;
        r110 = r87;
        style2 = style;
        fontStyle3 = fontStyle2;
        fontSize3 = fontSize2;
        fontWeight3 = fontWeight2;
        goto L250
    L193:
        if ((599187 & $dirty10) != 599186) goto L198;
        if ($composer2.getSkipping() == false) goto L198;
        $composer2.skipToGroupEnd();
        maxLines5 = overflow;
        maxLines4 = maxLines;
        minLines3 = minLines;
        r22 = r87;
        style3 = style;
        $dirty6 = $dirty6;
        $composer3 = $composer2;
        softWrap4 = softWrap2;
        fontStyle4 = fontStyle2;
        color3 = color2;
        fontSize4 = fontSize2;
        modifier4 = modifier2;
        fontWeight4 = fontWeight2;
        fontFamily5 = fontFamily;
        letterSpacing4 = letterSpacing;
        textDecoration5 = textDecoration;
        textAlign3 = textAlign;
        lineHeight4 = lineHeight;
        goto L275
    L172:
        if (($changed1 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) != 0) goto L180;
        if ($composer2.changedInstance(r87) == true) goto L177;
        r28 = 65536;
    L177:
        $dirty10 = $dirty10 | r28;
        goto L180
    L161:
        if (($changed1 & 24576) != 0) goto L168;
        if ($composer2.changed(minLines) == true) goto L166;
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
        int r25 = 4;
    L122:
        $dirty7 = r6 | r25;
        goto L124
    L121:
        r25 = 2;
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
        int r210 = 2048;
    L44:
        $dirty = $dirty | r210;
        goto L46
    L43:
        r210 = 1024;
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
        if (($changed & 6) != 0) goto L12;
        r7 = text;
        if ($composer2.changed(r7) == false) goto L10;
        int r11 = 4;
    L11:
        $dirty = $dirty | r11;
        goto L13
    L10:
        r11 = 2;
        goto L11
    L12:
        r7 = text;
        goto L13
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Maintained for binary compatibility. Use version with minLines instead")
    /* JADX INFO: renamed from: Text-fLXpl1I, reason: not valid java name */
    public static final /* synthetic */ void m2822TextfLXpl1I(final String text, Modifier modifier, long color, long fontSize, FontStyle fontStyle, FontWeight fontWeight, FontFamily fontFamily, long letterSpacing, TextDecoration textDecoration, TextAlign textAlign, long lineHeight, int overflow, boolean softWrap, int maxLines, Function1 onTextLayout, TextStyle style, Composer $composer, final int $changed, final int $changed1, final int r66) {
        Composer $composer2 = $composer.startRestartGroup(1968784669);
        ComposerKt.sourceInformation($composer2, "C(Text)P(13,8,0:c#ui.graphics.Color,2:c#ui.unit.TextUnit,3:c#ui.text.font.FontStyle,4!1,5:c#ui.unit.TextUnit,15,14:c#ui.text.style.TextAlign,6:c#ui.unit.TextUnit,10:c#ui.text.style.TextOverflow,11)156@7042L7,158@7058L322:Text.kt#uh7d8r");
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
    L187:
        $composer2.startDefaults();
        if (($changed & 1) != 0) goto L190;
    L196:
        if (r10 == 0) goto L198;
        modifier2 = Modifier.Companion;
    L198:
        if (r14 == 0) goto L200;
        color2 = Color.Companion.m4402getUnspecified0d7_KjU();
    L200:
        if (r18 == 0) goto L202;
        fontSize2 = TextUnit.Companion.m7178getUnspecifiedXSAIIZE();
    L202:
        if (r23 == 0) goto L204;
        fontStyle2 = null;
    L204:
        if (r27 == 0) goto L206;
        fontWeight2 = null;
    L206:
        if (r32 == 0) goto L208;
        FontFamily fontFamily2 = null;
    L209:
        if ($dirty2 == 0) goto L211;
        long letterSpacing2 = TextUnit.Companion.m7178getUnspecifiedXSAIIZE();
    L212:
        if ($dirty4 == 0) goto L214;
        TextDecoration textDecoration2 = null;
    L215:
        if ($dirty5 == 0) goto L217;
        TextAlign textAlign2 = null;
    L218:
        if ($dirty1 == 0) goto L220;
        long lineHeight2 = TextUnit.Companion.m7178getUnspecifiedXSAIIZE();
    L221:
        if ($dirty8 == 0) goto L223;
        int overflow2 = TextOverflow.Companion.m6886getClipgIe3tQ8();
    L224:
        if (r5 == 0) goto L226;
        softWrap2 = true;
    L226:
        if (r6 == 0) goto L228;
        int maxLines2 = Integer.MAX_VALUE;
    L229:
        if (r7 == 0) goto L231;
        TextKt$Text$2 onTextLayout2 = TextKt$Text$2.INSTANCE;
    L233:
        if ((r66 & 32768) == 0) goto L235;
        FontFamily fontFamily3 = fontFamily2;
        ProvidableCompositionLocal<TextStyle> r1 = LocalTextStyle;
        TextDecoration textDecoration3 = textDecoration2;
        ComposerKt.sourceInformationMarkerStart($composer2, 2023513938, "CC:CompositionLocal.kt#9igjgp");
        Object r2 = $composer2.consume(r1);
        ComposerKt.sourceInformationMarkerEnd($composer2);
        TextStyle style2 = (TextStyle) r2;
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
    L236:
        $composer2.endDefaults();
        if (ComposerKt.isTraceInProgress() == false) goto L239;
        ComposerKt.traceEventStart(1968784669, $dirty6, $dirty10, "androidx.compose.material3.Text (Text.kt:157)");
    L239:
        Composer $composer3 = $composer2;
        m2820Text4IGK_g(text, modifier3, color3, fontSize3, fontStyle3, fontWeight3, fontFamily4, letterSpacing3, textDecoration4, textAlign3, letterSpacing4, overflow3, softWrap3, maxLines3, 1, onTextLayout3, style2, $composer3, ((((((((($dirty6 & 14) | ($dirty6 & 112)) | ($dirty6 & 896)) | ($dirty6 & 7168)) | (57344 & $dirty6)) | (458752 & $dirty6)) | (3670016 & $dirty6)) | (29360128 & $dirty6)) | (234881024 & $dirty6)) | (1879048192 & $dirty6), (((((($dirty10 & 14) | 24576) | ($dirty10 & 112)) | ($dirty10 & 896)) | ($dirty10 & 7168)) | (($dirty10 << 3) & 458752)) | (($dirty10 << 3) & 3670016), 0);
        if (ComposerKt.isTraceInProgress() == false) goto L242;
        ComposerKt.traceEventEnd();
    L242:
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
    L243:
        ScopeUpdateScope r3 = $composer3.endRestartGroup();
        if (r3 == null) goto L247;
        r3.updateScope(new TextKt$Text$3(text, modifier4, color4, fontSize4, fontStyle4, fontWeight4, fontFamily5, letterSpacing5, textDecoration5, textAlign4, lineHeight3, overflow4, softWrap4, maxLines4, onTextLayout4, style3, $changed, $changed1, r66));
        return;
    L247:
        return;
    L235:
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
        goto L236
    L231:
        onTextLayout2 = onTextLayout;
        goto L233
    L228:
        maxLines2 = maxLines;
        goto L229
    L223:
        overflow2 = overflow;
        goto L224
    L220:
        lineHeight2 = lineHeight;
        goto L221
    L217:
        textAlign2 = textAlign;
        goto L218
    L214:
        textDecoration2 = textDecoration;
        goto L215
    L211:
        letterSpacing2 = letterSpacing;
        goto L212
    L208:
        fontFamily2 = fontFamily;
        goto L209
    L190:
        if ($composer2.getDefaultsInvalid() == true) goto L196;
        $composer2.skipToGroupEnd();
        if ((r66 & 32768) == 0) goto L195;
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
        goto L236
    L195:
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
        goto L236
    L182:
        if ((74899 & $dirty10) != 74898) goto L187;
        if ($composer2.getSkipping() == false) goto L187;
        $composer2.skipToGroupEnd();
        overflow4 = overflow;
        maxLines4 = maxLines;
        onTextLayout4 = onTextLayout;
        style3 = style;
        $composer3 = $composer2;
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
        goto L243
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
    public static final void m2821TextIbK3jfQ(final AnnotatedString text, Modifier modifier, long color, long fontSize, FontStyle fontStyle, FontWeight fontWeight, FontFamily fontFamily, long letterSpacing, TextDecoration textDecoration, TextAlign textAlign, long lineHeight, int overflow, boolean softWrap, int maxLines, int minLines, Map<String, InlineTextContent> r67, Function1<? super TextLayoutResult, Unit> r68, TextStyle style, Composer $composer, final int $changed, final int $changed1, final int r73) {
        Composer $composer2 = $composer.startRestartGroup(2027001676);
        ComposerKt.sourceInformation($composer2, "C(Text)P(15,10,0:c#ui.graphics.Color,2:c#ui.unit.TextUnit,3:c#ui.text.font.FontStyle,4!1,6:c#ui.unit.TextUnit,17,16:c#ui.text.style.TextAlign,7:c#ui.unit.TextUnit,12:c#ui.text.style.TextOverflow,13,8,9)254@11726L7,258@11837L706:Text.kt#uh7d8r");
        int $dirty = $changed;
        int $dirty1 = $changed1;
        if ((r73 & 1) == 0) goto L6;
        $dirty = $dirty | 6;
        AnnotatedString r6 = text;
    L13:
        int r9 = r73 & 2;
        if (r9 == 0) goto L17;
        $dirty = $dirty | 48;
        Modifier modifier2 = modifier;
    L24:
        int r13 = r73 & 4;
        if (r13 == 0) goto L28;
        $dirty = $dirty | 384;
        long color2 = color;
    L35:
        int r17 = r73 & 8;
        int r18 = 2048;
        if (r17 == 0) goto L39;
        $dirty = $dirty | 3072;
        long fontSize2 = fontSize;
    L46:
        int r22 = r73 & 16;
        int r23 = 16384;
        if (r22 == 0) goto L50;
        $dirty = $dirty | 24576;
        final FontStyle fontStyle2 = fontStyle;
    L57:
        int r26 = r73 & 32;
        if (r26 == 0) goto L61;
        $dirty = $dirty | ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
        FontWeight fontWeight2 = fontWeight;
    L68:
        int r31 = r73 & 64;
        if (r31 == 0) goto L72;
        $dirty = $dirty | 1572864;
        FontFamily fontFamily2 = fontFamily;
    L79:
        int $dirty2 = r73 & 128;
        if ($dirty2 == 0) goto L83;
        int $dirty3 = $dirty | 12582912;
    L90:
        int $dirty4 = r73 & 256;
        if ($dirty4 == 0) goto L94;
        $dirty3 = $dirty3 | 100663296;
    L101:
        int $dirty5 = r73 & 512;
        if ($dirty5 == 0) goto L105;
        $dirty3 = $dirty3 | 805306368;
    L112:
        int $dirty6 = $dirty3;
        int $dirty7 = r73 & 1024;
        if ($dirty7 == 0) goto L115;
        $dirty1 = $dirty1 | 6;
    L123:
        int $dirty8 = r73 & 2048;
        if ($dirty8 == 0) goto L127;
        $dirty1 = $dirty1 | 48;
    L134:
        int $dirty9 = $dirty1;
        int r5 = r73 & 4096;
        if (r5 == 0) goto L137;
        int $dirty10 = $dirty9 | 384;
    L146:
        int r7 = r73 & 8192;
        if (r7 == 0) goto L149;
        int $dirty11 = $dirty10 | 3072;
    L157:
        int r8 = r73 & 16384;
        if (r8 == 0) goto L161;
        $dirty11 = $dirty11 | 24576;
    L168:
        int r19 = r73 & 32768;
        if (r19 == 0) goto L172;
        $dirty11 = $dirty11 | ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
    L179:
        int r24 = r73 & 65536;
        if (r24 == 0) goto L183;
        $dirty11 = $dirty11 | 1572864;
    L191:
        if (($changed1 & 12582912) != 0) goto L202;
        if ((r73 & 131072) != 0) goto L198;
        if ($composer2.changed(style) == false) goto L198;
        int r25 = 8388608;
    L199:
        $dirty11 = $dirty11 | r25;
    L198:
        r25 = 4194304;
    L202:
        if (($dirty6 & 306783379) == 306783378) goto L204;
    L209:
        $composer2.startDefaults();
        if (($changed & 1) != 0) goto L212;
    L218:
        if (r9 == 0) goto L220;
        modifier2 = Modifier.Companion;
    L220:
        if (r13 == 0) goto L222;
        color2 = Color.Companion.m4402getUnspecified0d7_KjU();
    L222:
        if (r17 == 0) goto L224;
        fontSize2 = TextUnit.Companion.m7178getUnspecifiedXSAIIZE();
    L224:
        if (r22 == 0) goto L226;
        fontStyle2 = null;
    L226:
        if (r26 == 0) goto L228;
        fontWeight2 = null;
    L228:
        if (r31 == 0) goto L230;
        fontFamily2 = null;
    L230:
        if ($dirty2 == 0) goto L232;
        long letterSpacing2 = TextUnit.Companion.m7178getUnspecifiedXSAIIZE();
    L233:
        if ($dirty4 == 0) goto L235;
        TextDecoration textDecoration2 = null;
    L236:
        if ($dirty5 == 0) goto L238;
        TextAlign textAlign2 = null;
    L239:
        if ($dirty7 == 0) goto L241;
        long lineHeight2 = TextUnit.Companion.m7178getUnspecifiedXSAIIZE();
    L242:
        if ($dirty8 == 0) goto L244;
        int overflow2 = TextOverflow.Companion.m6886getClipgIe3tQ8();
    L245:
        if (r5 == 0) goto L247;
        boolean softWrap2 = true;
    L248:
        if (r7 == 0) goto L250;
        int maxLines2 = Integer.MAX_VALUE;
    L251:
        if (r8 == 0) goto L253;
        int minLines2 = 1;
    L254:
        if (r19 == 0) goto L256;
        Map<String, InlineTextContent> r110 = MapsKt.emptyMap();
    L257:
        if (r24 == 0) goto L259;
        TextKt$Text$4 r21 = TextKt$Text$4.INSTANCE;
    L261:
        if ((r73 & 131072) == 0) goto L263;
        long letterSpacing3 = letterSpacing2;
        ProvidableCompositionLocal<TextStyle> r1 = LocalTextStyle;
        ComposerKt.sourceInformationMarkerStart($composer2, 2023513938, "CC:CompositionLocal.kt#9igjgp");
        Object r2 = $composer2.consume(r1);
        ComposerKt.sourceInformationMarkerEnd($composer2);
        TextStyle style2 = (TextStyle) r2;
        int r3 = $dirty11 & (-29360129);
        TextDecoration textDecoration3 = textDecoration2;
        boolean softWrap3 = softWrap2;
        long lineHeight3 = lineHeight2;
        long letterSpacing4 = letterSpacing3;
        TextStyle style3 = style2;
        TextAlign textAlign3 = textAlign2;
        FontWeight r46 = fontWeight2;
        int $dirty12 = r3;
        int overflow3 = overflow2;
        long fontSize3 = fontSize2;
        Map<String, InlineTextContent> r10 = r110;
        Function1<? super TextLayoutResult, Unit> r11 = r21;
        FontStyle fontStyle3 = fontStyle2;
        FontFamily fontFamily3 = fontFamily2;
        int minLines3 = minLines2;
        int minLines4 = maxLines2;
        FontWeight fontWeight3 = r46;
    L264:
        $composer2.endDefaults();
        if (ComposerKt.isTraceInProgress() == false) goto L268;
        ComposerKt.traceEventStart(2027001676, $dirty6, $dirty12, "androidx.compose.material3.Text (Text.kt:255)");
    L268:
        $composer2.startReplaceGroup(-1827697581);
        ComposerKt.sourceInformation($composer2, "");
        long textColor = color2;
        boolean r27 = true;
        if (textColor == 16) goto L271;
        boolean r20 = true;
    L272:
        if (r20 == false) goto L274;
        overflow3 = overflow3;
    L282:
        $composer2.endReplaceGroup();
        if (textAlign3 == 0) goto L285;
        int r0 = textAlign3.m6834unboximpl();
    L286:
        int $dirty13 = $dirty12;
        boolean softWrap4 = softWrap3;
        int maxLines3 = minLines4;
        AnnotatedString r49 = r6;
        int minLines5 = minLines3;
        Map<String, InlineTextContent> r57 = r10;
        Function1<? super TextLayoutResult, Unit> r52 = r11;
        Modifier modifier3 = modifier2;
        BasicTextKt.m1032BasicTextRWo7tUw(r49, modifier3, TextStyle.m6437mergedA7vx0o$default(style3, textColor, fontSize3, fontWeight3, fontStyle3, null, fontFamily3, null, letterSpacing4, null, null, null, 0, textDecoration3, null, null, r0, 0, lineHeight3, null, null, 0, 0, null, null, 16609104, null), r52, overflow3, softWrap4, maxLines3, minLines5, r57, null, $composer2, ((((((($dirty13 >> 9) & 7168) | (($dirty6 & 14) | ($dirty6 & 112))) | (($dirty13 << 9) & 57344)) | (($dirty13 << 9) & 458752)) | (($dirty13 << 9) & 3670016)) | (($dirty13 << 9) & 29360128)) | (($dirty13 << 9) & 234881024), 512);
        int overflow4 = overflow3;
        Composer $composer3 = $composer2;
        if (ComposerKt.isTraceInProgress() == false) goto L289;
        ComposerKt.traceEventEnd();
    L289:
        final TextStyle style4 = style3;
        fontStyle2 = fontStyle3;
        final long letterSpacing5 = letterSpacing4;
        final long lineHeight4 = lineHeight3;
        final TextAlign textAlign4 = textAlign3;
        final int minLines6 = minLines5;
        final long fontSize4 = fontSize3;
        final boolean softWrap5 = softWrap4;
        final int overflow5 = overflow4;
        final Map<String, InlineTextContent> r28 = r57;
        FontWeight r47 = fontWeight3;
        final int maxLines4 = maxLines3;
        final Modifier modifier4 = modifier2;
        final TextDecoration textDecoration4 = textDecoration3;
        FontFamily r48 = fontFamily3;
        final Function1<? super TextLayoutResult, Unit> r29 = r52;
        final long color3 = color2;
        final FontWeight fontWeight4 = r47;
        final FontFamily fontFamily4 = r48;
    L290:
        ScopeUpdateScope r4 = $composer3.endRestartGroup();
        if (r4 == null) goto L294;
        r4.updateScope(new TextKt$Text$5(text, modifier4, color3, fontSize4, fontStyle2, fontWeight4, fontFamily4, letterSpacing5, textDecoration4, textAlign4, lineHeight4, overflow5, softWrap5, maxLines4, minLines6, r28, r29, style4, $changed, $changed1, r73));
        return;
    L294:
        return;
    L285:
        r0 = TextAlign.Companion.m6841getUnspecifiede0LSkKk();
        goto L286
    L274:
        $composer2.startReplaceGroup(-1827696808);
        ComposerKt.sourceInformation($composer2, "*256@11820L7");
        long $this$takeOrElse_u2dDxMtmZc$iv = style3.m6447getColor0d7_KjU();
        if ($this$takeOrElse_u2dDxMtmZc$iv != 16) goto L278;
        r27 = false;
    L278:
        if (r27 == true) goto L281;
        ProvidableCompositionLocal<Color> r12 = ContentColorKt.getLocalContentColor();
        ComposerKt.sourceInformationMarkerStart($composer2, 2023513938, "CC:CompositionLocal.kt#9igjgp");
        Object r14 = $composer2.consume(r12);
        ComposerKt.sourceInformationMarkerEnd($composer2);
        $this$takeOrElse_u2dDxMtmZc$iv = ((Color) r14).m4376unboximpl();
    L281:
        $composer2.endReplaceGroup();
        textColor = $this$takeOrElse_u2dDxMtmZc$iv;
        goto L282
    L271:
        r20 = false;
        goto L272
    L263:
        long letterSpacing6 = letterSpacing2;
        int $dirty14 = $dirty11;
        textDecoration3 = textDecoration2;
        textAlign3 = textAlign2;
        overflow3 = overflow2;
        softWrap3 = softWrap2;
        lineHeight3 = lineHeight2;
        letterSpacing4 = letterSpacing6;
        style3 = style;
        fontSize3 = fontSize2;
        r10 = r110;
        r11 = r21;
        fontStyle3 = fontStyle2;
        fontFamily3 = fontFamily2;
        minLines3 = minLines2;
        minLines4 = maxLines2;
        fontWeight3 = fontWeight2;
        $dirty12 = $dirty14;
        goto L264
    L259:
        r21 = r68;
        goto L261
    L256:
        r110 = r67;
        goto L257
    L253:
        minLines2 = minLines;
        goto L254
    L250:
        maxLines2 = maxLines;
        goto L251
    L247:
        softWrap2 = softWrap;
        goto L248
    L244:
        overflow2 = overflow;
        goto L245
    L241:
        lineHeight2 = lineHeight;
        goto L242
    L238:
        textAlign2 = textAlign;
        goto L239
    L235:
        textDecoration2 = textDecoration;
        goto L236
    L232:
        letterSpacing2 = letterSpacing;
        goto L233
    L212:
        if ($composer2.getDefaultsInvalid() == true) goto L218;
        $composer2.skipToGroupEnd();
        if ((r73 & 131072) == 0) goto L217;
        int r15 = (-29360129) & $dirty11;
        letterSpacing4 = letterSpacing;
        textDecoration3 = textDecoration;
        lineHeight3 = lineHeight;
        overflow3 = overflow;
        softWrap3 = softWrap;
        minLines4 = maxLines;
        style3 = style;
        fontStyle3 = fontStyle2;
        fontSize3 = fontSize2;
        fontWeight3 = fontWeight2;
        fontFamily3 = fontFamily2;
        minLines3 = minLines;
        r10 = r67;
        r11 = r68;
        $dirty12 = r15;
        textAlign3 = textAlign;
        goto L264
    L217:
        letterSpacing4 = letterSpacing;
        textDecoration3 = textDecoration;
        textAlign3 = textAlign;
        lineHeight3 = lineHeight;
        overflow3 = overflow;
        minLines4 = maxLines;
        style3 = style;
        fontStyle3 = fontStyle2;
        fontSize3 = fontSize2;
        fontWeight3 = fontWeight2;
        fontFamily3 = fontFamily2;
        minLines3 = minLines;
        r10 = r67;
        r11 = r68;
        $dirty12 = $dirty11;
        softWrap3 = softWrap;
        goto L264
    L204:
        if ((4793491 & $dirty11) != 4793490) goto L209;
        if ($composer2.getSkipping() == false) goto L209;
        $composer2.skipToGroupEnd();
        textAlign4 = textAlign;
        overflow5 = overflow;
        softWrap5 = softWrap;
        maxLines4 = maxLines;
        minLines6 = minLines;
        r28 = r67;
        r29 = r68;
        style4 = style;
        $dirty6 = $dirty6;
        $composer3 = $composer2;
        color3 = color2;
        fontSize4 = fontSize2;
        modifier4 = modifier2;
        fontWeight4 = fontWeight2;
        fontFamily4 = fontFamily2;
        letterSpacing5 = letterSpacing;
        textDecoration4 = textDecoration;
        lineHeight4 = lineHeight;
        goto L290
    L183:
        if (($changed1 & 1572864) != 0) goto L191;
        if ($composer2.changedInstance(r68) == false) goto L187;
        int r210 = 1048576;
    L188:
        $dirty11 = $dirty11 | r210;
        goto L191
    L187:
        r210 = 524288;
        goto L188
    L172:
        if (($changed1 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) != 0) goto L179;
        if ($composer2.changedInstance(r67) == false) goto L176;
        int r211 = 131072;
    L177:
        $dirty11 = $dirty11 | r211;
        goto L179
    L176:
        r211 = 65536;
        goto L177
    L161:
        if (($changed1 & 24576) != 0) goto L168;
        if ($composer2.changed(minLines) == true) goto L166;
        r23 = 8192;
    L166:
        $dirty11 = $dirty11 | r23;
        goto L168
    L149:
        int $dirty15 = $dirty10;
        int $dirty16 = $changed1 & 3072;
        if ($dirty16 == 0) goto L152;
        $dirty11 = $dirty15;
        goto L157
    L152:
        if ($composer2.changed(maxLines) == true) goto L155;
        r18 = 1024;
    L155:
        $dirty11 = $dirty15 | r18;
        goto L157
    L137:
        int $dirty17 = $dirty9;
        int $dirty18 = $changed1 & 384;
        if ($dirty18 != 0) goto L145;
        if ($composer2.changed(softWrap) == false) goto L142;
        int r30 = 256;
    L143:
        $dirty17 = $dirty17 | r30;
        goto L145
    L142:
        r30 = 128;
    L145:
        $dirty10 = $dirty17;
        goto L146
    L127:
        if (($changed1 & 48) != 0) goto L134;
        if ($composer2.changed(overflow) == false) goto L131;
        int r212 = 32;
    L132:
        $dirty1 = $dirty1 | r212;
        goto L134
    L131:
        r212 = 16;
        goto L132
    L115:
        int $dirty19 = $changed1 & 6;
        if ($dirty19 != 0) goto L123;
        if ($composer2.changed(lineHeight) == false) goto L120;
        int r213 = 4;
    L121:
        $dirty1 = $dirty1 | r213;
        goto L123
    L120:
        r213 = 2;
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
        int $dirty20 = $dirty;
        if ($composer2.changed(letterSpacing) == false) goto L87;
        int r37 = 8388608;
    L88:
        $dirty3 = $dirty20 | r37;
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
        int r214 = 16384;
    L55:
        $dirty = $dirty | r214;
        goto L57
    L54:
        r214 = 8192;
        goto L55
    L56:
        fontStyle2 = fontStyle;
        goto L57
    L39:
        if (($changed & 3072) != 0) goto L45;
        fontSize2 = fontSize;
        if ($composer2.changed(fontSize2) == false) goto L43;
        int r215 = 2048;
    L44:
        $dirty = $dirty | r215;
        goto L46
    L43:
        r215 = 1024;
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
        int r16 = 32;
    L22:
        $dirty = $dirty | r16;
        goto L24
    L21:
        r16 = 16;
        goto L22
    L23:
        modifier2 = modifier;
        goto L24
    L6:
        if (($changed & 6) != 0) goto L12;
        r6 = text;
        if ($composer2.changed(r6) == false) goto L10;
        int r33 = 4;
    L11:
        $dirty = $dirty | r33;
        goto L13
    L10:
        r33 = 2;
        goto L11
    L12:
        r6 = text;
        goto L13
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Maintained for binary compatibility. Use version with minLines instead")
    /* JADX INFO: renamed from: Text--4IGK_g, reason: not valid java name */
    public static final /* synthetic */ void m2819Text4IGK_g(final AnnotatedString text, Modifier modifier, long color, long fontSize, FontStyle fontStyle, FontWeight fontWeight, FontFamily fontFamily, long letterSpacing, TextDecoration textDecoration, TextAlign textAlign, long lineHeight, int overflow, boolean softWrap, int maxLines, Map inlineContent, Function1 onTextLayout, TextStyle style, Composer $composer, final int $changed, final int $changed1, final int r67) {
        Composer $composer2 = $composer.startRestartGroup(224529679);
        ComposerKt.sourceInformation($composer2, "C(Text)P(14,9,0:c#ui.graphics.Color,2:c#ui.unit.TextUnit,3:c#ui.text.font.FontStyle,4!1,6:c#ui.unit.TextUnit,16,15:c#ui.text.style.TextAlign,7:c#ui.unit.TextUnit,11:c#ui.text.style.TextOverflow,12,8)304@13393L7,306@13409L345:Text.kt#uh7d8r");
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
    L198:
        $composer2.startDefaults();
        if (($changed & 1) != 0) goto L201;
    L207:
        if (r10 == 0) goto L209;
        modifier2 = Modifier.Companion;
    L209:
        if (r14 == 0) goto L211;
        color2 = Color.Companion.m4402getUnspecified0d7_KjU();
    L211:
        if (r18 == 0) goto L213;
        fontSize2 = TextUnit.Companion.m7178getUnspecifiedXSAIIZE();
    L213:
        if (r23 == 0) goto L215;
        fontStyle2 = null;
    L215:
        if (r27 == 0) goto L217;
        fontWeight2 = null;
    L217:
        if (r32 == 0) goto L219;
        FontFamily fontFamily2 = null;
    L220:
        if ($dirty2 == 0) goto L222;
        long letterSpacing2 = TextUnit.Companion.m7178getUnspecifiedXSAIIZE();
    L223:
        if ($dirty4 == 0) goto L225;
        TextDecoration textDecoration2 = null;
    L226:
        if ($dirty5 == 0) goto L228;
        TextAlign textAlign2 = null;
    L229:
        if ($dirty1 == 0) goto L231;
        long lineHeight2 = TextUnit.Companion.m7178getUnspecifiedXSAIIZE();
    L232:
        if ($dirty8 == 0) goto L234;
        int overflow2 = TextOverflow.Companion.m6886getClipgIe3tQ8();
    L235:
        if (r5 == 0) goto L237;
        softWrap2 = true;
    L237:
        if (r6 == 0) goto L239;
        int maxLines2 = Integer.MAX_VALUE;
    L240:
        if (r7 == 0) goto L242;
        Map inlineContent2 = MapsKt.emptyMap();
    L243:
        if (r20 == 0) goto L245;
        TextKt$Text$6 onTextLayout2 = TextKt$Text$6.INSTANCE;
    L247:
        if ((r67 & 65536) == 0) goto L249;
        FontFamily fontFamily3 = fontFamily2;
        ProvidableCompositionLocal<TextStyle> r1 = LocalTextStyle;
        TextDecoration textDecoration3 = textDecoration2;
        ComposerKt.sourceInformationMarkerStart($composer2, 2023513938, "CC:CompositionLocal.kt#9igjgp");
        Object r2 = $composer2.consume(r1);
        ComposerKt.sourceInformationMarkerEnd($composer2);
        TextStyle style2 = (TextStyle) r2;
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
    L250:
        $composer2.endDefaults();
        if (ComposerKt.isTraceInProgress() == false) goto L253;
        ComposerKt.traceEventStart(224529679, $dirty6, $dirty10, "androidx.compose.material3.Text (Text.kt:305)");
    L253:
        Composer $composer3 = $composer2;
        m2821TextIbK3jfQ(text, modifier3, color3, fontSize3, fontStyle3, fontWeight3, fontFamily4, letterSpacing3, textDecoration4, textAlign3, letterSpacing4, overflow3, softWrap3, maxLines3, 1, inlineContent3, onTextLayout3, style2, $composer3, ((((((((($dirty6 & 14) | ($dirty6 & 112)) | ($dirty6 & 896)) | ($dirty6 & 7168)) | (57344 & $dirty6)) | (458752 & $dirty6)) | (3670016 & $dirty6)) | (29360128 & $dirty6)) | (234881024 & $dirty6)) | (1879048192 & $dirty6), ((((((($dirty10 & 14) | 24576) | ($dirty10 & 112)) | ($dirty10 & 896)) | ($dirty10 & 7168)) | (($dirty10 << 3) & 458752)) | (($dirty10 << 3) & 3670016)) | (($dirty10 << 3) & 29360128), 0);
        if (ComposerKt.isTraceInProgress() == false) goto L256;
        ComposerKt.traceEventEnd();
    L256:
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
    L257:
        ScopeUpdateScope r3 = $composer3.endRestartGroup();
        if (r3 == null) goto L261;
        r3.updateScope(new TextKt$Text$7(text, modifier4, color4, fontSize4, fontStyle4, fontWeight4, fontFamily5, letterSpacing5, textDecoration5, textAlign4, lineHeight3, overflow4, softWrap4, maxLines4, inlineContent4, onTextLayout4, style3, $changed, $changed1, r67));
        return;
    L261:
        return;
    L249:
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
        goto L250
    L245:
        onTextLayout2 = onTextLayout;
        goto L247
    L242:
        inlineContent2 = inlineContent;
        goto L243
    L239:
        maxLines2 = maxLines;
        goto L240
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
    L219:
        fontFamily2 = fontFamily;
        goto L220
    L201:
        if ($composer2.getDefaultsInvalid() == true) goto L207;
        $composer2.skipToGroupEnd();
        if ((r67 & 65536) == 0) goto L206;
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
        goto L250
    L206:
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
        goto L250
    L193:
        if ((599187 & $dirty10) != 599186) goto L198;
        if ($composer2.getSkipping() == false) goto L198;
        $composer2.skipToGroupEnd();
        overflow4 = overflow;
        maxLines4 = maxLines;
        inlineContent4 = inlineContent;
        onTextLayout4 = onTextLayout;
        style3 = style;
        $composer3 = $composer2;
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
        goto L257
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
        Composer $composer2 = $composer.startRestartGroup(-460300127);
        ComposerKt.sourceInformation($composer2, "C(ProvideTextStyle)P(1)347@14710L7,348@14735L80:Text.kt#uh7d8r");
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
        if (($dirty & 19) != 18) goto L23;
        if ($composer2.getSkipping() == false) goto L23;
        $composer2.skipToGroupEnd();
    L28:
        ScopeUpdateScope r0 = $composer2.endRestartGroup();
        if (r0 == null) goto L32;
        r0.updateScope(new AnonymousClass1(value, r7, $changed));
        return;
    L32:
        return;
    L23:
        if (ComposerKt.isTraceInProgress() == false) goto L25;
        ComposerKt.traceEventStart(-460300127, $dirty, -1, "androidx.compose.material3.ProvideTextStyle (Text.kt:346)");
    L25:
        ProvidableCompositionLocal<TextStyle> r1 = LocalTextStyle;
        ComposerKt.sourceInformationMarkerStart($composer2, 2023513938, "CC:CompositionLocal.kt#9igjgp");
        Object r4 = $composer2.consume(r1);
        ComposerKt.sourceInformationMarkerEnd($composer2);
        TextStyle mergedStyle = ((TextStyle) r4).merge(value);
        CompositionLocalKt.CompositionLocalProvider(LocalTextStyle.provides(mergedStyle), r7, $composer2, ProvidedValue.$stable | ($dirty & 112));
        if (ComposerKt.isTraceInProgress() == false) goto L28;
        ComposerKt.traceEventEnd();
        goto L28
    }
}
