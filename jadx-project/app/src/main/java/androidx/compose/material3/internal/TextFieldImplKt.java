package androidx.compose.material3.internal;

import androidx.autofill.HintConstants;
import androidx.compose.animation.ColorVectorConverterKt;
import androidx.compose.animation.SingleValueAnimationKt;
import androidx.compose.animation.core.AnimateAsStateKt;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.AnimationVector1D;
import androidx.compose.animation.core.Transition;
import androidx.compose.animation.core.TransitionKt;
import androidx.compose.animation.core.TwoWayConverter;
import androidx.compose.animation.core.VectorConvertersKt;
import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.BorderStrokeKt;
import androidx.compose.foundation.interaction.FocusInteractionKt;
import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.ContentColorKt;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.material3.OutlinedTextFieldKt;
import androidx.compose.material3.TextFieldColors;
import androidx.compose.material3.TextFieldKt;
import androidx.compose.material3.Typography;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.DrawModifierKt;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorProducer;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.graphics.colorspace.ColorSpace;
import androidx.compose.ui.layout.IntrinsicMeasurable;
import androidx.compose.ui.layout.LayoutIdParentData;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.input.TransformedText;
import androidx.compose.ui.text.input.VisualTransformation;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.Dp;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import androidx.profileinstaller.ProfileVerifier;
import androidx.savedstate.serialization.ClassDiscriminatorModeKt;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function7;
import kotlin.jvm.internal.FloatCompanionObject;

