package androidx.compose.foundation.text.input.internal;

import androidx.compose.foundation.text.LegacyTextFieldState;
import androidx.compose.foundation.text.selection.TextFieldSelectionManager;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.focus.FocusRequester;
import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
import androidx.compose.ui.text.input.ImeOptions;
import androidx.compose.ui.text.input.OffsetMapping;
import androidx.compose.ui.text.input.TextFieldValue;
import androidx.compose.ui.text.input.TransformedText;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: CoreTextFieldSemanticsModifier.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b \n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001BU\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0012\u0012\u0006\u0010\u0013\u001a\u00020\u0014¢\u0006\u0002\u0010\u0015J\t\u0010'\u001a\u00020\u0004HÆ\u0003J\t\u0010(\u001a\u00020\u0014HÆ\u0003J\t\u0010)\u001a\u00020\u0006HÆ\u0003J\t\u0010*\u001a\u00020\bHÆ\u0003J\t\u0010+\u001a\u00020\nHÆ\u0003J\t\u0010,\u001a\u00020\nHÆ\u0003J\t\u0010-\u001a\u00020\nHÆ\u0003J\t\u0010.\u001a\u00020\u000eHÆ\u0003J\t\u0010/\u001a\u00020\u0010HÆ\u0003J\t\u00100\u001a\u00020\u0012HÆ\u0003Jm\u00101\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00122\b\b\u0002\u0010\u0013\u001a\u00020\u0014HÆ\u0001J\b\u00102\u001a\u00020\u0002H\u0016J\u0013\u00103\u001a\u00020\n2\b\u00104\u001a\u0004\u0018\u000105HÖ\u0003J\t\u00106\u001a\u000207HÖ\u0001J\t\u00108\u001a\u000209HÖ\u0001J\u0010\u0010:\u001a\u00020;2\u0006\u0010<\u001a\u00020\u0002H\u0016J\f\u0010=\u001a\u00020;*\u00020>H\u0016R\u0011\u0010\u000b\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\u0013\u001a\u00020\u0014¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\u0011\u001a\u00020\u0012¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\f\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u0017R\u0011\u0010\u000f\u001a\u00020\u0010¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0011\u0010\r\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0017R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&¨\u0006?"}, d2 = {"Landroidx/compose/foundation/text/input/internal/CoreTextFieldSemanticsModifier;", "Landroidx/compose/ui/node/ModifierNodeElement;", "Landroidx/compose/foundation/text/input/internal/CoreTextFieldSemanticsModifierNode;", "transformedText", "Landroidx/compose/ui/text/input/TransformedText;", "value", "Landroidx/compose/ui/text/input/TextFieldValue;", "state", "Landroidx/compose/foundation/text/LegacyTextFieldState;", "readOnly", "", "enabled", "isPassword", "offsetMapping", "Landroidx/compose/ui/text/input/OffsetMapping;", "manager", "Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;", "imeOptions", "Landroidx/compose/ui/text/input/ImeOptions;", "focusRequester", "Landroidx/compose/ui/focus/FocusRequester;", "(Landroidx/compose/ui/text/input/TransformedText;Landroidx/compose/ui/text/input/TextFieldValue;Landroidx/compose/foundation/text/LegacyTextFieldState;ZZZLandroidx/compose/ui/text/input/OffsetMapping;Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;Landroidx/compose/ui/text/input/ImeOptions;Landroidx/compose/ui/focus/FocusRequester;)V", "getEnabled", "()Z", "getFocusRequester", "()Landroidx/compose/ui/focus/FocusRequester;", "getImeOptions", "()Landroidx/compose/ui/text/input/ImeOptions;", "getManager", "()Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;", "getOffsetMapping", "()Landroidx/compose/ui/text/input/OffsetMapping;", "getReadOnly", "getState", "()Landroidx/compose/foundation/text/LegacyTextFieldState;", "getTransformedText", "()Landroidx/compose/ui/text/input/TransformedText;", "getValue", "()Landroidx/compose/ui/text/input/TextFieldValue;", "component1", "component10", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "create", "equals", "other", "", "hashCode", "", "toString", "", "update", "", "node", "inspectableProperties", "Landroidx/compose/ui/platform/InspectorInfo;", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class CoreTextFieldSemanticsModifier extends ModifierNodeElement<CoreTextFieldSemanticsModifierNode> {
    public static final int $stable = 0;
    private final boolean enabled;
    private final FocusRequester focusRequester;
    private final ImeOptions imeOptions;
    private final boolean isPassword;
    private final TextFieldSelectionManager manager;
    private final OffsetMapping offsetMapping;
    private final boolean readOnly;
    private final LegacyTextFieldState state;
    private final TransformedText transformedText;
    private final TextFieldValue value;

    static {
    }

    public static /* synthetic */ CoreTextFieldSemanticsModifier copy$default(CoreTextFieldSemanticsModifier r0, TransformedText r1, TextFieldValue r2, LegacyTextFieldState r3, boolean r4, boolean r5, boolean r6, OffsetMapping r7, TextFieldSelectionManager r8, ImeOptions r9, FocusRequester r10, int r11, Object r12) {
        if ((r11 & 1) == 0) goto L6;
        r1 = r0.transformedText;
    L6:
        if ((r11 & 2) == 0) goto L9;
        r2 = r0.value;
    L9:
        if ((r11 & 4) == 0) goto L12;
        r3 = r0.state;
    L12:
        if ((r11 & 8) == 0) goto L15;
        r4 = r0.readOnly;
    L15:
        if ((r11 & 16) == 0) goto L18;
        r5 = r0.enabled;
    L18:
        if ((r11 & 32) == 0) goto L21;
        r6 = r0.isPassword;
    L21:
        if ((r11 & 64) == 0) goto L24;
        r7 = r0.offsetMapping;
    L24:
        if ((r11 & 128) == 0) goto L27;
        r8 = r0.manager;
    L27:
        if ((r11 & 256) == 0) goto L30;
        r9 = r0.imeOptions;
    L30:
        if ((r11 & 512) == 0) goto L32;
        r10 = r0.focusRequester;
    L32:
        ImeOptions r13 = r9;
        FocusRequester r14 = r10;
        OffsetMapping r15 = r7;
        TextFieldSelectionManager r16 = r8;
        boolean r17 = r5;
        boolean r18 = r6;
        LegacyTextFieldState r19 = r3;
        boolean r20 = r4;
        return r0.copy(r1, r2, r19, r20, r17, r18, r15, r16, r13, r14);
    }

    public final TransformedText component1() {
        return this.transformedText;
    }

    public final FocusRequester component10() {
        return this.focusRequester;
    }

    public final TextFieldValue component2() {
        return this.value;
    }

    public final LegacyTextFieldState component3() {
        return this.state;
    }

    public final boolean component4() {
        return this.readOnly;
    }

    public final boolean component5() {
        return this.enabled;
    }

    public final boolean component6() {
        return this.isPassword;
    }

    public final OffsetMapping component7() {
        return this.offsetMapping;
    }

    public final TextFieldSelectionManager component8() {
        return this.manager;
    }

    public final ImeOptions component9() {
        return this.imeOptions;
    }

    public final CoreTextFieldSemanticsModifier copy(TransformedText r12, TextFieldValue r13, LegacyTextFieldState r14, boolean r15, boolean r16, boolean r17, OffsetMapping r18, TextFieldSelectionManager r19, ImeOptions r20, FocusRequester r21) {
        return new CoreTextFieldSemanticsModifier(r12, r13, r14, r15, r16, r17, r18, r19, r20, r21);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public boolean equals(Object r6) {
        if (this != r6) goto L6;
        return true;
    L6:
        if ((r6 instanceof CoreTextFieldSemanticsModifier) == true) goto L8;
        return false;
    L8:
        CoreTextFieldSemanticsModifier r1 = (CoreTextFieldSemanticsModifier) r6;
        if (Intrinsics.areEqual(this.transformedText, r1.transformedText) == true) goto L12;
        return false;
    L12:
        if (Intrinsics.areEqual(this.value, r1.value) == true) goto L15;
        return false;
    L15:
        if (Intrinsics.areEqual(this.state, r1.state) == true) goto L18;
        return false;
    L18:
        if (this.readOnly == r1.readOnly) goto L21;
        return false;
    L21:
        if (this.enabled == r1.enabled) goto L24;
        return false;
    L24:
        if (this.isPassword == r1.isPassword) goto L27;
        return false;
    L27:
        if (Intrinsics.areEqual(this.offsetMapping, r1.offsetMapping) == true) goto L30;
        return false;
    L30:
        if (Intrinsics.areEqual(this.manager, r1.manager) == true) goto L33;
        return false;
    L33:
        if (Intrinsics.areEqual(this.imeOptions, r1.imeOptions) == true) goto L36;
        return false;
    L36:
        if (Intrinsics.areEqual(this.focusRequester, r1.focusRequester) == true) goto L38;
        return false;
    L38:
        return true;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public int hashCode() {
        return (((((((((((((((((this.transformedText.hashCode() * 31) + this.value.hashCode()) * 31) + this.state.hashCode()) * 31) + Boolean.hashCode(this.readOnly)) * 31) + Boolean.hashCode(this.enabled)) * 31) + Boolean.hashCode(this.isPassword)) * 31) + this.offsetMapping.hashCode()) * 31) + this.manager.hashCode()) * 31) + this.imeOptions.hashCode()) * 31) + this.focusRequester.hashCode();
    }

    public String toString() {
        return "CoreTextFieldSemanticsModifier(transformedText=" + this.transformedText + ", value=" + this.value + ", state=" + this.state + ", readOnly=" + this.readOnly + ", enabled=" + this.enabled + ", isPassword=" + this.isPassword + ", offsetMapping=" + this.offsetMapping + ", manager=" + this.manager + ", imeOptions=" + this.imeOptions + ", focusRequester=" + this.focusRequester + ')';
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public /* bridge */ /* synthetic */ Modifier.Node create() {
        return create();
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public /* bridge */ /* synthetic */ void update(Modifier.Node node) {
        update((CoreTextFieldSemanticsModifierNode) node);
    }

    public final TransformedText getTransformedText() {
        return this.transformedText;
    }

    public final TextFieldValue getValue() {
        return this.value;
    }

    public final LegacyTextFieldState getState() {
        return this.state;
    }

    public final boolean getReadOnly() {
        return this.readOnly;
    }

    public final boolean getEnabled() {
        return this.enabled;
    }

    public final boolean isPassword() {
        return this.isPassword;
    }

    public final OffsetMapping getOffsetMapping() {
        return this.offsetMapping;
    }

    public final TextFieldSelectionManager getManager() {
        return this.manager;
    }

    public final ImeOptions getImeOptions() {
        return this.imeOptions;
    }

    public final FocusRequester getFocusRequester() {
        return this.focusRequester;
    }

    public CoreTextFieldSemanticsModifier(TransformedText transformedText, TextFieldValue value, LegacyTextFieldState state, boolean readOnly, boolean enabled, boolean isPassword, OffsetMapping offsetMapping, TextFieldSelectionManager manager, ImeOptions imeOptions, FocusRequester focusRequester) {
        this.transformedText = transformedText;
        this.value = value;
        this.state = state;
        this.readOnly = readOnly;
        this.enabled = enabled;
        this.isPassword = isPassword;
        this.offsetMapping = offsetMapping;
        this.manager = manager;
        this.imeOptions = imeOptions;
        this.focusRequester = focusRequester;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public CoreTextFieldSemanticsModifierNode create() {
        return new CoreTextFieldSemanticsModifierNode(this.transformedText, this.value, this.state, this.readOnly, this.enabled, this.isPassword, this.offsetMapping, this.manager, this.imeOptions, this.focusRequester);
    }

    public void update(CoreTextFieldSemanticsModifierNode node) {
        node.updateNodeSemantics(this.transformedText, this.value, this.state, this.readOnly, this.enabled, this.isPassword, this.offsetMapping, this.manager, this.imeOptions, this.focusRequester);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void inspectableProperties(InspectorInfo $this$inspectableProperties) {
    }
}
