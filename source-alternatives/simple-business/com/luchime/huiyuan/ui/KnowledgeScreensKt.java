package com.luchime.huiyuan.ui;

import android.content.Context;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.BorderKt;
import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.layout.WindowInsetsPadding_androidKt;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material3.ButtonColors;
import androidx.compose.material3.ButtonDefaults;
import androidx.compose.material3.ButtonKt;
import androidx.compose.material3.OutlinedTextFieldKt;
import androidx.compose.material3.TextFieldDefaults;
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
import androidx.compose.runtime.saveable.RememberSaveableKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.TextUnitKt;
import androidx.profileinstaller.ProfileVerifier;
import com.luchime.huiyuan.FavoriteRecord;
import com.luchime.huiyuan.LexiconEntry;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: compiled from: KnowledgeScreens.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000H\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\"\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u000b\u001ag\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\n2\u0018\u0010\u000b\u001a\u0014\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00010\f2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00010\u000eH\u0001¢\u0006\u0002\u0010\u000f\u001a_\u0010\u0010\u001a\u00020\u00012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00110\u00032\u0006\u0010\u0007\u001a\u00020\b2\u0018\u0010\u000b\u001a\u0014\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00010\f2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00010\u000e2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00010\u0013H\u0001¢\u0006\u0002\u0010\u0014\u001ae\u0010\u0015\u001a\u00020\u00012\u0006\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0017\u001a\u00020\b2\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00010\u00132\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00010\u00132\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00010\u00132\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00010\u0013H\u0003¢\u0006\u0002\u0010\u001b\u001aU\u0010\u001c\u001a\u00020\u00012\u0006\u0010\u0017\u001a\u00020\u00112\u0006\u0010\u0007\u001a\u00020\b2\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00010\u00132\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00010\u00132\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00010\u00132\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00010\u0013H\u0003¢\u0006\u0002\u0010\u001e\u001a/\u0010\u001f\u001a\u00020\u00012\u0006\u0010 \u001a\u00020\u00062\f\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00010\u00132\b\b\u0002\u0010\"\u001a\u00020#H\u0003¢\u0006\u0004\b$\u0010%\u001a\u001b\u0010&\u001a\u00020\u00012\f\u0010'\u001a\b\u0012\u0004\u0012\u00020\u00010\u0013H\u0003¢\u0006\u0002\u0010(\u001a\u0015\u0010)\u001a\u00020#2\u0006\u0010*\u001a\u00020\u0006H\u0002¢\u0006\u0002\u0010+¨\u0006,²\u0006\n\u0010-\u001a\u00020\u0006X\u008a\u008e\u0002²\u0006\n\u0010.\u001a\u00020\u0006X\u008a\u008e\u0002"}, d2 = {"KnowledgeScreen", "", "entries", "", "Lcom/luchime/huiyuan/LexiconEntry;", "askName", "", "isLandscape", "", "favorites", "", "onToggleFavorite", "Lkotlin/Function2;", "onAsk", "Lkotlin/Function1;", "(Ljava/util/List;Ljava/lang/String;ZLjava/util/Set;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "FavoritesScreen", "Lcom/luchime/huiyuan/FavoriteRecord;", "onExplore", "Lkotlin/Function0;", "(Ljava/util/List;ZLkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "KnowledgeCard", "entry", "favorite", "onCopy", "onShare", "onFavorite", "(Lcom/luchime/huiyuan/LexiconEntry;Ljava/lang/String;ZZLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "FavoriteCard", "onRemove", "(Lcom/luchime/huiyuan/FavoriteRecord;ZLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "SmallAction", "text", "onClick", "accent", "Landroidx/compose/ui/graphics/Color;", "SmallAction-FNF3uiM", "(Ljava/lang/String;Lkotlin/jvm/functions/Function0;JLandroidx/compose/runtime/Composer;II)V", "EmptyKnowledgeResult", "onReset", "(Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "categoryColor", "category", "(Ljava/lang/String;)J", "app", "query", "selectedCategory"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class KnowledgeScreensKt {
    static final Unit EmptyKnowledgeResult$lambda$68(Function0 r1, int r2, Composer r3, int r4) {
        EmptyKnowledgeResult(r1, r3, RecomposeScopeImplKt.updateChangedFlags(r2 | 1));
        return Unit.INSTANCE;
    }

    static final Unit FavoriteCard$lambda$65(FavoriteRecord r9, boolean r10, Function0 r11, Function0 r12, Function0 r13, Function0 r14, int r15, Composer r16, int r17) {
        FavoriteCard(r9, r10, r11, r12, r13, r14, r16, RecomposeScopeImplKt.updateChangedFlags(r15 | 1));
        return Unit.INSTANCE;
    }

    static final Unit FavoritesScreen$lambda$55(List r8, boolean r9, Function2 r10, Function1 r11, Function0 r12, int r13, Composer r14, int r15) {
        FavoritesScreen(r8, r9, r10, r11, r12, r14, RecomposeScopeImplKt.updateChangedFlags(r13 | 1));
        return Unit.INSTANCE;
    }

    static final Unit KnowledgeCard$lambda$60(LexiconEntry r11, String r12, boolean r13, boolean r14, Function0 r15, Function0 r16, Function0 r17, Function0 r18, int r19, Composer r20, int r21) {
        KnowledgeCard(r11, r12, r13, r14, r15, r16, r17, r18, r20, RecomposeScopeImplKt.updateChangedFlags(r19 | 1));
        return Unit.INSTANCE;
    }

    static final Unit KnowledgeScreen$lambda$40(List r9, String r10, boolean r11, Set r12, Function2 r13, Function1 r14, int r15, Composer r16, int r17) {
        KnowledgeScreen(r9, r10, r11, r12, r13, r14, r16, RecomposeScopeImplKt.updateChangedFlags(r15 | 1));
        return Unit.INSTANCE;
    }

    static final Unit SmallAction_FNF3uiM$lambda$66(String r8, Function0 r9, long r10, int r12, int r13, Composer r14, int r15) {
        m7416SmallActionFNF3uiM(r8, r9, r10, r14, RecomposeScopeImplKt.updateChangedFlags(r12 | 1), r13);
        return Unit.INSTANCE;
    }

    public static final /* synthetic */ void access$FavoriteCard(FavoriteRecord favorite, boolean isLandscape, Function0 onCopy, Function0 onShare, Function0 onRemove, Function0 onAsk, Composer $composer, int $changed) {
        FavoriteCard(favorite, isLandscape, onCopy, onShare, onRemove, onAsk, $composer, $changed);
    }

    public static final /* synthetic */ void access$KnowledgeCard(LexiconEntry entry, String askName, boolean isLandscape, boolean favorite, Function0 onCopy, Function0 onShare, Function0 onFavorite, Function0 onAsk, Composer $composer, int $changed) {
        KnowledgeCard(entry, askName, isLandscape, favorite, onCopy, onShare, onFavorite, onAsk, $composer, $changed);
    }

    public static final void KnowledgeScreen(final List<LexiconEntry> r37, final String askName, final boolean isLandscape, final Set<String> r40, final Function2<? super String, ? super String, Unit> r41, final Function1<? super String, Unit> r42, Composer $composer, final int $changed) {
        Intrinsics.checkNotNullParameter(r37, "entries");
        Intrinsics.checkNotNullParameter(askName, "askName");
        Intrinsics.checkNotNullParameter(r40, "favorites");
        Intrinsics.checkNotNullParameter(r41, "onToggleFavorite");
        Intrinsics.checkNotNullParameter(r42, "onAsk");
        Composer $composer2 = $composer.startRestartGroup(1299067684);
        ComposerKt.sourceInformation($composer2, "C(KnowledgeScreen)P(1!1,3!1,5)53@2231L7,54@2273L22,54@2256L39,55@2341L24,55@2324L41,56@2394L53,57@2469L69,58@2558L382,75@3227L4905,68@2946L5186:KnowledgeScreens.kt#cyjvf");
        int $dirty = $changed;
        if (($changed & 6) != 0) goto L10;
        if ($composer2.changedInstance(r37) == false) goto L7;
        int r5 = 4;
    L8:
        $dirty = $dirty | r5;
        goto L10
    L7:
        r5 = 2;
    L10:
        if (($changed & 48) != 0) goto L17;
        if ($composer2.changed(askName) == false) goto L14;
        int r6 = 32;
    L15:
        $dirty = $dirty | r6;
        goto L17
    L14:
        r6 = 16;
    L17:
        if (($changed & 384) != 0) goto L24;
        if ($composer2.changed(isLandscape) == false) goto L21;
        int r7 = 256;
    L22:
        $dirty = $dirty | r7;
        goto L24
    L21:
        r7 = 128;
    L24:
        if (($changed & 3072) != 0) goto L31;
        if ($composer2.changedInstance(r40) == false) goto L28;
        int r8 = 2048;
    L29:
        $dirty = $dirty | r8;
        goto L31
    L28:
        r8 = 1024;
    L31:
        if (($changed & 24576) != 0) goto L38;
        if ($composer2.changedInstance(r41) == false) goto L35;
        int r9 = 16384;
    L36:
        $dirty = $dirty | r9;
        goto L38
    L35:
        r9 = 8192;
    L38:
        if ((196608 & $changed) != 0) goto L45;
        if ($composer2.changedInstance(r42) == false) goto L42;
        int r10 = 131072;
    L43:
        $dirty = $dirty | r10;
        goto L45
    L42:
        r10 = 65536;
    L45:
        if ((74899 & $dirty) == 74898) goto L47;
        boolean r11 = true;
    L49:
        if ($composer2.shouldExecute(r11, $dirty & 1) == true) goto L51;
        Composer $composer3 = $composer2;
        $composer3.skipToGroupEnd();
    L143:
        ScopeUpdateScope r12 = $composer3.endRestartGroup();
        if (r12 == null) goto L153;
        r12.updateScope(new KnowledgeScreensKt$$ExternalSyntheticLambda23(r37, askName, isLandscape, r40, r41, r42, $changed));
        return;
    L153:
        return;
    L51:
        if (ComposerKt.isTraceInProgress() == false) goto L53;
        ComposerKt.traceEventStart(1299067684, $dirty, -1, "com.luchime.huiyuan.ui.KnowledgeScreen (KnowledgeScreens.kt:52)");
    L53:
        ProvidableCompositionLocal<Context> r0 = AndroidCompositionLocals_androidKt.getLocalContext();
        ComposerKt.sourceInformationMarkerStart($composer2, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
        Object r13 = $composer2.consume(r0);
        ComposerKt.sourceInformationMarkerEnd($composer2);
        Context context = (Context) r13;
        Object[] r14 = new Object[0];
        ComposerKt.sourceInformationMarkerStart($composer2, -1431429094, "CC(remember):KnowledgeScreens.kt#9igjgp");
        Object r15 = $composer2.rememberedValue();
        if (r15 != Composer.Companion.getEmpty()) goto L57;
        Object r19 = new KnowledgeScreensKt$$ExternalSyntheticLambda20();
        $composer2.updateRememberedValue(r19);
        r15 = r19;
    L57:
        ComposerKt.sourceInformationMarkerEnd($composer2);
        final MutableState query$delegate = (MutableState) RememberSaveableKt.m3923rememberSaveable(r14, null, null, (Function0) r15, $composer2, 0, 6);
        Object[] r16 = new Object[0];
        ComposerKt.sourceInformationMarkerStart($composer2, -1431426916, "CC(remember):KnowledgeScreens.kt#9igjgp");
        Object r3 = $composer2.rememberedValue();
        if (r3 != Composer.Companion.getEmpty()) goto L61;
        Object r18 = new KnowledgeScreensKt$$ExternalSyntheticLambda21();
        $composer2.updateRememberedValue(r18);
        r3 = r18;
    L61:
        ComposerKt.sourceInformationMarkerEnd($composer2);
        final MutableState selectedCategory$delegate = (MutableState) RememberSaveableKt.m3923rememberSaveable(r16, null, null, (Function0) r3, $composer2, 0, 6);
        ComposerKt.sourceInformationMarkerStart($composer2, -1431425191, "CC(remember):KnowledgeScreens.kt#9igjgp");
        boolean r4 = $composer2.changed(r37);
        int r17 = 0;
        Object r110 = $composer2.rememberedValue();
        if (r4 == true) goto L68;
        if (r110 == Composer.Companion.getEmpty()) goto L68;
    L77:
        final Map entriesByCategory = (Map) r110;
        ComposerKt.sourceInformationMarkerEnd($composer2);
        ComposerKt.sourceInformationMarkerStart($composer2, -1431422775, "CC(remember):KnowledgeScreens.kt#9igjgp");
        boolean r20 = $composer2.changed(entriesByCategory);
        Object r111 = $composer2.rememberedValue();
        if (r20 == true) goto L84;
        if (r111 == Composer.Companion.getEmpty()) goto L84;
    L85:
        final List categories = (List) r111;
        ComposerKt.sourceInformationMarkerEnd($composer2);
        String r112 = KnowledgeScreen$lambda$2(query$delegate);
        String r113 = KnowledgeScreen$lambda$6(selectedCategory$delegate);
        ComposerKt.sourceInformationMarkerStart($composer2, -1431419614, "CC(remember):KnowledgeScreens.kt#9igjgp");
        boolean r114 = ($composer2.changed(r112) | ($composer2.changed(r37) | $composer2.changed(entriesByCategory))) | $composer2.changed(r113);
        int r115 = 0;
        Object r116 = $composer2.rememberedValue();
        if (r114 == false) goto L88;
    L91:
        Object r117 = StringsKt.trim(KnowledgeScreen$lambda$2(query$delegate)).toString().toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(r117, "toLowerCase(...)");
        if (Intrinsics.areEqual(KnowledgeScreen$lambda$6(selectedCategory$delegate), "全部") == false) goto L94;
        Object r21 = r37;
    L98:
        if (((CharSequence) r117).length() != 0) goto L100;
        boolean r118 = true;
    L101:
        if (r118 == false) goto L103;
        Context context2 = context;
        Object r1 = r21;
        boolean r119 = false;
    L111:
        $composer2.updateRememberedValue(r1);
        r116 = r1;
    L112:
        final List filtered = (List) r116;
        ComposerKt.sourceInformationMarkerEnd($composer2);
        boolean r120 = true;
        Modifier r121 = WindowInsetsPadding_androidKt.statusBarsPadding(BackgroundKt.m234backgroundbw27NRU$default(SizeKt.fillMaxSize$default(Modifier.Companion, 0.0f, 1, null), HuiyuanDesignKt.getPaper(), null, 2, null));
        if (isLandscape == false) goto L115;
        float r31 = Dp.m6973constructorimpl(12);
    L116:
        PaddingValues r122 = PaddingKt.m722PaddingValuesa9UjIt4$default(0.0f, 0.0f, 0.0f, r31, 7, null);
        Alignment.Horizontal r123 = Alignment.Companion.getCenterHorizontally();
        ComposerKt.sourceInformationMarkerStart($composer2, -1431393683, "CC(remember):KnowledgeScreens.kt#9igjgp");
        if (($dirty & 896) != 256) goto L119;
        boolean r22 = true;
    L120:
        boolean r23 = ((((((r22 | $composer2.changedInstance(r37)) | $composer2.changed(query$delegate)) | $composer2.changedInstance(categories)) | $composer2.changed(selectedCategory$delegate)) | $composer2.changedInstance(entriesByCategory)) | $composer2.changedInstance(filtered)) | $composer2.changedInstance(r40);
        if (($dirty & 112) != 32) goto L123;
        boolean r24 = true;
    L124:
        boolean r25 = r23 | r24;
        final Context context3 = context2;
        boolean r26 = r25 | $composer2.changedInstance(context3);
        if ((57344 & $dirty) != 16384) goto L127;
        boolean r124 = true;
    L128:
        boolean r27 = r26 | r124;
        if ((458752 & $dirty) == 131072) goto L132;
        r120 = r119;
    L132:
        boolean r28 = r27 | r120;
        Object r29 = $composer2.rememberedValue();
        if (r28 == false) goto L135;
    L138:
        Object r2 = new KnowledgeScreensKt$$ExternalSyntheticLambda22(filtered, isLandscape, r37, query$delegate, categories, entriesByCategory, selectedCategory$delegate, r40, askName, context3, r41, r42);
        $composer2.updateRememberedValue(r2);
    L139:
        ComposerKt.sourceInformationMarkerEnd($composer2);
        LazyDslKt.LazyColumn(r121, null, r122, false, null, r123, null, false, null, (Function1) r2, $composer2, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 474);
        $composer3 = $composer2;
        if (ComposerKt.isTraceInProgress() == false) goto L143;
        ComposerKt.traceEventEnd();
        goto L143
    L135:
        if (r29 == Composer.Companion.getEmpty()) goto L138;
        r2 = r29;
        goto L139
    L127:
        r124 = r119;
        goto L128
    L123:
        r24 = r119;
        goto L124
    L119:
        r22 = r119;
        goto L120
    L115:
        r31 = Dp.m6973constructorimpl(24);
        goto L116
    L103:
        Iterable r125 = (Iterable) r21;
        Collection r30 = new ArrayList();
        Iterator r32 = r125.iterator();
    L105:
        if (r32.hasNext() == false) goto L110;
        Object r33 = r117;
        Object r126 = r32.next();
        Iterable r36 = r125;
        Context context4 = context;
        int r35 = r115;
        if (StringsKt.contains$default(((LexiconEntry) r126).getSearchIndex(), (CharSequence) r33, false, 2, null) == false) goto L109;
        r30.add(r126);
    L109:
        context = context4;
        r117 = r33;
        r115 = r35;
        r125 = r36;
        goto L105
    L110:
        context2 = context;
        r119 = false;
        r1 = (List) r30;
        goto L111
    L100:
        r118 = false;
        goto L101
    L94:
        r21 = (List) entriesByCategory.get(KnowledgeScreen$lambda$6(selectedCategory$delegate));
        if (r21 != null) goto L98;
        r21 = CollectionsKt.emptyList();
        goto L98
    L88:
        if (r116 == Composer.Companion.getEmpty()) goto L91;
        context2 = context;
        r119 = false;
    L84:
        Object r127 = CollectionsKt.plus(CollectionsKt.listOf("全部"), entriesByCategory.keySet());
        $composer2.updateRememberedValue(r127);
        r111 = r127;
    L68:
        boolean r34 = false;
        Map r128 = new LinkedHashMap();
        Iterator r210 = r37.iterator();
    L70:
        if (r210.hasNext() == false) goto L76;
        boolean r38 = r34;
        Object r39 = r210.next();
        String r310 = ((LexiconEntry) r39).getCategory();
        int r311 = r17;
        Object r312 = r128.get(r310);
        if (r312 != null) goto L74;
        Object r313 = new ArrayList();
        r128.put(r310, r313);
    L75:
        ((List) r313).add(r39);
        r34 = r38;
        r17 = r311;
        goto L70
    L74:
        r313 = r312;
        goto L75
    L76:
        $composer2.updateRememberedValue(r128);
        r110 = r128;
        goto L77
    L47:
        r11 = false;
        goto L49
    }

    static final MutableState KnowledgeScreen$lambda$1$lambda$0() {
        return SnapshotStateKt.mutableStateOf$default("", null, 2, null);
    }

    private static final String KnowledgeScreen$lambda$2(MutableState<String> r4) {
        return r4.getValue();
    }

    private static final void KnowledgeScreen$lambda$3(MutableState<String> r5, String r6) {
        r5.setValue(r6);
    }

    static final MutableState KnowledgeScreen$lambda$5$lambda$4() {
        return SnapshotStateKt.mutableStateOf$default("全部", null, 2, null);
    }

    private static final String KnowledgeScreen$lambda$6(MutableState<String> r4) {
        return r4.getValue();
    }

    private static final void KnowledgeScreen$lambda$7(MutableState<String> r5, String r6) {
        r5.setValue(r6);
    }

    static final Unit KnowledgeScreen$lambda$39$lambda$38(final List $filtered, final boolean $isLandscape, final List $entries, final MutableState $query$delegate, final List $categories, final Map $entriesByCategory, final MutableState $selectedCategory$delegate, final Set $favorites, final String $askName, final Context $context, final Function2 $onToggleFavorite, final Function1 $onAsk, LazyListScope $this$LazyColumn) {
        Intrinsics.checkNotNullParameter($this$LazyColumn, "$this$LazyColumn");
        LazyListScope.item$default($this$LazyColumn, null, null, ComposableLambdaKt.composableLambdaInstance(1503205679, true, new KnowledgeScreensKt$$ExternalSyntheticLambda6($isLandscape, $entries)), 3, null);
        LazyListScope.item$default($this$LazyColumn, null, null, ComposableLambdaKt.composableLambdaInstance(123353240, true, new KnowledgeScreensKt$$ExternalSyntheticLambda7($query$delegate, $isLandscape)), 3, null);
        LazyListScope.item$default($this$LazyColumn, null, null, ComposableLambdaKt.composableLambdaInstance(359523063, true, new KnowledgeScreensKt$$ExternalSyntheticLambda8($categories, $entries, $entriesByCategory, $selectedCategory$delegate)), 3, null);
        LazyListScope.item$default($this$LazyColumn, null, null, ComposableLambdaKt.composableLambdaInstance(595692886, true, new KnowledgeScreensKt$$ExternalSyntheticLambda9($filtered, $favorites)), 3, null);
        if ($filtered.isEmpty() == false) goto L5;
        LazyListScope.item$default($this$LazyColumn, null, null, ComposableLambdaKt.composableLambdaInstance(-331824140, true, new KnowledgeScreensKt$$ExternalSyntheticLambda10($query$delegate, $selectedCategory$delegate)), 3, null);
    L7:
        return Unit.INSTANCE;
    L5:
        final Function1 r0 = new KnowledgeScreensKt$$ExternalSyntheticLambda11();
        final Function1 r13 = KnowledgeScreensKt$KnowledgeScreen$lambda$39$lambda$38$$inlined$items$default$1.INSTANCE;
        $this$LazyColumn.items($filtered.size(), new KnowledgeScreensKt$KnowledgeScreen$lambda$39$lambda$38$$inlined$items$default$2(r0, $filtered), new KnowledgeScreensKt$KnowledgeScreen$lambda$39$lambda$38$$inlined$items$default$3(r13, $filtered), ComposableLambdaKt.composableLambdaInstance(-632812321, true, new KnowledgeScreensKt$KnowledgeScreen$lambda$39$lambda$38$$inlined$items$default$4($filtered, $favorites, $askName, $isLandscape, $context, $onToggleFavorite, $onAsk)));
        goto L7
    }

    static final Unit KnowledgeScreen$lambda$39$lambda$38$lambda$15(boolean $isLandscape, final List $entries, LazyItemScope $this$item, Composer $composer, int $changed) {
        Intrinsics.checkNotNullParameter($this$item, "$this$item");
        ComposerKt.sourceInformation($composer, "C83@3511L444,77@3256L713:KnowledgeScreens.kt#cyjvf");
        if (($changed & 17) == 16) goto L5;
        boolean r0 = true;
    L7:
        if ($composer.shouldExecute(r0, $changed & 1) == true) goto L9;
        $composer.skipToGroupEnd();
    L16:
        return Unit.INSTANCE;
    L9:
        if (ComposerKt.isTraceInProgress() == false) goto L11;
        ComposerKt.traceEventStart(1503205679, $changed, -1, "com.luchime.huiyuan.ui.KnowledgeScreen.<anonymous>.<anonymous>.<anonymous> (KnowledgeScreens.kt:77)");
    L11:
        HuiyuanDesignKt.m7415ScreenHeaderfWhpE4E("KNOWLEDGE LIBRARY", "高认知语录库", "搜索关键词、按维度浏览，并把有共鸣的内容收进收藏。", HuiyuanDesignKt.getSignalGreen(), $isLandscape, ComposableLambdaKt.rememberComposableLambda(110463588, true, new KnowledgeScreensKt$$ExternalSyntheticLambda0($entries), $composer, 54), $composer, 200118, 0);
        if (ComposerKt.isTraceInProgress() == false) goto L16;
        ComposerKt.traceEventEnd();
        goto L16
    L5:
        r0 = false;
        goto L7
    }

    static final Unit KnowledgeScreen$lambda$39$lambda$38$lambda$15$lambda$14(List $entries, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C84@3533L404:KnowledgeScreens.kt#cyjvf");
        if (($changed & 3) == 2) goto L5;
        boolean r2 = true;
    L7:
        if ($composer.shouldExecute(r2, $changed & 1) == true) goto L9;
        $composer.skipToGroupEnd();
    L31:
        return Unit.INSTANCE;
    L9:
        if (ComposerKt.isTraceInProgress() == false) goto L11;
        ComposerKt.traceEventStart(110463588, $changed, -1, "com.luchime.huiyuan.ui.KnowledgeScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous> (KnowledgeScreens.kt:84)");
    L11:
        Modifier r3 = PaddingKt.m726paddingVpY3zN4(BackgroundKt.m233backgroundbw27NRU(Modifier.Companion, HuiyuanDesignKt.getInk(), RoundedCornerShapeKt.m1018RoundedCornerShape0680j_4(Dp.m6973constructorimpl(12))), Dp.m6973constructorimpl(13), Dp.m6973constructorimpl(9));
        Alignment r4 = Alignment.Companion.getCenter();
        ComposerKt.sourceInformationMarkerStart($composer, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
        MeasurePolicy r9 = BoxKt.maybeCachedBoxMeasurePolicy(r4, false);
        ComposerKt.sourceInformationMarkerStart($composer, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
        int r5 = ComposablesKt.getCurrentCompositeKeyHash($composer, 0);
        CompositionLocalMap r13 = $composer.getCurrentCompositionLocalMap();
        Modifier r14 = ComposedModifierKt.materializeModifier($composer, r3);
        Function0<ComposeUiNode> r15 = ComposeUiNode.Companion.getConstructor();
        int r0 = ((((48 << 3) & 112) << 6) & 896) | 6;
        ComposerKt.sourceInformationMarkerStart($composer, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
        if (($composer.getApplier() instanceof Applier) == true) goto L14;
        ComposablesKt.invalidApplier();
    L14:
        $composer.startReusableNode();
        if ($composer.getInserting() == false) goto L17;
        $composer.createNode(r15);
    L18:
        Composer r1 = Updater.m3808constructorimpl($composer);
        Updater.m3815setimpl(r1, r9, ComposeUiNode.Companion.getSetMeasurePolicy());
        Updater.m3815setimpl(r1, r13, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> r6 = ComposeUiNode.Companion.getSetCompositeKeyHash();
        if (r1.getInserting() == true) goto L25;
        if (Intrinsics.areEqual(r1.rememberedValue(), Integer.valueOf(r5)) == false) goto L25;
    L26:
        Updater.m3815setimpl(r1, r14, ComposeUiNode.Companion.getSetModifier());
        int r7 = (r0 >> 6) & 14;
        ComposerKt.sourceInformationMarkerStart($composer, -2146730711, "C72@3468L9:Box.kt#2w3rfo");
        BoxScopeInstance r8 = BoxScopeInstance.INSTANCE;
        int r10 = ((48 >> 6) & 112) | 6;
        ComposerKt.sourceInformationMarkerStart($composer, -778793001, "C90@3837L78:KnowledgeScreens.kt#cyjvf");
        TextKt.m2820Text4IGK_g($entries.size() + "\n条", null, Color.Companion.m4403getWhite0d7_KjU(), 0, null, FontWeight.Companion.getBlack(), null, 0, null, null, 0, 0, false, 0, 0, null, null, $composer, 196992, 0, 131034);
        ComposerKt.sourceInformationMarkerEnd($composer);
        ComposerKt.sourceInformationMarkerEnd($composer);
        $composer.endNode();
        ComposerKt.sourceInformationMarkerEnd($composer);
        ComposerKt.sourceInformationMarkerEnd($composer);
        ComposerKt.sourceInformationMarkerEnd($composer);
        if (ComposerKt.isTraceInProgress() == false) goto L31;
        ComposerKt.traceEventEnd();
    L25:
        r1.updateRememberedValue(Integer.valueOf(r5));
        r1.apply(Integer.valueOf(r5), r6);
        goto L26
    L17:
        $composer.useNode();
        goto L18
    L5:
        r2 = false;
        goto L7
    }

    static final Unit KnowledgeScreen$lambda$39$lambda$38$lambda$21(final MutableState $query$delegate, boolean $isLandscape, LazyItemScope $this$item, Composer $composer, int $changed) {
        Intrinsics.checkNotNullParameter($this$item, "$this$item");
        ComposerKt.sourceInformation($composer, "C99@4090L23,108@4563L394,120@5088L279,97@4008L1373:KnowledgeScreens.kt#cyjvf");
        if (($changed & 17) == 16) goto L5;
        boolean r3 = true;
    L7:
        if ($composer.shouldExecute(r3, $changed & 1) == true) goto L9;
        $composer.skipToGroupEnd();
    L30:
        return Unit.INSTANCE;
    L9:
        if (ComposerKt.isTraceInProgress() == false) goto L11;
        ComposerKt.traceEventStart(123353240, $changed, -1, "com.luchime.huiyuan.ui.KnowledgeScreen.<anonymous>.<anonymous>.<anonymous> (KnowledgeScreens.kt:97)");
    L11:
        String r95 = KnowledgeScreen$lambda$2($query$delegate);
        ComposerKt.sourceInformationMarkerStart($composer, -1716617553, "CC(remember):KnowledgeScreens.kt#9igjgp");
        boolean r4 = $composer.changed($query$delegate);
        Object r8 = $composer.rememberedValue();
        if (r4 == false) goto L14;
    L17:
        Object r11 = new KnowledgeScreensKt$$ExternalSyntheticLambda12($query$delegate);
        $composer.updateRememberedValue(r11);
        r8 = r11;
    L18:
        Function1 r96 = (Function1) r8;
        ComposerKt.sourceInformationMarkerEnd($composer);
        Modifier r5 = SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, null);
        if ($isLandscape == false) goto L21;
        float r6 = Dp.m6973constructorimpl(24);
    L22:
        if ($isLandscape == false) goto L24;
        float r7 = Dp.m6973constructorimpl(8);
    L25:
        OutlinedTextFieldKt.OutlinedTextField(r95, r96, PaddingKt.m726paddingVpY3zN4(r5, r6, r7), false, false, null, null, ComposableSingletons$KnowledgeScreensKt.INSTANCE.getLambda$1087424319$app(), ComposableSingletons$KnowledgeScreensKt.INSTANCE.getLambda$693020480$app(), ComposableLambdaKt.rememberComposableLambda(298616641, true, new KnowledgeScreensKt$$ExternalSyntheticLambda13($query$delegate), $composer, 54), null, null, null, false, null, null, null, true, 0, 0, null, RoundedCornerShapeKt.m1018RoundedCornerShape0680j_4(Dp.m6973constructorimpl(13)), TextFieldDefaults.INSTANCE.m2801colors0hiis_0(0, 0, 0, 0, Color.Companion.m4403getWhite0d7_KjU(), Color.Companion.m4403getWhite0d7_KjU(), 0, 0, HuiyuanDesignKt.getInk(), 0, null, HuiyuanDesignKt.getInk(), HuiyuanDesignKt.getInk(), 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, $composer, 100884480, 432, 0, 0, 3072, 2147477199, 4095), $composer, 918552576, 12582912, 0, 1965176);
        if (ComposerKt.isTraceInProgress() == false) goto L30;
        ComposerKt.traceEventEnd();
        goto L30
    L24:
        r7 = Dp.m6973constructorimpl(14);
        goto L25
    L21:
        r6 = Dp.m6973constructorimpl(16);
        goto L22
    L14:
        if (r8 != Composer.Companion.getEmpty()) goto L18;
    L5:
        r3 = false;
        goto L7
    }

    static final Unit KnowledgeScreen$lambda$39$lambda$38$lambda$21$lambda$17$lambda$16(MutableState $query$delegate, String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        KnowledgeScreen$lambda$3($query$delegate, StringsKt.take(it, 40));
        return Unit.INSTANCE;
    }

    static final Unit KnowledgeScreen$lambda$39$lambda$38$lambda$21$lambda$20(final MutableState $query$delegate, Composer $composer, int $changed) {
        Composer r1 = $composer;
        ComposerKt.sourceInformation(r1, "C:KnowledgeScreens.kt#cyjvf");
        boolean r5 = false;
        if (($changed & 3) == 2) goto L5;
        boolean r3 = true;
    L7:
        if (r1.shouldExecute(r3, $changed & 1) == true) goto L9;
        r1.skipToGroupEnd();
    L29:
        return Unit.INSTANCE;
    L9:
        if (ComposerKt.isTraceInProgress() == false) goto L12;
        ComposerKt.traceEventStart(298616641, $changed, -1, "com.luchime.huiyuan.ui.KnowledgeScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous> (KnowledgeScreens.kt:109)");
    L12:
        if (KnowledgeScreen$lambda$2($query$delegate).length() <= 0) goto L14;
        r5 = true;
    L14:
        if (r5 == false) goto L23;
        r1.startReplaceGroup(1211137879);
        ComposerKt.sourceInformation(r1, "114@4877L14,110@4635L282");
        long r6 = TextUnitKt.getSp(22);
        FontWeight r8 = FontWeight.Companion.getBlack();
        Modifier.Companion r9 = Modifier.Companion;
        HapticCue r11 = HapticCue.SELECTION;
        ComposerKt.sourceInformationMarkerStart(r1, -792206769, "CC(remember):KnowledgeScreens.kt#9igjgp");
        boolean r4 = r1.changed($query$delegate);
        Object r10 = $composer.rememberedValue();
        if (r4 == false) goto L18;
    L21:
        Object r14 = new KnowledgeScreensKt$$ExternalSyntheticLambda28($query$delegate);
        $composer.updateRememberedValue(r14);
        r10 = r14;
    L22:
        ComposerKt.sourceInformationMarkerEnd(r1);
        TextKt.m2820Text4IGK_g("×", AppHapticsKt.hapticClickable$default(r9, false, r11, (Function0) r10, 1, null), 0, r6, null, r8, null, 0, null, null, 0, 0, false, 0, 0, null, null, $composer, 199686, 0, 131028);
        r1 = $composer;
    L24:
        r1.endReplaceGroup();
        if (ComposerKt.isTraceInProgress() == false) goto L29;
        ComposerKt.traceEventEnd();
        goto L29
    L18:
        if (r10 != Composer.Companion.getEmpty()) goto L22;
    L23:
        r1.startReplaceGroup(1206554529);
        goto L24
    L5:
        r3 = false;
        goto L7
    }

    static final Unit KnowledgeScreen$lambda$39$lambda$38$lambda$21$lambda$20$lambda$19$lambda$18(MutableState $query$delegate) {
        KnowledgeScreen$lambda$3($query$delegate, "");
        return Unit.INSTANCE;
    }

    static final Unit KnowledgeScreen$lambda$39$lambda$38$lambda$26(List $categories, List $entries, Map $entriesByCategory, final MutableState $selectedCategory$delegate, LazyItemScope $this$item, Composer $composer, int $changed) {
        Intrinsics.checkNotNullParameter($this$item, "$this$item");
        ComposerKt.sourceInformation($composer, "C134@5535L21,131@5420L1468:KnowledgeScreens.kt#cyjvf");
        if (($changed & 17) == 16) goto L5;
        boolean r3 = true;
    L7:
        if ($composer.shouldExecute(r3, $changed & 1) == true) goto L9;
        $composer.skipToGroupEnd();
    L57:
        return Unit.INSTANCE;
    L9:
        if (ComposerKt.isTraceInProgress() == false) goto L11;
        ComposerKt.traceEventStart(359523063, $changed, -1, "com.luchime.huiyuan.ui.KnowledgeScreen.<anonymous>.<anonymous>.<anonymous> (KnowledgeScreens.kt:131)");
    L11:
        Modifier r4 = PaddingKt.m726paddingVpY3zN4(ScrollKt.horizontalScroll$default(SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, null), ScrollKt.rememberScrollState(0, $composer, 0, 1), false, null, false, 14, null), Dp.m6973constructorimpl(16), Dp.m6973constructorimpl(2));
        Arrangement.Horizontal r5 = Arrangement.INSTANCE.m606spacedBy0680j_4(Dp.m6973constructorimpl(8));
        int r6 = 48;
        Composer r8 = $composer;
        ComposerKt.sourceInformationMarkerStart(r8, 693286680, "CC(Row)P(2,1,3)99@5124L58,100@5187L130:Row.kt#2w3rfo");
        MeasurePolicy r11 = RowKt.rowMeasurePolicy(r5, Alignment.Companion.getTop(), r8, ((48 >> 3) & 14) | ((48 >> 3) & 112));
        ComposerKt.sourceInformationMarkerStart(r8, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
        int r15 = ComposablesKt.getCurrentCompositeKeyHash(r8, 0);
        CompositionLocalMap r7 = r8.getCurrentCompositionLocalMap();
        Modifier r1 = ComposedModifierKt.materializeModifier(r8, r4);
        Function0<ComposeUiNode> r16 = ComposeUiNode.Companion.getConstructor();
        int r2 = ((((48 << 3) & 112) << 6) & 896) | 6;
        ComposerKt.sourceInformationMarkerStart(r8, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
        if ((r8.getApplier() instanceof Applier) == true) goto L14;
        ComposablesKt.invalidApplier();
    L14:
        r8.startReusableNode();
        if (r8.getInserting() == false) goto L17;
        Function0<ComposeUiNode> r9 = r16;
        r8.createNode(r9);
    L18:
        Composer r10 = Updater.m3808constructorimpl(r8);
        Updater.m3815setimpl(r10, r11, ComposeUiNode.Companion.getSetMeasurePolicy());
        Updater.m3815setimpl(r10, r7, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> r12 = ComposeUiNode.Companion.getSetCompositeKeyHash();
        if (r10.getInserting() == true) goto L25;
        if (Intrinsics.areEqual(r10.rememberedValue(), Integer.valueOf(r15)) == false) goto L25;
    L26:
        Updater.m3815setimpl(r10, r1, ComposeUiNode.Companion.getSetModifier());
        int r13 = (r2 >> 6) & 14;
        int r14 = 0;
        ComposerKt.sourceInformationMarkerStart(r8, -407735110, "C101@5232L9:Row.kt#2w3rfo");
        RowScopeInstance r17 = RowScopeInstance.INSTANCE;
        int r18 = ((48 >> 6) & 112) | 6;
        ComposerKt.sourceInformationMarkerStart(r8, 557575698, "C:KnowledgeScreens.kt#cyjvf");
        r8.startReplaceGroup(295081318);
        ComposerKt.sourceInformation(r8, "*156@6669L91,145@6054L802");
        List r19 = $categories;
        int r20 = 0;
        Iterator r51 = r19.iterator();
    L28:
        if (r51.hasNext() == false) goto L52;
        Iterable r53 = r19;
        final String r21 = (String) r51.next();
        int r55 = r20;
        boolean r22 = Intrinsics.areEqual(r21, KnowledgeScreen$lambda$6($selectedCategory$delegate));
        if (Intrinsics.areEqual(r21, "全部") == false) goto L32;
        int r25 = $entries.size();
    L36:
        int r58 = r14;
        String r26 = new StringBuilder().append(r21).append(" ").append(r25).toString();
        if (r22 == false) goto L39;
        long r27 = Color.Companion.m4403getWhite0d7_KjU();
    L40:
        long r28 = r27;
        long r29 = TextUnitKt.getSp(11);
        FontWeight r32 = FontWeight.Companion.getBlack();
        Modifier.Companion r23 = Modifier.Companion;
        if (r22 == false) goto L43;
        long r33 = HuiyuanDesignKt.getInk();
    L44:
        int r57 = r18;
        int r60 = r6;
        CompositionLocalMap r61 = r7;
        Composer r62 = r8;
        Modifier r34 = BorderKt.m245borderxT4_qwU(BackgroundKt.m233backgroundbw27NRU(r23, r33, RoundedCornerShapeKt.m1018RoundedCornerShape0680j_4(Dp.m6973constructorimpl(10))), Dp.m6973constructorimpl((float) 1.5d), HuiyuanDesignKt.getInk(), RoundedCornerShapeKt.m1018RoundedCornerShape0680j_4(Dp.m6973constructorimpl(10)));
        HapticCue r35 = HapticCue.SELECTION;
        ComposerKt.sourceInformationMarkerStart(r8, -152160482, "CC(remember):KnowledgeScreens.kt#9igjgp");
        boolean r24 = r8.changed($selectedCategory$delegate) | r8.changed(r21);
        Object r30 = r8.rememberedValue();
        if (r24 == false) goto L47;
    L50:
        Object r31 = new KnowledgeScreensKt$$ExternalSyntheticLambda1(r21, $selectedCategory$delegate);
        r8.updateRememberedValue(r31);
        r30 = r31;
    L51:
        ComposerKt.sourceInformationMarkerEnd(r8);
        TextKt.m2820Text4IGK_g(r26, PaddingKt.m726paddingVpY3zN4(AppHapticsKt.hapticClickable$default(r34, false, r35, (Function0) r30, 1, null), Dp.m6973constructorimpl(11), Dp.m6973constructorimpl(8)), r28, r29, null, r32, null, 0, null, null, 0, 0, false, 0, 0, null, null, r8, 199680, 0, 131024);
        r19 = r53;
        r20 = r55;
        r18 = r57;
        r14 = r58;
        r6 = r60;
        r7 = r61;
        r8 = r62;
        goto L28
    L47:
        if (r30 != Composer.Companion.getEmpty()) goto L51;
    L43:
        r33 = Color.Companion.m4403getWhite0d7_KjU();
        goto L44
    L39:
        r27 = HuiyuanDesignKt.getInk();
        goto L40
    L32:
        List r210 = (List) $entriesByCategory.get(r21);
        if (r210 == null) goto L35;
        r25 = r210.size();
        goto L36
    L35:
        r25 = 0;
        goto L36
    L52:
        Composer r63 = r8;
        r8.endReplaceGroup();
        ComposerKt.sourceInformationMarkerEnd(r8);
        ComposerKt.sourceInformationMarkerEnd(r8);
        r63.endNode();
        ComposerKt.sourceInformationMarkerEnd(r63);
        ComposerKt.sourceInformationMarkerEnd(r63);
        ComposerKt.sourceInformationMarkerEnd(r63);
        if (ComposerKt.isTraceInProgress() == false) goto L57;
        ComposerKt.traceEventEnd();
    L25:
        r10.updateRememberedValue(Integer.valueOf(r15));
        r10.apply(Integer.valueOf(r15), r12);
        goto L26
    L17:
        r9 = r16;
        r8.useNode();
        goto L18
    L5:
        r3 = false;
        goto L7
    }

    static final Unit KnowledgeScreen$lambda$39$lambda$38$lambda$26$lambda$25$lambda$24$lambda$23$lambda$22(String $category, MutableState $selectedCategory$delegate) {
        KnowledgeScreen$lambda$7($selectedCategory$delegate, $category);
        return Unit.INSTANCE;
    }

    static final Unit KnowledgeScreen$lambda$39$lambda$38$lambda$28(List $filtered, Set $favorites, LazyItemScope $this$item, Composer $composer, int $changed) {
        Intrinsics.checkNotNullParameter($this$item, "$this$item");
        ComposerKt.sourceInformation($composer, "C166@6927L414:KnowledgeScreens.kt#cyjvf");
        if (($changed & 17) == 16) goto L5;
        boolean r2 = true;
    L7:
        if ($composer.shouldExecute(r2, $changed & 1) == true) goto L9;
        $composer.skipToGroupEnd();
    L31:
        return Unit.INSTANCE;
    L9:
        if (ComposerKt.isTraceInProgress() == false) goto L11;
        ComposerKt.traceEventStart(595692886, $changed, -1, "com.luchime.huiyuan.ui.KnowledgeScreen.<anonymous>.<anonymous>.<anonymous> (KnowledgeScreens.kt:166)");
    L11:
        Modifier r3 = PaddingKt.m726paddingVpY3zN4(SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, null), Dp.m6973constructorimpl(17), Dp.m6973constructorimpl(12));
        Arrangement.Horizontal r4 = Arrangement.INSTANCE.getSpaceBetween();
        ComposerKt.sourceInformationMarkerStart($composer, 693286680, "CC(Row)P(2,1,3)99@5124L58,100@5187L130:Row.kt#2w3rfo");
        MeasurePolicy r10 = RowKt.rowMeasurePolicy(r4, Alignment.Companion.getTop(), $composer, ((54 >> 3) & 14) | ((54 >> 3) & 112));
        ComposerKt.sourceInformationMarkerStart($composer, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
        int r5 = ComposablesKt.getCurrentCompositeKeyHash($composer, 0);
        CompositionLocalMap r14 = $composer.getCurrentCompositionLocalMap();
        Modifier r15 = ComposedModifierKt.materializeModifier($composer, r3);
        Function0<ComposeUiNode> r16 = ComposeUiNode.Companion.getConstructor();
        int r0 = ((((54 << 3) & 112) << 6) & 896) | 6;
        ComposerKt.sourceInformationMarkerStart($composer, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
        if (($composer.getApplier() instanceof Applier) == true) goto L14;
        ComposablesKt.invalidApplier();
    L14:
        $composer.startReusableNode();
        if ($composer.getInserting() == false) goto L17;
        Function0<ComposeUiNode> r1 = r16;
        $composer.createNode(r1);
    L18:
        Composer r6 = Updater.m3808constructorimpl($composer);
        Updater.m3815setimpl(r6, r10, ComposeUiNode.Companion.getSetMeasurePolicy());
        Updater.m3815setimpl(r6, r14, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> r7 = ComposeUiNode.Companion.getSetCompositeKeyHash();
        if (r6.getInserting() == true) goto L25;
        if (Intrinsics.areEqual(r6.rememberedValue(), Integer.valueOf(r5)) == false) goto L25;
    L26:
        Updater.m3815setimpl(r6, r15, ComposeUiNode.Companion.getSetModifier());
        int r8 = (r0 >> 6) & 14;
        ComposerKt.sourceInformationMarkerStart($composer, -407735110, "C101@5232L9:Row.kt#2w3rfo");
        RowScopeInstance r9 = RowScopeInstance.INSTANCE;
        int r11 = ((54 >> 6) & 112) | 6;
        ComposerKt.sourceInformationMarkerStart($composer, 1136311091, "C172@7169L73,173@7259L68:KnowledgeScreens.kt#cyjvf");
        TextKt.m2820Text4IGK_g("找到 " + $filtered.size() + " 条", null, HuiyuanDesignKt.getInk(), 0, null, FontWeight.Companion.getBlack(), null, 0, null, null, 0, 0, false, 0, 0, null, null, $composer, 196992, 0, 131034);
        TextKt.m2820Text4IGK_g("已收藏 " + $favorites.size() + " 条", null, HuiyuanDesignKt.getMutedText(), TextUnitKt.getSp(12), null, null, null, 0, null, null, 0, 0, false, 0, 0, null, null, $composer, 3456, 0, 131058);
        ComposerKt.sourceInformationMarkerEnd($composer);
        ComposerKt.sourceInformationMarkerEnd($composer);
        $composer.endNode();
        ComposerKt.sourceInformationMarkerEnd($composer);
        ComposerKt.sourceInformationMarkerEnd($composer);
        ComposerKt.sourceInformationMarkerEnd($composer);
        if (ComposerKt.isTraceInProgress() == false) goto L31;
        ComposerKt.traceEventEnd();
    L25:
        r6.updateRememberedValue(Integer.valueOf(r5));
        r6.apply(Integer.valueOf(r5), r7);
        goto L26
    L17:
        r1 = r16;
        $composer.useNode();
        goto L18
    L5:
        r2 = false;
        goto L7
    }

    static final Unit KnowledgeScreen$lambda$39$lambda$38$lambda$31(final MutableState $query$delegate, final MutableState $selectedCategory$delegate, LazyItemScope $this$item, Composer $composer, int $changed) {
        Intrinsics.checkNotNullParameter($this$item, "$this$item");
        ComposerKt.sourceInformation($composer, "C178@7437L39,178@7406L71:KnowledgeScreens.kt#cyjvf");
        if (($changed & 17) == 16) goto L5;
        boolean r0 = true;
    L7:
        if ($composer.shouldExecute(r0, $changed & 1) == true) goto L9;
        $composer.skipToGroupEnd();
    L23:
        return Unit.INSTANCE;
    L9:
        if (ComposerKt.isTraceInProgress() == false) goto L11;
        ComposerKt.traceEventStart(-331824140, $changed, -1, "com.luchime.huiyuan.ui.KnowledgeScreen.<anonymous>.<anonymous>.<anonymous> (KnowledgeScreens.kt:178)");
    L11:
        ComposerKt.sourceInformationMarkerStart($composer, -1055417541, "CC(remember):KnowledgeScreens.kt#9igjgp");
        boolean r1 = $composer.changed($query$delegate) | $composer.changed($selectedCategory$delegate);
        Object r4 = $composer.rememberedValue();
        if (r1 == false) goto L14;
    L17:
        Object r7 = new KnowledgeScreensKt$$ExternalSyntheticLambda5($query$delegate, $selectedCategory$delegate);
        $composer.updateRememberedValue(r7);
        r4 = r7;
    L18:
        ComposerKt.sourceInformationMarkerEnd($composer);
        EmptyKnowledgeResult((Function0) r4, $composer, 0);
        if (ComposerKt.isTraceInProgress() == false) goto L23;
        ComposerKt.traceEventEnd();
        goto L23
    L14:
        if (r4 != Composer.Companion.getEmpty()) goto L18;
    L5:
        r0 = false;
        goto L7
    }

    static final Unit KnowledgeScreen$lambda$39$lambda$38$lambda$31$lambda$30$lambda$29(MutableState $query$delegate, MutableState $selectedCategory$delegate) {
        KnowledgeScreen$lambda$3($query$delegate, "");
        KnowledgeScreen$lambda$7($selectedCategory$delegate, "全部");
        return Unit.INSTANCE;
    }

    static final Object KnowledgeScreen$lambda$39$lambda$38$lambda$32(LexiconEntry it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return it.getCategory() + "|" + it.getText();
    }

    public static final void FavoritesScreen(final List<FavoriteRecord> r27, final boolean isLandscape, final Function2<? super String, ? super String, Unit> r29, final Function1<? super String, Unit> r30, final Function0<Unit> r31, Composer $composer, final int $changed) {
        Intrinsics.checkNotNullParameter(r27, "favorites");
        Intrinsics.checkNotNullParameter(r29, "onToggleFavorite");
        Intrinsics.checkNotNullParameter(r30, "onAsk");
        Intrinsics.checkNotNullParameter(r31, "onExplore");
        Composer $composer2 = $composer.startRestartGroup(653538608);
        ComposerKt.sourceInformation($composer2, "C(FavoritesScreen)P(!2,4)204@8379L7,205@8421L7,213@8714L2865,206@8433L3146:KnowledgeScreens.kt#cyjvf");
        int $dirty = $changed;
        if (($changed & 6) != 0) goto L10;
        if ($composer2.changedInstance(r27) == false) goto L7;
        int r7 = 4;
    L8:
        $dirty = $dirty | r7;
        goto L10
    L7:
        r7 = 2;
    L10:
        if (($changed & 48) != 0) goto L17;
        if ($composer2.changed(isLandscape) == false) goto L14;
        int r8 = 32;
    L15:
        $dirty = $dirty | r8;
        goto L17
    L14:
        r8 = 16;
    L17:
        if (($changed & 384) != 0) goto L24;
        if ($composer2.changedInstance(r29) == false) goto L21;
        int r9 = 256;
    L22:
        $dirty = $dirty | r9;
        goto L24
    L21:
        r9 = 128;
    L24:
        if (($changed & 3072) != 0) goto L31;
        if ($composer2.changedInstance(r30) == false) goto L28;
        int r10 = 2048;
    L29:
        $dirty = $dirty | r10;
        goto L31
    L28:
        r10 = 1024;
    L31:
        if (($changed & 24576) == 0) goto L33;
    L37:
        int $dirty2 = $dirty;
        if (($dirty2 & 9363) == 9362) goto L40;
        boolean r6 = true;
    L42:
        if ($composer2.shouldExecute(r6, $dirty2 & 1) == true) goto L44;
        Composer $composer3 = $composer2;
        $composer3.skipToGroupEnd();
    L78:
        ScopeUpdateScope r11 = $composer3.endRestartGroup();
        if (r11 == null) goto L82;
        r11.updateScope(new KnowledgeScreensKt$$ExternalSyntheticLambda19(r27, isLandscape, r29, r30, r31, $changed));
        return;
    L82:
        return;
    L44:
        if (ComposerKt.isTraceInProgress() == false) goto L46;
        ComposerKt.traceEventStart(653538608, $dirty2, -1, "com.luchime.huiyuan.ui.FavoritesScreen (KnowledgeScreens.kt:203)");
    L46:
        ProvidableCompositionLocal<Context> r0 = AndroidCompositionLocals_androidKt.getLocalContext();
        ComposerKt.sourceInformationMarkerStart($composer2, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
        Object r19 = $composer2.consume(r0);
        ComposerKt.sourceInformationMarkerEnd($composer2);
        Context context = (Context) r19;
        ProvidableCompositionLocal<AppHaptics> r12 = AppHapticsKt.getLocalAppHaptics();
        ComposerKt.sourceInformationMarkerStart($composer2, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
        Object r13 = $composer2.consume(r12);
        ComposerKt.sourceInformationMarkerEnd($composer2);
        final AppHaptics haptics = (AppHaptics) r13;
        Modifier r14 = WindowInsetsPadding_androidKt.statusBarsPadding(BackgroundKt.m234backgroundbw27NRU$default(SizeKt.fillMaxSize$default(Modifier.Companion, 0.0f, 1, null), HuiyuanDesignKt.getPaper(), null, 2, null));
        if (isLandscape == false) goto L49;
        float r24 = Dp.m6973constructorimpl(12);
    L50:
        PaddingValues r15 = PaddingKt.m722PaddingValuesa9UjIt4$default(0.0f, 0.0f, 0.0f, r24, 7, null);
        Alignment.Horizontal r16 = Alignment.Companion.getCenterHorizontally();
        ComposerKt.sourceInformationMarkerStart($composer2, 985398433, "CC(remember):KnowledgeScreens.kt#9igjgp");
        if (($dirty2 & 112) != 32) goto L53;
        boolean r17 = true;
    L54:
        boolean r18 = (r17 | $composer2.changedInstance(r27)) | $composer2.changedInstance(haptics);
        if ((57344 & $dirty2) != 16384) goto L57;
        boolean r110 = true;
    L58:
        boolean r20 = (r18 | r110) | $composer2.changedInstance(context);
        if (($dirty2 & 896) != 256) goto L61;
        boolean r111 = true;
    L62:
        boolean r21 = r20 | r111;
        if (($dirty2 & 7168) != 2048) goto L65;
        boolean r112 = true;
    L66:
        boolean r113 = r21 | r112;
        Object r22 = $composer2.rememberedValue();
        if (r113 == true) goto L72;
        Context context2 = context;
        if (r22 != Composer.Companion.getEmpty()) goto L74;
    L73:
        final Context context3 = context2;
        r22 = new KnowledgeScreensKt$$ExternalSyntheticLambda18(r27, isLandscape, haptics, r31, context3, r29, r30);
        $composer2.updateRememberedValue(r22);
    L74:
        ComposerKt.sourceInformationMarkerEnd($composer2);
        $composer3 = $composer2;
        LazyDslKt.LazyColumn(r14, null, r15, false, null, r16, null, false, null, (Function1) r22, $composer3, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 474);
        if (ComposerKt.isTraceInProgress() == false) goto L78;
        ComposerKt.traceEventEnd();
        goto L78
    L72:
        context2 = context;
        goto L73
    L65:
        r112 = false;
        goto L66
    L61:
        r111 = false;
        goto L62
    L57:
        r110 = false;
        goto L58
    L53:
        r17 = false;
        goto L54
    L49:
        r24 = Dp.m6973constructorimpl(24);
        goto L50
    L40:
        r6 = false;
        goto L42
    L33:
        if ($composer2.changedInstance(r31) == false) goto L35;
        int r23 = 16384;
    L36:
        $dirty = $dirty | r23;
        goto L37
    L35:
        r23 = 8192;
        goto L36
    }

    static final Unit FavoritesScreen$lambda$54$lambda$53(final List $favorites, final boolean $isLandscape, final AppHaptics $haptics, final Function0 $onExplore, final Context $context, final Function2 $onToggleFavorite, final Function1 $onAsk, LazyListScope $this$LazyColumn) {
        Intrinsics.checkNotNullParameter($this$LazyColumn, "$this$LazyColumn");
        LazyListScope.item$default($this$LazyColumn, null, null, ComposableLambdaKt.composableLambdaInstance(1075765701, true, new KnowledgeScreensKt$$ExternalSyntheticLambda2($isLandscape, $favorites)), 3, null);
        if ($favorites.isEmpty() == false) goto L5;
        LazyListScope.item$default($this$LazyColumn, null, null, ComposableLambdaKt.composableLambdaInstance(-1892922784, true, new KnowledgeScreensKt$$ExternalSyntheticLambda3($haptics, $onExplore)), 3, null);
    L7:
        return Unit.INSTANCE;
    L5:
        LazyListScope.item$default($this$LazyColumn, null, null, ComposableSingletons$KnowledgeScreensKt.INSTANCE.m7408getLambda$1919830167$app(), 3, null);
        final Function1 r0 = new KnowledgeScreensKt$$ExternalSyntheticLambda4();
        final Function1 r13 = KnowledgeScreensKt$FavoritesScreen$lambda$54$lambda$53$$inlined$items$default$1.INSTANCE;
        $this$LazyColumn.items($favorites.size(), new KnowledgeScreensKt$FavoritesScreen$lambda$54$lambda$53$$inlined$items$default$2(r0, $favorites), new KnowledgeScreensKt$FavoritesScreen$lambda$54$lambda$53$$inlined$items$default$3(r13, $favorites), ComposableLambdaKt.composableLambdaInstance(-632812321, true, new KnowledgeScreensKt$FavoritesScreen$lambda$54$lambda$53$$inlined$items$default$4($favorites, $isLandscape, $context, $onToggleFavorite, $onAsk)));
        goto L7
    }

    static final Unit FavoritesScreen$lambda$54$lambda$53$lambda$42(boolean $isLandscape, final List $favorites, LazyItemScope $this$item, Composer $composer, int $changed) {
        Intrinsics.checkNotNullParameter($this$item, "$this$item");
        ComposerKt.sourceInformation($composer, "C221@8995L528,215@8743L794:KnowledgeScreens.kt#cyjvf");
        if (($changed & 17) == 16) goto L5;
        boolean r0 = true;
    L7:
        if ($composer.shouldExecute(r0, $changed & 1) == true) goto L9;
        $composer.skipToGroupEnd();
    L16:
        return Unit.INSTANCE;
    L9:
        if (ComposerKt.isTraceInProgress() == false) goto L11;
        ComposerKt.traceEventStart(1075765701, $changed, -1, "com.luchime.huiyuan.ui.FavoritesScreen.<anonymous>.<anonymous>.<anonymous> (KnowledgeScreens.kt:215)");
    L11:
        HuiyuanDesignKt.m7415ScreenHeaderfWhpE4E("MY COLLECTION", "我的收藏", "把真正触动你的句子留下，反复看见，才会慢慢长成自己的认知。", HuiyuanDesignKt.getSignalPink(), $isLandscape, ComposableLambdaKt.rememberComposableLambda(199554544, true, new KnowledgeScreensKt$$ExternalSyntheticLambda16($favorites), $composer, 54), $composer, 200118, 0);
        if (ComposerKt.isTraceInProgress() == false) goto L16;
        ComposerKt.traceEventEnd();
        goto L16
    L5:
        r0 = false;
        goto L7
    }

    static final Unit FavoritesScreen$lambda$54$lambda$53$lambda$42$lambda$41(List $favorites, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C222@9017L488:KnowledgeScreens.kt#cyjvf");
        if (($changed & 3) == 2) goto L5;
        boolean r2 = true;
    L7:
        if ($composer.shouldExecute(r2, $changed & 1) == true) goto L9;
        $composer.skipToGroupEnd();
    L16:
        return Unit.INSTANCE;
    L9:
        if (ComposerKt.isTraceInProgress() == false) goto L11;
        ComposerKt.traceEventStart(199554544, $changed, -1, "com.luchime.huiyuan.ui.FavoritesScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous> (KnowledgeScreens.kt:222)");
    L11:
        TextKt.m2820Text4IGK_g("★ " + $favorites.size(), PaddingKt.m726paddingVpY3zN4(BorderKt.m245borderxT4_qwU(BackgroundKt.m233backgroundbw27NRU(Modifier.Companion, HuiyuanDesignKt.getSignalYellow(), RoundedCornerShapeKt.m1018RoundedCornerShape0680j_4(Dp.m6973constructorimpl(12))), Dp.m6973constructorimpl(2), HuiyuanDesignKt.getInk(), RoundedCornerShapeKt.m1018RoundedCornerShape0680j_4(Dp.m6973constructorimpl(12))), Dp.m6973constructorimpl(12), Dp.m6973constructorimpl(9)), HuiyuanDesignKt.getInk(), TextUnitKt.getSp(18), null, FontWeight.Companion.getBlack(), null, 0, null, null, 0, 0, false, 0, 0, null, null, $composer, 200064, 0, 131024);
        if (ComposerKt.isTraceInProgress() == false) goto L16;
        ComposerKt.traceEventEnd();
        goto L16
    L5:
        r2 = false;
        goto L7
    }

    static final Unit FavoritesScreen$lambda$54$lambda$53$lambda$46(final AppHaptics $haptics, final Function0 $onExplore, LazyItemScope $this$item, Composer $composer, int $changed) {
        Intrinsics.checkNotNullParameter($this$item, "$this$item");
        ComposerKt.sourceInformation($composer, "C238@9619L1069:KnowledgeScreens.kt#cyjvf");
        if (($changed & 17) == 16) goto L5;
        boolean r4 = true;
    L7:
        if ($composer.shouldExecute(r4, $changed & 1) == true) goto L9;
        $composer.skipToGroupEnd();
    L39:
        return Unit.INSTANCE;
    L9:
        if (ComposerKt.isTraceInProgress() == false) goto L11;
        ComposerKt.traceEventStart(-1892922784, $changed, -1, "com.luchime.huiyuan.ui.FavoritesScreen.<anonymous>.<anonymous>.<anonymous> (KnowledgeScreens.kt:238)");
    L11:
        Modifier r5 = PaddingKt.m725padding3ABfNKs(SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, null), Dp.m6973constructorimpl(28));
        Alignment.Horizontal r6 = Alignment.Companion.getCenterHorizontally();
        ComposerKt.sourceInformationMarkerStart($composer, -483455358, "CC(Column)P(2,3,1)87@4442L61,88@4508L133:Column.kt#2w3rfo");
        MeasurePolicy r12 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), r6, $composer, ((390 >> 3) & 14) | ((390 >> 3) & 112));
        ComposerKt.sourceInformationMarkerStart($composer, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
        int r2 = ComposablesKt.getCurrentCompositeKeyHash($composer, 0);
        CompositionLocalMap r7 = $composer.getCurrentCompositionLocalMap();
        Modifier r3 = ComposedModifierKt.materializeModifier($composer, r5);
        Function0<ComposeUiNode> r17 = ComposeUiNode.Companion.getConstructor();
        int r18 = ((((390 << 3) & 112) << 6) & 896) | 6;
        ComposerKt.sourceInformationMarkerStart($composer, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
        if (($composer.getApplier() instanceof Applier) == true) goto L14;
        ComposablesKt.invalidApplier();
    L14:
        $composer.startReusableNode();
        if ($composer.getInserting() == false) goto L17;
        Function0<ComposeUiNode> r8 = r17;
        $composer.createNode(r8);
    L18:
        Composer r9 = Updater.m3808constructorimpl($composer);
        Updater.m3815setimpl(r9, r12, ComposeUiNode.Companion.getSetMeasurePolicy());
        Updater.m3815setimpl(r9, r7, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> r10 = ComposeUiNode.Companion.getSetCompositeKeyHash();
        if (r9.getInserting() == true) goto L25;
        if (Intrinsics.areEqual(r9.rememberedValue(), Integer.valueOf(r2)) == false) goto L25;
    L26:
        Updater.m3815setimpl(r9, r3, ComposeUiNode.Companion.getSetModifier());
        int r11 = (r18 >> 6) & 14;
        ComposerKt.sourceInformationMarkerStart($composer, -384672921, "C89@4556L9:Column.kt#2w3rfo");
        ColumnScopeInstance r13 = ColumnScopeInstance.INSTANCE;
        int r14 = ((390 >> 6) & 112) | 6;
        ComposerKt.sourceInformationMarkerStart($composer, 1212160098, "C244@9859L47,245@9927L77,246@10025L29,247@10075L63,248@10159L30,254@10434L62,250@10252L132,249@10210L460:KnowledgeScreens.kt#cyjvf");
        TextKt.m2820Text4IGK_g("☆", null, HuiyuanDesignKt.getSignalPink(), TextUnitKt.getSp(58), null, null, null, 0, null, null, 0, 0, false, 0, 0, null, null, $composer, 3462, 0, 131058);
        TextKt.m2820Text4IGK_g("收藏夹还是空的", null, HuiyuanDesignKt.getInk(), TextUnitKt.getSp(20), null, FontWeight.Companion.getBlack(), null, 0, null, null, 0, 0, false, 0, 0, null, null, $composer, 200070, 0, 131026);
        SpacerKt.Spacer(SizeKt.m758height3ABfNKs(Modifier.Companion, Dp.m6973constructorimpl(6)), $composer, 6);
        TextKt.m2820Text4IGK_g("去语录库看看，把有感觉的句子带回来。", null, HuiyuanDesignKt.getMutedText(), TextUnitKt.getSp(13), null, null, null, 0, null, null, 0, 0, false, 0, 0, null, null, $composer, 3462, 0, 131058);
        SpacerKt.Spacer(SizeKt.m758height3ABfNKs(Modifier.Companion, Dp.m6973constructorimpl(18)), $composer, 6);
        ButtonColors r31 = ButtonDefaults.INSTANCE.m1936buttonColorsro_MJ88(HuiyuanDesignKt.getInk(), Color.Companion.m4403getWhite0d7_KjU(), 0, 0, $composer, (ButtonDefaults.$stable << 12) | 54, 12);
        RoundedCornerShape r15 = RoundedCornerShapeKt.m1018RoundedCornerShape0680j_4(Dp.m6973constructorimpl(12));
        ComposerKt.sourceInformationMarkerStart($composer, -1623454150, "CC(remember):KnowledgeScreens.kt#9igjgp");
        boolean r16 = $composer.changedInstance($haptics) | $composer.changed($onExplore);
        Object r19 = $composer.rememberedValue();
        if (r16 == true) goto L33;
        if (r19 == Composer.Companion.getEmpty()) goto L33;
    L34:
        ComposerKt.sourceInformationMarkerEnd($composer);
        ButtonKt.Button((Function0) r19, null, false, r15, r31, null, null, null, null, ComposableSingletons$KnowledgeScreensKt.INSTANCE.getLambda$1130705734$app(), $composer, 805306368, 486);
        ComposerKt.sourceInformationMarkerEnd($composer);
        ComposerKt.sourceInformationMarkerEnd($composer);
        $composer.endNode();
        ComposerKt.sourceInformationMarkerEnd($composer);
        ComposerKt.sourceInformationMarkerEnd($composer);
        ComposerKt.sourceInformationMarkerEnd($composer);
        if (ComposerKt.isTraceInProgress() == false) goto L39;
        ComposerKt.traceEventEnd();
    L33:
        r19 = new KnowledgeScreensKt$$ExternalSyntheticLambda26($haptics, $onExplore);
        $composer.updateRememberedValue(r19);
    L25:
        r9.updateRememberedValue(Integer.valueOf(r2));
        r9.apply(Integer.valueOf(r2), r10);
        goto L26
    L17:
        r8 = r17;
        $composer.useNode();
        goto L18
    L5:
        r4 = false;
        goto L7
    }

    static final Unit FavoritesScreen$lambda$54$lambda$53$lambda$46$lambda$45$lambda$44$lambda$43(AppHaptics $haptics, Function0 $onExplore) {
        $haptics.perform(HapticCue.SELECTION);
        $onExplore.invoke();
        return Unit.INSTANCE;
    }

    static final Object FavoritesScreen$lambda$54$lambda$53$lambda$47(FavoriteRecord it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return it.getText();
    }

    private static final void KnowledgeCard(final LexiconEntry entry, final String askName, final boolean isLandscape, final boolean favorite, final Function0<Unit> r27, final Function0<Unit> r28, final Function0<Unit> r29, final Function0<Unit> r30, Composer $composer, final int $changed) {
        Composer $composer2 = $composer.startRestartGroup(-648603999);
        ComposerKt.sourceInformation($composer2, "C(KnowledgeCard)P(1!1,3!1,5,7,6)302@12054L1255,296@11824L1485:KnowledgeScreens.kt#cyjvf");
        int $dirty = $changed;
        if (($changed & 6) != 0) goto L9;
        LexiconEntry r2 = entry;
        if ($composer2.changedInstance(r2) == false) goto L7;
        int r4 = 4;
    L8:
        $dirty = $dirty | r4;
    L11:
        if (($changed & 48) != 0) goto L17;
        String r5 = askName;
        if ($composer2.changed(r5) == false) goto L15;
        int r6 = 32;
    L16:
        $dirty = $dirty | r6;
    L19:
        if (($changed & 384) != 0) goto L26;
        if ($composer2.changed(isLandscape) == false) goto L23;
        int r7 = 256;
    L24:
        $dirty = $dirty | r7;
        goto L26
    L23:
        r7 = 128;
    L26:
        if (($changed & 3072) != 0) goto L32;
        boolean r8 = favorite;
        if ($composer2.changed(r8) == false) goto L30;
        int r9 = 2048;
    L31:
        $dirty = $dirty | r9;
    L34:
        if (($changed & 24576) != 0) goto L40;
        Function0<Unit> r10 = r27;
        if ($composer2.changedInstance(r10) == false) goto L38;
        int r11 = 16384;
    L39:
        $dirty = $dirty | r11;
    L42:
        if ((196608 & $changed) != 0) goto L48;
        Function0<Unit> r12 = r28;
        if ($composer2.changedInstance(r12) == false) goto L46;
        int r13 = 131072;
    L47:
        $dirty = $dirty | r13;
    L50:
        if ((1572864 & $changed) != 0) goto L56;
        Function0<Unit> r14 = r29;
        if ($composer2.changedInstance(r14) == false) goto L54;
        int r15 = 1048576;
    L55:
        $dirty = $dirty | r15;
    L58:
        if ((12582912 & $changed) != 0) goto L64;
        Function0<Unit> r16 = r30;
        if ($composer2.changedInstance(r16) == false) goto L62;
        int r17 = 8388608;
    L63:
        $dirty = $dirty | r17;
    L66:
        if ((4793491 & $dirty) == 4793490) goto L68;
        boolean r18 = true;
    L70:
        if ($composer2.shouldExecute(r18, $dirty & 1) == true) goto L72;
        $composer2.skipToGroupEnd();
    L82:
        ScopeUpdateScope r19 = $composer2.endRestartGroup();
        if (r19 == null) goto L86;
        r19.updateScope(new KnowledgeScreensKt$$ExternalSyntheticLambda25(entry, askName, isLandscape, favorite, r27, r28, r29, r30, $changed));
        return;
    L86:
        return;
    L72:
        if (ComposerKt.isTraceInProgress() == false) goto L74;
        ComposerKt.traceEventStart(-648603999, $dirty, -1, "com.luchime.huiyuan.ui.KnowledgeCard (KnowledgeScreens.kt:295)");
    L74:
        Modifier.Companion r0 = Modifier.Companion;
        if (isLandscape == false) goto L77;
        float r110 = 0.92f;
    L78:
        final LexiconEntry r111 = r2;
        final String r21 = r5;
        final boolean r112 = r8;
        final Function0<Unit> r113 = r10;
        final Function0<Unit> r20 = r12;
        final Function0<Unit> r114 = r14;
        final Function0<Unit> r22 = r16;
        HuiyuanDesignKt.m7414RetroCard3IgeMak(PaddingKt.m726paddingVpY3zN4(SizeKt.m779widthInVpY3zN4$default(SizeKt.fillMaxWidth(r0, r110), 0.0f, Dp.m6973constructorimpl(820), 1, null), Dp.m6973constructorimpl(16), Dp.m6973constructorimpl(7)), Color.Companion.m4403getWhite0d7_KjU(), ComposableLambdaKt.rememberComposableLambda(1040336695, true, new KnowledgeScreensKt$$ExternalSyntheticLambda24(r111, r112, r114, r113, r20, r21, r22), $composer2, 54), $composer2, 432, 0);
        if (ComposerKt.isTraceInProgress() == false) goto L82;
        ComposerKt.traceEventEnd();
        goto L82
    L77:
        r110 = 1.0f;
        goto L78
    L68:
        r18 = false;
        goto L70
    L62:
        r17 = 4194304;
        goto L63
    L64:
        r16 = r30;
        goto L66
    L54:
        r15 = 524288;
        goto L55
    L56:
        r14 = r29;
        goto L58
    L46:
        r13 = 65536;
        goto L47
    L48:
        r12 = r28;
        goto L50
    L38:
        r11 = 8192;
        goto L39
    L40:
        r10 = r27;
        goto L42
    L30:
        r9 = 1024;
        goto L31
    L32:
        r8 = favorite;
        goto L34
    L15:
        r6 = 16;
        goto L16
    L17:
        r5 = askName;
        goto L19
    L7:
        r4 = 2;
        goto L8
    L9:
        r2 = entry;
        goto L11
    }

    static final Unit KnowledgeCard$lambda$59(LexiconEntry $entry, boolean $favorite, Function0 $onFavorite, Function0 $onCopy, Function0 $onShare, String $askName, Function0 $onAsk, BoxScope $this$RetroCard, Composer $composer, int $changed) {
        Intrinsics.checkNotNullParameter($this$RetroCard, "$this$RetroCard");
        ComposerKt.sourceInformation($composer, "C303@12064L1239:KnowledgeScreens.kt#cyjvf");
        if (($changed & 17) == 16) goto L5;
        boolean r2 = true;
    L7:
        if ($composer.shouldExecute(r2, $changed & 1) == true) goto L9;
        $composer.skipToGroupEnd();
    L69:
        return Unit.INSTANCE;
    L9:
        if (ComposerKt.isTraceInProgress() == false) goto L11;
        ComposerKt.traceEventStart(1040336695, $changed, -1, "com.luchime.huiyuan.ui.KnowledgeCard.<anonymous> (KnowledgeScreens.kt:303)");
    L11:
        ComposerKt.sourceInformationMarkerStart($composer, -483455358, "CC(Column)P(2,3,1)87@4442L61,88@4508L133:Column.kt#2w3rfo");
        Modifier r8 = Modifier.Companion;
        MeasurePolicy r11 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.Companion.getStart(), $composer, ((0 >> 3) & 14) | ((0 >> 3) & 112));
        ComposerKt.sourceInformationMarkerStart($composer, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
        int r17 = ComposablesKt.getCurrentCompositeKeyHash($composer, 0);
        CompositionLocalMap r6 = $composer.getCurrentCompositionLocalMap();
        Modifier r15 = ComposedModifierKt.materializeModifier($composer, r8);
        Function0<ComposeUiNode> r20 = ComposeUiNode.Companion.getConstructor();
        int r21 = ((((0 << 3) & 112) << 6) & 896) | 6;
        ComposerKt.sourceInformationMarkerStart($composer, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
        if (($composer.getApplier() instanceof Applier) == true) goto L14;
        ComposablesKt.invalidApplier();
    L14:
        $composer.startReusableNode();
        if ($composer.getInserting() == false) goto L17;
        Function0<ComposeUiNode> r0 = r20;
        $composer.createNode(r0);
    L18:
        Composer r1 = Updater.m3808constructorimpl($composer);
        Updater.m3815setimpl(r1, r11, ComposeUiNode.Companion.getSetMeasurePolicy());
        Updater.m3815setimpl(r1, r6, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> r3 = ComposeUiNode.Companion.getSetCompositeKeyHash();
        if (r1.getInserting() == true) goto L24;
        Composer r30 = $composer;
        if (Intrinsics.areEqual(r1.rememberedValue(), Integer.valueOf(r17)) == true) goto L26;
    L25:
        r1.updateRememberedValue(Integer.valueOf(r17));
        r1.apply(Integer.valueOf(r17), r3);
    L26:
        Updater.m3815setimpl(r1, r15, ComposeUiNode.Companion.getSetModifier());
        int r4 = (r21 >> 6) & 14;
        Composer r5 = r30;
        ComposerKt.sourceInformationMarkerStart(r5, -384672921, "C89@4556L9:Column.kt#2w3rfo");
        ColumnScopeInstance r7 = ColumnScopeInstance.INSTANCE;
        int r9 = ((0 >> 6) & 112) | 6;
        ComposerKt.sourceInformationMarkerStart(r5, 1242057834, "C304@12085L669,320@12767L30,321@12810L200,328@13023L30,329@13066L227:KnowledgeScreens.kt#cyjvf");
        Modifier r10 = SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, null);
        Arrangement.Horizontal r12 = Arrangement.INSTANCE.getSpaceBetween();
        Alignment.Vertical r13 = Alignment.Companion.getCenterVertically();
        ComposerKt.sourceInformationMarkerStart(r5, 693286680, "CC(Row)P(2,1,3)99@5124L58,100@5187L130:Row.kt#2w3rfo");
        MeasurePolicy r14 = RowKt.rowMeasurePolicy(r12, r13, r5, ((438 >> 3) & 14) | ((438 >> 3) & 112));
        ComposerKt.sourceInformationMarkerStart(r5, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
        int r37 = ComposablesKt.getCurrentCompositeKeyHash(r5, 0);
        CompositionLocalMap r16 = r5.getCurrentCompositionLocalMap();
        Modifier r18 = ComposedModifierKt.materializeModifier(r5, r10);
        Function0<ComposeUiNode> r34 = ComposeUiNode.Companion.getConstructor();
        int r19 = ((((438 << 3) & 112) << 6) & 896) | 6;
        ComposerKt.sourceInformationMarkerStart(r5, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
        if ((r5.getApplier() instanceof Applier) == true) goto L29;
        ComposablesKt.invalidApplier();
    L29:
        r5.startReusableNode();
        if (r5.getInserting() == false) goto L32;
        Function0<ComposeUiNode> r22 = r34;
        r5.createNode(r22);
    L33:
        Composer r23 = Updater.m3808constructorimpl(r5);
        Updater.m3815setimpl(r23, r14, ComposeUiNode.Companion.getSetMeasurePolicy());
        Updater.m3815setimpl(r23, r16, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> r24 = ComposeUiNode.Companion.getSetCompositeKeyHash();
        if (r23.getInserting() == true) goto L40;
        if (Intrinsics.areEqual(r23.rememberedValue(), Integer.valueOf(r37)) == false) goto L40;
    L41:
        Updater.m3815setimpl(r23, r18, ComposeUiNode.Companion.getSetModifier());
        int r25 = (r19 >> 6) & 14;
        ComposerKt.sourceInformationMarkerStart(r5, -407735110, "C101@5232L9:Row.kt#2w3rfo");
        RowScopeInstance r43 = RowScopeInstance.INSTANCE;
        int r45 = ((438 >> 6) & 112) | 6;
        ComposerKt.sourceInformationMarkerStart(r5, -861891855, "C309@12303L60,310@12380L360:KnowledgeScreens.kt#cyjvf");
        HuiyuanDesignKt.m7413CategoryBadgeiJQMabo($entry.getCategory(), categoryColor($entry.getCategory()), r5, 0, 0);
        if ($favorite == false) goto L44;
        String r26 = "★";
    L45:
        String r61 = r26;
        if ($favorite == false) goto L48;
        long r49 = HuiyuanDesignKt.getSignalPink();
    L49:
        TextKt.m2820Text4IGK_g(r61, AppHapticsKt.hapticClickable$default(Modifier.Companion, false, HapticCue.SELECTION, $onFavorite, 1, null), r49, TextUnitKt.getSp(25), null, null, null, 0, null, null, 0, 0, false, 0, 0, null, null, r5, 3072, 0, 131056);
        ComposerKt.sourceInformationMarkerEnd(r5);
        ComposerKt.sourceInformationMarkerEnd(r5);
        r5.endNode();
        ComposerKt.sourceInformationMarkerEnd(r5);
        ComposerKt.sourceInformationMarkerEnd(r5);
        ComposerKt.sourceInformationMarkerEnd(r5);
        SpacerKt.Spacer(SizeKt.m758height3ABfNKs(Modifier.Companion, Dp.m6973constructorimpl(10)), r5, 6);
        TextKt.m2820Text4IGK_g($entry.getText(), null, HuiyuanDesignKt.getInk(), TextUnitKt.getSp(15), null, FontWeight.Companion.getMedium(), null, 0, null, null, TextUnitKt.getSp(24), 0, false, 0, 0, null, null, r5, 200064, 6, 130002);
        SpacerKt.Spacer(SizeKt.m758height3ABfNKs(Modifier.Companion, Dp.m6973constructorimpl(11)), r5, 6);
        Arrangement.Horizontal r27 = Arrangement.INSTANCE.m606spacedBy0680j_4(Dp.m6973constructorimpl(8));
        ComposerKt.sourceInformationMarkerStart(r5, 693286680, "CC(Row)P(2,1,3)99@5124L58,100@5187L130:Row.kt#2w3rfo");
        Modifier r28 = Modifier.Companion;
        MeasurePolicy r29 = RowKt.rowMeasurePolicy(r27, Alignment.Companion.getTop(), r5, ((48 >> 3) & 14) | ((48 >> 3) & 112));
        ComposerKt.sourceInformationMarkerStart(r5, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
        int r31 = ComposablesKt.getCurrentCompositeKeyHash(r5, 0);
        CompositionLocalMap r32 = r5.getCurrentCompositionLocalMap();
        Modifier r33 = ComposedModifierKt.materializeModifier(r5, r28);
        Function0<ComposeUiNode> r35 = ComposeUiNode.Companion.getConstructor();
        int r36 = ((((48 << 3) & 112) << 6) & 896) | 6;
        ComposerKt.sourceInformationMarkerStart(r5, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
        if ((r5.getApplier() instanceof Applier) == true) goto L52;
        ComposablesKt.invalidApplier();
    L52:
        r5.startReusableNode();
        if (r5.getInserting() == false) goto L55;
        Function0<ComposeUiNode> r38 = r35;
        r5.createNode(r38);
    L56:
        Composer r39 = Updater.m3808constructorimpl(r5);
        Updater.m3815setimpl(r39, r29, ComposeUiNode.Companion.getSetMeasurePolicy());
        Updater.m3815setimpl(r39, r32, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> r40 = ComposeUiNode.Companion.getSetCompositeKeyHash();
        if (r39.getInserting() == true) goto L63;
        if (Intrinsics.areEqual(r39.rememberedValue(), Integer.valueOf(r31)) == false) goto L63;
    L64:
        Updater.m3815setimpl(r39, r33, ComposeUiNode.Companion.getSetModifier());
        int r41 = (r36 >> 6) & 14;
        ComposerKt.sourceInformationMarkerStart(r5, -407735110, "C101@5232L9:Row.kt#2w3rfo");
        RowScopeInstance r42 = RowScopeInstance.INSTANCE;
        int r44 = ((48 >> 6) & 112) | 6;
        ComposerKt.sourceInformationMarkerStart(r5, 153994130, "C330@13140L25,331@13182L26,332@13225L54:KnowledgeScreens.kt#cyjvf");
        m7416SmallActionFNF3uiM("复制", $onCopy, 0, r5, 6, 4);
        m7416SmallActionFNF3uiM("分享", $onShare, 0, r5, 6, 4);
        m7416SmallActionFNF3uiM("问" + $askName, $onAsk, HuiyuanDesignKt.getSignalYellow(), r5, 384, 0);
        ComposerKt.sourceInformationMarkerEnd(r5);
        ComposerKt.sourceInformationMarkerEnd(r5);
        r5.endNode();
        ComposerKt.sourceInformationMarkerEnd(r5);
        ComposerKt.sourceInformationMarkerEnd(r5);
        ComposerKt.sourceInformationMarkerEnd(r5);
        ComposerKt.sourceInformationMarkerEnd(r5);
        ComposerKt.sourceInformationMarkerEnd(r5);
        r30.endNode();
        ComposerKt.sourceInformationMarkerEnd(r30);
        ComposerKt.sourceInformationMarkerEnd(r30);
        ComposerKt.sourceInformationMarkerEnd(r30);
        if (ComposerKt.isTraceInProgress() == false) goto L69;
        ComposerKt.traceEventEnd();
    L63:
        r39.updateRememberedValue(Integer.valueOf(r31));
        r39.apply(Integer.valueOf(r31), r40);
        goto L64
    L55:
        r38 = r35;
        r5.useNode();
        goto L56
    L48:
        r49 = HuiyuanDesignKt.getMutedText();
        goto L49
    L44:
        r26 = "☆";
    L40:
        r23.updateRememberedValue(Integer.valueOf(r37));
        r23.apply(Integer.valueOf(r37), r24);
        goto L41
    L32:
        r22 = r34;
        r5.useNode();
        goto L33
    L24:
        r30 = $composer;
        goto L25
    L17:
        r0 = r20;
        $composer.useNode();
        goto L18
    L5:
        r2 = false;
        goto L7
    }

    private static final void FavoriteCard(final FavoriteRecord favorite, final boolean isLandscape, final Function0<Unit> r21, final Function0<Unit> r22, final Function0<Unit> r23, final Function0<Unit> r24, Composer $composer, final int $changed) {
        Composer $composer2 = $composer.startRestartGroup(-1974502339);
        ComposerKt.sourceInformation($composer2, "C(FavoriteCard)P(!2,3,5,4)353@13736L1257,347@13512L1481:KnowledgeScreens.kt#cyjvf");
        int $dirty = $changed;
        if (($changed & 6) != 0) goto L9;
        final FavoriteRecord r14 = favorite;
        if ($composer2.changed(r14) == false) goto L7;
        int r3 = 4;
    L8:
        $dirty = $dirty | r3;
    L11:
        if (($changed & 48) != 0) goto L18;
        if ($composer2.changed(isLandscape) == false) goto L15;
        int r4 = 32;
    L16:
        $dirty = $dirty | r4;
        goto L18
    L15:
        r4 = 16;
    L18:
        if (($changed & 384) != 0) goto L24;
        Function0<Unit> r5 = r21;
        if ($composer2.changedInstance(r5) == false) goto L22;
        int r6 = 256;
    L23:
        $dirty = $dirty | r6;
    L26:
        if (($changed & 3072) != 0) goto L32;
        Function0<Unit> r7 = r22;
        if ($composer2.changedInstance(r7) == false) goto L30;
        int r8 = 2048;
    L31:
        $dirty = $dirty | r8;
    L34:
        if (($changed & 24576) != 0) goto L40;
        final Function0<Unit> r15 = r23;
        if ($composer2.changedInstance(r15) == false) goto L38;
        int r9 = 16384;
    L39:
        $dirty = $dirty | r9;
    L42:
        if ((196608 & $changed) != 0) goto L48;
        Function0<Unit> r10 = r24;
        if ($composer2.changedInstance(r10) == false) goto L46;
        int r11 = 131072;
    L47:
        $dirty = $dirty | r11;
    L50:
        if ((74899 & $dirty) == 74898) goto L52;
        boolean r12 = true;
    L54:
        if ($composer2.shouldExecute(r12, $dirty & 1) == true) goto L56;
        $composer2.skipToGroupEnd();
    L66:
        ScopeUpdateScope r13 = $composer2.endRestartGroup();
        if (r13 == null) goto L70;
        r13.updateScope(new KnowledgeScreensKt$$ExternalSyntheticLambda15(favorite, isLandscape, r21, r22, r23, r24, $changed));
        return;
    L70:
        return;
    L56:
        if (ComposerKt.isTraceInProgress() == false) goto L58;
        ComposerKt.traceEventStart(-1974502339, $dirty, -1, "com.luchime.huiyuan.ui.FavoriteCard (KnowledgeScreens.kt:346)");
    L58:
        Modifier.Companion r0 = Modifier.Companion;
        if (isLandscape == false) goto L61;
        float r16 = 0.92f;
    L62:
        final Function0<Unit> r17 = r5;
        final Function0<Unit> r18 = r7;
        final Function0<Unit> r19 = r10;
        HuiyuanDesignKt.m7414RetroCard3IgeMak(PaddingKt.m726paddingVpY3zN4(SizeKt.m779widthInVpY3zN4$default(SizeKt.fillMaxWidth(r0, r16), 0.0f, Dp.m6973constructorimpl(820), 1, null), Dp.m6973constructorimpl(16), Dp.m6973constructorimpl(7)), HuiyuanDesignKt.getCream(), ComposableLambdaKt.rememberComposableLambda(-489305261, true, new KnowledgeScreensKt$$ExternalSyntheticLambda14(r14, r15, r17, r18, r19), $composer2, 54), $composer2, 432, 0);
        if (ComposerKt.isTraceInProgress() == false) goto L66;
        ComposerKt.traceEventEnd();
        goto L66
    L61:
        r16 = 1.0f;
        goto L62
    L52:
        r12 = false;
        goto L54
    L46:
        r11 = 65536;
        goto L47
    L48:
        r10 = r24;
        goto L50
    L38:
        r9 = 8192;
        goto L39
    L40:
        r15 = r23;
        goto L42
    L30:
        r8 = 1024;
        goto L31
    L32:
        r7 = r22;
        goto L34
    L22:
        r6 = 128;
        goto L23
    L24:
        r5 = r21;
        goto L26
    L7:
        r3 = 2;
        goto L8
    L9:
        r14 = favorite;
        goto L11
    }

    static final Unit FavoriteCard$lambda$64(FavoriteRecord $favorite, Function0 $onRemove, Function0 $onCopy, Function0 $onShare, Function0 $onAsk, BoxScope $this$RetroCard, Composer $composer, int $changed) {
        Intrinsics.checkNotNullParameter($this$RetroCard, "$this$RetroCard");
        ComposerKt.sourceInformation($composer, "C354@13746L1241:KnowledgeScreens.kt#cyjvf");
        if (($changed & 17) == 16) goto L5;
        boolean r2 = true;
    L7:
        if ($composer.shouldExecute(r2, $changed & 1) == true) goto L9;
        $composer.skipToGroupEnd();
    L61:
        return Unit.INSTANCE;
    L9:
        if (ComposerKt.isTraceInProgress() == false) goto L11;
        ComposerKt.traceEventStart(-489305261, $changed, -1, "com.luchime.huiyuan.ui.FavoriteCard.<anonymous> (KnowledgeScreens.kt:354)");
    L11:
        ComposerKt.sourceInformationMarkerStart($composer, -483455358, "CC(Column)P(2,3,1)87@4442L61,88@4508L133:Column.kt#2w3rfo");
        Modifier r8 = Modifier.Companion;
        MeasurePolicy r11 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.Companion.getStart(), $composer, ((0 >> 3) & 14) | ((0 >> 3) & 112));
        ComposerKt.sourceInformationMarkerStart($composer, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
        int r17 = ComposablesKt.getCurrentCompositeKeyHash($composer, 0);
        CompositionLocalMap r6 = $composer.getCurrentCompositionLocalMap();
        Modifier r15 = ComposedModifierKt.materializeModifier($composer, r8);
        Function0<ComposeUiNode> r20 = ComposeUiNode.Companion.getConstructor();
        int r21 = ((((0 << 3) & 112) << 6) & 896) | 6;
        ComposerKt.sourceInformationMarkerStart($composer, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
        if (($composer.getApplier() instanceof Applier) == true) goto L14;
        ComposablesKt.invalidApplier();
    L14:
        $composer.startReusableNode();
        if ($composer.getInserting() == false) goto L17;
        Function0<ComposeUiNode> r0 = r20;
        $composer.createNode(r0);
    L18:
        Composer r1 = Updater.m3808constructorimpl($composer);
        Updater.m3815setimpl(r1, r11, ComposeUiNode.Companion.getSetMeasurePolicy());
        Updater.m3815setimpl(r1, r6, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> r3 = ComposeUiNode.Companion.getSetCompositeKeyHash();
        if (r1.getInserting() == true) goto L24;
        Composer r30 = $composer;
        if (Intrinsics.areEqual(r1.rememberedValue(), Integer.valueOf(r17)) == true) goto L26;
    L25:
        r1.updateRememberedValue(Integer.valueOf(r17));
        r1.apply(Integer.valueOf(r17), r3);
    L26:
        Updater.m3815setimpl(r1, r15, ComposeUiNode.Companion.getSetModifier());
        int r4 = (r21 >> 6) & 14;
        Composer r5 = r30;
        ComposerKt.sourceInformationMarkerStart(r5, -384672921, "C89@4556L9:Column.kt#2w3rfo");
        ColumnScopeInstance r7 = ColumnScopeInstance.INSTANCE;
        int r9 = ((0 >> 6) & 112) | 6;
        ComposerKt.sourceInformationMarkerStart(r5, -1251546740, "C355@13767L674,372@14454L30,373@14497L203,380@14713L30,381@14756L221:KnowledgeScreens.kt#cyjvf");
        Modifier r10 = SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, null);
        Arrangement.Horizontal r12 = Arrangement.INSTANCE.getSpaceBetween();
        Alignment.Vertical r13 = Alignment.Companion.getCenterVertically();
        ComposerKt.sourceInformationMarkerStart(r5, 693286680, "CC(Row)P(2,1,3)99@5124L58,100@5187L130:Row.kt#2w3rfo");
        MeasurePolicy r14 = RowKt.rowMeasurePolicy(r12, r13, r5, ((438 >> 3) & 14) | ((438 >> 3) & 112));
        ComposerKt.sourceInformationMarkerStart(r5, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
        int r37 = ComposablesKt.getCurrentCompositeKeyHash(r5, 0);
        CompositionLocalMap r16 = r5.getCurrentCompositionLocalMap();
        Modifier r18 = ComposedModifierKt.materializeModifier(r5, r10);
        Function0<ComposeUiNode> r34 = ComposeUiNode.Companion.getConstructor();
        int r19 = ((((438 << 3) & 112) << 6) & 896) | 6;
        ComposerKt.sourceInformationMarkerStart(r5, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
        if ((r5.getApplier() instanceof Applier) == true) goto L29;
        ComposablesKt.invalidApplier();
    L29:
        r5.startReusableNode();
        if (r5.getInserting() == false) goto L32;
        Function0<ComposeUiNode> r22 = r34;
        r5.createNode(r22);
    L33:
        Composer r23 = Updater.m3808constructorimpl(r5);
        Updater.m3815setimpl(r23, r14, ComposeUiNode.Companion.getSetMeasurePolicy());
        Updater.m3815setimpl(r23, r16, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> r24 = ComposeUiNode.Companion.getSetCompositeKeyHash();
        if (r23.getInserting() == true) goto L40;
        if (Intrinsics.areEqual(r23.rememberedValue(), Integer.valueOf(r37)) == false) goto L40;
    L41:
        Updater.m3815setimpl(r23, r18, ComposeUiNode.Companion.getSetModifier());
        int r25 = (r19 >> 6) & 14;
        ComposerKt.sourceInformationMarkerStart(r5, -407735110, "C101@5232L9:Row.kt#2w3rfo");
        RowScopeInstance r43 = RowScopeInstance.INSTANCE;
        int r45 = ((438 >> 6) & 112) | 6;
        ComposerKt.sourceInformationMarkerStart(r5, 1054273392, "C360@13985L66,361@14068L359:KnowledgeScreens.kt#cyjvf");
        HuiyuanDesignKt.m7413CategoryBadgeiJQMabo($favorite.getCategory(), categoryColor($favorite.getCategory()), r5, 0, 0);
        TextKt.m2820Text4IGK_g("移除", AppHapticsKt.hapticClickable$default(Modifier.Companion, false, HapticCue.DESTRUCTIVE, $onRemove, 1, null), HuiyuanDesignKt.getSignalRed(), TextUnitKt.getSp(11), null, FontWeight.Companion.getBlack(), null, 0, null, null, 0, 0, false, 0, 0, null, null, r5, 200070, 0, 131024);
        ComposerKt.sourceInformationMarkerEnd(r5);
        ComposerKt.sourceInformationMarkerEnd(r5);
        r5.endNode();
        ComposerKt.sourceInformationMarkerEnd(r5);
        ComposerKt.sourceInformationMarkerEnd(r5);
        ComposerKt.sourceInformationMarkerEnd(r5);
        SpacerKt.Spacer(SizeKt.m758height3ABfNKs(Modifier.Companion, Dp.m6973constructorimpl(10)), r5, 6);
        TextKt.m2820Text4IGK_g($favorite.getText(), null, HuiyuanDesignKt.getInk(), TextUnitKt.getSp(15), null, FontWeight.Companion.getMedium(), null, 0, null, null, TextUnitKt.getSp(24), 0, false, 0, 0, null, null, r5, 200064, 6, 130002);
        SpacerKt.Spacer(SizeKt.m758height3ABfNKs(Modifier.Companion, Dp.m6973constructorimpl(11)), r5, 6);
        Arrangement.Horizontal r26 = Arrangement.INSTANCE.m606spacedBy0680j_4(Dp.m6973constructorimpl(8));
        ComposerKt.sourceInformationMarkerStart(r5, 693286680, "CC(Row)P(2,1,3)99@5124L58,100@5187L130:Row.kt#2w3rfo");
        Modifier r27 = Modifier.Companion;
        MeasurePolicy r28 = RowKt.rowMeasurePolicy(r26, Alignment.Companion.getTop(), r5, ((48 >> 3) & 14) | ((48 >> 3) & 112));
        ComposerKt.sourceInformationMarkerStart(r5, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
        int r29 = ComposablesKt.getCurrentCompositeKeyHash(r5, 0);
        CompositionLocalMap r31 = r5.getCurrentCompositionLocalMap();
        Modifier r32 = ComposedModifierKt.materializeModifier(r5, r27);
        Function0<ComposeUiNode> r33 = ComposeUiNode.Companion.getConstructor();
        int r35 = ((((48 << 3) & 112) << 6) & 896) | 6;
        ComposerKt.sourceInformationMarkerStart(r5, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
        if ((r5.getApplier() instanceof Applier) == true) goto L44;
        ComposablesKt.invalidApplier();
    L44:
        r5.startReusableNode();
        if (r5.getInserting() == false) goto L47;
        Function0<ComposeUiNode> r36 = r33;
        r5.createNode(r36);
    L48:
        Composer r38 = Updater.m3808constructorimpl(r5);
        Updater.m3815setimpl(r38, r28, ComposeUiNode.Companion.getSetMeasurePolicy());
        Updater.m3815setimpl(r38, r31, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> r39 = ComposeUiNode.Companion.getSetCompositeKeyHash();
        if (r38.getInserting() == true) goto L55;
        if (Intrinsics.areEqual(r38.rememberedValue(), Integer.valueOf(r29)) == false) goto L55;
    L56:
        Updater.m3815setimpl(r38, r32, ComposeUiNode.Companion.getSetModifier());
        int r40 = (r35 >> 6) & 14;
        ComposerKt.sourceInformationMarkerStart(r5, -407735110, "C101@5232L9:Row.kt#2w3rfo");
        RowScopeInstance r41 = RowScopeInstance.INSTANCE;
        int r42 = ((48 >> 6) & 112) | 6;
        ComposerKt.sourceInformationMarkerStart(r5, -551773444, "C382@14830L25,383@14872L26,384@14915L48:KnowledgeScreens.kt#cyjvf");
        m7416SmallActionFNF3uiM("复制", $onCopy, 0, r5, 6, 4);
        m7416SmallActionFNF3uiM("分享", $onShare, 0, r5, 6, 4);
        m7416SmallActionFNF3uiM("继续聊", $onAsk, HuiyuanDesignKt.getSignalYellow(), r5, 390, 0);
        ComposerKt.sourceInformationMarkerEnd(r5);
        ComposerKt.sourceInformationMarkerEnd(r5);
        r5.endNode();
        ComposerKt.sourceInformationMarkerEnd(r5);
        ComposerKt.sourceInformationMarkerEnd(r5);
        ComposerKt.sourceInformationMarkerEnd(r5);
        ComposerKt.sourceInformationMarkerEnd(r5);
        ComposerKt.sourceInformationMarkerEnd(r5);
        r30.endNode();
        ComposerKt.sourceInformationMarkerEnd(r30);
        ComposerKt.sourceInformationMarkerEnd(r30);
        ComposerKt.sourceInformationMarkerEnd(r30);
        if (ComposerKt.isTraceInProgress() == false) goto L61;
        ComposerKt.traceEventEnd();
    L55:
        r38.updateRememberedValue(Integer.valueOf(r29));
        r38.apply(Integer.valueOf(r29), r39);
        goto L56
    L47:
        r36 = r33;
        r5.useNode();
    L40:
        r23.updateRememberedValue(Integer.valueOf(r37));
        r23.apply(Integer.valueOf(r37), r24);
        goto L41
    L32:
        r22 = r34;
        r5.useNode();
        goto L33
    L24:
        r30 = $composer;
        goto L25
    L17:
        r0 = r20;
        $composer.useNode();
        goto L18
    L5:
        r2 = false;
        goto L7
    }

    /* JADX INFO: renamed from: SmallAction-FNF3uiM, reason: not valid java name */
    private static final void m7416SmallActionFNF3uiM(final String text, final Function0<Unit> r32, long accent, Composer $composer, final int $changed, final int r37) {
        Composer $composer2 = $composer.startRestartGroup(142554167);
        ComposerKt.sourceInformation($composer2, "C(SmallAction)P(2,1,0:c#ui.graphics.Color)392@15097L387:KnowledgeScreens.kt#cyjvf");
        int $dirty = $changed;
        if (($changed & 6) != 0) goto L9;
        String r6 = text;
        if ($composer2.changed(r6) == false) goto L7;
        int r3 = 4;
    L8:
        $dirty = $dirty | r3;
    L11:
        if (($changed & 48) != 0) goto L17;
        Function0<Unit> r10 = r32;
        if ($composer2.changedInstance(r10) == false) goto L15;
        int r4 = 32;
    L16:
        $dirty = $dirty | r4;
    L18:
        int r5 = r37 & 4;
        if (r5 == 0) goto L22;
        $dirty = $dirty | 384;
        long r7 = accent;
    L30:
        if (($dirty & 147) == 146) goto L32;
        boolean r8 = true;
    L34:
        if ($composer2.shouldExecute(r8, $dirty & 1) == false) goto L44;
        if (r5 == 0) goto L37;
        final long accent2 = HuiyuanDesignKt.getPaper();
    L39:
        if (ComposerKt.isTraceInProgress() == false) goto L41;
        ComposerKt.traceEventStart(142554167, $dirty, -1, "com.luchime.huiyuan.ui.SmallAction (KnowledgeScreens.kt:391)");
    L41:
        Composer $composer3 = $composer2;
        TextKt.m2820Text4IGK_g(r6, PaddingKt.m726paddingVpY3zN4(AppHapticsKt.hapticClickable$default(BorderKt.m245borderxT4_qwU(BackgroundKt.m233backgroundbw27NRU(Modifier.Companion, accent2, RoundedCornerShapeKt.m1018RoundedCornerShape0680j_4(Dp.m6973constructorimpl(7))), Dp.m6973constructorimpl(1), HuiyuanDesignKt.getInk(), RoundedCornerShapeKt.m1018RoundedCornerShape0680j_4(Dp.m6973constructorimpl(7))), false, HapticCue.TAP, r10, 1, null), Dp.m6973constructorimpl(9), Dp.m6973constructorimpl(6)), HuiyuanDesignKt.getInk(), TextUnitKt.getSp(10), null, FontWeight.Companion.getBlack(), null, 0, null, null, 0, 0, false, 0, 0, null, null, $composer3, ($dirty & 14) | 200064, 0, 131024);
        if (ComposerKt.isTraceInProgress() == false) goto L45;
        ComposerKt.traceEventEnd();
    L45:
        ScopeUpdateScope r9 = $composer3.endRestartGroup();
        if (r9 == null) goto L49;
        r9.updateScope(new KnowledgeScreensKt$$ExternalSyntheticLambda17(text, r32, accent2, $changed, r37));
        return;
    L49:
        return;
    L37:
        accent2 = r7;
        goto L39
    L44:
        $composer3 = $composer2;
        $composer3.skipToGroupEnd();
        accent2 = r7;
        goto L45
    L32:
        r8 = false;
        goto L34
    L22:
        if (($changed & 384) != 0) goto L28;
        r7 = accent;
        if ($composer2.changed(r7) == false) goto L26;
        int r11 = 256;
    L27:
        $dirty = $dirty | r11;
        goto L30
    L26:
        r11 = 128;
        goto L27
    L28:
        r7 = accent;
        goto L30
    L15:
        r4 = 16;
        goto L16
    L17:
        r10 = r32;
        goto L18
    L7:
        r3 = 2;
        goto L8
    L9:
        r6 = text;
        goto L11
    }

    private static final void EmptyKnowledgeResult(Function0<Unit> r56, Composer $composer, final int $changed) {
        final Function0<Unit> r3 = r56;
        Composer $composer2 = $composer.startRestartGroup(1328526872);
        ComposerKt.sourceInformation($composer2, "C(EmptyKnowledgeResult)407@15560L726:KnowledgeScreens.kt#cyjvf");
        int $dirty = $changed;
        if (($changed & 6) == 0) goto L5;
    L9:
        int $dirty2 = $dirty;
        if (($dirty2 & 3) == 2) goto L12;
        boolean r1 = true;
    L14:
        if ($composer2.shouldExecute(r1, $dirty2 & 1) == true) goto L16;
        $composer2.skipToGroupEnd();
    L37:
        ScopeUpdateScope r0 = $composer2.endRestartGroup();
        if (r0 == null) goto L41;
        r0.updateScope(new KnowledgeScreensKt$$ExternalSyntheticLambda27(r3, $changed));
        return;
    L41:
        return;
    L16:
        if (ComposerKt.isTraceInProgress() == false) goto L18;
        ComposerKt.traceEventStart(1328526872, $dirty2, -1, "com.luchime.huiyuan.ui.EmptyKnowledgeResult (KnowledgeScreens.kt:406)");
    L18:
        Modifier r2 = PaddingKt.m725padding3ABfNKs(SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, null), Dp.m6973constructorimpl(30));
        Alignment.Horizontal r4 = Alignment.Companion.getCenterHorizontally();
        ComposerKt.sourceInformationMarkerStart($composer2, -483455358, "CC(Column)P(2,3,1)87@4442L61,88@4508L133:Column.kt#2w3rfo");
        MeasurePolicy r15 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), r4, $composer2, ((390 >> 3) & 14) | ((390 >> 3) & 112));
        ComposerKt.sourceInformationMarkerStart($composer2, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
        int r18 = ComposablesKt.getCurrentCompositeKeyHash($composer2, 0);
        CompositionLocalMap r5 = $composer2.getCurrentCompositionLocalMap();
        Modifier r6 = ComposedModifierKt.materializeModifier($composer2, r2);
        Function0<ComposeUiNode> r7 = ComposeUiNode.Companion.getConstructor();
        int r8 = ((((390 << 3) & 112) << 6) & 896) | 6;
        ComposerKt.sourceInformationMarkerStart($composer2, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
        if (($composer2.getApplier() instanceof Applier) == true) goto L21;
        ComposablesKt.invalidApplier();
    L21:
        $composer2.startReusableNode();
        if ($composer2.getInserting() == false) goto L24;
        $composer2.createNode(r7);
    L25:
        Composer r9 = Updater.m3808constructorimpl($composer2);
        Updater.m3815setimpl(r9, r15, ComposeUiNode.Companion.getSetMeasurePolicy());
        Updater.m3815setimpl(r9, r5, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> r10 = ComposeUiNode.Companion.getSetCompositeKeyHash();
        if (r9.getInserting() == true) goto L31;
        Function0<ComposeUiNode> r26 = r7;
        if (Intrinsics.areEqual(r9.rememberedValue(), Integer.valueOf(r18)) == true) goto L33;
    L32:
        r9.updateRememberedValue(Integer.valueOf(r18));
        r9.apply(Integer.valueOf(r18), r10);
    L33:
        Updater.m3815setimpl(r9, r6, ComposeUiNode.Companion.getSetModifier());
        int r22 = (r8 >> 6) & 14;
        ComposerKt.sourceInformationMarkerStart($composer2, -384672921, "C89@4556L9:Column.kt#2w3rfo");
        ColumnScopeInstance r11 = ColumnScopeInstance.INSTANCE;
        int r24 = ((390 >> 6) & 112) | 6;
        ComposerKt.sourceInformationMarkerStart($composer2, -1749824307, "C413@15728L60,414@15797L30,415@15836L444:KnowledgeScreens.kt#cyjvf");
        TextKt.m2820Text4IGK_g("没有找到匹配语录", null, HuiyuanDesignKt.getInk(), 0, null, FontWeight.Companion.getBlack(), null, 0, null, null, 0, 0, false, 0, 0, null, null, $composer2, 196998, 0, 131034);
        SpacerKt.Spacer(SizeKt.m758height3ABfNKs(Modifier.Companion, Dp.m6973constructorimpl(10)), $composer2, 6);
        r3 = r56;
        TextKt.m2820Text4IGK_g("重置筛选", PaddingKt.m726paddingVpY3zN4(AppHapticsKt.hapticClickable$default(BorderKt.m245borderxT4_qwU(BackgroundKt.m233backgroundbw27NRU(Modifier.Companion, HuiyuanDesignKt.getSignalYellow(), RoundedCornerShapeKt.m1018RoundedCornerShape0680j_4(Dp.m6973constructorimpl(9))), Dp.m6973constructorimpl((float) 1.5d), HuiyuanDesignKt.getInk(), RoundedCornerShapeKt.m1018RoundedCornerShape0680j_4(Dp.m6973constructorimpl(9))), false, HapticCue.SELECTION, r3, 1, null), Dp.m6973constructorimpl(12), Dp.m6973constructorimpl(8)), HuiyuanDesignKt.getInk(), TextUnitKt.getSp(12), null, FontWeight.Companion.getBlack(), null, 0, null, null, 0, 0, false, 0, 0, null, null, $composer2, 200070, 0, 131024);
        ComposerKt.sourceInformationMarkerEnd($composer2);
        ComposerKt.sourceInformationMarkerEnd($composer2);
        $composer2.endNode();
        ComposerKt.sourceInformationMarkerEnd($composer2);
        ComposerKt.sourceInformationMarkerEnd($composer2);
        ComposerKt.sourceInformationMarkerEnd($composer2);
        if (ComposerKt.isTraceInProgress() == false) goto L37;
        ComposerKt.traceEventEnd();
        goto L37
    L31:
        r26 = r7;
        goto L32
    L24:
        $composer2.useNode();
        goto L25
    L12:
        r1 = false;
        goto L14
    L5:
        if ($composer2.changedInstance(r3) == false) goto L7;
        int r12 = 4;
    L8:
        $dirty = $dirty | r12;
        goto L9
    L7:
        r12 = 2;
        goto L8
    }

    private static final long categoryColor(String category) {
        List colors = CollectionsKt.listOf(new Color[]{Color.m4356boximpl(HuiyuanDesignKt.getSignalPink()), Color.m4356boximpl(HuiyuanDesignKt.getSignalPurple()), Color.m4356boximpl(HuiyuanDesignKt.getSignalBlue()), Color.m4356boximpl(HuiyuanDesignKt.getSignalRed()), Color.m4356boximpl(HuiyuanDesignKt.getSignalGreen()), Color.m4356boximpl(HuiyuanDesignKt.getSignalOrange())});
        return ((Color) colors.get(Math.floorMod(category.hashCode(), colors.size()))).m4376unboximpl();
    }
}
