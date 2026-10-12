package com.luchime.huiyuan.ui;

import android.content.Context;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.BorderKt;
import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
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
import androidx.compose.foundation.text.KeyboardActions;
import androidx.compose.foundation.text.KeyboardOptions;
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
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.saveable.RememberSaveableKt;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.input.VisualTransformation;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.TextUnitKt;
import androidx.profileinstaller.ProfileVerifier;
import com.luchime.huiyuan.FavoriteRecord;
import com.luchime.huiyuan.LexiconEntry;
import java.util.ArrayList;
import java.util.Collection;
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
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: compiled from: KnowledgeScreens.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000H\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\"\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u000b\u001ag\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\n2\u0018\u0010\u000b\u001a\u0014\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00010\f2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00010\u000eH\u0001¢\u0006\u0002\u0010\u000f\u001a_\u0010\u0010\u001a\u00020\u00012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00110\u00032\u0006\u0010\u0007\u001a\u00020\b2\u0018\u0010\u000b\u001a\u0014\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00010\f2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00010\u000e2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00010\u0013H\u0001¢\u0006\u0002\u0010\u0014\u001ae\u0010\u0015\u001a\u00020\u00012\u0006\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0017\u001a\u00020\b2\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00010\u00132\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00010\u00132\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00010\u00132\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00010\u0013H\u0003¢\u0006\u0002\u0010\u001b\u001aU\u0010\u001c\u001a\u00020\u00012\u0006\u0010\u0017\u001a\u00020\u00112\u0006\u0010\u0007\u001a\u00020\b2\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00010\u00132\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00010\u00132\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00010\u00132\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00010\u0013H\u0003¢\u0006\u0002\u0010\u001e\u001a/\u0010\u001f\u001a\u00020\u00012\u0006\u0010 \u001a\u00020\u00062\f\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00010\u00132\b\b\u0002\u0010\"\u001a\u00020#H\u0003¢\u0006\u0004\b$\u0010%\u001a\u001b\u0010&\u001a\u00020\u00012\f\u0010'\u001a\b\u0012\u0004\u0012\u00020\u00010\u0013H\u0003¢\u0006\u0002\u0010(\u001a\u0015\u0010)\u001a\u00020#2\u0006\u0010*\u001a\u00020\u0006H\u0002¢\u0006\u0002\u0010+¨\u0006,²\u0006\n\u0010-\u001a\u00020\u0006X\u008a\u008e\u0002²\u0006\n\u0010.\u001a\u00020\u0006X\u008a\u008e\u0002"}, d2 = {"KnowledgeScreen", "", "entries", "", "Lcom/luchime/huiyuan/LexiconEntry;", "askName", "", "isLandscape", "", "favorites", "", "onToggleFavorite", "Lkotlin/Function2;", "onAsk", "Lkotlin/Function1;", "(Ljava/util/List;Ljava/lang/String;ZLjava/util/Set;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "FavoritesScreen", "Lcom/luchime/huiyuan/FavoriteRecord;", "onExplore", "Lkotlin/Function0;", "(Ljava/util/List;ZLkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "KnowledgeCard", "entry", "favorite", "onCopy", "onShare", "onFavorite", "(Lcom/luchime/huiyuan/LexiconEntry;Ljava/lang/String;ZZLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "FavoriteCard", "onRemove", "(Lcom/luchime/huiyuan/FavoriteRecord;ZLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "SmallAction", "text", "onClick", "accent", "Landroidx/compose/ui/graphics/Color;", "SmallAction-FNF3uiM", "(Ljava/lang/String;Lkotlin/jvm/functions/Function0;JLandroidx/compose/runtime/Composer;II)V", "EmptyKnowledgeResult", "onReset", "(Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "categoryColor", "category", "(Ljava/lang/String;)J", "app", "query", "selectedCategory"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class KnowledgeScreensKt {
    static final Unit EmptyKnowledgeResult$lambda$68(Function0 function0, int i, Composer composer, int i2) {
        EmptyKnowledgeResult(function0, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    static final Unit FavoriteCard$lambda$65(FavoriteRecord favoriteRecord, boolean z, Function0 function0, Function0 function1, Function0 function2, Function0 function3, int i, Composer composer, int i2) {
        FavoriteCard(favoriteRecord, z, function0, function1, function2, function3, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    static final Unit FavoritesScreen$lambda$55(List list, boolean z, Function2 function2, Function1 function1, Function0 function0, int i, Composer composer, int i2) {
        FavoritesScreen(list, z, function2, function1, function0, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    static final Unit KnowledgeCard$lambda$60(LexiconEntry lexiconEntry, String str, boolean z, boolean z2, Function0 function0, Function0 function1, Function0 function2, Function0 function3, int i, Composer composer, int i2) {
        KnowledgeCard(lexiconEntry, str, z, z2, function0, function1, function2, function3, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    static final Unit KnowledgeScreen$lambda$40(List list, String str, boolean z, Set set, Function2 function2, Function1 function1, int i, Composer composer, int i2) {
        KnowledgeScreen(list, str, z, set, function2, function1, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    static final Unit SmallAction_FNF3uiM$lambda$66(String str, Function0 function0, long j, int i, int i2, Composer composer, int i3) {
        m7416SmallActionFNF3uiM(str, function0, j, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    public static final void KnowledgeScreen(final List<LexiconEntry> entries, final String askName, final boolean isLandscape, final Set<String> favorites, final Function2<? super String, ? super String, Unit> onToggleFavorite, final Function1<? super String, Unit> onAsk, Composer $composer, final int $changed) {
        Composer $composer2;
        Object arrayList;
        Object objEmptyList;
        Context context;
        boolean z;
        Object obj;
        Object obj2;
        Intrinsics.checkNotNullParameter(entries, "entries");
        Intrinsics.checkNotNullParameter(askName, "askName");
        Intrinsics.checkNotNullParameter(favorites, "favorites");
        Intrinsics.checkNotNullParameter(onToggleFavorite, "onToggleFavorite");
        Intrinsics.checkNotNullParameter(onAsk, "onAsk");
        Composer $composer3 = $composer.startRestartGroup(1299067684);
        ComposerKt.sourceInformation($composer3, "C(KnowledgeScreen)P(1!1,3!1,5)53@2231L7,54@2273L22,54@2256L39,55@2341L24,55@2324L41,56@2394L53,57@2469L69,58@2558L382,75@3227L4905,68@2946L5186:KnowledgeScreens.kt#cyjvf");
        int $dirty = $changed;
        if (($changed & 6) == 0) {
            $dirty |= $composer3.changedInstance(entries) ? 4 : 2;
        }
        if (($changed & 48) == 0) {
            $dirty |= $composer3.changed(askName) ? 32 : 16;
        }
        if (($changed & 384) == 0) {
            $dirty |= $composer3.changed(isLandscape) ? 256 : 128;
        }
        if (($changed & 3072) == 0) {
            $dirty |= $composer3.changedInstance(favorites) ? 2048 : 1024;
        }
        if (($changed & 24576) == 0) {
            $dirty |= $composer3.changedInstance(onToggleFavorite) ? 16384 : 8192;
        }
        if ((196608 & $changed) == 0) {
            $dirty |= $composer3.changedInstance(onAsk) ? 131072 : 65536;
        }
        if ($composer3.shouldExecute((74899 & $dirty) != 74898, $dirty & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1299067684, $dirty, -1, "com.luchime.huiyuan.ui.KnowledgeScreen (KnowledgeScreens.kt:52)");
            }
            ProvidableCompositionLocal<Context> localContext = AndroidCompositionLocals_androidKt.getLocalContext();
            ComposerKt.sourceInformationMarkerStart($composer3, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
            Object objConsume = $composer3.consume(localContext);
            ComposerKt.sourceInformationMarkerEnd($composer3);
            Context context2 = (Context) objConsume;
            Object[] objArr = new Object[0];
            ComposerKt.sourceInformationMarkerStart($composer3, -1431429094, "CC(remember):KnowledgeScreens.kt#9igjgp");
            Object objRememberedValue = $composer3.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                Object obj3 = new Function0() { // from class: com.luchime.huiyuan.ui.KnowledgeScreensKt$$ExternalSyntheticLambda20
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return SnapshotStateKt__SnapshotStateKt.mutableStateOf$default("", null, 2, null);
                    }
                };
                $composer3.updateRememberedValue(obj3);
                objRememberedValue = obj3;
            }
            ComposerKt.sourceInformationMarkerEnd($composer3);
            final MutableState query$delegate = (MutableState) RememberSaveableKt.m3923rememberSaveable(objArr, (Saver) null, (String) null, (Function0) objRememberedValue, $composer3, 0, 6);
            Object[] objArr2 = new Object[0];
            ComposerKt.sourceInformationMarkerStart($composer3, -1431426916, "CC(remember):KnowledgeScreens.kt#9igjgp");
            Object objRememberedValue2 = $composer3.rememberedValue();
            if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                Object obj4 = new Function0() { // from class: com.luchime.huiyuan.ui.KnowledgeScreensKt$$ExternalSyntheticLambda21
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return SnapshotStateKt__SnapshotStateKt.mutableStateOf$default("全部", null, 2, null);
                    }
                };
                $composer3.updateRememberedValue(obj4);
                objRememberedValue2 = obj4;
            }
            ComposerKt.sourceInformationMarkerEnd($composer3);
            final MutableState selectedCategory$delegate = (MutableState) RememberSaveableKt.m3923rememberSaveable(objArr2, (Saver) null, (String) null, (Function0) objRememberedValue2, $composer3, 0, 6);
            ComposerKt.sourceInformationMarkerStart($composer3, -1431425191, "CC(remember):KnowledgeScreens.kt#9igjgp");
            boolean zChanged = $composer3.changed(entries);
            int i = 0;
            Object objRememberedValue3 = $composer3.rememberedValue();
            if (zChanged || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                boolean z2 = false;
                Map linkedHashMap = new LinkedHashMap();
                for (Object obj5 : entries) {
                    boolean z3 = z2;
                    String category = ((LexiconEntry) obj5).getCategory();
                    int i2 = i;
                    Object obj6 = linkedHashMap.get(category);
                    if (obj6 == null) {
                        arrayList = new ArrayList();
                        linkedHashMap.put(category, arrayList);
                    } else {
                        arrayList = obj6;
                    }
                    ((List) arrayList).add(obj5);
                    z2 = z3;
                    i = i2;
                }
                $composer3.updateRememberedValue(linkedHashMap);
                objRememberedValue3 = linkedHashMap;
            }
            final Map entriesByCategory = (Map) objRememberedValue3;
            ComposerKt.sourceInformationMarkerEnd($composer3);
            ComposerKt.sourceInformationMarkerStart($composer3, -1431422775, "CC(remember):KnowledgeScreens.kt#9igjgp");
            boolean zChanged2 = $composer3.changed(entriesByCategory);
            Object objRememberedValue4 = $composer3.rememberedValue();
            if (zChanged2 || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                Object objPlus = CollectionsKt.plus((Collection) CollectionsKt.listOf("全部"), (Iterable) entriesByCategory.keySet());
                $composer3.updateRememberedValue(objPlus);
                objRememberedValue4 = objPlus;
            }
            final List categories = (List) objRememberedValue4;
            ComposerKt.sourceInformationMarkerEnd($composer3);
            String strKnowledgeScreen$lambda$2 = KnowledgeScreen$lambda$2(query$delegate);
            String strKnowledgeScreen$lambda$6 = KnowledgeScreen$lambda$6(selectedCategory$delegate);
            ComposerKt.sourceInformationMarkerStart($composer3, -1431419614, "CC(remember):KnowledgeScreens.kt#9igjgp");
            boolean zChanged3 = $composer3.changed(strKnowledgeScreen$lambda$2) | $composer3.changed(entries) | $composer3.changed(entriesByCategory) | $composer3.changed(strKnowledgeScreen$lambda$6);
            int i3 = 0;
            Object objRememberedValue5 = $composer3.rememberedValue();
            if (zChanged3 || objRememberedValue5 == Composer.INSTANCE.getEmpty()) {
                Object lowerCase = StringsKt.trim((CharSequence) KnowledgeScreen$lambda$2(query$delegate)).toString().toLowerCase(Locale.ROOT);
                Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
                if (Intrinsics.areEqual(KnowledgeScreen$lambda$6(selectedCategory$delegate), "全部")) {
                    objEmptyList = entries;
                } else {
                    objEmptyList = (List) entriesByCategory.get(KnowledgeScreen$lambda$6(selectedCategory$delegate));
                    if (objEmptyList == null) {
                        objEmptyList = CollectionsKt.emptyList();
                    }
                }
                if (((CharSequence) lowerCase).length() == 0) {
                    context = context2;
                    obj = objEmptyList;
                    z = false;
                } else {
                    Iterable iterable = (Iterable) objEmptyList;
                    Collection arrayList2 = new ArrayList();
                    for (Object obj7 : iterable) {
                        Object obj8 = lowerCase;
                        Iterable iterable2 = iterable;
                        Context context3 = context2;
                        int i4 = i3;
                        if (StringsKt.contains$default((CharSequence) ((LexiconEntry) obj7).getSearchIndex(), (CharSequence) obj8, false, 2, (Object) null)) {
                            arrayList2.add(obj7);
                        }
                        context2 = context3;
                        lowerCase = obj8;
                        i3 = i4;
                        iterable = iterable2;
                    }
                    context = context2;
                    z = false;
                    obj = (List) arrayList2;
                }
                $composer3.updateRememberedValue(obj);
                objRememberedValue5 = obj;
            } else {
                context = context2;
                z = false;
            }
            final List filtered = (List) objRememberedValue5;
            ComposerKt.sourceInformationMarkerEnd($composer3);
            Modifier modifierStatusBarsPadding = WindowInsetsPadding_androidKt.statusBarsPadding(BackgroundKt.m234backgroundbw27NRU$default(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), HuiyuanDesignKt.getPaper(), null, 2, null));
            PaddingValues paddingValuesM722PaddingValuesa9UjIt4$default = PaddingKt.m722PaddingValuesa9UjIt4$default(0.0f, 0.0f, 0.0f, isLandscape ? Dp.m6973constructorimpl(12) : Dp.m6973constructorimpl(24), 7, null);
            Alignment.Horizontal centerHorizontally = Alignment.INSTANCE.getCenterHorizontally();
            ComposerKt.sourceInformationMarkerStart($composer3, -1431393683, "CC(remember):KnowledgeScreens.kt#9igjgp");
            final Context context4 = context;
            boolean zChangedInstance = (($dirty & 896) == 256 ? true : z) | $composer3.changedInstance(entries) | $composer3.changed(query$delegate) | $composer3.changedInstance(categories) | $composer3.changed(selectedCategory$delegate) | $composer3.changedInstance(entriesByCategory) | $composer3.changedInstance(filtered) | $composer3.changedInstance(favorites) | (($dirty & 112) == 32 ? true : z) | $composer3.changedInstance(context4) | ((57344 & $dirty) == 16384 ? true : z) | ((458752 & $dirty) != 131072 ? z : true);
            Object objRememberedValue6 = $composer3.rememberedValue();
            if (zChangedInstance || objRememberedValue6 == Composer.INSTANCE.getEmpty()) {
                obj2 = new Function1() { // from class: com.luchime.huiyuan.ui.KnowledgeScreensKt$$ExternalSyntheticLambda22
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj9) {
                        return KnowledgeScreensKt.KnowledgeScreen$lambda$39$lambda$38(filtered, isLandscape, entries, query$delegate, categories, entriesByCategory, selectedCategory$delegate, favorites, askName, context4, onToggleFavorite, onAsk, (LazyListScope) obj9);
                    }
                };
                $composer3.updateRememberedValue(obj2);
            } else {
                obj2 = objRememberedValue6;
            }
            ComposerKt.sourceInformationMarkerEnd($composer3);
            LazyDslKt.LazyColumn(modifierStatusBarsPadding, null, paddingValuesM722PaddingValuesa9UjIt4$default, false, null, centerHorizontally, null, false, null, (Function1) obj2, $composer3, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 474);
            $composer2 = $composer3;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $composer2 = $composer3;
            $composer2.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = $composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.luchime.huiyuan.ui.KnowledgeScreensKt$$ExternalSyntheticLambda23
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj9, Object obj10) {
                    return KnowledgeScreensKt.KnowledgeScreen$lambda$40(entries, askName, isLandscape, favorites, onToggleFavorite, onAsk, $changed, (Composer) obj9, ((Integer) obj10).intValue());
                }
            });
        }
    }

    private static final String KnowledgeScreen$lambda$2(MutableState<String> mutableState) {
        return mutableState.getValue();
    }

    private static final String KnowledgeScreen$lambda$6(MutableState<String> mutableState) {
        return mutableState.getValue();
    }

    static final Unit KnowledgeScreen$lambda$39$lambda$38(final List $filtered, final boolean $isLandscape, final List $entries, final MutableState $query$delegate, final List $categories, final Map $entriesByCategory, final MutableState $selectedCategory$delegate, final Set $favorites, final String $askName, final Context $context, final Function2 $onToggleFavorite, final Function1 $onAsk, LazyListScope LazyColumn) {
        Intrinsics.checkNotNullParameter(LazyColumn, "$this$LazyColumn");
        LazyListScope.item$default(LazyColumn, null, null, ComposableLambdaKt.composableLambdaInstance(1503205679, true, new Function3() { // from class: com.luchime.huiyuan.ui.KnowledgeScreensKt$$ExternalSyntheticLambda6
            @Override // kotlin.jvm.functions.Function3
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                return KnowledgeScreensKt.KnowledgeScreen$lambda$39$lambda$38$lambda$15($isLandscape, $entries, (LazyItemScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
            }
        }), 3, null);
        LazyListScope.item$default(LazyColumn, null, null, ComposableLambdaKt.composableLambdaInstance(123353240, true, new Function3() { // from class: com.luchime.huiyuan.ui.KnowledgeScreensKt$$ExternalSyntheticLambda7
            @Override // kotlin.jvm.functions.Function3
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                return KnowledgeScreensKt.KnowledgeScreen$lambda$39$lambda$38$lambda$21($query$delegate, $isLandscape, (LazyItemScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
            }
        }), 3, null);
        LazyListScope.item$default(LazyColumn, null, null, ComposableLambdaKt.composableLambdaInstance(359523063, true, new Function3() { // from class: com.luchime.huiyuan.ui.KnowledgeScreensKt$$ExternalSyntheticLambda8
            @Override // kotlin.jvm.functions.Function3
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                return KnowledgeScreensKt.KnowledgeScreen$lambda$39$lambda$38$lambda$26($categories, $entries, $entriesByCategory, $selectedCategory$delegate, (LazyItemScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
            }
        }), 3, null);
        LazyListScope.item$default(LazyColumn, null, null, ComposableLambdaKt.composableLambdaInstance(595692886, true, new Function3() { // from class: com.luchime.huiyuan.ui.KnowledgeScreensKt$$ExternalSyntheticLambda9
            @Override // kotlin.jvm.functions.Function3
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                return KnowledgeScreensKt.KnowledgeScreen$lambda$39$lambda$38$lambda$28($filtered, $favorites, (LazyItemScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
            }
        }), 3, null);
        if ($filtered.isEmpty()) {
            LazyListScope.item$default(LazyColumn, null, null, ComposableLambdaKt.composableLambdaInstance(-331824140, true, new Function3() { // from class: com.luchime.huiyuan.ui.KnowledgeScreensKt$$ExternalSyntheticLambda10
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    return KnowledgeScreensKt.KnowledgeScreen$lambda$39$lambda$38$lambda$31($query$delegate, $selectedCategory$delegate, (LazyItemScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
                }
            }), 3, null);
        } else {
            final Function1 function1 = new Function1() { // from class: com.luchime.huiyuan.ui.KnowledgeScreensKt$$ExternalSyntheticLambda11
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return KnowledgeScreensKt.KnowledgeScreen$lambda$39$lambda$38$lambda$32((LexiconEntry) obj);
                }
            };
            final Function1 function2 = new Function1() { // from class: com.luchime.huiyuan.ui.KnowledgeScreensKt$KnowledgeScreen$lambda$39$lambda$38$$inlined$items$default$1
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Object invoke(Object p1) {
                    return invoke((LexiconEntry) p1);
                }

                @Override // kotlin.jvm.functions.Function1
                public final Void invoke(LexiconEntry lexiconEntry) {
                    return null;
                }
            };
            LazyColumn.items($filtered.size(), new Function1<Integer, Object>() { // from class: com.luchime.huiyuan.ui.KnowledgeScreensKt$KnowledgeScreen$lambda$39$lambda$38$$inlined$items$default$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                    return invoke(num.intValue());
                }

                public final Object invoke(int index) {
                    return invoke($filtered.get(index));
                }
            }, new Function1<Integer, Object>() { // from class: com.luchime.huiyuan.ui.KnowledgeScreensKt$KnowledgeScreen$lambda$39$lambda$38$$inlined$items$default$3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                    return invoke(num.intValue());
                }

                public final Object invoke(int index) {
                    return invoke($filtered.get(index));
                }
            }, ComposableLambdaKt.composableLambdaInstance(-632812321, true, new Function4<LazyItemScope, Integer, Composer, Integer, Unit>() { // from class: com.luchime.huiyuan.ui.KnowledgeScreensKt$KnowledgeScreen$lambda$39$lambda$38$$inlined$items$default$4
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(4);
                }

                @Override // kotlin.jvm.functions.Function4
                public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Integer num, Composer composer, Integer num2) {
                    invoke(lazyItemScope, num.intValue(), composer, num2.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(LazyItemScope $this$items, int it, Composer $composer, int $changed) {
                    ComposerKt.sourceInformation($composer, "C178@8826L22:LazyDsl.kt#428nma");
                    int $dirty = $changed;
                    if (($changed & 6) == 0) {
                        $dirty |= $composer.changed($this$items) ? 4 : 2;
                    }
                    if (($changed & 48) == 0) {
                        $dirty |= $composer.changed(it) ? 32 : 16;
                    }
                    if (!$composer.shouldExecute(($dirty & 147) != 146, $dirty & 1)) {
                        $composer.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-632812321, $dirty, -1, "androidx.compose.foundation.lazy.items.<anonymous> (LazyDsl.kt:178)");
                    }
                    int i = $dirty & 14;
                    final LexiconEntry lexiconEntry = (LexiconEntry) $filtered.get(it);
                    $composer.startReplaceGroup(1356125925);
                    ComposerKt.sourceInformation($composer, "C*186@7812L33,187@7877L57,188@7969L48,189@8047L37,181@7591L511:KnowledgeScreens.kt#cyjvf");
                    boolean zContains = $favorites.contains(lexiconEntry.getText());
                    String str = $askName;
                    boolean z = $isLandscape;
                    ComposerKt.sourceInformationMarkerStart($composer, 597941920, "CC(remember):KnowledgeScreens.kt#9igjgp");
                    boolean zChangedInstance = $composer.changedInstance($context) | $composer.changedInstance(lexiconEntry);
                    Object objRememberedValue = $composer.rememberedValue();
                    if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        final Context context = $context;
                        objRememberedValue = (Function0) new Function0<Unit>() { // from class: com.luchime.huiyuan.ui.KnowledgeScreensKt$KnowledgeScreen$1$1$7$1$1
                            @Override // kotlin.jvm.functions.Function0
                            public /* bridge */ /* synthetic */ Unit invoke() {
                                invoke2();
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2() {
                                HuiyuanDesignKt.copyText(context, lexiconEntry.getText());
                            }
                        };
                        $composer.updateRememberedValue(objRememberedValue);
                    }
                    Function0 function0 = (Function0) objRememberedValue;
                    ComposerKt.sourceInformationMarkerEnd($composer);
                    ComposerKt.sourceInformationMarkerStart($composer, 597944024, "CC(remember):KnowledgeScreens.kt#9igjgp");
                    boolean zChangedInstance2 = $composer.changedInstance($context) | $composer.changedInstance(lexiconEntry);
                    Object objRememberedValue2 = $composer.rememberedValue();
                    if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                        final Context context2 = $context;
                        Object obj = (Function0) new Function0<Unit>() { // from class: com.luchime.huiyuan.ui.KnowledgeScreensKt$KnowledgeScreen$1$1$7$2$1
                            @Override // kotlin.jvm.functions.Function0
                            public /* bridge */ /* synthetic */ Unit invoke() {
                                invoke2();
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2() {
                                HuiyuanDesignKt.shareText(context2, lexiconEntry.getCategory() + "语录", lexiconEntry.getText());
                            }
                        };
                        $composer.updateRememberedValue(obj);
                        objRememberedValue2 = obj;
                    }
                    Function0 function3 = (Function0) objRememberedValue2;
                    ComposerKt.sourceInformationMarkerEnd($composer);
                    ComposerKt.sourceInformationMarkerStart($composer, 597946959, "CC(remember):KnowledgeScreens.kt#9igjgp");
                    boolean zChanged = $composer.changed($onToggleFavorite) | $composer.changedInstance(lexiconEntry);
                    Object objRememberedValue3 = $composer.rememberedValue();
                    if (zChanged || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                        final Function2 function4 = $onToggleFavorite;
                        Object obj2 = (Function0) new Function0<Unit>() { // from class: com.luchime.huiyuan.ui.KnowledgeScreensKt$KnowledgeScreen$1$1$7$3$1
                            @Override // kotlin.jvm.functions.Function0
                            public /* bridge */ /* synthetic */ Unit invoke() {
                                invoke2();
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2() {
                                invoke(lexiconEntry.getText(), lexiconEntry.getCategory());
                            }
                        };
                        $composer.updateRememberedValue(obj2);
                        objRememberedValue3 = obj2;
                    }
                    Function0 function5 = (Function0) objRememberedValue3;
                    ComposerKt.sourceInformationMarkerEnd($composer);
                    ComposerKt.sourceInformationMarkerStart($composer, 597949444, "CC(remember):KnowledgeScreens.kt#9igjgp");
                    boolean zChanged2 = $composer.changed($onAsk) | $composer.changedInstance(lexiconEntry);
                    Object objRememberedValue4 = $composer.rememberedValue();
                    if (zChanged2 || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                        final Function1 function6 = $onAsk;
                        Object obj3 = (Function0) new Function0<Unit>() { // from class: com.luchime.huiyuan.ui.KnowledgeScreensKt$KnowledgeScreen$1$1$7$4$1
                            @Override // kotlin.jvm.functions.Function0
                            public /* bridge */ /* synthetic */ Unit invoke() {
                                invoke2();
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2() {
                                invoke("请结合现实解释这句话：" + lexiconEntry.getText());
                            }
                        };
                        $composer.updateRememberedValue(obj3);
                        objRememberedValue4 = obj3;
                    }
                    ComposerKt.sourceInformationMarkerEnd($composer);
                    KnowledgeScreensKt.KnowledgeCard(lexiconEntry, str, z, zContains, function0, function3, function5, (Function0) objRememberedValue4, $composer, (i >> 3) & 14);
                    $composer.endReplaceGroup();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }));
        }
        return Unit.INSTANCE;
    }

    static final Unit KnowledgeScreen$lambda$39$lambda$38$lambda$15(boolean $isLandscape, final List $entries, LazyItemScope item, Composer $composer, int $changed) {
        Intrinsics.checkNotNullParameter(item, "$this$item");
        ComposerKt.sourceInformation($composer, "C83@3511L444,77@3256L713:KnowledgeScreens.kt#cyjvf");
        if (!$composer.shouldExecute(($changed & 17) != 16, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1503205679, $changed, -1, "com.luchime.huiyuan.ui.KnowledgeScreen.<anonymous>.<anonymous>.<anonymous> (KnowledgeScreens.kt:77)");
            }
            HuiyuanDesignKt.m7415ScreenHeaderfWhpE4E("KNOWLEDGE LIBRARY", "高认知语录库", "搜索关键词、按维度浏览，并把有共鸣的内容收进收藏。", HuiyuanDesignKt.getSignalGreen(), $isLandscape, ComposableLambdaKt.rememberComposableLambda(110463588, true, new Function2() { // from class: com.luchime.huiyuan.ui.KnowledgeScreensKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return KnowledgeScreensKt.KnowledgeScreen$lambda$39$lambda$38$lambda$15$lambda$14($entries, (Composer) obj, ((Integer) obj2).intValue());
                }
            }, $composer, 54), $composer, 200118, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    static final Unit KnowledgeScreen$lambda$39$lambda$38$lambda$15$lambda$14(List $entries, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C84@3533L404:KnowledgeScreens.kt#cyjvf");
        if (!$composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(110463588, $changed, -1, "com.luchime.huiyuan.ui.KnowledgeScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous> (KnowledgeScreens.kt:84)");
            }
            Modifier modifierM726paddingVpY3zN4 = PaddingKt.m726paddingVpY3zN4(BackgroundKt.m233backgroundbw27NRU(Modifier.INSTANCE, HuiyuanDesignKt.getInk(), RoundedCornerShapeKt.m1018RoundedCornerShape0680j_4(Dp.m6973constructorimpl(12))), Dp.m6973constructorimpl(13), Dp.m6973constructorimpl(9));
            Alignment center = Alignment.INSTANCE.getCenter();
            ComposerKt.sourceInformationMarkerStart($composer, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(center, false);
            ComposerKt.sourceInformationMarkerStart($composer, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash($composer, 0);
            CompositionLocalMap currentCompositionLocalMap = $composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier($composer, modifierM726paddingVpY3zN4);
            Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
            int i = ((((48 << 3) & 112) << 6) & 896) | 6;
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
            Updater.m3815setimpl(composerM3808constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m3815setimpl(composerM3808constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (composerM3808constructorimpl.getInserting() || !Intrinsics.areEqual(composerM3808constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM3808constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM3808constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m3815setimpl(composerM3808constructorimpl, modifierMaterializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
            int i2 = (i >> 6) & 14;
            ComposerKt.sourceInformationMarkerStart($composer, -2146730711, "C72@3468L9:Box.kt#2w3rfo");
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            int i3 = ((48 >> 6) & 112) | 6;
            ComposerKt.sourceInformationMarkerStart($composer, -778793001, "C90@3837L78:KnowledgeScreens.kt#cyjvf");
            TextKt.m2820Text4IGK_g($entries.size() + "\n条", (Modifier) null, Color.INSTANCE.m4403getWhite0d7_KjU(), 0L, (FontStyle) null, FontWeight.INSTANCE.getBlack(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, $composer, 196992, 0, 131034);
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

    static final Unit KnowledgeScreen$lambda$39$lambda$38$lambda$21(final MutableState $query$delegate, boolean $isLandscape, LazyItemScope item, Composer $composer, int $changed) {
        Intrinsics.checkNotNullParameter(item, "$this$item");
        ComposerKt.sourceInformation($composer, "C99@4090L23,108@4563L394,120@5088L279,97@4008L1373:KnowledgeScreens.kt#cyjvf");
        if (!$composer.shouldExecute(($changed & 17) != 16, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(123353240, $changed, -1, "com.luchime.huiyuan.ui.KnowledgeScreen.<anonymous>.<anonymous>.<anonymous> (KnowledgeScreens.kt:97)");
            }
            String strKnowledgeScreen$lambda$2 = KnowledgeScreen$lambda$2($query$delegate);
            ComposerKt.sourceInformationMarkerStart($composer, -1716617553, "CC(remember):KnowledgeScreens.kt#9igjgp");
            boolean zChanged = $composer.changed($query$delegate);
            Object objRememberedValue = $composer.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                Object obj = new Function1() { // from class: com.luchime.huiyuan.ui.KnowledgeScreensKt$$ExternalSyntheticLambda12
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return KnowledgeScreensKt.KnowledgeScreen$lambda$39$lambda$38$lambda$21$lambda$17$lambda$16($query$delegate, (String) obj2);
                    }
                };
                $composer.updateRememberedValue(obj);
                objRememberedValue = obj;
            }
            Function1 function1 = (Function1) objRememberedValue;
            ComposerKt.sourceInformationMarkerEnd($composer);
            OutlinedTextFieldKt.OutlinedTextField(strKnowledgeScreen$lambda$2, (Function1<? super String, Unit>) function1, PaddingKt.m726paddingVpY3zN4(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), $isLandscape ? Dp.m6973constructorimpl(24) : Dp.m6973constructorimpl(16), $isLandscape ? Dp.m6973constructorimpl(8) : Dp.m6973constructorimpl(14)), false, false, (TextStyle) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) ComposableSingletons$KnowledgeScreensKt.INSTANCE.getLambda$1087424319$app(), (Function2<? super Composer, ? super Integer, Unit>) ComposableSingletons$KnowledgeScreensKt.INSTANCE.getLambda$693020480$app(), (Function2<? super Composer, ? super Integer, Unit>) ComposableLambdaKt.rememberComposableLambda(298616641, true, new Function2() { // from class: com.luchime.huiyuan.ui.KnowledgeScreensKt$$ExternalSyntheticLambda13
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    return KnowledgeScreensKt.KnowledgeScreen$lambda$39$lambda$38$lambda$21$lambda$20($query$delegate, (Composer) obj2, ((Integer) obj3).intValue());
                }
            }, $composer, 54), (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, false, (VisualTransformation) null, (KeyboardOptions) null, (KeyboardActions) null, true, 0, 0, (MutableInteractionSource) null, (Shape) RoundedCornerShapeKt.m1018RoundedCornerShape0680j_4(Dp.m6973constructorimpl(13)), TextFieldDefaults.INSTANCE.m2801colors0hiis_0(0L, 0L, 0L, 0L, Color.INSTANCE.m4403getWhite0d7_KjU(), Color.INSTANCE.m4403getWhite0d7_KjU(), 0L, 0L, HuiyuanDesignKt.getInk(), 0L, null, HuiyuanDesignKt.getInk(), HuiyuanDesignKt.getInk(), 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, $composer, 100884480, 432, 0, 0, 3072, 2147477199, 4095), $composer, 918552576, 12582912, 0, 1965176);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    static final Unit KnowledgeScreen$lambda$39$lambda$38$lambda$21$lambda$17$lambda$16(MutableState $query$delegate, String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        $query$delegate.setValue(StringsKt.take(it, 40));
        return Unit.INSTANCE;
    }

    static final Unit KnowledgeScreen$lambda$39$lambda$38$lambda$21$lambda$20(final MutableState $query$delegate, Composer $composer, int $changed) {
        Composer composer = $composer;
        ComposerKt.sourceInformation(composer, "C:KnowledgeScreens.kt#cyjvf");
        if (composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(298616641, $changed, -1, "com.luchime.huiyuan.ui.KnowledgeScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous> (KnowledgeScreens.kt:109)");
            }
            if (KnowledgeScreen$lambda$2($query$delegate).length() > 0) {
                composer.startReplaceGroup(1211137879);
                ComposerKt.sourceInformation(composer, "114@4877L14,110@4635L282");
                long sp = TextUnitKt.getSp(22);
                FontWeight black = FontWeight.INSTANCE.getBlack();
                Modifier.Companion companion = Modifier.INSTANCE;
                HapticCue hapticCue = HapticCue.SELECTION;
                ComposerKt.sourceInformationMarkerStart(composer, -792206769, "CC(remember):KnowledgeScreens.kt#9igjgp");
                boolean zChanged = composer.changed($query$delegate);
                Object objRememberedValue = $composer.rememberedValue();
                if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    Object obj = new Function0() { // from class: com.luchime.huiyuan.ui.KnowledgeScreensKt$$ExternalSyntheticLambda28
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return KnowledgeScreensKt.KnowledgeScreen$lambda$39$lambda$38$lambda$21$lambda$20$lambda$19$lambda$18($query$delegate);
                        }
                    };
                    $composer.updateRememberedValue(obj);
                    objRememberedValue = obj;
                }
                ComposerKt.sourceInformationMarkerEnd(composer);
                TextKt.m2820Text4IGK_g("×", AppHapticsKt.hapticClickable$default(companion, false, hapticCue, (Function0) objRememberedValue, 1, null), 0L, sp, (FontStyle) null, black, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, $composer, 199686, 0, 131028);
                composer = $composer;
            } else {
                composer.startReplaceGroup(1206554529);
            }
            composer.endReplaceGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    static final Unit KnowledgeScreen$lambda$39$lambda$38$lambda$21$lambda$20$lambda$19$lambda$18(MutableState $query$delegate) {
        $query$delegate.setValue("");
        return Unit.INSTANCE;
    }

    static final Unit KnowledgeScreen$lambda$39$lambda$38$lambda$26(List $categories, List $entries, Map $entriesByCategory, final MutableState $selectedCategory$delegate, LazyItemScope item, Composer $composer, int $changed) {
        Function0<ComposeUiNode> function0;
        int size;
        Intrinsics.checkNotNullParameter(item, "$this$item");
        ComposerKt.sourceInformation($composer, "C134@5535L21,131@5420L1468:KnowledgeScreens.kt#cyjvf");
        if ($composer.shouldExecute(($changed & 17) != 16, $changed & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(359523063, $changed, -1, "com.luchime.huiyuan.ui.KnowledgeScreen.<anonymous>.<anonymous>.<anonymous> (KnowledgeScreens.kt:131)");
            }
            Modifier modifierM726paddingVpY3zN4 = PaddingKt.m726paddingVpY3zN4(ScrollKt.horizontalScroll$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), ScrollKt.rememberScrollState(0, $composer, 0, 1), false, null, false, 14, null), Dp.m6973constructorimpl(16), Dp.m6973constructorimpl(2));
            Arrangement.Horizontal horizontalM606spacedBy0680j_4 = Arrangement.INSTANCE.m606spacedBy0680j_4(Dp.m6973constructorimpl(8));
            int i = 48;
            Composer composer = $composer;
            ComposerKt.sourceInformationMarkerStart(composer, 693286680, "CC(Row)P(2,1,3)99@5124L58,100@5187L130:Row.kt#2w3rfo");
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(horizontalM606spacedBy0680j_4, Alignment.INSTANCE.getTop(), composer, ((48 >> 3) & 14) | ((48 >> 3) & 112));
            ComposerKt.sourceInformationMarkerStart(composer, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer, modifierM726paddingVpY3zN4);
            Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
            int i2 = ((((48 << 3) & 112) << 6) & 896) | 6;
            ComposerKt.sourceInformationMarkerStart(composer, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
            if (!(composer.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composer.startReusableNode();
            if (composer.getInserting()) {
                function0 = constructor;
                composer.createNode(function0);
            } else {
                function0 = constructor;
                composer.useNode();
            }
            Composer composerM3808constructorimpl = Updater.m3808constructorimpl(composer);
            Updater.m3815setimpl(composerM3808constructorimpl, measurePolicyRowMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m3815setimpl(composerM3808constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (composerM3808constructorimpl.getInserting() || !Intrinsics.areEqual(composerM3808constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM3808constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM3808constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m3815setimpl(composerM3808constructorimpl, modifierMaterializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
            int i3 = (i2 >> 6) & 14;
            int i4 = 0;
            ComposerKt.sourceInformationMarkerStart(composer, -407735110, "C101@5232L9:Row.kt#2w3rfo");
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            int i5 = ((48 >> 6) & 112) | 6;
            ComposerKt.sourceInformationMarkerStart(composer, 557575698, "C:KnowledgeScreens.kt#cyjvf");
            composer.startReplaceGroup(295081318);
            ComposerKt.sourceInformation(composer, "*156@6669L91,145@6054L802");
            List<String> list = $categories;
            int i6 = 0;
            for (final String str : list) {
                Iterable iterable = list;
                int i7 = i6;
                boolean zAreEqual = Intrinsics.areEqual(str, KnowledgeScreen$lambda$6($selectedCategory$delegate));
                if (Intrinsics.areEqual(str, "全部")) {
                    size = $entries.size();
                } else {
                    List list2 = (List) $entriesByCategory.get(str);
                    size = list2 != null ? list2.size() : 0;
                }
                int i8 = i4;
                String str2 = str + " " + size;
                long jM4403getWhite0d7_KjU = zAreEqual ? Color.INSTANCE.m4403getWhite0d7_KjU() : HuiyuanDesignKt.getInk();
                long sp = TextUnitKt.getSp(11);
                FontWeight black = FontWeight.INSTANCE.getBlack();
                int i9 = i5;
                int i10 = i;
                CompositionLocalMap compositionLocalMap = currentCompositionLocalMap;
                Composer composer2 = composer;
                Modifier modifierM245borderxT4_qwU = BorderKt.m245borderxT4_qwU(BackgroundKt.m233backgroundbw27NRU(Modifier.INSTANCE, zAreEqual ? HuiyuanDesignKt.getInk() : Color.INSTANCE.m4403getWhite0d7_KjU(), RoundedCornerShapeKt.m1018RoundedCornerShape0680j_4(Dp.m6973constructorimpl(10))), Dp.m6973constructorimpl((float) 1.5d), HuiyuanDesignKt.getInk(), RoundedCornerShapeKt.m1018RoundedCornerShape0680j_4(Dp.m6973constructorimpl(10)));
                HapticCue hapticCue = HapticCue.SELECTION;
                ComposerKt.sourceInformationMarkerStart(composer, -152160482, "CC(remember):KnowledgeScreens.kt#9igjgp");
                boolean zChanged = composer.changed($selectedCategory$delegate) | composer.changed(str);
                Object objRememberedValue = composer.rememberedValue();
                if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    Object obj = new Function0() { // from class: com.luchime.huiyuan.ui.KnowledgeScreensKt$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return KnowledgeScreensKt.KnowledgeScreen$lambda$39$lambda$38$lambda$26$lambda$25$lambda$24$lambda$23$lambda$22(str, $selectedCategory$delegate);
                        }
                    };
                    composer.updateRememberedValue(obj);
                    objRememberedValue = obj;
                }
                ComposerKt.sourceInformationMarkerEnd(composer);
                TextKt.m2820Text4IGK_g(str2, PaddingKt.m726paddingVpY3zN4(AppHapticsKt.hapticClickable$default(modifierM245borderxT4_qwU, false, hapticCue, (Function0) objRememberedValue, 1, null), Dp.m6973constructorimpl(11), Dp.m6973constructorimpl(8)), jM4403getWhite0d7_KjU, sp, (FontStyle) null, black, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer, 199680, 0, 131024);
                list = iterable;
                i6 = i7;
                i5 = i9;
                i4 = i8;
                i = i10;
                currentCompositionLocalMap = compositionLocalMap;
                composer = composer2;
            }
            Composer composer3 = composer;
            composer.endReplaceGroup();
            ComposerKt.sourceInformationMarkerEnd(composer);
            ComposerKt.sourceInformationMarkerEnd(composer);
            composer3.endNode();
            ComposerKt.sourceInformationMarkerEnd(composer3);
            ComposerKt.sourceInformationMarkerEnd(composer3);
            ComposerKt.sourceInformationMarkerEnd(composer3);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    static final Unit KnowledgeScreen$lambda$39$lambda$38$lambda$26$lambda$25$lambda$24$lambda$23$lambda$22(String $category, MutableState $selectedCategory$delegate) {
        $selectedCategory$delegate.setValue($category);
        return Unit.INSTANCE;
    }

    static final Unit KnowledgeScreen$lambda$39$lambda$38$lambda$28(List $filtered, Set $favorites, LazyItemScope item, Composer $composer, int $changed) {
        Function0<ComposeUiNode> function0;
        Intrinsics.checkNotNullParameter(item, "$this$item");
        ComposerKt.sourceInformation($composer, "C166@6927L414:KnowledgeScreens.kt#cyjvf");
        if (!$composer.shouldExecute(($changed & 17) != 16, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(595692886, $changed, -1, "com.luchime.huiyuan.ui.KnowledgeScreen.<anonymous>.<anonymous>.<anonymous> (KnowledgeScreens.kt:166)");
            }
            Modifier modifierM726paddingVpY3zN4 = PaddingKt.m726paddingVpY3zN4(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), Dp.m6973constructorimpl(17), Dp.m6973constructorimpl(12));
            Arrangement.Horizontal spaceBetween = Arrangement.INSTANCE.getSpaceBetween();
            ComposerKt.sourceInformationMarkerStart($composer, 693286680, "CC(Row)P(2,1,3)99@5124L58,100@5187L130:Row.kt#2w3rfo");
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(spaceBetween, Alignment.INSTANCE.getTop(), $composer, ((54 >> 3) & 14) | ((54 >> 3) & 112));
            ComposerKt.sourceInformationMarkerStart($composer, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash($composer, 0);
            CompositionLocalMap currentCompositionLocalMap = $composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier($composer, modifierM726paddingVpY3zN4);
            Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
            int i = ((((54 << 3) & 112) << 6) & 896) | 6;
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
            Updater.m3815setimpl(composerM3808constructorimpl, measurePolicyRowMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m3815setimpl(composerM3808constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (composerM3808constructorimpl.getInserting() || !Intrinsics.areEqual(composerM3808constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM3808constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM3808constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m3815setimpl(composerM3808constructorimpl, modifierMaterializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
            int i2 = (i >> 6) & 14;
            ComposerKt.sourceInformationMarkerStart($composer, -407735110, "C101@5232L9:Row.kt#2w3rfo");
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            int i3 = ((54 >> 6) & 112) | 6;
            ComposerKt.sourceInformationMarkerStart($composer, 1136311091, "C172@7169L73,173@7259L68:KnowledgeScreens.kt#cyjvf");
            TextKt.m2820Text4IGK_g("找到 " + $filtered.size() + " 条", (Modifier) null, HuiyuanDesignKt.getInk(), 0L, (FontStyle) null, FontWeight.INSTANCE.getBlack(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, $composer, 196992, 0, 131034);
            TextKt.m2820Text4IGK_g("已收藏 " + $favorites.size() + " 条", (Modifier) null, HuiyuanDesignKt.getMutedText(), TextUnitKt.getSp(12), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, $composer, 3456, 0, 131058);
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

    static final Unit KnowledgeScreen$lambda$39$lambda$38$lambda$31(final MutableState $query$delegate, final MutableState $selectedCategory$delegate, LazyItemScope item, Composer $composer, int $changed) {
        Intrinsics.checkNotNullParameter(item, "$this$item");
        ComposerKt.sourceInformation($composer, "C178@7437L39,178@7406L71:KnowledgeScreens.kt#cyjvf");
        if ($composer.shouldExecute(($changed & 17) != 16, $changed & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-331824140, $changed, -1, "com.luchime.huiyuan.ui.KnowledgeScreen.<anonymous>.<anonymous>.<anonymous> (KnowledgeScreens.kt:178)");
            }
            ComposerKt.sourceInformationMarkerStart($composer, -1055417541, "CC(remember):KnowledgeScreens.kt#9igjgp");
            boolean zChanged = $composer.changed($query$delegate) | $composer.changed($selectedCategory$delegate);
            Object objRememberedValue = $composer.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                Object obj = new Function0() { // from class: com.luchime.huiyuan.ui.KnowledgeScreensKt$$ExternalSyntheticLambda5
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return KnowledgeScreensKt.KnowledgeScreen$lambda$39$lambda$38$lambda$31$lambda$30$lambda$29($query$delegate, $selectedCategory$delegate);
                    }
                };
                $composer.updateRememberedValue(obj);
                objRememberedValue = obj;
            }
            ComposerKt.sourceInformationMarkerEnd($composer);
            EmptyKnowledgeResult((Function0) objRememberedValue, $composer, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    static final Unit KnowledgeScreen$lambda$39$lambda$38$lambda$31$lambda$30$lambda$29(MutableState $query$delegate, MutableState $selectedCategory$delegate) {
        $query$delegate.setValue("");
        $selectedCategory$delegate.setValue("全部");
        return Unit.INSTANCE;
    }

    static final Object KnowledgeScreen$lambda$39$lambda$38$lambda$32(LexiconEntry it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return it.getCategory() + "|" + it.getText();
    }

    /* JADX WARN: Code duplicated, block: B:76:0x01b2  */
    public static final void FavoritesScreen(final List<FavoriteRecord> favorites, final boolean isLandscape, final Function2<? super String, ? super String, Unit> onToggleFavorite, final Function1<? super String, Unit> onAsk, final Function0<Unit> onExplore, Composer $composer, final int $changed) {
        Composer $composer2;
        Context context;
        Intrinsics.checkNotNullParameter(favorites, "favorites");
        Intrinsics.checkNotNullParameter(onToggleFavorite, "onToggleFavorite");
        Intrinsics.checkNotNullParameter(onAsk, "onAsk");
        Intrinsics.checkNotNullParameter(onExplore, "onExplore");
        Composer $composer3 = $composer.startRestartGroup(653538608);
        ComposerKt.sourceInformation($composer3, "C(FavoritesScreen)P(!2,4)204@8379L7,205@8421L7,213@8714L2865,206@8433L3146:KnowledgeScreens.kt#cyjvf");
        int $dirty = $changed;
        if (($changed & 6) == 0) {
            $dirty |= $composer3.changedInstance(favorites) ? 4 : 2;
        }
        if (($changed & 48) == 0) {
            $dirty |= $composer3.changed(isLandscape) ? 32 : 16;
        }
        if (($changed & 384) == 0) {
            $dirty |= $composer3.changedInstance(onToggleFavorite) ? 256 : 128;
        }
        if (($changed & 3072) == 0) {
            $dirty |= $composer3.changedInstance(onAsk) ? 2048 : 1024;
        }
        if (($changed & 24576) == 0) {
            $dirty |= $composer3.changedInstance(onExplore) ? 16384 : 8192;
        }
        int $dirty2 = $dirty;
        if (!$composer3.shouldExecute(($dirty2 & 9363) != 9362, $dirty2 & 1)) {
            $composer2 = $composer3;
            $composer2.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(653538608, $dirty2, -1, "com.luchime.huiyuan.ui.FavoritesScreen (KnowledgeScreens.kt:203)");
            }
            ProvidableCompositionLocal<Context> localContext = AndroidCompositionLocals_androidKt.getLocalContext();
            ComposerKt.sourceInformationMarkerStart($composer3, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
            Object objConsume = $composer3.consume(localContext);
            ComposerKt.sourceInformationMarkerEnd($composer3);
            Context context2 = (Context) objConsume;
            ProvidableCompositionLocal<AppHaptics> localAppHaptics = AppHapticsKt.getLocalAppHaptics();
            ComposerKt.sourceInformationMarkerStart($composer3, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
            Object objConsume2 = $composer3.consume(localAppHaptics);
            ComposerKt.sourceInformationMarkerEnd($composer3);
            final AppHaptics haptics = (AppHaptics) objConsume2;
            Modifier modifierStatusBarsPadding = WindowInsetsPadding_androidKt.statusBarsPadding(BackgroundKt.m234backgroundbw27NRU$default(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), HuiyuanDesignKt.getPaper(), null, 2, null));
            PaddingValues paddingValuesM722PaddingValuesa9UjIt4$default = PaddingKt.m722PaddingValuesa9UjIt4$default(0.0f, 0.0f, 0.0f, isLandscape ? Dp.m6973constructorimpl(12) : Dp.m6973constructorimpl(24), 7, null);
            Alignment.Horizontal centerHorizontally = Alignment.INSTANCE.getCenterHorizontally();
            ComposerKt.sourceInformationMarkerStart($composer3, 985398433, "CC(remember):KnowledgeScreens.kt#9igjgp");
            boolean zChangedInstance = (($dirty2 & 112) == 32) | $composer3.changedInstance(favorites) | $composer3.changedInstance(haptics) | ((57344 & $dirty2) == 16384) | $composer3.changedInstance(context2) | (($dirty2 & 896) == 256) | (($dirty2 & 7168) == 2048);
            Object objRememberedValue = $composer3.rememberedValue();
            if (!zChangedInstance) {
                context = context2;
                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                }
                ComposerKt.sourceInformationMarkerEnd($composer3);
                $composer2 = $composer3;
                LazyDslKt.LazyColumn(modifierStatusBarsPadding, null, paddingValuesM722PaddingValuesa9UjIt4$default, false, null, centerHorizontally, null, false, null, (Function1) objRememberedValue, $composer2, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 474);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            } else {
                context = context2;
            }
            final Context context3 = context;
            objRememberedValue = new Function1() { // from class: com.luchime.huiyuan.ui.KnowledgeScreensKt$$ExternalSyntheticLambda18
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return KnowledgeScreensKt.FavoritesScreen$lambda$54$lambda$53(favorites, isLandscape, haptics, onExplore, context3, onToggleFavorite, onAsk, (LazyListScope) obj);
                }
            };
            $composer3.updateRememberedValue(objRememberedValue);
            ComposerKt.sourceInformationMarkerEnd($composer3);
            $composer2 = $composer3;
            LazyDslKt.LazyColumn(modifierStatusBarsPadding, null, paddingValuesM722PaddingValuesa9UjIt4$default, false, null, centerHorizontally, null, false, null, (Function1) objRememberedValue, $composer2, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 474);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = $composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.luchime.huiyuan.ui.KnowledgeScreensKt$$ExternalSyntheticLambda19
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return KnowledgeScreensKt.FavoritesScreen$lambda$55(favorites, isLandscape, onToggleFavorite, onAsk, onExplore, $changed, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    static final Unit FavoritesScreen$lambda$54$lambda$53(final List $favorites, final boolean $isLandscape, final AppHaptics $haptics, final Function0 $onExplore, final Context $context, final Function2 $onToggleFavorite, final Function1 $onAsk, LazyListScope LazyColumn) {
        Intrinsics.checkNotNullParameter(LazyColumn, "$this$LazyColumn");
        LazyListScope.item$default(LazyColumn, null, null, ComposableLambdaKt.composableLambdaInstance(1075765701, true, new Function3() { // from class: com.luchime.huiyuan.ui.KnowledgeScreensKt$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function3
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                return KnowledgeScreensKt.FavoritesScreen$lambda$54$lambda$53$lambda$42($isLandscape, $favorites, (LazyItemScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
            }
        }), 3, null);
        if ($favorites.isEmpty()) {
            LazyListScope.item$default(LazyColumn, null, null, ComposableLambdaKt.composableLambdaInstance(-1892922784, true, new Function3() { // from class: com.luchime.huiyuan.ui.KnowledgeScreensKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    return KnowledgeScreensKt.FavoritesScreen$lambda$54$lambda$53$lambda$46($haptics, $onExplore, (LazyItemScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
                }
            }), 3, null);
        } else {
            LazyListScope.item$default(LazyColumn, null, null, ComposableSingletons$KnowledgeScreensKt.INSTANCE.m7408getLambda$1919830167$app(), 3, null);
            final Function1 function1 = new Function1() { // from class: com.luchime.huiyuan.ui.KnowledgeScreensKt$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return KnowledgeScreensKt.FavoritesScreen$lambda$54$lambda$53$lambda$47((FavoriteRecord) obj);
                }
            };
            final Function1 function2 = new Function1() { // from class: com.luchime.huiyuan.ui.KnowledgeScreensKt$FavoritesScreen$lambda$54$lambda$53$$inlined$items$default$1
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Object invoke(Object p1) {
                    return invoke((FavoriteRecord) p1);
                }

                @Override // kotlin.jvm.functions.Function1
                public final Void invoke(FavoriteRecord favoriteRecord) {
                    return null;
                }
            };
            LazyColumn.items($favorites.size(), new Function1<Integer, Object>() { // from class: com.luchime.huiyuan.ui.KnowledgeScreensKt$FavoritesScreen$lambda$54$lambda$53$$inlined$items$default$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                    return invoke(num.intValue());
                }

                public final Object invoke(int index) {
                    return invoke($favorites.get(index));
                }
            }, new Function1<Integer, Object>() { // from class: com.luchime.huiyuan.ui.KnowledgeScreensKt$FavoritesScreen$lambda$54$lambda$53$$inlined$items$default$3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                    return invoke(num.intValue());
                }

                public final Object invoke(int index) {
                    return invoke($favorites.get(index));
                }
            }, ComposableLambdaKt.composableLambdaInstance(-632812321, true, new Function4<LazyItemScope, Integer, Composer, Integer, Unit>() { // from class: com.luchime.huiyuan.ui.KnowledgeScreensKt$FavoritesScreen$lambda$54$lambda$53$$inlined$items$default$4
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(4);
                }

                @Override // kotlin.jvm.functions.Function4
                public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Integer num, Composer composer, Integer num2) {
                    invoke(lazyItemScope, num.intValue(), composer, num2.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(LazyItemScope $this$items, int it, Composer $composer, int $changed) {
                    ComposerKt.sourceInformation($composer, "C178@8826L22:LazyDsl.kt#428nma");
                    int $dirty = $changed;
                    if (($changed & 6) == 0) {
                        $dirty |= $composer.changed($this$items) ? 4 : 2;
                    }
                    if (($changed & 48) == 0) {
                        $dirty |= $composer.changed(it) ? 32 : 16;
                    }
                    if (!$composer.shouldExecute(($dirty & 147) != 146, $dirty & 1)) {
                        $composer.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-632812321, $dirty, -1, "androidx.compose.foundation.lazy.items.<anonymous> (LazyDsl.kt:178)");
                    }
                    int i = $dirty & 14;
                    final FavoriteRecord favoriteRecord = (FavoriteRecord) $favorites.get(it);
                    $composer.startReplaceGroup(1826592360);
                    ComposerKt.sourceInformation($composer, "C*275@11245L36,276@11313L63,277@11409L54,278@11493L38,272@11114L435:KnowledgeScreens.kt#cyjvf");
                    boolean z = $isLandscape;
                    ComposerKt.sourceInformationMarkerStart($composer, 1028757452, "CC(remember):KnowledgeScreens.kt#9igjgp");
                    boolean zChangedInstance = $composer.changedInstance($context) | ((((i & 112) ^ 48) > 32 && $composer.changed(favoriteRecord)) || (i & 48) == 32);
                    Object objRememberedValue = $composer.rememberedValue();
                    if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        final Context context = $context;
                        Object obj = (Function0) new Function0<Unit>() { // from class: com.luchime.huiyuan.ui.KnowledgeScreensKt$FavoritesScreen$1$1$4$1$1
                            @Override // kotlin.jvm.functions.Function0
                            public /* bridge */ /* synthetic */ Unit invoke() {
                                invoke2();
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2() {
                                HuiyuanDesignKt.copyText(context, favoriteRecord.getText());
                            }
                        };
                        $composer.updateRememberedValue(obj);
                        objRememberedValue = obj;
                    }
                    Function0 function0 = (Function0) objRememberedValue;
                    ComposerKt.sourceInformationMarkerEnd($composer);
                    ComposerKt.sourceInformationMarkerStart($composer, 1028759655, "CC(remember):KnowledgeScreens.kt#9igjgp");
                    boolean zChangedInstance2 = $composer.changedInstance($context) | ((((i & 112) ^ 48) > 32 && $composer.changed(favoriteRecord)) || (i & 48) == 32);
                    Object objRememberedValue2 = $composer.rememberedValue();
                    if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                        final Context context2 = $context;
                        Object obj2 = (Function0) new Function0<Unit>() { // from class: com.luchime.huiyuan.ui.KnowledgeScreensKt$FavoritesScreen$1$1$4$2$1
                            @Override // kotlin.jvm.functions.Function0
                            public /* bridge */ /* synthetic */ Unit invoke() {
                                invoke2();
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2() {
                                HuiyuanDesignKt.shareText(context2, favoriteRecord.getCategory() + "语录", favoriteRecord.getText());
                            }
                        };
                        $composer.updateRememberedValue(obj2);
                        objRememberedValue2 = obj2;
                    }
                    Function0 function3 = (Function0) objRememberedValue2;
                    ComposerKt.sourceInformationMarkerEnd($composer);
                    ComposerKt.sourceInformationMarkerStart($composer, 1028762718, "CC(remember):KnowledgeScreens.kt#9igjgp");
                    boolean zChanged = $composer.changed($onToggleFavorite) | ((((i & 112) ^ 48) > 32 && $composer.changed(favoriteRecord)) || (i & 48) == 32);
                    Object objRememberedValue3 = $composer.rememberedValue();
                    if (zChanged || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                        final Function2 function4 = $onToggleFavorite;
                        Object obj3 = (Function0) new Function0<Unit>() { // from class: com.luchime.huiyuan.ui.KnowledgeScreensKt$FavoritesScreen$1$1$4$3$1
                            @Override // kotlin.jvm.functions.Function0
                            public /* bridge */ /* synthetic */ Unit invoke() {
                                invoke2();
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2() {
                                invoke(favoriteRecord.getText(), favoriteRecord.getCategory());
                            }
                        };
                        $composer.updateRememberedValue(obj3);
                        objRememberedValue3 = obj3;
                    }
                    Function0 function5 = (Function0) objRememberedValue3;
                    ComposerKt.sourceInformationMarkerEnd($composer);
                    ComposerKt.sourceInformationMarkerStart($composer, 1028765390, "CC(remember):KnowledgeScreens.kt#9igjgp");
                    boolean zChanged2 = $composer.changed($onAsk) | ((((i & 112) ^ 48) > 32 && $composer.changed(favoriteRecord)) || (i & 48) == 32);
                    Object objRememberedValue4 = $composer.rememberedValue();
                    if (zChanged2 || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                        final Function1 function6 = $onAsk;
                        Object obj4 = (Function0) new Function0<Unit>() { // from class: com.luchime.huiyuan.ui.KnowledgeScreensKt$FavoritesScreen$1$1$4$4$1
                            @Override // kotlin.jvm.functions.Function0
                            public /* bridge */ /* synthetic */ Unit invoke() {
                                invoke2();
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2() {
                                invoke("请深入解释这句话：" + favoriteRecord.getText());
                            }
                        };
                        $composer.updateRememberedValue(obj4);
                        objRememberedValue4 = obj4;
                    }
                    ComposerKt.sourceInformationMarkerEnd($composer);
                    KnowledgeScreensKt.FavoriteCard(favoriteRecord, z, function0, function3, function5, (Function0) objRememberedValue4, $composer, (i >> 3) & 14);
                    $composer.endReplaceGroup();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }));
        }
        return Unit.INSTANCE;
    }

    static final Unit FavoritesScreen$lambda$54$lambda$53$lambda$42(boolean $isLandscape, final List $favorites, LazyItemScope item, Composer $composer, int $changed) {
        Intrinsics.checkNotNullParameter(item, "$this$item");
        ComposerKt.sourceInformation($composer, "C221@8995L528,215@8743L794:KnowledgeScreens.kt#cyjvf");
        if (!$composer.shouldExecute(($changed & 17) != 16, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1075765701, $changed, -1, "com.luchime.huiyuan.ui.FavoritesScreen.<anonymous>.<anonymous>.<anonymous> (KnowledgeScreens.kt:215)");
            }
            HuiyuanDesignKt.m7415ScreenHeaderfWhpE4E("MY COLLECTION", "我的收藏", "把真正触动你的句子留下，反复看见，才会慢慢长成自己的认知。", HuiyuanDesignKt.getSignalPink(), $isLandscape, ComposableLambdaKt.rememberComposableLambda(199554544, true, new Function2() { // from class: com.luchime.huiyuan.ui.KnowledgeScreensKt$$ExternalSyntheticLambda16
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return KnowledgeScreensKt.FavoritesScreen$lambda$54$lambda$53$lambda$42$lambda$41($favorites, (Composer) obj, ((Integer) obj2).intValue());
                }
            }, $composer, 54), $composer, 200118, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    static final Unit FavoritesScreen$lambda$54$lambda$53$lambda$42$lambda$41(List $favorites, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C222@9017L488:KnowledgeScreens.kt#cyjvf");
        if ($composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(199554544, $changed, -1, "com.luchime.huiyuan.ui.FavoritesScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous> (KnowledgeScreens.kt:222)");
            }
            TextKt.m2820Text4IGK_g("★ " + $favorites.size(), PaddingKt.m726paddingVpY3zN4(BorderKt.m245borderxT4_qwU(BackgroundKt.m233backgroundbw27NRU(Modifier.INSTANCE, HuiyuanDesignKt.getSignalYellow(), RoundedCornerShapeKt.m1018RoundedCornerShape0680j_4(Dp.m6973constructorimpl(12))), Dp.m6973constructorimpl(2), HuiyuanDesignKt.getInk(), RoundedCornerShapeKt.m1018RoundedCornerShape0680j_4(Dp.m6973constructorimpl(12))), Dp.m6973constructorimpl(12), Dp.m6973constructorimpl(9)), HuiyuanDesignKt.getInk(), TextUnitKt.getSp(18), (FontStyle) null, FontWeight.INSTANCE.getBlack(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, $composer, 200064, 0, 131024);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    static final Unit FavoritesScreen$lambda$54$lambda$53$lambda$46(final AppHaptics $haptics, final Function0 $onExplore, LazyItemScope item, Composer $composer, int $changed) {
        Function0<ComposeUiNode> function0;
        Intrinsics.checkNotNullParameter(item, "$this$item");
        ComposerKt.sourceInformation($composer, "C238@9619L1069:KnowledgeScreens.kt#cyjvf");
        if (!$composer.shouldExecute(($changed & 17) != 16, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1892922784, $changed, -1, "com.luchime.huiyuan.ui.FavoritesScreen.<anonymous>.<anonymous>.<anonymous> (KnowledgeScreens.kt:238)");
            }
            Modifier modifierM725padding3ABfNKs = PaddingKt.m725padding3ABfNKs(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), Dp.m6973constructorimpl(28));
            Alignment.Horizontal centerHorizontally = Alignment.INSTANCE.getCenterHorizontally();
            ComposerKt.sourceInformationMarkerStart($composer, -483455358, "CC(Column)P(2,3,1)87@4442L61,88@4508L133:Column.kt#2w3rfo");
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), centerHorizontally, $composer, ((390 >> 3) & 14) | ((390 >> 3) & 112));
            ComposerKt.sourceInformationMarkerStart($composer, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash($composer, 0);
            CompositionLocalMap currentCompositionLocalMap = $composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier($composer, modifierM725padding3ABfNKs);
            Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
            int i = ((((390 << 3) & 112) << 6) & 896) | 6;
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
            int i3 = ((390 >> 6) & 112) | 6;
            ComposerKt.sourceInformationMarkerStart($composer, 1212160098, "C244@9859L47,245@9927L77,246@10025L29,247@10075L63,248@10159L30,254@10434L62,250@10252L132,249@10210L460:KnowledgeScreens.kt#cyjvf");
            TextKt.m2820Text4IGK_g("☆", (Modifier) null, HuiyuanDesignKt.getSignalPink(), TextUnitKt.getSp(58), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, $composer, 3462, 0, 131058);
            TextKt.m2820Text4IGK_g("收藏夹还是空的", (Modifier) null, HuiyuanDesignKt.getInk(), TextUnitKt.getSp(20), (FontStyle) null, FontWeight.INSTANCE.getBlack(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, $composer, 200070, 0, 131026);
            SpacerKt.Spacer(SizeKt.m758height3ABfNKs(Modifier.INSTANCE, Dp.m6973constructorimpl(6)), $composer, 6);
            TextKt.m2820Text4IGK_g("去语录库看看，把有感觉的句子带回来。", (Modifier) null, HuiyuanDesignKt.getMutedText(), TextUnitKt.getSp(13), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, $composer, 3462, 0, 131058);
            SpacerKt.Spacer(SizeKt.m758height3ABfNKs(Modifier.INSTANCE, Dp.m6973constructorimpl(18)), $composer, 6);
            ButtonColors buttonColorsM1936buttonColorsro_MJ88 = ButtonDefaults.INSTANCE.m1936buttonColorsro_MJ88(HuiyuanDesignKt.getInk(), Color.INSTANCE.m4403getWhite0d7_KjU(), 0L, 0L, $composer, (ButtonDefaults.$stable << 12) | 54, 12);
            RoundedCornerShape roundedCornerShapeM1018RoundedCornerShape0680j_4 = RoundedCornerShapeKt.m1018RoundedCornerShape0680j_4(Dp.m6973constructorimpl(12));
            ComposerKt.sourceInformationMarkerStart($composer, -1623454150, "CC(remember):KnowledgeScreens.kt#9igjgp");
            boolean zChangedInstance = $composer.changedInstance($haptics) | $composer.changed($onExplore);
            Object objRememberedValue = $composer.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function0() { // from class: com.luchime.huiyuan.ui.KnowledgeScreensKt$$ExternalSyntheticLambda26
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return KnowledgeScreensKt.FavoritesScreen$lambda$54$lambda$53$lambda$46$lambda$45$lambda$44$lambda$43($haptics, $onExplore);
                    }
                };
                $composer.updateRememberedValue(objRememberedValue);
            }
            ComposerKt.sourceInformationMarkerEnd($composer);
            ButtonKt.Button((Function0) objRememberedValue, null, false, roundedCornerShapeM1018RoundedCornerShape0680j_4, buttonColorsM1936buttonColorsro_MJ88, null, null, null, null, ComposableSingletons$KnowledgeScreensKt.INSTANCE.getLambda$1130705734$app(), $composer, 805306368, 486);
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

    static final Unit FavoritesScreen$lambda$54$lambda$53$lambda$46$lambda$45$lambda$44$lambda$43(AppHaptics $haptics, Function0 $onExplore) {
        $haptics.perform(HapticCue.SELECTION);
        $onExplore.invoke();
        return Unit.INSTANCE;
    }

    static final Object FavoritesScreen$lambda$54$lambda$53$lambda$47(FavoriteRecord it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return it.getText();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void KnowledgeCard(final LexiconEntry entry, final String askName, final boolean isLandscape, final boolean favorite, final Function0<Unit> function0, final Function0<Unit> function1, final Function0<Unit> function2, final Function0<Unit> function3, Composer $composer, final int $changed) {
        LexiconEntry lexiconEntry;
        String str;
        boolean z;
        Function0<Unit> function4;
        Function0<Unit> function5;
        Function0<Unit> function6;
        Function0<Unit> function7;
        Composer $composer2 = $composer.startRestartGroup(-648603999);
        ComposerKt.sourceInformation($composer2, "C(KnowledgeCard)P(1!1,3!1,5,7,6)302@12054L1255,296@11824L1485:KnowledgeScreens.kt#cyjvf");
        int $dirty = $changed;
        if (($changed & 6) == 0) {
            lexiconEntry = entry;
            $dirty |= $composer2.changedInstance(lexiconEntry) ? 4 : 2;
        } else {
            lexiconEntry = entry;
        }
        if (($changed & 48) == 0) {
            str = askName;
            $dirty |= $composer2.changed(str) ? 32 : 16;
        } else {
            str = askName;
        }
        if (($changed & 384) == 0) {
            $dirty |= $composer2.changed(isLandscape) ? 256 : 128;
        }
        if (($changed & 3072) == 0) {
            z = favorite;
            $dirty |= $composer2.changed(z) ? 2048 : 1024;
        } else {
            z = favorite;
        }
        if (($changed & 24576) == 0) {
            function4 = function0;
            $dirty |= $composer2.changedInstance(function4) ? 16384 : 8192;
        } else {
            function4 = function0;
        }
        if ((196608 & $changed) == 0) {
            function5 = function1;
            $dirty |= $composer2.changedInstance(function5) ? 131072 : 65536;
        } else {
            function5 = function1;
        }
        if ((1572864 & $changed) == 0) {
            function6 = function2;
            $dirty |= $composer2.changedInstance(function6) ? 1048576 : 524288;
        } else {
            function6 = function2;
        }
        if ((12582912 & $changed) == 0) {
            function7 = function3;
            $dirty |= $composer2.changedInstance(function7) ? 8388608 : 4194304;
        } else {
            function7 = function3;
        }
        if (!$composer2.shouldExecute((4793491 & $dirty) != 4793490, $dirty & 1)) {
            $composer2.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-648603999, $dirty, -1, "com.luchime.huiyuan.ui.KnowledgeCard (KnowledgeScreens.kt:295)");
            }
            final LexiconEntry lexiconEntry2 = lexiconEntry;
            final String str2 = str;
            final boolean z2 = z;
            final Function0<Unit> function8 = function4;
            final Function0<Unit> function9 = function5;
            final Function0<Unit> function10 = function6;
            final Function0<Unit> function11 = function7;
            HuiyuanDesignKt.m7414RetroCard3IgeMak(PaddingKt.m726paddingVpY3zN4(SizeKt.m779widthInVpY3zN4$default(SizeKt.fillMaxWidth(Modifier.INSTANCE, isLandscape ? 0.92f : 1.0f), 0.0f, Dp.m6973constructorimpl(820), 1, null), Dp.m6973constructorimpl(16), Dp.m6973constructorimpl(7)), Color.INSTANCE.m4403getWhite0d7_KjU(), ComposableLambdaKt.rememberComposableLambda(1040336695, true, new Function3() { // from class: com.luchime.huiyuan.ui.KnowledgeScreensKt$$ExternalSyntheticLambda24
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    return KnowledgeScreensKt.KnowledgeCard$lambda$59(lexiconEntry2, z2, function10, function8, function9, str2, function11, (BoxScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
                }
            }, $composer2, 54), $composer2, 432, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = $composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.luchime.huiyuan.ui.KnowledgeScreensKt$$ExternalSyntheticLambda25
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return KnowledgeScreensKt.KnowledgeCard$lambda$60(entry, askName, isLandscape, favorite, function0, function1, function2, function3, $changed, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX WARN: Code duplicated, block: B:28:0x01c6  */
    /* JADX WARN: Code duplicated, block: B:31:0x01d2  */
    /* JADX WARN: Code duplicated, block: B:32:0x01d8  */
    /* JADX WARN: Code duplicated, block: B:43:0x0287  */
    /* JADX WARN: Code duplicated, block: B:44:0x028a  */
    /* JADX WARN: Code duplicated, block: B:47:0x0290  */
    /* JADX WARN: Code duplicated, block: B:48:0x0295  */
    /* JADX WARN: Code duplicated, block: B:51:0x03df  */
    /* JADX WARN: Code duplicated, block: B:54:0x03eb  */
    /* JADX WARN: Code duplicated, block: B:55:0x03f1  */
    /* JADX WARN: Code duplicated, block: B:66:0x04ee  */
    static final Unit KnowledgeCard$lambda$59(LexiconEntry $entry, boolean $favorite, Function0 $onFavorite, Function0 $onCopy, Function0 $onShare, String $askName, Function0 $onAsk, BoxScope RetroCard, Composer $composer, int $changed) {
        Function0<ComposeUiNode> function0;
        Composer composer;
        Composer composer2;
        int currentCompositeKeyHash;
        Function0<ComposeUiNode> constructor;
        Function0<ComposeUiNode> function1;
        Composer composerM3808constructorimpl;
        String str;
        long mutedText;
        int currentCompositeKeyHash2;
        Function0<ComposeUiNode> constructor2;
        Function0<ComposeUiNode> function2;
        Composer composerM3808constructorimpl2;
        Intrinsics.checkNotNullParameter(RetroCard, "$this$RetroCard");
        ComposerKt.sourceInformation($composer, "C303@12064L1239:KnowledgeScreens.kt#cyjvf");
        if ($composer.shouldExecute(($changed & 17) != 16, $changed & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1040336695, $changed, -1, "com.luchime.huiyuan.ui.KnowledgeCard.<anonymous> (KnowledgeScreens.kt:303)");
            }
            ComposerKt.sourceInformationMarkerStart($composer, -483455358, "CC(Column)P(2,3,1)87@4442L61,88@4508L133:Column.kt#2w3rfo");
            Modifier modifier = Modifier.INSTANCE;
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), $composer, ((0 >> 3) & 14) | ((0 >> 3) & 112));
            ComposerKt.sourceInformationMarkerStart($composer, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
            int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash($composer, 0);
            CompositionLocalMap currentCompositionLocalMap = $composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier($composer, modifier);
            Function0<ComposeUiNode> constructor3 = ComposeUiNode.INSTANCE.getConstructor();
            int i = ((((0 << 3) & 112) << 6) & 896) | 6;
            ComposerKt.sourceInformationMarkerStart($composer, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
            if (!($composer.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            $composer.startReusableNode();
            if ($composer.getInserting()) {
                function0 = constructor3;
                $composer.createNode(function0);
            } else {
                function0 = constructor3;
                $composer.useNode();
            }
            Composer composerM3808constructorimpl3 = Updater.m3808constructorimpl($composer);
            Updater.m3815setimpl(composerM3808constructorimpl3, measurePolicyColumnMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m3815setimpl(composerM3808constructorimpl3, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (composerM3808constructorimpl3.getInserting()) {
                composer = $composer;
            } else {
                composer = $composer;
                if (!Intrinsics.areEqual(composerM3808constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                }
                Updater.m3815setimpl(composerM3808constructorimpl3, modifierMaterializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
                int i2 = (i >> 6) & 14;
                composer2 = composer;
                ComposerKt.sourceInformationMarkerStart(composer2, -384672921, "C89@4556L9:Column.kt#2w3rfo");
                ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                int i3 = ((0 >> 6) & 112) | 6;
                ComposerKt.sourceInformationMarkerStart(composer2, 1242057834, "C304@12085L669,320@12767L30,321@12810L200,328@13023L30,329@13066L227:KnowledgeScreens.kt#cyjvf");
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
                int i4 = ((((438 << 3) & 112) << 6) & 896) | 6;
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
                int i5 = (i4 >> 6) & 14;
                ComposerKt.sourceInformationMarkerStart(composer2, -407735110, "C101@5232L9:Row.kt#2w3rfo");
                RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                int i6 = ((438 >> 6) & 112) | 6;
                ComposerKt.sourceInformationMarkerStart(composer2, -861891855, "C309@12303L60,310@12380L360:KnowledgeScreens.kt#cyjvf");
                HuiyuanDesignKt.m7413CategoryBadgeiJQMabo($entry.getCategory(), categoryColor($entry.getCategory()), composer2, 0, 0);
                if ($favorite) {
                    str = "★";
                } else {
                    str = "☆";
                }
                String str2 = str;
                if ($favorite) {
                    mutedText = HuiyuanDesignKt.getSignalPink();
                } else {
                    mutedText = HuiyuanDesignKt.getMutedText();
                }
                TextKt.m2820Text4IGK_g(str2, AppHapticsKt.hapticClickable$default(Modifier.INSTANCE, false, HapticCue.SELECTION, $onFavorite, 1, null), mutedText, TextUnitKt.getSp(25), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, 3072, 0, 131056);
                ComposerKt.sourceInformationMarkerEnd(composer2);
                ComposerKt.sourceInformationMarkerEnd(composer2);
                composer2.endNode();
                ComposerKt.sourceInformationMarkerEnd(composer2);
                ComposerKt.sourceInformationMarkerEnd(composer2);
                ComposerKt.sourceInformationMarkerEnd(composer2);
                SpacerKt.Spacer(SizeKt.m758height3ABfNKs(Modifier.INSTANCE, Dp.m6973constructorimpl(10)), composer2, 6);
                TextKt.m2820Text4IGK_g($entry.getText(), (Modifier) null, HuiyuanDesignKt.getInk(), TextUnitKt.getSp(15), (FontStyle) null, FontWeight.INSTANCE.getMedium(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, TextUnitKt.getSp(24), 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, 200064, 6, 130002);
                SpacerKt.Spacer(SizeKt.m758height3ABfNKs(Modifier.INSTANCE, Dp.m6973constructorimpl(11)), composer2, 6);
                Arrangement.Horizontal horizontalM606spacedBy0680j_4 = Arrangement.INSTANCE.m606spacedBy0680j_4(Dp.m6973constructorimpl(8));
                ComposerKt.sourceInformationMarkerStart(composer2, 693286680, "CC(Row)P(2,1,3)99@5124L58,100@5187L130:Row.kt#2w3rfo");
                Modifier modifier2 = Modifier.INSTANCE;
                MeasurePolicy measurePolicyRowMeasurePolicy2 = RowKt.rowMeasurePolicy(horizontalM606spacedBy0680j_4, Alignment.INSTANCE.getTop(), composer2, ((48 >> 3) & 14) | ((48 >> 3) & 112));
                ComposerKt.sourceInformationMarkerStart(composer2, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                CompositionLocalMap currentCompositionLocalMap3 = composer2.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier(composer2, modifier2);
                constructor2 = ComposeUiNode.INSTANCE.getConstructor();
                int i7 = ((((48 << 3) & 112) << 6) & 896) | 6;
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
                int i8 = (i7 >> 6) & 14;
                ComposerKt.sourceInformationMarkerStart(composer2, -407735110, "C101@5232L9:Row.kt#2w3rfo");
                RowScopeInstance rowScopeInstance2 = RowScopeInstance.INSTANCE;
                int i9 = ((48 >> 6) & 112) | 6;
                ComposerKt.sourceInformationMarkerStart(composer2, 153994130, "C330@13140L25,331@13182L26,332@13225L54:KnowledgeScreens.kt#cyjvf");
                m7416SmallActionFNF3uiM("复制", $onCopy, 0L, composer2, 6, 4);
                m7416SmallActionFNF3uiM("分享", $onShare, 0L, composer2, 6, 4);
                m7416SmallActionFNF3uiM("问" + $askName, $onAsk, HuiyuanDesignKt.getSignalYellow(), composer2, 384, 0);
                ComposerKt.sourceInformationMarkerEnd(composer2);
                ComposerKt.sourceInformationMarkerEnd(composer2);
                composer2.endNode();
                ComposerKt.sourceInformationMarkerEnd(composer2);
                ComposerKt.sourceInformationMarkerEnd(composer2);
                ComposerKt.sourceInformationMarkerEnd(composer2);
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
            composerM3808constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
            composerM3808constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash);
            Updater.m3815setimpl(composerM3808constructorimpl3, modifierMaterializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
            int i10 = (i >> 6) & 14;
            composer2 = composer;
            ComposerKt.sourceInformationMarkerStart(composer2, -384672921, "C89@4556L9:Column.kt#2w3rfo");
            ColumnScopeInstance columnScopeInstance2 = ColumnScopeInstance.INSTANCE;
            int i11 = ((0 >> 6) & 112) | 6;
            ComposerKt.sourceInformationMarkerStart(composer2, 1242057834, "C304@12085L669,320@12767L30,321@12810L200,328@13023L30,329@13066L227:KnowledgeScreens.kt#cyjvf");
            Modifier modifierFillMaxWidth$default2 = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
            Arrangement.Horizontal spaceBetween2 = Arrangement.INSTANCE.getSpaceBetween();
            Alignment.Vertical centerVertically2 = Alignment.INSTANCE.getCenterVertically();
            ComposerKt.sourceInformationMarkerStart(composer2, 693286680, "CC(Row)P(2,1,3)99@5124L58,100@5187L130:Row.kt#2w3rfo");
            MeasurePolicy measurePolicyRowMeasurePolicy3 = RowKt.rowMeasurePolicy(spaceBetween2, centerVertically2, composer2, ((438 >> 3) & 14) | ((438 >> 3) & 112));
            ComposerKt.sourceInformationMarkerStart(composer2, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
            currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
            CompositionLocalMap currentCompositionLocalMap4 = composer2.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier4 = ComposedModifierKt.materializeModifier(composer2, modifierFillMaxWidth$default2);
            constructor = ComposeUiNode.INSTANCE.getConstructor();
            int i12 = ((((438 << 3) & 112) << 6) & 896) | 6;
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
            Updater.m3815setimpl(composerM3808constructorimpl, measurePolicyRowMeasurePolicy3, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m3815setimpl(composerM3808constructorimpl, currentCompositionLocalMap4, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash4 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (!composerM3808constructorimpl.getInserting()) {
            }
            composerM3808constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
            composerM3808constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash4);
            Updater.m3815setimpl(composerM3808constructorimpl, modifierMaterializeModifier4, ComposeUiNode.INSTANCE.getSetModifier());
            int i13 = (i12 >> 6) & 14;
            ComposerKt.sourceInformationMarkerStart(composer2, -407735110, "C101@5232L9:Row.kt#2w3rfo");
            RowScopeInstance rowScopeInstance3 = RowScopeInstance.INSTANCE;
            int i14 = ((438 >> 6) & 112) | 6;
            ComposerKt.sourceInformationMarkerStart(composer2, -861891855, "C309@12303L60,310@12380L360:KnowledgeScreens.kt#cyjvf");
            HuiyuanDesignKt.m7413CategoryBadgeiJQMabo($entry.getCategory(), categoryColor($entry.getCategory()), composer2, 0, 0);
            if ($favorite) {
                str = "★";
            } else {
                str = "☆";
            }
            String str3 = str;
            if ($favorite) {
                mutedText = HuiyuanDesignKt.getSignalPink();
            } else {
                mutedText = HuiyuanDesignKt.getMutedText();
            }
            TextKt.m2820Text4IGK_g(str3, AppHapticsKt.hapticClickable$default(Modifier.INSTANCE, false, HapticCue.SELECTION, $onFavorite, 1, null), mutedText, TextUnitKt.getSp(25), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, 3072, 0, 131056);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            composer2.endNode();
            ComposerKt.sourceInformationMarkerEnd(composer2);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            SpacerKt.Spacer(SizeKt.m758height3ABfNKs(Modifier.INSTANCE, Dp.m6973constructorimpl(10)), composer2, 6);
            TextKt.m2820Text4IGK_g($entry.getText(), (Modifier) null, HuiyuanDesignKt.getInk(), TextUnitKt.getSp(15), (FontStyle) null, FontWeight.INSTANCE.getMedium(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, TextUnitKt.getSp(24), 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, 200064, 6, 130002);
            SpacerKt.Spacer(SizeKt.m758height3ABfNKs(Modifier.INSTANCE, Dp.m6973constructorimpl(11)), composer2, 6);
            Arrangement.Horizontal horizontalM606spacedBy0680j_5 = Arrangement.INSTANCE.m606spacedBy0680j_4(Dp.m6973constructorimpl(8));
            ComposerKt.sourceInformationMarkerStart(composer2, 693286680, "CC(Row)P(2,1,3)99@5124L58,100@5187L130:Row.kt#2w3rfo");
            Modifier modifier3 = Modifier.INSTANCE;
            MeasurePolicy measurePolicyRowMeasurePolicy4 = RowKt.rowMeasurePolicy(horizontalM606spacedBy0680j_5, Alignment.INSTANCE.getTop(), composer2, ((48 >> 3) & 14) | ((48 >> 3) & 112));
            ComposerKt.sourceInformationMarkerStart(composer2, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
            currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
            CompositionLocalMap currentCompositionLocalMap5 = composer2.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier5 = ComposedModifierKt.materializeModifier(composer2, modifier3);
            constructor2 = ComposeUiNode.INSTANCE.getConstructor();
            int i15 = ((((48 << 3) & 112) << 6) & 896) | 6;
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
            Updater.m3815setimpl(composerM3808constructorimpl2, measurePolicyRowMeasurePolicy4, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m3815setimpl(composerM3808constructorimpl2, currentCompositionLocalMap5, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash5 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (!composerM3808constructorimpl2.getInserting()) {
            }
            composerM3808constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
            composerM3808constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash5);
            Updater.m3815setimpl(composerM3808constructorimpl2, modifierMaterializeModifier5, ComposeUiNode.INSTANCE.getSetModifier());
            int i16 = (i15 >> 6) & 14;
            ComposerKt.sourceInformationMarkerStart(composer2, -407735110, "C101@5232L9:Row.kt#2w3rfo");
            RowScopeInstance rowScopeInstance4 = RowScopeInstance.INSTANCE;
            int i17 = ((48 >> 6) & 112) | 6;
            ComposerKt.sourceInformationMarkerStart(composer2, 153994130, "C330@13140L25,331@13182L26,332@13225L54:KnowledgeScreens.kt#cyjvf");
            m7416SmallActionFNF3uiM("复制", $onCopy, 0L, composer2, 6, 4);
            m7416SmallActionFNF3uiM("分享", $onShare, 0L, composer2, 6, 4);
            m7416SmallActionFNF3uiM("问" + $askName, $onAsk, HuiyuanDesignKt.getSignalYellow(), composer2, 384, 0);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            composer2.endNode();
            ComposerKt.sourceInformationMarkerEnd(composer2);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            ComposerKt.sourceInformationMarkerEnd(composer2);
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
            $composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void FavoriteCard(final FavoriteRecord favorite, final boolean isLandscape, final Function0<Unit> function0, final Function0<Unit> function1, final Function0<Unit> function2, final Function0<Unit> function3, Composer $composer, final int $changed) {
        final FavoriteRecord favoriteRecord;
        Function0<Unit> function4;
        Function0<Unit> function5;
        final Function0<Unit> function6;
        Function0<Unit> function7;
        Composer $composer2 = $composer.startRestartGroup(-1974502339);
        ComposerKt.sourceInformation($composer2, "C(FavoriteCard)P(!2,3,5,4)353@13736L1257,347@13512L1481:KnowledgeScreens.kt#cyjvf");
        int $dirty = $changed;
        if (($changed & 6) == 0) {
            favoriteRecord = favorite;
            $dirty |= $composer2.changed(favoriteRecord) ? 4 : 2;
        } else {
            favoriteRecord = favorite;
        }
        if (($changed & 48) == 0) {
            $dirty |= $composer2.changed(isLandscape) ? 32 : 16;
        }
        if (($changed & 384) == 0) {
            function4 = function0;
            $dirty |= $composer2.changedInstance(function4) ? 256 : 128;
        } else {
            function4 = function0;
        }
        if (($changed & 3072) == 0) {
            function5 = function1;
            $dirty |= $composer2.changedInstance(function5) ? 2048 : 1024;
        } else {
            function5 = function1;
        }
        if (($changed & 24576) == 0) {
            function6 = function2;
            $dirty |= $composer2.changedInstance(function6) ? 16384 : 8192;
        } else {
            function6 = function2;
        }
        if ((196608 & $changed) == 0) {
            function7 = function3;
            $dirty |= $composer2.changedInstance(function7) ? 131072 : 65536;
        } else {
            function7 = function3;
        }
        if (!$composer2.shouldExecute((74899 & $dirty) != 74898, $dirty & 1)) {
            $composer2.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1974502339, $dirty, -1, "com.luchime.huiyuan.ui.FavoriteCard (KnowledgeScreens.kt:346)");
            }
            final Function0<Unit> function8 = function4;
            final Function0<Unit> function9 = function5;
            final Function0<Unit> function10 = function7;
            HuiyuanDesignKt.m7414RetroCard3IgeMak(PaddingKt.m726paddingVpY3zN4(SizeKt.m779widthInVpY3zN4$default(SizeKt.fillMaxWidth(Modifier.INSTANCE, isLandscape ? 0.92f : 1.0f), 0.0f, Dp.m6973constructorimpl(820), 1, null), Dp.m6973constructorimpl(16), Dp.m6973constructorimpl(7)), HuiyuanDesignKt.getCream(), ComposableLambdaKt.rememberComposableLambda(-489305261, true, new Function3() { // from class: com.luchime.huiyuan.ui.KnowledgeScreensKt$$ExternalSyntheticLambda14
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    return KnowledgeScreensKt.FavoriteCard$lambda$64(favoriteRecord, function6, function8, function9, function10, (BoxScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
                }
            }, $composer2, 54), $composer2, 432, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = $composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.luchime.huiyuan.ui.KnowledgeScreensKt$$ExternalSyntheticLambda15
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return KnowledgeScreensKt.FavoriteCard$lambda$65(favorite, isLandscape, function0, function1, function2, function3, $changed, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX WARN: Code duplicated, block: B:28:0x01c4  */
    /* JADX WARN: Code duplicated, block: B:31:0x01d0  */
    /* JADX WARN: Code duplicated, block: B:32:0x01d6  */
    /* JADX WARN: Code duplicated, block: B:43:0x03d1  */
    /* JADX WARN: Code duplicated, block: B:46:0x03dd  */
    /* JADX WARN: Code duplicated, block: B:47:0x03e3  */
    /* JADX WARN: Code duplicated, block: B:58:0x04cd  */
    static final Unit FavoriteCard$lambda$64(FavoriteRecord $favorite, Function0 $onRemove, Function0 $onCopy, Function0 $onShare, Function0 $onAsk, BoxScope RetroCard, Composer $composer, int $changed) {
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
        Intrinsics.checkNotNullParameter(RetroCard, "$this$RetroCard");
        ComposerKt.sourceInformation($composer, "C354@13746L1241:KnowledgeScreens.kt#cyjvf");
        if (!$composer.shouldExecute(($changed & 17) != 16, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-489305261, $changed, -1, "com.luchime.huiyuan.ui.FavoriteCard.<anonymous> (KnowledgeScreens.kt:354)");
            }
            ComposerKt.sourceInformationMarkerStart($composer, -483455358, "CC(Column)P(2,3,1)87@4442L61,88@4508L133:Column.kt#2w3rfo");
            Modifier modifier = Modifier.INSTANCE;
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), $composer, ((0 >> 3) & 14) | ((0 >> 3) & 112));
            ComposerKt.sourceInformationMarkerStart($composer, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
            int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash($composer, 0);
            CompositionLocalMap currentCompositionLocalMap = $composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier($composer, modifier);
            Function0<ComposeUiNode> constructor3 = ComposeUiNode.INSTANCE.getConstructor();
            int i = ((((0 << 3) & 112) << 6) & 896) | 6;
            ComposerKt.sourceInformationMarkerStart($composer, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
            if (!($composer.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            $composer.startReusableNode();
            if ($composer.getInserting()) {
                function0 = constructor3;
                $composer.createNode(function0);
            } else {
                function0 = constructor3;
                $composer.useNode();
            }
            Composer composerM3808constructorimpl3 = Updater.m3808constructorimpl($composer);
            Updater.m3815setimpl(composerM3808constructorimpl3, measurePolicyColumnMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m3815setimpl(composerM3808constructorimpl3, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (composerM3808constructorimpl3.getInserting()) {
                composer = $composer;
            } else {
                composer = $composer;
                if (!Intrinsics.areEqual(composerM3808constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                }
                Updater.m3815setimpl(composerM3808constructorimpl3, modifierMaterializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
                int i2 = (i >> 6) & 14;
                composer2 = composer;
                ComposerKt.sourceInformationMarkerStart(composer2, -384672921, "C89@4556L9:Column.kt#2w3rfo");
                ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                int i3 = ((0 >> 6) & 112) | 6;
                ComposerKt.sourceInformationMarkerStart(composer2, -1251546740, "C355@13767L674,372@14454L30,373@14497L203,380@14713L30,381@14756L221:KnowledgeScreens.kt#cyjvf");
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
                int i4 = ((((438 << 3) & 112) << 6) & 896) | 6;
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
                int i5 = (i4 >> 6) & 14;
                ComposerKt.sourceInformationMarkerStart(composer2, -407735110, "C101@5232L9:Row.kt#2w3rfo");
                RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                int i6 = ((438 >> 6) & 112) | 6;
                ComposerKt.sourceInformationMarkerStart(composer2, 1054273392, "C360@13985L66,361@14068L359:KnowledgeScreens.kt#cyjvf");
                HuiyuanDesignKt.m7413CategoryBadgeiJQMabo($favorite.getCategory(), categoryColor($favorite.getCategory()), composer2, 0, 0);
                TextKt.m2820Text4IGK_g("移除", AppHapticsKt.hapticClickable$default(Modifier.INSTANCE, false, HapticCue.DESTRUCTIVE, $onRemove, 1, null), HuiyuanDesignKt.getSignalRed(), TextUnitKt.getSp(11), (FontStyle) null, FontWeight.INSTANCE.getBlack(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, 200070, 0, 131024);
                ComposerKt.sourceInformationMarkerEnd(composer2);
                ComposerKt.sourceInformationMarkerEnd(composer2);
                composer2.endNode();
                ComposerKt.sourceInformationMarkerEnd(composer2);
                ComposerKt.sourceInformationMarkerEnd(composer2);
                ComposerKt.sourceInformationMarkerEnd(composer2);
                SpacerKt.Spacer(SizeKt.m758height3ABfNKs(Modifier.INSTANCE, Dp.m6973constructorimpl(10)), composer2, 6);
                TextKt.m2820Text4IGK_g($favorite.getText(), (Modifier) null, HuiyuanDesignKt.getInk(), TextUnitKt.getSp(15), (FontStyle) null, FontWeight.INSTANCE.getMedium(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, TextUnitKt.getSp(24), 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, 200064, 6, 130002);
                SpacerKt.Spacer(SizeKt.m758height3ABfNKs(Modifier.INSTANCE, Dp.m6973constructorimpl(11)), composer2, 6);
                Arrangement.Horizontal horizontalM606spacedBy0680j_4 = Arrangement.INSTANCE.m606spacedBy0680j_4(Dp.m6973constructorimpl(8));
                ComposerKt.sourceInformationMarkerStart(composer2, 693286680, "CC(Row)P(2,1,3)99@5124L58,100@5187L130:Row.kt#2w3rfo");
                Modifier modifier2 = Modifier.INSTANCE;
                MeasurePolicy measurePolicyRowMeasurePolicy2 = RowKt.rowMeasurePolicy(horizontalM606spacedBy0680j_4, Alignment.INSTANCE.getTop(), composer2, ((48 >> 3) & 14) | ((48 >> 3) & 112));
                ComposerKt.sourceInformationMarkerStart(composer2, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                CompositionLocalMap currentCompositionLocalMap3 = composer2.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier(composer2, modifier2);
                constructor2 = ComposeUiNode.INSTANCE.getConstructor();
                int i7 = ((((48 << 3) & 112) << 6) & 896) | 6;
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
                int i8 = (i7 >> 6) & 14;
                ComposerKt.sourceInformationMarkerStart(composer2, -407735110, "C101@5232L9:Row.kt#2w3rfo");
                RowScopeInstance rowScopeInstance2 = RowScopeInstance.INSTANCE;
                int i9 = ((48 >> 6) & 112) | 6;
                ComposerKt.sourceInformationMarkerStart(composer2, -551773444, "C382@14830L25,383@14872L26,384@14915L48:KnowledgeScreens.kt#cyjvf");
                m7416SmallActionFNF3uiM("复制", $onCopy, 0L, composer2, 6, 4);
                m7416SmallActionFNF3uiM("分享", $onShare, 0L, composer2, 6, 4);
                m7416SmallActionFNF3uiM("继续聊", $onAsk, HuiyuanDesignKt.getSignalYellow(), composer2, 390, 0);
                ComposerKt.sourceInformationMarkerEnd(composer2);
                ComposerKt.sourceInformationMarkerEnd(composer2);
                composer2.endNode();
                ComposerKt.sourceInformationMarkerEnd(composer2);
                ComposerKt.sourceInformationMarkerEnd(composer2);
                ComposerKt.sourceInformationMarkerEnd(composer2);
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
            composerM3808constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
            composerM3808constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash);
            Updater.m3815setimpl(composerM3808constructorimpl3, modifierMaterializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
            int i10 = (i >> 6) & 14;
            composer2 = composer;
            ComposerKt.sourceInformationMarkerStart(composer2, -384672921, "C89@4556L9:Column.kt#2w3rfo");
            ColumnScopeInstance columnScopeInstance2 = ColumnScopeInstance.INSTANCE;
            int i11 = ((0 >> 6) & 112) | 6;
            ComposerKt.sourceInformationMarkerStart(composer2, -1251546740, "C355@13767L674,372@14454L30,373@14497L203,380@14713L30,381@14756L221:KnowledgeScreens.kt#cyjvf");
            Modifier modifierFillMaxWidth$default2 = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
            Arrangement.Horizontal spaceBetween2 = Arrangement.INSTANCE.getSpaceBetween();
            Alignment.Vertical centerVertically2 = Alignment.INSTANCE.getCenterVertically();
            ComposerKt.sourceInformationMarkerStart(composer2, 693286680, "CC(Row)P(2,1,3)99@5124L58,100@5187L130:Row.kt#2w3rfo");
            MeasurePolicy measurePolicyRowMeasurePolicy3 = RowKt.rowMeasurePolicy(spaceBetween2, centerVertically2, composer2, ((438 >> 3) & 14) | ((438 >> 3) & 112));
            ComposerKt.sourceInformationMarkerStart(composer2, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
            currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
            CompositionLocalMap currentCompositionLocalMap4 = composer2.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier4 = ComposedModifierKt.materializeModifier(composer2, modifierFillMaxWidth$default2);
            constructor = ComposeUiNode.INSTANCE.getConstructor();
            int i12 = ((((438 << 3) & 112) << 6) & 896) | 6;
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
            Updater.m3815setimpl(composerM3808constructorimpl, measurePolicyRowMeasurePolicy3, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m3815setimpl(composerM3808constructorimpl, currentCompositionLocalMap4, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash4 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (!composerM3808constructorimpl.getInserting()) {
            }
            composerM3808constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
            composerM3808constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash4);
            Updater.m3815setimpl(composerM3808constructorimpl, modifierMaterializeModifier4, ComposeUiNode.INSTANCE.getSetModifier());
            int i13 = (i12 >> 6) & 14;
            ComposerKt.sourceInformationMarkerStart(composer2, -407735110, "C101@5232L9:Row.kt#2w3rfo");
            RowScopeInstance rowScopeInstance3 = RowScopeInstance.INSTANCE;
            int i14 = ((438 >> 6) & 112) | 6;
            ComposerKt.sourceInformationMarkerStart(composer2, 1054273392, "C360@13985L66,361@14068L359:KnowledgeScreens.kt#cyjvf");
            HuiyuanDesignKt.m7413CategoryBadgeiJQMabo($favorite.getCategory(), categoryColor($favorite.getCategory()), composer2, 0, 0);
            TextKt.m2820Text4IGK_g("移除", AppHapticsKt.hapticClickable$default(Modifier.INSTANCE, false, HapticCue.DESTRUCTIVE, $onRemove, 1, null), HuiyuanDesignKt.getSignalRed(), TextUnitKt.getSp(11), (FontStyle) null, FontWeight.INSTANCE.getBlack(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, 200070, 0, 131024);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            composer2.endNode();
            ComposerKt.sourceInformationMarkerEnd(composer2);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            SpacerKt.Spacer(SizeKt.m758height3ABfNKs(Modifier.INSTANCE, Dp.m6973constructorimpl(10)), composer2, 6);
            TextKt.m2820Text4IGK_g($favorite.getText(), (Modifier) null, HuiyuanDesignKt.getInk(), TextUnitKt.getSp(15), (FontStyle) null, FontWeight.INSTANCE.getMedium(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, TextUnitKt.getSp(24), 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, 200064, 6, 130002);
            SpacerKt.Spacer(SizeKt.m758height3ABfNKs(Modifier.INSTANCE, Dp.m6973constructorimpl(11)), composer2, 6);
            Arrangement.Horizontal horizontalM606spacedBy0680j_5 = Arrangement.INSTANCE.m606spacedBy0680j_4(Dp.m6973constructorimpl(8));
            ComposerKt.sourceInformationMarkerStart(composer2, 693286680, "CC(Row)P(2,1,3)99@5124L58,100@5187L130:Row.kt#2w3rfo");
            Modifier modifier3 = Modifier.INSTANCE;
            MeasurePolicy measurePolicyRowMeasurePolicy4 = RowKt.rowMeasurePolicy(horizontalM606spacedBy0680j_5, Alignment.INSTANCE.getTop(), composer2, ((48 >> 3) & 14) | ((48 >> 3) & 112));
            ComposerKt.sourceInformationMarkerStart(composer2, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
            currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
            CompositionLocalMap currentCompositionLocalMap5 = composer2.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier5 = ComposedModifierKt.materializeModifier(composer2, modifier3);
            constructor2 = ComposeUiNode.INSTANCE.getConstructor();
            int i15 = ((((48 << 3) & 112) << 6) & 896) | 6;
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
            Updater.m3815setimpl(composerM3808constructorimpl2, measurePolicyRowMeasurePolicy4, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m3815setimpl(composerM3808constructorimpl2, currentCompositionLocalMap5, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash5 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (!composerM3808constructorimpl2.getInserting()) {
            }
            composerM3808constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
            composerM3808constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash5);
            Updater.m3815setimpl(composerM3808constructorimpl2, modifierMaterializeModifier5, ComposeUiNode.INSTANCE.getSetModifier());
            int i16 = (i15 >> 6) & 14;
            ComposerKt.sourceInformationMarkerStart(composer2, -407735110, "C101@5232L9:Row.kt#2w3rfo");
            RowScopeInstance rowScopeInstance4 = RowScopeInstance.INSTANCE;
            int i17 = ((48 >> 6) & 112) | 6;
            ComposerKt.sourceInformationMarkerStart(composer2, -551773444, "C382@14830L25,383@14872L26,384@14915L48:KnowledgeScreens.kt#cyjvf");
            m7416SmallActionFNF3uiM("复制", $onCopy, 0L, composer2, 6, 4);
            m7416SmallActionFNF3uiM("分享", $onShare, 0L, composer2, 6, 4);
            m7416SmallActionFNF3uiM("继续聊", $onAsk, HuiyuanDesignKt.getSignalYellow(), composer2, 390, 0);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            composer2.endNode();
            ComposerKt.sourceInformationMarkerEnd(composer2);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            ComposerKt.sourceInformationMarkerEnd(composer2);
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

    /* JADX INFO: renamed from: SmallAction-FNF3uiM, reason: not valid java name */
    private static final void m7416SmallActionFNF3uiM(final String text, final Function0<Unit> function0, long accent, Composer $composer, final int $changed, final int i) {
        String str;
        Function0<Unit> function1;
        long j;
        Composer $composer2;
        final long accent2;
        Composer $composer3 = $composer.startRestartGroup(142554167);
        ComposerKt.sourceInformation($composer3, "C(SmallAction)P(2,1,0:c#ui.graphics.Color)392@15097L387:KnowledgeScreens.kt#cyjvf");
        int $dirty = $changed;
        if (($changed & 6) == 0) {
            str = text;
            $dirty |= $composer3.changed(str) ? 4 : 2;
        } else {
            str = text;
        }
        if (($changed & 48) == 0) {
            function1 = function0;
            $dirty |= $composer3.changedInstance(function1) ? 32 : 16;
        } else {
            function1 = function0;
        }
        int i2 = i & 4;
        if (i2 != 0) {
            $dirty |= 384;
            j = accent;
        } else if (($changed & 384) == 0) {
            j = accent;
            $dirty |= $composer3.changed(j) ? 256 : 128;
        } else {
            j = accent;
        }
        if ($composer3.shouldExecute(($dirty & 147) != 146, $dirty & 1)) {
            accent2 = i2 != 0 ? HuiyuanDesignKt.getPaper() : j;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(142554167, $dirty, -1, "com.luchime.huiyuan.ui.SmallAction (KnowledgeScreens.kt:391)");
            }
            $composer2 = $composer3;
            TextKt.m2820Text4IGK_g(str, PaddingKt.m726paddingVpY3zN4(AppHapticsKt.hapticClickable$default(BorderKt.m245borderxT4_qwU(BackgroundKt.m233backgroundbw27NRU(Modifier.INSTANCE, accent2, RoundedCornerShapeKt.m1018RoundedCornerShape0680j_4(Dp.m6973constructorimpl(7))), Dp.m6973constructorimpl(1), HuiyuanDesignKt.getInk(), RoundedCornerShapeKt.m1018RoundedCornerShape0680j_4(Dp.m6973constructorimpl(7))), false, HapticCue.TAP, function1, 1, null), Dp.m6973constructorimpl(9), Dp.m6973constructorimpl(6)), HuiyuanDesignKt.getInk(), TextUnitKt.getSp(10), (FontStyle) null, FontWeight.INSTANCE.getBlack(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, $composer2, ($dirty & 14) | 200064, 0, 131024);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $composer2 = $composer3;
            $composer2.skipToGroupEnd();
            accent2 = j;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = $composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.luchime.huiyuan.ui.KnowledgeScreensKt$$ExternalSyntheticLambda17
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return KnowledgeScreensKt.SmallAction_FNF3uiM$lambda$66(text, function0, accent2, $changed, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX WARN: Code duplicated, block: B:35:0x024a  */
    private static final void EmptyKnowledgeResult(Function0<Unit> function0, Composer $composer, final int $changed) {
        Function0<ComposeUiNode> function1;
        final Function0<Unit> function2 = function0;
        Composer $composer2 = $composer.startRestartGroup(1328526872);
        ComposerKt.sourceInformation($composer2, "C(EmptyKnowledgeResult)407@15560L726:KnowledgeScreens.kt#cyjvf");
        int $dirty = $changed;
        if (($changed & 6) == 0) {
            $dirty |= $composer2.changedInstance(function2) ? 4 : 2;
        }
        int $dirty2 = $dirty;
        if ($composer2.shouldExecute(($dirty2 & 3) != 2, $dirty2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1328526872, $dirty2, -1, "com.luchime.huiyuan.ui.EmptyKnowledgeResult (KnowledgeScreens.kt:406)");
            }
            Modifier modifierM725padding3ABfNKs = PaddingKt.m725padding3ABfNKs(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), Dp.m6973constructorimpl(30));
            Alignment.Horizontal centerHorizontally = Alignment.INSTANCE.getCenterHorizontally();
            ComposerKt.sourceInformationMarkerStart($composer2, -483455358, "CC(Column)P(2,3,1)87@4442L61,88@4508L133:Column.kt#2w3rfo");
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), centerHorizontally, $composer2, ((390 >> 3) & 14) | ((390 >> 3) & 112));
            ComposerKt.sourceInformationMarkerStart($composer2, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash($composer2, 0);
            CompositionLocalMap currentCompositionLocalMap = $composer2.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier($composer2, modifierM725padding3ABfNKs);
            Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
            int i = ((((390 << 3) & 112) << 6) & 896) | 6;
            ComposerKt.sourceInformationMarkerStart($composer2, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
            if (!($composer2.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            $composer2.startReusableNode();
            if ($composer2.getInserting()) {
                $composer2.createNode(constructor);
            } else {
                $composer2.useNode();
            }
            Composer composerM3808constructorimpl = Updater.m3808constructorimpl($composer2);
            Updater.m3815setimpl(composerM3808constructorimpl, measurePolicyColumnMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m3815setimpl(composerM3808constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (composerM3808constructorimpl.getInserting()) {
                function1 = constructor;
            } else {
                function1 = constructor;
                if (!Intrinsics.areEqual(composerM3808constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                }
                Updater.m3815setimpl(composerM3808constructorimpl, modifierMaterializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
                int i2 = (i >> 6) & 14;
                ComposerKt.sourceInformationMarkerStart($composer2, -384672921, "C89@4556L9:Column.kt#2w3rfo");
                ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                int i3 = ((390 >> 6) & 112) | 6;
                ComposerKt.sourceInformationMarkerStart($composer2, -1749824307, "C413@15728L60,414@15797L30,415@15836L444:KnowledgeScreens.kt#cyjvf");
                TextKt.m2820Text4IGK_g("没有找到匹配语录", (Modifier) null, HuiyuanDesignKt.getInk(), 0L, (FontStyle) null, FontWeight.INSTANCE.getBlack(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, $composer2, 196998, 0, 131034);
                SpacerKt.Spacer(SizeKt.m758height3ABfNKs(Modifier.INSTANCE, Dp.m6973constructorimpl(10)), $composer2, 6);
                function2 = function0;
                TextKt.m2820Text4IGK_g("重置筛选", PaddingKt.m726paddingVpY3zN4(AppHapticsKt.hapticClickable$default(BorderKt.m245borderxT4_qwU(BackgroundKt.m233backgroundbw27NRU(Modifier.INSTANCE, HuiyuanDesignKt.getSignalYellow(), RoundedCornerShapeKt.m1018RoundedCornerShape0680j_4(Dp.m6973constructorimpl(9))), Dp.m6973constructorimpl((float) 1.5d), HuiyuanDesignKt.getInk(), RoundedCornerShapeKt.m1018RoundedCornerShape0680j_4(Dp.m6973constructorimpl(9))), false, HapticCue.SELECTION, function2, 1, null), Dp.m6973constructorimpl(12), Dp.m6973constructorimpl(8)), HuiyuanDesignKt.getInk(), TextUnitKt.getSp(12), (FontStyle) null, FontWeight.INSTANCE.getBlack(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, $composer2, 200070, 0, 131024);
                ComposerKt.sourceInformationMarkerEnd($composer2);
                ComposerKt.sourceInformationMarkerEnd($composer2);
                $composer2.endNode();
                ComposerKt.sourceInformationMarkerEnd($composer2);
                ComposerKt.sourceInformationMarkerEnd($composer2);
                ComposerKt.sourceInformationMarkerEnd($composer2);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
            composerM3808constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
            composerM3808constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            Updater.m3815setimpl(composerM3808constructorimpl, modifierMaterializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
            int i4 = (i >> 6) & 14;
            ComposerKt.sourceInformationMarkerStart($composer2, -384672921, "C89@4556L9:Column.kt#2w3rfo");
            ColumnScopeInstance columnScopeInstance2 = ColumnScopeInstance.INSTANCE;
            int i5 = ((390 >> 6) & 112) | 6;
            ComposerKt.sourceInformationMarkerStart($composer2, -1749824307, "C413@15728L60,414@15797L30,415@15836L444:KnowledgeScreens.kt#cyjvf");
            TextKt.m2820Text4IGK_g("没有找到匹配语录", (Modifier) null, HuiyuanDesignKt.getInk(), 0L, (FontStyle) null, FontWeight.INSTANCE.getBlack(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, $composer2, 196998, 0, 131034);
            SpacerKt.Spacer(SizeKt.m758height3ABfNKs(Modifier.INSTANCE, Dp.m6973constructorimpl(10)), $composer2, 6);
            function2 = function0;
            TextKt.m2820Text4IGK_g("重置筛选", PaddingKt.m726paddingVpY3zN4(AppHapticsKt.hapticClickable$default(BorderKt.m245borderxT4_qwU(BackgroundKt.m233backgroundbw27NRU(Modifier.INSTANCE, HuiyuanDesignKt.getSignalYellow(), RoundedCornerShapeKt.m1018RoundedCornerShape0680j_4(Dp.m6973constructorimpl(9))), Dp.m6973constructorimpl((float) 1.5d), HuiyuanDesignKt.getInk(), RoundedCornerShapeKt.m1018RoundedCornerShape0680j_4(Dp.m6973constructorimpl(9))), false, HapticCue.SELECTION, function2, 1, null), Dp.m6973constructorimpl(12), Dp.m6973constructorimpl(8)), HuiyuanDesignKt.getInk(), TextUnitKt.getSp(12), (FontStyle) null, FontWeight.INSTANCE.getBlack(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, $composer2, 200070, 0, 131024);
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
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.luchime.huiyuan.ui.KnowledgeScreensKt$$ExternalSyntheticLambda27
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return KnowledgeScreensKt.EmptyKnowledgeResult$lambda$68(function2, $changed, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final long categoryColor(String category) {
        List colors = CollectionsKt.listOf((Object[]) new Color[]{Color.m4356boximpl(HuiyuanDesignKt.getSignalPink()), Color.m4356boximpl(HuiyuanDesignKt.getSignalPurple()), Color.m4356boximpl(HuiyuanDesignKt.getSignalBlue()), Color.m4356boximpl(HuiyuanDesignKt.getSignalRed()), Color.m4356boximpl(HuiyuanDesignKt.getSignalGreen()), Color.m4356boximpl(HuiyuanDesignKt.getSignalOrange())});
        return ((Color) colors.get(Math.floorMod(category.hashCode(), colors.size()))).m4376unboximpl();
    }
}