/* JADX INFO: compiled from: TextFieldImpl.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000º\u0001\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a \u0002\u0010-\u001a\u00020.2\u0006\u0010/\u001a\u0002002\u0006\u00101\u001a\u00020\u00012\u0011\u00102\u001a\r\u0012\u0004\u0012\u00020.03¢\u0006\u0002\b42\u0006\u00105\u001a\u0002062\u0013\u00107\u001a\u000f\u0012\u0004\u0012\u00020.\u0018\u000103¢\u0006\u0002\b42\u0015\b\u0002\u00108\u001a\u000f\u0012\u0004\u0012\u00020.\u0018\u000103¢\u0006\u0002\b42\u0015\b\u0002\u00109\u001a\u000f\u0012\u0004\u0012\u00020.\u0018\u000103¢\u0006\u0002\b42\u0015\b\u0002\u0010:\u001a\u000f\u0012\u0004\u0012\u00020.\u0018\u000103¢\u0006\u0002\b42\u0015\b\u0002\u0010;\u001a\u000f\u0012\u0004\u0012\u00020.\u0018\u000103¢\u0006\u0002\b42\u0015\b\u0002\u0010<\u001a\u000f\u0012\u0004\u0012\u00020.\u0018\u000103¢\u0006\u0002\b42\u0015\b\u0002\u0010=\u001a\u000f\u0012\u0004\u0012\u00020.\u0018\u000103¢\u0006\u0002\b42\b\b\u0002\u0010>\u001a\u00020?2\b\b\u0002\u0010@\u001a\u00020?2\b\b\u0002\u0010A\u001a\u00020?2\u0006\u0010B\u001a\u00020C2\u0006\u0010D\u001a\u00020E2\u0006\u0010F\u001a\u00020G2\u0011\u0010H\u001a\r\u0012\u0004\u0012\u00020.03¢\u0006\u0002\b4H\u0001¢\u0006\u0002\u0010I\u001a-\u0010J\u001a\u00020.2\u0006\u0010K\u001a\u00020L2\u0011\u0010M\u001a\r\u0012\u0004\u0012\u00020.03¢\u0006\u0002\b4H\u0003ø\u0001\u0000¢\u0006\u0004\bN\u0010O\u001a5\u0010J\u001a\u00020.2\u0006\u0010K\u001a\u00020L2\u0006\u0010P\u001a\u00020Q2\u0011\u0010M\u001a\r\u0012\u0004\u0012\u00020.03¢\u0006\u0002\b4H\u0003ø\u0001\u0000¢\u0006\u0004\bR\u0010S\u001a×\u0001\u0010T\u001a\u00020.2\u0006\u0010U\u001a\u00020V2\u0006\u0010W\u001a\u00020L2\u0006\u0010X\u001a\u00020L2\u0006\u0010Y\u001a\u00020L2\u0006\u0010Z\u001a\u00020?2\u0099\u0001\u0010M\u001a\u0094\u0001\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020]0\\¢\u0006\f\b^\u0012\b\b_\u0012\u0004\b\b(`\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020L0\\¢\u0006\f\b^\u0012\b\b_\u0012\u0004\b\b(a\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020L0\\¢\u0006\f\b^\u0012\b\b_\u0012\u0004\b\b(b\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020]0\\¢\u0006\f\b^\u0012\b\b_\u0012\u0004\b\b(c\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020]0\\¢\u0006\f\b^\u0012\b\b_\u0012\u0004\b\b(d\u0012\u0004\u0012\u00020.0[¢\u0006\u0002\b4H\u0083\bø\u0001\u0000¢\u0006\u0004\be\u0010f\u001aH\u0010g\u001a\b\u0012\u0004\u0012\u00020h0\\2\u0006\u0010@\u001a\u00020?2\u0006\u0010A\u001a\u00020?2\u0006\u0010i\u001a\u00020?2\u0006\u0010F\u001a\u00020G2\u0006\u0010j\u001a\u00020\u00032\u0006\u0010k\u001a\u00020\u0003H\u0001ø\u0001\u0000¢\u0006\u0004\bl\u0010m\u001a\u0012\u0010n\u001a\u00020\u00142\b\u0010o\u001a\u0004\u0018\u00010pH\u0000\u001a\u0012\u0010q\u001a\u00020\u00142\b\u0010o\u001a\u0004\u0018\u00010pH\u0000\u001a\u001c\u0010r\u001a\u00020\b*\u00020\b2\u0006\u0010A\u001a\u00020?2\u0006\u0010s\u001a\u00020\u0001H\u0000\u001a\u001c\u0010t\u001a\u00020\b*\u00020\b2\u0006\u0010u\u001a\u00020v2\u0006\u0010w\u001a\u00020xH\u0000\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u0016\u0010\u0002\u001a\u00020\u0003X\u0080\u0004¢\u0006\n\n\u0002\u0010\u0006\u001a\u0004\b\u0004\u0010\u0005\"\u0014\u0010\u0007\u001a\u00020\bX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n\"\u000e\u0010\u000b\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\f\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u0016\u0010\r\u001a\u00020\u0003X\u0080\u0004¢\u0006\n\n\u0002\u0010\u0006\u001a\u0004\b\u000e\u0010\u0005\"\u0016\u0010\u000f\u001a\u00020\u0003X\u0080\u0004¢\u0006\n\n\u0002\u0010\u0006\u001a\u0004\b\u0010\u0010\u0005\"\u0016\u0010\u0011\u001a\u00020\u0003X\u0080\u0004¢\u0006\n\n\u0002\u0010\u0006\u001a\u0004\b\u0012\u0010\u0005\"\u000e\u0010\u0013\u001a\u00020\u0014X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0015\u001a\u00020\u0014X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0016\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0017\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u0016\u0010\u0018\u001a\u00020\u0003X\u0080\u0004¢\u0006\n\n\u0002\u0010\u0006\u001a\u0004\b\u0019\u0010\u0005\"\u000e\u0010\u001a\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u001b\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u0016\u0010\u001c\u001a\u00020\u0003X\u0080\u0004¢\u0006\n\n\u0002\u0010\u0006\u001a\u0004\b\u001d\u0010\u0005\"\u000e\u0010\u001e\u001a\u00020\u0014X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u001f\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u0016\u0010 \u001a\u00020\u0003X\u0080\u0004¢\u0006\n\n\u0002\u0010\u0006\u001a\u0004\b!\u0010\u0005\"\u000e\u0010\"\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u0016\u0010#\u001a\u00020$X\u0080\u0004¢\u0006\n\n\u0002\u0010'\u001a\u0004\b%\u0010&\"\u001a\u0010(\u001a\u0004\u0018\u00010)*\u00020*8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b+\u0010,\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006y²\u0006\n\u0010z\u001a\u00020?X\u008a\u0084\u0002²\u0006\n\u0010{\u001a\u00020?X\u008a\u0084\u0002"}, d2 = {"ContainerId", "", "HorizontalIconPadding", "Landroidx/compose/ui/unit/Dp;", "getHorizontalIconPadding", "()F", "F", "IconDefaultSizeModifier", "Landroidx/compose/ui/Modifier;", "getIconDefaultSizeModifier", "()Landroidx/compose/ui/Modifier;", "LabelId", "LeadingId", "MinFocusedLabelLineHeight", "getMinFocusedLabelLineHeight", "MinSupportingTextLineHeight", "getMinSupportingTextLineHeight", "MinTextLineHeight", "getMinTextLineHeight", "PlaceholderAnimationDelayOrDuration", "", "PlaceholderAnimationDuration", "PlaceholderId", "PrefixId", "PrefixSuffixTextPadding", "getPrefixSuffixTextPadding", "SuffixId", "SupportingId", "SupportingTopPadding", "getSupportingTopPadding", "TextFieldAnimationDuration", "TextFieldId", "TextFieldPadding", "getTextFieldPadding", "TrailingId", "ZeroConstraints", "Landroidx/compose/ui/unit/Constraints;", "getZeroConstraints", "()J", "J", "layoutId", "", "Landroidx/compose/ui/layout/IntrinsicMeasurable;", "getLayoutId", "(Landroidx/compose/ui/layout/IntrinsicMeasurable;)Ljava/lang/Object;", "CommonDecorationBox", "", ClassDiscriminatorModeKt.CLASS_DISCRIMINATOR_KEY, "Landroidx/compose/material3/internal/TextFieldType;", "value", "innerTextField", "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "visualTransformation", "Landroidx/compose/ui/text/input/VisualTransformation;", "label", "placeholder", "leadingIcon", "trailingIcon", "prefix", "suffix", "supportingText", "singleLine", "", "enabled", "isError", "interactionSource", "Landroidx/compose/foundation/interaction/InteractionSource;", "contentPadding", "Landroidx/compose/foundation/layout/PaddingValues;", "colors", "Landroidx/compose/material3/TextFieldColors;", "container", "(Landroidx/compose/material3/internal/TextFieldType;Ljava/lang/String;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/text/input/VisualTransformation;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;ZZZLandroidx/compose/foundation/interaction/InteractionSource;Landroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/material3/TextFieldColors;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;III)V", "Decoration", "contentColor", "Landroidx/compose/ui/graphics/Color;", "content", "Decoration-Iv8Zu3U", "(JLkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "textStyle", "Landroidx/compose/ui/text/TextStyle;", "Decoration-3J-VO9M", "(JLandroidx/compose/ui/text/TextStyle;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "TextFieldTransitionScope", "inputState", "Landroidx/compose/material3/internal/InputPhase;", "focusedLabelTextStyleColor", "unfocusedLabelTextStyleColor", "labelColor", "showLabel", "Lkotlin/Function5;", "Landroidx/compose/runtime/State;", "", "Lkotlin/ParameterName;", HintConstants.AUTOFILL_HINT_NAME, "labelProgress", "labelTextStyleColor", "labelContentColor", "placeholderOpacity", "prefixSuffixOpacity", "TextFieldTransitionScope-Jy8F4Js", "(Landroidx/compose/material3/internal/InputPhase;JJJZLkotlin/jvm/functions/Function7;Landroidx/compose/runtime/Composer;I)V", "animateBorderStrokeAsState", "Landroidx/compose/foundation/BorderStroke;", "focused", "focusedBorderThickness", "unfocusedBorderThickness", "animateBorderStrokeAsState-NuRrP5Q", "(ZZZLandroidx/compose/material3/TextFieldColors;FFLandroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;", "heightOrZero", "placeable", "Landroidx/compose/ui/layout/Placeable;", "widthOrZero", "defaultErrorSemantics", "defaultErrorMessage", "textFieldBackground", "color", "Landroidx/compose/ui/graphics/ColorProducer;", "shape", "Landroidx/compose/ui/graphics/Shape;", "material3_release", "showPlaceholder", "showPrefixSuffix"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class TextFieldImplKt {
    public static final String ContainerId = "Container";
    private static final float HorizontalIconPadding = 0.0f;
    private static final Modifier IconDefaultSizeModifier = null;
    public static final String LabelId = "Label";
    public static final String LeadingId = "Leading";
    private static final float MinFocusedLabelLineHeight = 0.0f;
    private static final float MinSupportingTextLineHeight = 0.0f;
    private static final float MinTextLineHeight = 0.0f;
    private static final int PlaceholderAnimationDelayOrDuration = 67;
    private static final int PlaceholderAnimationDuration = 83;
    public static final String PlaceholderId = "Hint";
    public static final String PrefixId = "Prefix";
    private static final float PrefixSuffixTextPadding = 0.0f;
    public static final String SuffixId = "Suffix";
    public static final String SupportingId = "Supporting";
    private static final float SupportingTopPadding = 0.0f;
    public static final int TextFieldAnimationDuration = 150;
    public static final String TextFieldId = "TextField";
    private static final float TextFieldPadding = 0.0f;
    public static final String TrailingId = "Trailing";
    private static final long ZeroConstraints = 0;

    /* JADX INFO: compiled from: TextFieldImpl.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0 = null;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1 = null;

        static {
            int[] r0 = new int[TextFieldType.values().length];
            r0[TextFieldType.Filled.ordinal()] = 1;     // Catch: NoSuchFieldError -> L5
        L22:
            r0[TextFieldType.Outlined.ordinal()] = 2;     // Catch: NoSuchFieldError -> L9
        L10:
            $EnumSwitchMapping$0 = r0;
            int[] r1 = new int[InputPhase.values().length];
            r1[InputPhase.Focused.ordinal()] = 1;     // Catch: NoSuchFieldError -> L13
        L26:
            r1[InputPhase.UnfocusedEmpty.ordinal()] = 2;     // Catch: NoSuchFieldError -> L16
        L28:
            r1[InputPhase.UnfocusedNotEmpty.ordinal()] = 3;     // Catch: NoSuchFieldError -> L19
        L20:
            $EnumSwitchMapping$1 = r1;
        }
    }

    /* JADX INFO: renamed from: access$Decoration-3J-VO9M, reason: not valid java name */
    public static final /* synthetic */ void m3106access$Decoration3JVO9M(long contentColor, TextStyle textStyle, Function2 content, Composer $composer, int $changed) {
        m3103Decoration3JVO9M(contentColor, textStyle, content, $composer, $changed);
    }

    /* JADX INFO: renamed from: access$Decoration-Iv8Zu3U, reason: not valid java name */
    public static final /* synthetic */ void m3107access$DecorationIv8Zu3U(long contentColor, Function2 content, Composer $composer, int $changed) {
        m3104DecorationIv8Zu3U(contentColor, content, $composer, $changed);
    }

    public static final void CommonDecorationBox(final TextFieldType type, final String value, final Function2<? super Composer, ? super Integer, Unit> r81, final VisualTransformation visualTransformation, final Function2<? super Composer, ? super Integer, Unit> r83, Function2<? super Composer, ? super Integer, Unit> r84, Function2<? super Composer, ? super Integer, Unit> r85, Function2<? super Composer, ? super Integer, Unit> r86, Function2<? super Composer, ? super Integer, Unit> r87, Function2<? super Composer, ? super Integer, Unit> r88, Function2<? super Composer, ? super Integer, Unit> r89, boolean singleLine, boolean enabled, boolean isError, final InteractionSource interactionSource, final PaddingValues contentPadding, final TextFieldColors colors, final Function2<? super Composer, ? super Integer, Unit> r96, Composer $composer, final int $changed, final int $changed1, final int r100) {
        Composer $composer2 = $composer.startRestartGroup(1514469103);
        ComposerKt.sourceInformation($composer2, "C(CommonDecorationBox)P(15,16,4,17,7,9,8,14,10,12,13,11,3,6,5,2)98@4054L121,104@4251L25,114@4594L10,121@4911L7503:TextFieldImpl.kt#mqatfk");
        int $dirty = $changed;
        int $dirty1 = $changed1;
        if ((r100 & 1) == 0) goto L6;
        $dirty = $dirty | 6;
    L14:
        if ((r100 & 2) == 0) goto L17;
        $dirty = $dirty | 48;
        String r12 = value;
    L25:
        if ((r100 & 4) == 0) goto L28;
        $dirty = $dirty | 384;
        Function2<? super Composer, ? super Integer, Unit> r13 = r81;
    L36:
        if ((r100 & 8) == 0) goto L39;
        $dirty = $dirty | 3072;
    L46:
        if ((r100 & 16) == 0) goto L49;
        $dirty = $dirty | 24576;
    L55:
        int r14 = r100 & 32;
        if (r14 == 0) goto L59;
        $dirty = $dirty | ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
    L66:
        int r16 = r100 & 64;
        if (r16 == 0) goto L70;
        $dirty = $dirty | 1572864;
    L77:
        int $dirty2 = r100 & 128;
        if ($dirty2 == 0) goto L81;
        $dirty = $dirty | 12582912;
    L88:
        int $dirty3 = r100 & 256;
        if ($dirty3 == 0) goto L92;
        $dirty = $dirty | 100663296;
    L99:
        int $dirty4 = r100 & 512;
        if ($dirty4 == 0) goto L103;
        $dirty = $dirty | 805306368;
    L110:
        int $dirty5 = r100 & 1024;
        if ($dirty5 == 0) goto L114;
        $dirty1 = $dirty1 | 6;
    L121:
        int $dirty6 = r100 & 2048;
        if ($dirty6 == 0) goto L125;
        $dirty1 = $dirty1 | 48;
    L132:
        int r3 = r100 & 4096;
        if (r3 == 0) goto L135;
        $dirty1 = $dirty1 | 384;
        int r22 = r3;
    L143:
        int r4 = r100 & 8192;
        if (r4 == 0) goto L146;
        $dirty1 = $dirty1 | 3072;
        int r23 = r4;
    L155:
        if ((r100 & 16384) == 0) goto L158;
        $dirty1 = $dirty1 | 24576;
    L165:
        if ((32768 & r100) == 0) goto L169;
        int r5 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
    L167:
        $dirty1 = $dirty1 | r5;
    L175:
        if ((65536 & r100) == 0) goto L179;
        int r6 = 1572864;
    L177:
        $dirty1 = $dirty1 | r6;
    L185:
        if ((131072 & r100) == 0) goto L189;
        int r7 = 12582912;
    L187:
        $dirty1 = $dirty1 | r7;
    L194:
        int $dirty7 = $dirty1;
        if ((306783379 & $dirty) == 306783378) goto L197;
    L202:
        if (r14 == 0) goto L204;
        Function2<? super Composer, ? super Integer, Unit> r8 = null;
    L205:
        if (r16 == 0) goto L207;
        Function2<? super Composer, ? super Integer, Unit> r10 = null;
    L208:
        if ($dirty2 == 0) goto L210;
        Function2<? super Composer, ? super Integer, Unit> r15 = null;
    L211:
        if ($dirty3 == 0) goto L213;
        Function2<? super Composer, ? super Integer, Unit> r17 = null;
    L214:
        if ($dirty4 == 0) goto L216;
        Function2<? super Composer, ? super Integer, Unit> r18 = null;
    L217:
        if ($dirty5 == 0) goto L219;
        Function2<? super Composer, ? super Integer, Unit> r33 = null;
    L220:
        if ($dirty6 == 0) goto L222;
        boolean singleLine2 = false;
    L223:
        if (r22 == 0) goto L225;
        boolean enabled2 = true;
    L226:
        if (r23 == 0) goto L228;
        boolean isError2 = false;
    L230:
        if (ComposerKt.isTraceInProgress() == false) goto L233;
        ComposerKt.traceEventStart(1514469103, $dirty, $dirty7, "androidx.compose.material3.internal.CommonDecorationBox (TextFieldImpl.kt:96)");
    L233:
        ComposerKt.sourceInformationMarkerStart($composer2, 318599163, "CC(remember):TextFieldImpl.kt#9igjgp");
        if (($dirty & 112) != 32) goto L236;
        boolean r9 = true;
    L238:
        if (($dirty & 7168) != 2048) goto L240;
        boolean r11 = true;
    L241:
        boolean invalid$iv = r9 | r11;
        Object it$iv = $composer2.rememberedValue();
        if (invalid$iv == true) goto L247;
        int $dirty8 = $dirty;
        if (it$iv == Composer.Companion.getEmpty()) goto L248;
        Object value$iv = it$iv;
    L249:
        ComposerKt.sourceInformationMarkerEnd($composer2);
        String transformedText = ((TransformedText) value$iv).getText().getText();
        boolean isFocused = FocusInteractionKt.collectIsFocusedAsState(interactionSource, $composer2, ($dirty7 >> 12) & 14).getValue().booleanValue();
        if (isFocused == false) goto L253;
        InputPhase inputState = InputPhase.Focused;
    L259:
        long labelColor = colors.m2783labelColorXeAY9LY$material3_release(enabled2, isError2, isFocused);
        Typography typography = MaterialTheme.INSTANCE.getTypography($composer2, 6);
        TextStyle bodyLarge = typography.getBodyLarge();
        final TextStyle bodySmall = typography.getBodySmall();
        boolean enabled3 = enabled2;
        if (Color.m4367equalsimpl0(bodyLarge.m6447getColor0d7_KjU(), Color.Companion.m4402getUnspecified0d7_KjU()) == false) goto L264;
        if (Color.m4367equalsimpl0(bodySmall.m6447getColor0d7_KjU(), Color.Companion.m4402getUnspecified0d7_KjU()) == true) goto L264;
    L267:
        boolean overrideLabelTextStyleColor = true;
    L269:
        long $this$CommonDecorationBox_u24lambda_u242 = bodySmall.m6447getColor0d7_KjU();
        if (overrideLabelTextStyleColor == true) goto L272;
    L278:
        long $this$CommonDecorationBox_u24lambda_u244 = bodyLarge.m6447getColor0d7_KjU();
        if (overrideLabelTextStyleColor == true) goto L281;
    L288:
        if (r83 == null) goto L290;
        boolean showLabel$iv = true;
    L291:
        long unfocusedLabelTextStyleColor$iv = $this$CommonDecorationBox_u24lambda_u244;
        final boolean overrideLabelTextStyleColor2 = overrideLabelTextStyleColor;
        ComposerKt.sourceInformationMarkerStart($composer2, -1087703202, "CC(TextFieldTransitionScope)P(2,1:c#ui.graphics.Color,5:c#ui.graphics.Color,3:c#ui.graphics.Color,4)349@14528L59,352@14632L334,364@15016L1126,394@16193L363,406@16607L318,418@17028L197,424@17231L150:TextFieldImpl.kt#mqatfk");
        boolean showLabel$iv2 = showLabel$iv;
        Transition transition$iv = TransitionKt.updateTransition(inputState, "TextFieldInputState", $composer2, (0 & 14) | 48, 0);
        Function3 transitionSpec$iv$iv = TextFieldImplKt$TextFieldTransitionScope$labelProgress$1.INSTANCE;
        ComposerKt.sourceInformationMarkerStart($composer2, -1338768149, "CC(animateFloat)P(2)1966@80444L78:Transition.kt#pdpnli");
        TwoWayConverter<Float, AnimationVector1D> r19 = VectorConvertersKt.getVectorConverter(FloatCompanionObject.INSTANCE);
        int $changed$iv$iv$iv = ((((384 << 3) & 896) | (384 & 14)) | ((384 << 3) & 7168)) | ((384 << 3) & 57344);
        ComposerKt.sourceInformationMarkerStart($composer2, -142660079, "CC(animateValue)P(3,2)1883@77007L32,1884@77062L31,1885@77118L23,1887@77154L89:Transition.kt#pdpnli");
        int $changed$iv = ($changed$iv$iv$iv >> 9) & 112;
        InputPhase it$iv2 = (InputPhase) transition$iv.getCurrentState();
        $composer2.startReplaceGroup(-2036730335);
        ComposerKt.sourceInformation($composer2, "C:TextFieldImpl.kt#mqatfk");
        if (ComposerKt.isTraceInProgress() == false) goto L296;
        ComposerKt.traceEventStart(-2036730335, $changed$iv, -1, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:356)");
    L296:
        switch(WhenMappings.$EnumSwitchMapping$1[it$iv2.ordinal()]) {
            case 1: goto L301;
            case 2: goto L300;
            case 3: goto L299;
            default: goto L298;
        };
    L299:
        float r110 = 1.0f;
    L303:
        if (ComposerKt.isTraceInProgress() == false) goto L305;
        ComposerKt.traceEventEnd();
    L305:
        $composer2.endReplaceGroup();
        Object initialValue$iv$iv$iv = Float.valueOf(r110);
        int $changed$iv2 = ($changed$iv$iv$iv >> 9) & 112;
        InputPhase r111 = (InputPhase) transition$iv.getTargetState();
        $composer2.startReplaceGroup(-2036730335);
        ComposerKt.sourceInformation($composer2, "C:TextFieldImpl.kt#mqatfk");
        if (ComposerKt.isTraceInProgress() == false) goto L310;
        ComposerKt.traceEventStart(-2036730335, $changed$iv2, -1, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:356)");
    L310:
        switch(WhenMappings.$EnumSwitchMapping$1[r111.ordinal()]) {
            case 1: goto L315;
            case 2: goto L314;
            case 3: goto L313;
            default: goto L312;
        };
    L313:
        float r20 = 1.0f;
    L317:
        if (ComposerKt.isTraceInProgress() == false) goto L319;
        ComposerKt.traceEventEnd();
    L319:
        $composer2.endReplaceGroup();
        Object targetValue$iv$iv$iv = Float.valueOf(r20);
        State labelProgress$iv = TransitionKt.createTransitionAnimation(transition$iv, initialValue$iv$iv$iv, targetValue$iv$iv$iv, transitionSpec$iv$iv.invoke(transition$iv.getSegment(), $composer2, Integer.valueOf(($changed$iv$iv$iv >> 3) & 112)), r19, "LabelProgress", $composer2, (($changed$iv$iv$iv & 14) | (($changed$iv$iv$iv << 9) & 57344)) | (($changed$iv$iv$iv << 6) & 458752));
        ComposerKt.sourceInformationMarkerEnd($composer2);
        ComposerKt.sourceInformationMarkerEnd($composer2);
        Function3 transitionSpec$iv$iv2 = TextFieldImplKt$TextFieldTransitionScope$placeholderOpacity$1.INSTANCE;
        ComposerKt.sourceInformationMarkerStart($composer2, -1338768149, "CC(animateFloat)P(2)1966@80444L78:Transition.kt#pdpnli");
        TwoWayConverter<Float, AnimationVector1D> r21 = VectorConvertersKt.getVectorConverter(FloatCompanionObject.INSTANCE);
        int $changed$iv$iv$iv2 = ((((384 << 3) & 896) | (384 & 14)) | ((384 << 3) & 7168)) | ((384 << 3) & 57344);
        ComposerKt.sourceInformationMarkerStart($composer2, -142660079, "CC(animateValue)P(3,2)1883@77007L32,1884@77062L31,1885@77118L23,1887@77154L89:Transition.kt#pdpnli");
        int $changed$iv3 = ($changed$iv$iv$iv2 >> 9) & 112;
        InputPhase it$iv3 = (InputPhase) transition$iv.getCurrentState();
        $composer2.startReplaceGroup(1435837472);
        ComposerKt.sourceInformation($composer2, "C:TextFieldImpl.kt#mqatfk");
        if (ComposerKt.isTraceInProgress() == false) goto L324;
        ComposerKt.traceEventStart(1435837472, $changed$iv3, -1, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:386)");
    L324:
        switch(WhenMappings.$EnumSwitchMapping$1[it$iv3.ordinal()]) {
            case 1: goto L331;
            case 2: goto L328;
            case 3: goto L327;
            default: goto L326;
        };
    L327:
        float r24 = 0.0f;
    L333:
        if (ComposerKt.isTraceInProgress() == false) goto L335;
        ComposerKt.traceEventEnd();
    L335:
        $composer2.endReplaceGroup();
        Object initialValue$iv$iv$iv2 = Float.valueOf(r24);
        int $changed$iv4 = ($changed$iv$iv$iv2 >> 9) & 112;
        InputPhase r25 = (InputPhase) transition$iv.getTargetState();
        $composer2.startReplaceGroup(1435837472);
        ComposerKt.sourceInformation($composer2, "C:TextFieldImpl.kt#mqatfk");
        if (ComposerKt.isTraceInProgress() == false) goto L340;
        ComposerKt.traceEventStart(1435837472, $changed$iv4, -1, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:386)");
    L340:
        switch(WhenMappings.$EnumSwitchMapping$1[r25.ordinal()]) {
            case 1: goto L347;
            case 2: goto L344;
            case 3: goto L343;
            default: goto L342;
        };
    L343:
        float r26 = 0.0f;
    L349:
        if (ComposerKt.isTraceInProgress() == false) goto L351;
        ComposerKt.traceEventEnd();
    L351:
        $composer2.endReplaceGroup();
        Object targetValue$iv$iv$iv2 = Float.valueOf(r26);
        final State placeholderOpacity$iv = TransitionKt.createTransitionAnimation(transition$iv, initialValue$iv$iv$iv2, targetValue$iv$iv$iv2, transitionSpec$iv$iv2.invoke(transition$iv.getSegment(), $composer2, Integer.valueOf(($changed$iv$iv$iv2 >> 3) & 112)), r21, "PlaceholderOpacity", $composer2, (($changed$iv$iv$iv2 & 14) | (($changed$iv$iv$iv2 << 9) & 57344)) | (($changed$iv$iv$iv2 << 6) & 458752));
        ComposerKt.sourceInformationMarkerEnd($composer2);
        ComposerKt.sourceInformationMarkerEnd($composer2);
        Function3 transitionSpec$iv$iv3 = TextFieldImplKt$TextFieldTransitionScope$prefixSuffixOpacity$1.INSTANCE;
        ComposerKt.sourceInformationMarkerStart($composer2, -1338768149, "CC(animateFloat)P(2)1966@80444L78:Transition.kt#pdpnli");
        TwoWayConverter<Float, AnimationVector1D> r27 = VectorConvertersKt.getVectorConverter(FloatCompanionObject.INSTANCE);
        int $changed$iv$iv$iv3 = ((((384 << 3) & 896) | (384 & 14)) | ((384 << 3) & 7168)) | ((384 << 3) & 57344);
        ComposerKt.sourceInformationMarkerStart($composer2, -142660079, "CC(animateValue)P(3,2)1883@77007L32,1884@77062L31,1885@77118L23,1887@77154L89:Transition.kt#pdpnli");
        int $changed$iv5 = ($changed$iv$iv$iv3 >> 9) & 112;
        InputPhase it$iv4 = (InputPhase) transition$iv.getCurrentState();
        $composer2.startReplaceGroup(1128033978);
        ComposerKt.sourceInformation($composer2, "C:TextFieldImpl.kt#mqatfk");
        if (ComposerKt.isTraceInProgress() == false) goto L356;
        ComposerKt.traceEventStart(1128033978, $changed$iv5, -1, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:398)");
    L356:
        switch(WhenMappings.$EnumSwitchMapping$1[it$iv4.ordinal()]) {
            case 1: goto L363;
            case 2: goto L360;
            case 3: goto L359;
            default: goto L358;
        };
    L359:
        float r28 = 1.0f;
    L365:
        if (ComposerKt.isTraceInProgress() == false) goto L367;
        ComposerKt.traceEventEnd();
    L367:
        $composer2.endReplaceGroup();
        Object initialValue$iv$iv$iv3 = Float.valueOf(r28);
        int $changed$iv6 = ($changed$iv$iv$iv3 >> 9) & 112;
        InputPhase r29 = (InputPhase) transition$iv.getTargetState();
        $composer2.startReplaceGroup(1128033978);
        ComposerKt.sourceInformation($composer2, "C:TextFieldImpl.kt#mqatfk");
        if (ComposerKt.isTraceInProgress() == false) goto L372;
        ComposerKt.traceEventStart(1128033978, $changed$iv6, -1, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:398)");
    L372:
        switch(WhenMappings.$EnumSwitchMapping$1[r29.ordinal()]) {
            case 1: goto L379;
            case 2: goto L376;
            case 3: goto L375;
            default: goto L374;
        };
    L375:
        float r112 = 1.0f;
    L381:
        if (ComposerKt.isTraceInProgress() == false) goto L383;
        ComposerKt.traceEventEnd();
    L383:
        $composer2.endReplaceGroup();
        Object targetValue$iv$iv$iv3 = Float.valueOf(r112);
        State prefixSuffixOpacity$iv = TransitionKt.createTransitionAnimation(transition$iv, initialValue$iv$iv$iv3, targetValue$iv$iv$iv3, transitionSpec$iv$iv3.invoke(transition$iv.getSegment(), $composer2, Integer.valueOf(($changed$iv$iv$iv3 >> 3) & 112)), r27, "PrefixSuffixOpacity", $composer2, (($changed$iv$iv$iv3 & 14) | (($changed$iv$iv$iv3 << 9) & 57344)) | (($changed$iv$iv$iv3 << 6) & 458752));
        ComposerKt.sourceInformationMarkerEnd($composer2);
        ComposerKt.sourceInformationMarkerEnd($composer2);
        Function3 transitionSpec$iv$iv4 = TextFieldImplKt$TextFieldTransitionScope$labelTextStyleColor$1.INSTANCE;
        ComposerKt.sourceInformationMarkerStart($composer2, -1939694975, "CC(animateColor)P(2)68@3220L31,69@3287L70,73@3370L70:Transition.kt#xbi5r1");
        int $changed$iv7 = (384 >> 6) & 112;
        InputPhase it$iv5 = (InputPhase) transition$iv.getTargetState();
        $composer2.startReplaceGroup(-107432127);
        ComposerKt.sourceInformation($composer2, "C:TextFieldImpl.kt#mqatfk");
        if (ComposerKt.isTraceInProgress() == false) goto L388;
        ComposerKt.traceEventStart(-107432127, $changed$iv7, -1, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:410)");
    L388:
        if (WhenMappings.$EnumSwitchMapping$1[it$iv5.ordinal()] != 1) goto L390;
        long r113 = $this$CommonDecorationBox_u24lambda_u242;
    L392:
        if (ComposerKt.isTraceInProgress() == false) goto L394;
        ComposerKt.traceEventEnd();
    L394:
        $composer2.endReplaceGroup();
        ColorSpace colorSpace$iv$iv = Color.m4370getColorSpaceimpl(r113);
        ComposerKt.sourceInformationMarkerStart($composer2, 1918408083, "CC(remember):Transition.kt#9igjgp");
        boolean invalid$iv$iv$iv = $composer2.changed(colorSpace$iv$iv);
        Object value$iv$iv$iv = $composer2.rememberedValue();
        if (invalid$iv$iv$iv == true) goto L401;
        if (value$iv$iv$iv == Composer.Companion.getEmpty()) goto L401;
    L402:
        TwoWayConverter typeConverter$iv$iv = (TwoWayConverter) value$iv$iv$iv;
        ComposerKt.sourceInformationMarkerEnd($composer2);
        int $changed$iv$iv$iv4 = (((384 & 14) | ((384 << 3) & 896)) | ((384 << 3) & 7168)) | ((384 << 3) & 57344);
        ComposerKt.sourceInformationMarkerStart($composer2, -142660079, "CC(animateValue)P(3,2)1883@77007L32,1884@77062L31,1885@77118L23,1887@77154L89:Transition.kt#pdpnli");
        int $changed$iv8 = ($changed$iv$iv$iv4 >> 9) & 112;
        InputPhase it$iv6 = (InputPhase) transition$iv.getCurrentState();
        $composer2.startReplaceGroup(-107432127);
        ComposerKt.sourceInformation($composer2, "C:TextFieldImpl.kt#mqatfk");
        if (ComposerKt.isTraceInProgress() == false) goto L407;
        ComposerKt.traceEventStart(-107432127, $changed$iv8, -1, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:410)");
    L407:
        if (WhenMappings.$EnumSwitchMapping$1[it$iv6.ordinal()] != 1) goto L409;
        long r114 = $this$CommonDecorationBox_u24lambda_u242;
    L411:
        if (ComposerKt.isTraceInProgress() == false) goto L413;
        ComposerKt.traceEventEnd();
    L413:
        $composer2.endReplaceGroup();
        Object initialValue$iv$iv$iv4 = Color.m4356boximpl(r114);
        int $changed$iv9 = ($changed$iv$iv$iv4 >> 9) & 112;
        InputPhase r30 = (InputPhase) r12.getTargetState();
        $composer2.startReplaceGroup(-107432127);
        ComposerKt.sourceInformation($composer2, "C:TextFieldImpl.kt#mqatfk");
        if (ComposerKt.isTraceInProgress() == false) goto L418;
        ComposerKt.traceEventStart(-107432127, $changed$iv9, -1, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:410)");
    L418:
        if (WhenMappings.$EnumSwitchMapping$1[r30.ordinal()] != 1) goto L420;
        long r56 = $this$CommonDecorationBox_u24lambda_u242;
    L422:
        if (ComposerKt.isTraceInProgress() == false) goto L424;
        ComposerKt.traceEventEnd();
    L424:
        $composer2.endReplaceGroup();
        Object targetValue$iv$iv$iv4 = Color.m4356boximpl(r56);
        final State labelTextStyleColor$iv = TransitionKt.createTransitionAnimation(transition$iv, initialValue$iv$iv$iv4, targetValue$iv$iv$iv4, transitionSpec$iv$iv4.invoke(r12.getSegment(), $composer2, Integer.valueOf(($changed$iv$iv$iv4 >> 3) & 112)), typeConverter$iv$iv, "LabelTextStyleColor", $composer2, (($changed$iv$iv$iv4 & 14) | (($changed$iv$iv$iv4 << 9) & 57344)) | (($changed$iv$iv$iv4 << 6) & 458752));
        ComposerKt.sourceInformationMarkerEnd($composer2);
        ComposerKt.sourceInformationMarkerEnd($composer2);
        Function3 transitionSpec$iv$iv5 = TextFieldImplKt$TextFieldTransitionScope$labelContentColor$1.INSTANCE;
        ComposerKt.sourceInformationMarkerStart($composer2, -1939694975, "CC(animateColor)P(2)68@3220L31,69@3287L70,73@3370L70:Transition.kt#xbi5r1");
        int $changed$iv10 = (384 >> 6) & 112;
        InputPhase r31 = (InputPhase) transition$iv.getTargetState();
        $composer2.startReplaceGroup(1023351670);
        ComposerKt.sourceInformation($composer2, "C:TextFieldImpl.kt#mqatfk");
        if (ComposerKt.isTraceInProgress() == false) goto L429;
        ComposerKt.traceEventStart(1023351670, $changed$iv10, -1, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:421)");
    L429:
        if (ComposerKt.isTraceInProgress() == false) goto L431;
        ComposerKt.traceEventEnd();
    L431:
        $composer2.endReplaceGroup();
        ColorSpace colorSpace$iv$iv2 = Color.m4370getColorSpaceimpl(labelColor);
        ComposerKt.sourceInformationMarkerStart($composer2, 1918408083, "CC(remember):Transition.kt#9igjgp");
        boolean invalid$iv$iv$iv2 = $composer2.changed(colorSpace$iv$iv2);
        Object value$iv$iv$iv2 = $composer2.rememberedValue();
        if (invalid$iv$iv$iv2 == true) goto L438;
        if (value$iv$iv$iv2 == Composer.Companion.getEmpty()) goto L438;
    L439:
        TwoWayConverter typeConverter$iv$iv2 = (TwoWayConverter) value$iv$iv$iv2;
        ComposerKt.sourceInformationMarkerEnd($composer2);
        int $changed$iv$iv$iv5 = (((384 & 14) | ((384 << 3) & 896)) | ((384 << 3) & 7168)) | ((384 << 3) & 57344);
        ComposerKt.sourceInformationMarkerStart($composer2, -142660079, "CC(animateValue)P(3,2)1883@77007L32,1884@77062L31,1885@77118L23,1887@77154L89:Transition.kt#pdpnli");
        int $changed$iv11 = ($changed$iv$iv$iv5 >> 9) & 112;
        InputPhase r32 = (InputPhase) transition$iv.getCurrentState();
        $composer2.startReplaceGroup(1023351670);
        ComposerKt.sourceInformation($composer2, "C:TextFieldImpl.kt#mqatfk");
        if (ComposerKt.isTraceInProgress() == false) goto L444;
        ComposerKt.traceEventStart(1023351670, $changed$iv11, -1, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:421)");
    L444:
        if (ComposerKt.isTraceInProgress() == false) goto L446;
        ComposerKt.traceEventEnd();
    L446:
        $composer2.endReplaceGroup();
        Object initialValue$iv$iv$iv5 = Color.m4356boximpl(labelColor);
        int $changed$iv12 = ($changed$iv$iv$iv5 >> 9) & 112;
        InputPhase r34 = (InputPhase) r12.getTargetState();
        $composer2.startReplaceGroup(1023351670);
        ComposerKt.sourceInformation($composer2, "C:TextFieldImpl.kt#mqatfk");
        if (ComposerKt.isTraceInProgress() == false) goto L451;
        ComposerKt.traceEventStart(1023351670, $changed$iv12, -1, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:421)");
    L451:
        if (ComposerKt.isTraceInProgress() == false) goto L453;
        ComposerKt.traceEventEnd();
    L453:
        $composer2.endReplaceGroup();
        Object targetValue$iv$iv$iv5 = Color.m4356boximpl(labelColor);
        final State labelContentColor$iv = TransitionKt.createTransitionAnimation(transition$iv, initialValue$iv$iv$iv5, targetValue$iv$iv$iv5, transitionSpec$iv$iv5.invoke(r12.getSegment(), $composer2, Integer.valueOf(($changed$iv$iv$iv5 >> 3) & 112)), typeConverter$iv$iv2, "LabelContentColor", $composer2, (($changed$iv$iv$iv5 & 14) | (($changed$iv$iv$iv5 << 9) & 57344)) | (($changed$iv$iv$iv5 << 6) & 458752));
        Composer $composer3 = $composer2;
        ComposerKt.sourceInformationMarkerEnd($composer3);
        ComposerKt.sourceInformationMarkerEnd($composer3);
        int r35 = 0 & 458752;
        ComposerKt.sourceInformationMarkerStart($composer3, -571896332, "CP(1,2)155@6472L107,172@7259L108:TextFieldImpl.kt#mqatfk");
        final float labelProgressValue = ((Number) labelProgress$iv.getValue()).floatValue();
        $composer3.startReplaceGroup(-156998101);
        ComposerKt.sourceInformation($composer3, "*138@5668L506");
        if (r83 != null) goto L456;
        final TextStyle bodyLarge2 = bodyLarge;
        final TextStyle bodySmall2 = bodySmall;
        float labelProgressValue2 = labelProgressValue;
        Function2 decoratedLabel = null;
    L457:
        $composer3.endReplaceGroup();
        final long placeholderColor = colors.m2785placeholderColorXeAY9LY$material3_release(enabled3, isError2, isFocused);
        ComposerKt.sourceInformationMarkerStart($composer3, -156971732, "CC(remember):TextFieldImpl.kt#9igjgp");
        Object value$iv2 = $composer3.rememberedValue();
        if (value$iv2 != Composer.Companion.getEmpty()) goto L461;
        value$iv2 = SnapshotStateKt.derivedStateOf(SnapshotStateKt.structuralEqualityPolicy(), new TextFieldImplKt$CommonDecorationBox$3$showPlaceholder$2$1(placeholderOpacity$iv));
        $composer3.updateRememberedValue(value$iv2);
    L461:
        State showPlaceholder$delegate = (State) value$iv2;
        ComposerKt.sourceInformationMarkerEnd($composer3);
        $composer3.startReplaceGroup(-156965270);
        ComposerKt.sourceInformation($composer3, "160@6765L362");
        if (r8 != 0) goto L464;
    L471:
        Function2<? super Composer, ? super Integer, Unit> r38 = r8;
        Function3 decoratedPlaceholder = null;
    L472:
        $composer3.endReplaceGroup();
        final long prefixColor = colors.m2786prefixColorXeAY9LY$material3_release(enabled3, isError2, isFocused);
        ComposerKt.sourceInformationMarkerStart($composer3, -156946547, "CC(remember):TextFieldImpl.kt#9igjgp");
        Function3 decoratedPlaceholder2 = decoratedPlaceholder;
        Object value$iv3 = $composer3.rememberedValue();
        if (value$iv3 != Composer.Companion.getEmpty()) goto L475;
        final State prefixSuffixAlpha = prefixSuffixOpacity$iv;
        value$iv3 = SnapshotStateKt.derivedStateOf(SnapshotStateKt.structuralEqualityPolicy(), new TextFieldImplKt$CommonDecorationBox$3$showPrefixSuffix$2$1(prefixSuffixAlpha));
        $composer3.updateRememberedValue(value$iv3);
    L476:
        State showPrefixSuffix$delegate = (State) value$iv3;
        ComposerKt.sourceInformationMarkerEnd($composer3);
        $composer3.startReplaceGroup(-156940524);
        ComposerKt.sourceInformation($composer3, "177@7507L341");
        if (r17 != null) goto L479;
    L481:
        Function2<? super Composer, ? super Integer, Unit> r65 = r17;
        ComposableLambda r36 = null;
    L482:
        $composer3.endReplaceGroup();
        final long suffixColor = colors.m2787suffixColorXeAY9LY$material3_release(enabled3, isError2, isFocused);
        $composer3.startReplaceGroup(-156921964);
        ComposerKt.sourceInformation($composer3, "191@8087L341");
        if (r18 != null) goto L485;
    L487:
        Function2<? super Composer, ? super Integer, Unit> r70 = r18;
        Function2 decoratedSuffix = null;
    L488:
        $composer3.endReplaceGroup();
        final long leadingIconColor = colors.m2784leadingIconColorXeAY9LY$material3_release(enabled3, isError2, isFocused);
        $composer3.startReplaceGroup(-156902962);
        ComposerKt.sourceInformation($composer3, "*205@8655L61");
        if (r10 != 0) goto L491;
        Function2 decoratedLeading = null;
    L492:
        $composer3.endReplaceGroup();
        Function2 decoratedLeading2 = decoratedLeading;
        final long trailingIconColor = colors.m2790trailingIconColorXeAY9LY$material3_release(enabled3, isError2, isFocused);
        $composer3.startReplaceGroup(-156893937);
        ComposerKt.sourceInformation($composer3, "*211@8937L62");
        if (r15 != null) goto L495;
        Function2 decoratedTrailing = null;
    L496:
        $composer3.endReplaceGroup();
        Function2 decoratedTrailing2 = decoratedTrailing;
        final long supportingTextColor = colors.m2788supportingTextColorXeAY9LY$material3_release(enabled3, isError2, isFocused);
        $composer3.startReplaceGroup(-156884470);
        ComposerKt.sourceInformation($composer3, "*217@9228L217");
        if (r33 != null) goto L499;
        Function2 decoratedSupporting = null;
    L500:
        $composer3.endReplaceGroup();
        switch(WhenMappings.$EnumSwitchMapping$0[type.ordinal()]) {
            case 1: goto L515;
            case 2: goto L503;
            default: goto L502;
        };
    L502:
        Composer $composer4 = $composer3;
        $composer4.startReplaceGroup(-565271199);
        $composer4.endReplaceGroup();
        Unit r37 = Unit.INSTANCE;
    L516:
        ComposerKt.sourceInformationMarkerEnd($composer4);
        ComposerKt.sourceInformationMarkerEnd($composer3);
        if (ComposerKt.isTraceInProgress() == false) goto L519;
        ComposerKt.traceEventEnd();
    L519:
        final Function2<? super Composer, ? super Integer, Unit> r39 = r15;
        final boolean singleLine3 = singleLine2;
        final Function2<? super Composer, ? super Integer, Unit> r115 = r33;
        final Function2<? super Composer, ? super Integer, Unit> r40 = r10;
        final Function2<? super Composer, ? super Integer, Unit> r41 = r65;
        final Function2<? super Composer, ? super Integer, Unit> r116 = r70;
        final boolean enabled4 = enabled3;
        final boolean isError3 = isError2;
        final Function2<? super Composer, ? super Integer, Unit> r42 = r38;
    L520:
        ScopeUpdateScope r0 = $composer3.endRestartGroup();
        if (r0 == null) goto L524;
        r0.updateScope(new AnonymousClass4(type, value, r81, visualTransformation, r83, r42, r40, r39, r41, r116, r115, singleLine3, enabled4, isError3, interactionSource, contentPadding, colors, r96, $changed, $changed1, r100));
        return;
    L524:
        return;
    L503:
        $composer3.startReplaceGroup(-567018607);
        ComposerKt.sourceInformation($composer3, "253@10659L38,254@10766L314,275@11639L463,264@11098L1286");
        ComposerKt.sourceInformationMarkerStart($composer3, -156837817, "CC(remember):TextFieldImpl.kt#9igjgp");
        Object it$iv7 = $composer3.rememberedValue();
        if (it$iv7 != Composer.Companion.getEmpty()) goto L506;
        Object value$iv4 = SnapshotStateKt.mutableStateOf$default(Size.m4182boximpl(Size.Companion.m4203getZeroNHjbRc()), null, 2, null);
        $composer3.updateRememberedValue(value$iv4);
    L507:
        final MutableState labelSize = (MutableState) value$iv4;
        ComposerKt.sourceInformationMarkerEnd($composer3);
        Function2 borderContainerWithId = ComposableLambdaKt.rememberComposableLambda(157291737, true, new TextFieldImplKt$CommonDecorationBox$3$borderContainerWithId$1(labelSize, contentPadding, r96), $composer3, 54);
        Modifier.Companion r117 = Modifier.Companion;
        ComposerKt.sourceInformationMarkerStart($composer3, -156806032, "CC(remember):TextFieldImpl.kt#9igjgp");
        final float labelProgressValue3 = labelProgressValue2;
        boolean invalid$iv2 = $composer3.changed(labelProgressValue3);
        Object it$iv8 = $composer3.rememberedValue();
        if (invalid$iv2 == false) goto L510;
    L513:
        Object value$iv5 = (Function1) new TextFieldImplKt$CommonDecorationBox$3$1$1(labelProgressValue3, labelSize);
        $composer3.updateRememberedValue(value$iv5);
    L514:
        ComposerKt.sourceInformationMarkerEnd($composer3);
        Function2 decoratedPrefix = r36;
        OutlinedTextFieldKt.OutlinedTextFieldLayout(r117, r13, decoratedPlaceholder2, decoratedLabel, decoratedLeading2, decoratedTrailing2, decoratedPrefix, decoratedSuffix, singleLine2, labelProgressValue3, (Function1) value$iv5, borderContainerWithId, decoratedSupporting, contentPadding, $composer3, ((($dirty8 >> 3) & 112) | 6) | (($dirty7 << 21) & 234881024), (($dirty7 >> 6) & 7168) | 48);
        $composer4 = $composer3;
        $composer4.endReplaceGroup();
        Unit r43 = Unit.INSTANCE;
        goto L516
    L510:
        if (it$iv8 == Composer.Companion.getEmpty()) goto L513;
        value$iv5 = it$iv8;
        goto L514
    L506:
        value$iv4 = it$iv7;
        goto L507
    L515:
        Function2 decoratedPrefix2 = r36;
        $composer4 = $composer3;
        $composer4.startReplaceGroup(-568105095);
        ComposerKt.sourceInformation($composer4, "228@9583L167,234@9768L769");
        Function2 containerWithId = ComposableLambdaKt.rememberComposableLambda(1750327932, true, new TextFieldImplKt$CommonDecorationBox$3$containerWithId$1(r96), $composer4, 54);
        TextFieldKt.TextFieldLayout(Modifier.Companion, r81, decoratedLabel, decoratedPlaceholder2, decoratedLeading2, decoratedTrailing2, decoratedPrefix2, decoratedSuffix, singleLine2, labelProgressValue2, containerWithId, decoratedSupporting, contentPadding, $composer4, ((($dirty8 >> 3) & 112) | 6) | (($dirty7 << 21) & 234881024), (($dirty7 >> 9) & 896) | 6);
        $composer4.endReplaceGroup();
        Unit r44 = Unit.INSTANCE;
        goto L516
    L499:
        final Function2<? super Composer, ? super Integer, Unit> r45 = r33;
        decoratedSupporting = ComposableLambdaKt.rememberComposableLambda(1263707005, true, new TextFieldImplKt$CommonDecorationBox$3$decoratedSupporting$1$1(supportingTextColor, bodySmall2, r45), $composer3, 54);
        goto L500
    L495:
        final Function2<? super Composer, ? super Integer, Unit> r46 = r15;
        decoratedTrailing = ComposableLambdaKt.rememberComposableLambda(2079816678, true, new TextFieldImplKt$CommonDecorationBox$3$decoratedTrailing$1$1(trailingIconColor, r46), $composer3, 54);
        goto L496
    L491:
        final Function2 it = r10;
        decoratedLeading = ComposableLambdaKt.rememberComposableLambda(-130107406, true, new TextFieldImplKt$CommonDecorationBox$3$decoratedLeading$1$1(leadingIconColor, it), $composer3, 54);
        goto L492
    L485:
        if (CommonDecorationBox$lambda$15$lambda$9(showPrefixSuffix$delegate) == false) goto L487;
        final TextStyle bodyLarge3 = bodyLarge2;
        final Function2<? super Composer, ? super Integer, Unit> r810 = r18;
        final State prefixSuffixAlpha2 = prefixSuffixAlpha;
        r70 = r810;
        decoratedSuffix = ComposableLambdaKt.rememberComposableLambda(-1526229403, true, new TextFieldImplKt$CommonDecorationBox$3$decoratedSuffix$1(prefixSuffixAlpha2, suffixColor, bodyLarge3, r810), $composer3, 54);
        goto L488
    L479:
        if (CommonDecorationBox$lambda$15$lambda$9(showPrefixSuffix$delegate) == false) goto L481;
        final TextStyle bodyLarge4 = bodyLarge2;
        final State prefixSuffixAlpha3 = prefixSuffixAlpha;
        final Function2<? super Composer, ? super Integer, Unit> r811 = r17;
        Function2<Composer, Integer, Unit> r47 = new TextFieldImplKt$CommonDecorationBox$3$decoratedPrefix$1(prefixSuffixAlpha3, prefixColor, bodyLarge4, r811);
        r65 = r811;
        bodyLarge2 = bodyLarge4;
        r36 = ComposableLambdaKt.rememberComposableLambda(274398694, true, r47, $composer3, 54);
        goto L482
    L475:
        prefixSuffixAlpha = prefixSuffixOpacity$iv;
        goto L476
    L464:
        if (transformedText.length() != 0) goto L466;
        boolean r48 = true;
    L467:
        if (r48 == false) goto L471;
        if (CommonDecorationBox$lambda$15$lambda$7(showPlaceholder$delegate) == false) goto L471;
        final TextStyle bodyLarge5 = bodyLarge2;
        final Function2<? super Composer, ? super Integer, Unit> r812 = r8;
        r38 = r812;
        bodyLarge2 = bodyLarge5;
        decoratedPlaceholder = ComposableLambdaKt.rememberComposableLambda(-660524084, true, new TextFieldImplKt$CommonDecorationBox$3$decoratedPlaceholder$1(placeholderOpacity$iv, placeholderColor, bodyLarge5, r812), $composer3, 54);
        goto L472
    L466:
        r48 = false;
        goto L467
    L456:
        bodyLarge2 = bodyLarge;
        bodySmall2 = bodySmall;
        labelProgressValue2 = labelProgressValue;
        decoratedLabel = ComposableLambdaKt.rememberComposableLambda(-1236585568, true, new TextFieldImplKt$CommonDecorationBox$3$decoratedLabel$1$1(bodyLarge2, bodySmall, labelProgressValue, labelContentColor$iv, r83, overrideLabelTextStyleColor2, labelTextStyleColor$iv), $composer3, 54);
    L438:
        value$iv$iv$iv2 = (TwoWayConverter) ColorVectorConverterKt.getVectorConverter(Color.Companion).invoke(colorSpace$iv$iv2);
        $composer2.updateRememberedValue(value$iv$iv$iv2);
        goto L439
    L420:
        r56 = unfocusedLabelTextStyleColor$iv;
        goto L422
    L409:
        r114 = unfocusedLabelTextStyleColor$iv;
    L401:
        value$iv$iv$iv = (TwoWayConverter) ColorVectorConverterKt.getVectorConverter(Color.Companion).invoke(colorSpace$iv$iv);
        $composer2.updateRememberedValue(value$iv$iv$iv);
        goto L402
    L390:
        r113 = unfocusedLabelTextStyleColor$iv;
        goto L392
    L376:
        if (showLabel$iv2 == false) goto L378;
        r112 = 0.0f;
        goto L381
    L378:
        r112 = 1.0f;
        goto L381
    L379:
        r112 = 1.0f;
        goto L381
    L374:
        throw new NoWhenBranchMatchedException();
    L360:
        if (showLabel$iv2 == false) goto L362;
        r28 = 0.0f;
        goto L365
    L362:
        r28 = 1.0f;
        goto L365
    L363:
        r28 = 1.0f;
        goto L365
    L358:
        throw new NoWhenBranchMatchedException();
    L344:
        if (showLabel$iv2 == false) goto L346;
        r26 = 0.0f;
        goto L349
    L346:
        r26 = 1.0f;
        goto L349
    L347:
        r26 = 1.0f;
        goto L349
    L342:
        throw new NoWhenBranchMatchedException();
    L328:
        if (showLabel$iv2 == false) goto L330;
        r24 = 0.0f;
        goto L333
    L330:
        r24 = 1.0f;
        goto L333
    L331:
        r24 = 1.0f;
        goto L333
    L326:
        throw new NoWhenBranchMatchedException();
    L314:
        r20 = 0.0f;
        goto L317
    L315:
        r20 = 1.0f;
        goto L317
    L312:
        throw new NoWhenBranchMatchedException();
    L300:
        r110 = 0.0f;
        goto L303
    L301:
        r110 = 1.0f;
        goto L303
    L298:
        throw new NoWhenBranchMatchedException();
    L290:
        showLabel$iv = false;
        goto L291
    L281:
        if ($this$CommonDecorationBox_u24lambda_u244 == 16) goto L283;
        boolean r210 = true;
    L284:
        if (r210 == false) goto L286;
        $this$CommonDecorationBox_u24lambda_u244 = $this$CommonDecorationBox_u24lambda_u244;
        goto L288
    L286:
        $this$CommonDecorationBox_u24lambda_u244 = labelColor;
        goto L288
    L283:
        r210 = false;
        goto L284
    L272:
        if ($this$CommonDecorationBox_u24lambda_u242 == 16) goto L274;
        boolean r211 = true;
    L275:
        if (r211 == false) goto L277;
        $this$CommonDecorationBox_u24lambda_u242 = $this$CommonDecorationBox_u24lambda_u242;
        goto L278
    L277:
        $this$CommonDecorationBox_u24lambda_u242 = labelColor;
        goto L278
    L274:
        r211 = false;
    L264:
        if (Color.m4367equalsimpl0(bodyLarge.m6447getColor0d7_KjU(), Color.Companion.m4402getUnspecified0d7_KjU()) == false) goto L266;
    L268:
        overrideLabelTextStyleColor = false;
        goto L269
    L266:
        if (Color.m4367equalsimpl0(bodySmall.m6447getColor0d7_KjU(), Color.Companion.m4402getUnspecified0d7_KjU()) == false) goto L268;
    L253:
        if (transformedText.length() != 0) goto L255;
        boolean r49 = true;
    L256:
        if (r49 == false) goto L258;
        inputState = InputPhase.UnfocusedEmpty;
        goto L259
    L258:
        inputState = InputPhase.UnfocusedNotEmpty;
        goto L259
    L255:
        r49 = false;
    L248:
        value$iv = visualTransformation.filter(new AnnotatedString(r12, null, null, 6, null));
        $composer2.updateRememberedValue(value$iv);
        goto L249
    L247:
        $dirty8 = $dirty;
        goto L248
    L240:
        r11 = false;
        goto L241
    L236:
        r9 = false;
        goto L238
    L228:
        isError2 = isError;
        goto L230
    L225:
        enabled2 = enabled;
        goto L226
    L222:
        singleLine2 = singleLine;
        goto L223
    L219:
        r33 = r89;
        goto L220
    L216:
        r18 = r88;
        goto L217
    L213:
        r17 = r87;
        goto L214
    L210:
        r15 = r86;
        goto L211
    L207:
        r10 = r85;
        goto L208
    L204:
        r8 = r84;
        goto L205
    L197:
        if ((4793491 & $dirty7) != 4793490) goto L202;
        if ($composer2.getSkipping() == false) goto L202;
        $composer2.skipToGroupEnd();
        r42 = r84;
        r40 = r85;
        r116 = r88;
        r115 = r89;
        singleLine3 = singleLine;
        enabled4 = enabled;
        isError3 = isError;
        $composer3 = $composer2;
        r39 = r86;
        r41 = r87;
        goto L520
    L189:
        if ((12582912 & $changed1) != 0) goto L194;
        if ($composer2.changedInstance(r96) == false) goto L193;
        r7 = 8388608;
        goto L187
    L193:
        r7 = 4194304;
        goto L187
    L179:
        if ((1572864 & $changed1) != 0) goto L185;
        if ($composer2.changed(colors) == false) goto L183;
        r6 = 1048576;
        goto L177
    L183:
        r6 = 524288;
        goto L177
    L169:
        if ((196608 & $changed1) != 0) goto L175;
        if ($composer2.changed(contentPadding) == false) goto L173;
        r5 = 131072;
        goto L167
    L173:
        r5 = 65536;
        goto L167
    L158:
        if (($changed1 & 24576) != 0) goto L165;
        if ($composer2.changed(interactionSource) == false) goto L162;
        int r50 = 16384;
    L163:
        $dirty1 = $dirty1 | r50;
        goto L165
    L162:
        r50 = 8192;
        goto L163
    L146:
        r23 = r4;
        if (($changed1 & 3072) != 0) goto L155;
        if ($composer2.changed(isError) == false) goto L151;
        int r212 = 2048;
    L152:
        $dirty1 = $dirty1 | r212;
        goto L155
    L151:
        r212 = 1024;
        goto L152
    L135:
        r22 = r3;
        if (($changed1 & 384) != 0) goto L143;
        if ($composer2.changed(enabled) == false) goto L140;
        int r213 = 256;
    L141:
        $dirty1 = $dirty1 | r213;
        goto L143
    L140:
        r213 = 128;
        goto L141
    L125:
        if (($changed1 & 48) != 0) goto L132;
        if ($composer2.changed(singleLine) == false) goto L129;
        int r214 = 32;
    L130:
        $dirty1 = $dirty1 | r214;
        goto L132
    L129:
        r214 = 16;
        goto L130
    L114:
        if (($changed1 & 6) != 0) goto L121;
        if ($composer2.changedInstance(r89) == false) goto L118;
        int r215 = 4;
    L119:
        $dirty1 = $dirty1 | r215;
        goto L121
    L118:
        r215 = 2;
        goto L119
    L103:
        if (($changed & 805306368) != 0) goto L110;
        if ($composer2.changedInstance(r88) == false) goto L107;
        int r216 = 536870912;
    L108:
        $dirty = $dirty | r216;
        goto L110
    L107:
        r216 = 268435456;
        goto L108
    L92:
        if (($changed & 100663296) != 0) goto L99;
        if ($composer2.changedInstance(r87) == false) goto L96;
        int r118 = AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
    L97:
        $dirty = $dirty | r118;
        goto L99
    L96:
        r118 = 33554432;
        goto L97
    L81:
        if (($changed & 12582912) != 0) goto L88;
        if ($composer2.changedInstance(r86) == false) goto L85;
        int r119 = 8388608;
    L86:
        $dirty = $dirty | r119;
        goto L88
    L85:
        r119 = 4194304;
        goto L86
    L70:
        if (($changed & 1572864) != 0) goto L77;
        if ($composer2.changedInstance(r85) == false) goto L74;
        int r120 = 1048576;
    L75:
        $dirty = $dirty | r120;
        goto L77
    L74:
        r120 = 524288;
        goto L75
    L59:
        if (($changed & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) != 0) goto L66;
        if ($composer2.changedInstance(r84) == false) goto L63;
        int r121 = 131072;
    L64:
        $dirty = $dirty | r121;
        goto L66
    L63:
        r121 = 65536;
        goto L64
    L49:
        if (($changed & 24576) != 0) goto L55;
        if ($composer2.changedInstance(r83) == false) goto L53;
        int r122 = 16384;
    L54:
        $dirty = $dirty | r122;
        goto L55
    L53:
        r122 = 8192;
        goto L54
    L39:
        if (($changed & 3072) != 0) goto L46;
        if ($composer2.changed(visualTransformation) == false) goto L43;
        int r123 = 2048;
    L44:
        $dirty = $dirty | r123;
        goto L46
    L43:
        r123 = 1024;
        goto L44
    L28:
        if (($changed & 384) != 0) goto L34;
        r13 = r81;
        if ($composer2.changedInstance(r13) == false) goto L32;
        int r124 = 256;
    L33:
        $dirty = $dirty | r124;
        goto L36
    L32:
        r124 = 128;
        goto L33
    L34:
        r13 = r81;
        goto L36
    L17:
        if (($changed & 48) != 0) goto L23;
        r12 = value;
        if ($composer2.changed(r12) == false) goto L21;
        int r125 = 32;
    L22:
        $dirty = $dirty | r125;
        goto L25
    L21:
        r125 = 16;
        goto L22
    L23:
        r12 = value;
        goto L25
    L6:
        if (($changed & 6) != 0) goto L14;
        if ($composer2.changed(type) == false) goto L10;
        int r126 = 4;
    L11:
        $dirty = $dirty | r126;
        goto L14
    L10:
        r126 = 2;
        goto L11
    }

    private static final boolean CommonDecorationBox$lambda$15$lambda$7(State<Boolean> r4) {
        Object thisObj$iv = r4.getValue();
        return ((Boolean) thisObj$iv).booleanValue();
    }

    private static final boolean CommonDecorationBox$lambda$15$lambda$9(State<Boolean> r4) {
        Object thisObj$iv = r4.getValue();
        return ((Boolean) thisObj$iv).booleanValue();
    }

    /* JADX INFO: renamed from: Decoration-3J-VO9M, reason: not valid java name */
    private static final void m3103Decoration3JVO9M(final long contentColor, final TextStyle textStyle, final Function2<? super Composer, ? super Integer, Unit> r16, Composer $composer, final int $changed) {
        Composer $composer2 = $composer.startRestartGroup(1208685580);
        ComposerKt.sourceInformation($composer2, "C(Decoration)P(1:c#ui.graphics.Color,2)298@12599L62:TextFieldImpl.kt#mqatfk");
        int $dirty = $changed;
        if (($changed & 6) != 0) goto L10;
        if ($composer2.changed(contentColor) == false) goto L7;
        int r2 = 4;
    L8:
        $dirty = $dirty | r2;
        goto L10
    L7:
        r2 = 2;
    L10:
        if (($changed & 48) != 0) goto L17;
        if ($composer2.changed(textStyle) == false) goto L14;
        int r3 = 32;
    L15:
        $dirty = $dirty | r3;
        goto L17
    L14:
        r3 = 16;
    L17:
        if (($changed & 384) != 0) goto L23;
        Function2<? super Composer, ? super Integer, Unit> r4 = r16;
        if ($composer2.changedInstance(r4) == false) goto L21;
        int r5 = 256;
    L22:
        $dirty = $dirty | r5;
    L24:
        int $dirty2 = $dirty;
        if (($dirty2 & 147) != 146) goto L31;
        if ($composer2.getSkipping() == false) goto L31;
        $composer2.skipToGroupEnd();
    L36:
        ScopeUpdateScope r6 = $composer2.endRestartGroup();
        if (r6 == null) goto L40;
        r6.updateScope(new TextFieldImplKt$Decoration$1(contentColor, textStyle, r16, $changed));
        return;
    L40:
        return;
    L31:
        if (ComposerKt.isTraceInProgress() == false) goto L33;
        ComposerKt.traceEventStart(1208685580, $dirty2, -1, "androidx.compose.material3.internal.Decoration (TextFieldImpl.kt:298)");
    L33:
        Function2<? super Composer, ? super Integer, Unit> r9 = r4;
        ProvideContentColorTextStyleKt.m3029ProvideContentColorTextStyle3JVO9M(contentColor, textStyle, r9, $composer2, (($dirty2 & 14) | ($dirty2 & 112)) | ($dirty2 & 896));
        if (ComposerKt.isTraceInProgress() == false) goto L36;
        ComposerKt.traceEventEnd();
        goto L36
    L21:
        r5 = 128;
        goto L22
    L23:
        r4 = r16;
        goto L24
    }

    /* JADX INFO: renamed from: Decoration-Iv8Zu3U, reason: not valid java name */
    private static final void m3104DecorationIv8Zu3U(final long contentColor, final Function2<? super Composer, ? super Integer, Unit> r6, Composer $composer, final int $changed) {
        Composer $composer2 = $composer.startRestartGroup(660142980);
        ComposerKt.sourceInformation($composer2, "C(Decoration)P(1:c#ui.graphics.Color)303@12806L84:TextFieldImpl.kt#mqatfk");
        int $dirty = $changed;
        if (($changed & 6) != 0) goto L10;
        if ($composer2.changed(contentColor) == false) goto L7;
        int r2 = 4;
    L8:
        $dirty = $dirty | r2;
        goto L10
    L7:
        r2 = 2;
    L10:
        if (($changed & 48) != 0) goto L17;
        if ($composer2.changedInstance(r6) == false) goto L14;
        int r3 = 32;
    L15:
        $dirty = $dirty | r3;
        goto L17
    L14:
        r3 = 16;
    L17:
        if (($dirty & 19) != 18) goto L23;
        if ($composer2.getSkipping() == false) goto L23;
        $composer2.skipToGroupEnd();
    L28:
        ScopeUpdateScope r0 = $composer2.endRestartGroup();
        if (r0 == null) goto L32;
        r0.updateScope(new TextFieldImplKt$Decoration$2(contentColor, r6, $changed));
        return;
    L32:
        return;
    L23:
        if (ComposerKt.isTraceInProgress() == false) goto L25;
        ComposerKt.traceEventStart(660142980, $dirty, -1, "androidx.compose.material3.internal.Decoration (TextFieldImpl.kt:303)");
    L25:
        CompositionLocalKt.CompositionLocalProvider(ContentColorKt.getLocalContentColor().provides(Color.m4356boximpl(contentColor)), r6, $composer2, ProvidedValue.$stable | ($dirty & 112));
        if (ComposerKt.isTraceInProgress() == false) goto L28;
        ComposerKt.traceEventEnd();
        goto L28
    }

    public static final Modifier defaultErrorSemantics(Modifier $this$defaultErrorSemantics, boolean isError, final String defaultErrorMessage) {
        if (isError == false) goto L5;
        return SemanticsModifierKt.semantics$default($this$defaultErrorSemantics, false, new AnonymousClass1(defaultErrorMessage), 1, null);
    L5:
        return $this$defaultErrorSemantics;
    }

    public static final Modifier textFieldBackground(Modifier $this$textFieldBackground, final ColorProducer color, final Shape shape) {
        return DrawModifierKt.drawWithCache($this$textFieldBackground, new C06031(shape, color));
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

    /* JADX INFO: renamed from: TextFieldTransitionScope-Jy8F4Js, reason: not valid java name */
    private static final void m3105TextFieldTransitionScopeJy8F4Js(InputPhase inputState, long focusedLabelTextStyleColor, long unfocusedLabelTextStyleColor, long labelColor, boolean showLabel, Function7<? super State<Float>, ? super State<Color>, ? super State<Color>, ? super State<Float>, ? super State<Float>, ? super Composer, ? super Integer, Unit> r39, Composer $composer, int $changed) {
        ComposerKt.sourceInformationMarkerStart($composer, -1087703202, "CC(TextFieldTransitionScope)P(2,1:c#ui.graphics.Color,5:c#ui.graphics.Color,3:c#ui.graphics.Color,4)349@14528L59,352@14632L334,364@15016L1126,394@16193L363,406@16607L318,418@17028L197,424@17231L150:TextFieldImpl.kt#mqatfk");
        Transition transition = TransitionKt.updateTransition(inputState, "TextFieldInputState", $composer, ($changed & 14) | 48, 0);
        Function3 transitionSpec$iv = TextFieldImplKt$TextFieldTransitionScope$labelProgress$1.INSTANCE;
        ComposerKt.sourceInformationMarkerStart($composer, -1338768149, "CC(animateFloat)P(2)1966@80444L78:Transition.kt#pdpnli");
        TwoWayConverter<Float, AnimationVector1D> r4 = VectorConvertersKt.getVectorConverter(FloatCompanionObject.INSTANCE);
        int $changed$iv$iv = (((384 & 14) | ((384 << 3) & 896)) | ((384 << 3) & 7168)) | ((384 << 3) & 57344);
        ComposerKt.sourceInformationMarkerStart($composer, -142660079, "CC(animateValue)P(3,2)1883@77007L32,1884@77062L31,1885@77118L23,1887@77154L89:Transition.kt#pdpnli");
        int $changed2 = ($changed$iv$iv >> 9) & 112;
        InputPhase it = (InputPhase) transition.getCurrentState();
        $composer.startReplaceGroup(-2036730335);
        ComposerKt.sourceInformation($composer, "C:TextFieldImpl.kt#mqatfk");
        if (ComposerKt.isTraceInProgress() == false) goto L6;
        ComposerKt.traceEventStart(-2036730335, $changed2, -1, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:356)");
    L6:
        float r27 = 0.0f;
        switch(WhenMappings.$EnumSwitchMapping$1[it.ordinal()]) {
            case 1: goto L12;
            case 2: goto L11;
            case 3: goto L10;
            default: goto L9;
        };
    L10:
        float r0 = 1.0f;
    L14:
        if (ComposerKt.isTraceInProgress() == false) goto L16;
        ComposerKt.traceEventEnd();
    L16:
        $composer.endReplaceGroup();
        Object initialValue$iv$iv = Float.valueOf(r0);
        int $changed3 = ($changed$iv$iv >> 9) & 112;
        InputPhase r1 = (InputPhase) r0.getTargetState();
        $composer.startReplaceGroup(-2036730335);
        ComposerKt.sourceInformation($composer, "C:TextFieldImpl.kt#mqatfk");
        if (ComposerKt.isTraceInProgress() == false) goto L21;
        ComposerKt.traceEventStart(-2036730335, $changed3, -1, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:356)");
    L21:
        switch(WhenMappings.$EnumSwitchMapping$1[r1.ordinal()]) {
            case 1: goto L26;
            case 2: goto L25;
            case 3: goto L24;
            default: goto L23;
        };
    L24:
        float r2 = 1.0f;
    L28:
        if (ComposerKt.isTraceInProgress() == false) goto L30;
        ComposerKt.traceEventEnd();
    L30:
        $composer.endReplaceGroup();
        Object targetValue$iv$iv = Float.valueOf(r2);
        State labelProgress = TransitionKt.createTransitionAnimation(transition, initialValue$iv$iv, targetValue$iv$iv, transitionSpec$iv.invoke(r0.getSegment(), $composer, Integer.valueOf(($changed$iv$iv >> 3) & 112)), r4, "LabelProgress", $composer, (($changed$iv$iv << 6) & 458752) | (($changed$iv$iv & 14) | (($changed$iv$iv << 9) & 57344)));
        ComposerKt.sourceInformationMarkerEnd($composer);
        ComposerKt.sourceInformationMarkerEnd($composer);
        Function3 transitionSpec$iv2 = TextFieldImplKt$TextFieldTransitionScope$placeholderOpacity$1.INSTANCE;
        ComposerKt.sourceInformationMarkerStart($composer, -1338768149, "CC(animateFloat)P(2)1966@80444L78:Transition.kt#pdpnli");
        TwoWayConverter<Float, AnimationVector1D> r5 = VectorConvertersKt.getVectorConverter(FloatCompanionObject.INSTANCE);
        int $changed$iv$iv2 = (((384 & 14) | ((384 << 3) & 896)) | ((384 << 3) & 7168)) | ((384 << 3) & 57344);
        ComposerKt.sourceInformationMarkerStart($composer, -142660079, "CC(animateValue)P(3,2)1883@77007L32,1884@77062L31,1885@77118L23,1887@77154L89:Transition.kt#pdpnli");
        int $changed4 = ($changed$iv$iv2 >> 9) & 112;
        InputPhase it2 = (InputPhase) transition.getCurrentState();
        $composer.startReplaceGroup(1435837472);
        ComposerKt.sourceInformation($composer, "C:TextFieldImpl.kt#mqatfk");
        if (ComposerKt.isTraceInProgress() == false) goto L35;
        ComposerKt.traceEventStart(1435837472, $changed4, -1, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:386)");
    L35:
        switch(WhenMappings.$EnumSwitchMapping$1[it2.ordinal()]) {
            case 1: goto L42;
            case 2: goto L39;
            case 3: goto L38;
            default: goto L37;
        };
    L38:
        float r3 = 0.0f;
    L44:
        if (ComposerKt.isTraceInProgress() == false) goto L46;
        ComposerKt.traceEventEnd();
    L46:
        $composer.endReplaceGroup();
        Object initialValue$iv$iv2 = Float.valueOf(r3);
        int $changed5 = ($changed$iv$iv2 >> 9) & 112;
        InputPhase r6 = (InputPhase) r0.getTargetState();
        $composer.startReplaceGroup(1435837472);
        ComposerKt.sourceInformation($composer, "C:TextFieldImpl.kt#mqatfk");
        if (ComposerKt.isTraceInProgress() == false) goto L51;
        ComposerKt.traceEventStart(1435837472, $changed5, -1, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:386)");
    L51:
        switch(WhenMappings.$EnumSwitchMapping$1[r6.ordinal()]) {
            case 1: goto L58;
            case 2: goto L55;
            case 3: goto L54;
            default: goto L53;
        };
    L54:
        float r7 = 0.0f;
    L60:
        if (ComposerKt.isTraceInProgress() == false) goto L62;
        ComposerKt.traceEventEnd();
    L62:
        $composer.endReplaceGroup();
        Object targetValue$iv$iv2 = Float.valueOf(r7);
        State placeholderOpacity = TransitionKt.createTransitionAnimation(transition, initialValue$iv$iv2, targetValue$iv$iv2, transitionSpec$iv2.invoke(r0.getSegment(), $composer, Integer.valueOf(($changed$iv$iv2 >> 3) & 112)), r5, "PlaceholderOpacity", $composer, (($changed$iv$iv2 & 14) | (($changed$iv$iv2 << 9) & 57344)) | (($changed$iv$iv2 << 6) & 458752));
        ComposerKt.sourceInformationMarkerEnd($composer);
        ComposerKt.sourceInformationMarkerEnd($composer);
        Function3 transitionSpec$iv3 = TextFieldImplKt$TextFieldTransitionScope$prefixSuffixOpacity$1.INSTANCE;
        ComposerKt.sourceInformationMarkerStart($composer, -1338768149, "CC(animateFloat)P(2)1966@80444L78:Transition.kt#pdpnli");
        TwoWayConverter<Float, AnimationVector1D> r8 = VectorConvertersKt.getVectorConverter(FloatCompanionObject.INSTANCE);
        int $changed$iv$iv3 = (((384 & 14) | ((384 << 3) & 896)) | ((384 << 3) & 7168)) | ((384 << 3) & 57344);
        ComposerKt.sourceInformationMarkerStart($composer, -142660079, "CC(animateValue)P(3,2)1883@77007L32,1884@77062L31,1885@77118L23,1887@77154L89:Transition.kt#pdpnli");
        int $changed6 = ($changed$iv$iv3 >> 9) & 112;
        InputPhase r9 = (InputPhase) transition.getCurrentState();
        $composer.startReplaceGroup(1128033978);
        ComposerKt.sourceInformation($composer, "C:TextFieldImpl.kt#mqatfk");
        if (ComposerKt.isTraceInProgress() == false) goto L67;
        ComposerKt.traceEventStart(1128033978, $changed6, -1, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:398)");
    L67:
        switch(WhenMappings.$EnumSwitchMapping$1[r9.ordinal()]) {
            case 1: goto L74;
            case 2: goto L71;
            case 3: goto L70;
            default: goto L69;
        };
    L70:
        float r10 = 1.0f;
    L76:
        if (ComposerKt.isTraceInProgress() == false) goto L78;
        ComposerKt.traceEventEnd();
    L78:
        $composer.endReplaceGroup();
        Object initialValue$iv$iv3 = Float.valueOf(r10);
        int $changed7 = ($changed$iv$iv3 >> 9) & 112;
        InputPhase r11 = (InputPhase) transition.getTargetState();
        $composer.startReplaceGroup(1128033978);
        ComposerKt.sourceInformation($composer, "C:TextFieldImpl.kt#mqatfk");
        if (ComposerKt.isTraceInProgress() == false) goto L83;
        ComposerKt.traceEventStart(1128033978, $changed7, -1, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:398)");
    L83:
        switch(WhenMappings.$EnumSwitchMapping$1[r11.ordinal()]) {
            case 1: goto L90;
            case 2: goto L87;
            case 3: goto L86;
            default: goto L85;
        };
    L86:
        r27 = 1.0f;
    L92:
        if (ComposerKt.isTraceInProgress() == false) goto L94;
        ComposerKt.traceEventEnd();
    L94:
        $composer.endReplaceGroup();
        Object targetValue$iv$iv3 = Float.valueOf(r27);
        State prefixSuffixOpacity = TransitionKt.createTransitionAnimation(transition, initialValue$iv$iv3, targetValue$iv$iv3, transitionSpec$iv3.invoke(transition.getSegment(), $composer, Integer.valueOf(($changed$iv$iv3 >> 3) & 112)), r8, "PrefixSuffixOpacity", $composer, (($changed$iv$iv3 & 14) | (($changed$iv$iv3 << 9) & 57344)) | (($changed$iv$iv3 << 6) & 458752));
        ComposerKt.sourceInformationMarkerEnd($composer);
        ComposerKt.sourceInformationMarkerEnd($composer);
        Function3 transitionSpec$iv4 = TextFieldImplKt$TextFieldTransitionScope$labelTextStyleColor$1.INSTANCE;
        ComposerKt.sourceInformationMarkerStart($composer, -1939694975, "CC(animateColor)P(2)68@3220L31,69@3287L70,73@3370L70:Transition.kt#xbi5r1");
        int $changed8 = (384 >> 6) & 112;
        InputPhase r12 = (InputPhase) transition.getTargetState();
        $composer.startReplaceGroup(-107432127);
        ComposerKt.sourceInformation($composer, "C:TextFieldImpl.kt#mqatfk");
        if (ComposerKt.isTraceInProgress() == false) goto L99;
        ComposerKt.traceEventStart(-107432127, $changed8, -1, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:410)");
    L99:
        if (WhenMappings.$EnumSwitchMapping$1[r12.ordinal()] != 1) goto L101;
        long r26 = focusedLabelTextStyleColor;
    L103:
        if (ComposerKt.isTraceInProgress() == false) goto L105;
        ComposerKt.traceEventEnd();
    L105:
        $composer.endReplaceGroup();
        ColorSpace colorSpace$iv = Color.m4370getColorSpaceimpl(r26);
        ComposerKt.sourceInformationMarkerStart($composer, 1918408083, "CC(remember):Transition.kt#9igjgp");
        boolean invalid$iv$iv = $composer.changed(colorSpace$iv);
        Object it$iv$iv = $composer.rememberedValue();
        if (invalid$iv$iv == true) goto L112;
        if (it$iv$iv == Composer.Companion.getEmpty()) goto L112;
        Object value$iv$iv = it$iv$iv;
    L113:
        TwoWayConverter typeConverter$iv = (TwoWayConverter) value$iv$iv;
        ComposerKt.sourceInformationMarkerEnd($composer);
        int $changed$iv$iv4 = (((384 & 14) | ((384 << 3) & 896)) | ((384 << 3) & 7168)) | ((384 << 3) & 57344);
        ComposerKt.sourceInformationMarkerStart($composer, -142660079, "CC(animateValue)P(3,2)1883@77007L32,1884@77062L31,1885@77118L23,1887@77154L89:Transition.kt#pdpnli");
        int $changed9 = ($changed$iv$iv4 >> 9) & 112;
        InputPhase it3 = (InputPhase) transition.getCurrentState();
        $composer.startReplaceGroup(-107432127);
        ComposerKt.sourceInformation($composer, "C:TextFieldImpl.kt#mqatfk");
        if (ComposerKt.isTraceInProgress() == false) goto L118;
        ComposerKt.traceEventStart(-107432127, $changed9, -1, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:410)");
    L118:
        if (WhenMappings.$EnumSwitchMapping$1[it3.ordinal()] != 1) goto L120;
        long r13 = focusedLabelTextStyleColor;
    L122:
        if (ComposerKt.isTraceInProgress() == false) goto L124;
        ComposerKt.traceEventEnd();
    L124:
        $composer.endReplaceGroup();
        Object initialValue$iv$iv4 = Color.m4356boximpl(r13);
        Object r14 = r3.getTargetState();
        int $changed10 = ($changed$iv$iv4 >> 9) & 112;
        InputPhase r15 = (InputPhase) r14;
        $composer.startReplaceGroup(-107432127);
        ComposerKt.sourceInformation($composer, "C:TextFieldImpl.kt#mqatfk");
        if (ComposerKt.isTraceInProgress() == false) goto L129;
        ComposerKt.traceEventStart(-107432127, $changed10, -1, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:410)");
    L129:
        if (WhenMappings.$EnumSwitchMapping$1[r15.ordinal()] != 1) goto L131;
        long r16 = focusedLabelTextStyleColor;
    L133:
        if (ComposerKt.isTraceInProgress() == false) goto L135;
        ComposerKt.traceEventEnd();
    L135:
        $composer.endReplaceGroup();
        Object targetValue$iv$iv4 = Color.m4356boximpl(r16);
        State labelTextStyleColor = TransitionKt.createTransitionAnimation(transition, initialValue$iv$iv4, targetValue$iv$iv4, transitionSpec$iv4.invoke(r3.getSegment(), $composer, Integer.valueOf(($changed$iv$iv4 >> 3) & 112)), typeConverter$iv, "LabelTextStyleColor", $composer, (($changed$iv$iv4 & 14) | (($changed$iv$iv4 << 9) & 57344)) | (($changed$iv$iv4 << 6) & 458752));
        ComposerKt.sourceInformationMarkerEnd($composer);
        ComposerKt.sourceInformationMarkerEnd($composer);
        Function3 transitionSpec$iv5 = TextFieldImplKt$TextFieldTransitionScope$labelContentColor$1.INSTANCE;
        ComposerKt.sourceInformationMarkerStart($composer, -1939694975, "CC(animateColor)P(2)68@3220L31,69@3287L70,73@3370L70:Transition.kt#xbi5r1");
        int $changed11 = (384 >> 6) & 112;
        InputPhase r17 = (InputPhase) transition.getTargetState();
        $composer.startReplaceGroup(1023351670);
        ComposerKt.sourceInformation($composer, "C:TextFieldImpl.kt#mqatfk");
        if (ComposerKt.isTraceInProgress() == false) goto L140;
        ComposerKt.traceEventStart(1023351670, $changed11, -1, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:421)");
    L140:
        if (ComposerKt.isTraceInProgress() == false) goto L142;
        ComposerKt.traceEventEnd();
    L142:
        $composer.endReplaceGroup();
        ColorSpace colorSpace$iv2 = Color.m4370getColorSpaceimpl(labelColor);
        ComposerKt.sourceInformationMarkerStart($composer, 1918408083, "CC(remember):Transition.kt#9igjgp");
        boolean invalid$iv$iv2 = $composer.changed(colorSpace$iv2);
        Object it$iv$iv2 = $composer.rememberedValue();
        if (invalid$iv$iv2 == true) goto L149;
        if (it$iv$iv2 == Composer.Companion.getEmpty()) goto L149;
        Object value$iv$iv2 = it$iv$iv2;
    L150:
        TwoWayConverter typeConverter$iv2 = (TwoWayConverter) value$iv$iv2;
        ComposerKt.sourceInformationMarkerEnd($composer);
        int $changed$iv$iv5 = (((384 & 14) | ((384 << 3) & 896)) | ((384 << 3) & 7168)) | ((384 << 3) & 57344);
        ComposerKt.sourceInformationMarkerStart($composer, -142660079, "CC(animateValue)P(3,2)1883@77007L32,1884@77062L31,1885@77118L23,1887@77154L89:Transition.kt#pdpnli");
        int $changed12 = ($changed$iv$iv5 >> 9) & 112;
        InputPhase r18 = (InputPhase) transition.getCurrentState();
        $composer.startReplaceGroup(1023351670);
        ComposerKt.sourceInformation($composer, "C:TextFieldImpl.kt#mqatfk");
        if (ComposerKt.isTraceInProgress() == false) goto L155;
        ComposerKt.traceEventStart(1023351670, $changed12, -1, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:421)");
    L155:
        if (ComposerKt.isTraceInProgress() == false) goto L157;
        ComposerKt.traceEventEnd();
    L157:
        $composer.endReplaceGroup();
        Object initialValue$iv$iv5 = Color.m4356boximpl(labelColor);
        int $changed13 = ($changed$iv$iv5 >> 9) & 112;
        InputPhase r19 = (InputPhase) r2.getTargetState();
        $composer.startReplaceGroup(1023351670);
        ComposerKt.sourceInformation($composer, "C:TextFieldImpl.kt#mqatfk");
        if (ComposerKt.isTraceInProgress() == false) goto L162;
        ComposerKt.traceEventStart(1023351670, $changed13, -1, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:421)");
    L162:
        if (ComposerKt.isTraceInProgress() == false) goto L164;
        ComposerKt.traceEventEnd();
    L164:
        $composer.endReplaceGroup();
        Object targetValue$iv$iv5 = Color.m4356boximpl(labelColor);
        State labelContentColor = TransitionKt.createTransitionAnimation(transition, initialValue$iv$iv5, targetValue$iv$iv5, transitionSpec$iv5.invoke(r2.getSegment(), $composer, Integer.valueOf(($changed$iv$iv5 >> 3) & 112)), typeConverter$iv2, "LabelContentColor", $composer, (($changed$iv$iv5 << 6) & 458752) | (($changed$iv$iv5 & 14) | (($changed$iv$iv5 << 9) & 57344)));
        ComposerKt.sourceInformationMarkerEnd($composer);
        ComposerKt.sourceInformationMarkerEnd($composer);
        r39.invoke(labelProgress, labelTextStyleColor, labelContentColor, placeholderOpacity, prefixSuffixOpacity, $composer, Integer.valueOf($changed & 458752));
        ComposerKt.sourceInformationMarkerEnd($composer);
        return;
    L149:
        value$iv$iv2 = (TwoWayConverter) ColorVectorConverterKt.getVectorConverter(Color.Companion).invoke(colorSpace$iv2);
        $composer.updateRememberedValue(value$iv$iv2);
        goto L150
    L131:
        r16 = unfocusedLabelTextStyleColor;
        goto L133
    L120:
        r13 = unfocusedLabelTextStyleColor;
    L112:
        value$iv$iv = (TwoWayConverter) ColorVectorConverterKt.getVectorConverter(Color.Companion).invoke(colorSpace$iv);
        $composer.updateRememberedValue(value$iv$iv);
        goto L113
    L101:
        r26 = unfocusedLabelTextStyleColor;
        goto L103
    L87:
        if (showLabel == true) goto L92;
        r27 = 1.0f;
        goto L92
    L90:
        r27 = 1.0f;
        goto L92
    L85:
        throw new NoWhenBranchMatchedException();
    L71:
        if (showLabel == false) goto L73;
        r10 = 0.0f;
        goto L76
    L73:
        r10 = 1.0f;
        goto L76
    L74:
        r10 = 1.0f;
        goto L76
    L69:
        throw new NoWhenBranchMatchedException();
    L55:
        if (showLabel == false) goto L57;
        r7 = 0.0f;
        goto L60
    L57:
        r7 = 1.0f;
        goto L60
    L58:
        r7 = 1.0f;
        goto L60
    L53:
        throw new NoWhenBranchMatchedException();
    L39:
        if (showLabel == false) goto L41;
        r3 = 0.0f;
        goto L44
    L41:
        r3 = 1.0f;
        goto L44
    L42:
        r3 = 1.0f;
        goto L44
    L37:
        throw new NoWhenBranchMatchedException();
    L25:
        r2 = 0.0f;
        goto L28
    L26:
        r2 = 1.0f;
        goto L28
    L23:
        throw new NoWhenBranchMatchedException();
    L11:
        r0 = 0.0f;
        goto L14
    L12:
        r0 = 1.0f;
        goto L14
    L9:
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: renamed from: animateBorderStrokeAsState-NuRrP5Q, reason: not valid java name */
    public static final State<BorderStroke> m3108animateBorderStrokeAsStateNuRrP5Q(boolean enabled, boolean isError, boolean focused, TextFieldColors colors, float focusedBorderThickness, float unfocusedBorderThickness, Composer $composer, int $changed) {
        Composer r6 = $composer;
        ComposerKt.sourceInformationMarkerStart(r6, 2047013045, "C(animateBorderStrokeAsState)P(1,4,2!1,3:c#ui.unit.Dp,5:c#ui.unit.Dp)458@18252L73:TextFieldImpl.kt#mqatfk");
        if (ComposerKt.isTraceInProgress() == false) goto L5;
        ComposerKt.traceEventStart(2047013045, $changed, -1, "androidx.compose.material3.internal.animateBorderStrokeAsState (TextFieldImpl.kt:441)");
    L5:
        long targetColor = colors.m2782indicatorColorXeAY9LY$material3_release(enabled, isError, focused);
        if (enabled == false) goto L8;
        r6.startReplaceGroup(1023053998);
        ComposerKt.sourceInformation(r6, "445@17754L84");
        int r13 = 0;
        State<Color> r4 = SingleValueAnimationKt.m112animateColorAsStateeuL9pac(targetColor, AnimationSpecKt.tween$default(150, 0, null, 6, null), null, null, $composer, 48, 12);
        r6 = $composer;
        r6.endReplaceGroup();
    L9:
        State<Color> r9 = r4;
        if (enabled == false) goto L16;
        r6.startReplaceGroup(1023269417);
        ComposerKt.sourceInformation(r6, "453@18068L85");
        if (focused == false) goto L14;
        float targetThickness = focusedBorderThickness;
    L15:
        State<Dp> r2 = AnimateAsStateKt.m124animateDpAsStateAjpBEmI(targetThickness, AnimationSpecKt.tween$default(150, r13, null, 6, null), null, null, r6, 48, 12);
        r6.endReplaceGroup();
    L17:
        State<BorderStroke> r3 = SnapshotStateKt.rememberUpdatedState(BorderStrokeKt.m261BorderStrokecXLIe8U(r2.getValue().m6987unboximpl(), r9.getValue().m4376unboximpl()), r6, r13);
        if (ComposerKt.isTraceInProgress() == false) goto L20;
        ComposerKt.traceEventEnd();
    L20:
        ComposerKt.sourceInformationMarkerEnd(r6);
        return r3;
    L14:
        targetThickness = unfocusedBorderThickness;
        goto L15
    L16:
        r6.startReplaceGroup(1023478388);
        ComposerKt.sourceInformation(r6, "455@18183L46");
        r2 = SnapshotStateKt.rememberUpdatedState(Dp.m6971boximpl(unfocusedBorderThickness), r6, ($changed >> 15) & 14);
        r6.endReplaceGroup();
        goto L17
    L8:
        r13 = 0;
        r6.startReplaceGroup(1023165505);
        ComposerKt.sourceInformation(r6, "447@17868L33");
        r4 = SnapshotStateKt.rememberUpdatedState(Color.m4356boximpl(targetColor), r6, 0);
        r6.endReplaceGroup();
        goto L9
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
        ZeroConstraints = ConstraintsKt.Constraints(0, 0, 0, 0);
        TextFieldPadding = Dp.m6973constructorimpl(16);
        HorizontalIconPadding = Dp.m6973constructorimpl(12);
        SupportingTopPadding = Dp.m6973constructorimpl(4);
        PrefixSuffixTextPadding = Dp.m6973constructorimpl(2);
        MinTextLineHeight = Dp.m6973constructorimpl(24);
        MinFocusedLabelLineHeight = Dp.m6973constructorimpl(16);
        MinSupportingTextLineHeight = Dp.m6973constructorimpl(16);
        IconDefaultSizeModifier = SizeKt.m756defaultMinSizeVpY3zN4(Modifier.Companion, Dp.m6973constructorimpl(48), Dp.m6973constructorimpl(48));
    }

    public static final long getZeroConstraints() {
        return ZeroConstraints;
    }

    public static final float getTextFieldPadding() {
        return TextFieldPadding;
    }

    public static final float getHorizontalIconPadding() {
        return HorizontalIconPadding;
    }

    public static final float getSupportingTopPadding() {
        return SupportingTopPadding;
    }

    public static final float getPrefixSuffixTextPadding() {
        return PrefixSuffixTextPadding;
    }

    public static final float getMinTextLineHeight() {
        return MinTextLineHeight;
    }

    public static final float getMinFocusedLabelLineHeight() {
        return MinFocusedLabelLineHeight;
    }

    public static final float getMinSupportingTextLineHeight() {
        return MinSupportingTextLineHeight;
    }

    public static final Modifier getIconDefaultSizeModifier() {
        return IconDefaultSizeModifier;
    }
}
