package androidx.compose.foundation.text.input.internal;

import androidx.compose.foundation.internal.InlineClassHelperKt;
import androidx.compose.foundation.text.KeyboardOptions;
import androidx.compose.foundation.text.input.TextFieldCharSequence;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotMutationPolicy;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.snapshots.Snapshot;
import androidx.compose.runtime.snapshots.SnapshotKt;
import androidx.compose.runtime.snapshots.StateObject;
import androidx.compose.runtime.snapshots.StateRecord;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.PlatformTextStyle;
import androidx.compose.ui.text.TextLayoutInput;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextMeasurer;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.input.KeyboardType;
import androidx.compose.ui.text.intl.Locale;
import androidx.compose.ui.text.intl.LocaleList;
import androidx.compose.ui.text.style.BaselineShift;
import androidx.compose.ui.text.style.LineHeightStyle;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextGeometricTransform;
import androidx.compose.ui.text.style.TextIndent;
import androidx.compose.ui.text.style.TextMotion;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: compiled from: TextFieldLayoutStateCache.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u008c\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00012\u00020\u0003:\u0003DEFB\u0005¢\u0006\u0002\u0010\u0004J \u0010 \u001a\u00020\u00022\u0006\u0010!\u001a\u00020\"2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u000b\u001a\u00020\nH\u0002J\u0018\u0010#\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u000b\u001a\u00020\nH\u0002J0\u0010$\u001a\u00020\u00022\u0006\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020(2\u0006\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020,ø\u0001\u0000¢\u0006\u0004\b-\u0010.J \u0010/\u001a\u00020\u00062\u0006\u00100\u001a\u00020\u00062\u0006\u00101\u001a\u00020\u00062\u0006\u00102\u001a\u00020\u0006H\u0016J\u0010\u00103\u001a\u00020\u001c2\u0006\u0010\u000b\u001a\u00020\nH\u0002J\u0010\u00104\u001a\u0002052\u0006\u0010\u001d\u001a\u00020\u0006H\u0016J\"\u00106\u001a\u0002052\u0017\u00107\u001a\u0013\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020508¢\u0006\u0002\b9H\u0082\bJ.\u0010:\u001a\u0002052\u0006\u0010;\u001a\u00020<2\u0006\u0010=\u001a\u00020>2\u0006\u0010?\u001a\u00020@2\u0006\u0010A\u001a\u00020@2\u0006\u0010B\u001a\u00020CR\u0014\u0010\u0005\u001a\u00020\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR/\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\u0010\t\u001a\u0004\u0018\u00010\n8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR/\u0010\u0013\u001a\u0004\u0018\u00010\u00122\b\u0010\t\u001a\u0004\u0018\u00010\u00128B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b\u0018\u0010\u0011\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u000e\u0010\u0019\u001a\u00020\u001aX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001b\u001a\u0004\u0018\u00010\u001cX\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u001d\u001a\u0004\u0018\u00010\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001f\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006G"}, d2 = {"Landroidx/compose/foundation/text/input/internal/TextFieldLayoutStateCache;", "Landroidx/compose/runtime/State;", "Landroidx/compose/ui/text/TextLayoutResult;", "Landroidx/compose/runtime/snapshots/StateObject;", "()V", "firstStateRecord", "Landroidx/compose/runtime/snapshots/StateRecord;", "getFirstStateRecord", "()Landroidx/compose/runtime/snapshots/StateRecord;", "<set-?>", "Landroidx/compose/foundation/text/input/internal/TextFieldLayoutStateCache$MeasureInputs;", "measureInputs", "getMeasureInputs", "()Landroidx/compose/foundation/text/input/internal/TextFieldLayoutStateCache$MeasureInputs;", "setMeasureInputs", "(Landroidx/compose/foundation/text/input/internal/TextFieldLayoutStateCache$MeasureInputs;)V", "measureInputs$delegate", "Landroidx/compose/runtime/MutableState;", "Landroidx/compose/foundation/text/input/internal/TextFieldLayoutStateCache$NonMeasureInputs;", "nonMeasureInputs", "getNonMeasureInputs", "()Landroidx/compose/foundation/text/input/internal/TextFieldLayoutStateCache$NonMeasureInputs;", "setNonMeasureInputs", "(Landroidx/compose/foundation/text/input/internal/TextFieldLayoutStateCache$NonMeasureInputs;)V", "nonMeasureInputs$delegate", "record", "Landroidx/compose/foundation/text/input/internal/TextFieldLayoutStateCache$CacheRecord;", "textMeasurer", "Landroidx/compose/ui/text/TextMeasurer;", "value", "getValue", "()Landroidx/compose/ui/text/TextLayoutResult;", "computeLayout", "visualText", "Landroidx/compose/foundation/text/input/TextFieldCharSequence;", "getOrComputeLayout", "layoutWithNewMeasureInputs", "density", "Landroidx/compose/ui/unit/Density;", "layoutDirection", "Landroidx/compose/ui/unit/LayoutDirection;", "fontFamilyResolver", "Landroidx/compose/ui/text/font/FontFamily$Resolver;", "constraints", "Landroidx/compose/ui/unit/Constraints;", "layoutWithNewMeasureInputs--hBUhpc", "(Landroidx/compose/ui/unit/Density;Landroidx/compose/ui/unit/LayoutDirection;Landroidx/compose/ui/text/font/FontFamily$Resolver;J)Landroidx/compose/ui/text/TextLayoutResult;", "mergeRecords", "previous", "current", "applied", "obtainTextMeasurer", "prependStateRecord", "", "updateCacheIfWritable", "block", "Lkotlin/Function1;", "Lkotlin/ExtensionFunctionType;", "updateNonMeasureInputs", "textFieldState", "Landroidx/compose/foundation/text/input/internal/TransformedTextFieldState;", "textStyle", "Landroidx/compose/ui/text/TextStyle;", "singleLine", "", "softWrap", "keyboardOptions", "Landroidx/compose/foundation/text/KeyboardOptions;", "CacheRecord", "MeasureInputs", "NonMeasureInputs", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class TextFieldLayoutStateCache implements State<TextLayoutResult>, StateObject {
    public static final int $stable = 0;
    private final MutableState measureInputs$delegate;
    private final MutableState nonMeasureInputs$delegate;
    private CacheRecord record;
    private TextMeasurer textMeasurer;

    /* JADX INFO: compiled from: TextFieldLayoutStateCache.kt */
    @Metadata(d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\r\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010I\u001a\u00020J2\u0006\u0010K\u001a\u00020\u0001H\u0016J\b\u0010L\u001a\u00020\u0001H\u0016J\b\u0010M\u001a\u00020NH\u0016R,\u0010\u0003\u001a\u0014\u0012\u000e\u0012\f\u0012\u0004\u0012\u00020\u00060\u0005j\u0002`\u0007\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\"\u0010\f\u001a\u0004\u0018\u00010\rX\u0086\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\"\u0010\u0012\u001a\u00020\u0013X\u0086\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0010\n\u0002\u0010\u0018\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0019\u001a\u00020\u001aX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u001c\u0010\u001f\u001a\u0004\u0018\u00010 X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\u001a\u0010%\u001a\u00020\u001aX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b&\u0010\u001c\"\u0004\b'\u0010\u001eR\u001c\u0010(\u001a\u0004\u0018\u00010)X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R\u001c\u0010.\u001a\u0004\u0018\u00010/X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b0\u00101\"\u0004\b2\u00103R\u001a\u00104\u001a\u000205X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b6\u00107\"\u0004\b8\u00109R\u001a\u0010:\u001a\u000205X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b;\u00107\"\u0004\b<\u00109R\u001c\u0010=\u001a\u0004\u0018\u00010>X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b?\u0010@\"\u0004\bA\u0010BR\u001c\u0010C\u001a\u0004\u0018\u00010DX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bE\u0010F\"\u0004\bG\u0010H\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006O"}, d2 = {"Landroidx/compose/foundation/text/input/internal/TextFieldLayoutStateCache$CacheRecord;", "Landroidx/compose/runtime/snapshots/StateRecord;", "()V", "composingAnnotations", "", "Landroidx/compose/ui/text/AnnotatedString$Range;", "Landroidx/compose/ui/text/AnnotatedString$Annotation;", "Landroidx/compose/foundation/text/input/PlacedAnnotation;", "getComposingAnnotations", "()Ljava/util/List;", "setComposingAnnotations", "(Ljava/util/List;)V", "composition", "Landroidx/compose/ui/text/TextRange;", "getComposition-MzsxiRA", "()Landroidx/compose/ui/text/TextRange;", "setComposition-OEnZFl4", "(Landroidx/compose/ui/text/TextRange;)V", "constraints", "Landroidx/compose/ui/unit/Constraints;", "getConstraints-msEJaDk", "()J", "setConstraints-BRTryo0", "(J)V", "J", "densityValue", "", "getDensityValue", "()F", "setDensityValue", "(F)V", "fontFamilyResolver", "Landroidx/compose/ui/text/font/FontFamily$Resolver;", "getFontFamilyResolver", "()Landroidx/compose/ui/text/font/FontFamily$Resolver;", "setFontFamilyResolver", "(Landroidx/compose/ui/text/font/FontFamily$Resolver;)V", "fontScale", "getFontScale", "setFontScale", "layoutDirection", "Landroidx/compose/ui/unit/LayoutDirection;", "getLayoutDirection", "()Landroidx/compose/ui/unit/LayoutDirection;", "setLayoutDirection", "(Landroidx/compose/ui/unit/LayoutDirection;)V", "layoutResult", "Landroidx/compose/ui/text/TextLayoutResult;", "getLayoutResult", "()Landroidx/compose/ui/text/TextLayoutResult;", "setLayoutResult", "(Landroidx/compose/ui/text/TextLayoutResult;)V", "singleLine", "", "getSingleLine", "()Z", "setSingleLine", "(Z)V", "softWrap", "getSoftWrap", "setSoftWrap", "textStyle", "Landroidx/compose/ui/text/TextStyle;", "getTextStyle", "()Landroidx/compose/ui/text/TextStyle;", "setTextStyle", "(Landroidx/compose/ui/text/TextStyle;)V", "visualText", "", "getVisualText", "()Ljava/lang/CharSequence;", "setVisualText", "(Ljava/lang/CharSequence;)V", "assign", "", "value", "create", "toString", "", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    private static final class CacheRecord extends StateRecord {
        private List<AnnotatedString.Range<AnnotatedString.Annotation>> composingAnnotations;
        private TextRange composition;
        private long constraints;
        private float densityValue;
        private FontFamily.Resolver fontFamilyResolver;
        private float fontScale;
        private LayoutDirection layoutDirection;
        private TextLayoutResult layoutResult;
        private boolean singleLine;
        private boolean softWrap;
        private TextStyle textStyle;
        private CharSequence visualText;

        public CacheRecord() {
            this.densityValue = Float.NaN;
            this.fontScale = Float.NaN;
            this.constraints = ConstraintsKt.Constraints$default(0, 0, 0, 0, 15, null);
        }

        public final CharSequence getVisualText() {
            return this.visualText;
        }

        public final void setVisualText(CharSequence r1) {
            this.visualText = r1;
        }

        public final List<AnnotatedString.Range<AnnotatedString.Annotation>> getComposingAnnotations() {
            return this.composingAnnotations;
        }

        public final void setComposingAnnotations(List<AnnotatedString.Range<AnnotatedString.Annotation>> r1) {
            this.composingAnnotations = r1;
        }

        /* JADX INFO: renamed from: getComposition-MzsxiRA, reason: not valid java name */
        public final TextRange m1291getCompositionMzsxiRA() {
            return this.composition;
        }

        /* JADX INFO: renamed from: setComposition-OEnZFl4, reason: not valid java name */
        public final void m1293setCompositionOEnZFl4(TextRange r1) {
            this.composition = r1;
        }

        public final TextStyle getTextStyle() {
            return this.textStyle;
        }

        public final void setTextStyle(TextStyle r1) {
            this.textStyle = r1;
        }

        public final boolean getSingleLine() {
            return this.singleLine;
        }

        public final void setSingleLine(boolean r1) {
            this.singleLine = r1;
        }

        public final boolean getSoftWrap() {
            return this.softWrap;
        }

        public final void setSoftWrap(boolean r1) {
            this.softWrap = r1;
        }

        public final float getDensityValue() {
            return this.densityValue;
        }

        public final void setDensityValue(float r1) {
            this.densityValue = r1;
        }

        public final float getFontScale() {
            return this.fontScale;
        }

        public final void setFontScale(float r1) {
            this.fontScale = r1;
        }

        public final LayoutDirection getLayoutDirection() {
            return this.layoutDirection;
        }

        public final void setLayoutDirection(LayoutDirection r1) {
            this.layoutDirection = r1;
        }

        public final FontFamily.Resolver getFontFamilyResolver() {
            return this.fontFamilyResolver;
        }

        public final void setFontFamilyResolver(FontFamily.Resolver r1) {
            this.fontFamilyResolver = r1;
        }

        /* JADX INFO: renamed from: getConstraints-msEJaDk, reason: not valid java name */
        public final long m1292getConstraintsmsEJaDk() {
            return this.constraints;
        }

        /* JADX INFO: renamed from: setConstraints-BRTryo0, reason: not valid java name */
        public final void m1294setConstraintsBRTryo0(long r1) {
            this.constraints = r1;
        }

        public final TextLayoutResult getLayoutResult() {
            return this.layoutResult;
        }

        public final void setLayoutResult(TextLayoutResult r1) {
            this.layoutResult = r1;
        }

        @Override // androidx.compose.runtime.snapshots.StateRecord
        public StateRecord create() {
            return new CacheRecord();
        }

        @Override // androidx.compose.runtime.snapshots.StateRecord
        public void assign(StateRecord value) {
            Intrinsics.checkNotNull(value, "null cannot be cast to non-null type androidx.compose.foundation.text.input.internal.TextFieldLayoutStateCache.CacheRecord");
            CacheRecord r0 = (CacheRecord) value;
            this.visualText = ((CacheRecord) value).visualText;
            this.composingAnnotations = ((CacheRecord) value).composingAnnotations;
            this.composition = ((CacheRecord) value).composition;
            this.textStyle = ((CacheRecord) value).textStyle;
            this.singleLine = ((CacheRecord) value).singleLine;
            this.softWrap = ((CacheRecord) value).softWrap;
            this.densityValue = ((CacheRecord) value).densityValue;
            this.fontScale = ((CacheRecord) value).fontScale;
            this.layoutDirection = ((CacheRecord) value).layoutDirection;
            this.fontFamilyResolver = ((CacheRecord) value).fontFamilyResolver;
            this.constraints = ((CacheRecord) value).constraints;
            this.layoutResult = ((CacheRecord) value).layoutResult;
        }

        public String toString() {
            StringBuilder r0 = new StringBuilder();
            r0.append("CacheRecord(visualText=").append(this.visualText).append(", composingAnnotations=").append(this.composingAnnotations).append(", composition=").append(this.composition).append(", textStyle=").append(this.textStyle).append(", singleLine=").append(this.singleLine).append(", softWrap=").append(this.softWrap).append(", densityValue=").append(this.densityValue).append(", fontScale=").append(this.fontScale).append(", layoutDirection=").append(this.layoutDirection).append(", fontFamilyResolver=").append(this.fontFamilyResolver).append(", constraints=").append(Constraints.m6931toStringimpl(this.constraints)).append(", layoutResult=");
            r0.append(this.layoutResult).append(')');
            return r0.toString();
        }
    }

    /* JADX INFO: compiled from: TextFieldLayoutStateCache.kt */
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0007\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0002\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001cB%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\b\u0010\u001a\u001a\u00020\u001bH\u0016R\u0019\u0010\b\u001a\u00020\tø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0010\u001a\u00020\u0011¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0016\u001a\u00020\u0011¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0013R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u001d"}, d2 = {"Landroidx/compose/foundation/text/input/internal/TextFieldLayoutStateCache$MeasureInputs;", "", "density", "Landroidx/compose/ui/unit/Density;", "layoutDirection", "Landroidx/compose/ui/unit/LayoutDirection;", "fontFamilyResolver", "Landroidx/compose/ui/text/font/FontFamily$Resolver;", "constraints", "Landroidx/compose/ui/unit/Constraints;", "(Landroidx/compose/ui/unit/Density;Landroidx/compose/ui/unit/LayoutDirection;Landroidx/compose/ui/text/font/FontFamily$Resolver;JLkotlin/jvm/internal/DefaultConstructorMarker;)V", "getConstraints-msEJaDk", "()J", "J", "getDensity", "()Landroidx/compose/ui/unit/Density;", "densityValue", "", "getDensityValue", "()F", "getFontFamilyResolver", "()Landroidx/compose/ui/text/font/FontFamily$Resolver;", "fontScale", "getFontScale", "getLayoutDirection", "()Landroidx/compose/ui/unit/LayoutDirection;", "toString", "", "Companion", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    private static final class MeasureInputs {
        public static final Companion Companion = null;
        private static final SnapshotMutationPolicy<MeasureInputs> mutationPolicy = null;
        private final long constraints;
        private final Density density;
        private final float densityValue;
        private final FontFamily.Resolver fontFamilyResolver;
        private final float fontScale;
        private final LayoutDirection layoutDirection;

        /* JADX INFO: compiled from: TextFieldLayoutStateCache.kt */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0019\u0010\u0003\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Landroidx/compose/foundation/text/input/internal/TextFieldLayoutStateCache$MeasureInputs$Companion;", "", "()V", "mutationPolicy", "Landroidx/compose/runtime/SnapshotMutationPolicy;", "Landroidx/compose/foundation/text/input/internal/TextFieldLayoutStateCache$MeasureInputs;", "getMutationPolicy", "()Landroidx/compose/runtime/SnapshotMutationPolicy;", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker r1) {
                this();
            }

            private Companion() {
            }

            public final SnapshotMutationPolicy<MeasureInputs> getMutationPolicy() {
                return MeasureInputs.access$getMutationPolicy$cp();
            }
        }

        public /* synthetic */ MeasureInputs(Density r1, LayoutDirection r2, FontFamily.Resolver r3, long r4, DefaultConstructorMarker r6) {
            this(r1, r2, r3, r4);
        }

        private MeasureInputs(Density density, LayoutDirection layoutDirection, FontFamily.Resolver fontFamilyResolver, long constraints) {
            this.density = density;
            this.layoutDirection = layoutDirection;
            this.fontFamilyResolver = fontFamilyResolver;
            this.constraints = constraints;
            this.densityValue = this.density.getDensity();
            this.fontScale = this.density.getFontScale();
        }

        public static final /* synthetic */ SnapshotMutationPolicy access$getMutationPolicy$cp() {
            return mutationPolicy;
        }

        public final Density getDensity() {
            return this.density;
        }

        public final LayoutDirection getLayoutDirection() {
            return this.layoutDirection;
        }

        public final FontFamily.Resolver getFontFamilyResolver() {
            return this.fontFamilyResolver;
        }

        /* JADX INFO: renamed from: getConstraints-msEJaDk, reason: not valid java name */
        public final long m1295getConstraintsmsEJaDk() {
            return this.constraints;
        }

        public final float getDensityValue() {
            return this.densityValue;
        }

        public final float getFontScale() {
            return this.fontScale;
        }

        public String toString() {
            return "MeasureInputs(density=" + this.density + ", densityValue=" + this.densityValue + ", fontScale=" + this.fontScale + ", layoutDirection=" + this.layoutDirection + ", fontFamilyResolver=" + this.fontFamilyResolver + ", constraints=" + Constraints.m6931toStringimpl(this.constraints) + ')';
        }

        static {
            Companion = new Companion(null);
            mutationPolicy = new TextFieldLayoutStateCache$MeasureInputs$Companion$mutationPolicy$1();
        }
    }

    /* JADX INFO: compiled from: TextFieldLayoutStateCache.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0002\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007¢\u0006\u0002\u0010\nJ\b\u0010\u0012\u001a\u00020\u0013H\u0016R\u0011\u0010\t\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u000bR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0011\u0010\b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0015"}, d2 = {"Landroidx/compose/foundation/text/input/internal/TextFieldLayoutStateCache$NonMeasureInputs;", "", "textFieldState", "Landroidx/compose/foundation/text/input/internal/TransformedTextFieldState;", "textStyle", "Landroidx/compose/ui/text/TextStyle;", "singleLine", "", "softWrap", "isKeyboardTypePhone", "(Landroidx/compose/foundation/text/input/internal/TransformedTextFieldState;Landroidx/compose/ui/text/TextStyle;ZZZ)V", "()Z", "getSingleLine", "getSoftWrap", "getTextFieldState", "()Landroidx/compose/foundation/text/input/internal/TransformedTextFieldState;", "getTextStyle", "()Landroidx/compose/ui/text/TextStyle;", "toString", "", "Companion", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    private static final class NonMeasureInputs {
        public static final Companion Companion = null;
        private static final SnapshotMutationPolicy<NonMeasureInputs> mutationPolicy = null;
        private final boolean isKeyboardTypePhone;
        private final boolean singleLine;
        private final boolean softWrap;
        private final TransformedTextFieldState textFieldState;
        private final TextStyle textStyle;

        /* JADX INFO: compiled from: TextFieldLayoutStateCache.kt */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0019\u0010\u0003\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Landroidx/compose/foundation/text/input/internal/TextFieldLayoutStateCache$NonMeasureInputs$Companion;", "", "()V", "mutationPolicy", "Landroidx/compose/runtime/SnapshotMutationPolicy;", "Landroidx/compose/foundation/text/input/internal/TextFieldLayoutStateCache$NonMeasureInputs;", "getMutationPolicy", "()Landroidx/compose/runtime/SnapshotMutationPolicy;", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker r1) {
                this();
            }

            private Companion() {
            }

            public final SnapshotMutationPolicy<NonMeasureInputs> getMutationPolicy() {
                return NonMeasureInputs.access$getMutationPolicy$cp();
            }
        }

        public NonMeasureInputs(TransformedTextFieldState textFieldState, TextStyle textStyle, boolean singleLine, boolean softWrap, boolean isKeyboardTypePhone) {
            this.textFieldState = textFieldState;
            this.textStyle = textStyle;
            this.singleLine = singleLine;
            this.softWrap = softWrap;
            this.isKeyboardTypePhone = isKeyboardTypePhone;
        }

        public static final /* synthetic */ SnapshotMutationPolicy access$getMutationPolicy$cp() {
            return mutationPolicy;
        }

        public final TransformedTextFieldState getTextFieldState() {
            return this.textFieldState;
        }

        public final TextStyle getTextStyle() {
            return this.textStyle;
        }

        public final boolean getSingleLine() {
            return this.singleLine;
        }

        public final boolean getSoftWrap() {
            return this.softWrap;
        }

        public final boolean isKeyboardTypePhone() {
            return this.isKeyboardTypePhone;
        }

        public String toString() {
            return "NonMeasureInputs(textFieldState=" + this.textFieldState + ", textStyle=" + this.textStyle + ", singleLine=" + this.singleLine + ", softWrap=" + this.softWrap + ", isKeyboardTypePhone=" + this.isKeyboardTypePhone + ')';
        }

        static {
            Companion = new Companion(null);
            mutationPolicy = new TextFieldLayoutStateCache$NonMeasureInputs$Companion$mutationPolicy$1();
        }
    }

    static {
    }

    public TextFieldLayoutStateCache() {
        this.nonMeasureInputs$delegate = SnapshotStateKt.mutableStateOf(null, NonMeasureInputs.Companion.getMutationPolicy());
        this.measureInputs$delegate = SnapshotStateKt.mutableStateOf(null, MeasureInputs.Companion.getMutationPolicy());
        this.record = new CacheRecord();
    }

    @Override // androidx.compose.runtime.State
    public /* bridge */ /* synthetic */ TextLayoutResult getValue() {
        return getValue();
    }

    private final NonMeasureInputs getNonMeasureInputs() {
        State $this$getValue$iv = this.nonMeasureInputs$delegate;
        return (NonMeasureInputs) $this$getValue$iv.getValue();
    }

    private final void setNonMeasureInputs(NonMeasureInputs r4) {
        MutableState $this$setValue$iv = this.nonMeasureInputs$delegate;
        $this$setValue$iv.setValue(r4);
    }

    private final MeasureInputs getMeasureInputs() {
        State $this$getValue$iv = this.measureInputs$delegate;
        return (MeasureInputs) $this$getValue$iv.getValue();
    }

    private final void setMeasureInputs(MeasureInputs r4) {
        MutableState $this$setValue$iv = this.measureInputs$delegate;
        $this$setValue$iv.setValue(r4);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.compose.runtime.State
    public TextLayoutResult getValue() {
        NonMeasureInputs nonMeasureInputs = getNonMeasureInputs();
        if (nonMeasureInputs != null) goto L5;
        return null;
    L5:
        MeasureInputs measureInputs = getMeasureInputs();
        if (measureInputs != null) goto L9;
        return null;
    L9:
        return getOrComputeLayout(nonMeasureInputs, measureInputs);
    }

    public final void updateNonMeasureInputs(TransformedTextFieldState textFieldState, TextStyle textStyle, boolean singleLine, boolean softWrap, KeyboardOptions keyboardOptions) {
        setNonMeasureInputs(new NonMeasureInputs(textFieldState, textStyle, singleLine, softWrap, KeyboardType.m6636equalsimpl0(keyboardOptions.m1067getKeyboardTypePjHm6EE(), KeyboardType.Companion.m6656getPhonePjHm6EE())));
    }

    /* JADX INFO: renamed from: layoutWithNewMeasureInputs--hBUhpc, reason: not valid java name */
    public final TextLayoutResult m1290layoutWithNewMeasureInputshBUhpc(Density density, LayoutDirection layoutDirection, FontFamily.Resolver fontFamilyResolver, long constraints) {
        MeasureInputs measureInputs = new MeasureInputs(density, layoutDirection, fontFamilyResolver, constraints, null);
        setMeasureInputs(measureInputs);
        NonMeasureInputs nonMeasureInputs = getNonMeasureInputs();
        if (nonMeasureInputs != null) goto L5;
        InlineClassHelperKt.throwIllegalStateExceptionForNullCheck("Called layoutWithNewMeasureInputs before updateNonMeasureInputs");
        throw new KotlinNothingValueException();
    L5:
        return getOrComputeLayout(nonMeasureInputs, measureInputs);
    }

    private final TextLayoutResult getOrComputeLayout(NonMeasureInputs nonMeasureInputs, MeasureInputs measureInputs) {
        TextFieldCharSequence visualText = nonMeasureInputs.getTextFieldState().getVisualText();
        StateRecord $this$withCurrent$iv = this.record;
        CacheRecord cachedRecord = (CacheRecord) SnapshotKt.current($this$withCurrent$iv);
        TextLayoutResult cachedResult = cachedRecord.getLayoutResult();
        if (cachedResult == null) goto L52;
        CharSequence r0 = cachedRecord.getVisualText();
        boolean r8 = true;
        boolean r9 = false;
        if (r0 != null) goto L7;
    L9:
        boolean r1 = false;
    L10:
        if (r1 == false) goto L52;
        if (Intrinsics.areEqual(cachedRecord.getComposingAnnotations(), visualText.getComposingAnnotations()) == false) goto L52;
        if (Intrinsics.areEqual(cachedRecord.m1291getCompositionMzsxiRA(), visualText.m1187getCompositionMzsxiRA()) == false) goto L52;
        if (cachedRecord.getSingleLine() != nonMeasureInputs.getSingleLine()) goto L52;
        if (cachedRecord.getSoftWrap() != nonMeasureInputs.getSoftWrap()) goto L52;
        if (cachedRecord.getLayoutDirection() != measureInputs.getLayoutDirection()) goto L52;
        if (cachedRecord.getDensityValue() != measureInputs.getDensity().getDensity()) goto L24;
        boolean r2 = true;
    L25:
        if (r2 == false) goto L52;
        if (cachedRecord.getFontScale() == measureInputs.getDensity().getFontScale()) goto L30;
        r8 = false;
    L30:
        if (r8 == false) goto L52;
        if (Constraints.m6919equalsimpl0(cachedRecord.m1292getConstraintsmsEJaDk(), measureInputs.m1295getConstraintsmsEJaDk()) == false) goto L52;
        if (Intrinsics.areEqual(cachedRecord.getFontFamilyResolver(), measureInputs.getFontFamilyResolver()) == false) goto L52;
        if (cachedResult.getMultiParagraph().getIntrinsics().getHasStaleResolvedFonts() == true) goto L52;
        TextStyle r3 = cachedRecord.getTextStyle();
        if (r3 == null) goto L40;
        boolean isLayoutAffectingSame = r3.hasSameLayoutAffectingAttributes(nonMeasureInputs.getTextStyle());
    L41:
        TextStyle r10 = cachedRecord.getTextStyle();
        if (r10 == null) goto L45;
        r9 = r10.hasSameDrawAffectingAttributes(nonMeasureInputs.getTextStyle());
    L45:
        boolean isDrawAffectingSame = r9;
        if (isLayoutAffectingSame == false) goto L49;
        if (isDrawAffectingSame == false) goto L49;
        return cachedResult;
    L49:
        if (isLayoutAffectingSame == false) goto L52;
        return TextLayoutResult.m6385copyO0kMr_c$default(cachedResult, new TextLayoutInput(cachedResult.getLayoutInput().getText(), nonMeasureInputs.getTextStyle(), cachedResult.getLayoutInput().getPlaceholders(), cachedResult.getLayoutInput().getMaxLines(), cachedResult.getLayoutInput().getSoftWrap(), cachedResult.getLayoutInput().m6384getOverflowgIe3tQ8(), cachedResult.getLayoutInput().getDensity(), cachedResult.getLayoutInput().getLayoutDirection(), cachedResult.getLayoutInput().getFontFamilyResolver(), cachedResult.getLayoutInput().m6383getConstraintsmsEJaDk(), null), 0, 2, null);
    L40:
        isLayoutAffectingSame = false;
        goto L41
    L24:
        r2 = false;
        goto L25
    L7:
        if (StringsKt.contentEquals(r0, visualText) != true) goto L9;
        r1 = true;
    L52:
        TextLayoutResult newResult = computeLayout(visualText, nonMeasureInputs, measureInputs);
        if (Intrinsics.areEqual(newResult, cachedResult) == true) goto L74;
        Snapshot snapshot$iv = Snapshot.Companion.getCurrent();
        if (snapshot$iv.getReadOnly() == true) goto L79;
        StateRecord $this$writable$iv$iv = this.record;
        Object lock$iv$iv$iv$iv = SnapshotKt.getLock();
        monitor-enter(lock$iv$iv$iv$iv);
        CacheRecord $this$getOrComputeLayout_u24lambda_u243_u24lambda_u242_u24lambda_u241 = (CacheRecord) SnapshotKt.writableRecord($this$writable$iv$iv, this, snapshot$iv);     // Catch: Throwable -> L66
        $this$getOrComputeLayout_u24lambda_u243_u24lambda_u242_u24lambda_u241.setVisualText(visualText);     // Catch: Throwable -> L66
        $this$getOrComputeLayout_u24lambda_u243_u24lambda_u242_u24lambda_u241.setComposingAnnotations(visualText.getComposingAnnotations());     // Catch: Throwable -> L66
        $this$getOrComputeLayout_u24lambda_u243_u24lambda_u242_u24lambda_u241.m1293setCompositionOEnZFl4(visualText.m1187getCompositionMzsxiRA());     // Catch: Throwable -> L66
        $this$getOrComputeLayout_u24lambda_u243_u24lambda_u242_u24lambda_u241.setSingleLine(nonMeasureInputs.getSingleLine());     // Catch: Throwable -> L66
        $this$getOrComputeLayout_u24lambda_u243_u24lambda_u242_u24lambda_u241.setSoftWrap(nonMeasureInputs.getSoftWrap());     // Catch: Throwable -> L66
        $this$getOrComputeLayout_u24lambda_u243_u24lambda_u242_u24lambda_u241.setTextStyle(nonMeasureInputs.getTextStyle());     // Catch: Throwable -> L66
        $this$getOrComputeLayout_u24lambda_u243_u24lambda_u242_u24lambda_u241.setLayoutDirection(measureInputs.getLayoutDirection());     // Catch: Throwable -> L66
        $this$getOrComputeLayout_u24lambda_u243_u24lambda_u242_u24lambda_u241.setDensityValue(measureInputs.getDensityValue());     // Catch: Throwable -> L66
        $this$getOrComputeLayout_u24lambda_u243_u24lambda_u242_u24lambda_u241.setFontScale(measureInputs.getFontScale());     // Catch: Throwable -> L66
        $this$getOrComputeLayout_u24lambda_u243_u24lambda_u242_u24lambda_u241.m1294setConstraintsBRTryo0(measureInputs.m1295getConstraintsmsEJaDk());     // Catch: Throwable -> L64
        $this$getOrComputeLayout_u24lambda_u243_u24lambda_u242_u24lambda_u241.setFontFamilyResolver(measureInputs.getFontFamilyResolver());     // Catch: Throwable -> L64
        $this$getOrComputeLayout_u24lambda_u243_u24lambda_u242_u24lambda_u241.setLayoutResult(newResult);     // Catch: Throwable -> L64
        Unit r4 = Unit.INSTANCE;     // Catch: Throwable -> L64
        monitor-exit(lock$iv$iv$iv$iv);
        SnapshotKt.notifyWrite(snapshot$iv, this);
        return newResult;
    L64:
        th = th;
    L68:
        monitor-exit(lock$iv$iv$iv$iv);
        throw th;
    L66:
        th = th;
        goto L68
    L79:
        return newResult;
    L74:
        return newResult;
    }

    private final void updateCacheIfWritable(Function1<? super CacheRecord, Unit> r10) {
        Snapshot snapshot = Snapshot.Companion.getCurrent();
        if (snapshot.getReadOnly() == true) goto L13;
        StateRecord $this$writable$iv = this.record;
        Object lock$iv$iv$iv = SnapshotKt.getLock();
        monitor-enter(lock$iv$iv$iv);
        r10.invoke(SnapshotKt.writableRecord($this$writable$iv, this, snapshot));     // Catch: Throwable -> L10
        monitor-exit(lock$iv$iv$iv);
        SnapshotKt.notifyWrite(snapshot, this);
        return;
    L10:
        th = move-exception;
        throw th;
    }

    private final TextMeasurer obtainTextMeasurer(MeasureInputs measureInputs) {
        TextMeasurer r0 = this.textMeasurer;
        if (r0 != null) goto L6;
        TextMeasurer it = new TextMeasurer(measureInputs.getFontFamilyResolver(), measureInputs.getDensity(), measureInputs.getLayoutDirection(), 1);
        this.textMeasurer = it;
        return it;
    L6:
        return r0;
    }

    private final TextLayoutResult computeLayout(TextFieldCharSequence visualText, NonMeasureInputs nonMeasureInputs, MeasureInputs measureInputs) {
        TextMeasurer textMeasurer = obtainTextMeasurer(measureInputs);
        if (nonMeasureInputs.isKeyboardTypePhone() == false) goto L10;
        TextStyle textStyle = nonMeasureInputs.getTextStyle();
        LocaleList it = textStyle.getLocaleList();
        if (it == null) goto L8;
        Locale currentLocale = it.get(0);
        if (currentLocale == null) goto L8;
    L9:
        int textDirection = TextFieldLayoutStateCache_androidKt.resolveTextDirectionForKeyboardTypePhone(currentLocale.getPlatformLocale());
        long r7 = 0;
        long r9 = 0;
        FontWeight r11 = null;
        FontStyle r12 = null;
        FontSynthesis r13 = null;
        FontFamily r14 = null;
        String r15 = null;
        long r16 = 0;
        BaselineShift r18 = null;
        TextGeometricTransform r19 = null;
        LocaleList r20 = null;
        long r21 = 0;
        TextDecoration r23 = null;
        Shadow r24 = null;
        DrawStyle r25 = null;
        int r26 = 0;
        long r28 = 0;
        TextIndent r30 = null;
        PlatformTextStyle r31 = null;
        LineHeightStyle r32 = null;
        int r33 = 0;
        int r34 = 0;
        TextMotion r35 = null;
        TextStyle textStyle2 = nonMeasureInputs.getTextStyle().merge(new TextStyle(r7, r9, r11, r12, r13, r14, r15, r16, r18, r19, r20, r21, r23, r24, r25, r26, textDirection, r28, r30, r31, r32, r33, r34, r35, 16711679, null));
        TextStyle finalTextStyle = textStyle2;
    L11:
        String r5 = visualText.toString();
        List<AnnotatedString.Range<AnnotatedString.Annotation>> r6 = visualText.getComposingAnnotations();
        if (r6 != null) goto L14;
        r6 = CollectionsKt.emptyList();
    L14:
        AnnotatedString r3 = new AnnotatedString(r5, r6);
        boolean r8 = nonMeasureInputs.getSoftWrap();
        if (nonMeasureInputs.getSingleLine() == false) goto L17;
        int r10 = 1;
    L19:
        return TextMeasurer.m6391measurexDpz5zY$default(textMeasurer, r3, finalTextStyle, 0, r8, r10, null, measureInputs.m1295getConstraintsmsEJaDk(), measureInputs.getLayoutDirection(), measureInputs.getDensity(), measureInputs.getFontFamilyResolver(), false, 1060, null);
    L17:
        r10 = Integer.MAX_VALUE;
    L8:
        currentLocale = Locale.Companion.getCurrent();
        goto L9
    L10:
        finalTextStyle = nonMeasureInputs.getTextStyle();
        goto L11
    }

    @Override // androidx.compose.runtime.snapshots.StateObject
    public StateRecord getFirstStateRecord() {
        return this.record;
    }

    @Override // androidx.compose.runtime.snapshots.StateObject
    public void prependStateRecord(StateRecord value) {
        Intrinsics.checkNotNull(value, "null cannot be cast to non-null type androidx.compose.foundation.text.input.internal.TextFieldLayoutStateCache.CacheRecord");
        this.record = (CacheRecord) value;
    }

    @Override // androidx.compose.runtime.snapshots.StateObject
    public StateRecord mergeRecords(StateRecord previous, StateRecord current, StateRecord applied) {
        return applied;
    }
}
