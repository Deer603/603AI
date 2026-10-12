package androidx.compose.ui.autofill;

import android.graphics.Rect;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewStructure;
import android.view.autofill.AutofillId;
import android.view.autofill.AutofillValue;
import androidx.collection.MutableIntSet;
import androidx.collection.MutableObjectList;
import androidx.collection.ObjectListKt;
import androidx.compose.ui.ComposeUiFlags;
import androidx.compose.ui.focus.FocusListener;
import androidx.compose.ui.focus.FocusTargetModifierNode;
import androidx.compose.ui.internal.InlineClassHelperKt;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.platform.coreshims.AutofillIdCompat;
import androidx.compose.ui.platform.coreshims.ViewCompatShims;
import androidx.compose.ui.semantics.AccessibilityAction;
import androidx.compose.ui.semantics.SemanticsActions;
import androidx.compose.ui.semantics.SemanticsConfiguration;
import androidx.compose.ui.semantics.SemanticsConfigurationKt;
import androidx.compose.ui.semantics.SemanticsInfo;
import androidx.compose.ui.semantics.SemanticsListener;
import androidx.compose.ui.semantics.SemanticsOwner;
import androidx.compose.ui.semantics.SemanticsProperties;
import androidx.compose.ui.spatial.RectManager;
import androidx.compose.ui.text.AnnotatedString;
import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: AndroidAutofillManager.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0088\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B-\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r¢\u0006\u0002\u0010\u000eJ\b\u0010\u001b\u001a\u00020\u001cH\u0016J\b\u0010\u001d\u001a\u00020\u001cH\u0016J\u0015\u0010\u001e\u001a\u00020\u001c2\u0006\u0010\u001f\u001a\u00020 H\u0000¢\u0006\u0002\b!J\r\u0010\"\u001a\u00020\u001cH\u0000¢\u0006\u0002\b#J\u001c\u0010$\u001a\u00020\u001c2\b\u0010%\u001a\u0004\u0018\u00010&2\b\u0010'\u001a\u0004\u0018\u00010&H\u0016J\u0015\u0010(\u001a\u00020\u001c2\u0006\u0010\u001f\u001a\u00020 H\u0000¢\u0006\u0002\b)J\u0015\u0010*\u001a\u00020\u001c2\u0006\u0010\u001f\u001a\u00020 H\u0000¢\u0006\u0002\b+J\u001d\u0010,\u001a\u00020\u001c2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010-\u001a\u00020.H\u0000¢\u0006\u0002\b/J\u001a\u00100\u001a\u00020\u001c2\u0006\u0010\u001f\u001a\u00020 2\b\u00101\u001a\u0004\u0018\u000102H\u0016J\u0014\u00103\u001a\u00020\u001c2\f\u00104\u001a\b\u0012\u0004\u0012\u00020605J\u000e\u00107\u001a\u00020\u001c2\u0006\u00108\u001a\u000209J\u0015\u0010:\u001a\u00020\u001c2\u0006\u0010\u001f\u001a\u00020 H\u0000¢\u0006\u0002\b;R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0018X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u001aX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006<"}, d2 = {"Landroidx/compose/ui/autofill/AndroidAutofillManager;", "Landroidx/compose/ui/autofill/AutofillManager;", "Landroidx/compose/ui/semantics/SemanticsListener;", "Landroidx/compose/ui/focus/FocusListener;", "platformAutofillManager", "Landroidx/compose/ui/autofill/PlatformAutofillManager;", "semanticsOwner", "Landroidx/compose/ui/semantics/SemanticsOwner;", "view", "Landroid/view/View;", "rectManager", "Landroidx/compose/ui/spatial/RectManager;", "packageName", "", "(Landroidx/compose/ui/autofill/PlatformAutofillManager;Landroidx/compose/ui/semantics/SemanticsOwner;Landroid/view/View;Landroidx/compose/ui/spatial/RectManager;Ljava/lang/String;)V", "currentlyDisplayedIDs", "Landroidx/collection/MutableIntSet;", "pendingAutofillCommit", "", "getPlatformAutofillManager", "()Landroidx/compose/ui/autofill/PlatformAutofillManager;", "setPlatformAutofillManager", "(Landroidx/compose/ui/autofill/PlatformAutofillManager;)V", "reusableRect", "Landroid/graphics/Rect;", "rootAutofillId", "Landroid/view/autofill/AutofillId;", "cancel", "", "commit", "onDetach", "semanticsInfo", "Landroidx/compose/ui/semantics/SemanticsInfo;", "onDetach$ui_release", "onEndApplyChanges", "onEndApplyChanges$ui_release", "onFocusChanged", "previous", "Landroidx/compose/ui/focus/FocusTargetModifierNode;", "current", "onLayoutNodeDeactivated", "onLayoutNodeDeactivated$ui_release", "onPostAttach", "onPostAttach$ui_release", "onPostLayoutNodeReused", "previousSemanticsId", "", "onPostLayoutNodeReused$ui_release", "onSemanticsChanged", "previousSemanticsConfiguration", "Landroidx/compose/ui/semantics/SemanticsConfiguration;", "performAutofill", "values", "Landroid/util/SparseArray;", "Landroid/view/autofill/AutofillValue;", "populateViewStructure", "rootViewStructure", "Landroid/view/ViewStructure;", "requestAutofill", "requestAutofill$ui_release", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class AndroidAutofillManager extends AutofillManager implements SemanticsListener, FocusListener {
    public static final int $stable = 0;
    private MutableIntSet currentlyDisplayedIDs;
    private final String packageName;
    private boolean pendingAutofillCommit;
    private PlatformAutofillManager platformAutofillManager;
    private final RectManager rectManager;
    private Rect reusableRect;
    private AutofillId rootAutofillId;
    private final SemanticsOwner semanticsOwner;
    private final View view;

    static {
        $stable = 8;
    }

    public static final /* synthetic */ Rect access$getReusableRect$p(AndroidAutofillManager $this) {
        return $this.reusableRect;
    }

    public static final /* synthetic */ View access$getView$p(AndroidAutofillManager $this) {
        return $this.view;
    }

    public final PlatformAutofillManager getPlatformAutofillManager() {
        return this.platformAutofillManager;
    }

    public final void setPlatformAutofillManager(PlatformAutofillManager r1) {
        this.platformAutofillManager = r1;
    }

    public AndroidAutofillManager(PlatformAutofillManager platformAutofillManager, SemanticsOwner semanticsOwner, View view, RectManager rectManager, String packageName) {
        this.platformAutofillManager = platformAutofillManager;
        this.semanticsOwner = semanticsOwner;
        this.view = view;
        this.rectManager = rectManager;
        this.packageName = packageName;
        this.reusableRect = new Rect();
        int r1 = 1;
        this.view.setImportantForAutofill(1);
        AutofillIdCompat r0 = ViewCompatShims.getAutofillId(this.view);
        DefaultConstructorMarker r2 = null;
        if (r0 == null) goto L5;
        AutofillId r3 = r0.toAutofillId();
    L7:
        if (r3 == null) goto L10;
        this.rootAutofillId = r3;
        this.currentlyDisplayedIDs = new MutableIntSet(0, r1, r2);
        return;
    L10:
        InlineClassHelperKt.throwIllegalStateExceptionForNullCheck("Required value was null.");
        throw new KotlinNothingValueException();
    L5:
        r3 = null;
        goto L7
    }

    @Override // androidx.compose.ui.autofill.AutofillManager
    public void commit() {
        this.platformAutofillManager.commit();
    }

    @Override // androidx.compose.ui.autofill.AutofillManager
    public void cancel() {
        this.platformAutofillManager.cancel();
    }

    @Override // androidx.compose.ui.focus.FocusListener
    public void onFocusChanged(FocusTargetModifierNode previous, FocusTargetModifierNode current) {
        boolean r0 = true;
        if (previous == null) goto L16;
        SemanticsInfo it = DelegatableNodeKt.requireSemanticsInfo(previous);
        if (it == null) goto L16;
        SemanticsConfiguration r4 = it.getSemanticsConfiguration();
        if (r4 != null) goto L9;
    L11:
        boolean r5 = false;
    L12:
        if (r5 == false) goto L16;
        this.platformAutofillManager.notifyViewExited(this.view, it.getSemanticsId());
        goto L16
    L9:
        if (AndroidAutofillManager_androidKt.access$isAutofillable(r4) != true) goto L11;
        r5 = true;
    L16:
        if (current == null) goto L29;
        SemanticsInfo it2 = DelegatableNodeKt.requireSemanticsInfo(current);
        if (it2 == null) goto L30;
        SemanticsConfiguration r6 = it2.getSemanticsConfiguration();
        if (r6 != null) goto L22;
    L24:
        r0 = false;
    L25:
        if (r0 == false) goto L32;
        final int semanticsId = it2.getSemanticsId();
        this.rectManager.getRects().withRect(semanticsId, new AndroidAutofillManager$onFocusChanged$2$1(this, semanticsId));
        return;
    L32:
        return;
    L22:
        if (AndroidAutofillManager_androidKt.access$isAutofillable(r6) != true) goto L24;
    L30:
        return;
    }

    @Override // androidx.compose.ui.semantics.SemanticsListener
    public void onSemanticsChanged(SemanticsInfo semanticsInfo, SemanticsConfiguration previousSemanticsConfiguration) {
        SemanticsConfiguration config = semanticsInfo.getSemanticsConfiguration();
        final int semanticsId = semanticsInfo.getSemanticsId();
        Boolean currFocus = null;
        if (previousSemanticsConfiguration == null) goto L7;
        AnnotatedString r4 = (AnnotatedString) SemanticsConfigurationKt.getOrNull(previousSemanticsConfiguration, SemanticsProperties.INSTANCE.getInputText());
        if (r4 == null) goto L7;
        String previousText = r4.getText();
    L8:
        if (config == null) goto L12;
        AnnotatedString r5 = (AnnotatedString) SemanticsConfigurationKt.getOrNull(config, SemanticsProperties.INSTANCE.getInputText());
        if (r5 == null) goto L12;
        String newText = r5.getText();
    L13:
        boolean currRelatedToAutoCommit = false;
        if (previousText == newText) goto L23;
        if (previousText != null) goto L17;
        this.platformAutofillManager.notifyViewVisibilityChanged(this.view, semanticsId, true);
        goto L23
    L17:
        if (newText != null) goto L19;
        this.platformAutofillManager.notifyViewVisibilityChanged(this.view, semanticsId, false);
        goto L23
    L19:
        ContentDataType contentDataType = (ContentDataType) SemanticsConfigurationKt.getOrNull(config, SemanticsProperties.INSTANCE.getContentDataType());
        if (Intrinsics.areEqual(contentDataType, ContentDataType.Companion.getText()) == false) goto L23;
        this.platformAutofillManager.notifyValueChanged(this.view, semanticsId, AutofillApi26Helper.INSTANCE.getAutofillTextValue(newText.toString()));
    L23:
        if (ComposeUiFlags.isTrackFocusEnabled == true) goto L43;
        if (previousSemanticsConfiguration == null) goto L26;
        Boolean previousFocus = (Boolean) SemanticsConfigurationKt.getOrNull(previousSemanticsConfiguration, SemanticsProperties.INSTANCE.getFocused());
    L27:
        if (config == null) goto L30;
        currFocus = (Boolean) SemanticsConfigurationKt.getOrNull(config, SemanticsProperties.INSTANCE.getFocused());
    L30:
        if (Intrinsics.areEqual(previousFocus, true) == true) goto L37;
        if (Intrinsics.areEqual(currFocus, true) == false) goto L37;
        if (AndroidAutofillManager_androidKt.access$isAutofillable(config) == false) goto L37;
        this.rectManager.getRects().withRect(semanticsId, new AnonymousClass1(this, semanticsId));
    L37:
        if (Intrinsics.areEqual(previousFocus, true) == false) goto L43;
        if (Intrinsics.areEqual(currFocus, true) == true) goto L43;
        if (AndroidAutofillManager_androidKt.access$isAutofillable(previousSemanticsConfiguration) == false) goto L43;
        this.platformAutofillManager.notifyViewExited(this.view, semanticsId);
        goto L43
    L26:
        previousFocus = null;
    L43:
        if (previousSemanticsConfiguration != null) goto L45;
    L47:
        boolean prevRelatedToAutoCommit = false;
    L48:
        if (config != null) goto L50;
    L52:
        if (prevRelatedToAutoCommit == currRelatedToAutoCommit) goto L58;
        MutableIntSet r7 = this.currentlyDisplayedIDs;
        if (currRelatedToAutoCommit == false) goto L56;
        r7.add(semanticsId);
        return;
    L56:
        r7.remove(semanticsId);
        return;
    L58:
        return;
    L50:
        if (AndroidAutofillManager_androidKt.access$isRelatedToAutoCommit(config) != true) goto L52;
        currRelatedToAutoCommit = true;
        goto L52
    L45:
        if (AndroidAutofillManager_androidKt.access$isRelatedToAutoCommit(previousSemanticsConfiguration) != true) goto L47;
        prevRelatedToAutoCommit = true;
    L12:
        newText = null;
    L7:
        previousText = null;
        goto L8
    }

    public final void populateViewStructure(ViewStructure rootViewStructure) {
        AutofillApi26Helper autofillApi = AutofillApi26Helper.INSTANCE;
        SemanticsInfo rootSemanticInfo = this.semanticsOwner.getRootInfo$ui_release();
        PopulateViewStructure_androidKt.populate(rootViewStructure, rootSemanticInfo, this.rootAutofillId, this.packageName, this.rectManager);
        MutableObjectList populateChildren = ObjectListKt.mutableObjectListOf(rootSemanticInfo, rootViewStructure);
    L4:
        if (populateChildren.isNotEmpty() == false) goto L26;
        MutableObjectList this_$iv = populateChildren;
        int r8 = 1;
        Object r5 = populateChildren.removeAt(this_$iv._size - 1);
        Intrinsics.checkNotNull(r5, "null cannot be cast to non-null type android.view.ViewStructure");
        ViewStructure parentStructure = (ViewStructure) r5;
        MutableObjectList this_$iv2 = populateChildren;
        Object r6 = populateChildren.removeAt(this_$iv2._size - 1);
        Intrinsics.checkNotNull(r6, "null cannot be cast to non-null type androidx.compose.ui.semantics.SemanticsInfo");
        SemanticsInfo parentInfo = (SemanticsInfo) r6;
        List<SemanticsInfo> r7 = parentInfo.getChildrenInfo();
        int index$iv = 0;
        int r11 = r7.size();
    L6:
        if (index$iv >= r11) goto L4;
        Object item$iv = r7.get(index$iv);
        SemanticsInfo childInfo = (SemanticsInfo) item$iv;
        if (childInfo.isDeactivated() == true) goto L24;
        if (childInfo.isAttached() == false) goto L24;
        if (childInfo.isPlaced() == false) goto L24;
        SemanticsConfiguration semanticsConfigurationChild = childInfo.getSemanticsConfiguration();
        int r16 = 0;
        if (semanticsConfigurationChild != null) goto L17;
    L19:
        if (r16 != 0) goto L21;
        populateChildren.add(childInfo);
        populateChildren.add(parentStructure);
        goto L24
    L21:
        int childIndex = autofillApi.addChildCount(parentStructure, r8);
        ViewStructure childStructure = autofillApi.newChild(parentStructure, childIndex);
        PopulateViewStructure_androidKt.populate(childStructure, childInfo, this.rootAutofillId, this.packageName, this.rectManager);
        populateChildren.add(childInfo);
        populateChildren.add(childStructure);
        goto L24
    L17:
        if (AndroidAutofillManager_androidKt.access$isRelatedToAutofill(semanticsConfigurationChild) != r8) goto L19;
        r16 = r8;
    L24:
        index$iv = index$iv + 1;
        autofillApi = autofillApi;
        rootSemanticInfo = rootSemanticInfo;
        r8 = 1;
        goto L6
    }

    public final void performAutofill(SparseArray<AutofillValue> r10) {
        int index = 0;
        int r1 = r10.size();
    L3:
        if (index >= r1) goto L26;
        int itemId = r10.keyAt(index);
        AutofillValue value = r10.get(itemId);
        if (AutofillApi26Helper.INSTANCE.isText(value) == false) goto L17;
        SemanticsInfo r4 = this.semanticsOwner.get$ui_release(itemId);
        if (r4 == null) goto L25;
        SemanticsConfiguration r5 = r4.getSemanticsConfiguration();
        if (r5 == null) goto L25;
        AccessibilityAction r6 = (AccessibilityAction) SemanticsConfigurationKt.getOrNull(r5, SemanticsActions.INSTANCE.getOnAutofillText());
        if (r6 == null) goto L25;
        Function1 r7 = (Function1) r6.getAction();
        if (r7 == null) goto L25;
        Boolean r8 = (Boolean) r7.invoke(new AnnotatedString(AutofillApi26Helper.INSTANCE.textValue(value).toString(), null, 2, null));
    L25:
        index = index + 1;
        goto L3
    L17:
        if (AutofillApi26Helper.INSTANCE.isDate(value) == false) goto L20;
        Log.w("ComposeAutofillManager", "Auto filling Date fields is not yet supported.");
        goto L25
    L20:
        if (AutofillApi26Helper.INSTANCE.isList(value) == false) goto L23;
        Log.w("ComposeAutofillManager", "Auto filling dropdown lists is not yet supported.");
        goto L25
    L23:
        if (AutofillApi26Helper.INSTANCE.isToggle(value) == false) goto L25;
        Log.w("ComposeAutofillManager", "Auto filling toggle fields are not yet supported.");
        goto L25
    }

    public final void requestAutofill$ui_release(final SemanticsInfo semanticsInfo) {
        this.rectManager.getRects().withRect(semanticsInfo.getSemanticsId(), new AndroidAutofillManager$requestAutofill$1(this, semanticsInfo));
    }

    public final void onPostAttach$ui_release(SemanticsInfo semanticsInfo) {
        SemanticsConfiguration r0 = semanticsInfo.getSemanticsConfiguration();
        boolean r1 = false;
        if (r0 != null) goto L5;
    L7:
        if (r1 == false) goto L10;
        this.currentlyDisplayedIDs.add(semanticsInfo.getSemanticsId());
        this.platformAutofillManager.notifyViewVisibilityChanged(this.view, semanticsInfo.getSemanticsId(), true);
        return;
    L10:
        return;
    L5:
        if (AndroidAutofillManager_androidKt.access$isRelatedToAutoCommit(r0) != true) goto L7;
        r1 = true;
        goto L7
    }

    public final void onPostLayoutNodeReused$ui_release(SemanticsInfo semanticsInfo, int previousSemanticsId) {
        boolean r1 = false;
        if (this.currentlyDisplayedIDs.remove(previousSemanticsId) == false) goto L5;
        this.platformAutofillManager.notifyViewVisibilityChanged(this.view, previousSemanticsId, false);
    L5:
        SemanticsConfiguration r0 = semanticsInfo.getSemanticsConfiguration();
        if (r0 != null) goto L8;
    L10:
        if (r1 == false) goto L13;
        this.currentlyDisplayedIDs.add(semanticsInfo.getSemanticsId());
        this.platformAutofillManager.notifyViewVisibilityChanged(this.view, semanticsInfo.getSemanticsId(), true);
        return;
    L13:
        return;
    L8:
        if (AndroidAutofillManager_androidKt.access$isRelatedToAutoCommit(r0) != true) goto L10;
        r1 = true;
        goto L10
    }

    public final void onLayoutNodeDeactivated$ui_release(SemanticsInfo semanticsInfo) {
        if (this.currentlyDisplayedIDs.remove(semanticsInfo.getSemanticsId()) == false) goto L6;
        this.platformAutofillManager.notifyViewVisibilityChanged(this.view, semanticsInfo.getSemanticsId(), false);
        return;
    }

    public final void onDetach$ui_release(SemanticsInfo semanticsInfo) {
        if (this.currentlyDisplayedIDs.remove(semanticsInfo.getSemanticsId()) == false) goto L6;
        this.platformAutofillManager.notifyViewVisibilityChanged(this.view, semanticsInfo.getSemanticsId(), false);
        return;
    }

    public final void onEndApplyChanges$ui_release() {
        if (this.currentlyDisplayedIDs.isEmpty() == false) goto L8;
        if (this.pendingAutofillCommit == false) goto L8;
        this.platformAutofillManager.commit();
        this.pendingAutofillCommit = false;
    L8:
        if (this.currentlyDisplayedIDs.isNotEmpty() == false) goto L11;
        this.pendingAutofillCommit = true;
        return;
    }
}
