package com.luchime.huiyuan.ui;

import android.content.Context;
import androidx.compose.animation.AnimationModifierKt;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.BorderKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.OffsetKt;
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
import androidx.compose.foundation.lazy.LazyListItemInfo;
import androidx.compose.foundation.lazy.LazyListLayoutInfo;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.foundation.lazy.LazyListStateKt;
import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.foundation.text.KeyboardActionScope;
import androidx.compose.foundation.text.KeyboardActions;
import androidx.compose.foundation.text.KeyboardOptions;
import androidx.compose.material3.AndroidAlertDialog_androidKt;
import androidx.compose.material3.ButtonColors;
import androidx.compose.material3.ButtonDefaults;
import androidx.compose.material3.ButtonKt;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.material3.OutlinedTextFieldKt;
import androidx.compose.material3.SurfaceKt;
import androidx.compose.material3.TextFieldDefaults;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.AlphaKt;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.draw.RotateKt;
import androidx.compose.ui.focus.FocusManager;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.GraphicsLayerModifierKt;
import androidx.compose.ui.graphics.GraphicsLayerScope;
import androidx.compose.ui.graphics.RectangleShapeKt;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.input.ImeAction;
import androidx.compose.ui.text.style.TextOverflow;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.TextUnitKt;
import androidx.core.app.NotificationCompat;
import androidx.core.location.LocationRequestCompat;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import androidx.profileinstaller.ProfileVerifier;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import kotlin.text.StringsKt;

