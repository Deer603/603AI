package androidx.compose.foundation.text;

import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.text.selection.AndroidSelectionHandles_androidKt;
import androidx.compose.foundation.text.selection.OffsetProvider;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.DpSize;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: AndroidCursorHandle.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000*\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a,\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u0010H\u0001ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012\u001a\u0017\u0010\u0013\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\u000eH\u0003¢\u0006\u0002\u0010\u0014\u001a\f\u0010\u0015\u001a\u00020\u000e*\u00020\u000eH\u0002\"\u0016\u0010\u0000\u001a\u00020\u0001X\u0080\u0004¢\u0006\n\n\u0002\u0010\u0004\u001a\u0004\b\u0002\u0010\u0003\"\u0016\u0010\u0005\u001a\u00020\u0001X\u0080\u0004¢\u0006\n\n\u0002\u0010\u0004\u001a\u0004\b\u0006\u0010\u0003\"\u000e\u0010\u0007\u001a\u00020\bX\u0082T¢\u0006\u0002\n\u0000\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0016"}, d2 = {"CursorHandleHeight", "Landroidx/compose/ui/unit/Dp;", "getCursorHandleHeight", "()F", "F", "CursorHandleWidth", "getCursorHandleWidth", "Sqrt2", "", "CursorHandle", "", "offsetProvider", "Landroidx/compose/foundation/text/selection/OffsetProvider;", "modifier", "Landroidx/compose/ui/Modifier;", "minTouchTargetSize", "Landroidx/compose/ui/unit/DpSize;", "CursorHandle-USBMPiE", "(Landroidx/compose/foundation/text/selection/OffsetProvider;Landroidx/compose/ui/Modifier;JLandroidx/compose/runtime/Composer;II)V", "DefaultCursorHandle", "(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "drawCursorHandle", "foundation_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class AndroidCursorHandle_androidKt {
    private static final float CursorHandleHeight = 0.0f;
    private static final float CursorHandleWidth = 0.0f;
    private static final float Sqrt2 = 1.4142135f;

    public static final /* synthetic */ void access$DefaultCursorHandle(Modifier modifier, Composer $composer, int $changed, int $default) {
        DefaultCursorHandle(modifier, $composer, $changed, $default);
    }

    static {
        CursorHandleHeight = Dp.m6973constructorimpl(25);
        float arg0$iv = CursorHandleHeight;
        CursorHandleWidth = Dp.m6973constructorimpl(Dp.m6973constructorimpl(arg0$iv * 2.0f) / 2.4142137f);
    }

    public static final float getCursorHandleHeight() {
        return CursorHandleHeight;
    }

    public static final float getCursorHandleWidth() {
        return CursorHandleWidth;
    }

    /* JADX INFO: renamed from: CursorHandle-USBMPiE, reason: not valid java name */
    public static final void m1021CursorHandleUSBMPiE(final OffsetProvider offsetProvider, final Modifier modifier, long minTouchTargetSize, Composer $composer, final int $changed, final int r24) {
        Composer $composer2 = $composer.startRestartGroup(1776202187);
        ComposerKt.sourceInformation($composer2, "C(CursorHandle)P(2,1,0:c#ui.unit.DpSize)53@2200L305,62@2601L490,62@2510L581:AndroidCursorHandle.android.kt#423gt5");
        int $dirty = $changed;
        if ((r24 & 1) == 0) goto L6;
        $dirty = $dirty | 6;
    L16:
        if ((r24 & 2) == 0) goto L19;
        $dirty = $dirty | 48;
    L26:
        if (($changed & 384) == 0) goto L28;
        final long minTouchTargetSize2 = minTouchTargetSize;
    L37:
        if (($dirty & 147) == 146) goto L39;
        boolean r4 = true;
    L41:
        if ($composer2.shouldExecute(r4, $dirty & 1) == false) goto L76;
        $composer2.startDefaults();
        if (($changed & 1) == 0) goto L51;
        if ($composer2.getDefaultsInvalid() == true) goto L51;
        $composer2.skipToGroupEnd();
        if ((r24 & 4) == 0) goto L53;
        $dirty = $dirty & (-897);
    L53:
        $composer2.endDefaults();
        if (ComposerKt.isTraceInProgress() == false) goto L56;
        ComposerKt.traceEventStart(1776202187, $dirty, -1, "androidx.compose.foundation.text.CursorHandle (AndroidCursorHandle.android.kt:51)");
    L56:
        ComposerKt.sourceInformationMarkerStart($composer2, -533359466, "CC(remember):AndroidCursorHandle.android.kt#9igjgp");
        if (($dirty & 14) != 4) goto L59;
    L64:
        boolean invalid$iv = true;
    L65:
        Object it$iv = $composer2.rememberedValue();
        if (invalid$iv == false) goto L68;
    L71:
        Object value$iv = (Function1) new AndroidCursorHandle_androidKt$CursorHandle$finalModifier$1$1(offsetProvider);
        $composer2.updateRememberedValue(value$iv);
        it$iv = value$iv;
    L72:
        ComposerKt.sourceInformationMarkerEnd($composer2);
        final Modifier finalModifier = SemanticsModifierKt.semantics$default(modifier, false, (Function1) it$iv, 1, null);
        AndroidSelectionHandles_androidKt.HandlePopup(offsetProvider, Alignment.Companion.getTopCenter(), ComposableLambdaKt.rememberComposableLambda(-1653527038, true, new AndroidCursorHandle_androidKt$CursorHandle$1(minTouchTargetSize2, finalModifier), $composer2, 54), $composer2, ($dirty & 14) | 432);
        if (ComposerKt.isTraceInProgress() == false) goto L75;
        ComposerKt.traceEventEnd();
    L75:
        final long minTouchTargetSize3 = minTouchTargetSize2;
    L77:
        ScopeUpdateScope r9 = $composer2.endRestartGroup();
        if (r9 == null) goto L81;
        r9.updateScope(new AndroidCursorHandle_androidKt$CursorHandle$2(offsetProvider, modifier, minTouchTargetSize3, $changed, r24));
        return;
    L81:
        return;
    L68:
        if (it$iv != Composer.Companion.getEmpty()) goto L72;
    L59:
        if (($dirty & 8) != 0) goto L61;
    L63:
        invalid$iv = false;
        goto L65
    L61:
        if ($composer2.changedInstance(offsetProvider) == false) goto L63;
    L51:
        if ((r24 & 4) == 0) goto L53;
        minTouchTargetSize2 = DpSize.Companion.m7080getUnspecifiedMYxV2XQ();
        $dirty = $dirty & (-897);
        goto L53
    L76:
        $composer2.skipToGroupEnd();
        minTouchTargetSize3 = minTouchTargetSize2;
        goto L77
    L39:
        r4 = false;
        goto L41
    L28:
        if ((r24 & 4) != 0) goto L32;
        minTouchTargetSize2 = minTouchTargetSize;
        if ($composer2.changed(minTouchTargetSize2) == false) goto L33;
        int r5 = 256;
    L34:
        $dirty = $dirty | r5;
    L33:
        r5 = 128;
        goto L34
    L32:
        minTouchTargetSize2 = minTouchTargetSize;
        goto L33
    L19:
        if (($changed & 48) != 0) goto L26;
        if ($composer2.changed(modifier) == false) goto L23;
        int r6 = 32;
    L24:
        $dirty = $dirty | r6;
        goto L26
    L23:
        r6 = 16;
        goto L24
    L6:
        if (($changed & 6) != 0) goto L16;
        if (($changed & 8) != 0) goto L10;
        boolean r7 = $composer2.changed(offsetProvider);
    L11:
        if (r7 == false) goto L13;
        int r8 = 4;
    L14:
        $dirty = $dirty | r8;
        goto L16
    L13:
        r8 = 2;
        goto L14
    L10:
        r7 = $composer2.changedInstance(offsetProvider);
        goto L11
    }

    private static final void DefaultCursorHandle(final Modifier modifier, Composer $composer, final int $changed, final int r9) {
        Composer $composer2 = $composer.startRestartGroup(694251107);
        ComposerKt.sourceInformation($composer2, "C(DefaultCursorHandle)83@3199L79:AndroidCursorHandle.android.kt#423gt5");
        int $dirty = $changed;
        int r2 = r9 & 1;
        if (r2 == 0) goto L6;
        $dirty = $dirty | 6;
    L13:
        if (($dirty & 3) == 2) goto L15;
        boolean r3 = true;
    L17:
        if ($composer2.shouldExecute(r3, $dirty & 1) == false) goto L26;
        if (r2 == 0) goto L21;
        modifier = Modifier.Companion;
    L21:
        if (ComposerKt.isTraceInProgress() == false) goto L23;
        ComposerKt.traceEventStart(694251107, $dirty, -1, "androidx.compose.foundation.text.DefaultCursorHandle (AndroidCursorHandle.android.kt:82)");
    L23:
        SpacerKt.Spacer(drawCursorHandle(SizeKt.m774sizeVpY3zN4(modifier, CursorHandleWidth, CursorHandleHeight)), $composer2, 0);
        if (ComposerKt.isTraceInProgress() == false) goto L27;
        ComposerKt.traceEventEnd();
    L27:
        ScopeUpdateScope r0 = $composer2.endRestartGroup();
        if (r0 == null) goto L31;
        r0.updateScope(new AnonymousClass1(modifier, $changed, r9));
        return;
    L31:
        return;
    L26:
        $composer2.skipToGroupEnd();
        goto L27
    L15:
        r3 = false;
        goto L17
    L6:
        if (($changed & 6) != 0) goto L13;
        if ($composer2.changed(modifier) == false) goto L10;
        int r4 = 4;
    L11:
        $dirty = $dirty | r4;
        goto L13
    L10:
        r4 = 2;
        goto L11
    }

    private static final Modifier drawCursorHandle(Modifier $this$drawCursorHandle) {
        return ComposedModifierKt.composed$default($this$drawCursorHandle, null, C03451.INSTANCE, 1, null);
    }
}
