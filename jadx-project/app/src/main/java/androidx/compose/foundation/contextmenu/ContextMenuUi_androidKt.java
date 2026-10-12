package androidx.compose.foundation.contextmenu;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import androidx.autofill.HintConstants;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.IntrinsicKt;
import androidx.compose.foundation.layout.IntrinsicSize;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.foundation.text.BasicTextKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ShadowKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.window.AndroidPopup_androidKt;
import androidx.compose.ui.window.PopupPositionProvider;
import androidx.compose.ui.window.PopupProperties;
import androidx.profileinstaller.ProfileVerifier;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: ContextMenuUi.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0080\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a=\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u00012\b\b\u0002\u0010\r\u001a\u00020\u000e2\u001c\u0010\u000f\u001a\u0018\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u000b0\u0010¢\u0006\u0002\b\u0012¢\u0006\u0002\b\u0013H\u0001¢\u0006\u0002\u0010\u0014\u001ai\u0010\u0015\u001a\u00020\u000b2\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\f\u001a\u00020\u00012\b\b\u0002\u0010\r\u001a\u00020\u000e2*\b\u0002\u0010\u001a\u001a$\u0012\u0013\u0012\u00110\u001b¢\u0006\f\b\u001c\u0012\b\b\u001d\u0012\u0004\b\b(\u001e\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u0010¢\u0006\u0002\b\u00122\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u000b0 H\u0001¢\u0006\u0002\u0010!\u001aN\u0010\"\u001a\u00020\u000b2\u0006\u0010#\u001a\u00020$2\f\u0010%\u001a\b\u0012\u0004\u0012\u00020\u000b0 2\b\b\u0002\u0010\r\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u00012\u0017\u0010&\u001a\u0013\u0012\u0004\u0012\u00020'\u0012\u0004\u0012\u00020\u000b0\u0010¢\u0006\u0002\b\u0013H\u0001¢\u0006\u0002\u0010(\u001aF\u0010\"\u001a\u00020\u000b2\u0006\u0010#\u001a\u00020$2\f\u0010%\u001a\b\u0012\u0004\u0012\u00020\u000b0 2\b\b\u0002\u0010\r\u001a\u00020\u000e2\u0017\u0010&\u001a\u0013\u0012\u0004\u0012\u00020'\u0012\u0004\u0012\u00020\u000b0\u0010¢\u0006\u0002\b\u0013H\u0001¢\u0006\u0002\u0010)\u001a!\u0010*\u001a\u00020\u00012\b\b\u0003\u0010+\u001a\u00020,2\b\b\u0003\u0010-\u001a\u00020,H\u0001¢\u0006\u0002\u0010.\u001a \u0010/\u001a\u00020\u001b*\u0004\u0018\u0001002\u0006\u00101\u001a\u00020\u001bH\u0002ø\u0001\u0000¢\u0006\u0004\b2\u00103\u001a \u00104\u001a\u00020\u001b*\u0004\u0018\u0001002\u0006\u00101\u001a\u00020\u001bH\u0002ø\u0001\u0000¢\u0006\u0004\b5\u00103\u001a2\u00106\u001a\u00020\u001b*\u0002072\b\b\u0001\u00108\u001a\u00020,2\b\b\u0001\u00109\u001a\u00020,2\u0006\u00101\u001a\u00020\u001bH\u0002ø\u0001\u0000¢\u0006\u0004\b:\u0010;\u001a\"\u0010<\u001a\u0004\u0018\u000100*\u0002072\b\b\u0001\u00108\u001a\u00020,2\b\b\u0001\u00109\u001a\u00020,H\u0002\"\u001c\u0010\u0000\u001a\u00020\u00018\u0000X\u0081\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0002\u0010\u0003\u001a\u0004\b\u0004\u0010\u0005\"\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\b\u001a\u00020\tX\u0082T¢\u0006\u0002\n\u0000\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006="}, d2 = {"DefaultContextMenuColors", "Landroidx/compose/foundation/contextmenu/ContextMenuColors;", "getDefaultContextMenuColors$annotations", "()V", "getDefaultContextMenuColors", "()Landroidx/compose/foundation/contextmenu/ContextMenuColors;", "DefaultPopupProperties", "Landroidx/compose/ui/window/PopupProperties;", "DisabledAlpha", "", "ContextMenuColumn", "", "colors", "modifier", "Landroidx/compose/ui/Modifier;", "content", "Lkotlin/Function1;", "Landroidx/compose/foundation/layout/ColumnScope;", "Landroidx/compose/runtime/Composable;", "Lkotlin/ExtensionFunctionType;", "(Landroidx/compose/foundation/contextmenu/ContextMenuColors;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "ContextMenuItem", "label", "", "enabled", "", "leadingIcon", "Landroidx/compose/ui/graphics/Color;", "Lkotlin/ParameterName;", HintConstants.AUTOFILL_HINT_NAME, "iconColor", "onClick", "Lkotlin/Function0;", "(Ljava/lang/String;ZLandroidx/compose/foundation/contextmenu/ContextMenuColors;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "ContextMenuPopup", "popupPositionProvider", "Landroidx/compose/ui/window/PopupPositionProvider;", "onDismiss", "contextMenuBuilderBlock", "Landroidx/compose/foundation/contextmenu/ContextMenuScope;", "(Landroidx/compose/ui/window/PopupPositionProvider;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/contextmenu/ContextMenuColors;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "(Landroidx/compose/ui/window/PopupPositionProvider;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "computeContextMenuColors", "backgroundStyleId", "", "foregroundStyleId", "(IILandroidx/compose/runtime/Composer;II)Landroidx/compose/foundation/contextmenu/ContextMenuColors;", "disabledColor", "Landroid/content/res/ColorStateList;", "defaultColor", "disabledColor-4WTKRHQ", "(Landroid/content/res/ColorStateList;J)J", "enabledColor", "enabledColor-4WTKRHQ", "resolveColor", "Landroid/content/Context;", "resId", "attrId", "resolveColor-g2O1Hgs", "(Landroid/content/Context;IIJ)J", "resolveColorStateList", "foundation_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class ContextMenuUi_androidKt {
    private static final ContextMenuColors DefaultContextMenuColors = null;
    private static final PopupProperties DefaultPopupProperties = null;
    private static final float DisabledAlpha = 0.38f;

    public static /* synthetic */ void getDefaultContextMenuColors$annotations() {
    }

    static {
        DefaultPopupProperties = new PopupProperties(true, false, false, false, 14, null);
        DefaultContextMenuColors = new ContextMenuColors(Color.Companion.m4403getWhite0d7_KjU(), Color.Companion.m4392getBlack0d7_KjU(), Color.Companion.m4392getBlack0d7_KjU(), Color.m4365copywmQWz5c$default(Color.Companion.m4392getBlack0d7_KjU(), 0.38f, 0.0f, 0.0f, 0.0f, 14, null), Color.m4365copywmQWz5c$default(Color.Companion.m4392getBlack0d7_KjU(), 0.38f, 0.0f, 0.0f, 0.0f, 14, null), null);
    }

    public static final void ContextMenuPopup(final PopupPositionProvider popupPositionProvider, final Function0<Unit> r16, Modifier modifier, final Function1<? super ContextMenuScope, Unit> r18, Composer $composer, final int $changed, final int r21) {
        Composer $composer2 = $composer.startRestartGroup(712057293);
        ComposerKt.sourceInformation($composer2, "C(ContextMenuPopup)P(3,2,1)111@4263L26,107@4113L241:ContextMenuUi.android.kt#3xeu6s");
        int $dirty = $changed;
        if ((r21 & 1) == 0) goto L6;
        $dirty = $dirty | 6;
    L13:
        if ((r21 & 2) == 0) goto L16;
        $dirty = $dirty | 48;
        Function0<Unit> r2 = r16;
    L23:
        int r3 = r21 & 4;
        if (r3 == 0) goto L27;
        $dirty = $dirty | 384;
        Modifier r4 = modifier;
    L35:
        if ((r21 & 8) == 0) goto L38;
        $dirty = $dirty | 3072;
        Function1<? super ContextMenuScope, Unit> r10 = r18;
    L45:
        int $dirty2 = $dirty;
        if (($dirty2 & 1171) == 1170) goto L48;
        boolean r1 = true;
    L50:
        if ($composer2.shouldExecute(r1, $dirty2 & 1) == false) goto L61;
        if (r3 == 0) goto L53;
        Modifier modifier2 = Modifier.Companion;
    L55:
        if (ComposerKt.isTraceInProgress() == false) goto L57;
        ComposerKt.traceEventStart(712057293, $dirty2, -1, "androidx.compose.foundation.contextmenu.ContextMenuPopup (ContextMenuUi.android.kt:106)");
    L57:
        ContextMenuPopup(popupPositionProvider, r2, modifier2, computeContextMenuColors(0, 0, $composer2, 0, 3), r10, $composer2, ((($dirty2 & 14) | ($dirty2 & 112)) | ($dirty2 & 896)) | (($dirty2 << 3) & 57344), 0);
        if (ComposerKt.isTraceInProgress() == false) goto L60;
        ComposerKt.traceEventEnd();
    L60:
        final Modifier modifier3 = modifier2;
    L62:
        ScopeUpdateScope r7 = $composer2.endRestartGroup();
        if (r7 == null) goto L66;
        r7.updateScope(new C02241(popupPositionProvider, r16, modifier3, r18, $changed, r21));
        return;
    L66:
        return;
    L53:
        modifier2 = r4;
        goto L55
    L61:
        $composer2.skipToGroupEnd();
        modifier3 = r4;
        goto L62
    L48:
        r1 = false;
        goto L50
    L38:
        if (($changed & 3072) != 0) goto L44;
        r10 = r18;
        if ($composer2.changedInstance(r10) == false) goto L42;
        int r6 = 2048;
    L43:
        $dirty = $dirty | r6;
        goto L45
    L42:
        r6 = 1024;
        goto L43
    L44:
        r10 = r18;
        goto L45
    L27:
        if (($changed & 384) != 0) goto L33;
        r4 = modifier;
        if ($composer2.changed(r4) == false) goto L31;
        int r8 = 256;
    L32:
        $dirty = $dirty | r8;
        goto L35
    L31:
        r8 = 128;
        goto L32
    L33:
        r4 = modifier;
        goto L35
    L16:
        if (($changed & 48) != 0) goto L22;
        r2 = r16;
        if ($composer2.changedInstance(r2) == false) goto L20;
        int r5 = 32;
    L21:
        $dirty = $dirty | r5;
        goto L23
    L20:
        r5 = 16;
        goto L21
    L22:
        r2 = r16;
        goto L23
    L6:
        if (($changed & 6) != 0) goto L13;
        if ($composer2.changed(popupPositionProvider) == false) goto L10;
        int r9 = 4;
    L11:
        $dirty = $dirty | r9;
        goto L13
    L10:
        r9 = 2;
        goto L11
    }

    public static final void ContextMenuPopup(final PopupPositionProvider popupPositionProvider, final Function0<Unit> r16, Modifier modifier, final ContextMenuColors colors, final Function1<? super ContextMenuScope, Unit> r19, Composer $composer, final int $changed, final int r22) {
        Composer $composer2 = $composer.startRestartGroup(1447189339);
        ComposerKt.sourceInformation($composer2, "C(ContextMenuPopup)P(4,3,2)129@4780L257,125@4629L408:ContextMenuUi.android.kt#3xeu6s");
        int $dirty = $changed;
        if ((r22 & 1) == 0) goto L6;
        $dirty = $dirty | 6;
    L13:
        if ((r22 & 2) == 0) goto L16;
        $dirty = $dirty | 48;
        Function0<Unit> r8 = r16;
    L23:
        int r2 = r22 & 4;
        if (r2 == 0) goto L27;
        $dirty = $dirty | 384;
        final Modifier modifier2 = modifier;
    L35:
        if ((r22 & 8) == 0) goto L38;
        $dirty = $dirty | 3072;
    L45:
        if ((r22 & 16) == 0) goto L48;
        $dirty = $dirty | 24576;
    L54:
        int $dirty2 = $dirty;
        if (($dirty2 & 9363) == 9362) goto L57;
        boolean r1 = true;
    L59:
        if ($composer2.shouldExecute(r1, $dirty2 & 1) == false) goto L70;
        if (r2 == 0) goto L62;
        final Modifier.Companion modifier3 = Modifier.Companion;
    L64:
        if (ComposerKt.isTraceInProgress() == false) goto L66;
        ComposerKt.traceEventStart(1447189339, $dirty2, -1, "androidx.compose.foundation.contextmenu.ContextMenuPopup (ContextMenuUi.android.kt:124)");
    L66:
        AndroidPopup_androidKt.Popup(popupPositionProvider, r8, DefaultPopupProperties, ComposableLambdaKt.rememberComposableLambda(795909757, true, new AnonymousClass2(colors, modifier3, r19), $composer2, 54), $composer2, (($dirty2 & 14) | 3456) | ($dirty2 & 112), 0);
        if (ComposerKt.isTraceInProgress() == false) goto L69;
        ComposerKt.traceEventEnd();
    L69:
        modifier2 = modifier3;
    L71:
        ScopeUpdateScope r9 = $composer2.endRestartGroup();
        if (r9 == null) goto L75;
        r9.updateScope(new C02253(popupPositionProvider, r16, modifier2, colors, r19, $changed, r22));
        return;
    L75:
        return;
    L62:
        modifier3 = modifier2;
        goto L64
    L70:
        $composer2.skipToGroupEnd();
        goto L71
    L57:
        r1 = false;
        goto L59
    L48:
        if (($changed & 24576) != 0) goto L54;
        if ($composer2.changedInstance(r19) == false) goto L52;
        int r7 = 16384;
    L53:
        $dirty = $dirty | r7;
        goto L54
    L52:
        r7 = 8192;
        goto L53
    L38:
        if (($changed & 3072) != 0) goto L45;
        if ($composer2.changed(colors) == false) goto L42;
        int r10 = 2048;
    L43:
        $dirty = $dirty | r10;
        goto L45
    L42:
        r10 = 1024;
        goto L43
    L27:
        if (($changed & 384) != 0) goto L33;
        modifier2 = modifier;
        if ($composer2.changed(modifier2) == false) goto L31;
        int r11 = 256;
    L32:
        $dirty = $dirty | r11;
        goto L35
    L31:
        r11 = 128;
        goto L32
    L33:
        modifier2 = modifier;
        goto L35
    L16:
        if (($changed & 48) != 0) goto L22;
        r8 = r16;
        if ($composer2.changedInstance(r8) == false) goto L20;
        int r3 = 32;
    L21:
        $dirty = $dirty | r3;
        goto L23
    L20:
        r3 = 16;
        goto L21
    L22:
        r8 = r16;
        goto L23
    L6:
        if (($changed & 6) != 0) goto L13;
        if ($composer2.changed(popupPositionProvider) == false) goto L10;
        int r4 = 4;
    L11:
        $dirty = $dirty | r4;
        goto L13
    L10:
        r4 = 2;
        goto L11
    }

    public static final void ContextMenuColumn(final ContextMenuColors colors, Modifier modifier, final Function3<? super ColumnScope, ? super Composer, ? super Integer, Unit> r30, Composer $composer, final int $changed, final int r33) {
        Composer $composer2 = $composer.startRestartGroup(-921259293);
        ComposerKt.sourceInformation($composer2, "C(ContextMenuColumn)P(!1,2)158@5642L21,148@5227L471:ContextMenuUi.android.kt#3xeu6s");
        int $dirty = $changed;
        if ((r33 & 1) == 0) goto L6;
        $dirty = $dirty | 6;
        ContextMenuColors r2 = colors;
    L13:
        int r5 = r33 & 2;
        if (r5 == 0) goto L17;
        $dirty = $dirty | 48;
        Modifier r7 = modifier;
    L25:
        if ((r33 & 4) == 0) goto L28;
        $dirty = $dirty | 384;
    L34:
        int $dirty2 = $dirty;
        if (($dirty2 & 147) == 146) goto L37;
        boolean r1 = true;
    L39:
        if ($composer2.shouldExecute(r1, $dirty2 & 1) == false) goto L65;
        if (r5 == 0) goto L42;
        Modifier modifier2 = Modifier.Companion;
    L44:
        if (ComposerKt.isTraceInProgress() == false) goto L46;
        ComposerKt.traceEventStart(-921259293, $dirty2, -1, "androidx.compose.foundation.contextmenu.ContextMenuColumn (ContextMenuUi.android.kt:147)");
    L46:
        Modifier modifier$iv = ScrollKt.verticalScroll$default(PaddingKt.m727paddingVpY3zN4$default(IntrinsicKt.width(BackgroundKt.m234backgroundbw27NRU$default(ShadowKt.m4001shadows4CzXII$default(modifier2, ContextMenuSpec.INSTANCE.m356getMenuContainerElevationD9Ej5fM(), RoundedCornerShapeKt.m1018RoundedCornerShape0680j_4(ContextMenuSpec.INSTANCE.m348getCornerRadiusD9Ej5fM()), false, 0, 0, 28, null), r2.m339getBackgroundColor0d7_KjU(), null, 2, null), IntrinsicSize.Max), 0.0f, ContextMenuSpec.INSTANCE.m357getVerticalPaddingD9Ej5fM(), 1, null), ScrollKt.rememberScrollState(0, $composer2, 0, 1), false, null, false, 14, null);
        int $changed$iv = ($dirty2 << 3) & 7168;
        ComposerKt.sourceInformationMarkerStart($composer2, -483455358, "CC(Column)P(2,3,1)87@4442L61,88@4508L133:Column.kt#2w3rfo");
        Arrangement.Vertical verticalArrangement$iv = Arrangement.INSTANCE.getTop();
        Alignment.Horizontal horizontalAlignment$iv = Alignment.Companion.getStart();
        MeasurePolicy measurePolicy$iv = ColumnKt.columnMeasurePolicy(verticalArrangement$iv, horizontalAlignment$iv, $composer2, (($changed$iv >> 3) & 14) | (($changed$iv >> 3) & 112));
        int $changed$iv$iv = ($changed$iv << 3) & 112;
        ComposerKt.sourceInformationMarkerStart($composer2, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
        int compositeKeyHash$iv$iv = ComposablesKt.getCurrentCompositeKeyHash($composer2, 0);
        CompositionLocalMap localMap$iv$iv = $composer2.getCurrentCompositionLocalMap();
        Modifier materialized$iv$iv = ComposedModifierKt.materializeModifier($composer2, modifier$iv);
        Function0<ComposeUiNode> r16 = ComposeUiNode.Companion.getConstructor();
        int $changed$iv$iv$iv = (($changed$iv$iv << 6) & 896) | 6;
        ComposerKt.sourceInformationMarkerStart($composer2, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
        if (($composer2.getApplier() instanceof Applier) == true) goto L49;
        ComposablesKt.invalidApplier();
    L49:
        $composer2.startReusableNode();
        if ($composer2.getInserting() == false) goto L52;
        Function0<ComposeUiNode> r3 = r16;
        $composer2.createNode(r3);
    L53:
        Composer $this$Layout_u24lambda_u240$iv$iv = Updater.m3808constructorimpl($composer2);
        Updater.m3815setimpl($this$Layout_u24lambda_u240$iv$iv, measurePolicy$iv, ComposeUiNode.Companion.getSetMeasurePolicy());
        Updater.m3815setimpl($this$Layout_u24lambda_u240$iv$iv, localMap$iv$iv, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> r4 = ComposeUiNode.Companion.getSetCompositeKeyHash();
        if ($this$Layout_u24lambda_u240$iv$iv.getInserting() == true) goto L60;
        if (Intrinsics.areEqual($this$Layout_u24lambda_u240$iv$iv.rememberedValue(), Integer.valueOf(compositeKeyHash$iv$iv)) == false) goto L60;
    L61:
        Updater.m3815setimpl($this$Layout_u24lambda_u240$iv$iv, materialized$iv$iv, ComposeUiNode.Companion.getSetModifier());
        int r6 = ($changed$iv$iv$iv >> 6) & 14;
        ComposerKt.sourceInformationMarkerStart($composer2, -384672921, "C89@4556L9:Column.kt#2w3rfo");
        r30.invoke(ColumnScopeInstance.INSTANCE, $composer2, Integer.valueOf((($changed$iv >> 6) & 112) | 6));
        ComposerKt.sourceInformationMarkerEnd($composer2);
        $composer2.endNode();
        ComposerKt.sourceInformationMarkerEnd($composer2);
        ComposerKt.sourceInformationMarkerEnd($composer2);
        ComposerKt.sourceInformationMarkerEnd($composer2);
        if (ComposerKt.isTraceInProgress() == false) goto L64;
        ComposerKt.traceEventEnd();
    L64:
        final Modifier modifier3 = modifier2;
    L66:
        ScopeUpdateScope r8 = $composer2.endRestartGroup();
        if (r8 == null) goto L70;
        r8.updateScope(new AnonymousClass1(colors, modifier3, r30, $changed, r33));
        return;
    L70:
        return;
    L60:
        $this$Layout_u24lambda_u240$iv$iv.updateRememberedValue(Integer.valueOf(compositeKeyHash$iv$iv));
        $this$Layout_u24lambda_u240$iv$iv.apply(Integer.valueOf(compositeKeyHash$iv$iv), r4);
        goto L61
    L52:
        r3 = r16;
        $composer2.useNode();
        goto L53
    L42:
        modifier2 = r7;
        goto L44
    L65:
        $composer2.skipToGroupEnd();
        modifier3 = r7;
        goto L66
    L37:
        r1 = false;
        goto L39
    L28:
        if (($changed & 384) != 0) goto L34;
        if ($composer2.changedInstance(r30) == false) goto L32;
        int r9 = 256;
    L33:
        $dirty = $dirty | r9;
        goto L34
    L32:
        r9 = 128;
        goto L33
    L17:
        if (($changed & 48) != 0) goto L23;
        r7 = modifier;
        if ($composer2.changed(r7) == false) goto L21;
        int r10 = 32;
    L22:
        $dirty = $dirty | r10;
        goto L25
    L21:
        r10 = 16;
        goto L22
    L23:
        r7 = modifier;
        goto L25
    L6:
        if (($changed & 6) != 0) goto L12;
        r2 = colors;
        if ($composer2.changed(r2) == false) goto L10;
        int r11 = 4;
    L11:
        $dirty = $dirty | r11;
        goto L13
    L10:
        r11 = 2;
        goto L11
    L12:
        r2 = colors;
        goto L13
    }

    public static final void ContextMenuItem(final String label, final boolean enabled, final ContextMenuColors colors, Modifier modifier, Function3<? super Color, ? super Composer, ? super Integer, Unit> r55, final Function0<Unit> r56, Composer $composer, final int $changed, final int r59) {
        Composer $composer2 = $composer.startRestartGroup(791018367);
        ComposerKt.sourceInformation($composer2, "C(ContextMenuItem)P(2,1!1,4)194@6867L237,186@6534L1752:ContextMenuUi.android.kt#3xeu6s");
        int $dirty = $changed;
        if ((r59 & 1) == 0) goto L6;
        $dirty = $dirty | 6;
        String r11 = label;
    L14:
        if ((r59 & 2) == 0) goto L17;
        $dirty = $dirty | 48;
    L24:
        if ((r59 & 4) == 0) goto L27;
        $dirty = $dirty | 384;
        ContextMenuColors r12 = colors;
    L34:
        int r3 = r59 & 8;
        if (r3 == 0) goto L38;
        $dirty = $dirty | 3072;
        Modifier r5 = modifier;
    L45:
        int r6 = r59 & 16;
        if (r6 == 0) goto L49;
        $dirty = $dirty | 24576;
        Function3<? super Color, ? super Composer, ? super Integer, Unit> r13 = r55;
    L57:
        if ((r59 & 32) == 0) goto L60;
        $dirty = $dirty | ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
    L66:
        int $dirty2 = $dirty;
        if ((74899 & $dirty2) == 74898) goto L69;
        boolean r2 = true;
    L71:
        if ($composer2.shouldExecute(r2, $dirty2 & 1) == false) goto L142;
        if (r3 == 0) goto L74;
        Modifier.Companion modifier2 = Modifier.Companion;
    L75:
        if (r6 == 0) goto L77;
        Function3<? super Color, ? super Composer, ? super Integer, Unit> r10 = null;
    L79:
        if (ComposerKt.isTraceInProgress() == false) goto L81;
        ComposerKt.traceEventStart(791018367, $dirty2, -1, "androidx.compose.foundation.contextmenu.ContextMenuItem (ContextMenuUi.android.kt:185)");
    L81:
        Alignment.Vertical r14 = ContextMenuSpec.INSTANCE.getLabelVerticalTextAlignment();
        Arrangement.HorizontalOrVertical r16 = Arrangement.INSTANCE.m606spacedBy0680j_4(ContextMenuSpec.INSTANCE.m350getHorizontalPaddingD9Ej5fM());
        ComposerKt.sourceInformationMarkerStart($composer2, -1814196044, "CC(remember):ContextMenuUi.android.kt#9igjgp");
        if (($dirty2 & 112) != 32) goto L84;
        boolean r0 = true;
    L86:
        if ((458752 & $dirty2) != 131072) goto L88;
        boolean r4 = true;
    L89:
        boolean invalid$iv = r0 | r4;
        Object it$iv = $composer2.rememberedValue();
        if (invalid$iv == false) goto L92;
    L95:
        Object value$iv = (Function0) new ContextMenuUi_androidKt$ContextMenuItem$1$1(enabled, r56);
        $composer2.updateRememberedValue(value$iv);
        it$iv = value$iv;
    L96:
        ComposerKt.sourceInformationMarkerEnd($composer2);
        Modifier modifier3 = modifier2;
        Modifier modifier$iv$iv = PaddingKt.m727paddingVpY3zN4$default(SizeKt.m775sizeInqDBjuR0(SizeKt.fillMaxWidth$default(ClickableKt.m268clickableXHw0xAI$default(modifier3, enabled, r11, null, (Function0) it$iv, 4, null), 0.0f, 1, null), ContextMenuSpec.INSTANCE.m347getContainerWidthMinD9Ej5fM(), ContextMenuSpec.INSTANCE.m355getListItemHeightD9Ej5fM(), ContextMenuSpec.INSTANCE.m346getContainerWidthMaxD9Ej5fM(), ContextMenuSpec.INSTANCE.m355getListItemHeightD9Ej5fM()), ContextMenuSpec.INSTANCE.m350getHorizontalPaddingD9Ej5fM(), 0.0f, 2, null);
        ComposerKt.sourceInformationMarkerStart($composer2, 693286680, "CC(Row)P(2,1,3)99@5124L58,100@5187L130:Row.kt#2w3rfo");
        MeasurePolicy measurePolicy$iv = RowKt.rowMeasurePolicy(r16, r14, $composer2, ((432 >> 3) & 14) | ((432 >> 3) & 112));
        int $changed$iv$iv = (432 << 3) & 112;
        ComposerKt.sourceInformationMarkerStart($composer2, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
        int compositeKeyHash$iv$iv = ComposablesKt.getCurrentCompositeKeyHash($composer2, 0);
        CompositionLocalMap localMap$iv$iv = $composer2.getCurrentCompositionLocalMap();
        Modifier materialized$iv$iv = ComposedModifierKt.materializeModifier($composer2, modifier$iv$iv);
        Function0<ComposeUiNode> r17 = ComposeUiNode.Companion.getConstructor();
        int $changed$iv$iv$iv = (($changed$iv$iv << 6) & 896) | 6;
        ComposerKt.sourceInformationMarkerStart($composer2, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
        if (($composer2.getApplier() instanceof Applier) == true) goto L99;
        ComposablesKt.invalidApplier();
    L99:
        $composer2.startReusableNode();
        if ($composer2.getInserting() == false) goto L102;
        $composer2.createNode(r17);
    L103:
        Composer $this$Layout_u24lambda_u240$iv$iv = Updater.m3808constructorimpl($composer2);
        Updater.m3815setimpl($this$Layout_u24lambda_u240$iv$iv, measurePolicy$iv, ComposeUiNode.Companion.getSetMeasurePolicy());
        Updater.m3815setimpl($this$Layout_u24lambda_u240$iv$iv, localMap$iv$iv, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> r1 = ComposeUiNode.Companion.getSetCompositeKeyHash();
        if ($this$Layout_u24lambda_u240$iv$iv.getInserting() == true) goto L109;
        int $changed$iv = 432;
        if (Intrinsics.areEqual($this$Layout_u24lambda_u240$iv$iv.rememberedValue(), Integer.valueOf(compositeKeyHash$iv$iv)) == true) goto L111;
    L110:
        $this$Layout_u24lambda_u240$iv$iv.updateRememberedValue(Integer.valueOf(compositeKeyHash$iv$iv));
        $this$Layout_u24lambda_u240$iv$iv.apply(Integer.valueOf(compositeKeyHash$iv$iv), r1);
    L111:
        Updater.m3815setimpl($this$Layout_u24lambda_u240$iv$iv, materialized$iv$iv, ComposeUiNode.Companion.getSetModifier());
        int r7 = ($changed$iv$iv$iv >> 6) & 14;
        ComposerKt.sourceInformationMarkerStart($composer2, -407735110, "C101@5232L9:Row.kt#2w3rfo");
        int r8 = (($changed$iv >> 6) & 112) | 6;
        RowScope $this$ContextMenuItem_u24lambda_u243 = RowScopeInstance.INSTANCE;
        ComposerKt.sourceInformationMarkerStart($composer2, 554785198, "C220@7981L299:ContextMenuUi.android.kt#3xeu6s");
        if (r10 != null) goto L114;
        $composer2.startReplaceGroup(554788141);
        $composer2.endReplaceGroup();
        Composer $composer3 = $composer2;
    L134:
        ContextMenuSpec r9 = ContextMenuSpec.INSTANCE;
        if (enabled == false) goto L137;
        long r15 = r12.m343getTextColor0d7_KjU();
    L138:
        BasicTextKt.m1033BasicTextRWo7tUw(label, $this$ContextMenuItem_u24lambda_u243.weight(Modifier.Companion, 1.0f, true), r9.m358textStyle8_81llA(r15), null, 0, false, 1, 0, null, null, $composer3, ($dirty2 & 14) | 1572864, 952);
        ComposerKt.sourceInformationMarkerEnd($composer3);
        ComposerKt.sourceInformationMarkerEnd($composer2);
        $composer2.endNode();
        ComposerKt.sourceInformationMarkerEnd($composer2);
        ComposerKt.sourceInformationMarkerEnd($composer2);
        ComposerKt.sourceInformationMarkerEnd($composer2);
        if (ComposerKt.isTraceInProgress() == false) goto L141;
        ComposerKt.traceEventEnd();
    L141:
        final Modifier modifier4 = modifier3;
        final Function3<? super Color, ? super Composer, ? super Integer, Unit> r18 = r10;
    L143:
        ScopeUpdateScope r19 = $composer2.endRestartGroup();
        if (r19 == null) goto L147;
        r19.updateScope(new AnonymousClass3(label, enabled, colors, modifier4, r18, r56, $changed, r59));
        return;
    L147:
        return;
    L137:
        r15 = r12.m341getDisabledTextColor0d7_KjU();
        goto L138
    L114:
        $composer2.startReplaceGroup(554788142);
        ComposerKt.sourceInformation($composer2, "*209@7568L394");
        Function3<? super Color, ? super Composer, ? super Integer, Unit> r20 = r10;
        Modifier modifier$iv = SizeKt.m768requiredSizeInqDBjuR0$default(Modifier.Companion, ContextMenuSpec.INSTANCE.m351getIconSizeD9Ej5fM(), 0.0f, ContextMenuSpec.INSTANCE.m351getIconSizeD9Ej5fM(), ContextMenuSpec.INSTANCE.m351getIconSizeD9Ej5fM(), 2, null);
        ComposerKt.sourceInformationMarkerStart($composer2, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
        Alignment contentAlignment$iv = Alignment.Companion.getTopStart();
        MeasurePolicy measurePolicy$iv2 = BoxKt.maybeCachedBoxMeasurePolicy(contentAlignment$iv, false);
        int $changed$iv$iv2 = (6 << 3) & 112;
        ComposerKt.sourceInformationMarkerStart($composer2, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
        int compositeKeyHash$iv$iv2 = ComposablesKt.getCurrentCompositeKeyHash($composer2, 0);
        CompositionLocalMap localMap$iv$iv2 = $composer2.getCurrentCompositionLocalMap();
        Modifier materialized$iv$iv2 = ComposedModifierKt.materializeModifier($composer2, modifier$iv);
        Function0<ComposeUiNode> r40 = ComposeUiNode.Companion.getConstructor();
        int $changed$iv$iv$iv2 = (($changed$iv$iv2 << 6) & 896) | 6;
        ComposerKt.sourceInformationMarkerStart($composer2, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
        if (($composer2.getApplier() instanceof Applier) == true) goto L117;
        ComposablesKt.invalidApplier();
    L117:
        $composer2.startReusableNode();
        if ($composer2.getInserting() == false) goto L120;
        Function0<ComposeUiNode> r21 = r40;
        $composer2.createNode(r21);
    L121:
        Composer $this$Layout_u24lambda_u240$iv$iv2 = Updater.m3808constructorimpl($composer2);
        $composer3 = $composer2;
        Updater.m3815setimpl($this$Layout_u24lambda_u240$iv$iv2, measurePolicy$iv2, ComposeUiNode.Companion.getSetMeasurePolicy());
        Updater.m3815setimpl($this$Layout_u24lambda_u240$iv$iv2, localMap$iv$iv2, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> r22 = ComposeUiNode.Companion.getSetCompositeKeyHash();
        if ($this$Layout_u24lambda_u240$iv$iv2.getInserting() == true) goto L128;
        if (Intrinsics.areEqual($this$Layout_u24lambda_u240$iv$iv2.rememberedValue(), Integer.valueOf(compositeKeyHash$iv$iv2)) == false) goto L128;
    L129:
        Updater.m3815setimpl($this$Layout_u24lambda_u240$iv$iv2, materialized$iv$iv2, ComposeUiNode.Companion.getSetModifier());
        int r23 = ($changed$iv$iv$iv2 >> 6) & 14;
        ComposerKt.sourceInformationMarkerStart($composer3, -2146730711, "C72@3468L9:Box.kt#2w3rfo");
        BoxScopeInstance r24 = BoxScopeInstance.INSTANCE;
        int r25 = ((6 >> 6) & 112) | 6;
        ComposerKt.sourceInformationMarkerStart($composer3, -1218042210, "C217@7883L65:ContextMenuUi.android.kt#3xeu6s");
        if (enabled == false) goto L132;
        long r26 = r12.m342getIconColor0d7_KjU();
    L133:
        r20.invoke(Color.m4356boximpl(r26), $composer3, 0);
        ComposerKt.sourceInformationMarkerEnd($composer3);
        ComposerKt.sourceInformationMarkerEnd($composer3);
        $composer3.endNode();
        ComposerKt.sourceInformationMarkerEnd($composer3);
        ComposerKt.sourceInformationMarkerEnd($composer3);
        ComposerKt.sourceInformationMarkerEnd($composer3);
        Unit r27 = Unit.INSTANCE;
        $composer3.endReplaceGroup();
        Unit r28 = Unit.INSTANCE;
        goto L134
    L132:
        r26 = r12.m340getDisabledIconColor0d7_KjU();
    L128:
        $this$Layout_u24lambda_u240$iv$iv2.updateRememberedValue(Integer.valueOf(compositeKeyHash$iv$iv2));
        $this$Layout_u24lambda_u240$iv$iv2.apply(Integer.valueOf(compositeKeyHash$iv$iv2), r22);
        goto L129
    L120:
        r21 = r40;
        $composer2.useNode();
        goto L121
    L109:
        $changed$iv = 432;
        goto L110
    L102:
        $composer2.useNode();
        goto L103
    L92:
        if (it$iv != Composer.Companion.getEmpty()) goto L96;
    L88:
        r4 = false;
        goto L89
    L84:
        r0 = false;
        goto L86
    L77:
        r10 = r13;
        goto L79
    L74:
        modifier2 = r5;
        goto L75
    L142:
        $composer2.skipToGroupEnd();
        modifier4 = r5;
        r18 = r13;
        goto L143
    L69:
        r2 = false;
        goto L71
    L60:
        if (($changed & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) != 0) goto L66;
        if ($composer2.changedInstance(r56) == false) goto L64;
        int r110 = 131072;
    L65:
        $dirty = $dirty | r110;
        goto L66
    L64:
        r110 = 65536;
        goto L65
    L49:
        if (($changed & 24576) != 0) goto L55;
        r13 = r55;
        if ($composer2.changedInstance(r13) == false) goto L53;
        int r111 = 16384;
    L54:
        $dirty = $dirty | r111;
        goto L57
    L53:
        r111 = 8192;
        goto L54
    L55:
        r13 = r55;
        goto L57
    L38:
        if (($changed & 3072) != 0) goto L44;
        r5 = modifier;
        if ($composer2.changed(r5) == false) goto L42;
        int r29 = 2048;
    L43:
        $dirty = $dirty | r29;
        goto L45
    L42:
        r29 = 1024;
        goto L43
    L44:
        r5 = modifier;
        goto L45
    L27:
        if (($changed & 384) != 0) goto L33;
        r12 = colors;
        if ($composer2.changed(r12) == false) goto L31;
        int r30 = 256;
    L32:
        $dirty = $dirty | r30;
        goto L34
    L31:
        r30 = 128;
        goto L32
    L33:
        r12 = colors;
        goto L34
    L17:
        if (($changed & 48) != 0) goto L24;
        if ($composer2.changed(enabled) == false) goto L21;
        int r31 = 32;
    L22:
        $dirty = $dirty | r31;
        goto L24
    L21:
        r31 = 16;
        goto L22
    L6:
        if (($changed & 6) != 0) goto L12;
        r11 = label;
        if ($composer2.changed(r11) == false) goto L10;
        int r32 = 4;
    L11:
        $dirty = $dirty | r32;
        goto L14
    L10:
        r32 = 2;
        goto L11
    L12:
        r11 = label;
        goto L14
    }

    public static final ContextMenuColors getDefaultContextMenuColors() {
        return DefaultContextMenuColors;
    }

    public static final ContextMenuColors computeContextMenuColors(int backgroundStyleId, int foregroundStyleId, Composer $composer, int $changed, int r29) {
        ComposerKt.sourceInformationMarkerStart($composer, 1689505294, "C(computeContextMenuColors)364@13466L7,365@13522L7,365@13485L898:ContextMenuUi.android.kt#3xeu6s");
        if ((r29 & 1) == 0) goto L5;
        int backgroundStyleId2 = R.style.Widget.PopupMenu;
    L7:
        if ((r29 & 2) == 0) goto L9;
        int foregroundStyleId2 = R.style.TextAppearance.Widget.PopupMenu.Large;
    L11:
        if (ComposerKt.isTraceInProgress() == false) goto L14;
        ComposerKt.traceEventStart(1689505294, $changed, -1, "androidx.compose.foundation.contextmenu.computeContextMenuColors (ContextMenuUi.android.kt:363)");
    L14:
        ProvidableCompositionLocal<Context> r1 = AndroidCompositionLocals_androidKt.getLocalContext();
        ComposerKt.sourceInformationMarkerStart($composer, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
        Object r9 = $composer.consume(r1);
        ComposerKt.sourceInformationMarkerEnd($composer);
        Context context = (Context) r9;
        ProvidableCompositionLocal<Configuration> r4 = AndroidCompositionLocals_androidKt.getLocalConfiguration();
        ComposerKt.sourceInformationMarkerStart($composer, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
        Object r7 = $composer.consume(r4);
        ComposerKt.sourceInformationMarkerEnd($composer);
        ComposerKt.sourceInformationMarkerStart($composer, -753188989, "CC(remember):ContextMenuUi.android.kt#9igjgp");
        boolean invalid$iv = $composer.changed(context) | $composer.changed((Configuration) r7);
        Object it$iv = $composer.rememberedValue();
        if (invalid$iv == false) goto L17;
    L20:
        long backgroundColor = m362resolveColorg2O1Hgs(context, backgroundStyleId2, R.attr.colorBackground, DefaultContextMenuColors.m339getBackgroundColor0d7_KjU());
        ColorStateList textColorStateList = resolveColorStateList(context, foregroundStyleId2, R.attr.textColorPrimary);
        long enabledColor = m361enabledColor4WTKRHQ(textColorStateList, DefaultContextMenuColors.m343getTextColor0d7_KjU());
        long disabledColor = m360disabledColor4WTKRHQ(textColorStateList, DefaultContextMenuColors.m341getDisabledTextColor0d7_KjU());
        Object value$iv = new ContextMenuColors(backgroundColor, enabledColor, enabledColor, disabledColor, disabledColor, null);
        $composer.updateRememberedValue(value$iv);
        it$iv = value$iv;
    L21:
        ContextMenuColors r8 = (ContextMenuColors) it$iv;
        ComposerKt.sourceInformationMarkerEnd($composer);
        if (ComposerKt.isTraceInProgress() == false) goto L24;
        ComposerKt.traceEventEnd();
    L24:
        ComposerKt.sourceInformationMarkerEnd($composer);
        return r8;
    L17:
        if (it$iv != Composer.Companion.getEmpty()) goto L21;
    L9:
        foregroundStyleId2 = foregroundStyleId;
        goto L11
    L5:
        backgroundStyleId2 = backgroundStyleId;
        goto L7
    }

    /* JADX INFO: renamed from: resolveColor-g2O1Hgs, reason: not valid java name */
    private static final long m362resolveColorg2O1Hgs(Context $this$resolveColor_u2dg2O1Hgs, int resId, int attrId, long defaultColor) {
        TypedArray typedArray = $this$resolveColor_u2dg2O1Hgs.obtainStyledAttributes(resId, new int[]{attrId});
        int defaultColorAndroid = ColorKt.m4420toArgb8_81llA(defaultColor);
        int colorInt = typedArray.getColor(0, defaultColorAndroid);
        typedArray.recycle();
        if (colorInt != defaultColorAndroid) goto L6;
        return defaultColor;
    L6:
        return ColorKt.Color(colorInt);
    }

    private static final ColorStateList resolveColorStateList(Context $this$resolveColorStateList, int resId, int attrId) {
        TypedArray typedArray = $this$resolveColorStateList.obtainStyledAttributes(resId, new int[]{attrId});
        ColorStateList colorStateList = typedArray.getColorStateList(0);
        typedArray.recycle();
        return colorStateList;
    }

    /* JADX INFO: renamed from: enabledColor-4WTKRHQ, reason: not valid java name */
    private static final long m361enabledColor4WTKRHQ(ColorStateList $this$enabledColor_u2d4WTKRHQ, long defaultColor) {
        int defaultColorArgb = ColorKt.m4420toArgb8_81llA(defaultColor);
        if ($this$enabledColor_u2d4WTKRHQ == null) goto L5;
        Integer color = Integer.valueOf($this$enabledColor_u2d4WTKRHQ.getColorForState(new int[]{R.attr.state_enabled}, defaultColorArgb));
    L6:
        if (color == null) goto L12;
        if (color.intValue() == defaultColorArgb) goto L12;
        return ColorKt.Color(color.intValue());
    L12:
        return defaultColor;
    L5:
        color = null;
        goto L6
    }

    /* JADX INFO: renamed from: disabledColor-4WTKRHQ, reason: not valid java name */
    private static final long m360disabledColor4WTKRHQ(ColorStateList $this$disabledColor_u2d4WTKRHQ, long defaultColor) {
        int defaultColorArgb = ColorKt.m4420toArgb8_81llA(defaultColor);
        if ($this$disabledColor_u2d4WTKRHQ == null) goto L5;
        Integer color = Integer.valueOf($this$disabledColor_u2d4WTKRHQ.getColorForState(new int[]{-16842910}, defaultColorArgb));
    L6:
        if (color == null) goto L12;
        if (color.intValue() == defaultColorArgb) goto L12;
        return ColorKt.Color(color.intValue());
    L12:
        return defaultColor;
    L5:
        color = null;
        goto L6
    }
}
