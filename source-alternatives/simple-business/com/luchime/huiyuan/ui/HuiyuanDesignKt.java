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
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextOverflow;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.TextUnitKt;
import androidx.profileinstaller.ProfileVerifier;
import androidx.webkit.internal.AssetHelper;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: HuiyuanDesign.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000J\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001c\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\u001aA\u0010\u001d\u001a\u00020\u001e2\b\b\u0002\u0010\u001f\u001a\u00020 2\b\b\u0002\u0010!\u001a\u00020\u00012\u001c\u0010\"\u001a\u0018\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020\u001e0#¢\u0006\u0002\b%¢\u0006\u0002\b&H\u0001¢\u0006\u0004\b'\u0010(\u001a)\u0010)\u001a\u00020\u001e2\u0006\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020\u00012\b\b\u0002\u0010\u001f\u001a\u00020 H\u0001¢\u0006\u0004\b-\u0010.\u001a!\u0010/\u001a\u00020\u001e2\u0006\u00100\u001a\u00020+2\b\b\u0002\u0010,\u001a\u00020\u0001H\u0001¢\u0006\u0004\b1\u00102\u001aP\u00103\u001a\u00020\u001e2\u0006\u00104\u001a\u00020+2\u0006\u00105\u001a\u00020+2\u0006\u00106\u001a\u00020+2\u0006\u00107\u001a\u00020\u00012\b\b\u0002\u00108\u001a\u0002092\u0015\b\u0002\u0010:\u001a\u000f\u0012\u0004\u0012\u00020\u001e\u0018\u00010;¢\u0006\u0002\b%H\u0001¢\u0006\u0004\b<\u0010=\u001a\u0018\u0010>\u001a\u00020\u001e2\u0006\u0010?\u001a\u00020@2\u0006\u0010*\u001a\u00020+H\u0000\u001a \u0010A\u001a\u00020\u001e2\u0006\u0010?\u001a\u00020@2\u0006\u00105\u001a\u00020+2\u0006\u0010*\u001a\u00020+H\u0000\"\u0016\u0010\u0000\u001a\u00020\u0001X\u0080\u0004¢\u0006\n\n\u0002\u0010\u0004\u001a\u0004\b\u0002\u0010\u0003\"\u0016\u0010\u0005\u001a\u00020\u0001X\u0080\u0004¢\u0006\n\n\u0002\u0010\u0004\u001a\u0004\b\u0006\u0010\u0003\"\u0016\u0010\u0007\u001a\u00020\u0001X\u0080\u0004¢\u0006\n\n\u0002\u0010\u0004\u001a\u0004\b\b\u0010\u0003\"\u0016\u0010\t\u001a\u00020\u0001X\u0080\u0004¢\u0006\n\n\u0002\u0010\u0004\u001a\u0004\b\n\u0010\u0003\"\u0016\u0010\u000b\u001a\u00020\u0001X\u0080\u0004¢\u0006\n\n\u0002\u0010\u0004\u001a\u0004\b\f\u0010\u0003\"\u0016\u0010\r\u001a\u00020\u0001X\u0080\u0004¢\u0006\n\n\u0002\u0010\u0004\u001a\u0004\b\u000e\u0010\u0003\"\u0016\u0010\u000f\u001a\u00020\u0001X\u0080\u0004¢\u0006\n\n\u0002\u0010\u0004\u001a\u0004\b\u0010\u0010\u0003\"\u0016\u0010\u0011\u001a\u00020\u0001X\u0080\u0004¢\u0006\n\n\u0002\u0010\u0004\u001a\u0004\b\u0012\u0010\u0003\"\u0016\u0010\u0013\u001a\u00020\u0001X\u0080\u0004¢\u0006\n\n\u0002\u0010\u0004\u001a\u0004\b\u0014\u0010\u0003\"\u0016\u0010\u0015\u001a\u00020\u0001X\u0080\u0004¢\u0006\n\n\u0002\u0010\u0004\u001a\u0004\b\u0016\u0010\u0003\"\u0016\u0010\u0017\u001a\u00020\u0001X\u0080\u0004¢\u0006\n\n\u0002\u0010\u0004\u001a\u0004\b\u0018\u0010\u0003\"\u0016\u0010\u0019\u001a\u00020\u0001X\u0080\u0004¢\u0006\n\n\u0002\u0010\u0004\u001a\u0004\b\u001a\u0010\u0003\"\u0016\u0010\u001b\u001a\u00020\u0001X\u0080\u0004¢\u0006\n\n\u0002\u0010\u0004\u001a\u0004\b\u001c\u0010\u0003¨\u0006B"}, d2 = {"Ink", "Landroidx/compose/ui/graphics/Color;", "getInk", "()J", "J", "Paper", "getPaper", "Cream", "getCream", "SignalYellow", "getSignalYellow", "SignalRed", "getSignalRed", "SignalGreen", "getSignalGreen", "SignalBlue", "getSignalBlue", "SignalPurple", "getSignalPurple", "SignalPink", "getSignalPink", "SignalOrange", "getSignalOrange", "Terminal", "getTerminal", "TerminalText", "getTerminalText", "MutedText", "getMutedText", "RetroCard", "", "modifier", "Landroidx/compose/ui/Modifier;", "background", "content", "Lkotlin/Function1;", "Landroidx/compose/foundation/layout/BoxScope;", "Landroidx/compose/runtime/Composable;", "Lkotlin/ExtensionFunctionType;", "RetroCard-3IgeMak", "(Landroidx/compose/ui/Modifier;JLkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "Avatar", "text", "", "color", "Avatar-3IgeMak", "(Ljava/lang/String;JLandroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "CategoryBadge", "category", "CategoryBadge-iJQMabo", "(Ljava/lang/String;JLandroidx/compose/runtime/Composer;II)V", "ScreenHeader", "eyebrow", "title", "subtitle", "accent", "compact", "", "trailing", "Lkotlin/Function0;", "ScreenHeader-fWhpE4E", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JZLkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "copyText", "context", "Landroid/content/Context;", "shareText", "app"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class HuiyuanDesignKt {
    private static final long Cream = 0;
    private static final long Ink = 0;
    private static final long MutedText = 0;
    private static final long Paper = 0;
    private static final long SignalBlue = 0;
    private static final long SignalGreen = 0;
    private static final long SignalOrange = 0;
    private static final long SignalPink = 0;
    private static final long SignalPurple = 0;
    private static final long SignalRed = 0;
    private static final long SignalYellow = 0;
    private static final long Terminal = 0;
    private static final long TerminalText = 0;

    static final Unit Avatar_3IgeMak$lambda$3(String r8, long r9, Modifier r11, int r12, int r13, Composer r14, int r15) {
        m7412Avatar3IgeMak(r8, r9, r11, r14, RecomposeScopeImplKt.updateChangedFlags(r12 | 1), r13);
        return Unit.INSTANCE;
    }

    static final Unit CategoryBadge_iJQMabo$lambda$4(String r7, long r8, int r10, int r11, Composer r12, int r13) {
        m7413CategoryBadgeiJQMabo(r7, r8, r12, RecomposeScopeImplKt.updateChangedFlags(r10 | 1), r11);
        return Unit.INSTANCE;
    }

    static final Unit RetroCard_3IgeMak$lambda$1(Modifier r8, long r9, Function3 r11, int r12, int r13, Composer r14, int r15) {
        m7414RetroCard3IgeMak(r8, r9, r11, r14, RecomposeScopeImplKt.updateChangedFlags(r12 | 1), r13);
        return Unit.INSTANCE;
    }

    static final Unit ScreenHeader_fWhpE4E$lambda$7(String r11, String r12, String r13, long r14, boolean r16, Function2 r17, int r18, int r19, Composer r20, int r21) {
        m7415ScreenHeaderfWhpE4E(r11, r12, r13, r14, r16, r17, r20, RecomposeScopeImplKt.updateChangedFlags(r18 | 1), r19);
        return Unit.INSTANCE;
    }

    static {
        Ink = ColorKt.Color(4279768851L);
        Paper = ColorKt.Color(4294965480L);
        Cream = ColorKt.Color(4294962881L);
        SignalYellow = ColorKt.Color(4294957857L);
        SignalRed = ColorKt.Color(4294920007L);
        SignalGreen = ColorKt.Color(4281784698L);
        SignalBlue = ColorKt.Color(4282354943L);
        SignalPurple = ColorKt.Color(4289226239L);
        SignalPink = ColorKt.Color(4294926765L);
        SignalOrange = ColorKt.Color(4294932992L);
        Terminal = ColorKt.Color(4279114518L);
        TerminalText = ColorKt.Color(4285333406L);
        MutedText = ColorKt.Color(4285886048L);
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

    /* JADX INFO: renamed from: RetroCard-3IgeMak, reason: not valid java name */
    public static final void m7414RetroCard3IgeMak(Modifier modifier, long background, final Function3<? super BoxScope, ? super Composer, ? super Integer, Unit> r53, Composer $composer, final int $changed, final int r56) {
        Intrinsics.checkNotNullParameter(r53, "content");
        Composer $composer2 = $composer.startRestartGroup(-38861452);
        ComposerKt.sourceInformation($composer2, "C(RetroCard)P(2,0:c#ui.graphics.Color)52@2028L531:HuiyuanDesign.kt#cyjvf");
        int $dirty = $changed;
        int r2 = r56 & 1;
        if (r2 == 0) goto L6;
        $dirty = $dirty | 6;
        Modifier r3 = modifier;
    L13:
        int r6 = r56 & 2;
        if (r6 == 0) goto L17;
        $dirty = $dirty | 48;
        long r8 = background;
    L25:
        if (($changed & 384) == 0) goto L27;
    L31:
        int $dirty2 = $dirty;
        if (($dirty2 & 147) == 146) goto L34;
        boolean r1 = true;
    L36:
        if ($composer2.shouldExecute(r1, $dirty2 & 1) == false) goto L80;
        if (r2 == 0) goto L39;
        Modifier modifier2 = Modifier.Companion;
    L40:
        if (r6 == 0) goto L42;
        long background2 = Color.Companion.m4403getWhite0d7_KjU();
    L44:
        if (ComposerKt.isTraceInProgress() == false) goto L46;
        ComposerKt.traceEventStart(-38861452, $dirty2, -1, "com.luchime.huiyuan.ui.RetroCard (HuiyuanDesign.kt:51)");
    L46:
        Modifier r0 = PaddingKt.m729paddingqDBjuR0$default(modifier2, 0.0f, 0.0f, Dp.m6973constructorimpl(4), Dp.m6973constructorimpl(4), 3, null);
        ComposerKt.sourceInformationMarkerStart($composer2, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
        MeasurePolicy r9 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.getTopStart(), false);
        ComposerKt.sourceInformationMarkerStart($composer2, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
        int r19 = ComposablesKt.getCurrentCompositeKeyHash($composer2, 0);
        CompositionLocalMap r12 = $composer2.getCurrentCompositionLocalMap();
        Modifier r5 = ComposedModifierKt.materializeModifier($composer2, r0);
        Function0<ComposeUiNode> r21 = ComposeUiNode.Companion.getConstructor();
        int r4 = ((((0 << 3) & 112) << 6) & 896) | 6;
        Composer $composer3 = $composer2;
        ComposerKt.sourceInformationMarkerStart($composer2, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
        if (($composer2.getApplier() instanceof Applier) == true) goto L49;
        ComposablesKt.invalidApplier();
    L49:
        $composer2.startReusableNode();
        if ($composer2.getInserting() == false) goto L52;
        Function0<ComposeUiNode> r7 = r21;
        $composer2.createNode(r7);
    L53:
        Composer r10 = Updater.m3808constructorimpl($composer2);
        Updater.m3815setimpl(r10, r9, ComposeUiNode.Companion.getSetMeasurePolicy());
        Updater.m3815setimpl(r10, r12, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> r11 = ComposeUiNode.Companion.getSetCompositeKeyHash();
        if (r10.getInserting() == true) goto L60;
        if (Intrinsics.areEqual(r10.rememberedValue(), Integer.valueOf(r19)) == false) goto L60;
    L61:
        Updater.m3815setimpl(r10, r5, ComposeUiNode.Companion.getSetModifier());
        int r13 = (r4 >> 6) & 14;
        ComposerKt.sourceInformationMarkerStart($composer2, -2146730711, "C72@3468L9:Box.kt#2w3rfo");
        int r29 = ((0 >> 6) & 112) | 6;
        BoxScope r27 = BoxScopeInstance.INSTANCE;
        ComposerKt.sourceInformationMarkerStart($composer2, -1641306898, "C53@2098L177,59@2284L269:HuiyuanDesign.kt#cyjvf");
        BoxKt.Box(BackgroundKt.m233backgroundbw27NRU(OffsetKt.m684offsetVpY3zN4(r27.matchParentSize(Modifier.Companion), Dp.m6973constructorimpl(4), Dp.m6973constructorimpl(4)), Ink, RoundedCornerShapeKt.m1018RoundedCornerShape0680j_4(Dp.m6973constructorimpl(14))), $composer2, 0);
        long background3 = background2;
        Modifier r14 = PaddingKt.m726paddingVpY3zN4(BorderKt.m245borderxT4_qwU(BackgroundKt.m233backgroundbw27NRU(Modifier.Companion, background2, RoundedCornerShapeKt.m1018RoundedCornerShape0680j_4(Dp.m6973constructorimpl(14))), Dp.m6973constructorimpl(2), Ink, RoundedCornerShapeKt.m1018RoundedCornerShape0680j_4(Dp.m6973constructorimpl(14))), Dp.m6973constructorimpl(13), Dp.m6973constructorimpl(11));
        int r15 = ($dirty2 << 3) & 7168;
        ComposerKt.sourceInformationMarkerStart($composer2, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
        MeasurePolicy r16 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.getTopStart(), false);
        int r17 = (r15 << 3) & 112;
        ComposerKt.sourceInformationMarkerStart($composer2, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
        int r18 = ComposablesKt.getCurrentCompositeKeyHash($composer2, 0);
        CompositionLocalMap r20 = $composer2.getCurrentCompositionLocalMap();
        Modifier r22 = ComposedModifierKt.materializeModifier($composer2, r14);
        Function0<ComposeUiNode> r110 = ComposeUiNode.Companion.getConstructor();
        int r23 = ((r17 << 6) & 896) | 6;
        ComposerKt.sourceInformationMarkerStart($composer2, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
        if (($composer2.getApplier() instanceof Applier) == true) goto L64;
        ComposablesKt.invalidApplier();
    L64:
        $composer2.startReusableNode();
        if ($composer2.getInserting() == false) goto L67;
        Function0<ComposeUiNode> r24 = r110;
        $composer2.createNode(r24);
    L68:
        Composer r25 = Updater.m3808constructorimpl($composer2);
        Updater.m3815setimpl(r25, r16, ComposeUiNode.Companion.getSetMeasurePolicy());
        Updater.m3815setimpl(r25, r20, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> r26 = ComposeUiNode.Companion.getSetCompositeKeyHash();
        if (r25.getInserting() == true) goto L74;
        Composer r49 = $composer2;
        if (Intrinsics.areEqual(r25.rememberedValue(), Integer.valueOf(r18)) == true) goto L76;
    L75:
        r25.updateRememberedValue(Integer.valueOf(r18));
        r25.apply(Integer.valueOf(r18), r26);
    L76:
        Updater.m3815setimpl(r25, r22, ComposeUiNode.Companion.getSetModifier());
        int r28 = (r23 >> 6) & 14;
        Composer r30 = r49;
        ComposerKt.sourceInformationMarkerStart(r30, -2146730711, "C72@3468L9:Box.kt#2w3rfo");
        r53.invoke(BoxScopeInstance.INSTANCE, r30, Integer.valueOf(((r15 >> 6) & 112) | 6));
        ComposerKt.sourceInformationMarkerEnd(r30);
        r49.endNode();
        ComposerKt.sourceInformationMarkerEnd(r49);
        ComposerKt.sourceInformationMarkerEnd(r49);
        ComposerKt.sourceInformationMarkerEnd(r49);
        ComposerKt.sourceInformationMarkerEnd($composer2);
        ComposerKt.sourceInformationMarkerEnd($composer2);
        $composer2.endNode();
        ComposerKt.sourceInformationMarkerEnd($composer2);
        ComposerKt.sourceInformationMarkerEnd($composer2);
        ComposerKt.sourceInformationMarkerEnd($composer2);
        if (ComposerKt.isTraceInProgress() == false) goto L79;
        ComposerKt.traceEventEnd();
    L79:
        final Modifier modifier3 = modifier2;
        final long background4 = background3;
    L81:
        ScopeUpdateScope r31 = $composer3.endRestartGroup();
        if (r31 == null) goto L85;
        r31.updateScope(new HuiyuanDesignKt$$ExternalSyntheticLambda3(modifier3, background4, r53, $changed, r56));
        return;
    L85:
        return;
    L74:
        r49 = $composer2;
        goto L75
    L67:
        r24 = r110;
        $composer2.useNode();
    L60:
        r10.updateRememberedValue(Integer.valueOf(r19));
        r10.apply(Integer.valueOf(r19), r11);
        goto L61
    L52:
        r7 = r21;
        $composer2.useNode();
        goto L53
    L42:
        background2 = r8;
        goto L44
    L39:
        modifier2 = r3;
        goto L40
    L80:
        $composer3 = $composer2;
        $composer3.skipToGroupEnd();
        modifier3 = r3;
        background4 = r8;
        goto L81
    L34:
        r1 = false;
        goto L36
    L27:
        if ($composer2.changedInstance(r53) == false) goto L29;
        int r111 = 256;
    L30:
        $dirty = $dirty | r111;
        goto L31
    L29:
        r111 = 128;
        goto L30
    L17:
        if (($changed & 48) != 0) goto L23;
        r8 = background;
        if ($composer2.changed(r8) == false) goto L21;
        int r112 = 32;
    L22:
        $dirty = $dirty | r112;
        goto L25
    L21:
        r112 = 16;
        goto L22
    L23:
        r8 = background;
        goto L25
    L6:
        if (($changed & 6) != 0) goto L12;
        r3 = modifier;
        if ($composer2.changed(r3) == false) goto L10;
        int r32 = 4;
    L11:
        $dirty = $dirty | r32;
        goto L13
    L10:
        r32 = 2;
        goto L11
    L12:
        r3 = modifier;
        goto L13
    }

    /* JADX INFO: renamed from: Avatar-3IgeMak, reason: not valid java name */
    public static final void m7412Avatar3IgeMak(final String text, final long color, Modifier modifier, Composer $composer, final int $changed, final int r58) {
        Intrinsics.checkNotNullParameter(text, "text");
        Composer $composer2 = $composer.startRestartGroup(-223064296);
        ComposerKt.sourceInformation($composer2, "C(Avatar)P(2,0:c#ui.graphics.Color)75@2674L285:HuiyuanDesign.kt#cyjvf");
        int $dirty = $changed;
        if (($changed & 6) != 0) goto L10;
        if ($composer2.changed(text) == false) goto L7;
        int r7 = 4;
    L8:
        $dirty = $dirty | r7;
        goto L10
    L7:
        r7 = 2;
    L10:
        if (($changed & 48) == 0) goto L12;
    L16:
        int r8 = r58 & 4;
        if (r8 == 0) goto L20;
        $dirty = $dirty | 384;
        Modifier r9 = modifier;
    L28:
        if (($dirty & 147) == 146) goto L30;
        boolean r10 = true;
    L32:
        if ($composer2.shouldExecute(r10, $dirty & 1) == false) goto L58;
        if (r8 == 0) goto L35;
        Modifier.Companion modifier2 = Modifier.Companion;
    L37:
        if (ComposerKt.isTraceInProgress() == false) goto L39;
        ComposerKt.traceEventStart(-223064296, $dirty, -1, "com.luchime.huiyuan.ui.Avatar (HuiyuanDesign.kt:74)");
    L39:
        Modifier r4 = BorderKt.m245borderxT4_qwU(BackgroundKt.m233backgroundbw27NRU(SizeKt.m772size3ABfNKs(modifier2, Dp.m6973constructorimpl(34)), color, RoundedCornerShapeKt.getCircleShape()), Dp.m6973constructorimpl(2), Ink, RoundedCornerShapeKt.getCircleShape());
        Alignment r11 = Alignment.Companion.getCenter();
        ComposerKt.sourceInformationMarkerStart($composer2, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
        MeasurePolicy r12 = BoxKt.maybeCachedBoxMeasurePolicy(r11, false);
        ComposerKt.sourceInformationMarkerStart($composer2, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
        int r30 = ComposablesKt.getCurrentCompositeKeyHash($composer2, 0);
        CompositionLocalMap r13 = $composer2.getCurrentCompositionLocalMap();
        Modifier r14 = ComposedModifierKt.materializeModifier($composer2, r4);
        Function0<ComposeUiNode> r15 = ComposeUiNode.Companion.getConstructor();
        int r16 = ((((48 << 3) & 112) << 6) & 896) | 6;
        ComposerKt.sourceInformationMarkerStart($composer2, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
        if (($composer2.getApplier() instanceof Applier) == true) goto L42;
        ComposablesKt.invalidApplier();
    L42:
        $composer2.startReusableNode();
        if ($composer2.getInserting() == false) goto L45;
        $composer2.createNode(r15);
    L46:
        Composer r0 = Updater.m3808constructorimpl($composer2);
        Updater.m3815setimpl(r0, r12, ComposeUiNode.Companion.getSetMeasurePolicy());
        Updater.m3815setimpl(r0, r13, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> r1 = ComposeUiNode.Companion.getSetCompositeKeyHash();
        if (r0.getInserting() == true) goto L53;
        if (Intrinsics.areEqual(r0.rememberedValue(), Integer.valueOf(r30)) == false) goto L53;
    L54:
        Updater.m3815setimpl(r0, r14, ComposeUiNode.Companion.getSetModifier());
        int r33 = (r16 >> 6) & 14;
        ComposerKt.sourceInformationMarkerStart($composer2, -2146730711, "C72@3468L9:Box.kt#2w3rfo");
        BoxScopeInstance r2 = BoxScopeInstance.INSTANCE;
        int r35 = ((48 >> 6) & 112) | 6;
        ComposerKt.sourceInformationMarkerStart($composer2, -1759582615, "C82@2881L72:HuiyuanDesign.kt#cyjvf");
        Composer $composer3 = $composer2;
        Modifier modifier3 = modifier2;
        TextKt.m2820Text4IGK_g(text, null, Ink, TextUnitKt.getSp(15), null, FontWeight.Companion.getBlack(), null, 0, null, null, 0, 0, false, 0, 0, null, null, $composer2, ($dirty & 14) | 200064, 0, 131026);
        ComposerKt.sourceInformationMarkerEnd($composer2);
        ComposerKt.sourceInformationMarkerEnd($composer2);
        $composer2.endNode();
        ComposerKt.sourceInformationMarkerEnd($composer2);
        ComposerKt.sourceInformationMarkerEnd($composer2);
        ComposerKt.sourceInformationMarkerEnd($composer2);
        if (ComposerKt.isTraceInProgress() == false) goto L57;
        ComposerKt.traceEventEnd();
    L57:
        final Modifier modifier4 = modifier3;
    L59:
        ScopeUpdateScope r17 = $composer3.endRestartGroup();
        if (r17 == null) goto L63;
        r17.updateScope(new HuiyuanDesignKt$$ExternalSyntheticLambda2(text, color, modifier4, $changed, r58));
        return;
    L63:
        return;
    L53:
        r0.updateRememberedValue(Integer.valueOf(r30));
        r0.apply(Integer.valueOf(r30), r1);
        goto L54
    L45:
        $composer2.useNode();
        goto L46
    L35:
        modifier2 = r9;
        goto L37
    L58:
        $composer3 = $composer2;
        $composer3.skipToGroupEnd();
        modifier4 = r9;
        goto L59
    L30:
        r10 = false;
        goto L32
    L20:
        if (($changed & 384) != 0) goto L26;
        r9 = modifier;
        if ($composer2.changed(r9) == false) goto L24;
        int r18 = 256;
    L25:
        $dirty = $dirty | r18;
        goto L28
    L24:
        r18 = 128;
        goto L25
    L26:
        r9 = modifier;
        goto L28
    L12:
        if ($composer2.changed(color) == false) goto L14;
        int r19 = 32;
    L15:
        $dirty = $dirty | r19;
        goto L16
    L14:
        r19 = 16;
        goto L15
    }

    /* JADX INFO: renamed from: CategoryBadge-iJQMabo, reason: not valid java name */
    public static final void m7413CategoryBadgeiJQMabo(final String category, long color, Composer $composer, final int $changed, final int r35) {
        Intrinsics.checkNotNullParameter(category, "category");
        Composer $composer2 = $composer.startRestartGroup(564458199);
        ComposerKt.sourceInformation($composer2, "C(CategoryBadge)P(!,1:c#ui.graphics.Color)88@3053L391:HuiyuanDesign.kt#cyjvf");
        int $dirty = $changed;
        if (($changed & 6) == 0) goto L5;
    L9:
        int r4 = r35 & 2;
        if (r4 == 0) goto L13;
        $dirty = $dirty | 48;
        long r5 = color;
    L21:
        if (($dirty & 19) == 18) goto L23;
        boolean r7 = true;
    L25:
        if ($composer2.shouldExecute(r7, $dirty & 1) == false) goto L43;
        if (r4 == 0) goto L28;
        long color2 = SignalPink;
    L30:
        if (ComposerKt.isTraceInProgress() == false) goto L33;
        ComposerKt.traceEventStart(564458199, $dirty, -1, "com.luchime.huiyuan.ui.CategoryBadge (HuiyuanDesign.kt:87)");
    L33:
        if (Color.m4367equalsimpl0(color2, SignalYellow) == false) goto L35;
    L38:
        long r6 = Ink;
    L39:
        Composer $composer3 = $composer2;
        long r28 = r6;
        long color3 = color2;
        TextKt.m2820Text4IGK_g(category, PaddingKt.m726paddingVpY3zN4(BorderKt.m245borderxT4_qwU(BackgroundKt.m233backgroundbw27NRU(Modifier.Companion, color2, RoundedCornerShapeKt.m1018RoundedCornerShape0680j_4(Dp.m6973constructorimpl(5))), Dp.m6973constructorimpl((float) 1.5d), Ink, RoundedCornerShapeKt.m1018RoundedCornerShape0680j_4(Dp.m6973constructorimpl(5))), Dp.m6973constructorimpl(7), Dp.m6973constructorimpl(3)), r28, TextUnitKt.getSp(10), null, FontWeight.Companion.getBlack(), null, 0, null, null, 0, 0, false, 0, 0, null, null, $composer3, ($dirty & 14) | 199680, 0, 131024);
        if (ComposerKt.isTraceInProgress() == false) goto L42;
        ComposerKt.traceEventEnd();
    L42:
        final long color4 = color3;
    L44:
        ScopeUpdateScope r8 = $composer3.endRestartGroup();
        if (r8 == null) goto L48;
        r8.updateScope(new HuiyuanDesignKt$$ExternalSyntheticLambda0(category, color4, $changed, r35));
        return;
    L48:
        return;
    L35:
        if (Color.m4367equalsimpl0(color2, SignalGreen) == true) goto L38;
        r6 = Color.Companion.m4403getWhite0d7_KjU();
        goto L39
    L28:
        color2 = r5;
        goto L30
    L43:
        $composer3 = $composer2;
        $composer3.skipToGroupEnd();
        color4 = r5;
        goto L44
    L23:
        r7 = false;
        goto L25
    L13:
        if (($changed & 48) != 0) goto L19;
        r5 = color;
        if ($composer2.changed(r5) == false) goto L17;
        int r9 = 32;
    L18:
        $dirty = $dirty | r9;
        goto L21
    L17:
        r9 = 16;
        goto L18
    L19:
        r5 = color;
        goto L21
    L5:
        if ($composer2.changed(category) == false) goto L7;
        int r10 = 4;
    L8:
        $dirty = $dirty | r10;
        goto L9
    L7:
        r10 = 2;
        goto L8
    }

    /* JADX INFO: renamed from: ScreenHeader-fWhpE4E, reason: not valid java name */
    public static final void m7415ScreenHeaderfWhpE4E(final String eyebrow, final String title, final String subtitle, final long accent, boolean compact, Function2<? super Composer, ? super Integer, Unit> r90, Composer $composer, final int $changed, final int r93) {
        Intrinsics.checkNotNullParameter(eyebrow, "eyebrow");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        Composer $composer2 = $composer.startRestartGroup(-1505532958);
        ComposerKt.sourceInformation($composer2, "C(ScreenHeader)P(2,4,3,0:c#ui.graphics.Color)109@3653L1454:HuiyuanDesign.kt#cyjvf");
        int $dirty = $changed;
        if (($changed & 6) != 0) goto L10;
        if ($composer2.changed(eyebrow) == false) goto L7;
        int r7 = 4;
    L8:
        $dirty = $dirty | r7;
        goto L10
    L7:
        r7 = 2;
    L10:
        if (($changed & 48) != 0) goto L17;
        if ($composer2.changed(title) == false) goto L14;
        int r8 = 32;
    L15:
        $dirty = $dirty | r8;
        goto L17
    L14:
        r8 = 16;
    L17:
        if (($changed & 384) != 0) goto L24;
        if ($composer2.changed(subtitle) == false) goto L21;
        int r9 = 256;
    L22:
        $dirty = $dirty | r9;
        goto L24
    L21:
        r9 = 128;
    L24:
        if (($changed & 3072) != 0) goto L30;
        long r10 = accent;
        if ($composer2.changed(r10) == false) goto L28;
        int r11 = 2048;
    L29:
        $dirty = $dirty | r11;
    L31:
        int r12 = r93 & 16;
        if (r12 == 0) goto L35;
        $dirty = $dirty | 24576;
        boolean r13 = compact;
    L42:
        int r14 = r93 & 32;
        if (r14 == 0) goto L46;
        $dirty = $dirty | ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
        Function2<? super Composer, ? super Integer, Unit> r15 = r90;
    L54:
        if ((74899 & $dirty) == 74898) goto L56;
        boolean r16 = true;
    L58:
        if ($composer2.shouldExecute(r16, $dirty & 1) == false) goto L141;
        if (r12 == 0) goto L61;
        boolean compact2 = false;
    L62:
        if (r14 == 0) goto L64;
        Function2<? super Composer, ? super Integer, Unit> r17 = null;
    L66:
        if (ComposerKt.isTraceInProgress() == false) goto L68;
        ComposerKt.traceEventStart(-1505532958, $dirty, -1, "com.luchime.huiyuan.ui.ScreenHeader (HuiyuanDesign.kt:108)");
    L68:
        Modifier r4 = BorderKt.m246borderxT4_qwU$default(BackgroundKt.m234backgroundbw27NRU$default(SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, null), r10, null, 2, null), Dp.m6973constructorimpl(2), Ink, null, 4, null);
        float r18 = Dp.m6973constructorimpl(18);
        if (compact2 == false) goto L71;
        float r19 = Dp.m6973constructorimpl(9);
    L72:
        Modifier r5 = PaddingKt.m726paddingVpY3zN4(r4, r18, r19);
        Arrangement.Horizontal r20 = Arrangement.INSTANCE.getSpaceBetween();
        Alignment.Vertical r21 = Alignment.Companion.getCenterVertically();
        ComposerKt.sourceInformationMarkerStart($composer2, 693286680, "CC(Row)P(2,1,3)99@5124L58,100@5187L130:Row.kt#2w3rfo");
        MeasurePolicy r6 = RowKt.rowMeasurePolicy(r20, r21, $composer2, ((432 >> 3) & 14) | ((432 >> 3) & 112));
        ComposerKt.sourceInformationMarkerStart($composer2, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
        int r33 = ComposablesKt.getCurrentCompositeKeyHash($composer2, 0);
        CompositionLocalMap r110 = $composer2.getCurrentCompositionLocalMap();
        Modifier r22 = ComposedModifierKt.materializeModifier($composer2, r5);
        Function0<ComposeUiNode> r111 = ComposeUiNode.Companion.getConstructor();
        int r112 = ((((432 << 3) & 112) << 6) & 896) | 6;
        ComposerKt.sourceInformationMarkerStart($composer2, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
        if (($composer2.getApplier() instanceof Applier) == true) goto L75;
        ComposablesKt.invalidApplier();
    L75:
        $composer2.startReusableNode();
        if ($composer2.getInserting() == false) goto L78;
        $composer2.createNode(r111);
    L79:
        Composer r113 = Updater.m3808constructorimpl($composer2);
        Updater.m3815setimpl(r113, r6, ComposeUiNode.Companion.getSetMeasurePolicy());
        Updater.m3815setimpl(r113, r110, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> r114 = ComposeUiNode.Companion.getSetCompositeKeyHash();
        if (r113.getInserting() == false) goto L82;
    L85:
        r113.updateRememberedValue(Integer.valueOf(r33));
        r113.apply(Integer.valueOf(r33), r114);
    L86:
        Updater.m3815setimpl(r113, r22, ComposeUiNode.Companion.getSetModifier());
        int r0 = (r112 >> 6) & 14;
        ComposerKt.sourceInformationMarkerStart($composer2, -407735110, "C101@5232L9:Row.kt#2w3rfo");
        int r37 = ((432 >> 6) & 112) | 6;
        RowScope r115 = RowScopeInstance.INSTANCE;
        ComposerKt.sourceInformationMarkerStart($composer2, -2098973339, "C118@3989L1006:HuiyuanDesign.kt#cyjvf");
        Modifier r1 = RowScope.weight$default(r115, Modifier.Companion, 1.0f, false, 2, null);
        ComposerKt.sourceInformationMarkerStart($composer2, -483455358, "CC(Column)P(2,3,1)87@4442L61,88@4508L133:Column.kt#2w3rfo");
        MeasurePolicy r2 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.Companion.getStart(), $composer2, ((0 >> 3) & 14) | ((0 >> 3) & 112));
        ComposerKt.sourceInformationMarkerStart($composer2, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
        int r48 = ComposablesKt.getCurrentCompositeKeyHash($composer2, 0);
        CompositionLocalMap r3 = $composer2.getCurrentCompositionLocalMap();
        Modifier r116 = ComposedModifierKt.materializeModifier($composer2, r1);
        Function0<ComposeUiNode> r23 = ComposeUiNode.Companion.getConstructor();
        int r24 = ((((0 << 3) & 112) << 6) & 896) | 6;
        ComposerKt.sourceInformationMarkerStart($composer2, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
        if (($composer2.getApplier() instanceof Applier) == true) goto L89;
        ComposablesKt.invalidApplier();
    L89:
        $composer2.startReusableNode();
        if ($composer2.getInserting() == false) goto L92;
        $composer2.createNode(r23);
    L93:
        Composer r25 = Updater.m3808constructorimpl($composer2);
        Updater.m3815setimpl(r25, r2, ComposeUiNode.Companion.getSetMeasurePolicy());
        Updater.m3815setimpl(r25, r3, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> r26 = ComposeUiNode.Companion.getSetCompositeKeyHash();
        if (r25.getInserting() == true) goto L99;
        MeasurePolicy r51 = r2;
        if (Intrinsics.areEqual(r25.rememberedValue(), Integer.valueOf(r48)) == true) goto L101;
    L100:
        r25.updateRememberedValue(Integer.valueOf(r48));
        r25.apply(Integer.valueOf(r48), r26);
    L101:
        Updater.m3815setimpl(r25, r116, ComposeUiNode.Companion.getSetModifier());
        int r27 = (r24 >> 6) & 14;
        ComposerKt.sourceInformationMarkerStart($composer2, -384672921, "C89@4556L9:Column.kt#2w3rfo");
        ColumnScopeInstance r28 = ColumnScopeInstance.INSTANCE;
        int r53 = ((0 >> 6) & 112) | 6;
        ComposerKt.sourceInformationMarkerStart($composer2, 252902584, "C119@4042L235,126@4290L52,127@4355L242,134@4610L52,135@4675L310:HuiyuanDesign.kt#cyjvf");
        String r29 = eyebrow.toUpperCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(r29, "toUpperCase(...)");
        long r56 = Ink;
        if (compact2 == false) goto L104;
        long r210 = TextUnitKt.getSp(8);
    L105:
        TextKt.m2820Text4IGK_g(r29, null, r56, r210, null, FontWeight.Companion.getBlack(), null, TextUnitKt.getSp(1.4d), null, null, 0, 0, false, 0, 0, null, null, $composer2, 12779904, 0, 130898);
        Modifier.Companion r30 = Modifier.Companion;
        if (compact2 == false) goto L108;
        float r31 = Dp.m6973constructorimpl(1);
    L109:
        SpacerKt.Spacer(SizeKt.m758height3ABfNKs(r30, r31), $composer2, 0);
        long r32 = Ink;
        if (compact2 == false) goto L112;
        int r34 = 21;
    L113:
        long r117 = TextUnitKt.getSp(r34);
        if (compact2 == false) goto L116;
        int r35 = 23;
    L117:
        Function2<? super Composer, ? super Integer, Unit> r62 = r17;
        int $dirty2 = $dirty;
        Composer $composer3 = $composer2;
        TextKt.m2820Text4IGK_g(title, null, r32, r117, null, FontWeight.Companion.getBlack(), null, 0, null, null, TextUnitKt.getSp(r35), 0, false, 0, 0, null, null, $composer2, (($dirty >> 3) & 14) | 196992, 0, 130002);
        Modifier.Companion r36 = Modifier.Companion;
        if (compact2 == false) goto L120;
        float r38 = Dp.m6973constructorimpl(2);
    L121:
        SpacerKt.Spacer(SizeKt.m758height3ABfNKs(r36, r38), $composer2, 0);
        long r39 = Ink;
        if (compact2 == false) goto L124;
        long r40 = TextUnitKt.getSp(10);
    L125:
        long r41 = r40;
        if (compact2 == false) goto L128;
        int r42 = 13;
    L129:
        long r43 = TextUnitKt.getSp(r42);
        if (compact2 == false) goto L132;
        int r118 = 1;
    L133:
        TextKt.m2820Text4IGK_g(subtitle, null, r39, r41, null, null, null, 0, null, null, r43, TextOverflow.Companion.m6887getEllipsisgIe3tQ8(), false, r118, 0, null, null, $composer2, (($dirty2 >> 6) & 14) | 384, 48, 119794);
        ComposerKt.sourceInformationMarkerEnd($composer2);
        ComposerKt.sourceInformationMarkerEnd($composer2);
        $composer2.endNode();
        ComposerKt.sourceInformationMarkerEnd($composer2);
        ComposerKt.sourceInformationMarkerEnd($composer2);
        ComposerKt.sourceInformationMarkerEnd($composer2);
        if (r62 == null) goto L136;
        $composer2.startReplaceGroup(-2097976783);
        ComposerKt.sourceInformation($composer2, "145@5040L28,146@5081L10");
        SpacerKt.Spacer(SizeKt.m772size3ABfNKs(Modifier.Companion, Dp.m6973constructorimpl(12)), $composer2, 6);
        final Function2<? super Composer, ? super Integer, Unit> r44 = r62;
        r44.invoke($composer2, Integer.valueOf(($dirty2 >> 15) & 14));
    L137:
        $composer2.endReplaceGroup();
        ComposerKt.sourceInformationMarkerEnd($composer2);
        ComposerKt.sourceInformationMarkerEnd($composer2);
        $composer2.endNode();
        ComposerKt.sourceInformationMarkerEnd($composer2);
        ComposerKt.sourceInformationMarkerEnd($composer2);
        ComposerKt.sourceInformationMarkerEnd($composer2);
        if (ComposerKt.isTraceInProgress() == false) goto L140;
        ComposerKt.traceEventEnd();
    L140:
        final boolean compact3 = compact2;
    L142:
        ScopeUpdateScope r119 = $composer3.endRestartGroup();
        if (r119 == null) goto L146;
        r119.updateScope(new HuiyuanDesignKt$$ExternalSyntheticLambda1(eyebrow, title, subtitle, accent, compact3, r44, $changed, r93));
        return;
    L146:
        return;
    L136:
        r44 = r62;
        $composer2.startReplaceGroup(-2102965892);
        goto L137
    L132:
        r118 = Integer.MAX_VALUE;
        goto L133
    L128:
        r42 = 17;
        goto L129
    L124:
        r40 = TextUnitKt.getSp(12);
        goto L125
    L120:
        r38 = Dp.m6973constructorimpl(4);
        goto L121
    L116:
        r35 = 31;
        goto L117
    L112:
        r34 = 28;
        goto L113
    L108:
        r31 = Dp.m6973constructorimpl(3);
        goto L109
    L104:
        r210 = TextUnitKt.getSp(10);
        goto L105
    L99:
        r51 = r2;
        goto L100
    L92:
        $composer2.useNode();
        goto L93
    L82:
        if (Intrinsics.areEqual(r113.rememberedValue(), Integer.valueOf(r33)) == true) goto L86;
    L78:
        $composer2.useNode();
        goto L79
    L71:
        r19 = Dp.m6973constructorimpl(16);
        goto L72
    L64:
        r17 = r15;
        goto L66
    L61:
        compact2 = r13;
        goto L62
    L141:
        $composer3 = $composer2;
        $composer3.skipToGroupEnd();
        compact3 = r13;
        r44 = r15;
        goto L142
    L56:
        r16 = false;
        goto L58
    L46:
        if ((196608 & $changed) != 0) goto L52;
        r15 = r90;
        if ($composer2.changedInstance(r15) == false) goto L50;
        int r120 = 131072;
    L51:
        $dirty = $dirty | r120;
        goto L54
    L50:
        r120 = 65536;
        goto L51
    L52:
        r15 = r90;
        goto L54
    L35:
        if (($changed & 24576) != 0) goto L41;
        r13 = compact;
        if ($composer2.changed(r13) == false) goto L39;
        int r121 = 16384;
    L40:
        $dirty = $dirty | r121;
        goto L42
    L39:
        r121 = 8192;
        goto L40
    L41:
        r13 = compact;
        goto L42
    L28:
        r11 = 1024;
        goto L29
    L30:
        r10 = accent;
        goto L31
    }

    public static final void copyText(Context context, String text) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(text, "text");
        Object r0 = context.getSystemService("clipboard");
        Intrinsics.checkNotNull(r0, "null cannot be cast to non-null type android.content.ClipboardManager");
        ClipboardManager clipboard = (ClipboardManager) r0;
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
