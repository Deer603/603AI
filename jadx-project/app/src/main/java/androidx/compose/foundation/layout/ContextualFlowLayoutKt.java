package androidx.compose.foundation.layout;

import androidx.autofill.HintConstants;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.SubcomposeLayoutKt;
import androidx.compose.ui.layout.SubcomposeMeasureScope;
import androidx.compose.ui.unit.Constraints;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import androidx.profileinstaller.ProfileVerifier;
import java.util.ArrayList;
import java.util.List;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;

/* JADX INFO: compiled from: ContextualFlowLayout.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0084\u0001\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u008e\u0001\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\u00032\b\b\u0002\u0010\u000e\u001a\u00020\u000f21\u0010\u0010\u001a-\u0012\u0004\u0012\u00020\u0012\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\u0015\u0012\u0004\u0012\u00020\u00010\u0011¢\u0006\u0002\b\u0016¢\u0006\u0002\b\u0017H\u0007¢\u0006\u0002\u0010\u0018\u001a\u008e\u0001\u0010\u0019\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\u001a\u001a\u00020\u001b2\b\b\u0002\u0010\u001c\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\u00032\b\b\u0002\u0010\u000e\u001a\u00020\u001d21\u0010\u0010\u001a-\u0012\u0004\u0012\u00020\u001e\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\u0015\u0012\u0004\u0012\u00020\u00010\u0011¢\u0006\u0002\b\u0016¢\u0006\u0002\b\u0017H\u0007¢\u0006\u0002\u0010\u001f\u001a\u00ad\u0001\u0010 \u001a\u0014\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020#0\u00112\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010$\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u00032\u0006\u0010%\u001a\u00020&2\u0006\u0010\u0002\u001a\u00020\u00032\u0017\u0010'\u001a\u0013\u0012\u000f\u0012\r\u0012\u0004\u0012\u00020\u00010)¢\u0006\u0002\b\u00160(2;\u0010*\u001a7\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\u0015\u0012\u0013\u0012\u00110+¢\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(,\u0012\u0004\u0012\u00020\u00010\u0011¢\u0006\u0002\b\u0016H\u0001¢\u0006\u0002\u0010-\u001a\u00ad\u0001\u0010.\u001a\u0014\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020#0\u00112\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010$\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u00032\u0006\u0010%\u001a\u00020&2\u0006\u0010\u0002\u001a\u00020\u00032\u0017\u0010'\u001a\u0013\u0012\u000f\u0012\r\u0012\u0004\u0012\u00020\u00010)¢\u0006\u0002\b\u00160(2;\u0010*\u001a7\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\u0015\u0012\u0013\u0012\u00110+¢\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(,\u0012\u0004\u0012\u00020\u00010\u0011¢\u0006\u0002\b\u0016H\u0001¢\u0006\u0002\u0010/¨\u00060"}, d2 = {"ContextualFlowColumn", "", "itemCount", "", "modifier", "Landroidx/compose/ui/Modifier;", "verticalArrangement", "Landroidx/compose/foundation/layout/Arrangement$Vertical;", "horizontalArrangement", "Landroidx/compose/foundation/layout/Arrangement$Horizontal;", "itemHorizontalAlignment", "Landroidx/compose/ui/Alignment$Horizontal;", "maxItemsInEachColumn", "maxLines", "overflow", "Landroidx/compose/foundation/layout/ContextualFlowColumnOverflow;", "content", "Lkotlin/Function2;", "Landroidx/compose/foundation/layout/ContextualFlowColumnScope;", "Lkotlin/ParameterName;", HintConstants.AUTOFILL_HINT_NAME, "index", "Landroidx/compose/runtime/Composable;", "Lkotlin/ExtensionFunctionType;", "(ILandroidx/compose/ui/Modifier;Landroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/foundation/layout/Arrangement$Horizontal;Landroidx/compose/ui/Alignment$Horizontal;IILandroidx/compose/foundation/layout/ContextualFlowColumnOverflow;Lkotlin/jvm/functions/Function4;Landroidx/compose/runtime/Composer;II)V", "ContextualFlowRow", "itemVerticalAlignment", "Landroidx/compose/ui/Alignment$Vertical;", "maxItemsInEachRow", "Landroidx/compose/foundation/layout/ContextualFlowRowOverflow;", "Landroidx/compose/foundation/layout/ContextualFlowRowScope;", "(ILandroidx/compose/ui/Modifier;Landroidx/compose/foundation/layout/Arrangement$Horizontal;Landroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/ui/Alignment$Vertical;IILandroidx/compose/foundation/layout/ContextualFlowRowOverflow;Lkotlin/jvm/functions/Function4;Landroidx/compose/runtime/Composer;II)V", "contextualColumnMeasureHelper", "Landroidx/compose/ui/layout/SubcomposeMeasureScope;", "Landroidx/compose/ui/unit/Constraints;", "Landroidx/compose/ui/layout/MeasureResult;", "maxItemsInMainAxis", "overflowState", "Landroidx/compose/foundation/layout/FlowLayoutOverflowState;", "overflowComposables", "", "Lkotlin/Function0;", "getComposable", "Landroidx/compose/foundation/layout/FlowLineInfo;", "info", "(Landroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/foundation/layout/Arrangement$Horizontal;Landroidx/compose/ui/Alignment$Horizontal;IILandroidx/compose/foundation/layout/FlowLayoutOverflowState;ILjava/util/List;Lkotlin/jvm/functions/Function4;Landroidx/compose/runtime/Composer;I)Lkotlin/jvm/functions/Function2;", "contextualRowMeasurementHelper", "(Landroidx/compose/foundation/layout/Arrangement$Horizontal;Landroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/ui/Alignment$Vertical;IILandroidx/compose/foundation/layout/FlowLayoutOverflowState;ILjava/util/List;Lkotlin/jvm/functions/Function4;Landroidx/compose/runtime/Composer;I)Lkotlin/jvm/functions/Function2;", "foundation-layout_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class ContextualFlowLayoutKt {
    @Deprecated(message = "ContextualFlowLayouts are no longer maintained")
    public static final void ContextualFlowRow(final int itemCount, Modifier modifier, Arrangement.Horizontal horizontalArrangement, Arrangement.Vertical verticalArrangement, Alignment.Vertical itemVerticalAlignment, int maxItemsInEachRow, int maxLines, ContextualFlowRowOverflow overflow, final Function4<? super ContextualFlowRowScope, ? super Integer, ? super Composer, ? super Integer, Unit> r32, Composer $composer, final int $changed, final int r35) {
        Composer $composer2 = $composer.startRestartGroup(253921631);
        ComposerKt.sourceInformation($composer2, "C(ContextualFlowRow)P(2,6,1,8,3,4,5,7)80@3819L53,82@3926L209,97@4433L335,88@4168L600,107@4773L68:ContextualFlowLayout.kt#2w3rfo");
        int $dirty = $changed;
        if ((r35 & 1) == 0) goto L6;
        $dirty = $dirty | 6;
    L13:
        int r4 = r35 & 2;
        if (r4 == 0) goto L17;
        $dirty = $dirty | 48;
        Modifier modifier2 = modifier;
    L24:
        int r6 = r35 & 4;
        if (r6 == 0) goto L28;
        $dirty = $dirty | 384;
        Arrangement.Horizontal r7 = horizontalArrangement;
    L35:
        int r8 = r35 & 8;
        if (r8 == 0) goto L39;
        $dirty = $dirty | 3072;
    L46:
        int r13 = r35 & 16;
        if (r13 == 0) goto L50;
        $dirty = $dirty | 24576;
        Alignment.Vertical itemVerticalAlignment2 = itemVerticalAlignment;
    L57:
        int r15 = r35 & 32;
        if (r15 == 0) goto L61;
        $dirty = $dirty | ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
    L68:
        int r17 = r35 & 64;
        if (r17 == 0) goto L72;
        $dirty = $dirty | 1572864;
    L79:
        int $dirty2 = r35 & 128;
        if ($dirty2 == 0) goto L83;
        $dirty = $dirty | 12582912;
    L91:
        if ((r35 & 256) == 0) goto L94;
        $dirty = $dirty | 100663296;
    L100:
        int $dirty3 = $dirty;
        if ((38347923 & $dirty3) == 38347922) goto L103;
        boolean r2 = true;
    L105:
        if ($composer2.shouldExecute(r2, $dirty3 & 1) == false) goto L155;
        if (r4 == 0) goto L108;
        modifier2 = Modifier.Companion;
    L108:
        if (r6 == 0) goto L110;
        Arrangement.Horizontal horizontalArrangement2 = Arrangement.INSTANCE.getStart();
    L111:
        if (r8 == 0) goto L113;
        Arrangement.Vertical verticalArrangement2 = Arrangement.INSTANCE.getTop();
        int r3 = r13;
    L114:
        if (r3 == 0) goto L116;
        itemVerticalAlignment2 = Alignment.Companion.getTop();
    L116:
        if (r15 == 0) goto L118;
        int maxItemsInEachRow2 = Integer.MAX_VALUE;
    L119:
        if (r17 == 0) goto L121;
        int maxLines2 = Integer.MAX_VALUE;
        int r5 = 253921631;
    L122:
        if ($dirty2 == 0) goto L124;
        ContextualFlowRowOverflow overflow2 = ContextualFlowRowOverflow.Companion.getClip();
    L126:
        if (ComposerKt.isTraceInProgress() == false) goto L128;
        ComposerKt.traceEventStart(r5, $dirty3, -1, "androidx.compose.foundation.layout.ContextualFlowRow (ContextualFlowLayout.kt:79)");
    L128:
        ComposerKt.sourceInformationMarkerStart($composer2, 1235066022, "CC(remember):ContextualFlowLayout.kt#9igjgp");
        if (($dirty3 & 29360128) != 8388608) goto L131;
        boolean invalid$iv = true;
    L132:
        Object it$iv = $composer2.rememberedValue();
        if (invalid$iv == false) goto L135;
    L138:
        Object value$iv = overflow2.createOverflowState$foundation_layout_release();
        $composer2.updateRememberedValue(value$iv);
        it$iv = value$iv;
    L139:
        FlowLayoutOverflowState overflowState = (FlowLayoutOverflowState) it$iv;
        ComposerKt.sourceInformationMarkerEnd($composer2);
        ComposerKt.sourceInformationMarkerStart($composer2, 1235069602, "CC(remember):ContextualFlowLayout.kt#9igjgp");
        if (($dirty3 & 29360128) != 8388608) goto L142;
        boolean invalid$iv2 = true;
    L143:
        Object it$iv2 = $composer2.rememberedValue();
        if (invalid$iv2 == true) goto L149;
        int $dirty4 = $dirty3;
        if (it$iv2 != Composer.Companion.getEmpty()) goto L151;
    L150:
        List mutableList = new ArrayList();
        overflow2.addOverflowComposables$foundation_layout_release(overflowState, mutableList);
        $composer2.updateRememberedValue(mutableList);
        it$iv2 = mutableList;
    L151:
        List list = (List) it$iv2;
        ComposerKt.sourceInformationMarkerEnd($composer2);
        Function2<SubcomposeMeasureScope, Constraints, MeasureResult> r0 = contextualRowMeasurementHelper(horizontalArrangement2, verticalArrangement2, itemVerticalAlignment2, maxItemsInEachRow2, maxLines2, overflowState, itemCount, list, ComposableLambdaKt.rememberComposableLambda(-1599700159, true, new ContextualFlowLayoutKt$ContextualFlowRow$measurePolicy$1(r32), $composer2, 54), $composer2, ((((((($dirty4 >> 6) & 14) | 100663296) | (($dirty4 >> 6) & 112)) | (($dirty4 >> 6) & 896)) | (($dirty4 >> 6) & 7168)) | (57344 & ($dirty4 >> 6))) | (($dirty4 << 18) & 3670016));
        Arrangement.Horizontal horizontalArrangement3 = horizontalArrangement2;
        Composer $composer3 = $composer2;
        SubcomposeLayoutKt.SubcomposeLayout(modifier2, r0, $composer3, ($dirty4 >> 3) & 14, 0);
        if (ComposerKt.isTraceInProgress() == false) goto L154;
        ComposerKt.traceEventEnd();
    L154:
        final ContextualFlowRowOverflow overflow3 = overflow2;
        final Arrangement.Horizontal horizontalArrangement4 = horizontalArrangement3;
        final Arrangement.Vertical verticalArrangement3 = verticalArrangement2;
        final int maxItemsInEachRow3 = maxItemsInEachRow2;
        final int maxLines3 = maxLines2;
        final Modifier modifier3 = modifier2;
        final Alignment.Vertical itemVerticalAlignment3 = itemVerticalAlignment2;
    L156:
        ScopeUpdateScope r14 = $composer3.endRestartGroup();
        if (r14 == null) goto L160;
        r14.updateScope(new C02821(itemCount, modifier3, horizontalArrangement4, verticalArrangement3, itemVerticalAlignment3, maxItemsInEachRow3, maxLines3, overflow3, r32, $changed, r35));
        return;
    L160:
        return;
    L149:
        $dirty4 = $dirty3;
        goto L150
    L142:
        invalid$iv2 = false;
        goto L143
    L135:
        if (it$iv != Composer.Companion.getEmpty()) goto L139;
    L131:
        invalid$iv = false;
        goto L132
    L124:
        overflow2 = overflow;
        goto L126
    L121:
        maxLines2 = maxLines;
        r5 = 253921631;
        goto L122
    L118:
        maxItemsInEachRow2 = maxItemsInEachRow;
        goto L119
    L113:
        r3 = r13;
        verticalArrangement2 = verticalArrangement;
        goto L114
    L110:
        horizontalArrangement2 = r7;
        goto L111
    L155:
        $dirty4 = $dirty3;
        $composer3 = $composer2;
        $composer3.skipToGroupEnd();
        verticalArrangement3 = verticalArrangement;
        maxItemsInEachRow3 = maxItemsInEachRow;
        overflow3 = overflow;
        horizontalArrangement4 = r7;
        maxLines3 = maxLines;
        modifier3 = modifier2;
        itemVerticalAlignment3 = itemVerticalAlignment2;
        goto L156
    L103:
        r2 = false;
        goto L105
    L94:
        if (($changed & 100663296) != 0) goto L100;
        if ($composer2.changedInstance(r32) == false) goto L98;
        int r1 = AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
    L99:
        $dirty = $dirty | r1;
        goto L100
    L98:
        r1 = 33554432;
        goto L99
    L83:
        if (($changed & 12582912) != 0) goto L91;
        if ($composer2.changed(overflow) == false) goto L87;
        int r18 = 8388608;
    L88:
        $dirty = $dirty | r18;
        goto L91
    L87:
        r18 = 4194304;
        goto L88
    L72:
        if (($changed & 1572864) != 0) goto L79;
        if ($composer2.changed(maxLines) == false) goto L76;
        int r19 = 1048576;
    L77:
        $dirty = $dirty | r19;
        goto L79
    L76:
        r19 = 524288;
        goto L77
    L61:
        if (($changed & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) != 0) goto L68;
        if ($composer2.changed(maxItemsInEachRow) == false) goto L65;
        int r110 = 131072;
    L66:
        $dirty = $dirty | r110;
        goto L68
    L65:
        r110 = 65536;
        goto L66
    L50:
        if (($changed & 24576) != 0) goto L56;
        itemVerticalAlignment2 = itemVerticalAlignment;
        if ($composer2.changed(itemVerticalAlignment2) == false) goto L54;
        int r16 = 16384;
    L55:
        $dirty = $dirty | r16;
        goto L57
    L54:
        r16 = 8192;
        goto L55
    L56:
        itemVerticalAlignment2 = itemVerticalAlignment;
        goto L57
    L39:
        if (($changed & 3072) != 0) goto L46;
        if ($composer2.changed(verticalArrangement) == false) goto L43;
        int r111 = 2048;
    L44:
        $dirty = $dirty | r111;
        goto L46
    L43:
        r111 = 1024;
        goto L44
    L28:
        if (($changed & 384) != 0) goto L34;
        r7 = horizontalArrangement;
        if ($composer2.changed(r7) == false) goto L32;
        int r9 = 256;
    L33:
        $dirty = $dirty | r9;
        goto L35
    L32:
        r9 = 128;
        goto L33
    L34:
        r7 = horizontalArrangement;
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
        if (($changed & 6) != 0) goto L13;
        if ($composer2.changed(itemCount) == false) goto L10;
        int r11 = 4;
    L11:
        $dirty = $dirty | r11;
        goto L13
    L10:
        r11 = 2;
        goto L11
    }

    @Deprecated(message = "ContextualFlowLayouts are no longer maintained")
    public static final void ContextualFlowColumn(final int itemCount, Modifier modifier, Arrangement.Vertical verticalArrangement, Arrangement.Horizontal horizontalArrangement, Alignment.Horizontal itemHorizontalAlignment, int maxItemsInEachColumn, int maxLines, ContextualFlowColumnOverflow overflow, final Function4<? super ContextualFlowColumnScope, ? super Integer, ? super Composer, ? super Integer, Unit> r32, Composer $composer, final int $changed, final int r35) {
        Composer $composer2 = $composer.startRestartGroup(1048542435);
        ComposerKt.sourceInformation($composer2, "C(ContextualFlowColumn)P(2,6,8,1,3,4,5,7)155@7413L53,157@7520L209,172@8032L338,163@7762L608,183@8376L68:ContextualFlowLayout.kt#2w3rfo");
        int $dirty = $changed;
        if ((r35 & 1) == 0) goto L6;
        $dirty = $dirty | 6;
    L13:
        int r4 = r35 & 2;
        if (r4 == 0) goto L17;
        $dirty = $dirty | 48;
        Modifier modifier2 = modifier;
    L24:
        int r6 = r35 & 4;
        if (r6 == 0) goto L28;
        $dirty = $dirty | 384;
        Arrangement.Vertical r7 = verticalArrangement;
    L35:
        int r8 = r35 & 8;
        if (r8 == 0) goto L39;
        $dirty = $dirty | 3072;
    L46:
        int r13 = r35 & 16;
        if (r13 == 0) goto L50;
        $dirty = $dirty | 24576;
        Alignment.Horizontal itemHorizontalAlignment2 = itemHorizontalAlignment;
    L57:
        int r15 = r35 & 32;
        if (r15 == 0) goto L61;
        $dirty = $dirty | ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
    L68:
        int r17 = r35 & 64;
        if (r17 == 0) goto L72;
        $dirty = $dirty | 1572864;
    L79:
        int $dirty2 = r35 & 128;
        if ($dirty2 == 0) goto L83;
        $dirty = $dirty | 12582912;
    L91:
        if ((r35 & 256) == 0) goto L94;
        $dirty = $dirty | 100663296;
    L100:
        int $dirty3 = $dirty;
        if ((38347923 & $dirty3) == 38347922) goto L103;
        boolean r2 = true;
    L105:
        if ($composer2.shouldExecute(r2, $dirty3 & 1) == false) goto L155;
        if (r4 == 0) goto L108;
        modifier2 = Modifier.Companion;
    L108:
        if (r6 == 0) goto L110;
        Arrangement.Vertical verticalArrangement2 = Arrangement.INSTANCE.getTop();
    L111:
        if (r8 == 0) goto L113;
        Arrangement.Horizontal horizontalArrangement2 = Arrangement.INSTANCE.getStart();
        int r3 = r13;
    L114:
        if (r3 == 0) goto L116;
        itemHorizontalAlignment2 = Alignment.Companion.getStart();
    L116:
        if (r15 == 0) goto L118;
        int maxItemsInEachColumn2 = Integer.MAX_VALUE;
    L119:
        if (r17 == 0) goto L121;
        int maxLines2 = Integer.MAX_VALUE;
        int r5 = 1048542435;
    L122:
        if ($dirty2 == 0) goto L124;
        ContextualFlowColumnOverflow overflow2 = ContextualFlowColumnOverflow.Companion.getClip();
    L126:
        if (ComposerKt.isTraceInProgress() == false) goto L128;
        ComposerKt.traceEventStart(r5, $dirty3, -1, "androidx.compose.foundation.layout.ContextualFlowColumn (ContextualFlowLayout.kt:154)");
    L128:
        ComposerKt.sourceInformationMarkerStart($composer2, -1055903340, "CC(remember):ContextualFlowLayout.kt#9igjgp");
        if (($dirty3 & 29360128) != 8388608) goto L131;
        boolean invalid$iv = true;
    L132:
        Object it$iv = $composer2.rememberedValue();
        if (invalid$iv == false) goto L135;
    L138:
        Object value$iv = overflow2.createOverflowState$foundation_layout_release();
        $composer2.updateRememberedValue(value$iv);
        it$iv = value$iv;
    L139:
        FlowLayoutOverflowState overflowState = (FlowLayoutOverflowState) it$iv;
        ComposerKt.sourceInformationMarkerEnd($composer2);
        ComposerKt.sourceInformationMarkerStart($composer2, -1055899760, "CC(remember):ContextualFlowLayout.kt#9igjgp");
        if (($dirty3 & 29360128) != 8388608) goto L142;
        boolean invalid$iv2 = true;
    L143:
        Object it$iv2 = $composer2.rememberedValue();
        if (invalid$iv2 == true) goto L149;
        int $dirty4 = $dirty3;
        if (it$iv2 != Composer.Companion.getEmpty()) goto L151;
    L150:
        List mutableList = new ArrayList();
        overflow2.addOverflowComposables$foundation_layout_release(overflowState, mutableList);
        $composer2.updateRememberedValue(mutableList);
        it$iv2 = mutableList;
    L151:
        List list = (List) it$iv2;
        ComposerKt.sourceInformationMarkerEnd($composer2);
        Function2<SubcomposeMeasureScope, Constraints, MeasureResult> r0 = contextualColumnMeasureHelper(verticalArrangement2, horizontalArrangement2, itemHorizontalAlignment2, maxItemsInEachColumn2, maxLines2, overflowState, itemCount, list, ComposableLambdaKt.rememberComposableLambda(1048264111, true, new ContextualFlowLayoutKt$ContextualFlowColumn$measurePolicy$1(r32), $composer2, 54), $composer2, ((((((($dirty4 >> 6) & 14) | 100663296) | (($dirty4 >> 6) & 112)) | (($dirty4 >> 6) & 896)) | (($dirty4 >> 6) & 7168)) | (57344 & ($dirty4 >> 6))) | (($dirty4 << 18) & 3670016));
        Arrangement.Vertical verticalArrangement3 = verticalArrangement2;
        Composer $composer3 = $composer2;
        SubcomposeLayoutKt.SubcomposeLayout(modifier2, r0, $composer3, ($dirty4 >> 3) & 14, 0);
        if (ComposerKt.isTraceInProgress() == false) goto L154;
        ComposerKt.traceEventEnd();
    L154:
        final ContextualFlowColumnOverflow overflow3 = overflow2;
        final Arrangement.Vertical verticalArrangement4 = verticalArrangement3;
        final Arrangement.Horizontal horizontalArrangement3 = horizontalArrangement2;
        final int maxItemsInEachColumn3 = maxItemsInEachColumn2;
        final int maxLines3 = maxLines2;
        final Modifier modifier3 = modifier2;
        final Alignment.Horizontal itemHorizontalAlignment3 = itemHorizontalAlignment2;
    L156:
        ScopeUpdateScope r14 = $composer3.endRestartGroup();
        if (r14 == null) goto L160;
        r14.updateScope(new AnonymousClass1(itemCount, modifier3, verticalArrangement4, horizontalArrangement3, itemHorizontalAlignment3, maxItemsInEachColumn3, maxLines3, overflow3, r32, $changed, r35));
        return;
    L160:
        return;
    L149:
        $dirty4 = $dirty3;
        goto L150
    L142:
        invalid$iv2 = false;
        goto L143
    L135:
        if (it$iv != Composer.Companion.getEmpty()) goto L139;
    L131:
        invalid$iv = false;
        goto L132
    L124:
        overflow2 = overflow;
        goto L126
    L121:
        maxLines2 = maxLines;
        r5 = 1048542435;
        goto L122
    L118:
        maxItemsInEachColumn2 = maxItemsInEachColumn;
        goto L119
    L113:
        r3 = r13;
        horizontalArrangement2 = horizontalArrangement;
        goto L114
    L110:
        verticalArrangement2 = r7;
        goto L111
    L155:
        $dirty4 = $dirty3;
        $composer3 = $composer2;
        $composer3.skipToGroupEnd();
        horizontalArrangement3 = horizontalArrangement;
        maxItemsInEachColumn3 = maxItemsInEachColumn;
        overflow3 = overflow;
        verticalArrangement4 = r7;
        maxLines3 = maxLines;
        modifier3 = modifier2;
        itemHorizontalAlignment3 = itemHorizontalAlignment2;
        goto L156
    L103:
        r2 = false;
        goto L105
    L94:
        if (($changed & 100663296) != 0) goto L100;
        if ($composer2.changedInstance(r32) == false) goto L98;
        int r1 = AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
    L99:
        $dirty = $dirty | r1;
        goto L100
    L98:
        r1 = 33554432;
        goto L99
    L83:
        if (($changed & 12582912) != 0) goto L91;
        if ($composer2.changed(overflow) == false) goto L87;
        int r18 = 8388608;
    L88:
        $dirty = $dirty | r18;
        goto L91
    L87:
        r18 = 4194304;
        goto L88
    L72:
        if (($changed & 1572864) != 0) goto L79;
        if ($composer2.changed(maxLines) == false) goto L76;
        int r19 = 1048576;
    L77:
        $dirty = $dirty | r19;
        goto L79
    L76:
        r19 = 524288;
        goto L77
    L61:
        if (($changed & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) != 0) goto L68;
        if ($composer2.changed(maxItemsInEachColumn) == false) goto L65;
        int r110 = 131072;
    L66:
        $dirty = $dirty | r110;
        goto L68
    L65:
        r110 = 65536;
        goto L66
    L50:
        if (($changed & 24576) != 0) goto L56;
        itemHorizontalAlignment2 = itemHorizontalAlignment;
        if ($composer2.changed(itemHorizontalAlignment2) == false) goto L54;
        int r16 = 16384;
    L55:
        $dirty = $dirty | r16;
        goto L57
    L54:
        r16 = 8192;
        goto L55
    L56:
        itemHorizontalAlignment2 = itemHorizontalAlignment;
        goto L57
    L39:
        if (($changed & 3072) != 0) goto L46;
        if ($composer2.changed(horizontalArrangement) == false) goto L43;
        int r111 = 2048;
    L44:
        $dirty = $dirty | r111;
        goto L46
    L43:
        r111 = 1024;
        goto L44
    L28:
        if (($changed & 384) != 0) goto L34;
        r7 = verticalArrangement;
        if ($composer2.changed(r7) == false) goto L32;
        int r9 = 256;
    L33:
        $dirty = $dirty | r9;
        goto L35
    L32:
        r9 = 128;
        goto L33
    L34:
        r7 = verticalArrangement;
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
        if (($changed & 6) != 0) goto L13;
        if ($composer2.changed(itemCount) == false) goto L10;
        int r11 = 4;
    L11:
        $dirty = $dirty | r11;
        goto L13
    L10:
        r11 = 2;
        goto L11
    }

    public static final Function2<SubcomposeMeasureScope, Constraints, MeasureResult> contextualRowMeasurementHelper(Arrangement.Horizontal horizontalArrangement, Arrangement.Vertical verticalArrangement, Alignment.Vertical itemVerticalAlignment, int maxItemsInMainAxis, int maxLines, FlowLayoutOverflowState overflowState, int itemCount, List<? extends Function2<? super Composer, ? super Integer, Unit>> r30, Function4<? super Integer, ? super FlowLineInfo, ? super Composer, ? super Integer, Unit> r31, Composer $composer, int $changed) {
        ComposerKt.sourceInformationMarkerStart($composer, 785825072, "C(contextualRowMeasurementHelper)P(1,8,3,4,5,7,2,6)395@16763L969:ContextualFlowLayout.kt#2w3rfo");
        if (ComposerKt.isTraceInProgress() == false) goto L5;
        ComposerKt.traceEventStart(785825072, $changed, -1, "androidx.compose.foundation.layout.contextualRowMeasurementHelper (ContextualFlowLayout.kt:394)");
    L5:
        ComposerKt.sourceInformationMarkerStart($composer, 1139059380, "CC(remember):ContextualFlowLayout.kt#9igjgp");
        boolean r5 = false;
        if ((($changed & 14) ^ 6) <= 4) goto L10;
        Arrangement.Horizontal r9 = horizontalArrangement;
        if ($composer.changed(r9) == false) goto L12;
    L13:
        boolean r3 = true;
    L16:
        if ((($changed & 112) ^ 48) <= 32) goto L20;
        Arrangement.Vertical r10 = verticalArrangement;
        if ($composer.changed(r10) == false) goto L22;
    L23:
        boolean r4 = true;
    L25:
        boolean r6 = r3 | r4;
        if ((($changed & 896) ^ 384) <= 256) goto L30;
        if ($composer.changed(itemVerticalAlignment) == false) goto L30;
    L31:
        boolean r7 = true;
    L33:
        boolean r8 = r6 | r7;
        if ((($changed & 7168) ^ 3072) <= 2048) goto L38;
        int r11 = maxItemsInMainAxis;
        if ($composer.changed(r11) == false) goto L40;
    L41:
        boolean r12 = true;
    L43:
        boolean r13 = r8 | r12;
        if (((57344 & $changed) ^ 24576) <= 16384) goto L48;
        int r15 = maxLines;
        if ($composer.changed(r15) == false) goto L50;
    L51:
        boolean r14 = true;
    L53:
        boolean r16 = (r13 | r14) | $composer.changed(overflowState);
        if (((3670016 & $changed) ^ 1572864) <= 1048576) goto L58;
        int r17 = itemCount;
        if ($composer.changed(r17) == false) goto L60;
    L61:
        boolean r18 = true;
    L63:
        boolean r19 = r16 | r18;
        if (((234881024 & $changed) ^ 100663296) <= 67108864) goto L70;
        if ($composer.changed(r31) == false) goto L70;
    L71:
        r5 = true;
    L72:
        boolean invalid$iv = r19 | r5;
        Object value$iv = $composer.rememberedValue();
        if (invalid$iv == false) goto L75;
    L78:
        value$iv = new FlowMeasureLazyPolicy(true, r9, r10, r9.mo612getSpacingD9Ej5fM(), CrossAxisAlignment.Companion.vertical$foundation_layout_release(itemVerticalAlignment), r10.mo612getSpacingD9Ej5fM(), r17, r15, r11, overflowState, r30, r31, null).getMeasurePolicy();
        $composer.updateRememberedValue(value$iv);
    L79:
        Function2<SubcomposeMeasureScope, Constraints, MeasureResult> r110 = (Function2) value$iv;
        ComposerKt.sourceInformationMarkerEnd($composer);
        if (ComposerKt.isTraceInProgress() == false) goto L82;
        ComposerKt.traceEventEnd();
    L82:
        ComposerKt.sourceInformationMarkerEnd($composer);
        return r110;
    L75:
        if (value$iv != Composer.Companion.getEmpty()) goto L79;
    L70:
        if ((100663296 & $changed) != 67108864) goto L72;
    L60:
        if (($changed & 1572864) == 1048576) goto L61;
        r18 = false;
        goto L63
    L58:
        r17 = itemCount;
    L50:
        if (($changed & 24576) == 16384) goto L51;
        r14 = false;
        goto L53
    L48:
        r15 = maxLines;
    L40:
        if (($changed & 3072) == 2048) goto L41;
        r12 = false;
        goto L43
    L38:
        r11 = maxItemsInMainAxis;
    L30:
        if (($changed & 384) == 256) goto L31;
        r7 = false;
    L22:
        if (($changed & 48) == 32) goto L23;
        r4 = false;
        goto L25
    L20:
        r10 = verticalArrangement;
    L12:
        if (($changed & 6) == 4) goto L13;
        r3 = false;
        goto L16
    L10:
        r9 = horizontalArrangement;
        goto L12
    }

    public static final Function2<SubcomposeMeasureScope, Constraints, MeasureResult> contextualColumnMeasureHelper(Arrangement.Vertical verticalArrangement, Arrangement.Horizontal horizontalArrangement, Alignment.Horizontal itemHorizontalAlignment, int maxItemsInMainAxis, int maxLines, FlowLayoutOverflowState overflowState, int itemCount, List<? extends Function2<? super Composer, ? super Integer, Unit>> r30, Function4<? super Integer, ? super FlowLineInfo, ? super Composer, ? super Integer, Unit> r31, Composer $composer, int $changed) {
        ComposerKt.sourceInformationMarkerStart($composer, -1985535130, "C(contextualColumnMeasureHelper)P(8,1,3,4,5,7,2,6)435@18251L976:ContextualFlowLayout.kt#2w3rfo");
        if (ComposerKt.isTraceInProgress() == false) goto L5;
        ComposerKt.traceEventStart(-1985535130, $changed, -1, "androidx.compose.foundation.layout.contextualColumnMeasureHelper (ContextualFlowLayout.kt:434)");
    L5:
        ComposerKt.sourceInformationMarkerStart($composer, -1978145909, "CC(remember):ContextualFlowLayout.kt#9igjgp");
        boolean r5 = false;
        if ((($changed & 14) ^ 6) <= 4) goto L10;
        Arrangement.Vertical r10 = verticalArrangement;
        if ($composer.changed(r10) == false) goto L12;
    L13:
        boolean r3 = true;
    L16:
        if ((($changed & 112) ^ 48) <= 32) goto L20;
        Arrangement.Horizontal r9 = horizontalArrangement;
        if ($composer.changed(r9) == false) goto L22;
    L23:
        boolean r4 = true;
    L25:
        boolean r6 = r3 | r4;
        if ((($changed & 896) ^ 384) <= 256) goto L30;
        if ($composer.changed(itemHorizontalAlignment) == false) goto L30;
    L31:
        boolean r7 = true;
    L33:
        boolean r8 = r6 | r7;
        if ((($changed & 7168) ^ 3072) <= 2048) goto L38;
        int r11 = maxItemsInMainAxis;
        if ($composer.changed(r11) == false) goto L40;
    L41:
        boolean r12 = true;
    L43:
        boolean r13 = r8 | r12;
        if (((57344 & $changed) ^ 24576) <= 16384) goto L48;
        int r15 = maxLines;
        if ($composer.changed(r15) == false) goto L50;
    L51:
        boolean r14 = true;
    L53:
        boolean r16 = (r13 | r14) | $composer.changed(overflowState);
        if (((3670016 & $changed) ^ 1572864) <= 1048576) goto L58;
        int r17 = itemCount;
        if ($composer.changed(r17) == false) goto L60;
    L61:
        boolean r18 = true;
    L63:
        boolean r19 = r16 | r18;
        if (((234881024 & $changed) ^ 100663296) <= 67108864) goto L70;
        if ($composer.changed(r31) == false) goto L70;
    L71:
        r5 = true;
    L72:
        boolean invalid$iv = r19 | r5;
        Object value$iv = $composer.rememberedValue();
        if (invalid$iv == false) goto L75;
    L78:
        value$iv = new FlowMeasureLazyPolicy(false, r9, r10, r10.mo612getSpacingD9Ej5fM(), CrossAxisAlignment.Companion.horizontal$foundation_layout_release(itemHorizontalAlignment), r9.mo612getSpacingD9Ej5fM(), r17, r15, r11, overflowState, r30, r31, null).getMeasurePolicy();
        $composer.updateRememberedValue(value$iv);
    L79:
        Function2<SubcomposeMeasureScope, Constraints, MeasureResult> r110 = (Function2) value$iv;
        ComposerKt.sourceInformationMarkerEnd($composer);
        if (ComposerKt.isTraceInProgress() == false) goto L82;
        ComposerKt.traceEventEnd();
    L82:
        ComposerKt.sourceInformationMarkerEnd($composer);
        return r110;
    L75:
        if (value$iv != Composer.Companion.getEmpty()) goto L79;
    L70:
        if ((100663296 & $changed) != 67108864) goto L72;
    L60:
        if (($changed & 1572864) == 1048576) goto L61;
        r18 = false;
        goto L63
    L58:
        r17 = itemCount;
    L50:
        if (($changed & 24576) == 16384) goto L51;
        r14 = false;
        goto L53
    L48:
        r15 = maxLines;
    L40:
        if (($changed & 3072) == 2048) goto L41;
        r12 = false;
        goto L43
    L38:
        r11 = maxItemsInMainAxis;
    L30:
        if (($changed & 384) == 256) goto L31;
        r7 = false;
    L22:
        if (($changed & 48) == 32) goto L23;
        r4 = false;
        goto L25
    L20:
        r9 = horizontalArrangement;
    L12:
        if (($changed & 6) == 4) goto L13;
        r3 = false;
        goto L16
    L10:
        r10 = verticalArrangement;
        goto L12
    }
}