/* JADX INFO: compiled from: ChatScreen.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000t\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\f\u001aí\u0001\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00070\u000b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u00012\u0006\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00122\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00020\u00152\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00070\u000b2\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00070\u00182\u0012\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00070\u000b2\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00070\u00182\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00182\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00070\u00182\u0018\u0010\u001d\u001a\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00070\u001e2\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00070\u0018H\u0001¢\u0006\u0002\u0010 \u001a'\u0010!\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\"\u001a\u00020#2\b\b\u0002\u0010$\u001a\u00020%H\u0003¢\u0006\u0002\u0010&\u001a1\u0010'\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00070\u000b2\u0006\u0010(\u001a\u00020\u0012H\u0003¢\u0006\u0002\u0010)\u001a\u0015\u0010*\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0003¢\u0006\u0002\u0010+\u001a+\u0010,\u001a\u00020\u00072\u0006\u0010-\u001a\u00020\u00102\u0006\u0010.\u001a\u00020\u00122\f\u0010/\u001a\b\u0012\u0004\u0012\u00020\u00070\u0018H\u0003¢\u0006\u0002\u00100\u001aa\u00101\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00070\u000b2\f\u00102\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010(\u001a\u00020\u00122\u0012\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00070\u000b2\f\u00103\u001a\b\u0012\u0004\u0012\u00020\u00070\u0018H\u0003¢\u0006\u0002\u00104\u001a3\u00105\u001a\u00020\u00072\u0006\u00106\u001a\u00020\t2\u0012\u00107\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00070\u000b2\b\b\u0002\u0010(\u001a\u00020\u0012H\u0003¢\u0006\u0002\u00108\u001a\u0015\u00109\u001a\u00020:2\u0006\u0010;\u001a\u00020\tH\u0002¢\u0006\u0002\u0010<\u001a\u0010\u0010=\u001a\u00020\u00022\u0006\u0010;\u001a\u00020\tH\u0002\u001a\u0010\u0010>\u001a\u00020\u00022\u0006\u0010;\u001a\u00020\tH\u0002\u001aE\u0010?\u001a\u00020\u00072\f\u00102\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010(\u001a\u00020\u00122\u0012\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00070\u000b2\f\u00103\u001a\b\u0012\u0004\u0012\u00020\u00070\u0018H\u0003¢\u0006\u0002\u0010@\u001a\u0015\u0010A\u001a\u00020\u00072\u0006\u0010;\u001a\u00020\tH\u0003¢\u0006\u0002\u0010+\u001aG\u0010B\u001a\u00020\u00072\u0006\u0010C\u001a\u00020D2\u0006\u0010E\u001a\u00020\u00122\f\u0010F\u001a\b\u0012\u0004\u0012\u00020\u00070\u00182\f\u0010G\u001a\b\u0012\u0004\u0012\u00020\u00070\u00182\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00070\u0018H\u0003¢\u0006\u0002\u0010H\u001a#\u0010I\u001a\u00020\u00072\u0006\u0010J\u001a\u00020\u00022\f\u0010K\u001a\b\u0012\u0004\u0012\u00020\u00070\u0018H\u0003¢\u0006\u0002\u0010L\u001a\u0015\u0010M\u001a\u00020\u00072\u0006\u0010N\u001a\u00020OH\u0003¢\u0006\u0002\u0010P\u001a\u007f\u0010Q\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00070\u000b2\u0006\u0010\u000e\u001a\u00020\u00022\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00070\u000b2\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00070\u00182\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00070\u00182\u0006\u0010\u0011\u001a\u00020\u00122\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00182\u0006\u0010.\u001a\u00020\u0012H\u0003¢\u0006\u0002\u0010R\u001aE\u0010S\u001a\u00020\u00072\u0006\u0010J\u001a\u00020\u00022\u0006\u0010T\u001a\u00020:2\b\b\u0002\u0010U\u001a\u00020\u00122\b\b\u0002\u0010(\u001a\u00020\u00122\u0010\b\u0002\u0010K\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0018H\u0003¢\u0006\u0004\bV\u0010W\"\u0014\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006X²\u0006\n\u0010Y\u001a\u00020\u0012X\u008a\u0084\u0002²\u0006\n\u0010Z\u001a\u00020\u0012X\u008a\u008e\u0002²\u0006\n\u0010[\u001a\u00020#X\u008a\u0084\u0002"}, d2 = {"questionPool", "", "", "piaoQuestionPool", "guiguiQuestionPool", "tangoQuestionPool", "ChatScreen", "", "selectedModel", "Lcom/luchime/huiyuan/ui/AIModel;", "onModelSelected", "Lkotlin/Function1;", "timeline", "Lcom/luchime/huiyuan/ui/TimelineItem;", "input", "chipRound", "", "isGenerating", "", "isLandscape", "favorites", "", "onInputChange", "onSend", "Lkotlin/Function0;", "onPrompt", "onRandom", "onStopGeneration", "onRefreshPrompts", "onToggleFavorite", "Lkotlin/Function2;", "onClearConversation", "(Lcom/luchime/huiyuan/ui/AIModel;Lkotlin/jvm/functions/Function1;Ljava/util/List;Ljava/lang/String;IZZLjava/util/Set;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "CollapsingModelHeader", NotificationCompat.CATEGORY_PROGRESS, "", "modifier", "Landroidx/compose/ui/Modifier;", "(Lcom/luchime/huiyuan/ui/AIModel;FLandroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "HeroHeader", "enabled", "(Lcom/luchime/huiyuan/ui/AIModel;Lkotlin/jvm/functions/Function1;ZLandroidx/compose/runtime/Composer;I)V", "MarqueeStrip", "(Lcom/luchime/huiyuan/ui/AIModel;Landroidx/compose/runtime/Composer;I)V", "ConversationToolbar", "messageCount", "compact", "onClear", "(IZLkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "LandscapePromptPanel", "questions", "onRefresh", "(Lcom/luchime/huiyuan/ui/AIModel;Lkotlin/jvm/functions/Function1;Ljava/util/List;ZLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "ModelSelector", "selected", "onSelect", "(Lcom/luchime/huiyuan/ui/AIModel;Lkotlin/jvm/functions/Function1;ZLandroidx/compose/runtime/Composer;II)V", "modelAccent", "Landroidx/compose/ui/graphics/Color;", "model", "(Lcom/luchime/huiyuan/ui/AIModel;)J", "heroEnglish", "heroSummary", "QuickPromptRow", "(Ljava/util/List;ZLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "ModelAvatar", "MessageBubble", "message", "Lcom/luchime/huiyuan/ui/TimelineItem$Message;", "favorite", "onCopy", "onShare", "(Lcom/luchime/huiyuan/ui/TimelineItem$Message;ZLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "MessageAction", "text", "onClick", "(Ljava/lang/String;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "ThinkLogBubble", "log", "Lcom/luchime/huiyuan/ui/TimelineItem$ThinkLog;", "(Lcom/luchime/huiyuan/ui/TimelineItem$ThinkLog;Landroidx/compose/runtime/Composer;I)V", "Composer", "(Lcom/luchime/huiyuan/ui/AIModel;Lkotlin/jvm/functions/Function1;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;ZLkotlin/jvm/functions/Function0;ZLandroidx/compose/runtime/Composer;I)V", "ModeChip", "color", "active", "ModeChip-8V94_ZQ", "(Ljava/lang/String;JZZLkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "app", "shouldFollowOutput", "showClearDialog", "headerCollapseProgress"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class ChatScreenKt {
    private static final List<String> guiguiQuestionPool = null;
    private static final List<String> piaoQuestionPool = null;
    private static final List<String> questionPool = null;
    private static final List<String> tangoQuestionPool = null;

    /* JADX INFO: compiled from: ChatScreen.kt */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0 = null;

        static {
            int[] r0 = new int[AIModel.values().length];
            r0[AIModel.HUIYUAN.ordinal()] = 1;     // Catch: NoSuchFieldError -> L5
        L17:
            r0[AIModel.PIAO.ordinal()] = 2;     // Catch: NoSuchFieldError -> L8
        L19:
            r0[AIModel.GUIGUI.ordinal()] = 3;     // Catch: NoSuchFieldError -> L11
        L23:
            r0[AIModel.TANGO.ordinal()] = 4;     // Catch: NoSuchFieldError -> L14
        L15:
            $EnumSwitchMapping$0 = r0;
        }
    }

    static final Unit ChatScreen$lambda$54(AIModel r20, Function1 r21, List r22, String r23, int r24, boolean r25, boolean r26, Set r27, Function1 r28, Function0 r29, Function1 r30, Function0 r31, Function0 r32, Function0 r33, Function2 r34, Function0 r35, int r36, int r37, Composer r38, int r39) {
        ChatScreen(r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r38, RecomposeScopeImplKt.updateChangedFlags(r36 | 1), RecomposeScopeImplKt.updateChangedFlags(r37));
        return Unit.INSTANCE;
    }

    static final Unit CollapsingModelHeader$lambda$59(AIModel r7, float r8, Modifier r9, int r10, int r11, Composer r12, int r13) {
        CollapsingModelHeader(r7, r8, r9, r12, RecomposeScopeImplKt.updateChangedFlags(r10 | 1), r11);
        return Unit.INSTANCE;
    }

    static final Unit Composer$lambda$137(AIModel r12, Function1 r13, String r14, Function1 r15, Function0 r16, Function0 r17, boolean r18, Function0 r19, boolean r20, int r21, Composer r22, int r23) {
        Composer(r12, r13, r14, r15, r16, r17, r18, r19, r20, r22, RecomposeScopeImplKt.updateChangedFlags(r21 | 1));
        return Unit.INSTANCE;
    }

    static final Unit ConversationToolbar$lambda$69(int r1, boolean r2, Function0 r3, int r4, Composer r5, int r6) {
        ConversationToolbar(r1, r2, r3, r5, RecomposeScopeImplKt.updateChangedFlags(r4 | 1));
        return Unit.INSTANCE;
    }

    static final Unit HeroHeader$lambda$63(AIModel r1, Function1 r2, boolean r3, int r4, Composer r5, int r6) {
        HeroHeader(r1, r2, r3, r5, RecomposeScopeImplKt.updateChangedFlags(r4 | 1));
        return Unit.INSTANCE;
    }

    static final Unit LandscapePromptPanel$lambda$82(AIModel r9, Function1 r10, List r11, boolean r12, Function1 r13, Function0 r14, int r15, Composer r16, int r17) {
        LandscapePromptPanel(r9, r10, r11, r12, r13, r14, r16, RecomposeScopeImplKt.updateChangedFlags(r15 | 1));
        return Unit.INSTANCE;
    }

    static final Unit MarqueeStrip$lambda$66(AIModel r1, int r2, Composer r3, int r4) {
        MarqueeStrip(r1, r3, RecomposeScopeImplKt.updateChangedFlags(r2 | 1));
        return Unit.INSTANCE;
    }

    static final Unit MessageAction$lambda$103(String r1, Function0 r2, int r3, Composer r4, int r5) {
        MessageAction(r1, r2, r4, RecomposeScopeImplKt.updateChangedFlags(r3 | 1));
        return Unit.INSTANCE;
    }

    static final Unit MessageBubble$lambda$102(TimelineItem.Message r8, boolean r9, Function0 r10, Function0 r11, Function0 r12, int r13, Composer r14, int r15) {
        MessageBubble(r8, r9, r10, r11, r12, r14, RecomposeScopeImplKt.updateChangedFlags(r13 | 1));
        return Unit.INSTANCE;
    }

    static final Unit ModeChip_8V94_ZQ$lambda$138(String r10, long r11, boolean r13, boolean r14, Function0 r15, int r16, int r17, Composer r18, int r19) {
        m7402ModeChip8V94_ZQ(r10, r11, r13, r14, r15, r18, RecomposeScopeImplKt.updateChangedFlags(r16 | 1), r17);
        return Unit.INSTANCE;
    }

    static final Unit ModelAvatar$lambda$97(AIModel r1, int r2, Composer r3, int r4) {
        ModelAvatar(r1, r3, RecomposeScopeImplKt.updateChangedFlags(r2 | 1));
        return Unit.INSTANCE;
    }

    static final Unit ModelSelector$lambda$87(AIModel r7, Function1 r8, boolean r9, int r10, int r11, Composer r12, int r13) {
        ModelSelector(r7, r8, r9, r12, RecomposeScopeImplKt.updateChangedFlags(r10 | 1), r11);
        return Unit.INSTANCE;
    }

    static final Unit QuickPromptRow$lambda$95(List r7, boolean r8, Function1 r9, Function0 r10, int r11, Composer r12, int r13) {
        QuickPromptRow(r7, r8, r9, r10, r12, RecomposeScopeImplKt.updateChangedFlags(r11 | 1));
        return Unit.INSTANCE;
    }

    static final Unit ThinkLogBubble$lambda$108(TimelineItem.ThinkLog r1, int r2, Composer r3, int r4) {
        ThinkLogBubble(r1, r3, RecomposeScopeImplKt.updateChangedFlags(r2 | 1));
        return Unit.INSTANCE;
    }

    public static final /* synthetic */ boolean access$ChatScreen$lambda$6(State $shouldFollowOutput$delegate) {
        return ChatScreen$lambda$6($shouldFollowOutput$delegate);
    }

    public static final /* synthetic */ void access$MessageBubble(TimelineItem.Message message, boolean favorite, Function0 onCopy, Function0 onShare, Function0 onToggleFavorite, Composer $composer, int $changed) {
        MessageBubble(message, favorite, onCopy, onShare, onToggleFavorite, $composer, $changed);
    }

    public static final /* synthetic */ void access$ThinkLogBubble(TimelineItem.ThinkLog log, Composer $composer, int $changed) {
        ThinkLogBubble(log, $composer, $changed);
    }

    static {
        questionPool = CollectionsKt.listOf(new String[]{"怎么提升认知？", "为什么认知越高越孤独？", "如何打破思维茧房？", "我想创业该注意什么？", "小成本创业怎么起步？", "怎么判断项目能不能跑通？", "AI 会取代我吗？", "普通人怎么用好 AI？", "怎么用 AI 提升效率？", "如何变得有钱？", "消费降级怎么守住钱袋子？", "普通人有必要理财吗？", "总是焦虑怎么办？", "35岁被裁员了怎么办？", "父母一直催婚我好烦怎么办？", "抓手是什么意思？", "怎么打通业务闭环？", "ROI 和北极星指标怎么定？", "内耗严重怎么破？", "怎么搞定难相处的人？", "拖延症怎么治？", "想得多做得少怎么办？", "如何坚持长期主义？", "怎么走出迷茫？"});
        piaoQuestionPool = CollectionsKt.listOf(new String[]{"朴AI，你是谁？", "deskpark主场是什么？", "电脑装机应该先选什么？", "Linux日常使用怎么入门？", "刷机之前要注意什么？", "怎么排查电脑性能瓶颈？", "超声波定向扬声器是什么？", "桌公园乐队有哪些成员？", "为什么喜欢热河路？", "李智能推荐哪首歌？", "玉兰路蛋炒饭怎么样？", "塔斯汀什么值得吃？", "加班熬夜怎么扛？", "最近有点烦，陪我聊聊", "帮我朴一朴这个项目"});
        guiguiQuestionPool = CollectionsKt.listOf(new String[]{"黄喉小青龟怎么养？", "乌龟腐皮怎么办？", "龟苗怎么过冬？", "RoboMaster比赛规则是什么？", "RM步兵和英雄怎么分工？", "怎么做自瞄视觉？", "PCB电源设计要注意什么？", "STM32怎么入门？", "CAN总线为什么抗干扰？", "自动泡茶机怎么控温？", "土家语怎么做Whisper对齐？", "西兰卡普是什么？", "跟我说句甜狗语录", "怎么哄喜欢的人？", "龟龟会什么？"});
        tangoQuestionPool = CollectionsKt.listOf(new String[]{"Linux内核怎么入门？", "Shell脚本怎么写？", "systemd是什么？", "C语言指针怎么搞懂？", "malloc和free怎么用？", "段错误怎么调试？", "艾尔登法环怎么打？", "只狼弹反有什么技巧？", "机械键盘选什么轴？", "树莓派能干什么？", "吃什么？", "蛋炒饭怎么做好吃？", "没钱了怎么办？", "长沙美食地图", "探戈你会什么？"});
    }

    public static final void ChatScreen(final AIModel selectedModel, final Function1<? super AIModel, Unit> r92, final List<? extends TimelineItem> r93, final String input, final int chipRound, final boolean isGenerating, final boolean isLandscape, final Set<String> r98, final Function1<? super String, Unit> r99, final Function0<Unit> r100, final Function1<? super String, Unit> r101, final Function0<Unit> r102, final Function0<Unit> r103, final Function0<Unit> r104, final Function2<? super String, ? super String, Unit> r105, final Function0<Unit> r106, Composer $composer, final int $changed, final int $changed1) {
        Intrinsics.checkNotNullParameter(selectedModel, "selectedModel");
        Intrinsics.checkNotNullParameter(r92, "onModelSelected");
        Intrinsics.checkNotNullParameter(r93, "timeline");
        Intrinsics.checkNotNullParameter(input, "input");
        Intrinsics.checkNotNullParameter(r98, "favorites");
        Intrinsics.checkNotNullParameter(r99, "onInputChange");
        Intrinsics.checkNotNullParameter(r100, "onSend");
        Intrinsics.checkNotNullParameter(r101, "onPrompt");
        Intrinsics.checkNotNullParameter(r102, "onRandom");
        Intrinsics.checkNotNullParameter(r103, "onStopGeneration");
        Intrinsics.checkNotNullParameter(r104, "onRefreshPrompts");
        Intrinsics.checkNotNullParameter(r105, "onToggleFavorite");
        Intrinsics.checkNotNullParameter(r106, "onClearConversation");
        Composer $composer2 = $composer.startRestartGroup(-1639379255);
        ComposerKt.sourceInformation($composer2, "C(ChatScreen)P(14,7,15,2!1,3,4!1,6,11,8,9,12,10,13)125@5031L7,126@5080L7,127@5108L23,128@5159L287,146@5887L262,153@6184L7,154@6219L34,155@6288L241,165@6603L214,165@6535L282,172@6859L222,172@6823L258:ChatScreen.kt#cyjvf");
        int $dirty1 = $changed1;
        if (($changed & 6) == 0) goto L5;
        int $dirty = $changed;
    L10:
        int $dirty2 = $dirty;
        if (($changed & 48) == 0) goto L13;
        int $dirty3 = $dirty2;
    L19:
        if (($changed & 384) != 0) goto L26;
        if ($composer2.changedInstance(r93) == false) goto L23;
        int r12 = 256;
    L24:
        $dirty3 = $dirty3 | r12;
        goto L26
    L23:
        r12 = 128;
    L26:
        if (($changed & 3072) != 0) goto L33;
        if ($composer2.changed(input) == false) goto L30;
        int r13 = 2048;
    L31:
        $dirty3 = $dirty3 | r13;
        goto L33
    L30:
        r13 = 1024;
    L33:
        if (($changed & 24576) != 0) goto L41;
        if ($composer2.changed(chipRound) == false) goto L37;
        int r19 = 16384;
    L38:
        $dirty3 = $dirty3 | r19;
        goto L41
    L37:
        r19 = 8192;
    L41:
        if (($changed & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) != 0) goto L48;
        if ($composer2.changed(isGenerating) == false) goto L45;
        int r110 = 131072;
    L46:
        $dirty3 = $dirty3 | r110;
        goto L48
    L45:
        r110 = 65536;
    L48:
        if (($changed & 1572864) != 0) goto L56;
        if ($composer2.changed(isLandscape) == false) goto L52;
        int r111 = 1048576;
    L53:
        $dirty3 = $dirty3 | r111;
        goto L56
    L52:
        r111 = 524288;
    L56:
        if (($changed & 12582912) != 0) goto L63;
        if ($composer2.changedInstance(r98) == false) goto L60;
        int r112 = 8388608;
    L61:
        $dirty3 = $dirty3 | r112;
        goto L63
    L60:
        r112 = 4194304;
    L63:
        if (($changed & 100663296) != 0) goto L70;
        if ($composer2.changedInstance(r99) == false) goto L67;
        int r113 = AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
    L68:
        $dirty3 = $dirty3 | r113;
        goto L70
    L67:
        r113 = 33554432;
    L70:
        if (($changed & 805306368) == 0) goto L72;
    L76:
        int $dirty4 = $dirty3;
        if (($changed1 & 6) != 0) goto L84;
        if ($composer2.changedInstance(r101) == false) goto L81;
        int r17 = 4;
    L82:
        $dirty1 = $dirty1 | r17;
        goto L84
    L81:
        r17 = 2;
    L84:
        if (($changed1 & 48) != 0) goto L91;
        if ($composer2.changedInstance(r102) == false) goto L88;
        int r18 = 32;
    L89:
        $dirty1 = $dirty1 | r18;
        goto L91
    L88:
        r18 = 16;
    L91:
        if (($changed1 & 384) != 0) goto L98;
        if ($composer2.changedInstance(r103) == false) goto L95;
        int r1 = 256;
    L96:
        $dirty1 = $dirty1 | r1;
        goto L98
    L95:
        r1 = 128;
    L98:
        if (($changed1 & 3072) != 0) goto L105;
        if ($composer2.changedInstance(r104) == false) goto L102;
        int r2 = 2048;
    L103:
        $dirty1 = $dirty1 | r2;
        goto L105
    L102:
        r2 = 1024;
    L105:
        if (($changed1 & 24576) != 0) goto L112;
        if ($composer2.changedInstance(r105) == false) goto L109;
        int r3 = 16384;
    L110:
        $dirty1 = $dirty1 | r3;
        goto L112
    L109:
        r3 = 8192;
    L112:
        if ((196608 & $changed1) == 0) goto L114;
    L118:
        int $dirty5 = $dirty1;
        if (($dirty4 & 306783379) == 306783378) goto L121;
    L124:
        boolean r4 = true;
    L126:
        if ($composer2.shouldExecute(r4, $dirty4 & 1) == true) goto L128;
        int $dirty6 = $dirty5;
        final Function0<Unit> r11 = r100;
        $composer2.skipToGroupEnd();
    L371:
        ScopeUpdateScope r5 = $composer2.endRestartGroup();
        if (r5 == null) goto L375;
        final Function0<Unit> r10 = r11;
        r5.updateScope(new ChatScreenKt$$ExternalSyntheticLambda30(selectedModel, r92, r93, input, chipRound, isGenerating, isLandscape, r98, r99, r10, r101, r102, r103, r104, r105, r106, $changed, $changed1));
        return;
    L375:
        return;
    L128:
        if (ComposerKt.isTraceInProgress() == false) goto L130;
        ComposerKt.traceEventStart(-1639379255, $dirty4, $dirty5, "com.luchime.huiyuan.ui.ChatScreen (ChatScreen.kt:124)");
    L130:
        ProvidableCompositionLocal<Context> r6 = AndroidCompositionLocals_androidKt.getLocalContext();
        ComposerKt.sourceInformationMarkerStart($composer2, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
        Object r7 = $composer2.consume(r6);
        ComposerKt.sourceInformationMarkerEnd($composer2);
        final Context context = (Context) r7;
        ProvidableCompositionLocal<FocusManager> r8 = CompositionLocalsKt.getLocalFocusManager();
        ComposerKt.sourceInformationMarkerStart($composer2, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
        Object r9 = $composer2.consume(r8);
        ComposerKt.sourceInformationMarkerEnd($composer2);
        final FocusManager focusManager = (FocusManager) r9;
        final LazyListState listState = LazyListStateKt.rememberLazyListState(0, 0, $composer2, 0, 3);
        ComposerKt.sourceInformationMarkerStart($composer2, 809556040, "CC(remember):ChatScreen.kt#9igjgp");
        if (($dirty4 & 57344) != 16384) goto L133;
        boolean r14 = true;
    L134:
        boolean r16 = r14;
        if (($dirty4 & 14) != 4) goto L137;
        boolean r15 = true;
    L138:
        boolean r20 = r16 | r15;
        Object r21 = $composer2.rememberedValue();
        if (r20 == true) goto L145;
        if (r21 == Composer.Companion.getEmpty()) goto L145;
    L153:
        List visibleQuestions = (List) r21;
        ComposerKt.sourceInformationMarkerEnd($composer2);
        Iterator<T> r22 = r93.iterator();
        int r23 = 0;
    L155:
        if (r22.hasNext() == false) goto L161;
        TimelineItem r24 = (TimelineItem) r22.next();
        List visibleQuestions2 = visibleQuestions;
        if ((r24 instanceof TimelineItem.ThinkLog) == false) goto L159;
        int r25 = ((TimelineItem.ThinkLog) r24).getLines().size();
    L160:
        r23 = r23 + r25;
        visibleQuestions = visibleQuestions2;
        goto L155
    L159:
        r25 = 0;
        goto L160
    L161:
        List visibleQuestions3 = visibleQuestions;
        int visibleThinkLines = r23;
        Iterator r26 = r93.iterator();
        int r27 = 0;
    L163:
        if (r26.hasNext() == false) goto L171;
        TimelineItem r28 = (TimelineItem) r26.next();
        Iterator r114 = r26;
        if ((r28 instanceof TimelineItem.Message) == true) goto L167;
    L169:
        int r29 = 0;
    L170:
        r27 = r27 + r29;
        r26 = r114;
        goto L163
    L167:
        if (((TimelineItem.Message) r28).isStreaming() == false) goto L169;
        r29 = ((TimelineItem.Message) r28).getText().length() / 8;
        goto L170
    L171:
        int streamingProgress = r27;
        List<? extends TimelineItem> r30 = r93;
        int r31 = 0;
        Collection r32 = new ArrayList();
        Iterator r115 = r30.iterator();
    L173:
        if (r115.hasNext() == false) goto L178;
        Iterable r116 = r30;
        Object r33 = r115.next();
        int r210 = r31;
        if ((r33 instanceof TimelineItem.Message) == false) goto L177;
        r32.add(r33);
    L177:
        r30 = r116;
        r31 = r210;
        goto L173
    L178:
        List r34 = (List) r32;
        ListIterator r35 = r34.listIterator(r34.size());
    L180:
        if (r35.hasPrevious() == false) goto L184;
        Object r117 = r35.previous();
        if (((TimelineItem.Message) r117).isUser() == false) goto L180;
    L185:
        TimelineItem.Message r118 = (TimelineItem.Message) r117;
        if (r118 == null) goto L188;
        Long latestUserMessageId = Long.valueOf(r118.getId());
    L189:
        ComposerKt.sourceInformationMarkerStart($composer2, 809579311, "CC(remember):ChatScreen.kt#9igjgp");
        Object r36 = $composer2.rememberedValue();
        if (r36 != Composer.Companion.getEmpty()) goto L193;
        Object r37 = SnapshotStateKt.derivedStateOf(new ChatScreenKt$$ExternalSyntheticLambda29(listState));
        $composer2.updateRememberedValue(r37);
        r36 = r37;
    L193:
        State shouldFollowOutput$delegate = (State) r36;
        ComposerKt.sourceInformationMarkerEnd($composer2);
        ProvidableCompositionLocal<AppHaptics> r38 = AppHapticsKt.getLocalAppHaptics();
        ComposerKt.sourceInformationMarkerStart($composer2, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
        Object r39 = $composer2.consume(r38);
        ComposerKt.sourceInformationMarkerEnd($composer2);
        final AppHaptics haptics = (AppHaptics) r39;
        ComposerKt.sourceInformationMarkerStart($composer2, 809589707, "CC(remember):ChatScreen.kt#9igjgp");
        Object r40 = $composer2.rememberedValue();
        if (r40 != Composer.Companion.getEmpty()) goto L197;
        r40 = SnapshotStateKt.mutableStateOf$default(false, null, 2, null);
        $composer2.updateRememberedValue(r40);
    L197:
        final MutableState showClearDialog$delegate = (MutableState) r40;
        ComposerKt.sourceInformationMarkerEnd($composer2);
        ComposerKt.sourceInformationMarkerStart($composer2, 809592122, "CC(remember):ChatScreen.kt#9igjgp");
        Object r41 = $composer2.rememberedValue();
        if (r41 != Composer.Companion.getEmpty()) goto L201;
        r41 = SnapshotStateKt.derivedStateOf(new ChatScreenKt$$ExternalSyntheticLambda31(listState));
        $composer2.updateRememberedValue(r41);
    L201:
        State headerCollapseProgress$delegate = (State) r41;
        ComposerKt.sourceInformationMarkerEnd($composer2);
        Integer r119 = Integer.valueOf(r93.size());
        Integer r120 = Integer.valueOf(visibleThinkLines);
        Integer r121 = Integer.valueOf(streamingProgress);
        ComposerKt.sourceInformationMarkerStart($composer2, 809602175, "CC(remember):ChatScreen.kt#9igjgp");
        boolean r42 = $composer2.changed(listState);
        Object r43 = $composer2.rememberedValue();
        if (r42 == true) goto L207;
        Composer $composer3 = $composer2;
        if (r43 != Composer.Companion.getEmpty()) goto L209;
    L208:
        Object r0 = (Function2) new ChatScreenKt$ChatScreen$1$1(listState, shouldFollowOutput$delegate, null);
        $composer2.updateRememberedValue(r0);
        r43 = r0;
    L209:
        ComposerKt.sourceInformationMarkerEnd($composer3);
        Composer $composer4 = $composer3;
        EffectsKt.LaunchedEffect(r119, r120, r121, (Function2) r43, $composer4, 0);
        ComposerKt.sourceInformationMarkerStart($composer4, 809610375, "CC(remember):ChatScreen.kt#9igjgp");
        boolean r44 = $composer4.changed(latestUserMessageId) | $composer4.changed(listState);
        Object r45 = $composer4.rememberedValue();
        if (r44 == true) goto L216;
        if (r45 == Composer.Companion.getEmpty()) goto L216;
    L217:
        ComposerKt.sourceInformationMarkerEnd($composer4);
        EffectsKt.LaunchedEffect(latestUserMessageId, (Function2) r45, $composer4, 0);
        if (isLandscape == false) goto L293;
        $composer4.startReplaceGroup(-671567716);
        ComposerKt.sourceInformation($composer4, "180@7114L2509");
        Modifier r122 = SizeKt.fillMaxSize$default(Modifier.Companion, 0.0f, 1, null);
        ComposerKt.sourceInformationMarkerStart($composer4, 693286680, "CC(Row)P(2,1,3)99@5124L58,100@5187L130:Row.kt#2w3rfo");
        MeasurePolicy r46 = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), Alignment.Companion.getTop(), $composer4, ((6 >> 3) & 14) | ((6 >> 3) & 112));
        ComposerKt.sourceInformationMarkerStart($composer4, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
        int r47 = ComposablesKt.getCurrentCompositeKeyHash($composer4, 0);
        CompositionLocalMap r48 = $composer4.getCurrentCompositionLocalMap();
        Modifier r123 = ComposedModifierKt.materializeModifier($composer4, r122);
        Function0<ComposeUiNode> r310 = ComposeUiNode.Companion.getConstructor();
        int r49 = ((((6 << 3) & 112) << 6) & 896) | 6;
        ComposerKt.sourceInformationMarkerStart($composer4, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
        if (($composer4.getApplier() instanceof Applier) == true) goto L222;
        ComposablesKt.invalidApplier();
    L222:
        $composer4.startReusableNode();
        if ($composer4.getInserting() == false) goto L225;
        $composer4.createNode(r310);
    L226:
        Composer r50 = Updater.m3808constructorimpl($composer4);
        Updater.m3815setimpl(r50, r46, ComposeUiNode.Companion.getSetMeasurePolicy());
        Updater.m3815setimpl(r50, r48, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> r51 = ComposeUiNode.Companion.getSetCompositeKeyHash();
        if (r50.getInserting() == true) goto L232;
        CompositionLocalMap r53 = r48;
        String r54 = "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp";
        if (Intrinsics.areEqual(r50.rememberedValue(), Integer.valueOf(r47)) == true) goto L234;
    L233:
        r50.updateRememberedValue(Integer.valueOf(r47));
        r50.apply(Integer.valueOf(r47), r51);
    L234:
        Updater.m3815setimpl(r50, r123, ComposeUiNode.Companion.getSetModifier());
        int r52 = (r49 >> 6) & 14;
        ComposerKt.sourceInformationMarkerStart($composer4, -407735110, "C101@5232L9:Row.kt#2w3rfo");
        int r55 = ((6 >> 6) & 112) | 6;
        RowScope r56 = RowScopeInstance.INSTANCE;
        ComposerKt.sourceInformationMarkerStart($composer4, -575633747, "C181@7167L302,189@7482L2131:ChatScreen.kt#cyjvf");
        Composer $composer5 = $composer4;
        LandscapePromptPanel(selectedModel, r92, visibleQuestions3, !isGenerating, r101, r104, $composer4, ((($dirty4 & 14) | ($dirty4 & 112)) | (($dirty5 << 12) & 57344)) | (($dirty5 << 6) & 458752));
        Modifier r57 = WindowInsetsPadding_androidKt.statusBarsPadding(SizeKt.fillMaxHeight$default(RowScope.weight$default(r56, Modifier.Companion, 1.0f, false, 2, null), 0.0f, 1, null));
        ComposerKt.sourceInformationMarkerStart($composer4, -483455358, "CC(Column)P(2,3,1)87@4442L61,88@4508L133:Column.kt#2w3rfo");
        MeasurePolicy r58 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.Companion.getStart(), $composer4, ((0 >> 3) & 14) | ((0 >> 3) & 112));
        ComposerKt.sourceInformationMarkerStart($composer4, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
        int r71 = ComposablesKt.getCurrentCompositeKeyHash($composer4, 0);
        CompositionLocalMap r59 = $composer4.getCurrentCompositionLocalMap();
        Modifier r60 = ComposedModifierKt.materializeModifier($composer4, r57);
        Function0<ComposeUiNode> r61 = ComposeUiNode.Companion.getConstructor();
        int r62 = ((((0 << 3) & 112) << 6) & 896) | 6;
        ComposerKt.sourceInformationMarkerStart($composer4, -692256719, r54);
        if (($composer4.getApplier() instanceof Applier) == true) goto L237;
        ComposablesKt.invalidApplier();
    L237:
        $composer4.startReusableNode();
        if ($composer4.getInserting() == false) goto L240;
        $composer4.createNode(r61);
    L241:
        Composer r63 = Updater.m3808constructorimpl($composer4);
        Updater.m3815setimpl(r63, r58, ComposeUiNode.Companion.getSetMeasurePolicy());
        Updater.m3815setimpl(r63, r59, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> r124 = ComposeUiNode.Companion.getSetCompositeKeyHash();
        if (r63.getInserting() == true) goto L247;
        Composer r74 = $composer4;
        if (Intrinsics.areEqual(r63.rememberedValue(), Integer.valueOf(r71)) == true) goto L249;
    L248:
        r63.updateRememberedValue(Integer.valueOf(r71));
        r63.apply(Integer.valueOf(r71), r124);
    L249:
        Updater.m3815setimpl(r63, r60, ComposeUiNode.Companion.getSetModifier());
        int r125 = (r62 >> 6) & 14;
        Composer r64 = r74;
        ComposerKt.sourceInformationMarkerStart(r64, -384672921, "C89@4556L9:Column.kt#2w3rfo");
        int r77 = ((0 >> 6) & 112) | 6;
        ColumnScope r311 = ColumnScopeInstance.INSTANCE;
        ComposerKt.sourceInformationMarkerStart(r64, -1468478694, "C198@7837L26,195@7668L213,204@8085L959,200@7898L1146,228@9292L106,223@9061L538:ChatScreen.kt#cyjvf");
        List<? extends TimelineItem> r65 = r93;
        if ((r65 instanceof Collection) == true) goto L252;
    L254:
        int r66 = 0;
        Iterator r312 = r65.iterator();
    L256:
        if (r312.hasNext() == false) goto L264;
        int r313 = r66;
        if ((((TimelineItem) r312.next()) instanceof TimelineItem.Message) == true) goto L259;
        r66 = r313;
        goto L256
    L259:
        r66 = r313 + 1;
        if (r66 >= 0) goto L256;
        CollectionsKt.throwCountOverflow();
    L264:
        ComposerKt.sourceInformationMarkerStart(r64, 1615201208, "CC(remember):ChatScreen.kt#9igjgp");
        Object r67 = r64.rememberedValue();
        if (r67 != Composer.Companion.getEmpty()) goto L268;
        r67 = new ChatScreenKt$$ExternalSyntheticLambda32(showClearDialog$delegate);
        r64.updateRememberedValue(r67);
    L268:
        ComposerKt.sourceInformationMarkerEnd(r64);
        ConversationToolbar(r66, true, (Function0) r67, r64, 432);
        Modifier r68 = ColumnScope.weight$default(r311, Modifier.Companion, 1.0f, false, 2, null);
        PaddingValues r314 = PaddingKt.m722PaddingValuesa9UjIt4$default(0.0f, 0.0f, 0.0f, Dp.m6973constructorimpl(8), 7, null);
        ComposerKt.sourceInformationMarkerStart(r64, 1615210077, "CC(remember):ChatScreen.kt#9igjgp");
        boolean r69 = ($composer5.changedInstance(r93) | $composer5.changedInstance(r98)) | $composer5.changedInstance(context);
        if (($dirty5 & 57344) != 16384) goto L271;
        boolean r70 = true;
    L272:
        boolean r72 = r69 | r70;
        Object r73 = r64.rememberedValue();
        if (r72 == true) goto L279;
        if (r73 == Composer.Companion.getEmpty()) goto L279;
    L280:
        ComposerKt.sourceInformationMarkerEnd(r64);
        LazyDslKt.LazyColumn(r68, listState, r314, false, null, null, null, false, null, (Function1) r73, r64, 384, 504);
        ComposerKt.sourceInformationMarkerStart(r64, 1615247848, "CC(remember):ChatScreen.kt#9igjgp");
        boolean r75 = $composer5.changedInstance(focusManager);
        if (($dirty4 & 1879048192) != 536870912) goto L283;
        boolean r211 = true;
    L284:
        boolean r76 = r75 | r211;
        Object r78 = r64.rememberedValue();
        if (r76 == true) goto L290;
        Composer r315 = r64;
        if (r78 != Composer.Companion.getEmpty()) goto L292;
    L291:
        r78 = new ChatScreenKt$$ExternalSyntheticLambda34(focusManager, r100);
        r64.updateRememberedValue(r78);
    L292:
        ComposerKt.sourceInformationMarkerEnd(r315);
        String r126 = "CC(remember):ChatScreen.kt#9igjgp";
        Composer r79 = r315;
        Composer(selectedModel, r92, input, r99, (Function0) r78, r102, isGenerating, r103, true, r79, ((((((($dirty4 & 14) | 100663296) | ($dirty4 & 112)) | (($dirty4 >> 3) & 896)) | (($dirty4 >> 15) & 7168)) | (($dirty5 << 12) & 458752)) | (($dirty4 << 3) & 3670016)) | (($dirty5 << 15) & 29360128));
        ComposerKt.sourceInformationMarkerEnd(r79);
        ComposerKt.sourceInformationMarkerEnd(r64);
        r74.endNode();
        ComposerKt.sourceInformationMarkerEnd(r74);
        ComposerKt.sourceInformationMarkerEnd(r74);
        ComposerKt.sourceInformationMarkerEnd(r74);
        ComposerKt.sourceInformationMarkerEnd($composer4);
        ComposerKt.sourceInformationMarkerEnd($composer4);
        $composer4.endNode();
        ComposerKt.sourceInformationMarkerEnd($composer4);
        ComposerKt.sourceInformationMarkerEnd($composer4);
        ComposerKt.sourceInformationMarkerEnd($composer4);
        $composer5.endReplaceGroup();
        r11 = r100;
        MutableState showClearDialog$delegate2 = showClearDialog$delegate;
        $dirty6 = $dirty5;
    L360:
        if (ChatScreen$lambda$8(showClearDialog$delegate2) == false) goto L366;
        $composer5.startReplaceGroup(-666326577);
        ComposerKt.sourceInformation($composer5, "308@12494L27,311@12674L283,318@12987L196,307@12450L826");
        long r212 = HuiyuanDesignKt.getPaper();
        RoundedCornerShape r80 = RoundedCornerShapeKt.m1018RoundedCornerShape0680j_4(Dp.m6973constructorimpl(16));
        ComposerKt.sourceInformationMarkerStart($composer5, 809790500, r126);
        Composer r81 = $composer5;
        Object r82 = r81.rememberedValue();
        if (r82 != Composer.Companion.getEmpty()) goto L364;
        final MutableState showClearDialog$delegate3 = showClearDialog$delegate2;
        Object r83 = new ChatScreenKt$$ExternalSyntheticLambda37(showClearDialog$delegate3);
        r81.updateRememberedValue(r83);
        r82 = r83;
    L365:
        ComposerKt.sourceInformationMarkerEnd($composer5);
        Composer $composer6 = $composer5;
        AndroidAlertDialog_androidKt.m1889AlertDialogOix01E0((Function0) r82, ComposableLambdaKt.rememberComposableLambda(-1999000877, true, new ChatScreenKt$$ExternalSyntheticLambda38(haptics, r106, showClearDialog$delegate3), $composer5, 54), null, ComposableLambdaKt.rememberComposableLambda(-196865007, true, new ChatScreenKt$$ExternalSyntheticLambda39(haptics, showClearDialog$delegate3), $composer5, 54), null, ComposableSingletons$ChatScreenKt.INSTANCE.getLambda$1605270863$app(), ComposableSingletons$ChatScreenKt.INSTANCE.m7406getLambda$1788628498$app(), r80, r212, 0, 0, 0, 0.0f, null, $composer6, 102435894, 0, 15892);
        $composer2 = $composer6;
    L367:
        $composer2.endReplaceGroup();
        if (ComposerKt.isTraceInProgress() == false) goto L371;
        ComposerKt.traceEventEnd();
        goto L371
    L364:
        showClearDialog$delegate3 = showClearDialog$delegate2;
        goto L365
    L366:
        $composer2 = $composer5;
        $composer2.startReplaceGroup(-678694151);
        goto L367
    L290:
        r315 = r64;
        goto L291
    L283:
        r211 = false;
    L279:
        r73 = new ChatScreenKt$$ExternalSyntheticLambda33(r93, r98, context, r105);
        r64.updateRememberedValue(r73);
        goto L280
    L271:
        r70 = false;
        goto L272
    L252:
        if (r65.isEmpty() == false) goto L254;
        r66 = 0;
        goto L264
    L247:
        r74 = $composer4;
        goto L248
    L240:
        $composer4.useNode();
        goto L241
    L232:
        r53 = r48;
        r54 = "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp";
        goto L233
    L225:
        $composer4.useNode();
        goto L226
    L293:
        $composer5 = $composer4;
        r126 = r4;
        $dirty6 = $dirty5;
        $composer5.startReplaceGroup(-669049121);
        ComposerKt.sourceInformation($composer5, "240@9645L2762");
        Modifier r127 = SizeKt.fillMaxSize$default(Modifier.Companion, 0.0f, 1, null);
        ComposerKt.sourceInformationMarkerStart($composer5, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
        MeasurePolicy r84 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.getTopStart(), false);
        ComposerKt.sourceInformationMarkerStart($composer5, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
        int r213 = ComposablesKt.getCurrentCompositeKeyHash($composer5, 0);
        CompositionLocalMap r85 = $composer5.getCurrentCompositionLocalMap();
        Modifier r86 = ComposedModifierKt.materializeModifier($composer5, r127);
        Function0<ComposeUiNode> r87 = ComposeUiNode.Companion.getConstructor();
        int r88 = ((((6 << 3) & 112) << 6) & 896) | 6;
        ComposerKt.sourceInformationMarkerStart($composer5, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
        if (($composer5.getApplier() instanceof Applier) == true) goto L296;
        ComposablesKt.invalidApplier();
    L296:
        $composer5.startReusableNode();
        if ($composer5.getInserting() == false) goto L299;
        $composer5.createNode(r87);
    L300:
        Composer r89 = Updater.m3808constructorimpl($composer5);
        Updater.m3815setimpl(r89, r84, ComposeUiNode.Companion.getSetMeasurePolicy());
        Updater.m3815setimpl(r89, r85, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> r90 = ComposeUiNode.Companion.getSetCompositeKeyHash();
        if (r89.getInserting() == true) goto L307;
        if (Intrinsics.areEqual(r89.rememberedValue(), Integer.valueOf(r213)) == false) goto L307;
    L308:
        Updater.m3815setimpl(r89, r86, ComposeUiNode.Companion.getSetModifier());
        int r510 = (r88 >> 6) & 14;
        ComposerKt.sourceInformationMarkerStart($composer5, -2146730711, "C72@3468L9:Box.kt#2w3rfo");
        int r511 = ((6 >> 6) & 112) | 6;
        BoxScope r91 = BoxScopeInstance.INSTANCE;
        ComposerKt.sourceInformationMarkerStart($composer5, -90954427, "C241@9698L2488,298@12200L197:ChatScreen.kt#cyjvf");
        Modifier r512 = SizeKt.fillMaxSize$default(Modifier.Companion, 0.0f, 1, null);
        ComposerKt.sourceInformationMarkerStart($composer5, -483455358, "CC(Column)P(2,3,1)87@4442L61,88@4508L133:Column.kt#2w3rfo");
        MeasurePolicy r94 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.Companion.getStart(), $composer5, ((6 >> 3) & 14) | ((6 >> 3) & 112));
        ComposerKt.sourceInformationMarkerStart($composer5, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
        int r214 = ComposablesKt.getCurrentCompositeKeyHash($composer5, 0);
        CompositionLocalMap r95 = $composer5.getCurrentCompositionLocalMap();
        Modifier r128 = ComposedModifierKt.materializeModifier($composer5, r512);
        Function0<ComposeUiNode> r316 = ComposeUiNode.Companion.getConstructor();
        int r96 = ((((6 << 3) & 112) << 6) & 896) | 6;
        ComposerKt.sourceInformationMarkerStart($composer5, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
        if (($composer5.getApplier() instanceof Applier) == true) goto L311;
        ComposablesKt.invalidApplier();
    L311:
        $composer5.startReusableNode();
        if ($composer5.getInserting() == false) goto L314;
        $composer5.createNode(r316);
    L315:
        Composer r97 = Updater.m3808constructorimpl($composer5);
        Updater.m3815setimpl(r97, r94, ComposeUiNode.Companion.getSetMeasurePolicy());
        Updater.m3815setimpl(r97, r95, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> r107 = ComposeUiNode.Companion.getSetCompositeKeyHash();
        if (r97.getInserting() == true) goto L321;
        CompositionLocalMap r610 = r95;
        Function0<ComposeUiNode> r611 = r316;
        if (Intrinsics.areEqual(r97.rememberedValue(), Integer.valueOf(r214)) == true) goto L323;
    L322:
        r97.updateRememberedValue(Integer.valueOf(r214));
        r97.apply(Integer.valueOf(r214), r107);
    L323:
        Updater.m3815setimpl(r97, r128, ComposeUiNode.Companion.getSetModifier());
        int r129 = (r96 >> 6) & 14;
        ComposerKt.sourceInformationMarkerStart($composer5, -384672921, "C89@4556L9:Column.kt#2w3rfo");
        int r612 = ((6 >> 6) & 112) | 6;
        ColumnScope r710 = ColumnScopeInstance.INSTANCE;
        ComposerKt.sourceInformationMarkerStart($composer5, -1030434804, "C246@9946L1433,242@9758L1621,275@11397L218,287@11864L106,282@11633L539:ChatScreen.kt#cyjvf");
        Modifier r317 = ColumnScope.weight$default(r710, Modifier.Companion, 1.0f, false, 2, null);
        PaddingValues r711 = PaddingKt.m722PaddingValuesa9UjIt4$default(0.0f, 0.0f, 0.0f, Dp.m6973constructorimpl(14), 7, null);
        ComposerKt.sourceInformationMarkerStart($composer5, -587424126, r126);
        if (($dirty4 & 14) != 4) goto L326;
        boolean r108 = true;
    L328:
        if (($dirty4 & 112) != 32) goto L330;
        boolean r109 = true;
    L331:
        boolean r130 = r109 | r108;
        if (($dirty4 & 458752) != 131072) goto L334;
        boolean r131 = true;
    L335:
        boolean r132 = (((r130 | r131) | $composer5.changedInstance(r93)) | $composer5.changedInstance(r98)) | $composer5.changedInstance(context);
        if (($dirty6 & 57344) != 16384) goto L338;
        boolean r133 = true;
    L339:
        boolean r134 = r132 | r133;
        Object r135 = $composer5.rememberedValue();
        if (r134 == true) goto L345;
        Composer r1010 = $composer5;
        if (r135 == Composer.Companion.getEmpty()) goto L346;
        MutableState showClearDialog$delegate4 = showClearDialog$delegate;
        Composer r318 = r1010;
    L347:
        ComposerKt.sourceInformationMarkerEnd(r318);
        LazyDslKt.LazyColumn(r317, listState, r711, false, null, null, null, false, null, (Function1) r135, r318, 384, 504);
        Composer r136 = r318;
        QuickPromptRow(visibleQuestions3, !isGenerating, r101, r104, r136, (($dirty6 << 6) & 896) | ($dirty6 & 7168));
        ComposerKt.sourceInformationMarkerStart(r136, -587364077, r126);
        boolean r137 = $composer5.changedInstance(focusManager);
        if (($dirty4 & 1879048192) != 536870912) goto L350;
        boolean r613 = true;
    L351:
        boolean r138 = r137 | r613;
        Object r139 = r136.rememberedValue();
        if (r138 == false) goto L354;
    L357:
        r11 = r100;
        Object r140 = new ChatScreenKt$$ExternalSyntheticLambda36(focusManager, r11);
        r136.updateRememberedValue(r140);
        r139 = r140;
    L358:
        ComposerKt.sourceInformationMarkerEnd(r136);
        showClearDialog$delegate2 = showClearDialog$delegate4;
        Composer(selectedModel, r92, input, r99, (Function0) r139, r102, isGenerating, r103, false, r136, ((((((($dirty4 & 14) | 100663296) | ($dirty4 & 112)) | (($dirty4 >> 3) & 896)) | (($dirty4 >> 15) & 7168)) | (($dirty6 << 12) & 458752)) | (($dirty4 << 3) & 3670016)) | (29360128 & ($dirty6 << 15)));
        ComposerKt.sourceInformationMarkerEnd(r136);
        ComposerKt.sourceInformationMarkerEnd($composer5);
        r40.endNode();
        ComposerKt.sourceInformationMarkerEnd(r40);
        ComposerKt.sourceInformationMarkerEnd(r40);
        ComposerKt.sourceInformationMarkerEnd($composer5);
        CollapsingModelHeader(selectedModel, ChatScreen$lambda$12(headerCollapseProgress$delegate), r91.align(Modifier.Companion, Alignment.Companion.getTopCenter()), $composer5, $dirty4 & 14, 0);
        ComposerKt.sourceInformationMarkerEnd($composer5);
        ComposerKt.sourceInformationMarkerEnd($composer5);
        $composer5.endNode();
        ComposerKt.sourceInformationMarkerEnd($composer5);
        ComposerKt.sourceInformationMarkerEnd($composer5);
        ComposerKt.sourceInformationMarkerEnd($composer5);
        $composer5.endReplaceGroup();
        goto L360
    L354:
        if (r139 == Composer.Companion.getEmpty()) goto L357;
        r11 = r100;
        goto L358
    L350:
        r613 = false;
    L346:
        r318 = r1010;
        r135 = new ChatScreenKt$$ExternalSyntheticLambda35(r93, selectedModel, r92, isGenerating, showClearDialog$delegate, r98, context, r105);
        showClearDialog$delegate4 = showClearDialog$delegate;
        $composer5.updateRememberedValue(r135);
        goto L347
    L345:
        r1010 = $composer5;
        goto L346
    L338:
        r133 = false;
        goto L339
    L334:
        r131 = false;
        goto L335
    L330:
        r109 = false;
        goto L331
    L326:
        r108 = false;
        goto L328
    L321:
        r610 = r95;
        r611 = r316;
        goto L322
    L314:
        $composer5.useNode();
    L307:
        r89.updateRememberedValue(Integer.valueOf(r213));
        r89.apply(Integer.valueOf(r213), r90);
        goto L308
    L299:
        $composer5.useNode();
    L216:
        Object r141 = (Function2) new ChatScreenKt$ChatScreen$2$1(latestUserMessageId, listState, null);
        $composer4.updateRememberedValue(r141);
        r45 = r141;
        goto L217
    L207:
        $composer3 = $composer2;
        goto L208
    L188:
        latestUserMessageId = null;
        goto L189
    L184:
        r117 = null;
    L145:
        switch(WhenMappings.$EnumSwitchMapping$0[selectedModel.ordinal()]) {
            case 1: goto L151;
            case 2: goto L150;
            case 3: goto L149;
            case 4: goto L148;
            default: goto L147;
        };
    L148:
        List<String> r215 = tangoQuestionPool;
    L152:
        r21 = CollectionsKt.take(CollectionsKt.shuffled(r215), 6);
        $composer2.updateRememberedValue(r21);
        goto L153
    L149:
        r215 = guiguiQuestionPool;
        goto L152
    L150:
        r215 = piaoQuestionPool;
        goto L152
    L151:
        r215 = questionPool;
        goto L152
    L147:
        throw new NoWhenBranchMatchedException();
    L137:
        r15 = false;
        goto L138
    L133:
        r14 = false;
        goto L134
    L121:
        if ((74899 & $dirty5) != 74898) goto L124;
        r4 = false;
        goto L126
    L114:
        if ($composer2.changedInstance(r106) == false) goto L116;
        int r142 = 131072;
    L117:
        $dirty1 = $dirty1 | r142;
        goto L118
    L116:
        r142 = 65536;
        goto L117
    L72:
        if ($composer2.changedInstance(r100) == false) goto L74;
        int r143 = 536870912;
    L75:
        $dirty3 = $dirty3 | r143;
        goto L76
    L74:
        r143 = 268435456;
        goto L75
    L13:
        if ($composer2.changedInstance(r92) == false) goto L15;
        int r144 = 32;
    L16:
        $dirty3 = $dirty2 | r144;
        goto L19
    L15:
        r144 = 16;
        goto L16
    L5:
        if ($composer2.changed(selectedModel.ordinal()) == false) goto L7;
        int r145 = 4;
    L8:
        $dirty = $changed | r145;
        goto L10
    L7:
        r145 = 2;
        goto L8
    }

    private static final boolean ChatScreen$lambda$6(State<Boolean> r4) {
        return ((Boolean) r4.getValue()).booleanValue();
    }

    static final boolean ChatScreen$lambda$5$lambda$4(LazyListState $listState) {
        LazyListLayoutInfo layout = $listState.getLayoutInfo();
        LazyListItemInfo r1 = (LazyListItemInfo) CollectionsKt.lastOrNull(layout.getVisibleItemsInfo());
        if (r1 == null) goto L5;
        int lastVisible = r1.getIndex();
    L7:
        if (layout.getTotalItemsCount() != 0) goto L9;
    L12:
        return true;
    L9:
        if (lastVisible >= (layout.getTotalItemsCount() - 2)) goto L12;
        return false;
    L5:
        lastVisible = -1;
        goto L7
    }

    private static final boolean ChatScreen$lambda$8(MutableState<Boolean> r4) {
        return r4.getValue().booleanValue();
    }

    private static final void ChatScreen$lambda$9(MutableState<Boolean> r5, boolean r6) {
        r5.setValue(Boolean.valueOf(r6));
    }

    private static final float ChatScreen$lambda$12(State<Float> r4) {
        return ((Number) r4.getValue()).floatValue();
    }

    static final float ChatScreen$lambda$11$lambda$10(LazyListState $listState) {
        if ($listState.getFirstVisibleItemIndex() <= 0) goto L6;
        return 1.0f;
    L6:
        return RangesKt.coerceIn($listState.getFirstVisibleItemScrollOffset() / 280.0f, 0.0f, 1.0f);
    }

    static final Unit ChatScreen$lambda$28$lambda$27$lambda$17$lambda$16(MutableState $showClearDialog$delegate) {
        ChatScreen$lambda$9($showClearDialog$delegate, true);
        return Unit.INSTANCE;
    }

    static final Unit ChatScreen$lambda$28$lambda$27$lambda$24$lambda$23(final List $timeline, final Set $favorites, final Context $context, final Function2 $onToggleFavorite, LazyListScope $this$LazyColumn) {
        Intrinsics.checkNotNullParameter($this$LazyColumn, "$this$LazyColumn");
        final Function1 r0 = new ChatScreenKt$$ExternalSyntheticLambda42();
        final Function1 r3 = ChatScreenKt$ChatScreen$lambda$28$lambda$27$lambda$24$lambda$23$$inlined$items$default$1.INSTANCE;
        $this$LazyColumn.items($timeline.size(), new ChatScreenKt$ChatScreen$lambda$28$lambda$27$lambda$24$lambda$23$$inlined$items$default$2(r0, $timeline), new ChatScreenKt$ChatScreen$lambda$28$lambda$27$lambda$24$lambda$23$$inlined$items$default$3(r3, $timeline), ComposableLambdaKt.composableLambdaInstance(-632812321, true, new ChatScreenKt$ChatScreen$lambda$28$lambda$27$lambda$24$lambda$23$$inlined$items$default$4($timeline, $favorites, $context, $onToggleFavorite)));
        return Unit.INSTANCE;
    }

    static final Object ChatScreen$lambda$28$lambda$27$lambda$24$lambda$23$lambda$18(TimelineItem it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Long.valueOf(it.getId());
    }

    static final Unit ChatScreen$lambda$28$lambda$27$lambda$26$lambda$25(FocusManager $focusManager, Function0 $onSend) {
        FocusManager.clearFocus$default($focusManager, false, 1, null);
        $onSend.invoke();
        return Unit.INSTANCE;
    }

    static final Unit ChatScreen$lambda$45$lambda$44$lambda$41$lambda$40(final List $timeline, final AIModel $selectedModel, final Function1 $onModelSelected, final boolean $isGenerating, final MutableState $showClearDialog$delegate, final Set $favorites, final Context $context, final Function2 $onToggleFavorite, LazyListScope $this$LazyColumn) {
        Intrinsics.checkNotNullParameter($this$LazyColumn, "$this$LazyColumn");
        LazyListScope.item$default($this$LazyColumn, null, null, ComposableLambdaKt.composableLambdaInstance(-1306149442, true, new ChatScreenKt$$ExternalSyntheticLambda19($selectedModel, $onModelSelected, $isGenerating)), 3, null);
        LazyListScope.item$default($this$LazyColumn, null, null, ComposableLambdaKt.composableLambdaInstance(-2075293067, true, new ChatScreenKt$$ExternalSyntheticLambda20($selectedModel)), 3, null);
        LazyListScope.item$default($this$LazyColumn, null, null, ComposableLambdaKt.composableLambdaInstance(-1853381386, true, new ChatScreenKt$$ExternalSyntheticLambda21($timeline, $showClearDialog$delegate)), 3, null);
        final Function1 r1 = new ChatScreenKt$$ExternalSyntheticLambda22();
        final Function1 r4 = ChatScreenKt$ChatScreen$lambda$45$lambda$44$lambda$41$lambda$40$$inlined$items$default$1.INSTANCE;
        $this$LazyColumn.items($timeline.size(), new ChatScreenKt$ChatScreen$lambda$45$lambda$44$lambda$41$lambda$40$$inlined$items$default$2(r1, $timeline), new ChatScreenKt$ChatScreen$lambda$45$lambda$44$lambda$41$lambda$40$$inlined$items$default$3(r4, $timeline), ComposableLambdaKt.composableLambdaInstance(-632812321, true, new ChatScreenKt$ChatScreen$lambda$45$lambda$44$lambda$41$lambda$40$$inlined$items$default$4($timeline, $favorites, $context, $onToggleFavorite)));
        return Unit.INSTANCE;
    }

    static final Unit ChatScreen$lambda$45$lambda$44$lambda$41$lambda$40$lambda$29(AIModel $selectedModel, Function1 $onModelSelected, boolean $isGenerating, LazyItemScope $this$item, Composer $composer, int $changed) {
        Intrinsics.checkNotNullParameter($this$item, "$this$item");
        ComposerKt.sourceInformation($composer, "C247@9975L67:ChatScreen.kt#cyjvf");
        if (($changed & 17) == 16) goto L5;
        boolean r0 = true;
    L7:
        if ($composer.shouldExecute(r0, $changed & 1) == true) goto L9;
        $composer.skipToGroupEnd();
    L16:
        return Unit.INSTANCE;
    L9:
        if (ComposerKt.isTraceInProgress() == false) goto L11;
        ComposerKt.traceEventStart(-1306149442, $changed, -1, "com.luchime.huiyuan.ui.ChatScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (ChatScreen.kt:247)");
    L11:
        HeroHeader($selectedModel, $onModelSelected, !$isGenerating, $composer, 0);
        if (ComposerKt.isTraceInProgress() == false) goto L16;
        ComposerKt.traceEventEnd();
        goto L16
    L5:
        r0 = false;
        goto L7
    }

    static final Unit ChatScreen$lambda$45$lambda$44$lambda$41$lambda$40$lambda$30(AIModel $selectedModel, LazyItemScope $this$item, Composer $composer, int $changed) {
        Intrinsics.checkNotNullParameter($this$item, "$this$item");
        ComposerKt.sourceInformation($composer, "C248@10072L27:ChatScreen.kt#cyjvf");
        if (($changed & 17) == 16) goto L5;
        boolean r0 = true;
    L7:
        if ($composer.shouldExecute(r0, $changed & 1) == true) goto L9;
        $composer.skipToGroupEnd();
    L16:
        return Unit.INSTANCE;
    L9:
        if (ComposerKt.isTraceInProgress() == false) goto L11;
        ComposerKt.traceEventStart(-2075293067, $changed, -1, "com.luchime.huiyuan.ui.ChatScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (ChatScreen.kt:248)");
    L11:
        MarqueeStrip($selectedModel, $composer, 0);
        if (ComposerKt.isTraceInProgress() == false) goto L16;
        ComposerKt.traceEventEnd();
        goto L16
    L5:
        r0 = false;
        goto L7
    }

    static final Unit ChatScreen$lambda$45$lambda$44$lambda$41$lambda$40$lambda$34(List $timeline, final MutableState $showClearDialog$delegate, LazyItemScope $this$item, Composer $composer, int $changed) {
        Intrinsics.checkNotNullParameter($this$item, "$this$item");
        ComposerKt.sourceInformation($composer, "C253@10347L26,250@10153L246:ChatScreen.kt#cyjvf");
        if (($changed & 17) == 16) goto L5;
        boolean r0 = true;
    L7:
        if ($composer.shouldExecute(r0, $changed & 1) == true) goto L9;
        $composer.skipToGroupEnd();
    L34:
        return Unit.INSTANCE;
    L9:
        if (ComposerKt.isTraceInProgress() == false) goto L11;
        ComposerKt.traceEventStart(-1853381386, $changed, -1, "com.luchime.huiyuan.ui.ChatScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (ChatScreen.kt:250)");
    L11:
        List r1 = $timeline;
        if ((r1 instanceof Collection) == true) goto L14;
    L16:
        int r3 = 0;
        Iterator r4 = r1.iterator();
    L18:
        if (r4.hasNext() == false) goto L25;
        if ((((TimelineItem) r4.next()) instanceof TimelineItem.Message) == false) goto L18;
        r3 = r3 + 1;
        if (r3 >= 0) goto L18;
        CollectionsKt.throwCountOverflow();
    L25:
        ComposerKt.sourceInformationMarkerStart($composer, 1311922960, "CC(remember):ChatScreen.kt#9igjgp");
        Object r5 = $composer.rememberedValue();
        if (r5 != Composer.Companion.getEmpty()) goto L29;
        Object r8 = new ChatScreenKt$$ExternalSyntheticLambda53($showClearDialog$delegate);
        $composer.updateRememberedValue(r8);
        r5 = r8;
    L29:
        ComposerKt.sourceInformationMarkerEnd($composer);
        ConversationToolbar(r3, false, (Function0) r5, $composer, 432);
        if (ComposerKt.isTraceInProgress() == false) goto L34;
        ComposerKt.traceEventEnd();
        goto L34
    L14:
        if (r1.isEmpty() == false) goto L16;
        r3 = 0;
        goto L25
    L5:
        r0 = false;
        goto L7
    }

    static final Unit ChatScreen$lambda$45$lambda$44$lambda$41$lambda$40$lambda$34$lambda$33$lambda$32(MutableState $showClearDialog$delegate) {
        ChatScreen$lambda$9($showClearDialog$delegate, true);
        return Unit.INSTANCE;
    }

    static final Object ChatScreen$lambda$45$lambda$44$lambda$41$lambda$40$lambda$35(TimelineItem it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Long.valueOf(it.getId());
    }

    static final Unit ChatScreen$lambda$45$lambda$44$lambda$43$lambda$42(FocusManager $focusManager, Function0 $onSend) {
        FocusManager.clearFocus$default($focusManager, false, 1, null);
        $onSend.invoke();
        return Unit.INSTANCE;
    }

    static final Unit ChatScreen$lambda$47$lambda$46(MutableState $showClearDialog$delegate) {
        ChatScreen$lambda$9($showClearDialog$delegate, false);
        return Unit.INSTANCE;
    }

    static final Unit ChatScreen$lambda$50(final AppHaptics $haptics, final Function0 $onClearConversation, final MutableState $showClearDialog$delegate, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C312@12713L164,312@12692L251:ChatScreen.kt#cyjvf");
        if (($changed & 3) == 2) goto L5;
        boolean r2 = true;
    L7:
        if ($composer.shouldExecute(r2, $changed & 1) == true) goto L9;
        $composer.skipToGroupEnd();
    L23:
        return Unit.INSTANCE;
    L9:
        if (ComposerKt.isTraceInProgress() == false) goto L11;
        ComposerKt.traceEventStart(-1999000877, $changed, -1, "com.luchime.huiyuan.ui.ChatScreen.<anonymous> (ChatScreen.kt:312)");
    L11:
        ComposerKt.sourceInformationMarkerStart($composer, -1189460073, "CC(remember):ChatScreen.kt#9igjgp");
        boolean r3 = $composer.changedInstance($haptics) | $composer.changed($onClearConversation);
        Object r5 = $composer.rememberedValue();
        if (r3 == false) goto L14;
    L17:
        Object r8 = new ChatScreenKt$$ExternalSyntheticLambda49($haptics, $onClearConversation, $showClearDialog$delegate);
        $composer.updateRememberedValue(r8);
        r5 = r8;
    L18:
        ComposerKt.sourceInformationMarkerEnd($composer);
        ButtonKt.TextButton((Function0) r5, null, false, null, null, null, null, null, null, ComposableSingletons$ChatScreenKt.INSTANCE.getLambda$1172547958$app(), $composer, 805306368, 510);
        if (ComposerKt.isTraceInProgress() == false) goto L23;
        ComposerKt.traceEventEnd();
        goto L23
    L14:
        if (r5 != Composer.Companion.getEmpty()) goto L18;
    L5:
        r2 = false;
        goto L7
    }

    static final Unit ChatScreen$lambda$50$lambda$49$lambda$48(AppHaptics $haptics, Function0 $onClearConversation, MutableState $showClearDialog$delegate) {
        $haptics.perform(HapticCue.DESTRUCTIVE);
        ChatScreen$lambda$9($showClearDialog$delegate, false);
        $onClearConversation.invoke();
        return Unit.INSTANCE;
    }

    static final Unit ChatScreen$lambda$53(final AppHaptics $haptics, final MutableState $showClearDialog$delegate, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C319@13026L114,319@13005L164:ChatScreen.kt#cyjvf");
        if (($changed & 3) == 2) goto L5;
        boolean r1 = true;
    L7:
        if ($composer.shouldExecute(r1, $changed & 1) == true) goto L9;
        $composer.skipToGroupEnd();
    L23:
        return Unit.INSTANCE;
    L9:
        if (ComposerKt.isTraceInProgress() == false) goto L11;
        ComposerKt.traceEventStart(-196865007, $changed, -1, "com.luchime.huiyuan.ui.ChatScreen.<anonymous> (ChatScreen.kt:319)");
    L11:
        ComposerKt.sourceInformationMarkerStart($composer, -208709341, "CC(remember):ChatScreen.kt#9igjgp");
        boolean r2 = $composer.changedInstance($haptics);
        Object r4 = $composer.rememberedValue();
        if (r2 == false) goto L14;
    L17:
        Object r7 = new ChatScreenKt$$ExternalSyntheticLambda25($haptics, $showClearDialog$delegate);
        $composer.updateRememberedValue(r7);
        r4 = r7;
    L18:
        ComposerKt.sourceInformationMarkerEnd($composer);
        ButtonKt.TextButton((Function0) r4, null, false, null, null, null, null, null, null, ComposableSingletons$ChatScreenKt.INSTANCE.m7404getLambda$1320283468$app(), $composer, 805306368, 510);
        if (ComposerKt.isTraceInProgress() == false) goto L23;
        ComposerKt.traceEventEnd();
        goto L23
    L14:
        if (r4 != Composer.Companion.getEmpty()) goto L18;
    L5:
        r1 = false;
        goto L7
    }

    static final Unit ChatScreen$lambda$53$lambda$52$lambda$51(AppHaptics $haptics, MutableState $showClearDialog$delegate) {
        $haptics.perform(HapticCue.TAP);
        ChatScreen$lambda$9($showClearDialog$delegate, false);
        return Unit.INSTANCE;
    }

    private static final void CollapsingModelHeader(final AIModel selectedModel, final float progress, Modifier modifier, Composer $composer, final int $changed, final int r72) {
        Composer $composer2 = $composer.startRestartGroup(1090757773);
        ComposerKt.sourceInformation($composer2, "C(CollapsingModelHeader)P(2,1)343@13673L106,340@13585L1410:ChatScreen.kt#cyjvf");
        int $dirty = $changed;
        if (($changed & 6) != 0) goto L10;
        if ($composer2.changed(selectedModel.ordinal()) == false) goto L7;
        int r3 = 4;
    L8:
        $dirty = $dirty | r3;
        goto L10
    L7:
        r3 = 2;
    L10:
        if (($changed & 48) == 0) goto L12;
    L16:
        int r4 = r72 & 4;
        if (r4 == 0) goto L20;
        $dirty = $dirty | 384;
        Modifier r5 = modifier;
    L27:
        int $dirty2 = $dirty;
        if (($dirty2 & 147) == 146) goto L30;
        boolean r1 = true;
    L32:
        if ($composer2.shouldExecute(r1, $dirty2 & 1) == false) goto L80;
        if (r4 == 0) goto L35;
        Modifier.Companion modifier2 = Modifier.Companion;
    L37:
        if (ComposerKt.isTraceInProgress() == false) goto L39;
        ComposerKt.traceEventStart(1090757773, $dirty2, -1, "com.luchime.huiyuan.ui.CollapsingModelHeader (ChatScreen.kt:335)");
    L39:
        final float visibility = RangesKt.coerceIn((progress - 0.12f) / 0.88f, 0.0f, 1.0f);
        float avatarSize = Dp.m6973constructorimpl(62.0f - (24.0f * progress));
        long titleSize = TextUnitKt.getSp(30.0f - (11.0f * progress));
        Modifier r11 = SizeKt.fillMaxWidth$default(modifier2, 0.0f, 1, null);
        ComposerKt.sourceInformationMarkerStart($composer2, 246212119, "CC(remember):ChatScreen.kt#9igjgp");
        boolean r12 = $composer2.changed(visibility);
        Object r15 = $composer2.rememberedValue();
        if (r12 == false) goto L42;
    L45:
        Object r8 = new ChatScreenKt$$ExternalSyntheticLambda40(visibility);
        $composer2.updateRememberedValue(r8);
        r15 = r8;
    L46:
        ComposerKt.sourceInformationMarkerEnd($composer2);
        Modifier r6 = PaddingKt.m726paddingVpY3zN4(WindowInsetsPadding_androidKt.statusBarsPadding(BorderKt.m245borderxT4_qwU(BackgroundKt.m234backgroundbw27NRU$default(GraphicsLayerModifierKt.graphicsLayer(r11, (Function1) r15), HuiyuanDesignKt.getPaper(), null, 2, null), Dp.m6973constructorimpl(0), Color.Companion.m4401getTransparent0d7_KjU(), RectangleShapeKt.getRectangleShape())), Dp.m6973constructorimpl(16), Dp.m6973constructorimpl(8));
        Arrangement.Horizontal r9 = Arrangement.INSTANCE.getSpaceBetween();
        Alignment.Vertical r13 = Alignment.Companion.getCenterVertically();
        ComposerKt.sourceInformationMarkerStart($composer2, 693286680, "CC(Row)P(2,1,3)99@5124L58,100@5187L130:Row.kt#2w3rfo");
        MeasurePolicy r14 = RowKt.rowMeasurePolicy(r9, r13, $composer2, ((432 >> 3) & 14) | ((432 >> 3) & 112));
        ComposerKt.sourceInformationMarkerStart($composer2, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
        int r41 = ComposablesKt.getCurrentCompositeKeyHash($composer2, 0);
        CompositionLocalMap r10 = $composer2.getCurrentCompositionLocalMap();
        Modifier r0 = ComposedModifierKt.materializeModifier($composer2, r6);
        Function0<ComposeUiNode> r18 = ComposeUiNode.Companion.getConstructor();
        int r16 = ((((432 << 3) & 112) << 6) & 896) | 6;
        Modifier modifier3 = modifier2;
        ComposerKt.sourceInformationMarkerStart($composer2, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
        if (($composer2.getApplier() instanceof Applier) == true) goto L49;
        ComposablesKt.invalidApplier();
    L49:
        $composer2.startReusableNode();
        if ($composer2.getInserting() == false) goto L52;
        $composer2.createNode(r18);
    L53:
        Composer r2 = Updater.m3808constructorimpl($composer2);
        Updater.m3815setimpl(r2, r14, ComposeUiNode.Companion.getSetMeasurePolicy());
        Updater.m3815setimpl(r2, r10, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> r7 = ComposeUiNode.Companion.getSetCompositeKeyHash();
        if (r2.getInserting() == true) goto L59;
        Composer $composer3 = $composer2;
        if (Intrinsics.areEqual(r2.rememberedValue(), Integer.valueOf(r41)) == true) goto L61;
    L60:
        r2.updateRememberedValue(Integer.valueOf(r41));
        r2.apply(Integer.valueOf(r41), r7);
    L61:
        Updater.m3815setimpl(r2, r0, ComposeUiNode.Companion.getSetModifier());
        int r17 = (r16 >> 6) & 14;
        ComposerKt.sourceInformationMarkerStart($composer2, -407735110, "C101@5232L9:Row.kt#2w3rfo");
        int r19 = ((432 >> 6) & 112) | 6;
        RowScope r20 = RowScopeInstance.INSTANCE;
        ComposerKt.sourceInformationMarkerStart($composer2, -1296023862, "C354@14117L314,364@14440L549:ChatScreen.kt#cyjvf");
        TextKt.m2820Text4IGK_g(selectedModel.getDisplayName(), RowScope.weight$default(r20, Modifier.Companion, 1.0f, false, 2, null), HuiyuanDesignKt.getInk(), titleSize, null, FontWeight.Companion.getBlack(), null, 0, null, null, titleSize, TextOverflow.Companion.m6887getEllipsisgIe3tQ8(), false, 1, 0, null, null, $composer2, 196992, 3120, 119760);
        Modifier r21 = ClipKt.clip(PaddingKt.m725padding3ABfNKs(BorderKt.m245borderxT4_qwU(BackgroundKt.m233backgroundbw27NRU(SizeKt.m772size3ABfNKs(Modifier.Companion, avatarSize), modelAccent(selectedModel), RoundedCornerShapeKt.getCircleShape()), Dp.m6973constructorimpl(2), HuiyuanDesignKt.getInk(), RoundedCornerShapeKt.getCircleShape()), Dp.m6973constructorimpl(2)), RoundedCornerShapeKt.getCircleShape());
        ComposerKt.sourceInformationMarkerStart($composer2, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
        MeasurePolicy r22 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.getTopStart(), false);
        ComposerKt.sourceInformationMarkerStart($composer2, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
        int r23 = ComposablesKt.getCurrentCompositeKeyHash($composer2, 0);
        CompositionLocalMap r24 = $composer2.getCurrentCompositionLocalMap();
        Modifier r25 = ComposedModifierKt.materializeModifier($composer2, r21);
        Function0<ComposeUiNode> r26 = ComposeUiNode.Companion.getConstructor();
        int r27 = ((((0 << 3) & 112) << 6) & 896) | 6;
        ComposerKt.sourceInformationMarkerStart($composer2, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
        if (($composer2.getApplier() instanceof Applier) == true) goto L64;
        ComposablesKt.invalidApplier();
    L64:
        $composer2.startReusableNode();
        if ($composer2.getInserting() == false) goto L67;
        Function0<ComposeUiNode> r28 = r26;
        $composer2.createNode(r28);
    L68:
        Composer r29 = Updater.m3808constructorimpl($composer2);
        Updater.m3815setimpl(r29, r22, ComposeUiNode.Companion.getSetMeasurePolicy());
        Updater.m3815setimpl(r29, r24, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> r30 = ComposeUiNode.Companion.getSetCompositeKeyHash();
        if (r29.getInserting() == true) goto L75;
        if (Intrinsics.areEqual(r29.rememberedValue(), Integer.valueOf(r23)) == false) goto L75;
    L76:
        Updater.m3815setimpl(r29, r25, ComposeUiNode.Companion.getSetModifier());
        int r31 = (r27 >> 6) & 14;
        ComposerKt.sourceInformationMarkerStart($composer2, -2146730711, "C72@3468L9:Box.kt#2w3rfo");
        BoxScopeInstance r32 = BoxScopeInstance.INSTANCE;
        int r33 = ((0 >> 6) & 112) | 6;
        ComposerKt.sourceInformationMarkerStart($composer2, 1275472775, "C373@14751L40,372@14718L261:ChatScreen.kt#cyjvf");
        ImageKt.Image(PainterResources_androidKt.painterResource(selectedModel.getAvatarRes(), $composer2, 0), selectedModel.getDisplayName() + "缩略头像", SizeKt.fillMaxSize$default(Modifier.Companion, 0.0f, 1, null), null, ContentScale.Companion.getCrop(), 0.0f, null, $composer2, 24960, LocationRequestCompat.QUALITY_LOW_POWER);
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
        if (ComposerKt.isTraceInProgress() == false) goto L79;
        ComposerKt.traceEventEnd();
    L79:
        final Modifier modifier4 = modifier3;
    L81:
        ScopeUpdateScope r34 = $composer3.endRestartGroup();
        if (r34 == null) goto L85;
        r34.updateScope(new ChatScreenKt$$ExternalSyntheticLambda41(selectedModel, progress, modifier4, $changed, r72));
        return;
    L85:
        return;
    L75:
        r29.updateRememberedValue(Integer.valueOf(r23));
        r29.apply(Integer.valueOf(r23), r30);
        goto L76
    L67:
        r28 = r26;
        $composer2.useNode();
        goto L68
    L59:
        $composer3 = $composer2;
        goto L60
    L52:
        $composer2.useNode();
        goto L53
    L42:
        if (r15 != Composer.Companion.getEmpty()) goto L46;
    L35:
        modifier2 = r5;
        goto L37
    L80:
        $composer3 = $composer2;
        $composer3.skipToGroupEnd();
        modifier4 = r5;
        goto L81
    L30:
        r1 = false;
        goto L32
    L20:
        if (($changed & 384) != 0) goto L26;
        r5 = modifier;
        if ($composer2.changed(r5) == false) goto L24;
        int r35 = 256;
    L25:
        $dirty = $dirty | r35;
        goto L27
    L24:
        r35 = 128;
        goto L25
    L26:
        r5 = modifier;
        goto L27
    L12:
        if ($composer2.changed(progress) == false) goto L14;
        int r36 = 32;
    L15:
        $dirty = $dirty | r36;
        goto L16
    L14:
        r36 = 16;
        goto L15
    }

    static final Unit CollapsingModelHeader$lambda$56$lambda$55(float $visibility, GraphicsLayerScope $this$graphicsLayer) {
        Intrinsics.checkNotNullParameter($this$graphicsLayer, "$this$graphicsLayer");
        $this$graphicsLayer.setAlpha($visibility);
        $this$graphicsLayer.setTranslationY((1.0f - $visibility) * (-12.0f));
        return Unit.INSTANCE;
    }

    private static final void HeroHeader(AIModel selectedModel, Function1<? super AIModel, Unit> r92, boolean enabled, Composer $composer, final int $changed) {
        final Function1<? super AIModel, Unit> r1 = r92;
        final boolean r2 = enabled;
        Composer $composer2 = $composer.startRestartGroup(-1505787758);
        ComposerKt.sourceInformation($composer2, "C(HeroHeader)P(2,1)388@15132L2560:ChatScreen.kt#cyjvf");
        int $dirty = $changed;
        if (($changed & 6) != 0) goto L10;
        if ($composer2.changed(selectedModel.ordinal()) == false) goto L7;
        int r4 = 4;
    L8:
        $dirty = $dirty | r4;
        goto L10
    L7:
        r4 = 2;
    L10:
        if (($changed & 48) != 0) goto L17;
        if ($composer2.changedInstance(r1) == false) goto L14;
        int r5 = 32;
    L15:
        $dirty = $dirty | r5;
        goto L17
    L14:
        r5 = 16;
    L17:
        if (($changed & 384) == 0) goto L19;
    L23:
        int $dirty2 = $dirty;
        if (($dirty2 & 147) == 146) goto L26;
        boolean r3 = true;
    L28:
        if ($composer2.shouldExecute(r3, $dirty2 & 1) == true) goto L30;
        final AIModel r0 = selectedModel;
        Composer $composer3 = $composer2;
        $composer3.skipToGroupEnd();
    L81:
        ScopeUpdateScope r6 = $composer3.endRestartGroup();
        if (r6 == null) goto L85;
        r6.updateScope(new ChatScreenKt$$ExternalSyntheticLambda28(r0, r1, r2, $changed));
        return;
    L85:
        return;
    L30:
        if (ComposerKt.isTraceInProgress() == false) goto L32;
        ComposerKt.traceEventStart(-1505787758, $dirty2, -1, "com.luchime.huiyuan.ui.HeroHeader (ChatScreen.kt:387)");
    L32:
        Modifier r7 = PaddingKt.m726paddingVpY3zN4(WindowInsetsPadding_androidKt.statusBarsPadding(BackgroundKt.background$default(SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, null), Brush.Companion.m4317linearGradientmHitzGk$default(Brush.Companion, CollectionsKt.listOf(new Color[]{Color.m4356boximpl(HuiyuanDesignKt.getSignalYellow()), Color.m4356boximpl(ColorKt.Color(4294948142L)), Color.m4356boximpl(HuiyuanDesignKt.getSignalPink())}), 0, 0, 0, 14, null), null, 0.0f, 6, null)), Dp.m6973constructorimpl(18), Dp.m6973constructorimpl(18));
        ComposerKt.sourceInformationMarkerStart($composer2, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
        MeasurePolicy r9 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.getTopStart(), false);
        ComposerKt.sourceInformationMarkerStart($composer2, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
        int r22 = ComposablesKt.getCurrentCompositeKeyHash($composer2, 0);
        CompositionLocalMap r8 = $composer2.getCurrentCompositionLocalMap();
        Modifier r11 = ComposedModifierKt.materializeModifier($composer2, r7);
        Function0<ComposeUiNode> r25 = ComposeUiNode.Companion.getConstructor();
        $composer3 = $composer2;
        int r10 = ((((0 << 3) & 112) << 6) & 896) | 6;
        ComposerKt.sourceInformationMarkerStart($composer2, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
        if (($composer2.getApplier() instanceof Applier) == true) goto L35;
        ComposablesKt.invalidApplier();
    L35:
        $composer2.startReusableNode();
        if ($composer2.getInserting() == false) goto L38;
        Function0<ComposeUiNode> r12 = r25;
        $composer2.createNode(r12);
    L39:
        Composer r13 = Updater.m3808constructorimpl($composer2);
        Updater.m3815setimpl(r13, r9, ComposeUiNode.Companion.getSetMeasurePolicy());
        Updater.m3815setimpl(r13, r8, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> r14 = ComposeUiNode.Companion.getSetCompositeKeyHash();
        if (r13.getInserting() == true) goto L45;
        String r36 = "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo";
        if (Intrinsics.areEqual(r13.rememberedValue(), Integer.valueOf(r22)) == true) goto L47;
    L46:
        r13.updateRememberedValue(Integer.valueOf(r22));
        r13.apply(Integer.valueOf(r22), r14);
    L47:
        Updater.m3815setimpl(r13, r11, ComposeUiNode.Companion.getSetModifier());
        int r32 = (r10 >> 6) & 14;
        ComposerKt.sourceInformationMarkerStart($composer2, -2146730711, "C72@3468L9:Box.kt#2w3rfo");
        int r34 = ((0 >> 6) & 112) | 6;
        BoxScope r15 = BoxScopeInstance.INSTANCE;
        ComposerKt.sourceInformationMarkerStart($composer2, -935803094, "C399@15477L182,407@15669L1097,441@16776L658,461@17444L242:ChatScreen.kt#cyjvf");
        TextKt.m2820Text4IGK_g("✦", RotateKt.rotate(Modifier.Companion, -10.0f), HuiyuanDesignKt.getInk(), TextUnitKt.getSp(25), null, FontWeight.Companion.getBlack(), null, 0, null, null, 0, 0, false, 0, 0, null, null, $composer2, 200070, 0, 131024);
        Modifier r16 = SizeKt.fillMaxWidth(PaddingKt.m729paddingqDBjuR0$default(r15.align(Modifier.Companion, Alignment.Companion.getCenterStart()), 0.0f, Dp.m6973constructorimpl(24), 0.0f, 0.0f, 13, null), 0.64f);
        ComposerKt.sourceInformationMarkerStart($composer2, -483455358, "CC(Column)P(2,3,1)87@4442L61,88@4508L133:Column.kt#2w3rfo");
        MeasurePolicy r17 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.Companion.getStart(), $composer2, ((0 >> 3) & 14) | ((0 >> 3) & 112));
        ComposerKt.sourceInformationMarkerStart($composer2, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
        int r45 = ComposablesKt.getCurrentCompositeKeyHash($composer2, 0);
        CompositionLocalMap r18 = $composer2.getCurrentCompositionLocalMap();
        Modifier r19 = ComposedModifierKt.materializeModifier($composer2, r16);
        Function0<ComposeUiNode> r41 = ComposeUiNode.Companion.getConstructor();
        int r20 = ((((0 << 3) & 112) << 6) & 896) | 6;
        ComposerKt.sourceInformationMarkerStart($composer2, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
        if (($composer2.getApplier() instanceof Applier) == true) goto L50;
        ComposablesKt.invalidApplier();
    L50:
        $composer2.startReusableNode();
        if ($composer2.getInserting() == false) goto L53;
        $composer2.createNode(r41);
    L54:
        Composer r21 = Updater.m3808constructorimpl($composer2);
        Updater.m3815setimpl(r21, r17, ComposeUiNode.Companion.getSetMeasurePolicy());
        Updater.m3815setimpl(r21, r18, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> r23 = ComposeUiNode.Companion.getSetCompositeKeyHash();
        if (r21.getInserting() == true) goto L61;
        if (Intrinsics.areEqual(r21.rememberedValue(), Integer.valueOf(r45)) == false) goto L61;
    L62:
        Updater.m3815setimpl(r21, r19, ComposeUiNode.Companion.getSetModifier());
        int r50 = (r20 >> 6) & 14;
        ComposerKt.sourceInformationMarkerStart($composer2, -384672921, "C89@4556L9:Column.kt#2w3rfo");
        ColumnScopeInstance r24 = ColumnScopeInstance.INSTANCE;
        int r53 = ((0 >> 6) & 112) | 6;
        ComposerKt.sourceInformationMarkerStart($composer2, -1197525201, "C413@15854L54,414@15921L29,415@15963L257,423@16233L254,431@16500L29,432@16542L214:ChatScreen.kt#cyjvf");
        r0 = selectedModel;
        r2 = enabled;
        r1 = r92;
        ModelSelector(r0, r1, r2, $composer2, ($dirty2 & 896) | (($dirty2 & 14) | ($dirty2 & 112)), 0);
        SpacerKt.Spacer(SizeKt.m758height3ABfNKs(Modifier.Companion, Dp.m6973constructorimpl(8)), $composer2, 6);
        TextKt.m2820Text4IGK_g(r0.getDisplayName(), null, HuiyuanDesignKt.getInk(), TextUnitKt.getSp(38), null, FontWeight.Companion.getBlack(), null, TextUnitKt.getSp(-1.5d), null, null, TextUnitKt.getSp(40), 0, false, 0, 0, null, null, $composer2, 200064, 6, 129874);
        TextKt.m2820Text4IGK_g(heroEnglish(r0), null, HuiyuanDesignKt.getInk(), TextUnitKt.getSp(10), null, FontWeight.Companion.getBold(), null, TextUnitKt.getSp(1.2d), null, null, TextUnitKt.getSp(13), 0, false, 0, 0, null, null, $composer2, 12782976, 6, 129874);
        SpacerKt.Spacer(SizeKt.m758height3ABfNKs(Modifier.Companion, Dp.m6973constructorimpl(9)), $composer2, 6);
        TextKt.m2820Text4IGK_g(heroSummary(r0), null, HuiyuanDesignKt.getInk(), TextUnitKt.getSp(13), null, FontWeight.Companion.getBold(), null, 0, null, null, TextUnitKt.getSp(19), 0, false, 0, 0, null, null, $composer2, 200064, 6, 130002);
        ComposerKt.sourceInformationMarkerEnd($composer2);
        ComposerKt.sourceInformationMarkerEnd($composer2);
        $composer2.endNode();
        ComposerKt.sourceInformationMarkerEnd($composer2);
        ComposerKt.sourceInformationMarkerEnd($composer2);
        ComposerKt.sourceInformationMarkerEnd($composer2);
        Modifier r26 = ClipKt.clip(BackgroundKt.m233backgroundbw27NRU(PaddingKt.m725padding3ABfNKs(BackgroundKt.m233backgroundbw27NRU(SizeKt.m772size3ABfNKs(PaddingKt.m729paddingqDBjuR0$default(r15.align(Modifier.Companion, Alignment.Companion.getCenterEnd()), 0.0f, Dp.m6973constructorimpl(10), 0.0f, 0.0f, 13, null), Dp.m6973constructorimpl(128)), HuiyuanDesignKt.getInk(), RoundedCornerShapeKt.getCircleShape()), Dp.m6973constructorimpl(3)), HuiyuanDesignKt.getCream(), RoundedCornerShapeKt.getCircleShape()), RoundedCornerShapeKt.getCircleShape());
        ComposerKt.sourceInformationMarkerStart($composer2, 733328855, r36);
        MeasurePolicy r27 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.getTopStart(), false);
        ComposerKt.sourceInformationMarkerStart($composer2, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
        int r110 = ComposablesKt.getCurrentCompositeKeyHash($composer2, 0);
        CompositionLocalMap r28 = $composer2.getCurrentCompositionLocalMap();
        Modifier r111 = ComposedModifierKt.materializeModifier($composer2, r26);
        Function0<ComposeUiNode> r43 = ComposeUiNode.Companion.getConstructor();
        int r112 = ((((0 << 3) & 112) << 6) & 896) | 6;
        ComposerKt.sourceInformationMarkerStart($composer2, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
        if (($composer2.getApplier() instanceof Applier) == true) goto L65;
        ComposablesKt.invalidApplier();
    L65:
        $composer2.startReusableNode();
        if ($composer2.getInserting() == false) goto L68;
        Function0<ComposeUiNode> r29 = r43;
        $composer2.createNode(r29);
    L69:
        Composer r113 = Updater.m3808constructorimpl($composer2);
        Updater.m3815setimpl(r113, r27, ComposeUiNode.Companion.getSetMeasurePolicy());
        Updater.m3815setimpl(r113, r28, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> r30 = ComposeUiNode.Companion.getSetCompositeKeyHash();
        if (r113.getInserting() == true) goto L76;
        if (Intrinsics.areEqual(r113.rememberedValue(), Integer.valueOf(r110)) == false) goto L76;
    L77:
        Updater.m3815setimpl(r113, r111, ComposeUiNode.Companion.getSetModifier());
        int r31 = (r112 >> 6) & 14;
        ComposerKt.sourceInformationMarkerStart($composer2, -2146730711, "C72@3468L9:Box.kt#2w3rfo");
        BoxScopeInstance r33 = BoxScopeInstance.INSTANCE;
        int r114 = ((0 >> 6) & 112) | 6;
        ComposerKt.sourceInformationMarkerStart($composer2, 999158410, "C452@17142L40,451@17109L315:ChatScreen.kt#cyjvf");
        ImageKt.Image(PainterResources_androidKt.painterResource(r0.getAvatarRes(), $composer2, 0), r0.getDisplayName() + "头像", PaddingKt.m725padding3ABfNKs(SizeKt.fillMaxSize$default(Modifier.Companion, 0.0f, 1, null), Dp.m6973constructorimpl(2)), null, ContentScale.Companion.getCrop(), 0.0f, null, $composer2, 24960, LocationRequestCompat.QUALITY_LOW_POWER);
        ComposerKt.sourceInformationMarkerEnd($composer2);
        ComposerKt.sourceInformationMarkerEnd($composer2);
        $composer2.endNode();
        ComposerKt.sourceInformationMarkerEnd($composer2);
        ComposerKt.sourceInformationMarkerEnd($composer2);
        ComposerKt.sourceInformationMarkerEnd($composer2);
        TextKt.m2820Text4IGK_g("✦", RotateKt.rotate(r15.align(Modifier.Companion, Alignment.Companion.getBottomEnd()), 12.0f), HuiyuanDesignKt.getInk(), TextUnitKt.getSp(20), null, FontWeight.Companion.getBlack(), null, 0, null, null, 0, 0, false, 0, 0, null, null, $composer2, 200070, 0, 131024);
        ComposerKt.sourceInformationMarkerEnd($composer2);
        ComposerKt.sourceInformationMarkerEnd($composer2);
        $composer2.endNode();
        ComposerKt.sourceInformationMarkerEnd($composer2);
        ComposerKt.sourceInformationMarkerEnd($composer2);
        ComposerKt.sourceInformationMarkerEnd($composer2);
        if (ComposerKt.isTraceInProgress() == false) goto L81;
        ComposerKt.traceEventEnd();
    L76:
        r113.updateRememberedValue(Integer.valueOf(r110));
        r113.apply(Integer.valueOf(r110), r30);
        goto L77
    L68:
        r29 = r43;
        $composer2.useNode();
    L61:
        r21.updateRememberedValue(Integer.valueOf(r45));
        r21.apply(Integer.valueOf(r45), r23);
        goto L62
    L53:
        $composer2.useNode();
        goto L54
    L45:
        r36 = "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo";
        goto L46
    L38:
        r12 = r25;
        $composer2.useNode();
        goto L39
    L26:
        r3 = false;
        goto L28
    L19:
        if ($composer2.changed(r2) == false) goto L21;
        int r35 = 256;
    L22:
        $dirty = $dirty | r35;
        goto L23
    L21:
        r35 = 128;
        goto L22
    }

    private static final void MarqueeStrip(final AIModel selectedModel, Composer $composer, final int $changed) {
        Composer $composer2 = $composer.startRestartGroup(-338384180);
        ComposerKt.sourceInformation($composer2, "C(MarqueeStrip)479@17883L21,475@17763L891:ChatScreen.kt#cyjvf");
        int $dirty = $changed;
        if (($changed & 6) != 0) goto L10;
        if ($composer2.changed(selectedModel.ordinal()) == false) goto L7;
        int r5 = 4;
    L8:
        $dirty = $dirty | r5;
        goto L10
    L7:
        r5 = 2;
    L10:
        if (($dirty & 3) == 2) goto L12;
        boolean r6 = true;
    L14:
        if ($composer2.shouldExecute(r6, $dirty & 1) == true) goto L16;
        Composer $composer3 = $composer2;
        $composer3.skipToGroupEnd();
    L49:
        ScopeUpdateScope r2 = $composer3.endRestartGroup();
        if (r2 == null) goto L54;
        r2.updateScope(new ChatScreenKt$$ExternalSyntheticLambda26(selectedModel, $changed));
        return;
    L54:
        return;
    L16:
        if (ComposerKt.isTraceInProgress() == false) goto L18;
        ComposerKt.traceEventStart(-338384180, $dirty, -1, "com.luchime.huiyuan.ui.MarqueeStrip (ChatScreen.kt:474)");
    L18:
        Modifier r3 = PaddingKt.m726paddingVpY3zN4(ScrollKt.horizontalScroll$default(BackgroundKt.m234backgroundbw27NRU$default(SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, null), HuiyuanDesignKt.getInk(), null, 2, null), ScrollKt.rememberScrollState(0, $composer2, 0, 1), false, null, false, 14, null), Dp.m6973constructorimpl(14), Dp.m6973constructorimpl(9));
        Arrangement.Horizontal r7 = Arrangement.INSTANCE.m606spacedBy0680j_4(Dp.m6973constructorimpl(18));
        ComposerKt.sourceInformationMarkerStart($composer2, 693286680, "CC(Row)P(2,1,3)99@5124L58,100@5187L130:Row.kt#2w3rfo");
        MeasurePolicy r14 = RowKt.rowMeasurePolicy(r7, Alignment.Companion.getTop(), $composer2, ((48 >> 3) & 14) | ((48 >> 3) & 112));
        ComposerKt.sourceInformationMarkerStart($composer2, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
        int r8 = ComposablesKt.getCurrentCompositeKeyHash($composer2, 0);
        CompositionLocalMap r9 = $composer2.getCurrentCompositionLocalMap();
        Modifier r10 = ComposedModifierKt.materializeModifier($composer2, r3);
        Function0<ComposeUiNode> r20 = ComposeUiNode.Companion.getConstructor();
        int r4 = ((((48 << 3) & 112) << 6) & 896) | 6;
        $composer3 = $composer2;
        ComposerKt.sourceInformationMarkerStart($composer2, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
        if (($composer2.getApplier() instanceof Applier) == true) goto L21;
        ComposablesKt.invalidApplier();
    L21:
        $composer2.startReusableNode();
        if ($composer2.getInserting() == false) goto L24;
        Function0<ComposeUiNode> r11 = r20;
        $composer2.createNode(r11);
    L25:
        Composer r12 = Updater.m3808constructorimpl($composer2);
        Updater.m3815setimpl(r12, r14, ComposeUiNode.Companion.getSetMeasurePolicy());
        Updater.m3815setimpl(r12, r9, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> r13 = ComposeUiNode.Companion.getSetCompositeKeyHash();
        if (r12.getInserting() == true) goto L32;
        if (Intrinsics.areEqual(r12.rememberedValue(), Integer.valueOf(r8)) == false) goto L32;
    L33:
        Updater.m3815setimpl(r12, r10, ComposeUiNode.Companion.getSetModifier());
        int r15 = (r4 >> 6) & 14;
        ComposerKt.sourceInformationMarkerStart($composer2, -407735110, "C101@5232L9:Row.kt#2w3rfo");
        RowScopeInstance r16 = RowScopeInstance.INSTANCE;
        int r17 = ((48 >> 6) & 112) | 6;
        Composer r18 = $composer2;
        ComposerKt.sourceInformationMarkerStart(r18, -1251504108, "C:ChatScreen.kt#cyjvf");
        switch(WhenMappings.$EnumSwitchMapping$0[selectedModel.ordinal()]) {
            case 1: goto L40;
            case 2: goto L39;
            case 3: goto L38;
            case 4: goto L37;
            default: goto L36;
        };
    L37:
        List r19 = CollectionsKt.listOf(new String[]{"Linux老炮", "C语言", "魂系游戏", "长沙美食", "饿了"});
    L41:
        r18.startReplaceGroup(-733096105);
        ComposerKt.sourceInformation(r18, "*490@18439L199");
        List r21 = r19;
        Iterator r110 = r21.iterator();
    L43:
        if (r110.hasNext() == false) goto L45;
        Composer r52 = r18;
        TextKt.m2820Text4IGK_g("★ " + ((String) r110.next()), null, HuiyuanDesignKt.getSignalYellow(), TextUnitKt.getSp(12), null, FontWeight.Companion.getBlack(), null, 0, null, null, 0, 0, false, 1, 0, null, null, r52, 200064, 3072, 122834);
        r19 = r19;
        r18 = r52;
        r21 = r21;
        goto L43
    L45:
        Composer r53 = r18;
        r53.endReplaceGroup();
        ComposerKt.sourceInformationMarkerEnd(r53);
        ComposerKt.sourceInformationMarkerEnd($composer2);
        $composer2.endNode();
        ComposerKt.sourceInformationMarkerEnd($composer2);
        ComposerKt.sourceInformationMarkerEnd($composer2);
        ComposerKt.sourceInformationMarkerEnd($composer2);
        if (ComposerKt.isTraceInProgress() == false) goto L49;
        ComposerKt.traceEventEnd();
        goto L49
    L38:
        r19 = CollectionsKt.listOf(new String[]{"卷毛龟", "RoboMaster", "养龟达人", "土家文化", "甜狗语录"});
        goto L41
    L39:
        r19 = CollectionsKt.listOf(new String[]{"朴AI上线", "企鹅玩机", "deskpark", "热河路", "朴一朴"});
        goto L41
    L40:
        r19 = CollectionsKt.listOf(new String[]{"天天进步", "困困智慧", "高认知语录", "认知升级", "破圈思维"});
        goto L41
    L36:
        throw new NoWhenBranchMatchedException();
    L32:
        r12.updateRememberedValue(Integer.valueOf(r8));
        r12.apply(Integer.valueOf(r8), r13);
        goto L33
    L24:
        r11 = r20;
        $composer2.useNode();
        goto L25
    L12:
        r6 = false;
        goto L14
    }

    private static final void ConversationToolbar(final int messageCount, final boolean compact, Function0<Unit> r82, Composer $composer, final int $changed) {
        final Function0<Unit> r5 = r82;
        Composer $composer2 = $composer.startRestartGroup(-1408383376);
        ComposerKt.sourceInformation($composer2, "C(ConversationToolbar)P(1)503@18766L938:ChatScreen.kt#cyjvf");
        int $dirty = $changed;
        if (($changed & 6) != 0) goto L10;
        if ($composer2.changed(messageCount) == false) goto L7;
        int r4 = 4;
    L8:
        $dirty = $dirty | r4;
        goto L10
    L7:
        r4 = 2;
    L10:
        if (($changed & 48) != 0) goto L17;
        if ($composer2.changed(compact) == false) goto L14;
        int r6 = 32;
    L15:
        $dirty = $dirty | r6;
        goto L17
    L14:
        r6 = 16;
    L17:
        if (($changed & 384) == 0) goto L19;
    L23:
        int $dirty2 = $dirty;
        if (($dirty2 & 147) == 146) goto L26;
        boolean r3 = true;
    L28:
        if ($composer2.shouldExecute(r3, $dirty2 & 1) == true) goto L30;
        Composer $composer3 = $composer2;
        $composer3.skipToGroupEnd();
    L70:
        ScopeUpdateScope r2 = $composer3.endRestartGroup();
        if (r2 == null) goto L74;
        r2.updateScope(new ChatScreenKt$$ExternalSyntheticLambda18(messageCount, compact, r5, $changed));
        return;
    L74:
        return;
    L30:
        if (ComposerKt.isTraceInProgress() == false) goto L32;
        ComposerKt.traceEventStart(-1408383376, $dirty2, -1, "com.luchime.huiyuan.ui.ConversationToolbar (ChatScreen.kt:502)");
    L32:
        Modifier r7 = BackgroundKt.m234backgroundbw27NRU$default(SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, null), HuiyuanDesignKt.getPaper(), null, 2, null);
        float r8 = Dp.m6973constructorimpl(16);
        if (compact == false) goto L35;
        float r9 = Dp.m6973constructorimpl(6);
    L36:
        Modifier r10 = PaddingKt.m726paddingVpY3zN4(r7, r8, r9);
        Arrangement.Horizontal r11 = Arrangement.INSTANCE.getSpaceBetween();
        Alignment.Vertical r12 = Alignment.Companion.getCenterVertically();
        ComposerKt.sourceInformationMarkerStart($composer2, 693286680, "CC(Row)P(2,1,3)99@5124L58,100@5187L130:Row.kt#2w3rfo");
        MeasurePolicy r13 = RowKt.rowMeasurePolicy(r11, r12, $composer2, ((432 >> 3) & 14) | ((432 >> 3) & 112));
        ComposerKt.sourceInformationMarkerStart($composer2, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
        int r19 = ComposablesKt.getCurrentCompositeKeyHash($composer2, 0);
        CompositionLocalMap r14 = $composer2.getCurrentCompositionLocalMap();
        Modifier r15 = ComposedModifierKt.materializeModifier($composer2, r10);
        Function0<ComposeUiNode> r21 = ComposeUiNode.Companion.getConstructor();
        int r16 = ((((432 << 3) & 112) << 6) & 896) | 6;
        ComposerKt.sourceInformationMarkerStart($composer2, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
        if (($composer2.getApplier() instanceof Applier) == true) goto L39;
        ComposablesKt.invalidApplier();
    L39:
        $composer2.startReusableNode();
        if ($composer2.getInserting() == false) goto L42;
        Function0<ComposeUiNode> r17 = r21;
        $composer2.createNode(r17);
    L43:
        Composer r18 = Updater.m3808constructorimpl($composer2);
        $composer3 = $composer2;
        Updater.m3815setimpl(r18, r13, ComposeUiNode.Companion.getSetMeasurePolicy());
        Updater.m3815setimpl(r18, r14, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> r20 = ComposeUiNode.Companion.getSetCompositeKeyHash();
        if (r18.getInserting() == true) goto L50;
        if (Intrinsics.areEqual(r18.rememberedValue(), Integer.valueOf(r19)) == false) goto L50;
    L51:
        Updater.m3815setimpl(r18, r15, ComposeUiNode.Companion.getSetModifier());
        int r22 = (r16 >> 6) & 14;
        ComposerKt.sourceInformationMarkerStart($composer2, -407735110, "C101@5232L9:Row.kt#2w3rfo");
        RowScopeInstance r23 = RowScopeInstance.INSTANCE;
        int r27 = ((432 >> 6) & 112) | 6;
        ComposerKt.sourceInformationMarkerStart($composer2, -53628477, "C511@19070L184,515@19263L435:ChatScreen.kt#cyjvf");
        ComposerKt.sourceInformationMarkerStart($composer2, -483455358, "CC(Column)P(2,3,1)87@4442L61,88@4508L133:Column.kt#2w3rfo");
        Modifier r24 = Modifier.Companion;
        MeasurePolicy r25 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.Companion.getStart(), $composer2, ((0 >> 3) & 14) | ((0 >> 3) & 112));
        ComposerKt.sourceInformationMarkerStart($composer2, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
        int r26 = ComposablesKt.getCurrentCompositeKeyHash($composer2, 0);
        CompositionLocalMap r28 = $composer2.getCurrentCompositionLocalMap();
        Modifier r29 = ComposedModifierKt.materializeModifier($composer2, r24);
        Function0<ComposeUiNode> r38 = ComposeUiNode.Companion.getConstructor();
        int r30 = ((((0 << 3) & 112) << 6) & 896) | 6;
        ComposerKt.sourceInformationMarkerStart($composer2, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
        if (($composer2.getApplier() instanceof Applier) == true) goto L54;
        ComposablesKt.invalidApplier();
    L54:
        $composer2.startReusableNode();
        if ($composer2.getInserting() == false) goto L57;
        Function0<ComposeUiNode> r31 = r38;
        $composer2.createNode(r31);
    L58:
        Composer r32 = Updater.m3808constructorimpl($composer2);
        Updater.m3815setimpl(r32, r25, ComposeUiNode.Companion.getSetMeasurePolicy());
        Updater.m3815setimpl(r32, r28, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> r33 = ComposeUiNode.Companion.getSetCompositeKeyHash();
        if (r32.getInserting() == true) goto L65;
        if (Intrinsics.areEqual(r32.rememberedValue(), Integer.valueOf(r26)) == false) goto L65;
    L66:
        Updater.m3815setimpl(r32, r29, ComposeUiNode.Companion.getSetModifier());
        int r34 = (r30 >> 6) & 14;
        ComposerKt.sourceInformationMarkerStart($composer2, -384672921, "C89@4556L9:Column.kt#2w3rfo");
        ColumnScopeInstance r35 = ColumnScopeInstance.INSTANCE;
        int r36 = ((0 >> 6) & 112) | 6;
        ComposerKt.sourceInformationMarkerStart($composer2, 600323892, "C512@19091L74,513@19178L66:ChatScreen.kt#cyjvf");
        TextKt.m2820Text4IGK_g("当前对话", null, HuiyuanDesignKt.getInk(), TextUnitKt.getSp(15), null, FontWeight.Companion.getBlack(), null, 0, null, null, 0, 0, false, 0, 0, null, null, $composer2, 200070, 0, 131026);
        TextKt.m2820Text4IGK_g("已保留 " + messageCount + " 条消息", null, HuiyuanDesignKt.getMutedText(), TextUnitKt.getSp(11), null, null, null, 0, null, null, 0, 0, false, 0, 0, null, null, $composer2, 3456, 0, 131058);
        ComposerKt.sourceInformationMarkerEnd($composer2);
        ComposerKt.sourceInformationMarkerEnd($composer2);
        $composer2.endNode();
        ComposerKt.sourceInformationMarkerEnd($composer2);
        ComposerKt.sourceInformationMarkerEnd($composer2);
        ComposerKt.sourceInformationMarkerEnd($composer2);
        r5 = r82;
        TextKt.m2820Text4IGK_g("清空", PaddingKt.m726paddingVpY3zN4(AppHapticsKt.hapticClickable$default(BorderKt.m245borderxT4_qwU(BackgroundKt.m233backgroundbw27NRU(Modifier.Companion, Color.Companion.m4403getWhite0d7_KjU(), RoundedCornerShapeKt.m1018RoundedCornerShape0680j_4(Dp.m6973constructorimpl(8))), Dp.m6973constructorimpl((float) 1.5d), HuiyuanDesignKt.getInk(), RoundedCornerShapeKt.m1018RoundedCornerShape0680j_4(Dp.m6973constructorimpl(8))), false, HapticCue.TAP, r5, 1, null), Dp.m6973constructorimpl(10), Dp.m6973constructorimpl(6)), HuiyuanDesignKt.getInk(), TextUnitKt.getSp(11), null, FontWeight.Companion.getBlack(), null, 0, null, null, 0, 0, false, 0, 0, null, null, $composer2, 200070, 0, 131024);
        ComposerKt.sourceInformationMarkerEnd($composer2);
        ComposerKt.sourceInformationMarkerEnd($composer2);
        $composer2.endNode();
        ComposerKt.sourceInformationMarkerEnd($composer2);
        ComposerKt.sourceInformationMarkerEnd($composer2);
        ComposerKt.sourceInformationMarkerEnd($composer2);
        if (ComposerKt.isTraceInProgress() == false) goto L70;
        ComposerKt.traceEventEnd();
    L65:
        r32.updateRememberedValue(Integer.valueOf(r26));
        r32.apply(Integer.valueOf(r26), r33);
        goto L66
    L57:
        r31 = r38;
        $composer2.useNode();
    L50:
        r18.updateRememberedValue(Integer.valueOf(r19));
        r18.apply(Integer.valueOf(r19), r20);
        goto L51
    L42:
        r17 = r21;
        $composer2.useNode();
        goto L43
    L35:
        r9 = Dp.m6973constructorimpl(10);
        goto L36
    L26:
        r3 = false;
        goto L28
    L19:
        if ($composer2.changedInstance(r5) == false) goto L21;
        int r37 = 256;
    L22:
        $dirty = $dirty | r37;
        goto L23
    L21:
        r37 = 128;
        goto L22
    }

    private static final void LandscapePromptPanel(final AIModel selectedModel, final Function1<? super AIModel, Unit> r28, final List<String> r29, final boolean enabled, final Function1<? super String, Unit> r31, final Function0<Unit> r32, Composer $composer, final int $changed) {
        Composer $composer2 = $composer.startRestartGroup(-572152157);
        ComposerKt.sourceInformation($composer2, "C(LandscapePromptPanel)P(5,1,4)552@20487L3324,538@19939L3872:ChatScreen.kt#cyjvf");
        int $dirty = $changed;
        if (($changed & 6) != 0) goto L10;
        if ($composer2.changed(selectedModel.ordinal()) == false) goto L7;
        int r3 = 4;
    L8:
        $dirty = $dirty | r3;
        goto L10
    L7:
        r3 = 2;
    L10:
        if (($changed & 48) != 0) goto L16;
        final Function1<? super AIModel, Unit> r4 = r28;
        if ($composer2.changedInstance(r4) == false) goto L14;
        int r9 = 32;
    L15:
        $dirty = $dirty | r9;
    L18:
        if (($changed & 384) != 0) goto L25;
        if ($composer2.changedInstance(r29) == false) goto L22;
        int r10 = 256;
    L23:
        $dirty = $dirty | r10;
        goto L25
    L22:
        r10 = 128;
    L25:
        if (($changed & 3072) != 0) goto L31;
        boolean r11 = enabled;
        if ($composer2.changed(r11) == false) goto L29;
        int r12 = 2048;
    L30:
        $dirty = $dirty | r12;
    L33:
        if (($changed & 24576) != 0) goto L41;
        if ($composer2.changedInstance(r31) == false) goto L37;
        int r13 = 16384;
    L38:
        $dirty = $dirty | r13;
        goto L41
    L37:
        r13 = 8192;
    L41:
        if ((196608 & $changed) != 0) goto L47;
        Function0<Unit> r14 = r32;
        if ($composer2.changedInstance(r14) == false) goto L45;
        int r15 = 131072;
    L46:
        $dirty = $dirty | r15;
    L48:
        int $dirty2 = $dirty;
        boolean r16 = false;
        if ((74899 & $dirty2) == 74898) goto L51;
        boolean r2 = true;
    L53:
        if ($composer2.shouldExecute(r2, $dirty2 & 1) == true) goto L55;
        Composer $composer3 = $composer2;
        $composer3.skipToGroupEnd();
    L87:
        ScopeUpdateScope r8 = $composer3.endRestartGroup();
        if (r8 == null) goto L91;
        r8.updateScope(new ChatScreenKt$$ExternalSyntheticLambda51(selectedModel, r28, r29, enabled, r31, r32, $changed));
        return;
    L91:
        return;
    L55:
        if (ComposerKt.isTraceInProgress() == false) goto L57;
        ComposerKt.traceEventStart(-572152157, $dirty2, -1, "com.luchime.huiyuan.ui.LandscapePromptPanel (ChatScreen.kt:537)");
    L57:
        Modifier r17 = WindowInsetsPadding_androidKt.navigationBarsPadding(WindowInsetsPadding_androidKt.statusBarsPadding(BorderKt.m245borderxT4_qwU(BackgroundKt.background$default(SizeKt.m777width3ABfNKs(SizeKt.fillMaxHeight$default(Modifier.Companion, 0.0f, 1, null), Dp.m6973constructorimpl(238)), Brush.Companion.m4323verticalGradient8A3gB4$default(Brush.Companion, CollectionsKt.listOf(new Color[]{Color.m4356boximpl(HuiyuanDesignKt.getSignalYellow()), Color.m4356boximpl(ColorKt.Color(4294948142L)), Color.m4356boximpl(HuiyuanDesignKt.getSignalPink())}), 0.0f, 0.0f, 0, 14, null), null, 0.0f, 6, null), Dp.m6973constructorimpl(2), HuiyuanDesignKt.getInk(), RectangleShapeKt.getRectangleShape())));
        PaddingValues r18 = PaddingKt.m719PaddingValuesYgX7TsA(Dp.m6973constructorimpl(12), Dp.m6973constructorimpl(10));
        Arrangement.HorizontalOrVertical r19 = Arrangement.INSTANCE.m606spacedBy0680j_4(Dp.m6973constructorimpl(8));
        ComposerKt.sourceInformationMarkerStart($composer2, -82380737, "CC(remember):ChatScreen.kt#9igjgp");
        if (($dirty2 & 14) != 4) goto L60;
        boolean r0 = true;
    L62:
        if (($dirty2 & 112) != 32) goto L64;
        boolean r5 = true;
    L65:
        boolean r1 = r0 | r5;
        if (($dirty2 & 7168) != 2048) goto L68;
        boolean r6 = true;
    L69:
        boolean r7 = r1 | r6;
        if ((458752 & $dirty2) != 131072) goto L72;
        boolean r20 = true;
    L73:
        boolean r21 = (r7 | r20) | $composer2.changedInstance(r29);
        if ((57344 & $dirty2) != 16384) goto L76;
        r16 = true;
    L76:
        boolean r110 = r21 | r16;
        Object r22 = $composer2.rememberedValue();
        if (r110 == false) goto L79;
    L82:
        final boolean r23 = r11;
        final Function0<Unit> r24 = r14;
        r22 = new ChatScreenKt$$ExternalSyntheticLambda50(r29, selectedModel, r4, r23, r24, r31);
        $composer2.updateRememberedValue(r22);
    L83:
        ComposerKt.sourceInformationMarkerEnd($composer2);
        $composer3 = $composer2;
        LazyDslKt.LazyColumn(r17, null, r18, false, r19, null, null, false, null, (Function1) r22, $composer3, 24960, 490);
        if (ComposerKt.isTraceInProgress() == false) goto L87;
        ComposerKt.traceEventEnd();
        goto L87
    L79:
        if (r22 != Composer.Companion.getEmpty()) goto L83;
    L72:
        r20 = false;
        goto L73
    L68:
        r6 = false;
        goto L69
    L64:
        r5 = false;
        goto L65
    L60:
        r0 = false;
        goto L62
    L51:
        r2 = false;
        goto L53
    L45:
        r15 = 65536;
        goto L46
    L47:
        r14 = r32;
        goto L48
    L29:
        r12 = 1024;
        goto L30
    L31:
        r11 = enabled;
        goto L33
    L14:
        r9 = 16;
        goto L15
    L16:
        r4 = r28;
        goto L18
    }

    static final Unit LandscapePromptPanel$lambda$81$lambda$80(final List $questions, final AIModel $selectedModel, final Function1 $onModelSelected, final boolean $enabled, final Function0 $onRefresh, final Function1 $onPrompt, LazyListScope $this$LazyColumn) {
        Intrinsics.checkNotNullParameter($this$LazyColumn, "$this$LazyColumn");
        LazyListScope.item$default($this$LazyColumn, null, null, ComposableLambdaKt.composableLambdaInstance(-1045391250, true, new ChatScreenKt$$ExternalSyntheticLambda14($selectedModel)), 3, null);
        LazyListScope.item$default($this$LazyColumn, null, null, ComposableLambdaKt.composableLambdaInstance(-296958697, true, new ChatScreenKt$$ExternalSyntheticLambda15($selectedModel, $onModelSelected, $enabled)), 3, null);
        LazyListScope.item$default($this$LazyColumn, null, null, ComposableLambdaKt.composableLambdaInstance(1726540854, true, new ChatScreenKt$$ExternalSyntheticLambda16($onRefresh)), 3, null);
        final Function1 r2 = new ChatScreenKt$$ExternalSyntheticLambda17();
        final Function1 r5 = ChatScreenKt$LandscapePromptPanel$lambda$81$lambda$80$$inlined$items$default$1.INSTANCE;
        $this$LazyColumn.items($questions.size(), new ChatScreenKt$LandscapePromptPanel$lambda$81$lambda$80$$inlined$items$default$2(r2, $questions), new ChatScreenKt$LandscapePromptPanel$lambda$81$lambda$80$$inlined$items$default$3(r5, $questions), ComposableLambdaKt.composableLambdaInstance(-632812321, true, new ChatScreenKt$LandscapePromptPanel$lambda$81$lambda$80$$inlined$items$default$4($questions, $enabled, $onPrompt)));
        return Unit.INSTANCE;
    }

    static final Unit LandscapePromptPanel$lambda$81$lambda$80$lambda$73(AIModel $selectedModel, LazyItemScope $this$item, Composer $composer, int $changed) {
        Intrinsics.checkNotNullParameter($this$item, "$this$item");
        ComposerKt.sourceInformation($composer, "C554@20516L1373:ChatScreen.kt#cyjvf");
        if (($changed & 17) == 16) goto L5;
        boolean r2 = true;
    L7:
        if ($composer.shouldExecute(r2, $changed & 1) == true) goto L9;
        $composer.skipToGroupEnd();
    L61:
        return Unit.INSTANCE;
    L9:
        if (ComposerKt.isTraceInProgress() == false) goto L11;
        ComposerKt.traceEventStart(-1045391250, $changed, -1, "com.luchime.huiyuan.ui.LandscapePromptPanel.<anonymous>.<anonymous>.<anonymous> (ChatScreen.kt:554)");
    L11:
        Modifier r3 = SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, null);
        Alignment.Vertical r8 = Alignment.Companion.getCenterVertically();
        ComposerKt.sourceInformationMarkerStart($composer, 693286680, "CC(Row)P(2,1,3)99@5124L58,100@5187L130:Row.kt#2w3rfo");
        MeasurePolicy r13 = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), r8, $composer, ((390 >> 3) & 14) | ((390 >> 3) & 112));
        ComposerKt.sourceInformationMarkerStart($composer, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
        int r19 = ComposablesKt.getCurrentCompositeKeyHash($composer, 0);
        CompositionLocalMap r7 = $composer.getCurrentCompositionLocalMap();
        Modifier r6 = ComposedModifierKt.materializeModifier($composer, r3);
        Function0<ComposeUiNode> r22 = ComposeUiNode.Companion.getConstructor();
        int r4 = ((((390 << 3) & 112) << 6) & 896) | 6;
        ComposerKt.sourceInformationMarkerStart($composer, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
        if (($composer.getApplier() instanceof Applier) == true) goto L14;
        ComposablesKt.invalidApplier();
    L14:
        $composer.startReusableNode();
        if ($composer.getInserting() == false) goto L17;
        Function0<ComposeUiNode> r0 = r22;
        $composer.createNode(r0);
    L18:
        Composer r1 = Updater.m3808constructorimpl($composer);
        Updater.m3815setimpl(r1, r13, ComposeUiNode.Companion.getSetMeasurePolicy());
        Updater.m3815setimpl(r1, r7, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> r5 = ComposeUiNode.Companion.getSetCompositeKeyHash();
        if (r1.getInserting() == true) goto L24;
        int r31 = r4;
        if (Intrinsics.areEqual(r1.rememberedValue(), Integer.valueOf(r19)) == true) goto L26;
    L25:
        r1.updateRememberedValue(Integer.valueOf(r19));
        r1.apply(Integer.valueOf(r19), r5);
    L26:
        Updater.m3815setimpl(r1, r6, ComposeUiNode.Companion.getSetModifier());
        int r9 = (r31 >> 6) & 14;
        ComposerKt.sourceInformationMarkerStart($composer, -407735110, "C101@5232L9:Row.kt#2w3rfo");
        RowScopeInstance r10 = RowScopeInstance.INSTANCE;
        int r11 = ((390 >> 6) & 112) | 6;
        ComposerKt.sourceInformationMarkerStart($composer, 551872034, "C558@20668L631,573@21316L559:ChatScreen.kt#cyjvf");
        Modifier r12 = ClipKt.clip(BackgroundKt.m233backgroundbw27NRU(PaddingKt.m725padding3ABfNKs(BackgroundKt.m233backgroundbw27NRU(SizeKt.m772size3ABfNKs(Modifier.Companion, Dp.m6973constructorimpl(56)), HuiyuanDesignKt.getInk(), RoundedCornerShapeKt.getCircleShape()), Dp.m6973constructorimpl(2)), HuiyuanDesignKt.getCream(), RoundedCornerShapeKt.getCircleShape()), RoundedCornerShapeKt.getCircleShape());
        ComposerKt.sourceInformationMarkerStart($composer, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
        MeasurePolicy r14 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.getTopStart(), false);
        ComposerKt.sourceInformationMarkerStart($composer, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
        int r42 = ComposablesKt.getCurrentCompositeKeyHash($composer, 0);
        CompositionLocalMap r15 = $composer.getCurrentCompositionLocalMap();
        Modifier r16 = ComposedModifierKt.materializeModifier($composer, r12);
        Function0<ComposeUiNode> r44 = ComposeUiNode.Companion.getConstructor();
        int r17 = ((((0 << 3) & 112) << 6) & 896) | 6;
        ComposerKt.sourceInformationMarkerStart($composer, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
        if (($composer.getApplier() instanceof Applier) == true) goto L29;
        ComposablesKt.invalidApplier();
    L29:
        $composer.startReusableNode();
        if ($composer.getInserting() == false) goto L32;
        Function0<ComposeUiNode> r18 = r44;
        $composer.createNode(r18);
    L33:
        Composer r20 = Updater.m3808constructorimpl($composer);
        Updater.m3815setimpl(r20, r14, ComposeUiNode.Companion.getSetMeasurePolicy());
        Updater.m3815setimpl(r20, r15, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> r21 = ComposeUiNode.Companion.getSetCompositeKeyHash();
        if (r20.getInserting() == true) goto L40;
        if (Intrinsics.areEqual(r20.rememberedValue(), Integer.valueOf(r42)) == false) goto L40;
    L41:
        Updater.m3815setimpl(r20, r16, ComposeUiNode.Companion.getSetModifier());
        int r23 = (r17 >> 6) & 14;
        ComposerKt.sourceInformationMarkerStart($composer, -2146730711, "C72@3468L9:Box.kt#2w3rfo");
        BoxScopeInstance r24 = BoxScopeInstance.INSTANCE;
        int r25 = ((0 >> 6) & 112) | 6;
        ComposerKt.sourceInformationMarkerStart($composer, 102203828, "C567@21023L40,566@20982L299:ChatScreen.kt#cyjvf");
        ImageKt.Image(PainterResources_androidKt.painterResource($selectedModel.getAvatarRes(), $composer, 0), $selectedModel.getDisplayName() + "头像", SizeKt.fillMaxSize$default(Modifier.Companion, 0.0f, 1, null), null, ContentScale.Companion.getCrop(), 0.0f, null, $composer, 24960, LocationRequestCompat.QUALITY_LOW_POWER);
        ComposerKt.sourceInformationMarkerEnd($composer);
        ComposerKt.sourceInformationMarkerEnd($composer);
        $composer.endNode();
        ComposerKt.sourceInformationMarkerEnd($composer);
        ComposerKt.sourceInformationMarkerEnd($composer);
        ComposerKt.sourceInformationMarkerEnd($composer);
        Modifier r26 = PaddingKt.m729paddingqDBjuR0$default(Modifier.Companion, Dp.m6973constructorimpl(9), 0.0f, 0.0f, 0.0f, 14, null);
        ComposerKt.sourceInformationMarkerStart($composer, -483455358, "CC(Column)P(2,3,1)87@4442L61,88@4508L133:Column.kt#2w3rfo");
        MeasurePolicy r27 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.Companion.getStart(), $composer, ((6 >> 3) & 14) | ((6 >> 3) & 112));
        ComposerKt.sourceInformationMarkerStart($composer, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
        int r28 = ComposablesKt.getCurrentCompositeKeyHash($composer, 0);
        CompositionLocalMap r29 = $composer.getCurrentCompositionLocalMap();
        Modifier r30 = ComposedModifierKt.materializeModifier($composer, r26);
        Function0<ComposeUiNode> r210 = ComposeUiNode.Companion.getConstructor();
        int r32 = ((((6 << 3) & 112) << 6) & 896) | 6;
        ComposerKt.sourceInformationMarkerStart($composer, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
        if (($composer.getApplier() instanceof Applier) == true) goto L44;
        ComposablesKt.invalidApplier();
    L44:
        $composer.startReusableNode();
        if ($composer.getInserting() == false) goto L47;
        Function0<ComposeUiNode> r33 = r210;
        $composer.createNode(r33);
    L48:
        Composer r34 = Updater.m3808constructorimpl($composer);
        Updater.m3815setimpl(r34, r27, ComposeUiNode.Companion.getSetMeasurePolicy());
        Updater.m3815setimpl(r34, r29, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> r35 = ComposeUiNode.Companion.getSetCompositeKeyHash();
        if (r34.getInserting() == true) goto L54;
        Composer r46 = $composer;
        if (Intrinsics.areEqual(r34.rememberedValue(), Integer.valueOf(r28)) == true) goto L56;
    L55:
        r34.updateRememberedValue(Integer.valueOf(r28));
        r34.apply(Integer.valueOf(r28), r35);
    L56:
        Updater.m3815setimpl(r34, r30, ComposeUiNode.Companion.getSetModifier());
        int r36 = (r32 >> 6) & 14;
        Composer r37 = r46;
        ComposerKt.sourceInformationMarkerStart(r37, -384672921, "C89@4556L9:Column.kt#2w3rfo");
        ColumnScopeInstance r38 = ColumnScopeInstance.INSTANCE;
        int r39 = ((6 >> 6) & 112) | 6;
        ComposerKt.sourceInformationMarkerStart(r37, 1540909754, "C574@21388L255,581@21664L193:ChatScreen.kt#cyjvf");
        TextKt.m2820Text4IGK_g($selectedModel.getDisplayName(), null, HuiyuanDesignKt.getInk(), TextUnitKt.getSp(24), null, FontWeight.Companion.getBlack(), null, 0, null, null, TextUnitKt.getSp(25), 0, false, 0, 0, null, null, r37, 200064, 6, 130002);
        TextKt.m2820Text4IGK_g("横屏认知工作台", null, HuiyuanDesignKt.getInk(), TextUnitKt.getSp(9), null, FontWeight.Companion.getBold(), null, 0, null, null, 0, 0, false, 0, 0, null, null, r37, 200070, 0, 131026);
        ComposerKt.sourceInformationMarkerEnd(r37);
        ComposerKt.sourceInformationMarkerEnd(r37);
        r46.endNode();
        ComposerKt.sourceInformationMarkerEnd(r46);
        ComposerKt.sourceInformationMarkerEnd(r46);
        ComposerKt.sourceInformationMarkerEnd(r46);
        ComposerKt.sourceInformationMarkerEnd($composer);
        ComposerKt.sourceInformationMarkerEnd($composer);
        $composer.endNode();
        ComposerKt.sourceInformationMarkerEnd($composer);
        ComposerKt.sourceInformationMarkerEnd($composer);
        ComposerKt.sourceInformationMarkerEnd($composer);
        if (ComposerKt.isTraceInProgress() == false) goto L61;
        ComposerKt.traceEventEnd();
        goto L61
    L54:
        r46 = $composer;
        goto L55
    L47:
        r33 = r210;
        $composer.useNode();
    L40:
        r20.updateRememberedValue(Integer.valueOf(r42));
        r20.apply(Integer.valueOf(r42), r21);
        goto L41
    L32:
        r18 = r44;
        $composer.useNode();
        goto L33
    L24:
        r31 = r4;
        goto L25
    L17:
        r0 = r22;
        $composer.useNode();
        goto L18
    L5:
        r2 = false;
        goto L7
    }

    static final Unit LandscapePromptPanel$lambda$81$lambda$80$lambda$74(AIModel $selectedModel, Function1 $onModelSelected, boolean $enabled, LazyItemScope $this$item, Composer $composer, int $changed) {
        Intrinsics.checkNotNullParameter($this$item, "$this$item");
        ComposerKt.sourceInformation($composer, "C591@21916L54:ChatScreen.kt#cyjvf");
        if (($changed & 17) == 16) goto L5;
        boolean r0 = true;
    L7:
        if ($composer.shouldExecute(r0, $changed & 1) == true) goto L9;
        $composer.skipToGroupEnd();
    L16:
        return Unit.INSTANCE;
    L9:
        if (ComposerKt.isTraceInProgress() == false) goto L11;
        ComposerKt.traceEventStart(-296958697, $changed, -1, "com.luchime.huiyuan.ui.LandscapePromptPanel.<anonymous>.<anonymous>.<anonymous> (ChatScreen.kt:591)");
    L11:
        ModelSelector($selectedModel, $onModelSelected, $enabled, $composer, 0, 0);
        if (ComposerKt.isTraceInProgress() == false) goto L16;
        ComposerKt.traceEventEnd();
        goto L16
    L5:
        r0 = false;
        goto L7
    }

    static final Unit LandscapePromptPanel$lambda$81$lambda$80$lambda$76(Function0 $onRefresh, LazyItemScope $this$item, Composer $composer, int $changed) {
        Intrinsics.checkNotNullParameter($this$item, "$this$item");
        ComposerKt.sourceInformation($composer, "C594@22001L841:ChatScreen.kt#cyjvf");
        if (($changed & 17) == 16) goto L5;
        boolean r2 = true;
    L7:
        if ($composer.shouldExecute(r2, $changed & 1) == true) goto L9;
        $composer.skipToGroupEnd();
    L31:
        return Unit.INSTANCE;
    L9:
        if (ComposerKt.isTraceInProgress() == false) goto L11;
        ComposerKt.traceEventStart(1726540854, $changed, -1, "com.luchime.huiyuan.ui.LandscapePromptPanel.<anonymous>.<anonymous>.<anonymous> (ChatScreen.kt:594)");
    L11:
        Modifier r3 = SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, null);
        Arrangement.Horizontal r4 = Arrangement.INSTANCE.getSpaceBetween();
        Alignment.Vertical r6 = Alignment.Companion.getCenterVertically();
        ComposerKt.sourceInformationMarkerStart($composer, 693286680, "CC(Row)P(2,1,3)99@5124L58,100@5187L130:Row.kt#2w3rfo");
        MeasurePolicy r10 = RowKt.rowMeasurePolicy(r4, r6, $composer, ((438 >> 3) & 14) | ((438 >> 3) & 112));
        ComposerKt.sourceInformationMarkerStart($composer, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
        int r5 = ComposablesKt.getCurrentCompositeKeyHash($composer, 0);
        CompositionLocalMap r14 = $composer.getCurrentCompositionLocalMap();
        Modifier r15 = ComposedModifierKt.materializeModifier($composer, r3);
        Function0<ComposeUiNode> r16 = ComposeUiNode.Companion.getConstructor();
        int r0 = ((((438 << 3) & 112) << 6) & 896) | 6;
        ComposerKt.sourceInformationMarkerStart($composer, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
        if (($composer.getApplier() instanceof Applier) == true) goto L14;
        ComposablesKt.invalidApplier();
    L14:
        $composer.startReusableNode();
        if ($composer.getInserting() == false) goto L17;
        Function0<ComposeUiNode> r1 = r16;
        $composer.createNode(r1);
    L18:
        Composer r7 = Updater.m3808constructorimpl($composer);
        Updater.m3815setimpl(r7, r10, ComposeUiNode.Companion.getSetMeasurePolicy());
        Updater.m3815setimpl(r7, r14, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> r8 = ComposeUiNode.Companion.getSetCompositeKeyHash();
        if (r7.getInserting() == true) goto L25;
        if (Intrinsics.areEqual(r7.rememberedValue(), Integer.valueOf(r5)) == false) goto L25;
    L26:
        Updater.m3815setimpl(r7, r15, ComposeUiNode.Companion.getSetModifier());
        int r9 = (r0 >> 6) & 14;
        ComposerKt.sourceInformationMarkerStart($composer, -407735110, "C101@5232L9:Row.kt#2w3rfo");
        RowScopeInstance r11 = RowScopeInstance.INSTANCE;
        int r12 = ((438 >> 6) & 112) | 6;
        ComposerKt.sourceInformationMarkerStart($composer, 1257147376, "C599@22219L74,600@22310L518:ChatScreen.kt#cyjvf");
        TextKt.m2820Text4IGK_g("快捷提问", null, HuiyuanDesignKt.getInk(), TextUnitKt.getSp(13), null, FontWeight.Companion.getBlack(), null, 0, null, null, 0, 0, false, 0, 0, null, null, $composer, 200070, 0, 131026);
        TextKt.m2820Text4IGK_g("⟳ 换一批", PaddingKt.m726paddingVpY3zN4(AppHapticsKt.hapticClickable$default(BorderKt.m245borderxT4_qwU(BackgroundKt.m233backgroundbw27NRU(Modifier.Companion, Color.Companion.m4403getWhite0d7_KjU(), RoundedCornerShapeKt.m1018RoundedCornerShape0680j_4(Dp.m6973constructorimpl(8))), Dp.m6973constructorimpl((float) 1.5d), HuiyuanDesignKt.getInk(), RoundedCornerShapeKt.m1018RoundedCornerShape0680j_4(Dp.m6973constructorimpl(8))), false, HapticCue.SELECTION, $onRefresh, 1, null), Dp.m6973constructorimpl(8), Dp.m6973constructorimpl(5)), HuiyuanDesignKt.getInk(), TextUnitKt.getSp(10), null, FontWeight.Companion.getBlack(), null, 0, null, null, 0, 0, false, 0, 0, null, null, $composer, 200070, 0, 131024);
        ComposerKt.sourceInformationMarkerEnd($composer);
        ComposerKt.sourceInformationMarkerEnd($composer);
        $composer.endNode();
        ComposerKt.sourceInformationMarkerEnd($composer);
        ComposerKt.sourceInformationMarkerEnd($composer);
        ComposerKt.sourceInformationMarkerEnd($composer);
        if (ComposerKt.isTraceInProgress() == false) goto L31;
        ComposerKt.traceEventEnd();
    L25:
        r7.updateRememberedValue(Integer.valueOf(r5));
        r7.apply(Integer.valueOf(r5), r8);
        goto L26
    L17:
        r1 = r16;
        $composer.useNode();
        goto L18
    L5:
        r2 = false;
        goto L7
    }

    static final Object LandscapePromptPanel$lambda$81$lambda$80$lambda$77(String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return it;
    }

    private static final void ModelSelector(final AIModel selected, final Function1<? super AIModel, Unit> r67, boolean enabled, Composer $composer, final int $changed, final int r71) {
        AIModel r1 = selected;
        Composer $composer2 = $composer.startRestartGroup(8210125);
        ComposerKt.sourceInformation($composer2, "C(ModelSelector)P(2,1)648@23996L21,647@23946L975:ChatScreen.kt#cyjvf");
        int $dirty = $changed;
        if (($changed & 6) != 0) goto L10;
        if ($composer2.changed(r1.ordinal()) == false) goto L7;
        int r5 = 4;
    L8:
        $dirty = $dirty | r5;
        goto L10
    L7:
        r5 = 2;
    L10:
        if (($changed & 48) == 0) goto L12;
    L16:
        int r6 = r71 & 4;
        if (r6 == 0) goto L20;
        $dirty = $dirty | 384;
        boolean r8 = enabled;
    L27:
        int $dirty2 = $dirty;
        if (($dirty2 & 147) == 146) goto L30;
        boolean r3 = true;
    L32:
        if ($composer2.shouldExecute(r3, $dirty2 & 1) == false) goto L93;
        if (r6 == 0) goto L35;
        boolean enabled2 = true;
    L37:
        if (ComposerKt.isTraceInProgress() == false) goto L39;
        ComposerKt.traceEventStart(8210125, $dirty2, -1, "com.luchime.huiyuan.ui.ModelSelector (ChatScreen.kt:646)");
    L39:
        Modifier r0 = ScrollKt.horizontalScroll$default(Modifier.Companion, ScrollKt.rememberScrollState(0, $composer2, 0, 1), false, null, false, 14, null);
        Arrangement.Horizontal r7 = Arrangement.INSTANCE.m606spacedBy0680j_4(Dp.m6973constructorimpl(6));
        int r9 = 48;
        ComposerKt.sourceInformationMarkerStart($composer2, 693286680, "CC(Row)P(2,1,3)99@5124L58,100@5187L130:Row.kt#2w3rfo");
        MeasurePolicy r15 = RowKt.rowMeasurePolicy(r7, Alignment.Companion.getTop(), $composer2, ((48 >> 3) & 14) | ((48 >> 3) & 112));
        ComposerKt.sourceInformationMarkerStart($composer2, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
        int r10 = ComposablesKt.getCurrentCompositeKeyHash($composer2, 0);
        CompositionLocalMap r11 = $composer2.getCurrentCompositionLocalMap();
        Modifier r2 = ComposedModifierKt.materializeModifier($composer2, r0);
        Function0<ComposeUiNode> r20 = ComposeUiNode.Companion.getConstructor();
        boolean enabled3 = enabled2;
        int r4 = ((((48 << 3) & 112) << 6) & 896) | 6;
        ComposerKt.sourceInformationMarkerStart($composer2, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
        if (($composer2.getApplier() instanceof Applier) == true) goto L42;
        ComposablesKt.invalidApplier();
    L42:
        $composer2.startReusableNode();
        if ($composer2.getInserting() == false) goto L45;
        Function0<ComposeUiNode> r12 = r20;
        $composer2.createNode(r12);
    L46:
        Composer r13 = Updater.m3808constructorimpl($composer2);
        Updater.m3815setimpl(r13, r15, ComposeUiNode.Companion.getSetMeasurePolicy());
        Updater.m3815setimpl(r13, r11, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> r14 = ComposeUiNode.Companion.getSetCompositeKeyHash();
        if (r13.getInserting() == true) goto L52;
        int r29 = r10;
        if (Intrinsics.areEqual(r13.rememberedValue(), Integer.valueOf(r29)) == true) goto L54;
    L53:
        r13.updateRememberedValue(Integer.valueOf(r29));
        r13.apply(Integer.valueOf(r29), r14);
    L54:
        Updater.m3815setimpl(r13, r2, ComposeUiNode.Companion.getSetModifier());
        int r16 = (r4 >> 6) & 14;
        int r17 = 0;
        ComposerKt.sourceInformationMarkerStart($composer2, -407735110, "C101@5232L9:Row.kt#2w3rfo");
        RowScopeInstance r18 = RowScopeInstance.INSTANCE;
        int r19 = ((48 >> 6) & 112) | 6;
        ComposerKt.sourceInformationMarkerStart($composer2, -2044716922, "C:ChatScreen.kt#cyjvf");
        $composer2.startReplaceGroup(-620147443);
        ComposerKt.sourceInformation($composer2, "*659@24531L374");
        Iterable r21 = AIModel.getEntries();
        int r22 = 0;
        Iterator<AIModel> r56 = r21.iterator();
    L56:
        if (r56.hasNext() == false) goto L89;
        Iterable r58 = r21;
        final AIModel r23 = (AIModel) r56.next();
        if (r23 != r1) goto L60;
        boolean r30 = true;
    L61:
        boolean r60 = r30;
        Modifier.Companion r24 = Modifier.Companion;
        if (r60 == false) goto L64;
        long r31 = Color.Companion.m4403getWhite0d7_KjU();
    L65:
        int r62 = r19;
        int r61 = r9;
        int r63 = r22;
        int r64 = r17;
        int $dirty3 = $dirty2;
        Modifier r32 = BorderKt.m245borderxT4_qwU(BackgroundKt.m233backgroundbw27NRU(r24, r31, RoundedCornerShapeKt.m1018RoundedCornerShape0680j_4(Dp.m6973constructorimpl(8))), Dp.m6973constructorimpl((float) 1.5d), HuiyuanDesignKt.getInk(), RoundedCornerShapeKt.m1018RoundedCornerShape0680j_4(Dp.m6973constructorimpl(8)));
        if (enabled3 == false) goto L79;
        $composer2.startReplaceGroup(-1591424687);
        ComposerKt.sourceInformation($composer2, "657@24485L19");
        HapticCue r33 = HapticCue.SELECTION;
        ComposerKt.sourceInformationMarkerStart($composer2, 1334139538, "CC(remember):ChatScreen.kt#9igjgp");
        if (($dirty3 & 112) != 32) goto L70;
        boolean r25 = true;
    L71:
        boolean r26 = r25 | $composer2.changed(r23.ordinal());
        Object r27 = $composer2.rememberedValue();
        if (r26 == false) goto L74;
    L77:
        Object r28 = new ChatScreenKt$$ExternalSyntheticLambda43(r67, r23);
        $composer2.updateRememberedValue(r28);
        r27 = r28;
    L78:
        ComposerKt.sourceInformationMarkerEnd($composer2);
        r32 = AppHapticsKt.hapticClickable$default(r32, false, r33, (Function0) r27, 1, null);
    L80:
        $composer2.endReplaceGroup();
        Modifier r34 = r32;
        String r35 = r23.getChipLabel();
        if (r60 == false) goto L83;
        long r36 = HuiyuanDesignKt.getInk();
    L84:
        long r37 = r36;
        long r38 = TextUnitKt.getSp(10);
        FontWeight r39 = FontWeight.Companion.getBlack();
        Modifier.Companion r40 = Modifier.Companion;
        if (enabled3 == true) goto L88;
        r40 = AlphaKt.alpha(r40, 0.48f);
    L88:
        TextKt.m2820Text4IGK_g(r35, PaddingKt.m726paddingVpY3zN4(r34.then(r40), Dp.m6973constructorimpl(9), Dp.m6973constructorimpl(6)), r37, r38, null, r39, null, 0, null, null, 0, 0, false, 0, 0, null, null, $composer2, 199680, 0, 131024);
        r1 = selected;
        r21 = r58;
        r9 = r61;
        r19 = r62;
        r22 = r63;
        r17 = r64;
        $dirty2 = $dirty3;
        goto L56
    L83:
        r36 = Color.Companion.m4403getWhite0d7_KjU();
        goto L84
    L74:
        if (r27 != Composer.Companion.getEmpty()) goto L78;
    L70:
        r25 = false;
        goto L71
    L79:
        $composer2.startReplaceGroup(-1615637981);
        goto L80
    L64:
        r31 = Color.m4365copywmQWz5c$default(HuiyuanDesignKt.getInk(), 0.78f, 0.0f, 0.0f, 0.0f, 14, null);
        goto L65
    L60:
        r30 = false;
        goto L61
    L89:
        $composer2.endReplaceGroup();
        ComposerKt.sourceInformationMarkerEnd($composer2);
        ComposerKt.sourceInformationMarkerEnd($composer2);
        $composer2.endNode();
        ComposerKt.sourceInformationMarkerEnd($composer2);
        ComposerKt.sourceInformationMarkerEnd($composer2);
        ComposerKt.sourceInformationMarkerEnd($composer2);
        if (ComposerKt.isTraceInProgress() == false) goto L92;
        ComposerKt.traceEventEnd();
    L92:
        final boolean enabled4 = enabled3;
    L94:
        ScopeUpdateScope r41 = $composer2.endRestartGroup();
        if (r41 == null) goto L101;
        r41.updateScope(new ChatScreenKt$$ExternalSyntheticLambda44(selected, r67, enabled4, $changed, r71));
        return;
    L101:
        return;
    L52:
        r29 = r10;
        goto L53
    L45:
        r12 = r20;
        $composer2.useNode();
        goto L46
    L35:
        enabled2 = r8;
        goto L37
    L93:
        $composer2.skipToGroupEnd();
        enabled4 = r8;
        goto L94
    L30:
        r3 = false;
        goto L32
    L20:
        if (($changed & 384) != 0) goto L26;
        r8 = enabled;
        if ($composer2.changed(r8) == false) goto L24;
        int r42 = 256;
    L25:
        $dirty = $dirty | r42;
        goto L27
    L24:
        r42 = 128;
        goto L25
    L26:
        r8 = enabled;
        goto L27
    L12:
        if ($composer2.changedInstance(r67) == false) goto L14;
        int r43 = 32;
    L15:
        $dirty = $dirty | r43;
        goto L16
    L14:
        r43 = 16;
        goto L15
    }

    static final Unit ModelSelector$lambda$86$lambda$85$lambda$84$lambda$83(Function1 $onSelect, AIModel $model) {
        $onSelect.invoke($model);
        return Unit.INSTANCE;
    }

    private static final long modelAccent(AIModel model) {
        switch(WhenMappings.$EnumSwitchMapping$0[model.ordinal()]) {
            case 1: goto L10;
            case 2: goto L13;
            case 3: goto L12;
            case 4: goto L11;
            default: goto L5;
        };
    L5:
        throw new NoWhenBranchMatchedException();
    L11:
        return HuiyuanDesignKt.getSignalOrange();
    L12:
        return HuiyuanDesignKt.getSignalGreen();
    L13:
        return HuiyuanDesignKt.getSignalBlue();
    L10:
        return HuiyuanDesignKt.getSignalYellow();
    }

    private static final String heroEnglish(AIModel model) {
        switch(WhenMappings.$EnumSwitchMapping$0[model.ordinal()]) {
            case 1: goto L9;
            case 2: goto L8;
            case 3: goto L7;
            case 4: goto L6;
            default: goto L5;
        };
    L6:
        return "LINUX BEAR · TANGO SYSTEM";
    L7:
        return "CURLY TURTLE · ROBOMASTER";
    L8:
        return "PIXEL PENGUIN · DESKPARK";
    L9:
        return "CAPYBARA COGNITIVE\nENHANCEMENT";
    L5:
        throw new NoWhenBranchMatchedException();
    }

    private static final String heroSummary(AIModel model) {
        switch(WhenMappings.$EnumSwitchMapping$0[model.ordinal()]) {
            case 1: goto L9;
            case 2: goto L8;
            case 3: goto L7;
            case 4: goto L6;
            default: goto L5;
        };
    L6:
        return "Linux · C语言 · 魂系游戏\n电子设备 · 长沙美食";
    L7:
        return "养龟 · RoboMaster · 电路\n泡茶机 · 土家文化";
    L8:
        return "IT玩机 · 装机系统\ndeskpark · 热河路";
    L9:
        return "提升认知 · 破除焦虑\n佛系聊天 · 情绪稳定";
    L5:
        throw new NoWhenBranchMatchedException();
    }

    private static final void QuickPromptRow(final List<String> r92, final boolean enabled, final Function1<? super String, Unit> r94, final Function0<Unit> r95, Composer $composer, final int $changed) {
        Composer $composer2 = $composer.startRestartGroup(-458940283);
        ComposerKt.sourceInformation($composer2, "C(QuickPromptRow)P(3)701@25935L2343:ChatScreen.kt#cyjvf");
        int $dirty = $changed;
        if (($changed & 6) != 0) goto L10;
        if ($composer2.changedInstance(r92) == false) goto L7;
        int r7 = 4;
    L8:
        $dirty = $dirty | r7;
        goto L10
    L7:
        r7 = 2;
    L10:
        if (($changed & 48) != 0) goto L17;
        if ($composer2.changed(enabled) == false) goto L14;
        int r8 = 32;
    L15:
        $dirty = $dirty | r8;
        goto L17
    L14:
        r8 = 16;
    L17:
        if (($changed & 384) != 0) goto L24;
        if ($composer2.changedInstance(r94) == false) goto L21;
        int r9 = 256;
    L22:
        $dirty = $dirty | r9;
        goto L24
    L21:
        r9 = 128;
    L24:
        if (($changed & 3072) != 0) goto L30;
        Function0<Unit> r14 = r95;
        if ($composer2.changedInstance(r14) == false) goto L28;
        int r10 = 2048;
    L29:
        $dirty = $dirty | r10;
    L31:
        int $dirty2 = $dirty;
        if (($dirty2 & 1171) == 1170) goto L34;
        boolean r4 = true;
    L36:
        if ($composer2.shouldExecute(r4, $dirty2 & 1) == true) goto L38;
        Composer $composer3 = $composer2;
        $composer3.skipToGroupEnd();
    L112:
        ScopeUpdateScope r6 = $composer3.endRestartGroup();
        if (r6 == null) goto L119;
        r6.updateScope(new ChatScreenKt$$ExternalSyntheticLambda48(r92, enabled, r94, r95, $changed));
        return;
    L119:
        return;
    L38:
        if (ComposerKt.isTraceInProgress() == false) goto L40;
        ComposerKt.traceEventStart(-458940283, $dirty2, -1, "com.luchime.huiyuan.ui.QuickPromptRow (ChatScreen.kt:699)");
    L40:
        List colors = CollectionsKt.listOf(new Color[]{Color.m4356boximpl(HuiyuanDesignKt.getSignalYellow()), Color.m4356boximpl(HuiyuanDesignKt.getSignalGreen()), Color.m4356boximpl(HuiyuanDesignKt.getSignalBlue()), Color.m4356boximpl(HuiyuanDesignKt.getSignalPurple()), Color.m4356boximpl(HuiyuanDesignKt.getSignalRed()), Color.m4356boximpl(HuiyuanDesignKt.getSignalPink())});
        Modifier r0 = PaddingKt.m727paddingVpY3zN4$default(BorderKt.m245borderxT4_qwU(BackgroundKt.m234backgroundbw27NRU$default(SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, null), HuiyuanDesignKt.getSignalPurple(), null, 2, null), Dp.m6973constructorimpl(2), HuiyuanDesignKt.getInk(), RectangleShapeKt.getRectangleShape()), 0.0f, Dp.m6973constructorimpl(8), 1, null);
        ComposerKt.sourceInformationMarkerStart($composer2, -483455358, "CC(Column)P(2,3,1)87@4442L61,88@4508L133:Column.kt#2w3rfo");
        MeasurePolicy r13 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.Companion.getStart(), $composer2, ((6 >> 3) & 14) | ((6 >> 3) & 112));
        ComposerKt.sourceInformationMarkerStart($composer2, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
        int r27 = ComposablesKt.getCurrentCompositeKeyHash($composer2, 0);
        CompositionLocalMap r12 = $composer2.getCurrentCompositionLocalMap();
        Modifier r1 = ComposedModifierKt.materializeModifier($composer2, r0);
        Function0<ComposeUiNode> r21 = ComposeUiNode.Companion.getConstructor();
        int r2 = ((((6 << 3) & 112) << 6) & 896) | 6;
        ComposerKt.sourceInformationMarkerStart($composer2, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
        if (($composer2.getApplier() instanceof Applier) == true) goto L43;
        ComposablesKt.invalidApplier();
    L43:
        $composer2.startReusableNode();
        if ($composer2.getInserting() == false) goto L46;
        Function0<ComposeUiNode> r3 = r21;
        $composer2.createNode(r3);
    L47:
        Composer r5 = Updater.m3808constructorimpl($composer2);
        Updater.m3815setimpl(r5, r13, ComposeUiNode.Companion.getSetMeasurePolicy());
        Updater.m3815setimpl(r5, r12, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> r11 = ComposeUiNode.Companion.getSetCompositeKeyHash();
        if (r5.getInserting() == true) goto L53;
        Composer r38 = $composer2;
        if (Intrinsics.areEqual(r5.rememberedValue(), Integer.valueOf(r27)) == true) goto L55;
    L54:
        r5.updateRememberedValue(Integer.valueOf(r27));
        r5.apply(Integer.valueOf(r27), r11);
    L55:
        Updater.m3815setimpl(r5, r1, ComposeUiNode.Companion.getSetModifier());
        int r15 = (r2 >> 6) & 14;
        Composer r16 = r38;
        ComposerKt.sourceInformationMarkerStart(r16, -384672921, "C89@4556L9:Column.kt#2w3rfo");
        ColumnScopeInstance r17 = ColumnScopeInstance.INSTANCE;
        int r18 = ((6 >> 6) & 112) | 6;
        ComposerKt.sourceInformationMarkerStart(r16, -1895015426, "C708@26138L929,736@27180L21,733@27077L1195:ChatScreen.kt#cyjvf");
        Modifier r19 = PaddingKt.m727paddingVpY3zN4$default(SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, null), Dp.m6973constructorimpl(14), 0.0f, 2, null);
        Arrangement.Horizontal r20 = Arrangement.INSTANCE.getSpaceBetween();
        Alignment.Vertical r22 = Alignment.Companion.getCenterVertically();
        ComposerKt.sourceInformationMarkerStart(r16, 693286680, "CC(Row)P(2,1,3)99@5124L58,100@5187L130:Row.kt#2w3rfo");
        MeasurePolicy r23 = RowKt.rowMeasurePolicy(r20, r22, r16, ((438 >> 3) & 14) | ((438 >> 3) & 112));
        ComposerKt.sourceInformationMarkerStart(r16, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
        int r110 = ComposablesKt.getCurrentCompositeKeyHash(r16, 0);
        CompositionLocalMap r24 = r16.getCurrentCompositionLocalMap();
        Modifier r25 = ComposedModifierKt.materializeModifier(r16, r19);
        Function0<ComposeUiNode> r52 = ComposeUiNode.Companion.getConstructor();
        int r26 = ((((438 << 3) & 112) << 6) & 896) | 6;
        ComposerKt.sourceInformationMarkerStart(r16, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
        if ((r16.getApplier() instanceof Applier) == true) goto L58;
        ComposablesKt.invalidApplier();
    L58:
        r16.startReusableNode();
        if (r16.getInserting() == false) goto L61;
        Function0<ComposeUiNode> r28 = r52;
        r16.createNode(r28);
    L62:
        Composer r29 = Updater.m3808constructorimpl(r16);
        Updater.m3815setimpl(r29, r23, ComposeUiNode.Companion.getSetMeasurePolicy());
        Updater.m3815setimpl(r29, r24, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> r111 = ComposeUiNode.Companion.getSetCompositeKeyHash();
        if (r29.getInserting() == true) goto L69;
        if (Intrinsics.areEqual(r29.rememberedValue(), Integer.valueOf(r110)) == false) goto L69;
    L70:
        Updater.m3815setimpl(r29, r25, ComposeUiNode.Companion.getSetModifier());
        int r30 = (r26 >> 6) & 14;
        ComposerKt.sourceInformationMarkerStart(r16, -407735110, "C101@5232L9:Row.kt#2w3rfo");
        RowScopeInstance r57 = RowScopeInstance.INSTANCE;
        int r59 = ((438 >> 6) & 112) | 6;
        ComposerKt.sourceInformationMarkerStart(r16, -776089787, "C715@26398L82,716@26493L564:ChatScreen.kt#cyjvf");
        TextKt.m2820Text4IGK_g("热门问题", null, Color.Companion.m4403getWhite0d7_KjU(), TextUnitKt.getSp(13), null, FontWeight.Companion.getBlack(), null, 0, null, null, 0, 0, false, 0, 0, null, null, r16, 200070, 0, 131026);
        SurfaceKt.m2670SurfaceT9BRK9s(AppHapticsKt.hapticClickable$default(BorderKt.m245borderxT4_qwU(Modifier.Companion, Dp.m6973constructorimpl(2), HuiyuanDesignKt.getInk(), RoundedCornerShapeKt.getCircleShape()), false, HapticCue.SELECTION, r14, 1, null), RoundedCornerShapeKt.getCircleShape(), HuiyuanDesignKt.getSignalYellow(), 0, 0.0f, 0.0f, null, ComposableSingletons$ChatScreenKt.INSTANCE.m7403getLambda$1226650512$app(), r16, 12583296, 120);
        ComposerKt.sourceInformationMarkerEnd(r16);
        ComposerKt.sourceInformationMarkerEnd(r16);
        r16.endNode();
        ComposerKt.sourceInformationMarkerEnd(r16);
        ComposerKt.sourceInformationMarkerEnd(r16);
        ComposerKt.sourceInformationMarkerEnd(r16);
        Modifier r31 = PaddingKt.m726paddingVpY3zN4(ScrollKt.horizontalScroll$default(SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, null), ScrollKt.rememberScrollState(0, r16, 0, 1), false, null, false, 14, null), Dp.m6973constructorimpl(14), Dp.m6973constructorimpl(7));
        Arrangement.Horizontal r32 = Arrangement.INSTANCE.m606spacedBy0680j_4(Dp.m6973constructorimpl(9));
        Composer r112 = r16;
        int r113 = 48;
        ComposerKt.sourceInformationMarkerStart(r112, 693286680, "CC(Row)P(2,1,3)99@5124L58,100@5187L130:Row.kt#2w3rfo");
        Alignment.Vertical r114 = Alignment.Companion.getTop();
        MeasurePolicy r115 = RowKt.rowMeasurePolicy(r32, r114, r112, ((48 >> 3) & 14) | ((48 >> 3) & 112));
        ComposerKt.sourceInformationMarkerStart(r112, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
        int r33 = ComposablesKt.getCurrentCompositeKeyHash(r112, 0);
        CompositionLocalMap r34 = r112.getCurrentCompositionLocalMap();
        Modifier r35 = ComposedModifierKt.materializeModifier(r112, r31);
        Function0<ComposeUiNode> r116 = ComposeUiNode.Companion.getConstructor();
        int r36 = ((((48 << 3) & 112) << 6) & 896) | 6;
        ComposerKt.sourceInformationMarkerStart(r112, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
        if ((r112.getApplier() instanceof Applier) == true) goto L73;
        ComposablesKt.invalidApplier();
    L73:
        r112.startReusableNode();
        if (r112.getInserting() == false) goto L76;
        Function0<ComposeUiNode> r37 = r116;
        r112.createNode(r37);
    L77:
        Composer r39 = Updater.m3808constructorimpl(r112);
        Updater.m3815setimpl(r39, r115, ComposeUiNode.Companion.getSetMeasurePolicy());
        Updater.m3815setimpl(r39, r34, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> r40 = ComposeUiNode.Companion.getSetCompositeKeyHash();
        if (r39.getInserting() == true) goto L83;
        int r53 = r33;
        if (Intrinsics.areEqual(r39.rememberedValue(), Integer.valueOf(r53)) == true) goto L85;
    L84:
        r39.updateRememberedValue(Integer.valueOf(r53));
        r39.apply(Integer.valueOf(r53), r40);
    L85:
        Updater.m3815setimpl(r39, r35, ComposeUiNode.Companion.getSetModifier());
        int r41 = (r36 >> 6) & 14;
        ComposerKt.sourceInformationMarkerStart(r112, -407735110, "C101@5232L9:Row.kt#2w3rfo");
        RowScopeInstance r42 = RowScopeInstance.INSTANCE;
        int r43 = ((48 >> 6) & 112) | 6;
        ComposerKt.sourceInformationMarkerStart(r112, -1214510654, "C:ChatScreen.kt#cyjvf");
        r112.startReplaceGroup(99369879);
        ComposerKt.sourceInformation(r112, "*745@27678L72,750@27881L367,741@27413L835");
        List<String> r44 = r92;
        int r45 = 0;
        int r54 = 0;
        Iterator r55 = r44.iterator();
    L87:
        if (r55.hasNext() == false) goto L108;
        Object r56 = r55.next();
        int r58 = r54 + 1;
        if (r54 >= 0) goto L91;
        CollectionsKt.throwIndexOverflow();
    L91:
        Iterable r510 = r44;
        final String r46 = (String) r56;
        int r73 = r45;
        Modifier.Companion r47 = Modifier.Companion;
        if (enabled == false) goto L94;
        float r511 = 1.0f;
    L95:
        Modifier r74 = r35;
        int r75 = r43;
        Alignment.Vertical r76 = r114;
        Composer r77 = r112;
        int r78 = r113;
        Modifier r48 = BorderKt.m245borderxT4_qwU(AlphaKt.alpha(r47, r511), Dp.m6973constructorimpl(2), HuiyuanDesignKt.getInk(), RoundedCornerShapeKt.m1018RoundedCornerShape0680j_4(Dp.m6973constructorimpl(12)));
        HapticCue r49 = HapticCue.SELECTION;
        ComposerKt.sourceInformationMarkerStart(r112, 1790479286, "CC(remember):ChatScreen.kt#9igjgp");
        if (($dirty2 & 896) != 256) goto L98;
        boolean r117 = true;
    L99:
        boolean r50 = $composer2.changed(r46) | r117;
        Object r118 = r112.rememberedValue();
        if (r50 == true) goto L105;
        Composer $composer4 = $composer2;
        if (r118 != Composer.Companion.getEmpty()) goto L107;
    L106:
        Object r51 = new ChatScreenKt$$ExternalSyntheticLambda46(r94, r46);
        r112.updateRememberedValue(r51);
        r118 = r51;
    L107:
        ComposerKt.sourceInformationMarkerEnd(r112);
        SurfaceKt.m2670SurfaceT9BRK9s(AppHapticsKt.hapticClickable(r48, enabled, r49, (Function0) r118), RoundedCornerShapeKt.m1018RoundedCornerShape0680j_4(Dp.m6973constructorimpl(12)), ((Color) colors.get(r54 % colors.size())).m4376unboximpl(), 0, 0.0f, 0.0f, null, ComposableLambdaKt.rememberComposableLambda(-1719440013, true, new ChatScreenKt$$ExternalSyntheticLambda47(r46), r112, 54), r112, 12582912, 120);
        r54 = r58;
        r44 = r510;
        r45 = r73;
        r35 = r74;
        r43 = r75;
        r114 = r76;
        r112 = r77;
        r113 = r78;
        $composer2 = $composer4;
        goto L87
    L105:
        $composer4 = $composer2;
        goto L106
    L98:
        r117 = false;
        goto L99
    L94:
        r511 = 0.55f;
        goto L95
    L108:
        $composer3 = $composer2;
        Composer r79 = r112;
        r112.endReplaceGroup();
        ComposerKt.sourceInformationMarkerEnd(r112);
        ComposerKt.sourceInformationMarkerEnd(r112);
        r79.endNode();
        ComposerKt.sourceInformationMarkerEnd(r79);
        ComposerKt.sourceInformationMarkerEnd(r79);
        ComposerKt.sourceInformationMarkerEnd(r79);
        ComposerKt.sourceInformationMarkerEnd(r16);
        ComposerKt.sourceInformationMarkerEnd(r16);
        r38.endNode();
        ComposerKt.sourceInformationMarkerEnd(r38);
        ComposerKt.sourceInformationMarkerEnd(r38);
        ComposerKt.sourceInformationMarkerEnd(r38);
        if (ComposerKt.isTraceInProgress() == false) goto L112;
        ComposerKt.traceEventEnd();
        goto L112
    L83:
        r53 = r33;
        goto L84
    L76:
        r37 = r116;
        r112.useNode();
    L69:
        r29.updateRememberedValue(Integer.valueOf(r110));
        r29.apply(Integer.valueOf(r110), r111);
        goto L70
    L61:
        r28 = r52;
        r16.useNode();
        goto L62
    L53:
        r38 = $composer2;
        goto L54
    L46:
        r3 = r21;
        $composer2.useNode();
        goto L47
    L34:
        r4 = false;
        goto L36
    L28:
        r10 = 1024;
        goto L29
    L30:
        r14 = r95;
        goto L31
    }

    static final Unit QuickPromptRow$lambda$94$lambda$93$lambda$92$lambda$90$lambda$89(Function1 $onPrompt, String $prompt) {
        $onPrompt.invoke($prompt);
        return Unit.INSTANCE;
    }

    static final Unit QuickPromptRow$lambda$94$lambda$93$lambda$92$lambda$91(String $prompt, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C751@27903L327:ChatScreen.kt#cyjvf");
        if (($changed & 3) == 2) goto L5;
        boolean r2 = true;
    L7:
        if ($composer.shouldExecute(r2, $changed & 1) == true) goto L9;
        $composer.skipToGroupEnd();
    L16:
        return Unit.INSTANCE;
    L9:
        if (ComposerKt.isTraceInProgress() == false) goto L11;
        ComposerKt.traceEventStart(-1719440013, $changed, -1, "com.luchime.huiyuan.ui.QuickPromptRow.<anonymous>.<anonymous>.<anonymous>.<anonymous> (ChatScreen.kt:751)");
    L11:
        TextKt.m2820Text4IGK_g($prompt, PaddingKt.m726paddingVpY3zN4(Modifier.Companion, Dp.m6973constructorimpl(13), Dp.m6973constructorimpl(10)), HuiyuanDesignKt.getInk(), TextUnitKt.getSp(12), null, FontWeight.Companion.getBold(), null, 0, null, null, 0, 0, false, 1, 0, null, null, $composer, 200112, 3072, 122832);
        if (ComposerKt.isTraceInProgress() == false) goto L16;
        ComposerKt.traceEventEnd();
        goto L16
    L5:
        r2 = false;
        goto L7
    }

    private static final void ModelAvatar(final AIModel model, Composer $composer, final int $changed) {
        Composer $composer2 = $composer.startRestartGroup(-2108680164);
        ComposerKt.sourceInformation($composer2, "C(ModelAvatar)767@28340L462:ChatScreen.kt#cyjvf");
        int $dirty = $changed;
        if (($changed & 6) != 0) goto L10;
        if ($composer2.changed(model.ordinal()) == false) goto L7;
        int r5 = 4;
    L8:
        $dirty = $dirty | r5;
        goto L10
    L7:
        r5 = 2;
    L10:
        if (($dirty & 3) == 2) goto L12;
        boolean r6 = true;
    L14:
        if ($composer2.shouldExecute(r6, $dirty & 1) == true) goto L16;
        Composer $composer3 = $composer2;
        $composer3.skipToGroupEnd();
    L37:
        ScopeUpdateScope r2 = $composer3.endRestartGroup();
        if (r2 == null) goto L41;
        r2.updateScope(new ChatScreenKt$$ExternalSyntheticLambda27(model, $changed));
        return;
    L41:
        return;
    L16:
        if (ComposerKt.isTraceInProgress() == false) goto L18;
        ComposerKt.traceEventStart(-2108680164, $dirty, -1, "com.luchime.huiyuan.ui.ModelAvatar (ChatScreen.kt:766)");
    L18:
        Modifier r3 = ClipKt.clip(PaddingKt.m725padding3ABfNKs(BorderKt.m245borderxT4_qwU(BackgroundKt.m233backgroundbw27NRU(SizeKt.m772size3ABfNKs(Modifier.Companion, Dp.m6973constructorimpl(36)), modelAccent(model), RoundedCornerShapeKt.getCircleShape()), Dp.m6973constructorimpl(2), HuiyuanDesignKt.getInk(), RoundedCornerShapeKt.getCircleShape()), Dp.m6973constructorimpl(2)), RoundedCornerShapeKt.getCircleShape());
        ComposerKt.sourceInformationMarkerStart($composer2, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
        MeasurePolicy r12 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.getTopStart(), false);
        ComposerKt.sourceInformationMarkerStart($composer2, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
        int r8 = ComposablesKt.getCurrentCompositeKeyHash($composer2, 0);
        CompositionLocalMap r7 = $composer2.getCurrentCompositionLocalMap();
        Modifier r4 = ComposedModifierKt.materializeModifier($composer2, r3);
        Function0<ComposeUiNode> r18 = ComposeUiNode.Companion.getConstructor();
        $composer3 = $composer2;
        int r9 = ((((0 << 3) & 112) << 6) & 896) | 6;
        ComposerKt.sourceInformationMarkerStart($composer2, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
        if (($composer2.getApplier() instanceof Applier) == true) goto L21;
        ComposablesKt.invalidApplier();
    L21:
        $composer2.startReusableNode();
        if ($composer2.getInserting() == false) goto L24;
        Function0<ComposeUiNode> r10 = r18;
        $composer2.createNode(r10);
    L25:
        Composer r11 = Updater.m3808constructorimpl($composer2);
        Updater.m3815setimpl(r11, r12, ComposeUiNode.Companion.getSetMeasurePolicy());
        Updater.m3815setimpl(r11, r7, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> r13 = ComposeUiNode.Companion.getSetCompositeKeyHash();
        if (r11.getInserting() == true) goto L31;
        int r27 = 0;
        Composer r28 = $composer2;
        if (Intrinsics.areEqual(r11.rememberedValue(), Integer.valueOf(r8)) == true) goto L33;
    L32:
        r11.updateRememberedValue(Integer.valueOf(r8));
        r11.apply(Integer.valueOf(r8), r13);
    L33:
        Updater.m3815setimpl(r11, r4, ComposeUiNode.Companion.getSetModifier());
        int r14 = (r9 >> 6) & 14;
        Composer r15 = r28;
        ComposerKt.sourceInformationMarkerStart(r15, -2146730711, "C72@3468L9:Box.kt#2w3rfo");
        BoxScopeInstance r16 = BoxScopeInstance.INSTANCE;
        int r17 = ((r27 >> 6) & 112) | 6;
        ComposerKt.sourceInformationMarkerStart(r15, -515687890, "C776@28602L32,775@28573L223:ChatScreen.kt#cyjvf");
        ImageKt.Image(PainterResources_androidKt.painterResource(model.getAvatarRes(), r15, 0), model.getDisplayName() + "头像", SizeKt.fillMaxSize$default(Modifier.Companion, 0.0f, 1, null), null, ContentScale.Companion.getCrop(), 0.0f, null, r15, 24960, LocationRequestCompat.QUALITY_LOW_POWER);
        ComposerKt.sourceInformationMarkerEnd(r15);
        ComposerKt.sourceInformationMarkerEnd(r15);
        r28.endNode();
        ComposerKt.sourceInformationMarkerEnd(r28);
        ComposerKt.sourceInformationMarkerEnd(r28);
        ComposerKt.sourceInformationMarkerEnd(r28);
        if (ComposerKt.isTraceInProgress() == false) goto L37;
        ComposerKt.traceEventEnd();
        goto L37
    L31:
        r27 = 0;
        r28 = $composer2;
        goto L32
    L24:
        r10 = r18;
        $composer2.useNode();
        goto L25
    L12:
        r6 = false;
        goto L14
    }

    private static final void MessageBubble(final TimelineItem.Message message, final boolean favorite, final Function0<Unit> r45, final Function0<Unit> r46, final Function0<Unit> r47, Composer $composer, final int $changed) {
        Composer $composer2 = $composer.startRestartGroup(2020447141);
        ComposerKt.sourceInformation($composer2, "C(MessageBubble)P(1)792@28993L1838:ChatScreen.kt#cyjvf");
        int $dirty = $changed;
        if (($changed & 6) != 0) goto L9;
        final TimelineItem.Message r9 = message;
        if ($composer2.changed(r9) == false) goto L7;
        int r2 = 4;
    L8:
        $dirty = $dirty | r2;
    L11:
        if (($changed & 48) != 0) goto L17;
        final boolean r12 = favorite;
        if ($composer2.changed(r12) == false) goto L15;
        int r3 = 32;
    L16:
        $dirty = $dirty | r3;
    L19:
        if (($changed & 384) != 0) goto L25;
        final Function0<Unit> r10 = r45;
        if ($composer2.changedInstance(r10) == false) goto L23;
        int r4 = 256;
    L24:
        $dirty = $dirty | r4;
    L27:
        if (($changed & 3072) != 0) goto L33;
        final Function0<Unit> r11 = r46;
        if ($composer2.changedInstance(r11) == false) goto L31;
        int r5 = 2048;
    L32:
        $dirty = $dirty | r5;
    L35:
        if (($changed & 24576) != 0) goto L41;
        final Function0<Unit> r13 = r47;
        if ($composer2.changedInstance(r13) == false) goto L39;
        int r6 = 16384;
    L40:
        $dirty = $dirty | r6;
    L42:
        int $dirty2 = $dirty;
        if (($dirty2 & 9363) == 9362) goto L45;
        boolean r1 = true;
    L47:
        if ($composer2.shouldExecute(r1, $dirty2 & 1) == true) goto L49;
        $composer2.skipToGroupEnd();
    L94:
        ScopeUpdateScope r8 = $composer2.endRestartGroup();
        if (r8 == null) goto L98;
        r8.updateScope(new ChatScreenKt$$ExternalSyntheticLambda24(message, favorite, r45, r46, r47, $changed));
        return;
    L98:
        return;
    L49:
        if (ComposerKt.isTraceInProgress() == false) goto L51;
        ComposerKt.traceEventStart(2020447141, $dirty2, -1, "com.luchime.huiyuan.ui.MessageBubble (ChatScreen.kt:791)");
    L51:
        Modifier r15 = SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, null);
        if (r9.isUser() == false) goto L54;
        float r16 = Dp.m6973constructorimpl(58);
    L56:
        if (r9.isUser() == false) goto L58;
        float r18 = Dp.m6973constructorimpl(16);
    L59:
        Modifier r0 = PaddingKt.m729paddingqDBjuR0$default(r15, r16, Dp.m6973constructorimpl(14), r18, 0.0f, 8, null);
        if (r9.isUser() == false) goto L62;
        Arrangement.Horizontal r7 = Arrangement.INSTANCE.getEnd();
    L63:
        Alignment.Vertical r14 = Alignment.Companion.getBottom();
        ComposerKt.sourceInformationMarkerStart($composer2, 693286680, "CC(Row)P(2,1,3)99@5124L58,100@5187L130:Row.kt#2w3rfo");
        MeasurePolicy r17 = RowKt.rowMeasurePolicy(r7, r14, $composer2, ((384 >> 3) & 14) | ((384 >> 3) & 112));
        ComposerKt.sourceInformationMarkerStart($composer2, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
        int r21 = ComposablesKt.getCurrentCompositeKeyHash($composer2, 0);
        CompositionLocalMap r19 = $composer2.getCurrentCompositionLocalMap();
        Modifier r20 = ComposedModifierKt.materializeModifier($composer2, r0);
        Function0<ComposeUiNode> r22 = ComposeUiNode.Companion.getConstructor();
        int r24 = ((((384 << 3) & 112) << 6) & 896) | 6;
        ComposerKt.sourceInformationMarkerStart($composer2, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
        if (($composer2.getApplier() instanceof Applier) == true) goto L66;
        ComposablesKt.invalidApplier();
    L66:
        $composer2.startReusableNode();
        if ($composer2.getInserting() == false) goto L69;
        Function0<ComposeUiNode> r23 = r22;
        $composer2.createNode(r23);
    L70:
        Composer r25 = Updater.m3808constructorimpl($composer2);
        Updater.m3815setimpl(r25, r17, ComposeUiNode.Companion.getSetMeasurePolicy());
        Updater.m3815setimpl(r25, r19, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> r26 = ComposeUiNode.Companion.getSetCompositeKeyHash();
        if (r25.getInserting() == true) goto L77;
        if (Intrinsics.areEqual(r25.rememberedValue(), Integer.valueOf(r21)) == false) goto L77;
    L78:
        Updater.m3815setimpl(r25, r20, ComposeUiNode.Companion.getSetModifier());
        int r27 = (r24 >> 6) & 14;
        ComposerKt.sourceInformationMarkerStart($composer2, -407735110, "C101@5232L9:Row.kt#2w3rfo");
        RowScopeInstance r28 = RowScopeInstance.INSTANCE;
        int r29 = ((384 >> 6) & 112) | 6;
        ComposerKt.sourceInformationMarkerStart($composer2, 1313123499, "C808@29590L1102,808@29516L1176:ChatScreen.kt#cyjvf");
        if (r9.isUser() == true) goto L81;
        $composer2.startReplaceGroup(1313102790);
        ComposerKt.sourceInformation($composer2, "804@29429L26,805@29468L28");
        ModelAvatar(r9.getModel(), $composer2, 0);
        SpacerKt.Spacer(SizeKt.m777width3ABfNKs(Modifier.Companion, Dp.m6973constructorimpl(8)), $composer2, 6);
    L82:
        $composer2.endReplaceGroup();
        if (r9.isUser() == false) goto L85;
        long r30 = HuiyuanDesignKt.getSignalOrange();
    L86:
        HuiyuanDesignKt.m7414RetroCard3IgeMak(null, r30, ComposableLambdaKt.rememberComposableLambda(-2143227689, true, new ChatScreenKt$$ExternalSyntheticLambda23(r9, r10, r11, r12, r13), $composer2, 54), $composer2, 384, 1);
        if (message.isUser() == false) goto L89;
        $composer2.startReplaceGroup(1314399706);
        ComposerKt.sourceInformation($composer2, "836@30736L28,837@30777L38");
        SpacerKt.Spacer(SizeKt.m777width3ABfNKs(Modifier.Companion, Dp.m6973constructorimpl(8)), $composer2, 6);
        HuiyuanDesignKt.m7412Avatar3IgeMak("你", HuiyuanDesignKt.getSignalBlue(), null, $composer2, 54, 4);
    L90:
        $composer2.endReplaceGroup();
        ComposerKt.sourceInformationMarkerEnd($composer2);
        ComposerKt.sourceInformationMarkerEnd($composer2);
        $composer2.endNode();
        ComposerKt.sourceInformationMarkerEnd($composer2);
        ComposerKt.sourceInformationMarkerEnd($composer2);
        ComposerKt.sourceInformationMarkerEnd($composer2);
        if (ComposerKt.isTraceInProgress() == false) goto L94;
        ComposerKt.traceEventEnd();
        goto L94
    L89:
        $composer2.startReplaceGroup(1283919297);
        goto L90
    L85:
        r30 = Color.Companion.m4403getWhite0d7_KjU();
        goto L86
    L81:
        $composer2.startReplaceGroup(1283919297);
    L77:
        r25.updateRememberedValue(Integer.valueOf(r21));
        r25.apply(Integer.valueOf(r21), r26);
        goto L78
    L69:
        r23 = r22;
        $composer2.useNode();
        goto L70
    L62:
        r7 = Arrangement.INSTANCE.getStart();
        goto L63
    L58:
        r18 = Dp.m6973constructorimpl(38);
        goto L59
    L54:
        r16 = Dp.m6973constructorimpl(16);
        goto L56
    L45:
        r1 = false;
        goto L47
    L39:
        r6 = 8192;
        goto L40
    L41:
        r13 = r47;
        goto L42
    L31:
        r5 = 1024;
        goto L32
    L33:
        r11 = r46;
        goto L35
    L23:
        r4 = 128;
        goto L24
    L25:
        r10 = r45;
        goto L27
    L15:
        r3 = 16;
        goto L16
    L17:
        r12 = favorite;
        goto L19
    L7:
        r2 = 2;
        goto L8
    L9:
        r9 = message;
        goto L11
    }

    static final Unit MessageBubble$lambda$101$lambda$100(TimelineItem.Message $message, Function0 $onCopy, Function0 $onShare, boolean $favorite, Function0 $onToggleFavorite, BoxScope $this$RetroCard, Composer $composer, int $changed) {
        Intrinsics.checkNotNullParameter($this$RetroCard, "$this$RetroCard");
        ComposerKt.sourceInformation($composer, "C809@29604L1078:ChatScreen.kt#cyjvf");
        if (($changed & 17) == 16) goto L5;
        boolean r2 = true;
    L7:
        if ($composer.shouldExecute(r2, $changed & 1) == true) goto L9;
        $composer.skipToGroupEnd();
    L74:
        return Unit.INSTANCE;
    L9:
        if (ComposerKt.isTraceInProgress() == false) goto L11;
        ComposerKt.traceEventStart(-2143227689, $changed, -1, "com.luchime.huiyuan.ui.MessageBubble.<anonymous>.<anonymous> (ChatScreen.kt:809)");
    L11:
        Modifier r3 = AnimationModifierKt.animateContentSize$default(Modifier.Companion, null, null, 3, null);
        ComposerKt.sourceInformationMarkerStart($composer, -483455358, "CC(Column)P(2,3,1)87@4442L61,88@4508L133:Column.kt#2w3rfo");
        MeasurePolicy r10 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.Companion.getStart(), $composer, ((0 >> 3) & 14) | ((0 >> 3) & 112));
        ComposerKt.sourceInformationMarkerStart($composer, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
        int r17 = ComposablesKt.getCurrentCompositeKeyHash($composer, 0);
        CompositionLocalMap r5 = $composer.getCurrentCompositionLocalMap();
        Modifier r15 = ComposedModifierKt.materializeModifier($composer, r3);
        Function0<ComposeUiNode> r19 = ComposeUiNode.Companion.getConstructor();
        int r20 = ((((0 << 3) & 112) << 6) & 896) | 6;
        ComposerKt.sourceInformationMarkerStart($composer, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
        if (($composer.getApplier() instanceof Applier) == true) goto L14;
        ComposablesKt.invalidApplier();
    L14:
        $composer.startReusableNode();
        if ($composer.getInserting() == false) goto L17;
        Function0<ComposeUiNode> r0 = r19;
        $composer.createNode(r0);
    L18:
        Composer r1 = Updater.m3808constructorimpl($composer);
        Updater.m3815setimpl(r1, r10, ComposeUiNode.Companion.getSetMeasurePolicy());
        Updater.m3815setimpl(r1, r5, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> r4 = ComposeUiNode.Companion.getSetCompositeKeyHash();
        if (r1.getInserting() == true) goto L24;
        int r29 = 0;
        if (Intrinsics.areEqual(r1.rememberedValue(), Integer.valueOf(r17)) == true) goto L26;
    L25:
        r1.updateRememberedValue(Integer.valueOf(r17));
        r1.apply(Integer.valueOf(r17), r4);
    L26:
        Updater.m3815setimpl(r1, r15, ComposeUiNode.Companion.getSetModifier());
        int r6 = (r20 >> 6) & 14;
        ComposerKt.sourceInformationMarkerStart($composer, -384672921, "C89@4556L9:Column.kt#2w3rfo");
        ColumnScopeInstance r7 = ColumnScopeInstance.INSTANCE;
        int r8 = ((r29 >> 6) & 112) | 6;
        ComposerKt.sourceInformationMarkerStart($composer, 1315150141, "C814@29848L303:ChatScreen.kt#cyjvf");
        if ($message.isUser() == false) goto L29;
    L31:
        $composer.startReplaceGroup(1285684609);
    L32:
        $composer.endReplaceGroup();
        String r9 = $message.getText();
        if ($message.isStreaming() == false) goto L35;
        String r11 = " ▍";
    L36:
        String r30 = r9 + r11;
        if ($message.isUser() == false) goto L39;
        long r31 = Color.Companion.m4403getWhite0d7_KjU();
    L40:
        TextKt.m2820Text4IGK_g(r30, null, r31, TextUnitKt.getSp(14), null, FontWeight.Companion.getMedium(), null, 0, null, null, TextUnitKt.getSp(24), 0, false, 0, 0, null, null, $composer, 199680, 6, 130002);
        if ($message.isUser() == false) goto L43;
    L68:
        $composer.startReplaceGroup(1285684609);
    L69:
        $composer.endReplaceGroup();
        ComposerKt.sourceInformationMarkerEnd($composer);
        ComposerKt.sourceInformationMarkerEnd($composer);
        r6.endNode();
        ComposerKt.sourceInformationMarkerEnd(r6);
        ComposerKt.sourceInformationMarkerEnd(r6);
        ComposerKt.sourceInformationMarkerEnd($composer);
        if (ComposerKt.isTraceInProgress() == false) goto L74;
        ComposerKt.traceEventEnd();
        goto L74
    L43:
        if ($message.isStreaming() == true) goto L68;
        $composer.startReplaceGroup(1315671963);
        ComposerKt.sourceInformation($composer, "823@30236L29,824@30286L364");
        SpacerKt.Spacer(SizeKt.m758height3ABfNKs(Modifier.Companion, Dp.m6973constructorimpl(9)), $composer, 6);
        Arrangement.Horizontal r12 = Arrangement.INSTANCE.m606spacedBy0680j_4(Dp.m6973constructorimpl(7));
        ComposerKt.sourceInformationMarkerStart($composer, 693286680, "CC(Row)P(2,1,3)99@5124L58,100@5187L130:Row.kt#2w3rfo");
        Modifier r13 = Modifier.Companion;
        MeasurePolicy r14 = RowKt.rowMeasurePolicy(r12, Alignment.Companion.getTop(), $composer, ((48 >> 3) & 14) | ((48 >> 3) & 112));
        ComposerKt.sourceInformationMarkerStart($composer, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
        int r16 = ComposablesKt.getCurrentCompositeKeyHash($composer, 0);
        CompositionLocalMap r18 = $composer.getCurrentCompositionLocalMap();
        Modifier r21 = ComposedModifierKt.materializeModifier($composer, r13);
        Function0<ComposeUiNode> r38 = ComposeUiNode.Companion.getConstructor();
        int r22 = ((((48 << 3) & 112) << 6) & 896) | 6;
        ComposerKt.sourceInformationMarkerStart($composer, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
        if (($composer.getApplier() instanceof Applier) == true) goto L47;
        ComposablesKt.invalidApplier();
    L47:
        $composer.startReusableNode();
        if ($composer.getInserting() == false) goto L50;
        Function0<ComposeUiNode> r23 = r38;
        $composer.createNode(r23);
    L51:
        Composer r24 = Updater.m3808constructorimpl($composer);
        Updater.m3815setimpl(r24, r14, ComposeUiNode.Companion.getSetMeasurePolicy());
        Updater.m3815setimpl(r24, r18, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> r25 = ComposeUiNode.Companion.getSetCompositeKeyHash();
        if (r24.getInserting() == true) goto L58;
        if (Intrinsics.areEqual(r24.rememberedValue(), Integer.valueOf(r16)) == false) goto L58;
    L59:
        Updater.m3815setimpl(r24, r21, ComposeUiNode.Companion.getSetModifier());
        int r26 = (r22 >> 6) & 14;
        ComposerKt.sourceInformationMarkerStart($composer, -407735110, "C101@5232L9:Row.kt#2w3rfo");
        RowScopeInstance r27 = RowScopeInstance.INSTANCE;
        int r28 = ((48 >> 6) & 112) | 6;
        ComposerKt.sourceInformationMarkerStart($composer, -1487371084, "C825@30368L27,826@30420L28:ChatScreen.kt#cyjvf");
        MessageAction("复制", $onCopy, $composer, 6);
        MessageAction("分享", $onShare, $composer, 6);
        if ($message.getSourceQuote() == null) goto L66;
        $composer.startReplaceGroup(-1487238467);
        ComposerKt.sourceInformation($composer, "828@30536L66");
        if ($favorite == false) goto L64;
        String r32 = "★ 已收藏";
    L65:
        MessageAction(r32, $onToggleFavorite, $composer, 0);
    L67:
        $composer.endReplaceGroup();
        ComposerKt.sourceInformationMarkerEnd($composer);
        ComposerKt.sourceInformationMarkerEnd($composer);
        $composer.endNode();
        ComposerKt.sourceInformationMarkerEnd($composer);
        ComposerKt.sourceInformationMarkerEnd($composer);
        ComposerKt.sourceInformationMarkerEnd($composer);
        goto L69
    L64:
        r32 = "☆ 收藏";
        goto L65
    L66:
        $composer.startReplaceGroup(-1517505193);
    L58:
        r24.updateRememberedValue(Integer.valueOf(r16));
        r24.apply(Integer.valueOf(r16), r25);
        goto L59
    L50:
        r23 = r38;
        $composer.useNode();
        goto L51
    L39:
        r31 = HuiyuanDesignKt.getInk();
        goto L40
    L35:
        r11 = "";
        goto L36
    L29:
        if ($message.getTag() == null) goto L31;
        $composer.startReplaceGroup(1315166477);
        ComposerKt.sourceInformation($composer, "811@29737L26,812@29784L29");
        HuiyuanDesignKt.m7413CategoryBadgeiJQMabo($message.getTag(), 0, $composer, 0, 2);
        SpacerKt.Spacer(SizeKt.m758height3ABfNKs(Modifier.Companion, Dp.m6973constructorimpl(6)), $composer, 6);
        goto L32
    L24:
        r29 = 0;
        goto L25
    L17:
        r0 = r19;
        $composer.useNode();
        goto L18
    L5:
        r2 = false;
        goto L7
    }

    private static final void MessageAction(final String text, final Function0<Unit> r29, Composer $composer, final int $changed) {
        Composer $composer2 = $composer.startRestartGroup(-758153133);
        ComposerKt.sourceInformation($composer2, "C(MessageAction)P(1)844@30914L385:ChatScreen.kt#cyjvf");
        int $dirty = $changed;
        if (($changed & 6) != 0) goto L10;
        if ($composer2.changed(text) == false) goto L7;
        int r3 = 4;
    L8:
        $dirty = $dirty | r3;
        goto L10
    L7:
        r3 = 2;
    L10:
        if (($changed & 48) == 0) goto L12;
    L16:
        int $dirty2 = $dirty;
        if (($dirty2 & 19) == 18) goto L19;
        boolean r2 = true;
    L21:
        if ($composer2.shouldExecute(r2, $dirty2 & 1) == true) goto L23;
        Composer $composer3 = $composer2;
        $composer3.skipToGroupEnd();
    L29:
        ScopeUpdateScope r1 = $composer3.endRestartGroup();
        if (r1 == null) goto L33;
        r1.updateScope(new ChatScreenKt$$ExternalSyntheticLambda45(text, r29, $changed));
        return;
    L33:
        return;
    L23:
        if (ComposerKt.isTraceInProgress() == false) goto L25;
        ComposerKt.traceEventStart(-758153133, $dirty2, -1, "com.luchime.huiyuan.ui.MessageAction (ChatScreen.kt:843)");
    L25:
        $composer3 = $composer2;
        TextKt.m2820Text4IGK_g(text, PaddingKt.m726paddingVpY3zN4(AppHapticsKt.hapticClickable$default(BorderKt.m245borderxT4_qwU(BackgroundKt.m233backgroundbw27NRU(Modifier.Companion, HuiyuanDesignKt.getPaper(), RoundedCornerShapeKt.m1018RoundedCornerShape0680j_4(Dp.m6973constructorimpl(7))), Dp.m6973constructorimpl(1), HuiyuanDesignKt.getInk(), RoundedCornerShapeKt.m1018RoundedCornerShape0680j_4(Dp.m6973constructorimpl(7))), false, HapticCue.TAP, r29, 1, null), Dp.m6973constructorimpl(8), Dp.m6973constructorimpl(5)), HuiyuanDesignKt.getInk(), TextUnitKt.getSp(10), null, FontWeight.Companion.getBold(), null, 0, null, null, 0, 0, false, 0, 0, null, null, $composer3, ($dirty2 & 14) | 200064, 0, 131024);
        if (ComposerKt.isTraceInProgress() == false) goto L29;
        ComposerKt.traceEventEnd();
        goto L29
    L19:
        r2 = false;
        goto L21
    L12:
        if ($composer2.changedInstance(r29) == false) goto L14;
        int r4 = 32;
    L15:
        $dirty = $dirty | r4;
        goto L16
    L14:
        r4 = 16;
        goto L15
    }

    private static final void ThinkLogBubble(final TimelineItem.ThinkLog log, Composer $composer, final int $changed) {
        Composer $composer2 = $composer.startRestartGroup(1361668923);
        ComposerKt.sourceInformation($composer2, "C(ThinkLogBubble)859@31376L1763:ChatScreen.kt#cyjvf");
        int $dirty = $changed;
        if (($changed & 6) != 0) goto L10;
        if ($composer2.changedInstance(log) == false) goto L7;
        int r5 = 4;
    L8:
        $dirty = $dirty | r5;
        goto L10
    L7:
        r5 = 2;
    L10:
        if (($dirty & 3) == 2) goto L12;
        boolean r6 = true;
    L14:
        if ($composer2.shouldExecute(r6, $dirty & 1) == true) goto L16;
        Composer $composer3 = $composer2;
        $composer3.skipToGroupEnd();
    L82:
        ScopeUpdateScope r2 = $composer3.endRestartGroup();
        if (r2 == null) goto L89;
        r2.updateScope(new ChatScreenKt$$ExternalSyntheticLambda13(log, $changed));
        return;
    L89:
        return;
    L16:
        if (ComposerKt.isTraceInProgress() == false) goto L18;
        ComposerKt.traceEventStart(1361668923, $dirty, -1, "com.luchime.huiyuan.ui.ThinkLogBubble (ChatScreen.kt:858)");
    L18:
        Modifier r3 = PaddingKt.m729paddingqDBjuR0$default(SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, null), Dp.m6973constructorimpl(16), Dp.m6973constructorimpl(14), Dp.m6973constructorimpl(20), 0.0f, 8, null);
        Alignment.Vertical r7 = Alignment.Companion.getBottom();
        ComposerKt.sourceInformationMarkerStart($composer2, 693286680, "CC(Row)P(2,1,3)99@5124L58,100@5187L130:Row.kt#2w3rfo");
        MeasurePolicy r11 = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), r7, $composer2, ((384 >> 3) & 14) | ((384 >> 3) & 112));
        ComposerKt.sourceInformationMarkerStart($composer2, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
        int r17 = ComposablesKt.getCurrentCompositeKeyHash($composer2, 0);
        CompositionLocalMap r15 = $composer2.getCurrentCompositionLocalMap();
        Modifier r4 = ComposedModifierKt.materializeModifier($composer2, r3);
        Function0<ComposeUiNode> r19 = ComposeUiNode.Companion.getConstructor();
        $composer3 = $composer2;
        int r21 = ((((384 << 3) & 112) << 6) & 896) | 6;
        ComposerKt.sourceInformationMarkerStart($composer2, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
        if (($composer2.getApplier() instanceof Applier) == true) goto L21;
        ComposablesKt.invalidApplier();
    L21:
        $composer2.startReusableNode();
        if ($composer2.getInserting() == false) goto L24;
        Function0<ComposeUiNode> r8 = r19;
        $composer2.createNode(r8);
    L25:
        Composer r9 = Updater.m3808constructorimpl($composer2);
        Updater.m3815setimpl(r9, r11, ComposeUiNode.Companion.getSetMeasurePolicy());
        Updater.m3815setimpl(r9, r15, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> r10 = ComposeUiNode.Companion.getSetCompositeKeyHash();
        if (r9.getInserting() == true) goto L31;
        int r31 = 384;
        Composer r32 = $composer2;
        if (Intrinsics.areEqual(r9.rememberedValue(), Integer.valueOf(r17)) == true) goto L33;
    L32:
        r9.updateRememberedValue(Integer.valueOf(r17));
        r9.apply(Integer.valueOf(r17), r10);
    L33:
        Updater.m3815setimpl(r9, r4, ComposeUiNode.Companion.getSetModifier());
        int r12 = (r21 >> 6) & 14;
        Composer r13 = r32;
        ComposerKt.sourceInformationMarkerStart(r13, -407735110, "C101@5232L9:Row.kt#2w3rfo");
        RowScopeInstance r14 = RowScopeInstance.INSTANCE;
        int r16 = ((r31 >> 6) & 112) | 6;
        ComposerKt.sourceInformationMarkerStart(r13, 654383208, "C865@31561L22,866@31592L28,867@31629L1504:ChatScreen.kt#cyjvf");
        ModelAvatar(log.getModel(), r13, 0);
        SpacerKt.Spacer(SizeKt.m777width3ABfNKs(Modifier.Companion, Dp.m6973constructorimpl(8)), r13, 6);
        Modifier r18 = PaddingKt.m729paddingqDBjuR0$default(Modifier.Companion, 0.0f, 0.0f, Dp.m6973constructorimpl(4), Dp.m6973constructorimpl(4), 3, null);
        ComposerKt.sourceInformationMarkerStart(r13, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
        MeasurePolicy r20 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.getTopStart(), false);
        ComposerKt.sourceInformationMarkerStart(r13, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
        int r43 = ComposablesKt.getCurrentCompositeKeyHash(r13, 0);
        CompositionLocalMap r22 = r13.getCurrentCompositionLocalMap();
        Modifier r23 = ComposedModifierKt.materializeModifier(r13, r18);
        Function0<ComposeUiNode> r45 = ComposeUiNode.Companion.getConstructor();
        int r24 = ((((6 << 3) & 112) << 6) & 896) | 6;
        ComposerKt.sourceInformationMarkerStart(r13, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
        if ((r13.getApplier() instanceof Applier) == true) goto L36;
        ComposablesKt.invalidApplier();
    L36:
        r13.startReusableNode();
        if (r13.getInserting() == false) goto L39;
        Function0<ComposeUiNode> r25 = r45;
        r13.createNode(r25);
    L40:
        Composer r26 = Updater.m3808constructorimpl(r13);
        Updater.m3815setimpl(r26, r20, ComposeUiNode.Companion.getSetMeasurePolicy());
        Updater.m3815setimpl(r26, r22, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> r27 = ComposeUiNode.Companion.getSetCompositeKeyHash();
        if (r26.getInserting() == true) goto L47;
        if (Intrinsics.areEqual(r26.rememberedValue(), Integer.valueOf(r43)) == false) goto L47;
    L48:
        Updater.m3815setimpl(r26, r23, ComposeUiNode.Companion.getSetModifier());
        int r28 = (r24 >> 6) & 14;
        ComposerKt.sourceInformationMarkerStart(r13, -2146730711, "C72@3468L9:Box.kt#2w3rfo");
        int r29 = ((6 >> 6) & 112) | 6;
        BoxScope r30 = BoxScopeInstance.INSTANCE;
        ComposerKt.sourceInformationMarkerStart(r13, 1906286086, "C868@31703L231,874@31947L1176:ChatScreen.kt#cyjvf");
        BoxKt.Box(BackgroundKt.m233backgroundbw27NRU(OffsetKt.m684offsetVpY3zN4(r30.matchParentSize(Modifier.Companion), Dp.m6973constructorimpl(4), Dp.m6973constructorimpl(4)), ColorKt.Color(1291845632), RoundedCornerShapeKt.m1019RoundedCornerShapea9UjIt4(Dp.m6973constructorimpl(4), Dp.m6973constructorimpl(14), Dp.m6973constructorimpl(14), Dp.m6973constructorimpl(14))), r13, 0);
        Modifier r33 = PaddingKt.m726paddingVpY3zN4(BorderKt.m245borderxT4_qwU(BackgroundKt.m233backgroundbw27NRU(SizeKt.m778widthInVpY3zN4(Modifier.Companion, Dp.m6973constructorimpl(250), Dp.m6973constructorimpl(330)), HuiyuanDesignKt.getTerminal(), RoundedCornerShapeKt.m1019RoundedCornerShapea9UjIt4(Dp.m6973constructorimpl(4), Dp.m6973constructorimpl(14), Dp.m6973constructorimpl(14), Dp.m6973constructorimpl(14))), Dp.m6973constructorimpl(2), HuiyuanDesignKt.getInk(), RoundedCornerShapeKt.m1019RoundedCornerShapea9UjIt4(Dp.m6973constructorimpl(4), Dp.m6973constructorimpl(14), Dp.m6973constructorimpl(14), Dp.m6973constructorimpl(14))), Dp.m6973constructorimpl(13), Dp.m6973constructorimpl(10));
        ComposerKt.sourceInformationMarkerStart(r13, -483455358, "CC(Column)P(2,3,1)87@4442L61,88@4508L133:Column.kt#2w3rfo");
        MeasurePolicy r110 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.Companion.getStart(), r13, ((0 >> 3) & 14) | ((0 >> 3) & 112));
        ComposerKt.sourceInformationMarkerStart(r13, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
        int r34 = ComposablesKt.getCurrentCompositeKeyHash(r13, 0);
        CompositionLocalMap r35 = r13.getCurrentCompositionLocalMap();
        Modifier r36 = ComposedModifierKt.materializeModifier(r13, r33);
        Function0<ComposeUiNode> r111 = ComposeUiNode.Companion.getConstructor();
        int r37 = ((((0 << 3) & 112) << 6) & 896) | 6;
        ComposerKt.sourceInformationMarkerStart(r13, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
        if ((r13.getApplier() instanceof Applier) == true) goto L51;
        ComposablesKt.invalidApplier();
    L51:
        r13.startReusableNode();
        if (r13.getInserting() == false) goto L54;
        Function0<ComposeUiNode> r38 = r111;
        r13.createNode(r38);
    L55:
        Composer r39 = Updater.m3808constructorimpl(r13);
        Updater.m3815setimpl(r39, r110, ComposeUiNode.Companion.getSetMeasurePolicy());
        Updater.m3815setimpl(r39, r35, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> r40 = ComposeUiNode.Companion.getSetCompositeKeyHash();
        if (r39.getInserting() == true) goto L62;
        if (Intrinsics.areEqual(r39.rememberedValue(), Integer.valueOf(r34)) == false) goto L62;
    L63:
        Updater.m3815setimpl(r39, r36, ComposeUiNode.Companion.getSetModifier());
        int r41 = (r37 >> 6) & 14;
        Composer r42 = r13;
        ComposerKt.sourceInformationMarkerStart(r42, -384672921, "C89@4556L9:Column.kt#2w3rfo");
        ColumnScopeInstance r44 = ColumnScopeInstance.INSTANCE;
        int r46 = ((0 >> 6) & 112) | 6;
        ComposerKt.sourceInformationMarkerStart(r42, 1705042773, "C:ChatScreen.kt#cyjvf");
        int r47 = 20;
        if (log.getLines().isEmpty() == false) goto L66;
        r42.startReplaceGroup(1705052506);
        ComposerKt.sourceInformation(r42, "882@32369L261");
        Composer r95 = r42;
        TextKt.m2820Text4IGK_g("● 正在思考… ▋", null, HuiyuanDesignKt.getTerminalText(), TextUnitKt.getSp(12), null, null, FontFamily.Companion.getMonospace(), 0, null, null, TextUnitKt.getSp(20), 0, false, 0, 0, null, null, r95, 3462, 6, 129970);
        r42.endReplaceGroup();
    L78:
        ComposerKt.sourceInformationMarkerEnd(r95);
        ComposerKt.sourceInformationMarkerEnd(r42);
        r13.endNode();
        ComposerKt.sourceInformationMarkerEnd(r13);
        ComposerKt.sourceInformationMarkerEnd(r13);
        ComposerKt.sourceInformationMarkerEnd(r13);
        ComposerKt.sourceInformationMarkerEnd(r13);
        ComposerKt.sourceInformationMarkerEnd(r13);
        r13.endNode();
        ComposerKt.sourceInformationMarkerEnd(r13);
        ComposerKt.sourceInformationMarkerEnd(r13);
        ComposerKt.sourceInformationMarkerEnd(r13);
        ComposerKt.sourceInformationMarkerEnd(r13);
        ComposerKt.sourceInformationMarkerEnd(r13);
        r32.endNode();
        ComposerKt.sourceInformationMarkerEnd(r32);
        ComposerKt.sourceInformationMarkerEnd(r32);
        ComposerKt.sourceInformationMarkerEnd(r32);
        if (ComposerKt.isTraceInProgress() == false) goto L82;
        ComposerKt.traceEventEnd();
        goto L82
    L66:
        r42.startReplaceGroup(1705361824);
        ComposerKt.sourceInformation(r42, "*891@32742L327");
        Iterable r48 = log.getLines();
        int r74 = 0;
        Iterator r101 = r48.iterator();
    L68:
        if (r101.hasNext() == false) goto L77;
        Object r102 = r101.next();
        int r103 = r74 + 1;
        if (r74 >= 0) goto L72;
        CollectionsKt.throwIndexOverflow();
    L72:
        int r104 = r47;
        String r49 = (String) r102;
        Iterable r107 = r48;
        Composer r96 = r42;
        if (r74 != CollectionsKt.getLastIndex(log.getLines())) goto L75;
        String r50 = " ▋";
    L76:
        TextKt.m2820Text4IGK_g(r49 + r50, null, HuiyuanDesignKt.getTerminalText(), TextUnitKt.getSp(12), null, null, FontFamily.Companion.getMonospace(), 0, null, null, TextUnitKt.getSp(r104), 0, false, 0, 0, null, null, r96, 3456, 6, 129970);
        r42 = r96;
        r74 = r103;
        r47 = r104;
        r48 = r107;
        goto L68
    L75:
        r50 = "";
        goto L76
    L77:
        r95 = r42;
        r95.endReplaceGroup();
    L62:
        r39.updateRememberedValue(Integer.valueOf(r34));
        r39.apply(Integer.valueOf(r34), r40);
        goto L63
    L54:
        r38 = r111;
        r13.useNode();
    L47:
        r26.updateRememberedValue(Integer.valueOf(r43));
        r26.apply(Integer.valueOf(r43), r27);
        goto L48
    L39:
        r25 = r45;
        r13.useNode();
        goto L40
    L31:
        r31 = 384;
        r32 = $composer2;
        goto L32
    L24:
        r8 = r19;
        $composer2.useNode();
        goto L25
    L12:
        r6 = false;
        goto L14
    }

    private static final void Composer(final AIModel selectedModel, final Function1<? super AIModel, Unit> r149, final String input, final Function1<? super String, Unit> r151, final Function0<Unit> r152, Function0<Unit> r153, final boolean isGenerating, final Function0<Unit> r155, final boolean compact, Composer $composer, final int $changed) {
        Composer $composer2 = $composer.startRestartGroup(-1144803977);
        ComposerKt.sourceInformation($composer2, "C(Composer)P(8,4,1,3,6,5,2,7)917@33471L7:ChatScreen.kt#cyjvf");
        int $dirty = $changed;
        if (($changed & 6) != 0) goto L10;
        if ($composer2.changed(selectedModel.ordinal()) == false) goto L7;
        int r11 = 4;
    L8:
        $dirty = $dirty | r11;
        goto L10
    L7:
        r11 = 2;
    L10:
        if (($changed & 48) != 0) goto L17;
        if ($composer2.changedInstance(r149) == false) goto L14;
        int r12 = 32;
    L15:
        $dirty = $dirty | r12;
        goto L17
    L14:
        r12 = 16;
    L17:
        if (($changed & 384) != 0) goto L24;
        if ($composer2.changed(input) == false) goto L21;
        int r13 = 256;
    L22:
        $dirty = $dirty | r13;
        goto L24
    L21:
        r13 = 128;
    L24:
        if (($changed & 3072) != 0) goto L32;
        if ($composer2.changedInstance(r151) == false) goto L28;
        int r14 = 2048;
    L29:
        $dirty = $dirty | r14;
        goto L32
    L28:
        r14 = 1024;
    L32:
        if (($changed & 24576) != 0) goto L39;
        if ($composer2.changedInstance(r152) == false) goto L36;
        int r15 = 16384;
    L37:
        $dirty = $dirty | r15;
        goto L39
    L36:
        r15 = 8192;
    L39:
        if ((196608 & $changed) != 0) goto L46;
        if ($composer2.changedInstance(r153) == false) goto L43;
        int r16 = 131072;
    L44:
        $dirty = $dirty | r16;
        goto L46
    L43:
        r16 = 65536;
    L46:
        if ((1572864 & $changed) != 0) goto L53;
        if ($composer2.changed(isGenerating) == false) goto L50;
        int r17 = 1048576;
    L51:
        $dirty = $dirty | r17;
        goto L53
    L50:
        r17 = 524288;
    L53:
        if ((12582912 & $changed) != 0) goto L60;
        if ($composer2.changedInstance(r155) == false) goto L57;
        int r18 = 8388608;
    L58:
        $dirty = $dirty | r18;
        goto L60
    L57:
        r18 = 4194304;
    L60:
        if ((100663296 & $changed) != 0) goto L67;
        if ($composer2.changed(compact) == false) goto L64;
        int r19 = AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
    L65:
        $dirty = $dirty | r19;
        goto L67
    L64:
        r19 = 33554432;
    L67:
        if ((38347923 & $dirty) == 38347922) goto L69;
        boolean r110 = true;
    L71:
        if ($composer2.shouldExecute(r110, $dirty & 1) == true) goto L73;
        final Function0<Unit> r3 = r153;
        final boolean r7 = isGenerating;
        Composer $composer3 = $composer2;
        $composer3.skipToGroupEnd();
    L337:
        ScopeUpdateScope r111 = $composer3.endRestartGroup();
        if (r111 == null) goto L341;
        final Function0<Unit> r6 = r3;
        r111.updateScope(new ChatScreenKt$$ExternalSyntheticLambda3(selectedModel, r149, input, r151, r152, r6, r7, r155, compact, $changed));
        return;
    L341:
        return;
    L73:
        if (ComposerKt.isTraceInProgress() == false) goto L75;
        ComposerKt.traceEventStart(-1144803977, $dirty, -1, "com.luchime.huiyuan.ui.Composer (ChatScreen.kt:916)");
    L75:
        ProvidableCompositionLocal<AppHaptics> r112 = AppHapticsKt.getLocalAppHaptics();
        ComposerKt.sourceInformationMarkerStart($composer2, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
        Object r8 = $composer2.consume(r112);
        ComposerKt.sourceInformationMarkerEnd($composer2);
        final AppHaptics haptics = (AppHaptics) r8;
        if (compact == false) goto L189;
        $composer2.startReplaceGroup(1480499913);
        ComposerKt.sourceInformation($composer2, "919@33506L4210");
        Modifier r0 = PaddingKt.m726paddingVpY3zN4(WindowInsetsPadding_androidKt.imePadding(WindowInsetsPadding_androidKt.navigationBarsPadding(BorderKt.m245borderxT4_qwU(BackgroundKt.m234backgroundbw27NRU$default(SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, null), HuiyuanDesignKt.getPaper(), null, 2, null), Dp.m6973constructorimpl(2), HuiyuanDesignKt.getInk(), RectangleShapeKt.getRectangleShape()))), Dp.m6973constructorimpl(8), Dp.m6973constructorimpl(6));
        Arrangement.Horizontal r4 = Arrangement.INSTANCE.m606spacedBy0680j_4(Dp.m6973constructorimpl(7));
        Alignment.Vertical r5 = Alignment.Companion.getCenterVertically();
        ComposerKt.sourceInformationMarkerStart($composer2, 693286680, "CC(Row)P(2,1,3)99@5124L58,100@5187L130:Row.kt#2w3rfo");
        MeasurePolicy r113 = RowKt.rowMeasurePolicy(r4, r5, $composer2, ((432 >> 3) & 14) | ((432 >> 3) & 112));
        ComposerKt.sourceInformationMarkerStart($composer2, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
        int r40 = ComposablesKt.getCurrentCompositeKeyHash($composer2, 0);
        CompositionLocalMap r1 = $composer2.getCurrentCompositionLocalMap();
        Modifier r9 = ComposedModifierKt.materializeModifier($composer2, r0);
        Function0<ComposeUiNode> r28 = ComposeUiNode.Companion.getConstructor();
        int r10 = ((((432 << 3) & 112) << 6) & 896) | 6;
        ComposerKt.sourceInformationMarkerStart($composer2, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
        if (($composer2.getApplier() instanceof Applier) == true) goto L80;
        ComposablesKt.invalidApplier();
    L80:
        $composer2.startReusableNode();
        if ($composer2.getInserting() == false) goto L83;
        Function0<ComposeUiNode> r20 = r28;
        $composer2.createNode(r20);
    L84:
        Composer r21 = Updater.m3808constructorimpl($composer2);
        Updater.m3815setimpl(r21, r113, ComposeUiNode.Companion.getSetMeasurePolicy());
        Updater.m3815setimpl(r21, r1, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> r22 = ComposeUiNode.Companion.getSetCompositeKeyHash();
        if (r21.getInserting() == true) goto L90;
        AppHaptics haptics2 = haptics;
        if (Intrinsics.areEqual(r21.rememberedValue(), Integer.valueOf(r40)) == true) goto L92;
    L91:
        r21.updateRememberedValue(Integer.valueOf(r40));
        r21.apply(Integer.valueOf(r40), r22);
    L92:
        Updater.m3815setimpl(r21, r9, ComposeUiNode.Companion.getSetModifier());
        int r2 = (r10 >> 6) & 14;
        ComposerKt.sourceInformationMarkerStart($composer2, -407735110, "C101@5232L9:Row.kt#2w3rfo");
        int r44 = ((432 >> 6) & 112) | 6;
        RowScope r23 = RowScopeInstance.INSTANCE;
        ComposerKt.sourceInformationMarkerStart($composer2, -1060164626, "C931@34045L21,930@33965L588,955@35041L10,960@35348L196,966@35590L279,948@34741L256,944@34566L1317,981@36165L238,975@35930L101,974@35896L781,993@36724L308,1004@37187L217,1010@37505L201,992@36690L1016:ChatScreen.kt#cyjvf");
        Modifier r24 = ScrollKt.horizontalScroll$default(SizeKt.m779widthInVpY3zN4$default(Modifier.Companion, 0.0f, Dp.m6973constructorimpl(190), 1, null), ScrollKt.rememberScrollState(0, $composer2, 0, 1), false, null, false, 14, null);
        Arrangement.Horizontal r25 = Arrangement.INSTANCE.m606spacedBy0680j_4(Dp.m6973constructorimpl(6));
        ComposerKt.sourceInformationMarkerStart($composer2, 693286680, "CC(Row)P(2,1,3)99@5124L58,100@5187L130:Row.kt#2w3rfo");
        MeasurePolicy r114 = RowKt.rowMeasurePolicy(r25, Alignment.Companion.getTop(), $composer2, ((48 >> 3) & 14) | ((48 >> 3) & 112));
        ComposerKt.sourceInformationMarkerStart($composer2, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
        int r26 = ComposablesKt.getCurrentCompositeKeyHash($composer2, 0);
        CompositionLocalMap r27 = $composer2.getCurrentCompositionLocalMap();
        Modifier r29 = ComposedModifierKt.materializeModifier($composer2, r24);
        Function0<ComposeUiNode> r52 = ComposeUiNode.Companion.getConstructor();
        int r30 = ((((48 << 3) & 112) << 6) & 896) | 6;
        ComposerKt.sourceInformationMarkerStart($composer2, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
        if (($composer2.getApplier() instanceof Applier) == true) goto L95;
        ComposablesKt.invalidApplier();
    L95:
        $composer2.startReusableNode();
        if ($composer2.getInserting() == false) goto L98;
        Function0<ComposeUiNode> r31 = r52;
        $composer2.createNode(r31);
    L99:
        Composer r115 = Updater.m3808constructorimpl($composer2);
        Updater.m3815setimpl(r115, r114, ComposeUiNode.Companion.getSetMeasurePolicy());
        Updater.m3815setimpl(r115, r27, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> r32 = ComposeUiNode.Companion.getSetCompositeKeyHash();
        if (r115.getInserting() == true) goto L105;
        Composer r60 = $composer2;
        if (Intrinsics.areEqual(r115.rememberedValue(), Integer.valueOf(r26)) == true) goto L107;
    L106:
        r115.updateRememberedValue(Integer.valueOf(r26));
        r115.apply(Integer.valueOf(r26), r32);
    L107:
        Updater.m3815setimpl(r115, r29, ComposeUiNode.Companion.getSetModifier());
        int r33 = (r30 >> 6) & 14;
        Composer r34 = r60;
        int r35 = 0;
        ComposerKt.sourceInformationMarkerStart(r34, -407735110, "C101@5232L9:Row.kt#2w3rfo");
        RowScopeInstance r116 = RowScopeInstance.INSTANCE;
        int r117 = ((48 >> 6) & 112) | 6;
        Composer r36 = r34;
        ComposerKt.sourceInformationMarkerStart(r36, 2130717372, "C:ChatScreen.kt#cyjvf");
        r36.startReplaceGroup(761469975);
        ComposerKt.sourceInformation(r36, "*940@34473L26,935@34223L298");
        Iterable r37 = AIModel.getEntries();
        int r38 = 0;
        Iterator<AIModel> r210 = r37.iterator();
    L109:
        if (r210.hasNext() == false) goto L127;
        Iterable r70 = r37;
        final AIModel r39 = (AIModel) r210.next();
        String r61 = r39.getShortName();
        long r62 = modelAccent(r39);
        if (selectedModel != r39) goto L113;
        boolean r64 = true;
    L114:
        boolean r65 = !isGenerating;
        int r72 = r38;
        ComposerKt.sourceInformationMarkerStart(r36, -1893764028, "CC(remember):ChatScreen.kt#9igjgp");
        Composer r67 = r36;
        if (($dirty & 112) != 32) goto L117;
        boolean r41 = true;
    L118:
        boolean r42 = r41 | $composer2.changed(r39.ordinal());
        Object r43 = r67.rememberedValue();
        if (r42 == true) goto L124;
        int r74 = r35;
        if (r43 != Composer.Companion.getEmpty()) goto L126;
    L125:
        r43 = new ChatScreenKt$$ExternalSyntheticLambda0(r149, r39);
        r67.updateRememberedValue(r43);
    L126:
        ComposerKt.sourceInformationMarkerEnd(r67);
        m7402ModeChip8V94_ZQ(r61, r62, r64, r65, (Function0) r43, r67, 0, 0);
        r36 = r67;
        r37 = r70;
        r38 = r72;
        r35 = r74;
        goto L109
    L124:
        r74 = r35;
        goto L125
    L117:
        r41 = false;
        goto L118
    L113:
        r64 = false;
        goto L114
    L127:
        Composer r68 = r36;
        r68.endReplaceGroup();
        ComposerKt.sourceInformationMarkerEnd(r68);
        ComposerKt.sourceInformationMarkerEnd(r34);
        r60.endNode();
        ComposerKt.sourceInformationMarkerEnd(r60);
        ComposerKt.sourceInformationMarkerEnd(r60);
        ComposerKt.sourceInformationMarkerEnd(r60);
        Modifier r45 = RowScope.weight$default(r23, Modifier.Companion, 1.0f, false, 2, null);
        TextStyle r46 = TextStyle.m6430copyp1EtxEg$default(MaterialTheme.INSTANCE.getTypography($composer2, MaterialTheme.$stable).getBodyLarge(), HuiyuanDesignKt.getInk(), TextUnitKt.getSp(14), null, null, null, null, null, 0, null, null, null, 0, null, null, null, 0, 0, 0, null, null, null, 0, 0, null, 16777212, null);
        RoundedCornerShape r47 = RoundedCornerShapeKt.m1018RoundedCornerShape0680j_4(Dp.m6973constructorimpl(18));
        KeyboardOptions r48 = new KeyboardOptions(0, null, 0, ImeAction.Companion.m6603getSendeUduSuo(), null, null, null, 119, null);
        ComposerKt.sourceInformationMarkerStart($composer2, -34158148, "CC(remember):ChatScreen.kt#9igjgp");
        if (($dirty & 3670016) != 1048576) goto L130;
        boolean r118 = true;
    L132:
        if (($dirty & 896) != 256) goto L134;
        boolean r119 = true;
    L135:
        boolean r120 = r118 | r119;
        final AppHaptics haptics3 = haptics2;
        boolean r121 = r120 | $composer2.changedInstance(haptics3);
        if (($dirty & 57344) != 16384) goto L138;
        boolean r122 = true;
    L139:
        boolean r123 = r121 | r122;
        Object r124 = $composer2.rememberedValue();
        if (r123 == true) goto L146;
        if (r124 == Composer.Companion.getEmpty()) goto L146;
        final boolean r49 = isGenerating;
    L147:
        ComposerKt.sourceInformationMarkerEnd($composer2);
        int $dirty2 = $dirty;
        OutlinedTextFieldKt.OutlinedTextField(input, r151, r45, false, false, r46, null, ComposableLambdaKt.rememberComposableLambda(-1932805377, true, new ChatScreenKt$$ExternalSyntheticLambda5(r49, selectedModel), $composer2, 54), null, null, null, null, null, false, null, r48, new KeyboardActions(null, null, null, null, null, (Function1) r124, 31, null), false, 2, 1, null, r47, TextFieldDefaults.INSTANCE.m2801colors0hiis_0(0, 0, 0, 0, Color.Companion.m4403getWhite0d7_KjU(), Color.Companion.m4403getWhite0d7_KjU(), 0, 0, HuiyuanDesignKt.getInk(), 0, null, HuiyuanDesignKt.getInk(), HuiyuanDesignKt.getInk(), 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, $composer2, 100884480, 432, 0, 0, 3072, 2147477199, 4095), $composer2, ((($dirty >> 6) & 14) | 12582912) | (($dirty >> 6) & 112), 906166272, 0, 1212248);
        boolean r50 = !isGenerating;
        RoundedCornerShape r51 = RoundedCornerShapeKt.m1018RoundedCornerShape0680j_4(Dp.m6973constructorimpl(12));
        ButtonColors r53 = ButtonDefaults.INSTANCE.m1936buttonColorsro_MJ88(Color.Companion.m4403getWhite0d7_KjU(), HuiyuanDesignKt.getInk(), ColorKt.Color(4292992206L), HuiyuanDesignKt.getMutedText(), $composer2, (ButtonDefaults.$stable << 12) | 3510, 0);
        PaddingValues r55 = PaddingKt.m719PaddingValuesYgX7TsA(Dp.m6973constructorimpl(11), Dp.m6973constructorimpl(10));
        Modifier r410 = BorderKt.m245borderxT4_qwU(Modifier.Companion, Dp.m6973constructorimpl(2), HuiyuanDesignKt.getInk(), RoundedCornerShapeKt.m1018RoundedCornerShape0680j_4(Dp.m6973constructorimpl(12)));
        ComposerKt.sourceInformationMarkerStart($composer2, -34139619, "CC(remember):ChatScreen.kt#9igjgp");
        boolean r54 = $composer2.changedInstance(haptics3);
        if (($dirty2 & 458752) != 131072) goto L150;
        boolean r56 = true;
    L151:
        boolean r57 = r54 | r56;
        Object r125 = $composer2.rememberedValue();
        if (r57 == false) goto L154;
    L157:
        final Function0<Unit> r126 = r153;
        Object r127 = new ChatScreenKt$$ExternalSyntheticLambda6(haptics3, r126);
        $composer2.updateRememberedValue(r127);
        r125 = r127;
    L158:
        ComposerKt.sourceInformationMarkerEnd($composer2);
        ButtonKt.Button((Function0) r125, r410, r50, r51, r53, null, null, r55, null, ComposableSingletons$ChatScreenKt.INSTANCE.getLambda$1738058344$app(), $composer2, 817889280, 352);
        ComposerKt.sourceInformationMarkerStart($composer2, -34114004, "CC(remember):ChatScreen.kt#9igjgp");
        if (($dirty2 & 3670016) != 1048576) goto L161;
        boolean r58 = true;
    L162:
        boolean r59 = $composer2.changedInstance(haptics3) | r58;
        if (($dirty2 & 29360128) != 8388608) goto L165;
        boolean r63 = true;
    L166:
        boolean r66 = r59 | r63;
        if (($dirty2 & 57344) != 16384) goto L169;
        boolean r69 = true;
    L170:
        boolean r71 = r66 | r69;
        Object r73 = $composer2.rememberedValue();
        if (r71 == false) goto L173;
    L176:
        final boolean r128 = isGenerating;
        Object r129 = new ChatScreenKt$$ExternalSyntheticLambda7(r128, haptics3, r155, r152);
        $composer2.updateRememberedValue(r129);
        r73 = r129;
    L177:
        Function0 r75 = (Function0) r73;
        ComposerKt.sourceInformationMarkerEnd($composer2);
        if (r128 == false) goto L180;
    L183:
        boolean r76 = true;
    L184:
        RoundedCornerShape r77 = RoundedCornerShapeKt.m1018RoundedCornerShape0680j_4(Dp.m6973constructorimpl(12));
        ButtonDefaults r411 = ButtonDefaults.INSTANCE;
        if (r128 == false) goto L187;
        long r78 = HuiyuanDesignKt.getSignalRed();
    L188:
        ButtonKt.Button(r75, null, r76, r77, r411.m1936buttonColorsro_MJ88(r78, Color.Companion.m4403getWhite0d7_KjU(), ColorKt.Color(4287333494L), 0, $composer2, (ButtonDefaults.$stable << 12) | 432, 8), null, null, PaddingKt.m719PaddingValuesYgX7TsA(Dp.m6973constructorimpl(12), Dp.m6973constructorimpl(10)), null, ComposableLambdaKt.rememberComposableLambda(-1698315055, true, new ChatScreenKt$$ExternalSyntheticLambda8(r128), $composer2, 54), $composer2, 817889280, 354);
        ComposerKt.sourceInformationMarkerEnd($composer2);
        ComposerKt.sourceInformationMarkerEnd($composer2);
        $composer2.endNode();
        ComposerKt.sourceInformationMarkerEnd($composer2);
        ComposerKt.sourceInformationMarkerEnd($composer2);
        ComposerKt.sourceInformationMarkerEnd($composer2);
        $composer2.endReplaceGroup();
        $composer3 = $composer2;
        r7 = r128;
        r3 = r126;
    L334:
        if (ComposerKt.isTraceInProgress() == false) goto L337;
        ComposerKt.traceEventEnd();
        goto L337
    L187:
        r78 = HuiyuanDesignKt.getInk();
        goto L188
    L180:
        if (StringsKt.isBlank(input) == false) goto L183;
        r76 = false;
        goto L184
    L173:
        if (r73 == Composer.Companion.getEmpty()) goto L176;
        r128 = isGenerating;
        goto L177
    L169:
        r69 = false;
        goto L170
    L165:
        r63 = false;
        goto L166
    L161:
        r58 = false;
        goto L162
    L154:
        if (r125 == Composer.Companion.getEmpty()) goto L157;
        r126 = r153;
        goto L158
    L150:
        r56 = false;
    L146:
        r49 = isGenerating;
        Object r79 = new ChatScreenKt$$ExternalSyntheticLambda4(r49, input, haptics3, r152);
        $composer2.updateRememberedValue(r79);
        r124 = r79;
        goto L147
    L138:
        r122 = false;
        goto L139
    L134:
        r119 = false;
        goto L135
    L130:
        r118 = false;
        goto L132
    L105:
        r60 = $composer2;
        goto L106
    L98:
        r31 = r52;
        $composer2.useNode();
        goto L99
    L90:
        haptics2 = haptics;
        goto L91
    L83:
        r20 = r28;
        $composer2.useNode();
        goto L84
    L189:
        int $dirty3 = $dirty;
        $composer2.startReplaceGroup(1484712503);
        ComposerKt.sourceInformation($composer2, "1019@37738L4676");
        Modifier r80 = PaddingKt.m726paddingVpY3zN4(WindowInsetsPadding_androidKt.imePadding(BorderKt.m245borderxT4_qwU(BackgroundKt.m234backgroundbw27NRU$default(SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, null), HuiyuanDesignKt.getPaper(), null, 2, null), Dp.m6973constructorimpl(2), HuiyuanDesignKt.getInk(), RectangleShapeKt.getRectangleShape())), Dp.m6973constructorimpl(12), Dp.m6973constructorimpl(10));
        ComposerKt.sourceInformationMarkerStart($composer2, -483455358, "CC(Column)P(2,3,1)87@4442L61,88@4508L133:Column.kt#2w3rfo");
        MeasurePolicy r81 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.Companion.getStart(), $composer2, ((0 >> 3) & 14) | ((0 >> 3) & 112));
        ComposerKt.sourceInformationMarkerStart($composer2, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
        int r310 = ComposablesKt.getCurrentCompositeKeyHash($composer2, 0);
        CompositionLocalMap r82 = $composer2.getCurrentCompositionLocalMap();
        Modifier r83 = ComposedModifierKt.materializeModifier($composer2, r80);
        Function0<ComposeUiNode> r211 = ComposeUiNode.Companion.getConstructor();
        int r84 = ((((0 << 3) & 112) << 6) & 896) | 6;
        ComposerKt.sourceInformationMarkerStart($composer2, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
        if (($composer2.getApplier() instanceof Applier) == true) goto L192;
        ComposablesKt.invalidApplier();
    L192:
        $composer2.startReusableNode();
        if ($composer2.getInserting() == false) goto L195;
        Function0<ComposeUiNode> r85 = r211;
        $composer2.createNode(r85);
    L196:
        Composer r86 = Updater.m3808constructorimpl($composer2);
        Updater.m3815setimpl(r86, r81, ComposeUiNode.Companion.getSetMeasurePolicy());
        Updater.m3815setimpl(r86, r82, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> r87 = ComposeUiNode.Companion.getSetCompositeKeyHash();
        if (r86.getInserting() == true) goto L203;
        if (Intrinsics.areEqual(r86.rememberedValue(), Integer.valueOf(r310)) == false) goto L203;
    L204:
        Updater.m3815setimpl(r86, r83, ComposeUiNode.Companion.getSetModifier());
        int r412 = (r84 >> 6) & 14;
        ComposerKt.sourceInformationMarkerStart($composer2, -384672921, "C89@4556L9:Column.kt#2w3rfo");
        ColumnScopeInstance r88 = ColumnScopeInstance.INSTANCE;
        int r413 = ((0 >> 6) & 112) | 6;
        ComposerKt.sourceInformationMarkerStart($composer2, -1033296937, "C1034@38385L10,1039@38692L196,1045@38934L279,1031@38216L125,1027@38037L1190,1053@39240L29,1054@39282L3122:ChatScreen.kt#cyjvf");
        Modifier r89 = SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, null);
        TextStyle r90 = TextStyle.m6430copyp1EtxEg$default(MaterialTheme.INSTANCE.getTypography($composer2, MaterialTheme.$stable).getBodyLarge(), HuiyuanDesignKt.getInk(), TextUnitKt.getSp(15), null, null, null, null, null, 0, null, null, null, 0, null, null, null, 0, 0, 0, null, null, null, 0, 0, null, 16777212, null);
        RoundedCornerShape r91 = RoundedCornerShapeKt.m1018RoundedCornerShape0680j_4(Dp.m6973constructorimpl(13));
        KeyboardOptions r414 = new KeyboardOptions(0, null, 0, ImeAction.Companion.m6603getSendeUduSuo(), null, null, null, 119, null);
        ComposerKt.sourceInformationMarkerStart($composer2, -726052031, "CC(remember):ChatScreen.kt#9igjgp");
        if (($dirty3 & 3670016) != 1048576) goto L207;
        boolean r92 = true;
    L208:
        int r93 = $dirty3 & 896;
        boolean r415 = r92;
        if (r93 != 256) goto L211;
        boolean r94 = true;
    L212:
        boolean r95 = (r415 | r94) | $composer2.changedInstance(haptics);
        if (($dirty3 & 57344) != 16384) goto L215;
        boolean r96 = true;
    L216:
        boolean r97 = r95 | r96;
        Object r98 = $composer2.rememberedValue();
        if (r97 == true) goto L223;
        if (r98 == Composer.Companion.getEmpty()) goto L223;
    L224:
        ComposerKt.sourceInformationMarkerEnd($composer2);
        Composer $composer4 = $composer2;
        String r510 = "CC(remember):ChatScreen.kt#9igjgp";
        OutlinedTextFieldKt.OutlinedTextField(input, r151, r89, false, false, r90, null, ComposableLambdaKt.rememberComposableLambda(-1891348156, true, new ChatScreenKt$$ExternalSyntheticLambda10(selectedModel), $composer2, 54), null, null, null, null, null, false, null, r414, new KeyboardActions(null, null, null, null, null, (Function1) r98, 31, null), false, 4, 1, null, r91, TextFieldDefaults.INSTANCE.m2801colors0hiis_0(0, 0, 0, 0, Color.Companion.m4403getWhite0d7_KjU(), Color.Companion.m4403getWhite0d7_KjU(), 0, 0, HuiyuanDesignKt.getInk(), 0, null, HuiyuanDesignKt.getInk(), HuiyuanDesignKt.getInk(), 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, $composer2, 100884480, 432, 0, 0, 3072, 2147477199, 4095), $composer2, ((($dirty3 >> 6) & 14) | 12583296) | (($dirty3 >> 6) & 112), 906166272, 0, 1212248);
        SpacerKt.Spacer(SizeKt.m758height3ABfNKs(Modifier.Companion, Dp.m6973constructorimpl(9)), $composer2, 6);
        Modifier r99 = SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, null);
        Arrangement.Horizontal r100 = Arrangement.INSTANCE.getSpaceBetween();
        Alignment.Vertical r101 = Alignment.Companion.getCenterVertically();
        ComposerKt.sourceInformationMarkerStart($composer2, 693286680, "CC(Row)P(2,1,3)99@5124L58,100@5187L130:Row.kt#2w3rfo");
        MeasurePolicy r130 = RowKt.rowMeasurePolicy(r100, r101, $composer2, ((438 >> 3) & 14) | ((438 >> 3) & 112));
        ComposerKt.sourceInformationMarkerStart($composer2, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
        int r131 = ComposablesKt.getCurrentCompositeKeyHash($composer2, 0);
        CompositionLocalMap r132 = $composer2.getCurrentCompositionLocalMap();
        Modifier r102 = ComposedModifierKt.materializeModifier($composer2, r99);
        Function0<ComposeUiNode> r133 = ComposeUiNode.Companion.getConstructor();
        int r103 = ((((438 << 3) & 112) << 6) & 896) | 6;
        ComposerKt.sourceInformationMarkerStart($composer2, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
        if (($composer2.getApplier() instanceof Applier) == true) goto L227;
        ComposablesKt.invalidApplier();
    L227:
        $composer2.startReusableNode();
        if ($composer2.getInserting() == false) goto L230;
        Function0<ComposeUiNode> r104 = r133;
        $composer2.createNode(r104);
    L231:
        Composer r105 = Updater.m3808constructorimpl($composer2);
        Updater.m3815setimpl(r105, r130, ComposeUiNode.Companion.getSetMeasurePolicy());
        Updater.m3815setimpl(r105, r132, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> r106 = ComposeUiNode.Companion.getSetCompositeKeyHash();
        if (r105.getInserting() == true) goto L237;
        Composer r311 = $composer2;
        if (Intrinsics.areEqual(r105.rememberedValue(), Integer.valueOf(r131)) == true) goto L239;
    L238:
        r105.updateRememberedValue(Integer.valueOf(r131));
        r105.apply(Integer.valueOf(r131), r106);
    L239:
        Updater.m3815setimpl(r105, r102, ComposeUiNode.Companion.getSetModifier());
        int r107 = (r103 >> 6) & 14;
        ComposerKt.sourceInformationMarkerStart($composer2, -407735110, "C101@5232L9:Row.kt#2w3rfo");
        int r212 = ((438 >> 6) & 112) | 6;
        RowScope r108 = RowScopeInstance.INSTANCE;
        ComposerKt.sourceInformationMarkerStart($composer2, -1954499104, "C1060@39573L21,1059@39500L629,1073@40146L2244:ChatScreen.kt#cyjvf");
        Modifier r109 = ScrollKt.horizontalScroll$default(RowScope.weight$default(r108, Modifier.Companion, 1.0f, false, 2, null), ScrollKt.rememberScrollState(0, $composer2, 0, 1), false, null, false, 14, null);
        Arrangement.Horizontal r134 = Arrangement.INSTANCE.m606spacedBy0680j_4(Dp.m6973constructorimpl(7));
        ComposerKt.sourceInformationMarkerStart($composer2, 693286680, "CC(Row)P(2,1,3)99@5124L58,100@5187L130:Row.kt#2w3rfo");
        MeasurePolicy r135 = RowKt.rowMeasurePolicy(r134, Alignment.Companion.getTop(), $composer2, ((48 >> 3) & 14) | ((48 >> 3) & 112));
        ComposerKt.sourceInformationMarkerStart($composer2, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
        int r710 = ComposablesKt.getCurrentCompositeKeyHash($composer2, 0);
        CompositionLocalMap r136 = $composer2.getCurrentCompositionLocalMap();
        Modifier r137 = ComposedModifierKt.materializeModifier($composer2, r109);
        Function0<ComposeUiNode> r711 = ComposeUiNode.Companion.getConstructor();
        int r138 = ((((48 << 3) & 112) << 6) & 896) | 6;
        ComposerKt.sourceInformationMarkerStart($composer2, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
        if (($composer2.getApplier() instanceof Applier) == true) goto L242;
        ComposablesKt.invalidApplier();
    L242:
        $composer2.startReusableNode();
        if ($composer2.getInserting() == false) goto L245;
        Function0<ComposeUiNode> r139 = r711;
        $composer2.createNode(r139);
    L246:
        Composer r140 = Updater.m3808constructorimpl($composer2);
        Updater.m3815setimpl(r140, r135, ComposeUiNode.Companion.getSetMeasurePolicy());
        Updater.m3815setimpl(r140, r136, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> r141 = ComposeUiNode.Companion.getSetCompositeKeyHash();
        if (r140.getInserting() == true) goto L253;
        if (Intrinsics.areEqual(r140.rememberedValue(), Integer.valueOf(r710)) == false) goto L253;
    L254:
        Updater.m3815setimpl(r140, r137, ComposeUiNode.Companion.getSetModifier());
        int r142 = (r138 >> 6) & 14;
        ComposerKt.sourceInformationMarkerStart($composer2, -407735110, "C101@5232L9:Row.kt#2w3rfo");
        int r712 = ((48 >> 6) & 112) | 6;
        RowScope r143 = RowScopeInstance.INSTANCE;
        Composer r144 = $composer2;
        ComposerKt.sourceInformationMarkerStart(r144, 1480195739, "C:ChatScreen.kt#cyjvf");
        r144.startReplaceGroup(-1614819240);
        ComposerKt.sourceInformation(r144, "*1069@40037L26,1064@39767L322");
        Iterable r145 = AIModel.getEntries();
        int r146 = 0;
        Iterator<AIModel> r910 = r145.iterator();
    L256:
        if (r910.hasNext() == false) goto L274;
        Iterable r911 = r145;
        final AIModel r147 = (AIModel) r910.next();
        String r810 = r147.getChipLabel();
        long r811 = modelAccent(r147);
        int r912 = r146;
        if (selectedModel != r147) goto L260;
        boolean r812 = true;
    L261:
        boolean r813 = !isGenerating;
        RowScope r913 = r143;
        String r148 = r510;
        ComposerKt.sourceInformationMarkerStart(r144, -1296230043, r148);
        Composer r914 = r144;
        if (($dirty3 & 112) != 32) goto L264;
        boolean r150 = true;
    L265:
        boolean r511 = r150;
        Composer $composer5 = $composer4;
        boolean r154 = r511 | $composer5.changed(r147.ordinal());
        Object r156 = r914.rememberedValue();
        if (r154 == true) goto L271;
        Modifier r1010 = r137;
        if (r156 != Composer.Companion.getEmpty()) goto L273;
    L272:
        r156 = new ChatScreenKt$$ExternalSyntheticLambda11(r149, r147);
        r914.updateRememberedValue(r156);
    L273:
        ComposerKt.sourceInformationMarkerEnd(r914);
        m7402ModeChip8V94_ZQ(r810, r811, r812, r813, (Function0) r156, r914, 0, 0);
        $composer4 = $composer5;
        r510 = r148;
        r144 = r914;
        r145 = r911;
        r146 = r912;
        r143 = r913;
        r137 = r1010;
        goto L256
    L271:
        r1010 = r137;
        goto L272
    L264:
        r150 = false;
        goto L265
    L260:
        r812 = false;
        goto L261
    L274:
        Composer r915 = r144;
        $composer3 = $composer4;
        String r157 = r510;
        r915.endReplaceGroup();
        ComposerKt.sourceInformationMarkerEnd(r915);
        ComposerKt.sourceInformationMarkerEnd($composer2);
        $composer2.endNode();
        ComposerKt.sourceInformationMarkerEnd($composer2);
        ComposerKt.sourceInformationMarkerEnd($composer2);
        ComposerKt.sourceInformationMarkerEnd($composer2);
        Arrangement.Horizontal r158 = Arrangement.INSTANCE.m606spacedBy0680j_4(Dp.m6973constructorimpl(8));
        ComposerKt.sourceInformationMarkerStart($composer2, 693286680, "CC(Row)P(2,1,3)99@5124L58,100@5187L130:Row.kt#2w3rfo");
        Modifier r159 = Modifier.Companion;
        MeasurePolicy r160 = RowKt.rowMeasurePolicy(r158, Alignment.Companion.getTop(), $composer2, ((48 >> 3) & 14) | ((48 >> 3) & 112));
        ComposerKt.sourceInformationMarkerStart($composer2, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
        int r161 = ComposablesKt.getCurrentCompositeKeyHash($composer2, 0);
        CompositionLocalMap r162 = $composer2.getCurrentCompositionLocalMap();
        Modifier r163 = ComposedModifierKt.materializeModifier($composer2, r159);
        Function0<ComposeUiNode> r610 = ComposeUiNode.Companion.getConstructor();
        int r164 = ((((48 << 3) & 112) << 6) & 896) | 6;
        ComposerKt.sourceInformationMarkerStart($composer2, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
        if (($composer2.getApplier() instanceof Applier) == true) goto L277;
        ComposablesKt.invalidApplier();
    L277:
        $composer2.startReusableNode();
        if ($composer2.getInserting() == false) goto L280;
        Function0<ComposeUiNode> r165 = r610;
        $composer2.createNode(r165);
    L281:
        Composer r166 = Updater.m3808constructorimpl($composer2);
        Updater.m3815setimpl(r166, r160, ComposeUiNode.Companion.getSetMeasurePolicy());
        Updater.m3815setimpl(r166, r162, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> r167 = ComposeUiNode.Companion.getSetCompositeKeyHash();
        if (r166.getInserting() == true) goto L288;
        if (Intrinsics.areEqual(r166.rememberedValue(), Integer.valueOf(r161)) == false) goto L288;
    L289:
        Updater.m3815setimpl(r166, r163, ComposeUiNode.Companion.getSetModifier());
        int r168 = (r164 >> 6) & 14;
        ComposerKt.sourceInformationMarkerStart($composer2, -407735110, "C101@5232L9:Row.kt#2w3rfo");
        RowScopeInstance r169 = RowScopeInstance.INSTANCE;
        int r170 = ((48 >> 6) & 112) | 6;
        ComposerKt.sourceInformationMarkerStart($composer2, -1608181215, "C1081@40549L278,1075@40266L125,1074@40224L919,1093@41206L372,1104@41757L249,1110@42123L249,1092@41164L1208:ChatScreen.kt#cyjvf");
        boolean r171 = !isGenerating;
        RoundedCornerShape r172 = RoundedCornerShapeKt.m1018RoundedCornerShape0680j_4(Dp.m6973constructorimpl(11));
        ButtonColors r814 = ButtonDefaults.INSTANCE.m1936buttonColorsro_MJ88(Color.Companion.m4403getWhite0d7_KjU(), HuiyuanDesignKt.getInk(), ColorKt.Color(4292992206L), HuiyuanDesignKt.getMutedText(), $composer2, (ButtonDefaults.$stable << 12) | 3510, 0);
        PaddingValues r815 = PaddingKt.m719PaddingValuesYgX7TsA(Dp.m6973constructorimpl(13), Dp.m6973constructorimpl(10));
        Modifier r713 = BorderKt.m245borderxT4_qwU(Modifier.Companion, Dp.m6973constructorimpl(2), HuiyuanDesignKt.getInk(), RoundedCornerShapeKt.m1018RoundedCornerShape0680j_4(Dp.m6973constructorimpl(11)));
        ComposerKt.sourceInformationMarkerStart($composer2, -606066821, r157);
        boolean r173 = $composer3.changedInstance(haptics);
        if (($dirty3 & 458752) != 131072) goto L292;
        boolean r174 = true;
    L293:
        boolean r175 = r173 | r174;
        Object r176 = $composer2.rememberedValue();
        if (r175 == true) goto L300;
        if (r176 == Composer.Companion.getEmpty()) goto L300;
        r3 = r153;
    L301:
        ComposerKt.sourceInformationMarkerEnd(r3);
        ButtonKt.Button((Function0) r176, r713, r171, r172, r814, null, null, r815, null, ComposableSingletons$ChatScreenKt.INSTANCE.m7405getLambda$1731945330$app(), $composer2, 817889280, 352);
        ComposerKt.sourceInformationMarkerStart($composer2, -606036494, r157);
        if (($dirty3 & 3670016) != 1048576) goto L304;
        boolean r177 = true;
    L305:
        boolean r178 = $composer3.changedInstance(haptics) | r177;
        if (($dirty3 & 29360128) != 8388608) goto L308;
        boolean r179 = true;
    L309:
        boolean r180 = r178 | r179;
        if (($dirty3 & 57344) != 16384) goto L312;
        boolean r181 = true;
    L313:
        boolean r182 = r180 | r181;
        Object r183 = $composer2.rememberedValue();
        if (r182 == true) goto L320;
        if (r183 == Composer.Companion.getEmpty()) goto L320;
        r7 = isGenerating;
    L321:
        Function0 r184 = (Function0) r183;
        ComposerKt.sourceInformationMarkerEnd(r1);
        if (r7 == false) goto L324;
    L327:
        boolean r185 = true;
    L328:
        RoundedCornerShape r186 = RoundedCornerShapeKt.m1018RoundedCornerShape0680j_4(Dp.m6973constructorimpl(11));
        ButtonDefaults r714 = ButtonDefaults.INSTANCE;
        if (r7 == false) goto L331;
        long r187 = HuiyuanDesignKt.getSignalRed();
    L332:
        ButtonKt.Button(r184, null, r185, r186, r714.m1936buttonColorsro_MJ88(r187, Color.Companion.m4403getWhite0d7_KjU(), ColorKt.Color(4287333494L), 0, r1, (ButtonDefaults.$stable << 12) | 432, 8), null, null, PaddingKt.m719PaddingValuesYgX7TsA(Dp.m6973constructorimpl(17), Dp.m6973constructorimpl(10)), null, ComposableLambdaKt.rememberComposableLambda(1555829943, true, new ChatScreenKt$$ExternalSyntheticLambda2(r7), $composer2, 54), $composer2, 817889280, 354);
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
        ComposerKt.sourceInformationMarkerEnd(r311);
        ComposerKt.sourceInformationMarkerEnd($composer2);
        $composer2.endNode();
        ComposerKt.sourceInformationMarkerEnd($composer2);
        ComposerKt.sourceInformationMarkerEnd($composer2);
        ComposerKt.sourceInformationMarkerEnd($composer2);
        $composer3.endReplaceGroup();
        goto L334
    L331:
        r187 = HuiyuanDesignKt.getInk();
        goto L332
    L324:
        if (StringsKt.isBlank(input) == false) goto L327;
        r185 = false;
    L320:
        r7 = isGenerating;
        Object r188 = new ChatScreenKt$$ExternalSyntheticLambda1(r7, haptics, r155, r152);
        $composer2.updateRememberedValue(r188);
        r183 = r188;
        goto L321
    L312:
        r181 = false;
        goto L313
    L308:
        r179 = false;
        goto L309
    L304:
        r177 = false;
    L300:
        r3 = r153;
        Object r189 = new ChatScreenKt$$ExternalSyntheticLambda12(haptics, r3);
        $composer2.updateRememberedValue(r189);
        r176 = r189;
        goto L301
    L292:
        r174 = false;
    L288:
        r166.updateRememberedValue(Integer.valueOf(r161));
        r166.apply(Integer.valueOf(r161), r167);
        goto L289
    L280:
        r165 = r610;
        $composer2.useNode();
    L253:
        r140.updateRememberedValue(Integer.valueOf(r710));
        r140.apply(Integer.valueOf(r710), r141);
        goto L254
    L245:
        r139 = r711;
        $composer2.useNode();
        goto L246
    L237:
        r311 = $composer2;
        goto L238
    L230:
        r104 = r133;
        $composer2.useNode();
    L223:
        r98 = new ChatScreenKt$$ExternalSyntheticLambda9(isGenerating, input, haptics, r152);
        $composer2.updateRememberedValue(r98);
        goto L224
    L215:
        r96 = false;
        goto L216
    L211:
        r94 = false;
        goto L212
    L207:
        r92 = false;
    L203:
        r86.updateRememberedValue(Integer.valueOf(r310));
        r86.apply(Integer.valueOf(r310), r87);
        goto L204
    L195:
        r85 = r211;
        $composer2.useNode();
        goto L196
    L69:
        r110 = false;
        goto L71
    }

    static final Unit Composer$lambda$121$lambda$112$lambda$111$lambda$110$lambda$109(Function1 $onModelSelected, AIModel $model) {
        $onModelSelected.invoke($model);
        return Unit.INSTANCE;
    }

    static final Unit Composer$lambda$121$lambda$115(boolean $isGenerating, AIModel $selectedModel, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C949@34763L216:ChatScreen.kt#cyjvf");
        if (($changed & 3) == 2) goto L5;
        boolean r2 = true;
    L7:
        if ($composer.shouldExecute(r2, $changed & 1) == true) goto L9;
        $composer.skipToGroupEnd();
    L19:
        return Unit.INSTANCE;
    L9:
        if (ComposerKt.isTraceInProgress() == false) goto L11;
        ComposerKt.traceEventStart(-1932805377, $changed, -1, "com.luchime.huiyuan.ui.Composer.<anonymous>.<anonymous> (ChatScreen.kt:949)");
    L11:
        if ($isGenerating == false) goto L13;
        String r3 = "正在生成，可继续输入…";
    L14:
        TextKt.m2820Text4IGK_g(r3, null, ColorKt.Color(4286675303L), TextUnitKt.getSp(13), null, null, null, 0, null, null, 0, 0, false, 0, 0, null, null, $composer, 3456, 0, 131058);
        if (ComposerKt.isTraceInProgress() == false) goto L19;
        ComposerKt.traceEventEnd();
        goto L19
    L13:
        r3 = "把问题告诉" + $selectedModel.getShortName() + "…";
        goto L14
    L5:
        r2 = false;
        goto L7
    }

    static final Unit Composer$lambda$121$lambda$114$lambda$113(boolean $isGenerating, String $input, AppHaptics $haptics, Function0 $onSend, KeyboardActionScope $this$KeyboardActions) {
        Intrinsics.checkNotNullParameter($this$KeyboardActions, "$this$KeyboardActions");
        if ($isGenerating == true) goto L8;
        if (StringsKt.isBlank($input) == true) goto L8;
        $haptics.perform(HapticCue.CONFIRM);
        $onSend.invoke();
    L8:
        return Unit.INSTANCE;
    }

    static final Unit Composer$lambda$121$lambda$117$lambda$116(AppHaptics $haptics, Function0 $onRandom) {
        $haptics.perform(HapticCue.TAP);
        $onRandom.invoke();
        return Unit.INSTANCE;
    }

    static final Unit Composer$lambda$121$lambda$119$lambda$118(boolean $isGenerating, AppHaptics $haptics, Function0 $onStopGeneration, Function0 $onSend) {
        if ($isGenerating == false) goto L4;
        $haptics.perform(HapticCue.DESTRUCTIVE);
        $onStopGeneration.invoke();
    L6:
        return Unit.INSTANCE;
    L4:
        $haptics.perform(HapticCue.CONFIRM);
        $onSend.invoke();
        goto L6
    }

    static final Unit Composer$lambda$121$lambda$120(boolean $isGenerating, RowScope $this$Button, Composer $composer, int $changed) {
        Intrinsics.checkNotNullParameter($this$Button, "$this$Button");
        ComposerKt.sourceInformation($composer, "C1011@37523L169:ChatScreen.kt#cyjvf");
        if (($changed & 17) == 16) goto L5;
        boolean r2 = true;
    L7:
        if ($composer.shouldExecute(r2, $changed & 1) == true) goto L9;
        $composer.skipToGroupEnd();
    L19:
        return Unit.INSTANCE;
    L9:
        if (ComposerKt.isTraceInProgress() == false) goto L11;
        ComposerKt.traceEventStart(-1698315055, $changed, -1, "com.luchime.huiyuan.ui.Composer.<anonymous>.<anonymous> (ChatScreen.kt:1011)");
    L11:
        if ($isGenerating == false) goto L13;
        String r3 = "停止 ■";
    L14:
        FontWeight r7 = FontWeight.Companion.getBlack();
        String r0 = r3;
        TextKt.m2820Text4IGK_g(r0, null, 0, TextUnitKt.getSp(11), null, r7, null, 0, null, null, 0, 0, false, 0, 0, null, null, $composer, 199680, 0, 131030);
        if (ComposerKt.isTraceInProgress() == false) goto L19;
        ComposerKt.traceEventEnd();
        goto L19
    L13:
        r3 = "发送 ↑";
        goto L14
    L5:
        r2 = false;
        goto L7
    }

    static final Unit Composer$lambda$136$lambda$124(AIModel $selectedModel, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C1032@38238L85:ChatScreen.kt#cyjvf");
        if (($changed & 3) == 2) goto L5;
        boolean r2 = true;
    L7:
        if ($composer.shouldExecute(r2, $changed & 1) == true) goto L9;
        $composer.skipToGroupEnd();
    L16:
        return Unit.INSTANCE;
    L9:
        if (ComposerKt.isTraceInProgress() == false) goto L11;
        ComposerKt.traceEventStart(-1891348156, $changed, -1, "com.luchime.huiyuan.ui.Composer.<anonymous>.<anonymous> (ChatScreen.kt:1032)");
    L11:
        TextKt.m2820Text4IGK_g("把问题告诉" + $selectedModel.getShortName() + "…", null, ColorKt.Color(4286675303L), TextUnitKt.getSp(14), null, null, null, 0, null, null, 0, 0, false, 0, 0, null, null, $composer, 3456, 0, 131058);
        if (ComposerKt.isTraceInProgress() == false) goto L16;
        ComposerKt.traceEventEnd();
        goto L16
    L5:
        r2 = false;
        goto L7
    }

    static final Unit Composer$lambda$136$lambda$123$lambda$122(boolean $isGenerating, String $input, AppHaptics $haptics, Function0 $onSend, KeyboardActionScope $this$KeyboardActions) {
        Intrinsics.checkNotNullParameter($this$KeyboardActions, "$this$KeyboardActions");
        if ($isGenerating == true) goto L8;
        if (StringsKt.isBlank($input) == true) goto L8;
        $haptics.perform(HapticCue.CONFIRM);
        $onSend.invoke();
    L8:
        return Unit.INSTANCE;
    }

    static final Unit Composer$lambda$136$lambda$135$lambda$128$lambda$127$lambda$126$lambda$125(Function1 $onModelSelected, AIModel $model) {
        $onModelSelected.invoke($model);
        return Unit.INSTANCE;
    }

    static final Unit Composer$lambda$136$lambda$135$lambda$134$lambda$130$lambda$129(AppHaptics $haptics, Function0 $onRandom) {
        $haptics.perform(HapticCue.TAP);
        $onRandom.invoke();
        return Unit.INSTANCE;
    }

    static final Unit Composer$lambda$136$lambda$135$lambda$134$lambda$132$lambda$131(boolean $isGenerating, AppHaptics $haptics, Function0 $onStopGeneration, Function0 $onSend) {
        if ($isGenerating == false) goto L4;
        $haptics.perform(HapticCue.DESTRUCTIVE);
        $onStopGeneration.invoke();
    L6:
        return Unit.INSTANCE;
    L4:
        $haptics.perform(HapticCue.CONFIRM);
        $onSend.invoke();
        goto L6
    }

    static final Unit Composer$lambda$136$lambda$135$lambda$134$lambda$133(boolean $isGenerating, RowScope $this$Button, Composer $composer, int $changed) {
        Intrinsics.checkNotNullParameter($this$Button, "$this$Button");
        ComposerKt.sourceInformation($composer, "C1111@42149L201:ChatScreen.kt#cyjvf");
        if (($changed & 17) == 16) goto L5;
        boolean r2 = true;
    L7:
        if ($composer.shouldExecute(r2, $changed & 1) == true) goto L9;
        $composer.skipToGroupEnd();
    L19:
        return Unit.INSTANCE;
    L9:
        if (ComposerKt.isTraceInProgress() == false) goto L11;
        ComposerKt.traceEventStart(1555829943, $changed, -1, "com.luchime.huiyuan.ui.Composer.<anonymous>.<anonymous>.<anonymous>.<anonymous> (ChatScreen.kt:1111)");
    L11:
        if ($isGenerating == false) goto L13;
        String r3 = "停止 ■";
    L14:
        FontWeight r7 = FontWeight.Companion.getBlack();
        String r0 = r3;
        TextKt.m2820Text4IGK_g(r0, null, 0, TextUnitKt.getSp(12), null, r7, null, 0, null, null, 0, 0, false, 0, 0, null, null, $composer, 199680, 0, 131030);
        if (ComposerKt.isTraceInProgress() == false) goto L19;
        ComposerKt.traceEventEnd();
        goto L19
    L13:
        r3 = "发送 ↑";
        goto L14
    L5:
        r2 = false;
        goto L7
    }

    /* JADX INFO: renamed from: ModeChip-8V94_ZQ, reason: not valid java name */
    private static final void m7402ModeChip8V94_ZQ(final String text, long color, boolean active, boolean enabled, Function0<Unit> r39, Composer $composer, final int $changed, final int r42) {
        Composer $composer2 = $composer.startRestartGroup(-699797646);
        ComposerKt.sourceInformation($composer2, "C(ModeChip)P(4,1:c#ui.graphics.Color)1137@42922L334:ChatScreen.kt#cyjvf");
        int $dirty = $changed;
        if (($changed & 6) != 0) goto L9;
        String r8 = text;
        if ($composer2.changed(r8) == false) goto L7;
        int r3 = 4;
    L8:
        $dirty = $dirty | r3;
    L11:
        if (($changed & 48) != 0) goto L17;
        long r4 = color;
        if ($composer2.changed(r4) == false) goto L15;
        int r5 = 32;
    L16:
        $dirty = $dirty | r5;
    L18:
        int r6 = r42 & 4;
        if (r6 == 0) goto L22;
        $dirty = $dirty | 384;
        boolean r7 = active;
    L29:
        int r9 = r42 & 8;
        if (r9 == 0) goto L33;
        $dirty = $dirty | 3072;
        boolean enabled2 = enabled;
    L40:
        int r11 = r42 & 16;
        if (r11 == 0) goto L44;
        $dirty = $dirty | 24576;
        Function0<Unit> r12 = r39;
    L52:
        if (($dirty & 9363) == 9362) goto L54;
        boolean r13 = true;
    L56:
        if ($composer2.shouldExecute(r13, $dirty & 1) == false) goto L90;
        if (r6 == 0) goto L59;
        boolean active2 = true;
    L60:
        if (r9 == 0) goto L62;
        boolean enabled3 = true;
    L63:
        if (r11 == 0) goto L65;
        Function0<Unit> r14 = null;
    L67:
        if (ComposerKt.isTraceInProgress() == false) goto L69;
        ComposerKt.traceEventStart(-699797646, $dirty, -1, "com.luchime.huiyuan.ui.ModeChip (ChatScreen.kt:1130)");
    L69:
        Modifier.Companion r0 = Modifier.Companion;
        if (active2 == false) goto L72;
        long r10 = r4;
    L73:
        Modifier r1 = BackgroundKt.m233backgroundbw27NRU(r0, r10, RoundedCornerShapeKt.RoundedCornerShape(50));
        if (active2 == false) goto L76;
        float r15 = Dp.m6973constructorimpl(2);
    L77:
        Modifier chipModifier = BorderKt.m245borderxT4_qwU(r1, r15, HuiyuanDesignKt.getInk(), RoundedCornerShapeKt.RoundedCornerShape(50));
        if (enabled3 == false) goto L81;
        if (r14 == null) goto L81;
        Modifier chipModifier2 = AppHapticsKt.hapticClickable$default(chipModifier, false, HapticCue.SELECTION, r14, 1, null);
    L82:
        long r16 = HuiyuanDesignKt.getInk();
        long r17 = TextUnitKt.getSp(11);
        FontWeight r18 = FontWeight.Companion.getBlack();
        Modifier.Companion r19 = Modifier.Companion;
        Function0<Unit> r37 = r14;
        if (enabled3 == true) goto L86;
        r19 = AlphaKt.alpha(r19, 0.48f);
    L86:
        Composer $composer3 = $composer2;
        int $dirty2 = $dirty;
        TextKt.m2820Text4IGK_g(r8, PaddingKt.m726paddingVpY3zN4(chipModifier2.then(r19), Dp.m6973constructorimpl(8), Dp.m6973constructorimpl(6)), r16, r17, null, r18, null, 0, null, null, 0, TextOverflow.Companion.m6886getClipgIe3tQ8(), false, 1, 0, null, null, $composer3, ($dirty2 & 14) | 200064, 3120, 120784);
        if (ComposerKt.isTraceInProgress() == false) goto L89;
        ComposerKt.traceEventEnd();
    L89:
        enabled2 = enabled3;
        final Function0<Unit> r20 = r37;
    L91:
        ScopeUpdateScope r21 = $composer3.endRestartGroup();
        if (r21 == null) goto L95;
        final long r2 = r4;
        final boolean active3 = active2;
        final boolean active4 = enabled2;
        r21.updateScope(new ChatScreenKt$$ExternalSyntheticLambda52(text, r2, active3, active4, r20, $changed, r42));
        return;
    L95:
        return;
    L81:
        chipModifier2 = chipModifier;
        goto L82
    L76:
        r15 = Dp.m6973constructorimpl((float) 1.5d);
        goto L77
    L72:
        r10 = Color.Companion.m4403getWhite0d7_KjU();
        goto L73
    L65:
        r14 = r12;
        goto L67
    L62:
        enabled3 = enabled2;
        goto L63
    L59:
        active2 = r7;
        goto L60
    L90:
        $composer3 = $composer2;
        $dirty2 = $dirty;
        $composer3.skipToGroupEnd();
        active2 = r7;
        r20 = r12;
        goto L91
    L54:
        r13 = false;
        goto L56
    L44:
        if (($changed & 24576) != 0) goto L50;
        r12 = r39;
        if ($composer2.changedInstance(r12) == false) goto L48;
        int r110 = 16384;
    L49:
        $dirty = $dirty | r110;
        goto L52
    L48:
        r110 = 8192;
        goto L49
    L50:
        r12 = r39;
        goto L52
    L33:
        if (($changed & 3072) != 0) goto L39;
        enabled2 = enabled;
        if ($composer2.changed(enabled2) == false) goto L37;
        int r111 = 2048;
    L38:
        $dirty = $dirty | r111;
        goto L40
    L37:
        r111 = 1024;
        goto L38
    L39:
        enabled2 = enabled;
        goto L40
    L22:
        if (($changed & 384) != 0) goto L28;
        r7 = active;
        if ($composer2.changed(r7) == false) goto L26;
        int r22 = 256;
    L27:
        $dirty = $dirty | r22;
        goto L29
    L26:
        r22 = 128;
        goto L27
    L28:
        r7 = active;
        goto L29
    L15:
        r5 = 16;
        goto L16
    L17:
        r4 = color;
        goto L18
    L7:
        r3 = 2;
        goto L8
    L9:
        r8 = text;
        goto L11
    }
}
