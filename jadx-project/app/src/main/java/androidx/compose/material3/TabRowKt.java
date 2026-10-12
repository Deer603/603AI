package androidx.compose.material3;

import androidx.autofill.HintConstants;
import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.EasingKt;
import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.ScrollState;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.selection.SelectableGroupKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.unit.Dp;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import androidx.profileinstaller.ProfileVerifier;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;

/* JADX INFO: compiled from: TabRow.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000`\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0016\u001a\u0094\u0001\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0012\u001a\u00020\u00012\u001e\b\u0002\u0010\u0013\u001a\u0018\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\b0\u0014¢\u0006\u0002\b\u0016¢\u0006\u0002\b\u00172\u0013\b\u0002\u0010\u0018\u001a\r\u0012\u0004\u0012\u00020\b0\u0019¢\u0006\u0002\b\u00162\u0011\u0010\u001a\u001a\r\u0012\u0004\u0012\u00020\b0\u0019¢\u0006\u0002\b\u0016H\u0007ø\u0001\u0000¢\u0006\u0004\b\u001b\u0010\u001c\u001a\u0080\u0001\u0010\u001d\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00102\u001e\b\u0002\u0010\u0013\u001a\u0018\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\b0\u0014¢\u0006\u0002\b\u0016¢\u0006\u0002\b\u00172\u0013\b\u0002\u0010\u0018\u001a\r\u0012\u0004\u0012\u00020\b0\u0019¢\u0006\u0002\b\u00162\u0011\u0010\u001a\u001a\r\u0012\u0004\u0012\u00020\b0\u0019¢\u0006\u0002\b\u0016H\u0007ø\u0001\u0000¢\u0006\u0004\b\u001e\u0010\u001f\u001a\u009a\u0001\u0010 \u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0012\u001a\u00020\u00012.\b\u0002\u0010\u0013\u001a(\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020\"0!¢\u0006\f\b#\u0012\b\b$\u0012\u0004\b\b(%\u0012\u0004\u0012\u00020\b0\u0014¢\u0006\u0002\b\u00162\u0013\b\u0002\u0010\u0018\u001a\r\u0012\u0004\u0012\u00020\b0\u0019¢\u0006\u0002\b\u00162\u0011\u0010\u001a\u001a\r\u0012\u0004\u0012\u00020\b0\u0019¢\u0006\u0002\b\u0016H\u0007ø\u0001\u0000¢\u0006\u0004\b&\u0010'\u001a\u0086\u0001\u0010(\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u00012\u0006\u0010\r\u001a\u00020\u000e2\u001c\u0010\u0013\u001a\u0018\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\b0\u0014¢\u0006\u0002\b\u0016¢\u0006\u0002\b\u00172\u0011\u0010\u0018\u001a\r\u0012\u0004\u0012\u00020\b0\u0019¢\u0006\u0002\b\u00162\u0011\u0010\u001a\u001a\r\u0012\u0004\u0012\u00020\b0\u0019¢\u0006\u0002\b\u0016H\u0003ø\u0001\u0000¢\u0006\u0004\b)\u0010*\u001a \u0001\u0010+\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2,\u0010\u0013\u001a(\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020\"0!¢\u0006\f\b#\u0012\b\b$\u0012\u0004\b\b(%\u0012\u0004\u0012\u00020\b0\u0014¢\u0006\u0002\b\u00162\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0012\u001a\u00020\u00012\u0013\b\u0002\u0010\u0018\u001a\r\u0012\u0004\u0012\u00020\b0\u0019¢\u0006\u0002\b\u00162\u0011\u0010\u001a\u001a\r\u0012\u0004\u0012\u00020\b0\u0019¢\u0006\u0002\b\u00162\u0006\u0010\r\u001a\u00020\u000eH\u0003ø\u0001\u0000¢\u0006\u0004\b,\u0010-\u001a\u0094\u0001\u0010.\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0012\u001a\u00020\u00012\u001e\b\u0002\u0010\u0013\u001a\u0018\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\b0\u0014¢\u0006\u0002\b\u0016¢\u0006\u0002\b\u00172\u0013\b\u0002\u0010\u0018\u001a\r\u0012\u0004\u0012\u00020\b0\u0019¢\u0006\u0002\b\u00162\u0011\u0010\u001a\u001a\r\u0012\u0004\u0012\u00020\b0\u0019¢\u0006\u0002\b\u0016H\u0007ø\u0001\u0000¢\u0006\u0004\b/\u0010\u001c\u001a\u0080\u0001\u00100\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00102\u001e\b\u0002\u0010\u0013\u001a\u0018\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\b0\u0014¢\u0006\u0002\b\u0016¢\u0006\u0002\b\u00172\u0013\b\u0002\u0010\u0018\u001a\r\u0012\u0004\u0012\u00020\b0\u0019¢\u0006\u0002\b\u00162\u0011\u0010\u001a\u001a\r\u0012\u0004\u0012\u00020\b0\u0019¢\u0006\u0002\b\u0016H\u0007ø\u0001\u0000¢\u0006\u0004\b1\u0010\u001f\u001a\u0090\u0001\u00102\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00102.\b\u0002\u0010\u0013\u001a(\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020\"0!¢\u0006\f\b#\u0012\b\b$\u0012\u0004\b\b(%\u0012\u0004\u0012\u00020\b0\u0014¢\u0006\u0002\b\u00162\u0013\b\u0002\u0010\u0018\u001a\r\u0012\u0004\u0012\u00020\b0\u0019¢\u0006\u0002\b\u00162\u0011\u0010\u001a\u001a\r\u0012\u0004\u0012\u00020\b0\u0019¢\u0006\u0002\b\u0016H\u0007ø\u0001\u0000¢\u0006\u0004\b3\u0010\u001f\u001an\u00104\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00102\u001c\u0010\u0013\u001a\u0018\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\b0\u0014¢\u0006\u0002\b\u0016¢\u0006\u0002\b\u00172\u0011\u0010\u0018\u001a\r\u0012\u0004\u0012\u00020\b0\u0019¢\u0006\u0002\b\u00162\u0011\u0010\u001a\u001a\r\u0012\u0004\u0012\u00020\b0\u0019¢\u0006\u0002\b\u0016H\u0003ø\u0001\u0000¢\u0006\u0004\b5\u00106\u001a~\u00107\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00102,\u0010\u0013\u001a(\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020\"0!¢\u0006\f\b#\u0012\b\b$\u0012\u0004\b\b(%\u0012\u0004\u0012\u00020\b0\u0014¢\u0006\u0002\b\u00162\u0011\u0010\u0018\u001a\r\u0012\u0004\u0012\u00020\b0\u0019¢\u0006\u0002\b\u00162\u0011\u0010\u001a\u001a\r\u0012\u0004\u0012\u00020\b0\u0019¢\u0006\u0002\b\u0016H\u0003ø\u0001\u0000¢\u0006\u0004\b8\u00106\"\u0010\u0010\u0000\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0002\"\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000\"\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00010\u0004X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u00069"}, d2 = {"ScrollableTabRowMinimumTabWidth", "Landroidx/compose/ui/unit/Dp;", "F", "ScrollableTabRowScrollSpec", "Landroidx/compose/animation/core/AnimationSpec;", "", "TabRowIndicatorSpec", "PrimaryScrollableTabRow", "", "selectedTabIndex", "", "modifier", "Landroidx/compose/ui/Modifier;", "scrollState", "Landroidx/compose/foundation/ScrollState;", "containerColor", "Landroidx/compose/ui/graphics/Color;", "contentColor", "edgePadding", "indicator", "Lkotlin/Function1;", "Landroidx/compose/material3/TabIndicatorScope;", "Landroidx/compose/runtime/Composable;", "Lkotlin/ExtensionFunctionType;", "divider", "Lkotlin/Function0;", "tabs", "PrimaryScrollableTabRow-qhFBPw4", "(ILandroidx/compose/ui/Modifier;Landroidx/compose/foundation/ScrollState;JJFLkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "PrimaryTabRow", "PrimaryTabRow-pAZo6Ak", "(ILandroidx/compose/ui/Modifier;JJLkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "ScrollableTabRow", "", "Landroidx/compose/material3/TabPosition;", "Lkotlin/ParameterName;", HintConstants.AUTOFILL_HINT_NAME, "tabPositions", "ScrollableTabRow-sKfQg0A", "(ILandroidx/compose/ui/Modifier;JJFLkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "ScrollableTabRowImpl", "ScrollableTabRowImpl-sKfQg0A", "(ILandroidx/compose/ui/Modifier;JJFLandroidx/compose/foundation/ScrollState;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "ScrollableTabRowWithSubcomposeImpl", "ScrollableTabRowWithSubcomposeImpl-qhFBPw4", "(ILkotlin/jvm/functions/Function3;Landroidx/compose/ui/Modifier;JJFLkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/foundation/ScrollState;Landroidx/compose/runtime/Composer;II)V", "SecondaryScrollableTabRow", "SecondaryScrollableTabRow-qhFBPw4", "SecondaryTabRow", "SecondaryTabRow-pAZo6Ak", "TabRow", "TabRow-pAZo6Ak", "TabRowImpl", "TabRowImpl-DTcfvLk", "(Landroidx/compose/ui/Modifier;JJLkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "TabRowWithSubcomposeImpl", "TabRowWithSubcomposeImpl-DTcfvLk", "material3_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class TabRowKt {
    private static final float ScrollableTabRowMinimumTabWidth = 0.0f;
    private static final AnimationSpec<Float> ScrollableTabRowScrollSpec = null;
    private static final AnimationSpec<Dp> TabRowIndicatorSpec = null;

    /* JADX INFO: renamed from: access$ScrollableTabRowImpl-sKfQg0A, reason: not valid java name */
    public static final /* synthetic */ void m2728access$ScrollableTabRowImplsKfQg0A(int selectedTabIndex, Modifier modifier, long containerColor, long contentColor, float edgePadding, ScrollState scrollState, Function3 indicator, Function2 divider, Function2 tabs, Composer $composer, int $changed) {
        m2721ScrollableTabRowImplsKfQg0A(selectedTabIndex, modifier, containerColor, contentColor, edgePadding, scrollState, indicator, divider, tabs, $composer, $changed);
    }

    /* JADX INFO: renamed from: access$ScrollableTabRowWithSubcomposeImpl-qhFBPw4, reason: not valid java name */
    public static final /* synthetic */ void m2729access$ScrollableTabRowWithSubcomposeImplqhFBPw4(int selectedTabIndex, Function3 indicator, Modifier modifier, long containerColor, long contentColor, float edgePadding, Function2 divider, Function2 tabs, ScrollState scrollState, Composer $composer, int $changed, int $default) {
        m2722ScrollableTabRowWithSubcomposeImplqhFBPw4(selectedTabIndex, indicator, modifier, containerColor, contentColor, edgePadding, divider, tabs, scrollState, $composer, $changed, $default);
    }

    /* JADX INFO: renamed from: access$TabRowImpl-DTcfvLk, reason: not valid java name */
    public static final /* synthetic */ void m2730access$TabRowImplDTcfvLk(Modifier modifier, long containerColor, long contentColor, Function3 indicator, Function2 divider, Function2 tabs, Composer $composer, int $changed) {
        m2726TabRowImplDTcfvLk(modifier, containerColor, contentColor, indicator, divider, tabs, $composer, $changed);
    }

    /* JADX INFO: renamed from: access$TabRowWithSubcomposeImpl-DTcfvLk, reason: not valid java name */
    public static final /* synthetic */ void m2731access$TabRowWithSubcomposeImplDTcfvLk(Modifier modifier, long containerColor, long contentColor, Function3 indicator, Function2 divider, Function2 tabs, Composer $composer, int $changed) {
        m2727TabRowWithSubcomposeImplDTcfvLk(modifier, containerColor, contentColor, indicator, divider, tabs, $composer, $changed);
    }

    public static final /* synthetic */ float access$getScrollableTabRowMinimumTabWidth$p() {
        return ScrollableTabRowMinimumTabWidth;
    }

    public static final /* synthetic */ AnimationSpec access$getScrollableTabRowScrollSpec$p() {
        return ScrollableTabRowScrollSpec;
    }

    public static final /* synthetic */ AnimationSpec access$getTabRowIndicatorSpec$p() {
        return TabRowIndicatorSpec;
    }

    /* JADX INFO: renamed from: PrimaryTabRow-pAZo6Ak, reason: not valid java name */
    public static final void m2719PrimaryTabRowpAZo6Ak(final int selectedTabIndex, Modifier modifier, long containerColor, long contentColor, Function3<? super TabIndicatorScope, ? super Composer, ? super Integer, Unit> r27, Function2<? super Composer, ? super Integer, Unit> r28, final Function2<? super Composer, ? super Integer, Unit> r29, Composer $composer, final int $changed, final int r32) {
        Composer $composer2 = $composer.startRestartGroup(-1884787284);
        ComposerKt.sourceInformation($composer2, "C(PrimaryTabRow)P(5,4,0:c#ui.graphics.Color,1:c#ui.graphics.Color,3)155@7603L21,156@7667L19,157@7746L189,166@8053L76:TabRow.kt#uh7d8r");
        int $dirty = $changed;
        if ((r32 & 1) == 0) goto L6;
        $dirty = $dirty | 6;
    L12:
        int r4 = r32 & 2;
        if (r4 == 0) goto L16;
        $dirty = $dirty | 48;
        Modifier modifier2 = modifier;
    L24:
        if (($changed & 384) == 0) goto L26;
        long containerColor2 = containerColor;
    L35:
        if (($changed & 3072) == 0) goto L37;
        long contentColor2 = contentColor;
    L45:
        int r11 = r32 & 16;
        if (r11 == 0) goto L49;
        $dirty = $dirty | 24576;
        Function3<? super TabIndicatorScope, ? super Composer, ? super Integer, Unit> r12 = r27;
    L56:
        int r13 = r32 & 32;
        if (r13 == 0) goto L60;
        $dirty = $dirty | ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
        Function2<? super Composer, ? super Integer, Unit> r14 = r28;
    L68:
        if ((r32 & 64) == 0) goto L71;
        $dirty = $dirty | 1572864;
    L79:
        if (($dirty & 599187) == 599186) goto L81;
    L84:
        $composer2.startDefaults();
        if (($changed & 1) != 0) goto L87;
    L96:
        if (r4 == 0) goto L99;
        modifier2 = Modifier.Companion;
    L99:
        if ((r32 & 4) == 0) goto L102;
        containerColor2 = TabRowDefaults.INSTANCE.getPrimaryContainerColor($composer2, 6);
        $dirty = $dirty & (-897);
    L102:
        if ((r32 & 8) == 0) goto L104;
        contentColor2 = TabRowDefaults.INSTANCE.getPrimaryContentColor($composer2, 6);
        $dirty = $dirty & (-7169);
    L104:
        if (r11 == 0) goto L106;
        r12 = ComposableLambdaKt.rememberComposableLambda(-2021049253, true, new TabRowKt$PrimaryTabRow$1(selectedTabIndex), $composer2, 54);
    L106:
        if (r13 == 0) goto L108;
        Function2<? super Composer, ? super Integer, Unit> r17 = ComposableSingletons$TabRowKt.INSTANCE.m2110getLambda1$material3_release();
        Modifier modifier3 = modifier2;
        long contentColor3 = contentColor2;
        Function3<? super TabIndicatorScope, ? super Composer, ? super Integer, Unit> r16 = r12;
        int r0 = -1884787284;
        long containerColor3 = containerColor2;
    L109:
        $composer2.endDefaults();
        if (ComposerKt.isTraceInProgress() == false) goto L112;
        ComposerKt.traceEventStart(r0, $dirty, -1, "androidx.compose.material3.PrimaryTabRow (TabRow.kt:165)");
    L112:
        Composer $composer3 = $composer2;
        m2726TabRowImplDTcfvLk(modifier3, containerColor3, contentColor3, r16, r17, r29, $composer3, (((((($dirty >> 3) & 14) | (($dirty >> 3) & 112)) | (($dirty >> 3) & 896)) | (($dirty >> 3) & 7168)) | (($dirty >> 3) & 57344)) | (458752 & ($dirty >> 3)));
        if (ComposerKt.isTraceInProgress() == false) goto L115;
        ComposerKt.traceEventEnd();
    L115:
        final long containerColor4 = containerColor3;
        final Modifier modifier4 = modifier3;
        final long contentColor4 = contentColor3;
        final Function3<? super TabIndicatorScope, ? super Composer, ? super Integer, Unit> r7 = r16;
        final Function2<? super Composer, ? super Integer, Unit> r8 = r17;
    L116:
        ScopeUpdateScope r15 = $composer3.endRestartGroup();
        if (r15 == null) goto L120;
        r15.updateScope(new TabRowKt$PrimaryTabRow$2(selectedTabIndex, modifier4, containerColor4, contentColor4, r7, r8, r29, $changed, r32));
        return;
    L120:
        return;
    L108:
        modifier3 = modifier2;
        r16 = r12;
        r17 = r14;
        r0 = -1884787284;
        containerColor3 = containerColor2;
        contentColor3 = contentColor2;
        goto L109
    L87:
        if ($composer2.getDefaultsInvalid() == true) goto L96;
        $composer2.skipToGroupEnd();
        if ((r32 & 4) == 0) goto L93;
        $dirty = $dirty & (-897);
    L93:
        if ((r32 & 8) == 0) goto L95;
        $dirty = $dirty & (-7169);
        modifier3 = modifier2;
        r16 = r12;
        r17 = r14;
        r0 = -1884787284;
        containerColor3 = containerColor2;
        contentColor3 = contentColor2;
        goto L109
    L95:
        modifier3 = modifier2;
        r16 = r12;
        r17 = r14;
        r0 = -1884787284;
        containerColor3 = containerColor2;
        contentColor3 = contentColor2;
        goto L109
    L81:
        if ($composer2.getSkipping() == false) goto L84;
        $composer2.skipToGroupEnd();
        containerColor4 = containerColor2;
        r7 = r12;
        $composer3 = $composer2;
        modifier4 = modifier2;
        contentColor4 = contentColor2;
        r8 = r14;
        goto L116
    L71:
        if (($changed & 1572864) != 0) goto L79;
        if ($composer2.changedInstance(r29) == false) goto L75;
        int r18 = 1048576;
    L76:
        $dirty = $dirty | r18;
        goto L79
    L75:
        r18 = 524288;
        goto L76
    L60:
        if ((196608 & $changed) != 0) goto L66;
        r14 = r28;
        if ($composer2.changedInstance(r14) == false) goto L64;
        int r19 = 131072;
    L65:
        $dirty = $dirty | r19;
        goto L68
    L64:
        r19 = 65536;
        goto L65
    L66:
        r14 = r28;
        goto L68
    L49:
        if (($changed & 24576) != 0) goto L55;
        r12 = r27;
        if ($composer2.changedInstance(r12) == false) goto L53;
        int r110 = 16384;
    L54:
        $dirty = $dirty | r110;
        goto L56
    L53:
        r110 = 8192;
        goto L54
    L55:
        r12 = r27;
        goto L56
    L37:
        if ((r32 & 8) != 0) goto L41;
        contentColor2 = contentColor;
        if ($composer2.changed(contentColor2) == false) goto L42;
        int r111 = 2048;
    L43:
        $dirty = $dirty | r111;
    L42:
        r111 = 1024;
        goto L43
    L41:
        contentColor2 = contentColor;
        goto L42
    L26:
        if ((r32 & 4) != 0) goto L30;
        containerColor2 = containerColor;
        if ($composer2.changed(containerColor2) == false) goto L31;
        int r9 = 256;
    L32:
        $dirty = $dirty | r9;
    L31:
        r9 = 128;
        goto L32
    L30:
        containerColor2 = containerColor;
        goto L31
    L16:
        if (($changed & 48) != 0) goto L22;
        modifier2 = modifier;
        if ($composer2.changed(modifier2) == false) goto L20;
        int r6 = 32;
    L21:
        $dirty = $dirty | r6;
        goto L24
    L20:
        r6 = 16;
        goto L21
    L22:
        modifier2 = modifier;
        goto L24
    L6:
        if (($changed & 6) != 0) goto L12;
        if ($composer2.changed(selectedTabIndex) == false) goto L10;
        int r5 = 4;
    L11:
        $dirty = $dirty | r5;
        goto L12
    L10:
        r5 = 2;
        goto L11
    }

    /* JADX INFO: renamed from: SecondaryTabRow-pAZo6Ak, reason: not valid java name */
    public static final void m2724SecondaryTabRowpAZo6Ak(final int selectedTabIndex, Modifier modifier, long containerColor, long contentColor, Function3<? super TabIndicatorScope, ? super Composer, ? super Integer, Unit> r27, Function2<? super Composer, ? super Integer, Unit> r28, final Function2<? super Composer, ? super Integer, Unit> r29, Composer $composer, final int $changed, final int r32) {
        Composer $composer2 = $composer.startRestartGroup(-1909540706);
        ComposerKt.sourceInformation($composer2, "C(SecondaryTabRow)P(5,4,0:c#ui.graphics.Color,1:c#ui.graphics.Color,3)209@10549L23,210@10615L21,212@10716L160,220@10994L76:TabRow.kt#uh7d8r");
        int $dirty = $changed;
        if ((r32 & 1) == 0) goto L6;
        $dirty = $dirty | 6;
    L12:
        int r4 = r32 & 2;
        if (r4 == 0) goto L16;
        $dirty = $dirty | 48;
        Modifier modifier2 = modifier;
    L24:
        if (($changed & 384) == 0) goto L26;
        long containerColor2 = containerColor;
    L35:
        if (($changed & 3072) == 0) goto L37;
        long contentColor2 = contentColor;
    L45:
        int r11 = r32 & 16;
        if (r11 == 0) goto L49;
        $dirty = $dirty | 24576;
        Function3<? super TabIndicatorScope, ? super Composer, ? super Integer, Unit> r12 = r27;
    L56:
        int r13 = r32 & 32;
        if (r13 == 0) goto L60;
        $dirty = $dirty | ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
        Function2<? super Composer, ? super Integer, Unit> r14 = r28;
    L68:
        if ((r32 & 64) == 0) goto L71;
        $dirty = $dirty | 1572864;
    L79:
        if (($dirty & 599187) == 599186) goto L81;
    L84:
        $composer2.startDefaults();
        if (($changed & 1) != 0) goto L87;
    L96:
        if (r4 == 0) goto L99;
        modifier2 = Modifier.Companion;
    L99:
        if ((r32 & 4) == 0) goto L102;
        containerColor2 = TabRowDefaults.INSTANCE.getSecondaryContainerColor($composer2, 6);
        $dirty = $dirty & (-897);
    L102:
        if ((r32 & 8) == 0) goto L104;
        contentColor2 = TabRowDefaults.INSTANCE.getSecondaryContentColor($composer2, 6);
        $dirty = $dirty & (-7169);
    L104:
        if (r11 == 0) goto L106;
        r12 = ComposableLambdaKt.rememberComposableLambda(286693261, true, new TabRowKt$SecondaryTabRow$1(selectedTabIndex), $composer2, 54);
    L106:
        if (r13 == 0) goto L108;
        Function2<? super Composer, ? super Integer, Unit> r17 = ComposableSingletons$TabRowKt.INSTANCE.m2111getLambda2$material3_release();
        Modifier modifier3 = modifier2;
        long contentColor3 = contentColor2;
        Function3<? super TabIndicatorScope, ? super Composer, ? super Integer, Unit> r16 = r12;
        int r0 = -1909540706;
        long containerColor3 = containerColor2;
    L109:
        $composer2.endDefaults();
        if (ComposerKt.isTraceInProgress() == false) goto L112;
        ComposerKt.traceEventStart(r0, $dirty, -1, "androidx.compose.material3.SecondaryTabRow (TabRow.kt:219)");
    L112:
        Composer $composer3 = $composer2;
        m2726TabRowImplDTcfvLk(modifier3, containerColor3, contentColor3, r16, r17, r29, $composer3, (((((($dirty >> 3) & 14) | (($dirty >> 3) & 112)) | (($dirty >> 3) & 896)) | (($dirty >> 3) & 7168)) | (($dirty >> 3) & 57344)) | (458752 & ($dirty >> 3)));
        if (ComposerKt.isTraceInProgress() == false) goto L115;
        ComposerKt.traceEventEnd();
    L115:
        final long containerColor4 = containerColor3;
        final Modifier modifier4 = modifier3;
        final long contentColor4 = contentColor3;
        final Function3<? super TabIndicatorScope, ? super Composer, ? super Integer, Unit> r7 = r16;
        final Function2<? super Composer, ? super Integer, Unit> r8 = r17;
    L116:
        ScopeUpdateScope r15 = $composer3.endRestartGroup();
        if (r15 == null) goto L120;
        r15.updateScope(new TabRowKt$SecondaryTabRow$2(selectedTabIndex, modifier4, containerColor4, contentColor4, r7, r8, r29, $changed, r32));
        return;
    L120:
        return;
    L108:
        modifier3 = modifier2;
        r16 = r12;
        r17 = r14;
        r0 = -1909540706;
        containerColor3 = containerColor2;
        contentColor3 = contentColor2;
        goto L109
    L87:
        if ($composer2.getDefaultsInvalid() == true) goto L96;
        $composer2.skipToGroupEnd();
        if ((r32 & 4) == 0) goto L93;
        $dirty = $dirty & (-897);
    L93:
        if ((r32 & 8) == 0) goto L95;
        $dirty = $dirty & (-7169);
        modifier3 = modifier2;
        r16 = r12;
        r17 = r14;
        r0 = -1909540706;
        containerColor3 = containerColor2;
        contentColor3 = contentColor2;
        goto L109
    L95:
        modifier3 = modifier2;
        r16 = r12;
        r17 = r14;
        r0 = -1909540706;
        containerColor3 = containerColor2;
        contentColor3 = contentColor2;
        goto L109
    L81:
        if ($composer2.getSkipping() == false) goto L84;
        $composer2.skipToGroupEnd();
        containerColor4 = containerColor2;
        r7 = r12;
        $composer3 = $composer2;
        modifier4 = modifier2;
        contentColor4 = contentColor2;
        r8 = r14;
        goto L116
    L71:
        if (($changed & 1572864) != 0) goto L79;
        if ($composer2.changedInstance(r29) == false) goto L75;
        int r18 = 1048576;
    L76:
        $dirty = $dirty | r18;
        goto L79
    L75:
        r18 = 524288;
        goto L76
    L60:
        if ((196608 & $changed) != 0) goto L66;
        r14 = r28;
        if ($composer2.changedInstance(r14) == false) goto L64;
        int r19 = 131072;
    L65:
        $dirty = $dirty | r19;
        goto L68
    L64:
        r19 = 65536;
        goto L65
    L66:
        r14 = r28;
        goto L68
    L49:
        if (($changed & 24576) != 0) goto L55;
        r12 = r27;
        if ($composer2.changedInstance(r12) == false) goto L53;
        int r110 = 16384;
    L54:
        $dirty = $dirty | r110;
        goto L56
    L53:
        r110 = 8192;
        goto L54
    L55:
        r12 = r27;
        goto L56
    L37:
        if ((r32 & 8) != 0) goto L41;
        contentColor2 = contentColor;
        if ($composer2.changed(contentColor2) == false) goto L42;
        int r111 = 2048;
    L43:
        $dirty = $dirty | r111;
    L42:
        r111 = 1024;
        goto L43
    L41:
        contentColor2 = contentColor;
        goto L42
    L26:
        if ((r32 & 4) != 0) goto L30;
        containerColor2 = containerColor;
        if ($composer2.changed(containerColor2) == false) goto L31;
        int r9 = 256;
    L32:
        $dirty = $dirty | r9;
    L31:
        r9 = 128;
        goto L32
    L30:
        containerColor2 = containerColor;
        goto L31
    L16:
        if (($changed & 48) != 0) goto L22;
        modifier2 = modifier;
        if ($composer2.changed(modifier2) == false) goto L20;
        int r6 = 32;
    L21:
        $dirty = $dirty | r6;
        goto L24
    L20:
        r6 = 16;
        goto L21
    L22:
        modifier2 = modifier;
        goto L24
    L6:
        if (($changed & 6) != 0) goto L12;
        if ($composer2.changed(selectedTabIndex) == false) goto L10;
        int r5 = 4;
    L11:
        $dirty = $dirty | r5;
        goto L12
    L10:
        r5 = 2;
        goto L11
    }

    /* JADX INFO: renamed from: TabRow-pAZo6Ak, reason: not valid java name */
    public static final void m2725TabRowpAZo6Ak(final int selectedTabIndex, Modifier modifier, long containerColor, long contentColor, Function3<? super List<TabPosition>, ? super Composer, ? super Integer, Unit> r27, Function2<? super Composer, ? super Integer, Unit> r28, final Function2<? super Composer, ? super Integer, Unit> r29, Composer $composer, final int $changed, final int r32) {
        Composer $composer2 = $composer.startRestartGroup(-1199178586);
        ComposerKt.sourceInformation($composer2, "C(TabRow)P(5,4,0:c#ui.graphics.Color,1:c#ui.graphics.Color,3)303@15331L21,304@15395L19,306@15507L246,316@15871L90:TabRow.kt#uh7d8r");
        int $dirty = $changed;
        if ((r32 & 1) == 0) goto L6;
        $dirty = $dirty | 6;
    L12:
        int r4 = r32 & 2;
        if (r4 == 0) goto L16;
        $dirty = $dirty | 48;
        Modifier modifier2 = modifier;
    L24:
        if (($changed & 384) == 0) goto L26;
        long containerColor2 = containerColor;
    L35:
        if (($changed & 3072) == 0) goto L37;
        long contentColor2 = contentColor;
    L45:
        int r11 = r32 & 16;
        if (r11 == 0) goto L49;
        $dirty = $dirty | 24576;
        Function3<? super List<TabPosition>, ? super Composer, ? super Integer, Unit> r12 = r27;
    L56:
        int r13 = r32 & 32;
        if (r13 == 0) goto L60;
        $dirty = $dirty | ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
        Function2<? super Composer, ? super Integer, Unit> r14 = r28;
    L68:
        if ((r32 & 64) == 0) goto L71;
        $dirty = $dirty | 1572864;
    L79:
        if (($dirty & 599187) == 599186) goto L81;
    L84:
        $composer2.startDefaults();
        if (($changed & 1) != 0) goto L87;
    L96:
        if (r4 == 0) goto L99;
        modifier2 = Modifier.Companion;
    L99:
        if ((r32 & 4) == 0) goto L102;
        containerColor2 = TabRowDefaults.INSTANCE.getPrimaryContainerColor($composer2, 6);
        $dirty = $dirty & (-897);
    L102:
        if ((r32 & 8) == 0) goto L104;
        contentColor2 = TabRowDefaults.INSTANCE.getPrimaryContentColor($composer2, 6);
        $dirty = $dirty & (-7169);
    L104:
        if (r11 == 0) goto L106;
        r12 = ComposableLambdaKt.rememberComposableLambda(-2052073983, true, new TabRowKt$TabRow$1(selectedTabIndex), $composer2, 54);
    L106:
        if (r13 == 0) goto L108;
        Function2<? super Composer, ? super Integer, Unit> r17 = ComposableSingletons$TabRowKt.INSTANCE.m2112getLambda3$material3_release();
        Modifier modifier3 = modifier2;
        long contentColor3 = contentColor2;
        Function3<? super List<TabPosition>, ? super Composer, ? super Integer, Unit> r16 = r12;
        int r0 = -1199178586;
        long containerColor3 = containerColor2;
    L109:
        $composer2.endDefaults();
        if (ComposerKt.isTraceInProgress() == false) goto L112;
        ComposerKt.traceEventStart(r0, $dirty, -1, "androidx.compose.material3.TabRow (TabRow.kt:315)");
    L112:
        Composer $composer3 = $composer2;
        m2727TabRowWithSubcomposeImplDTcfvLk(modifier3, containerColor3, contentColor3, r16, r17, r29, $composer3, (((((($dirty >> 3) & 14) | (($dirty >> 3) & 112)) | (($dirty >> 3) & 896)) | (($dirty >> 3) & 7168)) | (($dirty >> 3) & 57344)) | (458752 & ($dirty >> 3)));
        if (ComposerKt.isTraceInProgress() == false) goto L115;
        ComposerKt.traceEventEnd();
    L115:
        final long containerColor4 = containerColor3;
        final Modifier modifier4 = modifier3;
        final long contentColor4 = contentColor3;
        final Function3<? super List<TabPosition>, ? super Composer, ? super Integer, Unit> r7 = r16;
        final Function2<? super Composer, ? super Integer, Unit> r8 = r17;
    L116:
        ScopeUpdateScope r15 = $composer3.endRestartGroup();
        if (r15 == null) goto L120;
        r15.updateScope(new TabRowKt$TabRow$2(selectedTabIndex, modifier4, containerColor4, contentColor4, r7, r8, r29, $changed, r32));
        return;
    L120:
        return;
    L108:
        modifier3 = modifier2;
        r16 = r12;
        r17 = r14;
        r0 = -1199178586;
        containerColor3 = containerColor2;
        contentColor3 = contentColor2;
        goto L109
    L87:
        if ($composer2.getDefaultsInvalid() == true) goto L96;
        $composer2.skipToGroupEnd();
        if ((r32 & 4) == 0) goto L93;
        $dirty = $dirty & (-897);
    L93:
        if ((r32 & 8) == 0) goto L95;
        $dirty = $dirty & (-7169);
        modifier3 = modifier2;
        r16 = r12;
        r17 = r14;
        r0 = -1199178586;
        containerColor3 = containerColor2;
        contentColor3 = contentColor2;
        goto L109
    L95:
        modifier3 = modifier2;
        r16 = r12;
        r17 = r14;
        r0 = -1199178586;
        containerColor3 = containerColor2;
        contentColor3 = contentColor2;
        goto L109
    L81:
        if ($composer2.getSkipping() == false) goto L84;
        $composer2.skipToGroupEnd();
        containerColor4 = containerColor2;
        r7 = r12;
        $composer3 = $composer2;
        modifier4 = modifier2;
        contentColor4 = contentColor2;
        r8 = r14;
        goto L116
    L71:
        if (($changed & 1572864) != 0) goto L79;
        if ($composer2.changedInstance(r29) == false) goto L75;
        int r18 = 1048576;
    L76:
        $dirty = $dirty | r18;
        goto L79
    L75:
        r18 = 524288;
        goto L76
    L60:
        if ((196608 & $changed) != 0) goto L66;
        r14 = r28;
        if ($composer2.changedInstance(r14) == false) goto L64;
        int r19 = 131072;
    L65:
        $dirty = $dirty | r19;
        goto L68
    L64:
        r19 = 65536;
        goto L65
    L66:
        r14 = r28;
        goto L68
    L49:
        if (($changed & 24576) != 0) goto L55;
        r12 = r27;
        if ($composer2.changedInstance(r12) == false) goto L53;
        int r110 = 16384;
    L54:
        $dirty = $dirty | r110;
        goto L56
    L53:
        r110 = 8192;
        goto L54
    L55:
        r12 = r27;
        goto L56
    L37:
        if ((r32 & 8) != 0) goto L41;
        contentColor2 = contentColor;
        if ($composer2.changed(contentColor2) == false) goto L42;
        int r111 = 2048;
    L43:
        $dirty = $dirty | r111;
    L42:
        r111 = 1024;
        goto L43
    L41:
        contentColor2 = contentColor;
        goto L42
    L26:
        if ((r32 & 4) != 0) goto L30;
        containerColor2 = containerColor;
        if ($composer2.changed(containerColor2) == false) goto L31;
        int r9 = 256;
    L32:
        $dirty = $dirty | r9;
    L31:
        r9 = 128;
        goto L32
    L30:
        containerColor2 = containerColor;
        goto L31
    L16:
        if (($changed & 48) != 0) goto L22;
        modifier2 = modifier;
        if ($composer2.changed(modifier2) == false) goto L20;
        int r6 = 32;
    L21:
        $dirty = $dirty | r6;
        goto L24
    L20:
        r6 = 16;
        goto L21
    L22:
        modifier2 = modifier;
        goto L24
    L6:
        if (($changed & 6) != 0) goto L12;
        if ($composer2.changed(selectedTabIndex) == false) goto L10;
        int r5 = 4;
    L11:
        $dirty = $dirty | r5;
        goto L12
    L10:
        r5 = 2;
        goto L11
    }

    /* JADX INFO: renamed from: PrimaryScrollableTabRow-qhFBPw4, reason: not valid java name */
    public static final void m2718PrimaryScrollableTabRowqhFBPw4(final int selectedTabIndex, Modifier modifier, ScrollState scrollState, long containerColor, long contentColor, float edgePadding, Function3<? super TabIndicatorScope, ? super Composer, ? super Integer, Unit> r29, Function2<? super Composer, ? super Integer, Unit> r30, final Function2<? super Composer, ? super Integer, Unit> r31, Composer $composer, final int $changed, final int r34) {
        Composer $composer2 = $composer.startRestartGroup(-1763241113);
        ComposerKt.sourceInformation($composer2, "C(PrimaryScrollableTabRow)P(7,5,6,0:c#ui.graphics.Color,1:c#ui.graphics.Color,3:c#ui.unit.Dp,4)358@18337L21,359@18403L21,360@18467L19,363@18637L198,372@18953L328:TabRow.kt#uh7d8r");
        int $dirty = $changed;
        if ((r34 & 1) == 0) goto L6;
        $dirty = $dirty | 6;
    L12:
        int r3 = r34 & 2;
        if (r3 == 0) goto L16;
        $dirty = $dirty | 48;
        Modifier modifier2 = modifier;
    L24:
        if (($changed & 384) == 0) goto L26;
        ScrollState scrollState2 = scrollState;
    L35:
        if (($changed & 3072) == 0) goto L37;
        long containerColor2 = containerColor;
    L46:
        if (($changed & 24576) == 0) goto L48;
        long contentColor2 = contentColor;
    L56:
        int r10 = r34 & 32;
        if (r10 == 0) goto L60;
        $dirty = $dirty | ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
        float edgePadding2 = edgePadding;
    L67:
        int r15 = r34 & 64;
        if (r15 == 0) goto L71;
        $dirty = $dirty | 1572864;
    L78:
        int r1 = r34 & 128;
        if (r1 == 0) goto L82;
        $dirty = $dirty | 12582912;
    L90:
        if ((r34 & 256) == 0) goto L93;
        $dirty = $dirty | 100663296;
    L101:
        if (($dirty & 38347923) == 38347922) goto L103;
    L106:
        $composer2.startDefaults();
        if (($changed & 1) != 0) goto L109;
    L121:
        if (r3 == 0) goto L124;
        modifier2 = Modifier.Companion;
    L124:
        if ((r34 & 4) == 0) goto L127;
        $dirty = $dirty & (-897);
        scrollState2 = ScrollKt.rememberScrollState(0, $composer2, 0, 1);
    L127:
        if ((r34 & 8) == 0) goto L130;
        containerColor2 = TabRowDefaults.INSTANCE.getPrimaryContainerColor($composer2, 6);
        $dirty = $dirty & (-7169);
    L130:
        if ((r34 & 16) == 0) goto L132;
        contentColor2 = TabRowDefaults.INSTANCE.getPrimaryContentColor($composer2, 6);
        $dirty = $dirty & (-57345);
    L132:
        if (r10 == 0) goto L134;
        edgePadding2 = TabRowDefaults.INSTANCE.m2716getScrollableTabRowEdgeStartPaddingD9Ej5fM();
    L134:
        if (r15 == 0) goto L136;
        ComposableLambda r2 = ComposableLambdaKt.rememberComposableLambda(1601820568, true, new TabRowKt$PrimaryScrollableTabRow$1(selectedTabIndex), $composer2, 54);
    L137:
        if (r1 == 0) goto L139;
        int $dirty2 = $dirty;
        long r19 = contentColor2;
        Function3<? super TabIndicatorScope, ? super Composer, ? super Integer, Unit> r8 = r2;
        Function2<? super Composer, ? super Integer, Unit> r9 = ComposableSingletons$TabRowKt.INSTANCE.m2113getLambda4$material3_release();
        Modifier modifier3 = modifier2;
        long containerColor3 = containerColor2;
        float edgePadding3 = edgePadding2;
        ScrollState scrollState3 = scrollState2;
        long contentColor3 = r19;
    L140:
        $composer2.endDefaults();
        if (ComposerKt.isTraceInProgress() == false) goto L143;
        ComposerKt.traceEventStart(-1763241113, $dirty2, -1, "androidx.compose.material3.PrimaryScrollableTabRow (TabRow.kt:371)");
    L143:
        m2721ScrollableTabRowImplsKfQg0A(selectedTabIndex, modifier3, containerColor3, contentColor3, edgePadding3, scrollState3, r8, r9, r31, $composer2, (((((((($dirty2 & 14) | ($dirty2 & 112)) | (($dirty2 >> 3) & 896)) | (($dirty2 >> 3) & 7168)) | (57344 & ($dirty2 >> 3))) | (($dirty2 << 9) & 458752)) | (3670016 & $dirty2)) | (29360128 & $dirty2)) | (234881024 & $dirty2));
        if (ComposerKt.isTraceInProgress() == false) goto L146;
        ComposerKt.traceEventEnd();
    L146:
        final Function2<? super Composer, ? super Integer, Unit> r11 = r9;
        final Function3<? super TabIndicatorScope, ? super Composer, ? super Integer, Unit> r12 = r8;
        final float edgePadding4 = edgePadding3;
        long r110 = containerColor3;
        final Modifier modifier4 = modifier3;
        final ScrollState scrollState4 = scrollState3;
        final long contentColor4 = contentColor3;
        final long contentColor5 = r110;
    L147:
        ScopeUpdateScope r0 = $composer2.endRestartGroup();
        if (r0 == null) goto L151;
        r0.updateScope(new TabRowKt$PrimaryScrollableTabRow$2(selectedTabIndex, modifier4, scrollState4, contentColor5, contentColor4, edgePadding4, r12, r11, r31, $changed, r34));
        return;
    L151:
        return;
    L139:
        $dirty2 = $dirty;
        containerColor3 = containerColor2;
        edgePadding3 = edgePadding2;
        scrollState3 = scrollState2;
        long r111 = contentColor2;
        r9 = r30;
        r8 = r2;
        modifier3 = modifier2;
        contentColor3 = r111;
        goto L140
    L136:
        r2 = r29;
        goto L137
    L109:
        if ($composer2.getDefaultsInvalid() == true) goto L121;
        $composer2.skipToGroupEnd();
        if ((r34 & 4) == 0) goto L115;
        $dirty = $dirty & (-897);
    L115:
        if ((r34 & 8) == 0) goto L118;
        $dirty = $dirty & (-7169);
    L118:
        if ((r34 & 16) == 0) goto L120;
        $dirty2 = $dirty & (-57345);
        modifier3 = modifier2;
        containerColor3 = containerColor2;
        edgePadding3 = edgePadding2;
        scrollState3 = scrollState2;
        contentColor3 = contentColor2;
        r8 = r29;
        r9 = r30;
        goto L140
    L120:
        $dirty2 = $dirty;
        modifier3 = modifier2;
        containerColor3 = containerColor2;
        edgePadding3 = edgePadding2;
        scrollState3 = scrollState2;
        contentColor3 = contentColor2;
        r8 = r29;
        r9 = r30;
        goto L140
    L103:
        if ($composer2.getSkipping() == false) goto L106;
        $composer2.skipToGroupEnd();
        r11 = r30;
        modifier4 = modifier2;
        scrollState4 = scrollState2;
        contentColor5 = containerColor2;
        contentColor4 = contentColor2;
        edgePadding4 = edgePadding2;
        r12 = r29;
        goto L147
    L93:
        if (($changed & 100663296) != 0) goto L101;
        if ($composer2.changedInstance(r31) == false) goto L97;
        int r18 = AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
    L98:
        $dirty = $dirty | r18;
        goto L101
    L97:
        r18 = 33554432;
        goto L98
    L82:
        if (($changed & 12582912) != 0) goto L90;
        if ($composer2.changedInstance(r30) == false) goto L86;
        int r112 = 8388608;
    L87:
        $dirty = $dirty | r112;
        goto L90
    L86:
        r112 = 4194304;
        goto L87
    L71:
        if (($changed & 1572864) != 0) goto L78;
        if ($composer2.changedInstance(r29) == false) goto L75;
        int r17 = 1048576;
    L76:
        $dirty = $dirty | r17;
        goto L78
    L75:
        r17 = 524288;
        goto L76
    L60:
        if ((196608 & $changed) != 0) goto L66;
        edgePadding2 = edgePadding;
        if ($composer2.changed(edgePadding2) == false) goto L64;
        int r16 = 131072;
    L65:
        $dirty = $dirty | r16;
        goto L67
    L64:
        r16 = 65536;
        goto L65
    L66:
        edgePadding2 = edgePadding;
        goto L67
    L48:
        if ((r34 & 16) != 0) goto L52;
        contentColor2 = contentColor;
        if ($composer2.changed(contentColor2) == false) goto L53;
        int r13 = 16384;
    L54:
        $dirty = $dirty | r13;
    L53:
        r13 = 8192;
        goto L54
    L52:
        contentColor2 = contentColor;
        goto L53
    L37:
        if ((r34 & 8) != 0) goto L41;
        containerColor2 = containerColor;
        if ($composer2.changed(containerColor2) == false) goto L42;
        int r14 = 2048;
    L43:
        $dirty = $dirty | r14;
    L42:
        r14 = 1024;
        goto L43
    L41:
        containerColor2 = containerColor;
        goto L42
    L26:
        if ((r34 & 4) != 0) goto L30;
        scrollState2 = scrollState;
        if ($composer2.changed(scrollState2) == false) goto L31;
        int r6 = 256;
    L32:
        $dirty = $dirty | r6;
    L31:
        r6 = 128;
        goto L32
    L30:
        scrollState2 = scrollState;
        goto L31
    L16:
        if (($changed & 48) != 0) goto L22;
        modifier2 = modifier;
        if ($composer2.changed(modifier2) == false) goto L20;
        int r5 = 32;
    L21:
        $dirty = $dirty | r5;
        goto L24
    L20:
        r5 = 16;
        goto L21
    L22:
        modifier2 = modifier;
        goto L24
    L6:
        if (($changed & 6) != 0) goto L12;
        if ($composer2.changed(selectedTabIndex) == false) goto L10;
        int r4 = 4;
    L11:
        $dirty = $dirty | r4;
        goto L12
    L10:
        r4 = 2;
        goto L11
    }

    /* JADX INFO: renamed from: SecondaryScrollableTabRow-qhFBPw4, reason: not valid java name */
    public static final void m2723SecondaryScrollableTabRowqhFBPw4(final int selectedTabIndex, Modifier modifier, ScrollState scrollState, long containerColor, long contentColor, float edgePadding, Function3<? super TabIndicatorScope, ? super Composer, ? super Integer, Unit> r29, Function2<? super Composer, ? super Integer, Unit> r30, final Function2<? super Composer, ? super Integer, Unit> r31, Composer $composer, final int $changed, final int r34) {
        Composer $composer2 = $composer.startRestartGroup(1821940917);
        ComposerKt.sourceInformation($composer2, "C(SecondaryScrollableTabRow)P(7,5,6,0:c#ui.graphics.Color,1:c#ui.graphics.Color,3:c#ui.unit.Dp,4)428@21932L21,429@21998L23,430@22064L21,433@22236L160,441@22514L327:TabRow.kt#uh7d8r");
        int $dirty = $changed;
        if ((r34 & 1) == 0) goto L6;
        $dirty = $dirty | 6;
    L12:
        int r3 = r34 & 2;
        if (r3 == 0) goto L16;
        $dirty = $dirty | 48;
        Modifier modifier2 = modifier;
    L24:
        if (($changed & 384) == 0) goto L26;
        ScrollState scrollState2 = scrollState;
    L35:
        if (($changed & 3072) == 0) goto L37;
        long containerColor2 = containerColor;
    L46:
        if (($changed & 24576) == 0) goto L48;
        long contentColor2 = contentColor;
    L56:
        int r10 = r34 & 32;
        if (r10 == 0) goto L60;
        $dirty = $dirty | ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
        float edgePadding2 = edgePadding;
    L67:
        int r15 = r34 & 64;
        if (r15 == 0) goto L71;
        $dirty = $dirty | 1572864;
    L78:
        int r1 = r34 & 128;
        if (r1 == 0) goto L82;
        $dirty = $dirty | 12582912;
    L90:
        if ((r34 & 256) == 0) goto L93;
        $dirty = $dirty | 100663296;
    L101:
        if (($dirty & 38347923) == 38347922) goto L103;
    L106:
        $composer2.startDefaults();
        if (($changed & 1) != 0) goto L109;
    L121:
        if (r3 == 0) goto L124;
        modifier2 = Modifier.Companion;
    L124:
        if ((r34 & 4) == 0) goto L127;
        $dirty = $dirty & (-897);
        scrollState2 = ScrollKt.rememberScrollState(0, $composer2, 0, 1);
    L127:
        if ((r34 & 8) == 0) goto L130;
        containerColor2 = TabRowDefaults.INSTANCE.getSecondaryContainerColor($composer2, 6);
        $dirty = $dirty & (-7169);
    L130:
        if ((r34 & 16) == 0) goto L132;
        contentColor2 = TabRowDefaults.INSTANCE.getSecondaryContentColor($composer2, 6);
        $dirty = $dirty & (-57345);
    L132:
        if (r10 == 0) goto L134;
        edgePadding2 = TabRowDefaults.INSTANCE.m2716getScrollableTabRowEdgeStartPaddingD9Ej5fM();
    L134:
        if (r15 == 0) goto L136;
        ComposableLambda r2 = ComposableLambdaKt.rememberComposableLambda(1535842470, true, new TabRowKt$SecondaryScrollableTabRow$1(selectedTabIndex), $composer2, 54);
    L137:
        if (r1 == 0) goto L139;
        int $dirty2 = $dirty;
        long r19 = contentColor2;
        Function3<? super TabIndicatorScope, ? super Composer, ? super Integer, Unit> r8 = r2;
        Function2<? super Composer, ? super Integer, Unit> r9 = ComposableSingletons$TabRowKt.INSTANCE.m2114getLambda5$material3_release();
        Modifier modifier3 = modifier2;
        long containerColor3 = containerColor2;
        float edgePadding3 = edgePadding2;
        ScrollState scrollState3 = scrollState2;
        long contentColor3 = r19;
    L140:
        $composer2.endDefaults();
        if (ComposerKt.isTraceInProgress() == false) goto L143;
        ComposerKt.traceEventStart(1821940917, $dirty2, -1, "androidx.compose.material3.SecondaryScrollableTabRow (TabRow.kt:440)");
    L143:
        m2721ScrollableTabRowImplsKfQg0A(selectedTabIndex, modifier3, containerColor3, contentColor3, edgePadding3, scrollState3, r8, r9, r31, $composer2, (((((((($dirty2 & 14) | ($dirty2 & 112)) | (($dirty2 >> 3) & 896)) | (($dirty2 >> 3) & 7168)) | (57344 & ($dirty2 >> 3))) | (($dirty2 << 9) & 458752)) | (3670016 & $dirty2)) | (29360128 & $dirty2)) | (234881024 & $dirty2));
        if (ComposerKt.isTraceInProgress() == false) goto L146;
        ComposerKt.traceEventEnd();
    L146:
        final Function2<? super Composer, ? super Integer, Unit> r11 = r9;
        final Function3<? super TabIndicatorScope, ? super Composer, ? super Integer, Unit> r12 = r8;
        final float edgePadding4 = edgePadding3;
        long r110 = containerColor3;
        final Modifier modifier4 = modifier3;
        final ScrollState scrollState4 = scrollState3;
        final long contentColor4 = contentColor3;
        final long contentColor5 = r110;
    L147:
        ScopeUpdateScope r0 = $composer2.endRestartGroup();
        if (r0 == null) goto L151;
        r0.updateScope(new TabRowKt$SecondaryScrollableTabRow$2(selectedTabIndex, modifier4, scrollState4, contentColor5, contentColor4, edgePadding4, r12, r11, r31, $changed, r34));
        return;
    L151:
        return;
    L139:
        $dirty2 = $dirty;
        containerColor3 = containerColor2;
        edgePadding3 = edgePadding2;
        scrollState3 = scrollState2;
        long r111 = contentColor2;
        r9 = r30;
        r8 = r2;
        modifier3 = modifier2;
        contentColor3 = r111;
        goto L140
    L136:
        r2 = r29;
        goto L137
    L109:
        if ($composer2.getDefaultsInvalid() == true) goto L121;
        $composer2.skipToGroupEnd();
        if ((r34 & 4) == 0) goto L115;
        $dirty = $dirty & (-897);
    L115:
        if ((r34 & 8) == 0) goto L118;
        $dirty = $dirty & (-7169);
    L118:
        if ((r34 & 16) == 0) goto L120;
        $dirty2 = $dirty & (-57345);
        modifier3 = modifier2;
        containerColor3 = containerColor2;
        edgePadding3 = edgePadding2;
        scrollState3 = scrollState2;
        contentColor3 = contentColor2;
        r8 = r29;
        r9 = r30;
        goto L140
    L120:
        $dirty2 = $dirty;
        modifier3 = modifier2;
        containerColor3 = containerColor2;
        edgePadding3 = edgePadding2;
        scrollState3 = scrollState2;
        contentColor3 = contentColor2;
        r8 = r29;
        r9 = r30;
        goto L140
    L103:
        if ($composer2.getSkipping() == false) goto L106;
        $composer2.skipToGroupEnd();
        r11 = r30;
        modifier4 = modifier2;
        scrollState4 = scrollState2;
        contentColor5 = containerColor2;
        contentColor4 = contentColor2;
        edgePadding4 = edgePadding2;
        r12 = r29;
        goto L147
    L93:
        if (($changed & 100663296) != 0) goto L101;
        if ($composer2.changedInstance(r31) == false) goto L97;
        int r18 = AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
    L98:
        $dirty = $dirty | r18;
        goto L101
    L97:
        r18 = 33554432;
        goto L98
    L82:
        if (($changed & 12582912) != 0) goto L90;
        if ($composer2.changedInstance(r30) == false) goto L86;
        int r112 = 8388608;
    L87:
        $dirty = $dirty | r112;
        goto L90
    L86:
        r112 = 4194304;
        goto L87
    L71:
        if (($changed & 1572864) != 0) goto L78;
        if ($composer2.changedInstance(r29) == false) goto L75;
        int r17 = 1048576;
    L76:
        $dirty = $dirty | r17;
        goto L78
    L75:
        r17 = 524288;
        goto L76
    L60:
        if ((196608 & $changed) != 0) goto L66;
        edgePadding2 = edgePadding;
        if ($composer2.changed(edgePadding2) == false) goto L64;
        int r16 = 131072;
    L65:
        $dirty = $dirty | r16;
        goto L67
    L64:
        r16 = 65536;
        goto L65
    L66:
        edgePadding2 = edgePadding;
        goto L67
    L48:
        if ((r34 & 16) != 0) goto L52;
        contentColor2 = contentColor;
        if ($composer2.changed(contentColor2) == false) goto L53;
        int r13 = 16384;
    L54:
        $dirty = $dirty | r13;
    L53:
        r13 = 8192;
        goto L54
    L52:
        contentColor2 = contentColor;
        goto L53
    L37:
        if ((r34 & 8) != 0) goto L41;
        containerColor2 = containerColor;
        if ($composer2.changed(containerColor2) == false) goto L42;
        int r14 = 2048;
    L43:
        $dirty = $dirty | r14;
    L42:
        r14 = 1024;
        goto L43
    L41:
        containerColor2 = containerColor;
        goto L42
    L26:
        if ((r34 & 4) != 0) goto L30;
        scrollState2 = scrollState;
        if ($composer2.changed(scrollState2) == false) goto L31;
        int r6 = 256;
    L32:
        $dirty = $dirty | r6;
    L31:
        r6 = 128;
        goto L32
    L30:
        scrollState2 = scrollState;
        goto L31
    L16:
        if (($changed & 48) != 0) goto L22;
        modifier2 = modifier;
        if ($composer2.changed(modifier2) == false) goto L20;
        int r5 = 32;
    L21:
        $dirty = $dirty | r5;
        goto L24
    L20:
        r5 = 16;
        goto L21
    L22:
        modifier2 = modifier;
        goto L24
    L6:
        if (($changed & 6) != 0) goto L12;
        if ($composer2.changed(selectedTabIndex) == false) goto L10;
        int r4 = 4;
    L11:
        $dirty = $dirty | r4;
        goto L12
    L10:
        r4 = 2;
        goto L11
    }

    /* JADX INFO: renamed from: ScrollableTabRow-sKfQg0A, reason: not valid java name */
    public static final void m2720ScrollableTabRowsKfQg0A(final int selectedTabIndex, Modifier modifier, long containerColor, long contentColor, float edgePadding, Function3<? super List<TabPosition>, ? super Composer, ? super Integer, Unit> r26, Function2<? super Composer, ? super Integer, Unit> r27, final Function2<? super Composer, ? super Integer, Unit> r28, Composer $composer, final int $changed, final int r31) {
        Composer $composer2 = $composer.startRestartGroup(-497821003);
        ComposerKt.sourceInformation($composer2, "C(ScrollableTabRow)P(6,5,0:c#ui.graphics.Color,1:c#ui.graphics.Color,3:c#ui.unit.Dp,4)496@25397L21,497@25461L19,500@25644L164,517@26250L21,508@25926L351:TabRow.kt#uh7d8r");
        int $dirty = $changed;
        if ((r31 & 1) == 0) goto L6;
        $dirty = $dirty | 6;
    L12:
        int r3 = r31 & 2;
        if (r3 == 0) goto L16;
        $dirty = $dirty | 48;
        Modifier modifier2 = modifier;
    L24:
        if (($changed & 384) == 0) goto L26;
        long containerColor2 = containerColor;
    L35:
        if (($changed & 3072) == 0) goto L37;
        long contentColor2 = contentColor;
    L45:
        int r9 = r31 & 16;
        if (r9 == 0) goto L49;
        $dirty = $dirty | 24576;
        float edgePadding2 = edgePadding;
    L56:
        int r12 = r31 & 32;
        if (r12 == 0) goto L60;
        $dirty = $dirty | ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
        Function3<? super List<TabPosition>, ? super Composer, ? super Integer, Unit> r13 = r26;
    L67:
        int r16 = r31 & 64;
        if (r16 == 0) goto L71;
        $dirty = $dirty | 1572864;
    L79:
        if ((r31 & 128) == 0) goto L82;
        $dirty = $dirty | 12582912;
    L90:
        if (($dirty & 4793491) == 4793490) goto L92;
    L95:
        $composer2.startDefaults();
        if (($changed & 1) != 0) goto L98;
    L107:
        if (r3 == 0) goto L110;
        modifier2 = Modifier.Companion;
    L110:
        if ((r31 & 4) == 0) goto L113;
        containerColor2 = TabRowDefaults.INSTANCE.getPrimaryContainerColor($composer2, 6);
        $dirty = $dirty & (-897);
    L113:
        if ((r31 & 8) == 0) goto L115;
        contentColor2 = TabRowDefaults.INSTANCE.getPrimaryContentColor($composer2, 6);
        $dirty = $dirty & (-7169);
    L115:
        if (r9 == 0) goto L117;
        edgePadding2 = TabRowDefaults.INSTANCE.m2716getScrollableTabRowEdgeStartPaddingD9Ej5fM();
    L117:
        if (r12 == 0) goto L119;
        r13 = ComposableLambdaKt.rememberComposableLambda(-913748678, true, new TabRowKt$ScrollableTabRow$1(selectedTabIndex), $composer2, 54);
    L119:
        if (r16 == 0) goto L121;
        int $dirty2 = $dirty;
        final Modifier modifier3 = modifier2;
        final long containerColor3 = containerColor2;
        final long contentColor3 = contentColor2;
        final float edgePadding3 = edgePadding2;
        Function2<? super Composer, ? super Integer, Unit> r8 = ComposableSingletons$TabRowKt.INSTANCE.m2115getLambda6$material3_release();
        Function3<? super List<TabPosition>, ? super Composer, ? super Integer, Unit> r1 = r13;
    L122:
        $composer2.endDefaults();
        if (ComposerKt.isTraceInProgress() == false) goto L125;
        ComposerKt.traceEventStart(-497821003, $dirty2, -1, "androidx.compose.material3.ScrollableTabRow (TabRow.kt:507)");
    L125:
        m2722ScrollableTabRowWithSubcomposeImplqhFBPw4(selectedTabIndex, r1, modifier3, containerColor3, contentColor3, edgePadding3, r8, r28, ScrollKt.rememberScrollState(0, $composer2, 0, 1), $composer2, ((((((($dirty2 & 14) | (($dirty2 >> 12) & 112)) | (($dirty2 << 3) & 896)) | (($dirty2 << 3) & 7168)) | (($dirty2 << 3) & 57344)) | (($dirty2 << 3) & 458752)) | (3670016 & $dirty2)) | (29360128 & $dirty2), 0);
        if (ComposerKt.isTraceInProgress() == false) goto L128;
        ComposerKt.traceEventEnd();
    L128:
        final Function2<? super Composer, ? super Integer, Unit> r10 = r8;
        final Function3<? super List<TabPosition>, ? super Composer, ? super Integer, Unit> r11 = r1;
    L129:
        ScopeUpdateScope r0 = $composer2.endRestartGroup();
        if (r0 == null) goto L133;
        r0.updateScope(new TabRowKt$ScrollableTabRow$2(selectedTabIndex, modifier3, containerColor3, contentColor3, edgePadding3, r11, r10, r28, $changed, r31));
        return;
    L133:
        return;
    L121:
        $dirty2 = $dirty;
        modifier3 = modifier2;
        containerColor3 = containerColor2;
        contentColor3 = contentColor2;
        edgePadding3 = edgePadding2;
        r1 = r13;
        r8 = r27;
        goto L122
    L98:
        if ($composer2.getDefaultsInvalid() == true) goto L107;
        $composer2.skipToGroupEnd();
        if ((r31 & 4) == 0) goto L104;
        $dirty = $dirty & (-897);
    L104:
        if ((r31 & 8) == 0) goto L106;
        $dirty2 = $dirty & (-7169);
        modifier3 = modifier2;
        containerColor3 = containerColor2;
        contentColor3 = contentColor2;
        edgePadding3 = edgePadding2;
        r1 = r13;
        r8 = r27;
        goto L122
    L106:
        $dirty2 = $dirty;
        modifier3 = modifier2;
        containerColor3 = containerColor2;
        contentColor3 = contentColor2;
        edgePadding3 = edgePadding2;
        r1 = r13;
        r8 = r27;
        goto L122
    L92:
        if ($composer2.getSkipping() == false) goto L95;
        $composer2.skipToGroupEnd();
        r10 = r27;
        modifier3 = modifier2;
        containerColor3 = containerColor2;
        contentColor3 = contentColor2;
        edgePadding3 = edgePadding2;
        r11 = r13;
        goto L129
    L82:
        if (($changed & 12582912) != 0) goto L90;
        if ($composer2.changedInstance(r28) == false) goto L86;
        int r18 = 8388608;
    L87:
        $dirty = $dirty | r18;
        goto L90
    L86:
        r18 = 4194304;
        goto L87
    L71:
        if (($changed & 1572864) != 0) goto L79;
        if ($composer2.changedInstance(r27) == false) goto L75;
        int r19 = 1048576;
    L76:
        $dirty = $dirty | r19;
        goto L79
    L75:
        r19 = 524288;
        goto L76
    L60:
        if ((196608 & $changed) != 0) goto L66;
        r13 = r26;
        if ($composer2.changedInstance(r13) == false) goto L64;
        int r17 = 131072;
    L65:
        $dirty = $dirty | r17;
        goto L67
    L64:
        r17 = 65536;
        goto L65
    L66:
        r13 = r26;
        goto L67
    L49:
        if (($changed & 24576) != 0) goto L55;
        edgePadding2 = edgePadding;
        if ($composer2.changed(edgePadding2) == false) goto L53;
        int r14 = 16384;
    L54:
        $dirty = $dirty | r14;
        goto L56
    L53:
        r14 = 8192;
        goto L54
    L55:
        edgePadding2 = edgePadding;
        goto L56
    L37:
        if ((r31 & 8) != 0) goto L41;
        contentColor2 = contentColor;
        if ($composer2.changed(contentColor2) == false) goto L42;
        int r15 = 2048;
    L43:
        $dirty = $dirty | r15;
    L42:
        r15 = 1024;
        goto L43
    L41:
        contentColor2 = contentColor;
        goto L42
    L26:
        if ((r31 & 4) != 0) goto L30;
        containerColor2 = containerColor;
        if ($composer2.changed(containerColor2) == false) goto L31;
        int r7 = 256;
    L32:
        $dirty = $dirty | r7;
    L31:
        r7 = 128;
        goto L32
    L30:
        containerColor2 = containerColor;
        goto L31
    L16:
        if (($changed & 48) != 0) goto L22;
        modifier2 = modifier;
        if ($composer2.changed(modifier2) == false) goto L20;
        int r5 = 32;
    L21:
        $dirty = $dirty | r5;
        goto L24
    L20:
        r5 = 16;
        goto L21
    L22:
        modifier2 = modifier;
        goto L24
    L6:
        if (($changed & 6) != 0) goto L12;
        if ($composer2.changed(selectedTabIndex) == false) goto L10;
        int r4 = 4;
    L11:
        $dirty = $dirty | r4;
        goto L12
    L10:
        r4 = 2;
        goto L11
    }

    /* JADX INFO: renamed from: TabRowImpl-DTcfvLk, reason: not valid java name */
    private static final void m2726TabRowImplDTcfvLk(Modifier modifier, final long containerColor, final long contentColor, final Function3<? super TabIndicatorScope, ? super Composer, ? super Integer, Unit> r28, final Function2<? super Composer, ? super Integer, Unit> r29, final Function2<? super Composer, ? super Integer, Unit> r30, Composer $composer, final int $changed) {
        Composer $composer2 = $composer.startRestartGroup(1757425411);
        ComposerKt.sourceInformation($composer2, "C(TabRowImpl)P(4,0:c#ui.graphics.Color,1:c#ui.graphics.Color,3)576@28021L4041,572@27891L4171:TabRow.kt#uh7d8r");
        int $dirty = $changed;
        if (($changed & 6) != 0) goto L9;
        Modifier r3 = modifier;
        if ($composer2.changed(r3) == false) goto L7;
        int r4 = 4;
    L8:
        $dirty = $dirty | r4;
    L11:
        if (($changed & 48) != 0) goto L17;
        long r12 = containerColor;
        if ($composer2.changed(r12) == false) goto L15;
        int r5 = 32;
    L16:
        $dirty = $dirty | r5;
    L19:
        if (($changed & 384) != 0) goto L25;
        long r14 = contentColor;
        if ($composer2.changed(r14) == false) goto L23;
        int r6 = 256;
    L24:
        $dirty = $dirty | r6;
    L27:
        if (($changed & 3072) != 0) goto L34;
        if ($composer2.changedInstance(r28) == false) goto L31;
        int r7 = 2048;
    L32:
        $dirty = $dirty | r7;
        goto L34
    L31:
        r7 = 1024;
    L34:
        if (($changed & 24576) != 0) goto L41;
        if ($composer2.changedInstance(r29) == false) goto L38;
        int r8 = 16384;
    L39:
        $dirty = $dirty | r8;
        goto L41
    L38:
        r8 = 8192;
    L41:
        if ((196608 & $changed) != 0) goto L48;
        if ($composer2.changedInstance(r30) == false) goto L45;
        int r9 = 131072;
    L46:
        $dirty = $dirty | r9;
        goto L48
    L45:
        r9 = 65536;
    L48:
        if ((74899 & $dirty) != 74898) goto L54;
        if ($composer2.getSkipping() == false) goto L54;
        $composer2.skipToGroupEnd();
        Composer $composer3 = $composer2;
    L59:
        ScopeUpdateScope r10 = $composer3.endRestartGroup();
        if (r10 == null) goto L63;
        final Modifier r1 = r3;
        r10.updateScope(new TabRowKt$TabRowImpl$2(r1, containerColor, contentColor, r28, r29, r30, $changed));
        return;
    L63:
        return;
    L54:
        if (ComposerKt.isTraceInProgress() == false) goto L56;
        ComposerKt.traceEventStart(1757425411, $dirty, -1, "androidx.compose.material3.TabRowImpl (TabRow.kt:571)");
    L56:
        $composer3 = $composer2;
        SurfaceKt.m2670SurfaceT9BRK9s(SelectableGroupKt.selectableGroup(r3), null, r12, r14, 0.0f, 0.0f, null, ComposableLambdaKt.rememberComposableLambda(-65106680, true, new TabRowKt$TabRowImpl$1(r30, r29, r28), $composer2, 54), $composer3, ((($dirty << 3) & 896) | 12582912) | (($dirty << 3) & 7168), 114);
        if (ComposerKt.isTraceInProgress() == false) goto L59;
        ComposerKt.traceEventEnd();
        goto L59
    L23:
        r6 = 128;
        goto L24
    L25:
        r14 = contentColor;
        goto L27
    L15:
        r5 = 16;
        goto L16
    L17:
        r12 = containerColor;
        goto L19
    L7:
        r4 = 2;
        goto L8
    L9:
        r3 = modifier;
        goto L11
    }

    /* JADX INFO: renamed from: ScrollableTabRowImpl-sKfQg0A, reason: not valid java name */
    private static final void m2721ScrollableTabRowImplsKfQg0A(final int selectedTabIndex, final Modifier modifier, final long containerColor, final long contentColor, final float edgePadding, final ScrollState scrollState, final Function3<? super TabIndicatorScope, ? super Composer, ? super Integer, Unit> r34, final Function2<? super Composer, ? super Integer, Unit> r35, final Function2<? super Composer, ? super Integer, Unit> r36, Composer $composer, final int $changed) {
        Composer $composer2 = $composer.startRestartGroup(-1594140035);
        ComposerKt.sourceInformation($composer2, "C(ScrollableTabRowImpl)P(7,5,0:c#ui.graphics.Color,1:c#ui.graphics.Color,3:c#ui.unit.Dp,6,4)710@32775L5081,700@32441L5415:TabRow.kt#uh7d8r");
        int $dirty = $changed;
        if (($changed & 6) != 0) goto L11;
        if ($composer2.changed(selectedTabIndex) == false) goto L7;
        int r6 = 4;
    L8:
        $dirty = $dirty | r6;
        goto L11
    L7:
        r6 = 2;
    L11:
        if (($changed & 48) != 0) goto L18;
        if ($composer2.changed(modifier) == false) goto L15;
        int r7 = 32;
    L16:
        $dirty = $dirty | r7;
        goto L18
    L15:
        r7 = 16;
    L18:
        if (($changed & 384) != 0) goto L26;
        if ($composer2.changed(containerColor) == false) goto L22;
        int r8 = 256;
    L23:
        $dirty = $dirty | r8;
        goto L26
    L22:
        r8 = 128;
    L26:
        if (($changed & 3072) != 0) goto L32;
        long r9 = contentColor;
        if ($composer2.changed(r9) == false) goto L30;
        int r10 = 2048;
    L31:
        $dirty = $dirty | r10;
    L34:
        if (($changed & 24576) != 0) goto L40;
        float r11 = edgePadding;
        if ($composer2.changed(r11) == false) goto L38;
        int r12 = 16384;
    L39:
        $dirty = $dirty | r12;
    L42:
        if ((196608 & $changed) != 0) goto L48;
        ScrollState r14 = scrollState;
        if ($composer2.changed(r14) == false) goto L46;
        int r13 = 131072;
    L47:
        $dirty = $dirty | r13;
    L50:
        if ((1572864 & $changed) != 0) goto L56;
        Function3<? super TabIndicatorScope, ? super Composer, ? super Integer, Unit> r15 = r34;
        if ($composer2.changedInstance(r15) == false) goto L54;
        int r16 = 1048576;
    L55:
        $dirty = $dirty | r16;
    L58:
        if (($changed & 12582912) != 0) goto L66;
        if ($composer2.changedInstance(r35) == false) goto L62;
        int r17 = 8388608;
    L63:
        $dirty = $dirty | r17;
        goto L66
    L62:
        r17 = 4194304;
    L66:
        if ((100663296 & $changed) != 0) goto L74;
        if ($composer2.changedInstance(r36) == false) goto L70;
        int r18 = AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
    L71:
        $dirty = $dirty | r18;
        goto L74
    L70:
        r18 = 33554432;
    L74:
        if (($dirty & 38347923) != 38347922) goto L80;
        if ($composer2.getSkipping() == false) goto L80;
        $composer2.skipToGroupEnd();
        Composer $composer3 = $composer2;
    L85:
        ScopeUpdateScope r19 = $composer3.endRestartGroup();
        if (r19 == null) goto L89;
        r19.updateScope(new TabRowKt$ScrollableTabRowImpl$2(selectedTabIndex, modifier, containerColor, contentColor, edgePadding, scrollState, r34, r35, r36, $changed));
        return;
    L89:
        return;
    L80:
        if (ComposerKt.isTraceInProgress() == false) goto L82;
        ComposerKt.traceEventStart(-1594140035, $dirty, -1, "androidx.compose.material3.ScrollableTabRowImpl (TabRow.kt:699)");
    L82:
        final float r110 = r11;
        final Function3<? super TabIndicatorScope, ? super Composer, ? super Integer, Unit> r111 = r15;
        $composer3 = $composer2;
        long r112 = r9;
        SurfaceKt.m2670SurfaceT9BRK9s(ClipKt.clipToBounds(SelectableGroupKt.selectableGroup(ScrollKt.horizontalScroll$default(SizeKt.wrapContentSize$default(SizeKt.fillMaxWidth$default(modifier, 0.0f, 1, null), Alignment.Companion.getCenterStart(), false, 2, null), r14, false, null, false, 14, null))), null, containerColor, r112, 0.0f, 0.0f, null, ComposableLambdaKt.rememberComposableLambda(1556158104, true, new TabRowKt$ScrollableTabRowImpl$1(scrollState, r36, r35, r110, selectedTabIndex, r111), $composer2, 54), $composer3, (($dirty & 896) | 12582912) | ($dirty & 7168), 114);
        if (ComposerKt.isTraceInProgress() == false) goto L85;
        ComposerKt.traceEventEnd();
        goto L85
    L54:
        r16 = 524288;
        goto L55
    L56:
        r15 = r34;
        goto L58
    L46:
        r13 = 65536;
        goto L47
    L48:
        r14 = scrollState;
        goto L50
    L38:
        r12 = 8192;
        goto L39
    L40:
        r11 = edgePadding;
        goto L42
    L30:
        r10 = 1024;
        goto L31
    L32:
        r9 = contentColor;
        goto L34
    }

    /* JADX INFO: renamed from: TabRowWithSubcomposeImpl-DTcfvLk, reason: not valid java name */
    private static final void m2727TabRowWithSubcomposeImplDTcfvLk(Modifier modifier, final long containerColor, final long contentColor, final Function3<? super List<TabPosition>, ? super Composer, ? super Integer, Unit> r28, final Function2<? super Composer, ? super Integer, Unit> r29, final Function2<? super Composer, ? super Integer, Unit> r30, Composer $composer, final int $changed) {
        Composer $composer2 = $composer.startRestartGroup(-160898917);
        ComposerKt.sourceInformation($composer2, "C(TabRowWithSubcomposeImpl)P(4,0:c#ui.graphics.Color,1:c#ui.graphics.Color,3)953@41542L2218,949@41412L2348:TabRow.kt#uh7d8r");
        int $dirty = $changed;
        if (($changed & 6) != 0) goto L9;
        Modifier r3 = modifier;
        if ($composer2.changed(r3) == false) goto L7;
        int r4 = 4;
    L8:
        $dirty = $dirty | r4;
    L11:
        if (($changed & 48) != 0) goto L17;
        long r12 = containerColor;
        if ($composer2.changed(r12) == false) goto L15;
        int r5 = 32;
    L16:
        $dirty = $dirty | r5;
    L19:
        if (($changed & 384) != 0) goto L25;
        long r14 = contentColor;
        if ($composer2.changed(r14) == false) goto L23;
        int r6 = 256;
    L24:
        $dirty = $dirty | r6;
    L27:
        if (($changed & 3072) != 0) goto L34;
        if ($composer2.changedInstance(r28) == false) goto L31;
        int r7 = 2048;
    L32:
        $dirty = $dirty | r7;
        goto L34
    L31:
        r7 = 1024;
    L34:
        if (($changed & 24576) != 0) goto L41;
        if ($composer2.changedInstance(r29) == false) goto L38;
        int r8 = 16384;
    L39:
        $dirty = $dirty | r8;
        goto L41
    L38:
        r8 = 8192;
    L41:
        if ((196608 & $changed) != 0) goto L48;
        if ($composer2.changedInstance(r30) == false) goto L45;
        int r9 = 131072;
    L46:
        $dirty = $dirty | r9;
        goto L48
    L45:
        r9 = 65536;
    L48:
        if ((74899 & $dirty) != 74898) goto L54;
        if ($composer2.getSkipping() == false) goto L54;
        $composer2.skipToGroupEnd();
        Composer $composer3 = $composer2;
    L59:
        ScopeUpdateScope r10 = $composer3.endRestartGroup();
        if (r10 == null) goto L63;
        final Modifier r1 = r3;
        r10.updateScope(new TabRowKt$TabRowWithSubcomposeImpl$2(r1, containerColor, contentColor, r28, r29, r30, $changed));
        return;
    L63:
        return;
    L54:
        if (ComposerKt.isTraceInProgress() == false) goto L56;
        ComposerKt.traceEventStart(-160898917, $dirty, -1, "androidx.compose.material3.TabRowWithSubcomposeImpl (TabRow.kt:948)");
    L56:
        $composer3 = $composer2;
        SurfaceKt.m2670SurfaceT9BRK9s(SelectableGroupKt.selectableGroup(r3), null, r12, r14, 0.0f, 0.0f, null, ComposableLambdaKt.rememberComposableLambda(-1617702432, true, new TabRowKt$TabRowWithSubcomposeImpl$1(r30, r29, r28), $composer2, 54), $composer3, ((($dirty << 3) & 896) | 12582912) | (($dirty << 3) & 7168), 114);
        if (ComposerKt.isTraceInProgress() == false) goto L59;
        ComposerKt.traceEventEnd();
        goto L59
    L23:
        r6 = 128;
        goto L24
    L25:
        r14 = contentColor;
        goto L27
    L15:
        r5 = 16;
        goto L16
    L17:
        r12 = containerColor;
        goto L19
    L7:
        r4 = 2;
        goto L8
    L9:
        r3 = modifier;
        goto L11
    }

    /* JADX INFO: renamed from: ScrollableTabRowWithSubcomposeImpl-qhFBPw4, reason: not valid java name */
    private static final void m2722ScrollableTabRowWithSubcomposeImplqhFBPw4(final int selectedTabIndex, final Function3<? super List<TabPosition>, ? super Composer, ? super Integer, Unit> r28, Modifier modifier, long containerColor, long contentColor, float edgePadding, Function2<? super Composer, ? super Integer, Unit> r35, final Function2<? super Composer, ? super Integer, Unit> r36, final ScrollState scrollState, Composer $composer, final int $changed, final int r40) {
        Composer $composer2 = $composer.startRestartGroup(-955409947);
        ComposerKt.sourceInformation($composer2, "C(ScrollableTabRowWithSubcomposeImpl)P(7,4,5,0:c#ui.graphics.Color,1:c#ui.graphics.Color,3:c#ui.unit.Dp!1,8)1014@43999L21,1015@44063L19,1021@44384L3880,1021@44302L3962:TabRow.kt#uh7d8r");
        int $dirty = $changed;
        if ((r40 & 1) == 0) goto L6;
        $dirty = $dirty | 6;
    L14:
        if ((r40 & 2) == 0) goto L17;
        $dirty = $dirty | 48;
        Function3<? super List<TabPosition>, ? super Composer, ? super Integer, Unit> r4 = r28;
    L24:
        int r5 = r40 & 4;
        if (r5 == 0) goto L28;
        $dirty = $dirty | 384;
        Modifier modifier2 = modifier;
    L36:
        if (($changed & 3072) == 0) goto L38;
        long containerColor2 = containerColor;
    L47:
        if (($changed & 24576) == 0) goto L49;
        long contentColor2 = contentColor;
    L57:
        int r11 = r40 & 32;
        if (r11 == 0) goto L61;
        $dirty = $dirty | ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
        float edgePadding2 = edgePadding;
    L68:
        int r15 = r40 & 64;
        if (r15 == 0) goto L72;
        $dirty = $dirty | 1572864;
    L80:
        if ((r40 & 128) == 0) goto L83;
        $dirty = $dirty | 12582912;
    L91:
        if ((r40 & 256) == 0) goto L94;
        $dirty = $dirty | 100663296;
    L102:
        if (($dirty & 38347923) == 38347922) goto L104;
    L107:
        $composer2.startDefaults();
        if (($changed & 1) != 0) goto L110;
    L119:
        if (r5 == 0) goto L122;
        modifier2 = Modifier.Companion;
    L122:
        if ((r40 & 8) == 0) goto L125;
        containerColor2 = TabRowDefaults.INSTANCE.getPrimaryContainerColor($composer2, 6);
        $dirty = $dirty & (-7169);
    L125:
        if ((r40 & 16) == 0) goto L127;
        contentColor2 = TabRowDefaults.INSTANCE.getPrimaryContentColor($composer2, 6);
        $dirty = $dirty & (-57345);
    L127:
        if (r11 == 0) goto L129;
        edgePadding2 = TabRowDefaults.INSTANCE.m2716getScrollableTabRowEdgeStartPaddingD9Ej5fM();
    L129:
        if (r15 == 0) goto L131;
        int $dirty2 = $dirty;
        long contentColor3 = contentColor2;
        Function2<? super Composer, ? super Integer, Unit> r2 = ComposableSingletons$TabRowKt.INSTANCE.m2116getLambda7$material3_release();
        long containerColor3 = containerColor2;
        float edgePadding3 = edgePadding2;
        Modifier modifier3 = modifier2;
        int r6 = -955409947;
    L132:
        $composer2.endDefaults();
        if (ComposerKt.isTraceInProgress() == false) goto L135;
        ComposerKt.traceEventStart(r6, $dirty2, -1, "androidx.compose.material3.ScrollableTabRowWithSubcomposeImpl (TabRow.kt:1020)");
    L135:
        final float edgePadding4 = edgePadding3;
        final Function2<? super Composer, ? super Integer, Unit> r33 = r2;
        final Function3<? super List<TabPosition>, ? super Composer, ? super Integer, Unit> r34 = r4;
        Composer $composer3 = $composer2;
        SurfaceKt.m2670SurfaceT9BRK9s(modifier3, null, containerColor3, contentColor3, 0.0f, 0.0f, null, ComposableLambdaKt.rememberComposableLambda(-1572959552, true, new TabRowKt$ScrollableTabRowWithSubcomposeImpl$1(scrollState, edgePadding4, r36, r33, r34, selectedTabIndex), $composer2, 54), $composer3, (((($dirty2 >> 6) & 14) | 12582912) | (($dirty2 >> 3) & 896)) | (($dirty2 >> 3) & 7168), 114);
        if (ComposerKt.isTraceInProgress() == false) goto L138;
        ComposerKt.traceEventEnd();
    L138:
        final Modifier modifier4 = modifier3;
        final float edgePadding5 = edgePadding4;
        final Function2<? super Composer, ? super Integer, Unit> r9 = r33;
        final long containerColor4 = containerColor3;
        final long contentColor4 = contentColor3;
    L139:
        ScopeUpdateScope r16 = $composer3.endRestartGroup();
        if (r16 == null) goto L143;
        r16.updateScope(new TabRowKt$ScrollableTabRowWithSubcomposeImpl$2(selectedTabIndex, r28, modifier4, containerColor4, contentColor4, edgePadding5, r9, r36, scrollState, $changed, r40));
        return;
    L143:
        return;
    L131:
        $dirty2 = $dirty;
        contentColor3 = contentColor2;
        edgePadding3 = edgePadding2;
        r2 = r35;
        modifier3 = modifier2;
        containerColor3 = containerColor2;
        r6 = -955409947;
        goto L132
    L110:
        if ($composer2.getDefaultsInvalid() == true) goto L119;
        $composer2.skipToGroupEnd();
        if ((r40 & 8) == 0) goto L116;
        $dirty = $dirty & (-7169);
    L116:
        if ((r40 & 16) == 0) goto L118;
        int r0 = $dirty & (-57345);
        r2 = r35;
        $dirty2 = r0;
        contentColor3 = contentColor2;
        edgePadding3 = edgePadding2;
        modifier3 = modifier2;
        containerColor3 = containerColor2;
        r6 = -955409947;
        goto L132
    L118:
        $dirty2 = $dirty;
        contentColor3 = contentColor2;
        edgePadding3 = edgePadding2;
        r2 = r35;
        modifier3 = modifier2;
        containerColor3 = containerColor2;
        r6 = -955409947;
        goto L132
    L104:
        if ($composer2.getSkipping() == false) goto L107;
        $composer2.skipToGroupEnd();
        $composer3 = $composer2;
        modifier4 = modifier2;
        containerColor4 = containerColor2;
        contentColor4 = contentColor2;
        edgePadding5 = edgePadding2;
        r9 = r35;
        goto L139
    L94:
        if (($changed & 100663296) != 0) goto L102;
        if ($composer2.changed(scrollState) == false) goto L98;
        int r18 = AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
    L99:
        $dirty = $dirty | r18;
        goto L102
    L98:
        r18 = 33554432;
        goto L99
    L83:
        if (($changed & 12582912) != 0) goto L91;
        if ($composer2.changedInstance(r36) == false) goto L87;
        int r19 = 8388608;
    L88:
        $dirty = $dirty | r19;
        goto L91
    L87:
        r19 = 4194304;
        goto L88
    L72:
        if (($changed & 1572864) != 0) goto L80;
        if ($composer2.changedInstance(r35) == false) goto L76;
        int r17 = 1048576;
    L77:
        $dirty = $dirty | r17;
        goto L80
    L76:
        r17 = 524288;
        goto L77
    L61:
        if ((196608 & $changed) != 0) goto L67;
        edgePadding2 = edgePadding;
        if ($composer2.changed(edgePadding2) == false) goto L65;
        int r110 = 131072;
    L66:
        $dirty = $dirty | r110;
        goto L68
    L65:
        r110 = 65536;
        goto L66
    L67:
        edgePadding2 = edgePadding;
        goto L68
    L49:
        if ((r40 & 16) != 0) goto L53;
        contentColor2 = contentColor;
        if ($composer2.changed(contentColor2) == false) goto L54;
        int r12 = 16384;
    L55:
        $dirty = $dirty | r12;
    L54:
        r12 = 8192;
        goto L55
    L53:
        contentColor2 = contentColor;
        goto L54
    L38:
        if ((r40 & 8) != 0) goto L42;
        containerColor2 = containerColor;
        if ($composer2.changed(containerColor2) == false) goto L43;
        int r10 = 2048;
    L44:
        $dirty = $dirty | r10;
    L43:
        r10 = 1024;
        goto L44
    L42:
        containerColor2 = containerColor;
        goto L43
    L28:
        if (($changed & 384) != 0) goto L34;
        modifier2 = modifier;
        if ($composer2.changed(modifier2) == false) goto L32;
        int r7 = 256;
    L33:
        $dirty = $dirty | r7;
        goto L36
    L32:
        r7 = 128;
        goto L33
    L34:
        modifier2 = modifier;
        goto L36
    L17:
        if (($changed & 48) != 0) goto L23;
        r4 = r28;
        if ($composer2.changedInstance(r4) == false) goto L21;
        int r8 = 32;
    L22:
        $dirty = $dirty | r8;
        goto L24
    L21:
        r8 = 16;
        goto L22
    L23:
        r4 = r28;
        goto L24
    L6:
        if (($changed & 6) != 0) goto L14;
        if ($composer2.changed(selectedTabIndex) == false) goto L10;
        int r13 = 4;
    L11:
        $dirty = $dirty | r13;
        goto L14
    L10:
        r13 = 2;
        goto L11
    }

    static {
        ScrollableTabRowMinimumTabWidth = Dp.m6973constructorimpl(90);
        ScrollableTabRowScrollSpec = AnimationSpecKt.tween$default(250, 0, EasingKt.getFastOutSlowInEasing(), 2, null);
        TabRowIndicatorSpec = AnimationSpecKt.tween$default(250, 0, EasingKt.getFastOutSlowInEasing(), 2, null);
    }
}
