package androidx.compose.foundation.text.input.internal;

import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.text.KeyboardOptions;
import androidx.compose.foundation.text.input.InputTransformation;
import androidx.compose.foundation.text.input.KeyboardActionHandler;
import androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.MutableSharedFlow;

/* JADX INFO: compiled from: TextFieldDecoratorModifier.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0011\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0080\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001Bq\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011\u0012\u0006\u0010\u0012\u001a\u00020\f\u0012\u0006\u0010\u0013\u001a\u00020\u0014\u0012\u0006\u0010\u0015\u001a\u00020\f\u0012\u000e\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u0017¢\u0006\u0002\u0010\u0019J\t\u0010\u001a\u001a\u00020\u0004HÂ\u0003J\t\u0010\u001b\u001a\u00020\u0014HÂ\u0003J\t\u0010\u001c\u001a\u00020\fHÂ\u0003J\u0011\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u0017HÂ\u0003J\t\u0010\u001e\u001a\u00020\u0006HÂ\u0003J\t\u0010\u001f\u001a\u00020\bHÂ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\nHÂ\u0003J\t\u0010!\u001a\u00020\fHÂ\u0003J\t\u0010\"\u001a\u00020\fHÂ\u0003J\t\u0010#\u001a\u00020\u000fHÂ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\u0011HÂ\u0003J\t\u0010%\u001a\u00020\fHÂ\u0003J\u008d\u0001\u0010&\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00112\b\b\u0002\u0010\u0012\u001a\u00020\f2\b\b\u0002\u0010\u0013\u001a\u00020\u00142\b\b\u0002\u0010\u0015\u001a\u00020\f2\u0010\b\u0002\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u0017HÆ\u0001J\b\u0010'\u001a\u00020\u0002H\u0016J\u0013\u0010(\u001a\u00020\f2\b\u0010)\u001a\u0004\u0018\u00010*HÖ\u0003J\t\u0010+\u001a\u00020,HÖ\u0001J\t\u0010-\u001a\u00020.HÖ\u0001J\u0010\u0010/\u001a\u00020\u00182\u0006\u00100\u001a\u00020\u0002H\u0016J\f\u00101\u001a\u00020\u0018*\u000202H\u0016R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u0017X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u00063"}, d2 = {"Landroidx/compose/foundation/text/input/internal/TextFieldDecoratorModifier;", "Landroidx/compose/ui/node/ModifierNodeElement;", "Landroidx/compose/foundation/text/input/internal/TextFieldDecoratorModifierNode;", "textFieldState", "Landroidx/compose/foundation/text/input/internal/TransformedTextFieldState;", "textLayoutState", "Landroidx/compose/foundation/text/input/internal/TextLayoutState;", "textFieldSelectionState", "Landroidx/compose/foundation/text/input/internal/selection/TextFieldSelectionState;", "filter", "Landroidx/compose/foundation/text/input/InputTransformation;", "enabled", "", "readOnly", "keyboardOptions", "Landroidx/compose/foundation/text/KeyboardOptions;", "keyboardActionHandler", "Landroidx/compose/foundation/text/input/KeyboardActionHandler;", "singleLine", "interactionSource", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "isPassword", "stylusHandwritingTrigger", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "", "(Landroidx/compose/foundation/text/input/internal/TransformedTextFieldState;Landroidx/compose/foundation/text/input/internal/TextLayoutState;Landroidx/compose/foundation/text/input/internal/selection/TextFieldSelectionState;Landroidx/compose/foundation/text/input/InputTransformation;ZZLandroidx/compose/foundation/text/KeyboardOptions;Landroidx/compose/foundation/text/input/KeyboardActionHandler;ZLandroidx/compose/foundation/interaction/MutableInteractionSource;ZLkotlinx/coroutines/flow/MutableSharedFlow;)V", "component1", "component10", "component11", "component12", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "create", "equals", "other", "", "hashCode", "", "toString", "", "update", "node", "inspectableProperties", "Landroidx/compose/ui/platform/InspectorInfo;", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class TextFieldDecoratorModifier extends ModifierNodeElement<TextFieldDecoratorModifierNode> {
    public static final int $stable = 0;
    private final boolean enabled;
    private final InputTransformation filter;
    private final MutableInteractionSource interactionSource;
    private final boolean isPassword;
    private final KeyboardActionHandler keyboardActionHandler;
    private final KeyboardOptions keyboardOptions;
    private final boolean readOnly;
    private final boolean singleLine;
    private final MutableSharedFlow<Unit> stylusHandwritingTrigger;
    private final TextFieldSelectionState textFieldSelectionState;
    private final TransformedTextFieldState textFieldState;
    private final TextLayoutState textLayoutState;

    static {
    }

    private final TransformedTextFieldState component1() {
        return this.textFieldState;
    }

    private final MutableInteractionSource component10() {
        return this.interactionSource;
    }

    private final boolean component11() {
        return this.isPassword;
    }

    private final MutableSharedFlow<Unit> component12() {
        return this.stylusHandwritingTrigger;
    }

    private final TextLayoutState component2() {
        return this.textLayoutState;
    }

    private final TextFieldSelectionState component3() {
        return this.textFieldSelectionState;
    }

    private final InputTransformation component4() {
        return this.filter;
    }

    private final boolean component5() {
        return this.enabled;
    }

    private final boolean component6() {
        return this.readOnly;
    }

    private final KeyboardOptions component7() {
        return this.keyboardOptions;
    }

    private final KeyboardActionHandler component8() {
        return this.keyboardActionHandler;
    }

    private final boolean component9() {
        return this.singleLine;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ TextFieldDecoratorModifier copy$default(TextFieldDecoratorModifier r0, TransformedTextFieldState r1, TextLayoutState r2, TextFieldSelectionState r3, InputTransformation r4, boolean r5, boolean r6, KeyboardOptions r7, KeyboardActionHandler r8, boolean r9, MutableInteractionSource r10, boolean r11, MutableSharedFlow r12, int r13, Object r14) {
        if ((r13 & 1) == 0) goto L6;
        r1 = r0.textFieldState;
    L6:
        if ((r13 & 2) == 0) goto L9;
        r2 = r0.textLayoutState;
    L9:
        if ((r13 & 4) == 0) goto L12;
        r3 = r0.textFieldSelectionState;
    L12:
        if ((r13 & 8) == 0) goto L15;
        r4 = r0.filter;
    L15:
        if ((r13 & 16) == 0) goto L18;
        r5 = r0.enabled;
    L18:
        if ((r13 & 32) == 0) goto L21;
        r6 = r0.readOnly;
    L21:
        if ((r13 & 64) == 0) goto L24;
        r7 = r0.keyboardOptions;
    L24:
        if ((r13 & 128) == 0) goto L27;
        r8 = r0.keyboardActionHandler;
    L27:
        if ((r13 & 256) == 0) goto L30;
        r9 = r0.singleLine;
    L30:
        if ((r13 & 512) == 0) goto L33;
        r10 = r0.interactionSource;
    L33:
        if ((r13 & 1024) == 0) goto L36;
        r11 = r0.isPassword;
    L36:
        if ((r13 & 2048) == 0) goto L38;
        r12 = r0.stylusHandwritingTrigger;
    L38:
        boolean r15 = r11;
        MutableSharedFlow r16 = r12;
        boolean r17 = r9;
        MutableInteractionSource r18 = r10;
        KeyboardOptions r19 = r7;
        KeyboardActionHandler r110 = r8;
        boolean r20 = r5;
        boolean r21 = r6;
        TextFieldSelectionState r22 = r3;
        InputTransformation r23 = r4;
        return r0.copy(r1, r2, r22, r23, r20, r21, r19, r110, r17, r18, r15, r16);
    }

    public final TextFieldDecoratorModifier copy(TransformedTextFieldState r14, TextLayoutState r15, TextFieldSelectionState r16, InputTransformation r17, boolean r18, boolean r19, KeyboardOptions r20, KeyboardActionHandler r21, boolean r22, MutableInteractionSource r23, boolean r24, MutableSharedFlow<Unit> r25) {
        return new TextFieldDecoratorModifier(r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public boolean equals(Object r6) {
        if (this != r6) goto L6;
        return true;
    L6:
        if ((r6 instanceof TextFieldDecoratorModifier) == true) goto L8;
        return false;
    L8:
        TextFieldDecoratorModifier r1 = (TextFieldDecoratorModifier) r6;
        if (Intrinsics.areEqual(this.textFieldState, r1.textFieldState) == true) goto L12;
        return false;
    L12:
        if (Intrinsics.areEqual(this.textLayoutState, r1.textLayoutState) == true) goto L15;
        return false;
    L15:
        if (Intrinsics.areEqual(this.textFieldSelectionState, r1.textFieldSelectionState) == true) goto L18;
        return false;
    L18:
        if (Intrinsics.areEqual(this.filter, r1.filter) == true) goto L21;
        return false;
    L21:
        if (this.enabled == r1.enabled) goto L24;
        return false;
    L24:
        if (this.readOnly == r1.readOnly) goto L27;
        return false;
    L27:
        if (Intrinsics.areEqual(this.keyboardOptions, r1.keyboardOptions) == true) goto L30;
        return false;
    L30:
        if (Intrinsics.areEqual(this.keyboardActionHandler, r1.keyboardActionHandler) == true) goto L33;
        return false;
    L33:
        if (this.singleLine == r1.singleLine) goto L36;
        return false;
    L36:
        if (Intrinsics.areEqual(this.interactionSource, r1.interactionSource) == true) goto L39;
        return false;
    L39:
        if (this.isPassword == r1.isPassword) goto L42;
        return false;
    L42:
        if (Intrinsics.areEqual(this.stylusHandwritingTrigger, r1.stylusHandwritingTrigger) == true) goto L44;
        return false;
    L44:
        return true;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public int hashCode() {
        int r1 = ((((this.textFieldState.hashCode() * 31) + this.textLayoutState.hashCode()) * 31) + this.textFieldSelectionState.hashCode()) * 31;
        int r3 = 0;
        if (this.filter != null) goto L5;
        int r2 = 0;
    L6:
        int r4 = (((((((r1 + r2) * 31) + Boolean.hashCode(this.enabled)) * 31) + Boolean.hashCode(this.readOnly)) * 31) + this.keyboardOptions.hashCode()) * 31;
        if (this.keyboardActionHandler != null) goto L9;
        int r5 = 0;
    L10:
        int r6 = (((((((r4 + r5) * 31) + Boolean.hashCode(this.singleLine)) * 31) + this.interactionSource.hashCode()) * 31) + Boolean.hashCode(this.isPassword)) * 31;
        if (this.stylusHandwritingTrigger == null) goto L15;
        r3 = this.stylusHandwritingTrigger.hashCode();
    L15:
        return r6 + r3;
    L9:
        r5 = this.keyboardActionHandler.hashCode();
        goto L10
    L5:
        r2 = this.filter.hashCode();
        goto L6
    }

    public String toString() {
        StringBuilder r0 = new StringBuilder();
        r0.append("TextFieldDecoratorModifier(textFieldState=").append(this.textFieldState).append(", textLayoutState=").append(this.textLayoutState).append(", textFieldSelectionState=").append(this.textFieldSelectionState).append(", filter=").append(this.filter).append(", enabled=").append(this.enabled).append(", readOnly=").append(this.readOnly).append(", keyboardOptions=").append(this.keyboardOptions).append(", keyboardActionHandler=").append(this.keyboardActionHandler).append(", singleLine=").append(this.singleLine).append(", interactionSource=").append(this.interactionSource).append(", isPassword=").append(this.isPassword).append(", stylusHandwritingTrigger=");
        r0.append(this.stylusHandwritingTrigger).append(')');
        return r0.toString();
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public /* bridge */ /* synthetic */ Modifier.Node create() {
        return create();
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public /* bridge */ /* synthetic */ void update(Modifier.Node node) {
        update((TextFieldDecoratorModifierNode) node);
    }

    public TextFieldDecoratorModifier(TransformedTextFieldState textFieldState, TextLayoutState textLayoutState, TextFieldSelectionState textFieldSelectionState, InputTransformation filter, boolean enabled, boolean readOnly, KeyboardOptions keyboardOptions, KeyboardActionHandler keyboardActionHandler, boolean singleLine, MutableInteractionSource interactionSource, boolean isPassword, MutableSharedFlow<Unit> r12) {
        this.textFieldState = textFieldState;
        this.textLayoutState = textLayoutState;
        this.textFieldSelectionState = textFieldSelectionState;
        this.filter = filter;
        this.enabled = enabled;
        this.readOnly = readOnly;
        this.keyboardOptions = keyboardOptions;
        this.keyboardActionHandler = keyboardActionHandler;
        this.singleLine = singleLine;
        this.interactionSource = interactionSource;
        this.isPassword = isPassword;
        this.stylusHandwritingTrigger = r12;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public TextFieldDecoratorModifierNode create() {
        return new TextFieldDecoratorModifierNode(this.textFieldState, this.textLayoutState, this.textFieldSelectionState, this.filter, this.enabled, this.readOnly, this.keyboardOptions, this.keyboardActionHandler, this.singleLine, this.interactionSource, this.isPassword, this.stylusHandwritingTrigger);
    }

    public void update(TextFieldDecoratorModifierNode node) {
        node.updateNode(this.textFieldState, this.textLayoutState, this.textFieldSelectionState, this.filter, this.enabled, this.readOnly, this.keyboardOptions, this.keyboardActionHandler, this.singleLine, this.interactionSource, this.isPassword, this.stylusHandwritingTrigger);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void inspectableProperties(InspectorInfo $this$inspectableProperties) {
    }
}
