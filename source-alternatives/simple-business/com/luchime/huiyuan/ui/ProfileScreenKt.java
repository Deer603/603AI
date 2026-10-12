package com.luchime.huiyuan.ui;

import android.content.Context;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.BorderKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.layout.WindowInsetsPadding_androidKt;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material3.AndroidAlertDialog_androidKt;
import androidx.compose.material3.ButtonKt;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.TextUnitKt;
import androidx.core.location.LocationRequestCompat;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import androidx.profileinstaller.ProfileVerifier;
import com.luchime.huiyuan.LexiconEntry;
import com.luchime.huiyuan.UsageStats;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import kotlin.text.StringsKt;

/* JADX INFO: compiled from: ProfileScreen.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000N\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0002\b\u0010\u001a\u0081\u0001\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00052\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00010\u00142\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00010\u0014H\u0001¢\u0006\u0002\u0010\u0016\u001a9\u0010\u0017\u001a\u00020\u00012\u0006\u0010\u0018\u001a\u00020\u00052\u0006\u0010\u0019\u001a\u00020\u00052\u0006\u0010\u001a\u001a\u00020\u00052\u0006\u0010\u001b\u001a\u00020\u001c2\b\b\u0002\u0010\u001d\u001a\u00020\u001eH\u0003¢\u0006\u0004\b\u001f\u0010 \u001a/\u0010!\u001a\u00020\u00012\u0006\u0010\"\u001a\u00020\u00052\u0006\u0010#\u001a\u00020\u00072\u0006\u0010$\u001a\u00020%2\u0006\u0010\u001b\u001a\u00020\u001cH\u0003¢\u0006\u0004\b&\u0010'\u001a-\u0010(\u001a\u00020\u00012\u0006\u0010)\u001a\u00020\u00052\u0006\u0010\u001b\u001a\u00020\u001c2\f\u0010*\u001a\b\u0012\u0004\u0012\u00020\u00010\u0014H\u0003¢\u0006\u0004\b+\u0010,\u001aE\u0010-\u001a\u00020\u00012\u0006\u0010.\u001a\u00020\u00052\u0006\u0010/\u001a\u00020\u00052\u0006\u00100\u001a\u00020\u00052\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u00101\u001a\u00020\r2\f\u0010*\u001a\b\u0012\u0004\u0012\u00020\u00010\u0014H\u0003¢\u0006\u0004\b2\u00103¨\u00064²\u0006\n\u00105\u001a\u00020\rX\u008a\u008e\u0002"}, d2 = {"ProfileScreen", "", "stats", "Lcom/luchime/huiyuan/UsageStats;", "askName", "", "messageCount", "", "favoriteCount", "lexiconCount", "dimensionCount", "entriesPerDimension", "isLandscape", "", "dailyQuote", "Lcom/luchime/huiyuan/LexiconEntry;", "dailyQuoteModel", "Lcom/luchime/huiyuan/ui/AIModel;", "conversationText", "onAskDaily", "Lkotlin/Function0;", "onResetEverything", "(Lcom/luchime/huiyuan/UsageStats;Ljava/lang/String;IIIIIZLcom/luchime/huiyuan/LexiconEntry;Lcom/luchime/huiyuan/ui/AIModel;Ljava/lang/String;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "StatCard", "label", "value", "unit", "color", "Landroidx/compose/ui/graphics/Color;", "modifier", "Landroidx/compose/ui/Modifier;", "StatCard-uDo3WH8", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLandroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "CategoryProgress", "category", "count", "fraction", "", "CategoryProgress-Bx497Mc", "(Ljava/lang/String;IFJLandroidx/compose/runtime/Composer;I)V", "ProfileAction", "text", "onClick", "ProfileAction-iJQMabo", "(Ljava/lang/String;JLkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "SettingsRow", "icon", "title", "subtitle", "enabled", "SettingsRow-uDo3WH8", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JZLkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "app", "showResetDialog"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class ProfileScreenKt {
    static final Unit CategoryProgress_Bx497Mc$lambda$53(String r8, int r9, float r10, long r11, int r13, Composer r14, int r15) {
        m7417CategoryProgressBx497Mc(r8, r9, r10, r11, r14, RecomposeScopeImplKt.updateChangedFlags(r13 | 1));
        return Unit.INSTANCE;
    }

    static final Unit ProfileAction_iJQMabo$lambda$54(String r7, long r8, Function0 r10, int r11, Composer r12, int r13) {
        m7418ProfileActioniJQMabo(r7, r8, r10, r12, RecomposeScopeImplKt.updateChangedFlags(r11 | 1));
        return Unit.INSTANCE;
    }

    static final Unit ProfileScreen$lambda$45(UsageStats r17, String r18, int r19, int r20, int r21, int r22, int r23, boolean r24, LexiconEntry r25, AIModel r26, String r27, Function0 r28, Function0 r29, int r30, int r31, Composer r32, int r33) {
        ProfileScreen(r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r32, RecomposeScopeImplKt.updateChangedFlags(r30 | 1), RecomposeScopeImplKt.updateChangedFlags(r31));
        return Unit.INSTANCE;
    }

    static final Unit SettingsRow_uDo3WH8$lambda$58(String r10, String r11, String r12, long r13, boolean r15, Function0 r16, int r17, Composer r18, int r19) {
        m7419SettingsRowuDo3WH8(r10, r11, r12, r13, r15, r16, r18, RecomposeScopeImplKt.updateChangedFlags(r17 | 1));
        return Unit.INSTANCE;
    }

    static final Unit StatCard_uDo3WH8$lambda$49(String r10, String r11, String r12, long r13, Modifier r15, int r16, int r17, Composer r18, int r19) {
        m7420StatCarduDo3WH8(r10, r11, r12, r13, r15, r18, RecomposeScopeImplKt.updateChangedFlags(r16 | 1), r17);
        return Unit.INSTANCE;
    }

    public static final void ProfileScreen(final UsageStats stats, final String askName, final int messageCount, final int favoriteCount, final int lexiconCount, final int dimensionCount, final int entriesPerDimension, final boolean isLandscape, final LexiconEntry dailyQuote, final AIModel dailyQuoteModel, final String conversationText, final Function0<Unit> r53, Function0<Unit> r54, Composer $composer, final int $changed, final int $changed1) {
        Intrinsics.checkNotNullParameter(stats, "stats");
        Intrinsics.checkNotNullParameter(askName, "askName");
        Intrinsics.checkNotNullParameter(dailyQuote, "dailyQuote");
        Intrinsics.checkNotNullParameter(dailyQuoteModel, "dailyQuoteModel");
        Intrinsics.checkNotNullParameter(conversationText, "conversationText");
        Intrinsics.checkNotNullParameter(r53, "onAskDaily");
        Intrinsics.checkNotNullParameter(r54, "onResetEverything");
        Composer $composer2 = $composer.startRestartGroup(827794383);
        ComposerKt.sourceInformation($composer2, "C(ProfileScreen)P(12!1,9,6,8,4,5,7,2,3)57@2197L7,58@2239L7,59@2274L34,70@2646L8741,64@2425L8962:ProfileScreen.kt#cyjvf");
        int $dirty = $changed;
        int $dirty1 = $changed1;
        if (($changed & 6) == 0) goto L5;
    L9:
        int r16 = 16;
        if (($changed & 48) != 0) goto L17;
        if ($composer2.changed(askName) == false) goto L14;
        int r13 = 32;
    L15:
        $dirty = $dirty | r13;
        goto L17
    L14:
        r13 = 16;
    L17:
        if (($changed & 3072) != 0) goto L23;
        int r14 = favoriteCount;
        if ($composer2.changed(r14) == false) goto L21;
        int r19 = 2048;
    L22:
        $dirty = $dirty | r19;
    L25:
        if (($changed & 24576) != 0) goto L31;
        int r15 = lexiconCount;
        if ($composer2.changed(r15) == false) goto L29;
        int r21 = 16384;
    L30:
        $dirty = $dirty | r21;
    L33:
        if (($changed & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) != 0) goto L41;
        if ($composer2.changed(dimensionCount) == false) goto L37;
        int r23 = 131072;
    L38:
        $dirty = $dirty | r23;
        goto L41
    L37:
        r23 = 65536;
    L41:
        if (($changed & 1572864) != 0) goto L49;
        if ($composer2.changed(entriesPerDimension) == false) goto L45;
        int r24 = 1048576;
    L46:
        $dirty = $dirty | r24;
        goto L49
    L45:
        r24 = 524288;
    L49:
        if (($changed & 12582912) != 0) goto L56;
        if ($composer2.changed(isLandscape) == false) goto L53;
        int r25 = 8388608;
    L54:
        $dirty = $dirty | r25;
        goto L56
    L53:
        r25 = 4194304;
    L56:
        if (($changed & 100663296) != 0) goto L63;
        if ($composer2.changedInstance(dailyQuote) == false) goto L60;
        int r26 = AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
    L61:
        $dirty = $dirty | r26;
        goto L63
    L60:
        r26 = 33554432;
    L63:
        if (($changed & 805306368) == 0) goto L65;
    L69:
        int $dirty2 = $dirty;
        if (($changed1 & 6) != 0) goto L77;
        if ($composer2.changed(conversationText) == false) goto L74;
        int r11 = 4;
    L75:
        $dirty1 = $dirty1 | r11;
        goto L77
    L74:
        r11 = 2;
    L77:
        if (($changed1 & 48) != 0) goto L83;
        if ($composer2.changedInstance(r53) == false) goto L81;
        r16 = 32;
    L81:
        $dirty1 = $dirty1 | r16;
    L83:
        if (($changed1 & 384) == 0) goto L85;
    L89:
        int $dirty3 = $dirty1;
        boolean r17 = false;
        if ((306783251 & $dirty2) == 306783250) goto L92;
    L95:
        boolean r2 = true;
    L97:
        if ($composer2.shouldExecute(r2, $dirty2 & 1) == true) goto L99;
        final Function0<Unit> r18 = r54;
        Composer $composer3 = $composer2;
        $composer3.skipToGroupEnd();
    L163:
        ScopeUpdateScope r1 = $composer3.endRestartGroup();
        if (r1 == null) goto L167;
        r1.updateScope(new ProfileScreenKt$$ExternalSyntheticLambda15(stats, askName, messageCount, favoriteCount, lexiconCount, dimensionCount, entriesPerDimension, isLandscape, dailyQuote, dailyQuoteModel, conversationText, r53, r18, $changed, $changed1));
        return;
    L167:
        return;
    L99:
        if (ComposerKt.isTraceInProgress() == false) goto L101;
        ComposerKt.traceEventStart(827794383, $dirty2, $dirty3, "com.luchime.huiyuan.ui.ProfileScreen (ProfileScreen.kt:56)");
    L101:
        ProvidableCompositionLocal<Context> r3 = AndroidCompositionLocals_androidKt.getLocalContext();
        ComposerKt.sourceInformationMarkerStart($composer2, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
        Object r20 = $composer2.consume(r3);
        ComposerKt.sourceInformationMarkerEnd($composer2);
        final Context context = (Context) r20;
        ProvidableCompositionLocal<AppHaptics> r4 = AppHapticsKt.getLocalAppHaptics();
        ComposerKt.sourceInformationMarkerStart($composer2, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
        Object r5 = $composer2.consume(r4);
        ComposerKt.sourceInformationMarkerEnd($composer2);
        final AppHaptics haptics = (AppHaptics) r5;
        ComposerKt.sourceInformationMarkerStart($composer2, 941468305, "CC(remember):ProfileScreen.kt#9igjgp");
        Object r6 = $composer2.rememberedValue();
        if (r6 != Composer.Companion.getEmpty()) goto L105;
        r6 = SnapshotStateKt.mutableStateOf$default(false, null, 2, null);
        $composer2.updateRememberedValue(r6);
    L105:
        MutableState showResetDialog$delegate = (MutableState) r6;
        ComposerKt.sourceInformationMarkerEnd($composer2);
        final List topCategories = CollectionsKt.take(CollectionsKt.sortedWith(stats.getCategoryCounts().entrySet(), new ProfileScreenKt$ProfileScreen$$inlined$sortedByDescending$1()), 6);
        Modifier r22 = WindowInsetsPadding_androidKt.statusBarsPadding(BackgroundKt.m234backgroundbw27NRU$default(SizeKt.fillMaxSize$default(Modifier.Companion, 0.0f, 1, null), HuiyuanDesignKt.getPaper(), null, 2, null));
        if (isLandscape == false) goto L108;
        float r33 = Dp.m6973constructorimpl(12);
    L109:
        PaddingValues r27 = PaddingKt.m722PaddingValuesa9UjIt4$default(0.0f, 0.0f, 0.0f, r33, 7, null);
        ComposerKt.sourceInformationMarkerStart($composer2, 941488916, "CC(remember):ProfileScreen.kt#9igjgp");
        if ((29360128 & $dirty2) != 8388608) goto L112;
        boolean r7 = true;
    L114:
        if ((1879048192 & $dirty2) != 536870912) goto L116;
        boolean r8 = true;
    L117:
        boolean r9 = (r7 | r8) | $composer2.changedInstance(dailyQuote);
        if (($dirty2 & 112) != 32) goto L120;
        boolean r10 = true;
    L121:
        boolean r12 = r9 | r10;
        if (($dirty3 & 112) != 32) goto L124;
        boolean r28 = true;
    L125:
        boolean r29 = ((r12 | r28) | $composer2.changedInstance(context)) | $composer2.changedInstance(stats);
        if (($dirty2 & 7168) != 2048) goto L128;
        boolean r30 = true;
    L129:
        boolean r31 = (r29 | r30) | $composer2.changedInstance(topCategories);
        if (($dirty3 & 14) != 4) goto L132;
        boolean r32 = true;
    L133:
        boolean r34 = r31 | r32;
        if ((57344 & $dirty2) != 16384) goto L136;
        boolean r35 = true;
    L137:
        boolean r36 = r34 | r35;
        if ((458752 & $dirty2) != 131072) goto L140;
        boolean r37 = true;
    L141:
        boolean r38 = r36 | r37;
        if ((3670016 & $dirty2) != 1048576) goto L144;
        r17 = true;
    L144:
        boolean r110 = r38 | r17;
        Object r39 = $composer2.rememberedValue();
        if (r110 == false) goto L147;
    L150:
        final int $dirty4 = r14;
        final int r111 = r15;
        final MutableState showResetDialog$delegate2 = showResetDialog$delegate;
        Object r0 = new ProfileScreenKt$$ExternalSyntheticLambda11(isLandscape, dailyQuote, dailyQuoteModel, askName, r53, context, stats, $dirty4, topCategories, conversationText, showResetDialog$delegate2, r111, dimensionCount, entriesPerDimension);
        $composer2.updateRememberedValue(r0);
    L151:
        ComposerKt.sourceInformationMarkerEnd($composer2);
        LazyDslKt.LazyColumn(r22, null, r27, false, null, null, null, false, null, (Function1) r0, $composer2, 0, 506);
        if (ProfileScreen$lambda$1(showResetDialog$delegate2) == false) goto L158;
        $composer2.startReplaceGroup(-870161470);
        ComposerKt.sourceInformation($composer2, "292@11468L27,295@11655L283,302@11968L196,291@11424L833");
        long r210 = HuiyuanDesignKt.getPaper();
        RoundedCornerShape r40 = RoundedCornerShapeKt.m1018RoundedCornerShape0680j_4(Dp.m6973constructorimpl(16));
        ComposerKt.sourceInformationMarkerStart($composer2, 941762506, "CC(remember):ProfileScreen.kt#9igjgp");
        Object r41 = $composer2.rememberedValue();
        if (r41 != Composer.Companion.getEmpty()) goto L157;
        Object r112 = new ProfileScreenKt$$ExternalSyntheticLambda12(showResetDialog$delegate2);
        $composer2.updateRememberedValue(r112);
        r41 = r112;
    L157:
        ComposerKt.sourceInformationMarkerEnd($composer2);
        r18 = r54;
        AndroidAlertDialog_androidKt.m1889AlertDialogOix01E0((Function0) r41, ComposableLambdaKt.rememberComposableLambda(729865442, true, new ProfileScreenKt$$ExternalSyntheticLambda13(haptics, r18, showResetDialog$delegate2), $composer2, 54), null, ComposableLambdaKt.rememberComposableLambda(656280864, true, new ProfileScreenKt$$ExternalSyntheticLambda14(haptics, showResetDialog$delegate2), $composer2, 54), null, ComposableSingletons$ProfileScreenKt.INSTANCE.getLambda$582696286$app(), ComposableSingletons$ProfileScreenKt.INSTANCE.m7410getLambda$1601579651$app(), r40, r210, 0, 0, 0, 0.0f, null, $composer2, 102435894, 0, 15892);
        $composer3 = $composer2;
    L159:
        $composer3.endReplaceGroup();
        if (ComposerKt.isTraceInProgress() == false) goto L163;
        ComposerKt.traceEventEnd();
        goto L163
    L158:
        r18 = r54;
        $composer3 = $composer2;
        $composer3.startReplaceGroup(-881511469);
        goto L159
    L147:
        if (r39 == Composer.Companion.getEmpty()) goto L150;
        r0 = r39;
        showResetDialog$delegate2 = showResetDialog$delegate;
        goto L151
    L140:
        r37 = false;
        goto L141
    L136:
        r35 = false;
        goto L137
    L132:
        r32 = false;
        goto L133
    L128:
        r30 = false;
        goto L129
    L124:
        r28 = false;
        goto L125
    L120:
        r10 = false;
        goto L121
    L116:
        r8 = false;
        goto L117
    L112:
        r7 = false;
        goto L114
    L108:
        r33 = Dp.m6973constructorimpl(26);
        goto L109
    L92:
        if (($dirty3 & 147) != 146) goto L95;
        r2 = false;
        goto L97
    L85:
        if ($composer2.changedInstance(r54) == false) goto L87;
        int r113 = 256;
    L88:
        $dirty1 = $dirty1 | r113;
        goto L89
    L87:
        r113 = 128;
        goto L88
    L65:
        if ($composer2.changed(dailyQuoteModel.ordinal()) == false) goto L67;
        int r42 = 536870912;
    L68:
        $dirty = $dirty | r42;
        goto L69
    L67:
        r42 = 268435456;
        goto L68
    L29:
        r21 = 8192;
        goto L30
    L31:
        r15 = lexiconCount;
        goto L33
    L21:
        r19 = 1024;
        goto L22
    L23:
        r14 = favoriteCount;
        goto L25
    L5:
        if ($composer2.changedInstance(stats) == false) goto L7;
        int r114 = 4;
    L8:
        $dirty = $dirty | r114;
        goto L9
    L7:
        r114 = 2;
        goto L8
    }

    private static final boolean ProfileScreen$lambda$1(MutableState<Boolean> r4) {
        return r4.getValue().booleanValue();
    }

    private static final void ProfileScreen$lambda$2(MutableState<Boolean> r5, boolean r6) {
        r5.setValue(Boolean.valueOf(r6));
    }

    static final Unit ProfileScreen$lambda$36$lambda$35(final boolean $isLandscape, final LexiconEntry $dailyQuote, final AIModel $dailyQuoteModel, final String $askName, final Function0 $onAskDaily, final Context $context, final UsageStats $stats, final int $favoriteCount, final List $topCategories, final String $conversationText, final MutableState $showResetDialog$delegate, final int $lexiconCount, final int $dimensionCount, final int $entriesPerDimension, LazyListScope $this$LazyColumn) {
        Intrinsics.checkNotNullParameter($this$LazyColumn, "$this$LazyColumn");
        LazyListScope.item$default($this$LazyColumn, null, null, ComposableLambdaKt.composableLambdaInstance(1120736164, true, new ProfileScreenKt$$ExternalSyntheticLambda3($isLandscape)), 3, null);
        LazyListScope.item$default($this$LazyColumn, null, null, ComposableLambdaKt.composableLambdaInstance(115043035, true, new ProfileScreenKt$$ExternalSyntheticLambda4($isLandscape, $dailyQuote, $dailyQuoteModel, $askName, $onAskDaily, $context)), 3, null);
        LazyListScope.item$default($this$LazyColumn, null, null, ComposableLambdaKt.composableLambdaInstance(1930530524, true, new ProfileScreenKt$$ExternalSyntheticLambda5($isLandscape, $stats, $favoriteCount)), 3, null);
        LazyListScope.item$default($this$LazyColumn, null, null, ComposableLambdaKt.composableLambdaInstance(-548949283, true, new ProfileScreenKt$$ExternalSyntheticLambda6($isLandscape, $topCategories, $askName)), 3, null);
        LazyListScope.item$default($this$LazyColumn, null, null, ComposableLambdaKt.composableLambdaInstance(1266538206, true, new ProfileScreenKt$$ExternalSyntheticLambda7($isLandscape, $conversationText, $context, $showResetDialog$delegate)), 3, null);
        LazyListScope.item$default($this$LazyColumn, null, null, ComposableLambdaKt.composableLambdaInstance(-1212941601, true, new ProfileScreenKt$$ExternalSyntheticLambda8($isLandscape, $lexiconCount, $dimensionCount, $entriesPerDimension)), 3, null);
        return Unit.INSTANCE;
    }

    static final Unit ProfileScreen$lambda$36$lambda$35$lambda$4(boolean $isLandscape, LazyItemScope $this$item, Composer $composer, int $changed) {
        Intrinsics.checkNotNullParameter($this$item, "$this$item");
        ComposerKt.sourceInformation($composer, "C72@2675L243:ProfileScreen.kt#cyjvf");
        if (($changed & 17) == 16) goto L5;
        boolean r0 = true;
    L7:
        if ($composer.shouldExecute(r0, $changed & 1) == true) goto L9;
        $composer.skipToGroupEnd();
    L16:
        return Unit.INSTANCE;
    L9:
        if (ComposerKt.isTraceInProgress() == false) goto L11;
        ComposerKt.traceEventStart(1120736164, $changed, -1, "com.luchime.huiyuan.ui.ProfileScreen.<anonymous>.<anonymous>.<anonymous> (ProfileScreen.kt:72)");
    L11:
        HuiyuanDesignKt.m7415ScreenHeaderfWhpE4E("YOUR COGNITIVE MAP", "我的认知地图", "你问过的问题、留下的句子，会慢慢组成一张只属于你的地图。", HuiyuanDesignKt.getSignalBlue(), $isLandscape, null, $composer, 3510, 32);
        if (ComposerKt.isTraceInProgress() == false) goto L16;
        ComposerKt.traceEventEnd();
        goto L16
    L5:
        r0 = false;
        goto L7
    }

    static final Unit ProfileScreen$lambda$36$lambda$35$lambda$15(boolean $isLandscape, final LexiconEntry $dailyQuote, final AIModel $dailyQuoteModel, final String $askName, final Function0 $onAskDaily, final Context $context, LazyItemScope $this$item, Composer $composer, int $changed) {
        Intrinsics.checkNotNullParameter($this$item, "$this$item");
        ComposerKt.sourceInformation($composer, "C82@2957L327,97@3486L2825,92@3297L3014:ProfileScreen.kt#cyjvf");
        if (($changed & 17) == 16) goto L5;
        boolean r1 = true;
    L7:
        if ($composer.shouldExecute(r1, $changed & 1) == true) goto L9;
        $composer.skipToGroupEnd();
    L20:
        return Unit.INSTANCE;
    L9:
        if (ComposerKt.isTraceInProgress() == false) goto L11;
        ComposerKt.traceEventStart(115043035, $changed, -1, "com.luchime.huiyuan.ui.ProfileScreen.<anonymous>.<anonymous>.<anonymous> (ProfileScreen.kt:82)");
    L11:
        long r2 = HuiyuanDesignKt.getInk();
        long r6 = TextUnitKt.getSp(15);
        FontWeight r3 = FontWeight.Companion.getBlack();
        Modifier.Companion r8 = Modifier.Companion;
        float r9 = Dp.m6973constructorimpl(17);
        if ($isLandscape == false) goto L14;
        float r10 = Dp.m6973constructorimpl(8);
    L15:
        TextKt.m2820Text4IGK_g("今日一句", PaddingKt.m726paddingVpY3zN4(r8, r9, r10), r2, r6, null, r3, null, 0, null, null, 0, 0, false, 0, 0, null, null, $composer, 200070, 0, 131024);
        HuiyuanDesignKt.m7414RetroCard3IgeMak(PaddingKt.m727paddingVpY3zN4$default(SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, null), Dp.m6973constructorimpl(16), 0.0f, 2, null), HuiyuanDesignKt.getSignalYellow(), ComposableLambdaKt.rememberComposableLambda(-722980987, true, new ProfileScreenKt$$ExternalSyntheticLambda2($dailyQuote, $dailyQuoteModel, $askName, $onAskDaily, $context), $composer, 54), $composer, 438, 0);
        if (ComposerKt.isTraceInProgress() == false) goto L20;
        ComposerKt.traceEventEnd();
        goto L20
    L14:
        r10 = Dp.m6973constructorimpl(14);
        goto L15
    L5:
        r1 = false;
        goto L7
    }

    static final Unit ProfileScreen$lambda$36$lambda$35$lambda$15$lambda$14(final LexiconEntry $dailyQuote, final AIModel $dailyQuoteModel, String $askName, Function0 $onAskDaily, final Context $context, BoxScope $this$RetroCard, Composer $composer, int $changed) {
        Intrinsics.checkNotNullParameter($this$RetroCard, "$this$RetroCard");
        ComposerKt.sourceInformation($composer, "C98@3504L2793:ProfileScreen.kt#cyjvf");
        if (($changed & 17) == 16) goto L5;
        boolean r5 = true;
    L7:
        if ($composer.shouldExecute(r5, $changed & 1) == true) goto L9;
        $composer.skipToGroupEnd();
    L107:
        return Unit.INSTANCE;
    L9:
        if (ComposerKt.isTraceInProgress() == false) goto L11;
        ComposerKt.traceEventStart(-722980987, $changed, -1, "com.luchime.huiyuan.ui.ProfileScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous> (ProfileScreen.kt:98)");
    L11:
        ComposerKt.sourceInformationMarkerStart($composer, -483455358, "CC(Column)P(2,3,1)87@4442L61,88@4508L133:Column.kt#2w3rfo");
        Modifier r13 = Modifier.Companion;
        MeasurePolicy r11 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.Companion.getStart(), $composer, ((0 >> 3) & 14) | ((0 >> 3) & 112));
        ComposerKt.sourceInformationMarkerStart($composer, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
        int r24 = ComposablesKt.getCurrentCompositeKeyHash($composer, 0);
        CompositionLocalMap r8 = $composer.getCurrentCompositionLocalMap();
        Modifier r4 = ComposedModifierKt.materializeModifier($composer, r13);
        Function0<ComposeUiNode> r18 = ComposeUiNode.Companion.getConstructor();
        int r26 = ((((0 << 3) & 112) << 6) & 896) | 6;
        ComposerKt.sourceInformationMarkerStart($composer, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
        if (($composer.getApplier() instanceof Applier) == true) goto L14;
        ComposablesKt.invalidApplier();
    L14:
        $composer.startReusableNode();
        if ($composer.getInserting() == false) goto L17;
        Function0<ComposeUiNode> r3 = r18;
        $composer.createNode(r3);
    L18:
        Composer r6 = Updater.m3808constructorimpl($composer);
        Updater.m3815setimpl(r6, r11, ComposeUiNode.Companion.getSetMeasurePolicy());
        Updater.m3815setimpl(r6, r8, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> r7 = ComposeUiNode.Companion.getSetCompositeKeyHash();
        if (r6.getInserting() == true) goto L24;
        Composer r35 = $composer;
        if (Intrinsics.areEqual(r6.rememberedValue(), Integer.valueOf(r24)) == true) goto L26;
    L25:
        r6.updateRememberedValue(Integer.valueOf(r24));
        r6.apply(Integer.valueOf(r24), r7);
    L26:
        Updater.m3815setimpl(r6, r4, ComposeUiNode.Companion.getSetModifier());
        int r9 = (r26 >> 6) & 14;
        Composer r10 = r35;
        ComposerKt.sourceInformationMarkerStart(r10, -384672921, "C89@4556L9:Column.kt#2w3rfo");
        ColumnScopeInstance r32 = ColumnScopeInstance.INSTANCE;
        int r33 = ((0 >> 6) & 112) | 6;
        ComposerKt.sourceInformationMarkerStart(r10, 369661678, "C99@3533L1773,134@5327L30,135@5378L259,142@5658L30,143@5709L570:ProfileScreen.kt#cyjvf");
        Modifier r12 = SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, null);
        Arrangement.Horizontal r14 = Arrangement.INSTANCE.getSpaceBetween();
        Alignment.Vertical r15 = Alignment.Companion.getCenterVertically();
        ComposerKt.sourceInformationMarkerStart(r10, 693286680, "CC(Row)P(2,1,3)99@5124L58,100@5187L130:Row.kt#2w3rfo");
        MeasurePolicy r16 = RowKt.rowMeasurePolicy(r14, r15, r10, ((438 >> 3) & 14) | ((438 >> 3) & 112));
        ComposerKt.sourceInformationMarkerStart(r10, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
        int r44 = ComposablesKt.getCurrentCompositeKeyHash(r10, 0);
        CompositionLocalMap r17 = r10.getCurrentCompositionLocalMap();
        Modifier r19 = ComposedModifierKt.materializeModifier(r10, r12);
        Function0<ComposeUiNode> r41 = ComposeUiNode.Companion.getConstructor();
        int r20 = ((((438 << 3) & 112) << 6) & 896) | 6;
        ComposerKt.sourceInformationMarkerStart(r10, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
        if ((r10.getApplier() instanceof Applier) == true) goto L29;
        ComposablesKt.invalidApplier();
    L29:
        r10.startReusableNode();
        if (r10.getInserting() == false) goto L32;
        Function0<ComposeUiNode> r21 = r41;
        r10.createNode(r21);
    L33:
        Composer r22 = Updater.m3808constructorimpl(r10);
        Updater.m3815setimpl(r22, r16, ComposeUiNode.Companion.getSetMeasurePolicy());
        Updater.m3815setimpl(r22, r17, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> r110 = ComposeUiNode.Companion.getSetCompositeKeyHash();
        if (r22.getInserting() == true) goto L40;
        if (Intrinsics.areEqual(r22.rememberedValue(), Integer.valueOf(r44)) == false) goto L40;
    L41:
        Updater.m3815setimpl(r22, r19, ComposeUiNode.Companion.getSetModifier());
        int r23 = (r20 >> 6) & 14;
        ComposerKt.sourceInformationMarkerStart(r10, -407735110, "C101@5232L9:Row.kt#2w3rfo");
        RowScopeInstance r50 = RowScopeInstance.INSTANCE;
        int r52 = ((438 >> 6) & 112) | 6;
        ComposerKt.sourceInformationMarkerStart(r10, 1250663887, "C104@3791L1420,132@5236L48:ProfileScreen.kt#cyjvf");
        Alignment.Vertical r25 = Alignment.Companion.getCenterVertically();
        Arrangement.Horizontal r27 = Arrangement.INSTANCE.m606spacedBy0680j_4(Dp.m6973constructorimpl(9));
        ComposerKt.sourceInformationMarkerStart(r10, 693286680, "CC(Row)P(2,1,3)99@5124L58,100@5187L130:Row.kt#2w3rfo");
        Modifier r111 = Modifier.Companion;
        MeasurePolicy r112 = RowKt.rowMeasurePolicy(r27, r25, r10, ((432 >> 3) & 14) | ((432 >> 3) & 112));
        ComposerKt.sourceInformationMarkerStart(r10, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
        int r73 = ComposablesKt.getCurrentCompositeKeyHash(r10, 0);
        CompositionLocalMap r28 = r10.getCurrentCompositionLocalMap();
        Modifier r113 = ComposedModifierKt.materializeModifier(r10, r111);
        Function0<ComposeUiNode> r60 = ComposeUiNode.Companion.getConstructor();
        int r114 = ((((432 << 3) & 112) << 6) & 896) | 6;
        ComposerKt.sourceInformationMarkerStart(r10, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
        if ((r10.getApplier() instanceof Applier) == true) goto L44;
        ComposablesKt.invalidApplier();
    L44:
        r10.startReusableNode();
        if (r10.getInserting() == false) goto L47;
        Function0<ComposeUiNode> r115 = r60;
        r10.createNode(r115);
    L48:
        Composer r29 = Updater.m3808constructorimpl(r10);
        Updater.m3815setimpl(r29, r112, ComposeUiNode.Companion.getSetMeasurePolicy());
        Updater.m3815setimpl(r29, r28, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> r116 = ComposeUiNode.Companion.getSetCompositeKeyHash();
        if (r29.getInserting() == true) goto L55;
        if (Intrinsics.areEqual(r29.rememberedValue(), Integer.valueOf(r73)) == false) goto L55;
    L56:
        Updater.m3815setimpl(r29, r113, ComposeUiNode.Companion.getSetModifier());
        int r30 = (r114 >> 6) & 14;
        ComposerKt.sourceInformationMarkerStart(r10, -407735110, "C101@5232L9:Row.kt#2w3rfo");
        RowScopeInstance r117 = RowScopeInstance.INSTANCE;
        int r79 = ((432 >> 6) & 112) | 6;
        ComposerKt.sourceInformationMarkerStart(r10, 646513990, "C109@4056L42,108@4007L501,117@4537L648:ProfileScreen.kt#cyjvf");
        ImageKt.Image(PainterResources_androidKt.painterResource($dailyQuoteModel.getAvatarRes(), r10, 0), $dailyQuoteModel.getShortName() + "头像", BorderKt.m245borderxT4_qwU(ClipKt.clip(SizeKt.m772size3ABfNKs(Modifier.Companion, Dp.m6973constructorimpl(38)), RoundedCornerShapeKt.getCircleShape()), Dp.m6973constructorimpl((float) 1.5d), HuiyuanDesignKt.getInk(), RoundedCornerShapeKt.getCircleShape()), null, ContentScale.Companion.getCrop(), 0.0f, null, r10, 24576, LocationRequestCompat.QUALITY_LOW_POWER);
        ComposerKt.sourceInformationMarkerStart(r10, -483455358, "CC(Column)P(2,3,1)87@4442L61,88@4508L133:Column.kt#2w3rfo");
        Modifier r118 = Modifier.Companion;
        MeasurePolicy r31 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.Companion.getStart(), r10, ((0 >> 3) & 14) | ((0 >> 3) & 112));
        ComposerKt.sourceInformationMarkerStart(r10, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
        int r90 = ComposablesKt.getCurrentCompositeKeyHash(r10, 0);
        CompositionLocalMap r119 = r10.getCurrentCompositionLocalMap();
        Modifier r120 = ComposedModifierKt.materializeModifier(r10, r118);
        Function0<ComposeUiNode> r92 = ComposeUiNode.Companion.getConstructor();
        int r121 = ((((0 << 3) & 112) << 6) & 896) | 6;
        ComposerKt.sourceInformationMarkerStart(r10, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
        if ((r10.getApplier() instanceof Applier) == true) goto L59;
        ComposablesKt.invalidApplier();
    L59:
        r10.startReusableNode();
        if (r10.getInserting() == false) goto L62;
        Function0<ComposeUiNode> r122 = r92;
        r10.createNode(r122);
    L63:
        Composer r34 = Updater.m3808constructorimpl(r10);
        Updater.m3815setimpl(r34, r31, ComposeUiNode.Companion.getSetMeasurePolicy());
        Updater.m3815setimpl(r34, r119, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> r123 = ComposeUiNode.Companion.getSetCompositeKeyHash();
        if (r34.getInserting() == true) goto L70;
        if (Intrinsics.areEqual(r34.rememberedValue(), Integer.valueOf(r90)) == false) goto L70;
    L71:
        Updater.m3815setimpl(r34, r120, ComposeUiNode.Companion.getSetModifier());
        int r36 = (r121 >> 6) & 14;
        ComposerKt.sourceInformationMarkerStart(r10, -384672921, "C89@4556L9:Column.kt#2w3rfo");
        ColumnScopeInstance r37 = ColumnScopeInstance.INSTANCE;
        int r124 = ((0 >> 6) & 112) | 6;
        ComposerKt.sourceInformationMarkerStart(r10, -2112592183, "C118@4578L278,124@4889L266:ProfileScreen.kt#cyjvf");
        TextKt.m2820Text4IGK_g($dailyQuoteModel.getShortName(), null, HuiyuanDesignKt.getInk(), TextUnitKt.getSp(14), null, FontWeight.Companion.getBlack(), null, 0, null, null, 0, 0, false, 0, 0, null, null, r10, 200064, 0, 131026);
        TextKt.m2820Text4IGK_g("今日分享角色", null, HuiyuanDesignKt.getMutedText(), TextUnitKt.getSp(10), null, FontWeight.Companion.getBold(), null, 0, null, null, 0, 0, false, 0, 0, null, null, r10, 200070, 0, 131026);
        ComposerKt.sourceInformationMarkerEnd(r10);
        ComposerKt.sourceInformationMarkerEnd(r10);
        r10.endNode();
        ComposerKt.sourceInformationMarkerEnd(r10);
        ComposerKt.sourceInformationMarkerEnd(r10);
        ComposerKt.sourceInformationMarkerEnd(r10);
        ComposerKt.sourceInformationMarkerEnd(r10);
        ComposerKt.sourceInformationMarkerEnd(r10);
        r10.endNode();
        ComposerKt.sourceInformationMarkerEnd(r10);
        ComposerKt.sourceInformationMarkerEnd(r10);
        ComposerKt.sourceInformationMarkerEnd(r10);
        HuiyuanDesignKt.m7413CategoryBadgeiJQMabo($dailyQuote.getCategory(), HuiyuanDesignKt.getSignalPurple(), r10, 48, 0);
        ComposerKt.sourceInformationMarkerEnd(r10);
        ComposerKt.sourceInformationMarkerEnd(r10);
        r10.endNode();
        ComposerKt.sourceInformationMarkerEnd(r10);
        ComposerKt.sourceInformationMarkerEnd(r10);
        ComposerKt.sourceInformationMarkerEnd(r10);
        SpacerKt.Spacer(SizeKt.m758height3ABfNKs(Modifier.Companion, Dp.m6973constructorimpl(10)), r10, 6);
        TextKt.m2820Text4IGK_g("“" + $dailyQuote.getText() + "”", null, HuiyuanDesignKt.getInk(), TextUnitKt.getSp(17), null, FontWeight.Companion.getBlack(), null, 0, null, null, TextUnitKt.getSp(27), 0, false, 0, 0, null, null, r10, 200064, 6, 130002);
        SpacerKt.Spacer(SizeKt.m758height3ABfNKs(Modifier.Companion, Dp.m6973constructorimpl(12)), r10, 6);
        Arrangement.Horizontal r38 = Arrangement.INSTANCE.m606spacedBy0680j_4(Dp.m6973constructorimpl(8));
        ComposerKt.sourceInformationMarkerStart(r10, 693286680, "CC(Row)P(2,1,3)99@5124L58,100@5187L130:Row.kt#2w3rfo");
        Modifier r125 = Modifier.Companion;
        MeasurePolicy r126 = RowKt.rowMeasurePolicy(r38, Alignment.Companion.getTop(), r10, ((48 >> 3) & 14) | ((48 >> 3) & 112));
        ComposerKt.sourceInformationMarkerStart(r10, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
        int r39 = ComposablesKt.getCurrentCompositeKeyHash(r10, 0);
        CompositionLocalMap r40 = r10.getCurrentCompositionLocalMap();
        Modifier r42 = ComposedModifierKt.materializeModifier(r10, r125);
        Function0<ComposeUiNode> r127 = ComposeUiNode.Companion.getConstructor();
        int r43 = ((((48 << 3) & 112) << 6) & 896) | 6;
        ComposerKt.sourceInformationMarkerStart(r10, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
        if ((r10.getApplier() instanceof Applier) == true) goto L74;
        ComposablesKt.invalidApplier();
    L74:
        r10.startReusableNode();
        if (r10.getInserting() == false) goto L77;
        Function0<ComposeUiNode> r45 = r127;
        r10.createNode(r45);
    L78:
        Composer r46 = Updater.m3808constructorimpl(r10);
        Updater.m3815setimpl(r46, r126, ComposeUiNode.Companion.getSetMeasurePolicy());
        Updater.m3815setimpl(r46, r40, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> r47 = ComposeUiNode.Companion.getSetCompositeKeyHash();
        if (r46.getInserting() == true) goto L84;
        int r48 = 48;
        Composer r49 = r10;
        if (Intrinsics.areEqual(r46.rememberedValue(), Integer.valueOf(r39)) == true) goto L86;
    L85:
        r46.updateRememberedValue(Integer.valueOf(r39));
        r46.apply(Integer.valueOf(r39), r47);
    L86:
        Updater.m3815setimpl(r46, r42, ComposeUiNode.Companion.getSetModifier());
        int r51 = (r43 >> 6) & 14;
        Composer r53 = r49;
        ComposerKt.sourceInformationMarkerStart(r53, -407735110, "C101@5232L9:Row.kt#2w3rfo");
        RowScopeInstance r54 = RowScopeInstance.INSTANCE;
        int r55 = ((r48 >> 6) & 112) | 6;
        ComposerKt.sourceInformationMarkerStart(r53, 956647899, "C144@5791L50,145@5899L38,145@5866L71,146@5995L262,146@5962L295:ProfileScreen.kt#cyjvf");
        m7418ProfileActioniJQMabo("问" + $askName, HuiyuanDesignKt.getSignalPink(), $onAskDaily, r53, 48);
        long r410 = Color.Companion.m4403getWhite0d7_KjU();
        ComposerKt.sourceInformationMarkerStart(r53, -1631705348, "CC(remember):ProfileScreen.kt#9igjgp");
        boolean r56 = r53.changedInstance($context) | r53.changedInstance($dailyQuote);
        Object r57 = r53.rememberedValue();
        if (r56 == true) goto L92;
        Composer r58 = r53;
        if (r57 != Composer.Companion.getEmpty()) goto L94;
    L93:
        r57 = new ProfileScreenKt$$ExternalSyntheticLambda21($context, $dailyQuote);
        r53.updateRememberedValue(r57);
    L94:
        ComposerKt.sourceInformationMarkerEnd(r58);
        Composer r411 = r58;
        m7418ProfileActioniJQMabo("复制", r410, (Function0) r57, r411, 54);
        long r412 = Color.Companion.m4403getWhite0d7_KjU();
        ComposerKt.sourceInformationMarkerStart(r411, -1631702052, "CC(remember):ProfileScreen.kt#9igjgp");
        boolean r59 = (r411.changedInstance($context) | r411.changed($dailyQuoteModel.ordinal())) | r411.changedInstance($dailyQuote);
        Object r61 = r411.rememberedValue();
        if (r59 == true) goto L100;
        Composer r413 = r411;
        if (r61 != Composer.Companion.getEmpty()) goto L102;
    L101:
        r61 = new ProfileScreenKt$$ExternalSyntheticLambda22($context, $dailyQuoteModel, $dailyQuote);
        r411.updateRememberedValue(r61);
    L102:
        ComposerKt.sourceInformationMarkerEnd(r413);
        m7418ProfileActioniJQMabo("分享", r412, (Function0) r61, r413, 54);
        ComposerKt.sourceInformationMarkerEnd(r413);
        ComposerKt.sourceInformationMarkerEnd(r53);
        r49.endNode();
        ComposerKt.sourceInformationMarkerEnd(r49);
        ComposerKt.sourceInformationMarkerEnd(r49);
        ComposerKt.sourceInformationMarkerEnd(r49);
        ComposerKt.sourceInformationMarkerEnd(r10);
        ComposerKt.sourceInformationMarkerEnd(r10);
        r35.endNode();
        ComposerKt.sourceInformationMarkerEnd(r35);
        ComposerKt.sourceInformationMarkerEnd(r35);
        ComposerKt.sourceInformationMarkerEnd(r35);
        if (ComposerKt.isTraceInProgress() == false) goto L107;
        ComposerKt.traceEventEnd();
        goto L107
    L100:
        r413 = r411;
        goto L101
    L92:
        r58 = r53;
        goto L93
    L84:
        r48 = 48;
        r49 = r10;
        goto L85
    L77:
        r45 = r127;
        r10.useNode();
    L70:
        r34.updateRememberedValue(Integer.valueOf(r90));
        r34.apply(Integer.valueOf(r90), r123);
        goto L71
    L62:
        r122 = r92;
        r10.useNode();
    L55:
        r29.updateRememberedValue(Integer.valueOf(r73));
        r29.apply(Integer.valueOf(r73), r116);
        goto L56
    L47:
        r115 = r60;
        r10.useNode();
    L40:
        r22.updateRememberedValue(Integer.valueOf(r44));
        r22.apply(Integer.valueOf(r44), r110);
        goto L41
    L32:
        r21 = r41;
        r10.useNode();
        goto L33
    L24:
        r35 = $composer;
        goto L25
    L17:
        r3 = r18;
        $composer.useNode();
        goto L18
    L5:
        r5 = false;
        goto L7
    }

    static final Unit ProfileScreen$lambda$36$lambda$35$lambda$15$lambda$14$lambda$13$lambda$12$lambda$9$lambda$8(Context $context, LexiconEntry $dailyQuote) {
        HuiyuanDesignKt.copyText($context, $dailyQuote.getText());
        return Unit.INSTANCE;
    }

    static final Unit ProfileScreen$lambda$36$lambda$35$lambda$15$lambda$14$lambda$13$lambda$12$lambda$11$lambda$10(Context $context, AIModel $dailyQuoteModel, LexiconEntry $dailyQuote) {
        HuiyuanDesignKt.shareText($context, "603视界 · " + $dailyQuoteModel.getShortName() + "的今日一句", $dailyQuote.getText());
        return Unit.INSTANCE;
    }

    static final Unit ProfileScreen$lambda$36$lambda$35$lambda$19(boolean $isLandscape, UsageStats $stats, int $favoriteCount, LazyItemScope $this$item, Composer $composer, int $changed) {
        Intrinsics.checkNotNullParameter($this$item, "$this$item");
        ComposerKt.sourceInformation($composer, "C159@6350L327,169@6690L773:ProfileScreen.kt#cyjvf");
        if (($changed & 17) == 16) goto L5;
        boolean r2 = true;
    L7:
        if ($composer.shouldExecute(r2, $changed & 1) == true) goto L9;
        $composer.skipToGroupEnd();
    L65:
        return Unit.INSTANCE;
    L9:
        if (ComposerKt.isTraceInProgress() == false) goto L11;
        ComposerKt.traceEventStart(1930530524, $changed, -1, "com.luchime.huiyuan.ui.ProfileScreen.<anonymous>.<anonymous>.<anonymous> (ProfileScreen.kt:159)");
    L11:
        long r3 = HuiyuanDesignKt.getInk();
        long r6 = TextUnitKt.getSp(15);
        FontWeight r4 = FontWeight.Companion.getBlack();
        Modifier.Companion r8 = Modifier.Companion;
        float r9 = Dp.m6973constructorimpl(17);
        if ($isLandscape == false) goto L14;
        float r10 = Dp.m6973constructorimpl(8);
    L15:
        TextKt.m2820Text4IGK_g("使用概览", PaddingKt.m726paddingVpY3zN4(r8, r9, r10), r3, r6, null, r4, null, 0, null, null, 0, 0, false, 0, 0, null, null, $composer, 200070, 0, 131024);
        Modifier r0 = PaddingKt.m727paddingVpY3zN4$default(Modifier.Companion, Dp.m6973constructorimpl(16), 0.0f, 2, null);
        Arrangement.Vertical r1 = Arrangement.INSTANCE.m606spacedBy0680j_4(Dp.m6973constructorimpl(10));
        ComposerKt.sourceInformationMarkerStart($composer, -483455358, "CC(Column)P(2,3,1)87@4442L61,88@4508L133:Column.kt#2w3rfo");
        MeasurePolicy r7 = ColumnKt.columnMeasurePolicy(r1, Alignment.Companion.getStart(), $composer, ((54 >> 3) & 14) | ((54 >> 3) & 112));
        ComposerKt.sourceInformationMarkerStart($composer, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
        int r13 = ComposablesKt.getCurrentCompositeKeyHash($composer, 0);
        CompositionLocalMap r14 = $composer.getCurrentCompositionLocalMap();
        Modifier r15 = ComposedModifierKt.materializeModifier($composer, r0);
        Function0<ComposeUiNode> r16 = ComposeUiNode.Companion.getConstructor();
        int r12 = ((((54 << 3) & 112) << 6) & 896) | 6;
        ComposerKt.sourceInformationMarkerStart($composer, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
        if (($composer.getApplier() instanceof Applier) == true) goto L18;
        ComposablesKt.invalidApplier();
    L18:
        $composer.startReusableNode();
        if ($composer.getInserting() == false) goto L21;
        $composer.createNode(r16);
    L22:
        Composer r5 = Updater.m3808constructorimpl($composer);
        Updater.m3815setimpl(r5, r7, ComposeUiNode.Companion.getSetMeasurePolicy());
        Updater.m3815setimpl(r5, r14, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> r11 = ComposeUiNode.Companion.getSetCompositeKeyHash();
        if (r5.getInserting() == true) goto L28;
        int r27 = 54;
        if (Intrinsics.areEqual(r5.rememberedValue(), Integer.valueOf(r13)) == true) goto L30;
    L29:
        r5.updateRememberedValue(Integer.valueOf(r13));
        r5.apply(Integer.valueOf(r13), r11);
    L30:
        Updater.m3815setimpl(r5, r15, ComposeUiNode.Companion.getSetModifier());
        int r17 = (r12 >> 6) & 14;
        ComposerKt.sourceInformationMarkerStart($composer, -384672921, "C89@4556L9:Column.kt#2w3rfo");
        ColumnScopeInstance r18 = ColumnScopeInstance.INSTANCE;
        int r19 = ((r27 >> 6) & 112) | 6;
        ComposerKt.sourceInformationMarkerStart($composer, 1731641445, "C173@6861L290,177@7168L281:ProfileScreen.kt#cyjvf");
        Arrangement.Horizontal r20 = Arrangement.INSTANCE.m606spacedBy0680j_4(Dp.m6973constructorimpl(10));
        ComposerKt.sourceInformationMarkerStart($composer, 693286680, "CC(Row)P(2,1,3)99@5124L58,100@5187L130:Row.kt#2w3rfo");
        Modifier r34 = Modifier.Companion;
        MeasurePolicy r21 = RowKt.rowMeasurePolicy(r20, Alignment.Companion.getTop(), $composer, ((48 >> 3) & 14) | ((48 >> 3) & 112));
        ComposerKt.sourceInformationMarkerStart($composer, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
        int r41 = ComposablesKt.getCurrentCompositeKeyHash($composer, 0);
        CompositionLocalMap r22 = $composer.getCurrentCompositionLocalMap();
        Modifier r23 = ComposedModifierKt.materializeModifier($composer, r34);
        Function0<ComposeUiNode> r43 = ComposeUiNode.Companion.getConstructor();
        int r24 = ((((48 << 3) & 112) << 6) & 896) | 6;
        ComposerKt.sourceInformationMarkerStart($composer, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
        if (($composer.getApplier() instanceof Applier) == true) goto L33;
        ComposablesKt.invalidApplier();
    L33:
        $composer.startReusableNode();
        if ($composer.getInserting() == false) goto L36;
        Function0<ComposeUiNode> r25 = r43;
        $composer.createNode(r25);
    L37:
        Composer r26 = Updater.m3808constructorimpl($composer);
        Updater.m3815setimpl(r26, r21, ComposeUiNode.Companion.getSetMeasurePolicy());
        Updater.m3815setimpl(r26, r22, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> r28 = ComposeUiNode.Companion.getSetCompositeKeyHash();
        if (r26.getInserting() == true) goto L44;
        if (Intrinsics.areEqual(r26.rememberedValue(), Integer.valueOf(r41)) == false) goto L44;
    L45:
        Updater.m3815setimpl(r26, r23, ComposeUiNode.Companion.getSetModifier());
        int r29 = (r24 >> 6) & 14;
        ComposerKt.sourceInformationMarkerStart($composer, -407735110, "C101@5232L9:Row.kt#2w3rfo");
        int r50 = ((48 >> 6) & 112) | 6;
        RowScope r48 = RowScopeInstance.INSTANCE;
        ComposerKt.sourceInformationMarkerStart($composer, -857258708, "C174@6940L87,175@7048L85:ProfileScreen.kt#cyjvf");
        m7420StatCarduDo3WH8("提问", String.valueOf($stats.getTotalQuestions()), "次", HuiyuanDesignKt.getSignalYellow(), RowScope.weight$default(r48, Modifier.Companion, 1.0f, false, 2, null), $composer, 3462, 0);
        m7420StatCarduDo3WH8("随机灵感", String.valueOf($stats.getRandomDraws()), "次", HuiyuanDesignKt.getSignalGreen(), RowScope.weight$default(r48, Modifier.Companion, 1.0f, false, 2, null), $composer, 3462, 0);
        ComposerKt.sourceInformationMarkerEnd($composer);
        ComposerKt.sourceInformationMarkerEnd($composer);
        $composer.endNode();
        ComposerKt.sourceInformationMarkerEnd($composer);
        ComposerKt.sourceInformationMarkerEnd($composer);
        ComposerKt.sourceInformationMarkerEnd($composer);
        Arrangement.Horizontal r30 = Arrangement.INSTANCE.m606spacedBy0680j_4(Dp.m6973constructorimpl(10));
        ComposerKt.sourceInformationMarkerStart($composer, 693286680, "CC(Row)P(2,1,3)99@5124L58,100@5187L130:Row.kt#2w3rfo");
        Modifier r31 = Modifier.Companion;
        MeasurePolicy r32 = RowKt.rowMeasurePolicy(r30, Alignment.Companion.getTop(), $composer, ((48 >> 3) & 14) | ((48 >> 3) & 112));
        ComposerKt.sourceInformationMarkerStart($composer, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
        int r33 = ComposablesKt.getCurrentCompositeKeyHash($composer, 0);
        CompositionLocalMap r110 = $composer.getCurrentCompositionLocalMap();
        Modifier r35 = ComposedModifierKt.materializeModifier($composer, r31);
        Function0<ComposeUiNode> r36 = ComposeUiNode.Companion.getConstructor();
        int r37 = ((((48 << 3) & 112) << 6) & 896) | 6;
        ComposerKt.sourceInformationMarkerStart($composer, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
        if (($composer.getApplier() instanceof Applier) == true) goto L48;
        ComposablesKt.invalidApplier();
    L48:
        $composer.startReusableNode();
        if ($composer.getInserting() == false) goto L51;
        Function0<ComposeUiNode> r38 = r36;
        $composer.createNode(r38);
    L52:
        Composer r39 = Updater.m3808constructorimpl($composer);
        Updater.m3815setimpl(r39, r32, ComposeUiNode.Companion.getSetMeasurePolicy());
        Updater.m3815setimpl(r39, r110, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> r40 = ComposeUiNode.Companion.getSetCompositeKeyHash();
        if (r39.getInserting() == true) goto L58;
        Composer r47 = $composer;
        if (Intrinsics.areEqual(r39.rememberedValue(), Integer.valueOf(r33)) == true) goto L60;
    L59:
        r39.updateRememberedValue(Integer.valueOf(r33));
        r39.apply(Integer.valueOf(r33), r40);
    L60:
        Updater.m3815setimpl(r39, r35, ComposeUiNode.Companion.getSetModifier());
        int r42 = (r37 >> 6) & 14;
        Composer r44 = r47;
        ComposerKt.sourceInformationMarkerStart(r44, -407735110, "C101@5232L9:Row.kt#2w3rfo");
        int r45 = ((48 >> 6) & 112) | 6;
        RowScope r46 = RowScopeInstance.INSTANCE;
        ComposerKt.sourceInformationMarkerStart(r44, -407970050, "C178@7247L83,179@7351L80:ProfileScreen.kt#cyjvf");
        m7420StatCarduDo3WH8("连续使用", String.valueOf($stats.getStreakDays()), "天", HuiyuanDesignKt.getSignalPink(), RowScope.weight$default(r46, Modifier.Companion, 1.0f, false, 2, null), r44, 3462, 0);
        m7420StatCarduDo3WH8("收藏", String.valueOf($favoriteCount), "条", HuiyuanDesignKt.getSignalPurple(), RowScope.weight$default(r46, Modifier.Companion, 1.0f, false, 2, null), r44, 3462, 0);
        ComposerKt.sourceInformationMarkerEnd(r44);
        ComposerKt.sourceInformationMarkerEnd(r44);
        r47.endNode();
        ComposerKt.sourceInformationMarkerEnd(r47);
        ComposerKt.sourceInformationMarkerEnd(r47);
        ComposerKt.sourceInformationMarkerEnd(r47);
        ComposerKt.sourceInformationMarkerEnd($composer);
        ComposerKt.sourceInformationMarkerEnd($composer);
        $composer.endNode();
        ComposerKt.sourceInformationMarkerEnd($composer);
        ComposerKt.sourceInformationMarkerEnd($composer);
        ComposerKt.sourceInformationMarkerEnd($composer);
        if (ComposerKt.isTraceInProgress() == false) goto L65;
        ComposerKt.traceEventEnd();
        goto L65
    L58:
        r47 = $composer;
        goto L59
    L51:
        r38 = r36;
        $composer.useNode();
    L44:
        r26.updateRememberedValue(Integer.valueOf(r41));
        r26.apply(Integer.valueOf(r41), r28);
        goto L45
    L36:
        r25 = r43;
        $composer.useNode();
        goto L37
    L28:
        r27 = 54;
        goto L29
    L21:
        $composer.useNode();
        goto L22
    L14:
        r10 = Dp.m6973constructorimpl(16);
        goto L15
    L5:
        r2 = false;
        goto L7
    }

    static final Unit ProfileScreen$lambda$36$lambda$35$lambda$24(boolean $isLandscape, final List $topCategories, final String $askName, LazyItemScope $this$item, Composer $composer, int $changed) {
        Intrinsics.checkNotNullParameter($this$item, "$this$item");
        ComposerKt.sourceInformation($composer, "C185@7502L327,200@8030L1272,195@7842L1460:ProfileScreen.kt#cyjvf");
        if (($changed & 17) == 16) goto L5;
        boolean r1 = true;
    L7:
        if ($composer.shouldExecute(r1, $changed & 1) == true) goto L9;
        $composer.skipToGroupEnd();
    L20:
        return Unit.INSTANCE;
    L9:
        if (ComposerKt.isTraceInProgress() == false) goto L11;
        ComposerKt.traceEventStart(-548949283, $changed, -1, "com.luchime.huiyuan.ui.ProfileScreen.<anonymous>.<anonymous>.<anonymous> (ProfileScreen.kt:185)");
    L11:
        long r2 = HuiyuanDesignKt.getInk();
        long r6 = TextUnitKt.getSp(15);
        FontWeight r3 = FontWeight.Companion.getBlack();
        Modifier.Companion r8 = Modifier.Companion;
        float r9 = Dp.m6973constructorimpl(17);
        if ($isLandscape == false) goto L14;
        float r10 = Dp.m6973constructorimpl(8);
    L15:
        TextKt.m2820Text4IGK_g("关注维度", PaddingKt.m726paddingVpY3zN4(r8, r9, r10), r2, r6, null, r3, null, 0, null, null, 0, 0, false, 0, 0, null, null, $composer, 200070, 0, 131024);
        HuiyuanDesignKt.m7414RetroCard3IgeMak(PaddingKt.m727paddingVpY3zN4$default(SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, null), Dp.m6973constructorimpl(16), 0.0f, 2, null), Color.Companion.m4403getWhite0d7_KjU(), ComposableLambdaKt.rememberComposableLambda(-1386973305, true, new ProfileScreenKt$$ExternalSyntheticLambda0($topCategories, $askName), $composer, 54), $composer, 438, 0);
        if (ComposerKt.isTraceInProgress() == false) goto L20;
        ComposerKt.traceEventEnd();
        goto L20
    L14:
        r10 = Dp.m6973constructorimpl(16);
        goto L15
    L5:
        r1 = false;
        goto L7
    }

    static final Unit ProfileScreen$lambda$36$lambda$35$lambda$24$lambda$23(List $topCategories, String $askName, BoxScope $this$RetroCard, Composer $composer, int $changed) {
        Intrinsics.checkNotNullParameter($this$RetroCard, "$this$RetroCard");
        ComposerKt.sourceInformation($composer, "C:ProfileScreen.kt#cyjvf");
        if (($changed & 17) == 16) goto L5;
        boolean r4 = true;
    L7:
        if ($composer.shouldExecute(r4, $changed & 1) == true) goto L9;
        $composer.skipToGroupEnd();
    L53:
        return Unit.INSTANCE;
    L9:
        if (ComposerKt.isTraceInProgress() == false) goto L12;
        ComposerKt.traceEventStart(-1386973305, $changed, -1, "com.luchime.huiyuan.ui.ProfileScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous> (ProfileScreen.kt:201)");
    L12:
        if ($topCategories.isEmpty() == false) goto L14;
        $composer.startReplaceGroup(-1736287049);
        ComposerKt.sourceInformation($composer, "202@8099L220");
        TextKt.m2820Text4IGK_g("和" + $askName + "聊几次后，这里会出现你的认知关注地图。", null, HuiyuanDesignKt.getMutedText(), TextUnitKt.getSp(13), null, null, null, 0, null, null, TextUnitKt.getSp(20), 0, false, 0, 0, null, null, $composer, 3456, 6, 130034);
        $composer.endReplaceGroup();
    L47:
        if (ComposerKt.isTraceInProgress() == false) goto L53;
        ComposerKt.traceEventEnd();
        goto L53
    L14:
        $composer.startReplaceGroup(-1736001942);
        ComposerKt.sourceInformation($composer, "209@8365L905");
        Arrangement.Vertical r1 = Arrangement.INSTANCE.m606spacedBy0680j_4(Dp.m6973constructorimpl(11));
        ComposerKt.sourceInformationMarkerStart($composer, -483455358, "CC(Column)P(2,3,1)87@4442L61,88@4508L133:Column.kt#2w3rfo");
        Modifier r8 = Modifier.Companion;
        MeasurePolicy r10 = ColumnKt.columnMeasurePolicy(r1, Alignment.Companion.getStart(), $composer, ((48 >> 3) & 14) | ((48 >> 3) & 112));
        ComposerKt.sourceInformationMarkerStart($composer, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
        int r14 = ComposablesKt.getCurrentCompositeKeyHash($composer, 0);
        CompositionLocalMap r15 = $composer.getCurrentCompositionLocalMap();
        Modifier r6 = ComposedModifierKt.materializeModifier($composer, r8);
        Function0<ComposeUiNode> r17 = ComposeUiNode.Companion.getConstructor();
        int r7 = ((((48 << 3) & 112) << 6) & 896) | 6;
        int r20 = 6;
        ComposerKt.sourceInformationMarkerStart($composer, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
        if (($composer.getApplier() instanceof Applier) == true) goto L17;
        ComposablesKt.invalidApplier();
    L17:
        $composer.startReusableNode();
        if ($composer.getInserting() == false) goto L20;
        Function0<ComposeUiNode> r0 = r17;
        $composer.createNode(r0);
    L21:
        Composer r2 = Updater.m3808constructorimpl($composer);
        Updater.m3815setimpl(r2, r10, ComposeUiNode.Companion.getSetMeasurePolicy());
        Updater.m3815setimpl(r2, r15, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> r3 = ComposeUiNode.Companion.getSetCompositeKeyHash();
        if (r2.getInserting() == true) goto L27;
        int r26 = 48;
        Composer r27 = $composer;
        if (Intrinsics.areEqual(r2.rememberedValue(), Integer.valueOf(r14)) == true) goto L29;
    L28:
        r2.updateRememberedValue(Integer.valueOf(r14));
        r2.apply(Integer.valueOf(r14), r3);
    L29:
        Updater.m3815setimpl(r2, r6, ComposeUiNode.Companion.getSetModifier());
        int r5 = (r7 >> 6) & 14;
        Composer r9 = r27;
        ComposerKt.sourceInformationMarkerStart(r9, -384672921, "C89@4556L9:Column.kt#2w3rfo");
        ColumnScopeInstance r11 = ColumnScopeInstance.INSTANCE;
        int r12 = ((r26 >> 6) & 112) | 6;
        ComposerKt.sourceInformationMarkerStart(r9, -1656003517, "C:ProfileScreen.kt#cyjvf");
        Iterator r13 = $topCategories.iterator();
        if (r13.hasNext() == false) goto L50;
        int r16 = ((Number) ((Map.Entry) r13.next()).getValue()).intValue();
    L33:
        if (r13.hasNext() == false) goto L38;
        Iterator r31 = r13;
        int r18 = ((Number) ((Map.Entry) r13.next()).getValue()).intValue();
        if (r16 >= r18) goto L37;
        r16 = r18;
    L37:
        r13 = r31;
        goto L33
    L38:
        int r19 = RangesKt.coerceAtLeast(r16, 1);
        r9.startReplaceGroup(362225690);
        ComposerKt.sourceInformation(r9, "*212@8611L611");
        List r21 = $topCategories;
        int r28 = 0;
        Iterator r36 = r21.iterator();
    L40:
        if (r36.hasNext() == false) goto L45;
        Object r37 = r36.next();
        int r38 = r28 + 1;
        if (r28 >= 0) goto L44;
        CollectionsKt.throwIndexOverflow();
    L44:
        Map.Entry r39 = (Map.Entry) r37;
        int r40 = r28;
        String r29 = (String) r39.getKey();
        int r210 = ((Number) r39.getValue()).intValue();
        float r30 = ((Number) r39.getValue()).intValue() / r19;
        Composer r33 = r9;
        Color[] r22 = new Color[r20];
        r22[0] = Color.m4356boximpl(HuiyuanDesignKt.getSignalPink());
        r22[1] = Color.m4356boximpl(HuiyuanDesignKt.getSignalPurple());
        r22[2] = Color.m4356boximpl(HuiyuanDesignKt.getSignalBlue());
        r22[3] = Color.m4356boximpl(HuiyuanDesignKt.getSignalGreen());
        r22[4] = Color.m4356boximpl(HuiyuanDesignKt.getSignalOrange());
        r22[5] = Color.m4356boximpl(HuiyuanDesignKt.getSignalRed());
        m7417CategoryProgressBx497Mc(r29, r210, r30, ((Color) CollectionsKt.listOf(r22).get(r40 % 6)).m4376unboximpl(), r33, 0);
        r9 = r33;
        r28 = r38;
        r21 = r21;
        r20 = 6;
        goto L40
    L45:
        Composer r34 = r9;
        r34.endReplaceGroup();
        ComposerKt.sourceInformationMarkerEnd(r34);
        ComposerKt.sourceInformationMarkerEnd(r9);
        r27.endNode();
        ComposerKt.sourceInformationMarkerEnd(r27);
        ComposerKt.sourceInformationMarkerEnd(r27);
        ComposerKt.sourceInformationMarkerEnd(r27);
        $composer.endReplaceGroup();
        goto L47
    L50:
        throw new NoSuchElementException();
    L27:
        r26 = 48;
        r27 = $composer;
        goto L28
    L20:
        r0 = r17;
        $composer.useNode();
        goto L21
    L5:
        r4 = false;
        goto L7
    }

    static final Unit ProfileScreen$lambda$36$lambda$35$lambda$32(boolean $isLandscape, final String $conversationText, final Context $context, final MutableState $showResetDialog$delegate, LazyItemScope $this$item, Composer $composer, int $changed) {
        Intrinsics.checkNotNullParameter($this$item, "$this$item");
        ComposerKt.sourceInformation($composer, "C232@9341L328,242@9682L1106:ProfileScreen.kt#cyjvf");
        if (($changed & 17) == 16) goto L5;
        boolean r4 = true;
    L7:
        if ($composer.shouldExecute(r4, $changed & 1) == true) goto L9;
        $composer.skipToGroupEnd();
    L51:
        return Unit.INSTANCE;
    L9:
        if (ComposerKt.isTraceInProgress() == false) goto L11;
        ComposerKt.traceEventStart(1266538206, $changed, -1, "com.luchime.huiyuan.ui.ProfileScreen.<anonymous>.<anonymous>.<anonymous> (ProfileScreen.kt:232)");
    L11:
        long r5 = HuiyuanDesignKt.getInk();
        long r8 = TextUnitKt.getSp(15);
        FontWeight r6 = FontWeight.Companion.getBlack();
        Modifier.Companion r10 = Modifier.Companion;
        float r11 = Dp.m6973constructorimpl(17);
        if ($isLandscape == false) goto L14;
        float r12 = Dp.m6973constructorimpl(8);
    L15:
        TextKt.m2820Text4IGK_g("数据与分享", PaddingKt.m726paddingVpY3zN4(r10, r11, r12), r5, r8, null, r6, null, 0, null, null, 0, 0, false, 0, 0, null, null, $composer, 200070, 0, 131024);
        Modifier r2 = PaddingKt.m727paddingVpY3zN4$default(Modifier.Companion, Dp.m6973constructorimpl(16), 0.0f, 2, null);
        Arrangement.Vertical r3 = Arrangement.INSTANCE.m606spacedBy0680j_4(Dp.m6973constructorimpl(10));
        ComposerKt.sourceInformationMarkerStart($composer, -483455358, "CC(Column)P(2,3,1)87@4442L61,88@4508L133:Column.kt#2w3rfo");
        MeasurePolicy r9 = ColumnKt.columnMeasurePolicy(r3, Alignment.Companion.getStart(), $composer, ((54 >> 3) & 14) | ((54 >> 3) & 112));
        ComposerKt.sourceInformationMarkerStart($composer, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
        int r0 = ComposablesKt.getCurrentCompositeKeyHash($composer, 0);
        CompositionLocalMap r13 = $composer.getCurrentCompositionLocalMap();
        Modifier r14 = ComposedModifierKt.materializeModifier($composer, r2);
        Function0<ComposeUiNode> r15 = ComposeUiNode.Companion.getConstructor();
        int r16 = ((((54 << 3) & 112) << 6) & 896) | 6;
        ComposerKt.sourceInformationMarkerStart($composer, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
        if (($composer.getApplier() instanceof Applier) == true) goto L18;
        ComposablesKt.invalidApplier();
    L18:
        $composer.startReusableNode();
        if ($composer.getInserting() == false) goto L21;
        $composer.createNode(r15);
    L22:
        Composer r1 = Updater.m3808constructorimpl($composer);
        Updater.m3815setimpl(r1, r9, ComposeUiNode.Companion.getSetMeasurePolicy());
        Updater.m3815setimpl(r1, r13, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> r7 = ComposeUiNode.Companion.getSetCompositeKeyHash();
        if (r1.getInserting() == true) goto L28;
        int r24 = 54;
        if (Intrinsics.areEqual(r1.rememberedValue(), Integer.valueOf(r0)) == true) goto L30;
    L29:
        r1.updateRememberedValue(Integer.valueOf(r0));
        r1.apply(Integer.valueOf(r0), r7);
    L30:
        Updater.m3815setimpl(r1, r14, ComposeUiNode.Companion.getSetModifier());
        int r17 = (r16 >> 6) & 14;
        ComposerKt.sourceInformationMarkerStart($composer, -384672921, "C89@4556L9:Column.kt#2w3rfo");
        ColumnScopeInstance r18 = ColumnScopeInstance.INSTANCE;
        int r19 = ((r24 >> 6) & 112) | 6;
        ComposerKt.sourceInformationMarkerStart($composer, -939095690, "C252@10121L52,246@9853L338,260@10453L2,254@10208L265,268@10730L26,262@10490L284:ProfileScreen.kt#cyjvf");
        long r31 = HuiyuanDesignKt.getSignalGreen();
        boolean r33 = !StringsKt.isBlank($conversationText);
        ComposerKt.sourceInformationMarkerStart($composer, -1692853688, "CC(remember):ProfileScreen.kt#9igjgp");
        boolean r26 = $composer.changedInstance($context) | $composer.changed($conversationText);
        Object r20 = $composer.rememberedValue();
        if (r26 == true) goto L37;
        if (r20 == Composer.Companion.getEmpty()) goto L37;
    L38:
        ComposerKt.sourceInformationMarkerEnd($composer);
        m7419SettingsRowuDo3WH8("↗", "分享当前对话", "导出为纯文本，通过系统分享给其他应用", r31, r33, (Function0) r20, $composer, 3510);
        long r32 = HuiyuanDesignKt.getSignalYellow();
        ComposerKt.sourceInformationMarkerStart($composer, -1692843114, "CC(remember):ProfileScreen.kt#9igjgp");
        Object r21 = $composer.rememberedValue();
        if (r21 != Composer.Companion.getEmpty()) goto L41;
        Object r29 = new ProfileScreenKt$$ExternalSyntheticLambda18();
        $composer.updateRememberedValue(r29);
        Object r210 = r29;
    L42:
        ComposerKt.sourceInformationMarkerEnd($composer);
        m7419SettingsRowuDo3WH8("⌁", "本地数据", "对话、收藏和统计保存在此设备，不需要账号", r32, false, (Function0) r210, $composer, 224694);
        long r34 = HuiyuanDesignKt.getSignalRed();
        ComposerKt.sourceInformationMarkerStart($composer, -1692834226, "CC(remember):ProfileScreen.kt#9igjgp");
        Object r22 = $composer.rememberedValue();
        if (r22 != Composer.Companion.getEmpty()) goto L46;
        Object r23 = new ProfileScreenKt$$ExternalSyntheticLambda19($showResetDialog$delegate);
        $composer.updateRememberedValue(r23);
        r22 = r23;
    L46:
        ComposerKt.sourceInformationMarkerEnd($composer);
        m7419SettingsRowuDo3WH8("×", "清除全部数据", "删除对话、收藏、统计和连续使用记录", r34, true, (Function0) r22, $composer, 224694);
        ComposerKt.sourceInformationMarkerEnd($composer);
        ComposerKt.sourceInformationMarkerEnd($composer);
        $composer.endNode();
        ComposerKt.sourceInformationMarkerEnd($composer);
        ComposerKt.sourceInformationMarkerEnd($composer);
        ComposerKt.sourceInformationMarkerEnd($composer);
        if (ComposerKt.isTraceInProgress() == false) goto L51;
        ComposerKt.traceEventEnd();
        goto L51
    L41:
        r210 = r21;
    L37:
        r20 = new ProfileScreenKt$$ExternalSyntheticLambda17($context, $conversationText);
        $composer.updateRememberedValue(r20);
        goto L38
    L28:
        r24 = 54;
        goto L29
    L21:
        $composer.useNode();
        goto L22
    L14:
        r12 = Dp.m6973constructorimpl(16);
        goto L15
    L5:
        r4 = false;
        goto L7
    }

    static final Unit ProfileScreen$lambda$36$lambda$35$lambda$32$lambda$31$lambda$26$lambda$25(Context $context, String $conversationText) {
        HuiyuanDesignKt.shareText($context, "603视界 对话", $conversationText);
        return Unit.INSTANCE;
    }

    static final Unit ProfileScreen$lambda$36$lambda$35$lambda$32$lambda$31$lambda$28$lambda$27() {
        return Unit.INSTANCE;
    }

    static final Unit ProfileScreen$lambda$36$lambda$35$lambda$32$lambda$31$lambda$30$lambda$29(MutableState $showResetDialog$delegate) {
        ProfileScreen$lambda$2($showResetDialog$delegate, true);
        return Unit.INSTANCE;
    }

    static final Unit ProfileScreen$lambda$36$lambda$35$lambda$34(boolean $isLandscape, int $lexiconCount, int $dimensionCount, int $entriesPerDimension, LazyItemScope $this$item, Composer $composer, int $changed) {
        Intrinsics.checkNotNullParameter($this$item, "$this$item");
        ComposerKt.sourceInformation($composer, "C274@10827L544:ProfileScreen.kt#cyjvf");
        if (($changed & 17) == 16) goto L5;
        boolean r2 = true;
    L7:
        if ($composer.shouldExecute(r2, $changed & 1) == true) goto L9;
        $composer.skipToGroupEnd();
    L35:
        return Unit.INSTANCE;
    L9:
        if (ComposerKt.isTraceInProgress() == false) goto L11;
        ComposerKt.traceEventStart(-1212941601, $changed, -1, "com.luchime.huiyuan.ui.ProfileScreen.<anonymous>.<anonymous>.<anonymous> (ProfileScreen.kt:274)");
    L11:
        Modifier r8 = SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, null);
        if ($isLandscape == false) goto L14;
        float r10 = Dp.m6973constructorimpl(12);
    L15:
        Modifier r3 = PaddingKt.m729paddingqDBjuR0$default(r8, 0.0f, r10, 0.0f, 0.0f, 13, null);
        Alignment.Horizontal r4 = Alignment.Companion.getCenterHorizontally();
        ComposerKt.sourceInformationMarkerStart($composer, -483455358, "CC(Column)P(2,3,1)87@4442L61,88@4508L133:Column.kt#2w3rfo");
        MeasurePolicy r11 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), r4, $composer, ((384 >> 3) & 14) | ((384 >> 3) & 112));
        ComposerKt.sourceInformationMarkerStart($composer, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
        int r5 = ComposablesKt.getCurrentCompositeKeyHash($composer, 0);
        CompositionLocalMap r14 = $composer.getCurrentCompositionLocalMap();
        Modifier r15 = ComposedModifierKt.materializeModifier($composer, r3);
        Function0<ComposeUiNode> r16 = ComposeUiNode.Companion.getConstructor();
        int r0 = ((((384 << 3) & 112) << 6) & 896) | 6;
        ComposerKt.sourceInformationMarkerStart($composer, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
        if (($composer.getApplier() instanceof Applier) == true) goto L18;
        ComposablesKt.invalidApplier();
    L18:
        $composer.startReusableNode();
        if ($composer.getInserting() == false) goto L21;
        Function0<ComposeUiNode> r1 = r16;
        $composer.createNode(r1);
    L22:
        Composer r6 = Updater.m3808constructorimpl($composer);
        Updater.m3815setimpl(r6, r11, ComposeUiNode.Companion.getSetMeasurePolicy());
        Updater.m3815setimpl(r6, r14, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> r7 = ComposeUiNode.Companion.getSetCompositeKeyHash();
        if (r6.getInserting() == true) goto L29;
        if (Intrinsics.areEqual(r6.rememberedValue(), Integer.valueOf(r5)) == false) goto L29;
    L30:
        Updater.m3815setimpl(r6, r15, ComposeUiNode.Companion.getSetModifier());
        int r9 = (r0 >> 6) & 14;
        ComposerKt.sourceInformationMarkerStart($composer, -384672921, "C89@4556L9:Column.kt#2w3rfo");
        ColumnScopeInstance r12 = ColumnScopeInstance.INSTANCE;
        int r13 = ((384 >> 6) & 112) | 6;
        ComposerKt.sourceInformationMarkerStart($composer, 2020478006, "C280@11077L73,281@11167L190:ProfileScreen.kt#cyjvf");
        TextKt.m2820Text4IGK_g("603AI·Android1.0.0", null, HuiyuanDesignKt.getInk(), 0, null, FontWeight.Companion.getBlack(), null, 0, null, null, 0, 0, false, 0, 0, null, null, $composer, 196998, 0, 131034);
        TextKt.m2820Text4IGK_g($lexiconCount + " 条语料 · " + $dimensionCount + " 个维度 · 每类 " + $entriesPerDimension + " 条", null, HuiyuanDesignKt.getMutedText(), TextUnitKt.getSp(11), null, null, null, 0, null, null, 0, 0, false, 0, 0, null, null, $composer, 3456, 0, 131058);
        ComposerKt.sourceInformationMarkerEnd($composer);
        ComposerKt.sourceInformationMarkerEnd($composer);
        $composer.endNode();
        ComposerKt.sourceInformationMarkerEnd($composer);
        ComposerKt.sourceInformationMarkerEnd($composer);
        ComposerKt.sourceInformationMarkerEnd($composer);
        if (ComposerKt.isTraceInProgress() == false) goto L35;
        ComposerKt.traceEventEnd();
    L29:
        r6.updateRememberedValue(Integer.valueOf(r5));
        r6.apply(Integer.valueOf(r5), r7);
        goto L30
    L21:
        r1 = r16;
        $composer.useNode();
        goto L22
    L14:
        r10 = Dp.m6973constructorimpl(24);
        goto L15
    L5:
        r2 = false;
        goto L7
    }

    static final Unit ProfileScreen$lambda$38$lambda$37(MutableState $showResetDialog$delegate) {
        ProfileScreen$lambda$2($showResetDialog$delegate, false);
        return Unit.INSTANCE;
    }

    static final Unit ProfileScreen$lambda$41(final AppHaptics $haptics, final Function0 $onResetEverything, final MutableState $showResetDialog$delegate, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C296@11694L162,296@11673L251:ProfileScreen.kt#cyjvf");
        if (($changed & 3) == 2) goto L5;
        boolean r2 = true;
    L7:
        if ($composer.shouldExecute(r2, $changed & 1) == true) goto L9;
        $composer.skipToGroupEnd();
    L23:
        return Unit.INSTANCE;
    L9:
        if (ComposerKt.isTraceInProgress() == false) goto L11;
        ComposerKt.traceEventStart(729865442, $changed, -1, "com.luchime.huiyuan.ui.ProfileScreen.<anonymous> (ProfileScreen.kt:296)");
    L11:
        ComposerKt.sourceInformationMarkerStart($composer, 1321021924, "CC(remember):ProfileScreen.kt#9igjgp");
        boolean r3 = $composer.changedInstance($haptics) | $composer.changed($onResetEverything);
        Object r5 = $composer.rememberedValue();
        if (r3 == false) goto L14;
    L17:
        Object r8 = new ProfileScreenKt$$ExternalSyntheticLambda16($haptics, $onResetEverything, $showResetDialog$delegate);
        $composer.updateRememberedValue(r8);
        r5 = r8;
    L18:
        ComposerKt.sourceInformationMarkerEnd($composer);
        ButtonKt.TextButton((Function0) r5, null, false, null, null, null, null, null, null, ComposableSingletons$ProfileScreenKt.INSTANCE.m7411getLambda$49090299$app(), $composer, 805306368, 510);
        if (ComposerKt.isTraceInProgress() == false) goto L23;
        ComposerKt.traceEventEnd();
        goto L23
    L14:
        if (r5 != Composer.Companion.getEmpty()) goto L18;
    L5:
        r2 = false;
        goto L7
    }

    static final Unit ProfileScreen$lambda$41$lambda$40$lambda$39(AppHaptics $haptics, Function0 $onResetEverything, MutableState $showResetDialog$delegate) {
        $haptics.perform(HapticCue.DESTRUCTIVE);
        ProfileScreen$lambda$2($showResetDialog$delegate, false);
        $onResetEverything.invoke();
        return Unit.INSTANCE;
    }

    static final Unit ProfileScreen$lambda$44(final AppHaptics $haptics, final MutableState $showResetDialog$delegate, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C303@12007L114,303@11986L164:ProfileScreen.kt#cyjvf");
        if (($changed & 3) == 2) goto L5;
        boolean r1 = true;
    L7:
        if ($composer.shouldExecute(r1, $changed & 1) == true) goto L9;
        $composer.skipToGroupEnd();
    L23:
        return Unit.INSTANCE;
    L9:
        if (ComposerKt.isTraceInProgress() == false) goto L11;
        ComposerKt.traceEventStart(656280864, $changed, -1, "com.luchime.huiyuan.ui.ProfileScreen.<anonymous> (ProfileScreen.kt:303)");
    L11:
        ComposerKt.sourceInformationMarkerStart($composer, -674280846, "CC(remember):ProfileScreen.kt#9igjgp");
        boolean r2 = $composer.changedInstance($haptics);
        Object r4 = $composer.rememberedValue();
        if (r2 == false) goto L14;
    L17:
        Object r7 = new ProfileScreenKt$$ExternalSyntheticLambda20($haptics, $showResetDialog$delegate);
        $composer.updateRememberedValue(r7);
        r4 = r7;
    L18:
        ComposerKt.sourceInformationMarkerEnd($composer);
        ButtonKt.TextButton((Function0) r4, null, false, null, null, null, null, null, null, ComposableSingletons$ProfileScreenKt.INSTANCE.m7409getLambda$122674877$app(), $composer, 805306368, 510);
        if (ComposerKt.isTraceInProgress() == false) goto L23;
        ComposerKt.traceEventEnd();
        goto L23
    L14:
        if (r4 != Composer.Companion.getEmpty()) goto L18;
    L5:
        r1 = false;
        goto L7
    }

    static final Unit ProfileScreen$lambda$44$lambda$43$lambda$42(AppHaptics $haptics, MutableState $showResetDialog$delegate) {
        $haptics.perform(HapticCue.TAP);
        ProfileScreen$lambda$2($showResetDialog$delegate, false);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: StatCard-uDo3WH8, reason: not valid java name */
    private static final void m7420StatCarduDo3WH8(final String label, final String value, final String unit, final long color, Modifier modifier, Composer $composer, final int $changed, final int r24) {
        Composer $composer2 = $composer.startRestartGroup(1170720977);
        ComposerKt.sourceInformation($composer2, "C(StatCard)P(1,4,3,0:c#ui.graphics.Color)322@12468L415,322@12417L466:ProfileScreen.kt#cyjvf");
        int $dirty = $changed;
        if (($changed & 6) != 0) goto L10;
        if ($composer2.changed(label) == false) goto L7;
        int r5 = 4;
    L8:
        $dirty = $dirty | r5;
        goto L10
    L7:
        r5 = 2;
    L10:
        if (($changed & 48) != 0) goto L17;
        if ($composer2.changed(value) == false) goto L14;
        int r6 = 32;
    L15:
        $dirty = $dirty | r6;
        goto L17
    L14:
        r6 = 16;
    L17:
        if (($changed & 384) != 0) goto L24;
        if ($composer2.changed(unit) == false) goto L21;
        int r7 = 256;
    L22:
        $dirty = $dirty | r7;
        goto L24
    L21:
        r7 = 128;
    L24:
        if (($changed & 3072) != 0) goto L30;
        long r9 = color;
        if ($composer2.changed(r9) == false) goto L28;
        int r8 = 2048;
    L29:
        $dirty = $dirty | r8;
    L31:
        int r10 = r24 & 16;
        if (r10 == 0) goto L35;
        $dirty = $dirty | 24576;
        final Modifier modifier2 = modifier;
    L42:
        int $dirty2 = $dirty;
        if (($dirty2 & 9363) == 9362) goto L45;
        boolean r4 = true;
    L47:
        if ($composer2.shouldExecute(r4, $dirty2 & 1) == false) goto L58;
        if (r10 == 0) goto L50;
        Modifier modifier3 = Modifier.Companion;
    L52:
        if (ComposerKt.isTraceInProgress() == false) goto L54;
        ComposerKt.traceEventStart(1170720977, $dirty2, -1, "com.luchime.huiyuan.ui.StatCard (ProfileScreen.kt:321)");
    L54:
        HuiyuanDesignKt.m7414RetroCard3IgeMak(modifier3, r9, ComposableLambdaKt.rememberComposableLambda(353025383, true, new ProfileScreenKt$$ExternalSyntheticLambda23(label, value, unit), $composer2, 54), $composer2, ((($dirty2 >> 12) & 14) | 384) | (($dirty2 >> 6) & 112), 0);
        if (ComposerKt.isTraceInProgress() == false) goto L57;
        ComposerKt.traceEventEnd();
    L57:
        modifier2 = modifier3;
    L59:
        ScopeUpdateScope r11 = $composer2.endRestartGroup();
        if (r11 == null) goto L63;
        r11.updateScope(new ProfileScreenKt$$ExternalSyntheticLambda24(label, value, unit, color, modifier2, $changed, r24));
        return;
    L63:
        return;
    L50:
        modifier3 = modifier2;
        goto L52
    L58:
        $composer2.skipToGroupEnd();
        goto L59
    L45:
        r4 = false;
        goto L47
    L35:
        if (($changed & 24576) != 0) goto L41;
        modifier2 = modifier;
        if ($composer2.changed(modifier2) == false) goto L39;
        int r12 = 16384;
    L40:
        $dirty = $dirty | r12;
        goto L42
    L39:
        r12 = 8192;
        goto L40
    L41:
        modifier2 = modifier;
        goto L42
    L28:
        r8 = 1024;
        goto L29
    L30:
        r9 = color;
        goto L31
    }

    static final Unit StatCard_uDo3WH8$lambda$48(String $label, String $value, String $unit, BoxScope $this$RetroCard, Composer $composer, int $changed) {
        Intrinsics.checkNotNullParameter($this$RetroCard, "$this$RetroCard");
        ComposerKt.sourceInformation($composer, "C323@12478L399:ProfileScreen.kt#cyjvf");
        if (($changed & 17) == 16) goto L5;
        boolean r2 = true;
    L7:
        if ($composer.shouldExecute(r2, $changed & 1) == true) goto L9;
        $composer.skipToGroupEnd();
    L46:
        return Unit.INSTANCE;
    L9:
        if (ComposerKt.isTraceInProgress() == false) goto L11;
        ComposerKt.traceEventStart(353025383, $changed, -1, "com.luchime.huiyuan.ui.StatCard.<anonymous> (ProfileScreen.kt:323)");
    L11:
        ComposerKt.sourceInformationMarkerStart($composer, -483455358, "CC(Column)P(2,3,1)87@4442L61,88@4508L133:Column.kt#2w3rfo");
        Modifier r7 = Modifier.Companion;
        MeasurePolicy r10 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.Companion.getStart(), $composer, ((0 >> 3) & 14) | ((0 >> 3) & 112));
        ComposerKt.sourceInformationMarkerStart($composer, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
        int r16 = ComposablesKt.getCurrentCompositeKeyHash($composer, 0);
        CompositionLocalMap r5 = $composer.getCurrentCompositionLocalMap();
        Modifier r14 = ComposedModifierKt.materializeModifier($composer, r7);
        Function0<ComposeUiNode> r19 = ComposeUiNode.Companion.getConstructor();
        int r0 = ((((0 << 3) & 112) << 6) & 896) | 6;
        ComposerKt.sourceInformationMarkerStart($composer, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
        if (($composer.getApplier() instanceof Applier) == true) goto L14;
        ComposablesKt.invalidApplier();
    L14:
        $composer.startReusableNode();
        if ($composer.getInserting() == false) goto L17;
        Function0<ComposeUiNode> r1 = r19;
        $composer.createNode(r1);
    L18:
        Composer r3 = Updater.m3808constructorimpl($composer);
        Updater.m3815setimpl(r3, r10, ComposeUiNode.Companion.getSetMeasurePolicy());
        Updater.m3815setimpl(r3, r5, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> r4 = ComposeUiNode.Companion.getSetCompositeKeyHash();
        if (r3.getInserting() == true) goto L24;
        int r28 = 0;
        if (Intrinsics.areEqual(r3.rememberedValue(), Integer.valueOf(r16)) == true) goto L26;
    L25:
        r3.updateRememberedValue(Integer.valueOf(r16));
        r3.apply(Integer.valueOf(r16), r4);
    L26:
        Updater.m3815setimpl(r3, r14, ComposeUiNode.Companion.getSetModifier());
        int r6 = (r0 >> 6) & 14;
        ComposerKt.sourceInformationMarkerStart($composer, -384672921, "C89@4556L9:Column.kt#2w3rfo");
        ColumnScopeInstance r8 = ColumnScopeInstance.INSTANCE;
        int r9 = ((r28 >> 6) & 112) | 6;
        ComposerKt.sourceInformationMarkerStart($composer, -1365211518, "C324@12499L72,325@12584L283:ProfileScreen.kt#cyjvf");
        TextKt.m2820Text4IGK_g($label, null, HuiyuanDesignKt.getInk(), TextUnitKt.getSp(11), null, FontWeight.Companion.getBold(), null, 0, null, null, 0, 0, false, 0, 0, null, null, $composer, 200064, 0, 131026);
        Alignment.Vertical r11 = Alignment.Companion.getBottom();
        ComposerKt.sourceInformationMarkerStart($composer, 693286680, "CC(Row)P(2,1,3)99@5124L58,100@5187L130:Row.kt#2w3rfo");
        Modifier r12 = Modifier.Companion;
        MeasurePolicy r13 = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), r11, $composer, ((384 >> 3) & 14) | ((384 >> 3) & 112));
        ComposerKt.sourceInformationMarkerStart($composer, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
        int r15 = ComposablesKt.getCurrentCompositeKeyHash($composer, 0);
        CompositionLocalMap r17 = $composer.getCurrentCompositionLocalMap();
        Modifier r18 = ComposedModifierKt.materializeModifier($composer, r12);
        Function0<ComposeUiNode> r34 = ComposeUiNode.Companion.getConstructor();
        int r20 = ((((384 << 3) & 112) << 6) & 896) | 6;
        ComposerKt.sourceInformationMarkerStart($composer, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
        if (($composer.getApplier() instanceof Applier) == true) goto L29;
        ComposablesKt.invalidApplier();
    L29:
        $composer.startReusableNode();
        if ($composer.getInserting() == false) goto L32;
        Function0<ComposeUiNode> r21 = r34;
        $composer.createNode(r21);
    L33:
        Composer r22 = Updater.m3808constructorimpl($composer);
        Updater.m3815setimpl(r22, r13, ComposeUiNode.Companion.getSetMeasurePolicy());
        Updater.m3815setimpl(r22, r17, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> r23 = ComposeUiNode.Companion.getSetCompositeKeyHash();
        if (r22.getInserting() == true) goto L39;
        Composer r45 = $composer;
        if (Intrinsics.areEqual(r22.rememberedValue(), Integer.valueOf(r15)) == true) goto L41;
    L40:
        r22.updateRememberedValue(Integer.valueOf(r15));
        r22.apply(Integer.valueOf(r15), r23);
    L41:
        Updater.m3815setimpl(r22, r18, ComposeUiNode.Companion.getSetModifier());
        int r24 = (r20 >> 6) & 14;
        Composer r25 = r45;
        ComposerKt.sourceInformationMarkerStart(r25, -407735110, "C101@5232L9:Row.kt#2w3rfo");
        RowScopeInstance r26 = RowScopeInstance.INSTANCE;
        int r27 = ((384 >> 6) & 112) | 6;
        ComposerKt.sourceInformationMarkerStart(r25, -1837043931, "C326@12644L93,327@12754L99:ProfileScreen.kt#cyjvf");
        TextKt.m2820Text4IGK_g($value, null, HuiyuanDesignKt.getInk(), TextUnitKt.getSp(29), null, FontWeight.Companion.getBlack(), null, 0, null, null, TextUnitKt.getSp(31), 0, false, 0, 0, null, null, r25, 200064, 6, 130002);
        TextKt.m2820Text4IGK_g($unit, PaddingKt.m729paddingqDBjuR0$default(Modifier.Companion, Dp.m6973constructorimpl(3), 0.0f, 0.0f, Dp.m6973constructorimpl(3), 6, null), HuiyuanDesignKt.getInk(), TextUnitKt.getSp(11), null, null, null, 0, null, null, 0, 0, false, 0, 0, null, null, r25, 3504, 0, 131056);
        ComposerKt.sourceInformationMarkerEnd(r25);
        ComposerKt.sourceInformationMarkerEnd(r25);
        r45.endNode();
        ComposerKt.sourceInformationMarkerEnd(r45);
        ComposerKt.sourceInformationMarkerEnd(r45);
        ComposerKt.sourceInformationMarkerEnd(r45);
        ComposerKt.sourceInformationMarkerEnd($composer);
        ComposerKt.sourceInformationMarkerEnd($composer);
        $composer.endNode();
        ComposerKt.sourceInformationMarkerEnd($composer);
        ComposerKt.sourceInformationMarkerEnd($composer);
        ComposerKt.sourceInformationMarkerEnd($composer);
        if (ComposerKt.isTraceInProgress() == false) goto L46;
        ComposerKt.traceEventEnd();
        goto L46
    L39:
        r45 = $composer;
        goto L40
    L32:
        r21 = r34;
        $composer.useNode();
        goto L33
    L24:
        r28 = 0;
        goto L25
    L17:
        r1 = r19;
        $composer.useNode();
        goto L18
    L5:
        r2 = false;
        goto L7
    }

    /* JADX INFO: renamed from: CategoryProgress-Bx497Mc, reason: not valid java name */
    private static final void m7417CategoryProgressBx497Mc(final String category, final int count, final float fraction, final long color, Composer $composer, final int $changed) {
        Composer $composer2 = $composer.startRestartGroup(-152893802);
        ComposerKt.sourceInformation($composer2, "C(CategoryProgress)P(!1,2,3,1:c#ui.graphics.Color)335@12995L833:ProfileScreen.kt#cyjvf");
        int $dirty = $changed;
        if (($changed & 6) != 0) goto L11;
        if ($composer2.changed(category) == false) goto L7;
        int r8 = 4;
    L8:
        $dirty = $dirty | r8;
        goto L11
    L7:
        r8 = 2;
    L11:
        if (($changed & 48) != 0) goto L18;
        if ($composer2.changed(count) == false) goto L15;
        int r9 = 32;
    L16:
        $dirty = $dirty | r9;
        goto L18
    L15:
        r9 = 16;
    L18:
        if (($changed & 384) != 0) goto L25;
        if ($composer2.changed(fraction) == false) goto L22;
        int r10 = 256;
    L23:
        $dirty = $dirty | r10;
        goto L25
    L22:
        r10 = 128;
    L25:
        if (($changed & 3072) == 0) goto L27;
    L31:
        int $dirty2 = $dirty;
        if (($dirty2 & 1171) == 1170) goto L34;
        boolean r1 = true;
    L36:
        if ($composer2.shouldExecute(r1, $dirty2 & 1) == true) goto L38;
        Composer $composer3 = $composer2;
        $composer3.skipToGroupEnd();
    L89:
        ScopeUpdateScope r7 = $composer3.endRestartGroup();
        if (r7 == null) goto L93;
        r7.updateScope(new ProfileScreenKt$$ExternalSyntheticLambda10(category, count, fraction, color, $changed));
        return;
    L93:
        return;
    L38:
        if (ComposerKt.isTraceInProgress() == false) goto L40;
        ComposerKt.traceEventStart(-152893802, $dirty2, -1, "com.luchime.huiyuan.ui.CategoryProgress (ProfileScreen.kt:334)");
    L40:
        ComposerKt.sourceInformationMarkerStart($composer2, -483455358, "CC(Column)P(2,3,1)87@4442L61,88@4508L133:Column.kt#2w3rfo");
        Modifier r35 = Modifier.Companion;
        MeasurePolicy r14 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.Companion.getStart(), $composer2, ((0 >> 3) & 14) | ((0 >> 3) & 112));
        ComposerKt.sourceInformationMarkerStart($composer2, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
        int r38 = ComposablesKt.getCurrentCompositeKeyHash($composer2, 0);
        CompositionLocalMap r12 = $composer2.getCurrentCompositionLocalMap();
        Modifier r11 = ComposedModifierKt.materializeModifier($composer2, r35);
        Function0<ComposeUiNode> r19 = ComposeUiNode.Companion.getConstructor();
        int r0 = ((((0 << 3) & 112) << 6) & 896) | 6;
        ComposerKt.sourceInformationMarkerStart($composer2, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
        if (($composer2.getApplier() instanceof Applier) == true) goto L43;
        ComposablesKt.invalidApplier();
    L43:
        $composer2.startReusableNode();
        if ($composer2.getInserting() == false) goto L46;
        Function0<ComposeUiNode> r15 = r19;
        $composer2.createNode(r15);
    L47:
        Composer r2 = Updater.m3808constructorimpl($composer2);
        Updater.m3815setimpl(r2, r14, ComposeUiNode.Companion.getSetMeasurePolicy());
        Updater.m3815setimpl(r2, r12, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> r6 = ComposeUiNode.Companion.getSetCompositeKeyHash();
        if (r2.getInserting() == true) goto L53;
        $composer3 = $composer2;
        int $dirty3 = $dirty2;
        if (Intrinsics.areEqual(r2.rememberedValue(), Integer.valueOf(r38)) == true) goto L55;
    L54:
        r2.updateRememberedValue(Integer.valueOf(r38));
        r2.apply(Integer.valueOf(r38), r6);
    L55:
        Updater.m3815setimpl(r2, r11, ComposeUiNode.Companion.getSetModifier());
        int r3 = (r0 >> 6) & 14;
        ComposerKt.sourceInformationMarkerStart($composer2, -384672921, "C89@4556L9:Column.kt#2w3rfo");
        ColumnScopeInstance r4 = ColumnScopeInstance.INSTANCE;
        int r13 = ((0 >> 6) & 112) | 6;
        ComposerKt.sourceInformationMarkerStart($composer2, 764478285, "C336@13012L289,343@13310L29,344@13348L474:ProfileScreen.kt#cyjvf");
        Modifier r5 = SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, null);
        Arrangement.Horizontal r24 = Arrangement.INSTANCE.getSpaceBetween();
        ComposerKt.sourceInformationMarkerStart($composer2, 693286680, "CC(Row)P(2,1,3)99@5124L58,100@5187L130:Row.kt#2w3rfo");
        MeasurePolicy r16 = RowKt.rowMeasurePolicy(r24, Alignment.Companion.getTop(), $composer2, ((54 >> 3) & 14) | ((54 >> 3) & 112));
        ComposerKt.sourceInformationMarkerStart($composer2, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
        int r56 = ComposablesKt.getCurrentCompositeKeyHash($composer2, 0);
        CompositionLocalMap r17 = $composer2.getCurrentCompositionLocalMap();
        Modifier r18 = ComposedModifierKt.materializeModifier($composer2, r5);
        Function0<ComposeUiNode> r27 = ComposeUiNode.Companion.getConstructor();
        int r20 = ((((54 << 3) & 112) << 6) & 896) | 6;
        ComposerKt.sourceInformationMarkerStart($composer2, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
        if (($composer2.getApplier() instanceof Applier) == true) goto L58;
        ComposablesKt.invalidApplier();
    L58:
        $composer2.startReusableNode();
        if ($composer2.getInserting() == false) goto L61;
        Function0<ComposeUiNode> r21 = r27;
        $composer2.createNode(r21);
    L62:
        Composer r22 = Updater.m3808constructorimpl($composer2);
        Updater.m3815setimpl(r22, r16, ComposeUiNode.Companion.getSetMeasurePolicy());
        Updater.m3815setimpl(r22, r17, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> r23 = ComposeUiNode.Companion.getSetCompositeKeyHash();
        if (r22.getInserting() == true) goto L69;
        if (Intrinsics.areEqual(r22.rememberedValue(), Integer.valueOf(r56)) == false) goto L69;
    L70:
        Updater.m3815setimpl(r22, r18, ComposeUiNode.Companion.getSetModifier());
        int r25 = (r20 >> 6) & 14;
        ComposerKt.sourceInformationMarkerStart($composer2, -407735110, "C101@5232L9:Row.kt#2w3rfo");
        RowScopeInstance r26 = RowScopeInstance.INSTANCE;
        int r64 = ((54 >> 6) & 112) | 6;
        ComposerKt.sourceInformationMarkerStart($composer2, -1862583066, "C340@13150L75,341@13238L53:ProfileScreen.kt#cyjvf");
        TextKt.m2820Text4IGK_g(category, null, HuiyuanDesignKt.getInk(), TextUnitKt.getSp(12), null, FontWeight.Companion.getBold(), null, 0, null, null, 0, 0, false, 0, 0, null, null, $composer2, ($dirty3 & 14) | 200064, 0, 131026);
        TextKt.m2820Text4IGK_g(count + " 次", null, HuiyuanDesignKt.getMutedText(), TextUnitKt.getSp(11), null, null, null, 0, null, null, 0, 0, false, 0, 0, null, null, $composer2, 3456, 0, 131058);
        ComposerKt.sourceInformationMarkerEnd($composer2);
        ComposerKt.sourceInformationMarkerEnd($composer2);
        $composer2.endNode();
        ComposerKt.sourceInformationMarkerEnd($composer2);
        ComposerKt.sourceInformationMarkerEnd($composer2);
        ComposerKt.sourceInformationMarkerEnd($composer2);
        SpacerKt.Spacer(SizeKt.m758height3ABfNKs(Modifier.Companion, Dp.m6973constructorimpl(5)), $composer2, 6);
        Modifier r28 = BorderKt.m245borderxT4_qwU(BackgroundKt.m233backgroundbw27NRU(SizeKt.m758height3ABfNKs(SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, null), Dp.m6973constructorimpl(10)), HuiyuanDesignKt.getPaper(), RoundedCornerShapeKt.m1018RoundedCornerShape0680j_4(Dp.m6973constructorimpl(5))), Dp.m6973constructorimpl(1), HuiyuanDesignKt.getInk(), RoundedCornerShapeKt.m1018RoundedCornerShape0680j_4(Dp.m6973constructorimpl(5)));
        ComposerKt.sourceInformationMarkerStart($composer2, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
        MeasurePolicy r110 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.getTopStart(), false);
        ComposerKt.sourceInformationMarkerStart($composer2, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
        int r29 = ComposablesKt.getCurrentCompositeKeyHash($composer2, 0);
        CompositionLocalMap r30 = $composer2.getCurrentCompositionLocalMap();
        Modifier r31 = ComposedModifierKt.materializeModifier($composer2, r28);
        Function0<ComposeUiNode> r111 = ComposeUiNode.Companion.getConstructor();
        int r32 = ((((0 << 3) & 112) << 6) & 896) | 6;
        ComposerKt.sourceInformationMarkerStart($composer2, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
        if (($composer2.getApplier() instanceof Applier) == true) goto L73;
        ComposablesKt.invalidApplier();
    L73:
        $composer2.startReusableNode();
        if ($composer2.getInserting() == false) goto L76;
        Function0<ComposeUiNode> r33 = r111;
        $composer2.createNode(r33);
    L77:
        Composer r34 = Updater.m3808constructorimpl($composer2);
        Updater.m3815setimpl(r34, r110, ComposeUiNode.Companion.getSetMeasurePolicy());
        Updater.m3815setimpl(r34, r30, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> r36 = ComposeUiNode.Companion.getSetCompositeKeyHash();
        if (r34.getInserting() == true) goto L84;
        if (Intrinsics.areEqual(r34.rememberedValue(), Integer.valueOf(r29)) == false) goto L84;
    L85:
        Updater.m3815setimpl(r34, r31, ComposeUiNode.Companion.getSetModifier());
        int r37 = (r32 >> 6) & 14;
        ComposerKt.sourceInformationMarkerStart($composer2, -2146730711, "C72@3468L9:Box.kt#2w3rfo");
        BoxScopeInstance r39 = BoxScopeInstance.INSTANCE;
        int r40 = ((0 >> 6) & 112) | 6;
        ComposerKt.sourceInformationMarkerStart($composer2, -593705641, "C351@13594L218:ProfileScreen.kt#cyjvf");
        BoxKt.Box(BackgroundKt.m233backgroundbw27NRU(SizeKt.m758height3ABfNKs(SizeKt.fillMaxWidth(Modifier.Companion, RangesKt.coerceIn(fraction, 0.08f, 1.0f)), Dp.m6973constructorimpl(10)), color, RoundedCornerShapeKt.m1018RoundedCornerShape0680j_4(Dp.m6973constructorimpl(5))), $composer2, 0);
        ComposerKt.sourceInformationMarkerEnd($composer2);
        ComposerKt.sourceInformationMarkerEnd($composer2);
        $composer2.endNode();
        ComposerKt.sourceInformationMarkerEnd($composer2);
        ComposerKt.sourceInformationMarkerEnd($composer2);
        ComposerKt.sourceInformationMarkerEnd($composer2);
        ComposerKt.sourceInformationMarkerEnd($composer2);
        ComposerKt.sourceInformationMarkerEnd($composer2);
        $composer2.endNode();
        ComposerKt.sourceInformationMarkerEnd($composer2);
        ComposerKt.sourceInformationMarkerEnd($composer2);
        ComposerKt.sourceInformationMarkerEnd($composer2);
        if (ComposerKt.isTraceInProgress() == false) goto L89;
        ComposerKt.traceEventEnd();
    L84:
        r34.updateRememberedValue(Integer.valueOf(r29));
        r34.apply(Integer.valueOf(r29), r36);
        goto L85
    L76:
        r33 = r111;
        $composer2.useNode();
    L69:
        r22.updateRememberedValue(Integer.valueOf(r56));
        r22.apply(Integer.valueOf(r56), r23);
        goto L70
    L61:
        r21 = r27;
        $composer2.useNode();
        goto L62
    L53:
        $composer3 = $composer2;
        $dirty3 = $dirty2;
        goto L54
    L46:
        r15 = r19;
        $composer2.useNode();
        goto L47
    L34:
        r1 = false;
        goto L36
    L27:
        if ($composer2.changed(color) == false) goto L29;
        int r41 = 2048;
    L30:
        $dirty = $dirty | r41;
        goto L31
    L29:
        r41 = 1024;
        goto L30
    }

    /* JADX INFO: renamed from: ProfileAction-iJQMabo, reason: not valid java name */
    private static final void m7418ProfileActioniJQMabo(final String text, final long color, final Function0<Unit> r34, Composer $composer, final int $changed) {
        Composer $composer2 = $composer.startRestartGroup(511264279);
        ComposerKt.sourceInformation($composer2, "C(ProfileAction)P(2,0:c#ui.graphics.Color)363@13925L389:ProfileScreen.kt#cyjvf");
        int $dirty = $changed;
        if (($changed & 6) != 0) goto L9;
        String r6 = text;
        if ($composer2.changed(r6) == false) goto L7;
        int r7 = 4;
    L8:
        $dirty = $dirty | r7;
    L11:
        if (($changed & 48) != 0) goto L18;
        if ($composer2.changed(color) == false) goto L15;
        int r8 = 32;
    L16:
        $dirty = $dirty | r8;
        goto L18
    L15:
        r8 = 16;
    L18:
        if (($changed & 384) != 0) goto L24;
        Function0<Unit> r11 = r34;
        if ($composer2.changedInstance(r11) == false) goto L22;
        int r9 = 256;
    L23:
        $dirty = $dirty | r9;
    L26:
        if (($dirty & 147) == 146) goto L28;
        boolean r10 = true;
    L30:
        if ($composer2.shouldExecute(r10, $dirty & 1) == true) goto L32;
        Composer $composer3 = $composer2;
        $composer3.skipToGroupEnd();
    L38:
        ScopeUpdateScope r12 = $composer3.endRestartGroup();
        if (r12 == null) goto L42;
        r12.updateScope(new ProfileScreenKt$$ExternalSyntheticLambda9(text, color, r34, $changed));
        return;
    L42:
        return;
    L32:
        if (ComposerKt.isTraceInProgress() == false) goto L34;
        ComposerKt.traceEventStart(511264279, $dirty, -1, "com.luchime.huiyuan.ui.ProfileAction (ProfileScreen.kt:362)");
    L34:
        $composer3 = $composer2;
        TextKt.m2820Text4IGK_g(r6, PaddingKt.m726paddingVpY3zN4(AppHapticsKt.hapticClickable$default(BorderKt.m245borderxT4_qwU(BackgroundKt.m233backgroundbw27NRU(Modifier.Companion, color, RoundedCornerShapeKt.m1018RoundedCornerShape0680j_4(Dp.m6973constructorimpl(8))), Dp.m6973constructorimpl((float) 1.5d), HuiyuanDesignKt.getInk(), RoundedCornerShapeKt.m1018RoundedCornerShape0680j_4(Dp.m6973constructorimpl(8))), false, HapticCue.TAP, r11, 1, null), Dp.m6973constructorimpl(10), Dp.m6973constructorimpl(7)), HuiyuanDesignKt.getInk(), TextUnitKt.getSp(10), null, FontWeight.Companion.getBlack(), null, 0, null, null, 0, 0, false, 0, 0, null, null, $composer3, ($dirty & 14) | 200064, 0, 131024);
        if (ComposerKt.isTraceInProgress() == false) goto L38;
        ComposerKt.traceEventEnd();
        goto L38
    L28:
        r10 = false;
        goto L30
    L22:
        r9 = 128;
        goto L23
    L24:
        r11 = r34;
        goto L26
    L7:
        r7 = 2;
        goto L8
    L9:
        r6 = text;
        goto L11
    }

    /* JADX INFO: renamed from: SettingsRow-uDo3WH8, reason: not valid java name */
    private static final void m7419SettingsRowuDo3WH8(final String icon, final String title, final String subtitle, final long color, final boolean enabled, final Function0<Unit> r86, Composer $composer, final int $changed) {
        Composer $composer2 = $composer.startRestartGroup(1838941147);
        ComposerKt.sourceInformation($composer2, "C(SettingsRow)P(2,5,4,0:c#ui.graphics.Color)385@14486L996:ProfileScreen.kt#cyjvf");
        int $dirty = $changed;
        if (($changed & 6) != 0) goto L9;
        String r10 = icon;
        if ($composer2.changed(r10) == false) goto L7;
        int r2 = 4;
    L8:
        $dirty = $dirty | r2;
    L11:
        if (($changed & 48) != 0) goto L19;
        if ($composer2.changed(title) == false) goto L15;
        int r11 = 32;
    L16:
        $dirty = $dirty | r11;
        goto L19
    L15:
        r11 = 16;
    L19:
        if (($changed & 384) != 0) goto L27;
        if ($composer2.changed(subtitle) == false) goto L23;
        int r12 = 256;
    L24:
        $dirty = $dirty | r12;
        goto L27
    L23:
        r12 = 128;
    L27:
        if (($changed & 3072) != 0) goto L34;
        if ($composer2.changed(color) == false) goto L31;
        int r13 = 2048;
    L32:
        $dirty = $dirty | r13;
        goto L34
    L31:
        r13 = 1024;
    L34:
        if (($changed & 24576) != 0) goto L41;
        if ($composer2.changed(enabled) == false) goto L38;
        int r14 = 16384;
    L39:
        $dirty = $dirty | r14;
        goto L41
    L38:
        r14 = 8192;
    L41:
        if ((196608 & $changed) != 0) goto L48;
        if ($composer2.changedInstance(r86) == false) goto L45;
        int r15 = 131072;
    L46:
        $dirty = $dirty | r15;
        goto L48
    L45:
        r15 = 65536;
    L48:
        if ((74899 & $dirty) == 74898) goto L50;
        boolean r16 = true;
    L52:
        if ($composer2.shouldExecute(r16, $dirty & 1) == true) goto L54;
        $composer2.skipToGroupEnd();
    L104:
        ScopeUpdateScope r17 = $composer2.endRestartGroup();
        if (r17 == null) goto L108;
        r17.updateScope(new ProfileScreenKt$$ExternalSyntheticLambda1(icon, title, subtitle, color, enabled, r86, $changed));
        return;
    L108:
        return;
    L54:
        if (ComposerKt.isTraceInProgress() == false) goto L56;
        ComposerKt.traceEventStart(1838941147, $dirty, -1, "com.luchime.huiyuan.ui.SettingsRow (ProfileScreen.kt:384)");
    L56:
        Modifier r0 = PaddingKt.m725padding3ABfNKs(AppHapticsKt.hapticClickable(BorderKt.m245borderxT4_qwU(BackgroundKt.m233backgroundbw27NRU(SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, null), Color.Companion.m4403getWhite0d7_KjU(), RoundedCornerShapeKt.m1018RoundedCornerShape0680j_4(Dp.m6973constructorimpl(13))), Dp.m6973constructorimpl(2), HuiyuanDesignKt.getInk(), RoundedCornerShapeKt.m1018RoundedCornerShape0680j_4(Dp.m6973constructorimpl(13))), enabled, HapticCue.TAP, r86), Dp.m6973constructorimpl(12));
        Alignment.Vertical r3 = Alignment.Companion.getCenterVertically();
        ComposerKt.sourceInformationMarkerStart($composer2, 693286680, "CC(Row)P(2,1,3)99@5124L58,100@5187L130:Row.kt#2w3rfo");
        MeasurePolicy r18 = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), r3, $composer2, ((384 >> 3) & 14) | ((384 >> 3) & 112));
        ComposerKt.sourceInformationMarkerStart($composer2, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
        int r42 = ComposablesKt.getCurrentCompositeKeyHash($composer2, 0);
        CompositionLocalMap r19 = $composer2.getCurrentCompositionLocalMap();
        int $dirty2 = $dirty;
        Modifier r1 = ComposedModifierKt.materializeModifier($composer2, r0);
        Function0<ComposeUiNode> r110 = ComposeUiNode.Companion.getConstructor();
        int r4 = ((((384 << 3) & 112) << 6) & 896) | 6;
        ComposerKt.sourceInformationMarkerStart($composer2, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
        if (($composer2.getApplier() instanceof Applier) == true) goto L59;
        ComposablesKt.invalidApplier();
    L59:
        $composer2.startReusableNode();
        if ($composer2.getInserting() == false) goto L62;
        Function0<ComposeUiNode> r5 = r110;
        $composer2.createNode(r5);
    L63:
        Composer r6 = Updater.m3808constructorimpl($composer2);
        Updater.m3815setimpl(r6, r18, ComposeUiNode.Companion.getSetMeasurePolicy());
        Updater.m3815setimpl(r6, r19, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> r7 = ComposeUiNode.Companion.getSetCompositeKeyHash();
        if (r6.getInserting() == false) goto L66;
    L69:
        r6.updateRememberedValue(Integer.valueOf(r42));
        r6.apply(Integer.valueOf(r42), r7);
    L70:
        Updater.m3815setimpl(r6, r1, ComposeUiNode.Companion.getSetModifier());
        int r8 = (r4 >> 6) & 14;
        ComposerKt.sourceInformationMarkerStart($composer2, -407735110, "C101@5232L9:Row.kt#2w3rfo");
        RowScopeInstance r9 = RowScopeInstance.INSTANCE;
        int r20 = ((384 >> 6) & 112) | 6;
        ComposerKt.sourceInformationMarkerStart($composer2, 1431856737, "C394@14857L378,403@15244L232:ProfileScreen.kt#cyjvf");
        Modifier r21 = PaddingKt.m726paddingVpY3zN4(BorderKt.m245borderxT4_qwU(BackgroundKt.m233backgroundbw27NRU(Modifier.Companion, color, RoundedCornerShapeKt.m1018RoundedCornerShape0680j_4(Dp.m6973constructorimpl(9))), Dp.m6973constructorimpl((float) 1.5d), HuiyuanDesignKt.getInk(), RoundedCornerShapeKt.m1018RoundedCornerShape0680j_4(Dp.m6973constructorimpl(9))), Dp.m6973constructorimpl(11), Dp.m6973constructorimpl(7));
        Alignment r22 = Alignment.Companion.getCenter();
        ComposerKt.sourceInformationMarkerStart($composer2, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
        MeasurePolicy r23 = BoxKt.maybeCachedBoxMeasurePolicy(r22, false);
        ComposerKt.sourceInformationMarkerStart($composer2, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
        int r61 = ComposablesKt.getCurrentCompositeKeyHash($composer2, 0);
        CompositionLocalMap r24 = $composer2.getCurrentCompositionLocalMap();
        Modifier r25 = ComposedModifierKt.materializeModifier($composer2, r21);
        Function0<ComposeUiNode> r111 = ComposeUiNode.Companion.getConstructor();
        int r26 = ((((48 << 3) & 112) << 6) & 896) | 6;
        ComposerKt.sourceInformationMarkerStart($composer2, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
        if (($composer2.getApplier() instanceof Applier) == true) goto L73;
        ComposablesKt.invalidApplier();
    L73:
        $composer2.startReusableNode();
        if ($composer2.getInserting() == false) goto L76;
        Function0<ComposeUiNode> r27 = r111;
        $composer2.createNode(r27);
    L77:
        Composer r28 = Updater.m3808constructorimpl($composer2);
        Updater.m3815setimpl(r28, r23, ComposeUiNode.Companion.getSetMeasurePolicy());
        Updater.m3815setimpl(r28, r24, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> r29 = ComposeUiNode.Companion.getSetCompositeKeyHash();
        if (r28.getInserting() == true) goto L84;
        if (Intrinsics.areEqual(r28.rememberedValue(), Integer.valueOf(r61)) == false) goto L84;
    L85:
        Updater.m3815setimpl(r28, r25, ComposeUiNode.Companion.getSetModifier());
        int r30 = (r26 >> 6) & 14;
        ComposerKt.sourceInformationMarkerStart($composer2, -2146730711, "C72@3468L9:Box.kt#2w3rfo");
        BoxScopeInstance r31 = BoxScopeInstance.INSTANCE;
        int r32 = ((48 >> 6) & 112) | 6;
        ComposerKt.sourceInformationMarkerStart($composer2, -1691651798, "C401@15153L72:ProfileScreen.kt#cyjvf");
        TextKt.m2820Text4IGK_g(r10, null, HuiyuanDesignKt.getInk(), TextUnitKt.getSp(19), null, FontWeight.Companion.getBlack(), null, 0, null, null, 0, 0, false, 0, 0, null, null, $composer2, ($dirty2 & 14) | 200064, 0, 131026);
        ComposerKt.sourceInformationMarkerEnd($composer2);
        ComposerKt.sourceInformationMarkerEnd($composer2);
        $composer2.endNode();
        ComposerKt.sourceInformationMarkerEnd($composer2);
        ComposerKt.sourceInformationMarkerEnd($composer2);
        ComposerKt.sourceInformationMarkerEnd($composer2);
        Modifier r33 = PaddingKt.m729paddingqDBjuR0$default(Modifier.Companion, Dp.m6973constructorimpl(11), 0.0f, 0.0f, 0.0f, 14, null);
        ComposerKt.sourceInformationMarkerStart($composer2, -483455358, "CC(Column)P(2,3,1)87@4442L61,88@4508L133:Column.kt#2w3rfo");
        MeasurePolicy r112 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.Companion.getStart(), $composer2, ((6 >> 3) & 14) | ((6 >> 3) & 112));
        ComposerKt.sourceInformationMarkerStart($composer2, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
        int r34 = ComposablesKt.getCurrentCompositeKeyHash($composer2, 0);
        CompositionLocalMap r35 = $composer2.getCurrentCompositionLocalMap();
        Modifier r113 = ComposedModifierKt.materializeModifier($composer2, r33);
        Function0<ComposeUiNode> r114 = ComposeUiNode.Companion.getConstructor();
        int r36 = ((((6 << 3) & 112) << 6) & 896) | 6;
        ComposerKt.sourceInformationMarkerStart($composer2, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
        if (($composer2.getApplier() instanceof Applier) == true) goto L88;
        ComposablesKt.invalidApplier();
    L88:
        $composer2.startReusableNode();
        if ($composer2.getInserting() == false) goto L91;
        $composer2.createNode(r114);
    L92:
        Composer r37 = Updater.m3808constructorimpl($composer2);
        Updater.m3815setimpl(r37, r112, ComposeUiNode.Companion.getSetMeasurePolicy());
        Updater.m3815setimpl(r37, r35, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> r38 = ComposeUiNode.Companion.getSetCompositeKeyHash();
        if (r37.getInserting() == true) goto L99;
        if (Intrinsics.areEqual(r37.rememberedValue(), Integer.valueOf(r34)) == false) goto L99;
    L100:
        Updater.m3815setimpl(r37, r113, ComposeUiNode.Companion.getSetModifier());
        int r39 = (r36 >> 6) & 14;
        ComposerKt.sourceInformationMarkerStart($composer2, -384672921, "C89@4556L9:Column.kt#2w3rfo");
        ColumnScopeInstance r40 = ColumnScopeInstance.INSTANCE;
        int r41 = ((6 >> 6) & 112) | 6;
        ComposerKt.sourceInformationMarkerStart($composer2, -1221706779, "C404@15309L73,405@15395L71:ProfileScreen.kt#cyjvf");
        TextKt.m2820Text4IGK_g(title, null, HuiyuanDesignKt.getInk(), TextUnitKt.getSp(14), null, FontWeight.Companion.getBlack(), null, 0, null, null, 0, 0, false, 0, 0, null, null, $composer2, (($dirty2 >> 3) & 14) | 200064, 0, 131026);
        TextKt.m2820Text4IGK_g(subtitle, null, HuiyuanDesignKt.getMutedText(), TextUnitKt.getSp(11), null, null, null, 0, null, null, TextUnitKt.getSp(16), 0, false, 0, 0, null, null, $composer2, (($dirty2 >> 6) & 14) | 3456, 6, 130034);
        ComposerKt.sourceInformationMarkerEnd($composer2);
        ComposerKt.sourceInformationMarkerEnd($composer2);
        $composer2.endNode();
        ComposerKt.sourceInformationMarkerEnd($composer2);
        ComposerKt.sourceInformationMarkerEnd($composer2);
        ComposerKt.sourceInformationMarkerEnd($composer2);
        ComposerKt.sourceInformationMarkerEnd($composer2);
        ComposerKt.sourceInformationMarkerEnd($composer2);
        $composer2.endNode();
        ComposerKt.sourceInformationMarkerEnd($composer2);
        ComposerKt.sourceInformationMarkerEnd($composer2);
        ComposerKt.sourceInformationMarkerEnd($composer2);
        if (ComposerKt.isTraceInProgress() == false) goto L104;
        ComposerKt.traceEventEnd();
    L99:
        r37.updateRememberedValue(Integer.valueOf(r34));
        r37.apply(Integer.valueOf(r34), r38);
        goto L100
    L91:
        $composer2.useNode();
    L84:
        r28.updateRememberedValue(Integer.valueOf(r61));
        r28.apply(Integer.valueOf(r61), r29);
        goto L85
    L76:
        r27 = r111;
        $composer2.useNode();
        goto L77
    L66:
        if (Intrinsics.areEqual(r6.rememberedValue(), Integer.valueOf(r42)) == true) goto L70;
    L62:
        r5 = r110;
        $composer2.useNode();
        goto L63
    L50:
        r16 = false;
        goto L52
    L7:
        r2 = 2;
        goto L8
    L9:
        r10 = icon;
        goto L11
    }
}
