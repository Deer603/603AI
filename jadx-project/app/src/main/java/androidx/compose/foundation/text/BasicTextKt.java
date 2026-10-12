package androidx.compose.foundation.text;

import androidx.compose.foundation.text.modifiers.SelectableTextAnnotatedStringElement;
import androidx.compose.foundation.text.modifiers.SelectionController;
import androidx.compose.foundation.text.modifiers.TextAnnotatedStringElement;
import androidx.compose.foundation.text.modifiers.TextAnnotatedStringNode;
import androidx.compose.foundation.text.modifiers.TextAnnotatedStringNodeKt;
import androidx.compose.foundation.text.modifiers.TextStringSimpleElement;
import androidx.compose.foundation.text.selection.SelectionRegistrar;
import androidx.compose.foundation.text.selection.SelectionRegistrarKt;
import androidx.compose.foundation.text.selection.TextSelectionColors;
import androidx.compose.foundation.text.selection.TextSelectionColorsKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.saveable.RememberSaveableKt;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.runtime.saveable.SaverKt;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.graphics.ColorProducer;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.Placeholder;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.style.TextOverflow;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.IntOffset;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import androidx.profileinstaller.ProfileVerifier;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: BasicText.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000®\u0001\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0084\u0001\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\u0016\b\u0002\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\t2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00102\u0014\b\u0002\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00150\u0013H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0016\u0010\u0017\u001a\u0090\u0001\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\u0016\b\u0002\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\t2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00102\u0014\b\u0002\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00150\u00132\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0007ø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u001b\u001a\u009c\u0001\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\u0016\b\u0002\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\t2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00102\u0014\b\u0002\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00150\u00132\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00192\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0007ø\u0001\u0000¢\u0006\u0004\b\u001e\u0010\u001f\u001az\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\u0016\b\u0002\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\t2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\u0014\b\u0002\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00150\u0013H\u0007ø\u0001\u0000¢\u0006\u0004\b \u0010!\u001ad\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00142\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\u0016\b\u0002\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\t2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u0010H\u0007ø\u0001\u0000¢\u0006\u0004\b\"\u0010#\u001an\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00142\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\u0016\b\u0002\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\t2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u0010H\u0007ø\u0001\u0000¢\u0006\u0004\b \u0010$\u001az\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00142\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\u0016\b\u0002\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\t2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00102\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0016\u0010%\u001a\u0086\u0001\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00142\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\u0016\b\u0002\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\t2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00102\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00192\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0007ø\u0001\u0000¢\u0006\u0004\b\u001a\u0010&\u001aº\u0001\u0010'\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0002\u001a\u00020\u00032\u0014\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\t2\u0006\u0010(\u001a\u00020\u000e2\u0014\b\u0002\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00150\u00132\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010)\u001a\u00020*2\b\u0010+\u001a\u0004\u0018\u00010,2\b\u0010\u0018\u001a\u0004\u0018\u00010\u00192\u0014\u0010-\u001a\u0010\u0012\u0004\u0012\u00020.\u0012\u0004\u0012\u00020\u0001\u0018\u00010\t2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0003ø\u0001\u0000¢\u0006\u0004\b/\u00100\u001a@\u00101\u001a\u001e\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u000204\u0012\f\u0012\n\u0012\u0004\u0012\u000206\u0018\u00010503\u0018\u0001022\f\u00107\u001a\b\u0012\u0004\u0012\u000208022\f\u00109\u001a\b\u0012\u0004\u0012\u00020\u000e05H\u0002\u001a\u001e\u0010:\u001a\u000e\u0012\u0004\u0012\u00020<\u0012\u0004\u0012\u00020<0;2\b\u0010=\u001a\u0004\u0018\u00010>H\u0002\u001aÌ\u0001\u0010?\u001a\u00020\u0005*\u00020\u00052\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00072\u0014\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\t2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010)\u001a\u00020*2\u0014\u0010@\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020B0A\u0018\u0001022\u001c\u0010C\u001a\u0018\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010D02\u0012\u0004\u0012\u00020\u0001\u0018\u00010\t2\b\u0010+\u001a\u0004\u0018\u00010,2\b\u0010\u0018\u001a\u0004\u0018\u00010\u00192\u0014\u0010-\u001a\u0010\u0012\u0004\u0012\u00020.\u0012\u0004\u0012\u00020\u0001\u0018\u00010\t2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0002ø\u0001\u0000¢\u0006\u0004\bE\u0010F\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006G²\u0006\n\u0010H\u001a\u00020\u0003X\u008a\u008e\u0002"}, d2 = {"BasicText", "", "text", "Landroidx/compose/ui/text/AnnotatedString;", "modifier", "Landroidx/compose/ui/Modifier;", "style", "Landroidx/compose/ui/text/TextStyle;", "onTextLayout", "Lkotlin/Function1;", "Landroidx/compose/ui/text/TextLayoutResult;", "overflow", "Landroidx/compose/ui/text/style/TextOverflow;", "softWrap", "", "maxLines", "", "minLines", "inlineContent", "", "", "Landroidx/compose/foundation/text/InlineTextContent;", "BasicText-VhcvRP8", "(Landroidx/compose/ui/text/AnnotatedString;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/text/TextStyle;Lkotlin/jvm/functions/Function1;IZIILjava/util/Map;Landroidx/compose/runtime/Composer;II)V", "color", "Landroidx/compose/ui/graphics/ColorProducer;", "BasicText-RWo7tUw", "(Landroidx/compose/ui/text/AnnotatedString;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/text/TextStyle;Lkotlin/jvm/functions/Function1;IZIILjava/util/Map;Landroidx/compose/ui/graphics/ColorProducer;Landroidx/compose/runtime/Composer;II)V", "autoSize", "Landroidx/compose/foundation/text/TextAutoSize;", "BasicText-CL7eQgs", "(Landroidx/compose/ui/text/AnnotatedString;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/text/TextStyle;Lkotlin/jvm/functions/Function1;IZIILjava/util/Map;Landroidx/compose/ui/graphics/ColorProducer;Landroidx/compose/foundation/text/TextAutoSize;Landroidx/compose/runtime/Composer;III)V", "BasicText-4YKlhWE", "(Landroidx/compose/ui/text/AnnotatedString;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/text/TextStyle;Lkotlin/jvm/functions/Function1;IZILjava/util/Map;Landroidx/compose/runtime/Composer;II)V", "BasicText-BpD7jsM", "(Ljava/lang/String;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/text/TextStyle;Lkotlin/jvm/functions/Function1;IZILandroidx/compose/runtime/Composer;II)V", "(Ljava/lang/String;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/text/TextStyle;Lkotlin/jvm/functions/Function1;IZIILandroidx/compose/runtime/Composer;II)V", "(Ljava/lang/String;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/text/TextStyle;Lkotlin/jvm/functions/Function1;IZIILandroidx/compose/ui/graphics/ColorProducer;Landroidx/compose/runtime/Composer;II)V", "(Ljava/lang/String;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/text/TextStyle;Lkotlin/jvm/functions/Function1;IZIILandroidx/compose/ui/graphics/ColorProducer;Landroidx/compose/foundation/text/TextAutoSize;Landroidx/compose/runtime/Composer;II)V", "LayoutWithLinksAndInlineContent", "hasInlineContent", "fontFamilyResolver", "Landroidx/compose/ui/text/font/FontFamily$Resolver;", "selectionController", "Landroidx/compose/foundation/text/modifiers/SelectionController;", "onShowTranslation", "Landroidx/compose/foundation/text/modifiers/TextAnnotatedStringNode$TextSubstitutionValue;", "LayoutWithLinksAndInlineContent-11Od_4g", "(Landroidx/compose/ui/Modifier;Landroidx/compose/ui/text/AnnotatedString;Lkotlin/jvm/functions/Function1;ZLjava/util/Map;Landroidx/compose/ui/text/TextStyle;IZIILandroidx/compose/ui/text/font/FontFamily$Resolver;Landroidx/compose/foundation/text/modifiers/SelectionController;Landroidx/compose/ui/graphics/ColorProducer;Lkotlin/jvm/functions/Function1;Landroidx/compose/foundation/text/TextAutoSize;Landroidx/compose/runtime/Composer;III)V", "measureWithTextRangeMeasureConstraints", "", "Lkotlin/Pair;", "Landroidx/compose/ui/layout/Placeable;", "Lkotlin/Function0;", "Landroidx/compose/ui/unit/IntOffset;", "measurables", "Landroidx/compose/ui/layout/Measurable;", "shouldMeasureLinks", "selectionIdSaver", "Landroidx/compose/runtime/saveable/Saver;", "", "selectionRegistrar", "Landroidx/compose/foundation/text/selection/SelectionRegistrar;", "textModifier", "placeholders", "Landroidx/compose/ui/text/AnnotatedString$Range;", "Landroidx/compose/ui/text/Placeholder;", "onPlaceholderLayout", "Landroidx/compose/ui/geometry/Rect;", "textModifier-CL7eQgs", "(Landroidx/compose/ui/Modifier;Landroidx/compose/ui/text/AnnotatedString;Landroidx/compose/ui/text/TextStyle;Lkotlin/jvm/functions/Function1;IZIILandroidx/compose/ui/text/font/FontFamily$Resolver;Ljava/util/List;Lkotlin/jvm/functions/Function1;Landroidx/compose/foundation/text/modifiers/SelectionController;Landroidx/compose/ui/graphics/ColorProducer;Lkotlin/jvm/functions/Function1;Landroidx/compose/foundation/text/TextAutoSize;)Landroidx/compose/ui/Modifier;", "foundation_release", "displayedText"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class BasicTextKt {
    public static final /* synthetic */ void access$BasicText_CL7eQgs$lambda$6(MutableState $displayedText$delegate, AnnotatedString value) {
        BasicText_CL7eQgs$lambda$6($displayedText$delegate, value);
    }

    /* JADX INFO: renamed from: access$LayoutWithLinksAndInlineContent-11Od_4g, reason: not valid java name */
    public static final /* synthetic */ void m1037access$LayoutWithLinksAndInlineContent11Od_4g(Modifier modifier, AnnotatedString text, Function1 onTextLayout, boolean hasInlineContent, Map inlineContent, TextStyle style, int overflow, boolean softWrap, int maxLines, int minLines, FontFamily.Resolver fontFamilyResolver, SelectionController selectionController, ColorProducer color, Function1 onShowTranslation, TextAutoSize autoSize, Composer $composer, int $changed, int $changed1, int $default) {
        m1036LayoutWithLinksAndInlineContent11Od_4g(modifier, text, onTextLayout, hasInlineContent, inlineContent, style, overflow, softWrap, maxLines, minLines, fontFamilyResolver, selectionController, color, onShowTranslation, autoSize, $composer, $changed, $changed1, $default);
    }

    public static final /* synthetic */ List access$measureWithTextRangeMeasureConstraints(List measurables, Function0 shouldMeasureLinks) {
        return measureWithTextRangeMeasureConstraints(measurables, shouldMeasureLinks);
    }

    /* JADX INFO: renamed from: BasicText-RWo7tUw, reason: not valid java name */
    public static final void m1033BasicTextRWo7tUw(final String text, Modifier modifier, TextStyle style, Function1<? super TextLayoutResult, Unit> r42, int overflow, boolean softWrap, int maxLines, int minLines, ColorProducer color, TextAutoSize autoSize, Composer $composer, final int $changed, final int r51) {
        Composer $composer2 = $composer.startRestartGroup(-1040751001);
        ComposerKt.sourceInformation($composer2, "C(BasicText)P(9,4,8,5,6:c#ui.text.style.TextOverflow,7,2,3,1)103@5400L7,148@7222L41:BasicText.kt#423gt5");
        int $dirty = $changed;
        if ((r51 & 1) == 0) goto L6;
        $dirty = $dirty | 6;
    L12:
        int r5 = r51 & 2;
        if (r5 == 0) goto L16;
        $dirty = $dirty | 48;
        Modifier modifier2 = modifier;
    L23:
        int r8 = r51 & 4;
        if (r8 == 0) goto L27;
        $dirty = $dirty | 384;
        TextStyle r9 = style;
    L34:
        int r10 = r51 & 8;
        if (r10 == 0) goto L38;
        $dirty = $dirty | 3072;
        Function1<? super TextLayoutResult, Unit> r13 = r42;
    L45:
        int r14 = r51 & 16;
        if (r14 == 0) goto L49;
        $dirty = $dirty | 24576;
        int r15 = overflow;
    L56:
        int r16 = r51 & 32;
        if (r16 == 0) goto L60;
        $dirty = $dirty | ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
        final boolean softWrap2 = softWrap;
    L67:
        int r17 = r51 & 64;
        if (r17 == 0) goto L71;
        $dirty = $dirty | 1572864;
    L78:
        int r1 = r51 & 128;
        if (r1 == 0) goto L82;
        $dirty = $dirty | 12582912;
    L89:
        int minLines2 = r51 & 256;
        if (minLines2 == 0) goto L93;
        $dirty = $dirty | 100663296;
    L100:
        int minLines3 = r51 & 512;
        int r21 = 805306368;
        if (minLines3 == 0) goto L104;
    L102:
        $dirty = $dirty | r21;
    L113:
        if (($dirty & 306783379) == 306783378) goto L115;
        boolean r0 = true;
    L117:
        if ($composer2.shouldExecute(r0, $dirty & 1) == false) goto L194;
        if (r5 == 0) goto L120;
        modifier2 = Modifier.Companion;
    L120:
        if (r8 == 0) goto L122;
        TextStyle style2 = TextStyle.Companion.getDefault();
    L123:
        if (r10 == 0) goto L125;
        Function1<? super TextLayoutResult, Unit> r25 = null;
    L126:
        if (r14 == 0) goto L128;
        int overflow2 = TextOverflow.Companion.m6886getClipgIe3tQ8();
    L129:
        if (r16 == 0) goto L131;
        boolean softWrap3 = true;
    L132:
        if (r17 == 0) goto L134;
        int maxLines2 = Integer.MAX_VALUE;
    L135:
        if (r1 == 0) goto L137;
        int minLines4 = 1;
    L138:
        if (minLines2 == 0) goto L140;
        ColorProducer color2 = null;
    L141:
        if (minLines3 == 0) goto L143;
        TextAutoSize autoSize2 = null;
    L145:
        if (ComposerKt.isTraceInProgress() == false) goto L147;
        ComposerKt.traceEventStart(-1040751001, $dirty, -1, "androidx.compose.foundation.text.BasicText (BasicText.kt:101)");
    L147:
        HeightInLinesModifierKt.validateMinMaxLines(minLines4, maxLines2);
        ProvidableCompositionLocal<SelectionRegistrar> r6 = SelectionRegistrarKt.getLocalSelectionRegistrar();
        ComposerKt.sourceInformationMarkerStart($composer2, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
        Object r18 = $composer2.consume(r6);
        ComposerKt.sourceInformationMarkerEnd($composer2);
        final SelectionRegistrar selectionRegistrar = (SelectionRegistrar) r18;
        if (selectionRegistrar == null) goto L166;
        $composer2.startReplaceGroup(-1588802442);
        ComposerKt.sourceInformation($composer2, "106@5548L7,108@5702L77,108@5619L160,111@5792L180");
        ProvidableCompositionLocal<TextSelectionColors> r11 = TextSelectionColorsKt.getLocalTextSelectionColors();
        ComposerKt.sourceInformationMarkerStart($composer2, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
        Object r19 = $composer2.consume(r11);
        ComposerKt.sourceInformationMarkerEnd($composer2);
        long backgroundSelectionColor = ((TextSelectionColors) r19).m1512getBackgroundColor0d7_KjU();
        Object[] r12 = {selectionRegistrar};
        Saver<Long, Long> r110 = selectionIdSaver(selectionRegistrar);
        ComposerKt.sourceInformationMarkerStart($composer2, -328339615, "CC(remember):BasicText.kt#9igjgp");
        boolean invalid$iv = $composer2.changedInstance(selectionRegistrar);
        Object it$iv = $composer2.rememberedValue();
        if (invalid$iv == true) goto L155;
        int maxLines3 = maxLines2;
        if (it$iv != Composer.Companion.getEmpty()) goto L157;
    L156:
        Object value$iv = (Function0) new BasicTextKt$BasicText$selectionController$selectableId$1$1(selectionRegistrar);
        $composer2.updateRememberedValue(value$iv);
        it$iv = value$iv;
    L157:
        ComposerKt.sourceInformationMarkerEnd($composer2);
        Composer $composer3 = $composer2;
        long selectableId = ((Number) RememberSaveableKt.m3923rememberSaveable(r12, r110, null, (Function0) it$iv, $composer2, 0, 4)).longValue();
        ComposerKt.sourceInformationMarkerStart($composer3, -328336632, "CC(remember):BasicText.kt#9igjgp");
        boolean invalid$iv2 = ($composer3.changed(selectableId) | $composer3.changed(selectionRegistrar)) | $composer3.changed(backgroundSelectionColor);
        Object it$iv2 = $composer3.rememberedValue();
        if (invalid$iv2 == true) goto L164;
        if (it$iv2 == Composer.Companion.getEmpty()) goto L164;
        SelectionRegistrar selectionRegistrar2 = selectionRegistrar;
    L165:
        ComposerKt.sourceInformationMarkerEnd($composer3);
        $composer3.endReplaceGroup();
        SelectionController selectionController = (SelectionController) it$iv2;
    L168:
        if (selectionController != null) goto L174;
        if (r25 != null) goto L174;
        if (autoSize2 != null) goto L174;
        $composer3.startReplaceGroup(-1587511974);
        ComposerKt.sourceInformation($composer3, "140@6983L7");
        ProvidableCompositionLocal<FontFamily.Resolver> r7 = CompositionLocalsKt.getLocalFontFamilyResolver();
        ComposerKt.sourceInformationMarkerStart($composer3, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
        Object r20 = $composer3.consume(r7);
        ComposerKt.sourceInformationMarkerEnd($composer3);
        int minLines5 = minLines4;
        minLines4 = minLines5;
        Modifier finalModifier = modifier2.then(new TextStringSimpleElement(text, style2, (FontFamily.Resolver) r20, overflow2, softWrap3, maxLines3, minLines5, color2, null));
        $composer3.endReplaceGroup();
        Modifier modifier3 = modifier2;
    L175:
        MeasurePolicy measurePolicy$iv = EmptyMeasurePolicy.INSTANCE;
        ComposerKt.sourceInformationMarkerStart($composer3, 544976794, "CC(Layout)P(1)121@4798L23,124@4949L333:Layout.kt#80mrfh");
        int compositeKeyHash$iv = ComposablesKt.getCurrentCompositeKeyHash($composer3, 0);
        Modifier materialized$iv = ComposedModifierKt.materializeModifier($composer3, finalModifier);
        CompositionLocalMap localMap$iv = $composer3.getCurrentCompositionLocalMap();
        Function0<ComposeUiNode> r111 = ComposeUiNode.Companion.getConstructor();
        ComposerKt.sourceInformationMarkerStart($composer3, 1405779621, "CC(ReusableComposeNode):Composables.kt#9igjgp");
        if (($composer3.getApplier() instanceof Applier) == true) goto L178;
        ComposablesKt.invalidApplier();
    L178:
        $composer3.startReusableNode();
        if ($composer3.getInserting() == false) goto L181;
        $composer3.createNode(r111);
    L182:
        Composer $this$Layout_u24lambda_u241$iv = Updater.m3808constructorimpl($composer3);
        Updater.m3815setimpl($this$Layout_u24lambda_u241$iv, measurePolicy$iv, ComposeUiNode.Companion.getSetMeasurePolicy());
        Updater.m3815setimpl($this$Layout_u24lambda_u241$iv, localMap$iv, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
        Updater.m3815setimpl($this$Layout_u24lambda_u241$iv, materialized$iv, ComposeUiNode.Companion.getSetModifier());
        Function2<ComposeUiNode, Integer, Unit> r2 = ComposeUiNode.Companion.getSetCompositeKeyHash();
        if ($this$Layout_u24lambda_u241$iv.getInserting() == true) goto L188;
        Composer $composer4 = $composer3;
        if (Intrinsics.areEqual($this$Layout_u24lambda_u241$iv.rememberedValue(), Integer.valueOf(compositeKeyHash$iv)) == true) goto L190;
    L189:
        $this$Layout_u24lambda_u241$iv.updateRememberedValue(Integer.valueOf(compositeKeyHash$iv));
        $this$Layout_u24lambda_u241$iv.apply(Integer.valueOf(compositeKeyHash$iv), r2);
    L190:
        $composer4.endNode();
        ComposerKt.sourceInformationMarkerEnd($composer4);
        ComposerKt.sourceInformationMarkerEnd($composer4);
        if (ComposerKt.isTraceInProgress() == false) goto L193;
        ComposerKt.traceEventEnd();
    L193:
        final Modifier modifier4 = modifier3;
        final TextStyle style3 = style2;
        final Function1<? super TextLayoutResult, Unit> r4 = r25;
        final int overflow3 = overflow2;
        softWrap2 = softWrap3;
        final int maxLines4 = maxLines3;
        final int minLines6 = minLines4;
        final ColorProducer color3 = color2;
        final TextAutoSize autoSize3 = autoSize2;
    L195:
        ScopeUpdateScope r112 = $composer4.endRestartGroup();
        if (r112 == null) goto L199;
        r112.updateScope(new BasicTextKt$BasicText$1(text, modifier4, style3, r4, overflow3, softWrap2, maxLines4, minLines6, color3, autoSize3, $changed, r51));
        return;
    L199:
        return;
    L188:
        $composer4 = $composer3;
        goto L189
    L181:
        $composer3.useNode();
    L174:
        $composer3.startReplaceGroup(-1588155131);
        ComposerKt.sourceInformation($composer3, "127@6494L7");
        AnnotatedString r3 = new AnnotatedString(text, null, 2, null);
        ProvidableCompositionLocal<FontFamily.Resolver> r22 = CompositionLocalsKt.getLocalFontFamilyResolver();
        ComposerKt.sourceInformationMarkerStart($composer3, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
        Object r23 = $composer3.consume(r22);
        ComposerKt.sourceInformationMarkerEnd($composer3);
        modifier3 = modifier2;
        finalModifier = m1038textModifierCL7eQgs(modifier3, r3, style2, r25, overflow2, softWrap3, maxLines3, minLines4, (FontFamily.Resolver) r23, null, null, selectionController, color2, null, autoSize2);
        $composer3.endReplaceGroup();
    L164:
        Object value$iv2 = new SelectionController(selectableId, selectionRegistrar, backgroundSelectionColor, null, 8, null);
        selectionRegistrar2 = selectionRegistrar;
        $composer3.updateRememberedValue(value$iv2);
        it$iv2 = value$iv2;
        goto L165
    L155:
        maxLines3 = maxLines2;
        goto L156
    L166:
        maxLines3 = maxLines2;
        $composer3 = $composer2;
        selectionRegistrar2 = selectionRegistrar;
        $composer3.startReplaceGroup(-1588311278);
        $composer3.endReplaceGroup();
        selectionController = null;
        goto L168
    L143:
        autoSize2 = autoSize;
        goto L145
    L140:
        color2 = color;
        goto L141
    L137:
        minLines4 = minLines;
        goto L138
    L134:
        maxLines2 = maxLines;
        goto L135
    L131:
        softWrap3 = softWrap2;
        goto L132
    L128:
        overflow2 = r15;
        goto L129
    L125:
        r25 = r13;
        goto L126
    L122:
        style2 = r9;
        goto L123
    L194:
        $composer4 = $composer2;
        $composer4.skipToGroupEnd();
        minLines6 = minLines;
        autoSize3 = autoSize;
        modifier4 = modifier2;
        style3 = r9;
        r4 = r13;
        overflow3 = r15;
        maxLines4 = maxLines;
        color3 = color;
        goto L195
    L115:
        r0 = false;
        goto L117
    L104:
        if (($changed & 805306368) != 0) goto L113;
        if (($changed & 1073741824) != 0) goto L108;
        boolean r24 = $composer2.changed(autoSize);
    L109:
        if (r24 == false) goto L111;
        r21 = 536870912;
        goto L102
    L111:
        r21 = 268435456;
        goto L102
    L108:
        r24 = $composer2.changedInstance(autoSize);
        goto L109
    L93:
        if (($changed & 100663296) != 0) goto L100;
        if ($composer2.changedInstance(color) == false) goto L97;
        int r26 = AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
    L98:
        $dirty = $dirty | r26;
        goto L100
    L97:
        r26 = 33554432;
        goto L98
    L82:
        if (($changed & 12582912) != 0) goto L89;
        if ($composer2.changed(minLines) == false) goto L86;
        int r27 = 8388608;
    L87:
        $dirty = $dirty | r27;
        goto L89
    L86:
        r27 = 4194304;
        goto L87
    L71:
        if (($changed & 1572864) != 0) goto L78;
        if ($composer2.changed(maxLines) == false) goto L75;
        int r113 = 1048576;
    L76:
        $dirty = $dirty | r113;
        goto L78
    L75:
        r113 = 524288;
        goto L76
    L60:
        if (($changed & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) != 0) goto L66;
        softWrap2 = softWrap;
        if ($composer2.changed(softWrap2) == false) goto L64;
        int r114 = 131072;
    L65:
        $dirty = $dirty | r114;
        goto L67
    L64:
        r114 = 65536;
        goto L65
    L66:
        softWrap2 = softWrap;
        goto L67
    L49:
        if (($changed & 24576) != 0) goto L55;
        r15 = overflow;
        if ($composer2.changed(r15) == false) goto L53;
        int r115 = 16384;
    L54:
        $dirty = $dirty | r115;
        goto L56
    L53:
        r115 = 8192;
        goto L54
    L55:
        r15 = overflow;
        goto L56
    L38:
        if (($changed & 3072) != 0) goto L44;
        r13 = r42;
        if ($composer2.changedInstance(r13) == false) goto L42;
        int r116 = 2048;
    L43:
        $dirty = $dirty | r116;
        goto L45
    L42:
        r116 = 1024;
        goto L43
    L44:
        r13 = r42;
        goto L45
    L27:
        if (($changed & 384) != 0) goto L33;
        r9 = style;
        if ($composer2.changed(r9) == false) goto L31;
        int r117 = 256;
    L32:
        $dirty = $dirty | r117;
        goto L34
    L31:
        r117 = 128;
        goto L32
    L33:
        r9 = style;
        goto L34
    L16:
        if (($changed & 48) != 0) goto L22;
        modifier2 = modifier;
        if ($composer2.changed(modifier2) == false) goto L20;
        int r28 = 32;
    L21:
        $dirty = $dirty | r28;
        goto L23
    L20:
        r28 = 16;
        goto L21
    L22:
        modifier2 = modifier;
        goto L23
    L6:
        if (($changed & 6) != 0) goto L12;
        if ($composer2.changed(text) == false) goto L10;
        int r29 = 4;
    L11:
        $dirty = $dirty | r29;
        goto L12
    L10:
        r29 = 2;
        goto L11
    }

    /* JADX INFO: renamed from: BasicText-CL7eQgs, reason: not valid java name */
    public static final void m1031BasicTextCL7eQgs(AnnotatedString text, Modifier modifier, TextStyle style, Function1<? super TextLayoutResult, Unit> r43, int overflow, boolean softWrap, int maxLines, int minLines, Map<String, InlineTextContent> r48, ColorProducer color, TextAutoSize autoSize, Composer $composer, final int $changed, final int $changed1, final int r54) {
        Composer $composer2 = $composer.startRestartGroup(-1343466571);
        ComposerKt.sourceInformation($composer2, "C(BasicText)P(10,5,9,6,7:c#ui.text.style.TextOverflow,8,3,4,2,1)196@10069L7:BasicText.kt#423gt5");
        int $dirty = $changed;
        int $dirty1 = $changed1;
        if ((r54 & 1) == 0) goto L6;
        $dirty = $dirty | 6;
    L12:
        int r7 = r54 & 2;
        if (r7 == 0) goto L16;
        $dirty = $dirty | 48;
        Modifier r10 = modifier;
    L23:
        int r11 = r54 & 4;
        if (r11 == 0) goto L27;
        $dirty = $dirty | 384;
        TextStyle r12 = style;
    L34:
        int r13 = r54 & 8;
        if (r13 == 0) goto L38;
        $dirty = $dirty | 3072;
        Function1<? super TextLayoutResult, Unit> r14 = r43;
    L45:
        int r16 = r54 & 16;
        if (r16 == 0) goto L49;
        $dirty = $dirty | 24576;
        int r8 = overflow;
    L56:
        int r17 = r54 & 32;
        if (r17 == 0) goto L60;
        $dirty = $dirty | ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
    L67:
        int r19 = r54 & 64;
        if (r19 == 0) goto L71;
        $dirty = $dirty | 1572864;
    L78:
        int overflow2 = r54 & 128;
        if (overflow2 == 0) goto L82;
        $dirty = $dirty | 12582912;
    L89:
        int overflow3 = r54 & 256;
        if (overflow3 == 0) goto L93;
        $dirty = $dirty | 100663296;
    L100:
        int overflow4 = r54 & 512;
        if (overflow4 == 0) goto L104;
        $dirty = $dirty | 805306368;
    L111:
        int overflow5 = r54 & 1024;
        if (overflow5 == 0) goto L115;
        $dirty1 = $dirty1 | 6;
    L125:
        if (($dirty & 306783379) == 306783378) goto L127;
    L130:
        boolean r0 = true;
    L132:
        if ($composer2.shouldExecute(r0, $dirty & 1) == false) goto L228;
        if (r7 == 0) goto L135;
        Modifier.Companion modifier2 = Modifier.Companion;
    L136:
        if (r11 == 0) goto L138;
        TextStyle style2 = TextStyle.Companion.getDefault();
    L139:
        if (r13 == 0) goto L141;
        Function1<? super TextLayoutResult, Unit> r3 = null;
    L142:
        if (r16 == 0) goto L144;
        int overflow6 = TextOverflow.Companion.m6886getClipgIe3tQ8();
    L145:
        if (r17 == 0) goto L147;
        boolean softWrap2 = true;
    L148:
        if (r19 == 0) goto L150;
        int maxLines2 = Integer.MAX_VALUE;
    L151:
        if (overflow2 == 0) goto L153;
        int minLines2 = 1;
    L154:
        if (overflow3 == 0) goto L156;
        Map<String, InlineTextContent> r20 = MapsKt.emptyMap();
    L157:
        if (overflow4 == 0) goto L159;
        ColorProducer color2 = null;
    L160:
        if (overflow5 == 0) goto L162;
        TextAutoSize autoSize2 = null;
    L164:
        if (ComposerKt.isTraceInProgress() == false) goto L166;
        ComposerKt.traceEventStart(-1343466571, $dirty, $dirty1, "androidx.compose.foundation.text.BasicText (BasicText.kt:194)");
    L166:
        HeightInLinesModifierKt.validateMinMaxLines(minLines2, maxLines2);
        ProvidableCompositionLocal<SelectionRegistrar> r9 = SelectionRegistrarKt.getLocalSelectionRegistrar();
        Modifier modifier3 = modifier2;
        ComposerKt.sourceInformationMarkerStart($composer2, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
        Object r110 = $composer2.consume(r9);
        ComposerKt.sourceInformationMarkerEnd($composer2);
        final SelectionRegistrar selectionRegistrar = (SelectionRegistrar) r110;
        if (selectionRegistrar == null) goto L185;
        $composer2.startReplaceGroup(-1584170794);
        ComposerKt.sourceInformation($composer2, "199@10217L7,201@10371L77,201@10288L160,204@10461L180");
        ProvidableCompositionLocal<TextSelectionColors> r15 = TextSelectionColorsKt.getLocalTextSelectionColors();
        ComposerKt.sourceInformationMarkerStart($composer2, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
        Object r1 = $composer2.consume(r15);
        ComposerKt.sourceInformationMarkerEnd($composer2);
        long backgroundSelectionColor = ((TextSelectionColors) r1).m1512getBackgroundColor0d7_KjU();
        Object[] r18 = {selectionRegistrar};
        Saver<Long, Long> r111 = selectionIdSaver(selectionRegistrar);
        ComposerKt.sourceInformationMarkerStart($composer2, -328190207, "CC(remember):BasicText.kt#9igjgp");
        boolean invalid$iv = $composer2.changedInstance(selectionRegistrar);
        Object value$iv = $composer2.rememberedValue();
        if (invalid$iv == true) goto L174;
        Composer $composer3 = $composer2;
        if (value$iv != Composer.Companion.getEmpty()) goto L176;
    L175:
        value$iv = (Function0) new BasicTextKt$BasicText$selectionController$selectableId$2$1(selectionRegistrar);
        $composer2.updateRememberedValue(value$iv);
    L176:
        ComposerKt.sourceInformationMarkerEnd($composer3);
        Composer $composer4 = $composer3;
        $composer2 = $composer4;
        long selectableId = ((Number) RememberSaveableKt.m3923rememberSaveable(r18, r111, null, (Function0) value$iv, $composer4, 0, 4)).longValue();
        ComposerKt.sourceInformationMarkerStart($composer2, -328187224, "CC(remember):BasicText.kt#9igjgp");
        boolean invalid$iv2 = ($composer2.changed(selectableId) | $composer2.changed(selectionRegistrar)) | $composer2.changed(backgroundSelectionColor);
        Object it$iv = $composer2.rememberedValue();
        if (invalid$iv2 == true) goto L183;
        if (it$iv == Composer.Companion.getEmpty()) goto L183;
    L184:
        ComposerKt.sourceInformationMarkerEnd($composer2);
        $composer2.endReplaceGroup();
        SelectionController selectionController = (SelectionController) it$iv;
    L186:
        int $dirty2 = $dirty;
        Function1<? super TextLayoutResult, Unit> r4 = r3;
        boolean hasInlineContent = AnnotatedStringResolveInlineContentKt.hasInlineContent(text);
        boolean hasLinks = TextAnnotatedStringNodeKt.hasLinks(text);
        if (hasInlineContent == true) goto L205;
        if (hasLinks == true) goto L205;
        $composer2.startReplaceGroup(-1583500636);
        ComposerKt.sourceInformation($composer2, "224@11307L7,214@10891L757");
        ProvidableCompositionLocal<FontFamily.Resolver> r2 = CompositionLocalsKt.getLocalFontFamilyResolver();
        ComposerKt.sourceInformationMarkerStart($composer2, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
        Object r5 = $composer2.consume(r2);
        ComposerKt.sourceInformationMarkerEnd($composer2);
        boolean softWrap3 = softWrap2;
        final AnnotatedString r6 = text;
        Composer $composer5 = $composer2;
        int maxLines3 = maxLines2;
        Modifier modifier$iv = m1038textModifierCL7eQgs(modifier3, r6, style2, r4, overflow6, softWrap3, maxLines3, minLines2, (FontFamily.Resolver) r5, null, null, selectionController, color2, null, autoSize2);
        MeasurePolicy measurePolicy$iv = EmptyMeasurePolicy.INSTANCE;
        ComposerKt.sourceInformationMarkerStart($composer5, 544976794, "CC(Layout)P(1)121@4798L23,124@4949L333:Layout.kt#80mrfh");
        int compositeKeyHash$iv = ComposablesKt.getCurrentCompositeKeyHash($composer5, 0);
        Modifier materialized$iv = ComposedModifierKt.materializeModifier($composer5, modifier$iv);
        CompositionLocalMap localMap$iv = $composer5.getCurrentCompositionLocalMap();
        Function0<ComposeUiNode> r112 = ComposeUiNode.Companion.getConstructor();
        ComposerKt.sourceInformationMarkerStart($composer5, 1405779621, "CC(ReusableComposeNode):Composables.kt#9igjgp");
        if (($composer5.getApplier() instanceof Applier) == true) goto L192;
        ComposablesKt.invalidApplier();
    L192:
        $composer5.startReusableNode();
        if ($composer5.getInserting() == false) goto L195;
        $composer5.createNode(r112);
    L196:
        Composer $this$Layout_u24lambda_u241$iv = Updater.m3808constructorimpl($composer5);
        Updater.m3815setimpl($this$Layout_u24lambda_u241$iv, measurePolicy$iv, ComposeUiNode.Companion.getSetMeasurePolicy());
        Updater.m3815setimpl($this$Layout_u24lambda_u241$iv, localMap$iv, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
        Updater.m3815setimpl($this$Layout_u24lambda_u241$iv, materialized$iv, ComposeUiNode.Companion.getSetModifier());
        Function2<ComposeUiNode, Integer, Unit> r21 = ComposeUiNode.Companion.getSetCompositeKeyHash();
        if ($this$Layout_u24lambda_u241$iv.getInserting() == true) goto L203;
        if (Intrinsics.areEqual($this$Layout_u24lambda_u241$iv.rememberedValue(), Integer.valueOf(compositeKeyHash$iv)) == false) goto L203;
    L204:
        $composer5.endNode();
        ComposerKt.sourceInformationMarkerEnd($composer5);
        ComposerKt.sourceInformationMarkerEnd($composer5);
        $composer5.endReplaceGroup();
        Function1<? super TextLayoutResult, Unit> r22 = r4;
        Composer $composer6 = $composer5;
    L225:
        if (ComposerKt.isTraceInProgress() == false) goto L227;
        ComposerKt.traceEventEnd();
    L227:
        final Function1<? super TextLayoutResult, Unit> r23 = r22;
        final int minLines3 = minLines2;
        final ColorProducer color3 = color2;
        final TextAutoSize autoSize3 = autoSize2;
        final Modifier modifier4 = modifier3;
        final Map<String, InlineTextContent> r24 = r20;
        final TextStyle style3 = style2;
        final int overflow7 = overflow6;
        final int minLines4 = maxLines3;
        final boolean softWrap4 = softWrap3;
    L229:
        ScopeUpdateScope r113 = $composer6.endRestartGroup();
        if (r113 == null) goto L233;
        r113.updateScope(new BasicTextKt$BasicText$3(r6, modifier4, style3, r23, overflow7, softWrap4, minLines4, minLines3, r24, color3, autoSize3, $changed, $changed1, r54));
        return;
    L233:
        return;
    L203:
        $this$Layout_u24lambda_u241$iv.updateRememberedValue(Integer.valueOf(compositeKeyHash$iv));
        $this$Layout_u24lambda_u241$iv.apply(Integer.valueOf(compositeKeyHash$iv), r21);
        goto L204
    L195:
        $composer5.useNode();
    L205:
        r6 = text;
        Composer $composer7 = $composer2;
        maxLines3 = maxLines2;
        softWrap3 = softWrap2;
        int $dirty3 = $dirty1;
        SelectionController selectionController2 = selectionController;
        $composer7.startReplaceGroup(-1582650709);
        ComposerKt.sourceInformation($composer7, "237@11821L39,250@12319L7,253@12442L292,239@11870L907");
        ComposerKt.sourceInformationMarkerStart($composer7, -328143845, "CC(remember):BasicText.kt#9igjgp");
        if (($dirty2 & 14) != 4) goto L208;
        boolean invalid$iv3 = true;
    L209:
        Object it$iv2 = $composer7.rememberedValue();
        if (invalid$iv3 == false) goto L212;
    L215:
        Object value$iv2 = SnapshotStateKt.mutableStateOf$default(r6, null, 2, null);
        $composer7.updateRememberedValue(value$iv2);
        it$iv2 = value$iv2;
    L216:
        final MutableState displayedText$delegate = (MutableState) it$iv2;
        ComposerKt.sourceInformationMarkerEnd($composer7);
        AnnotatedString r114 = BasicText_CL7eQgs$lambda$5(displayedText$delegate);
        ProvidableCompositionLocal<FontFamily.Resolver> r25 = CompositionLocalsKt.getLocalFontFamilyResolver();
        ComposerKt.sourceInformationMarkerStart($composer7, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
        Object r26 = $composer7.consume(r25);
        ComposerKt.sourceInformationMarkerEnd($composer7);
        FontFamily.Resolver r27 = (FontFamily.Resolver) r26;
        ComposerKt.sourceInformationMarkerStart($composer7, -328123720, "CC(remember):BasicText.kt#9igjgp");
        boolean invalid$iv4 = $composer7.changed(displayedText$delegate);
        Object it$iv3 = $composer7.rememberedValue();
        if (invalid$iv4 == false) goto L219;
    L222:
        Object value$iv3 = (Function1) new BasicTextKt$BasicText$2$1(displayedText$delegate);
        $composer7.updateRememberedValue(value$iv3);
        it$iv3 = value$iv3;
    L223:
        ComposerKt.sourceInformationMarkerEnd($composer7);
        $composer6 = $composer7;
        m1036LayoutWithLinksAndInlineContent11Od_4g(modifier3, r114, r4, hasInlineContent, r20, style2, overflow6, softWrap3, maxLines3, minLines2, r27, selectionController2, color2, (Function1) it$iv3, autoSize2, $composer6, (((((((($dirty2 >> 3) & 14) | (($dirty2 >> 3) & 896)) | (($dirty2 >> 12) & 57344)) | (($dirty2 << 9) & 458752)) | (($dirty2 << 6) & 3670016)) | (($dirty2 << 6) & 29360128)) | (($dirty2 << 6) & 234881024)) | (($dirty2 << 6) & 1879048192), (($dirty2 >> 21) & 896) | (($dirty3 << 12) & 57344), 0);
        r22 = r4;
        modifier3 = modifier3;
        $composer6.endReplaceGroup();
        goto L225
    L219:
        if (it$iv3 != Composer.Companion.getEmpty()) goto L223;
    L212:
        if (it$iv2 != Composer.Companion.getEmpty()) goto L216;
    L208:
        invalid$iv3 = false;
    L183:
        Object value$iv4 = new SelectionController(selectableId, selectionRegistrar, backgroundSelectionColor, null, 8, null);
        $composer2.updateRememberedValue(value$iv4);
        it$iv = value$iv4;
        goto L184
    L174:
        $composer3 = $composer2;
        goto L175
    L185:
        $composer2.startReplaceGroup(-1583679630);
        $composer2.endReplaceGroup();
        selectionController = null;
        goto L186
    L162:
        autoSize2 = autoSize;
        goto L164
    L159:
        color2 = color;
        goto L160
    L156:
        r20 = r48;
        goto L157
    L153:
        minLines2 = minLines;
        goto L154
    L150:
        maxLines2 = maxLines;
        goto L151
    L147:
        softWrap2 = softWrap;
        goto L148
    L144:
        overflow6 = r8;
        goto L145
    L141:
        r3 = r14;
        goto L142
    L138:
        style2 = r12;
        goto L139
    L135:
        modifier2 = r10;
        goto L136
    L228:
        r6 = text;
        $composer6 = $composer2;
        $composer6.skipToGroupEnd();
        softWrap4 = softWrap;
        minLines4 = maxLines;
        r24 = r48;
        autoSize3 = autoSize;
        overflow7 = r8;
        modifier4 = r10;
        style3 = r12;
        r23 = r14;
        minLines3 = minLines;
        color3 = color;
        goto L229
    L127:
        if (($dirty1 & 3) != 2) goto L130;
        r0 = false;
        goto L132
    L115:
        if (($changed1 & 6) != 0) goto L125;
        if (($changed1 & 8) != 0) goto L119;
        boolean r28 = $composer2.changed(autoSize);
    L120:
        if (r28 == false) goto L122;
        int r29 = 4;
    L123:
        $dirty1 = $dirty1 | r29;
        goto L125
    L122:
        r29 = 2;
        goto L123
    L119:
        r28 = $composer2.changedInstance(autoSize);
        goto L120
    L104:
        if (($changed & 805306368) != 0) goto L111;
        if ($composer2.changedInstance(color) == false) goto L108;
        int r210 = 536870912;
    L109:
        $dirty = $dirty | r210;
        goto L111
    L108:
        r210 = 268435456;
        goto L109
    L93:
        if (($changed & 100663296) != 0) goto L100;
        if ($composer2.changedInstance(r48) == false) goto L97;
        int r211 = AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
    L98:
        $dirty = $dirty | r211;
        goto L100
    L97:
        r211 = 33554432;
        goto L98
    L82:
        if (($changed & 12582912) != 0) goto L89;
        if ($composer2.changed(minLines) == false) goto L86;
        int r212 = 8388608;
    L87:
        $dirty = $dirty | r212;
        goto L89
    L86:
        r212 = 4194304;
        goto L87
    L71:
        if (($changed & 1572864) != 0) goto L78;
        if ($composer2.changed(maxLines) == false) goto L75;
        int r213 = 1048576;
    L76:
        $dirty = $dirty | r213;
        goto L78
    L75:
        r213 = 524288;
        goto L76
    L60:
        if (($changed & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) != 0) goto L67;
        if ($composer2.changed(softWrap) == false) goto L64;
        int r115 = 131072;
    L65:
        $dirty = $dirty | r115;
        goto L67
    L64:
        r115 = 65536;
        goto L65
    L49:
        if (($changed & 24576) != 0) goto L55;
        r8 = overflow;
        if ($composer2.changed(r8) == false) goto L53;
        int r116 = 16384;
    L54:
        $dirty = $dirty | r116;
        goto L56
    L53:
        r116 = 8192;
        goto L54
    L55:
        r8 = overflow;
        goto L56
    L38:
        if (($changed & 3072) != 0) goto L44;
        r14 = r43;
        if ($composer2.changedInstance(r14) == false) goto L42;
        int r117 = 2048;
    L43:
        $dirty = $dirty | r117;
        goto L45
    L42:
        r117 = 1024;
        goto L43
    L44:
        r14 = r43;
        goto L45
    L27:
        if (($changed & 384) != 0) goto L33;
        r12 = style;
        if ($composer2.changed(r12) == false) goto L31;
        int r118 = 256;
    L32:
        $dirty = $dirty | r118;
        goto L34
    L31:
        r118 = 128;
        goto L32
    L33:
        r12 = style;
        goto L34
    L16:
        if (($changed & 48) != 0) goto L22;
        r10 = modifier;
        if ($composer2.changed(r10) == false) goto L20;
        int r119 = 32;
    L21:
        $dirty = $dirty | r119;
        goto L23
    L20:
        r119 = 16;
        goto L21
    L22:
        r10 = modifier;
        goto L23
    L6:
        if (($changed & 6) != 0) goto L12;
        if ($composer2.changed(text) == false) goto L10;
        int r30 = 4;
    L11:
        $dirty = $dirty | r30;
        goto L12
    L10:
        r30 = 2;
        goto L11
    }

    private static final AnnotatedString BasicText_CL7eQgs$lambda$5(MutableState<AnnotatedString> r4) {
        MutableState<AnnotatedString> $this$getValue$iv = r4;
        return $this$getValue$iv.getValue();
    }

    private static final void BasicText_CL7eQgs$lambda$6(MutableState<AnnotatedString> r4, AnnotatedString value) {
        r4.setValue(value);
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Maintained for binary compatibility")
    /* JADX INFO: renamed from: BasicText-VhcvRP8, reason: not valid java name */
    public static final /* synthetic */ void m1035BasicTextVhcvRP8(final String text, Modifier modifier, TextStyle style, Function1 onTextLayout, int overflow, boolean softWrap, int maxLines, int minLines, ColorProducer color, Composer $composer, final int $changed, final int r37) {
        Composer $composer2 = $composer.startRestartGroup(-1186827822);
        ComposerKt.sourceInformation($composer2, "C(BasicText)P(8,3,7,4,5:c#ui.text.style.TextOverflow,6,1,2)302@14843L93:BasicText.kt#423gt5");
        int $dirty = $changed;
        if ((r37 & 1) == 0) goto L6;
        $dirty = $dirty | 6;
        String r12 = text;
    L13:
        int r3 = r37 & 2;
        if (r3 == 0) goto L17;
        $dirty = $dirty | 48;
        Modifier modifier2 = modifier;
    L24:
        int r5 = r37 & 4;
        if (r5 == 0) goto L28;
        $dirty = $dirty | 384;
        TextStyle r6 = style;
    L35:
        int r7 = r37 & 8;
        if (r7 == 0) goto L39;
        $dirty = $dirty | 3072;
        Function1 onTextLayout2 = onTextLayout;
    L46:
        int r9 = r37 & 16;
        if (r9 == 0) goto L50;
        $dirty = $dirty | 24576;
    L57:
        int r14 = r37 & 32;
        if (r14 == 0) goto L61;
        $dirty = $dirty | ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
    L68:
        int r16 = r37 & 64;
        if (r16 == 0) goto L72;
        $dirty = $dirty | 1572864;
    L79:
        int r0 = r37 & 128;
        if (r0 == 0) goto L83;
        $dirty = $dirty | 12582912;
    L90:
        int r1 = r37 & 256;
        if (r1 == 0) goto L94;
        $dirty = $dirty | 100663296;
    L102:
        if (($dirty & 38347923) == 38347922) goto L104;
        boolean r2 = true;
    L106:
        if ($composer2.shouldExecute(r2, $dirty & 1) == false) goto L138;
        if (r3 == 0) goto L109;
        Modifier modifier3 = Modifier.Companion;
    L110:
        if (r5 == 0) goto L112;
        TextStyle style2 = TextStyle.Companion.getDefault();
        int r4 = r14;
    L113:
        if (r7 == 0) goto L115;
        Function1 onTextLayout3 = null;
    L116:
        if (r9 == 0) goto L118;
        int overflow2 = TextOverflow.Companion.m6886getClipgIe3tQ8();
        int overflow3 = r16;
    L119:
        if (r4 == 0) goto L121;
        boolean softWrap2 = true;
        int r8 = -1186827822;
    L122:
        if (overflow3 == 0) goto L124;
        int maxLines2 = Integer.MAX_VALUE;
        int maxLines3 = r0;
    L125:
        if (maxLines3 == 0) goto L127;
        int minLines2 = 1;
        int minLines3 = r1;
    L128:
        if (minLines3 == 0) goto L130;
        ColorProducer color2 = null;
    L132:
        if (ComposerKt.isTraceInProgress() == false) goto L134;
        ComposerKt.traceEventStart(r8, $dirty, -1, "androidx.compose.foundation.text.BasicText (BasicText.kt:301)");
    L134:
        Composer $composer3 = $composer2;
        m1033BasicTextRWo7tUw(r12, modifier3, style2, onTextLayout3, overflow2, softWrap2, maxLines2, minLines2, color2, null, $composer3, (((((((($dirty & 14) | ($dirty & 112)) | ($dirty & 896)) | ($dirty & 7168)) | (57344 & $dirty)) | (458752 & $dirty)) | (3670016 & $dirty)) | (29360128 & $dirty)) | (234881024 & $dirty), 512);
        if (ComposerKt.isTraceInProgress() == false) goto L137;
        ComposerKt.traceEventEnd();
    L137:
        modifier2 = modifier3;
        final TextStyle style3 = style2;
        onTextLayout2 = onTextLayout3;
        final int overflow4 = overflow2;
        final boolean softWrap3 = softWrap2;
        final int maxLines4 = maxLines2;
        final ColorProducer color3 = color2;
    L139:
        ScopeUpdateScope r13 = $composer3.endRestartGroup();
        if (r13 == null) goto L143;
        final Modifier modifier4 = modifier2;
        final Function1 onTextLayout4 = onTextLayout2;
        final int minLines4 = minLines2;
        r13.updateScope(new BasicTextKt$BasicText$4(text, modifier4, style3, onTextLayout4, overflow4, softWrap3, maxLines4, minLines4, color3, $changed, r37));
        return;
    L143:
        return;
    L130:
        color2 = color;
        goto L132
    L127:
        minLines3 = r1;
        minLines2 = minLines;
        goto L128
    L124:
        maxLines3 = r0;
        maxLines2 = maxLines;
        goto L125
    L121:
        softWrap2 = softWrap;
        r8 = -1186827822;
        goto L122
    L118:
        overflow3 = r16;
        overflow2 = overflow;
        goto L119
    L115:
        onTextLayout3 = onTextLayout2;
        goto L116
    L112:
        r4 = r14;
        style2 = r6;
        goto L113
    L109:
        modifier3 = modifier2;
        goto L110
    L138:
        $composer3 = $composer2;
        $composer3.skipToGroupEnd();
        overflow4 = overflow;
        maxLines4 = maxLines;
        minLines2 = minLines;
        color3 = color;
        style3 = r6;
        softWrap3 = softWrap;
        goto L139
    L104:
        r2 = false;
        goto L106
    L94:
        if (($changed & 100663296) != 0) goto L102;
        if ($composer2.changedInstance(color) == false) goto L98;
        int r20 = AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
    L99:
        $dirty = $dirty | r20;
        goto L102
    L98:
        r20 = 33554432;
        goto L99
    L83:
        if (($changed & 12582912) != 0) goto L90;
        if ($composer2.changed(minLines) == false) goto L87;
        int r19 = 8388608;
    L88:
        $dirty = $dirty | r19;
        goto L90
    L87:
        r19 = 4194304;
        goto L88
    L72:
        if (($changed & 1572864) != 0) goto L79;
        if ($composer2.changed(maxLines) == false) goto L76;
        int r18 = 1048576;
    L77:
        $dirty = $dirty | r18;
        goto L79
    L76:
        r18 = 524288;
        goto L77
    L61:
        if ((196608 & $changed) != 0) goto L68;
        if ($composer2.changed(softWrap) == false) goto L65;
        int r17 = 131072;
    L66:
        $dirty = $dirty | r17;
        goto L68
    L65:
        r17 = 65536;
        goto L66
    L50:
        if (($changed & 24576) != 0) goto L57;
        if ($composer2.changed(overflow) == false) goto L54;
        int r15 = 16384;
    L55:
        $dirty = $dirty | r15;
        goto L57
    L54:
        r15 = 8192;
        goto L55
    L39:
        if (($changed & 3072) != 0) goto L45;
        onTextLayout2 = onTextLayout;
        if ($composer2.changedInstance(onTextLayout2) == false) goto L43;
        int r10 = 2048;
    L44:
        $dirty = $dirty | r10;
        goto L46
    L43:
        r10 = 1024;
        goto L44
    L45:
        onTextLayout2 = onTextLayout;
        goto L46
    L28:
        if (($changed & 384) != 0) goto L34;
        r6 = style;
        if ($composer2.changed(r6) == false) goto L32;
        int r11 = 256;
    L33:
        $dirty = $dirty | r11;
        goto L35
    L32:
        r11 = 128;
        goto L33
    L34:
        r6 = style;
        goto L35
    L17:
        if (($changed & 48) != 0) goto L23;
        modifier2 = modifier;
        if ($composer2.changed(modifier2) == false) goto L21;
        int r21 = 32;
    L22:
        $dirty = $dirty | r21;
        goto L24
    L21:
        r21 = 16;
        goto L22
    L23:
        modifier2 = modifier;
        goto L24
    L6:
        if (($changed & 6) != 0) goto L12;
        r12 = text;
        if ($composer2.changed(r12) == false) goto L10;
        int r22 = 4;
    L11:
        $dirty = $dirty | r22;
        goto L13
    L10:
        r22 = 2;
        goto L11
    L12:
        r12 = text;
        goto L13
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Maintained for binary compatibility")
    /* JADX INFO: renamed from: BasicText-RWo7tUw, reason: not valid java name */
    public static final /* synthetic */ void m1032BasicTextRWo7tUw(final AnnotatedString text, Modifier modifier, TextStyle style, Function1 onTextLayout, int overflow, boolean softWrap, int maxLines, int minLines, Map inlineContent, ColorProducer color, Composer $composer, final int $changed, final int r41) {
        Composer $composer2 = $composer.startRestartGroup(-1064305212);
        ComposerKt.sourceInformation($composer2, "C(BasicText)P(9,4,8,5,6:c#ui.text.style.TextOverflow,7,2,3,1)344@17259L194:BasicText.kt#423gt5");
        int $dirty = $changed;
        if ((r41 & 1) == 0) goto L6;
        $dirty = $dirty | 6;
        AnnotatedString r13 = text;
    L13:
        int r3 = r41 & 2;
        if (r3 == 0) goto L17;
        $dirty = $dirty | 48;
        Modifier modifier2 = modifier;
    L24:
        int r5 = r41 & 4;
        if (r5 == 0) goto L28;
        $dirty = $dirty | 384;
        TextStyle r6 = style;
    L35:
        int r7 = r41 & 8;
        if (r7 == 0) goto L39;
        $dirty = $dirty | 3072;
        Function1 onTextLayout2 = onTextLayout;
    L46:
        int r9 = r41 & 16;
        if (r9 == 0) goto L50;
        $dirty = $dirty | 24576;
        int r10 = overflow;
    L57:
        int r14 = r41 & 32;
        if (r14 == 0) goto L61;
        $dirty = $dirty | ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
    L68:
        int r16 = r41 & 64;
        if (r16 == 0) goto L72;
        $dirty = $dirty | 1572864;
    L79:
        int r0 = r41 & 128;
        if (r0 == 0) goto L83;
        $dirty = $dirty | 12582912;
    L90:
        int r1 = r41 & 256;
        if (r1 == 0) goto L94;
        $dirty = $dirty | 100663296;
    L101:
        int r2 = r41 & 512;
        if (r2 == 0) goto L105;
        $dirty = $dirty | 805306368;
    L113:
        if (($dirty & 306783379) == 306783378) goto L115;
        boolean r4 = true;
    L117:
        if ($composer2.shouldExecute(r4, $dirty & 1) == false) goto L152;
        if (r3 == 0) goto L120;
        Modifier modifier3 = Modifier.Companion;
        int r8 = r14;
    L121:
        if (r5 == 0) goto L123;
        TextStyle style2 = TextStyle.Companion.getDefault();
    L124:
        if (r7 == 0) goto L126;
        Function1 onTextLayout3 = null;
        int r11 = r16;
    L127:
        if (r9 == 0) goto L129;
        int overflow2 = TextOverflow.Companion.m6886getClipgIe3tQ8();
        int r12 = -1064305212;
    L130:
        if (r8 == 0) goto L132;
        boolean softWrap2 = true;
        int r15 = r0;
    L133:
        if (r11 == 0) goto L135;
        int maxLines2 = Integer.MAX_VALUE;
        int maxLines3 = r1;
    L136:
        if (r15 == 0) goto L138;
        int minLines2 = 1;
        int minLines3 = r2;
    L139:
        if (maxLines3 == 0) goto L141;
        Map inlineContent2 = MapsKt.emptyMap();
    L142:
        if (minLines3 == 0) goto L144;
        ColorProducer color2 = null;
    L146:
        if (ComposerKt.isTraceInProgress() == false) goto L148;
        ComposerKt.traceEventStart(r12, $dirty, -1, "androidx.compose.foundation.text.BasicText (BasicText.kt:343)");
    L148:
        Composer $composer3 = $composer2;
        m1031BasicTextCL7eQgs(r13, modifier3, style2, onTextLayout3, overflow2, softWrap2, maxLines2, minLines2, inlineContent2, color2, null, $composer3, ((((((((($dirty & 14) | ($dirty & 112)) | ($dirty & 896)) | ($dirty & 7168)) | (57344 & $dirty)) | (458752 & $dirty)) | (3670016 & $dirty)) | (29360128 & $dirty)) | (234881024 & $dirty)) | (1879048192 & $dirty), 0, 1024);
        if (ComposerKt.isTraceInProgress() == false) goto L151;
        ComposerKt.traceEventEnd();
    L151:
        modifier2 = modifier3;
        final TextStyle style3 = style2;
        onTextLayout2 = onTextLayout3;
        final int overflow3 = overflow2;
        final boolean softWrap3 = softWrap2;
        final int maxLines4 = maxLines2;
        final Map inlineContent3 = inlineContent2;
        final ColorProducer color3 = color2;
    L153:
        ScopeUpdateScope r17 = $composer3.endRestartGroup();
        if (r17 == null) goto L157;
        final Modifier modifier4 = modifier2;
        final Function1 onTextLayout4 = onTextLayout2;
        final int minLines4 = minLines2;
        r17.updateScope(new BasicTextKt$BasicText$5(text, modifier4, style3, onTextLayout4, overflow3, softWrap3, maxLines4, minLines4, inlineContent3, color3, $changed, r41));
        return;
    L157:
        return;
    L144:
        color2 = color;
        goto L146
    L141:
        inlineContent2 = inlineContent;
        goto L142
    L138:
        minLines3 = r2;
        minLines2 = minLines;
        goto L139
    L135:
        maxLines3 = r1;
        maxLines2 = maxLines;
        goto L136
    L132:
        r15 = r0;
        softWrap2 = softWrap;
        goto L133
    L129:
        overflow2 = r10;
        r12 = -1064305212;
        goto L130
    L126:
        r11 = r16;
        onTextLayout3 = onTextLayout2;
        goto L127
    L123:
        style2 = r6;
        goto L124
    L120:
        r8 = r14;
        modifier3 = modifier2;
        goto L121
    L152:
        $composer3 = $composer2;
        $composer3.skipToGroupEnd();
        maxLines4 = maxLines;
        minLines2 = minLines;
        inlineContent3 = inlineContent;
        style3 = r6;
        overflow3 = r10;
        softWrap3 = softWrap;
        color3 = color;
        goto L153
    L115:
        r4 = false;
        goto L117
    L105:
        if (($changed & 805306368) != 0) goto L113;
        if ($composer2.changedInstance(color) == false) goto L109;
        int r21 = 536870912;
    L110:
        $dirty = $dirty | r21;
        goto L113
    L109:
        r21 = 268435456;
        goto L110
    L94:
        if (($changed & 100663296) != 0) goto L101;
        if ($composer2.changedInstance(inlineContent) == false) goto L98;
        int r20 = AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
    L99:
        $dirty = $dirty | r20;
        goto L101
    L98:
        r20 = 33554432;
        goto L99
    L83:
        if (($changed & 12582912) != 0) goto L90;
        if ($composer2.changed(minLines) == false) goto L87;
        int r19 = 8388608;
    L88:
        $dirty = $dirty | r19;
        goto L90
    L87:
        r19 = 4194304;
        goto L88
    L72:
        if (($changed & 1572864) != 0) goto L79;
        if ($composer2.changed(maxLines) == false) goto L76;
        int r18 = 1048576;
    L77:
        $dirty = $dirty | r18;
        goto L79
    L76:
        r18 = 524288;
        goto L77
    L61:
        if ((196608 & $changed) != 0) goto L68;
        if ($composer2.changed(softWrap) == false) goto L65;
        int r110 = 131072;
    L66:
        $dirty = $dirty | r110;
        goto L68
    L65:
        r110 = 65536;
        goto L66
    L50:
        if (($changed & 24576) != 0) goto L56;
        r10 = overflow;
        if ($composer2.changed(r10) == false) goto L54;
        int r111 = 16384;
    L55:
        $dirty = $dirty | r111;
        goto L57
    L54:
        r111 = 8192;
        goto L55
    L56:
        r10 = overflow;
        goto L57
    L39:
        if (($changed & 3072) != 0) goto L45;
        onTextLayout2 = onTextLayout;
        if ($composer2.changedInstance(onTextLayout2) == false) goto L43;
        int r22 = 2048;
    L44:
        $dirty = $dirty | r22;
        goto L46
    L43:
        r22 = 1024;
        goto L44
    L45:
        onTextLayout2 = onTextLayout;
        goto L46
    L28:
        if (($changed & 384) != 0) goto L34;
        r6 = style;
        if ($composer2.changed(r6) == false) goto L32;
        int r23 = 256;
    L33:
        $dirty = $dirty | r23;
        goto L35
    L32:
        r23 = 128;
        goto L33
    L34:
        r6 = style;
        goto L35
    L17:
        if (($changed & 48) != 0) goto L23;
        modifier2 = modifier;
        if ($composer2.changed(modifier2) == false) goto L21;
        int r24 = 32;
    L22:
        $dirty = $dirty | r24;
        goto L24
    L21:
        r24 = 16;
        goto L22
    L23:
        modifier2 = modifier;
        goto L24
    L6:
        if (($changed & 6) != 0) goto L12;
        r13 = text;
        if ($composer2.changed(r13) == false) goto L10;
        int r25 = 4;
    L11:
        $dirty = $dirty | r25;
        goto L13
    L10:
        r25 = 2;
        goto L11
    L12:
        r13 = text;
        goto L13
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Maintained for binary compatibility")
    /* JADX INFO: renamed from: BasicText-BpD7jsM, reason: not valid java name */
    public static final /* synthetic */ void m1030BasicTextBpD7jsM(final String text, Modifier modifier, TextStyle style, Function1 onTextLayout, int overflow, boolean softWrap, int maxLines, Composer $composer, final int $changed, final int r32) {
        Composer $composer2 = $composer.startRestartGroup(1022429478);
        ComposerKt.sourceInformation($composer2, "C(BasicText)P(6,1,5,2,3:c#ui.text.style.TextOverflow,4)369@17839L234:BasicText.kt#423gt5");
        int $dirty = $changed;
        if ((r32 & 1) == 0) goto L6;
        $dirty = $dirty | 6;
        String r9 = text;
    L13:
        int r3 = r32 & 2;
        if (r3 == 0) goto L17;
        $dirty = $dirty | 48;
        Modifier r4 = modifier;
    L24:
        int r5 = r32 & 4;
        if (r5 == 0) goto L28;
        $dirty = $dirty | 384;
        TextStyle r6 = style;
    L35:
        int r7 = r32 & 8;
        if (r7 == 0) goto L39;
        $dirty = $dirty | 3072;
    L46:
        int r11 = r32 & 16;
        if (r11 == 0) goto L50;
        $dirty = $dirty | 24576;
    L57:
        int r13 = r32 & 32;
        if (r13 == 0) goto L61;
        $dirty = $dirty | ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
        boolean softWrap2 = softWrap;
    L68:
        int r15 = r32 & 64;
        if (r15 == 0) goto L72;
        $dirty = $dirty | 1572864;
    L80:
        if (($dirty & 599187) == 599186) goto L82;
        boolean r0 = true;
    L84:
        if ($composer2.shouldExecute(r0, $dirty & 1) == false) goto L109;
        if (r3 == 0) goto L87;
        Modifier modifier2 = Modifier.Companion;
    L88:
        if (r5 == 0) goto L90;
        TextStyle style2 = TextStyle.Companion.getDefault();
        int r1 = r11;
    L91:
        if (r7 == 0) goto L93;
        Function1 onTextLayout2 = null;
    L94:
        if (r1 == 0) goto L96;
        int overflow2 = TextOverflow.Companion.m6886getClipgIe3tQ8();
        int overflow3 = r13;
    L97:
        if (overflow3 == 0) goto L99;
        softWrap2 = true;
    L99:
        if (r15 == 0) goto L101;
        int maxLines2 = Integer.MAX_VALUE;
    L103:
        if (ComposerKt.isTraceInProgress() == false) goto L105;
        ComposerKt.traceEventStart(1022429478, $dirty, -1, "androidx.compose.foundation.text.BasicText (BasicText.kt:368)");
    L105:
        Composer $composer3 = $composer2;
        m1033BasicTextRWo7tUw(r9, modifier2, style2, onTextLayout2, overflow2, softWrap2, maxLines2, 1, null, null, $composer3, ((((((($dirty & 14) | 12582912) | ($dirty & 112)) | ($dirty & 896)) | ($dirty & 7168)) | (57344 & $dirty)) | (458752 & $dirty)) | (3670016 & $dirty), 768);
        if (ComposerKt.isTraceInProgress() == false) goto L108;
        ComposerKt.traceEventEnd();
    L108:
        final TextStyle style3 = style2;
        final Function1 onTextLayout3 = onTextLayout2;
        final int overflow4 = overflow2;
        final int maxLines3 = maxLines2;
        final boolean softWrap3 = softWrap2;
    L110:
        ScopeUpdateScope r12 = $composer3.endRestartGroup();
        if (r12 == null) goto L114;
        final Modifier modifier3 = modifier2;
        r12.updateScope(new BasicTextKt$BasicText$6(text, modifier3, style3, onTextLayout3, overflow4, softWrap3, maxLines3, $changed, r32));
        return;
    L114:
        return;
    L101:
        maxLines2 = maxLines;
        goto L103
    L96:
        overflow3 = r13;
        overflow2 = overflow;
        goto L97
    L93:
        onTextLayout2 = onTextLayout;
        goto L94
    L90:
        r1 = r11;
        style2 = r6;
        goto L91
    L87:
        modifier2 = r4;
        goto L88
    L109:
        $composer3 = $composer2;
        $composer3.skipToGroupEnd();
        overflow4 = overflow;
        maxLines3 = maxLines;
        modifier2 = r4;
        style3 = r6;
        onTextLayout3 = onTextLayout;
        softWrap3 = softWrap2;
        goto L110
    L82:
        r0 = false;
        goto L84
    L72:
        if (($changed & 1572864) != 0) goto L80;
        if ($composer2.changed(maxLines) == false) goto L76;
        int r17 = 1048576;
    L77:
        $dirty = $dirty | r17;
        goto L80
    L76:
        r17 = 524288;
        goto L77
    L61:
        if ((196608 & $changed) != 0) goto L67;
        softWrap2 = softWrap;
        if ($composer2.changed(softWrap2) == false) goto L65;
        int r16 = 131072;
    L66:
        $dirty = $dirty | r16;
        goto L68
    L65:
        r16 = 65536;
        goto L66
    L67:
        softWrap2 = softWrap;
        goto L68
    L50:
        if (($changed & 24576) != 0) goto L57;
        if ($composer2.changed(overflow) == false) goto L54;
        int r14 = 16384;
    L55:
        $dirty = $dirty | r14;
        goto L57
    L54:
        r14 = 8192;
        goto L55
    L39:
        if (($changed & 3072) != 0) goto L46;
        if ($composer2.changedInstance(onTextLayout) == false) goto L43;
        int r18 = 2048;
    L44:
        $dirty = $dirty | r18;
        goto L46
    L43:
        r18 = 1024;
        goto L44
    L28:
        if (($changed & 384) != 0) goto L34;
        r6 = style;
        if ($composer2.changed(r6) == false) goto L32;
        int r8 = 256;
    L33:
        $dirty = $dirty | r8;
        goto L35
    L32:
        r8 = 128;
        goto L33
    L34:
        r6 = style;
        goto L35
    L17:
        if (($changed & 48) != 0) goto L23;
        r4 = modifier;
        if ($composer2.changed(r4) == false) goto L21;
        int r10 = 32;
    L22:
        $dirty = $dirty | r10;
        goto L24
    L21:
        r10 = 16;
        goto L22
    L23:
        r4 = modifier;
        goto L24
    L6:
        if (($changed & 6) != 0) goto L12;
        r9 = text;
        if ($composer2.changed(r9) == false) goto L10;
        int r19 = 4;
    L11:
        $dirty = $dirty | r19;
        goto L13
    L10:
        r19 = 2;
        goto L11
    L12:
        r9 = text;
        goto L13
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Maintained for binary compatibility")
    /* JADX INFO: renamed from: BasicText-4YKlhWE, reason: not valid java name */
    public static final /* synthetic */ void m1028BasicText4YKlhWE(final AnnotatedString text, Modifier modifier, TextStyle style, Function1 onTextLayout, int overflow, boolean softWrap, int maxLines, Map inlineContent, Composer $composer, final int $changed, final int r37) {
        Composer $composer2 = $composer.startRestartGroup(-648605928);
        ComposerKt.sourceInformation($composer2, "C(BasicText)P(7,2,6,3,4:c#ui.text.style.TextOverflow,5,1)393@18530L273:BasicText.kt#423gt5");
        int $dirty = $changed;
        if ((r37 & 1) == 0) goto L6;
        $dirty = $dirty | 6;
        AnnotatedString r11 = text;
    L13:
        int r3 = r37 & 2;
        if (r3 == 0) goto L17;
        $dirty = $dirty | 48;
        Modifier r4 = modifier;
    L24:
        int r5 = r37 & 4;
        if (r5 == 0) goto L28;
        $dirty = $dirty | 384;
        TextStyle r6 = style;
    L35:
        int r7 = r37 & 8;
        if (r7 == 0) goto L39;
        $dirty = $dirty | 3072;
        Function1 r8 = onTextLayout;
    L46:
        int r12 = r37 & 16;
        if (r12 == 0) goto L50;
        $dirty = $dirty | 24576;
    L57:
        int r14 = r37 & 32;
        if (r14 == 0) goto L61;
        $dirty = $dirty | ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
    L68:
        int r16 = r37 & 64;
        if (r16 == 0) goto L72;
        $dirty = $dirty | 1572864;
    L79:
        int r0 = r37 & 128;
        if (r0 == 0) goto L83;
        $dirty = $dirty | 12582912;
    L91:
        if (($dirty & 4793491) == 4793490) goto L93;
        boolean r1 = true;
    L95:
        if ($composer2.shouldExecute(r1, $dirty & 1) == false) goto L124;
        if (r3 == 0) goto L98;
        Modifier modifier2 = Modifier.Companion;
        int r2 = r12;
    L99:
        if (r5 == 0) goto L101;
        TextStyle style2 = TextStyle.Companion.getDefault();
    L102:
        if (r7 == 0) goto L104;
        Function1 onTextLayout2 = null;
        int r9 = r14;
    L105:
        if (r2 == 0) goto L107;
        int overflow2 = TextOverflow.Companion.m6886getClipgIe3tQ8();
    L108:
        if (r9 == 0) goto L110;
        boolean softWrap2 = true;
        int r10 = r16;
    L111:
        if (r10 == 0) goto L113;
        int maxLines2 = Integer.MAX_VALUE;
        int r13 = -648605928;
    L114:
        if (r0 == 0) goto L116;
        Map inlineContent2 = MapsKt.emptyMap();
    L118:
        if (ComposerKt.isTraceInProgress() == false) goto L120;
        ComposerKt.traceEventStart(r13, $dirty, -1, "androidx.compose.foundation.text.BasicText (BasicText.kt:392)");
    L120:
        Composer $composer3 = $composer2;
        m1031BasicTextCL7eQgs(r11, modifier2, style2, onTextLayout2, overflow2, softWrap2, maxLines2, 1, inlineContent2, null, null, $composer3, (((((((($dirty & 14) | 12582912) | ($dirty & 112)) | ($dirty & 896)) | ($dirty & 7168)) | (57344 & $dirty)) | (458752 & $dirty)) | (3670016 & $dirty)) | (($dirty << 3) & 234881024), 0, 1536);
        if (ComposerKt.isTraceInProgress() == false) goto L123;
        ComposerKt.traceEventEnd();
    L123:
        final TextStyle style3 = style2;
        final Function1 onTextLayout3 = onTextLayout2;
        final int overflow3 = overflow2;
        final boolean softWrap3 = softWrap2;
        final int maxLines3 = maxLines2;
        final Map inlineContent3 = inlineContent2;
    L125:
        ScopeUpdateScope r15 = $composer3.endRestartGroup();
        if (r15 == null) goto L129;
        final Modifier modifier3 = modifier2;
        r15.updateScope(new BasicTextKt$BasicText$7(text, modifier3, style3, onTextLayout3, overflow3, softWrap3, maxLines3, inlineContent3, $changed, r37));
        return;
    L129:
        return;
    L116:
        inlineContent2 = inlineContent;
        goto L118
    L113:
        maxLines2 = maxLines;
        r13 = -648605928;
        goto L114
    L110:
        r10 = r16;
        softWrap2 = softWrap;
        goto L111
    L107:
        overflow2 = overflow;
        goto L108
    L104:
        r9 = r14;
        onTextLayout2 = r8;
        goto L105
    L101:
        style2 = r6;
        goto L102
    L98:
        r2 = r12;
        modifier2 = r4;
        goto L99
    L124:
        $composer3 = $composer2;
        $composer3.skipToGroupEnd();
        overflow3 = overflow;
        maxLines3 = maxLines;
        modifier2 = r4;
        style3 = r6;
        onTextLayout3 = r8;
        softWrap3 = softWrap;
        inlineContent3 = inlineContent;
        goto L125
    L93:
        r1 = false;
        goto L95
    L83:
        if (($changed & 12582912) != 0) goto L91;
        if ($composer2.changedInstance(inlineContent) == false) goto L87;
        int r20 = 8388608;
    L88:
        $dirty = $dirty | r20;
        goto L91
    L87:
        r20 = 4194304;
        goto L88
    L72:
        if (($changed & 1572864) != 0) goto L79;
        if ($composer2.changed(maxLines) == false) goto L76;
        int r18 = 1048576;
    L77:
        $dirty = $dirty | r18;
        goto L79
    L76:
        r18 = 524288;
        goto L77
    L61:
        if ((196608 & $changed) != 0) goto L68;
        if ($composer2.changed(softWrap) == false) goto L65;
        int r17 = 131072;
    L66:
        $dirty = $dirty | r17;
        goto L68
    L65:
        r17 = 65536;
        goto L66
    L50:
        if (($changed & 24576) != 0) goto L57;
        if ($composer2.changed(overflow) == false) goto L54;
        int r19 = 16384;
    L55:
        $dirty = $dirty | r19;
        goto L57
    L54:
        r19 = 8192;
        goto L55
    L39:
        if (($changed & 3072) != 0) goto L45;
        r8 = onTextLayout;
        if ($composer2.changedInstance(r8) == false) goto L43;
        int r110 = 2048;
    L44:
        $dirty = $dirty | r110;
        goto L46
    L43:
        r110 = 1024;
        goto L44
    L45:
        r8 = onTextLayout;
        goto L46
    L28:
        if (($changed & 384) != 0) goto L34;
        r6 = style;
        if ($composer2.changed(r6) == false) goto L32;
        int r21 = 256;
    L33:
        $dirty = $dirty | r21;
        goto L35
    L32:
        r21 = 128;
        goto L33
    L34:
        r6 = style;
        goto L35
    L17:
        if (($changed & 48) != 0) goto L23;
        r4 = modifier;
        if ($composer2.changed(r4) == false) goto L21;
        int r22 = 32;
    L22:
        $dirty = $dirty | r22;
        goto L24
    L21:
        r22 = 16;
        goto L22
    L23:
        r4 = modifier;
        goto L24
    L6:
        if (($changed & 6) != 0) goto L12;
        r11 = text;
        if ($composer2.changed(r11) == false) goto L10;
        int r23 = 4;
    L11:
        $dirty = $dirty | r23;
        goto L13
    L10:
        r23 = 2;
        goto L11
    L12:
        r11 = text;
        goto L13
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Maintained for binary compat")
    /* JADX INFO: renamed from: BasicText-4YKlhWE, reason: not valid java name */
    public static final /* synthetic */ void m1029BasicText4YKlhWE(final String text, Modifier modifier, TextStyle style, Function1 onTextLayout, int overflow, boolean softWrap, int maxLines, int minLines, Composer $composer, final int $changed, final int r35) {
        Composer $composer2 = $composer.startRestartGroup(1542716361);
        ComposerKt.sourceInformation($composer2, "C(BasicText)P(7,2,6,3,4:c#ui.text.style.TextOverflow,5)417@19201L86:BasicText.kt#423gt5");
        int $dirty = $changed;
        if ((r35 & 1) == 0) goto L6;
        $dirty = $dirty | 6;
        String r11 = text;
    L13:
        int r3 = r35 & 2;
        if (r3 == 0) goto L17;
        $dirty = $dirty | 48;
        Modifier r4 = modifier;
    L24:
        int r5 = r35 & 4;
        if (r5 == 0) goto L28;
        $dirty = $dirty | 384;
        TextStyle r6 = style;
    L35:
        int r7 = r35 & 8;
        if (r7 == 0) goto L39;
        $dirty = $dirty | 3072;
        Function1 r8 = onTextLayout;
    L46:
        int r12 = r35 & 16;
        if (r12 == 0) goto L50;
        $dirty = $dirty | 24576;
    L57:
        int r14 = r35 & 32;
        if (r14 == 0) goto L61;
        $dirty = $dirty | ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
    L68:
        int r16 = r35 & 64;
        if (r16 == 0) goto L72;
        $dirty = $dirty | 1572864;
    L79:
        int r0 = r35 & 128;
        if (r0 == 0) goto L83;
        $dirty = $dirty | 12582912;
    L91:
        if (($dirty & 4793491) == 4793490) goto L93;
        boolean r1 = true;
    L95:
        if ($composer2.shouldExecute(r1, $dirty & 1) == false) goto L124;
        if (r3 == 0) goto L98;
        Modifier modifier2 = Modifier.Companion;
        int r2 = r12;
    L99:
        if (r5 == 0) goto L101;
        TextStyle style2 = TextStyle.Companion.getDefault();
    L102:
        if (r7 == 0) goto L104;
        Function1 onTextLayout2 = null;
        int r9 = r14;
    L105:
        if (r2 == 0) goto L107;
        int overflow2 = TextOverflow.Companion.m6886getClipgIe3tQ8();
    L108:
        if (r9 == 0) goto L110;
        boolean softWrap2 = true;
        int r10 = r16;
    L111:
        if (r10 == 0) goto L113;
        int maxLines2 = Integer.MAX_VALUE;
        int r13 = 1542716361;
    L114:
        if (r0 == 0) goto L116;
        int minLines2 = 1;
    L118:
        if (ComposerKt.isTraceInProgress() == false) goto L120;
        ComposerKt.traceEventStart(r13, $dirty, -1, "androidx.compose.foundation.text.BasicText (BasicText.kt:417)");
    L120:
        Composer $composer3 = $composer2;
        m1033BasicTextRWo7tUw(r11, modifier2, style2, onTextLayout2, overflow2, softWrap2, maxLines2, minLines2, null, null, $composer3, ((((((($dirty & 14) | ($dirty & 112)) | ($dirty & 896)) | ($dirty & 7168)) | (57344 & $dirty)) | (458752 & $dirty)) | (3670016 & $dirty)) | (29360128 & $dirty), 768);
        if (ComposerKt.isTraceInProgress() == false) goto L123;
        ComposerKt.traceEventEnd();
    L123:
        final TextStyle style3 = style2;
        final Function1 onTextLayout3 = onTextLayout2;
        final int overflow3 = overflow2;
        final boolean softWrap3 = softWrap2;
        final int maxLines3 = maxLines2;
        final int minLines3 = minLines2;
    L125:
        ScopeUpdateScope r15 = $composer3.endRestartGroup();
        if (r15 == null) goto L129;
        final Modifier modifier3 = modifier2;
        r15.updateScope(new BasicTextKt$BasicText$8(text, modifier3, style3, onTextLayout3, overflow3, softWrap3, maxLines3, minLines3, $changed, r35));
        return;
    L129:
        return;
    L116:
        minLines2 = minLines;
        goto L118
    L113:
        maxLines2 = maxLines;
        r13 = 1542716361;
        goto L114
    L110:
        r10 = r16;
        softWrap2 = softWrap;
        goto L111
    L107:
        overflow2 = overflow;
        goto L108
    L104:
        r9 = r14;
        onTextLayout2 = r8;
        goto L105
    L101:
        style2 = r6;
        goto L102
    L98:
        r2 = r12;
        modifier2 = r4;
        goto L99
    L124:
        $composer3 = $composer2;
        $composer3.skipToGroupEnd();
        overflow3 = overflow;
        maxLines3 = maxLines;
        modifier2 = r4;
        style3 = r6;
        onTextLayout3 = r8;
        softWrap3 = softWrap;
        minLines3 = minLines;
        goto L125
    L93:
        r1 = false;
        goto L95
    L83:
        if (($changed & 12582912) != 0) goto L91;
        if ($composer2.changed(minLines) == false) goto L87;
        int r19 = 8388608;
    L88:
        $dirty = $dirty | r19;
        goto L91
    L87:
        r19 = 4194304;
        goto L88
    L72:
        if (($changed & 1572864) != 0) goto L79;
        if ($composer2.changed(maxLines) == false) goto L76;
        int r18 = 1048576;
    L77:
        $dirty = $dirty | r18;
        goto L79
    L76:
        r18 = 524288;
        goto L77
    L61:
        if ((196608 & $changed) != 0) goto L68;
        if ($composer2.changed(softWrap) == false) goto L65;
        int r17 = 131072;
    L66:
        $dirty = $dirty | r17;
        goto L68
    L65:
        r17 = 65536;
        goto L66
    L50:
        if (($changed & 24576) != 0) goto L57;
        if ($composer2.changed(overflow) == false) goto L54;
        int r110 = 16384;
    L55:
        $dirty = $dirty | r110;
        goto L57
    L54:
        r110 = 8192;
        goto L55
    L39:
        if (($changed & 3072) != 0) goto L45;
        r8 = onTextLayout;
        if ($composer2.changedInstance(r8) == false) goto L43;
        int r111 = 2048;
    L44:
        $dirty = $dirty | r111;
        goto L46
    L43:
        r111 = 1024;
        goto L44
    L45:
        r8 = onTextLayout;
        goto L46
    L28:
        if (($changed & 384) != 0) goto L34;
        r6 = style;
        if ($composer2.changed(r6) == false) goto L32;
        int r20 = 256;
    L33:
        $dirty = $dirty | r20;
        goto L35
    L32:
        r20 = 128;
        goto L33
    L34:
        r6 = style;
        goto L35
    L17:
        if (($changed & 48) != 0) goto L23;
        r4 = modifier;
        if ($composer2.changed(r4) == false) goto L21;
        int r21 = 32;
    L22:
        $dirty = $dirty | r21;
        goto L24
    L21:
        r21 = 16;
        goto L22
    L23:
        r4 = modifier;
        goto L24
    L6:
        if (($changed & 6) != 0) goto L12;
        r11 = text;
        if ($composer2.changed(r11) == false) goto L10;
        int r22 = 4;
    L11:
        $dirty = $dirty | r22;
        goto L13
    L10:
        r22 = 2;
        goto L11
    L12:
        r11 = text;
        goto L13
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Maintained for binary compat")
    /* JADX INFO: renamed from: BasicText-VhcvRP8, reason: not valid java name */
    public static final /* synthetic */ void m1034BasicTextVhcvRP8(final AnnotatedString text, Modifier modifier, TextStyle style, Function1 onTextLayout, int overflow, boolean softWrap, int maxLines, int minLines, Map inlineContent, Composer $composer, final int $changed, final int r39) {
        Composer $composer2 = $composer.startRestartGroup(851408699);
        ComposerKt.sourceInformation($composer2, "C(BasicText)P(8,3,7,4,5:c#ui.text.style.TextOverflow,6,1,2)432@19757L280:BasicText.kt#423gt5");
        int $dirty = $changed;
        if ((r39 & 1) == 0) goto L6;
        $dirty = $dirty | 6;
        AnnotatedString r12 = text;
    L13:
        int r3 = r39 & 2;
        if (r3 == 0) goto L17;
        $dirty = $dirty | 48;
        Modifier modifier2 = modifier;
    L24:
        int r5 = r39 & 4;
        if (r5 == 0) goto L28;
        $dirty = $dirty | 384;
        TextStyle r6 = style;
    L35:
        int r7 = r39 & 8;
        if (r7 == 0) goto L39;
        $dirty = $dirty | 3072;
        Function1 onTextLayout2 = onTextLayout;
    L46:
        int r9 = r39 & 16;
        if (r9 == 0) goto L50;
        $dirty = $dirty | 24576;
    L57:
        int r14 = r39 & 32;
        if (r14 == 0) goto L61;
        $dirty = $dirty | ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
    L68:
        int r16 = r39 & 64;
        if (r16 == 0) goto L72;
        $dirty = $dirty | 1572864;
    L79:
        int r0 = r39 & 128;
        if (r0 == 0) goto L83;
        $dirty = $dirty | 12582912;
    L90:
        int r1 = r39 & 256;
        if (r1 == 0) goto L94;
        $dirty = $dirty | 100663296;
    L102:
        if (($dirty & 38347923) == 38347922) goto L104;
        boolean r2 = true;
    L106:
        if ($composer2.shouldExecute(r2, $dirty & 1) == false) goto L138;
        if (r3 == 0) goto L109;
        Modifier modifier3 = Modifier.Companion;
    L110:
        if (r5 == 0) goto L112;
        TextStyle style2 = TextStyle.Companion.getDefault();
        int r4 = r14;
    L113:
        if (r7 == 0) goto L115;
        Function1 onTextLayout3 = null;
    L116:
        if (r9 == 0) goto L118;
        int overflow2 = TextOverflow.Companion.m6886getClipgIe3tQ8();
        int overflow3 = r16;
    L119:
        if (r4 == 0) goto L121;
        boolean softWrap2 = true;
        int r8 = 851408699;
    L122:
        if (overflow3 == 0) goto L124;
        int maxLines2 = Integer.MAX_VALUE;
        int maxLines3 = r0;
    L125:
        if (maxLines3 == 0) goto L127;
        int minLines2 = 1;
        int minLines3 = r1;
    L128:
        if (minLines3 == 0) goto L130;
        Map inlineContent2 = MapsKt.emptyMap();
    L132:
        if (ComposerKt.isTraceInProgress() == false) goto L134;
        ComposerKt.traceEventStart(r8, $dirty, -1, "androidx.compose.foundation.text.BasicText (BasicText.kt:432)");
    L134:
        Composer $composer3 = $composer2;
        m1031BasicTextCL7eQgs(r12, modifier3, style2, onTextLayout3, overflow2, softWrap2, maxLines2, minLines2, inlineContent2, null, null, $composer3, (((((((($dirty & 14) | ($dirty & 112)) | ($dirty & 896)) | ($dirty & 7168)) | (57344 & $dirty)) | (458752 & $dirty)) | (3670016 & $dirty)) | (29360128 & $dirty)) | (234881024 & $dirty), 0, 1536);
        if (ComposerKt.isTraceInProgress() == false) goto L137;
        ComposerKt.traceEventEnd();
    L137:
        modifier2 = modifier3;
        final TextStyle style3 = style2;
        onTextLayout2 = onTextLayout3;
        final int overflow4 = overflow2;
        final boolean softWrap3 = softWrap2;
        final int maxLines4 = maxLines2;
        final Map inlineContent3 = inlineContent2;
    L139:
        ScopeUpdateScope r13 = $composer3.endRestartGroup();
        if (r13 == null) goto L143;
        final Modifier modifier4 = modifier2;
        final Function1 onTextLayout4 = onTextLayout2;
        final int minLines4 = minLines2;
        r13.updateScope(new BasicTextKt$BasicText$9(text, modifier4, style3, onTextLayout4, overflow4, softWrap3, maxLines4, minLines4, inlineContent3, $changed, r39));
        return;
    L143:
        return;
    L130:
        inlineContent2 = inlineContent;
        goto L132
    L127:
        minLines3 = r1;
        minLines2 = minLines;
        goto L128
    L124:
        maxLines3 = r0;
        maxLines2 = maxLines;
        goto L125
    L121:
        softWrap2 = softWrap;
        r8 = 851408699;
        goto L122
    L118:
        overflow3 = r16;
        overflow2 = overflow;
        goto L119
    L115:
        onTextLayout3 = onTextLayout2;
        goto L116
    L112:
        r4 = r14;
        style2 = r6;
        goto L113
    L109:
        modifier3 = modifier2;
        goto L110
    L138:
        $composer3 = $composer2;
        $composer3.skipToGroupEnd();
        overflow4 = overflow;
        maxLines4 = maxLines;
        minLines2 = minLines;
        inlineContent3 = inlineContent;
        style3 = r6;
        softWrap3 = softWrap;
        goto L139
    L104:
        r2 = false;
        goto L106
    L94:
        if (($changed & 100663296) != 0) goto L102;
        if ($composer2.changedInstance(inlineContent) == false) goto L98;
        int r20 = AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
    L99:
        $dirty = $dirty | r20;
        goto L102
    L98:
        r20 = 33554432;
        goto L99
    L83:
        if (($changed & 12582912) != 0) goto L90;
        if ($composer2.changed(minLines) == false) goto L87;
        int r19 = 8388608;
    L88:
        $dirty = $dirty | r19;
        goto L90
    L87:
        r19 = 4194304;
        goto L88
    L72:
        if (($changed & 1572864) != 0) goto L79;
        if ($composer2.changed(maxLines) == false) goto L76;
        int r18 = 1048576;
    L77:
        $dirty = $dirty | r18;
        goto L79
    L76:
        r18 = 524288;
        goto L77
    L61:
        if ((196608 & $changed) != 0) goto L68;
        if ($composer2.changed(softWrap) == false) goto L65;
        int r17 = 131072;
    L66:
        $dirty = $dirty | r17;
        goto L68
    L65:
        r17 = 65536;
        goto L66
    L50:
        if (($changed & 24576) != 0) goto L57;
        if ($composer2.changed(overflow) == false) goto L54;
        int r15 = 16384;
    L55:
        $dirty = $dirty | r15;
        goto L57
    L54:
        r15 = 8192;
        goto L55
    L39:
        if (($changed & 3072) != 0) goto L45;
        onTextLayout2 = onTextLayout;
        if ($composer2.changedInstance(onTextLayout2) == false) goto L43;
        int r10 = 2048;
    L44:
        $dirty = $dirty | r10;
        goto L46
    L43:
        r10 = 1024;
        goto L44
    L45:
        onTextLayout2 = onTextLayout;
        goto L46
    L28:
        if (($changed & 384) != 0) goto L34;
        r6 = style;
        if ($composer2.changed(r6) == false) goto L32;
        int r11 = 256;
    L33:
        $dirty = $dirty | r11;
        goto L35
    L32:
        r11 = 128;
        goto L33
    L34:
        r6 = style;
        goto L35
    L17:
        if (($changed & 48) != 0) goto L23;
        modifier2 = modifier;
        if ($composer2.changed(modifier2) == false) goto L21;
        int r21 = 32;
    L22:
        $dirty = $dirty | r21;
        goto L24
    L21:
        r21 = 16;
        goto L22
    L23:
        modifier2 = modifier;
        goto L24
    L6:
        if (($changed & 6) != 0) goto L12;
        r12 = text;
        if ($composer2.changed(r12) == false) goto L10;
        int r22 = 4;
    L11:
        $dirty = $dirty | r22;
        goto L13
    L10:
        r22 = 2;
        goto L11
    L12:
        r12 = text;
        goto L13
    }

    private static final Saver<Long, Long> selectionIdSaver(final SelectionRegistrar selectionRegistrar) {
        return SaverKt.Saver(new AnonymousClass1(selectionRegistrar), AnonymousClass2.INSTANCE);
    }

    private static final List<Pair<Placeable, Function0<IntOffset>>> measureWithTextRangeMeasureConstraints(List<? extends Measurable> r21, Function0<Boolean> r22) {
        if (r22.invoke().booleanValue() == false) goto L8;
        TextRangeLayoutMeasureScope textRangeLayoutMeasureScope = new TextRangeLayoutMeasureScope();
        List<? extends Measurable> r1 = r21;
        int $i$f$fastMapIndexedNotNull = 0;
        ArrayList target$iv = new ArrayList(r1.size());
        List<? extends Measurable> r4 = r1;
        int index$iv$iv = 0;
        int r7 = r4.size();
    L5:
        if (index$iv$iv >= r7) goto L11;
        Object item$iv$iv = r4.get(index$iv$iv);
        Measurable measurable = (Measurable) item$iv$iv;
        Object r14 = measurable.getParentData();
        Intrinsics.checkNotNull(r14, "null cannot be cast to non-null type androidx.compose.foundation.text.TextRangeLayoutModifier");
        TextRangeScopeMeasurePolicy rangeMeasurePolicy = ((TextRangeLayoutModifier) r14).getMeasurePolicy();
        TextRangeLayoutMeasureResult rangeMeasureResult = rangeMeasurePolicy.measure(textRangeLayoutMeasureScope);
        TextRangeLayoutMeasureScope textRangeLayoutMeasureScope2 = textRangeLayoutMeasureScope;
        Constraints.Companion r0 = Constraints.Companion;
        List<? extends Measurable> r17 = r1;
        int r2 = rangeMeasureResult.getWidth();
        int $i$f$fastMapIndexedNotNull2 = $i$f$fastMapIndexedNotNull;
        int $i$f$fastMapIndexedNotNull3 = rangeMeasureResult.getWidth();
        ArrayList target$iv2 = target$iv;
        List<? extends Measurable> r20 = r4;
        Placeable placeable = measurable.mo5714measureBRTryo0(r0.m6935fitPrioritizingWidthZbe2FdA(r2, $i$f$fastMapIndexedNotNull3, rangeMeasureResult.getHeight(), rangeMeasureResult.getHeight()));
        Pair r3 = new Pair(placeable, rangeMeasureResult.getPlace());
        target$iv2.add(r3);
        index$iv$iv = index$iv$iv + 1;
        textRangeLayoutMeasureScope = textRangeLayoutMeasureScope2;
        r1 = r17;
        $i$f$fastMapIndexedNotNull = $i$f$fastMapIndexedNotNull2;
        target$iv = target$iv2;
        r4 = r20;
        goto L5
    L11:
        return target$iv;
    L8:
        return null;
    }

    /* JADX INFO: renamed from: textModifier-CL7eQgs, reason: not valid java name */
    private static final Modifier m1038textModifierCL7eQgs(Modifier $this$textModifier_u2dCL7eQgs, AnnotatedString text, TextStyle style, Function1<? super TextLayoutResult, Unit> r35, int overflow, boolean softWrap, int maxLines, int minLines, FontFamily.Resolver fontFamilyResolver, List<AnnotatedString.Range<Placeholder>> r41, Function1<? super List<Rect>, Unit> r42, SelectionController selectionController, ColorProducer color, Function1<? super TextAnnotatedStringNode.TextSubstitutionValue, Unit> r45, TextAutoSize autoSize) {
        if (selectionController != null) goto L6;
        TextAnnotatedStringElement staticTextModifier = new TextAnnotatedStringElement(text, style, fontFamilyResolver, r35, overflow, softWrap, maxLines, minLines, r41, r42, null, color, autoSize, r45, null);
        return $this$textModifier_u2dCL7eQgs.then(Modifier.Companion).then(staticTextModifier);
    L6:
        SelectableTextAnnotatedStringElement selectableTextModifier = new SelectableTextAnnotatedStringElement(text, style, fontFamilyResolver, r35, overflow, softWrap, maxLines, minLines, r41, r42, selectionController, color, autoSize, null);
        return $this$textModifier_u2dCL7eQgs.then(selectionController.getModifier()).then(selectableTextModifier);
    }

    /* JADX INFO: renamed from: LayoutWithLinksAndInlineContent-11Od_4g, reason: not valid java name */
    private static final void m1036LayoutWithLinksAndInlineContent11Od_4g(final Modifier r29, final AnnotatedString r30, final Function1<? super TextLayoutResult, Unit> r31, final boolean r32, Map<String, InlineTextContent> r33, final TextStyle r34, final int r35, final boolean r36, final int r37, final int r38, final FontFamily.Resolver r39, final SelectionController r40, final ColorProducer r41, final Function1<? super TextAnnotatedStringNode.TextSubstitutionValue, Unit> r42, final TextAutoSize r43, Composer r44, final int r45, final int r46, final int r47) {
        Composer r7 = r44.startRestartGroup(-2118572703);
        ComposerKt.sourceInformation(r7, "C(LayoutWithLinksAndInlineContent)P(7,14,9,3,4,13,10:c#ui.text.style.TextOverflow,12,5,6,2,11,1,8)671@28101L117,662@27779L1426:BasicText.kt#423gt5");
        int r8 = r45;
        int r9 = r46;
        if ((r47 & 1) == 0) goto L6;
        r8 = r8 | 6;
        Modifier r10 = r29;
    L14:
        if ((r47 & 2) == 0) goto L17;
        r8 = r8 | 48;
    L23:
        int r16 = 128;
        if ((r47 & 4) == 0) goto L27;
        r8 = r8 | 384;
    L33:
        int r18 = 2048;
        if ((r47 & 8) == 0) goto L37;
        r8 = r8 | 3072;
    L43:
        int r13 = r47 & 16;
        int r20 = 16384;
        if (r13 == 0) goto L47;
        r8 = r8 | 24576;
        Map<String, InlineTextContent> r14 = r33;
    L55:
        if ((r47 & 32) == 0) goto L58;
        r8 = r8 | ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
        TextStyle r12 = r34;
    L66:
        if ((r47 & 64) == 0) goto L69;
        r8 = r8 | 1572864;
        int r11 = r35;
    L77:
        if ((r47 & 128) == 0) goto L80;
        r8 = r8 | 12582912;
    L88:
        if ((r47 & 256) == 0) goto L91;
        r8 = r8 | 100663296;
    L99:
        if ((r47 & 512) == 0) goto L102;
        r8 = r8 | 805306368;
    L110:
        if ((r47 & 1024) == 0) goto L113;
        r9 = r9 | 6;
    L121:
        if ((r47 & 2048) == 0) goto L124;
        r9 = r9 | 48;
    L132:
        if ((r47 & 4096) == 0) goto L135;
        r9 = r9 | 384;
    L142:
        if ((r47 & 8192) == 0) goto L145;
        r9 = r9 | 3072;
    L153:
        if ((r47 & 16384) == 0) goto L156;
        r9 = r9 | 24576;
    L165:
        int r0 = r9;
        boolean r17 = true;
        if ((306783379 & r8) == 306783378) goto L168;
    L171:
        boolean r1 = true;
    L173:
        if (r7.shouldExecute(r1, r8 & 1) == false) goto L309;
        if (r13 == 0) goto L176;
        Map<String, InlineTextContent> r2 = MapsKt.emptyMap();
    L178:
        if (ComposerKt.isTraceInProgress() == false) goto L181;
        ComposerKt.traceEventStart(-2118572703, r8, r0, "androidx.compose.foundation.text.LayoutWithLinksAndInlineContent (BasicText.kt:630)");
    L181:
        if (TextAnnotatedStringNodeKt.hasLinks(r30) == false) goto L195;
        r7.startReplaceGroup(-613484007);
        ComposerKt.sourceInformation(r7, "634@26844L38");
        ComposerKt.sourceInformationMarkerStart(r7, -296884047, "CC(remember):BasicText.kt#9igjgp");
        boolean r48 = false;
        if ((r8 & 112) != 32) goto L185;
        boolean r4 = true;
    L186:
        Object r15 = r7.rememberedValue();
        if (r4 == true) goto L193;
        if (r15 == Composer.Companion.getEmpty()) goto L193;
    L194:
        ComposerKt.sourceInformationMarkerEnd(r7);
        r7.endReplaceGroup();
        final TextLinkScope r3 = (TextLinkScope) r15;
    L197:
        if (TextAnnotatedStringNodeKt.hasLinks(r30) == false) goto L210;
        r7.startReplaceGroup(-613220135);
        ComposerKt.sourceInformation(r7, "641@27109L70");
        ComposerKt.sourceInformationMarkerStart(r7, -296875535, "CC(remember):BasicText.kt#9igjgp");
        if ((r8 & 112) != 32) goto L201;
        boolean r5 = true;
    L202:
        boolean r6 = r5 | r7.changed(r3);
        Object r19 = r7.rememberedValue();
        if (r6 == false) goto L205;
    L208:
        r19 = (Function0) new BasicTextKt$LayoutWithLinksAndInlineContent$styledText$1$1(r3, r30);
        r7.updateRememberedValue(r19);
    L209:
        Function0 r21 = (Function0) r19;
        ComposerKt.sourceInformationMarkerEnd(r7);
        r7.endReplaceGroup();
    L224:
        if (r32 == false) goto L226;
        Pair<List<AnnotatedString.Range<Placeholder>>, List<AnnotatedString.Range<Function3<String, Composer, Integer, Unit>>>> r22 = AnnotatedStringResolveInlineContentKt.resolveInlineContent(r30, r2);
    L227:
        List<AnnotatedString.Range<Placeholder>> r23 = r22.component1();
        List<AnnotatedString.Range<Function3<String, Composer, Integer, Unit>>> r24 = r22.component2();
        if (r32 == false) goto L234;
        r7.startReplaceGroup(-612806750);
        ComposerKt.sourceInformation(r7, "654@27526L61");
        ComposerKt.sourceInformationMarkerStart(r7, -296862200, "CC(remember):BasicText.kt#9igjgp");
        Object r25 = r7.rememberedValue();
        if (r25 != Composer.Companion.getEmpty()) goto L232;
        Function1 r26 = null;
        Object r27 = SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
        r7.updateRememberedValue(r27);
        Object r110 = r27;
    L233:
        final MutableState r28 = (MutableState) r110;
        ComposerKt.sourceInformationMarkerEnd(r7);
        r7.endReplaceGroup();
    L236:
        if (r32 == false) goto L245;
        r7.startReplaceGroup(-612625741);
        ComposerKt.sourceInformation(r7, "659@27709L44");
        ComposerKt.sourceInformationMarkerStart(r7, -296856361, "CC(remember):BasicText.kt#9igjgp");
        boolean r49 = r7.changed(r28);
        Object r50 = r7.rememberedValue();
        if (r49 == false) goto L240;
    L243:
        r50 = (Function1) new BasicTextKt$LayoutWithLinksAndInlineContent$onPlaceholderLayout$1$1(r28);
        r7.updateRememberedValue(r50);
    L244:
        Function1 r111 = (Function1) r50;
        ComposerKt.sourceInformationMarkerEnd(r7);
        r7.endReplaceGroup();
    L246:
        AnnotatedString r51 = (AnnotatedString) r21.invoke();
        ComposerKt.sourceInformationMarkerStart(r7, -296843744, "CC(remember):BasicText.kt#9igjgp");
        boolean r52 = r7.changedInstance(r3);
        if ((r8 & 896) == 256) goto L250;
        r17 = r48;
    L250:
        boolean r53 = r52 | r17;
        Object r54 = r7.rememberedValue();
        if (r53 == true) goto L256;
        AnnotatedString r112 = r51;
        if (r54 != Composer.Companion.getEmpty()) goto L258;
    L257:
        r54 = (Function1) new BasicTextKt$LayoutWithLinksAndInlineContent$2$1(r3, r31);
        r7.updateRememberedValue(r54);
    L258:
        ComposerKt.sourceInformationMarkerEnd(r7);
        int r210 = r8;
        Modifier r55 = m1038textModifierCL7eQgs(r10, r112, r12, (Function1) r54, r11, r36, r37, r38, r39, r23, r111, r40, r41, r42, r43);
        if (r32 == true) goto L268;
        r7.startReplaceGroup(-611542291);
        ComposerKt.sourceInformation(r7, "690@28867L55");
        ComposerKt.sourceInformationMarkerStart(r7, -296819294, "CC(remember):BasicText.kt#9igjgp");
        boolean r56 = r7.changedInstance(r3);
        Object r57 = r7.rememberedValue();
        if (r56 == false) goto L263;
    L266:
        Object r113 = (Function0) new BasicTextKt$LayoutWithLinksAndInlineContent$3$1(r3);
        r7.updateRememberedValue(r113);
        r57 = r113;
    L267:
        ComposerKt.sourceInformationMarkerEnd(r7);
        LinksTextMeasurePolicy r58 = new LinksTextMeasurePolicy((Function0) r57);
        r7.endReplaceGroup();
        TextMeasurePolicy r59 = r58;
    L283:
        ComposerKt.sourceInformationMarkerStart(r7, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
        int r60 = ComposablesKt.getCurrentCompositeKeyHash(r7, r48 ? 1 : 0);
        CompositionLocalMap r61 = r7.getCurrentCompositionLocalMap();
        Modifier r114 = ComposedModifierKt.materializeModifier(r7, r55);
        Function0<ComposeUiNode> r115 = ComposeUiNode.Companion.getConstructor();
        int r116 = (((r48 ? 1 : 0) << 6) & 896) | 6;
        ComposerKt.sourceInformationMarkerStart(r7, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
        if ((r7.getApplier() instanceof Applier) == true) goto L286;
        ComposablesKt.invalidApplier();
    L286:
        r7.startReusableNode();
        if (r7.getInserting() == false) goto L289;
        r7.createNode(r115);
    L290:
        Composer r62 = Updater.m3808constructorimpl(r7);
        Composer r117 = r7;
        Updater.m3815setimpl(r62, r59, ComposeUiNode.Companion.getSetMeasurePolicy());
        Updater.m3815setimpl(r62, r61, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> r63 = ComposeUiNode.Companion.getSetCompositeKeyHash();
        if (r62.getInserting() == true) goto L297;
        if (Intrinsics.areEqual(r62.rememberedValue(), Integer.valueOf(r60)) == false) goto L297;
    L298:
        Updater.m3815setimpl(r62, r114, ComposeUiNode.Companion.getSetModifier());
        int r64 = (r116 >> 6) & 14;
        ComposerKt.sourceInformationMarkerStart(r117, -509599868, "C:BasicText.kt#423gt5");
        if (r3 != null) goto L301;
        r117.startReplaceGroup(-509592027);
        r117.endReplaceGroup();
    L302:
        if (r24 != null) goto L304;
        r117.startReplaceGroup(-509541249);
        r117.endReplaceGroup();
    L305:
        ComposerKt.sourceInformationMarkerEnd(r117);
        r117.endNode();
        ComposerKt.sourceInformationMarkerEnd(r117);
        ComposerKt.sourceInformationMarkerEnd(r117);
        if (ComposerKt.isTraceInProgress() == false) goto L308;
        ComposerKt.traceEventEnd();
    L308:
        final Map<String, InlineTextContent> r65 = r2;
        Composer r118 = r117;
    L310:
        ScopeUpdateScope r66 = r118.endRestartGroup();
        if (r66 == null) goto L314;
        r66.updateScope(new BasicTextKt$LayoutWithLinksAndInlineContent$6(r29, r30, r31, r32, r65, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r45, r46, r47));
        return;
    L314:
        return;
    L304:
        r117.startReplaceGroup(-509541248);
        ComposerKt.sourceInformation(r117, "*665@27886L48");
        AnnotatedStringResolveInlineContentKt.InlineChildren(r30, r24, r117, (r210 >> 3) & 14);
        Unit r67 = Unit.INSTANCE;
        r117.endReplaceGroup();
        Unit r68 = Unit.INSTANCE;
        goto L305
    L301:
        r117.startReplaceGroup(537750876);
        ComposerKt.sourceInformation(r117, "664@27830L18");
        r3.LinksComposables(r117, 0);
        r117.endReplaceGroup();
        Unit r69 = Unit.INSTANCE;
    L297:
        r62.updateRememberedValue(Integer.valueOf(r60));
        r62.apply(Integer.valueOf(r60), r63);
        goto L298
    L289:
        r7.useNode();
        goto L290
    L263:
        if (r57 != Composer.Companion.getEmpty()) goto L267;
    L268:
        r7.startReplaceGroup(-611365560);
        ComposerKt.sourceInformation(r7, "694@29038L55,695@29128L39");
        ComposerKt.sourceInformationMarkerStart(r7, -296813822, "CC(remember):BasicText.kt#9igjgp");
        boolean r70 = r7.changedInstance(r3);
        Object r71 = r7.rememberedValue();
        if (r70 == false) goto L271;
    L274:
        Object r119 = (Function0) new BasicTextKt$LayoutWithLinksAndInlineContent$4$1(r3);
        r7.updateRememberedValue(r119);
        r71 = r119;
    L275:
        Function0 r72 = (Function0) r71;
        ComposerKt.sourceInformationMarkerEnd(r7);
        ComposerKt.sourceInformationMarkerStart(r7, -296810958, "CC(remember):BasicText.kt#9igjgp");
        boolean r73 = r7.changed(r28);
        Object r74 = r7.rememberedValue();
        if (r73 == false) goto L278;
    L281:
        Object r120 = (Function0) new BasicTextKt$LayoutWithLinksAndInlineContent$5$1(r28);
        r7.updateRememberedValue(r120);
        r74 = r120;
    L282:
        ComposerKt.sourceInformationMarkerEnd(r7);
        TextMeasurePolicy r75 = new TextMeasurePolicy(r72, (Function0) r74);
        r7.endReplaceGroup();
        r59 = r75;
        goto L283
    L278:
        if (r74 != Composer.Companion.getEmpty()) goto L282;
    L271:
        if (r71 != Composer.Companion.getEmpty()) goto L275;
    L256:
        r112 = r51;
        goto L257
    L240:
        if (r50 != Composer.Companion.getEmpty()) goto L244;
    L245:
        r7.startReplaceGroup(-612554318);
        r7.endReplaceGroup();
        r111 = r26;
        goto L246
    L232:
        r110 = r25;
        r26 = null;
        goto L233
    L234:
        r26 = null;
        r7.startReplaceGroup(-612718990);
        r7.endReplaceGroup();
        r28 = null;
        goto L236
    L226:
        r22 = new Pair(null, null);
        goto L227
    L205:
        if (r19 != Composer.Companion.getEmpty()) goto L209;
    L201:
        r5 = r48;
        goto L202
    L210:
        r7.startReplaceGroup(-613122857);
        ComposerKt.sourceInformation(r7, "643@27209L8");
        ComposerKt.sourceInformationMarkerStart(r7, -296872397, "CC(remember):BasicText.kt#9igjgp");
        if ((r8 & 112) != 32) goto L213;
        boolean r76 = true;
    L214:
        Object r121 = r7.rememberedValue();
        if (r76 == true) goto L221;
        if (r121 == Composer.Companion.getEmpty()) goto L221;
    L222:
        r21 = (Function0) r121;
        ComposerKt.sourceInformationMarkerEnd(r7);
        r7.endReplaceGroup();
    L221:
        Object r77 = (Function0) new BasicTextKt$LayoutWithLinksAndInlineContent$styledText$2$1(r30);
        r7.updateRememberedValue(r77);
        r121 = r77;
        goto L222
    L213:
        r76 = r48;
    L193:
        Object r78 = new TextLinkScope(r30);
        r7.updateRememberedValue(r78);
        r15 = r78;
        goto L194
    L185:
        r4 = false;
        goto L186
    L195:
        r48 = false;
        r7.startReplaceGroup(-613418350);
        r7.endReplaceGroup();
        r3 = null;
        goto L197
    L176:
        r2 = r14;
        goto L178
    L309:
        Composer r122 = r7;
        r122.skipToGroupEnd();
        r65 = r14;
        r118 = r122;
        goto L310
    L168:
        if ((r0 & 9363) != 9362) goto L171;
        r1 = false;
        goto L173
    L156:
        if ((r46 & 24576) != 0) goto L165;
        if ((32768 & r46) != 0) goto L160;
        boolean r79 = r7.changed(r43);
    L161:
        if (r79 == true) goto L164;
        r20 = 8192;
    L164:
        r9 = r9 | r20;
        goto L165
    L160:
        r79 = r7.changedInstance(r43);
        goto L161
    L145:
        if ((r46 & 3072) != 0) goto L153;
        if (r7.changedInstance(r42) == true) goto L150;
        r18 = 1024;
    L150:
        r9 = r9 | r18;
        goto L153
    L135:
        if ((r46 & 384) != 0) goto L142;
        if (r7.changedInstance(r41) == false) goto L139;
        r16 = 256;
    L139:
        r9 = r9 | r16;
        goto L142
    L124:
        if ((r46 & 48) != 0) goto L132;
        if (r7.changedInstance(r40) == false) goto L128;
        int r123 = 32;
    L129:
        r9 = r9 | r123;
        goto L132
    L128:
        r123 = 16;
        goto L129
    L113:
        if ((r46 & 6) != 0) goto L121;
        if (r7.changedInstance(r39) == false) goto L117;
        int r211 = 4;
    L118:
        r9 = r9 | r211;
        goto L121
    L117:
        r211 = 2;
        goto L118
    L102:
        if ((r45 & 805306368) != 0) goto L110;
        if (r7.changed(r38) == false) goto L106;
        int r212 = 536870912;
    L107:
        r8 = r8 | r212;
        goto L110
    L106:
        r212 = 268435456;
        goto L107
    L91:
        if ((r45 & 100663296) != 0) goto L99;
        if (r7.changed(r37) == false) goto L95;
        int r213 = AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
    L96:
        r8 = r8 | r213;
        goto L99
    L95:
        r213 = 33554432;
        goto L96
    L80:
        if ((12582912 & r45) != 0) goto L88;
        if (r7.changed(r36) == false) goto L84;
        int r214 = 8388608;
    L85:
        r8 = r8 | r214;
        goto L88
    L84:
        r214 = 4194304;
        goto L85
    L69:
        if ((r45 & 1572864) != 0) goto L75;
        r11 = r35;
        if (r7.changed(r11) == false) goto L73;
        int r215 = 1048576;
    L74:
        r8 = r8 | r215;
        goto L77
    L73:
        r215 = 524288;
        goto L74
    L75:
        r11 = r35;
        goto L77
    L58:
        if ((r45 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) != 0) goto L64;
        r12 = r34;
        if (r7.changed(r12) == false) goto L62;
        int r216 = 131072;
    L63:
        r8 = r8 | r216;
        goto L66
    L62:
        r216 = 65536;
        goto L63
    L64:
        r12 = r34;
        goto L66
    L47:
        if ((r45 & 24576) != 0) goto L53;
        r14 = r33;
        if (r7.changedInstance(r14) == false) goto L51;
        int r217 = 16384;
    L52:
        r8 = r8 | r217;
        goto L55
    L51:
        r217 = 8192;
        goto L52
    L53:
        r14 = r33;
        goto L55
    L37:
        if ((r45 & 3072) != 0) goto L43;
        if (r7.changed(r32) == false) goto L41;
        int r124 = 2048;
    L42:
        r8 = r8 | r124;
        goto L43
    L41:
        r124 = 1024;
        goto L42
    L27:
        if ((r45 & 384) != 0) goto L33;
        if (r7.changedInstance(r31) == false) goto L31;
        int r125 = 256;
    L32:
        r8 = r8 | r125;
        goto L33
    L31:
        r125 = 128;
        goto L32
    L17:
        if ((r45 & 48) != 0) goto L23;
        if (r7.changed(r30) == false) goto L21;
        int r126 = 32;
    L22:
        r8 = r8 | r126;
        goto L23
    L21:
        r126 = 16;
        goto L22
    L6:
        if ((r45 & 6) != 0) goto L12;
        r10 = r29;
        if (r7.changed(r10) == false) goto L10;
        int r127 = 4;
    L11:
        r8 = r8 | r127;
        goto L14
    L10:
        r127 = 2;
        goto L11
    L12:
        r10 = r29;
        goto L14
    }
}
