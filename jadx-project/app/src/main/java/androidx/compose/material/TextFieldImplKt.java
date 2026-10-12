package androidx.compose.material;

import androidx.compose.foundation.interaction.FocusInteractionKt;
import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.layout.IntrinsicMeasurable;
import androidx.compose.ui.layout.LayoutIdParentData;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.input.TransformedText;
import androidx.compose.ui.text.input.VisualTransformation;
import androidx.compose.ui.unit.Dp;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import androidx.profileinstaller.ProfileVerifier;
import androidx.savedstate.serialization.ClassDiscriminatorModeKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;

/* JADX INFO: compiled from: TextFieldImpl.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0090\u0001\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001aÙ\u0001\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\b2\u0011\u0010\u001b\u001a\r\u0012\u0004\u0012\u00020\u00170\u001c¢\u0006\u0002\b\u001d2\u0006\u0010\u001e\u001a\u00020\u001f2\u0013\u0010 \u001a\u000f\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u001c¢\u0006\u0002\b\u001d2\u0013\u0010!\u001a\u000f\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u001c¢\u0006\u0002\b\u001d2\u0013\u0010\"\u001a\u000f\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u001c¢\u0006\u0002\b\u001d2\u0013\u0010#\u001a\u000f\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u001c¢\u0006\u0002\b\u001d2\u0006\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020%2\u0006\u0010'\u001a\u00020%2\u0006\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020-2\u0006\u0010.\u001a\u00020/2\u0013\u00100\u001a\u000f\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u001c¢\u0006\u0002\b\u001dH\u0001¢\u0006\u0002\u00101\u001aT\u00102\u001a\u00020\u00172\u0006\u00103\u001a\u0002042\n\b\u0002\u00105\u001a\u0004\u0018\u0001062\n\b\u0002\u00107\u001a\u0004\u0018\u0001082 \u00109\u001a\u001c\u0012\u0004\u0012\u00020\u00170\u001c¢\u0006\u0002\b\u001d¢\u0006\f\b:\u0012\b\b;\u0012\u0004\b\u0003\u0010\u0000H\u0001ø\u0001\u0000¢\u0006\u0004\b<\u0010=\u001a\u0012\u0010>\u001a\u00020\u00012\b\u0010?\u001a\u0004\u0018\u00010@H\u0000\u001a\u0012\u0010A\u001a\u00020\u00012\b\u0010?\u001a\u0004\u0018\u00010@H\u0000\u001a\u001c\u0010B\u001a\u00020C*\u00020C2\u0006\u0010'\u001a\u00020%2\u0006\u0010D\u001a\u00020\bH\u0000\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u0016\u0010\u0002\u001a\u00020\u0003X\u0080\u0004¢\u0006\n\n\u0002\u0010\u0006\u001a\u0004\b\u0004\u0010\u0005\"\u000e\u0010\u0007\u001a\u00020\bX\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\t\u001a\u00020\bX\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\n\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u000b\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\f\u001a\u00020\bX\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\r\u001a\u00020\bX\u0080T¢\u0006\u0002\n\u0000\"\u0016\u0010\u000e\u001a\u00020\u0003X\u0080\u0004¢\u0006\n\n\u0002\u0010\u0006\u001a\u0004\b\u000f\u0010\u0005\"\u000e\u0010\u0010\u001a\u00020\bX\u0080T¢\u0006\u0002\n\u0000\"\u001a\u0010\u0011\u001a\u0004\u0018\u00010\u0012*\u00020\u00138@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006E"}, d2 = {"AnimationDuration", "", "HorizontalIconPadding", "Landroidx/compose/ui/unit/Dp;", "getHorizontalIconPadding", "()F", "F", "LabelId", "", "LeadingId", "PlaceholderAnimationDelayOrDuration", "PlaceholderAnimationDuration", "PlaceholderId", "TextFieldId", "TextFieldPadding", "getTextFieldPadding", "TrailingId", "layoutId", "", "Landroidx/compose/ui/layout/IntrinsicMeasurable;", "getLayoutId", "(Landroidx/compose/ui/layout/IntrinsicMeasurable;)Ljava/lang/Object;", "CommonDecorationBox", "", ClassDiscriminatorModeKt.CLASS_DISCRIMINATOR_KEY, "Landroidx/compose/material/TextFieldType;", "value", "innerTextField", "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "visualTransformation", "Landroidx/compose/ui/text/input/VisualTransformation;", "label", "placeholder", "leadingIcon", "trailingIcon", "singleLine", "", "enabled", "isError", "interactionSource", "Landroidx/compose/foundation/interaction/InteractionSource;", "contentPadding", "Landroidx/compose/foundation/layout/PaddingValues;", "shape", "Landroidx/compose/ui/graphics/Shape;", "colors", "Landroidx/compose/material/TextFieldColors;", OutlinedTextFieldKt.BorderId, "(Landroidx/compose/material/TextFieldType;Ljava/lang/String;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/text/input/VisualTransformation;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;ZZZLandroidx/compose/foundation/interaction/InteractionSource;Landroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/material/TextFieldColors;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "Decoration", "contentColor", "Landroidx/compose/ui/graphics/Color;", "typography", "Landroidx/compose/ui/text/TextStyle;", "contentAlpha", "", "content", "Landroidx/compose/runtime/ComposableOpenTarget;", "index", "Decoration-euL9pac", "(JLandroidx/compose/ui/text/TextStyle;Ljava/lang/Float;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "heightOrZero", "placeable", "Landroidx/compose/ui/layout/Placeable;", "widthOrZero", "defaultErrorSemantics", "Landroidx/compose/ui/Modifier;", "defaultErrorMessage", "material_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class TextFieldImplKt {
    public static final int AnimationDuration = 150;
    private static final float HorizontalIconPadding = 0.0f;
    public static final String LabelId = "Label";
    public static final String LeadingId = "Leading";
    private static final int PlaceholderAnimationDelayOrDuration = 67;
    private static final int PlaceholderAnimationDuration = 83;
    public static final String PlaceholderId = "Hint";
    public static final String TextFieldId = "TextField";
    private static final float TextFieldPadding = 0.0f;
    public static final String TrailingId = "Trailing";

    public static final void CommonDecorationBox(final TextFieldType type, final String value, final Function2<? super Composer, ? super Integer, Unit> r37, final VisualTransformation visualTransformation, final Function2<? super Composer, ? super Integer, Unit> r39, final Function2<? super Composer, ? super Integer, Unit> r40, final Function2<? super Composer, ? super Integer, Unit> r41, final Function2<? super Composer, ? super Integer, Unit> r42, final boolean singleLine, final boolean enabled, final boolean isError, final InteractionSource interactionSource, final PaddingValues contentPadding, final Shape shape, final TextFieldColors colors, final Function2<? super Composer, ? super Integer, Unit> r50, Composer $composer, final int $changed, final int $changed1) {
        Composer $composer2 = $composer.startRestartGroup(341783750);
        ComposerKt.sourceInformation($composer2, "C(CommonDecorationBox)P(13,14,4,15,7,9,8,12,11,3,6,5,2,10,1)80@3059L121,86@3256L25,106@3940L10,127@4849L4431,113@4275L5005:TextFieldImpl.kt#jmzs0o");
        int $dirty = $changed;
        int $dirty1 = $changed1;
        if (($changed & 6) != 0) goto L9;
        TextFieldType r8 = type;
        if ($composer2.changed(r8) == false) goto L7;
        int r14 = 4;
    L8:
        $dirty = $dirty | r14;
    L10:
        int r16 = 16;
        if (($changed & 48) != 0) goto L17;
        String r15 = value;
        if ($composer2.changed(r15) == false) goto L15;
        int r17 = 32;
    L16:
        $dirty = $dirty | r17;
    L18:
        int r18 = 256;
        if (($changed & 384) != 0) goto L25;
        Function2<? super Composer, ? super Integer, Unit> r13 = r37;
        if ($composer2.changedInstance(r13) == false) goto L23;
        int r20 = 256;
    L24:
        $dirty = $dirty | r20;
    L26:
        int r21 = 1024;
        if (($changed & 3072) == 0) goto L29;
    L33:
        int r23 = 16384;
        if (($changed & 24576) == 0) goto L36;
    L40:
        int r26 = 131072;
        if (($changed & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) != 0) goto L47;
        Function2<? super Composer, ? super Integer, Unit> r9 = r40;
        if ($composer2.changedInstance(r9) == false) goto L45;
        int r28 = 131072;
    L46:
        $dirty = $dirty | r28;
    L49:
        if (($changed & 1572864) != 0) goto L57;
        if ($composer2.changedInstance(r41) == false) goto L53;
        int r29 = 1048576;
    L54:
        $dirty = $dirty | r29;
        goto L57
    L53:
        r29 = 524288;
    L57:
        if (($changed & 12582912) != 0) goto L65;
        if ($composer2.changedInstance(r42) == false) goto L61;
        int r210 = 8388608;
    L62:
        $dirty = $dirty | r210;
        goto L65
    L61:
        r210 = 4194304;
    L65:
        if (($changed & 100663296) != 0) goto L73;
        if ($composer2.changed(singleLine) == false) goto L69;
        int r211 = AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
    L70:
        $dirty = $dirty | r211;
        goto L73
    L69:
        r211 = 33554432;
    L73:
        if (($changed & 805306368) != 0) goto L80;
        if ($composer2.changed(enabled) == false) goto L77;
        int r212 = 536870912;
    L78:
        $dirty = $dirty | r212;
        goto L80
    L77:
        r212 = 268435456;
    L80:
        if (($changed1 & 6) != 0) goto L87;
        if ($composer2.changed(isError) == false) goto L84;
        int r19 = 4;
    L85:
        $dirty1 = $dirty1 | r19;
        goto L87
    L84:
        r19 = 2;
    L87:
        if (($changed1 & 48) != 0) goto L93;
        if ($composer2.changed(interactionSource) == false) goto L91;
        r16 = 32;
    L91:
        $dirty1 = $dirty1 | r16;
    L93:
        if (($changed1 & 384) != 0) goto L101;
        if ($composer2.changed(contentPadding) == true) goto L98;
        r18 = 128;
    L98:
        $dirty1 = $dirty1 | r18;
    L101:
        if (($changed1 & 3072) != 0) goto L108;
        if ($composer2.changed(shape) == false) goto L105;
        r21 = 2048;
    L105:
        $dirty1 = $dirty1 | r21;
    L108:
        if (($changed1 & 24576) != 0) goto L115;
        if ($composer2.changed(colors) == true) goto L113;
        r23 = 8192;
    L113:
        $dirty1 = $dirty1 | r23;
    L115:
        if (($changed1 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) != 0) goto L123;
        if ($composer2.changedInstance(r50) == true) goto L120;
        r26 = 65536;
    L120:
        $dirty1 = $dirty1 | r26;
    L123:
        if (($dirty & 306783379) == 306783378) goto L125;
    L128:
        boolean r0 = true;
    L130:
        if ($composer2.shouldExecute(r0, $dirty & 1) == true) goto L132;
        Composer $composer3 = $composer2;
        $composer3.skipToGroupEnd();
    L200:
        ScopeUpdateScope r1 = $composer3.endRestartGroup();
        if (r1 == null) goto L204;
        r1.updateScope(new AnonymousClass4(type, value, r37, visualTransformation, r39, r40, r41, r42, singleLine, enabled, isError, interactionSource, contentPadding, shape, colors, r50, $changed, $changed1));
        return;
    L204:
        return;
    L132:
        if (ComposerKt.isTraceInProgress() == false) goto L134;
        ComposerKt.traceEventStart(341783750, $dirty, $dirty1, "androidx.compose.material.CommonDecorationBox (TextFieldImpl.kt:78)");
    L134:
        ComposerKt.sourceInformationMarkerStart($composer2, 1578825091, "CC(remember):TextFieldImpl.kt#9igjgp");
        if (($dirty & 112) != 32) goto L137;
        boolean r2 = true;
    L139:
        if (($dirty & 7168) != 2048) goto L141;
        boolean r3 = true;
    L142:
        boolean invalid$iv = r2 | r3;
        Object it$iv = $composer2.rememberedValue();
        if (invalid$iv == true) goto L149;
        if (it$iv == Composer.Companion.getEmpty()) goto L149;
    L150:
        ComposerKt.sourceInformationMarkerEnd($composer2);
        final String transformedText = ((TransformedText) it$iv).getText().getText();
        boolean isFocused = FocusInteractionKt.collectIsFocusedAsState(interactionSource, $composer2, ($dirty1 >> 3) & 14).getValue().booleanValue();
        if (isFocused == false) goto L154;
        InputPhase inputState = InputPhase.Focused;
    L160:
        Function3<InputPhase, Composer, Integer, Color> r110 = new TextFieldImplKt$CommonDecorationBox$labelColor$1(colors, enabled, isError, interactionSource);
        Typography typography = MaterialTheme.INSTANCE.getTypography($composer2, 6);
        TextStyle subtitle1 = typography.getSubtitle1();
        TextStyle caption = typography.getCaption();
        InputPhase inputState2 = inputState;
        if (Color.m4367equalsimpl0(subtitle1.m6447getColor0d7_KjU(), Color.Companion.m4402getUnspecified0d7_KjU()) == false) goto L165;
        if (Color.m4367equalsimpl0(caption.m6447getColor0d7_KjU(), Color.Companion.m4402getUnspecified0d7_KjU()) == true) goto L165;
    L168:
        final boolean shouldOverrideTextStyleColor = true;
    L170:
        TextFieldTransitionScope r4 = TextFieldTransitionScope.INSTANCE;
        $composer2.startReplaceGroup(1578866909);
        ComposerKt.sourceInformation($composer2, "*116@4383L10");
        long $this$CommonDecorationBox_u24lambda_u242 = MaterialTheme.INSTANCE.getTypography($composer2, 6).getCaption().m6447getColor0d7_KjU();
        if (shouldOverrideTextStyleColor == false) goto L180;
        $composer2.startReplaceGroup(-1572812364);
        ComposerKt.sourceInformation($composer2, "*117@4479L22");
        long $this$takeOrElse_u2dDxMtmZc$iv = $this$CommonDecorationBox_u24lambda_u242;
        if ($this$takeOrElse_u2dDxMtmZc$iv == 16) goto L175;
        int r111 = 1;
    L176:
        if (r111 == 0) goto L178;
        InputPhase inputState3 = inputState2;
    L179:
        $composer2.endReplaceGroup();
    L181:
        $composer2.endReplaceGroup();
        $composer2.startReplaceGroup(1578874175);
        ComposerKt.sourceInformation($composer2, "*121@4610L10");
        long $this$CommonDecorationBox_u24lambda_u244 = MaterialTheme.INSTANCE.getTypography($composer2, 6).getSubtitle1().m6447getColor0d7_KjU();
        if (shouldOverrideTextStyleColor == false) goto L191;
        $composer2.startReplaceGroup(-1572585196);
        ComposerKt.sourceInformation($composer2, "*122@4708L22");
        long $this$takeOrElse_u2dDxMtmZc$iv2 = $this$CommonDecorationBox_u24lambda_u244;
        if ($this$takeOrElse_u2dDxMtmZc$iv2 == 16) goto L186;
        int r22 = 1;
    L187:
        if (r22 != 0) goto L190;
        $this$takeOrElse_u2dDxMtmZc$iv2 = r110.invoke(inputState3, $composer2, 0).m4376unboximpl();
    L190:
        $composer2.endReplaceGroup();
        long r27 = $this$takeOrElse_u2dDxMtmZc$iv2;
    L192:
        $composer2.endReplaceGroup();
        if (r39 == null) goto L195;
        boolean r5 = true;
    L196:
        final TextFieldType r112 = r8;
        final Function2<? super Composer, ? super Integer, Unit> r7 = r9;
        final Function2<? super Composer, ? super Integer, Unit> r113 = r13;
        ComposableLambda r114 = ComposableLambdaKt.rememberComposableLambda(225557475, true, new AnonymousClass3(r39, r7, transformedText, colors, enabled, isError, interactionSource, r41, r42, shape, r112, r113, singleLine, contentPadding, shouldOverrideTextStyleColor, r50), $composer2, 54);
        long r10 = $this$takeOrElse_u2dDxMtmZc$iv;
        TextFieldTransitionScope r6 = r4;
        r6.m1841TransitionDTcfvLk(inputState3, r10, r27, r110, r5, r114, $composer2, 1769472);
        $composer3 = $composer2;
        if (ComposerKt.isTraceInProgress() == false) goto L200;
        ComposerKt.traceEventEnd();
        goto L200
    L195:
        r5 = false;
        goto L196
    L186:
        r22 = 0;
        goto L187
    L191:
        $composer2.startReplaceGroup(780557293);
        $composer2.endReplaceGroup();
        r27 = $this$CommonDecorationBox_u24lambda_u244;
        goto L192
    L178:
        inputState3 = inputState2;
        $this$takeOrElse_u2dDxMtmZc$iv = r110.invoke(inputState3, $composer2, 0).m4376unboximpl();
        goto L179
    L175:
        r111 = 0;
        goto L176
    L180:
        r4 = r4;
        inputState3 = inputState2;
        $composer2.startReplaceGroup(780549965);
        $composer2.endReplaceGroup();
        $this$takeOrElse_u2dDxMtmZc$iv = $this$CommonDecorationBox_u24lambda_u242;
    L165:
        if (Color.m4367equalsimpl0(subtitle1.m6447getColor0d7_KjU(), Color.Companion.m4402getUnspecified0d7_KjU()) == false) goto L167;
    L169:
        shouldOverrideTextStyleColor = false;
        goto L170
    L167:
        if (Color.m4367equalsimpl0(caption.m6447getColor0d7_KjU(), Color.Companion.m4402getUnspecified0d7_KjU()) == false) goto L169;
    L154:
        if (transformedText.length() != 0) goto L156;
        boolean r11 = true;
    L157:
        if (r11 == false) goto L159;
        inputState = InputPhase.UnfocusedEmpty;
        goto L160
    L159:
        inputState = InputPhase.UnfocusedNotEmpty;
        goto L160
    L156:
        r11 = false;
    L149:
        Object value$iv = visualTransformation.filter(new AnnotatedString(r15, null, null, 6, null));
        $composer2.updateRememberedValue(value$iv);
        it$iv = value$iv;
        goto L150
    L141:
        r3 = false;
        goto L142
    L137:
        r2 = false;
        goto L139
    L125:
        if ((74899 & $dirty1) != 74898) goto L128;
        r0 = false;
        goto L130
    L45:
        r28 = 65536;
        goto L46
    L47:
        r9 = r40;
        goto L49
    L36:
        if ($composer2.changedInstance(r39) == false) goto L38;
        int r12 = 16384;
    L39:
        $dirty = $dirty | r12;
        goto L40
    L38:
        r12 = 8192;
        goto L39
    L29:
        if ($composer2.changed(visualTransformation) == false) goto L31;
        int r24 = 2048;
    L32:
        $dirty = $dirty | r24;
        goto L33
    L31:
        r24 = 1024;
        goto L32
    L23:
        r20 = 128;
        goto L24
    L25:
        r13 = r37;
        goto L26
    L15:
        r17 = 16;
        goto L16
    L17:
        r15 = value;
        goto L18
    L7:
        r14 = 2;
        goto L8
    L9:
        r8 = type;
        goto L10
    }

    /* JADX INFO: renamed from: Decoration-euL9pac, reason: not valid java name */
    public static final void m1833DecorationeuL9pac(final long contentColor, TextStyle typography, Float contentAlpha, final Function2<? super Composer, ? super Integer, Unit> r16, Composer $composer, final int $changed, final int r19) {
        Composer $composer2 = $composer.startRestartGroup(-399493340);
        ComposerKt.sourceInformation($composer2, "C(Decoration)P(2:c#ui.graphics.Color,3,1)238@9666L548:TextFieldImpl.kt#jmzs0o");
        int $dirty = $changed;
        if ((r19 & 1) == 0) goto L6;
        $dirty = $dirty | 6;
    L12:
        int r2 = r19 & 2;
        if (r2 == 0) goto L16;
        $dirty = $dirty | 48;
    L22:
        int r4 = r19 & 4;
        if (r4 == 0) goto L26;
        $dirty = $dirty | 384;
    L33:
        if ((r19 & 8) == 0) goto L36;
        $dirty = $dirty | 3072;
    L42:
        int $dirty2 = $dirty;
        if (($dirty2 & 1171) == 1170) goto L45;
        boolean r1 = true;
    L47:
        if ($composer2.shouldExecute(r1, $dirty2 & 1) == false) goto L65;
        if (r2 == 0) goto L50;
        TextStyle typography2 = null;
    L51:
        if (r4 == 0) goto L53;
        final Float contentAlpha2 = null;
    L55:
        if (ComposerKt.isTraceInProgress() == false) goto L57;
        ComposerKt.traceEventStart(-399493340, $dirty2, -1, "androidx.compose.material.Decoration (TextFieldImpl.kt:236)");
    L57:
        Function2 colorAndEmphasis = ComposableLambdaKt.rememberComposableLambda(494684590, true, new TextFieldImplKt$Decoration$colorAndEmphasis$1(contentColor, contentAlpha2, r16), $composer2, 54);
        if (typography2 == null) goto L60;
        $composer2.startReplaceGroup(2115981348);
        ComposerKt.sourceInformation($composer2, "253@10243L46");
        TextKt.ProvideTextStyle(typography2, colorAndEmphasis, $composer2, (($dirty2 >> 3) & 14) | 48);
    L61:
        $composer2.endReplaceGroup();
        if (ComposerKt.isTraceInProgress() == false) goto L64;
        ComposerKt.traceEventEnd();
    L64:
        final TextStyle typography3 = typography2;
        final Float contentAlpha3 = contentAlpha2;
    L66:
        ScopeUpdateScope r10 = $composer2.endRestartGroup();
        if (r10 == null) goto L70;
        r10.updateScope(new TextFieldImplKt$Decoration$1(contentColor, typography3, contentAlpha3, r16, $changed, r19));
        return;
    L70:
        return;
    L60:
        $composer2.startReplaceGroup(2115982984);
        ComposerKt.sourceInformation($composer2, "253@10295L18");
        colorAndEmphasis.invoke($composer2, 6);
        goto L61
    L53:
        contentAlpha2 = contentAlpha;
        goto L55
    L50:
        typography2 = typography;
        goto L51
    L65:
        $composer2.skipToGroupEnd();
        typography3 = typography;
        contentAlpha3 = contentAlpha;
        goto L66
    L45:
        r1 = false;
        goto L47
    L36:
        if (($changed & 3072) != 0) goto L42;
        if ($composer2.changedInstance(r16) == false) goto L40;
        int r9 = 2048;
    L41:
        $dirty = $dirty | r9;
        goto L42
    L40:
        r9 = 1024;
        goto L41
    L26:
        if (($changed & 384) != 0) goto L33;
        if ($composer2.changed(contentAlpha) == false) goto L30;
        int r11 = 256;
    L31:
        $dirty = $dirty | r11;
        goto L33
    L30:
        r11 = 128;
        goto L31
    L16:
        if (($changed & 48) != 0) goto L22;
        if ($composer2.changed(typography) == false) goto L20;
        int r5 = 32;
    L21:
        $dirty = $dirty | r5;
        goto L22
    L20:
        r5 = 16;
        goto L21
    L6:
        if (($changed & 6) != 0) goto L12;
        if ($composer2.changed(contentColor) == false) goto L10;
        int r3 = 4;
    L11:
        $dirty = $dirty | r3;
        goto L12
    L10:
        r3 = 2;
        goto L11
    }

    public static final Modifier defaultErrorSemantics(Modifier $this$defaultErrorSemantics, boolean isError, final String defaultErrorMessage) {
        if (isError == false) goto L5;
        return SemanticsModifierKt.semantics$default($this$defaultErrorSemantics, false, new AnonymousClass1(defaultErrorMessage), 1, null);
    L5:
        return $this$defaultErrorSemantics;
    }

    public static final int widthOrZero(Placeable placeable) {
        if (placeable != null) goto L6;
        return 0;
    L6:
        return placeable.getWidth();
    }

    public static final int heightOrZero(Placeable placeable) {
        if (placeable != null) goto L6;
        return 0;
    L6:
        return placeable.getHeight();
    }

    public static final Object getLayoutId(IntrinsicMeasurable $this$layoutId) {
        Object r0 = $this$layoutId.getParentData();
        if ((r0 instanceof LayoutIdParentData) == false) goto L5;
        LayoutIdParentData r1 = (LayoutIdParentData) r0;
    L6:
        if (r1 != null) goto L8;
        return null;
    L8:
        return r1.getLayoutId();
    L5:
        r1 = null;
        goto L6
    }

    static {
        TextFieldPadding = Dp.m6973constructorimpl(16);
        HorizontalIconPadding = Dp.m6973constructorimpl(12);
    }

    public static final float getTextFieldPadding() {
        return TextFieldPadding;
    }

    public static final float getHorizontalIconPadding() {
        return HorizontalIconPadding;
    }
}
