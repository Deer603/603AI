package androidx.compose.foundation.text;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.style.TextOverflow;
import androidx.profileinstaller.ProfileVerifier;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: ClickableText.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00008\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001av\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\u0014\b\u0002\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00010\u000f2\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00010\u000fH\u0007ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0013\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0014"}, d2 = {"ClickableText", "", "text", "Landroidx/compose/ui/text/AnnotatedString;", "modifier", "Landroidx/compose/ui/Modifier;", "style", "Landroidx/compose/ui/text/TextStyle;", "softWrap", "", "overflow", "Landroidx/compose/ui/text/style/TextOverflow;", "maxLines", "", "onTextLayout", "Lkotlin/Function1;", "Landroidx/compose/ui/text/TextLayoutResult;", "onClick", "ClickableText-4YKlhWE", "(Landroidx/compose/ui/text/AnnotatedString;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/text/TextStyle;ZIILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "foundation_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class ClickableTextKt {
    @Deprecated(message = "Use Text or BasicText and pass an AnnotatedString that contains a LinkAnnotation. Check LinkAnnotation's documentation for more details and samples.")
    /* JADX INFO: renamed from: ClickableText-4YKlhWE, reason: not valid java name */
    public static final void m1039ClickableText4YKlhWE(final AnnotatedString text, Modifier modifier, TextStyle style, boolean softWrap, int overflow, int maxLines, Function1<? super TextLayoutResult, Unit> r33, final Function1<? super Integer, Unit> r34, Composer $composer, final int $changed, final int r37) {
        Composer $composer2 = $composer.startRestartGroup(-246609449);
        ComposerKt.sourceInformation($composer2, "C(ClickableText)P(7,1,6,5,4:c#ui.text.style.TextOverflow!1,3)80@3824L52,82@3941L208,97@4370L76,90@4155L297:ClickableText.kt#423gt5");
        int $dirty = $changed;
        if ((r37 & 1) == 0) goto L6;
        $dirty = $dirty | 6;
        AnnotatedString r11 = text;
    L13:
        int r3 = r37 & 2;
        if (r3 == 0) goto L17;
        $dirty = $dirty | 48;
        Modifier modifier2 = modifier;
    L24:
        int r6 = r37 & 4;
        if (r6 == 0) goto L28;
        $dirty = $dirty | 384;
        TextStyle r7 = style;
    L35:
        int r12 = r37 & 8;
        if (r12 == 0) goto L39;
        $dirty = $dirty | 3072;
    L46:
        int r14 = r37 & 16;
        if (r14 == 0) goto L50;
        $dirty = $dirty | 24576;
        int overflow2 = overflow;
    L57:
        int r16 = r37 & 32;
        if (r16 == 0) goto L61;
        $dirty = $dirty | ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
        int r4 = maxLines;
    L68:
        int r17 = r37 & 64;
        if (r17 == 0) goto L72;
        $dirty = $dirty | 1572864;
    L80:
        if ((r37 & 128) == 0) goto L83;
        $dirty = $dirty | 12582912;
    L89:
        boolean invalid$iv = false;
        if (($dirty & 4793491) == 4793490) goto L92;
        boolean r0 = true;
    L94:
        if ($composer2.shouldExecute(r0, $dirty & 1) == false) goto L144;
        if (r3 == 0) goto L97;
        modifier2 = Modifier.Companion;
    L97:
        if (r6 == 0) goto L99;
        TextStyle style2 = TextStyle.Companion.getDefault();
    L100:
        if (r12 == 0) goto L102;
        boolean softWrap2 = true;
        int r1 = r16;
    L103:
        if (r14 == 0) goto L105;
        overflow2 = TextOverflow.Companion.m6886getClipgIe3tQ8();
    L105:
        if (r1 == 0) goto L107;
        int maxLines2 = Integer.MAX_VALUE;
        int maxLines3 = r17;
    L108:
        if (maxLines3 == 0) goto L110;
        final ClickableTextKt$ClickableText$1 r2 = ClickableTextKt$ClickableText$1.INSTANCE;
    L112:
        if (ComposerKt.isTraceInProgress() == false) goto L114;
        ComposerKt.traceEventStart(-246609449, $dirty, -1, "androidx.compose.foundation.text.ClickableText (ClickableText.kt:79)");
    L114:
        ComposerKt.sourceInformationMarkerStart($composer2, 1498069948, "CC(remember):ClickableText.kt#9igjgp");
        Object it$iv = $composer2.rememberedValue();
        if (it$iv != Composer.Companion.getEmpty()) goto L118;
        Object value$iv = SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
        $composer2.updateRememberedValue(value$iv);
        it$iv = value$iv;
    L118:
        final MutableState layoutResult = (MutableState) it$iv;
        ComposerKt.sourceInformationMarkerEnd($composer2);
        Modifier.Companion r8 = Modifier.Companion;
        ComposerKt.sourceInformationMarkerStart($composer2, 1498073848, "CC(remember):ClickableText.kt#9igjgp");
        if ((29360128 & $dirty) != 8388608) goto L121;
        boolean invalid$iv2 = true;
    L122:
        boolean invalid$iv3 = invalid$iv2;
        PointerInputEventHandler value$iv2 = $composer2.rememberedValue();
        if (invalid$iv3 == false) goto L125;
    L128:
        value$iv2 = new ClickableTextKt$ClickableText$pressIndicator$1$1(layoutResult, r34);
        $composer2.updateRememberedValue(value$iv2);
    L129:
        ComposerKt.sourceInformationMarkerEnd($composer2);
        Modifier pressIndicator = SuspendingPointerInputFilterKt.pointerInput(r8, r34, (PointerInputEventHandler) value$iv2);
        Modifier r13 = modifier2.then(pressIndicator);
        ComposerKt.sourceInformationMarkerStart($composer2, 1498087444, "CC(remember):ClickableText.kt#9igjgp");
        if (($dirty & 3670016) != 1048576) goto L132;
        invalid$iv = true;
    L132:
        Object it$iv2 = $composer2.rememberedValue();
        if (invalid$iv == true) goto L138;
        int r28 = 3670016;
        if (it$iv2 != Composer.Companion.getEmpty()) goto L140;
    L139:
        Object value$iv3 = (Function1) new ClickableTextKt$ClickableText$2$1(layoutResult, r2);
        $composer2.updateRememberedValue(value$iv3);
        it$iv2 = value$iv3;
    L140:
        ComposerKt.sourceInformationMarkerEnd($composer2);
        Composer $composer3 = $composer2;
        BasicTextKt.m1031BasicTextCL7eQgs(r11, r13, style2, (Function1) it$iv2, overflow2, softWrap2, maxLines2, 0, null, null, null, $composer3, (((($dirty & 14) | ($dirty & 896)) | (57344 & $dirty)) | (458752 & ($dirty << 6))) | (($dirty << 3) & r28), 0, 1920);
        if (ComposerKt.isTraceInProgress() == false) goto L143;
        ComposerKt.traceEventEnd();
    L143:
        final Function1<? super TextLayoutResult, Unit> r9 = r2;
        final TextStyle style3 = style2;
        final boolean softWrap3 = softWrap2;
        final int maxLines4 = maxLines2;
    L145:
        ScopeUpdateScope r15 = $composer3.endRestartGroup();
        if (r15 == null) goto L149;
        final Modifier modifier3 = modifier2;
        final int overflow3 = overflow2;
        r15.updateScope(new ClickableTextKt$ClickableText$3(text, modifier3, style3, softWrap3, overflow3, maxLines4, r9, r34, $changed, r37));
        return;
    L149:
        return;
    L138:
        r28 = 3670016;
        goto L139
    L125:
        if (value$iv2 != Composer.Companion.getEmpty()) goto L129;
    L121:
        invalid$iv2 = false;
        goto L122
    L110:
        r2 = r33;
        goto L112
    L107:
        maxLines3 = r17;
        maxLines2 = r4;
        goto L108
    L102:
        r1 = r16;
        softWrap2 = softWrap;
        goto L103
    L99:
        style2 = r7;
        goto L100
    L144:
        $composer3 = $composer2;
        $composer3.skipToGroupEnd();
        maxLines4 = r4;
        style3 = r7;
        softWrap3 = softWrap;
        r9 = r33;
        goto L145
    L92:
        r0 = false;
        goto L94
    L83:
        if (($changed & 12582912) != 0) goto L89;
        if ($composer2.changedInstance(r34) == false) goto L87;
        int r20 = 8388608;
    L88:
        $dirty = $dirty | r20;
        goto L89
    L87:
        r20 = 4194304;
        goto L88
    L72:
        if (($changed & 1572864) != 0) goto L80;
        if ($composer2.changedInstance(r33) == false) goto L76;
        int r21 = 1048576;
    L77:
        $dirty = $dirty | r21;
        goto L80
    L76:
        r21 = 524288;
        goto L77
    L61:
        if (($changed & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) != 0) goto L67;
        r4 = maxLines;
        if ($composer2.changed(r4) == false) goto L65;
        int r18 = 131072;
    L66:
        $dirty = $dirty | r18;
        goto L68
    L65:
        r18 = 65536;
        goto L66
    L67:
        r4 = maxLines;
        goto L68
    L50:
        if (($changed & 24576) != 0) goto L56;
        overflow2 = overflow;
        if ($composer2.changed(overflow2) == false) goto L54;
        int r19 = 16384;
    L55:
        $dirty = $dirty | r19;
        goto L57
    L54:
        r19 = 8192;
        goto L55
    L56:
        overflow2 = overflow;
        goto L57
    L39:
        if (($changed & 3072) != 0) goto L46;
        if ($composer2.changed(softWrap) == false) goto L43;
        int r110 = 2048;
    L44:
        $dirty = $dirty | r110;
        goto L46
    L43:
        r110 = 1024;
        goto L44
    L28:
        if (($changed & 384) != 0) goto L34;
        r7 = style;
        if ($composer2.changed(r7) == false) goto L32;
        int r111 = 256;
    L33:
        $dirty = $dirty | r111;
        goto L35
    L32:
        r111 = 128;
        goto L33
    L34:
        r7 = style;
        goto L35
    L17:
        if (($changed & 48) != 0) goto L23;
        modifier2 = modifier;
        if ($composer2.changed(modifier2) == false) goto L21;
        int r10 = 32;
    L22:
        $dirty = $dirty | r10;
        goto L24
    L21:
        r10 = 16;
        goto L22
    L23:
        modifier2 = modifier;
        goto L24
    L6:
        if (($changed & 6) != 0) goto L12;
        r11 = text;
        if ($composer2.changed(r11) == false) goto L10;
        int r5 = 4;
    L11:
        $dirty = $dirty | r5;
        goto L13
    L10:
        r5 = 2;
        goto L11
    L12:
        r11 = text;
        goto L13
    }
}
