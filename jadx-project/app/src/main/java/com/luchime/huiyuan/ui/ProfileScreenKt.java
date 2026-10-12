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
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.TextUnitKt;
import androidx.core.location.LocationRequestCompat;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import androidx.profileinstaller.ProfileVerifier;
import com.luchime.huiyuan.LexiconEntry;
import com.luchime.huiyuan.UsageStats;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.comparisons.ComparisonsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import kotlin.text.StringsKt;

/* JADX INFO: compiled from: ProfileScreen.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000N\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0002\b\u0010\u001a\u0081\u0001\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00052\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00010\u00142\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00010\u0014H\u0001¢\u0006\u0002\u0010\u0016\u001a9\u0010\u0017\u001a\u00020\u00012\u0006\u0010\u0018\u001a\u00020\u00052\u0006\u0010\u0019\u001a\u00020\u00052\u0006\u0010\u001a\u001a\u00020\u00052\u0006\u0010\u001b\u001a\u00020\u001c2\b\b\u0002\u0010\u001d\u001a\u00020\u001eH\u0003¢\u0006\u0004\b\u001f\u0010 \u001a/\u0010!\u001a\u00020\u00012\u0006\u0010\"\u001a\u00020\u00052\u0006\u0010#\u001a\u00020\u00072\u0006\u0010$\u001a\u00020%2\u0006\u0010\u001b\u001a\u00020\u001cH\u0003¢\u0006\u0004\b&\u0010'\u001a-\u0010(\u001a\u00020\u00012\u0006\u0010)\u001a\u00020\u00052\u0006\u0010\u001b\u001a\u00020\u001c2\f\u0010*\u001a\b\u0012\u0004\u0012\u00020\u00010\u0014H\u0003¢\u0006\u0004\b+\u0010,\u001aE\u0010-\u001a\u00020\u00012\u0006\u0010.\u001a\u00020\u00052\u0006\u0010/\u001a\u00020\u00052\u0006\u00100\u001a\u00020\u00052\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u00101\u001a\u00020\r2\f\u0010*\u001a\b\u0012\u0004\u0012\u00020\u00010\u0014H\u0003¢\u0006\u0004\b2\u00103¨\u00064²\u0006\n\u00105\u001a\u00020\rX\u008a\u008e\u0002"}, d2 = {"ProfileScreen", "", "stats", "Lcom/luchime/huiyuan/UsageStats;", "askName", "", "messageCount", "", "favoriteCount", "lexiconCount", "dimensionCount", "entriesPerDimension", "isLandscape", "", "dailyQuote", "Lcom/luchime/huiyuan/LexiconEntry;", "dailyQuoteModel", "Lcom/luchime/huiyuan/ui/AIModel;", "conversationText", "onAskDaily", "Lkotlin/Function0;", "onResetEverything", "(Lcom/luchime/huiyuan/UsageStats;Ljava/lang/String;IIIIIZLcom/luchime/huiyuan/LexiconEntry;Lcom/luchime/huiyuan/ui/AIModel;Ljava/lang/String;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "StatCard", "label", "value", "unit", "color", "Landroidx/compose/ui/graphics/Color;", "modifier", "Landroidx/compose/ui/Modifier;", "StatCard-uDo3WH8", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLandroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "CategoryProgress", "category", "count", "fraction", "", "CategoryProgress-Bx497Mc", "(Ljava/lang/String;IFJLandroidx/compose/runtime/Composer;I)V", "ProfileAction", "text", "onClick", "ProfileAction-iJQMabo", "(Ljava/lang/String;JLkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "SettingsRow", "icon", "title", "subtitle", "enabled", "SettingsRow-uDo3WH8", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JZLkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "app", "showResetDialog"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class ProfileScreenKt {
    static final Unit CategoryProgress_Bx497Mc$lambda$53(String str, int i, float f, long j, int i2, Composer composer, int i3) {
        m7417CategoryProgressBx497Mc(str, i, f, j, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
        return Unit.INSTANCE;
    }

    static final Unit ProfileAction_iJQMabo$lambda$54(String str, long j, Function0 function0, int i, Composer composer, int i2) {
        m7418ProfileActioniJQMabo(str, j, function0, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    static final Unit ProfileScreen$lambda$45(UsageStats usageStats, String str, int i, int i2, int i3, int i4, int i5, boolean z, LexiconEntry lexiconEntry, AIModel aIModel, String str2, Function0 function0, Function0 function1, int i6, int i7, Composer composer, int i8) {
        ProfileScreen(usageStats, str, i, i2, i3, i4, i5, z, lexiconEntry, aIModel, str2, function0, function1, composer, RecomposeScopeImplKt.updateChangedFlags(i6 | 1), RecomposeScopeImplKt.updateChangedFlags(i7));
        return Unit.INSTANCE;
    }

    static final Unit SettingsRow_uDo3WH8$lambda$58(String str, String str2, String str3, long j, boolean z, Function0 function0, int i, Composer composer, int i2) {
        m7419SettingsRowuDo3WH8(str, str2, str3, j, z, function0, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    static final Unit StatCard_uDo3WH8$lambda$49(String str, String str2, String str3, long j, Modifier modifier, int i, int i2, Composer composer, int i3) {
        m7420StatCarduDo3WH8(str, str2, str3, j, modifier, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    public static final void ProfileScreen(final UsageStats stats, final String askName, final int messageCount, final int favoriteCount, final int lexiconCount, final int dimensionCount, final int entriesPerDimension, final boolean isLandscape, final LexiconEntry dailyQuote, final AIModel dailyQuoteModel, final String conversationText, final Function0<Unit> onAskDaily, Function0<Unit> onResetEverything, Composer $composer, final int $changed, final int $changed1) {
        int i;
        int i2;
        final Function0<Unit> function0;
        Composer $composer2;
        Object obj;
        final MutableState showResetDialog$delegate;
        Intrinsics.checkNotNullParameter(stats, "stats");
        Intrinsics.checkNotNullParameter(askName, "askName");
        Intrinsics.checkNotNullParameter(dailyQuote, "dailyQuote");
        Intrinsics.checkNotNullParameter(dailyQuoteModel, "dailyQuoteModel");
        Intrinsics.checkNotNullParameter(conversationText, "conversationText");
        Intrinsics.checkNotNullParameter(onAskDaily, "onAskDaily");
        Intrinsics.checkNotNullParameter(onResetEverything, "onResetEverything");
        Composer $composer3 = $composer.startRestartGroup(827794383);
        ComposerKt.sourceInformation($composer3, "C(ProfileScreen)P(12!1,9,6,8,4,5,7,2,3)57@2197L7,58@2239L7,59@2274L34,70@2646L8741,64@2425L8962:ProfileScreen.kt#cyjvf");
        int $dirty = $changed;
        int $dirty1 = $changed1;
        if (($changed & 6) == 0) {
            $dirty |= $composer3.changedInstance(stats) ? 4 : 2;
        }
        if (($changed & 48) == 0) {
            $dirty |= $composer3.changed(askName) ? 32 : 16;
        }
        if (($changed & 3072) == 0) {
            i = favoriteCount;
            $dirty |= $composer3.changed(i) ? 2048 : 1024;
        } else {
            i = favoriteCount;
        }
        if (($changed & 24576) == 0) {
            i2 = lexiconCount;
            $dirty |= $composer3.changed(i2) ? 16384 : 8192;
        } else {
            i2 = lexiconCount;
        }
        if (($changed & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
            $dirty |= $composer3.changed(dimensionCount) ? 131072 : 65536;
        }
        if (($changed & 1572864) == 0) {
            $dirty |= $composer3.changed(entriesPerDimension) ? 1048576 : 524288;
        }
        if (($changed & 12582912) == 0) {
            $dirty |= $composer3.changed(isLandscape) ? 8388608 : 4194304;
        }
        if (($changed & 100663296) == 0) {
            $dirty |= $composer3.changedInstance(dailyQuote) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
        }
        if (($changed & 805306368) == 0) {
            $dirty |= $composer3.changed(dailyQuoteModel.ordinal()) ? 536870912 : 268435456;
        }
        int $dirty2 = $dirty;
        if (($changed1 & 6) == 0) {
            $dirty1 |= $composer3.changed(conversationText) ? 4 : 2;
        }
        if (($changed1 & 48) == 0) {
            $dirty1 |= $composer3.changedInstance(onAskDaily) ? 32 : 16;
        }
        if (($changed1 & 384) == 0) {
            $dirty1 |= $composer3.changedInstance(onResetEverything) ? 256 : 128;
        }
        int $dirty3 = $dirty1;
        if (!$composer3.shouldExecute(((306783251 & $dirty2) == 306783250 && ($dirty3 & 147) == 146) ? false : true, $dirty2 & 1)) {
            function0 = onResetEverything;
            $composer2 = $composer3;
            $composer2.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(827794383, $dirty2, $dirty3, "com.luchime.huiyuan.ui.ProfileScreen (ProfileScreen.kt:56)");
            }
            ProvidableCompositionLocal<Context> localContext = AndroidCompositionLocals_androidKt.getLocalContext();
            ComposerKt.sourceInformationMarkerStart($composer3, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
            Object objConsume = $composer3.consume(localContext);
            ComposerKt.sourceInformationMarkerEnd($composer3);
            final Context context = (Context) objConsume;
            ProvidableCompositionLocal<AppHaptics> localAppHaptics = AppHapticsKt.getLocalAppHaptics();
            ComposerKt.sourceInformationMarkerStart($composer3, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
            Object objConsume2 = $composer3.consume(localAppHaptics);
            ComposerKt.sourceInformationMarkerEnd($composer3);
            final AppHaptics haptics = (AppHaptics) objConsume2;
            ComposerKt.sourceInformationMarkerStart($composer3, 941468305, "CC(remember):ProfileScreen.kt#9igjgp");
            Object objRememberedValue = $composer3.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, null, 2, null);
                $composer3.updateRememberedValue(objRememberedValue);
            }
            MutableState showResetDialog$delegate2 = (MutableState) objRememberedValue;
            ComposerKt.sourceInformationMarkerEnd($composer3);
            final List topCategories = CollectionsKt.take(CollectionsKt.sortedWith(stats.getCategoryCounts().entrySet(), new Comparator() { // from class: com.luchime.huiyuan.ui.ProfileScreenKt$ProfileScreen$$inlined$sortedByDescending$1
                @Override // java.util.Comparator
                public final int compare(T t, T t2) {
                    return ComparisonsKt.compareValues((Integer) ((Map.Entry) t2).getValue(), (Integer) ((Map.Entry) t).getValue());
                }
            }), 6);
            Modifier modifierStatusBarsPadding = WindowInsetsPadding_androidKt.statusBarsPadding(BackgroundKt.m234backgroundbw27NRU$default(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), HuiyuanDesignKt.getPaper(), null, 2, null));
            PaddingValues paddingValuesM722PaddingValuesa9UjIt4$default = PaddingKt.m722PaddingValuesa9UjIt4$default(0.0f, 0.0f, 0.0f, isLandscape ? Dp.m6973constructorimpl(12) : Dp.m6973constructorimpl(26), 7, null);
            ComposerKt.sourceInformationMarkerStart($composer3, 941488916, "CC(remember):ProfileScreen.kt#9igjgp");
            boolean zChangedInstance = ((29360128 & $dirty2) == 8388608) | ((1879048192 & $dirty2) == 536870912) | $composer3.changedInstance(dailyQuote) | (($dirty2 & 112) == 32) | (($dirty3 & 112) == 32) | $composer3.changedInstance(context) | $composer3.changedInstance(stats) | (($dirty2 & 7168) == 2048) | $composer3.changedInstance(topCategories) | (($dirty3 & 14) == 4) | ((57344 & $dirty2) == 16384) | ((458752 & $dirty2) == 131072) | ((3670016 & $dirty2) == 1048576);
            Object objRememberedValue2 = $composer3.rememberedValue();
            if (zChangedInstance || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                final int $dirty4 = i;
                final int i3 = i2;
                showResetDialog$delegate = showResetDialog$delegate2;
                obj = new Function1() { // from class: com.luchime.huiyuan.ui.ProfileScreenKt$$ExternalSyntheticLambda11
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return ProfileScreenKt.ProfileScreen$lambda$36$lambda$35(isLandscape, dailyQuote, dailyQuoteModel, askName, onAskDaily, context, stats, $dirty4, topCategories, conversationText, showResetDialog$delegate, i3, dimensionCount, entriesPerDimension, (LazyListScope) obj2);
                    }
                };
                $composer3.updateRememberedValue(obj);
            } else {
                obj = objRememberedValue2;
                showResetDialog$delegate = showResetDialog$delegate2;
            }
            ComposerKt.sourceInformationMarkerEnd($composer3);
            LazyDslKt.LazyColumn(modifierStatusBarsPadding, null, paddingValuesM722PaddingValuesa9UjIt4$default, false, null, null, null, false, null, (Function1) obj, $composer3, 0, 506);
            if (ProfileScreen$lambda$1(showResetDialog$delegate)) {
                $composer3.startReplaceGroup(-870161470);
                ComposerKt.sourceInformation($composer3, "292@11468L27,295@11655L283,302@11968L196,291@11424L833");
                long paper = HuiyuanDesignKt.getPaper();
                RoundedCornerShape roundedCornerShapeM1018RoundedCornerShape0680j_4 = RoundedCornerShapeKt.m1018RoundedCornerShape0680j_4(Dp.m6973constructorimpl(16));
                ComposerKt.sourceInformationMarkerStart($composer3, 941762506, "CC(remember):ProfileScreen.kt#9igjgp");
                Object objRememberedValue3 = $composer3.rememberedValue();
                if (objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                    Object obj2 = new Function0() { // from class: com.luchime.huiyuan.ui.ProfileScreenKt$$ExternalSyntheticLambda12
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return ProfileScreenKt.ProfileScreen$lambda$38$lambda$37(showResetDialog$delegate);
                        }
                    };
                    $composer3.updateRememberedValue(obj2);
                    objRememberedValue3 = obj2;
                }
                ComposerKt.sourceInformationMarkerEnd($composer3);
                function0 = onResetEverything;
                AndroidAlertDialog_androidKt.m1889AlertDialogOix01E0((Function0) objRememberedValue3, ComposableLambdaKt.rememberComposableLambda(729865442, true, new Function2() { // from class: com.luchime.huiyuan.ui.ProfileScreenKt$$ExternalSyntheticLambda13
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj3, Object obj4) {
                        return ProfileScreenKt.ProfileScreen$lambda$41(haptics, function0, showResetDialog$delegate, (Composer) obj3, ((Integer) obj4).intValue());
                    }
                }, $composer3, 54), null, ComposableLambdaKt.rememberComposableLambda(656280864, true, new Function2() { // from class: com.luchime.huiyuan.ui.ProfileScreenKt$$ExternalSyntheticLambda14
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj3, Object obj4) {
                        return ProfileScreenKt.ProfileScreen$lambda$44(haptics, showResetDialog$delegate, (Composer) obj3, ((Integer) obj4).intValue());
                    }
                }, $composer3, 54), null, ComposableSingletons$ProfileScreenKt.INSTANCE.getLambda$582696286$app(), ComposableSingletons$ProfileScreenKt.INSTANCE.m7410getLambda$1601579651$app(), roundedCornerShapeM1018RoundedCornerShape0680j_4, paper, 0L, 0L, 0L, 0.0f, null, $composer3, 102435894, 0, 15892);
                $composer2 = $composer3;
            } else {
                function0 = onResetEverything;
                $composer2 = $composer3;
                $composer2.startReplaceGroup(-881511469);
            }
            $composer2.endReplaceGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = $composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.luchime.huiyuan.ui.ProfileScreenKt$$ExternalSyntheticLambda15
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj3, Object obj4) {
                    return ProfileScreenKt.ProfileScreen$lambda$45(stats, askName, messageCount, favoriteCount, lexiconCount, dimensionCount, entriesPerDimension, isLandscape, dailyQuote, dailyQuoteModel, conversationText, onAskDaily, function0, $changed, $changed1, (Composer) obj3, ((Integer) obj4).intValue());
                }
            });
        }
    }

    private static final boolean ProfileScreen$lambda$1(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    private static final void ProfileScreen$lambda$2(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    static final Unit ProfileScreen$lambda$36$lambda$35(final boolean $isLandscape, final LexiconEntry $dailyQuote, final AIModel $dailyQuoteModel, final String $askName, final Function0 $onAskDaily, final Context $context, final UsageStats $stats, final int $favoriteCount, final List $topCategories, final String $conversationText, final MutableState $showResetDialog$delegate, final int $lexiconCount, final int $dimensionCount, final int $entriesPerDimension, LazyListScope LazyColumn) {
        Intrinsics.checkNotNullParameter(LazyColumn, "$this$LazyColumn");
        LazyListScope.item$default(LazyColumn, null, null, ComposableLambdaKt.composableLambdaInstance(1120736164, true, new Function3() { // from class: com.luchime.huiyuan.ui.ProfileScreenKt$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function3
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                return ProfileScreenKt.ProfileScreen$lambda$36$lambda$35$lambda$4($isLandscape, (LazyItemScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
            }
        }), 3, null);
        LazyListScope.item$default(LazyColumn, null, null, ComposableLambdaKt.composableLambdaInstance(115043035, true, new Function3() { // from class: com.luchime.huiyuan.ui.ProfileScreenKt$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function3
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                return ProfileScreenKt.ProfileScreen$lambda$36$lambda$35$lambda$15($isLandscape, $dailyQuote, $dailyQuoteModel, $askName, $onAskDaily, $context, (LazyItemScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
            }
        }), 3, null);
        LazyListScope.item$default(LazyColumn, null, null, ComposableLambdaKt.composableLambdaInstance(1930530524, true, new Function3() { // from class: com.luchime.huiyuan.ui.ProfileScreenKt$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function3
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                return ProfileScreenKt.ProfileScreen$lambda$36$lambda$35$lambda$19($isLandscape, $stats, $favoriteCount, (LazyItemScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
            }
        }), 3, null);
        LazyListScope.item$default(LazyColumn, null, null, ComposableLambdaKt.composableLambdaInstance(-548949283, true, new Function3() { // from class: com.luchime.huiyuan.ui.ProfileScreenKt$$ExternalSyntheticLambda6
            @Override // kotlin.jvm.functions.Function3
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                return ProfileScreenKt.ProfileScreen$lambda$36$lambda$35$lambda$24($isLandscape, $topCategories, $askName, (LazyItemScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
            }
        }), 3, null);
        LazyListScope.item$default(LazyColumn, null, null, ComposableLambdaKt.composableLambdaInstance(1266538206, true, new Function3() { // from class: com.luchime.huiyuan.ui.ProfileScreenKt$$ExternalSyntheticLambda7
            @Override // kotlin.jvm.functions.Function3
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                return ProfileScreenKt.ProfileScreen$lambda$36$lambda$35$lambda$32($isLandscape, $conversationText, $context, $showResetDialog$delegate, (LazyItemScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
            }
        }), 3, null);
        LazyListScope.item$default(LazyColumn, null, null, ComposableLambdaKt.composableLambdaInstance(-1212941601, true, new Function3() { // from class: com.luchime.huiyuan.ui.ProfileScreenKt$$ExternalSyntheticLambda8
            @Override // kotlin.jvm.functions.Function3
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                return ProfileScreenKt.ProfileScreen$lambda$36$lambda$35$lambda$34($isLandscape, $lexiconCount, $dimensionCount, $entriesPerDimension, (LazyItemScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
            }
        }), 3, null);
        return Unit.INSTANCE;
    }

    static final Unit ProfileScreen$lambda$36$lambda$35$lambda$4(boolean $isLandscape, LazyItemScope item, Composer $composer, int $changed) {
        Intrinsics.checkNotNullParameter(item, "$this$item");
        ComposerKt.sourceInformation($composer, "C72@2675L243:ProfileScreen.kt#cyjvf");
        if (!$composer.shouldExecute(($changed & 17) != 16, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1120736164, $changed, -1, "com.luchime.huiyuan.ui.ProfileScreen.<anonymous>.<anonymous>.<anonymous> (ProfileScreen.kt:72)");
            }
            HuiyuanDesignKt.m7415ScreenHeaderfWhpE4E("YOUR COGNITIVE MAP", "我的认知地图", "你问过的问题、留下的句子，会慢慢组成一张只属于你的地图。", HuiyuanDesignKt.getSignalBlue(), $isLandscape, null, $composer, 3510, 32);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    static final Unit ProfileScreen$lambda$36$lambda$35$lambda$15(boolean $isLandscape, final LexiconEntry $dailyQuote, final AIModel $dailyQuoteModel, final String $askName, final Function0 $onAskDaily, final Context $context, LazyItemScope item, Composer $composer, int $changed) {
        Intrinsics.checkNotNullParameter(item, "$this$item");
        ComposerKt.sourceInformation($composer, "C82@2957L327,97@3486L2825,92@3297L3014:ProfileScreen.kt#cyjvf");
        if (!$composer.shouldExecute(($changed & 17) != 16, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(115043035, $changed, -1, "com.luchime.huiyuan.ui.ProfileScreen.<anonymous>.<anonymous>.<anonymous> (ProfileScreen.kt:82)");
            }
            TextKt.m2820Text4IGK_g("今日一句", PaddingKt.m726paddingVpY3zN4(Modifier.INSTANCE, Dp.m6973constructorimpl(17), $isLandscape ? Dp.m6973constructorimpl(8) : Dp.m6973constructorimpl(14)), HuiyuanDesignKt.getInk(), TextUnitKt.getSp(15), (FontStyle) null, FontWeight.INSTANCE.getBlack(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, $composer, 200070, 0, 131024);
            HuiyuanDesignKt.m7414RetroCard3IgeMak(PaddingKt.m727paddingVpY3zN4$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), Dp.m6973constructorimpl(16), 0.0f, 2, null), HuiyuanDesignKt.getSignalYellow(), ComposableLambdaKt.rememberComposableLambda(-722980987, true, new Function3() { // from class: com.luchime.huiyuan.ui.ProfileScreenKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    return ProfileScreenKt.ProfileScreen$lambda$36$lambda$35$lambda$15$lambda$14($dailyQuote, $dailyQuoteModel, $askName, $onAskDaily, $context, (BoxScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
                }
            }, $composer, 54), $composer, 438, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x082c  */
    /* JADX WARN: Code duplicated, block: B:104:0x087e  */
    /* JADX WARN: Code duplicated, block: B:28:0x01d4  */
    /* JADX WARN: Code duplicated, block: B:31:0x01e0  */
    /* JADX WARN: Code duplicated, block: B:32:0x01e6  */
    /* JADX WARN: Code duplicated, block: B:43:0x0303  */
    /* JADX WARN: Code duplicated, block: B:46:0x030f  */
    /* JADX WARN: Code duplicated, block: B:47:0x0315  */
    /* JADX WARN: Code duplicated, block: B:58:0x048e  */
    /* JADX WARN: Code duplicated, block: B:61:0x049a  */
    /* JADX WARN: Code duplicated, block: B:62:0x04a0  */
    /* JADX WARN: Code duplicated, block: B:73:0x06d4  */
    /* JADX WARN: Code duplicated, block: B:76:0x06e0  */
    /* JADX WARN: Code duplicated, block: B:77:0x06e6  */
    /* JADX WARN: Code duplicated, block: B:80:0x0717  */
    /* JADX WARN: Code duplicated, block: B:83:0x072a  */
    /* JADX WARN: Code duplicated, block: B:84:0x072d  */
    /* JADX WARN: Code duplicated, block: B:88:0x07c0  */
    /* JADX WARN: Code duplicated, block: B:91:0x07cb  */
    /* JADX WARN: Code duplicated, block: B:92:0x07ce  */
    /* JADX WARN: Code duplicated, block: B:96:0x0820  */
    static final Unit ProfileScreen$lambda$36$lambda$35$lambda$15$lambda$14(final LexiconEntry $dailyQuote, final AIModel $dailyQuoteModel, String $askName, Function0 $onAskDaily, final Context $context, BoxScope RetroCard, Composer $composer, int $changed) {
        Function0<ComposeUiNode> function0;
        Composer composer;
        Composer composer2;
        int currentCompositeKeyHash;
        Function0<ComposeUiNode> constructor;
        Function0<ComposeUiNode> function1;
        Composer composerM3808constructorimpl;
        int currentCompositeKeyHash2;
        Function0<ComposeUiNode> constructor2;
        Function0<ComposeUiNode> function2;
        Composer composerM3808constructorimpl2;
        int currentCompositeKeyHash3;
        Function0<ComposeUiNode> constructor3;
        Function0<ComposeUiNode> function3;
        Composer composerM3808constructorimpl3;
        int currentCompositeKeyHash4;
        Function0<ComposeUiNode> constructor4;
        Function0<ComposeUiNode> function4;
        Composer composerM3808constructorimpl4;
        int i;
        Composer composer3;
        Composer composer4;
        boolean zChangedInstance;
        Object objRememberedValue;
        Composer composer5;
        Composer composer6;
        boolean zChangedInstance2;
        Object objRememberedValue2;
        Composer composer7;
        Intrinsics.checkNotNullParameter(RetroCard, "$this$RetroCard");
        ComposerKt.sourceInformation($composer, "C98@3504L2793:ProfileScreen.kt#cyjvf");
        if (!$composer.shouldExecute(($changed & 17) != 16, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-722980987, $changed, -1, "com.luchime.huiyuan.ui.ProfileScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous> (ProfileScreen.kt:98)");
            }
            ComposerKt.sourceInformationMarkerStart($composer, -483455358, "CC(Column)P(2,3,1)87@4442L61,88@4508L133:Column.kt#2w3rfo");
            Modifier modifier = Modifier.INSTANCE;
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), $composer, ((0 >> 3) & 14) | ((0 >> 3) & 112));
            ComposerKt.sourceInformationMarkerStart($composer, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
            int currentCompositeKeyHash5 = ComposablesKt.getCurrentCompositeKeyHash($composer, 0);
            CompositionLocalMap currentCompositionLocalMap = $composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier($composer, modifier);
            Function0<ComposeUiNode> constructor5 = ComposeUiNode.INSTANCE.getConstructor();
            int i2 = ((((0 << 3) & 112) << 6) & 896) | 6;
            ComposerKt.sourceInformationMarkerStart($composer, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
            if (!($composer.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            $composer.startReusableNode();
            if ($composer.getInserting()) {
                function0 = constructor5;
                $composer.createNode(function0);
            } else {
                function0 = constructor5;
                $composer.useNode();
            }
            Composer composerM3808constructorimpl5 = Updater.m3808constructorimpl($composer);
            Updater.m3815setimpl(composerM3808constructorimpl5, measurePolicyColumnMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m3815setimpl(composerM3808constructorimpl5, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (composerM3808constructorimpl5.getInserting()) {
                composer = $composer;
            } else {
                composer = $composer;
                if (!Intrinsics.areEqual(composerM3808constructorimpl5.rememberedValue(), Integer.valueOf(currentCompositeKeyHash5))) {
                }
                Updater.m3815setimpl(composerM3808constructorimpl5, modifierMaterializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
                int i3 = (i2 >> 6) & 14;
                composer2 = composer;
                ComposerKt.sourceInformationMarkerStart(composer2, -384672921, "C89@4556L9:Column.kt#2w3rfo");
                ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                int i4 = ((0 >> 6) & 112) | 6;
                ComposerKt.sourceInformationMarkerStart(composer2, 369661678, "C99@3533L1773,134@5327L30,135@5378L259,142@5658L30,143@5709L570:ProfileScreen.kt#cyjvf");
                Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
                Arrangement.Horizontal spaceBetween = Arrangement.INSTANCE.getSpaceBetween();
                Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
                ComposerKt.sourceInformationMarkerStart(composer2, 693286680, "CC(Row)P(2,1,3)99@5124L58,100@5187L130:Row.kt#2w3rfo");
                MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(spaceBetween, centerVertically, composer2, ((438 >> 3) & 14) | ((438 >> 3) & 112));
                ComposerKt.sourceInformationMarkerStart(composer2, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                CompositionLocalMap currentCompositionLocalMap2 = composer2.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composer2, modifierFillMaxWidth$default);
                constructor = ComposeUiNode.INSTANCE.getConstructor();
                int i5 = ((((438 << 3) & 112) << 6) & 896) | 6;
                ComposerKt.sourceInformationMarkerStart(composer2, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
                if (!(composer2.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composer2.startReusableNode();
                if (composer2.getInserting()) {
                    function1 = constructor;
                    composer2.createNode(function1);
                } else {
                    function1 = constructor;
                    composer2.useNode();
                }
                composerM3808constructorimpl = Updater.m3808constructorimpl(composer2);
                Updater.m3815setimpl(composerM3808constructorimpl, measurePolicyRowMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m3815setimpl(composerM3808constructorimpl, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                if (!composerM3808constructorimpl.getInserting() || !Intrinsics.areEqual(composerM3808constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    composerM3808constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    composerM3808constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash2);
                }
                Updater.m3815setimpl(composerM3808constructorimpl, modifierMaterializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
                int i6 = (i5 >> 6) & 14;
                ComposerKt.sourceInformationMarkerStart(composer2, -407735110, "C101@5232L9:Row.kt#2w3rfo");
                RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                int i7 = ((438 >> 6) & 112) | 6;
                ComposerKt.sourceInformationMarkerStart(composer2, 1250663887, "C104@3791L1420,132@5236L48:ProfileScreen.kt#cyjvf");
                Alignment.Vertical centerVertically2 = Alignment.INSTANCE.getCenterVertically();
                Arrangement.Horizontal horizontalM606spacedBy0680j_4 = Arrangement.INSTANCE.m606spacedBy0680j_4(Dp.m6973constructorimpl(9));
                ComposerKt.sourceInformationMarkerStart(composer2, 693286680, "CC(Row)P(2,1,3)99@5124L58,100@5187L130:Row.kt#2w3rfo");
                Modifier modifier2 = Modifier.INSTANCE;
                MeasurePolicy measurePolicyRowMeasurePolicy2 = RowKt.rowMeasurePolicy(horizontalM606spacedBy0680j_4, centerVertically2, composer2, ((432 >> 3) & 14) | ((432 >> 3) & 112));
                ComposerKt.sourceInformationMarkerStart(composer2, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                CompositionLocalMap currentCompositionLocalMap3 = composer2.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier(composer2, modifier2);
                constructor2 = ComposeUiNode.INSTANCE.getConstructor();
                int i8 = ((((432 << 3) & 112) << 6) & 896) | 6;
                ComposerKt.sourceInformationMarkerStart(composer2, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
                if (!(composer2.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composer2.startReusableNode();
                if (composer2.getInserting()) {
                    function2 = constructor2;
                    composer2.createNode(function2);
                } else {
                    function2 = constructor2;
                    composer2.useNode();
                }
                composerM3808constructorimpl2 = Updater.m3808constructorimpl(composer2);
                Updater.m3815setimpl(composerM3808constructorimpl2, measurePolicyRowMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m3815setimpl(composerM3808constructorimpl2, currentCompositionLocalMap3, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                if (!composerM3808constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM3808constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                    composerM3808constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                    composerM3808constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash3);
                }
                Updater.m3815setimpl(composerM3808constructorimpl2, modifierMaterializeModifier3, ComposeUiNode.INSTANCE.getSetModifier());
                int i9 = (i8 >> 6) & 14;
                ComposerKt.sourceInformationMarkerStart(composer2, -407735110, "C101@5232L9:Row.kt#2w3rfo");
                RowScopeInstance rowScopeInstance2 = RowScopeInstance.INSTANCE;
                int i10 = ((432 >> 6) & 112) | 6;
                ComposerKt.sourceInformationMarkerStart(composer2, 646513990, "C109@4056L42,108@4007L501,117@4537L648:ProfileScreen.kt#cyjvf");
                ImageKt.Image(PainterResources_androidKt.painterResource($dailyQuoteModel.getAvatarRes(), composer2, 0), $dailyQuoteModel.getShortName() + "头像", BorderKt.m245borderxT4_qwU(ClipKt.clip(SizeKt.m772size3ABfNKs(Modifier.INSTANCE, Dp.m6973constructorimpl(38)), RoundedCornerShapeKt.getCircleShape()), Dp.m6973constructorimpl((float) 1.5d), HuiyuanDesignKt.getInk(), RoundedCornerShapeKt.getCircleShape()), (Alignment) null, ContentScale.INSTANCE.getCrop(), 0.0f, (ColorFilter) null, composer2, 24576, LocationRequestCompat.QUALITY_LOW_POWER);
                ComposerKt.sourceInformationMarkerStart(composer2, -483455358, "CC(Column)P(2,3,1)87@4442L61,88@4508L133:Column.kt#2w3rfo");
                Modifier modifier3 = Modifier.INSTANCE;
                MeasurePolicy measurePolicyColumnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer2, ((0 >> 3) & 14) | ((0 >> 3) & 112));
                ComposerKt.sourceInformationMarkerStart(composer2, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                CompositionLocalMap currentCompositionLocalMap4 = composer2.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier4 = ComposedModifierKt.materializeModifier(composer2, modifier3);
                constructor3 = ComposeUiNode.INSTANCE.getConstructor();
                int i11 = ((((0 << 3) & 112) << 6) & 896) | 6;
                ComposerKt.sourceInformationMarkerStart(composer2, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
                if (!(composer2.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composer2.startReusableNode();
                if (composer2.getInserting()) {
                    function3 = constructor3;
                    composer2.createNode(function3);
                } else {
                    function3 = constructor3;
                    composer2.useNode();
                }
                composerM3808constructorimpl3 = Updater.m3808constructorimpl(composer2);
                Updater.m3815setimpl(composerM3808constructorimpl3, measurePolicyColumnMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m3815setimpl(composerM3808constructorimpl3, currentCompositionLocalMap4, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash4 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                if (!composerM3808constructorimpl3.getInserting() || !Intrinsics.areEqual(composerM3808constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                    composerM3808constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                    composerM3808constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash4);
                }
                Updater.m3815setimpl(composerM3808constructorimpl3, modifierMaterializeModifier4, ComposeUiNode.INSTANCE.getSetModifier());
                int i12 = (i11 >> 6) & 14;
                ComposerKt.sourceInformationMarkerStart(composer2, -384672921, "C89@4556L9:Column.kt#2w3rfo");
                ColumnScopeInstance columnScopeInstance2 = ColumnScopeInstance.INSTANCE;
                int i13 = ((0 >> 6) & 112) | 6;
                ComposerKt.sourceInformationMarkerStart(composer2, -2112592183, "C118@4578L278,124@4889L266:ProfileScreen.kt#cyjvf");
                TextKt.m2820Text4IGK_g($dailyQuoteModel.getShortName(), (Modifier) null, HuiyuanDesignKt.getInk(), TextUnitKt.getSp(14), (FontStyle) null, FontWeight.INSTANCE.getBlack(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, 200064, 0, 131026);
                TextKt.m2820Text4IGK_g("今日分享角色", (Modifier) null, HuiyuanDesignKt.getMutedText(), TextUnitKt.getSp(10), (FontStyle) null, FontWeight.INSTANCE.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, 200070, 0, 131026);
                ComposerKt.sourceInformationMarkerEnd(composer2);
                ComposerKt.sourceInformationMarkerEnd(composer2);
                composer2.endNode();
                ComposerKt.sourceInformationMarkerEnd(composer2);
                ComposerKt.sourceInformationMarkerEnd(composer2);
                ComposerKt.sourceInformationMarkerEnd(composer2);
                ComposerKt.sourceInformationMarkerEnd(composer2);
                ComposerKt.sourceInformationMarkerEnd(composer2);
                composer2.endNode();
                ComposerKt.sourceInformationMarkerEnd(composer2);
                ComposerKt.sourceInformationMarkerEnd(composer2);
                ComposerKt.sourceInformationMarkerEnd(composer2);
                HuiyuanDesignKt.m7413CategoryBadgeiJQMabo($dailyQuote.getCategory(), HuiyuanDesignKt.getSignalPurple(), composer2, 48, 0);
                ComposerKt.sourceInformationMarkerEnd(composer2);
                ComposerKt.sourceInformationMarkerEnd(composer2);
                composer2.endNode();
                ComposerKt.sourceInformationMarkerEnd(composer2);
                ComposerKt.sourceInformationMarkerEnd(composer2);
                ComposerKt.sourceInformationMarkerEnd(composer2);
                SpacerKt.Spacer(SizeKt.m758height3ABfNKs(Modifier.INSTANCE, Dp.m6973constructorimpl(10)), composer2, 6);
                TextKt.m2820Text4IGK_g("“" + $dailyQuote.getText() + "”", (Modifier) null, HuiyuanDesignKt.getInk(), TextUnitKt.getSp(17), (FontStyle) null, FontWeight.INSTANCE.getBlack(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, TextUnitKt.getSp(27), 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, 200064, 6, 130002);
                SpacerKt.Spacer(SizeKt.m758height3ABfNKs(Modifier.INSTANCE, Dp.m6973constructorimpl(12)), composer2, 6);
                Arrangement.Horizontal horizontalM606spacedBy0680j_5 = Arrangement.INSTANCE.m606spacedBy0680j_4(Dp.m6973constructorimpl(8));
                ComposerKt.sourceInformationMarkerStart(composer2, 693286680, "CC(Row)P(2,1,3)99@5124L58,100@5187L130:Row.kt#2w3rfo");
                Modifier modifier4 = Modifier.INSTANCE;
                MeasurePolicy measurePolicyRowMeasurePolicy3 = RowKt.rowMeasurePolicy(horizontalM606spacedBy0680j_5, Alignment.INSTANCE.getTop(), composer2, ((48 >> 3) & 14) | ((48 >> 3) & 112));
                ComposerKt.sourceInformationMarkerStart(composer2, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                currentCompositeKeyHash4 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                CompositionLocalMap currentCompositionLocalMap5 = composer2.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier5 = ComposedModifierKt.materializeModifier(composer2, modifier4);
                constructor4 = ComposeUiNode.INSTANCE.getConstructor();
                int i14 = ((((48 << 3) & 112) << 6) & 896) | 6;
                ComposerKt.sourceInformationMarkerStart(composer2, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
                if (!(composer2.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composer2.startReusableNode();
                if (composer2.getInserting()) {
                    function4 = constructor4;
                    composer2.createNode(function4);
                } else {
                    function4 = constructor4;
                    composer2.useNode();
                }
                composerM3808constructorimpl4 = Updater.m3808constructorimpl(composer2);
                Updater.m3815setimpl(composerM3808constructorimpl4, measurePolicyRowMeasurePolicy3, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m3815setimpl(composerM3808constructorimpl4, currentCompositionLocalMap5, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash5 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                if (composerM3808constructorimpl4.getInserting()) {
                    i = 48;
                    composer3 = composer2;
                } else {
                    i = 48;
                    composer3 = composer2;
                    if (!Intrinsics.areEqual(composerM3808constructorimpl4.rememberedValue(), Integer.valueOf(currentCompositeKeyHash4))) {
                    }
                    Updater.m3815setimpl(composerM3808constructorimpl4, modifierMaterializeModifier5, ComposeUiNode.INSTANCE.getSetModifier());
                    int i15 = (i14 >> 6) & 14;
                    composer4 = composer3;
                    ComposerKt.sourceInformationMarkerStart(composer4, -407735110, "C101@5232L9:Row.kt#2w3rfo");
                    RowScopeInstance rowScopeInstance3 = RowScopeInstance.INSTANCE;
                    int i16 = ((i >> 6) & 112) | 6;
                    ComposerKt.sourceInformationMarkerStart(composer4, 956647899, "C144@5791L50,145@5899L38,145@5866L71,146@5995L262,146@5962L295:ProfileScreen.kt#cyjvf");
                    m7418ProfileActioniJQMabo("问" + $askName, HuiyuanDesignKt.getSignalPink(), $onAskDaily, composer4, 48);
                    long jM4403getWhite0d7_KjU = Color.INSTANCE.m4403getWhite0d7_KjU();
                    ComposerKt.sourceInformationMarkerStart(composer4, -1631705348, "CC(remember):ProfileScreen.kt#9igjgp");
                    zChangedInstance = composer4.changedInstance($context) | composer4.changedInstance($dailyQuote);
                    objRememberedValue = composer4.rememberedValue();
                    if (!zChangedInstance) {
                        composer5 = composer4;
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        }
                        ComposerKt.sourceInformationMarkerEnd(composer5);
                        composer6 = composer5;
                        m7418ProfileActioniJQMabo("复制", jM4403getWhite0d7_KjU, (Function0) objRememberedValue, composer6, 54);
                        long jM4403getWhite0d7_KjU2 = Color.INSTANCE.m4403getWhite0d7_KjU();
                        ComposerKt.sourceInformationMarkerStart(composer6, -1631702052, "CC(remember):ProfileScreen.kt#9igjgp");
                        zChangedInstance2 = composer6.changedInstance($context) | composer6.changed($dailyQuoteModel.ordinal()) | composer6.changedInstance($dailyQuote);
                        objRememberedValue2 = composer6.rememberedValue();
                        if (!zChangedInstance2) {
                            if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                            }
                            composer7 = composer6;
                            ComposerKt.sourceInformationMarkerEnd(composer7);
                            m7418ProfileActioniJQMabo("分享", jM4403getWhite0d7_KjU2, (Function0) objRememberedValue2, composer7, 54);
                            ComposerKt.sourceInformationMarkerEnd(composer7);
                            ComposerKt.sourceInformationMarkerEnd(composer4);
                            composer3.endNode();
                            ComposerKt.sourceInformationMarkerEnd(composer3);
                            ComposerKt.sourceInformationMarkerEnd(composer3);
                            ComposerKt.sourceInformationMarkerEnd(composer3);
                            ComposerKt.sourceInformationMarkerEnd(composer2);
                            ComposerKt.sourceInformationMarkerEnd(composer2);
                            composer.endNode();
                            ComposerKt.sourceInformationMarkerEnd(composer);
                            ComposerKt.sourceInformationMarkerEnd(composer);
                            ComposerKt.sourceInformationMarkerEnd(composer);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        } else {
                            composer7 = composer6;
                        }
                        composer7 = composer6;
                        objRememberedValue2 = new Function0() { // from class: com.luchime.huiyuan.ui.ProfileScreenKt$$ExternalSyntheticLambda22
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return ProfileScreenKt.ProfileScreen$lambda$36$lambda$35$lambda$15$lambda$14$lambda$13$lambda$12$lambda$11$lambda$10($context, $dailyQuoteModel, $dailyQuote);
                            }
                        };
                        composer6.updateRememberedValue(objRememberedValue2);
                        composer7 = composer6;
                        ComposerKt.sourceInformationMarkerEnd(composer7);
                        m7418ProfileActioniJQMabo("分享", jM4403getWhite0d7_KjU2, (Function0) objRememberedValue2, composer7, 54);
                        ComposerKt.sourceInformationMarkerEnd(composer7);
                        ComposerKt.sourceInformationMarkerEnd(composer4);
                        composer3.endNode();
                        ComposerKt.sourceInformationMarkerEnd(composer3);
                        ComposerKt.sourceInformationMarkerEnd(composer3);
                        ComposerKt.sourceInformationMarkerEnd(composer3);
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        composer.endNode();
                        ComposerKt.sourceInformationMarkerEnd(composer);
                        ComposerKt.sourceInformationMarkerEnd(composer);
                        ComposerKt.sourceInformationMarkerEnd(composer);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    } else {
                        composer5 = composer4;
                    }
                    objRememberedValue = new Function0() { // from class: com.luchime.huiyuan.ui.ProfileScreenKt$$ExternalSyntheticLambda21
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return ProfileScreenKt.ProfileScreen$lambda$36$lambda$35$lambda$15$lambda$14$lambda$13$lambda$12$lambda$9$lambda$8($context, $dailyQuote);
                        }
                    };
                    composer4.updateRememberedValue(objRememberedValue);
                    ComposerKt.sourceInformationMarkerEnd(composer5);
                    composer6 = composer5;
                    m7418ProfileActioniJQMabo("复制", jM4403getWhite0d7_KjU, (Function0) objRememberedValue, composer6, 54);
                    long jM4403getWhite0d7_KjU3 = Color.INSTANCE.m4403getWhite0d7_KjU();
                    ComposerKt.sourceInformationMarkerStart(composer6, -1631702052, "CC(remember):ProfileScreen.kt#9igjgp");
                    zChangedInstance2 = composer6.changedInstance($context) | composer6.changed($dailyQuoteModel.ordinal()) | composer6.changedInstance($dailyQuote);
                    objRememberedValue2 = composer6.rememberedValue();
                    if (!zChangedInstance2) {
                        if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                        }
                        composer7 = composer6;
                        ComposerKt.sourceInformationMarkerEnd(composer7);
                        m7418ProfileActioniJQMabo("分享", jM4403getWhite0d7_KjU3, (Function0) objRememberedValue2, composer7, 54);
                        ComposerKt.sourceInformationMarkerEnd(composer7);
                        ComposerKt.sourceInformationMarkerEnd(composer4);
                        composer3.endNode();
                        ComposerKt.sourceInformationMarkerEnd(composer3);
                        ComposerKt.sourceInformationMarkerEnd(composer3);
                        ComposerKt.sourceInformationMarkerEnd(composer3);
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        composer.endNode();
                        ComposerKt.sourceInformationMarkerEnd(composer);
                        ComposerKt.sourceInformationMarkerEnd(composer);
                        ComposerKt.sourceInformationMarkerEnd(composer);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    } else {
                        composer7 = composer6;
                    }
                    composer7 = composer6;
                    objRememberedValue2 = new Function0() { // from class: com.luchime.huiyuan.ui.ProfileScreenKt$$ExternalSyntheticLambda22
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return ProfileScreenKt.ProfileScreen$lambda$36$lambda$35$lambda$15$lambda$14$lambda$13$lambda$12$lambda$11$lambda$10($context, $dailyQuoteModel, $dailyQuote);
                        }
                    };
                    composer6.updateRememberedValue(objRememberedValue2);
                    composer7 = composer6;
                    ComposerKt.sourceInformationMarkerEnd(composer7);
                    m7418ProfileActioniJQMabo("分享", jM4403getWhite0d7_KjU3, (Function0) objRememberedValue2, composer7, 54);
                    ComposerKt.sourceInformationMarkerEnd(composer7);
                    ComposerKt.sourceInformationMarkerEnd(composer4);
                    composer3.endNode();
                    ComposerKt.sourceInformationMarkerEnd(composer3);
                    ComposerKt.sourceInformationMarkerEnd(composer3);
                    ComposerKt.sourceInformationMarkerEnd(composer3);
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    composer.endNode();
                    ComposerKt.sourceInformationMarkerEnd(composer);
                    ComposerKt.sourceInformationMarkerEnd(composer);
                    ComposerKt.sourceInformationMarkerEnd(composer);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
                composerM3808constructorimpl4.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash4));
                composerM3808constructorimpl4.apply(Integer.valueOf(currentCompositeKeyHash4), setCompositeKeyHash5);
                Updater.m3815setimpl(composerM3808constructorimpl4, modifierMaterializeModifier5, ComposeUiNode.INSTANCE.getSetModifier());
                int i17 = (i14 >> 6) & 14;
                composer4 = composer3;
                ComposerKt.sourceInformationMarkerStart(composer4, -407735110, "C101@5232L9:Row.kt#2w3rfo");
                RowScopeInstance rowScopeInstance4 = RowScopeInstance.INSTANCE;
                int i18 = ((i >> 6) & 112) | 6;
                ComposerKt.sourceInformationMarkerStart(composer4, 956647899, "C144@5791L50,145@5899L38,145@5866L71,146@5995L262,146@5962L295:ProfileScreen.kt#cyjvf");
                m7418ProfileActioniJQMabo("问" + $askName, HuiyuanDesignKt.getSignalPink(), $onAskDaily, composer4, 48);
                long jM4403getWhite0d7_KjU4 = Color.INSTANCE.m4403getWhite0d7_KjU();
                ComposerKt.sourceInformationMarkerStart(composer4, -1631705348, "CC(remember):ProfileScreen.kt#9igjgp");
                zChangedInstance = composer4.changedInstance($context) | composer4.changedInstance($dailyQuote);
                objRememberedValue = composer4.rememberedValue();
                if (!zChangedInstance) {
                    composer5 = composer4;
                    if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    }
                    ComposerKt.sourceInformationMarkerEnd(composer5);
                    composer6 = composer5;
                    m7418ProfileActioniJQMabo("复制", jM4403getWhite0d7_KjU4, (Function0) objRememberedValue, composer6, 54);
                    long jM4403getWhite0d7_KjU5 = Color.INSTANCE.m4403getWhite0d7_KjU();
                    ComposerKt.sourceInformationMarkerStart(composer6, -1631702052, "CC(remember):ProfileScreen.kt#9igjgp");
                    zChangedInstance2 = composer6.changedInstance($context) | composer6.changed($dailyQuoteModel.ordinal()) | composer6.changedInstance($dailyQuote);
                    objRememberedValue2 = composer6.rememberedValue();
                    if (!zChangedInstance2) {
                        if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                        }
                        composer7 = composer6;
                        ComposerKt.sourceInformationMarkerEnd(composer7);
                        m7418ProfileActioniJQMabo("分享", jM4403getWhite0d7_KjU5, (Function0) objRememberedValue2, composer7, 54);
                        ComposerKt.sourceInformationMarkerEnd(composer7);
                        ComposerKt.sourceInformationMarkerEnd(composer4);
                        composer3.endNode();
                        ComposerKt.sourceInformationMarkerEnd(composer3);
                        ComposerKt.sourceInformationMarkerEnd(composer3);
                        ComposerKt.sourceInformationMarkerEnd(composer3);
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        composer.endNode();
                        ComposerKt.sourceInformationMarkerEnd(composer);
                        ComposerKt.sourceInformationMarkerEnd(composer);
                        ComposerKt.sourceInformationMarkerEnd(composer);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    } else {
                        composer7 = composer6;
                    }
                    composer7 = composer6;
                    objRememberedValue2 = new Function0() { // from class: com.luchime.huiyuan.ui.ProfileScreenKt$$ExternalSyntheticLambda22
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return ProfileScreenKt.ProfileScreen$lambda$36$lambda$35$lambda$15$lambda$14$lambda$13$lambda$12$lambda$11$lambda$10($context, $dailyQuoteModel, $dailyQuote);
                        }
                    };
                    composer6.updateRememberedValue(objRememberedValue2);
                    composer7 = composer6;
                    ComposerKt.sourceInformationMarkerEnd(composer7);
                    m7418ProfileActioniJQMabo("分享", jM4403getWhite0d7_KjU5, (Function0) objRememberedValue2, composer7, 54);
                    ComposerKt.sourceInformationMarkerEnd(composer7);
                    ComposerKt.sourceInformationMarkerEnd(composer4);
                    composer3.endNode();
                    ComposerKt.sourceInformationMarkerEnd(composer3);
                    ComposerKt.sourceInformationMarkerEnd(composer3);
                    ComposerKt.sourceInformationMarkerEnd(composer3);
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    composer.endNode();
                    ComposerKt.sourceInformationMarkerEnd(composer);
                    ComposerKt.sourceInformationMarkerEnd(composer);
                    ComposerKt.sourceInformationMarkerEnd(composer);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer5 = composer4;
                }
                objRememberedValue = new Function0() { // from class: com.luchime.huiyuan.ui.ProfileScreenKt$$ExternalSyntheticLambda21
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return ProfileScreenKt.ProfileScreen$lambda$36$lambda$35$lambda$15$lambda$14$lambda$13$lambda$12$lambda$9$lambda$8($context, $dailyQuote);
                    }
                };
                composer4.updateRememberedValue(objRememberedValue);
                ComposerKt.sourceInformationMarkerEnd(composer5);
                composer6 = composer5;
                m7418ProfileActioniJQMabo("复制", jM4403getWhite0d7_KjU4, (Function0) objRememberedValue, composer6, 54);
                long jM4403getWhite0d7_KjU6 = Color.INSTANCE.m4403getWhite0d7_KjU();
                ComposerKt.sourceInformationMarkerStart(composer6, -1631702052, "CC(remember):ProfileScreen.kt#9igjgp");
                zChangedInstance2 = composer6.changedInstance($context) | composer6.changed($dailyQuoteModel.ordinal()) | composer6.changedInstance($dailyQuote);
                objRememberedValue2 = composer6.rememberedValue();
                if (!zChangedInstance2) {
                    if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    }
                    composer7 = composer6;
                    ComposerKt.sourceInformationMarkerEnd(composer7);
                    m7418ProfileActioniJQMabo("分享", jM4403getWhite0d7_KjU6, (Function0) objRememberedValue2, composer7, 54);
                    ComposerKt.sourceInformationMarkerEnd(composer7);
                    ComposerKt.sourceInformationMarkerEnd(composer4);
                    composer3.endNode();
                    ComposerKt.sourceInformationMarkerEnd(composer3);
                    ComposerKt.sourceInformationMarkerEnd(composer3);
                    ComposerKt.sourceInformationMarkerEnd(composer3);
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    composer.endNode();
                    ComposerKt.sourceInformationMarkerEnd(composer);
                    ComposerKt.sourceInformationMarkerEnd(composer);
                    ComposerKt.sourceInformationMarkerEnd(composer);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer7 = composer6;
                }
                composer7 = composer6;
                objRememberedValue2 = new Function0() { // from class: com.luchime.huiyuan.ui.ProfileScreenKt$$ExternalSyntheticLambda22
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return ProfileScreenKt.ProfileScreen$lambda$36$lambda$35$lambda$15$lambda$14$lambda$13$lambda$12$lambda$11$lambda$10($context, $dailyQuoteModel, $dailyQuote);
                    }
                };
                composer6.updateRememberedValue(objRememberedValue2);
                composer7 = composer6;
                ComposerKt.sourceInformationMarkerEnd(composer7);
                m7418ProfileActioniJQMabo("分享", jM4403getWhite0d7_KjU6, (Function0) objRememberedValue2, composer7, 54);
                ComposerKt.sourceInformationMarkerEnd(composer7);
                ComposerKt.sourceInformationMarkerEnd(composer4);
                composer3.endNode();
                ComposerKt.sourceInformationMarkerEnd(composer3);
                ComposerKt.sourceInformationMarkerEnd(composer3);
                ComposerKt.sourceInformationMarkerEnd(composer3);
                ComposerKt.sourceInformationMarkerEnd(composer2);
                ComposerKt.sourceInformationMarkerEnd(composer2);
                composer.endNode();
                ComposerKt.sourceInformationMarkerEnd(composer);
                ComposerKt.sourceInformationMarkerEnd(composer);
                ComposerKt.sourceInformationMarkerEnd(composer);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
            composerM3808constructorimpl5.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash5));
            composerM3808constructorimpl5.apply(Integer.valueOf(currentCompositeKeyHash5), setCompositeKeyHash);
            Updater.m3815setimpl(composerM3808constructorimpl5, modifierMaterializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
            int i19 = (i2 >> 6) & 14;
            composer2 = composer;
            ComposerKt.sourceInformationMarkerStart(composer2, -384672921, "C89@4556L9:Column.kt#2w3rfo");
            ColumnScopeInstance columnScopeInstance3 = ColumnScopeInstance.INSTANCE;
            int i20 = ((0 >> 6) & 112) | 6;
            ComposerKt.sourceInformationMarkerStart(composer2, 369661678, "C99@3533L1773,134@5327L30,135@5378L259,142@5658L30,143@5709L570:ProfileScreen.kt#cyjvf");
            Modifier modifierFillMaxWidth$default2 = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
            Arrangement.Horizontal spaceBetween2 = Arrangement.INSTANCE.getSpaceBetween();
            Alignment.Vertical centerVertically3 = Alignment.INSTANCE.getCenterVertically();
            ComposerKt.sourceInformationMarkerStart(composer2, 693286680, "CC(Row)P(2,1,3)99@5124L58,100@5187L130:Row.kt#2w3rfo");
            MeasurePolicy measurePolicyRowMeasurePolicy4 = RowKt.rowMeasurePolicy(spaceBetween2, centerVertically3, composer2, ((438 >> 3) & 14) | ((438 >> 3) & 112));
            ComposerKt.sourceInformationMarkerStart(composer2, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
            currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
            CompositionLocalMap currentCompositionLocalMap6 = composer2.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier6 = ComposedModifierKt.materializeModifier(composer2, modifierFillMaxWidth$default2);
            constructor = ComposeUiNode.INSTANCE.getConstructor();
            int i21 = ((((438 << 3) & 112) << 6) & 896) | 6;
            ComposerKt.sourceInformationMarkerStart(composer2, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
            if (!(composer2.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composer2.startReusableNode();
            if (composer2.getInserting()) {
                function1 = constructor;
                composer2.createNode(function1);
            } else {
                function1 = constructor;
                composer2.useNode();
            }
            composerM3808constructorimpl = Updater.m3808constructorimpl(composer2);
            Updater.m3815setimpl(composerM3808constructorimpl, measurePolicyRowMeasurePolicy4, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m3815setimpl(composerM3808constructorimpl, currentCompositionLocalMap6, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash6 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (!composerM3808constructorimpl.getInserting()) {
            }
            composerM3808constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
            composerM3808constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash6);
            Updater.m3815setimpl(composerM3808constructorimpl, modifierMaterializeModifier6, ComposeUiNode.INSTANCE.getSetModifier());
            int i22 = (i21 >> 6) & 14;
            ComposerKt.sourceInformationMarkerStart(composer2, -407735110, "C101@5232L9:Row.kt#2w3rfo");
            RowScopeInstance rowScopeInstance5 = RowScopeInstance.INSTANCE;
            int i23 = ((438 >> 6) & 112) | 6;
            ComposerKt.sourceInformationMarkerStart(composer2, 1250663887, "C104@3791L1420,132@5236L48:ProfileScreen.kt#cyjvf");
            Alignment.Vertical centerVertically4 = Alignment.INSTANCE.getCenterVertically();
            Arrangement.Horizontal horizontalM606spacedBy0680j_6 = Arrangement.INSTANCE.m606spacedBy0680j_4(Dp.m6973constructorimpl(9));
            ComposerKt.sourceInformationMarkerStart(composer2, 693286680, "CC(Row)P(2,1,3)99@5124L58,100@5187L130:Row.kt#2w3rfo");
            Modifier modifier5 = Modifier.INSTANCE;
            MeasurePolicy measurePolicyRowMeasurePolicy5 = RowKt.rowMeasurePolicy(horizontalM606spacedBy0680j_6, centerVertically4, composer2, ((432 >> 3) & 14) | ((432 >> 3) & 112));
            ComposerKt.sourceInformationMarkerStart(composer2, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
            currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
            CompositionLocalMap currentCompositionLocalMap7 = composer2.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier7 = ComposedModifierKt.materializeModifier(composer2, modifier5);
            constructor2 = ComposeUiNode.INSTANCE.getConstructor();
            int i24 = ((((432 << 3) & 112) << 6) & 896) | 6;
            ComposerKt.sourceInformationMarkerStart(composer2, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
            if (!(composer2.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composer2.startReusableNode();
            if (composer2.getInserting()) {
                function2 = constructor2;
                composer2.createNode(function2);
            } else {
                function2 = constructor2;
                composer2.useNode();
            }
            composerM3808constructorimpl2 = Updater.m3808constructorimpl(composer2);
            Updater.m3815setimpl(composerM3808constructorimpl2, measurePolicyRowMeasurePolicy5, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m3815setimpl(composerM3808constructorimpl2, currentCompositionLocalMap7, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash7 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (!composerM3808constructorimpl2.getInserting()) {
            }
            composerM3808constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
            composerM3808constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash7);
            Updater.m3815setimpl(composerM3808constructorimpl2, modifierMaterializeModifier7, ComposeUiNode.INSTANCE.getSetModifier());
            int i25 = (i24 >> 6) & 14;
            ComposerKt.sourceInformationMarkerStart(composer2, -407735110, "C101@5232L9:Row.kt#2w3rfo");
            RowScopeInstance rowScopeInstance6 = RowScopeInstance.INSTANCE;
            int i110 = ((432 >> 6) & 112) | 6;
            ComposerKt.sourceInformationMarkerStart(composer2, 646513990, "C109@4056L42,108@4007L501,117@4537L648:ProfileScreen.kt#cyjvf");
            ImageKt.Image(PainterResources_androidKt.painterResource($dailyQuoteModel.getAvatarRes(), composer2, 0), $dailyQuoteModel.getShortName() + "头像", BorderKt.m245borderxT4_qwU(ClipKt.clip(SizeKt.m772size3ABfNKs(Modifier.INSTANCE, Dp.m6973constructorimpl(38)), RoundedCornerShapeKt.getCircleShape()), Dp.m6973constructorimpl((float) 1.5d), HuiyuanDesignKt.getInk(), RoundedCornerShapeKt.getCircleShape()), (Alignment) null, ContentScale.INSTANCE.getCrop(), 0.0f, (ColorFilter) null, composer2, 24576, LocationRequestCompat.QUALITY_LOW_POWER);
            ComposerKt.sourceInformationMarkerStart(composer2, -483455358, "CC(Column)P(2,3,1)87@4442L61,88@4508L133:Column.kt#2w3rfo");
            Modifier modifier6 = Modifier.INSTANCE;
            MeasurePolicy measurePolicyColumnMeasurePolicy3 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer2, ((0 >> 3) & 14) | ((0 >> 3) & 112));
            ComposerKt.sourceInformationMarkerStart(composer2, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
            currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
            CompositionLocalMap currentCompositionLocalMap8 = composer2.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier8 = ComposedModifierKt.materializeModifier(composer2, modifier6);
            constructor3 = ComposeUiNode.INSTANCE.getConstructor();
            int i111 = ((((0 << 3) & 112) << 6) & 896) | 6;
            ComposerKt.sourceInformationMarkerStart(composer2, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
            if (!(composer2.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composer2.startReusableNode();
            if (composer2.getInserting()) {
                function3 = constructor3;
                composer2.createNode(function3);
            } else {
                function3 = constructor3;
                composer2.useNode();
            }
            composerM3808constructorimpl3 = Updater.m3808constructorimpl(composer2);
            Updater.m3815setimpl(composerM3808constructorimpl3, measurePolicyColumnMeasurePolicy3, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m3815setimpl(composerM3808constructorimpl3, currentCompositionLocalMap8, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash8 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (!composerM3808constructorimpl3.getInserting()) {
            }
            composerM3808constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
            composerM3808constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash8);
            Updater.m3815setimpl(composerM3808constructorimpl3, modifierMaterializeModifier8, ComposeUiNode.INSTANCE.getSetModifier());
            int i112 = (i111 >> 6) & 14;
            ComposerKt.sourceInformationMarkerStart(composer2, -384672921, "C89@4556L9:Column.kt#2w3rfo");
            ColumnScopeInstance columnScopeInstance4 = ColumnScopeInstance.INSTANCE;
            int i113 = ((0 >> 6) & 112) | 6;
            ComposerKt.sourceInformationMarkerStart(composer2, -2112592183, "C118@4578L278,124@4889L266:ProfileScreen.kt#cyjvf");
            TextKt.m2820Text4IGK_g($dailyQuoteModel.getShortName(), (Modifier) null, HuiyuanDesignKt.getInk(), TextUnitKt.getSp(14), (FontStyle) null, FontWeight.INSTANCE.getBlack(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, 200064, 0, 131026);
            TextKt.m2820Text4IGK_g("今日分享角色", (Modifier) null, HuiyuanDesignKt.getMutedText(), TextUnitKt.getSp(10), (FontStyle) null, FontWeight.INSTANCE.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, 200070, 0, 131026);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            composer2.endNode();
            ComposerKt.sourceInformationMarkerEnd(composer2);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            composer2.endNode();
            ComposerKt.sourceInformationMarkerEnd(composer2);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            HuiyuanDesignKt.m7413CategoryBadgeiJQMabo($dailyQuote.getCategory(), HuiyuanDesignKt.getSignalPurple(), composer2, 48, 0);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            composer2.endNode();
            ComposerKt.sourceInformationMarkerEnd(composer2);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            SpacerKt.Spacer(SizeKt.m758height3ABfNKs(Modifier.INSTANCE, Dp.m6973constructorimpl(10)), composer2, 6);
            TextKt.m2820Text4IGK_g("“" + $dailyQuote.getText() + "”", (Modifier) null, HuiyuanDesignKt.getInk(), TextUnitKt.getSp(17), (FontStyle) null, FontWeight.INSTANCE.getBlack(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, TextUnitKt.getSp(27), 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, 200064, 6, 130002);
            SpacerKt.Spacer(SizeKt.m758height3ABfNKs(Modifier.INSTANCE, Dp.m6973constructorimpl(12)), composer2, 6);
            Arrangement.Horizontal horizontalM606spacedBy0680j_7 = Arrangement.INSTANCE.m606spacedBy0680j_4(Dp.m6973constructorimpl(8));
            ComposerKt.sourceInformationMarkerStart(composer2, 693286680, "CC(Row)P(2,1,3)99@5124L58,100@5187L130:Row.kt#2w3rfo");
            Modifier modifier7 = Modifier.INSTANCE;
            MeasurePolicy measurePolicyRowMeasurePolicy6 = RowKt.rowMeasurePolicy(horizontalM606spacedBy0680j_7, Alignment.INSTANCE.getTop(), composer2, ((48 >> 3) & 14) | ((48 >> 3) & 112));
            ComposerKt.sourceInformationMarkerStart(composer2, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
            currentCompositeKeyHash4 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
            CompositionLocalMap currentCompositionLocalMap9 = composer2.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier9 = ComposedModifierKt.materializeModifier(composer2, modifier7);
            constructor4 = ComposeUiNode.INSTANCE.getConstructor();
            int i114 = ((((48 << 3) & 112) << 6) & 896) | 6;
            ComposerKt.sourceInformationMarkerStart(composer2, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
            if (!(composer2.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composer2.startReusableNode();
            if (composer2.getInserting()) {
                function4 = constructor4;
                composer2.createNode(function4);
            } else {
                function4 = constructor4;
                composer2.useNode();
            }
            composerM3808constructorimpl4 = Updater.m3808constructorimpl(composer2);
            Updater.m3815setimpl(composerM3808constructorimpl4, measurePolicyRowMeasurePolicy6, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m3815setimpl(composerM3808constructorimpl4, currentCompositionLocalMap9, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash9 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (composerM3808constructorimpl4.getInserting()) {
                i = 48;
                composer3 = composer2;
                if (!Intrinsics.areEqual(composerM3808constructorimpl4.rememberedValue(), Integer.valueOf(currentCompositeKeyHash4))) {
                }
                Updater.m3815setimpl(composerM3808constructorimpl4, modifierMaterializeModifier9, ComposeUiNode.INSTANCE.getSetModifier());
                int i115 = (i114 >> 6) & 14;
                composer4 = composer3;
                ComposerKt.sourceInformationMarkerStart(composer4, -407735110, "C101@5232L9:Row.kt#2w3rfo");
                RowScopeInstance rowScopeInstance7 = RowScopeInstance.INSTANCE;
                int i116 = ((i >> 6) & 112) | 6;
                ComposerKt.sourceInformationMarkerStart(composer4, 956647899, "C144@5791L50,145@5899L38,145@5866L71,146@5995L262,146@5962L295:ProfileScreen.kt#cyjvf");
                m7418ProfileActioniJQMabo("问" + $askName, HuiyuanDesignKt.getSignalPink(), $onAskDaily, composer4, 48);
                long jM4403getWhite0d7_KjU7 = Color.INSTANCE.m4403getWhite0d7_KjU();
                ComposerKt.sourceInformationMarkerStart(composer4, -1631705348, "CC(remember):ProfileScreen.kt#9igjgp");
                zChangedInstance = composer4.changedInstance($context) | composer4.changedInstance($dailyQuote);
                objRememberedValue = composer4.rememberedValue();
                if (!zChangedInstance) {
                    composer5 = composer4;
                    if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    }
                    ComposerKt.sourceInformationMarkerEnd(composer5);
                    composer6 = composer5;
                    m7418ProfileActioniJQMabo("复制", jM4403getWhite0d7_KjU7, (Function0) objRememberedValue, composer6, 54);
                    long jM4403getWhite0d7_KjU8 = Color.INSTANCE.m4403getWhite0d7_KjU();
                    ComposerKt.sourceInformationMarkerStart(composer6, -1631702052, "CC(remember):ProfileScreen.kt#9igjgp");
                    zChangedInstance2 = composer6.changedInstance($context) | composer6.changed($dailyQuoteModel.ordinal()) | composer6.changedInstance($dailyQuote);
                    objRememberedValue2 = composer6.rememberedValue();
                    if (!zChangedInstance2) {
                        if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                        }
                        composer7 = composer6;
                        ComposerKt.sourceInformationMarkerEnd(composer7);
                        m7418ProfileActioniJQMabo("分享", jM4403getWhite0d7_KjU8, (Function0) objRememberedValue2, composer7, 54);
                        ComposerKt.sourceInformationMarkerEnd(composer7);
                        ComposerKt.sourceInformationMarkerEnd(composer4);
                        composer3.endNode();
                        ComposerKt.sourceInformationMarkerEnd(composer3);
                        ComposerKt.sourceInformationMarkerEnd(composer3);
                        ComposerKt.sourceInformationMarkerEnd(composer3);
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        composer.endNode();
                        ComposerKt.sourceInformationMarkerEnd(composer);
                        ComposerKt.sourceInformationMarkerEnd(composer);
                        ComposerKt.sourceInformationMarkerEnd(composer);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    } else {
                        composer7 = composer6;
                    }
                    composer7 = composer6;
                    objRememberedValue2 = new Function0() { // from class: com.luchime.huiyuan.ui.ProfileScreenKt$$ExternalSyntheticLambda22
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return ProfileScreenKt.ProfileScreen$lambda$36$lambda$35$lambda$15$lambda$14$lambda$13$lambda$12$lambda$11$lambda$10($context, $dailyQuoteModel, $dailyQuote);
                        }
                    };
                    composer6.updateRememberedValue(objRememberedValue2);
                    composer7 = composer6;
                    ComposerKt.sourceInformationMarkerEnd(composer7);
                    m7418ProfileActioniJQMabo("分享", jM4403getWhite0d7_KjU8, (Function0) objRememberedValue2, composer7, 54);
                    ComposerKt.sourceInformationMarkerEnd(composer7);
                    ComposerKt.sourceInformationMarkerEnd(composer4);
                    composer3.endNode();
                    ComposerKt.sourceInformationMarkerEnd(composer3);
                    ComposerKt.sourceInformationMarkerEnd(composer3);
                    ComposerKt.sourceInformationMarkerEnd(composer3);
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    composer.endNode();
                    ComposerKt.sourceInformationMarkerEnd(composer);
                    ComposerKt.sourceInformationMarkerEnd(composer);
                    ComposerKt.sourceInformationMarkerEnd(composer);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer5 = composer4;
                }
                objRememberedValue = new Function0() { // from class: com.luchime.huiyuan.ui.ProfileScreenKt$$ExternalSyntheticLambda21
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return ProfileScreenKt.ProfileScreen$lambda$36$lambda$35$lambda$15$lambda$14$lambda$13$lambda$12$lambda$9$lambda$8($context, $dailyQuote);
                    }
                };
                composer4.updateRememberedValue(objRememberedValue);
                ComposerKt.sourceInformationMarkerEnd(composer5);
                composer6 = composer5;
                m7418ProfileActioniJQMabo("复制", jM4403getWhite0d7_KjU7, (Function0) objRememberedValue, composer6, 54);
                long jM4403getWhite0d7_KjU9 = Color.INSTANCE.m4403getWhite0d7_KjU();
                ComposerKt.sourceInformationMarkerStart(composer6, -1631702052, "CC(remember):ProfileScreen.kt#9igjgp");
                zChangedInstance2 = composer6.changedInstance($context) | composer6.changed($dailyQuoteModel.ordinal()) | composer6.changedInstance($dailyQuote);
                objRememberedValue2 = composer6.rememberedValue();
                if (!zChangedInstance2) {
                    if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    }
                    composer7 = composer6;
                    ComposerKt.sourceInformationMarkerEnd(composer7);
                    m7418ProfileActioniJQMabo("分享", jM4403getWhite0d7_KjU9, (Function0) objRememberedValue2, composer7, 54);
                    ComposerKt.sourceInformationMarkerEnd(composer7);
                    ComposerKt.sourceInformationMarkerEnd(composer4);
                    composer3.endNode();
                    ComposerKt.sourceInformationMarkerEnd(composer3);
                    ComposerKt.sourceInformationMarkerEnd(composer3);
                    ComposerKt.sourceInformationMarkerEnd(composer3);
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    composer.endNode();
                    ComposerKt.sourceInformationMarkerEnd(composer);
                    ComposerKt.sourceInformationMarkerEnd(composer);
                    ComposerKt.sourceInformationMarkerEnd(composer);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer7 = composer6;
                }
                composer7 = composer6;
                objRememberedValue2 = new Function0() { // from class: com.luchime.huiyuan.ui.ProfileScreenKt$$ExternalSyntheticLambda22
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return ProfileScreenKt.ProfileScreen$lambda$36$lambda$35$lambda$15$lambda$14$lambda$13$lambda$12$lambda$11$lambda$10($context, $dailyQuoteModel, $dailyQuote);
                    }
                };
                composer6.updateRememberedValue(objRememberedValue2);
                composer7 = composer6;
                ComposerKt.sourceInformationMarkerEnd(composer7);
                m7418ProfileActioniJQMabo("分享", jM4403getWhite0d7_KjU9, (Function0) objRememberedValue2, composer7, 54);
                ComposerKt.sourceInformationMarkerEnd(composer7);
                ComposerKt.sourceInformationMarkerEnd(composer4);
                composer3.endNode();
                ComposerKt.sourceInformationMarkerEnd(composer3);
                ComposerKt.sourceInformationMarkerEnd(composer3);
                ComposerKt.sourceInformationMarkerEnd(composer3);
                ComposerKt.sourceInformationMarkerEnd(composer2);
                ComposerKt.sourceInformationMarkerEnd(composer2);
                composer.endNode();
                ComposerKt.sourceInformationMarkerEnd(composer);
                ComposerKt.sourceInformationMarkerEnd(composer);
                ComposerKt.sourceInformationMarkerEnd(composer);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            } else {
                i = 48;
                composer3 = composer2;
            }
            composerM3808constructorimpl4.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash4));
            composerM3808constructorimpl4.apply(Integer.valueOf(currentCompositeKeyHash4), setCompositeKeyHash9);
            Updater.m3815setimpl(composerM3808constructorimpl4, modifierMaterializeModifier9, ComposeUiNode.INSTANCE.getSetModifier());
            int i117 = (i114 >> 6) & 14;
            composer4 = composer3;
            ComposerKt.sourceInformationMarkerStart(composer4, -407735110, "C101@5232L9:Row.kt#2w3rfo");
            RowScopeInstance rowScopeInstance8 = RowScopeInstance.INSTANCE;
            int i118 = ((i >> 6) & 112) | 6;
            ComposerKt.sourceInformationMarkerStart(composer4, 956647899, "C144@5791L50,145@5899L38,145@5866L71,146@5995L262,146@5962L295:ProfileScreen.kt#cyjvf");
            m7418ProfileActioniJQMabo("问" + $askName, HuiyuanDesignKt.getSignalPink(), $onAskDaily, composer4, 48);
            long jM4403getWhite0d7_KjU10 = Color.INSTANCE.m4403getWhite0d7_KjU();
            ComposerKt.sourceInformationMarkerStart(composer4, -1631705348, "CC(remember):ProfileScreen.kt#9igjgp");
            zChangedInstance = composer4.changedInstance($context) | composer4.changedInstance($dailyQuote);
            objRememberedValue = composer4.rememberedValue();
            if (!zChangedInstance) {
                composer5 = composer4;
                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                }
                ComposerKt.sourceInformationMarkerEnd(composer5);
                composer6 = composer5;
                m7418ProfileActioniJQMabo("复制", jM4403getWhite0d7_KjU10, (Function0) objRememberedValue, composer6, 54);
                long jM4403getWhite0d7_KjU11 = Color.INSTANCE.m4403getWhite0d7_KjU();
                ComposerKt.sourceInformationMarkerStart(composer6, -1631702052, "CC(remember):ProfileScreen.kt#9igjgp");
                zChangedInstance2 = composer6.changedInstance($context) | composer6.changed($dailyQuoteModel.ordinal()) | composer6.changedInstance($dailyQuote);
                objRememberedValue2 = composer6.rememberedValue();
                if (!zChangedInstance2) {
                    if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    }
                    composer7 = composer6;
                    ComposerKt.sourceInformationMarkerEnd(composer7);
                    m7418ProfileActioniJQMabo("分享", jM4403getWhite0d7_KjU11, (Function0) objRememberedValue2, composer7, 54);
                    ComposerKt.sourceInformationMarkerEnd(composer7);
                    ComposerKt.sourceInformationMarkerEnd(composer4);
                    composer3.endNode();
                    ComposerKt.sourceInformationMarkerEnd(composer3);
                    ComposerKt.sourceInformationMarkerEnd(composer3);
                    ComposerKt.sourceInformationMarkerEnd(composer3);
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    composer.endNode();
                    ComposerKt.sourceInformationMarkerEnd(composer);
                    ComposerKt.sourceInformationMarkerEnd(composer);
                    ComposerKt.sourceInformationMarkerEnd(composer);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer7 = composer6;
                }
                composer7 = composer6;
                objRememberedValue2 = new Function0() { // from class: com.luchime.huiyuan.ui.ProfileScreenKt$$ExternalSyntheticLambda22
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return ProfileScreenKt.ProfileScreen$lambda$36$lambda$35$lambda$15$lambda$14$lambda$13$lambda$12$lambda$11$lambda$10($context, $dailyQuoteModel, $dailyQuote);
                    }
                };
                composer6.updateRememberedValue(objRememberedValue2);
                composer7 = composer6;
                ComposerKt.sourceInformationMarkerEnd(composer7);
                m7418ProfileActioniJQMabo("分享", jM4403getWhite0d7_KjU11, (Function0) objRememberedValue2, composer7, 54);
                ComposerKt.sourceInformationMarkerEnd(composer7);
                ComposerKt.sourceInformationMarkerEnd(composer4);
                composer3.endNode();
                ComposerKt.sourceInformationMarkerEnd(composer3);
                ComposerKt.sourceInformationMarkerEnd(composer3);
                ComposerKt.sourceInformationMarkerEnd(composer3);
                ComposerKt.sourceInformationMarkerEnd(composer2);
                ComposerKt.sourceInformationMarkerEnd(composer2);
                composer.endNode();
                ComposerKt.sourceInformationMarkerEnd(composer);
                ComposerKt.sourceInformationMarkerEnd(composer);
                ComposerKt.sourceInformationMarkerEnd(composer);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            } else {
                composer5 = composer4;
            }
            objRememberedValue = new Function0() { // from class: com.luchime.huiyuan.ui.ProfileScreenKt$$ExternalSyntheticLambda21
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return ProfileScreenKt.ProfileScreen$lambda$36$lambda$35$lambda$15$lambda$14$lambda$13$lambda$12$lambda$9$lambda$8($context, $dailyQuote);
                }
            };
            composer4.updateRememberedValue(objRememberedValue);
            ComposerKt.sourceInformationMarkerEnd(composer5);
            composer6 = composer5;
            m7418ProfileActioniJQMabo("复制", jM4403getWhite0d7_KjU10, (Function0) objRememberedValue, composer6, 54);
            long jM4403getWhite0d7_KjU12 = Color.INSTANCE.m4403getWhite0d7_KjU();
            ComposerKt.sourceInformationMarkerStart(composer6, -1631702052, "CC(remember):ProfileScreen.kt#9igjgp");
            zChangedInstance2 = composer6.changedInstance($context) | composer6.changed($dailyQuoteModel.ordinal()) | composer6.changedInstance($dailyQuote);
            objRememberedValue2 = composer6.rememberedValue();
            if (!zChangedInstance2) {
                if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                }
                composer7 = composer6;
                ComposerKt.sourceInformationMarkerEnd(composer7);
                m7418ProfileActioniJQMabo("分享", jM4403getWhite0d7_KjU12, (Function0) objRememberedValue2, composer7, 54);
                ComposerKt.sourceInformationMarkerEnd(composer7);
                ComposerKt.sourceInformationMarkerEnd(composer4);
                composer3.endNode();
                ComposerKt.sourceInformationMarkerEnd(composer3);
                ComposerKt.sourceInformationMarkerEnd(composer3);
                ComposerKt.sourceInformationMarkerEnd(composer3);
                ComposerKt.sourceInformationMarkerEnd(composer2);
                ComposerKt.sourceInformationMarkerEnd(composer2);
                composer.endNode();
                ComposerKt.sourceInformationMarkerEnd(composer);
                ComposerKt.sourceInformationMarkerEnd(composer);
                ComposerKt.sourceInformationMarkerEnd(composer);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            } else {
                composer7 = composer6;
            }
            composer7 = composer6;
            objRememberedValue2 = new Function0() { // from class: com.luchime.huiyuan.ui.ProfileScreenKt$$ExternalSyntheticLambda22
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return ProfileScreenKt.ProfileScreen$lambda$36$lambda$35$lambda$15$lambda$14$lambda$13$lambda$12$lambda$11$lambda$10($context, $dailyQuoteModel, $dailyQuote);
                }
            };
            composer6.updateRememberedValue(objRememberedValue2);
            composer7 = composer6;
            ComposerKt.sourceInformationMarkerEnd(composer7);
            m7418ProfileActioniJQMabo("分享", jM4403getWhite0d7_KjU12, (Function0) objRememberedValue2, composer7, 54);
            ComposerKt.sourceInformationMarkerEnd(composer7);
            ComposerKt.sourceInformationMarkerEnd(composer4);
            composer3.endNode();
            ComposerKt.sourceInformationMarkerEnd(composer3);
            ComposerKt.sourceInformationMarkerEnd(composer3);
            ComposerKt.sourceInformationMarkerEnd(composer3);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            composer.endNode();
            ComposerKt.sourceInformationMarkerEnd(composer);
            ComposerKt.sourceInformationMarkerEnd(composer);
            ComposerKt.sourceInformationMarkerEnd(composer);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    static final Unit ProfileScreen$lambda$36$lambda$35$lambda$15$lambda$14$lambda$13$lambda$12$lambda$9$lambda$8(Context $context, LexiconEntry $dailyQuote) {
        HuiyuanDesignKt.copyText($context, $dailyQuote.getText());
        return Unit.INSTANCE;
    }

    static final Unit ProfileScreen$lambda$36$lambda$35$lambda$15$lambda$14$lambda$13$lambda$12$lambda$11$lambda$10(Context $context, AIModel $dailyQuoteModel, LexiconEntry $dailyQuote) {
        HuiyuanDesignKt.shareText($context, "603视界 · " + $dailyQuoteModel.getShortName() + "的今日一句", $dailyQuote.getText());
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:32:0x0256  */
    /* JADX WARN: Code duplicated, block: B:35:0x0262  */
    /* JADX WARN: Code duplicated, block: B:36:0x0268  */
    /* JADX WARN: Code duplicated, block: B:47:0x03f6  */
    /* JADX WARN: Code duplicated, block: B:50:0x0402  */
    /* JADX WARN: Code duplicated, block: B:51:0x0408  */
    /* JADX WARN: Code duplicated, block: B:54:0x0439  */
    /* JADX WARN: Code duplicated, block: B:57:0x044c  */
    /* JADX WARN: Code duplicated, block: B:58:0x044f  */
    /* JADX WARN: Code duplicated, block: B:62:0x052b  */
    static final Unit ProfileScreen$lambda$36$lambda$35$lambda$19(boolean $isLandscape, UsageStats $stats, int $favoriteCount, LazyItemScope item, Composer $composer, int $changed) {
        int i;
        int currentCompositeKeyHash;
        Function0<ComposeUiNode> constructor;
        Function0<ComposeUiNode> function0;
        Composer composerM3808constructorimpl;
        int currentCompositeKeyHash2;
        Function0<ComposeUiNode> constructor2;
        Function0<ComposeUiNode> function1;
        Composer composerM3808constructorimpl2;
        Composer composer;
        Intrinsics.checkNotNullParameter(item, "$this$item");
        ComposerKt.sourceInformation($composer, "C159@6350L327,169@6690L773:ProfileScreen.kt#cyjvf");
        if (!$composer.shouldExecute(($changed & 17) != 16, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1930530524, $changed, -1, "com.luchime.huiyuan.ui.ProfileScreen.<anonymous>.<anonymous>.<anonymous> (ProfileScreen.kt:159)");
            }
            TextKt.m2820Text4IGK_g("使用概览", PaddingKt.m726paddingVpY3zN4(Modifier.INSTANCE, Dp.m6973constructorimpl(17), $isLandscape ? Dp.m6973constructorimpl(8) : Dp.m6973constructorimpl(16)), HuiyuanDesignKt.getInk(), TextUnitKt.getSp(15), (FontStyle) null, FontWeight.INSTANCE.getBlack(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, $composer, 200070, 0, 131024);
            Modifier modifierM727paddingVpY3zN4$default = PaddingKt.m727paddingVpY3zN4$default(Modifier.INSTANCE, Dp.m6973constructorimpl(16), 0.0f, 2, null);
            Arrangement.Vertical verticalM606spacedBy0680j_4 = Arrangement.INSTANCE.m606spacedBy0680j_4(Dp.m6973constructorimpl(10));
            ComposerKt.sourceInformationMarkerStart($composer, -483455358, "CC(Column)P(2,3,1)87@4442L61,88@4508L133:Column.kt#2w3rfo");
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(verticalM606spacedBy0680j_4, Alignment.INSTANCE.getStart(), $composer, ((54 >> 3) & 14) | ((54 >> 3) & 112));
            ComposerKt.sourceInformationMarkerStart($composer, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
            int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash($composer, 0);
            CompositionLocalMap currentCompositionLocalMap = $composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier($composer, modifierM727paddingVpY3zN4$default);
            Function0<ComposeUiNode> constructor3 = ComposeUiNode.INSTANCE.getConstructor();
            int i2 = ((((54 << 3) & 112) << 6) & 896) | 6;
            ComposerKt.sourceInformationMarkerStart($composer, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
            if (!($composer.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            $composer.startReusableNode();
            if ($composer.getInserting()) {
                $composer.createNode(constructor3);
            } else {
                $composer.useNode();
            }
            Composer composerM3808constructorimpl3 = Updater.m3808constructorimpl($composer);
            Updater.m3815setimpl(composerM3808constructorimpl3, measurePolicyColumnMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m3815setimpl(composerM3808constructorimpl3, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (composerM3808constructorimpl3.getInserting()) {
                i = 54;
            } else {
                i = 54;
                if (!Intrinsics.areEqual(composerM3808constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                }
                Updater.m3815setimpl(composerM3808constructorimpl3, modifierMaterializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
                int i3 = (i2 >> 6) & 14;
                ComposerKt.sourceInformationMarkerStart($composer, -384672921, "C89@4556L9:Column.kt#2w3rfo");
                ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                int i4 = ((i >> 6) & 112) | 6;
                ComposerKt.sourceInformationMarkerStart($composer, 1731641445, "C173@6861L290,177@7168L281:ProfileScreen.kt#cyjvf");
                Arrangement.Horizontal horizontalM606spacedBy0680j_4 = Arrangement.INSTANCE.m606spacedBy0680j_4(Dp.m6973constructorimpl(10));
                ComposerKt.sourceInformationMarkerStart($composer, 693286680, "CC(Row)P(2,1,3)99@5124L58,100@5187L130:Row.kt#2w3rfo");
                Modifier modifier = Modifier.INSTANCE;
                MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(horizontalM606spacedBy0680j_4, Alignment.INSTANCE.getTop(), $composer, ((48 >> 3) & 14) | ((48 >> 3) & 112));
                ComposerKt.sourceInformationMarkerStart($composer, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash($composer, 0);
                CompositionLocalMap currentCompositionLocalMap2 = $composer.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier($composer, modifier);
                constructor = ComposeUiNode.INSTANCE.getConstructor();
                int i5 = ((((48 << 3) & 112) << 6) & 896) | 6;
                ComposerKt.sourceInformationMarkerStart($composer, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
                if (!($composer.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                $composer.startReusableNode();
                if ($composer.getInserting()) {
                    function0 = constructor;
                    $composer.createNode(function0);
                } else {
                    function0 = constructor;
                    $composer.useNode();
                }
                composerM3808constructorimpl = Updater.m3808constructorimpl($composer);
                Updater.m3815setimpl(composerM3808constructorimpl, measurePolicyRowMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m3815setimpl(composerM3808constructorimpl, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                if (!composerM3808constructorimpl.getInserting() || !Intrinsics.areEqual(composerM3808constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    composerM3808constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    composerM3808constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash2);
                }
                Updater.m3815setimpl(composerM3808constructorimpl, modifierMaterializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
                int i6 = (i5 >> 6) & 14;
                ComposerKt.sourceInformationMarkerStart($composer, -407735110, "C101@5232L9:Row.kt#2w3rfo");
                int i7 = ((48 >> 6) & 112) | 6;
                RowScope rowScope = RowScopeInstance.INSTANCE;
                ComposerKt.sourceInformationMarkerStart($composer, -857258708, "C174@6940L87,175@7048L85:ProfileScreen.kt#cyjvf");
                m7420StatCarduDo3WH8("提问", String.valueOf($stats.getTotalQuestions()), "次", HuiyuanDesignKt.getSignalYellow(), RowScope.weight$default(rowScope, Modifier.INSTANCE, 1.0f, false, 2, null), $composer, 3462, 0);
                m7420StatCarduDo3WH8("随机灵感", String.valueOf($stats.getRandomDraws()), "次", HuiyuanDesignKt.getSignalGreen(), RowScope.weight$default(rowScope, Modifier.INSTANCE, 1.0f, false, 2, null), $composer, 3462, 0);
                ComposerKt.sourceInformationMarkerEnd($composer);
                ComposerKt.sourceInformationMarkerEnd($composer);
                $composer.endNode();
                ComposerKt.sourceInformationMarkerEnd($composer);
                ComposerKt.sourceInformationMarkerEnd($composer);
                ComposerKt.sourceInformationMarkerEnd($composer);
                Arrangement.Horizontal horizontalM606spacedBy0680j_5 = Arrangement.INSTANCE.m606spacedBy0680j_4(Dp.m6973constructorimpl(10));
                ComposerKt.sourceInformationMarkerStart($composer, 693286680, "CC(Row)P(2,1,3)99@5124L58,100@5187L130:Row.kt#2w3rfo");
                Modifier modifier2 = Modifier.INSTANCE;
                MeasurePolicy measurePolicyRowMeasurePolicy2 = RowKt.rowMeasurePolicy(horizontalM606spacedBy0680j_5, Alignment.INSTANCE.getTop(), $composer, ((48 >> 3) & 14) | ((48 >> 3) & 112));
                ComposerKt.sourceInformationMarkerStart($composer, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash($composer, 0);
                CompositionLocalMap currentCompositionLocalMap3 = $composer.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier($composer, modifier2);
                constructor2 = ComposeUiNode.INSTANCE.getConstructor();
                int i8 = ((((48 << 3) & 112) << 6) & 896) | 6;
                ComposerKt.sourceInformationMarkerStart($composer, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
                if (!($composer.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                $composer.startReusableNode();
                if ($composer.getInserting()) {
                    function1 = constructor2;
                    $composer.createNode(function1);
                } else {
                    function1 = constructor2;
                    $composer.useNode();
                }
                composerM3808constructorimpl2 = Updater.m3808constructorimpl($composer);
                Updater.m3815setimpl(composerM3808constructorimpl2, measurePolicyRowMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m3815setimpl(composerM3808constructorimpl2, currentCompositionLocalMap3, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                if (!composerM3808constructorimpl2.getInserting()) {
                    composer = $composer;
                    if (!Intrinsics.areEqual(composerM3808constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                    }
                    Updater.m3815setimpl(composerM3808constructorimpl2, modifierMaterializeModifier3, ComposeUiNode.INSTANCE.getSetModifier());
                    int i9 = (i8 >> 6) & 14;
                    Composer composer2 = composer;
                    ComposerKt.sourceInformationMarkerStart(composer2, -407735110, "C101@5232L9:Row.kt#2w3rfo");
                    int i10 = ((48 >> 6) & 112) | 6;
                    RowScope rowScope2 = RowScopeInstance.INSTANCE;
                    ComposerKt.sourceInformationMarkerStart(composer2, -407970050, "C178@7247L83,179@7351L80:ProfileScreen.kt#cyjvf");
                    m7420StatCarduDo3WH8("连续使用", String.valueOf($stats.getStreakDays()), "天", HuiyuanDesignKt.getSignalPink(), RowScope.weight$default(rowScope2, Modifier.INSTANCE, 1.0f, false, 2, null), composer2, 3462, 0);
                    m7420StatCarduDo3WH8("收藏", String.valueOf($favoriteCount), "条", HuiyuanDesignKt.getSignalPurple(), RowScope.weight$default(rowScope2, Modifier.INSTANCE, 1.0f, false, 2, null), composer2, 3462, 0);
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    composer.endNode();
                    ComposerKt.sourceInformationMarkerEnd(composer);
                    ComposerKt.sourceInformationMarkerEnd(composer);
                    ComposerKt.sourceInformationMarkerEnd(composer);
                    ComposerKt.sourceInformationMarkerEnd($composer);
                    ComposerKt.sourceInformationMarkerEnd($composer);
                    $composer.endNode();
                    ComposerKt.sourceInformationMarkerEnd($composer);
                    ComposerKt.sourceInformationMarkerEnd($composer);
                    ComposerKt.sourceInformationMarkerEnd($composer);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer = $composer;
                }
                composerM3808constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                composerM3808constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash3);
                Updater.m3815setimpl(composerM3808constructorimpl2, modifierMaterializeModifier3, ComposeUiNode.INSTANCE.getSetModifier());
                int i11 = (i8 >> 6) & 14;
                Composer composer3 = composer;
                ComposerKt.sourceInformationMarkerStart(composer3, -407735110, "C101@5232L9:Row.kt#2w3rfo");
                int i12 = ((48 >> 6) & 112) | 6;
                RowScope rowScope3 = RowScopeInstance.INSTANCE;
                ComposerKt.sourceInformationMarkerStart(composer3, -407970050, "C178@7247L83,179@7351L80:ProfileScreen.kt#cyjvf");
                m7420StatCarduDo3WH8("连续使用", String.valueOf($stats.getStreakDays()), "天", HuiyuanDesignKt.getSignalPink(), RowScope.weight$default(rowScope3, Modifier.INSTANCE, 1.0f, false, 2, null), composer3, 3462, 0);
                m7420StatCarduDo3WH8("收藏", String.valueOf($favoriteCount), "条", HuiyuanDesignKt.getSignalPurple(), RowScope.weight$default(rowScope3, Modifier.INSTANCE, 1.0f, false, 2, null), composer3, 3462, 0);
                ComposerKt.sourceInformationMarkerEnd(composer3);
                ComposerKt.sourceInformationMarkerEnd(composer3);
                composer.endNode();
                ComposerKt.sourceInformationMarkerEnd(composer);
                ComposerKt.sourceInformationMarkerEnd(composer);
                ComposerKt.sourceInformationMarkerEnd(composer);
                ComposerKt.sourceInformationMarkerEnd($composer);
                ComposerKt.sourceInformationMarkerEnd($composer);
                $composer.endNode();
                ComposerKt.sourceInformationMarkerEnd($composer);
                ComposerKt.sourceInformationMarkerEnd($composer);
                ComposerKt.sourceInformationMarkerEnd($composer);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
            composerM3808constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
            composerM3808constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash);
            Updater.m3815setimpl(composerM3808constructorimpl3, modifierMaterializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
            int i13 = (i2 >> 6) & 14;
            ComposerKt.sourceInformationMarkerStart($composer, -384672921, "C89@4556L9:Column.kt#2w3rfo");
            ColumnScopeInstance columnScopeInstance2 = ColumnScopeInstance.INSTANCE;
            int i14 = ((i >> 6) & 112) | 6;
            ComposerKt.sourceInformationMarkerStart($composer, 1731641445, "C173@6861L290,177@7168L281:ProfileScreen.kt#cyjvf");
            Arrangement.Horizontal horizontalM606spacedBy0680j_6 = Arrangement.INSTANCE.m606spacedBy0680j_4(Dp.m6973constructorimpl(10));
            ComposerKt.sourceInformationMarkerStart($composer, 693286680, "CC(Row)P(2,1,3)99@5124L58,100@5187L130:Row.kt#2w3rfo");
            Modifier modifier3 = Modifier.INSTANCE;
            MeasurePolicy measurePolicyRowMeasurePolicy3 = RowKt.rowMeasurePolicy(horizontalM606spacedBy0680j_6, Alignment.INSTANCE.getTop(), $composer, ((48 >> 3) & 14) | ((48 >> 3) & 112));
            ComposerKt.sourceInformationMarkerStart($composer, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
            currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash($composer, 0);
            CompositionLocalMap currentCompositionLocalMap4 = $composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier4 = ComposedModifierKt.materializeModifier($composer, modifier3);
            constructor = ComposeUiNode.INSTANCE.getConstructor();
            int i15 = ((((48 << 3) & 112) << 6) & 896) | 6;
            ComposerKt.sourceInformationMarkerStart($composer, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
            if (!($composer.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            $composer.startReusableNode();
            if ($composer.getInserting()) {
                function0 = constructor;
                $composer.createNode(function0);
            } else {
                function0 = constructor;
                $composer.useNode();
            }
            composerM3808constructorimpl = Updater.m3808constructorimpl($composer);
            Updater.m3815setimpl(composerM3808constructorimpl, measurePolicyRowMeasurePolicy3, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m3815setimpl(composerM3808constructorimpl, currentCompositionLocalMap4, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash4 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (!composerM3808constructorimpl.getInserting()) {
            }
            composerM3808constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
            composerM3808constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash4);
            Updater.m3815setimpl(composerM3808constructorimpl, modifierMaterializeModifier4, ComposeUiNode.INSTANCE.getSetModifier());
            int i16 = (i15 >> 6) & 14;
            ComposerKt.sourceInformationMarkerStart($composer, -407735110, "C101@5232L9:Row.kt#2w3rfo");
            int i17 = ((48 >> 6) & 112) | 6;
            RowScope rowScope4 = RowScopeInstance.INSTANCE;
            ComposerKt.sourceInformationMarkerStart($composer, -857258708, "C174@6940L87,175@7048L85:ProfileScreen.kt#cyjvf");
            m7420StatCarduDo3WH8("提问", String.valueOf($stats.getTotalQuestions()), "次", HuiyuanDesignKt.getSignalYellow(), RowScope.weight$default(rowScope4, Modifier.INSTANCE, 1.0f, false, 2, null), $composer, 3462, 0);
            m7420StatCarduDo3WH8("随机灵感", String.valueOf($stats.getRandomDraws()), "次", HuiyuanDesignKt.getSignalGreen(), RowScope.weight$default(rowScope4, Modifier.INSTANCE, 1.0f, false, 2, null), $composer, 3462, 0);
            ComposerKt.sourceInformationMarkerEnd($composer);
            ComposerKt.sourceInformationMarkerEnd($composer);
            $composer.endNode();
            ComposerKt.sourceInformationMarkerEnd($composer);
            ComposerKt.sourceInformationMarkerEnd($composer);
            ComposerKt.sourceInformationMarkerEnd($composer);
            Arrangement.Horizontal horizontalM606spacedBy0680j_7 = Arrangement.INSTANCE.m606spacedBy0680j_4(Dp.m6973constructorimpl(10));
            ComposerKt.sourceInformationMarkerStart($composer, 693286680, "CC(Row)P(2,1,3)99@5124L58,100@5187L130:Row.kt#2w3rfo");
            Modifier modifier4 = Modifier.INSTANCE;
            MeasurePolicy measurePolicyRowMeasurePolicy4 = RowKt.rowMeasurePolicy(horizontalM606spacedBy0680j_7, Alignment.INSTANCE.getTop(), $composer, ((48 >> 3) & 14) | ((48 >> 3) & 112));
            ComposerKt.sourceInformationMarkerStart($composer, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
            currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash($composer, 0);
            CompositionLocalMap currentCompositionLocalMap5 = $composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier5 = ComposedModifierKt.materializeModifier($composer, modifier4);
            constructor2 = ComposeUiNode.INSTANCE.getConstructor();
            int i18 = ((((48 << 3) & 112) << 6) & 896) | 6;
            ComposerKt.sourceInformationMarkerStart($composer, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
            if (!($composer.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            $composer.startReusableNode();
            if ($composer.getInserting()) {
                function1 = constructor2;
                $composer.createNode(function1);
            } else {
                function1 = constructor2;
                $composer.useNode();
            }
            composerM3808constructorimpl2 = Updater.m3808constructorimpl($composer);
            Updater.m3815setimpl(composerM3808constructorimpl2, measurePolicyRowMeasurePolicy4, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m3815setimpl(composerM3808constructorimpl2, currentCompositionLocalMap5, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash5 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (!composerM3808constructorimpl2.getInserting()) {
                composer = $composer;
                if (!Intrinsics.areEqual(composerM3808constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                }
                Updater.m3815setimpl(composerM3808constructorimpl2, modifierMaterializeModifier5, ComposeUiNode.INSTANCE.getSetModifier());
                int i19 = (i18 >> 6) & 14;
                Composer composer4 = composer;
                ComposerKt.sourceInformationMarkerStart(composer4, -407735110, "C101@5232L9:Row.kt#2w3rfo");
                int i110 = ((48 >> 6) & 112) | 6;
                RowScope rowScope5 = RowScopeInstance.INSTANCE;
                ComposerKt.sourceInformationMarkerStart(composer4, -407970050, "C178@7247L83,179@7351L80:ProfileScreen.kt#cyjvf");
                m7420StatCarduDo3WH8("连续使用", String.valueOf($stats.getStreakDays()), "天", HuiyuanDesignKt.getSignalPink(), RowScope.weight$default(rowScope5, Modifier.INSTANCE, 1.0f, false, 2, null), composer4, 3462, 0);
                m7420StatCarduDo3WH8("收藏", String.valueOf($favoriteCount), "条", HuiyuanDesignKt.getSignalPurple(), RowScope.weight$default(rowScope5, Modifier.INSTANCE, 1.0f, false, 2, null), composer4, 3462, 0);
                ComposerKt.sourceInformationMarkerEnd(composer4);
                ComposerKt.sourceInformationMarkerEnd(composer4);
                composer.endNode();
                ComposerKt.sourceInformationMarkerEnd(composer);
                ComposerKt.sourceInformationMarkerEnd(composer);
                ComposerKt.sourceInformationMarkerEnd(composer);
                ComposerKt.sourceInformationMarkerEnd($composer);
                ComposerKt.sourceInformationMarkerEnd($composer);
                $composer.endNode();
                ComposerKt.sourceInformationMarkerEnd($composer);
                ComposerKt.sourceInformationMarkerEnd($composer);
                ComposerKt.sourceInformationMarkerEnd($composer);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            } else {
                composer = $composer;
            }
            composerM3808constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
            composerM3808constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash5);
            Updater.m3815setimpl(composerM3808constructorimpl2, modifierMaterializeModifier5, ComposeUiNode.INSTANCE.getSetModifier());
            int i111 = (i18 >> 6) & 14;
            Composer composer5 = composer;
            ComposerKt.sourceInformationMarkerStart(composer5, -407735110, "C101@5232L9:Row.kt#2w3rfo");
            int i112 = ((48 >> 6) & 112) | 6;
            RowScope rowScope6 = RowScopeInstance.INSTANCE;
            ComposerKt.sourceInformationMarkerStart(composer5, -407970050, "C178@7247L83,179@7351L80:ProfileScreen.kt#cyjvf");
            m7420StatCarduDo3WH8("连续使用", String.valueOf($stats.getStreakDays()), "天", HuiyuanDesignKt.getSignalPink(), RowScope.weight$default(rowScope6, Modifier.INSTANCE, 1.0f, false, 2, null), composer5, 3462, 0);
            m7420StatCarduDo3WH8("收藏", String.valueOf($favoriteCount), "条", HuiyuanDesignKt.getSignalPurple(), RowScope.weight$default(rowScope6, Modifier.INSTANCE, 1.0f, false, 2, null), composer5, 3462, 0);
            ComposerKt.sourceInformationMarkerEnd(composer5);
            ComposerKt.sourceInformationMarkerEnd(composer5);
            composer.endNode();
            ComposerKt.sourceInformationMarkerEnd(composer);
            ComposerKt.sourceInformationMarkerEnd(composer);
            ComposerKt.sourceInformationMarkerEnd(composer);
            ComposerKt.sourceInformationMarkerEnd($composer);
            ComposerKt.sourceInformationMarkerEnd($composer);
            $composer.endNode();
            ComposerKt.sourceInformationMarkerEnd($composer);
            ComposerKt.sourceInformationMarkerEnd($composer);
            ComposerKt.sourceInformationMarkerEnd($composer);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    static final Unit ProfileScreen$lambda$36$lambda$35$lambda$24(boolean $isLandscape, final List $topCategories, final String $askName, LazyItemScope item, Composer $composer, int $changed) {
        Intrinsics.checkNotNullParameter(item, "$this$item");
        ComposerKt.sourceInformation($composer, "C185@7502L327,200@8030L1272,195@7842L1460:ProfileScreen.kt#cyjvf");
        if ($composer.shouldExecute(($changed & 17) != 16, $changed & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-548949283, $changed, -1, "com.luchime.huiyuan.ui.ProfileScreen.<anonymous>.<anonymous>.<anonymous> (ProfileScreen.kt:185)");
            }
            TextKt.m2820Text4IGK_g("关注维度", PaddingKt.m726paddingVpY3zN4(Modifier.INSTANCE, Dp.m6973constructorimpl(17), $isLandscape ? Dp.m6973constructorimpl(8) : Dp.m6973constructorimpl(16)), HuiyuanDesignKt.getInk(), TextUnitKt.getSp(15), (FontStyle) null, FontWeight.INSTANCE.getBlack(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, $composer, 200070, 0, 131024);
            HuiyuanDesignKt.m7414RetroCard3IgeMak(PaddingKt.m727paddingVpY3zN4$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), Dp.m6973constructorimpl(16), 0.0f, 2, null), Color.INSTANCE.m4403getWhite0d7_KjU(), ComposableLambdaKt.rememberComposableLambda(-1386973305, true, new Function3() { // from class: com.luchime.huiyuan.ui.ProfileScreenKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    return ProfileScreenKt.ProfileScreen$lambda$36$lambda$35$lambda$24$lambda$23($topCategories, $askName, (BoxScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
                }
            }, $composer, 54), $composer, 438, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:31:0x01c7  */
    /* JADX WARN: Code duplicated, block: B:34:0x01df  */
    /* JADX WARN: Code duplicated, block: B:36:0x01f5  */
    /* JADX WARN: Code duplicated, block: B:41:0x021b  */
    /* JADX WARN: Code duplicated, block: B:43:0x0223  */
    /* JADX WARN: Code duplicated, block: B:49:0x02ec  */
    /* JADX WARN: Code duplicated, block: B:56:0x01f6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:59:0x0226 A[SYNTHETIC] */
    static final Unit ProfileScreen$lambda$36$lambda$35$lambda$24$lambda$23(List $topCategories, String $askName, BoxScope RetroCard, Composer $composer, int $changed) {
        Function0<ComposeUiNode> function0;
        int i;
        Composer composer;
        Composer composer2;
        Iterator it;
        int iIntValue;
        int iCoerceAtLeast;
        List list;
        int i2;
        int iIntValue2;
        Intrinsics.checkNotNullParameter(RetroCard, "$this$RetroCard");
        ComposerKt.sourceInformation($composer, "C:ProfileScreen.kt#cyjvf");
        if ($composer.shouldExecute(($changed & 17) != 16, $changed & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1386973305, $changed, -1, "com.luchime.huiyuan.ui.ProfileScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous> (ProfileScreen.kt:201)");
            }
            if ($topCategories.isEmpty()) {
                $composer.startReplaceGroup(-1736287049);
                ComposerKt.sourceInformation($composer, "202@8099L220");
                TextKt.m2820Text4IGK_g("和" + $askName + "聊几次后，这里会出现你的认知关注地图。", (Modifier) null, HuiyuanDesignKt.getMutedText(), TextUnitKt.getSp(13), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, TextUnitKt.getSp(20), 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, $composer, 3456, 6, 130034);
                $composer.endReplaceGroup();
            } else {
                $composer.startReplaceGroup(-1736001942);
                ComposerKt.sourceInformation($composer, "209@8365L905");
                Arrangement.Vertical verticalM606spacedBy0680j_4 = Arrangement.INSTANCE.m606spacedBy0680j_4(Dp.m6973constructorimpl(11));
                ComposerKt.sourceInformationMarkerStart($composer, -483455358, "CC(Column)P(2,3,1)87@4442L61,88@4508L133:Column.kt#2w3rfo");
                Modifier modifier = Modifier.INSTANCE;
                MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(verticalM606spacedBy0680j_4, Alignment.INSTANCE.getStart(), $composer, ((48 >> 3) & 14) | ((48 >> 3) & 112));
                ComposerKt.sourceInformationMarkerStart($composer, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash($composer, 0);
                CompositionLocalMap currentCompositionLocalMap = $composer.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier($composer, modifier);
                Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                int i3 = ((((48 << 3) & 112) << 6) & 896) | 6;
                int i4 = 6;
                ComposerKt.sourceInformationMarkerStart($composer, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
                if (!($composer.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                $composer.startReusableNode();
                if ($composer.getInserting()) {
                    function0 = constructor;
                    $composer.createNode(function0);
                } else {
                    function0 = constructor;
                    $composer.useNode();
                }
                Composer composerM3808constructorimpl = Updater.m3808constructorimpl($composer);
                Updater.m3815setimpl(composerM3808constructorimpl, measurePolicyColumnMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m3815setimpl(composerM3808constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                if (composerM3808constructorimpl.getInserting()) {
                    i = 48;
                    composer = $composer;
                } else {
                    i = 48;
                    composer = $composer;
                    if (!Intrinsics.areEqual(composerM3808constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    }
                    Updater.m3815setimpl(composerM3808constructorimpl, modifierMaterializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
                    int i5 = (i3 >> 6) & 14;
                    composer2 = composer;
                    ComposerKt.sourceInformationMarkerStart(composer2, -384672921, "C89@4556L9:Column.kt#2w3rfo");
                    ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                    int i6 = ((i >> 6) & 112) | 6;
                    ComposerKt.sourceInformationMarkerStart(composer2, -1656003517, "C:ProfileScreen.kt#cyjvf");
                    it = $topCategories.iterator();
                    if (it.hasNext()) {
                        throw new NoSuchElementException();
                    }
                    iIntValue = ((Number) ((Map.Entry) it.next()).getValue()).intValue();
                    while (it.hasNext()) {
                        Iterator it2 = it;
                        iIntValue2 = ((Number) ((Map.Entry) it.next()).getValue()).intValue();
                        if (iIntValue < iIntValue2) {
                            iIntValue = iIntValue2;
                        }
                        it = it2;
                    }
                    iCoerceAtLeast = RangesKt.coerceAtLeast(iIntValue, 1);
                    composer2.startReplaceGroup(362225690);
                    ComposerKt.sourceInformation(composer2, "*212@8611L611");
                    list = $topCategories;
                    i2 = 0;
                    for (Object obj : list) {
                        int i7 = i2 + 1;
                        if (i2 < 0) {
                            CollectionsKt.throwIndexOverflow();
                        }
                        Map.Entry entry = (Map.Entry) obj;
                        int i8 = i2;
                        String str = (String) entry.getKey();
                        int iIntValue3 = ((Number) entry.getValue()).intValue();
                        float fIntValue = ((Number) entry.getValue()).intValue() / iCoerceAtLeast;
                        Composer composer3 = composer2;
                        Color[] colorArr = new Color[i4];
                        colorArr[0] = Color.m4356boximpl(HuiyuanDesignKt.getSignalPink());
                        colorArr[1] = Color.m4356boximpl(HuiyuanDesignKt.getSignalPurple());
                        colorArr[2] = Color.m4356boximpl(HuiyuanDesignKt.getSignalBlue());
                        colorArr[3] = Color.m4356boximpl(HuiyuanDesignKt.getSignalGreen());
                        colorArr[4] = Color.m4356boximpl(HuiyuanDesignKt.getSignalOrange());
                        colorArr[5] = Color.m4356boximpl(HuiyuanDesignKt.getSignalRed());
                        m7417CategoryProgressBx497Mc(str, iIntValue3, fIntValue, ((Color) CollectionsKt.listOf((Object[]) colorArr).get(i8 % 6)).m4376unboximpl(), composer3, 0);
                        composer2 = composer3;
                        i2 = i7;
                        list = list;
                        i4 = 6;
                    }
                    Composer composer4 = composer2;
                    composer4.endReplaceGroup();
                    ComposerKt.sourceInformationMarkerEnd(composer4);
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    composer.endNode();
                    ComposerKt.sourceInformationMarkerEnd(composer);
                    ComposerKt.sourceInformationMarkerEnd(composer);
                    ComposerKt.sourceInformationMarkerEnd(composer);
                    $composer.endReplaceGroup();
                }
                composerM3808constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM3808constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                Updater.m3815setimpl(composerM3808constructorimpl, modifierMaterializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
                int i9 = (i3 >> 6) & 14;
                composer2 = composer;
                ComposerKt.sourceInformationMarkerStart(composer2, -384672921, "C89@4556L9:Column.kt#2w3rfo");
                ColumnScopeInstance columnScopeInstance2 = ColumnScopeInstance.INSTANCE;
                int i10 = ((i >> 6) & 112) | 6;
                ComposerKt.sourceInformationMarkerStart(composer2, -1656003517, "C:ProfileScreen.kt#cyjvf");
                it = $topCategories.iterator();
                if (it.hasNext()) {
                    throw new NoSuchElementException();
                }
                iIntValue = ((Number) ((Map.Entry) it.next()).getValue()).intValue();
                while (it.hasNext()) {
                    Iterator it3 = it;
                    iIntValue2 = ((Number) ((Map.Entry) it.next()).getValue()).intValue();
                    if (iIntValue < iIntValue2) {
                        iIntValue = iIntValue2;
                    }
                    it = it3;
                }
                iCoerceAtLeast = RangesKt.coerceAtLeast(iIntValue, 1);
                composer2.startReplaceGroup(362225690);
                ComposerKt.sourceInformation(composer2, "*212@8611L611");
                list = $topCategories;
                i2 = 0;
                while (r36.hasNext()) {
                    int i11 = i2 + 1;
                    if (i2 < 0) {
                        CollectionsKt.throwIndexOverflow();
                    }
                    Map.Entry entry2 = (Map.Entry) obj;
                    int i12 = i2;
                    String str2 = (String) entry2.getKey();
                    int iIntValue4 = ((Number) entry2.getValue()).intValue();
                    float fIntValue2 = ((Number) entry2.getValue()).intValue() / iCoerceAtLeast;
                    Composer composer5 = composer2;
                    Color[] colorArr2 = new Color[i4];
                    colorArr2[0] = Color.m4356boximpl(HuiyuanDesignKt.getSignalPink());
                    colorArr2[1] = Color.m4356boximpl(HuiyuanDesignKt.getSignalPurple());
                    colorArr2[2] = Color.m4356boximpl(HuiyuanDesignKt.getSignalBlue());
                    colorArr2[3] = Color.m4356boximpl(HuiyuanDesignKt.getSignalGreen());
                    colorArr2[4] = Color.m4356boximpl(HuiyuanDesignKt.getSignalOrange());
                    colorArr2[5] = Color.m4356boximpl(HuiyuanDesignKt.getSignalRed());
                    m7417CategoryProgressBx497Mc(str2, iIntValue4, fIntValue2, ((Color) CollectionsKt.listOf((Object[]) colorArr2).get(i12 % 6)).m4376unboximpl(), composer5, 0);
                    composer2 = composer5;
                    i2 = i11;
                    list = list;
                    i4 = 6;
                }
                Composer composer6 = composer2;
                composer6.endReplaceGroup();
                ComposerKt.sourceInformationMarkerEnd(composer6);
                ComposerKt.sourceInformationMarkerEnd(composer2);
                composer.endNode();
                ComposerKt.sourceInformationMarkerEnd(composer);
                ComposerKt.sourceInformationMarkerEnd(composer);
                ComposerKt.sourceInformationMarkerEnd(composer);
                $composer.endReplaceGroup();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:40:0x025b  */
    /* JADX WARN: Code duplicated, block: B:41:0x026d  */
    /* JADX WARN: Code duplicated, block: B:44:0x02aa  */
    /* JADX WARN: Code duplicated, block: B:45:0x02bc  */
    /* JADX WARN: Code duplicated, block: B:48:0x02f5  */
    static final Unit ProfileScreen$lambda$36$lambda$35$lambda$32(boolean $isLandscape, final String $conversationText, final Context $context, final MutableState $showResetDialog$delegate, LazyItemScope item, Composer $composer, int $changed) {
        int i;
        boolean zChangedInstance;
        Object objRememberedValue;
        Object objRememberedValue2;
        Object obj;
        Object objRememberedValue3;
        Intrinsics.checkNotNullParameter(item, "$this$item");
        ComposerKt.sourceInformation($composer, "C232@9341L328,242@9682L1106:ProfileScreen.kt#cyjvf");
        if ($composer.shouldExecute(($changed & 17) != 16, $changed & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1266538206, $changed, -1, "com.luchime.huiyuan.ui.ProfileScreen.<anonymous>.<anonymous>.<anonymous> (ProfileScreen.kt:232)");
            }
            TextKt.m2820Text4IGK_g("数据与分享", PaddingKt.m726paddingVpY3zN4(Modifier.INSTANCE, Dp.m6973constructorimpl(17), $isLandscape ? Dp.m6973constructorimpl(8) : Dp.m6973constructorimpl(16)), HuiyuanDesignKt.getInk(), TextUnitKt.getSp(15), (FontStyle) null, FontWeight.INSTANCE.getBlack(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, $composer, 200070, 0, 131024);
            Modifier modifierM727paddingVpY3zN4$default = PaddingKt.m727paddingVpY3zN4$default(Modifier.INSTANCE, Dp.m6973constructorimpl(16), 0.0f, 2, null);
            Arrangement.Vertical verticalM606spacedBy0680j_4 = Arrangement.INSTANCE.m606spacedBy0680j_4(Dp.m6973constructorimpl(10));
            ComposerKt.sourceInformationMarkerStart($composer, -483455358, "CC(Column)P(2,3,1)87@4442L61,88@4508L133:Column.kt#2w3rfo");
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(verticalM606spacedBy0680j_4, Alignment.INSTANCE.getStart(), $composer, ((54 >> 3) & 14) | ((54 >> 3) & 112));
            ComposerKt.sourceInformationMarkerStart($composer, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash($composer, 0);
            CompositionLocalMap currentCompositionLocalMap = $composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier($composer, modifierM727paddingVpY3zN4$default);
            Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
            int i2 = ((((54 << 3) & 112) << 6) & 896) | 6;
            ComposerKt.sourceInformationMarkerStart($composer, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
            if (!($composer.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            $composer.startReusableNode();
            if ($composer.getInserting()) {
                $composer.createNode(constructor);
            } else {
                $composer.useNode();
            }
            Composer composerM3808constructorimpl = Updater.m3808constructorimpl($composer);
            Updater.m3815setimpl(composerM3808constructorimpl, measurePolicyColumnMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m3815setimpl(composerM3808constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (composerM3808constructorimpl.getInserting()) {
                i = 54;
            } else {
                i = 54;
                if (!Intrinsics.areEqual(composerM3808constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                }
                Updater.m3815setimpl(composerM3808constructorimpl, modifierMaterializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
                int i3 = (i2 >> 6) & 14;
                ComposerKt.sourceInformationMarkerStart($composer, -384672921, "C89@4556L9:Column.kt#2w3rfo");
                ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                int i4 = ((i >> 6) & 112) | 6;
                ComposerKt.sourceInformationMarkerStart($composer, -939095690, "C252@10121L52,246@9853L338,260@10453L2,254@10208L265,268@10730L26,262@10490L284:ProfileScreen.kt#cyjvf");
                long signalGreen = HuiyuanDesignKt.getSignalGreen();
                boolean z = !StringsKt.isBlank($conversationText);
                ComposerKt.sourceInformationMarkerStart($composer, -1692853688, "CC(remember):ProfileScreen.kt#9igjgp");
                zChangedInstance = $composer.changedInstance($context) | $composer.changed($conversationText);
                objRememberedValue = $composer.rememberedValue();
                if (!zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new Function0() { // from class: com.luchime.huiyuan.ui.ProfileScreenKt$$ExternalSyntheticLambda17
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return ProfileScreenKt.ProfileScreen$lambda$36$lambda$35$lambda$32$lambda$31$lambda$26$lambda$25($context, $conversationText);
                        }
                    };
                    $composer.updateRememberedValue(objRememberedValue);
                }
                ComposerKt.sourceInformationMarkerEnd($composer);
                m7419SettingsRowuDo3WH8("↗", "分享当前对话", "导出为纯文本，通过系统分享给其他应用", signalGreen, z, (Function0) objRememberedValue, $composer, 3510);
                long signalYellow = HuiyuanDesignKt.getSignalYellow();
                ComposerKt.sourceInformationMarkerStart($composer, -1692843114, "CC(remember):ProfileScreen.kt#9igjgp");
                objRememberedValue2 = $composer.rememberedValue();
                if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    Object obj2 = new Function0() { // from class: com.luchime.huiyuan.ui.ProfileScreenKt$$ExternalSyntheticLambda18
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return Unit.INSTANCE;
                        }
                    };
                    $composer.updateRememberedValue(obj2);
                    obj = obj2;
                } else {
                    obj = objRememberedValue2;
                }
                ComposerKt.sourceInformationMarkerEnd($composer);
                m7419SettingsRowuDo3WH8("⌁", "本地数据", "对话、收藏和统计保存在此设备，不需要账号", signalYellow, false, (Function0) obj, $composer, 224694);
                long signalRed = HuiyuanDesignKt.getSignalRed();
                ComposerKt.sourceInformationMarkerStart($composer, -1692834226, "CC(remember):ProfileScreen.kt#9igjgp");
                objRememberedValue3 = $composer.rememberedValue();
                if (objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                    Object obj3 = new Function0() { // from class: com.luchime.huiyuan.ui.ProfileScreenKt$$ExternalSyntheticLambda19
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return ProfileScreenKt.ProfileScreen$lambda$36$lambda$35$lambda$32$lambda$31$lambda$30$lambda$29($showResetDialog$delegate);
                        }
                    };
                    $composer.updateRememberedValue(obj3);
                    objRememberedValue3 = obj3;
                }
                ComposerKt.sourceInformationMarkerEnd($composer);
                m7419SettingsRowuDo3WH8("×", "清除全部数据", "删除对话、收藏、统计和连续使用记录", signalRed, true, (Function0) objRememberedValue3, $composer, 224694);
                ComposerKt.sourceInformationMarkerEnd($composer);
                ComposerKt.sourceInformationMarkerEnd($composer);
                $composer.endNode();
                ComposerKt.sourceInformationMarkerEnd($composer);
                ComposerKt.sourceInformationMarkerEnd($composer);
                ComposerKt.sourceInformationMarkerEnd($composer);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
            composerM3808constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
            composerM3808constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            Updater.m3815setimpl(composerM3808constructorimpl, modifierMaterializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
            int i5 = (i2 >> 6) & 14;
            ComposerKt.sourceInformationMarkerStart($composer, -384672921, "C89@4556L9:Column.kt#2w3rfo");
            ColumnScopeInstance columnScopeInstance2 = ColumnScopeInstance.INSTANCE;
            int i6 = ((i >> 6) & 112) | 6;
            ComposerKt.sourceInformationMarkerStart($composer, -939095690, "C252@10121L52,246@9853L338,260@10453L2,254@10208L265,268@10730L26,262@10490L284:ProfileScreen.kt#cyjvf");
            long signalGreen2 = HuiyuanDesignKt.getSignalGreen();
            boolean z2 = !StringsKt.isBlank($conversationText);
            ComposerKt.sourceInformationMarkerStart($composer, -1692853688, "CC(remember):ProfileScreen.kt#9igjgp");
            zChangedInstance = $composer.changedInstance($context) | $composer.changed($conversationText);
            objRememberedValue = $composer.rememberedValue();
            if (!zChangedInstance) {
            }
            objRememberedValue = new Function0() { // from class: com.luchime.huiyuan.ui.ProfileScreenKt$$ExternalSyntheticLambda17
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return ProfileScreenKt.ProfileScreen$lambda$36$lambda$35$lambda$32$lambda$31$lambda$26$lambda$25($context, $conversationText);
                }
            };
            $composer.updateRememberedValue(objRememberedValue);
            ComposerKt.sourceInformationMarkerEnd($composer);
            m7419SettingsRowuDo3WH8("↗", "分享当前对话", "导出为纯文本，通过系统分享给其他应用", signalGreen2, z2, (Function0) objRememberedValue, $composer, 3510);
            long signalYellow2 = HuiyuanDesignKt.getSignalYellow();
            ComposerKt.sourceInformationMarkerStart($composer, -1692843114, "CC(remember):ProfileScreen.kt#9igjgp");
            objRememberedValue2 = $composer.rememberedValue();
            if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                Object obj4 = new Function0() { // from class: com.luchime.huiyuan.ui.ProfileScreenKt$$ExternalSyntheticLambda18
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return Unit.INSTANCE;
                    }
                };
                $composer.updateRememberedValue(obj4);
                obj = obj4;
            } else {
                obj = objRememberedValue2;
            }
            ComposerKt.sourceInformationMarkerEnd($composer);
            m7419SettingsRowuDo3WH8("⌁", "本地数据", "对话、收藏和统计保存在此设备，不需要账号", signalYellow2, false, (Function0) obj, $composer, 224694);
            long signalRed2 = HuiyuanDesignKt.getSignalRed();
            ComposerKt.sourceInformationMarkerStart($composer, -1692834226, "CC(remember):ProfileScreen.kt#9igjgp");
            objRememberedValue3 = $composer.rememberedValue();
            if (objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                Object obj5 = new Function0() { // from class: com.luchime.huiyuan.ui.ProfileScreenKt$$ExternalSyntheticLambda19
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return ProfileScreenKt.ProfileScreen$lambda$36$lambda$35$lambda$32$lambda$31$lambda$30$lambda$29($showResetDialog$delegate);
                    }
                };
                $composer.updateRememberedValue(obj5);
                objRememberedValue3 = obj5;
            }
            ComposerKt.sourceInformationMarkerEnd($composer);
            m7419SettingsRowuDo3WH8("×", "清除全部数据", "删除对话、收藏、统计和连续使用记录", signalRed2, true, (Function0) objRememberedValue3, $composer, 224694);
            ComposerKt.sourceInformationMarkerEnd($composer);
            ComposerKt.sourceInformationMarkerEnd($composer);
            $composer.endNode();
            ComposerKt.sourceInformationMarkerEnd($composer);
            ComposerKt.sourceInformationMarkerEnd($composer);
            ComposerKt.sourceInformationMarkerEnd($composer);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    static final Unit ProfileScreen$lambda$36$lambda$35$lambda$32$lambda$31$lambda$26$lambda$25(Context $context, String $conversationText) {
        HuiyuanDesignKt.shareText($context, "603视界 对话", $conversationText);
        return Unit.INSTANCE;
    }

    static final Unit ProfileScreen$lambda$36$lambda$35$lambda$32$lambda$31$lambda$30$lambda$29(MutableState $showResetDialog$delegate) {
        ProfileScreen$lambda$2($showResetDialog$delegate, true);
        return Unit.INSTANCE;
    }

    static final Unit ProfileScreen$lambda$36$lambda$35$lambda$34(boolean $isLandscape, int $lexiconCount, int $dimensionCount, int $entriesPerDimension, LazyItemScope item, Composer $composer, int $changed) {
        Function0<ComposeUiNode> function0;
        Intrinsics.checkNotNullParameter(item, "$this$item");
        ComposerKt.sourceInformation($composer, "C274@10827L544:ProfileScreen.kt#cyjvf");
        if ($composer.shouldExecute(($changed & 17) != 16, $changed & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1212941601, $changed, -1, "com.luchime.huiyuan.ui.ProfileScreen.<anonymous>.<anonymous>.<anonymous> (ProfileScreen.kt:274)");
            }
            Modifier modifierM729paddingqDBjuR0$default = PaddingKt.m729paddingqDBjuR0$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), 0.0f, $isLandscape ? Dp.m6973constructorimpl(12) : Dp.m6973constructorimpl(24), 0.0f, 0.0f, 13, null);
            Alignment.Horizontal centerHorizontally = Alignment.INSTANCE.getCenterHorizontally();
            ComposerKt.sourceInformationMarkerStart($composer, -483455358, "CC(Column)P(2,3,1)87@4442L61,88@4508L133:Column.kt#2w3rfo");
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), centerHorizontally, $composer, ((384 >> 3) & 14) | ((384 >> 3) & 112));
            ComposerKt.sourceInformationMarkerStart($composer, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash($composer, 0);
            CompositionLocalMap currentCompositionLocalMap = $composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier($composer, modifierM729paddingqDBjuR0$default);
            Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
            int i = ((((384 << 3) & 112) << 6) & 896) | 6;
            ComposerKt.sourceInformationMarkerStart($composer, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
            if (!($composer.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            $composer.startReusableNode();
            if ($composer.getInserting()) {
                function0 = constructor;
                $composer.createNode(function0);
            } else {
                function0 = constructor;
                $composer.useNode();
            }
            Composer composerM3808constructorimpl = Updater.m3808constructorimpl($composer);
            Updater.m3815setimpl(composerM3808constructorimpl, measurePolicyColumnMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m3815setimpl(composerM3808constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (composerM3808constructorimpl.getInserting() || !Intrinsics.areEqual(composerM3808constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM3808constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM3808constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m3815setimpl(composerM3808constructorimpl, modifierMaterializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
            int i2 = (i >> 6) & 14;
            ComposerKt.sourceInformationMarkerStart($composer, -384672921, "C89@4556L9:Column.kt#2w3rfo");
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            int i3 = ((384 >> 6) & 112) | 6;
            ComposerKt.sourceInformationMarkerStart($composer, 2020478006, "C280@11077L73,281@11167L190:ProfileScreen.kt#cyjvf");
            TextKt.m2820Text4IGK_g("603AI·Android1.0.0", (Modifier) null, HuiyuanDesignKt.getInk(), 0L, (FontStyle) null, FontWeight.INSTANCE.getBlack(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, $composer, 196998, 0, 131034);
            TextKt.m2820Text4IGK_g($lexiconCount + " 条语料 · " + $dimensionCount + " 个维度 · 每类 " + $entriesPerDimension + " 条", (Modifier) null, HuiyuanDesignKt.getMutedText(), TextUnitKt.getSp(11), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, $composer, 3456, 0, 131058);
            ComposerKt.sourceInformationMarkerEnd($composer);
            ComposerKt.sourceInformationMarkerEnd($composer);
            $composer.endNode();
            ComposerKt.sourceInformationMarkerEnd($composer);
            ComposerKt.sourceInformationMarkerEnd($composer);
            ComposerKt.sourceInformationMarkerEnd($composer);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    static final Unit ProfileScreen$lambda$38$lambda$37(MutableState $showResetDialog$delegate) {
        ProfileScreen$lambda$2($showResetDialog$delegate, false);
        return Unit.INSTANCE;
    }

    static final Unit ProfileScreen$lambda$41(final AppHaptics $haptics, final Function0 $onResetEverything, final MutableState $showResetDialog$delegate, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C296@11694L162,296@11673L251:ProfileScreen.kt#cyjvf");
        if (!$composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(729865442, $changed, -1, "com.luchime.huiyuan.ui.ProfileScreen.<anonymous> (ProfileScreen.kt:296)");
            }
            ComposerKt.sourceInformationMarkerStart($composer, 1321021924, "CC(remember):ProfileScreen.kt#9igjgp");
            boolean zChangedInstance = $composer.changedInstance($haptics) | $composer.changed($onResetEverything);
            Object objRememberedValue = $composer.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                Object obj = new Function0() { // from class: com.luchime.huiyuan.ui.ProfileScreenKt$$ExternalSyntheticLambda16
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return ProfileScreenKt.ProfileScreen$lambda$41$lambda$40$lambda$39($haptics, $onResetEverything, $showResetDialog$delegate);
                    }
                };
                $composer.updateRememberedValue(obj);
                objRememberedValue = obj;
            }
            ComposerKt.sourceInformationMarkerEnd($composer);
            ButtonKt.TextButton((Function0) objRememberedValue, null, false, null, null, null, null, null, null, ComposableSingletons$ProfileScreenKt.INSTANCE.m7411getLambda$49090299$app(), $composer, 805306368, 510);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    static final Unit ProfileScreen$lambda$41$lambda$40$lambda$39(AppHaptics $haptics, Function0 $onResetEverything, MutableState $showResetDialog$delegate) {
        $haptics.perform(HapticCue.DESTRUCTIVE);
        ProfileScreen$lambda$2($showResetDialog$delegate, false);
        $onResetEverything.invoke();
        return Unit.INSTANCE;
    }

    static final Unit ProfileScreen$lambda$44(final AppHaptics $haptics, final MutableState $showResetDialog$delegate, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C303@12007L114,303@11986L164:ProfileScreen.kt#cyjvf");
        if ($composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(656280864, $changed, -1, "com.luchime.huiyuan.ui.ProfileScreen.<anonymous> (ProfileScreen.kt:303)");
            }
            ComposerKt.sourceInformationMarkerStart($composer, -674280846, "CC(remember):ProfileScreen.kt#9igjgp");
            boolean zChangedInstance = $composer.changedInstance($haptics);
            Object objRememberedValue = $composer.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                Object obj = new Function0() { // from class: com.luchime.huiyuan.ui.ProfileScreenKt$$ExternalSyntheticLambda20
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return ProfileScreenKt.ProfileScreen$lambda$44$lambda$43$lambda$42($haptics, $showResetDialog$delegate);
                    }
                };
                $composer.updateRememberedValue(obj);
                objRememberedValue = obj;
            }
            ComposerKt.sourceInformationMarkerEnd($composer);
            ButtonKt.TextButton((Function0) objRememberedValue, null, false, null, null, null, null, null, null, ComposableSingletons$ProfileScreenKt.INSTANCE.m7409getLambda$122674877$app(), $composer, 805306368, 510);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    static final Unit ProfileScreen$lambda$44$lambda$43$lambda$42(AppHaptics $haptics, MutableState $showResetDialog$delegate) {
        $haptics.perform(HapticCue.TAP);
        ProfileScreen$lambda$2($showResetDialog$delegate, false);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: StatCard-uDo3WH8, reason: not valid java name */
    private static final void m7420StatCarduDo3WH8(final String label, final String value, final String unit, final long color, Modifier modifier, Composer $composer, final int $changed, final int i) {
        long j;
        final Modifier modifier2;
        Modifier modifier3;
        Composer $composer2 = $composer.startRestartGroup(1170720977);
        ComposerKt.sourceInformation($composer2, "C(StatCard)P(1,4,3,0:c#ui.graphics.Color)322@12468L415,322@12417L466:ProfileScreen.kt#cyjvf");
        int $dirty = $changed;
        if (($changed & 6) == 0) {
            $dirty |= $composer2.changed(label) ? 4 : 2;
        }
        if (($changed & 48) == 0) {
            $dirty |= $composer2.changed(value) ? 32 : 16;
        }
        if (($changed & 384) == 0) {
            $dirty |= $composer2.changed(unit) ? 256 : 128;
        }
        if (($changed & 3072) == 0) {
            j = color;
            $dirty |= $composer2.changed(j) ? 2048 : 1024;
        } else {
            j = color;
        }
        int i2 = i & 16;
        if (i2 != 0) {
            $dirty |= 24576;
            modifier2 = modifier;
        } else if (($changed & 24576) == 0) {
            modifier2 = modifier;
            $dirty |= $composer2.changed(modifier2) ? 16384 : 8192;
        } else {
            modifier2 = modifier;
        }
        int $dirty2 = $dirty;
        if (!$composer2.shouldExecute(($dirty2 & 9363) != 9362, $dirty2 & 1)) {
            $composer2.skipToGroupEnd();
        } else {
            if (i2 != 0) {
                modifier3 = Modifier.INSTANCE;
            } else {
                modifier3 = modifier2;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1170720977, $dirty2, -1, "com.luchime.huiyuan.ui.StatCard (ProfileScreen.kt:321)");
            }
            HuiyuanDesignKt.m7414RetroCard3IgeMak(modifier3, j, ComposableLambdaKt.rememberComposableLambda(353025383, true, new Function3() { // from class: com.luchime.huiyuan.ui.ProfileScreenKt$$ExternalSyntheticLambda23
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    return ProfileScreenKt.StatCard_uDo3WH8$lambda$48(label, value, unit, (BoxScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
                }
            }, $composer2, 54), $composer2, (($dirty2 >> 12) & 14) | 384 | (($dirty2 >> 6) & 112), 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier2 = modifier3;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = $composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.luchime.huiyuan.ui.ProfileScreenKt$$ExternalSyntheticLambda24
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return ProfileScreenKt.StatCard_uDo3WH8$lambda$49(label, value, unit, color, modifier2, $changed, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX WARN: Code duplicated, block: B:28:0x01f2  */
    /* JADX WARN: Code duplicated, block: B:31:0x01fe  */
    /* JADX WARN: Code duplicated, block: B:32:0x0204  */
    /* JADX WARN: Code duplicated, block: B:35:0x0235  */
    /* JADX WARN: Code duplicated, block: B:38:0x0248  */
    /* JADX WARN: Code duplicated, block: B:39:0x024b  */
    /* JADX WARN: Code duplicated, block: B:43:0x0349  */
    static final Unit StatCard_uDo3WH8$lambda$48(String $label, String $value, String $unit, BoxScope RetroCard, Composer $composer, int $changed) {
        Function0<ComposeUiNode> function0;
        int i;
        int currentCompositeKeyHash;
        Function0<ComposeUiNode> constructor;
        Function0<ComposeUiNode> function1;
        Composer composerM3808constructorimpl;
        Composer composer;
        Intrinsics.checkNotNullParameter(RetroCard, "$this$RetroCard");
        ComposerKt.sourceInformation($composer, "C323@12478L399:ProfileScreen.kt#cyjvf");
        if (!$composer.shouldExecute(($changed & 17) != 16, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(353025383, $changed, -1, "com.luchime.huiyuan.ui.StatCard.<anonymous> (ProfileScreen.kt:323)");
            }
            ComposerKt.sourceInformationMarkerStart($composer, -483455358, "CC(Column)P(2,3,1)87@4442L61,88@4508L133:Column.kt#2w3rfo");
            Modifier modifier = Modifier.INSTANCE;
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), $composer, ((0 >> 3) & 14) | ((0 >> 3) & 112));
            ComposerKt.sourceInformationMarkerStart($composer, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
            int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash($composer, 0);
            CompositionLocalMap currentCompositionLocalMap = $composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier($composer, modifier);
            Function0<ComposeUiNode> constructor2 = ComposeUiNode.INSTANCE.getConstructor();
            int i2 = ((((0 << 3) & 112) << 6) & 896) | 6;
            ComposerKt.sourceInformationMarkerStart($composer, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
            if (!($composer.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            $composer.startReusableNode();
            if ($composer.getInserting()) {
                function0 = constructor2;
                $composer.createNode(function0);
            } else {
                function0 = constructor2;
                $composer.useNode();
            }
            Composer composerM3808constructorimpl2 = Updater.m3808constructorimpl($composer);
            Updater.m3815setimpl(composerM3808constructorimpl2, measurePolicyColumnMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m3815setimpl(composerM3808constructorimpl2, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (composerM3808constructorimpl2.getInserting()) {
                i = 0;
            } else {
                i = 0;
                if (!Intrinsics.areEqual(composerM3808constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                }
                Updater.m3815setimpl(composerM3808constructorimpl2, modifierMaterializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
                int i3 = (i2 >> 6) & 14;
                ComposerKt.sourceInformationMarkerStart($composer, -384672921, "C89@4556L9:Column.kt#2w3rfo");
                ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                int i4 = ((i >> 6) & 112) | 6;
                ComposerKt.sourceInformationMarkerStart($composer, -1365211518, "C324@12499L72,325@12584L283:ProfileScreen.kt#cyjvf");
                TextKt.m2820Text4IGK_g($label, (Modifier) null, HuiyuanDesignKt.getInk(), TextUnitKt.getSp(11), (FontStyle) null, FontWeight.INSTANCE.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, $composer, 200064, 0, 131026);
                Alignment.Vertical bottom = Alignment.INSTANCE.getBottom();
                ComposerKt.sourceInformationMarkerStart($composer, 693286680, "CC(Row)P(2,1,3)99@5124L58,100@5187L130:Row.kt#2w3rfo");
                Modifier modifier2 = Modifier.INSTANCE;
                MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), bottom, $composer, ((384 >> 3) & 14) | ((384 >> 3) & 112));
                ComposerKt.sourceInformationMarkerStart($composer, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash($composer, 0);
                CompositionLocalMap currentCompositionLocalMap2 = $composer.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier($composer, modifier2);
                constructor = ComposeUiNode.INSTANCE.getConstructor();
                int i5 = ((((384 << 3) & 112) << 6) & 896) | 6;
                ComposerKt.sourceInformationMarkerStart($composer, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
                if (!($composer.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                $composer.startReusableNode();
                if ($composer.getInserting()) {
                    function1 = constructor;
                    $composer.createNode(function1);
                } else {
                    function1 = constructor;
                    $composer.useNode();
                }
                composerM3808constructorimpl = Updater.m3808constructorimpl($composer);
                Updater.m3815setimpl(composerM3808constructorimpl, measurePolicyRowMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m3815setimpl(composerM3808constructorimpl, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                if (!composerM3808constructorimpl.getInserting()) {
                    composer = $composer;
                    if (!Intrinsics.areEqual(composerM3808constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    }
                    Updater.m3815setimpl(composerM3808constructorimpl, modifierMaterializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
                    int i6 = (i5 >> 6) & 14;
                    Composer composer2 = composer;
                    ComposerKt.sourceInformationMarkerStart(composer2, -407735110, "C101@5232L9:Row.kt#2w3rfo");
                    RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                    int i7 = ((384 >> 6) & 112) | 6;
                    ComposerKt.sourceInformationMarkerStart(composer2, -1837043931, "C326@12644L93,327@12754L99:ProfileScreen.kt#cyjvf");
                    TextKt.m2820Text4IGK_g($value, (Modifier) null, HuiyuanDesignKt.getInk(), TextUnitKt.getSp(29), (FontStyle) null, FontWeight.INSTANCE.getBlack(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, TextUnitKt.getSp(31), 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, 200064, 6, 130002);
                    TextKt.m2820Text4IGK_g($unit, PaddingKt.m729paddingqDBjuR0$default(Modifier.INSTANCE, Dp.m6973constructorimpl(3), 0.0f, 0.0f, Dp.m6973constructorimpl(3), 6, null), HuiyuanDesignKt.getInk(), TextUnitKt.getSp(11), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, 3504, 0, 131056);
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    composer.endNode();
                    ComposerKt.sourceInformationMarkerEnd(composer);
                    ComposerKt.sourceInformationMarkerEnd(composer);
                    ComposerKt.sourceInformationMarkerEnd(composer);
                    ComposerKt.sourceInformationMarkerEnd($composer);
                    ComposerKt.sourceInformationMarkerEnd($composer);
                    $composer.endNode();
                    ComposerKt.sourceInformationMarkerEnd($composer);
                    ComposerKt.sourceInformationMarkerEnd($composer);
                    ComposerKt.sourceInformationMarkerEnd($composer);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer = $composer;
                }
                composerM3808constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM3808constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash2);
                Updater.m3815setimpl(composerM3808constructorimpl, modifierMaterializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
                int i8 = (i5 >> 6) & 14;
                Composer composer3 = composer;
                ComposerKt.sourceInformationMarkerStart(composer3, -407735110, "C101@5232L9:Row.kt#2w3rfo");
                RowScopeInstance rowScopeInstance2 = RowScopeInstance.INSTANCE;
                int i9 = ((384 >> 6) & 112) | 6;
                ComposerKt.sourceInformationMarkerStart(composer3, -1837043931, "C326@12644L93,327@12754L99:ProfileScreen.kt#cyjvf");
                TextKt.m2820Text4IGK_g($value, (Modifier) null, HuiyuanDesignKt.getInk(), TextUnitKt.getSp(29), (FontStyle) null, FontWeight.INSTANCE.getBlack(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, TextUnitKt.getSp(31), 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer3, 200064, 6, 130002);
                TextKt.m2820Text4IGK_g($unit, PaddingKt.m729paddingqDBjuR0$default(Modifier.INSTANCE, Dp.m6973constructorimpl(3), 0.0f, 0.0f, Dp.m6973constructorimpl(3), 6, null), HuiyuanDesignKt.getInk(), TextUnitKt.getSp(11), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer3, 3504, 0, 131056);
                ComposerKt.sourceInformationMarkerEnd(composer3);
                ComposerKt.sourceInformationMarkerEnd(composer3);
                composer.endNode();
                ComposerKt.sourceInformationMarkerEnd(composer);
                ComposerKt.sourceInformationMarkerEnd(composer);
                ComposerKt.sourceInformationMarkerEnd(composer);
                ComposerKt.sourceInformationMarkerEnd($composer);
                ComposerKt.sourceInformationMarkerEnd($composer);
                $composer.endNode();
                ComposerKt.sourceInformationMarkerEnd($composer);
                ComposerKt.sourceInformationMarkerEnd($composer);
                ComposerKt.sourceInformationMarkerEnd($composer);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
            composerM3808constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
            composerM3808constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash);
            Updater.m3815setimpl(composerM3808constructorimpl2, modifierMaterializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
            int i10 = (i2 >> 6) & 14;
            ComposerKt.sourceInformationMarkerStart($composer, -384672921, "C89@4556L9:Column.kt#2w3rfo");
            ColumnScopeInstance columnScopeInstance2 = ColumnScopeInstance.INSTANCE;
            int i11 = ((i >> 6) & 112) | 6;
            ComposerKt.sourceInformationMarkerStart($composer, -1365211518, "C324@12499L72,325@12584L283:ProfileScreen.kt#cyjvf");
            TextKt.m2820Text4IGK_g($label, (Modifier) null, HuiyuanDesignKt.getInk(), TextUnitKt.getSp(11), (FontStyle) null, FontWeight.INSTANCE.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, $composer, 200064, 0, 131026);
            Alignment.Vertical bottom2 = Alignment.INSTANCE.getBottom();
            ComposerKt.sourceInformationMarkerStart($composer, 693286680, "CC(Row)P(2,1,3)99@5124L58,100@5187L130:Row.kt#2w3rfo");
            Modifier modifier3 = Modifier.INSTANCE;
            MeasurePolicy measurePolicyRowMeasurePolicy2 = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), bottom2, $composer, ((384 >> 3) & 14) | ((384 >> 3) & 112));
            ComposerKt.sourceInformationMarkerStart($composer, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
            currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash($composer, 0);
            CompositionLocalMap currentCompositionLocalMap3 = $composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier($composer, modifier3);
            constructor = ComposeUiNode.INSTANCE.getConstructor();
            int i12 = ((((384 << 3) & 112) << 6) & 896) | 6;
            ComposerKt.sourceInformationMarkerStart($composer, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
            if (!($composer.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            $composer.startReusableNode();
            if ($composer.getInserting()) {
                function1 = constructor;
                $composer.createNode(function1);
            } else {
                function1 = constructor;
                $composer.useNode();
            }
            composerM3808constructorimpl = Updater.m3808constructorimpl($composer);
            Updater.m3815setimpl(composerM3808constructorimpl, measurePolicyRowMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m3815setimpl(composerM3808constructorimpl, currentCompositionLocalMap3, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (!composerM3808constructorimpl.getInserting()) {
                composer = $composer;
                if (!Intrinsics.areEqual(composerM3808constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                }
                Updater.m3815setimpl(composerM3808constructorimpl, modifierMaterializeModifier3, ComposeUiNode.INSTANCE.getSetModifier());
                int i13 = (i12 >> 6) & 14;
                Composer composer4 = composer;
                ComposerKt.sourceInformationMarkerStart(composer4, -407735110, "C101@5232L9:Row.kt#2w3rfo");
                RowScopeInstance rowScopeInstance3 = RowScopeInstance.INSTANCE;
                int i14 = ((384 >> 6) & 112) | 6;
                ComposerKt.sourceInformationMarkerStart(composer4, -1837043931, "C326@12644L93,327@12754L99:ProfileScreen.kt#cyjvf");
                TextKt.m2820Text4IGK_g($value, (Modifier) null, HuiyuanDesignKt.getInk(), TextUnitKt.getSp(29), (FontStyle) null, FontWeight.INSTANCE.getBlack(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, TextUnitKt.getSp(31), 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer4, 200064, 6, 130002);
                TextKt.m2820Text4IGK_g($unit, PaddingKt.m729paddingqDBjuR0$default(Modifier.INSTANCE, Dp.m6973constructorimpl(3), 0.0f, 0.0f, Dp.m6973constructorimpl(3), 6, null), HuiyuanDesignKt.getInk(), TextUnitKt.getSp(11), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer4, 3504, 0, 131056);
                ComposerKt.sourceInformationMarkerEnd(composer4);
                ComposerKt.sourceInformationMarkerEnd(composer4);
                composer.endNode();
                ComposerKt.sourceInformationMarkerEnd(composer);
                ComposerKt.sourceInformationMarkerEnd(composer);
                ComposerKt.sourceInformationMarkerEnd(composer);
                ComposerKt.sourceInformationMarkerEnd($composer);
                ComposerKt.sourceInformationMarkerEnd($composer);
                $composer.endNode();
                ComposerKt.sourceInformationMarkerEnd($composer);
                ComposerKt.sourceInformationMarkerEnd($composer);
                ComposerKt.sourceInformationMarkerEnd($composer);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            } else {
                composer = $composer;
            }
            composerM3808constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
            composerM3808constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash3);
            Updater.m3815setimpl(composerM3808constructorimpl, modifierMaterializeModifier3, ComposeUiNode.INSTANCE.getSetModifier());
            int i15 = (i12 >> 6) & 14;
            Composer composer5 = composer;
            ComposerKt.sourceInformationMarkerStart(composer5, -407735110, "C101@5232L9:Row.kt#2w3rfo");
            RowScopeInstance rowScopeInstance4 = RowScopeInstance.INSTANCE;
            int i16 = ((384 >> 6) & 112) | 6;
            ComposerKt.sourceInformationMarkerStart(composer5, -1837043931, "C326@12644L93,327@12754L99:ProfileScreen.kt#cyjvf");
            TextKt.m2820Text4IGK_g($value, (Modifier) null, HuiyuanDesignKt.getInk(), TextUnitKt.getSp(29), (FontStyle) null, FontWeight.INSTANCE.getBlack(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, TextUnitKt.getSp(31), 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer5, 200064, 6, 130002);
            TextKt.m2820Text4IGK_g($unit, PaddingKt.m729paddingqDBjuR0$default(Modifier.INSTANCE, Dp.m6973constructorimpl(3), 0.0f, 0.0f, Dp.m6973constructorimpl(3), 6, null), HuiyuanDesignKt.getInk(), TextUnitKt.getSp(11), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer5, 3504, 0, 131056);
            ComposerKt.sourceInformationMarkerEnd(composer5);
            ComposerKt.sourceInformationMarkerEnd(composer5);
            composer.endNode();
            ComposerKt.sourceInformationMarkerEnd(composer);
            ComposerKt.sourceInformationMarkerEnd(composer);
            ComposerKt.sourceInformationMarkerEnd(composer);
            ComposerKt.sourceInformationMarkerEnd($composer);
            ComposerKt.sourceInformationMarkerEnd($composer);
            $composer.endNode();
            ComposerKt.sourceInformationMarkerEnd($composer);
            ComposerKt.sourceInformationMarkerEnd($composer);
            ComposerKt.sourceInformationMarkerEnd($composer);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:57:0x0225  */
    /* JADX WARN: Code duplicated, block: B:60:0x0231  */
    /* JADX WARN: Code duplicated, block: B:61:0x0237  */
    /* JADX WARN: Code duplicated, block: B:72:0x045b  */
    /* JADX WARN: Code duplicated, block: B:75:0x0467  */
    /* JADX WARN: Code duplicated, block: B:76:0x046d  */
    /* JADX WARN: Code duplicated, block: B:87:0x056c  */
    /* JADX INFO: renamed from: CategoryProgress-Bx497Mc, reason: not valid java name */
    private static final void m7417CategoryProgressBx497Mc(final String category, final int count, final float fraction, final long color, Composer $composer, final int $changed) {
        Composer $composer2;
        Function0<ComposeUiNode> function0;
        int $dirty;
        int currentCompositeKeyHash;
        Function0<ComposeUiNode> constructor;
        Function0<ComposeUiNode> function1;
        Composer composerM3808constructorimpl;
        int currentCompositeKeyHash2;
        Function0<ComposeUiNode> constructor2;
        Function0<ComposeUiNode> function2;
        Composer composerM3808constructorimpl2;
        Composer $composer3 = $composer.startRestartGroup(-152893802);
        ComposerKt.sourceInformation($composer3, "C(CategoryProgress)P(!1,2,3,1:c#ui.graphics.Color)335@12995L833:ProfileScreen.kt#cyjvf");
        int $dirty2 = $changed;
        if (($changed & 6) == 0) {
            $dirty2 |= $composer3.changed(category) ? 4 : 2;
        }
        if (($changed & 48) == 0) {
            $dirty2 |= $composer3.changed(count) ? 32 : 16;
        }
        if (($changed & 384) == 0) {
            $dirty2 |= $composer3.changed(fraction) ? 256 : 128;
        }
        if (($changed & 3072) == 0) {
            $dirty2 |= $composer3.changed(color) ? 2048 : 1024;
        }
        int $dirty3 = $dirty2;
        if (!$composer3.shouldExecute(($dirty3 & 1171) != 1170, $dirty3 & 1)) {
            $composer2 = $composer3;
            $composer2.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-152893802, $dirty3, -1, "com.luchime.huiyuan.ui.CategoryProgress (ProfileScreen.kt:334)");
            }
            ComposerKt.sourceInformationMarkerStart($composer3, -483455358, "CC(Column)P(2,3,1)87@4442L61,88@4508L133:Column.kt#2w3rfo");
            Modifier modifier = Modifier.INSTANCE;
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), $composer3, ((0 >> 3) & 14) | ((0 >> 3) & 112));
            ComposerKt.sourceInformationMarkerStart($composer3, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
            int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash($composer3, 0);
            CompositionLocalMap currentCompositionLocalMap = $composer3.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier($composer3, modifier);
            Function0<ComposeUiNode> constructor3 = ComposeUiNode.INSTANCE.getConstructor();
            int i = ((((0 << 3) & 112) << 6) & 896) | 6;
            ComposerKt.sourceInformationMarkerStart($composer3, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
            if (!($composer3.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            $composer3.startReusableNode();
            if ($composer3.getInserting()) {
                function0 = constructor3;
                $composer3.createNode(function0);
            } else {
                function0 = constructor3;
                $composer3.useNode();
            }
            Composer composerM3808constructorimpl3 = Updater.m3808constructorimpl($composer3);
            Updater.m3815setimpl(composerM3808constructorimpl3, measurePolicyColumnMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m3815setimpl(composerM3808constructorimpl3, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (composerM3808constructorimpl3.getInserting()) {
                $composer2 = $composer3;
                $dirty = $dirty3;
            } else {
                $composer2 = $composer3;
                $dirty = $dirty3;
                if (!Intrinsics.areEqual(composerM3808constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                }
                Updater.m3815setimpl(composerM3808constructorimpl3, modifierMaterializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
                int i2 = (i >> 6) & 14;
                ComposerKt.sourceInformationMarkerStart($composer3, -384672921, "C89@4556L9:Column.kt#2w3rfo");
                ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                int i3 = ((0 >> 6) & 112) | 6;
                ComposerKt.sourceInformationMarkerStart($composer3, 764478285, "C336@13012L289,343@13310L29,344@13348L474:ProfileScreen.kt#cyjvf");
                Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
                Arrangement.Horizontal spaceBetween = Arrangement.INSTANCE.getSpaceBetween();
                ComposerKt.sourceInformationMarkerStart($composer3, 693286680, "CC(Row)P(2,1,3)99@5124L58,100@5187L130:Row.kt#2w3rfo");
                MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(spaceBetween, Alignment.INSTANCE.getTop(), $composer3, ((54 >> 3) & 14) | ((54 >> 3) & 112));
                ComposerKt.sourceInformationMarkerStart($composer3, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash($composer3, 0);
                CompositionLocalMap currentCompositionLocalMap2 = $composer3.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier($composer3, modifierFillMaxWidth$default);
                constructor = ComposeUiNode.INSTANCE.getConstructor();
                int i4 = ((((54 << 3) & 112) << 6) & 896) | 6;
                ComposerKt.sourceInformationMarkerStart($composer3, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
                if (!($composer3.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                $composer3.startReusableNode();
                if ($composer3.getInserting()) {
                    function1 = constructor;
                    $composer3.createNode(function1);
                } else {
                    function1 = constructor;
                    $composer3.useNode();
                }
                composerM3808constructorimpl = Updater.m3808constructorimpl($composer3);
                Updater.m3815setimpl(composerM3808constructorimpl, measurePolicyRowMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m3815setimpl(composerM3808constructorimpl, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                if (!composerM3808constructorimpl.getInserting() || !Intrinsics.areEqual(composerM3808constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    composerM3808constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    composerM3808constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash2);
                }
                Updater.m3815setimpl(composerM3808constructorimpl, modifierMaterializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
                int i5 = (i4 >> 6) & 14;
                ComposerKt.sourceInformationMarkerStart($composer3, -407735110, "C101@5232L9:Row.kt#2w3rfo");
                RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                int i6 = ((54 >> 6) & 112) | 6;
                ComposerKt.sourceInformationMarkerStart($composer3, -1862583066, "C340@13150L75,341@13238L53:ProfileScreen.kt#cyjvf");
                TextKt.m2820Text4IGK_g(category, (Modifier) null, HuiyuanDesignKt.getInk(), TextUnitKt.getSp(12), (FontStyle) null, FontWeight.INSTANCE.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, $composer3, ($dirty & 14) | 200064, 0, 131026);
                TextKt.m2820Text4IGK_g(count + " 次", (Modifier) null, HuiyuanDesignKt.getMutedText(), TextUnitKt.getSp(11), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, $composer3, 3456, 0, 131058);
                ComposerKt.sourceInformationMarkerEnd($composer3);
                ComposerKt.sourceInformationMarkerEnd($composer3);
                $composer3.endNode();
                ComposerKt.sourceInformationMarkerEnd($composer3);
                ComposerKt.sourceInformationMarkerEnd($composer3);
                ComposerKt.sourceInformationMarkerEnd($composer3);
                SpacerKt.Spacer(SizeKt.m758height3ABfNKs(Modifier.INSTANCE, Dp.m6973constructorimpl(5)), $composer3, 6);
                Modifier modifierM245borderxT4_qwU = BorderKt.m245borderxT4_qwU(BackgroundKt.m233backgroundbw27NRU(SizeKt.m758height3ABfNKs(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), Dp.m6973constructorimpl(10)), HuiyuanDesignKt.getPaper(), RoundedCornerShapeKt.m1018RoundedCornerShape0680j_4(Dp.m6973constructorimpl(5))), Dp.m6973constructorimpl(1), HuiyuanDesignKt.getInk(), RoundedCornerShapeKt.m1018RoundedCornerShape0680j_4(Dp.m6973constructorimpl(5)));
                ComposerKt.sourceInformationMarkerStart($composer3, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                ComposerKt.sourceInformationMarkerStart($composer3, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash($composer3, 0);
                CompositionLocalMap currentCompositionLocalMap3 = $composer3.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier($composer3, modifierM245borderxT4_qwU);
                constructor2 = ComposeUiNode.INSTANCE.getConstructor();
                int i7 = ((((0 << 3) & 112) << 6) & 896) | 6;
                ComposerKt.sourceInformationMarkerStart($composer3, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
                if (!($composer3.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                $composer3.startReusableNode();
                if ($composer3.getInserting()) {
                    function2 = constructor2;
                    $composer3.createNode(function2);
                } else {
                    function2 = constructor2;
                    $composer3.useNode();
                }
                composerM3808constructorimpl2 = Updater.m3808constructorimpl($composer3);
                Updater.m3815setimpl(composerM3808constructorimpl2, measurePolicyMaybeCachedBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m3815setimpl(composerM3808constructorimpl2, currentCompositionLocalMap3, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                if (!composerM3808constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM3808constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                    composerM3808constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                    composerM3808constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash3);
                }
                Updater.m3815setimpl(composerM3808constructorimpl2, modifierMaterializeModifier3, ComposeUiNode.INSTANCE.getSetModifier());
                int i8 = (i7 >> 6) & 14;
                ComposerKt.sourceInformationMarkerStart($composer3, -2146730711, "C72@3468L9:Box.kt#2w3rfo");
                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                int i9 = ((0 >> 6) & 112) | 6;
                ComposerKt.sourceInformationMarkerStart($composer3, -593705641, "C351@13594L218:ProfileScreen.kt#cyjvf");
                BoxKt.Box(BackgroundKt.m233backgroundbw27NRU(SizeKt.m758height3ABfNKs(SizeKt.fillMaxWidth(Modifier.INSTANCE, RangesKt.coerceIn(fraction, 0.08f, 1.0f)), Dp.m6973constructorimpl(10)), color, RoundedCornerShapeKt.m1018RoundedCornerShape0680j_4(Dp.m6973constructorimpl(5))), $composer3, 0);
                ComposerKt.sourceInformationMarkerEnd($composer3);
                ComposerKt.sourceInformationMarkerEnd($composer3);
                $composer3.endNode();
                ComposerKt.sourceInformationMarkerEnd($composer3);
                ComposerKt.sourceInformationMarkerEnd($composer3);
                ComposerKt.sourceInformationMarkerEnd($composer3);
                ComposerKt.sourceInformationMarkerEnd($composer3);
                ComposerKt.sourceInformationMarkerEnd($composer3);
                $composer3.endNode();
                ComposerKt.sourceInformationMarkerEnd($composer3);
                ComposerKt.sourceInformationMarkerEnd($composer3);
                ComposerKt.sourceInformationMarkerEnd($composer3);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
            composerM3808constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
            composerM3808constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash);
            Updater.m3815setimpl(composerM3808constructorimpl3, modifierMaterializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
            int i10 = (i >> 6) & 14;
            ComposerKt.sourceInformationMarkerStart($composer3, -384672921, "C89@4556L9:Column.kt#2w3rfo");
            ColumnScopeInstance columnScopeInstance2 = ColumnScopeInstance.INSTANCE;
            int i11 = ((0 >> 6) & 112) | 6;
            ComposerKt.sourceInformationMarkerStart($composer3, 764478285, "C336@13012L289,343@13310L29,344@13348L474:ProfileScreen.kt#cyjvf");
            Modifier modifierFillMaxWidth$default2 = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
            Arrangement.Horizontal spaceBetween2 = Arrangement.INSTANCE.getSpaceBetween();
            ComposerKt.sourceInformationMarkerStart($composer3, 693286680, "CC(Row)P(2,1,3)99@5124L58,100@5187L130:Row.kt#2w3rfo");
            MeasurePolicy measurePolicyRowMeasurePolicy2 = RowKt.rowMeasurePolicy(spaceBetween2, Alignment.INSTANCE.getTop(), $composer3, ((54 >> 3) & 14) | ((54 >> 3) & 112));
            ComposerKt.sourceInformationMarkerStart($composer3, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
            currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash($composer3, 0);
            CompositionLocalMap currentCompositionLocalMap4 = $composer3.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier4 = ComposedModifierKt.materializeModifier($composer3, modifierFillMaxWidth$default2);
            constructor = ComposeUiNode.INSTANCE.getConstructor();
            int i12 = ((((54 << 3) & 112) << 6) & 896) | 6;
            ComposerKt.sourceInformationMarkerStart($composer3, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
            if (!($composer3.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            $composer3.startReusableNode();
            if ($composer3.getInserting()) {
                function1 = constructor;
                $composer3.createNode(function1);
            } else {
                function1 = constructor;
                $composer3.useNode();
            }
            composerM3808constructorimpl = Updater.m3808constructorimpl($composer3);
            Updater.m3815setimpl(composerM3808constructorimpl, measurePolicyRowMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m3815setimpl(composerM3808constructorimpl, currentCompositionLocalMap4, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash4 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (!composerM3808constructorimpl.getInserting()) {
            }
            composerM3808constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
            composerM3808constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash4);
            Updater.m3815setimpl(composerM3808constructorimpl, modifierMaterializeModifier4, ComposeUiNode.INSTANCE.getSetModifier());
            int i13 = (i12 >> 6) & 14;
            ComposerKt.sourceInformationMarkerStart($composer3, -407735110, "C101@5232L9:Row.kt#2w3rfo");
            RowScopeInstance rowScopeInstance2 = RowScopeInstance.INSTANCE;
            int i14 = ((54 >> 6) & 112) | 6;
            ComposerKt.sourceInformationMarkerStart($composer3, -1862583066, "C340@13150L75,341@13238L53:ProfileScreen.kt#cyjvf");
            TextKt.m2820Text4IGK_g(category, (Modifier) null, HuiyuanDesignKt.getInk(), TextUnitKt.getSp(12), (FontStyle) null, FontWeight.INSTANCE.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, $composer3, ($dirty & 14) | 200064, 0, 131026);
            TextKt.m2820Text4IGK_g(count + " 次", (Modifier) null, HuiyuanDesignKt.getMutedText(), TextUnitKt.getSp(11), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, $composer3, 3456, 0, 131058);
            ComposerKt.sourceInformationMarkerEnd($composer3);
            ComposerKt.sourceInformationMarkerEnd($composer3);
            $composer3.endNode();
            ComposerKt.sourceInformationMarkerEnd($composer3);
            ComposerKt.sourceInformationMarkerEnd($composer3);
            ComposerKt.sourceInformationMarkerEnd($composer3);
            SpacerKt.Spacer(SizeKt.m758height3ABfNKs(Modifier.INSTANCE, Dp.m6973constructorimpl(5)), $composer3, 6);
            Modifier modifierM245borderxT4_qwU2 = BorderKt.m245borderxT4_qwU(BackgroundKt.m233backgroundbw27NRU(SizeKt.m758height3ABfNKs(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), Dp.m6973constructorimpl(10)), HuiyuanDesignKt.getPaper(), RoundedCornerShapeKt.m1018RoundedCornerShape0680j_4(Dp.m6973constructorimpl(5))), Dp.m6973constructorimpl(1), HuiyuanDesignKt.getInk(), RoundedCornerShapeKt.m1018RoundedCornerShape0680j_4(Dp.m6973constructorimpl(5)));
            ComposerKt.sourceInformationMarkerStart($composer3, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
            ComposerKt.sourceInformationMarkerStart($composer3, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
            currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash($composer3, 0);
            CompositionLocalMap currentCompositionLocalMap5 = $composer3.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier5 = ComposedModifierKt.materializeModifier($composer3, modifierM245borderxT4_qwU2);
            constructor2 = ComposeUiNode.INSTANCE.getConstructor();
            int i15 = ((((0 << 3) & 112) << 6) & 896) | 6;
            ComposerKt.sourceInformationMarkerStart($composer3, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
            if (!($composer3.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            $composer3.startReusableNode();
            if ($composer3.getInserting()) {
                function2 = constructor2;
                $composer3.createNode(function2);
            } else {
                function2 = constructor2;
                $composer3.useNode();
            }
            composerM3808constructorimpl2 = Updater.m3808constructorimpl($composer3);
            Updater.m3815setimpl(composerM3808constructorimpl2, measurePolicyMaybeCachedBoxMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m3815setimpl(composerM3808constructorimpl2, currentCompositionLocalMap5, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash5 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (!composerM3808constructorimpl2.getInserting()) {
            }
            composerM3808constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
            composerM3808constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash5);
            Updater.m3815setimpl(composerM3808constructorimpl2, modifierMaterializeModifier5, ComposeUiNode.INSTANCE.getSetModifier());
            int i16 = (i15 >> 6) & 14;
            ComposerKt.sourceInformationMarkerStart($composer3, -2146730711, "C72@3468L9:Box.kt#2w3rfo");
            BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
            int i17 = ((0 >> 6) & 112) | 6;
            ComposerKt.sourceInformationMarkerStart($composer3, -593705641, "C351@13594L218:ProfileScreen.kt#cyjvf");
            BoxKt.Box(BackgroundKt.m233backgroundbw27NRU(SizeKt.m758height3ABfNKs(SizeKt.fillMaxWidth(Modifier.INSTANCE, RangesKt.coerceIn(fraction, 0.08f, 1.0f)), Dp.m6973constructorimpl(10)), color, RoundedCornerShapeKt.m1018RoundedCornerShape0680j_4(Dp.m6973constructorimpl(5))), $composer3, 0);
            ComposerKt.sourceInformationMarkerEnd($composer3);
            ComposerKt.sourceInformationMarkerEnd($composer3);
            $composer3.endNode();
            ComposerKt.sourceInformationMarkerEnd($composer3);
            ComposerKt.sourceInformationMarkerEnd($composer3);
            ComposerKt.sourceInformationMarkerEnd($composer3);
            ComposerKt.sourceInformationMarkerEnd($composer3);
            ComposerKt.sourceInformationMarkerEnd($composer3);
            $composer3.endNode();
            ComposerKt.sourceInformationMarkerEnd($composer3);
            ComposerKt.sourceInformationMarkerEnd($composer3);
            ComposerKt.sourceInformationMarkerEnd($composer3);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = $composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.luchime.huiyuan.ui.ProfileScreenKt$$ExternalSyntheticLambda10
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return ProfileScreenKt.CategoryProgress_Bx497Mc$lambda$53(category, count, fraction, color, $changed, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: renamed from: ProfileAction-iJQMabo, reason: not valid java name */
    private static final void m7418ProfileActioniJQMabo(final String text, final long color, final Function0<Unit> function0, Composer $composer, final int $changed) {
        String str;
        Function0<Unit> function1;
        Composer $composer2;
        Composer $composer3 = $composer.startRestartGroup(511264279);
        ComposerKt.sourceInformation($composer3, "C(ProfileAction)P(2,0:c#ui.graphics.Color)363@13925L389:ProfileScreen.kt#cyjvf");
        int $dirty = $changed;
        if (($changed & 6) == 0) {
            str = text;
            $dirty |= $composer3.changed(str) ? 4 : 2;
        } else {
            str = text;
        }
        if (($changed & 48) == 0) {
            $dirty |= $composer3.changed(color) ? 32 : 16;
        }
        if (($changed & 384) == 0) {
            function1 = function0;
            $dirty |= $composer3.changedInstance(function1) ? 256 : 128;
        } else {
            function1 = function0;
        }
        if ($composer3.shouldExecute(($dirty & 147) != 146, $dirty & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(511264279, $dirty, -1, "com.luchime.huiyuan.ui.ProfileAction (ProfileScreen.kt:362)");
            }
            $composer2 = $composer3;
            TextKt.m2820Text4IGK_g(str, PaddingKt.m726paddingVpY3zN4(AppHapticsKt.hapticClickable$default(BorderKt.m245borderxT4_qwU(BackgroundKt.m233backgroundbw27NRU(Modifier.INSTANCE, color, RoundedCornerShapeKt.m1018RoundedCornerShape0680j_4(Dp.m6973constructorimpl(8))), Dp.m6973constructorimpl((float) 1.5d), HuiyuanDesignKt.getInk(), RoundedCornerShapeKt.m1018RoundedCornerShape0680j_4(Dp.m6973constructorimpl(8))), false, HapticCue.TAP, function1, 1, null), Dp.m6973constructorimpl(10), Dp.m6973constructorimpl(7)), HuiyuanDesignKt.getInk(), TextUnitKt.getSp(10), (FontStyle) null, FontWeight.INSTANCE.getBlack(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, $composer2, ($dirty & 14) | 200064, 0, 131024);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $composer2 = $composer3;
            $composer2.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = $composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.luchime.huiyuan.ui.ProfileScreenKt$$ExternalSyntheticLambda9
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return ProfileScreenKt.ProfileAction_iJQMabo$lambda$54(text, color, function0, $changed, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: renamed from: SettingsRow-uDo3WH8, reason: not valid java name */
    private static final void m7419SettingsRowuDo3WH8(final String icon, final String title, final String subtitle, final long color, final boolean enabled, final Function0<Unit> function0, Composer $composer, final int $changed) {
        String str;
        Function0<ComposeUiNode> function1;
        Function0<ComposeUiNode> function2;
        Composer $composer2 = $composer.startRestartGroup(1838941147);
        ComposerKt.sourceInformation($composer2, "C(SettingsRow)P(2,5,4,0:c#ui.graphics.Color)385@14486L996:ProfileScreen.kt#cyjvf");
        int $dirty = $changed;
        if (($changed & 6) == 0) {
            str = icon;
            $dirty |= $composer2.changed(str) ? 4 : 2;
        } else {
            str = icon;
        }
        if (($changed & 48) == 0) {
            $dirty |= $composer2.changed(title) ? 32 : 16;
        }
        if (($changed & 384) == 0) {
            $dirty |= $composer2.changed(subtitle) ? 256 : 128;
        }
        if (($changed & 3072) == 0) {
            $dirty |= $composer2.changed(color) ? 2048 : 1024;
        }
        if (($changed & 24576) == 0) {
            $dirty |= $composer2.changed(enabled) ? 16384 : 8192;
        }
        if ((196608 & $changed) == 0) {
            $dirty |= $composer2.changedInstance(function0) ? 131072 : 65536;
        }
        if ($composer2.shouldExecute((74899 & $dirty) != 74898, $dirty & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1838941147, $dirty, -1, "com.luchime.huiyuan.ui.SettingsRow (ProfileScreen.kt:384)");
            }
            Modifier modifierM725padding3ABfNKs = PaddingKt.m725padding3ABfNKs(AppHapticsKt.hapticClickable(BorderKt.m245borderxT4_qwU(BackgroundKt.m233backgroundbw27NRU(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), Color.INSTANCE.m4403getWhite0d7_KjU(), RoundedCornerShapeKt.m1018RoundedCornerShape0680j_4(Dp.m6973constructorimpl(13))), Dp.m6973constructorimpl(2), HuiyuanDesignKt.getInk(), RoundedCornerShapeKt.m1018RoundedCornerShape0680j_4(Dp.m6973constructorimpl(13))), enabled, HapticCue.TAP, function0), Dp.m6973constructorimpl(12));
            Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
            ComposerKt.sourceInformationMarkerStart($composer2, 693286680, "CC(Row)P(2,1,3)99@5124L58,100@5187L130:Row.kt#2w3rfo");
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically, $composer2, ((384 >> 3) & 14) | ((384 >> 3) & 112));
            ComposerKt.sourceInformationMarkerStart($composer2, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash($composer2, 0);
            CompositionLocalMap currentCompositionLocalMap = $composer2.getCurrentCompositionLocalMap();
            int $dirty2 = $dirty;
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier($composer2, modifierM725padding3ABfNKs);
            Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
            int i = ((((384 << 3) & 112) << 6) & 896) | 6;
            ComposerKt.sourceInformationMarkerStart($composer2, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
            if (!($composer2.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            $composer2.startReusableNode();
            if ($composer2.getInserting()) {
                function1 = constructor;
                $composer2.createNode(function1);
            } else {
                function1 = constructor;
                $composer2.useNode();
            }
            Composer composerM3808constructorimpl = Updater.m3808constructorimpl($composer2);
            Updater.m3815setimpl(composerM3808constructorimpl, measurePolicyRowMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m3815setimpl(composerM3808constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (composerM3808constructorimpl.getInserting() || !Intrinsics.areEqual(composerM3808constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM3808constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM3808constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m3815setimpl(composerM3808constructorimpl, modifierMaterializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
            int i2 = (i >> 6) & 14;
            ComposerKt.sourceInformationMarkerStart($composer2, -407735110, "C101@5232L9:Row.kt#2w3rfo");
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            int i3 = ((384 >> 6) & 112) | 6;
            ComposerKt.sourceInformationMarkerStart($composer2, 1431856737, "C394@14857L378,403@15244L232:ProfileScreen.kt#cyjvf");
            Modifier modifierM726paddingVpY3zN4 = PaddingKt.m726paddingVpY3zN4(BorderKt.m245borderxT4_qwU(BackgroundKt.m233backgroundbw27NRU(Modifier.INSTANCE, color, RoundedCornerShapeKt.m1018RoundedCornerShape0680j_4(Dp.m6973constructorimpl(9))), Dp.m6973constructorimpl((float) 1.5d), HuiyuanDesignKt.getInk(), RoundedCornerShapeKt.m1018RoundedCornerShape0680j_4(Dp.m6973constructorimpl(9))), Dp.m6973constructorimpl(11), Dp.m6973constructorimpl(7));
            Alignment center = Alignment.INSTANCE.getCenter();
            ComposerKt.sourceInformationMarkerStart($composer2, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(center, false);
            ComposerKt.sourceInformationMarkerStart($composer2, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
            int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash($composer2, 0);
            CompositionLocalMap currentCompositionLocalMap2 = $composer2.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier($composer2, modifierM726paddingVpY3zN4);
            Function0<ComposeUiNode> constructor2 = ComposeUiNode.INSTANCE.getConstructor();
            int i4 = ((((48 << 3) & 112) << 6) & 896) | 6;
            ComposerKt.sourceInformationMarkerStart($composer2, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
            if (!($composer2.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            $composer2.startReusableNode();
            if ($composer2.getInserting()) {
                function2 = constructor2;
                $composer2.createNode(function2);
            } else {
                function2 = constructor2;
                $composer2.useNode();
            }
            Composer composerM3808constructorimpl2 = Updater.m3808constructorimpl($composer2);
            Updater.m3815setimpl(composerM3808constructorimpl2, measurePolicyMaybeCachedBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m3815setimpl(composerM3808constructorimpl2, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (composerM3808constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM3808constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                composerM3808constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                composerM3808constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
            }
            Updater.m3815setimpl(composerM3808constructorimpl2, modifierMaterializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
            int i5 = (i4 >> 6) & 14;
            ComposerKt.sourceInformationMarkerStart($composer2, -2146730711, "C72@3468L9:Box.kt#2w3rfo");
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            int i6 = ((48 >> 6) & 112) | 6;
            ComposerKt.sourceInformationMarkerStart($composer2, -1691651798, "C401@15153L72:ProfileScreen.kt#cyjvf");
            TextKt.m2820Text4IGK_g(str, (Modifier) null, HuiyuanDesignKt.getInk(), TextUnitKt.getSp(19), (FontStyle) null, FontWeight.INSTANCE.getBlack(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, $composer2, ($dirty2 & 14) | 200064, 0, 131026);
            ComposerKt.sourceInformationMarkerEnd($composer2);
            ComposerKt.sourceInformationMarkerEnd($composer2);
            $composer2.endNode();
            ComposerKt.sourceInformationMarkerEnd($composer2);
            ComposerKt.sourceInformationMarkerEnd($composer2);
            ComposerKt.sourceInformationMarkerEnd($composer2);
            Modifier modifierM729paddingqDBjuR0$default = PaddingKt.m729paddingqDBjuR0$default(Modifier.INSTANCE, Dp.m6973constructorimpl(11), 0.0f, 0.0f, 0.0f, 14, null);
            ComposerKt.sourceInformationMarkerStart($composer2, -483455358, "CC(Column)P(2,3,1)87@4442L61,88@4508L133:Column.kt#2w3rfo");
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), $composer2, ((6 >> 3) & 14) | ((6 >> 3) & 112));
            ComposerKt.sourceInformationMarkerStart($composer2, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
            int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash($composer2, 0);
            CompositionLocalMap currentCompositionLocalMap3 = $composer2.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier($composer2, modifierM729paddingqDBjuR0$default);
            Function0<ComposeUiNode> constructor3 = ComposeUiNode.INSTANCE.getConstructor();
            int i7 = ((((6 << 3) & 112) << 6) & 896) | 6;
            ComposerKt.sourceInformationMarkerStart($composer2, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
            if (!($composer2.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            $composer2.startReusableNode();
            if ($composer2.getInserting()) {
                $composer2.createNode(constructor3);
            } else {
                $composer2.useNode();
            }
            Composer composerM3808constructorimpl3 = Updater.m3808constructorimpl($composer2);
            Updater.m3815setimpl(composerM3808constructorimpl3, measurePolicyColumnMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m3815setimpl(composerM3808constructorimpl3, currentCompositionLocalMap3, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (composerM3808constructorimpl3.getInserting() || !Intrinsics.areEqual(composerM3808constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                composerM3808constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                composerM3808constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
            }
            Updater.m3815setimpl(composerM3808constructorimpl3, modifierMaterializeModifier3, ComposeUiNode.INSTANCE.getSetModifier());
            int i8 = (i7 >> 6) & 14;
            ComposerKt.sourceInformationMarkerStart($composer2, -384672921, "C89@4556L9:Column.kt#2w3rfo");
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            int i9 = ((6 >> 6) & 112) | 6;
            ComposerKt.sourceInformationMarkerStart($composer2, -1221706779, "C404@15309L73,405@15395L71:ProfileScreen.kt#cyjvf");
            TextKt.m2820Text4IGK_g(title, (Modifier) null, HuiyuanDesignKt.getInk(), TextUnitKt.getSp(14), (FontStyle) null, FontWeight.INSTANCE.getBlack(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, $composer2, (($dirty2 >> 3) & 14) | 200064, 0, 131026);
            TextKt.m2820Text4IGK_g(subtitle, (Modifier) null, HuiyuanDesignKt.getMutedText(), TextUnitKt.getSp(11), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, TextUnitKt.getSp(16), 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, $composer2, (($dirty2 >> 6) & 14) | 3456, 6, 130034);
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
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $composer2.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = $composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.luchime.huiyuan.ui.ProfileScreenKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return ProfileScreenKt.SettingsRow_uDo3WH8$lambda$58(icon, title, subtitle, color, enabled, function0, $changed, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
