package androidx.compose.foundation.layout;

import android.os.Build;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.input.nestedscroll.NestedScrollConnection;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.InspectableValueKt;
import androidx.compose.ui.platform.InspectorInfo;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: WindowInsetsConnection.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000,\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u001a\"\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0001ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0013\u001a\f\u0010\u0014\u001a\u00020\u0015*\u00020\u0015H\u0007\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0007\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\b\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\t\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\n\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\u000b\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0016"}, d2 = {"DecelMinusOne", "", "DecelerationRate", "EndTension", "", "GravityEarth", "InchesPerMeter", "Inflection", "P1", "P2", "PlatformFlingScrollFriction", "StartTension", "rememberWindowInsetsConnection", "Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;", "windowInsets", "Landroidx/compose/foundation/layout/AndroidWindowInsets;", "side", "Landroidx/compose/foundation/layout/WindowInsetsSides;", "rememberWindowInsetsConnection-VRgvIgI", "(Landroidx/compose/foundation/layout/AndroidWindowInsets;ILandroidx/compose/runtime/Composer;I)Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;", "imeNestedScroll", "Landroidx/compose/ui/Modifier;", "foundation-layout_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class WindowInsetsConnection_androidKt {
    private static final double DecelMinusOne = 0.0d;
    private static final double DecelerationRate = 0.0d;
    private static final float EndTension = 1.0f;
    private static final float GravityEarth = 9.80665f;
    private static final float InchesPerMeter = 39.37f;
    private static final float Inflection = 0.35f;
    private static final float P1 = 0.175f;
    private static final float P2 = 0.35000002f;
    private static final float PlatformFlingScrollFriction = 0.0f;
    private static final float StartTension = 0.5f;

    public static final /* synthetic */ double access$getDecelMinusOne$p() {
        return DecelMinusOne;
    }

    public static final /* synthetic */ double access$getDecelerationRate$p() {
        return DecelerationRate;
    }

    public static final /* synthetic */ float access$getPlatformFlingScrollFriction$p() {
        return PlatformFlingScrollFriction;
    }

    public static final Modifier imeNestedScroll(Modifier $this$imeNestedScroll) {
        if (Build.VERSION.SDK_INT >= 30) goto L6;
        return $this$imeNestedScroll;
    L6:
        if (InspectableValueKt.isDebugInspectorInfoEnabled() == false) goto L8;
        Function1<InspectorInfo, Unit> r1 = new WindowInsetsConnection_androidKt$imeNestedScroll$$inlined$debugInspectorInfo$1();
    L10:
        return ComposedModifierKt.composed($this$imeNestedScroll, r1, AnonymousClass2.INSTANCE);
    L8:
        r1 = InspectableValueKt.getNoInspectorInfo();
        goto L10
    }

    /* JADX INFO: renamed from: rememberWindowInsetsConnection-VRgvIgI, reason: not valid java name */
    public static final NestedScrollConnection m795rememberWindowInsetsConnectionVRgvIgI(AndroidWindowInsets windowInsets, int side, Composer $composer, int $changed) {
        $composer.startReplaceGroup(-1011341039);
        ComposerKt.sourceInformation($composer, "C(rememberWindowInsetsConnection)P(1,0:c#foundation.layout.WindowInsetsSides)109@4558L7,111@4671L7,112@4710L7,114@4747L157,117@4938L38,117@4909L67:WindowInsetsConnection.android.kt#2w3rfo");
        if (ComposerKt.isTraceInProgress() == false) goto L6;
        ComposerKt.traceEventStart(-1011341039, $changed, -1, "androidx.compose.foundation.layout.rememberWindowInsetsConnection (WindowInsetsConnection.android.kt:105)");
    L6:
        if (Build.VERSION.SDK_INT >= 30) goto L12;
        DoNothingNestedScrollConnection r3 = DoNothingNestedScrollConnection.INSTANCE;
        if (ComposerKt.isTraceInProgress() == false) goto L10;
        ComposerKt.traceEventEnd();
    L10:
        $composer.endReplaceGroup();
        return r3;
    L12:
        ProvidableCompositionLocal<LayoutDirection> r4 = CompositionLocalsKt.getLocalLayoutDirection();
        ComposerKt.sourceInformationMarkerStart($composer, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
        Object r8 = $composer.consume(r4);
        ComposerKt.sourceInformationMarkerEnd($composer);
        LayoutDirection layoutDirection = (LayoutDirection) r8;
        SideCalculator sideCalculator = SideCalculator.Companion.m755chooseCalculatorni1skBw(side, layoutDirection);
        ProvidableCompositionLocal<View> r9 = AndroidCompositionLocals_androidKt.getLocalView();
        ComposerKt.sourceInformationMarkerStart($composer, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
        Object r11 = $composer.consume(r9);
        ComposerKt.sourceInformationMarkerEnd($composer);
        View view = (View) r11;
        ProvidableCompositionLocal<Density> r10 = CompositionLocalsKt.getLocalDensity();
        ComposerKt.sourceInformationMarkerStart($composer, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
        Object r6 = $composer.consume(r10);
        ComposerKt.sourceInformationMarkerEnd($composer);
        Density density = (Density) r6;
        ComposerKt.sourceInformationMarkerStart($composer, 786091576, "CC(remember):WindowInsetsConnection.android.kt#9igjgp");
        if ((($changed & 14) ^ 6) <= 4) goto L17;
        if ($composer.changed(windowInsets) == false) goto L17;
    L18:
        boolean r7 = true;
    L20:
        boolean invalid$iv = ((r7 | $composer.changed(view)) | $composer.changed(sideCalculator)) | $composer.changed(density);
        Object it$iv = $composer.rememberedValue();
        if (invalid$iv == false) goto L23;
    L26:
        Object value$iv = new WindowInsetsNestedScrollConnection(windowInsets, view, sideCalculator, density);
        $composer.updateRememberedValue(value$iv);
        it$iv = value$iv;
    L27:
        final WindowInsetsNestedScrollConnection connection = (WindowInsetsNestedScrollConnection) it$iv;
        ComposerKt.sourceInformationMarkerEnd($composer);
        ComposerKt.sourceInformationMarkerStart($composer, 786097569, "CC(remember):WindowInsetsConnection.android.kt#9igjgp");
        boolean invalid$iv2 = $composer.changedInstance(connection);
        Object it$iv2 = $composer.rememberedValue();
        if (invalid$iv2 == false) goto L30;
    L33:
        Object value$iv2 = (Function1) new WindowInsetsConnection_androidKt$rememberWindowInsetsConnection$1$1(connection);
        $composer.updateRememberedValue(value$iv2);
        it$iv2 = value$iv2;
    L34:
        ComposerKt.sourceInformationMarkerEnd($composer);
        EffectsKt.DisposableEffect(connection, (Function1) it$iv2, $composer, 0);
        if (ComposerKt.isTraceInProgress() == false) goto L37;
        ComposerKt.traceEventEnd();
    L37:
        $composer.endReplaceGroup();
        return connection;
    L30:
        if (it$iv2 != Composer.Companion.getEmpty()) goto L34;
    L23:
        if (it$iv != Composer.Companion.getEmpty()) goto L27;
    L17:
        if (($changed & 6) == 4) goto L18;
        r7 = false;
        goto L20
    }

    static {
        PlatformFlingScrollFriction = ViewConfiguration.getScrollFriction();
        DecelerationRate = Math.log(0.78d) / Math.log(0.9d);
        DecelMinusOne = DecelerationRate - 1.0d;
    }
}
