package androidx.compose.foundation.text.modifiers;

import androidx.compose.foundation.internal.InlineClassHelperKt;
import androidx.compose.ui.Modifier;
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
import androidx.compose.ui.text.Paragraph;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextOverflow;
import androidx.compose.ui.unit.Constraints;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: TextStringSimpleNode.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000¦\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0001OBQ\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f\u0012\b\b\u0002\u0010\r\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0010\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0013¢\u0006\u0002\u0010\u0014J\b\u0010)\u001a\u00020*H\u0002J\u001e\u0010+\u001a\u00020*2\u0006\u0010,\u001a\u00020\u000e2\u0006\u0010-\u001a\u00020\u000e2\u0006\u0010.\u001a\u00020\u000eJ\r\u0010\u001d\u001a\u00020\u0016H\u0003¢\u0006\u0002\b/J\b\u00100\u001a\u00020*H\u0002J\u0010\u00101\u001a\u00020\u000e2\u0006\u00102\u001a\u00020\u0006H\u0002J\u0018\u00103\u001a\u00020\u000e2\b\u00104\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u0007\u001a\u00020\bJ@\u00105\u001a\u00020\u000e2\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fø\u0001\u0000¢\u0006\u0004\b6\u00107J\u000e\u00108\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u0006J\f\u00109\u001a\u00020**\u00020:H\u0016J\f\u0010;\u001a\u00020**\u00020<H\u0016J\f\u0010=\u001a\u00020\u0016*\u00020>H\u0002J\u001c\u0010?\u001a\u00020\u0010*\u00020>2\u0006\u0010@\u001a\u00020A2\u0006\u0010B\u001a\u00020\u0010H\u0016J\u001c\u0010C\u001a\u00020\u0010*\u00020>2\u0006\u0010@\u001a\u00020A2\u0006\u0010D\u001a\u00020\u0010H\u0016J&\u0010E\u001a\u00020F*\u00020G2\u0006\u0010@\u001a\u00020H2\u0006\u0010I\u001a\u00020JH\u0016ø\u0001\u0000¢\u0006\u0004\bK\u0010LJ\u001c\u0010M\u001a\u00020\u0010*\u00020>2\u0006\u0010@\u001a\u00020A2\u0006\u0010B\u001a\u00020\u0010H\u0016J\u001c\u0010N\u001a\u00020\u0010*\u00020>2\u0006\u0010@\u001a\u00020A2\u0006\u0010D\u001a\u00020\u0010H\u0016R\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0016X\u0082\u000e¢\u0006\u0002\n\u0000R\"\u0010\u0017\u001a\u0010\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u0018X\u0082\u000e¢\u0006\b\n\u0000\u0012\u0004\b\u001a\u0010\u001bR\u000e\u0010\t\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u001c\u001a\u00020\u00168BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001eR\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u000b\u001a\u00020\fX\u0082\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\n\u0002\u0010\u001fR\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u0082\u000e¢\u0006\u0002\n\u0000R\"\u0010 \u001a\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00020#0\"\u0012\u0004\u0012\u00020\u000e\u0018\u00010!X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010$\u001a\u00020\u000e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b%\u0010&R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010'\u001a\u0004\u0018\u00010(X\u0082\u000e¢\u0006\u0002\n\u0000\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006P"}, d2 = {"Landroidx/compose/foundation/text/modifiers/TextStringSimpleNode;", "Landroidx/compose/ui/Modifier$Node;", "Landroidx/compose/ui/node/LayoutModifierNode;", "Landroidx/compose/ui/node/DrawModifierNode;", "Landroidx/compose/ui/node/SemanticsModifierNode;", "text", "", "style", "Landroidx/compose/ui/text/TextStyle;", "fontFamilyResolver", "Landroidx/compose/ui/text/font/FontFamily$Resolver;", "overflow", "Landroidx/compose/ui/text/style/TextOverflow;", "softWrap", "", "maxLines", "", "minLines", "overrideColor", "Landroidx/compose/ui/graphics/ColorProducer;", "(Ljava/lang/String;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/font/FontFamily$Resolver;IZIILandroidx/compose/ui/graphics/ColorProducer;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "_layoutCache", "Landroidx/compose/foundation/text/modifiers/ParagraphLayoutCache;", "baselineCache", "", "Landroidx/compose/ui/layout/AlignmentLine;", "getBaselineCache$annotations", "()V", "layoutCache", "getLayoutCache", "()Landroidx/compose/foundation/text/modifiers/ParagraphLayoutCache;", "I", "semanticsTextLayoutResult", "Lkotlin/Function1;", "", "Landroidx/compose/ui/text/TextLayoutResult;", "shouldAutoInvalidate", "getShouldAutoInvalidate", "()Z", "textSubstitution", "Landroidx/compose/foundation/text/modifiers/TextStringSimpleNode$TextSubstitutionValue;", "clearSubstitution", "", "doInvalidations", "drawChanged", "textChanged", "layoutChanged", "getLayoutCacheOrSubstitute", "invalidateForTranslate", "setSubstitution", "updatedText", "updateDraw", "color", "updateLayoutRelatedArgs", "updateLayoutRelatedArgs-HuAbxIM", "(Landroidx/compose/ui/text/TextStyle;IIZLandroidx/compose/ui/text/font/FontFamily$Resolver;I)Z", "updateText", "applySemantics", "Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;", "draw", "Landroidx/compose/ui/graphics/drawscope/ContentDrawScope;", "getLayoutCacheForMeasure", "Landroidx/compose/ui/layout/IntrinsicMeasureScope;", "maxIntrinsicHeight", "measurable", "Landroidx/compose/ui/layout/IntrinsicMeasurable;", "width", "maxIntrinsicWidth", "height", "measure", "Landroidx/compose/ui/layout/MeasureResult;", "Landroidx/compose/ui/layout/MeasureScope;", "Landroidx/compose/ui/layout/Measurable;", "constraints", "Landroidx/compose/ui/unit/Constraints;", "measure-3p2s80s", "(Landroidx/compose/ui/layout/MeasureScope;Landroidx/compose/ui/layout/Measurable;J)Landroidx/compose/ui/layout/MeasureResult;", "minIntrinsicHeight", "minIntrinsicWidth", "TextSubstitutionValue", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class TextStringSimpleNode extends Modifier.Node implements LayoutModifierNode, DrawModifierNode, SemanticsModifierNode {
    public static final int $stable = 0;
    private ParagraphLayoutCache _layoutCache;
    private Map<AlignmentLine, Integer> baselineCache;
    private FontFamily.Resolver fontFamilyResolver;
    private int maxLines;
    private int minLines;
    private int overflow;
    private ColorProducer overrideColor;
    private Function1<? super List<TextLayoutResult>, Boolean> semanticsTextLayoutResult;
    private boolean softWrap;
    private TextStyle style;
    private String text;
    private TextSubstitutionValue textSubstitution;

    /* JADX INFO: compiled from: TextStringSimpleNode.kt */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0002\u0010\tJ\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0006HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\bHÆ\u0003J3\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bHÆ\u0001J\u0013\u0010\u001b\u001a\u00020\u00062\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001J\b\u0010\u001f\u001a\u00020\u0003H\u0016R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\n\"\u0004\b\u000b\u0010\fR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0012\"\u0004\b\u0014\u0010\u0015¨\u0006 "}, d2 = {"Landroidx/compose/foundation/text/modifiers/TextStringSimpleNode$TextSubstitutionValue;", "", "original", "", "substitution", "isShowingSubstitution", "", "layoutCache", "Landroidx/compose/foundation/text/modifiers/ParagraphLayoutCache;", "(Ljava/lang/String;Ljava/lang/String;ZLandroidx/compose/foundation/text/modifiers/ParagraphLayoutCache;)V", "()Z", "setShowingSubstitution", "(Z)V", "getLayoutCache", "()Landroidx/compose/foundation/text/modifiers/ParagraphLayoutCache;", "setLayoutCache", "(Landroidx/compose/foundation/text/modifiers/ParagraphLayoutCache;)V", "getOriginal", "()Ljava/lang/String;", "getSubstitution", "setSubstitution", "(Ljava/lang/String;)V", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "", "toString", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class TextSubstitutionValue {
        public static final int $stable = 0;
        private boolean isShowingSubstitution;
        private ParagraphLayoutCache layoutCache;
        private final String original;
        private String substitution;

        static {
            $stable = 8;
        }

        public static /* synthetic */ TextSubstitutionValue copy$default(TextSubstitutionValue r0, String r1, String r2, boolean r3, ParagraphLayoutCache r4, int r5, Object r6) {
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

        public final String component1() {
            return this.original;
        }

        public final String component2() {
            return this.substitution;
        }

        public final boolean component3() {
            return this.isShowingSubstitution;
        }

        public final ParagraphLayoutCache component4() {
            return this.layoutCache;
        }

        public final TextSubstitutionValue copy(String r2, String r3, boolean r4, ParagraphLayoutCache r5) {
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

        public TextSubstitutionValue(String original, String substitution, boolean isShowingSubstitution, ParagraphLayoutCache layoutCache) {
            this.original = original;
            this.substitution = substitution;
            this.isShowingSubstitution = isShowingSubstitution;
            this.layoutCache = layoutCache;
        }

        public /* synthetic */ TextSubstitutionValue(String r1, String r2, boolean r3, ParagraphLayoutCache r4, int r5, DefaultConstructorMarker r6) {
            if ((r5 & 4) == 0) goto L6;
            r3 = false;
        L6:
            if ((r5 & 8) == 0) goto L8;
            r4 = null;
        L8:
            this(r1, r2, r3, r4);
        }

        public final String getOriginal() {
            return this.original;
        }

        public final String getSubstitution() {
            return this.substitution;
        }

        public final void setSubstitution(String r1) {
            this.substitution = r1;
        }

        public final boolean isShowingSubstitution() {
            return this.isShowingSubstitution;
        }

        public final void setShowingSubstitution(boolean r1) {
            this.isShowingSubstitution = r1;
        }

        public final ParagraphLayoutCache getLayoutCache() {
            return this.layoutCache;
        }

        public final void setLayoutCache(ParagraphLayoutCache r1) {
            this.layoutCache = r1;
        }

        public String toString() {
            return "TextSubstitution(layoutCache=" + this.layoutCache + ", isShowingSubstitution=" + this.isShowingSubstitution + ')';
        }
    }

    static {
        $stable = 8;
    }

    public /* synthetic */ TextStringSimpleNode(String r1, TextStyle r2, FontFamily.Resolver r3, int r4, boolean r5, int r6, int r7, ColorProducer r8, DefaultConstructorMarker r9) {
        this(r1, r2, r3, r4, r5, r6, r7, r8);
    }

    private static /* synthetic */ void getBaselineCache$annotations() {
    }

    public /* synthetic */ TextStringSimpleNode(String r13, TextStyle r14, FontFamily.Resolver r15, int r16, boolean r17, int r18, int r19, ColorProducer r20, int r21, DefaultConstructorMarker r22) {
        if ((r21 & 8) == 0) goto L5;
        int r6 = TextOverflow.Companion.m6886getClipgIe3tQ8();
    L7:
        if ((r21 & 16) == 0) goto L9;
        boolean r7 = true;
    L11:
        if ((r21 & 32) == 0) goto L13;
        int r8 = Integer.MAX_VALUE;
    L15:
        if ((r21 & 64) == 0) goto L17;
        int r9 = 1;
    L19:
        if ((r21 & 128) == 0) goto L21;
        ColorProducer r10 = null;
    L22:
        this(r13, r14, r15, r6, r7, r8, r9, r10, null);
        return;
    L21:
        r10 = r20;
        goto L22
    L17:
        r9 = r19;
        goto L19
    L13:
        r8 = r18;
        goto L15
    L9:
        r7 = r17;
        goto L11
    L5:
        r6 = r16;
        goto L7
    }

    public static final /* synthetic */ void access$clearSubstitution(TextStringSimpleNode $this) {
        $this.clearSubstitution();
    }

    public static final /* synthetic */ ParagraphLayoutCache access$getLayoutCache(TextStringSimpleNode $this) {
        return $this.getLayoutCache();
    }

    public static final /* synthetic */ ColorProducer access$getOverrideColor$p(TextStringSimpleNode $this) {
        return $this.overrideColor;
    }

    public static final /* synthetic */ TextStyle access$getStyle$p(TextStringSimpleNode $this) {
        return $this.style;
    }

    public static final /* synthetic */ TextSubstitutionValue access$getTextSubstitution$p(TextStringSimpleNode $this) {
        return $this.textSubstitution;
    }

    public static final /* synthetic */ void access$invalidateForTranslate(TextStringSimpleNode $this) {
        $this.invalidateForTranslate();
    }

    public static final /* synthetic */ boolean access$setSubstitution(TextStringSimpleNode $this, String updatedText) {
        return $this.setSubstitution(updatedText);
    }

    private TextStringSimpleNode(String text, TextStyle style, FontFamily.Resolver fontFamilyResolver, int overflow, boolean softWrap, int maxLines, int minLines, ColorProducer overrideColor) {
        this.text = text;
        this.style = style;
        this.fontFamilyResolver = fontFamilyResolver;
        this.overflow = overflow;
        this.softWrap = softWrap;
        this.maxLines = maxLines;
        this.minLines = minLines;
        this.overrideColor = overrideColor;
    }

    @Override // androidx.compose.ui.Modifier.Node
    public boolean getShouldAutoInvalidate() {
        return false;
    }

    private final ParagraphLayoutCache getLayoutCache() {
        if (this._layoutCache != null) goto L5;
        this._layoutCache = new ParagraphLayoutCache(this.text, this.style, this.fontFamilyResolver, this.overflow, this.softWrap, this.maxLines, this.minLines, null);
    L5:
        ParagraphLayoutCache r0 = this._layoutCache;
        Intrinsics.checkNotNull(r0);
        return r0;
    }

    private final ParagraphLayoutCache getLayoutCacheForMeasure(IntrinsicMeasureScope $this$getLayoutCacheForMeasure) {
        ParagraphLayoutCache activeCache = getLayoutCacheOrSubstitute();
        activeCache.setDensity$foundation_release($this$getLayoutCacheForMeasure);
        return activeCache;
    }

    private final ParagraphLayoutCache getLayoutCacheOrSubstitute() {
        TextSubstitutionValue it = this.textSubstitution;
        if (it == null) goto L12;
        if (it.isShowingSubstitution() == true) goto L8;
        it = null;
    L8:
        if (it == null) goto L12;
        ParagraphLayoutCache r0 = it.getLayoutCache();
        if (r0 == null) goto L12;
        return r0;
    L12:
        return getLayoutCache();
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

    public final boolean updateText(String text) {
        if (Intrinsics.areEqual(this.text, text) == false) goto L6;
        return false;
    L6:
        this.text = text;
        clearSubstitution();
        return true;
    }

    /* JADX INFO: renamed from: updateLayoutRelatedArgs-HuAbxIM, reason: not valid java name */
    public final boolean m1427updateLayoutRelatedArgsHuAbxIM(TextStyle style, int minLines, int maxLines, boolean softWrap, FontFamily.Resolver fontFamilyResolver, int overflow) {
        boolean changed = !this.style.hasSameLayoutAffectingAttributes(style);
        this.style = style;
        if (this.minLines == minLines) goto L6;
        this.minLines = minLines;
        changed = true;
    L6:
        if (this.maxLines == maxLines) goto L9;
        this.maxLines = maxLines;
        changed = true;
    L9:
        if (this.softWrap == softWrap) goto L12;
        this.softWrap = softWrap;
        changed = true;
    L12:
        if (Intrinsics.areEqual(this.fontFamilyResolver, fontFamilyResolver) == true) goto L15;
        this.fontFamilyResolver = fontFamilyResolver;
        changed = true;
    L15:
        if (TextOverflow.m6877equalsimpl0(this.overflow, overflow) == true) goto L18;
        this.overflow = overflow;
        return true;
    L18:
        return changed;
    }

    public final void doInvalidations(boolean drawChanged, boolean textChanged, boolean layoutChanged) {
        if (textChanged == true) goto L4;
        if (layoutChanged == true) goto L4;
    L6:
        if (isAttached() == true) goto L8;
        return;
    L8:
        if (textChanged == true) goto L12;
        if (drawChanged == true) goto L11;
    L13:
        if (textChanged == true) goto L15;
        if (layoutChanged == true) goto L15;
    L16:
        if (drawChanged == false) goto L19;
        DrawModifierNodeKt.invalidateDraw(this);
        return;
    L19:
        return;
    L15:
        LayoutModifierNodeKt.invalidateMeasurement(this);
        DrawModifierNodeKt.invalidateDraw(this);
        goto L16
    L11:
        if (this.semanticsTextLayoutResult == null) goto L13;
    L12:
        SemanticsModifierNodeKt.invalidateSemantics(this);
    L4:
        getLayoutCache().m1420updateL6sJoHM(this.text, this.style, this.fontFamilyResolver, this.overflow, this.softWrap, this.maxLines, this.minLines);
        goto L6
    }

    private final boolean setSubstitution(String updatedText) {
        TextSubstitutionValue currentTextSubstitution = this.textSubstitution;
        if (currentTextSubstitution != null) goto L5;
        boolean r3 = false;
        ParagraphLayoutCache r4 = null;
        TextSubstitutionValue newTextSubstitution = new TextSubstitutionValue(this.text, updatedText, r3, r4, 12, null);
        ParagraphLayoutCache substitutionLayoutCache = new ParagraphLayoutCache(updatedText, this.style, this.fontFamilyResolver, this.overflow, this.softWrap, this.maxLines, this.minLines, null);
        substitutionLayoutCache.setDensity$foundation_release(getLayoutCache().getDensity$foundation_release());
        newTextSubstitution.setLayoutCache(substitutionLayoutCache);
        this.textSubstitution = newTextSubstitution;
        return true;
    L5:
        if (Intrinsics.areEqual(updatedText, currentTextSubstitution.getSubstitution()) == false) goto L7;
        return false;
    L7:
        currentTextSubstitution.setSubstitution(updatedText);
        ParagraphLayoutCache r0 = currentTextSubstitution.getLayoutCache();
        if (r0 == null) goto L10;
        r0.m1420updateL6sJoHM(updatedText, this.style, this.fontFamilyResolver, this.overflow, this.softWrap, this.maxLines, this.minLines);
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

    private final void clearSubstitution() {
        this.textSubstitution = null;
    }

    @Override // androidx.compose.ui.node.SemanticsModifierNode
    public void applySemantics(SemanticsPropertyReceiver $this$applySemantics) {
        Function1<? super List<TextLayoutResult>, Boolean> r0 = this.semanticsTextLayoutResult;
        if (r0 != null) goto L5;
        r0 = new AnonymousClass1(this);
        this.semanticsTextLayoutResult = r0;
    L5:
        SemanticsPropertiesKt.setText($this$applySemantics, new AnnotatedString(this.text, null, 2, null));
        TextSubstitutionValue currentTextSubstitution = this.textSubstitution;
        if (currentTextSubstitution == null) goto L8;
        SemanticsPropertiesKt.setShowingTextSubstitution($this$applySemantics, currentTextSubstitution.isShowingSubstitution());
        SemanticsPropertiesKt.setTextSubstitution($this$applySemantics, new AnnotatedString(currentTextSubstitution.getSubstitution(), null, 2, null));
    L8:
        SemanticsPropertiesKt.setTextSubstitution$default($this$applySemantics, null, new AnonymousClass2(this), 1, null);
        SemanticsPropertiesKt.showTextSubstitution$default($this$applySemantics, null, new AnonymousClass3(this), 1, null);
        SemanticsPropertiesKt.clearTextSubstitution$default($this$applySemantics, null, new AnonymousClass4(this), 1, null);
        SemanticsPropertiesKt.getTextLayoutResult$default($this$applySemantics, null, r0, 1, null);
    }

    private final void invalidateForTranslate() {
        SemanticsModifierNodeKt.invalidateSemantics(this);
        LayoutModifierNodeKt.invalidateMeasurement(this);
        DrawModifierNodeKt.invalidateDraw(this);
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    /* JADX INFO: renamed from: measure-3p2s80s */
    public MeasureResult mo60measure3p2s80s(MeasureScope $this$measure_u2d3p2s80s, Measurable measurable, long constraints) {
        ParagraphLayoutCache layoutCache = getLayoutCacheForMeasure($this$measure_u2d3p2s80s);
        boolean didChangeLayout = layoutCache.m1418layoutWithConstraintsK40F9xA(constraints, $this$measure_u2d3p2s80s.getLayoutDirection());
        layoutCache.getObserveFontChanges$foundation_release();
        Paragraph paragraph = layoutCache.getParagraph$foundation_release();
        Intrinsics.checkNotNull(paragraph);
        long layoutSize = layoutCache.m1416getLayoutSizeYbymL2g$foundation_release();
        if (didChangeLayout == false) goto L8;
        LayoutModifierNodeKt.invalidateLayer(this);
        Map r9 = this.baselineCache;
        if (r9 != null) goto L7;
        Map cache = new HashMap(2);
        r9 = cache;
        this.baselineCache = r9;
    L7:
        HorizontalAlignmentLine r10 = AlignmentLineKt.getFirstBaseline();
        float $this$fastRoundToInt$iv = paragraph.getFirstBaseline();
        r9.put(r10, Integer.valueOf(Math.round($this$fastRoundToInt$iv)));
        HorizontalAlignmentLine r11 = AlignmentLineKt.getLastBaseline();
        float $this$fastRoundToInt$iv2 = paragraph.getLastBaseline();
        r9.put(r11, Integer.valueOf(Math.round($this$fastRoundToInt$iv2)));
    L8:
        final Placeable placeable = measurable.mo5714measureBRTryo0(Constraints.Companion.m6935fitPrioritizingWidthZbe2FdA((int) (layoutSize >> 32), (int) (layoutSize >> 32), (int) (layoutSize & 4294967295L), (int) (layoutSize & 4294967295L)));
        int $i$f$unpackInt1 = (int) (layoutSize >> 32);
        Map<AlignmentLine, Integer> r3 = this.baselineCache;
        Intrinsics.checkNotNull(r3);
        return $this$measure_u2d3p2s80s.layout($i$f$unpackInt1, (int) (layoutSize & 4294967295L), r3, new TextStringSimpleNode$measure$1(placeable));
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public int minIntrinsicWidth(IntrinsicMeasureScope $this$minIntrinsicWidth, IntrinsicMeasurable measurable, int height) {
        return getLayoutCacheForMeasure($this$minIntrinsicWidth).minIntrinsicWidth($this$minIntrinsicWidth.getLayoutDirection());
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public int minIntrinsicHeight(IntrinsicMeasureScope $this$minIntrinsicHeight, IntrinsicMeasurable measurable, int width) {
        return getLayoutCacheForMeasure($this$minIntrinsicHeight).intrinsicHeight(width, $this$minIntrinsicHeight.getLayoutDirection());
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public int maxIntrinsicWidth(IntrinsicMeasureScope $this$maxIntrinsicWidth, IntrinsicMeasurable measurable, int height) {
        return getLayoutCacheForMeasure($this$maxIntrinsicWidth).maxIntrinsicWidth($this$maxIntrinsicWidth.getLayoutDirection());
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public int maxIntrinsicHeight(IntrinsicMeasureScope $this$maxIntrinsicHeight, IntrinsicMeasurable measurable, int width) {
        return getLayoutCacheForMeasure($this$maxIntrinsicHeight).intrinsicHeight(width, $this$maxIntrinsicHeight.getLayoutDirection());
    }

    @Override // androidx.compose.ui.node.DrawModifierNode
    public void draw(ContentDrawScope $this$draw) {
        if (isAttached() == true) goto L5;
        return;
    L5:
        ParagraphLayoutCache layoutCache = getLayoutCacheOrSubstitute();
        Paragraph localParagraph = layoutCache.getParagraph$foundation_release();
        if (localParagraph == null) goto L49;
        ContentDrawScope $this$drawIntoCanvas$iv = $this$draw;
        Canvas canvas = $this$drawIntoCanvas$iv.getDrawContext().getCanvas();
        boolean willClip = layoutCache.getDidOverflow$foundation_release();
        if (willClip == false) goto L51;
        long arg0$iv = layoutCache.m1416getLayoutSizeYbymL2g$foundation_release();
        float width = (int) (arg0$iv >> 32);
        long arg0$iv2 = layoutCache.m1416getLayoutSizeYbymL2g$foundation_release();
        float height = (int) (4294967295L & arg0$iv2);
        canvas.save();
        Canvas.m4338clipRectN_I0leg$default(canvas, 0.0f, 0.0f, width, height, 0, 16, null);
    L51:
        TextDecoration r0 = this.style.getTextDecoration();     // Catch: Throwable -> L45
        if (r0 != null) goto L14;
        r0 = TextDecoration.Companion.getNone();     // Catch: Throwable -> L45
    L14:
        TextDecoration textDecoration = r0;
        Shadow r1 = this.style.getShadow();     // Catch: Throwable -> L45
        if (r1 != null) goto L17;
        r1 = Shadow.Companion.getNone();     // Catch: Throwable -> L45
    L17:
        Shadow shadow = r1;
        Fill r2 = this.style.getDrawStyle();     // Catch: Throwable -> L45
        if (r2 != null) goto L20;
        r2 = Fill.INSTANCE;     // Catch: Throwable -> L45
    L20:
        DrawStyle drawStyle = r2;
        Brush brush = this.style.getBrush();     // Catch: Throwable -> L45
        if (brush == null) goto L23;
        float alpha = this.style.getAlpha();     // Catch: Throwable -> L45
        Paragraph.m6277painthn5TExg$default(localParagraph, canvas, brush, alpha, shadow, textDecoration, drawStyle, 0, 64, null);     // Catch: Throwable -> L45
    L41:
        if (willClip == false) goto L52;
        canvas.restore();
        return;
    L52:
        return;
    L23:
        ColorProducer r6 = this.overrideColor;     // Catch: Throwable -> L45
        if (r6 == null) goto L26;
        long $this$isSpecified$iv = r6.mo1640invoke0d7_KjU();     // Catch: Throwable -> L45
    L27:
        long overrideColorVal = $this$isSpecified$iv;
        boolean r20 = true;
        if ($this$isSpecified$iv == 16) goto L30;
        boolean r7 = true;
    L31:
        if (r7 == false) goto L33;
        long color = overrideColorVal;
    L40:
        Paragraph.m6275paintLG529CI$default(localParagraph, canvas, color, shadow, textDecoration, drawStyle, 0, 32, null);     // Catch: Throwable -> L45
        goto L41
    L33:
        long $this$isSpecified$iv2 = this.style.m6447getColor0d7_KjU();     // Catch: Throwable -> L45
        if ($this$isSpecified$iv2 != 16) goto L37;
        r20 = false;
    L37:
        if (r20 == false) goto L39;
        color = this.style.m6447getColor0d7_KjU();     // Catch: Throwable -> L45
        goto L40
    L39:
        color = Color.Companion.m4392getBlack0d7_KjU();     // Catch: Throwable -> L45
        goto L40
    L30:
        r7 = false;
        goto L31
    L26:
        $this$isSpecified$iv = Color.Companion.m4402getUnspecified0d7_KjU();     // Catch: Throwable -> L45
    L45:
        th = move-exception;
        if (willClip == false) goto L48;
        canvas.restore();
    L48:
        throw th;
    L49:
        InlineClassHelperKt.throwIllegalArgumentExceptionForNullCheck("no paragraph (layoutCache=" + this._layoutCache + ", textSubstitution=" + this.textSubstitution + ')');
        throw new KotlinNothingValueException();
    }
}
