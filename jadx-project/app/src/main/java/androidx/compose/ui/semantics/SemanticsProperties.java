package androidx.compose.ui.semantics;

import androidx.compose.ui.autofill.ContentDataType;
import androidx.compose.ui.autofill.ContentType;
import androidx.compose.ui.state.ToggleableState;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.input.ImeAction;
import java.util.List;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: SemanticsProperties.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000 \u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u0007R\u0017\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u0007R\u001d\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u000f0\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0007R\u0017\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0007R\u0017\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00160\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0007R\u0017\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00190\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0007R\u0017\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00100\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0007R\u0017\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001e0\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0007R\u0017\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00160\u0004¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0007R\u0017\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00160\u0004¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u0007R\u0017\u0010$\u001a\b\u0012\u0004\u0012\u00020%0\u0004¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\u0007R\u0017\u0010'\u001a\b\u0012\u0004\u0012\u00020(0\u0004¢\u0006\b\n\u0000\u001a\u0004\b)\u0010\u0007R#\u0010*\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020,0+0\u0004¢\u0006\b\n\u0000\u001a\u0004\b-\u0010\u0007R\u0017\u0010.\u001a\b\u0012\u0004\u0012\u00020\u00190\u0004¢\u0006\b\n\u0000\u001a\u0004\b/\u0010\u0007R\"\u00100\u001a\b\u0012\u0004\u0012\u00020\u00160\u00048\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b1\u0010\u0002\u001a\u0004\b2\u0010\u0007R\"\u00103\u001a\b\u0012\u0004\u0012\u00020\u001e0\u00048\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b4\u0010\u0002\u001a\u0004\b5\u0010\u0007R\u0017\u00106\u001a\b\u0012\u0004\u0012\u00020\u00160\u0004¢\u0006\b\n\u0000\u001a\u0004\b7\u0010\u0007R\u0017\u00108\u001a\b\u0012\u0004\u0012\u00020\u001e0\u0004¢\u0006\b\n\u0000\u001a\u0004\b9\u0010\u0007R\u0017\u0010:\u001a\b\u0012\u0004\u0012\u00020\u00160\u0004¢\u0006\b\n\u0000\u001a\u0004\b;\u0010\u0007R\u0017\u0010<\u001a\b\u0012\u0004\u0012\u00020\u001e0\u0004¢\u0006\b\n\u0000\u001a\u0004\b=\u0010\u0007R\u0017\u0010>\u001a\b\u0012\u0004\u0012\u00020\u001e0\u0004¢\u0006\b\n\u0000\u001a\u0004\b?\u0010\u0007R\u0017\u0010@\u001a\b\u0012\u0004\u0012\u00020\u00160\u0004¢\u0006\b\n\u0000\u001a\u0004\bA\u0010\u0007R\u0017\u0010B\u001a\b\u0012\u0004\u0012\u00020C0\u0004¢\u0006\b\n\u0000\u001a\u0004\bD\u0010\u0007R\u0017\u0010E\u001a\b\u0012\u0004\u0012\u00020,0\u0004¢\u0006\b\n\u0000\u001a\u0004\bF\u0010\u0007R\u0017\u0010G\u001a\b\u0012\u0004\u0012\u00020\u00100\u0004¢\u0006\b\n\u0000\u001a\u0004\bH\u0010\u0007R\u0017\u0010I\u001a\b\u0012\u0004\u0012\u00020\u00160\u0004¢\u0006\b\n\u0000\u001a\u0004\bJ\u0010\u0007R\u0017\u0010K\u001a\b\u0012\u0004\u0012\u00020L0\u0004¢\u0006\b\n\u0000\u001a\u0004\bM\u0010\u0007R\u0017\u0010N\u001a\b\u0012\u0004\u0012\u00020O0\u0004¢\u0006\b\n\u0000\u001a\u0004\bP\u0010\u0007R\u0017\u0010Q\u001a\b\u0012\u0004\u0012\u00020\u00160\u0004¢\u0006\b\n\u0000\u001a\u0004\bR\u0010\u0007R\u0017\u0010S\u001a\b\u0012\u0004\u0012\u00020\u001e0\u0004¢\u0006\b\n\u0000\u001a\u0004\bT\u0010\u0007R\u0017\u0010U\u001a\b\u0012\u0004\u0012\u00020\u00100\u0004¢\u0006\b\n\u0000\u001a\u0004\bV\u0010\u0007R\u0017\u0010W\u001a\b\u0012\u0004\u0012\u00020\u00100\u0004¢\u0006\b\n\u0000\u001a\u0004\bX\u0010\u0007R\u001d\u0010Y\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00190\u000f0\u0004¢\u0006\b\n\u0000\u001a\u0004\bZ\u0010\u0007R\u0017\u0010[\u001a\b\u0012\u0004\u0012\u00020\\0\u0004¢\u0006\b\n\u0000\u001a\u0004\b]\u0010\u0007R\u0017\u0010^\u001a\b\u0012\u0004\u0012\u00020\u00190\u0004¢\u0006\b\n\u0000\u001a\u0004\b_\u0010\u0007R\u0017\u0010`\u001a\b\u0012\u0004\u0012\u00020a0\u0004¢\u0006\b\n\u0000\u001a\u0004\bb\u0010\u0007R\u0017\u0010c\u001a\b\u0012\u0004\u0012\u00020d0\u0004¢\u0006\b\n\u0000\u001a\u0004\be\u0010\u0007R\u0017\u0010f\u001a\b\u0012\u0004\u0012\u00020%0\u0004¢\u0006\b\n\u0000\u001a\u0004\bg\u0010\u0007¨\u0006h"}, d2 = {"Landroidx/compose/ui/semantics/SemanticsProperties;", "", "()V", "CollectionInfo", "Landroidx/compose/ui/semantics/SemanticsPropertyKey;", "Landroidx/compose/ui/semantics/CollectionInfo;", "getCollectionInfo", "()Landroidx/compose/ui/semantics/SemanticsPropertyKey;", "CollectionItemInfo", "Landroidx/compose/ui/semantics/CollectionItemInfo;", "getCollectionItemInfo", "ContentDataType", "Landroidx/compose/ui/autofill/ContentDataType;", "getContentDataType", "ContentDescription", "", "", "getContentDescription", "ContentType", "Landroidx/compose/ui/autofill/ContentType;", "getContentType", "Disabled", "", "getDisabled", "EditableText", "Landroidx/compose/ui/text/AnnotatedString;", "getEditableText", "Error", "getError", "Focused", "", "getFocused", "Heading", "getHeading", "HideFromAccessibility", "getHideFromAccessibility", "HorizontalScrollAxisRange", "Landroidx/compose/ui/semantics/ScrollAxisRange;", "getHorizontalScrollAxisRange", "ImeAction", "Landroidx/compose/ui/text/input/ImeAction;", "getImeAction", "IndexForKey", "Lkotlin/Function1;", "", "getIndexForKey", "InputText", "getInputText", "InvisibleToUser", "getInvisibleToUser$annotations", "getInvisibleToUser", "IsContainer", "getIsContainer$annotations", "getIsContainer", "IsDialog", "getIsDialog", "IsEditable", "getIsEditable", "IsPopup", "getIsPopup", "IsShowingTextSubstitution", "getIsShowingTextSubstitution", "IsTraversalGroup", "getIsTraversalGroup", "LinkTestMarker", "getLinkTestMarker", "LiveRegion", "Landroidx/compose/ui/semantics/LiveRegionMode;", "getLiveRegion", "MaxTextLength", "getMaxTextLength", "PaneTitle", "getPaneTitle", "Password", "getPassword", "ProgressBarRangeInfo", "Landroidx/compose/ui/semantics/ProgressBarRangeInfo;", "getProgressBarRangeInfo", "Role", "Landroidx/compose/ui/semantics/Role;", "getRole", "SelectableGroup", "getSelectableGroup", "Selected", "getSelected", "StateDescription", "getStateDescription", "TestTag", "getTestTag", "Text", "getText", "TextSelectionRange", "Landroidx/compose/ui/text/TextRange;", "getTextSelectionRange", "TextSubstitution", "getTextSubstitution", "ToggleableState", "Landroidx/compose/ui/state/ToggleableState;", "getToggleableState", "TraversalIndex", "", "getTraversalIndex", "VerticalScrollAxisRange", "getVerticalScrollAxisRange", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class SemanticsProperties {
    public static final int $stable = 0;
    private static final SemanticsPropertyKey<CollectionInfo> CollectionInfo = null;
    private static final SemanticsPropertyKey<CollectionItemInfo> CollectionItemInfo = null;
    private static final SemanticsPropertyKey<ContentDataType> ContentDataType = null;
    private static final SemanticsPropertyKey<List<String>> ContentDescription = null;
    private static final SemanticsPropertyKey<ContentType> ContentType = null;
    private static final SemanticsPropertyKey<Unit> Disabled = null;
    private static final SemanticsPropertyKey<AnnotatedString> EditableText = null;
    private static final SemanticsPropertyKey<String> Error = null;
    private static final SemanticsPropertyKey<Boolean> Focused = null;
    private static final SemanticsPropertyKey<Unit> Heading = null;
    private static final SemanticsPropertyKey<Unit> HideFromAccessibility = null;
    private static final SemanticsPropertyKey<ScrollAxisRange> HorizontalScrollAxisRange = null;
    public static final SemanticsProperties INSTANCE = null;
    private static final SemanticsPropertyKey<ImeAction> ImeAction = null;
    private static final SemanticsPropertyKey<Function1<Object, Integer>> IndexForKey = null;
    private static final SemanticsPropertyKey<AnnotatedString> InputText = null;
    private static final SemanticsPropertyKey<Unit> InvisibleToUser = null;
    private static final SemanticsPropertyKey<Boolean> IsContainer = null;
    private static final SemanticsPropertyKey<Unit> IsDialog = null;
    private static final SemanticsPropertyKey<Boolean> IsEditable = null;
    private static final SemanticsPropertyKey<Unit> IsPopup = null;
    private static final SemanticsPropertyKey<Boolean> IsShowingTextSubstitution = null;
    private static final SemanticsPropertyKey<Boolean> IsTraversalGroup = null;
    private static final SemanticsPropertyKey<Unit> LinkTestMarker = null;
    private static final SemanticsPropertyKey<LiveRegionMode> LiveRegion = null;
    private static final SemanticsPropertyKey<Integer> MaxTextLength = null;
    private static final SemanticsPropertyKey<String> PaneTitle = null;
    private static final SemanticsPropertyKey<Unit> Password = null;
    private static final SemanticsPropertyKey<ProgressBarRangeInfo> ProgressBarRangeInfo = null;
    private static final SemanticsPropertyKey<Role> Role = null;
    private static final SemanticsPropertyKey<Unit> SelectableGroup = null;
    private static final SemanticsPropertyKey<Boolean> Selected = null;
    private static final SemanticsPropertyKey<String> StateDescription = null;
    private static final SemanticsPropertyKey<String> TestTag = null;
    private static final SemanticsPropertyKey<List<AnnotatedString>> Text = null;
    private static final SemanticsPropertyKey<TextRange> TextSelectionRange = null;
    private static final SemanticsPropertyKey<AnnotatedString> TextSubstitution = null;
    private static final SemanticsPropertyKey<ToggleableState> ToggleableState = null;
    private static final SemanticsPropertyKey<Float> TraversalIndex = null;
    private static final SemanticsPropertyKey<ScrollAxisRange> VerticalScrollAxisRange = null;

    @Deprecated(message = "Use `hideFromAccessibility` instead.", replaceWith = @ReplaceWith(expression = "HideFromAccessibility", imports = {}))
    public static /* synthetic */ void getInvisibleToUser$annotations() {
    }

    @Deprecated(message = "Use `isTraversalGroup` instead.", replaceWith = @ReplaceWith(expression = "IsTraversalGroup", imports = {}))
    public static /* synthetic */ void getIsContainer$annotations() {
    }

    private SemanticsProperties() {
    }

    public final SemanticsPropertyKey<List<String>> getContentDescription() {
        return ContentDescription;
    }

    static {
        INSTANCE = new SemanticsProperties();
        ContentDescription = SemanticsPropertiesKt.AccessibilityKey("ContentDescription", SemanticsProperties$ContentDescription$1.INSTANCE);
        StateDescription = SemanticsPropertiesKt.AccessibilityKey("StateDescription");
        ProgressBarRangeInfo = SemanticsPropertiesKt.AccessibilityKey("ProgressBarRangeInfo");
        PaneTitle = SemanticsPropertiesKt.AccessibilityKey("PaneTitle", SemanticsProperties$PaneTitle$1.INSTANCE);
        SelectableGroup = SemanticsPropertiesKt.AccessibilityKey("SelectableGroup");
        CollectionInfo = SemanticsPropertiesKt.AccessibilityKey("CollectionInfo");
        CollectionItemInfo = SemanticsPropertiesKt.AccessibilityKey("CollectionItemInfo");
        Heading = SemanticsPropertiesKt.AccessibilityKey("Heading");
        Disabled = SemanticsPropertiesKt.AccessibilityKey("Disabled");
        LiveRegion = SemanticsPropertiesKt.AccessibilityKey("LiveRegion");
        Focused = SemanticsPropertiesKt.AccessibilityKey("Focused");
        IsContainer = SemanticsPropertiesKt.AccessibilityKey("IsContainer");
        IsTraversalGroup = new SemanticsPropertyKey("IsTraversalGroup", null, 2, null);
        InvisibleToUser = new SemanticsPropertyKey("InvisibleToUser", SemanticsProperties$InvisibleToUser$1.INSTANCE);
        HideFromAccessibility = new SemanticsPropertyKey("HideFromAccessibility", SemanticsProperties$HideFromAccessibility$1.INSTANCE);
        ContentType = new SemanticsPropertyKey("ContentType", SemanticsProperties$ContentType$1.INSTANCE);
        ContentDataType = new SemanticsPropertyKey("ContentDataType", SemanticsProperties$ContentDataType$1.INSTANCE);
        TraversalIndex = new SemanticsPropertyKey("TraversalIndex", SemanticsProperties$TraversalIndex$1.INSTANCE);
        HorizontalScrollAxisRange = SemanticsPropertiesKt.AccessibilityKey("HorizontalScrollAxisRange");
        VerticalScrollAxisRange = SemanticsPropertiesKt.AccessibilityKey("VerticalScrollAxisRange");
        IsPopup = SemanticsPropertiesKt.AccessibilityKey("IsPopup", SemanticsProperties$IsPopup$1.INSTANCE);
        IsDialog = SemanticsPropertiesKt.AccessibilityKey("IsDialog", SemanticsProperties$IsDialog$1.INSTANCE);
        Role = SemanticsPropertiesKt.AccessibilityKey("Role", SemanticsProperties$Role$1.INSTANCE);
        TestTag = new SemanticsPropertyKey("TestTag", false, SemanticsProperties$TestTag$1.INSTANCE);
        LinkTestMarker = new SemanticsPropertyKey("LinkTestMarker", false, SemanticsProperties$LinkTestMarker$1.INSTANCE);
        Text = SemanticsPropertiesKt.AccessibilityKey("Text", SemanticsProperties$Text$1.INSTANCE);
        TextSubstitution = new SemanticsPropertyKey("TextSubstitution", null, 2, null);
        IsShowingTextSubstitution = new SemanticsPropertyKey("IsShowingTextSubstitution", null, 2, null);
        InputText = SemanticsPropertiesKt.AccessibilityKey("InputText");
        EditableText = SemanticsPropertiesKt.AccessibilityKey("EditableText");
        TextSelectionRange = SemanticsPropertiesKt.AccessibilityKey("TextSelectionRange");
        ImeAction = SemanticsPropertiesKt.AccessibilityKey("ImeAction");
        Selected = SemanticsPropertiesKt.AccessibilityKey("Selected");
        ToggleableState = SemanticsPropertiesKt.AccessibilityKey("ToggleableState");
        Password = SemanticsPropertiesKt.AccessibilityKey("Password");
        Error = SemanticsPropertiesKt.AccessibilityKey("Error");
        IndexForKey = new SemanticsPropertyKey("IndexForKey", null, 2, null);
        IsEditable = new SemanticsPropertyKey("IsEditable", null, 2, null);
        MaxTextLength = new SemanticsPropertyKey("MaxTextLength", null, 2, null);
        $stable = 8;
    }

    public final SemanticsPropertyKey<String> getStateDescription() {
        return StateDescription;
    }

    public final SemanticsPropertyKey<ProgressBarRangeInfo> getProgressBarRangeInfo() {
        return ProgressBarRangeInfo;
    }

    public final SemanticsPropertyKey<String> getPaneTitle() {
        return PaneTitle;
    }

    public final SemanticsPropertyKey<Unit> getSelectableGroup() {
        return SelectableGroup;
    }

    public final SemanticsPropertyKey<CollectionInfo> getCollectionInfo() {
        return CollectionInfo;
    }

    public final SemanticsPropertyKey<CollectionItemInfo> getCollectionItemInfo() {
        return CollectionItemInfo;
    }

    public final SemanticsPropertyKey<Unit> getHeading() {
        return Heading;
    }

    public final SemanticsPropertyKey<Unit> getDisabled() {
        return Disabled;
    }

    public final SemanticsPropertyKey<LiveRegionMode> getLiveRegion() {
        return LiveRegion;
    }

    public final SemanticsPropertyKey<Boolean> getFocused() {
        return Focused;
    }

    public final SemanticsPropertyKey<Boolean> getIsContainer() {
        return IsContainer;
    }

    public final SemanticsPropertyKey<Boolean> getIsTraversalGroup() {
        return IsTraversalGroup;
    }

    public final SemanticsPropertyKey<Unit> getInvisibleToUser() {
        return InvisibleToUser;
    }

    public final SemanticsPropertyKey<Unit> getHideFromAccessibility() {
        return HideFromAccessibility;
    }

    public final SemanticsPropertyKey<ContentType> getContentType() {
        return ContentType;
    }

    public final SemanticsPropertyKey<ContentDataType> getContentDataType() {
        return ContentDataType;
    }

    public final SemanticsPropertyKey<Float> getTraversalIndex() {
        return TraversalIndex;
    }

    public final SemanticsPropertyKey<ScrollAxisRange> getHorizontalScrollAxisRange() {
        return HorizontalScrollAxisRange;
    }

    public final SemanticsPropertyKey<ScrollAxisRange> getVerticalScrollAxisRange() {
        return VerticalScrollAxisRange;
    }

    public final SemanticsPropertyKey<Unit> getIsPopup() {
        return IsPopup;
    }

    public final SemanticsPropertyKey<Unit> getIsDialog() {
        return IsDialog;
    }

    public final SemanticsPropertyKey<Role> getRole() {
        return Role;
    }

    public final SemanticsPropertyKey<String> getTestTag() {
        return TestTag;
    }

    public final SemanticsPropertyKey<Unit> getLinkTestMarker() {
        return LinkTestMarker;
    }

    public final SemanticsPropertyKey<List<AnnotatedString>> getText() {
        return Text;
    }

    public final SemanticsPropertyKey<AnnotatedString> getTextSubstitution() {
        return TextSubstitution;
    }

    public final SemanticsPropertyKey<Boolean> getIsShowingTextSubstitution() {
        return IsShowingTextSubstitution;
    }

    public final SemanticsPropertyKey<AnnotatedString> getInputText() {
        return InputText;
    }

    public final SemanticsPropertyKey<AnnotatedString> getEditableText() {
        return EditableText;
    }

    public final SemanticsPropertyKey<TextRange> getTextSelectionRange() {
        return TextSelectionRange;
    }

    public final SemanticsPropertyKey<ImeAction> getImeAction() {
        return ImeAction;
    }

    public final SemanticsPropertyKey<Boolean> getSelected() {
        return Selected;
    }

    public final SemanticsPropertyKey<ToggleableState> getToggleableState() {
        return ToggleableState;
    }

    public final SemanticsPropertyKey<Unit> getPassword() {
        return Password;
    }

    public final SemanticsPropertyKey<String> getError() {
        return Error;
    }

    public final SemanticsPropertyKey<Function1<Object, Integer>> getIndexForKey() {
        return IndexForKey;
    }

    public final SemanticsPropertyKey<Boolean> getIsEditable() {
        return IsEditable;
    }

    public final SemanticsPropertyKey<Integer> getMaxTextLength() {
        return MaxTextLength;
    }
}
