package androidx.compose.material3;

import androidx.compose.animation.core.AnimateAsStateKt;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.OffsetKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.material3.tokens.PrimaryNavigationTabTokens;
import androidx.compose.material3.tokens.SecondaryNavigationTabTokens;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.State;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.platform.InspectableValueKt;
import androidx.compose.ui.platform.InspectorInfo;
import androidx.compose.ui.unit.Dp;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: TabRow.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J0\u0010\u0018\u001a\u00020\u00192\b\b\u0002\u0010\u001a\u001a\u00020\u001b2\b\b\u0002\u0010\u001c\u001a\u00020\u00042\b\b\u0002\u0010\u001d\u001a\u00020\tH\u0007ø\u0001\u0000¢\u0006\u0004\b\u001e\u0010\u001fJD\u0010 \u001a\u00020\u00192\b\b\u0002\u0010\u001a\u001a\u00020\u001b2\b\b\u0002\u0010!\u001a\u00020\u00042\b\b\u0002\u0010\u001c\u001a\u00020\u00042\b\b\u0002\u0010\u001d\u001a\u00020\t2\b\b\u0002\u0010\"\u001a\u00020#H\u0007ø\u0001\u0000¢\u0006\u0004\b$\u0010%J0\u0010&\u001a\u00020\u00192\b\b\u0002\u0010\u001a\u001a\u00020\u001b2\b\b\u0002\u0010\u001c\u001a\u00020\u00042\b\b\u0002\u0010\u001d\u001a\u00020\tH\u0007ø\u0001\u0000¢\u0006\u0004\b'\u0010\u001fJ\u0012\u0010(\u001a\u00020\u001b*\u00020\u001b2\u0006\u0010)\u001a\u00020*R\u0019\u0010\u0003\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0005\u0010\u0006R \u0010\b\u001a\u00020\t8GX\u0087\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\f\u0012\u0004\b\n\u0010\u0002\u001a\u0004\b\u000b\u0010\fR \u0010\r\u001a\u00020\t8GX\u0087\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\f\u0012\u0004\b\u000e\u0010\u0002\u001a\u0004\b\u000f\u0010\fR\u0017\u0010\u0010\u001a\u00020\t8Gø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\u0011\u0010\fR\u0017\u0010\u0012\u001a\u00020\t8Gø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\u0013\u0010\fR\u0017\u0010\u0014\u001a\u00020\t8Gø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\u0015\u0010\fR\u0017\u0010\u0016\u001a\u00020\t8Gø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\u0017\u0010\f\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006+²\u0006\n\u0010,\u001a\u00020\u0004X\u008a\u0084\u0002²\u0006\n\u0010-\u001a\u00020\u0004X\u008a\u0084\u0002"}, d2 = {"Landroidx/compose/material3/TabRowDefaults;", "", "()V", "ScrollableTabRowEdgeStartPadding", "Landroidx/compose/ui/unit/Dp;", "getScrollableTabRowEdgeStartPadding-D9Ej5fM", "()F", "F", "containerColor", "Landroidx/compose/ui/graphics/Color;", "getContainerColor$annotations", "getContainerColor", "(Landroidx/compose/runtime/Composer;I)J", "contentColor", "getContentColor$annotations", "getContentColor", "primaryContainerColor", "getPrimaryContainerColor", "primaryContentColor", "getPrimaryContentColor", "secondaryContainerColor", "getSecondaryContainerColor", "secondaryContentColor", "getSecondaryContentColor", "Indicator", "", "modifier", "Landroidx/compose/ui/Modifier;", "height", "color", "Indicator-9IZ8Weo", "(Landroidx/compose/ui/Modifier;FJLandroidx/compose/runtime/Composer;II)V", "PrimaryIndicator", "width", "shape", "Landroidx/compose/ui/graphics/Shape;", "PrimaryIndicator-10LGxhE", "(Landroidx/compose/ui/Modifier;FFJLandroidx/compose/ui/graphics/Shape;Landroidx/compose/runtime/Composer;II)V", "SecondaryIndicator", "SecondaryIndicator-9IZ8Weo", "tabIndicatorOffset", "currentTabPosition", "Landroidx/compose/material3/TabPosition;", "material3_release", "currentTabWidth", "indicatorOffset"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class TabRowDefaults {
    public static final int $stable = 0;
    public static final TabRowDefaults INSTANCE = null;
    private static final float ScrollableTabRowEdgeStartPadding = 0.0f;

    /* JADX INFO: renamed from: androidx.compose.material3.TabRowDefaults$tabIndicatorOffset$2, reason: invalid class name */
    /* JADX INFO: compiled from: TabRow.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "Landroidx/compose/ui/Modifier;", "invoke", "(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/Modifier;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    static final class AnonymousClass2 extends Lambda implements Function3<Modifier, Composer, Integer, Modifier> {
        final /* synthetic */ TabPosition $currentTabPosition;

        AnonymousClass2(TabPosition r2) {
            this.$currentTabPosition = r2;
            super(3);
        }

        public static final /* synthetic */ float access$invoke$lambda$1(State $indicatorOffset$delegate) {
            return invoke$lambda$1($indicatorOffset$delegate);
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Modifier invoke(Modifier r4, Composer r5, Integer r6) {
            return invoke(r4, r5, r6.intValue());
        }

        private static final float invoke$lambda$0(State<Dp> r4) {
            return r4.getValue().m6987unboximpl();
        }

        public final Modifier invoke(Modifier $this$composed, Composer $composer, int $changed) {
            $composer.startReplaceGroup(-1541271084);
            ComposerKt.sourceInformation($composer, "C1272@54128L151,1277@54331L150,1283@54589L53:TabRow.kt#uh7d8r");
            if (ComposerKt.isTraceInProgress() == false) goto L5;
            ComposerKt.traceEventStart(-1541271084, $changed, -1, "androidx.compose.material3.TabRowDefaults.tabIndicatorOffset.<anonymous> (TabRow.kt:1271)");
        L5:
            State<Dp> r12 = AnimateAsStateKt.m124animateDpAsStateAjpBEmI(this.$currentTabPosition.m2712getWidthD9Ej5fM(), TabRowKt.access$getTabRowIndicatorSpec$p(), null, null, $composer, 0, 12);
            final State<Dp> r0 = AnimateAsStateKt.m124animateDpAsStateAjpBEmI(this.$currentTabPosition.m2710getLeftD9Ej5fM(), TabRowKt.access$getTabRowIndicatorSpec$p(), null, null, $composer, 0, 12);
            Modifier r1 = SizeKt.wrapContentSize$default(SizeKt.fillMaxWidth$default($this$composed, 0.0f, 1, null), Alignment.Companion.getBottomStart(), false, 2, null);
            ComposerKt.sourceInformationMarkerStart($composer, -1825070699, "CC(remember):TabRow.kt#9igjgp");
            boolean invalid$iv = $composer.changed(r0);
            Object it$iv = $composer.rememberedValue();
            if (invalid$iv == false) goto L8;
        L11:
            Object value$iv = (Function1) new TabRowDefaults$tabIndicatorOffset$2$1$1(r0);
            $composer.updateRememberedValue(value$iv);
        L12:
            ComposerKt.sourceInformationMarkerEnd($composer);
            Modifier r2 = SizeKt.m777width3ABfNKs(OffsetKt.offset(r1, (Function1) value$iv), invoke$lambda$0(r12));
            if (ComposerKt.isTraceInProgress() == false) goto L15;
            ComposerKt.traceEventEnd();
        L15:
            $composer.endReplaceGroup();
            return r2;
        L8:
            if (it$iv == Composer.Companion.getEmpty()) goto L11;
            value$iv = it$iv;
            goto L12
        }

        private static final float invoke$lambda$1(State<Dp> r4) {
            return r4.getValue().m6987unboximpl();
        }
    }

    @Deprecated(message = "Use TabRowDefaults.primaryContainerColor instead", replaceWith = @ReplaceWith(expression = "primaryContainerColor", imports = {}))
    public static /* synthetic */ void getContainerColor$annotations() {
    }

    @Deprecated(message = "Use TabRowDefaults.primaryContentColor instead", replaceWith = @ReplaceWith(expression = "primaryContentColor", imports = {}))
    public static /* synthetic */ void getContentColor$annotations() {
    }

    private TabRowDefaults() {
    }

    static {
        INSTANCE = new TabRowDefaults();
        ScrollableTabRowEdgeStartPadding = Dp.m6973constructorimpl(52);
    }

    /* JADX INFO: renamed from: getScrollableTabRowEdgeStartPadding-D9Ej5fM, reason: not valid java name */
    public final float m2716getScrollableTabRowEdgeStartPaddingD9Ej5fM() {
        return ScrollableTabRowEdgeStartPadding;
    }

    public final long getContainerColor(Composer $composer, int $changed) {
        ComposerKt.sourceInformationMarkerStart($composer, -2026555673, "C1165@50074L5:TabRow.kt#uh7d8r");
        if (ComposerKt.isTraceInProgress() == false) goto L5;
        ComposerKt.traceEventStart(-2026555673, $changed, -1, "androidx.compose.material3.TabRowDefaults.<get-containerColor> (TabRow.kt:1165)");
    L5:
        long r0 = ColorSchemeKt.getValue(PrimaryNavigationTabTokens.INSTANCE.getContainerColor(), $composer, 6);
        if (ComposerKt.isTraceInProgress() == false) goto L8;
        ComposerKt.traceEventEnd();
    L8:
        ComposerKt.sourceInformationMarkerEnd($composer);
        return r0;
    }

    public final long getPrimaryContainerColor(Composer $composer, int $changed) {
        ComposerKt.sourceInformationMarkerStart($composer, -2069154037, "C1169@50245L5:TabRow.kt#uh7d8r");
        if (ComposerKt.isTraceInProgress() == false) goto L5;
        ComposerKt.traceEventStart(-2069154037, $changed, -1, "androidx.compose.material3.TabRowDefaults.<get-primaryContainerColor> (TabRow.kt:1169)");
    L5:
        long r0 = ColorSchemeKt.getValue(PrimaryNavigationTabTokens.INSTANCE.getContainerColor(), $composer, 6);
        if (ComposerKt.isTraceInProgress() == false) goto L8;
        ComposerKt.traceEventEnd();
    L8:
        ComposerKt.sourceInformationMarkerEnd($composer);
        return r0;
    }

    public final long getSecondaryContainerColor(Composer $composer, int $changed) {
        ComposerKt.sourceInformationMarkerStart($composer, -1938007129, "C1173@50422L5:TabRow.kt#uh7d8r");
        if (ComposerKt.isTraceInProgress() == false) goto L5;
        ComposerKt.traceEventStart(-1938007129, $changed, -1, "androidx.compose.material3.TabRowDefaults.<get-secondaryContainerColor> (TabRow.kt:1173)");
    L5:
        long r0 = ColorSchemeKt.getValue(SecondaryNavigationTabTokens.INSTANCE.getContainerColor(), $composer, 6);
        if (ComposerKt.isTraceInProgress() == false) goto L8;
        ComposerKt.traceEventEnd();
    L8:
        ComposerKt.sourceInformationMarkerEnd($composer);
        return r0;
    }

    public final long getContentColor(Composer $composer, int $changed) {
        ComposerKt.sourceInformationMarkerStart($composer, 1163072359, "C1181@50728L5:TabRow.kt#uh7d8r");
        if (ComposerKt.isTraceInProgress() == false) goto L5;
        ComposerKt.traceEventStart(1163072359, $changed, -1, "androidx.compose.material3.TabRowDefaults.<get-contentColor> (TabRow.kt:1181)");
    L5:
        long r0 = ColorSchemeKt.getValue(PrimaryNavigationTabTokens.INSTANCE.getActiveLabelTextColor(), $composer, 6);
        if (ComposerKt.isTraceInProgress() == false) goto L8;
        ComposerKt.traceEventEnd();
    L8:
        ComposerKt.sourceInformationMarkerEnd($composer);
        return r0;
    }

    public final long getPrimaryContentColor(Composer $composer, int $changed) {
        ComposerKt.sourceInformationMarkerStart($composer, 1410362619, "C1185@50901L5:TabRow.kt#uh7d8r");
        if (ComposerKt.isTraceInProgress() == false) goto L5;
        ComposerKt.traceEventStart(1410362619, $changed, -1, "androidx.compose.material3.TabRowDefaults.<get-primaryContentColor> (TabRow.kt:1185)");
    L5:
        long r0 = ColorSchemeKt.getValue(PrimaryNavigationTabTokens.INSTANCE.getActiveLabelTextColor(), $composer, 6);
        if (ComposerKt.isTraceInProgress() == false) goto L8;
        ComposerKt.traceEventEnd();
    L8:
        ComposerKt.sourceInformationMarkerEnd($composer);
        return r0;
    }

    public final long getSecondaryContentColor(Composer $composer, int $changed) {
        ComposerKt.sourceInformationMarkerStart($composer, 1166419479, "C1189@51080L5:TabRow.kt#uh7d8r");
        if (ComposerKt.isTraceInProgress() == false) goto L5;
        ComposerKt.traceEventStart(1166419479, $changed, -1, "androidx.compose.material3.TabRowDefaults.<get-secondaryContentColor> (TabRow.kt:1189)");
    L5:
        long r0 = ColorSchemeKt.getValue(SecondaryNavigationTabTokens.INSTANCE.getActiveLabelTextColor(), $composer, 6);
        if (ComposerKt.isTraceInProgress() == false) goto L8;
        ComposerKt.traceEventEnd();
    L8:
        ComposerKt.sourceInformationMarkerEnd($composer);
        return r0;
    }

    @Deprecated(message = "Use SecondaryIndicator instead.", replaceWith = @ReplaceWith(expression = "SecondaryIndicator(modifier, height, color)", imports = {}))
    /* JADX INFO: renamed from: Indicator-9IZ8Weo, reason: not valid java name */
    public final void m2713Indicator9IZ8Weo(Modifier modifier, float height, long color, Composer $composer, final int $changed, final int r22) {
        Composer $composer2 = $composer.startRestartGroup(1454716052);
        ComposerKt.sourceInformation($composer2, "C(Indicator)P(2,1:c#ui.unit.Dp,0:c#ui.graphics.Color)1208@51720L11,1210@51807L69:TabRow.kt#uh7d8r");
        int $dirty = $changed;
        int r2 = r22 & 1;
        if (r2 == 0) goto L6;
        $dirty = $dirty | 6;
        Modifier r3 = modifier;
    L13:
        int r4 = r22 & 2;
        if (r4 == 0) goto L17;
        $dirty = $dirty | 48;
        float r5 = height;
    L25:
        if (($changed & 384) == 0) goto L27;
        long r9 = color;
    L36:
        if (($dirty & 147) == 146) goto L38;
    L41:
        $composer2.startDefaults();
        if (($changed & 1) != 0) goto L44;
    L50:
        if (r2 == 0) goto L52;
        final Modifier.Companion modifier2 = Modifier.Companion;
    L53:
        if (r4 == 0) goto L55;
        final float height2 = PrimaryNavigationTabTokens.INSTANCE.m3584getActiveIndicatorHeightD9Ej5fM();
    L57:
        if ((r22 & 4) == 0) goto L59;
        $dirty = $dirty & (-897);
        long color2 = ColorSchemeKt.fromToken(MaterialTheme.INSTANCE.getColorScheme($composer2, 6), PrimaryNavigationTabTokens.INSTANCE.getActiveIndicatorColor());
    L60:
        $composer2.endDefaults();
        if (ComposerKt.isTraceInProgress() == false) goto L63;
        ComposerKt.traceEventStart(1454716052, $dirty, -1, "androidx.compose.material3.TabRowDefaults.Indicator (TabRow.kt:1209)");
    L63:
        BoxKt.Box(BackgroundKt.m234backgroundbw27NRU$default(SizeKt.m758height3ABfNKs(SizeKt.fillMaxWidth$default(modifier2, 0.0f, 1, null), height2), color2, null, 2, null), $composer2, 0);
        if (ComposerKt.isTraceInProgress() == false) goto L66;
        ComposerKt.traceEventEnd();
    L66:
        final long color3 = color2;
    L67:
        ScopeUpdateScope r10 = $composer2.endRestartGroup();
        if (r10 == null) goto L71;
        r10.updateScope(new TabRowDefaults$Indicator$1(this, modifier2, height2, color3, $changed, r22));
        return;
    L71:
        return;
    L59:
        color2 = r9;
        goto L60
    L55:
        height2 = r5;
        goto L57
    L52:
        modifier2 = r3;
        goto L53
    L44:
        if ($composer2.getDefaultsInvalid() == true) goto L50;
        $composer2.skipToGroupEnd();
        if ((r22 & 4) == 0) goto L49;
        $dirty = $dirty & (-897);
    L49:
        modifier2 = r3;
        height2 = r5;
        color2 = r9;
        goto L60
    L38:
        if ($composer2.getSkipping() == false) goto L41;
        $composer2.skipToGroupEnd();
        modifier2 = r3;
        height2 = r5;
        color3 = r9;
        goto L67
    L27:
        if ((r22 & 4) != 0) goto L31;
        r9 = color;
        if ($composer2.changed(r9) == false) goto L32;
        int r7 = 256;
    L33:
        $dirty = $dirty | r7;
    L32:
        r7 = 128;
        goto L33
    L31:
        r9 = color;
        goto L32
    L17:
        if (($changed & 48) != 0) goto L23;
        r5 = height;
        if ($composer2.changed(r5) == false) goto L21;
        int r8 = 32;
    L22:
        $dirty = $dirty | r8;
        goto L25
    L21:
        r8 = 16;
        goto L22
    L23:
        r5 = height;
        goto L25
    L6:
        if (($changed & 6) != 0) goto L12;
        r3 = modifier;
        if ($composer2.changed(r3) == false) goto L10;
        int r6 = 4;
    L11:
        $dirty = $dirty | r6;
        goto L13
    L10:
        r6 = 2;
        goto L11
    L12:
        r3 = modifier;
        goto L13
    }

    /* JADX INFO: renamed from: PrimaryIndicator-10LGxhE, reason: not valid java name */
    public final void m2714PrimaryIndicator10LGxhE(Modifier modifier, float width, float height, long color, Shape shape, Composer $composer, final int $changed, final int r25) {
        Composer $composer2 = $composer.startRestartGroup(-1895596205);
        ComposerKt.sourceInformation($composer2, "C(PrimaryIndicator)P(2,4:c#ui.unit.Dp,1:c#ui.unit.Dp,0:c#ui.graphics.Color)1228@52502L5,1231@52596L174:TabRow.kt#uh7d8r");
        int $dirty = $changed;
        int r2 = r25 & 1;
        if (r2 == 0) goto L6;
        $dirty = $dirty | 6;
        Modifier r3 = modifier;
    L13:
        int r4 = r25 & 2;
        if (r4 == 0) goto L17;
        $dirty = $dirty | 48;
        float r5 = width;
    L24:
        int r6 = r25 & 4;
        if (r6 == 0) goto L28;
        $dirty = $dirty | 384;
        float height2 = height;
    L36:
        if (($changed & 3072) == 0) goto L38;
        long color2 = color;
    L46:
        int r9 = r25 & 16;
        if (r9 == 0) goto L50;
        $dirty = $dirty | 24576;
        Shape shape2 = shape;
    L58:
        if (($dirty & 9363) == 9362) goto L60;
    L63:
        $composer2.startDefaults();
        if (($changed & 1) != 0) goto L66;
    L72:
        if (r2 == 0) goto L74;
        final Modifier.Companion modifier2 = Modifier.Companion;
    L75:
        if (r4 == 0) goto L77;
        final float width2 = Dp.m6973constructorimpl(24);
    L78:
        if (r6 == 0) goto L81;
        height2 = PrimaryNavigationTabTokens.INSTANCE.m3584getActiveIndicatorHeightD9Ej5fM();
    L81:
        if ((r25 & 8) == 0) goto L83;
        $dirty = $dirty & (-7169);
        color2 = ColorSchemeKt.getValue(PrimaryNavigationTabTokens.INSTANCE.getActiveIndicatorColor(), $composer2, 6);
    L83:
        if (r9 == 0) goto L85;
        shape2 = PrimaryNavigationTabTokens.INSTANCE.getActiveIndicatorShape();
    L85:
        $composer2.endDefaults();
        if (ComposerKt.isTraceInProgress() == false) goto L88;
        ComposerKt.traceEventStart(-1895596205, $dirty, -1, "androidx.compose.material3.TabRowDefaults.PrimaryIndicator (TabRow.kt:1230)");
    L88:
        SpacerKt.Spacer(BackgroundKt.m233backgroundbw27NRU(SizeKt.m769requiredWidth3ABfNKs(SizeKt.m761requiredHeight3ABfNKs(modifier2, height2), width2), color2, shape2), $composer2, 0);
        if (ComposerKt.isTraceInProgress() == false) goto L91;
        ComposerKt.traceEventEnd();
    L91:
        final float height3 = height2;
        final long color3 = color2;
        final Shape shape3 = shape2;
    L92:
        ScopeUpdateScope r12 = $composer2.endRestartGroup();
        if (r12 == null) goto L96;
        r12.updateScope(new TabRowDefaults$PrimaryIndicator$1(this, modifier2, width2, height3, color3, shape3, $changed, r25));
        return;
    L96:
        return;
    L77:
        width2 = r5;
        goto L78
    L74:
        modifier2 = r3;
        goto L75
    L66:
        if ($composer2.getDefaultsInvalid() == true) goto L72;
        $composer2.skipToGroupEnd();
        if ((r25 & 8) == 0) goto L71;
        $dirty = $dirty & (-7169);
    L71:
        modifier2 = r3;
        width2 = r5;
        goto L85
    L60:
        if ($composer2.getSkipping() == false) goto L63;
        $composer2.skipToGroupEnd();
        modifier2 = r3;
        width2 = r5;
        height3 = height2;
        color3 = color2;
        shape3 = shape2;
        goto L92
    L50:
        if (($changed & 24576) != 0) goto L56;
        shape2 = shape;
        if ($composer2.changed(shape2) == false) goto L54;
        int r14 = 16384;
    L55:
        $dirty = $dirty | r14;
        goto L58
    L54:
        r14 = 8192;
        goto L55
    L56:
        shape2 = shape;
        goto L58
    L38:
        if ((r25 & 8) != 0) goto L42;
        color2 = color;
        if ($composer2.changed(color2) == false) goto L43;
        int r10 = 2048;
    L44:
        $dirty = $dirty | r10;
    L43:
        r10 = 1024;
        goto L44
    L42:
        color2 = color;
        goto L43
    L28:
        if (($changed & 384) != 0) goto L34;
        height2 = height;
        if ($composer2.changed(height2) == false) goto L32;
        int r11 = 256;
    L33:
        $dirty = $dirty | r11;
        goto L36
    L32:
        r11 = 128;
        goto L33
    L34:
        height2 = height;
        goto L36
    L17:
        if (($changed & 48) != 0) goto L23;
        r5 = width;
        if ($composer2.changed(r5) == false) goto L21;
        int r7 = 32;
    L22:
        $dirty = $dirty | r7;
        goto L24
    L21:
        r7 = 16;
        goto L22
    L23:
        r5 = width;
        goto L24
    L6:
        if (($changed & 6) != 0) goto L12;
        r3 = modifier;
        if ($composer2.changed(r3) == false) goto L10;
        int r8 = 4;
    L11:
        $dirty = $dirty | r8;
        goto L13
    L10:
        r8 = 2;
        goto L11
    L12:
        r3 = modifier;
        goto L13
    }

    /* JADX INFO: renamed from: SecondaryIndicator-9IZ8Weo, reason: not valid java name */
    public final void m2715SecondaryIndicator9IZ8Weo(Modifier modifier, float height, long color, Composer $composer, final int $changed, final int r22) {
        Composer $composer2 = $composer.startRestartGroup(-1498258020);
        ComposerKt.sourceInformation($composer2, "C(SecondaryIndicator)P(2,1:c#ui.unit.Dp,0:c#ui.graphics.Color)1251@53287L5,1253@53309L69:TabRow.kt#uh7d8r");
        int $dirty = $changed;
        int r2 = r22 & 1;
        if (r2 == 0) goto L6;
        $dirty = $dirty | 6;
        Modifier r3 = modifier;
    L13:
        int r4 = r22 & 2;
        if (r4 == 0) goto L17;
        $dirty = $dirty | 48;
        float r5 = height;
    L25:
        if (($changed & 384) == 0) goto L27;
        long r9 = color;
    L36:
        if (($dirty & 147) == 146) goto L38;
    L41:
        $composer2.startDefaults();
        if (($changed & 1) != 0) goto L44;
    L50:
        if (r2 == 0) goto L52;
        final Modifier.Companion modifier2 = Modifier.Companion;
    L53:
        if (r4 == 0) goto L55;
        final float height2 = PrimaryNavigationTabTokens.INSTANCE.m3584getActiveIndicatorHeightD9Ej5fM();
    L57:
        if ((r22 & 4) == 0) goto L59;
        $dirty = $dirty & (-897);
        long color2 = ColorSchemeKt.getValue(PrimaryNavigationTabTokens.INSTANCE.getActiveIndicatorColor(), $composer2, 6);
    L60:
        $composer2.endDefaults();
        if (ComposerKt.isTraceInProgress() == false) goto L63;
        ComposerKt.traceEventStart(-1498258020, $dirty, -1, "androidx.compose.material3.TabRowDefaults.SecondaryIndicator (TabRow.kt:1252)");
    L63:
        BoxKt.Box(BackgroundKt.m234backgroundbw27NRU$default(SizeKt.m758height3ABfNKs(SizeKt.fillMaxWidth$default(modifier2, 0.0f, 1, null), height2), color2, null, 2, null), $composer2, 0);
        if (ComposerKt.isTraceInProgress() == false) goto L66;
        ComposerKt.traceEventEnd();
    L66:
        final long color3 = color2;
    L67:
        ScopeUpdateScope r10 = $composer2.endRestartGroup();
        if (r10 == null) goto L71;
        r10.updateScope(new TabRowDefaults$SecondaryIndicator$1(this, modifier2, height2, color3, $changed, r22));
        return;
    L71:
        return;
    L59:
        color2 = r9;
        goto L60
    L55:
        height2 = r5;
        goto L57
    L52:
        modifier2 = r3;
        goto L53
    L44:
        if ($composer2.getDefaultsInvalid() == true) goto L50;
        $composer2.skipToGroupEnd();
        if ((r22 & 4) == 0) goto L49;
        $dirty = $dirty & (-897);
    L49:
        modifier2 = r3;
        height2 = r5;
        color2 = r9;
        goto L60
    L38:
        if ($composer2.getSkipping() == false) goto L41;
        $composer2.skipToGroupEnd();
        modifier2 = r3;
        height2 = r5;
        color3 = r9;
        goto L67
    L27:
        if ((r22 & 4) != 0) goto L31;
        r9 = color;
        if ($composer2.changed(r9) == false) goto L32;
        int r7 = 256;
    L33:
        $dirty = $dirty | r7;
    L32:
        r7 = 128;
        goto L33
    L31:
        r9 = color;
        goto L32
    L17:
        if (($changed & 48) != 0) goto L23;
        r5 = height;
        if ($composer2.changed(r5) == false) goto L21;
        int r8 = 32;
    L22:
        $dirty = $dirty | r8;
        goto L25
    L21:
        r8 = 16;
        goto L22
    L23:
        r5 = height;
        goto L25
    L6:
        if (($changed & 6) != 0) goto L12;
        r3 = modifier;
        if ($composer2.changed(r3) == false) goto L10;
        int r6 = 4;
    L11:
        $dirty = $dirty | r6;
        goto L13
    L10:
        r6 = 2;
        goto L11
    L12:
        r3 = modifier;
        goto L13
    }

    public final Modifier tabIndicatorOffset(Modifier $this$tabIndicatorOffset, final TabPosition currentTabPosition) {
        if (InspectableValueKt.isDebugInspectorInfoEnabled() == false) goto L5;
        Function1<InspectorInfo, Unit> r1 = new TabRowDefaults$tabIndicatorOffset$$inlined$debugInspectorInfo$1(currentTabPosition);
    L7:
        return ComposedModifierKt.composed($this$tabIndicatorOffset, r1, new AnonymousClass2(currentTabPosition));
    L5:
        r1 = InspectableValueKt.getNoInspectorInfo();
        goto L7
    }
}
