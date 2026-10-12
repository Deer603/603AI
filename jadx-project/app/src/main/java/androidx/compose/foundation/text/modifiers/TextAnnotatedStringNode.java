package androidx.compose.foundation.text.modifiers;

import androidx.compose.foundation.text.TextAutoSize;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.RectKt;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorProducer;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import androidx.compose.ui.graphics.drawscope.Fill;
import androidx.compose.ui.layout.AlignmentLine;
import androidx.compose.ui.layout.AlignmentLineKt;
import androidx.compose.ui.layout.HorizontalAlignmentLine;
import androidx.compose.ui.layout.IntrinsicMeasurable;
import androidx.compose.ui.layout.IntrinsicMeasureScope;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.DrawModifierNode;
import androidx.compose.ui.node.DrawModifierNodeKt;
import androidx.compose.ui.node.LayoutModifierNode;
import androidx.compose.ui.node.LayoutModifierNodeKt;
import androidx.compose.ui.node.SemanticsModifierNode;
import androidx.compose.ui.node.SemanticsModifierNodeKt;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.MultiParagraph;
import androidx.compose.ui.text.Placeholder;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextOverflow;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Density;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: TextAnnotatedStringNode.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000Î\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010!\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0001mBÑ\u0001\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0016\b\u0002\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e\u0018\u00010\f\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0012\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0014\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0014\u0012\u0016\b\u0002\u0010\u0016\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00190\u0018\u0018\u00010\u0017\u0012\u001e\b\u0002\u0010\u001a\u001a\u0018\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u001b0\u0017\u0012\u0004\u0012\u00020\u000e\u0018\u00010\f\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001d\u0012\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001f\u0012\n\b\u0002\u0010 \u001a\u0004\u0018\u00010!\u0012\u0016\b\u0002\u0010\"\u001a\u0010\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020\u000e\u0018\u00010\f¢\u0006\u0002\u0010$J\r\u0010:\u001a\u00020\u000eH\u0000¢\u0006\u0002\b;J&\u0010<\u001a\u00020\u000e2\u0006\u0010=\u001a\u00020\u00122\u0006\u0010>\u001a\u00020\u00122\u0006\u0010?\u001a\u00020\u00122\u0006\u0010@\u001a\u00020\u0012J\u000e\u0010A\u001a\u00020\u000e2\u0006\u0010B\u001a\u00020CJ\u0010\u0010-\u001a\u00020&2\u0006\u0010D\u001a\u00020EH\u0002J\b\u0010F\u001a\u00020\u000eH\u0002J\u001e\u0010G\u001a\u00020\u00142\u0006\u0010H\u001a\u00020I2\u0006\u0010J\u001a\u00020K2\u0006\u0010L\u001a\u00020\u0014J\u001e\u0010M\u001a\u00020\u00142\u0006\u0010H\u001a\u00020I2\u0006\u0010J\u001a\u00020K2\u0006\u0010N\u001a\u00020\u0014J(\u0010O\u001a\u00020P2\u0006\u0010Q\u001a\u00020R2\u0006\u0010J\u001a\u00020S2\u0006\u0010T\u001a\u00020Uø\u0001\u0000¢\u0006\u0004\bV\u0010WJ\u001e\u0010X\u001a\u00020\u00142\u0006\u0010H\u001a\u00020I2\u0006\u0010J\u001a\u00020K2\u0006\u0010L\u001a\u00020\u0014J\u001e\u0010Y\u001a\u00020\u00142\u0006\u0010H\u001a\u00020I2\u0006\u0010J\u001a\u00020K2\u0006\u0010N\u001a\u00020\u0014J\u0010\u0010Z\u001a\u00020\u00122\u0006\u0010[\u001a\u00020\u0006H\u0002JZ\u0010\\\u001a\u00020\u00122\u0014\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e\u0018\u00010\f2\u001c\u0010\u001a\u001a\u0018\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u001b0\u0017\u0012\u0004\u0012\u00020\u000e\u0018\u00010\f2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001d2\u0014\u0010\"\u001a\u0010\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020\u000e\u0018\u00010\fJ\u0018\u0010]\u001a\u00020\u00122\b\u0010^\u001a\u0004\u0018\u00010\u001f2\u0006\u0010\u0007\u001a\u00020\bJ`\u0010_\u001a\u00020\u00122\u0006\u0010\u0007\u001a\u00020\b2\u0014\u0010\u0016\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00190\u0018\u0018\u00010\u00172\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\u00102\b\u0010 \u001a\u0004\u0018\u00010!ø\u0001\u0000¢\u0006\u0004\b`\u0010aJ\u0015\u0010b\u001a\u00020\u00122\u0006\u0010\u0005\u001a\u00020\u0006H\u0000¢\u0006\u0002\bcJ\f\u0010d\u001a\u00020\u000e*\u00020eH\u0016J\f\u0010f\u001a\u00020\u000e*\u00020CH\u0016J\u001c\u0010g\u001a\u00020\u0014*\u00020I2\u0006\u0010J\u001a\u00020K2\u0006\u0010L\u001a\u00020\u0014H\u0016J\u001c\u0010h\u001a\u00020\u0014*\u00020I2\u0006\u0010J\u001a\u00020K2\u0006\u0010N\u001a\u00020\u0014H\u0016J&\u0010i\u001a\u00020P*\u00020R2\u0006\u0010J\u001a\u00020S2\u0006\u0010T\u001a\u00020UH\u0016ø\u0001\u0000¢\u0006\u0004\bj\u0010WJ\u001c\u0010k\u001a\u00020\u0014*\u00020I2\u0006\u0010J\u001a\u00020K2\u0006\u0010L\u001a\u00020\u0014H\u0016J\u001c\u0010l\u001a\u00020\u0014*\u00020I2\u0006\u0010J\u001a\u00020K2\u0006\u0010N\u001a\u00020\u0014H\u0016R\u0010\u0010%\u001a\u0004\u0018\u00010&X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010 \u001a\u0004\u0018\u00010!X\u0082\u000e¢\u0006\u0002\n\u0000R\"\u0010'\u001a\u0010\u0012\u0004\u0012\u00020)\u0012\u0004\u0012\u00020\u0014\u0018\u00010(X\u0082\u000e¢\u0006\b\n\u0000\u0012\u0004\b*\u0010+R\u000e\u0010\t\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010,\u001a\u00020&8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b-\u0010.R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0014X\u0082\u000e¢\u0006\u0002\n\u0000R$\u0010\u001a\u001a\u0018\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u001b0\u0017\u0012\u0004\u0012\u00020\u000e\u0018\u00010\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\"\u001a\u0010\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020\u000e\u0018\u00010\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e\u0018\u00010\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u000f\u001a\u00020\u0010X\u0082\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\n\u0002\u0010/R\u0010\u0010\u001e\u001a\u0004\u0018\u00010\u001fX\u0082\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\u0016\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00190\u0018\u0018\u00010\u0017X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001c\u001a\u0004\u0018\u00010\u001dX\u0082\u000e¢\u0006\u0002\n\u0000R\"\u00100\u001a\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r01\u0012\u0004\u0012\u00020\u0012\u0018\u00010\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u00102\u001a\u00020\u00128VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b3\u00104R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u001c\u00105\u001a\u0004\u0018\u00010#X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b6\u00107\"\u0004\b8\u00109\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006n"}, d2 = {"Landroidx/compose/foundation/text/modifiers/TextAnnotatedStringNode;", "Landroidx/compose/ui/Modifier$Node;", "Landroidx/compose/ui/node/LayoutModifierNode;", "Landroidx/compose/ui/node/DrawModifierNode;", "Landroidx/compose/ui/node/SemanticsModifierNode;", "text", "Landroidx/compose/ui/text/AnnotatedString;", "style", "Landroidx/compose/ui/text/TextStyle;", "fontFamilyResolver", "Landroidx/compose/ui/text/font/FontFamily$Resolver;", "onTextLayout", "Lkotlin/Function1;", "Landroidx/compose/ui/text/TextLayoutResult;", "", "overflow", "Landroidx/compose/ui/text/style/TextOverflow;", "softWrap", "", "maxLines", "", "minLines", "placeholders", "", "Landroidx/compose/ui/text/AnnotatedString$Range;", "Landroidx/compose/ui/text/Placeholder;", "onPlaceholderLayout", "Landroidx/compose/ui/geometry/Rect;", "selectionController", "Landroidx/compose/foundation/text/modifiers/SelectionController;", "overrideColor", "Landroidx/compose/ui/graphics/ColorProducer;", "autoSize", "Landroidx/compose/foundation/text/TextAutoSize;", "onShowTranslation", "Landroidx/compose/foundation/text/modifiers/TextAnnotatedStringNode$TextSubstitutionValue;", "(Landroidx/compose/ui/text/AnnotatedString;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/font/FontFamily$Resolver;Lkotlin/jvm/functions/Function1;IZIILjava/util/List;Lkotlin/jvm/functions/Function1;Landroidx/compose/foundation/text/modifiers/SelectionController;Landroidx/compose/ui/graphics/ColorProducer;Landroidx/compose/foundation/text/TextAutoSize;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "_layoutCache", "Landroidx/compose/foundation/text/modifiers/MultiParagraphLayoutCache;", "baselineCache", "", "Landroidx/compose/ui/layout/AlignmentLine;", "getBaselineCache$annotations", "()V", "layoutCache", "getLayoutCache", "()Landroidx/compose/foundation/text/modifiers/MultiParagraphLayoutCache;", "I", "semanticsTextLayoutResult", "", "shouldAutoInvalidate", "getShouldAutoInvalidate", "()Z", "textSubstitution", "getTextSubstitution$foundation_release", "()Landroidx/compose/foundation/text/modifiers/TextAnnotatedStringNode$TextSubstitutionValue;", "setTextSubstitution$foundation_release", "(Landroidx/compose/foundation/text/modifiers/TextAnnotatedStringNode$TextSubstitutionValue;)V", "clearSubstitution", "clearSubstitution$foundation_release", "doInvalidations", "drawChanged", "textChanged", "layoutChanged", "callbacksChanged", "drawNonExtension", "contentDrawScope", "Landroidx/compose/ui/graphics/drawscope/ContentDrawScope;", "density", "Landroidx/compose/ui/unit/Density;", "invalidateForTranslate", "maxIntrinsicHeightNonExtension", "intrinsicMeasureScope", "Landroidx/compose/ui/layout/IntrinsicMeasureScope;", "measurable", "Landroidx/compose/ui/layout/IntrinsicMeasurable;", "width", "maxIntrinsicWidthNonExtension", "height", "measureNonExtension", "Landroidx/compose/ui/layout/MeasureResult;", "measureScope", "Landroidx/compose/ui/layout/MeasureScope;", "Landroidx/compose/ui/layout/Measurable;", "constraints", "Landroidx/compose/ui/unit/Constraints;", "measureNonExtension-3p2s80s", "(Landroidx/compose/ui/layout/MeasureScope;Landroidx/compose/ui/layout/Measurable;J)Landroidx/compose/ui/layout/MeasureResult;", "minIntrinsicHeightNonExtension", "minIntrinsicWidthNonExtension", "setSubstitution", "updatedText", "updateCallbacks", "updateDraw", "color", "updateLayoutRelatedArgs", "updateLayoutRelatedArgs-y0k-MQk", "(Landroidx/compose/ui/text/TextStyle;Ljava/util/List;IIZLandroidx/compose/ui/text/font/FontFamily$Resolver;ILandroidx/compose/foundation/text/TextAutoSize;)Z", "updateText", "updateText$foundation_release", "applySemantics", "Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;", "draw", "maxIntrinsicHeight", "maxIntrinsicWidth", "measure", "measure-3p2s80s", "minIntrinsicHeight", "minIntrinsicWidth", "TextSubstitutionValue", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class TextAnnotatedStringNode extends Modifier.Node implements LayoutModifierNode, DrawModifierNode, SemanticsModifierNode {
    public static final int $stable = 0;
    private MultiParagraphLayoutCache _layoutCache;
    private TextAutoSize autoSize;
    private Map<AlignmentLine, Integer> baselineCache;
    private FontFamily.Resolver fontFamilyResolver;
    private int maxLines;
    private int minLines;
    private Function1<? super List<Rect>, Unit> onPlaceholderLayout;
    private Function1<? super TextSubstitutionValue, Unit> onShowTranslation;
    private Function1<? super TextLayoutResult, Unit> onTextLayout;
    private int overflow;
    private ColorProducer overrideColor;
    private List<AnnotatedString.Range<Placeholder>> placeholders;
    private SelectionController selectionController;
    private Function1<? super List<TextLayoutResult>, Boolean> semanticsTextLayoutResult;
    private boolean softWrap;
    private TextStyle style;
    private AnnotatedString text;
    private TextSubstitutionValue textSubstitution;

    /* JADX INFO: compiled from: TextAnnotatedStringNode.kt */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0002\u0010\tJ\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0006HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\bHÆ\u0003J3\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bHÆ\u0001J\u0013\u0010\u001b\u001a\u00020\u00062\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001J\t\u0010\u001f\u001a\u00020 HÖ\u0001R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\n\"\u0004\b\u000b\u0010\fR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0012\"\u0004\b\u0014\u0010\u0015¨\u0006!"}, d2 = {"Landroidx/compose/foundation/text/modifiers/TextAnnotatedStringNode$TextSubstitutionValue;", "", "original", "Landroidx/compose/ui/text/AnnotatedString;", "substitution", "isShowingSubstitution", "", "layoutCache", "Landroidx/compose/foundation/text/modifiers/MultiParagraphLayoutCache;", "(Landroidx/compose/ui/text/AnnotatedString;Landroidx/compose/ui/text/AnnotatedString;ZLandroidx/compose/foundation/text/modifiers/MultiParagraphLayoutCache;)V", "()Z", "setShowingSubstitution", "(Z)V", "getLayoutCache", "()Landroidx/compose/foundation/text/modifiers/MultiParagraphLayoutCache;", "setLayoutCache", "(Landroidx/compose/foundation/text/modifiers/MultiParagraphLayoutCache;)V", "getOriginal", "()Landroidx/compose/ui/text/AnnotatedString;", "getSubstitution", "setSubstitution", "(Landroidx/compose/ui/text/AnnotatedString;)V", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "", "toString", "", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class TextSubstitutionValue {
        public static final int $stable = 0;
        private boolean isShowingSubstitution;
        private MultiParagraphLayoutCache layoutCache;
        private final AnnotatedString original;
        private AnnotatedString substitution;

        static {
            $stable = 8;
        }

        public static /* synthetic */ TextSubstitutionValue copy$default(TextSubstitutionValue r0, AnnotatedString r1, AnnotatedString r2, boolean r3, MultiParagraphLayoutCache r4, int r5, Object r6) {
            if ((r5 & 1) == 0) goto L6;
            r1 = r0.original;
        L6:
            if ((r5 & 2) == 0) goto L9;
            r2 = r0.substitution;
        L9:
            if ((r5 & 4) == 0) goto L12;
            r3 = r0.isShowingSubstitution;
        L12:
            if ((r5 & 8) == 0) goto L15;
            r4 = r0.layoutCache;
        L15:
            return r0.copy(r1, r2, r3, r4);
        }

        public final AnnotatedString component1() {
            return this.original;
        }

        public final AnnotatedString component2() {
            return this.substitution;
        }

        public final boolean component3() {
            return this.isShowingSubstitution;
        }

        public final MultiParagraphLayoutCache component4() {
            return this.layoutCache;
        }

        public final TextSubstitutionValue copy(AnnotatedString r2, AnnotatedString r3, boolean r4, MultiParagraphLayoutCache r5) {
            return new TextSubstitutionValue(r2, r3, r4, r5);
        }

        public boolean equals(Object r6) {
            if (this != r6) goto L6;
            return true;
        L6:
            if ((r6 instanceof TextSubstitutionValue) == true) goto L8;
            return false;
        L8:
            TextSubstitutionValue r1 = (TextSubstitutionValue) r6;
            if (Intrinsics.areEqual(this.original, r1.original) == true) goto L12;
            return false;
        L12:
            if (Intrinsics.areEqual(this.substitution, r1.substitution) == true) goto L15;
            return false;
        L15:
            if (this.isShowingSubstitution == r1.isShowingSubstitution) goto L18;
            return false;
        L18:
            if (Intrinsics.areEqual(this.layoutCache, r1.layoutCache) == true) goto L20;
            return false;
        L20:
            return true;
        }

        public int hashCode() {
            int r1 = ((((this.original.hashCode() * 31) + this.substitution.hashCode()) * 31) + Boolean.hashCode(this.isShowingSubstitution)) * 31;
            if (this.layoutCache != null) goto L5;
            int r2 = 0;
        L7:
            return r1 + r2;
        L5:
            r2 = this.layoutCache.hashCode();
            goto L7
        }

        public String toString() {
            return "TextSubstitutionValue(original=" + this.original + ", substitution=" + this.substitution + ", isShowingSubstitution=" + this.isShowingSubstitution + ", layoutCache=" + this.layoutCache + ')';
        }

        public TextSubstitutionValue(AnnotatedString original, AnnotatedString substitution, boolean isShowingSubstitution, MultiParagraphLayoutCache layoutCache) {
            this.original = original;
            this.substitution = substitution;
            this.isShowingSubstitution = isShowingSubstitution;
            this.layoutCache = layoutCache;
        }

        public /* synthetic */ TextSubstitutionValue(AnnotatedString r1, AnnotatedString r2, boolean r3, MultiParagraphLayoutCache r4, int r5, DefaultConstructorMarker r6) {
            if ((r5 & 4) == 0) goto L6;
            r3 = false;
        L6:
            if ((r5 & 8) == 0) goto L8;
            r4 = null;
        L8:
            this(r1, r2, r3, r4);
        }

        public final AnnotatedString getOriginal() {
            return this.original;
        }

        public final AnnotatedString getSubstitution() {
            return this.substitution;
        }

        public final void setSubstitution(AnnotatedString r1) {
            this.substitution = r1;
        }

        public final boolean isShowingSubstitution() {
            return this.isShowingSubstitution;
        }

        public final void setShowingSubstitution(boolean r1) {
            this.isShowingSubstitution = r1;
        }

        public final MultiParagraphLayoutCache getLayoutCache() {
            return this.layoutCache;
        }

        public final void setLayoutCache(MultiParagraphLayoutCache r1) {
            this.layoutCache = r1;
        }
    }

    static {
        $stable = 8;
    }

    public /* synthetic */ TextAnnotatedStringNode(AnnotatedString r1, TextStyle r2, FontFamily.Resolver r3, Function1 r4, int r5, boolean r6, int r7, int r8, List r9, Function1 r10, SelectionController r11, ColorProducer r12, TextAutoSize r13, Function1 r14, DefaultConstructorMarker r15) {
        this(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14);
    }

    private static /* synthetic */ void getBaselineCache$annotations() {
    }

    public /* synthetic */ TextAnnotatedStringNode(AnnotatedString r20, TextStyle r21, FontFamily.Resolver r22, Function1 r23, int r24, boolean r25, int r26, int r27, List r28, Function1 r29, SelectionController r30, ColorProducer r31, TextAutoSize r32, Function1 r33, int r34, DefaultConstructorMarker r35) {
        if ((r34 & 8) == 0) goto L5;
        Function1 r7 = null;
    L7:
        if ((r34 & 16) == 0) goto L9;
        int r8 = TextOverflow.Companion.m6886getClipgIe3tQ8();
    L11:
        if ((r34 & 32) == 0) goto L13;
        boolean r9 = true;
    L15:
        if ((r34 & 64) == 0) goto L17;
        int r10 = Integer.MAX_VALUE;
    L19:
        if ((r34 & 128) == 0) goto L21;
        int r11 = 1;
    L23:
        if ((r34 & 256) == 0) goto L25;
        List r12 = null;
    L27:
        if ((r34 & 512) == 0) goto L29;
        Function1 r13 = null;
    L31:
        if ((r34 & 1024) == 0) goto L33;
        SelectionController r14 = null;
    L35:
        if ((r34 & 2048) == 0) goto L37;
        ColorProducer r15 = null;
    L39:
        if ((r34 & 4096) == 0) goto L41;
        TextAutoSize r16 = null;
    L43:
        if ((r34 & 8192) == 0) goto L45;
        Function1 r17 = null;
    L46:
        this(r20, r21, r22, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, null);
        return;
    L45:
        r17 = r33;
        goto L46
    L41:
        r16 = r32;
        goto L43
    L37:
        r15 = r31;
        goto L39
    L33:
        r14 = r30;
        goto L35
    L29:
        r13 = r29;
        goto L31
    L25:
        r12 = r28;
        goto L27
    L21:
        r11 = r27;
        goto L23
    L17:
        r10 = r26;
        goto L19
    L13:
        r9 = r25;
        goto L15
    L9:
        r8 = r24;
        goto L11
    L5:
        r7 = r23;
        goto L7
    }

    public static final /* synthetic */ MultiParagraphLayoutCache access$getLayoutCache(TextAnnotatedStringNode $this) {
        return $this.getLayoutCache();
    }

    public static final /* synthetic */ Function1 access$getOnShowTranslation$p(TextAnnotatedStringNode $this) {
        return $this.onShowTranslation;
    }

    public static final /* synthetic */ ColorProducer access$getOverrideColor$p(TextAnnotatedStringNode $this) {
        return $this.overrideColor;
    }

    public static final /* synthetic */ TextStyle access$getStyle$p(TextAnnotatedStringNode $this) {
        return $this.style;
    }

    public static final /* synthetic */ void access$invalidateForTranslate(TextAnnotatedStringNode $this) {
        $this.invalidateForTranslate();
    }

    public static final /* synthetic */ boolean access$setSubstitution(TextAnnotatedStringNode $this, AnnotatedString updatedText) {
        return $this.setSubstitution(updatedText);
    }

    private TextAnnotatedStringNode(AnnotatedString text, TextStyle style, FontFamily.Resolver fontFamilyResolver, Function1<? super TextLayoutResult, Unit> r4, int overflow, boolean softWrap, int maxLines, int minLines, List<AnnotatedString.Range<Placeholder>> r9, Function1<? super List<Rect>, Unit> r10, SelectionController selectionController, ColorProducer overrideColor, TextAutoSize autoSize, Function1<? super TextSubstitutionValue, Unit> r14) {
        this.text = text;
        this.style = style;
        this.fontFamilyResolver = fontFamilyResolver;
        this.onTextLayout = r4;
        this.overflow = overflow;
        this.softWrap = softWrap;
        this.maxLines = maxLines;
        this.minLines = minLines;
        this.placeholders = r9;
        this.onPlaceholderLayout = r10;
        this.selectionController = selectionController;
        this.overrideColor = overrideColor;
        this.autoSize = autoSize;
        this.onShowTranslation = r14;
    }

    @Override // androidx.compose.ui.Modifier.Node
    public boolean getShouldAutoInvalidate() {
        return false;
    }

    private final MultiParagraphLayoutCache getLayoutCache() {
        if (this._layoutCache != null) goto L5;
        this._layoutCache = new MultiParagraphLayoutCache(this.text, this.style, this.fontFamilyResolver, this.overflow, this.softWrap, this.maxLines, this.minLines, this.placeholders, this.autoSize, null);
    L5:
        MultiParagraphLayoutCache r0 = this._layoutCache;
        Intrinsics.checkNotNull(r0);
        return r0;
    }

    private final MultiParagraphLayoutCache getLayoutCache(Density density) {
        TextSubstitutionValue textSubstitutionValue = this.textSubstitution;
        if (textSubstitutionValue != null) goto L5;
    L12:
        MultiParagraphLayoutCache it = getLayoutCache();
        it.setDensity$foundation_release(density);
        return it;
    L5:
        if (textSubstitutionValue.isShowingSubstitution() == false) goto L12;
        MultiParagraphLayoutCache cache = textSubstitutionValue.getLayoutCache();
        if (cache == null) goto L12;
        cache.setDensity$foundation_release(density);
        return cache;
    }

    public final boolean updateDraw(ColorProducer color, TextStyle style) {
        boolean changed = false;
        if (Intrinsics.areEqual(color, this.overrideColor) == true) goto L5;
        changed = true;
    L5:
        this.overrideColor = color;
        if (changed == false) goto L8;
    L11:
        return true;
    L8:
        if (style.hasSameDrawAffectingAttributes(this.style) == false) goto L11;
        return false;
    }

    public final boolean updateText$foundation_release(AnnotatedString text) {
        boolean anyDiff = true;
        boolean charDiff = !Intrinsics.areEqual(this.text.getText(), text.getText());
        boolean annotationDiff = !this.text.hasEqualAnnotations(text);
        if (charDiff == true) goto L7;
        if (annotationDiff == true) goto L7;
        anyDiff = false;
    L7:
        if (anyDiff == false) goto L9;
        this.text = text;
    L9:
        if (charDiff == false) goto L11;
        clearSubstitution$foundation_release();
    L11:
        return anyDiff;
    }

    /* JADX INFO: renamed from: updateLayoutRelatedArgs-y0k-MQk, reason: not valid java name */
    public final boolean m1426updateLayoutRelatedArgsy0kMQk(TextStyle style, List<AnnotatedString.Range<Placeholder>> r4, int minLines, int maxLines, boolean softWrap, FontFamily.Resolver fontFamilyResolver, int overflow, TextAutoSize autoSize) {
        boolean changed = !this.style.hasSameLayoutAffectingAttributes(style);
        this.style = style;
        if (Intrinsics.areEqual(this.placeholders, r4) == true) goto L6;
        this.placeholders = r4;
        changed = true;
    L6:
        if (this.minLines == minLines) goto L9;
        this.minLines = minLines;
        changed = true;
    L9:
        if (this.maxLines == maxLines) goto L12;
        this.maxLines = maxLines;
        changed = true;
    L12:
        if (this.softWrap == softWrap) goto L15;
        this.softWrap = softWrap;
        changed = true;
    L15:
        if (Intrinsics.areEqual(this.fontFamilyResolver, fontFamilyResolver) == true) goto L18;
        this.fontFamilyResolver = fontFamilyResolver;
        changed = true;
    L18:
        if (TextOverflow.m6877equalsimpl0(this.overflow, overflow) == true) goto L21;
        this.overflow = overflow;
        changed = true;
    L21:
        if (Intrinsics.areEqual(this.autoSize, autoSize) == true) goto L24;
        this.autoSize = autoSize;
        return true;
    L24:
        return changed;
    }

    public final boolean updateCallbacks(Function1<? super TextLayoutResult, Unit> r3, Function1<? super List<Rect>, Unit> r4, SelectionController selectionController, Function1<? super TextSubstitutionValue, Unit> r6) {
        boolean changed = false;
        if (this.onTextLayout == r3) goto L6;
        this.onTextLayout = r3;
        changed = true;
    L6:
        if (this.onPlaceholderLayout == r4) goto L9;
        this.onPlaceholderLayout = r4;
        changed = true;
    L9:
        if (Intrinsics.areEqual(this.selectionController, selectionController) == true) goto L12;
        this.selectionController = selectionController;
        changed = true;
    L12:
        if (this.onShowTranslation == r6) goto L15;
        this.onShowTranslation = r6;
        return true;
    L15:
        return changed;
    }

    public final void doInvalidations(boolean drawChanged, boolean textChanged, boolean layoutChanged, boolean callbacksChanged) {
        if (textChanged == true) goto L5;
        if (layoutChanged == true) goto L5;
        if (callbacksChanged == true) goto L5;
    L7:
        if (isAttached() == true) goto L9;
        return;
    L9:
        if (textChanged == true) goto L13;
        if (drawChanged == true) goto L12;
    L14:
        if (textChanged == true) goto L17;
        if (layoutChanged == true) goto L17;
        if (callbacksChanged == true) goto L17;
    L18:
        if (drawChanged == false) goto L21;
        DrawModifierNodeKt.invalidateDraw(this);
        return;
    L21:
        return;
    L17:
        LayoutModifierNodeKt.invalidateMeasurement(this);
        DrawModifierNodeKt.invalidateDraw(this);
        goto L18
    L12:
        if (this.semanticsTextLayoutResult == null) goto L14;
    L13:
        SemanticsModifierNodeKt.invalidateSemantics(this);
    L5:
        getLayoutCache().m1409updateJ2qo7bo(this.text, this.style, this.fontFamilyResolver, this.overflow, this.softWrap, this.maxLines, this.minLines, this.placeholders, this.autoSize);
        goto L7
    }

    public final TextSubstitutionValue getTextSubstitution$foundation_release() {
        return this.textSubstitution;
    }

    public final void setTextSubstitution$foundation_release(TextSubstitutionValue r1) {
        this.textSubstitution = r1;
    }

    private final boolean setSubstitution(AnnotatedString updatedText) {
        TextSubstitutionValue currentTextSubstitution = this.textSubstitution;
        if (currentTextSubstitution != null) goto L5;
        boolean r3 = false;
        MultiParagraphLayoutCache r4 = null;
        TextSubstitutionValue newTextSubstitution = new TextSubstitutionValue(this.text, updatedText, r3, r4, 12, null);
        MultiParagraphLayoutCache substitutionLayoutCache = new MultiParagraphLayoutCache(updatedText, this.style, this.fontFamilyResolver, this.overflow, this.softWrap, this.maxLines, this.minLines, CollectionsKt.emptyList(), this.autoSize, null);
        substitutionLayoutCache.setDensity$foundation_release(getLayoutCache().getDensity$foundation_release());
        newTextSubstitution.setLayoutCache(substitutionLayoutCache);
        this.textSubstitution = newTextSubstitution;
        return true;
    L5:
        if (Intrinsics.areEqual(updatedText, currentTextSubstitution.getSubstitution()) == false) goto L7;
        return false;
    L7:
        currentTextSubstitution.setSubstitution(updatedText);
        MultiParagraphLayoutCache r0 = currentTextSubstitution.getLayoutCache();
        if (r0 == null) goto L10;
        r0.m1409updateJ2qo7bo(updatedText, this.style, this.fontFamilyResolver, this.overflow, this.softWrap, this.maxLines, this.minLines, CollectionsKt.emptyList(), this.autoSize);
        Unit r1 = Unit.INSTANCE;
    L11:
        if (r1 != null) goto L16;
        return false;
    L16:
        return true;
    L10:
        r1 = null;
        goto L11
    }

    private final void invalidateForTranslate() {
        SemanticsModifierNodeKt.invalidateSemantics(this);
        LayoutModifierNodeKt.invalidateMeasurement(this);
        DrawModifierNodeKt.invalidateDraw(this);
    }

    public final void clearSubstitution$foundation_release() {
        this.textSubstitution = null;
    }

    @Override // androidx.compose.ui.node.SemanticsModifierNode
    public void applySemantics(SemanticsPropertyReceiver $this$applySemantics) {
        Function1<? super List<TextLayoutResult>, Boolean> r0 = this.semanticsTextLayoutResult;
        if (r0 != null) goto L5;
        r0 = new AnonymousClass1(this);
        this.semanticsTextLayoutResult = r0;
    L5:
        SemanticsPropertiesKt.setText($this$applySemantics, this.text);
        TextSubstitutionValue currentTextSubstitution = this.textSubstitution;
        if (currentTextSubstitution == null) goto L8;
        SemanticsPropertiesKt.setTextSubstitution($this$applySemantics, currentTextSubstitution.getSubstitution());
        SemanticsPropertiesKt.setShowingTextSubstitution($this$applySemantics, currentTextSubstitution.isShowingSubstitution());
    L8:
        SemanticsPropertiesKt.setTextSubstitution$default($this$applySemantics, null, new AnonymousClass2(this), 1, null);
        SemanticsPropertiesKt.showTextSubstitution$default($this$applySemantics, null, new AnonymousClass3(this), 1, null);
        SemanticsPropertiesKt.clearTextSubstitution$default($this$applySemantics, null, new AnonymousClass4(this), 1, null);
        SemanticsPropertiesKt.getTextLayoutResult$default($this$applySemantics, null, r0, 1, null);
    }

    /* JADX INFO: renamed from: measureNonExtension-3p2s80s, reason: not valid java name */
    public final MeasureResult m1425measureNonExtension3p2s80s(MeasureScope measureScope, Measurable measurable, long constraints) {
        return mo60measure3p2s80s(measureScope, measurable, constraints);
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    /* JADX INFO: renamed from: measure-3p2s80s */
    public MeasureResult mo60measure3p2s80s(MeasureScope $this$measure_u2d3p2s80s, Measurable measurable, long constraints) {
        MultiParagraphLayoutCache layoutCache = getLayoutCache($this$measure_u2d3p2s80s);
        boolean didChangeLayout = layoutCache.m1408layoutWithConstraintsK40F9xA(constraints, $this$measure_u2d3p2s80s.getLayoutDirection());
        TextLayoutResult textLayoutResult = layoutCache.getTextLayoutResult();
        textLayoutResult.getMultiParagraph().getIntrinsics().getHasStaleResolvedFonts();
        if (didChangeLayout == false) goto L14;
        LayoutModifierNodeKt.invalidateLayer(this);
        Function1<? super TextLayoutResult, Unit> r7 = this.onTextLayout;
        if (r7 == null) goto L7;
        r7.invoke(textLayoutResult);
    L7:
        SelectionController r8 = this.selectionController;
        if (r8 == null) goto L10;
        r8.updateTextLayout(textLayoutResult);
    L10:
        LinkedHashMap r9 = this.baselineCache;
        if (r9 != null) goto L13;
        r9 = new LinkedHashMap(2);
    L13:
        HorizontalAlignmentLine r10 = AlignmentLineKt.getFirstBaseline();
        float $this$fastRoundToInt$iv = textLayoutResult.getFirstBaseline();
        r9.put(r10, Integer.valueOf(Math.round($this$fastRoundToInt$iv)));
        HorizontalAlignmentLine r11 = AlignmentLineKt.getLastBaseline();
        float $this$fastRoundToInt$iv2 = textLayoutResult.getLastBaseline();
        r9.put(r11, Integer.valueOf(Math.round($this$fastRoundToInt$iv2)));
        this.baselineCache = r9;
    L14:
        Function1<? super List<Rect>, Unit> r12 = this.onPlaceholderLayout;
        if (r12 == null) goto L17;
        r12.invoke(textLayoutResult.getPlaceholderRects());
    L17:
        Constraints.Companion r13 = Constraints.Companion;
        long arg0$iv = textLayoutResult.m6388getSizeYbymL2g();
        int r14 = (int) (arg0$iv >> 32);
        long arg0$iv2 = textLayoutResult.m6388getSizeYbymL2g();
        int r2 = (int) (arg0$iv2 >> 32);
        long arg0$iv3 = textLayoutResult.m6388getSizeYbymL2g();
        long arg0$iv4 = textLayoutResult.m6388getSizeYbymL2g();
        final Placeable placeable = measurable.mo5714measureBRTryo0(r13.m6935fitPrioritizingWidthZbe2FdA(r14, r2, (int) (arg0$iv3 & 4294967295L), (int) (arg0$iv4 & 4294967295L)));
        long arg0$iv5 = textLayoutResult.m6388getSizeYbymL2g();
        int $i$f$unpackInt1 = (int) (arg0$iv5 >> 32);
        long arg0$iv6 = textLayoutResult.m6388getSizeYbymL2g();
        Map<AlignmentLine, Integer> r3 = this.baselineCache;
        Intrinsics.checkNotNull(r3);
        return $this$measure_u2d3p2s80s.layout($i$f$unpackInt1, (int) (arg0$iv6 & 4294967295L), r3, new TextAnnotatedStringNode$measure$1(placeable));
    }

    public final int minIntrinsicWidthNonExtension(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable measurable, int height) {
        return minIntrinsicWidth(intrinsicMeasureScope, measurable, height);
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public int minIntrinsicWidth(IntrinsicMeasureScope $this$minIntrinsicWidth, IntrinsicMeasurable measurable, int height) {
        return getLayoutCache($this$minIntrinsicWidth).minIntrinsicWidth($this$minIntrinsicWidth.getLayoutDirection());
    }

    public final int minIntrinsicHeightNonExtension(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable measurable, int width) {
        return minIntrinsicHeight(intrinsicMeasureScope, measurable, width);
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public int minIntrinsicHeight(IntrinsicMeasureScope $this$minIntrinsicHeight, IntrinsicMeasurable measurable, int width) {
        return getLayoutCache($this$minIntrinsicHeight).intrinsicHeight(width, $this$minIntrinsicHeight.getLayoutDirection());
    }

    public final int maxIntrinsicWidthNonExtension(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable measurable, int height) {
        return maxIntrinsicWidth(intrinsicMeasureScope, measurable, height);
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public int maxIntrinsicWidth(IntrinsicMeasureScope $this$maxIntrinsicWidth, IntrinsicMeasurable measurable, int height) {
        return getLayoutCache($this$maxIntrinsicWidth).maxIntrinsicWidth($this$maxIntrinsicWidth.getLayoutDirection());
    }

    public final int maxIntrinsicHeightNonExtension(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable measurable, int width) {
        return maxIntrinsicHeight(intrinsicMeasureScope, measurable, width);
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public int maxIntrinsicHeight(IntrinsicMeasureScope $this$maxIntrinsicHeight, IntrinsicMeasurable measurable, int width) {
        return getLayoutCache($this$maxIntrinsicHeight).intrinsicHeight(width, $this$maxIntrinsicHeight.getLayoutDirection());
    }

    public final void drawNonExtension(ContentDrawScope contentDrawScope) {
        draw(contentDrawScope);
    }

    @Override // androidx.compose.ui.node.DrawModifierNode
    public void draw(ContentDrawScope $this$draw) {
        if (isAttached() == true) goto L5;
        return;
    L5:
        SelectionController r0 = this.selectionController;
        if (r0 == null) goto L8;
        r0.draw($this$draw);
    L8:
        ContentDrawScope $this$drawIntoCanvas$iv = $this$draw;
        Canvas canvas = $this$drawIntoCanvas$iv.getDrawContext().getCanvas();
        MultiParagraphLayoutCache layoutCache = getLayoutCache($this$draw);
        TextLayoutResult textLayoutResult = layoutCache.getTextLayoutResult();
        MultiParagraph localParagraph = textLayoutResult.getMultiParagraph();
        if (textLayoutResult.getHasVisualOverflow() == true) goto L11;
    L13:
        boolean r1 = false;
    L14:
        boolean willClip = r1;
        if (willClip == false) goto L17;
        long arg0$iv = textLayoutResult.m6388getSizeYbymL2g();
        float width = (int) (arg0$iv >> 32);
        long arg0$iv2 = textLayoutResult.m6388getSizeYbymL2g();
        float height = (int) (arg0$iv2 & 4294967295L);
        long r7 = Offset.Companion.m4141getZeroF1C5BW0();
        long v1$iv$iv = Float.floatToRawIntBits(width);
        long v2$iv$iv = Float.floatToRawIntBits(height);
        Rect bounds = RectKt.m4165Recttz77jQw(r7, Size.m4185constructorimpl((v1$iv$iv << 32) | (v2$iv$iv & 4294967295L)));
        canvas.save();
        boolean r10 = false;
        Canvas.m4339clipRectmtrdDE$default(canvas, bounds, 0, 2, null);
    L77:
        TextDecoration r2 = this.style.getTextDecoration();     // Catch: Throwable -> L73
        if (r2 != null) goto L22;
        r2 = TextDecoration.Companion.getNone();     // Catch: Throwable -> L73
    L22:
        TextDecoration textDecoration = r2;
        Shadow r3 = this.style.getShadow();     // Catch: Throwable -> L73
        if (r3 != null) goto L25;
        r3 = Shadow.Companion.getNone();     // Catch: Throwable -> L73
    L25:
        Shadow shadow = r3;
        Fill drawStyle = this.style.getDrawStyle();     // Catch: Throwable -> L73
        if (drawStyle != null) goto L28;
        drawStyle = Fill.INSTANCE;     // Catch: Throwable -> L73
    L28:
        Brush brush = this.style.getBrush();     // Catch: Throwable -> L73
        if (brush == null) goto L31;
        float alpha = this.style.getAlpha();     // Catch: Throwable -> L73
        boolean r22 = r10;
        boolean r14 = true;
        MultiParagraph.m6266painthn5TExg$default(localParagraph, canvas, brush, alpha, shadow, textDecoration, drawStyle, 0, 64, null);     // Catch: Throwable -> L73
    L49:
        if (willClip == false) goto L51;
        canvas.restore();
    L51:
        TextSubstitutionValue r4 = this.textSubstitution;
        if (r4 != null) goto L54;
    L56:
        boolean r6 = r22;
    L57:
        if (r6 == false) goto L59;
        boolean hasLinks = r22;
    L61:
        if (hasLinks == true) goto L70;
        List<AnnotatedString.Range<Placeholder>> r5 = this.placeholders;
        if (r5 != null) goto L65;
    L68:
        boolean r8 = r14;
    L69:
        if (r8 == false) goto L70;
        return;
    L65:
        if (r5.isEmpty() == true) goto L68;
        r8 = r22;
    L70:
        $this$draw.drawContent();
        return;
    L59:
        hasLinks = TextAnnotatedStringNodeKt.hasLinks(this.text);
        goto L61
    L54:
        if (r4.isShowingSubstitution() != r14) goto L56;
        r6 = r14;
        goto L57
    L31:
        r22 = r10;
        r14 = true;
        DrawStyle drawStyle2 = drawStyle;
        ColorProducer r9 = this.overrideColor;     // Catch: Throwable -> L73
        if (r9 == null) goto L34;
        long $this$isSpecified$iv = r9.mo1640invoke0d7_KjU();     // Catch: Throwable -> L73
    L35:
        long overrideColorVal = $this$isSpecified$iv;
        if ($this$isSpecified$iv == 16) goto L38;
        boolean r11 = true;
    L39:
        if (r11 == false) goto L41;
        long color = overrideColorVal;
    L48:
        MultiParagraph.m6264paintLG529CI$default(localParagraph, canvas, color, shadow, textDecoration, drawStyle2, 0, 32, null);     // Catch: Throwable -> L73
        goto L49
    L41:
        long $this$isSpecified$iv2 = this.style.m6447getColor0d7_KjU();     // Catch: Throwable -> L73
        if ($this$isSpecified$iv2 == 16) goto L44;
        boolean r12 = true;
    L45:
        if (r12 == false) goto L47;
        color = this.style.m6447getColor0d7_KjU();     // Catch: Throwable -> L73
        goto L48
    L47:
        color = Color.Companion.m4392getBlack0d7_KjU();     // Catch: Throwable -> L73
        goto L48
    L44:
        r12 = r22;
        goto L45
    L38:
        r11 = r22;
        goto L39
    L34:
        $this$isSpecified$iv = Color.Companion.m4402getUnspecified0d7_KjU();     // Catch: Throwable -> L73
    L73:
        th = move-exception;
        if (willClip == false) goto L76;
        canvas.restore();
    L76:
        throw th;
    L17:
        r10 = false;
        goto L77
    L11:
        if (TextOverflow.m6877equalsimpl0(this.overflow, TextOverflow.Companion.m6890getVisiblegIe3tQ8()) == true) goto L13;
        r1 = true;
        goto L14
    }
}
