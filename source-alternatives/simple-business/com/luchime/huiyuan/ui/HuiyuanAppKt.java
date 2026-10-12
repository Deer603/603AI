package com.luchime.huiyuan.ui;

import android.content.Context;
import android.content.res.Configuration;
import androidx.compose.animation.core.AnimationConstants;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.BorderKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.WindowInsetsPadding_androidKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material3.SurfaceKt;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableIntState;
import androidx.compose.runtime.MutableLongState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotIntStateKt;
import androidx.compose.runtime.SnapshotLongStateKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.saveable.RememberSaveableKt;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.TextUnitKt;
import com.luchime.huiyuan.AppRepository;
import com.luchime.huiyuan.ChatRecord;
import com.luchime.huiyuan.FavoriteRecord;
import com.luchime.huiyuan.HuiyuanEngine;
import com.luchime.huiyuan.LexiconEntry;
import com.luchime.huiyuan.R;
import com.luchime.huiyuan.ReplyResult;
import com.luchime.huiyuan.UsageLogic;
import com.luchime.huiyuan.UsageStats;
import com.luchime.huiyuan.ui.theme.ThemeKt;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.IntIterator;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KFunction;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;

/* JADX INFO: compiled from: HuiyuanApp.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\\\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u001a\r\u0010\u0000\u001a\u00020\u0001H\u0007¢\u0006\u0002\u0010\u0002\u001a)\u0010\u0003\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00052\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\u0007H\u0003¢\u0006\u0002\u0010\b\u001a)\u0010\t\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00052\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\u0007H\u0003¢\u0006\u0002\u0010\b\u001a\f\u0010\n\u001a\u00020\u000b*\u00020\fH\u0002\u001a\f\u0010\r\u001a\u00020\f*\u00020\u000bH\u0002\u001a\u0012\u0010\u000e\u001a\u00020\u000f*\b\u0012\u0004\u0012\u00020\f0\u0010H\u0002\u001a\r\u0010\u0011\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u0002\u001a\r\u0010\u0012\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u0002¨\u0006\u0013²\u0006\n\u0010\u0014\u001a\u00020\u0015X\u008a\u008e\u0002²\u0006\n\u0010\u0016\u001a\u00020\u0005X\u008a\u008e\u0002²\u0006\n\u0010\u0017\u001a\u00020\u000fX\u008a\u008e\u0002²\u0006\n\u0010\u0018\u001a\u00020\u0019X\u008a\u008e\u0002²\u0006\n\u0010\u001a\u001a\u00020\u001bX\u008a\u008e\u0002²\u0006\n\u0010\u001c\u001a\u00020\u001bX\u008a\u008e\u0002²\u0006\n\u0010\u001d\u001a\u00020\u001eX\u008a\u008e\u0002²\u0006\f\u0010\u001f\u001a\u0004\u0018\u00010 X\u008a\u008e\u0002²\u0006\u0010\u0010!\u001a\b\u0012\u0004\u0012\u00020\"0\u0010X\u008a\u008e\u0002²\u0006\n\u0010#\u001a\u00020$X\u008a\u008e\u0002"}, d2 = {"HuiyuanApp", "", "(Landroidx/compose/runtime/Composer;I)V", "SideNavigation", "selected", "Lcom/luchime/huiyuan/ui/AppTab;", "onSelect", "Lkotlin/Function1;", "(Lcom/luchime/huiyuan/ui/AppTab;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "BottomNavigation", "toTimelineMessage", "Lcom/luchime/huiyuan/ui/TimelineItem$Message;", "Lcom/luchime/huiyuan/ChatRecord;", "toChatRecord", "toExportText", "", "", "HuiyuanAppPreview", "HuiyuanAppLandscapePreview", "app", "selectedModel", "Lcom/luchime/huiyuan/ui/AIModel;", "selectedTab", "input", "chipRound", "", "nextId", "", "conversationGeneration", "isGenerating", "", "activeGenerationJob", "Lkotlinx/coroutines/Job;", "favorites", "Lcom/luchime/huiyuan/FavoriteRecord;", "usageStats", "Lcom/luchime/huiyuan/UsageStats;"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class HuiyuanAppKt {

    /* JADX INFO: compiled from: HuiyuanApp.kt */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0 = null;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1 = null;

        static {
            int[] r0 = new int[AIModel.values().length];
            r0[AIModel.HUIYUAN.ordinal()] = 1;     // Catch: NoSuchFieldError -> L5
        L36:
            r0[AIModel.PIAO.ordinal()] = 2;     // Catch: NoSuchFieldError -> L9
        L46:
            r0[AIModel.GUIGUI.ordinal()] = 3;     // Catch: NoSuchFieldError -> L13
        L50:
            r0[AIModel.TANGO.ordinal()] = 4;     // Catch: NoSuchFieldError -> L17
        L18:
            $EnumSwitchMapping$0 = r0;
            int[] r1 = new int[AppTab.values().length];
            r1[AppTab.CHAT.ordinal()] = 1;     // Catch: NoSuchFieldError -> L21
        L40:
            r1[AppTab.ROOM.ordinal()] = 2;     // Catch: NoSuchFieldError -> L24
        L42:
            r1[AppTab.LIBRARY.ordinal()] = 3;     // Catch: NoSuchFieldError -> L27
        L52:
            r1[AppTab.FAVORITES.ordinal()] = 4;     // Catch: NoSuchFieldError -> L30
        L38:
            r1[AppTab.PROFILE.ordinal()] = 5;     // Catch: NoSuchFieldError -> L33
        L34:
            $EnumSwitchMapping$1 = r1;
        }
    }

    static final Unit BottomNavigation$lambda$108(AppTab r1, Function1 r2, int r3, Composer r4, int r5) {
        BottomNavigation(r1, r2, r4, RecomposeScopeImplKt.updateChangedFlags(r3 | 1));
        return Unit.INSTANCE;
    }

    static final Unit HuiyuanApp$lambda$96(int r1, Composer r2, int r3) {
        HuiyuanApp(r2, RecomposeScopeImplKt.updateChangedFlags(r1 | 1));
        return Unit.INSTANCE;
    }

    static final Unit HuiyuanAppLandscapePreview$lambda$113(int r1, Composer r2, int r3) {
        HuiyuanAppLandscapePreview(r2, RecomposeScopeImplKt.updateChangedFlags(r1 | 1));
        return Unit.INSTANCE;
    }

    static final Unit HuiyuanAppPreview$lambda$112(int r1, Composer r2, int r3) {
        HuiyuanAppPreview(r2, RecomposeScopeImplKt.updateChangedFlags(r1 | 1));
        return Unit.INSTANCE;
    }

    static final Unit SideNavigation$lambda$102(AppTab r1, Function1 r2, int r3, Composer r4, int r5) {
        SideNavigation(r1, r2, r4, RecomposeScopeImplKt.updateChangedFlags(r3 | 1));
        return Unit.INSTANCE;
    }

    public static final /* synthetic */ AppTab access$HuiyuanApp$lambda$16(MutableState $selectedTab$delegate) {
        return HuiyuanApp$lambda$16($selectedTab$delegate);
    }

    public static final /* synthetic */ long access$HuiyuanApp$lambda$28(MutableLongState $nextId$delegate) {
        return HuiyuanApp$lambda$28($nextId$delegate);
    }

    public static final /* synthetic */ void access$HuiyuanApp$lambda$29(MutableLongState $nextId$delegate, long r1) {
        HuiyuanApp$lambda$29($nextId$delegate, r1);
    }

    public static final /* synthetic */ long access$HuiyuanApp$lambda$31(MutableLongState $conversationGeneration$delegate) {
        return HuiyuanApp$lambda$31($conversationGeneration$delegate);
    }

    public static final /* synthetic */ void access$HuiyuanApp$lambda$35(MutableState $isGenerating$delegate, boolean r1) {
        HuiyuanApp$lambda$35($isGenerating$delegate, r1);
    }

    public static final /* synthetic */ void access$HuiyuanApp$lambda$38(MutableState $activeGenerationJob$delegate, Job r1) {
        HuiyuanApp$lambda$38($activeGenerationJob$delegate, r1);
    }

    public static final /* synthetic */ void access$HuiyuanApp$persistConversation(AppRepository repository, SnapshotStateList timeline) {
        HuiyuanApp$persistConversation(repository, timeline);
    }

    public static final /* synthetic */ void access$HuiyuanApp$randomOne(HuiyuanEngine engine, AppRepository repository, MutableState isGenerating$delegate, MutableState usageStats$delegate, SnapshotStateList timeline, CoroutineScope scope, MutableLongState conversationGeneration$delegate, MutableLongState nextId$delegate, MutableState activeGenerationJob$delegate, MutableState selectedModel$delegate, AppHaptics haptics, MutableState selectedTab$delegate) {
        HuiyuanApp$randomOne(engine, repository, isGenerating$delegate, usageStats$delegate, timeline, scope, conversationGeneration$delegate, nextId$delegate, activeGenerationJob$delegate, selectedModel$delegate, haptics, selectedTab$delegate);
    }

    public static final /* synthetic */ void access$HuiyuanApp$resetConversation(SnapshotStateList timeline, AppRepository repository, HuiyuanEngine engine, MutableLongState conversationGeneration$delegate, MutableState activeGenerationJob$delegate, MutableState isGenerating$delegate, MutableLongState nextId$delegate, MutableState selectedModel$delegate) {
        HuiyuanApp$resetConversation(timeline, repository, engine, conversationGeneration$delegate, activeGenerationJob$delegate, isGenerating$delegate, nextId$delegate, selectedModel$delegate);
    }

    public static final /* synthetic */ void access$HuiyuanApp$resetEverything(AppRepository repository, SnapshotStateList timeline, HuiyuanEngine engine, MutableLongState conversationGeneration$delegate, MutableState activeGenerationJob$delegate, MutableState isGenerating$delegate, MutableState favorites$delegate, MutableState usageStats$delegate, MutableState selectedModel$delegate, MutableLongState nextId$delegate, MutableState selectedTab$delegate) {
        HuiyuanApp$resetEverything(repository, timeline, engine, conversationGeneration$delegate, activeGenerationJob$delegate, isGenerating$delegate, favorites$delegate, usageStats$delegate, selectedModel$delegate, nextId$delegate, selectedTab$delegate);
    }

    public static final /* synthetic */ void access$HuiyuanApp$submit(HuiyuanEngine engine, AppRepository repository, MutableState isGenerating$delegate, SnapshotStateList timeline, MutableLongState nextId$delegate, MutableState selectedModel$delegate, MutableState input$delegate, MutableState usageStats$delegate, CoroutineScope scope, MutableLongState conversationGeneration$delegate, MutableState activeGenerationJob$delegate, AppHaptics haptics, MutableState selectedTab$delegate, String text) {
        HuiyuanApp$submit(engine, repository, isGenerating$delegate, timeline, nextId$delegate, selectedModel$delegate, input$delegate, usageStats$delegate, scope, conversationGeneration$delegate, activeGenerationJob$delegate, haptics, selectedTab$delegate, text);
    }

    public static final /* synthetic */ void access$HuiyuanApp$toggleFavorite(AppRepository repository, MutableState favorites$delegate, String text, String category) {
        HuiyuanApp$toggleFavorite(repository, favorites$delegate, text, category);
    }

    public static final void HuiyuanApp(Composer $composer, final int $changed) {
        Composer $composer2 = $composer.startRestartGroup(-577094573);
        ComposerKt.sourceInformation($composer2, "C(HuiyuanApp)92@3467L7,93@3518L7,95@3631L20,97@3729L46,98@3818L164,98@3801L181,104@4007L57,105@4086L61,106@4171L63,107@4257L62,114@4544L38,115@4602L144,120@4763L24,121@4828L31,121@4811L48,122@4894L22,122@4877L39,123@4955L24,123@4938L41,124@4998L95,127@5128L35,128@5188L34,129@5254L39,130@5315L55,131@5393L51,306@11913L159,306@11892L180,313@12095L129,317@12289L5010,317@12230L5069:HuiyuanApp.kt#cyjvf");
        if ($changed == 0) goto L5;
        boolean r2 = true;
    L7:
        if ($composer2.shouldExecute(r2, $changed & 1) == true) goto L9;
        $composer2.skipToGroupEnd();
    L137:
        ScopeUpdateScope r1 = $composer2.endRestartGroup();
        if (r1 == null) goto L145;
        r1.updateScope(new HuiyuanAppKt$$ExternalSyntheticLambda25($changed));
        return;
    L145:
        return;
    L9:
        if (ComposerKt.isTraceInProgress() == false) goto L11;
        ComposerKt.traceEventStart(-577094573, $changed, -1, "com.luchime.huiyuan.ui.HuiyuanApp (HuiyuanApp.kt:91)");
    L11:
        ProvidableCompositionLocal<Context> r3 = AndroidCompositionLocals_androidKt.getLocalContext();
        ComposerKt.sourceInformationMarkerStart($composer2, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
        Object r8 = $composer2.consume(r3);
        ComposerKt.sourceInformationMarkerEnd($composer2);
        Context context = (Context) r8;
        ProvidableCompositionLocal<Configuration> r4 = AndroidCompositionLocals_androidKt.getLocalConfiguration();
        ComposerKt.sourceInformationMarkerStart($composer2, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
        Object r5 = $composer2.consume(r4);
        ComposerKt.sourceInformationMarkerEnd($composer2);
        Configuration configuration = (Configuration) r5;
        if (configuration.orientation != 2) goto L14;
        boolean r6 = true;
    L15:
        final boolean isLandscape = r6;
        final AppHaptics haptics = AppHapticsKt.rememberAppHaptics($composer2, 0);
        Context applicationContext = context.getApplicationContext();
        ComposerKt.sourceInformationMarkerStart($composer2, -537093055, "CC(remember):HuiyuanApp.kt#9igjgp");
        Object r7 = $composer2.rememberedValue();
        if (r7 != Composer.Companion.getEmpty()) goto L19;
        Intrinsics.checkNotNull(applicationContext);
        Object r12 = new AppRepository(applicationContext);
        $composer2.updateRememberedValue(r12);
        r7 = r12;
    L19:
        final AppRepository repository = (AppRepository) r7;
        ComposerKt.sourceInformationMarkerEnd($composer2);
        Object[] r9 = new Object[0];
        ComposerKt.sourceInformationMarkerStart($composer2, -537090089, "CC(remember):HuiyuanApp.kt#9igjgp");
        boolean r10 = $composer2.changedInstance(repository);
        Object r11 = $composer2.rememberedValue();
        if (r10 == true) goto L25;
        int r18 = 0;
        if (r11 != Composer.Companion.getEmpty()) goto L27;
    L26:
        Object r13 = new HuiyuanAppKt$$ExternalSyntheticLambda20(repository);
        $composer2.updateRememberedValue(r13);
        r11 = r13;
    L27:
        ComposerKt.sourceInformationMarkerEnd($composer2);
        MutableState selectedModel$delegate = (MutableState) RememberSaveableKt.m3923rememberSaveable(r9, null, null, (Function0) r11, $composer2, 0, 6);
        ComposerKt.sourceInformationMarkerStart($composer2, -537084148, "CC(remember):HuiyuanApp.kt#9igjgp");
        Object r14 = $composer2.rememberedValue();
        if (r14 != Composer.Companion.getEmpty()) goto L31;
        HuiyuanEngine.Companion r15 = HuiyuanEngine.Companion;
        Intrinsics.checkNotNull(applicationContext);
        Object r16 = r15.fromAssets(applicationContext);
        $composer2.updateRememberedValue(r16);
        r14 = r16;
    L31:
        HuiyuanEngine huiyuanEngine = (HuiyuanEngine) r14;
        ComposerKt.sourceInformationMarkerEnd($composer2);
        ComposerKt.sourceInformationMarkerStart($composer2, -537081616, "CC(remember):HuiyuanApp.kt#9igjgp");
        Object r17 = $composer2.rememberedValue();
        if (r17 != Composer.Companion.getEmpty()) goto L35;
        HuiyuanEngine.Companion r19 = HuiyuanEngine.Companion;
        Intrinsics.checkNotNull(applicationContext);
        Object r20 = r19.piaoFromAssets(applicationContext);
        $composer2.updateRememberedValue(r20);
        r17 = r20;
    L35:
        HuiyuanEngine piaoEngine = (HuiyuanEngine) r17;
        ComposerKt.sourceInformationMarkerEnd($composer2);
        ComposerKt.sourceInformationMarkerStart($composer2, -537078894, "CC(remember):HuiyuanApp.kt#9igjgp");
        Object r21 = $composer2.rememberedValue();
        if (r21 != Composer.Companion.getEmpty()) goto L39;
        HuiyuanEngine.Companion r22 = HuiyuanEngine.Companion;
        Intrinsics.checkNotNull(applicationContext);
        Object r23 = r22.guiguiFromAssets(applicationContext);
        $composer2.updateRememberedValue(r23);
        r21 = r23;
    L39:
        HuiyuanEngine guiguiEngine = (HuiyuanEngine) r21;
        ComposerKt.sourceInformationMarkerEnd($composer2);
        ComposerKt.sourceInformationMarkerStart($composer2, -537076143, "CC(remember):HuiyuanApp.kt#9igjgp");
        Object r24 = $composer2.rememberedValue();
        if (r24 != Composer.Companion.getEmpty()) goto L43;
        HuiyuanEngine.Companion r25 = HuiyuanEngine.Companion;
        Intrinsics.checkNotNull(applicationContext);
        Object r26 = r25.tangoFromAssets(applicationContext);
        $composer2.updateRememberedValue(r26);
        r24 = r26;
    L43:
        HuiyuanEngine tangoEngine = (HuiyuanEngine) r24;
        ComposerKt.sourceInformationMarkerEnd($composer2);
        switch(WhenMappings.$EnumSwitchMapping$0[HuiyuanApp$lambda$4(selectedModel$delegate).ordinal()]) {
            case 1: goto L50;
            case 2: goto L49;
            case 3: goto L48;
            case 4: goto L47;
            default: goto L46;
        };
    L47:
        HuiyuanEngine engine = tangoEngine;
    L51:
        ComposerKt.sourceInformationMarkerStart($composer2, -537066983, "CC(remember):HuiyuanApp.kt#9igjgp");
        Object r27 = $composer2.rememberedValue();
        if (r27 != Composer.Companion.getEmpty()) goto L55;
        Object r28 = repository.loadMessages();
        $composer2.updateRememberedValue(r28);
        r27 = r28;
    L55:
        List initialMessages = (List) r27;
        ComposerKt.sourceInformationMarkerEnd($composer2);
        ComposerKt.sourceInformationMarkerStart($composer2, -537065021, "CC(remember):HuiyuanApp.kt#9igjgp");
        Object r29 = $composer2.rememberedValue();
        if (r29 != Composer.Companion.getEmpty()) goto L63;
        SnapshotStateList r110 = SnapshotStateKt.mutableStateListOf();
        List r30 = initialMessages;
        Collection r31 = new ArrayList(CollectionsKt.collectionSizeOrDefault(r30, 10));
        Iterator r210 = r30.iterator();
    L59:
        if (r210.hasNext() == false) goto L61;
        r31.add(toTimelineMessage((ChatRecord) r210.next()));
        r30 = r30;
        goto L59
    L61:
        r110.addAll((List) r31);
        $composer2.updateRememberedValue(r110);
        r29 = r110;
    L63:
        SnapshotStateList timeline = (SnapshotStateList) r29;
        ComposerKt.sourceInformationMarkerEnd($composer2);
        ComposerKt.sourceInformationMarkerStart($composer2, 773894976, "CC(rememberCoroutineScope)558@25470L68:Effects.kt#9igjgp");
        ComposerKt.sourceInformationMarkerStart($composer2, -954203484, "CC(remember):Effects.kt#9igjgp");
        Object r32 = $composer2.rememberedValue();
        if (r32 != Composer.Companion.getEmpty()) goto L67;
        r32 = EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, $composer2);
        $composer2.updateRememberedValue(r32);
    L67:
        final CoroutineScope scope = (CoroutineScope) r32;
        ComposerKt.sourceInformationMarkerEnd($composer2);
        ComposerKt.sourceInformationMarkerEnd($composer2);
        Object[] r33 = new Object[r18];
        ComposerKt.sourceInformationMarkerStart($composer2, -537057902, "CC(remember):HuiyuanApp.kt#9igjgp");
        Object r34 = $composer2.rememberedValue();
        if (r34 != Composer.Companion.getEmpty()) goto L71;
        Object r211 = new HuiyuanAppKt$$ExternalSyntheticLambda21();
        $composer2.updateRememberedValue(r211);
        r34 = r211;
    L71:
        ComposerKt.sourceInformationMarkerEnd($composer2);
        HuiyuanEngine engine2 = engine;
        final MutableState selectedTab$delegate = (MutableState) RememberSaveableKt.m3923rememberSaveable(r33, null, null, (Function0) r34, $composer2, 0, 6);
        Object[] r35 = new Object[0];
        ComposerKt.sourceInformationMarkerStart($composer2, -537055799, "CC(remember):HuiyuanApp.kt#9igjgp");
        Object r36 = $composer2.rememberedValue();
        if (r36 != Composer.Companion.getEmpty()) goto L75;
        Object r111 = new HuiyuanAppKt$$ExternalSyntheticLambda22();
        $composer2.updateRememberedValue(r111);
        r36 = r111;
    L75:
        ComposerKt.sourceInformationMarkerEnd($composer2);
        final MutableState input$delegate = (MutableState) RememberSaveableKt.m3923rememberSaveable(r35, null, null, (Function0) r36, $composer2, 0, 6);
        Object[] r37 = new Object[0];
        ComposerKt.sourceInformationMarkerStart($composer2, -537053845, "CC(remember):HuiyuanApp.kt#9igjgp");
        Object r38 = $composer2.rememberedValue();
        if (r38 != Composer.Companion.getEmpty()) goto L79;
        Object r112 = new HuiyuanAppKt$$ExternalSyntheticLambda23();
        $composer2.updateRememberedValue(r112);
        r38 = r112;
    L79:
        ComposerKt.sourceInformationMarkerEnd($composer2);
        final MutableIntState chipRound$delegate = (MutableIntState) RememberSaveableKt.m3923rememberSaveable(r37, null, null, (Function0) r38, $composer2, 0, 6);
        ComposerKt.sourceInformationMarkerStart($composer2, -537052398, "CC(remember):HuiyuanApp.kt#9igjgp");
        Object r39 = $composer2.rememberedValue();
        if (r39 != Composer.Companion.getEmpty()) goto L98;
        int r40 = 0;
        Iterator r212 = initialMessages.iterator();
        if (r212.hasNext() == true) goto L84;
        Long r41 = null;
    L92:
        Long r42 = r41;
        if (r42 == null) goto L95;
        long r43 = r42.longValue();
    L96:
        Object r44 = SnapshotLongStateKt.mutableLongStateOf(r43 + 1);
        $composer2.updateRememberedValue(r44);
        r39 = r44;
        goto L98
    L95:
        r43 = 0;
        goto L96
    L84:
        r41 = Long.valueOf(((ChatRecord) r212.next()).getId());
    L86:
        if (r212.hasNext() == false) goto L92;
        int r213 = r40;
        Long r45 = Long.valueOf(((ChatRecord) r212.next()).getId());
        if (r41.compareTo(r45) >= 0) goto L90;
        r41 = r45;
    L90:
        r40 = r213;
    L98:
        final MutableLongState nextId$delegate = (MutableLongState) r39;
        ComposerKt.sourceInformationMarkerEnd($composer2);
        ComposerKt.sourceInformationMarkerStart($composer2, -537048298, "CC(remember):HuiyuanApp.kt#9igjgp");
        Object r46 = $composer2.rememberedValue();
        if (r46 != Composer.Companion.getEmpty()) goto L102;
        Object r47 = SnapshotLongStateKt.mutableLongStateOf(0);
        $composer2.updateRememberedValue(r47);
        r46 = r47;
    L102:
        final MutableLongState conversationGeneration$delegate = (MutableLongState) r46;
        ComposerKt.sourceInformationMarkerEnd($composer2);
        ComposerKt.sourceInformationMarkerStart($composer2, -537046379, "CC(remember):HuiyuanApp.kt#9igjgp");
        Object r48 = $composer2.rememberedValue();
        if (r48 != Composer.Companion.getEmpty()) goto L106;
        Object r49 = SnapshotStateKt.mutableStateOf$default(false, null, 2, null);
        $composer2.updateRememberedValue(r49);
        r48 = r49;
    L106:
        final MutableState isGenerating$delegate = (MutableState) r48;
        ComposerKt.sourceInformationMarkerEnd($composer2);
        ComposerKt.sourceInformationMarkerStart($composer2, -537044262, "CC(remember):HuiyuanApp.kt#9igjgp");
        Object r50 = $composer2.rememberedValue();
        if (r50 != Composer.Companion.getEmpty()) goto L110;
        Object r113 = SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
        $composer2.updateRememberedValue(r113);
        r50 = r113;
    L110:
        final MutableState activeGenerationJob$delegate = (MutableState) r50;
        ComposerKt.sourceInformationMarkerEnd($composer2);
        ComposerKt.sourceInformationMarkerStart($composer2, -537042294, "CC(remember):HuiyuanApp.kt#9igjgp");
        Object r51 = $composer2.rememberedValue();
        if (r51 != Composer.Companion.getEmpty()) goto L114;
        Object r52 = SnapshotStateKt.mutableStateOf$default(repository.loadFavorites(), null, 2, null);
        $composer2.updateRememberedValue(r52);
        r51 = r52;
    L114:
        final MutableState favorites$delegate = (MutableState) r51;
        ComposerKt.sourceInformationMarkerEnd($composer2);
        ComposerKt.sourceInformationMarkerStart($composer2, -537039802, "CC(remember):HuiyuanApp.kt#9igjgp");
        Object r53 = $composer2.rememberedValue();
        if (r53 != Composer.Companion.getEmpty()) goto L118;
        Object r54 = SnapshotStateKt.mutableStateOf$default(repository.loadStats(), null, 2, null);
        $composer2.updateRememberedValue(r54);
        r53 = r54;
    L118:
        MutableState usageStats$delegate = (MutableState) r53;
        ComposerKt.sourceInformationMarkerEnd($composer2);
        Unit r55 = Unit.INSTANCE;
        ComposerKt.sourceInformationMarkerStart($composer2, -536831054, "CC(remember):HuiyuanApp.kt#9igjgp");
        boolean r56 = (($composer2.changedInstance(initialMessages) | $composer2.changed(selectedModel$delegate)) | $composer2.changedInstance(repository)) | $composer2.changedInstance(engine2);
        Object r57 = $composer2.rememberedValue();
        if (r56 == true) goto L124;
        MutableState usageStats$delegate2 = usageStats$delegate;
        if (r57 == Composer.Companion.getEmpty()) goto L125;
        AppRepository repository2 = repository;
        MutableState selectedModel$delegate2 = selectedModel$delegate;
        final HuiyuanEngine engine3 = engine2;
        SnapshotStateList timeline2 = timeline;
    L126:
        ComposerKt.sourceInformationMarkerEnd($composer2);
        EffectsKt.LaunchedEffect(r55, (Function2) r57, $composer2, 6);
        Object r58 = engine3.getLexicon();
        ComposerKt.sourceInformationMarkerStart($composer2, -536825260, "CC(remember):HuiyuanApp.kt#9igjgp");
        boolean r59 = $composer2.changed(r58);
        Object r60 = $composer2.rememberedValue();
        if (r59 == false) goto L129;
    L132:
        Object r61 = (LexiconEntry) engine3.getLexicon().get(UsageLogic.INSTANCE.dailyIndex(LocalDate.now().toEpochDay(), engine3.getLexicon().size()));
        $composer2.updateRememberedValue(r61);
        r60 = r61;
    L133:
        final LexiconEntry dailyQuote = (LexiconEntry) r60;
        ComposerKt.sourceInformationMarkerEnd($composer2);
        final MutableState selectedModel$delegate3 = selectedModel$delegate2;
        final SnapshotStateList timeline3 = timeline2;
        final AppRepository repository3 = repository2;
        final MutableState usageStats$delegate3 = usageStats$delegate2;
        CompositionLocalKt.CompositionLocalProvider(AppHapticsKt.getLocalAppHaptics().provides(haptics), ComposableLambdaKt.rememberComposableLambda(-771055725, true, new HuiyuanAppKt$$ExternalSyntheticLambda24(isLandscape, selectedModel$delegate3, repository3, timeline3, input$delegate, engine3, scope, selectedTab$delegate, haptics, chipRound$delegate, dailyQuote, isGenerating$delegate, favorites$delegate, nextId$delegate, usageStats$delegate3, conversationGeneration$delegate, activeGenerationJob$delegate), $composer2, 54), $composer2, ProvidedValue.$stable | 48);
        if (ComposerKt.isTraceInProgress() == false) goto L137;
        ComposerKt.traceEventEnd();
        goto L137
    L129:
        if (r60 != Composer.Companion.getEmpty()) goto L133;
    L125:
        timeline2 = timeline;
        repository2 = repository;
        selectedModel$delegate2 = selectedModel$delegate;
        engine3 = engine2;
        Object r114 = (Function2) new HuiyuanAppKt$HuiyuanApp$1$1(initialMessages, engine3, timeline2, nextId$delegate, selectedModel$delegate2, repository2, null);
        $composer2.updateRememberedValue(r114);
        r57 = r114;
        goto L126
    L124:
        usageStats$delegate2 = usageStats$delegate;
        goto L125
    L48:
        engine = guiguiEngine;
        goto L51
    L49:
        engine = piaoEngine;
        goto L51
    L50:
        engine = huiyuanEngine;
        goto L51
    L46:
        throw new NoWhenBranchMatchedException();
    L25:
        r18 = 0;
        goto L26
    L14:
        r6 = false;
        goto L15
    L5:
        r2 = false;
        goto L7
    }

    private static final AIModel HuiyuanApp$lambda$4(MutableState<AIModel> r4) {
        return r4.getValue();
    }

    private static final void HuiyuanApp$lambda$5(MutableState<AIModel> r5, AIModel r6) {
        r5.setValue(r6);
    }

    static final MutableState HuiyuanApp$lambda$3$lambda$2(AppRepository $repository) {
        Result.Companion r0 = Result.Companion;     // Catch: Throwable -> L4
        Object r1 = Result.m7425constructorimpl(AIModel.valueOf($repository.loadSelectedModel()));     // Catch: Throwable -> L4
    L6:
        AIModel r2 = AIModel.HUIYUAN;
        if (Result.m7431isFailureimpl(r1) == false) goto L10;
        r1 = r2;
    L10:
        return SnapshotStateKt.mutableStateOf$default(r1, null, 2, null);
    L4:
        th = move-exception;
        Result.Companion r3 = Result.Companion;
        r1 = Result.m7425constructorimpl(ResultKt.createFailure(th));
        goto L6
    }

    static final MutableState HuiyuanApp$lambda$15$lambda$14() {
        return SnapshotStateKt.mutableStateOf$default(AppTab.CHAT, null, 2, null);
    }

    private static final AppTab HuiyuanApp$lambda$16(MutableState<AppTab> r4) {
        return r4.getValue();
    }

    private static final void HuiyuanApp$lambda$17(MutableState<AppTab> r5, AppTab r6) {
        r5.setValue(r6);
    }

    static final MutableState HuiyuanApp$lambda$19$lambda$18() {
        return SnapshotStateKt.mutableStateOf$default("", null, 2, null);
    }

    private static final String HuiyuanApp$lambda$20(MutableState<String> r4) {
        return r4.getValue();
    }

    private static final void HuiyuanApp$lambda$21(MutableState<String> r5, String r6) {
        r5.setValue(r6);
    }

    static final MutableIntState HuiyuanApp$lambda$23$lambda$22() {
        return SnapshotIntStateKt.mutableIntStateOf(0);
    }

    private static final int HuiyuanApp$lambda$24(MutableIntState $chipRound$delegate) {
        return $chipRound$delegate.getIntValue();
    }

    private static final void HuiyuanApp$lambda$25(MutableIntState $chipRound$delegate, int r6) {
        $chipRound$delegate.setIntValue(r6);
    }

    private static final long HuiyuanApp$lambda$28(MutableLongState $nextId$delegate) {
        return $nextId$delegate.getLongValue();
    }

    private static final void HuiyuanApp$lambda$29(MutableLongState $nextId$delegate, long r7) {
        $nextId$delegate.setLongValue(r7);
    }

    private static final long HuiyuanApp$lambda$31(MutableLongState $conversationGeneration$delegate) {
        return $conversationGeneration$delegate.getLongValue();
    }

    private static final void HuiyuanApp$lambda$32(MutableLongState $conversationGeneration$delegate, long r7) {
        $conversationGeneration$delegate.setLongValue(r7);
    }

    private static final boolean HuiyuanApp$lambda$34(MutableState<Boolean> r4) {
        return r4.getValue().booleanValue();
    }

    private static final void HuiyuanApp$lambda$35(MutableState<Boolean> r5, boolean r6) {
        r5.setValue(Boolean.valueOf(r6));
    }

    private static final Job HuiyuanApp$lambda$37(MutableState<Job> r4) {
        return r4.getValue();
    }

    private static final void HuiyuanApp$lambda$38(MutableState<Job> r5, Job r6) {
        r5.setValue(r6);
    }

    private static final List<FavoriteRecord> HuiyuanApp$lambda$40(MutableState<List<FavoriteRecord>> r4) {
        return r4.getValue();
    }

    private static final void HuiyuanApp$lambda$41(MutableState<List<FavoriteRecord>> r5, List<FavoriteRecord> r6) {
        r5.setValue(r6);
    }

    private static final UsageStats HuiyuanApp$lambda$43(MutableState<UsageStats> r4) {
        return r4.getValue();
    }

    private static final void HuiyuanApp$lambda$44(MutableState<UsageStats> r5, UsageStats r6) {
        r5.setValue(r6);
    }

    private static final List<ChatRecord> HuiyuanApp$persistedMessages(SnapshotStateList<TimelineItem> r9) {
        Collection r2 = new ArrayList();
        Iterator<TimelineItem> r5 = r9.iterator();
    L4:
        if (r5.hasNext() == false) goto L8;
        TimelineItem r6 = r5.next();
        if ((r6 instanceof TimelineItem.Message) == false) goto L4;
        r2.add(r6);
        goto L4
    L8:
        Iterable r3 = (List) r2;
        Collection r1 = new ArrayList(CollectionsKt.collectionSizeOrDefault(r3, 10));
        Iterator r7 = r3.iterator();
    L10:
        if (r7.hasNext() == false) goto L13;
        r1.add(toChatRecord((TimelineItem.Message) r7.next()));
        goto L10
    L13:
        return (List) r1;
    }

    private static final void HuiyuanApp$persistConversation(AppRepository repository, SnapshotStateList<TimelineItem> r2) {
        repository.saveMessages(HuiyuanApp$persistedMessages(r2));
    }

    static /* synthetic */ void HuiyuanApp$appendMessage$default(SnapshotStateList r1, MutableLongState r2, MutableState r3, AppRepository r4, boolean r5, String r6, String r7, String r8, int r9, Object r10) {
        if ((r9 & 64) == 0) goto L6;
        r7 = null;
    L6:
        if ((r9 & 128) == 0) goto L8;
        r8 = null;
    L8:
        HuiyuanApp$appendMessage(r1, r2, r3, r4, r5, r6, r7, r8);
    }

    private static final void HuiyuanApp$appendMessage(SnapshotStateList<TimelineItem> r16, MutableLongState nextId$delegate, MutableState<AIModel> r18, AppRepository repository, boolean isUser, String text, String tag, String sourceQuote) {
        long r3 = HuiyuanApp$lambda$28(nextId$delegate);
        HuiyuanApp$lambda$29(nextId$delegate, 1 + r3);
        r16.add(new TimelineItem.Message(r3, isUser, text, tag, sourceQuote, 0, false, HuiyuanApp$lambda$4(r18), 96, null));
        HuiyuanApp$persistConversation(repository, r16);
    }

    private static final void HuiyuanApp$runThinking(SnapshotStateList<TimelineItem> r22, CoroutineScope scope, MutableLongState conversationGeneration$delegate, MutableLongState nextId$delegate, MutableState<Job> r26, MutableState<AIModel> r27, MutableState<Boolean> r28, AppHaptics haptics, MutableState<AppTab> r30, AppRepository repository, ReplyResult result, List<String> r33) {
        HuiyuanApp$lambda$32(conversationGeneration$delegate, HuiyuanApp$lambda$31(conversationGeneration$delegate) + 1);
        long generation = HuiyuanApp$lambda$31(conversationGeneration$delegate);
        long thinkId = HuiyuanApp$lambda$28(nextId$delegate);
        HuiyuanApp$lambda$29(nextId$delegate, 1 + thinkId);
        Job r1 = HuiyuanApp$lambda$37(r26);
        if (r1 == null) goto L5;
        Job.DefaultImpls.cancel$default(r1, null, 1, null);
    L5:
        AIModel generationModel = HuiyuanApp$lambda$4(r27);
        r22.add(new TimelineItem.ThinkLog(thinkId, CollectionsKt.emptyList(), generationModel));
        HuiyuanApp$lambda$35(r28, true);
        HuiyuanApp$lambda$38(r26, BuildersKt.launch$default(scope, null, null, new HuiyuanAppKt$HuiyuanApp$runThinking$1(r33, generation, r22, result, generationModel, scope, haptics, conversationGeneration$delegate, thinkId, nextId$delegate, r30, repository, r28, r26, null), 3, null));
    }

    private static final void HuiyuanApp$cancelActiveGeneration(SnapshotStateList<TimelineItem> r25, MutableLongState conversationGeneration$delegate, MutableState<Job> r27, MutableState<Boolean> r28, AppRepository repository, final boolean keepPartialResponse) {
        HuiyuanApp$lambda$32(conversationGeneration$delegate, HuiyuanApp$lambda$31(conversationGeneration$delegate) + 1);
        Job r2 = HuiyuanApp$lambda$37(r27);
        if (r2 == null) goto L5;
        Job.DefaultImpls.cancel$default(r2, null, 1, null);
    L5:
        HuiyuanApp$lambda$38(r27, null);
        CollectionsKt.removeAll(r25, new HuiyuanAppKt$$ExternalSyntheticLambda18());
        if (keepPartialResponse == false) goto L19;
        Iterator<Integer> r6 = CollectionsKt.getIndices(r25).iterator();
    L9:
        if (r6.hasNext() == false) goto L19;
        int r7 = ((IntIterator) r6).nextInt();
        TimelineItem r10 = r25.get(r7);
        if ((r10 instanceof TimelineItem.Message) == false) goto L9;
        if (((TimelineItem.Message) r10).isStreaming() == false) goto L9;
        if (StringsKt.isBlank(((TimelineItem.Message) r10).getText()) == true) goto L9;
        r25.set(r7, TimelineItem.Message.copy$default((TimelineItem.Message) r10, 0, false, null, null, null, 0, false, null, 191, null));
    L19:
        CollectionsKt.removeAll(r25, new HuiyuanAppKt$$ExternalSyntheticLambda19(keepPartialResponse));
        HuiyuanApp$lambda$35(r28, false);
        if (keepPartialResponse == false) goto L23;
        HuiyuanApp$persistConversation(repository, r25);
        return;
    }

    static final boolean HuiyuanApp$cancelActiveGeneration$lambda$46(TimelineItem it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return it instanceof TimelineItem.ThinkLog;
    }

    static final boolean HuiyuanApp$cancelActiveGeneration$lambda$48(boolean $keepPartialResponse, TimelineItem it) {
        Intrinsics.checkNotNullParameter(it, "it");
        if ((it instanceof TimelineItem.Message) == true) goto L5;
    L10:
        return false;
    L5:
        if (((TimelineItem.Message) it).isStreaming() == false) goto L10;
        if ($keepPartialResponse == true) goto L8;
    L9:
        return true;
    L8:
        if (StringsKt.isBlank(((TimelineItem.Message) it).getText()) == false) goto L10;
        goto L9
    }

    private static final void HuiyuanApp$submit(HuiyuanEngine engine, AppRepository repository, MutableState<Boolean> r27, SnapshotStateList<TimelineItem> r28, MutableLongState nextId$delegate, MutableState<AIModel> r30, MutableState<String> r31, MutableState<UsageStats> r32, CoroutineScope scope, MutableLongState conversationGeneration$delegate, MutableState<Job> r35, AppHaptics haptics, MutableState<AppTab> r37, String text) {
        String clean = StringsKt.trim(text).toString();
        if (clean.length() != 0) goto L5;
        boolean r1 = true;
    L6:
        if (r1 == true) goto L13;
        if (HuiyuanApp$lambda$34(r27) == true) goto L14;
        HuiyuanApp$appendMessage$default(r28, nextId$delegate, r30, repository, true, clean, null, null, 192, null);
        HuiyuanApp$lambda$21(r31, "");
        ReplyResult result = engine.analyze(clean);
        HuiyuanApp$lambda$44(r32, repository.recordInteraction(result.getTag(), false));
        HuiyuanApp$runThinking(r28, scope, conversationGeneration$delegate, nextId$delegate, r35, r30, r27, haptics, r37, repository, result, engine.buildThinkSteps(result));
        return;
    L14:
        return;
    L13:
        return;
    L5:
        r1 = false;
        goto L6
    }

    private static final void HuiyuanApp$randomOne(HuiyuanEngine engine, AppRepository repository, MutableState<Boolean> r16, MutableState<UsageStats> r17, SnapshotStateList<TimelineItem> r18, CoroutineScope scope, MutableLongState conversationGeneration$delegate, MutableLongState nextId$delegate, MutableState<Job> r22, MutableState<AIModel> r23, AppHaptics haptics, MutableState<AppTab> r25) {
        if (HuiyuanApp$lambda$34(r16) == false) goto L5;
        return;
    L5:
        ReplyResult result = engine.randomOne();
        HuiyuanApp$lambda$44(r17, repository.recordInteraction(result.getTag(), true));
        HuiyuanApp$runThinking(r18, scope, conversationGeneration$delegate, nextId$delegate, r22, r23, r16, haptics, r25, repository, result, engine.randomThinkSteps());
    }

    private static final void HuiyuanApp$toggleFavorite(AppRepository repository, MutableState<List<FavoriteRecord>> r11, String text, String category) {
        Iterable r0 = HuiyuanApp$lambda$40(r11);
        boolean r3 = false;
        if ((r0 instanceof Collection) == true) goto L5;
    L7:
        Iterator r2 = r0.iterator();
    L9:
        if (r2.hasNext() == false) goto L14;
        if (Intrinsics.areEqual(((FavoriteRecord) r2.next()).getText(), text) == false) goto L9;
        r3 = true;
    L14:
        if (r3 == false) goto L22;
        Iterable r1 = HuiyuanApp$lambda$40(r11);
        Collection r4 = new ArrayList();
        Iterator r5 = r1.iterator();
    L17:
        if (r5.hasNext() == false) goto L21;
        Object r6 = r5.next();
        if (Intrinsics.areEqual(((FavoriteRecord) r6).getText(), text) == true) goto L17;
        r4.add(r6);
        goto L17
    L21:
        List r7 = (List) r4;
    L23:
        HuiyuanApp$lambda$41(r11, r7);
        repository.saveFavorites(HuiyuanApp$lambda$40(r11));
        return;
    L22:
        r7 = CollectionsKt.plus(CollectionsKt.listOf(new FavoriteRecord(text, category, System.currentTimeMillis())), HuiyuanApp$lambda$40(r11));
        goto L23
    L5:
        if (((Collection) r0).isEmpty() == false) goto L7;
        goto L7
    }

    private static final void HuiyuanApp$resetConversation(SnapshotStateList<TimelineItem> r16, AppRepository repository, HuiyuanEngine engine, MutableLongState conversationGeneration$delegate, MutableState<Job> r20, MutableState<Boolean> r21, MutableLongState nextId$delegate, MutableState<AIModel> r23) {
        HuiyuanApp$cancelActiveGeneration(r16, conversationGeneration$delegate, r20, r21, repository, false);
        r16.clear();
        repository.clearMessages();
        HuiyuanApp$appendMessage$default(r16, nextId$delegate, r23, repository, false, engine.getGreeting(), "问候", null, 128, null);
    }

    private static final void HuiyuanApp$resetEverything(AppRepository repository, SnapshotStateList<TimelineItem> r17, HuiyuanEngine engine, MutableLongState conversationGeneration$delegate, MutableState<Job> r20, MutableState<Boolean> r21, MutableState<List<FavoriteRecord>> r22, MutableState<UsageStats> r23, MutableState<AIModel> r24, MutableLongState nextId$delegate, MutableState<AppTab> r26) {
        HuiyuanApp$cancelActiveGeneration(r17, conversationGeneration$delegate, r20, r21, repository, false);
        repository.clearEverything();
        r17.clear();
        HuiyuanApp$lambda$41(r22, CollectionsKt.emptyList());
        HuiyuanApp$lambda$44(r23, new UsageStats(0, 0, 0, null, null, 31, null));
        HuiyuanApp$lambda$5(r24, AIModel.HUIYUAN);
        repository.saveSelectedModel("HUIYUAN");
        HuiyuanApp$appendMessage$default(r17, nextId$delegate, r24, repository, false, engine.getGreeting(), "问候", null, 128, null);
        HuiyuanApp$lambda$17(r26, AppTab.CHAT);
    }

    static final Unit HuiyuanApp$lambda$95(final boolean $isLandscape, final MutableState $selectedModel$delegate, final AppRepository $repository, final SnapshotStateList $timeline, final MutableState $input$delegate, final HuiyuanEngine $engine, final CoroutineScope $scope, final MutableState $selectedTab$delegate, final AppHaptics $haptics, final MutableIntState $chipRound$delegate, final LexiconEntry $dailyQuote, final MutableState $isGenerating$delegate, final MutableState $favorites$delegate, final MutableLongState $nextId$delegate, final MutableState $usageStats$delegate, final MutableLongState $conversationGeneration$delegate, final MutableState $activeGenerationJob$delegate, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C318@12357L4936,318@12299L4994:HuiyuanApp.kt#cyjvf");
        if (($changed & 3) == 2) goto L5;
        boolean r0 = true;
    L7:
        if ($composer.shouldExecute(r0, $changed & 1) == true) goto L9;
        $composer.skipToGroupEnd();
    L16:
        return Unit.INSTANCE;
    L9:
        if (ComposerKt.isTraceInProgress() == false) goto L11;
        ComposerKt.traceEventStart(-771055725, $changed, -1, "com.luchime.huiyuan.ui.HuiyuanApp.<anonymous> (HuiyuanApp.kt:318)");
    L11:
        SurfaceKt.m2670SurfaceT9BRK9s(SizeKt.fillMaxSize$default(Modifier.Companion, 0.0f, 1, null), null, HuiyuanDesignKt.getPaper(), 0, 0.0f, 0.0f, null, ComposableLambdaKt.rememberComposableLambda(763439256, true, new HuiyuanAppKt$$ExternalSyntheticLambda17($isLandscape, $selectedModel$delegate, $repository, $timeline, $input$delegate, $engine, $scope, $selectedTab$delegate, $haptics, $chipRound$delegate, $dailyQuote, $isGenerating$delegate, $favorites$delegate, $nextId$delegate, $usageStats$delegate, $conversationGeneration$delegate, $activeGenerationJob$delegate), $composer, 54), $composer, 12583302, 122);
        if (ComposerKt.isTraceInProgress() == false) goto L16;
        ComposerKt.traceEventEnd();
        goto L16
    L5:
        r0 = false;
        goto L7
    }

    static final Unit HuiyuanApp$lambda$95$lambda$94(final boolean $isLandscape, final MutableState $selectedModel$delegate, final AppRepository $repository, final SnapshotStateList $timeline, final MutableState $input$delegate, final HuiyuanEngine $engine, final CoroutineScope $scope, final MutableState $selectedTab$delegate, final AppHaptics $haptics, final MutableIntState $chipRound$delegate, final LexiconEntry $dailyQuote, final MutableState $isGenerating$delegate, final MutableState $favorites$delegate, final MutableLongState $nextId$delegate, final MutableState $usageStats$delegate, final MutableLongState $conversationGeneration$delegate, final MutableState $activeGenerationJob$delegate, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C319@12415L4170:HuiyuanApp.kt#cyjvf");
        if (($changed & 3) == 2) goto L5;
        boolean r2 = true;
    L7:
        if ($composer.shouldExecute(r2, $changed & 1) == true) goto L9;
        $composer.skipToGroupEnd();
    L95:
        return Unit.INSTANCE;
    L9:
        if (ComposerKt.isTraceInProgress() == false) goto L11;
        ComposerKt.traceEventStart(763439256, $changed, -1, "com.luchime.huiyuan.ui.HuiyuanApp.<anonymous>.<anonymous> (HuiyuanApp.kt:319)");
    L11:
        Function2 screenContent = ComposableLambdaKt.rememberComposableLambda(-1728698291, true, new HuiyuanAppKt$$ExternalSyntheticLambda2($selectedModel$delegate, $repository, $timeline, $isLandscape, $input$delegate, $engine, $scope, $selectedTab$delegate, $haptics, $chipRound$delegate, $dailyQuote, $isGenerating$delegate, $favorites$delegate, $nextId$delegate, $usageStats$delegate, $conversationGeneration$delegate, $activeGenerationJob$delegate), $composer, 54);
        if ($isLandscape == false) goto L52;
        $composer.startReplaceGroup(1771278274);
        ComposerKt.sourceInformation($composer, "409@16634L296");
        Modifier r4 = SizeKt.fillMaxSize$default(Modifier.Companion, 0.0f, 1, null);
        ComposerKt.sourceInformationMarkerStart($composer, 693286680, "CC(Row)P(2,1,3)99@5124L58,100@5187L130:Row.kt#2w3rfo");
        MeasurePolicy r12 = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), Alignment.Companion.getTop(), $composer, ((6 >> 3) & 14) | ((6 >> 3) & 112));
        ComposerKt.sourceInformationMarkerStart($composer, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
        int r19 = ComposablesKt.getCurrentCompositeKeyHash($composer, 0);
        CompositionLocalMap r14 = $composer.getCurrentCompositionLocalMap();
        Modifier r3 = ComposedModifierKt.materializeModifier($composer, r4);
        Function0<ComposeUiNode> r27 = ComposeUiNode.Companion.getConstructor();
        int r5 = ((((6 << 3) & 112) << 6) & 896) | 6;
        ComposerKt.sourceInformationMarkerStart($composer, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
        if (($composer.getApplier() instanceof Applier) == true) goto L16;
        ComposablesKt.invalidApplier();
    L16:
        $composer.startReusableNode();
        if ($composer.getInserting() == false) goto L19;
        Function0<ComposeUiNode> r6 = r27;
        $composer.createNode(r6);
    L20:
        Composer r7 = Updater.m3808constructorimpl($composer);
        Updater.m3815setimpl(r7, r12, ComposeUiNode.Companion.getSetMeasurePolicy());
        Updater.m3815setimpl(r7, r14, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> r8 = ComposeUiNode.Companion.getSetCompositeKeyHash();
        if (r7.getInserting() == true) goto L26;
        int r36 = 6;
        Composer r37 = $composer;
        if (Intrinsics.areEqual(r7.rememberedValue(), Integer.valueOf(r19)) == true) goto L28;
    L27:
        r7.updateRememberedValue(Integer.valueOf(r19));
        r7.apply(Integer.valueOf(r19), r8);
    L28:
        Updater.m3815setimpl(r7, r3, ComposeUiNode.Companion.getSetModifier());
        int r9 = (r5 >> 6) & 14;
        Composer r10 = r37;
        ComposerKt.sourceInformationMarkerStart(r10, -407735110, "C101@5232L9:Row.kt#2w3rfo");
        int r11 = ((r36 >> 6) & 112) | 6;
        RowScope r38 = RowScopeInstance.INSTANCE;
        ComposerKt.sourceInformationMarkerStart(r10, -64606253, "C412@16794L20,410@16695L141,414@16857L55:HuiyuanApp.kt#cyjvf");
        AppTab r13 = HuiyuanApp$lambda$16($selectedTab$delegate);
        ComposerKt.sourceInformationMarkerStart(r10, 829202891, "CC(remember):HuiyuanApp.kt#9igjgp");
        boolean r15 = r10.changed($selectedTab$delegate);
        Object r16 = r10.rememberedValue();
        if (r15 == true) goto L35;
        if (r16 == Composer.Companion.getEmpty()) goto L35;
    L36:
        ComposerKt.sourceInformationMarkerEnd(r10);
        SideNavigation(r13, (Function1) r16, r10, 0);
        Modifier r17 = RowScope.weight$default(r38, Modifier.Companion, 1.0f, false, 2, null);
        ComposerKt.sourceInformationMarkerStart(r10, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
        MeasurePolicy r18 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.getTopStart(), false);
        ComposerKt.sourceInformationMarkerStart(r10, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
        int r20 = ComposablesKt.getCurrentCompositeKeyHash(r10, 0);
        CompositionLocalMap r110 = r10.getCurrentCompositionLocalMap();
        Modifier r21 = ComposedModifierKt.materializeModifier(r10, r17);
        Function0<ComposeUiNode> r41 = ComposeUiNode.Companion.getConstructor();
        int r22 = ((((0 << 3) & 112) << 6) & 896) | 6;
        ComposerKt.sourceInformationMarkerStart(r10, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
        if ((r10.getApplier() instanceof Applier) == true) goto L39;
        ComposablesKt.invalidApplier();
    L39:
        r10.startReusableNode();
        if (r10.getInserting() == false) goto L42;
        Function0<ComposeUiNode> r23 = r41;
        r10.createNode(r23);
    L43:
        Composer r111 = Updater.m3808constructorimpl(r10);
        Updater.m3815setimpl(r111, r18, ComposeUiNode.Companion.getSetMeasurePolicy());
        Updater.m3815setimpl(r111, r110, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> r24 = ComposeUiNode.Companion.getSetCompositeKeyHash();
        if (r111.getInserting() == true) goto L50;
        if (Intrinsics.areEqual(r111.rememberedValue(), Integer.valueOf(r20)) == false) goto L50;
    L51:
        Updater.m3815setimpl(r111, r21, ComposeUiNode.Companion.getSetModifier());
        int r25 = (r22 >> 6) & 14;
        ComposerKt.sourceInformationMarkerStart(r10, -2146730711, "C72@3468L9:Box.kt#2w3rfo");
        BoxScopeInstance r1 = BoxScopeInstance.INSTANCE;
        int r112 = ((0 >> 6) & 112) | 6;
        ComposerKt.sourceInformationMarkerStart(r10, 1350179351, "C414@16895L15:HuiyuanApp.kt#cyjvf");
        screenContent.invoke(r10, 6);
        ComposerKt.sourceInformationMarkerEnd(r10);
        ComposerKt.sourceInformationMarkerEnd(r10);
        r10.endNode();
        ComposerKt.sourceInformationMarkerEnd(r10);
        ComposerKt.sourceInformationMarkerEnd(r10);
        ComposerKt.sourceInformationMarkerEnd(r10);
        ComposerKt.sourceInformationMarkerEnd(r10);
        ComposerKt.sourceInformationMarkerEnd(r10);
        r37.endNode();
        ComposerKt.sourceInformationMarkerEnd(r37);
        ComposerKt.sourceInformationMarkerEnd(r37);
        ComposerKt.sourceInformationMarkerEnd(r37);
        $composer.endReplaceGroup();
    L91:
        if (ComposerKt.isTraceInProgress() == false) goto L95;
        ComposerKt.traceEventEnd();
    L50:
        r111.updateRememberedValue(Integer.valueOf(r20));
        r111.apply(Integer.valueOf(r20), r24);
        goto L51
    L42:
        r23 = r41;
        r10.useNode();
    L35:
        r16 = new HuiyuanAppKt$$ExternalSyntheticLambda3($selectedTab$delegate);
        r10.updateRememberedValue(r16);
        goto L36
    L26:
        r36 = 6;
        r37 = $composer;
        goto L27
    L19:
        r6 = r27;
        $composer.useNode();
        goto L20
    L52:
        $composer.startReplaceGroup(1771609757);
        ComposerKt.sourceInformation($composer, "417@16968L301");
        Modifier r26 = SizeKt.fillMaxSize$default(Modifier.Companion, 0.0f, 1, null);
        ComposerKt.sourceInformationMarkerStart($composer, -483455358, "CC(Column)P(2,3,1)87@4442L61,88@4508L133:Column.kt#2w3rfo");
        MeasurePolicy r113 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.Companion.getStart(), $composer, ((6 >> 3) & 14) | ((6 >> 3) & 112));
        ComposerKt.sourceInformationMarkerStart($composer, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
        int r28 = ComposablesKt.getCurrentCompositeKeyHash($composer, 0);
        CompositionLocalMap r29 = $composer.getCurrentCompositionLocalMap();
        Modifier r30 = ComposedModifierKt.materializeModifier($composer, r26);
        Function0<ComposeUiNode> r210 = ComposeUiNode.Companion.getConstructor();
        int r31 = ((((6 << 3) & 112) << 6) & 896) | 6;
        ComposerKt.sourceInformationMarkerStart($composer, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
        if (($composer.getApplier() instanceof Applier) == true) goto L55;
        ComposablesKt.invalidApplier();
    L55:
        $composer.startReusableNode();
        if ($composer.getInserting() == false) goto L58;
        Function0<ComposeUiNode> r32 = r210;
        $composer.createNode(r32);
    L59:
        Composer r33 = Updater.m3808constructorimpl($composer);
        Updater.m3815setimpl(r33, r113, ComposeUiNode.Companion.getSetMeasurePolicy());
        Updater.m3815setimpl(r33, r29, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> r34 = ComposeUiNode.Companion.getSetCompositeKeyHash();
        if (r33.getInserting() == true) goto L66;
        if (Intrinsics.areEqual(r33.rememberedValue(), Integer.valueOf(r28)) == false) goto L66;
    L67:
        Updater.m3815setimpl(r33, r30, ComposeUiNode.Companion.getSetModifier());
        int r35 = (r31 >> 6) & 14;
        ComposerKt.sourceInformationMarkerStart($composer, -384672921, "C89@4556L9:Column.kt#2w3rfo");
        int r39 = ((6 >> 6) & 112) | 6;
        ColumnScope r310 = ColumnScopeInstance.INSTANCE;
        ComposerKt.sourceInformationMarkerStart($composer, 766161622, "C418@17032L55,421@17209L20,419@17108L143:HuiyuanApp.kt#cyjvf");
        Modifier r40 = ColumnScope.weight$default(r310, Modifier.Companion, 1.0f, false, 2, null);
        ComposerKt.sourceInformationMarkerStart($composer, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
        MeasurePolicy r42 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.getTopStart(), false);
        ComposerKt.sourceInformationMarkerStart($composer, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
        int r114 = ComposablesKt.getCurrentCompositeKeyHash($composer, 0);
        CompositionLocalMap r43 = $composer.getCurrentCompositionLocalMap();
        Modifier r44 = ComposedModifierKt.materializeModifier($composer, r40);
        Function0<ComposeUiNode> r45 = ComposeUiNode.Companion.getConstructor();
        int r46 = ((((0 << 3) & 112) << 6) & 896) | 6;
        ComposerKt.sourceInformationMarkerStart($composer, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
        if (($composer.getApplier() instanceof Applier) == true) goto L70;
        ComposablesKt.invalidApplier();
    L70:
        $composer.startReusableNode();
        if ($composer.getInserting() == false) goto L73;
        Function0<ComposeUiNode> r47 = r45;
        $composer.createNode(r47);
    L74:
        Composer r115 = Updater.m3808constructorimpl($composer);
        Updater.m3815setimpl(r115, r42, ComposeUiNode.Companion.getSetMeasurePolicy());
        Updater.m3815setimpl(r115, r43, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> r48 = ComposeUiNode.Companion.getSetCompositeKeyHash();
        if (r115.getInserting() == true) goto L81;
        if (Intrinsics.areEqual(r115.rememberedValue(), Integer.valueOf(r114)) == false) goto L81;
    L82:
        Updater.m3815setimpl(r115, r44, ComposeUiNode.Companion.getSetModifier());
        int r49 = (r46 >> 6) & 14;
        ComposerKt.sourceInformationMarkerStart($composer, -2146730711, "C72@3468L9:Box.kt#2w3rfo");
        BoxScopeInstance r50 = BoxScopeInstance.INSTANCE;
        int r116 = ((0 >> 6) & 112) | 6;
        ComposerKt.sourceInformationMarkerStart($composer, -1568149540, "C418@17070L15:HuiyuanApp.kt#cyjvf");
        screenContent.invoke($composer, 6);
        ComposerKt.sourceInformationMarkerEnd($composer);
        ComposerKt.sourceInformationMarkerEnd($composer);
        $composer.endNode();
        ComposerKt.sourceInformationMarkerEnd($composer);
        ComposerKt.sourceInformationMarkerEnd($composer);
        ComposerKt.sourceInformationMarkerEnd($composer);
        AppTab r51 = HuiyuanApp$lambda$16($selectedTab$delegate);
        ComposerKt.sourceInformationMarkerStart($composer, -2053489626, "CC(remember):HuiyuanApp.kt#9igjgp");
        boolean r52 = $composer.changed($selectedTab$delegate);
        Object r53 = $composer.rememberedValue();
        if (r52 == false) goto L85;
    L88:
        Object r117 = new HuiyuanAppKt$$ExternalSyntheticLambda4($selectedTab$delegate);
        $composer.updateRememberedValue(r117);
        r53 = r117;
    L89:
        ComposerKt.sourceInformationMarkerEnd($composer);
        BottomNavigation(r51, (Function1) r53, $composer, 0);
        ComposerKt.sourceInformationMarkerEnd($composer);
        ComposerKt.sourceInformationMarkerEnd($composer);
        $composer.endNode();
        ComposerKt.sourceInformationMarkerEnd($composer);
        ComposerKt.sourceInformationMarkerEnd($composer);
        ComposerKt.sourceInformationMarkerEnd($composer);
        $composer.endReplaceGroup();
        goto L91
    L85:
        if (r53 != Composer.Companion.getEmpty()) goto L89;
    L81:
        r115.updateRememberedValue(Integer.valueOf(r114));
        r115.apply(Integer.valueOf(r114), r48);
        goto L82
    L73:
        r47 = r45;
        $composer.useNode();
    L66:
        r33.updateRememberedValue(Integer.valueOf(r28));
        r33.apply(Integer.valueOf(r28), r34);
        goto L67
    L58:
        r32 = r210;
        $composer.useNode();
        goto L59
    L5:
        r2 = false;
        goto L7
    }

    static final Unit HuiyuanApp$lambda$95$lambda$94$lambda$85(MutableState $selectedModel$delegate, AppRepository $repository, final SnapshotStateList $timeline, boolean $isLandscape, MutableState $input$delegate, HuiyuanEngine $engine, CoroutineScope $scope, final MutableState $selectedTab$delegate, final AppHaptics $haptics, final MutableIntState $chipRound$delegate, final LexiconEntry $dailyQuote, final MutableState $isGenerating$delegate, MutableState $favorites$delegate, final MutableLongState $nextId$delegate, final MutableState $usageStats$delegate, final MutableLongState $conversationGeneration$delegate, final MutableState $activeGenerationJob$delegate, Composer $composer, int $changed) {
        final MutableState r9 = $selectedModel$delegate;
        final AppRepository r2 = $repository;
        final MutableState r10 = $input$delegate;
        final HuiyuanEngine r1 = $engine;
        final CoroutineScope r12 = $scope;
        ComposerKt.sourceInformation($composer, "C:HuiyuanApp.kt#cyjvf");
        if (($changed & 3) == 2) goto L5;
        boolean r4 = true;
    L7:
        if ($composer.shouldExecute(r4, $changed & 1) == true) goto L9;
        $composer.skipToGroupEnd();
    L178:
        return Unit.INSTANCE;
    L9:
        if (ComposerKt.isTraceInProgress() == false) goto L12;
        ComposerKt.traceEventStart(-1728698291, $changed, -1, "com.luchime.huiyuan.ui.HuiyuanApp.<anonymous>.<anonymous>.<anonymous> (HuiyuanApp.kt:320)");
    L12:
        switch(WhenMappings.$EnumSwitchMapping$1[HuiyuanApp$lambda$16($selectedTab$delegate).ordinal()]) {
            case 1: goto L104;
            case 2: goto L89;
            case 3: goto L70;
            case 4: goto L48;
            case 5: goto L15;
            default: goto L13;
        };
    L13:
        $composer.startReplaceGroup(873290615);
        $composer.endReplaceGroup();
        throw new NoWhenBranchMatchedException();
    L15:
        $composer.startReplaceGroup(873383008);
        ComposerKt.sourceInformation($composer, "396@16162L306,403@16514L17,384@15414L1139");
        UsageStats r16 = HuiyuanApp$lambda$43($usageStats$delegate);
        String r17 = HuiyuanApp$lambda$4(r9).getAskName();
        SnapshotStateList r5 = $timeline;
        if ((r5 instanceof Collection) == true) goto L18;
    L20:
        int r8 = 0;
        Iterator r11 = r5.iterator();
    L22:
        if (r11.hasNext() == false) goto L28;
        if ((((TimelineItem) r11.next()) instanceof TimelineItem.Message) == false) goto L22;
        r8 = r8 + 1;
        if (r8 >= 0) goto L22;
        CollectionsKt.throwCountOverflow();
        goto L22
    L28:
        int r18 = r8;
    L29:
        int r20 = HuiyuanApp$lambda$40($favorites$delegate).size();
        int r21 = r1.getLexicon().size();
        int r22 = r1.getDimensionCount();
        Integer r6 = (Integer) CollectionsKt.minOrNull(r1.getCategoryCounts().values());
        if (r6 == null) goto L32;
        int r23 = r6.intValue();
    L33:
        AIModel r25 = HuiyuanApp$lambda$4(r9);
        String r26 = toExportText(HuiyuanApp$persistedMessages($timeline));
        ComposerKt.sourceInformationMarkerStart($composer, 873406111, "CC(remember):HuiyuanApp.kt#9igjgp");
        boolean r24 = (((((($composer.changedInstance(r2) | $composer.changed($selectedTab$delegate)) | $composer.changed(r9)) | $composer.changed(r10)) | $composer.changedInstance(r1)) | $composer.changedInstance(r12)) | $composer.changedInstance($haptics)) | $composer.changedInstance($dailyQuote);
        Object r7 = $composer.rememberedValue();
        if (r24 == false) goto L36;
    L39:
        Function0 r0 = new HuiyuanAppKt$$ExternalSyntheticLambda6($dailyQuote, $isGenerating$delegate, $timeline, $conversationGeneration$delegate, $activeGenerationJob$delegate, r2, $selectedTab$delegate, r1, $nextId$delegate, r9, r10, $usageStats$delegate, r12, $haptics);
        r2 = r2;
        MutableState r13 = $selectedTab$delegate;
        r1 = r1;
        r9 = r9;
        r7 = r0;
        $composer.updateRememberedValue(r7);
    L40:
        Function0 r27 = (Function0) r7;
        ComposerKt.sourceInformationMarkerEnd($composer);
        ComposerKt.sourceInformationMarkerStart($composer, 873417086, "CC(remember):HuiyuanApp.kt#9igjgp");
        boolean r28 = (($composer.changedInstance(r2) | $composer.changed(r9)) | $composer.changedInstance(r1)) | $composer.changed(r13);
        HuiyuanAppKt$HuiyuanApp$2$1$screenContent$1$21$1 r3 = $composer.rememberedValue();
        if (r28 == false) goto L43;
    L46:
        HuiyuanEngine r14 = r1;
        MutableState r15 = $favorites$delegate;
        r3 = new HuiyuanAppKt$HuiyuanApp$2$1$screenContent$1$21$1(r2, $timeline, r14, $conversationGeneration$delegate, $activeGenerationJob$delegate, $isGenerating$delegate, $favorites$delegate, $usageStats$delegate, r9, $nextId$delegate, r13);
        $composer.updateRememberedValue(r3);
    L47:
        ComposerKt.sourceInformationMarkerEnd($composer);
        ProfileScreenKt.ProfileScreen(r16, r17, r18, r20, r21, r22, r23, $isLandscape, $dailyQuote, r25, r26, r27, (Function0) ((KFunction) r3), $composer, 0, 0);
        $composer.endReplaceGroup();
        Unit r19 = Unit.INSTANCE;
    L174:
        if (ComposerKt.isTraceInProgress() == false) goto L178;
        ComposerKt.traceEventEnd();
        goto L178
    L43:
        if (r3 == Composer.Companion.getEmpty()) goto L46;
        r15 = $favorites$delegate;
        goto L47
    L36:
        if (r7 == Composer.Companion.getEmpty()) goto L39;
        r13 = $selectedTab$delegate;
        goto L40
    L32:
        r23 = 0;
        goto L33
    L18:
        if (r5.isEmpty() == false) goto L20;
        r18 = 0;
        goto L29
    L48:
        $composer.startReplaceGroup(873362144);
        ComposerKt.sourceInformation($composer, "373@14937L16,374@14987L295,381@15320L32,370@14779L595");
        List<FavoriteRecord> r110 = HuiyuanApp$lambda$40($favorites$delegate);
        ComposerKt.sourceInformationMarkerStart($composer, 873366621, "CC(remember):HuiyuanApp.kt#9igjgp");
        boolean r29 = $composer.changedInstance(r2);
        Object r30 = $composer.rememberedValue();
        if (r29 == false) goto L51;
    L54:
        Object r31 = (KFunction) new HuiyuanAppKt$HuiyuanApp$2$1$screenContent$1$16$1(r2, $favorites$delegate);
        $composer.updateRememberedValue(r31);
        r30 = r31;
    L55:
        ComposerKt.sourceInformationMarkerEnd($composer);
        Function2 r111 = (Function2) ((KFunction) r30);
        ComposerKt.sourceInformationMarkerStart($composer, 873368500, "CC(remember):HuiyuanApp.kt#9igjgp");
        boolean r112 = ((((($composer.changedInstance(r2) | $composer.changed($selectedTab$delegate)) | $composer.changed(r9)) | $composer.changed(r10)) | $composer.changedInstance(r1)) | $composer.changedInstance(r12)) | $composer.changedInstance($haptics);
        Object r32 = $composer.rememberedValue();
        if (r112 == false) goto L58;
    L61:
        r32 = new HuiyuanAppKt$$ExternalSyntheticLambda14($isGenerating$delegate, $timeline, $conversationGeneration$delegate, $activeGenerationJob$delegate, r2, $selectedTab$delegate, r1, $nextId$delegate, r9, r10, $usageStats$delegate, r12, $haptics);
        $composer.updateRememberedValue(r32);
    L62:
        Function1 r33 = (Function1) r32;
        ComposerKt.sourceInformationMarkerEnd($composer);
        ComposerKt.sourceInformationMarkerStart($composer, 873378893, "CC(remember):HuiyuanApp.kt#9igjgp");
        boolean r34 = $composer.changed(r6);
        Object r35 = $composer.rememberedValue();
        if (r34 == false) goto L65;
    L68:
        Object r113 = new HuiyuanAppKt$$ExternalSyntheticLambda15($selectedTab$delegate);
        $composer.updateRememberedValue(r113);
        r35 = r113;
    L69:
        ComposerKt.sourceInformationMarkerEnd($composer);
        KnowledgeScreensKt.FavoritesScreen(r110, $isLandscape, r111, r33, (Function0) r35, $composer, 0);
        $composer.endReplaceGroup();
        Unit r36 = Unit.INSTANCE;
        goto L174
    L65:
        if (r35 != Composer.Companion.getEmpty()) goto L69;
    L58:
        if (r32 != Composer.Companion.getEmpty()) goto L62;
    L51:
        if (r30 != Composer.Companion.getEmpty()) goto L55;
    L70:
        $composer.startReplaceGroup(873339652);
        ComposerKt.sourceInformation($composer, "360@14370L16,361@14420L295,355@14074L663");
        List<LexiconEntry> r114 = r1.getLexicon();
        String r115 = HuiyuanApp$lambda$4(r9).getAskName();
        Iterable r37 = HuiyuanApp$lambda$40($favorites$delegate);
        Collection r38 = new HashSet();
        Iterator r39 = r37.iterator();
    L72:
        if (r39.hasNext() == false) goto L74;
        r38.add(((FavoriteRecord) r39.next()).getText());
        goto L72
    L74:
        HashSet r116 = (Set) r38;
        ComposerKt.sourceInformationMarkerStart($composer, 873348477, "CC(remember):HuiyuanApp.kt#9igjgp");
        boolean r40 = $composer.changedInstance(r2);
        Object r41 = $composer.rememberedValue();
        if (r40 == false) goto L77;
    L80:
        Object r42 = (KFunction) new HuiyuanAppKt$HuiyuanApp$2$1$screenContent$1$14$1(r2, $favorites$delegate);
        $composer.updateRememberedValue(r42);
        r41 = r42;
    L81:
        ComposerKt.sourceInformationMarkerEnd($composer);
        Function2 r117 = (Function2) ((KFunction) r41);
        ComposerKt.sourceInformationMarkerStart($composer, 873350356, "CC(remember):HuiyuanApp.kt#9igjgp");
        boolean r118 = ((((($composer.changedInstance(r2) | $composer.changed($selectedTab$delegate)) | $composer.changed(r9)) | $composer.changed(r10)) | $composer.changedInstance(r1)) | $composer.changedInstance(r12)) | $composer.changedInstance($haptics);
        Object r43 = $composer.rememberedValue();
        if (r118 == false) goto L84;
    L87:
        r43 = new HuiyuanAppKt$$ExternalSyntheticLambda13($isGenerating$delegate, $timeline, $conversationGeneration$delegate, $activeGenerationJob$delegate, r2, $selectedTab$delegate, r1, $nextId$delegate, r9, r10, $usageStats$delegate, r12, $haptics);
        $composer.updateRememberedValue(r43);
    L88:
        ComposerKt.sourceInformationMarkerEnd($composer);
        KnowledgeScreensKt.KnowledgeScreen(r114, r115, $isLandscape, r116, r117, (Function1) r43, $composer, 0);
        $composer.endReplaceGroup();
        Unit r44 = Unit.INSTANCE;
        goto L174
    L84:
        if (r43 != Composer.Companion.getEmpty()) goto L88;
    L77:
        if (r41 != Composer.Companion.getEmpty()) goto L81;
    L89:
        $composer.startReplaceGroup(873328905);
        ComposerKt.sourceInformation($composer, "348@13804L140,352@13983L29,347@13750L284");
        ComposerKt.sourceInformationMarkerStart($composer, 873330489, "CC(remember):HuiyuanApp.kt#9igjgp");
        boolean r45 = $composer.changed(r9) | $composer.changedInstance(r2);
        Object r46 = $composer.rememberedValue();
        if (r45 == false) goto L92;
    L95:
        Object r47 = new HuiyuanAppKt$$ExternalSyntheticLambda11(r2, r9);
        $composer.updateRememberedValue(r47);
        r46 = r47;
    L96:
        Function1 r48 = (Function1) r46;
        ComposerKt.sourceInformationMarkerEnd($composer);
        ComposerKt.sourceInformationMarkerStart($composer, 873336106, "CC(remember):HuiyuanApp.kt#9igjgp");
        boolean r49 = $composer.changed($selectedTab$delegate);
        Object r50 = $composer.rememberedValue();
        if (r49 == false) goto L99;
    L102:
        Object r51 = new HuiyuanAppKt$$ExternalSyntheticLambda12($selectedTab$delegate);
        $composer.updateRememberedValue(r51);
        r50 = r51;
    L103:
        ComposerKt.sourceInformationMarkerEnd($composer);
        RoomScreenKt.RoomScreen(r48, (Function0) r50, $composer, 0);
        $composer.endReplaceGroup();
        Unit r52 = Unit.INSTANCE;
        goto L174
    L99:
        if (r50 != Composer.Companion.getEmpty()) goto L103;
    L92:
        if (r46 != Composer.Companion.getEmpty()) goto L96;
    L104:
        $composer.startReplaceGroup(873289493);
        ComposerKt.sourceInformation($composer, "323@12598L227,335@13180L24,336@13239L17,337@13293L8,338@13338L11,339@13394L106,342@13545L18,343@13608L16,344@13672L19,321@12489L1224");
        AIModel r119 = HuiyuanApp$lambda$4(r9);
        ComposerKt.sourceInformationMarkerStart($composer, 873291984, "CC(remember):HuiyuanApp.kt#9igjgp");
        boolean r53 = $composer.changed(r9) | $composer.changedInstance(r2);
        Object r54 = $composer.rememberedValue();
        if (r53 == false) goto L107;
    L110:
        final MutableState r55 = $isGenerating$delegate;
        Object r56 = new HuiyuanAppKt$$ExternalSyntheticLambda5(r2, r55, r9);
        $composer.updateRememberedValue(r56);
        r54 = r56;
    L111:
        Function1 r120 = (Function1) r54;
        ComposerKt.sourceInformationMarkerEnd($composer);
        SnapshotStateList r121 = $timeline;
        String r122 = HuiyuanApp$lambda$20(r10);
        int r210 = HuiyuanApp$lambda$24($chipRound$delegate);
        boolean r211 = HuiyuanApp$lambda$34(r55);
        Iterable r57 = HuiyuanApp$lambda$40($favorites$delegate);
        Collection r58 = new HashSet();
        Iterator r59 = r57.iterator();
    L113:
        if (r59.hasNext() == false) goto L115;
        r58.add(((FavoriteRecord) r59.next()).getText());
        r57 = r57;
        goto L113
    L115:
        HashSet r212 = (Set) r58;
        ComposerKt.sourceInformationMarkerStart($composer, 873310405, "CC(remember):HuiyuanApp.kt#9igjgp");
        boolean r60 = $composer.changed(r10);
        Object r61 = $composer.rememberedValue();
        if (r60 == true) goto L122;
        if (r61 == Composer.Companion.getEmpty()) goto L122;
    L123:
        Function1 r213 = (Function1) r61;
        ComposerKt.sourceInformationMarkerEnd($composer);
        ComposerKt.sourceInformationMarkerStart($composer, 873312286, "CC(remember):HuiyuanApp.kt#9igjgp");
        boolean r214 = ((((($composer.changed(r9) | $composer.changedInstance(r2)) | $composer.changed(r10)) | $composer.changedInstance(r1)) | $composer.changedInstance(r12)) | $composer.changed($selectedTab$delegate)) | $composer.changedInstance($haptics);
        Object r62 = $composer.rememberedValue();
        if (r214 == false) goto L126;
    L129:
        Composer r123 = $composer;
        Function0 r63 = new HuiyuanAppKt$$ExternalSyntheticLambda8(r10, r1, r2, r55, $timeline, $nextId$delegate, r9, $usageStats$delegate, r12, $conversationGeneration$delegate, $activeGenerationJob$delegate, $haptics, $selectedTab$delegate);
        r10 = r10;
        HuiyuanEngine r64 = r1;
        AppRepository r65 = r2;
        AppHaptics r124 = $haptics;
        r12 = r12;
        r9 = r9;
        r62 = r63;
        $composer.updateRememberedValue(r62);
    L130:
        Function0 r215 = (Function0) r62;
        ComposerKt.sourceInformationMarkerEnd(r123);
        ComposerKt.sourceInformationMarkerStart(r123, 873314005, "CC(remember):HuiyuanApp.kt#9igjgp");
        boolean r216 = (((((r123.changed(r9) | r123.changedInstance(r65)) | r123.changed(r10)) | r123.changedInstance(r64)) | r123.changedInstance(r12)) | r123.changed($selectedTab$delegate)) | r123.changedInstance(r124);
        Object r66 = $composer.rememberedValue();
        if (r216 == false) goto L133;
    L136:
        MutableState r67 = r9;
        CoroutineScope r68 = r12;
        AppHaptics r125 = r124;
        HuiyuanAppKt$HuiyuanApp$2$1$screenContent$1$5$1 r69 = new HuiyuanAppKt$HuiyuanApp$2$1$screenContent$1$5$1(r64, r65, $isGenerating$delegate, $timeline, $nextId$delegate, r67, r10, $usageStats$delegate, r68, $conversationGeneration$delegate, $activeGenerationJob$delegate, r125, $selectedTab$delegate);
        r124 = r125;
        r12 = r68;
        r9 = r67;
        r66 = r69;
        $composer.updateRememberedValue(r66);
    L137:
        ComposerKt.sourceInformationMarkerEnd(r123);
        Function1 r217 = (Function1) ((KFunction) r66);
        ComposerKt.sourceInformationMarkerStart(r123, 873315448, "CC(remember):HuiyuanApp.kt#9igjgp");
        boolean r218 = ((((r123.changedInstance(r64) | r123.changedInstance(r65)) | r123.changed(r9)) | r123.changedInstance(r12)) | r123.changed($selectedTab$delegate)) | r123.changedInstance(r124);
        Object r70 = $composer.rememberedValue();
        if (r218 == false) goto L140;
    L143:
        MutableState r126 = r9;
        r9 = r126;
        r70 = new HuiyuanAppKt$HuiyuanApp$2$1$screenContent$1$6$1(r64, r65, $isGenerating$delegate, $usageStats$delegate, $timeline, r12, $conversationGeneration$delegate, $nextId$delegate, $activeGenerationJob$delegate, r126, r124, $selectedTab$delegate);
        $composer.updateRememberedValue(r70);
    L144:
        ComposerKt.sourceInformationMarkerEnd(r123);
        Function0 r219 = (Function0) ((KFunction) r70);
        ComposerKt.sourceInformationMarkerStart(r123, 873317335, "CC(remember):HuiyuanApp.kt#9igjgp");
        boolean r71 = r123.changedInstance(r65);
        Object r127 = $composer.rememberedValue();
        if (r71 == false) goto L147;
    L150:
        final AppRepository r72 = r65;
        Object r73 = new HuiyuanAppKt$$ExternalSyntheticLambda9($timeline, $conversationGeneration$delegate, $activeGenerationJob$delegate, $isGenerating$delegate, r72);
        r65 = r72;
        $composer.updateRememberedValue(r73);
        r127 = r73;
    L151:
        Function0 r220 = (Function0) r127;
        ComposerKt.sourceInformationMarkerEnd(r123);
        ComposerKt.sourceInformationMarkerStart(r123, 873322079, "CC(remember):HuiyuanApp.kt#9igjgp");
        boolean r74 = r123.changed($chipRound$delegate);
        Object r75 = $composer.rememberedValue();
        if (r74 == false) goto L154;
    L157:
        Object r76 = new HuiyuanAppKt$$ExternalSyntheticLambda10($chipRound$delegate);
        $composer.updateRememberedValue(r76);
        r75 = r76;
    L158:
        Function0 r221 = (Function0) r75;
        ComposerKt.sourceInformationMarkerEnd(r123);
        ComposerKt.sourceInformationMarkerStart(r123, 873324093, "CC(remember):HuiyuanApp.kt#9igjgp");
        boolean r77 = r123.changedInstance(r65);
        Object r78 = $composer.rememberedValue();
        if (r77 == false) goto L161;
    L164:
        Object r79 = (KFunction) new HuiyuanAppKt$HuiyuanApp$2$1$screenContent$1$9$1(r65, $favorites$delegate);
        $composer.updateRememberedValue(r79);
        r78 = r79;
    L165:
        ComposerKt.sourceInformationMarkerEnd(r123);
        Function2 r310 = (Function2) ((KFunction) r78);
        ComposerKt.sourceInformationMarkerStart(r123, 873326144, "CC(remember):HuiyuanApp.kt#9igjgp");
        boolean r128 = (r123.changedInstance(r65) | r123.changed(r9)) | r123.changedInstance(r64);
        HuiyuanAppKt$HuiyuanApp$2$1$screenContent$1$10$1 r80 = $composer.rememberedValue();
        if (r128 == false) goto L168;
    L171:
        r80 = new HuiyuanAppKt$HuiyuanApp$2$1$screenContent$1$10$1($timeline, r65, r64, $conversationGeneration$delegate, $activeGenerationJob$delegate, $isGenerating$delegate, $nextId$delegate, r9);
        $composer.updateRememberedValue(r80);
    L172:
        ComposerKt.sourceInformationMarkerEnd(r123);
        ChatScreenKt.ChatScreen(r119, r120, r121, r122, r210, r211, $isLandscape, r212, r213, r215, r217, r219, r220, r221, r310, (Function0) ((KFunction) r80), r123, 384, 0);
        r123.endReplaceGroup();
        Unit r81 = Unit.INSTANCE;
        goto L174
    L168:
        if (r80 != Composer.Companion.getEmpty()) goto L172;
    L161:
        if (r78 != Composer.Companion.getEmpty()) goto L165;
    L154:
        if (r75 != Composer.Companion.getEmpty()) goto L158;
    L147:
        if (r127 != Composer.Companion.getEmpty()) goto L151;
    L140:
        if (r70 != Composer.Companion.getEmpty()) goto L144;
    L133:
        if (r66 != Composer.Companion.getEmpty()) goto L137;
    L126:
        if (r62 == Composer.Companion.getEmpty()) goto L129;
        r124 = $haptics;
        r64 = r1;
        r123 = $composer;
        r65 = r2;
    L122:
        Object r82 = new HuiyuanAppKt$$ExternalSyntheticLambda7(r10);
        $composer.updateRememberedValue(r82);
        r61 = r82;
        goto L123
    L107:
        if (r54 == Composer.Companion.getEmpty()) goto L110;
        r55 = $isGenerating$delegate;
        goto L111
    L5:
        r4 = false;
        goto L7
    }

    static final Unit HuiyuanApp$lambda$95$lambda$94$lambda$85$lambda$54$lambda$53(AppRepository $repository, MutableState $isGenerating$delegate, MutableState $selectedModel$delegate, AIModel it) {
        Intrinsics.checkNotNullParameter(it, "it");
        if (HuiyuanApp$lambda$34($isGenerating$delegate) == true) goto L6;
        HuiyuanApp$lambda$5($selectedModel$delegate, it);
        $repository.saveSelectedModel(it.name());
    L6:
        return Unit.INSTANCE;
    }

    static final Unit HuiyuanApp$lambda$95$lambda$94$lambda$85$lambda$57$lambda$56(MutableState $input$delegate, String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        HuiyuanApp$lambda$21($input$delegate, StringsKt.take(it, AnimationConstants.DefaultDurationMillis));
        return Unit.INSTANCE;
    }

    static final Unit HuiyuanApp$lambda$95$lambda$94$lambda$85$lambda$59$lambda$58(MutableState $input$delegate, HuiyuanEngine $engine, AppRepository $repository, MutableState $isGenerating$delegate, SnapshotStateList $timeline, MutableLongState $nextId$delegate, MutableState $selectedModel$delegate, MutableState $usageStats$delegate, CoroutineScope $scope, MutableLongState $conversationGeneration$delegate, MutableState $activeGenerationJob$delegate, AppHaptics $haptics, MutableState $selectedTab$delegate) {
        HuiyuanApp$submit($engine, $repository, $isGenerating$delegate, $timeline, $nextId$delegate, $selectedModel$delegate, $input$delegate, $usageStats$delegate, $scope, $conversationGeneration$delegate, $activeGenerationJob$delegate, $haptics, $selectedTab$delegate, HuiyuanApp$lambda$20($input$delegate));
        return Unit.INSTANCE;
    }

    static final Unit HuiyuanApp$lambda$95$lambda$94$lambda$85$lambda$63$lambda$62(SnapshotStateList $timeline, MutableLongState $conversationGeneration$delegate, MutableState $activeGenerationJob$delegate, MutableState $isGenerating$delegate, AppRepository $repository) {
        HuiyuanApp$cancelActiveGeneration($timeline, $conversationGeneration$delegate, $activeGenerationJob$delegate, $isGenerating$delegate, $repository, true);
        return Unit.INSTANCE;
    }

    static final Unit HuiyuanApp$lambda$95$lambda$94$lambda$85$lambda$65$lambda$64(MutableIntState $chipRound$delegate) {
        HuiyuanApp$lambda$25($chipRound$delegate, HuiyuanApp$lambda$24($chipRound$delegate) + 1);
        return Unit.INSTANCE;
    }

    static final Unit HuiyuanApp$lambda$95$lambda$94$lambda$85$lambda$69$lambda$68(AppRepository $repository, MutableState $selectedModel$delegate, AIModel it) {
        Intrinsics.checkNotNullParameter(it, "it");
        HuiyuanApp$lambda$5($selectedModel$delegate, it);
        $repository.saveSelectedModel(it.name());
        return Unit.INSTANCE;
    }

    static final Unit HuiyuanApp$lambda$95$lambda$94$lambda$85$lambda$71$lambda$70(MutableState $selectedTab$delegate) {
        HuiyuanApp$lambda$17($selectedTab$delegate, AppTab.CHAT);
        return Unit.INSTANCE;
    }

    static final Unit HuiyuanApp$lambda$95$lambda$94$lambda$85$lambda$75$lambda$74(MutableState $isGenerating$delegate, SnapshotStateList $timeline, MutableLongState $conversationGeneration$delegate, MutableState $activeGenerationJob$delegate, AppRepository $repository, MutableState $selectedTab$delegate, HuiyuanEngine $engine, MutableLongState $nextId$delegate, MutableState $selectedModel$delegate, MutableState $input$delegate, MutableState $usageStats$delegate, CoroutineScope $scope, AppHaptics $haptics, String prompt) {
        Intrinsics.checkNotNullParameter(prompt, "prompt");
        if (HuiyuanApp$lambda$34($isGenerating$delegate) == false) goto L5;
        HuiyuanApp$cancelActiveGeneration($timeline, $conversationGeneration$delegate, $activeGenerationJob$delegate, $isGenerating$delegate, $repository, true);
    L5:
        HuiyuanApp$lambda$17($selectedTab$delegate, AppTab.CHAT);
        HuiyuanApp$submit($engine, $repository, $isGenerating$delegate, $timeline, $nextId$delegate, $selectedModel$delegate, $input$delegate, $usageStats$delegate, $scope, $conversationGeneration$delegate, $activeGenerationJob$delegate, $haptics, $selectedTab$delegate, prompt);
        return Unit.INSTANCE;
    }

    static final Unit HuiyuanApp$lambda$95$lambda$94$lambda$85$lambda$78$lambda$77(MutableState $isGenerating$delegate, SnapshotStateList $timeline, MutableLongState $conversationGeneration$delegate, MutableState $activeGenerationJob$delegate, AppRepository $repository, MutableState $selectedTab$delegate, HuiyuanEngine $engine, MutableLongState $nextId$delegate, MutableState $selectedModel$delegate, MutableState $input$delegate, MutableState $usageStats$delegate, CoroutineScope $scope, AppHaptics $haptics, String prompt) {
        Intrinsics.checkNotNullParameter(prompt, "prompt");
        if (HuiyuanApp$lambda$34($isGenerating$delegate) == false) goto L5;
        HuiyuanApp$cancelActiveGeneration($timeline, $conversationGeneration$delegate, $activeGenerationJob$delegate, $isGenerating$delegate, $repository, true);
    L5:
        HuiyuanApp$lambda$17($selectedTab$delegate, AppTab.CHAT);
        HuiyuanApp$submit($engine, $repository, $isGenerating$delegate, $timeline, $nextId$delegate, $selectedModel$delegate, $input$delegate, $usageStats$delegate, $scope, $conversationGeneration$delegate, $activeGenerationJob$delegate, $haptics, $selectedTab$delegate, prompt);
        return Unit.INSTANCE;
    }

    static final Unit HuiyuanApp$lambda$95$lambda$94$lambda$85$lambda$80$lambda$79(MutableState $selectedTab$delegate) {
        HuiyuanApp$lambda$17($selectedTab$delegate, AppTab.LIBRARY);
        return Unit.INSTANCE;
    }

    static final Unit HuiyuanApp$lambda$95$lambda$94$lambda$85$lambda$83$lambda$82(LexiconEntry $dailyQuote, MutableState $isGenerating$delegate, SnapshotStateList $timeline, MutableLongState $conversationGeneration$delegate, MutableState $activeGenerationJob$delegate, AppRepository $repository, MutableState $selectedTab$delegate, HuiyuanEngine $engine, MutableLongState $nextId$delegate, MutableState $selectedModel$delegate, MutableState $input$delegate, MutableState $usageStats$delegate, CoroutineScope $scope, AppHaptics $haptics) {
        if (HuiyuanApp$lambda$34($isGenerating$delegate) == false) goto L5;
        HuiyuanApp$cancelActiveGeneration($timeline, $conversationGeneration$delegate, $activeGenerationJob$delegate, $isGenerating$delegate, $repository, true);
    L5:
        HuiyuanApp$lambda$17($selectedTab$delegate, AppTab.CHAT);
        HuiyuanApp$submit($engine, $repository, $isGenerating$delegate, $timeline, $nextId$delegate, $selectedModel$delegate, $input$delegate, $usageStats$delegate, $scope, $conversationGeneration$delegate, $activeGenerationJob$delegate, $haptics, $selectedTab$delegate, "请解释这句话：" + $dailyQuote.getText());
        return Unit.INSTANCE;
    }

    static final Unit HuiyuanApp$lambda$95$lambda$94$lambda$89$lambda$87$lambda$86(MutableState $selectedTab$delegate, AppTab it) {
        Intrinsics.checkNotNullParameter(it, "it");
        HuiyuanApp$lambda$17($selectedTab$delegate, it);
        return Unit.INSTANCE;
    }

    static final Unit HuiyuanApp$lambda$95$lambda$94$lambda$93$lambda$92$lambda$91(MutableState $selectedTab$delegate, AppTab it) {
        Intrinsics.checkNotNullParameter(it, "it");
        HuiyuanApp$lambda$17($selectedTab$delegate, it);
        return Unit.INSTANCE;
    }

    private static final void SideNavigation(final AppTab selected, final Function1<? super AppTab, Unit> r93, Composer $composer, final int $changed) {
        Composer $composer2 = $composer.startRestartGroup(-1592488703);
        ComposerKt.sourceInformation($composer2, "C(SideNavigation)P(1)438@17612L21,431@17394L2161:HuiyuanApp.kt#cyjvf");
        int $dirty = $changed;
        if (($changed & 6) != 0) goto L10;
        if ($composer2.changed(selected.ordinal()) == false) goto L7;
        int r6 = 4;
    L8:
        $dirty = $dirty | r6;
        goto L10
    L7:
        r6 = 2;
    L10:
        if (($changed & 48) != 0) goto L17;
        if ($composer2.changedInstance(r93) == false) goto L14;
        int r7 = 32;
    L15:
        $dirty = $dirty | r7;
        goto L17
    L14:
        r7 = 16;
    L17:
        if (($dirty & 19) == 18) goto L19;
        boolean r8 = true;
    L21:
        if ($composer2.shouldExecute(r8, $dirty & 1) == true) goto L23;
        Composer $composer3 = $composer2;
        $composer3.skipToGroupEnd();
    L106:
        ScopeUpdateScope r3 = $composer3.endRestartGroup();
        if (r3 == null) goto L113;
        r3.updateScope(new HuiyuanAppKt$$ExternalSyntheticLambda1(selected, r93, $changed));
        return;
    L113:
        return;
    L23:
        if (ComposerKt.isTraceInProgress() == false) goto L25;
        ComposerKt.traceEventStart(-1592488703, $dirty, -1, "com.luchime.huiyuan.ui.SideNavigation (HuiyuanApp.kt:430)");
    L25:
        Modifier r4 = PaddingKt.m726paddingVpY3zN4(ScrollKt.verticalScroll$default(WindowInsetsPadding_androidKt.navigationBarsPadding(WindowInsetsPadding_androidKt.statusBarsPadding(BackgroundKt.m234backgroundbw27NRU$default(SizeKt.m777width3ABfNKs(SizeKt.fillMaxHeight$default(Modifier.Companion, 0.0f, 1, null), Dp.m6973constructorimpl(82)), HuiyuanDesignKt.getInk(), null, 2, null))), ScrollKt.rememberScrollState(0, $composer2, 0, 1), false, null, false, 14, null), Dp.m6973constructorimpl(7), Dp.m6973constructorimpl(8));
        Alignment.Horizontal r11 = Alignment.Companion.getCenterHorizontally();
        Arrangement.Vertical r12 = Arrangement.INSTANCE.m606spacedBy0680j_4(Dp.m6973constructorimpl(7));
        int r13 = 432;
        Composer r14 = $composer2;
        int r15 = 0;
        String r9 = "CC(Column)P(2,3,1)87@4442L61,88@4508L133:Column.kt#2w3rfo";
        ComposerKt.sourceInformationMarkerStart(r14, -483455358, "CC(Column)P(2,3,1)87@4442L61,88@4508L133:Column.kt#2w3rfo");
        MeasurePolicy r10 = ColumnKt.columnMeasurePolicy(r12, r11, r14, ((432 >> 3) & 14) | ((432 >> 3) & 112));
        String r16 = "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh";
        ComposerKt.sourceInformationMarkerStart(r14, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
        int r21 = ComposablesKt.getCurrentCompositeKeyHash(r14, 0);
        CompositionLocalMap r17 = r14.getCurrentCompositionLocalMap();
        Modifier r5 = ComposedModifierKt.materializeModifier(r14, r4);
        Function0<ComposeUiNode> r22 = ComposeUiNode.Companion.getConstructor();
        int $dirty2 = $dirty;
        int r18 = ((((432 << 3) & 112) << 6) & 896) | 6;
        String r19 = "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp";
        ComposerKt.sourceInformationMarkerStart(r14, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
        if ((r14.getApplier() instanceof Applier) == true) goto L28;
        ComposablesKt.invalidApplier();
    L28:
        r14.startReusableNode();
        if (r14.getInserting() == false) goto L31;
        Function0<ComposeUiNode> r20 = r22;
        r14.createNode(r20);
    L32:
        Composer r23 = Updater.m3808constructorimpl(r14);
        Updater.m3815setimpl(r23, r10, ComposeUiNode.Companion.getSetMeasurePolicy());
        Updater.m3815setimpl(r23, r17, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> r110 = ComposeUiNode.Companion.getSetCompositeKeyHash();
        if (r23.getInserting() == true) goto L39;
        if (Intrinsics.areEqual(r23.rememberedValue(), Integer.valueOf(r21)) == false) goto L39;
    L40:
        Updater.m3815setimpl(r23, r5, ComposeUiNode.Companion.getSetModifier());
        int r24 = (r18 >> 6) & 14;
        Composer r25 = r14;
        int r111 = 0;
        String r26 = "C89@4556L9:Column.kt#2w3rfo";
        ComposerKt.sourceInformationMarkerStart(r25, -384672921, "C89@4556L9:Column.kt#2w3rfo");
        ColumnScopeInstance r28 = ColumnScopeInstance.INSTANCE;
        int r30 = ((432 >> 6) & 112) | 6;
        ComposerKt.sourceInformationMarkerStart(r25, 1567836221, "C:HuiyuanApp.kt#cyjvf");
        r25.startReplaceGroup(189123159);
        ComposerKt.sourceInformation(r25, "*457@18482L17,445@17911L1628");
        Iterable r27 = AppTab.getEntries();
        int r112 = 0;
        Iterator<AppTab> r31 = r27.iterator();
    L42:
        if (r31.hasNext() == false) goto L102;
        Iterable r39 = r27;
        final AppTab r29 = (AppTab) r31.next();
        if (r29 != selected) goto L46;
        boolean r41 = true;
    L47:
        int r43 = r111;
        int r42 = r112;
        Arrangement.Vertical r44 = r12;
        int r45 = r13;
        Modifier r113 = SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, null);
        if (r41 == false) goto L50;
        long r114 = HuiyuanDesignKt.getSignalYellow();
    L51:
        Composer r47 = r14;
        Modifier r115 = BackgroundKt.m233backgroundbw27NRU(r113, r114, RoundedCornerShapeKt.m1018RoundedCornerShape0680j_4(Dp.m6973constructorimpl(12)));
        if (r41 == false) goto L54;
        float r116 = Dp.m6973constructorimpl(2);
    L55:
        Color.Companion r117 = Color.Companion;
        if (r41 == false) goto L58;
        long r118 = r117.m4392getBlack0d7_KjU();
    L59:
        int r48 = r15;
        Modifier r49 = BorderKt.m245borderxT4_qwU(r115, r116, r118, RoundedCornerShapeKt.m1018RoundedCornerShape0680j_4(Dp.m6973constructorimpl(12)));
        HapticCue r51 = HapticCue.SELECTION;
        ComposerKt.sourceInformationMarkerStart(r25, 1941514665, "CC(remember):HuiyuanApp.kt#9igjgp");
        if (($dirty2 & 112) != 32) goto L62;
        boolean r119 = true;
    L63:
        boolean r120 = r119 | $composer2.changed(r29.ordinal());
        Composer r121 = r25;
        Object r122 = r121.rememberedValue();
        if (r120 == false) goto L66;
    L69:
        Object r32 = new HuiyuanAppKt$$ExternalSyntheticLambda0(r93, r29);
        r121.updateRememberedValue(r32);
        r122 = r32;
    L70:
        ComposerKt.sourceInformationMarkerEnd(r25);
        Modifier r33 = PaddingKt.m727paddingVpY3zN4$default(AppHapticsKt.hapticClickable$default(r49, false, r51, (Function0) r122, 1, null), 0.0f, Dp.m6973constructorimpl(8), 1, null);
        Alignment.Horizontal r123 = Alignment.Companion.getCenterHorizontally();
        Composer r124 = r25;
        ComposerKt.sourceInformationMarkerStart(r124, -483455358, r9);
        MeasurePolicy r125 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), r123, r124, ((384 >> 3) & 14) | ((384 >> 3) & 112));
        ComposerKt.sourceInformationMarkerStart(r124, -1323940314, r16);
        int r53 = ComposablesKt.getCurrentCompositeKeyHash(r124, 0);
        CompositionLocalMap r126 = r124.getCurrentCompositionLocalMap();
        String r410 = r9;
        Modifier r34 = ComposedModifierKt.materializeModifier(r124, r33);
        Function0<ComposeUiNode> r55 = ComposeUiNode.Companion.getConstructor();
        int r35 = ((((384 << 3) & 112) << 6) & 896) | 6;
        ComposerKt.sourceInformationMarkerStart(r124, -692256719, r19);
        if ((r124.getApplier() instanceof Applier) == true) goto L73;
        ComposablesKt.invalidApplier();
    L73:
        r124.startReusableNode();
        if (r124.getInserting() == false) goto L76;
        Function0<ComposeUiNode> r36 = r55;
        r124.createNode(r36);
    L77:
        Composer r37 = Updater.m3808constructorimpl(r124);
        Composer r61 = r25;
        Updater.m3815setimpl(r37, r125, ComposeUiNode.Companion.getSetMeasurePolicy());
        Updater.m3815setimpl(r37, r126, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> r38 = ComposeUiNode.Companion.getSetCompositeKeyHash();
        if (r37.getInserting() == true) goto L83;
        String r64 = r19;
        String r65 = r16;
        if (Intrinsics.areEqual(r37.rememberedValue(), Integer.valueOf(r53)) == true) goto L85;
    L84:
        r37.updateRememberedValue(Integer.valueOf(r53));
        r37.apply(Integer.valueOf(r53), r38);
    L85:
        Updater.m3815setimpl(r37, r34, ComposeUiNode.Companion.getSetModifier());
        int r40 = (r35 >> 6) & 14;
        ComposerKt.sourceInformationMarkerStart(r124, -384672921, r26);
        ColumnScopeInstance r310 = ColumnScopeInstance.INSTANCE;
        int r59 = ((384 >> 6) & 112) | 6;
        String r63 = r26;
        ComposerKt.sourceInformationMarkerStart(r124, 2032772998, "C476@19315L210:HuiyuanApp.kt#cyjvf");
        if (r29 != AppTab.PROFILE) goto L92;
        r124.startReplaceGroup(2032783351);
        ComposerKt.sourceInformation(r124, "463@18736L48,462@18695L309");
        Painter r66 = PainterResources_androidKt.painterResource(R.drawable.lulu_icon_foreground, r124, 0);
        ColorFilter.Companion r67 = ColorFilter.Companion;
        if (r41 == false) goto L90;
        long r68 = HuiyuanDesignKt.getInk();
    L91:
        ImageKt.Image(r66, "鹿鹿", SizeKt.m772size3ABfNKs(Modifier.Companion, Dp.m6973constructorimpl(22)), null, null, 0.0f, ColorFilter.Companion.m4407tintxETnrds$default(r67, r68, 0, 2, null), r124, 432, 56);
        r124.endReplaceGroup();
        Composer r87 = r124;
    L97:
        String r69 = r29.getLabel();
        if (r41 == false) goto L100;
        long r46 = HuiyuanDesignKt.getInk();
    L101:
        TextKt.m2820Text4IGK_g(r69, null, r46, TextUnitKt.getSp(10), null, FontWeight.Companion.getBold(), null, 0, null, null, 0, 0, false, 0, 0, null, null, r87, 199680, 0, 131026);
        ComposerKt.sourceInformationMarkerEnd(r87);
        ComposerKt.sourceInformationMarkerEnd(r124);
        r124.endNode();
        ComposerKt.sourceInformationMarkerEnd(r124);
        ComposerKt.sourceInformationMarkerEnd(r124);
        ComposerKt.sourceInformationMarkerEnd(r124);
        r27 = r39;
        r112 = r42;
        r111 = r43;
        r12 = r44;
        r13 = r45;
        $composer2 = $composer2;
        r14 = r47;
        r15 = r48;
        r9 = r410;
        r25 = r61;
        r26 = r63;
        r19 = r64;
        r16 = r65;
        goto L42
    L100:
        r46 = Color.Companion.m4403getWhite0d7_KjU();
        goto L101
    L90:
        r68 = Color.Companion.m4403getWhite0d7_KjU();
        goto L91
    L92:
        r124.startReplaceGroup(2033133062);
        ComposerKt.sourceInformation(r124, "469@19050L230");
        String r610 = r29.getIcon();
        if (r41 == false) goto L95;
        long r611 = HuiyuanDesignKt.getInk();
    L96:
        r87 = r124;
        TextKt.m2820Text4IGK_g(r610, null, r611, TextUnitKt.getSp(17), null, FontWeight.Companion.getBlack(), null, 0, null, null, 0, 0, false, 0, 0, null, null, r87, 199680, 0, 131026);
        r87.endReplaceGroup();
        goto L97
    L95:
        r611 = Color.Companion.m4403getWhite0d7_KjU();
        goto L96
    L83:
        r64 = r19;
        r65 = r16;
        goto L84
    L76:
        r36 = r55;
        r124.useNode();
        goto L77
    L66:
        if (r122 != Composer.Companion.getEmpty()) goto L70;
    L62:
        r119 = false;
        goto L63
    L58:
        r118 = r117.m4401getTransparent0d7_KjU();
        goto L59
    L54:
        r116 = Dp.m6973constructorimpl(0);
        goto L55
    L50:
        r114 = Color.Companion.m4401getTransparent0d7_KjU();
        goto L51
    L46:
        r41 = false;
        goto L47
    L102:
        $composer3 = $composer2;
        Composer r62 = r25;
        Composer r411 = r14;
        r62.endReplaceGroup();
        ComposerKt.sourceInformationMarkerEnd(r62);
        ComposerKt.sourceInformationMarkerEnd(r25);
        r411.endNode();
        ComposerKt.sourceInformationMarkerEnd(r411);
        ComposerKt.sourceInformationMarkerEnd(r411);
        ComposerKt.sourceInformationMarkerEnd(r411);
        if (ComposerKt.isTraceInProgress() == false) goto L106;
        ComposerKt.traceEventEnd();
    L39:
        r23.updateRememberedValue(Integer.valueOf(r21));
        r23.apply(Integer.valueOf(r21), r110);
        goto L40
    L31:
        r20 = r22;
        r14.useNode();
        goto L32
    L19:
        r8 = false;
        goto L21
    }

    static final Unit SideNavigation$lambda$101$lambda$100$lambda$98$lambda$97(Function1 $onSelect, AppTab $tab) {
        $onSelect.invoke($tab);
        return Unit.INSTANCE;
    }

    private static final void BottomNavigation(final AppTab selected, final Function1<? super AppTab, Unit> r91, Composer $composer, final int $changed) {
        Composer $composer2 = $composer.startRestartGroup(42046293);
        ComposerKt.sourceInformation($composer2, "C(BottomNavigation)P(1)489@19652L1985:HuiyuanApp.kt#cyjvf");
        int $dirty = $changed;
        if (($changed & 6) != 0) goto L10;
        if ($composer2.changed(selected.ordinal()) == false) goto L7;
        int r6 = 4;
    L8:
        $dirty = $dirty | r6;
        goto L10
    L7:
        r6 = 2;
    L10:
        if (($changed & 48) != 0) goto L17;
        if ($composer2.changedInstance(r91) == false) goto L14;
        int r7 = 32;
    L15:
        $dirty = $dirty | r7;
        goto L17
    L14:
        r7 = 16;
    L17:
        if (($dirty & 19) == 18) goto L19;
        boolean r8 = true;
    L21:
        if ($composer2.shouldExecute(r8, $dirty & 1) == true) goto L23;
        Composer $composer3 = $composer2;
        $composer3.skipToGroupEnd();
    L106:
        ScopeUpdateScope r3 = $composer3.endRestartGroup();
        if (r3 == null) goto L113;
        r3.updateScope(new HuiyuanAppKt$$ExternalSyntheticLambda29(selected, r91, $changed));
        return;
    L113:
        return;
    L23:
        if (ComposerKt.isTraceInProgress() == false) goto L25;
        ComposerKt.traceEventStart(42046293, $dirty, -1, "com.luchime.huiyuan.ui.BottomNavigation (HuiyuanApp.kt:488)");
    L25:
        Modifier r4 = PaddingKt.m726paddingVpY3zN4(WindowInsetsPadding_androidKt.navigationBarsPadding(BackgroundKt.m234backgroundbw27NRU$default(SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, null), HuiyuanDesignKt.getInk(), null, 2, null)), Dp.m6973constructorimpl(8), Dp.m6973constructorimpl(8));
        Arrangement.Horizontal r11 = Arrangement.INSTANCE.m606spacedBy0680j_4(Dp.m6973constructorimpl(6));
        Composer r12 = $composer2;
        int r13 = 48;
        ComposerKt.sourceInformationMarkerStart(r12, 693286680, "CC(Row)P(2,1,3)99@5124L58,100@5187L130:Row.kt#2w3rfo");
        MeasurePolicy r15 = RowKt.rowMeasurePolicy(r11, Alignment.Companion.getTop(), r12, ((48 >> 3) & 14) | ((48 >> 3) & 112));
        ComposerKt.sourceInformationMarkerStart(r12, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
        int r20 = ComposablesKt.getCurrentCompositeKeyHash(r12, 0);
        CompositionLocalMap r10 = r12.getCurrentCompositionLocalMap();
        Modifier r9 = ComposedModifierKt.materializeModifier(r12, r4);
        Function0<ComposeUiNode> r21 = ComposeUiNode.Companion.getConstructor();
        int r5 = ((((48 << 3) & 112) << 6) & 896) | 6;
        int $dirty2 = $dirty;
        String r14 = "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp";
        ComposerKt.sourceInformationMarkerStart(r12, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
        if ((r12.getApplier() instanceof Applier) == true) goto L28;
        ComposablesKt.invalidApplier();
    L28:
        r12.startReusableNode();
        if (r12.getInserting() == false) goto L31;
        Function0<ComposeUiNode> r16 = r21;
        r12.createNode(r16);
    L32:
        Composer r17 = Updater.m3808constructorimpl(r12);
        Updater.m3815setimpl(r17, r15, ComposeUiNode.Companion.getSetMeasurePolicy());
        Updater.m3815setimpl(r17, r10, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> r18 = ComposeUiNode.Companion.getSetCompositeKeyHash();
        if (r17.getInserting() == true) goto L39;
        if (Intrinsics.areEqual(r17.rememberedValue(), Integer.valueOf(r20)) == false) goto L39;
    L40:
        Updater.m3815setimpl(r17, r9, ComposeUiNode.Companion.getSetModifier());
        int r19 = (r5 >> 6) & 14;
        int r22 = 0;
        ComposerKt.sourceInformationMarkerStart(r12, -407735110, "C101@5232L9:Row.kt#2w3rfo");
        int r110 = ((48 >> 6) & 112) | 6;
        RowScope r23 = RowScopeInstance.INSTANCE;
        Composer r24 = r12;
        ComposerKt.sourceInformationMarkerStart(r24, -1244485925, "C:HuiyuanApp.kt#cyjvf");
        r24.startReplaceGroup(-732880903);
        ComposerKt.sourceInformation(r24, "*511@20564L17,499@19997L1624");
        Iterable r25 = AppTab.getEntries();
        int r26 = 0;
        Iterator<AppTab> r27 = r25.iterator();
    L42:
        if (r27.hasNext() == false) goto L102;
        Iterable r41 = r25;
        final AppTab r28 = (AppTab) r27.next();
        if (r28 != selected) goto L46;
        boolean r34 = true;
    L47:
        boolean r43 = r34;
        int r44 = r26;
        Modifier r29 = RowScope.weight$default(r23, Modifier.Companion, 1.0f, false, 2, null);
        if (r43 == false) goto L50;
        long r35 = HuiyuanDesignKt.getSignalYellow();
    L51:
        int r37 = r110;
        Arrangement.Horizontal r36 = r11;
        long r111 = r35;
        int r38 = r22;
        Composer r39 = r12;
        Modifier r30 = BackgroundKt.m233backgroundbw27NRU(r29, r111, RoundedCornerShapeKt.m1018RoundedCornerShape0680j_4(Dp.m6973constructorimpl(12)));
        if (r43 == false) goto L54;
        float r31 = Dp.m6973constructorimpl(2);
    L55:
        Color.Companion r112 = Color.Companion;
        if (r43 == false) goto L58;
        long r113 = r112.m4392getBlack0d7_KjU();
    L59:
        int r45 = r13;
        Modifier r46 = BorderKt.m245borderxT4_qwU(r30, r31, r113, RoundedCornerShapeKt.m1018RoundedCornerShape0680j_4(Dp.m6973constructorimpl(12)));
        HapticCue r48 = HapticCue.SELECTION;
        ComposerKt.sourceInformationMarkerStart(r24, -602899121, "CC(remember):HuiyuanApp.kt#9igjgp");
        if (($dirty2 & 112) != 32) goto L62;
        boolean r32 = true;
    L63:
        boolean r33 = r32 | $composer2.changed(r28.ordinal());
        Composer r114 = r24;
        Object r115 = r114.rememberedValue();
        if (r33 == false) goto L66;
    L69:
        Object r40 = new HuiyuanAppKt$$ExternalSyntheticLambda28(r91, r28);
        r114.updateRememberedValue(r40);
        r115 = r40;
    L70:
        ComposerKt.sourceInformationMarkerEnd(r24);
        Modifier r42 = PaddingKt.m727paddingVpY3zN4$default(AppHapticsKt.hapticClickable$default(r46, false, r48, (Function0) r115, 1, null), 0.0f, Dp.m6973constructorimpl(7), 1, null);
        Alignment.Horizontal r47 = Alignment.Companion.getCenterHorizontally();
        Composer r116 = r24;
        ComposerKt.sourceInformationMarkerStart(r116, -483455358, "CC(Column)P(2,3,1)87@4442L61,88@4508L133:Column.kt#2w3rfo");
        MeasurePolicy r117 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), r47, r116, ((384 >> 3) & 14) | ((384 >> 3) & 112));
        ComposerKt.sourceInformationMarkerStart(r116, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
        int r50 = ComposablesKt.getCurrentCompositeKeyHash(r116, 0);
        CompositionLocalMap r118 = r116.getCurrentCompositionLocalMap();
        Modifier r49 = ComposedModifierKt.materializeModifier(r116, r42);
        Function0<ComposeUiNode> r52 = ComposeUiNode.Companion.getConstructor();
        int r51 = ((((384 << 3) & 112) << 6) & 896) | 6;
        ComposerKt.sourceInformationMarkerStart(r116, -692256719, r14);
        if ((r116.getApplier() instanceof Applier) == true) goto L73;
        ComposablesKt.invalidApplier();
    L73:
        r116.startReusableNode();
        if (r116.getInserting() == false) goto L76;
        Function0<ComposeUiNode> r53 = r52;
        r116.createNode(r53);
    L77:
        Composer r54 = Updater.m3808constructorimpl(r116);
        String r58 = r14;
        Updater.m3815setimpl(r54, r117, ComposeUiNode.Companion.getSetMeasurePolicy());
        Updater.m3815setimpl(r54, r118, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> r55 = ComposeUiNode.Companion.getSetCompositeKeyHash();
        if (r54.getInserting() == true) goto L83;
        Composer r61 = r24;
        if (Intrinsics.areEqual(r54.rememberedValue(), Integer.valueOf(r50)) == true) goto L85;
    L84:
        r54.updateRememberedValue(Integer.valueOf(r50));
        r54.apply(Integer.valueOf(r50), r55);
    L85:
        Updater.m3815setimpl(r54, r49, ComposeUiNode.Companion.getSetModifier());
        int r56 = (r51 >> 6) & 14;
        ComposerKt.sourceInformationMarkerStart(r116, -384672921, "C89@4556L9:Column.kt#2w3rfo");
        ColumnScopeInstance r57 = ColumnScopeInstance.INSTANCE;
        int r59 = ((384 >> 6) & 112) | 6;
        ComposerKt.sourceInformationMarkerStart(r116, -1724789472, "C530@21397L210:HuiyuanApp.kt#cyjvf");
        if (r28 != AppTab.PROFILE) goto L92;
        r116.startReplaceGroup(-1724779119);
        ComposerKt.sourceInformation(r116, "517@20818L48,516@20777L309");
        Painter r63 = PainterResources_androidKt.painterResource(R.drawable.lulu_icon_foreground, r116, 0);
        ColorFilter.Companion r64 = ColorFilter.Companion;
        if (r43 == false) goto L90;
        long r65 = HuiyuanDesignKt.getInk();
    L91:
        AppTab r89 = r28;
        ImageKt.Image(r63, "鹿鹿", SizeKt.m772size3ABfNKs(Modifier.Companion, Dp.m6973constructorimpl(22)), null, null, 0.0f, ColorFilter.Companion.m4407tintxETnrds$default(r64, r65, 0, 2, null), r116, 432, 56);
        r116.endReplaceGroup();
    L97:
        String r66 = r89.getLabel();
        if (r43 == false) goto L100;
        long r60 = HuiyuanDesignKt.getInk();
    L101:
        TextKt.m2820Text4IGK_g(r66, null, r60, TextUnitKt.getSp(10), null, FontWeight.Companion.getBold(), null, 0, null, null, 0, 0, false, 0, 0, null, null, r116, 199680, 0, 131026);
        ComposerKt.sourceInformationMarkerEnd(r116);
        ComposerKt.sourceInformationMarkerEnd(r116);
        r116.endNode();
        ComposerKt.sourceInformationMarkerEnd(r116);
        ComposerKt.sourceInformationMarkerEnd(r116);
        ComposerKt.sourceInformationMarkerEnd(r116);
        $composer2 = $composer2;
        r22 = r38;
        r11 = r36;
        r110 = r37;
        r12 = r39;
        r25 = r41;
        r26 = r44;
        r13 = r45;
        r14 = r58;
        r24 = r61;
        goto L42
    L100:
        r60 = Color.Companion.m4403getWhite0d7_KjU();
        goto L101
    L90:
        r65 = Color.Companion.m4403getWhite0d7_KjU();
        goto L91
    L92:
        r89 = r28;
        r116.startReplaceGroup(-1724429408);
        ComposerKt.sourceInformation(r116, "523@21132L230");
        String r67 = r89.getIcon();
        if (r43 == false) goto L95;
        long r62 = HuiyuanDesignKt.getInk();
    L96:
        TextKt.m2820Text4IGK_g(r67, null, r62, TextUnitKt.getSp(17), null, FontWeight.Companion.getBlack(), null, 0, null, null, 0, 0, false, 0, 0, null, null, r116, 199680, 0, 131026);
        r116.endReplaceGroup();
        goto L97
    L95:
        r62 = Color.Companion.m4403getWhite0d7_KjU();
        goto L96
    L83:
        r61 = r24;
        goto L84
    L76:
        r53 = r52;
        r116.useNode();
        goto L77
    L66:
        if (r115 != Composer.Companion.getEmpty()) goto L70;
    L62:
        r32 = false;
        goto L63
    L58:
        r113 = r112.m4401getTransparent0d7_KjU();
        goto L59
    L54:
        r31 = Dp.m6973constructorimpl(0);
        goto L55
    L50:
        r35 = Color.Companion.m4401getTransparent0d7_KjU();
        goto L51
    L46:
        r34 = false;
        goto L47
    L102:
        $composer3 = $composer2;
        Composer r68 = r24;
        Composer r310 = r12;
        r68.endReplaceGroup();
        ComposerKt.sourceInformationMarkerEnd(r68);
        ComposerKt.sourceInformationMarkerEnd(r12);
        r310.endNode();
        ComposerKt.sourceInformationMarkerEnd(r310);
        ComposerKt.sourceInformationMarkerEnd(r310);
        ComposerKt.sourceInformationMarkerEnd(r310);
        if (ComposerKt.isTraceInProgress() == false) goto L106;
        ComposerKt.traceEventEnd();
    L39:
        r17.updateRememberedValue(Integer.valueOf(r20));
        r17.apply(Integer.valueOf(r20), r18);
        goto L40
    L31:
        r16 = r21;
        r12.useNode();
        goto L32
    L19:
        r8 = false;
        goto L21
    }

    static final Unit BottomNavigation$lambda$107$lambda$106$lambda$104$lambda$103(Function1 $onSelect, AppTab $tab) {
        $onSelect.invoke($tab);
        return Unit.INSTANCE;
    }

    private static final TimelineItem.Message toTimelineMessage(ChatRecord $this$toTimelineMessage) {
        long r1 = $this$toTimelineMessage.getId();
        boolean r3 = $this$toTimelineMessage.isUser();
        String r4 = $this$toTimelineMessage.getText();
        String r5 = $this$toTimelineMessage.getTag();
        String r6 = $this$toTimelineMessage.getSourceQuote();
        long r7 = $this$toTimelineMessage.getTimestamp();
        Result.Companion r0 = Result.Companion;     // Catch: Throwable -> L5
        Object r2 = Result.m7425constructorimpl(AIModel.valueOf($this$toTimelineMessage.getModelId()));     // Catch: Throwable -> L5
    L7:
        AIModel r9 = AIModel.HUIYUAN;
        if (Result.m7431isFailureimpl(r2) == false) goto L11;
        r2 = r9;
    L11:
        return new TimelineItem.Message(r1, r3, r4, r5, r6, r7, false, (AIModel) r2, 64, null);
    L5:
        th = move-exception;
        Result.Companion r10 = Result.Companion;
        r2 = Result.m7425constructorimpl(ResultKt.createFailure(th));
        goto L7
    }

    private static final ChatRecord toChatRecord(TimelineItem.Message $this$toChatRecord) {
        return new ChatRecord($this$toChatRecord.getId(), $this$toChatRecord.isUser(), $this$toChatRecord.getText(), $this$toChatRecord.getTag(), $this$toChatRecord.getSourceQuote(), $this$toChatRecord.getTimestamp(), $this$toChatRecord.getModel().name());
    }

    private static final String toExportText(final List<ChatRecord> r9) {
        return CollectionsKt.joinToString$default(r9, "\n\n", null, null, 0, null, new HuiyuanAppKt$$ExternalSyntheticLambda26(r9), 30, null);
    }

    static final CharSequence toExportText$lambda$111(List $this_toExportText, ChatRecord message) {
        Intrinsics.checkNotNullParameter(message, "message");
        Result.Companion r0 = Result.Companion;     // Catch: Throwable -> L5
        Object r1 = Result.m7425constructorimpl(AIModel.valueOf(message.getModelId()).getAskName());     // Catch: Throwable -> L5
    L8:
        if (Result.m7431isFailureimpl(r1) == false) goto L10;
        r1 = "困困";
    L10:
        String aiName = (String) r1;
        if (message.isUser() == false) goto L13;
        String r2 = "我";
    L15:
        return r2 + "：" + message.getText();
    L13:
        r2 = aiName;
    L5:
        th = move-exception;
        Result.Companion r3 = Result.Companion;
        r1 = Result.m7425constructorimpl(ResultKt.createFailure(th));
        goto L8
    }

    private static final void HuiyuanAppPreview(Composer $composer, final int $changed) {
        Composer $composer2 = $composer.startRestartGroup(421571367);
        ComposerKt.sourceInformation($composer2, "C(HuiyuanAppPreview)570@22527L31:HuiyuanApp.kt#cyjvf");
        if ($changed == 0) goto L5;
        boolean r1 = true;
    L7:
        if ($composer2.shouldExecute(r1, $changed & 1) == true) goto L9;
        $composer2.skipToGroupEnd();
    L15:
        ScopeUpdateScope r0 = $composer2.endRestartGroup();
        if (r0 == null) goto L19;
        r0.updateScope(new HuiyuanAppKt$$ExternalSyntheticLambda16($changed));
        return;
    L19:
        return;
    L9:
        if (ComposerKt.isTraceInProgress() == false) goto L11;
        ComposerKt.traceEventStart(421571367, $changed, -1, "com.luchime.huiyuan.ui.HuiyuanAppPreview (HuiyuanApp.kt:569)");
    L11:
        ThemeKt.HuiyuanAITheme(ComposableSingletons$HuiyuanAppKt.INSTANCE.m7407getLambda$1957827056$app(), $composer2, 6);
        if (ComposerKt.isTraceInProgress() == false) goto L15;
        ComposerKt.traceEventEnd();
        goto L15
    L5:
        r1 = false;
        goto L7
    }

    private static final void HuiyuanAppLandscapePreview(Composer $composer, final int $changed) {
        Composer $composer2 = $composer.startRestartGroup(849522816);
        ComposerKt.sourceInformation($composer2, "C(HuiyuanAppLandscapePreview)576@22684L31:HuiyuanApp.kt#cyjvf");
        if ($changed == 0) goto L5;
        boolean r1 = true;
    L7:
        if ($composer2.shouldExecute(r1, $changed & 1) == true) goto L9;
        $composer2.skipToGroupEnd();
    L15:
        ScopeUpdateScope r0 = $composer2.endRestartGroup();
        if (r0 == null) goto L19;
        r0.updateScope(new HuiyuanAppKt$$ExternalSyntheticLambda27($changed));
        return;
    L19:
        return;
    L9:
        if (ComposerKt.isTraceInProgress() == false) goto L11;
        ComposerKt.traceEventStart(849522816, $changed, -1, "com.luchime.huiyuan.ui.HuiyuanAppLandscapePreview (HuiyuanApp.kt:575)");
    L11:
        ThemeKt.HuiyuanAITheme(ComposableSingletons$HuiyuanAppKt.INSTANCE.getLambda$689415095$app(), $composer2, 6);
        if (ComposerKt.isTraceInProgress() == false) goto L15;
        ComposerKt.traceEventEnd();
        goto L15
    L5:
        r1 = false;
        goto L7
    }
}
