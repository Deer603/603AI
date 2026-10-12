package androidx.compose.ui.window;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntRect;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: AndroidPopup.android.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000l\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001aU\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\u0010\b\u0002\u0010\r\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\u0011\u0010\u0011\u001a\r\u0012\u0004\u0012\u00020\b0\u000e¢\u0006\u0002\b\u0012H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0014\u001aD\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020\u00162\u0010\b\u0002\u0010\r\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\u0011\u0010\u0011\u001a\r\u0012\u0004\u0012\u00020\b0\u000e¢\u0006\u0002\b\u0012H\u0007¢\u0006\u0002\u0010\u0017\u001a(\u0010\u0018\u001a\u00020\b2\u0006\u0010\u0019\u001a\u00020\u00022\u0011\u0010\u0011\u001a\r\u0012\u0004\u0012\u00020\b0\u000e¢\u0006\u0002\b\u0012H\u0001¢\u0006\u0002\u0010\u001a\u001a+\u0010\u001b\u001a\u00020\b2\u0006\u0010\u001c\u001a\u00020\u001d2\u0013\b\b\u0010\u0011\u001a\r\u0012\u0004\u0012\u00020\b0\u000e¢\u0006\u0002\b\u0012H\u0083\b¢\u0006\u0002\u0010\u001e\u001a \u0010\u001f\u001a\u00020\u00062\u0006\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020!H\u0002\u001a\u001c\u0010%\u001a\u00020!2\u0006\u0010&\u001a\u00020'2\n\b\u0002\u0010(\u001a\u0004\u0018\u00010\u0002H\u0007\u001a\u0014\u0010)\u001a\u00020\u0006*\u00020\u00102\u0006\u0010*\u001a\u00020!H\u0002\u001a\f\u0010+\u001a\u00020!*\u00020'H\u0000\u001a\f\u0010,\u001a\u00020-*\u00020.H\u0002\"\u001a\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0003\u0010\u0004\"\u000e\u0010\u0005\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006/²\u0006\u0015\u00100\u001a\r\u0012\u0004\u0012\u00020\b0\u000e¢\u0006\u0002\b\u0012X\u008a\u0084\u0002"}, d2 = {"LocalPopupTestTag", "Landroidx/compose/runtime/ProvidableCompositionLocal;", "", "getLocalPopupTestTag", "()Landroidx/compose/runtime/ProvidableCompositionLocal;", "PopupPropertiesBaseFlags", "", "Popup", "", "alignment", "Landroidx/compose/ui/Alignment;", "offset", "Landroidx/compose/ui/unit/IntOffset;", "onDismissRequest", "Lkotlin/Function0;", "properties", "Landroidx/compose/ui/window/PopupProperties;", "content", "Landroidx/compose/runtime/Composable;", "Popup-K5zGePQ", "(Landroidx/compose/ui/Alignment;JLkotlin/jvm/functions/Function0;Landroidx/compose/ui/window/PopupProperties;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "popupPositionProvider", "Landroidx/compose/ui/window/PopupPositionProvider;", "(Landroidx/compose/ui/window/PopupPositionProvider;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/window/PopupProperties;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "PopupTestTag", "tag", "(Ljava/lang/String;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "SimpleStack", "modifier", "Landroidx/compose/ui/Modifier;", "(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "createFlags", "focusable", "", "securePolicy", "Landroidx/compose/ui/window/SecureFlagPolicy;", "clippingEnabled", "isPopupLayout", "view", "Landroid/view/View;", "testTag", "flagsWithSecureFlagInherited", "isParentFlagSecureEnabled", "isFlagSecureEnabled", "toIntBounds", "Landroidx/compose/ui/unit/IntRect;", "Landroid/graphics/Rect;", "ui_release", "currentContent"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class AndroidPopup_androidKt {
    private static final ProvidableCompositionLocal<String> LocalPopupTestTag = null;
    private static final int PopupPropertiesBaseFlags = 262144;

    /* JADX INFO: renamed from: androidx.compose.ui.window.AndroidPopup_androidKt$SimpleStack$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: AndroidPopup.android.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0006\u001a\u00020\u0007H\n¢\u0006\u0004\b\b\u0010\t"}, d2 = {"<anonymous>", "Landroidx/compose/ui/layout/MeasureResult;", "Landroidx/compose/ui/layout/MeasureScope;", "measurables", "", "Landroidx/compose/ui/layout/Measurable;", "constraints", "Landroidx/compose/ui/unit/Constraints;", "measure-3p2s80s", "(Landroidx/compose/ui/layout/MeasureScope;Ljava/util/List;J)Landroidx/compose/ui/layout/MeasureResult;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class C06791 implements MeasurePolicy {
        public static final C06791 INSTANCE = null;

        static {
            INSTANCE = new C06791();
        }

        public C06791() {
        }

        @Override // androidx.compose.ui.layout.MeasurePolicy
        /* JADX INFO: renamed from: measure-3p2s80s */
        public final MeasureResult mo32measure3p2s80s(MeasureScope $this$Layout, List<? extends Measurable> r22, long constraints) {
            long r0 = constraints;
            switch(r22.size()) {
                case 0: goto L13;
                case 1: goto L5;
                default: goto L4;
            };
        L4:
            int width = 0;
            int height = 0;
            List<? extends Measurable> r5 = r22;
            List target$iv = new ArrayList(r5.size());
            int index$iv$iv = 0;
            int r11 = r5.size();
        L7:
            if (index$iv$iv >= r11) goto L9;
            Object item$iv$iv = r5.get(index$iv$iv);
            Measurable it = (Measurable) item$iv$iv;
            List<? extends Measurable> r17 = r5;
            Placeable $this$measure_3p2s80s_u24lambda_u241_u24lambda_u240 = it.mo5714measureBRTryo0(r0);
            width = Math.max(width, $this$measure_3p2s80s_u24lambda_u241_u24lambda_u240.getWidth());
            height = Math.max(height, $this$measure_3p2s80s_u24lambda_u241_u24lambda_u240.getHeight());
            target$iv.add($this$measure_3p2s80s_u24lambda_u241_u24lambda_u240);
            index$iv$iv = index$iv$iv + 1;
            r0 = constraints;
            r5 = r17;
            goto L7
        L9:
            final List placeables = target$iv;
            int width2 = width;
            int height2 = height;
            return MeasureScope.layout$default($this$Layout, width2, height2, null, new AnonymousClass3(placeables), 4, null);
        L5:
            final Placeable p = r22.get(0).mo5714measureBRTryo0(r0);
            return MeasureScope.layout$default($this$Layout, p.getWidth(), p.getHeight(), null, new AnonymousClass2(p), 4, null);
        L13:
            return MeasureScope.layout$default($this$Layout, 0, 0, null, C01461.INSTANCE, 4, null);
        }
    }

    public static final /* synthetic */ Function2 access$Popup$lambda$1(State $currentContent$delegate) {
        return Popup$lambda$1($currentContent$delegate);
    }

    public static final /* synthetic */ int access$createFlags(boolean focusable, SecureFlagPolicy securePolicy, boolean clippingEnabled) {
        return createFlags(focusable, securePolicy, clippingEnabled);
    }

    public static final /* synthetic */ int access$flagsWithSecureFlagInherited(PopupProperties $receiver, boolean isParentFlagSecureEnabled) {
        return flagsWithSecureFlagInherited($receiver, isParentFlagSecureEnabled);
    }

    public static final /* synthetic */ IntRect access$toIntBounds(Rect $receiver) {
        return toIntBounds($receiver);
    }

    /* JADX INFO: renamed from: Popup-K5zGePQ, reason: not valid java name */
    public static final void m7225PopupK5zGePQ(Alignment alignment, long offset, Function0<Unit> r32, PopupProperties properties, final Function2<? super Composer, ? super Integer, Unit> r34, Composer $composer, final int $changed, final int r37) {
        Composer $composer2 = $composer.startRestartGroup(295309329);
        ComposerKt.sourceInformation($composer2, "C(Popup)P(!1,2:c#ui.unit.IntOffset,3,4)270@12402L82,272@12490L165:AndroidPopup.android.kt#2oxthz");
        int $dirty = $changed;
        int r2 = r37 & 1;
        if (r2 == 0) goto L6;
        $dirty = $dirty | 6;
        Alignment r4 = alignment;
    L13:
        int r5 = r37 & 2;
        if (r5 == 0) goto L17;
        $dirty = $dirty | 48;
        long r8 = offset;
    L24:
        int r10 = r37 & 4;
        if (r10 == 0) goto L28;
        $dirty = $dirty | 384;
        Function0<Unit> r11 = r32;
    L35:
        int r13 = r37 & 8;
        if (r13 == 0) goto L39;
        $dirty = $dirty | 3072;
        PopupProperties r14 = properties;
    L47:
        if ((r37 & 16) == 0) goto L50;
        $dirty = $dirty | 24576;
        Function2<? super Composer, ? super Integer, Unit> r15 = r34;
    L57:
        boolean r17 = false;
        if (($dirty & 9363) == 9362) goto L60;
        boolean r3 = true;
    L62:
        if ($composer2.shouldExecute(r3, $dirty & 1) == false) goto L97;
        if (r2 == 0) goto L65;
        Alignment alignment2 = Alignment.Companion.getTopStart();
    L66:
        if (r5 == 0) goto L68;
        long offset2 = IntOffset.m7095constructorimpl((((long) 0) << 32) | (((long) 0) & 4294967295L));
    L69:
        if (r10 == 0) goto L71;
        Function0<Unit> r9 = null;
    L72:
        if (r13 == 0) goto L74;
        PopupProperties properties2 = new PopupProperties(false, false, false, false, 15, null);
    L76:
        if (ComposerKt.isTraceInProgress() == false) goto L78;
        int $dirty2 = $dirty;
        ComposerKt.traceEventStart(295309329, $dirty2, -1, "androidx.compose.ui.window.Popup (AndroidPopup.android.kt:268)");
    L79:
        ComposerKt.sourceInformationMarkerStart($composer2, -1370832999, "CC(remember):AndroidPopup.android.kt#9igjgp");
        if (($dirty2 & 14) != 4) goto L82;
        boolean r6 = true;
    L84:
        if (($dirty2 & 112) != 32) goto L86;
        r17 = true;
    L86:
        boolean invalid$iv = r6 | r17;
        Object it$iv = $composer2.rememberedValue();
        if (invalid$iv == false) goto L89;
    L92:
        Object value$iv = new AlignmentOffsetPositionProvider(alignment2, offset2, null);
        $composer2.updateRememberedValue(value$iv);
        it$iv = value$iv;
    L93:
        AlignmentOffsetPositionProvider popupPositioner = (AlignmentOffsetPositionProvider) it$iv;
        ComposerKt.sourceInformationMarkerEnd($composer2);
        Popup(popupPositioner, r9, properties2, r15, $composer2, ((($dirty2 >> 3) & 112) | (($dirty2 >> 3) & 896)) | (($dirty2 >> 3) & 7168), 0);
        if (ComposerKt.isTraceInProgress() == false) goto L96;
        ComposerKt.traceEventEnd();
    L96:
        final Alignment alignment3 = alignment2;
        final long offset3 = offset2;
        final Function0<Unit> r7 = r9;
        final PopupProperties properties3 = properties2;
    L98:
        ScopeUpdateScope r12 = $composer2.endRestartGroup();
        if (r12 == null) goto L102;
        r12.updateScope(new AnonymousClass1(alignment3, offset3, r7, properties3, r34, $changed, r37));
        return;
    L102:
        return;
    L89:
        if (it$iv != Composer.Companion.getEmpty()) goto L93;
    L82:
        r6 = false;
        goto L84
    L78:
        $dirty2 = $dirty;
        goto L79
    L74:
        properties2 = r14;
        goto L76
    L71:
        r9 = r11;
        goto L72
    L68:
        offset2 = r8;
        goto L69
    L65:
        alignment2 = r4;
        goto L66
    L97:
        $composer2.skipToGroupEnd();
        alignment3 = r4;
        offset3 = r8;
        r7 = r11;
        properties3 = r14;
        goto L98
    L60:
        r3 = false;
        goto L62
    L50:
        if (($changed & 24576) != 0) goto L56;
        r15 = r34;
        if ($composer2.changedInstance(r15) == false) goto L54;
        int r16 = 16384;
    L55:
        $dirty = $dirty | r16;
        goto L57
    L54:
        r16 = 8192;
        goto L55
    L56:
        r15 = r34;
        goto L57
    L39:
        if (($changed & 3072) != 0) goto L45;
        r14 = properties;
        if ($composer2.changed(r14) == false) goto L43;
        int r18 = 2048;
    L44:
        $dirty = $dirty | r18;
        goto L47
    L43:
        r18 = 1024;
        goto L44
    L45:
        r14 = properties;
        goto L47
    L28:
        if (($changed & 384) != 0) goto L34;
        r11 = r32;
        if ($composer2.changedInstance(r11) == false) goto L32;
        int r19 = 256;
    L33:
        $dirty = $dirty | r19;
        goto L35
    L32:
        r19 = 128;
        goto L33
    L34:
        r11 = r32;
        goto L35
    L17:
        if (($changed & 48) != 0) goto L23;
        r8 = offset;
        if ($composer2.changed(r8) == false) goto L21;
        int r110 = 32;
    L22:
        $dirty = $dirty | r110;
        goto L24
    L21:
        r110 = 16;
        goto L22
    L23:
        r8 = offset;
        goto L24
    L6:
        if (($changed & 6) != 0) goto L12;
        r4 = alignment;
        if ($composer2.changed(r4) == false) goto L10;
        int r20 = 4;
    L11:
        $dirty = $dirty | r20;
        goto L13
    L10:
        r20 = 2;
        goto L11
    L12:
        r4 = alignment;
        goto L13
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r17v3 java.lang.Object
        	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:236)
        	at jadx.core.dex.visitors.ModVisitor.anonymousCallArgMod(ModVisitor.java:535)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.ModVisitor.processAnonymousConstructor(ModVisitor.java:528)
        	at jadx.core.dex.visitors.ModVisitor.replaceStep(ModVisitor.java:111)
        	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
        */
    public static final void Popup(androidx.compose.ui.window.PopupPositionProvider r32, kotlin.jvm.functions.Function0<kotlin.Unit> r33, androidx.compose.ui.window.PopupProperties r34, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r35, androidx.compose.runtime.Composer r36, int r37, int r38) {
        final androidx.compose.ui.window.PopupPositionProvider r1 = r32;
        androidx.compose.runtime.Composer r6 = r36.startRestartGroup(-830247068);
        androidx.compose.runtime.ComposerKt.sourceInformation(r6, "C(Popup)P(2,1,3)298@13356L7,299@13395L7,300@13439L7,301@13494L7,302@13530L28,303@13585L29,304@13633L38,305@13694L999,332@14729L387,332@14699L417,347@15133L218,347@15122L229,356@15397L126,356@15357L166,368@16114L147,368@16086L175,381@16530L573,389@17110L99,378@16439L770:AndroidPopup.android.kt#2oxthz");
        int r2 = r37;
        int r3 = r38 & 1;
        if (r3 == 0) goto L5;
        r2 = r2 | 6;
    L12:
        int r3 = r38 & 2;
        if (r3 == 0) goto L15;
        r2 = r2 | 48;
        kotlin.jvm.functions.Function0<kotlin.Unit> r4 = r33;
    L23:
        int r5 = r38 & 4;
        if (r5 == 0) goto L26;
        r2 = r2 | 384;
        androidx.compose.ui.window.PopupProperties r7 = r34;
    L34:
        int r8 = r38 & 8;
        if (r8 == 0) goto L37;
        r2 = r2 | 3072;
    L44:
        int r9 = r2;
        int r2 = r9 & 1171;
        if (r2 == 1170) goto L47;
        boolean r2 = true;
    L48:
        int r8 = r9 & 1;
        boolean r2 = r6.shouldExecute(r2, r8);
        if (r2 == false) goto L149;
        if (r3 == 0) goto L52;
        kotlin.jvm.functions.Function0<kotlin.Unit> r18 = null;
    L53:
        if (r5 == 0) goto L55;
        int r24 = 15;
        kotlin.jvm.internal.DefaultConstructorMarker r25 = null;
        boolean r20 = false;
        boolean r21 = false;
        boolean r22 = false;
        boolean r23 = false;
        androidx.compose.ui.window.PopupProperties r19 = new androidx.compose.ui.window.PopupProperties(r20, r21, r22, r23, r24, r25);
    L56:
        boolean r2 = androidx.compose.runtime.ComposerKt.isTraceInProgress();
        if (r2 == false) goto L59;
        androidx.compose.runtime.ComposerKt.traceEventStart(-830247068, r9, -1, "androidx.compose.ui.window.Popup (AndroidPopup.android.kt:297)");
    L59:
        androidx.compose.runtime.ProvidableCompositionLocal<android.view.View> r0 = androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.getLocalView();
        androidx.compose.runtime.ProvidableCompositionLocal<android.view.View> r0 = r0;
        androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(r6, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
        java.lang.Object r7 = r6.consume(r0);
        androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(r6);
        android.view.View r0 = (android.view.View) r7;
        androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.ui.unit.Density> r2 = androidx.compose.ui.platform.CompositionLocalsKt.getLocalDensity();
        androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.ui.unit.Density> r2 = r2;
        androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(r6, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
        java.lang.Object r8 = r6.consume(r2);
        androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(r6);
        androidx.compose.ui.unit.Density r16 = (androidx.compose.ui.unit.Density) r8;
        androidx.compose.runtime.ProvidableCompositionLocal<java.lang.String> r2 = androidx.compose.ui.window.AndroidPopup_androidKt.LocalPopupTestTag;
        androidx.compose.runtime.ProvidableCompositionLocal<java.lang.String> r2 = r2;
        androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(r6, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
        java.lang.Object r8 = r6.consume(r2);
        androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(r6);
        java.lang.String r20 = (java.lang.String) r8;
        androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.ui.unit.LayoutDirection> r2 = androidx.compose.ui.platform.CompositionLocalsKt.getLocalLayoutDirection();
        androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.ui.unit.LayoutDirection> r2 = r2;
        androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(r6, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
        java.lang.Object r4 = r6.consume(r2);
        androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(r6);
        androidx.compose.ui.unit.LayoutDirection r21 = (androidx.compose.ui.unit.LayoutDirection) r4;
        androidx.compose.runtime.CompositionContext r2 = androidx.compose.runtime.ComposablesKt.rememberCompositionContext(r6, 0);
        int r3 = r9 >> 9;
        int r3 = r3 & 14;
        final androidx.compose.runtime.State r3 = androidx.compose.runtime.SnapshotStateKt.rememberUpdatedState(r35, r6, r3);
        java.lang.Object[] r2 = new java.lang.Object[0];
        androidx.compose.ui.window.AndroidPopup_androidKt$Popup$popupId$1 r5 = androidx.compose.ui.window.AndroidPopup_androidKt$Popup$popupId$1.INSTANCE;
        androidx.compose.ui.window.AndroidPopup_androidKt$Popup$popupId$1 r5 = r5;
        java.lang.Object r2 = androidx.compose.runtime.saveable.RememberSaveableKt.m3923rememberSaveable(r2, null, null, r5, r6, 3072, 6);
        java.util.UUID r7 = (java.util.UUID) r2;
        androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(r6, -1370790738, "CC(remember):AndroidPopup.android.kt#9igjgp");
        java.lang.Object r2 = r6.rememberedValue();
        androidx.compose.runtime.Composer.Companion r6 = androidx.compose.runtime.Composer.Companion;
        java.lang.Object r6 = r6.getEmpty();
        if (r2 != r6) goto L62;
        android.view.View r4 = r0;
        int r9 = 128;
        kotlin.jvm.internal.DefaultConstructorMarker r10 = null;
        androidx.compose.ui.window.PopupLayoutHelper r8 = null;
        java.lang.String r31 = "CC(remember):AndroidPopup.android.kt#9igjgp";
        java.lang.String r3 = r20;
        int r29 = r9;
        kotlin.jvm.functions.Function0<kotlin.Unit> r1 = r18;
        androidx.compose.ui.window.PopupProperties r2 = r19;
        androidx.compose.ui.window.PopupLayout r0 = new androidx.compose.ui.window.PopupLayout(r1, r2, r3, r4, r16, r1, r7, r8, r9, r10);
        r1 = r1;
        final androidx.compose.ui.window.PopupLayout r2 = r0;
        kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> r8 = new androidx.compose.ui.window.AndroidPopup_androidKt$Popup$popupLayout$1$1$1(r2, r3);
        androidx.compose.runtime.internal.ComposableLambda r8 = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(1302892335, true, r8);
        androidx.compose.runtime.internal.ComposableLambda r8 = r8;
        r2.setContent(r2, r8);
        r6.updateRememberedValue(r2);
        java.lang.Object r2 = r2;
    L63:
        java.lang.Object r0 = r2;
        final androidx.compose.ui.window.PopupLayout r0 = (androidx.compose.ui.window.PopupLayout) r0;
        androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(r3);
        androidx.compose.runtime.Composer r8 = r6;
        java.lang.String r6 = r31;
        androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(r8, -1370758230, r6);
        boolean r2 = r8.changedInstance(r0);
        int r9 = r29;
        int r10 = r9 & 112;
        if (r10 != 32) goto L66;
        boolean r10 = true;
    L67:
        boolean r2 = r2 | r10;
        int r10 = r9 & 896;
        if (r10 != 256) goto L70;
        boolean r10 = true;
    L71:
        boolean r2 = r2 | r10;
        boolean r10 = r8.changed(r3);
        boolean r2 = r2 | r10;
        boolean r13 = r8.changed(r21);
        boolean r2 = r2 | r13;
        java.lang.Object r0 = r8.rememberedValue();
        if (r2 == true) goto L78;
        androidx.compose.runtime.Composer.Companion r16 = androidx.compose.runtime.Composer.Companion;
        java.lang.Object r2 = r16.getEmpty();
        if (r0 == r2) goto L78;
        java.lang.Object r2 = r0;
    L79:
        kotlin.jvm.functions.Function1 r2 = (kotlin.jvm.functions.Function1) r2;
        androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(r8);
        androidx.compose.runtime.EffectsKt.DisposableEffect(r17, r2, r8, 0);
        androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(r8, -1370745471, r6);
        boolean r2 = r8.changedInstance(r17);
        int r13 = r9 & 112;
        if (r13 != 32) goto L82;
        boolean r0 = true;
    L83:
        boolean r0 = r0 | r2;
        int r2 = r9 & 896;
        if (r2 != 256) goto L86;
        boolean r2 = true;
    L87:
        boolean r0 = r0 | r2;
        boolean r2 = r8.changed(r3);
        boolean r0 = r0 | r2;
        boolean r2 = r8.changed(r21);
        boolean r0 = r0 | r2;
        java.lang.Object r0 = r8.rememberedValue();
        if (r0 == true) goto L94;
        androidx.compose.runtime.Composer.Companion r16 = androidx.compose.runtime.Composer.Companion;
        java.lang.Object r3 = r16.getEmpty();
        if (r0 == r3) goto L94;
        java.lang.Object r3 = r0;
    L95:
        kotlin.jvm.functions.Function0 r3 = (kotlin.jvm.functions.Function0) r3;
        androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(r8);
        androidx.compose.runtime.EffectsKt.SideEffect(r3, r8, 0);
        androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(r8, -1370737115, r6);
        boolean r2 = r8.changedInstance(r17);
        int r3 = r9 & 14;
        if (r3 != 4) goto L98;
        boolean r24 = true;
    L99:
        boolean r2 = r2 | r24;
        java.lang.Object r2 = r8.rememberedValue();
        if (r2 == true) goto L105;
        androidx.compose.runtime.Composer.Companion r17 = androidx.compose.runtime.Composer.Companion;
        android.view.View r34 = r4;
        java.lang.Object r4 = r17.getEmpty();
        if (r2 != r4) goto L107;
    L106:
        java.lang.Object r2 = new androidx.compose.ui.window.AndroidPopup_androidKt$Popup$4$1(r0, r1);
        r2 = (kotlin.jvm.functions.Function1) r2;
        r8.updateRememberedValue(r2);
    L107:
        kotlin.jvm.functions.Function1 r2 = (kotlin.jvm.functions.Function1) r2;
        androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(r8);
        int r3 = r9 & 14;
        androidx.compose.runtime.EffectsKt.DisposableEffect(r1, r2, r8, r3);
        androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(r8, -1370714150, r6);
        boolean r2 = r8.changedInstance(r17);
        java.lang.Object r13 = r8.rememberedValue();
        if (r2 == true) goto L113;
        androidx.compose.runtime.Composer.Companion r17 = androidx.compose.runtime.Composer.Companion;
        java.lang.Object r1 = r17.getEmpty();
        if (r13 == r1) goto L113;
    L114:
        kotlin.jvm.functions.Function2 r13 = (kotlin.jvm.functions.Function2) r13;
        androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(r8);
        androidx.compose.runtime.EffectsKt.LaunchedEffect(r17, r13, r8, 0);
        androidx.compose.ui.Modifier.Companion r1 = androidx.compose.ui.Modifier.Companion;
        androidx.compose.ui.Modifier.Companion r1 = r1;
        androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(r8, -1370700412, r6);
        boolean r2 = r8.changedInstance(r17);
        java.lang.Object r13 = r8.rememberedValue();
        if (r2 == true) goto L121;
        androidx.compose.runtime.Composer.Companion r17 = androidx.compose.runtime.Composer.Companion;
        java.lang.Object r2 = r17.getEmpty();
        if (r13 == r2) goto L121;
    L122:
        kotlin.jvm.functions.Function1 r13 = (kotlin.jvm.functions.Function1) r13;
        androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(r8);
        androidx.compose.ui.Modifier r1 = androidx.compose.ui.layout.OnGloballyPositionedModifierKt.onGloballyPositioned(r1, r13);
        androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(r8, -1370682326, r6);
        boolean r2 = r8.changedInstance(r17);
        boolean r3 = r8.changed(r21);
        boolean r2 = r2 | r3;
        java.lang.Object r6 = r8.rememberedValue();
        if (r2 == true) goto L128;
        androidx.compose.runtime.Composer.Companion r16 = androidx.compose.runtime.Composer.Companion;
        androidx.compose.ui.Modifier r33 = r1;
        java.lang.Object r1 = r16.getEmpty();
        if (r6 != r1) goto L130;
    L129:
        androidx.compose.ui.layout.MeasurePolicy r1 = new androidx.compose.ui.window.AndroidPopup_androidKt$Popup$8$1(r17, r21);
        androidx.compose.ui.layout.MeasurePolicy r1 = (androidx.compose.ui.layout.MeasurePolicy) r1;
        r8.updateRememberedValue(r1);
        r6 = r1;
    L130:
        androidx.compose.ui.layout.MeasurePolicy r6 = (androidx.compose.ui.layout.MeasurePolicy) r6;
        androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(r8);
        androidx.compose.ui.Modifier r1 = r33;
        androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(r8, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
        int r4 = androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHash(r8, 0);
        androidx.compose.runtime.CompositionLocalMap r13 = r8.getCurrentCompositionLocalMap();
        androidx.compose.ui.Modifier r0 = androidx.compose.ui.ComposedModifierKt.materializeModifier(r8, r1);
        androidx.compose.ui.node.ComposeUiNode.Companion r16 = androidx.compose.ui.node.ComposeUiNode.Companion;
        kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> r16 = r16.getConstructor();
        int r1 = 0 << 6;
        int r1 = r1 & 896;
        int r1 = r1 | 6;
        androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(r8, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
        androidx.compose.runtime.Applier<?> r1 = r8.getApplier();
        boolean r1 = r1 instanceof androidx.compose.runtime.Applier;
        if (r1 == true) goto L133;
        androidx.compose.runtime.ComposablesKt.invalidApplier();
    L133:
        r8.startReusableNode();
        boolean r1 = r8.getInserting();
        if (r1 == false) goto L136;
        kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> r1 = r16;
        r8.createNode(r1);
    L137:
        androidx.compose.runtime.Composer r2 = androidx.compose.runtime.Updater.m3808constructorimpl(r8);
        androidx.compose.ui.node.ComposeUiNode.Companion r24 = androidx.compose.ui.node.ComposeUiNode.Companion;
        kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> r25 = r1;
        kotlin.jvm.functions.Function2<androidx.compose.ui.node.ComposeUiNode, androidx.compose.ui.layout.MeasurePolicy, kotlin.Unit> r1 = r24.getSetMeasurePolicy();
        androidx.compose.runtime.Updater.m3815setimpl(r2, r6, r1);
        androidx.compose.ui.node.ComposeUiNode.Companion r1 = androidx.compose.ui.node.ComposeUiNode.Companion;
        kotlin.jvm.functions.Function2<androidx.compose.ui.node.ComposeUiNode, androidx.compose.runtime.CompositionLocalMap, kotlin.Unit> r1 = r1.getSetResolvedCompositionLocals();
        androidx.compose.runtime.Updater.m3815setimpl(r2, r13, r1);
        androidx.compose.ui.node.ComposeUiNode.Companion r1 = androidx.compose.ui.node.ComposeUiNode.Companion;
        kotlin.jvm.functions.Function2<androidx.compose.ui.node.ComposeUiNode, java.lang.Integer, kotlin.Unit> r1 = r1.getSetCompositeKeyHash();
        boolean r27 = r2.getInserting();
        if (r27 == true) goto L143;
        java.lang.Object r3 = r2.rememberedValue();
        int r28 = r4;
        java.lang.Integer r4 = java.lang.Integer.valueOf(r28);
        boolean r3 = kotlin.jvm.internal.Intrinsics.areEqual(r3, r4);
        if (r3 == true) goto L145;
    L144:
        java.lang.Integer r3 = java.lang.Integer.valueOf(r28);
        r2.updateRememberedValue(r3);
        java.lang.Integer r3 = java.lang.Integer.valueOf(r28);
        r2.apply(r3, r1);
    L145:
        androidx.compose.ui.node.ComposeUiNode.Companion r1 = androidx.compose.ui.node.ComposeUiNode.Companion;
        kotlin.jvm.functions.Function2<androidx.compose.ui.node.ComposeUiNode, androidx.compose.ui.Modifier, kotlin.Unit> r1 = r1.getSetModifier();
        androidx.compose.runtime.Updater.m3815setimpl(r2, r0, r1);
        int r1 = r1 >> 6;
        int r1 = r1 & 14;
        androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(r8, 2112597501, "C:AndroidPopup.android.kt#2oxthz");
        androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(r8);
        r8.endNode();
        androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(r8);
        androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(r8);
        boolean r0 = androidx.compose.runtime.ComposerKt.isTraceInProgress();
        if (r0 == false) goto L148;
        androidx.compose.runtime.ComposerKt.traceEventEnd();
    L148:
        kotlin.jvm.functions.Function0<kotlin.Unit> r2 = r18;
        androidx.compose.ui.window.PopupProperties r3 = r19;
        androidx.compose.runtime.Composer r8 = r8;
    L150:
        androidx.compose.runtime.ScopeUpdateScope r7 = r8.endRestartGroup();
        if (r7 == null) goto L154;
        kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> r0 = new androidx.compose.ui.window.AndroidPopup_androidKt.AnonymousClass9(r32, r2, r3, r35, r37, r38);
        kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> r0 = (kotlin.jvm.functions.Function2) r0;
        r7.updateScope(r0);
        return;
    L154:
        return;
    L143:
        r28 = r4;
        goto L144
    L136:
        r1 = r16;
        r8.useNode();
        goto L137
    L128:
        r33 = r1;
    L121:
        kotlin.jvm.functions.Function1<androidx.compose.ui.layout.LayoutCoordinates, kotlin.Unit> r2 = new androidx.compose.ui.window.AndroidPopup_androidKt$Popup$7$1(r17);
        kotlin.jvm.functions.Function1<androidx.compose.ui.layout.LayoutCoordinates, kotlin.Unit> r2 = (kotlin.jvm.functions.Function1) r2;
        r8.updateRememberedValue(r2);
        r13 = r2;
    L113:
        androidx.compose.ui.window.AndroidPopup_androidKt$Popup$5$1 r1 = new androidx.compose.ui.window.AndroidPopup_androidKt$Popup$5$1(r17, null);
        androidx.compose.ui.window.AndroidPopup_androidKt$Popup$5$1 r1 = (kotlin.jvm.functions.Function2) r1;
        r8.updateRememberedValue(r1);
        r13 = r1;
        goto L114
    L105:
        android.view.View r34 = r4;
        goto L106
    L98:
        r24 = false;
    L94:
        kotlin.jvm.functions.Function0<kotlin.Unit> r16 = new androidx.compose.ui.window.AndroidPopup_androidKt$Popup$3$1(r0, r18, r19, r3, r21);
        kotlin.jvm.functions.Function0<kotlin.Unit> r16 = (kotlin.jvm.functions.Function0) r16;
        r3 = r16;
        r8.updateRememberedValue(r3);
        goto L95
    L86:
        r2 = false;
        goto L87
    L82:
        r0 = false;
    L78:
        java.lang.String r20 = r3;
        kotlin.jvm.functions.Function1<androidx.compose.runtime.DisposableEffectScope, androidx.compose.runtime.DisposableEffectResult> r16 = new androidx.compose.ui.window.AndroidPopup_androidKt$Popup$2$1(r0, r18, r19, r20, r21);
        kotlin.jvm.functions.Function1<androidx.compose.runtime.DisposableEffectScope, androidx.compose.runtime.DisposableEffectResult> r16 = (kotlin.jvm.functions.Function1) r16;
        r2 = r16;
        r8.updateRememberedValue(r2);
        goto L79
    L70:
        r10 = false;
        goto L71
    L66:
        r10 = false;
        goto L67
    L62:
        r31 = "CC(remember):AndroidPopup.android.kt#9igjgp";
        r29 = r9;
        r3 = r20;
        r4 = r0;
        r2 = r2;
        goto L63
    L55:
        r19 = r7;
        goto L56
    L52:
        r18 = r4;
        goto L53
    L149:
        androidx.compose.runtime.Composer r8 = r6;
        r8.skipToGroupEnd();
        r2 = r4;
        r3 = r7;
        r8 = r8;
        goto L150
    L47:
        r2 = false;
        goto L48
    L37:
        int r8 = r37 & 3072;
        if (r8 != 0) goto L44;
        boolean r8 = r6.changedInstance(r35);
        if (r8 == false) goto L42;
        int r8 = 2048;
    L43:
        r2 = r2 | r8;
        goto L44
    L42:
        r8 = 1024;
        goto L43
    L26:
        int r7 = r37 & 384;
        if (r7 != 0) goto L33;
        r7 = r34;
        boolean r8 = r6.changed(r7);
        if (r8 == false) goto L31;
        int r8 = 256;
    L32:
        r2 = r2 | r8;
        goto L34
    L31:
        r8 = 128;
        goto L32
    L33:
        r7 = r34;
        goto L34
    L15:
        int r4 = r37 & 48;
        if (r4 != 0) goto L22;
        r4 = r33;
        boolean r5 = r6.changedInstance(r4);
        if (r5 == false) goto L20;
        int r5 = 32;
    L21:
        r2 = r2 | r5;
        goto L23
    L20:
        r5 = 16;
        goto L21
    L22:
        r4 = r33;
        goto L23
    L5:
        int r3 = r37 & 6;
        if (r3 != 0) goto L12;
        boolean r3 = r6.changed(r1);
        if (r3 == false) goto L10;
        int r3 = 4;
    L11:
        r2 = r2 | r3;
        goto L12
    L10:
        r3 = 2;
        goto L11
    }

    private static final Function2<Composer, Integer, Unit> Popup$lambda$1(State<? extends Function2<? super Composer, ? super Integer, Unit>> r4) {
        Object thisObj$iv = r4.getValue();
        return (Function2) thisObj$iv;
    }

    private static final int createFlags(boolean focusable, SecureFlagPolicy securePolicy, boolean clippingEnabled) {
        int flags = 262144;
        if (focusable == true) goto L6;
        flags = 262144 | 8;
    L6:
        if (securePolicy != SecureFlagPolicy.SecureOn) goto L8;
        flags = flags | 8192;
    L8:
        if (clippingEnabled == false) goto L10;
        return flags;
    L10:
        return flags | 512;
    }

    static {
        LocalPopupTestTag = CompositionLocalKt.compositionLocalOf$default(null, AndroidPopup_androidKt$LocalPopupTestTag$1.INSTANCE, 1, null);
    }

    public static final ProvidableCompositionLocal<String> getLocalPopupTestTag() {
        return LocalPopupTestTag;
    }

    public static final void PopupTestTag(final String tag, final Function2<? super Composer, ? super Integer, Unit> r5, Composer $composer, final int $changed) {
        Composer $composer2 = $composer.startRestartGroup(-498879600);
        ComposerKt.sourceInformation($composer2, "C(PopupTestTag)P(1)423@18206L75:AndroidPopup.android.kt#2oxthz");
        int $dirty = $changed;
        if (($changed & 6) != 0) goto L10;
        if ($composer2.changed(tag) == false) goto L7;
        int r2 = 4;
    L8:
        $dirty = $dirty | r2;
        goto L10
    L7:
        r2 = 2;
    L10:
        if (($changed & 48) != 0) goto L17;
        if ($composer2.changedInstance(r5) == false) goto L14;
        int r3 = 32;
    L15:
        $dirty = $dirty | r3;
        goto L17
    L14:
        r3 = 16;
    L17:
        if (($dirty & 19) == 18) goto L19;
        boolean r4 = true;
    L21:
        if ($composer2.shouldExecute(r4, $dirty & 1) == true) goto L23;
        $composer2.skipToGroupEnd();
    L29:
        ScopeUpdateScope r0 = $composer2.endRestartGroup();
        if (r0 == null) goto L33;
        r0.updateScope(new C06781(tag, r5, $changed));
        return;
    L33:
        return;
    L23:
        if (ComposerKt.isTraceInProgress() == false) goto L25;
        ComposerKt.traceEventStart(-498879600, $dirty, -1, "androidx.compose.ui.window.PopupTestTag (AndroidPopup.android.kt:422)");
    L25:
        CompositionLocalKt.CompositionLocalProvider(LocalPopupTestTag.provides(tag), r5, $composer2, ProvidedValue.$stable | ($dirty & 112));
        if (ComposerKt.isTraceInProgress() == false) goto L29;
        ComposerKt.traceEventEnd();
        goto L29
    L19:
        r4 = false;
        goto L21
    }

    private static final void SimpleStack(Modifier modifier, Function2<? super Composer, ? super Integer, Unit> r21, Composer $composer, int $changed) {
        ComposerKt.sourceInformationMarkerStart($composer, 1406149896, "CC(SimpleStack)P(1)431@18544L946:AndroidPopup.android.kt#2oxthz");
        MeasurePolicy measurePolicy$iv = C06791.INSTANCE;
        int $changed$iv = ((($changed >> 3) & 14) | 384) | (($changed << 3) & 112);
        ComposerKt.sourceInformationMarkerStart($composer, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
        int compositeKeyHash$iv = ComposablesKt.getCurrentCompositeKeyHash($composer, 0);
        CompositionLocalMap localMap$iv = $composer.getCurrentCompositionLocalMap();
        Modifier materialized$iv = ComposedModifierKt.materializeModifier($composer, modifier);
        Function0<ComposeUiNode> r9 = ComposeUiNode.Companion.getConstructor();
        int $changed$iv$iv = (($changed$iv << 6) & 896) | 6;
        ComposerKt.sourceInformationMarkerStart($composer, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
        if (($composer.getApplier() instanceof Applier) == true) goto L5;
        ComposablesKt.invalidApplier();
    L5:
        $composer.startReusableNode();
        if ($composer.getInserting() == false) goto L8;
        $composer.createNode(r9);
    L9:
        Composer $this$Layout_u24lambda_u240$iv = Updater.m3808constructorimpl($composer);
        Updater.m3815setimpl($this$Layout_u24lambda_u240$iv, measurePolicy$iv, ComposeUiNode.Companion.getSetMeasurePolicy());
        Updater.m3815setimpl($this$Layout_u24lambda_u240$iv, localMap$iv, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> r14 = ComposeUiNode.Companion.getSetCompositeKeyHash();
        if ($this$Layout_u24lambda_u240$iv.getInserting() == true) goto L16;
        if (Intrinsics.areEqual($this$Layout_u24lambda_u240$iv.rememberedValue(), Integer.valueOf(compositeKeyHash$iv)) == false) goto L16;
    L17:
        Updater.m3815setimpl($this$Layout_u24lambda_u240$iv, materialized$iv, ComposeUiNode.Companion.getSetModifier());
        r21.invoke($composer, Integer.valueOf(($changed$iv$iv >> 6) & 14));
        $composer.endNode();
        ComposerKt.sourceInformationMarkerEnd($composer);
        ComposerKt.sourceInformationMarkerEnd($composer);
        ComposerKt.sourceInformationMarkerEnd($composer);
        return;
    L16:
        $this$Layout_u24lambda_u240$iv.updateRememberedValue(Integer.valueOf(compositeKeyHash$iv));
        $this$Layout_u24lambda_u240$iv.apply(Integer.valueOf(compositeKeyHash$iv), r14);
        goto L17
    L8:
        $composer.useNode();
        goto L9
    }

    public static final boolean isFlagSecureEnabled(View $this$isFlagSecureEnabled) {
        ViewGroup.LayoutParams r0 = $this$isFlagSecureEnabled.getRootView().getLayoutParams();
        if ((r0 instanceof WindowManager.LayoutParams) == false) goto L5;
        WindowManager.LayoutParams windowParams = (WindowManager.LayoutParams) r0;
    L7:
        if (windowParams != null) goto L9;
        return false;
    L9:
        if ((windowParams.flags & 8192) == 0) goto L13;
        return true;
    L13:
        return false;
    L5:
        windowParams = null;
        goto L7
    }

    private static final int flagsWithSecureFlagInherited(PopupProperties $this$flagsWithSecureFlagInherited, boolean isParentFlagSecureEnabled) {
        if ($this$flagsWithSecureFlagInherited.getInheritSecurePolicy$ui_release() == false) goto L7;
        if (isParentFlagSecureEnabled == false) goto L7;
        return $this$flagsWithSecureFlagInherited.getFlags$ui_release() | 8192;
    L7:
        if ($this$flagsWithSecureFlagInherited.getInheritSecurePolicy$ui_release() == false) goto L11;
        if (isParentFlagSecureEnabled == true) goto L11;
        return $this$flagsWithSecureFlagInherited.getFlags$ui_release() & (-8193);
    L11:
        return $this$flagsWithSecureFlagInherited.getFlags$ui_release();
    }

    private static final IntRect toIntBounds(Rect $this$toIntBounds) {
        return new IntRect($this$toIntBounds.left, $this$toIntBounds.top, $this$toIntBounds.right, $this$toIntBounds.bottom);
    }

    public static /* synthetic */ boolean isPopupLayout$default(View r0, String r1, int r2, Object r3) {
        if ((r2 & 2) == 0) goto L6;
        r1 = null;
    L6:
        return isPopupLayout(r0, r1);
    }

    public static final boolean isPopupLayout(View view, String testTag) {
        if ((view instanceof PopupLayout) == false) goto L8;
        if (testTag != null) goto L6;
    L7:
        return true;
    L6:
        if (Intrinsics.areEqual(testTag, ((PopupLayout) view).getTestTag()) == true) goto L7;
    L8:
        return false;
    }
}
