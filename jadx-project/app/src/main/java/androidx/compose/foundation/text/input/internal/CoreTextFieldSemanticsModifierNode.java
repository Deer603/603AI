package androidx.compose.foundation.text.input.internal;

import androidx.compose.foundation.text.LegacyTextFieldState;
import androidx.compose.foundation.text.TextFieldDelegate;
import androidx.compose.foundation.text.selection.TextFieldSelectionManager;
import androidx.compose.ui.autofill.ContentDataType;
import androidx.compose.ui.focus.FocusRequester;
import androidx.compose.ui.node.DelegatingNode;
import androidx.compose.ui.node.SemanticsModifierNode;
import androidx.compose.ui.node.SemanticsModifierNodeKt;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.TextRangeKt;
import androidx.compose.ui.text.input.CommitTextCommand;
import androidx.compose.ui.text.input.DeleteAllCommand;
import androidx.compose.ui.text.input.EditCommand;
import androidx.compose.ui.text.input.ImeOptions;
import androidx.compose.ui.text.input.OffsetMapping;
import androidx.compose.ui.text.input.TextFieldValue;
import androidx.compose.ui.text.input.TransformedText;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: CoreTextFieldSemanticsModifier.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b'\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002BU\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0012\u0012\u0006\u0010\u0013\u001a\u00020\u0014¢\u0006\u0002\u0010\u0015J(\u0010;\u001a\u00020<2\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010=\u001a\u00020>2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nH\u0002JV\u0010?\u001a\u00020<2\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014J\f\u0010@\u001a\u00020<*\u00020AH\u0016R\u001a\u0010\u000b\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u001a\u0010\u0013\u001a\u00020\u0014X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u001a\u0010\u0011\u001a\u00020\u0012X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\u001a\u0010\f\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\u0017\"\u0004\b\"\u0010\u0019R\u001a\u0010\u000f\u001a\u00020\u0010X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R\u001a\u0010\r\u001a\u00020\u000eX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R\u001a\u0010\t\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b+\u0010\u0017\"\u0004\b,\u0010\u0019R\u0014\u0010-\u001a\u00020\n8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b.\u0010\u0017R\u001a\u0010\u0007\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b/\u00100\"\u0004\b1\u00102R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b3\u00104\"\u0004\b5\u00106R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b7\u00108\"\u0004\b9\u0010:¨\u0006B"}, d2 = {"Landroidx/compose/foundation/text/input/internal/CoreTextFieldSemanticsModifierNode;", "Landroidx/compose/ui/node/DelegatingNode;", "Landroidx/compose/ui/node/SemanticsModifierNode;", "transformedText", "Landroidx/compose/ui/text/input/TransformedText;", "value", "Landroidx/compose/ui/text/input/TextFieldValue;", "state", "Landroidx/compose/foundation/text/LegacyTextFieldState;", "readOnly", "", "enabled", "isPassword", "offsetMapping", "Landroidx/compose/ui/text/input/OffsetMapping;", "manager", "Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;", "imeOptions", "Landroidx/compose/ui/text/input/ImeOptions;", "focusRequester", "Landroidx/compose/ui/focus/FocusRequester;", "(Landroidx/compose/ui/text/input/TransformedText;Landroidx/compose/ui/text/input/TextFieldValue;Landroidx/compose/foundation/text/LegacyTextFieldState;ZZZLandroidx/compose/ui/text/input/OffsetMapping;Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;Landroidx/compose/ui/text/input/ImeOptions;Landroidx/compose/ui/focus/FocusRequester;)V", "getEnabled", "()Z", "setEnabled", "(Z)V", "getFocusRequester", "()Landroidx/compose/ui/focus/FocusRequester;", "setFocusRequester", "(Landroidx/compose/ui/focus/FocusRequester;)V", "getImeOptions", "()Landroidx/compose/ui/text/input/ImeOptions;", "setImeOptions", "(Landroidx/compose/ui/text/input/ImeOptions;)V", "setPassword", "getManager", "()Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;", "setManager", "(Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;)V", "getOffsetMapping", "()Landroidx/compose/ui/text/input/OffsetMapping;", "setOffsetMapping", "(Landroidx/compose/ui/text/input/OffsetMapping;)V", "getReadOnly", "setReadOnly", "shouldMergeDescendantSemantics", "getShouldMergeDescendantSemantics", "getState", "()Landroidx/compose/foundation/text/LegacyTextFieldState;", "setState", "(Landroidx/compose/foundation/text/LegacyTextFieldState;)V", "getTransformedText", "()Landroidx/compose/ui/text/input/TransformedText;", "setTransformedText", "(Landroidx/compose/ui/text/input/TransformedText;)V", "getValue", "()Landroidx/compose/ui/text/input/TextFieldValue;", "setValue", "(Landroidx/compose/ui/text/input/TextFieldValue;)V", "handleTextUpdateFromSemantics", "", "text", "", "updateNodeSemantics", "applySemantics", "Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class CoreTextFieldSemanticsModifierNode extends DelegatingNode implements SemanticsModifierNode {
    public static final int $stable = 0;
    private boolean enabled;
    private FocusRequester focusRequester;
    private ImeOptions imeOptions;
    private boolean isPassword;
    private TextFieldSelectionManager manager;
    private OffsetMapping offsetMapping;
    private boolean readOnly;
    private LegacyTextFieldState state;
    private TransformedText transformedText;
    private TextFieldValue value;

    static {
        $stable = 8;
    }

    public static final /* synthetic */ void access$handleTextUpdateFromSemantics(CoreTextFieldSemanticsModifierNode $this, LegacyTextFieldState state, String text, boolean readOnly, boolean enabled) {
        $this.handleTextUpdateFromSemantics(state, text, readOnly, enabled);
    }

    public final TransformedText getTransformedText() {
        return this.transformedText;
    }

    public final void setTransformedText(TransformedText r1) {
        this.transformedText = r1;
    }

    public final TextFieldValue getValue() {
        return this.value;
    }

    public final void setValue(TextFieldValue r1) {
        this.value = r1;
    }

    public final LegacyTextFieldState getState() {
        return this.state;
    }

    public final void setState(LegacyTextFieldState r1) {
        this.state = r1;
    }

    public final boolean getReadOnly() {
        return this.readOnly;
    }

    public final void setReadOnly(boolean r1) {
        this.readOnly = r1;
    }

    public final boolean getEnabled() {
        return this.enabled;
    }

    public final void setEnabled(boolean r1) {
        this.enabled = r1;
    }

    public final boolean isPassword() {
        return this.isPassword;
    }

    public final void setPassword(boolean r1) {
        this.isPassword = r1;
    }

    public final OffsetMapping getOffsetMapping() {
        return this.offsetMapping;
    }

    public final void setOffsetMapping(OffsetMapping r1) {
        this.offsetMapping = r1;
    }

    public final TextFieldSelectionManager getManager() {
        return this.manager;
    }

    public final void setManager(TextFieldSelectionManager r1) {
        this.manager = r1;
    }

    public final ImeOptions getImeOptions() {
        return this.imeOptions;
    }

    public final void setImeOptions(ImeOptions r1) {
        this.imeOptions = r1;
    }

    public final FocusRequester getFocusRequester() {
        return this.focusRequester;
    }

    public final void setFocusRequester(FocusRequester r1) {
        this.focusRequester = r1;
    }

    public CoreTextFieldSemanticsModifierNode(TransformedText transformedText, TextFieldValue value, LegacyTextFieldState state, boolean readOnly, boolean enabled, boolean isPassword, OffsetMapping offsetMapping, TextFieldSelectionManager manager, ImeOptions imeOptions, FocusRequester focusRequester) {
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
        this.manager.setRequestAutofillAction$foundation_release(new AnonymousClass1(this));
    }

    @Override // androidx.compose.ui.node.SemanticsModifierNode
    public boolean getShouldMergeDescendantSemantics() {
        return true;
    }

    @Override // androidx.compose.ui.node.SemanticsModifierNode
    public void applySemantics(final SemanticsPropertyReceiver $this$applySemantics) {
        SemanticsPropertiesKt.setInputText($this$applySemantics, this.value.getAnnotatedString());
        SemanticsPropertiesKt.setEditableText($this$applySemantics, this.transformedText.getText());
        SemanticsPropertiesKt.m6201setTextSelectionRangeFDrldGo($this$applySemantics, this.value.m6665getSelectiond9O1mEE());
        SemanticsPropertiesKt.setContentDataType($this$applySemantics, ContentDataType.Companion.getText());
        SemanticsPropertiesKt.onAutofillText$default($this$applySemantics, null, new C03591(this), 1, null);
        if (this.enabled == true) goto L6;
        SemanticsPropertiesKt.disabled($this$applySemantics);
    L6:
        if (this.isPassword == false) goto L9;
        SemanticsPropertiesKt.password($this$applySemantics);
    L9:
        if (this.enabled == true) goto L11;
    L13:
        boolean editable = false;
    L14:
        SemanticsPropertiesKt.setEditable($this$applySemantics, editable);
        SemanticsPropertiesKt.getTextLayoutResult$default($this$applySemantics, null, new AnonymousClass2(this), 1, null);
        if (editable == false) goto L17;
        SemanticsPropertiesKt.setText$default($this$applySemantics, null, new AnonymousClass3(this), 1, null);
        SemanticsPropertiesKt.insertTextAtCursor$default($this$applySemantics, null, new AnonymousClass4(this, $this$applySemantics), 1, null);
    L17:
        SemanticsPropertiesKt.setSelection$default($this$applySemantics, null, new AnonymousClass5(this), 1, null);
        SemanticsPropertiesKt.m6197onImeAction9UiTYpY$default($this$applySemantics, this.imeOptions.m6612getImeActioneUduSuo(), null, new AnonymousClass6(this), 2, null);
        SemanticsPropertiesKt.onClick$default($this$applySemantics, null, new AnonymousClass7(this), 1, null);
        SemanticsPropertiesKt.onLongClick$default($this$applySemantics, null, new AnonymousClass8(this), 1, null);
        if (TextRange.m6411getCollapsedimpl(this.value.m6665getSelectiond9O1mEE()) == true) goto L27;
        if (this.isPassword == true) goto L27;
        SemanticsPropertiesKt.copyText$default($this$applySemantics, null, new AnonymousClass9(this), 1, null);
        if (this.enabled == false) goto L27;
        if (this.readOnly == true) goto L27;
        SemanticsPropertiesKt.cutText$default($this$applySemantics, null, new AnonymousClass10(this), 1, null);
    L27:
        if (this.enabled == true) goto L29;
        return;
    L29:
        if (this.readOnly == true) goto L33;
        SemanticsPropertiesKt.pasteText$default($this$applySemantics, null, new AnonymousClass11(this), 1, null);
        return;
    L33:
        return;
    L11:
        if (this.readOnly == true) goto L13;
        editable = true;
        goto L14
    }

    public final void updateNodeSemantics(TransformedText transformedText, TextFieldValue value, LegacyTextFieldState state, boolean readOnly, boolean enabled, boolean isPassword, OffsetMapping offsetMapping, TextFieldSelectionManager manager, ImeOptions imeOptions, FocusRequester focusRequester) {
        boolean editable = true;
        if (this.enabled == true) goto L5;
    L7:
        boolean previousEditable = false;
    L8:
        boolean previousEnabled = this.enabled;
        boolean previousIsPassword = this.isPassword;
        ImeOptions previousImeOptions = this.imeOptions;
        TextFieldSelectionManager previousManager = this.manager;
        if (enabled == false) goto L12;
        if (readOnly == true) goto L12;
    L13:
        this.transformedText = transformedText;
        this.value = value;
        this.state = state;
        this.readOnly = readOnly;
        this.enabled = enabled;
        this.offsetMapping = offsetMapping;
        this.manager = manager;
        this.imeOptions = imeOptions;
        this.focusRequester = focusRequester;
        if (enabled != previousEnabled) goto L26;
        if (editable != previousEditable) goto L26;
        if (Intrinsics.areEqual(imeOptions, previousImeOptions) == false) goto L26;
        if (isPassword != previousIsPassword) goto L26;
        if (TextRange.m6411getCollapsedimpl(value.m6665getSelectiond9O1mEE()) == false) goto L26;
    L28:
        if (Intrinsics.areEqual(manager, previousManager) == true) goto L31;
        manager.setRequestAutofillAction$foundation_release(new C03601(this));
        return;
    L31:
        return;
    L26:
        SemanticsModifierNodeKt.invalidateSemantics(this);
    L12:
        editable = false;
        goto L13
    L5:
        if (this.readOnly == true) goto L7;
        previousEditable = true;
        goto L8
    }

    private final void handleTextUpdateFromSemantics(LegacyTextFieldState state, String text, boolean readOnly, boolean enabled) {
        if (readOnly == true) goto L14;
        if (enabled == false) goto L16;
        androidx.compose.ui.text.input.TextInputSession session = state.getInputSession();
        if (session == null) goto L8;
        TextFieldDelegate.Companion.onEditCommand$foundation_release(CollectionsKt.listOf(new EditCommand[]{new DeleteAllCommand(), new CommitTextCommand(text, 1)}), state.getProcessor(), state.getOnValueChange(), session);
        Unit r0 = Unit.INSTANCE;
    L9:
        if (r0 != null) goto L12;
        state.getOnValueChange().invoke(new TextFieldValue(text, TextRangeKt.TextRange(text.length()), null, 4, null));
        return;
    L12:
        return;
    L8:
        r0 = null;
        goto L9
    L16:
        return;
    }
}
