package androidx.compose.foundation.text;

import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.HoverableKt;
import androidx.compose.foundation.interaction.InteractionSourceKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.graphics.GraphicsLayerModifierKt;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.input.pointer.PointerIcon;
import androidx.compose.ui.input.pointer.PointerIconKt;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.UriHandler;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.LinkAnnotation;
import androidx.compose.ui.text.LinkInteractionListener;
import androidx.compose.ui.text.SpanStyle;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextLinkStyles;
import androidx.compose.ui.unit.IntRect;
import androidx.compose.ui.unit.IntRectKt;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SpreadBuilder;

/* JADX INFO: compiled from: TextLinkScope.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0011\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\r\u0010\u001e\u001a\u00020\tH\u0007¢\u0006\u0002\u0010\u001fJ>\u0010 \u001a\u00020\t2\u0016\u0010!\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00010\"\"\u0004\u0018\u00010\u00012\u0017\u0010#\u001a\u0013\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007¢\u0006\u0002\b\nH\u0003¢\u0006\u0002\u0010$J\r\u0010%\u001a\u00020\u0003H\u0000¢\u0006\u0002\b&J0\u0010'\u001a\u0010\u0012\u0004\u0012\u00020)\u0018\u00010(j\u0004\u0018\u0001`*2\u0010\u0010+\u001a\f\u0012\u0004\u0012\u00020)0(j\u0002`*2\u0006\u0010\u0017\u001a\u00020\u0016H\u0002J\u0018\u0010,\u001a\u00020\t2\u0006\u0010+\u001a\u00020)2\u0006\u0010-\u001a\u00020.H\u0002J\u001c\u0010/\u001a\u0004\u0018\u0001002\u0010\u0010+\u001a\f\u0012\u0004\u0012\u00020)0(j\u0002`*H\u0002J\u001c\u00101\u001a\u0004\u0018\u0001022\u0010\u0010+\u001a\f\u0012\u0004\u0012\u00020)0(j\u0002`*H\u0002J\u001e\u00103\u001a\u000204*\u0002042\u0010\u0010+\u001a\f\u0012\u0004\u0012\u00020)0(j\u0002`*H\u0002J\u001a\u00105\u001a\u0004\u0018\u000106*\u0004\u0018\u0001062\b\u00107\u001a\u0004\u0018\u000106H\u0002J\u001e\u00108\u001a\u000204*\u0002042\u0010\u0010+\u001a\f\u0012\u0004\u0012\u00020)0(j\u0002`*H\u0002R%\u0010\u0005\u001a\u0019\u0012\u0015\u0012\u0013\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007¢\u0006\u0002\b\n0\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0002\u001a\u00020\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e8F¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0012\u001a\u00020\u0003X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\f\"\u0004\b\u0014\u0010\u0004R/\u0010\u0017\u001a\u0004\u0018\u00010\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u00168F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001b¨\u00069"}, d2 = {"Landroidx/compose/foundation/text/TextLinkScope;", "", "initialText", "Landroidx/compose/ui/text/AnnotatedString;", "(Landroidx/compose/ui/text/AnnotatedString;)V", "annotators", "Landroidx/compose/runtime/snapshots/SnapshotStateList;", "Lkotlin/Function1;", "Landroidx/compose/foundation/text/TextAnnotatorScope;", "", "Lkotlin/ExtensionFunctionType;", "getInitialText$foundation_release", "()Landroidx/compose/ui/text/AnnotatedString;", "shouldMeasureLinks", "Lkotlin/Function0;", "", "getShouldMeasureLinks", "()Lkotlin/jvm/functions/Function0;", "text", "getText$foundation_release", "setText$foundation_release", "<set-?>", "Landroidx/compose/ui/text/TextLayoutResult;", "textLayoutResult", "getTextLayoutResult", "()Landroidx/compose/ui/text/TextLayoutResult;", "setTextLayoutResult", "(Landroidx/compose/ui/text/TextLayoutResult;)V", "textLayoutResult$delegate", "Landroidx/compose/runtime/MutableState;", "LinksComposables", "(Landroidx/compose/runtime/Composer;I)V", "StyleAnnotation", "keys", "", "block", "([Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "applyAnnotators", "applyAnnotators$foundation_release", "calculateVisibleLinkRange", "Landroidx/compose/ui/text/AnnotatedString$Range;", "Landroidx/compose/ui/text/LinkAnnotation;", "Landroidx/compose/foundation/text/LinkRange;", "link", "handleLink", "uriHandler", "Landroidx/compose/ui/platform/UriHandler;", "pathForRangeInRangeCoordinates", "Landroidx/compose/ui/graphics/Path;", "shapeForRange", "Landroidx/compose/ui/graphics/Shape;", "clipLink", "Landroidx/compose/ui/Modifier;", "mergeOrUse", "Landroidx/compose/ui/text/SpanStyle;", "other", "textRange", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class TextLinkScope {
    public static final int $stable = 0;
    private final SnapshotStateList<Function1<TextAnnotatorScope, Unit>> annotators;
    private final AnnotatedString initialText;
    private AnnotatedString text;
    private final MutableState textLayoutResult$delegate;

    static {
        $stable = 8;
    }

    public TextLinkScope(AnnotatedString initialText) {
        this.initialText = initialText;
        this.textLayoutResult$delegate = SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
        this.text = this.initialText.flatMapAnnotations(AnonymousClass1.INSTANCE);
        this.annotators = SnapshotStateKt.mutableStateListOf();
    }

    public static final /* synthetic */ void access$StyleAnnotation(TextLinkScope $this, Object[] keys, Function1 block, Composer $composer, int $changed) {
        $this.StyleAnnotation(keys, block, $composer, $changed);
    }

    public static final /* synthetic */ SnapshotStateList access$getAnnotators$p(TextLinkScope $this) {
        return $this.annotators;
    }

    public static final /* synthetic */ void access$handleLink(TextLinkScope $this, LinkAnnotation link, UriHandler uriHandler) {
        $this.handleLink(link, uriHandler);
    }

    public static final /* synthetic */ SpanStyle access$mergeOrUse(TextLinkScope $this, SpanStyle $receiver, SpanStyle other) {
        return $this.mergeOrUse($receiver, other);
    }

    public static final /* synthetic */ Shape access$shapeForRange(TextLinkScope $this, AnnotatedString.Range link) {
        return $this.shapeForRange(link);
    }

    public final AnnotatedString getInitialText$foundation_release() {
        return this.initialText;
    }

    public final TextLayoutResult getTextLayoutResult() {
        State $this$getValue$iv = this.textLayoutResult$delegate;
        return (TextLayoutResult) $this$getValue$iv.getValue();
    }

    public final void setTextLayoutResult(TextLayoutResult r4) {
        MutableState $this$setValue$iv = this.textLayoutResult$delegate;
        $this$setValue$iv.setValue(r4);
    }

    public final AnnotatedString getText$foundation_release() {
        return this.text;
    }

    public final void setText$foundation_release(AnnotatedString r1) {
        this.text = r1;
    }

    public final Function0<Boolean> getShouldMeasureLinks() {
        return new TextLinkScope$shouldMeasureLinks$1(this);
    }

    private final Modifier textRange(Modifier $this$textRange, final AnnotatedString.Range<LinkAnnotation> r4) {
        return $this$textRange.then(new TextRangeLayoutModifier(new TextLinkScope$$ExternalSyntheticLambda0(this, r4)));
    }

    static final TextRangeLayoutMeasureResult textRange$lambda$0(TextLinkScope this$0, AnnotatedString.Range $link, TextRangeLayoutMeasureScope $this$$receiver) {
        TextLayoutResult layoutResult = this$0.getTextLayoutResult();
        if (layoutResult == null) goto L5;
        AnnotatedString.Range<LinkAnnotation> r2 = this$0.calculateVisibleLinkRange($link, layoutResult);
        if (r2 == null) goto L9;
        final IntRect bounds = IntRectKt.roundToIntRect(layoutResult.getPathForRange(r2.getStart(), r2.getEnd()).getBounds());
        return $this$$receiver.layout(bounds.getWidth(), bounds.getHeight(), new TextLinkScope$textRange$1$1(bounds));
    L9:
        return $this$$receiver.layout(0, 0, TextLinkScope$textRange$1$updatedRange$1.INSTANCE);
    L5:
        return $this$$receiver.layout(0, 0, TextLinkScope$textRange$1$layoutResult$1.INSTANCE);
    }

    private final Modifier clipLink(Modifier $this$clipLink, final AnnotatedString.Range<LinkAnnotation> r3) {
        return GraphicsLayerModifierKt.graphicsLayer($this$clipLink, new C03581(this, r3));
    }

    private final Shape shapeForRange(AnnotatedString.Range<LinkAnnotation> r4) {
        final Path it = pathForRangeInRangeCoordinates(r4);
        if (it == null) goto L5;
        Shape r2 = new TextLinkScope$shapeForRange$1$1(it);
    L7:
        return r2;
    L5:
        r2 = null;
        goto L7
    }

    private final Path pathForRangeInRangeCoordinates(AnnotatedString.Range<LinkAnnotation> r23) {
        if (getShouldMeasureLinks().invoke().booleanValue() == false) goto L17;
        TextLayoutResult it = getTextLayoutResult();
        if (it == null) goto L17;
        AnnotatedString.Range<LinkAnnotation> r5 = calculateVisibleLinkRange(r23, it);
        if (r5 != null) goto L10;
        return null;
    L10:
        Path path = it.getPathForRange(r5.getStart(), r5.getEnd());
        Rect firstCharBoundingBox = it.getBoundingBox(r5.getStart());
        Rect lastCharBoundingBox = it.getBoundingBox(r5.getEnd() - 1);
        int rangeStartLine = it.getLineForOffset(r5.getStart());
        int rangeEndLine = it.getLineForOffset(r5.getEnd() - 1);
        if (rangeStartLine != rangeEndLine) goto L13;
        float xOffset = Math.min(lastCharBoundingBox.getLeft(), firstCharBoundingBox.getLeft());
    L14:
        float yOffset = firstCharBoundingBox.getTop();
        long v1$iv$iv = Float.floatToRawIntBits(xOffset);
        long v2$iv$iv = Float.floatToRawIntBits(yOffset);
        long arg0$iv = Offset.m4117constructorimpl((v1$iv$iv << 32) | (v2$iv$iv & 4294967295L));
        path.mo4261translatek4lQ0M(Offset.m4117constructorimpl((-9223372034707292160L) ^ arg0$iv));
        return path;
    L13:
        xOffset = 0.0f;
    L17:
        return null;
    }

    private final AnnotatedString.Range<LinkAnnotation> calculateVisibleLinkRange(AnnotatedString.Range<LinkAnnotation> r10, TextLayoutResult textLayoutResult) {
        int lastOffset = TextLayoutResult.getLineEnd$default(textLayoutResult, textLayoutResult.getLineCount() - 1, false, 2, null);
        if (r10.getStart() >= lastOffset) goto L6;
        return AnnotatedString.Range.copy$default(r10, null, 0, Math.min(r10.getEnd(), lastOffset), null, 11, null);
    L6:
        return null;
    }

    public final void LinksComposables(Composer $composer, final int $changed) {
        Composer $composer2 = $composer.startRestartGroup(1154651354);
        ComposerKt.sourceInformation($composer2, "C(LinksComposables)215@9178L7:TextLinkScope.kt#423gt5");
        int $dirty = $changed;
        if (($changed & 6) != 0) goto L10;
        if ($composer2.changedInstance(this) == false) goto L7;
        int r5 = 4;
    L8:
        $dirty = $dirty | r5;
        goto L10
    L7:
        r5 = 2;
    L10:
        if (($dirty & 3) == 2) goto L12;
        boolean r6 = true;
    L14:
        if ($composer2.shouldExecute(r6, $dirty & 1) == true) goto L16;
        $composer2.skipToGroupEnd();
    L74:
        ScopeUpdateScope r2 = $composer2.endRestartGroup();
        if (r2 == null) goto L81;
        r2.updateScope(new AnonymousClass2(this, $changed));
        return;
    L81:
        return;
    L16:
        if (ComposerKt.isTraceInProgress() == false) goto L18;
        ComposerKt.traceEventStart(1154651354, $dirty, -1, "androidx.compose.foundation.text.TextLinkScope.LinksComposables (TextLinkScope.kt:214)");
    L18:
        ProvidableCompositionLocal<UriHandler> r3 = CompositionLocalsKt.getLocalUriHandler();
        ComposerKt.sourceInformationMarkerStart($composer2, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
        Object r10 = $composer2.consume(r3);
        ComposerKt.sourceInformationMarkerEnd($composer2);
        final UriHandler uriHandler = (UriHandler) r10;
        List<AnnotatedString.Range<LinkAnnotation>> r7 = this.text.getLinkAnnotations(0, this.text.length());
        List<AnnotatedString.Range<LinkAnnotation>> r9 = r7;
        int $i$f$fastForEach = 0;
        int index$iv = 0;
        int r12 = r9.size();
    L19:
        if (index$iv >= r12) goto L71;
        AnnotatedString.Range<LinkAnnotation> item$iv = r9.get(index$iv);
        final AnnotatedString.Range<LinkAnnotation> r14 = item$iv;
        if (r14.getStart() == r14.getEnd()) goto L68;
        $composer2.startReplaceGroup(1386075176);
        ComposerKt.sourceInformation($composer2, "220@9368L39,234@10043L38,222@9425L700");
        ComposerKt.sourceInformationMarkerStart($composer2, -370931493, "CC(remember):TextLinkScope.kt#9igjgp");
        Object it$iv = $composer2.rememberedValue();
        int $dirty2 = $dirty;
        if (it$iv != Composer.Companion.getEmpty()) goto L26;
        Object value$iv = InteractionSourceKt.MutableInteractionSource();
        $composer2.updateRememberedValue(value$iv);
        it$iv = value$iv;
    L26:
        MutableInteractionSource interactionSource = (MutableInteractionSource) it$iv;
        ComposerKt.sourceInformationMarkerEnd($composer2);
        Modifier r22 = PointerIconKt.pointerHoverIcon$default(HoverableKt.hoverable$default(textRange(SemanticsModifierKt.semantics$default(clipLink(Modifier.Companion, r14), false, TextLinkScope$LinksComposables$1$1.INSTANCE, 1, null), r14), interactionSource, false, 2, null), PointerIcon.Companion.getHand(), false, 2, null);
        ComposerKt.sourceInformationMarkerStart($composer2, -370909894, "CC(remember):TextLinkScope.kt#9igjgp");
        boolean invalid$iv = ($composer2.changedInstance(this) | $composer2.changed(r14)) | $composer2.changedInstance(uriHandler);
        Object it$iv2 = $composer2.rememberedValue();
        if (invalid$iv == false) goto L29;
    L32:
        Object value$iv2 = (Function0) new TextLinkScope$LinksComposables$1$2$1(this, r14, uriHandler);
        $composer2.updateRememberedValue(value$iv2);
        it$iv2 = value$iv2;
    L33:
        ComposerKt.sourceInformationMarkerEnd($composer2);
        BoxKt.Box(ClickableKt.m272combinedClickableauXiCPI$default(r22, interactionSource, null, false, null, null, null, null, null, false, (Function0) it$iv2, 508, null), $composer2, 0);
        if (TextLinkScopeKt.access$isNullOrEmpty(r14.getItem().getStyles()) == true) goto L66;
        $composer2.startReplaceGroup(1386898319);
        ComposerKt.sourceInformation($composer2, "243@10488L110,246@10640L51,246@10619L72,256@11132L1144,248@10713L1563");
        ComposerKt.sourceInformationMarkerStart($composer2, -370895582, "CC(remember):TextLinkScope.kt#9igjgp");
        Object it$iv3 = $composer2.rememberedValue();
        if (it$iv3 != Composer.Companion.getEmpty()) goto L39;
        Object value$iv3 = new LinkStateInteractionSourceObserver(interactionSource);
        $composer2.updateRememberedValue(value$iv3);
        it$iv3 = value$iv3;
    L39:
        final LinkStateInteractionSourceObserver linkStateObserver = (LinkStateInteractionSourceObserver) it$iv3;
        ComposerKt.sourceInformationMarkerEnd($composer2);
        Unit r4 = Unit.INSTANCE;
        ComposerKt.sourceInformationMarkerStart($composer2, -370890777, "CC(remember):TextLinkScope.kt#9igjgp");
        Object it$iv4 = $composer2.rememberedValue();
        if (it$iv4 != Composer.Companion.getEmpty()) goto L42;
        SpanStyle r8 = null;
        Object value$iv4 = (Function2) new TextLinkScope$LinksComposables$1$3$1(linkStateObserver, null);
        $composer2.updateRememberedValue(value$iv4);
        it$iv4 = value$iv4;
    L43:
        ComposerKt.sourceInformationMarkerEnd($composer2);
        EffectsKt.LaunchedEffect(r4, (Function2) it$iv4, $composer2, 6);
        Boolean r24 = Boolean.valueOf(linkStateObserver.isHovered());
        Boolean r25 = Boolean.valueOf(linkStateObserver.isFocused());
        Boolean r26 = Boolean.valueOf(linkStateObserver.isPressed());
        TextLinkStyles r11 = r14.getItem().getStyles();
        if (r11 == null) goto L46;
        SpanStyle r27 = r11.getStyle();
    L47:
        TextLinkStyles r13 = r14.getItem().getStyles();
        if (r13 == null) goto L50;
        SpanStyle r28 = r13.getFocusedStyle();
    L51:
        TextLinkStyles r15 = r14.getItem().getStyles();
        if (r15 == null) goto L54;
        SpanStyle r29 = r15.getHoveredStyle();
    L55:
        TextLinkStyles r16 = r14.getItem().getStyles();
        if (r16 == null) goto L58;
        r8 = r16.getPressedStyle();
    L58:
        Object[] r17 = {r24, r25, r26, r27, r28, r29, r8};
        ComposerKt.sourceInformationMarkerStart($composer2, -370873940, "CC(remember):TextLinkScope.kt#9igjgp");
        boolean invalid$iv2 = $composer2.changedInstance(this) | $composer2.changed(r14);
        Object it$iv5 = $composer2.rememberedValue();
        if (invalid$iv2 == false) goto L61;
    L64:
        Object value$iv5 = (Function1) new TextLinkScope$LinksComposables$1$4$1(this, r14, linkStateObserver);
        $composer2.updateRememberedValue(value$iv5);
        it$iv5 = value$iv5;
    L65:
        ComposerKt.sourceInformationMarkerEnd($composer2);
        StyleAnnotation(r17, (Function1) it$iv5, $composer2, ($dirty2 << 6) & 896);
        $composer2.endReplaceGroup();
    L67:
        $composer2.endReplaceGroup();
    L69:
        index$iv = index$iv + 1;
        $i$f$fastForEach = $i$f$fastForEach;
        r9 = r9;
        uriHandler = uriHandler;
        r7 = r7;
        $dirty = $dirty2;
        goto L19
    L61:
        if (it$iv5 != Composer.Companion.getEmpty()) goto L65;
    L54:
        r29 = r8;
        goto L55
    L50:
        r28 = r8;
        goto L51
    L46:
        r27 = r8;
        goto L47
    L42:
        r8 = null;
        goto L43
    L66:
        uriHandler = uriHandler;
        $composer2.startReplaceGroup(1388926990);
        $composer2.endReplaceGroup();
        goto L67
    L29:
        if (it$iv2 != Composer.Companion.getEmpty()) goto L33;
    L68:
        uriHandler = uriHandler;
        $dirty2 = $dirty;
        r7 = r7;
        $composer2.startReplaceGroup(1388940878);
        $composer2.endReplaceGroup();
        goto L69
    L71:
        if (ComposerKt.isTraceInProgress() == false) goto L74;
        ComposerKt.traceEventEnd();
        goto L74
    L12:
        r6 = false;
        goto L14
    }

    private final SpanStyle mergeOrUse(SpanStyle $this$mergeOrUse, SpanStyle other) {
        if ($this$mergeOrUse == null) goto L6;
        SpanStyle r0 = $this$mergeOrUse.merge(other);
        if (r0 == null) goto L6;
        return r0;
    L6:
        return other;
    }

    private final void handleLink(LinkAnnotation link, UriHandler uriHandler) {
        if ((link instanceof LinkAnnotation.Url) == false) goto L14;
        LinkInteractionListener r0 = link.getLinkInteractionListener();
        if (r0 == null) goto L7;
        r0.onClick(link);
        Unit r1 = Unit.INSTANCE;
    L8:
        if (r1 != null) goto L21;
        uriHandler.openUri(((LinkAnnotation.Url) link).getUrl());     // Catch: IllegalArgumentException -> L11
        return;
    L25:
        return;
    L21:
        return;
    L7:
        r1 = null;
        goto L8
    L14:
        if ((link instanceof LinkAnnotation.Clickable) == false) goto L22;
        LinkInteractionListener r2 = link.getLinkInteractionListener();
        if (r2 == null) goto L23;
        r2.onClick(link);
        return;
    L23:
        return;
    }

    public final AnnotatedString applyAnnotators$foundation_release() {
        if (this.annotators.isEmpty() == false) goto L5;
        AnnotatedString styledText = this.text;
    L9:
        this.text = styledText;
        return styledText;
    L5:
        TextAnnotatorScope scope = new TextAnnotatorScope(this.text);
        List $this$fastForEach$iv = this.annotators;
        int index$iv = 0;
        int r4 = $this$fastForEach$iv.size();
    L6:
        if (index$iv >= r4) goto L8;
        Object item$iv = $this$fastForEach$iv.get(index$iv);
        ((Function1) item$iv).invoke(scope);
        index$iv = index$iv + 1;
        goto L6
    L8:
        styledText = scope.getStyledText();
        goto L9
    }

    private final void StyleAnnotation(final Object[] keys, final Function1<? super TextAnnotatorScope, Unit> r12, Composer $composer, final int $changed) {
        Composer $composer2 = $composer.startRestartGroup(-2083052099);
        ComposerKt.sourceInformation($composer2, "C(StyleAnnotation)P(1)316@13851L89,316@13820L120:TextLinkScope.kt#423gt5");
        int $dirty = $changed;
        if (($changed & 48) != 0) goto L10;
        if ($composer2.changedInstance(r12) == false) goto L7;
        int r2 = 32;
    L8:
        $dirty = $dirty | r2;
        goto L10
    L7:
        r2 = 16;
    L10:
        if (($changed & 384) == 0) goto L12;
    L16:
        $composer2.startMovableGroup(-416604407, Integer.valueOf(keys.length));
        int r3 = keys.length;
        int r5 = 0;
    L17:
        if (r5 >= r3) goto L23;
        Object value = keys[r5];
        if ($composer2.changedInstance(value) == false) goto L21;
        int r7 = 4;
    L22:
        $dirty = $dirty | r7;
        r5 = r5 + 1;
        goto L17
    L21:
        r7 = 0;
        goto L22
    L23:
        $composer2.endMovableGroup();
        if (($dirty & 14) != 0) goto L26;
        $dirty = $dirty | 2;
    L26:
        boolean r6 = true;
        if (($dirty & 147) == 146) goto L29;
        boolean r4 = true;
    L31:
        if ($composer2.shouldExecute(r4, $dirty & 1) == true) goto L33;
        $composer2.skipToGroupEnd();
    L50:
        ScopeUpdateScope r0 = $composer2.endRestartGroup();
        if (r0 == null) goto L57;
        r0.updateScope(new C03572(this, keys, r12, $changed));
        return;
    L57:
        return;
    L33:
        if (ComposerKt.isTraceInProgress() == false) goto L35;
        ComposerKt.traceEventStart(-2083052099, $dirty, -1, "androidx.compose.foundation.text.TextLinkScope.StyleAnnotation (TextLinkScope.kt:315)");
    L35:
        SpreadBuilder r1 = new SpreadBuilder(2);
        r1.add(r12);
        r1.addSpread(keys);
        Object[] r8 = r1.toArray(new Object[r1.size()]);
        ComposerKt.sourceInformationMarkerStart($composer2, -416601199, "CC(remember):TextLinkScope.kt#9igjgp");
        boolean r9 = $composer2.changedInstance(this);
        if (($dirty & 112) == 32) goto L39;
        r6 = false;
    L39:
        boolean invalid$iv = r9 | r6;
        Object it$iv = $composer2.rememberedValue();
        if (invalid$iv == false) goto L42;
    L45:
        Object value$iv = (Function1) new TextLinkScope$StyleAnnotation$1$1(this, r12);
        $composer2.updateRememberedValue(value$iv);
        it$iv = value$iv;
    L46:
        ComposerKt.sourceInformationMarkerEnd($composer2);
        EffectsKt.DisposableEffect(r8, (Function1) it$iv, $composer2, 0);
        if (ComposerKt.isTraceInProgress() == false) goto L50;
        ComposerKt.traceEventEnd();
        goto L50
    L42:
        if (it$iv != Composer.Companion.getEmpty()) goto L46;
    L29:
        r4 = false;
        goto L31
    L12:
        if ($composer2.changedInstance(this) == false) goto L14;
        int r10 = 256;
    L15:
        $dirty = $dirty | r10;
        goto L16
    L14:
        r10 = 128;
        goto L15
    }
}
