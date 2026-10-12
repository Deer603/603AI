package com.luchime.huiyuan.ui;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.BorderKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.OffsetKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextOverflow;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.TextUnitKt;
import androidx.profileinstaller.ProfileVerifier;
import androidx.webkit.internal.AssetHelper;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: HuiyuanDesign.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000J\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001c\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\u001aA\u0010\u001d\u001a\u00020\u001e2\b\b\u0002\u0010\u001f\u001a\u00020 2\b\b\u0002\u0010!\u001a\u00020\u00012\u001c\u0010\"\u001a\u0018\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020\u001e0#¢\u0006\u0002\b%¢\u0006\u0002\b&H\u0001¢\u0006\u0004\b'\u0010(\u001a)\u0010)\u001a\u00020\u001e2\u0006\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020\u00012\b\b\u0002\u0010\u001f\u001a\u00020 H\u0001¢\u0006\u0004\b-\u0010.\u001a!\u0010/\u001a\u00020\u001e2\u0006\u00100\u001a\u00020+2\b\b\u0002\u0010,\u001a\u00020\u0001H\u0001¢\u0006\u0004\b1\u00102\u001aP\u00103\u001a\u00020\u001e2\u0006\u00104\u001a\u00020+2\u0006\u00105\u001a\u00020+2\u0006\u00106\u001a\u00020+2\u0006\u00107\u001a\u00020\u00012\b\b\u0002\u00108\u001a\u0002092\u0015\b\u0002\u0010:\u001a\u000f\u0012\u0004\u0012\u00020\u001e\u0018\u00010;¢\u0006\u0002\b%H\u0001¢\u0006\u0004\b<\u0010=\u001a\u0018\u0010>\u001a\u00020\u001e2\u0006\u0010?\u001a\u00020@2\u0006\u0010*\u001a\u00020+H\u0000\u001a \u0010A\u001a\u00020\u001e2\u0006\u0010?\u001a\u00020@2\u0006\u00105\u001a\u00020+2\u0006\u0010*\u001a\u00020+H\u0000\"\u0016\u0010\u0000\u001a\u00020\u0001X\u0080\u0004¢\u0006\n\n\u0002\u0010\u0004\u001a\u0004\b\u0002\u0010\u0003\"\u0016\u0010\u0005\u001a\u00020\u0001X\u0080\u0004¢\u0006\n\n\u0002\u0010\u0004\u001a\u0004\b\u0006\u0010\u0003\"\u0016\u0010\u0007\u001a\u00020\u0001X\u0080\u0004¢\u0006\n\n\u0002\u0010\u0004\u001a\u0004\b\b\u0010\u0003\"\u0016\u0010\t\u001a\u00020\u0001X\u0080\u0004¢\u0006\n\n\u0002\u0010\u0004\u001a\u0004\b\n\u0010\u0003\"\u0016\u0010\u000b\u001a\u00020\u0001X\u0080\u0004¢\u0006\n\n\u0002\u0010\u0004\u001a\u0004\b\f\u0010\u0003\"\u0016\u0010\r\u001a\u00020\u0001X\u0080\u0004¢\u0006\n\n\u0002\u0010\u0004\u001a\u0004\b\u000e\u0010\u0003\"\u0016\u0010\u000f\u001a\u00020\u0001X\u0080\u0004¢\u0006\n\n\u0002\u0010\u0004\u001a\u0004\b\u0010\u0010\u0003\"\u0016\u0010\u0011\u001a\u00020\u0001X\u0080\u0004¢\u0006\n\n\u0002\u0010\u0004\u001a\u0004\b\u0012\u0010\u0003\"\u0016\u0010\u0013\u001a\u00020\u0001X\u0080\u0004¢\u0006\n\n\u0002\u0010\u0004\u001a\u0004\b\u0014\u0010\u0003\"\u0016\u0010\u0015\u001a\u00020\u0001X\u0080\u0004¢\u0006\n\n\u0002\u0010\u0004\u001a\u0004\b\u0016\u0010\u0003\"\u0016\u0010\u0017\u001a\u00020\u0001X\u0080\u0004¢\u0006\n\n\u0002\u0010\u0004\u001a\u0004\b\u0018\u0010\u0003\"\u0016\u0010\u0019\u001a\u00020\u0001X\u0080\u0004¢\u0006\n\n\u0002\u0010\u0004\u001a\u0004\b\u001a\u0010\u0003\"\u0016\u0010\u001b\u001a\u00020\u0001X\u0080\u0004¢\u0006\n\n\u0002\u0010\u0004\u001a\u0004\b\u001c\u0010\u0003¨\u0006B"}, d2 = {"Ink", "Landroidx/compose/ui/graphics/Color;", "getInk", "()J", "J", "Paper", "getPaper", "Cream", "getCream", "SignalYellow", "getSignalYellow", "SignalRed", "getSignalRed", "SignalGreen", "getSignalGreen", "SignalBlue", "getSignalBlue", "SignalPurple", "getSignalPurple", "SignalPink", "getSignalPink", "SignalOrange", "getSignalOrange", "Terminal", "getTerminal", "TerminalText", "getTerminalText", "MutedText", "getMutedText", "RetroCard", "", "modifier", "Landroidx/compose/ui/Modifier;", "background", "content", "Lkotlin/Function1;", "Landroidx/compose/foundation/layout/BoxScope;", "Landroidx/compose/runtime/Composable;", "Lkotlin/ExtensionFunctionType;", "RetroCard-3IgeMak", "(Landroidx/compose/ui/Modifier;JLkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "Avatar", "text", "", "color", "Avatar-3IgeMak", "(Ljava/lang/String;JLandroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "CategoryBadge", "category", "CategoryBadge-iJQMabo", "(Ljava/lang/String;JLandroidx/compose/runtime/Composer;II)V", "ScreenHeader", "eyebrow", "title", "subtitle", "accent", "compact", "", "trailing", "Lkotlin/Function0;", "ScreenHeader-fWhpE4E", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JZLkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "copyText", "context", "Landroid/content/Context;", "shareText", "app"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class HuiyuanDesignKt {
    private static final long Ink = ColorKt.Color(4279768851L);
    private static final long Paper = ColorKt.Color(4294965480L);
    private static final long Cream = ColorKt.Color(4294962881L);
    private static final long SignalYellow = ColorKt.Color(4294957857L);
    private static final long SignalRed = ColorKt.Color(4294920007L);
    private static final long SignalGreen = ColorKt.Color(4281784698L);
    private static final long SignalBlue = ColorKt.Color(4282354943L);
    private static final long SignalPurple = ColorKt.Color(4289226239L);
    private static final long SignalPink = ColorKt.Color(4294926765L);
    private static final long SignalOrange = ColorKt.Color(4294932992L);
    private static final long Terminal = ColorKt.Color(4279114518L);
    private static final long TerminalText = ColorKt.Color(4285333406L);
    private static final long MutedText = ColorKt.Color(4285886048L);

    static final Unit Avatar_3IgeMak$lambda$3(String str, long j, Modifier modifier, int i, int i2, Composer composer, int i3) {
        m7412Avatar3IgeMak(str, j, modifier, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    static final Unit CategoryBadge_iJQMabo$lambda$4(String str, long j, int i, int i2, Composer composer, int i3) {
        m7413CategoryBadgeiJQMabo(str, j, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    static final Unit RetroCard_3IgeMak$lambda$1(Modifier modifier, long j, Function3 function3, int i, int i2, Composer composer, int i3) {
        m7414RetroCard3IgeMak(modifier, j, function3, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    static final Unit ScreenHeader_fWhpE4E$lambda$7(String str, String str2, String str3, long j, boolean z, Function2 function2, int i, int i2, Composer composer, int i3) {
        m7415ScreenHeaderfWhpE4E(str, str2, str3, j, z, function2, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    public static final long getInk() {
        return Ink;
    }

    public static final long getPaper() {
        return Paper;
    }

    public static final long getCream() {
        return Cream;
    }

    public static final long getSignalYellow() {
        return SignalYellow;
    }

    public static final long getSignalRed() {
        return SignalRed;
    }

    public static final long getSignalGreen() {
        return SignalGreen;
    }

    public static final long getSignalBlue() {
        return SignalBlue;
    }

    public static final long getSignalPurple() {
        return SignalPurple;
    }

    public static final long getSignalPink() {
        return SignalPink;
    }

    public static final long getSignalOrange() {
        return SignalOrange;
    }

    public static final long getTerminal() {
        return Terminal;
    }

    public static final long getTerminalText() {
        return TerminalText;
    }

    public static final long getMutedText() {
        return MutedText;
    }

    /* JADX WARN: Code duplicated, block: B:78:0x035f  */
    /* JADX INFO: renamed from: RetroCard-3IgeMak, reason: not valid java name */
    public static final void m7414RetroCard3IgeMak(Modifier modifier, long background, final Function3<? super BoxScope, ? super Composer, ? super Integer, Unit> content, Composer $composer, final int $changed, final int i) {
        Modifier modifier2;
        long j;
        Composer $composer2;
        final Modifier modifier3;
        final long background2;
        Modifier modifier4;
        long background3;
        Function0<ComposeUiNode> function0;
        Function0<ComposeUiNode> function1;
        Composer composer;
        Intrinsics.checkNotNullParameter(content, "content");
        Composer $composer3 = $composer.startRestartGroup(-38861452);
        ComposerKt.sourceInformation($composer3, "C(RetroCard)P(2,0:c#ui.graphics.Color)52@2028L531:HuiyuanDesign.kt#cyjvf");
        int $dirty = $changed;
        int i2 = i & 1;
        if (i2 != 0) {
            $dirty |= 6;
            modifier2 = modifier;
        } else if (($changed & 6) == 0) {
            modifier2 = modifier;
            $dirty |= $composer3.changed(modifier2) ? 4 : 2;
        } else {
            modifier2 = modifier;
        }
        int i3 = i & 2;
        if (i3 != 0) {
            $dirty |= 48;
            j = background;
        } else if (($changed & 48) == 0) {
            j = background;
            $dirty |= $composer3.changed(j) ? 32 : 16;
        } else {
            j = background;
        }
        if (($changed & 384) == 0) {
            $dirty |= $composer3.changedInstance(content) ? 256 : 128;
        }
        int $dirty2 = $dirty;
        if (!$composer3.shouldExecute(($dirty2 & 147) != 146, $dirty2 & 1)) {
            $composer2 = $composer3;
            $composer2.skipToGroupEnd();
            modifier3 = modifier2;
            background2 = j;
        } else {
            if (i2 != 0) {
                modifier4 = Modifier.INSTANCE;
            } else {
                modifier4 = modifier2;
            }
            if (i3 == 0) {
                background3 = j;
            } else {
                background3 = Color.INSTANCE.m4403getWhite0d7_KjU();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-38861452, $dirty2, -1, "com.luchime.huiyuan.ui.RetroCard (HuiyuanDesign.kt:51)");
            }
            Modifier modifierM729paddingqDBjuR0$default = PaddingKt.m729paddingqDBjuR0$default(modifier4, 0.0f, 0.0f, Dp.m6973constructorimpl(4), Dp.m6973constructorimpl(4), 3, null);
            ComposerKt.sourceInformationMarkerStart($composer3, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
            ComposerKt.sourceInformationMarkerStart($composer3, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash($composer3, 0);
            CompositionLocalMap currentCompositionLocalMap = $composer3.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier($composer3, modifierM729paddingqDBjuR0$default);
            Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
            int i4 = ((((0 << 3) & 112) << 6) & 896) | 6;
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
            Updater.m3815setimpl(composerM3808constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m3815setimpl(composerM3808constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (composerM3808constructorimpl.getInserting() || !Intrinsics.areEqual(composerM3808constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM3808constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM3808constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m3815setimpl(composerM3808constructorimpl, modifierMaterializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
            int i5 = (i4 >> 6) & 14;
            ComposerKt.sourceInformationMarkerStart($composer3, -2146730711, "C72@3468L9:Box.kt#2w3rfo");
            int i6 = ((0 >> 6) & 112) | 6;
            BoxScope boxScope = BoxScopeInstance.INSTANCE;
            ComposerKt.sourceInformationMarkerStart($composer3, -1641306898, "C53@2098L177,59@2284L269:HuiyuanDesign.kt#cyjvf");
            BoxKt.Box(BackgroundKt.m233backgroundbw27NRU(OffsetKt.m684offsetVpY3zN4(boxScope.matchParentSize(Modifier.INSTANCE), Dp.m6973constructorimpl(4), Dp.m6973constructorimpl(4)), Ink, RoundedCornerShapeKt.m1018RoundedCornerShape0680j_4(Dp.m6973constructorimpl(14))), $composer3, 0);
            long background4 = background3;
            Modifier modifierM726paddingVpY3zN4 = PaddingKt.m726paddingVpY3zN4(BorderKt.m245borderxT4_qwU(BackgroundKt.m233backgroundbw27NRU(Modifier.INSTANCE, background3, RoundedCornerShapeKt.m1018RoundedCornerShape0680j_4(Dp.m6973constructorimpl(14))), Dp.m6973constructorimpl(2), Ink, RoundedCornerShapeKt.m1018RoundedCornerShape0680j_4(Dp.m6973constructorimpl(14))), Dp.m6973constructorimpl(13), Dp.m6973constructorimpl(11));
            int i7 = ($dirty2 << 3) & 7168;
            ComposerKt.sourceInformationMarkerStart($composer3, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
            int i8 = (i7 << 3) & 112;
            ComposerKt.sourceInformationMarkerStart($composer3, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
            int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash($composer3, 0);
            CompositionLocalMap currentCompositionLocalMap2 = $composer3.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier($composer3, modifierM726paddingVpY3zN4);
            Function0<ComposeUiNode> constructor2 = ComposeUiNode.INSTANCE.getConstructor();
            int i9 = ((i8 << 6) & 896) | 6;
            ComposerKt.sourceInformationMarkerStart($composer3, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
            if (!($composer3.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            $composer3.startReusableNode();
            if ($composer3.getInserting()) {
                function1 = constructor2;
                $composer3.createNode(function1);
            } else {
                function1 = constructor2;
                $composer3.useNode();
            }
            Composer composerM3808constructorimpl2 = Updater.m3808constructorimpl($composer3);
            Updater.m3815setimpl(composerM3808constructorimpl2, measurePolicyMaybeCachedBoxMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m3815setimpl(composerM3808constructorimpl2, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (composerM3808constructorimpl2.getInserting()) {
                composer = $composer3;
            } else {
                composer = $composer3;
                if (!Intrinsics.areEqual(composerM3808constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                }
                Updater.m3815setimpl(composerM3808constructorimpl2, modifierMaterializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
                int i10 = (i9 >> 6) & 14;
                Composer composer2 = composer;
                ComposerKt.sourceInformationMarkerStart(composer2, -2146730711, "C72@3468L9:Box.kt#2w3rfo");
                content.invoke(BoxScopeInstance.INSTANCE, composer2, Integer.valueOf(((i7 >> 6) & 112) | 6));
                ComposerKt.sourceInformationMarkerEnd(composer2);
                composer.endNode();
                ComposerKt.sourceInformationMarkerEnd(composer);
                ComposerKt.sourceInformationMarkerEnd(composer);
                ComposerKt.sourceInformationMarkerEnd(composer);
                ComposerKt.sourceInformationMarkerEnd($composer3);
                ComposerKt.sourceInformationMarkerEnd($composer3);
                $composer3.endNode();
                ComposerKt.sourceInformationMarkerEnd($composer3);
                ComposerKt.sourceInformationMarkerEnd($composer3);
                ComposerKt.sourceInformationMarkerEnd($composer3);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = modifier4;
                background2 = background4;
            }
            composerM3808constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
            composerM3808constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
            Updater.m3815setimpl(composerM3808constructorimpl2, modifierMaterializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
            int i11 = (i9 >> 6) & 14;
            Composer composer3 = composer;
            ComposerKt.sourceInformationMarkerStart(composer3, -2146730711, "C72@3468L9:Box.kt#2w3rfo");
            content.invoke(BoxScopeInstance.INSTANCE, composer3, Integer.valueOf(((i7 >> 6) & 112) | 6));
            ComposerKt.sourceInformationMarkerEnd(composer3);
            composer.endNode();
            ComposerKt.sourceInformationMarkerEnd(composer);
            ComposerKt.sourceInformationMarkerEnd(composer);
            ComposerKt.sourceInformationMarkerEnd(composer);
            ComposerKt.sourceInformationMarkerEnd($composer3);
            ComposerKt.sourceInformationMarkerEnd($composer3);
            $composer3.endNode();
            ComposerKt.sourceInformationMarkerEnd($composer3);
            ComposerKt.sourceInformationMarkerEnd($composer3);
            ComposerKt.sourceInformationMarkerEnd($composer3);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier3 = modifier4;
            background2 = background4;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = $composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.luchime.huiyuan.ui.HuiyuanDesignKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return HuiyuanDesignKt.RetroCard_3IgeMak$lambda$1(modifier3, background2, content, $changed, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: renamed from: Avatar-3IgeMak, reason: not valid java name */
    public static final void m7412Avatar3IgeMak(final String text, final long color, Modifier modifier, Composer $composer, final int $changed, final int i) {
        Modifier modifier2;
        Composer $composer2;
        final Modifier modifier3;
        Modifier.Companion modifier4;
        Intrinsics.checkNotNullParameter(text, "text");
        Composer $composer3 = $composer.startRestartGroup(-223064296);
        ComposerKt.sourceInformation($composer3, "C(Avatar)P(2,0:c#ui.graphics.Color)75@2674L285:HuiyuanDesign.kt#cyjvf");
        int $dirty = $changed;
        if (($changed & 6) == 0) {
            $dirty |= $composer3.changed(text) ? 4 : 2;
        }
        if (($changed & 48) == 0) {
            $dirty |= $composer3.changed(color) ? 32 : 16;
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
        if (!$composer3.shouldExecute(($dirty & 147) != 146, $dirty & 1)) {
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
                ComposerKt.traceEventStart(-223064296, $dirty, -1, "com.luchime.huiyuan.ui.Avatar (HuiyuanDesign.kt:74)");
            }
            Modifier modifierM245borderxT4_qwU = BorderKt.m245borderxT4_qwU(BackgroundKt.m233backgroundbw27NRU(SizeKt.m772size3ABfNKs(modifier4, Dp.m6973constructorimpl(34)), color, RoundedCornerShapeKt.getCircleShape()), Dp.m6973constructorimpl(2), Ink, RoundedCornerShapeKt.getCircleShape());
            Alignment center = Alignment.INSTANCE.getCenter();
            ComposerKt.sourceInformationMarkerStart($composer3, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(center, false);
            ComposerKt.sourceInformationMarkerStart($composer3, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash($composer3, 0);
            CompositionLocalMap currentCompositionLocalMap = $composer3.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier($composer3, modifierM245borderxT4_qwU);
            Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
            int i3 = ((((48 << 3) & 112) << 6) & 896) | 6;
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
            Composer composerM3808constructorimpl = Updater.m3808constructorimpl($composer3);
            Updater.m3815setimpl(composerM3808constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m3815setimpl(composerM3808constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (composerM3808constructorimpl.getInserting() || !Intrinsics.areEqual(composerM3808constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM3808constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM3808constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m3815setimpl(composerM3808constructorimpl, modifierMaterializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
            int i4 = (i3 >> 6) & 14;
            ComposerKt.sourceInformationMarkerStart($composer3, -2146730711, "C72@3468L9:Box.kt#2w3rfo");
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            int i5 = ((48 >> 6) & 112) | 6;
            ComposerKt.sourceInformationMarkerStart($composer3, -1759582615, "C82@2881L72:HuiyuanDesign.kt#cyjvf");
            $composer2 = $composer3;
            Modifier modifier5 = modifier4;
            TextKt.m2820Text4IGK_g(text, (Modifier) null, Ink, TextUnitKt.getSp(15), (FontStyle) null, FontWeight.INSTANCE.getBlack(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, $composer3, ($dirty & 14) | 200064, 0, 131026);
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
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.luchime.huiyuan.ui.HuiyuanDesignKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return HuiyuanDesignKt.Avatar_3IgeMak$lambda$3(text, color, modifier3, $changed, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: renamed from: CategoryBadge-iJQMabo, reason: not valid java name */
    public static final void m7413CategoryBadgeiJQMabo(final String category, long color, Composer $composer, final int $changed, final int i) {
        long j;
        Composer $composer2;
        final long color2;
        Intrinsics.checkNotNullParameter(category, "category");
        Composer $composer3 = $composer.startRestartGroup(564458199);
        ComposerKt.sourceInformation($composer3, "C(CategoryBadge)P(!,1:c#ui.graphics.Color)88@3053L391:HuiyuanDesign.kt#cyjvf");
        int $dirty = $changed;
        if (($changed & 6) == 0) {
            $dirty |= $composer3.changed(category) ? 4 : 2;
        }
        int i2 = i & 2;
        if (i2 != 0) {
            $dirty |= 48;
            j = color;
        } else if (($changed & 48) == 0) {
            j = color;
            $dirty |= $composer3.changed(j) ? 32 : 16;
        } else {
            j = color;
        }
        if ($composer3.shouldExecute(($dirty & 19) != 18, $dirty & 1)) {
            long color3 = i2 != 0 ? SignalPink : j;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(564458199, $dirty, -1, "com.luchime.huiyuan.ui.CategoryBadge (HuiyuanDesign.kt:87)");
            }
            $composer2 = $composer3;
            long color4 = color3;
            TextKt.m2820Text4IGK_g(category, PaddingKt.m726paddingVpY3zN4(BorderKt.m245borderxT4_qwU(BackgroundKt.m233backgroundbw27NRU(Modifier.INSTANCE, color3, RoundedCornerShapeKt.m1018RoundedCornerShape0680j_4(Dp.m6973constructorimpl(5))), Dp.m6973constructorimpl((float) 1.5d), Ink, RoundedCornerShapeKt.m1018RoundedCornerShape0680j_4(Dp.m6973constructorimpl(5))), Dp.m6973constructorimpl(7), Dp.m6973constructorimpl(3)), (Color.m4367equalsimpl0(color3, SignalYellow) || Color.m4367equalsimpl0(color3, SignalGreen)) ? Ink : Color.INSTANCE.m4403getWhite0d7_KjU(), TextUnitKt.getSp(10), (FontStyle) null, FontWeight.INSTANCE.getBlack(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, $composer2, ($dirty & 14) | 199680, 0, 131024);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            color2 = color4;
        } else {
            $composer2 = $composer3;
            $composer2.skipToGroupEnd();
            color2 = j;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = $composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.luchime.huiyuan.ui.HuiyuanDesignKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return HuiyuanDesignKt.CategoryBadge_iJQMabo$lambda$4(category, color2, $changed, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX WARN: Code duplicated, block: B:103:0x0356  */
    /* JADX WARN: Code duplicated, block: B:104:0x035d  */
    /* JADX WARN: Code duplicated, block: B:107:0x03a1  */
    /* JADX WARN: Code duplicated, block: B:108:0x03ac  */
    /* JADX WARN: Code duplicated, block: B:111:0x03c2  */
    /* JADX WARN: Code duplicated, block: B:112:0x03c5  */
    /* JADX WARN: Code duplicated, block: B:115:0x03cd  */
    /* JADX WARN: Code duplicated, block: B:116:0x03d0  */
    /* JADX WARN: Code duplicated, block: B:119:0x045b  */
    /* JADX WARN: Code duplicated, block: B:120:0x0463  */
    /* JADX WARN: Code duplicated, block: B:123:0x0476  */
    /* JADX WARN: Code duplicated, block: B:124:0x047b  */
    /* JADX WARN: Code duplicated, block: B:127:0x0484  */
    /* JADX WARN: Code duplicated, block: B:128:0x0487  */
    /* JADX WARN: Code duplicated, block: B:131:0x0490  */
    /* JADX WARN: Code duplicated, block: B:132:0x0493  */
    /* JADX WARN: Code duplicated, block: B:135:0x04e0  */
    /* JADX WARN: Code duplicated, block: B:136:0x050d  */
    /* JADX WARN: Code duplicated, block: B:139:0x0535  */
    /* JADX INFO: renamed from: ScreenHeader-fWhpE4E, reason: not valid java name */
    public static final void m7415ScreenHeaderfWhpE4E(final String eyebrow, final String title, final String subtitle, final long accent, boolean compact, Function2<? super Composer, ? super Integer, Unit> function2, Composer $composer, final int $changed, final int i) {
        long j;
        boolean z;
        Function2<? super Composer, ? super Integer, Unit> function3;
        Composer $composer2;
        final boolean compact2;
        final Function2<? super Composer, ? super Integer, Unit> function4;
        MeasurePolicy measurePolicy;
        long sp;
        float fM6973constructorimpl;
        int i2;
        int i3;
        Function2<? super Composer, ? super Integer, Unit> function5;
        int $dirty;
        float fM6973constructorimpl2;
        long sp2;
        int i4;
        int i5;
        Intrinsics.checkNotNullParameter(eyebrow, "eyebrow");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        Composer $composer3 = $composer.startRestartGroup(-1505532958);
        ComposerKt.sourceInformation($composer3, "C(ScreenHeader)P(2,4,3,0:c#ui.graphics.Color)109@3653L1454:HuiyuanDesign.kt#cyjvf");
        int $dirty2 = $changed;
        if (($changed & 6) == 0) {
            $dirty2 |= $composer3.changed(eyebrow) ? 4 : 2;
        }
        if (($changed & 48) == 0) {
            $dirty2 |= $composer3.changed(title) ? 32 : 16;
        }
        if (($changed & 384) == 0) {
            $dirty2 |= $composer3.changed(subtitle) ? 256 : 128;
        }
        if (($changed & 3072) == 0) {
            j = accent;
            $dirty2 |= $composer3.changed(j) ? 2048 : 1024;
        } else {
            j = accent;
        }
        int i6 = i & 16;
        if (i6 != 0) {
            $dirty2 |= 24576;
            z = compact;
        } else if (($changed & 24576) == 0) {
            z = compact;
            $dirty2 |= $composer3.changed(z) ? 16384 : 8192;
        } else {
            z = compact;
        }
        int i7 = i & 32;
        if (i7 != 0) {
            $dirty2 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
            function3 = function2;
        } else if ((196608 & $changed) == 0) {
            function3 = function2;
            $dirty2 |= $composer3.changedInstance(function3) ? 131072 : 65536;
        } else {
            function3 = function2;
        }
        if ($composer3.shouldExecute((74899 & $dirty2) != 74898, $dirty2 & 1)) {
            boolean compact3 = i6 != 0 ? false : z;
            Function2<? super Composer, ? super Integer, Unit> function6 = i7 != 0 ? null : function3;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1505532958, $dirty2, -1, "com.luchime.huiyuan.ui.ScreenHeader (HuiyuanDesign.kt:108)");
            }
            Modifier modifierM726paddingVpY3zN4 = PaddingKt.m726paddingVpY3zN4(BorderKt.m246borderxT4_qwU$default(BackgroundKt.m234backgroundbw27NRU$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), j, null, 2, null), Dp.m6973constructorimpl(2), Ink, null, 4, null), Dp.m6973constructorimpl(18), compact3 ? Dp.m6973constructorimpl(9) : Dp.m6973constructorimpl(16));
            Arrangement.Horizontal spaceBetween = Arrangement.INSTANCE.getSpaceBetween();
            Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
            ComposerKt.sourceInformationMarkerStart($composer3, 693286680, "CC(Row)P(2,1,3)99@5124L58,100@5187L130:Row.kt#2w3rfo");
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(spaceBetween, centerVertically, $composer3, ((432 >> 3) & 14) | ((432 >> 3) & 112));
            ComposerKt.sourceInformationMarkerStart($composer3, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash($composer3, 0);
            CompositionLocalMap currentCompositionLocalMap = $composer3.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier($composer3, modifierM726paddingVpY3zN4);
            Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
            int i8 = ((((432 << 3) & 112) << 6) & 896) | 6;
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
            Composer composerM3808constructorimpl = Updater.m3808constructorimpl($composer3);
            Updater.m3815setimpl(composerM3808constructorimpl, measurePolicyRowMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m3815setimpl(composerM3808constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (composerM3808constructorimpl.getInserting() || !Intrinsics.areEqual(composerM3808constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM3808constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM3808constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m3815setimpl(composerM3808constructorimpl, modifierMaterializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
            int i9 = (i8 >> 6) & 14;
            ComposerKt.sourceInformationMarkerStart($composer3, -407735110, "C101@5232L9:Row.kt#2w3rfo");
            int i10 = ((432 >> 6) & 112) | 6;
            RowScope rowScope = RowScopeInstance.INSTANCE;
            ComposerKt.sourceInformationMarkerStart($composer3, -2098973339, "C118@3989L1006:HuiyuanDesign.kt#cyjvf");
            Modifier modifierWeight$default = RowScope.weight$default(rowScope, Modifier.INSTANCE, 1.0f, false, 2, null);
            ComposerKt.sourceInformationMarkerStart($composer3, -483455358, "CC(Column)P(2,3,1)87@4442L61,88@4508L133:Column.kt#2w3rfo");
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), $composer3, ((0 >> 3) & 14) | ((0 >> 3) & 112));
            ComposerKt.sourceInformationMarkerStart($composer3, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
            int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash($composer3, 0);
            CompositionLocalMap currentCompositionLocalMap2 = $composer3.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier($composer3, modifierWeight$default);
            Function0<ComposeUiNode> constructor2 = ComposeUiNode.INSTANCE.getConstructor();
            int i11 = ((((0 << 3) & 112) << 6) & 896) | 6;
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
            Updater.m3815setimpl(composerM3808constructorimpl2, measurePolicyColumnMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m3815setimpl(composerM3808constructorimpl2, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (composerM3808constructorimpl2.getInserting()) {
                measurePolicy = measurePolicyColumnMeasurePolicy;
            } else {
                measurePolicy = measurePolicyColumnMeasurePolicy;
                if (!Intrinsics.areEqual(composerM3808constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                }
                Updater.m3815setimpl(composerM3808constructorimpl2, modifierMaterializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
                int i12 = (i11 >> 6) & 14;
                ComposerKt.sourceInformationMarkerStart($composer3, -384672921, "C89@4556L9:Column.kt#2w3rfo");
                ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                int i13 = ((0 >> 6) & 112) | 6;
                ComposerKt.sourceInformationMarkerStart($composer3, 252902584, "C119@4042L235,126@4290L52,127@4355L242,134@4610L52,135@4675L310:HuiyuanDesign.kt#cyjvf");
                String upperCase = eyebrow.toUpperCase(Locale.ROOT);
                Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
                long j2 = Ink;
                if (compact3) {
                    sp = TextUnitKt.getSp(8);
                } else {
                    sp = TextUnitKt.getSp(10);
                }
                TextKt.m2820Text4IGK_g(upperCase, (Modifier) null, j2, sp, (FontStyle) null, FontWeight.INSTANCE.getBlack(), (FontFamily) null, TextUnitKt.getSp(1.4d), (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, $composer3, 12779904, 0, 130898);
                Modifier.Companion companion = Modifier.INSTANCE;
                if (compact3) {
                    fM6973constructorimpl = Dp.m6973constructorimpl(1);
                } else {
                    fM6973constructorimpl = Dp.m6973constructorimpl(3);
                }
                SpacerKt.Spacer(SizeKt.m758height3ABfNKs(companion, fM6973constructorimpl), $composer3, 0);
                long j3 = Ink;
                if (compact3) {
                    i2 = 21;
                } else {
                    i2 = 28;
                }
                long sp3 = TextUnitKt.getSp(i2);
                if (compact3) {
                    i3 = 23;
                } else {
                    i3 = 31;
                }
                function5 = function6;
                $dirty = $dirty2;
                $composer2 = $composer3;
                TextKt.m2820Text4IGK_g(title, (Modifier) null, j3, sp3, (FontStyle) null, FontWeight.INSTANCE.getBlack(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, TextUnitKt.getSp(i3), 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, $composer3, (($dirty2 >> 3) & 14) | 196992, 0, 130002);
                Modifier.Companion companion2 = Modifier.INSTANCE;
                if (compact3) {
                    fM6973constructorimpl2 = Dp.m6973constructorimpl(2);
                } else {
                    fM6973constructorimpl2 = Dp.m6973constructorimpl(4);
                }
                SpacerKt.Spacer(SizeKt.m758height3ABfNKs(companion2, fM6973constructorimpl2), $composer3, 0);
                long j4 = Ink;
                if (compact3) {
                    sp2 = TextUnitKt.getSp(10);
                } else {
                    sp2 = TextUnitKt.getSp(12);
                }
                long j5 = sp2;
                if (compact3) {
                    i4 = 13;
                } else {
                    i4 = 17;
                }
                long sp4 = TextUnitKt.getSp(i4);
                if (compact3) {
                    i5 = 1;
                } else {
                    i5 = Integer.MAX_VALUE;
                }
                TextKt.m2820Text4IGK_g(subtitle, (Modifier) null, j4, j5, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, sp4, TextOverflow.INSTANCE.m6887getEllipsisgIe3tQ8(), false, i5, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, $composer3, (($dirty >> 6) & 14) | 384, 48, 119794);
                ComposerKt.sourceInformationMarkerEnd($composer3);
                ComposerKt.sourceInformationMarkerEnd($composer3);
                $composer3.endNode();
                ComposerKt.sourceInformationMarkerEnd($composer3);
                ComposerKt.sourceInformationMarkerEnd($composer3);
                ComposerKt.sourceInformationMarkerEnd($composer3);
                if (function5 != null) {
                    $composer3.startReplaceGroup(-2097976783);
                    ComposerKt.sourceInformation($composer3, "145@5040L28,146@5081L10");
                    SpacerKt.Spacer(SizeKt.m772size3ABfNKs(Modifier.INSTANCE, Dp.m6973constructorimpl(12)), $composer3, 6);
                    function4 = function5;
                    function4.invoke($composer3, Integer.valueOf(($dirty >> 15) & 14));
                } else {
                    function4 = function5;
                    $composer3.startReplaceGroup(-2102965892);
                }
                $composer3.endReplaceGroup();
                ComposerKt.sourceInformationMarkerEnd($composer3);
                ComposerKt.sourceInformationMarkerEnd($composer3);
                $composer3.endNode();
                ComposerKt.sourceInformationMarkerEnd($composer3);
                ComposerKt.sourceInformationMarkerEnd($composer3);
                ComposerKt.sourceInformationMarkerEnd($composer3);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                compact2 = compact3;
            }
            composerM3808constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
            composerM3808constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
            Updater.m3815setimpl(composerM3808constructorimpl2, modifierMaterializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
            int i14 = (i11 >> 6) & 14;
            ComposerKt.sourceInformationMarkerStart($composer3, -384672921, "C89@4556L9:Column.kt#2w3rfo");
            ColumnScopeInstance columnScopeInstance2 = ColumnScopeInstance.INSTANCE;
            int i15 = ((0 >> 6) & 112) | 6;
            ComposerKt.sourceInformationMarkerStart($composer3, 252902584, "C119@4042L235,126@4290L52,127@4355L242,134@4610L52,135@4675L310:HuiyuanDesign.kt#cyjvf");
            String upperCase2 = eyebrow.toUpperCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(upperCase2, "toUpperCase(...)");
            long j6 = Ink;
            if (compact3) {
                sp = TextUnitKt.getSp(8);
            } else {
                sp = TextUnitKt.getSp(10);
            }
            TextKt.m2820Text4IGK_g(upperCase2, (Modifier) null, j6, sp, (FontStyle) null, FontWeight.INSTANCE.getBlack(), (FontFamily) null, TextUnitKt.getSp(1.4d), (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, $composer3, 12779904, 0, 130898);
            Modifier.Companion companion3 = Modifier.INSTANCE;
            if (compact3) {
                fM6973constructorimpl = Dp.m6973constructorimpl(1);
            } else {
                fM6973constructorimpl = Dp.m6973constructorimpl(3);
            }
            SpacerKt.Spacer(SizeKt.m758height3ABfNKs(companion3, fM6973constructorimpl), $composer3, 0);
            long j7 = Ink;
            if (compact3) {
                i2 = 21;
            } else {
                i2 = 28;
            }
            long sp5 = TextUnitKt.getSp(i2);
            if (compact3) {
                i3 = 23;
            } else {
                i3 = 31;
            }
            function5 = function6;
            $dirty = $dirty2;
            $composer2 = $composer3;
            TextKt.m2820Text4IGK_g(title, (Modifier) null, j7, sp5, (FontStyle) null, FontWeight.INSTANCE.getBlack(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, TextUnitKt.getSp(i3), 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, $composer3, (($dirty2 >> 3) & 14) | 196992, 0, 130002);
            Modifier.Companion companion4 = Modifier.INSTANCE;
            if (compact3) {
                fM6973constructorimpl2 = Dp.m6973constructorimpl(2);
            } else {
                fM6973constructorimpl2 = Dp.m6973constructorimpl(4);
            }
            SpacerKt.Spacer(SizeKt.m758height3ABfNKs(companion4, fM6973constructorimpl2), $composer3, 0);
            long j8 = Ink;
            if (compact3) {
                sp2 = TextUnitKt.getSp(10);
            } else {
                sp2 = TextUnitKt.getSp(12);
            }
            long j9 = sp2;
            if (compact3) {
                i4 = 13;
            } else {
                i4 = 17;
            }
            long sp6 = TextUnitKt.getSp(i4);
            if (compact3) {
                i5 = 1;
            } else {
                i5 = Integer.MAX_VALUE;
            }
            TextKt.m2820Text4IGK_g(subtitle, (Modifier) null, j8, j9, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, sp6, TextOverflow.INSTANCE.m6887getEllipsisgIe3tQ8(), false, i5, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, $composer3, (($dirty >> 6) & 14) | 384, 48, 119794);
            ComposerKt.sourceInformationMarkerEnd($composer3);
            ComposerKt.sourceInformationMarkerEnd($composer3);
            $composer3.endNode();
            ComposerKt.sourceInformationMarkerEnd($composer3);
            ComposerKt.sourceInformationMarkerEnd($composer3);
            ComposerKt.sourceInformationMarkerEnd($composer3);
            if (function5 != null) {
                $composer3.startReplaceGroup(-2097976783);
                ComposerKt.sourceInformation($composer3, "145@5040L28,146@5081L10");
                SpacerKt.Spacer(SizeKt.m772size3ABfNKs(Modifier.INSTANCE, Dp.m6973constructorimpl(12)), $composer3, 6);
                function4 = function5;
                function4.invoke($composer3, Integer.valueOf(($dirty >> 15) & 14));
            } else {
                function4 = function5;
                $composer3.startReplaceGroup(-2102965892);
            }
            $composer3.endReplaceGroup();
            ComposerKt.sourceInformationMarkerEnd($composer3);
            ComposerKt.sourceInformationMarkerEnd($composer3);
            $composer3.endNode();
            ComposerKt.sourceInformationMarkerEnd($composer3);
            ComposerKt.sourceInformationMarkerEnd($composer3);
            ComposerKt.sourceInformationMarkerEnd($composer3);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            compact2 = compact3;
        } else {
            $composer2 = $composer3;
            $composer2.skipToGroupEnd();
            compact2 = z;
            function4 = function3;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = $composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.luchime.huiyuan.ui.HuiyuanDesignKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return HuiyuanDesignKt.ScreenHeader_fWhpE4E$lambda$7(eyebrow, title, subtitle, accent, compact2, function4, $changed, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    public static final void copyText(Context context, String text) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(text, "text");
        Object systemService = context.getSystemService("clipboard");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.content.ClipboardManager");
        ClipboardManager clipboard = (ClipboardManager) systemService;
        clipboard.setPrimaryClip(ClipData.newPlainText("603视界", text));
        Toast.makeText(context, "已复制", 0).show();
    }

    public static final void shareText(Context context, String title, String text) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(text, "text");
        Intent intent = new Intent("android.intent.action.SEND");
        intent.setType(AssetHelper.DEFAULT_MIME_TYPE);
        intent.putExtra("android.intent.extra.SUBJECT", title);
        intent.putExtra("android.intent.extra.TEXT", text);
        context.startActivity(Intent.createChooser(intent, "分享 " + title));
    }
}
