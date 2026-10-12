package androidx.compose.material;

import androidx.compose.animation.core.AnimateAsStateKt;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.EasingKt;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.OffsetKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.State;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.platform.InspectableValueKt;
import androidx.compose.ui.platform.InspectorInfo;
import androidx.compose.ui.unit.Dp;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: TabRow.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J0\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u00062\b\b\u0002\u0010\u0013\u001a\u00020\u0014H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0016J0\u0010\u0017\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0018\u001a\u00020\u00062\b\b\u0002\u0010\u0013\u001a\u00020\u0014H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\u0016J\u0012\u0010\u001a\u001a\u00020\u0011*\u00020\u00112\u0006\u0010\u001b\u001a\u00020\u001cR\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u0019\u0010\u0005\u001a\u00020\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\t\u001a\u0004\b\u0007\u0010\bR\u0019\u0010\n\u001a\u00020\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\t\u001a\u0004\b\u000b\u0010\bR\u0019\u0010\f\u001a\u00020\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\t\u001a\u0004\b\r\u0010\b\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u001d²\u0006\n\u0010\u001e\u001a\u00020\u0006X\u008a\u0084\u0002²\u0006\n\u0010\u001f\u001a\u00020\u0006X\u008a\u0084\u0002"}, d2 = {"Landroidx/compose/material/TabRowDefaults;", "", "()V", "DividerOpacity", "", "DividerThickness", "Landroidx/compose/ui/unit/Dp;", "getDividerThickness-D9Ej5fM", "()F", "F", "IndicatorHeight", "getIndicatorHeight-D9Ej5fM", "ScrollableTabRowPadding", "getScrollableTabRowPadding-D9Ej5fM", "Divider", "", "modifier", "Landroidx/compose/ui/Modifier;", "thickness", "color", "Landroidx/compose/ui/graphics/Color;", "Divider-9IZ8Weo", "(Landroidx/compose/ui/Modifier;FJLandroidx/compose/runtime/Composer;II)V", "Indicator", "height", "Indicator-9IZ8Weo", "tabIndicatorOffset", "currentTabPosition", "Landroidx/compose/material/TabPosition;", "material_release", "currentTabWidth", "indicatorOffset"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class TabRowDefaults {
    public static final int $stable = 0;
    public static final float DividerOpacity = 0.12f;
    private static final float DividerThickness = 0.0f;
    public static final TabRowDefaults INSTANCE = null;
    private static final float IndicatorHeight = 0.0f;
    private static final float ScrollableTabRowPadding = 0.0f;

    /* JADX INFO: renamed from: androidx.compose.material.TabRowDefaults$tabIndicatorOffset$2, reason: invalid class name */
    /* JADX INFO: compiled from: TabRow.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "Landroidx/compose/ui/Modifier;", "invoke", "(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/Modifier;"}, k = 3, mv = {1, 9, 0}, xi = 48)
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
            $composer.startReplaceGroup(-398757863);
            ComposerKt.sourceInformation($composer, "C394@17890L189,399@18131L188,405@18427L53:TabRow.kt#jmzs0o");
            if (ComposerKt.isTraceInProgress() == false) goto L5;
            ComposerKt.traceEventStart(-398757863, $changed, -1, "androidx.compose.material.TabRowDefaults.tabIndicatorOffset.<anonymous> (TabRow.kt:393)");
        L5:
            State<Dp> r14 = AnimateAsStateKt.m124animateDpAsStateAjpBEmI(this.$currentTabPosition.m1805getWidthD9Ej5fM(), AnimationSpecKt.tween$default(250, 0, EasingKt.getFastOutSlowInEasing(), 2, null), null, null, $composer, 0, 12);
            final State<Dp> r0 = AnimateAsStateKt.m124animateDpAsStateAjpBEmI(this.$currentTabPosition.m1803getLeftD9Ej5fM(), AnimationSpecKt.tween$default(250, 0, EasingKt.getFastOutSlowInEasing(), 2, null), null, null, $composer, 0, 12);
            Modifier r1 = SizeKt.wrapContentSize$default(SizeKt.fillMaxWidth$default($this$composed, 0.0f, 1, null), Alignment.Companion.getBottomStart(), false, 2, null);
            ComposerKt.sourceInformationMarkerStart($composer, 1390135538, "CC(remember):TabRow.kt#9igjgp");
            boolean invalid$iv = $composer.changed(r0);
            Object it$iv = $composer.rememberedValue();
            if (invalid$iv == false) goto L8;
        L11:
            Object value$iv = (Function1) new TabRowDefaults$tabIndicatorOffset$2$1$1(r0);
            $composer.updateRememberedValue(value$iv);
            it$iv = value$iv;
        L12:
            ComposerKt.sourceInformationMarkerEnd($composer);
            Modifier r2 = SizeKt.m777width3ABfNKs(OffsetKt.offset(r1, (Function1) it$iv), invoke$lambda$0(r14));
            if (ComposerKt.isTraceInProgress() == false) goto L15;
            ComposerKt.traceEventEnd();
        L15:
            $composer.endReplaceGroup();
            return r2;
        L8:
            if (it$iv != Composer.Companion.getEmpty()) goto L12;
            goto L11
        }

        private static final float invoke$lambda$1(State<Dp> r4) {
            return r4.getValue().m6987unboximpl();
        }
    }

    private TabRowDefaults() {
    }

    /* JADX INFO: renamed from: Divider-9IZ8Weo, reason: not valid java name */
    public final void m1806Divider9IZ8Weo(Modifier modifier, float thickness, long color, Composer $composer, final int $changed, final int r28) {
        Composer $composer2 = $composer.startRestartGroup(910934799);
        ComposerKt.sourceInformation($composer2, "C(Divider)P(1,2:c#ui.unit.Dp,0:c#ui.graphics.Color)358@16538L66:TabRow.kt#jmzs0o");
        int $dirty = $changed;
        int r2 = r28 & 1;
        if (r2 == 0) goto L6;
        $dirty = $dirty | 6;
        Modifier r3 = modifier;
    L14:
        if (($changed & 48) == 0) goto L16;
        float r4 = thickness;
    L25:
        if (($changed & 384) == 0) goto L27;
        long r7 = color;
    L36:
        if ((r28 & 8) == 0) goto L39;
        $dirty = $dirty | 3072;
    L47:
        if (($dirty & 1171) == 1170) goto L49;
        boolean r9 = true;
    L51:
        if ($composer2.shouldExecute(r9, $dirty & 1) == false) goto L82;
        $composer2.startDefaults();
        ComposerKt.sourceInformation($composer2, "356@16459L7");
        if (($changed & 1) != 0) goto L55;
    L64:
        if (r2 == 0) goto L66;
        Modifier.Companion modifier2 = Modifier.Companion;
    L68:
        if ((r28 & 2) == 0) goto L70;
        float thickness2 = DividerThickness;
        $dirty = $dirty & (-113);
    L72:
        if ((r28 & 4) == 0) goto L74;
        ProvidableCompositionLocal<Color> r5 = ContentColorKt.getLocalContentColor();
        ComposerKt.sourceInformationMarkerStart($composer2, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
        Object r11 = $composer2.consume(r5);
        ComposerKt.sourceInformationMarkerEnd($composer2);
        $dirty = $dirty & (-897);
        float thickness3 = thickness2;
        long color2 = Color.m4365copywmQWz5c$default(((Color) r11).m4376unboximpl(), 0.12f, 0.0f, 0.0f, 0.0f, 14, null);
        Modifier modifier3 = modifier2;
    L75:
        $composer2.endDefaults();
        if (ComposerKt.isTraceInProgress() == false) goto L78;
        ComposerKt.traceEventStart(910934799, $dirty, -1, "androidx.compose.material.TabRowDefaults.Divider (TabRow.kt:357)");
    L78:
        DividerKt.m1641DivideroMI9zvI(modifier3, color2, thickness3, 0.0f, $composer2, (($dirty & 14) | (($dirty >> 3) & 112)) | (($dirty << 3) & 896), 8);
        if (ComposerKt.isTraceInProgress() == false) goto L81;
        ComposerKt.traceEventEnd();
    L81:
        final Modifier modifier4 = modifier3;
        final long color3 = color2;
        final float thickness4 = thickness3;
    L83:
        ScopeUpdateScope r10 = $composer2.endRestartGroup();
        if (r10 == null) goto L87;
        r10.updateScope(new TabRowDefaults$Divider$1(this, modifier4, thickness4, color3, $changed, r28));
        return;
    L87:
        return;
    L74:
        thickness3 = thickness2;
        color2 = r7;
        modifier3 = modifier2;
        goto L75
    L70:
        thickness2 = r4;
        goto L72
    L66:
        modifier2 = r3;
        goto L68
    L55:
        if ($composer2.getDefaultsInvalid() == true) goto L64;
        $composer2.skipToGroupEnd();
        if ((r28 & 2) == 0) goto L61;
        $dirty = $dirty & (-113);
    L61:
        if ((r28 & 4) == 0) goto L63;
        $dirty = $dirty & (-897);
    L63:
        thickness3 = r4;
        color2 = r7;
        modifier3 = r3;
        goto L75
    L82:
        $composer2.skipToGroupEnd();
        modifier4 = r3;
        thickness4 = r4;
        color3 = r7;
        goto L83
    L49:
        r9 = false;
        goto L51
    L39:
        if (($changed & 3072) != 0) goto L47;
        if ($composer2.changed(this) == false) goto L43;
        int r12 = 2048;
    L44:
        $dirty = $dirty | r12;
        goto L47
    L43:
        r12 = 1024;
        goto L44
    L27:
        if ((r28 & 4) != 0) goto L31;
        r7 = color;
        if ($composer2.changed(r7) == false) goto L32;
        int r6 = 256;
    L33:
        $dirty = $dirty | r6;
    L32:
        r6 = 128;
        goto L33
    L31:
        r7 = color;
        goto L32
    L16:
        if ((r28 & 2) != 0) goto L20;
        r4 = thickness;
        if ($composer2.changed(r4) == false) goto L21;
        int r8 = 32;
    L22:
        $dirty = $dirty | r8;
    L21:
        r8 = 16;
        goto L22
    L20:
        r4 = thickness;
        goto L21
    L6:
        if (($changed & 6) != 0) goto L12;
        r3 = modifier;
        if ($composer2.changed(r3) == false) goto L10;
        int r13 = 4;
    L11:
        $dirty = $dirty | r13;
        goto L14
    L10:
        r13 = 2;
        goto L11
    L12:
        r3 = modifier;
        goto L14
    }

    /* JADX INFO: renamed from: Indicator-9IZ8Weo, reason: not valid java name */
    public final void m1807Indicator9IZ8Weo(Modifier modifier, float height, long color, Composer $composer, final int $changed, final int r27) {
        Composer $composer2 = $composer.startRestartGroup(1499002201);
        ComposerKt.sourceInformation($composer2, "C(Indicator)P(2,1:c#ui.unit.Dp,0:c#ui.graphics.Color)375@17071L69:TabRow.kt#jmzs0o");
        int $dirty = $changed;
        int r2 = r27 & 1;
        if (r2 == 0) goto L6;
        $dirty = $dirty | 6;
        Modifier r3 = modifier;
    L14:
        if (($changed & 48) == 0) goto L16;
        float r4 = height;
    L25:
        if (($changed & 384) == 0) goto L27;
        long color2 = color;
    L36:
        if ((r27 & 8) == 0) goto L39;
        $dirty = $dirty | 3072;
    L47:
        if (($dirty & 1171) == 1170) goto L49;
        boolean r7 = true;
    L51:
        if ($composer2.shouldExecute(r7, $dirty & 1) == false) goto L82;
        $composer2.startDefaults();
        ComposerKt.sourceInformation($composer2, "373@17047L7");
        if (($changed & 1) != 0) goto L55;
    L64:
        if (r2 == 0) goto L66;
        final Modifier.Companion modifier2 = Modifier.Companion;
    L68:
        if ((r27 & 2) == 0) goto L70;
        final float height2 = IndicatorHeight;
        $dirty = $dirty & (-113);
    L72:
        if ((r27 & 4) == 0) goto L74;
        ProvidableCompositionLocal<Color> r5 = ContentColorKt.getLocalContentColor();
        ComposerKt.sourceInformationMarkerStart($composer2, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
        Object r14 = $composer2.consume(r5);
        ComposerKt.sourceInformationMarkerEnd($composer2);
        $dirty = $dirty & (-897);
        long color3 = ((Color) r14).m4376unboximpl();
    L75:
        $composer2.endDefaults();
        if (ComposerKt.isTraceInProgress() == false) goto L78;
        ComposerKt.traceEventStart(1499002201, $dirty, -1, "androidx.compose.material.TabRowDefaults.Indicator (TabRow.kt:374)");
    L78:
        BoxKt.Box(BackgroundKt.m234backgroundbw27NRU$default(SizeKt.m758height3ABfNKs(SizeKt.fillMaxWidth$default(modifier2, 0.0f, 1, null), height2), color3, null, 2, null), $composer2, 0);
        if (ComposerKt.isTraceInProgress() == false) goto L81;
        ComposerKt.traceEventEnd();
    L81:
        final long color4 = color3;
    L83:
        ScopeUpdateScope r10 = $composer2.endRestartGroup();
        if (r10 == null) goto L87;
        r10.updateScope(new TabRowDefaults$Indicator$1(this, modifier2, height2, color4, $changed, r27));
        return;
    L87:
        return;
    L74:
        color3 = color2;
        goto L75
    L70:
        height2 = r4;
        goto L72
    L66:
        modifier2 = r3;
        goto L68
    L55:
        if ($composer2.getDefaultsInvalid() == true) goto L64;
        $composer2.skipToGroupEnd();
        if ((r27 & 2) == 0) goto L61;
        $dirty = $dirty & (-113);
    L61:
        if ((r27 & 4) == 0) goto L63;
        $dirty = $dirty & (-897);
        modifier2 = r3;
        height2 = r4;
        color3 = color2;
        goto L75
    L63:
        modifier2 = r3;
        height2 = r4;
        color3 = color2;
        goto L75
    L82:
        $composer2.skipToGroupEnd();
        modifier2 = r3;
        height2 = r4;
        color4 = color2;
        goto L83
    L49:
        r7 = false;
        goto L51
    L39:
        if (($changed & 3072) != 0) goto L47;
        if ($composer2.changed(this) == false) goto L43;
        int r8 = 2048;
    L44:
        $dirty = $dirty | r8;
        goto L47
    L43:
        r8 = 1024;
        goto L44
    L27:
        if ((r27 & 4) != 0) goto L31;
        color2 = color;
        if ($composer2.changed(color2) == false) goto L32;
        int r6 = 256;
    L33:
        $dirty = $dirty | r6;
    L32:
        r6 = 128;
        goto L33
    L31:
        color2 = color;
        goto L32
    L16:
        if ((r27 & 2) != 0) goto L20;
        r4 = height;
        if ($composer2.changed(r4) == false) goto L21;
        int r9 = 32;
    L22:
        $dirty = $dirty | r9;
    L21:
        r9 = 16;
        goto L22
    L20:
        r4 = height;
        goto L21
    L6:
        if (($changed & 6) != 0) goto L12;
        r3 = modifier;
        if ($composer2.changed(r3) == false) goto L10;
        int r11 = 4;
    L11:
        $dirty = $dirty | r11;
        goto L14
    L10:
        r11 = 2;
        goto L11
    L12:
        r3 = modifier;
        goto L14
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

    static {
        INSTANCE = new TabRowDefaults();
        DividerThickness = Dp.m6973constructorimpl(1);
        IndicatorHeight = Dp.m6973constructorimpl(2);
        ScrollableTabRowPadding = Dp.m6973constructorimpl(52);
    }

    /* JADX INFO: renamed from: getDividerThickness-D9Ej5fM, reason: not valid java name */
    public final float m1808getDividerThicknessD9Ej5fM() {
        return DividerThickness;
    }

    /* JADX INFO: renamed from: getIndicatorHeight-D9Ej5fM, reason: not valid java name */
    public final float m1809getIndicatorHeightD9Ej5fM() {
        return IndicatorHeight;
    }

    /* JADX INFO: renamed from: getScrollableTabRowPadding-D9Ej5fM, reason: not valid java name */
    public final float m1810getScrollableTabRowPaddingD9Ej5fM() {
        return ScrollableTabRowPadding;
    }
}
