package com.luchime.huiyuan.ui;

import android.content.Context;
import androidx.compose.animation.AnimationModifierKt;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.BorderKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
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
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
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
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.GraphicsLayerModifierKt;
import androidx.compose.ui.graphics.GraphicsLayerScope;
import androidx.compose.ui.graphics.RectangleShapeKt;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.graphics.TileMode;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.input.ImeAction;
import androidx.compose.ui.text.input.PlatformImeOptions;
import androidx.compose.ui.text.input.VisualTransformation;
import androidx.compose.ui.text.intl.LocaleList;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
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
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import kotlin.text.StringsKt;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: ChatScreen.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000t\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\f\u001aí\u0001\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00070\u000b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u00012\u0006\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00122\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00020\u00152\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00070\u000b2\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00070\u00182\u0012\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00070\u000b2\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00070\u00182\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00182\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00070\u00182\u0018\u0010\u001d\u001a\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00070\u001e2\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00070\u0018H\u0001¢\u0006\u0002\u0010 \u001a'\u0010!\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\"\u001a\u00020#2\b\b\u0002\u0010$\u001a\u00020%H\u0003¢\u0006\u0002\u0010&\u001a1\u0010'\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00070\u000b2\u0006\u0010(\u001a\u00020\u0012H\u0003¢\u0006\u0002\u0010)\u001a\u0015\u0010*\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0003¢\u0006\u0002\u0010+\u001a+\u0010,\u001a\u00020\u00072\u0006\u0010-\u001a\u00020\u00102\u0006\u0010.\u001a\u00020\u00122\f\u0010/\u001a\b\u0012\u0004\u0012\u00020\u00070\u0018H\u0003¢\u0006\u0002\u00100\u001aa\u00101\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00070\u000b2\f\u00102\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010(\u001a\u00020\u00122\u0012\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00070\u000b2\f\u00103\u001a\b\u0012\u0004\u0012\u00020\u00070\u0018H\u0003¢\u0006\u0002\u00104\u001a3\u00105\u001a\u00020\u00072\u0006\u00106\u001a\u00020\t2\u0012\u00107\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00070\u000b2\b\b\u0002\u0010(\u001a\u00020\u0012H\u0003¢\u0006\u0002\u00108\u001a\u0015\u00109\u001a\u00020:2\u0006\u0010;\u001a\u00020\tH\u0002¢\u0006\u0002\u0010<\u001a\u0010\u0010=\u001a\u00020\u00022\u0006\u0010;\u001a\u00020\tH\u0002\u001a\u0010\u0010>\u001a\u00020\u00022\u0006\u0010;\u001a\u00020\tH\u0002\u001aE\u0010?\u001a\u00020\u00072\f\u00102\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010(\u001a\u00020\u00122\u0012\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00070\u000b2\f\u00103\u001a\b\u0012\u0004\u0012\u00020\u00070\u0018H\u0003¢\u0006\u0002\u0010@\u001a\u0015\u0010A\u001a\u00020\u00072\u0006\u0010;\u001a\u00020\tH\u0003¢\u0006\u0002\u0010+\u001aG\u0010B\u001a\u00020\u00072\u0006\u0010C\u001a\u00020D2\u0006\u0010E\u001a\u00020\u00122\f\u0010F\u001a\b\u0012\u0004\u0012\u00020\u00070\u00182\f\u0010G\u001a\b\u0012\u0004\u0012\u00020\u00070\u00182\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00070\u0018H\u0003¢\u0006\u0002\u0010H\u001a#\u0010I\u001a\u00020\u00072\u0006\u0010J\u001a\u00020\u00022\f\u0010K\u001a\b\u0012\u0004\u0012\u00020\u00070\u0018H\u0003¢\u0006\u0002\u0010L\u001a\u0015\u0010M\u001a\u00020\u00072\u0006\u0010N\u001a\u00020OH\u0003¢\u0006\u0002\u0010P\u001a\u007f\u0010Q\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00070\u000b2\u0006\u0010\u000e\u001a\u00020\u00022\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00070\u000b2\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00070\u00182\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00070\u00182\u0006\u0010\u0011\u001a\u00020\u00122\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00182\u0006\u0010.\u001a\u00020\u0012H\u0003¢\u0006\u0002\u0010R\u001aE\u0010S\u001a\u00020\u00072\u0006\u0010J\u001a\u00020\u00022\u0006\u0010T\u001a\u00020:2\b\b\u0002\u0010U\u001a\u00020\u00122\b\b\u0002\u0010(\u001a\u00020\u00122\u0010\b\u0002\u0010K\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0018H\u0003¢\u0006\u0004\bV\u0010W\"\u0014\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006X²\u0006\n\u0010Y\u001a\u00020\u0012X\u008a\u0084\u0002²\u0006\n\u0010Z\u001a\u00020\u0012X\u008a\u008e\u0002²\u0006\n\u0010[\u001a\u00020#X\u008a\u0084\u0002"}, d2 = {"questionPool", "", "", "piaoQuestionPool", "guiguiQuestionPool", "tangoQuestionPool", "ChatScreen", "", "selectedModel", "Lcom/luchime/huiyuan/ui/AIModel;", "onModelSelected", "Lkotlin/Function1;", "timeline", "Lcom/luchime/huiyuan/ui/TimelineItem;", "input", "chipRound", "", "isGenerating", "", "isLandscape", "favorites", "", "onInputChange", "onSend", "Lkotlin/Function0;", "onPrompt", "onRandom", "onStopGeneration", "onRefreshPrompts", "onToggleFavorite", "Lkotlin/Function2;", "onClearConversation", "(Lcom/luchime/huiyuan/ui/AIModel;Lkotlin/jvm/functions/Function1;Ljava/util/List;Ljava/lang/String;IZZLjava/util/Set;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "CollapsingModelHeader", NotificationCompat.CATEGORY_PROGRESS, "", "modifier", "Landroidx/compose/ui/Modifier;", "(Lcom/luchime/huiyuan/ui/AIModel;FLandroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "HeroHeader", "enabled", "(Lcom/luchime/huiyuan/ui/AIModel;Lkotlin/jvm/functions/Function1;ZLandroidx/compose/runtime/Composer;I)V", "MarqueeStrip", "(Lcom/luchime/huiyuan/ui/AIModel;Landroidx/compose/runtime/Composer;I)V", "ConversationToolbar", "messageCount", "compact", "onClear", "(IZLkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "LandscapePromptPanel", "questions", "onRefresh", "(Lcom/luchime/huiyuan/ui/AIModel;Lkotlin/jvm/functions/Function1;Ljava/util/List;ZLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "ModelSelector", "selected", "onSelect", "(Lcom/luchime/huiyuan/ui/AIModel;Lkotlin/jvm/functions/Function1;ZLandroidx/compose/runtime/Composer;II)V", "modelAccent", "Landroidx/compose/ui/graphics/Color;", "model", "(Lcom/luchime/huiyuan/ui/AIModel;)J", "heroEnglish", "heroSummary", "QuickPromptRow", "(Ljava/util/List;ZLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "ModelAvatar", "MessageBubble", "message", "Lcom/luchime/huiyuan/ui/TimelineItem$Message;", "favorite", "onCopy", "onShare", "(Lcom/luchime/huiyuan/ui/TimelineItem$Message;ZLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "MessageAction", "text", "onClick", "(Ljava/lang/String;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "ThinkLogBubble", "log", "Lcom/luchime/huiyuan/ui/TimelineItem$ThinkLog;", "(Lcom/luchime/huiyuan/ui/TimelineItem$ThinkLog;Landroidx/compose/runtime/Composer;I)V", "Composer", "(Lcom/luchime/huiyuan/ui/AIModel;Lkotlin/jvm/functions/Function1;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;ZLkotlin/jvm/functions/Function0;ZLandroidx/compose/runtime/Composer;I)V", "ModeChip", "color", "active", "ModeChip-8V94_ZQ", "(Ljava/lang/String;JZZLkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "app", "shouldFollowOutput", "showClearDialog", "headerCollapseProgress"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class ChatScreenKt {
    private static final List<String> questionPool = CollectionsKt.listOf((Object[]) new String[]{"怎么提升认知？", "为什么认知越高越孤独？", "如何打破思维茧房？", "我想创业该注意什么？", "小成本创业怎么起步？", "怎么判断项目能不能跑通？", "AI 会取代我吗？", "普通人怎么用好 AI？", "怎么用 AI 提升效率？", "如何变得有钱？", "消费降级怎么守住钱袋子？", "普通人有必要理财吗？", "总是焦虑怎么办？", "35岁被裁员了怎么办？", "父母一直催婚我好烦怎么办？", "抓手是什么意思？", "怎么打通业务闭环？", "ROI 和北极星指标怎么定？", "内耗严重怎么破？", "怎么搞定难相处的人？", "拖延症怎么治？", "想得多做得少怎么办？", "如何坚持长期主义？", "怎么走出迷茫？"});
    private static final List<String> piaoQuestionPool = CollectionsKt.listOf((Object[]) new String[]{"朴AI，你是谁？", "deskpark主场是什么？", "电脑装机应该先选什么？", "Linux日常使用怎么入门？", "刷机之前要注意什么？", "怎么排查电脑性能瓶颈？", "超声波定向扬声器是什么？", "桌公园乐队有哪些成员？", "为什么喜欢热河路？", "李智能推荐哪首歌？", "玉兰路蛋炒饭怎么样？", "塔斯汀什么值得吃？", "加班熬夜怎么扛？", "最近有点烦，陪我聊聊", "帮我朴一朴这个项目"});
    private static final List<String> guiguiQuestionPool = CollectionsKt.listOf((Object[]) new String[]{"黄喉小青龟怎么养？", "乌龟腐皮怎么办？", "龟苗怎么过冬？", "RoboMaster比赛规则是什么？", "RM步兵和英雄怎么分工？", "怎么做自瞄视觉？", "PCB电源设计要注意什么？", "STM32怎么入门？", "CAN总线为什么抗干扰？", "自动泡茶机怎么控温？", "土家语怎么做Whisper对齐？", "西兰卡普是什么？", "跟我说句甜狗语录", "怎么哄喜欢的人？", "龟龟会什么？"});
    private static final List<String> tangoQuestionPool = CollectionsKt.listOf((Object[]) new String[]{"Linux内核怎么入门？", "Shell脚本怎么写？", "systemd是什么？", "C语言指针怎么搞懂？", "malloc和free怎么用？", "段错误怎么调试？", "艾尔登法环怎么打？", "只狼弹反有什么技巧？", "机械键盘选什么轴？", "树莓派能干什么？", "吃什么？", "蛋炒饭怎么做好吃？", "没钱了怎么办？", "长沙美食地图", "探戈你会什么？"});

    /* JADX INFO: compiled from: ChatScreen.kt */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[AIModel.values().length];
            try {
                iArr[AIModel.HUIYUAN.ordinal()] = 1;
            } catch (NoSuchFieldError e) {
            }
            try {
                iArr[AIModel.PIAO.ordinal()] = 2;
            } catch (NoSuchFieldError e2) {
            }
            try {
                iArr[AIModel.GUIGUI.ordinal()] = 3;
            } catch (NoSuchFieldError e3) {
            }
            try {
                iArr[AIModel.TANGO.ordinal()] = 4;
            } catch (NoSuchFieldError e4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    static final Unit ChatScreen$lambda$54(AIModel aIModel, Function1 function1, List list, String str, int i, boolean z, boolean z2, Set set, Function1 function2, Function0 function0, Function1 function3, Function0 function4, Function0 function5, Function0 function6, Function2 function7, Function0 function8, int i2, int i3, Composer composer, int i4) {
        ChatScreen(aIModel, function1, list, str, i, z, z2, set, function2, function0, function3, function4, function5, function6, function7, function8, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), RecomposeScopeImplKt.updateChangedFlags(i3));
        return Unit.INSTANCE;
    }

    static final Unit CollapsingModelHeader$lambda$59(AIModel aIModel, float f, Modifier modifier, int i, int i2, Composer composer, int i3) {
        CollapsingModelHeader(aIModel, f, modifier, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    static final Unit Composer$lambda$137(AIModel aIModel, Function1 function1, String str, Function1 function2, Function0 function0, Function0 function3, boolean z, Function0 function4, boolean z2, int i, Composer composer, int i2) {
        Composer(aIModel, function1, str, function2, function0, function3, z, function4, z2, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    static final Unit ConversationToolbar$lambda$69(int i, boolean z, Function0 function0, int i2, Composer composer, int i3) {
        ConversationToolbar(i, z, function0, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
        return Unit.INSTANCE;
    }

    static final Unit HeroHeader$lambda$63(AIModel aIModel, Function1 function1, boolean z, int i, Composer composer, int i2) {
        HeroHeader(aIModel, function1, z, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    static final Unit LandscapePromptPanel$lambda$82(AIModel aIModel, Function1 function1, List list, boolean z, Function1 function2, Function0 function0, int i, Composer composer, int i2) {
        LandscapePromptPanel(aIModel, function1, list, z, function2, function0, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    static final Unit MarqueeStrip$lambda$66(AIModel aIModel, int i, Composer composer, int i2) {
        MarqueeStrip(aIModel, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    static final Unit MessageAction$lambda$103(String str, Function0 function0, int i, Composer composer, int i2) {
        MessageAction(str, function0, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    static final Unit MessageBubble$lambda$102(TimelineItem.Message message, boolean z, Function0 function0, Function0 function1, Function0 function2, int i, Composer composer, int i2) {
        MessageBubble(message, z, function0, function1, function2, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    static final Unit ModeChip_8V94_ZQ$lambda$138(String str, long j, boolean z, boolean z2, Function0 function0, int i, int i2, Composer composer, int i3) {
        m7402ModeChip8V94_ZQ(str, j, z, z2, function0, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    static final Unit ModelAvatar$lambda$97(AIModel aIModel, int i, Composer composer, int i2) {
        ModelAvatar(aIModel, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    static final Unit ModelSelector$lambda$87(AIModel aIModel, Function1 function1, boolean z, int i, int i2, Composer composer, int i3) {
        ModelSelector(aIModel, function1, z, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    static final Unit QuickPromptRow$lambda$95(List list, boolean z, Function1 function1, Function0 function0, int i, Composer composer, int i2) {
        QuickPromptRow(list, z, function1, function0, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    static final Unit ThinkLogBubble$lambda$108(TimelineItem.ThinkLog thinkLog, int i, Composer composer, int i2) {
        ThinkLogBubble(thinkLog, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:187:0x0361  */
    /* JADX WARN: Code duplicated, block: B:188:0x036a  */
    /* JADX WARN: Code duplicated, block: B:191:0x0386  */
    /* JADX WARN: Code duplicated, block: B:195:0x03dc  */
    /* JADX WARN: Code duplicated, block: B:196:0x03f5  */
    /* JADX WARN: Code duplicated, block: B:199:0x041b  */
    /* JADX WARN: Code duplicated, block: B:200:0x042e  */
    /* JADX WARN: Code duplicated, block: B:203:0x045c  */
    /* JADX WARN: Code duplicated, block: B:206:0x0467  */
    /* JADX WARN: Code duplicated, block: B:207:0x046a  */
    /* JADX WARN: Code duplicated, block: B:211:0x04a8  */
    /* JADX WARN: Code duplicated, block: B:215:0x04b6 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:219:0x04dd  */
    /* JADX WARN: Code duplicated, block: B:221:0x0564  */
    /* JADX WARN: Code duplicated, block: B:224:0x0570  */
    /* JADX WARN: Code duplicated, block: B:225:0x0574  */
    /* JADX WARN: Code duplicated, block: B:228:0x05a3  */
    /* JADX WARN: Code duplicated, block: B:231:0x05b6  */
    /* JADX WARN: Code duplicated, block: B:232:0x05b9  */
    /* JADX WARN: Code duplicated, block: B:236:0x06d6  */
    /* JADX WARN: Code duplicated, block: B:239:0x06e2  */
    /* JADX WARN: Code duplicated, block: B:240:0x06e6  */
    /* JADX WARN: Code duplicated, block: B:243:0x0712  */
    /* JADX WARN: Code duplicated, block: B:246:0x0725  */
    /* JADX WARN: Code duplicated, block: B:247:0x0728  */
    /* JADX WARN: Code duplicated, block: B:251:0x077d  */
    /* JADX WARN: Code duplicated, block: B:254:0x0788  */
    /* JADX WARN: Code duplicated, block: B:257:0x0793  */
    /* JADX WARN: Code duplicated, block: B:266:0x07d0  */
    /* JADX WARN: Code duplicated, block: B:267:0x07e0  */
    /* JADX WARN: Code duplicated, block: B:270:0x0834  */
    /* JADX WARN: Code duplicated, block: B:271:0x0836  */
    /* JADX WARN: Code duplicated, block: B:274:0x0844  */
    /* JADX WARN: Code duplicated, block: B:278:0x0852 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:282:0x089d  */
    /* JADX WARN: Code duplicated, block: B:283:0x08a0  */
    /* JADX WARN: Code duplicated, block: B:286:0x08b0  */
    /* JADX WARN: Code duplicated, block: B:289:0x08bb  */
    /* JADX WARN: Code duplicated, block: B:290:0x08c0  */
    /* JADX WARN: Code duplicated, block: B:293:0x0967  */
    /* JADX WARN: Code duplicated, block: B:295:0x09e8  */
    /* JADX WARN: Code duplicated, block: B:298:0x09f4  */
    /* JADX WARN: Code duplicated, block: B:299:0x09f8  */
    /* JADX WARN: Code duplicated, block: B:302:0x0a25  */
    /* JADX WARN: Code duplicated, block: B:306:0x0a3b A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:310:0x0b05  */
    /* JADX WARN: Code duplicated, block: B:313:0x0b11  */
    /* JADX WARN: Code duplicated, block: B:314:0x0b15  */
    /* JADX WARN: Code duplicated, block: B:317:0x0b43  */
    /* JADX WARN: Code duplicated, block: B:320:0x0b56  */
    /* JADX WARN: Code duplicated, block: B:321:0x0b59  */
    /* JADX WARN: Code duplicated, block: B:325:0x0bda  */
    /* JADX WARN: Code duplicated, block: B:326:0x0bdc  */
    /* JADX WARN: Code duplicated, block: B:329:0x0be3  */
    /* JADX WARN: Code duplicated, block: B:330:0x0be5  */
    /* JADX WARN: Code duplicated, block: B:333:0x0bed  */
    /* JADX WARN: Code duplicated, block: B:334:0x0bef  */
    /* JADX WARN: Code duplicated, block: B:337:0x0c0a  */
    /* JADX WARN: Code duplicated, block: B:338:0x0c0c  */
    /* JADX WARN: Code duplicated, block: B:341:0x0c1c  */
    /* JADX WARN: Code duplicated, block: B:344:0x0c27  */
    /* JADX WARN: Code duplicated, block: B:345:0x0c51  */
    /* JADX WARN: Code duplicated, block: B:349:0x0ce6  */
    /* JADX WARN: Code duplicated, block: B:350:0x0ce9  */
    /* JADX WARN: Code duplicated, block: B:353:0x0cf6  */
    /* JADX WARN: Code duplicated, block: B:357:0x0d04  */
    /* JADX WARN: Code duplicated, block: B:361:0x0db0  */
    /* JADX WARN: Code duplicated, block: B:363:0x0de1  */
    /* JADX WARN: Code duplicated, block: B:364:0x0def  */
    /* JADX WARN: Code duplicated, block: B:366:0x0e4d  */
    /* JADX WARN: Code duplicated, block: B:369:0x0e61  */
    /* JADX WARN: Code duplicated, block: B:389:0x07ab A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:390:0x07a7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:391:0x07a3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:394:0x078d A[SYNTHETIC] */
    public static final void ChatScreen(final AIModel selectedModel, final Function1<? super AIModel, Unit> onModelSelected, final List<? extends TimelineItem> timeline, final String input, final int chipRound, final boolean isGenerating, final boolean isLandscape, final Set<String> favorites, final Function1<? super String, Unit> onInputChange, final Function0<Unit> onSend, final Function1<? super String, Unit> onPrompt, final Function0<Unit> onRandom, final Function0<Unit> onStopGeneration, final Function0<Unit> onRefreshPrompts, final Function2<? super String, ? super String, Unit> onToggleFavorite, final Function0<Unit> onClearConversation, Composer $composer, final int $changed, final int $changed1) {
        int $dirty1;
        final Function0<Unit> function0;
        List<String> list;
        Object objPrevious;
        TimelineItem.Message message;
        Long latestUserMessageId;
        Object objRememberedValue;
        final AppHaptics haptics;
        Object objRememberedValue2;
        final MutableState showClearDialog$delegate;
        Object objRememberedValue3;
        State headerCollapseProgress$delegate;
        boolean zChanged;
        Object objRememberedValue4;
        Composer $composer2;
        Composer $composer3;
        boolean zChanged2;
        Object objRememberedValue5;
        Composer $composer4;
        String str;
        int currentCompositeKeyHash;
        Function0<ComposeUiNode> constructor;
        Composer composerM3808constructorimpl;
        int currentCompositeKeyHash2;
        CompositionLocalMap currentCompositionLocalMap;
        Function0<ComposeUiNode> constructor2;
        Composer composerM3808constructorimpl2;
        CompositionLocalMap compositionLocalMap;
        Function0<ComposeUiNode> function1;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        Object objRememberedValue6;
        Composer composer;
        Composer composer2;
        MutableState showClearDialog$delegate2;
        Composer composer3;
        boolean z6;
        boolean z7;
        Object objRememberedValue7;
        MutableState showClearDialog$delegate3;
        Composer composer4;
        Object objRememberedValue8;
        final MutableState showClearDialog$delegate4;
        int currentCompositeKeyHash3;
        CompositionLocalMap currentCompositionLocalMap2;
        Function0<ComposeUiNode> constructor3;
        Composer composerM3808constructorimpl3;
        CompositionLocalMap compositionLocalMap2;
        String str2;
        int currentCompositeKeyHash4;
        Function0<ComposeUiNode> constructor4;
        Composer composerM3808constructorimpl4;
        Composer composer5;
        Composer composer6;
        List<? extends TimelineItem> list2;
        int i;
        Iterator it;
        int i2;
        Object objRememberedValue9;
        boolean z8;
        boolean z9;
        Object objRememberedValue10;
        boolean z10;
        boolean z11;
        Object objRememberedValue11;
        Composer composer7;
        Intrinsics.checkNotNullParameter(selectedModel, "selectedModel");
        Intrinsics.checkNotNullParameter(onModelSelected, "onModelSelected");
        Intrinsics.checkNotNullParameter(timeline, "timeline");
        Intrinsics.checkNotNullParameter(input, "input");
        Intrinsics.checkNotNullParameter(favorites, "favorites");
        Intrinsics.checkNotNullParameter(onInputChange, "onInputChange");
        Intrinsics.checkNotNullParameter(onSend, "onSend");
        Intrinsics.checkNotNullParameter(onPrompt, "onPrompt");
        Intrinsics.checkNotNullParameter(onRandom, "onRandom");
        Intrinsics.checkNotNullParameter(onStopGeneration, "onStopGeneration");
        Intrinsics.checkNotNullParameter(onRefreshPrompts, "onRefreshPrompts");
        Intrinsics.checkNotNullParameter(onToggleFavorite, "onToggleFavorite");
        Intrinsics.checkNotNullParameter(onClearConversation, "onClearConversation");
        Composer $composer5 = $composer.startRestartGroup(-1639379255);
        ComposerKt.sourceInformation($composer5, "C(ChatScreen)P(14,7,15,2!1,3,4!1,6,11,8,9,12,10,13)125@5031L7,126@5080L7,127@5108L23,128@5159L287,146@5887L262,153@6184L7,154@6219L34,155@6288L241,165@6603L214,165@6535L282,172@6859L222,172@6823L258:ChatScreen.kt#cyjvf");
        int $dirty2 = $changed1;
        int $dirty = ($changed & 6) == 0 ? $changed | ($composer5.changed(selectedModel.ordinal()) ? 4 : 2) : $changed;
        int $dirty3 = ($changed & 48) == 0 ? $dirty | ($composer5.changedInstance(onModelSelected) ? 32 : 16) : $dirty;
        if (($changed & 384) == 0) {
            $dirty3 |= $composer5.changedInstance(timeline) ? 256 : 128;
        }
        if (($changed & 3072) == 0) {
            $dirty3 |= $composer5.changed(input) ? 2048 : 1024;
        }
        if (($changed & 24576) == 0) {
            $dirty3 |= $composer5.changed(chipRound) ? 16384 : 8192;
        }
        if (($changed & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
            $dirty3 |= $composer5.changed(isGenerating) ? 131072 : 65536;
        }
        if (($changed & 1572864) == 0) {
            $dirty3 |= $composer5.changed(isLandscape) ? 1048576 : 524288;
        }
        if (($changed & 12582912) == 0) {
            $dirty3 |= $composer5.changedInstance(favorites) ? 8388608 : 4194304;
        }
        if (($changed & 100663296) == 0) {
            $dirty3 |= $composer5.changedInstance(onInputChange) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
        }
        if (($changed & 805306368) == 0) {
            $dirty3 |= $composer5.changedInstance(onSend) ? 536870912 : 268435456;
        }
        int $dirty4 = $dirty3;
        if (($changed1 & 6) == 0) {
            $dirty2 |= $composer5.changedInstance(onPrompt) ? 4 : 2;
        }
        if (($changed1 & 48) == 0) {
            $dirty2 |= $composer5.changedInstance(onRandom) ? 32 : 16;
        }
        if (($changed1 & 384) == 0) {
            $dirty2 |= $composer5.changedInstance(onStopGeneration) ? 256 : 128;
        }
        if (($changed1 & 3072) == 0) {
            $dirty2 |= $composer5.changedInstance(onRefreshPrompts) ? 2048 : 1024;
        }
        if (($changed1 & 24576) == 0) {
            $dirty2 |= $composer5.changedInstance(onToggleFavorite) ? 16384 : 8192;
        }
        if ((196608 & $changed1) == 0) {
            $dirty2 |= $composer5.changedInstance(onClearConversation) ? 131072 : 65536;
        }
        int $dirty5 = $dirty2;
        if (!$composer5.shouldExecute((($dirty4 & 306783379) == 306783378 && (74899 & $dirty5) == 74898) ? false : true, $dirty4 & 1)) {
            $dirty1 = $dirty5;
            function0 = onSend;
            $composer5.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1639379255, $dirty4, $dirty5, "com.luchime.huiyuan.ui.ChatScreen (ChatScreen.kt:124)");
            }
            ProvidableCompositionLocal<Context> localContext = AndroidCompositionLocals_androidKt.getLocalContext();
            ComposerKt.sourceInformationMarkerStart($composer5, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
            Object objConsume = $composer5.consume(localContext);
            ComposerKt.sourceInformationMarkerEnd($composer5);
            final Context context = (Context) objConsume;
            ProvidableCompositionLocal<FocusManager> localFocusManager = CompositionLocalsKt.getLocalFocusManager();
            ComposerKt.sourceInformationMarkerStart($composer5, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
            Object objConsume2 = $composer5.consume(localFocusManager);
            ComposerKt.sourceInformationMarkerEnd($composer5);
            final FocusManager focusManager = (FocusManager) objConsume2;
            final LazyListState listState = LazyListStateKt.rememberLazyListState(0, 0, $composer5, 0, 3);
            ComposerKt.sourceInformationMarkerStart($composer5, 809556040, "CC(remember):ChatScreen.kt#9igjgp");
            boolean z12 = (($dirty4 & 57344) == 16384) | (($dirty4 & 14) == 4);
            Object objRememberedValue12 = $composer5.rememberedValue();
            if (z12 || objRememberedValue12 == Composer.INSTANCE.getEmpty()) {
                switch (WhenMappings.$EnumSwitchMapping$0[selectedModel.ordinal()]) {
                    case 1:
                        list = questionPool;
                        break;
                    case 2:
                        list = piaoQuestionPool;
                        break;
                    case 3:
                        list = guiguiQuestionPool;
                        break;
                    case 4:
                        list = tangoQuestionPool;
                        break;
                    default:
                        throw new NoWhenBranchMatchedException();
                }
                objRememberedValue12 = CollectionsKt.take(CollectionsKt.shuffled(list), 6);
                $composer5.updateRememberedValue(objRememberedValue12);
            }
            List visibleQuestions = (List) objRememberedValue12;
            ComposerKt.sourceInformationMarkerEnd($composer5);
            int size = 0;
            for (TimelineItem timelineItem : timeline) {
                List visibleQuestions2 = visibleQuestions;
                size += timelineItem instanceof TimelineItem.ThinkLog ? ((TimelineItem.ThinkLog) timelineItem).getLines().size() : 0;
                visibleQuestions = visibleQuestions2;
            }
            List visibleQuestions3 = visibleQuestions;
            int visibleThinkLines = size;
            Iterator it2 = timeline.iterator();
            int length = 0;
            while (it2.hasNext()) {
                TimelineItem timelineItem2 = (TimelineItem) it2.next();
                Iterator it3 = it2;
                length += ((timelineItem2 instanceof TimelineItem.Message) && ((TimelineItem.Message) timelineItem2).isStreaming()) ? ((TimelineItem.Message) timelineItem2).getText().length() / 8 : 0;
                it2 = it3;
            }
            int streamingProgress = length;
            List<? extends TimelineItem> list3 = timeline;
            int i3 = 0;
            Collection arrayList = new ArrayList();
            for (Object obj : list3) {
                Iterable iterable = list3;
                int i4 = i3;
                if (obj instanceof TimelineItem.Message) {
                    arrayList.add(obj);
                }
                list3 = iterable;
                i3 = i4;
            }
            List list4 = (List) arrayList;
            ListIterator listIterator = list4.listIterator(list4.size());
            do {
                if (listIterator.hasPrevious()) {
                    objPrevious = listIterator.previous();
                } else {
                    objPrevious = null;
                }
                message = (TimelineItem.Message) objPrevious;
                if (message != null) {
                    latestUserMessageId = Long.valueOf(message.getId());
                } else {
                    latestUserMessageId = null;
                }
                ComposerKt.sourceInformationMarkerStart($composer5, 809579311, "CC(remember):ChatScreen.kt#9igjgp");
                objRememberedValue = $composer5.rememberedValue();
                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    Object objDerivedStateOf = SnapshotStateKt.derivedStateOf(new Function0() { // from class: com.luchime.huiyuan.ui.ChatScreenKt$$ExternalSyntheticLambda29
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return Boolean.valueOf(ChatScreenKt.ChatScreen$lambda$5$lambda$4(listState));
                        }
                    });
                    $composer5.updateRememberedValue(objDerivedStateOf);
                    objRememberedValue = objDerivedStateOf;
                }
                State shouldFollowOutput$delegate = (State) objRememberedValue;
                ComposerKt.sourceInformationMarkerEnd($composer5);
                ProvidableCompositionLocal<AppHaptics> localAppHaptics = AppHapticsKt.getLocalAppHaptics();
                ComposerKt.sourceInformationMarkerStart($composer5, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
                Object objConsume3 = $composer5.consume(localAppHaptics);
                ComposerKt.sourceInformationMarkerEnd($composer5);
                haptics = (AppHaptics) objConsume3;
                ComposerKt.sourceInformationMarkerStart($composer5, 809589707, "CC(remember):ChatScreen.kt#9igjgp");
                objRememberedValue2 = $composer5.rememberedValue();
                if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, null, 2, null);
                    $composer5.updateRememberedValue(objRememberedValue2);
                }
                showClearDialog$delegate = (MutableState) objRememberedValue2;
                ComposerKt.sourceInformationMarkerEnd($composer5);
                ComposerKt.sourceInformationMarkerStart($composer5, 809592122, "CC(remember):ChatScreen.kt#9igjgp");
                objRememberedValue3 = $composer5.rememberedValue();
                if (objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue3 = SnapshotStateKt.derivedStateOf(new Function0() { // from class: com.luchime.huiyuan.ui.ChatScreenKt$$ExternalSyntheticLambda31
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return Float.valueOf(ChatScreenKt.ChatScreen$lambda$11$lambda$10(listState));
                        }
                    });
                    $composer5.updateRememberedValue(objRememberedValue3);
                }
                headerCollapseProgress$delegate = (State) objRememberedValue3;
                ComposerKt.sourceInformationMarkerEnd($composer5);
                Integer numValueOf = Integer.valueOf(timeline.size());
                Integer numValueOf2 = Integer.valueOf(visibleThinkLines);
                Integer numValueOf3 = Integer.valueOf(streamingProgress);
                ComposerKt.sourceInformationMarkerStart($composer5, 809602175, "CC(remember):ChatScreen.kt#9igjgp");
                zChanged = $composer5.changed(listState);
                objRememberedValue4 = $composer5.rememberedValue();
                if (!zChanged) {
                    $composer2 = $composer5;
                    if (objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                    }
                    ComposerKt.sourceInformationMarkerEnd($composer2);
                    $composer3 = $composer2;
                    EffectsKt.LaunchedEffect(numValueOf, numValueOf2, numValueOf3, (Function2) objRememberedValue4, $composer3, 0);
                    ComposerKt.sourceInformationMarkerStart($composer3, 809610375, "CC(remember):ChatScreen.kt#9igjgp");
                    zChanged2 = $composer3.changed(latestUserMessageId) | $composer3.changed(listState);
                    objRememberedValue5 = $composer3.rememberedValue();
                    if (!zChanged2 || objRememberedValue5 == Composer.INSTANCE.getEmpty()) {
                        Object obj2 = (Function2) new ChatScreenKt$ChatScreen$2$1(latestUserMessageId, listState, null);
                        $composer3.updateRememberedValue(obj2);
                        objRememberedValue5 = obj2;
                    }
                    ComposerKt.sourceInformationMarkerEnd($composer3);
                    EffectsKt.LaunchedEffect(latestUserMessageId, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue5, $composer3, 0);
                    if (isLandscape) {
                        $composer3.startReplaceGroup(-671567716);
                        ComposerKt.sourceInformation($composer3, "180@7114L2509");
                        Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null);
                        ComposerKt.sourceInformationMarkerStart($composer3, 693286680, "CC(Row)P(2,1,3)99@5124L58,100@5187L130:Row.kt#2w3rfo");
                        MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), Alignment.INSTANCE.getTop(), $composer3, ((6 >> 3) & 14) | ((6 >> 3) & 112));
                        ComposerKt.sourceInformationMarkerStart($composer3, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                        currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash($composer3, 0);
                        currentCompositionLocalMap2 = $composer3.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier($composer3, modifierFillMaxSize$default);
                        constructor3 = ComposeUiNode.INSTANCE.getConstructor();
                        int i5 = ((((6 << 3) & 112) << 6) & 896) | 6;
                        ComposerKt.sourceInformationMarkerStart($composer3, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
                        if (!($composer3.getApplier() instanceof Applier)) {
                            ComposablesKt.invalidApplier();
                        }
                        $composer3.startReusableNode();
                        if ($composer3.getInserting()) {
                            $composer3.createNode(constructor3);
                        } else {
                            $composer3.useNode();
                        }
                        composerM3808constructorimpl3 = Updater.m3808constructorimpl($composer3);
                        Updater.m3815setimpl(composerM3808constructorimpl3, measurePolicyRowMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                        Updater.m3815setimpl(composerM3808constructorimpl3, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                        if (composerM3808constructorimpl3.getInserting()) {
                            compositionLocalMap2 = currentCompositionLocalMap2;
                            str2 = "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp";
                        } else {
                            compositionLocalMap2 = currentCompositionLocalMap2;
                            str2 = "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp";
                            if (!Intrinsics.areEqual(composerM3808constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                            }
                            Updater.m3815setimpl(composerM3808constructorimpl3, modifierMaterializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
                            int i6 = (i5 >> 6) & 14;
                            ComposerKt.sourceInformationMarkerStart($composer3, -407735110, "C101@5232L9:Row.kt#2w3rfo");
                            int i7 = ((6 >> 6) & 112) | 6;
                            RowScope rowScope = RowScopeInstance.INSTANCE;
                            ComposerKt.sourceInformationMarkerStart($composer3, -575633747, "C181@7167L302,189@7482L2131:ChatScreen.kt#cyjvf");
                            $composer4 = $composer3;
                            LandscapePromptPanel(selectedModel, onModelSelected, visibleQuestions3, !isGenerating, onPrompt, onRefreshPrompts, $composer3, ($dirty4 & 14) | ($dirty4 & 112) | (($dirty5 << 12) & 57344) | (($dirty5 << 6) & 458752));
                            Modifier modifierStatusBarsPadding = WindowInsetsPadding_androidKt.statusBarsPadding(SizeKt.fillMaxHeight$default(RowScope.weight$default(rowScope, Modifier.INSTANCE, 1.0f, false, 2, null), 0.0f, 1, null));
                            ComposerKt.sourceInformationMarkerStart($composer3, -483455358, "CC(Column)P(2,3,1)87@4442L61,88@4508L133:Column.kt#2w3rfo");
                            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), $composer3, ((0 >> 3) & 14) | ((0 >> 3) & 112));
                            ComposerKt.sourceInformationMarkerStart($composer3, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                            currentCompositeKeyHash4 = ComposablesKt.getCurrentCompositeKeyHash($composer3, 0);
                            CompositionLocalMap currentCompositionLocalMap3 = $composer3.getCurrentCompositionLocalMap();
                            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier($composer3, modifierStatusBarsPadding);
                            constructor4 = ComposeUiNode.INSTANCE.getConstructor();
                            int i8 = ((((0 << 3) & 112) << 6) & 896) | 6;
                            ComposerKt.sourceInformationMarkerStart($composer3, -692256719, str2);
                            if (!($composer3.getApplier() instanceof Applier)) {
                                ComposablesKt.invalidApplier();
                            }
                            $composer3.startReusableNode();
                            if ($composer3.getInserting()) {
                                $composer3.createNode(constructor4);
                            } else {
                                $composer3.useNode();
                            }
                            composerM3808constructorimpl4 = Updater.m3808constructorimpl($composer3);
                            Updater.m3815setimpl(composerM3808constructorimpl4, measurePolicyColumnMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                            Updater.m3815setimpl(composerM3808constructorimpl4, currentCompositionLocalMap3, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                            if (!composerM3808constructorimpl4.getInserting()) {
                                composer5 = $composer3;
                                if (!Intrinsics.areEqual(composerM3808constructorimpl4.rememberedValue(), Integer.valueOf(currentCompositeKeyHash4))) {
                                }
                                Updater.m3815setimpl(composerM3808constructorimpl4, modifierMaterializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
                                int i9 = (i8 >> 6) & 14;
                                composer6 = composer5;
                                ComposerKt.sourceInformationMarkerStart(composer6, -384672921, "C89@4556L9:Column.kt#2w3rfo");
                                int i10 = ((0 >> 6) & 112) | 6;
                                ColumnScope columnScope = ColumnScopeInstance.INSTANCE;
                                ComposerKt.sourceInformationMarkerStart(composer6, -1468478694, "C198@7837L26,195@7668L213,204@8085L959,200@7898L1146,228@9292L106,223@9061L538:ChatScreen.kt#cyjvf");
                                list2 = timeline;
                                if ((list2 instanceof Collection) || !list2.isEmpty()) {
                                    i = 0;
                                    it = list2.iterator();
                                    while (it.hasNext()) {
                                        i2 = i;
                                        if (((TimelineItem) it.next()) instanceof TimelineItem.Message) {
                                            i = i2 + 1;
                                            if (i < 0) {
                                                CollectionsKt.throwCountOverflow();
                                            }
                                        } else {
                                            i = i2;
                                        }
                                    }
                                } else {
                                    i = 0;
                                }
                                ComposerKt.sourceInformationMarkerStart(composer6, 1615201208, "CC(remember):ChatScreen.kt#9igjgp");
                                objRememberedValue9 = composer6.rememberedValue();
                                if (objRememberedValue9 == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue9 = new Function0() { // from class: com.luchime.huiyuan.ui.ChatScreenKt$$ExternalSyntheticLambda32
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            return ChatScreenKt.ChatScreen$lambda$28$lambda$27$lambda$17$lambda$16(showClearDialog$delegate);
                                        }
                                    };
                                    composer6.updateRememberedValue(objRememberedValue9);
                                }
                                ComposerKt.sourceInformationMarkerEnd(composer6);
                                ConversationToolbar(i, true, (Function0) objRememberedValue9, composer6, 432);
                                Modifier modifierWeight$default = ColumnScope.weight$default(columnScope, Modifier.INSTANCE, 1.0f, false, 2, null);
                                PaddingValues paddingValuesM722PaddingValuesa9UjIt4$default = PaddingKt.m722PaddingValuesa9UjIt4$default(0.0f, 0.0f, 0.0f, Dp.m6973constructorimpl(8), 7, null);
                                ComposerKt.sourceInformationMarkerStart(composer6, 1615210077, "CC(remember):ChatScreen.kt#9igjgp");
                                boolean zChangedInstance = $composer4.changedInstance(timeline) | $composer4.changedInstance(favorites) | $composer4.changedInstance(context);
                                if (($dirty5 & 57344) == 16384) {
                                    z8 = true;
                                } else {
                                    z8 = false;
                                }
                                z9 = zChangedInstance | z8;
                                objRememberedValue10 = composer6.rememberedValue();
                                if (!z9 || objRememberedValue10 == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue10 = new Function1() { // from class: com.luchime.huiyuan.ui.ChatScreenKt$$ExternalSyntheticLambda33
                                        @Override // kotlin.jvm.functions.Function1
                                        public final Object invoke(Object obj3) {
                                            return ChatScreenKt.ChatScreen$lambda$28$lambda$27$lambda$24$lambda$23(timeline, favorites, context, onToggleFavorite, (LazyListScope) obj3);
                                        }
                                    };
                                    composer6.updateRememberedValue(objRememberedValue10);
                                }
                                ComposerKt.sourceInformationMarkerEnd(composer6);
                                LazyDslKt.LazyColumn(modifierWeight$default, listState, paddingValuesM722PaddingValuesa9UjIt4$default, false, null, null, null, false, null, (Function1) objRememberedValue10, composer6, 384, 504);
                                ComposerKt.sourceInformationMarkerStart(composer6, 1615247848, "CC(remember):ChatScreen.kt#9igjgp");
                                boolean zChangedInstance2 = $composer4.changedInstance(focusManager);
                                if (($dirty4 & 1879048192) == 536870912) {
                                    z10 = true;
                                } else {
                                    z10 = false;
                                }
                                z11 = zChangedInstance2 | z10;
                                objRememberedValue11 = composer6.rememberedValue();
                                if (!z11) {
                                    composer7 = composer6;
                                    if (objRememberedValue11 == Composer.INSTANCE.getEmpty()) {
                                    }
                                    ComposerKt.sourceInformationMarkerEnd(composer7);
                                    str = "CC(remember):ChatScreen.kt#9igjgp";
                                    Composer composer8 = composer7;
                                    Composer(selectedModel, onModelSelected, input, onInputChange, (Function0) objRememberedValue11, onRandom, isGenerating, onStopGeneration, true, composer8, ($dirty4 & 14) | 100663296 | ($dirty4 & 112) | (($dirty4 >> 3) & 896) | (($dirty4 >> 15) & 7168) | (($dirty5 << 12) & 458752) | (($dirty4 << 3) & 3670016) | (($dirty5 << 15) & 29360128));
                                    ComposerKt.sourceInformationMarkerEnd(composer8);
                                    ComposerKt.sourceInformationMarkerEnd(composer6);
                                    composer5.endNode();
                                    ComposerKt.sourceInformationMarkerEnd(composer5);
                                    ComposerKt.sourceInformationMarkerEnd(composer5);
                                    ComposerKt.sourceInformationMarkerEnd(composer5);
                                    ComposerKt.sourceInformationMarkerEnd($composer3);
                                    ComposerKt.sourceInformationMarkerEnd($composer3);
                                    $composer3.endNode();
                                    ComposerKt.sourceInformationMarkerEnd($composer3);
                                    ComposerKt.sourceInformationMarkerEnd($composer3);
                                    ComposerKt.sourceInformationMarkerEnd($composer3);
                                    $composer4.endReplaceGroup();
                                    function0 = onSend;
                                    showClearDialog$delegate3 = showClearDialog$delegate;
                                    $dirty1 = $dirty5;
                                } else {
                                    composer7 = composer6;
                                }
                                objRememberedValue11 = new Function0() { // from class: com.luchime.huiyuan.ui.ChatScreenKt$$ExternalSyntheticLambda34
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        return ChatScreenKt.ChatScreen$lambda$28$lambda$27$lambda$26$lambda$25(focusManager, onSend);
                                    }
                                };
                                composer6.updateRememberedValue(objRememberedValue11);
                                ComposerKt.sourceInformationMarkerEnd(composer7);
                                str = "CC(remember):ChatScreen.kt#9igjgp";
                                Composer composer9 = composer7;
                                Composer(selectedModel, onModelSelected, input, onInputChange, (Function0) objRememberedValue11, onRandom, isGenerating, onStopGeneration, true, composer9, ($dirty4 & 14) | 100663296 | ($dirty4 & 112) | (($dirty4 >> 3) & 896) | (($dirty4 >> 15) & 7168) | (($dirty5 << 12) & 458752) | (($dirty4 << 3) & 3670016) | (($dirty5 << 15) & 29360128));
                                ComposerKt.sourceInformationMarkerEnd(composer9);
                                ComposerKt.sourceInformationMarkerEnd(composer6);
                                composer5.endNode();
                                ComposerKt.sourceInformationMarkerEnd(composer5);
                                ComposerKt.sourceInformationMarkerEnd(composer5);
                                ComposerKt.sourceInformationMarkerEnd(composer5);
                                ComposerKt.sourceInformationMarkerEnd($composer3);
                                ComposerKt.sourceInformationMarkerEnd($composer3);
                                $composer3.endNode();
                                ComposerKt.sourceInformationMarkerEnd($composer3);
                                ComposerKt.sourceInformationMarkerEnd($composer3);
                                ComposerKt.sourceInformationMarkerEnd($composer3);
                                $composer4.endReplaceGroup();
                                function0 = onSend;
                                showClearDialog$delegate3 = showClearDialog$delegate;
                                $dirty1 = $dirty5;
                            } else {
                                composer5 = $composer3;
                            }
                            composerM3808constructorimpl4.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash4));
                            composerM3808constructorimpl4.apply(Integer.valueOf(currentCompositeKeyHash4), setCompositeKeyHash2);
                            Updater.m3815setimpl(composerM3808constructorimpl4, modifierMaterializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
                            int i11 = (i8 >> 6) & 14;
                            composer6 = composer5;
                            ComposerKt.sourceInformationMarkerStart(composer6, -384672921, "C89@4556L9:Column.kt#2w3rfo");
                            int i12 = ((0 >> 6) & 112) | 6;
                            ColumnScope columnScope2 = ColumnScopeInstance.INSTANCE;
                            ComposerKt.sourceInformationMarkerStart(composer6, -1468478694, "C198@7837L26,195@7668L213,204@8085L959,200@7898L1146,228@9292L106,223@9061L538:ChatScreen.kt#cyjvf");
                            list2 = timeline;
                            if (list2 instanceof Collection) {
                                i = 0;
                                it = list2.iterator();
                                while (it.hasNext()) {
                                    i2 = i;
                                    if (((TimelineItem) it.next()) instanceof TimelineItem.Message) {
                                        i = i2 + 1;
                                        if (i < 0) {
                                            CollectionsKt.throwCountOverflow();
                                        }
                                    } else {
                                        i = i2;
                                    }
                                }
                            } else {
                                i = 0;
                                it = list2.iterator();
                                while (it.hasNext()) {
                                    i2 = i;
                                    if (((TimelineItem) it.next()) instanceof TimelineItem.Message) {
                                        i = i2 + 1;
                                        if (i < 0) {
                                            CollectionsKt.throwCountOverflow();
                                        }
                                    } else {
                                        i = i2;
                                    }
                                }
                            }
                            ComposerKt.sourceInformationMarkerStart(composer6, 1615201208, "CC(remember):ChatScreen.kt#9igjgp");
                            objRememberedValue9 = composer6.rememberedValue();
                            if (objRememberedValue9 == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue9 = new Function0() { // from class: com.luchime.huiyuan.ui.ChatScreenKt$$ExternalSyntheticLambda32
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        return ChatScreenKt.ChatScreen$lambda$28$lambda$27$lambda$17$lambda$16(showClearDialog$delegate);
                                    }
                                };
                                composer6.updateRememberedValue(objRememberedValue9);
                            }
                            ComposerKt.sourceInformationMarkerEnd(composer6);
                            ConversationToolbar(i, true, (Function0) objRememberedValue9, composer6, 432);
                            Modifier modifierWeight$default2 = ColumnScope.weight$default(columnScope2, Modifier.INSTANCE, 1.0f, false, 2, null);
                            PaddingValues paddingValuesM722PaddingValuesa9UjIt4$default2 = PaddingKt.m722PaddingValuesa9UjIt4$default(0.0f, 0.0f, 0.0f, Dp.m6973constructorimpl(8), 7, null);
                            ComposerKt.sourceInformationMarkerStart(composer6, 1615210077, "CC(remember):ChatScreen.kt#9igjgp");
                            boolean zChangedInstance3 = $composer4.changedInstance(timeline) | $composer4.changedInstance(favorites) | $composer4.changedInstance(context);
                            if (($dirty5 & 57344) == 16384) {
                                z8 = true;
                            } else {
                                z8 = false;
                            }
                            z9 = zChangedInstance3 | z8;
                            objRememberedValue10 = composer6.rememberedValue();
                            if (!z9) {
                            }
                            objRememberedValue10 = new Function1() { // from class: com.luchime.huiyuan.ui.ChatScreenKt$$ExternalSyntheticLambda33
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj3) {
                                    return ChatScreenKt.ChatScreen$lambda$28$lambda$27$lambda$24$lambda$23(timeline, favorites, context, onToggleFavorite, (LazyListScope) obj3);
                                }
                            };
                            composer6.updateRememberedValue(objRememberedValue10);
                            ComposerKt.sourceInformationMarkerEnd(composer6);
                            LazyDslKt.LazyColumn(modifierWeight$default2, listState, paddingValuesM722PaddingValuesa9UjIt4$default2, false, null, null, null, false, null, (Function1) objRememberedValue10, composer6, 384, 504);
                            ComposerKt.sourceInformationMarkerStart(composer6, 1615247848, "CC(remember):ChatScreen.kt#9igjgp");
                            boolean zChangedInstance4 = $composer4.changedInstance(focusManager);
                            if (($dirty4 & 1879048192) == 536870912) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            z11 = zChangedInstance4 | z10;
                            objRememberedValue11 = composer6.rememberedValue();
                            if (!z11) {
                                composer7 = composer6;
                                if (objRememberedValue11 == Composer.INSTANCE.getEmpty()) {
                                }
                                ComposerKt.sourceInformationMarkerEnd(composer7);
                                str = "CC(remember):ChatScreen.kt#9igjgp";
                                Composer composer10 = composer7;
                                Composer(selectedModel, onModelSelected, input, onInputChange, (Function0) objRememberedValue11, onRandom, isGenerating, onStopGeneration, true, composer10, ($dirty4 & 14) | 100663296 | ($dirty4 & 112) | (($dirty4 >> 3) & 896) | (($dirty4 >> 15) & 7168) | (($dirty5 << 12) & 458752) | (($dirty4 << 3) & 3670016) | (($dirty5 << 15) & 29360128));
                                ComposerKt.sourceInformationMarkerEnd(composer10);
                                ComposerKt.sourceInformationMarkerEnd(composer6);
                                composer5.endNode();
                                ComposerKt.sourceInformationMarkerEnd(composer5);
                                ComposerKt.sourceInformationMarkerEnd(composer5);
                                ComposerKt.sourceInformationMarkerEnd(composer5);
                                ComposerKt.sourceInformationMarkerEnd($composer3);
                                ComposerKt.sourceInformationMarkerEnd($composer3);
                                $composer3.endNode();
                                ComposerKt.sourceInformationMarkerEnd($composer3);
                                ComposerKt.sourceInformationMarkerEnd($composer3);
                                ComposerKt.sourceInformationMarkerEnd($composer3);
                                $composer4.endReplaceGroup();
                                function0 = onSend;
                                showClearDialog$delegate3 = showClearDialog$delegate;
                                $dirty1 = $dirty5;
                            } else {
                                composer7 = composer6;
                            }
                            objRememberedValue11 = new Function0() { // from class: com.luchime.huiyuan.ui.ChatScreenKt$$ExternalSyntheticLambda34
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return ChatScreenKt.ChatScreen$lambda$28$lambda$27$lambda$26$lambda$25(focusManager, onSend);
                                }
                            };
                            composer6.updateRememberedValue(objRememberedValue11);
                            ComposerKt.sourceInformationMarkerEnd(composer7);
                            str = "CC(remember):ChatScreen.kt#9igjgp";
                            Composer composer11 = composer7;
                            Composer(selectedModel, onModelSelected, input, onInputChange, (Function0) objRememberedValue11, onRandom, isGenerating, onStopGeneration, true, composer11, ($dirty4 & 14) | 100663296 | ($dirty4 & 112) | (($dirty4 >> 3) & 896) | (($dirty4 >> 15) & 7168) | (($dirty5 << 12) & 458752) | (($dirty4 << 3) & 3670016) | (($dirty5 << 15) & 29360128));
                            ComposerKt.sourceInformationMarkerEnd(composer11);
                            ComposerKt.sourceInformationMarkerEnd(composer6);
                            composer5.endNode();
                            ComposerKt.sourceInformationMarkerEnd(composer5);
                            ComposerKt.sourceInformationMarkerEnd(composer5);
                            ComposerKt.sourceInformationMarkerEnd(composer5);
                            ComposerKt.sourceInformationMarkerEnd($composer3);
                            ComposerKt.sourceInformationMarkerEnd($composer3);
                            $composer3.endNode();
                            ComposerKt.sourceInformationMarkerEnd($composer3);
                            ComposerKt.sourceInformationMarkerEnd($composer3);
                            ComposerKt.sourceInformationMarkerEnd($composer3);
                            $composer4.endReplaceGroup();
                            function0 = onSend;
                            showClearDialog$delegate3 = showClearDialog$delegate;
                            $dirty1 = $dirty5;
                        }
                        composerM3808constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                        composerM3808constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash);
                        Updater.m3815setimpl(composerM3808constructorimpl3, modifierMaterializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
                        int i13 = (i5 >> 6) & 14;
                        ComposerKt.sourceInformationMarkerStart($composer3, -407735110, "C101@5232L9:Row.kt#2w3rfo");
                        int i14 = ((6 >> 6) & 112) | 6;
                        RowScope rowScope2 = RowScopeInstance.INSTANCE;
                        ComposerKt.sourceInformationMarkerStart($composer3, -575633747, "C181@7167L302,189@7482L2131:ChatScreen.kt#cyjvf");
                        $composer4 = $composer3;
                        LandscapePromptPanel(selectedModel, onModelSelected, visibleQuestions3, !isGenerating, onPrompt, onRefreshPrompts, $composer3, ($dirty4 & 14) | ($dirty4 & 112) | (($dirty5 << 12) & 57344) | (($dirty5 << 6) & 458752));
                        Modifier modifierStatusBarsPadding2 = WindowInsetsPadding_androidKt.statusBarsPadding(SizeKt.fillMaxHeight$default(RowScope.weight$default(rowScope2, Modifier.INSTANCE, 1.0f, false, 2, null), 0.0f, 1, null));
                        ComposerKt.sourceInformationMarkerStart($composer3, -483455358, "CC(Column)P(2,3,1)87@4442L61,88@4508L133:Column.kt#2w3rfo");
                        MeasurePolicy measurePolicyColumnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), $composer3, ((0 >> 3) & 14) | ((0 >> 3) & 112));
                        ComposerKt.sourceInformationMarkerStart($composer3, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                        currentCompositeKeyHash4 = ComposablesKt.getCurrentCompositeKeyHash($composer3, 0);
                        CompositionLocalMap currentCompositionLocalMap4 = $composer3.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier($composer3, modifierStatusBarsPadding2);
                        constructor4 = ComposeUiNode.INSTANCE.getConstructor();
                        int i15 = ((((0 << 3) & 112) << 6) & 896) | 6;
                        ComposerKt.sourceInformationMarkerStart($composer3, -692256719, str2);
                        if (!($composer3.getApplier() instanceof Applier)) {
                            ComposablesKt.invalidApplier();
                        }
                        $composer3.startReusableNode();
                        if ($composer3.getInserting()) {
                            $composer3.createNode(constructor4);
                        } else {
                            $composer3.useNode();
                        }
                        composerM3808constructorimpl4 = Updater.m3808constructorimpl($composer3);
                        Updater.m3815setimpl(composerM3808constructorimpl4, measurePolicyColumnMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                        Updater.m3815setimpl(composerM3808constructorimpl4, currentCompositionLocalMap4, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                        if (!composerM3808constructorimpl4.getInserting()) {
                            composer5 = $composer3;
                            if (!Intrinsics.areEqual(composerM3808constructorimpl4.rememberedValue(), Integer.valueOf(currentCompositeKeyHash4))) {
                            }
                            Updater.m3815setimpl(composerM3808constructorimpl4, modifierMaterializeModifier3, ComposeUiNode.INSTANCE.getSetModifier());
                            int i16 = (i15 >> 6) & 14;
                            composer6 = composer5;
                            ComposerKt.sourceInformationMarkerStart(composer6, -384672921, "C89@4556L9:Column.kt#2w3rfo");
                            int i17 = ((0 >> 6) & 112) | 6;
                            ColumnScope columnScope3 = ColumnScopeInstance.INSTANCE;
                            ComposerKt.sourceInformationMarkerStart(composer6, -1468478694, "C198@7837L26,195@7668L213,204@8085L959,200@7898L1146,228@9292L106,223@9061L538:ChatScreen.kt#cyjvf");
                            list2 = timeline;
                            if (list2 instanceof Collection) {
                                i = 0;
                                it = list2.iterator();
                                while (it.hasNext()) {
                                    i2 = i;
                                    if (((TimelineItem) it.next()) instanceof TimelineItem.Message) {
                                        i = i2 + 1;
                                        if (i < 0) {
                                            CollectionsKt.throwCountOverflow();
                                        }
                                    } else {
                                        i = i2;
                                    }
                                }
                            } else {
                                i = 0;
                                it = list2.iterator();
                                while (it.hasNext()) {
                                    i2 = i;
                                    if (((TimelineItem) it.next()) instanceof TimelineItem.Message) {
                                        i = i2 + 1;
                                        if (i < 0) {
                                            CollectionsKt.throwCountOverflow();
                                        }
                                    } else {
                                        i = i2;
                                    }
                                }
                            }
                            ComposerKt.sourceInformationMarkerStart(composer6, 1615201208, "CC(remember):ChatScreen.kt#9igjgp");
                            objRememberedValue9 = composer6.rememberedValue();
                            if (objRememberedValue9 == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue9 = new Function0() { // from class: com.luchime.huiyuan.ui.ChatScreenKt$$ExternalSyntheticLambda32
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        return ChatScreenKt.ChatScreen$lambda$28$lambda$27$lambda$17$lambda$16(showClearDialog$delegate);
                                    }
                                };
                                composer6.updateRememberedValue(objRememberedValue9);
                            }
                            ComposerKt.sourceInformationMarkerEnd(composer6);
                            ConversationToolbar(i, true, (Function0) objRememberedValue9, composer6, 432);
                            Modifier modifierWeight$default3 = ColumnScope.weight$default(columnScope3, Modifier.INSTANCE, 1.0f, false, 2, null);
                            PaddingValues paddingValuesM722PaddingValuesa9UjIt4$default3 = PaddingKt.m722PaddingValuesa9UjIt4$default(0.0f, 0.0f, 0.0f, Dp.m6973constructorimpl(8), 7, null);
                            ComposerKt.sourceInformationMarkerStart(composer6, 1615210077, "CC(remember):ChatScreen.kt#9igjgp");
                            boolean zChangedInstance5 = $composer4.changedInstance(timeline) | $composer4.changedInstance(favorites) | $composer4.changedInstance(context);
                            if (($dirty5 & 57344) == 16384) {
                                z8 = true;
                            } else {
                                z8 = false;
                            }
                            z9 = zChangedInstance5 | z8;
                            objRememberedValue10 = composer6.rememberedValue();
                            if (!z9) {
                            }
                            objRememberedValue10 = new Function1() { // from class: com.luchime.huiyuan.ui.ChatScreenKt$$ExternalSyntheticLambda33
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj3) {
                                    return ChatScreenKt.ChatScreen$lambda$28$lambda$27$lambda$24$lambda$23(timeline, favorites, context, onToggleFavorite, (LazyListScope) obj3);
                                }
                            };
                            composer6.updateRememberedValue(objRememberedValue10);
                            ComposerKt.sourceInformationMarkerEnd(composer6);
                            LazyDslKt.LazyColumn(modifierWeight$default3, listState, paddingValuesM722PaddingValuesa9UjIt4$default3, false, null, null, null, false, null, (Function1) objRememberedValue10, composer6, 384, 504);
                            ComposerKt.sourceInformationMarkerStart(composer6, 1615247848, "CC(remember):ChatScreen.kt#9igjgp");
                            boolean zChangedInstance6 = $composer4.changedInstance(focusManager);
                            if (($dirty4 & 1879048192) == 536870912) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            z11 = zChangedInstance6 | z10;
                            objRememberedValue11 = composer6.rememberedValue();
                            if (!z11) {
                                composer7 = composer6;
                                if (objRememberedValue11 == Composer.INSTANCE.getEmpty()) {
                                }
                                ComposerKt.sourceInformationMarkerEnd(composer7);
                                str = "CC(remember):ChatScreen.kt#9igjgp";
                                Composer composer12 = composer7;
                                Composer(selectedModel, onModelSelected, input, onInputChange, (Function0) objRememberedValue11, onRandom, isGenerating, onStopGeneration, true, composer12, ($dirty4 & 14) | 100663296 | ($dirty4 & 112) | (($dirty4 >> 3) & 896) | (($dirty4 >> 15) & 7168) | (($dirty5 << 12) & 458752) | (($dirty4 << 3) & 3670016) | (($dirty5 << 15) & 29360128));
                                ComposerKt.sourceInformationMarkerEnd(composer12);
                                ComposerKt.sourceInformationMarkerEnd(composer6);
                                composer5.endNode();
                                ComposerKt.sourceInformationMarkerEnd(composer5);
                                ComposerKt.sourceInformationMarkerEnd(composer5);
                                ComposerKt.sourceInformationMarkerEnd(composer5);
                                ComposerKt.sourceInformationMarkerEnd($composer3);
                                ComposerKt.sourceInformationMarkerEnd($composer3);
                                $composer3.endNode();
                                ComposerKt.sourceInformationMarkerEnd($composer3);
                                ComposerKt.sourceInformationMarkerEnd($composer3);
                                ComposerKt.sourceInformationMarkerEnd($composer3);
                                $composer4.endReplaceGroup();
                                function0 = onSend;
                                showClearDialog$delegate3 = showClearDialog$delegate;
                                $dirty1 = $dirty5;
                            } else {
                                composer7 = composer6;
                            }
                            objRememberedValue11 = new Function0() { // from class: com.luchime.huiyuan.ui.ChatScreenKt$$ExternalSyntheticLambda34
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return ChatScreenKt.ChatScreen$lambda$28$lambda$27$lambda$26$lambda$25(focusManager, onSend);
                                }
                            };
                            composer6.updateRememberedValue(objRememberedValue11);
                            ComposerKt.sourceInformationMarkerEnd(composer7);
                            str = "CC(remember):ChatScreen.kt#9igjgp";
                            Composer composer13 = composer7;
                            Composer(selectedModel, onModelSelected, input, onInputChange, (Function0) objRememberedValue11, onRandom, isGenerating, onStopGeneration, true, composer13, ($dirty4 & 14) | 100663296 | ($dirty4 & 112) | (($dirty4 >> 3) & 896) | (($dirty4 >> 15) & 7168) | (($dirty5 << 12) & 458752) | (($dirty4 << 3) & 3670016) | (($dirty5 << 15) & 29360128));
                            ComposerKt.sourceInformationMarkerEnd(composer13);
                            ComposerKt.sourceInformationMarkerEnd(composer6);
                            composer5.endNode();
                            ComposerKt.sourceInformationMarkerEnd(composer5);
                            ComposerKt.sourceInformationMarkerEnd(composer5);
                            ComposerKt.sourceInformationMarkerEnd(composer5);
                            ComposerKt.sourceInformationMarkerEnd($composer3);
                            ComposerKt.sourceInformationMarkerEnd($composer3);
                            $composer3.endNode();
                            ComposerKt.sourceInformationMarkerEnd($composer3);
                            ComposerKt.sourceInformationMarkerEnd($composer3);
                            ComposerKt.sourceInformationMarkerEnd($composer3);
                            $composer4.endReplaceGroup();
                            function0 = onSend;
                            showClearDialog$delegate3 = showClearDialog$delegate;
                            $dirty1 = $dirty5;
                        } else {
                            composer5 = $composer3;
                        }
                        composerM3808constructorimpl4.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash4));
                        composerM3808constructorimpl4.apply(Integer.valueOf(currentCompositeKeyHash4), setCompositeKeyHash3);
                        Updater.m3815setimpl(composerM3808constructorimpl4, modifierMaterializeModifier3, ComposeUiNode.INSTANCE.getSetModifier());
                        int i18 = (i15 >> 6) & 14;
                        composer6 = composer5;
                        ComposerKt.sourceInformationMarkerStart(composer6, -384672921, "C89@4556L9:Column.kt#2w3rfo");
                        int i19 = ((0 >> 6) & 112) | 6;
                        ColumnScope columnScope4 = ColumnScopeInstance.INSTANCE;
                        ComposerKt.sourceInformationMarkerStart(composer6, -1468478694, "C198@7837L26,195@7668L213,204@8085L959,200@7898L1146,228@9292L106,223@9061L538:ChatScreen.kt#cyjvf");
                        list2 = timeline;
                        if (list2 instanceof Collection) {
                            i = 0;
                            it = list2.iterator();
                            while (it.hasNext()) {
                                i2 = i;
                                if (((TimelineItem) it.next()) instanceof TimelineItem.Message) {
                                    i = i2 + 1;
                                    if (i < 0) {
                                        CollectionsKt.throwCountOverflow();
                                    }
                                } else {
                                    i = i2;
                                }
                            }
                        } else {
                            i = 0;
                            it = list2.iterator();
                            while (it.hasNext()) {
                                i2 = i;
                                if (((TimelineItem) it.next()) instanceof TimelineItem.Message) {
                                    i = i2 + 1;
                                    if (i < 0) {
                                        CollectionsKt.throwCountOverflow();
                                    }
                                } else {
                                    i = i2;
                                }
                            }
                        }
                        ComposerKt.sourceInformationMarkerStart(composer6, 1615201208, "CC(remember):ChatScreen.kt#9igjgp");
                        objRememberedValue9 = composer6.rememberedValue();
                        if (objRememberedValue9 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue9 = new Function0() { // from class: com.luchime.huiyuan.ui.ChatScreenKt$$ExternalSyntheticLambda32
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return ChatScreenKt.ChatScreen$lambda$28$lambda$27$lambda$17$lambda$16(showClearDialog$delegate);
                                }
                            };
                            composer6.updateRememberedValue(objRememberedValue9);
                        }
                        ComposerKt.sourceInformationMarkerEnd(composer6);
                        ConversationToolbar(i, true, (Function0) objRememberedValue9, composer6, 432);
                        Modifier modifierWeight$default4 = ColumnScope.weight$default(columnScope4, Modifier.INSTANCE, 1.0f, false, 2, null);
                        PaddingValues paddingValuesM722PaddingValuesa9UjIt4$default4 = PaddingKt.m722PaddingValuesa9UjIt4$default(0.0f, 0.0f, 0.0f, Dp.m6973constructorimpl(8), 7, null);
                        ComposerKt.sourceInformationMarkerStart(composer6, 1615210077, "CC(remember):ChatScreen.kt#9igjgp");
                        boolean zChangedInstance7 = $composer4.changedInstance(timeline) | $composer4.changedInstance(favorites) | $composer4.changedInstance(context);
                        if (($dirty5 & 57344) == 16384) {
                            z8 = true;
                        } else {
                            z8 = false;
                        }
                        z9 = zChangedInstance7 | z8;
                        objRememberedValue10 = composer6.rememberedValue();
                        if (!z9) {
                        }
                        objRememberedValue10 = new Function1() { // from class: com.luchime.huiyuan.ui.ChatScreenKt$$ExternalSyntheticLambda33
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj3) {
                                return ChatScreenKt.ChatScreen$lambda$28$lambda$27$lambda$24$lambda$23(timeline, favorites, context, onToggleFavorite, (LazyListScope) obj3);
                            }
                        };
                        composer6.updateRememberedValue(objRememberedValue10);
                        ComposerKt.sourceInformationMarkerEnd(composer6);
                        LazyDslKt.LazyColumn(modifierWeight$default4, listState, paddingValuesM722PaddingValuesa9UjIt4$default4, false, null, null, null, false, null, (Function1) objRememberedValue10, composer6, 384, 504);
                        ComposerKt.sourceInformationMarkerStart(composer6, 1615247848, "CC(remember):ChatScreen.kt#9igjgp");
                        boolean zChangedInstance8 = $composer4.changedInstance(focusManager);
                        if (($dirty4 & 1879048192) == 536870912) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        z11 = zChangedInstance8 | z10;
                        objRememberedValue11 = composer6.rememberedValue();
                        if (!z11) {
                            composer7 = composer6;
                            if (objRememberedValue11 == Composer.INSTANCE.getEmpty()) {
                            }
                            ComposerKt.sourceInformationMarkerEnd(composer7);
                            str = "CC(remember):ChatScreen.kt#9igjgp";
                            Composer composer14 = composer7;
                            Composer(selectedModel, onModelSelected, input, onInputChange, (Function0) objRememberedValue11, onRandom, isGenerating, onStopGeneration, true, composer14, ($dirty4 & 14) | 100663296 | ($dirty4 & 112) | (($dirty4 >> 3) & 896) | (($dirty4 >> 15) & 7168) | (($dirty5 << 12) & 458752) | (($dirty4 << 3) & 3670016) | (($dirty5 << 15) & 29360128));
                            ComposerKt.sourceInformationMarkerEnd(composer14);
                            ComposerKt.sourceInformationMarkerEnd(composer6);
                            composer5.endNode();
                            ComposerKt.sourceInformationMarkerEnd(composer5);
                            ComposerKt.sourceInformationMarkerEnd(composer5);
                            ComposerKt.sourceInformationMarkerEnd(composer5);
                            ComposerKt.sourceInformationMarkerEnd($composer3);
                            ComposerKt.sourceInformationMarkerEnd($composer3);
                            $composer3.endNode();
                            ComposerKt.sourceInformationMarkerEnd($composer3);
                            ComposerKt.sourceInformationMarkerEnd($composer3);
                            ComposerKt.sourceInformationMarkerEnd($composer3);
                            $composer4.endReplaceGroup();
                            function0 = onSend;
                            showClearDialog$delegate3 = showClearDialog$delegate;
                            $dirty1 = $dirty5;
                        } else {
                            composer7 = composer6;
                        }
                        objRememberedValue11 = new Function0() { // from class: com.luchime.huiyuan.ui.ChatScreenKt$$ExternalSyntheticLambda34
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return ChatScreenKt.ChatScreen$lambda$28$lambda$27$lambda$26$lambda$25(focusManager, onSend);
                            }
                        };
                        composer6.updateRememberedValue(objRememberedValue11);
                        ComposerKt.sourceInformationMarkerEnd(composer7);
                        str = "CC(remember):ChatScreen.kt#9igjgp";
                        Composer composer15 = composer7;
                        Composer(selectedModel, onModelSelected, input, onInputChange, (Function0) objRememberedValue11, onRandom, isGenerating, onStopGeneration, true, composer15, ($dirty4 & 14) | 100663296 | ($dirty4 & 112) | (($dirty4 >> 3) & 896) | (($dirty4 >> 15) & 7168) | (($dirty5 << 12) & 458752) | (($dirty4 << 3) & 3670016) | (($dirty5 << 15) & 29360128));
                        ComposerKt.sourceInformationMarkerEnd(composer15);
                        ComposerKt.sourceInformationMarkerEnd(composer6);
                        composer5.endNode();
                        ComposerKt.sourceInformationMarkerEnd(composer5);
                        ComposerKt.sourceInformationMarkerEnd(composer5);
                        ComposerKt.sourceInformationMarkerEnd(composer5);
                        ComposerKt.sourceInformationMarkerEnd($composer3);
                        ComposerKt.sourceInformationMarkerEnd($composer3);
                        $composer3.endNode();
                        ComposerKt.sourceInformationMarkerEnd($composer3);
                        ComposerKt.sourceInformationMarkerEnd($composer3);
                        ComposerKt.sourceInformationMarkerEnd($composer3);
                        $composer4.endReplaceGroup();
                        function0 = onSend;
                        showClearDialog$delegate3 = showClearDialog$delegate;
                        $dirty1 = $dirty5;
                    } else {
                        $composer4 = $composer3;
                        str = r4;
                        $dirty1 = $dirty5;
                        $composer4.startReplaceGroup(-669049121);
                        ComposerKt.sourceInformation($composer4, "240@9645L2762");
                        Modifier modifierFillMaxSize$default2 = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null);
                        ComposerKt.sourceInformationMarkerStart($composer4, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
                        MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                        ComposerKt.sourceInformationMarkerStart($composer4, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                        currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash($composer4, 0);
                        CompositionLocalMap currentCompositionLocalMap5 = $composer4.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier4 = ComposedModifierKt.materializeModifier($composer4, modifierFillMaxSize$default2);
                        constructor = ComposeUiNode.INSTANCE.getConstructor();
                        int i20 = ((((6 << 3) & 112) << 6) & 896) | 6;
                        ComposerKt.sourceInformationMarkerStart($composer4, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
                        if (!($composer4.getApplier() instanceof Applier)) {
                            ComposablesKt.invalidApplier();
                        }
                        $composer4.startReusableNode();
                        if ($composer4.getInserting()) {
                            $composer4.createNode(constructor);
                        } else {
                            $composer4.useNode();
                        }
                        composerM3808constructorimpl = Updater.m3808constructorimpl($composer4);
                        Updater.m3815setimpl(composerM3808constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                        Updater.m3815setimpl(composerM3808constructorimpl, currentCompositionLocalMap5, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash4 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                        if (!composerM3808constructorimpl.getInserting() || !Intrinsics.areEqual(composerM3808constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                            composerM3808constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                            composerM3808constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash4);
                        }
                        Updater.m3815setimpl(composerM3808constructorimpl, modifierMaterializeModifier4, ComposeUiNode.INSTANCE.getSetModifier());
                        int i21 = (i20 >> 6) & 14;
                        ComposerKt.sourceInformationMarkerStart($composer4, -2146730711, "C72@3468L9:Box.kt#2w3rfo");
                        int i22 = ((6 >> 6) & 112) | 6;
                        BoxScope boxScope = BoxScopeInstance.INSTANCE;
                        ComposerKt.sourceInformationMarkerStart($composer4, -90954427, "C241@9698L2488,298@12200L197:ChatScreen.kt#cyjvf");
                        Modifier modifierFillMaxSize$default3 = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null);
                        ComposerKt.sourceInformationMarkerStart($composer4, -483455358, "CC(Column)P(2,3,1)87@4442L61,88@4508L133:Column.kt#2w3rfo");
                        MeasurePolicy measurePolicyColumnMeasurePolicy3 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), $composer4, ((6 >> 3) & 14) | ((6 >> 3) & 112));
                        ComposerKt.sourceInformationMarkerStart($composer4, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                        currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash($composer4, 0);
                        currentCompositionLocalMap = $composer4.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier5 = ComposedModifierKt.materializeModifier($composer4, modifierFillMaxSize$default3);
                        constructor2 = ComposeUiNode.INSTANCE.getConstructor();
                        int i23 = ((((6 << 3) & 112) << 6) & 896) | 6;
                        ComposerKt.sourceInformationMarkerStart($composer4, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
                        if (!($composer4.getApplier() instanceof Applier)) {
                            ComposablesKt.invalidApplier();
                        }
                        $composer4.startReusableNode();
                        if ($composer4.getInserting()) {
                            $composer4.createNode(constructor2);
                        } else {
                            $composer4.useNode();
                        }
                        composerM3808constructorimpl2 = Updater.m3808constructorimpl($composer4);
                        Updater.m3815setimpl(composerM3808constructorimpl2, measurePolicyColumnMeasurePolicy3, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                        Updater.m3815setimpl(composerM3808constructorimpl2, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash5 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                        if (composerM3808constructorimpl2.getInserting()) {
                            compositionLocalMap = currentCompositionLocalMap;
                            function1 = constructor2;
                        } else {
                            compositionLocalMap = currentCompositionLocalMap;
                            function1 = constructor2;
                            if (!Intrinsics.areEqual(composerM3808constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                            }
                            Updater.m3815setimpl(composerM3808constructorimpl2, modifierMaterializeModifier5, ComposeUiNode.INSTANCE.getSetModifier());
                            int i24 = (i23 >> 6) & 14;
                            ComposerKt.sourceInformationMarkerStart($composer4, -384672921, "C89@4556L9:Column.kt#2w3rfo");
                            int i25 = ((6 >> 6) & 112) | 6;
                            ColumnScope columnScope5 = ColumnScopeInstance.INSTANCE;
                            ComposerKt.sourceInformationMarkerStart($composer4, -1030434804, "C246@9946L1433,242@9758L1621,275@11397L218,287@11864L106,282@11633L539:ChatScreen.kt#cyjvf");
                            Modifier modifierWeight$default5 = ColumnScope.weight$default(columnScope5, Modifier.INSTANCE, 1.0f, false, 2, null);
                            PaddingValues paddingValuesM722PaddingValuesa9UjIt4$default5 = PaddingKt.m722PaddingValuesa9UjIt4$default(0.0f, 0.0f, 0.0f, Dp.m6973constructorimpl(14), 7, null);
                            ComposerKt.sourceInformationMarkerStart($composer4, -587424126, str);
                            if (($dirty4 & 14) == 4) {
                                z = true;
                            } else {
                                z = false;
                            }
                            if (($dirty4 & 112) == 32) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            boolean z13 = z2 | z;
                            if (($dirty4 & 458752) == 131072) {
                                z3 = true;
                            } else {
                                z3 = false;
                            }
                            boolean zChangedInstance9 = z13 | z3 | $composer4.changedInstance(timeline) | $composer4.changedInstance(favorites) | $composer4.changedInstance(context);
                            if (($dirty1 & 57344) == 16384) {
                                z4 = true;
                            } else {
                                z4 = false;
                            }
                            z5 = zChangedInstance9 | z4;
                            objRememberedValue6 = $composer4.rememberedValue();
                            if (!z5) {
                                composer = $composer4;
                                if (objRememberedValue6 == Composer.INSTANCE.getEmpty()) {
                                    showClearDialog$delegate2 = showClearDialog$delegate;
                                    composer2 = composer;
                                }
                                ComposerKt.sourceInformationMarkerEnd(composer2);
                                LazyDslKt.LazyColumn(modifierWeight$default5, listState, paddingValuesM722PaddingValuesa9UjIt4$default5, false, null, null, null, false, null, (Function1) objRememberedValue6, composer2, 384, 504);
                                composer3 = composer2;
                                QuickPromptRow(visibleQuestions3, !isGenerating, onPrompt, onRefreshPrompts, composer3, (($dirty1 << 6) & 896) | ($dirty1 & 7168));
                                ComposerKt.sourceInformationMarkerStart(composer3, -587364077, str);
                                boolean zChangedInstance10 = $composer4.changedInstance(focusManager);
                                if (($dirty4 & 1879048192) == 536870912) {
                                    z6 = true;
                                } else {
                                    z6 = false;
                                }
                                z7 = zChangedInstance10 | z6;
                                objRememberedValue7 = composer3.rememberedValue();
                                if (!z7 || objRememberedValue7 == Composer.INSTANCE.getEmpty()) {
                                    function0 = onSend;
                                    Object obj3 = new Function0() { // from class: com.luchime.huiyuan.ui.ChatScreenKt$$ExternalSyntheticLambda36
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            return ChatScreenKt.ChatScreen$lambda$45$lambda$44$lambda$43$lambda$42(focusManager, function0);
                                        }
                                    };
                                    composer3.updateRememberedValue(obj3);
                                    objRememberedValue7 = obj3;
                                } else {
                                    function0 = onSend;
                                }
                                ComposerKt.sourceInformationMarkerEnd(composer3);
                                showClearDialog$delegate3 = showClearDialog$delegate2;
                                Composer(selectedModel, onModelSelected, input, onInputChange, (Function0) objRememberedValue7, onRandom, isGenerating, onStopGeneration, false, composer3, ($dirty4 & 14) | 100663296 | ($dirty4 & 112) | (($dirty4 >> 3) & 896) | (($dirty4 >> 15) & 7168) | (($dirty1 << 12) & 458752) | (($dirty4 << 3) & 3670016) | (29360128 & ($dirty1 << 15)));
                                ComposerKt.sourceInformationMarkerEnd(composer3);
                                ComposerKt.sourceInformationMarkerEnd($composer4);
                                
                                /*  JADX ERROR: Method code generation error
                                    jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0d62: INVOKE (r40v1 ?? I:??[OBJECT, ARRAY]) INTERFACE call: androidx.compose.runtime.Composer.endNode():void A[MD:():void (m)] (LINE:1399) in method: com.luchime.huiyuan.ui.ChatScreenKt.ChatScreen(com.luchime.huiyuan.ui.AIModel, kotlin.jvm.functions.Function1<? super com.luchime.huiyuan.ui.AIModel, kotlin.Unit>, java.util.List<? extends com.luchime.huiyuan.ui.TimelineItem>, java.lang.String, int, boolean, boolean, java.util.Set<java.lang.String>, kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit>, kotlin.jvm.functions.Function0<kotlin.Unit>, kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit>, kotlin.jvm.functions.Function0<kotlin.Unit>, kotlin.jvm.functions.Function0<kotlin.Unit>, kotlin.jvm.functions.Function0<kotlin.Unit>, kotlin.jvm.functions.Function2<? super java.lang.String, ? super java.lang.String, kotlin.Unit>, kotlin.jvm.functions.Function0<kotlin.Unit>, androidx.compose.runtime.Composer, int, int):void, file: classes5.dex
                                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:310)
                                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:273)
                                    	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:94)
                                    	at jadx.core.dex.nodes.IBlock.generate(IBlock.java:15)
                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:126)
                                    	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:140)
                                    	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:140)
                                    	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:126)
                                    	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                                    	at jadx.core.codegen.RegionGen.makeLoop(RegionGen.java:216)
                                    	at jadx.core.dex.regions.loops.LoopRegion.generate(LoopRegion.java:173)
                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:140)
                                    	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                    	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:291)
                                    	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:275)
                                    	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:420)
                                    	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:345)
                                    	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:299)
                                    	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:184)
                                    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
                                    	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                                    	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
                                    Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r40v1 ??
                                    	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:236)
                                    */
                                /*
                                    Method dump skipped, instruction units count: 3770
                                    To view this dump change 'Code comments level' option to 'DEBUG'
                                */
                                throw new UnsupportedOperationException("Method not decompiled: com.luchime.huiyuan.ui.ChatScreenKt.ChatScreen(com.luchime.huiyuan.ui.AIModel, kotlin.jvm.functions.Function1, java.util.List, java.lang.String, int, boolean, boolean, java.util.Set, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function0, androidx.compose.runtime.Composer, int, int):void");
                            }

                            /* JADX INFO: Access modifiers changed from: private */
                            public static final boolean ChatScreen$lambda$6(State<Boolean> state) {
                                return ((Boolean) state.getValue()).booleanValue();
                            }

                            static final boolean ChatScreen$lambda$5$lambda$4(LazyListState $listState) {
                                LazyListLayoutInfo layout = $listState.getLayoutInfo();
                                LazyListItemInfo lazyListItemInfo = (LazyListItemInfo) CollectionsKt.lastOrNull((List) layout.getVisibleItemsInfo());
                                int lastVisible = lazyListItemInfo != null ? lazyListItemInfo.getIndex() : -1;
                                return layout.getTotalItemsCount() == 0 || lastVisible >= layout.getTotalItemsCount() + (-2);
                            }

                            private static final boolean ChatScreen$lambda$8(MutableState<Boolean> mutableState) {
                                return mutableState.getValue().booleanValue();
                            }

                            private static final void ChatScreen$lambda$9(MutableState<Boolean> mutableState, boolean z) {
                                mutableState.setValue(Boolean.valueOf(z));
                            }

                            private static final float ChatScreen$lambda$12(State<Float> state) {
                                return ((Number) state.getValue()).floatValue();
                            }

                            static final float ChatScreen$lambda$11$lambda$10(LazyListState $listState) {
                                if ($listState.getFirstVisibleItemIndex() > 0) {
                                    return 1.0f;
                                }
                                return RangesKt.coerceIn($listState.getFirstVisibleItemScrollOffset() / 280.0f, 0.0f, 1.0f);
                            }

                            static final Unit ChatScreen$lambda$28$lambda$27$lambda$17$lambda$16(MutableState $showClearDialog$delegate) {
                                ChatScreen$lambda$9($showClearDialog$delegate, true);
                                return Unit.INSTANCE;
                            }

                            static final Unit ChatScreen$lambda$28$lambda$27$lambda$24$lambda$23(final List $timeline, final Set $favorites, final Context $context, final Function2 $onToggleFavorite, LazyListScope LazyColumn) {
                                Intrinsics.checkNotNullParameter(LazyColumn, "$this$LazyColumn");
                                final Function1 function1 = new Function1() { // from class: com.luchime.huiyuan.ui.ChatScreenKt$$ExternalSyntheticLambda42
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj) {
                                        return ChatScreenKt.ChatScreen$lambda$28$lambda$27$lambda$24$lambda$23$lambda$18((TimelineItem) obj);
                                    }
                                };
                                final Function1 function2 = new Function1() { // from class: com.luchime.huiyuan.ui.ChatScreenKt$ChatScreen$lambda$28$lambda$27$lambda$24$lambda$23$$inlined$items$default$1
                                    @Override // kotlin.jvm.functions.Function1
                                    public /* bridge */ /* synthetic */ Object invoke(Object p1) {
                                        return invoke((TimelineItem) p1);
                                    }

                                    @Override // kotlin.jvm.functions.Function1
                                    public final Void invoke(TimelineItem timelineItem) {
                                        return null;
                                    }
                                };
                                LazyColumn.items($timeline.size(), new Function1<Integer, Object>() { // from class: com.luchime.huiyuan.ui.ChatScreenKt$ChatScreen$lambda$28$lambda$27$lambda$24$lambda$23$$inlined$items$default$2
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(1);
                                    }

                                    @Override // kotlin.jvm.functions.Function1
                                    public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                                        return invoke(num.intValue());
                                    }

                                    public final Object invoke(int index) {
                                        return invoke($timeline.get(index));
                                    }
                                }, new Function1<Integer, Object>() { // from class: com.luchime.huiyuan.ui.ChatScreenKt$ChatScreen$lambda$28$lambda$27$lambda$24$lambda$23$$inlined$items$default$3
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(1);
                                    }

                                    @Override // kotlin.jvm.functions.Function1
                                    public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                                        return invoke(num.intValue());
                                    }

                                    public final Object invoke(int index) {
                                        return invoke($timeline.get(index));
                                    }
                                }, ComposableLambdaKt.composableLambdaInstance(-632812321, true, new Function4<LazyItemScope, Integer, Composer, Integer, Unit>() { // from class: com.luchime.huiyuan.ui.ChatScreenKt$ChatScreen$lambda$28$lambda$27$lambda$24$lambda$23$$inlined$items$default$4
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
                                        Composer composer;
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
                                        final TimelineItem timelineItem = (TimelineItem) $timeline.get(it);
                                        $composer.startReplaceGroup(-329194292);
                                        ComposerKt.sourceInformation($composer, "C:ChatScreen.kt#cyjvf");
                                        if (timelineItem instanceof TimelineItem.Message) {
                                            $composer.startReplaceGroup(1929045514);
                                            ComposerKt.sourceInformation($composer, "210@8449L32,211@8525L66,212@8644L226,207@8243L657");
                                            TimelineItem.Message message = (TimelineItem.Message) timelineItem;
                                            boolean z = ((TimelineItem.Message) timelineItem).getSourceQuote() != null && $favorites.contains(((TimelineItem.Message) timelineItem).getSourceQuote());
                                            ComposerKt.sourceInformationMarkerStart($composer, 1929051481, "CC(remember):ChatScreen.kt#9igjgp");
                                            boolean zChangedInstance = ((((i & 112) ^ 48) > 32 && $composer.changedInstance(timelineItem)) || (i & 48) == 32) | $composer.changedInstance($context);
                                            Object objRememberedValue = $composer.rememberedValue();
                                            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                                final Context context = $context;
                                                Object obj = (Function0) new Function0<Unit>() { // from class: com.luchime.huiyuan.ui.ChatScreenKt$ChatScreen$3$1$3$1$2$1$1
                                                    @Override // kotlin.jvm.functions.Function0
                                                    public /* bridge */ /* synthetic */ Unit invoke() {
                                                        invoke2();
                                                        return Unit.INSTANCE;
                                                    }

                                                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                                    public final void invoke2() {
                                                        HuiyuanDesignKt.copyText(context, ((TimelineItem.Message) timelineItem).getText());
                                                    }
                                                };
                                                $composer.updateRememberedValue(obj);
                                                objRememberedValue = obj;
                                            }
                                            Function0 function0 = (Function0) objRememberedValue;
                                            ComposerKt.sourceInformationMarkerEnd($composer);
                                            ComposerKt.sourceInformationMarkerStart($composer, 1929053947, "CC(remember):ChatScreen.kt#9igjgp");
                                            boolean zChangedInstance2 = $composer.changedInstance($context) | ((((i & 112) ^ 48) > 32 && $composer.changedInstance(timelineItem)) || (i & 48) == 32);
                                            Object objRememberedValue2 = $composer.rememberedValue();
                                            if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                                final Context context2 = $context;
                                                Object obj2 = (Function0) new Function0<Unit>() { // from class: com.luchime.huiyuan.ui.ChatScreenKt$ChatScreen$3$1$3$1$2$2$1
                                                    @Override // kotlin.jvm.functions.Function0
                                                    public /* bridge */ /* synthetic */ Unit invoke() {
                                                        invoke2();
                                                        return Unit.INSTANCE;
                                                    }

                                                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                                    public final void invoke2() {
                                                        HuiyuanDesignKt.shareText(context2, ((TimelineItem.Message) timelineItem).getModel().getDisplayName() + " 的回答", ((TimelineItem.Message) timelineItem).getText());
                                                    }
                                                };
                                                $composer.updateRememberedValue(obj2);
                                                objRememberedValue2 = obj2;
                                            }
                                            Function0 function3 = (Function0) objRememberedValue2;
                                            ComposerKt.sourceInformationMarkerEnd($composer);
                                            ComposerKt.sourceInformationMarkerStart($composer, 1929057915, "CC(remember):ChatScreen.kt#9igjgp");
                                            boolean zChanged = $composer.changed($onToggleFavorite) | ((((i & 112) ^ 48) > 32 && $composer.changedInstance(timelineItem)) || (i & 48) == 32);
                                            Object objRememberedValue3 = $composer.rememberedValue();
                                            if (zChanged || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                                                final Function2 function4 = $onToggleFavorite;
                                                Object obj3 = (Function0) new Function0<Unit>() { // from class: com.luchime.huiyuan.ui.ChatScreenKt$ChatScreen$3$1$3$1$2$3$1
                                                    @Override // kotlin.jvm.functions.Function0
                                                    public /* bridge */ /* synthetic */ Unit invoke() {
                                                        invoke2();
                                                        return Unit.INSTANCE;
                                                    }

                                                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                                    public final void invoke2() {
                                                        String sourceQuote = ((TimelineItem.Message) timelineItem).getSourceQuote();
                                                        if (sourceQuote != null) {
                                                            Function2<String, String, Unit> function5 = function4;
                                                            String tag = ((TimelineItem.Message) timelineItem).getTag();
                                                            if (tag == null) {
                                                                tag = "通用";
                                                            }
                                                            function5.invoke(sourceQuote, tag);
                                                        }
                                                    }
                                                };
                                                $composer.updateRememberedValue(obj3);
                                                objRememberedValue3 = obj3;
                                            }
                                            ComposerKt.sourceInformationMarkerEnd($composer);
                                            ChatScreenKt.MessageBubble(message, z, function0, function3, (Function0) objRememberedValue3, $composer, 0);
                                            composer = $composer;
                                            composer.endReplaceGroup();
                                        } else {
                                            composer = $composer;
                                            if (timelineItem instanceof TimelineItem.ThinkLog) {
                                                composer.startReplaceGroup(1929067757);
                                                ComposerKt.sourceInformation(composer, "219@8958L20");
                                                ChatScreenKt.ThinkLogBubble((TimelineItem.ThinkLog) timelineItem, composer, 0);
                                                composer.endReplaceGroup();
                                            } else {
                                                composer.startReplaceGroup(1929043479);
                                                composer.endReplaceGroup();
                                                throw new NoWhenBranchMatchedException();
                                            }
                                        }
                                        composer.endReplaceGroup();
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                    }
                                }));
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

                            static final Unit ChatScreen$lambda$45$lambda$44$lambda$41$lambda$40(final List $timeline, final AIModel $selectedModel, final Function1 $onModelSelected, final boolean $isGenerating, final MutableState $showClearDialog$delegate, final Set $favorites, final Context $context, final Function2 $onToggleFavorite, LazyListScope LazyColumn) {
                                Intrinsics.checkNotNullParameter(LazyColumn, "$this$LazyColumn");
                                LazyListScope.item$default(LazyColumn, null, null, ComposableLambdaKt.composableLambdaInstance(-1306149442, true, new Function3() { // from class: com.luchime.huiyuan.ui.ChatScreenKt$$ExternalSyntheticLambda19
                                    @Override // kotlin.jvm.functions.Function3
                                    public final Object invoke(Object obj, Object obj2, Object obj3) {
                                        return ChatScreenKt.ChatScreen$lambda$45$lambda$44$lambda$41$lambda$40$lambda$29($selectedModel, $onModelSelected, $isGenerating, (LazyItemScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
                                    }
                                }), 3, null);
                                LazyListScope.item$default(LazyColumn, null, null, ComposableLambdaKt.composableLambdaInstance(-2075293067, true, new Function3() { // from class: com.luchime.huiyuan.ui.ChatScreenKt$$ExternalSyntheticLambda20
                                    @Override // kotlin.jvm.functions.Function3
                                    public final Object invoke(Object obj, Object obj2, Object obj3) {
                                        return ChatScreenKt.ChatScreen$lambda$45$lambda$44$lambda$41$lambda$40$lambda$30($selectedModel, (LazyItemScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
                                    }
                                }), 3, null);
                                LazyListScope.item$default(LazyColumn, null, null, ComposableLambdaKt.composableLambdaInstance(-1853381386, true, new Function3() { // from class: com.luchime.huiyuan.ui.ChatScreenKt$$ExternalSyntheticLambda21
                                    @Override // kotlin.jvm.functions.Function3
                                    public final Object invoke(Object obj, Object obj2, Object obj3) {
                                        return ChatScreenKt.ChatScreen$lambda$45$lambda$44$lambda$41$lambda$40$lambda$34($timeline, $showClearDialog$delegate, (LazyItemScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
                                    }
                                }), 3, null);
                                final Function1 function1 = new Function1() { // from class: com.luchime.huiyuan.ui.ChatScreenKt$$ExternalSyntheticLambda22
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj) {
                                        return ChatScreenKt.ChatScreen$lambda$45$lambda$44$lambda$41$lambda$40$lambda$35((TimelineItem) obj);
                                    }
                                };
                                final Function1 function2 = new Function1() { // from class: com.luchime.huiyuan.ui.ChatScreenKt$ChatScreen$lambda$45$lambda$44$lambda$41$lambda$40$$inlined$items$default$1
                                    @Override // kotlin.jvm.functions.Function1
                                    public /* bridge */ /* synthetic */ Object invoke(Object p1) {
                                        return invoke((TimelineItem) p1);
                                    }

                                    @Override // kotlin.jvm.functions.Function1
                                    public final Void invoke(TimelineItem timelineItem) {
                                        return null;
                                    }
                                };
                                LazyColumn.items($timeline.size(), new Function1<Integer, Object>() { // from class: com.luchime.huiyuan.ui.ChatScreenKt$ChatScreen$lambda$45$lambda$44$lambda$41$lambda$40$$inlined$items$default$2
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(1);
                                    }

                                    @Override // kotlin.jvm.functions.Function1
                                    public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                                        return invoke(num.intValue());
                                    }

                                    public final Object invoke(int index) {
                                        return invoke($timeline.get(index));
                                    }
                                }, new Function1<Integer, Object>() { // from class: com.luchime.huiyuan.ui.ChatScreenKt$ChatScreen$lambda$45$lambda$44$lambda$41$lambda$40$$inlined$items$default$3
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(1);
                                    }

                                    @Override // kotlin.jvm.functions.Function1
                                    public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                                        return invoke(num.intValue());
                                    }

                                    public final Object invoke(int index) {
                                        return invoke($timeline.get(index));
                                    }
                                }, ComposableLambdaKt.composableLambdaInstance(-632812321, true, new Function4<LazyItemScope, Integer, Composer, Integer, Unit>() { // from class: com.luchime.huiyuan.ui.ChatScreenKt$ChatScreen$lambda$45$lambda$44$lambda$41$lambda$40$$inlined$items$default$4
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
                                        Composer composer;
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
                                        final TimelineItem timelineItem = (TimelineItem) $timeline.get(it);
                                        $composer.startReplaceGroup(-189059967);
                                        ComposerKt.sourceInformation($composer, "C:ChatScreen.kt#cyjvf");
                                        if (timelineItem instanceof TimelineItem.Message) {
                                            $composer.startReplaceGroup(-1391569995);
                                            ComposerKt.sourceInformation($composer, "261@10784L32,262@10860L66,263@10979L226,258@10578L657");
                                            TimelineItem.Message message = (TimelineItem.Message) timelineItem;
                                            boolean z = ((TimelineItem.Message) timelineItem).getSourceQuote() != null && $favorites.contains(((TimelineItem.Message) timelineItem).getSourceQuote());
                                            ComposerKt.sourceInformationMarkerStart($composer, -1391564028, "CC(remember):ChatScreen.kt#9igjgp");
                                            boolean zChangedInstance = ((((i & 112) ^ 48) > 32 && $composer.changedInstance(timelineItem)) || (i & 48) == 32) | $composer.changedInstance($context);
                                            Object objRememberedValue = $composer.rememberedValue();
                                            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                                final Context context = $context;
                                                Object obj = (Function0) new Function0<Unit>() { // from class: com.luchime.huiyuan.ui.ChatScreenKt$ChatScreen$4$1$1$1$5$1$1
                                                    @Override // kotlin.jvm.functions.Function0
                                                    public /* bridge */ /* synthetic */ Unit invoke() {
                                                        invoke2();
                                                        return Unit.INSTANCE;
                                                    }

                                                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                                    public final void invoke2() {
                                                        HuiyuanDesignKt.copyText(context, ((TimelineItem.Message) timelineItem).getText());
                                                    }
                                                };
                                                $composer.updateRememberedValue(obj);
                                                objRememberedValue = obj;
                                            }
                                            Function0 function0 = (Function0) objRememberedValue;
                                            ComposerKt.sourceInformationMarkerEnd($composer);
                                            ComposerKt.sourceInformationMarkerStart($composer, -1391561562, "CC(remember):ChatScreen.kt#9igjgp");
                                            boolean zChangedInstance2 = $composer.changedInstance($context) | ((((i & 112) ^ 48) > 32 && $composer.changedInstance(timelineItem)) || (i & 48) == 32);
                                            Object objRememberedValue2 = $composer.rememberedValue();
                                            if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                                final Context context2 = $context;
                                                Object obj2 = (Function0) new Function0<Unit>() { // from class: com.luchime.huiyuan.ui.ChatScreenKt$ChatScreen$4$1$1$1$5$2$1
                                                    @Override // kotlin.jvm.functions.Function0
                                                    public /* bridge */ /* synthetic */ Unit invoke() {
                                                        invoke2();
                                                        return Unit.INSTANCE;
                                                    }

                                                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                                    public final void invoke2() {
                                                        HuiyuanDesignKt.shareText(context2, ((TimelineItem.Message) timelineItem).getModel().getDisplayName() + " 的回答", ((TimelineItem.Message) timelineItem).getText());
                                                    }
                                                };
                                                $composer.updateRememberedValue(obj2);
                                                objRememberedValue2 = obj2;
                                            }
                                            Function0 function3 = (Function0) objRememberedValue2;
                                            ComposerKt.sourceInformationMarkerEnd($composer);
                                            ComposerKt.sourceInformationMarkerStart($composer, -1391557594, "CC(remember):ChatScreen.kt#9igjgp");
                                            boolean zChanged = $composer.changed($onToggleFavorite) | ((((i & 112) ^ 48) > 32 && $composer.changedInstance(timelineItem)) || (i & 48) == 32);
                                            Object objRememberedValue3 = $composer.rememberedValue();
                                            if (zChanged || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                                                final Function2 function4 = $onToggleFavorite;
                                                Object obj3 = (Function0) new Function0<Unit>() { // from class: com.luchime.huiyuan.ui.ChatScreenKt$ChatScreen$4$1$1$1$5$3$1
                                                    @Override // kotlin.jvm.functions.Function0
                                                    public /* bridge */ /* synthetic */ Unit invoke() {
                                                        invoke2();
                                                        return Unit.INSTANCE;
                                                    }

                                                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                                    public final void invoke2() {
                                                        String sourceQuote = ((TimelineItem.Message) timelineItem).getSourceQuote();
                                                        if (sourceQuote != null) {
                                                            Function2<String, String, Unit> function5 = function4;
                                                            String tag = ((TimelineItem.Message) timelineItem).getTag();
                                                            if (tag == null) {
                                                                tag = "通用";
                                                            }
                                                            function5.invoke(sourceQuote, tag);
                                                        }
                                                    }
                                                };
                                                $composer.updateRememberedValue(obj3);
                                                objRememberedValue3 = obj3;
                                            }
                                            ComposerKt.sourceInformationMarkerEnd($composer);
                                            ChatScreenKt.MessageBubble(message, z, function0, function3, (Function0) objRememberedValue3, $composer, 0);
                                            composer = $composer;
                                            composer.endReplaceGroup();
                                        } else {
                                            composer = $composer;
                                            if (timelineItem instanceof TimelineItem.ThinkLog) {
                                                composer.startReplaceGroup(-1391547752);
                                                ComposerKt.sourceInformation(composer, "270@11293L20");
                                                ChatScreenKt.ThinkLogBubble((TimelineItem.ThinkLog) timelineItem, composer, 0);
                                                composer.endReplaceGroup();
                                            } else {
                                                composer.startReplaceGroup(-1391572030);
                                                composer.endReplaceGroup();
                                                throw new NoWhenBranchMatchedException();
                                            }
                                        }
                                        composer.endReplaceGroup();
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                    }
                                }));
                                return Unit.INSTANCE;
                            }

                            static final Unit ChatScreen$lambda$45$lambda$44$lambda$41$lambda$40$lambda$29(AIModel $selectedModel, Function1 $onModelSelected, boolean $isGenerating, LazyItemScope item, Composer $composer, int $changed) {
                                Intrinsics.checkNotNullParameter(item, "$this$item");
                                ComposerKt.sourceInformation($composer, "C247@9975L67:ChatScreen.kt#cyjvf");
                                if ($composer.shouldExecute(($changed & 17) != 16, $changed & 1)) {
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-1306149442, $changed, -1, "com.luchime.huiyuan.ui.ChatScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (ChatScreen.kt:247)");
                                    }
                                    HeroHeader($selectedModel, $onModelSelected, !$isGenerating, $composer, 0);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                } else {
                                    $composer.skipToGroupEnd();
                                }
                                return Unit.INSTANCE;
                            }

                            static final Unit ChatScreen$lambda$45$lambda$44$lambda$41$lambda$40$lambda$30(AIModel $selectedModel, LazyItemScope item, Composer $composer, int $changed) {
                                Intrinsics.checkNotNullParameter(item, "$this$item");
                                ComposerKt.sourceInformation($composer, "C248@10072L27:ChatScreen.kt#cyjvf");
                                if ($composer.shouldExecute(($changed & 17) != 16, $changed & 1)) {
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-2075293067, $changed, -1, "com.luchime.huiyuan.ui.ChatScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (ChatScreen.kt:248)");
                                    }
                                    MarqueeStrip($selectedModel, $composer, 0);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                } else {
                                    $composer.skipToGroupEnd();
                                }
                                return Unit.INSTANCE;
                            }

                            static final Unit ChatScreen$lambda$45$lambda$44$lambda$41$lambda$40$lambda$34(List $timeline, final MutableState $showClearDialog$delegate, LazyItemScope item, Composer $composer, int $changed) {
                                int i;
                                Intrinsics.checkNotNullParameter(item, "$this$item");
                                ComposerKt.sourceInformation($composer, "C253@10347L26,250@10153L246:ChatScreen.kt#cyjvf");
                                if (!$composer.shouldExecute(($changed & 17) != 16, $changed & 1)) {
                                    $composer.skipToGroupEnd();
                                } else {
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-1853381386, $changed, -1, "com.luchime.huiyuan.ui.ChatScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (ChatScreen.kt:250)");
                                    }
                                    List list = $timeline;
                                    if ((list instanceof Collection) && list.isEmpty()) {
                                        i = 0;
                                    } else {
                                        i = 0;
                                        Iterator it = list.iterator();
                                        while (it.hasNext()) {
                                            if ((((TimelineItem) it.next()) instanceof TimelineItem.Message) && (i = i + 1) < 0) {
                                                CollectionsKt.throwCountOverflow();
                                            }
                                        }
                                    }
                                    ComposerKt.sourceInformationMarkerStart($composer, 1311922960, "CC(remember):ChatScreen.kt#9igjgp");
                                    Object objRememberedValue = $composer.rememberedValue();
                                    if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                        Object obj = new Function0() { // from class: com.luchime.huiyuan.ui.ChatScreenKt$$ExternalSyntheticLambda53
                                            @Override // kotlin.jvm.functions.Function0
                                            public final Object invoke() {
                                                return ChatScreenKt.ChatScreen$lambda$45$lambda$44$lambda$41$lambda$40$lambda$34$lambda$33$lambda$32($showClearDialog$delegate);
                                            }
                                        };
                                        $composer.updateRememberedValue(obj);
                                        objRememberedValue = obj;
                                    }
                                    ComposerKt.sourceInformationMarkerEnd($composer);
                                    ConversationToolbar(i, false, (Function0) objRememberedValue, $composer, 432);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                }
                                return Unit.INSTANCE;
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
                                if (!$composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
                                    $composer.skipToGroupEnd();
                                } else {
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-1999000877, $changed, -1, "com.luchime.huiyuan.ui.ChatScreen.<anonymous> (ChatScreen.kt:312)");
                                    }
                                    ComposerKt.sourceInformationMarkerStart($composer, -1189460073, "CC(remember):ChatScreen.kt#9igjgp");
                                    boolean zChangedInstance = $composer.changedInstance($haptics) | $composer.changed($onClearConversation);
                                    Object objRememberedValue = $composer.rememberedValue();
                                    if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                        Object obj = new Function0() { // from class: com.luchime.huiyuan.ui.ChatScreenKt$$ExternalSyntheticLambda49
                                            @Override // kotlin.jvm.functions.Function0
                                            public final Object invoke() {
                                                return ChatScreenKt.ChatScreen$lambda$50$lambda$49$lambda$48($haptics, $onClearConversation, $showClearDialog$delegate);
                                            }
                                        };
                                        $composer.updateRememberedValue(obj);
                                        objRememberedValue = obj;
                                    }
                                    ComposerKt.sourceInformationMarkerEnd($composer);
                                    ButtonKt.TextButton((Function0) objRememberedValue, null, false, null, null, null, null, null, null, ComposableSingletons$ChatScreenKt.INSTANCE.getLambda$1172547958$app(), $composer, 805306368, 510);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                }
                                return Unit.INSTANCE;
                            }

                            static final Unit ChatScreen$lambda$50$lambda$49$lambda$48(AppHaptics $haptics, Function0 $onClearConversation, MutableState $showClearDialog$delegate) {
                                $haptics.perform(HapticCue.DESTRUCTIVE);
                                ChatScreen$lambda$9($showClearDialog$delegate, false);
                                $onClearConversation.invoke();
                                return Unit.INSTANCE;
                            }

                            static final Unit ChatScreen$lambda$53(final AppHaptics $haptics, final MutableState $showClearDialog$delegate, Composer $composer, int $changed) {
                                ComposerKt.sourceInformation($composer, "C319@13026L114,319@13005L164:ChatScreen.kt#cyjvf");
                                if ($composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-196865007, $changed, -1, "com.luchime.huiyuan.ui.ChatScreen.<anonymous> (ChatScreen.kt:319)");
                                    }
                                    ComposerKt.sourceInformationMarkerStart($composer, -208709341, "CC(remember):ChatScreen.kt#9igjgp");
                                    boolean zChangedInstance = $composer.changedInstance($haptics);
                                    Object objRememberedValue = $composer.rememberedValue();
                                    if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                        Object obj = new Function0() { // from class: com.luchime.huiyuan.ui.ChatScreenKt$$ExternalSyntheticLambda25
                                            @Override // kotlin.jvm.functions.Function0
                                            public final Object invoke() {
                                                return ChatScreenKt.ChatScreen$lambda$53$lambda$52$lambda$51($haptics, $showClearDialog$delegate);
                                            }
                                        };
                                        $composer.updateRememberedValue(obj);
                                        objRememberedValue = obj;
                                    }
                                    ComposerKt.sourceInformationMarkerEnd($composer);
                                    ButtonKt.TextButton((Function0) objRememberedValue, null, false, null, null, null, null, null, null, ComposableSingletons$ChatScreenKt.INSTANCE.m7404getLambda$1320283468$app(), $composer, 805306368, 510);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                } else {
                                    $composer.skipToGroupEnd();
                                }
                                return Unit.INSTANCE;
                            }

                            static final Unit ChatScreen$lambda$53$lambda$52$lambda$51(AppHaptics $haptics, MutableState $showClearDialog$delegate) {
                                $haptics.perform(HapticCue.TAP);
                                ChatScreen$lambda$9($showClearDialog$delegate, false);
                                return Unit.INSTANCE;
                            }

                            /* JADX WARN: Code duplicated, block: B:63:0x0350  */
                            /* JADX WARN: Code duplicated, block: B:66:0x035c  */
                            /* JADX WARN: Code duplicated, block: B:67:0x0362  */
                            /* JADX WARN: Code duplicated, block: B:78:0x0471  */
                            private static final void CollapsingModelHeader(final AIModel selectedModel, final float progress, Modifier modifier, Composer $composer, final int $changed, final int i) {
                                Modifier modifier2;
                                Composer $composer2;
                                final Modifier modifier3;
                                Modifier.Companion modifier4;
                                int currentCompositeKeyHash;
                                Function0<ComposeUiNode> constructor;
                                Function0<ComposeUiNode> function0;
                                Composer composerM3808constructorimpl;
                                Composer $composer3 = $composer.startRestartGroup(1090757773);
                                ComposerKt.sourceInformation($composer3, "C(CollapsingModelHeader)P(2,1)343@13673L106,340@13585L1410:ChatScreen.kt#cyjvf");
                                int $dirty = $changed;
                                if (($changed & 6) == 0) {
                                    $dirty |= $composer3.changed(selectedModel.ordinal()) ? 4 : 2;
                                }
                                if (($changed & 48) == 0) {
                                    $dirty |= $composer3.changed(progress) ? 32 : 16;
                                }
                                int i2 = i & 4;
                                if (i2 != 0) {
                                    $dirty |= 384;
                                    modifier2 = modifier;
                                } else if (($changed & 384) == 0) {
                                    modifier2 = modifier;
                                    $dirty |= $composer3.changed(modifier2) ? 256 : 128;
                                } else {
                                    modifier2 = modifier;
                                }
                                int $dirty2 = $dirty;
                                if (!$composer3.shouldExecute(($dirty2 & 147) != 146, $dirty2 & 1)) {
                                    $composer2 = $composer3;
                                    $composer2.skipToGroupEnd();
                                    modifier3 = modifier2;
                                } else {
                                    if (i2 != 0) {
                                        modifier4 = Modifier.INSTANCE;
                                    } else {
                                        modifier4 = modifier2;
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(1090757773, $dirty2, -1, "com.luchime.huiyuan.ui.CollapsingModelHeader (ChatScreen.kt:335)");
                                    }
                                    final float visibility = RangesKt.coerceIn((progress - 0.12f) / 0.88f, 0.0f, 1.0f);
                                    float avatarSize = Dp.m6973constructorimpl(62.0f - (24.0f * progress));
                                    long titleSize = TextUnitKt.getSp(30.0f - (11.0f * progress));
                                    Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(modifier4, 0.0f, 1, null);
                                    ComposerKt.sourceInformationMarkerStart($composer3, 246212119, "CC(remember):ChatScreen.kt#9igjgp");
                                    boolean zChanged = $composer3.changed(visibility);
                                    Object objRememberedValue = $composer3.rememberedValue();
                                    if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                        Object obj = new Function1() { // from class: com.luchime.huiyuan.ui.ChatScreenKt$$ExternalSyntheticLambda40
                                            @Override // kotlin.jvm.functions.Function1
                                            public final Object invoke(Object obj2) {
                                                return ChatScreenKt.CollapsingModelHeader$lambda$56$lambda$55(visibility, (GraphicsLayerScope) obj2);
                                            }
                                        };
                                        $composer3.updateRememberedValue(obj);
                                        objRememberedValue = obj;
                                    }
                                    ComposerKt.sourceInformationMarkerEnd($composer3);
                                    Modifier modifierM726paddingVpY3zN4 = PaddingKt.m726paddingVpY3zN4(WindowInsetsPadding_androidKt.statusBarsPadding(BorderKt.m245borderxT4_qwU(BackgroundKt.m234backgroundbw27NRU$default(GraphicsLayerModifierKt.graphicsLayer(modifierFillMaxWidth$default, (Function1) objRememberedValue), HuiyuanDesignKt.getPaper(), null, 2, null), Dp.m6973constructorimpl(0), Color.INSTANCE.m4401getTransparent0d7_KjU(), RectangleShapeKt.getRectangleShape())), Dp.m6973constructorimpl(16), Dp.m6973constructorimpl(8));
                                    Arrangement.Horizontal spaceBetween = Arrangement.INSTANCE.getSpaceBetween();
                                    Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
                                    ComposerKt.sourceInformationMarkerStart($composer3, 693286680, "CC(Row)P(2,1,3)99@5124L58,100@5187L130:Row.kt#2w3rfo");
                                    MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(spaceBetween, centerVertically, $composer3, ((432 >> 3) & 14) | ((432 >> 3) & 112));
                                    ComposerKt.sourceInformationMarkerStart($composer3, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                                    int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash($composer3, 0);
                                    CompositionLocalMap currentCompositionLocalMap = $composer3.getCurrentCompositionLocalMap();
                                    Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier($composer3, modifierM726paddingVpY3zN4);
                                    Function0<ComposeUiNode> constructor2 = ComposeUiNode.INSTANCE.getConstructor();
                                    int i3 = ((((432 << 3) & 112) << 6) & 896) | 6;
                                    Modifier modifier5 = modifier4;
                                    ComposerKt.sourceInformationMarkerStart($composer3, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
                                    if (!($composer3.getApplier() instanceof Applier)) {
                                        ComposablesKt.invalidApplier();
                                    }
                                    $composer3.startReusableNode();
                                    if ($composer3.getInserting()) {
                                        $composer3.createNode(constructor2);
                                    } else {
                                        $composer3.useNode();
                                    }
                                    Composer composerM3808constructorimpl2 = Updater.m3808constructorimpl($composer3);
                                    Updater.m3815setimpl(composerM3808constructorimpl2, measurePolicyRowMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                    Updater.m3815setimpl(composerM3808constructorimpl2, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                                    if (composerM3808constructorimpl2.getInserting()) {
                                        $composer2 = $composer3;
                                    } else {
                                        $composer2 = $composer3;
                                        if (!Intrinsics.areEqual(composerM3808constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                                        }
                                        Updater.m3815setimpl(composerM3808constructorimpl2, modifierMaterializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
                                        int i4 = (i3 >> 6) & 14;
                                        ComposerKt.sourceInformationMarkerStart($composer3, -407735110, "C101@5232L9:Row.kt#2w3rfo");
                                        int i5 = ((432 >> 6) & 112) | 6;
                                        RowScope rowScope = RowScopeInstance.INSTANCE;
                                        ComposerKt.sourceInformationMarkerStart($composer3, -1296023862, "C354@14117L314,364@14440L549:ChatScreen.kt#cyjvf");
                                        TextKt.m2820Text4IGK_g(selectedModel.getDisplayName(), RowScope.weight$default(rowScope, Modifier.INSTANCE, 1.0f, false, 2, null), HuiyuanDesignKt.getInk(), titleSize, (FontStyle) null, FontWeight.INSTANCE.getBlack(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, titleSize, TextOverflow.INSTANCE.m6887getEllipsisgIe3tQ8(), false, 1, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, $composer3, 196992, 3120, 119760);
                                        Modifier modifierClip = ClipKt.clip(PaddingKt.m725padding3ABfNKs(BorderKt.m245borderxT4_qwU(BackgroundKt.m233backgroundbw27NRU(SizeKt.m772size3ABfNKs(Modifier.INSTANCE, avatarSize), modelAccent(selectedModel), RoundedCornerShapeKt.getCircleShape()), Dp.m6973constructorimpl(2), HuiyuanDesignKt.getInk(), RoundedCornerShapeKt.getCircleShape()), Dp.m6973constructorimpl(2)), RoundedCornerShapeKt.getCircleShape());
                                        ComposerKt.sourceInformationMarkerStart($composer3, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
                                        MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                                        ComposerKt.sourceInformationMarkerStart($composer3, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                                        currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash($composer3, 0);
                                        CompositionLocalMap currentCompositionLocalMap2 = $composer3.getCurrentCompositionLocalMap();
                                        Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier($composer3, modifierClip);
                                        constructor = ComposeUiNode.INSTANCE.getConstructor();
                                        int i6 = ((((0 << 3) & 112) << 6) & 896) | 6;
                                        ComposerKt.sourceInformationMarkerStart($composer3, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
                                        if (!($composer3.getApplier() instanceof Applier)) {
                                            ComposablesKt.invalidApplier();
                                        }
                                        $composer3.startReusableNode();
                                        if ($composer3.getInserting()) {
                                            function0 = constructor;
                                            $composer3.createNode(function0);
                                        } else {
                                            function0 = constructor;
                                            $composer3.useNode();
                                        }
                                        composerM3808constructorimpl = Updater.m3808constructorimpl($composer3);
                                        Updater.m3815setimpl(composerM3808constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                        Updater.m3815setimpl(composerM3808constructorimpl, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                                        if (!composerM3808constructorimpl.getInserting() || !Intrinsics.areEqual(composerM3808constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                            composerM3808constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                            composerM3808constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash2);
                                        }
                                        Updater.m3815setimpl(composerM3808constructorimpl, modifierMaterializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
                                        int i7 = (i6 >> 6) & 14;
                                        ComposerKt.sourceInformationMarkerStart($composer3, -2146730711, "C72@3468L9:Box.kt#2w3rfo");
                                        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                                        int i8 = ((0 >> 6) & 112) | 6;
                                        ComposerKt.sourceInformationMarkerStart($composer3, 1275472775, "C373@14751L40,372@14718L261:ChatScreen.kt#cyjvf");
                                        ImageKt.Image(PainterResources_androidKt.painterResource(selectedModel.getAvatarRes(), $composer3, 0), selectedModel.getDisplayName() + "缩略头像", SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), (Alignment) null, ContentScale.INSTANCE.getCrop(), 0.0f, (ColorFilter) null, $composer3, 24960, LocationRequestCompat.QUALITY_LOW_POWER);
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
                                        modifier3 = modifier5;
                                    }
                                    composerM3808constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                                    composerM3808constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash);
                                    Updater.m3815setimpl(composerM3808constructorimpl2, modifierMaterializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
                                    int i9 = (i3 >> 6) & 14;
                                    ComposerKt.sourceInformationMarkerStart($composer3, -407735110, "C101@5232L9:Row.kt#2w3rfo");
                                    int i10 = ((432 >> 6) & 112) | 6;
                                    RowScope rowScope2 = RowScopeInstance.INSTANCE;
                                    ComposerKt.sourceInformationMarkerStart($composer3, -1296023862, "C354@14117L314,364@14440L549:ChatScreen.kt#cyjvf");
                                    TextKt.m2820Text4IGK_g(selectedModel.getDisplayName(), RowScope.weight$default(rowScope2, Modifier.INSTANCE, 1.0f, false, 2, null), HuiyuanDesignKt.getInk(), titleSize, (FontStyle) null, FontWeight.INSTANCE.getBlack(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, titleSize, TextOverflow.INSTANCE.m6887getEllipsisgIe3tQ8(), false, 1, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, $composer3, 196992, 3120, 119760);
                                    Modifier modifierClip2 = ClipKt.clip(PaddingKt.m725padding3ABfNKs(BorderKt.m245borderxT4_qwU(BackgroundKt.m233backgroundbw27NRU(SizeKt.m772size3ABfNKs(Modifier.INSTANCE, avatarSize), modelAccent(selectedModel), RoundedCornerShapeKt.getCircleShape()), Dp.m6973constructorimpl(2), HuiyuanDesignKt.getInk(), RoundedCornerShapeKt.getCircleShape()), Dp.m6973constructorimpl(2)), RoundedCornerShapeKt.getCircleShape());
                                    ComposerKt.sourceInformationMarkerStart($composer3, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
                                    MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                                    ComposerKt.sourceInformationMarkerStart($composer3, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                                    currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash($composer3, 0);
                                    CompositionLocalMap currentCompositionLocalMap3 = $composer3.getCurrentCompositionLocalMap();
                                    Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier($composer3, modifierClip2);
                                    constructor = ComposeUiNode.INSTANCE.getConstructor();
                                    int i11 = ((((0 << 3) & 112) << 6) & 896) | 6;
                                    ComposerKt.sourceInformationMarkerStart($composer3, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
                                    if (!($composer3.getApplier() instanceof Applier)) {
                                        ComposablesKt.invalidApplier();
                                    }
                                    $composer3.startReusableNode();
                                    if ($composer3.getInserting()) {
                                        function0 = constructor;
                                        $composer3.createNode(function0);
                                    } else {
                                        function0 = constructor;
                                        $composer3.useNode();
                                    }
                                    composerM3808constructorimpl = Updater.m3808constructorimpl($composer3);
                                    Updater.m3815setimpl(composerM3808constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                    Updater.m3815setimpl(composerM3808constructorimpl, currentCompositionLocalMap3, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                                    if (!composerM3808constructorimpl.getInserting()) {
                                    }
                                    composerM3808constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                    composerM3808constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash3);
                                    Updater.m3815setimpl(composerM3808constructorimpl, modifierMaterializeModifier3, ComposeUiNode.INSTANCE.getSetModifier());
                                    int i12 = (i11 >> 6) & 14;
                                    ComposerKt.sourceInformationMarkerStart($composer3, -2146730711, "C72@3468L9:Box.kt#2w3rfo");
                                    BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                                    int i13 = ((0 >> 6) & 112) | 6;
                                    ComposerKt.sourceInformationMarkerStart($composer3, 1275472775, "C373@14751L40,372@14718L261:ChatScreen.kt#cyjvf");
                                    ImageKt.Image(PainterResources_androidKt.painterResource(selectedModel.getAvatarRes(), $composer3, 0), selectedModel.getDisplayName() + "缩略头像", SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), (Alignment) null, ContentScale.INSTANCE.getCrop(), 0.0f, (ColorFilter) null, $composer3, 24960, LocationRequestCompat.QUALITY_LOW_POWER);
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
                                    modifier3 = modifier5;
                                }
                                ScopeUpdateScope scopeUpdateScopeEndRestartGroup = $composer2.endRestartGroup();
                                if (scopeUpdateScopeEndRestartGroup != null) {
                                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.luchime.huiyuan.ui.ChatScreenKt$$ExternalSyntheticLambda41
                                        @Override // kotlin.jvm.functions.Function2
                                        public final Object invoke(Object obj2, Object obj3) {
                                            return ChatScreenKt.CollapsingModelHeader$lambda$59(selectedModel, progress, modifier3, $changed, i, (Composer) obj2, ((Integer) obj3).intValue());
                                        }
                                    });
                                }
                            }

                            static final Unit CollapsingModelHeader$lambda$56$lambda$55(float $visibility, GraphicsLayerScope graphicsLayer) {
                                Intrinsics.checkNotNullParameter(graphicsLayer, "$this$graphicsLayer");
                                graphicsLayer.setAlpha($visibility);
                                graphicsLayer.setTranslationY((1.0f - $visibility) * (-12.0f));
                                return Unit.INSTANCE;
                            }

                            /* JADX WARN: Code duplicated, block: B:49:0x02b9  */
                            /* JADX WARN: Code duplicated, block: B:52:0x02c5  */
                            /* JADX WARN: Code duplicated, block: B:53:0x02c9  */
                            /* JADX WARN: Code duplicated, block: B:64:0x0537  */
                            /* JADX WARN: Code duplicated, block: B:67:0x0543  */
                            /* JADX WARN: Code duplicated, block: B:68:0x0549  */
                            /* JADX WARN: Code duplicated, block: B:79:0x06b0  */
                            private static final void HeroHeader(AIModel selectedModel, Function1<? super AIModel, Unit> function1, boolean enabled, Composer $composer, final int $changed) {
                                final AIModel aIModel;
                                Composer $composer2;
                                Function0<ComposeUiNode> function0;
                                String str;
                                int currentCompositeKeyHash;
                                Function0<ComposeUiNode> constructor;
                                Composer composerM3808constructorimpl;
                                int currentCompositeKeyHash2;
                                Function0<ComposeUiNode> constructor2;
                                Function0<ComposeUiNode> function2;
                                Composer composerM3808constructorimpl2;
                                final Function1<? super AIModel, Unit> function3 = function1;
                                final boolean z = enabled;
                                Composer $composer3 = $composer.startRestartGroup(-1505787758);
                                ComposerKt.sourceInformation($composer3, "C(HeroHeader)P(2,1)388@15132L2560:ChatScreen.kt#cyjvf");
                                int $dirty = $changed;
                                if (($changed & 6) == 0) {
                                    $dirty |= $composer3.changed(selectedModel.ordinal()) ? 4 : 2;
                                }
                                if (($changed & 48) == 0) {
                                    $dirty |= $composer3.changedInstance(function3) ? 32 : 16;
                                }
                                if (($changed & 384) == 0) {
                                    $dirty |= $composer3.changed(z) ? 256 : 128;
                                }
                                int $dirty2 = $dirty;
                                if (!$composer3.shouldExecute(($dirty2 & 147) != 146, $dirty2 & 1)) {
                                    aIModel = selectedModel;
                                    $composer2 = $composer3;
                                    $composer2.skipToGroupEnd();
                                } else {
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-1505787758, $dirty2, -1, "com.luchime.huiyuan.ui.HeroHeader (ChatScreen.kt:387)");
                                    }
                                    Modifier modifierM726paddingVpY3zN4 = PaddingKt.m726paddingVpY3zN4(WindowInsetsPadding_androidKt.statusBarsPadding(BackgroundKt.background$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), Brush.INSTANCE.m4327linearGradientmHitzGk((List<Color>) CollectionsKt.listOf((Object[]) new Color[]{Color.m4356boximpl(HuiyuanDesignKt.getSignalYellow()), Color.m4356boximpl(ColorKt.Color(4294948142L)), Color.m4356boximpl(HuiyuanDesignKt.getSignalPink())}), (14 & 2) != 0 ? Offset.Companion.m4141getZeroF1C5BW0() : 0L, (14 & 4) != 0 ? Offset.Companion.m4139getInfiniteF1C5BW0() : 0L, (14 & 8) != 0 ? TileMode.Companion.m4739getClamp3opZhB0() : 0), null, 0.0f, 6, null)), Dp.m6973constructorimpl(18), Dp.m6973constructorimpl(18));
                                    ComposerKt.sourceInformationMarkerStart($composer3, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
                                    MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                                    ComposerKt.sourceInformationMarkerStart($composer3, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                                    int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash($composer3, 0);
                                    CompositionLocalMap currentCompositionLocalMap = $composer3.getCurrentCompositionLocalMap();
                                    Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier($composer3, modifierM726paddingVpY3zN4);
                                    Function0<ComposeUiNode> constructor3 = ComposeUiNode.INSTANCE.getConstructor();
                                    $composer2 = $composer3;
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
                                    Updater.m3815setimpl(composerM3808constructorimpl3, measurePolicyMaybeCachedBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                    Updater.m3815setimpl(composerM3808constructorimpl3, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                                    if (composerM3808constructorimpl3.getInserting()) {
                                        str = "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo";
                                    } else {
                                        str = "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo";
                                        if (!Intrinsics.areEqual(composerM3808constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                                        }
                                        Updater.m3815setimpl(composerM3808constructorimpl3, modifierMaterializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
                                        int i2 = (i >> 6) & 14;
                                        ComposerKt.sourceInformationMarkerStart($composer3, -2146730711, "C72@3468L9:Box.kt#2w3rfo");
                                        int i3 = ((0 >> 6) & 112) | 6;
                                        BoxScope boxScope = BoxScopeInstance.INSTANCE;
                                        ComposerKt.sourceInformationMarkerStart($composer3, -935803094, "C399@15477L182,407@15669L1097,441@16776L658,461@17444L242:ChatScreen.kt#cyjvf");
                                        TextKt.m2820Text4IGK_g("✦", RotateKt.rotate(Modifier.INSTANCE, -10.0f), HuiyuanDesignKt.getInk(), TextUnitKt.getSp(25), (FontStyle) null, FontWeight.INSTANCE.getBlack(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, $composer3, 200070, 0, 131024);
                                        Modifier modifierFillMaxWidth = SizeKt.fillMaxWidth(PaddingKt.m729paddingqDBjuR0$default(boxScope.align(Modifier.INSTANCE, Alignment.INSTANCE.getCenterStart()), 0.0f, Dp.m6973constructorimpl(24), 0.0f, 0.0f, 13, null), 0.64f);
                                        ComposerKt.sourceInformationMarkerStart($composer3, -483455358, "CC(Column)P(2,3,1)87@4442L61,88@4508L133:Column.kt#2w3rfo");
                                        MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), $composer3, ((0 >> 3) & 14) | ((0 >> 3) & 112));
                                        ComposerKt.sourceInformationMarkerStart($composer3, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                                        currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash($composer3, 0);
                                        CompositionLocalMap currentCompositionLocalMap2 = $composer3.getCurrentCompositionLocalMap();
                                        Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier($composer3, modifierFillMaxWidth);
                                        constructor = ComposeUiNode.INSTANCE.getConstructor();
                                        int i4 = ((((0 << 3) & 112) << 6) & 896) | 6;
                                        ComposerKt.sourceInformationMarkerStart($composer3, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
                                        if (!($composer3.getApplier() instanceof Applier)) {
                                            ComposablesKt.invalidApplier();
                                        }
                                        $composer3.startReusableNode();
                                        if ($composer3.getInserting()) {
                                            $composer3.createNode(constructor);
                                        } else {
                                            $composer3.useNode();
                                        }
                                        composerM3808constructorimpl = Updater.m3808constructorimpl($composer3);
                                        Updater.m3815setimpl(composerM3808constructorimpl, measurePolicyColumnMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                        Updater.m3815setimpl(composerM3808constructorimpl, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                                        if (!composerM3808constructorimpl.getInserting() || !Intrinsics.areEqual(composerM3808constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                            composerM3808constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                            composerM3808constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash2);
                                        }
                                        Updater.m3815setimpl(composerM3808constructorimpl, modifierMaterializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
                                        int i5 = (i4 >> 6) & 14;
                                        ComposerKt.sourceInformationMarkerStart($composer3, -384672921, "C89@4556L9:Column.kt#2w3rfo");
                                        ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                                        int i6 = ((0 >> 6) & 112) | 6;
                                        ComposerKt.sourceInformationMarkerStart($composer3, -1197525201, "C413@15854L54,414@15921L29,415@15963L257,423@16233L254,431@16500L29,432@16542L214:ChatScreen.kt#cyjvf");
                                        aIModel = selectedModel;
                                        z = enabled;
                                        function3 = function1;
                                        ModelSelector(aIModel, function3, z, $composer3, ($dirty2 & 896) | ($dirty2 & 14) | ($dirty2 & 112), 0);
                                        SpacerKt.Spacer(SizeKt.m758height3ABfNKs(Modifier.INSTANCE, Dp.m6973constructorimpl(8)), $composer3, 6);
                                        TextKt.m2820Text4IGK_g(aIModel.getDisplayName(), (Modifier) null, HuiyuanDesignKt.getInk(), TextUnitKt.getSp(38), (FontStyle) null, FontWeight.INSTANCE.getBlack(), (FontFamily) null, TextUnitKt.getSp(-1.5d), (TextDecoration) null, (TextAlign) null, TextUnitKt.getSp(40), 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, $composer3, 200064, 6, 129874);
                                        TextKt.m2820Text4IGK_g(heroEnglish(aIModel), (Modifier) null, HuiyuanDesignKt.getInk(), TextUnitKt.getSp(10), (FontStyle) null, FontWeight.INSTANCE.getBold(), (FontFamily) null, TextUnitKt.getSp(1.2d), (TextDecoration) null, (TextAlign) null, TextUnitKt.getSp(13), 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, $composer3, 12782976, 6, 129874);
                                        SpacerKt.Spacer(SizeKt.m758height3ABfNKs(Modifier.INSTANCE, Dp.m6973constructorimpl(9)), $composer3, 6);
                                        TextKt.m2820Text4IGK_g(heroSummary(aIModel), (Modifier) null, HuiyuanDesignKt.getInk(), TextUnitKt.getSp(13), (FontStyle) null, FontWeight.INSTANCE.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, TextUnitKt.getSp(19), 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, $composer3, 200064, 6, 130002);
                                        ComposerKt.sourceInformationMarkerEnd($composer3);
                                        ComposerKt.sourceInformationMarkerEnd($composer3);
                                        $composer3.endNode();
                                        ComposerKt.sourceInformationMarkerEnd($composer3);
                                        ComposerKt.sourceInformationMarkerEnd($composer3);
                                        ComposerKt.sourceInformationMarkerEnd($composer3);
                                        Modifier modifierClip = ClipKt.clip(BackgroundKt.m233backgroundbw27NRU(PaddingKt.m725padding3ABfNKs(BackgroundKt.m233backgroundbw27NRU(SizeKt.m772size3ABfNKs(PaddingKt.m729paddingqDBjuR0$default(boxScope.align(Modifier.INSTANCE, Alignment.INSTANCE.getCenterEnd()), 0.0f, Dp.m6973constructorimpl(10), 0.0f, 0.0f, 13, null), Dp.m6973constructorimpl(128)), HuiyuanDesignKt.getInk(), RoundedCornerShapeKt.getCircleShape()), Dp.m6973constructorimpl(3)), HuiyuanDesignKt.getCream(), RoundedCornerShapeKt.getCircleShape()), RoundedCornerShapeKt.getCircleShape());
                                        ComposerKt.sourceInformationMarkerStart($composer3, 733328855, str);
                                        MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                                        ComposerKt.sourceInformationMarkerStart($composer3, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                                        currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash($composer3, 0);
                                        CompositionLocalMap currentCompositionLocalMap3 = $composer3.getCurrentCompositionLocalMap();
                                        Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier($composer3, modifierClip);
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
                                        Updater.m3815setimpl(composerM3808constructorimpl2, measurePolicyMaybeCachedBoxMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
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
                                        ComposerKt.sourceInformationMarkerStart($composer3, 999158410, "C452@17142L40,451@17109L315:ChatScreen.kt#cyjvf");
                                        ImageKt.Image(PainterResources_androidKt.painterResource(aIModel.getAvatarRes(), $composer3, 0), aIModel.getDisplayName() + "头像", PaddingKt.m725padding3ABfNKs(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), Dp.m6973constructorimpl(2)), (Alignment) null, ContentScale.INSTANCE.getCrop(), 0.0f, (ColorFilter) null, $composer3, 24960, LocationRequestCompat.QUALITY_LOW_POWER);
                                        ComposerKt.sourceInformationMarkerEnd($composer3);
                                        ComposerKt.sourceInformationMarkerEnd($composer3);
                                        $composer3.endNode();
                                        ComposerKt.sourceInformationMarkerEnd($composer3);
                                        ComposerKt.sourceInformationMarkerEnd($composer3);
                                        ComposerKt.sourceInformationMarkerEnd($composer3);
                                        TextKt.m2820Text4IGK_g("✦", RotateKt.rotate(boxScope.align(Modifier.INSTANCE, Alignment.INSTANCE.getBottomEnd()), 12.0f), HuiyuanDesignKt.getInk(), TextUnitKt.getSp(20), (FontStyle) null, FontWeight.INSTANCE.getBlack(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, $composer3, 200070, 0, 131024);
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
                                    ComposerKt.sourceInformationMarkerStart($composer3, -2146730711, "C72@3468L9:Box.kt#2w3rfo");
                                    int i11 = ((0 >> 6) & 112) | 6;
                                    BoxScope boxScope2 = BoxScopeInstance.INSTANCE;
                                    ComposerKt.sourceInformationMarkerStart($composer3, -935803094, "C399@15477L182,407@15669L1097,441@16776L658,461@17444L242:ChatScreen.kt#cyjvf");
                                    TextKt.m2820Text4IGK_g("✦", RotateKt.rotate(Modifier.INSTANCE, -10.0f), HuiyuanDesignKt.getInk(), TextUnitKt.getSp(25), (FontStyle) null, FontWeight.INSTANCE.getBlack(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, $composer3, 200070, 0, 131024);
                                    Modifier modifierFillMaxWidth2 = SizeKt.fillMaxWidth(PaddingKt.m729paddingqDBjuR0$default(boxScope2.align(Modifier.INSTANCE, Alignment.INSTANCE.getCenterStart()), 0.0f, Dp.m6973constructorimpl(24), 0.0f, 0.0f, 13, null), 0.64f);
                                    ComposerKt.sourceInformationMarkerStart($composer3, -483455358, "CC(Column)P(2,3,1)87@4442L61,88@4508L133:Column.kt#2w3rfo");
                                    MeasurePolicy measurePolicyColumnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), $composer3, ((0 >> 3) & 14) | ((0 >> 3) & 112));
                                    ComposerKt.sourceInformationMarkerStart($composer3, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                                    currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash($composer3, 0);
                                    CompositionLocalMap currentCompositionLocalMap4 = $composer3.getCurrentCompositionLocalMap();
                                    Modifier modifierMaterializeModifier4 = ComposedModifierKt.materializeModifier($composer3, modifierFillMaxWidth2);
                                    constructor = ComposeUiNode.INSTANCE.getConstructor();
                                    int i12 = ((((0 << 3) & 112) << 6) & 896) | 6;
                                    ComposerKt.sourceInformationMarkerStart($composer3, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
                                    if (!($composer3.getApplier() instanceof Applier)) {
                                        ComposablesKt.invalidApplier();
                                    }
                                    $composer3.startReusableNode();
                                    if ($composer3.getInserting()) {
                                        $composer3.createNode(constructor);
                                    } else {
                                        $composer3.useNode();
                                    }
                                    composerM3808constructorimpl = Updater.m3808constructorimpl($composer3);
                                    Updater.m3815setimpl(composerM3808constructorimpl, measurePolicyColumnMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                    Updater.m3815setimpl(composerM3808constructorimpl, currentCompositionLocalMap4, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash4 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                                    if (!composerM3808constructorimpl.getInserting()) {
                                    }
                                    composerM3808constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                    composerM3808constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash4);
                                    Updater.m3815setimpl(composerM3808constructorimpl, modifierMaterializeModifier4, ComposeUiNode.INSTANCE.getSetModifier());
                                    int i13 = (i12 >> 6) & 14;
                                    ComposerKt.sourceInformationMarkerStart($composer3, -384672921, "C89@4556L9:Column.kt#2w3rfo");
                                    ColumnScopeInstance columnScopeInstance2 = ColumnScopeInstance.INSTANCE;
                                    int i14 = ((0 >> 6) & 112) | 6;
                                    ComposerKt.sourceInformationMarkerStart($composer3, -1197525201, "C413@15854L54,414@15921L29,415@15963L257,423@16233L254,431@16500L29,432@16542L214:ChatScreen.kt#cyjvf");
                                    aIModel = selectedModel;
                                    z = enabled;
                                    function3 = function1;
                                    ModelSelector(aIModel, function3, z, $composer3, ($dirty2 & 896) | ($dirty2 & 14) | ($dirty2 & 112), 0);
                                    SpacerKt.Spacer(SizeKt.m758height3ABfNKs(Modifier.INSTANCE, Dp.m6973constructorimpl(8)), $composer3, 6);
                                    TextKt.m2820Text4IGK_g(aIModel.getDisplayName(), (Modifier) null, HuiyuanDesignKt.getInk(), TextUnitKt.getSp(38), (FontStyle) null, FontWeight.INSTANCE.getBlack(), (FontFamily) null, TextUnitKt.getSp(-1.5d), (TextDecoration) null, (TextAlign) null, TextUnitKt.getSp(40), 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, $composer3, 200064, 6, 129874);
                                    TextKt.m2820Text4IGK_g(heroEnglish(aIModel), (Modifier) null, HuiyuanDesignKt.getInk(), TextUnitKt.getSp(10), (FontStyle) null, FontWeight.INSTANCE.getBold(), (FontFamily) null, TextUnitKt.getSp(1.2d), (TextDecoration) null, (TextAlign) null, TextUnitKt.getSp(13), 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, $composer3, 12782976, 6, 129874);
                                    SpacerKt.Spacer(SizeKt.m758height3ABfNKs(Modifier.INSTANCE, Dp.m6973constructorimpl(9)), $composer3, 6);
                                    TextKt.m2820Text4IGK_g(heroSummary(aIModel), (Modifier) null, HuiyuanDesignKt.getInk(), TextUnitKt.getSp(13), (FontStyle) null, FontWeight.INSTANCE.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, TextUnitKt.getSp(19), 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, $composer3, 200064, 6, 130002);
                                    ComposerKt.sourceInformationMarkerEnd($composer3);
                                    ComposerKt.sourceInformationMarkerEnd($composer3);
                                    $composer3.endNode();
                                    ComposerKt.sourceInformationMarkerEnd($composer3);
                                    ComposerKt.sourceInformationMarkerEnd($composer3);
                                    ComposerKt.sourceInformationMarkerEnd($composer3);
                                    Modifier modifierClip2 = ClipKt.clip(BackgroundKt.m233backgroundbw27NRU(PaddingKt.m725padding3ABfNKs(BackgroundKt.m233backgroundbw27NRU(SizeKt.m772size3ABfNKs(PaddingKt.m729paddingqDBjuR0$default(boxScope2.align(Modifier.INSTANCE, Alignment.INSTANCE.getCenterEnd()), 0.0f, Dp.m6973constructorimpl(10), 0.0f, 0.0f, 13, null), Dp.m6973constructorimpl(128)), HuiyuanDesignKt.getInk(), RoundedCornerShapeKt.getCircleShape()), Dp.m6973constructorimpl(3)), HuiyuanDesignKt.getCream(), RoundedCornerShapeKt.getCircleShape()), RoundedCornerShapeKt.getCircleShape());
                                    ComposerKt.sourceInformationMarkerStart($composer3, 733328855, str);
                                    MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy3 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                                    ComposerKt.sourceInformationMarkerStart($composer3, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                                    currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash($composer3, 0);
                                    CompositionLocalMap currentCompositionLocalMap5 = $composer3.getCurrentCompositionLocalMap();
                                    Modifier modifierMaterializeModifier5 = ComposedModifierKt.materializeModifier($composer3, modifierClip2);
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
                                    Updater.m3815setimpl(composerM3808constructorimpl2, measurePolicyMaybeCachedBoxMeasurePolicy3, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
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
                                    ComposerKt.sourceInformationMarkerStart($composer3, 999158410, "C452@17142L40,451@17109L315:ChatScreen.kt#cyjvf");
                                    ImageKt.Image(PainterResources_androidKt.painterResource(aIModel.getAvatarRes(), $composer3, 0), aIModel.getDisplayName() + "头像", PaddingKt.m725padding3ABfNKs(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), Dp.m6973constructorimpl(2)), (Alignment) null, ContentScale.INSTANCE.getCrop(), 0.0f, (ColorFilter) null, $composer3, 24960, LocationRequestCompat.QUALITY_LOW_POWER);
                                    ComposerKt.sourceInformationMarkerEnd($composer3);
                                    ComposerKt.sourceInformationMarkerEnd($composer3);
                                    $composer3.endNode();
                                    ComposerKt.sourceInformationMarkerEnd($composer3);
                                    ComposerKt.sourceInformationMarkerEnd($composer3);
                                    ComposerKt.sourceInformationMarkerEnd($composer3);
                                    TextKt.m2820Text4IGK_g("✦", RotateKt.rotate(boxScope2.align(Modifier.INSTANCE, Alignment.INSTANCE.getBottomEnd()), 12.0f), HuiyuanDesignKt.getInk(), TextUnitKt.getSp(20), (FontStyle) null, FontWeight.INSTANCE.getBlack(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, $composer3, 200070, 0, 131024);
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
                                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.luchime.huiyuan.ui.ChatScreenKt$$ExternalSyntheticLambda28
                                        @Override // kotlin.jvm.functions.Function2
                                        public final Object invoke(Object obj, Object obj2) {
                                            return ChatScreenKt.HeroHeader$lambda$63(aIModel, function3, z, $changed, (Composer) obj, ((Integer) obj2).intValue());
                                        }
                                    });
                                }
                            }

                            private static final void MarqueeStrip(final AIModel selectedModel, Composer $composer, final int $changed) {
                                Composer $composer2;
                                Function0<ComposeUiNode> function0;
                                List listListOf;
                                Composer $composer3 = $composer.startRestartGroup(-338384180);
                                ComposerKt.sourceInformation($composer3, "C(MarqueeStrip)479@17883L21,475@17763L891:ChatScreen.kt#cyjvf");
                                int $dirty = $changed;
                                if (($changed & 6) == 0) {
                                    $dirty |= $composer3.changed(selectedModel.ordinal()) ? 4 : 2;
                                }
                                if (!$composer3.shouldExecute(($dirty & 3) != 2, $dirty & 1)) {
                                    $composer2 = $composer3;
                                    $composer2.skipToGroupEnd();
                                } else {
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-338384180, $dirty, -1, "com.luchime.huiyuan.ui.MarqueeStrip (ChatScreen.kt:474)");
                                    }
                                    Modifier modifierM726paddingVpY3zN4 = PaddingKt.m726paddingVpY3zN4(ScrollKt.horizontalScroll$default(BackgroundKt.m234backgroundbw27NRU$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), HuiyuanDesignKt.getInk(), null, 2, null), ScrollKt.rememberScrollState(0, $composer3, 0, 1), false, null, false, 14, null), Dp.m6973constructorimpl(14), Dp.m6973constructorimpl(9));
                                    Arrangement.Horizontal horizontalM606spacedBy0680j_4 = Arrangement.INSTANCE.m606spacedBy0680j_4(Dp.m6973constructorimpl(18));
                                    ComposerKt.sourceInformationMarkerStart($composer3, 693286680, "CC(Row)P(2,1,3)99@5124L58,100@5187L130:Row.kt#2w3rfo");
                                    MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(horizontalM606spacedBy0680j_4, Alignment.INSTANCE.getTop(), $composer3, ((48 >> 3) & 14) | ((48 >> 3) & 112));
                                    ComposerKt.sourceInformationMarkerStart($composer3, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                                    int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash($composer3, 0);
                                    CompositionLocalMap currentCompositionLocalMap = $composer3.getCurrentCompositionLocalMap();
                                    Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier($composer3, modifierM726paddingVpY3zN4);
                                    Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                                    int i = ((((48 << 3) & 112) << 6) & 896) | 6;
                                    $composer2 = $composer3;
                                    ComposerKt.sourceInformationMarkerStart($composer3, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
                                    if (!($composer3.getApplier() instanceof Applier)) {
                                        ComposablesKt.invalidApplier();
                                    }
                                    $composer3.startReusableNode();
                                    if ($composer3.getInserting()) {
                                        function0 = constructor;
                                        $composer3.createNode(function0);
                                    } else {
                                        function0 = constructor;
                                        $composer3.useNode();
                                    }
                                    Composer composerM3808constructorimpl = Updater.m3808constructorimpl($composer3);
                                    Updater.m3815setimpl(composerM3808constructorimpl, measurePolicyRowMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                    Updater.m3815setimpl(composerM3808constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                                    if (composerM3808constructorimpl.getInserting() || !Intrinsics.areEqual(composerM3808constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                        composerM3808constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                        composerM3808constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                    }
                                    Updater.m3815setimpl(composerM3808constructorimpl, modifierMaterializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
                                    int i2 = (i >> 6) & 14;
                                    ComposerKt.sourceInformationMarkerStart($composer3, -407735110, "C101@5232L9:Row.kt#2w3rfo");
                                    RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                                    int i3 = ((48 >> 6) & 112) | 6;
                                    Composer composer = $composer3;
                                    ComposerKt.sourceInformationMarkerStart(composer, -1251504108, "C:ChatScreen.kt#cyjvf");
                                    switch (WhenMappings.$EnumSwitchMapping$0[selectedModel.ordinal()]) {
                                        case 1:
                                            listListOf = CollectionsKt.listOf((Object[]) new String[]{"天天进步", "困困智慧", "高认知语录", "认知升级", "破圈思维"});
                                            break;
                                        case 2:
                                            listListOf = CollectionsKt.listOf((Object[]) new String[]{"朴AI上线", "企鹅玩机", "deskpark", "热河路", "朴一朴"});
                                            break;
                                        case 3:
                                            listListOf = CollectionsKt.listOf((Object[]) new String[]{"卷毛龟", "RoboMaster", "养龟达人", "土家文化", "甜狗语录"});
                                            break;
                                        case 4:
                                            listListOf = CollectionsKt.listOf((Object[]) new String[]{"Linux老炮", "C语言", "魂系游戏", "长沙美食", "饿了"});
                                            break;
                                        default:
                                            throw new NoWhenBranchMatchedException();
                                    }
                                    composer.startReplaceGroup(-733096105);
                                    ComposerKt.sourceInformation(composer, "*490@18439L199");
                                    List list = listListOf;
                                    Iterator it = list.iterator();
                                    while (it.hasNext()) {
                                        Composer composer2 = composer;
                                        TextKt.m2820Text4IGK_g("★ " + ((String) it.next()), (Modifier) null, HuiyuanDesignKt.getSignalYellow(), TextUnitKt.getSp(12), (FontStyle) null, FontWeight.INSTANCE.getBlack(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 1, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, 200064, 3072, 122834);
                                        listListOf = listListOf;
                                        composer = composer2;
                                        list = list;
                                    }
                                    Composer composer3 = composer;
                                    composer3.endReplaceGroup();
                                    ComposerKt.sourceInformationMarkerEnd(composer3);
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
                                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.luchime.huiyuan.ui.ChatScreenKt$$ExternalSyntheticLambda26
                                        @Override // kotlin.jvm.functions.Function2
                                        public final Object invoke(Object obj, Object obj2) {
                                            return ChatScreenKt.MarqueeStrip$lambda$66(selectedModel, $changed, (Composer) obj, ((Integer) obj2).intValue());
                                        }
                                    });
                                }
                            }

                            private static final void ConversationToolbar(final int messageCount, final boolean compact, Function0<Unit> function0, Composer $composer, final int $changed) {
                                Composer $composer2;
                                Function0<ComposeUiNode> function1;
                                Function0<ComposeUiNode> function2;
                                final Function0<Unit> function3 = function0;
                                Composer $composer3 = $composer.startRestartGroup(-1408383376);
                                ComposerKt.sourceInformation($composer3, "C(ConversationToolbar)P(1)503@18766L938:ChatScreen.kt#cyjvf");
                                int $dirty = $changed;
                                if (($changed & 6) == 0) {
                                    $dirty |= $composer3.changed(messageCount) ? 4 : 2;
                                }
                                if (($changed & 48) == 0) {
                                    $dirty |= $composer3.changed(compact) ? 32 : 16;
                                }
                                if (($changed & 384) == 0) {
                                    $dirty |= $composer3.changedInstance(function3) ? 256 : 128;
                                }
                                int $dirty2 = $dirty;
                                if ($composer3.shouldExecute(($dirty2 & 147) != 146, $dirty2 & 1)) {
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-1408383376, $dirty2, -1, "com.luchime.huiyuan.ui.ConversationToolbar (ChatScreen.kt:502)");
                                    }
                                    Modifier modifierM726paddingVpY3zN4 = PaddingKt.m726paddingVpY3zN4(BackgroundKt.m234backgroundbw27NRU$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), HuiyuanDesignKt.getPaper(), null, 2, null), Dp.m6973constructorimpl(16), compact ? Dp.m6973constructorimpl(6) : Dp.m6973constructorimpl(10));
                                    Arrangement.Horizontal spaceBetween = Arrangement.INSTANCE.getSpaceBetween();
                                    Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
                                    ComposerKt.sourceInformationMarkerStart($composer3, 693286680, "CC(Row)P(2,1,3)99@5124L58,100@5187L130:Row.kt#2w3rfo");
                                    MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(spaceBetween, centerVertically, $composer3, ((432 >> 3) & 14) | ((432 >> 3) & 112));
                                    ComposerKt.sourceInformationMarkerStart($composer3, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                                    int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash($composer3, 0);
                                    CompositionLocalMap currentCompositionLocalMap = $composer3.getCurrentCompositionLocalMap();
                                    Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier($composer3, modifierM726paddingVpY3zN4);
                                    Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                                    int i = ((((432 << 3) & 112) << 6) & 896) | 6;
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
                                    Composer composerM3808constructorimpl = Updater.m3808constructorimpl($composer3);
                                    $composer2 = $composer3;
                                    Updater.m3815setimpl(composerM3808constructorimpl, measurePolicyRowMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                    Updater.m3815setimpl(composerM3808constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                                    if (composerM3808constructorimpl.getInserting() || !Intrinsics.areEqual(composerM3808constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                        composerM3808constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                        composerM3808constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                    }
                                    Updater.m3815setimpl(composerM3808constructorimpl, modifierMaterializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
                                    int i2 = (i >> 6) & 14;
                                    ComposerKt.sourceInformationMarkerStart($composer3, -407735110, "C101@5232L9:Row.kt#2w3rfo");
                                    RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                                    int i3 = ((432 >> 6) & 112) | 6;
                                    ComposerKt.sourceInformationMarkerStart($composer3, -53628477, "C511@19070L184,515@19263L435:ChatScreen.kt#cyjvf");
                                    ComposerKt.sourceInformationMarkerStart($composer3, -483455358, "CC(Column)P(2,3,1)87@4442L61,88@4508L133:Column.kt#2w3rfo");
                                    Modifier modifier = Modifier.INSTANCE;
                                    MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), $composer3, ((0 >> 3) & 14) | ((0 >> 3) & 112));
                                    ComposerKt.sourceInformationMarkerStart($composer3, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                                    int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash($composer3, 0);
                                    CompositionLocalMap currentCompositionLocalMap2 = $composer3.getCurrentCompositionLocalMap();
                                    Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier($composer3, modifier);
                                    Function0<ComposeUiNode> constructor2 = ComposeUiNode.INSTANCE.getConstructor();
                                    int i4 = ((((0 << 3) & 112) << 6) & 896) | 6;
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
                                    Composer composerM3808constructorimpl2 = Updater.m3808constructorimpl($composer3);
                                    Updater.m3815setimpl(composerM3808constructorimpl2, measurePolicyColumnMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                    Updater.m3815setimpl(composerM3808constructorimpl2, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                                    if (composerM3808constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM3808constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                                        composerM3808constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                                        composerM3808constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                                    }
                                    Updater.m3815setimpl(composerM3808constructorimpl2, modifierMaterializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
                                    int i5 = (i4 >> 6) & 14;
                                    ComposerKt.sourceInformationMarkerStart($composer3, -384672921, "C89@4556L9:Column.kt#2w3rfo");
                                    ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                                    int i6 = ((0 >> 6) & 112) | 6;
                                    ComposerKt.sourceInformationMarkerStart($composer3, 600323892, "C512@19091L74,513@19178L66:ChatScreen.kt#cyjvf");
                                    TextKt.m2820Text4IGK_g("当前对话", (Modifier) null, HuiyuanDesignKt.getInk(), TextUnitKt.getSp(15), (FontStyle) null, FontWeight.INSTANCE.getBlack(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, $composer3, 200070, 0, 131026);
                                    TextKt.m2820Text4IGK_g("已保留 " + messageCount + " 条消息", (Modifier) null, HuiyuanDesignKt.getMutedText(), TextUnitKt.getSp(11), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, $composer3, 3456, 0, 131058);
                                    ComposerKt.sourceInformationMarkerEnd($composer3);
                                    ComposerKt.sourceInformationMarkerEnd($composer3);
                                    $composer3.endNode();
                                    ComposerKt.sourceInformationMarkerEnd($composer3);
                                    ComposerKt.sourceInformationMarkerEnd($composer3);
                                    ComposerKt.sourceInformationMarkerEnd($composer3);
                                    function3 = function0;
                                    TextKt.m2820Text4IGK_g("清空", PaddingKt.m726paddingVpY3zN4(AppHapticsKt.hapticClickable$default(BorderKt.m245borderxT4_qwU(BackgroundKt.m233backgroundbw27NRU(Modifier.INSTANCE, Color.INSTANCE.m4403getWhite0d7_KjU(), RoundedCornerShapeKt.m1018RoundedCornerShape0680j_4(Dp.m6973constructorimpl(8))), Dp.m6973constructorimpl((float) 1.5d), HuiyuanDesignKt.getInk(), RoundedCornerShapeKt.m1018RoundedCornerShape0680j_4(Dp.m6973constructorimpl(8))), false, HapticCue.TAP, function3, 1, null), Dp.m6973constructorimpl(10), Dp.m6973constructorimpl(6)), HuiyuanDesignKt.getInk(), TextUnitKt.getSp(11), (FontStyle) null, FontWeight.INSTANCE.getBlack(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, $composer3, 200070, 0, 131024);
                                    ComposerKt.sourceInformationMarkerEnd($composer3);
                                    ComposerKt.sourceInformationMarkerEnd($composer3);
                                    $composer3.endNode();
                                    ComposerKt.sourceInformationMarkerEnd($composer3);
                                    ComposerKt.sourceInformationMarkerEnd($composer3);
                                    ComposerKt.sourceInformationMarkerEnd($composer3);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                } else {
                                    $composer2 = $composer3;
                                    $composer2.skipToGroupEnd();
                                }
                                ScopeUpdateScope scopeUpdateScopeEndRestartGroup = $composer2.endRestartGroup();
                                if (scopeUpdateScopeEndRestartGroup != null) {
                                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.luchime.huiyuan.ui.ChatScreenKt$$ExternalSyntheticLambda18
                                        @Override // kotlin.jvm.functions.Function2
                                        public final Object invoke(Object obj, Object obj2) {
                                            return ChatScreenKt.ConversationToolbar$lambda$69(messageCount, compact, function3, $changed, (Composer) obj, ((Integer) obj2).intValue());
                                        }
                                    });
                                }
                            }

                            private static final void LandscapePromptPanel(final AIModel selectedModel, final Function1<? super AIModel, Unit> function1, final List<String> list, final boolean enabled, final Function1<? super String, Unit> function2, final Function0<Unit> function0, Composer $composer, final int $changed) {
                                final Function1<? super AIModel, Unit> function3;
                                boolean z;
                                Function0<Unit> function4;
                                Composer $composer2;
                                Composer $composer3 = $composer.startRestartGroup(-572152157);
                                ComposerKt.sourceInformation($composer3, "C(LandscapePromptPanel)P(5,1,4)552@20487L3324,538@19939L3872:ChatScreen.kt#cyjvf");
                                int $dirty = $changed;
                                if (($changed & 6) == 0) {
                                    $dirty |= $composer3.changed(selectedModel.ordinal()) ? 4 : 2;
                                }
                                if (($changed & 48) == 0) {
                                    function3 = function1;
                                    $dirty |= $composer3.changedInstance(function3) ? 32 : 16;
                                } else {
                                    function3 = function1;
                                }
                                if (($changed & 384) == 0) {
                                    $dirty |= $composer3.changedInstance(list) ? 256 : 128;
                                }
                                if (($changed & 3072) == 0) {
                                    z = enabled;
                                    $dirty |= $composer3.changed(z) ? 2048 : 1024;
                                } else {
                                    z = enabled;
                                }
                                if (($changed & 24576) == 0) {
                                    $dirty |= $composer3.changedInstance(function2) ? 16384 : 8192;
                                }
                                if ((196608 & $changed) == 0) {
                                    function4 = function0;
                                    $dirty |= $composer3.changedInstance(function4) ? 131072 : 65536;
                                } else {
                                    function4 = function0;
                                }
                                int $dirty2 = $dirty;
                                if (!$composer3.shouldExecute((74899 & $dirty2) != 74898, $dirty2 & 1)) {
                                    $composer2 = $composer3;
                                    $composer2.skipToGroupEnd();
                                } else {
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-572152157, $dirty2, -1, "com.luchime.huiyuan.ui.LandscapePromptPanel (ChatScreen.kt:537)");
                                    }
                                    Modifier modifierNavigationBarsPadding = WindowInsetsPadding_androidKt.navigationBarsPadding(WindowInsetsPadding_androidKt.statusBarsPadding(BorderKt.m245borderxT4_qwU(BackgroundKt.background$default(SizeKt.m777width3ABfNKs(SizeKt.fillMaxHeight$default(Modifier.INSTANCE, 0.0f, 1, null), Dp.m6973constructorimpl(238)), Brush.Companion.m4323verticalGradient8A3gB4$default(Brush.INSTANCE, CollectionsKt.listOf((Object[]) new Color[]{Color.m4356boximpl(HuiyuanDesignKt.getSignalYellow()), Color.m4356boximpl(ColorKt.Color(4294948142L)), Color.m4356boximpl(HuiyuanDesignKt.getSignalPink())}), 0.0f, 0.0f, 0, 14, (Object) null), null, 0.0f, 6, null), Dp.m6973constructorimpl(2), HuiyuanDesignKt.getInk(), RectangleShapeKt.getRectangleShape())));
                                    PaddingValues paddingValuesM719PaddingValuesYgX7TsA = PaddingKt.m719PaddingValuesYgX7TsA(Dp.m6973constructorimpl(12), Dp.m6973constructorimpl(10));
                                    Arrangement.HorizontalOrVertical horizontalOrVerticalM606spacedBy0680j_4 = Arrangement.INSTANCE.m606spacedBy0680j_4(Dp.m6973constructorimpl(8));
                                    ComposerKt.sourceInformationMarkerStart($composer3, -82380737, "CC(remember):ChatScreen.kt#9igjgp");
                                    boolean zChangedInstance = (($dirty2 & 14) == 4) | (($dirty2 & 112) == 32) | (($dirty2 & 7168) == 2048) | ((458752 & $dirty2) == 131072) | $composer3.changedInstance(list) | ((57344 & $dirty2) == 16384);
                                    Object objRememberedValue = $composer3.rememberedValue();
                                    if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                        final boolean z2 = z;
                                        final Function0<Unit> function5 = function4;
                                        objRememberedValue = new Function1() { // from class: com.luchime.huiyuan.ui.ChatScreenKt$$ExternalSyntheticLambda50
                                            @Override // kotlin.jvm.functions.Function1
                                            public final Object invoke(Object obj) {
                                                return ChatScreenKt.LandscapePromptPanel$lambda$81$lambda$80(list, selectedModel, function3, z2, function5, function2, (LazyListScope) obj);
                                            }
                                        };
                                        $composer3.updateRememberedValue(objRememberedValue);
                                    }
                                    ComposerKt.sourceInformationMarkerEnd($composer3);
                                    $composer2 = $composer3;
                                    LazyDslKt.LazyColumn(modifierNavigationBarsPadding, null, paddingValuesM719PaddingValuesYgX7TsA, false, horizontalOrVerticalM606spacedBy0680j_4, null, null, false, null, (Function1) objRememberedValue, $composer2, 24960, 490);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                }
                                ScopeUpdateScope scopeUpdateScopeEndRestartGroup = $composer2.endRestartGroup();
                                if (scopeUpdateScopeEndRestartGroup != null) {
                                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.luchime.huiyuan.ui.ChatScreenKt$$ExternalSyntheticLambda51
                                        @Override // kotlin.jvm.functions.Function2
                                        public final Object invoke(Object obj, Object obj2) {
                                            return ChatScreenKt.LandscapePromptPanel$lambda$82(selectedModel, function1, list, enabled, function2, function0, $changed, (Composer) obj, ((Integer) obj2).intValue());
                                        }
                                    });
                                }
                            }

                            static final Unit LandscapePromptPanel$lambda$81$lambda$80(final List $questions, final AIModel $selectedModel, final Function1 $onModelSelected, final boolean $enabled, final Function0 $onRefresh, final Function1 $onPrompt, LazyListScope LazyColumn) {
                                Intrinsics.checkNotNullParameter(LazyColumn, "$this$LazyColumn");
                                LazyListScope.item$default(LazyColumn, null, null, ComposableLambdaKt.composableLambdaInstance(-1045391250, true, new Function3() { // from class: com.luchime.huiyuan.ui.ChatScreenKt$$ExternalSyntheticLambda14
                                    @Override // kotlin.jvm.functions.Function3
                                    public final Object invoke(Object obj, Object obj2, Object obj3) {
                                        return ChatScreenKt.LandscapePromptPanel$lambda$81$lambda$80$lambda$73($selectedModel, (LazyItemScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
                                    }
                                }), 3, null);
                                LazyListScope.item$default(LazyColumn, null, null, ComposableLambdaKt.composableLambdaInstance(-296958697, true, new Function3() { // from class: com.luchime.huiyuan.ui.ChatScreenKt$$ExternalSyntheticLambda15
                                    @Override // kotlin.jvm.functions.Function3
                                    public final Object invoke(Object obj, Object obj2, Object obj3) {
                                        return ChatScreenKt.LandscapePromptPanel$lambda$81$lambda$80$lambda$74($selectedModel, $onModelSelected, $enabled, (LazyItemScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
                                    }
                                }), 3, null);
                                LazyListScope.item$default(LazyColumn, null, null, ComposableLambdaKt.composableLambdaInstance(1726540854, true, new Function3() { // from class: com.luchime.huiyuan.ui.ChatScreenKt$$ExternalSyntheticLambda16
                                    @Override // kotlin.jvm.functions.Function3
                                    public final Object invoke(Object obj, Object obj2, Object obj3) {
                                        return ChatScreenKt.LandscapePromptPanel$lambda$81$lambda$80$lambda$76($onRefresh, (LazyItemScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
                                    }
                                }), 3, null);
                                final Function1 function1 = new Function1() { // from class: com.luchime.huiyuan.ui.ChatScreenKt$$ExternalSyntheticLambda17
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj) {
                                        return ChatScreenKt.LandscapePromptPanel$lambda$81$lambda$80$lambda$77((String) obj);
                                    }
                                };
                                final Function1 function2 = new Function1() { // from class: com.luchime.huiyuan.ui.ChatScreenKt$LandscapePromptPanel$lambda$81$lambda$80$$inlined$items$default$1
                                    @Override // kotlin.jvm.functions.Function1
                                    public /* bridge */ /* synthetic */ Object invoke(Object p1) {
                                        return invoke((String) p1);
                                    }

                                    @Override // kotlin.jvm.functions.Function1
                                    public final Void invoke(String str) {
                                        return null;
                                    }
                                };
                                LazyColumn.items($questions.size(), new Function1<Integer, Object>() { // from class: com.luchime.huiyuan.ui.ChatScreenKt$LandscapePromptPanel$lambda$81$lambda$80$$inlined$items$default$2
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(1);
                                    }

                                    @Override // kotlin.jvm.functions.Function1
                                    public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                                        return invoke(num.intValue());
                                    }

                                    public final Object invoke(int index) {
                                        return invoke($questions.get(index));
                                    }
                                }, new Function1<Integer, Object>() { // from class: com.luchime.huiyuan.ui.ChatScreenKt$LandscapePromptPanel$lambda$81$lambda$80$$inlined$items$default$3
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(1);
                                    }

                                    @Override // kotlin.jvm.functions.Function1
                                    public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                                        return invoke(num.intValue());
                                    }

                                    public final Object invoke(int index) {
                                        return invoke($questions.get(index));
                                    }
                                }, ComposableLambdaKt.composableLambdaInstance(-632812321, true, new Function4<LazyItemScope, Integer, Composer, Integer, Unit>() { // from class: com.luchime.huiyuan.ui.ChatScreenKt$LandscapePromptPanel$lambda$81$lambda$80$$inlined$items$default$4
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
                                        final String str = (String) $questions.get(it);
                                        $composer.startReplaceGroup(1089140874);
                                        ComposerKt.sourceInformation($composer, "C*620@23204L64,625@23371L424,615@22917L878:ChatScreen.kt#cyjvf");
                                        Modifier modifierM245borderxT4_qwU = BorderKt.m245borderxT4_qwU(AlphaKt.alpha(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), $enabled ? 1.0f : 0.55f), Dp.m6973constructorimpl((float) 1.5d), HuiyuanDesignKt.getInk(), RoundedCornerShapeKt.m1018RoundedCornerShape0680j_4(Dp.m6973constructorimpl(10)));
                                        boolean z = $enabled;
                                        HapticCue hapticCue = HapticCue.SELECTION;
                                        ComposerKt.sourceInformationMarkerStart($composer, 589331275, "CC(remember):ChatScreen.kt#9igjgp");
                                        boolean zChanged = $composer.changed($onPrompt) | ((((i & 112) ^ 48) > 32 && $composer.changed(str)) || (i & 48) == 32);
                                        Object objRememberedValue = $composer.rememberedValue();
                                        if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                            final Function1 function3 = $onPrompt;
                                            Object obj = (Function0) new Function0<Unit>() { // from class: com.luchime.huiyuan.ui.ChatScreenKt$LandscapePromptPanel$1$1$5$1$1
                                                @Override // kotlin.jvm.functions.Function0
                                                public /* bridge */ /* synthetic */ Unit invoke() {
                                                    invoke2();
                                                    return Unit.INSTANCE;
                                                }

                                                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                                public final void invoke2() {
                                                    invoke(str);
                                                }
                                            };
                                            $composer.updateRememberedValue(obj);
                                            objRememberedValue = obj;
                                        }
                                        ComposerKt.sourceInformationMarkerEnd($composer);
                                        SurfaceKt.m2670SurfaceT9BRK9s(AppHapticsKt.hapticClickable(modifierM245borderxT4_qwU, z, hapticCue, (Function0) objRememberedValue), RoundedCornerShapeKt.m1018RoundedCornerShape0680j_4(Dp.m6973constructorimpl(10)), Color.INSTANCE.m4403getWhite0d7_KjU(), 0L, 0.0f, 0.0f, null, ComposableLambdaKt.rememberComposableLambda(-1979187130, true, new Function2<Composer, Integer, Unit>() { // from class: com.luchime.huiyuan.ui.ChatScreenKt$LandscapePromptPanel$1$1$5$2
                                            @Override // kotlin.jvm.functions.Function2
                                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                                                invoke(composer, num.intValue());
                                                return Unit.INSTANCE;
                                            }

                                            public final void invoke(Composer $composer2, int $changed2) {
                                                ComposerKt.sourceInformation($composer2, "C626@23389L392:ChatScreen.kt#cyjvf");
                                                if (!$composer2.shouldExecute(($changed2 & 3) != 2, $changed2 & 1)) {
                                                    $composer2.skipToGroupEnd();
                                                    return;
                                                }
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventStart(-1979187130, $changed2, -1, "com.luchime.huiyuan.ui.LandscapePromptPanel.<anonymous>.<anonymous>.<anonymous>.<anonymous> (ChatScreen.kt:626)");
                                                }
                                                TextKt.m2820Text4IGK_g(str, PaddingKt.m726paddingVpY3zN4(Modifier.INSTANCE, Dp.m6973constructorimpl(10), Dp.m6973constructorimpl(8)), HuiyuanDesignKt.getInk(), TextUnitKt.getSp(11), (FontStyle) null, FontWeight.INSTANCE.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, TextUnitKt.getSp(15), TextOverflow.INSTANCE.m6887getEllipsisgIe3tQ8(), false, 2, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, $composer2, 200112, 3126, 119760);
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventEnd();
                                                }
                                            }
                                        }, $composer, 54), $composer, 12583296, 120);
                                        $composer.endReplaceGroup();
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                    }
                                }));
                                return Unit.INSTANCE;
                            }

                            /* JADX WARN: Code duplicated, block: B:28:0x01f6  */
                            /* JADX WARN: Code duplicated, block: B:31:0x0202  */
                            /* JADX WARN: Code duplicated, block: B:32:0x0208  */
                            /* JADX WARN: Code duplicated, block: B:43:0x0389  */
                            /* JADX WARN: Code duplicated, block: B:46:0x0395  */
                            /* JADX WARN: Code duplicated, block: B:47:0x039b  */
                            /* JADX WARN: Code duplicated, block: B:50:0x03cc  */
                            /* JADX WARN: Code duplicated, block: B:53:0x03df  */
                            /* JADX WARN: Code duplicated, block: B:54:0x03e2  */
                            /* JADX WARN: Code duplicated, block: B:58:0x04c9  */
                            static final Unit LandscapePromptPanel$lambda$81$lambda$80$lambda$73(AIModel $selectedModel, LazyItemScope item, Composer $composer, int $changed) {
                                Function0<ComposeUiNode> function0;
                                int i;
                                int currentCompositeKeyHash;
                                Function0<ComposeUiNode> constructor;
                                Function0<ComposeUiNode> function1;
                                Composer composerM3808constructorimpl;
                                int currentCompositeKeyHash2;
                                Function0<ComposeUiNode> constructor2;
                                Function0<ComposeUiNode> function2;
                                Composer composerM3808constructorimpl2;
                                Composer composer;
                                Intrinsics.checkNotNullParameter(item, "$this$item");
                                ComposerKt.sourceInformation($composer, "C554@20516L1373:ChatScreen.kt#cyjvf");
                                if (!$composer.shouldExecute(($changed & 17) != 16, $changed & 1)) {
                                    $composer.skipToGroupEnd();
                                } else {
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-1045391250, $changed, -1, "com.luchime.huiyuan.ui.LandscapePromptPanel.<anonymous>.<anonymous>.<anonymous> (ChatScreen.kt:554)");
                                    }
                                    Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
                                    Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
                                    ComposerKt.sourceInformationMarkerStart($composer, 693286680, "CC(Row)P(2,1,3)99@5124L58,100@5187L130:Row.kt#2w3rfo");
                                    MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically, $composer, ((390 >> 3) & 14) | ((390 >> 3) & 112));
                                    ComposerKt.sourceInformationMarkerStart($composer, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                                    int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash($composer, 0);
                                    CompositionLocalMap currentCompositionLocalMap = $composer.getCurrentCompositionLocalMap();
                                    Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier($composer, modifierFillMaxWidth$default);
                                    Function0<ComposeUiNode> constructor3 = ComposeUiNode.INSTANCE.getConstructor();
                                    int i2 = ((((390 << 3) & 112) << 6) & 896) | 6;
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
                                    Updater.m3815setimpl(composerM3808constructorimpl3, measurePolicyRowMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                    Updater.m3815setimpl(composerM3808constructorimpl3, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                                    if (composerM3808constructorimpl3.getInserting()) {
                                        i = i2;
                                    } else {
                                        i = i2;
                                        if (!Intrinsics.areEqual(composerM3808constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                                        }
                                        Updater.m3815setimpl(composerM3808constructorimpl3, modifierMaterializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
                                        int i3 = (i >> 6) & 14;
                                        ComposerKt.sourceInformationMarkerStart($composer, -407735110, "C101@5232L9:Row.kt#2w3rfo");
                                        RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                                        int i4 = ((390 >> 6) & 112) | 6;
                                        ComposerKt.sourceInformationMarkerStart($composer, 551872034, "C558@20668L631,573@21316L559:ChatScreen.kt#cyjvf");
                                        Modifier modifierClip = ClipKt.clip(BackgroundKt.m233backgroundbw27NRU(PaddingKt.m725padding3ABfNKs(BackgroundKt.m233backgroundbw27NRU(SizeKt.m772size3ABfNKs(Modifier.INSTANCE, Dp.m6973constructorimpl(56)), HuiyuanDesignKt.getInk(), RoundedCornerShapeKt.getCircleShape()), Dp.m6973constructorimpl(2)), HuiyuanDesignKt.getCream(), RoundedCornerShapeKt.getCircleShape()), RoundedCornerShapeKt.getCircleShape());
                                        ComposerKt.sourceInformationMarkerStart($composer, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
                                        MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                                        ComposerKt.sourceInformationMarkerStart($composer, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                                        currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash($composer, 0);
                                        CompositionLocalMap currentCompositionLocalMap2 = $composer.getCurrentCompositionLocalMap();
                                        Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier($composer, modifierClip);
                                        constructor = ComposeUiNode.INSTANCE.getConstructor();
                                        int i5 = ((((0 << 3) & 112) << 6) & 896) | 6;
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
                                        Updater.m3815setimpl(composerM3808constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                        Updater.m3815setimpl(composerM3808constructorimpl, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                                        if (!composerM3808constructorimpl.getInserting() || !Intrinsics.areEqual(composerM3808constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                            composerM3808constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                            composerM3808constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash2);
                                        }
                                        Updater.m3815setimpl(composerM3808constructorimpl, modifierMaterializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
                                        int i6 = (i5 >> 6) & 14;
                                        ComposerKt.sourceInformationMarkerStart($composer, -2146730711, "C72@3468L9:Box.kt#2w3rfo");
                                        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                                        int i7 = ((0 >> 6) & 112) | 6;
                                        ComposerKt.sourceInformationMarkerStart($composer, 102203828, "C567@21023L40,566@20982L299:ChatScreen.kt#cyjvf");
                                        ImageKt.Image(PainterResources_androidKt.painterResource($selectedModel.getAvatarRes(), $composer, 0), $selectedModel.getDisplayName() + "头像", SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), (Alignment) null, ContentScale.INSTANCE.getCrop(), 0.0f, (ColorFilter) null, $composer, 24960, LocationRequestCompat.QUALITY_LOW_POWER);
                                        ComposerKt.sourceInformationMarkerEnd($composer);
                                        ComposerKt.sourceInformationMarkerEnd($composer);
                                        $composer.endNode();
                                        ComposerKt.sourceInformationMarkerEnd($composer);
                                        ComposerKt.sourceInformationMarkerEnd($composer);
                                        ComposerKt.sourceInformationMarkerEnd($composer);
                                        Modifier modifierM729paddingqDBjuR0$default = PaddingKt.m729paddingqDBjuR0$default(Modifier.INSTANCE, Dp.m6973constructorimpl(9), 0.0f, 0.0f, 0.0f, 14, null);
                                        ComposerKt.sourceInformationMarkerStart($composer, -483455358, "CC(Column)P(2,3,1)87@4442L61,88@4508L133:Column.kt#2w3rfo");
                                        MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), $composer, ((6 >> 3) & 14) | ((6 >> 3) & 112));
                                        ComposerKt.sourceInformationMarkerStart($composer, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                                        currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash($composer, 0);
                                        CompositionLocalMap currentCompositionLocalMap3 = $composer.getCurrentCompositionLocalMap();
                                        Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier($composer, modifierM729paddingqDBjuR0$default);
                                        constructor2 = ComposeUiNode.INSTANCE.getConstructor();
                                        int i8 = ((((6 << 3) & 112) << 6) & 896) | 6;
                                        ComposerKt.sourceInformationMarkerStart($composer, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
                                        if (!($composer.getApplier() instanceof Applier)) {
                                            ComposablesKt.invalidApplier();
                                        }
                                        $composer.startReusableNode();
                                        if ($composer.getInserting()) {
                                            function2 = constructor2;
                                            $composer.createNode(function2);
                                        } else {
                                            function2 = constructor2;
                                            $composer.useNode();
                                        }
                                        composerM3808constructorimpl2 = Updater.m3808constructorimpl($composer);
                                        Updater.m3815setimpl(composerM3808constructorimpl2, measurePolicyColumnMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                        Updater.m3815setimpl(composerM3808constructorimpl2, currentCompositionLocalMap3, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                                        if (!composerM3808constructorimpl2.getInserting()) {
                                            composer = $composer;
                                            if (!Intrinsics.areEqual(composerM3808constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                                            }
                                            Updater.m3815setimpl(composerM3808constructorimpl2, modifierMaterializeModifier3, ComposeUiNode.INSTANCE.getSetModifier());
                                            int i9 = (i8 >> 6) & 14;
                                            Composer composer2 = composer;
                                            ComposerKt.sourceInformationMarkerStart(composer2, -384672921, "C89@4556L9:Column.kt#2w3rfo");
                                            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                                            int i10 = ((6 >> 6) & 112) | 6;
                                            ComposerKt.sourceInformationMarkerStart(composer2, 1540909754, "C574@21388L255,581@21664L193:ChatScreen.kt#cyjvf");
                                            TextKt.m2820Text4IGK_g($selectedModel.getDisplayName(), (Modifier) null, HuiyuanDesignKt.getInk(), TextUnitKt.getSp(24), (FontStyle) null, FontWeight.INSTANCE.getBlack(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, TextUnitKt.getSp(25), 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, 200064, 6, 130002);
                                            TextKt.m2820Text4IGK_g("横屏认知工作台", (Modifier) null, HuiyuanDesignKt.getInk(), TextUnitKt.getSp(9), (FontStyle) null, FontWeight.INSTANCE.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, 200070, 0, 131026);
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
                                        ComposerKt.sourceInformationMarkerStart(composer3, -384672921, "C89@4556L9:Column.kt#2w3rfo");
                                        ColumnScopeInstance columnScopeInstance2 = ColumnScopeInstance.INSTANCE;
                                        int i12 = ((6 >> 6) & 112) | 6;
                                        ComposerKt.sourceInformationMarkerStart(composer3, 1540909754, "C574@21388L255,581@21664L193:ChatScreen.kt#cyjvf");
                                        TextKt.m2820Text4IGK_g($selectedModel.getDisplayName(), (Modifier) null, HuiyuanDesignKt.getInk(), TextUnitKt.getSp(24), (FontStyle) null, FontWeight.INSTANCE.getBlack(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, TextUnitKt.getSp(25), 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer3, 200064, 6, 130002);
                                        TextKt.m2820Text4IGK_g("横屏认知工作台", (Modifier) null, HuiyuanDesignKt.getInk(), TextUnitKt.getSp(9), (FontStyle) null, FontWeight.INSTANCE.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer3, 200070, 0, 131026);
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
                                    int i13 = (i >> 6) & 14;
                                    ComposerKt.sourceInformationMarkerStart($composer, -407735110, "C101@5232L9:Row.kt#2w3rfo");
                                    RowScopeInstance rowScopeInstance2 = RowScopeInstance.INSTANCE;
                                    int i14 = ((390 >> 6) & 112) | 6;
                                    ComposerKt.sourceInformationMarkerStart($composer, 551872034, "C558@20668L631,573@21316L559:ChatScreen.kt#cyjvf");
                                    Modifier modifierClip2 = ClipKt.clip(BackgroundKt.m233backgroundbw27NRU(PaddingKt.m725padding3ABfNKs(BackgroundKt.m233backgroundbw27NRU(SizeKt.m772size3ABfNKs(Modifier.INSTANCE, Dp.m6973constructorimpl(56)), HuiyuanDesignKt.getInk(), RoundedCornerShapeKt.getCircleShape()), Dp.m6973constructorimpl(2)), HuiyuanDesignKt.getCream(), RoundedCornerShapeKt.getCircleShape()), RoundedCornerShapeKt.getCircleShape());
                                    ComposerKt.sourceInformationMarkerStart($composer, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
                                    MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                                    ComposerKt.sourceInformationMarkerStart($composer, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                                    currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash($composer, 0);
                                    CompositionLocalMap currentCompositionLocalMap4 = $composer.getCurrentCompositionLocalMap();
                                    Modifier modifierMaterializeModifier4 = ComposedModifierKt.materializeModifier($composer, modifierClip2);
                                    constructor = ComposeUiNode.INSTANCE.getConstructor();
                                    int i15 = ((((0 << 3) & 112) << 6) & 896) | 6;
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
                                    Updater.m3815setimpl(composerM3808constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                    Updater.m3815setimpl(composerM3808constructorimpl, currentCompositionLocalMap4, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash4 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                                    if (!composerM3808constructorimpl.getInserting()) {
                                    }
                                    composerM3808constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                    composerM3808constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash4);
                                    Updater.m3815setimpl(composerM3808constructorimpl, modifierMaterializeModifier4, ComposeUiNode.INSTANCE.getSetModifier());
                                    int i16 = (i15 >> 6) & 14;
                                    ComposerKt.sourceInformationMarkerStart($composer, -2146730711, "C72@3468L9:Box.kt#2w3rfo");
                                    BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                                    int i17 = ((0 >> 6) & 112) | 6;
                                    ComposerKt.sourceInformationMarkerStart($composer, 102203828, "C567@21023L40,566@20982L299:ChatScreen.kt#cyjvf");
                                    ImageKt.Image(PainterResources_androidKt.painterResource($selectedModel.getAvatarRes(), $composer, 0), $selectedModel.getDisplayName() + "头像", SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), (Alignment) null, ContentScale.INSTANCE.getCrop(), 0.0f, (ColorFilter) null, $composer, 24960, LocationRequestCompat.QUALITY_LOW_POWER);
                                    ComposerKt.sourceInformationMarkerEnd($composer);
                                    ComposerKt.sourceInformationMarkerEnd($composer);
                                    $composer.endNode();
                                    ComposerKt.sourceInformationMarkerEnd($composer);
                                    ComposerKt.sourceInformationMarkerEnd($composer);
                                    ComposerKt.sourceInformationMarkerEnd($composer);
                                    Modifier modifierM729paddingqDBjuR0$default2 = PaddingKt.m729paddingqDBjuR0$default(Modifier.INSTANCE, Dp.m6973constructorimpl(9), 0.0f, 0.0f, 0.0f, 14, null);
                                    ComposerKt.sourceInformationMarkerStart($composer, -483455358, "CC(Column)P(2,3,1)87@4442L61,88@4508L133:Column.kt#2w3rfo");
                                    MeasurePolicy measurePolicyColumnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), $composer, ((6 >> 3) & 14) | ((6 >> 3) & 112));
                                    ComposerKt.sourceInformationMarkerStart($composer, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                                    currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash($composer, 0);
                                    CompositionLocalMap currentCompositionLocalMap5 = $composer.getCurrentCompositionLocalMap();
                                    Modifier modifierMaterializeModifier5 = ComposedModifierKt.materializeModifier($composer, modifierM729paddingqDBjuR0$default2);
                                    constructor2 = ComposeUiNode.INSTANCE.getConstructor();
                                    int i18 = ((((6 << 3) & 112) << 6) & 896) | 6;
                                    ComposerKt.sourceInformationMarkerStart($composer, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
                                    if (!($composer.getApplier() instanceof Applier)) {
                                        ComposablesKt.invalidApplier();
                                    }
                                    $composer.startReusableNode();
                                    if ($composer.getInserting()) {
                                        function2 = constructor2;
                                        $composer.createNode(function2);
                                    } else {
                                        function2 = constructor2;
                                        $composer.useNode();
                                    }
                                    composerM3808constructorimpl2 = Updater.m3808constructorimpl($composer);
                                    Updater.m3815setimpl(composerM3808constructorimpl2, measurePolicyColumnMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                    Updater.m3815setimpl(composerM3808constructorimpl2, currentCompositionLocalMap5, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash5 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                                    if (!composerM3808constructorimpl2.getInserting()) {
                                        composer = $composer;
                                        if (!Intrinsics.areEqual(composerM3808constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                                        }
                                        Updater.m3815setimpl(composerM3808constructorimpl2, modifierMaterializeModifier5, ComposeUiNode.INSTANCE.getSetModifier());
                                        int i19 = (i18 >> 6) & 14;
                                        Composer composer4 = composer;
                                        ComposerKt.sourceInformationMarkerStart(composer4, -384672921, "C89@4556L9:Column.kt#2w3rfo");
                                        ColumnScopeInstance columnScopeInstance3 = ColumnScopeInstance.INSTANCE;
                                        int i110 = ((6 >> 6) & 112) | 6;
                                        ComposerKt.sourceInformationMarkerStart(composer4, 1540909754, "C574@21388L255,581@21664L193:ChatScreen.kt#cyjvf");
                                        TextKt.m2820Text4IGK_g($selectedModel.getDisplayName(), (Modifier) null, HuiyuanDesignKt.getInk(), TextUnitKt.getSp(24), (FontStyle) null, FontWeight.INSTANCE.getBlack(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, TextUnitKt.getSp(25), 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer4, 200064, 6, 130002);
                                        TextKt.m2820Text4IGK_g("横屏认知工作台", (Modifier) null, HuiyuanDesignKt.getInk(), TextUnitKt.getSp(9), (FontStyle) null, FontWeight.INSTANCE.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer4, 200070, 0, 131026);
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
                                    ComposerKt.sourceInformationMarkerStart(composer5, -384672921, "C89@4556L9:Column.kt#2w3rfo");
                                    ColumnScopeInstance columnScopeInstance4 = ColumnScopeInstance.INSTANCE;
                                    int i112 = ((6 >> 6) & 112) | 6;
                                    ComposerKt.sourceInformationMarkerStart(composer5, 1540909754, "C574@21388L255,581@21664L193:ChatScreen.kt#cyjvf");
                                    TextKt.m2820Text4IGK_g($selectedModel.getDisplayName(), (Modifier) null, HuiyuanDesignKt.getInk(), TextUnitKt.getSp(24), (FontStyle) null, FontWeight.INSTANCE.getBlack(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, TextUnitKt.getSp(25), 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer5, 200064, 6, 130002);
                                    TextKt.m2820Text4IGK_g("横屏认知工作台", (Modifier) null, HuiyuanDesignKt.getInk(), TextUnitKt.getSp(9), (FontStyle) null, FontWeight.INSTANCE.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer5, 200070, 0, 131026);
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

                            static final Unit LandscapePromptPanel$lambda$81$lambda$80$lambda$74(AIModel $selectedModel, Function1 $onModelSelected, boolean $enabled, LazyItemScope item, Composer $composer, int $changed) {
                                Intrinsics.checkNotNullParameter(item, "$this$item");
                                ComposerKt.sourceInformation($composer, "C591@21916L54:ChatScreen.kt#cyjvf");
                                if ($composer.shouldExecute(($changed & 17) != 16, $changed & 1)) {
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-296958697, $changed, -1, "com.luchime.huiyuan.ui.LandscapePromptPanel.<anonymous>.<anonymous>.<anonymous> (ChatScreen.kt:591)");
                                    }
                                    ModelSelector($selectedModel, $onModelSelected, $enabled, $composer, 0, 0);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                } else {
                                    $composer.skipToGroupEnd();
                                }
                                return Unit.INSTANCE;
                            }

                            static final Unit LandscapePromptPanel$lambda$81$lambda$80$lambda$76(Function0 $onRefresh, LazyItemScope item, Composer $composer, int $changed) {
                                Function0<ComposeUiNode> function0;
                                Intrinsics.checkNotNullParameter(item, "$this$item");
                                ComposerKt.sourceInformation($composer, "C594@22001L841:ChatScreen.kt#cyjvf");
                                if ($composer.shouldExecute(($changed & 17) != 16, $changed & 1)) {
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(1726540854, $changed, -1, "com.luchime.huiyuan.ui.LandscapePromptPanel.<anonymous>.<anonymous>.<anonymous> (ChatScreen.kt:594)");
                                    }
                                    Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
                                    Arrangement.Horizontal spaceBetween = Arrangement.INSTANCE.getSpaceBetween();
                                    Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
                                    ComposerKt.sourceInformationMarkerStart($composer, 693286680, "CC(Row)P(2,1,3)99@5124L58,100@5187L130:Row.kt#2w3rfo");
                                    MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(spaceBetween, centerVertically, $composer, ((438 >> 3) & 14) | ((438 >> 3) & 112));
                                    ComposerKt.sourceInformationMarkerStart($composer, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                                    int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash($composer, 0);
                                    CompositionLocalMap currentCompositionLocalMap = $composer.getCurrentCompositionLocalMap();
                                    Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier($composer, modifierFillMaxWidth$default);
                                    Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                                    int i = ((((438 << 3) & 112) << 6) & 896) | 6;
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
                                    int i3 = ((438 >> 6) & 112) | 6;
                                    ComposerKt.sourceInformationMarkerStart($composer, 1257147376, "C599@22219L74,600@22310L518:ChatScreen.kt#cyjvf");
                                    TextKt.m2820Text4IGK_g("快捷提问", (Modifier) null, HuiyuanDesignKt.getInk(), TextUnitKt.getSp(13), (FontStyle) null, FontWeight.INSTANCE.getBlack(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, $composer, 200070, 0, 131026);
                                    TextKt.m2820Text4IGK_g("⟳ 换一批", PaddingKt.m726paddingVpY3zN4(AppHapticsKt.hapticClickable$default(BorderKt.m245borderxT4_qwU(BackgroundKt.m233backgroundbw27NRU(Modifier.INSTANCE, Color.INSTANCE.m4403getWhite0d7_KjU(), RoundedCornerShapeKt.m1018RoundedCornerShape0680j_4(Dp.m6973constructorimpl(8))), Dp.m6973constructorimpl((float) 1.5d), HuiyuanDesignKt.getInk(), RoundedCornerShapeKt.m1018RoundedCornerShape0680j_4(Dp.m6973constructorimpl(8))), false, HapticCue.SELECTION, $onRefresh, 1, null), Dp.m6973constructorimpl(8), Dp.m6973constructorimpl(5)), HuiyuanDesignKt.getInk(), TextUnitKt.getSp(10), (FontStyle) null, FontWeight.INSTANCE.getBlack(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, $composer, 200070, 0, 131024);
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

                            static final Object LandscapePromptPanel$lambda$81$lambda$80$lambda$77(String it) {
                                Intrinsics.checkNotNullParameter(it, "it");
                                return it;
                            }

                            /* JADX WARN: Code duplicated, block: B:100:0x02de A[SYNTHETIC] */
                            /* JADX WARN: Code duplicated, block: B:57:0x01cb  */
                            /* JADX WARN: Code duplicated, block: B:59:0x01d9  */
                            /* JADX WARN: Code duplicated, block: B:60:0x01dc  */
                            /* JADX WARN: Code duplicated, block: B:63:0x01e8  */
                            /* JADX WARN: Code duplicated, block: B:64:0x01ef  */
                            /* JADX WARN: Code duplicated, block: B:67:0x0246  */
                            /* JADX WARN: Code duplicated, block: B:69:0x0261  */
                            /* JADX WARN: Code duplicated, block: B:70:0x0263  */
                            /* JADX WARN: Code duplicated, block: B:77:0x0285  */
                            /* JADX WARN: Code duplicated, block: B:79:0x02a5  */
                            /* JADX WARN: Code duplicated, block: B:82:0x02b6  */
                            /* JADX WARN: Code duplicated, block: B:83:0x02bb  */
                            /* JADX WARN: Code duplicated, block: B:87:0x02d7  */
                            /* JADX WARN: Code duplicated, block: B:91:0x035e  */
                            private static final void ModelSelector(final AIModel selected, final Function1<? super AIModel, Unit> function1, boolean enabled, Composer $composer, final int $changed, final int i) {
                                boolean z;
                                final boolean enabled2;
                                Function0<ComposeUiNode> function0;
                                int i2;
                                int i3;
                                int i4;
                                Iterable<AIModel> entries;
                                int i5;
                                boolean z2;
                                boolean z3;
                                long jM4364copywmQWz5c;
                                int $dirty;
                                Modifier modifierM245borderxT4_qwU;
                                long jM4403getWhite0d7_KjU;
                                Modifier.Companion companionAlpha;
                                boolean z4;
                                boolean zChanged;
                                Object objRememberedValue;
                                AIModel aIModel = selected;
                                Composer $composer2 = $composer.startRestartGroup(8210125);
                                ComposerKt.sourceInformation($composer2, "C(ModelSelector)P(2,1)648@23996L21,647@23946L975:ChatScreen.kt#cyjvf");
                                int $dirty2 = $changed;
                                if (($changed & 6) == 0) {
                                    $dirty2 |= $composer2.changed(aIModel.ordinal()) ? 4 : 2;
                                }
                                if (($changed & 48) == 0) {
                                    $dirty2 |= $composer2.changedInstance(function1) ? 32 : 16;
                                }
                                int i6 = i & 4;
                                if (i6 != 0) {
                                    $dirty2 |= 384;
                                    z = enabled;
                                } else if (($changed & 384) == 0) {
                                    z = enabled;
                                    $dirty2 |= $composer2.changed(z) ? 256 : 128;
                                } else {
                                    z = enabled;
                                }
                                int $dirty3 = $dirty2;
                                if ($composer2.shouldExecute(($dirty3 & 147) != 146, $dirty3 & 1)) {
                                    boolean enabled3 = i6 != 0 ? true : z;
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(8210125, $dirty3, -1, "com.luchime.huiyuan.ui.ModelSelector (ChatScreen.kt:646)");
                                    }
                                    Modifier modifierHorizontalScroll$default = ScrollKt.horizontalScroll$default(Modifier.INSTANCE, ScrollKt.rememberScrollState(0, $composer2, 0, 1), false, null, false, 14, null);
                                    Arrangement.Horizontal horizontalM606spacedBy0680j_4 = Arrangement.INSTANCE.m606spacedBy0680j_4(Dp.m6973constructorimpl(6));
                                    int i7 = 48;
                                    ComposerKt.sourceInformationMarkerStart($composer2, 693286680, "CC(Row)P(2,1,3)99@5124L58,100@5187L130:Row.kt#2w3rfo");
                                    MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(horizontalM606spacedBy0680j_4, Alignment.INSTANCE.getTop(), $composer2, ((48 >> 3) & 14) | ((48 >> 3) & 112));
                                    ComposerKt.sourceInformationMarkerStart($composer2, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                                    int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash($composer2, 0);
                                    CompositionLocalMap currentCompositionLocalMap = $composer2.getCurrentCompositionLocalMap();
                                    Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier($composer2, modifierHorizontalScroll$default);
                                    Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                                    boolean enabled4 = enabled3;
                                    int i8 = ((((48 << 3) & 112) << 6) & 896) | 6;
                                    ComposerKt.sourceInformationMarkerStart($composer2, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
                                    if (!($composer2.getApplier() instanceof Applier)) {
                                        ComposablesKt.invalidApplier();
                                    }
                                    $composer2.startReusableNode();
                                    if ($composer2.getInserting()) {
                                        function0 = constructor;
                                        $composer2.createNode(function0);
                                    } else {
                                        function0 = constructor;
                                        $composer2.useNode();
                                    }
                                    Composer composerM3808constructorimpl = Updater.m3808constructorimpl($composer2);
                                    Updater.m3815setimpl(composerM3808constructorimpl, measurePolicyRowMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                    Updater.m3815setimpl(composerM3808constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                                    if (composerM3808constructorimpl.getInserting()) {
                                        i2 = currentCompositeKeyHash;
                                    } else {
                                        i2 = currentCompositeKeyHash;
                                        if (!Intrinsics.areEqual(composerM3808constructorimpl.rememberedValue(), Integer.valueOf(i2))) {
                                        }
                                        Updater.m3815setimpl(composerM3808constructorimpl, modifierMaterializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
                                        int i9 = (i8 >> 6) & 14;
                                        i3 = 0;
                                        ComposerKt.sourceInformationMarkerStart($composer2, -407735110, "C101@5232L9:Row.kt#2w3rfo");
                                        RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                                        i4 = ((48 >> 6) & 112) | 6;
                                        ComposerKt.sourceInformationMarkerStart($composer2, -2044716922, "C:ChatScreen.kt#cyjvf");
                                        $composer2.startReplaceGroup(-620147443);
                                        ComposerKt.sourceInformation($composer2, "*659@24531L374");
                                        entries = AIModel.getEntries();
                                        i5 = 0;
                                        for (final AIModel aIModel2 : entries) {
                                            Iterable iterable = entries;
                                            if (aIModel2 == aIModel) {
                                                z2 = true;
                                            } else {
                                                z2 = false;
                                            }
                                            z3 = z2;
                                            Modifier.Companion companion = Modifier.INSTANCE;
                                            if (z3) {
                                                jM4364copywmQWz5c = Color.INSTANCE.m4403getWhite0d7_KjU();
                                            } else {
                                                long ink = HuiyuanDesignKt.getInk();
                                                jM4364copywmQWz5c = Color.m4364copywmQWz5c(ink, (14 & 1) != 0 ? Color.m4368getAlphaimpl(ink) : 0.78f, (14 & 2) != 0 ? Color.m4372getRedimpl(ink) : 0.0f, (14 & 4) != 0 ? Color.m4371getGreenimpl(ink) : 0.0f, (14 & 8) != 0 ? Color.m4369getBlueimpl(ink) : 0.0f);
                                            }
                                            int i10 = i4;
                                            int i11 = i7;
                                            int i12 = i5;
                                            int i13 = i3;
                                            $dirty = $dirty3;
                                            modifierM245borderxT4_qwU = BorderKt.m245borderxT4_qwU(BackgroundKt.m233backgroundbw27NRU(companion, jM4364copywmQWz5c, RoundedCornerShapeKt.m1018RoundedCornerShape0680j_4(Dp.m6973constructorimpl(8))), Dp.m6973constructorimpl((float) 1.5d), HuiyuanDesignKt.getInk(), RoundedCornerShapeKt.m1018RoundedCornerShape0680j_4(Dp.m6973constructorimpl(8)));
                                            if (enabled4) {
                                                $composer2.startReplaceGroup(-1591424687);
                                                ComposerKt.sourceInformation($composer2, "657@24485L19");
                                                HapticCue hapticCue = HapticCue.SELECTION;
                                                ComposerKt.sourceInformationMarkerStart($composer2, 1334139538, "CC(remember):ChatScreen.kt#9igjgp");
                                                if (($dirty & 112) == 32) {
                                                    z4 = true;
                                                } else {
                                                    z4 = false;
                                                }
                                                zChanged = z4 | $composer2.changed(aIModel2.ordinal());
                                                objRememberedValue = $composer2.rememberedValue();
                                                if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                                    Object obj = new Function0() { // from class: com.luchime.huiyuan.ui.ChatScreenKt$$ExternalSyntheticLambda43
                                                        @Override // kotlin.jvm.functions.Function0
                                                        public final Object invoke() {
                                                            return ChatScreenKt.ModelSelector$lambda$86$lambda$85$lambda$84$lambda$83(function1, aIModel2);
                                                        }
                                                    };
                                                    $composer2.updateRememberedValue(obj);
                                                    objRememberedValue = obj;
                                                }
                                                ComposerKt.sourceInformationMarkerEnd($composer2);
                                                modifierM245borderxT4_qwU = AppHapticsKt.hapticClickable$default(modifierM245borderxT4_qwU, false, hapticCue, (Function0) objRememberedValue, 1, null);
                                            } else {
                                                $composer2.startReplaceGroup(-1615637981);
                                            }
                                            $composer2.endReplaceGroup();
                                            Modifier modifier = modifierM245borderxT4_qwU;
                                            String chipLabel = aIModel2.getChipLabel();
                                            if (z3) {
                                                jM4403getWhite0d7_KjU = HuiyuanDesignKt.getInk();
                                            } else {
                                                jM4403getWhite0d7_KjU = Color.INSTANCE.m4403getWhite0d7_KjU();
                                            }
                                            long j = jM4403getWhite0d7_KjU;
                                            long sp = TextUnitKt.getSp(10);
                                            FontWeight black = FontWeight.INSTANCE.getBlack();
                                            companionAlpha = Modifier.INSTANCE;
                                            if (enabled4) {
                                                companionAlpha = AlphaKt.alpha(companionAlpha, 0.48f);
                                            }
                                            TextKt.m2820Text4IGK_g(chipLabel, PaddingKt.m726paddingVpY3zN4(modifier.then(companionAlpha), Dp.m6973constructorimpl(9), Dp.m6973constructorimpl(6)), j, sp, (FontStyle) null, black, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, $composer2, 199680, 0, 131024);
                                            aIModel = selected;
                                            entries = iterable;
                                            i7 = i11;
                                            i4 = i10;
                                            i5 = i12;
                                            i3 = i13;
                                            $dirty3 = $dirty;
                                        }
                                        $composer2.endReplaceGroup();
                                        ComposerKt.sourceInformationMarkerEnd($composer2);
                                        ComposerKt.sourceInformationMarkerEnd($composer2);
                                        $composer2.endNode();
                                        ComposerKt.sourceInformationMarkerEnd($composer2);
                                        ComposerKt.sourceInformationMarkerEnd($composer2);
                                        ComposerKt.sourceInformationMarkerEnd($composer2);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                        enabled2 = enabled4;
                                    }
                                    composerM3808constructorimpl.updateRememberedValue(Integer.valueOf(i2));
                                    composerM3808constructorimpl.apply(Integer.valueOf(i2), setCompositeKeyHash);
                                    Updater.m3815setimpl(composerM3808constructorimpl, modifierMaterializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
                                    int i14 = (i8 >> 6) & 14;
                                    i3 = 0;
                                    ComposerKt.sourceInformationMarkerStart($composer2, -407735110, "C101@5232L9:Row.kt#2w3rfo");
                                    RowScopeInstance rowScopeInstance2 = RowScopeInstance.INSTANCE;
                                    i4 = ((48 >> 6) & 112) | 6;
                                    ComposerKt.sourceInformationMarkerStart($composer2, -2044716922, "C:ChatScreen.kt#cyjvf");
                                    $composer2.startReplaceGroup(-620147443);
                                    ComposerKt.sourceInformation($composer2, "*659@24531L374");
                                    entries = AIModel.getEntries();
                                    i5 = 0;
                                    while (r56.hasNext()) {
                                        Iterable iterable2 = entries;
                                        if (aIModel2 == aIModel) {
                                            z2 = true;
                                        } else {
                                            z2 = false;
                                        }
                                        z3 = z2;
                                        Modifier.Companion companion2 = Modifier.INSTANCE;
                                        if (z3) {
                                            jM4364copywmQWz5c = Color.INSTANCE.m4403getWhite0d7_KjU();
                                        } else {
                                            long ink2 = HuiyuanDesignKt.getInk();
                                            jM4364copywmQWz5c = Color.m4364copywmQWz5c(ink2, (14 & 1) != 0 ? Color.m4368getAlphaimpl(ink2) : 0.78f, (14 & 2) != 0 ? Color.m4372getRedimpl(ink2) : 0.0f, (14 & 4) != 0 ? Color.m4371getGreenimpl(ink2) : 0.0f, (14 & 8) != 0 ? Color.m4369getBlueimpl(ink2) : 0.0f);
                                        }
                                        int i15 = i4;
                                        int i16 = i7;
                                        int i17 = i5;
                                        int i18 = i3;
                                        $dirty = $dirty3;
                                        modifierM245borderxT4_qwU = BorderKt.m245borderxT4_qwU(BackgroundKt.m233backgroundbw27NRU(companion2, jM4364copywmQWz5c, RoundedCornerShapeKt.m1018RoundedCornerShape0680j_4(Dp.m6973constructorimpl(8))), Dp.m6973constructorimpl((float) 1.5d), HuiyuanDesignKt.getInk(), RoundedCornerShapeKt.m1018RoundedCornerShape0680j_4(Dp.m6973constructorimpl(8)));
                                        if (enabled4) {
                                            $composer2.startReplaceGroup(-1591424687);
                                            ComposerKt.sourceInformation($composer2, "657@24485L19");
                                            HapticCue hapticCue2 = HapticCue.SELECTION;
                                            ComposerKt.sourceInformationMarkerStart($composer2, 1334139538, "CC(remember):ChatScreen.kt#9igjgp");
                                            if (($dirty & 112) == 32) {
                                                z4 = true;
                                            } else {
                                                z4 = false;
                                            }
                                            zChanged = z4 | $composer2.changed(aIModel2.ordinal());
                                            objRememberedValue = $composer2.rememberedValue();
                                            if (zChanged) {
                                                Object obj2 = new Function0() { // from class: com.luchime.huiyuan.ui.ChatScreenKt$$ExternalSyntheticLambda43
                                                    @Override // kotlin.jvm.functions.Function0
                                                    public final Object invoke() {
                                                        return ChatScreenKt.ModelSelector$lambda$86$lambda$85$lambda$84$lambda$83(function1, aIModel2);
                                                    }
                                                };
                                                $composer2.updateRememberedValue(obj2);
                                                objRememberedValue = obj2;
                                            } else {
                                                Object obj3 = new Function0() { // from class: com.luchime.huiyuan.ui.ChatScreenKt$$ExternalSyntheticLambda43
                                                    @Override // kotlin.jvm.functions.Function0
                                                    public final Object invoke() {
                                                        return ChatScreenKt.ModelSelector$lambda$86$lambda$85$lambda$84$lambda$83(function1, aIModel2);
                                                    }
                                                };
                                                $composer2.updateRememberedValue(obj3);
                                                objRememberedValue = obj3;
                                            }
                                            ComposerKt.sourceInformationMarkerEnd($composer2);
                                            modifierM245borderxT4_qwU = AppHapticsKt.hapticClickable$default(modifierM245borderxT4_qwU, false, hapticCue2, (Function0) objRememberedValue, 1, null);
                                        } else {
                                            $composer2.startReplaceGroup(-1615637981);
                                        }
                                        $composer2.endReplaceGroup();
                                        Modifier modifier2 = modifierM245borderxT4_qwU;
                                        String chipLabel2 = aIModel2.getChipLabel();
                                        if (z3) {
                                            jM4403getWhite0d7_KjU = HuiyuanDesignKt.getInk();
                                        } else {
                                            jM4403getWhite0d7_KjU = Color.INSTANCE.m4403getWhite0d7_KjU();
                                        }
                                        long j2 = jM4403getWhite0d7_KjU;
                                        long sp2 = TextUnitKt.getSp(10);
                                        FontWeight black2 = FontWeight.INSTANCE.getBlack();
                                        companionAlpha = Modifier.INSTANCE;
                                        if (enabled4) {
                                            companionAlpha = AlphaKt.alpha(companionAlpha, 0.48f);
                                        }
                                        TextKt.m2820Text4IGK_g(chipLabel2, PaddingKt.m726paddingVpY3zN4(modifier2.then(companionAlpha), Dp.m6973constructorimpl(9), Dp.m6973constructorimpl(6)), j2, sp2, (FontStyle) null, black2, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, $composer2, 199680, 0, 131024);
                                        aIModel = selected;
                                        entries = iterable2;
                                        i7 = i16;
                                        i4 = i15;
                                        i5 = i17;
                                        i3 = i18;
                                        $dirty3 = $dirty;
                                    }
                                    $composer2.endReplaceGroup();
                                    ComposerKt.sourceInformationMarkerEnd($composer2);
                                    ComposerKt.sourceInformationMarkerEnd($composer2);
                                    $composer2.endNode();
                                    ComposerKt.sourceInformationMarkerEnd($composer2);
                                    ComposerKt.sourceInformationMarkerEnd($composer2);
                                    ComposerKt.sourceInformationMarkerEnd($composer2);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                    enabled2 = enabled4;
                                } else {
                                    $composer2.skipToGroupEnd();
                                    enabled2 = z;
                                }
                                ScopeUpdateScope scopeUpdateScopeEndRestartGroup = $composer2.endRestartGroup();
                                if (scopeUpdateScopeEndRestartGroup != null) {
                                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.luchime.huiyuan.ui.ChatScreenKt$$ExternalSyntheticLambda44
                                        @Override // kotlin.jvm.functions.Function2
                                        public final Object invoke(Object obj4, Object obj5) {
                                            return ChatScreenKt.ModelSelector$lambda$87(selected, function1, enabled2, $changed, i, (Composer) obj4, ((Integer) obj5).intValue());
                                        }
                                    });
                                }
                            }

                            static final Unit ModelSelector$lambda$86$lambda$85$lambda$84$lambda$83(Function1 $onSelect, AIModel $model) {
                                $onSelect.invoke($model);
                                return Unit.INSTANCE;
                            }

                            private static final long modelAccent(AIModel model) {
                                switch (WhenMappings.$EnumSwitchMapping$0[model.ordinal()]) {
                                    case 1:
                                        return HuiyuanDesignKt.getSignalYellow();
                                    case 2:
                                        return HuiyuanDesignKt.getSignalBlue();
                                    case 3:
                                        return HuiyuanDesignKt.getSignalGreen();
                                    case 4:
                                        return HuiyuanDesignKt.getSignalOrange();
                                    default:
                                        throw new NoWhenBranchMatchedException();
                                }
                            }

                            private static final String heroEnglish(AIModel model) {
                                switch (WhenMappings.$EnumSwitchMapping$0[model.ordinal()]) {
                                    case 1:
                                        return "CAPYBARA COGNITIVE\nENHANCEMENT";
                                    case 2:
                                        return "PIXEL PENGUIN · DESKPARK";
                                    case 3:
                                        return "CURLY TURTLE · ROBOMASTER";
                                    case 4:
                                        return "LINUX BEAR · TANGO SYSTEM";
                                    default:
                                        throw new NoWhenBranchMatchedException();
                                }
                            }

                            private static final String heroSummary(AIModel model) {
                                switch (WhenMappings.$EnumSwitchMapping$0[model.ordinal()]) {
                                    case 1:
                                        return "提升认知 · 破除焦虑\n佛系聊天 · 情绪稳定";
                                    case 2:
                                        return "IT玩机 · 装机系统\ndeskpark · 热河路";
                                    case 3:
                                        return "养龟 · RoboMaster · 电路\n泡茶机 · 土家文化";
                                    case 4:
                                        return "Linux · C语言 · 魂系游戏\n电子设备 · 长沙美食";
                                    default:
                                        throw new NoWhenBranchMatchedException();
                                }
                            }

                            /* JADX WARN: Code duplicated, block: B:101:0x05d6  */
                            /* JADX WARN: Code duplicated, block: B:105:0x05e2  */
                            /* JADX WARN: Code duplicated, block: B:110:0x069b  */
                            /* JADX WARN: Code duplicated, block: B:118:0x05f1 A[SYNTHETIC] */
                            /* JADX WARN: Code duplicated, block: B:57:0x02a8  */
                            /* JADX WARN: Code duplicated, block: B:60:0x02b4  */
                            /* JADX WARN: Code duplicated, block: B:61:0x02ba  */
                            /* JADX WARN: Code duplicated, block: B:72:0x049d  */
                            /* JADX WARN: Code duplicated, block: B:75:0x04a9  */
                            /* JADX WARN: Code duplicated, block: B:76:0x04af  */
                            /* JADX WARN: Code duplicated, block: B:79:0x04e0  */
                            /* JADX WARN: Code duplicated, block: B:82:0x04f3  */
                            /* JADX WARN: Code duplicated, block: B:83:0x04f6  */
                            /* JADX WARN: Code duplicated, block: B:88:0x0562  */
                            /* JADX WARN: Code duplicated, block: B:90:0x056a  */
                            /* JADX WARN: Code duplicated, block: B:93:0x057f  */
                            /* JADX WARN: Code duplicated, block: B:94:0x0582  */
                            /* JADX WARN: Code duplicated, block: B:97:0x05c4  */
                            /* JADX WARN: Code duplicated, block: B:98:0x05c6  */
                            private static final void QuickPromptRow(final List<String> list, final boolean enabled, final Function1<? super String, Unit> function1, final Function0<Unit> function0, Composer $composer, final int $changed) {
                                Function0<Unit> function2;
                                Composer $composer2;
                                Function0<ComposeUiNode> function3;
                                Composer composer;
                                Composer composer2;
                                int currentCompositeKeyHash;
                                Function0<ComposeUiNode> constructor;
                                Function0<ComposeUiNode> function4;
                                Composer composerM3808constructorimpl;
                                Composer composer3;
                                int i;
                                Alignment.Vertical top;
                                int currentCompositeKeyHash2;
                                Modifier modifierMaterializeModifier;
                                Function0<ComposeUiNode> constructor2;
                                Function0<ComposeUiNode> function5;
                                Composer composerM3808constructorimpl2;
                                int i2;
                                int i3;
                                List<String> list2;
                                int i4;
                                int i5;
                                float f;
                                boolean z;
                                boolean zChanged;
                                Object objRememberedValue;
                                Composer $composer3;
                                Composer $composer4 = $composer.startRestartGroup(-458940283);
                                ComposerKt.sourceInformation($composer4, "C(QuickPromptRow)P(3)701@25935L2343:ChatScreen.kt#cyjvf");
                                int $dirty = $changed;
                                if (($changed & 6) == 0) {
                                    $dirty |= $composer4.changedInstance(list) ? 4 : 2;
                                }
                                if (($changed & 48) == 0) {
                                    $dirty |= $composer4.changed(enabled) ? 32 : 16;
                                }
                                if (($changed & 384) == 0) {
                                    $dirty |= $composer4.changedInstance(function1) ? 256 : 128;
                                }
                                if (($changed & 3072) == 0) {
                                    function2 = function0;
                                    $dirty |= $composer4.changedInstance(function2) ? 2048 : 1024;
                                } else {
                                    function2 = function0;
                                }
                                int $dirty2 = $dirty;
                                if (!$composer4.shouldExecute(($dirty2 & 1171) != 1170, $dirty2 & 1)) {
                                    $composer2 = $composer4;
                                    $composer2.skipToGroupEnd();
                                } else {
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-458940283, $dirty2, -1, "com.luchime.huiyuan.ui.QuickPromptRow (ChatScreen.kt:699)");
                                    }
                                    List colors = CollectionsKt.listOf((Object[]) new Color[]{Color.m4356boximpl(HuiyuanDesignKt.getSignalYellow()), Color.m4356boximpl(HuiyuanDesignKt.getSignalGreen()), Color.m4356boximpl(HuiyuanDesignKt.getSignalBlue()), Color.m4356boximpl(HuiyuanDesignKt.getSignalPurple()), Color.m4356boximpl(HuiyuanDesignKt.getSignalRed()), Color.m4356boximpl(HuiyuanDesignKt.getSignalPink())});
                                    Modifier modifierM727paddingVpY3zN4$default = PaddingKt.m727paddingVpY3zN4$default(BorderKt.m245borderxT4_qwU(BackgroundKt.m234backgroundbw27NRU$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), HuiyuanDesignKt.getSignalPurple(), null, 2, null), Dp.m6973constructorimpl(2), HuiyuanDesignKt.getInk(), RectangleShapeKt.getRectangleShape()), 0.0f, Dp.m6973constructorimpl(8), 1, null);
                                    ComposerKt.sourceInformationMarkerStart($composer4, -483455358, "CC(Column)P(2,3,1)87@4442L61,88@4508L133:Column.kt#2w3rfo");
                                    MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), $composer4, ((6 >> 3) & 14) | ((6 >> 3) & 112));
                                    ComposerKt.sourceInformationMarkerStart($composer4, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                                    int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash($composer4, 0);
                                    CompositionLocalMap currentCompositionLocalMap = $composer4.getCurrentCompositionLocalMap();
                                    Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier($composer4, modifierM727paddingVpY3zN4$default);
                                    Function0<ComposeUiNode> constructor3 = ComposeUiNode.INSTANCE.getConstructor();
                                    int i6 = ((((6 << 3) & 112) << 6) & 896) | 6;
                                    ComposerKt.sourceInformationMarkerStart($composer4, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
                                    if (!($composer4.getApplier() instanceof Applier)) {
                                        ComposablesKt.invalidApplier();
                                    }
                                    $composer4.startReusableNode();
                                    if ($composer4.getInserting()) {
                                        function3 = constructor3;
                                        $composer4.createNode(function3);
                                    } else {
                                        function3 = constructor3;
                                        $composer4.useNode();
                                    }
                                    Composer composerM3808constructorimpl3 = Updater.m3808constructorimpl($composer4);
                                    Updater.m3815setimpl(composerM3808constructorimpl3, measurePolicyColumnMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                    Updater.m3815setimpl(composerM3808constructorimpl3, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                                    if (composerM3808constructorimpl3.getInserting()) {
                                        composer = $composer4;
                                    } else {
                                        composer = $composer4;
                                        if (!Intrinsics.areEqual(composerM3808constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                                        }
                                        Updater.m3815setimpl(composerM3808constructorimpl3, modifierMaterializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
                                        int i7 = (i6 >> 6) & 14;
                                        composer2 = composer;
                                        ComposerKt.sourceInformationMarkerStart(composer2, -384672921, "C89@4556L9:Column.kt#2w3rfo");
                                        ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                                        int i8 = ((6 >> 6) & 112) | 6;
                                        ComposerKt.sourceInformationMarkerStart(composer2, -1895015426, "C708@26138L929,736@27180L21,733@27077L1195:ChatScreen.kt#cyjvf");
                                        Modifier modifierM727paddingVpY3zN4$default2 = PaddingKt.m727paddingVpY3zN4$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), Dp.m6973constructorimpl(14), 0.0f, 2, null);
                                        Arrangement.Horizontal spaceBetween = Arrangement.INSTANCE.getSpaceBetween();
                                        Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
                                        ComposerKt.sourceInformationMarkerStart(composer2, 693286680, "CC(Row)P(2,1,3)99@5124L58,100@5187L130:Row.kt#2w3rfo");
                                        MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(spaceBetween, centerVertically, composer2, ((438 >> 3) & 14) | ((438 >> 3) & 112));
                                        ComposerKt.sourceInformationMarkerStart(composer2, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                                        currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                                        CompositionLocalMap currentCompositionLocalMap2 = composer2.getCurrentCompositionLocalMap();
                                        Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier(composer2, modifierM727paddingVpY3zN4$default2);
                                        constructor = ComposeUiNode.INSTANCE.getConstructor();
                                        int i9 = ((((438 << 3) & 112) << 6) & 896) | 6;
                                        ComposerKt.sourceInformationMarkerStart(composer2, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
                                        if (!(composer2.getApplier() instanceof Applier)) {
                                            ComposablesKt.invalidApplier();
                                        }
                                        composer2.startReusableNode();
                                        if (composer2.getInserting()) {
                                            function4 = constructor;
                                            composer2.createNode(function4);
                                        } else {
                                            function4 = constructor;
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
                                        Updater.m3815setimpl(composerM3808constructorimpl, modifierMaterializeModifier3, ComposeUiNode.INSTANCE.getSetModifier());
                                        int i10 = (i9 >> 6) & 14;
                                        ComposerKt.sourceInformationMarkerStart(composer2, -407735110, "C101@5232L9:Row.kt#2w3rfo");
                                        RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                                        int i11 = ((438 >> 6) & 112) | 6;
                                        ComposerKt.sourceInformationMarkerStart(composer2, -776089787, "C715@26398L82,716@26493L564:ChatScreen.kt#cyjvf");
                                        TextKt.m2820Text4IGK_g("热门问题", (Modifier) null, Color.INSTANCE.m4403getWhite0d7_KjU(), TextUnitKt.getSp(13), (FontStyle) null, FontWeight.INSTANCE.getBlack(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, 200070, 0, 131026);
                                        SurfaceKt.m2670SurfaceT9BRK9s(AppHapticsKt.hapticClickable$default(BorderKt.m245borderxT4_qwU(Modifier.INSTANCE, Dp.m6973constructorimpl(2), HuiyuanDesignKt.getInk(), RoundedCornerShapeKt.getCircleShape()), false, HapticCue.SELECTION, function2, 1, null), RoundedCornerShapeKt.getCircleShape(), HuiyuanDesignKt.getSignalYellow(), 0L, 0.0f, 0.0f, null, ComposableSingletons$ChatScreenKt.INSTANCE.m7403getLambda$1226650512$app(), composer2, 12583296, 120);
                                        ComposerKt.sourceInformationMarkerEnd(composer2);
                                        ComposerKt.sourceInformationMarkerEnd(composer2);
                                        composer2.endNode();
                                        ComposerKt.sourceInformationMarkerEnd(composer2);
                                        ComposerKt.sourceInformationMarkerEnd(composer2);
                                        ComposerKt.sourceInformationMarkerEnd(composer2);
                                        Modifier modifierM726paddingVpY3zN4 = PaddingKt.m726paddingVpY3zN4(ScrollKt.horizontalScroll$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), ScrollKt.rememberScrollState(0, composer2, 0, 1), false, null, false, 14, null), Dp.m6973constructorimpl(14), Dp.m6973constructorimpl(7));
                                        Arrangement.Horizontal horizontalM606spacedBy0680j_4 = Arrangement.INSTANCE.m606spacedBy0680j_4(Dp.m6973constructorimpl(9));
                                        composer3 = composer2;
                                        i = 48;
                                        ComposerKt.sourceInformationMarkerStart(composer3, 693286680, "CC(Row)P(2,1,3)99@5124L58,100@5187L130:Row.kt#2w3rfo");
                                        top = Alignment.INSTANCE.getTop();
                                        MeasurePolicy measurePolicyRowMeasurePolicy2 = RowKt.rowMeasurePolicy(horizontalM606spacedBy0680j_4, top, composer3, ((48 >> 3) & 14) | ((48 >> 3) & 112));
                                        ComposerKt.sourceInformationMarkerStart(composer3, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                                        currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                                        CompositionLocalMap currentCompositionLocalMap3 = composer3.getCurrentCompositionLocalMap();
                                        modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer3, modifierM726paddingVpY3zN4);
                                        constructor2 = ComposeUiNode.INSTANCE.getConstructor();
                                        int i12 = ((((48 << 3) & 112) << 6) & 896) | 6;
                                        ComposerKt.sourceInformationMarkerStart(composer3, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
                                        if (!(composer3.getApplier() instanceof Applier)) {
                                            ComposablesKt.invalidApplier();
                                        }
                                        composer3.startReusableNode();
                                        if (composer3.getInserting()) {
                                            function5 = constructor2;
                                            composer3.createNode(function5);
                                        } else {
                                            function5 = constructor2;
                                            composer3.useNode();
                                        }
                                        composerM3808constructorimpl2 = Updater.m3808constructorimpl(composer3);
                                        Updater.m3815setimpl(composerM3808constructorimpl2, measurePolicyRowMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                        Updater.m3815setimpl(composerM3808constructorimpl2, currentCompositionLocalMap3, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                                        if (composerM3808constructorimpl2.getInserting()) {
                                            i2 = currentCompositeKeyHash2;
                                        } else {
                                            i2 = currentCompositeKeyHash2;
                                            if (!Intrinsics.areEqual(composerM3808constructorimpl2.rememberedValue(), Integer.valueOf(i2))) {
                                            }
                                            Updater.m3815setimpl(composerM3808constructorimpl2, modifierMaterializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
                                            int i13 = (i12 >> 6) & 14;
                                            ComposerKt.sourceInformationMarkerStart(composer3, -407735110, "C101@5232L9:Row.kt#2w3rfo");
                                            RowScopeInstance rowScopeInstance2 = RowScopeInstance.INSTANCE;
                                            i3 = ((48 >> 6) & 112) | 6;
                                            ComposerKt.sourceInformationMarkerStart(composer3, -1214510654, "C:ChatScreen.kt#cyjvf");
                                            composer3.startReplaceGroup(99369879);
                                            ComposerKt.sourceInformation(composer3, "*745@27678L72,750@27881L367,741@27413L835");
                                            list2 = list;
                                            i4 = 0;
                                            i5 = 0;
                                            for (Object obj : list2) {
                                                int i14 = i5 + 1;
                                                if (i5 < 0) {
                                                    CollectionsKt.throwIndexOverflow();
                                                }
                                                Iterable iterable = list2;
                                                final String str = (String) obj;
                                                int i15 = i4;
                                                Modifier.Companion companion = Modifier.INSTANCE;
                                                if (enabled) {
                                                    f = 1.0f;
                                                } else {
                                                    f = 0.55f;
                                                }
                                                Modifier modifier = modifierMaterializeModifier;
                                                int i16 = i3;
                                                Alignment.Vertical vertical = top;
                                                Composer composer4 = composer3;
                                                int i17 = i;
                                                Modifier modifierM245borderxT4_qwU = BorderKt.m245borderxT4_qwU(AlphaKt.alpha(companion, f), Dp.m6973constructorimpl(2), HuiyuanDesignKt.getInk(), RoundedCornerShapeKt.m1018RoundedCornerShape0680j_4(Dp.m6973constructorimpl(12)));
                                                HapticCue hapticCue = HapticCue.SELECTION;
                                                ComposerKt.sourceInformationMarkerStart(composer3, 1790479286, "CC(remember):ChatScreen.kt#9igjgp");
                                                if (($dirty2 & 896) == 256) {
                                                    z = true;
                                                } else {
                                                    z = false;
                                                }
                                                zChanged = $composer4.changed(str) | z;
                                                objRememberedValue = composer3.rememberedValue();
                                                if (!zChanged) {
                                                    $composer3 = $composer4;
                                                    if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                                    }
                                                    ComposerKt.sourceInformationMarkerEnd(composer3);
                                                    SurfaceKt.m2670SurfaceT9BRK9s(AppHapticsKt.hapticClickable(modifierM245borderxT4_qwU, enabled, hapticCue, (Function0) objRememberedValue), RoundedCornerShapeKt.m1018RoundedCornerShape0680j_4(Dp.m6973constructorimpl(12)), ((Color) colors.get(i5 % colors.size())).m4376unboximpl(), 0L, 0.0f, 0.0f, null, ComposableLambdaKt.rememberComposableLambda(-1719440013, true, new Function2() { // from class: com.luchime.huiyuan.ui.ChatScreenKt$$ExternalSyntheticLambda47
                                                        @Override // kotlin.jvm.functions.Function2
                                                        public final Object invoke(Object obj2, Object obj3) {
                                                            return ChatScreenKt.QuickPromptRow$lambda$94$lambda$93$lambda$92$lambda$91(str, (Composer) obj2, ((Integer) obj3).intValue());
                                                        }
                                                    }, composer3, 54), composer3, 12582912, 120);
                                                    i5 = i14;
                                                    list2 = iterable;
                                                    i4 = i15;
                                                    modifierMaterializeModifier = modifier;
                                                    i3 = i16;
                                                    top = vertical;
                                                    composer3 = composer4;
                                                    i = i17;
                                                    $composer4 = $composer3;
                                                } else {
                                                    $composer3 = $composer4;
                                                }
                                                Object obj2 = new Function0() { // from class: com.luchime.huiyuan.ui.ChatScreenKt$$ExternalSyntheticLambda46
                                                    @Override // kotlin.jvm.functions.Function0
                                                    public final Object invoke() {
                                                        return ChatScreenKt.QuickPromptRow$lambda$94$lambda$93$lambda$92$lambda$90$lambda$89(function1, str);
                                                    }
                                                };
                                                composer3.updateRememberedValue(obj2);
                                                objRememberedValue = obj2;
                                                ComposerKt.sourceInformationMarkerEnd(composer3);
                                                SurfaceKt.m2670SurfaceT9BRK9s(AppHapticsKt.hapticClickable(modifierM245borderxT4_qwU, enabled, hapticCue, (Function0) objRememberedValue), RoundedCornerShapeKt.m1018RoundedCornerShape0680j_4(Dp.m6973constructorimpl(12)), ((Color) colors.get(i5 % colors.size())).m4376unboximpl(), 0L, 0.0f, 0.0f, null, ComposableLambdaKt.rememberComposableLambda(-1719440013, true, new Function2() { // from class: com.luchime.huiyuan.ui.ChatScreenKt$$ExternalSyntheticLambda47
                                                    @Override // kotlin.jvm.functions.Function2
                                                    public final Object invoke(Object obj3, Object obj4) {
                                                        return ChatScreenKt.QuickPromptRow$lambda$94$lambda$93$lambda$92$lambda$91(str, (Composer) obj3, ((Integer) obj4).intValue());
                                                    }
                                                }, composer3, 54), composer3, 12582912, 120);
                                                i5 = i14;
                                                list2 = iterable;
                                                i4 = i15;
                                                modifierMaterializeModifier = modifier;
                                                i3 = i16;
                                                top = vertical;
                                                composer3 = composer4;
                                                i = i17;
                                                $composer4 = $composer3;
                                            }
                                            $composer2 = $composer4;
                                            Composer composer5 = composer3;
                                            composer3.endReplaceGroup();
                                            ComposerKt.sourceInformationMarkerEnd(composer3);
                                            ComposerKt.sourceInformationMarkerEnd(composer3);
                                            composer5.endNode();
                                            ComposerKt.sourceInformationMarkerEnd(composer5);
                                            ComposerKt.sourceInformationMarkerEnd(composer5);
                                            ComposerKt.sourceInformationMarkerEnd(composer5);
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
                                        composerM3808constructorimpl2.updateRememberedValue(Integer.valueOf(i2));
                                        composerM3808constructorimpl2.apply(Integer.valueOf(i2), setCompositeKeyHash3);
                                        Updater.m3815setimpl(composerM3808constructorimpl2, modifierMaterializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
                                        int i18 = (i12 >> 6) & 14;
                                        ComposerKt.sourceInformationMarkerStart(composer3, -407735110, "C101@5232L9:Row.kt#2w3rfo");
                                        RowScopeInstance rowScopeInstance3 = RowScopeInstance.INSTANCE;
                                        i3 = ((48 >> 6) & 112) | 6;
                                        ComposerKt.sourceInformationMarkerStart(composer3, -1214510654, "C:ChatScreen.kt#cyjvf");
                                        composer3.startReplaceGroup(99369879);
                                        ComposerKt.sourceInformation(composer3, "*745@27678L72,750@27881L367,741@27413L835");
                                        list2 = list;
                                        i4 = 0;
                                        i5 = 0;
                                        while (r54.hasNext()) {
                                            int i19 = i5 + 1;
                                            if (i5 < 0) {
                                                CollectionsKt.throwIndexOverflow();
                                            }
                                            Iterable iterable2 = list2;
                                            final String str2 = (String) obj;
                                            int i110 = i4;
                                            Modifier.Companion companion2 = Modifier.INSTANCE;
                                            if (enabled) {
                                                f = 1.0f;
                                            } else {
                                                f = 0.55f;
                                            }
                                            Modifier modifier2 = modifierMaterializeModifier;
                                            int i111 = i3;
                                            Alignment.Vertical vertical2 = top;
                                            Composer composer6 = composer3;
                                            int i112 = i;
                                            Modifier modifierM245borderxT4_qwU2 = BorderKt.m245borderxT4_qwU(AlphaKt.alpha(companion2, f), Dp.m6973constructorimpl(2), HuiyuanDesignKt.getInk(), RoundedCornerShapeKt.m1018RoundedCornerShape0680j_4(Dp.m6973constructorimpl(12)));
                                            HapticCue hapticCue2 = HapticCue.SELECTION;
                                            ComposerKt.sourceInformationMarkerStart(composer3, 1790479286, "CC(remember):ChatScreen.kt#9igjgp");
                                            if (($dirty2 & 896) == 256) {
                                                z = true;
                                            } else {
                                                z = false;
                                            }
                                            zChanged = $composer4.changed(str2) | z;
                                            objRememberedValue = composer3.rememberedValue();
                                            if (!zChanged) {
                                                $composer3 = $composer4;
                                                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                                }
                                                ComposerKt.sourceInformationMarkerEnd(composer3);
                                                SurfaceKt.m2670SurfaceT9BRK9s(AppHapticsKt.hapticClickable(modifierM245borderxT4_qwU2, enabled, hapticCue2, (Function0) objRememberedValue), RoundedCornerShapeKt.m1018RoundedCornerShape0680j_4(Dp.m6973constructorimpl(12)), ((Color) colors.get(i5 % colors.size())).m4376unboximpl(), 0L, 0.0f, 0.0f, null, ComposableLambdaKt.rememberComposableLambda(-1719440013, true, new Function2() { // from class: com.luchime.huiyuan.ui.ChatScreenKt$$ExternalSyntheticLambda47
                                                    @Override // kotlin.jvm.functions.Function2
                                                    public final Object invoke(Object obj3, Object obj4) {
                                                        return ChatScreenKt.QuickPromptRow$lambda$94$lambda$93$lambda$92$lambda$91(str2, (Composer) obj3, ((Integer) obj4).intValue());
                                                    }
                                                }, composer3, 54), composer3, 12582912, 120);
                                                i5 = i19;
                                                list2 = iterable2;
                                                i4 = i110;
                                                modifierMaterializeModifier = modifier2;
                                                i3 = i111;
                                                top = vertical2;
                                                composer3 = composer6;
                                                i = i112;
                                                $composer4 = $composer3;
                                            } else {
                                                $composer3 = $composer4;
                                            }
                                            Object obj3 = new Function0() { // from class: com.luchime.huiyuan.ui.ChatScreenKt$$ExternalSyntheticLambda46
                                                @Override // kotlin.jvm.functions.Function0
                                                public final Object invoke() {
                                                    return ChatScreenKt.QuickPromptRow$lambda$94$lambda$93$lambda$92$lambda$90$lambda$89(function1, str2);
                                                }
                                            };
                                            composer3.updateRememberedValue(obj3);
                                            objRememberedValue = obj3;
                                            ComposerKt.sourceInformationMarkerEnd(composer3);
                                            SurfaceKt.m2670SurfaceT9BRK9s(AppHapticsKt.hapticClickable(modifierM245borderxT4_qwU2, enabled, hapticCue2, (Function0) objRememberedValue), RoundedCornerShapeKt.m1018RoundedCornerShape0680j_4(Dp.m6973constructorimpl(12)), ((Color) colors.get(i5 % colors.size())).m4376unboximpl(), 0L, 0.0f, 0.0f, null, ComposableLambdaKt.rememberComposableLambda(-1719440013, true, new Function2() { // from class: com.luchime.huiyuan.ui.ChatScreenKt$$ExternalSyntheticLambda47
                                                @Override // kotlin.jvm.functions.Function2
                                                public final Object invoke(Object obj4, Object obj5) {
                                                    return ChatScreenKt.QuickPromptRow$lambda$94$lambda$93$lambda$92$lambda$91(str2, (Composer) obj4, ((Integer) obj5).intValue());
                                                }
                                            }, composer3, 54), composer3, 12582912, 120);
                                            i5 = i19;
                                            list2 = iterable2;
                                            i4 = i110;
                                            modifierMaterializeModifier = modifier2;
                                            i3 = i111;
                                            top = vertical2;
                                            composer3 = composer6;
                                            i = i112;
                                            $composer4 = $composer3;
                                        }
                                        $composer2 = $composer4;
                                        Composer composer7 = composer3;
                                        composer3.endReplaceGroup();
                                        ComposerKt.sourceInformationMarkerEnd(composer3);
                                        ComposerKt.sourceInformationMarkerEnd(composer3);
                                        composer7.endNode();
                                        ComposerKt.sourceInformationMarkerEnd(composer7);
                                        ComposerKt.sourceInformationMarkerEnd(composer7);
                                        ComposerKt.sourceInformationMarkerEnd(composer7);
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
                                    Updater.m3815setimpl(composerM3808constructorimpl3, modifierMaterializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
                                    int i20 = (i6 >> 6) & 14;
                                    composer2 = composer;
                                    ComposerKt.sourceInformationMarkerStart(composer2, -384672921, "C89@4556L9:Column.kt#2w3rfo");
                                    ColumnScopeInstance columnScopeInstance2 = ColumnScopeInstance.INSTANCE;
                                    int i21 = ((6 >> 6) & 112) | 6;
                                    ComposerKt.sourceInformationMarkerStart(composer2, -1895015426, "C708@26138L929,736@27180L21,733@27077L1195:ChatScreen.kt#cyjvf");
                                    Modifier modifierM727paddingVpY3zN4$default3 = PaddingKt.m727paddingVpY3zN4$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), Dp.m6973constructorimpl(14), 0.0f, 2, null);
                                    Arrangement.Horizontal spaceBetween2 = Arrangement.INSTANCE.getSpaceBetween();
                                    Alignment.Vertical centerVertically2 = Alignment.INSTANCE.getCenterVertically();
                                    ComposerKt.sourceInformationMarkerStart(composer2, 693286680, "CC(Row)P(2,1,3)99@5124L58,100@5187L130:Row.kt#2w3rfo");
                                    MeasurePolicy measurePolicyRowMeasurePolicy3 = RowKt.rowMeasurePolicy(spaceBetween2, centerVertically2, composer2, ((438 >> 3) & 14) | ((438 >> 3) & 112));
                                    ComposerKt.sourceInformationMarkerStart(composer2, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                                    currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                                    CompositionLocalMap currentCompositionLocalMap4 = composer2.getCurrentCompositionLocalMap();
                                    Modifier modifierMaterializeModifier4 = ComposedModifierKt.materializeModifier(composer2, modifierM727paddingVpY3zN4$default3);
                                    constructor = ComposeUiNode.INSTANCE.getConstructor();
                                    int i22 = ((((438 << 3) & 112) << 6) & 896) | 6;
                                    ComposerKt.sourceInformationMarkerStart(composer2, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
                                    if (!(composer2.getApplier() instanceof Applier)) {
                                        ComposablesKt.invalidApplier();
                                    }
                                    composer2.startReusableNode();
                                    if (composer2.getInserting()) {
                                        function4 = constructor;
                                        composer2.createNode(function4);
                                    } else {
                                        function4 = constructor;
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
                                    int i113 = (i22 >> 6) & 14;
                                    ComposerKt.sourceInformationMarkerStart(composer2, -407735110, "C101@5232L9:Row.kt#2w3rfo");
                                    RowScopeInstance rowScopeInstance4 = RowScopeInstance.INSTANCE;
                                    int i114 = ((438 >> 6) & 112) | 6;
                                    ComposerKt.sourceInformationMarkerStart(composer2, -776089787, "C715@26398L82,716@26493L564:ChatScreen.kt#cyjvf");
                                    TextKt.m2820Text4IGK_g("热门问题", (Modifier) null, Color.INSTANCE.m4403getWhite0d7_KjU(), TextUnitKt.getSp(13), (FontStyle) null, FontWeight.INSTANCE.getBlack(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, 200070, 0, 131026);
                                    SurfaceKt.m2670SurfaceT9BRK9s(AppHapticsKt.hapticClickable$default(BorderKt.m245borderxT4_qwU(Modifier.INSTANCE, Dp.m6973constructorimpl(2), HuiyuanDesignKt.getInk(), RoundedCornerShapeKt.getCircleShape()), false, HapticCue.SELECTION, function2, 1, null), RoundedCornerShapeKt.getCircleShape(), HuiyuanDesignKt.getSignalYellow(), 0L, 0.0f, 0.0f, null, ComposableSingletons$ChatScreenKt.INSTANCE.m7403getLambda$1226650512$app(), composer2, 12583296, 120);
                                    ComposerKt.sourceInformationMarkerEnd(composer2);
                                    ComposerKt.sourceInformationMarkerEnd(composer2);
                                    composer2.endNode();
                                    ComposerKt.sourceInformationMarkerEnd(composer2);
                                    ComposerKt.sourceInformationMarkerEnd(composer2);
                                    ComposerKt.sourceInformationMarkerEnd(composer2);
                                    Modifier modifierM726paddingVpY3zN5 = PaddingKt.m726paddingVpY3zN4(ScrollKt.horizontalScroll$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), ScrollKt.rememberScrollState(0, composer2, 0, 1), false, null, false, 14, null), Dp.m6973constructorimpl(14), Dp.m6973constructorimpl(7));
                                    Arrangement.Horizontal horizontalM606spacedBy0680j_5 = Arrangement.INSTANCE.m606spacedBy0680j_4(Dp.m6973constructorimpl(9));
                                    composer3 = composer2;
                                    i = 48;
                                    ComposerKt.sourceInformationMarkerStart(composer3, 693286680, "CC(Row)P(2,1,3)99@5124L58,100@5187L130:Row.kt#2w3rfo");
                                    top = Alignment.INSTANCE.getTop();
                                    MeasurePolicy measurePolicyRowMeasurePolicy4 = RowKt.rowMeasurePolicy(horizontalM606spacedBy0680j_5, top, composer3, ((48 >> 3) & 14) | ((48 >> 3) & 112));
                                    ComposerKt.sourceInformationMarkerStart(composer3, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                                    currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                                    CompositionLocalMap currentCompositionLocalMap5 = composer3.getCurrentCompositionLocalMap();
                                    modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer3, modifierM726paddingVpY3zN5);
                                    constructor2 = ComposeUiNode.INSTANCE.getConstructor();
                                    int i115 = ((((48 << 3) & 112) << 6) & 896) | 6;
                                    ComposerKt.sourceInformationMarkerStart(composer3, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
                                    if (!(composer3.getApplier() instanceof Applier)) {
                                        ComposablesKt.invalidApplier();
                                    }
                                    composer3.startReusableNode();
                                    if (composer3.getInserting()) {
                                        function5 = constructor2;
                                        composer3.createNode(function5);
                                    } else {
                                        function5 = constructor2;
                                        composer3.useNode();
                                    }
                                    composerM3808constructorimpl2 = Updater.m3808constructorimpl(composer3);
                                    Updater.m3815setimpl(composerM3808constructorimpl2, measurePolicyRowMeasurePolicy4, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                    Updater.m3815setimpl(composerM3808constructorimpl2, currentCompositionLocalMap5, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash5 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                                    if (composerM3808constructorimpl2.getInserting()) {
                                        i2 = currentCompositeKeyHash2;
                                        if (!Intrinsics.areEqual(composerM3808constructorimpl2.rememberedValue(), Integer.valueOf(i2))) {
                                        }
                                        Updater.m3815setimpl(composerM3808constructorimpl2, modifierMaterializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
                                        int i116 = (i115 >> 6) & 14;
                                        ComposerKt.sourceInformationMarkerStart(composer3, -407735110, "C101@5232L9:Row.kt#2w3rfo");
                                        RowScopeInstance rowScopeInstance5 = RowScopeInstance.INSTANCE;
                                        i3 = ((48 >> 6) & 112) | 6;
                                        ComposerKt.sourceInformationMarkerStart(composer3, -1214510654, "C:ChatScreen.kt#cyjvf");
                                        composer3.startReplaceGroup(99369879);
                                        ComposerKt.sourceInformation(composer3, "*745@27678L72,750@27881L367,741@27413L835");
                                        list2 = list;
                                        i4 = 0;
                                        i5 = 0;
                                        while (r54.hasNext()) {
                                            int i117 = i5 + 1;
                                            if (i5 < 0) {
                                                CollectionsKt.throwIndexOverflow();
                                            }
                                            Iterable iterable3 = list2;
                                            final String str3 = (String) obj;
                                            int i118 = i4;
                                            Modifier.Companion companion3 = Modifier.INSTANCE;
                                            if (enabled) {
                                                f = 1.0f;
                                            } else {
                                                f = 0.55f;
                                            }
                                            Modifier modifier3 = modifierMaterializeModifier;
                                            int i119 = i3;
                                            Alignment.Vertical vertical3 = top;
                                            Composer composer8 = composer3;
                                            int i1110 = i;
                                            Modifier modifierM245borderxT4_qwU3 = BorderKt.m245borderxT4_qwU(AlphaKt.alpha(companion3, f), Dp.m6973constructorimpl(2), HuiyuanDesignKt.getInk(), RoundedCornerShapeKt.m1018RoundedCornerShape0680j_4(Dp.m6973constructorimpl(12)));
                                            HapticCue hapticCue3 = HapticCue.SELECTION;
                                            ComposerKt.sourceInformationMarkerStart(composer3, 1790479286, "CC(remember):ChatScreen.kt#9igjgp");
                                            if (($dirty2 & 896) == 256) {
                                                z = true;
                                            } else {
                                                z = false;
                                            }
                                            zChanged = $composer4.changed(str3) | z;
                                            objRememberedValue = composer3.rememberedValue();
                                            if (!zChanged) {
                                                $composer3 = $composer4;
                                                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                                }
                                                ComposerKt.sourceInformationMarkerEnd(composer3);
                                                SurfaceKt.m2670SurfaceT9BRK9s(AppHapticsKt.hapticClickable(modifierM245borderxT4_qwU3, enabled, hapticCue3, (Function0) objRememberedValue), RoundedCornerShapeKt.m1018RoundedCornerShape0680j_4(Dp.m6973constructorimpl(12)), ((Color) colors.get(i5 % colors.size())).m4376unboximpl(), 0L, 0.0f, 0.0f, null, ComposableLambdaKt.rememberComposableLambda(-1719440013, true, new Function2() { // from class: com.luchime.huiyuan.ui.ChatScreenKt$$ExternalSyntheticLambda47
                                                    @Override // kotlin.jvm.functions.Function2
                                                    public final Object invoke(Object obj4, Object obj5) {
                                                        return ChatScreenKt.QuickPromptRow$lambda$94$lambda$93$lambda$92$lambda$91(str3, (Composer) obj4, ((Integer) obj5).intValue());
                                                    }
                                                }, composer3, 54), composer3, 12582912, 120);
                                                i5 = i117;
                                                list2 = iterable3;
                                                i4 = i118;
                                                modifierMaterializeModifier = modifier3;
                                                i3 = i119;
                                                top = vertical3;
                                                composer3 = composer8;
                                                i = i1110;
                                                $composer4 = $composer3;
                                            } else {
                                                $composer3 = $composer4;
                                            }
                                            Object obj4 = new Function0() { // from class: com.luchime.huiyuan.ui.ChatScreenKt$$ExternalSyntheticLambda46
                                                @Override // kotlin.jvm.functions.Function0
                                                public final Object invoke() {
                                                    return ChatScreenKt.QuickPromptRow$lambda$94$lambda$93$lambda$92$lambda$90$lambda$89(function1, str3);
                                                }
                                            };
                                            composer3.updateRememberedValue(obj4);
                                            objRememberedValue = obj4;
                                            ComposerKt.sourceInformationMarkerEnd(composer3);
                                            SurfaceKt.m2670SurfaceT9BRK9s(AppHapticsKt.hapticClickable(modifierM245borderxT4_qwU3, enabled, hapticCue3, (Function0) objRememberedValue), RoundedCornerShapeKt.m1018RoundedCornerShape0680j_4(Dp.m6973constructorimpl(12)), ((Color) colors.get(i5 % colors.size())).m4376unboximpl(), 0L, 0.0f, 0.0f, null, ComposableLambdaKt.rememberComposableLambda(-1719440013, true, new Function2() { // from class: com.luchime.huiyuan.ui.ChatScreenKt$$ExternalSyntheticLambda47
                                                @Override // kotlin.jvm.functions.Function2
                                                public final Object invoke(Object obj5, Object obj6) {
                                                    return ChatScreenKt.QuickPromptRow$lambda$94$lambda$93$lambda$92$lambda$91(str3, (Composer) obj5, ((Integer) obj6).intValue());
                                                }
                                            }, composer3, 54), composer3, 12582912, 120);
                                            i5 = i117;
                                            list2 = iterable3;
                                            i4 = i118;
                                            modifierMaterializeModifier = modifier3;
                                            i3 = i119;
                                            top = vertical3;
                                            composer3 = composer8;
                                            i = i1110;
                                            $composer4 = $composer3;
                                        }
                                        $composer2 = $composer4;
                                        Composer composer9 = composer3;
                                        composer3.endReplaceGroup();
                                        ComposerKt.sourceInformationMarkerEnd(composer3);
                                        ComposerKt.sourceInformationMarkerEnd(composer3);
                                        composer9.endNode();
                                        ComposerKt.sourceInformationMarkerEnd(composer9);
                                        ComposerKt.sourceInformationMarkerEnd(composer9);
                                        ComposerKt.sourceInformationMarkerEnd(composer9);
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
                                        i2 = currentCompositeKeyHash2;
                                    }
                                    composerM3808constructorimpl2.updateRememberedValue(Integer.valueOf(i2));
                                    composerM3808constructorimpl2.apply(Integer.valueOf(i2), setCompositeKeyHash5);
                                    Updater.m3815setimpl(composerM3808constructorimpl2, modifierMaterializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
                                    int i1111 = (i115 >> 6) & 14;
                                    ComposerKt.sourceInformationMarkerStart(composer3, -407735110, "C101@5232L9:Row.kt#2w3rfo");
                                    RowScopeInstance rowScopeInstance6 = RowScopeInstance.INSTANCE;
                                    i3 = ((48 >> 6) & 112) | 6;
                                    ComposerKt.sourceInformationMarkerStart(composer3, -1214510654, "C:ChatScreen.kt#cyjvf");
                                    composer3.startReplaceGroup(99369879);
                                    ComposerKt.sourceInformation(composer3, "*745@27678L72,750@27881L367,741@27413L835");
                                    list2 = list;
                                    i4 = 0;
                                    i5 = 0;
                                    while (r54.hasNext()) {
                                        int i1112 = i5 + 1;
                                        if (i5 < 0) {
                                            CollectionsKt.throwIndexOverflow();
                                        }
                                        Iterable iterable4 = list2;
                                        final String str4 = (String) obj;
                                        int i1113 = i4;
                                        Modifier.Companion companion4 = Modifier.INSTANCE;
                                        if (enabled) {
                                            f = 1.0f;
                                        } else {
                                            f = 0.55f;
                                        }
                                        Modifier modifier4 = modifierMaterializeModifier;
                                        int i1114 = i3;
                                        Alignment.Vertical vertical4 = top;
                                        Composer composer10 = composer3;
                                        int i1115 = i;
                                        Modifier modifierM245borderxT4_qwU4 = BorderKt.m245borderxT4_qwU(AlphaKt.alpha(companion4, f), Dp.m6973constructorimpl(2), HuiyuanDesignKt.getInk(), RoundedCornerShapeKt.m1018RoundedCornerShape0680j_4(Dp.m6973constructorimpl(12)));
                                        HapticCue hapticCue4 = HapticCue.SELECTION;
                                        ComposerKt.sourceInformationMarkerStart(composer3, 1790479286, "CC(remember):ChatScreen.kt#9igjgp");
                                        if (($dirty2 & 896) == 256) {
                                            z = true;
                                        } else {
                                            z = false;
                                        }
                                        zChanged = $composer4.changed(str4) | z;
                                        objRememberedValue = composer3.rememberedValue();
                                        if (!zChanged) {
                                            $composer3 = $composer4;
                                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                            }
                                            ComposerKt.sourceInformationMarkerEnd(composer3);
                                            SurfaceKt.m2670SurfaceT9BRK9s(AppHapticsKt.hapticClickable(modifierM245borderxT4_qwU4, enabled, hapticCue4, (Function0) objRememberedValue), RoundedCornerShapeKt.m1018RoundedCornerShape0680j_4(Dp.m6973constructorimpl(12)), ((Color) colors.get(i5 % colors.size())).m4376unboximpl(), 0L, 0.0f, 0.0f, null, ComposableLambdaKt.rememberComposableLambda(-1719440013, true, new Function2() { // from class: com.luchime.huiyuan.ui.ChatScreenKt$$ExternalSyntheticLambda47
                                                @Override // kotlin.jvm.functions.Function2
                                                public final Object invoke(Object obj5, Object obj6) {
                                                    return ChatScreenKt.QuickPromptRow$lambda$94$lambda$93$lambda$92$lambda$91(str4, (Composer) obj5, ((Integer) obj6).intValue());
                                                }
                                            }, composer3, 54), composer3, 12582912, 120);
                                            i5 = i1112;
                                            list2 = iterable4;
                                            i4 = i1113;
                                            modifierMaterializeModifier = modifier4;
                                            i3 = i1114;
                                            top = vertical4;
                                            composer3 = composer10;
                                            i = i1115;
                                            $composer4 = $composer3;
                                        } else {
                                            $composer3 = $composer4;
                                        }
                                        Object obj5 = new Function0() { // from class: com.luchime.huiyuan.ui.ChatScreenKt$$ExternalSyntheticLambda46
                                            @Override // kotlin.jvm.functions.Function0
                                            public final Object invoke() {
                                                return ChatScreenKt.QuickPromptRow$lambda$94$lambda$93$lambda$92$lambda$90$lambda$89(function1, str4);
                                            }
                                        };
                                        composer3.updateRememberedValue(obj5);
                                        objRememberedValue = obj5;
                                        ComposerKt.sourceInformationMarkerEnd(composer3);
                                        SurfaceKt.m2670SurfaceT9BRK9s(AppHapticsKt.hapticClickable(modifierM245borderxT4_qwU4, enabled, hapticCue4, (Function0) objRememberedValue), RoundedCornerShapeKt.m1018RoundedCornerShape0680j_4(Dp.m6973constructorimpl(12)), ((Color) colors.get(i5 % colors.size())).m4376unboximpl(), 0L, 0.0f, 0.0f, null, ComposableLambdaKt.rememberComposableLambda(-1719440013, true, new Function2() { // from class: com.luchime.huiyuan.ui.ChatScreenKt$$ExternalSyntheticLambda47
                                            @Override // kotlin.jvm.functions.Function2
                                            public final Object invoke(Object obj6, Object obj7) {
                                                return ChatScreenKt.QuickPromptRow$lambda$94$lambda$93$lambda$92$lambda$91(str4, (Composer) obj6, ((Integer) obj7).intValue());
                                            }
                                        }, composer3, 54), composer3, 12582912, 120);
                                        i5 = i1112;
                                        list2 = iterable4;
                                        i4 = i1113;
                                        modifierMaterializeModifier = modifier4;
                                        i3 = i1114;
                                        top = vertical4;
                                        composer3 = composer10;
                                        i = i1115;
                                        $composer4 = $composer3;
                                    }
                                    $composer2 = $composer4;
                                    Composer composer11 = composer3;
                                    composer3.endReplaceGroup();
                                    ComposerKt.sourceInformationMarkerEnd(composer3);
                                    ComposerKt.sourceInformationMarkerEnd(composer3);
                                    composer11.endNode();
                                    ComposerKt.sourceInformationMarkerEnd(composer11);
                                    ComposerKt.sourceInformationMarkerEnd(composer11);
                                    ComposerKt.sourceInformationMarkerEnd(composer11);
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
                                ScopeUpdateScope scopeUpdateScopeEndRestartGroup = $composer2.endRestartGroup();
                                if (scopeUpdateScopeEndRestartGroup != null) {
                                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.luchime.huiyuan.ui.ChatScreenKt$$ExternalSyntheticLambda48
                                        @Override // kotlin.jvm.functions.Function2
                                        public final Object invoke(Object obj6, Object obj7) {
                                            return ChatScreenKt.QuickPromptRow$lambda$95(list, enabled, function1, function0, $changed, (Composer) obj6, ((Integer) obj7).intValue());
                                        }
                                    });
                                }
                            }

                            static final Unit QuickPromptRow$lambda$94$lambda$93$lambda$92$lambda$90$lambda$89(Function1 $onPrompt, String $prompt) {
                                $onPrompt.invoke($prompt);
                                return Unit.INSTANCE;
                            }

                            static final Unit QuickPromptRow$lambda$94$lambda$93$lambda$92$lambda$91(String $prompt, Composer $composer, int $changed) {
                                ComposerKt.sourceInformation($composer, "C751@27903L327:ChatScreen.kt#cyjvf");
                                if ($composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-1719440013, $changed, -1, "com.luchime.huiyuan.ui.QuickPromptRow.<anonymous>.<anonymous>.<anonymous>.<anonymous> (ChatScreen.kt:751)");
                                    }
                                    TextKt.m2820Text4IGK_g($prompt, PaddingKt.m726paddingVpY3zN4(Modifier.INSTANCE, Dp.m6973constructorimpl(13), Dp.m6973constructorimpl(10)), HuiyuanDesignKt.getInk(), TextUnitKt.getSp(12), (FontStyle) null, FontWeight.INSTANCE.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 1, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, $composer, 200112, 3072, 122832);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                } else {
                                    $composer.skipToGroupEnd();
                                }
                                return Unit.INSTANCE;
                            }

                            /* JADX WARN: Code duplicated, block: B:35:0x01f2  */
                            private static final void ModelAvatar(final AIModel model, Composer $composer, final int $changed) {
                                Composer $composer2;
                                Function0<ComposeUiNode> function0;
                                int i;
                                Composer composer;
                                Composer $composer3 = $composer.startRestartGroup(-2108680164);
                                ComposerKt.sourceInformation($composer3, "C(ModelAvatar)767@28340L462:ChatScreen.kt#cyjvf");
                                int $dirty = $changed;
                                if (($changed & 6) == 0) {
                                    $dirty |= $composer3.changed(model.ordinal()) ? 4 : 2;
                                }
                                if (!$composer3.shouldExecute(($dirty & 3) != 2, $dirty & 1)) {
                                    $composer2 = $composer3;
                                    $composer2.skipToGroupEnd();
                                } else {
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-2108680164, $dirty, -1, "com.luchime.huiyuan.ui.ModelAvatar (ChatScreen.kt:766)");
                                    }
                                    Modifier modifierClip = ClipKt.clip(PaddingKt.m725padding3ABfNKs(BorderKt.m245borderxT4_qwU(BackgroundKt.m233backgroundbw27NRU(SizeKt.m772size3ABfNKs(Modifier.INSTANCE, Dp.m6973constructorimpl(36)), modelAccent(model), RoundedCornerShapeKt.getCircleShape()), Dp.m6973constructorimpl(2), HuiyuanDesignKt.getInk(), RoundedCornerShapeKt.getCircleShape()), Dp.m6973constructorimpl(2)), RoundedCornerShapeKt.getCircleShape());
                                    ComposerKt.sourceInformationMarkerStart($composer3, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
                                    MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                                    ComposerKt.sourceInformationMarkerStart($composer3, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                                    int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash($composer3, 0);
                                    CompositionLocalMap currentCompositionLocalMap = $composer3.getCurrentCompositionLocalMap();
                                    Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier($composer3, modifierClip);
                                    Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                                    $composer2 = $composer3;
                                    int i2 = ((((0 << 3) & 112) << 6) & 896) | 6;
                                    ComposerKt.sourceInformationMarkerStart($composer3, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
                                    if (!($composer3.getApplier() instanceof Applier)) {
                                        ComposablesKt.invalidApplier();
                                    }
                                    $composer3.startReusableNode();
                                    if ($composer3.getInserting()) {
                                        function0 = constructor;
                                        $composer3.createNode(function0);
                                    } else {
                                        function0 = constructor;
                                        $composer3.useNode();
                                    }
                                    Composer composerM3808constructorimpl = Updater.m3808constructorimpl($composer3);
                                    Updater.m3815setimpl(composerM3808constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                    Updater.m3815setimpl(composerM3808constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                                    if (composerM3808constructorimpl.getInserting()) {
                                        i = 0;
                                        composer = $composer3;
                                    } else {
                                        i = 0;
                                        composer = $composer3;
                                        if (!Intrinsics.areEqual(composerM3808constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                        }
                                        Updater.m3815setimpl(composerM3808constructorimpl, modifierMaterializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
                                        int i3 = (i2 >> 6) & 14;
                                        Composer composer2 = composer;
                                        ComposerKt.sourceInformationMarkerStart(composer2, -2146730711, "C72@3468L9:Box.kt#2w3rfo");
                                        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                                        int i4 = ((i >> 6) & 112) | 6;
                                        ComposerKt.sourceInformationMarkerStart(composer2, -515687890, "C776@28602L32,775@28573L223:ChatScreen.kt#cyjvf");
                                        ImageKt.Image(PainterResources_androidKt.painterResource(model.getAvatarRes(), composer2, 0), model.getDisplayName() + "头像", SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), (Alignment) null, ContentScale.INSTANCE.getCrop(), 0.0f, (ColorFilter) null, composer2, 24960, LocationRequestCompat.QUALITY_LOW_POWER);
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
                                    composerM3808constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                    composerM3808constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                    Updater.m3815setimpl(composerM3808constructorimpl, modifierMaterializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
                                    int i5 = (i2 >> 6) & 14;
                                    Composer composer3 = composer;
                                    ComposerKt.sourceInformationMarkerStart(composer3, -2146730711, "C72@3468L9:Box.kt#2w3rfo");
                                    BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                                    int i6 = ((i >> 6) & 112) | 6;
                                    ComposerKt.sourceInformationMarkerStart(composer3, -515687890, "C776@28602L32,775@28573L223:ChatScreen.kt#cyjvf");
                                    ImageKt.Image(PainterResources_androidKt.painterResource(model.getAvatarRes(), composer3, 0), model.getDisplayName() + "头像", SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), (Alignment) null, ContentScale.INSTANCE.getCrop(), 0.0f, (ColorFilter) null, composer3, 24960, LocationRequestCompat.QUALITY_LOW_POWER);
                                    ComposerKt.sourceInformationMarkerEnd(composer3);
                                    ComposerKt.sourceInformationMarkerEnd(composer3);
                                    composer.endNode();
                                    ComposerKt.sourceInformationMarkerEnd(composer);
                                    ComposerKt.sourceInformationMarkerEnd(composer);
                                    ComposerKt.sourceInformationMarkerEnd(composer);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                }
                                ScopeUpdateScope scopeUpdateScopeEndRestartGroup = $composer2.endRestartGroup();
                                if (scopeUpdateScopeEndRestartGroup != null) {
                                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.luchime.huiyuan.ui.ChatScreenKt$$ExternalSyntheticLambda27
                                        @Override // kotlin.jvm.functions.Function2
                                        public final Object invoke(Object obj, Object obj2) {
                                            return ChatScreenKt.ModelAvatar$lambda$97(model, $changed, (Composer) obj, ((Integer) obj2).intValue());
                                        }
                                    });
                                }
                            }

                            /* JADX INFO: Access modifiers changed from: private */
                            public static final void MessageBubble(final TimelineItem.Message message, final boolean favorite, final Function0<Unit> function0, final Function0<Unit> function1, final Function0<Unit> function2, Composer $composer, final int $changed) {
                                final TimelineItem.Message message2;
                                final boolean z;
                                final Function0<Unit> function3;
                                final Function0<Unit> function4;
                                final Function0<Unit> function5;
                                Function0<ComposeUiNode> function6;
                                Composer $composer2 = $composer.startRestartGroup(2020447141);
                                ComposerKt.sourceInformation($composer2, "C(MessageBubble)P(1)792@28993L1838:ChatScreen.kt#cyjvf");
                                int $dirty = $changed;
                                if (($changed & 6) == 0) {
                                    message2 = message;
                                    $dirty |= $composer2.changed(message2) ? 4 : 2;
                                } else {
                                    message2 = message;
                                }
                                if (($changed & 48) == 0) {
                                    z = favorite;
                                    $dirty |= $composer2.changed(z) ? 32 : 16;
                                } else {
                                    z = favorite;
                                }
                                if (($changed & 384) == 0) {
                                    function3 = function0;
                                    $dirty |= $composer2.changedInstance(function3) ? 256 : 128;
                                } else {
                                    function3 = function0;
                                }
                                if (($changed & 3072) == 0) {
                                    function4 = function1;
                                    $dirty |= $composer2.changedInstance(function4) ? 2048 : 1024;
                                } else {
                                    function4 = function1;
                                }
                                if (($changed & 24576) == 0) {
                                    function5 = function2;
                                    $dirty |= $composer2.changedInstance(function5) ? 16384 : 8192;
                                } else {
                                    function5 = function2;
                                }
                                int $dirty2 = $dirty;
                                if ($composer2.shouldExecute(($dirty2 & 9363) != 9362, $dirty2 & 1)) {
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(2020447141, $dirty2, -1, "com.luchime.huiyuan.ui.MessageBubble (ChatScreen.kt:791)");
                                    }
                                    Modifier modifierM729paddingqDBjuR0$default = PaddingKt.m729paddingqDBjuR0$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), message2.isUser() ? Dp.m6973constructorimpl(58) : Dp.m6973constructorimpl(16), Dp.m6973constructorimpl(14), message2.isUser() ? Dp.m6973constructorimpl(16) : Dp.m6973constructorimpl(38), 0.0f, 8, null);
                                    Arrangement.Horizontal end = message2.isUser() ? Arrangement.INSTANCE.getEnd() : Arrangement.INSTANCE.getStart();
                                    Alignment.Vertical bottom = Alignment.INSTANCE.getBottom();
                                    ComposerKt.sourceInformationMarkerStart($composer2, 693286680, "CC(Row)P(2,1,3)99@5124L58,100@5187L130:Row.kt#2w3rfo");
                                    MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(end, bottom, $composer2, ((384 >> 3) & 14) | ((384 >> 3) & 112));
                                    ComposerKt.sourceInformationMarkerStart($composer2, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                                    int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash($composer2, 0);
                                    CompositionLocalMap currentCompositionLocalMap = $composer2.getCurrentCompositionLocalMap();
                                    Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier($composer2, modifierM729paddingqDBjuR0$default);
                                    Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                                    int i = ((((384 << 3) & 112) << 6) & 896) | 6;
                                    ComposerKt.sourceInformationMarkerStart($composer2, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
                                    if (!($composer2.getApplier() instanceof Applier)) {
                                        ComposablesKt.invalidApplier();
                                    }
                                    $composer2.startReusableNode();
                                    if ($composer2.getInserting()) {
                                        function6 = constructor;
                                        $composer2.createNode(function6);
                                    } else {
                                        function6 = constructor;
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
                                    ComposerKt.sourceInformationMarkerStart($composer2, 1313123499, "C808@29590L1102,808@29516L1176:ChatScreen.kt#cyjvf");
                                    if (message2.isUser()) {
                                        $composer2.startReplaceGroup(1283919297);
                                    } else {
                                        $composer2.startReplaceGroup(1313102790);
                                        ComposerKt.sourceInformation($composer2, "804@29429L26,805@29468L28");
                                        ModelAvatar(message2.getModel(), $composer2, 0);
                                        SpacerKt.Spacer(SizeKt.m777width3ABfNKs(Modifier.INSTANCE, Dp.m6973constructorimpl(8)), $composer2, 6);
                                    }
                                    $composer2.endReplaceGroup();
                                    HuiyuanDesignKt.m7414RetroCard3IgeMak(null, message2.isUser() ? HuiyuanDesignKt.getSignalOrange() : Color.INSTANCE.m4403getWhite0d7_KjU(), ComposableLambdaKt.rememberComposableLambda(-2143227689, true, new Function3() { // from class: com.luchime.huiyuan.ui.ChatScreenKt$$ExternalSyntheticLambda23
                                        @Override // kotlin.jvm.functions.Function3
                                        public final Object invoke(Object obj, Object obj2, Object obj3) {
                                            return ChatScreenKt.MessageBubble$lambda$101$lambda$100(message2, function3, function4, z, function5, (BoxScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
                                        }
                                    }, $composer2, 54), $composer2, 384, 1);
                                    if (message.isUser()) {
                                        $composer2.startReplaceGroup(1314399706);
                                        ComposerKt.sourceInformation($composer2, "836@30736L28,837@30777L38");
                                        SpacerKt.Spacer(SizeKt.m777width3ABfNKs(Modifier.INSTANCE, Dp.m6973constructorimpl(8)), $composer2, 6);
                                        HuiyuanDesignKt.m7412Avatar3IgeMak("你", HuiyuanDesignKt.getSignalBlue(), null, $composer2, 54, 4);
                                    } else {
                                        $composer2.startReplaceGroup(1283919297);
                                    }
                                    $composer2.endReplaceGroup();
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
                                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.luchime.huiyuan.ui.ChatScreenKt$$ExternalSyntheticLambda24
                                        @Override // kotlin.jvm.functions.Function2
                                        public final Object invoke(Object obj, Object obj2) {
                                            return ChatScreenKt.MessageBubble$lambda$102(message, favorite, function0, function1, function2, $changed, (Composer) obj, ((Integer) obj2).intValue());
                                        }
                                    });
                                }
                            }

                            /* JADX WARN: Code duplicated, block: B:31:0x0188  */
                            /* JADX WARN: Code duplicated, block: B:34:0x019d  */
                            /* JADX WARN: Code duplicated, block: B:35:0x01a0  */
                            /* JADX WARN: Code duplicated, block: B:38:0x01b9  */
                            /* JADX WARN: Code duplicated, block: B:39:0x01c0  */
                            /* JADX WARN: Code duplicated, block: B:68:0x03b0  */
                            /* JADX WARN: Code duplicated, block: B:71:0x03dc  */
                            static final Unit MessageBubble$lambda$101$lambda$100(TimelineItem.Message $message, Function0 $onCopy, Function0 $onShare, boolean $favorite, Function0 $onToggleFavorite, BoxScope RetroCard, Composer $composer, int $changed) {
                                Function0<ComposeUiNode> function0;
                                int i;
                                String str;
                                long ink;
                                Function0<ComposeUiNode> function1;
                                Intrinsics.checkNotNullParameter(RetroCard, "$this$RetroCard");
                                ComposerKt.sourceInformation($composer, "C809@29604L1078:ChatScreen.kt#cyjvf");
                                if ($composer.shouldExecute(($changed & 17) != 16, $changed & 1)) {
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-2143227689, $changed, -1, "com.luchime.huiyuan.ui.MessageBubble.<anonymous>.<anonymous> (ChatScreen.kt:809)");
                                    }
                                    Modifier modifierAnimateContentSize$default = AnimationModifierKt.animateContentSize$default(Modifier.INSTANCE, null, null, 3, null);
                                    ComposerKt.sourceInformationMarkerStart($composer, -483455358, "CC(Column)P(2,3,1)87@4442L61,88@4508L133:Column.kt#2w3rfo");
                                    MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), $composer, ((0 >> 3) & 14) | ((0 >> 3) & 112));
                                    ComposerKt.sourceInformationMarkerStart($composer, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                                    int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash($composer, 0);
                                    CompositionLocalMap currentCompositionLocalMap = $composer.getCurrentCompositionLocalMap();
                                    Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier($composer, modifierAnimateContentSize$default);
                                    Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                                    int i2 = ((((0 << 3) & 112) << 6) & 896) | 6;
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
                                        i = 0;
                                    } else {
                                        i = 0;
                                        if (!Intrinsics.areEqual(composerM3808constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                        }
                                        Updater.m3815setimpl(composerM3808constructorimpl, modifierMaterializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
                                        int i3 = (i2 >> 6) & 14;
                                        ComposerKt.sourceInformationMarkerStart($composer, -384672921, "C89@4556L9:Column.kt#2w3rfo");
                                        ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                                        int i4 = ((i >> 6) & 112) | 6;
                                        ComposerKt.sourceInformationMarkerStart($composer, 1315150141, "C814@29848L303:ChatScreen.kt#cyjvf");
                                        if (!$message.isUser() || $message.getTag() == null) {
                                            $composer.startReplaceGroup(1285684609);
                                        } else {
                                            $composer.startReplaceGroup(1315166477);
                                            ComposerKt.sourceInformation($composer, "811@29737L26,812@29784L29");
                                            HuiyuanDesignKt.m7413CategoryBadgeiJQMabo($message.getTag(), 0L, $composer, 0, 2);
                                            SpacerKt.Spacer(SizeKt.m758height3ABfNKs(Modifier.INSTANCE, Dp.m6973constructorimpl(6)), $composer, 6);
                                        }
                                        $composer.endReplaceGroup();
                                        String text = $message.getText();
                                        if ($message.isStreaming()) {
                                            str = " ▍";
                                        } else {
                                            str = "";
                                        }
                                        String str2 = text + str;
                                        if ($message.isUser()) {
                                            ink = Color.INSTANCE.m4403getWhite0d7_KjU();
                                        } else {
                                            ink = HuiyuanDesignKt.getInk();
                                        }
                                        TextKt.m2820Text4IGK_g(str2, (Modifier) null, ink, TextUnitKt.getSp(14), (FontStyle) null, FontWeight.INSTANCE.getMedium(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, TextUnitKt.getSp(24), 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, $composer, 199680, 6, 130002);
                                        if (!$message.isUser() || $message.isStreaming()) {
                                            $composer.startReplaceGroup(1285684609);
                                        } else {
                                            $composer.startReplaceGroup(1315671963);
                                            ComposerKt.sourceInformation($composer, "823@30236L29,824@30286L364");
                                            SpacerKt.Spacer(SizeKt.m758height3ABfNKs(Modifier.INSTANCE, Dp.m6973constructorimpl(9)), $composer, 6);
                                            Arrangement.Horizontal horizontalM606spacedBy0680j_4 = Arrangement.INSTANCE.m606spacedBy0680j_4(Dp.m6973constructorimpl(7));
                                            ComposerKt.sourceInformationMarkerStart($composer, 693286680, "CC(Row)P(2,1,3)99@5124L58,100@5187L130:Row.kt#2w3rfo");
                                            Modifier modifier = Modifier.INSTANCE;
                                            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(horizontalM606spacedBy0680j_4, Alignment.INSTANCE.getTop(), $composer, ((48 >> 3) & 14) | ((48 >> 3) & 112));
                                            ComposerKt.sourceInformationMarkerStart($composer, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                                            int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash($composer, 0);
                                            CompositionLocalMap currentCompositionLocalMap2 = $composer.getCurrentCompositionLocalMap();
                                            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier($composer, modifier);
                                            Function0<ComposeUiNode> constructor2 = ComposeUiNode.INSTANCE.getConstructor();
                                            int i5 = ((((48 << 3) & 112) << 6) & 896) | 6;
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
                                            Composer composerM3808constructorimpl2 = Updater.m3808constructorimpl($composer);
                                            Updater.m3815setimpl(composerM3808constructorimpl2, measurePolicyRowMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                            Updater.m3815setimpl(composerM3808constructorimpl2, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                                            if (composerM3808constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM3808constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                                                composerM3808constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                                                composerM3808constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                                            }
                                            Updater.m3815setimpl(composerM3808constructorimpl2, modifierMaterializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
                                            int i6 = (i5 >> 6) & 14;
                                            ComposerKt.sourceInformationMarkerStart($composer, -407735110, "C101@5232L9:Row.kt#2w3rfo");
                                            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                                            int i7 = ((48 >> 6) & 112) | 6;
                                            ComposerKt.sourceInformationMarkerStart($composer, -1487371084, "C825@30368L27,826@30420L28:ChatScreen.kt#cyjvf");
                                            MessageAction("复制", $onCopy, $composer, 6);
                                            MessageAction("分享", $onShare, $composer, 6);
                                            if ($message.getSourceQuote() != null) {
                                                $composer.startReplaceGroup(-1487238467);
                                                ComposerKt.sourceInformation($composer, "828@30536L66");
                                                MessageAction($favorite ? "★ 已收藏" : "☆ 收藏", $onToggleFavorite, $composer, 0);
                                            } else {
                                                $composer.startReplaceGroup(-1517505193);
                                            }
                                            $composer.endReplaceGroup();
                                            ComposerKt.sourceInformationMarkerEnd($composer);
                                            ComposerKt.sourceInformationMarkerEnd($composer);
                                            $composer.endNode();
                                            ComposerKt.sourceInformationMarkerEnd($composer);
                                            ComposerKt.sourceInformationMarkerEnd($composer);
                                            ComposerKt.sourceInformationMarkerEnd($composer);
                                        }
                                        $composer.endReplaceGroup();
                                        ComposerKt.sourceInformationMarkerEnd($composer);
                                        ComposerKt.sourceInformationMarkerEnd($composer);
                                        
                                        /*  JADX ERROR: Method code generation error
                                            jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x03c7: INVOKE (r6v1 ?? I:??[OBJECT, ARRAY]) INTERFACE call: androidx.compose.runtime.Composer.endNode():void A[MD:():void (m)] (LINE:2819) in method: com.luchime.huiyuan.ui.ChatScreenKt.MessageBubble$lambda$101$lambda$100(com.luchime.huiyuan.ui.TimelineItem$Message, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, boolean, kotlin.jvm.functions.Function0, androidx.compose.foundation.layout.BoxScope, androidx.compose.runtime.Composer, int):kotlin.Unit, file: classes5.dex
                                            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:310)
                                            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:273)
                                            	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:94)
                                            	at jadx.core.dex.nodes.IBlock.generate(IBlock.java:15)
                                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                            	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                            	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                                            	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:140)
                                            	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                            	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                            	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                                            	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:126)
                                            	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                            	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                            	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:291)
                                            	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:275)
                                            	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:420)
                                            	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:345)
                                            	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:299)
                                            	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:184)
                                            	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
                                            	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                                            	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
                                            Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r6v1 ??
                                            	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:236)
                                            */
                                        /*
                                            Method dump skipped, instruction units count: 1000
                                            To view this dump change 'Code comments level' option to 'DEBUG'
                                        */
                                        throw new UnsupportedOperationException("Method not decompiled: com.luchime.huiyuan.ui.ChatScreenKt.MessageBubble$lambda$101$lambda$100(com.luchime.huiyuan.ui.TimelineItem$Message, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, boolean, kotlin.jvm.functions.Function0, androidx.compose.foundation.layout.BoxScope, androidx.compose.runtime.Composer, int):kotlin.Unit");
                                    }

                                    private static final void MessageAction(final String text, final Function0<Unit> function0, Composer $composer, final int $changed) {
                                        Composer $composer2;
                                        Composer $composer3 = $composer.startRestartGroup(-758153133);
                                        ComposerKt.sourceInformation($composer3, "C(MessageAction)P(1)844@30914L385:ChatScreen.kt#cyjvf");
                                        int $dirty = $changed;
                                        if (($changed & 6) == 0) {
                                            $dirty |= $composer3.changed(text) ? 4 : 2;
                                        }
                                        if (($changed & 48) == 0) {
                                            $dirty |= $composer3.changedInstance(function0) ? 32 : 16;
                                        }
                                        int $dirty2 = $dirty;
                                        if ($composer3.shouldExecute(($dirty2 & 19) != 18, $dirty2 & 1)) {
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventStart(-758153133, $dirty2, -1, "com.luchime.huiyuan.ui.MessageAction (ChatScreen.kt:843)");
                                            }
                                            $composer2 = $composer3;
                                            TextKt.m2820Text4IGK_g(text, PaddingKt.m726paddingVpY3zN4(AppHapticsKt.hapticClickable$default(BorderKt.m245borderxT4_qwU(BackgroundKt.m233backgroundbw27NRU(Modifier.INSTANCE, HuiyuanDesignKt.getPaper(), RoundedCornerShapeKt.m1018RoundedCornerShape0680j_4(Dp.m6973constructorimpl(7))), Dp.m6973constructorimpl(1), HuiyuanDesignKt.getInk(), RoundedCornerShapeKt.m1018RoundedCornerShape0680j_4(Dp.m6973constructorimpl(7))), false, HapticCue.TAP, function0, 1, null), Dp.m6973constructorimpl(8), Dp.m6973constructorimpl(5)), HuiyuanDesignKt.getInk(), TextUnitKt.getSp(10), (FontStyle) null, FontWeight.INSTANCE.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, $composer2, ($dirty2 & 14) | 200064, 0, 131024);
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventEnd();
                                            }
                                        } else {
                                            $composer2 = $composer3;
                                            $composer2.skipToGroupEnd();
                                        }
                                        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = $composer2.endRestartGroup();
                                        if (scopeUpdateScopeEndRestartGroup != null) {
                                            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.luchime.huiyuan.ui.ChatScreenKt$$ExternalSyntheticLambda45
                                                @Override // kotlin.jvm.functions.Function2
                                                public final Object invoke(Object obj, Object obj2) {
                                                    return ChatScreenKt.MessageAction$lambda$103(text, function0, $changed, (Composer) obj, ((Integer) obj2).intValue());
                                                }
                                            });
                                        }
                                    }

                                    /* JADX INFO: Access modifiers changed from: private */
                                    /* JADX WARN: Code duplicated, block: B:35:0x0227  */
                                    /* JADX WARN: Code duplicated, block: B:38:0x0233  */
                                    /* JADX WARN: Code duplicated, block: B:39:0x0239  */
                                    /* JADX WARN: Code duplicated, block: B:50:0x0430  */
                                    /* JADX WARN: Code duplicated, block: B:53:0x043c  */
                                    /* JADX WARN: Code duplicated, block: B:54:0x0442  */
                                    /* JADX WARN: Code duplicated, block: B:65:0x04e8  */
                                    /* JADX WARN: Code duplicated, block: B:66:0x0538  */
                                    /* JADX WARN: Code duplicated, block: B:69:0x0557  */
                                    /* JADX WARN: Code duplicated, block: B:71:0x055f  */
                                    /* JADX WARN: Code duplicated, block: B:74:0x057c  */
                                    /* JADX WARN: Code duplicated, block: B:75:0x057f  */
                                    /* JADX WARN: Code duplicated, block: B:80:0x062d  */
                                    public static final void ThinkLogBubble(final TimelineItem.ThinkLog log, Composer $composer, final int $changed) {
                                        Composer $composer2;
                                        Function0<ComposeUiNode> function0;
                                        int i;
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
                                        Composer composer3;
                                        int i2;
                                        Iterable lines;
                                        int i3;
                                        Composer composer4;
                                        String str;
                                        Composer $composer3 = $composer.startRestartGroup(1361668923);
                                        ComposerKt.sourceInformation($composer3, "C(ThinkLogBubble)859@31376L1763:ChatScreen.kt#cyjvf");
                                        int $dirty = $changed;
                                        if (($changed & 6) == 0) {
                                            $dirty |= $composer3.changedInstance(log) ? 4 : 2;
                                        }
                                        if ($composer3.shouldExecute(($dirty & 3) != 2, $dirty & 1)) {
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventStart(1361668923, $dirty, -1, "com.luchime.huiyuan.ui.ThinkLogBubble (ChatScreen.kt:858)");
                                            }
                                            Modifier modifierM729paddingqDBjuR0$default = PaddingKt.m729paddingqDBjuR0$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), Dp.m6973constructorimpl(16), Dp.m6973constructorimpl(14), Dp.m6973constructorimpl(20), 0.0f, 8, null);
                                            Alignment.Vertical bottom = Alignment.INSTANCE.getBottom();
                                            ComposerKt.sourceInformationMarkerStart($composer3, 693286680, "CC(Row)P(2,1,3)99@5124L58,100@5187L130:Row.kt#2w3rfo");
                                            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), bottom, $composer3, ((384 >> 3) & 14) | ((384 >> 3) & 112));
                                            ComposerKt.sourceInformationMarkerStart($composer3, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                                            int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash($composer3, 0);
                                            CompositionLocalMap currentCompositionLocalMap = $composer3.getCurrentCompositionLocalMap();
                                            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier($composer3, modifierM729paddingqDBjuR0$default);
                                            Function0<ComposeUiNode> constructor3 = ComposeUiNode.INSTANCE.getConstructor();
                                            $composer2 = $composer3;
                                            int i4 = ((((384 << 3) & 112) << 6) & 896) | 6;
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
                                            Updater.m3815setimpl(composerM3808constructorimpl3, measurePolicyRowMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                            Updater.m3815setimpl(composerM3808constructorimpl3, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                                            if (composerM3808constructorimpl3.getInserting()) {
                                                i = 384;
                                                composer = $composer3;
                                            } else {
                                                i = 384;
                                                composer = $composer3;
                                                if (!Intrinsics.areEqual(composerM3808constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                                                }
                                                Updater.m3815setimpl(composerM3808constructorimpl3, modifierMaterializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
                                                int i5 = (i4 >> 6) & 14;
                                                composer2 = composer;
                                                ComposerKt.sourceInformationMarkerStart(composer2, -407735110, "C101@5232L9:Row.kt#2w3rfo");
                                                RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                                                int i6 = ((i >> 6) & 112) | 6;
                                                ComposerKt.sourceInformationMarkerStart(composer2, 654383208, "C865@31561L22,866@31592L28,867@31629L1504:ChatScreen.kt#cyjvf");
                                                ModelAvatar(log.getModel(), composer2, 0);
                                                SpacerKt.Spacer(SizeKt.m777width3ABfNKs(Modifier.INSTANCE, Dp.m6973constructorimpl(8)), composer2, 6);
                                                Modifier modifierM729paddingqDBjuR0$default2 = PaddingKt.m729paddingqDBjuR0$default(Modifier.INSTANCE, 0.0f, 0.0f, Dp.m6973constructorimpl(4), Dp.m6973constructorimpl(4), 3, null);
                                                ComposerKt.sourceInformationMarkerStart(composer2, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
                                                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                                                ComposerKt.sourceInformationMarkerStart(composer2, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                                                currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                                                CompositionLocalMap currentCompositionLocalMap2 = composer2.getCurrentCompositionLocalMap();
                                                Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composer2, modifierM729paddingqDBjuR0$default2);
                                                constructor = ComposeUiNode.INSTANCE.getConstructor();
                                                int i7 = ((((6 << 3) & 112) << 6) & 896) | 6;
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
                                                Updater.m3815setimpl(composerM3808constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                                Updater.m3815setimpl(composerM3808constructorimpl, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                                                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                                                if (!composerM3808constructorimpl.getInserting() || !Intrinsics.areEqual(composerM3808constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                                    composerM3808constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                                    composerM3808constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash2);
                                                }
                                                Updater.m3815setimpl(composerM3808constructorimpl, modifierMaterializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
                                                int i8 = (i7 >> 6) & 14;
                                                ComposerKt.sourceInformationMarkerStart(composer2, -2146730711, "C72@3468L9:Box.kt#2w3rfo");
                                                int i9 = ((6 >> 6) & 112) | 6;
                                                BoxScope boxScope = BoxScopeInstance.INSTANCE;
                                                ComposerKt.sourceInformationMarkerStart(composer2, 1906286086, "C868@31703L231,874@31947L1176:ChatScreen.kt#cyjvf");
                                                BoxKt.Box(BackgroundKt.m233backgroundbw27NRU(OffsetKt.m684offsetVpY3zN4(boxScope.matchParentSize(Modifier.INSTANCE), Dp.m6973constructorimpl(4), Dp.m6973constructorimpl(4)), ColorKt.Color(1291845632), RoundedCornerShapeKt.m1019RoundedCornerShapea9UjIt4(Dp.m6973constructorimpl(4), Dp.m6973constructorimpl(14), Dp.m6973constructorimpl(14), Dp.m6973constructorimpl(14))), composer2, 0);
                                                Modifier modifierM726paddingVpY3zN4 = PaddingKt.m726paddingVpY3zN4(BorderKt.m245borderxT4_qwU(BackgroundKt.m233backgroundbw27NRU(SizeKt.m778widthInVpY3zN4(Modifier.INSTANCE, Dp.m6973constructorimpl(250), Dp.m6973constructorimpl(330)), HuiyuanDesignKt.getTerminal(), RoundedCornerShapeKt.m1019RoundedCornerShapea9UjIt4(Dp.m6973constructorimpl(4), Dp.m6973constructorimpl(14), Dp.m6973constructorimpl(14), Dp.m6973constructorimpl(14))), Dp.m6973constructorimpl(2), HuiyuanDesignKt.getInk(), RoundedCornerShapeKt.m1019RoundedCornerShapea9UjIt4(Dp.m6973constructorimpl(4), Dp.m6973constructorimpl(14), Dp.m6973constructorimpl(14), Dp.m6973constructorimpl(14))), Dp.m6973constructorimpl(13), Dp.m6973constructorimpl(10));
                                                ComposerKt.sourceInformationMarkerStart(composer2, -483455358, "CC(Column)P(2,3,1)87@4442L61,88@4508L133:Column.kt#2w3rfo");
                                                MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer2, ((0 >> 3) & 14) | ((0 >> 3) & 112));
                                                ComposerKt.sourceInformationMarkerStart(composer2, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                                                currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                                                CompositionLocalMap currentCompositionLocalMap3 = composer2.getCurrentCompositionLocalMap();
                                                Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier(composer2, modifierM726paddingVpY3zN4);
                                                constructor2 = ComposeUiNode.INSTANCE.getConstructor();
                                                int i10 = ((((0 << 3) & 112) << 6) & 896) | 6;
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
                                                Updater.m3815setimpl(composerM3808constructorimpl2, measurePolicyColumnMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                                Updater.m3815setimpl(composerM3808constructorimpl2, currentCompositionLocalMap3, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                                                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                                                if (!composerM3808constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM3808constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                                                    composerM3808constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                                                    composerM3808constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash3);
                                                }
                                                Updater.m3815setimpl(composerM3808constructorimpl2, modifierMaterializeModifier3, ComposeUiNode.INSTANCE.getSetModifier());
                                                int i11 = (i10 >> 6) & 14;
                                                composer3 = composer2;
                                                ComposerKt.sourceInformationMarkerStart(composer3, -384672921, "C89@4556L9:Column.kt#2w3rfo");
                                                ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                                                int i12 = ((0 >> 6) & 112) | 6;
                                                ComposerKt.sourceInformationMarkerStart(composer3, 1705042773, "C:ChatScreen.kt#cyjvf");
                                                i2 = 20;
                                                if (log.getLines().isEmpty()) {
                                                    composer3.startReplaceGroup(1705052506);
                                                    ComposerKt.sourceInformation(composer3, "882@32369L261");
                                                    composer4 = composer3;
                                                    TextKt.m2820Text4IGK_g("● 正在思考… ▋", (Modifier) null, HuiyuanDesignKt.getTerminalText(), TextUnitKt.getSp(12), (FontStyle) null, (FontWeight) null, (FontFamily) FontFamily.INSTANCE.getMonospace(), 0L, (TextDecoration) null, (TextAlign) null, TextUnitKt.getSp(20), 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer4, 3462, 6, 129970);
                                                    composer3.endReplaceGroup();
                                                } else {
                                                    composer3.startReplaceGroup(1705361824);
                                                    ComposerKt.sourceInformation(composer3, "*891@32742L327");
                                                    lines = log.getLines();
                                                    i3 = 0;
                                                    for (Object obj : lines) {
                                                        int i13 = i3 + 1;
                                                        if (i3 < 0) {
                                                            CollectionsKt.throwIndexOverflow();
                                                        }
                                                        int i14 = i2;
                                                        String str2 = (String) obj;
                                                        Iterable iterable = lines;
                                                        Composer composer5 = composer3;
                                                        if (i3 == CollectionsKt.getLastIndex(log.getLines())) {
                                                            str = " ▋";
                                                        } else {
                                                            str = "";
                                                        }
                                                        TextKt.m2820Text4IGK_g(str2 + str, (Modifier) null, HuiyuanDesignKt.getTerminalText(), TextUnitKt.getSp(12), (FontStyle) null, (FontWeight) null, (FontFamily) FontFamily.INSTANCE.getMonospace(), 0L, (TextDecoration) null, (TextAlign) null, TextUnitKt.getSp(i14), 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer5, 3456, 6, 129970);
                                                        composer3 = composer5;
                                                        i3 = i13;
                                                        i2 = i14;
                                                        lines = iterable;
                                                    }
                                                    composer4 = composer3;
                                                    composer4.endReplaceGroup();
                                                }
                                                ComposerKt.sourceInformationMarkerEnd(composer4);
                                                ComposerKt.sourceInformationMarkerEnd(composer3);
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
                                            int i15 = (i4 >> 6) & 14;
                                            composer2 = composer;
                                            ComposerKt.sourceInformationMarkerStart(composer2, -407735110, "C101@5232L9:Row.kt#2w3rfo");
                                            RowScopeInstance rowScopeInstance2 = RowScopeInstance.INSTANCE;
                                            int i16 = ((i >> 6) & 112) | 6;
                                            ComposerKt.sourceInformationMarkerStart(composer2, 654383208, "C865@31561L22,866@31592L28,867@31629L1504:ChatScreen.kt#cyjvf");
                                            ModelAvatar(log.getModel(), composer2, 0);
                                            SpacerKt.Spacer(SizeKt.m777width3ABfNKs(Modifier.INSTANCE, Dp.m6973constructorimpl(8)), composer2, 6);
                                            Modifier modifierM729paddingqDBjuR0$default3 = PaddingKt.m729paddingqDBjuR0$default(Modifier.INSTANCE, 0.0f, 0.0f, Dp.m6973constructorimpl(4), Dp.m6973constructorimpl(4), 3, null);
                                            ComposerKt.sourceInformationMarkerStart(composer2, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
                                            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                                            ComposerKt.sourceInformationMarkerStart(composer2, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                                            currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                                            CompositionLocalMap currentCompositionLocalMap4 = composer2.getCurrentCompositionLocalMap();
                                            Modifier modifierMaterializeModifier4 = ComposedModifierKt.materializeModifier(composer2, modifierM729paddingqDBjuR0$default3);
                                            constructor = ComposeUiNode.INSTANCE.getConstructor();
                                            int i17 = ((((6 << 3) & 112) << 6) & 896) | 6;
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
                                            Updater.m3815setimpl(composerM3808constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                            Updater.m3815setimpl(composerM3808constructorimpl, currentCompositionLocalMap4, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash4 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                                            if (!composerM3808constructorimpl.getInserting()) {
                                            }
                                            composerM3808constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                            composerM3808constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash4);
                                            Updater.m3815setimpl(composerM3808constructorimpl, modifierMaterializeModifier4, ComposeUiNode.INSTANCE.getSetModifier());
                                            int i18 = (i17 >> 6) & 14;
                                            ComposerKt.sourceInformationMarkerStart(composer2, -2146730711, "C72@3468L9:Box.kt#2w3rfo");
                                            int i19 = ((6 >> 6) & 112) | 6;
                                            BoxScope boxScope2 = BoxScopeInstance.INSTANCE;
                                            ComposerKt.sourceInformationMarkerStart(composer2, 1906286086, "C868@31703L231,874@31947L1176:ChatScreen.kt#cyjvf");
                                            BoxKt.Box(BackgroundKt.m233backgroundbw27NRU(OffsetKt.m684offsetVpY3zN4(boxScope2.matchParentSize(Modifier.INSTANCE), Dp.m6973constructorimpl(4), Dp.m6973constructorimpl(4)), ColorKt.Color(1291845632), RoundedCornerShapeKt.m1019RoundedCornerShapea9UjIt4(Dp.m6973constructorimpl(4), Dp.m6973constructorimpl(14), Dp.m6973constructorimpl(14), Dp.m6973constructorimpl(14))), composer2, 0);
                                            Modifier modifierM726paddingVpY3zN5 = PaddingKt.m726paddingVpY3zN4(BorderKt.m245borderxT4_qwU(BackgroundKt.m233backgroundbw27NRU(SizeKt.m778widthInVpY3zN4(Modifier.INSTANCE, Dp.m6973constructorimpl(250), Dp.m6973constructorimpl(330)), HuiyuanDesignKt.getTerminal(), RoundedCornerShapeKt.m1019RoundedCornerShapea9UjIt4(Dp.m6973constructorimpl(4), Dp.m6973constructorimpl(14), Dp.m6973constructorimpl(14), Dp.m6973constructorimpl(14))), Dp.m6973constructorimpl(2), HuiyuanDesignKt.getInk(), RoundedCornerShapeKt.m1019RoundedCornerShapea9UjIt4(Dp.m6973constructorimpl(4), Dp.m6973constructorimpl(14), Dp.m6973constructorimpl(14), Dp.m6973constructorimpl(14))), Dp.m6973constructorimpl(13), Dp.m6973constructorimpl(10));
                                            ComposerKt.sourceInformationMarkerStart(composer2, -483455358, "CC(Column)P(2,3,1)87@4442L61,88@4508L133:Column.kt#2w3rfo");
                                            MeasurePolicy measurePolicyColumnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer2, ((0 >> 3) & 14) | ((0 >> 3) & 112));
                                            ComposerKt.sourceInformationMarkerStart(composer2, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                                            currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                                            CompositionLocalMap currentCompositionLocalMap5 = composer2.getCurrentCompositionLocalMap();
                                            Modifier modifierMaterializeModifier5 = ComposedModifierKt.materializeModifier(composer2, modifierM726paddingVpY3zN5);
                                            constructor2 = ComposeUiNode.INSTANCE.getConstructor();
                                            int i110 = ((((0 << 3) & 112) << 6) & 896) | 6;
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
                                            Updater.m3815setimpl(composerM3808constructorimpl2, measurePolicyColumnMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                            Updater.m3815setimpl(composerM3808constructorimpl2, currentCompositionLocalMap5, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash5 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                                            if (!composerM3808constructorimpl2.getInserting()) {
                                            }
                                            composerM3808constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                                            composerM3808constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash5);
                                            Updater.m3815setimpl(composerM3808constructorimpl2, modifierMaterializeModifier5, ComposeUiNode.INSTANCE.getSetModifier());
                                            int i111 = (i110 >> 6) & 14;
                                            composer3 = composer2;
                                            ComposerKt.sourceInformationMarkerStart(composer3, -384672921, "C89@4556L9:Column.kt#2w3rfo");
                                            ColumnScopeInstance columnScopeInstance2 = ColumnScopeInstance.INSTANCE;
                                            int i112 = ((0 >> 6) & 112) | 6;
                                            ComposerKt.sourceInformationMarkerStart(composer3, 1705042773, "C:ChatScreen.kt#cyjvf");
                                            i2 = 20;
                                            if (log.getLines().isEmpty()) {
                                                composer3.startReplaceGroup(1705052506);
                                                ComposerKt.sourceInformation(composer3, "882@32369L261");
                                                composer4 = composer3;
                                                TextKt.m2820Text4IGK_g("● 正在思考… ▋", (Modifier) null, HuiyuanDesignKt.getTerminalText(), TextUnitKt.getSp(12), (FontStyle) null, (FontWeight) null, (FontFamily) FontFamily.INSTANCE.getMonospace(), 0L, (TextDecoration) null, (TextAlign) null, TextUnitKt.getSp(20), 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer4, 3462, 6, 129970);
                                                composer3.endReplaceGroup();
                                            } else {
                                                composer3.startReplaceGroup(1705361824);
                                                ComposerKt.sourceInformation(composer3, "*891@32742L327");
                                                lines = log.getLines();
                                                i3 = 0;
                                                while (r101.hasNext()) {
                                                    int i113 = i3 + 1;
                                                    if (i3 < 0) {
                                                        CollectionsKt.throwIndexOverflow();
                                                    }
                                                    int i114 = i2;
                                                    String str3 = (String) obj;
                                                    Iterable iterable2 = lines;
                                                    Composer composer6 = composer3;
                                                    if (i3 == CollectionsKt.getLastIndex(log.getLines())) {
                                                        str = " ▋";
                                                    } else {
                                                        str = "";
                                                    }
                                                    TextKt.m2820Text4IGK_g(str3 + str, (Modifier) null, HuiyuanDesignKt.getTerminalText(), TextUnitKt.getSp(12), (FontStyle) null, (FontWeight) null, (FontFamily) FontFamily.INSTANCE.getMonospace(), 0L, (TextDecoration) null, (TextAlign) null, TextUnitKt.getSp(i114), 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer6, 3456, 6, 129970);
                                                    composer3 = composer6;
                                                    i3 = i113;
                                                    i2 = i114;
                                                    lines = iterable2;
                                                }
                                                composer4 = composer3;
                                                composer4.endReplaceGroup();
                                            }
                                            ComposerKt.sourceInformationMarkerEnd(composer4);
                                            ComposerKt.sourceInformationMarkerEnd(composer3);
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
                                            $composer2 = $composer3;
                                            $composer2.skipToGroupEnd();
                                        }
                                        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = $composer2.endRestartGroup();
                                        if (scopeUpdateScopeEndRestartGroup != null) {
                                            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.luchime.huiyuan.ui.ChatScreenKt$$ExternalSyntheticLambda13
                                                @Override // kotlin.jvm.functions.Function2
                                                public final Object invoke(Object obj2, Object obj3) {
                                                    return ChatScreenKt.ThinkLogBubble$lambda$108(log, $changed, (Composer) obj2, ((Integer) obj3).intValue());
                                                }
                                            });
                                        }
                                    }

                                    /* JADX WARN: Code duplicated, block: B:101:0x0367  */
                                    /* JADX WARN: Code duplicated, block: B:104:0x037a  */
                                    /* JADX WARN: Code duplicated, block: B:105:0x037d  */
                                    /* JADX WARN: Code duplicated, block: B:110:0x03e6  */
                                    /* JADX WARN: Code duplicated, block: B:112:0x03fc  */
                                    /* JADX WARN: Code duplicated, block: B:113:0x03ff  */
                                    /* JADX WARN: Code duplicated, block: B:116:0x0413  */
                                    /* JADX WARN: Code duplicated, block: B:117:0x0415  */
                                    /* JADX WARN: Code duplicated, block: B:120:0x0430  */
                                    /* JADX WARN: Code duplicated, block: B:124:0x043c  */
                                    /* JADX WARN: Code duplicated, block: B:129:0x050f  */
                                    /* JADX WARN: Code duplicated, block: B:130:0x0511  */
                                    /* JADX WARN: Code duplicated, block: B:133:0x0518  */
                                    /* JADX WARN: Code duplicated, block: B:134:0x051a  */
                                    /* JADX WARN: Code duplicated, block: B:137:0x0529  */
                                    /* JADX WARN: Code duplicated, block: B:138:0x052b  */
                                    /* JADX WARN: Code duplicated, block: B:141:0x0538  */
                                    /* JADX WARN: Code duplicated, block: B:145:0x054c A[ADDED_TO_REGION] */
                                    /* JADX WARN: Code duplicated, block: B:149:0x0713  */
                                    /* JADX WARN: Code duplicated, block: B:150:0x0715  */
                                    /* JADX WARN: Code duplicated, block: B:153:0x0720  */
                                    /* JADX WARN: Code duplicated, block: B:157:0x072c  */
                                    /* JADX WARN: Code duplicated, block: B:160:0x076b  */
                                    /* JADX WARN: Code duplicated, block: B:161:0x076d  */
                                    /* JADX WARN: Code duplicated, block: B:164:0x077b  */
                                    /* JADX WARN: Code duplicated, block: B:165:0x077d  */
                                    /* JADX WARN: Code duplicated, block: B:168:0x0785  */
                                    /* JADX WARN: Code duplicated, block: B:169:0x0787  */
                                    /* JADX WARN: Code duplicated, block: B:172:0x0792  */
                                    /* JADX WARN: Code duplicated, block: B:176:0x07a2  */
                                    /* JADX WARN: Code duplicated, block: B:179:0x07bb  */
                                    /* JADX WARN: Code duplicated, block: B:183:0x07c7  */
                                    /* JADX WARN: Code duplicated, block: B:186:0x07da  */
                                    /* JADX WARN: Code duplicated, block: B:187:0x07df  */
                                    /* JADX WARN: Code duplicated, block: B:241:0x0dca  */
                                    /* JADX WARN: Code duplicated, block: B:244:0x0dd6  */
                                    /* JADX WARN: Code duplicated, block: B:245:0x0ddc  */
                                    /* JADX WARN: Code duplicated, block: B:257:0x0e8e  */
                                    /* JADX WARN: Code duplicated, block: B:259:0x0ea8  */
                                    /* JADX WARN: Code duplicated, block: B:260:0x0eab  */
                                    /* JADX WARN: Code duplicated, block: B:263:0x0ec1  */
                                    /* JADX WARN: Code duplicated, block: B:264:0x0ec3  */
                                    /* JADX WARN: Code duplicated, block: B:267:0x0ee3  */
                                    /* JADX WARN: Code duplicated, block: B:270:0x0eee  */
                                    /* JADX WARN: Code duplicated, block: B:271:0x0ef5  */
                                    /* JADX WARN: Code duplicated, block: B:276:0x0fd5  */
                                    /* JADX WARN: Code duplicated, block: B:279:0x0fe1  */
                                    /* JADX WARN: Code duplicated, block: B:280:0x0fe7  */
                                    /* JADX WARN: Code duplicated, block: B:291:0x110d  */
                                    /* JADX WARN: Code duplicated, block: B:292:0x110f  */
                                    /* JADX WARN: Code duplicated, block: B:303:0x1173  */
                                    /* JADX WARN: Code duplicated, block: B:304:0x1175  */
                                    /* JADX WARN: Code duplicated, block: B:307:0x1183  */
                                    /* JADX WARN: Code duplicated, block: B:308:0x1185  */
                                    /* JADX WARN: Code duplicated, block: B:311:0x118d  */
                                    /* JADX WARN: Code duplicated, block: B:312:0x118f  */
                                    /* JADX WARN: Code duplicated, block: B:327:0x11e1  */
                                    /* JADX WARN: Code duplicated, block: B:330:0x11f5  */
                                    /* JADX WARN: Code duplicated, block: B:331:0x11fa  */
                                    /* JADX WARN: Code duplicated, block: B:344:0x044b A[SYNTHETIC] */
                                    /* JADX WARN: Code duplicated, block: B:94:0x0324  */
                                    /* JADX WARN: Code duplicated, block: B:97:0x0330  */
                                    /* JADX WARN: Code duplicated, block: B:98:0x0336  */
                                    private static final void Composer(final AIModel selectedModel, final Function1<? super AIModel, Unit> function1, final String input, final Function1<? super String, Unit> function2, final Function0<Unit> function0, Function0<Unit> function3, final boolean isGenerating, final Function0<Unit> function4, final boolean compact, Composer $composer, final int $changed) {
                                        final Function0<Unit> function5;
                                        final boolean z;
                                        Composer $composer2;
                                        Function0<ComposeUiNode> function6;
                                        Function0<ComposeUiNode> function7;
                                        Composer composer;
                                        int currentCompositeKeyHash;
                                        Modifier modifierMaterializeModifier;
                                        Function0<ComposeUiNode> constructor;
                                        Function0<ComposeUiNode> function8;
                                        Composer composerM3808constructorimpl;
                                        RowScope rowScope;
                                        Composer composer2;
                                        Iterable<AIModel> entries;
                                        int i;
                                        int currentCompositeKeyHash2;
                                        Function0<ComposeUiNode> constructor2;
                                        Function0<ComposeUiNode> function9;
                                        Composer composerM3808constructorimpl2;
                                        boolean z2;
                                        boolean z3;
                                        Object objRememberedValue;
                                        boolean z4;
                                        boolean z5;
                                        boolean z6;
                                        boolean z7;
                                        Object objRememberedValue2;
                                        boolean z8;
                                        long ink;
                                        boolean z9;
                                        boolean z10;
                                        boolean zChanged;
                                        Object objRememberedValue3;
                                        Modifier modifier;
                                        Function0<ComposeUiNode> function10;
                                        AppHaptics haptics;
                                        int currentCompositeKeyHash3;
                                        Function0<ComposeUiNode> constructor3;
                                        Function0<ComposeUiNode> function11;
                                        Composer composerM3808constructorimpl3;
                                        Composer composer3;
                                        int i2;
                                        Composer composer4;
                                        Iterable<AIModel> entries2;
                                        int i3;
                                        boolean z11;
                                        boolean z12;
                                        final AppHaptics haptics2;
                                        boolean z13;
                                        boolean z14;
                                        Object objRememberedValue4;
                                        final boolean z15;
                                        int $dirty;
                                        boolean z16;
                                        boolean z17;
                                        Object objRememberedValue5;
                                        final Function0<Unit> function12;
                                        boolean z18;
                                        boolean z19;
                                        boolean z20;
                                        boolean z21;
                                        Object objRememberedValue6;
                                        final boolean z22;
                                        boolean z23;
                                        long ink2;
                                        boolean z24;
                                        boolean z25;
                                        boolean zChanged2;
                                        Object objRememberedValue7;
                                        int i4;
                                        Composer $composer3 = $composer.startRestartGroup(-1144803977);
                                        ComposerKt.sourceInformation($composer3, "C(Composer)P(8,4,1,3,6,5,2,7)917@33471L7:ChatScreen.kt#cyjvf");
                                        int $dirty2 = $changed;
                                        if (($changed & 6) == 0) {
                                            $dirty2 |= $composer3.changed(selectedModel.ordinal()) ? 4 : 2;
                                        }
                                        if (($changed & 48) == 0) {
                                            $dirty2 |= $composer3.changedInstance(function1) ? 32 : 16;
                                        }
                                        if (($changed & 384) == 0) {
                                            $dirty2 |= $composer3.changed(input) ? 256 : 128;
                                        }
                                        if (($changed & 3072) == 0) {
                                            $dirty2 |= $composer3.changedInstance(function2) ? 2048 : 1024;
                                        }
                                        if (($changed & 24576) == 0) {
                                            $dirty2 |= $composer3.changedInstance(function0) ? 16384 : 8192;
                                        }
                                        if ((196608 & $changed) == 0) {
                                            $dirty2 |= $composer3.changedInstance(function3) ? 131072 : 65536;
                                        }
                                        if ((1572864 & $changed) == 0) {
                                            $dirty2 |= $composer3.changed(isGenerating) ? 1048576 : 524288;
                                        }
                                        if ((12582912 & $changed) == 0) {
                                            $dirty2 |= $composer3.changedInstance(function4) ? 8388608 : 4194304;
                                        }
                                        if ((100663296 & $changed) == 0) {
                                            $dirty2 |= $composer3.changed(compact) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
                                        }
                                        if ($composer3.shouldExecute((38347923 & $dirty2) != 38347922, $dirty2 & 1)) {
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventStart(-1144803977, $dirty2, -1, "com.luchime.huiyuan.ui.Composer (ChatScreen.kt:916)");
                                            }
                                            ProvidableCompositionLocal<AppHaptics> localAppHaptics = AppHapticsKt.getLocalAppHaptics();
                                            ComposerKt.sourceInformationMarkerStart($composer3, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
                                            Object objConsume = $composer3.consume(localAppHaptics);
                                            ComposerKt.sourceInformationMarkerEnd($composer3);
                                            final AppHaptics haptics3 = (AppHaptics) objConsume;
                                            if (compact) {
                                                $composer3.startReplaceGroup(1480499913);
                                                ComposerKt.sourceInformation($composer3, "919@33506L4210");
                                                Modifier modifierM726paddingVpY3zN4 = PaddingKt.m726paddingVpY3zN4(WindowInsetsPadding_androidKt.imePadding(WindowInsetsPadding_androidKt.navigationBarsPadding(BorderKt.m245borderxT4_qwU(BackgroundKt.m234backgroundbw27NRU$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), HuiyuanDesignKt.getPaper(), null, 2, null), Dp.m6973constructorimpl(2), HuiyuanDesignKt.getInk(), RectangleShapeKt.getRectangleShape()))), Dp.m6973constructorimpl(8), Dp.m6973constructorimpl(6));
                                                Arrangement.Horizontal horizontalM606spacedBy0680j_4 = Arrangement.INSTANCE.m606spacedBy0680j_4(Dp.m6973constructorimpl(7));
                                                Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
                                                ComposerKt.sourceInformationMarkerStart($composer3, 693286680, "CC(Row)P(2,1,3)99@5124L58,100@5187L130:Row.kt#2w3rfo");
                                                MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(horizontalM606spacedBy0680j_4, centerVertically, $composer3, ((432 >> 3) & 14) | ((432 >> 3) & 112));
                                                ComposerKt.sourceInformationMarkerStart($composer3, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                                                int currentCompositeKeyHash4 = ComposablesKt.getCurrentCompositeKeyHash($composer3, 0);
                                                CompositionLocalMap currentCompositionLocalMap = $composer3.getCurrentCompositionLocalMap();
                                                Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier($composer3, modifierM726paddingVpY3zN4);
                                                Function0<ComposeUiNode> constructor4 = ComposeUiNode.INSTANCE.getConstructor();
                                                int i5 = ((((432 << 3) & 112) << 6) & 896) | 6;
                                                ComposerKt.sourceInformationMarkerStart($composer3, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
                                                if (!($composer3.getApplier() instanceof Applier)) {
                                                    ComposablesKt.invalidApplier();
                                                }
                                                $composer3.startReusableNode();
                                                if ($composer3.getInserting()) {
                                                    function10 = constructor4;
                                                    $composer3.createNode(function10);
                                                } else {
                                                    function10 = constructor4;
                                                    $composer3.useNode();
                                                }
                                                Composer composerM3808constructorimpl4 = Updater.m3808constructorimpl($composer3);
                                                Updater.m3815setimpl(composerM3808constructorimpl4, measurePolicyRowMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                                Updater.m3815setimpl(composerM3808constructorimpl4, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                                                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                                                if (composerM3808constructorimpl4.getInserting()) {
                                                    haptics = haptics3;
                                                } else {
                                                    haptics = haptics3;
                                                    if (!Intrinsics.areEqual(composerM3808constructorimpl4.rememberedValue(), Integer.valueOf(currentCompositeKeyHash4))) {
                                                    }
                                                    Updater.m3815setimpl(composerM3808constructorimpl4, modifierMaterializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
                                                    int i6 = (i5 >> 6) & 14;
                                                    ComposerKt.sourceInformationMarkerStart($composer3, -407735110, "C101@5232L9:Row.kt#2w3rfo");
                                                    int i7 = ((432 >> 6) & 112) | 6;
                                                    RowScope rowScope2 = RowScopeInstance.INSTANCE;
                                                    ComposerKt.sourceInformationMarkerStart($composer3, -1060164626, "C931@34045L21,930@33965L588,955@35041L10,960@35348L196,966@35590L279,948@34741L256,944@34566L1317,981@36165L238,975@35930L101,974@35896L781,993@36724L308,1004@37187L217,1010@37505L201,992@36690L1016:ChatScreen.kt#cyjvf");
                                                    Modifier modifierHorizontalScroll$default = ScrollKt.horizontalScroll$default(SizeKt.m779widthInVpY3zN4$default(Modifier.INSTANCE, 0.0f, Dp.m6973constructorimpl(190), 1, null), ScrollKt.rememberScrollState(0, $composer3, 0, 1), false, null, false, 14, null);
                                                    Arrangement.Horizontal horizontalM606spacedBy0680j_5 = Arrangement.INSTANCE.m606spacedBy0680j_4(Dp.m6973constructorimpl(6));
                                                    ComposerKt.sourceInformationMarkerStart($composer3, 693286680, "CC(Row)P(2,1,3)99@5124L58,100@5187L130:Row.kt#2w3rfo");
                                                    MeasurePolicy measurePolicyRowMeasurePolicy2 = RowKt.rowMeasurePolicy(horizontalM606spacedBy0680j_5, Alignment.INSTANCE.getTop(), $composer3, ((48 >> 3) & 14) | ((48 >> 3) & 112));
                                                    ComposerKt.sourceInformationMarkerStart($composer3, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                                                    currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash($composer3, 0);
                                                    CompositionLocalMap currentCompositionLocalMap2 = $composer3.getCurrentCompositionLocalMap();
                                                    Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier($composer3, modifierHorizontalScroll$default);
                                                    constructor3 = ComposeUiNode.INSTANCE.getConstructor();
                                                    int i8 = ((((48 << 3) & 112) << 6) & 896) | 6;
                                                    ComposerKt.sourceInformationMarkerStart($composer3, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
                                                    if (!($composer3.getApplier() instanceof Applier)) {
                                                        ComposablesKt.invalidApplier();
                                                    }
                                                    $composer3.startReusableNode();
                                                    if ($composer3.getInserting()) {
                                                        function11 = constructor3;
                                                        $composer3.createNode(function11);
                                                    } else {
                                                        function11 = constructor3;
                                                        $composer3.useNode();
                                                    }
                                                    composerM3808constructorimpl3 = Updater.m3808constructorimpl($composer3);
                                                    Updater.m3815setimpl(composerM3808constructorimpl3, measurePolicyRowMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                                    Updater.m3815setimpl(composerM3808constructorimpl3, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                                                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                                                    if (composerM3808constructorimpl3.getInserting()) {
                                                        composer3 = $composer3;
                                                    } else {
                                                        composer3 = $composer3;
                                                        if (!Intrinsics.areEqual(composerM3808constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                                                        }
                                                        Updater.m3815setimpl(composerM3808constructorimpl3, modifierMaterializeModifier3, ComposeUiNode.INSTANCE.getSetModifier());
                                                        int i9 = (i8 >> 6) & 14;
                                                        Composer composer5 = composer3;
                                                        i2 = 0;
                                                        ComposerKt.sourceInformationMarkerStart(composer5, -407735110, "C101@5232L9:Row.kt#2w3rfo");
                                                        RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                                                        int i10 = ((48 >> 6) & 112) | 6;
                                                        composer4 = composer5;
                                                        ComposerKt.sourceInformationMarkerStart(composer4, 2130717372, "C:ChatScreen.kt#cyjvf");
                                                        composer4.startReplaceGroup(761469975);
                                                        ComposerKt.sourceInformation(composer4, "*940@34473L26,935@34223L298");
                                                        entries2 = AIModel.getEntries();
                                                        i3 = 0;
                                                        for (final AIModel aIModel : entries2) {
                                                            Iterable iterable = entries2;
                                                            String shortName = aIModel.getShortName();
                                                            long jModelAccent = modelAccent(aIModel);
                                                            if (selectedModel == aIModel) {
                                                                z24 = true;
                                                            } else {
                                                                z24 = false;
                                                            }
                                                            boolean z26 = !isGenerating;
                                                            int i11 = i3;
                                                            ComposerKt.sourceInformationMarkerStart(composer4, -1893764028, "CC(remember):ChatScreen.kt#9igjgp");
                                                            Composer composer6 = composer4;
                                                            if (($dirty2 & 112) == 32) {
                                                                z25 = true;
                                                            } else {
                                                                z25 = false;
                                                            }
                                                            zChanged2 = z25 | $composer3.changed(aIModel.ordinal());
                                                            objRememberedValue7 = composer6.rememberedValue();
                                                            if (zChanged2) {
                                                                i4 = i2;
                                                            } else {
                                                                i4 = i2;
                                                                if (objRememberedValue7 == Composer.INSTANCE.getEmpty()) {
                                                                }
                                                                ComposerKt.sourceInformationMarkerEnd(composer6);
                                                                m7402ModeChip8V94_ZQ(shortName, jModelAccent, z24, z26, (Function0) objRememberedValue7, composer6, 0, 0);
                                                                composer4 = composer6;
                                                                entries2 = iterable;
                                                                i3 = i11;
                                                                i2 = i4;
                                                            }
                                                            objRememberedValue7 = new Function0() { // from class: com.luchime.huiyuan.ui.ChatScreenKt$$ExternalSyntheticLambda0
                                                                @Override // kotlin.jvm.functions.Function0
                                                                public final Object invoke() {
                                                                    return ChatScreenKt.Composer$lambda$121$lambda$112$lambda$111$lambda$110$lambda$109(function1, aIModel);
                                                                }
                                                            };
                                                            composer6.updateRememberedValue(objRememberedValue7);
                                                            ComposerKt.sourceInformationMarkerEnd(composer6);
                                                            m7402ModeChip8V94_ZQ(shortName, jModelAccent, z24, z26, (Function0) objRememberedValue7, composer6, 0, 0);
                                                            composer4 = composer6;
                                                            entries2 = iterable;
                                                            i3 = i11;
                                                            i2 = i4;
                                                        }
                                                        Composer composer7 = composer4;
                                                        composer7.endReplaceGroup();
                                                        ComposerKt.sourceInformationMarkerEnd(composer7);
                                                        ComposerKt.sourceInformationMarkerEnd(composer5);
                                                        composer3.endNode();
                                                        ComposerKt.sourceInformationMarkerEnd(composer3);
                                                        ComposerKt.sourceInformationMarkerEnd(composer3);
                                                        ComposerKt.sourceInformationMarkerEnd(composer3);
                                                        Modifier modifierWeight$default = RowScope.weight$default(rowScope2, Modifier.INSTANCE, 1.0f, false, 2, null);
                                                        TextStyle textStyleM6430copyp1EtxEg$default = TextStyle.m6430copyp1EtxEg$default(MaterialTheme.INSTANCE.getTypography($composer3, MaterialTheme.$stable).getBodyLarge(), HuiyuanDesignKt.getInk(), TextUnitKt.getSp(14), null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777212, null);
                                                        RoundedCornerShape roundedCornerShapeM1018RoundedCornerShape0680j_4 = RoundedCornerShapeKt.m1018RoundedCornerShape0680j_4(Dp.m6973constructorimpl(18));
                                                        KeyboardOptions keyboardOptions = new KeyboardOptions(0, (Boolean) null, 0, ImeAction.INSTANCE.m6603getSendeUduSuo(), (PlatformImeOptions) null, (Boolean) null, (LocaleList) null, 119, (DefaultConstructorMarker) null);
                                                        ComposerKt.sourceInformationMarkerStart($composer3, -34158148, "CC(remember):ChatScreen.kt#9igjgp");
                                                        if (($dirty2 & 3670016) == 1048576) {
                                                            z11 = true;
                                                        } else {
                                                            z11 = false;
                                                        }
                                                        if (($dirty2 & 896) == 256) {
                                                            z12 = true;
                                                        } else {
                                                            z12 = false;
                                                        }
                                                        boolean z27 = z11 | z12;
                                                        haptics2 = haptics;
                                                        boolean zChangedInstance = z27 | $composer3.changedInstance(haptics2);
                                                        if (($dirty2 & 57344) == 16384) {
                                                            z13 = true;
                                                        } else {
                                                            z13 = false;
                                                        }
                                                        z14 = zChangedInstance | z13;
                                                        objRememberedValue4 = $composer3.rememberedValue();
                                                        if (!z14 || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                                                            z15 = isGenerating;
                                                            Object obj = new Function1() { // from class: com.luchime.huiyuan.ui.ChatScreenKt$$ExternalSyntheticLambda4
                                                                @Override // kotlin.jvm.functions.Function1
                                                                public final Object invoke(Object obj2) {
                                                                    return ChatScreenKt.Composer$lambda$121$lambda$114$lambda$113(z15, input, haptics2, function0, (KeyboardActionScope) obj2);
                                                                }
                                                            };
                                                            $composer3.updateRememberedValue(obj);
                                                            objRememberedValue4 = obj;
                                                        } else {
                                                            z15 = isGenerating;
                                                        }
                                                        ComposerKt.sourceInformationMarkerEnd($composer3);
                                                        $dirty = $dirty2;
                                                        OutlinedTextFieldKt.OutlinedTextField(input, function2, modifierWeight$default, false, false, textStyleM6430copyp1EtxEg$default, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) ComposableLambdaKt.rememberComposableLambda(-1932805377, true, new Function2() { // from class: com.luchime.huiyuan.ui.ChatScreenKt$$ExternalSyntheticLambda5
                                                            @Override // kotlin.jvm.functions.Function2
                                                            public final Object invoke(Object obj2, Object obj3) {
                                                                return ChatScreenKt.Composer$lambda$121$lambda$115(z15, selectedModel, (Composer) obj2, ((Integer) obj3).intValue());
                                                            }
                                                        }, $composer3, 54), (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, false, (VisualTransformation) null, keyboardOptions, new KeyboardActions(null, null, null, null, null, (Function1) objRememberedValue4, 31), false, 2, 1, (MutableInteractionSource) null, (Shape) roundedCornerShapeM1018RoundedCornerShape0680j_4, TextFieldDefaults.INSTANCE.m2801colors0hiis_0(0L, 0L, 0L, 0L, Color.INSTANCE.m4403getWhite0d7_KjU(), Color.INSTANCE.m4403getWhite0d7_KjU(), 0L, 0L, HuiyuanDesignKt.getInk(), 0L, null, HuiyuanDesignKt.getInk(), HuiyuanDesignKt.getInk(), 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, $composer3, 100884480, 432, 0, 0, 3072, 2147477199, 4095), $composer3, (($dirty2 >> 6) & 14) | 12582912 | (($dirty2 >> 6) & 112), 906166272, 0, 1212248);
                                                        boolean z28 = !isGenerating;
                                                        RoundedCornerShape roundedCornerShapeM1018RoundedCornerShape0680j_5 = RoundedCornerShapeKt.m1018RoundedCornerShape0680j_4(Dp.m6973constructorimpl(12));
                                                        ButtonColors buttonColorsM1936buttonColorsro_MJ88 = ButtonDefaults.INSTANCE.m1936buttonColorsro_MJ88(Color.INSTANCE.m4403getWhite0d7_KjU(), HuiyuanDesignKt.getInk(), ColorKt.Color(4292992206L), HuiyuanDesignKt.getMutedText(), $composer3, (ButtonDefaults.$stable << 12) | 3510, 0);
                                                        PaddingValues paddingValuesM719PaddingValuesYgX7TsA = PaddingKt.m719PaddingValuesYgX7TsA(Dp.m6973constructorimpl(11), Dp.m6973constructorimpl(10));
                                                        Modifier modifierM245borderxT4_qwU = BorderKt.m245borderxT4_qwU(Modifier.INSTANCE, Dp.m6973constructorimpl(2), HuiyuanDesignKt.getInk(), RoundedCornerShapeKt.m1018RoundedCornerShape0680j_4(Dp.m6973constructorimpl(12)));
                                                        ComposerKt.sourceInformationMarkerStart($composer3, -34139619, "CC(remember):ChatScreen.kt#9igjgp");
                                                        boolean zChangedInstance2 = $composer3.changedInstance(haptics2);
                                                        if (($dirty & 458752) == 131072) {
                                                            z16 = true;
                                                        } else {
                                                            z16 = false;
                                                        }
                                                        z17 = zChangedInstance2 | z16;
                                                        objRememberedValue5 = $composer3.rememberedValue();
                                                        if (!z17 || objRememberedValue5 == Composer.INSTANCE.getEmpty()) {
                                                            function12 = function3;
                                                            Object obj2 = new Function0() { // from class: com.luchime.huiyuan.ui.ChatScreenKt$$ExternalSyntheticLambda6
                                                                @Override // kotlin.jvm.functions.Function0
                                                                public final Object invoke() {
                                                                    return ChatScreenKt.Composer$lambda$121$lambda$117$lambda$116(haptics2, function12);
                                                                }
                                                            };
                                                            $composer3.updateRememberedValue(obj2);
                                                            objRememberedValue5 = obj2;
                                                        } else {
                                                            function12 = function3;
                                                        }
                                                        ComposerKt.sourceInformationMarkerEnd($composer3);
                                                        ButtonKt.Button((Function0) objRememberedValue5, modifierM245borderxT4_qwU, z28, roundedCornerShapeM1018RoundedCornerShape0680j_5, buttonColorsM1936buttonColorsro_MJ88, null, null, paddingValuesM719PaddingValuesYgX7TsA, null, ComposableSingletons$ChatScreenKt.INSTANCE.getLambda$1738058344$app(), $composer3, 817889280, 352);
                                                        ComposerKt.sourceInformationMarkerStart($composer3, -34114004, "CC(remember):ChatScreen.kt#9igjgp");
                                                        if (($dirty & 3670016) == 1048576) {
                                                            z18 = true;
                                                        } else {
                                                            z18 = false;
                                                        }
                                                        boolean zChangedInstance3 = $composer3.changedInstance(haptics2) | z18;
                                                        if (($dirty & 29360128) == 8388608) {
                                                            z19 = true;
                                                        } else {
                                                            z19 = false;
                                                        }
                                                        boolean z29 = zChangedInstance3 | z19;
                                                        if (($dirty & 57344) == 16384) {
                                                            z20 = true;
                                                        } else {
                                                            z20 = false;
                                                        }
                                                        z21 = z29 | z20;
                                                        objRememberedValue6 = $composer3.rememberedValue();
                                                        if (!z21 || objRememberedValue6 == Composer.INSTANCE.getEmpty()) {
                                                            z22 = isGenerating;
                                                            Object obj3 = new Function0() { // from class: com.luchime.huiyuan.ui.ChatScreenKt$$ExternalSyntheticLambda7
                                                                @Override // kotlin.jvm.functions.Function0
                                                                public final Object invoke() {
                                                                    return ChatScreenKt.Composer$lambda$121$lambda$119$lambda$118(z22, haptics2, function4, function0);
                                                                }
                                                            };
                                                            $composer3.updateRememberedValue(obj3);
                                                            objRememberedValue6 = obj3;
                                                        } else {
                                                            z22 = isGenerating;
                                                        }
                                                        Function0 function13 = (Function0) objRememberedValue6;
                                                        ComposerKt.sourceInformationMarkerEnd($composer3);
                                                        if (z22 && StringsKt.isBlank(input)) {
                                                            z23 = false;
                                                        } else {
                                                            z23 = true;
                                                        }
                                                        RoundedCornerShape roundedCornerShapeM1018RoundedCornerShape0680j_6 = RoundedCornerShapeKt.m1018RoundedCornerShape0680j_4(Dp.m6973constructorimpl(12));
                                                        ButtonDefaults buttonDefaults = ButtonDefaults.INSTANCE;
                                                        if (z22) {
                                                            ink2 = HuiyuanDesignKt.getSignalRed();
                                                        } else {
                                                            ink2 = HuiyuanDesignKt.getInk();
                                                        }
                                                        ButtonKt.Button(function13, null, z23, roundedCornerShapeM1018RoundedCornerShape0680j_6, buttonDefaults.m1936buttonColorsro_MJ88(ink2, Color.INSTANCE.m4403getWhite0d7_KjU(), ColorKt.Color(4287333494L), 0L, $composer3, (ButtonDefaults.$stable << 12) | 432, 8), null, null, PaddingKt.m719PaddingValuesYgX7TsA(Dp.m6973constructorimpl(12), Dp.m6973constructorimpl(10)), null, ComposableLambdaKt.rememberComposableLambda(-1698315055, true, new Function3() { // from class: com.luchime.huiyuan.ui.ChatScreenKt$$ExternalSyntheticLambda8
                                                            @Override // kotlin.jvm.functions.Function3
                                                            public final Object invoke(Object obj4, Object obj5, Object obj6) {
                                                                return ChatScreenKt.Composer$lambda$121$lambda$120(z22, (RowScope) obj4, (Composer) obj5, ((Integer) obj6).intValue());
                                                            }
                                                        }, $composer3, 54), $composer3, 817889280, 354);
                                                        ComposerKt.sourceInformationMarkerEnd($composer3);
                                                        ComposerKt.sourceInformationMarkerEnd($composer3);
                                                        $composer3.endNode();
                                                        ComposerKt.sourceInformationMarkerEnd($composer3);
                                                        ComposerKt.sourceInformationMarkerEnd($composer3);
                                                        ComposerKt.sourceInformationMarkerEnd($composer3);
                                                        $composer3.endReplaceGroup();
                                                        $composer2 = $composer3;
                                                        z = z22;
                                                        function5 = function12;
                                                    }
                                                    composerM3808constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                                                    composerM3808constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash2);
                                                    Updater.m3815setimpl(composerM3808constructorimpl3, modifierMaterializeModifier3, ComposeUiNode.INSTANCE.getSetModifier());
                                                    int i12 = (i8 >> 6) & 14;
                                                    Composer composer8 = composer3;
                                                    i2 = 0;
                                                    ComposerKt.sourceInformationMarkerStart(composer8, -407735110, "C101@5232L9:Row.kt#2w3rfo");
                                                    RowScopeInstance rowScopeInstance2 = RowScopeInstance.INSTANCE;
                                                    int i13 = ((48 >> 6) & 112) | 6;
                                                    composer4 = composer8;
                                                    ComposerKt.sourceInformationMarkerStart(composer4, 2130717372, "C:ChatScreen.kt#cyjvf");
                                                    composer4.startReplaceGroup(761469975);
                                                    ComposerKt.sourceInformation(composer4, "*940@34473L26,935@34223L298");
                                                    entries2 = AIModel.getEntries();
                                                    i3 = 0;
                                                    while (r25.hasNext()) {
                                                        Iterable iterable2 = entries2;
                                                        String shortName2 = aIModel.getShortName();
                                                        long jModelAccent2 = modelAccent(aIModel);
                                                        if (selectedModel == aIModel) {
                                                            z24 = true;
                                                        } else {
                                                            z24 = false;
                                                        }
                                                        boolean z210 = !isGenerating;
                                                        int i14 = i3;
                                                        ComposerKt.sourceInformationMarkerStart(composer4, -1893764028, "CC(remember):ChatScreen.kt#9igjgp");
                                                        Composer composer9 = composer4;
                                                        if (($dirty2 & 112) == 32) {
                                                            z25 = true;
                                                        } else {
                                                            z25 = false;
                                                        }
                                                        zChanged2 = z25 | $composer3.changed(aIModel.ordinal());
                                                        objRememberedValue7 = composer9.rememberedValue();
                                                        if (zChanged2) {
                                                            i4 = i2;
                                                            if (objRememberedValue7 == Composer.INSTANCE.getEmpty()) {
                                                            }
                                                            ComposerKt.sourceInformationMarkerEnd(composer9);
                                                            m7402ModeChip8V94_ZQ(shortName2, jModelAccent2, z24, z210, (Function0) objRememberedValue7, composer9, 0, 0);
                                                            composer4 = composer9;
                                                            entries2 = iterable2;
                                                            i3 = i14;
                                                            i2 = i4;
                                                        } else {
                                                            i4 = i2;
                                                        }
                                                        objRememberedValue7 = new Function0() { // from class: com.luchime.huiyuan.ui.ChatScreenKt$$ExternalSyntheticLambda0
                                                            @Override // kotlin.jvm.functions.Function0
                                                            public final Object invoke() {
                                                                return ChatScreenKt.Composer$lambda$121$lambda$112$lambda$111$lambda$110$lambda$109(function1, aIModel);
                                                            }
                                                        };
                                                        composer9.updateRememberedValue(objRememberedValue7);
                                                        ComposerKt.sourceInformationMarkerEnd(composer9);
                                                        m7402ModeChip8V94_ZQ(shortName2, jModelAccent2, z24, z210, (Function0) objRememberedValue7, composer9, 0, 0);
                                                        composer4 = composer9;
                                                        entries2 = iterable2;
                                                        i3 = i14;
                                                        i2 = i4;
                                                    }
                                                    Composer composer10 = composer4;
                                                    composer10.endReplaceGroup();
                                                    ComposerKt.sourceInformationMarkerEnd(composer10);
                                                    ComposerKt.sourceInformationMarkerEnd(composer8);
                                                    composer3.endNode();
                                                    ComposerKt.sourceInformationMarkerEnd(composer3);
                                                    ComposerKt.sourceInformationMarkerEnd(composer3);
                                                    ComposerKt.sourceInformationMarkerEnd(composer3);
                                                    Modifier modifierWeight$default2 = RowScope.weight$default(rowScope2, Modifier.INSTANCE, 1.0f, false, 2, null);
                                                    TextStyle textStyleM6430copyp1EtxEg$default2 = TextStyle.m6430copyp1EtxEg$default(MaterialTheme.INSTANCE.getTypography($composer3, MaterialTheme.$stable).getBodyLarge(), HuiyuanDesignKt.getInk(), TextUnitKt.getSp(14), null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777212, null);
                                                    RoundedCornerShape roundedCornerShapeM1018RoundedCornerShape0680j_7 = RoundedCornerShapeKt.m1018RoundedCornerShape0680j_4(Dp.m6973constructorimpl(18));
                                                    KeyboardOptions keyboardOptions2 = new KeyboardOptions(0, (Boolean) null, 0, ImeAction.INSTANCE.m6603getSendeUduSuo(), (PlatformImeOptions) null, (Boolean) null, (LocaleList) null, 119, (DefaultConstructorMarker) null);
                                                    ComposerKt.sourceInformationMarkerStart($composer3, -34158148, "CC(remember):ChatScreen.kt#9igjgp");
                                                    if (($dirty2 & 3670016) == 1048576) {
                                                        z11 = true;
                                                    } else {
                                                        z11 = false;
                                                    }
                                                    if (($dirty2 & 896) == 256) {
                                                        z12 = true;
                                                    } else {
                                                        z12 = false;
                                                    }
                                                    boolean z211 = z11 | z12;
                                                    haptics2 = haptics;
                                                    boolean zChangedInstance4 = z211 | $composer3.changedInstance(haptics2);
                                                    if (($dirty2 & 57344) == 16384) {
                                                        z13 = true;
                                                    } else {
                                                        z13 = false;
                                                    }
                                                    z14 = zChangedInstance4 | z13;
                                                    objRememberedValue4 = $composer3.rememberedValue();
                                                    if (z14) {
                                                    }
                                                    z15 = isGenerating;
                                                    Object obj4 = new Function1() { // from class: com.luchime.huiyuan.ui.ChatScreenKt$$ExternalSyntheticLambda4
                                                        @Override // kotlin.jvm.functions.Function1
                                                        public final Object invoke(Object obj5) {
                                                            return ChatScreenKt.Composer$lambda$121$lambda$114$lambda$113(z15, input, haptics2, function0, (KeyboardActionScope) obj5);
                                                        }
                                                    };
                                                    $composer3.updateRememberedValue(obj4);
                                                    objRememberedValue4 = obj4;
                                                    ComposerKt.sourceInformationMarkerEnd($composer3);
                                                    $dirty = $dirty2;
                                                    OutlinedTextFieldKt.OutlinedTextField(input, function2, modifierWeight$default2, false, false, textStyleM6430copyp1EtxEg$default2, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) ComposableLambdaKt.rememberComposableLambda(-1932805377, true, new Function2() { // from class: com.luchime.huiyuan.ui.ChatScreenKt$$ExternalSyntheticLambda5
                                                        @Override // kotlin.jvm.functions.Function2
                                                        public final Object invoke(Object obj5, Object obj6) {
                                                            return ChatScreenKt.Composer$lambda$121$lambda$115(z15, selectedModel, (Composer) obj5, ((Integer) obj6).intValue());
                                                        }
                                                    }, $composer3, 54), (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, false, (VisualTransformation) null, keyboardOptions2, new KeyboardActions(null, null, null, null, null, (Function1) objRememberedValue4, 31), false, 2, 1, (MutableInteractionSource) null, (Shape) roundedCornerShapeM1018RoundedCornerShape0680j_7, TextFieldDefaults.INSTANCE.m2801colors0hiis_0(0L, 0L, 0L, 0L, Color.INSTANCE.m4403getWhite0d7_KjU(), Color.INSTANCE.m4403getWhite0d7_KjU(), 0L, 0L, HuiyuanDesignKt.getInk(), 0L, null, HuiyuanDesignKt.getInk(), HuiyuanDesignKt.getInk(), 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, $composer3, 100884480, 432, 0, 0, 3072, 2147477199, 4095), $composer3, (($dirty2 >> 6) & 14) | 12582912 | (($dirty2 >> 6) & 112), 906166272, 0, 1212248);
                                                    boolean z212 = !isGenerating;
                                                    RoundedCornerShape roundedCornerShapeM1018RoundedCornerShape0680j_8 = RoundedCornerShapeKt.m1018RoundedCornerShape0680j_4(Dp.m6973constructorimpl(12));
                                                    ButtonColors buttonColorsM1936buttonColorsro_MJ89 = ButtonDefaults.INSTANCE.m1936buttonColorsro_MJ88(Color.INSTANCE.m4403getWhite0d7_KjU(), HuiyuanDesignKt.getInk(), ColorKt.Color(4292992206L), HuiyuanDesignKt.getMutedText(), $composer3, (ButtonDefaults.$stable << 12) | 3510, 0);
                                                    PaddingValues paddingValuesM719PaddingValuesYgX7TsA2 = PaddingKt.m719PaddingValuesYgX7TsA(Dp.m6973constructorimpl(11), Dp.m6973constructorimpl(10));
                                                    Modifier modifierM245borderxT4_qwU2 = BorderKt.m245borderxT4_qwU(Modifier.INSTANCE, Dp.m6973constructorimpl(2), HuiyuanDesignKt.getInk(), RoundedCornerShapeKt.m1018RoundedCornerShape0680j_4(Dp.m6973constructorimpl(12)));
                                                    ComposerKt.sourceInformationMarkerStart($composer3, -34139619, "CC(remember):ChatScreen.kt#9igjgp");
                                                    boolean zChangedInstance5 = $composer3.changedInstance(haptics2);
                                                    if (($dirty & 458752) == 131072) {
                                                        z16 = true;
                                                    } else {
                                                        z16 = false;
                                                    }
                                                    z17 = zChangedInstance5 | z16;
                                                    objRememberedValue5 = $composer3.rememberedValue();
                                                    if (z17) {
                                                        function12 = function3;
                                                        Object obj5 = new Function0() { // from class: com.luchime.huiyuan.ui.ChatScreenKt$$ExternalSyntheticLambda6
                                                            @Override // kotlin.jvm.functions.Function0
                                                            public final Object invoke() {
                                                                return ChatScreenKt.Composer$lambda$121$lambda$117$lambda$116(haptics2, function12);
                                                            }
                                                        };
                                                        $composer3.updateRememberedValue(obj5);
                                                        objRememberedValue5 = obj5;
                                                    } else {
                                                        function12 = function3;
                                                        Object obj6 = new Function0() { // from class: com.luchime.huiyuan.ui.ChatScreenKt$$ExternalSyntheticLambda6
                                                            @Override // kotlin.jvm.functions.Function0
                                                            public final Object invoke() {
                                                                return ChatScreenKt.Composer$lambda$121$lambda$117$lambda$116(haptics2, function12);
                                                            }
                                                        };
                                                        $composer3.updateRememberedValue(obj6);
                                                        objRememberedValue5 = obj6;
                                                    }
                                                    ComposerKt.sourceInformationMarkerEnd($composer3);
                                                    ButtonKt.Button((Function0) objRememberedValue5, modifierM245borderxT4_qwU2, z212, roundedCornerShapeM1018RoundedCornerShape0680j_8, buttonColorsM1936buttonColorsro_MJ89, null, null, paddingValuesM719PaddingValuesYgX7TsA2, null, ComposableSingletons$ChatScreenKt.INSTANCE.getLambda$1738058344$app(), $composer3, 817889280, 352);
                                                    ComposerKt.sourceInformationMarkerStart($composer3, -34114004, "CC(remember):ChatScreen.kt#9igjgp");
                                                    if (($dirty & 3670016) == 1048576) {
                                                        z18 = true;
                                                    } else {
                                                        z18 = false;
                                                    }
                                                    boolean zChangedInstance6 = $composer3.changedInstance(haptics2) | z18;
                                                    if (($dirty & 29360128) == 8388608) {
                                                        z19 = true;
                                                    } else {
                                                        z19 = false;
                                                    }
                                                    boolean z213 = zChangedInstance6 | z19;
                                                    if (($dirty & 57344) == 16384) {
                                                        z20 = true;
                                                    } else {
                                                        z20 = false;
                                                    }
                                                    z21 = z213 | z20;
                                                    objRememberedValue6 = $composer3.rememberedValue();
                                                    if (z21) {
                                                        z22 = isGenerating;
                                                        Object obj7 = new Function0() { // from class: com.luchime.huiyuan.ui.ChatScreenKt$$ExternalSyntheticLambda7
                                                            @Override // kotlin.jvm.functions.Function0
                                                            public final Object invoke() {
                                                                return ChatScreenKt.Composer$lambda$121$lambda$119$lambda$118(z22, haptics2, function4, function0);
                                                            }
                                                        };
                                                        $composer3.updateRememberedValue(obj7);
                                                        objRememberedValue6 = obj7;
                                                    } else {
                                                        z22 = isGenerating;
                                                        Object obj8 = new Function0() { // from class: com.luchime.huiyuan.ui.ChatScreenKt$$ExternalSyntheticLambda7
                                                            @Override // kotlin.jvm.functions.Function0
                                                            public final Object invoke() {
                                                                return ChatScreenKt.Composer$lambda$121$lambda$119$lambda$118(z22, haptics2, function4, function0);
                                                            }
                                                        };
                                                        $composer3.updateRememberedValue(obj8);
                                                        objRememberedValue6 = obj8;
                                                    }
                                                    Function0 function14 = (Function0) objRememberedValue6;
                                                    ComposerKt.sourceInformationMarkerEnd($composer3);
                                                    if (z22) {
                                                        z23 = true;
                                                    } else {
                                                        z23 = true;
                                                    }
                                                    RoundedCornerShape roundedCornerShapeM1018RoundedCornerShape0680j_9 = RoundedCornerShapeKt.m1018RoundedCornerShape0680j_4(Dp.m6973constructorimpl(12));
                                                    ButtonDefaults buttonDefaults2 = ButtonDefaults.INSTANCE;
                                                    if (z22) {
                                                        ink2 = HuiyuanDesignKt.getSignalRed();
                                                    } else {
                                                        ink2 = HuiyuanDesignKt.getInk();
                                                    }
                                                    ButtonKt.Button(function14, null, z23, roundedCornerShapeM1018RoundedCornerShape0680j_9, buttonDefaults2.m1936buttonColorsro_MJ88(ink2, Color.INSTANCE.m4403getWhite0d7_KjU(), ColorKt.Color(4287333494L), 0L, $composer3, (ButtonDefaults.$stable << 12) | 432, 8), null, null, PaddingKt.m719PaddingValuesYgX7TsA(Dp.m6973constructorimpl(12), Dp.m6973constructorimpl(10)), null, ComposableLambdaKt.rememberComposableLambda(-1698315055, true, new Function3() { // from class: com.luchime.huiyuan.ui.ChatScreenKt$$ExternalSyntheticLambda8
                                                        @Override // kotlin.jvm.functions.Function3
                                                        public final Object invoke(Object obj9, Object obj10, Object obj11) {
                                                            return ChatScreenKt.Composer$lambda$121$lambda$120(z22, (RowScope) obj9, (Composer) obj10, ((Integer) obj11).intValue());
                                                        }
                                                    }, $composer3, 54), $composer3, 817889280, 354);
                                                    ComposerKt.sourceInformationMarkerEnd($composer3);
                                                    ComposerKt.sourceInformationMarkerEnd($composer3);
                                                    $composer3.endNode();
                                                    ComposerKt.sourceInformationMarkerEnd($composer3);
                                                    ComposerKt.sourceInformationMarkerEnd($composer3);
                                                    ComposerKt.sourceInformationMarkerEnd($composer3);
                                                    $composer3.endReplaceGroup();
                                                    $composer2 = $composer3;
                                                    z = z22;
                                                    function5 = function12;
                                                }
                                                composerM3808constructorimpl4.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash4));
                                                composerM3808constructorimpl4.apply(Integer.valueOf(currentCompositeKeyHash4), setCompositeKeyHash);
                                                Updater.m3815setimpl(composerM3808constructorimpl4, modifierMaterializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
                                                int i15 = (i5 >> 6) & 14;
                                                ComposerKt.sourceInformationMarkerStart($composer3, -407735110, "C101@5232L9:Row.kt#2w3rfo");
                                                int i16 = ((432 >> 6) & 112) | 6;
                                                RowScope rowScope3 = RowScopeInstance.INSTANCE;
                                                ComposerKt.sourceInformationMarkerStart($composer3, -1060164626, "C931@34045L21,930@33965L588,955@35041L10,960@35348L196,966@35590L279,948@34741L256,944@34566L1317,981@36165L238,975@35930L101,974@35896L781,993@36724L308,1004@37187L217,1010@37505L201,992@36690L1016:ChatScreen.kt#cyjvf");
                                                Modifier modifierHorizontalScroll$default2 = ScrollKt.horizontalScroll$default(SizeKt.m779widthInVpY3zN4$default(Modifier.INSTANCE, 0.0f, Dp.m6973constructorimpl(190), 1, null), ScrollKt.rememberScrollState(0, $composer3, 0, 1), false, null, false, 14, null);
                                                Arrangement.Horizontal horizontalM606spacedBy0680j_6 = Arrangement.INSTANCE.m606spacedBy0680j_4(Dp.m6973constructorimpl(6));
                                                ComposerKt.sourceInformationMarkerStart($composer3, 693286680, "CC(Row)P(2,1,3)99@5124L58,100@5187L130:Row.kt#2w3rfo");
                                                MeasurePolicy measurePolicyRowMeasurePolicy3 = RowKt.rowMeasurePolicy(horizontalM606spacedBy0680j_6, Alignment.INSTANCE.getTop(), $composer3, ((48 >> 3) & 14) | ((48 >> 3) & 112));
                                                ComposerKt.sourceInformationMarkerStart($composer3, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                                                currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash($composer3, 0);
                                                CompositionLocalMap currentCompositionLocalMap3 = $composer3.getCurrentCompositionLocalMap();
                                                Modifier modifierMaterializeModifier4 = ComposedModifierKt.materializeModifier($composer3, modifierHorizontalScroll$default2);
                                                constructor3 = ComposeUiNode.INSTANCE.getConstructor();
                                                int i17 = ((((48 << 3) & 112) << 6) & 896) | 6;
                                                ComposerKt.sourceInformationMarkerStart($composer3, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
                                                if (!($composer3.getApplier() instanceof Applier)) {
                                                    ComposablesKt.invalidApplier();
                                                }
                                                $composer3.startReusableNode();
                                                if ($composer3.getInserting()) {
                                                    function11 = constructor3;
                                                    $composer3.createNode(function11);
                                                } else {
                                                    function11 = constructor3;
                                                    $composer3.useNode();
                                                }
                                                composerM3808constructorimpl3 = Updater.m3808constructorimpl($composer3);
                                                Updater.m3815setimpl(composerM3808constructorimpl3, measurePolicyRowMeasurePolicy3, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                                Updater.m3815setimpl(composerM3808constructorimpl3, currentCompositionLocalMap3, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                                                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                                                if (composerM3808constructorimpl3.getInserting()) {
                                                    composer3 = $composer3;
                                                    if (!Intrinsics.areEqual(composerM3808constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                                                    }
                                                    Updater.m3815setimpl(composerM3808constructorimpl3, modifierMaterializeModifier4, ComposeUiNode.INSTANCE.getSetModifier());
                                                    int i18 = (i17 >> 6) & 14;
                                                    Composer composer11 = composer3;
                                                    i2 = 0;
                                                    ComposerKt.sourceInformationMarkerStart(composer11, -407735110, "C101@5232L9:Row.kt#2w3rfo");
                                                    RowScopeInstance rowScopeInstance3 = RowScopeInstance.INSTANCE;
                                                    int i19 = ((48 >> 6) & 112) | 6;
                                                    composer4 = composer11;
                                                    ComposerKt.sourceInformationMarkerStart(composer4, 2130717372, "C:ChatScreen.kt#cyjvf");
                                                    composer4.startReplaceGroup(761469975);
                                                    ComposerKt.sourceInformation(composer4, "*940@34473L26,935@34223L298");
                                                    entries2 = AIModel.getEntries();
                                                    i3 = 0;
                                                    while (r25.hasNext()) {
                                                        Iterable iterable3 = entries2;
                                                        String shortName3 = aIModel.getShortName();
                                                        long jModelAccent3 = modelAccent(aIModel);
                                                        if (selectedModel == aIModel) {
                                                            z24 = true;
                                                        } else {
                                                            z24 = false;
                                                        }
                                                        boolean z214 = !isGenerating;
                                                        int i110 = i3;
                                                        ComposerKt.sourceInformationMarkerStart(composer4, -1893764028, "CC(remember):ChatScreen.kt#9igjgp");
                                                        Composer composer12 = composer4;
                                                        if (($dirty2 & 112) == 32) {
                                                            z25 = true;
                                                        } else {
                                                            z25 = false;
                                                        }
                                                        zChanged2 = z25 | $composer3.changed(aIModel.ordinal());
                                                        objRememberedValue7 = composer12.rememberedValue();
                                                        if (zChanged2) {
                                                            i4 = i2;
                                                            if (objRememberedValue7 == Composer.INSTANCE.getEmpty()) {
                                                            }
                                                            ComposerKt.sourceInformationMarkerEnd(composer12);
                                                            m7402ModeChip8V94_ZQ(shortName3, jModelAccent3, z24, z214, (Function0) objRememberedValue7, composer12, 0, 0);
                                                            composer4 = composer12;
                                                            entries2 = iterable3;
                                                            i3 = i110;
                                                            i2 = i4;
                                                        } else {
                                                            i4 = i2;
                                                        }
                                                        objRememberedValue7 = new Function0() { // from class: com.luchime.huiyuan.ui.ChatScreenKt$$ExternalSyntheticLambda0
                                                            @Override // kotlin.jvm.functions.Function0
                                                            public final Object invoke() {
                                                                return ChatScreenKt.Composer$lambda$121$lambda$112$lambda$111$lambda$110$lambda$109(function1, aIModel);
                                                            }
                                                        };
                                                        composer12.updateRememberedValue(objRememberedValue7);
                                                        ComposerKt.sourceInformationMarkerEnd(composer12);
                                                        m7402ModeChip8V94_ZQ(shortName3, jModelAccent3, z24, z214, (Function0) objRememberedValue7, composer12, 0, 0);
                                                        composer4 = composer12;
                                                        entries2 = iterable3;
                                                        i3 = i110;
                                                        i2 = i4;
                                                    }
                                                    Composer composer13 = composer4;
                                                    composer13.endReplaceGroup();
                                                    ComposerKt.sourceInformationMarkerEnd(composer13);
                                                    ComposerKt.sourceInformationMarkerEnd(composer11);
                                                    composer3.endNode();
                                                    ComposerKt.sourceInformationMarkerEnd(composer3);
                                                    ComposerKt.sourceInformationMarkerEnd(composer3);
                                                    ComposerKt.sourceInformationMarkerEnd(composer3);
                                                    Modifier modifierWeight$default3 = RowScope.weight$default(rowScope3, Modifier.INSTANCE, 1.0f, false, 2, null);
                                                    TextStyle textStyleM6430copyp1EtxEg$default3 = TextStyle.m6430copyp1EtxEg$default(MaterialTheme.INSTANCE.getTypography($composer3, MaterialTheme.$stable).getBodyLarge(), HuiyuanDesignKt.getInk(), TextUnitKt.getSp(14), null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777212, null);
                                                    RoundedCornerShape roundedCornerShapeM1018RoundedCornerShape0680j_10 = RoundedCornerShapeKt.m1018RoundedCornerShape0680j_4(Dp.m6973constructorimpl(18));
                                                    KeyboardOptions keyboardOptions3 = new KeyboardOptions(0, (Boolean) null, 0, ImeAction.INSTANCE.m6603getSendeUduSuo(), (PlatformImeOptions) null, (Boolean) null, (LocaleList) null, 119, (DefaultConstructorMarker) null);
                                                    ComposerKt.sourceInformationMarkerStart($composer3, -34158148, "CC(remember):ChatScreen.kt#9igjgp");
                                                    if (($dirty2 & 3670016) == 1048576) {
                                                        z11 = true;
                                                    } else {
                                                        z11 = false;
                                                    }
                                                    if (($dirty2 & 896) == 256) {
                                                        z12 = true;
                                                    } else {
                                                        z12 = false;
                                                    }
                                                    boolean z215 = z11 | z12;
                                                    haptics2 = haptics;
                                                    boolean zChangedInstance7 = z215 | $composer3.changedInstance(haptics2);
                                                    if (($dirty2 & 57344) == 16384) {
                                                        z13 = true;
                                                    } else {
                                                        z13 = false;
                                                    }
                                                    z14 = zChangedInstance7 | z13;
                                                    objRememberedValue4 = $composer3.rememberedValue();
                                                    if (z14) {
                                                    }
                                                    z15 = isGenerating;
                                                    Object obj9 = new Function1() { // from class: com.luchime.huiyuan.ui.ChatScreenKt$$ExternalSyntheticLambda4
                                                        @Override // kotlin.jvm.functions.Function1
                                                        public final Object invoke(Object obj10) {
                                                            return ChatScreenKt.Composer$lambda$121$lambda$114$lambda$113(z15, input, haptics2, function0, (KeyboardActionScope) obj10);
                                                        }
                                                    };
                                                    $composer3.updateRememberedValue(obj9);
                                                    objRememberedValue4 = obj9;
                                                    ComposerKt.sourceInformationMarkerEnd($composer3);
                                                    $dirty = $dirty2;
                                                    OutlinedTextFieldKt.OutlinedTextField(input, function2, modifierWeight$default3, false, false, textStyleM6430copyp1EtxEg$default3, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) ComposableLambdaKt.rememberComposableLambda(-1932805377, true, new Function2() { // from class: com.luchime.huiyuan.ui.ChatScreenKt$$ExternalSyntheticLambda5
                                                        @Override // kotlin.jvm.functions.Function2
                                                        public final Object invoke(Object obj10, Object obj11) {
                                                            return ChatScreenKt.Composer$lambda$121$lambda$115(z15, selectedModel, (Composer) obj10, ((Integer) obj11).intValue());
                                                        }
                                                    }, $composer3, 54), (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, false, (VisualTransformation) null, keyboardOptions3, new KeyboardActions(null, null, null, null, null, (Function1) objRememberedValue4, 31), false, 2, 1, (MutableInteractionSource) null, (Shape) roundedCornerShapeM1018RoundedCornerShape0680j_10, TextFieldDefaults.INSTANCE.m2801colors0hiis_0(0L, 0L, 0L, 0L, Color.INSTANCE.m4403getWhite0d7_KjU(), Color.INSTANCE.m4403getWhite0d7_KjU(), 0L, 0L, HuiyuanDesignKt.getInk(), 0L, null, HuiyuanDesignKt.getInk(), HuiyuanDesignKt.getInk(), 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, $composer3, 100884480, 432, 0, 0, 3072, 2147477199, 4095), $composer3, (($dirty2 >> 6) & 14) | 12582912 | (($dirty2 >> 6) & 112), 906166272, 0, 1212248);
                                                    boolean z216 = !isGenerating;
                                                    RoundedCornerShape roundedCornerShapeM1018RoundedCornerShape0680j_11 = RoundedCornerShapeKt.m1018RoundedCornerShape0680j_4(Dp.m6973constructorimpl(12));
                                                    ButtonColors buttonColorsM1936buttonColorsro_MJ810 = ButtonDefaults.INSTANCE.m1936buttonColorsro_MJ88(Color.INSTANCE.m4403getWhite0d7_KjU(), HuiyuanDesignKt.getInk(), ColorKt.Color(4292992206L), HuiyuanDesignKt.getMutedText(), $composer3, (ButtonDefaults.$stable << 12) | 3510, 0);
                                                    PaddingValues paddingValuesM719PaddingValuesYgX7TsA3 = PaddingKt.m719PaddingValuesYgX7TsA(Dp.m6973constructorimpl(11), Dp.m6973constructorimpl(10));
                                                    Modifier modifierM245borderxT4_qwU3 = BorderKt.m245borderxT4_qwU(Modifier.INSTANCE, Dp.m6973constructorimpl(2), HuiyuanDesignKt.getInk(), RoundedCornerShapeKt.m1018RoundedCornerShape0680j_4(Dp.m6973constructorimpl(12)));
                                                    ComposerKt.sourceInformationMarkerStart($composer3, -34139619, "CC(remember):ChatScreen.kt#9igjgp");
                                                    boolean zChangedInstance8 = $composer3.changedInstance(haptics2);
                                                    if (($dirty & 458752) == 131072) {
                                                        z16 = true;
                                                    } else {
                                                        z16 = false;
                                                    }
                                                    z17 = zChangedInstance8 | z16;
                                                    objRememberedValue5 = $composer3.rememberedValue();
                                                    if (z17) {
                                                        function12 = function3;
                                                        Object obj10 = new Function0() { // from class: com.luchime.huiyuan.ui.ChatScreenKt$$ExternalSyntheticLambda6
                                                            @Override // kotlin.jvm.functions.Function0
                                                            public final Object invoke() {
                                                                return ChatScreenKt.Composer$lambda$121$lambda$117$lambda$116(haptics2, function12);
                                                            }
                                                        };
                                                        $composer3.updateRememberedValue(obj10);
                                                        objRememberedValue5 = obj10;
                                                    } else {
                                                        function12 = function3;
                                                        Object obj11 = new Function0() { // from class: com.luchime.huiyuan.ui.ChatScreenKt$$ExternalSyntheticLambda6
                                                            @Override // kotlin.jvm.functions.Function0
                                                            public final Object invoke() {
                                                                return ChatScreenKt.Composer$lambda$121$lambda$117$lambda$116(haptics2, function12);
                                                            }
                                                        };
                                                        $composer3.updateRememberedValue(obj11);
                                                        objRememberedValue5 = obj11;
                                                    }
                                                    ComposerKt.sourceInformationMarkerEnd($composer3);
                                                    ButtonKt.Button((Function0) objRememberedValue5, modifierM245borderxT4_qwU3, z216, roundedCornerShapeM1018RoundedCornerShape0680j_11, buttonColorsM1936buttonColorsro_MJ810, null, null, paddingValuesM719PaddingValuesYgX7TsA3, null, ComposableSingletons$ChatScreenKt.INSTANCE.getLambda$1738058344$app(), $composer3, 817889280, 352);
                                                    ComposerKt.sourceInformationMarkerStart($composer3, -34114004, "CC(remember):ChatScreen.kt#9igjgp");
                                                    if (($dirty & 3670016) == 1048576) {
                                                        z18 = true;
                                                    } else {
                                                        z18 = false;
                                                    }
                                                    boolean zChangedInstance9 = $composer3.changedInstance(haptics2) | z18;
                                                    if (($dirty & 29360128) == 8388608) {
                                                        z19 = true;
                                                    } else {
                                                        z19 = false;
                                                    }
                                                    boolean z217 = zChangedInstance9 | z19;
                                                    if (($dirty & 57344) == 16384) {
                                                        z20 = true;
                                                    } else {
                                                        z20 = false;
                                                    }
                                                    z21 = z217 | z20;
                                                    objRememberedValue6 = $composer3.rememberedValue();
                                                    if (z21) {
                                                        z22 = isGenerating;
                                                        Object obj12 = new Function0() { // from class: com.luchime.huiyuan.ui.ChatScreenKt$$ExternalSyntheticLambda7
                                                            @Override // kotlin.jvm.functions.Function0
                                                            public final Object invoke() {
                                                                return ChatScreenKt.Composer$lambda$121$lambda$119$lambda$118(z22, haptics2, function4, function0);
                                                            }
                                                        };
                                                        $composer3.updateRememberedValue(obj12);
                                                        objRememberedValue6 = obj12;
                                                    } else {
                                                        z22 = isGenerating;
                                                        Object obj13 = new Function0() { // from class: com.luchime.huiyuan.ui.ChatScreenKt$$ExternalSyntheticLambda7
                                                            @Override // kotlin.jvm.functions.Function0
                                                            public final Object invoke() {
                                                                return ChatScreenKt.Composer$lambda$121$lambda$119$lambda$118(z22, haptics2, function4, function0);
                                                            }
                                                        };
                                                        $composer3.updateRememberedValue(obj13);
                                                        objRememberedValue6 = obj13;
                                                    }
                                                    Function0 function15 = (Function0) objRememberedValue6;
                                                    ComposerKt.sourceInformationMarkerEnd($composer3);
                                                    if (z22) {
                                                        z23 = true;
                                                    } else {
                                                        z23 = true;
                                                    }
                                                    RoundedCornerShape roundedCornerShapeM1018RoundedCornerShape0680j_12 = RoundedCornerShapeKt.m1018RoundedCornerShape0680j_4(Dp.m6973constructorimpl(12));
                                                    ButtonDefaults buttonDefaults3 = ButtonDefaults.INSTANCE;
                                                    if (z22) {
                                                        ink2 = HuiyuanDesignKt.getSignalRed();
                                                    } else {
                                                        ink2 = HuiyuanDesignKt.getInk();
                                                    }
                                                    ButtonKt.Button(function15, null, z23, roundedCornerShapeM1018RoundedCornerShape0680j_12, buttonDefaults3.m1936buttonColorsro_MJ88(ink2, Color.INSTANCE.m4403getWhite0d7_KjU(), ColorKt.Color(4287333494L), 0L, $composer3, (ButtonDefaults.$stable << 12) | 432, 8), null, null, PaddingKt.m719PaddingValuesYgX7TsA(Dp.m6973constructorimpl(12), Dp.m6973constructorimpl(10)), null, ComposableLambdaKt.rememberComposableLambda(-1698315055, true, new Function3() { // from class: com.luchime.huiyuan.ui.ChatScreenKt$$ExternalSyntheticLambda8
                                                        @Override // kotlin.jvm.functions.Function3
                                                        public final Object invoke(Object obj14, Object obj15, Object obj16) {
                                                            return ChatScreenKt.Composer$lambda$121$lambda$120(z22, (RowScope) obj14, (Composer) obj15, ((Integer) obj16).intValue());
                                                        }
                                                    }, $composer3, 54), $composer3, 817889280, 354);
                                                    ComposerKt.sourceInformationMarkerEnd($composer3);
                                                    ComposerKt.sourceInformationMarkerEnd($composer3);
                                                    $composer3.endNode();
                                                    ComposerKt.sourceInformationMarkerEnd($composer3);
                                                    ComposerKt.sourceInformationMarkerEnd($composer3);
                                                    ComposerKt.sourceInformationMarkerEnd($composer3);
                                                    $composer3.endReplaceGroup();
                                                    $composer2 = $composer3;
                                                    z = z22;
                                                    function5 = function12;
                                                } else {
                                                    composer3 = $composer3;
                                                }
                                                composerM3808constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                                                composerM3808constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                                                Updater.m3815setimpl(composerM3808constructorimpl3, modifierMaterializeModifier4, ComposeUiNode.INSTANCE.getSetModifier());
                                                int i111 = (i17 >> 6) & 14;
                                                Composer composer14 = composer3;
                                                i2 = 0;
                                                ComposerKt.sourceInformationMarkerStart(composer14, -407735110, "C101@5232L9:Row.kt#2w3rfo");
                                                RowScopeInstance rowScopeInstance4 = RowScopeInstance.INSTANCE;
                                                int i112 = ((48 >> 6) & 112) | 6;
                                                composer4 = composer14;
                                                ComposerKt.sourceInformationMarkerStart(composer4, 2130717372, "C:ChatScreen.kt#cyjvf");
                                                composer4.startReplaceGroup(761469975);
                                                ComposerKt.sourceInformation(composer4, "*940@34473L26,935@34223L298");
                                                entries2 = AIModel.getEntries();
                                                i3 = 0;
                                                while (r25.hasNext()) {
                                                    Iterable iterable4 = entries2;
                                                    String shortName4 = aIModel.getShortName();
                                                    long jModelAccent4 = modelAccent(aIModel);
                                                    if (selectedModel == aIModel) {
                                                        z24 = true;
                                                    } else {
                                                        z24 = false;
                                                    }
                                                    boolean z218 = !isGenerating;
                                                    int i113 = i3;
                                                    ComposerKt.sourceInformationMarkerStart(composer4, -1893764028, "CC(remember):ChatScreen.kt#9igjgp");
                                                    Composer composer15 = composer4;
                                                    if (($dirty2 & 112) == 32) {
                                                        z25 = true;
                                                    } else {
                                                        z25 = false;
                                                    }
                                                    zChanged2 = z25 | $composer3.changed(aIModel.ordinal());
                                                    objRememberedValue7 = composer15.rememberedValue();
                                                    if (zChanged2) {
                                                        i4 = i2;
                                                        if (objRememberedValue7 == Composer.INSTANCE.getEmpty()) {
                                                        }
                                                        ComposerKt.sourceInformationMarkerEnd(composer15);
                                                        m7402ModeChip8V94_ZQ(shortName4, jModelAccent4, z24, z218, (Function0) objRememberedValue7, composer15, 0, 0);
                                                        composer4 = composer15;
                                                        entries2 = iterable4;
                                                        i3 = i113;
                                                        i2 = i4;
                                                    } else {
                                                        i4 = i2;
                                                    }
                                                    objRememberedValue7 = new Function0() { // from class: com.luchime.huiyuan.ui.ChatScreenKt$$ExternalSyntheticLambda0
                                                        @Override // kotlin.jvm.functions.Function0
                                                        public final Object invoke() {
                                                            return ChatScreenKt.Composer$lambda$121$lambda$112$lambda$111$lambda$110$lambda$109(function1, aIModel);
                                                        }
                                                    };
                                                    composer15.updateRememberedValue(objRememberedValue7);
                                                    ComposerKt.sourceInformationMarkerEnd(composer15);
                                                    m7402ModeChip8V94_ZQ(shortName4, jModelAccent4, z24, z218, (Function0) objRememberedValue7, composer15, 0, 0);
                                                    composer4 = composer15;
                                                    entries2 = iterable4;
                                                    i3 = i113;
                                                    i2 = i4;
                                                }
                                                Composer composer16 = composer4;
                                                composer16.endReplaceGroup();
                                                ComposerKt.sourceInformationMarkerEnd(composer16);
                                                ComposerKt.sourceInformationMarkerEnd(composer14);
                                                composer3.endNode();
                                                ComposerKt.sourceInformationMarkerEnd(composer3);
                                                ComposerKt.sourceInformationMarkerEnd(composer3);
                                                ComposerKt.sourceInformationMarkerEnd(composer3);
                                                Modifier modifierWeight$default4 = RowScope.weight$default(rowScope3, Modifier.INSTANCE, 1.0f, false, 2, null);
                                                TextStyle textStyleM6430copyp1EtxEg$default4 = TextStyle.m6430copyp1EtxEg$default(MaterialTheme.INSTANCE.getTypography($composer3, MaterialTheme.$stable).getBodyLarge(), HuiyuanDesignKt.getInk(), TextUnitKt.getSp(14), null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777212, null);
                                                RoundedCornerShape roundedCornerShapeM1018RoundedCornerShape0680j_13 = RoundedCornerShapeKt.m1018RoundedCornerShape0680j_4(Dp.m6973constructorimpl(18));
                                                KeyboardOptions keyboardOptions4 = new KeyboardOptions(0, (Boolean) null, 0, ImeAction.INSTANCE.m6603getSendeUduSuo(), (PlatformImeOptions) null, (Boolean) null, (LocaleList) null, 119, (DefaultConstructorMarker) null);
                                                ComposerKt.sourceInformationMarkerStart($composer3, -34158148, "CC(remember):ChatScreen.kt#9igjgp");
                                                if (($dirty2 & 3670016) == 1048576) {
                                                    z11 = true;
                                                } else {
                                                    z11 = false;
                                                }
                                                if (($dirty2 & 896) == 256) {
                                                    z12 = true;
                                                } else {
                                                    z12 = false;
                                                }
                                                boolean z219 = z11 | z12;
                                                haptics2 = haptics;
                                                boolean zChangedInstance10 = z219 | $composer3.changedInstance(haptics2);
                                                if (($dirty2 & 57344) == 16384) {
                                                    z13 = true;
                                                } else {
                                                    z13 = false;
                                                }
                                                z14 = zChangedInstance10 | z13;
                                                objRememberedValue4 = $composer3.rememberedValue();
                                                if (z14) {
                                                }
                                                z15 = isGenerating;
                                                Object obj14 = new Function1() { // from class: com.luchime.huiyuan.ui.ChatScreenKt$$ExternalSyntheticLambda4
                                                    @Override // kotlin.jvm.functions.Function1
                                                    public final Object invoke(Object obj15) {
                                                        return ChatScreenKt.Composer$lambda$121$lambda$114$lambda$113(z15, input, haptics2, function0, (KeyboardActionScope) obj15);
                                                    }
                                                };
                                                $composer3.updateRememberedValue(obj14);
                                                objRememberedValue4 = obj14;
                                                ComposerKt.sourceInformationMarkerEnd($composer3);
                                                $dirty = $dirty2;
                                                OutlinedTextFieldKt.OutlinedTextField(input, function2, modifierWeight$default4, false, false, textStyleM6430copyp1EtxEg$default4, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) ComposableLambdaKt.rememberComposableLambda(-1932805377, true, new Function2() { // from class: com.luchime.huiyuan.ui.ChatScreenKt$$ExternalSyntheticLambda5
                                                    @Override // kotlin.jvm.functions.Function2
                                                    public final Object invoke(Object obj15, Object obj16) {
                                                        return ChatScreenKt.Composer$lambda$121$lambda$115(z15, selectedModel, (Composer) obj15, ((Integer) obj16).intValue());
                                                    }
                                                }, $composer3, 54), (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, false, (VisualTransformation) null, keyboardOptions4, new KeyboardActions(null, null, null, null, null, (Function1) objRememberedValue4, 31), false, 2, 1, (MutableInteractionSource) null, (Shape) roundedCornerShapeM1018RoundedCornerShape0680j_13, TextFieldDefaults.INSTANCE.m2801colors0hiis_0(0L, 0L, 0L, 0L, Color.INSTANCE.m4403getWhite0d7_KjU(), Color.INSTANCE.m4403getWhite0d7_KjU(), 0L, 0L, HuiyuanDesignKt.getInk(), 0L, null, HuiyuanDesignKt.getInk(), HuiyuanDesignKt.getInk(), 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, $composer3, 100884480, 432, 0, 0, 3072, 2147477199, 4095), $composer3, (($dirty2 >> 6) & 14) | 12582912 | (($dirty2 >> 6) & 112), 906166272, 0, 1212248);
                                                boolean z2110 = !isGenerating;
                                                RoundedCornerShape roundedCornerShapeM1018RoundedCornerShape0680j_14 = RoundedCornerShapeKt.m1018RoundedCornerShape0680j_4(Dp.m6973constructorimpl(12));
                                                ButtonColors buttonColorsM1936buttonColorsro_MJ811 = ButtonDefaults.INSTANCE.m1936buttonColorsro_MJ88(Color.INSTANCE.m4403getWhite0d7_KjU(), HuiyuanDesignKt.getInk(), ColorKt.Color(4292992206L), HuiyuanDesignKt.getMutedText(), $composer3, (ButtonDefaults.$stable << 12) | 3510, 0);
                                                PaddingValues paddingValuesM719PaddingValuesYgX7TsA4 = PaddingKt.m719PaddingValuesYgX7TsA(Dp.m6973constructorimpl(11), Dp.m6973constructorimpl(10));
                                                Modifier modifierM245borderxT4_qwU4 = BorderKt.m245borderxT4_qwU(Modifier.INSTANCE, Dp.m6973constructorimpl(2), HuiyuanDesignKt.getInk(), RoundedCornerShapeKt.m1018RoundedCornerShape0680j_4(Dp.m6973constructorimpl(12)));
                                                ComposerKt.sourceInformationMarkerStart($composer3, -34139619, "CC(remember):ChatScreen.kt#9igjgp");
                                                boolean zChangedInstance11 = $composer3.changedInstance(haptics2);
                                                if (($dirty & 458752) == 131072) {
                                                    z16 = true;
                                                } else {
                                                    z16 = false;
                                                }
                                                z17 = zChangedInstance11 | z16;
                                                objRememberedValue5 = $composer3.rememberedValue();
                                                if (z17) {
                                                    function12 = function3;
                                                    Object obj15 = new Function0() { // from class: com.luchime.huiyuan.ui.ChatScreenKt$$ExternalSyntheticLambda6
                                                        @Override // kotlin.jvm.functions.Function0
                                                        public final Object invoke() {
                                                            return ChatScreenKt.Composer$lambda$121$lambda$117$lambda$116(haptics2, function12);
                                                        }
                                                    };
                                                    $composer3.updateRememberedValue(obj15);
                                                    objRememberedValue5 = obj15;
                                                } else {
                                                    function12 = function3;
                                                    Object obj16 = new Function0() { // from class: com.luchime.huiyuan.ui.ChatScreenKt$$ExternalSyntheticLambda6
                                                        @Override // kotlin.jvm.functions.Function0
                                                        public final Object invoke() {
                                                            return ChatScreenKt.Composer$lambda$121$lambda$117$lambda$116(haptics2, function12);
                                                        }
                                                    };
                                                    $composer3.updateRememberedValue(obj16);
                                                    objRememberedValue5 = obj16;
                                                }
                                                ComposerKt.sourceInformationMarkerEnd($composer3);
                                                ButtonKt.Button((Function0) objRememberedValue5, modifierM245borderxT4_qwU4, z2110, roundedCornerShapeM1018RoundedCornerShape0680j_14, buttonColorsM1936buttonColorsro_MJ811, null, null, paddingValuesM719PaddingValuesYgX7TsA4, null, ComposableSingletons$ChatScreenKt.INSTANCE.getLambda$1738058344$app(), $composer3, 817889280, 352);
                                                ComposerKt.sourceInformationMarkerStart($composer3, -34114004, "CC(remember):ChatScreen.kt#9igjgp");
                                                if (($dirty & 3670016) == 1048576) {
                                                    z18 = true;
                                                } else {
                                                    z18 = false;
                                                }
                                                boolean zChangedInstance12 = $composer3.changedInstance(haptics2) | z18;
                                                if (($dirty & 29360128) == 8388608) {
                                                    z19 = true;
                                                } else {
                                                    z19 = false;
                                                }
                                                boolean z2111 = zChangedInstance12 | z19;
                                                if (($dirty & 57344) == 16384) {
                                                    z20 = true;
                                                } else {
                                                    z20 = false;
                                                }
                                                z21 = z2111 | z20;
                                                objRememberedValue6 = $composer3.rememberedValue();
                                                if (z21) {
                                                    z22 = isGenerating;
                                                    Object obj17 = new Function0() { // from class: com.luchime.huiyuan.ui.ChatScreenKt$$ExternalSyntheticLambda7
                                                        @Override // kotlin.jvm.functions.Function0
                                                        public final Object invoke() {
                                                            return ChatScreenKt.Composer$lambda$121$lambda$119$lambda$118(z22, haptics2, function4, function0);
                                                        }
                                                    };
                                                    $composer3.updateRememberedValue(obj17);
                                                    objRememberedValue6 = obj17;
                                                } else {
                                                    z22 = isGenerating;
                                                    Object obj18 = new Function0() { // from class: com.luchime.huiyuan.ui.ChatScreenKt$$ExternalSyntheticLambda7
                                                        @Override // kotlin.jvm.functions.Function0
                                                        public final Object invoke() {
                                                            return ChatScreenKt.Composer$lambda$121$lambda$119$lambda$118(z22, haptics2, function4, function0);
                                                        }
                                                    };
                                                    $composer3.updateRememberedValue(obj18);
                                                    objRememberedValue6 = obj18;
                                                }
                                                Function0 function16 = (Function0) objRememberedValue6;
                                                ComposerKt.sourceInformationMarkerEnd($composer3);
                                                if (z22) {
                                                    z23 = true;
                                                } else {
                                                    z23 = true;
                                                }
                                                RoundedCornerShape roundedCornerShapeM1018RoundedCornerShape0680j_15 = RoundedCornerShapeKt.m1018RoundedCornerShape0680j_4(Dp.m6973constructorimpl(12));
                                                ButtonDefaults buttonDefaults4 = ButtonDefaults.INSTANCE;
                                                if (z22) {
                                                    ink2 = HuiyuanDesignKt.getSignalRed();
                                                } else {
                                                    ink2 = HuiyuanDesignKt.getInk();
                                                }
                                                ButtonKt.Button(function16, null, z23, roundedCornerShapeM1018RoundedCornerShape0680j_15, buttonDefaults4.m1936buttonColorsro_MJ88(ink2, Color.INSTANCE.m4403getWhite0d7_KjU(), ColorKt.Color(4287333494L), 0L, $composer3, (ButtonDefaults.$stable << 12) | 432, 8), null, null, PaddingKt.m719PaddingValuesYgX7TsA(Dp.m6973constructorimpl(12), Dp.m6973constructorimpl(10)), null, ComposableLambdaKt.rememberComposableLambda(-1698315055, true, new Function3() { // from class: com.luchime.huiyuan.ui.ChatScreenKt$$ExternalSyntheticLambda8
                                                    @Override // kotlin.jvm.functions.Function3
                                                    public final Object invoke(Object obj19, Object obj110, Object obj111) {
                                                        return ChatScreenKt.Composer$lambda$121$lambda$120(z22, (RowScope) obj19, (Composer) obj110, ((Integer) obj111).intValue());
                                                    }
                                                }, $composer3, 54), $composer3, 817889280, 354);
                                                ComposerKt.sourceInformationMarkerEnd($composer3);
                                                ComposerKt.sourceInformationMarkerEnd($composer3);
                                                $composer3.endNode();
                                                ComposerKt.sourceInformationMarkerEnd($composer3);
                                                ComposerKt.sourceInformationMarkerEnd($composer3);
                                                ComposerKt.sourceInformationMarkerEnd($composer3);
                                                $composer3.endReplaceGroup();
                                                $composer2 = $composer3;
                                                z = z22;
                                                function5 = function12;
                                            } else {
                                                int $dirty3 = $dirty2;
                                                $composer3.startReplaceGroup(1484712503);
                                                ComposerKt.sourceInformation($composer3, "1019@37738L4676");
                                                Modifier modifierM726paddingVpY3zN5 = PaddingKt.m726paddingVpY3zN4(WindowInsetsPadding_androidKt.imePadding(BorderKt.m245borderxT4_qwU(BackgroundKt.m234backgroundbw27NRU$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), HuiyuanDesignKt.getPaper(), null, 2, null), Dp.m6973constructorimpl(2), HuiyuanDesignKt.getInk(), RectangleShapeKt.getRectangleShape())), Dp.m6973constructorimpl(12), Dp.m6973constructorimpl(10));
                                                ComposerKt.sourceInformationMarkerStart($composer3, -483455358, "CC(Column)P(2,3,1)87@4442L61,88@4508L133:Column.kt#2w3rfo");
                                                MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), $composer3, ((0 >> 3) & 14) | ((0 >> 3) & 112));
                                                ComposerKt.sourceInformationMarkerStart($composer3, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                                                int currentCompositeKeyHash5 = ComposablesKt.getCurrentCompositeKeyHash($composer3, 0);
                                                CompositionLocalMap currentCompositionLocalMap4 = $composer3.getCurrentCompositionLocalMap();
                                                Modifier modifierMaterializeModifier5 = ComposedModifierKt.materializeModifier($composer3, modifierM726paddingVpY3zN5);
                                                Function0<ComposeUiNode> constructor5 = ComposeUiNode.INSTANCE.getConstructor();
                                                int i20 = ((((0 << 3) & 112) << 6) & 896) | 6;
                                                ComposerKt.sourceInformationMarkerStart($composer3, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
                                                if (!($composer3.getApplier() instanceof Applier)) {
                                                    ComposablesKt.invalidApplier();
                                                }
                                                $composer3.startReusableNode();
                                                if ($composer3.getInserting()) {
                                                    function6 = constructor5;
                                                    $composer3.createNode(function6);
                                                } else {
                                                    function6 = constructor5;
                                                    $composer3.useNode();
                                                }
                                                Composer composerM3808constructorimpl5 = Updater.m3808constructorimpl($composer3);
                                                Updater.m3815setimpl(composerM3808constructorimpl5, measurePolicyColumnMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                                Updater.m3815setimpl(composerM3808constructorimpl5, currentCompositionLocalMap4, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                                                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash4 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                                                if (composerM3808constructorimpl5.getInserting() || !Intrinsics.areEqual(composerM3808constructorimpl5.rememberedValue(), Integer.valueOf(currentCompositeKeyHash5))) {
                                                    composerM3808constructorimpl5.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash5));
                                                    composerM3808constructorimpl5.apply(Integer.valueOf(currentCompositeKeyHash5), setCompositeKeyHash4);
                                                }
                                                Updater.m3815setimpl(composerM3808constructorimpl5, modifierMaterializeModifier5, ComposeUiNode.INSTANCE.getSetModifier());
                                                int i21 = (i20 >> 6) & 14;
                                                ComposerKt.sourceInformationMarkerStart($composer3, -384672921, "C89@4556L9:Column.kt#2w3rfo");
                                                ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                                                int i22 = ((0 >> 6) & 112) | 6;
                                                ComposerKt.sourceInformationMarkerStart($composer3, -1033296937, "C1034@38385L10,1039@38692L196,1045@38934L279,1031@38216L125,1027@38037L1190,1053@39240L29,1054@39282L3122:ChatScreen.kt#cyjvf");
                                                Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
                                                TextStyle textStyleM6430copyp1EtxEg$default5 = TextStyle.m6430copyp1EtxEg$default(MaterialTheme.INSTANCE.getTypography($composer3, MaterialTheme.$stable).getBodyLarge(), HuiyuanDesignKt.getInk(), TextUnitKt.getSp(15), null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777212, null);
                                                RoundedCornerShape roundedCornerShapeM1018RoundedCornerShape0680j_16 = RoundedCornerShapeKt.m1018RoundedCornerShape0680j_4(Dp.m6973constructorimpl(13));
                                                KeyboardOptions keyboardOptions5 = new KeyboardOptions(0, (Boolean) null, 0, ImeAction.INSTANCE.m6603getSendeUduSuo(), (PlatformImeOptions) null, (Boolean) null, (LocaleList) null, 119, (DefaultConstructorMarker) null);
                                                ComposerKt.sourceInformationMarkerStart($composer3, -726052031, "CC(remember):ChatScreen.kt#9igjgp");
                                                boolean zChangedInstance13 = (($dirty3 & 3670016) == 1048576) | (($dirty3 & 896) == 256) | $composer3.changedInstance(haptics3) | (($dirty3 & 57344) == 16384);
                                                Object objRememberedValue8 = $composer3.rememberedValue();
                                                if (zChangedInstance13 || objRememberedValue8 == Composer.INSTANCE.getEmpty()) {
                                                    objRememberedValue8 = new Function1() { // from class: com.luchime.huiyuan.ui.ChatScreenKt$$ExternalSyntheticLambda9
                                                        @Override // kotlin.jvm.functions.Function1
                                                        public final Object invoke(Object obj19) {
                                                            return ChatScreenKt.Composer$lambda$136$lambda$123$lambda$122(isGenerating, input, haptics3, function0, (KeyboardActionScope) obj19);
                                                        }
                                                    };
                                                    $composer3.updateRememberedValue(objRememberedValue8);
                                                }
                                                ComposerKt.sourceInformationMarkerEnd($composer3);
                                                Composer $composer4 = $composer3;
                                                String str = "CC(remember):ChatScreen.kt#9igjgp";
                                                OutlinedTextFieldKt.OutlinedTextField(input, function2, modifierFillMaxWidth$default, false, false, textStyleM6430copyp1EtxEg$default5, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) ComposableLambdaKt.rememberComposableLambda(-1891348156, true, new Function2() { // from class: com.luchime.huiyuan.ui.ChatScreenKt$$ExternalSyntheticLambda10
                                                    @Override // kotlin.jvm.functions.Function2
                                                    public final Object invoke(Object obj19, Object obj20) {
                                                        return ChatScreenKt.Composer$lambda$136$lambda$124(selectedModel, (Composer) obj19, ((Integer) obj20).intValue());
                                                    }
                                                }, $composer3, 54), (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, false, (VisualTransformation) null, keyboardOptions5, new KeyboardActions(null, null, null, null, null, (Function1) objRememberedValue8, 31), false, 4, 1, (MutableInteractionSource) null, (Shape) roundedCornerShapeM1018RoundedCornerShape0680j_16, TextFieldDefaults.INSTANCE.m2801colors0hiis_0(0L, 0L, 0L, 0L, Color.INSTANCE.m4403getWhite0d7_KjU(), Color.INSTANCE.m4403getWhite0d7_KjU(), 0L, 0L, HuiyuanDesignKt.getInk(), 0L, null, HuiyuanDesignKt.getInk(), HuiyuanDesignKt.getInk(), 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, $composer3, 100884480, 432, 0, 0, 3072, 2147477199, 4095), $composer3, (($dirty3 >> 6) & 14) | 12583296 | (($dirty3 >> 6) & 112), 906166272, 0, 1212248);
                                                SpacerKt.Spacer(SizeKt.m758height3ABfNKs(Modifier.INSTANCE, Dp.m6973constructorimpl(9)), $composer3, 6);
                                                Modifier modifierFillMaxWidth$default2 = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
                                                Arrangement.Horizontal spaceBetween = Arrangement.INSTANCE.getSpaceBetween();
                                                Alignment.Vertical centerVertically2 = Alignment.INSTANCE.getCenterVertically();
                                                ComposerKt.sourceInformationMarkerStart($composer3, 693286680, "CC(Row)P(2,1,3)99@5124L58,100@5187L130:Row.kt#2w3rfo");
                                                MeasurePolicy measurePolicyRowMeasurePolicy4 = RowKt.rowMeasurePolicy(spaceBetween, centerVertically2, $composer3, ((438 >> 3) & 14) | ((438 >> 3) & 112));
                                                ComposerKt.sourceInformationMarkerStart($composer3, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                                                int currentCompositeKeyHash6 = ComposablesKt.getCurrentCompositeKeyHash($composer3, 0);
                                                CompositionLocalMap currentCompositionLocalMap5 = $composer3.getCurrentCompositionLocalMap();
                                                Modifier modifierMaterializeModifier6 = ComposedModifierKt.materializeModifier($composer3, modifierFillMaxWidth$default2);
                                                Function0<ComposeUiNode> constructor6 = ComposeUiNode.INSTANCE.getConstructor();
                                                int i23 = ((((438 << 3) & 112) << 6) & 896) | 6;
                                                ComposerKt.sourceInformationMarkerStart($composer3, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
                                                if (!($composer3.getApplier() instanceof Applier)) {
                                                    ComposablesKt.invalidApplier();
                                                }
                                                $composer3.startReusableNode();
                                                if ($composer3.getInserting()) {
                                                    function7 = constructor6;
                                                    $composer3.createNode(function7);
                                                } else {
                                                    function7 = constructor6;
                                                    $composer3.useNode();
                                                }
                                                Composer composerM3808constructorimpl6 = Updater.m3808constructorimpl($composer3);
                                                Updater.m3815setimpl(composerM3808constructorimpl6, measurePolicyRowMeasurePolicy4, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                                Updater.m3815setimpl(composerM3808constructorimpl6, currentCompositionLocalMap5, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                                                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash5 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                                                if (composerM3808constructorimpl6.getInserting()) {
                                                    composer = $composer3;
                                                } else {
                                                    composer = $composer3;
                                                    if (!Intrinsics.areEqual(composerM3808constructorimpl6.rememberedValue(), Integer.valueOf(currentCompositeKeyHash6))) {
                                                    }
                                                    Updater.m3815setimpl(composerM3808constructorimpl6, modifierMaterializeModifier6, ComposeUiNode.INSTANCE.getSetModifier());
                                                    int i24 = (i23 >> 6) & 14;
                                                    ComposerKt.sourceInformationMarkerStart($composer3, -407735110, "C101@5232L9:Row.kt#2w3rfo");
                                                    int i25 = ((438 >> 6) & 112) | 6;
                                                    RowScope rowScope4 = RowScopeInstance.INSTANCE;
                                                    ComposerKt.sourceInformationMarkerStart($composer3, -1954499104, "C1060@39573L21,1059@39500L629,1073@40146L2244:ChatScreen.kt#cyjvf");
                                                    Modifier modifierHorizontalScroll$default3 = ScrollKt.horizontalScroll$default(RowScope.weight$default(rowScope4, Modifier.INSTANCE, 1.0f, false, 2, null), ScrollKt.rememberScrollState(0, $composer3, 0, 1), false, null, false, 14, null);
                                                    Arrangement.Horizontal horizontalM606spacedBy0680j_7 = Arrangement.INSTANCE.m606spacedBy0680j_4(Dp.m6973constructorimpl(7));
                                                    ComposerKt.sourceInformationMarkerStart($composer3, 693286680, "CC(Row)P(2,1,3)99@5124L58,100@5187L130:Row.kt#2w3rfo");
                                                    MeasurePolicy measurePolicyRowMeasurePolicy5 = RowKt.rowMeasurePolicy(horizontalM606spacedBy0680j_7, Alignment.INSTANCE.getTop(), $composer3, ((48 >> 3) & 14) | ((48 >> 3) & 112));
                                                    ComposerKt.sourceInformationMarkerStart($composer3, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                                                    currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash($composer3, 0);
                                                    CompositionLocalMap currentCompositionLocalMap6 = $composer3.getCurrentCompositionLocalMap();
                                                    modifierMaterializeModifier = ComposedModifierKt.materializeModifier($composer3, modifierHorizontalScroll$default3);
                                                    constructor = ComposeUiNode.INSTANCE.getConstructor();
                                                    int i26 = ((((48 << 3) & 112) << 6) & 896) | 6;
                                                    ComposerKt.sourceInformationMarkerStart($composer3, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
                                                    if (!($composer3.getApplier() instanceof Applier)) {
                                                        ComposablesKt.invalidApplier();
                                                    }
                                                    $composer3.startReusableNode();
                                                    if ($composer3.getInserting()) {
                                                        function8 = constructor;
                                                        $composer3.createNode(function8);
                                                    } else {
                                                        function8 = constructor;
                                                        $composer3.useNode();
                                                    }
                                                    composerM3808constructorimpl = Updater.m3808constructorimpl($composer3);
                                                    Updater.m3815setimpl(composerM3808constructorimpl, measurePolicyRowMeasurePolicy5, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                                    Updater.m3815setimpl(composerM3808constructorimpl, currentCompositionLocalMap6, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                                                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash6 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                                                    if (!composerM3808constructorimpl.getInserting() || !Intrinsics.areEqual(composerM3808constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                                        composerM3808constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                                        composerM3808constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash6);
                                                    }
                                                    Updater.m3815setimpl(composerM3808constructorimpl, modifierMaterializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
                                                    int i27 = (i26 >> 6) & 14;
                                                    ComposerKt.sourceInformationMarkerStart($composer3, -407735110, "C101@5232L9:Row.kt#2w3rfo");
                                                    int i28 = ((48 >> 6) & 112) | 6;
                                                    rowScope = RowScopeInstance.INSTANCE;
                                                    composer2 = $composer3;
                                                    ComposerKt.sourceInformationMarkerStart(composer2, 1480195739, "C:ChatScreen.kt#cyjvf");
                                                    composer2.startReplaceGroup(-1614819240);
                                                    ComposerKt.sourceInformation(composer2, "*1069@40037L26,1064@39767L322");
                                                    entries = AIModel.getEntries();
                                                    i = 0;
                                                    for (final AIModel aIModel2 : entries) {
                                                        Iterable iterable5 = entries;
                                                        String chipLabel = aIModel2.getChipLabel();
                                                        long jModelAccent5 = modelAccent(aIModel2);
                                                        int i29 = i;
                                                        if (selectedModel == aIModel2) {
                                                            z9 = true;
                                                        } else {
                                                            z9 = false;
                                                        }
                                                        boolean z30 = !isGenerating;
                                                        RowScope rowScope5 = rowScope;
                                                        String str2 = str;
                                                        ComposerKt.sourceInformationMarkerStart(composer2, -1296230043, str2);
                                                        Composer composer17 = composer2;
                                                        if (($dirty3 & 112) == 32) {
                                                            z10 = true;
                                                        } else {
                                                            z10 = false;
                                                        }
                                                        boolean z31 = z10;
                                                        Composer $composer5 = $composer4;
                                                        zChanged = z31 | $composer5.changed(aIModel2.ordinal());
                                                        objRememberedValue3 = composer17.rememberedValue();
                                                        if (zChanged) {
                                                            modifier = modifierMaterializeModifier;
                                                        } else {
                                                            modifier = modifierMaterializeModifier;
                                                            if (objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                                                            }
                                                            ComposerKt.sourceInformationMarkerEnd(composer17);
                                                            m7402ModeChip8V94_ZQ(chipLabel, jModelAccent5, z9, z30, (Function0) objRememberedValue3, composer17, 0, 0);
                                                            $composer4 = $composer5;
                                                            str = str2;
                                                            composer2 = composer17;
                                                            entries = iterable5;
                                                            i = i29;
                                                            rowScope = rowScope5;
                                                            modifierMaterializeModifier = modifier;
                                                        }
                                                        objRememberedValue3 = new Function0() { // from class: com.luchime.huiyuan.ui.ChatScreenKt$$ExternalSyntheticLambda11
                                                            @Override // kotlin.jvm.functions.Function0
                                                            public final Object invoke() {
                                                                return ChatScreenKt.Composer$lambda$136$lambda$135$lambda$128$lambda$127$lambda$126$lambda$125(function1, aIModel2);
                                                            }
                                                        };
                                                        composer17.updateRememberedValue(objRememberedValue3);
                                                        ComposerKt.sourceInformationMarkerEnd(composer17);
                                                        m7402ModeChip8V94_ZQ(chipLabel, jModelAccent5, z9, z30, (Function0) objRememberedValue3, composer17, 0, 0);
                                                        $composer4 = $composer5;
                                                        str = str2;
                                                        composer2 = composer17;
                                                        entries = iterable5;
                                                        i = i29;
                                                        rowScope = rowScope5;
                                                        modifierMaterializeModifier = modifier;
                                                    }
                                                    Composer composer18 = composer2;
                                                    $composer2 = $composer4;
                                                    String str3 = str;
                                                    composer18.endReplaceGroup();
                                                    ComposerKt.sourceInformationMarkerEnd(composer18);
                                                    ComposerKt.sourceInformationMarkerEnd($composer3);
                                                    $composer3.endNode();
                                                    ComposerKt.sourceInformationMarkerEnd($composer3);
                                                    ComposerKt.sourceInformationMarkerEnd($composer3);
                                                    ComposerKt.sourceInformationMarkerEnd($composer3);
                                                    Arrangement.Horizontal horizontalM606spacedBy0680j_8 = Arrangement.INSTANCE.m606spacedBy0680j_4(Dp.m6973constructorimpl(8));
                                                    ComposerKt.sourceInformationMarkerStart($composer3, 693286680, "CC(Row)P(2,1,3)99@5124L58,100@5187L130:Row.kt#2w3rfo");
                                                    Modifier modifier2 = Modifier.INSTANCE;
                                                    MeasurePolicy measurePolicyRowMeasurePolicy6 = RowKt.rowMeasurePolicy(horizontalM606spacedBy0680j_8, Alignment.INSTANCE.getTop(), $composer3, ((48 >> 3) & 14) | ((48 >> 3) & 112));
                                                    ComposerKt.sourceInformationMarkerStart($composer3, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                                                    currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash($composer3, 0);
                                                    CompositionLocalMap currentCompositionLocalMap7 = $composer3.getCurrentCompositionLocalMap();
                                                    Modifier modifierMaterializeModifier7 = ComposedModifierKt.materializeModifier($composer3, modifier2);
                                                    constructor2 = ComposeUiNode.INSTANCE.getConstructor();
                                                    int i30 = ((((48 << 3) & 112) << 6) & 896) | 6;
                                                    ComposerKt.sourceInformationMarkerStart($composer3, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
                                                    if (!($composer3.getApplier() instanceof Applier)) {
                                                        ComposablesKt.invalidApplier();
                                                    }
                                                    $composer3.startReusableNode();
                                                    if ($composer3.getInserting()) {
                                                        function9 = constructor2;
                                                        $composer3.createNode(function9);
                                                    } else {
                                                        function9 = constructor2;
                                                        $composer3.useNode();
                                                    }
                                                    composerM3808constructorimpl2 = Updater.m3808constructorimpl($composer3);
                                                    Updater.m3815setimpl(composerM3808constructorimpl2, measurePolicyRowMeasurePolicy6, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                                    Updater.m3815setimpl(composerM3808constructorimpl2, currentCompositionLocalMap7, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                                                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash7 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                                                    if (!composerM3808constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM3808constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                                                        composerM3808constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                                                        composerM3808constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash7);
                                                    }
                                                    Updater.m3815setimpl(composerM3808constructorimpl2, modifierMaterializeModifier7, ComposeUiNode.INSTANCE.getSetModifier());
                                                    int i31 = (i30 >> 6) & 14;
                                                    ComposerKt.sourceInformationMarkerStart($composer3, -407735110, "C101@5232L9:Row.kt#2w3rfo");
                                                    RowScopeInstance rowScopeInstance5 = RowScopeInstance.INSTANCE;
                                                    int i32 = ((48 >> 6) & 112) | 6;
                                                    ComposerKt.sourceInformationMarkerStart($composer3, -1608181215, "C1081@40549L278,1075@40266L125,1074@40224L919,1093@41206L372,1104@41757L249,1110@42123L249,1092@41164L1208:ChatScreen.kt#cyjvf");
                                                    boolean z32 = !isGenerating;
                                                    RoundedCornerShape roundedCornerShapeM1018RoundedCornerShape0680j_17 = RoundedCornerShapeKt.m1018RoundedCornerShape0680j_4(Dp.m6973constructorimpl(11));
                                                    ButtonColors buttonColorsM1936buttonColorsro_MJ812 = ButtonDefaults.INSTANCE.m1936buttonColorsro_MJ88(Color.INSTANCE.m4403getWhite0d7_KjU(), HuiyuanDesignKt.getInk(), ColorKt.Color(4292992206L), HuiyuanDesignKt.getMutedText(), $composer3, (ButtonDefaults.$stable << 12) | 3510, 0);
                                                    PaddingValues paddingValuesM719PaddingValuesYgX7TsA5 = PaddingKt.m719PaddingValuesYgX7TsA(Dp.m6973constructorimpl(13), Dp.m6973constructorimpl(10));
                                                    Modifier modifierM245borderxT4_qwU5 = BorderKt.m245borderxT4_qwU(Modifier.INSTANCE, Dp.m6973constructorimpl(2), HuiyuanDesignKt.getInk(), RoundedCornerShapeKt.m1018RoundedCornerShape0680j_4(Dp.m6973constructorimpl(11)));
                                                    ComposerKt.sourceInformationMarkerStart($composer3, -606066821, str3);
                                                    boolean zChangedInstance14 = $composer2.changedInstance(haptics3);
                                                    if (($dirty3 & 458752) == 131072) {
                                                        z2 = true;
                                                    } else {
                                                        z2 = false;
                                                    }
                                                    z3 = zChangedInstance14 | z2;
                                                    objRememberedValue = $composer3.rememberedValue();
                                                    if (!z3 || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                                        function5 = function3;
                                                        Object obj19 = new Function0() { // from class: com.luchime.huiyuan.ui.ChatScreenKt$$ExternalSyntheticLambda12
                                                            @Override // kotlin.jvm.functions.Function0
                                                            public final Object invoke() {
                                                                return ChatScreenKt.Composer$lambda$136$lambda$135$lambda$134$lambda$130$lambda$129(haptics3, function5);
                                                            }
                                                        };
                                                        $composer3.updateRememberedValue(obj19);
                                                        objRememberedValue = obj19;
                                                    } else {
                                                        function5 = function3;
                                                    }
                                                    ComposerKt.sourceInformationMarkerEnd(
                                                    /*  JADX ERROR: Method code generation error
                                                        jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x1142: INVOKE (r3v57 ?? I:??[OBJECT, ARRAY] A[D('$i$a$-Layout-RowKt$Row$1\92\2466\86' int)]) STATIC call: androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(androidx.compose.runtime.Composer):void A[MD:(androidx.compose.runtime.Composer):void (m)] in method: com.luchime.huiyuan.ui.ChatScreenKt.Composer(com.luchime.huiyuan.ui.AIModel, kotlin.jvm.functions.Function1<? super com.luchime.huiyuan.ui.AIModel, kotlin.Unit>, java.lang.String, kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit>, kotlin.jvm.functions.Function0<kotlin.Unit>, kotlin.jvm.functions.Function0<kotlin.Unit>, boolean, kotlin.jvm.functions.Function0<kotlin.Unit>, boolean, androidx.compose.runtime.Composer, int):void, file: classes5.dex
                                                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:310)
                                                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:273)
                                                        	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:94)
                                                        	at jadx.core.dex.nodes.IBlock.generate(IBlock.java:15)
                                                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                                        	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                                        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                                                        	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:140)
                                                        	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                                                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                                        	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                                        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                                                        	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:140)
                                                        	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                                                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                                        	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                                        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                                                        	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:126)
                                                        	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                                                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                                        	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                                        	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:291)
                                                        	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:275)
                                                        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:420)
                                                        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:345)
                                                        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:299)
                                                        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:184)
                                                        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
                                                        	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                                                        	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
                                                        Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r3v57 ??
                                                        	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:236)
                                                        */
                                                    /*
                                                        Method dump skipped, instruction units count: 4835
                                                        To view this dump change 'Code comments level' option to 'DEBUG'
                                                    */
                                                    throw new UnsupportedOperationException("Method not decompiled: com.luchime.huiyuan.ui.ChatScreenKt.Composer(com.luchime.huiyuan.ui.AIModel, kotlin.jvm.functions.Function1, java.lang.String, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, boolean, kotlin.jvm.functions.Function0, boolean, androidx.compose.runtime.Composer, int):void");
                                                }

                                                static final Unit Composer$lambda$121$lambda$112$lambda$111$lambda$110$lambda$109(Function1 $onModelSelected, AIModel $model) {
                                                    $onModelSelected.invoke($model);
                                                    return Unit.INSTANCE;
                                                }

                                                static final Unit Composer$lambda$121$lambda$115(boolean $isGenerating, AIModel $selectedModel, Composer $composer, int $changed) {
                                                    String str;
                                                    ComposerKt.sourceInformation($composer, "C949@34763L216:ChatScreen.kt#cyjvf");
                                                    if (!$composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
                                                        $composer.skipToGroupEnd();
                                                    } else {
                                                        if (ComposerKt.isTraceInProgress()) {
                                                            ComposerKt.traceEventStart(-1932805377, $changed, -1, "com.luchime.huiyuan.ui.Composer.<anonymous>.<anonymous> (ChatScreen.kt:949)");
                                                        }
                                                        if ($isGenerating) {
                                                            str = "正在生成，可继续输入…";
                                                        } else {
                                                            str = "把问题告诉" + $selectedModel.getShortName() + "…";
                                                        }
                                                        TextKt.m2820Text4IGK_g(str, (Modifier) null, ColorKt.Color(4286675303L), TextUnitKt.getSp(13), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, $composer, 3456, 0, 131058);
                                                        if (ComposerKt.isTraceInProgress()) {
                                                            ComposerKt.traceEventEnd();
                                                        }
                                                    }
                                                    return Unit.INSTANCE;
                                                }

                                                static final Unit Composer$lambda$121$lambda$114$lambda$113(boolean $isGenerating, String $input, AppHaptics $haptics, Function0 $onSend, KeyboardActionScope KeyboardActions) {
                                                    Intrinsics.checkNotNullParameter(KeyboardActions, "$this$KeyboardActions");
                                                    if (!$isGenerating && !StringsKt.isBlank($input)) {
                                                        $haptics.perform(HapticCue.CONFIRM);
                                                        $onSend.invoke();
                                                    }
                                                    return Unit.INSTANCE;
                                                }

                                                static final Unit Composer$lambda$121$lambda$117$lambda$116(AppHaptics $haptics, Function0 $onRandom) {
                                                    $haptics.perform(HapticCue.TAP);
                                                    $onRandom.invoke();
                                                    return Unit.INSTANCE;
                                                }

                                                static final Unit Composer$lambda$121$lambda$119$lambda$118(boolean $isGenerating, AppHaptics $haptics, Function0 $onStopGeneration, Function0 $onSend) {
                                                    if ($isGenerating) {
                                                        $haptics.perform(HapticCue.DESTRUCTIVE);
                                                        $onStopGeneration.invoke();
                                                    } else {
                                                        $haptics.perform(HapticCue.CONFIRM);
                                                        $onSend.invoke();
                                                    }
                                                    return Unit.INSTANCE;
                                                }

                                                static final Unit Composer$lambda$121$lambda$120(boolean $isGenerating, RowScope Button, Composer $composer, int $changed) {
                                                    Intrinsics.checkNotNullParameter(Button, "$this$Button");
                                                    ComposerKt.sourceInformation($composer, "C1011@37523L169:ChatScreen.kt#cyjvf");
                                                    if (!$composer.shouldExecute(($changed & 17) != 16, $changed & 1)) {
                                                        $composer.skipToGroupEnd();
                                                    } else {
                                                        if (ComposerKt.isTraceInProgress()) {
                                                            ComposerKt.traceEventStart(-1698315055, $changed, -1, "com.luchime.huiyuan.ui.Composer.<anonymous>.<anonymous> (ChatScreen.kt:1011)");
                                                        }
                                                        TextKt.m2820Text4IGK_g($isGenerating ? "停止 ■" : "发送 ↑", (Modifier) null, 0L, TextUnitKt.getSp(11), (FontStyle) null, FontWeight.INSTANCE.getBlack(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, $composer, 199680, 0, 131030);
                                                        if (ComposerKt.isTraceInProgress()) {
                                                            ComposerKt.traceEventEnd();
                                                        }
                                                    }
                                                    return Unit.INSTANCE;
                                                }

                                                static final Unit Composer$lambda$136$lambda$124(AIModel $selectedModel, Composer $composer, int $changed) {
                                                    ComposerKt.sourceInformation($composer, "C1032@38238L85:ChatScreen.kt#cyjvf");
                                                    if ($composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
                                                        if (ComposerKt.isTraceInProgress()) {
                                                            ComposerKt.traceEventStart(-1891348156, $changed, -1, "com.luchime.huiyuan.ui.Composer.<anonymous>.<anonymous> (ChatScreen.kt:1032)");
                                                        }
                                                        TextKt.m2820Text4IGK_g("把问题告诉" + $selectedModel.getShortName() + "…", (Modifier) null, ColorKt.Color(4286675303L), TextUnitKt.getSp(14), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, $composer, 3456, 0, 131058);
                                                        if (ComposerKt.isTraceInProgress()) {
                                                            ComposerKt.traceEventEnd();
                                                        }
                                                    } else {
                                                        $composer.skipToGroupEnd();
                                                    }
                                                    return Unit.INSTANCE;
                                                }

                                                static final Unit Composer$lambda$136$lambda$123$lambda$122(boolean $isGenerating, String $input, AppHaptics $haptics, Function0 $onSend, KeyboardActionScope KeyboardActions) {
                                                    Intrinsics.checkNotNullParameter(KeyboardActions, "$this$KeyboardActions");
                                                    if (!$isGenerating && !StringsKt.isBlank($input)) {
                                                        $haptics.perform(HapticCue.CONFIRM);
                                                        $onSend.invoke();
                                                    }
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
                                                    if ($isGenerating) {
                                                        $haptics.perform(HapticCue.DESTRUCTIVE);
                                                        $onStopGeneration.invoke();
                                                    } else {
                                                        $haptics.perform(HapticCue.CONFIRM);
                                                        $onSend.invoke();
                                                    }
                                                    return Unit.INSTANCE;
                                                }

                                                static final Unit Composer$lambda$136$lambda$135$lambda$134$lambda$133(boolean $isGenerating, RowScope Button, Composer $composer, int $changed) {
                                                    Intrinsics.checkNotNullParameter(Button, "$this$Button");
                                                    ComposerKt.sourceInformation($composer, "C1111@42149L201:ChatScreen.kt#cyjvf");
                                                    if (!$composer.shouldExecute(($changed & 17) != 16, $changed & 1)) {
                                                        $composer.skipToGroupEnd();
                                                    } else {
                                                        if (ComposerKt.isTraceInProgress()) {
                                                            ComposerKt.traceEventStart(1555829943, $changed, -1, "com.luchime.huiyuan.ui.Composer.<anonymous>.<anonymous>.<anonymous>.<anonymous> (ChatScreen.kt:1111)");
                                                        }
                                                        TextKt.m2820Text4IGK_g($isGenerating ? "停止 ■" : "发送 ↑", (Modifier) null, 0L, TextUnitKt.getSp(12), (FontStyle) null, FontWeight.INSTANCE.getBlack(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, $composer, 199680, 0, 131030);
                                                        if (ComposerKt.isTraceInProgress()) {
                                                            ComposerKt.traceEventEnd();
                                                        }
                                                    }
                                                    return Unit.INSTANCE;
                                                }

                                                /* JADX INFO: renamed from: ModeChip-8V94_ZQ, reason: not valid java name */
                                                private static final void m7402ModeChip8V94_ZQ(final String text, long color, boolean active, boolean enabled, Function0<Unit> function0, Composer $composer, final int $changed, final int i) {
                                                    String str;
                                                    long j;
                                                    boolean z;
                                                    boolean enabled2;
                                                    Function0<Unit> function1;
                                                    Composer $composer2;
                                                    int $dirty;
                                                    boolean active2;
                                                    final Function0<Unit> function2;
                                                    Composer $composer3 = $composer.startRestartGroup(-699797646);
                                                    ComposerKt.sourceInformation($composer3, "C(ModeChip)P(4,1:c#ui.graphics.Color)1137@42922L334:ChatScreen.kt#cyjvf");
                                                    int $dirty2 = $changed;
                                                    if (($changed & 6) == 0) {
                                                        str = text;
                                                        $dirty2 |= $composer3.changed(str) ? 4 : 2;
                                                    } else {
                                                        str = text;
                                                    }
                                                    if (($changed & 48) == 0) {
                                                        j = color;
                                                        $dirty2 |= $composer3.changed(j) ? 32 : 16;
                                                    } else {
                                                        j = color;
                                                    }
                                                    int i2 = i & 4;
                                                    if (i2 != 0) {
                                                        $dirty2 |= 384;
                                                        z = active;
                                                    } else if (($changed & 384) == 0) {
                                                        z = active;
                                                        $dirty2 |= $composer3.changed(z) ? 256 : 128;
                                                    } else {
                                                        z = active;
                                                    }
                                                    int i3 = i & 8;
                                                    if (i3 != 0) {
                                                        $dirty2 |= 3072;
                                                        enabled2 = enabled;
                                                    } else if (($changed & 3072) == 0) {
                                                        enabled2 = enabled;
                                                        $dirty2 |= $composer3.changed(enabled2) ? 2048 : 1024;
                                                    } else {
                                                        enabled2 = enabled;
                                                    }
                                                    int i4 = i & 16;
                                                    if (i4 != 0) {
                                                        $dirty2 |= 24576;
                                                        function1 = function0;
                                                    } else if (($changed & 24576) == 0) {
                                                        function1 = function0;
                                                        $dirty2 |= $composer3.changedInstance(function1) ? 16384 : 8192;
                                                    } else {
                                                        function1 = function0;
                                                    }
                                                    if ($composer3.shouldExecute(($dirty2 & 9363) != 9362, $dirty2 & 1)) {
                                                        active2 = i2 != 0 ? true : z;
                                                        boolean enabled3 = i3 != 0 ? true : enabled2;
                                                        Function0<Unit> function3 = i4 != 0 ? null : function1;
                                                        if (ComposerKt.isTraceInProgress()) {
                                                            ComposerKt.traceEventStart(-699797646, $dirty2, -1, "com.luchime.huiyuan.ui.ModeChip (ChatScreen.kt:1130)");
                                                        }
                                                        Modifier chipModifier = BorderKt.m245borderxT4_qwU(BackgroundKt.m233backgroundbw27NRU(Modifier.INSTANCE, active2 ? j : Color.INSTANCE.m4403getWhite0d7_KjU(), RoundedCornerShapeKt.RoundedCornerShape(50)), active2 ? Dp.m6973constructorimpl(2) : Dp.m6973constructorimpl((float) 1.5d), HuiyuanDesignKt.getInk(), RoundedCornerShapeKt.RoundedCornerShape(50));
                                                        Modifier chipModifier2 = (!enabled3 || function3 == null) ? chipModifier : AppHapticsKt.hapticClickable$default(chipModifier, false, HapticCue.SELECTION, function3, 1, null);
                                                        long ink = HuiyuanDesignKt.getInk();
                                                        long sp = TextUnitKt.getSp(11);
                                                        FontWeight black = FontWeight.INSTANCE.getBlack();
                                                        Modifier.Companion companionAlpha = Modifier.INSTANCE;
                                                        Function0<Unit> function4 = function3;
                                                        if (!enabled3) {
                                                            companionAlpha = AlphaKt.alpha(companionAlpha, 0.48f);
                                                        }
                                                        $composer2 = $composer3;
                                                        $dirty = $dirty2;
                                                        TextKt.m2820Text4IGK_g(str, PaddingKt.m726paddingVpY3zN4(chipModifier2.then(companionAlpha), Dp.m6973constructorimpl(8), Dp.m6973constructorimpl(6)), ink, sp, (FontStyle) null, black, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, TextOverflow.INSTANCE.m6886getClipgIe3tQ8(), false, 1, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, $composer2, ($dirty & 14) | 200064, 3120, 120784);
                                                        if (ComposerKt.isTraceInProgress()) {
                                                            ComposerKt.traceEventEnd();
                                                        }
                                                        enabled2 = enabled3;
                                                        function2 = function4;
                                                    } else {
                                                        $composer2 = $composer3;
                                                        $dirty = $dirty2;
                                                        $composer2.skipToGroupEnd();
                                                        active2 = z;
                                                        function2 = function1;
                                                    }
                                                    ScopeUpdateScope scopeUpdateScopeEndRestartGroup = $composer2.endRestartGroup();
                                                    if (scopeUpdateScopeEndRestartGroup != null) {
                                                        final long j2 = j;
                                                        final boolean active3 = active2;
                                                        final boolean active4 = enabled2;
                                                        scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.luchime.huiyuan.ui.ChatScreenKt$$ExternalSyntheticLambda52
                                                            @Override // kotlin.jvm.functions.Function2
                                                            public final Object invoke(Object obj, Object obj2) {
                                                                return ChatScreenKt.ModeChip_8V94_ZQ$lambda$138(text, j2, active3, active4, function2, $changed, i, (Composer) obj, ((Integer) obj2).intValue());
                                                            }
                                                        });
                                                    }
                                                }
                                            }
